package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatFull;
import org.telegram.tgnet.TLRPC$ChatParticipants;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$TL_account_getNotifyExceptions;
import org.telegram.tgnet.TLRPC$TL_chatPhotoEmpty;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_groupCall;
import org.telegram.tgnet.TLRPC$TL_inputMessagesFilterEmpty;
import org.telegram.tgnet.TLRPC$TL_inputNotifyPeer;
import org.telegram.tgnet.TLRPC$TL_messages_search;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_Messages;
import org.telegram.tgnet.tl.TL_stories$TL_premium_boostsStatus;
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
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TopicSearchCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityInterface;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.InviteMembersBottomSheet;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
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
import org.telegram.ui.Delegates.ChatActivityMemberRequestsDelegate;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.RightSlidingDialogContainer;
import org.telegram.ui.TopicsFragment;
public class TopicsFragment extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, ChatActivityInterface, RightSlidingDialogContainer.BaseFragmentWithFullscreen {
    private static HashSet<Long> settingsPreloaded = new HashSet<>();
    Adapter adapter;
    private ActionBarMenuSubItem addMemberSubMenu;
    private boolean allowSwipeDuringCurrentTouch;
    boolean animateSearchWithScale;
    boolean animatedUpdateEnabled;
    ChatAvatarContainer avatarContainer;
    private View blurredView;
    private ActionBarMenuSubItem boostGroupSubmenu;
    private TL_stories$TL_premium_boostsStatus boostsStatus;
    private int bottomButtonType;
    private UnreadCounterTextView bottomOverlayChatText;
    private FrameLayout bottomOverlayContainer;
    private RadialProgressView bottomOverlayProgress;
    private boolean bottomPannelVisible;
    boolean canShowCreateTopic;
    private boolean canShowHiddenArchive;
    private boolean canShowProgress;
    TLRPC$ChatFull chatFull;
    final long chatId;
    private ImageView closeReportSpam;
    private ActionBarMenuSubItem closeTopic;
    SizeNotifierFrameLayout contentView;
    private ActionBarMenuSubItem createTopicSubmenu;
    private ActionBarMenuSubItem deleteChatSubmenu;
    private ActionBarMenuItem deleteItem;
    private int dialogChangeFinished;
    private int dialogInsertFinished;
    private int dialogRemoveFinished;
    DialogsActivity dialogsActivity;
    private boolean disableActionBarScrolling;
    private View emptyView;
    HashSet<Integer> excludeTopics;
    private boolean finishDialogRightSlidingPreviewOnTransitionEnd;
    private RLottieImageView floatingButton;
    FrameLayout floatingButtonContainer;
    private float floatingButtonHideProgress;
    private float floatingButtonTranslation;
    private boolean floatingHidden;
    private final AccelerateDecelerateInterpolator floatingInterpolator;
    ArrayList<Item> forumTopics;
    private boolean forumTopicsListFrozen;
    FragmentContextView fragmentContextView;
    private ArrayList<Item> frozenForumTopicsList;
    FrameLayout fullscreenView;
    private View generalTopicViewMoving;
    private ChatObject.Call groupCall;
    private int hiddenCount;
    private boolean hiddenShown;
    private ActionBarMenuItem hideItem;
    boolean isSlideBackTransition;
    private DefaultItemAnimator itemAnimator;
    private ItemTouchHelper itemTouchHelper;
    private TouchHelperCallback itemTouchHelperCallback;
    RecyclerItemsEnterAnimator itemsEnterAnimator;
    private int lastItemsCount;
    LinearLayoutManager layoutManager;
    private boolean loadingTopics;
    private boolean mute;
    private ActionBarMenuItem muteItem;
    private final AnimationNotificationsLocker notificationsLocker;
    OnTopicSelectedListener onTopicSelectedListener;
    private boolean openedForForward;
    private boolean openedForQuote;
    private boolean openedForReply;
    private boolean opnendForSelect;
    private ActionBarMenuItem other;
    ActionBarMenuItem otherItem;
    private AvatarDrawable parentAvatarDrawable;
    private BackupImageView parentAvatarImageView;
    public DialogsActivity parentDialogsActivity;
    private ChatActivityMemberRequestsDelegate pendingRequestsDelegate;
    private ActionBarMenuItem pinItem;
    private PullForegroundDrawable pullForegroundDrawable;
    private int pullViewState;
    private ActionBarMenuSubItem readItem;
    private TopicsRecyclerView recyclerListView;
    private boolean removeFragmentOnTransitionEnd;
    private boolean reordering;
    private ActionBarMenuSubItem restartTopic;
    private boolean scrollToTop;
    private float searchAnimationProgress;
    ValueAnimator searchAnimator;
    private MessagesSearchContainer searchContainer;
    private ActionBarMenuItem searchItem;
    private ViewPagerFixed.TabsView searchTabsView;
    public boolean searching;
    private NumberTextView selectedDialogsCountTextView;
    private long selectedTopicForTablet;
    HashSet<Integer> selectedTopics;
    private ActionBarMenuItem showItem;
    ValueAnimator slideBackTransitionAnimator;
    float slideFragmentProgress;
    private long startArchivePullingTime;
    ChatActivity.ThemeDelegate themeDelegate;
    private FrameLayout topView;
    private final TopicsController topicsController;
    StickerEmptyView topicsEmptyView;
    float transitionPadding;
    private ActionBarMenuItem unpinItem;
    private boolean updateAnimated;
    private boolean waitingForScrollFinished;

    public interface OnTopicSelectedListener {
        void onTopicSelected(TLRPC$TL_forumTopic tLRPC$TL_forumTopic);
    }

    public static boolean lambda$chekActionMode$17(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$onDialogAnimationFinished$8() {
    }

    @Override
    public boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return false;
    }

    @Override
    public void checkAndUpdateAvatar() {
        ChatActivityInterface.CC.$default$checkAndUpdateAvatar(this);
    }

    @Override
    public TLRPC$User getCurrentUser() {
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
        this.forumTopics = new ArrayList<>();
        this.frozenForumTopicsList = new ArrayList<>();
        this.adapter = new Adapter();
        this.hiddenCount = 0;
        this.hiddenShown = true;
        this.floatingHidden = false;
        this.floatingInterpolator = new AccelerateDecelerateInterpolator();
        this.animatedUpdateEnabled = true;
        this.bottomPannelVisible = true;
        this.searchAnimationProgress = 0.0f;
        this.selectedTopics = new HashSet<>();
        this.mute = false;
        this.notificationsLocker = new AnimationNotificationsLocker(new int[]{NotificationCenter.topicsDidLoaded});
        this.slideFragmentProgress = 1.0f;
        new ArrayList();
        long j = this.arguments.getLong("chat_id", 0L);
        this.chatId = j;
        this.opnendForSelect = this.arguments.getBoolean("for_select", false);
        this.openedForForward = this.arguments.getBoolean("forward_to", false);
        this.openedForQuote = this.arguments.getBoolean("quote", false);
        this.openedForReply = this.arguments.getBoolean("reply_to", false);
        this.topicsController = getMessagesController().getTopicsController();
        SharedPreferences preferences = getUserConfig().getPreferences();
        this.canShowProgress = !preferences.getBoolean("topics_end_reached_" + j, false);
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
            TLRPC$Dialog dialog = messagesController.getDialog(-j);
            if (dialog != null && dialog.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
            TLRPC$ChatFull chatFull = messagesController.getChatFull(j);
            if (chatFull == null) {
                chatFull = messagesStorage.loadChatInfo(j, true, new CountDownLatch(1), false, false);
            }
            if (chatFull != null && chatFull.view_forum_as_messages) {
                return new ChatActivity(bundle);
            }
        }
        return new TopicsFragment(bundle);
    }

    public static void prepareToSwitchAnimation(org.telegram.ui.ChatActivity r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.prepareToSwitchAnimation(org.telegram.ui.ChatActivity):void");
    }

