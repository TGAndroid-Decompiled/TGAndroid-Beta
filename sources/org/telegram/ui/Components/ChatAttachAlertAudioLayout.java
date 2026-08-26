package org.telegram.ui.Components;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.audioinfo.AudioInfo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.CallLogActivity$$ExternalSyntheticLambda3;
import org.telegram.ui.Cells.SharedAudioCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda335;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline1;
import org.telegram.ui.ChatLinkActivity$$ExternalSyntheticLambda9;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.MessageEnterTransitionContainer;

public final class ChatAttachAlertAudioLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate, FactorAnimator.Target {
    public final int LOAD_MORE_SEARCH_CHATS;
    public final int LOAD_MORE_SEARCH_GLOBAL;
    public final int LOAD_MORE_SEARCH_PROFILE;
    public final BoolAnimator animatorFadeVisible;
    public ArrayList audioEntries;
    public AudioSelectDelegate delegate;
    public final MessageEnterTransitionContainer fadeView;
    public boolean failedToResolveGlobalAudioBot;
    public final ArrayList foundGlobal;
    public final ArrayList foundInChats;
    public final FrameLayout fragmentContextViewWrapper;
    public final FrameLayout frameLayout;
    public TLRPC.User globalAudioBot;
    public int globalAudioMessageId;
    public String globalAudioOffset;
    public String lastSearchChatsQuery;
    public String lastSearchGlobalQuery;
    public final AnonymousClass3 listView;
    public boolean loadingAudio;
    public boolean loadingSearchChats;
    public boolean loadingSearchGlobal;
    public int maxSelectedFiles;
    public MessageObject playingAudio;
    public int preMeasuredAvailableHeight;
    public final ArrayList profileEntries;
    public String query;
    public boolean resolvingGlobalAudioBot;
    public final MessagesController.SavedMusicList savedMusicList;
    public boolean searchChatsHasMore;
    public int searchChatsNextRate;
    public int searchChatsRequestId;
    public final ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 searchChatsRunnable;
    public final ChatAttachAlert.AttachSearchField searchField;
    public boolean searchGlobalHasMore;
    public int searchGlobalRequestId;
    public final ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 searchGlobalRunnable;
    public final HashSet selectedAudios;
    public boolean sendPressed;
    public final DialogsActivityTopPanelLayout topPanelLayout;
    public final ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 updateWithSavingScrollRunnable;

    public interface AudioSelectDelegate {
        void didSelectAudio(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2);
    }

    public final class EmptyView extends FrameLayout implements Theme.Colorable {
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView subtitleView;
        public final TextView titleView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                EmptyView emptyView = (EmptyView) view;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                emptyView.titleView.setText(charSequence);
                emptyView.subtitleView.setText(charSequence2);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new EmptyView(context, resourcesProvider);
            }

