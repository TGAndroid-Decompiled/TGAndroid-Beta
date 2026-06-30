package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.FBool;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.SearchTextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.MenuDrawable;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.ActiveGiftAuctionsHintCell;
import org.telegram.ui.Cells.AnimatedStatusView;
import org.telegram.ui.Cells.ArchiveHintInnerCell;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HashtagSearchCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.HintDialogCell;
import org.telegram.ui.Cells.LoadingCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RequestPeerRequirementsCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.UnconfirmedAuthHintCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.ArchiveHelp;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsActivityStatusLayout;
import org.telegram.ui.Components.DialogsActivityTopBubblesFadeView;
import org.telegram.ui.Components.DialogsActivityTopPanelLayout;
import org.telegram.ui.Components.DialogsItemAnimator;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.ForegroundColorSpanThemable;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MediaActivity;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PacmanAnimation;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.boosts.UserSelectorBottomSheet;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.RenderNodeWithHash;
import org.telegram.ui.Components.blur3.capture.IBlur3Capture;
import org.telegram.ui.Components.blur3.capture.IBlur3Hash;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.blur3.utils.Blur3Utils;
import org.telegram.ui.Components.chat.ChatInputViewsContainer;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.chat.layouts.ChatActivityFadeView;
import org.telegram.ui.Components.inset.WindowInsetsStateHolder;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.FilteredSearchView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.GroupCreateFinalActivity;
import org.telegram.ui.MainTabsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StealthModeAlert;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.UserListPoller;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.community.CommunityEditActivity;
import org.telegram.ui.community.CommunityPendingRequestsActivity;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.cells.CommunityRequestsCell;

public class DialogsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, FloatingDebugProvider, FactorAnimator.Target, MainTabsActivity.TabFragmentDelegate {
    public static boolean switchingTheme;
    private final String ACTION_MODE_SEARCH_DIALOGS_TAG;
    private final int ADDITIONAL_LIST_HEIGHT_DP;
    public final Property SCROLL_Y;
    public final Property SEARCH_TRANSLATION_Y;
    private ValueAnimator actionBarColorAnimator;
    private final Paint actionBarDefaultPaint;
    private int actionModeAdditionalHeight;
    private ImageView actionModeCloseView;
    private boolean actionModeFullyShowed;
    private final ArrayList actionModeViews;
    private ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell;
    private ButtonWithCounterView addChatsToCommunityButton;
    private ActionBarMenuSubItem addToFolderItem;
    private String addToGroupAlertString;
    private int additionFloatingButtonOffset;
    private int additionNavigationBarHeight;
    private float additionalFloatingTranslation;
    private float additionalOffset;
    private boolean afterSignup;
    public boolean allowBots;
    public boolean allowChannels;
    private boolean allowGlobalSearch;
    public boolean allowGroups;
    public boolean allowLegacyGroups;
    public boolean allowMegagroups;
    private boolean allowMoving;
    private boolean allowSwipeDuringCurrentTouch;
    private boolean allowSwitchAccount;
    public boolean allowUsers;
    private boolean animateToHasStories;
    private AnimatedStatusView animatedStatusView;
    private boolean animatingForward;
    private final BoolAnimator animatorActionModeVisible;
    private final BoolAnimator animatorDoneButtonVisible;
    private final BoolAnimator animatorFilterTabsVisible;
    private final BoolAnimator animatorForwardButtonVisible;
    private final BoolAnimator animatorSearchButtonVisible;
    private final BoolAnimator animatorSearchFilterTabsVisible;
    private final BoolAnimator animatorSearchVisible;
    private final BoolAnimator animatorShadowVisible;
    private final BoolAnimator animatorSpeedButtonVisible;
    private ActionBarMenuItem archive2Item;
    private ActionBarMenuSubItem archiveItem;
    private boolean askAboutContacts;
    private boolean askingForPermissions;
    private UnconfirmedAuthHintCell authHintCell;
    private TLRPC.FileLocation avatar;
    private TLRPC.FileLocation avatarBig;
    private ChatAvatarContainer avatarContainer;
    private int avatarUploadingRequest;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private ActionBarMenuSubItem blockItem;
    private View blurredView;
    private ArrayList botShareDialogs;
    private Long cacheSize;
    private int canClearCacheCount;
    private boolean canDeletePsaSelected;
    private int canMuteCount;
    private int canPinCount;
    private int canReadCount;
    private int canReportSpamCount;
    private boolean canSelectTopics;
    private boolean canShowFilterTabsView;
    private boolean canShowHiddenArchive;
    private boolean canShowStoryHint;
    private int canUnarchiveCount;
    private int canUnmuteCount;
    private boolean cantSendToChannels;
    private FrameLayout chatInputBubbleContainer;
    private FrameLayout chatInputInAppContainer;
    private ChatInputViewsContainer chatInputViewsContainer;
    private boolean checkCanWrite;
    private boolean checkPermission;
    private boolean checkingImportDialog;
    private ActionBarMenuSubItem clearItem;
    private boolean closeFragment;
    private boolean closeSearchFieldOnHide;
    private ChatActivityEnterView commentView;
    private TLRPC.Chat community;
    private AvatarDrawable communityAvatarDrawable;
    private BackupImageView communityAvatarImage;
    private ChatActivityFadeView communityBottomFadeView;
    private TLRPC.ChatFull communityFull;
    private long communityId;
    private CommunityRequestsCell communityPendingRequests;
    private float contactsAlpha;
    private ValueAnimator contactsAlphaAnimator;
    private int currentConnectionState;
    View databaseMigrationHint;
    private int debugLastUpdateAction;
    private DialogsActivityDelegate delegate;
    private ActionBarMenuItem deleteItem;
    private Long deviceSize;
    public DialogStoriesCell dialogStoriesCell;
    public boolean dialogStoriesCellVisible;
    private DialogsActivityStatusLayout dialogsActivityStatusLayout;
    private DialogsHintCell dialogsHintCell;
    private boolean dialogsListFrozen;
    private boolean disableActionBarScrolling;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimator;
    private DownloadProgressIcon downloadProgressIcon;
    private ActionBarMenuItem downloadsItem;
    private boolean downloadsItemVisible;
    private ItemOptions filterOptions;
    private FilterTabsView filterTabsView;
    private FiltersView filtersView;
    private boolean fixScrollYAfterArchiveOpened;
    private FragmentFloatingButton floatingButton3;
    boolean floatingButtonHidden;
    private float floatingButtonPanOffset;
    private FragmentFloatingButton floatingButtonStories;
    private boolean floatingForceVisible;
    private int folderId;
    private int forumCount;
    public long forwardOriginalChannel;
    private FragmentContextView fragmentContextView;
    private FrameLayout fragmentContextViewWrapper;
    private FragmentContextView fragmentLocationContextView;
    private FrameLayout fragmentLocationContextViewWrapper;
    private FragmentSearchField fragmentSearchField;
    private SearchTextWatcher fragmentSearchFieldWatcher;
    private ArrayList frozenDialogsList;
    private NotificationCenter.ObserversGroup globalObserversGroup;
    private boolean hasInvoice;
    public boolean hasMainTabs;
    public boolean hasOnlySlefStories;
    private int hasPoll;
    public boolean hasStories;
    private IBlur3Capture iBlur3Capture;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryBlur;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFade;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryFrostedLiquidGlass;
    private final BlurredBackgroundDrawableViewFactory iBlur3FactoryLiquidGlass;
    private final RectF iBlur3PositionActionBar;
    private final RectF iBlur3PositionMainTabs;
    private final ArrayList iBlur3Positions;
    private final BlurredBackgroundSourceColor iBlur3SourceColor;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlass;
    private final BlurredBackgroundSourceRenderNode iBlur3SourceGlassFrosted;
    private ImageUpdater imageUpdater;
    private int imeInsetHeight;
    private int initialDialogsType;
    private String initialSearchString;
    private int initialSearchType;
    private boolean invalidateScrollY;
    private boolean isPremiumHintUpgrade;
    public boolean isQuote;
    public boolean isReplyTo;
    boolean isSlideBackTransition;
    private Drawable logoDrawable;
    private MainTabsActivityController mainTabsActivityController;
    private int maximumVelocity;
    private boolean maybeStartTracking;
    private int messagesCount;
    private ArrayList movingDialogFilters;
    private DialogCell movingView;
    private boolean movingWas;
    private ActionBarMenuItem muteItem;
    private int navigationBarHeight;
    private AnimationNotificationsLocker notificationsLocker;
    public boolean notify;
    private NotificationCenter.ObserversGroup observersGroup;
    private boolean onlySelect;
    private MessagesStorage.TopicKey openedDialogId;
    private ActionBarMenuItem optionsItem;
    private int otherwiseReloginDays;
    private PacmanAnimation pacmanAnimation;
    private Paint paint;
    float panTranslationY;
    private DialogsActivity parentForwardDialogFragment;
    private ActionBarMenuItem passcodeItem;
    private CharSequence pendingSharedCaption;
    private AlertDialog permissionDialog;
    private ActionBarMenuSubItem pin2Item;
    private ActionBarMenuItem pinItem;
    private Drawable premiumStar;
    private int prevPosition;
    private int prevTop;
    private float progressToActionMode;
    public float progressToDialogStoriesCell;
    public float progressToShowStories;
    private ProxyDrawable proxyDrawable;
    private ActionBarMenuSubItem proxyMenuSubItem;
    private ActionBarMenuSubItem readItem;
    private RectF rect;
    private ActionBarMenuSubItem removeFromFolderItem;
    public long replyMessageAuthor;
    private long requestPeerBotId;
    private TLRPC.RequestPeerType requestPeerType;
    public boolean resetDelegate;
    private boolean rightFragmentTransitionInProgress;
    private boolean rightFragmentTransitionIsOpen;
    public RightSlidingDialogContainer rightSlidingDialogContainer;
    public int scheduleDate;
    public int scheduleRepeatPeriod;
    private float scrollAdditionalOffset;
    private boolean scrollBarVisible;
    private boolean scrollUpdated;
    private float scrollYOffset;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private boolean scrollingManually;
    private float searchAnimationProgress;
    private AnimatorSet searchAnimator;
    private long searchDialogId;
    private boolean searchFiltersWasShowed;
    private boolean searchIsShowed;
    public ActionBarMenuItem searchItem;
    private TLObject searchObject;
    private String searchString;
    private SearchTabsAndFiltersLayout searchTabsAndFiltersLayout;
    private ViewPagerFixed.TabsView searchTabsView;
    private SearchViewPager searchViewPager;
    private int searchViewPagerIndex;
    float searchViewPagerTranslationY;
    private boolean searchWas;
    private boolean searchWasFullyShowed;
    private boolean searching;
    private String selectAlertString;
    private String selectAlertStringGroup;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private ArrayList selectedDialogs;
    private NumberTextView selectedDialogsCountTextView;
    private boolean shareHintStarted;
    private Runnable shareLinkSearchRunnable;
    private ShareTopView shareTopView;
    private String sharedLink;
    private ArrayList sharedMediaEntries;
    private SharedMediaLayout.SharedMediaPreloader sharedMediaPreloader;
    private CharSequence sharedTextSeed;
    private int shiftDp;
    private boolean showSetPasswordConfirm;
    private String showingSuggestion;
    final int slideAmplitudeDp;
    ValueAnimator slideBackTransitionAnimator;
    boolean slideFragmentLite;
    float slideFragmentProgress;
    private DialogCell slidingView;
    private boolean slowedReloadAfterDialogClick;
    private ActionBarMenuItem speedItem;
    private long startArchivePullingTime;
    private boolean startedTracking;
    private int statusBarHeight;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private Long statusDrawableGiftId;
    private Bulletin storiesBulletin;
    public boolean storiesEnabled;
    private float storiesOverscroll;
    private boolean storiesOverscrollCalled;
    ValueAnimator storiesVisibilityAnimator;
    ValueAnimator storiesVisibilityAnimator2;
    private float storiesYOffset;
    private HintView2 storyHint;
    private boolean storyHintShown;
    private HintView2 storyPremiumHint;
    private ActionBarMenuItem switchItem;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private float tabsYOffset;
    private TextPaint textPaint;
    private DialogsActivityTopBubblesFadeView topBubblesFadeView;
    private Bulletin topBulletin;
    private DialogsActivityTopPanelLayout topPanelLayout;
    private UndoView[] undoView;
    private int undoViewIndex;
    private boolean updatePullAfterScroll;
    private Bulletin uploadingAvatarBulletin;
    private ViewPage[] viewPages;
    private ViewPositionWatcher viewPositionWatcher;
    private boolean waitingForScrollFinished;
    private boolean wasDrawn;
    private boolean wasSelectedDialogsEmpty;
    public boolean whiteActionBar;
    private final WindowInsetsStateHolder windowInsetsStateHolder;
    private ChatActivityEnterView.SendButton writeButton;
    public static boolean[] dialogsLoaded = new boolean[4];
    private static final Interpolator interpolator = new Interpolator() {
        @Override
        public final float getInterpolation(float f) {
            return DialogsActivity.lambda$static$0(f);
        }
    };
    public static float viewOffset = 0.0f;

    public interface DialogsActivityDelegate {

        public abstract class CC {
            public static boolean $default$canSelectStories(DialogsActivityDelegate dialogsActivityDelegate) {
                return false;
            }

            public static boolean $default$didSelectStories(DialogsActivityDelegate dialogsActivityDelegate, DialogsActivity dialogsActivity) {
                return false;
            }
        }

        boolean canSelectStories();

        boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment);

        boolean didSelectStories(DialogsActivity dialogsActivity);
    }

    public static boolean lambda$createActionMode$77(View view, MotionEvent motionEvent) {
        return true;
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    @Override
    public boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public static void access$23000(DialogsActivity dialogsActivity) throws Resources.NotFoundException {
        dialogsActivity.updateSelectedCount();
    }

    static float access$4424(DialogsActivity dialogsActivity, float f) {
        float f2 = dialogsActivity.tabsYOffset - f;
        dialogsActivity.tabsYOffset = f2;
        return f2;
    }

    public MessagesStorage.TopicKey getOpenedDialogId() {
        return this.openedDialogId;
    }

    public class ViewPage extends FrameLayout {
        public boolean animateStoriesView;
        private DialogsAdapter animationSupportDialogsAdapter;
        private RecyclerListView animationSupportListView;
        private int archivePullViewState;
        private DialogsAdapter dialogsAdapter;
        private DialogsItemAnimator dialogsItemAnimator;
        private int dialogsType;
        private boolean isLocked;
        private ItemTouchHelper itemTouchhelper;
        private int lastItemsCount;
        private LinearLayoutManager layoutManager;
        public DialogsRecyclerView listView;
        public int pageAdditionalOffset;
        private FlickerLoadingView progressView;
        private PullForegroundDrawable pullForegroundDrawable;
        private RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        Runnable saveScrollPositionRunnable;
        private RecyclerAnimationScrollHelper scrollHelper;
        public RecyclerListViewScroller scroller;
        private int selectedType;
        private SwipeController swipeController;
        Runnable updateListRunnable;
        boolean updating;

        public ViewPage(Context context) {
            super(context);
            this.saveScrollPositionRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            };
            this.updateListRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$1();
                }
            };
        }

        public boolean isDefaultDialogType() {
            int i = this.dialogsType;
            return i == 0 || i == 7 || i == 8;
        }

        public void lambda$new$0() {
            DialogsRecyclerView dialogsRecyclerView = this.listView;
            if (dialogsRecyclerView == null || dialogsRecyclerView.getScrollState() != 0 || this.listView.getChildCount() <= 0 || this.listView.getLayoutManager() == null) {
                return;
            }
            int i = 1;
            boolean z = this.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive() && this.archivePullViewState == 2;
            float f = DialogsActivity.this.scrollYOffset;
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.listView.getLayoutManager();
            View view = null;
            int top = Integer.MAX_VALUE;
            int i2 = -1;
            for (int i3 = 0; i3 < this.listView.getChildCount(); i3++) {
                DialogsRecyclerView dialogsRecyclerView2 = this.listView;
                int childAdapterPosition = dialogsRecyclerView2.getChildAdapterPosition(dialogsRecyclerView2.getChildAt(i3));
                View childAt = this.listView.getChildAt(i3);
                if (childAdapterPosition != -1 && childAt != null && childAt.getTop() < top) {
                    top = childAt.getTop();
                    i2 = childAdapterPosition;
                    view = childAt;
                }
            }
            if (view != null) {
                float top2 = view.getTop() - this.listView.getPaddingTop();
                if (DialogsActivity.this.hasStories) {
                    f = 0.0f;
                }
                if (this.listView.getScrollState() != 1) {
                    if (z && i2 == 0 && ((this.listView.getPaddingTop() - view.getTop()) - view.getMeasuredHeight()) + f < 0.0f) {
                        top2 = f;
                    } else {
                        i = i2;
                    }
                    linearLayoutManager.scrollToPositionWithOffset(i, (int) top2);
                }
            }
        }

        public void lambda$new$1() {
            this.dialogsAdapter.updateList(this.saveScrollPositionRunnable);
            DialogsActivity.this.invalidateScrollY = true;
            DialogsRecyclerView dialogsRecyclerView = this.listView;
            dialogsRecyclerView.updateDialogsOnNextDraw = true;
            this.updating = false;
            dialogsRecyclerView.invalidate();
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                DialogsActivity.this.blur3_InvalidateBlur();
            }
            super.setTranslationY(f);
        }

        @Override
        public void setTranslationX(float f) {
            if (getTranslationX() != f) {
                super.setTranslationX(f);
                if (DialogsActivity.this.tabsAnimationInProgress && DialogsActivity.this.viewPages[0] == this) {
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, Math.abs(DialogsActivity.this.viewPages[0].getTranslationX()) / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                }
                DialogsActivity.this.blur3_InvalidateBlur();
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
            if (this.animateStoriesView) {
                layoutParams.bottomMargin = -AndroidUtilities.dp(85.0f);
            } else {
                layoutParams.bottomMargin = 0;
            }
            super.onMeasure(i, i2);
        }

        public void updateList(boolean z) {
            if (((BaseFragment) DialogsActivity.this).isPaused) {
                return;
            }
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(this.updateListRunnable);
                this.listView.setItemAnimator(this.dialogsItemAnimator);
                this.updateListRunnable.run();
            } else {
                if (this.updating) {
                    return;
                }
                this.updating = true;
                if (!this.dialogsItemAnimator.isRunning()) {
                    this.listView.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(this.updateListRunnable, 36L);
            }
        }
    }

    class ContentView extends SizeNotifierFrameLayout {
        private Paint actionBarSearchPaint;
        private Rect blurBounds;
        private int[] pos;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker velocityTracker;
        private boolean wasPortrait;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        @Override
        protected boolean invalidateOptimized() {
            return true;
        }

        public ContentView(Context context) {
            super(context);
            this.actionBarSearchPaint = new Paint(1);
            this.pos = new int[2];
            this.blurBounds = new Rect();
        }

        private boolean prepareForMoving(MotionEvent motionEvent, boolean z) {
            int nextPageId = DialogsActivity.this.filterTabsView.getNextPageId(z);
            if (nextPageId < 0) {
                return false;
            }
            getParent().requestDisallowInterceptTouchEvent(true);
            DialogsActivity.this.maybeStartTracking = false;
            DialogsActivity.this.startedTracking = true;
            this.startedTrackingX = (int) (motionEvent.getX() + DialogsActivity.this.additionalOffset);
            ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(false);
            DialogsActivity.this.filterTabsView.setEnabled(false);
            DialogsActivity.this.viewPages[1].selectedType = nextPageId;
            DialogsActivity.this.viewPages[1].setVisibility(0);
            DialogsActivity.this.animatingForward = z;
            DialogsActivity.this.showScrollbars(false);
            DialogsActivity.this.switchToCurrentSelectedMode(true);
            if (z) {
                DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth());
            } else {
                DialogsActivity.this.viewPages[1].setTranslationX(-DialogsActivity.this.viewPages[0].getMeasuredWidth());
            }
            return true;
        }

        @Override
        public void invalidateBlur() {
            super.invalidateBlur();
            DialogsActivity.this.blur3_InvalidateBlur();
        }

        public boolean checkTabsAnimationInProgress() {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.ContentView.checkTabsAnimationInProgress():boolean");
        }

        public int getActionBarFullHeight() {
            float height = ((BaseFragment) DialogsActivity.this).actionBar.getHeight();
            RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
            float f = (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) ? 0.0f : DialogsActivity.this.rightSlidingDialogContainer.openedProgress;
            if (DialogsActivity.this.hasStories) {
                height += AndroidUtilities.dp(81.0f) * (1.0f - DialogsActivity.this.searchAnimationProgress) * (1.0f - f) * (1.0f - DialogsActivity.this.progressToActionMode);
            }
            return (int) (height + DialogsActivity.this.storiesOverscroll + (AndroidUtilities.dp(48.0f) * (1.0f - DialogsActivity.this.progressToActionMode) * (1.0f - DialogsActivity.this.searchAnimationProgress) * (1.0f - f)));
        }

        public int getActionBarTop() {
            float f = DialogsActivity.this.scrollYOffset;
            RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
            return (int) ((-getY()) + (f * (1.0f - DialogsActivity.this.progressToActionMode) * (1.0f - ((rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) ? 0.0f : DialogsActivity.this.rightSlidingDialogContainer.openedProgress)) * (1.0f - DialogsActivity.this.searchAnimationProgress)));
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if (view == DialogsActivity.this.blurredView) {
                return true;
            }
            if (!SizeNotifierFrameLayout.drawingBlur) {
                if (view != DialogsActivity.this.viewPages[0] && ((DialogsActivity.this.viewPages.length <= 1 || view != DialogsActivity.this.viewPages[1]) && view != DialogsActivity.this.topPanelLayout && view != DialogsActivity.this.filterTabsView)) {
                    if (view == ((BaseFragment) DialogsActivity.this).actionBar && DialogsActivity.this.slideFragmentProgress != 1.0f) {
                        canvas.save();
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        if (dialogsActivity.slideFragmentLite) {
                            canvas.translate(AndroidUtilities.dp(40.0f) * (-1) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        } else {
                            float f = 1.0f - ((1.0f - dialogsActivity.slideFragmentProgress) * 0.05f);
                            canvas.translate((-AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                            canvas.scale(f, f, 0.0f, (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f));
                        }
                        boolean zDrawChild = super.drawChild(canvas, view, j);
                        canvas.restore();
                        return zDrawChild;
                    }
                    return super.drawChild(canvas, view, j);
                }
                canvas.save();
                if (view != DialogsActivity.this.topPanelLayout && view != DialogsActivity.this.filterTabsView) {
                    canvas.clipRect(0.0f, (-getY()) + getActionBarTop() + getActionBarFullHeight(), getMeasuredWidth(), getMeasuredHeight());
                }
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                float f2 = dialogsActivity2.slideFragmentProgress;
                if (f2 != 1.0f) {
                    if (dialogsActivity2.slideFragmentLite) {
                        canvas.translate(AndroidUtilities.dp(40.0f) * (-1) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                    } else {
                        float f3 = 1.0f - ((1.0f - f2) * 0.05f);
                        canvas.translate((-AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        canvas.scale(f3, f3, 0.0f, (-getY()) + DialogsActivity.this.scrollYOffset + getActionBarFullHeight());
                    }
                }
                boolean zDrawChild2 = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild2;
            }
            return super.drawChild(canvas, view, j);
        }

        @Override
        public void drawBlurRect(Canvas canvas, float f, Rect rect, Paint paint, boolean z) {
            if (Build.VERSION.SDK_INT >= 29 && SharedConfig.chatBlurEnabled() && DialogsActivity.this.iBlur3SourceGlassFrosted != null && BlurredBackgroundProviderImpl.checkBlurEnabled(((BaseFragment) DialogsActivity.this).currentAccount, ((BaseFragment) DialogsActivity.this).resourceProvider)) {
                int i = (((BaseFragment) DialogsActivity.this).resourceProvider == null ? Theme.isCurrentThemeDark() : ((BaseFragment) DialogsActivity.this).resourceProvider.isDark()) ? 178 : 216;
                canvas.save();
                canvas.translate(0.0f, -f);
                DialogsActivity.this.iBlur3SourceGlassFrosted.draw(canvas, rect.left, rect.top + f, rect.right, rect.bottom + f);
                canvas.restore();
                int alpha = paint.getAlpha();
                paint.setAlpha(i);
                canvas.drawRect(rect, paint);
                paint.setAlpha(alpha);
                return;
            }
            canvas.drawRect(rect, paint);
        }

        @Override
        protected void dispatchDraw(android.graphics.Canvas r17) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.ContentView.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            setMeasuredDimension(size, size2);
            if (DialogsActivity.this.doneItem != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DialogsActivity.this.doneItem.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = ActionBar.getCurrentActionBarHeight();
            }
            measureChildWithMargins(((BaseFragment) DialogsActivity.this).actionBar, i, 0, i2, 0);
            int iMeasureKeyboardHeight = measureKeyboardHeight();
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != null && childAt.getVisibility() != 8 && childAt != ((BaseFragment) DialogsActivity.this).actionBar) {
                    if (childAt instanceof DatabaseMigrationHint) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), (View.MeasureSpec.getSize(i2) + AndroidUtilities.dp(2.0f)) - ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight()), 1073741824));
                    } else if (!(childAt instanceof ViewPage)) {
                        if (childAt == DialogsActivity.this.searchViewPager) {
                            DialogsActivity.this.searchViewPager.setTranslationY(DialogsActivity.this.searchViewPagerTranslationY);
                            DialogsActivity.this.searchViewPager.postsSearchContainer.setKeyboardHeight(iMeasureKeyboardHeight);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2) + AndroidUtilities.dp(DialogsActivity.this.ADDITIONAL_LIST_HEIGHT_DP), 1073741824);
                            DialogsActivity.this.checkUi_searchPagesPaddings(true);
                            childAt.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                            AndroidUtilities.rectTmp2.set(0, (((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(DialogsActivity.this.ADDITIONAL_LIST_HEIGHT_DP)) - AndroidUtilities.dp(2.0f), childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                        } else if (DialogsActivity.this.commentView != null && DialogsActivity.this.commentView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), (size2 - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else if (childAt == DialogsActivity.this.rightSlidingDialogContainer) {
                            int size3 = View.MeasureSpec.getSize(i2);
                            DialogsActivity dialogsActivity = DialogsActivity.this;
                            int i4 = dialogsActivity.isSlideBackTransition ? (int) (size3 * 0.05f) : 0;
                            dialogsActivity.rightSlidingDialogContainer.setTransitionPaddingBottom(i4);
                            childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size3 + i4), 1073741824));
                        } else {
                            measureChildWithMargins(childAt, i, 0, i2, 0);
                        }
                    } else {
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int iDp = AndroidUtilities.dp(2.0f) + size2;
                        if (DialogsActivity.this.rightSlidingDialogContainer.hasFragment()) {
                            if (DialogsActivity.this.canShowFilterTabsView) {
                                iDp += AndroidUtilities.dp(50.0f);
                            }
                            if (DialogsActivity.this.hasStories) {
                                iDp += AndroidUtilities.dp(81.0f);
                            }
                            iDp += AndroidUtilities.dp(48.0f);
                        }
                        int i5 = iDp + DialogsActivity.this.actionModeAdditionalHeight;
                        if (DialogsActivity.this.actionBarColorAnimator == null) {
                            childAt.setTranslationY(0.0f);
                        }
                        int i6 = DialogsActivity.this.isSlideBackTransition ? (int) (i5 * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i6);
                        childAt.measure(iMakeMeasureSpec3, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), i5 + i6), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2.0f);
                    }
                }
            }
            if (z != this.wasPortrait) {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onMeasure$0();
                    }
                });
                this.wasPortrait = z;
            }
        }

        public void lambda$onMeasure$0() {
            if (DialogsActivity.this.selectAnimatedEmojiDialog != null) {
                DialogsActivity.this.selectAnimatedEmojiDialog.dismiss();
                DialogsActivity.this.selectAnimatedEmojiDialog = null;
            }
        }

        @Override
        protected void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.ContentView.onLayout(boolean, int, int, int, int):void");
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 1 || actionMasked == 3) && ((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                DialogsActivity.this.allowMoving = true;
            }
            if (checkTabsAnimationInProgress()) {
                return true;
            }
            return (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.isAnimatingIndicator()) || onTouchEvent(motionEvent);
        }

        @Override
        public void requestDisallowInterceptTouchEvent(boolean z) {
            if (DialogsActivity.this.maybeStartTracking && !DialogsActivity.this.startedTracking) {
                onTouchEvent(null);
            }
            super.requestDisallowInterceptTouchEvent(z);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            float xVelocity;
            float yVelocity;
            float measuredWidth;
            int measuredWidth2;
            if (((BaseFragment) DialogsActivity.this).parentLayout == null || DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.isEditing() || DialogsActivity.this.searching || DialogsActivity.this.rightSlidingDialogContainer.hasFragment() || ((BaseFragment) DialogsActivity.this).parentLayout.checkTransitionAnimation() || ((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode() || ((BaseFragment) DialogsActivity.this).parentLayout.isPreviewOpenAnimationInProgress() || !((motionEvent == null || DialogsActivity.this.startedTracking || (motionEvent.getY() > getActionBarTop() + getActionBarFullHeight() && (DialogsActivity.this.chatInputViewsContainer == null || DialogsActivity.this.chatInputViewsContainer.getVisibility() != 0 || motionEvent.getY() < DialogsActivity.this.chatInputViewsContainer.getY()))) && (DialogsActivity.this.initialDialogsType == 3 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 5 || (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 2 && DialogsActivity.this.viewPages[0] != null && (DialogsActivity.this.viewPages[0].dialogsAdapter.getDialogsType() == 7 || DialogsActivity.this.viewPages[0].dialogsAdapter.getDialogsType() == 8))))) {
                return false;
            }
            if (motionEvent != null) {
                if (this.velocityTracker == null) {
                    this.velocityTracker = VelocityTracker.obtain();
                }
                this.velocityTracker.addMovement(motionEvent);
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && checkTabsAnimationInProgress()) {
                DialogsActivity.this.startedTracking = true;
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                this.startedTrackingX = (int) motionEvent.getX();
                if (DialogsActivity.this.animatingForward) {
                    if (this.startedTrackingX >= DialogsActivity.this.viewPages[0].getMeasuredWidth() + DialogsActivity.this.viewPages[0].getTranslationX()) {
                        ViewPage viewPage = DialogsActivity.this.viewPages[0];
                        DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                        DialogsActivity.this.viewPages[1] = viewPage;
                        DialogsActivity.this.animatingForward = false;
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        dialogsActivity.additionalOffset = dialogsActivity.viewPages[0].getTranslationX();
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, DialogsActivity.this.additionalOffset / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        DialogsActivity.this.switchToCurrentSelectedMode(true);
                        DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                        DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                    } else {
                        DialogsActivity dialogsActivity2 = DialogsActivity.this;
                        dialogsActivity2.additionalOffset = dialogsActivity2.viewPages[0].getTranslationX();
                    }
                } else if (this.startedTrackingX < DialogsActivity.this.viewPages[1].getMeasuredWidth() + DialogsActivity.this.viewPages[1].getTranslationX()) {
                    ViewPage viewPage2 = DialogsActivity.this.viewPages[0];
                    DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                    DialogsActivity.this.viewPages[1] = viewPage2;
                    DialogsActivity.this.animatingForward = true;
                    DialogsActivity dialogsActivity3 = DialogsActivity.this;
                    dialogsActivity3.additionalOffset = dialogsActivity3.viewPages[0].getTranslationX();
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                    DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, (-DialogsActivity.this.additionalOffset) / DialogsActivity.this.viewPages[0].getMeasuredWidth());
                    DialogsActivity.this.switchToCurrentSelectedMode(true);
                    DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                    DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                } else {
                    DialogsActivity dialogsActivity4 = DialogsActivity.this;
                    dialogsActivity4.additionalOffset = dialogsActivity4.viewPages[0].getTranslationX();
                }
                DialogsActivity.this.tabsAnimation.removeAllListeners();
                DialogsActivity.this.tabsAnimation.cancel();
                DialogsActivity.this.tabsAnimationInProgress = false;
            } else if (motionEvent != null && motionEvent.getAction() == 0) {
                DialogsActivity.this.additionalOffset = 0.0f;
            }
            if (motionEvent != null && motionEvent.getAction() == 0 && !DialogsActivity.this.startedTracking && !DialogsActivity.this.maybeStartTracking && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                this.startedTrackingPointerId = motionEvent.getPointerId(0);
                DialogsActivity.this.maybeStartTracking = true;
                this.startedTrackingX = (int) motionEvent.getX();
                this.startedTrackingY = (int) motionEvent.getY();
                this.velocityTracker.clear();
            } else if (motionEvent != null && motionEvent.getAction() == 2 && motionEvent.getPointerId(0) == this.startedTrackingPointerId) {
                int x = (int) ((motionEvent.getX() - this.startedTrackingX) + DialogsActivity.this.additionalOffset);
                int iAbs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
                if (DialogsActivity.this.startedTracking && ((DialogsActivity.this.animatingForward && x > 0) || (!DialogsActivity.this.animatingForward && x < 0))) {
                    if (!prepareForMoving(motionEvent, x < 0)) {
                        DialogsActivity.this.maybeStartTracking = true;
                        DialogsActivity.this.startedTracking = false;
                        DialogsActivity.this.viewPages[0].setTranslationX(0.0f);
                        DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.animatingForward ? DialogsActivity.this.viewPages[0].getMeasuredWidth() : -DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, 0.0f);
                    }
                }
                if (!DialogsActivity.this.maybeStartTracking || DialogsActivity.this.startedTracking) {
                    if (DialogsActivity.this.startedTracking) {
                        DialogsActivity.this.viewPages[0].setTranslationX(x);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() + x);
                        } else {
                            DialogsActivity.this.viewPages[1].setTranslationX(x - DialogsActivity.this.viewPages[0].getMeasuredWidth());
                        }
                        float fAbs = Math.abs(x) / DialogsActivity.this.viewPages[0].getMeasuredWidth();
                        if (!DialogsActivity.this.viewPages[1].isLocked || fAbs <= 0.3f) {
                            DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, fAbs);
                        } else {
                            dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            DialogsActivity.this.filterTabsView.shakeLock(DialogsActivity.this.viewPages[1].selectedType);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$onTouchEvent$1();
                                }
                            }, 200L);
                            return false;
                        }
                    }
                } else {
                    float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                    int x2 = (int) (motionEvent.getX() - this.startedTrackingX);
                    if (Math.abs(x2) >= pixelsInCM && Math.abs(x2) > iAbs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                }
            } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                this.velocityTracker.computeCurrentVelocity(1000, DialogsActivity.this.maximumVelocity);
                if (motionEvent == null || motionEvent.getAction() == 3) {
                    xVelocity = 0.0f;
                    yVelocity = 0.0f;
                } else {
                    xVelocity = this.velocityTracker.getXVelocity();
                    yVelocity = this.velocityTracker.getYVelocity();
                    if (!DialogsActivity.this.startedTracking && Math.abs(xVelocity) >= 3000.0f && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                        prepareForMoving(motionEvent, xVelocity < 0.0f);
                    }
                }
                if (DialogsActivity.this.startedTracking) {
                    float x3 = DialogsActivity.this.viewPages[0].getX();
                    DialogsActivity.this.tabsAnimation = new AnimatorSet();
                    if (DialogsActivity.this.viewPages[1].isLocked) {
                        DialogsActivity.this.backAnimation = true;
                    } else if (DialogsActivity.this.additionalOffset == 0.0f) {
                        DialogsActivity.this.backAnimation = Math.abs(x3) < ((float) DialogsActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(xVelocity) < 3500.0f || Math.abs(xVelocity) < Math.abs(yVelocity));
                    } else if (Math.abs(xVelocity) <= 1500.0f) {
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity dialogsActivity5 = DialogsActivity.this;
                            dialogsActivity5.backAnimation = dialogsActivity5.viewPages[1].getX() > ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                        } else {
                            DialogsActivity dialogsActivity6 = DialogsActivity.this;
                            dialogsActivity6.backAnimation = dialogsActivity6.viewPages[0].getX() < ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                        }
                    } else {
                        DialogsActivity dialogsActivity7 = DialogsActivity.this;
                        dialogsActivity7.backAnimation = !dialogsActivity7.animatingForward ? xVelocity >= 0.0f : xVelocity <= 0.0f;
                    }
                    if (!DialogsActivity.this.backAnimation) {
                        measuredWidth = DialogsActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            AnimatorSet animatorSet = DialogsActivity.this.tabsAnimation;
                            ViewPage viewPage3 = DialogsActivity.this.viewPages[0];
                            Property property = View.TRANSLATION_X;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(viewPage3, (Property<ViewPage, Float>) property, -DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], (Property<ViewPage, Float>) property, 0.0f));
                        } else {
                            AnimatorSet animatorSet2 = DialogsActivity.this.tabsAnimation;
                            ViewPage viewPage4 = DialogsActivity.this.viewPages[0];
                            Property property2 = View.TRANSLATION_X;
                            animatorSet2.playTogether(ObjectAnimator.ofFloat(viewPage4, (Property<ViewPage, Float>) property2, DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], (Property<ViewPage, Float>) property2, 0.0f));
                        }
                    } else {
                        measuredWidth = Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            AnimatorSet animatorSet3 = DialogsActivity.this.tabsAnimation;
                            ViewPage viewPage5 = DialogsActivity.this.viewPages[0];
                            Property property3 = View.TRANSLATION_X;
                            animatorSet3.playTogether(ObjectAnimator.ofFloat(viewPage5, (Property<ViewPage, Float>) property3, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], (Property<ViewPage, Float>) property3, DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        } else {
                            AnimatorSet animatorSet4 = DialogsActivity.this.tabsAnimation;
                            ViewPage viewPage6 = DialogsActivity.this.viewPages[0];
                            Property property4 = View.TRANSLATION_X;
                            animatorSet4.playTogether(ObjectAnimator.ofFloat(viewPage6, (Property<ViewPage, Float>) property4, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], (Property<ViewPage, Float>) property4, -DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        }
                    }
                    DialogsActivity.this.tabsAnimation.setInterpolator(DialogsActivity.interpolator);
                    int measuredWidth3 = getMeasuredWidth();
                    float f = measuredWidth3 / 2;
                    float fDistanceInfluenceForSnapDuration = f + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f);
                    float fAbs2 = Math.abs(xVelocity);
                    if (fAbs2 > 0.0f) {
                        measuredWidth2 = Math.round(Math.abs(fDistanceInfluenceForSnapDuration / fAbs2) * 1000.0f) * 4;
                    } else {
                        measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                    }
                    DialogsActivity.this.tabsAnimation.setDuration(Math.max(150, Math.min(measuredWidth2, 600)));
                    DialogsActivity.this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            DialogsActivity.this.tabsAnimation = null;
                            if (!DialogsActivity.this.backAnimation) {
                                ViewPage viewPage7 = DialogsActivity.this.viewPages[0];
                                DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                                DialogsActivity.this.viewPages[1] = viewPage7;
                                DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                                DialogsActivity.this.updateCounters(false);
                                DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                                DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                            }
                            DialogsActivity.this.viewPages[1].setVisibility(8);
                            DialogsActivity.this.showScrollbars(true);
                            DialogsActivity.this.tabsAnimationInProgress = false;
                            DialogsActivity.this.maybeStartTracking = false;
                            ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(true);
                            DialogsActivity.this.filterTabsView.setEnabled(true);
                            DialogsActivity dialogsActivity8 = DialogsActivity.this;
                            dialogsActivity8.checkListLoad(dialogsActivity8.viewPages[0]);
                        }
                    });
                    DialogsActivity.this.tabsAnimation.start();
                    DialogsActivity.this.tabsAnimationInProgress = true;
                    DialogsActivity.this.startedTracking = false;
                } else {
                    DialogsActivity.this.maybeStartTracking = false;
                    ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(true);
                    DialogsActivity.this.filterTabsView.setEnabled(true);
                }
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.velocityTracker = null;
                }
            }
            return DialogsActivity.this.startedTracking;
        }

        public void lambda$onTouchEvent$1() {
            DialogsActivity.this.showDialog(new LimitReachedBottomSheet(DialogsActivity.this, getContext(), 3, ((BaseFragment) DialogsActivity.this).currentAccount, null));
        }

        @Override
        protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
            if (DialogsActivity.this.searchIsShowed && DialogsActivity.this.searchViewPager != null && DialogsActivity.this.searchViewPager.getVisibility() == 0) {
                DialogsActivity.this.searchViewPager.drawForBlur(canvas);
            }
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (DialogsActivity.this.statusDrawable != null) {
                DialogsActivity.this.statusDrawable.attach();
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (DialogsActivity.this.statusDrawable != null) {
                DialogsActivity.this.statusDrawable.detach();
            }
        }
    }

    public float getSearchFieldAdditionOffset() {
        return -AndroidUtilities.lerp(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f), this.animatorSearchVisible.getFloatValue());
    }

    public void updateStoriesViewAlpha(float f) {
        float f2;
        float f3;
        float fClamp = Utilities.clamp(this.searchAnimationProgress * 2.0f, 1.0f, 0.0f);
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        float f4 = (1.0f - this.progressToActionMode) * f * this.progressToDialogStoriesCell;
        float f5 = 1.0f - fClamp;
        dialogStoriesCell.setAlpha(f4 * f5);
        if (this.hasStories || this.animateToHasStories) {
            float fClamp2 = Utilities.clamp((-this.scrollYOffset) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f);
            if (this.progressToActionMode == 1.0f) {
                fClamp2 = 1.0f;
            }
            float fClamp3 = Utilities.clamp(fClamp2 / 0.5f, 1.0f, 0.0f);
            this.dialogStoriesCell.setClipTop(0);
            if (!this.hasStories && this.animateToHasStories) {
                this.dialogStoriesCell.setTranslationY((-AndroidUtilities.dp(81.0f)) - AndroidUtilities.dp(8.0f));
                this.dialogStoriesCell.setProgressToCollapse(1.0f);
                f3 = this.progressToDialogStoriesCell;
            } else {
                this.dialogStoriesCell.setTranslationY(((Math.max(this.scrollYOffset, -getMaxScrollYOffsetWithoutSearch()) + this.storiesYOffset) + (this.storiesOverscroll / 2.0f)) - AndroidUtilities.dp(8.0f));
                this.dialogStoriesCell.setProgressToCollapse(fClamp2, !this.rightSlidingDialogContainer.hasFragment());
                if (!this.animateToHasStories) {
                    f3 = this.progressToDialogStoriesCell;
                } else {
                    f2 = 1.0f - fClamp3;
                    this.actionBar.setTranslationY(0.0f);
                }
            }
            f2 = 1.0f - f3;
            this.actionBar.setTranslationY(0.0f);
        } else {
            if (this.hasOnlySlefStories) {
                this.dialogStoriesCell.setTranslationY(((-AndroidUtilities.dp(81.0f)) + Math.max(this.scrollYOffset, -getMaxScrollYOffsetWithoutSearch())) - AndroidUtilities.dp(8.0f));
                this.dialogStoriesCell.setProgressToCollapse(1.0f);
                DialogStoriesCell dialogStoriesCell2 = this.dialogStoriesCell;
                dialogStoriesCell2.setClipTop((int) (AndroidUtilities.statusBarHeight - dialogStoriesCell2.getY()));
            }
            f2 = 1.0f - this.progressToDialogStoriesCell;
            this.actionBar.setTranslationY(0.0f);
        }
        float f6 = f2 * f5;
        if (f6 != 1.0f) {
            this.actionBar.getTitlesContainer().setPivotY(AndroidUtilities.statusBarHeight);
            this.actionBar.getTitlesContainer().setPivotX(AndroidUtilities.dp(20.0f));
            float f7 = (0.6f * f6) + 0.4f;
            this.actionBar.getTitlesContainer().setScaleY(f7);
            this.actionBar.getTitlesContainer().setScaleX(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotX(0.0f);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setPivotY(-AndroidUtilities.dp(30.0f));
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(f7);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(f7);
            float f8 = f6 * (1.0f - this.progressToActionMode);
            this.actionBar.getTitlesContainer().setAlpha(f8);
            this.actionBar.getTitlesContainer().setVisibility(f8 > 0.0f ? 0 : 4);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f8);
            this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f8 <= 0.0f ? 4 : 0);
            return;
        }
        this.actionBar.getTitlesContainer().setScaleY(1.0f);
        this.actionBar.getTitlesContainer().setScaleX(1.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleY(1.0f);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setScaleX(1.0f);
        float f9 = 1.0f - this.progressToActionMode;
        this.actionBar.getTitlesContainer().setAlpha(f9);
        this.actionBar.getTitlesContainer().setVisibility(f9 > 0.0f ? 0 : 4);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setAlpha(f9);
        this.actionBar.getAdditionalSubTitleOverlayContainer().setVisibility(f9 <= 0.0f ? 4 : 0);
    }

    public class DialogsRecyclerView extends BlurredRecyclerView implements StoriesListPlaceProvider.ClippedView {
        public int additionalPadding;
        float animateFromSelectorPosition;
        boolean animateSwitchingSelector;
        private RecyclerListView animationSupportListView;
        LongSparseArray animationSupportViewsByDialogId;
        private int appliedPaddingTop;
        private boolean firstLayout;
        private boolean ignoreLayout;
        float lastDrawSelectorY;
        private int lastListPadding;
        private int lastTop;
        Paint paint;
        private final ViewPage parentPage;
        UserListPoller poller;
        RectF rectF;
        private float rightFragmentOpenedProgress;
        private Paint selectorPaint;
        float selectorPositionProgress;
        public boolean updateDialogsOnNextDraw;

        @Override
        protected boolean updateEmptyViewAnimated() {
            return true;
        }

        public DialogsRecyclerView(Context context, ViewPage viewPage) {
            super(context);
            this.firstLayout = true;
            this.paint = new Paint();
            this.rectF = new RectF();
            this.selectorPositionProgress = 1.0f;
            this.parentPage = viewPage;
            this.additionalClipBottom = AndroidUtilities.dp(200.0f);
        }

        public void prepareSelectorForAnimation() {
            this.selectorPositionProgress = 0.0f;
            this.animateFromSelectorPosition = this.lastDrawSelectorY;
            this.animateSwitchingSelector = this.rightFragmentOpenedProgress != 0.0f;
        }

        public void setViewsOffset(float f) {
            View viewFindViewByPosition;
            DialogsActivity.viewOffset = f;
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
            return DialogsActivity.viewOffset;
        }

        @Override
        protected int measureBlurTopPadding() {
            return AndroidUtilities.dp(48.0f);
        }

        @Override
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            view.setTranslationY(DialogsActivity.viewOffset);
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
            if (this.parentPage.pullForegroundDrawable != null && DialogsActivity.viewOffset != 0.0f) {
                int paddingTop = getPaddingTop();
                if (paddingTop != 0) {
                    canvas.save();
                    canvas.translate(0.0f, paddingTop);
                }
                this.parentPage.pullForegroundDrawable.drawOverScroll(canvas);
                if (paddingTop != 0) {
                    canvas.restore();
                }
            }
            super.onDraw(canvas);
        }

        @Override
        protected void dispatchDraw(android.graphics.Canvas r24) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.DialogsRecyclerView.dispatchDraw(android.graphics.Canvas):void");
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= getPaddingTop() + DialogsActivity.this.scrollYOffset) {
                return super.dispatchTouchEvent(motionEvent);
            }
            return false;
        }

        private boolean drawMovingViewsOverlayed() {
            return getItemAnimator() != null && getItemAnimator().isRunning();
        }

        @Override
        public boolean drawChild(Canvas canvas, View view, long j) {
            if (drawMovingViewsOverlayed() && (view instanceof DialogCell) && ((DialogCell) view).isMoving()) {
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

        @Override
        protected void onMeasure(int i, int i2) {
            int iFindFirstVisibleItemPosition = this.parentPage.layoutManager.findFirstVisibleItemPosition();
            if (iFindFirstVisibleItemPosition != -1 && this.parentPage.itemTouchhelper.isIdle() && !this.parentPage.layoutManager.hasPendingScrollPosition() && this.parentPage.listView.getScrollState() != 1) {
                RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                if (viewHolderFindViewHolderForAdapterPosition != null) {
                    int top = viewHolderFindViewHolderForAdapterPosition.itemView.getTop();
                    if (this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive() && this.parentPage.archivePullViewState == 2) {
                        iFindFirstVisibleItemPosition = Math.max(1, iFindFirstVisibleItemPosition);
                    }
                    this.ignoreLayout = true;
                    this.parentPage.layoutManager.scrollToPositionWithOffset(iFindFirstVisibleItemPosition, (int) ((top - this.lastListPadding) + DialogsActivity.this.scrollAdditionalOffset + this.parentPage.pageAdditionalOffset));
                    this.ignoreLayout = false;
                }
            } else if (iFindFirstVisibleItemPosition == -1 && this.firstLayout) {
                this.parentPage.layoutManager.scrollToPositionWithOffset((this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive()) ? 1 : 0, (int) DialogsActivity.this.scrollYOffset);
            }
            this.ignoreLayout = true;
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            DialogsActivity dialogsActivity = DialogsActivity.this;
            if (dialogsActivity.hasStories && !dialogsActivity.actionModeFullyShowed) {
                currentActionBarHeight += AndroidUtilities.dp(81.0f);
            }
            if (!DialogsActivity.this.actionModeFullyShowed) {
                currentActionBarHeight += AndroidUtilities.dp(48.0f);
            }
            this.additionalPadding = 0;
            float filterTabsVisibilityFactor = DialogsActivity.this.getFilterTabsVisibilityFactor(false);
            float totalVisibility = DialogsActivity.this.topPanelLayout != null ? DialogsActivity.this.topPanelLayout.getMetadata().getTotalVisibility() : 0.0f;
            int iDp = currentActionBarHeight + ((int) (AndroidUtilities.dp(50.0f) * filterTabsVisibilityFactor));
            this.additionalPadding += (int) (AndroidUtilities.dp(50.0f) * filterTabsVisibilityFactor);
            if (DialogsActivity.this.topPanelLayout != null) {
                int animatedHeightWithPadding = (int) DialogsActivity.this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.lerp(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(7.0f), filterTabsVisibilityFactor));
                iDp += animatedHeightWithPadding;
                this.additionalPadding += animatedHeightWithPadding;
            }
            int iDp2 = iDp - AndroidUtilities.dp(Math.max(filterTabsVisibilityFactor, totalVisibility) * 5.0f);
            this.additionalPadding -= AndroidUtilities.dp(Math.max(filterTabsVisibilityFactor, totalVisibility) * 5.0f);
            int iCalculateListViewPaddingBottom = DialogsActivity.this.calculateListViewPaddingBottom();
            if (iDp2 != this.topPadding || iCalculateListViewPaddingBottom != getPaddingBottom()) {
                setTopGlowOffset(iDp2);
                setPadding(0, iDp2, 0, iCalculateListViewPaddingBottom);
                if (DialogsActivity.this.hasStories) {
                    this.parentPage.progressView.setPaddingTop(iDp2 - AndroidUtilities.dp(81.0f));
                } else {
                    this.parentPage.progressView.setPaddingTop(iDp2);
                }
                for (int i3 = 0; i3 < getChildCount(); i3++) {
                    if (getChildAt(i3) instanceof DialogsAdapter.LastEmptyView) {
                        getChildAt(i3).requestLayout();
                    }
                }
            }
            this.ignoreLayout = false;
            if (this.firstLayout && DialogsActivity.this.getMessagesController().dialogsLoaded) {
                if (this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive()) {
                    this.ignoreLayout = true;
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(1, (int) DialogsActivity.this.scrollYOffset);
                    this.ignoreLayout = false;
                }
                this.firstLayout = false;
            }
            super.onMeasure(i, i2);
            if (DialogsActivity.this.onlySelect || this.appliedPaddingTop == iDp2 || DialogsActivity.this.viewPages == null || DialogsActivity.this.viewPages.length <= 1 || DialogsActivity.this.startedTracking) {
                return;
            }
            if ((DialogsActivity.this.tabsAnimation != null && DialogsActivity.this.tabsAnimation.isRunning()) || DialogsActivity.this.tabsAnimationInProgress || DialogsActivity.this.filterTabsView == null) {
                return;
            }
            DialogsActivity.this.filterTabsView.isAnimatingIndicator();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.lastListPadding = getPaddingTop();
            this.lastTop = i2;
            DialogsActivity.this.scrollAdditionalOffset = 0.0f;
            this.parentPage.pageAdditionalOffset = 0;
        }

        @Override
        public void requestLayout() {
            if (this.ignoreLayout) {
                return;
            }
            super.requestLayout();
        }

        public void toggleArchiveHidden(boolean z, DialogCell dialogCell) {
            SharedConfig.toggleArchiveHidden();
            UndoView undoView = DialogsActivity.this.getUndoView();
            if (SharedConfig.archiveHidden) {
                if (dialogCell != null) {
                    DialogsActivity.this.disableActionBarScrolling = true;
                    DialogsActivity.this.waitingForScrollFinished = true;
                    int measuredHeight = dialogCell.getMeasuredHeight() + (dialogCell.getTop() - getPaddingTop());
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    if (dialogsActivity.hasStories && !dialogsActivity.dialogStoriesCell.isExpanded()) {
                        DialogsActivity.this.fixScrollYAfterArchiveOpened = true;
                        measuredHeight += AndroidUtilities.dp(81.0f);
                    }
                    smoothScrollBy(0, measuredHeight, CubicBezierInterpolator.EASE_OUT);
                    if (z) {
                        DialogsActivity.this.updatePullAfterScroll = true;
                    } else {
                        updatePullState();
                    }
                }
                undoView.showWithAction(0L, 6, null, null);
                return;
            }
            undoView.showWithAction(0L, 7, null, null);
            updatePullState();
            if (!z || dialogCell == null) {
                return;
            }
            dialogCell.resetPinnedArchiveState();
            dialogCell.invalidate();
        }

        public void updatePullState() {
            this.parentPage.archivePullViewState = SharedConfig.archiveHidden ? 2 : 0;
            if (this.parentPage.pullForegroundDrawable != null) {
                this.parentPage.pullForegroundDrawable.setWillDraw(this.parentPage.archivePullViewState != 0);
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (this.fastScrollAnimationRunning || DialogsActivity.this.waitingForScrollFinished || DialogsActivity.this.rightFragmentTransitionInProgress) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                setOverScrollMode(0);
            }
            if ((action == 1 || action == 3) && !this.parentPage.itemTouchhelper.isIdle() && this.parentPage.swipeController.swipingFolder) {
                this.parentPage.swipeController.swipeFolderBack = true;
                if (this.parentPage.itemTouchhelper.checkHorizontalSwipe(null, 4) != 0 && this.parentPage.swipeController.currentItemViewHolder != null) {
                    View view = this.parentPage.swipeController.currentItemViewHolder.itemView;
                    if (view instanceof DialogCell) {
                        DialogCell dialogCell = (DialogCell) view;
                        long dialogId = dialogCell.getDialogId();
                        if (DialogObject.isFolderDialogId(dialogId)) {
                            toggleArchiveHidden(false, dialogCell);
                        } else {
                            TLRPC.Dialog dialog = (TLRPC.Dialog) DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
                            if (dialog != null) {
                                if (!ChatObject.isCommunity(DialogsActivity.this.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                                    if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 1) {
                                        if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 3) {
                                            if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 0) {
                                                if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 4) {
                                                    ArrayList arrayList = new ArrayList();
                                                    arrayList.add(Long.valueOf(dialogId));
                                                    DialogsActivity.this.performSelectedDialogsAction(arrayList, 102, true, false);
                                                }
                                            } else {
                                                ArrayList arrayList2 = new ArrayList();
                                                arrayList2.add(Long.valueOf(dialogId));
                                                DialogsActivity.this.canPinCount = !DialogsActivity.this.isDialogPinned(dialog) ? 1 : 0;
                                                DialogsActivity.this.performSelectedDialogsAction(arrayList2, 100, true, false);
                                            }
                                        } else if (!DialogsActivity.this.getMessagesController().isDialogMuted(dialogId, 0L)) {
                                            NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0L, 3);
                                            if (BulletinFactory.canShowBulletin(DialogsActivity.this)) {
                                                BulletinFactory.createMuteBulletin(DialogsActivity.this, 3).show();
                                            }
                                        } else {
                                            ArrayList arrayList3 = new ArrayList();
                                            arrayList3.add(Long.valueOf(dialogId));
                                            DialogsActivity dialogsActivity = DialogsActivity.this;
                                            dialogsActivity.canMuteCount = !MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).isDialogMuted(dialogId, 0L) ? 1 : 0;
                                            DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                            dialogsActivity2.canUnmuteCount = dialogsActivity2.canMuteCount > 0 ? 0 : 1;
                                            DialogsActivity.this.performSelectedDialogsAction(arrayList3, 104, true, false);
                                        }
                                    } else {
                                        ArrayList arrayList4 = new ArrayList();
                                        arrayList4.add(Long.valueOf(dialogId));
                                        DialogsActivity.this.canReadCount = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                                        DialogsActivity.this.performSelectedDialogsAction(arrayList4, 101, true, false);
                                    }
                                } else {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.add(Long.valueOf(dialogId));
                                    DialogsActivity.this.performSelectedDialogsAction(arrayList5, 111, true, false);
                                }
                            }
                        }
                    }
                }
            }
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (this.parentPage.dialogsType == 0 && ((action == 1 || action == 3) && this.parentPage.archivePullViewState == 2 && DialogsActivity.this.hasHiddenArchive() && ((LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition() == 0)) {
                int paddingTop = getPaddingTop();
                DialogCell dialogCellFindArchiveDialogCell = DialogsActivity.this.findArchiveDialogCell(this.parentPage);
                if (dialogCellFindArchiveDialogCell != null) {
                    int iDp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f) * 0.85f);
                    int top = (dialogCellFindArchiveDialogCell.getTop() - paddingTop) + dialogCellFindArchiveDialogCell.getMeasuredHeight();
                    long jCurrentTimeMillis = System.currentTimeMillis() - DialogsActivity.this.startArchivePullingTime;
                    if (top < iDp || jCurrentTimeMillis < 200) {
                        DialogsActivity.this.disableActionBarScrolling = true;
                        smoothScrollBy(0, top, CubicBezierInterpolator.EASE_OUT_QUINT);
                        this.parentPage.archivePullViewState = 2;
                    } else if (this.parentPage.archivePullViewState != 1) {
                        if (getViewOffset() == 0.0f) {
                            DialogsActivity.this.disableActionBarScrolling = true;
                            smoothScrollBy(0, dialogCellFindArchiveDialogCell.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                        if (!DialogsActivity.this.canShowHiddenArchive) {
                            DialogsActivity.this.canShowHiddenArchive = true;
                            try {
                                performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (this.parentPage.pullForegroundDrawable != null) {
                                this.parentPage.pullForegroundDrawable.colorize(true);
                            }
                        }
                        dialogCellFindArchiveDialogCell.startOutAnimation();
                        this.parentPage.archivePullViewState = 1;
                        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                        }
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
                                DialogsRecyclerView.this.setScrollEnabled(true);
                            }
                        });
                        valueAnimatorOfFloat.start();
                    }
                }
            }
            return zOnTouchEvent;
        }

        public void lambda$onTouchEvent$0(ValueAnimator valueAnimator) {
            setViewsOffset(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (this.fastScrollAnimationRunning || DialogsActivity.this.waitingForScrollFinished || this.parentPage.dialogsItemAnimator.isRunning()) {
                return false;
            }
            if (motionEvent.getAction() == 0) {
                DialogsActivity.this.allowSwipeDuringCurrentTouch = !((BaseFragment) r0).actionBar.isActionModeShowed();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected boolean allowSelectChildAtPosition(View view) {
            return !(view instanceof HeaderCell) || view.isClickable();
        }

        public void setOpenRightFragmentProgress(float f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }

        public void setAnimationSupportView(RecyclerListView recyclerListView, float f, boolean z, boolean z2) {
            RecyclerListView recyclerListView2 = recyclerListView == null ? this.animationSupportListView : this;
            if (recyclerListView2 == null) {
                this.animationSupportListView = recyclerListView;
                return;
            }
            DialogCell dialogCell = null;
            DialogCell dialogCell2 = null;
            int top = Integer.MAX_VALUE;
            for (int i = 0; i < recyclerListView2.getChildCount(); i++) {
                View childAt = recyclerListView2.getChildAt(i);
                if (childAt instanceof DialogCell) {
                    DialogCell dialogCell3 = (DialogCell) childAt;
                    if (dialogCell3.getDialogId() == DialogsActivity.this.rightSlidingDialogContainer.getCurrentFragmetDialogId()) {
                        dialogCell = dialogCell3;
                    }
                    if (childAt.getTop() >= 0 && dialogCell3.getDialogId() != 0 && childAt.getTop() < top) {
                        top = dialogCell3.getTop();
                        dialogCell2 = dialogCell3;
                    }
                }
            }
            DialogCell dialogCell4 = (dialogCell == null || getAdapter().getItemCount() * AndroidUtilities.dp(70.0f) <= getMeasuredHeight() || ((float) (dialogCell2.getTop() - getPaddingTop())) <= ((float) (getMeasuredHeight() - getPaddingTop())) / 2.0f) ? dialogCell2 : dialogCell;
            this.animationSupportListView = recyclerListView;
            if (dialogCell4 != null) {
                if (recyclerListView != null) {
                    recyclerListView.setPadding(getPaddingLeft(), this.topPadding, getPaddingLeft(), getPaddingBottom());
                    DialogsAdapter dialogsAdapter = (DialogsAdapter) recyclerListView.getAdapter();
                    int iFindDialogPosition = dialogsAdapter.findDialogPosition(dialogCell4.getDialogId());
                    int top2 = (int) ((dialogCell4.getTop() - recyclerListView2.getPaddingTop()) + f);
                    if (iFindDialogPosition >= 0) {
                        boolean z3 = this.parentPage.dialogsType == 0 && this.parentPage.archivePullViewState == 2 && DialogsActivity.this.hasHiddenArchive();
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(iFindDialogPosition, dialogsAdapter.fixScrollGap(this, iFindDialogPosition, top2, z3, dialogsActivity.hasStories, dialogsActivity.canShowFilterTabsView, z));
                    }
                }
                int iFindDialogPosition2 = ((DialogsAdapter) getAdapter()).findDialogPosition(dialogCell4.getDialogId());
                int top3 = dialogCell4.getTop() - getPaddingTop();
                if (z2 && DialogsActivity.this.hasStories) {
                    top3 += AndroidUtilities.dp(81.0f);
                }
                if (z2) {
                    top3 += AndroidUtilities.dp(48.0f);
                }
                if (iFindDialogPosition2 >= 0) {
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(iFindDialogPosition2, top3);
                }
            }
        }

        @Override
        public void updateClip(int[] iArr) {
            int paddingTop = (int) (getPaddingTop() + DialogsActivity.this.scrollYOffset);
            iArr[0] = paddingTop;
            iArr[1] = paddingTop + getMeasuredHeight();
        }
    }

    public StoriesController getStoriesController() {
        return getMessagesController().getStoriesController();
    }

    class SwipeController extends ItemTouchHelper.Callback {
        private RecyclerView.ViewHolder currentItemViewHolder;
        private ViewPage parentPage;
        private boolean swipeFolderBack;
        private boolean swipingFolder;

        @Override
        public float getSwipeEscapeVelocity(float f) {
            return 3500.0f;
        }

        @Override
        public float getSwipeThreshold(RecyclerView.ViewHolder viewHolder) {
            return 0.45f;
        }

        @Override
        public float getSwipeVelocityThreshold(float f) {
            return Float.MAX_VALUE;
        }

        public SwipeController(ViewPage viewPage) {
            this.parentPage = viewPage;
        }

        @Override
        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
            TLRPC.Dialog dialog;
            if (!DialogsActivity.this.waitingForDialogsAnimationEnd(this.parentPage) && ((((BaseFragment) DialogsActivity.this).parentLayout == null || !((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode()) && !DialogsActivity.this.rightSlidingDialogContainer.hasFragment())) {
                if (!this.swipingFolder || !this.swipeFolderBack) {
                    if (!DialogsActivity.this.onlySelect && this.parentPage.isDefaultDialogType() && DialogsActivity.this.slidingView == null) {
                        View view = viewHolder.itemView;
                        if (view instanceof DialogCell) {
                            DialogCell dialogCell = (DialogCell) view;
                            long dialogId = dialogCell.getDialogId();
                            MessagesController.DialogFilter dialogFilter = null;
                            if (!((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed(null)) {
                                int dialogsType = DialogsActivity.this.initialDialogsType;
                                try {
                                    dialogsType = this.parentPage.dialogsAdapter.getDialogsType();
                                } catch (Exception unused) {
                                }
                                if ((DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5) && DialogsActivity.this.allowSwipeDuringCurrentTouch && (((dialogId != DialogsActivity.this.getUserConfig().clientUserId && dialogId != 777000 && dialogsType != 7 && dialogsType != 8) || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 2) && (!DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) || DialogsActivity.this.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA))) {
                                    boolean z = DialogsActivity.this.folderId == 0 && (ChatObject.isCommunity(((BaseFragment) DialogsActivity.this).currentAccount, dialogId) || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 3 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 4) && !DialogsActivity.this.rightSlidingDialogContainer.hasFragment();
                                    if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1) {
                                        if (DialogsActivity.this.viewPages[0].dialogsType == 7 || DialogsActivity.this.viewPages[0].dialogsType == 8) {
                                            dialogFilter = DialogsActivity.this.getMessagesController().selectedDialogFilter[DialogsActivity.this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                                        }
                                        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (dialog = (TLRPC.Dialog) DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId)) != null && !dialogFilter.alwaysShow(((BaseFragment) DialogsActivity.this).currentAccount, dialog) && (dialog.unread_count > 0 || dialog.unread_mark)) {
                                            z = false;
                                        }
                                    }
                                    this.swipeFolderBack = false;
                                    this.swipingFolder = (z && !DialogObject.isFolderDialogId(dialogCell.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(dialogCell.getDialogId()));
                                    dialogCell.setSliding(true);
                                    return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                                }
                            } else {
                                TLRPC.Dialog dialog2 = (TLRPC.Dialog) DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
                                if (!DialogsActivity.this.allowMoving || dialog2 == null || !DialogsActivity.this.isDialogPinned(dialog2) || DialogObject.isFolderDialogId(dialogId)) {
                                    return 0;
                                }
                                DialogsActivity.this.movingView = (DialogCell) viewHolder.itemView;
                                DialogsActivity.this.movingView.setBackgroundColor(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                                this.swipeFolderBack = false;
                                return ItemTouchHelper.Callback.makeMovementFlags(3, 0);
                            }
                        }
                    }
                } else {
                    View view2 = viewHolder.itemView;
                    if (view2 instanceof DialogCell) {
                        ((DialogCell) view2).swipeCanceled = true;
                    }
                    this.swipingFolder = false;
                    return 0;
                }
            }
            return 0;
        }

        @Override
        public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            View view = viewHolder2.itemView;
            if (!(view instanceof DialogCell)) {
                return false;
            }
            long dialogId = ((DialogCell) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
            if (dialog == null || !DialogsActivity.this.isDialogPinned(dialog) || DialogObject.isFolderDialogId(dialogId)) {
                return false;
            }
            int adapterPosition = viewHolder.getAdapterPosition();
            int adapterPosition2 = viewHolder2.getAdapterPosition();
            if (this.parentPage.listView.getItemAnimator() == null) {
                ViewPage viewPage = this.parentPage;
                viewPage.listView.setItemAnimator(viewPage.dialogsItemAnimator);
            }
            this.parentPage.dialogsAdapter.moveDialogs(this.parentPage.listView, adapterPosition, adapterPosition2);
            if (DialogsActivity.this.viewPages[0].dialogsType != 7 && DialogsActivity.this.viewPages[0].dialogsType != 8) {
                DialogsActivity.this.movingWas = true;
            } else {
                MessagesController.DialogFilter dialogFilter = DialogsActivity.this.getMessagesController().selectedDialogFilter[DialogsActivity.this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                if (!DialogsActivity.this.movingDialogFilters.contains(dialogFilter)) {
                    DialogsActivity.this.movingDialogFilters.add(dialogFilter);
                }
            }
            return true;
        }

        @Override
        public int convertToAbsoluteDirection(int i, int i2) {
            if (this.swipeFolderBack) {
                return 0;
            }
            return super.convertToAbsoluteDirection(i, i2);
        }

        @Override
        public void onSwiped(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder == null) {
                DialogsActivity.this.slidingView = null;
                return;
            }
            DialogCell dialogCell = (DialogCell) viewHolder.itemView;
            long dialogId = dialogCell.getDialogId();
            if (DialogObject.isFolderDialogId(dialogId)) {
                this.parentPage.listView.toggleArchiveHidden(false, dialogCell);
                return;
            }
            final TLRPC.Dialog dialog = (TLRPC.Dialog) DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
            if (dialog == null) {
                return;
            }
            if (!DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) && DialogsActivity.this.folderId == 0 && SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(dialogId));
                DialogsActivity.this.canReadCount = (dialog.unread_count > 0 || dialog.unread_mark) ? 1 : 0;
                DialogsActivity.this.performSelectedDialogsAction(arrayList, 101, true, false);
                return;
            }
            if (!ChatObject.isCommunity(DialogsActivity.this.getMessagesController().getChat(Long.valueOf(-dialogId)))) {
                DialogsActivity.this.slidingView = dialogCell;
                final int adapterPosition = viewHolder.getAdapterPosition();
                final int itemCount = this.parentPage.dialogsAdapter.getItemCount();
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onSwiped$3(dialog, itemCount, adapterPosition);
                    }
                };
                DialogsActivity.this.setDialogsListFrozen(true);
                if (Utilities.random.nextInt(1000) == 1) {
                    if (DialogsActivity.this.pacmanAnimation == null) {
                        DialogsActivity.this.pacmanAnimation = new PacmanAnimation(this.parentPage.listView);
                    }
                    DialogsActivity.this.pacmanAnimation.setFinishRunnable(runnable);
                    DialogsActivity.this.pacmanAnimation.start();
                    return;
                }
                runnable.run();
                return;
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Long.valueOf(dialogId));
            DialogsActivity.this.performSelectedDialogsAction(arrayList2, 111, true, false);
        }

        public void lambda$onSwiped$3(final TLRPC.Dialog dialog, int i, int i2) {
            if (DialogsActivity.this.frozenDialogsList == null) {
                return;
            }
            DialogsActivity.this.frozenDialogsList.remove(dialog);
            final int i3 = dialog.pinnedNum;
            DialogsActivity.this.slidingView = null;
            this.parentPage.listView.invalidate();
            int iFindLastVisibleItemPosition = this.parentPage.layoutManager.findLastVisibleItemPosition();
            if (iFindLastVisibleItemPosition == i - 1) {
                this.parentPage.layoutManager.findViewByPosition(iFindLastVisibleItemPosition).requestLayout();
            }
            if (!DialogsActivity.this.getMessagesController().isPromoDialog(dialog.id, false)) {
                int iAddDialogToFolder = DialogsActivity.this.getMessagesController().addDialogToFolder(dialog.id, DialogsActivity.this.folderId == 0 ? 1 : 0, -1, 0L);
                if (iAddDialogToFolder != 2 || i2 != 0) {
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    this.parentPage.updateList(true);
                }
                if (DialogsActivity.this.folderId == 0) {
                    if (iAddDialogToFolder == 2) {
                        if (SharedConfig.archiveHidden) {
                            SharedConfig.toggleArchiveHidden();
                        }
                        this.parentPage.dialogsItemAnimator.prepareForRemove();
                        if (i2 == 0) {
                            DialogsActivity.this.setDialogsListFrozen(true);
                            this.parentPage.updateList(true);
                            DialogsActivity.this.checkAnimationFinished();
                        } else {
                            this.parentPage.updateList(true);
                            if (!SharedConfig.archiveHidden && this.parentPage.layoutManager.findFirstVisibleItemPosition() == 0) {
                                DialogsActivity.this.disableActionBarScrolling = true;
                                this.parentPage.listView.smoothScrollBy(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 76.0f : 70.0f));
                            }
                        }
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        DialogsActivity.this.frozenDialogsList.add(0, (TLRPC.Dialog) dialogsActivity.getDialogsArray(((BaseFragment) dialogsActivity).currentAccount, this.parentPage.dialogsType, DialogsActivity.this.folderId, false).get(0));
                        this.parentPage.updateList(true);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onSwiped$0();
                            }
                        }, 300L);
                    } else if (iAddDialogToFolder == 1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(0);
                        if (viewHolderFindViewHolderForAdapterPosition != null) {
                            View view = viewHolderFindViewHolderForAdapterPosition.itemView;
                            if (view instanceof DialogCell) {
                                DialogCell dialogCell = (DialogCell) view;
                                dialogCell.checkCurrentDialogIndex(true);
                                dialogCell.animateArchiveAvatar();
                            }
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onSwiped$1();
                            }
                        }, 300L);
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    boolean z = globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden;
                    if (!z) {
                        globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                    }
                    UndoView undoView = DialogsActivity.this.getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(dialog.id, z ? 2 : 3, null, new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onSwiped$2(dialog, i3);
                            }
                        });
                    }
                }
                if (DialogsActivity.this.folderId == 0 || !DialogsActivity.this.frozenDialogsList.isEmpty()) {
                    return;
                }
                this.parentPage.listView.setEmptyView(null);
                this.parentPage.progressView.setVisibility(4);
                return;
            }
            DialogsActivity.this.getMessagesController().hidePromoDialog();
            this.parentPage.dialogsItemAnimator.prepareForRemove();
            this.parentPage.updateList(true);
        }

        public void lambda$onSwiped$0() {
            DialogsActivity.this.setDialogsListFrozen(false);
        }

        public void lambda$onSwiped$1() {
            DialogsActivity.this.setDialogsListFrozen(false);
        }

        public void lambda$onSwiped$2(TLRPC.Dialog dialog, int i) {
            DialogsActivity.this.dialogsListFrozen = true;
            DialogsActivity.this.getMessagesController().addDialogToFolder(dialog.id, 0, i, 0L);
            DialogsActivity.this.dialogsListFrozen = false;
            ArrayList<TLRPC.Dialog> dialogs = DialogsActivity.this.getMessagesController().getDialogs(0);
            int iIndexOf = dialogs.indexOf(dialog);
            if (iIndexOf >= 0) {
                ArrayList<TLRPC.Dialog> dialogs2 = DialogsActivity.this.getMessagesController().getDialogs(1);
                if (!dialogs2.isEmpty() || iIndexOf != 1) {
                    DialogsActivity.this.setDialogsListFrozen(true);
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    this.parentPage.updateList(true);
                    DialogsActivity.this.checkAnimationFinished();
                }
                if (dialogs2.isEmpty()) {
                    dialogs.remove(0);
                    if (iIndexOf == 1) {
                        DialogsActivity.this.setDialogsListFrozen(true);
                        this.parentPage.updateList(true);
                        DialogsActivity.this.checkAnimationFinished();
                        return;
                    } else {
                        if (!DialogsActivity.this.frozenDialogsList.isEmpty()) {
                            DialogsActivity.this.frozenDialogsList.remove(0);
                        }
                        this.parentPage.dialogsItemAnimator.prepareForRemove();
                        this.parentPage.updateList(true);
                        return;
                    }
                }
                return;
            }
            this.parentPage.updateList(false);
        }

        @Override
        public void onSelectedChanged(RecyclerView.ViewHolder viewHolder, int i) {
            if (viewHolder != null) {
                this.parentPage.listView.hideSelector(false);
            }
            this.currentItemViewHolder = viewHolder;
            if (viewHolder != null) {
                View view = viewHolder.itemView;
                if (view instanceof DialogCell) {
                    ((DialogCell) view).swipeCanceled = false;
                }
            }
            super.onSelectedChanged(viewHolder, i);
        }

        @Override
        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            if (i == 4) {
                return 200L;
            }
            if (i == 8 && DialogsActivity.this.movingView != null) {
                final DialogCell dialogCell = DialogsActivity.this.movingView;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        dialogCell.setBackgroundDrawable(null);
                    }
                }, this.parentPage.dialogsItemAnimator.getMoveDuration());
                DialogsActivity.this.movingView = null;
            }
            return super.getAnimationDuration(recyclerView, i, f, f2);
        }
    }

    public DialogsActivity(Bundle bundle) {
        super(bundle);
        int i = Build.VERSION.SDK_INT;
        this.ADDITIONAL_LIST_HEIGHT_DP = i >= 31 ? 48 : 0;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSearchVisible = new BoolAnimator(1, this, cubicBezierInterpolator, 350L);
        this.animatorDoneButtonVisible = new BoolAnimator(2, this, cubicBezierInterpolator, 350L);
        this.animatorSpeedButtonVisible = new BoolAnimator(3, this, cubicBezierInterpolator, 350L);
        this.animatorShadowVisible = new BoolAnimator(4, this, cubicBezierInterpolator, 350L);
        this.animatorSearchButtonVisible = new BoolAnimator(5, this, cubicBezierInterpolator, 350L);
        this.animatorActionModeVisible = new BoolAnimator(6, this, cubicBezierInterpolator, 350L);
        this.animatorForwardButtonVisible = new BoolAnimator(7, this, cubicBezierInterpolator, 350L);
        this.animatorFilterTabsVisible = new BoolAnimator(8, this, cubicBezierInterpolator, 350L);
        this.animatorSearchFilterTabsVisible = new BoolAnimator(9, this, cubicBezierInterpolator, 350L);
        this.windowInsetsStateHolder = new WindowInsetsStateHolder(new Runnable() {
            @Override
            public final void run() {
                this.f$0.checkInsets();
            }
        });
        this.initialSearchType = -1;
        this.ACTION_MODE_SEARCH_DIALOGS_TAG = "search_dialogs_action_mode";
        this.allowGlobalSearch = true;
        this.hasStories = false;
        this.hasOnlySlefStories = false;
        this.animateToHasStories = false;
        this.invalidateScrollY = true;
        this.contactsAlpha = 1.0f;
        this.undoView = new UndoView[2];
        this.movingDialogFilters = new ArrayList();
        this.actionBarDefaultPaint = new Paint();
        this.actionModeViews = new ArrayList();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.askAboutContacts = true;
        this.checkPermission = true;
        this.resetDelegate = true;
        this.openedDialogId = new MessagesStorage.TopicKey();
        this.selectedDialogs = new ArrayList();
        this.notify = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.debugLastUpdateAction = -1;
        this.SCROLL_Y = new AnimationProperties.FloatProperty("animationValue") {
            @Override
            public void setValue(DialogsActivity dialogsActivity, float f) {
                dialogsActivity.setScrollY(f);
            }

            @Override
            public Float get(DialogsActivity dialogsActivity) {
                return Float.valueOf(DialogsActivity.this.scrollYOffset);
            }
        };
        this.SEARCH_TRANSLATION_Y = new AnimationProperties.FloatProperty("viewPagerTranslation") {
            @Override
            public void setValue(View view, float f) {
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.searchViewPagerTranslationY = f;
                view.setTranslationY(dialogsActivity.panTranslationY + f);
                DialogsActivity.this.checkUi_searchFiltersVisibility();
            }

            @Override
            public Float get(View view) {
                return Float.valueOf(DialogsActivity.this.searchViewPagerTranslationY);
            }
        };
        this.shiftDp = -4;
        this.scrollBarVisible = true;
        this.storiesEnabled = true;
        this.slideFragmentProgress = 1.0f;
        this.slideAmplitudeDp = 40;
        ArrayList arrayList = new ArrayList();
        this.iBlur3Positions = arrayList;
        RectF rectF = new RectF();
        this.iBlur3PositionActionBar = rectF;
        RectF rectF2 = new RectF();
        this.iBlur3PositionMainTabs = rectF2;
        arrayList.add(rectF);
        arrayList.add(rectF2);
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getThemedColor(Theme.key_windowBackgroundWhite));
        if (i >= 31) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlassFrosted = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                    if (SharedConfig.chatBlurEnabled()) {
                        RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                        TopicsFragment topicsFragment = (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) ? null : (TopicsFragment) DialogsActivity.this.rightSlidingDialogContainer.getFragment();
                        if (topicsFragment == null || topicsFragment.getFragmentView() == null || DialogsActivity.this.searching) {
                            return;
                        }
                        iBlur3Hash.unsupported();
                    }
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    BlurredBackgroundSourceRenderNode frostedGlassSource;
                    int measuredWidth = DialogsActivity.this.fragmentView.getMeasuredWidth();
                    int measuredHeight = DialogsActivity.this.fragmentView.getMeasuredHeight();
                    canvas.drawColor(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                        TopicsFragment topicsFragment = (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) ? null : (TopicsFragment) DialogsActivity.this.rightSlidingDialogContainer.getFragment();
                        if (topicsFragment != null && topicsFragment.getFragmentView() != null && !DialogsActivity.this.searching && (frostedGlassSource = topicsFragment.getFrostedGlassSource()) != null) {
                            canvas.save();
                            canvas.translate(topicsFragment.getFragmentView().getTranslationX(), topicsFragment.getFragmentView().getTranslationY());
                            frostedGlassSource.draw(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                            canvas.restore();
                        }
                        DialogsActivity.this.scrollableViewNoiseSuppressor.draw(canvas, -3);
                    }
                }
            });
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode2 = new BlurredBackgroundSourceRenderNode(null);
            this.iBlur3SourceGlass = blurredBackgroundSourceRenderNode2;
            blurredBackgroundSourceRenderNode2.setupRenderer(new RenderNodeWithHash.Renderer() {
                @Override
                public void renderNodeCalculateHash(IBlur3Hash iBlur3Hash) {
                    iBlur3Hash.add(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    iBlur3Hash.add(SharedConfig.chatBlurEnabled());
                    if (SharedConfig.chatBlurEnabled()) {
                        RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                        TopicsFragment topicsFragment = (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) ? null : (TopicsFragment) DialogsActivity.this.rightSlidingDialogContainer.getFragment();
                        if (topicsFragment == null || topicsFragment.getFragmentView() == null || DialogsActivity.this.searching) {
                            return;
                        }
                        iBlur3Hash.unsupported();
                    }
                }

                @Override
                public void renderNodeUpdateDisplayList(Canvas canvas) {
                    BlurredBackgroundSourceRenderNode glassSource;
                    int measuredWidth = DialogsActivity.this.fragmentView.getMeasuredWidth();
                    int measuredHeight = DialogsActivity.this.fragmentView.getMeasuredHeight();
                    canvas.drawColor(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite));
                    if (SharedConfig.chatBlurEnabled()) {
                        RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                        TopicsFragment topicsFragment = (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) ? null : (TopicsFragment) DialogsActivity.this.rightSlidingDialogContainer.getFragment();
                        if (topicsFragment != null && topicsFragment.getFragmentView() != null && !DialogsActivity.this.searching && (glassSource = topicsFragment.getGlassSource()) != null) {
                            canvas.save();
                            canvas.translate(topicsFragment.getFragmentView().getTranslationX(), topicsFragment.getFragmentView().getTranslationY());
                            glassSource.draw(canvas, 0.0f, 0.0f, measuredWidth, measuredHeight);
                            canvas.restore();
                        }
                        DialogsActivity.this.scrollableViewNoiseSuppressor.draw(canvas, -2);
                    }
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.iBlur3FactoryFrostedLiquidGlass = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode2);
            this.iBlur3FactoryLiquidGlass = blurredBackgroundDrawableViewFactory2;
            blurredBackgroundDrawableViewFactory2.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
            this.iBlur3FactoryBlur = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.iBlur3SourceGlassFrosted = null;
            this.iBlur3SourceGlass = null;
            this.iBlur3FactoryFrostedLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryLiquidGlass = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
            this.iBlur3FactoryBlur = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.iBlur3FactoryFade = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
    }

    public void setMainTabsActivityController(MainTabsActivityController mainTabsActivityController) {
        this.mainTabsActivityController = mainTabsActivityController;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        Bundle bundle = this.arguments;
        if (bundle != null) {
            this.onlySelect = bundle.getBoolean("onlySelect", false);
            this.canSelectTopics = this.arguments.getBoolean("canSelectTopics", false);
            this.cantSendToChannels = this.arguments.getBoolean("cantSendToChannels", false);
            this.initialDialogsType = this.arguments.getInt("dialogsType", 0);
            this.isQuote = this.arguments.getBoolean("quote", false);
            this.isReplyTo = this.arguments.getBoolean("reply_to", false);
            this.replyMessageAuthor = this.arguments.getLong("reply_to_author", 0L);
            this.forwardOriginalChannel = this.arguments.getLong("forward_into_channel", 0L);
            this.selectAlertString = this.arguments.getString("selectAlertString");
            this.selectAlertStringGroup = this.arguments.getString("selectAlertStringGroup");
            this.addToGroupAlertString = this.arguments.getString("addToGroupAlertString");
            this.allowSwitchAccount = this.arguments.getBoolean("allowSwitchAccount");
            this.checkCanWrite = this.arguments.getBoolean("checkCanWrite", true);
            this.afterSignup = this.arguments.getBoolean("afterSignup", false);
            this.folderId = this.arguments.getInt("folderId", 0);
            long j = this.arguments.getLong("community_id", 0L);
            this.communityId = j;
            if (j != 0) {
                this.community = getMessagesController().getChat(Long.valueOf(this.communityId));
                this.communityFull = getMessagesController().getChatFull(this.communityId);
            }
            this.resetDelegate = this.arguments.getBoolean("resetDelegate", true);
            this.messagesCount = this.arguments.getInt("messagesCount", 0);
            this.hasPoll = this.arguments.getInt("hasPoll", 0);
            this.hasInvoice = this.arguments.getBoolean("hasInvoice", false);
            this.showSetPasswordConfirm = this.arguments.getBoolean("showSetPasswordConfirm", this.showSetPasswordConfirm);
            this.otherwiseReloginDays = this.arguments.getInt("otherwiseRelogin");
            this.allowGroups = this.arguments.getBoolean("allowGroups", true);
            this.allowMegagroups = this.arguments.getBoolean("allowMegagroups", true);
            this.allowLegacyGroups = this.arguments.getBoolean("allowLegacyGroups", true);
            this.allowChannels = this.arguments.getBoolean("allowChannels", true);
            this.allowUsers = this.arguments.getBoolean("allowUsers", true);
            this.allowBots = this.arguments.getBoolean("allowBots", true);
            this.closeFragment = this.arguments.getBoolean("closeFragment", true);
            this.allowGlobalSearch = this.arguments.getBoolean("allowGlobalSearch", true);
            this.hasMainTabs = this.arguments.getBoolean("hasMainTabs", false);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.requestPeerType = TLRPC.RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                    serializedData.cleanup();
                } catch (Exception unused) {
                }
            }
            this.requestPeerBotId = this.arguments.getLong("requestPeerBotId", 0L);
        }
        if (this.initialDialogsType == 0) {
            this.askAboutContacts = MessagesController.getGlobalNotificationsSettings().getBoolean("askAboutContacts", true);
            SharedConfig.loadProxyList();
        }
        this.observersGroup = getNotificationCenter().createObserversGroup(this);
        this.globalObserversGroup = NotificationCenter.getGlobalInstance().createObserversGroup(this);
        if (this.searchString == null) {
            this.currentConnectionState = getConnectionsManager().getConnectionState();
            this.globalObserversGroup.add(NotificationCenter.emojiLoaded);
            if (!this.onlySelect) {
                this.globalObserversGroup.add(NotificationCenter.closeSearchByActiveAction);
                this.globalObserversGroup.add(NotificationCenter.proxySettingsChanged);
                this.observersGroup.add(NotificationCenter.filterSettingsUpdated);
                this.observersGroup.add(NotificationCenter.dialogsUnreadCounterChanged);
            }
            this.observersGroup.add(NotificationCenter.dialogsNeedReload).add(NotificationCenter.dialogFiltersUpdated).add(NotificationCenter.updateInterfaces).add(NotificationCenter.encryptedChatUpdated).add(NotificationCenter.contactsDidLoad).add(NotificationCenter.appDidLogout).add(NotificationCenter.openedChatChanged).add(NotificationCenter.notificationsSettingsUpdated).add(NotificationCenter.messageReceivedByAck).add(NotificationCenter.messageReceivedByServer).add(NotificationCenter.messageSendError).add(NotificationCenter.needReloadRecentDialogsSearch).add(NotificationCenter.replyMessagesDidLoad).add(NotificationCenter.topicsDidLoaded).add(NotificationCenter.reloadHints).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.onDownloadingFilesChanged).add(NotificationCenter.needDeleteDialog).add(NotificationCenter.folderBecomeEmpty).add(NotificationCenter.newSuggestionsAvailable).add(NotificationCenter.dialogsUnreadReactionsCounterChanged).add(NotificationCenter.dialogsUnreadPollVotesCounterChanged).add(NotificationCenter.forceImportContactsStart).add(NotificationCenter.userEmojiStatusUpdated).add(NotificationCenter.currentUserPremiumStatusChanged);
            this.globalObserversGroup.add(NotificationCenter.didSetPasscode);
        }
        this.observersGroup.add(NotificationCenter.messagesDeleted).add(NotificationCenter.onDatabaseMigration).add(NotificationCenter.onDatabaseOpened).add(NotificationCenter.chatInfoDidLoad).add(NotificationCenter.didClearDatabase).add(NotificationCenter.onDatabaseReset).add(NotificationCenter.storiesUpdated).add(NotificationCenter.storiesEnabledUpdate).add(NotificationCenter.unconfirmedAuthUpdate).add(NotificationCenter.premiumPromoUpdated).add(NotificationCenter.starBalanceUpdated).add(NotificationCenter.starSubscriptionsLoaded).add(NotificationCenter.communityPendingRequestsUpdate).add(NotificationCenter.communitySwitchedCollapsed).add(NotificationCenter.appConfigUpdated).add(NotificationCenter.activeAuctionsUpdated);
        if (this.initialDialogsType == 0) {
            this.observersGroup.add(NotificationCenter.chatlistFolderUpdate);
            this.observersGroup.add(NotificationCenter.dialogTranslate);
        }
        loadDialogs(getAccountInstance());
        getMessagesController().getStoriesController().loadAllStories();
        getMessagesController().loadPinnedDialogs(this.folderId, 0L, null);
        if (this.databaseMigrationHint != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            View view = this.databaseMigrationHint;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.databaseMigrationHint = null;
        }
        if (isArchive()) {
            getMessagesController().getStoriesController().loadHiddenStories();
        } else {
            getMessagesController().getStoriesController().loadStories();
        }
        getContactsController().loadGlobalPrivacySetting();
        if (getMessagesController().savedViewAsChats) {
            getMessagesController().getSavedMessagesController().preloadDialogs(true);
        }
        BirthdayController.getInstance(this.currentAccount).check();
        this.additionNavigationBarHeight = this.hasMainTabs ? AndroidUtilities.dp(72.0f) : 0;
        this.additionFloatingButtonOffset = this.hasMainTabs ? AndroidUtilities.dp(64.0f) : 0;
        return true;
    }

    public static void loadDialogs(final AccountInstance accountInstance) {
        int currentAccount = accountInstance.getCurrentAccount();
        if (dialogsLoaded[currentAccount]) {
            return;
        }
        MessagesController messagesController = accountInstance.getMessagesController();
        messagesController.loadGlobalNotificationsSettings();
        messagesController.loadDialogs(0, 0, 100, true);
        messagesController.loadHintDialogs();
        messagesController.loadUserInfo(accountInstance.getUserConfig().getCurrentUser(), false, 0);
        accountInstance.getContactsController().checkInviteText();
        accountInstance.getMediaDataController().checkAllMedia(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.lambda$loadDialogs$1(accountInstance);
            }
        }, 200L);
        Iterator<String> it = messagesController.diceEmojies.iterator();
        while (it.hasNext()) {
            accountInstance.getMediaDataController().loadStickersByEmojiOrName(it.next(), true, true);
        }
        dialogsLoaded[currentAccount] = true;
    }

    public static void lambda$loadDialogs$1(AccountInstance accountInstance) {
        accountInstance.getDownloadController().loadDownloadingFiles();
    }

    public void updateStatus(TLRPC.User user, boolean z) {
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if (dialogStoriesCell != null) {
            dialogStoriesCell.updateStatus(user, z);
        }
        if (this.statusDrawable == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(user);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = null;
        this.statusDrawableGiftId = null;
        if (emojiStatusDocumentId != null) {
            boolean z2 = user.emoji_status instanceof TLRPC.TL_emojiStatusCollectible;
            this.statusDrawable.set(emojiStatusDocumentId.longValue(), z);
            this.statusDrawable.setParticles(z2, z);
            if (z2) {
                this.statusDrawableGiftId = Long.valueOf(((TLRPC.TL_emojiStatusCollectible) user.emoji_status).collectible_id);
            }
            this.actionBar.setRightDrawableOnClick(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateStatus$2(view);
                }
            });
            SelectAnimatedEmojiDialog.preload(this.currentAccount);
        } else if (user != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(user)) {
            if (this.premiumStar == null) {
                this.premiumStar = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.premiumStar = new AnimatedEmojiDrawable.WrapSizeDrawable(this.premiumStar, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f)) {
                    @Override
                    public void draw(Canvas canvas) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
                        super.draw(canvas);
                        canvas.restore();
                    }
                };
            }
            this.premiumStar.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
            this.statusDrawable.set(this.premiumStar, z);
            this.statusDrawable.setParticles(false, z);
            this.actionBar.setRightDrawableOnClick(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateStatus$3(view);
                }
            });
            SelectAnimatedEmojiDialog.preload(this.currentAccount);
        } else {
            this.statusDrawable.set((Drawable) null, z);
            this.statusDrawable.setParticles(false, z);
            this.actionBar.setRightDrawableOnClick(null);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
        int i = Theme.key_profile_verifiedBackground;
        swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(getThemedColor(i)));
        AnimatedStatusView animatedStatusView = this.animatedStatusView;
        if (animatedStatusView != null) {
            animatedStatusView.setColor(getThemedColor(i));
        }
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialogWindow == null || !(selectAnimatedEmojiDialogWindow.getContentView() instanceof SelectAnimatedEmojiDialog)) {
            return;
        }
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = (SelectAnimatedEmojiDialog) this.selectAnimatedEmojiDialog.getContentView();
        if (titleTextView != null) {
            Drawable rightDrawable = titleTextView.getRightDrawable();
            AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable3 = this.statusDrawable;
            if (rightDrawable == swapAnimatedEmojiDrawable3) {
                swapAnimatedEmojiDrawable = swapAnimatedEmojiDrawable3;
            }
        }
        selectAnimatedEmojiDialog.setScrimDrawable(swapAnimatedEmojiDrawable, titleTextView);
    }

    public void lambda$updateStatus$2(View view) {
        DialogStoriesCell dialogStoriesCell;
        if (this.dialogStoriesCellVisible && (dialogStoriesCell = this.dialogStoriesCell) != null && !dialogStoriesCell.isExpanded()) {
            scrollToTop(true, true);
        } else {
            showSelectStatusDialog();
        }
    }

    public void lambda$updateStatus$3(View view) {
        DialogStoriesCell dialogStoriesCell;
        if (this.dialogStoriesCellVisible && (dialogStoriesCell = this.dialogStoriesCell) != null && !dialogStoriesCell.isExpanded()) {
            scrollToTop(true, true);
        } else {
            showSelectStatusDialog();
        }
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.observersGroup = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.globalObserversGroup;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.globalObserversGroup = null;
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        ShareTopView shareTopView = this.shareTopView;
        if (shareTopView != null) {
            shareTopView.stopHintRotation();
        }
        Runnable runnable = this.shareLinkSearchRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.shareLinkSearchRunnable = null;
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.notificationsLocker.unlock();
        this.delegate = null;
        SuggestClearDatabaseBottomSheet.dismissDialog();
    }

    @Override
    public boolean dismissDialogOnPause(Dialog dialog) {
        return !(dialog instanceof BotWebViewSheet) && super.dismissDialogOnPause(dialog);
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBar = new ActionBar(context, this.resourceProvider) {
            @Override
            public void setTranslationY(float f) {
                View view;
                if (f != getTranslationY() && (view = DialogsActivity.this.fragmentView) != null) {
                    view.invalidate();
                }
                super.setTranslationY(f);
            }

            @Override
            protected boolean shouldClipChild(View view) {
                return super.shouldClipChild(view) || view == DialogsActivity.this.doneItem;
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                if (!((BaseFragment) DialogsActivity.this).inPreviewMode || DialogsActivity.this.avatarContainer == null || view == DialogsActivity.this.avatarContainer) {
                    return super.drawChild(canvas, view, j);
                }
                return false;
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (DialogsActivity.this.fragmentSearchField == null || DialogsActivity.this.fragmentSearchField.getAlpha() <= 0.0f || !DialogsActivity.this.animatorSearchVisible.getValue()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                return false;
            }

            @Override
            public void closeSearchField(boolean z) {
                DialogsActivity.this.fragmentSearchField.editText.getText().clear();
                if (z && DialogsActivity.this.fragmentSearchField.editText.isFocused()) {
                    AndroidUtilities.hideKeyboard(DialogsActivity.this.fragmentSearchField.editText);
                }
                DialogsActivity.this.fragmentSearchField.editText.clearFocus();
                DialogsActivity.this.fragmentSearchFieldWatcher.toggleSearch(false);
            }

            @Override
            protected boolean onSearchChangedIgnoreTitles() {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                return rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment();
            }

            @Override
            public void onSearchFieldVisibilityChanged(boolean z) {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment() && getBackButton() != null) {
                    getBackButton().animate().alpha(z ? 1.0f : 0.0f).start();
                }
                super.onSearchFieldVisibilityChanged(z);
            }

            @Override
            public void showActionMode(boolean z, View view, View view2, View[] viewArr, boolean[] zArr, View view3, int i) {
                super.showActionMode(z, view, view2, viewArr, zArr, view3, i);
                DialogsActivity.this.animatorActionModeVisible.setValue(true, z);
            }

            @Override
            public void hideActionMode() {
                super.hideActionMode();
                DialogsActivity.this.animatorActionModeVisible.setValue(false, true);
            }
        };
        actionBar.setAllowOverlayTitle(true);
        actionBar.setUseContainerForTitles();
        actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarDefaultSelector), false);
        actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), true);
        actionBar.setItemsColor(getThemedColor(Theme.key_actionBarDefaultIcon), false);
        actionBar.setItemsColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), true);
        actionBar.createAdditionalSubTitleOverlayContainer();
        actionBar.getAdditionalSubTitleOverlayContainer().setTranslationX(AndroidUtilities.dp(4.0f));
        actionBar.getAdditionalSubTitleOverlayContainer().setTranslationY(-AndroidUtilities.dp(3.0f));
        if (this.inPreviewMode || (AndroidUtilities.isTablet() && this.folderId != 0 && !isArchive())) {
            actionBar.setOccupyStatusBar(false);
        }
        return actionBar;
    }

    @Override
    public void setTitleOverlayText(java.lang.String r4, int r5, java.lang.Runnable r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.setTitleOverlayText(java.lang.String, int, java.lang.Runnable):void");
    }

    @Override
    public android.view.View createView(final android.content.Context r41) throws android.content.res.Resources.NotFoundException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$6(View view) {
        showSearch(true, false, true);
        this.fragmentSearchFieldWatcher.toggleSearch(true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$5();
            }
        }, 100L);
    }

    public void lambda$createView$5() {
        this.fragmentSearchField.editText.requestFocus();
        AndroidUtilities.showKeyboard(this.fragmentSearchField.editText);
    }

    public void lambda$createView$7(View view) {
        this.filterTabsView.setIsEditing(false);
        showDoneItem(false);
    }

    public void lambda$createView$8(View view) {
        showDialog(new PremiumFeatureBottomSheet(this, 2, true));
    }

    public void lambda$createView$9() {
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null && searchViewPager.actionModeShowing()) {
            this.searchViewPager.hideActionMode();
            return;
        }
        this.fragmentSearchField.editText.getText().clear();
        AndroidUtilities.hideKeyboard(this.fragmentSearchField.editText);
        this.fragmentSearchField.editText.clearFocus();
        this.fragmentSearchFieldWatcher.toggleSearch(false);
    }

    public void lambda$createView$10(View view, boolean z) {
        if (z) {
            this.fragmentSearchFieldWatcher.toggleSearch(true);
        }
    }

    public void lambda$createView$11(View view) throws IOException {
        getContactsController().loadGlobalPrivacySetting();
        showItemOptions();
    }

    public boolean lambda$createView$12(View view) throws IOException {
        getContactsController().loadGlobalPrivacySetting();
        showItemOptions();
        return true;
    }

    public void lambda$createView$13() {
        if (this.initialDialogsType != 10) {
            hideFloatingButton(false);
        }
        if (this.hasOnlySlefStories && getStoriesController().hasOnlySelfStories()) {
            this.dialogStoriesCell.openSelfStories();
        } else {
            scrollToTop(true, true);
        }
    }

    class AnonymousClass10 extends FilterTabsView {
        AnonymousClass10(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
            DialogsActivity.this.maybeStartTracking = false;
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected void onDefaultTabMoved() {
            if (DialogsActivity.this.getMessagesController().premiumFeaturesBlocked()) {
                return;
            }
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.topBulletin = BulletinFactory.of(dialogsActivity).createSimpleBulletin(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString(R.string.PremiumMore), 5000, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onDefaultTabMoved$0();
                }
            }).show(true);
        }

        public void lambda$onDefaultTabMoved$0() {
            DialogsActivity.this.showDialog(new PremiumFeatureBottomSheet(DialogsActivity.this, 9, true));
            DialogsActivity.this.filterTabsView.setIsEditing(false);
            DialogsActivity.this.showDoneItem(false);
        }
    }

    class AnonymousClass11 implements FilterTabsView.FilterTabsViewDelegate {
        final Context val$context;

        AnonymousClass11(Context context) {
            this.val$context = context;
        }

        public void lambda$didSelectTab$6(final MessagesController.DialogFilter dialogFilter) {
            if (dialogFilter.isChatlist()) {
                FolderBottomSheet.showForDeletion(DialogsActivity.this, dialogFilter.id, null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.FilterDelete));
            builder.setMessage(LocaleController.getString(R.string.FilterDeleteAlert));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString(R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$showDeleteAlert$0(dialogFilter, alertDialog, i);
                }
            });
            AlertDialog alertDialogCreate = builder.create();
            DialogsActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(DialogsActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$showDeleteAlert$0(MessagesController.DialogFilter dialogFilter, AlertDialog alertDialog, int i) {
            TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
            tL_messages_updateDialogFilter.id = dialogFilter.id;
            DialogsActivity.this.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, null);
            DialogsActivity.this.getMessagesController().removeFilter(dialogFilter);
            DialogsActivity.this.getMessagesStorage().deleteDialogFilter(dialogFilter);
        }

        @Override
        public void onSamePageSelected() {
            DialogsActivity.this.scrollToTop(true, false);
        }

        @Override
        public void onPageReorder(int i, int i2) {
            for (int i3 = 0; i3 < DialogsActivity.this.viewPages.length; i3++) {
                if (DialogsActivity.this.viewPages[i3].selectedType == i) {
                    DialogsActivity.this.viewPages[i3].selectedType = i2;
                } else if (DialogsActivity.this.viewPages[i3].selectedType == i2) {
                    DialogsActivity.this.viewPages[i3].selectedType = i;
                }
            }
        }

        @Override
        public void onPageSelected(FilterTabsView.Tab tab, boolean z) {
            int i;
            if (DialogsActivity.this.viewPages[0].selectedType == tab.id) {
                return;
            }
            if (tab.isLocked) {
                DialogsActivity.this.filterTabsView.shakeLock(tab.id);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity.showDialog(new LimitReachedBottomSheet(dialogsActivity2, this.val$context, 3, ((BaseFragment) dialogsActivity2).currentAccount, null));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = DialogsActivity.this.getMessagesController().getDialogFilters();
            if (tab.isDefault || ((i = tab.id) >= 0 && i < dialogFilters.size())) {
                DialogsActivity.this.viewPages[1].selectedType = tab.id;
                DialogsActivity.this.viewPages[1].setVisibility(0);
                DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth());
                DialogsActivity.this.showScrollbars(false);
                DialogsActivity.this.switchToCurrentSelectedMode(true);
                DialogsActivity.this.animatingForward = z;
            }
        }

        @Override
        public boolean canPerformActions() {
            return !DialogsActivity.this.searching;
        }

        @Override
        public void onPageScrolled(float f) {
            if (f != 1.0f || DialogsActivity.this.viewPages[1].getVisibility() == 0 || DialogsActivity.this.searching) {
                if (DialogsActivity.this.animatingForward) {
                    DialogsActivity.this.viewPages[0].setTranslationX((-f) * DialogsActivity.this.viewPages[0].getMeasuredWidth());
                    DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() - (f * DialogsActivity.this.viewPages[0].getMeasuredWidth()));
                } else {
                    DialogsActivity.this.viewPages[0].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() * f);
                    DialogsActivity.this.viewPages[1].setTranslationX((f * DialogsActivity.this.viewPages[0].getMeasuredWidth()) - DialogsActivity.this.viewPages[0].getMeasuredWidth());
                }
                if (f == 1.0f) {
                    ViewPage viewPage = DialogsActivity.this.viewPages[0];
                    DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                    DialogsActivity.this.viewPages[1] = viewPage;
                    DialogsActivity.this.viewPages[1].setVisibility(8);
                    DialogsActivity.this.showScrollbars(true);
                    DialogsActivity.this.updateCounters(false);
                    DialogsActivity.this.filterTabsView.stopAnimatingIndicator();
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivity.checkListLoad(dialogsActivity.viewPages[0]);
                    DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                    DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                }
            }
        }

        @Override
        public int getTabCounter(int i) {
            if (DialogsActivity.this.initialDialogsType == 3) {
                return 0;
            }
            if (i == DialogsActivity.this.filterTabsView.getDefaultTabId()) {
                return DialogsActivity.this.getMessagesStorage().getMainUnreadCount();
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = DialogsActivity.this.getMessagesController().getDialogFilters();
            if (i < 0 || i >= dialogFilters.size()) {
                return 0;
            }
            return DialogsActivity.this.getMessagesController().getDialogFilters().get(i).unreadCount;
        }

        @Override
        public boolean didSelectTab(org.telegram.ui.Components.FilterTabsView.TabView r19, boolean r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.AnonymousClass11.didSelectTab(org.telegram.ui.Components.FilterTabsView$TabView, boolean):boolean");
        }

        public void lambda$didSelectTab$1() {
            DialogsActivity.this.filterTabsView.setIsEditing(true);
            DialogsActivity.this.showDoneItem(true);
        }

        public void lambda$didSelectTab$2(boolean z, MessagesController.DialogFilter dialogFilter) {
            DialogsActivity.this.presentFragment(z ? new FiltersSetupActivity() : new FilterCreateActivity(dialogFilter));
        }

        public void lambda$didSelectTab$3(ArrayList arrayList, boolean z) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i2);
                if (dialog != null) {
                    DialogsActivity.this.getNotificationsController().setDialogNotificationsSettings(dialog.id, 0L, z ? 3 : 4);
                    i++;
                }
            }
            BulletinFactory.createMuteBulletin(DialogsActivity.this, z, i, (Theme.ResourcesProvider) null).show();
        }

        public void lambda$didSelectTab$4(ArrayList arrayList) {
            DialogsActivity.this.markDialogsAsRead(arrayList);
        }

        public void lambda$didSelectTab$5(boolean[] zArr, MessagesController.DialogFilter dialogFilter) {
            if (zArr[0]) {
                DialogsActivity.this.presentFragment(new FilterChatlistActivity(dialogFilter, null));
            } else {
                FilterCreateActivity.FilterInvitesBottomSheet.show(DialogsActivity.this, dialogFilter, null);
            }
        }

        @Override
        public boolean isTabMenuVisible() {
            return DialogsActivity.this.filterOptions != null && DialogsActivity.this.filterOptions.isShown();
        }

        @Override
        public void onDeletePressed(int i) {
            lambda$didSelectTab$6(DialogsActivity.this.getMessagesController().getDialogFilters().get(i));
        }
    }

    class AnonymousClass12 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass12() {
        }

        @Override
        public void onItemClick(int i) {
            if ((i == 201 || i == 200 || i == 202 || i == 203) && DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.onActionBarItemClick(i);
                return;
            }
            if (i == -1) {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                if (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) {
                    if (DialogsActivity.this.filterTabsView == null || !DialogsActivity.this.filterTabsView.isEditing()) {
                        if (((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                            if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0 || !DialogsActivity.this.searchViewPager.actionModeShowing()) {
                                DialogsActivity.this.hideActionMode(true);
                                return;
                            } else {
                                DialogsActivity.this.searchViewPager.hideActionMode();
                                return;
                            }
                        }
                        if (!DialogsActivity.this.onlySelect && DialogsActivity.this.folderId == 0 && DialogsActivity.this.communityId == 0) {
                            return;
                        }
                        DialogsActivity.this.finishFragment();
                        return;
                    }
                    DialogsActivity.this.filterTabsView.setIsEditing(false);
                    DialogsActivity.this.showDoneItem(false);
                    return;
                }
                if (((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                    if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0 || !DialogsActivity.this.searchViewPager.actionModeShowing()) {
                        DialogsActivity.this.hideActionMode(true);
                        return;
                    } else {
                        DialogsActivity.this.searchViewPager.hideActionMode();
                        return;
                    }
                }
                DialogsActivity.this.rightSlidingDialogContainer.lambda$presentFragment$1();
                if (DialogsActivity.this.searchViewPager != null) {
                    DialogsActivity.this.searchViewPager.updateTabs();
                    return;
                }
                return;
            }
            if (i == 1) {
                if (DialogsActivity.this.getParentActivity() == null) {
                    return;
                }
                SharedConfig.appLocked = true;
                SharedConfig.saveConfig();
                int[] iArr = new int[2];
                DialogsActivity.this.passcodeItem.getLocationInWindow(iArr);
                ((LaunchActivity) DialogsActivity.this.getParentActivity()).showPasscodeActivity(false, true, iArr[0] + (DialogsActivity.this.passcodeItem.getMeasuredWidth() / 2), iArr[1] + (DialogsActivity.this.passcodeItem.getMeasuredHeight() / 2), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemClick$0();
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onItemClick$1();
                    }
                });
                DialogsActivity.this.getNotificationsController().showNotifications();
                DialogsActivity.this.checkUi_itemPasscodeVisibility();
                return;
            }
            if (i == 3) {
                DialogsActivity.this.showSearch(true, true, true);
                DialogsActivity.this.fragmentSearchFieldWatcher.toggleSearch(true);
                return;
            }
            if (i == 11) {
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.openAccountSelector(dialogsActivity.switchItem);
                return;
            }
            if (i == 109) {
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                FiltersListBottomSheet filtersListBottomSheet = new FiltersListBottomSheet(dialogsActivity2, dialogsActivity2.selectedDialogs);
                filtersListBottomSheet.setDelegate(new FiltersListBottomSheet.FiltersListBottomSheetDelegate() {
                    @Override
                    public final void didSelectFilter(MessagesController.DialogFilter dialogFilter, boolean z) {
                        this.f$0.lambda$onItemClick$2(dialogFilter, z);
                    }
                });
                DialogsActivity.this.showDialog(filtersListBottomSheet);
                return;
            }
            if (i != 110) {
                if (i == 100 || i == 101 || i == 102 || i == 103 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108) {
                    DialogsActivity dialogsActivity3 = DialogsActivity.this;
                    dialogsActivity3.performSelectedDialogsAction(dialogsActivity3.selectedDialogs, i, true, false);
                    return;
                }
                return;
            }
            MessagesController.DialogFilter dialogFilter = DialogsActivity.this.getMessagesController().getDialogFilters().get(DialogsActivity.this.viewPages[0].selectedType);
            DialogsActivity dialogsActivity4 = DialogsActivity.this;
            ArrayList dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity4, dialogFilter, dialogsActivity4.selectedDialogs, false, false);
            if ((dialogFilter != null ? dialogFilter.neverShow.size() : 0) + dialogsCount.size() > 100) {
                DialogsActivity dialogsActivity5 = DialogsActivity.this;
                dialogsActivity5.showDialog(AlertsCreator.createSimpleAlert(dialogsActivity5.getParentActivity(), LocaleController.getString(R.string.FilterAddToAlertFullTitle), LocaleController.getString(R.string.FilterAddToAlertFullText)).create());
                return;
            }
            if (!dialogsCount.isEmpty()) {
                dialogFilter.neverShow.addAll(dialogsCount);
                for (int i2 = 0; i2 < dialogsCount.size(); i2++) {
                    Long l = (Long) dialogsCount.get(i2);
                    dialogFilter.alwaysShow.remove(l);
                    dialogFilter.pinnedDialogs.delete(l.longValue());
                }
                if (dialogFilter.isChatlist()) {
                    dialogFilter.neverShow.clear();
                }
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, false, false, DialogsActivity.this, null);
            }
            long jLongValue = dialogsCount.size() == 1 ? ((Long) dialogsCount.get(0)).longValue() : 0L;
            UndoView undoView = DialogsActivity.this.getUndoView();
            if (undoView != null) {
                undoView.showWithAction(jLongValue, 21, Integer.valueOf(dialogsCount.size()), dialogFilter, (Runnable) null, (Runnable) null);
            }
            DialogsActivity.this.hideActionMode(false);
        }

        public void lambda$onItemClick$0() {
            DialogsActivity.this.passcodeItem.setAlpha(1.0f);
        }

        public void lambda$onItemClick$1() {
            DialogsActivity.this.passcodeItem.setAlpha(0.0f);
        }

        public void lambda$onItemClick$2(MessagesController.DialogFilter dialogFilter, boolean z) {
            boolean z2;
            ArrayList arrayList;
            ArrayList arrayList2;
            DialogsActivity dialogsActivity = DialogsActivity.this;
            ArrayList dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity, dialogFilter, dialogsActivity.selectedDialogs, true, false);
            if (!z) {
                int size = (dialogFilter != null ? dialogFilter.alwaysShow.size() : 0) + dialogsCount.size();
                if ((size > DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitDefault && !DialogsActivity.this.getUserConfig().isPremium()) || size > DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitPremium) {
                    DialogsActivity dialogsActivity2 = DialogsActivity.this;
                    DialogsActivity dialogsActivity3 = DialogsActivity.this;
                    dialogsActivity2.showDialog(new LimitReachedBottomSheet(dialogsActivity3, dialogsActivity3.fragmentView.getContext(), 4, ((BaseFragment) DialogsActivity.this).currentAccount, null));
                    return;
                }
            }
            if (dialogFilter != null) {
                long jLongValue = 0;
                if (z) {
                    for (int i = 0; i < DialogsActivity.this.selectedDialogs.size(); i++) {
                        dialogFilter.neverShow.add((Long) DialogsActivity.this.selectedDialogs.get(i));
                        dialogFilter.alwaysShow.remove(DialogsActivity.this.selectedDialogs.get(i));
                    }
                    FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, DialogsActivity.this, null);
                    long jLongValue2 = DialogsActivity.this.selectedDialogs.size() == 1 ? ((Long) DialogsActivity.this.selectedDialogs.get(0)).longValue() : 0L;
                    UndoView undoView = DialogsActivity.this.getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(jLongValue2, 21, Integer.valueOf(DialogsActivity.this.selectedDialogs.size()), dialogFilter, (Runnable) null, (Runnable) null);
                    }
                    z2 = true;
                } else {
                    if (dialogsCount.isEmpty()) {
                        arrayList = dialogsCount;
                    } else {
                        for (int i2 = 0; i2 < dialogsCount.size(); i2++) {
                            dialogFilter.neverShow.remove(dialogsCount.get(i2));
                        }
                        dialogFilter.alwaysShow.addAll(dialogsCount);
                        arrayList = dialogsCount;
                        FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, DialogsActivity.this, null);
                    }
                    z2 = true;
                    if (arrayList.size() == 1) {
                        arrayList2 = arrayList;
                        jLongValue = ((Long) arrayList2.get(0)).longValue();
                    } else {
                        arrayList2 = arrayList;
                    }
                    UndoView undoView2 = DialogsActivity.this.getUndoView();
                    if (undoView2 != null) {
                        undoView2.showWithAction(jLongValue, 20, Integer.valueOf(arrayList2.size()), dialogFilter, (Runnable) null, (Runnable) null);
                    }
                }
            } else {
                z2 = true;
                DialogsActivity.this.presentFragment(new FilterCreateActivity(null, dialogsCount));
            }
            DialogsActivity.this.hideActionMode(z2);
        }
    }

    public void lambda$createView$14(ContentView contentView, PointF pointF, Canvas canvas, RectF rectF) {
        SearchViewPager searchViewPager = this.searchViewPager;
        int alpha = searchViewPager != null ? (int) (searchViewPager.getAlpha() * 255.0f) : 0;
        for (ViewPage viewPage : this.viewPages) {
            if (viewPage != null && viewPage.getVisibility() == 0 && viewPage.getAlpha() > 0.0f) {
                float rightSlidingProgress = getRightSlidingProgress();
                if (viewPage.animationSupportListView != null && rightSlidingProgress > 0.0f) {
                    if (!ViewPositionWatcher.computeCoordinatesInParent(viewPage.listView, contentView, pointF)) {
                        return;
                    }
                    canvas.save();
                    canvas.clipRect(rectF);
                    canvas.translate(pointF.x, pointF.y);
                    viewPage.listView.dispatchDraw(canvas);
                    canvas.restore();
                } else {
                    DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
                    Blur3Utils.captureRelativeParent(dialogsRecyclerView, canvas, rectF, dialogsRecyclerView, contentView, 255 - alpha);
                }
            }
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 == null || searchViewPager2.getVisibility() != 0 || this.searchViewPager.getAlpha() <= 0.0f) {
            return;
        }
        SearchViewPager searchViewPager3 = this.searchViewPager;
        Blur3Utils.captureRelativeParent(searchViewPager3, canvas, rectF, searchViewPager3, contentView, alpha);
    }

    public void lambda$createView$15(ViewPage viewPage) {
        viewPage.listView.postOnAnimation(new Runnable() {
            @Override
            public final void run() {
                this.f$0.blur3_InvalidateBlur();
            }
        });
    }

    class AnonymousClass14 extends LinearLayoutManager {
        private boolean fixOffset;
        boolean lastDragging;
        ValueAnimator storiesOverscrollAnimator;
        final ViewPage val$viewPage;

        AnonymousClass14(Context context, ViewPage viewPage) {
            super(context);
            this.val$viewPage = viewPage;
        }

        @Override
        protected int firstPosition() {
            return (this.val$viewPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive() && this.val$viewPage.archivePullViewState == 2) ? 1 : 0;
        }

        @Override
        public void scrollToPositionWithOffset(int i, int i2) {
            if (this.fixOffset) {
                i2 -= this.val$viewPage.listView.getPaddingTop();
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
            if (DialogsActivity.this.hasHiddenArchive() && i == 1) {
                super.smoothScrollToPosition(recyclerView, state, i);
                return;
            }
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(recyclerView.getContext(), 0);
            linearSmoothScrollerCustom.setTargetPosition(i);
            startSmoothScroll(linearSmoothScrollerCustom);
        }

        @Override
        public void onScrollStateChanged(int i) {
            super.onScrollStateChanged(i);
            ValueAnimator valueAnimator = this.storiesOverscrollAnimator;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.storiesOverscrollAnimator.cancel();
            }
            if (this.val$viewPage.listView.getScrollState() != 1) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(DialogsActivity.this.storiesOverscroll, 0.0f);
                this.storiesOverscrollAnimator = valueAnimatorOfFloat;
                final ViewPage viewPage = this.val$viewPage;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        this.f$0.lambda$onScrollStateChanged$0(viewPage, valueAnimator2);
                    }
                });
                this.storiesOverscrollAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                        DialogsActivity.this.setStoriesOvercroll(anonymousClass14.val$viewPage, 0.0f);
                    }
                });
                this.storiesOverscrollAnimator.setDuration(200L);
                this.storiesOverscrollAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.storiesOverscrollAnimator.start();
            }
        }

        public void lambda$onScrollStateChanged$0(ViewPage viewPage, ValueAnimator valueAnimator) {
            DialogsActivity.this.setStoriesOvercroll(viewPage, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public int scrollVerticallyBy(int r22, androidx.recyclerview.widget.RecyclerView.Recycler r23, androidx.recyclerview.widget.RecyclerView.State r24) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.AnonymousClass14.scrollVerticallyBy(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
        }

        @Override
        public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
            if (BuildVars.DEBUG_PRIVATE_VERSION) {
                try {
                    super.onLayoutChildren(recycler, state);
                    return;
                } catch (IndexOutOfBoundsException unused) {
                    throw new RuntimeException("Inconsistency detected. dialogsListIsFrozen=" + DialogsActivity.this.dialogsListFrozen + " lastUpdateAction=" + DialogsActivity.this.debugLastUpdateAction);
                }
            }
            try {
                super.onLayoutChildren(recycler, state);
            } catch (IndexOutOfBoundsException e) {
                FileLog.e(e);
                final ViewPage viewPage = this.val$viewPage;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsActivity.AnonymousClass14.lambda$onLayoutChildren$1(viewPage);
                    }
                });
            }
        }

        public static void lambda$onLayoutChildren$1(ViewPage viewPage) {
            viewPage.dialogsAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$16(ViewPage viewPage, View view, int i, float f, float f2) throws Resources.NotFoundException, IOException, NumberFormatException {
        if (view instanceof GraySectionCell) {
            return;
        }
        boolean z = view instanceof DialogCell;
        if (z) {
            DialogCell dialogCell = (DialogCell) view;
            if (dialogCell.isBlocked()) {
                showPremiumBlockedToast(view, dialogCell.getDialogId());
                return;
            }
        }
        if (clickSelectsDialog()) {
            onItemLongClick(viewPage.listView, view, i, 0.0f, 0.0f, viewPage.dialogsType, viewPage.dialogsAdapter);
            return;
        }
        int i2 = this.initialDialogsType;
        if (i2 == 15 && (view instanceof TextCell)) {
            viewPage.dialogsAdapter.onCreateGroupForThisClick();
            return;
        }
        if ((i2 == 11 || i2 == 13) && i == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("forImport", true);
            bundle.putLongArray("result", new long[]{getUserConfig().getClientUserId()});
            bundle.putInt("chatType", 4);
            String string = this.arguments.getString("importTitle");
            if (string != null) {
                bundle.putString("title", string);
            }
            GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle);
            groupCreateFinalActivity.setDelegate(new GroupCreateFinalActivity.GroupCreateFinalActivityDelegate() {
                @Override
                public void didFailChatCreation() {
                }

                @Override
                public void didStartChatCreation() {
                }

                @Override
                public void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity2, long j) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(MessagesStorage.TopicKey.of(-j, 0L));
                    DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                    if (DialogsActivity.this.closeFragment) {
                        DialogsActivity.this.removeSelfFromStack();
                    }
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivityDelegate.didSelectDialogs(dialogsActivity, arrayList, null, true, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, null);
                }
            });
            presentFragment(groupCreateFinalActivity);
            return;
        }
        if ((view instanceof DialogsHintCell) && (viewPage.dialogsType == 7 || viewPage.dialogsType == 8)) {
            TL_chatlists.TL_chatlists_chatlistUpdates chatlistUpdate = viewPage.dialogsAdapter.getChatlistUpdate();
            if (chatlistUpdate != null) {
                MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[viewPage.dialogsType - 7];
                if (dialogFilter != null) {
                    showDialog(new FolderBottomSheet(this, dialogFilter.id, chatlistUpdate));
                    return;
                }
                return;
            }
        } else if (z && !this.actionBar.isActionModeShowed() && !this.rightSlidingDialogContainer.hasFragment()) {
            DialogCell dialogCell2 = (DialogCell) view;
            AndroidUtilities.rectTmp.set(dialogCell2.avatarImage.getImageX(), dialogCell2.avatarImage.getImageY(), dialogCell2.avatarImage.getImageX2(), dialogCell2.avatarImage.getImageY2());
        }
        onItemClick(view, i, viewPage.dialogsAdapter, f, f2);
    }

    public void lambda$createView$17() {
        this.invalidateScrollY = true;
        this.fragmentView.invalidate();
    }

    public void lambda$createView$18(View view, int i) {
        this.filtersView.cancelClickRunnables(true);
        addSearchFilter(this.filtersView.getFilterAt(i));
    }

    public void lambda$createView$19(View view) throws Resources.NotFoundException {
        openStoriesRecorder();
    }

    public void lambda$createView$20(View view) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isInPreviewMode()) {
            finishPreviewFragment();
            return;
        }
        if (this.initialDialogsType == 10) {
            if (this.delegate == null || this.selectedDialogs.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.selectedDialogs.size(); i++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) this.selectedDialogs.get(i)).longValue(), 0L));
            }
            this.delegate.didSelectDialogs(this, arrayList, null, false, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, null);
            return;
        }
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
        } else {
            openWriteContacts();
        }
    }

    public void lambda$createView$21() {
        MessagesController.getInstance(this.currentAccount).getMainSettings().edit().putBoolean("storyhint", false).commit();
    }

    public void lambda$createView$22() {
        this.viewPages[0].listView.requestLayout();
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        TopicsFragment topicsFragment = (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) ? null : (TopicsFragment) this.rightSlidingDialogContainer.getFragment();
        if (topicsFragment != null) {
            topicsFragment.checkUi_listViewPadding();
        }
        checkUi_searchPagesPaddings(false);
        updateContextViewPosition();
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            searchViewPager.invalidate();
        }
    }

    public void lambda$createView$23(Long l) {
        this.cacheSize = l;
        lambda$updateDialogsHint$41();
    }

    public void lambda$createView$24(Long l, Long l2) {
        this.deviceSize = l;
        lambda$updateDialogsHint$41();
    }

    public void lambda$createView$25(View view) {
        Bundle bundle = new Bundle();
        bundle.putLong("community_id", this.communityId);
        presentFragment(new CommunityPendingRequestsActivity(bundle));
    }

    class AnonymousClass23 implements ChatActivityEnterView.ChatActivityEnterViewDelegate {
        @Override
        public void bottomPanelTranslationYChanged(float f) {
        }

        @Override
        public boolean checkCanRemoveRestrictionsByBoosts() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$checkCanRemoveRestrictionsByBoosts(this);
        }

        @Override
        public void didPressAttachButton() {
        }

        @Override
        public void didPressSuggestionButton() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$didPressSuggestionButton(this);
        }

        @Override
        public int getContentViewHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getContentViewHeight(this);
        }

        @Override
        public TLRPC.Peer getDefaultSendAs() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getDefaultSendAs(this);
        }

        @Override
        public ChatActivity.ReplyQuote getReplyQuote() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyQuote(this);
        }

        @Override
        public TL_stories.StoryItem getReplyToStory() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getReplyToStory(this);
        }

        @Override
        public TLRPC.TL_channels_sendAsPeers getSendAsPeers() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$getSendAsPeers(this);
        }

        @Override
        public boolean hasForwardingMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasForwardingMessages(this);
        }

        @Override
        public boolean hasScheduledMessages() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$hasScheduledMessages(this);
        }

        @Override
        public boolean isVideoRecordingPaused() {
            return false;
        }

        @Override
        public int measureKeyboardHeight() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$measureKeyboardHeight(this);
        }

        @Override
        public void needChangeVideoPreviewState(int i, float f) {
        }

        @Override
        public void needSendTyping() {
        }

        @Override
        public void needShowMediaBanHint() {
        }

        @Override
        public void needStartRecordAudio(int i) {
        }

        @Override
        public void needStartRecordVideo(int i, boolean z, int i2, int i3, int i4, long j, long j2) {
        }

        @Override
        public void onAttachButtonHidden() {
        }

        @Override
        public void onAttachButtonShow() {
        }

        @Override
        public void onAudioVideoInterfaceUpdated() {
        }

        @Override
        public void onContextMenuClose() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuClose(this);
        }

        @Override
        public void onContextMenuOpen() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onContextMenuOpen(this);
        }

        @Override
        public void onEditTextScroll() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEditTextScroll(this);
        }

        @Override
        public void onEmojiViewTabChanged() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onEmojiViewTabChanged(this);
        }

        @Override
        public void onKeyboardRequested() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onKeyboardRequested(this);
        }

        @Override
        public void onMessageEditEnd(boolean z) {
        }

        @Override
        public void onPreAudioVideoRecord() {
        }

        @Override
        public void onSendLongClick() {
        }

        @Override
        public void onStickersExpandedChange() {
        }

        @Override
        public void onStickersTab(boolean z) {
        }

        @Override
        public void onSwitchRecordMode(boolean z) {
        }

        @Override
        public void onTextSelectionChanged(int i, int i2) {
        }

        @Override
        public void onTextSpansChanged(CharSequence charSequence) {
        }

        @Override
        public void onTrendingStickersShowed(boolean z) {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onTrendingStickersShowed(this, z);
        }

        @Override
        public void onUpdateSlowModeButton(View view, boolean z, CharSequence charSequence) {
        }

        @Override
        public void onWindowSizeChanged(int i) {
        }

        @Override
        public boolean onceVoiceAvailable() {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$onceVoiceAvailable(this);
        }

        @Override
        public void openScheduledMessages() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$openScheduledMessages(this);
        }

        @Override
        public void prepareMessageSending() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$prepareMessageSending(this);
        }

        @Override
        public void scrollToSendingMessage() {
            ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$scrollToSendingMessage(this);
        }

        @Override
        public boolean setDefaultSendAs(long j, long j2) {
            return ChatActivityEnterView.ChatActivityEnterViewDelegate.CC.$default$setDefaultSendAs(this, j, j2);
        }

        @Override
        public void toggleVideoRecordingPause() {
        }

        AnonymousClass23() {
        }

        @Override
        public void onMessageSend(CharSequence charSequence, boolean z, int i, int i2, long j) {
            if (DialogsActivity.this.delegate == null || DialogsActivity.this.selectedDialogs.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i3 = 0; i3 < DialogsActivity.this.selectedDialogs.size(); i3++) {
                arrayList.add(MessagesStorage.TopicKey.of(((Long) DialogsActivity.this.selectedDialogs.get(i3)).longValue(), 0L));
            }
            DialogsActivity.this.delegate.didSelectDialogs(DialogsActivity.this, arrayList, charSequence, false, z, i, i2, null);
        }

        @Override
        public void onTextChanged(final CharSequence charSequence, boolean z, boolean z2) {
            final DialogsActivity dialogsActivity = DialogsActivity.this;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws Resources.NotFoundException {
                    DialogsActivity.access$23000(dialogsActivity);
                }
            }, 100L);
            if (DialogsActivity.this.shareTopView != null) {
                if (z) {
                    DialogsActivity.this.shareTopView.onTextChanged(charSequence, true);
                    return;
                }
                if (DialogsActivity.this.shareLinkSearchRunnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(DialogsActivity.this.shareLinkSearchRunnable);
                }
                DialogsActivity.this.shareLinkSearchRunnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onTextChanged$1(charSequence);
                    }
                };
                AndroidUtilities.runOnUIThread(DialogsActivity.this.shareLinkSearchRunnable, 1000L);
            }
        }

        public void lambda$onTextChanged$1(CharSequence charSequence) {
            DialogsActivity.this.shareLinkSearchRunnable = null;
            if (DialogsActivity.this.shareTopView != null) {
                DialogsActivity.this.shareTopView.onTextChanged(charSequence, false);
            }
        }
    }

    public void lambda$createView$26(View view) {
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.selectedDialogs.size(); i++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) this.selectedDialogs.get(i)).longValue(), 0L));
        }
        this.delegate.didSelectDialogs(this, arrayList, this.commentView.getFieldText(), false, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, null);
    }

    class AnonymousClass25 extends DialogStoriesCell {
        AnonymousClass25(Context context, BaseFragment baseFragment, int i, int i2) {
            super(context, baseFragment, i, i2);
        }

        @Override
        public void onUserLongPressed(final View view, final long j) {
            CombinedDrawable combinedDrawable;
            Drawable drawable;
            final AnonymousClass25 anonymousClass25 = this;
            MediaDataController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).loadHints(true);
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.filterOptions = ItemOptions.makeOptions(dialogsActivity, view).setViewAdditionalOffsets(0, AndroidUtilities.dp(8.0f), 0, 0).setScrimViewBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite))).translate(0.0f, AndroidUtilities.dp(8.0f));
            if (UserObject.isService(j)) {
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
                return;
            }
            try {
                view.performHapticFeedback(0);
            } catch (Exception unused) {
            }
            if (j == UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getClientUserId()) {
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                if (dialogsActivity2.storiesEnabled) {
                    ItemOptions itemOptions = dialogsActivity2.filterOptions;
                    int i = R.drawable.msg_stories_add;
                    String string = LocaleController.getString(R.string.AddStory);
                    int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
                    int i3 = Theme.key_actionBarDefaultSubmenuItem;
                    itemOptions.add(i, string, i2, i3, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUserLongPressed$0();
                        }
                    });
                    DialogsActivity.this.filterOptions.add(R.drawable.msg_stories_archive, LocaleController.getString(R.string.ArchivedStories), i2, i3, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUserLongPressed$1();
                        }
                    });
                    DialogsActivity.this.filterOptions.add(R.drawable.msg_stories_saved, LocaleController.getString(R.string.SavedStories), i2, i3, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUserLongPressed$2();
                        }
                    });
                } else {
                    DialogStoriesCell dialogStoriesCell = dialogsActivity2.dialogStoriesCell;
                    if (dialogStoriesCell != null) {
                        dialogStoriesCell.showPremiumHint();
                        return;
                    }
                    return;
                }
            } else {
                final TLRPC.User user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(j));
                TLRPC.Chat chat = DialogsActivity.this.getMessagesController().getChat(Long.valueOf(-j));
                final String sharedPrefKey = NotificationsController.getSharedPrefKey(j, 0L);
                boolean zAreStoriesNotMuted = NotificationsCustomSettingsActivity.areStoriesNotMuted(((BaseFragment) DialogsActivity.this).currentAccount, j);
                boolean zPremiumFeaturesBlocked = MessagesController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).premiumFeaturesBlocked();
                boolean zIsPremium = UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).isPremium();
                boolean zHasUnreadStories = MessagesController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getStoriesController().hasUnreadStories(j);
                boolean zHasLiveStory = MessagesController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getStoriesController().hasLiveStory(j);
                if (zPremiumFeaturesBlocked || j <= 0 || zIsPremium || (drawable = ContextCompat.getDrawable(getContext(), R.drawable.msg_gallery_locked2)) == null) {
                    combinedDrawable = null;
                } else {
                    Drawable drawable2 = ContextCompat.getDrawable(getContext(), R.drawable.msg_stealth_locked);
                    if (drawable2 != null) {
                        drawable2.setColorFilter(new PorterDuffColorFilter(DialogsActivity.this.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.MULTIPLY));
                    }
                    drawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(-1, -16777216, 0.5f), PorterDuff.Mode.MULTIPLY));
                    combinedDrawable = new CombinedDrawable(drawable2, drawable);
                }
                CombinedDrawable combinedDrawable2 = combinedDrawable;
                if (j < 0 && DialogsActivity.this.getStoriesController().canPostStories(j)) {
                    DialogsActivity.this.filterOptions.add(R.drawable.msg_stories_add, LocaleController.getString(R.string.AddStory), Theme.key_actionBarDefaultSubmenuItemIcon, Theme.key_actionBarDefaultSubmenuItem, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onUserLongPressed$3(j);
                        }
                    });
                }
                boolean z = (user == null || user.contact || !MediaDataController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).containsTopPeer(j)) ? false : true;
                ItemOptions itemOptionsMakeMultiline = DialogsActivity.this.filterOptions.addIf(j > 0, R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$4(j);
                    }
                }).addIf(j > 0, R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$5(j);
                    }
                }).addIf(j < 0, R.drawable.msg_channel, LocaleController.getString(ChatObject.isChannelAndNotMegaGroup(chat) ? R.string.OpenChannel2 : R.string.OpenGroup2), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$6(j);
                    }
                }).addIf(zAreStoriesNotMuted && j > 0, R.drawable.msg_mute, LocaleController.getString(R.string.NotificationsStoryMute2), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$7(sharedPrefKey, j, user);
                    }
                }).makeMultiline(false).addIf(!zAreStoriesNotMuted && j > 0, R.drawable.msg_unmute, LocaleController.getString(R.string.NotificationsStoryUnmute2), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$8(sharedPrefKey, j, user);
                    }
                }).makeMultiline(false);
                boolean z2 = !zPremiumFeaturesBlocked && j > 0 && zIsPremium && zHasUnreadStories && !zHasLiveStory;
                int i4 = R.drawable.msg_stories_stealth2;
                int i5 = R.string.ViewAnonymously;
                anonymousClass25 = this;
                itemOptionsMakeMultiline.addIf(z2, i4, LocaleController.getString(i5), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$10(view);
                    }
                }).makeMultiline(false).addIf((zPremiumFeaturesBlocked || j <= 0 || zIsPremium || !zHasUnreadStories || zHasLiveStory) ? false : true, i4, combinedDrawable2, LocaleController.getString(i5), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$12(view);
                    }
                }).makeMultiline(false).addIf((z || DialogsActivity.this.isArchive()) ? false : true, R.drawable.msg_archive, LocaleController.getString(R.string.ArchivePeerStories), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$13(j);
                    }
                }).makeMultiline(false).addIf(!z && DialogsActivity.this.isArchive(), R.drawable.msg_unarchive, LocaleController.getString(R.string.UnarchiveStories), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$14(j);
                    }
                }).makeMultiline(false).addIf(z, R.drawable.msg_delete, LocaleController.getString(R.string.StoriesRemoveFromRecent), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onUserLongPressed$15(j);
                    }
                });
            }
            DialogsActivity.this.filterOptions.setGravity(3).translate(AndroidUtilities.dp(-8.0f), AndroidUtilities.dp(-10.0f)).show();
        }

        public void lambda$onUserLongPressed$0() {
            DialogsActivity.this.dialogStoriesCell.openStoryRecorder();
        }

        public void lambda$onUserLongPressed$1() {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getClientUserId());
            bundle.putInt("type", 1);
            bundle.putInt("start_from", 9);
            DialogsActivity.this.presentFragment(new MediaActivity(bundle, null));
        }

        public void lambda$onUserLongPressed$2() {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getClientUserId());
            bundle.putInt("type", 1);
            DialogsActivity.this.presentFragment(new MediaActivity(bundle, null));
        }

        public void lambda$onUserLongPressed$3(long j) {
            DialogsActivity.this.dialogStoriesCell.openStoryRecorder(j);
        }

        public void lambda$onUserLongPressed$4(long j) {
            DialogsActivity.this.presentFragment(ChatActivity.of(j));
        }

        public void lambda$onUserLongPressed$5(long j) {
            DialogsActivity.this.presentFragment(ProfileActivity.of(j));
        }

        public void lambda$onUserLongPressed$6(long j) {
            DialogsActivity.this.presentFragment(ChatActivity.of(j));
        }

        public void lambda$onUserLongPressed$7(String str, long j, TLRPC.User user) {
            MessagesController.getNotificationsSettings(((BaseFragment) DialogsActivity.this).currentAccount).edit().putBoolean("stories_" + str, false).apply();
            DialogsActivity.this.getNotificationsController().updateServerNotificationsSettings(j, 0L);
            String strTrim = user == null ? "" : user.first_name.trim();
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            BulletinFactory.of(DialogsActivity.this).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryMutedHint", R.string.NotificationsStoryMutedHint, strTrim))).show();
        }

        public void lambda$onUserLongPressed$8(String str, long j, TLRPC.User user) {
            MessagesController.getNotificationsSettings(((BaseFragment) DialogsActivity.this).currentAccount).edit().putBoolean("stories_" + str, true).apply();
            DialogsActivity.this.getNotificationsController().updateServerNotificationsSettings(j, 0L);
            String strTrim = user == null ? "" : user.first_name.trim();
            int iIndexOf = strTrim.indexOf(" ");
            if (iIndexOf > 0) {
                strTrim = strTrim.substring(0, iIndexOf);
            }
            BulletinFactory.of(DialogsActivity.this).createUsersBulletin(Arrays.asList(user), AndroidUtilities.replaceTags(LocaleController.formatString("NotificationsStoryUnmutedHint", R.string.NotificationsStoryUnmutedHint, strTrim))).show();
        }

        public void lambda$onUserLongPressed$10(final View view) {
            TL_stories.TL_storiesStealthMode stealthMode = MessagesController.getInstance(UserConfig.selectedAccount).getStoriesController().getStealthMode();
            if (stealthMode != null && ConnectionsManager.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getCurrentTime() < stealthMode.active_until_date) {
                if (view instanceof DialogStoriesCell.StoryCell) {
                    DialogsActivity.this.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view);
                }
            } else {
                StealthModeAlert stealthModeAlert = new StealthModeAlert(getContext(), 0.0f, 1, ((BaseFragment) DialogsActivity.this).resourceProvider);
                stealthModeAlert.setListener(new StealthModeAlert.Listener() {
                    @Override
                    public final void onButtonClicked(boolean z) {
                        this.f$0.lambda$onUserLongPressed$9(view, z);
                    }
                });
                DialogsActivity.this.showDialog(stealthModeAlert);
            }
        }

        public void lambda$onUserLongPressed$9(View view, boolean z) {
            if (view instanceof DialogStoriesCell.StoryCell) {
                DialogsActivity.this.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view);
                if (z) {
                    AndroidUtilities.runOnUIThread(new DialogsActivity$25$$ExternalSyntheticLambda16(), 500L);
                }
            }
        }

        public void lambda$onUserLongPressed$12(final View view) {
            StealthModeAlert stealthModeAlert = new StealthModeAlert(getContext(), 0.0f, 1, ((BaseFragment) DialogsActivity.this).resourceProvider);
            stealthModeAlert.setListener(new StealthModeAlert.Listener() {
                @Override
                public final void onButtonClicked(boolean z) {
                    this.f$0.lambda$onUserLongPressed$11(view, z);
                }
            });
            DialogsActivity.this.showDialog(stealthModeAlert);
        }

        public void lambda$onUserLongPressed$11(View view, boolean z) {
            if (view instanceof DialogStoriesCell.StoryCell) {
                DialogsActivity.this.dialogStoriesCell.openStoryForCell((DialogStoriesCell.StoryCell) view);
                if (z) {
                    AndroidUtilities.runOnUIThread(new DialogsActivity$25$$ExternalSyntheticLambda16(), 500L);
                }
            }
        }

        public void lambda$onUserLongPressed$13(long j) {
            DialogsActivity.this.toggleArciveForStory(j);
        }

        public void lambda$onUserLongPressed$14(long j) {
            DialogsActivity.this.toggleArciveForStory(j);
        }

        public void lambda$onUserLongPressed$15(long j) {
            MediaDataController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).removePeer(j);
            DialogsActivity.this.getMessagesController().getStoriesController().toggleHidden(j, true, false, true);
        }

        @Override
        public void onMiniListClicked() {
            DialogsActivity dialogsActivity = DialogsActivity.this;
            if (dialogsActivity.hasOnlySlefStories && dialogsActivity.getStoriesController().hasOnlySelfStories()) {
                DialogsActivity.this.dialogStoriesCell.openSelfStories();
            } else {
                DialogsActivity.this.scrollToTop(true, true);
            }
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return !((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed() && super.dispatchTouchEvent(motionEvent);
        }
    }

    public void lambda$createView$27(View view) {
        finishPreviewFragment();
    }

    public void lambda$createView$28(AlertDialog[] alertDialogArr, View view) {
        CommunityUtils.showChatsToAddToCommunity(alertDialogArr, this, this.currentAccount, this.community);
    }

    public void setStoriesOvercroll(ViewPage viewPage, float f) {
        if (this.storiesOverscroll == f) {
            return;
        }
        this.storiesOverscroll = f;
        if (f == 0.0f) {
            this.storiesOverscrollCalled = false;
        }
        this.dialogStoriesCell.setOverscroll(f);
        viewPage.listView.setViewsOffset(f);
        viewPage.listView.setOverScrollMode(f != 0.0f ? 2 : 0);
        this.fragmentView.invalidate();
        if (f <= AndroidUtilities.dp(90.0f) || this.storiesOverscrollCalled || !this.dialogStoriesCell.openOverscrollSelectedStory()) {
            return;
        }
        this.storiesOverscrollCalled = true;
        getOrCreateStoryViewer().doOnAnimationReady(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setStoriesOvercroll$29();
            }
        });
    }

    public void lambda$setStoriesOvercroll$29() {
        this.fragmentView.dispatchTouchEvent(AndroidUtilities.emptyMotionEvent());
    }

    public void toggleArciveForStory(final long j) {
        final boolean z = !isArchive();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleArciveForStory$32(j, z);
            }
        }, 200L);
    }

    public void lambda$toggleArciveForStory$32(final long j, final boolean z) {
        String name;
        TLRPC.Chat chat;
        getMessagesController().getStoriesController().toggleHidden(j, z, false, true);
        BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
        undoObject.onUndo = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleArciveForStory$30(j, z);
            }
        };
        undoObject.onAction = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$toggleArciveForStory$31(j, z);
            }
        };
        if (j >= 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            name = ContactsController.formatName(user.first_name, null, 15);
            chat = user;
        } else {
            TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(-j));
            name = chat2.title;
            chat = chat2;
        }
        this.storiesBulletin = BulletinFactory.global().createUsersBulletin(Collections.singletonList(chat), isArchive() ? AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToDialogs", R.string.StoriesMovedToDialogs, name)) : AndroidUtilities.replaceTags(LocaleController.formatString("StoriesMovedToContacts", R.string.StoriesMovedToContacts, ContactsController.formatName(name, null, 15))), null, undoObject).show();
    }

    public void lambda$toggleArciveForStory$30(long j, boolean z) {
        getMessagesController().getStoriesController().toggleHidden(j, !z, false, true);
    }

    public void lambda$toggleArciveForStory$31(long j, boolean z) {
        getMessagesController().getStoriesController().toggleHidden(j, z, true, true);
    }

    public boolean checkAutoscrollToStories(ViewPage viewPage) {
        boolean z = false;
        if (!this.rightSlidingDialogContainer.hasFragment()) {
            int i = (int) (-this.scrollYOffset);
            int maxScrollYOffset = getMaxScrollYOffset();
            int maxScrollYOffsetWithoutSearch = getMaxScrollYOffsetWithoutSearch();
            if (i != 0 && i != maxScrollYOffset && i != maxScrollYOffsetWithoutSearch) {
                if (!viewPage.listView.canScrollVertically(-1)) {
                    return false;
                }
                z = true;
                if (maxScrollYOffsetWithoutSearch < i && i < maxScrollYOffset) {
                    int iDp = AndroidUtilities.dp(48.0f);
                    int i2 = i - maxScrollYOffsetWithoutSearch;
                    if (i2 < iDp / 2) {
                        viewPage.scroller.smoothScrollBy(-i2);
                    } else {
                        viewPage.scroller.smoothScrollBy(iDp - i2);
                    }
                    return true;
                }
                if ((this.progressToActionMode != 1.0f ? Utilities.clamp((-this.scrollYOffset) / AndroidUtilities.dp(81.0f), 1.0f, 0.0f) : 1.0f) < this.dialogStoriesCell.K) {
                    viewPage.scroller.smoothScrollBy(-i);
                } else {
                    viewPage.scroller.smoothScrollBy(maxScrollYOffsetWithoutSearch - i);
                }
            }
        }
        return z;
    }

    public int getMaxScrollYOffsetWithoutSearch() {
        if (this.hasStories) {
            return AndroidUtilities.dp(81.0f);
        }
        return 0;
    }

    public int getMaxScrollYOffset() {
        if (this.hasStories) {
            return AndroidUtilities.dp(81.0f) + AndroidUtilities.dp(48.0f);
        }
        return AndroidUtilities.dp(48.0f);
    }

    public boolean isStarsSubscriptionHintVisible() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.isStarsSubscriptionHintVisible():boolean");
    }

    private boolean isCommunityPendingRequestsVisible() {
        TLRPC.ChatFull chatFull;
        return (this.communityId == 0 || (chatFull = this.communityFull) == null || chatFull.requests_pending <= 0 || this.animatorSearchVisible.getValue()) ? false : true;
    }

    private void checkCommunityPendingRequestsVisible(boolean z) {
        CommunityRequestsCell communityRequestsCell;
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout == null || (communityRequestsCell = this.communityPendingRequests) == null || this.communityFull == null) {
            return;
        }
        dialogsActivityTopPanelLayout.setViewVisible(communityRequestsCell, isCommunityPendingRequestsVisible(), z);
        this.communityPendingRequests.setTitle(LocaleController.formatPluralString("CommunityPendingRequestsRow", this.communityFull.requests_pending, new Object[0]));
    }

    public boolean isPremiumRestoreHintVisible() {
        return !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.folderId == 0 && this.communityId == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium() && MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null;
    }

    public boolean isPremiumChristmasHintVisible() {
        if (!MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() && this.folderId == 0 && this.communityId == 0) {
            return MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_CHRISTMAS");
        }
        return false;
    }

    public boolean isPremiumHintVisible() {
        if (MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked() || this.folderId != 0 || this.communityId != 0 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
            return false;
        }
        this.isPremiumHintUpgrade = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
        return true;
    }

    private boolean isCacheHintVisible() {
        if (this.cacheSize == null || this.deviceSize == null) {
            return false;
        }
        if (r0.longValue() / this.deviceSize.longValue() >= 0.3f) {
            return System.currentTimeMillis() > MessagesController.getGlobalMainSettings().getLong("cache_hint_showafter", 0L);
        }
        clearCacheHintVisible();
        return false;
    }

    private void resetCacheHintVisible() {
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        long j = globalMainSettings.getLong("cache_hint_period", 604800000L);
        if (j <= 604800000) {
            j = 2592000000L;
        }
        globalMainSettings.edit().putLong("cache_hint_showafter", System.currentTimeMillis() + j).putLong("cache_hint_period", j).apply();
    }

    private void clearCacheHintVisible() {
        MessagesController.getGlobalMainSettings().edit().remove("cache_hint_showafter").remove("cache_hint_period").apply();
    }

    public void showSelectStatusDialog() {
        int iCenterX;
        int i;
        if (this.selectAnimatedEmojiDialog != null || SharedConfig.appLocked) {
            return;
        }
        if (!this.hasStories || this.dialogStoriesCell.isExpanded()) {
            final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
            TLRPC.User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            SimpleTextView titleTextView = this.actionBar.getTitleTextView();
            if (titleTextView == null || titleTextView.getRightDrawable() == null) {
                iCenterX = 0;
                i = 0;
            } else {
                this.statusDrawable.play();
                boolean z = this.statusDrawable.getDrawable() instanceof AnimatedEmojiDrawable;
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(titleTextView.getRightDrawable().getBounds());
                rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
                int iDp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
                iCenterX = (rect.centerX() - AndroidUtilities.dp(16.0f)) + AndroidUtilities.dp(4.0f);
                AnimatedStatusView animatedStatusView = this.animatedStatusView;
                if (animatedStatusView != null) {
                    animatedStatusView.translate(rect.centerX(), rect.centerY());
                }
                i = iDp;
            }
            int i2 = i;
            SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(iCenterX), 0, getResourceProvider()) {
                @Override
                protected boolean willApplyEmoji(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    return tL_starGiftUnique == null || StarsController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).findUserStarGift(tL_starGiftUnique.id) == null || MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) >= 2;
                }

                @Override
                protected void onEmojiSelected(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
                    TLRPC.TL_emojiStatus tL_emojiStatus;
                    TLRPC.EmojiStatus tL_emojiStatusEmpty;
                    if (l == null) {
                        tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
                    } else {
                        if (tL_starGiftUnique != null) {
                            TL_stars.SavedStarGift savedStarGiftFindUserStarGift = StarsController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).findUserStarGift(tL_starGiftUnique.id);
                            if (savedStarGiftFindUserStarGift != null && MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) < 2) {
                                MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", MessagesController.getGlobalMainSettings().getInt("statusgiftpage", 0) + 1).apply();
                                new StarGiftSheet(getContext(), ((BaseFragment) DialogsActivity.this).currentAccount, UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getClientUserId(), ((BaseFragment) DialogsActivity.this).resourceProvider).set(savedStarGiftFindUserStarGift, (StarsController.IGiftsList) null).setupWearPage().show();
                                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                                    DialogsActivity.this.selectAnimatedEmojiDialog = null;
                                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                                    return;
                                }
                                return;
                            }
                            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
                            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
                            tL_emojiStatus = tL_inputEmojiStatusCollectible;
                            if (num != null) {
                                tL_inputEmojiStatusCollectible.flags |= 1;
                                tL_inputEmojiStatusCollectible.until = num.intValue();
                                tL_emojiStatus = tL_inputEmojiStatusCollectible;
                            }
                        } else {
                            TLRPC.TL_emojiStatus tL_emojiStatus2 = new TLRPC.TL_emojiStatus();
                            tL_emojiStatus2.document_id = l.longValue();
                            tL_emojiStatus = tL_emojiStatus2;
                            if (num != null) {
                                tL_emojiStatus2.flags |= 1;
                                tL_emojiStatus2.until = num.intValue();
                                tL_emojiStatus = tL_emojiStatus2;
                            }
                        }
                        tL_emojiStatusEmpty = tL_emojiStatus;
                    }
                    DialogsActivity.this.getMessagesController().updateEmojiStatus(tL_emojiStatusEmpty, tL_starGiftUnique);
                    if (l != null) {
                        DialogsActivity.this.animatedStatusView.animateChange(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l));
                    }
                    if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                        DialogsActivity.this.selectAnimatedEmojiDialog = null;
                        selectAnimatedEmojiDialogWindowArr[0].dismiss();
                    }
                }
            };
            if (currentUser != null && DialogObject.getEmojiStatusUntil(currentUser.emoji_status) > 0) {
                selectAnimatedEmojiDialog.setExpireDateHint(DialogObject.getEmojiStatusUntil(currentUser.emoji_status));
            }
            Long l = this.statusDrawableGiftId;
            if (l != null) {
                selectAnimatedEmojiDialog.setSelected(l);
            } else {
                selectAnimatedEmojiDialog.setSelected(this.statusDrawable.getDrawable() instanceof AnimatedEmojiDrawable ? Long.valueOf(((AnimatedEmojiDrawable) this.statusDrawable.getDrawable()).getDocumentId()) : null);
            }
            selectAnimatedEmojiDialog.setSaveState(1);
            selectAnimatedEmojiDialog.setScrimDrawable(this.statusDrawable, titleTextView);
            int i3 = -2;
            SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, i3, i3) {
                @Override
                public void dismiss() {
                    super.dismiss();
                    DialogsActivity.this.selectAnimatedEmojiDialog = null;
                }
            };
            this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
            selectAnimatedEmojiDialogWindow.showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i2, 48);
            selectAnimatedEmojiDialogWindowArr[0].dimBehind();
        }
    }

    public void showPremiumBlockedToast(View view, long j) {
        String userName;
        Bulletin bulletinCreateSimpleBulletin;
        int i = -this.shiftDp;
        this.shiftDp = i;
        AndroidUtilities.shakeViewSpring(view, i);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        if (j < 0) {
            userName = "";
        } else {
            userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j)));
        }
        if (getMessagesController().premiumFeaturesBlocked()) {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)));
        } else {
            bulletinCreateSimpleBulletin = BulletinFactory.of(this).createSimpleBulletin(R.raw.star_premium_2, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserBlockedNonPremium, userName)), LocaleController.getString(R.string.UserBlockedNonPremiumButton), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showPremiumBlockedToast$33();
                }
            });
        }
        bulletinCreateSimpleBulletin.show();
    }

    public void lambda$showPremiumBlockedToast$33() {
        if (LaunchActivity.getLastFragment() != null) {
            presentFragment(new PremiumPreviewFragment("noncontacts"));
        }
    }

    public void lambda$updateDialogsHint$41() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.lambda$updateDialogsHint$41():void");
    }

    public void lambda$updateDialogsHint$34(View view) {
        AccountFrozenAlert.show(getContext(), this.currentAccount, getResourceProvider());
    }

    public void lambda$updateDialogsHint$35(View view) {
        PasskeysActivity.showLearnSheet(getContext(), this.currentAccount, this.resourceProvider, true);
    }

    public void lambda$updateDialogsHint$36(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "SETUP_PASSKEY");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$37(View view) {
        Browser.openUrl(getContext(), getMessagesController().premiumManageSubscriptionUrl);
    }

    public void lambda$updateDialogsHint$38(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "PREMIUM_GRACE");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$39(TLRPC.TL_pendingSuggestion tL_pendingSuggestion, View view) {
        Browser.openUrl(getContext(), tL_pendingSuggestion.url);
    }

    public void lambda$updateDialogsHint$40(TLRPC.TL_pendingSuggestion tL_pendingSuggestion, View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, tL_pendingSuggestion.suggestion);
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$42(long j, String str, long j2, View view) {
        new StarsIntroActivity.StarsNeededSheet(getContext(), getResourceProvider(), j, 2, str, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$41();
            }
        }, j2).show();
    }

    public void lambda$updateDialogsHint$43(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "STARS_SUBSCRIPTION_LOW_BALANCE");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$44(BirthdayController.BirthdayState birthdayState, View view) {
        if (birthdayState != null && birthdayState.today.size() == 1) {
            showDialog(new GiftSheet(getContext(), this.currentAccount, birthdayState.today.get(0).id, null, null).setBirthday());
        } else {
            UserSelectorBottomSheet.open(0L, birthdayState);
        }
    }

    public void lambda$updateDialogsHint$45(View view) {
        BirthdayController.getInstance(this.currentAccount).hide();
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_CONTACTS_TODAY");
        lambda$updateDialogsHint$41();
        BulletinFactory.of(this).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.BoostingPremiumChristmasToast), 4).setDuration(5000).show();
    }

    public void lambda$updateDialogsHint$50(View view) {
        showDialog(AlertsCreator.createBirthdayPickerDialog(getContext(), LocaleController.getString(R.string.EditProfileBirthdayTitle), LocaleController.getString(R.string.EditProfileBirthdayButton), null, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$updateDialogsHint$48((TL_account.TL_birthday) obj);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$49();
            }
        }, false, false, getResourceProvider()).create());
    }

    public void lambda$updateDialogsHint$48(TL_account.TL_birthday tL_birthday) {
        TL_account.updateBirthday updatebirthday = new TL_account.updateBirthday();
        updatebirthday.flags |= 1;
        updatebirthday.birthday = tL_birthday;
        final TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        final TL_account.TL_birthday tL_birthday2 = userFull != null ? userFull.birthday : null;
        if (userFull != null) {
            userFull.flags2 |= 32;
            userFull.birthday = tL_birthday;
        }
        getMessagesController().invalidateContentSettings();
        getConnectionsManager().sendRequest(updatebirthday, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$updateDialogsHint$47(userFull, tL_birthday2, tLObject, tL_error);
            }
        }, 1024);
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$47(final TLRPC.UserFull userFull, final TL_account.TL_birthday tL_birthday, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$46(tLObject, userFull, tL_birthday, tL_error);
            }
        });
    }

    public void lambda$updateDialogsHint$46(TLObject tLObject, TLRPC.UserFull userFull, TL_account.TL_birthday tL_birthday, TLRPC.TL_error tL_error) {
        String str;
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.PrivacyBirthdaySetDone), LocaleController.getString(R.string.PrivacyBirthdaySetDoneInfo)).setDuration(5000).show();
            return;
        }
        if (userFull != null) {
            if (tL_birthday == null) {
                userFull.flags2 &= -33;
            } else {
                userFull.flags2 |= 32;
            }
            userFull.birthday = tL_birthday;
            getMessagesStorage().updateUserInfo(userFull, false);
        }
        if (tL_error != null && (str = tL_error.text) != null && str.startsWith("FLOOD_WAIT_")) {
            if (getContext() != null) {
                showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.PrivacyBirthdayTooOftenTitle)).setMessage(LocaleController.getString(R.string.PrivacyBirthdayTooOftenMessage)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
                return;
            }
            return;
        }
        BulletinFactory.of(this).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError)).show();
    }

    public void lambda$updateDialogsHint$49() {
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        showAsSheet(new PrivacyControlActivity(11), bottomSheetParams);
    }

    public void lambda$updateDialogsHint$52(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "BIRTHDAY_SETUP");
        lambda$updateDialogsHint$41();
        BulletinFactory.of(this).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.BirthdaySetupLater), LocaleController.getString(R.string.Settings), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$51();
            }
        }).setDuration(5000).show();
    }

    public void lambda$updateDialogsHint$51() {
        presentFragment(new UserInfoActivity());
    }

    public void lambda$updateDialogsHint$54(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "PREMIUM_CHRISTMAS");
        lambda$updateDialogsHint$41();
        BulletinFactory.of(this).createSimpleBulletin(R.raw.gift, LocaleController.getString(R.string.BoostingPremiumChristmasToast), 4).setDuration(5000).show();
    }

    public void lambda$updateDialogsHint$56(View view) {
        presentFragment(new PremiumPreviewFragment("dialogs_hint").setSelectAnnualByDefault());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$55();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$55() {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$58(View view) {
        presentFragment(new PremiumPreviewFragment("dialogs_hint").setSelectAnnualByDefault());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$57();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$57() {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, this.isPremiumHintUpgrade ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$60(View view) {
        presentFragment(new CacheControlActivity());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$59();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$59() {
        resetCacheHintVisible();
        lambda$updateDialogsHint$41();
    }

    public void lambda$updateDialogsHint$61(View view) {
        openSetAvatar();
    }

    public void lambda$updateDialogsHint$62(View view) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
        lambda$updateDialogsHint$41();
    }

    public static void lambda$updateDialogsHint$63(String str, View view) {
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onSuggestionClick(str);
        }
    }

    public void lambda$updateDialogsHint$65(final String str, View view) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateDialogsHint$64(str);
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$64(String str) {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, str);
        lambda$updateDialogsHint$41();
    }

    private void checkUnconfirmedAuthHintCellVisibility() {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (this.fragmentView == null || this.topPanelLayout == null) {
            return;
        }
        boolean z = !isInPreviewMode() && this.folderId == 0 && this.communityId == 0 && this.initialDialogsType == 0 && !getMessagesController().getUnconfirmedAuthController().auths.isEmpty() && ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment()) && !this.animatorSearchVisible.getValue();
        if (z) {
            if (this.authHintCell == null) {
                UnconfirmedAuthHintCell unconfirmedAuthHintCell = new UnconfirmedAuthHintCell(getContext());
                this.authHintCell = unconfirmedAuthHintCell;
                this.topPanelLayout.addView(unconfirmedAuthHintCell);
            }
            this.authHintCell.set(this, this.currentAccount);
        }
        UnconfirmedAuthHintCell unconfirmedAuthHintCell2 = this.authHintCell;
        if (unconfirmedAuthHintCell2 != null) {
            this.topPanelLayout.setViewVisible(unconfirmedAuthHintCell2, z);
        }
    }

    private void checkActiveGiftAuctionsHintCellVisibility() {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (this.fragmentView == null || this.topPanelLayout == null) {
            return;
        }
        boolean z = !isInPreviewMode() && this.folderId == 0 && this.communityId == 0 && this.initialDialogsType == 0 && getGiftAuctionsController().hasActiveAuctions() && ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment()) && !this.animatorSearchVisible.getValue();
        if (z && this.activeGiftAuctionsHintCell == null) {
            ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell = new ActiveGiftAuctionsHintCell(getContext(), this.currentAccount);
            this.activeGiftAuctionsHintCell = activeGiftAuctionsHintCell;
            this.topPanelLayout.addView(activeGiftAuctionsHintCell);
        }
        ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell2 = this.activeGiftAuctionsHintCell;
        if (activeGiftAuctionsHintCell2 != null) {
            this.topPanelLayout.setViewVisible(activeGiftAuctionsHintCell2, z);
        }
    }

    public void createGroupForThis() {
        long[] jArr;
        final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
        TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast) {
            Bundle bundle = new Bundle();
            bundle.putInt("step", 0);
            Boolean bool = this.requestPeerType.has_username;
            if (bool != null) {
                bundle.putBoolean("forcePublic", bool.booleanValue());
            }
            final ChannelCreateActivity channelCreateActivity = new ChannelCreateActivity(bundle);
            channelCreateActivity.setOnFinishListener(new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$createGroupForThis$75(channelCreateActivity, alertDialog, (BaseFragment) obj, (Long) obj2);
                }
            });
            presentFragment(channelCreateActivity);
            return;
        }
        if (requestPeerType instanceof TLRPC.TL_requestPeerTypeChat) {
            Bundle bundle2 = new Bundle();
            Boolean bool2 = this.requestPeerType.bot_participant;
            if (bool2 != null && bool2.booleanValue()) {
                jArr = new long[]{getUserConfig().getClientUserId(), this.requestPeerBotId};
            } else {
                jArr = new long[]{getUserConfig().getClientUserId()};
            }
            bundle2.putLongArray("result", jArr);
            Boolean bool3 = this.requestPeerType.forum;
            bundle2.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle2.putBoolean("canToggleTopics", false);
            GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
            groupCreateFinalActivity.setDelegate(new AnonymousClass30(alertDialog));
            presentFragment(groupCreateFinalActivity);
        }
    }

    public void lambda$createGroupForThis$75(final ChannelCreateActivity channelCreateActivity, final AlertDialog alertDialog, final BaseFragment baseFragment, final Long l) {
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createGroupForThis$67(l, channelCreateActivity, baseFragment, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createGroupForThis$69(alertDialog, l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createGroupForThis$71(l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createGroupForThis$73(l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$createGroupForThis$74(alertDialog, l, channelCreateActivity, baseFragment, (Runnable) obj);
            }
        });
    }

    public void lambda$createGroupForThis$67(Long l, final ChannelCreateActivity channelCreateActivity, final BaseFragment baseFragment, Runnable runnable) {
        showSendToBotAlert(getMessagesController().getChat(l), runnable, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createGroupForThis$66(channelCreateActivity, baseFragment);
            }
        });
    }

    public void lambda$createGroupForThis$66(ChannelCreateActivity channelCreateActivity, BaseFragment baseFragment) {
        removeSelfFromStack();
        channelCreateActivity.removeSelfFromStack();
        baseFragment.finishFragment();
    }

    public void lambda$createGroupForThis$69(AlertDialog alertDialog, Long l, final Runnable runnable) {
        alertDialog.showDelayed(150L);
        Boolean bool = this.requestPeerType.bot_participant;
        if (bool != null && bool.booleanValue()) {
            getMessagesController().addUserToChat(l.longValue(), getMessagesController().getUser(Long.valueOf(this.requestPeerBotId)), 0, null, this, false, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return DialogsActivity.lambda$createGroupForThis$68(runnable, tL_error);
                }
            });
        } else {
            runnable.run();
        }
    }

    public static boolean lambda$createGroupForThis$68(Runnable runnable, TLRPC.TL_error tL_error) {
        runnable.run();
        return true;
    }

    public void lambda$createGroupForThis$71(Long l, final Runnable runnable) {
        if (this.requestPeerType.bot_admin_rights != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
            MessagesController messagesController = getMessagesController();
            long jLongValue = l.longValue();
            TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
            TLRPC.TL_chatAdminRights tL_chatAdminRights = requestPeerType.bot_admin_rights;
            Boolean bool = requestPeerType.bot_participant;
            messagesController.setUserAdminRole(jLongValue, user, tL_chatAdminRights, null, false, this, bool == null || !bool.booleanValue(), true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return DialogsActivity.lambda$createGroupForThis$70(runnable, tL_error);
                }
            });
            return;
        }
        runnable.run();
    }

    public static boolean lambda$createGroupForThis$70(Runnable runnable, TLRPC.TL_error tL_error) {
        runnable.run();
        return true;
    }

    public void lambda$createGroupForThis$73(Long l, final Runnable runnable) {
        if (this.requestPeerType.user_admin_rights != null) {
            getMessagesController().setUserAdminRole(l.longValue(), getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(getMessagesController().getChat(l).admin_rights, this.requestPeerType.user_admin_rights), null, true, this, false, true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return DialogsActivity.lambda$createGroupForThis$72(runnable, tL_error);
                }
            });
        } else {
            runnable.run();
        }
    }

    public static boolean lambda$createGroupForThis$72(Runnable runnable, TLRPC.TL_error tL_error) {
        runnable.run();
        return true;
    }

    public void lambda$createGroupForThis$74(AlertDialog alertDialog, Long l, ChannelCreateActivity channelCreateActivity, BaseFragment baseFragment, Runnable runnable) {
        alertDialog.dismiss();
        getMessagesController().loadChannelParticipants(l);
        DialogsActivityDelegate dialogsActivityDelegate = this.delegate;
        removeSelfFromStack();
        channelCreateActivity.removeSelfFromStack();
        baseFragment.finishFragment();
        if (dialogsActivityDelegate != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MessagesStorage.TopicKey.of(-l.longValue(), 0L));
            dialogsActivityDelegate.didSelectDialogs(this, arrayList, null, false, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, null);
        }
    }

    class AnonymousClass30 implements GroupCreateFinalActivity.GroupCreateFinalActivityDelegate {
        final AlertDialog val$progress;

        @Override
        public void didFailChatCreation() {
        }

        @Override
        public void didStartChatCreation() {
        }

        AnonymousClass30(AlertDialog alertDialog) {
            this.val$progress = alertDialog;
        }

        @Override
        public void didFinishChatCreation(GroupCreateFinalActivity groupCreateFinalActivity, final long j) {
            final BaseFragment[] baseFragmentArr = {groupCreateFinalActivity, null};
            Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$1(j, baseFragmentArr, (Runnable) obj);
                }
            };
            Utilities.Callback callback2 = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$3(j, baseFragmentArr, (Runnable) obj);
                }
            };
            final AlertDialog alertDialog = this.val$progress;
            Utilities.Callback callback3 = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$5(alertDialog, j, (Runnable) obj);
                }
            };
            Utilities.Callback callback4 = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$7(j, (Runnable) obj);
                }
            };
            Utilities.Callback callback5 = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$9(j, (Runnable) obj);
                }
            };
            final AlertDialog alertDialog2 = this.val$progress;
            Utilities.doCallbacks(callback, callback2, callback3, callback4, callback5, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$didFinishChatCreation$10(alertDialog2, j, baseFragmentArr, (Runnable) obj);
                }
            });
        }

        public void lambda$didFinishChatCreation$1(long j, BaseFragment[] baseFragmentArr, final Runnable runnable) {
            if (DialogsActivity.this.requestPeerType.has_username != null && DialogsActivity.this.requestPeerType.has_username.booleanValue()) {
                Bundle bundle = new Bundle();
                bundle.putInt("step", 1);
                bundle.putLong("chat_id", j);
                bundle.putBoolean("forcePublic", DialogsActivity.this.requestPeerType.has_username.booleanValue());
                ChannelCreateActivity channelCreateActivity = new ChannelCreateActivity(bundle);
                channelCreateActivity.setOnFinishListener(new Utilities.Callback2() {
                    @Override
                    public final void run(Object obj, Object obj2) {
                        runnable.run();
                    }
                });
                DialogsActivity.this.presentFragment(channelCreateActivity);
                baseFragmentArr[1] = channelCreateActivity;
                return;
            }
            runnable.run();
        }

        public void lambda$didFinishChatCreation$3(long j, final BaseFragment[] baseFragmentArr, Runnable runnable) {
            DialogsActivity.this.showSendToBotAlert(DialogsActivity.this.getMessagesController().getChat(Long.valueOf(j)), runnable, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didFinishChatCreation$2(baseFragmentArr);
                }
            });
        }

        public void lambda$didFinishChatCreation$2(BaseFragment[] baseFragmentArr) {
            DialogsActivity.this.removeSelfFromStack();
            if (baseFragmentArr[1] != null) {
                baseFragmentArr[0].removeSelfFromStack();
                baseFragmentArr[1].finishFragment();
            } else {
                baseFragmentArr[0].finishFragment();
            }
        }

        public void lambda$didFinishChatCreation$5(AlertDialog alertDialog, long j, final Runnable runnable) {
            alertDialog.showDelayed(150L);
            if (DialogsActivity.this.requestPeerType.bot_participant != null && DialogsActivity.this.requestPeerType.bot_participant.booleanValue()) {
                DialogsActivity.this.getMessagesController().addUserToChat(j, DialogsActivity.this.getMessagesController().getUser(Long.valueOf(DialogsActivity.this.requestPeerBotId)), 0, null, DialogsActivity.this, false, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC.TL_error tL_error) {
                        return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$4(runnable, tL_error);
                    }
                });
            } else {
                runnable.run();
            }
        }

        public static boolean lambda$didFinishChatCreation$4(Runnable runnable, TLRPC.TL_error tL_error) {
            runnable.run();
            return true;
        }

        public void lambda$didFinishChatCreation$7(long j, final Runnable runnable) {
            if (DialogsActivity.this.requestPeerType.bot_admin_rights != null) {
                TLRPC.User user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(DialogsActivity.this.requestPeerBotId));
                MessagesController messagesController = DialogsActivity.this.getMessagesController();
                TLRPC.TL_chatAdminRights tL_chatAdminRights = DialogsActivity.this.requestPeerType.bot_admin_rights;
                DialogsActivity dialogsActivity = DialogsActivity.this;
                messagesController.setUserAdminRole(j, user, tL_chatAdminRights, null, false, dialogsActivity, dialogsActivity.requestPeerType.bot_participant == null || !DialogsActivity.this.requestPeerType.bot_participant.booleanValue(), true, null, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC.TL_error tL_error) {
                        return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$6(runnable, tL_error);
                    }
                });
                return;
            }
            runnable.run();
        }

        public static boolean lambda$didFinishChatCreation$6(Runnable runnable, TLRPC.TL_error tL_error) {
            runnable.run();
            return true;
        }

        public void lambda$didFinishChatCreation$9(long j, final Runnable runnable) {
            if (DialogsActivity.this.requestPeerType.user_admin_rights != null) {
                DialogsActivity.this.getMessagesController().setUserAdminRole(j, DialogsActivity.this.getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(DialogsActivity.this.getMessagesController().getChat(Long.valueOf(j)).admin_rights, DialogsActivity.this.requestPeerType.user_admin_rights), null, false, DialogsActivity.this, false, true, null, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC.TL_error tL_error) {
                        return DialogsActivity.AnonymousClass30.lambda$didFinishChatCreation$8(runnable, tL_error);
                    }
                });
            } else {
                runnable.run();
            }
        }

        public static boolean lambda$didFinishChatCreation$8(Runnable runnable, TLRPC.TL_error tL_error) {
            runnable.run();
            return true;
        }

        public void lambda$didFinishChatCreation$10(AlertDialog alertDialog, long j, BaseFragment[] baseFragmentArr, Runnable runnable) {
            alertDialog.dismiss();
            DialogsActivity.this.getMessagesController().loadChannelParticipants(Long.valueOf(j));
            DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
            DialogsActivity.this.removeSelfFromStack();
            if (baseFragmentArr[1] != null) {
                baseFragmentArr[0].removeSelfFromStack();
                baseFragmentArr[1].finishFragment();
            } else {
                baseFragmentArr[0].finishFragment();
            }
            if (dialogsActivityDelegate != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(MessagesStorage.TopicKey.of(-j, 0L));
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivityDelegate.didSelectDialogs(dialogsActivity, arrayList, null, false, dialogsActivity.notify, dialogsActivity.scheduleDate, dialogsActivity.scheduleRepeatPeriod, null);
            }
        }
    }

    public void updateContextViewPosition() {
        float f;
        float f2;
        float alpha;
        float fDp;
        float animatedHeightWithPadding;
        SearchTabsAndFiltersLayout searchTabsAndFiltersLayout = this.searchTabsAndFiltersLayout;
        float f3 = 0.0f;
        float measuredHeight = (searchTabsAndFiltersLayout == null || searchTabsAndFiltersLayout.getVisibility() == 8) ? 0.0f : this.searchTabsAndFiltersLayout.getMeasuredHeight();
        float fDp2 = this.hasStories ? AndroidUtilities.dp(81.0f) : 0.0f;
        if (this.hasStories) {
            float f4 = this.scrollYOffset;
            float f5 = this.searchAnimationProgress;
            f = f4 + (fDp2 * (1.0f - f5)) + (measuredHeight * f5) + this.tabsYOffset;
        } else {
            f = this.scrollYOffset + (measuredHeight * this.searchAnimationProgress) + this.tabsYOffset;
        }
        float f6 = f + this.storiesOverscroll;
        FragmentSearchField fragmentSearchField = this.fragmentSearchField;
        float fDp3 = AndroidUtilities.dp(4.0f) * ((fragmentSearchField == null || fragmentSearchField.getVisibility() != 0) ? 0.0f : this.fragmentSearchField.getAlpha());
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.setTranslationY(f6 - fDp3);
            alpha = this.filterTabsView.getAlpha();
            fDp = AndroidUtilities.dp(43.0f) * alpha;
            f2 = f6 + fDp;
        } else {
            f2 = f6;
            alpha = 0.0f;
            fDp = 0.0f;
        }
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout != null) {
            dialogsActivityTopPanelLayout.setTranslationY(AndroidUtilities.lerp(f2 - fDp3, (-AndroidUtilities.dp(3.0f)) - (this.searchTabsView == null ? AndroidUtilities.dp(44.0f) : 0), this.animatorSearchVisible.getFloatValue()));
            float totalVisibility = this.topPanelLayout.getMetadata().getTotalVisibility();
            animatedHeightWithPadding = this.topPanelLayout.getAnimatedHeightWithPadding(0.0f);
            f3 = totalVisibility;
        } else {
            animatedHeightWithPadding = 0.0f;
        }
        DialogsActivityTopBubblesFadeView dialogsActivityTopBubblesFadeView = this.topBubblesFadeView;
        if (dialogsActivityTopBubblesFadeView != null) {
            dialogsActivityTopBubblesFadeView.setTranslationY(f6 - fDp3);
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(50.0f), Math.min(f3, alpha));
            this.topBubblesFadeView.setPosition(fLerp, Math.min(AndroidUtilities.dp(40.0f), (animatedHeightWithPadding + fDp) - fLerp));
            this.topBubblesFadeView.setAlpha(Math.max(alpha, f3));
        }
    }

    public void updateFiltersView(boolean r11, java.util.ArrayList r12, java.util.ArrayList r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.updateFiltersView(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    private void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        SearchViewPager searchViewPager;
        if (this.searchIsShowed && (searchViewPager = this.searchViewPager) != null && searchViewPager.addSearchFilter(mediaFilterData)) {
            this.fragmentSearchField.addSearchFilter(mediaFilterData);
            this.fragmentSearchField.editText.getText().clear();
            updateFiltersView(true, null, null, false, true);
        }
    }

    public void updateSpeedItem(boolean z) {
        boolean z2;
        boolean z3;
        if (this.speedItem == null) {
            return;
        }
        Iterator<MessageObject> it = getDownloadController().downloadingFiles.iterator();
        while (true) {
            z2 = false;
            if (!it.hasNext()) {
                z3 = false;
                break;
            }
            MessageObject next = it.next();
            if (next.getDocument() != null && next.getDocument().size >= 157286400) {
                z3 = true;
                break;
            }
        }
        Iterator<MessageObject> it2 = getDownloadController().recentDownloadingFiles.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            MessageObject next2 = it2.next();
            if (next2.getDocument() != null && next2.getDocument().size >= 157286400) {
                z3 = true;
                break;
            }
        }
        if (!getUserConfig().isPremium() && !getMessagesController().premiumFeaturesBlocked() && z3 && z) {
            z2 = true;
        }
        this.animatorSpeedButtonVisible.setValue(z2, true);
    }

    private void createActionMode(String str) {
        if (this.actionBar.actionModeIsExist(str)) {
            return;
        }
        ActionBarMenu actionBarMenuCreateActionMode = this.actionBar.createActionMode(false, str);
        if (this.hasMainTabs) {
            ImageView imageView = new ImageView(getContext());
            this.actionModeCloseView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.actionModeCloseView.setImageDrawable(new BackDrawable(true));
            this.actionModeCloseView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.MULTIPLY));
            this.actionModeCloseView.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_actionBarActionModeDefaultSelector)));
            this.actionModeCloseView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$createActionMode$76(view);
                }
            });
            actionBarMenuCreateActionMode.addView(this.actionModeCloseView, LayoutHelper.createLinear(54, 54, 16));
            this.actionModeViews.add(this.actionModeCloseView);
        }
        NumberTextView numberTextView = new NumberTextView(actionBarMenuCreateActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.bold());
        this.selectedDialogsCountTextView.setTextColor(getThemedColor(Theme.key_actionBarActionModeDefaultIcon));
        actionBarMenuCreateActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, this.hasMainTabs ? 18 : 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return DialogsActivity.lambda$createActionMode$77(view, motionEvent);
            }
        });
        int i = R.drawable.msg_pin;
        this.pinItem = actionBarMenuCreateActionMode.addItemWithWidth(100, i, AndroidUtilities.dp(54.0f));
        this.muteItem = actionBarMenuCreateActionMode.addItemWithWidth(104, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
        int i2 = R.drawable.msg_archive;
        this.archive2Item = actionBarMenuCreateActionMode.addItemWithWidth(107, i2, AndroidUtilities.dp(54.0f));
        this.deleteItem = actionBarMenuCreateActionMode.addItemWithWidth(102, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.Delete));
        ActionBarMenuItem actionBarMenuItemAddItemWithWidth = actionBarMenuCreateActionMode.addItemWithWidth(0, R.drawable.ic_ab_other, AndroidUtilities.dp(54.0f), LocaleController.getString(R.string.AccDescrMoreOptions));
        this.archiveItem = actionBarMenuItemAddItemWithWidth.addSubItem(105, i2, LocaleController.getString(R.string.Archive));
        this.pin2Item = actionBarMenuItemAddItemWithWidth.addSubItem(108, i, LocaleController.getString(R.string.DialogPin));
        this.addToFolderItem = actionBarMenuItemAddItemWithWidth.addSubItem(109, R.drawable.msg_addfolder, LocaleController.getString(R.string.FilterAddTo));
        this.removeFromFolderItem = actionBarMenuItemAddItemWithWidth.addSubItem(110, R.drawable.msg_removefolder, LocaleController.getString(R.string.FilterRemoveFrom));
        this.readItem = actionBarMenuItemAddItemWithWidth.addSubItem(101, R.drawable.msg_markread, LocaleController.getString(R.string.MarkAsRead));
        this.clearItem = actionBarMenuItemAddItemWithWidth.addSubItem(103, R.drawable.msg_clear, LocaleController.getString(R.string.ClearHistory));
        this.blockItem = actionBarMenuItemAddItemWithWidth.addSubItem(106, R.drawable.msg_block, LocaleController.getString(R.string.BlockUser));
        this.muteItem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                return this.f$0.lambda$createActionMode$78(view);
            }
        });
        this.actionModeViews.add(this.pinItem);
        this.actionModeViews.add(this.archive2Item);
        this.actionModeViews.add(this.muteItem);
        this.actionModeViews.add(this.deleteItem);
        this.actionModeViews.add(actionBarMenuItemAddItemWithWidth);
        updateCounters(false);
    }

    public void lambda$createActionMode$76(View view) {
        hideActionMode(true);
    }

    public boolean lambda$createActionMode$78(View view) {
        performSelectedDialogsAction(this.selectedDialogs, 104, true, true);
        return true;
    }

    public void closeSearching() {
        ActionBar actionBar = this.actionBar;
        if (actionBar == null || !actionBar.isSearchFieldVisible()) {
            return;
        }
        this.actionBar.closeSearchField();
        this.searchIsShowed = false;
        updateFilterTabs(true, true);
    }

    public void scrollToFolder(int i) {
        if (this.filterTabsView == null) {
            updateFilterTabs(true, true);
            if (this.filterTabsView == null) {
                return;
            }
        }
        int tabsCount = this.filterTabsView.getTabsCount() - 1;
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        int i2 = 0;
        while (true) {
            if (i2 >= dialogFilters.size()) {
                break;
            }
            if (dialogFilters.get(i2).id == i) {
                tabsCount = i2;
                break;
            }
            i2++;
        }
        FilterTabsView.Tab tab = this.filterTabsView.getTab(tabsCount);
        if (tab != null) {
            ViewPage[] viewPageArr = this.viewPages;
            if (viewPageArr == null || viewPageArr.length <= 0 || viewPageArr[0].selectedType != tab.id) {
                this.filterTabsView.scrollToTab(tab, tabsCount);
                return;
            }
            return;
        }
        this.filterTabsView.selectLastTab();
    }

    public void switchToCurrentSelectedMode(boolean z) {
        ViewPage[] viewPageArr;
        int i = 0;
        int i2 = 0;
        while (true) {
            viewPageArr = this.viewPages;
            if (i2 >= viewPageArr.length) {
                break;
            }
            viewPageArr[i2].listView.stopScroll();
            i2++;
        }
        char c = (!z || viewPageArr.length <= 1) ? (char) 0 : (char) 1;
        if (viewPageArr[c].selectedType < 0 || this.viewPages[c].selectedType >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.viewPages[c].selectedType);
        if (dialogFilter.isDefault()) {
            this.viewPages[c].dialogsType = this.initialDialogsType;
            this.viewPages[c].listView.updatePullState();
        } else {
            if (this.viewPages[c ^ 1].dialogsType == 7) {
                this.viewPages[c].dialogsType = 8;
            } else {
                this.viewPages[c].dialogsType = 7;
            }
            this.viewPages[c].listView.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.viewPages[c].dialogsType == 8 ? 1 : 0);
        }
        ViewPage[] viewPageArr2 = this.viewPages;
        if (viewPageArr2.length > 1) {
            viewPageArr2[1].isLocked = dialogFilter.locked;
        }
        this.viewPages[c].dialogsAdapter.setDialogsType(this.viewPages[c].dialogsType);
        LinearLayoutManager linearLayoutManager = this.viewPages[c].layoutManager;
        if (this.viewPages[c].dialogsType == 0 && hasHiddenArchive() && this.viewPages[c].archivePullViewState == 2) {
            i = 1;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, (int) this.scrollYOffset);
        checkListLoad(this.viewPages[c]);
    }

    public void showScrollbars(boolean z) {
        if (this.viewPages == null || this.scrollBarVisible == z) {
            return;
        }
        this.scrollBarVisible = z;
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            if (z) {
                viewPageArr[i].listView.setScrollbarFadingEnabled(false);
            }
            this.viewPages[i].listView.setVerticalScrollBarEnabled(z);
            if (z) {
                this.viewPages[i].listView.setScrollbarFadingEnabled(true);
            }
            i++;
        }
    }

    public void updateFilterTabs(boolean z, boolean z2) {
        MessagesController.DialogFilter dialogFilter;
        boolean z3;
        int i;
        int i2;
        if (this.filterTabsView == null || this.inPreviewMode || this.searchIsShowed) {
            return;
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) {
            ItemOptions itemOptions = this.filterOptions;
            if (itemOptions != null) {
                itemOptions.dismiss();
                this.filterOptions = null;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            if (dialogFilters.size() > 1) {
                if (z || this.filterTabsView.getVisibility() != 0) {
                    boolean z4 = this.filterTabsView.getVisibility() != 0 ? false : z2;
                    this.canShowFilterTabsView = true;
                    boolean zIsEmpty = this.filterTabsView.isEmpty();
                    updateFilterTabsVisibility(z2);
                    int currentTabId = this.filterTabsView.getCurrentTabId();
                    int currentTabStableId = this.filterTabsView.getCurrentTabStableId();
                    if (currentTabId == this.filterTabsView.getDefaultTabId() || currentTabId < dialogFilters.size()) {
                        z3 = false;
                    } else {
                        this.filterTabsView.resetTabId();
                        z3 = true;
                    }
                    this.filterTabsView.removeTabs();
                    int size = dialogFilters.size();
                    int i3 = 0;
                    while (i3 < size) {
                        if (dialogFilters.get(i3).isDefault()) {
                            i2 = i3;
                            this.filterTabsView.addTab(i3, 0, LocaleController.getString(R.string.FilterAllChats), null, false, true, dialogFilters.get(i3).locked);
                        } else {
                            i2 = i3;
                            MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i2);
                            this.filterTabsView.addTab(i2, dialogFilter2.localId, dialogFilter2.name, dialogFilter2.entities, dialogFilter2.title_noanimate, false, dialogFilters.get(i2).locked);
                        }
                        i3 = i2 + 1;
                    }
                    if (currentTabStableId >= 0) {
                        if (z3 && !this.filterTabsView.selectTabWithStableId(currentTabStableId)) {
                            while (currentTabId >= 0) {
                                FilterTabsView filterTabsView = this.filterTabsView;
                                if (filterTabsView.selectTabWithStableId(filterTabsView.getStableId(currentTabId))) {
                                    break;
                                } else {
                                    currentTabId--;
                                }
                            }
                            if (currentTabId < 0) {
                                currentTabId = 0;
                            }
                        }
                        if (this.filterTabsView.getStableId(this.viewPages[0].selectedType) != currentTabStableId) {
                            this.viewPages[0].selectedType = currentTabId;
                            zIsEmpty = true;
                        }
                    }
                    int i4 = 0;
                    while (true) {
                        ViewPage[] viewPageArr = this.viewPages;
                        if (i4 >= viewPageArr.length) {
                            break;
                        }
                        if (viewPageArr[i4].selectedType >= dialogFilters.size()) {
                            i = 1;
                            this.viewPages[i4].selectedType = dialogFilters.size() - 1;
                        } else {
                            i = 1;
                        }
                        this.viewPages[i4].listView.setScrollingTouchSlop(i);
                        i4++;
                    }
                    this.filterTabsView.finishAddingTabs(z4);
                    if (zIsEmpty) {
                        switchToCurrentSelectedMode(false);
                    }
                    FilterTabsView filterTabsView2 = this.filterTabsView;
                    if (filterTabsView2.isLocked(filterTabsView2.getCurrentTabId())) {
                        this.filterTabsView.selectFirstTab();
                    }
                }
            } else if (this.filterTabsView.getVisibility() != 8) {
                this.filterTabsView.setIsEditing(false);
                showDoneItem(false);
                this.maybeStartTracking = false;
                if (this.startedTracking) {
                    this.startedTracking = false;
                    this.viewPages[0].setTranslationX(0.0f);
                    this.viewPages[1].setTranslationX(r3[0].getMeasuredWidth());
                }
                if (this.viewPages[0].selectedType != this.filterTabsView.getDefaultTabId()) {
                    this.viewPages[0].selectedType = this.filterTabsView.getDefaultTabId();
                    this.viewPages[0].dialogsAdapter.setDialogsType(0);
                    this.viewPages[0].dialogsType = this.initialDialogsType;
                    this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                }
                this.viewPages[1].setVisibility(8);
                this.viewPages[1].selectedType = 0;
                this.viewPages[1].dialogsAdapter.setDialogsType(0);
                this.viewPages[1].dialogsType = this.initialDialogsType;
                this.viewPages[1].dialogsAdapter.notifyDataSetChanged();
                this.canShowFilterTabsView = false;
                updateFilterTabsVisibility(z2);
                int i5 = 0;
                while (true) {
                    ViewPage[] viewPageArr2 = this.viewPages;
                    if (i5 >= viewPageArr2.length) {
                        break;
                    }
                    if (viewPageArr2[i5].dialogsType == 0 && this.viewPages[i5].archivePullViewState == 2 && hasHiddenArchive()) {
                        int iFindFirstVisibleItemPosition = this.viewPages[i5].layoutManager.findFirstVisibleItemPosition();
                        if (iFindFirstVisibleItemPosition == 0 || iFindFirstVisibleItemPosition == 1) {
                            this.viewPages[i5].layoutManager.scrollToPositionWithOffset(1, (int) this.scrollYOffset);
                        }
                    }
                    this.viewPages[i5].listView.setScrollingTouchSlop(0);
                    this.viewPages[i5].listView.requestLayout();
                    this.viewPages[i5].requestLayout();
                    i5++;
                }
                this.filterTabsView.resetTabId();
            }
            updateCounters(false);
            int i6 = this.viewPages[0].dialogsType;
            if ((i6 == 7 || i6 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i6 - 7]) != null) {
                for (int i7 = 0; i7 < dialogFilters.size(); i7++) {
                    MessagesController.DialogFilter dialogFilter3 = dialogFilters.get(i7);
                    if (dialogFilter3 != null && dialogFilter3.id == dialogFilter.id) {
                        return;
                    }
                }
                switchToCurrentSelectedMode(false);
            }
        }
    }

    @Override
    protected void onPanTranslationUpdate(float f) {
        if (this.viewPages == null) {
            return;
        }
        this.panTranslationY = f;
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        int i = 0;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            this.fragmentView.setTranslationY(f);
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].setTranslationY(0.0f);
                i++;
            }
            if (!this.onlySelect) {
                this.actionBar.setTranslationY(0.0f);
                Bulletin bulletin = this.topBulletin;
                if (bulletin != null) {
                    bulletin.updatePosition();
                }
            }
            SearchViewPager searchViewPager = this.searchViewPager;
            if (searchViewPager != null) {
                searchViewPager.setTranslationY(this.searchViewPagerTranslationY);
                return;
            }
            return;
        }
        while (true) {
            ViewPage[] viewPageArr2 = this.viewPages;
            if (i >= viewPageArr2.length) {
                break;
            }
            viewPageArr2[i].setTranslationY(f);
            i++;
        }
        if (!this.onlySelect) {
            this.actionBar.setTranslationY(f);
            Bulletin bulletin2 = this.topBulletin;
            if (bulletin2 != null) {
                bulletin2.updatePosition();
            }
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 != null) {
            searchViewPager2.setTranslationY(this.panTranslationY + this.searchViewPagerTranslationY);
        }
    }

    @Override
    public void finishFragment() {
        super.finishFragment();
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
    }

    @Override
    public void onResume() {
        ViewPage viewPage;
        int i;
        View view;
        super.onResume();
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if (dialogStoriesCell != null) {
            dialogStoriesCell.onResume();
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null) {
            rightSlidingDialogContainer.onResume();
        }
        if (!this.parentLayout.isInPreviewMode() && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        if (this.viewPages != null) {
            int i2 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i2 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i2].dialogsAdapter.notifyDataSetChanged();
                i2++;
            }
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onResume();
        }
        long j = 0;
        if (!this.onlySelect && this.folderId == 0 && this.communityId == 0) {
            getMediaDataController().checkStickers(4);
        }
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            searchViewPager.onResume();
        }
        boolean z = this.afterSignup || getUserConfig().unacceptedTermsOfService == null;
        NotificationManager notificationManager = (NotificationManager) getContext().getSystemService("notification");
        if (z && this.folderId == 0 && this.communityId == 0 && this.checkPermission && !this.onlySelect && (i = Build.VERSION.SDK_INT) >= 23) {
            final Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.checkPermission = false;
                boolean z2 = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                final boolean z3 = (i <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                boolean z4 = i >= 33 && parentActivity.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0;
                final boolean z5 = z4;
                final boolean z6 = z2;
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onResume$82(z5, z6, z3, parentActivity);
                    }
                };
                if (this.afterSignup && (z2 || z4)) {
                    j = 4000;
                }
                AndroidUtilities.runOnUIThread(runnable, j);
            }
        } else if (!this.onlySelect && this.folderId == 0 && this.communityId == 0 && XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020)) {
            if (getParentActivity() == null) {
                return;
            }
            if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                showDialog(new AlertDialog.Builder(getParentActivity()).setTopAnimation(R.raw.permission_request_apk, 72, false, getThemedColor(Theme.key_dialogTopBackground)).setMessage(LocaleController.getString(R.string.PermissionXiaomiLockscreen)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        this.f$0.lambda$onResume$83(alertDialog, i3);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        DialogsActivity.lambda$onResume$84(alertDialog, i3);
                    }
                }).create());
            }
        } else if (this.folderId == 0 && this.communityId == 0 && Build.VERSION.SDK_INT >= 34 && !notificationManager.canUseFullScreenIntent()) {
            if (getParentActivity() == null) {
                return;
            }
            if (!MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutFSILockscreen", false)) {
                showDialog(new AlertDialog.Builder(getParentActivity()).setTopAnimation(R.raw.permission_request_apk, 72, false, getThemedColor(Theme.key_dialogTopBackground)).setMessage(LocaleController.getString(R.string.PermissionFSILockscreen)).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        this.f$0.lambda$onResume$85(alertDialog, i3);
                    }
                }).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        DialogsActivity.lambda$onResume$86(alertDialog, i3);
                    }
                }).create());
            }
        }
        showFiltersHint();
        if (this.viewPages != null) {
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i3 >= viewPageArr2.length) {
                    break;
                }
                if (viewPageArr2[i3].dialogsType == 0 && this.viewPages[i3].archivePullViewState == 2 && this.viewPages[i3].layoutManager.findFirstVisibleItemPosition() == 0 && hasHiddenArchive()) {
                    this.viewPages[i3].layoutManager.scrollToPositionWithOffset(1, (int) this.scrollYOffset);
                }
                if (i3 == 0) {
                    this.viewPages[i3].dialogsAdapter.resume();
                } else {
                    this.viewPages[i3].dialogsAdapter.pause();
                }
                i3++;
            }
        }
        showNextSupportedSuggestion();
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
            public boolean clipWithGradient(int i4) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i4);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                if (DialogsActivity.this.undoView[0] == null || DialogsActivity.this.undoView[0].getVisibility() != 0) {
                    DialogsActivity.this.additionalFloatingTranslation = Math.max(0.0f, (f - r0.navigationBarHeight) - DialogsActivity.this.additionFloatingButtonOffset);
                    DialogsActivity.this.updateFloatingButtonOffset();
                }
            }

            @Override
            public void onShow(Bulletin bulletin) {
                if (DialogsActivity.this.undoView[0] == null || DialogsActivity.this.undoView[0].getVisibility() != 0) {
                    return;
                }
                DialogsActivity.this.undoView[0].hide(true, 2);
            }

            @Override
            public int getTopOffset(int i4) {
                int collapsedProgress = 0;
                int measuredHeight = (((BaseFragment) DialogsActivity.this).actionBar != null ? ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() : 0) + ((DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) ? 0 : DialogsActivity.this.filterTabsView.getMeasuredHeight()) + (DialogsActivity.this.topPanelLayout != null ? DialogsActivity.this.topPanelLayout.getHeight() : 0);
                DialogsActivity dialogsActivity = DialogsActivity.this;
                DialogStoriesCell dialogStoriesCell2 = dialogsActivity.dialogStoriesCell;
                if (dialogStoriesCell2 != null && dialogsActivity.dialogStoriesCellVisible) {
                    collapsedProgress = (int) ((1.0f - dialogStoriesCell2.getCollapsedProgress()) * AndroidUtilities.dp(81.0f));
                }
                return measuredHeight + collapsedProgress + AndroidUtilities.dp(48.0f);
            }

            @Override
            public int getBottomOffset(int i4) {
                return DialogsActivity.this.communityId != 0 ? DialogsActivity.this.navigationBarHeight + AndroidUtilities.dp(60.0f) : DialogsActivity.this.calculateListViewPaddingBottom();
            }
        });
        if (this.searchIsShowed) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        updateVisibleRows(0, false);
        updateProxyButton(false, true);
        updateStoriesVisibility(false);
        checkSuggestClearDatabase();
        checkUi_mainTabsVisible();
        if (this.filterTabsView == null || (viewPage = this.viewPages[0]) == null || viewPage.dialogsAdapter == null) {
            return;
        }
        int dialogsType = this.viewPages[0].dialogsAdapter.getDialogsType();
        if (dialogsType == 7 || dialogsType == 8) {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[dialogsType != 7 ? (char) 1 : (char) 0];
            if (dialogFilter != null) {
                this.filterTabsView.selectTabWithStableId(dialogFilter.localId);
            }
        }
    }

    public void lambda$onResume$82(boolean z, boolean z2, boolean z3, final Activity activity) {
        if (getParentActivity() == null) {
            return;
        }
        this.afterSignup = false;
        if (z || z2 || z3) {
            this.askingForPermissions = true;
            if (z && NotificationPermissionDialog.shouldAsk(activity)) {
                PermissionRequest.requestPermission("android.permission.POST_NOTIFICATIONS", new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.lambda$onResume$80(activity, (Boolean) obj);
                    }
                });
                return;
            }
            if (z2 && this.askAboutContacts && getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                AlertDialog alertDialogCreate = AlertsCreator.createContactsPermissionDialog(activity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        this.f$0.lambda$onResume$81(i);
                    }
                }).create();
                this.permissionDialog = alertDialogCreate;
                showDialog(alertDialogCreate);
            } else {
                if (z3 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (activity instanceof BasePermissionsActivity) {
                        AlertDialog alertDialogCreatePermissionErrorAlert = ((BasePermissionsActivity) activity).createPermissionErrorAlert(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                        this.permissionDialog = alertDialogCreatePermissionErrorAlert;
                        showDialog(alertDialogCreatePermissionErrorAlert);
                        return;
                    }
                    return;
                }
                askForPermissons(true);
            }
        }
    }

    public void lambda$onResume$80(final Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            return;
        }
        showDialog(new NotificationPermissionDialog(activity, !PermissionRequest.canAskPermission("android.permission.POST_NOTIFICATIONS"), new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.lambda$onResume$79(activity, (Boolean) obj);
            }
        }));
    }

    public static void lambda$onResume$79(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (!PermissionRequest.canAskPermission("android.permission.POST_NOTIFICATIONS")) {
                PermissionRequest.showPermissionSettings("android.permission.POST_NOTIFICATIONS");
            } else {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            }
        }
    }

    public void lambda$onResume$81(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).apply();
        askForPermissons(false);
    }

    public void lambda$onResume$83(AlertDialog alertDialog, int i) {
        Intent permissionManagerIntent = XiaomiUtilities.getPermissionManagerIntent();
        if (permissionManagerIntent != null) {
            try {
                try {
                    getParentActivity().startActivity(permissionManagerIntent);
                } catch (Exception unused) {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                    getParentActivity().startActivity(intent);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void lambda$onResume$84(AlertDialog alertDialog, int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
    }

    public void lambda$onResume$85(AlertDialog alertDialog, int i) {
        Intent intent = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
        try {
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$onResume$86(AlertDialog alertDialog, int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutFSILockscreen", true).commit();
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        boolean zPresentFragment = super.presentFragment(baseFragment);
        if (zPresentFragment && this.viewPages != null) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].dialogsAdapter.pause();
                i++;
            }
        }
        HintView2 hintView2 = this.storyHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        HintView2 hintView22 = this.storyPremiumHint;
        if (hintView22 != null) {
            hintView22.hide();
        }
        Bulletin.hideVisible();
        return zPresentFragment;
    }

    @Override
    public void onPause() {
        super.onPause();
        Bulletin bulletin = this.storiesBulletin;
        if (bulletin != null) {
            bulletin.hide();
            this.storiesBulletin = null;
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null) {
            rightSlidingDialogContainer.onPause();
        }
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onPause();
        }
        int i = 0;
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        Bulletin.removeDelegate(this);
        if (this.viewPages == null) {
            return;
        }
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            viewPageArr[i].dialogsAdapter.pause();
            i++;
        }
    }

    @Override
    public boolean onBackPressed(boolean z) throws Resources.NotFoundException {
        if (hasShownSheet()) {
            if (z) {
                closeSheet();
            }
            return false;
        }
        if (this.rightSlidingDialogContainer.hasFragment() && this.rightSlidingDialogContainer.getFragment().onBackPressed(z)) {
            if (z) {
                this.rightSlidingDialogContainer.lambda$presentFragment$1();
                SearchViewPager searchViewPager = this.searchViewPager;
                if (searchViewPager != null) {
                    searchViewPager.updateTabs();
                }
            }
            return false;
        }
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            if (z) {
                itemOptions.dismiss();
                this.filterOptions = null;
            }
            return false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.isEditing()) {
            if (z) {
                this.filterTabsView.setIsEditing(false);
                showDoneItem(false);
            }
            return false;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.isActionModeShowed()) {
            if (z) {
                SearchViewPager searchViewPager2 = this.searchViewPager;
                if (searchViewPager2 != null && searchViewPager2.getVisibility() == 0) {
                    this.searchViewPager.hideActionMode();
                }
                hideActionMode(true);
            }
            return false;
        }
        if (this.animatorSearchVisible.getValue()) {
            if (z) {
                this.fragmentSearchField.editText.getText().clear();
                this.fragmentSearchFieldWatcher.toggleSearch(false);
                this.fragmentSearchField.editText.clearFocus();
            }
            return false;
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0 && !this.tabsAnimationInProgress && !this.filterTabsView.isAnimatingIndicator() && !this.startedTracking && !this.filterTabsView.isFirstTabSelected()) {
            if (z) {
                this.filterTabsView.selectFirstTab();
            }
            return false;
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            if (z) {
                this.commentView.hidePopup(true);
            }
            return false;
        }
        if (this.dialogStoriesCell.isFullExpanded() && this.dialogStoriesCell.scrollToFirst()) {
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public void onBecomeFullyHidden() {
        View view;
        FilterTabsView filterTabsView;
        if (this.closeSearchFieldOnHide) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                SearchViewPager searchViewPager = this.searchViewPager;
                if (searchViewPager != null) {
                    searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                }
                this.searchObject = null;
            }
            this.closeSearchFieldOnHide = false;
        }
        if (!this.hasStories && (filterTabsView = this.filterTabsView) != null && filterTabsView.getVisibility() == 0 && this.animatorFilterTabsVisible.getValue()) {
            int i = (int) (-this.scrollYOffset);
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight && i >= currentActionBarHeight / 2) {
                this.viewPages[0].listView.canScrollVertically(1);
            }
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        if (!isInPreviewMode() && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        super.onBecomeFullyHidden();
        checkUi_mainTabsVisible();
        this.canShowStoryHint = true;
    }

    @Override
    public void onBecomeFullyVisible() {
        HintView2 hintView2;
        super.onBecomeFullyVisible();
        if (isArchive()) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            boolean z = globalMainSettings.getBoolean("archivehint", true);
            boolean zIsEmpty = getDialogsArray(this.currentAccount, this.initialDialogsType, this.folderId, false).isEmpty();
            if (z && zIsEmpty) {
                MessagesController.getGlobalMainSettings().edit().putBoolean("archivehint", false).commit();
                z = false;
            }
            if (z) {
                globalMainSettings.edit().putBoolean("archivehint", false).commit();
                showArchiveHelp();
            }
        }
        if (this.canShowStoryHint && !this.storyHintShown && (hintView2 = this.storyHint) != null && this.storiesEnabled) {
            this.storyHintShown = true;
            this.canShowStoryHint = false;
            hintView2.show();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.createSearchViewPager();
            }
        }, 200L);
    }

    public void showArchiveHelp() {
        getContactsController().loadGlobalPrivacySetting();
        BottomSheet bottomSheetShow = new BottomSheet.Builder(getContext(), false, getResourceProvider()).setCustomView(new ArchiveHelp(getContext(), this.currentAccount, getResourceProvider(), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showArchiveHelp$88(bottomSheetArr);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.lambda$showArchiveHelp$89(bottomSheetArr);
            }
        }), 49).show();
        final BottomSheet[] bottomSheetArr = {bottomSheetShow};
        bottomSheetShow.fixNavigationBar(getThemedColor(Theme.key_dialogBackground));
    }

    public void lambda$showArchiveHelp$88(BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
            bottomSheetArr[0] = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showArchiveHelp$87();
            }
        }, 300L);
    }

    public void lambda$showArchiveHelp$87() {
        presentFragment(new ArchiveSettingsActivity());
    }

    public static void lambda$showArchiveHelp$89(BottomSheet[] bottomSheetArr) {
        BottomSheet bottomSheet = bottomSheetArr[0];
        if (bottomSheet != null) {
            bottomSheet.lambda$new$0();
            bottomSheetArr[0] = null;
        }
    }

    @Override
    public void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        if (!z && this.avatarContainer != null) {
            this.actionBar.setBackground(null);
            ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).topMargin = 0;
            this.actionBar.removeView(this.avatarContainer);
            this.avatarContainer = null;
            updateFilterTabs(false, false);
            this.floatingButton3.imageView.setVisibility(0);
            DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
            if (dialogsActivityTopPanelLayout != null) {
                FrameLayout frameLayout = this.fragmentContextViewWrapper;
                if (frameLayout != null) {
                    dialogsActivityTopPanelLayout.addView(frameLayout);
                }
                FrameLayout frameLayout2 = this.fragmentLocationContextViewWrapper;
                if (frameLayout2 != null) {
                    this.topPanelLayout.addView(frameLayout2);
                }
            }
        }
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if (dialogStoriesCell != null) {
            if (this.dialogStoriesCellVisible && !z) {
                dialogStoriesCell.setVisibility(0);
            } else {
                dialogStoriesCell.setVisibility(8);
            }
        }
        updateFloatingButtonVisibility(true);
        lambda$updateDialogsHint$41();
    }

    public boolean addOrRemoveSelectedDialog(long j, View view) {
        if (this.onlySelect && getMessagesController().isForum(j)) {
            return false;
        }
        if (this.selectedDialogs.contains(Long.valueOf(j))) {
            this.selectedDialogs.remove(Long.valueOf(j));
            if (view instanceof DialogCell) {
                ((DialogCell) view).setChecked(false, true);
            } else if (view instanceof ProfileSearchCell) {
                ((ProfileSearchCell) view).setChecked(false, true);
            }
            return false;
        }
        this.selectedDialogs.add(Long.valueOf(j));
        if (view instanceof DialogCell) {
            ((DialogCell) view).setChecked(true, true);
        } else if (view instanceof ProfileSearchCell) {
            ((ProfileSearchCell) view).setChecked(true, true);
        }
        return true;
    }

    public void search(String str, boolean z) {
        showSearch(true, false, z);
        FragmentSearchField fragmentSearchField = this.fragmentSearchField;
        if (fragmentSearchField != null) {
            fragmentSearchField.editText.setText(str);
            this.fragmentSearchField.editText.setSelection(str.length());
        }
    }

    public void showSearch(boolean z, boolean z2, boolean z3) {
        showSearch(z, z2, z3, false);
    }

    private void showSearch(final boolean z, boolean z2, boolean z3, boolean z4) {
        SearchViewPager searchViewPager;
        SearchViewPager searchViewPager2;
        DialogStoriesCell dialogStoriesCell;
        SearchViewPager searchViewPager3;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        SearchViewPager searchViewPager4;
        boolean z5 = z3;
        this.animatorSearchVisible.setValue(z, z5);
        if (!z) {
            updateSpeedItem(false);
        } else {
            createSearchViewPager();
        }
        int i = this.initialDialogsType;
        if (i != 0 && i != 3) {
            z5 = false;
        }
        AnimatorSet animatorSet = this.searchAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimator = null;
        }
        this.searchIsShowed = z;
        blur3_InvalidateBlur();
        if (z) {
            boolean zOnlyDialogsAdapter = (this.searchFiltersWasShowed || z4) ? false : onlyDialogsAdapter();
            SearchViewPager searchViewPager5 = this.searchViewPager;
            if (searchViewPager5 != null) {
                searchViewPager5.showOnlyDialogsAdapter(zOnlyDialogsAdapter);
            }
            boolean z6 = !zOnlyDialogsAdapter || this.hasStories;
            this.whiteActionBar = z6;
            if (z6) {
                this.searchFiltersWasShowed = true;
            }
            ViewPagerFixed.TabsView tabsView = this.searchTabsView;
            if (tabsView == null && (searchViewPager4 = this.searchViewPager) != null && !zOnlyDialogsAdapter && this.communityId == 0) {
                ViewPagerFixed.TabsView tabsViewCreateTabsView = searchViewPager4.createTabsView(false, -2);
                this.searchTabsView = tabsViewCreateTabsView;
                this.searchTabsAndFiltersLayout.addView(tabsViewCreateTabsView, 0, LayoutHelper.createFrame(-1, -1, 119));
            } else if (this.searchTabsAndFiltersLayout != null && zOnlyDialogsAdapter && this.communityId == 0) {
                AndroidUtilities.removeFromParent(tabsView);
                this.searchTabsView = null;
            }
            if (this.searchViewPager != null) {
                checkUi_searchPagesPaddings(false);
                this.searchViewPager.setKeyboardHeight(((ContentView) this.fragmentView).getKeyboardHeight());
                this.searchViewPager.clear();
            }
            TLRPC.Chat chat = this.community;
            if (chat != null) {
                FiltersView.MediaFilterData mediaFilterData = new FiltersView.MediaFilterData(R.drawable.search_users_filled, DialogObject.getShortName(chat), (TLRPC.MessagesFilter) null, 4);
                mediaFilterData.setUser(this.community);
                addSearchFilter(mediaFilterData);
            } else if (this.folderId != 0 && ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment())) {
                addSearchFilter(new FiltersView.MediaFilterData(R.drawable.chats_archive, R.string.ArchiveSearchFilter, (TLRPC.MessagesFilter) null, 7));
            }
        }
        if (z5 && (searchViewPager3 = this.searchViewPager) != null && searchViewPager3.dialogsSearchAdapter.hasRecentSearch()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z && (dialogStoriesCell = this.dialogStoriesCell) != null && this.dialogStoriesCellVisible) {
            dialogStoriesCell.setVisibility(0);
        }
        boolean z7 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(32768);
        if (z5) {
            if (z) {
                SearchViewPager searchViewPager6 = this.searchViewPager;
                if (searchViewPager6 != null) {
                    searchViewPager6.setVisibility(0);
                    this.searchViewPager.reset();
                }
                updateFiltersView(true, null, null, false, false);
                ViewPagerFixed.TabsView tabsView2 = this.searchTabsView;
                if (tabsView2 != null) {
                    tabsView2.hide(false, false);
                }
            } else {
                this.viewPages[0].listView.setVisibility(0);
                this.viewPages[0].setVisibility(0);
            }
            setDialogsListFrozen(true);
            this.viewPages[0].listView.setVerticalScrollBarEnabled(false);
            SearchViewPager searchViewPager7 = this.searchViewPager;
            if (searchViewPager7 != null) {
                searchViewPager7.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            }
            this.searchAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ViewPage viewPage = this.viewPages[0];
            Property property = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(viewPage, (Property<ViewPage, Float>) property, z ? 0.0f : 1.0f));
            if (z7) {
                this.viewPages[0].setScaleX(1.0f);
                this.viewPages[0].setScaleY(1.0f);
            } else {
                arrayList.add(ObjectAnimator.ofFloat(this.viewPages[0], (Property<ViewPage, Float>) View.SCALE_X, z ? 0.95f : 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(this.viewPages[0], (Property<ViewPage, Float>) View.SCALE_Y, z ? 0.95f : 1.0f));
            }
            RightSlidingDialogContainer rightSlidingDialogContainer2 = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer2 != null) {
                rightSlidingDialogContainer2.setVisibility(0);
                arrayList.add(ObjectAnimator.ofFloat(this.rightSlidingDialogContainer, (Property<RightSlidingDialogContainer, Float>) property, z ? 0.0f : 1.0f));
            }
            SearchViewPager searchViewPager8 = this.searchViewPager;
            if (searchViewPager8 != null) {
                arrayList.add(ObjectAnimator.ofFloat(searchViewPager8, (Property<SearchViewPager, Float>) property, z ? 1.0f : 0.0f));
                if (this.hasStories) {
                    float fDp = AndroidUtilities.dp(81.0f) + this.scrollYOffset + AndroidUtilities.dp(48.0f);
                    SearchViewPager searchViewPager9 = this.searchViewPager;
                    Property property2 = this.SEARCH_TRANSLATION_Y;
                    float f = z ? fDp : 0.0f;
                    if (z) {
                        fDp = 0.0f;
                    }
                    arrayList.add(ObjectAnimator.ofFloat(searchViewPager9, (Property<SearchViewPager, Float>) property2, f, fDp));
                }
                if (z7) {
                    this.searchViewPager.setScaleX(1.0f);
                    this.searchViewPager.setScaleY(1.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(this.searchViewPager, (Property<SearchViewPager, Float>) View.SCALE_X, z ? 1.0f : 1.05f));
                    arrayList.add(ObjectAnimator.ofFloat(this.searchViewPager, (Property<SearchViewPager, Float>) View.SCALE_Y, z ? 1.0f : 1.05f));
                }
            }
            if (this.downloadsItem != null) {
                updateProxyButton(false, false);
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.searchAnimationProgress, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$showSearch$90(valueAnimator);
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            this.searchAnimator.playTogether(arrayList);
            this.searchAnimator.setDuration(z ? 200L : 180L);
            this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            if (!z) {
                this.searchAnimator.setStartDelay(20L);
            }
            this.searchAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    DialogsActivity.this.notificationsLocker.unlock();
                    if (DialogsActivity.this.searchAnimator != animator) {
                        return;
                    }
                    DialogsActivity.this.setDialogsListFrozen(false);
                    if (z) {
                        DialogsActivity.this.viewPages[0].listView.hide();
                        DialogStoriesCell dialogStoriesCell2 = DialogsActivity.this.dialogStoriesCell;
                        if (dialogStoriesCell2 != null) {
                            dialogStoriesCell2.setVisibility(8);
                        }
                        DialogsActivity.this.searchWasFullyShowed = true;
                        AndroidUtilities.requestAdjustResize(DialogsActivity.this.getParentActivity(), ((BaseFragment) DialogsActivity.this).classGuid);
                        DialogsActivity.this.searchItem.setVisibility(8);
                        RightSlidingDialogContainer rightSlidingDialogContainer3 = DialogsActivity.this.rightSlidingDialogContainer;
                        if (rightSlidingDialogContainer3 != null) {
                            rightSlidingDialogContainer3.setVisibility(8);
                        }
                    } else {
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        dialogsActivity.whiteActionBar = false;
                        if (dialogsActivity.searchViewPager != null) {
                            DialogsActivity.this.searchViewPager.setVisibility(8);
                        }
                        if (DialogsActivity.this.fragmentSearchField != null) {
                            DialogsActivity.this.fragmentSearchField.clearSearchFilters();
                        }
                        if (DialogsActivity.this.searchViewPager != null) {
                            DialogsActivity.this.searchViewPager.clear();
                        }
                        DialogsActivity.this.viewPages[0].listView.show();
                        DialogsActivity.this.searchWasFullyShowed = false;
                        RightSlidingDialogContainer rightSlidingDialogContainer4 = DialogsActivity.this.rightSlidingDialogContainer;
                        if (rightSlidingDialogContainer4 != null) {
                            rightSlidingDialogContainer4.setVisibility(0);
                        }
                    }
                    View view = DialogsActivity.this.fragmentView;
                    if (view != null) {
                        view.requestLayout();
                    }
                    DialogsActivity.this.setSearchAnimationProgress(z ? 1.0f : 0.0f, false);
                    DialogsActivity.this.viewPages[0].listView.setVerticalScrollBarEnabled(true);
                    if (DialogsActivity.this.searchViewPager != null) {
                        DialogsActivity.this.searchViewPager.setBackground(null);
                    }
                    DialogsActivity.this.searchAnimator = null;
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    DialogsActivity.this.notificationsLocker.unlock();
                    if (DialogsActivity.this.searchAnimator == animator) {
                        if (z) {
                            DialogsActivity.this.viewPages[0].listView.hide();
                        } else {
                            DialogsActivity.this.viewPages[0].listView.show();
                        }
                        DialogsActivity.this.searchAnimator = null;
                    }
                }
            });
            this.notificationsLocker.lock();
            this.searchAnimator.start();
        } else {
            setDialogsListFrozen(false);
            if (z) {
                this.viewPages[0].listView.hide();
            } else {
                this.viewPages[0].listView.show();
            }
            this.viewPages[0].setAlpha(z ? 0.0f : 1.0f);
            if (!z7) {
                this.viewPages[0].setScaleX(z ? 0.95f : 1.0f);
                this.viewPages[0].setScaleY(z ? 0.95f : 1.0f);
            } else {
                this.viewPages[0].setScaleX(1.0f);
                this.viewPages[0].setScaleY(1.0f);
            }
            SearchViewPager searchViewPager10 = this.searchViewPager;
            if (searchViewPager10 != null) {
                searchViewPager10.setAlpha(z ? 1.0f : 0.0f);
                if (!z7) {
                    this.searchViewPager.setScaleX(z ? 1.0f : 1.1f);
                    this.searchViewPager.setScaleY(z ? 1.0f : 1.1f);
                } else {
                    this.searchViewPager.setScaleX(1.0f);
                    this.searchViewPager.setScaleY(1.0f);
                }
                this.searchViewPager.setVisibility(z ? 0 : 8);
            }
            FragmentSearchField fragmentSearchField = this.fragmentSearchField;
            if (fragmentSearchField != null) {
                fragmentSearchField.setTranslationY((z ? -AndroidUtilities.dp(36.0f) : 0) + getSearchFieldAdditionOffset());
            }
            if (this.dialogStoriesCell != null) {
                if (this.dialogStoriesCellVisible && !isInPreviewMode() && !z) {
                    this.dialogStoriesCell.setVisibility(0);
                } else {
                    this.dialogStoriesCell.setVisibility(8);
                }
            }
            setSearchAnimationProgress(z ? 1.0f : 0.0f, false);
            this.fragmentView.invalidate();
        }
        int i2 = this.initialSearchType;
        if (i2 >= 0 && (searchViewPager2 = this.searchViewPager) != null) {
            searchViewPager2.setPosition(searchViewPager2.getPositionForType(i2));
        }
        if (!z) {
            this.initialSearchType = -1;
        }
        if (z && z2 && (searchViewPager = this.searchViewPager) != null) {
            searchViewPager.showDownloads();
            updateSpeedItem(true);
        }
        checkUi_searchFiltersVisibility();
        lambda$updateDialogsHint$41();
    }

    public void lambda$showSearch$90(ValueAnimator valueAnimator) {
        setSearchAnimationProgress(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }

    public boolean onlyDialogsAdapter() {
        return this.onlySelect || (getMessagesController().getTotalDialogsCount() <= 10 && !this.hasStories);
    }

    private void updateFilterTabsVisibility(boolean z) {
        if (this.fragmentView == null) {
            return;
        }
        if (this.isPaused || this.databaseMigrationHint != null) {
            z = false;
        }
        if (this.searchIsShowed) {
            return;
        }
        this.animatorFilterTabsVisible.setValue(this.canShowFilterTabsView, z);
    }

    public void setSearchAnimationProgress(float f, boolean z) {
        this.searchAnimationProgress = f;
        boolean z2 = true;
        if (this.whiteActionBar && this.actionBar != null) {
            int themedColor = getThemedColor((this.folderId == 0 && this.communityId == 0) ? Theme.key_actionBarDefaultIcon : Theme.key_actionBarDefaultArchivedIcon);
            ActionBar actionBar = this.actionBar;
            int i = Theme.key_actionBarActionModeDefaultIcon;
            actionBar.setItemsColor(ColorUtils.blendARGB(themedColor, getThemedColor(i), this.searchAnimationProgress), false);
            this.actionBar.setItemsColor(ColorUtils.blendARGB(getThemedColor(i), getThemedColor(i), this.searchAnimationProgress), true);
            this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(getThemedColor((this.folderId == 0 && this.communityId == 0) ? Theme.key_actionBarDefaultSelector : Theme.key_actionBarDefaultArchivedSelector), getThemedColor(Theme.key_actionBarActionModeDefaultSelector), this.searchAnimationProgress), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(32768)) {
            z2 = false;
        }
        if (z) {
            ViewPage viewPage = this.viewPages[0];
            if (viewPage != null) {
                if (f < 1.0f) {
                    viewPage.setVisibility(0);
                }
                this.viewPages[0].setAlpha(1.0f - f);
                if (!z2) {
                    float f2 = (0.1f * f) + 0.9f;
                    this.viewPages[0].setScaleX(f2);
                    this.viewPages[0].setScaleY(f2);
                }
            }
            RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer != null) {
                if (f >= 1.0f) {
                    rightSlidingDialogContainer.setVisibility(8);
                } else {
                    rightSlidingDialogContainer.setVisibility(0);
                    this.rightSlidingDialogContainer.setAlpha(1.0f - f);
                }
            }
            SearchViewPager searchViewPager = this.searchViewPager;
            if (searchViewPager != null) {
                searchViewPager.setAlpha(f);
                if (!z2) {
                    float f3 = ((1.0f - f) * 0.05f) + 1.0f;
                    this.searchViewPager.setScaleX(f3);
                    this.searchViewPager.setScaleY(f3);
                }
            }
        }
        updateContextViewPosition();
    }

    public void findAndUpdateCheckBox(long j, boolean z) {
        if (this.viewPages == null) {
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            int childCount = viewPageArr[i].listView.getChildCount();
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    View childAt = this.viewPages[i].listView.getChildAt(i2);
                    if (childAt instanceof DialogCell) {
                        DialogCell dialogCell = (DialogCell) childAt;
                        if (dialogCell.getDialogId() == j) {
                            dialogCell.setChecked(z, true);
                            break;
                        }
                    }
                    i2++;
                }
            }
            i++;
        }
    }

    public void checkListLoad(ViewPage viewPage) {
        checkListLoad(viewPage, viewPage.layoutManager.findFirstVisibleItemPosition(), viewPage.layoutManager.findLastVisibleItemPosition());
    }

    private void checkListLoad(org.telegram.ui.DialogsActivity.ViewPage r13, int r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.checkListLoad(org.telegram.ui.DialogsActivity$ViewPage, int, int):void");
    }

    public void lambda$checkListLoad$91(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z) {
            getMessagesController().loadDialogs(this.folderId, -1, 100, z2);
        }
        if (z3) {
            getMessagesController().loadDialogs(1, -1, 100, z4);
        }
    }

    private void onItemClick(android.view.View r21, int r22, androidx.recyclerview.widget.RecyclerView.Adapter r23, float r24, float r25) throws android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.onItemClick(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Adapter, float, float):void");
    }

    private boolean isBotForumWithEmptyTopics(long j) {
        if (j < 0) {
            return false;
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
        if (!UserObject.isBotForum(user)) {
            return false;
        }
        ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(this.currentAccount).getTopicsController().getTopics(-user.id);
        return (topics == null || topics.isEmpty()) && MessagesController.getInstance(this.currentAccount).getTopicsController().endIsReached(-user.id);
    }

    public static ChatActivity highlightFoundQuote(ChatActivity chatActivity, MessageObject messageObject) {
        CharSequence charSequence;
        if (messageObject != null && messageObject.hasHighlightedWords()) {
            try {
                if (!TextUtils.isEmpty(messageObject.caption)) {
                    charSequence = messageObject.caption;
                } else {
                    charSequence = messageObject.messageText;
                }
                CharSequence charSequenceHighlightText = AndroidUtilities.highlightText(charSequence, messageObject.highlightedWords, (Theme.ResourcesProvider) null);
                if (charSequenceHighlightText instanceof SpannableStringBuilder) {
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequenceHighlightText;
                    ForegroundColorSpanThemable[] foregroundColorSpanThemableArr = (ForegroundColorSpanThemable[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ForegroundColorSpanThemable.class);
                    if (foregroundColorSpanThemableArr.length > 0) {
                        int spanStart = spannableStringBuilder.getSpanStart(foregroundColorSpanThemableArr[0]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(foregroundColorSpanThemableArr[0]);
                        for (int i = 1; i < foregroundColorSpanThemableArr.length; i++) {
                            int spanStart2 = spannableStringBuilder.getSpanStart(foregroundColorSpanThemableArr[i]);
                            int spanStart3 = spannableStringBuilder.getSpanStart(foregroundColorSpanThemableArr[i]);
                            if (spanStart2 != spanEnd) {
                                if (spanStart2 > spanEnd) {
                                    for (int i2 = spanEnd; i2 <= spanStart2; i2++) {
                                        if (!Character.isWhitespace(spannableStringBuilder.charAt(i2))) {
                                            break;
                                        }
                                    }
                                }
                            }
                            spanEnd = spanStart3;
                        }
                        chatActivity.setHighlightQuote(messageObject.getRealId(), charSequence.subSequence(spanStart, spanEnd).toString(), spanStart);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return chatActivity;
    }

    public void setOpenedDialogId(long j, long j2) {
        MessagesStorage.TopicKey topicKey = this.openedDialogId;
        topicKey.dialogId = j;
        topicKey.topicId = j2;
        ViewPage[] viewPageArr = this.viewPages;
        if (viewPageArr == null) {
            return;
        }
        for (ViewPage viewPage : viewPageArr) {
            if (viewPage.isDefaultDialogType() && AndroidUtilities.isTablet()) {
                viewPage.dialogsAdapter.setOpenedDialogId(this.openedDialogId.dialogId);
            }
        }
        updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
    }

    public boolean onItemLongClick(RecyclerListView recyclerListView, View view, int i, float f, float f2, int i2, RecyclerView.Adapter adapter) throws Resources.NotFoundException, IOException, NumberFormatException {
        TLRPC.Dialog dialog;
        DialogsSearchAdapter dialogsSearchAdapter;
        DialogsSearchAdapter dialogsSearchAdapter2;
        final long jMakeEncryptedDialogId;
        if (getParentActivity() == null || (view instanceof DialogsHintCell) || adapter.getItemViewType(i) == 21) {
            return false;
        }
        if (!this.actionBar.isActionModeShowed() && !AndroidUtilities.isTablet() && !this.onlySelect && (view instanceof DialogCell)) {
            DialogCell dialogCell = (DialogCell) view;
            if (!getMessagesController().isForum(dialogCell.getDialogId()) && !this.rightSlidingDialogContainer.hasFragment() && dialogCell.isPointInsideAvatar(f, f2)) {
                return showChatPreview(dialogCell);
            }
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
            return false;
        }
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null && adapter == (dialogsSearchAdapter2 = searchViewPager.dialogsSearchAdapter)) {
            Object item = dialogsSearchAdapter2.getItem(i);
            if (!this.searchViewPager.dialogsSearchAdapter.isSearchWas()) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString(R.string.ClearSearchSingleAlertTitle));
                if (item instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) item;
                    if (chat.monoforum) {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, ForumUtilities.getMonoForumTitle(this.currentAccount, chat)));
                    } else {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, chat.title));
                    }
                    jMakeEncryptedDialogId = -chat.id;
                } else if (item instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) item;
                    if (user.id == getUserConfig().clientUserId) {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString(R.string.SavedMessages)));
                    } else {
                        builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name)));
                    }
                    jMakeEncryptedDialogId = user.id;
                } else {
                    if (!(item instanceof TLRPC.EncryptedChat)) {
                        return false;
                    }
                    TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(((TLRPC.EncryptedChat) item).user_id));
                    builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user2.first_name, user2.last_name)));
                    jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(r13.id);
                }
                builder.setPositiveButton(LocaleController.getString(R.string.ClearSearchRemove), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i3) {
                        this.f$0.lambda$onItemLongClick$92(jMakeEncryptedDialogId, alertDialog, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
                }
                return true;
            }
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 != null && adapter == (dialogsSearchAdapter = searchViewPager2.dialogsSearchAdapter)) {
            if (this.onlySelect) {
                onItemClick(view, i, adapter, f, f2);
                return false;
            }
            long dialogId = (!(view instanceof ProfileSearchCell) || dialogsSearchAdapter.isGlobalSearch(i)) ? 0L : ((ProfileSearchCell) view).getDialogId();
            if (dialogId == 0) {
                return false;
            }
            showOrUpdateActionMode(dialogId, view);
            return true;
        }
        Object item2 = ((DialogsAdapter) adapter).getItem(i);
        if (!(item2 instanceof TLRPC.Dialog) || (dialog = (TLRPC.Dialog) item2) == null) {
            return false;
        }
        if (this.onlySelect) {
            if ((this.initialDialogsType != 3 && !clickSelectsDialog()) || !validateSlowModeDialog(dialog.id)) {
                return false;
            }
            if (this.initialDialogsType == 1 && clickSelectsDialog() && this.canSelectTopics && getMessagesController().isForum(dialog.id)) {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -dialog.id);
                bundle.putBoolean("for_select", true);
                bundle.putBoolean("forward_to", true);
                bundle.putBoolean("bot_share_to", this.initialDialogsType == 1);
                bundle.putBoolean("quote", this.isQuote);
                bundle.putBoolean("reply_to", this.isReplyTo);
                TopicsFragment topicsFragment = new TopicsFragment(bundle);
                topicsFragment.setForwardFromDialogFragment(this);
                presentFragment(topicsFragment);
                return false;
            }
            addOrRemoveSelectedDialog(dialog.id, view);
            updateSelectedCount();
            return true;
        }
        if (dialog instanceof TLRPC.TL_dialogFolder) {
            onArchiveLongPress(view);
            return false;
        }
        if (this.actionBar.isActionModeShowed() && isDialogPinned(dialog)) {
            return false;
        }
        showOrUpdateActionMode(dialog.id, view);
        return true;
    }

    public void lambda$onItemLongClick$92(long j, AlertDialog alertDialog, int i) {
        this.searchViewPager.dialogsSearchAdapter.removeRecentSearch(j);
    }

    private void onArchiveLongPress(View view) {
        try {
            view.performHapticFeedback(0, 2);
        } catch (Exception unused) {
        }
        BottomSheet.Builder builder = new BottomSheet.Builder(getParentActivity());
        boolean z = getMessagesStorage().getArchiveUnreadCount() != 0;
        builder.setItems(new CharSequence[]{z ? LocaleController.getString(R.string.MarkAllAsRead) : null, LocaleController.getString(SharedConfig.archiveHidden ? R.string.PinInTheList : R.string.HideAboveTheList)}, new int[]{z ? R.drawable.msg_markread : 0, SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin}, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.lambda$onArchiveLongPress$93(dialogInterface, i);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$onArchiveLongPress$93(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            getMessagesStorage().readAllDialogs(1);
            return;
        }
        if (i != 1 || this.viewPages == null) {
            return;
        }
        int i2 = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i2 >= viewPageArr.length) {
                return;
            }
            if (viewPageArr[i2].dialogsType == 0 && this.viewPages[i2].getVisibility() == 0) {
                this.viewPages[i2].listView.toggleArchiveHidden(true, findArchiveDialogCell(this.viewPages[i2]));
            }
            i2++;
        }
    }

    public DialogCell findArchiveDialogCell(ViewPage viewPage) {
        DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
        for (int i = 0; i < dialogsRecyclerView.getChildCount(); i++) {
            View childAt = dialogsRecyclerView.getChildAt(i);
            if (childAt instanceof DialogCell) {
                DialogCell dialogCell = (DialogCell) childAt;
                if (dialogCell.isFolderCell()) {
                    return dialogCell;
                }
            }
        }
        return null;
    }

    public boolean showChatPreview(final org.telegram.ui.Cells.DialogCell r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.showChatPreview(org.telegram.ui.Cells.DialogCell):boolean");
    }

    public void lambda$showChatPreview$94(boolean z, ArrayList arrayList, MessagesController.DialogFilter dialogFilter, long j, View view) {
        if (!z) {
            if (!arrayList.isEmpty()) {
                for (int i = 0; i < arrayList.size(); i++) {
                    dialogFilter.neverShow.remove(arrayList.get(i));
                }
                dialogFilter.alwaysShow.addAll(arrayList);
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
            }
            getUndoView().showWithAction(j, 20, Integer.valueOf(arrayList.size()), dialogFilter, (Runnable) null, (Runnable) null);
        } else {
            dialogFilter.alwaysShow.remove(Long.valueOf(j));
            dialogFilter.neverShow.add(Long.valueOf(j));
            FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
            getUndoView().showWithAction(j, 21, Integer.valueOf(arrayList.size()), dialogFilter, (Runnable) null, (Runnable) null);
        }
        hideActionMode(true);
        finishPreviewFragment();
    }

    public static void lambda$showChatPreview$95(ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr, View view) {
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = actionBarPopupWindowLayoutArr[0];
        if (actionBarPopupWindowLayout != null) {
            actionBarPopupWindowLayout.getSwipeBack().closeForeground();
        }
    }

    public static void lambda$showChatPreview$96(ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr, int[] iArr, View view) {
        actionBarPopupWindowLayoutArr[0].getSwipeBack().openForeground(iArr[0]);
    }

    public static void lambda$showChatPreview$97(ChatActivity[] chatActivityArr, int i) {
        ChatActivity chatActivity = chatActivityArr[0];
        if (chatActivity == null || chatActivity.getFragmentView() == null || !chatActivityArr[0].isInPreviewMode()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = chatActivityArr[0].getFragmentView().getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = AndroidUtilities.dp(48.0f) + i;
            chatActivityArr[0].getFragmentView().setLayoutParams(layoutParams);
        }
    }

    public void lambda$showChatPreview$98(DialogCell dialogCell, long j, View view) {
        if (dialogCell.getHasUnread()) {
            markAsRead(j);
        } else {
            markAsUnread(j);
        }
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$100(final MessagesController.DialogFilter dialogFilter, final TLRPC.Dialog dialog, final long j, View view) {
        finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showChatPreview$99(dialogFilter, dialog, j);
            }
        }, 100L);
    }

    public void lambda$showChatPreview$99(MessagesController.DialogFilter dialogFilter, TLRPC.Dialog dialog, long j) {
        int i;
        int iMin = Integer.MAX_VALUE;
        if (dialogFilter == null || !isDialogPinned(dialog)) {
            i = Integer.MAX_VALUE;
        } else {
            int size = dialogFilter.pinnedDialogs.size();
            for (int i2 = 0; i2 < size; i2++) {
                iMin = Math.min(iMin, dialogFilter.pinnedDialogs.valueAt(i2));
            }
            i = iMin - this.canPinCount;
        }
        TLRPC.EncryptedChat encryptedChat = DialogObject.isEncryptedDialog(j) ? getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) : null;
        UndoView undoView = getUndoView();
        if (undoView == null) {
            return;
        }
        if (!isDialogPinned(dialog)) {
            pinDialog(j, true, dialogFilter, i, true);
            undoView.showWithAction(0L, 78, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
            if (dialogFilter != null) {
                if (encryptedChat != null) {
                    if (!dialogFilter.alwaysShow.contains(Long.valueOf(encryptedChat.user_id))) {
                        dialogFilter.alwaysShow.add(Long.valueOf(encryptedChat.user_id));
                    }
                } else if (!dialogFilter.alwaysShow.contains(Long.valueOf(j))) {
                    dialogFilter.alwaysShow.add(Long.valueOf(j));
                }
            }
        } else {
            pinDialog(j, false, dialogFilter, i, true);
            undoView.showWithAction(0L, 79, (Object) 1, (Object) 1600, (Runnable) null, (Runnable) null);
        }
        if (dialogFilter != null) {
            FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
        }
        getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
        updateCounters(true);
        if (this.viewPages != null) {
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i3 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i3].dialogsAdapter.onReorderStateChanged(false);
                i3++;
            }
        }
        updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK);
    }

    public void lambda$showChatPreview$101(long j, View view) {
        boolean zIsDialogMuted = getMessagesController().isDialogMuted(j, 0L);
        if (!zIsDialogMuted) {
            getNotificationsController().setDialogNotificationsSettings(j, 0L, 3);
        } else {
            getNotificationsController().setDialogNotificationsSettings(j, 0L, 4);
        }
        BulletinFactory.createMuteBulletin(this, !zIsDialogMuted, null).show();
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$102(ArrayList arrayList, View view) {
        performSelectedDialogsAction(arrayList, 102, false, false);
        finishPreviewFragment();
    }

    public void updateFloatingButtonVisibility(boolean z) {
        boolean z2 = this.onlySelect;
        boolean z3 = (!z2 || this.initialDialogsType == 10) && this.folderId == 0 && this.communityId == 0 && !this.inPreviewMode && (!this.searching || z2) && !this.floatingButtonHidden;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton3;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setButtonVisible(z3, z);
        }
        FragmentFloatingButton fragmentFloatingButton2 = this.floatingButtonStories;
        if (fragmentFloatingButton2 != null) {
            fragmentFloatingButton2.setButtonVisible(z3, z);
        }
    }

    public void updateFloatingButtonOffset() {
        float f = (((-this.navigationBarHeight) - this.additionFloatingButtonOffset) - this.additionalFloatingTranslation) - this.floatingButtonPanOffset;
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton3;
        if (fragmentFloatingButton != null) {
            fragmentFloatingButton.setTranslationY(f);
        }
        FragmentFloatingButton fragmentFloatingButton2 = this.floatingButtonStories;
        if (fragmentFloatingButton2 != null) {
            fragmentFloatingButton2.setTranslationY(f - AndroidUtilities.dp(52.0f));
            HintView2 hintView2 = this.storyHint;
            if (hintView2 != null) {
                hintView2.setTranslationY(f - AndroidUtilities.dp(52.0f));
            }
        }
    }

    private void updateStoriesPosting() {
        HintView2 hintView2;
        boolean zStoriesEnabled = getMessagesController().storiesEnabled();
        if (this.storiesEnabled != zStoriesEnabled) {
            updateFloatingButtonOffset();
            if (!this.storiesEnabled && zStoriesEnabled && (hintView2 = this.storyHint) != null) {
                hintView2.show();
            }
            this.storiesEnabled = zStoriesEnabled;
        }
        FragmentFloatingButton fragmentFloatingButton = this.floatingButton3;
        if (fragmentFloatingButton == null) {
            return;
        }
        if (this.initialDialogsType == 10) {
            fragmentFloatingButton.setImageResource(R.drawable.floating_check);
            this.floatingButton3.setContentDescription(LocaleController.getString(R.string.Done));
        } else {
            fragmentFloatingButton.setImageResource(R.drawable.filled_fab_compose_32);
            this.floatingButton3.setContentDescription(LocaleController.getString(R.string.NewMessageTitle));
        }
    }

    public boolean hasHiddenArchive() {
        return !this.onlySelect && this.initialDialogsType == 0 && this.communityId == 0 && this.folderId == 0 && getMessagesController().hasHiddenArchive();
    }

    public boolean waitingForDialogsAnimationEnd(ViewPage viewPage) {
        return viewPage.dialogsItemAnimator.isRunning();
    }

    public void checkAnimationFinished() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkAnimationFinished$103();
            }
        }, 300L);
    }

    public void lambda$checkAnimationFinished$103() {
        setDialogsListFrozen(false);
        updateDialogIndices();
    }

    public void setScrollY(float f) {
        ViewPage[] viewPageArr = this.viewPages;
        if (viewPageArr != null) {
            int paddingTop = viewPageArr[0].listView.getPaddingTop() + ((int) f);
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i >= viewPageArr2.length) {
                    break;
                }
                viewPageArr2[i].listView.setTopGlowOffset(paddingTop);
                i++;
            }
        }
        if (this.fragmentView == null || f == this.scrollYOffset) {
            return;
        }
        this.scrollYOffset = f;
        Bulletin bulletin = this.topBulletin;
        if (bulletin != null) {
            bulletin.updatePosition();
        }
        if (this.animatedStatusView != null) {
            float currentActionBarHeight = 1.0f - ((-f) / ActionBar.getCurrentActionBarHeight());
            this.animatedStatusView.translateY2((int) f);
            this.animatedStatusView.setAlpha(MathUtils.clamp(currentActionBarHeight, 0.0f, 1.0f));
            this.animatedStatusView.setVisibility(currentActionBarHeight <= 0.0f ? 4 : 0);
        }
        checkUi_searchFieldVisibility();
        this.fragmentView.invalidate();
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 9.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 9.0f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.eraseColor(getThemedColor(Theme.key_windowBackgroundWhite));
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.scale(0.11111111f, 0.11111111f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(9, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(bitmapCreateBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
        checkUi_mainTabsVisible();
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.getFragment().onTransitionAnimationProgress(z, f);
        } else {
            View view = this.blurredView;
            if (view != null && view.getVisibility() == 0) {
                if (z) {
                    this.blurredView.setAlpha(1.0f - f);
                } else {
                    this.blurredView.setAlpha(f);
                }
            }
        }
        checkUi_mainTabsVisible();
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        View view;
        DialogsActivity dialogsActivity;
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.getFragment().onTransitionAnimationEnd(z, z2);
        } else {
            if (z && (view = this.blurredView) != null && view.getVisibility() == 0) {
                this.blurredView.setVisibility(8);
                this.blurredView.setBackground(null);
            }
            if (z && this.afterSignup) {
                try {
                    this.fragmentView.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
                if (getParentActivity() instanceof LaunchActivity) {
                    ((LaunchActivity) getParentActivity()).getFireworksOverlay().start();
                }
            }
        }
        if (!z && (dialogsActivity = this.parentForwardDialogFragment) != null) {
            dialogsActivity.removeSelfFromStack();
        }
        checkUi_mainTabsVisible();
    }

    private void resetScroll() {
        boolean z;
        if (this.scrollYOffset == 0.0f || (z = this.hasStories)) {
            return;
        }
        float f = z ? -getMaxScrollYOffsetWithoutSearch() : 0.0f;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, (Property<DialogsActivity, Float>) this.SCROLL_Y, f));
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public void hideActionMode(boolean z) {
        DialogsActivity dialogsActivity;
        ?? r0;
        boolean z2;
        final DialogsActivity dialogsActivity2 = this;
        dialogsActivity2.actionBar.hideActionMode();
        dialogsActivity2.selectedDialogs.clear();
        BackDrawable backDrawable = dialogsActivity2.backDrawable;
        if (backDrawable != null) {
            backDrawable.setRotation(0.0f, true);
        }
        FilterTabsView filterTabsView = dialogsActivity2.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.animateColorsTo(Theme.key_actionBarTabLine, Theme.key_actionBarTabActiveText, Theme.key_actionBarTabUnactiveText, Theme.key_actionBarTabSelector, Theme.key_windowBackgroundWhite);
        }
        ValueAnimator valueAnimator = dialogsActivity2.actionBarColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            dialogsActivity2.actionBarColorAnimator = null;
        }
        if (dialogsActivity2.progressToActionMode == 0.0f) {
            return;
        }
        dialogsActivity2.setScrollY(-getMaxScrollYOffset());
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = dialogsActivity2.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            ViewPage viewPage = viewPageArr[i];
            if (viewPage != null) {
                viewPage.listView.cancelClickRunnables(true);
            }
            i++;
        }
        final float fMax = Math.max(0.0f, AndroidUtilities.dp((dialogsActivity2.hasStories ? 81 : 0) + 48) + dialogsActivity2.scrollYOffset);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(dialogsActivity2.progressToActionMode, 0.0f);
        dialogsActivity2.actionBarColorAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$hideActionMode$104(fMax, valueAnimator2);
            }
        });
        dialogsActivity2.actionBarColorAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                DialogsActivity.this.actionBarColorAnimator = null;
                DialogsActivity.this.actionModeFullyShowed = false;
                DialogsActivity.this.invalidateScrollY = true;
                DialogsActivity.this.fixScrollYAfterArchiveOpened = true;
                DialogsActivity.this.fragmentView.invalidate();
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                dialogsActivity3.scrollAdditionalOffset = -(AndroidUtilities.dp((dialogsActivity3.hasStories ? 81 : 0) + 48) - fMax);
                DialogsActivity.this.viewPages[0].setTranslationY(0.0f);
                for (int i2 = 0; i2 < DialogsActivity.this.viewPages.length; i2++) {
                    if (DialogsActivity.this.viewPages[i2] != null) {
                        DialogsActivity.this.viewPages[i2].listView.requestLayout();
                    }
                }
                DialogsActivity.this.fragmentView.requestLayout();
                if (DialogsActivity.this.fragmentSearchField == null || !DialogsActivity.this.animatorSearchVisible.getValue()) {
                    return;
                }
                DialogsActivity.this.fragmentSearchField.editText.requestFocus();
                AndroidUtilities.showKeyboard(DialogsActivity.this.fragmentSearchField.editText);
            }
        });
        dialogsActivity2.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        dialogsActivity2.actionBarColorAnimator.setDuration(200L);
        dialogsActivity2.actionBarColorAnimator.start();
        dialogsActivity2.allowMoving = false;
        if (dialogsActivity2.movingDialogFilters.isEmpty()) {
            dialogsActivity = dialogsActivity2;
            r0 = 1;
        } else {
            int size = dialogsActivity2.movingDialogFilters.size();
            int i2 = 0;
            while (i2 < size) {
                MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) dialogsActivity2.movingDialogFilters.get(i2);
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.entities, dialogFilter.title_noanimate, dialogFilter.color, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i2++;
                size = size;
                dialogsActivity2 = this;
            }
            DialogsActivity dialogsActivity3 = dialogsActivity2;
            r0 = 1;
            dialogsActivity3.movingDialogFilters.clear();
            dialogsActivity = dialogsActivity3;
        }
        if (dialogsActivity.movingWas) {
            getMessagesController().reorderPinnedDialogs(dialogsActivity.folderId, null, 0L);
            z2 = false;
            dialogsActivity.movingWas = false;
        } else {
            z2 = false;
        }
        dialogsActivity.updateCounters(r0);
        if (dialogsActivity.viewPages != null) {
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = dialogsActivity.viewPages;
                if (i3 >= viewPageArr2.length) {
                    break;
                }
                viewPageArr2[i3].dialogsAdapter.onReorderStateChanged(z2);
                i3 += r0;
            }
        }
        dialogsActivity.updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK | (z ? MessagesController.UPDATE_MASK_CHAT : 0));
    }

    public void lambda$hideActionMode$104(float f, ValueAnimator valueAnimator) {
        this.viewPages[0].setTranslationY(f * (1.0f - this.progressToActionMode));
        this.progressToActionMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        checkUi_searchFieldVisibility();
        checkUi_itemBackButtonVisibility();
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    private int getPinnedCount() {
        ArrayList<TLRPC.Dialog> dialogsArray;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogsArray = getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, this.dialogsListFrozen);
        } else {
            dialogsArray = getMessagesController().getDialogs(this.folderId);
        }
        int size = dialogsArray.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.Dialog dialog = dialogsArray.get(i2);
            if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                if (!isDialogPinned(dialog)) {
                    if (!getMessagesController().isPromoDialog(dialog.id, false)) {
                        break;
                    }
                } else {
                    i++;
                }
            }
        }
        return i;
    }

    public boolean isDialogPinned(TLRPC.Dialog dialog) {
        if (dialog == null) {
            return false;
        }
        MessagesController.DialogFilter dialogFilter = null;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        }
        if (dialogFilter != null) {
            return dialogFilter.pinnedDialogs.indexOfKey(dialog.id) >= 0;
        }
        return dialog.pinned;
    }

    public void performSelectedDialogsAction(ArrayList arrayList, int i, boolean z, boolean z2) {
        performSelectedDialogsAction(arrayList, i, z, z2, null);
    }

    private void performSelectedDialogsAction(final java.util.ArrayList r31, final int r32, boolean r33, final boolean r34, final java.util.HashSet r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.performSelectedDialogsAction(java.util.ArrayList, int, boolean, boolean, java.util.HashSet):void");
    }

    public void lambda$performSelectedDialogsAction$105(ArrayList arrayList) {
        getMessagesController().addDialogToFolder(arrayList, (this.folderId == 0 && this.communityId == 0) ? 0 : 1, -1, null, 0L);
    }

    public void lambda$performSelectedDialogsAction$106(ArrayList arrayList, int i, boolean z, HashSet hashSet) {
        performSelectedDialogsAction(arrayList, i, false, z, hashSet);
    }

    public void lambda$performSelectedDialogsAction$108(ArrayList arrayList, final int i, final HashSet hashSet, final boolean z) {
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(arrayList);
        UndoView undoView = getUndoView();
        if (undoView != null) {
            undoView.showWithAction(arrayList2, i == 102 ? 27 : 26, (Object) null, (Object) null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSelectedDialogsAction$107(i, arrayList2, z, hashSet);
                }
            }, (Runnable) null);
        }
        hideActionMode(i == 103);
    }

    public void lambda$performSelectedDialogsAction$107(int i, ArrayList arrayList, boolean z, HashSet hashSet) {
        if (i == 102) {
            getMessagesController().setDialogsInTransaction(true);
            performSelectedDialogsAction(arrayList, i, false, false, z ? hashSet : null);
            getMessagesController().setDialogsInTransaction(false);
            getMessagesController().checkIfFolderEmpty(this.folderId);
            if (this.folderId == 0 || getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false).size() != 0) {
                return;
            }
            this.viewPages[0].listView.setEmptyView(null);
            this.viewPages[0].progressView.setVisibility(4);
            finishFragment();
            return;
        }
        performSelectedDialogsAction(arrayList, i, false, false);
    }

    public void lambda$performSelectedDialogsAction$109(ArrayList arrayList, boolean z, boolean z2) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Long l = (Long) arrayList.get(i);
            long jLongValue = l.longValue();
            if (z) {
                getMessagesController().reportSpam(jLongValue, getMessagesController().getUser(l), null, null, false);
            }
            if (z2) {
                getMessagesController().deleteDialog(jLongValue, 0, true);
            }
            getMessagesController().blockPeer(jLongValue);
        }
        hideActionMode(false);
    }

    public void lambda$performSelectedDialogsAction$110(AlertDialog alertDialog, int i) {
        getMessagesController().hidePromoDialog();
        hideActionMode(false);
    }

    public void lambda$performSelectedDialogsAction$112(final int i, final TLRPC.Chat chat, final long j, final boolean z, final boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList;
        hideActionMode(false);
        if (i == 103 && ChatObject.isChannel(chat)) {
            if (!chat.megagroup || ChatObject.isPublic(chat)) {
                getMessagesController().deleteDialog(j, 2, z2);
                return;
            }
        }
        if (i == 102 && this.folderId != 0 && getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false).size() == 1) {
            this.viewPages[0].progressView.setVisibility(4);
        }
        this.debugLastUpdateAction = 3;
        if (i == 102) {
            setDialogsListFrozen(true);
            if (this.frozenDialogsList != null) {
                int i6 = 0;
                while (i6 < this.frozenDialogsList.size()) {
                    if (((TLRPC.Dialog) this.frozenDialogsList.get(i6)).id == j) {
                        break;
                    } else {
                        i6++;
                    }
                }
                i6 = -1;
                checkAnimationFinished();
                i2 = i6;
            } else {
                i6 = -1;
                checkAnimationFinished();
                i2 = i6;
            }
        } else {
            i2 = -1;
        }
        UndoView undoView = getUndoView();
        if (undoView != null) {
            i3 = i2;
            undoView.showWithAction(j, i == 103 ? 0 : z2 ? 1 : 95, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$performSelectedDialogsAction$111(i, j, chat, z, z2);
                }
            });
        } else {
            i3 = i2;
        }
        ArrayList arrayList2 = new ArrayList(getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false));
        int i7 = 0;
        while (true) {
            if (i7 >= arrayList2.size()) {
                i4 = 102;
                i5 = -1;
                break;
            } else {
                if (((TLRPC.Dialog) arrayList2.get(i7)).id == j) {
                    i5 = i7;
                    i4 = 102;
                    break;
                }
                i7++;
            }
        }
        if (i == i4) {
            int i8 = i3;
            if (i8 >= 0 && i5 < 0 && (arrayList = this.frozenDialogsList) != null) {
                arrayList.remove(i8);
                this.viewPages[0].dialogsItemAnimator.prepareForRemove();
                this.viewPages[0].updateList(true);
                return;
            }
            setDialogsListFrozen(false);
        }
    }

    public void lambda$performSelectedDialogsAction$113(DialogInterface dialogInterface) {
        hideActionMode(true);
    }

    public void lambda$performSelectedDialogsAction$114(DialogInterface dialogInterface) {
        hideActionMode(true);
    }

    private void markAsRead(long r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.markAsRead(long):void");
    }

    private void markAsUnread(long j) {
        getMessagesController().markDialogAsUnread(j, null, 0L);
    }

    public void markDialogsAsRead(ArrayList arrayList) {
        this.debugLastUpdateAction = 2;
        setDialogsListFrozen(true);
        checkAnimationFinished();
        for (int i = 0; i < arrayList.size(); i++) {
            long j = ((TLRPC.Dialog) arrayList.get(i)).id;
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList.get(i);
            if (getMessagesController().isForum(j) || getMessagesController().isMonoForumWithManageRights(j)) {
                getMessagesController().markAllTopicsAsRead(j);
            }
            getMessagesController().markMentionsAsRead(j, 0L);
            MessagesController messagesController = getMessagesController();
            int i2 = dialog.top_message;
            messagesController.markDialogAsRead(j, i2, i2, dialog.last_message_date, false, 0L, 0, true, 0);
        }
    }

    public void lambda$performSelectedDialogsAction$111(int i, long j, TLRPC.Chat chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().deleteDialog(j, 1, z2);
            return;
        }
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j, 0, z2);
            } else {
                getMessagesController().deleteParticipantFromChat(-j, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z2, false);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z2);
            if (z && z2) {
                getMessagesController().blockPeer(j);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, Long.valueOf(j));
        }
        getMessagesController().checkIfFolderEmpty(this.folderId);
    }

    private void pinDialog(long r17, boolean r19, org.telegram.messenger.MessagesController.DialogFilter r20, int r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.pinDialog(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    public void lambda$pinDialog$115() {
        setDialogsListFrozen(false);
    }

    public void scrollToTop(boolean z, boolean z2) {
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) {
            int i = (this.viewPages[0].dialogsType == 0 && hasHiddenArchive() && this.viewPages[0].archivePullViewState == 2) ? 1 : 0;
            int i2 = (!this.hasStories || z2 || this.dialogStoriesCell.isExpanded()) ? 0 : -AndroidUtilities.dp(81.0f);
            if (z) {
                this.viewPages[0].scrollHelper.setScrollDirection(1);
                this.viewPages[0].scrollHelper.scrollToPosition(i, i2, false, true);
                resetScroll();
            } else {
                this.viewPages[0].layoutManager.scrollToPositionWithOffset(i, i2);
                resetScroll();
            }
        }
    }

    public void updateCounters(boolean z) {
        int i;
        boolean z2;
        int i2;
        long j;
        int i3;
        TLRPC.User user;
        this.canDeletePsaSelected = false;
        this.canUnarchiveCount = 0;
        this.canUnmuteCount = 0;
        this.canMuteCount = 0;
        this.canPinCount = 0;
        this.canReadCount = 0;
        this.forumCount = 0;
        this.canClearCacheCount = 0;
        this.canReportSpamCount = 0;
        if (z) {
            return;
        }
        int size = this.selectedDialogs.size();
        long clientUserId = getUserConfig().getClientUserId();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i4 < size) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(((Long) this.selectedDialogs.get(i4)).longValue());
            if (dialog == null) {
                i2 = size;
                j = clientUserId;
            } else {
                long j2 = dialog.id;
                boolean zIsDialogPinned = isDialogPinned(dialog);
                boolean z3 = dialog.unread_count != 0 || dialog.unread_mark;
                if (getMessagesController().isForum(j2)) {
                    i2 = size;
                    this.forumCount++;
                } else {
                    i2 = size;
                }
                j = clientUserId;
                if (getMessagesController().isDialogMuted(j2, 0L)) {
                    i3 = 1;
                    this.canUnmuteCount++;
                } else {
                    i3 = 1;
                    this.canMuteCount++;
                }
                if (z3) {
                    this.canReadCount += i3;
                }
                if (this.folderId == i3 || dialog.folder_id == i3) {
                    this.canUnarchiveCount++;
                } else if (j2 != j && j2 != 777000 && !getMessagesController().isPromoDialog(j2, false)) {
                    i7++;
                }
                if (!DialogObject.isUserDialog(j2) || j2 == j || j2 == 489000 || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j2)))) {
                    i9++;
                } else {
                    if (notificationsSettings.getBoolean("dialog_bar_report" + j2, true)) {
                        this.canReportSpamCount++;
                    }
                }
                if (DialogObject.isChannel(dialog)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-j2));
                    if (getMessagesController().isPromoDialog(dialog.id, true)) {
                        this.canClearCacheCount++;
                        if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                            i5++;
                            this.canDeletePsaSelected = true;
                        }
                    } else {
                        if (zIsDialogPinned) {
                            i8++;
                        } else {
                            this.canPinCount++;
                        }
                        if (chat == null || !chat.megagroup || ChatObject.isPublic(chat)) {
                            this.canClearCacheCount++;
                        }
                        i5++;
                    }
                } else {
                    boolean zIsChatDialog = DialogObject.isChatDialog(dialog.id);
                    if (zIsChatDialog) {
                        getMessagesController().getChat(Long.valueOf(-dialog.id));
                    }
                    if (DialogObject.isEncryptedDialog(dialog.id)) {
                        TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(dialog.id)));
                        if (encryptedChat != null) {
                            user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            user = new TLRPC.TL_userEmpty();
                        }
                    } else {
                        user = (zIsChatDialog || !DialogObject.isUserDialog(dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(dialog.id));
                    }
                    if (user != null && user.bot) {
                        MessagesController.isSupportUser(user);
                    }
                    if (zIsDialogPinned) {
                        i8++;
                    } else {
                        this.canPinCount++;
                    }
                }
                i6++;
                i5++;
            }
            i4++;
            size = i2;
            clientUserId = j;
        }
        int i10 = size;
        ActionBarMenuItem actionBarMenuItem = this.deleteItem;
        if (actionBarMenuItem != null) {
            if (i5 != i10) {
                actionBarMenuItem.setVisibility(8);
            } else {
                actionBarMenuItem.setVisibility(0);
            }
        }
        ActionBarMenuSubItem actionBarMenuSubItem = this.clearItem;
        if (actionBarMenuSubItem != null) {
            int i11 = this.canClearCacheCount;
            if ((i11 != 0 && i11 != i10) || (i6 != 0 && i6 != i10)) {
                actionBarMenuSubItem.setVisibility(8);
            } else {
                actionBarMenuSubItem.setVisibility(0);
                if (this.canClearCacheCount != 0) {
                    this.clearItem.setText(LocaleController.getString(R.string.ClearHistoryCache));
                } else {
                    this.clearItem.setText(LocaleController.getString(R.string.ClearHistory));
                }
            }
        }
        ActionBarMenuSubItem actionBarMenuSubItem2 = this.archiveItem;
        if (actionBarMenuSubItem2 != null && this.archive2Item != null) {
            if (this.canUnarchiveCount != 0) {
                String string = LocaleController.getString(R.string.Unarchive);
                ActionBarMenuSubItem actionBarMenuSubItem3 = this.archiveItem;
                int i12 = R.drawable.msg_unarchive;
                actionBarMenuSubItem3.setTextAndIcon(string, i12);
                this.archive2Item.setIcon(i12);
                this.archive2Item.setContentDescription(string);
                FilterTabsView filterTabsView = this.filterTabsView;
                if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
                    this.archive2Item.setVisibility(0);
                    this.archiveItem.setVisibility(8);
                } else {
                    this.archiveItem.setVisibility(0);
                    this.archive2Item.setVisibility(8);
                }
            } else if (i7 != 0) {
                String string2 = LocaleController.getString(R.string.Archive);
                ActionBarMenuSubItem actionBarMenuSubItem4 = this.archiveItem;
                int i13 = R.drawable.msg_archive;
                actionBarMenuSubItem4.setTextAndIcon(string2, i13);
                this.archive2Item.setIcon(i13);
                this.archive2Item.setContentDescription(string2);
                FilterTabsView filterTabsView2 = this.filterTabsView;
                if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0) {
                    this.archive2Item.setVisibility(0);
                    this.archiveItem.setVisibility(8);
                } else {
                    this.archiveItem.setVisibility(0);
                    this.archive2Item.setVisibility(8);
                }
            } else {
                actionBarMenuSubItem2.setVisibility(8);
                this.archive2Item.setVisibility(8);
            }
        }
        ActionBarMenuItem actionBarMenuItem2 = this.pinItem;
        if (actionBarMenuItem2 == null || this.pin2Item == null) {
            i = 0;
        } else if (this.canPinCount + i8 != i10) {
            actionBarMenuItem2.setVisibility(8);
            this.pin2Item.setVisibility(8);
            i = 0;
        } else {
            FilterTabsView filterTabsView3 = this.filterTabsView;
            if (filterTabsView3 != null && filterTabsView3.getVisibility() == 0) {
                i = 0;
                this.pin2Item.setVisibility(0);
                this.pinItem.setVisibility(8);
            } else {
                i = 0;
                this.pinItem.setVisibility(0);
                this.pin2Item.setVisibility(8);
            }
        }
        ActionBarMenuSubItem actionBarMenuSubItem5 = this.blockItem;
        if (actionBarMenuSubItem5 != null) {
            if (i9 != 0) {
                actionBarMenuSubItem5.setVisibility(8);
            } else {
                actionBarMenuSubItem5.setVisibility(i);
            }
        }
        if (this.removeFromFolderItem == null) {
            z2 = false;
        } else {
            FilterTabsView filterTabsView4 = this.filterTabsView;
            boolean z4 = filterTabsView4 == null || filterTabsView4.getVisibility() != 0 || this.filterTabsView.currentTabIsDefault();
            if (!z4) {
                try {
                    z4 = i10 >= getDialogsArray(this.currentAccount, this.viewPages[0].dialogsAdapter.getDialogsType(), this.folderId, this.dialogsListFrozen).size();
                } catch (Exception unused) {
                }
            }
            if (z4) {
                this.removeFromFolderItem.setVisibility(8);
                z2 = false;
            } else {
                z2 = false;
                this.removeFromFolderItem.setVisibility(0);
            }
        }
        if (this.addToFolderItem != null) {
            if (this.folderId == 1 || (this.filterTabsView != null && getFilterTabsVisibilityFactor(z2) > 0.5f && this.filterTabsView.currentTabIsDefault() && !FiltersListBottomSheet.getCanAddDialogFilters(this, this.selectedDialogs).isEmpty())) {
                this.addToFolderItem.setVisibility(0);
            } else {
                this.addToFolderItem.setVisibility(8);
            }
        }
        ActionBarMenuItem actionBarMenuItem3 = this.muteItem;
        if (actionBarMenuItem3 != null) {
            if (this.canUnmuteCount != 0) {
                actionBarMenuItem3.setIcon(R.drawable.msg_unmute);
                this.muteItem.setContentDescription(LocaleController.getString(R.string.ChatsUnmute));
            } else {
                actionBarMenuItem3.setIcon(R.drawable.msg_mute);
                this.muteItem.setContentDescription(LocaleController.getString(R.string.ChatsMute));
            }
        }
        ActionBarMenuSubItem actionBarMenuSubItem6 = this.readItem;
        if (actionBarMenuSubItem6 != null) {
            if (this.canReadCount != 0) {
                actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString(R.string.MarkAsRead), R.drawable.msg_markread);
                this.readItem.setVisibility(0);
            } else if (this.forumCount == 0) {
                actionBarMenuSubItem6.setTextAndIcon(LocaleController.getString(R.string.MarkAsUnread), R.drawable.msg_markunread);
                this.readItem.setVisibility(0);
            } else {
                actionBarMenuSubItem6.setVisibility(8);
            }
        }
        ActionBarMenuItem actionBarMenuItem4 = this.pinItem;
        if (actionBarMenuItem4 == null || this.pin2Item == null) {
            return;
        }
        if (this.canPinCount != 0) {
            actionBarMenuItem4.setIcon(R.drawable.msg_pin);
            this.pinItem.setContentDescription(LocaleController.getString(R.string.PinToTop));
            this.pin2Item.setText(LocaleController.getString(R.string.DialogPin));
        } else {
            actionBarMenuItem4.setIcon(R.drawable.msg_unpin);
            this.pinItem.setContentDescription(LocaleController.getString(R.string.UnpinFromTop));
            this.pin2Item.setText(LocaleController.getString(R.string.DialogUnpin));
        }
    }

    public boolean validateSlowModeDialog(long j) {
        TLRPC.Chat chat;
        ChatActivityEnterView chatActivityEnterView;
        if ((this.messagesCount <= 1 && ((chatActivityEnterView = this.commentView) == null || chatActivityEnterView.getVisibility() != 0 || TextUtils.isEmpty(this.commentView.getFieldText()))) || !DialogObject.isChatDialog(j) || (chat = getMessagesController().getChat(Long.valueOf(-j))) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled) {
            return true;
        }
        AlertsCreator.showSimpleAlert(this, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSendError));
        return false;
    }

    private void showOrUpdateActionMode(long j, View view) {
        addOrRemoveSelectedDialog(j, view);
        boolean z = true;
        if (this.actionBar.isActionModeShowed()) {
            if (this.selectedDialogs.isEmpty()) {
                hideActionMode(true);
                return;
            }
        } else {
            if (this.searchIsShowed) {
                createActionMode("search_dialogs_action_mode");
                if (this.actionBar.getBackButton() != null && (this.actionBar.getBackButton().getDrawable() instanceof MenuDrawable)) {
                    this.actionBar.setBackButtonDrawable(new BackDrawable(false));
                }
            } else {
                createActionMode(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(getThemedColor(Theme.key_windowBackgroundWhite));
            this.actionBar.showActionMode();
            if (getPinnedCount() > 1) {
                if (this.viewPages != null) {
                    int i = 0;
                    while (true) {
                        ViewPage[] viewPageArr = this.viewPages;
                        if (i >= viewPageArr.length) {
                            break;
                        }
                        viewPageArr[i].dialogsAdapter.onReorderStateChanged(true);
                        i++;
                    }
                }
                updateVisibleRows(MessagesController.UPDATE_MASK_REORDER);
            }
            if (!this.searchIsShowed) {
                AnimatorSet animatorSet = new AnimatorSet();
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < this.actionModeViews.size(); i2++) {
                    View view2 = (View) this.actionModeViews.get(i2);
                    view2.setPivotY(ActionBar.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList.add(ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.actionBarColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.actionBarColorAnimator = ValueAnimator.ofFloat(this.progressToActionMode, 1.0f);
            int i3 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i3 >= viewPageArr2.length) {
                    break;
                }
                ViewPage viewPage = viewPageArr2[i3];
                if (viewPage != null) {
                    viewPage.listView.cancelClickRunnables(true);
                }
                i3++;
            }
            final float fMax = Math.max(0.0f, AndroidUtilities.dp((this.hasStories ? 81 : 0) + 48) + this.scrollYOffset);
            if (fMax != 0.0f) {
                this.actionModeAdditionalHeight = (int) fMax;
                this.fragmentView.requestLayout();
            }
            this.actionBarColorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    this.f$0.lambda$showOrUpdateActionMode$116(fMax, valueAnimator2);
                }
            });
            this.actionBarColorAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    DialogsActivity.this.actionBarColorAnimator = null;
                    DialogsActivity.this.actionModeAdditionalHeight = 0;
                    DialogsActivity.this.actionModeFullyShowed = true;
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivity.scrollAdditionalOffset = AndroidUtilities.dp((dialogsActivity.hasStories ? 81 : 0) + 48) - fMax;
                    DialogsActivity.this.viewPages[0].setTranslationY(0.0f);
                    for (int i4 = 0; i4 < DialogsActivity.this.viewPages.length; i4++) {
                        if (DialogsActivity.this.viewPages[i4] != null) {
                            DialogsActivity.this.viewPages[i4].listView.requestLayout();
                        }
                    }
                    DialogsActivity.this.dialogStoriesCell.setProgressToCollapse(1.0f, false);
                    DialogsActivity.this.fragmentView.requestLayout();
                }
            });
            this.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.actionBarColorAnimator.setDuration(200L);
            this.actionBarColorAnimator.start();
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.animateColorsTo(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector, Theme.key_actionBarActionModeDefault);
            }
            BackDrawable backDrawable = this.backDrawable;
            if (backDrawable != null) {
                backDrawable.setRotation(1.0f, true);
            }
            z = false;
        }
        updateCounters(false);
        this.selectedDialogsCountTextView.setNumber(this.selectedDialogs.size(), z);
    }

    public void lambda$showOrUpdateActionMode$116(float f, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.progressToActionMode = fFloatValue;
        this.viewPages[0].setTranslationY((-f) * fFloatValue);
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        checkUi_searchFieldVisibility();
        checkUi_itemBackButtonVisibility();
    }

    public void closeSearch() {
        if (AndroidUtilities.isTablet()) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                SearchViewPager searchViewPager = this.searchViewPager;
                if (searchViewPager != null) {
                    searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                }
                this.searchObject = null;
                return;
            }
            return;
        }
        this.closeSearchFieldOnHide = true;
    }

    protected RecyclerListView getListView() {
        return this.viewPages[0].listView;
    }

    protected RecyclerListView getSearchListView() {
        createSearchViewPager();
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            return searchViewPager.searchListView;
        }
        return null;
    }

    public void createUndoView() {
        Context context;
        if (this.undoView[0] == null && (context = getContext()) != null) {
            for (int i = 0; i < 2; i++) {
                this.undoView[i] = new AnonymousClass37(context);
                FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f);
                layoutParamsCreateFrame.bottomMargin += this.navigationBarHeight + this.additionNavigationBarHeight;
                ContentView contentView = (ContentView) this.fragmentView;
                UndoView undoView = this.undoView[i];
                int i2 = this.undoViewIndex + 1;
                this.undoViewIndex = i2;
                contentView.addView(undoView, i2, layoutParamsCreateFrame);
            }
        }
    }

    class AnonymousClass37 extends UndoView {
        AnonymousClass37(Context context) {
            super(context);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (this == DialogsActivity.this.undoView[0]) {
                if (DialogsActivity.this.undoView[1] == null || DialogsActivity.this.undoView[1].getVisibility() != 0) {
                    DialogsActivity.this.additionalFloatingTranslation = Math.max(0.0f, (getMeasuredHeight() + AndroidUtilities.dp(8.0f)) - f);
                    DialogsActivity.this.updateFloatingButtonOffset();
                }
            }
        }

        @Override
        protected boolean canUndo() {
            for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                if (DialogsActivity.this.viewPages[i].dialogsItemAnimator.isRunning()) {
                    return false;
                }
            }
            return true;
        }

        @Override
        protected void onRemoveDialogAction(long j, int i) {
            if (i == 1 || i == 27) {
                DialogsActivity.this.debugLastUpdateAction = 1;
                DialogsActivity.this.setDialogsListFrozen(true);
                if (DialogsActivity.this.frozenDialogsList != null) {
                    final int i2 = 0;
                    while (true) {
                        if (i2 >= DialogsActivity.this.frozenDialogsList.size()) {
                            i2 = -1;
                            break;
                        } else if (((TLRPC.Dialog) DialogsActivity.this.frozenDialogsList.get(i2)).id == j) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 >= 0) {
                        final TLRPC.Dialog dialog = (TLRPC.Dialog) DialogsActivity.this.frozenDialogsList.remove(i2);
                        DialogsActivity.this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$onRemoveDialogAction$0(i2, dialog);
                            }
                        });
                    } else {
                        DialogsActivity.this.setDialogsListFrozen(false);
                    }
                }
                DialogsActivity.this.checkAnimationFinished();
            }
        }

        public void lambda$onRemoveDialogAction$0(int i, TLRPC.Dialog dialog) {
            if (DialogsActivity.this.frozenDialogsList == null || i < 0 || i >= DialogsActivity.this.frozenDialogsList.size()) {
                return;
            }
            DialogsActivity.this.frozenDialogsList.add(i, dialog);
            DialogsActivity.this.viewPages[0].updateList(true);
        }
    }

    public UndoView getUndoView() {
        createUndoView();
        UndoView undoView = this.undoView[0];
        if (undoView != null && undoView.getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView2 = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView2;
            undoView2.hide(true, 2);
            ContentView contentView = (ContentView) this.fragmentView;
            contentView.removeView(this.undoView[0]);
            contentView.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public void updateProxyButton(boolean z, boolean z2) {
        boolean z3;
        if (this.proxyDrawable != null) {
            ActionBarMenuItem actionBarMenuItem = this.doneItem;
            if (actionBarMenuItem == null || actionBarMenuItem.getVisibility() != 0) {
                int i = 0;
                while (true) {
                    if (i >= getDownloadController().downloadingFiles.size()) {
                        z3 = false;
                        break;
                    } else {
                        if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i).getFileName())) {
                            z3 = true;
                            break;
                        }
                        i++;
                    }
                }
                if (getDownloadController().hasUnviewedDownloads() || z3 || (this.downloadsItem.getVisibility() == 0 && this.downloadsItem.getAlpha() == 1.0f && !z2)) {
                    this.downloadsItemVisible = true;
                } else {
                    this.downloadsItemVisible = false;
                }
                checkUi_itemDownloadsVisibility();
                boolean z4 = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0).getBoolean("proxy_enabled", false);
                int i2 = this.currentConnectionState;
                boolean z5 = i2 == 3 || i2 == 5;
                this.proxyMenuSubItem.setSubtext(LocaleController.getString(z4 ? z5 ? R.string.MenuProxyConnected : R.string.MenuProxyConnecting : R.string.MenuProxyDisabled));
                this.proxyDrawable.setConnected(z4, z5, z);
            }
        }
    }

    public void showDoneItem(final boolean z) {
        this.animatorDoneButtonVisible.setValue(z, true);
        if (this.doneItem == null) {
            return;
        }
        AnimatorSet animatorSet = this.doneItemAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.doneItemAnimator = null;
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.doneItemAnimator = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z) {
            this.doneItem.setVisibility(0);
        } else {
            this.doneItem.setSelected(false);
            Drawable background = this.doneItem.getBackground();
            if (background != null) {
                background.setState(StateSet.NOTHING);
                background.jumpToCurrentState();
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.doneItem, (Property<ActionBarMenuItem, Float>) View.ALPHA, z ? 1.0f : 0.0f));
        this.doneItemAnimator.playTogether(arrayList);
        this.doneItemAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                DialogsActivity.this.doneItemAnimator = null;
                if (z || DialogsActivity.this.doneItem == null) {
                    return;
                }
                DialogsActivity.this.doneItem.setVisibility(8);
            }
        });
        this.doneItemAnimator.start();
    }

    public void updateSelectedCount() throws Resources.NotFoundException {
        ShareTopView shareTopView;
        if (this.commentView != null) {
            this.animatorForwardButtonVisible.setValue(!this.selectedDialogs.isEmpty(), true);
            updateShareTopViewRecipients();
            if (this.selectedDialogs.isEmpty()) {
                String string = LocaleController.getString((this.initialDialogsType == 3 && this.selectAlertString == null) ? R.string.ForwardTo : R.string.SelectChat);
                if (this.wasSelectedDialogsEmpty == this.selectedDialogs.isEmpty()) {
                    this.actionBar.setTitle(string);
                } else {
                    this.actionBar.setTitleAnimated(string, true, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
                }
                if (this.commentView.getTag() != null) {
                    this.commentView.hidePopup(false, false, false);
                    this.commentView.closeKeyboard();
                    this.commentView.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                if (this.commentView.getTag() == null) {
                    if (!hasSharedMediaEntries() && this.sharedLink == null) {
                        this.commentView.setFieldText("");
                    }
                    this.commentView.setTag(1);
                    if (!this.shareHintStarted && (shareTopView = this.shareTopView) != null) {
                        this.shareHintStarted = true;
                        shareTopView.startHintRotation(LocaleController.getString(R.string.ShareTapToEditMedia));
                    }
                }
                this.writeButton.setCount(Math.max(1, this.selectedDialogs.size()), true);
                int i = this.messagesCount + (1 ^ (TextUtils.isEmpty(this.commentView.getFieldText()) ? 1 : 0));
                Iterator it = this.selectedDialogs.iterator();
                long j = 0;
                while (it.hasNext()) {
                    long jLongValue = ((Long) it.next()).longValue();
                    long sendPaidMessagesStars = getMessagesController().getSendPaidMessagesStars(jLongValue);
                    if (sendPaidMessagesStars <= 0 && jLongValue > 0) {
                        sendPaidMessagesStars = DialogObject.getMessagesStarsPrice(getMessagesController().isUserContactBlocked(jLongValue));
                    }
                    j += sendPaidMessagesStars;
                }
                this.writeButton.setStarsPrice(j, i);
                this.commentView.updateSendButtonPaid();
                if (this.wasSelectedDialogsEmpty == this.selectedDialogs.isEmpty()) {
                    this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", this.selectedDialogs.size(), new Object[0]));
                } else {
                    this.actionBar.setTitleAnimated(LocaleController.formatPluralString("Recipient", this.selectedDialogs.size(), new Object[0]), false, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
                }
            }
            this.wasSelectedDialogsEmpty = this.selectedDialogs.isEmpty();
            return;
        }
        if (this.initialDialogsType == 10) {
            hideFloatingButton(this.selectedDialogs.isEmpty());
        }
    }

    private void askForPermissons(boolean z) {
        final Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (this.folderId == 0 && this.communityId == 0 && Build.VERSION.SDK_INT >= 33 && NotificationPermissionDialog.shouldAsk(parentActivity)) {
            if (z) {
                showDialog(new NotificationPermissionDialog(parentActivity, !PermissionRequest.canAskPermission("android.permission.POST_NOTIFICATIONS"), new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        DialogsActivity.lambda$askForPermissons$117(parentActivity, (Boolean) obj);
                    }
                }));
                return;
            }
            arrayList.add("android.permission.POST_NOTIFICATIONS");
        }
        if (getUserConfig().syncContacts && this.askAboutContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z) {
                AlertDialog alertDialogCreate = AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        this.f$0.lambda$askForPermissons$118(i);
                    }
                }).create();
                this.permissionDialog = alertDialogCreate;
                showDialog(alertDialogCreate);
                return;
            } else {
                arrayList.add("android.permission.READ_CONTACTS");
                arrayList.add("android.permission.WRITE_CONTACTS");
                arrayList.add("android.permission.GET_ACCOUNTS");
            }
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
            if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
        } else if ((i <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        if (arrayList.isEmpty()) {
            if (this.askingForPermissions) {
                this.askingForPermissions = false;
                showFiltersHint();
                return;
            }
            return;
        }
        try {
            parentActivity.requestPermissions((String[]) arrayList.toArray(new String[0]), 1);
        } catch (Exception unused) {
        }
    }

    public static void lambda$askForPermissons$117(Activity activity, Boolean bool) {
        if (bool.booleanValue()) {
            if (!PermissionRequest.canAskPermission("android.permission.POST_NOTIFICATIONS")) {
                PermissionRequest.showPermissionSettings("android.permission.POST_NOTIFICATIONS");
            } else {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 1);
            }
        }
    }

    public void lambda$askForPermissons$118(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).commit();
        askForPermissons(false);
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        AlertDialog alertDialog;
        super.onDialogDismiss(dialog);
        if (this.folderId == 0 && this.communityId == 0 && (alertDialog = this.permissionDialog) != null && dialog == alertDialog && getParentActivity() != null) {
            askForPermissons(false);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        if (i != 1) {
            if (i == 4) {
                for (int i2 : iArr) {
                    if (i2 != 0) {
                        return;
                    }
                }
                if (Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
                    return;
                }
                filesMigrationBottomSheet.migrateOldFolder();
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < strArr.length; i3++) {
            if (iArr.length > i3) {
                String str = strArr[i3];
                str.hashCode();
                switch (str) {
                    case "android.permission.POST_NOTIFICATIONS":
                        if (iArr[i3] == 0) {
                            NotificationsController.getInstance(this.currentAccount).showNotifications();
                            break;
                        } else {
                            NotificationPermissionDialog.askLater();
                            break;
                        }
                    case "android.permission.WRITE_EXTERNAL_STORAGE":
                        if (iArr[i3] == 0) {
                            ImageLoader.getInstance().checkMediaPaths();
                            break;
                        } else {
                            break;
                        }
                    case "android.permission.READ_CONTACTS":
                        if (iArr[i3] == 0) {
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$onRequestPermissionsResultFragment$119();
                                }
                            });
                            getContactsController().forceImportContacts();
                            break;
                        } else {
                            SharedPreferences.Editor editorEdit = MessagesController.getGlobalNotificationsSettings().edit();
                            this.askAboutContacts = false;
                            editorEdit.putBoolean("askAboutContacts", false).commit();
                            break;
                        }
                }
            }
        }
        if (this.askingForPermissions) {
            this.askingForPermissions = false;
            showFiltersHint();
        }
    }

    public void lambda$onRequestPermissionsResultFragment$119() {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.forceImportContactsStart, new Object[0]);
    }

    private void reloadViewPageDialogs(ViewPage viewPage, boolean z) {
        int i;
        int i2;
        if (viewPage.getVisibility() != 0) {
            return;
        }
        int currentCount = viewPage.dialogsAdapter.getCurrentCount();
        if (viewPage.dialogsType == 0 && hasHiddenArchive() && viewPage.listView.getChildCount() == 0 && viewPage.archivePullViewState == 2) {
            ((LinearLayoutManager) viewPage.listView.getLayoutManager()).scrollToPositionWithOffset(1, (int) this.scrollYOffset);
        }
        if (viewPage.dialogsAdapter.isDataSetChanged() || z) {
            viewPage.dialogsAdapter.updateHasHints();
            int itemCount = viewPage.dialogsAdapter.getItemCount();
            if (itemCount == 1 && currentCount == 1 && viewPage.dialogsAdapter.getItemViewType(0) == 5) {
                viewPage.updateList(true);
            } else {
                viewPage.updateList(false);
                if (itemCount > currentCount && (i = this.initialDialogsType) != 11 && i != 12 && i != 13) {
                    viewPage.recyclerItemsEnterAnimator.showItemsAnimated(currentCount);
                }
            }
        } else {
            updateVisibleRows(MessagesController.UPDATE_MASK_NEW_MESSAGE);
            if (viewPage.dialogsAdapter.getItemCount() > currentCount && (i2 = this.initialDialogsType) != 11 && i2 != 12 && i2 != 13) {
                viewPage.recyclerItemsEnterAnimator.showItemsAnimated(currentCount);
            }
        }
        try {
            viewPage.listView.setEmptyView((this.folderId == 0 && this.communityId == 0) ? viewPage.progressView : null);
        } catch (Exception e) {
            FileLog.e(e);
        }
        checkListLoad(viewPage);
    }

    public void setPanTranslationOffset(float f) {
        this.floatingButtonPanOffset = f;
        updateFloatingButtonOffset();
    }

    @Override
    public void didReceivedNotification(int i, int i2, final Object... objArr) {
        MessagesController.DialogFilter dialogFilter;
        boolean zBooleanValue;
        final boolean zBooleanValue2;
        DialogsSearchAdapter dialogsSearchAdapter;
        DialogsSearchAdapter dialogsSearchAdapter2;
        boolean progressVisible;
        MessagesController.DialogFilter dialogFilter2;
        int i3 = 0;
        if (i == NotificationCenter.dialogsNeedReload) {
            if (this.viewPages == null || this.dialogsListFrozen) {
                return;
            }
            int i4 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i4 >= viewPageArr.length) {
                    break;
                }
                final ViewPage viewPage = viewPageArr[i4];
                if (viewPageArr[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) {
                    dialogFilter2 = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                } else {
                    dialogFilter2 = null;
                }
                boolean z = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.slowedReloadAfterDialogClick && z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$didReceivedNotification$120(viewPage, objArr);
                        }
                    }, 160L);
                } else {
                    reloadViewPageDialogs(viewPage, objArr.length > 0);
                }
                i4++;
            }
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
                this.filterTabsView.checkTabsCounter();
            }
            this.slowedReloadAfterDialogClick = false;
            return;
        }
        if (i == NotificationCenter.topicsDidLoaded) {
            updateVisibleRows(0);
            return;
        }
        if (i == NotificationCenter.chatInfoDidLoad) {
            TLRPC.ChatFull chatFull = (TLRPC.ChatFull) objArr[0];
            if (this.communityId != chatFull.id) {
                return;
            }
            this.communityFull = chatFull;
            checkCommunityPendingRequestsVisible(false);
            if (this.viewPages == null || this.dialogsListFrozen) {
                return;
            }
            int i5 = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i5 >= viewPageArr2.length) {
                    return;
                }
                reloadViewPageDialogs(viewPageArr2[i5], false);
                i5++;
            }
        } else {
            if (i == NotificationCenter.dialogsUnreadCounterChanged) {
                FilterTabsView filterTabsView2 = this.filterTabsView;
                if (filterTabsView2 == null || filterTabsView2.getVisibility() != 0) {
                    return;
                }
                FilterTabsView filterTabsView3 = this.filterTabsView;
                filterTabsView3.notifyTabCounterChanged(filterTabsView3.getDefaultTabId());
                return;
            }
            if (i == NotificationCenter.dialogsUnreadPollVotesCounterChanged) {
                updateVisibleRows(0);
                return;
            }
            if (i == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
                updateVisibleRows(0);
                return;
            }
            if (i == NotificationCenter.emojiLoaded) {
                if (this.viewPages != null) {
                    int i6 = 0;
                    while (true) {
                        ViewPage[] viewPageArr3 = this.viewPages;
                        if (i6 >= viewPageArr3.length) {
                            break;
                        }
                        DialogsRecyclerView dialogsRecyclerView = viewPageArr3[i6].listView;
                        if (dialogsRecyclerView != null) {
                            for (int i7 = 0; i7 < dialogsRecyclerView.getChildCount(); i7++) {
                                View childAt = dialogsRecyclerView.getChildAt(i7);
                                if (childAt != null) {
                                    childAt.invalidate();
                                }
                            }
                        }
                        i6++;
                    }
                }
                FilterTabsView filterTabsView4 = this.filterTabsView;
                if (filterTabsView4 != null) {
                    filterTabsView4.getTabsContainer().invalidateViews();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.closeSearchByActiveAction) {
                ActionBar actionBar = this.actionBar;
                if (actionBar != null) {
                    actionBar.closeSearchField();
                    return;
                }
                return;
            }
            if (i == NotificationCenter.proxySettingsChanged) {
                updateProxyButton(false, false);
                return;
            }
            if (i == NotificationCenter.updateInterfaces) {
                Integer num = (Integer) objArr[0];
                updateVisibleRows(num.intValue());
                FilterTabsView filterTabsView5 = this.filterTabsView;
                if (filterTabsView5 != null && filterTabsView5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                    this.filterTabsView.checkTabsCounter();
                }
                if (this.communityId != 0 && ((num.intValue() & MessagesController.UPDATE_MASK_CHAT) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_AVATAR) != 0 || (num.intValue() & MessagesController.UPDATE_MASK_CHAT_NAME) != 0)) {
                    TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.communityId));
                    this.community = chat;
                    this.actionBar.setTitle(DialogObject.getName(chat));
                    this.communityAvatarImage.setForUserOrChat(this.community, this.communityAvatarDrawable);
                }
                if (this.viewPages != null) {
                    while (i3 < this.viewPages.length) {
                        if ((num.intValue() & MessagesController.UPDATE_MASK_STATUS) != 0) {
                            this.viewPages[i3].dialogsAdapter.sortOnlineContacts(true);
                        }
                        i3++;
                    }
                }
                updateStatus(UserConfig.getInstance(i2).getCurrentUser(), true);
                return;
            }
            if (i == NotificationCenter.appDidLogout) {
                dialogsLoaded[this.currentAccount] = false;
                return;
            }
            if (i == NotificationCenter.encryptedChatUpdated) {
                updateVisibleRows(0);
                return;
            }
            if (i == NotificationCenter.contactsDidLoad) {
                if (this.viewPages == null || this.dialogsListFrozen) {
                    return;
                }
                FragmentFloatingButton fragmentFloatingButton = this.floatingButton3;
                if (fragmentFloatingButton != null) {
                    progressVisible = fragmentFloatingButton.getProgressVisible();
                    this.floatingButton3.setProgressVisible(false, true);
                } else {
                    progressVisible = false;
                }
                for (ViewPage viewPage2 : this.viewPages) {
                    viewPage2.dialogsAdapter.setForceUpdatingContacts(false);
                }
                if (progressVisible) {
                    setContactsAlpha(0.0f);
                    animateContactsAlpha(1.0f);
                }
                int i8 = 0;
                boolean z2 = false;
                while (true) {
                    ViewPage[] viewPageArr4 = this.viewPages;
                    if (i8 >= viewPageArr4.length) {
                        break;
                    }
                    if (!viewPageArr4[i8].isDefaultDialogType() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                        z2 = true;
                    } else {
                        this.viewPages[i8].dialogsAdapter.notifyDataSetChanged();
                    }
                    i8++;
                }
                if (z2) {
                    updateVisibleRows(0);
                    return;
                }
                return;
            }
            if (i == NotificationCenter.openedChatChanged) {
                if (this.viewPages == null) {
                    return;
                }
                int i9 = 0;
                while (true) {
                    ViewPage[] viewPageArr5 = this.viewPages;
                    if (i9 < viewPageArr5.length) {
                        if (viewPageArr5[i9].isDefaultDialogType() && AndroidUtilities.isTablet()) {
                            boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
                            long jLongValue = ((Long) objArr[0]).longValue();
                            long jLongValue2 = ((Long) objArr[1]).longValue();
                            if (zBooleanValue3) {
                                MessagesStorage.TopicKey topicKey = this.openedDialogId;
                                if (jLongValue == topicKey.dialogId && jLongValue2 == topicKey.topicId) {
                                    topicKey.dialogId = 0L;
                                    topicKey.topicId = 0L;
                                }
                            } else {
                                MessagesStorage.TopicKey topicKey2 = this.openedDialogId;
                                topicKey2.dialogId = jLongValue;
                                topicKey2.topicId = jLongValue2;
                            }
                            this.viewPages[i9].dialogsAdapter.setOpenedDialogId(this.openedDialogId.dialogId);
                        }
                        i9++;
                    } else {
                        updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
                        return;
                    }
                }
            } else {
                if (i == NotificationCenter.notificationsSettingsUpdated) {
                    updateVisibleRows(0);
                    return;
                }
                if (i == NotificationCenter.messageReceivedByAck || i == NotificationCenter.messageReceivedByServer || i == NotificationCenter.messageSendError) {
                    updateVisibleRows(MessagesController.UPDATE_MASK_SEND_STATE);
                    return;
                }
                if (i == NotificationCenter.didSetPasscode) {
                    checkUi_itemPasscodeVisibility();
                    return;
                }
                if (i == NotificationCenter.needReloadRecentDialogsSearch) {
                    SearchViewPager searchViewPager = this.searchViewPager;
                    if (searchViewPager == null || (dialogsSearchAdapter2 = searchViewPager.dialogsSearchAdapter) == null) {
                        return;
                    }
                    dialogsSearchAdapter2.loadRecentSearch();
                    return;
                }
                if (i == NotificationCenter.replyMessagesDidLoad) {
                    updateVisibleRows(MessagesController.UPDATE_MASK_MESSAGE_TEXT);
                    return;
                }
                if (i == NotificationCenter.reloadHints) {
                    SearchViewPager searchViewPager2 = this.searchViewPager;
                    if (searchViewPager2 == null || (dialogsSearchAdapter = searchViewPager2.dialogsSearchAdapter) == null) {
                        return;
                    }
                    dialogsSearchAdapter.notifyDataSetChanged();
                    return;
                }
                if (i == NotificationCenter.didUpdateConnectionState) {
                    int connectionState = AccountInstance.getInstance(i2).getConnectionsManager().getConnectionState();
                    if (this.currentConnectionState != connectionState) {
                        this.currentConnectionState = connectionState;
                        updateProxyButton(true, false);
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.onDownloadingFilesChanged) {
                    updateProxyButton(true, false);
                    SearchViewPager searchViewPager3 = this.searchViewPager;
                    if (searchViewPager3 != null) {
                        updateSpeedItem(searchViewPager3.isDownloadsTab(searchViewPager3.getCurrentPosition()));
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.needDeleteDialog) {
                    if (this.fragmentView == null) {
                        return;
                    }
                    final long jLongValue3 = ((Long) objArr[0]).longValue();
                    final TLRPC.User user = (TLRPC.User) objArr[1];
                    final TLRPC.Chat chat2 = (TLRPC.Chat) objArr[2];
                    if (user != null && user.bot) {
                        zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
                        zBooleanValue = false;
                    } else {
                        zBooleanValue = ((Boolean) objArr[3]).booleanValue();
                        zBooleanValue2 = false;
                    }
                    final boolean z3 = zBooleanValue;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$didReceivedNotification$121(chat2, jLongValue3, z3, user, zBooleanValue2);
                        }
                    };
                    createUndoView();
                    if (this.undoView[0] != null) {
                        if (!ChatObject.isForum(chat2)) {
                            UndoView undoView = getUndoView();
                            if (undoView != null) {
                                undoView.showWithAction(jLongValue3, zBooleanValue ? 1 : 95, runnable);
                                return;
                            }
                            return;
                        }
                        runnable.run();
                        return;
                    }
                    runnable.run();
                    return;
                }
                if (i == NotificationCenter.folderBecomeEmpty) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    int i10 = this.folderId;
                    if (i10 != iIntValue || i10 == 0) {
                        return;
                    }
                    finishFragment();
                    return;
                }
                if (i == NotificationCenter.dialogFiltersUpdated) {
                    updateFilterTabs(true, true);
                    return;
                }
                if (i == NotificationCenter.filterSettingsUpdated) {
                    showFiltersHint();
                    return;
                }
                if (i == NotificationCenter.newSuggestionsAvailable) {
                    showNextSupportedSuggestion();
                    lambda$updateDialogsHint$41();
                    checkEmailConfig();
                    return;
                }
                if (i == NotificationCenter.forceImportContactsStart) {
                    FragmentFloatingButton fragmentFloatingButton2 = this.floatingButton3;
                    if (fragmentFloatingButton2 != null) {
                        fragmentFloatingButton2.setProgressVisible(true, true);
                    }
                    ViewPage[] viewPageArr6 = this.viewPages;
                    if (viewPageArr6 != null) {
                        for (ViewPage viewPage3 : viewPageArr6) {
                            viewPage3.dialogsAdapter.setForceShowEmptyCell(false);
                            viewPage3.dialogsAdapter.setForceUpdatingContacts(true);
                            viewPage3.dialogsAdapter.notifyDataSetChanged();
                        }
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.messagesDeleted) {
                    if (!this.searchIsShowed || this.searchViewPager == null) {
                        return;
                    }
                    this.searchViewPager.messagesDeleted(((Long) objArr[1]).longValue(), (ArrayList) objArr[0]);
                    return;
                }
                if (i == NotificationCenter.didClearDatabase) {
                    if (this.viewPages != null) {
                        while (true) {
                            ViewPage[] viewPageArr7 = this.viewPages;
                            if (i3 >= viewPageArr7.length) {
                                break;
                            }
                            viewPageArr7[i3].dialogsAdapter.didDatabaseCleared();
                            i3++;
                        }
                    }
                    SuggestClearDatabaseBottomSheet.dismissDialog();
                    return;
                }
                if (i == NotificationCenter.communitySwitchedCollapsed) {
                    long jLongValue4 = ((Long) objArr[0]).longValue();
                    boolean zBooleanValue4 = ((Boolean) objArr[1]).booleanValue();
                    if (this.communityId != jLongValue4 || zBooleanValue4) {
                        return;
                    }
                    INavigationLayout iNavigationLayout = this.parentLayout;
                    if (iNavigationLayout != null && iNavigationLayout.getLastFragment() == this) {
                        finishFragment();
                        return;
                    } else {
                        removeSelfFromStack();
                        return;
                    }
                }
                if (i == NotificationCenter.communityPendingRequestsUpdate) {
                    if (this.communityId == ((Long) objArr[0]).longValue()) {
                        checkCommunityPendingRequestsVisible(true);
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.onDatabaseMigration) {
                    boolean zBooleanValue5 = ((Boolean) objArr[0]).booleanValue();
                    if (this.fragmentView != null) {
                        if (zBooleanValue5) {
                            if (this.databaseMigrationHint == null) {
                                DatabaseMigrationHint databaseMigrationHint = new DatabaseMigrationHint(this.fragmentView.getContext(), this.currentAccount);
                                this.databaseMigrationHint = databaseMigrationHint;
                                databaseMigrationHint.setAlpha(0.0f);
                                ((ContentView) this.fragmentView).addView(this.databaseMigrationHint);
                                this.databaseMigrationHint.animate().alpha(1.0f).setDuration(300L).setStartDelay(1000L).start();
                            }
                            this.databaseMigrationHint.setTag(1);
                            return;
                        }
                        View view = this.databaseMigrationHint;
                        if (view == null || view.getTag() == null) {
                            return;
                        }
                        final View view2 = this.databaseMigrationHint;
                        view2.animate().setListener(null).cancel();
                        view2.animate().setListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                if (view2.getParent() != null) {
                                    ((ViewGroup) view2.getParent()).removeView(view2);
                                }
                                DialogsActivity.this.databaseMigrationHint = null;
                            }
                        }).alpha(0.0f).setStartDelay(0L).setDuration(150L).start();
                        this.databaseMigrationHint.setTag(null);
                        return;
                    }
                    return;
                }
                if (i == NotificationCenter.onDatabaseOpened) {
                    checkSuggestClearDatabase();
                    return;
                }
                if (i == NotificationCenter.userEmojiStatusUpdated) {
                    updateStatus((TLRPC.User) objArr[0], true);
                    return;
                }
                if (i == NotificationCenter.currentUserPremiumStatusChanged) {
                    updateStatus(UserConfig.getInstance(i2).getCurrentUser(), true);
                    updateStoriesPosting();
                    return;
                }
                if (i == NotificationCenter.onDatabaseReset) {
                    dialogsLoaded[this.currentAccount] = false;
                    loadDialogs(getAccountInstance());
                    getMessagesController().loadPinnedDialogs(this.folderId, 0L, null);
                    return;
                }
                if (i == NotificationCenter.chatlistFolderUpdate) {
                    int iIntValue2 = ((Integer) objArr[0]).intValue();
                    while (true) {
                        ViewPage[] viewPageArr8 = this.viewPages;
                        if (i3 >= viewPageArr8.length) {
                            return;
                        }
                        ViewPage viewPage4 = viewPageArr8[i3];
                        if (viewPage4 != null && ((viewPage4.dialogsType == 7 || viewPage4.dialogsType == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[viewPage4.dialogsType - 7]) != null && iIntValue2 == dialogFilter.id)) {
                            viewPage4.updateList(true);
                            return;
                        }
                        i3++;
                    }
                } else if (i == NotificationCenter.dialogTranslate) {
                    long jLongValue5 = ((Long) objArr[0]).longValue();
                    int i11 = 0;
                    while (true) {
                        ViewPage[] viewPageArr9 = this.viewPages;
                        if (i11 >= viewPageArr9.length) {
                            return;
                        }
                        ViewPage viewPage5 = viewPageArr9[i11];
                        if (viewPage5.listView != null) {
                            int i12 = 0;
                            while (true) {
                                if (i12 < viewPage5.listView.getChildCount()) {
                                    View childAt2 = viewPage5.listView.getChildAt(i12);
                                    if (childAt2 instanceof DialogCell) {
                                        DialogCell dialogCell = (DialogCell) childAt2;
                                        if (jLongValue5 == dialogCell.getDialogId()) {
                                            dialogCell.buildLayout();
                                            break;
                                        }
                                    }
                                    i12++;
                                }
                            }
                        }
                        i11++;
                    }
                } else {
                    if (i == NotificationCenter.storiesUpdated) {
                        updateStoriesVisibility(this.wasDrawn);
                        updateVisibleRows(0);
                        return;
                    }
                    if (i == NotificationCenter.storiesEnabledUpdate) {
                        updateStoriesPosting();
                        return;
                    }
                    if (i == NotificationCenter.unconfirmedAuthUpdate) {
                        lambda$updateDialogsHint$41();
                        return;
                    }
                    if (i == NotificationCenter.premiumPromoUpdated) {
                        lambda$updateDialogsHint$41();
                        return;
                    }
                    if (i == NotificationCenter.starBalanceUpdated || i == NotificationCenter.starSubscriptionsLoaded) {
                        lambda$updateDialogsHint$41();
                    } else if (i == NotificationCenter.appConfigUpdated) {
                        lambda$updateDialogsHint$41();
                    } else if (i == NotificationCenter.activeAuctionsUpdated) {
                        lambda$updateDialogsHint$41();
                    }
                }
            }
        }
    }

    public void lambda$didReceivedNotification$120(ViewPage viewPage, Object[] objArr) {
        reloadViewPageDialogs(viewPage, objArr.length > 0);
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView == null || filterTabsView.getVisibility() != 0) {
            return;
        }
        this.filterTabsView.checkTabsCounter();
    }

    public void lambda$didReceivedNotification$121(TLRPC.Chat chat, long j, boolean z, TLRPC.User user, boolean z2) {
        if (chat != null) {
            if (ChatObject.isNotInChat(chat)) {
                getMessagesController().deleteDialog(j, 0, z);
            } else {
                getMessagesController().deleteParticipantFromChat(-j, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), (TLRPC.Chat) null, z, z);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z);
            if (user != null && user.bot && z2) {
                getMessagesController().blockPeer(user.id);
            }
        }
        getMessagesController().checkIfFolderEmpty(this.folderId);
    }

    private void checkSuggestClearDatabase() {
        if (getMessagesStorage().showClearDatabaseAlert) {
            getMessagesStorage().showClearDatabaseAlert = false;
            SuggestClearDatabaseBottomSheet.show(this);
        }
    }

    private void showNextSupportedSuggestion() {
        if (this.showingSuggestion != null) {
            return;
        }
        for (String str : getMessagesController().pendingSuggestions) {
            if (showSuggestion(str)) {
                this.showingSuggestion = str;
                return;
            }
        }
    }

    private void onSuggestionDismiss() {
        if (this.showingSuggestion == null) {
            return;
        }
        getMessagesController().removeSuggestion(0L, this.showingSuggestion);
        this.showingSuggestion = null;
        showNextSupportedSuggestion();
    }

    private boolean showSuggestion(String str) {
        if (!"AUTOARCHIVE_POPULAR".equals(str)) {
            return false;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.HideNewChatsAlertTitle));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.HideNewChatsAlertText)));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.GoToSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$showSuggestion$122(alertDialog, i);
            }
        });
        showDialog(builder.create(), new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$showSuggestion$123(dialogInterface);
            }
        });
        return true;
    }

    public void lambda$showSuggestion$122(AlertDialog alertDialog, int i) {
        presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(this.parentLayout, "newChatsRow");
    }

    public void lambda$showSuggestion$123(DialogInterface dialogInterface) {
        onSuggestionDismiss();
    }

    private void showFiltersHint() {
        if (this.askingForPermissions || !getMessagesController().dialogFiltersLoaded || !getMessagesController().showFiltersTooltip || this.filterTabsView == null || !getMessagesController().getDialogFilters().isEmpty() || this.isPaused || !getUserConfig().filtersLoaded || this.inPreviewMode) {
            return;
        }
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (globalMainSettings.getBoolean("filterhint", false)) {
            return;
        }
        globalMainSettings.edit().putBoolean("filterhint", true).apply();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showFiltersHint$125();
            }
        }, 1000L);
    }

    public void lambda$showFiltersHint$125() {
        UndoView undoView = getUndoView();
        if (undoView != null) {
            undoView.showWithAction(0L, 15, null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showFiltersHint$124();
                }
            });
        }
    }

    public void lambda$showFiltersHint$124() {
        presentFragment(new FiltersSetupActivity());
    }

    private void setDialogsListFrozen(boolean z, boolean z2) {
        if (this.viewPages == null || this.dialogsListFrozen == z) {
            return;
        }
        if (z) {
            this.frozenDialogsList = new ArrayList(getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false));
        } else {
            this.frozenDialogsList = null;
        }
        this.dialogsListFrozen = z;
        this.viewPages[0].dialogsAdapter.setDialogsListFrozen(z);
        if (z || !z2) {
            return;
        }
        if (!this.viewPages[0].listView.isComputingLayout()) {
            this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
        } else {
            this.viewPages[0].listView.post(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$setDialogsListFrozen$126();
                }
            });
        }
    }

    public void lambda$setDialogsListFrozen$126() {
        this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
    }

    public void setDialogsListFrozen(boolean z) {
        setDialogsListFrozen(z, true);
    }

    public static class DialogsHeader extends TLRPC.Dialog {
        public int headerType;

        public DialogsHeader(int i) {
            this.headerType = i;
        }
    }

    public java.util.ArrayList getDialogsArray(int r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.getDialogsArray(int, int, int, boolean):java.util.ArrayList");
    }

    private boolean meetRequestPeerRequirements(TLRPC.User user) {
        Boolean bool;
        Boolean bool2;
        TLRPC.TL_requestPeerTypeUser tL_requestPeerTypeUser = (TLRPC.TL_requestPeerTypeUser) this.requestPeerType;
        return (user == null || UserObject.isReplyUser(user) || UserObject.isDeleted(user) || ((bool = tL_requestPeerTypeUser.bot) != null && bool.booleanValue() != user.bot) || ((bool2 = tL_requestPeerTypeUser.premium) != null && bool2.booleanValue() != user.premium)) ? false : true;
    }

    private boolean meetRequestPeerRequirements(TLRPC.User user, TLRPC.Chat chat) {
        if (chat == null) {
            return false;
        }
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        TLRPC.RequestPeerType requestPeerType = this.requestPeerType;
        if (zIsChannelAndNotMegaGroup != (requestPeerType instanceof TLRPC.TL_requestPeerTypeBroadcast)) {
            return false;
        }
        Boolean bool = requestPeerType.creator;
        if (bool != null && bool.booleanValue() && !chat.creator) {
            return false;
        }
        Boolean bool2 = this.requestPeerType.bot_participant;
        if (bool2 != null && bool2.booleanValue() && !getMessagesController().isInChatCached(chat, user) && !ChatObject.canAddBotsToChat(chat)) {
            return false;
        }
        Boolean bool3 = this.requestPeerType.has_username;
        if (bool3 != null) {
            if (bool3.booleanValue() != (ChatObject.getPublicUsername(chat) != null)) {
                return false;
            }
        }
        Boolean bool4 = this.requestPeerType.forum;
        if (bool4 != null && bool4.booleanValue() != ChatObject.isForum(chat)) {
            return false;
        }
        if (this.requestPeerType.user_admin_rights == null || getMessagesController().matchesAdminRights(chat, getUserConfig().getCurrentUser(), this.requestPeerType.user_admin_rights)) {
            return this.requestPeerType.bot_admin_rights == null || getMessagesController().matchesAdminRights(chat, user, this.requestPeerType.bot_admin_rights) || ChatObject.canAddAdmins(chat);
        }
        return false;
    }

    public void hideFloatingButton(boolean z) {
        if (this.rightSlidingDialogContainer.hasFragment()) {
            z = true;
        }
        if (z && this.floatingForceVisible) {
            return;
        }
        this.floatingButtonHidden = z;
        updateFloatingButtonVisibility(true);
        if (z) {
            HintView2 hintView2 = this.storyHint;
            if (hintView2 != null) {
                hintView2.hide();
            }
            HintView2 hintView22 = this.storyPremiumHint;
            if (hintView22 != null) {
                hintView22.hide();
            }
        }
    }

    public void animateContactsAlpha(float f) {
        ValueAnimator valueAnimator = this.contactsAlphaAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator duration = ValueAnimator.ofFloat(this.contactsAlpha, f).setDuration(250L);
        this.contactsAlphaAnimator = duration;
        duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.contactsAlphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateContactsAlpha$127(valueAnimator2);
            }
        });
        this.contactsAlphaAnimator.start();
    }

    public void lambda$animateContactsAlpha$127(ValueAnimator valueAnimator) {
        setContactsAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setContactsAlpha(float f) {
        this.contactsAlpha = f;
        for (ViewPage viewPage : this.viewPages) {
            DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
            for (int i = 0; i < dialogsRecyclerView.getChildCount(); i++) {
                View childAt = dialogsRecyclerView.getChildAt(i);
                if (childAt != null && dialogsRecyclerView.getChildAdapterPosition(childAt) >= viewPage.dialogsAdapter.getDialogsCount() + 1) {
                    childAt.setAlpha(f);
                }
            }
        }
    }

    public void setScrollDisabled(boolean z) {
        for (ViewPage viewPage : this.viewPages) {
            ((LinearLayoutManager) viewPage.listView.getLayoutManager()).setScrollDisabled(z);
        }
    }

    private void updateDialogIndices() {
        if (this.viewPages == null) {
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            if (viewPageArr[i].getVisibility() == 0 && !this.viewPages[i].dialogsAdapter.getDialogsListIsFrozen()) {
                this.viewPages[i].updateList(false);
            }
            i++;
        }
    }

    public void updateVisibleRows(int i) {
        updateVisibleRows(i, true);
    }

    private void updateVisibleRows(int r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.updateVisibleRows(int, boolean):void");
    }

    public void setDelegate(DialogsActivityDelegate dialogsActivityDelegate) {
        this.delegate = dialogsActivityDelegate;
    }

    public void setSharedMedia(ArrayList arrayList, CharSequence charSequence) {
        if (arrayList == null || arrayList.isEmpty()) {
            this.sharedMediaEntries = null;
            return;
        }
        this.sharedMediaEntries = arrayList;
        this.sharedLink = null;
        if (this.commentView != null) {
            attachShareTopView(charSequence);
        } else {
            this.pendingSharedCaption = charSequence;
        }
    }

    public void setSharedLink(String str, CharSequence charSequence) {
        if (str == null || str.isEmpty()) {
            this.sharedLink = null;
            this.sharedTextSeed = null;
            return;
        }
        this.sharedLink = str;
        this.sharedTextSeed = null;
        this.sharedMediaEntries = null;
        if (this.commentView != null) {
            attachShareTopView(charSequence);
        } else {
            this.pendingSharedCaption = charSequence;
        }
    }

    public void setSharedText(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence.length() == 0) {
            this.sharedTextSeed = null;
            return;
        }
        this.sharedTextSeed = charSequence;
        this.sharedLink = null;
        this.sharedMediaEntries = null;
        if (this.commentView != null) {
            attachShareTopView(charSequence2);
        } else {
            this.pendingSharedCaption = charSequence2;
        }
    }

    public boolean hasSharedMediaEntries() {
        ArrayList arrayList = this.sharedMediaEntries;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    public ArrayList getSharedMediaEntries() {
        return this.sharedMediaEntries;
    }

    public TLRPC.WebPage getSharedWebPage() {
        ShareTopView shareTopView = this.shareTopView;
        if (shareTopView != null) {
            return shareTopView.getLoadedWebPage();
        }
        return null;
    }

    public boolean isWebPagePreviewEnabled() {
        ShareTopView shareTopView = this.shareTopView;
        return shareTopView == null || shareTopView.isPreviewEnabled();
    }

    private void attachShareTopView(CharSequence charSequence) {
        if (this.commentView == null) {
            return;
        }
        if (this.sharedMediaEntries == null && this.sharedLink == null && this.sharedTextSeed == null) {
            return;
        }
        if (this.shareTopView == null) {
            ShareTopView shareTopView = new ShareTopView(getParentActivity(), getResourceProvider());
            this.shareTopView = shareTopView;
            shareTopView.setLayoutClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) throws Resources.NotFoundException, IOException, IllegalArgumentException, NegativeArraySizeException {
                    this.f$0.lambda$attachShareTopView$128(view);
                }
            });
            this.shareTopView.setOnModeChangeListener(new ShareTopView.OnModeChangeListener() {
                @Override
                public final void onModeChanged(int i, int i2) {
                    this.f$0.lambda$attachShareTopView$129(i, i2);
                }
            });
            this.commentView.addTopView(this.shareTopView, 48);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.shareTopView.getLayoutParams();
            layoutParams.rightMargin = -this.commentView.getPaddingRight();
            this.shareTopView.setLayoutParams(layoutParams);
        }
        if (hasSharedMediaEntries()) {
            this.shareTopView.setSharedMedia(this.currentAccount, this.sharedMediaEntries);
        } else {
            String str = this.sharedLink;
            if (str != null) {
                this.shareTopView.setSharedLink(this.currentAccount, str);
            } else {
                CharSequence charSequence2 = this.sharedTextSeed;
                if (charSequence2 != null) {
                    this.shareTopView.setSharedText(this.currentAccount, charSequence2);
                }
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.commentView.setFieldText(charSequence);
        }
        this.commentView.setOverrideHint(LocaleController.getString(hasSharedMediaEntries() ? R.string.AddCaption : R.string.ShareComment));
        checkUi_forwardCommentFieldVisible();
        if (this.shareTopView.getMode() != 0) {
            this.commentView.showTopView(false, false);
        }
        updateShareTopViewRecipients();
    }

    public void lambda$attachShareTopView$128(View view) throws Resources.NotFoundException, IOException, IllegalArgumentException, NegativeArraySizeException {
        if (hasSharedMediaEntries()) {
            openSharedMediaEditor();
        }
    }

    public void lambda$attachShareTopView$129(int i, int i2) {
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView == null) {
            return;
        }
        if (i2 == 0) {
            chatActivityEnterView.hideTopView(true);
        } else {
            chatActivityEnterView.showTopView(true, false);
        }
    }

    private void updateShareTopViewRecipients() {
        ShareTopView shareTopView = this.shareTopView;
        if (shareTopView == null) {
            return;
        }
        shareTopView.setRecipients(this.currentAccount, this.selectedDialogs);
    }

    private void openSharedMediaEditor() throws Resources.NotFoundException, IOException, IllegalArgumentException, NegativeArraySizeException {
        ArrayList arrayList = this.sharedMediaEntries;
        if (arrayList == null || arrayList.isEmpty() || getParentActivity() == null) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.sharedMediaEntries.get(0);
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        CharSequence fieldText = chatActivityEnterView != null ? chatActivityEnterView.getFieldText() : photoEntry.caption;
        Iterator it = this.sharedMediaEntries.iterator();
        while (it.hasNext()) {
            ((MediaController.PhotoEntry) it.next()).caption = fieldText;
        }
        PhotoViewer.getInstance().setParentActivity(this, getResourceProvider());
        PhotoViewer.getInstance().hasCaptionForAllMedia = true;
        PhotoViewer.getInstance().captionForAllMedia = fieldText;
        ArrayList arrayList2 = new ArrayList(this.sharedMediaEntries);
        final boolean[] zArr = new boolean[this.sharedMediaEntries.size()];
        Arrays.fill(zArr, true);
        PhotoViewer.getInstance().openPhotoForSelect(arrayList2, 0, 0, false, new PhotoViewer.EmptyPhotoViewerProvider() {
            @Override
            public int setPhotoChecked(int i, VideoEditedInfo videoEditedInfo) {
                return i;
            }

            @Override
            public PhotoViewer.PlaceProviderObject getPlaceForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
                BackupImageView thumbView = DialogsActivity.this.shareTopView != null ? DialogsActivity.this.shareTopView.getThumbView(i) : null;
                if (thumbView == null) {
                    return null;
                }
                int[] iArr = new int[2];
                thumbView.getLocationInWindow(iArr);
                PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
                placeProviderObject.viewX = iArr[0];
                placeProviderObject.viewY = iArr[1];
                placeProviderObject.parentView = DialogsActivity.this.shareTopView;
                ImageReceiver imageReceiver = thumbView.getImageReceiver();
                placeProviderObject.imageReceiver = imageReceiver;
                placeProviderObject.thumb = imageReceiver.getBitmapSafe();
                placeProviderObject.scale = thumbView.getScaleX();
                placeProviderObject.radius = new int[]{AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)};
                return placeProviderObject;
            }

            @Override
            public ImageReceiver.BitmapHolder getThumbForPhoto(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i) {
                BackupImageView thumbView = DialogsActivity.this.shareTopView != null ? DialogsActivity.this.shareTopView.getThumbView(i) : null;
                if (thumbView != null) {
                    return thumbView.getImageReceiver().getBitmapSafe();
                }
                return null;
            }

            @Override
            public long getDialogId() {
                if (DialogsActivity.this.selectedDialogs.isEmpty()) {
                    return 0L;
                }
                return ((Long) DialogsActivity.this.selectedDialogs.get(0)).longValue();
            }

            @Override
            public boolean canSchedule() {
                if (DialogsActivity.this.selectedDialogs.isEmpty()) {
                    return false;
                }
                Iterator it2 = DialogsActivity.this.selectedDialogs.iterator();
                while (it2.hasNext()) {
                    long jLongValue = ((Long) it2.next()).longValue();
                    if (DialogObject.isEncryptedDialog(jLongValue) || DialogsActivity.this.getMessagesController().getSendPaidMessagesStars(jLongValue) > 0) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public boolean canSetTimer() {
                TLRPC.User user;
                if (DialogsActivity.this.selectedDialogs.isEmpty()) {
                    return false;
                }
                MessagesController messagesController = DialogsActivity.this.getMessagesController();
                Iterator it2 = DialogsActivity.this.selectedDialogs.iterator();
                while (it2.hasNext()) {
                    Long l = (Long) it2.next();
                    if (!DialogObject.isUserDialog(l.longValue()) || (user = messagesController.getUser(l)) == null || user.bot || UserObject.isUserSelf(user)) {
                        return false;
                    }
                }
                return true;
            }

            @Override
            public CharSequence getTitleFor(int i) {
                if (DialogsActivity.this.sharedMediaEntries == null || DialogsActivity.this.sharedMediaEntries.isEmpty()) {
                    return null;
                }
                int size = DialogsActivity.this.sharedMediaEntries.size();
                if (size == 1) {
                    return LocaleController.getString(((MediaController.PhotoEntry) DialogsActivity.this.sharedMediaEntries.get(0)).isVideo ? R.string.AttachVideo : R.string.AttachPhoto);
                }
                Iterator it2 = DialogsActivity.this.sharedMediaEntries.iterator();
                int i2 = 0;
                int i3 = 0;
                while (it2.hasNext()) {
                    if (((MediaController.PhotoEntry) it2.next()).isVideo) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                if (i2 == 0) {
                    return LocaleController.formatPluralString("ShareSendPhotos", size, new Object[0]);
                }
                if (i3 == 0) {
                    return LocaleController.formatPluralString("ShareSendVideos", size, new Object[0]);
                }
                return LocaleController.formatPluralString("ShareSendItems", size, new Object[0]);
            }

            @Override
            public CharSequence getSubtitleFor(int i) {
                if (i < 0 || i >= DialogsActivity.this.sharedMediaEntries.size() || !((MediaController.PhotoEntry) DialogsActivity.this.sharedMediaEntries.get(i)).isVideo) {
                    return DialogsActivity.this.buildRecipientText();
                }
                return null;
            }

            @Override
            public void sendButtonPressed(int i, VideoEditedInfo videoEditedInfo, boolean z, int i2, int i3, boolean z2) throws NumberFormatException {
                DialogsActivity.this.syncCaptionFromEntries();
                if (DialogsActivity.this.shareTopView != null) {
                    DialogsActivity.this.shareTopView.setSharedMedia(((BaseFragment) DialogsActivity.this).currentAccount, DialogsActivity.this.sharedMediaEntries);
                }
                if ((!z || i2 != 0) && DialogsActivity.this.delegate != null && !DialogsActivity.this.selectedDialogs.isEmpty()) {
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivity.notify = z;
                    dialogsActivity.scheduleDate = i2;
                    ArrayList arrayList3 = new ArrayList();
                    for (int i4 = 0; i4 < DialogsActivity.this.selectedDialogs.size(); i4++) {
                        arrayList3.add(MessagesStorage.TopicKey.of(((Long) DialogsActivity.this.selectedDialogs.get(i4)).longValue(), 0L));
                    }
                    PhotoViewer.getInstance().closePhoto(true, false);
                    DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                    DialogsActivity dialogsActivity2 = DialogsActivity.this;
                    dialogsActivityDelegate.didSelectDialogs(dialogsActivity2, arrayList3, dialogsActivity2.commentView.getFieldText(), false, z, i2, i3, null);
                    return;
                }
                PhotoViewer.getInstance().closePhoto(true, false);
            }

            @Override
            public void onPreClose() {
                CharSequence currentCaptionText = PhotoViewer.getInstance().getCurrentCaptionText();
                if (currentCaptionText != null && DialogsActivity.this.commentView != null) {
                    DialogsActivity.this.commentView.setFieldText(currentCaptionText);
                }
                if (DialogsActivity.this.sharedMediaEntries != null) {
                    Iterator it2 = DialogsActivity.this.sharedMediaEntries.iterator();
                    while (it2.hasNext()) {
                        ((MediaController.PhotoEntry) it2.next()).caption = currentCaptionText;
                    }
                }
            }

            @Override
            public void onClose() {
                if (DialogsActivity.this.shareTopView != null) {
                    DialogsActivity.this.shareTopView.setSharedMedia(((BaseFragment) DialogsActivity.this).currentAccount, DialogsActivity.this.sharedMediaEntries);
                }
            }

            @Override
            public void onApplyCaption(CharSequence charSequence) {
                if (DialogsActivity.this.commentView != null) {
                    DialogsActivity.this.commentView.setFieldText(charSequence == null ? "" : charSequence);
                }
                if (DialogsActivity.this.sharedMediaEntries != null) {
                    Iterator it2 = DialogsActivity.this.sharedMediaEntries.iterator();
                    while (it2.hasNext()) {
                        ((MediaController.PhotoEntry) it2.next()).caption = charSequence;
                    }
                }
            }

            @Override
            public boolean isPhotoChecked(int i) {
                return zArr[i];
            }
        }, null);
        PhotoViewer.getInstance().setSelectionDisabled(true);
    }

    public CharSequence buildRecipientText() {
        if (this.selectedDialogs.isEmpty()) {
            return null;
        }
        if (this.selectedDialogs.size() < 3) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.selectedDialogs.iterator();
            while (it.hasNext()) {
                long jLongValue = ((Long) it.next()).longValue();
                if (sb.length() > 0) {
                    sb.append(", ");
                }
                if (jLongValue == getUserConfig().getClientUserId()) {
                    sb.append(LocaleController.getString(R.string.SavedMessages));
                } else {
                    sb.append(this.selectedDialogs.size() == 1 ? DialogObject.getName(this.currentAccount, jLongValue) : DialogObject.getShortName(this.currentAccount, jLongValue));
                }
            }
            return LocaleController.formatString(R.string.ShareSendToChats, sb.toString());
        }
        return LocaleController.formatPluralString("ShareSendToMany", this.selectedDialogs.size(), new Object[0]);
    }

    public void syncCaptionFromEntries() {
        ArrayList arrayList;
        if (this.commentView == null || (arrayList = this.sharedMediaEntries) == null || arrayList.isEmpty()) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.sharedMediaEntries.get(0);
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        CharSequence charSequence = photoEntry.caption;
        if (charSequence == null) {
            charSequence = "";
        }
        chatActivityEnterView.setFieldText(charSequence);
    }

    public void setSearchString(String str) {
        this.searchString = str;
    }

    public void setInitialSearchString(String str) {
        this.initialSearchString = str;
    }

    public boolean isMainDialogList() {
        return this.delegate == null && this.searchString == null;
    }

    public boolean isArchive() {
        return this.folderId == 1;
    }

    public void setInitialSearchType(int i) {
        this.initialSearchType = i;
    }

    private boolean checkCanWrite(long j) {
        int i;
        int i2 = this.initialDialogsType;
        if (i2 != 15 && i2 != 16 && this.addToGroupAlertString == null && this.checkCanWrite) {
            if (DialogObject.isChatDialog(j)) {
                long j2 = -j;
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j2));
                if (ChatObject.isChannel(chat) && !chat.megagroup && (this.cantSendToChannels || !ChatObject.isCanWriteToChannel(j2, this.currentAccount) || (i = this.hasPoll) == 2 || i == 3)) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                    int i3 = this.hasPoll;
                    if (i3 == 3) {
                        builder.setMessage(LocaleController.getString(R.string.TodoCantForward));
                    } else if (i3 == 2) {
                        builder.setMessage(LocaleController.getString(R.string.PublicPollCantForward));
                    } else {
                        builder.setMessage(LocaleController.getString(R.string.ChannelCantSendMessage));
                    }
                    builder.setNegativeButton(LocaleController.getString(R.string.OK), null);
                    showDialog(builder.create());
                    return false;
                }
            } else if (DialogObject.isEncryptedDialog(j) && (this.hasPoll != 0 || this.hasInvoice)) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                builder2.setTitle(LocaleController.getString(R.string.SendMessageTitle));
                int i4 = this.hasPoll;
                if (i4 == 3) {
                    builder2.setMessage(LocaleController.getString(R.string.TodoCantForwardSecretChat));
                } else if (i4 != 0) {
                    builder2.setMessage(LocaleController.getString(R.string.PollCantForwardSecretChat));
                } else {
                    builder2.setMessage(LocaleController.getString(R.string.InvoiceCantForwardSecretChat));
                }
                builder2.setNegativeButton(LocaleController.getString(R.string.OK), null);
                showDialog(builder2.create());
                return false;
            }
        }
        return true;
    }

    public void didSelectResult(long j, long j2, boolean z, boolean z2) {
        didSelectResult(j, j2, z, z2, null);
    }

    public void didSelectResult(final long r17, final long r19, boolean r21, final boolean r22, final org.telegram.ui.TopicsFragment r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.didSelectResult(long, long, boolean, boolean, org.telegram.ui.TopicsFragment):void");
    }

    public void lambda$didSelectResult$132(final AlertDialog alertDialog, final TLRPC.User user, final TLRPC.Chat chat, final long j, final boolean z, final TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didSelectResult$131(alertDialog, tLObject, user, chat, j, z, tL_error, tL_messages_checkHistoryImportPeer);
            }
        });
    }

    public void lambda$didSelectResult$131(AlertDialog alertDialog, TLObject tLObject, TLRPC.User user, TLRPC.Chat chat, final long j, final boolean z, TLRPC.TL_error tL_error, TLRPC.TL_messages_checkHistoryImportPeer tL_messages_checkHistoryImportPeer) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.checkingImportDialog = false;
        if (tLObject != null) {
            AlertsCreator.createImportDialogAlert(this, this.arguments.getString("importTitle"), ((TLRPC.TL_messages_checkedHistoryImportPeer) tLObject).confirm_text, user, chat, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didSelectResult$130(j, z);
                }
            });
        } else {
            AlertsCreator.processError(this.currentAccount, tL_error, this, tL_messages_checkHistoryImportPeer, new Object[0]);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.historyImportProgressChanged, Long.valueOf(j), tL_messages_checkHistoryImportPeer, tL_error);
        }
    }

    public void lambda$didSelectResult$130(long j, boolean z) {
        setDialogsListFrozen(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(MessagesStorage.TopicKey.of(j, 0L));
        this.delegate.didSelectDialogs(this, arrayList, null, z, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, null);
    }

    public void lambda$didSelectResult$133(long j, long j2, TopicsFragment topicsFragment, AlertDialog alertDialog, int i) {
        didSelectResult(j, j2, false, false, topicsFragment);
    }

    public void lambda$didSelectResult$134(long j, long j2, boolean z, TopicsFragment topicsFragment) {
        if (this.delegate != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(MessagesStorage.TopicKey.of(j, j2));
            this.delegate.didSelectDialogs(this, arrayList, null, z, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, topicsFragment);
            if (this.resetDelegate) {
                this.delegate = null;
                return;
            }
            return;
        }
        finishFragment();
    }

    public void lambda$didSelectResult$136(long j, final Runnable runnable) {
        if (this.requestPeerType.bot_admin_rights != null) {
            getMessagesController().setUserAdminRole(-j, getMessagesController().getUser(Long.valueOf(this.requestPeerBotId)), this.requestPeerType.bot_admin_rights, null, false, this, true, true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC.TL_error tL_error) {
                    return DialogsActivity.lambda$didSelectResult$135(runnable, tL_error);
                }
            });
        } else {
            runnable.run();
        }
    }

    public static boolean lambda$didSelectResult$135(Runnable runnable, TLRPC.TL_error tL_error) {
        runnable.run();
        return true;
    }

    private void showSendToBotAlert(TLRPC.User user, final Runnable runnable, final Runnable runnable2) {
        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
        showDialog(new AlertDialog.Builder(getContext()).setTitle(LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(user), UserObject.getFirstName(user2))).setMessage(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(user), UserObject.getFirstName(user2))))).setPositiveButton(LocaleController.formatString("Send", R.string.Send, new Object[0]), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                DialogsActivity.lambda$showSendToBotAlert$138(runnable2, alertDialog, i);
            }
        }).create());
    }

    public static void lambda$showSendToBotAlert$138(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void showSendToBotAlert(TLRPC.Chat chat, final Runnable runnable, final Runnable runnable2) {
        CharSequence charSequenceConcat;
        String string;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, chat.title, UserObject.getFirstName(user)));
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.requestPeerType.bot_participant;
        if ((bool != null && bool.booleanValue() && !getMessagesController().isInChatCached(chat, user)) || this.requestPeerType.bot_admin_rights != null) {
            if (this.requestPeerType.bot_admin_rights == null) {
                string = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), chat.title);
            } else {
                string = LocaleController.formatString(R.string.AreYouSureSendChatToBotAddRights, UserObject.getFirstName(user), chat.title, RequestPeerRequirementsCell.rightsToString(this.requestPeerType.bot_admin_rights, zIsChannelAndNotMegaGroup));
            }
            charSequenceConcat = TextUtils.concat("\n\n", AndroidUtilities.replaceTags(string));
        } else {
            charSequenceConcat = "";
        }
        showDialog(title.setMessage(TextUtils.concat(spannableStringBuilderReplaceTags, charSequenceConcat)).setPositiveButton(LocaleController.formatString("Send", R.string.Send, new Object[0]), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                DialogsActivity.lambda$showSendToBotAlert$140(runnable2, alertDialog, i);
            }
        }).create());
    }

    public static void lambda$showSendToBotAlert$140(Runnable runnable, AlertDialog alertDialog, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public boolean onSendLongClick(View view) {
        final boolean z = false;
        if (getParentActivity() == null) {
            return false;
        }
        boolean z2 = true;
        for (int i = 0; i < this.selectedDialogs.size(); i++) {
            long jLongValue = ((Long) this.selectedDialogs.get(i)).longValue();
            if (DialogObject.isEncryptedDialog(jLongValue)) {
                z2 = false;
            }
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-jLongValue));
            if (chat != null && !ChatObject.canWriteToChat(chat)) {
                z2 = false;
            }
        }
        ItemOptions.makeOptions(this, view).add(R.drawable.input_notify_off, LocaleController.getString(R.string.SendWithoutSound), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onSendLongClick$141();
            }
        }).addIf(z2, R.drawable.msg_calendar2, LocaleController.getString(R.string.ScheduleMessage), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onSendLongClick$142(z);
            }
        }).show();
        return true;
    }

    public void lambda$onSendLongClick$141() {
        this.notify = false;
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.selectedDialogs.size(); i++) {
            arrayList.add(MessagesStorage.TopicKey.of(((Long) this.selectedDialogs.get(i)).longValue(), 0L));
        }
        this.delegate.didSelectDialogs(this, arrayList, this.commentView.getFieldText(), false, this.notify, this.scheduleDate, this.scheduleRepeatPeriod, null);
    }

    public void lambda$onSendLongClick$142(boolean z) {
        AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), z ? getUserConfig().getClientUserId() : -1L, new AlertsCreator.ScheduleDatePickerDelegate() {
            @Override
            public void didSelectDate(boolean z2, int i, int i2) {
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.scheduleDate = i;
                dialogsActivity.scheduleRepeatPeriod = i2;
                if (dialogsActivity.delegate == null || DialogsActivity.this.selectedDialogs.isEmpty()) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < DialogsActivity.this.selectedDialogs.size(); i3++) {
                    arrayList.add(MessagesStorage.TopicKey.of(((Long) DialogsActivity.this.selectedDialogs.get(i3)).longValue(), 0L));
                }
                DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivityDelegate.didSelectDialogs(dialogsActivity2, arrayList, dialogsActivity2.commentView.getFieldText(), false, z2, i, i2, null);
            }
        }, getResourceProvider());
    }

    private float getRightSlidingProgress() {
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) {
            return 0.0f;
        }
        return this.rightSlidingDialogContainer.openedProgress;
    }

    @Override
    public ArrayList getThemeDescriptions() {
        Class<TextCell> cls;
        String str;
        RecyclerListView recyclerListView;
        int i;
        final DialogsActivity dialogsActivity = this;
        String str2 = "imageView";
        char c = 0;
        int i2 = 1;
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$143();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        ArrayList arrayList = new ArrayList();
        View view = dialogsActivity.fragmentView;
        int i3 = ThemeDescription.FLAG_BACKGROUND;
        int i4 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(view, i3, null, null, null, null, i4));
        if (dialogsActivity.movingView != null) {
            arrayList.add(new ThemeDescription(dialogsActivity.movingView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i4));
        }
        if (dialogsActivity.doneItem != null) {
            arrayList.add(new ThemeDescription(dialogsActivity.doneItem, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_actionBarDefaultSelector));
        }
        if (dialogsActivity.folderId == 0) {
            if (dialogsActivity.onlySelect) {
                arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i4));
            }
            arrayList.add(new ThemeDescription(dialogsActivity.fragmentView, 0, null, dialogsActivity.actionBarDefaultPaint, null, null, i4));
            if (dialogsActivity.searchViewPager != null) {
                arrayList.add(new ThemeDescription(dialogsActivity.searchViewPager.searchListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
            }
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultIcon));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, new Drawable[]{Theme.dialogs_holidayDrawable}, null, !dialogsActivity.hasMainTabs ? Theme.key_actionBarDefaultTitle : Theme.key_telegram_color_dialogsLogo));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        } else {
            arrayList.add(new ThemeDescription(dialogsActivity.fragmentView, 0, null, dialogsActivity.actionBarDefaultPaint, null, null, i4));
            if (dialogsActivity.searchViewPager != null) {
                arrayList.add(new ThemeDescription(dialogsActivity.searchViewPager.searchListView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i4));
            }
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultArchivedIcon));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, new Drawable[]{Theme.dialogs_holidayDrawable}, null, !dialogsActivity.hasMainTabs ? Theme.key_actionBarDefaultArchivedTitle : Theme.key_telegram_color_dialogsLogo));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultArchivedSelector));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultArchivedSearch));
            arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultArchivedSearchPlaceholder));
        }
        ActionBar actionBar = dialogsActivity.actionBar;
        int i5 = ThemeDescription.FLAG_AB_AM_ITEMSCOLOR;
        int i6 = Theme.key_actionBarActionModeDefaultIcon;
        arrayList.add(new ThemeDescription(actionBar, i5, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_AM_TOPBACKGROUND, null, null, null, null, Theme.key_actionBarActionModeDefaultTop));
        arrayList.add(new ThemeDescription(dialogsActivity.actionBar, ThemeDescription.FLAG_AB_AM_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarActionModeDefaultSelector));
        arrayList.add(new ThemeDescription(dialogsActivity.selectedDialogsCountTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_dialogButtonSelector));
        if (dialogsActivity.filterTabsView != null) {
            ActionBar actionBar2 = dialogsActivity.actionBar;
            if (actionBar2 != null && actionBar2.isActionModeShowed()) {
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView, 0, new Class[]{FilterTabsView.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_profile_tabSelectedLine));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_profile_tabSelectedText));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_profile_tabText));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_profile_tabSelector));
            } else {
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView, 0, new Class[]{FilterTabsView.class}, new String[]{"selectorDrawable"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_actionBarTabLine));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_actionBarTabActiveText));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_actionBarTabUnactiveText));
                arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_actionBarTabSelector));
            }
            arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), 0, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_chats_tabUnreadActiveBackground));
            arrayList.add(new ThemeDescription(dialogsActivity.filterTabsView.getTabsContainer(), 0, new Class[]{FilterTabsView.TabView.class}, null, null, null, Theme.key_chats_tabUnreadUnactiveBackground));
        }
        arrayList.addAll(SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$144();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_actionBarActionModeDefault, i6));
        int i7 = 0;
        while (true) {
            cls = TextCell.class;
            if (i7 >= 3) {
                break;
            }
            if (i7 == 2) {
                SearchViewPager searchViewPager = dialogsActivity.searchViewPager;
                if (searchViewPager != null) {
                    recyclerListView = searchViewPager.searchListView;
                }
                str = str2;
                i = 1;
                i7 += i;
                i2 = 1;
                dialogsActivity = this;
                str2 = str;
            } else {
                ViewPage[] viewPageArr = dialogsActivity.viewPages;
                if (viewPageArr != null) {
                    recyclerListView = i7 < viewPageArr.length ? viewPageArr[i7].listView : null;
                } else {
                    str = str2;
                    i = 1;
                    i7 += i;
                    i2 = 1;
                    dialogsActivity = this;
                    str2 = str;
                }
            }
            if (recyclerListView != null) {
                RecyclerListView recyclerListView2 = recyclerListView;
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
                Class[] clsArr = new Class[i2];
                clsArr[0] = View.class;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr, Theme.dividerPaint, null, null, Theme.key_divider));
                Class[] clsArr2 = new Class[2];
                clsArr2[0] = DialogCell.class;
                clsArr2[i2] = ProfileSearchCell.class;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr2, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
                Class[] clsArr3 = new Class[i2];
                clsArr3[0] = DialogCell.class;
                Paint paint = Theme.dialogs_countPaint;
                int i8 = Theme.key_chats_unreadCounter;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr3, paint, null, null, i8));
                Class[] clsArr4 = new Class[i2];
                clsArr4[0] = DialogCell.class;
                Paint paint2 = Theme.dialogs_countGrayPaint;
                int i9 = Theme.key_chats_unreadCounterMuted;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr4, paint2, null, null, i9));
                Class[] clsArr5 = new Class[i2];
                clsArr5[0] = DialogCell.class;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr5, Theme.dialogs_countTextPaint, null, null, Theme.key_chats_unreadCounterText));
                Class[] clsArr6 = new Class[2];
                clsArr6[0] = DialogCell.class;
                clsArr6[i2] = ProfileSearchCell.class;
                Drawable[] drawableArr = new Drawable[i2];
                drawableArr[0] = Theme.dialogs_lockDrawable;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr6, null, drawableArr, null, Theme.key_chats_secretIcon));
                Class[] clsArr7 = new Class[2];
                clsArr7[0] = DialogCell.class;
                clsArr7[i2] = ProfileSearchCell.class;
                Drawable[] drawableArr2 = new Drawable[2];
                drawableArr2[0] = Theme.dialogs_scamDrawable;
                drawableArr2[i2] = Theme.dialogs_fakeDrawable;
                int i10 = Theme.key_chats_draft;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr7, null, drawableArr2, null, i10));
                Class[] clsArr8 = new Class[i2];
                clsArr8[0] = DialogCell.class;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, clsArr8, null, new Drawable[]{Theme.dialogs_pinnedDrawable, Theme.dialogs_pinnedDrawable2, Theme.dialogs_reorderDrawable}, null, Theme.key_chats_pinnedIcon));
                Drawable[] drawableArr3 = {Theme.dialogs_pinnedDrawable2Accent};
                int i11 = Theme.key_telegram_color_text;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, drawableArr3, null, i11));
                TextPaint[] textPaintArr = Theme.dialogs_namePaint;
                str = str2;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr[0], textPaintArr[1], Theme.dialogs_searchNamePaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_name));
                TextPaint[] textPaintArr2 = Theme.dialogs_nameEncryptedPaint;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, (String[]) null, new Paint[]{textPaintArr2[0], textPaintArr2[1], Theme.dialogs_searchNameEncryptedPaint}, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_secretName));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[1], null, null, Theme.key_chats_message_threeLines));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messagePaint[0], null, null, Theme.key_chats_message));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_messageNamePaint, null, null, Theme.key_chats_nameMessage_threeLines));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, i10));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, (String[]) null, Theme.dialogs_messagePrintingPaint, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_actionMessage));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaint, null, null, Theme.key_chats_date));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaintBold, null, null, Theme.key_chats_date_bold));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_timePaintBoldAccent, null, null, i11));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_pinnedPaint, null, null, Theme.key_chats_pinnedOverlay));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_tabletSeletedPaint, null, null, Theme.key_chats_tabletSelectedOverlay));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkDrawable}, null, Theme.key_chats_sentCheck));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_checkReadDrawable, Theme.dialogs_halfCheckDrawable}, null, Theme.key_chats_sentReadCheck));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_clockDrawable}, null, Theme.key_chats_sentClock));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, Theme.dialogs_errorPaint, null, null, Theme.key_chats_sentError));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_errorDrawable}, null, Theme.key_chats_sentErrorIcon));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedCheckDrawable}, null, Theme.key_chats_verifiedCheck));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class, ProfileSearchCell.class}, null, new Drawable[]{Theme.dialogs_verifiedDrawable}, null, Theme.key_chats_verifiedBackground));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_muteDrawable}, null, Theme.key_chats_muteIcon));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_mentionDrawable}, null, i8));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_reactionsMentionDrawable}, null, Theme.key_dialogReactionMentionBackground));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_pollMentionDrawable}, null, Theme.key_color_purple));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, new Drawable[]{Theme.dialogs_mentionDrawableMuted, Theme.dialogs_reactionsMentionDrawableMuted, Theme.dialogs_pollMentionDrawableMuted}, null, i9));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_archivePinBackground));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_archiveBackground));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, Theme.key_chats_onlineCircle));
                int i12 = Theme.key_windowBackgroundWhite;
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{DialogCell.class}, null, null, null, i12));
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_CHECKBOX, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i12));
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{DialogCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_checkboxCheck));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{LoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_offlinePaint, null, null, Theme.key_windowBackgroundWhiteGrayText3));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{ProfileSearchCell.class}, Theme.dialogs_onlinePaint, null, null, Theme.key_windowBackgroundWhiteBlueText3));
                GraySectionCell.createThemeDescriptions(arrayList, recyclerListView);
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{HashtagSearchCell.class}, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                int i13 = Theme.key_windowBackgroundGrayShadow;
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, i13));
                int i14 = Theme.key_windowBackgroundGray;
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, i14));
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i13));
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextInfoPrivacyCell.class}, null, null, null, i14));
                arrayList.add(new ThemeDescription(recyclerListView2, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
                arrayList.add(new ThemeDescription(recyclerListView2, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{cls}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueText2));
                i = 1;
                i7 += i;
                i2 = 1;
                dialogsActivity = this;
                str2 = str;
            }
            str = str2;
            i = 1;
            i7 += i;
            i2 = 1;
            dialogsActivity = this;
            str2 = str;
        }
        String str3 = str2;
        int i15 = Theme.key_avatar_backgroundRed;
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundSaved));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Red));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Orange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Violet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Green));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Cyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Blue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Pink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_background2Saved));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundArchived));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundArchivedHidden));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_nameMessage));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_draft));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_attachMessage));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_nameArchived));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_nameMessageArchived));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_nameMessageArchived_threeLines));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_messageArchived));
        if (this.viewPages != null) {
            int i16 = 0;
            while (i16 < this.viewPages.length) {
                if (this.folderId == 0) {
                    arrayList.add(new ThemeDescription(this.viewPages[i16].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_windowBackgroundWhite));
                } else {
                    arrayList.add(new ThemeDescription(this.viewPages[i16].listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_windowBackgroundWhite));
                }
                DialogsRecyclerView dialogsRecyclerView = this.viewPages[i16].listView;
                int i17 = ThemeDescription.FLAG_TEXTCOLOR;
                Class[] clsArr9 = new Class[1];
                clsArr9[c] = DialogsEmptyCell.class;
                int i18 = Theme.key_chats_nameMessage_threeLines;
                arrayList.add(new ThemeDescription(dialogsRecyclerView, i17, clsArr9, new String[]{"emptyTextView1"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i18));
                DialogsRecyclerView dialogsRecyclerView2 = this.viewPages[i16].listView;
                int i19 = ThemeDescription.FLAG_TEXTCOLOR;
                Class[] clsArr10 = new Class[1];
                clsArr10[c] = DialogsEmptyCell.class;
                int i20 = Theme.key_chats_message;
                arrayList.add(new ThemeDescription(dialogsRecyclerView2, i19, clsArr10, new String[]{"emptyTextView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i20));
                if (SharedConfig.archiveHidden) {
                    DialogsRecyclerView dialogsRecyclerView3 = this.viewPages[i16].listView;
                    Class[] clsArr11 = new Class[1];
                    clsArr11[c] = DialogCell.class;
                    RLottieDrawable[] rLottieDrawableArr = new RLottieDrawable[1];
                    rLottieDrawableArr[c] = Theme.dialogs_archiveAvatarDrawable;
                    int i21 = Theme.key_avatar_backgroundArchivedHidden;
                    arrayList.add(new ThemeDescription(dialogsRecyclerView3, 0, clsArr11, rLottieDrawableArr, "Arrow1", i21));
                    DialogsRecyclerView dialogsRecyclerView4 = this.viewPages[i16].listView;
                    Class[] clsArr12 = new Class[1];
                    clsArr12[c] = DialogCell.class;
                    RLottieDrawable[] rLottieDrawableArr2 = new RLottieDrawable[1];
                    rLottieDrawableArr2[c] = Theme.dialogs_archiveAvatarDrawable;
                    arrayList.add(new ThemeDescription(dialogsRecyclerView4, 0, clsArr12, rLottieDrawableArr2, "Arrow2", i21));
                } else {
                    DialogsRecyclerView dialogsRecyclerView5 = this.viewPages[i16].listView;
                    Class[] clsArr13 = new Class[1];
                    clsArr13[c] = DialogCell.class;
                    RLottieDrawable[] rLottieDrawableArr3 = new RLottieDrawable[1];
                    rLottieDrawableArr3[c] = Theme.dialogs_archiveAvatarDrawable;
                    int i22 = Theme.key_avatar_backgroundArchived;
                    arrayList.add(new ThemeDescription(dialogsRecyclerView5, 0, clsArr13, rLottieDrawableArr3, "Arrow1", i22));
                    DialogsRecyclerView dialogsRecyclerView6 = this.viewPages[i16].listView;
                    Class[] clsArr14 = new Class[1];
                    clsArr14[c] = DialogCell.class;
                    RLottieDrawable[] rLottieDrawableArr4 = new RLottieDrawable[1];
                    rLottieDrawableArr4[c] = Theme.dialogs_archiveAvatarDrawable;
                    arrayList.add(new ThemeDescription(dialogsRecyclerView6, 0, clsArr14, rLottieDrawableArr4, "Arrow2", i22));
                }
                DialogsRecyclerView dialogsRecyclerView7 = this.viewPages[i16].listView;
                Class[] clsArr15 = new Class[1];
                clsArr15[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr5 = new RLottieDrawable[1];
                rLottieDrawableArr5[c] = Theme.dialogs_archiveAvatarDrawable;
                int i23 = Theme.key_avatar_text;
                arrayList.add(new ThemeDescription(dialogsRecyclerView7, 0, clsArr15, rLottieDrawableArr5, "Box2", i23));
                DialogsRecyclerView dialogsRecyclerView8 = this.viewPages[i16].listView;
                Class[] clsArr16 = new Class[1];
                clsArr16[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr6 = new RLottieDrawable[1];
                rLottieDrawableArr6[c] = Theme.dialogs_archiveAvatarDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView8, 0, clsArr16, rLottieDrawableArr6, "Box1", i23));
                DialogsRecyclerView dialogsRecyclerView9 = this.viewPages[i16].listView;
                Class[] clsArr17 = new Class[1];
                clsArr17[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr7 = new RLottieDrawable[1];
                rLottieDrawableArr7[c] = Theme.dialogs_pinArchiveDrawable;
                int i24 = Theme.key_chats_archiveIcon;
                arrayList.add(new ThemeDescription(dialogsRecyclerView9, 0, clsArr17, rLottieDrawableArr7, "Arrow", i24));
                DialogsRecyclerView dialogsRecyclerView10 = this.viewPages[i16].listView;
                Class[] clsArr18 = new Class[1];
                clsArr18[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr8 = new RLottieDrawable[1];
                rLottieDrawableArr8[c] = Theme.dialogs_pinArchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView10, 0, clsArr18, rLottieDrawableArr8, "Line", i24));
                DialogsRecyclerView dialogsRecyclerView11 = this.viewPages[i16].listView;
                Class[] clsArr19 = new Class[1];
                clsArr19[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr9 = new RLottieDrawable[1];
                rLottieDrawableArr9[c] = Theme.dialogs_unpinArchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView11, 0, clsArr19, rLottieDrawableArr9, "Arrow", i24));
                DialogsRecyclerView dialogsRecyclerView12 = this.viewPages[i16].listView;
                Class[] clsArr20 = new Class[1];
                clsArr20[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr10 = new RLottieDrawable[1];
                rLottieDrawableArr10[c] = Theme.dialogs_unpinArchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView12, 0, clsArr20, rLottieDrawableArr10, "Line", i24));
                DialogsRecyclerView dialogsRecyclerView13 = this.viewPages[i16].listView;
                Class[] clsArr21 = new Class[1];
                clsArr21[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr11 = new RLottieDrawable[1];
                rLottieDrawableArr11[c] = Theme.dialogs_archiveDrawable;
                int i25 = Theme.key_chats_archiveBackground;
                arrayList.add(new ThemeDescription(dialogsRecyclerView13, 0, clsArr21, rLottieDrawableArr11, "Arrow", i25));
                DialogsRecyclerView dialogsRecyclerView14 = this.viewPages[i16].listView;
                Class[] clsArr22 = new Class[1];
                clsArr22[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr12 = new RLottieDrawable[1];
                rLottieDrawableArr12[c] = Theme.dialogs_archiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView14, 0, clsArr22, rLottieDrawableArr12, "Box2", i24));
                DialogsRecyclerView dialogsRecyclerView15 = this.viewPages[i16].listView;
                Class[] clsArr23 = new Class[1];
                clsArr23[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr13 = new RLottieDrawable[1];
                rLottieDrawableArr13[c] = Theme.dialogs_archiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView15, 0, clsArr23, rLottieDrawableArr13, "Box1", i24));
                DialogsRecyclerView dialogsRecyclerView16 = this.viewPages[i16].listView;
                Class[] clsArr24 = new Class[1];
                clsArr24[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr14 = new RLottieDrawable[1];
                rLottieDrawableArr14[c] = Theme.dialogs_hidePsaDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView16, 0, clsArr24, rLottieDrawableArr14, "Line 1", i25));
                DialogsRecyclerView dialogsRecyclerView17 = this.viewPages[i16].listView;
                Class[] clsArr25 = new Class[1];
                clsArr25[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr15 = new RLottieDrawable[1];
                rLottieDrawableArr15[c] = Theme.dialogs_hidePsaDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView17, 0, clsArr25, rLottieDrawableArr15, "Line 2", i25));
                DialogsRecyclerView dialogsRecyclerView18 = this.viewPages[i16].listView;
                Class[] clsArr26 = new Class[1];
                clsArr26[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr16 = new RLottieDrawable[1];
                rLottieDrawableArr16[c] = Theme.dialogs_hidePsaDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView18, 0, clsArr26, rLottieDrawableArr16, "Line 3", i25));
                DialogsRecyclerView dialogsRecyclerView19 = this.viewPages[i16].listView;
                Class[] clsArr27 = new Class[1];
                clsArr27[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr17 = new RLottieDrawable[1];
                rLottieDrawableArr17[c] = Theme.dialogs_hidePsaDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView19, 0, clsArr27, rLottieDrawableArr17, "Cup Red", i24));
                DialogsRecyclerView dialogsRecyclerView20 = this.viewPages[i16].listView;
                Class[] clsArr28 = new Class[1];
                clsArr28[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr18 = new RLottieDrawable[1];
                rLottieDrawableArr18[c] = Theme.dialogs_hidePsaDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView20, 0, clsArr28, rLottieDrawableArr18, "Box", i24));
                DialogsRecyclerView dialogsRecyclerView21 = this.viewPages[i16].listView;
                Class[] clsArr29 = new Class[1];
                clsArr29[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr19 = new RLottieDrawable[1];
                rLottieDrawableArr19[c] = Theme.dialogs_unarchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView21, 0, clsArr29, rLottieDrawableArr19, "Arrow1", i24));
                DialogsRecyclerView dialogsRecyclerView22 = this.viewPages[i16].listView;
                Class[] clsArr30 = new Class[1];
                clsArr30[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr20 = new RLottieDrawable[1];
                rLottieDrawableArr20[c] = Theme.dialogs_unarchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView22, 0, clsArr30, rLottieDrawableArr20, "Arrow2", Theme.key_chats_archivePinBackground));
                DialogsRecyclerView dialogsRecyclerView23 = this.viewPages[i16].listView;
                Class[] clsArr31 = new Class[1];
                clsArr31[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr21 = new RLottieDrawable[1];
                rLottieDrawableArr21[c] = Theme.dialogs_unarchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView23, 0, clsArr31, rLottieDrawableArr21, "Box2", i24));
                DialogsRecyclerView dialogsRecyclerView24 = this.viewPages[i16].listView;
                Class[] clsArr32 = new Class[1];
                clsArr32[c] = DialogCell.class;
                RLottieDrawable[] rLottieDrawableArr22 = new RLottieDrawable[1];
                rLottieDrawableArr22[c] = Theme.dialogs_unarchiveDrawable;
                arrayList.add(new ThemeDescription(dialogsRecyclerView24, 0, clsArr32, rLottieDrawableArr22, "Box1", i24));
                DialogsRecyclerView dialogsRecyclerView25 = this.viewPages[i16].listView;
                Class[] clsArr33 = new Class[1];
                clsArr33[c] = UserCell.class;
                arrayList.add(new ThemeDescription(dialogsRecyclerView25, 0, clsArr33, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
                DialogsRecyclerView dialogsRecyclerView26 = this.viewPages[i16].listView;
                Class[] clsArr34 = new Class[1];
                clsArr34[c] = UserCell.class;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(new ThemeDescription(dialogsRecyclerView26, 0, clsArr34, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
                arrayList2.add(new ThemeDescription(this.viewPages[i16].listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_telegram_color_text));
                int i26 = Theme.key_windowBackgroundWhiteBlueText4;
                arrayList2.add(new ThemeDescription(this.viewPages[i16].listView, 0, new Class[]{cls}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i26));
                arrayList2.add(new ThemeDescription(this.viewPages[i16].listView, 0, new Class[]{cls}, new String[]{str3}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i26));
                arrayList2.add(new ThemeDescription(this.viewPages[i16].progressView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, Theme.key_progressCircle));
                ViewPager archiveHintCellPager = this.viewPages[i16].dialogsAdapter.getArchiveHintCellPager();
                arrayList2.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{str3}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i18));
                arrayList2.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"imageView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chats_unreadCounter));
                arrayList2.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"headerTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i18));
                arrayList2.add(new ThemeDescription(archiveHintCellPager, 0, new Class[]{ArchiveHintInnerCell.class}, new String[]{"messageTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i20));
                arrayList2.add(new ThemeDescription(archiveHintCellPager, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_windowBackgroundWhite));
                i16++;
                arrayList = arrayList2;
                cls = cls;
                c = 0;
            }
        }
        ArrayList arrayList3 = arrayList;
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_archivePullDownBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chats_archivePullDownBackgroundActive));
        if (this.searchViewPager != null) {
            DialogsSearchAdapter dialogsSearchAdapter = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter != null ? dialogsSearchAdapter.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countPaint, null, null, Theme.key_chats_unreadCounter));
            DialogsSearchAdapter dialogsSearchAdapter2 = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter2 != null ? dialogsSearchAdapter2.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countGrayPaint, null, null, Theme.key_chats_unreadCounterMuted));
            DialogsSearchAdapter dialogsSearchAdapter3 = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter3 != null ? dialogsSearchAdapter3.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_countTextPaint, null, null, Theme.key_chats_unreadCounterText));
            DialogsSearchAdapter dialogsSearchAdapter4 = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter4 != null ? dialogsSearchAdapter4.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, Theme.dialogs_archiveTextPaint, null, null, Theme.key_chats_archiveText));
            DialogsSearchAdapter dialogsSearchAdapter5 = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter5 != null ? dialogsSearchAdapter5.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
            DialogsSearchAdapter dialogsSearchAdapter6 = this.searchViewPager.dialogsSearchAdapter;
            arrayList3.add(new ThemeDescription(dialogsSearchAdapter6 != null ? dialogsSearchAdapter6.getInnerListView() : null, 0, new Class[]{HintDialogCell.class}, null, null, null, Theme.key_chats_onlineCircle));
        }
        for (int i27 = 0; i27 < this.undoView.length; i27++) {
            UndoView undoView = this.undoView[i27];
            int i28 = ThemeDescription.FLAG_BACKGROUNDFILTER;
            int i29 = Theme.key_undo_background;
            arrayList3.add(new ThemeDescription(undoView, i28, null, null, null, null, i29));
            int i30 = Theme.key_undo_cancelColor;
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i30));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i30));
            int i31 = Theme.key_undo_infoColor;
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info1", i29));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "info2", i29));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc12", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc11", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc10", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc9", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc8", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc7", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc6", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc5", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc4", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc3", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc2", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "luc1", i31));
            arrayList3.add(new ThemeDescription(this.undoView[i27], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Oval", i31));
        }
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogBackgroundGray));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextLink));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogLinkSelection));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextBlue));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextBlue2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextBlue4));
        int i32 = Theme.key_text_RedBold;
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, i32));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextGray));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextGray2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextGray3));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextGray4));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogIcon));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_text_RedRegular));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogTextHint));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogInputField));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogInputFieldActivated));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogCheckboxSquareBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogCheckboxSquareCheck));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogCheckboxSquareUnchecked));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogCheckboxSquareDisabled));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogRadioBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogRadioBackgroundChecked));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogButton));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogButtonSelector));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogScrollGlow));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogRoundCheckBox));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogRoundCheckBoxCheck));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogLineProgress));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogLineProgressBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogGrayLine));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_inlineProgressBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_inlineProgress));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogSearchBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogSearchHint));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogSearchIcon));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogSearchText));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogFloatingButton));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogFloatingIcon));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialogShadowLine));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_sheet_other));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_actionBarSelector));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_actionBarTitle));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_actionBarSubtitle));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_actionBarItems));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_background));
        int i33 = Theme.key_player_time;
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, i33));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_progressBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_progressCachedBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_progress));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_button));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_player_buttonActive));
        if (this.commentView != null) {
            arrayList3.add(new ThemeDescription(this.commentView, 0, null, Theme.chat_composeBackgroundPaint, null, null, Theme.key_chat_messagePanelBackground));
            arrayList3.add(new ThemeDescription(this.commentView, 0, null, null, new Drawable[]{Theme.chat_composeShadowDrawable}, null, Theme.key_chat_messagePanelShadow));
            arrayList3.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_messagePanelText));
            arrayList3.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_CURSORCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_messagePanelCursor));
            arrayList3.add(new ThemeDescription(this.commentView, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_chat_messagePanelHint));
        }
        int i34 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i34));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, i33));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_chat_messagePanelCursor));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_actionBarIconBlue));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_groupcreate_spanBackground));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayGreen1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayGreen2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayBlue1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayBlue2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_topPanelGreen1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_topPanelGreen2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_topPanelBlue1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_topPanelBlue2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_topPanelGray));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertGradientMuted));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertGradientMuted2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertGradientUnmuted));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertGradientUnmuted2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_mutedByAdminGradient));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_mutedByAdminGradient2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_mutedByAdminGradient3));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertMutedByAdmin));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_voipgroup_overlayAlertMutedByAdmin2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle_dialog1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle_dialog2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle_closeFriends1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle_closeFriends2));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle1));
        arrayList3.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_stories_circle2));
        FiltersView filtersView = this.filtersView;
        if (filtersView != null) {
            arrayList3.addAll(filtersView.getThemeDescriptions());
            this.filtersView.updateColors();
        }
        DownloadProgressIcon downloadProgressIcon = this.downloadProgressIcon;
        if (downloadProgressIcon != null) {
            downloadProgressIcon.updateColors();
            this.downloadProgressIcon.invalidate();
        }
        SearchViewPager searchViewPager2 = this.searchViewPager;
        if (searchViewPager2 != null) {
            searchViewPager2.getThemeDescriptions(arrayList3);
        }
        final DialogsHintCell dialogsHintCell = this.dialogsHintCell;
        if (dialogsHintCell != null) {
            SimpleThemeDescription.add(arrayList3, new Runnable() {
                @Override
                public final void run() {
                    dialogsHintCell.updateColors();
                }
            }, Theme.key_windowBackgroundWhite, i34, Theme.key_windowBackgroundWhiteGrayText);
        }
        final UnconfirmedAuthHintCell unconfirmedAuthHintCell = this.authHintCell;
        if (unconfirmedAuthHintCell != null) {
            SimpleThemeDescription.add(arrayList3, new Runnable() {
                @Override
                public final void run() {
                    unconfirmedAuthHintCell.updateColors();
                }
            }, Theme.key_windowBackgroundWhite, i34, Theme.key_windowBackgroundWhiteGrayText, Theme.key_windowBackgroundWhiteValueText, i32);
        }
        final ActiveGiftAuctionsHintCell activeGiftAuctionsHintCell = this.activeGiftAuctionsHintCell;
        if (activeGiftAuctionsHintCell != null) {
            SimpleThemeDescription.add(arrayList3, new Runnable() {
                @Override
                public final void run() {
                    activeGiftAuctionsHintCell.updateColors();
                }
            }, Theme.key_windowBackgroundWhite, i34, Theme.key_windowBackgroundWhiteGrayText, Theme.key_windowBackgroundWhiteValueText, i32);
        }
        return arrayList3;
    }

    public void lambda$getThemeDescriptions$143() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.lambda$getThemeDescriptions$143():void");
    }

    public void lambda$getThemeDescriptions$144() {
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            ActionBarMenu actionMode = searchViewPager.getActionMode();
            if (actionMode != null) {
                actionMode.setBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefault));
            }
            ActionBarMenuItem speedItem = this.searchViewPager.getSpeedItem();
            if (speedItem != null) {
                speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    @Override
    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
            this.slideBackTransitionAnimator = valueAnimatorOfFloat;
            return valueAnimatorOfFloat;
        }
        int iClamp = (getLayoutContainer() == null || getLayoutContainer().getMeasuredWidth() <= 0) ? 150 : (int) Utilities.clamp((200.0f / getLayoutContainer().getMeasuredWidth()) * f, 200.0f, 80.0f);
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
        this.slideBackTransitionAnimator = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$getCustomSlideTransition$145(valueAnimator);
            }
        });
        this.slideBackTransitionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.slideBackTransitionAnimator.setDuration(iClamp);
        this.slideBackTransitionAnimator.start();
        return this.slideBackTransitionAnimator;
    }

    public void lambda$getCustomSlideTransition$145(ValueAnimator valueAnimator) {
        setSlideTransitionProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
        ViewPage viewPage;
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(32768)) {
            return;
        }
        if (z) {
            ViewPage[] viewPageArr = this.viewPages;
            if (viewPageArr != null && (viewPage = viewPageArr[0]) != null) {
                viewPage.setLayerType(2, null);
                this.viewPages[0].setClipChildren(false);
                this.viewPages[0].setClipToPadding(false);
                this.viewPages[0].listView.setClipChildren(false);
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        if (this.viewPages != null) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr2 = this.viewPages;
                if (i >= viewPageArr2.length) {
                    break;
                }
                ViewPage viewPage2 = viewPageArr2[i];
                if (viewPage2 != null) {
                    viewPage2.setLayerType(0, null);
                    viewPage2.setClipChildren(true);
                    viewPage2.setClipToPadding(true);
                    viewPage2.listView.setClipChildren(true);
                }
                i++;
            }
        }
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            actionBar2.setLayerType(0, null);
        }
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if (dialogStoriesCell != null) {
            dialogStoriesCell.setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    @Override
    public void onSlideProgress(boolean z, float f) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.isSlideBackTransition && this.slideBackTransitionAnimator == null) {
            setSlideTransitionProgress(f);
        }
    }

    private void setSlideTransitionProgress(float f) {
        if ((SharedConfig.getDevicePerformanceClass() > 0 || BuildVars.DEBUG_PRIVATE_VERSION) && this.slideFragmentProgress != f) {
            boolean z = true;
            if (SharedConfig.getDevicePerformanceClass() > 1 && LiteMode.isEnabled(32768)) {
                z = false;
            }
            this.slideFragmentLite = z;
            this.slideFragmentProgress = f;
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
            if (this.slideFragmentLite) {
                float f2 = (-AndroidUtilities.dp(40.0f)) * (1.0f - this.slideFragmentProgress);
                DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
                if (dialogStoriesCell != null) {
                    dialogStoriesCell.setTranslationX(f2);
                }
                FragmentSearchField fragmentSearchField = this.fragmentSearchField;
                if (fragmentSearchField != null) {
                    fragmentSearchField.setTranslationX(f2);
                }
                RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
                if (rightSlidingDialogContainer == null || rightSlidingDialogContainer.getFragmentView() == null || this.rightFragmentTransitionInProgress) {
                    return;
                }
                this.rightSlidingDialogContainer.getFragmentView().setTranslationX(f2);
                return;
            }
            float f3 = -AndroidUtilities.dp(4.0f);
            float f4 = 1.0f - this.slideFragmentProgress;
            float f5 = f3 * f4;
            float f6 = 1.0f - (f4 * 0.05f);
            DialogStoriesCell dialogStoriesCell2 = this.dialogStoriesCell;
            if (dialogStoriesCell2 != null) {
                dialogStoriesCell2.setScaleX(f6);
                this.dialogStoriesCell.setScaleY(f6);
                this.dialogStoriesCell.setTranslationX(f5);
                this.dialogStoriesCell.setPivotX(0.0f);
                this.dialogStoriesCell.setPivotY(0.0f);
            }
            FragmentSearchField fragmentSearchField2 = this.fragmentSearchField;
            if (fragmentSearchField2 != null) {
                fragmentSearchField2.setTranslationX(f5);
                this.fragmentSearchField.setScaleX(f6);
                this.fragmentSearchField.setScaleY(f6);
            }
            RightSlidingDialogContainer rightSlidingDialogContainer2 = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer2 == null || rightSlidingDialogContainer2.getFragmentView() == null) {
                return;
            }
            if (!this.rightFragmentTransitionInProgress) {
                this.rightSlidingDialogContainer.getFragmentView().setScaleX(f6);
                this.rightSlidingDialogContainer.getFragmentView().setScaleY(f6);
                this.rightSlidingDialogContainer.getFragmentView().setTranslationX(f5);
            }
            this.rightSlidingDialogContainer.getFragmentView().setPivotX(0.0f);
            this.rightSlidingDialogContainer.getFragmentView().setPivotY(0.0f);
        }
    }

    @Override
    public INavigationLayout.BackButtonState getBackButtonState() {
        return (isArchive() || this.rightSlidingDialogContainer.isOpenned) ? INavigationLayout.BackButtonState.BACK : INavigationLayout.BackButtonState.MENU;
    }

    public void setShowSearch(String str, int i) {
        int positionForType;
        if (!this.searching) {
            this.initialSearchType = i;
            this.fragmentSearchField.editText.setText(str);
            this.fragmentSearchField.editText.setSelection(str.length());
            return;
        }
        this.fragmentSearchField.editText.setText(str);
        this.fragmentSearchField.editText.setSelection(str.length());
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager == null || (positionForType = searchViewPager.getPositionForType(i)) < 0 || this.searchViewPager.getTabsView().getCurrentTabId() == positionForType) {
            return;
        }
        this.searchViewPager.getTabsView().scrollToTab(positionForType, positionForType);
    }

    @Override
    public boolean isLightStatusBar() {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (this.searching || (rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || rightSlidingDialogContainer.getFragment() == null) {
            return ColorUtils.calculateLuminance(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.699999988079071d;
        }
        return this.rightSlidingDialogContainer.getFragment().isLightStatusBar();
    }

    @Override
    public List onGetDebugItems() {
        return Arrays.asList(new FloatingDebugController.DebugItem(LocaleController.getString(R.string.DebugDialogsActivity)), new FloatingDebugController.DebugItem(LocaleController.getString(R.string.ClearLocalDatabase), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onGetDebugItems$146();
            }
        }), new FloatingDebugController.DebugItem(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onGetDebugItems$147();
            }
        }));
    }

    public void lambda$onGetDebugItems$146() {
        getMessagesStorage().clearLocalDatabase();
        Toast.makeText(getContext(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
    }

    public void lambda$onGetDebugItems$147() {
        getMessagesController().clearSendAsPeers();
    }

    @Override
    public boolean closeLastFragment() {
        if (this.rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.lambda$presentFragment$1();
            SearchViewPager searchViewPager = this.searchViewPager;
            if (searchViewPager == null) {
                return true;
            }
            searchViewPager.updateTabs();
            return true;
        }
        return super.closeLastFragment();
    }

    public boolean getAllowGlobalSearch() {
        return this.allowGlobalSearch;
    }

    @Override
    public boolean canBeginSlide() {
        FilterTabsView filterTabsView;
        if (this.rightSlidingDialogContainer.hasFragment()) {
            return false;
        }
        if (this.initialDialogsType == 3 && (filterTabsView = this.filterTabsView) != null && filterTabsView.getVisibility() == 0) {
            return this.filterTabsView.isFirstTab();
        }
        return true;
    }

    public void updateStoriesVisibility(boolean z) {
        ActionBar actionBar;
        final boolean z2;
        int i = 0;
        if (this.dialogStoriesCell == null || this.storiesVisibilityAnimator != null) {
            return;
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if ((rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) || this.searchIsShowed || (actionBar = this.actionBar) == null || actionBar.isActionModeShowed() || this.onlySelect) {
            return;
        }
        if (StoryRecorder.isVisible() || (getLastStoryViewer() != null && getLastStoryViewer().isFullyVisible())) {
            z = false;
        }
        boolean zHasOnlySelfStories = !isArchive() && getStoriesController().hasOnlySelfStories();
        if (this.communityId != 0) {
            z2 = false;
        } else if (isArchive()) {
            z2 = !getStoriesController().getHiddenList().isEmpty();
        } else {
            z2 = !zHasOnlySelfStories && getStoriesController().hasStories();
            zHasOnlySelfStories = getStoriesController().hasOnlySelfStories();
        }
        this.hasOnlySlefStories = zHasOnlySelfStories;
        boolean z3 = this.dialogStoriesCellVisible;
        boolean z4 = zHasOnlySelfStories || z2;
        this.dialogStoriesCellVisible = z4;
        if (z2 || z4) {
            this.dialogStoriesCell.updateItems(z, z4 != z3);
        }
        boolean z5 = this.dialogStoriesCellVisible;
        int i2 = 8;
        if (z5 != z3) {
            if (z) {
                ValueAnimator valueAnimator = this.storiesVisibilityAnimator2;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.dialogStoriesCellVisible && !isInPreviewMode()) {
                    this.dialogStoriesCell.setVisibility(0);
                }
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progressToDialogStoriesCell, this.dialogStoriesCellVisible ? 1.0f : 0.0f);
                this.storiesVisibilityAnimator2 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        DialogsActivity.this.progressToDialogStoriesCell = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        View view = DialogsActivity.this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                });
                this.storiesVisibilityAnimator2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        boolean z6 = dialogsActivity.dialogStoriesCellVisible;
                        dialogsActivity.progressToDialogStoriesCell = z6 ? 1.0f : 0.0f;
                        if (!z6) {
                            dialogsActivity.dialogStoriesCell.setVisibility(8);
                        }
                        View view = DialogsActivity.this.fragmentView;
                        if (view != null) {
                            view.invalidate();
                        }
                    }
                });
                this.storiesVisibilityAnimator2.setDuration(200L);
                this.storiesVisibilityAnimator2.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.storiesVisibilityAnimator2.start();
            } else {
                this.dialogStoriesCell.setVisibility((!z5 || isInPreviewMode()) ? 8 : 0);
                this.progressToDialogStoriesCell = this.dialogStoriesCellVisible ? 1.0f : 0.0f;
                View view = this.fragmentView;
                if (view != null) {
                    view.invalidate();
                }
            }
        }
        if (z2 == this.animateToHasStories) {
            return;
        }
        this.animateToHasStories = z2;
        if (z2) {
            this.dialogStoriesCell.setProgressToCollapse(1.0f, false);
        }
        if (z && !isInPreviewMode()) {
            this.dialogStoriesCell.setVisibility(0);
            float f = -this.scrollYOffset;
            float maxScrollYOffset = z2 ? 0.0f : getMaxScrollYOffset();
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.storiesVisibilityAnimator = valueAnimatorOfFloat2;
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(f, z2, maxScrollYOffset) {
                int currentValue;
                final float val$fromScrollY;
                final boolean val$newVisibility;
                final float val$toScrollY;

                {
                    this.val$fromScrollY = f;
                    this.val$newVisibility = z2;
                    this.val$toScrollY = maxScrollYOffset;
                    this.currentValue = (int) f;
                }

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    DialogsActivity.this.progressToShowStories = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    if (!this.val$newVisibility) {
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        dialogsActivity.progressToShowStories = 1.0f - dialogsActivity.progressToShowStories;
                    }
                    int iLerp = (int) AndroidUtilities.lerp(this.val$fromScrollY, this.val$toScrollY, ((Float) valueAnimator2.getAnimatedValue()).floatValue());
                    int i3 = iLerp - this.currentValue;
                    this.currentValue = iLerp;
                    DialogsActivity.this.viewPages[0].listView.scrollBy(0, i3);
                    View view2 = DialogsActivity.this.fragmentView;
                    if (view2 != null) {
                        view2.invalidate();
                    }
                }
            });
            this.storiesVisibilityAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    dialogsActivity.storiesVisibilityAnimator = null;
                    boolean z6 = z2;
                    dialogsActivity.hasStories = z6;
                    if (!z6 && !dialogsActivity.hasOnlySlefStories) {
                        dialogsActivity.dialogStoriesCell.setVisibility(8);
                    }
                    if (!z2) {
                        DialogsActivity.this.setScrollY(0.0f);
                        DialogsActivity.this.scrollAdditionalOffset = AndroidUtilities.dp(81.0f);
                    } else {
                        DialogsActivity.this.scrollAdditionalOffset = -AndroidUtilities.dp(81.0f);
                        DialogsActivity.this.setScrollY(-r3.getMaxScrollYOffsetWithoutSearch());
                    }
                    for (int i3 = 0; i3 < DialogsActivity.this.viewPages.length; i3++) {
                        if (DialogsActivity.this.viewPages[i3] != null) {
                            DialogsActivity.this.viewPages[i3].listView.requestLayout();
                        }
                    }
                    View view2 = DialogsActivity.this.fragmentView;
                    if (view2 != null) {
                        view2.requestLayout();
                    }
                }
            });
            this.storiesVisibilityAnimator.setDuration(200L);
            this.storiesVisibilityAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.storiesVisibilityAnimator.start();
            return;
        }
        this.progressToShowStories = z2 ? 1.0f : 0.0f;
        this.hasStories = z2;
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if ((z2 || this.hasOnlySlefStories) && !isInPreviewMode()) {
            i2 = 0;
        }
        dialogStoriesCell.setVisibility(i2);
        if (!z2) {
            setScrollY(0.0f);
        } else {
            this.scrollAdditionalOffset = -AndroidUtilities.dp(81.0f);
            setScrollY(-getMaxScrollYOffset());
        }
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                break;
            }
            ViewPage viewPage = viewPageArr[i];
            if (viewPage != null) {
                viewPage.listView.requestLayout();
            }
            i++;
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            view2.requestLayout();
            this.fragmentView.invalidate();
        }
    }

    public void createSearchViewPager() {
        int i;
        SearchViewPager searchViewPager = this.searchViewPager;
        if ((searchViewPager != null && searchViewPager.getParent() == this.fragmentView) || this.fragmentView == null || getContext() == null) {
            return;
        }
        if (this.searchString != null) {
            i = 2;
        } else {
            i = !this.onlySelect ? 1 : 0;
        }
        SearchViewPager searchViewPager2 = new SearchViewPager(getContext(), this, i, this.initialDialogsType, this.folderId, this.communityId, new SearchViewPager.ChatPreviewDelegate() {
            @Override
            public void startChatPreview(RecyclerListView recyclerListView, DialogCell dialogCell) {
                DialogsActivity.this.showChatPreview(dialogCell);
            }

            @Override
            public void move(float f) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    DialogsActivity.this.movePreviewFragment(f);
                }
            }

            @Override
            public void finish() {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    DialogsActivity.this.finishPreviewFragment();
                }
            }
        }) {
            final GradientProtectionDrawable gradientDrawable = new GradientProtectionDrawable(2);
            final GradientProtectionDrawable gradientDrawable2 = new GradientProtectionDrawable(8);

            @Override
            protected boolean onBackProgress(float f) {
                return false;
            }

            @Override
            protected void onTabPageSelected(int i2) {
                DialogsActivity.this.updateSpeedItem(isDownloadsTab(i2));
            }

            @Override
            protected boolean includeDownloads() {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                return rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment();
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (DialogsActivity.this.searchTabsAndFiltersLayout != null) {
                    DialogsActivity.this.searchTabsAndFiltersLayout.setTranslationY(f);
                }
            }

            @Override
            public void setAlpha(float f) {
                super.setAlpha(f);
                DialogsActivity.this.blur3_InvalidateBlur();
            }

            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                if (DialogsActivity.this.searchTabsView != null || DialogsActivity.this.communityId != 0) {
                    int iDp = AndroidUtilities.dp(54.0f);
                    int measuredHeight = (((((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(DialogsActivity.this.ADDITIONAL_LIST_HEIGHT_DP)) - AndroidUtilities.dp(2.0f)) - (DialogsActivity.this.communityId != 0 ? iDp : 0)) + (DialogsActivity.this.topPanelLayout != null ? (int) DialogsActivity.this.topPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f)) : 0);
                    this.gradientDrawable.setColor(Theme.multAlpha(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), 0.7f));
                    this.gradientDrawable.setInsets(0, measuredHeight, 0, 0);
                    this.gradientDrawable.setBounds(0, 0, getMeasuredWidth(), measuredHeight + iDp);
                    this.gradientDrawable.draw(canvas);
                }
                if (DialogsActivity.this.navigationBarHeight > AndroidUtilities.dp(32.0f)) {
                    this.gradientDrawable2.setColor(Theme.multAlpha(DialogsActivity.this.getThemedColor(Theme.key_windowBackgroundWhite), 0.9f));
                    this.gradientDrawable2.setBounds(0, getMeasuredHeight() - DialogsActivity.this.navigationBarHeight, getMeasuredWidth(), getMeasuredHeight());
                    this.gradientDrawable2.draw(canvas);
                }
            }

            @Override
            protected void onPageScrolled(int i2, int i3) {
                super.onPageScrolled(i2, i3);
                if (Build.VERSION.SDK_INT < 31 || DialogsActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                DialogsActivity.this.scrollableViewNoiseSuppressor.onScrolled(i2, i3);
                DialogsActivity.this.blur3_InvalidateBlur();
            }

            @Override
            public void onTabAnimationUpdate(boolean z) {
                super.onTabAnimationUpdate(z);
                if (Build.VERSION.SDK_INT < 31 || DialogsActivity.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                DialogsActivity.this.blur3_InvalidateBlur();
            }
        };
        this.searchViewPager = searchViewPager2;
        ((ContentView) this.fragmentView).addView(searchViewPager2, this.searchViewPagerIndex);
        this.searchViewPager.dialogsSearchAdapter.setDelegate(new AnonymousClass48());
        this.searchViewPager.channelsSearchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) {
                this.f$0.lambda$createSearchViewPager$148(view, i2, f, f2);
            }
        });
        this.searchViewPager.botsSearchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) {
                this.f$0.lambda$createSearchViewPager$149(view, i2, f, f2);
            }
        });
        this.searchViewPager.hashtagSearchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$createSearchViewPager$150(view, i2);
            }
        });
        this.searchViewPager.botsSearchListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return this.f$0.lambda$createSearchViewPager$152(view, i2);
            }
        });
        this.searchViewPager.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i2) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i2);
            }

            @Override
            public void onDoubleTap(View view, int i2, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i2, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i2, float f, float f2) throws Resources.NotFoundException, IOException, NumberFormatException {
                this.f$0.lambda$createSearchViewPager$153(view, i2, f, f2);
            }
        });
        this.searchViewPager.searchListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListenerExtended() {
            @Override
            public boolean onItemClick(View view, int i2, float f, float f2) {
                if (view instanceof ProfileSearchCell) {
                    ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
                    if (profileSearchCell.isBlocked()) {
                        DialogsActivity.this.showPremiumBlockedToast(view, profileSearchCell.getDialogId());
                        return true;
                    }
                }
                DialogsActivity dialogsActivity = DialogsActivity.this;
                return dialogsActivity.onItemLongClick(dialogsActivity.searchViewPager.searchListView, view, i2, f, f2, -1, DialogsActivity.this.searchViewPager.dialogsSearchAdapter);
            }

            @Override
            public void onMove(float f, float f2) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    DialogsActivity.this.movePreviewFragment(f2);
                }
            }

            @Override
            public void onLongClickRelease() {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    DialogsActivity.this.finishPreviewFragment();
                }
            }
        });
        this.searchViewPager.setFilteredSearchViewDelegate(new FilteredSearchView.Delegate() {
            @Override
            public final void updateFiltersView(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
                this.f$0.lambda$createSearchViewPager$154(z, arrayList, arrayList2, z2);
            }
        });
        this.searchViewPager.setAlpha(0.0f);
        this.searchViewPager.setScaleX(1.05f);
        this.searchViewPager.setScaleY(1.05f);
        this.searchViewPager.setVisibility(8);
        this.searchViewPager.setBlurredBackgroundDrawableFactory(this.iBlur3FactoryBlur);
    }

    class AnonymousClass48 implements DialogsSearchAdapter.DialogsSearchAdapterDelegate {
        AnonymousClass48() {
        }

        @Override
        public void searchStateChanged(boolean z, boolean z2) {
            if (DialogsActivity.this.searchViewPager.emptyView.getVisibility() == 0) {
                z2 = true;
            }
            if (DialogsActivity.this.searching && DialogsActivity.this.searchWas && DialogsActivity.this.searchViewPager.emptyView != null) {
                if (z || DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getItemCount() != 0) {
                    DialogsActivity.this.searchViewPager.emptyView.showProgress(true, z2);
                } else {
                    DialogsActivity.this.searchViewPager.emptyView.showProgress(false, z2);
                }
            }
            if (z && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getItemCount() == 0) {
                DialogsActivity.this.searchViewPager.cancelEnterAnimation();
            }
        }

        @Override
        public void didPressedBlockedDialog(View view, long j) {
            DialogsActivity.this.showPremiumBlockedToast(view, j);
        }

        @Override
        public void didPressedOnSubDialog(long j) throws Resources.NotFoundException {
            if (DialogsActivity.this.onlySelect) {
                if (DialogsActivity.this.validateSlowModeDialog(j)) {
                    if (!DialogsActivity.this.selectedDialogs.isEmpty()) {
                        DialogsActivity.this.findAndUpdateCheckBox(j, DialogsActivity.this.addOrRemoveSelectedDialog(j, null));
                        DialogsActivity.this.updateSelectedCount();
                        ((BaseFragment) DialogsActivity.this).actionBar.closeSearchField();
                        return;
                    }
                    DialogsActivity.this.didSelectResult(j, 0L, true, false);
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            DialogsActivity.this.closeSearch();
            if (AndroidUtilities.isTablet() && DialogsActivity.this.viewPages != null) {
                for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                    DialogsAdapter dialogsAdapter = DialogsActivity.this.viewPages[i].dialogsAdapter;
                    DialogsActivity.this.openedDialogId.dialogId = j;
                    dialogsAdapter.setOpenedDialogId(j);
                }
                DialogsActivity.this.updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
            }
            if (DialogsActivity.this.searchString != null) {
                if (DialogsActivity.this.getMessagesController().checkCanOpenChat(bundle, DialogsActivity.this)) {
                    DialogsActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                    DialogsActivity.this.presentFragment(new ChatActivity(bundle));
                    return;
                }
                return;
            }
            if (DialogsActivity.this.getMessagesController().checkCanOpenChat(bundle, DialogsActivity.this)) {
                DialogsActivity.this.presentFragment(new ChatActivity(bundle));
            }
        }

        @Override
        public void needRemoveHint(final long j) {
            TLRPC.User user;
            if (DialogsActivity.this.getParentActivity() == null || (user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(j))) == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ChatHintsDeleteAlertTitle));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name))));
            builder.setPositiveButton(LocaleController.getString(R.string.StickersRemove), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.lambda$needRemoveHint$0(j, alertDialog, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            DialogsActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(DialogsActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$needRemoveHint$0(long j, AlertDialog alertDialog, int i) {
            DialogsActivity.this.getMediaDataController().removePeer(j);
        }

        @Override
        public void needClearList() {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            if (DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isSearchWas() && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isRecentSearchDisplayed()) {
                builder.setTitle(LocaleController.getString(R.string.ClearSearchAlertPartialTitle));
                builder.setMessage(LocaleController.formatPluralString("ClearSearchAlertPartial", DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getRecentResultsCount(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString(R.string.Clear), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$needClearList$1(alertDialog, i);
                    }
                });
            } else {
                builder.setTitle(LocaleController.getString(R.string.ClearSearchAlertTitle));
                builder.setMessage(LocaleController.getString(R.string.ClearSearchAlert));
                builder.setPositiveButton(LocaleController.getString(R.string.ClearButton), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$needClearList$2(alertDialog, i);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            DialogsActivity.this.showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(DialogsActivity.this.getThemedColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$needClearList$1(AlertDialog alertDialog, int i) {
            DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentSearch();
        }

        public void lambda$needClearList$2(AlertDialog alertDialog, int i) {
            if (DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isRecentSearchDisplayed()) {
                DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentSearch();
            } else {
                DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentHashtags();
            }
        }

        @Override
        public void runResultsEnterAnimation() {
            if (DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.runResultsEnterAnimation();
            }
        }

        @Override
        public boolean isSelected(long j) {
            return DialogsActivity.this.selectedDialogs.contains(Long.valueOf(j));
        }

        @Override
        public long getSearchForumDialogId() {
            RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer == null || !(rightSlidingDialogContainer.getFragment() instanceof TopicsFragment)) {
                return 0L;
            }
            return ((TopicsFragment) DialogsActivity.this.rightSlidingDialogContainer.getFragment()).getDialogId();
        }
    }

    public void lambda$createSearchViewPager$148(View view, int i, float f, float f2) {
        Object object = this.searchViewPager.channelsSearchAdapter.getObject(i);
        if (object instanceof TLRPC.Chat) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", ((TLRPC.Chat) object).id);
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setNextChannels(this.searchViewPager.channelsSearchAdapter.getNextChannels(i));
            presentFragment(chatActivity);
            return;
        }
        if (object instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) object;
            Bundle bundle2 = new Bundle();
            if (messageObject.getDialogId() >= 0) {
                bundle2.putLong("user_id", messageObject.getDialogId());
            } else {
                bundle2.putLong("chat_id", -messageObject.getDialogId());
            }
            bundle2.putInt("message_id", messageObject.getId());
            presentFragment(highlightFoundQuote(new ChatActivity(bundle2), messageObject));
        }
    }

    public void lambda$createSearchViewPager$149(View view, int i, float f, float f2) {
        Object object = this.searchViewPager.botsSearchAdapter.getObject(i);
        if (object instanceof TLRPC.User) {
            presentFragment(ProfileActivity.of(((TLRPC.User) object).id));
            return;
        }
        if (object instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) object;
            Bundle bundle = new Bundle();
            if (messageObject.getDialogId() >= 0) {
                bundle.putLong("user_id", messageObject.getDialogId());
            } else {
                bundle.putLong("chat_id", -messageObject.getDialogId());
            }
            bundle.putInt("message_id", messageObject.getId());
            presentFragment(highlightFoundQuote(new ChatActivity(bundle), messageObject));
        }
    }

    public void lambda$createSearchViewPager$150(View view, int i) {
        Object obj = this.searchViewPager.hashtagSearchAdapter.getItem(i).object;
        if (obj instanceof MessageObject) {
            MessageObject messageObject = (MessageObject) obj;
            Bundle bundle = new Bundle();
            if (messageObject.getDialogId() >= 0) {
                bundle.putLong("user_id", messageObject.getDialogId());
            } else {
                bundle.putLong("chat_id", -messageObject.getDialogId());
            }
            bundle.putInt("message_id", messageObject.getId());
            presentFragment(highlightFoundQuote(new ChatActivity(bundle), messageObject));
            return;
        }
        if (obj instanceof StoriesController.SearchStoriesList) {
            StoriesController.SearchStoriesList searchStoriesList = (StoriesController.SearchStoriesList) obj;
            Bundle bundle2 = new Bundle();
            bundle2.putInt("type", 3);
            bundle2.putString("hashtag", searchStoriesList.query);
            bundle2.putInt("storiesCount", searchStoriesList.getCount());
            presentFragment(new MediaActivity(bundle2, null));
        }
    }

    public boolean lambda$createSearchViewPager$152(View view, int i) {
        Object topPeerObject = this.searchViewPager.botsSearchAdapter.getTopPeerObject(i);
        if (topPeerObject instanceof TLRPC.User) {
            final TLRPC.User user = (TLRPC.User) topPeerObject;
            new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.AppsClearSearch)).setMessage(LocaleController.formatString(R.string.AppsClearSearchAlert, "\"" + UserObject.getUserName(user) + "\"")).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Remove), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$createSearchViewPager$151(user, alertDialog, i2);
                }
            }).makeRed(-1).show();
        }
        return false;
    }

    public void lambda$createSearchViewPager$151(TLRPC.User user, AlertDialog alertDialog, int i) {
        getMediaDataController().removeWebapp(user.id);
    }

    public void lambda$createSearchViewPager$153(View view, int i, float f, float f2) throws Resources.NotFoundException, IOException, NumberFormatException {
        Object item = this.searchViewPager.dialogsSearchAdapter.getItem(i);
        if (item instanceof TLRPC.TL_sponsoredPeer) {
            TLRPC.TL_sponsoredPeer tL_sponsoredPeer = (TLRPC.TL_sponsoredPeer) item;
            presentFragment(ChatActivity.of(DialogObject.getPeerDialogId(tL_sponsoredPeer.peer)));
            this.searchViewPager.dialogsSearchAdapter.clickedSponsoredPeer(tL_sponsoredPeer);
            return;
        }
        if (view instanceof ProfileSearchCell) {
            ProfileSearchCell profileSearchCell = (ProfileSearchCell) view;
            if (profileSearchCell.isBlocked()) {
                showPremiumBlockedToast(view, profileSearchCell.getDialogId());
                return;
            }
        }
        if (this.initialDialogsType == 10) {
            SearchViewPager searchViewPager = this.searchViewPager;
            onItemLongClick(searchViewPager.searchListView, view, i, f, f2, -1, searchViewPager.dialogsSearchAdapter);
        } else {
            onItemClick(view, i, this.searchViewPager.dialogsSearchAdapter, f, f2);
        }
    }

    public void lambda$createSearchViewPager$154(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        updateFiltersView(z, arrayList, arrayList2, z2, true);
    }

    public boolean clickSelectsDialog() {
        return this.initialDialogsType == 10;
    }

    public void openSetAvatar() {
        try {
            ((RLottieDrawable) ((AvatarDrawable) this.dialogsHintCell.imageView.getImageReceiver().getStaticThumb()).getCustomIcon()).restart(true);
        } catch (Exception unused) {
        }
        if (this.imageUpdater == null) {
            ImageUpdater imageUpdater = new ImageUpdater(true, 0, true);
            this.imageUpdater = imageUpdater;
            imageUpdater.setOpenWithFrontfaceCamera(true);
            ImageUpdater imageUpdater2 = this.imageUpdater;
            imageUpdater2.parentFragment = this;
            imageUpdater2.setDelegate(new AnonymousClass50());
            getMediaDataController().checkFeaturedStickers();
            getMessagesController().loadSuggestedFilters();
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, this.classGuid);
        }
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        if (user == null) {
            user = UserConfig.getInstance(this.currentAccount).getCurrentUser();
        }
        if (user == null) {
            return;
        }
        this.imageUpdater.updateColors();
        ImageUpdater imageUpdater3 = this.imageUpdater;
        TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
        imageUpdater3.openMenu((userProfilePhoto == null || userProfilePhoto.photo_big == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : true, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openSetAvatar$155();
            }
        }, new DialogInterface.OnDismissListener() {
            @Override
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.lambda$openSetAvatar$156(dialogInterface);
            }
        }, 0);
    }

    class AnonymousClass50 implements ImageUpdater.ImageUpdaterDelegate {
        @Override
        public boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        @Override
        public boolean supportsBulletin() {
            return true;
        }

        AnonymousClass50() {
        }

        @Override
        public void didStartUpload(boolean z, boolean z2) {
            if (DialogsActivity.this.uploadingAvatarBulletin != null) {
                DialogsActivity.this.uploadingAvatarBulletin.hide();
                DialogsActivity.this.uploadingAvatarBulletin = null;
            }
            Bulletin.ProgressLayout progressLayout = new Bulletin.ProgressLayout(DialogsActivity.this.getContext(), ((BaseFragment) DialogsActivity.this).resourceProvider);
            if (z) {
                progressLayout.imageView.setImageBitmap(DialogsActivity.this.imageUpdater.getPreviewBitmap());
            } else {
                progressLayout.imageView.setImageBitmap(PhotoViewer.getInstance().centerImage.getBitmap());
            }
            progressLayout.setButton(new Bulletin.UndoButton(DialogsActivity.this.getContext(), true, ((BaseFragment) DialogsActivity.this).resourceProvider).setText(LocaleController.getString(R.string.ViewAction)).setUndoAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.openAvatarInProfile();
                }
            }));
            progressLayout.getButton().setVisibility(8);
            progressLayout.textView.setText(LocaleController.getString(z2 ? R.string.YourProfileVideoUploading : R.string.YourProfilePhotoUploading), true);
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.uploadingAvatarBulletin = BulletinFactory.of(dialogsActivity).create(progressLayout, -1);
            DialogsActivity.this.uploadingAvatarBulletin.hideAfterBottomSheet = false;
            DialogsActivity.this.uploadingAvatarBulletin.setCanHide(false);
            DialogsActivity.this.uploadingAvatarBulletin.skipShowAnimation();
            DialogsActivity.this.uploadingAvatarBulletin.show();
        }

        public void openAvatarInProfile() {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", UserConfig.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getClientUserId());
            bundle.putBoolean("my_profile", true);
            DialogsActivity.this.presentFragment(new ProfileActivity(bundle, null));
        }

        @Override
        public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            if (DialogsActivity.this.uploadingAvatarBulletin == null) {
                return null;
            }
            Bulletin.ProgressLayout progressLayout = (Bulletin.ProgressLayout) DialogsActivity.this.uploadingAvatarBulletin.getLayout();
            PhotoViewer.PlaceProviderObject placeProviderObject = new PhotoViewer.PlaceProviderObject();
            int[] iArr = new int[2];
            progressLayout.imageView.getLocationInWindow(iArr);
            placeProviderObject.viewX = iArr[0];
            placeProviderObject.viewY = iArr[1];
            placeProviderObject.parentView = DialogsActivity.this.fragmentView;
            ImageReceiver imageReceiver = progressLayout.imageView.getImageReceiver();
            placeProviderObject.imageReceiver = imageReceiver;
            placeProviderObject.thumb = imageReceiver.getBitmapSafe();
            placeProviderObject.clipBottomAddition = 0;
            placeProviderObject.radius = placeProviderObject.imageReceiver.getRoundRadius();
            placeProviderObject.scale = progressLayout.imageView.getScaleX();
            return placeProviderObject;
        }

        @Override
        public void onUploadProgressChanged(float f) {
            if (DialogsActivity.this.uploadingAvatarBulletin != null) {
                ((Bulletin.ProgressLayout) DialogsActivity.this.uploadingAvatarBulletin.getLayout()).setProgress(f * 0.9f);
            }
        }

        @Override
        public void didUploadPhoto(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, final String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, final boolean z, final TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didUploadPhoto$2(inputFile, inputFile2, videoSize, d, str, z, photoSize2, photoSize);
                }
            });
        }

        public void lambda$didUploadPhoto$1(final String str, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$didUploadPhoto$0(tL_error, tLObject, str, z);
                }
            });
        }

        public void lambda$didUploadPhoto$0(TLRPC.TL_error tL_error, TLObject tLObject, String str, boolean z) {
            if (tL_error == null) {
                TLRPC.User user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(DialogsActivity.this.getUserConfig().getClientUserId()));
                if (user == null) {
                    user = DialogsActivity.this.getUserConfig().getCurrentUser();
                    if (user == null) {
                        return;
                    } else {
                        DialogsActivity.this.getMessagesController().putUser(user, false);
                    }
                } else {
                    DialogsActivity.this.getUserConfig().setCurrentUser(user);
                }
                TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
                ArrayList<TLRPC.PhotoSize> arrayList = tL_photos_photo.photo.sizes;
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(arrayList, 150);
                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(arrayList, 800);
                TLRPC.VideoSize closestVideoSizeWithSize = tL_photos_photo.photo.video_sizes.isEmpty() ? null : FileLoader.getClosestVideoSizeWithSize(tL_photos_photo.photo.video_sizes, 1000);
                TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                user.photo = tL_userProfilePhoto;
                tL_userProfilePhoto.photo_id = tL_photos_photo.photo.id;
                if (closestPhotoSizeWithSize != null) {
                    tL_userProfilePhoto.photo_small = closestPhotoSizeWithSize.location;
                }
                if (closestPhotoSizeWithSize2 != null) {
                    tL_userProfilePhoto.photo_big = closestPhotoSizeWithSize2.location;
                }
                if (closestPhotoSizeWithSize != null && DialogsActivity.this.avatar != null) {
                    FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPathToAttach(DialogsActivity.this.avatar, true).renameTo(FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize, true));
                    ImageLoader.getInstance().replaceImageInCache(DialogsActivity.this.avatar.volume_id + "_" + DialogsActivity.this.avatar.local_id + "@50_50", closestPhotoSizeWithSize.location.volume_id + "_" + closestPhotoSizeWithSize.location.local_id + "@50_50", ImageLocation.getForUserOrChat(((BaseFragment) DialogsActivity.this).currentAccount, user, 1), false);
                }
                if (closestVideoSizeWithSize == null || str == null) {
                    if (closestPhotoSizeWithSize2 != null && DialogsActivity.this.avatarBig != null) {
                        FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPathToAttach(DialogsActivity.this.avatarBig, true).renameTo(FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPathToAttach(closestPhotoSizeWithSize2, true));
                    }
                } else {
                    new File(str).renameTo(FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPathToAttach(closestVideoSizeWithSize, "mp4", true));
                }
                DialogsActivity.this.getMessagesController().getDialogPhotos(user.id).addPhotoAtStart(tL_photos_photo.photo);
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(user);
                DialogsActivity.this.getMessagesStorage().putUsersAndChats(arrayList2, null, false, true);
                TLRPC.UserFull userFull = DialogsActivity.this.getMessagesController().getUserFull(DialogsActivity.this.getUserConfig().getClientUserId());
                if (userFull != null) {
                    userFull.profile_photo = tL_photos_photo.photo;
                    DialogsActivity.this.getMessagesStorage().updateUserInfo(userFull, false);
                }
            }
            DialogsActivity.this.avatar = null;
            DialogsActivity.this.avatarBig = null;
            DialogsActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
            DialogsActivity.this.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            DialogsActivity.this.getUserConfig().saveConfig(true);
            MessagesController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            DialogsActivity.this.lambda$updateDialogsHint$41();
            if (DialogsActivity.this.uploadingAvatarBulletin != null) {
                Bulletin.ProgressLayout progressLayout = (Bulletin.ProgressLayout) DialogsActivity.this.uploadingAvatarBulletin.getLayout();
                progressLayout.textView.setText(LocaleController.getString(z ? R.string.YourProfileVideoDone : R.string.YourProfilePhotoDone), true);
                progressLayout.setProgress(1.0f);
                Bulletin.Button button = progressLayout.getButton();
                button.setScaleX(0.6f);
                button.setScaleY(0.6f);
                button.setAlpha(0.0f);
                button.setVisibility(0);
                button.animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(360L).start();
                DialogsActivity.this.uploadingAvatarBulletin.setDuration(5000);
                DialogsActivity.this.uploadingAvatarBulletin.setCanHide(false);
                DialogsActivity.this.uploadingAvatarBulletin.setCanHide(true);
            }
        }

        public void lambda$didUploadPhoto$2(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, TLRPC.VideoSize videoSize, double d, final String str, final boolean z, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            if (inputFile != null || inputFile2 != null || videoSize != null) {
                if (DialogsActivity.this.avatar == null) {
                    return;
                }
                TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                if (inputFile != null) {
                    tL_photos_uploadProfilePhoto.file = inputFile;
                    tL_photos_uploadProfilePhoto.flags |= 1;
                }
                if (inputFile2 != null) {
                    tL_photos_uploadProfilePhoto.video = inputFile2;
                    int i = tL_photos_uploadProfilePhoto.flags;
                    tL_photos_uploadProfilePhoto.video_start_ts = d;
                    tL_photos_uploadProfilePhoto.flags = i | 6;
                }
                if (videoSize != null) {
                    tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize;
                    tL_photos_uploadProfilePhoto.flags |= 16;
                }
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.avatarUploadingRequest = dialogsActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$didUploadPhoto$1(str, z, tLObject, tL_error);
                    }
                });
            } else {
                DialogsActivity.this.avatar = photoSize.location;
                DialogsActivity.this.avatarBig = photoSize2.location;
            }
            ((BaseFragment) DialogsActivity.this).actionBar.createMenu().requestLayout();
        }
    }

    public void lambda$openSetAvatar$155() {
        MessagesController.getInstance(this.currentAccount).deleteUserPhoto(null);
    }

    public void lambda$openSetAvatar$156(DialogInterface dialogInterface) {
        if (this.imageUpdater.isUploadingImage()) {
            MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "USERPIC_SETUP");
            lambda$updateDialogsHint$41();
        }
    }

    private void openWriteContacts() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("destroyAfterSelect", true);
        presentFragment(new ContactsActivity(bundle));
    }

    private void openStoriesRecorder() throws Resources.NotFoundException {
        if (!this.storiesEnabled) {
            HintView2 hintView2 = this.storyPremiumHint;
            if (hintView2 != null) {
                if (hintView2.shown()) {
                    return;
                } else {
                    AndroidUtilities.removeFromParent(this.storyPremiumHint);
                }
            }
            HintView2 bgColor = new HintView2(getContext(), 2).setRounding(8.0f).setDuration(8000L).setCloseButton(true).setMultilineText(true).setMaxWidthPx(AndroidUtilities.displaySize.x - AndroidUtilities.dp(148.0f)).setText(AndroidUtilities.replaceSingleTag(LocaleController.getString("StoriesPremiumHint2").replace('\n', ' '), Theme.key_undo_cancelColor, 0, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openStoriesRecorder$157();
                }
            })).setJoint(1.0f, -40.0f).setBgColor(getThemedColor(Theme.key_undo_background));
            this.storyPremiumHint = bgColor;
            bgColor.setTranslationY((-this.navigationBarHeight) - this.additionNavigationBarHeight);
            ((ViewGroup) this.fragmentView).addView(this.storyPremiumHint, LayoutHelper.createFrame(-1, 240.0f, 87, 12.0f, 0.0f, 68.0f, 40.0f));
            this.storyPremiumHint.show();
            return;
        }
        HintView2 hintView22 = this.storyHint;
        if (hintView22 != null) {
            hintView22.hide();
        }
        StoriesController.StoryLimit storyLimitCheckStoryLimit = MessagesController.getInstance(this.currentAccount).getStoriesController().checkStoryLimit();
        if (storyLimitCheckStoryLimit != null && storyLimitCheckStoryLimit.active(this.currentAccount, 1)) {
            showDialog(new LimitReachedBottomSheet(this, getContext(), storyLimitCheckStoryLimit.getLimitReachedType(), this.currentAccount, null));
        } else {
            StoryRecorder.getInstance(getParentActivity(), this.currentAccount).closeToWhenSent(new StoryRecorder.ClosingViewProvider() {
                @Override
                public void preLayout(long j, final Runnable runnable) {
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    if (dialogsActivity.dialogStoriesCell != null) {
                        dialogsActivity.scrollToTop(false, true);
                        DialogsActivity.this.invalidateScrollY = true;
                        DialogsActivity.this.fragmentView.invalidate();
                        if (j == 0 || j == DialogsActivity.this.getUserConfig().getClientUserId()) {
                            DialogsActivity.this.dialogStoriesCell.scrollToFirstCell();
                        } else {
                            DialogsActivity.this.dialogStoriesCell.scrollTo(j);
                        }
                        DialogsActivity.this.viewPages[0].listView.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {
                            @Override
                            public boolean onPreDraw() {
                                DialogsActivity.this.viewPages[0].listView.getViewTreeObserver().removeOnPreDrawListener(this);
                                AndroidUtilities.runOnUIThread(runnable, 100L);
                                return false;
                            }
                        });
                        return;
                    }
                    runnable.run();
                }

                @Override
                public StoryRecorder.SourceView getView(long j) {
                    DialogStoriesCell dialogStoriesCell = DialogsActivity.this.dialogStoriesCell;
                    return StoryRecorder.SourceView.fromStoryCell(dialogStoriesCell != null ? dialogStoriesCell.findStoryCell(j) : null);
                }
            }).open(null, true);
        }
    }

    public void lambda$openStoriesRecorder$157() {
        HintView2 hintView2 = this.storyPremiumHint;
        if (hintView2 != null) {
            hintView2.hide();
        }
        presentFragment(new PremiumPreviewFragment("stories"));
    }

    private void checkEmailConfig() {
        int iCheckEmailSuggestion = getMessagesController().checkEmailSuggestion();
        if (iCheckEmailSuggestion != 0) {
            presentFragment(new LoginActivity().changeEmail(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkEmailConfig$158();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkEmailConfig$159();
                }
            }, iCheckEmailSuggestion == 2));
            getMessagesController().markEmailSuggestionAsShown();
        }
    }

    public void lambda$checkEmailConfig$158() {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(getContext(), this.resourceProvider);
        lottieLayout.setAnimation(R.raw.email_check_inbox, new String[0]);
        lottieLayout.textView.setText(LocaleController.getString(R.string.YourLoginEmailChangedSuccess));
        Bulletin.make(this, lottieLayout, 2750).show();
        try {
            this.fragmentView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
    }

    public void lambda$checkEmailConfig$159() {
        getMessagesController().removeSuggestion(0L, "SETUP_LOGIN_EMAIL");
    }

    @Override
    public boolean canParentTabsSlide(MotionEvent motionEvent, boolean z) {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (this.searchIsShowed || ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) != null && rightSlidingDialogContainer.hasFragment())) {
            return false;
        }
        View view = this.blurredView;
        if (view != null && view.getVisibility() == 0) {
            return false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.isEditing()) {
            return false;
        }
        if (motionEvent.getY() < this.actionBar.getMeasuredHeight()) {
            return true;
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        boolean z2 = filterTabsView2 == null || filterTabsView2.getTabsCount() < 2 || this.filterTabsView.getCurrentTabId() == this.filterTabsView.getFirstTabId();
        FilterTabsView filterTabsView3 = this.filterTabsView;
        boolean z3 = filterTabsView3 == null || filterTabsView3.getTabsCount() < 2 || this.filterTabsView.getCurrentTabId() == this.filterTabsView.getLastTabId();
        SharedConfig.getChatSwipeAction(this.currentAccount);
        return z ? z3 && !z2 : z2;
    }

    private void showItemOptions() throws IOException {
        boolean zIsCurrentThemeDark;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, this.optionsItem);
        int i = Theme.key_actionBarDefaultTitle;
        itemOptionsMakeOptions.setColors(getThemedColor(i), getThemedColor(i));
        itemOptionsMakeOptions.setDimAlpha(8);
        Activity parentActivity = getParentActivity();
        final LaunchActivity launchActivity = parentActivity instanceof LaunchActivity ? (LaunchActivity) parentActivity : null;
        if (this.communityId != 0) {
            if (ChatObject.hasAdminRights(this.community)) {
                itemOptionsMakeOptions.add(R.drawable.msg_customize, LocaleController.getString(R.string.CommunityMenuSettings), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$showItemOptions$160();
                    }
                });
                itemOptionsMakeOptions.addGap();
            }
            itemOptionsMakeOptions.addChecked(this.community.collapsed_in_dialogs, LocaleController.getString(R.string.CommunityMenuShowAsOneChat), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showItemOptions$161();
                }
            });
            itemOptionsMakeOptions.addChecked(!this.community.collapsed_in_dialogs, LocaleController.getString(R.string.CommunityMenuShowAsSeparateChats), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showItemOptions$162();
                }
            });
            itemOptionsMakeOptions.show();
            itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
            return;
        }
        if (isArchive()) {
            itemOptionsMakeOptions.add(R.drawable.msg_customize, LocaleController.getString(R.string.ArchiveSettings), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showItemOptions$163();
                }
            });
            itemOptionsMakeOptions.add(R.drawable.msg_help, LocaleController.getString(R.string.HowDoesItWork), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showArchiveHelp();
                }
            });
            itemOptionsMakeOptions.show();
            itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
            return;
        }
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        if (resourcesProvider != null) {
            zIsCurrentThemeDark = resourcesProvider.isDark();
        } else {
            zIsCurrentThemeDark = Theme.isCurrentThemeDark();
        }
        itemOptionsMakeOptions.add(zIsCurrentThemeDark ? R.drawable.menu_day_mode_24 : R.drawable.menu_night_mode_24, LocaleController.getString(zIsCurrentThemeDark ? R.string.SwitchThemeToDay : R.string.SwitchThemeToNight), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$165();
            }
        });
        itemOptionsMakeOptions.addGap();
        itemOptionsMakeOptions.add(R.drawable.outline_groups_24, LocaleController.getString(R.string.NewGroup), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$166();
            }
        });
        itemOptionsMakeOptions.add(R.drawable.outline_saved_24, LocaleController.getString(R.string.SavedMessages), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$167();
            }
        });
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.addItemOptions(itemOptionsMakeOptions);
        }
        TLRPC.TL_attachMenuBots attachMenuBots = MediaDataController.getInstance(UserConfig.selectedAccount).getAttachMenuBots();
        if (launchActivity != null && attachMenuBots != null && (arrayList = attachMenuBots.bots) != null && !arrayList.isEmpty()) {
            Iterator<TLRPC.TL_attachMenuBot> it = attachMenuBots.bots.iterator();
            while (it.hasNext()) {
                final TLRPC.TL_attachMenuBot next = it.next();
                if (next.show_in_side_menu) {
                    itemOptionsMakeOptions.addBot(next, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$showItemOptions$171(next, launchActivity);
                        }
                    }, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$showItemOptions$172(next);
                        }
                    });
                }
            }
        }
        if (getUserConfig().showCallsTab) {
            itemOptionsMakeOptions.add(R.drawable.msg_settings_old, LocaleController.getString(R.string.Settings), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showItemOptions$173();
                }
            });
        }
        ActionBarMenuSubItem actionBarMenuSubItem = this.proxyMenuSubItem;
        if (actionBarMenuSubItem != null) {
            actionBarMenuSubItem.subtextView.setTextColor(getThemedColor(Theme.key_groupcreate_sectionText));
            this.proxyMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showItemOptions$174(itemOptionsMakeOptions, view);
                }
            });
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            String string = sharedPreferences.getString("proxy_ip", "");
            if ((sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                itemOptionsMakeOptions.addGap();
                itemOptionsMakeOptions.add(this.proxyMenuSubItem);
            }
        }
        itemOptionsMakeOptions.show();
        itemOptionsMakeOptions.setTranslationY(-AndroidUtilities.dp(64.0f));
    }

    public void lambda$showItemOptions$160() {
        Bundle bundle = new Bundle();
        bundle.putLong("community_id", this.communityId);
        presentFragment(new CommunityEditActivity(bundle));
    }

    public void lambda$showItemOptions$161() {
        if (this.community.collapsed_in_dialogs) {
            return;
        }
        getMessagesController().toggleCommunityCollapsedInDialogs(this.communityId, true);
        finishFragment();
    }

    public void lambda$showItemOptions$162() {
        if (this.community.collapsed_in_dialogs) {
            getMessagesController().toggleCommunityCollapsedInDialogs(this.communityId, false);
            finishFragment();
        }
    }

    public void lambda$showItemOptions$163() {
        presentFragment(new ArchiveSettingsActivity());
    }

    public void lambda$showItemOptions$165() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.lambda$showItemOptions$165():void");
    }

    public void lambda$showItemOptions$164() {
        presentFragment(new ThemeActivity(1));
    }

    public void lambda$showItemOptions$166() {
        presentFragment(new GroupCreateActivity(new Bundle()));
    }

    public void lambda$showItemOptions$167() {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", UserConfig.getInstance(this.currentAccount).getClientUserId());
        presentFragment(new ChatActivity(bundle));
    }

    public void lambda$showItemOptions$171(final TLRPC.TL_attachMenuBot tL_attachMenuBot, final LaunchActivity launchActivity) {
        if (tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) {
            WebAppDisclaimerAlert.show(getContext(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$showItemOptions$170(tL_attachMenuBot, launchActivity, (Boolean) obj);
                }
            }, null, null);
        } else {
            LaunchActivity.showAttachMenuBot(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        }
    }

    public void lambda$showItemOptions$170(final TLRPC.TL_attachMenuBot tL_attachMenuBot, final LaunchActivity launchActivity, Boolean bool) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(this.currentAccount).getInputUser(tL_attachMenuBot.bot_id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$showItemOptions$169(tL_attachMenuBot, launchActivity, tLObject, tL_error);
            }
        }, 66);
    }

    public void lambda$showItemOptions$169(final TLRPC.TL_attachMenuBot tL_attachMenuBot, final LaunchActivity launchActivity, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showItemOptions$168(tL_attachMenuBot, launchActivity);
            }
        });
    }

    public void lambda$showItemOptions$168(TLRPC.TL_attachMenuBot tL_attachMenuBot, LaunchActivity launchActivity) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        LaunchActivity.showAttachMenuBot(launchActivity, this.currentAccount, tL_attachMenuBot, null, true);
        MediaDataController.getInstance(this.currentAccount).updateAttachMenuBotsInCache();
    }

    public void lambda$showItemOptions$172(TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        BotWebViewSheet.deleteBot(this.currentAccount, tL_attachMenuBot.bot_id, null);
    }

    public void lambda$showItemOptions$173() {
        presentFragment(new SettingsActivity());
    }

    public void lambda$showItemOptions$174(ItemOptions itemOptions, View view) {
        itemOptions.dismiss();
        presentFragment(new ProxyListActivity());
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        this.windowInsetsStateHolder.setInsets(windowInsetsCompat);
        this.statusBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).top;
        this.navigationBarHeight = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.systemBars()).bottom;
        int i = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        if (this.imeInsetHeight != i) {
            this.imeInsetHeight = i;
            this.fragmentView.requestLayout();
        }
        this.dialogsActivityStatusLayout.setPadding(0, this.statusBarHeight, 0, 0);
        updateFloatingButtonOffset();
        for (UndoView undoView : this.undoView) {
            if (undoView != null) {
                int i2 = this.navigationBarHeight + this.additionNavigationBarHeight;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) undoView.getLayoutParams();
                if (marginLayoutParams != null && marginLayoutParams.bottomMargin != i2) {
                    marginLayoutParams.bottomMargin = i2;
                    undoView.setLayoutParams(marginLayoutParams);
                }
            }
        }
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null) {
            ViewCompat.dispatchApplyWindowInsets(rightSlidingDialogContainer, windowInsetsCompat);
        }
        return WindowInsetsCompat.CONSUMED;
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 1) {
            checkUi_menuItems();
            checkUi_searchFieldVisibility();
            checkUi_topPanelVisible();
            checkUi_filterTabsVisible();
            checkUi_searchFiltersVisibility();
            checkUi_searchFieldStyle();
            checkUi_communityAvatarImageVisibility();
            return;
        }
        if (i == 2) {
            checkUi_menuItems();
            checkUi_searchFieldVisibility();
            return;
        }
        if (i == 3) {
            checkUi_itemSpeedVisibility();
            return;
        }
        if (i == 4) {
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
                return;
            }
            return;
        }
        if (i == 5) {
            checkUi_itemSearchVisibility();
            return;
        }
        if (i == 6) {
            checkUi_menuItems();
            checkUi_searchFieldVisibility();
        } else {
            if (i == 7) {
                checkUi_forwardCommentFieldVisible();
                return;
            }
            if (i == 8) {
                checkUi_filterTabsVisible();
                checkUi_searchFiltersVisibility();
            } else if (i == 9) {
                checkUi_searchFiltersVisibility();
            }
        }
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        ActionBarMenuItem actionBarMenuItem;
        if (i != 3 || (actionBarMenuItem = this.speedItem) == null) {
            return;
        }
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) actionBarMenuItem.getIconView().getDrawable();
        if (this.animatorSpeedButtonVisible.getValue()) {
            animatedVectorDrawable.start();
            if (SharedConfig.getDevicePerformanceClass() != 0) {
                TLRPC.TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(this.currentAccount).getPremiumPromo();
                String strFeatureTypeToServerString = PremiumPreviewFragment.featureTypeToServerString(2);
                if (premiumPromo != null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= premiumPromo.video_sections.size()) {
                            i2 = -1;
                            break;
                        } else if (premiumPromo.video_sections.get(i2).equals(strFeatureTypeToServerString)) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                    if (i2 != -1) {
                        FileLoader.getInstance(this.currentAccount).loadFile(premiumPromo.videos.get(i2), premiumPromo, 3, 0);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            animatedVectorDrawable.reset();
        } else {
            animatedVectorDrawable.setVisible(false, true);
        }
    }

    private void checkUi_communityAvatarImageVisibility() {
        float fNot = FBool.not(this.animatorSearchVisible.getFloatValue());
        BackupImageView backupImageView = this.communityAvatarImage;
        if (backupImageView != null) {
            backupImageView.setScaleX(fNot);
            this.communityAvatarImage.setScaleY(fNot);
            this.communityAvatarImage.setAlpha(fNot);
            this.communityAvatarImage.setVisibility(fNot > 0.0f ? 0 : 8);
        }
        if (this.addChatsToCommunityButton != null) {
            float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fNot);
            this.addChatsToCommunityButton.setScaleX(fLerp);
            this.addChatsToCommunityButton.setScaleY(fLerp);
            this.addChatsToCommunityButton.setAlpha(fNot);
            this.addChatsToCommunityButton.setVisibility(fNot > 0.0f ? 0 : 8);
            this.communityBottomFadeView.setAlpha(fNot);
            this.communityBottomFadeView.setVisibility(fNot > 0.0f ? 0 : 8);
        }
    }

    public void checkUi_searchFiltersVisibility() {
        if (this.searchTabsAndFiltersLayout != null) {
            float floatValue = (this.searchTabsView != null ? 1.0f : 0.0f) * this.animatorSearchVisible.getFloatValue();
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, floatValue);
            this.searchTabsAndFiltersLayout.setScaleX(fLerp);
            this.searchTabsAndFiltersLayout.setScaleY(fLerp);
            this.searchTabsAndFiltersLayout.setAlpha(floatValue);
            this.searchTabsAndFiltersLayout.setVisibility(floatValue > 0.0f ? 0 : 8);
        }
        if (this.searchTabsView != null) {
            float floatValue2 = 1.0f - this.animatorSearchFilterTabsVisible.getFloatValue();
            this.searchTabsView.setAlpha(floatValue2);
            this.searchTabsView.setVisibility(floatValue2 > 0.0f ? 0 : 8);
        }
        if (this.filtersView != null) {
            float floatValue3 = this.animatorSearchFilterTabsVisible.getFloatValue();
            this.filtersView.setAlpha(floatValue3);
            this.filtersView.setVisibility(floatValue3 > 0.0f ? 0 : 8);
        }
    }

    private void checkUi_forwardCommentFieldVisible() {
        float floatValue = this.animatorForwardButtonVisible.getFloatValue();
        float fLerp = AndroidUtilities.lerp(0.2f, 1.0f, floatValue);
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        if (sendButton != null) {
            sendButton.setScaleX(fLerp);
            this.writeButton.setScaleY(fLerp);
            this.writeButton.setAlpha(floatValue);
            this.writeButton.setVisibility(floatValue > 0.0f ? 0 : 8);
        }
        ChatInputViewsContainer chatInputViewsContainer = this.chatInputViewsContainer;
        if (chatInputViewsContainer != null) {
            chatInputViewsContainer.setAlpha(floatValue);
            this.chatInputViewsContainer.setVisibility(floatValue > 0.0f ? 0 : 8);
            this.chatInputViewsContainer.getFadeView().setAlpha(floatValue);
            this.chatInputViewsContainer.getFadeView().setVisibility(floatValue > 0.0f ? 0 : 8);
        }
    }

    public void checkUi_topPanelVisible() {
        if (this.topPanelLayout != null) {
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, 1.0f);
            this.topPanelLayout.setAlpha(1.0f);
            this.topPanelLayout.setScaleX(fLerp);
            this.topPanelLayout.setScaleY(fLerp);
            this.topPanelLayout.setVisibility(0);
        }
    }

    public void checkUi_searchPagesPaddings(boolean z) {
        if (this.searchViewPager == null || this.actionBar == null) {
            return;
        }
        int i = AndroidUtilities.navigationBarHeight;
        int iDp = AndroidUtilities.dp(this.ADDITIONAL_LIST_HEIGHT_DP) + this.actionBar.getMeasuredHeight() + (this.searchTabsView != null ? AndroidUtilities.dp(50.0f) : 0);
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        this.searchViewPager.setPagesPadding(iDp + (dialogsActivityTopPanelLayout != null ? (int) dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(AndroidUtilities.dp(7.0f)) : 0), i, z);
    }

    public float getFilterTabsVisibilityFactor(boolean z) {
        return (z ? 1.0f - this.animatorSearchVisible.getFloatValue() : 1.0f) * (1.0f - getRightSlidingProgress()) * this.animatorFilterTabsVisible.getFloatValue();
    }

    public void checkUi_filterTabsVisible() {
        ViewPage viewPage;
        float filterTabsVisibilityFactor = getFilterTabsVisibilityFactor(true);
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            boolean z = filterTabsView.getAlpha() != filterTabsVisibilityFactor;
            float fLerp = AndroidUtilities.lerp(0.98f, 1.0f, filterTabsVisibilityFactor);
            this.filterTabsView.setAlpha(filterTabsVisibilityFactor);
            this.filterTabsView.setScaleX(fLerp);
            this.filterTabsView.setScaleY(fLerp);
            this.filterTabsView.setVisibility(filterTabsVisibilityFactor > 0.0f ? 0 : 8);
            if (z && (viewPage = this.viewPages[0]) != null) {
                viewPage.listView.requestLayout();
            }
        }
        updateContextViewPosition();
    }

    public void checkUi_mainTabsVisible() {
        View view;
        boolean z = !this.searching && ((view = this.blurredView) == null || view.getBackground() == null || this.blurredView.getAlpha() < 0.01f || this.blurredView.getVisibility() == 8);
        MainTabsActivityController mainTabsActivityController = this.mainTabsActivityController;
        if (mainTabsActivityController != null) {
            mainTabsActivityController.setTabsVisible(z);
        }
    }

    public void checkUi_searchFieldVisibility() {
        if (this.fragmentSearchField == null) {
            return;
        }
        float fClamp = 1.0f - MathUtils.clamp(((-this.scrollYOffset) - getMaxScrollYOffsetWithoutSearch()) / AndroidUtilities.dp(48.0f), 0.0f, 1.0f);
        float fMax = (isSupportSearch() ? 1.0f : 0.0f) * (1.0f - Math.max(this.progressToActionMode, this.animatorActionModeVisible.getFloatValue())) * (1.0f - this.animatorDoneButtonVisible.getFloatValue()) * Math.max(this.animatorSearchVisible.getFloatValue(), fClamp * (1.0f - getRightSlidingProgress()));
        this.fragmentSearchField.setAlpha(fMax);
        this.fragmentSearchField.setVisibility(fMax > 0.0f ? 0 : 8);
        this.animatorSearchButtonVisible.setValue(fMax <= 0.01f, true);
    }

    private void checkUi_searchFieldStyle() {
        this.fragmentSearchField.setBlurredBackgroundVisibility(this.animatorSearchVisible.getFloatValue());
    }

    public void checkUi_searchFieldHint() {
        String string = LocaleController.getString(getRightSlidingProgress() > 0.5f ? R.string.SearchTopics : R.string.SearchChats);
        this.fragmentSearchField.editText.setContentDescription(string);
        this.fragmentSearchField.editText.setHint(string);
    }

    public void checkUi_menuItems() {
        checkUi_itemBackButtonVisibility();
        checkUi_itemOptionsVisibility();
        checkUi_itemDownloadsVisibility();
        checkUi_itemSpeedVisibility();
        checkUi_itemPasscodeVisibility();
        checkUi_itemSearchVisibility();
    }

    private void checkUi_itemBackButtonVisibility() {
        if (this.actionBar == null) {
            return;
        }
        float floatValue = 1.0f - this.animatorSearchVisible.getFloatValue();
        float rightSlidingProgress = 1.0f - getRightSlidingProgress();
        FragmentFloatingButton.setAnimatedVisibility(this.actionBar.getBackButton(), Math.max(this.progressToActionMode, floatValue * rightSlidingProgress * (1.0f - this.animatorDoneButtonVisible.getFloatValue())));
    }

    private void checkUi_itemOptionsVisibility() {
        FragmentFloatingButton.setAnimatedVisibility(this.optionsItem, (1.0f - this.animatorSearchVisible.getFloatValue()) * (1.0f - getRightSlidingProgress()) * (1.0f - this.animatorDoneButtonVisible.getFloatValue()));
    }

    public void checkUi_itemPasscodeVisibility() {
        float f = SharedConfig.passcodeHash.isEmpty() ? 0.0f : 1.0f;
        FragmentFloatingButton.setAnimatedVisibility(this.passcodeItem, f * (1.0f - this.animatorSearchVisible.getFloatValue()) * (1.0f - getRightSlidingProgress()) * (1.0f - this.animatorDoneButtonVisible.getFloatValue()));
    }

    private void checkUi_itemDownloadsVisibility() {
        float f = this.downloadsItemVisible ? 1.0f : 0.0f;
        FragmentFloatingButton.setAnimatedVisibility(this.downloadsItem, f * (1.0f - this.animatorSearchVisible.getFloatValue()) * (1.0f - getRightSlidingProgress()) * (1.0f - this.animatorDoneButtonVisible.getFloatValue()));
    }

    private void checkUi_itemSpeedVisibility() {
        float floatValue = this.animatorSearchVisible.getFloatValue();
        float rightSlidingProgress = 1.0f - getRightSlidingProgress();
        FragmentFloatingButton.setAnimatedVisibility(this.speedItem, floatValue * rightSlidingProgress * (1.0f - this.animatorDoneButtonVisible.getFloatValue()) * this.animatorSpeedButtonVisible.getFloatValue());
    }

    private void checkUi_itemSearchVisibility() {
        float f = isSupportSearch() ? 1.0f : 0.0f;
        FragmentFloatingButton.setAnimatedVisibility(this.searchItem, f * this.animatorSearchButtonVisible.getFloatValue() * (1.0f - getRightSlidingProgress()) * (1.0f - this.animatorDoneButtonVisible.getFloatValue()));
        DialogStoriesCell dialogStoriesCell = this.dialogStoriesCell;
        if (dialogStoriesCell != null) {
            dialogStoriesCell.invalidate();
        }
    }

    private boolean isSupportSearch() {
        return this.initialDialogsType != 2;
    }

    public long getCommunityId() {
        return this.communityId;
    }

    public void blur3_InvalidateBlur() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.blur3_InvalidateBlur():void");
    }

    public int calculateListViewPaddingBottom() {
        if (this.commentView != null) {
            return (int) (this.windowInsetsStateHolder.getAnimatedMaxBottomInset() + AndroidUtilities.dp(9.0f) + this.chatInputViewsContainer.getInputBubbleHeight() + AndroidUtilities.dp(7.0f) + AndroidUtilities.dp(2.0f));
        }
        if (this.communityId != 0) {
            return this.navigationBarHeight + AndroidUtilities.dp(72.0f);
        }
        return this.navigationBarHeight + this.additionNavigationBarHeight;
    }

    @Override
    public BlurredBackgroundSourceRenderNode getGlassSource() {
        return this.iBlur3SourceGlass;
    }

    @Override
    public void onParentScrollToTop() {
        scrollToTop(true, true);
    }

    private void switchTheme(Theme.ThemeInfo themeInfo, boolean z) {
        ActionBarMenuItem actionBarMenuItem = this.optionsItem;
        if (actionBarMenuItem == null) {
            return;
        }
        int[] iArr = new int[2];
        actionBarMenuItem.getLocationInWindow(iArr);
        iArr[0] = iArr[0] + (this.optionsItem.getIconView().getMeasuredWidth() / 2);
        iArr[1] = iArr[1] + (this.optionsItem.getIconView().getMeasuredHeight() / 2);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), null, null, null, Boolean.TRUE);
    }

    public float getTopPanelAnimatedHeight() {
        return getTopPanelAnimatedHeight(AndroidUtilities.dp(14.0f));
    }

    public float getTopPanelAnimatedHeight(int i) {
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout != null) {
            return dialogsActivityTopPanelLayout.getAnimatedHeightWithPadding(i);
        }
        return 0.0f;
    }

    public float getTopPanelVisibility() {
        DialogsActivityTopPanelLayout dialogsActivityTopPanelLayout = this.topPanelLayout;
        if (dialogsActivityTopPanelLayout != null) {
            return dialogsActivityTopPanelLayout.getMetadata().getTotalVisibility();
        }
        return 0.0f;
    }

    public void checkInsets() {
        ChatInputViewsContainer chatInputViewsContainer = this.chatInputViewsContainer;
        if (chatInputViewsContainer != null) {
            chatInputViewsContainer.checkInsets();
        }
        checkUi_chatListViewPaddingsBottom();
        blur3_InvalidateBlur();
        checkUi_fadeView();
        ChatActivityEnterView.SendButton sendButton = this.writeButton;
        if (sendButton != null) {
            sendButton.setTranslationY(-this.windowInsetsStateHolder.getAnimatedMaxBottomInset());
        }
    }

    public void checkUi_fadeView() {
        ChatInputViewsContainer chatInputViewsContainer = this.chatInputViewsContainer;
        if (chatInputViewsContainer != null) {
            chatInputViewsContainer.setBlurredBottomHeight(this.windowInsetsStateHolder.getAnimatedMaxBottomInset() + AndroidUtilities.dp(9.0f) + this.chatInputViewsContainer.getInputBubbleHeight() + AndroidUtilities.dp(7.0f));
        }
    }

    public void checkUi_chatListViewPaddingsBottom() {
        if (this.viewPages == null) {
            return;
        }
        int iCalculateListViewPaddingBottom = calculateListViewPaddingBottom();
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr = this.viewPages;
            if (i >= viewPageArr.length) {
                return;
            }
            ViewPage viewPage = viewPageArr[i];
            if (viewPage != null) {
                DialogsRecyclerView dialogsRecyclerView = viewPage.listView;
                dialogsRecyclerView.setPadding(0, dialogsRecyclerView.topPadding, 0, iCalculateListViewPaddingBottom);
            }
            i++;
        }
    }

    public void drawHeaderShadow(Canvas canvas, int i) {
        INavigationLayout iNavigationLayout;
        if (this.parentLayout == null || this.actionBar == null) {
            return;
        }
        float fMax = Math.max(this.animatorShadowVisible.getFloatValue(), getRightSlidingProgress());
        float f = 1.0f;
        float f2 = 1.0f - this.searchAnimationProgress;
        float f3 = fMax * f2 * f2;
        if (f3 == 0.0f) {
            return;
        }
        if (-1 >= i) {
            i = -1;
            f = 0.0f;
        }
        if (f <= 0.0f || f3 <= 0.0f || i <= 0 || (iNavigationLayout = this.parentLayout) == null) {
            return;
        }
        iNavigationLayout.drawHeaderShadow(canvas, (int) (f * 255.0f * f3), i);
    }

    public LinearLayout accountView(int i, final boolean z) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setBackground(Theme.createRadSelectorDrawable(getThemedColor(Theme.key_listSelector), 0, 0));
        TLRPC.User currentUser = UserConfig.getInstance(i).getCurrentUser();
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        avatarDrawable.setInfo(currentUser);
        FrameLayout frameLayout = new FrameLayout(getContext()) {
            private final Paint selectedPaint = new Paint(1);

            @Override
            protected void dispatchDraw(Canvas canvas) {
                if (z) {
                    this.selectedPaint.setStyle(Paint.Style.STROKE);
                    this.selectedPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
                    this.selectedPaint.setColor(DialogsActivity.this.getThemedColor(Theme.key_featuredStickers_addButton));
                    canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, AndroidUtilities.dp(16.0f), this.selectedPaint);
                }
                super.dispatchDraw(canvas);
            }
        };
        linearLayout.addView(frameLayout, LayoutHelper.createLinear(34, 34, 16, 12, 0, 0, 0));
        BackupImageView backupImageView = new BackupImageView(getContext());
        if (z) {
            backupImageView.setScaleX(0.833f);
            backupImageView.setScaleY(0.833f);
        }
        backupImageView.setRoundRadius(AndroidUtilities.dp(16.0f));
        backupImageView.getImageReceiver().setCurrentAccount(i);
        backupImageView.setForUserOrChat(currentUser, avatarDrawable);
        frameLayout.addView(backupImageView, LayoutHelper.createLinear(32, 32, 17, 1, 1, 1, 1));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(getThemedColor(Theme.key_dialogTextBlack));
        textView.setText(UserObject.getUserName(currentUser));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        linearLayout.addView(textView, LayoutHelper.createLinear(0, -2, 1.0f, 16, 13, 0, 14, 0));
        return linearLayout;
    }

    public boolean openAccountSelector(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        for (int i = 0; i < 4; i++) {
            if (UserConfig.getInstance(i).isClientActivated()) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return DialogsActivity.lambda$openAccountSelector$175((Integer) obj, (Integer) obj2);
            }
        });
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this, view);
        if (arrayList.size() > 0) {
            if (itemOptionsMakeOptions.getItemsCount() > 0) {
                itemOptionsMakeOptions.addGap();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final int iIntValue = ((Integer) it.next()).intValue();
                LinearLayout linearLayoutAccountView = accountView(iIntValue, this.currentAccount == iIntValue);
                linearLayoutAccountView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        this.f$0.lambda$openAccountSelector$176(iIntValue, itemOptionsMakeOptions, view2);
                    }
                });
                itemOptionsMakeOptions.addView(linearLayoutAccountView, LayoutHelper.createLinear(230, 48));
            }
        }
        ShapeDrawable shapeDrawableCreateRoundRectDrawable = Theme.createRoundRectDrawable(AndroidUtilities.dp(24.0f), getThemedColor(Theme.key_windowBackgroundWhite));
        shapeDrawableCreateRoundRectDrawable.getPaint().setShadowLayer(AndroidUtilities.dp(6.0f), 0.0f, AndroidUtilities.dp(1.0f), Theme.multAlpha(-16777216, 0.15f));
        itemOptionsMakeOptions.setViewAdditionalOffsets(-AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f), -AndroidUtilities.dp(4.0f));
        itemOptionsMakeOptions.setScrimViewBackground(shapeDrawableCreateRoundRectDrawable);
        itemOptionsMakeOptions.translate(0.0f, -AndroidUtilities.dp(4.0f));
        itemOptionsMakeOptions.setGravity(5);
        itemOptionsMakeOptions.show();
        return true;
    }

    public static int lambda$openAccountSelector$175(Integer num, Integer num2) {
        long j = UserConfig.getInstance(num.intValue()).loginTime;
        long j2 = UserConfig.getInstance(num2.intValue()).loginTime;
        if (j > j2) {
            return 1;
        }
        return j < j2 ? -1 : 0;
    }

    public void lambda$openAccountSelector$176(int i, ItemOptions itemOptions, View view) {
        if (this.currentAccount == i) {
            return;
        }
        itemOptions.dismiss();
        if (getParentActivity() == null) {
            return;
        }
        DialogsActivityDelegate dialogsActivityDelegate = this.delegate;
        LaunchActivity launchActivity = (LaunchActivity) getParentActivity();
        ArrayList arrayList = this.sharedMediaEntries;
        String str = this.sharedLink;
        CharSequence charSequence = this.sharedTextSeed;
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        CharSequence fieldText = chatActivityEnterView != null ? chatActivityEnterView.getFieldText() : null;
        launchActivity.switchToAccount(i, true);
        DialogsActivity dialogsActivity = new DialogsActivity(this.arguments);
        dialogsActivity.setDelegate(dialogsActivityDelegate);
        if (arrayList != null && !arrayList.isEmpty()) {
            dialogsActivity.setSharedMedia(arrayList, fieldText);
        } else if (str != null) {
            dialogsActivity.setSharedLink(str, fieldText);
        } else if (charSequence != null) {
            dialogsActivity.setSharedText(charSequence, fieldText);
        }
        launchActivity.presentFragment(dialogsActivity, false, true);
    }
}