    @Override
    public View createView(Context context) {
        int i;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private Paint actionBarPaint;

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
                int i4 = 0;
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof ActionBar) {
                        childAt.measure(i2, View.MeasureSpec.makeMeasureSpec(0, 0));
                        i4 = childAt.getMeasuredHeight();
                    }
                }
                for (int i6 = 0; i6 < getChildCount(); i6++) {
                    View childAt2 = getChildAt(i6);
                    if (!(childAt2 instanceof ActionBar)) {
                        if (childAt2.getFitsSystemWindows()) {
                            measureChildWithMargins(childAt2, i2, 0, i3, 0);
                        } else {
                            measureChildWithMargins(childAt2, i2, 0, i3, i4);
                        }
                    }
                }
                setMeasuredDimension(size, size2);
            }

            @Override
            public void onLayout(boolean r11, int r12, int r13, int r14, int r15) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.TopicsFragment.AnonymousClass1.onLayout(boolean, int, int, int, int):void");
            }

            @Override
            public void drawList(Canvas canvas, boolean z) {
                for (int i2 = 0; i2 < TopicsFragment.this.recyclerListView.getChildCount(); i2++) {
                    View childAt = TopicsFragment.this.recyclerListView.getChildAt(i2);
                    if (childAt.getY() < AndroidUtilities.dp(100.0f) && childAt.getVisibility() == 0) {
                        int save = canvas.save();
                        canvas.translate(TopicsFragment.this.recyclerListView.getX() + childAt.getX(), getY() + TopicsFragment.this.recyclerListView.getY() + childAt.getY());
                        childAt.draw(canvas);
                        canvas.restoreToCount(save);
                    }
                }
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (TopicsFragment.this.isInPreviewMode()) {
                    this.actionBarPaint.setColor(TopicsFragment.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    this.actionBarPaint.setAlpha((int) (TopicsFragment.this.searchAnimationProgress * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), AndroidUtilities.statusBarHeight, this.actionBarPaint);
                    canvas.drawLine(0.0f, 0.0f, 0.0f, getHeight(), Theme.dividerPaint);
                }
            }
        };
        this.contentView = sizeNotifierFrameLayout;
        this.fragmentView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        this.contentView.needBlur = !this.inPreviewMode;
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
                TopicsFragment.this.lambda$createView$0(view);
            }
        });
        ActionBarMenu createMenu = this.actionBar.createMenu();
        if (this.parentDialogsActivity != null) {
            ActionBarMenuItem addItem = createMenu.addItem(0, R.drawable.ic_ab_search);
            this.searchItem = addItem;
            addItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicsFragment.this.lambda$createView$1(view);
                }
            });
        } else {
            ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
                }

                @Override
                public void onSearchExpand() {
                    TopicsFragment.this.animateToSearchView(true);
                    TopicsFragment.this.searchContainer.setSearchString(BuildConfig.APP_CENTER_HASH);
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
            this.searchItem = actionBarMenuItemSearchListener;
            actionBarMenuItemSearchListener.setSearchPaddingStart(56);
            this.searchItem.setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
            EditTextBoldCursor searchField = this.searchItem.getSearchField();
            searchField.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            searchField.setHintTextColor(Theme.getColor(Theme.key_player_time));
            searchField.setCursorColor(Theme.getColor(Theme.key_chat_messagePanelCursor));
        }
        ActionBarMenuItem addItem2 = createMenu.addItem(0, R.drawable.ic_ab_other, this.themeDelegate);
        this.other = addItem2;
        addItem2.addSubItem(1, R.drawable.msg_discussion, LocaleController.getString("TopicViewAsMessages", R.string.TopicViewAsMessages));
        this.addMemberSubMenu = this.other.addSubItem(2, R.drawable.msg_addcontact, LocaleController.getString("AddMember", R.string.AddMember));
        ActionBarMenuItem actionBarMenuItem = this.other;
        int i2 = R.raw.boosts;
        this.boostGroupSubmenu = actionBarMenuItem.addSubItem(14, 0, new RLottieDrawable(i2, BuildConfig.APP_CENTER_HASH + i2, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f)), TextCell.applyNewSpan(LocaleController.getString(R.string.BoostingBoostGroupMenu)), true, false);
        ActionBarMenuItem actionBarMenuItem2 = this.other;
        int i3 = R.drawable.msg_topic_create;
        int i4 = R.string.CreateTopic;
        this.createTopicSubmenu = actionBarMenuItem2.addSubItem(3, i3, LocaleController.getString("CreateTopic", i4));
        this.deleteChatSubmenu = this.other.addSubItem(11, R.drawable.msg_leave, LocaleController.getString("LeaveMegaMenu", R.string.LeaveMegaMenu), this.themeDelegate);
        ChatAvatarContainer chatAvatarContainer = new ChatAvatarContainer(context, this, false);
        this.avatarContainer = chatAvatarContainer;
        chatAvatarContainer.getAvatarImageView().setRoundRadius(AndroidUtilities.dp(16.0f));
        this.avatarContainer.setOccupyStatusBar((AndroidUtilities.isTablet() || this.inPreviewMode) ? false : true);
        this.actionBar.addView(this.avatarContainer, 0, LayoutHelper.createFrame(-2, -1.0f, 51, 56.0f, 0.0f, 86.0f, 0.0f));
        this.avatarContainer.getAvatarImageView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TopicsFragment.this.openProfile(true);
            }
        });
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
                ArrayList<Item> arrayList = TopicsFragment.this.forumTopics;
                return (arrayList == null || arrayList.size() != 1 || TopicsFragment.this.forumTopics.get(0) == null || TopicsFragment.this.forumTopics.get(0).topic == null || TopicsFragment.this.forumTopics.get(0).topic.id != 1) ? getAdapter().getItemCount() <= 1 : getAdapter().getItemCount() <= 2;
            }
        };
        SpannableString spannableString = new SpannableString("#");
        ForumUtilities.GeneralTopicDrawable createGeneralTopicDrawable = ForumUtilities.createGeneralTopicDrawable(getContext(), 0.85f, -1, false);
        createGeneralTopicDrawable.setBounds(0, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(18.0f));
        spannableString.setSpan(new ImageSpan(createGeneralTopicDrawable, 2), 0, 1, 33);
        PullForegroundDrawable pullForegroundDrawable = new PullForegroundDrawable(AndroidUtilities.replaceCharSequence("#", LocaleController.getString("AccSwipeForGeneral", R.string.AccSwipeForGeneral), spannableString), AndroidUtilities.replaceCharSequence("#", LocaleController.getString("AccReleaseForGeneral", R.string.AccReleaseForGeneral), spannableString)) {
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
        TopicsRecyclerView topicsRecyclerView = this.recyclerListView;
        this.itemAnimator = anonymousClass7;
        topicsRecyclerView.setItemAnimator(anonymousClass7);
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
                TopicsFragment.this.lambda$createView$2(view, i6);
            }
        });
        this.recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public final boolean onItemClick(View view, int i6, float f, float f2) {
                boolean lambda$createView$3;
                lambda$createView$3 = TopicsFragment.this.lambda$createView$3(view, i6, f, f2);
                return lambda$createView$3;
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
                TopicsFragment.this.contentView.invalidateBlur();
            }
        });
        TopicsRecyclerView topicsRecyclerView2 = this.recyclerListView;
        AnonymousClass10 anonymousClass10 = new AnonymousClass10(context);
        this.layoutManager = anonymousClass10;
        topicsRecyclerView2.setLayoutManager(anonymousClass10);
        new RecyclerAnimationScrollHelper(this.recyclerListView, this.layoutManager);
        this.recyclerListView.setAdapter(this.adapter);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            int prevPosition;
            int prevTop;

            @Override
            public void onScrolled(RecyclerView recyclerView, int i6, int i7) {
                boolean z;
                int findFirstVisibleItemPosition = TopicsFragment.this.layoutManager.findFirstVisibleItemPosition();
                if (findFirstVisibleItemPosition != -1) {
                    RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
                    boolean z2 = false;
                    int top = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView.getTop() : 0;
                    int i8 = this.prevPosition;
                    if (i8 == findFirstVisibleItemPosition) {
                        int i9 = this.prevTop;
                        int i10 = i9 - top;
                        z = top < i9;
                        Math.abs(i10);
                    } else {
                        z = findFirstVisibleItemPosition > i8;
                    }
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    topicsFragment.hideFloatingButton((z || !topicsFragment.canShowCreateTopic) ? true : true, true);
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
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.floatingButtonContainer = frameLayout;
        frameLayout.setVisibility(0);
        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = this.contentView;
        FrameLayout frameLayout2 = this.floatingButtonContainer;
        int i6 = Build.VERSION.SDK_INT;
        int i7 = i6 >= 21 ? 56 : 60;
        float f = i6 >= 21 ? 56 : 60;
        boolean z = LocaleController.isRTL;
        sizeNotifierFrameLayout2.addView(frameLayout2, LayoutHelper.createFrame(i7, f, (z ? 3 : 5) | 80, z ? 14.0f : 0.0f, 0.0f, z ? 0.0f : 14.0f, 14.0f));
        this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicsFragment.this.lambda$createView$4(view);
            }
        });
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground));
        if (i6 < 21) {
            Drawable mutate = ContextCompat.getDrawable(getParentActivity(), R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            FrameLayout frameLayout3 = this.floatingButtonContainer;
            Property property = View.TRANSLATION_Z;
            stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(frameLayout3, property, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonContainer, property, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(2.0f)).setDuration(200L));
            this.floatingButtonContainer.setStateListAnimator(stateListAnimator);
            this.floatingButtonContainer.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                }
            });
        }
        this.floatingButtonContainer.setBackground(createSimpleSelectorCircleDrawable);
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.floatingButton = rLottieImageView;
        rLottieImageView.setImageResource(R.drawable.ic_chatlist_add_2);
        this.floatingButtonContainer.setContentDescription(LocaleController.getString("CreateTopic", i4));
        this.floatingButtonContainer.addView(this.floatingButton, LayoutHelper.createFrame(24, 24, 17));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        flickerLoadingView.setViewType(24);
        flickerLoadingView.setVisibility(8);
        flickerLoadingView.showDate(true);
        final EmptyViewContainer emptyViewContainer = new EmptyViewContainer(this, context);
        emptyViewContainer.textView.setAlpha(0.0f);
        StickerEmptyView stickerEmptyView = new StickerEmptyView(this, context, flickerLoadingView, 0) {
            @Override
            public void showProgress(boolean z2, boolean z3) {
                super.showProgress(z2, z3);
                if (z3) {
                    emptyViewContainer.textView.animate().alpha(z2 ? 0.0f : 1.0f).start();
                    return;
                }
                emptyViewContainer.textView.animate().cancel();
                emptyViewContainer.textView.setAlpha(z2 ? 0.0f : 1.0f);
            }
        };
        this.topicsEmptyView = stickerEmptyView;
        try {
            stickerEmptyView.stickerView.getImageReceiver().setAutoRepeat(2);
        } catch (Exception unused) {
        }
        this.topicsEmptyView.showProgress(this.loadingTopics, this.fragmentBeginToShow);
        this.topicsEmptyView.title.setText(LocaleController.getString("NoTopics", R.string.NoTopics));
        updateTopicsEmptyViewText();
        emptyViewContainer.addView(flickerLoadingView);
        emptyViewContainer.addView(this.topicsEmptyView);
        this.contentView.addView(emptyViewContainer);
        this.recyclerListView.setEmptyView(emptyViewContainer);
        this.bottomOverlayContainer = new FrameLayout(this, context) {
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
        this.bottomOverlayChatText.setOnClickListener(new AnonymousClass16());
        RadialProgressView radialProgressView = new RadialProgressView(context, this.themeDelegate);
        this.bottomOverlayProgress = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(22.0f));
        this.bottomOverlayProgress.setVisibility(4);
        this.bottomOverlayContainer.addView(this.bottomOverlayProgress, LayoutHelper.createFrame(30, 30, 17));
        ImageView imageView = new ImageView(context);
        this.closeReportSpam = imageView;
        imageView.setImageResource(R.drawable.miniplayer_close);
        this.closeReportSpam.setContentDescription(LocaleController.getString("Close", R.string.Close));
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 21) {
            this.closeReportSpam.setBackground(Theme.AdaptiveRipple.circle(getThemedColor(Theme.key_chat_topPanelClose)));
        }
        this.closeReportSpam.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_chat_topPanelClose), PorterDuff.Mode.MULTIPLY));
        this.closeReportSpam.setScaleType(ImageView.ScaleType.CENTER);
        this.bottomOverlayContainer.addView(this.closeReportSpam, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 6.0f, 2.0f, 0.0f));
        this.closeReportSpam.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicsFragment.this.lambda$createView$5(view);
            }
        });
        this.closeReportSpam.setVisibility(8);
        updateChatInfo();
        FrameLayout frameLayout4 = new FrameLayout(context) {
            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (view == TopicsFragment.this.searchTabsView && TopicsFragment.this.isInPreviewMode()) {
                    TopicsFragment.this.getParentLayout().drawHeaderShadow(canvas, (int) (TopicsFragment.this.searchAnimationProgress * 255.0f), (int) (TopicsFragment.this.searchTabsView.getY() + TopicsFragment.this.searchTabsView.getMeasuredHeight()));
                }
                return super.drawChild(canvas, view, j);
            }
        };
        this.fullscreenView = frameLayout4;
        if (this.parentDialogsActivity == null) {
            this.contentView.addView(frameLayout4, LayoutHelper.createFrame(-1, -1, 119));
        }
        MessagesSearchContainer messagesSearchContainer = new MessagesSearchContainer(context);
        this.searchContainer = messagesSearchContainer;
        messagesSearchContainer.setVisibility(8);
        this.fullscreenView.addView(this.searchContainer, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 44.0f, 0.0f, 0.0f));
        MessagesSearchContainer messagesSearchContainer2 = this.searchContainer;
        int i9 = Theme.key_windowBackgroundWhite;
        messagesSearchContainer2.setBackgroundColor(Theme.getColor(i9));
        this.actionBar.setDrawBlurBackground(this.contentView);
        getMessagesStorage().loadChatInfo(this.chatId, true, null, true, false, 0);
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.topView = frameLayout5;
        this.contentView.addView(frameLayout5, LayoutHelper.createFrame(-1, 200, 48));
        TLRPC$Chat currentChat = getCurrentChat();
        if (currentChat != null) {
            ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = new ChatActivityMemberRequestsDelegate(this, currentChat, new ChatActivityMemberRequestsDelegate.Callback() {
                @Override
                public final void onEnterOffsetChanged() {
                    TopicsFragment.this.updateTopView();
                }
            });
            this.pendingRequestsDelegate = chatActivityMemberRequestsDelegate;
            chatActivityMemberRequestsDelegate.setChatInfo(this.chatFull, false);
            this.topView.addView(this.pendingRequestsDelegate.getView(), -1, this.pendingRequestsDelegate.getViewHeight());
        }
        if (this.inPreviewMode) {
            i = -1;
        } else {
            FragmentContextView fragmentContextView = new FragmentContextView(context, this, false, this.themeDelegate) {
                @Override
                public void setTopPadding(float f2) {
                    this.topPadding = f2;
                    TopicsFragment.this.updateTopView();
                }
            };
            this.fragmentContextView = fragmentContextView;
            i = -1;
            this.topView.addView(fragmentContextView, LayoutHelper.createFrame(-1, 38, 51));
        }
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(i, -2.0f);
        if (this.inPreviewMode && i8 >= 21) {
            createFrame.topMargin = AndroidUtilities.statusBarHeight;
        }
        if (!isInPreviewMode()) {
            this.contentView.addView(this.actionBar, createFrame);
        }
        checkForLoadMore();
        View view = new View(context) {
            @Override
            public void setAlpha(float f2) {
                super.setAlpha(f2);
                View view2 = TopicsFragment.this.fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
            }
        };
        this.blurredView = view;
        if (i8 >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(i9), 100)));
        }
        this.blurredView.setFocusable(false);
        this.blurredView.setImportantForAccessibility(2);
        this.blurredView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                TopicsFragment.this.lambda$createView$6(view2);
            }
        });
        this.blurredView.setFitsSystemWindows(true);
        this.bottomPannelVisible = true;
        if (this.inPreviewMode && AndroidUtilities.isTablet()) {
            Iterator<BaseFragment> it = getParentLayout().getFragmentStack().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                BaseFragment next = it.next();
                if (next instanceof DialogsActivity) {
                    DialogsActivity dialogsActivity = (DialogsActivity) next;
                    if (dialogsActivity.isMainDialogList()) {
                        MessagesStorage.TopicKey openedDialogId = dialogsActivity.getOpenedDialogId();
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
                    TopicsFragment.this.lambda$createView$7((TL_stories$TL_premium_boostsStatus) obj);
                }
            });
        }
        return this.fragmentView;
    }

    public class AnonymousClass2 extends ActionBar.ActionBarMenuOnItemClick {
        final Context val$context;

        AnonymousClass2(Context context) {
            this.val$context = context;
        }

        @Override
        public void onItemClick(int i) {
            TLRPC$ChatParticipants tLRPC$ChatParticipants;
            TopicDialogCell topicDialogCell;
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
            if (i == -1) {
                if (TopicsFragment.this.selectedTopics.size() > 0) {
                    TopicsFragment.this.clearSelectedTopics();
                    return;
                } else {
                    TopicsFragment.this.finishFragment();
                    return;
                }
            }
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = null;
            int i2 = 0;
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
                    TLRPC$ChatFull chatFull = TopicsFragment.this.getMessagesController().getChatFull(TopicsFragment.this.chatId);
                    TLRPC$ChatFull tLRPC$ChatFull = TopicsFragment.this.chatFull;
                    if (tLRPC$ChatFull != null && (tLRPC$ChatParticipants = tLRPC$ChatFull.participants) != null) {
                        chatFull.participants = tLRPC$ChatParticipants;
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
                                TLRPC$Chat chat = TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j));
                                return chat != null && ChatObject.canUserDoAdminAction(chat, 3);
                            }
                        };
                        inviteMembersBottomSheet.setDelegate(new GroupCreateActivity.ContactsAddActivityDelegate() {
                            @Override
                            public final void didSelectUsers(ArrayList arrayList, int i4) {
                                TopicsFragment.AnonymousClass2.this.lambda$onItemClick$1(j, arrayList, i4);
                            }

                            @Override
                            public void needAddBot(TLRPC$User tLRPC$User) {
                                GroupCreateActivity.ContactsAddActivityDelegate.CC.$default$needAddBot(this, tLRPC$User);
                            }
                        });
                        inviteMembersBottomSheet.show();
                        break;
                    }
                    break;
                case 3:
                    final TopicCreateFragment create = TopicCreateFragment.create(TopicsFragment.this.chatId, 0L);
                    TopicsFragment.this.presentFragment(create);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            TopicCreateFragment.this.showKeyboard();
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
                        topicsController.pinTopic(topicsFragment2.chatId, topicsFragment2.selectedTopics.iterator().next().intValue(), i == 4, TopicsFragment.this);
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 6:
                    Iterator<Integer> it = TopicsFragment.this.selectedTopics.iterator();
                    while (it.hasNext()) {
                        int intValue = it.next().intValue();
                        NotificationsController notificationsController = TopicsFragment.this.getNotificationsController();
                        TopicsFragment topicsFragment3 = TopicsFragment.this;
                        notificationsController.muteDialog(-topicsFragment3.chatId, intValue, topicsFragment3.mute);
                    }
                    TopicsFragment.this.clearSelectedTopics();
                    break;
                case 7:
                    TopicsFragment topicsFragment4 = TopicsFragment.this;
                    topicsFragment4.deleteTopics(topicsFragment4.selectedTopics, new Runnable() {
                        @Override
                        public final void run() {
                            TopicsFragment.AnonymousClass2.this.lambda$onItemClick$4();
                        }
                    });
                    break;
                case 8:
                    ArrayList arrayList = new ArrayList(TopicsFragment.this.selectedTopics);
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC$TL_forumTopic findTopic = TopicsFragment.this.topicsController.findTopic(TopicsFragment.this.chatId, ((Integer) arrayList.get(i4)).intValue());
                        if (findTopic != null) {
                            TopicsFragment.this.getMessagesController().markMentionsAsRead(-TopicsFragment.this.chatId, findTopic.id);
                            MessagesController messagesController = TopicsFragment.this.getMessagesController();
                            long j3 = -TopicsFragment.this.chatId;
                            int i5 = findTopic.top_message;
                            TLRPC$Message tLRPC$Message = findTopic.topMessage;
                            messagesController.markDialogAsRead(j3, i5, 0, tLRPC$Message != null ? tLRPC$Message.date : 0, false, findTopic.id, 0, true, 0);
                            TopicsFragment.this.getMessagesStorage().updateRepliesMaxReadId(TopicsFragment.this.chatId, findTopic.id, findTopic.top_message, 0, true);
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
                    final TLRPC$Chat chat = TopicsFragment.this.getMessagesController().getChat(Long.valueOf(TopicsFragment.this.chatId));
                    AlertsCreator.createClearOrDeleteDialogAlert(TopicsFragment.this, false, chat, null, false, true, false, new MessagesStorage.BooleanCallback() {
                        @Override
                        public final void run(boolean z) {
                            TopicsFragment.AnonymousClass2.this.lambda$onItemClick$3(chat, z);
                        }
                    }, TopicsFragment.this.themeDelegate);
                    break;
                case 12:
                case 13:
                    int i7 = 0;
                    while (true) {
                        if (i7 < TopicsFragment.this.recyclerListView.getChildCount()) {
                            View childAt = TopicsFragment.this.recyclerListView.getChildAt(i7);
                            if ((childAt instanceof TopicDialogCell) && (tLRPC$TL_forumTopic = (topicDialogCell = (TopicDialogCell) childAt).forumTopic) != null && tLRPC$TL_forumTopic.id == 1) {
                                tLRPC$TL_forumTopic2 = tLRPC$TL_forumTopic;
                            } else {
                                i7++;
                            }
                        } else {
                            topicDialogCell = null;
                        }
                    }
                    if (tLRPC$TL_forumTopic2 == null) {
                        while (true) {
                            if (i2 < TopicsFragment.this.forumTopics.size()) {
                                if (TopicsFragment.this.forumTopics.get(i2) == null || TopicsFragment.this.forumTopics.get(i2).topic == null || TopicsFragment.this.forumTopics.get(i2).topic.id != 1) {
                                    i2++;
                                } else {
                                    tLRPC$TL_forumTopic2 = TopicsFragment.this.forumTopics.get(i2).topic;
                                }
                            }
                        }
                    }
                    if (tLRPC$TL_forumTopic2 != null) {
                        if (TopicsFragment.this.hiddenCount <= 0) {
                            TopicsFragment.this.hiddenShown = true;
                            TopicsFragment.this.pullViewState = 2;
                        }
                        TopicsFragment.this.getMessagesController().getTopicsController().toggleShowTopic(TopicsFragment.this.chatId, 1, tLRPC$TL_forumTopic2.hidden);
                        if (topicDialogCell != null) {
                            TopicsFragment.this.generalTopicViewMoving = topicDialogCell;
                        }
                        TopicsFragment.this.recyclerListView.setArchiveHidden(!tLRPC$TL_forumTopic2.hidden, topicDialogCell);
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
            }
            super.onItemClick(i);
        }

        public void lambda$onItemClick$1(final long j, final ArrayList arrayList, int i) {
            final int size = arrayList.size();
            final int[] iArr = new int[1];
            for (int i2 = 0; i2 < size; i2++) {
                TopicsFragment.this.getMessagesController().addUserToChat(j, (TLRPC$User) arrayList.get(i2), i, null, TopicsFragment.this, new Runnable() {
                    @Override
                    public final void run() {
                        TopicsFragment.AnonymousClass2.this.lambda$onItemClick$0(iArr, size, arrayList, j);
                    }
                });
            }
        }

        public void lambda$onItemClick$0(int[] iArr, int i, ArrayList arrayList, long j) {
            int i2 = iArr[0] + 1;
            iArr[0] = i2;
            if (i2 == i) {
                BulletinFactory.of(TopicsFragment.this).createUsersAddedBulletin(arrayList, TopicsFragment.this.getMessagesController().getChat(Long.valueOf(j))).show();
            }
        }

        public void lambda$onItemClick$3(TLRPC$Chat tLRPC$Chat, boolean z) {
            NotificationCenter notificationCenter = TopicsFragment.this.getNotificationCenter();
            TopicsFragment topicsFragment = TopicsFragment.this;
            int i = NotificationCenter.closeChats;
            notificationCenter.removeObserver(topicsFragment, i);
            TopicsFragment.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(i, new Object[0]);
            TopicsFragment.this.finishFragment();
            TopicsFragment.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needDeleteDialog, Long.valueOf(-tLRPC$Chat.id), null, tLRPC$Chat, Boolean.valueOf(z));
        }

        public void lambda$onItemClick$4() {
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

    public class AnonymousClass7 extends DefaultItemAnimator {
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
        public void onAllAnimationsDone() {
            super.onAllAnimationsDone();
            Runnable runnable = this.finishRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.finishRunnable = null;
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    TopicsFragment.AnonymousClass7.this.lambda$onAllAnimationsDone$0();
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
                    TopicsFragment.AnonymousClass7.this.lambda$endAnimations$1();
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

    public void lambda$createView$2(View view, int i) {
        if (getParentLayout() == null || getParentLayout().isInPreviewMode()) {
            return;
        }
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic = view instanceof TopicDialogCell ? ((TopicDialogCell) view).forumTopic : null;
        if (tLRPC$TL_forumTopic == null) {
            return;
        }
        if (this.opnendForSelect) {
            OnTopicSelectedListener onTopicSelectedListener = this.onTopicSelectedListener;
            if (onTopicSelectedListener != null) {
                onTopicSelectedListener.onTopicSelected(tLRPC$TL_forumTopic);
            }
            DialogsActivity dialogsActivity = this.dialogsActivity;
            if (dialogsActivity != null) {
                dialogsActivity.didSelectResult(-this.chatId, tLRPC$TL_forumTopic.id, true, false, this);
            }
        } else if (this.selectedTopics.size() > 0) {
            toggleSelection(view);
        } else {
            if (this.inPreviewMode && AndroidUtilities.isTablet()) {
                for (BaseFragment baseFragment : getParentLayout().getFragmentStack()) {
                    if (baseFragment instanceof DialogsActivity) {
                        DialogsActivity dialogsActivity2 = (DialogsActivity) baseFragment;
                        if (dialogsActivity2.isMainDialogList()) {
                            MessagesStorage.TopicKey openedDialogId = dialogsActivity2.getOpenedDialogId();
                            if (openedDialogId.dialogId == (-this.chatId) && openedDialogId.topicId == tLRPC$TL_forumTopic.id) {
                                return;
                            }
                        } else {
                            continue;
                        }
                    }
                }
                this.selectedTopicForTablet = tLRPC$TL_forumTopic.id;
                updateTopicsList(false, false);
            }
            ForumUtilities.openTopic(this, this.chatId, tLRPC$TL_forumTopic, 0);
        }
    }

    public boolean lambda$createView$3(View view, int i, float f, float f2) {
        if (this.opnendForSelect || getParentLayout() == null || getParentLayout().isInPreviewMode()) {
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
        view.performHapticFeedback(0);
        return true;
    }

    public class AnonymousClass10 extends LinearLayoutManager {
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
                        TopicsFragment.AnonymousClass10.this.lambda$onLayoutChildren$0();
                    }
                });
            }
        }

        public void lambda$onLayoutChildren$0() {
            TopicsFragment.this.adapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$4(View view) {
        presentFragment(TopicCreateFragment.create(this.chatId, 0L));
    }

    public class AnonymousClass16 implements View.OnClickListener {
        AnonymousClass16() {
        }

        @Override
        public void onClick(View view) {
            if (TopicsFragment.this.bottomButtonType != 1) {
                TopicsFragment.this.joinToGroup();
                return;
            }
            TopicsFragment topicsFragment = TopicsFragment.this;
            AlertsCreator.showBlockReportSpamAlert(topicsFragment, -topicsFragment.chatId, null, topicsFragment.getCurrentChat(), null, false, TopicsFragment.this.chatFull, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i) {
                    TopicsFragment.AnonymousClass16.this.lambda$onClick$0(i);
                }
            }, TopicsFragment.this.getResourceProvider());
        }

        public void lambda$onClick$0(int i) {
            if (i == 0) {
                TopicsFragment.this.updateChatInfo();
            } else {
                TopicsFragment.this.finishFragment();
            }
        }
    }

    public void lambda$createView$5(View view) {
        getMessagesController().hidePeerSettingsBar(-this.chatId, null, getCurrentChat());
        updateChatInfo();
    }

    public void lambda$createView$6(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$7(TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus) {
        this.boostsStatus = tL_stories$TL_premium_boostsStatus;
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
            this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceCharSequence("%s", AndroidUtilities.replaceTags(LocaleController.getString("NoTopicsDescription", R.string.NoTopicsDescription)), spannableStringBuilder));
            return;
        }
        String string = LocaleController.getString("General", R.string.General);
        TLRPC$TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.chatId, 1L);
        if (findTopic != null) {
            string = findTopic.title;
        }
        this.topicsEmptyView.subtitle.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoTopicsDescriptionUser", R.string.NoTopicsDescriptionUser, string)));
    }

    private void updateColors() {
        RadialProgressView radialProgressView = this.bottomOverlayProgress;
        if (radialProgressView == null) {
            return;
        }
        radialProgressView.setProgressColor(getThemedColor(Theme.key_chat_fieldOverlayText));
        this.floatingButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chats_actionIcon), PorterDuff.Mode.MULTIPLY));
        FrameLayout frameLayout = this.bottomOverlayContainer;
        int i = Theme.key_windowBackgroundWhite;
        frameLayout.setBackgroundColor(Theme.getColor(i));
        this.actionBar.setActionModeColor(Theme.getColor(i));
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(Theme.getColor(Theme.key_actionBarDefault));
        }
        this.searchContainer.setBackgroundColor(Theme.getColor(i));
    }

    public void openProfile(boolean z) {
        TLRPC$Chat currentChat;
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        if (z && (currentChat = getCurrentChat()) != null && ((tLRPC$ChatPhoto = currentChat.photo) == null || (tLRPC$ChatPhoto instanceof TLRPC$TL_chatPhotoEmpty))) {
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
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity == null || dialogsActivity.getSearchItem() == null) {
            return;
        }
        if (this.parentAvatarImageView == null) {
            this.parentAvatarImageView = new BackupImageView(getContext());
            this.parentAvatarDrawable = new AvatarDrawable();
            this.parentAvatarImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
            this.parentAvatarDrawable.setInfo(this.currentAccount, getCurrentChat());
            this.parentAvatarImageView.setForUserOrChat(getCurrentChat(), this.parentAvatarDrawable);
        }
        this.parentDialogsActivity.getSearchItem().setSearchPaddingStart(52);
        this.parentDialogsActivity.getActionBar().setSearchAvatarImageView(this.parentAvatarImageView);
        this.parentDialogsActivity.getActionBar().onSearchFieldVisibilityChanged(this.parentDialogsActivity.getSearchItem().toggleSearch(true));
    }

    public void updateTopView() {
        float f;
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null) {
            f = Math.max(0.0f, fragmentContextView.getTopPadding()) + 0.0f;
            this.fragmentContextView.setTranslationY(f);
        } else {
            f = 0.0f;
        }
        ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.pendingRequestsDelegate;
        View view = chatActivityMemberRequestsDelegate != null ? chatActivityMemberRequestsDelegate.getView() : null;
        if (view != null) {
            view.setTranslationY(this.pendingRequestsDelegate.getViewEnterOffset() + f);
            f += this.pendingRequestsDelegate.getViewEnterOffset() + this.pendingRequestsDelegate.getViewHeight();
        }
        this.recyclerListView.setTranslationY(Math.max(0.0f, f));
        this.recyclerListView.setPadding(0, 0, 0, AndroidUtilities.dp(this.bottomPannelVisible ? 51.0f : 0.0f) + ((int) f));
    }

    public void setTransitionPadding(int i) {
        this.transitionPadding = i;
        updateFloatingButtonOffset();
    }

    public class TopicsRecyclerView extends BlurredRecyclerView {
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
            View findViewByPosition;
            this.viewOffset = f;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).setTranslationY(f);
            }
            if (this.selectorPosition != -1 && (findViewByPosition = getLayoutManager().findViewByPosition(this.selectorPosition)) != null) {
                this.selectorRect.set(findViewByPosition.getLeft(), (int) (findViewByPosition.getTop() + f), findViewByPosition.getRight(), (int) (findViewByPosition.getBottom() + f));
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
        public void dispatchDraw(Canvas canvas) {
            if (TopicsFragment.this.generalTopicViewMoving != null) {
                canvas.save();
                canvas.translate(TopicsFragment.this.generalTopicViewMoving.getLeft(), TopicsFragment.this.generalTopicViewMoving.getY());
                TopicsFragment.this.generalTopicViewMoving.draw(canvas);
                canvas.restore();
            }
            super.dispatchDraw(canvas);
            if (drawMovingViewsOverlayed()) {
                this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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
        public void onDetachedFromWindow() {
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
        public void onMeasure(int i, int i2) {
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
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
            int findFirstVisibleItemPosition;
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
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if ((action == 1 || action == 3) && TopicsFragment.this.pullViewState == 2 && TopicsFragment.this.hiddenCount > 0 && (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition()) == 0) {
                int paddingTop = getPaddingTop();
                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                int top = (findViewByPosition.getTop() - paddingTop) + findViewByPosition.getMeasuredHeight();
                long currentTimeMillis = System.currentTimeMillis() - TopicsFragment.this.startArchivePullingTime;
                if (top < dp || currentTimeMillis < 200) {
                    TopicsFragment.this.disableActionBarScrolling = true;
                    smoothScrollBy(0, top, CubicBezierInterpolator.EASE_OUT_QUINT);
                    TopicsFragment.this.pullViewState = 2;
                } else if (TopicsFragment.this.pullViewState != 1) {
                    if (getViewOffset() == 0.0f) {
                        TopicsFragment.this.disableActionBarScrolling = true;
                        smoothScrollBy(0, findViewByPosition.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                    }
                    if (!TopicsFragment.this.canShowHiddenArchive) {
                        TopicsFragment.this.canShowHiddenArchive = true;
                        performHapticFeedback(3, 2);
                        if (TopicsFragment.this.pullForegroundDrawable != null) {
                            TopicsFragment.this.pullForegroundDrawable.colorize(true);
                        }
                    }
                    ((DialogCell) findViewByPosition).startOutAnimation();
                    TopicsFragment.this.pullViewState = 1;
                }
                if (getViewOffset() != 0.0f) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(getViewOffset(), 0.0f);
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            TopicsFragment.TopicsRecyclerView.this.lambda$onTouchEvent$0(valueAnimator);
                        }
                    });
                    ofFloat.setDuration(Math.max(100L, 350.0f - ((getViewOffset() / PullForegroundDrawable.getMaxOverscroll()) * 120.0f)));
                    ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    setScrollEnabled(false);
                    ofFloat.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            TopicsRecyclerView.this.setScrollEnabled(true);
                        }
                    });
                    ofFloat.start();
                }
            }
            return onTouchEvent;
        }

        public void lambda$onTouchEvent$0(ValueAnimator valueAnimator) {
            setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!this.fastScrollAnimationRunning && !TopicsFragment.this.waitingForScrollFinished && TopicsFragment.this.dialogRemoveFinished == 0 && TopicsFragment.this.dialogInsertFinished == 0 && TopicsFragment.this.dialogChangeFinished == 0) {
                if (TopicsFragment.this.getParentLayout() == null || !TopicsFragment.this.getParentLayout().isInPreviewMode()) {
                    if (motionEvent.getAction() == 0) {
                        TopicsFragment topicsFragment = TopicsFragment.this;
                        topicsFragment.allowSwipeDuringCurrentTouch = !((BaseFragment) topicsFragment).actionBar.isActionModeShowed();
                        checkIfAdapterValid();
                    }
                    return super.onInterceptTouchEvent(motionEvent);
                }
                return false;
            }
            return false;
        }

        @Override
        public boolean allowSelectChildAtPosition(View view) {
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
                TopicsFragment.lambda$onDialogAnimationFinished$8();
            }
        });
    }

    public void deleteTopics(HashSet<Integer> hashSet, Runnable runnable) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setTitle(LocaleController.getPluralString("DeleteTopics", hashSet.size()));
        ArrayList arrayList = new ArrayList(hashSet);
        if (hashSet.size() == 1) {
            builder.setMessage(LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, this.topicsController.findTopic(this.chatId, ((Integer) arrayList.get(0)).intValue()).title));
        } else {
            builder.setMessage(LocaleController.getString("DeleteSelectedTopics", R.string.DeleteSelectedTopics));
        }
        builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new AnonymousClass20(hashSet, arrayList, runnable));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), new DialogInterface.OnClickListener(this) {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        AlertDialog create = builder.create();
        create.show();
        TextView textView = (TextView) create.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public class AnonymousClass20 implements DialogInterface.OnClickListener {
        final Runnable val$runnable;
        final HashSet val$selectedTopics;
        final ArrayList val$topicsToRemove;

        AnonymousClass20(HashSet hashSet, ArrayList arrayList, Runnable runnable) {
            this.val$selectedTopics = hashSet;
            this.val$topicsToRemove = arrayList;
            this.val$runnable = runnable;
        }

        @Override
        public void onClick(DialogInterface dialogInterface, int i) {
            TopicsFragment.this.excludeTopics = new HashSet<>();
            TopicsFragment.this.excludeTopics.addAll(this.val$selectedTopics);
            TopicsFragment.this.updateTopicsList(true, false);
            BulletinFactory of = BulletinFactory.of(TopicsFragment.this);
            String pluralString = LocaleController.getPluralString("TopicsDeleted", this.val$selectedTopics.size());
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    TopicsFragment.AnonymousClass20.this.lambda$onClick$0();
                }
            };
            final ArrayList arrayList = this.val$topicsToRemove;
            final Runnable runnable2 = this.val$runnable;
            of.createUndoBulletin(pluralString, runnable, new Runnable() {
                @Override
                public final void run() {
                    TopicsFragment.AnonymousClass20.this.lambda$onClick$1(arrayList, runnable2);
                }
            }).show();
            TopicsFragment.this.clearSelectedTopics();
            dialogInterface.dismiss();
        }

        public void lambda$onClick$0() {
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.excludeTopics = null;
            topicsFragment.updateTopicsList(true, false);
        }

        public void lambda$onClick$1(ArrayList arrayList, Runnable runnable) {
            TopicsFragment.this.topicsController.deleteTopics(TopicsFragment.this.chatId, arrayList);
            runnable.run();
        }
    }

    public boolean showChatPreview(DialogCell dialogCell) {
        dialogCell.performHapticFeedback(0);
        final ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr = {new ActionBarPopupWindow.ActionBarPopupWindowLayout(getParentActivity(), R.drawable.popup_fixed_alert, getResourceProvider(), 1)};
        final TLRPC$TL_forumTopic tLRPC$TL_forumTopic = dialogCell.forumTopic;
        ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(getContext(), this.currentAccount, actionBarPopupWindowLayoutArr[0].getSwipeBack(), false, false, new AnonymousClass22(tLRPC$TL_forumTopic), getResourceProvider());
        final int addViewToSwipeBack = actionBarPopupWindowLayoutArr[0].addViewToSwipeBack(chatNotificationsPopupWrapper.windowLayout);
        chatNotificationsPopupWrapper.type = 1;
        chatNotificationsPopupWrapper.lambda$update$11(-this.chatId, tLRPC$TL_forumTopic.id, null);
        if (ChatObject.canManageTopics(getCurrentChat())) {
            ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getParentActivity(), true, false);
            if (tLRPC$TL_forumTopic.pinned) {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("DialogUnpin", R.string.DialogUnpin), R.drawable.msg_unpin);
            } else {
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("DialogPin", R.string.DialogPin), R.drawable.msg_pin);
            }
            actionBarMenuSubItem.setMinimumWidth(160);
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicsFragment.this.lambda$showChatPreview$9(tLRPC$TL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem);
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getParentActivity(), false, false);
        if (getMessagesController().isDialogMuted(-this.chatId, tLRPC$TL_forumTopic.id)) {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("Unmute", R.string.Unmute), R.drawable.msg_mute);
        } else {
            actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("Mute", R.string.Mute), R.drawable.msg_unmute);
        }
        actionBarMenuSubItem2.setMinimumWidth(160);
        actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TopicsFragment.this.lambda$showChatPreview$10(tLRPC$TL_forumTopic, actionBarPopupWindowLayoutArr, addViewToSwipeBack, view);
            }
        });
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem2);
        if (ChatObject.canManageTopic(this.currentAccount, getCurrentChat(), tLRPC$TL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getParentActivity(), false, false);
            if (tLRPC$TL_forumTopic.closed) {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("RestartTopic", R.string.RestartTopic), R.drawable.msg_topic_restart);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("CloseTopic", R.string.CloseTopic), R.drawable.msg_topic_close);
            }
            actionBarMenuSubItem3.setMinimumWidth(160);
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicsFragment.this.lambda$showChatPreview$11(tLRPC$TL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem3);
        }
        if (ChatObject.canDeleteTopic(this.currentAccount, getCurrentChat(), tLRPC$TL_forumTopic)) {
            ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getParentActivity(), false, true);
            actionBarMenuSubItem4.setTextAndIcon(LocaleController.getPluralString("DeleteTopics", 1), R.drawable.msg_delete);
            actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_text_RedRegular));
            actionBarMenuSubItem4.setTextColor(getThemedColor(Theme.key_text_RedBold));
            actionBarMenuSubItem4.setMinimumWidth(160);
            actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TopicsFragment.this.lambda$showChatPreview$13(tLRPC$TL_forumTopic, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem4);
        }
        prepareBlurBitmap();
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", this.chatId);
        ChatActivity chatActivity = new ChatActivity(bundle);
        ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-this.chatId, dialogCell.forumTopic.id));
        presentFragmentAsPreviewWithMenu(chatActivity, actionBarPopupWindowLayoutArr[0]);
        return false;
    }

    public class AnonymousClass22 implements ChatNotificationsPopupWrapper.Callback {
        final TLRPC$TL_forumTopic val$topic;

        @Override
        public void openExceptions() {
            ChatNotificationsPopupWrapper.Callback.CC.$default$openExceptions(this);
        }

        AnonymousClass22(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            this.val$topic = tLRPC$TL_forumTopic;
        }

        @Override
        public void dismiss() {
            TopicsFragment.this.finishPreviewFragment();
        }

        @Override
        public void toggleSound() {
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) TopicsFragment.this).currentAccount);
            boolean z = !notificationsSettings.getBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(-TopicsFragment.this.chatId, this.val$topic.id), true);
            notificationsSettings.edit().putBoolean("sound_enabled_" + NotificationsController.getSharedPrefKey(-TopicsFragment.this.chatId, this.val$topic.id), z).apply();
            TopicsFragment.this.finishPreviewFragment();
            if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                BulletinFactory.createSoundEnabledBulletin(topicsFragment, !z, topicsFragment.getResourceProvider()).show();
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
            final TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.val$topic;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsFragment.AnonymousClass22.this.lambda$showCustomize$0(tLRPC$TL_forumTopic);
                }
            }, 500L);
        }

        public void lambda$showCustomize$0(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", -TopicsFragment.this.chatId);
            bundle.putLong("topic_id", tLRPC$TL_forumTopic.id);
            TopicsFragment topicsFragment = TopicsFragment.this;
            topicsFragment.presentFragment(new ProfileNotificationsActivity(bundle, topicsFragment.themeDelegate));
        }

        @Override
        public void toggleMute() {
            TopicsFragment.this.finishPreviewFragment();
            boolean z = !TopicsFragment.this.getMessagesController().isDialogMuted(-TopicsFragment.this.chatId, this.val$topic.id);
            TopicsFragment.this.getNotificationsController().muteDialog(-TopicsFragment.this.chatId, this.val$topic.id, z);
            if (BulletinFactory.canShowBulletin(TopicsFragment.this)) {
                TopicsFragment topicsFragment = TopicsFragment.this;
                BulletinFactory.createMuteBulletin(topicsFragment, z ? 3 : 4, z ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0, topicsFragment.getResourceProvider()).show();
            }
        }
    }

    public void lambda$showChatPreview$9(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, View view) {
        this.scrollToTop = true;
        this.updateAnimated = true;
        this.topicsController.pinTopic(this.chatId, tLRPC$TL_forumTopic.id, !tLRPC$TL_forumTopic.pinned, this);
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$10(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr, int i, View view) {
        if (getMessagesController().isDialogMuted(-this.chatId, tLRPC$TL_forumTopic.id)) {
            getNotificationsController().muteDialog(-this.chatId, tLRPC$TL_forumTopic.id, false);
            finishPreviewFragment();
            if (BulletinFactory.canShowBulletin(this)) {
                BulletinFactory.createMuteBulletin(this, 4, 0, getResourceProvider()).show();
                return;
            }
            return;
        }
        actionBarPopupWindowLayoutArr[0].getSwipeBack().openForeground(i);
    }

    public void lambda$showChatPreview$11(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, View view) {
        this.updateAnimated = true;
        this.topicsController.toggleCloseTopic(this.chatId, tLRPC$TL_forumTopic.id, !tLRPC$TL_forumTopic.closed);
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$13(TLRPC$TL_forumTopic tLRPC$TL_forumTopic, View view) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(Integer.valueOf(tLRPC$TL_forumTopic.id));
        deleteTopics(hashSet, new Runnable() {
            @Override
            public final void run() {
                TopicsFragment.this.lambda$showChatPreview$12();
            }
        });
    }

    public void lambda$showChatPreview$12() {
        finishPreviewFragment();
    }

    private void checkLoading() {
        this.loadingTopics = this.topicsController.isLoading(this.chatId);
        if (this.topicsEmptyView != null && (this.forumTopics.size() == 0 || (this.forumTopics.size() == 1 && this.forumTopics.get(0).topic.id == 1))) {
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
            ViewPagerFixed.TabsView createTabsView = this.searchContainer.createTabsView(false, 8);
            this.searchTabsView = createTabsView;
            if (this.parentDialogsActivity != null) {
                createTabsView.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            }
            this.fullscreenView.addView(this.searchTabsView, LayoutHelper.createFrame(-1, 44.0f));
        }
        float[] fArr = new float[2];
        fArr[0] = this.searchAnimationProgress;
        fArr[1] = z ? 1.0f : 0.0f;
        this.searchAnimator = ValueAnimator.ofFloat(fArr);
        AndroidUtilities.updateViewVisibilityAnimated(this.searchContainer, false, 1.0f, true);
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity != null && (rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer) != null) {
            rightSlidingDialogContainer.enabled = !z;
        }
        this.animateSearchWithScale = !z && this.searchContainer.getVisibility() == 0 && this.searchContainer.getAlpha() == 1.0f;
        this.searchAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                TopicsFragment.this.lambda$animateToSearchView$14(valueAnimator2);
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

    public void lambda$animateToSearchView$14(ValueAnimator valueAnimator) {
        updateSearchProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void updateCreateTopicButton(boolean z) {
        if (this.createTopicSubmenu == null) {
            return;
        }
        boolean z2 = (ChatObject.isNotInChat(getMessagesController().getChat(Long.valueOf(this.chatId))) || !ChatObject.canCreateTopic(getMessagesController().getChat(Long.valueOf(this.chatId))) || this.searching || this.opnendForSelect || this.loadingTopics) ? false : true;
        this.canShowCreateTopic = z2;
        this.createTopicSubmenu.setVisibility(z2 ? 0 : 8);
        hideFloatingButton(!this.canShowCreateTopic, z);
    }

    public void updateSearchProgress(float f) {
        this.searchAnimationProgress = f;
        int color = Theme.getColor(Theme.key_actionBarDefaultIcon);
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarActionModeDefaultIcon;
        actionBar.setItemsColor(ColorUtils.blendARGB(color, Theme.getColor(i), this.searchAnimationProgress), false);
        this.actionBar.setItemsColor(ColorUtils.blendARGB(Theme.getColor(i), Theme.getColor(i), this.searchAnimationProgress), true);
        this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_actionBarDefaultSelector), Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), this.searchAnimationProgress), false);
        if (!this.inPreviewMode) {
            this.actionBar.setBackgroundColor(ColorUtils.blendARGB(Theme.getColor(Theme.key_actionBarDefault), Theme.getColor(Theme.key_windowBackgroundWhite), this.searchAnimationProgress));
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
                TopicsFragment.this.lambda$joinToGroup$15();
            }
        }, new MessagesController.ErrorDelegate() {
            @Override
            public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                boolean lambda$joinToGroup$16;
                lambda$joinToGroup$16 = TopicsFragment.this.lambda$joinToGroup$16(tLRPC$TL_error);
                return lambda$joinToGroup$16;
            }
        });
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
        updateChatInfo();
    }

    public void lambda$joinToGroup$15() {
        updateChatInfo(true);
    }

    public boolean lambda$joinToGroup$16(TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null || !"INVITE_REQUEST_SENT".equals(tLRPC$TL_error.text)) {
            return true;
        }
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + (-this.chatId), System.currentTimeMillis()).commit();
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

    private void toggleSelection(View view) {
        TopicDialogCell topicDialogCell;
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
        int i;
        String str;
        int i2;
        String str2;
        if (!(view instanceof TopicDialogCell) || (tLRPC$TL_forumTopic = (topicDialogCell = (TopicDialogCell) view).forumTopic) == null) {
            return;
        }
        int i3 = tLRPC$TL_forumTopic.id;
        if (!this.selectedTopics.remove(Integer.valueOf(i3))) {
            this.selectedTopics.add(Integer.valueOf(i3));
        }
        topicDialogCell.setChecked(this.selectedTopics.contains(Integer.valueOf(i3)), true);
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (this.selectedTopics.size() > 0) {
            chekActionMode();
            if (this.inPreviewMode) {
                ((View) this.fragmentView.getParent()).invalidate();
            }
            this.actionBar.showActionMode(true);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            Iterator<Integer> it = this.selectedTopics.iterator();
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (it.hasNext()) {
                long intValue = it.next().intValue();
                TLRPC$TL_forumTopic findTopic = this.topicsController.findTopic(this.chatId, intValue);
                if (findTopic != null) {
                    if (findTopic.unread_count != 0) {
                        i4++;
                    }
                    if (ChatObject.canManageTopics(chat) && !findTopic.hidden) {
                        if (findTopic.pinned) {
                            i7++;
                        } else {
                            i6++;
                        }
                    }
                }
                if (getMessagesController().isDialogMuted(-this.chatId, intValue)) {
                    i5++;
                }
            }
            if (i4 > 0) {
                this.readItem.setVisibility(0);
                this.readItem.setTextAndIcon(LocaleController.getString("MarkAsRead", R.string.MarkAsRead), R.drawable.msg_markread);
            } else {
                this.readItem.setVisibility(8);
            }
            if (i5 != 0) {
                this.mute = false;
                this.muteItem.setIcon(R.drawable.msg_unmute);
                this.muteItem.setContentDescription(LocaleController.getString("ChatsUnmute", R.string.ChatsUnmute));
            } else {
                this.mute = true;
                this.muteItem.setIcon(R.drawable.msg_mute);
                this.muteItem.setContentDescription(LocaleController.getString("ChatsMute", R.string.ChatsMute));
            }
            this.pinItem.setVisibility((i6 == 1 && i7 == 0) ? 0 : 8);
            this.unpinItem.setVisibility((i7 == 1 && i6 == 0) ? 0 : 8);
            this.selectedDialogsCountTextView.setNumber(this.selectedTopics.size(), true);
            Iterator<Integer> it2 = this.selectedTopics.iterator();
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (it2.hasNext()) {
                int i13 = i8;
                TLRPC$TL_forumTopic findTopic2 = this.topicsController.findTopic(this.chatId, it2.next().intValue());
                if (findTopic2 != null) {
                    if (ChatObject.canDeleteTopic(this.currentAccount, chat, findTopic2)) {
                        i10++;
                    }
                    if (ChatObject.canManageTopic(this.currentAccount, chat, findTopic2)) {
                        if (findTopic2.id == 1) {
                            if (findTopic2.hidden) {
                                i12++;
                            } else {
                                i11++;
                            }
                        }
                        if (!findTopic2.hidden) {
                            if (findTopic2.closed) {
                                i8 = i13 + 1;
                            } else {
                                i9++;
                            }
                        }
                    }
                }
                i8 = i13;
            }
            int i14 = i8;
            this.closeTopic.setVisibility((i14 != 0 || i9 <= 0) ? 8 : 0);
            ActionBarMenuSubItem actionBarMenuSubItem = this.closeTopic;
            if (i9 > 1) {
                i = R.string.CloseTopics;
                str = "CloseTopics";
            } else {
                i = R.string.CloseTopic;
                str = "CloseTopic";
            }
            actionBarMenuSubItem.setText(LocaleController.getString(str, i));
            this.restartTopic.setVisibility((i9 != 0 || i14 <= 0) ? 8 : 0);
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.restartTopic;
            if (i14 > 1) {
                i2 = R.string.RestartTopics;
                str2 = "RestartTopics";
            } else {
                i2 = R.string.RestartTopic;
                str2 = "RestartTopic";
            }
            actionBarMenuSubItem2.setText(LocaleController.getString(str2, i2));
            this.deleteItem.setVisibility(i10 == this.selectedTopics.size() ? 0 : 8);
            this.hideItem.setVisibility((i11 == 1 && this.selectedTopics.size() == 1) ? 0 : 8);
            this.showItem.setVisibility((i12 == 1 && this.selectedTopics.size() == 1) ? 0 : 8);
            this.otherItem.checkHideMenuItem();
            updateReordering();
            return;
        }
        this.actionBar.hideActionMode();
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
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic = this.forumTopics.get(i).topic;
            if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.pinned) {
                arrayList.add(Integer.valueOf(tLRPC$TL_forumTopic.id));
            }
        }
        getMessagesController().getTopicsController().reorderPinnedTopics(this.chatId, arrayList);
    }

    private void chekActionMode() {
        if (this.actionBar.actionModeIsExist(null)) {
            return;
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, null);
        if (this.inPreviewMode) {
            createActionMode.setBackgroundColor(0);
            createActionMode.drawBlur = false;
        }
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        createActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean lambda$chekActionMode$17;
                lambda$chekActionMode$17 = TopicsFragment.lambda$chekActionMode$17(view, motionEvent);
                return lambda$chekActionMode$17;
            }
        });
        this.pinItem = createActionMode.addItemWithWidth(4, R.drawable.msg_pin, AndroidUtilities.dp(54.0f));
        this.unpinItem = createActionMode.addItemWithWidth(5, R.drawable.msg_unpin, AndroidUtilities.dp(54.0f));
        this.muteItem = createActionMode.addItemWithWidth(6, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
        this.deleteItem = createActionMode.addItemWithWidth(7, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString("Delete", R.string.Delete));
        ActionBarMenuItem addItemWithWidth = createActionMode.addItemWithWidth(12, R.drawable.msg_archive_hide, AndroidUtilities.dp(54.0f), LocaleController.getString("Hide", R.string.Hide));
        this.hideItem = addItemWithWidth;
        addItemWithWidth.setVisibility(8);
        ActionBarMenuItem addItemWithWidth2 = createActionMode.addItemWithWidth(13, R.drawable.msg_archive_show, AndroidUtilities.dp(54.0f), LocaleController.getString("Show", R.string.Show));
        this.showItem = addItemWithWidth2;
        addItemWithWidth2.setVisibility(8);
        ActionBarMenuItem addItemWithWidth3 = createActionMode.addItemWithWidth(0, R.drawable.ic_ab_other, AndroidUtilities.dp(54.0f), LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.otherItem = addItemWithWidth3;
        this.readItem = addItemWithWidth3.addSubItem(8, R.drawable.msg_markread, LocaleController.getString("MarkAsRead", R.string.MarkAsRead));
        this.closeTopic = this.otherItem.addSubItem(9, R.drawable.msg_topic_close, LocaleController.getString("CloseTopic", R.string.CloseTopic));
        this.restartTopic = this.otherItem.addSubItem(10, R.drawable.msg_topic_restart, LocaleController.getString("RestartTopic", R.string.RestartTopic));
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
            if (adapterPosition < 0 || adapterPosition >= TopicsFragment.this.forumTopics.size() || TopicsFragment.this.forumTopics.get(adapterPosition).topic == null || !ChatObject.canManageTopics(TopicsFragment.this.getCurrentChat())) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            TLRPC$TL_forumTopic tLRPC$TL_forumTopic = TopicsFragment.this.forumTopics.get(adapterPosition).topic;
            if (TopicsFragment.this.selectedTopics.isEmpty()) {
                View view = viewHolder.itemView;
                if ((view instanceof TopicDialogCell) && tLRPC$TL_forumTopic.id == 1) {
                    this.swipingFolder = true;
                    ((TopicDialogCell) view).setSliding(true);
                    return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                }
            }
            if (!tLRPC$TL_forumTopic.pinned) {
                return ItemTouchHelper.Callback.makeMovementFlags(0, 0);
            }
            return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            int adapterPosition;
            if (viewHolder.getItemViewType() == viewHolder2.getItemViewType() && (adapterPosition = viewHolder2.getAdapterPosition()) >= 0 && adapterPosition < TopicsFragment.this.forumTopics.size() && TopicsFragment.this.forumTopics.get(adapterPosition).topic != null && TopicsFragment.this.forumTopics.get(adapterPosition).topic.pinned) {
                TopicsFragment.this.adapter.swapElements(viewHolder.getAdapterPosition(), viewHolder2.getAdapterPosition());
                return true;
            }
            return false;
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
                    TLRPC$TL_forumTopic tLRPC$TL_forumTopic = topicDialogCell.forumTopic;
                    topicsController.toggleShowTopic(j, tLRPC$TL_forumTopic.id, tLRPC$TL_forumTopic.hidden);
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
        String lowerCase;
        TLRPC$ChatParticipants tLRPC$ChatParticipants;
        TLRPC$ChatFull chatFull = getMessagesController().getChatFull(this.chatId);
        TLRPC$ChatFull tLRPC$ChatFull = this.chatFull;
        if (tLRPC$ChatFull != null && (tLRPC$ChatParticipants = tLRPC$ChatFull.participants) != null) {
            chatFull.participants = tLRPC$ChatParticipants;
        }
        this.chatFull = chatFull;
        if (chatFull != null) {
            lowerCase = LocaleController.formatPluralString("Members", chatFull.participants_count, new Object[0]);
        } else {
            lowerCase = LocaleController.getString("Loading", R.string.Loading).toLowerCase();
        }
        this.avatarContainer.setSubtitle(lowerCase);
    }

    @Override
    public boolean onFragmentCreate() {
        getMessagesController().loadFullChat(this.chatId, 0, true);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatSwithcedToForum);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.openedChatChanged);
        updateTopicsList(false, false);
        SelectAnimatedEmojiDialog.preload(this.currentAccount);
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, false);
        }
        if (!settingsPreloaded.contains(Long.valueOf(this.chatId))) {
            settingsPreloaded.add(Long.valueOf(this.chatId));
            TLRPC$TL_account_getNotifyExceptions tLRPC$TL_account_getNotifyExceptions = new TLRPC$TL_account_getNotifyExceptions();
            TLRPC$TL_inputNotifyPeer tLRPC$TL_inputNotifyPeer = new TLRPC$TL_inputNotifyPeer();
            tLRPC$TL_account_getNotifyExceptions.peer = tLRPC$TL_inputNotifyPeer;
            tLRPC$TL_account_getNotifyExceptions.flags |= 1;
            tLRPC$TL_inputNotifyPeer.peer = getMessagesController().getInputPeer(-this.chatId);
            getConnectionsManager().sendRequest(tLRPC$TL_account_getNotifyExceptions, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TopicsFragment.this.lambda$onFragmentCreate$19(tLObject, tLRPC$TL_error);
                }
            });
        }
        return true;
    }

    public void lambda$onFragmentCreate$19(final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TopicsFragment.this.lambda$onFragmentCreate$18(tLObject);
            }
        });
    }

    public void lambda$onFragmentCreate$18(TLObject tLObject) {
        if (tLObject instanceof TLRPC$TL_updates) {
            getMessagesController().processUpdates((TLRPC$TL_updates) tLObject, false);
        }
    }

    @Override
    public void onFragmentDestroy() {
        this.notificationsLocker.unlock();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatWasBoostedByUser);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatInfoDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.topicsDidLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.dialogsNeedReload);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.groupCallUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatSwithcedToForum);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.openedChatChanged);
        TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(this.chatId));
        if (ChatObject.isChannel(chat)) {
            getMessagesController().startShortPoll(chat, this.classGuid, true);
        }
        super.onFragmentDestroy();
        DialogsActivity dialogsActivity = this.parentDialogsActivity;
        if (dialogsActivity == null || dialogsActivity.rightSlidingDialogContainer == null) {
            return;
        }
        dialogsActivity.getActionBar().setSearchAvatarImageView(null);
        this.parentDialogsActivity.getSearchItem().setSearchPaddingStart(0);
        this.parentDialogsActivity.rightSlidingDialogContainer.enabled = true;
    }

    public void updateTopicsList(boolean z, boolean z2) {
        LinearLayoutManager linearLayoutManager;
        TLRPC$TL_forumTopic tLRPC$TL_forumTopic;
        if (!z && this.updateAnimated) {
            z = true;
        }
        this.updateAnimated = false;
        ArrayList<TLRPC$TL_forumTopic> topics = this.topicsController.getTopics(this.chatId);
        if (topics != null) {
            int size = this.forumTopics.size();
            ArrayList<? extends AdapterWithDiffUtils.Item> arrayList = new ArrayList<>(this.forumTopics);
            this.forumTopics.clear();
            for (int i = 0; i < topics.size(); i++) {
                HashSet<Integer> hashSet = this.excludeTopics;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(topics.get(i).id))) {
                    this.forumTopics.add(new Item(this, 0, topics.get(i)));
                }
            }
            if (!this.forumTopics.isEmpty() && !this.topicsController.endIsReached(this.chatId) && this.canShowProgress) {
                this.forumTopics.add(new Item(this, 1, null));
            }
            int size2 = this.forumTopics.size();
            if (this.fragmentBeginToShow && z2 && size2 > size) {
                this.itemsEnterAnimator.showItemsAnimated(size + 4);
                z = false;
            }
            this.hiddenCount = 0;
            for (int i2 = 0; i2 < this.forumTopics.size(); i2++) {
                Item item = this.forumTopics.get(i2);
                if (item != null && (tLRPC$TL_forumTopic = item.topic) != null && tLRPC$TL_forumTopic.hidden) {
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
        TLRPC$ChatFull tLRPC$ChatFull;
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC$ChatFull tLRPC$ChatFull2 = (TLRPC$ChatFull) objArr[0];
            TLRPC$ChatParticipants tLRPC$ChatParticipants = tLRPC$ChatFull2.participants;
            if (tLRPC$ChatParticipants != null && (tLRPC$ChatFull = this.chatFull) != null) {
                tLRPC$ChatFull.participants = tLRPC$ChatParticipants;
            }
            if (tLRPC$ChatFull2.id == this.chatId) {
                updateChatInfo();
                ChatActivityMemberRequestsDelegate chatActivityMemberRequestsDelegate = this.pendingRequestsDelegate;
                if (chatActivityMemberRequestsDelegate != null) {
                    chatActivityMemberRequestsDelegate.setChatInfo(tLRPC$ChatFull2, true);
                }
            }
        } else if (i == NotificationCenter.chatWasBoostedByUser) {
            if (this.chatId == (-((Long) objArr[2]).longValue())) {
                this.boostsStatus = (TL_stories$TL_premium_boostsStatus) objArr[0];
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
            int intValue = ((Integer) objArr[0]).intValue();
            if (intValue == MessagesController.UPDATE_MASK_CHAT) {
                updateChatInfo();
            }
            if ((intValue & MessagesController.UPDATE_MASK_SELECT_DIALOG) > 0) {
                getMessagesController().getTopicsController().sortTopics(this.chatId, false);
                boolean z = !this.recyclerListView.canScrollVertically(-1);
                updateTopicsList(true, false);
                if (z) {
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
            }
        } else if (i == NotificationCenter.notificationsSettingsUpdated) {
            updateTopicsList(false, false);
            updateChatInfo(true);
        } else if (i != NotificationCenter.chatSwithcedToForum && i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
        }
        if (i == NotificationCenter.openedChatChanged && getParentActivity() != null && this.inPreviewMode && AndroidUtilities.isTablet()) {
            boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
            long longValue = ((Long) objArr[0]).longValue();
            long longValue2 = ((Long) objArr[1]).longValue();
            if (longValue == (-this.chatId) && !booleanValue) {
                if (this.selectedTopicForTablet != longValue2) {
                    this.selectedTopicForTablet = longValue2;
                    updateTopicsList(false, false);
                }
            } else if (this.selectedTopicForTablet != 0) {
                this.selectedTopicForTablet = 0L;
                updateTopicsList(false, false);
            }
        }
    }

    public void checkForLoadMore() {
        LinearLayoutManager linearLayoutManager;
        if (this.topicsController.endIsReached(this.chatId) || (linearLayoutManager = this.layoutManager) == null) {
            return;
        }
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (this.forumTopics.isEmpty() || findLastVisibleItemPosition >= this.adapter.getItemCount() - 5) {
            this.topicsController.loadTopics(this.chatId);
        }
        checkLoading();
    }

    public void setExcludeTopics(HashSet<Integer> hashSet) {
        this.excludeTopics = hashSet;
    }

    @Override
    public ChatObject.Call getGroupCall() {
        ChatObject.Call call = this.groupCall;
        if (call == null || !(call.call instanceof TLRPC$TL_groupCall)) {
            return null;
        }
        return call;
    }

    @Override
    public TLRPC$Chat getCurrentChat() {
        return getMessagesController().getChat(Long.valueOf(this.chatId));
    }

    @Override
    public long getDialogId() {
        return -this.chatId;
    }

    public void setForwardFromDialogFragment(DialogsActivity dialogsActivity) {
        this.dialogsActivity = dialogsActivity;
    }

    public class Adapter extends AdapterWithDiffUtils {
        private Adapter() {
        }

        @Override
        public int getItemViewType(int i) {
            if (i == getItemCount() - 1) {
                return 2;
            }
            return TopicsFragment.this.forumTopics.get(i).viewType;
        }

        public ArrayList<Item> getArray() {
            return TopicsFragment.this.forumTopicsListFrozen ? TopicsFragment.this.frozenForumTopicsList : TopicsFragment.this.forumTopics;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 0) {
                TopicDialogCell topicDialogCell = new TopicDialogCell(null, viewGroup.getContext(), true, false);
                topicDialogCell.inPreviewMode = ((BaseFragment) TopicsFragment.this).inPreviewMode;
                topicDialogCell.setArchivedPullAnimation(TopicsFragment.this.pullForegroundDrawable);
                return new RecyclerListView.Holder(topicDialogCell);
            } else if (i == 2) {
                return new RecyclerListView.Holder(TopicsFragment.this.emptyView = new View(TopicsFragment.this.getContext()) {
                    HashMap<String, Boolean> precalcEllipsized = new HashMap<>();

                    @Override
                    protected void onMeasure(int i2, int i3) {
                        int i4;
                        int dp;
                        int size = View.MeasureSpec.getSize(i2);
                        int dp2 = AndroidUtilities.dp(64.0f);
                        int i5 = 0;
                        int i6 = 0;
                        for (int i7 = 0; i7 < Adapter.this.getArray().size(); i7++) {
                            if (Adapter.this.getArray().get(i7) != null && Adapter.this.getArray().get(i7).topic != null) {
                                String str = Adapter.this.getArray().get(i7).topic.title;
                                Boolean bool = this.precalcEllipsized.get(str);
                                if (bool == null) {
                                    int dp3 = AndroidUtilities.dp(LocaleController.isRTL ? 18.0f : (TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 4);
                                    if (LocaleController.isRTL) {
                                        i4 = size - dp3;
                                        dp = AndroidUtilities.dp((TopicsFragment.this.isInPreviewMode() ? 11 : 50) + 5 + 8);
                                    } else {
                                        i4 = size - dp3;
                                        dp = AndroidUtilities.dp(22.0f);
                                    }
                                    bool = Boolean.valueOf(Theme.dialogs_namePaint[0].measureText(str) <= ((float) ((i4 - dp) - ((int) Math.ceil((double) Theme.dialogs_timePaint.measureText("00:00"))))));
                                    this.precalcEllipsized.put(str, bool);
                                }
                                int dp4 = AndroidUtilities.dp((!bool.booleanValue() ? 20 : 0) + 64);
                                if (Adapter.this.getArray().get(i7).topic.id == 1) {
                                    dp2 = dp4;
                                }
                                if (Adapter.this.getArray().get(i7).topic.hidden) {
                                    i5++;
                                }
                                i6 += dp4;
                            }
                        }
                        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(0, i5 > 0 ? (((TopicsFragment.this.recyclerListView.getMeasuredHeight() - TopicsFragment.this.recyclerListView.getPaddingTop()) - TopicsFragment.this.recyclerListView.getPaddingBottom()) - i6) + dp2 : 0), 1073741824));
                    }
                });
            } else {
                FlickerLoadingView flickerLoadingView = new FlickerLoadingView(viewGroup.getContext());
                flickerLoadingView.setViewType(24);
                flickerLoadingView.setIsSingleCell(true);
                flickerLoadingView.showDate(true);
                return new RecyclerListView.Holder(flickerLoadingView);
            }
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder.getItemViewType() == 0) {
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic = getArray().get(i).topic;
                int i2 = i + 1;
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic2 = i2 < getArray().size() ? getArray().get(i2).topic : null;
                TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                TLRPC$Message tLRPC$Message = tLRPC$TL_forumTopic.topMessage;
                TLRPC$TL_forumTopic tLRPC$TL_forumTopic3 = topicDialogCell.forumTopic;
                int i3 = tLRPC$TL_forumTopic3 == null ? 0 : tLRPC$TL_forumTopic3.id;
                int i4 = tLRPC$TL_forumTopic.id;
                boolean z = i3 == i4 && topicDialogCell.position == i && TopicsFragment.this.animatedUpdateEnabled;
                if (tLRPC$Message != null) {
                    MessageObject messageObject = new MessageObject(((BaseFragment) TopicsFragment.this).currentAccount, tLRPC$Message, false, false);
                    TopicsFragment topicsFragment = TopicsFragment.this;
                    topicDialogCell.setForumTopic(tLRPC$TL_forumTopic, -topicsFragment.chatId, messageObject, topicsFragment.isInPreviewMode(), z);
                    topicDialogCell.drawDivider = i != TopicsFragment.this.forumTopics.size() - 1 || TopicsFragment.this.recyclerListView.emptyViewIsVisible();
                    boolean z2 = tLRPC$TL_forumTopic.pinned;
                    topicDialogCell.fullSeparator = z2 && (tLRPC$TL_forumTopic2 == null || !tLRPC$TL_forumTopic2.pinned);
                    topicDialogCell.setPinForced(z2 && !tLRPC$TL_forumTopic.hidden);
                    topicDialogCell.position = i;
                }
                topicDialogCell.setTopicIcon(tLRPC$TL_forumTopic);
                topicDialogCell.setChecked(TopicsFragment.this.selectedTopics.contains(Integer.valueOf(i4)), z);
                topicDialogCell.setDialogSelected(TopicsFragment.this.selectedTopicForTablet == ((long) i4));
                topicDialogCell.onReorderStateChanged(TopicsFragment.this.reordering, true);
            }
        }

        @Override
        public int getItemCount() {
            return getArray().size() + 1;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        public void swapElements(int i, int i2) {
            if (TopicsFragment.this.forumTopicsListFrozen) {
                return;
            }
            ArrayList<Item> arrayList = TopicsFragment.this.forumTopics;
            arrayList.add(i2, arrayList.remove(i));
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
        private TLRPC$TL_forumTopic currentTopic;
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
        public void onDraw(Canvas canvas) {
            PullForegroundDrawable pullForegroundDrawable;
            CheckBox2 checkBox2;
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
                int dp = this.fullSeparator ? 0 : AndroidUtilities.dp(this.messagePaddingStart);
                if (LocaleController.isRTL) {
                    canvas.drawLine(0.0f - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth() - dp, getMeasuredHeight() - 1, Theme.dividerPaint);
                } else {
                    canvas.drawLine(dp - this.translationX, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight() - 1, Theme.dividerPaint);
                }
            }
            if ((!this.isGeneral || (pullForegroundDrawable = this.archivedChatsDrawable) == null || pullForegroundDrawable.outProgress != 0.0f) && (this.animatedEmojiDrawable != null || this.forumIcon != null)) {
                int dp2 = AndroidUtilities.dp(10.0f);
                int dp3 = AndroidUtilities.dp(10.0f);
                int dp4 = AndroidUtilities.dp(28.0f);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable != null) {
                    if (LocaleController.isRTL) {
                        animatedEmojiDrawable.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                    } else {
                        animatedEmojiDrawable.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
                    }
                    this.animatedEmojiDrawable.draw(canvas);
                } else {
                    if (LocaleController.isRTL) {
                        this.forumIcon.setBounds((getWidth() - dp2) - dp4, dp3, getWidth() - dp2, dp4 + dp3);
                    } else {
                        this.forumIcon.setBounds(dp2, dp3, dp2 + dp4, dp4 + dp3);
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
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.attached = true;
            AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
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

        public void setTopicIcon(TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            this.currentTopic = tLRPC$TL_forumTopic;
            boolean z = false;
            this.closed = tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.closed;
            if (this.inPreviewMode) {
                updateHidden(tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.hidden, true);
            }
            this.isGeneral = tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.id == 1;
            if (tLRPC$TL_forumTopic != null && this != TopicsFragment.this.generalTopicViewMoving) {
                if (tLRPC$TL_forumTopic.hidden) {
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
            if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.id == 1) {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createGeneralTopicDrawable(getContext(), 1.0f, TopicsFragment.this.getThemedColor(Theme.key_chat_inMenu), false));
            } else if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.icon_emoji_id != 0) {
                setForumIcon(null);
                AnimatedEmojiDrawable animatedEmojiDrawable = this.animatedEmojiDrawable;
                if (animatedEmojiDrawable == null || animatedEmojiDrawable.getDocumentId() != tLRPC$TL_forumTopic.icon_emoji_id) {
                    setAnimatedEmojiDrawable(new AnimatedEmojiDrawable(TopicsFragment.this.openedForForward ? 13 : 10, ((BaseFragment) TopicsFragment.this).currentAccount, tLRPC$TL_forumTopic.icon_emoji_id));
                }
            } else {
                setAnimatedEmojiDrawable(null);
                setForumIcon(ForumUtilities.createTopicDrawable(tLRPC$TL_forumTopic, false));
            }
            if (tLRPC$TL_forumTopic != null && tLRPC$TL_forumTopic.hidden) {
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
                float[] fArr = new float[2];
                fArr[0] = this.hiddenT;
                fArr[1] = z ? 1.0f : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.hiddenAnimator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        TopicsFragment.TopicDialogCell.this.lambda$updateHidden$0(valueAnimator2);
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
            if (drawableArr != null && (drawableArr[0] instanceof ForumUtilities.GeneralTopicDrawable)) {
                ((ForumUtilities.GeneralTopicDrawable) drawableArr[0]).setColor(ColorUtils.blendARGB(TopicsFragment.this.getThemedColor(Theme.key_chats_archivePullDownBackground), TopicsFragment.this.getThemedColor(Theme.key_avatar_background2Saved), this.hiddenT));
            }
            invalidate();
        }

        @Override
        protected boolean drawLock2() {
            return this.closed;
        }
    }

    public void hideFloatingButton(boolean z, boolean z2) {
        if (this.floatingHidden == z) {
            return;
        }
        this.floatingHidden = z;
        if (this.fragmentBeginToShow && z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            float[] fArr = new float[2];
            fArr[0] = this.floatingButtonHideProgress;
            fArr[1] = this.floatingHidden ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    TopicsFragment.this.lambda$hideFloatingButton$20(valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(this.floatingInterpolator);
            animatorSet.start();
        } else {
            this.floatingButtonHideProgress = z ? 1.0f : 0.0f;
            updateFloatingButtonOffset();
        }
        this.floatingButtonContainer.setClickable(!z);
    }

    public void lambda$hideFloatingButton$20(ValueAnimator valueAnimator) {
        this.floatingButtonHideProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        updateFloatingButtonOffset();
    }

    private void updateFloatingButtonOffset() {
        float dp = (AndroidUtilities.dp(100.0f) * this.floatingButtonHideProgress) - this.transitionPadding;
        this.floatingButtonTranslation = dp;
        this.floatingButtonContainer.setTranslationY(dp);
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

        public EmptyViewContainer(TopicsFragment topicsFragment, Context context) {
            super(context);
            SpannableStringBuilder spannableStringBuilder;
            this.textView = new TextView(context);
            if (LocaleController.isRTL) {
                spannableStringBuilder = new SpannableStringBuilder("  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.attach_arrow_left), 0, 1, 0);
                spannableStringBuilder.append((CharSequence) LocaleController.getString("TapToCreateTopicHint", R.string.TapToCreateTopicHint));
            } else {
                spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("TapToCreateTopicHint", R.string.TapToCreateTopicHint));
                spannableStringBuilder.append((CharSequence) "  ");
                spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.arrow_newchat), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 0);
            }
            this.textView.setText(spannableStringBuilder);
            this.textView.setTextSize(1, 14.0f);
            this.textView.setLayerType(2, null);
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, topicsFragment.getResourceProvider()));
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
        int color = Theme.getColor(this.searching ? Theme.key_windowBackgroundWhite : Theme.key_actionBarDefault);
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }

    public class MessagesSearchContainer extends ViewPagerFixed implements FilteredSearchView.UiCallback {
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
        ArrayList<MessageObject> searchResultMessages;
        ArrayList<TLRPC$TL_forumTopic> searchResultTopics;
        Runnable searchRunnable;
        String searchString;
        private ArrayList<MessageObject> selectedItems;
        int topicsEndRow;
        int topicsHeaderRow;
        int topicsStartRow;
        private ViewPagerAdapter viewPagerAdapter;

        public MessagesSearchContainer(Context context) {
            super(context);
            this.searchString = "empty";
            this.searchResultTopics = new ArrayList<>();
            this.searchResultMessages = new ArrayList<>();
            this.selectedItems = new ArrayList<>();
            this.searchContainer = new FrameLayout(context);
            this.chatPreviewDelegate = new SearchViewPager.ChatPreviewDelegate(TopicsFragment.this) {
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
                    TopicsFragment.MessagesSearchContainer.this.lambda$new$0(view, i);
                }
            });
            this.recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener(TopicsFragment.this) {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    super.onScrolled(recyclerView, i, i2);
                    MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                    if (messagesSearchContainer.canLoadMore) {
                        int findLastVisibleItemPosition = messagesSearchContainer.layoutManager.findLastVisibleItemPosition() + 5;
                        MessagesSearchContainer messagesSearchContainer2 = MessagesSearchContainer.this;
                        if (findLastVisibleItemPosition >= messagesSearchContainer2.rowCount) {
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
            stickerEmptyView.title.setText(LocaleController.getString("NoResult", R.string.NoResult));
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

        public class Item {
            int filterIndex;
            private final int type;

            private Item(MessagesSearchContainer messagesSearchContainer, int i) {
                this.type = i;
            }
        }

        public class ViewPagerAdapter extends ViewPagerFixed.Adapter {
            ArrayList<Item> items;

            public ViewPagerAdapter() {
                ArrayList<Item> arrayList = new ArrayList<>();
                this.items = arrayList;
                arrayList.add(new Item(0));
                Item item = new Item(2);
                item.filterIndex = 0;
                this.items.add(item);
                Item item2 = new Item(2);
                item2.filterIndex = 1;
                this.items.add(item2);
                Item item3 = new Item(2);
                item3.filterIndex = 2;
                this.items.add(item3);
                Item item4 = new Item(2);
                item4.filterIndex = 3;
                this.items.add(item4);
                Item item5 = new Item(2);
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
                    searchDownloadsContainer.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
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
                filteredSearchView.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener(this) {
                    @Override
                    public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                        super.onScrolled(recyclerView, i2, i3);
                    }
                });
                return filteredSearchView;
            }

            @Override
            public String getItemTitle(int i) {
                if (this.items.get(i).type != 0) {
                    if (this.items.get(i).type == 1) {
                        return LocaleController.getString("DownloadsTabs", R.string.DownloadsTabs);
                    }
                    return FiltersView.filters[this.items.get(i).filterIndex].getTitle();
                }
                return LocaleController.getString("SearchMessages", R.string.SearchMessages);
            }

            @Override
            public int getItemViewType(int i) {
                if (this.items.get(i).type == 0) {
                    return 1;
                }
                if (this.items.get(i).type == 1) {
                    return 2;
                }
                return this.items.get(i).type + i;
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
                TLRPC$Chat chat = AccountInstance.getInstance(((BaseFragment) TopicsFragment.this).currentAccount).getMessagesController().getChat(Long.valueOf(-dialogId));
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
                MessageObject messageObject = this.selectedItems.get(i);
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
            } else if (view instanceof FilteredSearchView) {
                FilteredSearchView filteredSearchView = (FilteredSearchView) view;
                filteredSearchView.setKeyboardHeight(this.keyboardSize, false);
                filteredSearchView.search(-TopicsFragment.this.chatId, 0L, 0L, FiltersView.filters[this.viewPagerAdapter.items.get(i).filterIndex], false, str, z);
            } else if (view instanceof SearchDownloadsContainer) {
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
                    if (TopicsFragment.this.forumTopics.get(i).topic != null) {
                        this.searchResultTopics.add(TopicsFragment.this.forumTopics.get(i).topic);
                        TopicsFragment.this.forumTopics.get(i).topic.searchQuery = null;
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
                    TopicsFragment.MessagesSearchContainer.this.lambda$searchMessages$1(str);
                }
            };
            this.searchRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 200L);
        }

        public void lambda$searchMessages$1(String str) {
            String lowerCase = str.trim().toLowerCase();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < TopicsFragment.this.forumTopics.size(); i++) {
                if (TopicsFragment.this.forumTopics.get(i).topic != null && TopicsFragment.this.forumTopics.get(i).topic.title.toLowerCase().contains(lowerCase)) {
                    arrayList.add(TopicsFragment.this.forumTopics.get(i).topic);
                    TopicsFragment.this.forumTopics.get(i).topic.searchQuery = lowerCase;
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
            TLRPC$TL_messages_search tLRPC$TL_messages_search = new TLRPC$TL_messages_search();
            tLRPC$TL_messages_search.peer = TopicsFragment.this.getMessagesController().getInputPeer(-TopicsFragment.this.chatId);
            tLRPC$TL_messages_search.filter = new TLRPC$TL_inputMessagesFilterEmpty();
            tLRPC$TL_messages_search.limit = 20;
            tLRPC$TL_messages_search.q = str;
            if (!this.searchResultMessages.isEmpty()) {
                ArrayList<MessageObject> arrayList = this.searchResultMessages;
                tLRPC$TL_messages_search.offset_id = arrayList.get(arrayList.size() - 1).getId();
            }
            this.messagesIsLoading = true;
            ConnectionsManager.getInstance(((BaseFragment) TopicsFragment.this).currentAccount).sendRequest(tLRPC$TL_messages_search, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TopicsFragment.MessagesSearchContainer.this.lambda$loadMessages$3(str, tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$loadMessages$3(final String str, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TopicsFragment.MessagesSearchContainer.this.lambda$loadMessages$2(str, tLObject);
                }
            });
        }

        public void lambda$loadMessages$2(String str, TLObject tLObject) {
            if (str.equals(this.searchString)) {
                int i = this.rowCount;
                boolean z = false;
                this.messagesIsLoading = false;
                this.isLoading = false;
                if (tLObject instanceof TLRPC$messages_Messages) {
                    TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
                    for (int i2 = 0; i2 < tLRPC$messages_Messages.messages.size(); i2++) {
                        MessageObject messageObject = new MessageObject(((BaseFragment) TopicsFragment.this).currentAccount, tLRPC$messages_Messages.messages.get(i2), false, false);
                        messageObject.setQuery(str);
                        this.searchResultMessages.add(messageObject);
                    }
                    updateRows();
                    if (this.searchResultMessages.size() < tLRPC$messages_Messages.count && !tLRPC$messages_Messages.messages.isEmpty()) {
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

        public class SearchAdapter extends RecyclerListView.SelectionAdapter {
            private SearchAdapter() {
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                FrameLayout frameLayout;
                if (i == 1) {
                    frameLayout = new GraySectionCell(viewGroup.getContext());
                } else if (i == 2) {
                    frameLayout = new TopicSearchCell(viewGroup.getContext());
                } else if (i == 3) {
                    ?? topicDialogCell = new TopicDialogCell(null, viewGroup.getContext(), false, true);
                    topicDialogCell.inPreviewMode = ((BaseFragment) TopicsFragment.this).inPreviewMode;
                    frameLayout = topicDialogCell;
                } else {
                    throw new RuntimeException("unsupported view type");
                }
                frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(frameLayout);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (getItemViewType(i) == 1) {
                    GraySectionCell graySectionCell = (GraySectionCell) viewHolder.itemView;
                    if (i == MessagesSearchContainer.this.topicsHeaderRow) {
                        graySectionCell.setText(LocaleController.getString("Topics", R.string.Topics));
                    }
                    if (i == MessagesSearchContainer.this.messagesHeaderRow) {
                        graySectionCell.setText(LocaleController.getString("SearchMessages", R.string.SearchMessages));
                    }
                }
                if (getItemViewType(i) == 2) {
                    MessagesSearchContainer messagesSearchContainer = MessagesSearchContainer.this;
                    TopicSearchCell topicSearchCell = (TopicSearchCell) viewHolder.itemView;
                    topicSearchCell.setTopic(messagesSearchContainer.searchResultTopics.get(i - messagesSearchContainer.topicsStartRow));
                    topicSearchCell.drawDivider = i != MessagesSearchContainer.this.topicsEndRow - 1;
                }
                if (getItemViewType(i) == 3) {
                    MessagesSearchContainer messagesSearchContainer2 = MessagesSearchContainer.this;
                    MessageObject messageObject = messagesSearchContainer2.searchResultMessages.get(i - messagesSearchContainer2.messagesStartRow);
                    TopicDialogCell topicDialogCell = (TopicDialogCell) viewHolder.itemView;
                    MessagesSearchContainer messagesSearchContainer3 = MessagesSearchContainer.this;
                    topicDialogCell.drawDivider = i != messagesSearchContainer3.messagesEndRow - 1;
                    long topicId = MessageObject.getTopicId(((BaseFragment) TopicsFragment.this).currentAccount, messageObject.messageOwner, true);
                    if (topicId == 0) {
                        topicId = 1;
                    }
                    TLRPC$TL_forumTopic findTopic = TopicsFragment.this.topicsController.findTopic(TopicsFragment.this.chatId, topicId);
                    if (findTopic == null) {
                        FileLog.d("cant find topic " + topicId);
                        return;
                    }
                    topicDialogCell.setForumTopic(findTopic, messageObject.getDialogId(), messageObject, false, false);
                    topicDialogCell.setTopicIcon(findTopic);
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
            return;
        }
        this.slideBackTransitionAnimator = null;
        this.isSlideBackTransition = false;
        setFragmentIsSliding(false);
        setSlideTransitionProgress(1.0f);
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
            this.topView.setPivotX(0.0f);
            this.topView.setPivotY(0.0f);
            this.topView.setScaleX(f2);
            this.topView.setScaleY(f2);
            this.actionBar.setPivotX(0.0f);
            this.actionBar.setPivotY(0.0f);
            this.actionBar.setScaleX(f2);
            this.actionBar.setScaleY(f2);
        }
    }

    @Override
    public void onTransitionAnimationStart(boolean z, boolean z2) {
        super.onTransitionAnimationStart(z, z2);
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
        this.notificationsLocker.unlock();
        if (z) {
            return;
        }
        if (this.opnendForSelect && this.removeFragmentOnTransitionEnd) {
            removeSelfFromStack();
            DialogsActivity dialogsActivity = this.dialogsActivity;
            if (dialogsActivity != null) {
                dialogsActivity.removeSelfFromStack();
            }
        } else if (this.finishDialogRightSlidingPreviewOnTransitionEnd) {
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
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.parentLayout.getView().draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        if (this.blurredView.getParent() != null) {
            ((ViewGroup) this.blurredView.getParent()).removeView(this.blurredView);
        }
        this.parentLayout.getOverlayContainerView().addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
    }

    @Override
    public boolean onBackPressed() {
        if (!this.selectedTopics.isEmpty()) {
            clearSelectedTopics();
            return false;
        } else if (this.searching) {
            this.actionBar.onSearchFieldVisibilityChanged(this.searchItem.toggleSearch(false));
            return false;
        } else {
            return super.onBackPressed();
        }
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

    public class Item extends AdapterWithDiffUtils.Item {
        TLRPC$TL_forumTopic topic;

        public Item(TopicsFragment topicsFragment, int i, TLRPC$TL_forumTopic tLRPC$TL_forumTopic) {
            super(i, true);
            this.topic = tLRPC$TL_forumTopic;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Item.class == obj.getClass()) {
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
            this.actionBar.getBackButton().setAlpha(f != 1.0f ? 0.0f : 1.0f);
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
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        RecyclerListView recyclerListView;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                TopicsFragment.this.lambda$getThemeDescriptions$21();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
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

    public void lambda$getThemeDescriptions$21() {
        for (int i = 0; i < 2; i++) {
            ViewGroup viewGroup = null;
            if (i == 0) {
                viewGroup = this.recyclerListView;
            } else {
                MessagesSearchContainer messagesSearchContainer = this.searchContainer;
                if (messagesSearchContainer != null) {
                    viewGroup = messagesSearchContainer.recyclerView;
                }
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
            actionBar.setPopupBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuBackground), true);
            this.actionBar.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem), false, true);
            this.actionBar.setPopupItemsColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon), true, true);
            this.actionBar.setPopupItemsSelectorColor(Theme.getColor(Theme.key_dialogButtonSelector), true);
        }
        View view = this.blurredView;
        if (view != null && Build.VERSION.SDK_INT >= 23) {
            view.setForeground(new ColorDrawable(ColorUtils.setAlphaComponent(getThemedColor(Theme.key_windowBackgroundWhite), 100)));
        }
        updateColors();
    }
}