            @Override
            public final boolean isShadow() {
                return true;
            }
        }

        public EmptyView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setPadding(0, AndroidUtilities.dp(42.0f), 0, AndroidUtilities.dp(42.0f));
            setTag(-33024);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 17));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null));
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(120, 120, 17, 0, 0, 0, 0));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-1, -2, 17, 32, 12, 32, 8), context);
            this.subtitleView = textViewM;
            textViewM.setTextSize(1, 14.0f);
            textViewM.setGravity(17);
            linearLayout.addView(textViewM, LayoutHelper.createLinear(-1, -2, 17, 32, 0, 32, 0));
            updateColors$1();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.titleView.setTextColor(Theme.getColor(i, resourcesProvider));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        }
    }

    public ChatAttachAlertAudioLayout(Context context, Theme.ResourcesProvider resourcesProvider, ChatAttachAlert chatAttachAlert) {
        super(context, resourcesProvider, chatAttachAlert);
        this.animatorFadeVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.maxSelectedFiles = -1;
        this.audioEntries = new ArrayList();
        this.selectedAudios = new HashSet();
        this.profileEntries = new ArrayList();
        this.foundInChats = new ArrayList();
        this.foundGlobal = new ArrayList();
        this.LOAD_MORE_SEARCH_CHATS = 1;
        this.LOAD_MORE_SEARCH_GLOBAL = 2;
        this.LOAD_MORE_SEARCH_PROFILE = 3;
        final int i = 0;
        this.updateWithSavingScrollRunnable = new Runnable(this) {
            public final ChatAttachAlertAudioLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i) {
                    case 0:
                        ChatAttachAlertAudioLayout.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                        int i2 = -1;
                        boolean zCanScrollVertically = anonymousClass3.canScrollVertically(-1);
                        int i3 = -1;
                        int i4 = 0;
                        while (i4 < anonymousClass3.getChildCount()) {
                            View childAt = anonymousClass3.getChildAt(i4);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            int top = childAt.getTop();
                            if (childAdapterPosition >= 0) {
                                i3 = top;
                                i2 = childAdapterPosition;
                                anonymousClass3.adapter.update(true);
                                if (!zCanScrollVertically) {
                                    anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                                    return;
                                } else {
                                    if (i2 >= 0) {
                                        anonymousClass3.layoutManager.scrollToPositionWithOffset(i2, i3 - anonymousClass3.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i4++;
                            i3 = top;
                            i2 = childAdapterPosition;
                        }
                        anonymousClass3.adapter.update(true);
                        if (!zCanScrollVertically) {
                            anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                            return;
                        } else {
                            if (i2 >= 0) {
                                anonymousClass3.layoutManager.scrollToPositionWithOffset(i2, i3 - anonymousClass3.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f$0.searchChats();
                        return;
                    case 2:
                        this.f$0.searchGlobal();
                        return;
                    default:
                        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                        chatAttachAlertAudioLayout.getClass();
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i5 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i5;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(chatAttachAlertAudioLayout.parentAlert.currentAccount).getClientUserId();
                                    tL_peerUser.user_id = clientUserId;
                                    peer.user_id = clientUserId;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = audioEntry.path;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String fileExtension = FileLoader.getFileExtension(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = audioEntry.duration;
                                    tL_documentAttributeAudio.title = audioEntry.title;
                                    tL_documentAttributeAudio.performer = audioEntry.author;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(chatAttachAlertAudioLayout.parentAlert.currentAccount, tL_message, false, true);
                                    AudioInfo audioInfo = AudioInfo.getAudioInfo(file);
                                    if (audioInfo != null && audioInfo.cover != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = audioInfo.cover;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f = iDp;
                                            float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i5--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                                    return;
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                        return;
                }
            }
        };
        this.searchChatsRequestId = -1;
        final int i2 = 1;
        this.searchChatsRunnable = new Runnable(this) {
            public final ChatAttachAlertAudioLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i2) {
                    case 0:
                        ChatAttachAlertAudioLayout.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                        int i3 = -1;
                        boolean zCanScrollVertically = anonymousClass3.canScrollVertically(-1);
                        int i4 = -1;
                        int i5 = 0;
                        while (i5 < anonymousClass3.getChildCount()) {
                            View childAt = anonymousClass3.getChildAt(i5);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            int top = childAt.getTop();
                            if (childAdapterPosition >= 0) {
                                i4 = top;
                                i3 = childAdapterPosition;
                                anonymousClass3.adapter.update(true);
                                if (!zCanScrollVertically) {
                                    anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                                    return;
                                } else {
                                    if (i3 >= 0) {
                                        anonymousClass3.layoutManager.scrollToPositionWithOffset(i3, i4 - anonymousClass3.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i5++;
                            i4 = top;
                            i3 = childAdapterPosition;
                        }
                        anonymousClass3.adapter.update(true);
                        if (!zCanScrollVertically) {
                            anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                            return;
                        } else {
                            if (i3 >= 0) {
                                anonymousClass3.layoutManager.scrollToPositionWithOffset(i3, i4 - anonymousClass3.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f$0.searchChats();
                        return;
                    case 2:
                        this.f$0.searchGlobal();
                        return;
                    default:
                        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                        chatAttachAlertAudioLayout.getClass();
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i6 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i6;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(chatAttachAlertAudioLayout.parentAlert.currentAccount).getClientUserId();
                                    tL_peerUser.user_id = clientUserId;
                                    peer.user_id = clientUserId;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = audioEntry.path;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String fileExtension = FileLoader.getFileExtension(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = audioEntry.duration;
                                    tL_documentAttributeAudio.title = audioEntry.title;
                                    tL_documentAttributeAudio.performer = audioEntry.author;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(chatAttachAlertAudioLayout.parentAlert.currentAccount, tL_message, false, true);
                                    AudioInfo audioInfo = AudioInfo.getAudioInfo(file);
                                    if (audioInfo != null && audioInfo.cover != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = audioInfo.cover;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f = iDp;
                                            float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i6--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                                    return;
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                        return;
                }
            }
        };
        this.searchGlobalRequestId = -1;
        final int i3 = 2;
        this.searchGlobalRunnable = new Runnable(this) {
            public final ChatAttachAlertAudioLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i3) {
                    case 0:
                        ChatAttachAlertAudioLayout.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                        int i4 = -1;
                        boolean zCanScrollVertically = anonymousClass3.canScrollVertically(-1);
                        int i5 = -1;
                        int i6 = 0;
                        while (i6 < anonymousClass3.getChildCount()) {
                            View childAt = anonymousClass3.getChildAt(i6);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            int top = childAt.getTop();
                            if (childAdapterPosition >= 0) {
                                i5 = top;
                                i4 = childAdapterPosition;
                                anonymousClass3.adapter.update(true);
                                if (!zCanScrollVertically) {
                                    anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                                    return;
                                } else {
                                    if (i4 >= 0) {
                                        anonymousClass3.layoutManager.scrollToPositionWithOffset(i4, i5 - anonymousClass3.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i6++;
                            i5 = top;
                            i4 = childAdapterPosition;
                        }
                        anonymousClass3.adapter.update(true);
                        if (!zCanScrollVertically) {
                            anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                            return;
                        } else {
                            if (i4 >= 0) {
                                anonymousClass3.layoutManager.scrollToPositionWithOffset(i4, i5 - anonymousClass3.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f$0.searchChats();
                        return;
                    case 2:
                        this.f$0.searchGlobal();
                        return;
                    default:
                        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                        chatAttachAlertAudioLayout.getClass();
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i7 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i7;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(chatAttachAlertAudioLayout.parentAlert.currentAccount).getClientUserId();
                                    tL_peerUser.user_id = clientUserId;
                                    peer.user_id = clientUserId;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = audioEntry.path;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String fileExtension = FileLoader.getFileExtension(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = audioEntry.duration;
                                    tL_documentAttributeAudio.title = audioEntry.title;
                                    tL_documentAttributeAudio.performer = audioEntry.author;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(chatAttachAlertAudioLayout.parentAlert.currentAccount, tL_message, false, true);
                                    AudioInfo audioInfo = AudioInfo.getAudioInfo(file);
                                    if (audioInfo != null && audioInfo.cover != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = audioInfo.cover;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f = iDp;
                                            float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i7--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                                    return;
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                        return;
                }
            }
        };
        this.globalAudioMessageId = -1000000000;
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(this.parentAlert.currentAccount).addObserver(this, NotificationCenter.musicListLoaded);
        this.loadingAudio = true;
        final int i4 = 3;
        Utilities.globalQueue.postRunnable(new Runnable(this) {
            public final ChatAttachAlertAudioLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i4) {
                    case 0:
                        ChatAttachAlertAudioLayout.AnonymousClass3 anonymousClass3 = this.f$0.listView;
                        int i5 = -1;
                        boolean zCanScrollVertically = anonymousClass3.canScrollVertically(-1);
                        int i6 = -1;
                        int i7 = 0;
                        while (i7 < anonymousClass3.getChildCount()) {
                            View childAt = anonymousClass3.getChildAt(i7);
                            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
                            int top = childAt.getTop();
                            if (childAdapterPosition >= 0) {
                                i6 = top;
                                i5 = childAdapterPosition;
                                anonymousClass3.adapter.update(true);
                                if (!zCanScrollVertically) {
                                    anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                                    return;
                                } else {
                                    if (i5 >= 0) {
                                        anonymousClass3.layoutManager.scrollToPositionWithOffset(i5, i6 - anonymousClass3.getPaddingTop());
                                        return;
                                    }
                                    return;
                                }
                            }
                            i7++;
                            i6 = top;
                            i5 = childAdapterPosition;
                        }
                        anonymousClass3.adapter.update(true);
                        if (!zCanScrollVertically) {
                            anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
                            return;
                        } else {
                            if (i5 >= 0) {
                                anonymousClass3.layoutManager.scrollToPositionWithOffset(i5, i6 - anonymousClass3.getPaddingTop());
                                return;
                            }
                            return;
                        }
                    case 1:
                        this.f$0.searchChats();
                        return;
                    case 2:
                        this.f$0.searchGlobal();
                        return;
                    default:
                        ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                        chatAttachAlertAudioLayout.getClass();
                        String[] strArr = {"_id", "artist", "title", "_data", "duration", "album"};
                        ArrayList arrayList = new ArrayList();
                        try {
                            Cursor cursorQuery = ApplicationLoader.applicationContext.getContentResolver().query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music != 0", null, "title");
                            int i8 = -2000000000;
                            while (cursorQuery.moveToNext()) {
                                try {
                                    MediaController.AudioEntry audioEntry = new MediaController.AudioEntry();
                                    audioEntry.id = cursorQuery.getInt(0);
                                    audioEntry.author = cursorQuery.getString(1);
                                    audioEntry.title = cursorQuery.getString(2);
                                    audioEntry.path = cursorQuery.getString(3);
                                    audioEntry.duration = (int) (cursorQuery.getLong(4) / 1000);
                                    audioEntry.genre = cursorQuery.getString(5);
                                    File file = new File(audioEntry.path);
                                    TLRPC.TL_message tL_message = new TLRPC.TL_message();
                                    tL_message.out = true;
                                    tL_message.id = i8;
                                    tL_message.peer_id = new TLRPC.TL_peerUser();
                                    TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                                    tL_message.from_id = tL_peerUser;
                                    TLRPC.Peer peer = tL_message.peer_id;
                                    long clientUserId = UserConfig.getInstance(chatAttachAlertAudioLayout.parentAlert.currentAccount).getClientUserId();
                                    tL_peerUser.user_id = clientUserId;
                                    peer.user_id = clientUserId;
                                    tL_message.date = (int) (System.currentTimeMillis() / 1000);
                                    tL_message.message = "";
                                    tL_message.attachPath = audioEntry.path;
                                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                                    tL_message.media = tL_messageMediaDocument;
                                    tL_messageMediaDocument.flags |= 3;
                                    tL_messageMediaDocument.document = new TLRPC.TL_document();
                                    tL_message.flags |= 768;
                                    String fileExtension = FileLoader.getFileExtension(file);
                                    TLRPC.Document document = tL_message.media.document;
                                    document.id = 0L;
                                    document.access_hash = 0L;
                                    document.file_reference = new byte[0];
                                    document.date = tL_message.date;
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("audio/");
                                    if (fileExtension.length() <= 0) {
                                        fileExtension = "mp3";
                                    }
                                    sb.append(fileExtension);
                                    document.mime_type = sb.toString();
                                    tL_message.media.document.size = (int) file.length();
                                    tL_message.media.document.dc_id = 0;
                                    TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                                    tL_documentAttributeAudio.duration = audioEntry.duration;
                                    tL_documentAttributeAudio.title = audioEntry.title;
                                    tL_documentAttributeAudio.performer = audioEntry.author;
                                    tL_documentAttributeAudio.flags |= 3;
                                    tL_message.media.document.attributes.add(tL_documentAttributeAudio);
                                    TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                                    tL_documentAttributeFilename.file_name = file.getName();
                                    tL_message.media.document.attributes.add(tL_documentAttributeFilename);
                                    audioEntry.messageObject = new MessageObject(chatAttachAlertAudioLayout.parentAlert.currentAccount, tL_message, false, true);
                                    AudioInfo audioInfo = AudioInfo.getAudioInfo(file);
                                    if (audioInfo != null && audioInfo.cover != null) {
                                        int iDp = AndroidUtilities.dp(44.0f);
                                        Bitmap bitmap = audioInfo.cover;
                                        if (bitmap.getWidth() > iDp || bitmap.getHeight() > iDp) {
                                            float f = iDp;
                                            float fMin = Math.min(f / bitmap.getWidth(), f / bitmap.getHeight());
                                            audioEntry.messageObject.audioCover = Bitmap.createScaledBitmap(bitmap, (int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), true);
                                        } else {
                                            audioEntry.messageObject.audioCover = bitmap;
                                        }
                                    }
                                    arrayList.add(audioEntry);
                                    i8--;
                                } catch (Throwable th) {
                                    if (cursorQuery == null) {
                                        throw th;
                                    }
                                    try {
                                        cursorQuery.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                        throw th;
                                    }
                                    AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                                    return;
                                }
                            }
                            cursorQuery.close();
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        AndroidUtilities.runOnUIThread(new ChatLinkActivity$$ExternalSyntheticLambda9(29, chatAttachAlertAudioLayout, arrayList));
                        return;
                }
            }
        });
        MessageEnterTransitionContainer messageEnterTransitionContainer = new MessageEnterTransitionContainer(context, Theme.key_windowBackgroundWhite, resourcesProvider);
        this.fadeView = messageEnterTransitionContainer;
        messageEnterTransitionContainer.setVisibility(4);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        ChatAttachAlert.AttachSearchField attachSearchField = new ChatAttachAlert.AttachSearchField(context, resourcesProvider, this.parentAlert);
        this.searchField = attachSearchField;
        attachSearchField.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        attachSearchField.editText.addTextChangedListener(new TextWatcher() {
            @Override
            public final void afterTextChanged(Editable editable) {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                TextUtils.isEmpty(chatAttachAlertAudioLayout.query);
                chatAttachAlertAudioLayout.query = editable.toString().trim();
                ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda2 = chatAttachAlertAudioLayout.searchChatsRunnable;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                if (!TextUtils.isEmpty(chatAttachAlertAudioLayout.query)) {
                    String str = chatAttachAlertAudioLayout.query;
                    chatAttachAlertAudioLayout.loadingSearchChats = str != null && str.length() >= 0;
                    if (!TextUtils.equals(chatAttachAlertAudioLayout.lastSearchChatsQuery, chatAttachAlertAudioLayout.query)) {
                        chatAttachAlertAudioLayout.foundInChats.clear();
                        chatAttachAlertAudioLayout.searchChatsNextRate = 0;
                        chatAttachAlertAudioLayout.searchChatsHasMore = false;
                    }
                    AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2, 1500L);
                }
                ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda3 = chatAttachAlertAudioLayout.searchGlobalRunnable;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda3);
                if (!TextUtils.isEmpty(chatAttachAlertAudioLayout.query)) {
                    String str2 = chatAttachAlertAudioLayout.query;
                    chatAttachAlertAudioLayout.loadingSearchGlobal = (str2 == null || str2.length() < 3 || TextUtils.isEmpty(MessagesController.getInstance(chatAttachAlertAudioLayout.parentAlert.currentAccount).config.musicSearchUsername.get())) ? false : true;
                    if (!TextUtils.equals(chatAttachAlertAudioLayout.lastSearchGlobalQuery, chatAttachAlertAudioLayout.query)) {
                        chatAttachAlertAudioLayout.foundGlobal.clear();
                        chatAttachAlertAudioLayout.searchGlobalHasMore = false;
                    }
                    AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda3, 1500L);
                }
                ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda4 = chatAttachAlertAudioLayout.updateWithSavingScrollRunnable;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda4);
                AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda4);
            }

            @Override
            public final void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }

            @Override
            public final void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
            }
        });
        attachSearchField.editText.setHint(LocaleController.getString(R.string.SearchMusic));
        frameLayout.addView(messageEnterTransitionContainer, LayoutHelper.createFrame(-1.0f, -1));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 51, 7.0f, 8.0f, 7.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame).topMargin += AndroidUtilities.statusBarHeight;
        frameLayout.addView(attachSearchField, layoutParamsCreateFrame);
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        dialogsActivityTopPanelLayout.setOnAnimatedHeightChangedListener(new EmojiView$2$$ExternalSyntheticLambda1(1, this, chatAttachAlert));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentContextViewWrapper = frameLayout2;
        dialogsActivityTopPanelLayout.addView(frameLayout2);
        dialogsActivityTopPanelLayout.setViewVisible(frameLayout2, true, false);
        FragmentContextView fragmentContextView = new FragmentContextView(context, chatAttachAlert.baseFragment, frameLayout, resourcesProvider) {
            @Override
            public final void setVisibility(int i5) {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                chatAttachAlertAudioLayout.topPanelLayout.setViewVisible(chatAttachAlertAudioLayout.fragmentContextViewWrapper, i5 == 0, true);
            }
        };
        frameLayout2.addView(fragmentContextView);
        dialogsActivityTopPanelLayout.setCallFragmentContextView(fragmentContextView);
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2.0f, 51, 0.0f, 8.0f, 0.0f, 4.0f);
        ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).topMargin = AndroidUtilities.dp(27.0f) + AndroidUtilities.statusBarHeight + ((ViewGroup.MarginLayoutParams) layoutParamsCreateFrame2).topMargin;
        frameLayout.addView(dialogsActivityTopPanelLayout, layoutParamsCreateFrame2);
        ?? r0 = new UniversalRecyclerView(context, chatAttachAlert.currentAccount, new CallLogActivity$$ExternalSyntheticLambda3(this, 22), new ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7(this), new ChatAttachAlertAudioLayout$$ExternalSyntheticLambda7(this), resourcesProvider) {
            @Override
            public final boolean allowSelectChildAtPosition(float f) {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                return f >= ((float) ((AndroidUtilities.dp(30.0f) + chatAttachAlertAudioLayout.parentAlert.scrollOffsetY[0]) + (!chatAttachAlertAudioLayout.parentAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)));
            }

            @Override
            public final void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                chatAttachAlertAudioLayout.parentAlert.updateLayout(chatAttachAlertAudioLayout, true, 0);
            }

            @Override
            public final void onLayoutUpdate() {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = ChatAttachAlertAudioLayout.this;
                chatAttachAlertAudioLayout.parentAlert.updateLayout(chatAttachAlertAudioLayout, true, 0);
            }
        };
        this.listView = r0;
        r0.adapter.applyBackground = false;
        r0.setSections();
        this.iBlur3Capture = r0;
        this.iBlur3CaptureView = r0;
        this.occupyStatusBar = true;
        this.occupyNavigationBar = true;
        r0.setClipToPadding(false);
        r0.setHorizontalScrollBarEnabled(false);
        r0.setVerticalScrollBarEnabled(false);
        addView((View) r0, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        r0.setGlowColor(Theme.getColor(Theme.key_dialogScrollGlow, this.resourcesProvider));
        r0.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 15));
        addView(frameLayout, LayoutHelper.createFrame(-1, 200, 51));
        r0.adapter.update(false);
        checkUi_listViewPadding$1();
        int i5 = this.parentAlert.currentAccount;
        this.savedMusicList = new MessagesController.SavedMusicList(i5, UserConfig.getInstance(i5).getClientUserId());
    }

    public final void checkUi_listViewPadding$1() {
        int iDp;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = AndroidUtilities.dp(8.0f);
            chatAttachAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                iDp = (this.preMeasuredAvailableHeight / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    iDp = (int) (this.preMeasuredAvailableHeight / 3.5f);
                } else {
                    iDp = (this.preMeasuredAvailableHeight / 5) * 2;
                }
            }
            chatAttachAlert.setAllowNestedScroll(true);
        }
        setPadding(0, (int) (this.topPanelLayout.getAnimatedHeightWithPadding(0.0f) + AndroidUtilities.dp(56.0f) + iDp + AndroidUtilities.statusBarHeight), 0, this.listPaddingBottom);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.messagePlayingDidReset;
        AnonymousClass3 anonymousClass3 = this.listView;
        if (i != i3 && i != NotificationCenter.messagePlayingDidStart && i != NotificationCenter.messagePlayingPlayStateChanged) {
            if (i == NotificationCenter.musicListLoaded && objArr[0] == this.savedMusicList && anonymousClass3 != null) {
                anonymousClass3.adapter.update(true);
                return;
            }
            return;
        }
        if (i == i3 || i == NotificationCenter.messagePlayingPlayStateChanged) {
            int childCount = anonymousClass3.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = anonymousClass3.getChildAt(i4);
                if (childAt instanceof SharedAudioCell) {
                    SharedAudioCell sharedAudioCell = (SharedAudioCell) childAt;
                    if (sharedAudioCell.getMessage() != null) {
                        sharedAudioCell.updateButtonState(false, true);
                    }
                }
            }
            return;
        }
        if (i == NotificationCenter.messagePlayingDidStart && ((MessageObject) objArr[0]).eventId == 0) {
            int childCount2 = anonymousClass3.getChildCount();
            for (int i5 = 0; i5 < childCount2; i5++) {
                View childAt2 = anonymousClass3.getChildAt(i5);
                if (childAt2 instanceof SharedAudioCell) {
                    SharedAudioCell sharedAudioCell2 = (SharedAudioCell) childAt2;
                    if (sharedAudioCell2.getMessage() != null) {
                        sharedAudioCell2.updateButtonState(false, true);
                    }
                }
            }
        }
    }

    @Override
    public int getCurrentItemTop() {
        AnonymousClass3 anonymousClass3 = this.listView;
        if (anonymousClass3.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int top = Integer.MAX_VALUE;
        boolean z = false;
        for (int i = 0; i < anonymousClass3.getChildCount(); i++) {
            View childAt = anonymousClass3.getChildAt(i);
            anonymousClass3.getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(childAt);
            if (childAdapterPosition == 0) {
                z = true;
            }
            if (childAdapterPosition >= 0 && childAt.getTop() < top) {
                top = childAt.getTop();
            }
        }
        if (top == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int iDp = (((top - AndroidUtilities.dp(56.0f)) - ((int) this.topPanelLayout.getAnimatedHeightWithPadding(0.0f))) - AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(8.0f);
        int i2 = (iDp <= 0 || !z) ? 0 : iDp;
        BoolAnimator boolAnimator = this.animatorFadeVisible;
        if (iDp < 0 || !z) {
            boolAnimator.setValue(true, true);
            iDp = i2;
        } else {
            boolAnimator.setValue(false, true);
        }
        this.frameLayout.setTranslationY(iDp);
        return AndroidUtilities.dp(12.0f) + iDp;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(4.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return (getPaddingTop() - AndroidUtilities.dp(56.0f)) - ((int) this.topPanelLayout.getAnimatedHeightWithPadding(0.0f));
    }

    public ArrayList<MessageObject> getSelected() {
        ArrayList<MessageObject> arrayList = new ArrayList<>();
        Iterator it = this.selectedAudios.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        return arrayList;
    }

    @Override
    public int getSelectedItemsCount() {
        return this.selectedAudios.size();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        int i = Theme.key_checkbox;
        arrayList.add(new ThemeDescription(this.listView, 8192, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i));
        int i2 = Theme.key_checkboxCheck;
        arrayList.add(new ThemeDescription(this.listView, 16384, new Class[]{SharedAudioCell.class}, new String[]{"checkBox"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_titleTextPaint, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 4, new Class[]{SharedAudioCell.class}, Theme.chat_contextResult_descriptionTextPaint, null, null, Theme.key_windowBackgroundWhiteGrayText2));
        return arrayList;
    }

    @Override
    public final void onContainerTranslationUpdated(float f) {
    }

    @Override
    public final void onDestroy() {
        onHide();
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        NotificationCenter.getInstance(chatAttachAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidReset);
        NotificationCenter.getInstance(chatAttachAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingDidStart);
        NotificationCenter.getInstance(chatAttachAlert.currentAccount).removeObserver(this, NotificationCenter.messagePlayingPlayStateChanged);
        NotificationCenter.getInstance(chatAttachAlert.currentAccount).removeObserver(this, NotificationCenter.musicListLoaded);
    }

    @Override
    public final boolean onDismiss() {
        if (this.playingAudio == null || !MediaController.getInstance().isPlayingMessage(this.playingAudio)) {
            return false;
        }
        MediaController.getInstance().cleanupPlayer(true, true);
        return false;
    }

    @Override
    public final void onFactorChangeFinished(float f, int i) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            MessageEnterTransitionContainer messageEnterTransitionContainer = this.fadeView;
            messageEnterTransitionContainer.setAlpha(f);
            messageEnterTransitionContainer.setVisibility(f > 0.0f ? 0 : 4);
        }
    }

    @Override
    public final void onHidden() {
        this.selectedAudios.clear();
    }

    @Override
    public final void onHide() {
        if (this.playingAudio != null && MediaController.getInstance().isPlayingMessage(this.playingAudio)) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.playingAudio = null;
    }

    public final void onItemClick(UItem uItem, View view) {
        int i = 1;
        if (uItem != null && uItem.id == this.LOAD_MORE_SEARCH_PROFILE) {
            this.savedMusicList.load();
            return;
        }
        if (uItem != null && uItem.id == this.LOAD_MORE_SEARCH_CHATS) {
            searchChats();
            return;
        }
        if (uItem != null && uItem.id == this.LOAD_MORE_SEARCH_GLOBAL) {
            searchGlobal();
            return;
        }
        if (view instanceof SharedAudioCell) {
            SharedAudioCell sharedAudioCell = (SharedAudioCell) view;
            MediaController.AudioEntry audioEntry = (MediaController.AudioEntry) sharedAudioCell.getTag();
            ChatAttachAlert chatAttachAlert = this.parentAlert;
            chatAttachAlert.getClass();
            if (chatAttachAlert.isPollAttach) {
                this.sendPressed = true;
                ArrayList arrayList = new ArrayList();
                arrayList.add(audioEntry.messageObject);
                this.delegate.didSelectAudio(arrayList, chatAttachAlert.getCommentView().getText(), false, 0, 0, 0L, false, 0L);
            } else {
                HashSet hashSet = this.selectedAudios;
                if (hashSet.contains(audioEntry)) {
                    hashSet.remove(audioEntry);
                    uItem.checked = false;
                    sharedAudioCell.setChecked(false, true);
                    i = 2;
                } else {
                    if (this.maxSelectedFiles >= 0) {
                        int size = hashSet.size();
                        int i2 = this.maxSelectedFiles;
                        if (size >= i2) {
                            String string = LocaleController.formatString(R.string.PassportUploadMaxReached, LocaleController.formatPluralString("Files", i2, new Object[0]));
                            AlertDialog.Builder builder = new AlertDialog.Builder(getContext(), 0, this.resourcesProvider);
                            String string2 = LocaleController.getString(R.string.AppName);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = string2;
                            alertDialog.message = string;
                            ChatActivity$$ExternalSyntheticOutline1.m(R.string.OK, builder);
                            return;
                        }
                    }
                    uItem.checked = true;
                    hashSet.add(audioEntry);
                    sharedAudioCell.setChecked(true, true);
                }
            }
            chatAttachAlert.updateCountButton(i);
        }
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        this.preMeasuredAvailableHeight = i2;
        checkUi_listViewPadding$1();
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        searchChats();
        this.savedMusicList.load();
        AnonymousClass3 anonymousClass3 = this.listView;
        anonymousClass3.layoutManager.scrollToPositionWithOffset(0, 0);
        anonymousClass3.adapter.update(false);
    }

    @Override
    public final void scrollToTop() {
        smoothScrollToPosition(0);
    }

    public final void searchChats() {
        AndroidUtilities.cancelRunOnUIThread(this.searchChatsRunnable);
        String str = this.query;
        ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda2 = this.updateWithSavingScrollRunnable;
        if (str != null && str.length() > 0 && this.query.length() < 3) {
            if (this.loadingSearchChats) {
                this.loadingSearchChats = false;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.lastSearchChatsQuery, this.query);
        ArrayList arrayList = this.foundInChats;
        if (!zEquals) {
            arrayList.clear();
            this.searchChatsNextRate = 0;
            this.searchChatsHasMore = false;
        }
        if (!arrayList.isEmpty() && !this.searchChatsHasMore) {
            if (this.loadingSearchChats) {
                this.loadingSearchChats = false;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                return;
            }
            return;
        }
        int i = this.parentAlert.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        int i2 = this.searchChatsRequestId;
        if (i2 >= 0) {
            connectionsManager.cancelRequest(i2, true);
            this.searchChatsRequestId = -1;
        }
        TLRPC.TL_messages_searchGlobal tL_messages_searchGlobal = new TLRPC.TL_messages_searchGlobal();
        tL_messages_searchGlobal.filter = new TLRPC.TL_inputMessagesFilterMusic();
        String str2 = this.query;
        this.lastSearchChatsQuery = str2;
        if (str2 == null) {
            str2 = "";
        }
        tL_messages_searchGlobal.q = str2;
        tL_messages_searchGlobal.limit = arrayList.isEmpty() ? 3 : 15;
        if (arrayList.size() > 0) {
            MessageObject messageObject = ((MediaController.AudioEntry) SurfaceContainer$$ExternalSyntheticOutline0.m(1, arrayList)).messageObject;
            tL_messages_searchGlobal.offset_id = messageObject.getId();
            tL_messages_searchGlobal.offset_rate = this.searchChatsNextRate;
            tL_messages_searchGlobal.offset_peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        } else {
            tL_messages_searchGlobal.offset_rate = 0;
            tL_messages_searchGlobal.offset_id = 0;
            tL_messages_searchGlobal.offset_peer = new TLRPC.TL_inputPeerEmpty();
        }
        this.searchChatsRequestId = connectionsManager.sendRequestTyped(tL_messages_searchGlobal, new AiTonesController$$ExternalSyntheticLambda0(), new ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0(this, messagesController, i, 0));
        AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
        AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
    }

    public final void searchGlobal() {
        String str;
        AndroidUtilities.cancelRunOnUIThread(this.searchGlobalRunnable);
        boolean zIsEmpty = TextUtils.isEmpty(this.query);
        ChatAttachAlertAudioLayout$$ExternalSyntheticLambda2 chatAttachAlertAudioLayout$$ExternalSyntheticLambda2 = this.updateWithSavingScrollRunnable;
        if (zIsEmpty || this.query.length() < 3) {
            if (this.loadingSearchGlobal) {
                this.loadingSearchGlobal = false;
                AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
                return;
            }
            return;
        }
        boolean zEquals = TextUtils.equals(this.lastSearchGlobalQuery, this.query);
        ArrayList arrayList = this.foundGlobal;
        if (!zEquals) {
            arrayList.clear();
            this.searchGlobalHasMore = false;
        }
        int i = this.parentAlert.currentAccount;
        MessagesController messagesController = MessagesController.getInstance(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        int i2 = this.searchGlobalRequestId;
        if (i2 >= 0) {
            connectionsManager.cancelRequest(i2, true);
            this.searchGlobalRequestId = -1;
        }
        String str2 = messagesController.config.musicSearchUsername.get();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        if (this.globalAudioBot == null) {
            this.globalAudioBot = messagesController.getUser(str2);
        }
        if (this.globalAudioBot == null) {
            if (this.resolvingGlobalAudioBot || this.failedToResolveGlobalAudioBot) {
                return;
            }
            this.resolvingGlobalAudioBot = true;
            messagesController.getUserNameResolver().resolve(str2, new ChatActivity$$ExternalSyntheticLambda335(5, this, messagesController));
            return;
        }
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
        tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.globalAudioBot);
        tL_messages_getInlineBotResults.peer = MessagesController.getInputPeer(currentUser);
        if (arrayList.isEmpty() || (str = this.globalAudioOffset) == null) {
            str = "";
        }
        tL_messages_getInlineBotResults.offset = str;
        String str3 = this.query;
        String str4 = str3 != null ? str3 : "";
        this.lastSearchGlobalQuery = str4;
        tL_messages_getInlineBotResults.query = str4;
        this.searchGlobalRequestId = connectionsManager.sendRequestTyped(tL_messages_getInlineBotResults, new AiTonesController$$ExternalSyntheticLambda0(), new ChatAttachAlertAudioLayout$$ExternalSyntheticLambda0(this, messagesController, i, 1));
        AndroidUtilities.cancelRunOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
        AndroidUtilities.runOnUIThread(chatAttachAlertAudioLayout$$ExternalSyntheticLambda2);
    }

    @Override
    public final boolean sendSelectedItems(final int i, final boolean z, final int i2, final boolean z2, final long j) {
        HashSet hashSet = this.selectedAudios;
        if (hashSet.size() == 0 || this.delegate == null || this.sendPressed) {
            return false;
        }
        this.sendPressed = true;
        final ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaController.AudioEntry) it.next()).messageObject);
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        return AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + arrayList.size(), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlertAudioLayout chatAttachAlertAudioLayout = this.f$0;
                ChatAttachAlertAudioLayout.AudioSelectDelegate audioSelectDelegate = chatAttachAlertAudioLayout.delegate;
                ChatAttachAlert chatAttachAlert2 = chatAttachAlertAudioLayout.parentAlert;
                Editable text = chatAttachAlert2.getCommentView().getText();
                long jLongValue = ((Long) obj).longValue();
                audioSelectDelegate.didSelectAudio(arrayList, text, z, i, i2, j, z2, jLongValue);
                chatAttachAlert2.dismiss(true);
            }
        }, 0L);
    }

    public void setDelegate(AudioSelectDelegate audioSelectDelegate) {
        this.delegate = audioSelectDelegate;
    }

    public void setMaxSelectedFiles(int i) {
        this.maxSelectedFiles = i;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
    }

    public void setupBlurredSearchField(BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        ChatAttachAlert.AttachSearchField attachSearchField = this.searchField;
        if (attachSearchField != null) {
            attachSearchField.setupBlurredBackground(blurredBackgroundDrawableViewFactory.create(attachSearchField, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false));
        }
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout != null) {
            BlurredBackgroundDrawable blurredBackgroundDrawableCreate = blurredBackgroundDrawableViewFactory.create(dialogsActivityTopPanelLayout, BlurredBackgroundProviderImpl.topPanel(resourcesProvider), false);
            blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
            blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
            dialogsActivityTopPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        }
    }
}
