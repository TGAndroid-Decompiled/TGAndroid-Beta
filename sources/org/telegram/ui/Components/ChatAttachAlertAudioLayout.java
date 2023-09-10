package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_document;
import org.telegram.tgnet.TLRPC$TL_documentAttributeAudio;
import org.telegram.tgnet.TLRPC$TL_documentAttributeFilename;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertAudioLayout;
import org.telegram.ui.Components.RecyclerListView;
public class ChatAttachAlertAudioLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private ArrayList<MediaController.AudioEntry> audioEntries;
    private View currentEmptyView;
    private float currentPanTranslationProgress;
    private AudioSelectDelegate delegate;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private FrameLayout frameLayout;
    private boolean ignoreLayout;
    private LinearLayoutManager layoutManager;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loadingAudio;
    private int maxSelectedFiles;
    private MessageObject playingAudio;
    private EmptyTextProgressView progressView;
    private SearchAdapter searchAdapter;
    private SearchField searchField;
    private LongSparseArray<MediaController.AudioEntry> selectedAudios;
    private ArrayList<MediaController.AudioEntry> selectedAudiosOrder;
    private boolean sendPressed;
    private View shadow;
    private AnimatorSet shadowAnimation;

    public interface AudioSelectDelegate {
        void didSelectAudio(ArrayList<MessageObject> arrayList, CharSequence charSequence, boolean z, int i);
    }

    public static boolean lambda$new$0(View view, MotionEvent motionEvent) {
        return true;
    }

    public ChatAttachAlertAudioLayout(ChatAttachAlert chatAttachAlert, Context context, Theme.ResourcesProvider resourcesProvider) {
        super(chatAttachAlert, context, resourcesProvider);
        this.maxSelectedFiles = -1;
        this.audioEntries = new ArrayList<>();
        this.selectedAudiosOrder = new ArrayList<>();
        this.selectedAudios = new LongSparseArray<>();
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        loadAudio();
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(Theme.key_dialogBackground));
        SearchField searchField = new SearchField(context, false, resourcesProvider) {
            @Override
            public void onTextChange(String str) {
                if (str.length() == 0 && ChatAttachAlertAudioLayout.this.listView.getAdapter() != ChatAttachAlertAudioLayout.this.listAdapter) {
                    ChatAttachAlertAudioLayout.this.listView.setAdapter(ChatAttachAlertAudioLayout.this.listAdapter);
                    ChatAttachAlertAudioLayout.this.listAdapter.notifyDataSetChanged();
                }
                if (ChatAttachAlertAudioLayout.this.searchAdapter != null) {
                    ChatAttachAlertAudioLayout.this.searchAdapter.search(str);
                }
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                ChatAttachAlertAudioLayout.this.parentAlert.makeFocusable(getSearchEditText(), true);
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void processTouchEvent(MotionEvent motionEvent) {
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                obtain.setLocation(obtain.getRawX(), (obtain.getRawY() - ChatAttachAlertAudioLayout.this.parentAlert.getSheetContainer().getTranslationY()) - AndroidUtilities.dp(58.0f));
                ChatAttachAlertAudioLayout.this.listView.dispatchTouchEvent(obtain);
                obtain.recycle();
            }

            @Override
            protected void onFieldTouchUp(EditTextBoldCursor editTextBoldCursor) {
                ChatAttachAlertAudioLayout.this.parentAlert.makeFocusable(editTextBoldCursor, true);
            }
        };
        this.searchField = searchField;
        searchField.setHint(LocaleController.getString("SearchMusic", R.string.SearchMusic));
        this.frameLayout.addView(this.searchField, LayoutHelper.createFrame(-1, -1, 51));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null, resourcesProvider);
        this.progressView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        addView(this.progressView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(17);
        this.emptyView.setVisibility(8);
        addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$new$0;
                lambda$new$0 = ChatAttachAlertAudioLayout.lambda$new$0(view, motionEvent);
                return lambda$new$0;
            }
        });
        ImageView imageView = new ImageView(context);
        this.emptyImageView = imageView;
        imageView.setImageResource(R.drawable.music_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), PorterDuff.Mode.MULTIPLY));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.emptyTitleTextView = textView;
        int i = Theme.key_dialogEmptyText;
        textView.setTextColor(getThemedColor(i));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView2 = new TextView(context);
        this.emptySubtitleTextView = textView2;
        textView2.setTextColor(getThemedColor(i));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) ((ChatAttachAlertAudioLayout.this.parentAlert.scrollOffsetY[0] + AndroidUtilities.dp(30.0f)) + ((Build.VERSION.SDK_INT < 21 || ChatAttachAlertAudioLayout.this.parentAlert.inBubbleMode) ? 0 : AndroidUtilities.statusBarHeight)));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(getContext(), 1, false, AndroidUtilities.dp(9.0f), this.listView) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i3) {
                        return super.calculateDyToMakeVisible(view, i3) - (ChatAttachAlertAudioLayout.this.listView.getPaddingTop() - AndroidUtilities.dp(7.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i3) {
                        return super.calculateTimeForDeceleration(i3) * 2;
                    }
                };
                linearSmoothScroller.setTargetPosition(i2);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView2.setLayoutManager(fillLastLinearLayoutManager);
        this.listView.setHorizontalScrollBarEnabled(false);
        this.listView.setVerticalScrollBarEnabled(false);
        addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView3 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.listAdapter = listAdapter;
        recyclerListView3.setAdapter(listAdapter);
        this.listView.setGlowColor(getThemedColor(Theme.key_dialogScrollGlow));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                ChatAttachAlertAudioLayout.this.lambda$new$1(view, i2);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                boolean lambda$new$2;
                lambda$new$2 = ChatAttachAlertAudioLayout.this.lambda$new$2(view, i2);
                return lambda$new$2;
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                chatAttachAlertAudioLayout.parentAlert.updateLayout(chatAttachAlertAudioLayout, true, i3);
                ChatAttachAlertAudioLayout.this.updateEmptyViewPosition();
            }
        });
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp(58.0f);
        View view = new View(context);
        this.shadow = view;
        view.setBackgroundColor(getThemedColor(Theme.key_dialogShadowLine));
        this.shadow.setAlpha(0.0f);
        this.shadow.setTag(1);
        addView(this.shadow, layoutParams);
        addView(this.frameLayout, LayoutHelper.createFrame(-1, 58, 51));
        updateEmptyView();
    }

    public void lambda$new$1(View view, int i) {
        onItemClick(view);
    }

    public boolean lambda$new$2(View view, int i) {
        onItemClick(view);
        return true;
    }

    @Override
    void onDestroy() {
        onHide();
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
    }

    @Override
    public void onHide() {
        if (this.playingAudio != null && MediaController.getInstance().isPlayingMessage(this.playingAudio)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.playingAudio = null;
    }

    public void updateEmptyViewPosition() {
        View childAt;
        if (this.currentEmptyView.getVisibility() == 0 && (childAt = this.listView.getChildAt(0)) != null) {
            View view = this.currentEmptyView;
            view.setTranslationY((((view.getMeasuredHeight() - getMeasuredHeight()) + childAt.getTop()) / 2) - (this.currentPanTranslationProgress / 2.0f));
        }
    }

    public void updateEmptyView() {
        boolean isEmpty;
        if (this.loadingAudio) {
            this.currentEmptyView = this.progressView;
            this.emptyView.setVisibility(8);
        } else {
            if (this.listView.getAdapter() == this.searchAdapter) {
                this.emptyTitleTextView.setText(LocaleController.getString("NoAudioFound", R.string.NoAudioFound));
            } else {
                this.emptyTitleTextView.setText(LocaleController.getString("NoAudioFiles", R.string.NoAudioFiles));
                this.emptySubtitleTextView.setText(LocaleController.getString("NoAudioFilesInfo", R.string.NoAudioFilesInfo));
            }
            this.currentEmptyView = this.emptyView;
            this.progressView.setVisibility(8);
        }
        RecyclerView.Adapter adapter = this.listView.getAdapter();
        SearchAdapter searchAdapter = this.searchAdapter;
        if (adapter != searchAdapter) {
            isEmpty = this.audioEntries.isEmpty();
        } else {
            isEmpty = searchAdapter.searchResult.isEmpty();
        }
        this.currentEmptyView.setVisibility(isEmpty ? 0 : 8);
        updateEmptyViewPosition();
    }

    public void setMaxSelectedFiles(int i) {
        this.maxSelectedFiles = i;
    }

    @Override
    void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return ConnectionsManager.DEFAULT_DATACENTER_ID;
        }
        View childAt = this.listView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            runShadowAnimation(false);
        } else {
            runShadowAnimation(true);
            top = i;
        }
        this.frameLayout.setTranslationY(top);
        return top + AndroidUtilities.dp(12.0f);
    }

    @Override
    int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(4.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    @Override
    public boolean onDismiss() {
        if (this.playingAudio != null && MediaController.getInstance().isPlayingMessage(this.playingAudio)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        return super.onDismiss();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        updateEmptyViewPosition();
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int i3;
        if (this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            i3 = AndroidUtilities.dp(8.0f);
            this.parentAlert.setAllowNestedScroll(false);
        } else {
            if (!AndroidUtilities.isTablet()) {
                android.graphics.Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                    this.parentAlert.setAllowNestedScroll(true);
                }
            }
            i3 = (i2 / 5) * 2;
            this.parentAlert.setAllowNestedScroll(true);
        }
        if (this.listView.getPaddingTop() != i3) {
            this.ignoreLayout = true;
            this.listView.setPadding(0, i3, 0, AndroidUtilities.dp(48.0f));
            this.ignoreLayout = false;
        }
    }

    @Override
    void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.layoutManager.scrollToPositionWithOffset(0, 0);
        this.listAdapter.notifyDataSetChanged();
    }

    @Override
    public void onHidden() {
        this.selectedAudios.clear();
        this.selectedAudiosOrder.clear();
    }

    @Override
    public void requestLayout() {
        if (this.ignoreLayout) {
            return;
        }
        super.requestLayout();
    }

    private void runShadowAnimation(final boolean z) {
        if ((!z || this.shadow.getTag() == null) && (z || this.shadow.getTag() != null)) {
            return;
        }
        this.shadow.setTag(z ? null : 1);
        if (z) {
            this.shadow.setVisibility(0);
        }
        AnimatorSet animatorSet = this.shadowAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.shadowAnimation = animatorSet2;
        Animator[] animatorArr = new Animator[1];
        View view = this.shadow;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
        animatorSet2.playTogether(animatorArr);
        this.shadowAnimation.setDuration(150L);
        this.shadowAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (ChatAttachAlertAudioLayout.this.shadowAnimation == null || !ChatAttachAlertAudioLayout.this.shadowAnimation.equals(animator)) {
                    return;
                }
                if (!z) {
                    ChatAttachAlertAudioLayout.this.shadow.setVisibility(4);
                }
                ChatAttachAlertAudioLayout.this.shadowAnimation = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ChatAttachAlertAudioLayout.this.shadowAnimation == null || !ChatAttachAlertAudioLayout.this.shadowAnimation.equals(animator)) {
                    return;
                }
                ChatAttachAlertAudioLayout.this.shadowAnimation = null;
            }
        });
        this.shadowAnimation.start();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.messagePlayingDidReset;
        if (i == i3 || i == NotificationCenter.messagePlayingDidStart || i == NotificationCenter.messagePlayingPlayStateChanged) {
            if (i == i3 || i == NotificationCenter.messagePlayingPlayStateChanged) {
                int childCount = this.listView.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = this.listView.getChildAt(i4);
                    if (childAt instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                        if (sharedAudioCell.getMessage() != null) {
                            sharedAudioCell.updateButtonState(false, true);
                        }
                    }
                }
            } else if (i == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
                int childCount2 = this.listView.getChildCount();
                for (int i5 = 0; i5 < childCount2; i5++) {
                    View childAt2 = this.listView.getChildAt(i5);
                    if (childAt2 instanceof SharedAudioCell) {
                        SharedAudioCell sharedAudioCell2 = (SharedAudioCell) childAt2;
                        if (sharedAudioCell2.getMessage() != null) {
                            sharedAudioCell2.updateButtonState(false, true);
                        }
                    }
                }
            }
        }
    }

    private void showErrorBox(String str) {
        new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString("AppName", R.string.AppName)).setMessage(str).setPositiveButton(LocaleController.getString("OK", R.string.OK), null).show();
    }

    private void onItemClick(android.view.View r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ChatAttachAlertAudioLayout.onItemClick(android.view.View):void");
    }

    @Override
    public int getSelectedItemsCount() {
        return this.selectedAudios.size();
    }

    @Override
    void sendSelectedItems(boolean z, int i) {
        if (this.selectedAudios.size() == 0 || this.delegate == null || this.sendPressed) {
            return;
        }
        this.sendPressed = true;
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        for (int i2 = 0; i2 < this.selectedAudiosOrder.size(); i2++) {
            arrayList.add(this.selectedAudiosOrder.get(i2).messageObject);
        }
        this.delegate.didSelectAudio(arrayList, this.parentAlert.commentTextView.getText(), z, i);
    }

    public void setDelegate(AudioSelectDelegate audioSelectDelegate) {
        this.delegate = audioSelectDelegate;
    }

    private void loadAudio() {
        this.loadingAudio = true;
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertAudioLayout.this.lambda$loadAudio$4();
            }
        });
    }

    public void lambda$loadAudio$4() {
        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
        final ArrayList arrayList = new ArrayList();
        try {
            Cursor query = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
            int i = -2000000000;
            while (query.moveToNext()) {
                MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                audioEntry.id = query.getInt(0);
                audioEntry.author = query.getString(1);
                audioEntry.title = query.getString(2);
                audioEntry.path = query.getString(3);
                audioEntry.duration = (int) (query.getLong(4) / 1000);
                audioEntry.genre = query.getString(5);
                File file = new File(audioEntry.path);
                TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                tLRPC$TL_message.out = true;
                tLRPC$TL_message.id = i;
                tLRPC$TL_message.peer_id = new TLRPC$TL_peerUser();
                TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                tLRPC$TL_message.from_id = tLRPC$TL_peerUser;
                TLRPC$Peer tLRPC$Peer = tLRPC$TL_message.peer_id;
                long clientUserId = UserConfig.getInstance(this.parentAlert.currentAccount).getClientUserId();
                tLRPC$TL_peerUser.user_id = clientUserId;
                tLRPC$Peer.user_id = clientUserId;
                tLRPC$TL_message.date = (int) (System.currentTimeMillis() / 1000);
                tLRPC$TL_message.message = "";
                tLRPC$TL_message.attachPath = audioEntry.path;
                TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
                tLRPC$TL_message.media = tLRPC$TL_messageMediaDocument;
                tLRPC$TL_messageMediaDocument.flags |= 3;
                tLRPC$TL_messageMediaDocument.document = new TLRPC$TL_document();
                tLRPC$TL_message.flags |= 768;
                String fileExtension = FileLoader.getFileExtension(file);
                TLRPC$Document tLRPC$Document = tLRPC$TL_message.media.document;
                tLRPC$Document.id = 0L;
                tLRPC$Document.access_hash = 0L;
                tLRPC$Document.file_reference = new byte[0];
                tLRPC$Document.date = tLRPC$TL_message.date;
                StringBuilder sb = new StringBuilder();
                sb.append("audio/");
                if (fileExtension.length() <= 0) {
                    fileExtension = "mp3";
                }
                sb.append(fileExtension);
                tLRPC$Document.mime_type = sb.toString();
                tLRPC$TL_message.media.document.size = (int) file.length();
                tLRPC$TL_message.media.document.dc_id = 0;
                TLRPC$TL_documentAttributeAudio tLRPC$TL_documentAttributeAudio = new TLRPC$TL_documentAttributeAudio();
                tLRPC$TL_documentAttributeAudio.duration = audioEntry.duration;
                tLRPC$TL_documentAttributeAudio.title = audioEntry.title;
                tLRPC$TL_documentAttributeAudio.performer = audioEntry.author;
                tLRPC$TL_documentAttributeAudio.flags = 3 | tLRPC$TL_documentAttributeAudio.flags;
                tLRPC$TL_message.media.document.attributes.add(tLRPC$TL_documentAttributeAudio);
                TLRPC$TL_documentAttributeFilename tLRPC$TL_documentAttributeFilename = new TLRPC$TL_documentAttributeFilename();
                tLRPC$TL_documentAttributeFilename.file_name = file.getName();
                tLRPC$TL_message.media.document.attributes.add(tLRPC$TL_documentAttributeFilename);
                audioEntry.messageObject = new MessageObject(this.parentAlert.currentAccount, tLRPC$TL_message, false, true);
                arrayList.add(audioEntry);
                i--;
            }
            query.close();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertAudioLayout.this.lambda$loadAudio$3(arrayList);
            }
        });
    }

    public void lambda$loadAudio$3(ArrayList arrayList) {
        this.loadingAudio = false;
        this.audioEntries = arrayList;
        this.listAdapter.notifyDataSetChanged();
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        @Override
        public long getItemId(int i) {
            return i;
        }

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public int getItemCount() {
            return ChatAttachAlertAudioLayout.this.audioEntries.size() + 1 + (!ChatAttachAlertAudioLayout.this.audioEntries.isEmpty());
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(this.mContext, ChatAttachAlertAudioLayout.this.resourcesProvider) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        ChatAttachAlertAudioLayout.this.playingAudio = messageObject;
                        ArrayList<MessageObject> arrayList = new ArrayList<>();
                        arrayList.add(messageObject);
                        return MediaController.getInstance().setPlaylist(arrayList, messageObject, 0L);
                    }
                };
                sharedAudioCell.setCheckForButtonPress(true);
                view = sharedAudioCell;
            } else if (i == 1) {
                view = new View(this.mContext);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
            } else {
                view = new View(this.mContext);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                int i2 = i - 1;
                MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) ChatAttachAlertAudioLayout.this.audioEntries.get(i2);
                SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                sharedAudioCell.setTag(audioEntry);
                sharedAudioCell.setMessageObject(audioEntry.messageObject, i2 != ChatAttachAlertAudioLayout.this.audioEntries.size() - 1);
                sharedAudioCell.setChecked(ChatAttachAlertAudioLayout.this.selectedAudios.indexOfKey(audioEntry.id) >= 0, false);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 2;
            }
            return i == 0 ? 1 : 0;
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertAudioLayout.this.updateEmptyView();
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private int lastSearchId;
        private Context mContext;
        private ArrayList<MediaController.AudioEntry> searchResult = new ArrayList<>();
        private Runnable searchRunnable;

        public SearchAdapter(Context context) {
            this.mContext = context;
        }

        public void search(final String str) {
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            if (TextUtils.isEmpty(str)) {
                if (!this.searchResult.isEmpty()) {
                    this.searchResult.clear();
                }
                if (ChatAttachAlertAudioLayout.this.listView.getAdapter() != ChatAttachAlertAudioLayout.this.listAdapter) {
                    ChatAttachAlertAudioLayout.this.listView.setAdapter(ChatAttachAlertAudioLayout.this.listAdapter);
                }
                notifyDataSetChanged();
                return;
            }
            final int i = this.lastSearchId + 1;
            this.lastSearchId = i;
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertAudioLayout.SearchAdapter.this.lambda$search$1(str, i);
                }
            };
            this.searchRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 300L);
        }

        public void lambda$search$1(final String str, final int i) {
            final ArrayList arrayList = new ArrayList(ChatAttachAlertAudioLayout.this.audioEntries);
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertAudioLayout.SearchAdapter.this.lambda$search$0(str, arrayList, i);
                }
            });
        }

        public void lambda$search$0(String str, ArrayList arrayList, int i) {
            String str2;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>(), str, this.lastSearchId);
                return;
            }
            String translitString = LocaleController.getInstance().getTranslitString(lowerCase);
            translitString = (lowerCase.equals(translitString) || translitString.length() == 0) ? null : null;
            int i2 = (translitString != null ? 1 : 0) + 1;
            String[] strArr = new String[i2];
            strArr[0] = lowerCase;
            if (translitString != null) {
                strArr[1] = translitString;
            }
            ArrayList<MediaController.AudioEntry> arrayList2 = new ArrayList<>();
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) arrayList.get(i3);
                int i4 = 0;
                while (true) {
                    if (i4 < i2) {
                        String str3 = strArr[i4];
                        String str4 = audioEntry.author;
                        boolean contains = str4 != null ? str4.toLowerCase().contains(str3) : false;
                        if (!contains && (str2 = audioEntry.title) != null) {
                            contains = str2.toLowerCase().contains(str3);
                        }
                        if (contains) {
                            arrayList2.add(audioEntry);
                            break;
                        }
                        i4++;
                    }
                }
            }
            updateSearchResults(arrayList2, str, i);
        }

        private void updateSearchResults(final ArrayList<MediaController.AudioEntry> arrayList, final String str, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ChatAttachAlertAudioLayout.SearchAdapter.this.lambda$updateSearchResults$2(i, str, arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$2(int i, String str, ArrayList arrayList) {
            if (i != this.lastSearchId) {
                return;
            }
            if (i != -1 && ChatAttachAlertAudioLayout.this.listView.getAdapter() != ChatAttachAlertAudioLayout.this.searchAdapter) {
                ChatAttachAlertAudioLayout.this.listView.setAdapter(ChatAttachAlertAudioLayout.this.searchAdapter);
            }
            if (ChatAttachAlertAudioLayout.this.listView.getAdapter() == ChatAttachAlertAudioLayout.this.searchAdapter) {
                ChatAttachAlertAudioLayout.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoAudioFoundInfo", R.string.NoAudioFoundInfo, str)));
            }
            this.searchResult = arrayList;
            notifyDataSetChanged();
        }

        @Override
        public void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            ChatAttachAlertAudioLayout.this.updateEmptyView();
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemCount() {
            return this.searchResult.size() + 1 + (!this.searchResult.isEmpty() ? 1 : 0);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                SharedAudioCell sharedAudioCell = new SharedAudioCell(this.mContext, ChatAttachAlertAudioLayout.this.resourcesProvider) {
                    @Override
                    public boolean needPlayMessage(MessageObject messageObject) {
                        ChatAttachAlertAudioLayout.this.playingAudio = messageObject;
                        ArrayList<MessageObject> arrayList = new ArrayList<>();
                        arrayList.add(messageObject);
                        return MediaController.getInstance().setPlaylist(arrayList, messageObject, 0L);
                    }
                };
                sharedAudioCell.setCheckForButtonPress(true);
                view = sharedAudioCell;
            } else if (i == 1) {
                view = new View(this.mContext);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(56.0f)));
            } else {
                view = new View(this.mContext);
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                int i2 = i - 1;
                MediaController.AudioEntry audioEntry = this.searchResult.get(i2);
                SharedAudioCell sharedAudioCell = (SharedAudioCell) viewHolder.itemView;
                sharedAudioCell.setTag(audioEntry);
                sharedAudioCell.setMessageObject(audioEntry.messageObject, i2 != this.searchResult.size() - 1);
                sharedAudioCell.setChecked(ChatAttachAlertAudioLayout.this.selectedAudios.indexOfKey(audioEntry.id) >= 0, false);
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 2;
            }
            return i == 0 ? 1 : 0;
        }
    }

    @Override
    public void onContainerTranslationUpdated(float f) {
        this.currentPanTranslationProgress = f;
        super.onContainerTranslationUpdated(f);
        updateEmptyViewPosition();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.frameLayout, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.searchField.getSearchBackground(), ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_dialogSearchBackground));
        int i = Theme.key_dialogSearchIcon;
        arrayList.add(new ThemeDescription(this.searchField, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SearchField.class}, new String[]{"searchIconImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.searchField, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{SearchField.class}, new String[]{"clearSearchImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.searchField.getSearchEditText(), ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_dialogSearchText));
        arrayList.add(new ThemeDescription(this.searchField.getSearchEditText(), ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_dialogSearchHint));
        arrayList.add(new ThemeDescription(this.searchField.getSearchEditText(), ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_featuredStickers_addedIcon));
        arrayList.add(new ThemeDescription(this.emptyImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, Theme.key_dialogEmptyImage));
        TextView textView = this.emptyTitleTextView;
        int i2 = ThemeDescription.FLAG_IMAGECOLOR;
        int i3 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, i2, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.progressView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.progressView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOX, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkbox));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        return arrayList;
    }
}
