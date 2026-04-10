package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityInterface;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Forum.ForumBubbleDrawable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchDownloadsContainer;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Components.UnreadCounterTextView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.TopicsFragment;

public class TopicsFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ChatActivityInterface, RightSlidingDialogContainer.BaseFragmentWithFullscreen, MainTabsActivity.TabFragmentDelegate {
    private static HashSet settingsPreloaded = new HashSet();
    Adapter adapter;
    private ActionBarMenuSubItem addMemberSubMenu;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private boolean allowSwipeDuringCurrentTouch;
    boolean animateSearchWithScale;
    boolean animatedUpdateEnabled;
    ChatAvatarContainer avatarContainer;
    private View blurredView;
    private ActionBarMenuSubItem boostGroupSubmenu;
    private TL_stories.TL_premium_boostsStatus boostsStatus;
    private int bottomButtonType;
    private UnreadCounterTextView bottomOverlayChatText;
    private FrameLayout bottomOverlayContainer;
    private RadialProgressView bottomOverlayProgress;
    private boolean bottomPannelVisible;
    boolean canShowCreateTopic;
    private boolean canShowHiddenArchive;
    private boolean canShowProgress;
    TLRPC.ChatFull chatFull;
    final long chatId;
    private ImageView closeReportSpam;
    private ActionBarMenuSubItem closeTopic;
    SizeNotifierFrameLayout contentView;
    private boolean createGroupCall;
    private ActionBarMenuSubItem createTopicSubmenu;
    private ActionBarMenuSubItem deleteChatSubmenu;
    private ActionBarMenuItem deleteItem;
    private int dialogChangeFinished;
    private int dialogInsertFinished;
    private int dialogRemoveFinished;
    DialogsActivity dialogsActivity;
    private boolean disableActionBarScrolling;
    private View emptyView;
    private EmptyViewContainer emptyViewContainer;
    HashSet excludeTopics;
    private boolean finishDialogRightSlidingPreviewOnTransitionEnd;
    FragmentFloatingButton floatingButton;
    ArrayList forumTopics;
    private boolean forumTopicsListFrozen;
    FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private ArrayList frozenForumTopicsList;
    FrameLayout fullscreenView;
    private View generalTopicViewMoving;
    private ChatObject.Call groupCall;
    private int hiddenCount;
    private boolean hiddenShown;
    private ActionBarMenuItem hideItem;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private boolean iBlur3Invalidated;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private boolean ignoreDiffUtil;
    boolean isSlideBackTransition;
    private DefaultItemAnimator itemAnimator;
    private ItemTouchHelper itemTouchHelper;
    private TouchHelperCallback itemTouchHelperCallback;
    RecyclerItemsEnterAnimator itemsEnterAnimator;
    private boolean joinRequested;
    private boolean lastCallCheckFromServer;
    private int lastItemsCount;
    LinearLayoutManager layoutManager;
    private boolean loadingTopics;
    private ArrayList movingDialogFilters;
    private boolean mute;
    private ActionBarMenuItem muteItem;
    private int navigationBarHeight;
    private final AnimationNotificationsLocker notificationsLocker;
    OnTopicSelectedListener onTopicSelectedListener;
    private boolean openAnimationEnded;
    private boolean openVideoChat;
    private final boolean openedForBotShare;
    private final boolean openedForForward;
    private final boolean openedForQuote;
    private final boolean openedForReply;
    private final boolean openedForSelect;
    private ActionBarMenuItem other;
    ActionBarMenuItem otherItem;
    public DialogsActivity parentDialogsActivity;
    private ChatActivityMemberRequestsDelegate pendingRequestsDelegate;
    private ActionBarMenuItem pinItem;
    private PullForegroundDrawable pullForegroundDrawable;
    private int pullViewState;
    private ActionBarMenuSubItem readItem;
    private TopicsRecyclerView recyclerListView;
    private boolean removeFragmentOnTransitionEnd;
    private boolean reordering;
    private ActionBarMenuSubItem reportSubmenu;
    private ActionBarMenuSubItem restartTopic;
    private RecyclerAnimationScrollHelper scrollHelper;
    private boolean scrollToTop;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private float searchAnimationProgress;
    ValueAnimator searchAnimator;
    private MessagesSearchContainer searchContainer;
    private ActionBarMenuItem searchItem;
    private ViewPagerFixed.TabsView searchTabsView;
    public boolean searching;
    private NumberTextView selectedDialogsCountTextView;
    private long selectedTopicForTablet;
    HashSet selectedTopics;
    private ActionBarMenuItem showItem;
    ValueAnimator slideBackTransitionAnimator;
    float slideFragmentProgress;
    private long startArchivePullingTime;
    ChatActivity.ThemeDelegate themeDelegate;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private final TopicsController topicsController;
    StickerEmptyView topicsEmptyView;
    float transitionPadding;
    private ActionBarMenuItem unpinItem;
    private boolean updateAnimated;
    private String voiceChatHash;
    private boolean waitingForScrollFinished;

    public interface OnTopicSelectedListener {
        void onTopicSelected(TLRPC.TL_forumTopic tL_forumTopic);
    }

    public static boolean lambda$chekActionMode$23(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$onDialogAnimationFinished$11() {
    }

    @Override
    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        return MainTabsActivity.TabFragmentDelegate.CC.$default$canParentTabsSlide(this, motionEvent, z);
    }

