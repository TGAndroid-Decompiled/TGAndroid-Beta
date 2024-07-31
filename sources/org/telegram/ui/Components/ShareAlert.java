package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.view.ViewCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$MessageEntity;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$TL_channels_exportMessageLink;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_encryptedChat;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_exportedMessageLink;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.tl.TL_stories$StoryItem;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.ShareDialogCell;
import org.telegram.ui.Cells.ShareTopicCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.MessageStatisticActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class ShareAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private AnimatorSet animatorSet;
    private FrameLayout bulletinContainer;
    public FrameLayout bulletinContainer2;
    private float captionEditTextTopOffset;
    private float chatActivityEnterViewAnimateFromTop;
    private EditTextEmoji commentTextView;
    private int containerViewTop;
    private boolean copyLinkOnEnd;
    private float currentPanTranslationY;
    private boolean darkTheme;
    private ShareAlertDelegate delegate;
    private TLRPC$TL_exportedMessageLink exportedMessageLink;
    public boolean forceDarkThemeForHint;
    private FrameLayout frameLayout;
    private FrameLayout frameLayout2;
    private boolean fullyShown;
    private RecyclerListView gridView;
    private int hasPoll;
    private boolean includeStory;
    public boolean includeStoryFromMessage;
    private boolean isChannel;
    int lastOffset;
    private GridLayoutManager layoutManager;
    private String[] linkToCopy;
    private ShareDialogsAdapter listAdapter;
    private boolean loadingLink;
    private Paint paint;
    private boolean panTranslationMoveLayout;
    private Activity parentActivity;
    private ChatActivity parentFragment;
    private TextView pickerBottomLayout;
    private int previousScrollOffsetY;
    private ArrayList<DialogsSearchAdapter.RecentSearchObject> recentSearchObjects;
    private LongSparseArray<DialogsSearchAdapter.RecentSearchObject> recentSearchObjectsById;
    private RectF rect;
    RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
    private final Theme.ResourcesProvider resourcesProvider;
    private int scrollOffsetY;
    private ShareSearchAdapter searchAdapter;
    private StickerEmptyView searchEmptyView;
    private RecyclerListView searchGridView;
    private boolean searchIsVisible;
    private FillLastGridLayoutManager searchLayoutManager;
    SearchField searchView;
    private boolean searchWasVisibleBeforeTopics;
    private View selectedCountView;
    protected Map<TLRPC$Dialog, TLRPC$TL_forumTopic> selectedDialogTopics;
    protected LongSparseArray<TLRPC$Dialog> selectedDialogs;
    private TLRPC$Dialog selectedTopicDialog;
    private ActionBarPopupWindow sendPopupWindow;
    protected ArrayList<MessageObject> sendingMessageObjects;
    private String[] sendingText;
    private View[] shadow;
    private AnimatorSet[] shadowAnimation;
    private Drawable shadowDrawable;
    private ShareTopicsAdapter shareTopicsAdapter;
    private LinearLayout sharesCountLayout;
    private int shiftDp;
    private boolean showSendersName;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    TL_stories$StoryItem storyItem;
    private SwitchView switchView;
    private TextPaint textPaint;
    private ValueAnimator topBackgroundAnimator;
    private int topBeforeSwitch;
    private SpringAnimation topicsAnimation;
    ActionBar topicsBackActionBar;
    private RecyclerListView topicsGridView;
    private GridLayoutManager topicsLayoutManager;
    private boolean updateSearchAdapter;
    private FrameLayout writeButtonContainer;

    public static class DialogSearchResult {
        public int date;
        public TLRPC$Dialog dialog = new TLRPC$TL_dialog();
        public CharSequence name;
        public TLObject object;
    }

    public interface ShareAlertDelegate {

        public final class CC {
            public static void $default$didShare(ShareAlertDelegate shareAlertDelegate) {
            }
        }

        boolean didCopy();

        void didShare();
    }

    public static boolean lambda$new$10(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    protected boolean canDismissWithSwipe() {
        return false;
    }

    public void onSend(LongSparseArray<TLRPC$Dialog> longSparseArray, int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
    }

    protected void onShareStory(View view) {
    }

    public void setStoryToShare(TL_stories$StoryItem tL_stories$StoryItem) {
        this.storyItem = tL_stories$StoryItem;
    }

    public class SwitchView extends FrameLayout {
        private AnimatorSet animator;
        private int currentTab;
        private int lastColor;
        private SimpleTextView leftTab;
        private LinearGradient linearGradient;
        private Paint paint;
        private RectF rect;
        private SimpleTextView rightTab;
        private View searchBackground;
        private View slidingView;

        protected void onTabSwitch(int i) {
            throw null;
        }

        public SwitchView(ShareAlert shareAlert, Context context) {
            super(context);
            this.paint = new Paint(1);
            this.rect = new RectF();
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), shareAlert.getThemedColor(shareAlert.darkTheme ? Theme.key_voipgroup_searchBackground : Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            View view2 = new View(context, shareAlert) {
                {
                    SwitchView.this = this;
                }

                @Override
                public void setTranslationX(float f) {
                    super.setTranslationX(f);
                    invalidate();
                }

                @Override
                protected void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    int offsetColor = AndroidUtilities.getOffsetColor(-9057429, -10513163, getTranslationX() / getMeasuredWidth(), 1.0f);
                    int offsetColor2 = AndroidUtilities.getOffsetColor(-11554882, -4629871, getTranslationX() / getMeasuredWidth(), 1.0f);
                    if (offsetColor != SwitchView.this.lastColor) {
                        SwitchView.this.linearGradient = new LinearGradient(0.0f, 0.0f, getMeasuredWidth(), 0.0f, new int[]{offsetColor, offsetColor2}, (float[]) null, Shader.TileMode.CLAMP);
                        SwitchView.this.paint.setShader(SwitchView.this.linearGradient);
                    }
                    SwitchView.this.rect.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawRoundRect(SwitchView.this.rect, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), SwitchView.this.paint);
                }
            };
            this.slidingView = view2;
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 0.0f, 14.0f, 0.0f));
            SimpleTextView simpleTextView = new SimpleTextView(context);
            this.leftTab = simpleTextView;
            int i = Theme.key_voipgroup_nameText;
            simpleTextView.setTextColor(shareAlert.getThemedColor(i));
            this.leftTab.setTextSize(13);
            this.leftTab.setLeftDrawable(R.drawable.msg_tabs_mic1);
            this.leftTab.setText(LocaleController.getString("VoipGroupInviteCanSpeak", R.string.VoipGroupInviteCanSpeak));
            this.leftTab.setGravity(17);
            addView(this.leftTab, LayoutHelper.createFrame(-1, -1.0f, 51, 14.0f, 0.0f, 0.0f, 0.0f));
            this.leftTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    ShareAlert.SwitchView.this.lambda$new$0(view3);
                }
            });
            SimpleTextView simpleTextView2 = new SimpleTextView(context);
            this.rightTab = simpleTextView2;
            simpleTextView2.setTextColor(shareAlert.getThemedColor(i));
            this.rightTab.setTextSize(13);
            this.rightTab.setLeftDrawable(R.drawable.msg_tabs_mic2);
            this.rightTab.setText(LocaleController.getString("VoipGroupInviteListenOnly", R.string.VoipGroupInviteListenOnly));
            this.rightTab.setGravity(17);
            addView(this.rightTab, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 14.0f, 0.0f));
            this.rightTab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    ShareAlert.SwitchView.this.lambda$new$1(view3);
                }
            });
        }

        public void lambda$new$0(View view) {
            switchToTab(0);
        }

        public void lambda$new$1(View view) {
            switchToTab(1);
        }

        private void switchToTab(int i) {
            if (this.currentTab == i) {
                return;
            }
            this.currentTab = i;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animator = animatorSet2;
            Animator[] animatorArr = new Animator[1];
            View view = this.slidingView;
            Property property = View.TRANSLATION_X;
            float[] fArr = new float[1];
            fArr[0] = this.currentTab == 0 ? 0.0f : view.getMeasuredWidth();
            animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
            animatorSet2.playTogether(animatorArr);
            this.animator.setDuration(180L);
            this.animator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.animator.addListener(new AnimatorListenerAdapter() {
                {
                    SwitchView.this = this;
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    SwitchView.this.animator = null;
                }
            });
            this.animator.start();
            onTabSwitch(this.currentTab);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = (View.MeasureSpec.getSize(i) - AndroidUtilities.dp(28.0f)) / 2;
            ((FrameLayout.LayoutParams) this.leftTab.getLayoutParams()).width = size;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.rightTab.getLayoutParams();
            layoutParams.width = size;
            layoutParams.leftMargin = AndroidUtilities.dp(14.0f) + size;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.slidingView.getLayoutParams();
            layoutParams2.width = size;
            AnimatorSet animatorSet = this.animator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.slidingView.setTranslationX(this.currentTab == 0 ? 0.0f : layoutParams2.width);
            super.onMeasure(i, i2);
        }
    }

    public class SearchField extends FrameLayout {
        private ImageView clearSearchImageView;
        private CloseProgressDrawable2 progressDrawable;
        private View searchBackground;
        private EditTextBoldCursor searchEditText;
        private ImageView searchIconImageView;

        public SearchField(Context context) {
            super(context);
            ShareAlert.this = r9;
            View view = new View(context);
            this.searchBackground = view;
            view.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), r9.getThemedColor(r9.darkTheme ? Theme.key_voipgroup_searchBackground : Theme.key_dialogSearchBackground)));
            addView(this.searchBackground, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 11.0f, 14.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            this.searchIconImageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.searchIconImageView.setImageResource(R.drawable.smiles_inputsearch);
            this.searchIconImageView.setColorFilter(new PorterDuffColorFilter(r9.getThemedColor(r9.darkTheme ? Theme.key_voipgroup_mutedIcon : Theme.key_dialogSearchIcon), PorterDuff.Mode.MULTIPLY));
            addView(this.searchIconImageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 11.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clearSearchImageView = imageView2;
            imageView2.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView3 = this.clearSearchImageView;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2(r9) {
                {
                    SearchField.this = this;
                }

                @Override
                protected int getCurrentColor() {
                    ShareAlert shareAlert = ShareAlert.this;
                    return shareAlert.getThemedColor(shareAlert.darkTheme ? Theme.key_voipgroup_searchPlaceholder : Theme.key_dialogSearchIcon);
                }
            };
            this.progressDrawable = closeProgressDrawable2;
            imageView3.setImageDrawable(closeProgressDrawable2);
            this.progressDrawable.setSide(AndroidUtilities.dp(7.0f));
            this.clearSearchImageView.setScaleX(0.1f);
            this.clearSearchImageView.setScaleY(0.1f);
            this.clearSearchImageView.setAlpha(0.0f);
            addView(this.clearSearchImageView, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 11.0f, 14.0f, 0.0f));
            this.clearSearchImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ShareAlert.SearchField.this.lambda$new$0(view2);
                }
            });
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.searchEditText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.searchEditText.setHintTextColor(r9.getThemedColor(r9.darkTheme ? Theme.key_voipgroup_searchPlaceholder : Theme.key_dialogSearchHint));
            this.searchEditText.setTextColor(r9.getThemedColor(r9.darkTheme ? Theme.key_voipgroup_searchText : Theme.key_dialogSearchText));
            this.searchEditText.setBackgroundDrawable(null);
            this.searchEditText.setPadding(0, 0, 0, 0);
            this.searchEditText.setMaxLines(1);
            this.searchEditText.setLines(1);
            this.searchEditText.setSingleLine(true);
            this.searchEditText.setImeOptions(268435459);
            this.searchEditText.setHint(LocaleController.getString("ShareSendTo", R.string.ShareSendTo));
            this.searchEditText.setCursorColor(r9.getThemedColor(r9.darkTheme ? Theme.key_voipgroup_searchText : Theme.key_featuredStickers_addedIcon));
            this.searchEditText.setCursorSize(AndroidUtilities.dp(20.0f));
            this.searchEditText.setCursorWidth(1.5f);
            addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 9.0f, 46.0f, 0.0f));
            this.searchEditText.addTextChangedListener(new TextWatcher(r9) {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                {
                    SearchField.this = this;
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    boolean z = SearchField.this.searchEditText.length() > 0;
                    if (z != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                        SearchField.this.clearSearchImageView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
                    }
                    if (!TextUtils.isEmpty(SearchField.this.searchEditText.getText())) {
                        ShareAlert.this.checkCurrentList(false);
                    }
                    if (ShareAlert.this.updateSearchAdapter) {
                        String obj = SearchField.this.searchEditText.getText().toString();
                        if (obj.length() != 0) {
                            if (ShareAlert.this.searchEmptyView != null) {
                                ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            }
                        } else if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.listAdapter) {
                            int currentTop = ShareAlert.this.getCurrentTop();
                            ShareAlert.this.searchEmptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            ShareAlert.this.searchEmptyView.showProgress(false, true);
                            ShareAlert.this.checkCurrentList(false);
                            ShareAlert.this.listAdapter.notifyDataSetChanged();
                            if (currentTop > 0) {
                                ShareAlert.this.layoutManager.scrollToPositionWithOffset(0, -currentTop);
                            }
                        }
                        if (ShareAlert.this.searchAdapter != null) {
                            ShareAlert.this.searchAdapter.searchDialogs(obj);
                        }
                    }
                }
            });
            this.searchEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    boolean lambda$new$1;
                    lambda$new$1 = ShareAlert.SearchField.this.lambda$new$1(textView, i, keyEvent);
                    return lambda$new$1;
                }
            });
        }

        public void lambda$new$0(View view) {
            ShareAlert.this.updateSearchAdapter = true;
            this.searchEditText.setText("");
            AndroidUtilities.showKeyboard(this.searchEditText);
        }

        public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (keyEvent != null) {
                if ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66)) {
                    AndroidUtilities.hideKeyboard(this.searchEditText);
                    return false;
                }
                return false;
            }
            return false;
        }

        public void hideKeyboard() {
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }
    }

    public static ShareAlert createShareAlert(Context context, MessageObject messageObject, String str, boolean z, String str2, boolean z2) {
        ArrayList arrayList;
        if (messageObject != null) {
            arrayList = new ArrayList();
            arrayList.add(messageObject);
        } else {
            arrayList = null;
        }
        return new ShareAlert(context, null, arrayList, str, null, z, str2, null, z2, false);
    }

    public ShareAlert(Context context, ArrayList<MessageObject> arrayList, String str, boolean z, String str2, boolean z2) {
        this(context, arrayList, str, z, str2, z2, null);
    }

    public ShareAlert(Context context, ArrayList<MessageObject> arrayList, String str, boolean z, String str2, boolean z2, Theme.ResourcesProvider resourcesProvider) {
        this(context, null, arrayList, str, null, z, str2, null, z2, false, false, resourcesProvider);
    }

    public ShareAlert(Context context, ChatActivity chatActivity, ArrayList<MessageObject> arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this(context, chatActivity, arrayList, str, str2, z, str3, str4, z2, z3, false, null);
    }

    public ShareAlert(final Context context, ChatActivity chatActivity, ArrayList<MessageObject> arrayList, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, boolean z4, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, resourcesProvider);
        this.sendingText = new String[2];
        this.shadow = new View[2];
        this.shadowAnimation = new AnimatorSet[2];
        this.selectedDialogs = new LongSparseArray<>();
        this.selectedDialogTopics = new HashMap();
        this.containerViewTop = -1;
        this.fullyShown = false;
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.linkToCopy = new String[2];
        this.recentSearchObjects = new ArrayList<>();
        new LongSparseArray();
        this.shiftDp = 4;
        this.showSendersName = true;
        this.lastOffset = Integer.MAX_VALUE;
        this.resourcesProvider = resourcesProvider;
        this.includeStory = z4;
        this.parentActivity = AndroidUtilities.findActivity(context);
        this.darkTheme = z3;
        this.parentFragment = chatActivity;
        this.shadowDrawable = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        int i = this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground;
        this.behindKeyboardColorKey = i;
        int themedColor = getThemedColor(i);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.MULTIPLY));
        fixNavigationBar(themedColor);
        this.isFullscreen = z2;
        String[] strArr = this.linkToCopy;
        strArr[0] = str3;
        strArr[1] = str4;
        this.sendingMessageObjects = arrayList;
        this.searchAdapter = new ShareSearchAdapter(context);
        this.isChannel = z;
        String[] strArr2 = this.sendingText;
        strArr2[0] = str;
        strArr2[1] = str2;
        this.useSmoothKeyboard = true;
        super.setDelegate(new BottomSheet.BottomSheetDelegate() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onOpenAnimationEnd() {
                ShareAlert.this.fullyShown = true;
            }
        });
        ArrayList<MessageObject> arrayList2 = this.sendingMessageObjects;
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i2 = 0; i2 < size; i2++) {
                MessageObject messageObject = this.sendingMessageObjects.get(i2);
                if (messageObject.isPoll()) {
                    int i3 = messageObject.isPublicPoll() ? 2 : 1;
                    this.hasPoll = i3;
                    if (i3 == 2) {
                        break;
                    }
                }
            }
        }
        if (z) {
            this.loadingLink = true;
            TLRPC$TL_channels_exportMessageLink tLRPC$TL_channels_exportMessageLink = new TLRPC$TL_channels_exportMessageLink();
            tLRPC$TL_channels_exportMessageLink.id = arrayList.get(0).getId();
            tLRPC$TL_channels_exportMessageLink.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(arrayList.get(0).messageOwner.peer_id.channel_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_channels_exportMessageLink, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    ShareAlert.this.lambda$new$1(context, tLObject, tLRPC$TL_error);
                }
            });
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private int fromOffsetTop;
            private int fromScrollY;
            private boolean fullHeight;
            private boolean lightStatusBar;
            private final AnimatedFloat pinnedToTop;
            private int previousTopOffset;
            private int toOffsetTop;
            private int toScrollY;
            private int topOffset;
            private boolean ignoreLayout = false;
            private RectF rect1 = new RectF();

            {
                ShareAlert.this = this;
                this.adjustPanLayoutHelper = new AdjustPanLayoutHelper(this) {
                    {
                        AnonymousClass2.this = this;
                    }

                    @Override
                    public void onTransitionStart(boolean z5, int i4) {
                        super.onTransitionStart(z5, i4);
                        if (ShareAlert.this.previousScrollOffsetY == ShareAlert.this.scrollOffsetY) {
                            AnonymousClass2.this.fromScrollY = -1;
                        } else {
                            AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                            anonymousClass2.fromScrollY = ShareAlert.this.previousScrollOffsetY;
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            anonymousClass22.toScrollY = ShareAlert.this.scrollOffsetY;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            AnonymousClass2 anonymousClass23 = AnonymousClass2.this;
                            ShareAlert.this.scrollOffsetY = anonymousClass23.fromScrollY;
                        }
                        if (AnonymousClass2.this.topOffset != AnonymousClass2.this.previousTopOffset) {
                            AnonymousClass2.this.fromOffsetTop = 0;
                            AnonymousClass2.this.toOffsetTop = 0;
                            ShareAlert.this.panTranslationMoveLayout = true;
                            if (!z5) {
                                AnonymousClass2 anonymousClass24 = AnonymousClass2.this;
                                AnonymousClass2.access$3420(anonymousClass24, anonymousClass24.topOffset - AnonymousClass2.this.previousTopOffset);
                            } else {
                                AnonymousClass2 anonymousClass25 = AnonymousClass2.this;
                                AnonymousClass2.access$3412(anonymousClass25, anonymousClass25.topOffset - AnonymousClass2.this.previousTopOffset);
                            }
                            AnonymousClass2 anonymousClass26 = AnonymousClass2.this;
                            ShareAlert.this.scrollOffsetY = z5 ? anonymousClass26.fromScrollY : anonymousClass26.toScrollY;
                        } else {
                            AnonymousClass2.this.fromOffsetTop = -1;
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.currentPanTranslationY + ShareAlert.this.scrollOffsetY);
                        invalidate();
                    }

                    @Override
                    public void onTransitionEnd() {
                        super.onTransitionEnd();
                        ShareAlert.this.panTranslationMoveLayout = false;
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                        ShareAlert.this.gridView.setTopGlowOffset(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY);
                        ShareAlert.this.gridView.setTranslationY(0.0f);
                        ShareAlert.this.searchGridView.setTranslationY(0.0f);
                    }

                    @Override
                    public void onPanTranslationUpdate(float f, float f2, boolean z5) {
                        super.onPanTranslationUpdate(f, f2, z5);
                        for (int i4 = 0; i4 < ((BottomSheet) ShareAlert.this).containerView.getChildCount(); i4++) {
                            if (((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.pickerBottomLayout && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.bulletinContainer && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.shadow[1] && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.sharesCountLayout && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.frameLayout2 && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.writeButtonContainer && ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4) != ShareAlert.this.selectedCountView) {
                                ((BottomSheet) ShareAlert.this).containerView.getChildAt(i4).setTranslationY(f);
                            }
                        }
                        ShareAlert.this.currentPanTranslationY = f;
                        if (AnonymousClass2.this.fromScrollY == -1) {
                            if (AnonymousClass2.this.fromOffsetTop != -1) {
                                AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                float f3 = 1.0f - f2;
                                ShareAlert.this.scrollOffsetY = (int) ((anonymousClass2.fromOffsetTop * f3) + (AnonymousClass2.this.toOffsetTop * f2));
                                if (!z5) {
                                    f3 = f2;
                                }
                                if (z5) {
                                    ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY - ((AnonymousClass2.this.fromOffsetTop - AnonymousClass2.this.toOffsetTop) * f2));
                                } else {
                                    ShareAlert.this.gridView.setTranslationY(ShareAlert.this.currentPanTranslationY + ((AnonymousClass2.this.toOffsetTop - AnonymousClass2.this.fromOffsetTop) * f3));
                                }
                            }
                        } else {
                            if (!z5) {
                                f2 = 1.0f - f2;
                            }
                            AnonymousClass2 anonymousClass22 = AnonymousClass2.this;
                            float f4 = 1.0f - f2;
                            ShareAlert.this.scrollOffsetY = (int) ((anonymousClass22.fromScrollY * f4) + (AnonymousClass2.this.toScrollY * f2));
                            float f5 = ShareAlert.this.currentPanTranslationY + ((AnonymousClass2.this.fromScrollY - AnonymousClass2.this.toScrollY) * f4);
                            ShareAlert.this.gridView.setTranslationY(f5);
                            if (z5) {
                                ShareAlert.this.searchGridView.setTranslationY(f5);
                            } else {
                                ShareAlert.this.searchGridView.setTranslationY(f5 + ShareAlert.this.gridView.getPaddingTop());
                            }
                        }
                        ShareAlert.this.gridView.setTopGlowOffset((int) (ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY));
                        ShareAlert.this.frameLayout.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.searchEmptyView.setTranslationY(ShareAlert.this.scrollOffsetY + ShareAlert.this.currentPanTranslationY);
                        ShareAlert.this.frameLayout2.invalidate();
                        ShareAlert shareAlert = ShareAlert.this;
                        shareAlert.setCurrentPanTranslationY(shareAlert.currentPanTranslationY);
                        invalidate();
                    }

                    @Override
                    protected boolean heightAnimationEnabled() {
                        if (ShareAlert.this.isDismissed() || !ShareAlert.this.fullyShown) {
                            return false;
                        }
                        return !ShareAlert.this.commentTextView.isPopupVisible();
                    }
                };
                this.lightStatusBar = AndroidUtilities.computePerceivedBrightness(this.getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground)) > 0.721f;
                this.pinnedToTop = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
            }

            static int access$3412(AnonymousClass2 anonymousClass2, int i4) {
                int i5 = anonymousClass2.toOffsetTop + i4;
                anonymousClass2.toOffsetTop = i5;
                return i5;
            }

            static int access$3420(AnonymousClass2 anonymousClass2, int i4) {
                int i5 = anonymousClass2.toOffsetTop - i4;
                anonymousClass2.toOffsetTop = i5;
                return i5;
            }

            @Override
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                this.adjustPanLayoutHelper.setResizableView(this);
                this.adjustPanLayoutHelper.onAttach();
            }

            @Override
            public void onDetachedFromWindow() {
                super.onDetachedFromWindow();
                this.adjustPanLayoutHelper.onDetach();
            }

            @Override
            protected void onMeasure(int i4, int i5) {
                int size2;
                int dp;
                if (getLayoutParams().height > 0) {
                    size2 = getLayoutParams().height;
                } else {
                    size2 = View.MeasureSpec.getSize(i5);
                }
                ShareAlert.this.layoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                ShareAlert.this.searchLayoutManager.setNeedFixGap(getLayoutParams().height <= 0);
                if (Build.VERSION.SDK_INT >= 21 && !((BottomSheet) ShareAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) ShareAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) ShareAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size2 - getPaddingTop();
                int dp2 = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil(Math.max(ShareAlert.this.searchAdapter.getItemCount(), ShareAlert.this.listAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (ShareAlert.this.topicsGridView.getVisibility() != 8 && (dp = AndroidUtilities.dp(103.0f) + AndroidUtilities.dp(48.0f) + (Math.max(2, (int) Math.ceil((ShareAlert.this.shareTopicsAdapter.getItemCount() - 1) / 4.0f)) * AndroidUtilities.dp(103.0f)) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop) > dp2) {
                    dp2 = AndroidUtilities.lerp(dp2, dp, ShareAlert.this.topicsGridView.getAlpha());
                }
                int dp3 = (dp2 < paddingTop ? 0 : paddingTop - ((paddingTop / 5) * 3)) + AndroidUtilities.dp(8.0f);
                if (ShareAlert.this.gridView.getPaddingTop() != dp3) {
                    this.ignoreLayout = true;
                    ShareAlert.this.gridView.setPadding(0, dp3, 0, AndroidUtilities.dp(48.0f));
                    ShareAlert.this.topicsGridView.setPadding(0, dp3, 0, AndroidUtilities.dp(48.0f));
                    this.ignoreLayout = false;
                }
                if (((BottomSheet) ShareAlert.this).keyboardVisible && getLayoutParams().height <= 0 && ShareAlert.this.searchGridView.getPaddingTop() != dp3) {
                    this.ignoreLayout = true;
                    ShareAlert.this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
                    this.ignoreLayout = false;
                }
                boolean z5 = dp2 >= size2;
                this.fullHeight = z5;
                this.topOffset = z5 ? 0 : size2 - dp2;
                this.ignoreLayout = true;
                ShareAlert.this.checkCurrentList(false);
                this.ignoreLayout = false;
                setMeasuredDimension(View.MeasureSpec.getSize(i4), size2);
                onMeasureInternal(i4, View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            }

            private void onMeasureInternal(int i4, int i5) {
                int size2 = View.MeasureSpec.getSize(i4);
                int size3 = View.MeasureSpec.getSize(i5);
                int i6 = size2 - (((BottomSheet) ShareAlert.this).backgroundPaddingLeft * 2);
                if (!ShareAlert.this.commentTextView.isWaitingForKeyboardOpen() && AndroidUtilities.dp(20.0f) >= 0 && !ShareAlert.this.commentTextView.isPopupShowing() && !ShareAlert.this.commentTextView.isAnimatePopupClosing()) {
                    this.ignoreLayout = true;
                    ShareAlert.this.commentTextView.hideEmojiView();
                    this.ignoreLayout = false;
                }
                this.ignoreLayout = true;
                if (AndroidUtilities.dp(20.0f) < 0) {
                    ShareAlert.this.commentTextView.hideEmojiView();
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(8);
                        if (ShareAlert.this.sharesCountLayout != null) {
                            ShareAlert.this.sharesCountLayout.setVisibility(8);
                        }
                    }
                } else {
                    if (!AndroidUtilities.isInMultiwindow) {
                        size3 -= ((BottomSheet) ShareAlert.this).keyboardVisible ? 0 : ShareAlert.this.commentTextView.getEmojiPadding();
                        i5 = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                    }
                    int i7 = ShareAlert.this.commentTextView.isPopupShowing() ? 8 : 0;
                    if (ShareAlert.this.pickerBottomLayout != null) {
                        ShareAlert.this.pickerBottomLayout.setVisibility(i7);
                        if (ShareAlert.this.sharesCountLayout != null) {
                            ShareAlert.this.sharesCountLayout.setVisibility(i7);
                        }
                    }
                }
                this.ignoreLayout = false;
                int childCount = getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View childAt = getChildAt(i8);
                    if (childAt != null && childAt.getVisibility() != 8) {
                        if (ShareAlert.this.commentTextView != null && ShareAlert.this.commentTextView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow || AndroidUtilities.isTablet()) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(AndroidUtilities.isTablet() ? 200.0f : 320.0f), (size3 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec((size3 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(i6, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            measureChildWithMargins(childAt, i4, 0, i5, 0);
                        }
                    }
                }
            }

            @Override
            public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.AnonymousClass2.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (!this.fullHeight) {
                    if (motionEvent.getAction() == 0 && motionEvent.getY() < this.topOffset - AndroidUtilities.dp(30.0f)) {
                        ShareAlert.this.dismiss();
                        return true;
                    }
                } else if (motionEvent.getAction() == 0 && ShareAlert.this.scrollOffsetY != 0 && motionEvent.getY() < ShareAlert.this.scrollOffsetY - AndroidUtilities.dp(30.0f)) {
                    ShareAlert.this.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !ShareAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onDraw(Canvas canvas) {
                float f;
                canvas.save();
                canvas.translate(0.0f, ShareAlert.this.currentPanTranslationY);
                int dp = (ShareAlert.this.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) + AndroidUtilities.dp(6.0f) + this.topOffset;
                ShareAlert shareAlert = ShareAlert.this;
                int i4 = shareAlert.containerViewTop = ((shareAlert.scrollOffsetY - ((BottomSheet) ShareAlert.this).backgroundPaddingTop) - AndroidUtilities.dp(13.0f)) + this.topOffset;
                int measuredHeight = getMeasuredHeight() + AndroidUtilities.dp(60.0f) + ((BottomSheet) ShareAlert.this).backgroundPaddingTop;
                if (((BottomSheet) ShareAlert.this).isFullscreen || Build.VERSION.SDK_INT < 21) {
                    f = 0.0f;
                } else {
                    dp += AndroidUtilities.statusBarHeight;
                    f = this.pinnedToTop.set(this.fullHeight && ((BottomSheet) ShareAlert.this).backgroundPaddingTop + i4 < AndroidUtilities.statusBarHeight);
                    i4 = AndroidUtilities.lerp(i4 + AndroidUtilities.statusBarHeight, -((BottomSheet) ShareAlert.this).backgroundPaddingTop, f);
                }
                ShareAlert.this.shadowDrawable.setBounds(0, i4, getMeasuredWidth(), measuredHeight);
                ShareAlert.this.shadowDrawable.draw(canvas);
                FrameLayout frameLayout = ShareAlert.this.bulletinContainer2;
                if (frameLayout != null) {
                    if (i4 <= AndroidUtilities.statusBarHeight && frameLayout.getChildCount() > 0) {
                        ShareAlert.this.bulletinContainer2.setTranslationY(0.0f);
                        Bulletin visibleBulletin = Bulletin.getVisibleBulletin();
                        if (visibleBulletin != null) {
                            if (visibleBulletin.getLayout() != null) {
                                visibleBulletin.getLayout().setTop(true);
                            }
                            visibleBulletin.hide();
                        }
                    } else {
                        ShareAlert shareAlert2 = ShareAlert.this;
                        shareAlert2.bulletinContainer2.setTranslationY(Math.max(0, ((i4 + ((BottomSheet) shareAlert2).backgroundPaddingTop) - ShareAlert.this.bulletinContainer2.getTop()) - ShareAlert.this.bulletinContainer2.getMeasuredHeight()));
                    }
                }
                if (f < 1.0f) {
                    int dp2 = AndroidUtilities.dp(36.0f);
                    this.rect1.set((getMeasuredWidth() - dp2) / 2, dp, (getMeasuredWidth() + dp2) / 2, dp + AndroidUtilities.dp(4.0f));
                    Paint paint = Theme.dialogs_onlineCirclePaint;
                    ShareAlert shareAlert3 = ShareAlert.this;
                    paint.setColor(shareAlert3.getThemedColor(shareAlert3.darkTheme ? Theme.key_voipgroup_scrollUp : Theme.key_sheet_scrollUp));
                    Paint paint2 = Theme.dialogs_onlineCirclePaint;
                    paint2.setAlpha((int) (paint2.getAlpha() * (1.0f - f)));
                    canvas.drawRoundRect(this.rect1, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
                if (Build.VERSION.SDK_INT >= 23) {
                    int systemUiVisibility = getSystemUiVisibility();
                    boolean z5 = this.lightStatusBar && ((float) 0) > ((float) AndroidUtilities.statusBarHeight) * 0.5f;
                    if (z5 != ((systemUiVisibility & 8192) > 0)) {
                        setSystemUiVisibility(z5 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                    }
                }
                canvas.restore();
                this.previousTopOffset = this.topOffset;
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipRect(0.0f, getPaddingTop() + ShareAlert.this.currentPanTranslationY, getMeasuredWidth(), getMeasuredHeight() + ShareAlert.this.currentPanTranslationY + AndroidUtilities.dp(50.0f));
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        this.containerView.setClipChildren(false);
        ViewGroup viewGroup = this.containerView;
        int i4 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i4, 0, i4, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.frameLayout = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground));
        if (this.darkTheme && this.linkToCopy[1] != null) {
            SwitchView switchView = new SwitchView(context) {
                {
                    ShareAlert.this = this;
                }

                @Override
                protected void onTabSwitch(int i5) {
                    if (ShareAlert.this.pickerBottomLayout == null) {
                        return;
                    }
                    if (i5 == 0) {
                        ShareAlert.this.pickerBottomLayout.setText(LocaleController.getString("VoipGroupCopySpeakerLink", R.string.VoipGroupCopySpeakerLink).toUpperCase());
                    } else {
                        ShareAlert.this.pickerBottomLayout.setText(LocaleController.getString("VoipGroupCopyListenLink", R.string.VoipGroupCopyListenLink).toUpperCase());
                    }
                }
            };
            this.switchView = switchView;
            this.frameLayout.addView(switchView, LayoutHelper.createFrame(-1, 36.0f, 51, 0.0f, 11.0f, 0.0f, 0.0f));
        }
        SearchField searchField = new SearchField(context);
        this.searchView = searchField;
        this.frameLayout.addView(searchField, LayoutHelper.createFrame(-1, 58, 83));
        ActionBar actionBar = new ActionBar(context);
        this.topicsBackActionBar = actionBar;
        actionBar.setOccupyStatusBar(false);
        this.topicsBackActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.topicsBackActionBar.setTitleColor(getThemedColor(Theme.key_dialogTextBlack));
        this.topicsBackActionBar.setSubtitleColor(getThemedColor(Theme.key_dialogTextGray2));
        this.topicsBackActionBar.setItemsColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2), false);
        this.topicsBackActionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
        this.topicsBackActionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onItemClick(int i5) {
                ShareAlert.this.onBackPressed();
            }
        });
        this.topicsBackActionBar.setVisibility(8);
        this.frameLayout.addView(this.topicsBackActionBar, LayoutHelper.createFrame(-1, 58, 83));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
        this.topicsGridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 4);
        this.topicsLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.topicsLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            {
                ShareAlert.this = this;
            }

            @Override
            public int getSpanSize(int i5) {
                if (i5 == 0) {
                    return ShareAlert.this.topicsLayoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.topicsGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (i6 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        RecyclerListView recyclerListView2 = this.topicsGridView;
        ShareTopicsAdapter shareTopicsAdapter = new ShareTopicsAdapter(context);
        this.shareTopicsAdapter = shareTopicsAdapter;
        recyclerListView2.setAdapter(shareTopicsAdapter);
        this.topicsGridView.setGlowColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogScrollGlow));
        this.topicsGridView.setVerticalScrollBarEnabled(false);
        this.topicsGridView.setHorizontalScrollBarEnabled(false);
        this.topicsGridView.setOverScrollMode(2);
        this.topicsGridView.setSelectorDrawableColor(0);
        this.topicsGridView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Integer lambda$new$2;
                lambda$new$2 = ShareAlert.lambda$new$2((Integer) obj);
                return lambda$new$2;
            }
        });
        this.topicsGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.topicsGridView.setClipToPadding(false);
        this.topicsGridView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(android.graphics.Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
            }
        });
        this.topicsGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                ShareAlert.this.lambda$new$3(view, i5);
            }
        });
        this.topicsGridView.setVisibility(8);
        this.containerView.addView(this.topicsGridView, LayoutHelper.createFrame(-1, -1, 51));
        RecyclerListView recyclerListView3 = new RecyclerListView(context, resourcesProvider) {
            {
                ShareAlert.this = this;
            }

            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.gridView = recyclerListView3;
        recyclerListView3.setSelectorDrawableColor(0);
        this.gridView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Integer lambda$new$4;
                lambda$new$4 = ShareAlert.lambda$new$4((Integer) obj);
                return lambda$new$4;
            }
        });
        this.gridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.gridView.setClipToPadding(false);
        RecyclerListView recyclerListView4 = this.gridView;
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(getContext(), 4);
        this.layoutManager = gridLayoutManager2;
        recyclerListView4.setLayoutManager(gridLayoutManager2);
        this.layoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            {
                ShareAlert.this = this;
            }

            @Override
            public int getSpanSize(int i5) {
                if (i5 == 0) {
                    return ShareAlert.this.layoutManager.getSpanCount();
                }
                return 1;
            }
        });
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setOverScrollMode(2);
        this.gridView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(android.graphics.Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
            }
        });
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        RecyclerListView recyclerListView5 = this.gridView;
        ShareDialogsAdapter shareDialogsAdapter = new ShareDialogsAdapter(context);
        this.listAdapter = shareDialogsAdapter;
        recyclerListView5.setAdapter(shareDialogsAdapter);
        this.gridView.setGlowColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogScrollGlow));
        this.gridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                ShareAlert.this.lambda$new$5(view, i5);
            }
        });
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (i6 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
                if (Bulletin.getVisibleBulletin() == null || Bulletin.getVisibleBulletin().getLayout() == null || !(Bulletin.getVisibleBulletin().getLayout().getParent() instanceof View) || ((View) Bulletin.getVisibleBulletin().getLayout().getParent()).getParent() != ShareAlert.this.bulletinContainer2) {
                    return;
                }
                Bulletin.hideVisible();
            }
        });
        RecyclerListView recyclerListView6 = new RecyclerListView(context, resourcesProvider) {
            {
                ShareAlert.this = this;
            }

            @Override
            protected boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f) + (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0)));
            }

            @Override
            public void draw(Canvas canvas) {
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.save();
                    canvas.clipRect(0, ShareAlert.this.scrollOffsetY + AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 58.0f : 111.0f), getWidth(), getHeight());
                }
                super.draw(canvas);
                if (ShareAlert.this.topicsGridView.getVisibility() != 8) {
                    canvas.restore();
                }
            }
        };
        this.searchGridView = recyclerListView6;
        recyclerListView6.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Integer lambda$new$6;
                lambda$new$6 = ShareAlert.lambda$new$6((Integer) obj);
                return lambda$new$6;
            }
        });
        this.searchGridView.setSelectorDrawableColor(0);
        this.searchGridView.setPadding(0, 0, 0, AndroidUtilities.dp(48.0f));
        this.searchGridView.setClipToPadding(false);
        RecyclerListView recyclerListView7 = this.searchGridView;
        FillLastGridLayoutManager fillLastGridLayoutManager = new FillLastGridLayoutManager(getContext(), 4, 0, this.searchGridView);
        this.searchLayoutManager = fillLastGridLayoutManager;
        recyclerListView7.setLayoutManager(fillLastGridLayoutManager);
        this.searchLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            {
                ShareAlert.this = this;
            }

            @Override
            public int getSpanSize(int i5) {
                return ShareAlert.this.searchAdapter.getSpanSize(4, i5);
            }
        });
        this.searchGridView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                ShareAlert.this.lambda$new$7(view, i5);
            }
        });
        this.searchGridView.setHasFixedSize(true);
        this.searchGridView.setItemAnimator(null);
        this.searchGridView.setHorizontalScrollBarEnabled(false);
        this.searchGridView.setVerticalScrollBarEnabled(false);
        this.searchGridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                if (i6 != 0) {
                    ShareAlert.this.updateLayout();
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.previousScrollOffsetY = shareAlert.scrollOffsetY;
                }
            }
        });
        this.searchGridView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(android.graphics.Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerView.getChildViewHolder(view);
                if (holder != null) {
                    if (holder.getItemViewType() != 5) {
                        rect.right = 0;
                        rect.left = 0;
                        return;
                    }
                    int adapterPosition = holder.getAdapterPosition() % 4;
                    rect.left = adapterPosition == 0 ? 0 : AndroidUtilities.dp(4.0f);
                    rect.right = adapterPosition != 3 ? AndroidUtilities.dp(4.0f) : 0;
                    return;
                }
                rect.left = AndroidUtilities.dp(4.0f);
                rect.right = AndroidUtilities.dp(4.0f);
            }
        });
        this.searchGridView.setAdapter(this.searchAdapter);
        this.searchGridView.setGlowColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogScrollGlow));
        this.recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.searchGridView, true);
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider);
        flickerLoadingView.setViewType(12);
        if (this.darkTheme) {
            flickerLoadingView.setColors(Theme.key_voipgroup_inviteMembersBackground, Theme.key_voipgroup_searchBackground, -1);
        }
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 1, resourcesProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.addView(flickerLoadingView, 0);
        this.searchEmptyView.setAnimateLayoutChange(true);
        this.searchEmptyView.showProgress(false, false);
        if (this.darkTheme) {
            this.searchEmptyView.title.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
        }
        this.searchEmptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
        this.searchGridView.setEmptyView(this.searchEmptyView);
        this.searchGridView.setHideIfEmpty(false);
        this.searchGridView.setAnimateEmptyView(true, 0);
        this.containerView.addView(this.searchEmptyView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 52.0f, 0.0f, 0.0f));
        this.containerView.addView(this.searchGridView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 51);
        layoutParams.topMargin = AndroidUtilities.dp((!this.darkTheme || this.linkToCopy[1] == null) ? 58.0f : 111.0f);
        this.shadow[0] = new View(context);
        View view = this.shadow[0];
        int i5 = Theme.key_dialogShadowLine;
        view.setBackgroundColor(getThemedColor(i5));
        this.shadow[0].setAlpha(0.0f);
        this.shadow[0].setTag(1);
        this.containerView.addView(this.shadow[0], layoutParams);
        this.containerView.addView(this.frameLayout, LayoutHelper.createFrame(-1, (!this.darkTheme || this.linkToCopy[1] == null) ? 58 : 111, 51));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight(), 83);
        layoutParams2.bottomMargin = AndroidUtilities.dp(48.0f);
        this.shadow[1] = new View(context);
        this.shadow[1].setBackgroundColor(getThemedColor(i5));
        this.containerView.addView(this.shadow[1], layoutParams2);
        if (this.isChannel || this.linkToCopy[0] != null) {
            TextView textView = new TextView(context);
            this.pickerBottomLayout = textView;
            textView.setBackgroundDrawable(Theme.createSelectorWithBackgroundDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground), getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : Theme.key_listSelector)));
            this.pickerBottomLayout.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
            this.pickerBottomLayout.setTextSize(1, 14.0f);
            this.pickerBottomLayout.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            this.pickerBottomLayout.setTypeface(AndroidUtilities.bold());
            this.pickerBottomLayout.setGravity(17);
            if (this.darkTheme && this.linkToCopy[1] != null) {
                this.pickerBottomLayout.setText(LocaleController.getString("VoipGroupCopySpeakerLink", R.string.VoipGroupCopySpeakerLink).toUpperCase());
            } else {
                this.pickerBottomLayout.setText(LocaleController.getString("CopyLink", R.string.CopyLink).toUpperCase());
            }
            this.pickerBottomLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ShareAlert.this.lambda$new$8(view2);
                }
            });
            this.containerView.addView(this.pickerBottomLayout, LayoutHelper.createFrame(-1, 48, 83));
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && ChatObject.hasAdminRights(chatActivity2.getCurrentChat()) && this.sendingMessageObjects.size() > 0 && this.sendingMessageObjects.get(0).messageOwner.forwards > 0) {
                final MessageObject messageObject2 = this.sendingMessageObjects.get(0);
                if (!messageObject2.isForwarded()) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    this.sharesCountLayout = linearLayout;
                    linearLayout.setOrientation(0);
                    this.sharesCountLayout.setGravity(16);
                    this.sharesCountLayout.setBackgroundDrawable(Theme.createSelectorDrawable(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : Theme.key_listSelector), 2));
                    this.containerView.addView(this.sharesCountLayout, LayoutHelper.createFrame(-2, 48.0f, 85, 6.0f, 0.0f, -6.0f, 0.0f));
                    this.sharesCountLayout.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            ShareAlert.this.lambda$new$9(messageObject2, view2);
                        }
                    });
                    ImageView imageView = new ImageView(context);
                    imageView.setImageResource(R.drawable.share_arrow);
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2), PorterDuff.Mode.MULTIPLY));
                    this.sharesCountLayout.addView(imageView, LayoutHelper.createLinear(-2, -1, 16, 20, 0, 0, 0));
                    TextView textView2 = new TextView(context);
                    textView2.setText(String.format("%d", Integer.valueOf(messageObject2.messageOwner.forwards)));
                    textView2.setTextSize(1, 14.0f);
                    textView2.setTextColor(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listeningText : Theme.key_dialogTextBlue2));
                    textView2.setGravity(16);
                    textView2.setTypeface(AndroidUtilities.bold());
                    this.sharesCountLayout.addView(textView2, LayoutHelper.createLinear(-2, -1, 16, 8, 0, 20, 0));
                }
            }
        } else {
            this.shadow[1].setAlpha(0.0f);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, this.pickerBottomLayout != null ? 48.0f : 0.0f));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bulletinContainer2 = frameLayout3;
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, -2.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        AnonymousClass16 anonymousClass16 = new AnonymousClass16(context);
        this.frameLayout2 = anonymousClass16;
        anonymousClass16.setWillNotDraw(false);
        this.frameLayout2.setAlpha(0.0f);
        this.frameLayout2.setVisibility(4);
        this.containerView.addView(this.frameLayout2, LayoutHelper.createFrame(-1, -2, 83));
        this.frameLayout2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                boolean lambda$new$10;
                lambda$new$10 = ShareAlert.lambda$new$10(view2, motionEvent);
                return lambda$new$10;
            }
        });
        AnonymousClass17 anonymousClass17 = new AnonymousClass17(context, this.sizeNotifierFrameLayout, null, 1, true, resourcesProvider);
        this.commentTextView = anonymousClass17;
        if (this.darkTheme) {
            EditTextCaption editText = anonymousClass17.getEditText();
            int i6 = Theme.key_voipgroup_nameText;
            editText.setTextColor(getThemedColor(i6));
            this.commentTextView.getEditText().setCursorColor(getThemedColor(i6));
        }
        this.commentTextView.setBackgroundColor(themedColor);
        this.commentTextView.setHint(LocaleController.getString("ShareComment", R.string.ShareComment));
        this.commentTextView.onResume();
        this.commentTextView.setPadding(0, 0, AndroidUtilities.dp(84.0f), 0);
        this.frameLayout2.addView(this.commentTextView, LayoutHelper.createFrame(-1, -2, 51));
        this.frameLayout2.setClipChildren(false);
        this.frameLayout2.setClipToPadding(false);
        this.commentTextView.setClipChildren(false);
        FrameLayout frameLayout4 = new FrameLayout(context) {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(LocaleController.formatPluralString("AccDescrShareInChats", ShareAlert.this.selectedDialogs.size(), new Object[0]));
                accessibilityNodeInfo.setClassName(Button.class.getName());
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.setClickable(true);
            }
        };
        this.writeButtonContainer = frameLayout4;
        frameLayout4.setFocusable(true);
        this.writeButtonContainer.setFocusableInTouchMode(true);
        this.writeButtonContainer.setVisibility(4);
        this.writeButtonContainer.setScaleX(0.2f);
        this.writeButtonContainer.setScaleY(0.2f);
        this.writeButtonContainer.setAlpha(0.0f);
        this.containerView.addView(this.writeButtonContainer, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 6.0f, 10.0f));
        final ImageView imageView2 = new ImageView(context);
        int dp = AndroidUtilities.dp(56.0f);
        int i7 = Theme.key_dialogFloatingButton;
        int themedColor2 = getThemedColor(i7);
        int i8 = Build.VERSION.SDK_INT;
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(dp, themedColor2, getThemedColor(i8 >= 21 ? Theme.key_dialogFloatingButtonPressed : i7));
        if (i8 < 21) {
            Drawable mutate = context.getResources().getDrawable(R.drawable.floating_shadow_profile).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        imageView2.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        imageView2.setImageResource(R.drawable.attach_send);
        imageView2.setImportantForAccessibility(2);
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogFloatingIcon), PorterDuff.Mode.MULTIPLY));
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        if (i8 >= 21) {
            imageView2.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view2, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
        }
        this.writeButtonContainer.addView(imageView2, LayoutHelper.createFrame(i8 >= 21 ? 56 : 60, i8 < 21 ? 60.0f : 56.0f, 51, i8 >= 21 ? 2.0f : 0.0f, 0.0f, 0.0f, 0.0f));
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ShareAlert.this.lambda$new$11(view2);
            }
        });
        imageView2.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view2) {
                boolean lambda$new$12;
                lambda$new$12 = ShareAlert.this.lambda$new$12(imageView2, view2);
                return lambda$new$12;
            }
        });
        this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        this.textPaint.setTypeface(AndroidUtilities.bold());
        View view2 = new View(context) {
            {
                ShareAlert.this = this;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                String format = String.format("%d", Integer.valueOf(Math.max(1, ShareAlert.this.selectedDialogs.size())));
                int ceil = (int) Math.ceil(ShareAlert.this.textPaint.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                int measuredHeight = getMeasuredHeight() / 2;
                ShareAlert.this.textPaint.setColor(ShareAlert.this.getThemedColor(Theme.key_dialogRoundCheckBoxCheck));
                Paint paint = ShareAlert.this.paint;
                ShareAlert shareAlert = ShareAlert.this;
                paint.setColor(shareAlert.getThemedColor(shareAlert.darkTheme ? Theme.key_voipgroup_inviteMembersBackground : Theme.key_dialogBackground));
                int i9 = max / 2;
                int i10 = measuredWidth - i9;
                int i11 = i9 + measuredWidth;
                ShareAlert.this.rect.set(i10, 0.0f, i11, getMeasuredHeight());
                canvas.drawRoundRect(ShareAlert.this.rect, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ShareAlert.this.paint);
                ShareAlert.this.paint.setColor(ShareAlert.this.getThemedColor(Theme.key_dialogFloatingButton));
                ShareAlert.this.rect.set(i10 + AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), i11 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ShareAlert.this.rect, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ShareAlert.this.paint);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), ShareAlert.this.textPaint);
            }
        };
        this.selectedCountView = view2;
        view2.setAlpha(0.0f);
        this.selectedCountView.setScaleX(0.2f);
        this.selectedCountView.setScaleY(0.2f);
        this.containerView.addView(this.selectedCountView, LayoutHelper.createFrame(42, 24.0f, 85, 0.0f, 0.0f, -8.0f, 9.0f));
        updateSelectedCount(0);
        DialogsActivity.loadDialogs(AccountInstance.getInstance(this.currentAccount));
        if (this.listAdapter.dialogs.isEmpty()) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        }
        DialogsSearchAdapter.loadRecentSearch(this.currentAccount, 0, new DialogsSearchAdapter.OnRecentSearchLoaded() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void setRecentSearch(ArrayList<DialogsSearchAdapter.RecentSearchObject> arrayList3, LongSparseArray<DialogsSearchAdapter.RecentSearchObject> longSparseArray) {
                if (arrayList3 != null) {
                    int i9 = 0;
                    while (i9 < arrayList3.size()) {
                        TLObject tLObject = arrayList3.get(i9).object;
                        if ((tLObject instanceof TLRPC$Chat) && !ChatObject.canWriteToChat((TLRPC$Chat) tLObject)) {
                            arrayList3.remove(i9);
                            i9--;
                        }
                        i9++;
                    }
                }
                ShareAlert.this.recentSearchObjects = arrayList3;
                ShareAlert.this.recentSearchObjectsById = longSparseArray;
                for (int i10 = 0; i10 < ShareAlert.this.recentSearchObjects.size(); i10++) {
                    DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i10);
                    TLObject tLObject2 = recentSearchObject.object;
                    if (tLObject2 instanceof TLRPC$User) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC$User) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC$Chat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC$Chat) recentSearchObject.object, true);
                    } else if (tLObject2 instanceof TLRPC$EncryptedChat) {
                        MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putEncryptedChat((TLRPC$EncryptedChat) recentSearchObject.object, true);
                    }
                }
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
        });
        MediaDataController.getInstance(this.currentAccount).loadHints(true);
        AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 1.0f, false);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false, 1.0f, false);
    }

    public void lambda$new$1(final Context context, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ShareAlert.this.lambda$new$0(tLObject, context);
            }
        });
    }

    public void lambda$new$0(TLObject tLObject, Context context) {
        if (tLObject != null) {
            this.exportedMessageLink = (TLRPC$TL_exportedMessageLink) tLObject;
            if (this.copyLinkOnEnd) {
                copyLink(context);
            }
        }
        this.loadingLink = false;
    }

    public static Integer lambda$new$2(Integer num) {
        return 0;
    }

    public void lambda$new$3(View view, int i) {
        TLRPC$Dialog tLRPC$Dialog;
        TLRPC$TL_forumTopic item = this.shareTopicsAdapter.getItem(i);
        if (item == null || (tLRPC$Dialog = this.selectedTopicDialog) == null) {
            return;
        }
        this.selectedDialogs.put(tLRPC$Dialog.id, tLRPC$Dialog);
        this.selectedDialogTopics.put(tLRPC$Dialog, item);
        updateSelectedCount(2);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            if (((TLRPC$Dialog) this.listAdapter.dialogsMap.get(tLRPC$Dialog.id)) == null) {
                this.listAdapter.dialogsMap.put(tLRPC$Dialog.id, tLRPC$Dialog);
                this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty(), tLRPC$Dialog);
            }
            this.listAdapter.notifyDataSetChanged();
            this.updateSearchAdapter = false;
            this.searchView.searchEditText.setText("");
            checkCurrentList(false);
        }
        for (int i2 = 0; i2 < getMainGridView().getChildCount(); i2++) {
            View childAt = getMainGridView().getChildAt(i2);
            if (childAt instanceof ShareDialogCell) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) childAt;
                if (shareDialogCell.getCurrentDialog() == this.selectedTopicDialog.id && shareDialogCell != null) {
                    shareDialogCell.setTopic(item, true);
                    shareDialogCell.setChecked(true, true);
                }
            }
        }
        collapseTopics();
    }

    public static Integer lambda$new$4(Integer num) {
        return 0;
    }

    public void lambda$new$5(View view, int i) {
        TLRPC$Dialog item;
        if (i >= 0 && (item = this.listAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public static Integer lambda$new$6(Integer num) {
        return 0;
    }

    public void lambda$new$7(View view, int i) {
        TLRPC$Dialog item;
        if (i >= 0 && (item = this.searchAdapter.getItem(i)) != null) {
            selectDialog(view, item);
        }
    }

    public void lambda$new$8(View view) {
        if (this.selectedDialogs.size() == 0) {
            if (this.isChannel || this.linkToCopy[0] != null) {
                dismiss();
                if (this.linkToCopy[0] == null && this.loadingLink) {
                    this.copyLinkOnEnd = true;
                    Toast.makeText(getContext(), LocaleController.getString("Loading", R.string.Loading), 0).show();
                    return;
                }
                copyLink(getContext());
            }
        }
    }

    public void lambda$new$9(MessageObject messageObject, View view) {
        this.parentFragment.presentFragment(new MessageStatisticActivity(messageObject));
    }

    public class AnonymousClass16 extends FrameLayout {
        AnonymousClass16(Context context) {
            super(context);
            ShareAlert.this = r1;
            new Paint();
        }

        @Override
        public void setVisibility(int i) {
            super.setVisibility(i);
            if (i != 0) {
                ShareAlert.this.shadow[1].setTranslationY(0.0f);
            }
        }

        @Override
        public void setAlpha(float f) {
            super.setAlpha(f);
            invalidate();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (ShareAlert.this.chatActivityEnterViewAnimateFromTop != 0.0f && ShareAlert.this.chatActivityEnterViewAnimateFromTop != ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.chatActivityEnterViewAnimateFromTop) {
                if (ShareAlert.this.topBackgroundAnimator != null) {
                    ShareAlert.this.topBackgroundAnimator.cancel();
                }
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.captionEditTextTopOffset = shareAlert.chatActivityEnterViewAnimateFromTop - (ShareAlert.this.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset);
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBackgroundAnimator = ValueAnimator.ofFloat(shareAlert2.captionEditTextTopOffset, 0.0f);
                ShareAlert.this.topBackgroundAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ShareAlert.AnonymousClass16.this.lambda$onDraw$0(valueAnimator);
                    }
                });
                ShareAlert.this.topBackgroundAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ShareAlert.this.topBackgroundAnimator.setDuration(200L);
                ShareAlert.this.topBackgroundAnimator.start();
                ShareAlert.this.chatActivityEnterViewAnimateFromTop = 0.0f;
            }
            ShareAlert.this.shadow[1].setTranslationY((-(ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f))) + ShareAlert.this.captionEditTextTopOffset + ShareAlert.this.currentPanTranslationY + ((ShareAlert.this.frameLayout2.getMeasuredHeight() - AndroidUtilities.dp(48.0f)) * (1.0f - getAlpha())));
        }

        public void lambda$onDraw$0(ValueAnimator valueAnimator) {
            ShareAlert.this.captionEditTextTopOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            ShareAlert.this.frameLayout2.invalidate();
            invalidate();
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, ShareAlert.this.captionEditTextTopOffset, getMeasuredWidth(), getMeasuredHeight());
            super.dispatchDraw(canvas);
            canvas.restore();
        }
    }

    public class AnonymousClass17 extends EditTextEmoji {
        private ValueAnimator messageEditTextAnimator;
        private int messageEditTextPredrawHeigth;
        private int messageEditTextPredrawScrollY;
        private boolean shouldAnimateEditTextWithBounds;

        AnonymousClass17(Context context, SizeNotifierFrameLayout sizeNotifierFrameLayout, BaseFragment baseFragment, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
            super(context, sizeNotifierFrameLayout, baseFragment, i, z, resourcesProvider);
            ShareAlert.this = r8;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (this.shouldAnimateEditTextWithBounds) {
                final EditTextCaption editText = ShareAlert.this.commentTextView.getEditText();
                editText.setOffsetY(editText.getOffsetY() - ((this.messageEditTextPredrawHeigth - editText.getMeasuredHeight()) + (this.messageEditTextPredrawScrollY - editText.getScrollY())));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(editText.getOffsetY(), 0.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ShareAlert.AnonymousClass17.lambda$dispatchDraw$0(EditTextCaption.this, valueAnimator);
                    }
                });
                ValueAnimator valueAnimator = this.messageEditTextAnimator;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.messageEditTextAnimator = ofFloat;
                ofFloat.setDuration(200L);
                ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
                ofFloat.start();
                this.shouldAnimateEditTextWithBounds = false;
            }
            super.dispatchDraw(canvas);
        }

        public static void lambda$dispatchDraw$0(EditTextCaption editTextCaption, ValueAnimator valueAnimator) {
            editTextCaption.setOffsetY(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        protected void onLineCountChanged(int i, int i2) {
            if (!TextUtils.isEmpty(getEditText().getText())) {
                this.shouldAnimateEditTextWithBounds = true;
                this.messageEditTextPredrawHeigth = getEditText().getMeasuredHeight();
                this.messageEditTextPredrawScrollY = getEditText().getScrollY();
                invalidate();
            } else {
                getEditText().animate().cancel();
                getEditText().setOffsetY(0.0f);
                this.shouldAnimateEditTextWithBounds = false;
            }
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.chatActivityEnterViewAnimateFromTop = shareAlert.frameLayout2.getTop() + ShareAlert.this.captionEditTextTopOffset;
            ShareAlert.this.frameLayout2.invalidate();
        }

        @Override
        public void showPopup(int i) {
            super.showPopup(i);
            if (ShareAlert.this.darkTheme) {
                ((BottomSheet) ShareAlert.this).navBarColorKey = -1;
                AndroidUtilities.setNavigationBarColor(ShareAlert.this.getWindow(), ShareAlert.this.getThemedColor(Theme.key_windowBackgroundGray), true, new AndroidUtilities.IntColorCallback() {
                    @Override
                    public final void run(int i2) {
                        ShareAlert.AnonymousClass17.this.lambda$showPopup$1(i2);
                    }
                });
            }
        }

        public void lambda$showPopup$1(int i) {
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.setOverlayNavBarColor(((BottomSheet) shareAlert).navBarColor = i);
        }

        @Override
        public void hidePopup(boolean z) {
            super.hidePopup(z);
            if (ShareAlert.this.darkTheme) {
                ((BottomSheet) ShareAlert.this).navBarColorKey = -1;
                AndroidUtilities.setNavigationBarColor(ShareAlert.this.getWindow(), ShareAlert.this.getThemedColor(Theme.key_voipgroup_inviteMembersBackground), true, new AndroidUtilities.IntColorCallback() {
                    @Override
                    public final void run(int i) {
                        ShareAlert.AnonymousClass17.this.lambda$hidePopup$2(i);
                    }
                });
            }
        }

        public void lambda$hidePopup$2(int i) {
            ShareAlert shareAlert = ShareAlert.this;
            shareAlert.setOverlayNavBarColor(((BottomSheet) shareAlert).navBarColor = i);
        }
    }

    public void lambda$new$11(View view) {
        sendInternal(true);
    }

    public boolean lambda$new$12(ImageView imageView, View view) {
        return onSendLongClick(imageView);
    }

    public void showPremiumBlockedToast(View view, long j) {
        Bulletin createSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        String userName = j >= 0 ? UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j))) : "";
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
            createSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)));
        } else {
            createSimpleBulletin = BulletinFactory.of(this.bulletinContainer, this.resourcesProvider).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    ShareAlert.this.lambda$showPremiumBlockedToast$14();
                }
            });
        }
        createSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$14() {
        ShareAlert$$ExternalSyntheticLambda15 shareAlert$$ExternalSyntheticLambda15 = new Runnable() {
            @Override
            public final void run() {
                ShareAlert.lambda$showPremiumBlockedToast$13();
            }
        };
        if (isKeyboardVisible()) {
            SearchField searchField = this.searchView;
            if (searchField != null) {
                AndroidUtilities.hideKeyboard(searchField.searchEditText);
            }
            AndroidUtilities.runOnUIThread(shareAlert$$ExternalSyntheticLambda15, 300L);
            return;
        }
        shareAlert$$ExternalSyntheticLambda15.run();
    }

    public static void lambda$showPremiumBlockedToast$13() {
        BaseFragment lastFragment = LaunchActivity.getLastFragment();
        if (lastFragment != null) {
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            bottomSheetParams.allowNestedScroll = false;
            lastFragment.showAsSheet(new PremiumPreviewFragment("noncontacts"), bottomSheetParams);
        }
    }

    public void selectDialog(View view, final TLRPC$Dialog tLRPC$Dialog) {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler;
        if (tLRPC$Dialog instanceof ShareDialogsAdapter.MyStoryDialog) {
            onShareStory(view);
        } else if (tLRPC$Dialog != null && (((view instanceof ShareDialogCell) && ((ShareDialogCell) view).isBlocked()) || ((view instanceof ProfileSearchCell) && ((ProfileSearchCell) view).isBlocked()))) {
            showPremiumBlockedToast(view, tLRPC$Dialog.id);
        } else if (this.topicsGridView.getVisibility() != 8 || this.parentActivity == null) {
        } else {
            if (DialogObject.isChatDialog(tLRPC$Dialog.id)) {
                TLRPC$Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id));
                if (ChatObject.isChannel(chat) && !chat.megagroup && (!ChatObject.isCanWriteToChannel(-tLRPC$Dialog.id, this.currentAccount) || this.hasPoll == 2)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(this.parentActivity);
                    builder.setTitle(LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle));
                    if (this.hasPoll == 2) {
                        if (this.isChannel) {
                            builder.setMessage(LocaleController.getString("PublicPollCantForward", R.string.PublicPollCantForward));
                        } else if (ChatObject.isActionBannedByDefault(chat, 10)) {
                            builder.setMessage(LocaleController.getString("ErrorSendRestrictedPollsAll", R.string.ErrorSendRestrictedPollsAll));
                        } else {
                            builder.setMessage(LocaleController.getString("ErrorSendRestrictedPolls", R.string.ErrorSendRestrictedPolls));
                        }
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelCantSendMessage", R.string.ChannelCantSendMessage));
                    }
                    builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                    builder.show();
                    return;
                }
            } else if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id) && this.hasPoll != 0) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(this.parentActivity);
                builder2.setTitle(LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle));
                if (this.hasPoll != 0) {
                    builder2.setMessage(LocaleController.getString("PollCantForwardSecretChat", R.string.PollCantForwardSecretChat));
                } else {
                    builder2.setMessage(LocaleController.getString("InvoiceCantForwardSecretChat", R.string.InvoiceCantForwardSecretChat));
                }
                builder2.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                builder2.show();
                return;
            }
            if (this.selectedDialogs.indexOfKey(tLRPC$Dialog.id) >= 0) {
                this.selectedDialogs.remove(tLRPC$Dialog.id);
                this.selectedDialogTopics.remove(tLRPC$Dialog);
                if (view instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view).setChecked(false, true);
                } else if (view instanceof ShareDialogCell) {
                    ((ShareDialogCell) view).setChecked(false, true);
                }
                updateSelectedCount(1);
            } else if (DialogObject.isChatDialog(tLRPC$Dialog.id) && MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id)) != null && MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-tLRPC$Dialog.id)).forum) {
                this.selectedTopicDialog = tLRPC$Dialog;
                this.topicsLayoutManager.scrollToPositionWithOffset(0, this.scrollOffsetY - this.topicsGridView.getPaddingTop());
                final AtomicReference atomicReference = new AtomicReference();
                final AnonymousClass22 anonymousClass22 = new AnonymousClass22(tLRPC$Dialog, atomicReference, view);
                atomicReference.set(new Runnable() {
                    @Override
                    public final void run() {
                        ShareAlert.this.lambda$selectDialog$15(atomicReference, anonymousClass22, tLRPC$Dialog);
                    }
                });
                NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                int i = NotificationCenter.topicsDidLoaded;
                notificationCenter.addObserver(anonymousClass22, i);
                if (MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-tLRPC$Dialog.id) != null) {
                    anonymousClass22.didReceivedNotification(i, this.currentAccount, Long.valueOf(-tLRPC$Dialog.id));
                    return;
                }
                MessagesController.getInstance(this.currentAccount).getTopicsController().loadTopics(-tLRPC$Dialog.id);
                AndroidUtilities.runOnUIThread((Runnable) atomicReference.get(), 300L);
                return;
            } else {
                this.selectedDialogs.put(tLRPC$Dialog.id, tLRPC$Dialog);
                if (view instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view).setChecked(true, true);
                } else if (view instanceof ShareDialogCell) {
                    ((ShareDialogCell) view).setChecked(true, true);
                }
                updateSelectedCount(2);
                long j = UserConfig.getInstance(this.currentAccount).clientUserId;
                if (this.searchIsVisible) {
                    TLRPC$Dialog tLRPC$Dialog2 = (TLRPC$Dialog) this.listAdapter.dialogsMap.get(tLRPC$Dialog.id);
                    if (tLRPC$Dialog2 != null) {
                        if (tLRPC$Dialog2.id != j) {
                            this.listAdapter.dialogs.remove(tLRPC$Dialog2);
                            this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty(), tLRPC$Dialog2);
                        }
                    } else {
                        this.listAdapter.dialogsMap.put(tLRPC$Dialog.id, tLRPC$Dialog);
                        this.listAdapter.dialogs.add(!this.listAdapter.dialogs.isEmpty(), tLRPC$Dialog);
                    }
                    this.listAdapter.notifyDataSetChanged();
                    this.updateSearchAdapter = false;
                    this.searchView.searchEditText.setText("");
                    checkCurrentList(false);
                    this.searchView.hideKeyboard();
                }
            }
            ShareSearchAdapter shareSearchAdapter = this.searchAdapter;
            if (shareSearchAdapter == null || (categoryAdapterRecycler = shareSearchAdapter.categoryAdapter) == null) {
                return;
            }
            categoryAdapterRecycler.notifyItemRangeChanged(0, categoryAdapterRecycler.getItemCount());
        }
    }

    public class AnonymousClass22 implements NotificationCenter.NotificationCenterDelegate {
        final View val$cell;
        final TLRPC$Dialog val$dialog;
        final AtomicReference val$timeoutRef;

        AnonymousClass22(TLRPC$Dialog tLRPC$Dialog, AtomicReference atomicReference, View view) {
            ShareAlert.this = r1;
            this.val$dialog = tLRPC$Dialog;
            this.val$timeoutRef = atomicReference;
            this.val$cell = view;
        }

        @Override
        @SuppressLint({"NotifyDataSetChanged"})
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (((Long) objArr[0]).longValue() == (-this.val$dialog.id)) {
                boolean z = (ShareAlert.this.shareTopicsAdapter.topics == null && MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id) != null) || this.val$timeoutRef.get() == null;
                ShareAlert.this.shareTopicsAdapter.topics = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getTopicsController().getTopics(-this.val$dialog.id);
                if (z) {
                    ShareAlert.this.shareTopicsAdapter.notifyDataSetChanged();
                }
                if (ShareAlert.this.shareTopicsAdapter.topics != null) {
                    NotificationCenter.getInstance(((BottomSheet) ShareAlert.this).currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
                }
                if (z) {
                    ShareAlert.this.topicsGridView.setVisibility(0);
                    ShareAlert.this.topicsGridView.setAlpha(0.0f);
                    ShareAlert.this.topicsBackActionBar.setVisibility(0);
                    ShareAlert.this.topicsBackActionBar.setAlpha(0.0f);
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topicsBackActionBar.setTitle(MessagesController.getInstance(((BottomSheet) shareAlert).currentAccount).getChat(Long.valueOf(-this.val$dialog.id)).title);
                    ShareAlert.this.topicsBackActionBar.setSubtitle(LocaleController.getString(R.string.SelectTopic));
                    ShareAlert shareAlert2 = ShareAlert.this;
                    shareAlert2.searchWasVisibleBeforeTopics = shareAlert2.searchIsVisible;
                    if (ShareAlert.this.topicsAnimation != null) {
                        ShareAlert.this.topicsAnimation.cancel();
                    }
                    final int[] iArr = new int[2];
                    ShareAlert.this.topicsAnimation = new SpringAnimation(new FloatValueHolder(0.0f)).setSpring(new SpringForce(1000.0f).setStiffness((ShareAlert.this.parentFragment == null || !ShareAlert.this.parentFragment.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
                    SpringAnimation springAnimation = ShareAlert.this.topicsAnimation;
                    final View view = this.val$cell;
                    springAnimation.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                            ShareAlert.AnonymousClass22.this.lambda$didReceivedNotification$0(view, iArr, dynamicAnimation, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                        @Override
                        public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z2, float f, float f2) {
                            ShareAlert.AnonymousClass22.this.lambda$didReceivedNotification$1(dynamicAnimation, z2, f, f2);
                        }
                    });
                    ShareAlert.this.topicsAnimation.start();
                    if (this.val$timeoutRef.get() != null) {
                        AndroidUtilities.cancelRunOnUIThread((Runnable) this.val$timeoutRef.get());
                        this.val$timeoutRef.set(null);
                    }
                }
            }
        }

        public void lambda$didReceivedNotification$0(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
            ShareAlert.this.invalidateTopicsAnimation(view, iArr, f / 1000.0f);
        }

        public void lambda$didReceivedNotification$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            ShareAlert.this.gridView.setVisibility(8);
            ShareAlert.this.searchGridView.setVisibility(8);
            ShareAlert.this.searchView.setVisibility(8);
            ShareAlert.this.topicsAnimation = null;
        }
    }

    public void lambda$selectDialog$15(AtomicReference atomicReference, NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLRPC$Dialog tLRPC$Dialog) {
        atomicReference.set(null);
        notificationCenterDelegate.didReceivedNotification(NotificationCenter.topicsDidLoaded, this.currentAccount, Long.valueOf(-tLRPC$Dialog.id));
    }

    @SuppressLint({"NotifyDataSetChanged"})
    private void collapseTopics() {
        TLRPC$Dialog tLRPC$Dialog = this.selectedTopicDialog;
        if (tLRPC$Dialog == null) {
            return;
        }
        final View view = null;
        this.selectedTopicDialog = null;
        for (int i = 0; i < getMainGridView().getChildCount(); i++) {
            View childAt = getMainGridView().getChildAt(i);
            if ((childAt instanceof ShareDialogCell) && ((ShareDialogCell) childAt).getCurrentDialog() == tLRPC$Dialog.id) {
                view = childAt;
            }
        }
        if (view == null) {
            return;
        }
        SpringAnimation springAnimation = this.topicsAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
        }
        getMainGridView().setVisibility(0);
        this.searchView.setVisibility(0);
        if (this.searchIsVisible || this.searchWasVisibleBeforeTopics) {
            this.sizeNotifierFrameLayout.adjustPanLayoutHelper.ignoreOnce();
            this.searchView.searchEditText.requestFocus();
            AndroidUtilities.showKeyboard(this.searchView.searchEditText);
        }
        final int[] iArr = new int[2];
        SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(1000.0f));
        SpringForce springForce = new SpringForce(0.0f);
        ChatActivity chatActivity = this.parentFragment;
        SpringAnimation spring = springAnimation2.setSpring(springForce.setStiffness((chatActivity == null || !chatActivity.shareAlertDebugTopicsSlowMotion) ? 800.0f : 10.0f).setDampingRatio(1.0f));
        this.topicsAnimation = spring;
        spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                ShareAlert.this.lambda$collapseTopics$16(view, iArr, dynamicAnimation, f, f2);
            }
        });
        this.topicsAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                ShareAlert.this.lambda$collapseTopics$17(dynamicAnimation, z, f, f2);
            }
        });
        this.topicsAnimation.start();
    }

    public void lambda$collapseTopics$16(View view, int[] iArr, DynamicAnimation dynamicAnimation, float f, float f2) {
        invalidateTopicsAnimation(view, iArr, f / 1000.0f);
    }

    public void lambda$collapseTopics$17(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.topicsGridView.setVisibility(8);
        this.topicsBackActionBar.setVisibility(8);
        this.shareTopicsAdapter.topics = null;
        this.shareTopicsAdapter.notifyDataSetChanged();
        this.topicsAnimation = null;
        this.searchWasVisibleBeforeTopics = false;
    }

    public void invalidateTopicsAnimation(View view, int[] iArr, float f) {
        SearchField searchField;
        this.topicsGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        this.topicsGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f2 = 0.25f * f;
        float f3 = 0.75f + f2;
        this.topicsGridView.setScaleX(f3);
        this.topicsGridView.setScaleY(f3);
        this.topicsGridView.setAlpha(f);
        RecyclerListView mainGridView = getMainGridView();
        mainGridView.setPivotX(view.getX() + (view.getWidth() / 2.0f));
        mainGridView.setPivotY(view.getY() + (view.getHeight() / 2.0f));
        float f4 = f2 + 1.0f;
        mainGridView.setScaleX(f4);
        mainGridView.setScaleY(f4);
        float f5 = 1.0f - f;
        mainGridView.setAlpha(f5);
        this.searchView.setPivotX(searchField.getWidth() / 2.0f);
        this.searchView.setPivotY(0.0f);
        float f6 = (0.1f * f5) + 0.9f;
        this.searchView.setScaleX(f6);
        this.searchView.setScaleY(f6);
        this.searchView.setAlpha(f5);
        this.topicsBackActionBar.getBackButton().setTranslationX((-AndroidUtilities.dp(16.0f)) * f5);
        this.topicsBackActionBar.getTitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.getSubtitleTextView().setTranslationY(AndroidUtilities.dp(16.0f) * f5);
        this.topicsBackActionBar.setAlpha(f);
        this.topicsGridView.getLocationInWindow(iArr);
        float interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(f);
        for (int i = 0; i < mainGridView.getChildCount(); i++) {
            View childAt = mainGridView.getChildAt(i);
            if (childAt instanceof ShareDialogCell) {
                childAt.setTranslationX((childAt.getX() - view.getX()) * 0.5f * interpolation);
                childAt.setTranslationY((childAt.getY() - view.getY()) * 0.5f * interpolation);
                if (childAt != view) {
                    childAt.setAlpha(1.0f - (Math.min(f, 0.5f) / 0.5f));
                } else {
                    childAt.setAlpha(f5);
                }
            }
        }
        for (int i2 = 0; i2 < this.topicsGridView.getChildCount(); i2++) {
            View childAt2 = this.topicsGridView.getChildAt(i2);
            if (childAt2 instanceof ShareTopicCell) {
                double d = -(childAt2.getX() - view.getX());
                double d2 = 1.0f - interpolation;
                double pow = Math.pow(d2, 2.0d);
                Double.isNaN(d);
                childAt2.setTranslationX((float) (d * pow));
                double d3 = -((childAt2.getY() + this.topicsGridView.getTranslationY()) - view.getY());
                double pow2 = Math.pow(d2, 2.0d);
                Double.isNaN(d3);
                childAt2.setTranslationY((float) (d3 * pow2));
            }
        }
        this.containerView.requestLayout();
        mainGridView.invalidate();
    }

    @Override
    public int getContainerViewHeight() {
        return this.containerView.getMeasuredHeight() - this.containerViewTop;
    }

    private boolean onSendLongClick(View view) {
        int measuredHeight;
        ChatActivity chatActivity;
        if (this.parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        if (this.sendingMessageObjects != null) {
            ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarPopupWindowLayout.setBackgroundColor(getThemedColor(Theme.key_voipgroup_inviteMembersBackground));
            }
            actionBarPopupWindowLayout.setAnimationEnabled(false);
            actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
                private android.graphics.Rect popupRect = new android.graphics.Rect();

                {
                    ShareAlert.this = this;
                }

                @Override
                public boolean onTouch(View view2, MotionEvent motionEvent) {
                    if (motionEvent.getActionMasked() == 0 && ShareAlert.this.sendPopupWindow != null && ShareAlert.this.sendPopupWindow.isShowing()) {
                        view2.getHitRect(this.popupRect);
                        if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                            return false;
                        }
                        ShareAlert.this.sendPopupWindow.dismiss();
                        return false;
                    }
                    return false;
                }
            });
            actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
                @Override
                public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                    ShareAlert.this.lambda$onSendLongClick$18(keyEvent);
                }
            });
            actionBarPopupWindowLayout.setShownFromBottom(false);
            final ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getContext(), true, true, false, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("ShowSendersName", R.string.ShowSendersName), 0);
            this.showSendersName = true;
            actionBarMenuSubItem.setChecked(true);
            final ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getContext(), true, false, true, this.resourcesProvider);
            if (this.darkTheme) {
                actionBarMenuSubItem2.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            }
            actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem2, LayoutHelper.createLinear(-1, 48));
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("HideSendersName", R.string.HideSendersName), 0);
            actionBarMenuSubItem2.setChecked(!this.showSendersName);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ShareAlert.this.lambda$onSendLongClick$19(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    ShareAlert.this.lambda$onSendLongClick$20(actionBarMenuSubItem, actionBarMenuSubItem2, view2);
                }
            });
            actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : Theme.key_dialogButtonSelector));
            linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2, 0.0f, 0.0f, 0.0f, -8.0f));
        }
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout2 = new ActionBarPopupWindow.ActionBarPopupWindowLayout(this.parentActivity, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarPopupWindowLayout2.setBackgroundColor(Theme.getColor(Theme.key_voipgroup_inviteMembersBackground));
        }
        actionBarPopupWindowLayout2.setAnimationEnabled(false);
        actionBarPopupWindowLayout2.setOnTouchListener(new View.OnTouchListener() {
            private android.graphics.Rect popupRect = new android.graphics.Rect();

            {
                ShareAlert.this = this;
            }

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && ShareAlert.this.sendPopupWindow != null && ShareAlert.this.sendPopupWindow.isShowing()) {
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    ShareAlert.this.sendPopupWindow.dismiss();
                    return false;
                }
                return false;
            }
        });
        actionBarPopupWindowLayout2.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
            @Override
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                ShareAlert.this.lambda$onSendLongClick$21(keyEvent);
            }
        });
        actionBarPopupWindowLayout2.setShownFromBottom(false);
        ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem3.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem3.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("SendWithoutSound", R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem3.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem3, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ShareAlert.this.lambda$onSendLongClick$22(view2);
            }
        });
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getContext(), true, true, this.resourcesProvider);
        if (this.darkTheme) {
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_voipgroup_nameText));
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
        }
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString("SendMessage", R.string.SendMessage), R.drawable.msg_send);
        actionBarMenuSubItem4.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout2.addView((View) actionBarMenuSubItem4, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ShareAlert.this.lambda$onSendLongClick$23(view2);
            }
        });
        actionBarPopupWindowLayout2.setupRadialSelectors(getThemedColor(this.darkTheme ? Theme.key_voipgroup_listSelector : Theme.key_dialogButtonSelector));
        linearLayout.addView(actionBarPopupWindowLayout2, LayoutHelper.createLinear(-1, -2));
        ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(linearLayout, -2, -2);
        this.sendPopupWindow = actionBarPopupWindow;
        actionBarPopupWindow.setAnimationEnabled(false);
        this.sendPopupWindow.setAnimationStyle(R.style.PopupContextAnimation2);
        this.sendPopupWindow.setOutsideTouchable(true);
        this.sendPopupWindow.setClippingEnabled(true);
        this.sendPopupWindow.setInputMethodMode(2);
        this.sendPopupWindow.setSoftInputMode(0);
        this.sendPopupWindow.getContentView().setFocusableInTouchMode(true);
        SharedConfig.removeScheduledOrNoSoundHint();
        linearLayout.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1000.0f), Integer.MIN_VALUE));
        this.sendPopupWindow.setFocusable(true);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        if (this.keyboardVisible && (chatActivity = this.parentFragment) != null && chatActivity.contentView.getMeasuredHeight() > AndroidUtilities.dp(58.0f)) {
            measuredHeight = iArr[1] + view.getMeasuredHeight();
        } else {
            measuredHeight = (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f);
        }
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), measuredHeight);
        this.sendPopupWindow.dimBehind();
        view.performHapticFeedback(3, 2);
        return true;
    }

    public void lambda$onSendLongClick$18(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$19(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = true;
        actionBarMenuSubItem.setChecked(true);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$20(ActionBarMenuSubItem actionBarMenuSubItem, ActionBarMenuSubItem actionBarMenuSubItem2, View view) {
        this.showSendersName = false;
        actionBarMenuSubItem.setChecked(false);
        actionBarMenuSubItem2.setChecked(!this.showSendersName);
    }

    public void lambda$onSendLongClick$21(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$22(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(false);
    }

    public void lambda$onSendLongClick$23(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        sendInternal(true);
    }

    protected void sendInternal(boolean z) {
        char c;
        MessageObject messageObject;
        long j;
        int i;
        char c2;
        MessageObject messageObject2;
        int i2;
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
        SendMessagesHelper.SendMessageParams of;
        ArrayList<Long> arrayList;
        MessageObject messageObject3;
        long j2;
        int i3;
        ArrayList arrayList2;
        ?? r1 = 0;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            if (i4 >= this.selectedDialogs.size()) {
                CharSequence[] charSequenceArr = {this.commentTextView.getText()};
                ArrayList<TLRPC$MessageEntity> entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = null;
                if (this.sendingMessageObjects != null) {
                    ArrayList arrayList3 = new ArrayList();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= this.selectedDialogs.size()) {
                            arrayList = arrayList3;
                            break;
                        }
                        long keyAt = this.selectedDialogs.keyAt(i5);
                        TLRPC$TL_forumTopic tLRPC$TL_forumTopic3 = this.selectedDialogTopics.get(this.selectedDialogs.get(keyAt));
                        MessageObject messageObject4 = tLRPC$TL_forumTopic3 != null ? new MessageObject(this.currentAccount, tLRPC$TL_forumTopic3.topicStartMessage, r1, r1) : tLRPC$TL_forumTopic2;
                        if (messageObject4 != 0) {
                            messageObject4.isTopicMainMessage = true;
                        }
                        if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                            messageObject3 = messageObject4;
                            j2 = keyAt;
                            i3 = i5;
                            arrayList2 = arrayList3;
                        } else {
                            messageObject3 = messageObject4;
                            j2 = keyAt;
                            i3 = i5;
                            arrayList2 = arrayList3;
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[r1] == null ? tLRPC$TL_forumTopic2 : charSequenceArr[r1].toString(), keyAt, messageObject4, messageObject4, null, true, entities, null, null, z, 0, null, false));
                        }
                        int sendMessage = SendMessagesHelper.getInstance(this.currentAccount).sendMessage(this.sendingMessageObjects, j2, !this.showSendersName, false, z, 0, messageObject3);
                        if (sendMessage != 0) {
                            arrayList = arrayList2;
                            arrayList.add(Long.valueOf(j2));
                        } else {
                            arrayList = arrayList2;
                        }
                        if (this.selectedDialogs.size() == 1) {
                            tLRPC$TL_forumTopic2 = null;
                            AlertsCreator.showSendMediaAlert(sendMessage, this.parentFragment, null);
                            if (sendMessage != 0) {
                                break;
                            }
                        } else {
                            tLRPC$TL_forumTopic2 = null;
                        }
                        i5 = i3 + 1;
                        arrayList3 = arrayList;
                        r1 = 0;
                        tLRPC$TL_forumTopic2 = tLRPC$TL_forumTopic2;
                    }
                    for (Long l : arrayList) {
                        long longValue = l.longValue();
                        TLRPC$Dialog tLRPC$Dialog = this.selectedDialogs.get(longValue);
                        this.selectedDialogs.remove(longValue);
                        if (tLRPC$Dialog != null) {
                            this.selectedDialogTopics.remove(tLRPC$Dialog);
                        }
                    }
                    if (!this.selectedDialogs.isEmpty()) {
                        LongSparseArray<TLRPC$Dialog> longSparseArray = this.selectedDialogs;
                        int size = this.sendingMessageObjects.size();
                        if (this.selectedDialogs.size() == 1) {
                            tLRPC$TL_forumTopic2 = this.selectedDialogTopics.get(this.selectedDialogs.valueAt(0));
                        }
                        onSend(longSparseArray, size, tLRPC$TL_forumTopic2);
                    }
                } else {
                    SwitchView switchView = this.switchView;
                    int i6 = switchView != null ? switchView.currentTab : 0;
                    if (this.storyItem != null) {
                        int i7 = 0;
                        while (i7 < this.selectedDialogs.size()) {
                            long keyAt2 = this.selectedDialogs.keyAt(i7);
                            TLRPC$TL_forumTopic tLRPC$TL_forumTopic4 = this.selectedDialogTopics.get(this.selectedDialogs.get(keyAt2));
                            if (tLRPC$TL_forumTopic4 != null) {
                                c2 = 0;
                                messageObject2 = new MessageObject(this.currentAccount, tLRPC$TL_forumTopic4.topicStartMessage, false, false);
                            } else {
                                c2 = 0;
                                messageObject2 = tLRPC$TL_forumTopic2;
                            }
                            if (this.storyItem == null) {
                                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0) {
                                    i2 = i7;
                                    tLRPC$TL_forumTopic = tLRPC$TL_forumTopic2;
                                    of = SendMessagesHelper.SendMessageParams.of(charSequenceArr[c2] == null ? tLRPC$TL_forumTopic2 : charSequenceArr[c2].toString(), keyAt2, null, messageObject2, null, true, entities, null, null, z, 0, null, false);
                                } else {
                                    i2 = i7;
                                    tLRPC$TL_forumTopic = tLRPC$TL_forumTopic2;
                                    of = SendMessagesHelper.SendMessageParams.of(this.sendingText[i6], keyAt2, null, messageObject2, null, true, null, null, null, z, 0, null, false);
                                }
                            } else {
                                i2 = i7;
                                tLRPC$TL_forumTopic = tLRPC$TL_forumTopic2;
                                if (this.frameLayout2.getTag() != null && this.commentTextView.length() > 0 && charSequenceArr[0] != null) {
                                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), keyAt2, null, messageObject2, null, true, null, null, null, z, 0, null, false));
                                }
                                of = SendMessagesHelper.SendMessageParams.of(null, keyAt2, null, messageObject2, null, true, null, null, null, z, 0, null, false);
                                of.sendingStory = this.storyItem;
                            }
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of);
                            i7 = i2 + 1;
                            tLRPC$TL_forumTopic2 = tLRPC$TL_forumTopic;
                        }
                    } else if (this.sendingText[i6] != null) {
                        int i8 = 0;
                        while (i8 < this.selectedDialogs.size()) {
                            long keyAt3 = this.selectedDialogs.keyAt(i8);
                            TLRPC$TL_forumTopic tLRPC$TL_forumTopic5 = this.selectedDialogTopics.get(this.selectedDialogs.get(keyAt3));
                            if (tLRPC$TL_forumTopic5 != null) {
                                c = 0;
                                messageObject = new MessageObject(this.currentAccount, tLRPC$TL_forumTopic5.topicStartMessage, false, false);
                            } else {
                                c = 0;
                                messageObject = null;
                            }
                            if (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) {
                                j = keyAt3;
                                i = i8;
                            } else {
                                j = keyAt3;
                                i = i8;
                                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[c] == null ? null : charSequenceArr[c].toString(), keyAt3, null, messageObject, null, true, entities, null, null, z, 0, null, false));
                            }
                            SendMessagesHelper.getInstance(this.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(this.sendingText[i6], j, null, messageObject, null, true, null, null, null, z, 0, null, false));
                            i8 = i + 1;
                        }
                    }
                    LongSparseArray<TLRPC$Dialog> longSparseArray2 = this.selectedDialogs;
                    onSend(longSparseArray2, 1, this.selectedDialogTopics.get(longSparseArray2.valueAt(0)));
                }
                ShareAlertDelegate shareAlertDelegate = this.delegate;
                if (shareAlertDelegate != null) {
                    shareAlertDelegate.didShare();
                }
                dismiss();
                return;
            }
            if (AlertsCreator.checkSlowMode(getContext(), this.currentAccount, this.selectedDialogs.keyAt(i4), (this.frameLayout2.getTag() == null || this.commentTextView.length() <= 0) ? false : false)) {
                return;
            }
            i4++;
        }
    }

    public int getCurrentTop() {
        if (this.gridView.getChildCount() != 0) {
            int i = 0;
            View childAt = this.gridView.getChildAt(0);
            RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
            if (holder != null) {
                int paddingTop = this.gridView.getPaddingTop();
                if (holder.getLayoutPosition() == 0 && childAt.getTop() >= 0) {
                    i = childAt.getTop();
                }
                return paddingTop - i;
            }
            return -1000;
        }
        return -1000;
    }

    private RecyclerListView getMainGridView() {
        return (this.searchIsVisible || this.searchWasVisibleBeforeTopics) ? this.searchGridView : this.gridView;
    }

    public void setDelegate(ShareAlertDelegate shareAlertDelegate) {
        this.delegate = shareAlertDelegate;
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            editTextEmoji.onDestroy();
        }
    }

    @Override
    public void onBackPressed() {
        if (this.selectedTopicDialog != null) {
            collapseTopics();
            return;
        }
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null && editTextEmoji.isPopupShowing()) {
            this.commentTextView.hidePopup(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.dialogsNeedReload;
        if (i == i3) {
            ShareDialogsAdapter shareDialogsAdapter = this.listAdapter;
            if (shareDialogsAdapter != null) {
                shareDialogsAdapter.fetchDialogs();
            }
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, i3);
        }
    }

    @SuppressLint({"NewApi"})
    public void updateLayout() {
        if (this.panTranslationMoveLayout) {
            return;
        }
        RecyclerListView recyclerListView = this.searchIsVisible ? this.searchGridView : this.gridView;
        if (recyclerListView.getChildCount() <= 0) {
            return;
        }
        View childAt = recyclerListView.getChildAt(0);
        for (int i = 0; i < recyclerListView.getChildCount(); i++) {
            if (recyclerListView.getChildAt(i).getTop() < childAt.getTop()) {
                childAt = recyclerListView.getChildAt(i);
            }
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) recyclerListView.findContainingViewHolder(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(8.0f);
        int i2 = (top <= 0 || holder == null || holder.getAdapterPosition() != 0) ? 0 : top;
        if (top >= 0 && holder != null && holder.getAdapterPosition() == 0) {
            this.lastOffset = childAt.getTop();
            runShadowAnimation(0, false);
        } else {
            this.lastOffset = Integer.MAX_VALUE;
            runShadowAnimation(0, true);
            top = i2;
        }
        if (this.topicsGridView.getVisibility() == 0) {
            RecyclerListView recyclerListView2 = this.topicsGridView;
            if (recyclerListView2.getChildCount() <= 0) {
                return;
            }
            View childAt2 = recyclerListView2.getChildAt(0);
            for (int i3 = 0; i3 < recyclerListView2.getChildCount(); i3++) {
                if (recyclerListView2.getChildAt(i3).getTop() < childAt2.getTop()) {
                    childAt2 = recyclerListView2.getChildAt(i3);
                }
            }
            RecyclerListView.Holder holder2 = (RecyclerListView.Holder) recyclerListView2.findContainingViewHolder(childAt2);
            int top2 = childAt2.getTop() - AndroidUtilities.dp(8.0f);
            int i4 = (top2 <= 0 || holder2 == null || holder2.getAdapterPosition() != 0) ? 0 : top2;
            if (top2 >= 0 && holder2 != null && holder2.getAdapterPosition() == 0) {
                this.lastOffset = childAt2.getTop();
                runShadowAnimation(0, false);
            } else {
                this.lastOffset = Integer.MAX_VALUE;
                runShadowAnimation(0, true);
                top2 = i4;
            }
            top = AndroidUtilities.lerp(top, top2, this.topicsGridView.getAlpha());
        }
        int i5 = this.scrollOffsetY;
        if (i5 != top) {
            this.previousScrollOffsetY = i5;
            RecyclerListView recyclerListView3 = this.gridView;
            float f = top;
            int i6 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i6;
            recyclerListView3.setTopGlowOffset(i6);
            RecyclerListView recyclerListView4 = this.searchGridView;
            int i7 = (int) (this.currentPanTranslationY + f);
            this.scrollOffsetY = i7;
            recyclerListView4.setTopGlowOffset(i7);
            RecyclerListView recyclerListView5 = this.topicsGridView;
            int i8 = (int) (f + this.currentPanTranslationY);
            this.scrollOffsetY = i8;
            recyclerListView5.setTopGlowOffset(i8);
            this.frameLayout.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.searchEmptyView.setTranslationY(this.scrollOffsetY + this.currentPanTranslationY);
            this.containerView.invalidate();
        }
    }

    private void runShadowAnimation(final int i, final boolean z) {
        if ((!z || this.shadow[i].getTag() == null) && (z || this.shadow[i].getTag() != null)) {
            return;
        }
        this.shadow[i].setTag(z ? null : 1);
        if (z) {
            this.shadow[i].setVisibility(0);
        }
        AnimatorSet[] animatorSetArr = this.shadowAnimation;
        if (animatorSetArr[i] != null) {
            animatorSetArr[i].cancel();
        }
        this.shadowAnimation[i] = new AnimatorSet();
        AnimatorSet animatorSet = this.shadowAnimation[i];
        Animator[] animatorArr = new Animator[1];
        View view = this.shadow[i];
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
        animatorSet.playTogether(animatorArr);
        this.shadowAnimation[i].setDuration(150L);
        this.shadowAnimation[i].addListener(new AnimatorListenerAdapter() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                if (!z) {
                    ShareAlert.this.shadow[i].setVisibility(4);
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (ShareAlert.this.shadowAnimation[i] == null || !ShareAlert.this.shadowAnimation[i].equals(animator)) {
                    return;
                }
                ShareAlert.this.shadowAnimation[i] = null;
            }
        });
        this.shadowAnimation[i].start();
    }

    private void copyLink(Context context) {
        String str;
        final boolean z = false;
        if (this.exportedMessageLink == null && this.linkToCopy[0] == null) {
            return;
        }
        try {
            SwitchView switchView = this.switchView;
            if (switchView != null) {
                str = this.linkToCopy[switchView.currentTab];
            } else {
                str = this.linkToCopy[0];
            }
            ClipboardManager clipboardManager = (ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard");
            if (str == null) {
                str = this.exportedMessageLink.link;
            }
            clipboardManager.setPrimaryClip(ClipData.newPlainText("label", str));
            ShareAlertDelegate shareAlertDelegate = this.delegate;
            if ((shareAlertDelegate == null || !shareAlertDelegate.didCopy()) && (this.parentActivity instanceof LaunchActivity)) {
                TLRPC$TL_exportedMessageLink tLRPC$TL_exportedMessageLink = this.exportedMessageLink;
                if (tLRPC$TL_exportedMessageLink != null && tLRPC$TL_exportedMessageLink.link.contains("/c/")) {
                    z = true;
                }
                ((LaunchActivity) this.parentActivity).showBulletin(new Function() {
                    @Override
                    public final Object apply(Object obj) {
                        Bulletin lambda$copyLink$24;
                        lambda$copyLink$24 = ShareAlert.this.lambda$copyLink$24(z, (BulletinFactory) obj);
                        return lambda$copyLink$24;
                    }
                });
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public Bulletin lambda$copyLink$24(boolean z, BulletinFactory bulletinFactory) {
        return bulletinFactory.createCopyLinkBulletin(z, this.resourcesProvider);
    }

    private boolean showCommentTextView(final boolean z) {
        if (z == (this.frameLayout2.getTag() != null)) {
            return false;
        }
        AnimatorSet animatorSet = this.animatorSet;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.frameLayout2.setTag(z ? 1 : null);
        if (this.commentTextView.getEditText().isFocused()) {
            AndroidUtilities.hideKeyboard(this.commentTextView.getEditText());
        }
        this.commentTextView.hidePopup(true);
        if (z) {
            this.frameLayout2.setVisibility(0);
            this.writeButtonContainer.setVisibility(0);
        }
        TextView textView = this.pickerBottomLayout;
        if (textView != null) {
            ViewCompat.setImportantForAccessibility(textView, z ? 4 : 1);
        }
        LinearLayout linearLayout = this.sharesCountLayout;
        if (linearLayout != null) {
            ViewCompat.setImportantForAccessibility(linearLayout, z ? 4 : 1);
        }
        this.animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.frameLayout2;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout, property, fArr));
        FrameLayout frameLayout2 = this.writeButtonContainer;
        Property property2 = View.SCALE_X;
        float[] fArr2 = new float[1];
        fArr2[0] = z ? 1.0f : 0.2f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout2, property2, fArr2));
        FrameLayout frameLayout3 = this.writeButtonContainer;
        Property property3 = View.SCALE_Y;
        float[] fArr3 = new float[1];
        fArr3[0] = z ? 1.0f : 0.2f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout3, property3, fArr3));
        FrameLayout frameLayout4 = this.writeButtonContainer;
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[1];
        fArr4[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(frameLayout4, property4, fArr4));
        View view = this.selectedCountView;
        Property property5 = View.SCALE_X;
        float[] fArr5 = new float[1];
        fArr5[0] = z ? 1.0f : 0.2f;
        arrayList.add(ObjectAnimator.ofFloat(view, property5, fArr5));
        View view2 = this.selectedCountView;
        Property property6 = View.SCALE_Y;
        float[] fArr6 = new float[1];
        fArr6[0] = z ? 1.0f : 0.2f;
        arrayList.add(ObjectAnimator.ofFloat(view2, property6, fArr6));
        View view3 = this.selectedCountView;
        Property property7 = View.ALPHA;
        float[] fArr7 = new float[1];
        fArr7[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(view3, property7, fArr7));
        TextView textView2 = this.pickerBottomLayout;
        if (textView2 == null || textView2.getVisibility() != 0) {
            View view4 = this.shadow[1];
            Property property8 = View.ALPHA;
            float[] fArr8 = new float[1];
            fArr8[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(view4, property8, fArr8));
        }
        this.animatorSet.playTogether(arrayList);
        this.animatorSet.setInterpolator(new DecelerateInterpolator());
        this.animatorSet.setDuration(180L);
        this.animatorSet.addListener(new AnimatorListenerAdapter() {
            {
                ShareAlert.this = this;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    if (!z) {
                        ShareAlert.this.frameLayout2.setVisibility(4);
                        ShareAlert.this.writeButtonContainer.setVisibility(4);
                    }
                    ShareAlert.this.animatorSet = null;
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (animator.equals(ShareAlert.this.animatorSet)) {
                    ShareAlert.this.animatorSet = null;
                }
            }
        });
        this.animatorSet.start();
        return true;
    }

    public void updateSelectedCount(int i) {
        if (this.selectedDialogs.size() == 0) {
            this.selectedCountView.setPivotX(0.0f);
            this.selectedCountView.setPivotY(0.0f);
            showCommentTextView(false);
            return;
        }
        this.selectedCountView.invalidate();
        if (!showCommentTextView(true) && i != 0) {
            this.selectedCountView.setPivotX(AndroidUtilities.dp(21.0f));
            this.selectedCountView.setPivotY(AndroidUtilities.dp(12.0f));
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[2];
            View view = this.selectedCountView;
            Property property = View.SCALE_X;
            float[] fArr = new float[2];
            fArr[0] = i == 1 ? 1.1f : 0.9f;
            fArr[1] = 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
            View view2 = this.selectedCountView;
            Property property2 = View.SCALE_Y;
            float[] fArr2 = new float[2];
            fArr2[0] = i != 1 ? 0.9f : 1.1f;
            fArr2[1] = 1.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(view2, property2, fArr2);
            animatorSet.playTogether(animatorArr);
            animatorSet.setInterpolator(new OvershootInterpolator());
            animatorSet.setDuration(180L);
            animatorSet.start();
            return;
        }
        this.selectedCountView.setPivotX(0.0f);
        this.selectedCountView.setPivotY(0.0f);
    }

    @Override
    public void dismiss() {
        EditTextEmoji editTextEmoji = this.commentTextView;
        if (editTextEmoji != null) {
            AndroidUtilities.hideKeyboard(editTextEmoji.getEditText());
        }
        this.fullyShown = false;
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
    }

    public class ShareDialogsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private ArrayList<TLRPC$Dialog> dialogs = new ArrayList<>();
        private LongSparseArray<TLRPC$Dialog> dialogsMap = new LongSparseArray<>();

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public class MyStoryDialog extends TLRPC$Dialog {
            private MyStoryDialog(ShareDialogsAdapter shareDialogsAdapter) {
                this.id = Long.MAX_VALUE;
            }
        }

        public ShareDialogsAdapter(Context context) {
            ShareAlert.this = r1;
            this.context = context;
            fetchDialogs();
        }

        public void fetchDialogs() {
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights;
            this.dialogs.clear();
            this.dialogsMap.clear();
            long j = UserConfig.getInstance(((BottomSheet) ShareAlert.this).currentAccount).clientUserId;
            if (ShareAlert.this.includeStory) {
                MyStoryDialog myStoryDialog = new MyStoryDialog();
                this.dialogs.add(myStoryDialog);
                this.dialogsMap.put(myStoryDialog.id, myStoryDialog);
            }
            if (!MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.isEmpty()) {
                TLRPC$Dialog tLRPC$Dialog = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).dialogsForward.get(0);
                this.dialogs.add(tLRPC$Dialog);
                this.dialogsMap.put(tLRPC$Dialog.id, tLRPC$Dialog);
            }
            ArrayList arrayList = new ArrayList();
            ArrayList<TLRPC$Dialog> allDialogs = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getAllDialogs();
            for (int i = 0; i < allDialogs.size(); i++) {
                TLRPC$Dialog tLRPC$Dialog2 = allDialogs.get(i);
                if (tLRPC$Dialog2 instanceof TLRPC$TL_dialog) {
                    long j2 = tLRPC$Dialog2.id;
                    if (j2 != j && !DialogObject.isEncryptedDialog(j2)) {
                        if (!DialogObject.isUserDialog(tLRPC$Dialog2.id)) {
                            TLRPC$Chat chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(-tLRPC$Dialog2.id));
                            if (chat != null && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tLRPC$TL_chatAdminRights = chat.admin_rights) != null && tLRPC$TL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (tLRPC$Dialog2.folder_id == 1) {
                                    arrayList.add(tLRPC$Dialog2);
                                } else {
                                    this.dialogs.add(tLRPC$Dialog2);
                                }
                                this.dialogsMap.put(tLRPC$Dialog2.id, tLRPC$Dialog2);
                            }
                        } else {
                            if (tLRPC$Dialog2.folder_id == 1) {
                                arrayList.add(tLRPC$Dialog2);
                            } else {
                                this.dialogs.add(tLRPC$Dialog2);
                            }
                            this.dialogsMap.put(tLRPC$Dialog2.id, tLRPC$Dialog2);
                        }
                    }
                }
            }
            this.dialogs.addAll(arrayList);
            if (ShareAlert.this.parentFragment != null) {
                int i2 = ShareAlert.this.parentFragment.shareAlertDebugMode;
                if (i2 == 1) {
                    ArrayList<TLRPC$Dialog> arrayList2 = this.dialogs;
                    ArrayList arrayList3 = new ArrayList(arrayList2.subList(0, Math.min(4, arrayList2.size())));
                    this.dialogs.clear();
                    this.dialogs.addAll(arrayList3);
                } else if (i2 == 2) {
                    while (!this.dialogs.isEmpty() && this.dialogs.size() < 80) {
                        ArrayList<TLRPC$Dialog> arrayList4 = this.dialogs;
                        arrayList4.add(arrayList4.get(arrayList4.size() - 1));
                    }
                }
            }
            notifyDataSetChanged();
        }

        @Override
        public int getItemCount() {
            int size = this.dialogs.size();
            return size != 0 ? size + 1 : size;
        }

        public TLRPC$Dialog getItem(int i) {
            int i2 = i - 1;
            if (i2 < 0 || i2 >= this.dialogs.size()) {
                return null;
            }
            return this.dialogs.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new ShareDialogCell(this.context, ShareAlert.this.darkTheme ? 1 : 0, ShareAlert.this.resourcesProvider) {
                    {
                        ShareDialogsAdapter.this = this;
                    }

                    @Override
                    public String repostToCustomName() {
                        if (ShareAlert.this.includeStoryFromMessage) {
                            return LocaleController.getString(R.string.RepostToStory);
                        }
                        return super.repostToCustomName();
                    }
                };
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareDialogCell shareDialogCell = (ShareDialogCell) viewHolder.itemView;
                TLRPC$Dialog item = getItem(i);
                if (item == null) {
                    return;
                }
                shareDialogCell.setTopic(ShareAlert.this.selectedDialogTopics.get(item), false);
                long j = item.id;
                shareDialogCell.setDialog(j, ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, null);
            }
        }
    }

    public class ShareTopicsAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private List<TLRPC$TL_forumTopic> topics;

        @Override
        public int getItemViewType(int i) {
            return i == 0 ? 1 : 0;
        }

        public ShareTopicsAdapter(Context context) {
            ShareAlert.this = r1;
            this.context = context;
        }

        @Override
        public int getItemCount() {
            List<TLRPC$TL_forumTopic> list = this.topics;
            if (list == null) {
                return 0;
            }
            return list.size() + 1;
        }

        public TLRPC$TL_forumTopic getItem(int i) {
            int i2 = i - 1;
            List<TLRPC$TL_forumTopic> list = this.topics;
            if (list == null || i2 < 0 || i2 >= list.size()) {
                return null;
            }
            return this.topics.get(i2);
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() != 1;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View shareTopicCell;
            if (i == 0) {
                shareTopicCell = new ShareTopicCell(this.context, ShareAlert.this.resourcesProvider);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
            } else {
                shareTopicCell = new View(this.context);
                shareTopicCell.setLayoutParams(new RecyclerView.LayoutParams(-1, ActionBar.getCurrentActionBarHeight()));
            }
            return new RecyclerListView.Holder(shareTopicCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                ShareTopicCell shareTopicCell = (ShareTopicCell) viewHolder.itemView;
                TLRPC$TL_forumTopic item = getItem(i);
                shareTopicCell.setTopic(ShareAlert.this.selectedTopicDialog, item, ShareAlert.this.selectedDialogs.indexOfKey((long) item.id) >= 0, null);
            }
        }
    }

    public class ShareSearchAdapter extends RecyclerListView.SelectionAdapter {
        DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapter;
        private Context context;
        int itemsCount;
        private int lastGlobalSearchId;
        int lastItemCont;
        private int lastLocalSearchId;
        private int lastSearchId;
        private String lastSearchText;
        private SearchAdapterHelper searchAdapterHelper;
        private Runnable searchRunnable;
        private Runnable searchRunnable2;
        private ArrayList<Object> searchResult = new ArrayList<>();
        int hintsCell = -1;
        int resentTitleCell = -1;
        int firstEmptyViewCell = -1;
        int recentDialogsStartRow = -1;
        int lastFilledItem = -1;
        boolean internalDialogsIsSearching = false;

        public ShareSearchAdapter(Context context) {
            ShareAlert.this = r2;
            this.context = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(this, false, r2) {
                @Override
                protected boolean filter(TLObject tLObject) {
                    return !(tLObject instanceof TLRPC$Chat) || ChatObject.canWriteToChat((TLRPC$Chat) tLObject);
                }
            };
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate(r2) {
                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
                }

                {
                    ShareSearchAdapter.this = this;
                }

                @Override
                public void onDataSetChanged(int i) {
                    ShareSearchAdapter.this.lastGlobalSearchId = i;
                    if (ShareSearchAdapter.this.lastLocalSearchId != i) {
                        ShareSearchAdapter.this.searchResult.clear();
                    }
                    ShareSearchAdapter shareSearchAdapter = ShareSearchAdapter.this;
                    int i2 = shareSearchAdapter.lastItemCont;
                    if (shareSearchAdapter.getItemCount() == 0 && !ShareSearchAdapter.this.searchAdapterHelper.isSearchInProgress()) {
                        ShareSearchAdapter shareSearchAdapter2 = ShareSearchAdapter.this;
                        if (!shareSearchAdapter2.internalDialogsIsSearching) {
                            ShareAlert.this.searchEmptyView.showProgress(false, true);
                            ShareSearchAdapter.this.notifyDataSetChanged();
                            ShareAlert.this.checkCurrentList(true);
                        }
                    }
                    ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i2);
                    ShareSearchAdapter.this.notifyDataSetChanged();
                    ShareAlert.this.checkCurrentList(true);
                }

                @Override
                public boolean canApplySearchResults(int i) {
                    return i == ShareSearchAdapter.this.lastSearchId;
                }
            });
        }

        private void searchDialogsInternal(final String str, final int i) {
            MessagesStorage.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    ShareAlert.ShareSearchAdapter.this.lambda$searchDialogsInternal$1(str, i);
                }
            });
        }

        public void lambda$searchDialogsInternal$1(java.lang.String r21, int r22) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ShareAlert.ShareSearchAdapter.lambda$searchDialogsInternal$1(java.lang.String, int):void");
        }

        public static int lambda$searchDialogsInternal$0(Object obj, Object obj2) {
            int i = ((DialogSearchResult) obj).date;
            int i2 = ((DialogSearchResult) obj2).date;
            if (i < i2) {
                return 1;
            }
            return i > i2 ? -1 : 0;
        }

        private void updateSearchResults(final ArrayList<Object> arrayList, final int i) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ShareAlert.ShareSearchAdapter.this.lambda$updateSearchResults$2(i, arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$2(int i, ArrayList arrayList) {
            if (i != this.lastSearchId) {
                return;
            }
            getItemCount();
            this.internalDialogsIsSearching = false;
            this.lastLocalSearchId = i;
            if (this.lastGlobalSearchId != i) {
                this.searchAdapterHelper.clear();
            }
            if (ShareAlert.this.gridView.getAdapter() != ShareAlert.this.searchAdapter) {
                ShareAlert shareAlert = ShareAlert.this;
                shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                ShareAlert.this.searchAdapter.notifyDataSetChanged();
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLObject tLObject = ((DialogSearchResult) arrayList.get(i2)).object;
                if (tLObject instanceof TLRPC$User) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putUser((TLRPC$User) tLObject, true);
                } else if (tLObject instanceof TLRPC$Chat) {
                    MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).putChat((TLRPC$Chat) tLObject, true);
                }
            }
            boolean z = !this.searchResult.isEmpty() && arrayList.isEmpty();
            if (this.searchResult.isEmpty()) {
                arrayList.isEmpty();
            }
            if (z) {
                ShareAlert shareAlert2 = ShareAlert.this;
                shareAlert2.topBeforeSwitch = shareAlert2.getCurrentTop();
            }
            this.searchResult = arrayList;
            this.searchAdapterHelper.mergeResults(arrayList, null);
            int i3 = this.lastItemCont;
            if (getItemCount() == 0 && !this.searchAdapterHelper.isSearchInProgress() && !this.internalDialogsIsSearching) {
                ShareAlert.this.searchEmptyView.showProgress(false, true);
            } else {
                ShareAlert.this.recyclerItemsEnterAnimator.showItemsAnimated(i3);
            }
            notifyDataSetChanged();
            ShareAlert.this.checkCurrentList(true);
        }

        public void searchDialogs(final String str) {
            if (str == null || !str.equals(this.lastSearchText)) {
                this.lastSearchText = str;
                if (this.searchRunnable != null) {
                    Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                    this.searchRunnable = null;
                }
                Runnable runnable = this.searchRunnable2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.searchRunnable2 = null;
                }
                this.searchResult.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, true, true, true, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                ShareAlert.this.checkCurrentList(true);
                if (TextUtils.isEmpty(str)) {
                    ShareAlert shareAlert = ShareAlert.this;
                    shareAlert.topBeforeSwitch = shareAlert.getCurrentTop();
                    this.lastSearchId = -1;
                    this.internalDialogsIsSearching = false;
                } else {
                    this.internalDialogsIsSearching = true;
                    final int i = this.lastSearchId + 1;
                    this.lastSearchId = i;
                    ShareAlert.this.searchEmptyView.showProgress(true, true);
                    DispatchQueue dispatchQueue = Utilities.searchQueue;
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            ShareAlert.ShareSearchAdapter.this.lambda$searchDialogs$4(str, i);
                        }
                    };
                    this.searchRunnable = runnable2;
                    dispatchQueue.postRunnable(runnable2, 300L);
                }
                ShareAlert.this.checkCurrentList(false);
            }
        }

        public void lambda$searchDialogs$4(final String str, final int i) {
            this.searchRunnable = null;
            searchDialogsInternal(str, i);
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    ShareAlert.ShareSearchAdapter.this.lambda$searchDialogs$3(i, str);
                }
            };
            this.searchRunnable2 = runnable;
            AndroidUtilities.runOnUIThread(runnable);
        }

        public void lambda$searchDialogs$3(int i, String str) {
            this.searchRunnable2 = null;
            if (i != this.lastSearchId) {
                return;
            }
            this.searchAdapterHelper.queryServerSearch(str, true, true, true, true, false, 0L, false, 0, i);
        }

        @Override
        public int getItemCount() {
            this.itemsCount = 0;
            this.hintsCell = -1;
            this.resentTitleCell = -1;
            this.recentDialogsStartRow = -1;
            this.lastFilledItem = -1;
            if (TextUtils.isEmpty(this.lastSearchText)) {
                int i = this.itemsCount;
                int i2 = i + 1;
                this.itemsCount = i2;
                this.firstEmptyViewCell = i;
                this.itemsCount = i2 + 1;
                this.hintsCell = i2;
                if (ShareAlert.this.recentSearchObjects.size() > 0) {
                    int i3 = this.itemsCount;
                    int i4 = i3 + 1;
                    this.itemsCount = i4;
                    this.resentTitleCell = i3;
                    this.recentDialogsStartRow = i4;
                    this.itemsCount = i4 + ShareAlert.this.recentSearchObjects.size();
                }
                int i5 = this.itemsCount;
                int i6 = i5 + 1;
                this.itemsCount = i6;
                this.lastFilledItem = i5;
                this.lastItemCont = i6;
                return i6;
            }
            int i7 = this.itemsCount;
            int i8 = i7 + 1;
            this.itemsCount = i8;
            this.firstEmptyViewCell = i7;
            int size = i8 + this.searchResult.size() + this.searchAdapterHelper.getLocalServerSearch().size();
            this.itemsCount = size;
            if (size == 1) {
                this.firstEmptyViewCell = -1;
                this.itemsCount = 0;
                this.lastItemCont = 0;
                return 0;
            }
            int i9 = size + 1;
            this.itemsCount = i9;
            this.lastFilledItem = size;
            this.lastItemCont = i9;
            return i9;
        }

        public TLRPC$Dialog getItem(int i) {
            int i2 = this.recentDialogsStartRow;
            if (i >= i2 && i2 >= 0) {
                int i3 = i - i2;
                if (i3 >= 0 && i3 < ShareAlert.this.recentSearchObjects.size()) {
                    TLObject tLObject = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i3)).object;
                    TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                    if (tLObject instanceof TLRPC$User) {
                        tLRPC$TL_dialog.id = ((TLRPC$User) tLObject).id;
                    } else if (tLObject instanceof TLRPC$Chat) {
                        tLRPC$TL_dialog.id = -((TLRPC$Chat) tLObject).id;
                    }
                    return tLRPC$TL_dialog;
                }
                return null;
            }
            int i4 = i - 1;
            if (i4 < 0) {
                return null;
            }
            if (i4 < this.searchResult.size()) {
                return ((DialogSearchResult) this.searchResult.get(i4)).dialog;
            }
            int size = i4 - this.searchResult.size();
            ArrayList<TLObject> localServerSearch = this.searchAdapterHelper.getLocalServerSearch();
            if (size < localServerSearch.size()) {
                TLObject tLObject2 = localServerSearch.get(size);
                TLRPC$TL_dialog tLRPC$TL_dialog2 = new TLRPC$TL_dialog();
                if (tLObject2 instanceof TLRPC$User) {
                    tLRPC$TL_dialog2.id = ((TLRPC$User) tLObject2).id;
                } else if (tLObject2 instanceof TLRPC$Chat) {
                    tLRPC$TL_dialog2.id = -((TLRPC$Chat) tLObject2).id;
                }
                return tLRPC$TL_dialog2;
            }
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return (viewHolder.getItemViewType() == 1 || viewHolder.getItemViewType() == 4) ? false : true;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            GraySectionCell graySectionCell;
            if (i == 0) {
                graySectionCell = new ProfileSearchCell(this.context, ShareAlert.this.resourcesProvider).useCustomPaints().showPremiumBlock(true);
            } else if (i == 2) {
                RecyclerListView recyclerListView = new RecyclerListView(this, this.context, ShareAlert.this.resourcesProvider) {
                    @Override
                    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                        if (getParent() != null && getParent().getParent() != null) {
                            ViewParent parent = getParent().getParent();
                            boolean z = true;
                            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                                z = false;
                            }
                            parent.requestDisallowInterceptTouchEvent(z);
                        }
                        return super.onInterceptTouchEvent(motionEvent);
                    }
                };
                recyclerListView.setItemAnimator(null);
                recyclerListView.setLayoutAnimation(null);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, this.context) {
                    @Override
                    public boolean supportsPredictiveItemAnimations() {
                        return false;
                    }
                };
                linearLayoutManager.setOrientation(0);
                recyclerListView.setLayoutManager(linearLayoutManager);
                DialogsSearchAdapter.CategoryAdapterRecycler categoryAdapterRecycler = new DialogsSearchAdapter.CategoryAdapterRecycler(this.context, ((BottomSheet) ShareAlert.this).currentAccount, true, true, ShareAlert.this.resourcesProvider) {
                    {
                        ShareSearchAdapter.this = this;
                    }

                    @Override
                    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i2) {
                        TLRPC$Chat tLRPC$Chat;
                        String str;
                        HintDialogCell hintDialogCell = (HintDialogCell) viewHolder.itemView;
                        if (ShareAlert.this.darkTheme || ShareAlert.this.forceDarkThemeForHint) {
                            hintDialogCell.setColors(Theme.key_voipgroup_nameText, Theme.key_voipgroup_inviteMembersBackground);
                        }
                        TLRPC$TL_topPeer tLRPC$TL_topPeer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i2);
                        TLRPC$Peer tLRPC$Peer = tLRPC$TL_topPeer.peer;
                        long j = tLRPC$Peer.user_id;
                        TLRPC$User tLRPC$User = null;
                        if (j != 0) {
                            tLRPC$User = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tLRPC$TL_topPeer.peer.user_id));
                            tLRPC$Chat = null;
                        } else {
                            long j2 = tLRPC$Peer.channel_id;
                            if (j2 != 0) {
                                j = -j2;
                                tLRPC$Chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tLRPC$TL_topPeer.peer.channel_id));
                            } else {
                                long j3 = tLRPC$Peer.chat_id;
                                if (j3 != 0) {
                                    j = -j3;
                                    tLRPC$Chat = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getChat(Long.valueOf(tLRPC$TL_topPeer.peer.chat_id));
                                } else {
                                    tLRPC$Chat = null;
                                    j = 0;
                                }
                            }
                        }
                        boolean z = j == hintDialogCell.getDialogId();
                        hintDialogCell.setTag(Long.valueOf(j));
                        if (tLRPC$User != null) {
                            str = UserObject.getFirstName(tLRPC$User);
                        } else {
                            str = tLRPC$Chat != null ? tLRPC$Chat.title : "";
                        }
                        hintDialogCell.setDialog(j, true, str);
                        hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, z);
                    }
                };
                this.categoryAdapter = categoryAdapterRecycler;
                recyclerListView.setAdapter(categoryAdapterRecycler);
                recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                    @Override
                    public final void onItemClick(View view, int i2) {
                        ShareAlert.ShareSearchAdapter.this.lambda$onCreateViewHolder$5(view, i2);
                    }
                });
                graySectionCell = recyclerListView;
            } else if (i == 3) {
                GraySectionCell graySectionCell2 = new GraySectionCell(this.context, ShareAlert.this.resourcesProvider);
                graySectionCell2.setTextColor(ShareAlert.this.darkTheme ? Theme.key_voipgroup_nameText : Theme.key_graySectionText);
                ShareAlert shareAlert = ShareAlert.this;
                graySectionCell2.setBackgroundColor(shareAlert.getThemedColor(shareAlert.darkTheme ? Theme.key_voipgroup_searchBackground : Theme.key_graySection));
                graySectionCell2.setText(LocaleController.getString("Recent", R.string.Recent));
                graySectionCell = graySectionCell2;
            } else if (i == 4) {
                graySectionCell = new View(this.context) {
                    {
                        ShareSearchAdapter.this = this;
                    }

                    @Override
                    protected void onMeasure(int i2, int i3) {
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(ShareAlert.this.searchLayoutManager.lastItemHeight, 1073741824));
                    }
                };
            } else if (i == 5) {
                View shareDialogCell = new ShareDialogCell(this.context, ShareAlert.this.darkTheme ? 1 : 0, ShareAlert.this.resourcesProvider);
                shareDialogCell.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(100.0f)));
                graySectionCell = shareDialogCell;
            } else {
                View view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp((!ShareAlert.this.darkTheme || ShareAlert.this.linkToCopy[1] == null) ? 56.0f : 109.0f)));
                graySectionCell = view;
            }
            return new RecyclerListView.Holder(graySectionCell);
        }

        public void lambda$onCreateViewHolder$5(View view, int i) {
            HintDialogCell hintDialogCell = (HintDialogCell) view;
            TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            TLRPC$Peer tLRPC$Peer = MediaDataController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).hints.get(i).peer;
            long j = tLRPC$Peer.user_id;
            if (j == 0) {
                long j2 = tLRPC$Peer.channel_id;
                if (j2 == 0) {
                    j2 = tLRPC$Peer.chat_id;
                    if (j2 == 0) {
                        j = 0;
                    }
                }
                j = -j2;
            }
            if (hintDialogCell.isBlocked()) {
                ShareAlert.this.showPremiumBlockedToast(hintDialogCell, j);
                return;
            }
            tLRPC$TL_dialog.id = j;
            ShareAlert.this.selectDialog(null, tLRPC$TL_dialog);
            hintDialogCell.setChecked(ShareAlert.this.selectedDialogs.indexOfKey(j) >= 0, true);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            TLObject tLObject;
            long j;
            String str;
            String str2;
            long j2;
            int indexOfIgnoreCase;
            TLRPC$TL_encryptedChat tLRPC$TL_encryptedChat;
            TLObject tLObject2;
            long j3;
            String lastFoundUsername;
            int indexOfIgnoreCase2;
            if (viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 5) {
                TLRPC$TL_encryptedChat tLRPC$TL_encryptedChat2 = null;
                long j4 = 0;
                String str3 = null;
                if (TextUtils.isEmpty(this.lastSearchText)) {
                    int i2 = this.recentDialogsStartRow;
                    if (i2 < 0 || i < i2) {
                        tLRPC$TL_encryptedChat = null;
                        tLObject2 = null;
                    } else {
                        TLObject tLObject3 = ((DialogsSearchAdapter.RecentSearchObject) ShareAlert.this.recentSearchObjects.get(i - i2)).object;
                        if (tLObject3 instanceof TLRPC$User) {
                            TLRPC$User tLRPC$User = (TLRPC$User) tLObject3;
                            j3 = tLRPC$User.id;
                            str3 = ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name);
                        } else if (tLObject3 instanceof TLRPC$Chat) {
                            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) tLObject3;
                            j3 = -tLRPC$Chat.id;
                            str3 = tLRPC$Chat.title;
                        } else {
                            if (tLObject3 instanceof TLRPC$TL_encryptedChat) {
                                tLRPC$TL_encryptedChat2 = (TLRPC$TL_encryptedChat) tLObject3;
                                TLRPC$User user = MessagesController.getInstance(((BottomSheet) ShareAlert.this).currentAccount).getUser(Long.valueOf(tLRPC$TL_encryptedChat2.user_id));
                                if (user != null) {
                                    j4 = user.id;
                                    str3 = ContactsController.formatName(user.first_name, user.last_name);
                                }
                            }
                            lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                            if (!TextUtils.isEmpty(lastFoundUsername) || str3 == null || (indexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str3.toString(), lastFoundUsername)) == -1) {
                                tLObject2 = tLObject3;
                                tLRPC$TL_encryptedChat = tLRPC$TL_encryptedChat2;
                            } else {
                                ?? spannableStringBuilder = new SpannableStringBuilder(str3);
                                spannableStringBuilder.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ShareAlert.this.resourcesProvider), indexOfIgnoreCase2, lastFoundUsername.length() + indexOfIgnoreCase2, 33);
                                tLObject2 = tLObject3;
                                tLRPC$TL_encryptedChat = tLRPC$TL_encryptedChat2;
                                str3 = spannableStringBuilder;
                            }
                        }
                        j4 = j3;
                        lastFoundUsername = this.searchAdapterHelper.getLastFoundUsername();
                        if (TextUtils.isEmpty(lastFoundUsername)) {
                        }
                        tLObject2 = tLObject3;
                        tLRPC$TL_encryptedChat = tLRPC$TL_encryptedChat2;
                    }
                    View view = viewHolder.itemView;
                    if (view instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) view).setData(tLObject2, tLRPC$TL_encryptedChat, str3, null, false, false);
                        ((ProfileSearchCell) viewHolder.itemView).useSeparator = i < getItemCount() - 2;
                        return;
                    } else if (view instanceof ShareDialogCell) {
                        ((ShareDialogCell) view).setDialog(j4, ShareAlert.this.selectedDialogs.indexOfKey(j4) >= 0, str3);
                        return;
                    } else {
                        return;
                    }
                }
                int i3 = i - 1;
                if (i3 < this.searchResult.size()) {
                    DialogSearchResult dialogSearchResult = (DialogSearchResult) this.searchResult.get(i3);
                    j2 = dialogSearchResult.dialog.id;
                    str2 = dialogSearchResult.name;
                    tLObject = null;
                } else {
                    i3 -= this.searchResult.size();
                    tLObject = this.searchAdapterHelper.getLocalServerSearch().get(i3);
                    if (tLObject instanceof TLRPC$User) {
                        TLRPC$User tLRPC$User2 = (TLRPC$User) tLObject;
                        j = tLRPC$User2.id;
                        str = ContactsController.formatName(tLRPC$User2.first_name, tLRPC$User2.last_name);
                    } else {
                        TLRPC$Chat tLRPC$Chat2 = (TLRPC$Chat) tLObject;
                        j = -tLRPC$Chat2.id;
                        str = tLRPC$Chat2.title;
                    }
                    String lastFoundUsername2 = this.searchAdapterHelper.getLastFoundUsername();
                    if (TextUtils.isEmpty(lastFoundUsername2) || str == null || (indexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str.toString(), lastFoundUsername2)) == -1) {
                        str2 = str;
                    } else {
                        ?? spannableStringBuilder2 = new SpannableStringBuilder(str);
                        spannableStringBuilder2.setSpan(new ForegroundColorSpanThemable(Theme.key_windowBackgroundWhiteBlueText4, ShareAlert.this.resourcesProvider), indexOfIgnoreCase, lastFoundUsername2.length() + indexOfIgnoreCase, 33);
                        str2 = spannableStringBuilder2;
                    }
                    j2 = j;
                }
                View view2 = viewHolder.itemView;
                if (view2 instanceof ProfileSearchCell) {
                    ((ProfileSearchCell) view2).setData(tLObject, null, str2, null, false, false);
                    ((ProfileSearchCell) viewHolder.itemView).useSeparator = i3 < getItemCount() - 2;
                } else if (view2 instanceof ShareDialogCell) {
                    ((ShareDialogCell) view2).setDialog(j2, ShareAlert.this.selectedDialogs.indexOfKey(j2) >= 0, str2);
                }
            } else if (viewHolder.getItemViewType() == 2) {
                ((RecyclerListView) viewHolder.itemView).getAdapter().notifyDataSetChanged();
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == this.lastFilledItem) {
                return 4;
            }
            if (i == this.firstEmptyViewCell) {
                return 1;
            }
            if (i == this.hintsCell) {
                return 2;
            }
            if (i == this.resentTitleCell) {
                return 3;
            }
            return TextUtils.isEmpty(this.lastSearchText) ? 0 : 5;
        }

        public int getSpanSize(int i, int i2) {
            if (i2 == this.hintsCell || i2 == this.resentTitleCell || i2 == this.firstEmptyViewCell || i2 == this.lastFilledItem || getItemViewType(i2) == 0) {
                return i;
            }
            return 1;
        }
    }

    public void checkCurrentList(boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(this.searchView.searchEditText.getText()) || ((this.keyboardVisible && this.searchView.searchEditText.hasFocus()) || this.searchWasVisibleBeforeTopics)) {
            this.updateSearchAdapter = true;
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, false, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, true);
            }
        } else {
            if (this.selectedTopicDialog == null) {
                AndroidUtilities.updateViewVisibilityAnimated(this.gridView, true, 0.98f, true);
                AndroidUtilities.updateViewVisibilityAnimated(this.searchGridView, false);
            }
            z2 = false;
        }
        if (this.searchIsVisible != z2 || z) {
            this.searchIsVisible = z2;
            this.searchAdapter.notifyDataSetChanged();
            this.listAdapter.notifyDataSetChanged();
            if (this.searchIsVisible) {
                if (this.lastOffset == Integer.MAX_VALUE) {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, -this.searchGridView.getPaddingTop());
                } else {
                    ((LinearLayoutManager) this.searchGridView.getLayoutManager()).scrollToPositionWithOffset(0, this.lastOffset - this.searchGridView.getPaddingTop());
                }
                this.searchAdapter.searchDialogs(this.searchView.searchEditText.getText().toString());
            } else if (this.lastOffset == Integer.MAX_VALUE) {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            } else {
                this.layoutManager.scrollToPositionWithOffset(0, 0);
            }
        }
    }
}