    @Override
    public void checkAndUpdateAvatar() {
        ChatActivityInterface.CC.$default$checkAndUpdateAvatar(this);
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public TLRPC.User getCurrentUser() {
        return ChatActivityInterface.CC.$default$getCurrentUser(this);
    }

    @Override
    public long getMergeDialogId() {
        return ChatActivityInterface.CC.$default$getMergeDialogId(this);
    }

    @Override
    public long getTopicId() {
        return ChatActivityInterface.CC.$default$getTopicId(this);
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public boolean openedWithLivestream() {
        return ChatActivityInterface.CC.$default$openedWithLivestream(this);
    }

    @Override
    public void scrollToMessageId(int i, int i2, boolean z, int i3, boolean z2, int i4) {
        ChatActivityInterface.CC.$default$scrollToMessageId(this, i, i2, z, i3, z2, i4);
    }

    @Override
    public boolean shouldShowImport() {
        return ChatActivityInterface.CC.$default$shouldShowImport(this);
    }

    @Override
    public View getFullscreenView() {
        return this.fullscreenView;
    }

    public TopicsFragment(Bundle bundle) {
        super(bundle);
        this.forumTopics = new ArrayList();
        this.frozenForumTopicsList = new ArrayList();
        this.adapter = new Adapter();
        this.hiddenCount = 0;
        this.hiddenShown = true;
        this.animatedUpdateEnabled = true;
        this.bottomPannelVisible = true;
        this.searchAnimationProgress = 0.0f;
        this.selectedTopics = new HashSet();
        this.mute = false;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.slideFragmentProgress = 1.0f;
        this.movingDialogFilters = new ArrayList();
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        this.chatId = this.arguments.getLong("chat_id", 0L);
        this.openedForSelect = this.arguments.getBoolean("for_select", false);
        this.openedForForward = this.arguments.getBoolean("forward_to", false);
        this.openedForBotShare = this.arguments.getBoolean("bot_share_to", false);
        this.openedForQuote = this.arguments.getBoolean("quote", false);
        this.openedForReply = this.arguments.getBoolean("reply_to", false);
        this.voiceChatHash = this.arguments.getString("voicechat", null);
        this.openVideoChat = this.arguments.getBoolean("videochat", false);
        this.topicsController = getMessagesController().getTopicsController();
        SharedPreferences preferences = getUserConfig().getPreferences();
        this.canShowProgress = !preferences.getBoolean("topics_end_reached_" + r2, false);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (Build.VERSION.SDK_INT >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            this.iBlur3SourceGlassFrosted = new BlurredBackgroundSourceRenderNode(null);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode;
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            return;
        }
        this.scrollableViewNoiseSuppressor = null;
        this.iBlur3SourceGlassFrosted = null;
        this.iBlur3SourceGlass = null;
        this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
    }

    private void checkGroupCallJoin(boolean z) {
        String str;
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        TLRPC.ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
        if (this.groupCall == null || ((str = this.voiceChatHash) == null && !this.openVideoChat)) {
            if (this.voiceChatHash != null && z && chatFull != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
                BulletinFactory.of(this).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.LinkHashExpired)).show();
                this.voiceChatHash = null;
            }
            this.lastCallCheckFromServer = false;
            return;
        }
        VoIPHelper.startCall(chat, null, str, this.createGroupCall, Boolean.valueOf(!r1.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
        this.voiceChatHash = null;
        this.openVideoChat = false;
    }

    public static BaseFragment getTopicsOrChat(BaseFragment baseFragment, Bundle bundle) {
        return getTopicsOrChat(baseFragment.getMessagesController(), baseFragment.getMessagesStorage(), bundle);
    }

    public static BaseFragment getTopicsOrChat(LaunchActivity launchActivity, Bundle bundle) {
        return getTopicsOrChat(MessagesController.getInstance(launchActivity.currentAccount), MessagesStorage.getInstance(launchActivity.currentAccount), bundle);
    }

    private static BaseFragment getTopicsOrChat(MessagesController messagesController, MessagesStorage messagesStorage, Bundle bundle) {
        long j = bundle.getLong("chat_id");
        if (j != 0) {
            TLRPC.Dialog dialog = messagesController.getDialog(-j);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
            TLRPC.ChatFull chatFull = messagesController.getChatFull(j);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
        }
        return new TopicsFragment(bundle);
    }

    public static void prepareToSwitchAnimation(org.telegram.ui.ChatActivity r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.prepareToSwitchAnimation(org.telegram.ui.ChatActivity):void");
    }

    @Override
    public View createView(Context context) throws InterruptedException {
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        int i = 0;
        this.additionNavigationBarHeight = (dialogsActivity == null || !dialogsActivity.hasMainTabs) ? 0 : AndroidUtilities.dp(72.0f);
        DialogsActivity dialogsActivity2 = this.parentDialogsActivity;
        this.additionFloatingButtonOffset = (dialogsActivity2 == null || !dialogsActivity2.hasMainTabs) ? 0 : AndroidUtilities.dp(64.0f);
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private Paint actionBarPaint;
            private boolean ignoreLayout;

            {
                setWillNotDraw(false);
                this.actionBarPaint = new Paint();
            }

            public int getActionBarFullHeight() {
                return (int) (((BaseFragment) TopicsFragment.this).actionBar.getHeight() + (((TopicsFragment.this.searchTabsView == null || TopicsFragment.this.searchTabsView.getVisibility() == 8) ? 0.0f : TopicsFragment.this.searchTabsView.getMeasuredHeight()) * TopicsFragment.this.searchAnimationProgress));
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == ((BaseFragment) TopicsFragment.this).actionBar && !TopicsFragment.this.isInPreviewMode()) {
                    int y = (int) (((BaseFragment) TopicsFragment.this).actionBar.getY() + getActionBarFullHeight());
                    TopicsFragment.this.getParentLayout().drawHeaderShadow(canvas, (int) ((1.0f - TopicsFragment.this.searchAnimationProgress) * 255.0f), y);
                    if (TopicsFragment.this.searchAnimationProgress > 0.0f) {
                        if (TopicsFragment.this.searchAnimationProgress < 1.0f) {
                            int alpha = Theme.dividerPaint.getAlpha();
                            Theme.dividerPaint.setAlpha((int) (alpha * TopicsFragment.this.searchAnimationProgress));
                            float f = y;
                            canvas.drawLine(0.0f, f, getMeasuredWidth(), f, Theme.dividerPaint);
                            Theme.dividerPaint.setAlpha(alpha);
                        } else {
                            float f2 = y;
                            canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, Theme.dividerPaint);
                        }
                    }
                }
                return super.drawChild(canvas, view, j);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                int size = View.MeasureSpec.getSize(i2);
                int size2 = View.MeasureSpec.getSize(i3);
                if (TopicsFragment.this.bottomOverlayContainer != null) {
                    this.ignoreLayout = true;
                    TopicsFragment.this.bottomOverlayContainer.getLayoutParams().height = AndroidUtilities.dp(51.0f) + TopicsFragment.this.navigationBarHeight;
                    TopicsFragment.this.bottomOverlayContainer.setPadding(0, 0, 0, TopicsFragment.this.navigationBarHeight);
                    this.ignoreLayout = false;
                }
                int measuredHeight = 0;
                for (int i4 = 0; i4 < getChildCount(); i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt instanceof ActionBar) {
                        childAt.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                        measuredHeight = childAt.getMeasuredHeight();
                    }
                }
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt2 = getChildAt(i5);
                    if (!(childAt2 instanceof ActionBar)) {
                        if (childAt2.getFitsSystemWindows()) {
                            measureChildWithMargins(childAt2, i2, 0, i3, 0);
                        } else {
                            measureChildWithMargins(childAt2, i2, 0, i3, measuredHeight);
                        }
                    }
                }
                setMeasuredDimension(size, size2);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            protected void onLayout(boolean r10, int r11, int r12, int r13, int r14) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.AnonymousClass1.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
                for (int i2 = 0; i2 < TopicsFragment.this.recyclerListView.getChildCount(); i2++) {
                    View childAt = TopicsFragment.this.recyclerListView.getChildAt(i2);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                        int iSave = canvas.save();
                        canvas.translate(TopicsFragment.this.recyclerListView.getX() + childAt.getX(), getY() + TopicsFragment.this.recyclerListView.getY() + childAt.getY());
                        if (arrayList != null && (childAt instanceof SizeNotifierFrameLayout.IViewWithInvalidateCallback)) {
                            arrayList.add((SizeNotifierFrameLayout.IViewWithInvalidateCallback) childAt);
                        }
                        childAt.draw(canvas);
                        canvas.restoreToCount(iSave);
                    }
                }
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (Build.VERSION.SDK_INT >= 31 && TopicsFragment.this.scrollableViewNoiseSuppressor != null) {
                    TopicsFragment.this.blur3_InvalidateBlur();
                    DialogsActivity dialogsActivity3 = TopicsFragment.this.parentDialogsActivity;
                    int measuredWidth = dialogsActivity3 != null ? dialogsActivity3.fragmentView.getMeasuredWidth() : getMeasuredWidth();
                    DialogsActivity dialogsActivity4 = TopicsFragment.this.parentDialogsActivity;
                    int measuredHeight = dialogsActivity4 != null ? dialogsActivity4.fragmentView.getMeasuredHeight() : getMeasuredHeight();
                    if (TopicsFragment.this.iBlur3SourceGlassFrosted != null && !TopicsFragment.this.iBlur3SourceGlassFrosted.inRecording() && (TopicsFragment.this.iBlur3SourceGlassFrosted.needUpdateDisplayList(measuredWidth, measuredHeight) || TopicsFragment.this.iBlur3Invalidated)) {
                        TopicsFragment.this.scrollableViewNoiseSuppressor.draw(TopicsFragment.this.iBlur3SourceGlassFrosted.beginRecording(measuredWidth, measuredHeight), -3);
                        TopicsFragment.this.iBlur3SourceGlassFrosted.endRecording();
                    }
                    if (TopicsFragment.this.iBlur3SourceGlass != null && !TopicsFragment.this.iBlur3SourceGlass.inRecording() && (TopicsFragment.this.iBlur3SourceGlass.needUpdateDisplayList(measuredWidth, measuredHeight) || TopicsFragment.this.iBlur3Invalidated)) {
                        TopicsFragment.this.scrollableViewNoiseSuppressor.draw(TopicsFragment.this.iBlur3SourceGlass.beginRecording(measuredWidth, measuredHeight), -2);
                        TopicsFragment.this.iBlur3SourceGlass.endRecording();
                    }
                    TopicsFragment.this.iBlur3Invalidated = false;
                }
                super.dispatchDraw(canvas);
                if (TopicsFragment.this.isInPreviewMode()) {
                    this.actionBarPaint.setColor(TopicsFragment.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    this.actionBarPaint.setAlpha((int) (TopicsFragment.this.searchAnimationProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, this.actionBarPaint);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getHeight(), Theme.dividerPaint);
                }
                TopicsFragment topicsFragment = TopicsFragment.this;
                if (topicsFragment.parentDialogsActivity == null) {
                    AndroidUtilities.drawNavigationBarProtection(canvas, this, topicsFragment.getThemedColor(Theme.key_windowBackgroundWhite), TopicsFragment.this.navigationBarHeight);
                }
            }

            @Override
            public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
                if (Build.VERSION.SDK_INT < 29 || !SharedConfig.chatBlurEnabled() || TopicsFragment.this.iBlur3SourceGlassFrosted == null) {
                    canvas.drawRect(rect, paint);
                    return;
                }
                canvas.save();
                canvas.translate(0.0f, -f);
                TopicsFragment.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(178);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
            }
        };
        this.contentView = sizeNotifierFrameLayout;
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
        this.actionBar.setAddToContainer(false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setClipContent(true);
        this.actionBar.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        if (this.inPreviewMode) {
            this.actionBar.setBackgroundColor(0);
            this.actionBar.setInterceptTouches(false);
        }
        this.actionBar.setBackButtonDrawable(new BackDrawable(false));
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass2(context));
        this.actionBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$0(view);
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.parentDialogsActivity != null) {
            ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
            this.searchItem = actionBarMenuItemAddItem;
            actionBarMenuItemAddItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createView$1(view);
                }
            });
        } else {
            ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
            this.searchItem = actionBarMenuItemAddItem2;
            actionBarMenuItemAddItem2.setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
                }

                @Override
                public void onSearchExpand() {
                    TopicsFragment.this.animateToSearchView(true);
                    TopicsFragment.this.searchContainer.setSearchString("");
                    TopicsFragment.this.searchContainer.setAlpha(0.0f);
                    TopicsFragment.this.searchContainer.emptyView.showProgress(true, false);
                }

                @Override
                public void onSearchCollapse() {
                    TopicsFragment.this.animateToSearchView(false);
                }

                @Override
                public void onTextChanged(EditText editText) {
                    TopicsFragment.this.searchContainer.setSearchString(editText.getText().toString());
                }
            });
            this.searchItem.setSearchPaddingStart(56);
            this.searchItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
            EditTextBoldCursor searchField = this.searchItem.getSearchField();
            searchField.setTextColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            searchField.setHintTextColor(getThemedColor(Theme.key_player_time));
            searchField.setCursorColor(getThemedColor(Theme.key_chat_messagePanelCursor));
        }
        ActionBarMenuItem actionBarMenuItemAddItem3 = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, this.themeDelegate);
        this.other = actionBarMenuItemAddItem3;
        actionBarMenuItemAddItem3.addSubItem(1, R.drawable.msg_discussion, LocaleController.getString(R.string.TopicViewAsMessages));
        this.addMemberSubMenu = this.other.addSubItem(2, R.drawable.msg_addcontact, LocaleController.getString(R.string.AddMember));
        ActionBarMenuItem actionBarMenuItem = this.other;
        int i2 = R.raw.boosts;
        this.boostGroupSubmenu = actionBarMenuItem.addSubItem(14, 0, new RLottieDrawable(i2, "" + i2, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), LocaleController.getString(R.string.BoostingBoostGroupMenu), true, false);
        ActionBarMenuItem actionBarMenuItem2 = this.other;
        int i3 = R.drawable.msg_topic_create;
        int i4 = R.string.CreateTopic;
        this.createTopicSubmenu = actionBarMenuItem2.addSubItem(3, i3, LocaleController.getString(i4));
        this.reportSubmenu = this.other.addSubItem(15, R.drawable.msg_report, LocaleController.getString(R.string.ReportChat));
        this.deleteChatSubmenu = this.other.addSubItem(11, R.drawable.msg_leave, LocaleController.getString(R.string.LeaveMegaMenu), this.themeDelegate);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, this, false, this.resourceProvider);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.avatarContainer.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        this.avatarContainer.allowDrawStories = getDialogId() < 0;
        this.avatarContainer.setClipChildren(false);
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        if (!this.openedForSelect) {
            this.avatarContainer.getAvatarImageView().setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    TopicsFragment.this.openProfile(true);
                }
            });
        }
        this.recyclerListView = new TopicsRecyclerView(context) {
            @Override
            protected void onLayout(boolean z, int i5, int i6, int i7, int i8) {
                super.onLayout(z, i5, i6, i7, i8);
                TopicsFragment.this.checkForLoadMore();
            }

            @Override
            public boolean emptyViewIsVisible() {
                if (getAdapter() == null || isFastScrollAnimationRunning()) {
                    return false;
                }
                ArrayList arrayList = TopicsFragment.this.forumTopics;
                return (arrayList == null || arrayList.size() != 1 || TopicsFragment.this.forumTopics.get(0) == null || ((Item) TopicsFragment.this.forumTopics.get(0)).topic == null || ((Item) TopicsFragment.this.forumTopics.get(0)).topic.id != 1) ? getAdapter().getItemCount() <= 1 : getAdapter().getItemCount() <= 2;
            }
        };
        this.iBlur3FactoryLiquidGlass.setSourceRootView(new ViewPositionWatcher(this.contentView), this.contentView);
        TopicsRecyclerView topicsRecyclerView = this.recyclerListView;
        DialogsActivity dialogsActivity3 = this.parentDialogsActivity;
        ViewGroup viewGroup = dialogsActivity3 != null ? (ViewGroup) dialogsActivity3.getFragmentView() : this.contentView;
        final TopicsRecyclerView topicsRecyclerView2 = this.recyclerListView;
        Objects.requireNonNull(topicsRecyclerView2);
        this.iBlur3Capture = new ViewGroupPartRenderer(topicsRecyclerView, viewGroup, new ViewGroupPartRenderer.DrawChildMethod() {
            @Override
            public final boolean drawChild(Canvas canvas, View view, long j) {
                return topicsRecyclerView2.drawChild(canvas, view, j);
            }
        });
        this.recyclerListView.addEdgeEffectListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$2();
            }
        });
        SpannableString spannableString = new SpannableString("#");
        ForumUtilities.GeneralTopicDrawable generalTopicDrawableCreateGeneralTopicDrawable = ForumUtilities.createGeneralTopicDrawable(getContext(), 0.85f, -1, false);
        generalTopicDrawableCreateGeneralTopicDrawable.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(generalTopicDrawableCreateGeneralTopicDrawable, 2), 0, 1, 33);
        PullForegroundDrawable pullForegroundDrawable = new PullForegroundDrawable(AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString(R.string.AccReleaseForGeneral), spannableString)) {
            @Override
            protected float getViewOffset() {
                return TopicsFragment.this.recyclerListView.getViewOffset();
            }
        };
        this.pullForegroundDrawable = pullForegroundDrawable;
        pullForegroundDrawable.doNotShow();
        int i5 = this.hiddenShown ? 2 : 0;
        this.pullViewState = i5;
        this.pullForegroundDrawable.setWillDraw(i5 != 0);
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        this.recyclerListView.setHideIfEmpty(false);
        anonymousClass7.setSupportsChangeAnimations(false);
        anonymousClass7.setDelayAnimations(false);
        TopicsRecyclerView topicsRecyclerView3 = this.recyclerListView;
        this.itemAnimator = anonymousClass7;
        topicsRecyclerView3.setItemAnimator(anonymousClass7);
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                super.onScrolled(recyclerView, i6, i7);
                TopicsFragment.this.checkForLoadMore();
            }
        });
        this.recyclerListView.setAnimateEmptyView(true, 0);
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.recyclerListView, true);
        this.itemsEnterAnimator = recyclerItemsEnterAnimator;
        this.recyclerListView.setItemsEnterAnimator(recyclerItemsEnterAnimator);
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i6) {
                this.f$0.lambda$createView$3(view, i6);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public final boolean onItemClick(View view, int i6, float f, float f2) {
                return this.f$0.lambda$createView$4(view, i6, f, f2);
            }

            @Override
            public void onLongClickRelease() {
                RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onLongClickRelease(this);
            }

            @Override
            public void onMove(float f, float f2) {
                RecyclerListView.OnItemLongClickListenerExtended.CC.$default$onMove(this, f, f2);
            }
        });
        this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                super.onScrolled(recyclerView, i6, i7);
                if (Build.VERSION.SDK_INT < 31 || TopicsFragment.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                TopicsFragment.this.scrollableViewNoiseSuppressor.onScrolled(i6, i7);
                TopicsFragment.this.blur3_InvalidateBlur();
            }
        });
        TopicsRecyclerView topicsRecyclerView4 = this.recyclerListView;
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(context);
        this.layoutManager = anonymousClass10;
        topicsRecyclerView4.setLayoutManager(anonymousClass10);
        this.scrollHelper = new RecyclerAnimationScrollHelper(this.recyclerListView, this.layoutManager);
        this.recyclerListView.setAdapter(this.adapter);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            int prevPosition;
            int prevTop;

            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                boolean z;
                int iFindFirstVisibleItemPosition = TopicsFragment.this.layoutManager.findFirstVisibleItemPosition();
                if (iFindFirstVisibleItemPosition != -1) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                    int top = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : 0;
                    int i8 = this.prevPosition;
                    if (i8 == iFindFirstVisibleItemPosition) {
                        int i9 = this.prevTop;
                        int i10 = i9 - top;
                        z = top < i9;
                        Math.abs(i10);
                    } else {
                        z = iFindFirstVisibleItemPosition > i8;
                    }
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    topicsFragment.hideFloatingButton(z || !topicsFragment.canShowCreateTopic, true);
                }
            }
        });
        TouchHelperCallback touchHelperCallback = new TouchHelperCallback();
        this.itemTouchHelperCallback = touchHelperCallback;
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(touchHelperCallback) {
            @Override
            protected boolean shouldSwipeBack() {
                return TopicsFragment.this.hiddenCount > 0;
            }
        };
        this.itemTouchHelper = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(this.recyclerListView);
        this.contentView.addView(this.recyclerListView, LayoutHelper.createFrame(-1, -1.0f));
        ((ViewGroup.MarginLayoutParams) this.recyclerListView.getLayoutParams()).topMargin = -AndroidUtilities.dp(100.0f);
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(getContext(), this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        this.contentView.addView(fragmentFloatingButton, FragmentFloatingButton.createDefaultLayoutParams());
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$5(view);
            }
        });
        this.floatingButton.imageView.setImageResource(R.drawable.ic_chatlist_add_2);
        this.floatingButton.imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.floatingButton.imageView.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
        this.floatingButton.setContentDescription(LocaleController.getString(i4));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(24);
        flickerLoadingView.setVisibility(8);
        flickerLoadingView.showDate(true);
        EmptyViewContainer emptyViewContainer = new EmptyViewContainer(context);
        this.emptyViewContainer = emptyViewContainer;
        emptyViewContainer.textView.setAlpha(0.0f);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, i) {
            boolean showProgressInternal;

            @Override
            public void showProgress(boolean z, boolean z2) {
                super.showProgress(z, z2);
                this.showProgressInternal = z;
                if (z2) {
                    TopicsFragment.this.emptyViewContainer.textView.animate().alpha(z ? 0.0f : 1.0f).start();
                } else {
                    TopicsFragment.this.emptyViewContainer.textView.animate().cancel();
                    TopicsFragment.this.emptyViewContainer.textView.setAlpha(z ? 0.0f : 1.0f);
                }
            }
        };
        this.topicsEmptyView = stickerEmptyView;
        try {
            stickerEmptyView.stickerView.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.topicsEmptyView.showProgress(this.loadingTopics, this.fragmentBeginToShow);
        this.topicsEmptyView.title.setText(LocaleController.getString(R.string.NoTopics));
        updateTopicsEmptyViewText();
        this.emptyViewContainer.addView(flickerLoadingView);
        this.emptyViewContainer.addView(this.topicsEmptyView);
        this.contentView.addView(this.emptyViewContainer);
        this.recyclerListView.setEmptyView(this.emptyViewContainer);
        this.bottomOverlayContainer = new FrameLayout(context) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                Theme.chat_composeShadowDrawable.setBounds(0, 0, getMeasuredWidth(), Theme.chat_composeShadowDrawable.getIntrinsicHeight());
                Theme.chat_composeShadowDrawable.draw(canvas);
                super.dispatchDraw(canvas);
            }
        };
        UnreadCounterTextView unreadCounterTextView = new UnreadCounterTextView(context);
        this.bottomOverlayChatText = unreadCounterTextView;
        this.bottomOverlayContainer.addView(unreadCounterTextView);
        this.contentView.addView(this.bottomOverlayContainer, LayoutHelper.createFrame(-1, 51, 80));
        this.bottomOverlayChatText.setOnClickListener(new AnonymousClass15());
        RadialProgressView radialProgressView = new RadialProgressView(context, this.themeDelegate);
        this.bottomOverlayProgress = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.bottomOverlayProgress.setVisibility(4);
        this.bottomOverlayContainer.addView(this.bottomOverlayProgress, LayoutHelper.createFrame(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.closeReportSpam = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.closeReportSpam.setContentDescription(LocaleController.getString(R.string.Close));
        ImageView imageView2 = this.closeReportSpam;
        int i6 = Theme.key_chat_topPanelClose;
        imageView2.setBackground(Theme.AdaptiveRipple.circle(getThemedColor(i6)));
        this.closeReportSpam.setColorFilter(new PorterDuffColorFilter(getThemedColor(i6), PorterDuff.Mode.MULTIPLY));
        this.closeReportSpam.setScaleType(ImageView.ScaleType.CENTER);
        this.bottomOverlayContainer.addView(this.closeReportSpam, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.closeReportSpam.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$6(view);
            }
        });
        this.closeReportSpam.setVisibility(8);
        updateChatInfo();
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == TopicsFragment.this.searchTabsView && TopicsFragment.this.isInPreviewMode()) {
                    TopicsFragment.this.getParentLayout().drawHeaderShadow(canvas, (int) (TopicsFragment.this.searchAnimationProgress * 255.0f), (int) (TopicsFragment.this.searchTabsView.getY() + TopicsFragment.this.searchTabsView.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.fullscreenView = frameLayout;
        if (this.parentDialogsActivity == null) {
            this.contentView.addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        }
        MessagesSearchContainer messagesSearchContainer = new MessagesSearchContainer(context);
        this.searchContainer = messagesSearchContainer;
        messagesSearchContainer.setVisibility(8);
        this.fullscreenView.addView(this.searchContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        MessagesSearchContainer messagesSearchContainer2 = this.searchContainer;
        int i7 = Theme.key_windowBackgroundWhite;
        messagesSearchContainer2.setBackgroundColor(getThemedColor(i7));
        this.actionBar.setDrawBlurBackground(this.contentView);
        getMessagesStorage().loadChatInfo(this.chatId, true, null, true, false, 0);
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = new DialogsActivityTopPanelLayout(context);
        this.topPanelLayout = dialogsActivityTopPanelLayout;
        dialogsActivityTopPanelLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(21.0f));
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3FactoryLiquidGlass.create(this.topPanelLayout, BlurredBackgroundProviderImpl.topPanel(this.resourceProvider));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(24.0f));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(7.0f));
        this.topPanelLayout.setBlurredBackground(blurredBackgroundDrawableCreate);
        this.topPanelLayout.setOnAnimatedHeightChangedListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$7();
            }
        });
        this.contentView.addView(this.topPanelLayout, LayoutHelper.createFrame(-1, -2.0f, 48, 0.0f, -14.0f, 0.0f, 0.0f));
        TLRPC.Chat currentChat = getCurrentChat();
        if (currentChat != null) {
            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = new ChatActivityMemberRequestsDelegate(this, currentChat);
            this.pendingRequestsDelegate = chatActivityMemberRequestsDelegate;
            this.topPanelLayout.addView(chatActivityMemberRequestsDelegate.getView(), LayoutHelper.createLinear(-1, 40));
            this.topPanelLayout.setPriority(this.pendingRequestsDelegate.getView(), 3);
            this.topPanelLayout.setDebugName(this.pendingRequestsDelegate.getView(), "pendingRequestsDelegate");
            this.pendingRequestsDelegate.setDelegate(new ChatActivityMemberRequestsDelegate.ChangeVisibilityDelegate() {
                @Override
                public final void setVisible(boolean z, boolean z2) {
                    this.f$0.lambda$createView$8(z, z2);
                }
            });
            this.pendingRequestsDelegate.setChatInfo(this.chatFull, false);
        }
        if (!this.inPreviewMode) {
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.fragmentContextViewWrapper = frameLayout2;
            this.topPanelLayout.addView(frameLayout2);
            this.topPanelLayout.setPriority(this.fragmentContextViewWrapper, 4);
            this.topPanelLayout.setDebugName(this.fragmentContextViewWrapper, "fragment context");
            this.topPanelLayout.setViewVisible(this.fragmentContextViewWrapper, true, false);
            FragmentContextView fragmentContextView = new FragmentContextView(context, this, false, this.themeDelegate) {
                @Override
                public void setVisibility(int i8) {
                    TopicsFragment.this.topPanelLayout.setViewVisible(TopicsFragment.this.fragmentContextViewWrapper, i8 == 0, true);
                }
            };
            this.fragmentContextView = fragmentContextView;
            fragmentContextView.isInsideBubble = true;
            this.fragmentContextViewWrapper.addView(fragmentContextView);
        }
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f);
        if (this.inPreviewMode) {
            layoutParamsCreateFrame.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.contentView.addView(this.actionBar, layoutParamsCreateFrame);
        }
        checkForLoadMore();
        View view = new View(context) {
            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                View view2 = TopicsFragment.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
            }
        };
        this.blurredView = view;
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i7), 100)));
        }
        this.blurredView.setFocusable(false);
        this.blurredView.setImportantForAccessibility(2);
        this.blurredView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$9(view2);
            }
        });
        this.blurredView.setFitsSystemWindows(true);
        this.bottomPannelVisible = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseFragment baseFragment = (BaseFragment) it.next();
                if (baseFragment instanceof DialogsActivity) {
                    DialogsActivity dialogsActivity4 = (DialogsActivity) baseFragment;
                    if (dialogsActivity4.isMainDialogList()) {
                        MessagesStorage.TopicKey openedDialogId = dialogsActivity4.getOpenedDialogId();
                        if (openedDialogId.dialogId == (-this.chatId)) {
                            this.selectedTopicForTablet = openedDialogId.topicId;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
            }
            updateTopicsList(false, false);
        }
        updateChatInfo();
        updateColors();
        if (ChatObject.isBoostSupported(getCurrentChat())) {
            getMessagesController().getBoostsController().getBoostsStats(-this.chatId, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$createView$10((TL_stories.TL_premium_boostsStatus) obj);
                }
            });
        }
        ViewCompat.setOnApplyWindowInsetsListener(this.fragmentView, new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view2, windowInsetsCompat);
            }
        });
        return this.fragmentView;
    }

    class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        public static void lambda$onItemClick$0() {
        }

        AnonymousClass2(Context context) {
            this.val$context = context;
        }

        @Override
        public void onItemClick(int i) {
            TLRPC.ChatParticipants chatParticipants;
            TopicDialogCell topicDialogCell;
            TLRPC.TL_forumTopic tL_forumTopic;
            int i2 = 0;
            if (i == -1) {
                if (TopicsFragment.this.selectedTopics.size() > 0) {
                    TopicsFragment.this.clearSelectedTopics();
                    return;
                } else {
                    TopicsFragment.this.finishFragment();
                    return;
                }
            }
            TLRPC.TL_forumTopic tL_forumTopic2 = null;
            switch (i) {
                case 1:
                    TopicsFragment.this.getMessagesController().getTopicsController().toggleViewForumAsMessages(TopicsFragment.this.chatId, true);
                    TopicsFragment.this.finishDialogRightSlidingPreviewOnTransitionEnd = true;
                    Bundle bundle = new Bundle();
                    bundle.putLong("chat_id", TopicsFragment.this.chatId);
                    ChatActivity chatActivity = new ChatActivity(bundle);
                    chatActivity.setSwitchFromTopics(true);
                    TopicsFragment.this.presentFragment(chatActivity);
                    break;
                case 2:
                    TLRPC.ChatFull chatFull = TopicsFragment.this.getMessagesController().getChatFull(TopicsFragment.this.chatId);
                    TLRPC.ChatFull chatFull2 = TopicsFragment.this.chatFull;
                    if (chatFull2 != null && (chatParticipants = chatFull2.participants) != null) {
                        chatFull.participants = chatParticipants;
                    }
                    if (chatFull != null) {
                        LongSparseArray longSparseArray = new LongSparseArray();
                        if (chatFull.participants != null) {
                            while (i2 < chatFull.participants.participants.size()) {
                                longSparseArray.put(chatFull.participants.participants.get(i2).user_id, null);
                                i2++;
                            }
                        }
                        final long j = chatFull.id;
                        Context context = this.val$context;
                        int i3 = ((BaseFragment) TopicsFragment.this).currentAccount;
                        long j2 = chatFull.id;
                        TopicsFragment topicsFragment = TopicsFragment.this;
                        InviteMembersBottomSheet inviteMembersBottomSheet = new InviteMembersBottomSheet(context, i3, longSparseArray, j2, topicsFragment, topicsFragment.themeDelegate) {
                            @Override
                            protected boolean canGenerateLink() {
                                TLRPC.Chat chat = TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j));
                                return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
                            }
                        };
                        inviteMembersBottomSheet.setDelegate(new GroupCreateActivity.ContactsAddActivityDelegate() {
                            @Override
                            public final void didSelectUsers(ArrayList arrayList, int i4) {
                                this.f$0.lambda$onItemClick$2(j, arrayList, i4);
                            }

                            @Override
                            public void needAddBot(TLRPC.User user) {
                                GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, user);
                            }
                        });
                        inviteMembersBottomSheet.show();
                        break;
                    }
                    break;
                case 3:
                    final TopicCreateFragment topicCreateFragmentCreate = TopicCreateFragment.create(TopicsFragment.this.chatId, 0L);
                    TopicsFragment.this.presentFragment(topicCreateFragmentCreate);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            topicCreateFragmentCreate.showKeyboard();
                        }
                    }, 200L);
                    break;
                case 4:
                case 5:
                    if (TopicsFragment.this.selectedTopics.size() > 0) {
                        TopicsFragment.this.scrollToTop = true;
                        TopicsFragment.this.updateAnimated = true;
                        TopicsController topicsController = TopicsFragment.this.topicsController;
                        TopicsFragment topicsFragment2 = TopicsFragment.this;
                        topicsController.pinTopic(topicsFragment2.chatId, ((Integer) topicsFragment2.selectedTopics.iterator().next()).intValue(), i == 4, TopicsFragment.this);
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 6:
                    Iterator it = TopicsFragment.this.selectedTopics.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Integer) it.next()).intValue();
                        NotificationsController notificationsController = TopicsFragment.this.getNotificationsController();
                        TopicsFragment topicsFragment3 = TopicsFragment.this;
                        notificationsController.muteDialog(-topicsFragment3.chatId, iIntValue, topicsFragment3.mute);
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 7:
                    TopicsFragment topicsFragment4 = TopicsFragment.this;
                    topicsFragment4.deleteTopics(topicsFragment4.selectedTopics, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onItemClick$5();
                        }
                    });
                    break;
                case 8:
                    ArrayList arrayList = new ArrayList(TopicsFragment.this.selectedTopics);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopicFindTopic = TopicsFragment.this.topicsController.findTopic(TopicsFragment.this.chatId, ((Integer) arrayList.get(i4)).intValue());
                        if (tL_forumTopicFindTopic != null) {
                            TopicsFragment.this.getMessagesController().markMentionsAsRead(-TopicsFragment.this.chatId, tL_forumTopicFindTopic.id);
                            MessagesController messagesController = TopicsFragment.this.getMessagesController();
                            long j3 = -TopicsFragment.this.chatId;
                            int i5 = tL_forumTopicFindTopic.top_message;
                            TLRPC.Message message = tL_forumTopicFindTopic.topMessage;
                            messagesController.markDialogAsRead(j3, i5, 0, message != null ? message.date : 0, false, tL_forumTopicFindTopic.id, 0, true, 0);
                            TopicsFragment.this.getMessagesStorage().updateRepliesMaxReadId(TopicsFragment.this.chatId, tL_forumTopicFindTopic.id, tL_forumTopicFindTopic.top_message, 0, true);
                        }
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 9:
                case 10:
                    TopicsFragment.this.updateAnimated = true;
                    ArrayList arrayList2 = new ArrayList(TopicsFragment.this.selectedTopics);
                    for (int i6 = 0; i6 < arrayList2.size(); i6++) {
                        TopicsFragment.this.topicsController.toggleCloseTopic(TopicsFragment.this.chatId, ((Integer) arrayList2.get(i6)).intValue(), i == 9);
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 11:
                    final TLRPC.Chat chat = TopicsFragment.this.getMessagesController().getChat(Long.valueOf(TopicsFragment.this.chatId));
                    AlertsCreator.createClearOrDeleteDialogAlert(TopicsFragment.this, false, chat, null, false, true, false, false, new MessagesStorage.BooleanCallback() {
                        @Override
                        public final void run(boolean z) {
                            this.f$0.lambda$onItemClick$4(chat, z);
                        }
                    });
                    break;
                case 12:
                case 13:
                    int i7 = 0;
                    while (true) {
                        if (i7 < TopicsFragment.this.recyclerListView.getChildCount()) {
                            View childAt = TopicsFragment.this.recyclerListView.getChildAt(i7);
                            if ((childAt instanceof TopicDialogCell) && (tL_forumTopic = (topicDialogCell = (TopicDialogCell) childAt).forumTopic) != null && tL_forumTopic.id == 1) {
                                tL_forumTopic2 = tL_forumTopic;
                            } else {
                                i7++;
                            }
                        } else {
                            topicDialogCell = null;
                        }
                    }
                    if (tL_forumTopic2 == null) {
                        while (true) {
                            if (i2 < TopicsFragment.this.forumTopics.size()) {
                                if (TopicsFragment.this.forumTopics.get(i2) == null || ((Item) TopicsFragment.this.forumTopics.get(i2)).topic == null || ((Item) TopicsFragment.this.forumTopics.get(i2)).topic.id != 1) {
                                    i2++;
                                } else {
                                    tL_forumTopic2 = ((Item) TopicsFragment.this.forumTopics.get(i2)).topic;
                                }
                            }
                        }
                    }
                    if (tL_forumTopic2 != null) {
                        if (TopicsFragment.this.hiddenCount <= 0) {
                            TopicsFragment.this.hiddenShown = true;
                            TopicsFragment.this.pullViewState = 2;
                        }
                        TopicsFragment.this.getMessagesController().getTopicsController().toggleShowTopic(TopicsFragment.this.chatId, 1, tL_forumTopic2.hidden);
                        if (topicDialogCell != null) {
                            TopicsFragment.this.generalTopicViewMoving = topicDialogCell;
                        }
                        TopicsFragment.this.recyclerListView.setArchiveHidden(!tL_forumTopic2.hidden, topicDialogCell);
                        TopicsFragment.this.updateTopicsList(true, true);
                        if (topicDialogCell != null) {
                            topicDialogCell.setTopicIcon(topicDialogCell.currentTopic);
                        }
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 14:
                    if (ChatObject.hasAdminRights(TopicsFragment.this.getMessagesController().getChat(Long.valueOf(TopicsFragment.this.chatId)))) {
                        BoostsActivity boostsActivity = new BoostsActivity(-TopicsFragment.this.chatId);
                        boostsActivity.setBoostsStatus(TopicsFragment.this.boostsStatus);
                        TopicsFragment.this.presentFragment(boostsActivity);
                        break;
                    } else {
                        TopicsFragment.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(-TopicsFragment.this.chatId));
                        break;
                    }
                case 15:
                    TopicsFragment topicsFragment5 = TopicsFragment.this;
                    ReportBottomSheet.openChat(topicsFragment5, -topicsFragment5.chatId);
                    break;
            }
            super.onItemClick(i);
        }

        public void lambda$onItemClick$2(final long j, final ArrayList arrayList, int i) {
            final int size = arrayList.size();
            final int[] iArr = new int[1];
            final TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
            tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
            for (int i2 = 0; i2 < size; i2++) {
                TopicsFragment.this.getMessagesController().addUserToChat(j, (TLRPC.User) arrayList.get(i2), i, null, TopicsFragment.this, false, new Runnable() {
                    @Override
                    public final void run() {
                        TopicsFragment.AnonymousClass2.lambda$onItemClick$0();
                    }
                }, null, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onItemClick$1(tL_messages_invitedUsers, iArr, size, arrayList, j, (TLRPC.TL_messages_invitedUsers) obj);
                    }
                });
            }
        }

        public void lambda$onItemClick$1(TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers, int[] iArr, int i, ArrayList arrayList, long j, TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers2) {
            if (tL_messages_invitedUsers2 != null) {
                tL_messages_invitedUsers.missing_invitees.addAll(tL_messages_invitedUsers2.missing_invitees);
            }
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            if (i2 == i) {
                if (tL_messages_invitedUsers.missing_invitees.isEmpty()) {
                    BulletinFactory.of(TopicsFragment.this).createUsersAddedBulletin(arrayList, TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j))).show();
                } else {
                    AlertsCreator.checkRestrictedInviteUsers(((BaseFragment) TopicsFragment.this).currentAccount, TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j)), tL_messages_invitedUsers);
                }
            }
        }

        public void lambda$onItemClick$4(TLRPC.Chat chat, boolean z) {
            NotificationCenter notificationCenter = TopicsFragment.this.getNotificationCenter();
            TopicsFragment topicsFragment = TopicsFragment.this;
            int i = NotificationCenter.closeChats;
            notificationCenter.removeObserver(topicsFragment, i);
            TopicsFragment.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
            TopicsFragment.this.finishFragment();
            TopicsFragment.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-chat.id), null, chat, Boolean.valueOf(z));
        }

        public void lambda$onItemClick$5() {
            TopicsFragment.this.clearSelectedTopics();
        }
    }

    public void lambda$createView$0(View view) {
        if (this.searching) {
            return;
        }
        openProfile(false);
    }

    public void lambda$createView$1(View view) {
        openParentSearch();
    }

    public void lambda$createView$2() {
        this.recyclerListView.postOnAnimation(new Runnable() {
            @Override
            public final void run() {
                this.f$0.blur3_InvalidateBlur();
            }
        });
    }

    class AnonymousClass7 extends DefaultItemAnimator {
        Runnable finishRunnable;
        int scrollAnimationIndex;

        AnonymousClass7() {
        }

        @Override
        public void checkIsRunning() {
            if (this.scrollAnimationIndex == -1) {
                this.scrollAnimationIndex = TopicsFragment.this.getNotificationCenter().setAnimationInProgress(this.scrollAnimationIndex, null, false);
                Runnable runnable = this.finishRunnable;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    this.finishRunnable = null;
                }
            }
        }

        @Override
        protected void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAllAnimationsDone$0();
                }
            };
            this.finishRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2);
        }

        public void lambda$onAllAnimationsDone$0() {
            this.finishRunnable = null;
            if (this.scrollAnimationIndex != -1) {
                TopicsFragment.this.getNotificationCenter().onAnimationFinish(this.scrollAnimationIndex);
                this.scrollAnimationIndex = -1;
            }
        }

        @Override
        public void endAnimations() {
            super.endAnimations();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$endAnimations$1();
                }
            };
            this.finishRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2);
        }

        public void lambda$endAnimations$1() {
            this.finishRunnable = null;
            if (this.scrollAnimationIndex != -1) {
                TopicsFragment.this.getNotificationCenter().onAnimationFinish(this.scrollAnimationIndex);
                this.scrollAnimationIndex = -1;
            }
        }

        @Override
        protected void afterAnimateMoveImpl(RecyclerView.ViewHolder viewHolder) {
            if (TopicsFragment.this.generalTopicViewMoving == viewHolder.itemView) {
                TopicsFragment.this.generalTopicViewMoving.setTranslationX(0.0f);
                if (TopicsFragment.this.itemTouchHelper != null) {
                    TopicsFragment.this.itemTouchHelper.clearRecoverAnimations();
                }
                if (TopicsFragment.this.generalTopicViewMoving instanceof TopicDialogCell) {
                    ((TopicDialogCell) TopicsFragment.this.generalTopicViewMoving).setTopicIcon(((TopicDialogCell) TopicsFragment.this.generalTopicViewMoving).currentTopic);
                }
                TopicsFragment.this.generalTopicViewMoving = null;
            }
        }
    }

    public void lambda$createView$3(View view, int i) {
        long peerDialogId;
        if (getParentLayout() == null || getParentLayout().isInPreviewMode() || !(view instanceof TopicDialogCell)) {
            return;
        }
        TLRPC.TL_forumTopic tL_forumTopic = ((TopicDialogCell) view).forumTopic;
        boolean zIsMonoForum = getMessagesController().isMonoForum(-this.chatId);
        if (tL_forumTopic == null) {
            peerDialogId = 0;
        } else {
            peerDialogId = zIsMonoForum ? DialogObject.getPeerDialogId(tL_forumTopic.from_id) : tL_forumTopic.id;
        }
        long j = peerDialogId;
        if (this.openedForSelect) {
            OnTopicSelectedListener onTopicSelectedListener = this.onTopicSelectedListener;
            if (onTopicSelectedListener != null) {
                onTopicSelectedListener.onTopicSelected(tL_forumTopic);
            }
            DialogsActivity dialogsActivity = this.dialogsActivity;
            if (dialogsActivity != null) {
                dialogsActivity.didSelectResult(-this.chatId, j, true, false, this);
                return;
            }
            return;
        }
        if (this.selectedTopics.size() > 0) {
            toggleSelection(view);
            return;
        }
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            for (BaseFragment baseFragment : getParentLayout().getFragmentStack()) {
                if (baseFragment instanceof DialogsActivity) {
                    DialogsActivity dialogsActivity2 = (DialogsActivity) baseFragment;
                    if (dialogsActivity2.isMainDialogList()) {
                        MessagesStorage.TopicKey openedDialogId = dialogsActivity2.getOpenedDialogId();
                        if (openedDialogId.dialogId == (-this.chatId) && openedDialogId.topicId == j) {
                            return;
                        }
                    } else {
                        continue;
                    }
                }
            }
            this.selectedTopicForTablet = j;
            updateTopicsList(false, false);
        }
        ForumUtilities.openTopic(this, this.chatId, tL_forumTopic, 0);
    }

    public boolean lambda$createView$4(View view, int i, float f, float f2) {
        if (this.openedForSelect || getParentLayout() == null || getParentLayout().isInPreviewMode()) {
            return false;
        }
        if (!this.actionBar.isActionModeShowed() && !AndroidUtilities.isTablet() && (view instanceof TopicDialogCell)) {
            TopicDialogCell topicDialogCell = (TopicDialogCell) view;
            if (topicDialogCell.isPointInsideAvatar(f, f2)) {
                showChatPreview(topicDialogCell);
                this.recyclerListView.cancelClickRunnables(true);
                this.recyclerListView.dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                return false;
            }
        }
        toggleSelection(view);
        try {
            view.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        return true;
    }

    class AnonymousClass10 extends LinearLayoutManager {
        private boolean fixOffset;

        AnonymousClass10(Context context) {
            super(context);
        }

        @Override
        public void scrollToPositionWithOffset(int i, int i2) {
            if (this.fixOffset) {
                i2 -= TopicsFragment.this.recyclerListView.getPaddingTop();
            }
            super.scrollToPositionWithOffset(i, i2);
        }

        @Override
        public void prepareForDrop(View view, View view2, int i, int i2) {
            this.fixOffset = true;
            super.prepareForDrop(view, view2, i, i2);
            this.fixOffset = false;
        }

        @Override
        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            if (TopicsFragment.this.hiddenCount > 0 && i == 1) {
                super.smoothScrollToPosition(recyclerView, state, i);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
            linearSmoothScrollerCustom.setTargetPosition(i);
            startSmoothScroll(linearSmoothScrollerCustom);
        }

        @Override
        public int scrollVerticallyBy(int r18, androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.AnonymousClass10.scrollVerticallyBy(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
        }

        @Override
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    super.onLayoutChildren(recycler, state);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new RuntimeException("Inconsistency detected. ");
                }
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onLayoutChildren$0();
                    }
                });
            }
        }

        public void lambda$onLayoutChildren$0() {
            TopicsFragment.this.adapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$5(View view) {
        presentFragment(TopicCreateFragment.create(this.chatId, 0L));
    }

    class AnonymousClass15 implements View.OnClickListener {
        AnonymousClass15() {
        }

        @Override
        public void onClick(View view) {
            if (TopicsFragment.this.bottomButtonType != 1) {
                TopicsFragment.this.joinToGroup();
            } else {
                TopicsFragment topicsFragment = TopicsFragment.this;
                AlertsCreator.showBlockReportSpamAlert(topicsFragment, -topicsFragment.chatId, null, topicsFragment.getCurrentChat(), null, false, TopicsFragment.this.chatFull, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        this.f$0.lambda$onClick$0(i);
                    }
                }, TopicsFragment.this.getResourceProvider());
            }
        }

        public void lambda$onClick$0(int i) {
            if (i == 0) {
                TopicsFragment.this.updateChatInfo();
            } else {
                TopicsFragment.this.finishFragment();
            }
        }
    }

    public void lambda$createView$6(View view) {
        getMessagesController().hidePeerSettingsBar(-this.chatId, null, getCurrentChat());
        updateChatInfo();
    }

    public void lambda$createView$7() {
        blur3_InvalidateBlur();
        checkUi_listViewPadding();
    }

    public void lambda$createView$8(boolean z, boolean z2) {
        this.topPanelLayout.setViewVisible(this.pendingRequestsDelegate.getView(), z, z2);
    }

    public void lambda$createView$9(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$10(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        this.boostsStatus = tL_premium_boostsStatus;
    }

    private void updateTopicsEmptyViewText() {
        StickerEmptyView stickerEmptyView = this.topicsEmptyView;
        if (stickerEmptyView == null || stickerEmptyView.subtitle == null) {
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
        ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.ic_ab_other);
        coloredImageSpan.setSize(AndroidUtilities.dp(16.0f));
        spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 0);
        if (ChatObject.canUserDoAdminAction(getCurrentChat(), 15)) {
            this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString(R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString(R.string.General);
        TLRPC.TL_forumTopic tL_forumTopicFindTopic = getMessagesController().getTopicsController().findTopic(this.chatId, 1L);
        if (tL_forumTopicFindTopic != null) {
            string = tL_forumTopicFindTopic.title;
        }
        this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    private void updateColors() {
        RadialProgressView radialProgressView = this.bottomOverlayProgress;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(Theme.key_chat_fieldOverlayText));
        this.floatingButton.updateColors();
        FrameLayout frameLayout = this.bottomOverlayContainer;
        int i = Theme.key_windowBackgroundWhite;
        frameLayout.setBackgroundColor(getThemedColor(i));
        this.actionBar.setActionModeColor(getThemedColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(getThemedColor(Theme.key_actionBarDefault));
        }
        this.searchContainer.setBackgroundColor(getThemedColor(i));
    }

    public void openProfile(boolean z) {
        TLRPC.Chat currentChat;
        TLRPC.ChatPhoto chatPhoto;
        if (z && (currentChat = getCurrentChat()) != null && ((chatPhoto = currentChat.photo) == null || (chatPhoto instanceof TLRPC.TL_chatPhotoEmpty))) {
            z = false;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ProfileActivity profileActivity = new ProfileActivity(bundle, this.avatarContainer.getSharedMediaPreloader());
        profileActivity.setChatInfo(this.chatFull);
        profileActivity.setPlayProfileAnimation((this.fragmentView.getMeasuredHeight() > this.fragmentView.getMeasuredWidth() && this.avatarContainer.getAvatarImageView().getImageReceiver().hasImageLoaded() && z) ? 2 : 1);
        presentFragment(profileActivity);
    }

    public void switchToChat(boolean z) {
        this.removeFragmentOnTransitionEnd = z;
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ChatActivity chatActivity = new ChatActivity(bundle);
        chatActivity.setSwitchFromTopics(true);
        presentFragment(chatActivity);
    }

    private void openParentSearch() {
        ActionBarMenuItem actionBarMenuItem;
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity == null || (actionBarMenuItem = dialogsActivity.searchItem) == null) {
            return;
        }
        actionBarMenuItem.performClick();
    }

    public void checkUi_listViewPadding() {
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        float animatedHeightWithPadding = 0.0f;
        if (dialogsActivity != null) {
            animatedHeightWithPadding = 0.0f + dialogsActivity.getTopPanelAnimatedHeight();
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
            if (dialogsActivityTopPanelLayout != null) {
                dialogsActivityTopPanelLayout.setTranslationY(animatedHeightWithPadding - (AndroidUtilities.dp(7.0f) * this.parentDialogsActivity.getTopPanelVisibility()));
                animatedHeightWithPadding += this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), this.parentDialogsActivity.getTopPanelVisibility()));
            }
        } else {
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout2 = this.topPanelLayout;
            if (dialogsActivityTopPanelLayout2 != null) {
                animatedHeightWithPadding = 0.0f + dialogsActivityTopPanelLayout2.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f));
            }
        }
        this.recyclerListView.setPadding(0, (int) animatedHeightWithPadding, 0, this.navigationBarHeight + this.additionNavigationBarHeight + (this.bottomPannelVisible ? AndroidUtilities.dp(51.0f) : 0));
    }

    public void setTransitionPadding(int i) {
        this.transitionPadding = i;
        updateFloatingButtonOffset();
    }

    public void setParentDialogsActivity(DialogsActivity dialogsActivity) {
        this.parentDialogsActivity = dialogsActivity;
    }

    class TopicsRecyclerView extends BlurredRecyclerView {
        private boolean firstLayout;
        private boolean ignoreLayout;
        Paint paint;
        RectF rectF;
        private float viewOffset;

        public TopicsRecyclerView(Context context) {
            super(context);
            this.firstLayout = true;
            this.paint = new Paint();
            this.rectF = new RectF();
            this.useLayoutPositionOnClick = true;
            this.additionalClipBottom = AndroidUtilities.dp(200.0f);
        }

        public void setViewsOffset(float f) {
            View viewFindViewByPosition;
            this.viewOffset = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setTranslationY(f);
            }
            if (this.selectorPosition != -1 && (viewFindViewByPosition = getLayoutManager().findViewByPosition(this.selectorPosition)) != null) {
                this.selectorRect.set(viewFindViewByPosition.getLeft(), (int) (viewFindViewByPosition.getTop() + f), viewFindViewByPosition.getRight(), (int) (viewFindViewByPosition.getBottom() + f));
                this.selectorDrawable.setBounds(this.selectorRect);
            }
            invalidate();
        }

        public float getViewOffset() {
            return this.viewOffset;
        }

        @Override
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            view.setTranslationY(this.viewOffset);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override
        public void removeView(View view) {
            super.removeView(view);
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            view.setAlpha(1.0f);
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (TopicsFragment.this.pullForegroundDrawable != null && this.viewOffset != 0.0f) {
                int paddingTop = getPaddingTop();
                if (paddingTop != 0) {
                    canvas.save();
                    canvas.translate(0.0f, paddingTop);
                }
                TopicsFragment.this.pullForegroundDrawable.drawOverScroll(canvas);
                if (paddingTop != 0) {
                    canvas.restore();
                }
            }
            super.onDraw(canvas);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (TopicsFragment.this.generalTopicViewMoving != null) {
                canvas.save();
                canvas.translate(TopicsFragment.this.generalTopicViewMoving.getLeft(), TopicsFragment.this.generalTopicViewMoving.getY());
                TopicsFragment.this.generalTopicViewMoving.draw(canvas);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            if (drawMovingViewsOverlayed()) {
                this.paint.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
                for (int i = 0; i < getChildCount(); i++) {
                    View childAt = getChildAt(i);
                    if (((childAt instanceof DialogCell) && ((DialogCell) childAt).isMoving()) || ((childAt instanceof DialogsAdapter.LastEmptyView) && ((DialogsAdapter.LastEmptyView) childAt).moving)) {
                        if (childAt.getAlpha() != 1.0f) {
                            this.rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                            canvas.saveLayerAlpha(this.rectF, (int) (childAt.getAlpha() * 255.0f), 31);
                        } else {
                            canvas.save();
                        }
                        canvas.translate(childAt.getX(), childAt.getY());
                        canvas.drawRect(0.0f, 0.0f, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.paint);
                        childAt.draw(canvas);
                        canvas.restore();
                    }
                }
                invalidate();
            }
        }

        private boolean drawMovingViewsOverlayed() {
            return (getItemAnimator() == null || !getItemAnimator().isRunning() || (TopicsFragment.this.dialogRemoveFinished == 0 && TopicsFragment.this.dialogInsertFinished == 0 && TopicsFragment.this.dialogChangeFinished == 0)) ? false : true;
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if ((drawMovingViewsOverlayed() && (view instanceof DialogCell) && ((DialogCell) view).isMoving()) || TopicsFragment.this.generalTopicViewMoving == view) {
                return true;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override
        public void setAdapter(RecyclerView.Adapter adapter) {
            super.setAdapter(adapter);
            this.firstLayout = true;
        }

        private void checkIfAdapterValid() {
            RecyclerView.Adapter adapter = getAdapter();
            if (TopicsFragment.this.lastItemsCount == adapter.getItemCount() || TopicsFragment.this.forumTopicsListFrozen) {
                return;
            }
            this.ignoreLayout = true;
            adapter.notifyDataSetChanged();
            this.ignoreLayout = false;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            if (this.firstLayout && TopicsFragment.this.getMessagesController().dialogsLoaded) {
                if (TopicsFragment.this.hiddenCount > 0) {
                    this.ignoreLayout = true;
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(1, (int) ((BaseFragment) TopicsFragment.this).actionBar.getTranslationY());
                    this.ignoreLayout = false;
                }
                this.firstLayout = false;
            }
            super.onMeasure(i, i2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if ((TopicsFragment.this.dialogRemoveFinished == 0 && TopicsFragment.this.dialogInsertFinished == 0 && TopicsFragment.this.dialogChangeFinished == 0) || TopicsFragment.this.itemAnimator.isRunning()) {
                return;
            }
            TopicsFragment.this.onDialogAnimationFinished();
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public void setArchiveHidden(boolean z, DialogCell dialogCell) {
            TopicsFragment.this.hiddenShown = z;
            if (TopicsFragment.this.hiddenShown) {
                TopicsFragment.this.layoutManager.scrollToPositionWithOffset(0, 0);
                updatePullState();
                if (dialogCell != null) {
                    dialogCell.resetPinnedArchiveState();
                    dialogCell.invalidate();
                }
            } else if (dialogCell != null) {
                TopicsFragment.this.disableActionBarScrolling = true;
                TopicsFragment.this.layoutManager.scrollToPositionWithOffset(1, 0);
                updatePullState();
            }
            if (TopicsFragment.this.emptyView != null) {
                TopicsFragment.this.emptyView.forceLayout();
            }
        }

        private void updatePullState() {
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.pullViewState = !topicsFragment.hiddenShown ? 2 : 0;
            if (TopicsFragment.this.pullForegroundDrawable != null) {
                TopicsFragment.this.pullForegroundDrawable.setWillDraw(TopicsFragment.this.pullViewState != 0);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            LinearLayoutManager linearLayoutManager;
            int iFindFirstVisibleItemPosition;
            if (this.fastScrollAnimationRunning || TopicsFragment.this.waitingForScrollFinished || TopicsFragment.this.dialogRemoveFinished != 0 || TopicsFragment.this.dialogInsertFinished != 0 || TopicsFragment.this.dialogChangeFinished != 0 || (TopicsFragment.this.getParentLayout() != null && TopicsFragment.this.getParentLayout().isInPreviewMode())) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            if ((action == 1 || action == 3) && !TopicsFragment.this.itemTouchHelper.isIdle() && TopicsFragment.this.itemTouchHelperCallback.swipingFolder) {
                TopicsFragment.this.itemTouchHelperCallback.swipeFolderBack = true;
                if (TopicsFragment.this.itemTouchHelper.checkHorizontalSwipe(null, 4) != 0 && TopicsFragment.this.itemTouchHelperCallback.currentItemViewHolder != null) {
                    RecyclerView.ViewHolder viewHolder = TopicsFragment.this.itemTouchHelperCallback.currentItemViewHolder;
                    if (viewHolder.itemView instanceof DialogCell) {
                        setArchiveHidden(!TopicsFragment.this.hiddenShown, (DialogCell) viewHolder.itemView);
                    }
                }
            }
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if ((action == 1 || action == 3) && TopicsFragment.this.pullViewState == 2 && TopicsFragment.this.hiddenCount > 0 && (iFindFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition()) == 0) {
                int paddingTop = getPaddingTop();
                View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                int iDp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                int top = (viewFindViewByPosition.getTop() - paddingTop) + viewFindViewByPosition.getMeasuredHeight();
                long jCurrentTimeMillis = System.currentTimeMillis() - TopicsFragment.this.startArchivePullingTime;
                if (top < iDp || jCurrentTimeMillis < 200) {
                    TopicsFragment.this.disableActionBarScrolling = true;
                    smoothScrollBy(0, top, CubicBezierInterpolator.EASE_OUT_QUINT);
                    TopicsFragment.this.pullViewState = 2;
                } else if (TopicsFragment.this.pullViewState != 1) {
                    if (getViewOffset() == 0.0f) {
                        TopicsFragment.this.disableActionBarScrolling = true;
                        smoothScrollBy(0, viewFindViewByPosition.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                    }
                    if (!TopicsFragment.this.canShowHiddenArchive) {
                        TopicsFragment.this.canShowHiddenArchive = true;
                        try {
                            performHapticFeedback(3, 2);
                        } catch (Exception unused) {
                        }
                        if (TopicsFragment.this.pullForegroundDrawable != null) {
                            TopicsFragment.this.pullForegroundDrawable.colorize(true);
                        }
                    }
                    ((DialogCell) viewFindViewByPosition).startOutAnimation();
                    TopicsFragment.this.pullViewState = 1;
                }
                if (getViewOffset() != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(getViewOffset(), 0.0f);
                    valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            this.f$0.lambda$onTouchEvent$0(valueAnimator);
                        }
                    });
                    valueAnimatorOfFloat.setDuration(Math.max(100L, (long) (350.0f - ((getViewOffset() / PullForegroundDrawable.getMaxOverscroll()) * 120.0f))));
                    valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    setScrollEnabled(false);
                    valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            TopicsRecyclerView.this.setScrollEnabled(true);
                        }
                    });
                    valueAnimatorOfFloat.start();
                }
            }
            return zOnTouchEvent;
        }

        public void lambda$onTouchEvent$0(ValueAnimator valueAnimator) {
            setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.fastScrollAnimationRunning || TopicsFragment.this.waitingForScrollFinished || TopicsFragment.this.dialogRemoveFinished != 0 || TopicsFragment.this.dialogInsertFinished != 0 || TopicsFragment.this.dialogChangeFinished != 0) {
                return false;
            }
            if (TopicsFragment.this.getParentLayout() != null && TopicsFragment.this.getParentLayout().isInPreviewMode()) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                TopicsFragment.this.allowSwipeDuringCurrentTouch = !((BaseFragment) r0).actionBar.isActionModeShowed();
                checkIfAdapterValid();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected boolean allowSelectChildAtPosition(View view) {
            return !(view instanceof HeaderCell) || view.isClickable();
        }
    }

    public void onDialogAnimationFinished() {
        this.dialogRemoveFinished = 0;
        this.dialogInsertFinished = 0;
        this.dialogChangeFinished = 0;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsFragment.lambda$onDialogAnimationFinished$11();
            }
        });
    }

    public void deleteTopics(final HashSet hashSet, final Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getPluralString("DeleteTopics", hashSet.size()));
        final ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            builder.setMessage(LocaleController.formatString(R.string.DeleteSelectedTopic, this.topicsController.findTopic(this.chatId, ((Integer) arrayList.get(0)).intValue()).title));
        } else {
            builder.setMessage(LocaleController.getString(R.string.DeleteSelectedTopics));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$deleteTopics$14(hashSet, arrayList, runnable, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                alertDialog.dismiss();
            }
        });
        AlertDialog alertDialogCreate = builder.create();
        alertDialogCreate.show();
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$deleteTopics$14(HashSet hashSet, final ArrayList arrayList, final Runnable runnable, AlertDialog alertDialog, int i) {
        HashSet hashSet2 = new HashSet();
        this.excludeTopics = hashSet2;
        hashSet2.addAll(hashSet);
        updateTopicsList(true, false);
        BulletinFactory.of(this).createUndoBulletin(LocaleController.getPluralString("TopicsDeleted", hashSet.size()), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteTopics$12();
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$deleteTopics$13(arrayList, runnable);
            }
        }).show();
        clearSelectedTopics();
        alertDialog.dismiss();
    }

    public void lambda$deleteTopics$12() {
        this.excludeTopics = null;
        updateTopicsList(true, false);
    }

    public void lambda$deleteTopics$13(ArrayList arrayList, Runnable runnable) {
        this.topicsController.deleteTopics(this.chatId, arrayList);
        runnable.run();
    }

    public boolean showChatPreview(DialogCell dialogCell) {
        try {
            dialogCell.performHapticFeedback(0);
        } catch (Exception unused) {
        }
        final ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr = {new ActionBarPopupWindow.ActionBarPopupWindowLayout(getParentActivity(), R.drawable.popup_fixed_alert, getResourceProvider(), 1)};
        final TLRPC.TL_forumTopic tL_forumTopic = dialogCell.forumTopic;
        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(getContext(), this.currentAccount, actionBarPopupWindowLayoutArr[0].getSwipeBack(), false, false, new AnonymousClass19(tL_forumTopic), getResourceProvider());
        final int iAddViewToSwipeBack = actionBarPopupWindowLayoutArr[0].addViewToSwipeBack(chatNotificationsPopupWrapper.windowLayout);
        chatNotificationsPopupWrapper.type = 1;
        chatNotificationsPopupWrapper.lambda$update$11(-this.chatId, tL_forumTopic.id, null);
        if (ChatObject.canManageTopics(getCurrentChat())) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getParentActivity(), true, false);
            if (tL_forumTopic.pinned) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.DialogUnpin), R.drawable.msg_unpin);
            } else {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.DialogPin), R.drawable.msg_pin);
            }
            actionBarMenuSubItem.setMinimumWidth(160);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showChatPreview$16(tL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem);
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(-this.chatId, tL_forumTopic.id)) {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Unmute), R.drawable.msg_mute);
        } else {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString(R.string.Mute), R.drawable.msg_unmute);
        }
        actionBarMenuSubItem2.setMinimumWidth(160);
        actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$showChatPreview$17(tL_forumTopic, actionBarPopupWindowLayoutArr, iAddViewToSwipeBack, view);
            }
        });
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem2);
        if (ChatObject.canManageTopic(this.currentAccount, getCurrentChat(), tL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getParentActivity(), false, false);
            if (tL_forumTopic.closed) {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.RestartTopic), R.drawable.msg_topic_restart);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString(R.string.CloseTopic), R.drawable.msg_topic_close);
            }
            actionBarMenuSubItem3.setMinimumWidth(160);
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showChatPreview$18(tL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, getCurrentChat(), tL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getParentActivity(), false, true);
            actionBarMenuSubItem4.setTextAndIcon(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete);
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_text_RedRegular));
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_text_RedBold));
            actionBarMenuSubItem4.setMinimumWidth(160);
            actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showChatPreview$19(tL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem4);
        }
        boolean zIsMonoForum = getMessagesController().isMonoForum(-this.chatId);
        prepareBlurBitmap();
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ChatActivity chatActivity = new ChatActivity(bundle);
        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-this.chatId, zIsMonoForum ? DialogObject.getPeerDialogId(dialogCell.forumTopic.from_id) : r14.id));
        presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayoutArr[0]);
        return false;
    }

    class AnonymousClass19 implements ChatNotificationsPopupWrapper.Callback {
        final TLRPC.TL_forumTopic val$topic;

        @Override
        public void openExceptions() {
            ChatNotificationsPopupWrapper.Callback.CC.$default$openExceptions(this);
        }

        AnonymousClass19(TLRPC.TL_forumTopic tL_forumTopic) {
            this.val$topic = tL_forumTopic;
        }

        @Override
        public void dismiss() {
            TopicsFragment.this.finishPreviewFragment();
        }

        @Override
        public void toggleSound() {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) TopicsFragment.this).currentAccount);
            boolean z = notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(-TopicsFragment.this.chatId, this.val$topic.id), true);
            boolean z2 = !z;
            notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(-TopicsFragment.this.chatId, this.val$topic.id), z2).apply();
            TopicsFragment.this.finishPreviewFragment();
            if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                BulletinFactory.createSoundEnabledBulletin(topicsFragment, z ? 1 : 0, topicsFragment.getResourceProvider()).show();
            }
        }

        @Override
        public void muteFor(int i) {
            TopicsFragment.this.finishPreviewFragment();
            if (i != 0) {
                TopicsFragment.this.getNotificationsController().muteUntil(-TopicsFragment.this.chatId, this.val$topic.id, i);
                if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    BulletinFactory.createMuteBulletin(topicsFragment, 5, i, topicsFragment.getResourceProvider()).show();
                    return;
                }
                return;
            }
            if (TopicsFragment.this.getMessagesController().isDialogMuted(-TopicsFragment.this.chatId, this.val$topic.id)) {
                TopicsFragment.this.getNotificationsController().muteDialog(-TopicsFragment.this.chatId, this.val$topic.id, false);
            }
            if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                TopicsFragment topicsFragment2 = TopicsFragment.this;
                BulletinFactory.createMuteBulletin(topicsFragment2, 4, i, topicsFragment2.getResourceProvider()).show();
            }
        }

        @Override
        public void showCustomize() {
            TopicsFragment.this.finishPreviewFragment();
            final TLRPC.TL_forumTopic tL_forumTopic = this.val$topic;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showCustomize$0(tL_forumTopic);
                }
            }, 500L);
        }

        public void lambda$showCustomize$0(TLRPC.TL_forumTopic tL_forumTopic) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", -TopicsFragment.this.chatId);
            bundle.putLong("topic_id", tL_forumTopic.id);
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.presentFragment(new ProfileNotificationsActivity(bundle, topicsFragment.themeDelegate));
        }

        @Override
        public void toggleMute() {
            TopicsFragment.this.finishPreviewFragment();
            boolean zIsDialogMuted = TopicsFragment.this.getMessagesController().isDialogMuted(-TopicsFragment.this.chatId, this.val$topic.id);
            TopicsFragment.this.getNotificationsController().muteDialog(-TopicsFragment.this.chatId, this.val$topic.id, !zIsDialogMuted);
            if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                BulletinFactory.createMuteBulletin(topicsFragment, !zIsDialogMuted ? 3 : 4, !zIsDialogMuted ? Integer.MAX_VALUE : 0, topicsFragment.getResourceProvider()).show();
            }
        }
    }

    public void lambda$showChatPreview$16(TLRPC.TL_forumTopic tL_forumTopic, View view) {
        this.scrollToTop = true;
        this.updateAnimated = true;
        this.topicsController.pinTopic(this.chatId, tL_forumTopic.id, !tL_forumTopic.pinned, this);
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$17(TLRPC.TL_forumTopic tL_forumTopic, ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr, int i, View view) {
        if (getMessagesController().isDialogMuted(-this.chatId, tL_forumTopic.id)) {
            getNotificationsController().muteDialog(-this.chatId, tL_forumTopic.id, false);
            finishPreviewFragment();
            if (BulletinFactory.canShowBulletin(this)) {
                BulletinFactory.createMuteBulletin(this, 4, 0, getResourceProvider()).show();
                return;
            }
            return;
        }
        actionBarPopupWindowLayoutArr[0].getSwipeBack().openForeground(i);
    }

    public void lambda$showChatPreview$18(TLRPC.TL_forumTopic tL_forumTopic, View view) {
        this.updateAnimated = true;
        this.topicsController.toggleCloseTopic(this.chatId, tL_forumTopic.id, !tL_forumTopic.closed);
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$19(TLRPC.TL_forumTopic tL_forumTopic, View view) {
        HashSet hashSet = new HashSet();
        hashSet.add(Integer.valueOf(tL_forumTopic.id));
        deleteTopics(hashSet, new Runnable() {
            @Override
            public final void run() {
                this.f$0.finishPreviewFragment();
            }
        });
    }

    private void checkLoading() {
        this.loadingTopics = this.topicsController.isLoading(this.chatId);
        if (this.topicsEmptyView != null && (this.forumTopics.size() == 0 || (this.forumTopics.size() == 1 && ((Item) this.forumTopics.get(0)).topic.id == 1))) {
            this.topicsEmptyView.showProgress(this.loadingTopics, this.fragmentBeginToShow);
        }
        TopicsRecyclerView topicsRecyclerView = this.recyclerListView;
        if (topicsRecyclerView != null) {
            topicsRecyclerView.checkIfEmpty();
        }
        updateCreateTopicButton(true);
    }

    public void animateToSearchView(final boolean z) {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        this.searching = z;
        ValueAnimator valueAnimator = this.searchAnimator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.searchAnimator.cancel();
        }
        if (this.searchTabsView == null) {
            ViewPagerFixed.TabsView tabsViewCreateTabsView = this.searchContainer.createTabsView(false, 8);
            this.searchTabsView = tabsViewCreateTabsView;
            if (this.parentDialogsActivity != null) {
                tabsViewCreateTabsView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            }
            this.fullscreenView.addView(this.searchTabsView, LayoutHelper.createFrame(-1, 44.0f));
        }
        this.searchAnimator = ValueAnimator.ofFloat(this.searchAnimationProgress, z ? 1.0f : 0.0f);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchContainer, false, 1.0f, true);
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity != null && (rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer) != null) {
            rightSlidingDialogContainer.enabled = !z;
        }
        this.animateSearchWithScale = !z && this.searchContainer.getVisibility() == 0 && this.searchContainer.getAlpha() == 1.0f;
        this.searchAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateToSearchView$20(valueAnimator2);
            }
        });
        this.searchContainer.setVisibility(0);
        if (!z) {
            this.other.setVisibility(0);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
            updateCreateTopicButton(false);
        }
        this.searchAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                TopicsFragment.this.updateSearchProgress(z ? 1.0f : 0.0f);
                if (z) {
                    TopicsFragment.this.other.setVisibility(8);
                    return;
                }
                AndroidUtilities.setAdjustResizeToNothing(TopicsFragment.this.getParentActivity(), ((BaseFragment) TopicsFragment.this).classGuid);
                TopicsFragment.this.searchContainer.setVisibility(8);
                TopicsFragment.this.updateCreateTopicButton(true);
            }
        });
        this.searchAnimator.setDuration(200L);
        this.searchAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.searchAnimator.start();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
    }

    public void lambda$animateToSearchView$20(ValueAnimator valueAnimator) {
        updateSearchProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void updateCreateTopicButton(boolean z) {
        if (this.createTopicSubmenu == null) {
            return;
        }
        boolean z2 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(this.chatId))) || !ChatObject.canCreateTopic(getMessagesController().getChat(Long.valueOf(this.chatId))) || this.searching || this.openedForSelect || this.loadingTopics) ? false : true;
        this.canShowCreateTopic = z2;
        this.createTopicSubmenu.setVisibility(z2 ? 0 : 8);
        hideFloatingButton(!this.canShowCreateTopic, z);
    }

    public void updateSearchProgress(float f) {
        this.searchAnimationProgress = f;
        int themedColor = getThemedColor(Theme.key_actionBarDefaultIcon);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarActionModeDefaultIcon;
        actionBar.setItemsColor(ColorUtils.blendARGB(themedColor, getThemedColor(i), this.searchAnimationProgress), false);
        this.actionBar.setItemsColor(ColorUtils.blendARGB(getThemedColor(i), getThemedColor(i), this.searchAnimationProgress), true);
        this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(getThemedColor(Theme.key_actionBarDefaultSelector), getThemedColor(Theme.key_actionBarActionModeDefaultSelector), this.searchAnimationProgress), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(ColorUtils.blendARGB(getThemedColor(Theme.key_actionBarDefault), getThemedColor(Theme.key_windowBackgroundWhite), this.searchAnimationProgress));
        }
        float f2 = 1.0f - f;
        this.avatarContainer.getTitleTextView().setAlpha(f2);
        this.avatarContainer.getSubtitleTextView().setAlpha(f2);
        ViewPagerFixed.TabsView tabsView = this.searchTabsView;
        if (tabsView != null) {
            tabsView.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
            this.searchTabsView.setAlpha(f);
        }
        this.searchContainer.setTranslationY((-AndroidUtilities.dp(16.0f)) * f2);
        this.searchContainer.setAlpha(f);
        if (isInPreviewMode()) {
            this.fullscreenView.invalidate();
        }
        this.contentView.invalidate();
        this.recyclerListView.setAlpha(f2);
        if (this.animateSearchWithScale) {
            float f3 = ((1.0f - this.searchAnimationProgress) * 0.02f) + 0.98f;
            this.recyclerListView.setScaleX(f3);
            this.recyclerListView.setScaleY(f3);
        }
    }

    public void joinToGroup() {
        getMessagesController().addUserToChat(this.chatId, getUserConfig().getCurrentUser(), 0, null, this, false, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$joinToGroup$21();
            }
        }, new MessagesController.ErrorDelegate() {
            @Override
            public final boolean run(TLRPC.TL_error tL_error) {
                return this.f$0.lambda$joinToGroup$22(tL_error);
            }
        });
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        updateChatInfo();
    }

    public void lambda$joinToGroup$21() {
        this.joinRequested = false;
        updateChatInfo(true);
    }

    public boolean lambda$joinToGroup$22(TLRPC.TL_error tL_error) {
        if (tL_error == null || !"INVITE_REQUEST_SENT".equals(tL_error.text)) {
            return true;
        }
        MessagesController.getNotificationsSettings(this.currentAccount).edit().putLong("dialog_join_requested_time_" + (-this.chatId), System.currentTimeMillis()).commit();
        JoinGroupAlert.showBulletin(getContext(), this, ChatObject.isChannelAndNotMegaGroup(getCurrentChat()));
        updateChatInfo(true);
        return false;
    }

    public void clearSelectedTopics() {
        this.selectedTopics.clear();
        this.actionBar.hideActionMode();
        AndroidUtilities.updateVisibleRows(this.recyclerListView);
        updateReordering();
    }

    private void toggleSelection(android.view.View r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.toggleSelection(android.view.View):void");
    }

    public void updateReordering() {
        boolean z = ChatObject.canManageTopics(getCurrentChat()) && !this.selectedTopics.isEmpty();
        if (this.reordering != z) {
            this.reordering = z;
            Adapter adapter = this.adapter;
            adapter.notifyItemRangeChanged(0, adapter.getItemCount());
        }
    }

    public void sendReorder() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < this.forumTopics.size(); i++) {
            TLRPC.TL_forumTopic tL_forumTopic = ((Item) this.forumTopics.get(i)).topic;
            if (tL_forumTopic != null && tL_forumTopic.pinned) {
                arrayList.add(Integer.valueOf(tL_forumTopic.id));
            }
        }
        getMessagesController().getTopicsController().reorderPinnedTopics(this.chatId, arrayList);
        this.ignoreDiffUtil = true;
    }

    private void chekActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode(false, null);
        if (this.inPreviewMode) {
            actionBarMenuCreateActionMode.setBackgroundColor(0);
            actionBarMenuCreateActionMode.drawBlur = false;
        }
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedDialogsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return TopicsFragment.lambda$chekActionMode$23(view, motionEvent);
            }
        });
        this.pinItem = actionBarMenuCreateActionMode.addItemWithWidth(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
        this.unpinItem = actionBarMenuCreateActionMode.addItemWithWidth(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
        this.muteItem = actionBarMenuCreateActionMode.addItemWithWidth(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
        this.deleteItem = actionBarMenuCreateActionMode.addItemWithWidth(7, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateActionMode.addItemWithWidth(12, R.drawable.msg_archive_hide, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Hide));
        this.hideItem = actionBarMenuItemAddItemWithWidth;
        actionBarMenuItemAddItemWithWidth.setVisibility(8);
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth2 = actionBarMenuCreateActionMode.addItemWithWidth(13, R.drawable.msg_archive_show, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Show));
        this.showItem = actionBarMenuItemAddItemWithWidth2;
        actionBarMenuItemAddItemWithWidth2.setVisibility(8);
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth3 = actionBarMenuCreateActionMode.addItemWithWidth(0, R.drawable.ic_ab_other, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.AccDescrMoreOptions));
        this.otherItem = actionBarMenuItemAddItemWithWidth3;
        this.readItem = actionBarMenuItemAddItemWithWidth3.addSubItem(8, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.closeTopic = this.otherItem.addSubItem(9, R.drawable.msg_topic_close, LocaleController.getString(R.string.CloseTopic));
        this.restartTopic = this.otherItem.addSubItem(10, R.drawable.msg_topic_restart, LocaleController.getString(R.string.RestartTopic));
    }

    public class TouchHelperCallback extends ItemTouchHelper.Callback {
        private RecyclerView.ViewHolder currentItemViewHolder;
        private boolean swipeFolderBack;
        private boolean swipingFolder;

        public TouchHelperCallback() {
        }

        @Override
        public boolean isLongPressDragEnabled() {
            return !TopicsFragment.this.selectedTopics.isEmpty();
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition < 0 || adapterPosition >= TopicsFragment.this.forumTopics.size() || ((Item) TopicsFragment.this.forumTopics.get(adapterPosition)).topic == null || !ChatObject.canManageTopics(TopicsFragment.this.getCurrentChat())) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            TLRPC.TL_forumTopic tL_forumTopic = ((Item) TopicsFragment.this.forumTopics.get(adapterPosition)).topic;
            if (TopicsFragment.this.selectedTopics.isEmpty()) {
                View view = viewHolder.itemView;
                if ((view instanceof TopicDialogCell) && tL_forumTopic.id == 1) {
                    this.swipeFolderBack = false;
                    this.swipingFolder = true;
                    ((TopicDialogCell) view).setSliding(true);
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                }
            }
            if (!tL_forumTopic.pinned) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int adapterPosition;
            if (viewHolder.getItemViewType() != viewHolder2.getItemViewType() || (adapterPosition = viewHolder2.getAdapterPosition()) < 0 || adapterPosition >= TopicsFragment.this.forumTopics.size() || ((Item) TopicsFragment.this.forumTopics.get(adapterPosition)).topic == null || !((Item) TopicsFragment.this.forumTopics.get(adapterPosition)).topic.pinned) {
                return false;
            }
            TopicsFragment.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
            return true;
        }

        @Override
        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, float f, float f2, int i, boolean z) {
            super.onChildDraw(canvas, recyclerView, viewHolder, f, f2, i, z);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (i != 0) {
                TopicsFragment.this.recyclerListView.cancelClickRunnables(false);
                viewHolder.itemView.setPressed(true);
            } else {
                TopicsFragment.this.sendReorder();
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                if (topicDialogCell.forumTopic != null) {
                    TopicsController topicsController = TopicsFragment.this.getMessagesController().getTopicsController();
                    long j = TopicsFragment.this.chatId;
                    TLRPC.TL_forumTopic tL_forumTopic = topicDialogCell.forumTopic;
                    topicsController.toggleShowTopic(j, tL_forumTopic.id, tL_forumTopic.hidden);
                }
                TopicsFragment.this.generalTopicViewMoving = topicDialogCell;
                TopicsFragment.this.recyclerListView.setArchiveHidden(!topicDialogCell.forumTopic.hidden, topicDialogCell);
                TopicsFragment.this.updateTopicsList(true, true);
                if (topicDialogCell.currentTopic != null) {
                    topicDialogCell.setTopicIcon(topicDialogCell.currentTopic);
                }
            }
        }

        @Override
        public void clearView(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            super.clearView(recyclerView, viewHolder);
            viewHolder.itemView.setPressed(false);
        }
    }

    public void updateChatInfo() {
        updateChatInfo(false);
    }

    private void updateChatInfo(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.updateChatInfo(boolean):void");
    }

    private void setButtonType(int i) {
        if (this.bottomButtonType != i) {
            this.bottomButtonType = i;
            this.bottomOverlayChatText.setTextColorKey(i == 0 ? Theme.key_chat_fieldOverlayText : Theme.key_text_RedBold);
            this.closeReportSpam.setVisibility(i == 1 ? 0 : 8);
            updateChatInfo();
        }
    }

    private void updateSubtitle() {
        String string;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatParticipants chatParticipants;
        TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(this.chatId);
        if (chatFull2 != null && (chatFull = this.chatFull) != null && (chatParticipants = chatFull.participants) != null) {
            chatFull2.participants = chatParticipants;
        }
        this.chatFull = chatFull2;
        if (chatFull2 != null) {
            int i = chatFull2.participants_count;
            if (i <= 0) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
                if (chat == null) {
                    string = LocaleController.getString(R.string.Loading);
                } else if (ChatObject.isPublic(chat)) {
                    string = LocaleController.getString(R.string.MegaPublic).toLowerCase();
                } else {
                    string = LocaleController.getString(R.string.MegaPrivate).toLowerCase();
                }
            } else {
                string = LocaleController.formatPluralString("Members", i, new Object[0]);
            }
        } else {
            string = LocaleController.getString(R.string.Loading);
        }
        this.avatarContainer.setSubtitle(string);
    }

    @Override
    public boolean onFragmentCreate() {
        getMessagesController().loadFullChat(this.chatId, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        updateTopicsList(false, false);
        SelectAnimatedEmojiDialog.preload(this.currentAccount);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        if (!settingsPreloaded.contains(Long.valueOf(this.chatId))) {
            settingsPreloaded.add(Long.valueOf(this.chatId));
            TL_account.getNotifyExceptions getnotifyexceptions = new TL_account.getNotifyExceptions();
            TLRPC.TL_inputNotifyPeer tL_inputNotifyPeer = new TLRPC.TL_inputNotifyPeer();
            getnotifyexceptions.peer = tL_inputNotifyPeer;
            getnotifyexceptions.flags |= 1;
            tL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-this.chatId);
            getConnectionsManager().sendRequest(getnotifyexceptions, null);
        }
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        this.notificationsLocker.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwitchedForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity == null || dialogsActivity.rightSlidingDialogContainer == null) {
            return;
        }
        dialogsActivity.getActionBar().setSearchAvatarImageView(null);
        this.parentDialogsActivity.rightSlidingDialogContainer.enabled = true;
    }

    public void updateTopicsList(boolean z, boolean z2) {
        LinearLayoutManager linearLayoutManager;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (!z && this.updateAnimated) {
            z = true;
        }
        this.updateAnimated = false;
        ArrayList<TLRPC.TL_forumTopic> topics = this.topicsController.getTopics(this.chatId);
        if (topics != null) {
            int size = this.forumTopics.size();
            ArrayList arrayList = new ArrayList(this.forumTopics);
            this.forumTopics.clear();
            if (UserObject.isBotForumWithEditableTopics(this.currentAccount, -this.chatId) && this.openedForForward) {
                this.forumTopics.add(new Item(3, null));
            }
            for (int i = 0; i < topics.size(); i++) {
                HashSet hashSet = this.excludeTopics;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i).id))) {
                    this.forumTopics.add(new Item(0, topics.get(i)));
                }
            }
            if (!this.forumTopics.isEmpty() && !this.topicsController.endIsReached(this.chatId) && this.canShowProgress) {
                this.forumTopics.add(new Item(1, null));
            }
            int size2 = this.forumTopics.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.itemsEnterAnimator.showItemsAnimated(size + 4);
                z = false;
            }
            this.hiddenCount = 0;
            for (int i2 = 0; i2 < this.forumTopics.size(); i2++) {
                Item item = (Item) this.forumTopics.get(i2);
                if (item != null && (tL_forumTopic = item.topic) != null && tL_forumTopic.hidden) {
                    this.hiddenCount++;
                }
            }
            TopicsRecyclerView topicsRecyclerView = this.recyclerListView;
            if (topicsRecyclerView != null) {
                if (topicsRecyclerView.getItemAnimator() != (z ? this.itemAnimator : null)) {
                    this.recyclerListView.setItemAnimator(z ? this.itemAnimator : null);
                }
            }
            Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.setItems(arrayList, this.forumTopics);
            }
            if ((this.scrollToTop || size == 0) && (linearLayoutManager = this.layoutManager) != null) {
                linearLayoutManager.scrollToPositionWithOffset(0, 0);
                this.scrollToTop = false;
            }
        }
        checkLoading();
        updateTopicsEmptyViewText();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        TLRPC.ChatFull chatFull;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull2 = (TLRPC.ChatFull) objArr[0];
            TLRPC.ChatParticipants chatParticipants = chatFull2.participants;
            if (chatParticipants != null && (chatFull = this.chatFull) != null) {
                chatFull.participants = chatParticipants;
            }
            if (chatFull2.id == this.chatId) {
                updateChatInfo();
                ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.pendingRequestsDelegate;
                if (chatActivityMemberRequestsDelegate != null) {
                    chatActivityMemberRequestsDelegate.setChatInfo(chatFull2, true);
                }
                checkGroupCallJoin(((Boolean) objArr[3]).booleanValue());
            }
        } else if (i == NotificationCenter.storiesUpdated) {
            updateChatInfo();
        } else if (i == NotificationCenter.chatWasBoostedByUser) {
            if (this.chatId == (-((Long) objArr[2]).longValue())) {
                this.boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[0];
            }
        } else if (i == NotificationCenter.topicsDidLoaded) {
            if (this.chatId == ((Long) objArr[0]).longValue()) {
                updateTopicsList(false, true);
                if (objArr.length > 1 && ((Boolean) objArr[1]).booleanValue()) {
                    checkForLoadMore();
                }
                checkLoading();
            }
        } else if (i == NotificationCenter.updateInterfaces) {
            int iIntValue = ((Integer) objArr[0]).intValue();
            if (iIntValue == MessagesController.UPDATE_MASK_CHAT) {
                updateChatInfo();
            }
            if ((iIntValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(this.chatId, false);
                boolean zCanScrollVertically = this.recyclerListView.canScrollVertically(-1);
                updateTopicsList(true, false);
                if (!zCanScrollVertically) {
                    this.layoutManager.scrollToPosition(0);
                }
            }
        } else if (i == NotificationCenter.dialogsNeedReload) {
            updateTopicsList(false, false);
        } else if (i == NotificationCenter.groupCallUpdated) {
            Long l = (Long) objArr[0];
            if (this.chatId == l.longValue()) {
                this.groupCall = getMessagesController().getGroupCall(l.longValue(), false);
                FragmentContextView fragmentContextView = this.fragmentContextView;
                if (fragmentContextView != null) {
                    fragmentContextView.checkCall(!this.fragmentBeginToShow);
                }
                checkGroupCallJoin(false);
            }
        } else if (i == NotificationCenter.notificationsSettingsUpdated) {
            updateTopicsList(false, false);
            updateChatInfo(true);
        } else if (i != NotificationCenter.chatSwitchedForum && i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
            long jLongValue = ((Long) objArr[0]).longValue();
            long jLongValue2 = ((Long) objArr[1]).longValue();
            if (jLongValue != (-this.chatId) || zBooleanValue) {
                if (this.selectedTopicForTablet != 0) {
                    this.selectedTopicForTablet = 0L;
                    updateTopicsList(false, false);
                    return;
                }
                return;
            }
            if (this.selectedTopicForTablet != jLongValue2) {
                this.selectedTopicForTablet = jLongValue2;
                updateTopicsList(false, false);
            }
        }
    }

    public void checkForLoadMore() {
        LinearLayoutManager linearLayoutManager;
        if (this.topicsController.endIsReached(this.chatId) || (linearLayoutManager = this.layoutManager) == null) {
            return;
        }
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (this.forumTopics.isEmpty() || iFindLastVisibleItemPosition >= this.adapter.getItemCount() - 5) {
            this.topicsController.loadTopics(this.chatId);
        }
        checkLoading();
    }

    public void setExcludeTopics(HashSet hashSet) {
        this.excludeTopics = hashSet;
    }

    @Override
    public ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.groupCall;
        if (call == null || !(call.call instanceof TLRPC.TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override
    public TLRPC.Chat getCurrentChat() {
        return getMessagesController().getChat(Long.valueOf(this.chatId));
    }

    @Override
    public long getDialogId() {
        return -this.chatId;
    }

    public void setForwardFromDialogFragment(DialogsActivity dialogsActivity) {
        this.dialogsActivity = dialogsActivity;
    }

    private class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 2;
            }
            return ((Item) TopicsFragment.this.forumTopics.get(i)).viewType;
        }

        public ArrayList getArray() {
            return TopicsFragment.this.forumTopicsListFrozen ? TopicsFragment.this.frozenForumTopicsList : TopicsFragment.this.forumTopics;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0 || i == 3) {
                TopicDialogCell topicDialogCell = TopicsFragment.this.new TopicDialogCell(null, viewGroup.getContext(), true, false);
                if (i == 3) {
                    topicDialogCell.setForumIcon(ForumUtilities.createTopicDrawable("", ForumBubbleDrawable.serverSupportedColor[0], false));
                    topicDialogCell.setTitleOverride(LocaleController.getString(R.string.BotForumAskForStartNewChatTitle));
                    topicDialogCell.setCustomMessage(LocaleController.getString(R.string.BotForumAskForStartNewChatForward));
                }
                topicDialogCell.inPreviewMode = ((BaseFragment) TopicsFragment.this).inPreviewMode;
                topicDialogCell.setArchivedPullAnimation(TopicsFragment.this.pullForegroundDrawable);
                return new RecyclerListView.Holder(topicDialogCell);
            }
            if (i == 2) {
                return new RecyclerListView.Holder(TopicsFragment.this.emptyView = new View(TopicsFragment.this.getContext()) {
                    HashMap precalcEllipsized = new HashMap();

                    @Override
                    protected void onMeasure(int i2, int i3) {
                        int i4;
                        int iDp;
                        int size = View.MeasureSpec.getSize(i2);
                        int iDp2 = AndroidUtilities.dp(64.0f);
                        int i5 = 0;
                        int i6 = 0;
                        for (int i7 = 0; i7 < Adapter.this.getArray().size(); i7++) {
                            if (Adapter.this.getArray().get(i7) != null && ((Item) Adapter.this.getArray().get(i7)).topic != null) {
                                String str = ((Item) Adapter.this.getArray().get(i7)).topic.title;
                                Boolean boolValueOf = (Boolean) this.precalcEllipsized.get(str);
                                if (boolValueOf == null) {
                                    int iDp3 = AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : (TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 4);
                                    if (LocaleController.isRTL) {
                                        i4 = size - iDp3;
                                        iDp = AndroidUtilities.dp((TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 13);
                                    } else {
                                        i4 = size - iDp3;
                                        iDp = AndroidUtilities.dp(22.0f);
                                    }
                                    boolValueOf = Boolean.valueOf(Theme.dialogs_namePaint[0].measureText(str) <= ((float) ((i4 - iDp) - ((int) Math.ceil((double) Theme.dialogs_timePaint.measureText("00:00"))))));
                                    this.precalcEllipsized.put(str, boolValueOf);
                                }
                                int iDp4 = AndroidUtilities.dp((!boolValueOf.booleanValue() ? 20 : 0) + 64);
                                if (((Item) Adapter.this.getArray().get(i7)).topic.id == 1) {
                                    iDp2 = iDp4;
                                }
                                if (((Item) Adapter.this.getArray().get(i7)).topic.hidden) {
                                    i5++;
                                }
                                i6 += iDp4;
                            }
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(0, i5 > 0 ? (((TopicsFragment.this.recyclerListView.getMeasuredHeight() - TopicsFragment.this.recyclerListView.getPaddingTop()) - TopicsFragment.this.recyclerListView.getPaddingBottom()) - i6) + iDp2 : 0), 1073741824));
                    }
                });
            }
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext());
            flickerLoadingView.setViewType(24);
            flickerLoadingView.setIsSingleCell(true);
            flickerLoadingView.showDate(true);
            return new RecyclerListView.Holder(flickerLoadingView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            boolean z;
            int i2;
            if (viewHolder.getItemViewType() == 0) {
                TLRPC.TL_forumTopic tL_forumTopic = ((Item) getArray().get(i)).topic;
                int i3 = i + 1;
                TLRPC.TL_forumTopic tL_forumTopic2 = i3 < getArray().size() ? ((Item) getArray().get(i3)).topic : null;
                TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                TLRPC.Message message = tL_forumTopic.topMessage;
                TLRPC.TL_forumTopic tL_forumTopic3 = topicDialogCell.forumTopic;
                int i4 = tL_forumTopic3 == null ? 0 : tL_forumTopic3.id;
                int i5 = tL_forumTopic.id;
                boolean z2 = i4 == i5 && topicDialogCell.position == i && TopicsFragment.this.animatedUpdateEnabled;
                if (message != null) {
                    MessageObject messageObject = new MessageObject(((BaseFragment) TopicsFragment.this).currentAccount, message, false, false);
                    if (TopicsFragment.this.getMessagesController().isMonoForum(-TopicsFragment.this.chatId)) {
                        topicDialogCell.isMonoForumTopicDialog = true;
                        topicDialogCell.drawAvatar = true;
                        topicDialogCell.forumTopic = tL_forumTopic;
                        topicDialogCell.messagePaddingStart = 72;
                        topicDialogCell.chekBoxPaddingTop = 42.0f;
                        topicDialogCell.heightDefault = 72;
                        topicDialogCell.heightThreeLines = 78;
                        topicDialogCell.setDialog(DialogObject.getPeerDialogId(tL_forumTopic.from_id), messageObject, message.date, false, false);
                        topicDialogCell.isSavedDialogCell = true;
                        topicDialogCell.useSeparator = i3 < getItemCount();
                        z = z2;
                        i2 = i5;
                    } else {
                        TopicsFragment topicsFragment = TopicsFragment.this;
                        z = z2;
                        i2 = i5;
                        topicDialogCell.setForumTopic(tL_forumTopic, -topicsFragment.chatId, messageObject, topicsFragment.isInPreviewMode(), z);
                        topicDialogCell.drawDivider = i != TopicsFragment.this.forumTopics.size() - 1 || TopicsFragment.this.recyclerListView.emptyViewIsVisible();
                        boolean z3 = tL_forumTopic.pinned;
                        topicDialogCell.fullSeparator = z3 && (tL_forumTopic2 == null || !tL_forumTopic2.pinned);
                        topicDialogCell.setPinForced(z3 && !tL_forumTopic.hidden);
                        topicDialogCell.position = i;
                    }
                } else {
                    z = z2;
                    i2 = i5;
                }
                if (!TopicsFragment.this.getMessagesController().isMonoForum(-TopicsFragment.this.chatId)) {
                    topicDialogCell.setTopicIcon(tL_forumTopic);
                }
                topicDialogCell.setChecked(TopicsFragment.this.selectedTopics.contains(Integer.valueOf(i2)), z);
                topicDialogCell.setDialogSelected(TopicsFragment.this.selectedTopicForTablet == ((long) i2));
                topicDialogCell.onReorderStateChanged(TopicsFragment.this.reordering, true);
                return;
            }
            if (viewHolder.getItemViewType() == 3) {
                TopicDialogCell topicDialogCell2 = (TopicDialogCell) viewHolder.itemView;
                topicDialogCell2.setCurrentDialogId(-TopicsFragment.this.chatId);
                topicDialogCell2.drawDivider = i != TopicsFragment.this.forumTopics.size() - 1 || TopicsFragment.this.recyclerListView.emptyViewIsVisible();
                topicDialogCell2.position = i;
            }
        }

        @Override
        public int getItemCount() {
            return getArray().size() + 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0 || viewHolder.getItemViewType() == 3;
        }

        public void swapElements(int i, int i2) {
            if (TopicsFragment.this.forumTopicsListFrozen) {
                return;
            }
            ArrayList arrayList = TopicsFragment.this.forumTopics;
            arrayList.add(i2, (Item) arrayList.remove(i));
            if (TopicsFragment.this.recyclerListView.getItemAnimator() != TopicsFragment.this.itemAnimator) {
                TopicsFragment.this.recyclerListView.setItemAnimator(TopicsFragment.this.itemAnimator);
            }
            notifyItemMoved(i, i2);
        }

        @Override
        public void notifyDataSetChanged() {
            TopicsFragment.this.lastItemsCount = getItemCount();
            super.notifyDataSetChanged();
        }
    }

    public class TopicDialogCell extends DialogCell {
        private AnimatedEmojiDrawable animatedEmojiDrawable;
        boolean attached;
        private boolean closed;
        private TLRPC.TL_forumTopic currentTopic;
        public boolean drawDivider;
        private Drawable forumIcon;
        private Boolean hidden;
        private ValueAnimator hiddenAnimator;
        private float hiddenT;
        private boolean isGeneral;
        public int position;

        public TopicDialogCell(DialogsActivity dialogsActivity, Context context, boolean z, boolean z2) {
            super(dialogsActivity, context, z, z2);
            this.position = -1;
            this.drawAvatar = false;
            this.messagePaddingStart = TopicsFragment.this.isInPreviewMode() ? 11 : 50;
            this.chekBoxPaddingTop = 24.0f;
            this.heightDefault = 64;
            this.heightThreeLines = 76;
            this.forbidVerified = true;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            PullForegroundDrawable pullForegroundDrawable;
            CheckBox2 checkBox2;
            if (TopicsFragment.this.getMessagesController().isMonoForum(-TopicsFragment.this.chatId)) {
                super.onDraw(canvas);
                return;
            }
            this.xOffset = (!this.inPreviewMode || (checkBox2 = this.checkBox) == null) ? 0.0f : checkBox2.getProgress() * AndroidUtilities.dp(30.0f);
            canvas.save();
            float f = this.xOffset;
            int i = -AndroidUtilities.dp(4.0f);
            this.translateY = i;
            canvas.translate(f, i);
            canvas.drawColor(TopicsFragment.this.getThemedColor(Theme.key_windowBackgroundWhite));
            super.onDraw(canvas);
            canvas.restore();
            canvas.save();
            canvas.translate(this.translationX, 0.0f);
            if (this.drawDivider) {
                int iDp = this.fullSeparator ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth() - iDp, getMeasuredHeight() - 1, Theme.dividerPaint);
                } else {
                    canvas.drawLine(iDp - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            }
            if ((!this.isGeneral || (pullForegroundDrawable = this.archivedChatsDrawable) == null || pullForegroundDrawable.outProgress != 0.0f) && (this.animatedEmojiDrawable != null || this.forumIcon != null)) {
                int iDp2 = AndroidUtilities.dp(10.0f);
                int iDp3 = AndroidUtilities.dp(10.0f);
                int iDp4 = AndroidUtilities.dp(28.0f);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable != null) {
                    if (LocaleController.isRTL) {
                        animatedEmojiDrawable.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                    } else {
                        animatedEmojiDrawable.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                    }
                    this.animatedEmojiDrawable.draw(canvas);
                } else {
                    if (LocaleController.isRTL) {
                        this.forumIcon.setBounds((getWidth() - iDp2) - iDp4, iDp3, getWidth() - iDp2, iDp4 + iDp3);
                    } else {
                        this.forumIcon.setBounds(iDp2, iDp3, iDp2 + iDp4, iDp4 + iDp3);
                    }
                    this.forumIcon.draw(canvas);
                }
            }
            canvas.restore();
        }

        @Override
        public void buildLayout() {
            super.buildLayout();
            setHiddenT();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.attached = false;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
        }

        public void setAnimatedEmojiDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable2 == animatedEmojiDrawable) {
                return;
            }
            if (animatedEmojiDrawable2 != null && this.attached) {
                animatedEmojiDrawable2.removeView(this);
            }
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.setColorFilter(Theme.chat_animatedEmojiTextColorFilter);
            }
            this.animatedEmojiDrawable = animatedEmojiDrawable;
            if (animatedEmojiDrawable == null || !this.attached) {
                return;
            }
            animatedEmojiDrawable.addView(this);
        }

        public void setForumIcon(Drawable drawable) {
            this.forumIcon = drawable;
        }

        public void setTopicIcon(TLRPC.TL_forumTopic tL_forumTopic) {
            this.currentTopic = tL_forumTopic;
            boolean z = false;
            this.closed = tL_forumTopic != null && tL_forumTopic.closed;
            if (this.inPreviewMode) {
                updateHidden(tL_forumTopic != null && tL_forumTopic.hidden, true);
            }
            this.isGeneral = tL_forumTopic != null && tL_forumTopic.id == 1;
            if (tL_forumTopic != null && this != TopicsFragment.this.generalTopicViewMoving) {
                if (tL_forumTopic.hidden) {
                    this.overrideSwipeAction = true;
                    this.overrideSwipeActionBackgroundColorKey = Theme.key_chats_archivePinBackground;
                    this.overrideSwipeActionRevealBackgroundColorKey = Theme.key_chats_archiveBackground;
                    this.overrideSwipeActionStringKey = "Unhide";
                    this.overrideSwipeActionStringId = R.string.Unhide;
                    this.overrideSwipeActionDrawable = Theme.dialogs_unpinArchiveDrawable;
                } else {
                    this.overrideSwipeAction = true;
                    this.overrideSwipeActionBackgroundColorKey = Theme.key_chats_archiveBackground;
                    this.overrideSwipeActionRevealBackgroundColorKey = Theme.key_chats_archivePinBackground;
                    this.overrideSwipeActionStringKey = "Hide";
                    this.overrideSwipeActionStringId = R.string.Hide;
                    this.overrideSwipeActionDrawable = Theme.dialogs_pinArchiveDrawable;
                }
                invalidate();
            }
            if (this.inPreviewMode) {
                return;
            }
            if (tL_forumTopic != null && tL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createGeneralTopicDrawable(getContext(), 1.0f, TopicsFragment.this.getThemedColor(Theme.key_chat_inMenu), false));
            } else if (tL_forumTopic != null && tL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable == null || animatedEmojiDrawable.getDocumentId() != tL_forumTopic.icon_emoji_id) {
                    setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(TopicsFragment.this.openedForForward ? 13 : 10, ((BaseFragment) TopicsFragment.this).currentAccount, tL_forumTopic.icon_emoji_id));
                }
            } else {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createTopicDrawable(tL_forumTopic, false));
            }
            if (tL_forumTopic != null && tL_forumTopic.hidden) {
                z = true;
            }
            updateHidden(z, true);
            buildLayout();
        }

        private void updateHidden(boolean z, boolean z2) {
            if (this.hidden == null) {
                z2 = false;
            }
            ValueAnimator valueAnimator = this.hiddenAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.hiddenAnimator = null;
            }
            this.hidden = Boolean.valueOf(z);
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.hiddenT, z ? 1.0f : 0.0f);
                this.hiddenAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$updateHidden$0(valueAnimator2);
                    }
                });
                this.hiddenAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.hiddenAnimator.start();
                return;
            }
            this.hiddenT = z ? 1.0f : 0.0f;
            setHiddenT();
        }

        public void lambda$updateHidden$0(ValueAnimator valueAnimator) {
            this.hiddenT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            setHiddenT();
        }

        private void setHiddenT() {
            Drawable drawable = this.forumIcon;
            if (drawable instanceof ForumUtilities.GeneralTopicDrawable) {
                ((ForumUtilities.GeneralTopicDrawable) drawable).setColor(ColorUtils.blendARGB(TopicsFragment.this.getThemedColor(Theme.key_chats_archivePullDownBackground), TopicsFragment.this.getThemedColor(Theme.key_avatar_background2Saved), this.hiddenT));
            }
            Drawable[] drawableArr = this.topicIconInName;
            if (drawableArr != null) {
                Drawable drawable2 = drawableArr[0];
                if (drawable2 instanceof ForumUtilities.GeneralTopicDrawable) {
                    ((ForumUtilities.GeneralTopicDrawable) drawable2).setColor(ColorUtils.blendARGB(TopicsFragment.this.getThemedColor(Theme.key_chats_archivePullDownBackground), TopicsFragment.this.getThemedColor(Theme.key_avatar_background2Saved), this.hiddenT));
                }
            }
            invalidate();
        }

        @Override
        protected boolean drawLock2() {
            return this.closed;
        }
    }

    public void hideFloatingButton(boolean z, boolean z2) {
        this.floatingButton.setButtonVisible(!z, this.fragmentBeginToShow && z2);
    }

    private void updateFloatingButtonOffset() {
        this.floatingButton.setTranslationY(((-this.transitionPadding) - this.navigationBarHeight) - this.additionFloatingButtonOffset);
    }

    @Override
    public void onBecomeFullyHidden() {
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.closeSearchField();
        }
    }

    private class EmptyViewContainer extends FrameLayout {
        boolean increment;
        float progress;
        TextView textView;

        public EmptyViewContainer(Context context) {
            SpannableStringBuilder spannableStringBuilder;
            super(context);
            this.textView = new TextView(context);
            if (LocaleController.isRTL) {
                spannableStringBuilder = new SpannableStringBuilder("  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.attach_arrow_left), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.TapToCreateTopicHint));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.TapToCreateTopicHint));
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.arrow_newchat), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
            this.textView.setText(spannableStringBuilder);
            this.textView.setTextSize(1, 14.0f);
            this.textView.setLayerType(2, null);
            this.textView.setTextColor(TopicsFragment.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            TextView textView = this.textView;
            boolean z = LocaleController.isRTL;
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, z ? 72.0f : 32.0f, 0.0f, z ? 32.0f : 72.0f, 32.0f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            if (this.increment) {
                float f = this.progress + 0.013333334f;
                this.progress = f;
                if (f > 1.0f) {
                    this.increment = false;
                    this.progress = 1.0f;
                }
            } else {
                float f2 = this.progress - 0.013333334f;
                this.progress = f2;
                if (f2 < 0.0f) {
                    this.increment = true;
                    this.progress = 0.0f;
                }
            }
            this.textView.setTranslationX(CubicBezierInterpolator.DEFAULT.getInterpolation(this.progress) * AndroidUtilities.dp(8.0f) * (LocaleController.isRTL ? -1 : 1));
            invalidate();
        }
    }

    @Override
    public boolean isLightStatusBar() {
        int themedColor = getThemedColor(this.searching ? Theme.key_windowBackgroundWhite : Theme.key_actionBarDefault);
        if (this.actionBar.isActionModeShowed()) {
            themedColor = getThemedColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(themedColor) > 0.699999988079071d;
    }

    class MessagesSearchContainer extends ViewPagerFixed implements FilteredSearchView.UiCallback {
        boolean canLoadMore;
        SearchViewPager.ChatPreviewDelegate chatPreviewDelegate;
        StickerEmptyView emptyView;
        FlickerLoadingView flickerLoadingView;
        boolean isLoading;
        RecyclerItemsEnterAnimator itemsEnterAnimator;
        private int keyboardSize;
        LinearLayoutManager layoutManager;
        int messagesEndRow;
        int messagesHeaderRow;
        boolean messagesIsLoading;
        int messagesStartRow;
        RecyclerListView recyclerView;
        int rowCount;
        SearchAdapter searchAdapter;
        FrameLayout searchContainer;
        ArrayList searchResultMessages;
        ArrayList searchResultTopics;
        Runnable searchRunnable;
        String searchString;
        private ArrayList selectedItems;
        int topicsEndRow;
        int topicsHeaderRow;
        int topicsStartRow;
        private ViewPagerAdapter viewPagerAdapter;

        public MessagesSearchContainer(Context context) {
            super(context);
            this.searchString = "empty";
            this.searchResultTopics = new ArrayList();
            this.searchResultMessages = new ArrayList();
            this.selectedItems = new ArrayList();
            this.searchContainer = new FrameLayout(context);
            this.chatPreviewDelegate = new SearchViewPager.ChatPreviewDelegate() {
                @Override
                public void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell) {
                    TopicsFragment.this.showChatPreview(dialogCell);
                }

                @Override
                public void move(float f) {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        TopicsFragment.this.movePreviewFragment(f);
                    }
                }

                @Override
                public void finish() {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        TopicsFragment.this.finishPreviewFragment();
                    }
                }
            };
            RecyclerListView recyclerListView = new RecyclerListView(context);
            this.recyclerView = recyclerListView;
            SearchAdapter searchAdapter = new SearchAdapter();
            this.searchAdapter = searchAdapter;
            recyclerListView.setAdapter(searchAdapter);
            RecyclerListView recyclerListView2 = this.recyclerView;
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            this.layoutManager = linearLayoutManager;
            recyclerListView2.setLayoutManager(linearLayoutManager);
            this.recyclerView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    this.f$0.lambda$new$0(view, i);
                }
            });
            this.recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                    if (messagesSearchContainer.canLoadMore) {
                        int iFindLastVisibleItemPosition = messagesSearchContainer.layoutManager.findLastVisibleItemPosition() + 5;
                        MessagesSearchContainer messagesSearchContainer2 = MessagesSearchContainer.this;
                        if (iFindLastVisibleItemPosition >= messagesSearchContainer2.rowCount) {
                            messagesSearchContainer2.loadMessages(messagesSearchContainer2.searchString);
                        }
                    }
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    if (topicsFragment.searching) {
                        if (i == 0 && i2 == 0) {
                            return;
                        }
                        AndroidUtilities.hideKeyboard(topicsFragment.searchItem.getSearchField());
                    }
                }
            });
            FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
            this.flickerLoadingView = flickerLoadingView;
            flickerLoadingView.setViewType(7);
            this.flickerLoadingView.showDate(false);
            this.flickerLoadingView.setUseHeaderOffset(true);
            StickerEmptyView stickerEmptyView = new StickerEmptyView(context, this.flickerLoadingView, 1);
            this.emptyView = stickerEmptyView;
            stickerEmptyView.title.setText(LocaleController.getString(R.string.NoResult));
            this.emptyView.subtitle.setVisibility(8);
            this.emptyView.setVisibility(8);
            this.emptyView.addView(this.flickerLoadingView, 0);
            this.emptyView.setAnimateLayoutChange(true);
            this.recyclerView.setEmptyView(this.emptyView);
            this.recyclerView.setAnimateEmptyView(true, 0);
            this.searchContainer.addView(this.emptyView);
            this.searchContainer.addView(this.recyclerView);
            updateRows();
            RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.recyclerView, true);
            this.itemsEnterAnimator = recyclerItemsEnterAnimator;
            this.recyclerView.setItemsEnterAnimator(recyclerItemsEnterAnimator);
            ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter();
            this.viewPagerAdapter = viewPagerAdapter;
            setAdapter(viewPagerAdapter);
        }

        public void lambda$new$0(View view, int i) {
            if (view instanceof TopicSearchCell) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                ForumUtilities.openTopic(topicsFragment, topicsFragment.chatId, ((TopicSearchCell) view).getTopic(), 0);
            } else if (view instanceof TopicDialogCell) {
                TopicDialogCell topicDialogCell = (TopicDialogCell) view;
                TopicsFragment topicsFragment2 = TopicsFragment.this;
                ForumUtilities.openTopic(topicsFragment2, topicsFragment2.chatId, topicDialogCell.forumTopic, topicDialogCell.getMessageId());
            }
        }

        class Item {
            int filterIndex;
            private final int type;

            private Item(int i) {
                this.type = i;
            }
        }

        private class ViewPagerAdapter extends ViewPagerFixed.Adapter {
            ArrayList items;

            public ViewPagerAdapter() {
                ArrayList arrayList = new ArrayList();
                this.items = arrayList;
                arrayList.add(new Item(0));
                int i = 2;
                Item item = new Item(i);
                item.filterIndex = 0;
                this.items.add(item);
                Item item2 = new Item(i);
                item2.filterIndex = 1;
                this.items.add(item2);
                Item item3 = new Item(i);
                item3.filterIndex = 2;
                this.items.add(item3);
                Item item4 = new Item(i);
                item4.filterIndex = 3;
                this.items.add(item4);
                Item item5 = new Item(i);
                item5.filterIndex = 4;
                this.items.add(item5);
            }

            @Override
            public int getItemCount() {
                return this.items.size();
            }

            @Override
            public View createView(int i) {
                if (i == 1) {
                    return MessagesSearchContainer.this.searchContainer;
                }
                if (i == 2) {
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    SearchDownloadsContainer searchDownloadsContainer = new SearchDownloadsContainer(topicsFragment, ((BaseFragment) topicsFragment).currentAccount);
                    searchDownloadsContainer.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                        @Override
                        public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                            super.onScrolled(recyclerView, i2, i3);
                        }
                    });
                    searchDownloadsContainer.setUiCallback(MessagesSearchContainer.this);
                    return searchDownloadsContainer;
                }
                FilteredSearchView filteredSearchView = new FilteredSearchView(TopicsFragment.this);
                filteredSearchView.setChatPreviewDelegate(MessagesSearchContainer.this.chatPreviewDelegate);
                filteredSearchView.setUiCallback(MessagesSearchContainer.this);
                filteredSearchView.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                        super.onScrolled(recyclerView, i2, i3);
                    }
                });
                return filteredSearchView;
            }

            @Override
            public String getItemTitle(int i) {
                if (((Item) this.items.get(i)).type != 0) {
                    if (((Item) this.items.get(i)).type == 1) {
                        return LocaleController.getString(R.string.DownloadsTabs);
                    }
                    return FiltersView.filters[((Item) this.items.get(i)).filterIndex].getTitle();
                }
                return LocaleController.getString(R.string.SearchMessages);
            }

            @Override
            public int getItemViewType(int i) {
                if (((Item) this.items.get(i)).type == 0) {
                    return 1;
                }
                if (((Item) this.items.get(i)).type == 1) {
                    return 2;
                }
                return ((Item) this.items.get(i)).type + i;
            }

            @Override
            public void bindView(View view, int i, int i2) {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                messagesSearchContainer.search(view, i, messagesSearchContainer.searchString, true);
            }
        }

        @Override
        public void goToMessage(MessageObject messageObject) {
            Bundle bundle = new Bundle();
            long dialogId = messageObject.getDialogId();
            if (DialogObject.isEncryptedDialog(dialogId)) {
                bundle.putInt("enc_id", DialogObject.getEncryptedChatId(dialogId));
            } else if (!DialogObject.isUserDialog(dialogId)) {
                TLRPC.Chat chat = AccountInstance.getInstance(((BaseFragment) TopicsFragment.this).currentAccount).getMessagesController().getChat(Long.valueOf(-dialogId));
                if (chat != null && chat.migrated_to != null) {
                    bundle.putLong("migrated_to", dialogId);
                    dialogId = -chat.migrated_to.channel_id;
                }
                bundle.putLong("chat_id", -dialogId);
            } else {
                bundle.putLong("user_id", dialogId);
            }
            bundle.putInt("message_id", messageObject.getId());
            TopicsFragment.this.presentFragment(new ChatActivity(bundle));
        }

        @Override
        public boolean actionModeShowing() {
            return ((BaseFragment) TopicsFragment.this).actionBar.isActionModeShowed();
        }

        @Override
        public void toggleItemSelection(MessageObject messageObject, View view, int i) {
            if (!this.selectedItems.remove(messageObject)) {
                this.selectedItems.add(messageObject);
            }
            if (this.selectedItems.isEmpty()) {
                ((BaseFragment) TopicsFragment.this).actionBar.hideActionMode();
            }
        }

        @Override
        public boolean isSelected(FilteredSearchView.MessageHashId messageHashId) {
            if (messageHashId == null) {
                return false;
            }
            for (int i = 0; i < this.selectedItems.size(); i++) {
                MessageObject messageObject = (MessageObject) this.selectedItems.get(i);
                if (messageObject != null && messageObject.getId() == messageHashId.messageId && messageObject.getDialogId() == messageHashId.dialogId) {
                    return true;
                }
            }
            return false;
        }

        @Override
        public void showActionMode() {
            ((BaseFragment) TopicsFragment.this).actionBar.showActionMode();
        }

        public void search(View view, int i, String str, boolean z) {
            this.searchString = str;
            if (view == this.searchContainer) {
                searchMessages(str);
                return;
            }
            if (view instanceof FilteredSearchView) {
                FilteredSearchView filteredSearchView = (FilteredSearchView) view;
                filteredSearchView.setKeyboardHeight(this.keyboardSize, false);
                filteredSearchView.search(-TopicsFragment.this.chatId, 0L, 0L, FiltersView.filters[((Item) this.viewPagerAdapter.items.get(i)).filterIndex], false, str, z);
                return;
            }
            if (view instanceof SearchDownloadsContainer) {
                SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) view;
                searchDownloadsContainer.setKeyboardHeight(this.keyboardSize, false);
                searchDownloadsContainer.search(str);
            }
        }

        private void searchMessages(final String str) {
            Runnable runnable = this.searchRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.searchRunnable = null;
            }
            this.messagesIsLoading = false;
            this.canLoadMore = false;
            this.searchResultTopics.clear();
            this.searchResultMessages.clear();
            updateRows();
            if (TextUtils.isEmpty(str)) {
                this.isLoading = false;
                this.searchResultTopics.clear();
                for (int i = 0; i < TopicsFragment.this.forumTopics.size(); i++) {
                    if (((Item) TopicsFragment.this.forumTopics.get(i)).topic != null) {
                        this.searchResultTopics.add(((Item) TopicsFragment.this.forumTopics.get(i)).topic);
                        ((Item) TopicsFragment.this.forumTopics.get(i)).topic.searchQuery = null;
                    }
                }
                updateRows();
                return;
            }
            updateRows();
            this.isLoading = true;
            this.emptyView.showProgress(true, true);
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$searchMessages$1(str);
                }
            };
            this.searchRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 200L);
        }

        public void lambda$searchMessages$1(String str) {
            String lowerCase = str.trim().toLowerCase();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < TopicsFragment.this.forumTopics.size(); i++) {
                if (((Item) TopicsFragment.this.forumTopics.get(i)).topic != null && ((Item) TopicsFragment.this.forumTopics.get(i)).topic.title.toLowerCase().contains(lowerCase)) {
                    arrayList.add(((Item) TopicsFragment.this.forumTopics.get(i)).topic);
                    ((Item) TopicsFragment.this.forumTopics.get(i)).topic.searchQuery = lowerCase;
                }
            }
            this.searchResultTopics.clear();
            this.searchResultTopics.addAll(arrayList);
            updateRows();
            if (!this.searchResultTopics.isEmpty()) {
                this.isLoading = false;
                this.itemsEnterAnimator.showItemsAnimated(0);
            }
            loadMessages(str);
        }

        public void setSearchString(String str) {
            if (this.searchString.equals(str)) {
                return;
            }
            search(this.viewPages[0], getCurrentPosition(), str, false);
        }

        public void loadMessages(final String str) {
            if (this.messagesIsLoading) {
                return;
            }
            TLRPC.TL_messages_search tL_messages_search = new TLRPC.TL_messages_search();
            tL_messages_search.peer = TopicsFragment.this.getMessagesController().getInputPeer(-TopicsFragment.this.chatId);
            tL_messages_search.filter = new TLRPC.TL_inputMessagesFilterEmpty();
            tL_messages_search.limit = 20;
            tL_messages_search.q = str;
            if (!this.searchResultMessages.isEmpty()) {
                ArrayList arrayList = this.searchResultMessages;
                tL_messages_search.offset_id = ((MessageObject) arrayList.get(arrayList.size() - 1)).getId();
            }
            this.messagesIsLoading = true;
            ConnectionsManager.getInstance(((BaseFragment) TopicsFragment.this).currentAccount).sendRequest(tL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$loadMessages$3(str, tLObject, tL_error);
                }
            });
        }

        public void lambda$loadMessages$3(final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadMessages$2(str, tLObject);
                }
            });
        }

        public void lambda$loadMessages$2(String str, TLObject tLObject) {
            if (str.equals(this.searchString)) {
                int i = this.rowCount;
                boolean z = false;
                this.messagesIsLoading = false;
                this.isLoading = false;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                    for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                        MessageObject messageObject = new MessageObject(((BaseFragment) TopicsFragment.this).currentAccount, messages_messages.messages.get(i2), false, false);
                        messageObject.setQuery(str);
                        this.searchResultMessages.add(messageObject);
                    }
                    updateRows();
                    if (this.searchResultMessages.size() < messages_messages.count && !messages_messages.messages.isEmpty()) {
                        z = true;
                    }
                    this.canLoadMore = z;
                } else {
                    this.canLoadMore = false;
                }
                if (this.rowCount == 0) {
                    this.emptyView.showProgress(this.isLoading, true);
                }
                this.itemsEnterAnimator.showItemsAnimated(i);
            }
        }

        private void updateRows() {
            this.topicsHeaderRow = -1;
            this.topicsStartRow = -1;
            this.topicsEndRow = -1;
            this.messagesHeaderRow = -1;
            this.messagesStartRow = -1;
            this.messagesEndRow = -1;
            this.rowCount = 0;
            if (!this.searchResultTopics.isEmpty()) {
                int i = this.rowCount;
                int i2 = i + 1;
                this.rowCount = i2;
                this.topicsHeaderRow = i;
                this.topicsStartRow = i2;
                int size = i2 + this.searchResultTopics.size();
                this.rowCount = size;
                this.topicsEndRow = size;
            }
            if (!this.searchResultMessages.isEmpty()) {
                int i3 = this.rowCount;
                int i4 = i3 + 1;
                this.rowCount = i4;
                this.messagesHeaderRow = i3;
                this.messagesStartRow = i4;
                int size2 = i4 + this.searchResultMessages.size();
                this.rowCount = size2;
                this.messagesEndRow = size2;
            }
            this.searchAdapter.notifyDataSetChanged();
        }

        private class SearchAdapter extends RecyclerListView.SelectionAdapter {
            private SearchAdapter() {
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                FrameLayout graySectionCell;
                if (i == 1) {
                    graySectionCell = new GraySectionCell(viewGroup.getContext());
                } else if (i == 2) {
                    graySectionCell = new TopicSearchCell(viewGroup.getContext());
                } else if (i == 3) {
                    ?? topicDialogCell = TopicsFragment.this.new TopicDialogCell(null, viewGroup.getContext(), false, true);
                    topicDialogCell.inPreviewMode = ((BaseFragment) TopicsFragment.this).inPreviewMode;
                    graySectionCell = topicDialogCell;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
                graySectionCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(graySectionCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) == 1) {
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (i == MessagesSearchContainer.this.topicsHeaderRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.Topics));
                    }
                    if (i == MessagesSearchContainer.this.messagesHeaderRow) {
                        graySectionCell.setText(LocaleController.getString(R.string.SearchMessages));
                    }
                }
                if (getItemViewType(i) == 2) {
                    MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                    TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) messagesSearchContainer.searchResultTopics.get(i - messagesSearchContainer.topicsStartRow);
                    TopicSearchCell topicSearchCell = (TopicSearchCell) viewHolder.itemView;
                    topicSearchCell.setTopic(tL_forumTopic);
                    topicSearchCell.drawDivider = i != MessagesSearchContainer.this.topicsEndRow - 1;
                }
                if (getItemViewType(i) == 3) {
                    MessagesSearchContainer messagesSearchContainer2 = MessagesSearchContainer.this;
                    MessageObject messageObject = (MessageObject) messagesSearchContainer2.searchResultMessages.get(i - messagesSearchContainer2.messagesStartRow);
                    TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                    MessagesSearchContainer messagesSearchContainer3 = MessagesSearchContainer.this;
                    topicDialogCell.drawDivider = i != messagesSearchContainer3.messagesEndRow - 1;
                    long topicId = MessageObject.getTopicId(((BaseFragment) TopicsFragment.this).currentAccount, messageObject.messageOwner, true);
                    if (topicId == 0) {
                        topicId = 1;
                    }
                    TLRPC.TL_forumTopic tL_forumTopicFindTopic = TopicsFragment.this.topicsController.findTopic(TopicsFragment.this.chatId, topicId);
                    if (tL_forumTopicFindTopic == null) {
                        FileLog.d("cant find topic " + topicId);
                        return;
                    }
                    topicDialogCell.setForumTopic(tL_forumTopicFindTopic, messageObject.getDialogId(), messageObject, false, false);
                    topicDialogCell.setTopicIcon(tL_forumTopicFindTopic);
                }
            }

            @Override
            public int getItemViewType(int i) {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (i == messagesSearchContainer.messagesHeaderRow || i == messagesSearchContainer.topicsHeaderRow) {
                    return 1;
                }
                if (i < messagesSearchContainer.topicsStartRow || i >= messagesSearchContainer.topicsEndRow) {
                    return (i < messagesSearchContainer.messagesStartRow || i >= messagesSearchContainer.messagesEndRow) ? 0 : 3;
                }
                return 2;
            }

            @Override
            public int getItemCount() {
                MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                if (messagesSearchContainer.isLoading) {
                    return 0;
                }
                return messagesSearchContainer.rowCount;
            }

            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return viewHolder.getItemViewType() == 3 || viewHolder.getItemViewType() == 2;
            }
        }
    }

    public void setOnTopicSelectedListener(OnTopicSelectedListener onTopicSelectedListener) {
        this.onTopicSelectedListener = onTopicSelectedListener;
    }

    @Override
    public void onResume() {
        super.onResume();
        getMessagesController().getTopicsController().onTopicFragmentResume(this.chatId);
        this.animatedUpdateEnabled = false;
        AndroidUtilities.updateVisibleRows(this.recyclerListView);
        this.animatedUpdateEnabled = true;
        Bulletin.addDelegate(this, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i);
            }

            @Override
            public int getTopOffset(int i) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                Bulletin.Delegate.CC.$default$onBottomOffsetChange(this, f);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onShow(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onShow(this, bulletin);
            }

            @Override
            public int getBottomOffset(int i) {
                if (TopicsFragment.this.bottomOverlayContainer == null || TopicsFragment.this.bottomOverlayContainer.getVisibility() != 0) {
                    return 0;
                }
                return TopicsFragment.this.bottomOverlayContainer.getMeasuredHeight();
            }
        });
        if (!this.inPreviewMode || getMessagesController().isForum(-this.chatId)) {
            return;
        }
        finishFragment();
    }

    @Override
    public void onPause() {
        super.onPause();
        getMessagesController().getTopicsController().onTopicFragmentPause(this.chatId);
        Bulletin.removeDelegate(this);
    }

    @Override
    public void prepareFragmentToSlide(boolean z, boolean z2) {
        if (!z && z2) {
            this.isSlideBackTransition = true;
            setFragmentIsSliding(true);
        } else {
            this.slideBackTransitionAnimator = null;
            this.isSlideBackTransition = false;
            setFragmentIsSliding(false);
            setSlideTransitionProgress(1.0f);
        }
    }

    private void setFragmentIsSliding(boolean z) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        SizeNotifierFrameLayout sizeNotifierFrameLayout = this.contentView;
        if (sizeNotifierFrameLayout != null) {
            if (z) {
                sizeNotifierFrameLayout.setLayerType(2, null);
                sizeNotifierFrameLayout.setClipChildren(false);
                sizeNotifierFrameLayout.setClipToPadding(false);
            } else {
                sizeNotifierFrameLayout.setLayerType(0, null);
                sizeNotifierFrameLayout.setClipChildren(true);
                sizeNotifierFrameLayout.setClipToPadding(true);
            }
        }
        this.contentView.requestLayout();
        this.actionBar.requestLayout();
    }

    @Override
    public void onSlideProgress(boolean z, float f) {
        if (SharedConfig.getDevicePerformanceClass() != 0 && this.isSlideBackTransition && this.slideBackTransitionAnimator == null) {
            setSlideTransitionProgress(f);
        }
    }

    private void setSlideTransitionProgress(float f) {
        if (SharedConfig.getDevicePerformanceClass() == 0) {
            return;
        }
        this.slideFragmentProgress = f;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        TopicsRecyclerView topicsRecyclerView = this.recyclerListView;
        if (topicsRecyclerView != null) {
            float f2 = 1.0f - ((1.0f - this.slideFragmentProgress) * 0.05f);
            topicsRecyclerView.setPivotX(0.0f);
            topicsRecyclerView.setPivotY(0.0f);
            topicsRecyclerView.setScaleX(f2);
            topicsRecyclerView.setScaleY(f2);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(f2);
            this.actionBar.setScaleY(f2);
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
        if (z) {
            this.openAnimationEnded = false;
        }
        this.notificationsLocker.lock();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        View view;
        super.onTransitionAnimationEnd(z, z2);
        if (z && (view = this.blurredView) != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.blurredView.getParent()).removeView(this.blurredView);
            }
            this.blurredView.setBackground(null);
        }
        if (z) {
            this.openAnimationEnded = true;
            checkGroupCallJoin(this.lastCallCheckFromServer);
        }
        this.notificationsLocker.unlock();
        if (z) {
            return;
        }
        if (this.openedForSelect && this.removeFragmentOnTransitionEnd) {
            removeSelfFromStack();
            DialogsActivity dialogsActivity = this.dialogsActivity;
            if (dialogsActivity != null) {
                dialogsActivity.removeSelfFromStack();
                return;
            }
            return;
        }
        if (this.finishDialogRightSlidingPreviewOnTransitionEnd) {
            removeSelfFromStack();
            DialogsActivity dialogsActivity2 = this.parentDialogsActivity;
            if (dialogsActivity2 == null || (rightSlidingDialogContainer = dialogsActivity2.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment()) {
                return;
            }
            this.parentDialogsActivity.rightSlidingDialogContainer.lambda$presentFragment$1();
        }
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null || this.parentLayout == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.blurredView.setAlpha(0.0f);
        if (this.blurredView.getParent() != null) {
            ((ViewGroup) this.blurredView.getParent()).removeView(this.blurredView);
        }
        this.parentLayout.getOverlayContainerView().addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
    }

    @Override
    public boolean onBackPressed(boolean z) {
        if (!this.selectedTopics.isEmpty()) {
            if (z) {
                clearSelectedTopics();
            }
            return false;
        }
        if (!this.searching) {
            return super.onBackPressed(z);
        }
        if (z) {
            this.actionBar.onSearchFieldVisibilityChanged(this.searchItem.toggleSearch(false));
        }
        return false;
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        View view = this.blurredView;
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        if (z) {
            this.blurredView.setAlpha(1.0f - f);
        } else {
            this.blurredView.setAlpha(f);
        }
    }

    private class Item extends AdapterWithDiffUtils.Item {
        TLRPC.TL_forumTopic topic;

        public Item(int i, TLRPC.TL_forumTopic tL_forumTopic) {
            super(i, true);
            this.topic = tL_forumTopic;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Item item = (Item) obj;
                int i = this.viewType;
                return i == item.viewType && i == 0 && this.topic.id == item.topic.id;
            }
            return false;
        }
    }

    @Override
    public ChatAvatarContainer getAvatarContainer() {
        return this.avatarContainer;
    }

    @Override
    public SizeNotifierFrameLayout getContentView() {
        return this.contentView;
    }

    @Override
    public void setPreviewOpenedProgress(float f) {
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        if (chatAvatarContainer != null) {
            chatAvatarContainer.setAlpha(f);
            this.other.setAlpha(f);
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setAlpha(f);
            }
            this.actionBar.getBackButton().setAlpha(f);
        }
    }

    @Override
    public void setPreviewReplaceProgress(float f) {
        ChatAvatarContainer chatAvatarContainer = this.avatarContainer;
        if (chatAvatarContainer != null) {
            chatAvatarContainer.setAlpha(f);
            this.avatarContainer.setTranslationX((1.0f - f) * AndroidUtilities.dp(40.0f));
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        RecyclerListView recyclerListView;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$24();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = this.fragmentView;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        MessagesSearchContainer messagesSearchContainer = this.searchContainer;
        if (messagesSearchContainer != null && (recyclerListView = messagesSearchContainer.recyclerView) != null) {
            GraySectionCell.createThemeDescriptions(arrayList, recyclerListView);
        }
        return arrayList;
    }

    public void lambda$getThemeDescriptions$24() {
        ViewGroup viewGroup;
        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                viewGroup = this.recyclerListView;
            } else {
                MessagesSearchContainer messagesSearchContainer = this.searchContainer;
                viewGroup = messagesSearchContainer != null ? messagesSearchContainer.recyclerView : null;
            }
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof ProfileSearchCell) {
                        ((ProfileSearchCell) childAt).update(0);
                    } else if (childAt instanceof DialogCell) {
                        ((DialogCell) childAt).update(0);
                    } else if (childAt instanceof UserCell) {
                        ((UserCell) childAt).update(0);
                    }
                }
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setPopupBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground), true);
            this.actionBar.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false, true);
            this.actionBar.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true, true);
            this.actionBar.setPopupItemsSelectorColor(getThemedColor(Theme.key_dialogButtonSelector), true);
        }
        View view = this.blurredView;
        if (view != null && Build.VERSION.SDK_INT >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundWhite), 100)));
        }
        updateColors();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        this.navigationBarHeight = i;
        MessagesSearchContainer messagesSearchContainer = this.searchContainer;
        if (messagesSearchContainer != null) {
            messagesSearchContainer.setPadding(0, 0, 0, i);
        }
        EmptyViewContainer emptyViewContainer = this.emptyViewContainer;
        if (emptyViewContainer != null) {
            emptyViewContainer.textView.setTranslationY((-this.navigationBarHeight) - this.additionFloatingButtonOffset);
        }
        updateFloatingButtonOffset();
        checkUi_listViewPadding();
        return WindowInsetsCompat.CONSUMED;
    }

    public void blur3_InvalidateBlur() {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        int iDp = AndroidUtilities.dp(48.0f);
        int iDp2 = AndroidUtilities.dp(48.0f) + ((int) this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(14.0f)));
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        View view = dialogsActivity != null ? dialogsActivity.fragmentView : this.fragmentView;
        ActionBar actionBar = dialogsActivity != null ? dialogsActivity.getActionBar() : this.actionBar;
        int measuredHeight = (view.getMeasuredHeight() - this.navigationBarHeight) - AndroidUtilities.dp(8.0f);
        int iDp3 = measuredHeight - AndroidUtilities.dp(56.0f);
        this.iBlur3PositionActionBar.set(0.0f, -iDp, view.getMeasuredWidth(), actionBar.getMeasuredHeight() + iDp + iDp2);
        this.iBlur3PositionMainTabs.set(0.0f, iDp3, view.getMeasuredWidth(), measuredHeight);
        this.iBlur3PositionMainTabs.inset(0.0f, LiteMode.isEnabled(262144) ? 0.0f : -AndroidUtilities.dp(48.0f));
        this.scrollableViewNoiseSuppressor.setupRenderNodes(this.iBlur3Positions, this.parentDialogsActivity != null ? 2 : 1);
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.iBlur3Capture, view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    public BlurredBackgroundSourceRenderNode getFrostedGlassSource() {
        return this.iBlur3SourceGlassFrosted;
    }

    @Override
    public void onParentScrollToTop() {
        this.recyclerListView.smoothScrollToPosition(0);
    }
}
