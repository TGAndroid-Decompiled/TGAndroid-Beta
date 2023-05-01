package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
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
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$EmojiStatus;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$MessagesFilter;
import org.telegram.tgnet.TLRPC$RequestPeerType;
import org.telegram.tgnet.TLRPC$TL_chatAdminRights;
import org.telegram.tgnet.TLRPC$TL_chatlists_chatlistUpdates;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_dialogFolder;
import org.telegram.tgnet.TLRPC$TL_emojiStatus;
import org.telegram.tgnet.TLRPC$TL_emojiStatusEmpty;
import org.telegram.tgnet.TLRPC$TL_emojiStatusUntil;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_forumTopic;
import org.telegram.tgnet.TLRPC$TL_help_premiumPromo;
import org.telegram.tgnet.TLRPC$TL_messages_checkHistoryImportPeer;
import org.telegram.tgnet.TLRPC$TL_messages_checkedHistoryImportPeer;
import org.telegram.tgnet.TLRPC$TL_messages_updateDialogFilter;
import org.telegram.tgnet.TLRPC$TL_peerChannel;
import org.telegram.tgnet.TLRPC$TL_peerChat;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeBroadcast;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeChat;
import org.telegram.tgnet.TLRPC$TL_requestPeerTypeUser;
import org.telegram.tgnet.TLRPC$TL_userEmpty;
import org.telegram.tgnet.TLRPC$User;
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
import org.telegram.ui.Adapters.DialogsAdapter;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Adapters.FiltersView;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Cells.DialogsHintCell;
import org.telegram.ui.Cells.DrawerProfileCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.ProfileSearchCell;
import org.telegram.ui.Cells.RequestPeerRequirementsCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.AnimationProperties;
import org.telegram.ui.Components.BlurredRecyclerView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAvatarContainer;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.DialogsItemAnimator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FilterTabsView;
import org.telegram.ui.Components.FiltersListBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugProvider;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PacmanAnimation;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.PullForegroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.Reactions.ReactionsLayoutInBubble;
import org.telegram.ui.Components.RecyclerAnimationScrollHelper;
import org.telegram.ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.FilterCreateActivity;
import org.telegram.ui.GroupCreateFinalActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
public class DialogsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate, FloatingDebugProvider {
    public static boolean[] dialogsLoaded = new boolean[4];
    private static final Interpolator interpolator = DialogsActivity$$ExternalSyntheticLambda40.INSTANCE;
    public static float viewOffset = 0.0f;
    public final Property<DialogsActivity, Float> SCROLL_Y;
    private ValueAnimator actionBarColorAnimator;
    private Paint actionBarDefaultPaint;
    private ArrayList<View> actionModeViews;
    private ActionBarMenuSubItem addToFolderItem;
    private String addToGroupAlertString;
    private float additionalFloatingTranslation;
    private float additionalFloatingTranslation2;
    private float additionalOffset;
    private boolean afterSignup;
    private boolean allowBots;
    private boolean allowChannels;
    private boolean allowGlobalSearch;
    private boolean allowGroups;
    private boolean allowLegacyGroups;
    private boolean allowMegagroups;
    private boolean allowMoving;
    private boolean allowSwipeDuringCurrentTouch;
    private boolean allowSwitchAccount;
    private boolean allowUsers;
    private DrawerProfileCell.AnimatedStatusView animatedStatusView;
    private boolean animatingForward;
    private ActionBarMenuItem archive2Item;
    private ActionBarMenuSubItem archiveItem;
    private boolean askAboutContacts;
    private boolean askingForPermissions;
    private ChatAvatarContainer avatarContainer;
    private boolean backAnimation;
    private BackDrawable backDrawable;
    private ActionBarMenuSubItem blockItem;
    private View blurredView;
    private ArrayList<TLRPC$Dialog> botShareDialogs;
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
    private int canUnarchiveCount;
    private int canUnmuteCount;
    private boolean cantSendToChannels;
    private boolean checkCanWrite;
    private boolean checkPermission;
    private boolean checkingImportDialog;
    private ActionBarMenuSubItem clearItem;
    private boolean closeFragment;
    private boolean closeSearchFieldOnHide;
    private ChatActivityEnterView commentView;
    private AnimatorSet commentViewAnimator;
    private View commentViewBg;
    private float contactsAlpha;
    private ValueAnimator contactsAlphaAnimator;
    private int currentConnectionState;
    View databaseMigrationHint;
    private int debugLastUpdateAction;
    private DialogsActivityDelegate delegate;
    private ActionBarMenuItem deleteItem;
    private Long deviceSize;
    private DialogsHintCell dialogsHintCell;
    private boolean dialogsListFrozen;
    private boolean disableActionBarScrolling;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimator;
    private ActionBarMenuItem downloadsItem;
    private boolean downloadsItemVisible;
    private ItemOptions filterOptions;
    private float filterTabsMoveFrom;
    private float filterTabsProgress;
    private FilterTabsView filterTabsView;
    private boolean filterTabsViewIsVisible;
    private ValueAnimator filtersTabAnimator;
    private FiltersView filtersView;
    private RLottieImageView floatingButton;
    private FrameLayout floatingButtonContainer;
    private float floatingButtonHideProgress;
    private float floatingButtonPanOffset;
    private float floatingButtonTranslation;
    private boolean floatingForceVisible;
    private boolean floatingHidden;
    private final AccelerateDecelerateInterpolator floatingInterpolator;
    private AnimatorSet floatingProgressAnimator;
    private RadialProgressView floatingProgressView;
    private boolean floatingProgressVisible;
    private int folderId;
    private int forumCount;
    private FragmentContextView fragmentContextView;
    private FragmentContextView fragmentLocationContextView;
    private ArrayList<TLRPC$Dialog> frozenDialogsList;
    private boolean hasInvoice;
    private int hasPoll;
    private int initialDialogsType;
    private String initialSearchString;
    private int initialSearchType;
    boolean isDrawerTransition;
    private boolean isFirstTab;
    private boolean isNextButton;
    private boolean isPremiumHintUpgrade;
    boolean isSlideBackTransition;
    private int lastMeasuredTopPadding;
    private int maximumVelocity;
    private boolean maybeStartTracking;
    private MenuDrawable menuDrawable;
    private int messagesCount;
    private ArrayList<MessagesController.DialogFilter> movingDialogFilters;
    private DialogCell movingView;
    private boolean movingWas;
    private ActionBarMenuItem muteItem;
    private AnimationNotificationsLocker notificationsLocker;
    public boolean notify;
    private boolean onlySelect;
    private MessagesStorage.TopicKey openedDialogId;
    private PacmanAnimation pacmanAnimation;
    private Paint paint;
    private RLottieDrawable passcodeDrawable;
    private ActionBarMenuItem passcodeItem;
    private boolean passcodeItemVisible;
    private AlertDialog permissionDialog;
    private ActionBarMenuSubItem pin2Item;
    private ActionBarMenuItem pinItem;
    private Drawable premiumStar;
    private int prevPosition;
    private int prevTop;
    private float progressToActionMode;
    private ProxyDrawable proxyDrawable;
    private ActionBarMenuItem proxyItem;
    private boolean proxyItemVisible;
    private ActionBarMenuSubItem readItem;
    private RectF rect;
    private ActionBarMenuSubItem removeFromFolderItem;
    private long requestPeerBotId;
    private TLRPC$RequestPeerType requestPeerType;
    private boolean resetDelegate;
    private boolean rightFragmentTransitionInProgress;
    public RightSlidingDialogContainer rightSlidingDialogContainer;
    private float scrollAdditionalOffset;
    private boolean scrollBarVisible;
    private boolean scrollUpdated;
    private boolean scrollingManually;
    private float searchAnimationProgress;
    private boolean searchAnimationTabsDelayedCrossfade;
    private AnimatorSet searchAnimator;
    private long searchDialogId;
    private boolean searchFiltersWasShowed;
    private boolean searchIsShowed;
    private ActionBarMenuItem searchItem;
    private TLObject searchObject;
    private String searchString;
    private ViewPagerFixed.TabsView searchTabsView;
    private SearchViewPager searchViewPager;
    private boolean searchWas;
    private boolean searchWasFullyShowed;
    private boolean searching;
    private String selectAlertString;
    private String selectAlertStringGroup;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private View selectedCountView;
    private ArrayList<Long> selectedDialogs;
    private NumberTextView selectedDialogsCountTextView;
    private ActionBarPopupWindow sendPopupWindow;
    private boolean showSetPasswordConfirm;
    private String showingSuggestion;
    private RecyclerView sideMenu;
    ValueAnimator slideBackTransitionAnimator;
    boolean slideFragmentLite;
    float slideFragmentProgress;
    private DialogCell slidingView;
    private boolean slowedReloadAfterDialogClick;
    private AnimatorSet speedAnimator;
    private ActionBarMenuItem speedItem;
    private long startArchivePullingTime;
    private boolean startedTracking;
    private AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable statusDrawable;
    private ActionBarMenuItem switchItem;
    private Animator tabsAlphaAnimator;
    private AnimatorSet tabsAnimation;
    private boolean tabsAnimationInProgress;
    private float tabsYOffset;
    private TextPaint textPaint;
    private Bulletin topBulletin;
    private int topPadding;
    private UndoView[] undoView;
    private int undoViewIndex;
    private FrameLayout updateLayout;
    private AnimatorSet updateLayoutAnimator;
    private RadialProgress2 updateLayoutIcon;
    private boolean updatePullAfterScroll;
    private TextView updateTextView;
    private ViewPage[] viewPages;
    private boolean waitingForScrollFinished;
    public boolean whiteActionBar;
    private ImageView[] writeButton;
    private FrameLayout writeButtonContainer;

    public interface DialogsActivityDelegate {
        boolean didSelectDialogs(DialogsActivity dialogsActivity, ArrayList<MessagesStorage.TopicKey> arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment);
    }

    public static boolean lambda$createActionMode$35(View view, MotionEvent motionEvent) {
        return true;
    }

    public static float lambda$static$0(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public void updateCommentView() {
    }

    public boolean shouldShowNextButton(DialogsActivity dialogsActivity, ArrayList<Long> arrayList, CharSequence charSequence, boolean z) {
        return false;
    }

    public MessagesStorage.TopicKey getOpenedDialogId() {
        return this.openedDialogId;
    }

    public class ViewPage extends FrameLayout {
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
        private DialogsRecyclerView listView;
        private FlickerLoadingView progressView;
        private PullForegroundDrawable pullForegroundDrawable;
        private RecyclerItemsEnterAnimator recyclerItemsEnterAnimator;
        private RecyclerAnimationScrollHelper scrollHelper;
        private int selectedType;
        private SwipeController swipeController;
        Runnable updateListRunnable;
        boolean updating;

        public ViewPage(Context context) {
            super(context);
            this.updateListRunnable = new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.ViewPage.this.lambda$new$0();
                }
            };
        }

        public boolean isDefaultDialogType() {
            int i = this.dialogsType;
            return i == 0 || i == 7 || i == 8;
        }

        public void lambda$new$0() {
            this.dialogsAdapter.updateList(this.listView, this.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive() && this.archivePullViewState == 2, ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
            this.listView.updateDialogsOnNextDraw = true;
            this.updating = false;
        }

        public void updateList(boolean z) {
            if (((BaseFragment) DialogsActivity.this).isPaused) {
                return;
            }
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(this.updateListRunnable);
                this.listView.setItemAnimator(this.dialogsItemAnimator);
                this.updateListRunnable.run();
            } else if (this.updating) {
            } else {
                this.updating = true;
                if (!this.dialogsItemAnimator.isRunning()) {
                    this.listView.setItemAnimator(null);
                }
                AndroidUtilities.runOnUIThread(this.updateListRunnable, 36L);
            }
        }
    }

    public class ContentView extends SizeNotifierFrameLayout {
        private Paint actionBarSearchPaint;
        private int inputFieldHeight;
        private int startedTrackingPointerId;
        private int startedTrackingX;
        private int startedTrackingY;
        private VelocityTracker velocityTracker;
        private boolean wasPortrait;
        private Paint windowBackgroundPaint;

        @Override
        public boolean hasOverlappingRendering() {
            return false;
        }

        public ContentView(Context context) {
            super(context);
            this.actionBarSearchPaint = new Paint(1);
            this.windowBackgroundPaint = new Paint();
            this.needBlur = true;
            this.blurBehindViews.add(this);
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
        public void setPadding(int i, int i2, int i3, int i4) {
            DialogsActivity.this.topPadding = i2;
            DialogsActivity.this.updateContextViewPosition();
            DialogsActivity dialogsActivity = DialogsActivity.this;
            RightSlidingDialogContainer rightSlidingDialogContainer = dialogsActivity.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer != null) {
                rightSlidingDialogContainer.setFragmentViewPadding(dialogsActivity.topPadding);
            }
            DialogsActivity dialogsActivity2 = DialogsActivity.this;
            if (dialogsActivity2.whiteActionBar && dialogsActivity2.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.setTranslationY(DialogsActivity.this.topPadding - DialogsActivity.this.lastMeasuredTopPadding);
            } else {
                requestLayout();
            }
        }

        public boolean checkTabsAnimationInProgress() {
            boolean z;
            if (DialogsActivity.this.tabsAnimationInProgress) {
                if (DialogsActivity.this.backAnimation) {
                    if (Math.abs(DialogsActivity.this.viewPages[0].getTranslationX()) < 1.0f) {
                        DialogsActivity.this.viewPages[0].setTranslationX(0.0f);
                        DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() * (DialogsActivity.this.animatingForward ? 1 : -1));
                        z = true;
                    }
                    z = false;
                } else {
                    if (Math.abs(DialogsActivity.this.viewPages[1].getTranslationX()) < 1.0f) {
                        DialogsActivity.this.viewPages[0].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() * (DialogsActivity.this.animatingForward ? -1 : 1));
                        DialogsActivity.this.viewPages[1].setTranslationX(0.0f);
                        z = true;
                    }
                    z = false;
                }
                if (z) {
                    DialogsActivity.this.showScrollbars(true);
                    if (DialogsActivity.this.tabsAnimation != null) {
                        DialogsActivity.this.tabsAnimation.cancel();
                        DialogsActivity.this.tabsAnimation = null;
                    }
                    DialogsActivity.this.tabsAnimationInProgress = false;
                }
                return DialogsActivity.this.tabsAnimationInProgress;
            }
            return false;
        }

        public int getActionBarFullHeight() {
            float height = ((BaseFragment) DialogsActivity.this).actionBar.getHeight();
            float f = 0.0f;
            float measuredHeight = (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() == 8) ? 0.0f : DialogsActivity.this.filterTabsView.getMeasuredHeight() - ((1.0f - DialogsActivity.this.filterTabsProgress) * DialogsActivity.this.filterTabsView.getMeasuredHeight());
            if (DialogsActivity.this.searchTabsView != null && DialogsActivity.this.searchTabsView.getVisibility() != 8) {
                f = DialogsActivity.this.searchTabsView.getMeasuredHeight();
            }
            return (int) (height + (measuredHeight * (1.0f - DialogsActivity.this.searchAnimationProgress)) + (f * DialogsActivity.this.searchAnimationProgress));
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            if ((view == DialogsActivity.this.fragmentContextView && DialogsActivity.this.fragmentContextView.isCallStyle()) || view == DialogsActivity.this.blurredView) {
                return true;
            }
            if (view != DialogsActivity.this.viewPages[0] && ((DialogsActivity.this.viewPages.length <= 1 || view != DialogsActivity.this.viewPages[1]) && view != DialogsActivity.this.fragmentContextView && view != DialogsActivity.this.fragmentLocationContextView && view != DialogsActivity.this.dialogsHintCell)) {
                if (view == ((BaseFragment) DialogsActivity.this).actionBar && DialogsActivity.this.slideFragmentProgress != 1.0f) {
                    canvas.save();
                    DialogsActivity dialogsActivity = DialogsActivity.this;
                    if (dialogsActivity.slideFragmentLite) {
                        canvas.translate((dialogsActivity.isDrawerTransition ? 1 : -1) * AndroidUtilities.dp(40.0f) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                    } else {
                        float f = 1.0f - ((1.0f - dialogsActivity.slideFragmentProgress) * 0.05f);
                        canvas.translate((dialogsActivity.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        canvas.scale(f, f, DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f, (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + (ActionBar.getCurrentActionBarHeight() / 2.0f));
                    }
                    boolean drawChild = super.drawChild(canvas, view, j);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j);
            }
            canvas.save();
            canvas.clipRect(0.0f, (-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight(), getMeasuredWidth(), getMeasuredHeight());
            DialogsActivity dialogsActivity2 = DialogsActivity.this;
            float f2 = dialogsActivity2.slideFragmentProgress;
            if (f2 != 1.0f) {
                if (dialogsActivity2.slideFragmentLite) {
                    canvas.translate((dialogsActivity2.isDrawerTransition ? 1 : -1) * AndroidUtilities.dp(40.0f) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                } else {
                    float f3 = 1.0f - ((1.0f - f2) * 0.05f);
                    canvas.translate((dialogsActivity2.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                    canvas.scale(f3, f3, DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f, (-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight());
                }
            }
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            int y;
            Paint paint;
            int i;
            int actionBarFullHeight = getActionBarFullHeight();
            if (!((BaseFragment) DialogsActivity.this).inPreviewMode) {
                y = (int) ((-getY()) + ((BaseFragment) DialogsActivity.this).actionBar.getY());
            } else {
                y = AndroidUtilities.statusBarHeight;
            }
            int i2 = y;
            int i3 = i2 + actionBarFullHeight;
            DialogsActivity.this.rightSlidingDialogContainer.setCurrentTop(i3);
            DialogsActivity dialogsActivity = DialogsActivity.this;
            if (dialogsActivity.whiteActionBar) {
                if (dialogsActivity.searchAnimationProgress != 1.0f) {
                    if (DialogsActivity.this.searchAnimationProgress == 0.0f && DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                        DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                    }
                } else {
                    this.actionBarSearchPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    if (DialogsActivity.this.searchTabsView != null) {
                        DialogsActivity.this.searchTabsView.setTranslationY(0.0f);
                        DialogsActivity.this.searchTabsView.setAlpha(1.0f);
                        if (DialogsActivity.this.filtersView != null) {
                            DialogsActivity.this.filtersView.setTranslationY(0.0f);
                            DialogsActivity.this.filtersView.setAlpha(1.0f);
                        }
                    }
                }
                Rect rect = AndroidUtilities.rectTmp2;
                rect.set(0, i2, getMeasuredWidth(), i3);
                drawBlurRect(canvas, 0.0f, rect, DialogsActivity.this.searchAnimationProgress == 1.0f ? this.actionBarSearchPaint : DialogsActivity.this.actionBarDefaultPaint, true);
                if (DialogsActivity.this.searchAnimationProgress > 0.0f && DialogsActivity.this.searchAnimationProgress < 1.0f) {
                    this.actionBarSearchPaint.setColor(ColorUtils.blendARGB(Theme.getColor(DialogsActivity.this.folderId == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived), Theme.getColor(Theme.key_windowBackgroundWhite), DialogsActivity.this.searchAnimationProgress));
                    if (DialogsActivity.this.searchIsShowed || !DialogsActivity.this.searchWasFullyShowed) {
                        canvas.save();
                        canvas.clipRect(0, i2, getMeasuredWidth(), i3);
                        drawBlurCircle(canvas, 0.0f, getMeasuredWidth() - AndroidUtilities.dp(24.0f), (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ((((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() - i) / 2.0f), getMeasuredWidth() * 1.3f * DialogsActivity.this.searchAnimationProgress, this.actionBarSearchPaint, true);
                        canvas.restore();
                    } else {
                        rect.set(0, i2, getMeasuredWidth(), i3);
                        drawBlurRect(canvas, 0.0f, rect, this.actionBarSearchPaint, true);
                    }
                    if (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                        DialogsActivity.this.filterTabsView.setTranslationY(actionBarFullHeight - (((BaseFragment) DialogsActivity.this).actionBar.getHeight() + DialogsActivity.this.filterTabsView.getMeasuredHeight()));
                    }
                    if (DialogsActivity.this.searchTabsView != null) {
                        float height = actionBarFullHeight - (((BaseFragment) DialogsActivity.this).actionBar.getHeight() + DialogsActivity.this.searchTabsView.getMeasuredHeight());
                        float f = DialogsActivity.this.searchAnimationTabsDelayedCrossfade ? DialogsActivity.this.searchAnimationProgress < 0.5f ? 0.0f : (DialogsActivity.this.searchAnimationProgress - 0.5f) / 0.5f : DialogsActivity.this.searchAnimationProgress;
                        DialogsActivity.this.searchTabsView.setTranslationY(height);
                        DialogsActivity.this.searchTabsView.setAlpha(f);
                        if (DialogsActivity.this.filtersView != null) {
                            DialogsActivity.this.filtersView.setTranslationY(height);
                            DialogsActivity.this.filtersView.setAlpha(f);
                        }
                    }
                }
            } else if (!((BaseFragment) dialogsActivity).inPreviewMode) {
                if (DialogsActivity.this.progressToActionMode > 0.0f) {
                    this.actionBarSearchPaint.setColor(ColorUtils.blendARGB(Theme.getColor(DialogsActivity.this.folderId == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived), Theme.getColor(Theme.key_windowBackgroundWhite), DialogsActivity.this.progressToActionMode));
                    Rect rect2 = AndroidUtilities.rectTmp2;
                    rect2.set(0, i2, getMeasuredWidth(), i3);
                    drawBlurRect(canvas, 0.0f, rect2, this.actionBarSearchPaint, true);
                } else {
                    Rect rect3 = AndroidUtilities.rectTmp2;
                    rect3.set(0, i2, getMeasuredWidth(), i3);
                    drawBlurRect(canvas, 0.0f, rect3, DialogsActivity.this.actionBarDefaultPaint, true);
                }
            }
            DialogsActivity.this.tabsYOffset = 0.0f;
            if ((DialogsActivity.this.filtersTabAnimator == null && !DialogsActivity.this.rightSlidingDialogContainer.hasFragment()) || DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                if (DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                    DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
                    DialogsActivity.this.filterTabsView.setAlpha(1.0f);
                }
            } else {
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                dialogsActivity2.tabsYOffset = (-(1.0f - dialogsActivity2.filterTabsProgress)) * DialogsActivity.this.filterTabsView.getMeasuredHeight();
                DialogsActivity.this.filterTabsView.setTranslationY(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY() + DialogsActivity.this.tabsYOffset);
                DialogsActivity.this.filterTabsView.setAlpha(DialogsActivity.this.filterTabsProgress);
                DialogsActivity.this.viewPages[0].setTranslationY((-(1.0f - DialogsActivity.this.filterTabsProgress)) * DialogsActivity.this.filterTabsMoveFrom);
            }
            DialogsActivity.this.updateContextViewPosition();
            super.dispatchDraw(canvas);
            DialogsActivity dialogsActivity3 = DialogsActivity.this;
            if (dialogsActivity3.whiteActionBar && dialogsActivity3.searchAnimationProgress > 0.0f && DialogsActivity.this.searchAnimationProgress < 1.0f && DialogsActivity.this.searchTabsView != null) {
                this.windowBackgroundPaint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                this.windowBackgroundPaint.setAlpha((int) (paint.getAlpha() * DialogsActivity.this.searchAnimationProgress));
                canvas.drawRect(0.0f, i3, getMeasuredWidth(), i2 + ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + DialogsActivity.this.searchTabsView.getMeasuredHeight(), this.windowBackgroundPaint);
            }
            if (((BaseFragment) DialogsActivity.this).parentLayout != null && ((BaseFragment) DialogsActivity.this).actionBar != null && !((BaseFragment) DialogsActivity.this).actionBar.getCastShadows()) {
                int y2 = (int) (((BaseFragment) DialogsActivity.this).actionBar.getY() + getActionBarFullHeight());
                ((BaseFragment) DialogsActivity.this).parentLayout.drawHeaderShadow(canvas, (int) ((1.0f - DialogsActivity.this.searchAnimationProgress) * 255.0f), y2);
                if (DialogsActivity.this.searchAnimationProgress > 0.0f) {
                    if (DialogsActivity.this.searchAnimationProgress < 1.0f) {
                        int alpha = Theme.dividerPaint.getAlpha();
                        Theme.dividerPaint.setAlpha((int) (alpha * DialogsActivity.this.searchAnimationProgress));
                        float f2 = y2;
                        canvas.drawLine(0.0f, f2, getMeasuredWidth(), f2, Theme.dividerPaint);
                        Theme.dividerPaint.setAlpha(alpha);
                    } else {
                        float f3 = y2;
                        canvas.drawLine(0.0f, f3, getMeasuredWidth(), f3, Theme.dividerPaint);
                    }
                }
            }
            if (DialogsActivity.this.fragmentContextView != null && DialogsActivity.this.fragmentContextView.isCallStyle()) {
                canvas.save();
                canvas.translate(DialogsActivity.this.fragmentContextView.getX(), DialogsActivity.this.fragmentContextView.getY());
                DialogsActivity dialogsActivity4 = DialogsActivity.this;
                float f4 = dialogsActivity4.slideFragmentProgress;
                if (f4 != 1.0f) {
                    if (dialogsActivity4.slideFragmentLite) {
                        canvas.translate((dialogsActivity4.isDrawerTransition ? 1 : -1) * AndroidUtilities.dp(40.0f) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                    } else {
                        float f5 = 1.0f - ((1.0f - f4) * 0.05f);
                        canvas.translate((dialogsActivity4.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - DialogsActivity.this.slideFragmentProgress), 0.0f);
                        canvas.scale(f5, 1.0f, DialogsActivity.this.isDrawerTransition ? getMeasuredWidth() : 0.0f, DialogsActivity.this.fragmentContextView.getY());
                    }
                }
                DialogsActivity.this.fragmentContextView.setDrawOverlay(true);
                DialogsActivity.this.fragmentContextView.draw(canvas);
                DialogsActivity.this.fragmentContextView.setDrawOverlay(false);
                canvas.restore();
            }
            if (DialogsActivity.this.blurredView == null || DialogsActivity.this.blurredView.getVisibility() != 0) {
                return;
            }
            if (DialogsActivity.this.blurredView.getAlpha() != 1.0f) {
                if (DialogsActivity.this.blurredView.getAlpha() != 0.0f) {
                    canvas.saveLayerAlpha(DialogsActivity.this.blurredView.getLeft(), DialogsActivity.this.blurredView.getTop(), DialogsActivity.this.blurredView.getRight(), DialogsActivity.this.blurredView.getBottom(), (int) (DialogsActivity.this.blurredView.getAlpha() * 255.0f), 31);
                    canvas.translate(DialogsActivity.this.blurredView.getLeft(), DialogsActivity.this.blurredView.getTop());
                    DialogsActivity.this.blurredView.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            }
            DialogsActivity.this.blurredView.draw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            int size2 = View.MeasureSpec.getSize(i2);
            boolean z = size2 > size;
            setMeasuredDimension(size, size2);
            int paddingTop = size2 - getPaddingTop();
            if (DialogsActivity.this.doneItem != null) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) DialogsActivity.this.doneItem.getLayoutParams();
                layoutParams.topMargin = ((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0;
                layoutParams.height = ActionBar.getCurrentActionBarHeight();
            }
            measureChildWithMargins(((BaseFragment) DialogsActivity.this).actionBar, i, 0, i2, 0);
            int measureKeyboardHeight = measureKeyboardHeight();
            int childCount = getChildCount();
            float f = 0.0f;
            if (DialogsActivity.this.commentView != null) {
                measureChildWithMargins(DialogsActivity.this.commentView, i, 0, i2, 0);
                Object tag = DialogsActivity.this.commentView.getTag();
                if (tag != null && tag.equals(2)) {
                    if (measureKeyboardHeight <= AndroidUtilities.dp(20.0f) && !AndroidUtilities.isInMultiwindow) {
                        paddingTop -= DialogsActivity.this.commentView.getEmojiPadding();
                    }
                    this.inputFieldHeight = DialogsActivity.this.commentView.getMeasuredHeight();
                } else {
                    this.inputFieldHeight = 0;
                }
                if (DialogsActivity.this.commentView.isPopupShowing()) {
                    ((BaseFragment) DialogsActivity.this).fragmentView.setTranslationY(0.0f);
                    for (int i3 = 0; i3 < DialogsActivity.this.viewPages.length; i3++) {
                        if (DialogsActivity.this.viewPages[i3] != null) {
                            DialogsActivity.this.viewPages[i3].setTranslationY(0.0f);
                        }
                    }
                    if (!DialogsActivity.this.onlySelect) {
                        ((BaseFragment) DialogsActivity.this).actionBar.setTranslationY(0.0f);
                        if (DialogsActivity.this.topBulletin != null) {
                            DialogsActivity.this.topBulletin.updatePosition();
                        }
                    }
                    DialogsActivity.this.searchViewPager.setTranslationY(0.0f);
                }
            }
            int i4 = 0;
            while (i4 < childCount) {
                View childAt = getChildAt(i4);
                if (childAt != null && childAt.getVisibility() != 8 && childAt != DialogsActivity.this.commentView && childAt != ((BaseFragment) DialogsActivity.this).actionBar) {
                    if (childAt instanceof DatabaseMigrationHint) {
                        childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), (((View.MeasureSpec.getSize(i2) + measureKeyboardHeight) - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight()), 1073741824));
                    } else if (!(childAt instanceof ViewPage)) {
                        if (childAt == DialogsActivity.this.searchViewPager) {
                            DialogsActivity.this.searchViewPager.setTranslationY(0.0f);
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), ((((View.MeasureSpec.getSize(i2) + measureKeyboardHeight) - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - ((!DialogsActivity.this.onlySelect || DialogsActivity.this.initialDialogsType == 3) ? ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() : 0)) - DialogsActivity.this.topPadding) - (DialogsActivity.this.searchTabsView == null ? 0 : AndroidUtilities.dp(44.0f)), 1073741824));
                            childAt.setPivotX(childAt.getMeasuredWidth() / 2);
                        } else if (DialogsActivity.this.commentView != null && DialogsActivity.this.commentView.isPopupView(childAt)) {
                            if (AndroidUtilities.isInMultiwindow) {
                                if (AndroidUtilities.isTablet()) {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), ((paddingTop - this.inputFieldHeight) - AndroidUtilities.statusBarHeight) + getPaddingTop()), 1073741824));
                                } else {
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((paddingTop - this.inputFieldHeight) - AndroidUtilities.statusBarHeight) + getPaddingTop(), 1073741824));
                                }
                            } else {
                                childAt.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getLayoutParams().height, 1073741824));
                            }
                        } else {
                            if (childAt == DialogsActivity.this.rightSlidingDialogContainer) {
                                int size3 = View.MeasureSpec.getSize(i2);
                                DialogsActivity dialogsActivity = DialogsActivity.this;
                                int i5 = (dialogsActivity.isSlideBackTransition || dialogsActivity.isDrawerTransition) ? (int) (size3 * 0.05f) : 0;
                                dialogsActivity.rightSlidingDialogContainer.setTransitionPaddingBottom(i5);
                                childAt.measure(i, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), size3 + i5), 1073741824));
                            } else {
                                measureChildWithMargins(childAt, i, 0, i2, 0);
                            }
                            i4++;
                            f = 0.0f;
                        }
                        i4++;
                        f = 0.0f;
                    } else {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
                        int dp = ((paddingTop - this.inputFieldHeight) + AndroidUtilities.dp(2.0f)) - DialogsActivity.this.topPadding;
                        if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                            if (!DialogsActivity.this.onlySelect || DialogsActivity.this.initialDialogsType == 3) {
                                dp -= ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
                            }
                        } else {
                            dp -= AndroidUtilities.dp(44.0f);
                            if (DialogsActivity.this.rightSlidingDialogContainer.hasFragment()) {
                                dp += AndroidUtilities.dp(44.0f);
                            }
                        }
                        if (DialogsActivity.this.dialogsHintCell != null) {
                            dp -= DialogsActivity.this.dialogsHintCell.height();
                        }
                        if (DialogsActivity.this.filtersTabAnimator != null && DialogsActivity.this.filterTabsView != null && DialogsActivity.this.filterTabsView.getVisibility() == 0) {
                            dp = (int) (dp + DialogsActivity.this.filterTabsMoveFrom);
                        } else {
                            childAt.setTranslationY(f);
                        }
                        DialogsActivity dialogsActivity2 = DialogsActivity.this;
                        int i6 = (dialogsActivity2.isSlideBackTransition || dialogsActivity2.isDrawerTransition) ? (int) (dp * 0.05f) : 0;
                        childAt.setPadding(childAt.getPaddingLeft(), childAt.getPaddingTop(), childAt.getPaddingRight(), i6);
                        childAt.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(Math.max(AndroidUtilities.dp(10.0f), dp + i6), 1073741824));
                        childAt.setPivotX(childAt.getMeasuredWidth() / 2);
                    }
                }
                i4++;
                f = 0.0f;
            }
            if (z != this.wasPortrait) {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsActivity.ContentView.this.lambda$onMeasure$0();
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
        public void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
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
            float f;
            float f2;
            float measuredWidth;
            int measuredWidth2;
            if (((BaseFragment) DialogsActivity.this).parentLayout == null || DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.isEditing() || DialogsActivity.this.searching || DialogsActivity.this.rightSlidingDialogContainer.hasFragment() || ((BaseFragment) DialogsActivity.this).parentLayout.checkTransitionAnimation() || ((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode() || ((BaseFragment) DialogsActivity.this).parentLayout.isPreviewOpenAnimationInProgress() || ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().isDrawerOpened() || !((motionEvent == null || DialogsActivity.this.startedTracking || motionEvent.getY() > ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY()) && (DialogsActivity.this.initialDialogsType == 3 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 5 || (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 2 && DialogsActivity.this.viewPages[0] != null && (DialogsActivity.this.viewPages[0].dialogsAdapter.getDialogsType() == 7 || DialogsActivity.this.viewPages[0].dialogsAdapter.getDialogsType() == 8))))) {
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
                ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(false);
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
                int abs = Math.abs(((int) motionEvent.getY()) - this.startedTrackingY);
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
                        float abs2 = Math.abs(x) / DialogsActivity.this.viewPages[0].getMeasuredWidth();
                        if (!DialogsActivity.this.viewPages[1].isLocked || abs2 <= 0.3f) {
                            DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[1].selectedType, abs2);
                        } else {
                            dispatchTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
                            DialogsActivity.this.filterTabsView.shakeLock(DialogsActivity.this.viewPages[1].selectedType);
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    DialogsActivity.ContentView.this.lambda$onTouchEvent$1();
                                }
                            }, 200L);
                            return false;
                        }
                    }
                } else {
                    float pixelsInCM = AndroidUtilities.getPixelsInCM(0.3f, true);
                    int x2 = (int) (motionEvent.getX() - this.startedTrackingX);
                    if (Math.abs(x2) >= pixelsInCM && Math.abs(x2) > abs) {
                        prepareForMoving(motionEvent, x < 0);
                    }
                }
            } else if (motionEvent == null || (motionEvent.getPointerId(0) == this.startedTrackingPointerId && (motionEvent.getAction() == 3 || motionEvent.getAction() == 1 || motionEvent.getAction() == 6))) {
                this.velocityTracker.computeCurrentVelocity(1000, DialogsActivity.this.maximumVelocity);
                if (motionEvent == null || motionEvent.getAction() == 3) {
                    f = 0.0f;
                    f2 = 0.0f;
                } else {
                    f = this.velocityTracker.getXVelocity();
                    f2 = this.velocityTracker.getYVelocity();
                    if (!DialogsActivity.this.startedTracking && Math.abs(f) >= 3000.0f && Math.abs(f) > Math.abs(f2)) {
                        prepareForMoving(motionEvent, f < 0.0f);
                    }
                }
                if (DialogsActivity.this.startedTracking) {
                    float x3 = DialogsActivity.this.viewPages[0].getX();
                    DialogsActivity.this.tabsAnimation = new AnimatorSet();
                    if (DialogsActivity.this.viewPages[1].isLocked) {
                        DialogsActivity.this.backAnimation = true;
                    } else if (DialogsActivity.this.additionalOffset != 0.0f) {
                        if (Math.abs(f) <= 1500.0f) {
                            if (DialogsActivity.this.animatingForward) {
                                DialogsActivity dialogsActivity5 = DialogsActivity.this;
                                dialogsActivity5.backAnimation = dialogsActivity5.viewPages[1].getX() > ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                            } else {
                                DialogsActivity dialogsActivity6 = DialogsActivity.this;
                                dialogsActivity6.backAnimation = dialogsActivity6.viewPages[0].getX() < ((float) (DialogsActivity.this.viewPages[0].getMeasuredWidth() >> 1));
                            }
                        } else {
                            DialogsActivity dialogsActivity7 = DialogsActivity.this;
                            dialogsActivity7.backAnimation = !dialogsActivity7.animatingForward ? f >= 0.0f : f <= 0.0f;
                        }
                    } else {
                        DialogsActivity.this.backAnimation = Math.abs(x3) < ((float) DialogsActivity.this.viewPages[0].getMeasuredWidth()) / 3.0f && (Math.abs(f) < 3500.0f || Math.abs(f) < Math.abs(f2));
                    }
                    if (!DialogsActivity.this.backAnimation) {
                        measuredWidth = DialogsActivity.this.viewPages[0].getMeasuredWidth() - Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, -DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                        } else {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, DialogsActivity.this.viewPages[0].getMeasuredWidth()), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, 0.0f));
                        }
                    } else {
                        measuredWidth = Math.abs(x3);
                        if (DialogsActivity.this.animatingForward) {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        } else {
                            DialogsActivity.this.tabsAnimation.playTogether(ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[0], View.TRANSLATION_X, 0.0f), ObjectAnimator.ofFloat(DialogsActivity.this.viewPages[1], View.TRANSLATION_X, -DialogsActivity.this.viewPages[1].getMeasuredWidth()));
                        }
                    }
                    DialogsActivity.this.tabsAnimation.setInterpolator(DialogsActivity.interpolator);
                    int measuredWidth3 = getMeasuredWidth();
                    float f3 = measuredWidth3 / 2;
                    float distanceInfluenceForSnapDuration = f3 + (AndroidUtilities.distanceInfluenceForSnapDuration(Math.min(1.0f, (measuredWidth * 1.0f) / measuredWidth3)) * f3);
                    float abs3 = Math.abs(f);
                    if (abs3 > 0.0f) {
                        measuredWidth2 = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs3) * 1000.0f) * 4;
                    } else {
                        measuredWidth2 = (int) (((measuredWidth / getMeasuredWidth()) + 1.0f) * 100.0f);
                    }
                    DialogsActivity.this.tabsAnimation.setDuration(Math.max((int) ImageReceiver.DEFAULT_CROSSFADE_DURATION, Math.min(measuredWidth2, 600)));
                    DialogsActivity.this.tabsAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            DialogsActivity.this.tabsAnimation = null;
                            if (!DialogsActivity.this.backAnimation) {
                                ViewPage viewPage3 = DialogsActivity.this.viewPages[0];
                                DialogsActivity.this.viewPages[0] = DialogsActivity.this.viewPages[1];
                                DialogsActivity.this.viewPages[1] = viewPage3;
                                DialogsActivity.this.filterTabsView.selectTabWithId(DialogsActivity.this.viewPages[0].selectedType, 1.0f);
                                DialogsActivity.this.updateCounters(false);
                                DialogsActivity.this.viewPages[0].dialogsAdapter.resume();
                                DialogsActivity.this.viewPages[1].dialogsAdapter.pause();
                            }
                            DialogsActivity dialogsActivity8 = DialogsActivity.this;
                            dialogsActivity8.isFirstTab = dialogsActivity8.viewPages[0].selectedType == DialogsActivity.this.filterTabsView.getFirstTabId();
                            DialogsActivity.this.updateDrawerSwipeEnabled();
                            DialogsActivity.this.viewPages[1].setVisibility(8);
                            DialogsActivity.this.showScrollbars(true);
                            DialogsActivity.this.tabsAnimationInProgress = false;
                            DialogsActivity.this.maybeStartTracking = false;
                            ((BaseFragment) DialogsActivity.this).actionBar.setEnabled(true);
                            DialogsActivity.this.filterTabsView.setEnabled(true);
                            DialogsActivity dialogsActivity9 = DialogsActivity.this;
                            dialogsActivity9.checkListLoad(dialogsActivity9.viewPages[0]);
                        }
                    });
                    DialogsActivity.this.tabsAnimation.start();
                    DialogsActivity.this.tabsAnimationInProgress = true;
                    DialogsActivity.this.startedTracking = false;
                } else {
                    DialogsActivity dialogsActivity8 = DialogsActivity.this;
                    dialogsActivity8.isFirstTab = dialogsActivity8.viewPages[0].selectedType == DialogsActivity.this.filterTabsView.getFirstTabId();
                    DialogsActivity.this.updateDrawerSwipeEnabled();
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
            DialogsActivity.this.showDialog(new LimitReachedBottomSheet(DialogsActivity.this, getContext(), 3, ((BaseFragment) DialogsActivity.this).currentAccount));
        }

        @Override
        public void drawList(Canvas canvas, boolean z) {
            if (DialogsActivity.this.searchIsShowed) {
                if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0) {
                    return;
                }
                DialogsActivity.this.searchViewPager.drawForBlur(canvas);
                return;
            }
            for (int i = 0; i < DialogsActivity.this.viewPages.length; i++) {
                if (DialogsActivity.this.viewPages[i] != null && DialogsActivity.this.viewPages[i].getVisibility() == 0) {
                    for (int i2 = 0; i2 < DialogsActivity.this.viewPages[i].listView.getChildCount(); i2++) {
                        View childAt = DialogsActivity.this.viewPages[i].listView.getChildAt(i2);
                        if (childAt.getY() < DialogsActivity.this.viewPages[i].listView.blurTopPadding + AndroidUtilities.dp(100.0f)) {
                            int save = canvas.save();
                            canvas.translate(DialogsActivity.this.viewPages[i].getX(), DialogsActivity.this.viewPages[i].getY() + DialogsActivity.this.viewPages[i].listView.getY() + childAt.getY());
                            if (childAt instanceof DialogCell) {
                                DialogCell dialogCell = (DialogCell) childAt;
                                if (!dialogCell.isFolderCell() || !SharedConfig.archiveHidden) {
                                    dialogCell.drawingForBlur = true;
                                    dialogCell.draw(canvas);
                                    dialogCell.drawingForBlur = false;
                                }
                            } else {
                                childAt.draw(canvas);
                            }
                            canvas.restoreToCount(save);
                        }
                    }
                }
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            if (DialogsActivity.this.statusDrawable != null) {
                DialogsActivity.this.statusDrawable.attach();
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            if (DialogsActivity.this.statusDrawable != null) {
                DialogsActivity.this.statusDrawable.detach();
            }
        }
    }

    public class DialogsRecyclerView extends BlurredRecyclerView {
        float animateFromSelectorPosition;
        boolean animateSwitchingSelector;
        private RecyclerListView animationSupportListView;
        LongSparseArray<View> animationSupportViewsByDialogId;
        private int appliedPaddingTop;
        private boolean firstLayout;
        private boolean ignoreLayout;
        float lastDrawSelectorY;
        private int lastListPadding;
        Paint paint;
        private final ViewPage parentPage;
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
            View findViewByPosition;
            DialogsActivity.viewOffset = f;
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
            return DialogsActivity.viewOffset;
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
        public void dispatchDraw(android.graphics.Canvas r23) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.DialogsRecyclerView.dispatchDraw(android.graphics.Canvas):void");
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
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
        }

        @Override
        public void setAdapter(RecyclerView.Adapter adapter) {
            super.setAdapter(adapter);
            this.firstLayout = true;
        }

        @Override
        public void onMeasure(int i, int i2) {
            int measuredHeight;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition;
            if (DialogsActivity.this.onlySelect && DialogsActivity.this.initialDialogsType != 3) {
                measuredHeight = 0;
            } else if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                measuredHeight = ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight();
            } else {
                measuredHeight = AndroidUtilities.dp(44.0f);
            }
            int findFirstVisibleItemPosition = this.parentPage.layoutManager.findFirstVisibleItemPosition();
            if (findFirstVisibleItemPosition != -1 && this.parentPage.itemTouchhelper.isIdle() && (findViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null) {
                int top = findViewHolderForAdapterPosition.itemView.getTop();
                if (this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive() && this.parentPage.archivePullViewState == 2) {
                    findFirstVisibleItemPosition = Math.max(1, findFirstVisibleItemPosition);
                }
                this.ignoreLayout = true;
                this.parentPage.layoutManager.scrollToPositionWithOffset(findFirstVisibleItemPosition, (int) ((top - this.lastListPadding) + DialogsActivity.this.scrollAdditionalOffset));
                this.ignoreLayout = false;
            }
            if (!DialogsActivity.this.onlySelect || DialogsActivity.this.initialDialogsType == 3) {
                this.ignoreLayout = true;
                if (DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) {
                    measuredHeight = (!((BaseFragment) DialogsActivity.this).inPreviewMode || Build.VERSION.SDK_INT < 21) ? 0 : AndroidUtilities.statusBarHeight;
                } else {
                    measuredHeight = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) DialogsActivity.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                }
                setTopGlowOffset(measuredHeight);
                setPadding(0, measuredHeight, 0, 0);
                this.parentPage.progressView.setPaddingTop(measuredHeight);
                this.ignoreLayout = false;
            }
            if (this.firstLayout && DialogsActivity.this.getMessagesController().dialogsLoaded) {
                if (this.parentPage.dialogsType == 0 && DialogsActivity.this.hasHiddenArchive()) {
                    this.ignoreLayout = true;
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(1, 0);
                    this.ignoreLayout = false;
                }
                this.firstLayout = false;
            }
            super.onMeasure(i, i2);
            if (DialogsActivity.this.onlySelect || this.appliedPaddingTop == measuredHeight || DialogsActivity.this.viewPages == null || DialogsActivity.this.viewPages.length <= 1 || DialogsActivity.this.startedTracking) {
                return;
            }
            if ((DialogsActivity.this.tabsAnimation != null && DialogsActivity.this.tabsAnimation.isRunning()) || DialogsActivity.this.tabsAnimationInProgress || DialogsActivity.this.filterTabsView == null) {
                return;
            }
            DialogsActivity.this.filterTabsView.isAnimatingIndicator();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            this.lastListPadding = getPaddingTop();
            DialogsActivity.this.scrollAdditionalOffset = 0.0f;
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
                    smoothScrollBy(0, dialogCell.getMeasuredHeight() + (dialogCell.getTop() - getPaddingTop()), CubicBezierInterpolator.EASE_OUT);
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
            LinearLayoutManager linearLayoutManager;
            int findFirstVisibleItemPosition;
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
                            TLRPC$Dialog tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
                            if (tLRPC$Dialog != null) {
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
                                            DialogsActivity.this.canPinCount = !DialogsActivity.this.isDialogPinned(tLRPC$Dialog) ? 1 : 0;
                                            DialogsActivity.this.performSelectedDialogsAction(arrayList2, 100, true, false);
                                        }
                                    } else if (!DialogsActivity.this.getMessagesController().isDialogMuted(dialogId, 0)) {
                                        NotificationsController.getInstance(UserConfig.selectedAccount).setDialogNotificationsSettings(dialogId, 0, 3);
                                        if (BulletinFactory.canShowBulletin(DialogsActivity.this)) {
                                            BulletinFactory.createMuteBulletin(DialogsActivity.this, 3).show();
                                        }
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        arrayList3.add(Long.valueOf(dialogId));
                                        DialogsActivity dialogsActivity = DialogsActivity.this;
                                        dialogsActivity.canMuteCount = !MessagesController.getInstance(((BaseFragment) dialogsActivity).currentAccount).isDialogMuted(dialogId, 0);
                                        DialogsActivity dialogsActivity2 = DialogsActivity.this;
                                        dialogsActivity2.canUnmuteCount = dialogsActivity2.canMuteCount > 0 ? 0 : 1;
                                        DialogsActivity.this.performSelectedDialogsAction(arrayList3, 104, true, false);
                                    }
                                } else {
                                    ArrayList arrayList4 = new ArrayList();
                                    arrayList4.add(Long.valueOf(dialogId));
                                    DialogsActivity.this.canReadCount = (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark) ? 1 : 0;
                                    DialogsActivity.this.performSelectedDialogsAction(arrayList4, FileLoader.MEDIA_DIR_VIDEO_PUBLIC, true, false);
                                }
                            }
                        }
                    }
                }
            }
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (this.parentPage.dialogsType == 0 && ((action == 1 || action == 3) && this.parentPage.archivePullViewState == 2 && DialogsActivity.this.hasHiddenArchive() && (findFirstVisibleItemPosition = (linearLayoutManager = (LinearLayoutManager) getLayoutManager()).findFirstVisibleItemPosition()) == 0)) {
                int paddingTop = getPaddingTop();
                View findViewByPosition = linearLayoutManager.findViewByPosition(findFirstVisibleItemPosition);
                int dp = (int) (AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f) * 0.85f);
                int top = (findViewByPosition.getTop() - paddingTop) + findViewByPosition.getMeasuredHeight();
                if (findViewByPosition instanceof DialogCell) {
                    long currentTimeMillis = System.currentTimeMillis() - DialogsActivity.this.startArchivePullingTime;
                    if (top < dp || currentTimeMillis < 200) {
                        DialogsActivity.this.disableActionBarScrolling = true;
                        smoothScrollBy(0, top, CubicBezierInterpolator.EASE_OUT_QUINT);
                        this.parentPage.archivePullViewState = 2;
                    } else if (this.parentPage.archivePullViewState != 1) {
                        if (getViewOffset() == 0.0f) {
                            DialogsActivity.this.disableActionBarScrolling = true;
                            smoothScrollBy(0, findViewByPosition.getTop() - paddingTop, CubicBezierInterpolator.EASE_OUT_QUINT);
                        }
                        if (!DialogsActivity.this.canShowHiddenArchive) {
                            DialogsActivity.this.canShowHiddenArchive = true;
                            performHapticFeedback(3, 2);
                            if (this.parentPage.pullForegroundDrawable != null) {
                                this.parentPage.pullForegroundDrawable.colorize(true);
                            }
                        }
                        ((DialogCell) findViewByPosition).startOutAnimation();
                        this.parentPage.archivePullViewState = 1;
                        if (AndroidUtilities.isAccessibilityScreenReaderEnabled()) {
                            AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.getString(R.string.AccDescrArchivedChatsShown));
                        }
                    }
                    if (getViewOffset() != 0.0f) {
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(getViewOffset(), 0.0f);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                            @Override
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                DialogsActivity.DialogsRecyclerView.this.lambda$onTouchEvent$0(valueAnimator);
                            }
                        });
                        ofFloat.setDuration(Math.max(100L, 350.0f - ((getViewOffset() / PullForegroundDrawable.getMaxOverscroll()) * 120.0f)));
                        ofFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                        setScrollEnabled(false);
                        ofFloat.addListener(new AnimatorListenerAdapter() {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                DialogsRecyclerView.this.setScrollEnabled(true);
                            }
                        });
                        ofFloat.start();
                    }
                }
            }
            return onTouchEvent;
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
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.allowSwipeDuringCurrentTouch = !((BaseFragment) dialogsActivity).actionBar.isActionModeShowed();
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public boolean allowSelectChildAtPosition(View view) {
            return !(view instanceof HeaderCell) || view.isClickable();
        }

        public void setOpenRightFragmentProgress(float f) {
            this.rightFragmentOpenedProgress = f;
            invalidate();
        }

        public void setAnimationSupportView(RecyclerListView recyclerListView, float f, boolean z) {
            RecyclerListView recyclerListView2 = recyclerListView == null ? this.animationSupportListView : this;
            if (recyclerListView2 == null) {
                this.animationSupportListView = recyclerListView;
                return;
            }
            int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            DialogCell dialogCell = null;
            DialogCell dialogCell2 = null;
            for (int i2 = 0; i2 < recyclerListView2.getChildCount(); i2++) {
                View childAt = recyclerListView2.getChildAt(i2);
                if (childAt instanceof DialogCell) {
                    DialogCell dialogCell3 = (DialogCell) childAt;
                    if (dialogCell3.getDialogId() == DialogsActivity.this.rightSlidingDialogContainer.getCurrentFragmetDialogId()) {
                        dialogCell = dialogCell3;
                    }
                    if (childAt.getTop() >= getPaddingTop() && dialogCell3.getDialogId() != 0 && childAt.getTop() < i) {
                        DialogCell dialogCell4 = (DialogCell) childAt;
                        i = dialogCell4.getTop();
                        dialogCell2 = dialogCell4;
                    }
                }
            }
            DialogCell dialogCell5 = (dialogCell == null || getAdapter().getItemCount() * AndroidUtilities.dp(70.0f) <= getMeasuredHeight() || ((float) (dialogCell2.getTop() - getPaddingTop())) <= ((float) (getMeasuredHeight() - getPaddingTop())) / 2.0f) ? dialogCell2 : dialogCell;
            this.animationSupportListView = recyclerListView;
            if (dialogCell5 != null) {
                if (recyclerListView != null) {
                    recyclerListView.setPadding(getPaddingLeft(), this.topPadding, getPaddingLeft(), getPaddingBottom());
                    DialogsAdapter dialogsAdapter = (DialogsAdapter) recyclerListView.getAdapter();
                    int findDialogPosition = dialogsAdapter.findDialogPosition(dialogCell5.getDialogId());
                    int top = (int) ((dialogCell5.getTop() - recyclerListView2.getPaddingTop()) + f);
                    if (findDialogPosition >= 0) {
                        ((LinearLayoutManager) recyclerListView.getLayoutManager()).scrollToPositionWithOffset(findDialogPosition, dialogsAdapter.fixScrollGap(this, findDialogPosition, top, this.parentPage.dialogsType == 0 && this.parentPage.archivePullViewState == 2 && DialogsActivity.this.hasHiddenArchive(), z));
                    }
                }
                int findDialogPosition2 = ((DialogsAdapter) getAdapter()).findDialogPosition(dialogCell5.getDialogId());
                int top2 = dialogCell5.getTop() - getPaddingTop();
                if (findDialogPosition2 >= 0) {
                    ((LinearLayoutManager) getLayoutManager()).scrollToPositionWithOffset(findDialogPosition2, top2);
                }
            }
        }
    }

    public class SwipeController extends ItemTouchHelper.Callback {
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
            TLRPC$Dialog tLRPC$Dialog;
            if (!DialogsActivity.this.waitingForDialogsAnimationEnd(this.parentPage) && ((((BaseFragment) DialogsActivity.this).parentLayout == null || !((BaseFragment) DialogsActivity.this).parentLayout.isInPreviewMode()) && !DialogsActivity.this.rightSlidingDialogContainer.hasFragment())) {
                if (!this.swipingFolder || !this.swipeFolderBack) {
                    if (!DialogsActivity.this.onlySelect && this.parentPage.isDefaultDialogType() && DialogsActivity.this.slidingView == null) {
                        View view = viewHolder.itemView;
                        if (view instanceof DialogCell) {
                            DialogCell dialogCell = (DialogCell) view;
                            long dialogId = dialogCell.getDialogId();
                            MessagesController.DialogFilter dialogFilter = null;
                            if (!((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed(null)) {
                                int i = DialogsActivity.this.initialDialogsType;
                                try {
                                    i = this.parentPage.dialogsAdapter.getDialogsType();
                                } catch (Exception unused) {
                                }
                                if ((DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 5) && DialogsActivity.this.allowSwipeDuringCurrentTouch && (((dialogId != DialogsActivity.this.getUserConfig().clientUserId && dialogId != 777000 && i != 7 && i != 8) || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 2) && (!DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) || DialogsActivity.this.getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA))) {
                                    boolean z = DialogsActivity.this.folderId == 0 && (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 3 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 4) && !DialogsActivity.this.rightSlidingDialogContainer.hasFragment();
                                    if (SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) == 1) {
                                        if (DialogsActivity.this.viewPages[0].dialogsType == 7 || DialogsActivity.this.viewPages[0].dialogsType == 8) {
                                            dialogFilter = DialogsActivity.this.getMessagesController().selectedDialogFilter[DialogsActivity.this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
                                        }
                                        if (dialogFilter != null && (dialogFilter.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) != 0 && (tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId)) != null && !dialogFilter.alwaysShow(((BaseFragment) DialogsActivity.this).currentAccount, tLRPC$Dialog) && (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark)) {
                                            z = false;
                                        }
                                    }
                                    this.swipeFolderBack = false;
                                    this.swipingFolder = (z && !DialogObject.isFolderDialogId(dialogCell.getDialogId())) || (SharedConfig.archiveHidden && DialogObject.isFolderDialogId(dialogCell.getDialogId()));
                                    dialogCell.setSliding(true);
                                    return ItemTouchHelper.Callback.makeMovementFlags(0, 4);
                                }
                            } else {
                                TLRPC$Dialog tLRPC$Dialog2 = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
                                if (!DialogsActivity.this.allowMoving || tLRPC$Dialog2 == null || !DialogsActivity.this.isDialogPinned(tLRPC$Dialog2) || DialogObject.isFolderDialogId(dialogId)) {
                                    return 0;
                                }
                                DialogsActivity.this.movingView = (DialogCell) viewHolder.itemView;
                                DialogsActivity.this.movingView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
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
            long dialogId;
            TLRPC$Dialog tLRPC$Dialog;
            View view = viewHolder2.itemView;
            if ((view instanceof DialogCell) && (tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get((dialogId = ((DialogCell) view).getDialogId()))) != null && DialogsActivity.this.isDialogPinned(tLRPC$Dialog) && !DialogObject.isFolderDialogId(dialogId)) {
                int adapterPosition = viewHolder.getAdapterPosition();
                int adapterPosition2 = viewHolder2.getAdapterPosition();
                if (this.parentPage.listView.getItemAnimator() == null) {
                    this.parentPage.listView.setItemAnimator(this.parentPage.dialogsItemAnimator);
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
            return false;
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
            final TLRPC$Dialog tLRPC$Dialog = DialogsActivity.this.getMessagesController().dialogs_dict.get(dialogId);
            if (tLRPC$Dialog == null) {
                return;
            }
            if (DialogsActivity.this.getMessagesController().isPromoDialog(dialogId, false) || DialogsActivity.this.folderId != 0 || SharedConfig.getChatSwipeAction(((BaseFragment) DialogsActivity.this).currentAccount) != 1) {
                DialogsActivity.this.slidingView = dialogCell;
                final int adapterPosition = viewHolder.getAdapterPosition();
                final int itemCount = this.parentPage.dialogsAdapter.getItemCount();
                Runnable runnable = new Runnable() {
                    @Override
                    public final void run() {
                        DialogsActivity.SwipeController.this.lambda$onSwiped$2(tLRPC$Dialog, itemCount, adapterPosition);
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
            ArrayList arrayList = new ArrayList();
            arrayList.add(Long.valueOf(dialogId));
            DialogsActivity.this.canReadCount = (tLRPC$Dialog.unread_count > 0 || tLRPC$Dialog.unread_mark) ? 1 : 0;
            DialogsActivity.this.performSelectedDialogsAction(arrayList, FileLoader.MEDIA_DIR_VIDEO_PUBLIC, true, false);
        }

        public void lambda$onSwiped$2(final TLRPC$Dialog tLRPC$Dialog, int i, int i2) {
            if (DialogsActivity.this.frozenDialogsList == null) {
                return;
            }
            DialogsActivity.this.frozenDialogsList.remove(tLRPC$Dialog);
            final int i3 = tLRPC$Dialog.pinnedNum;
            DialogsActivity.this.slidingView = null;
            this.parentPage.listView.invalidate();
            int findLastVisibleItemPosition = this.parentPage.layoutManager.findLastVisibleItemPosition();
            if (findLastVisibleItemPosition == i - 1) {
                this.parentPage.layoutManager.findViewByPosition(findLastVisibleItemPosition).requestLayout();
            }
            boolean z = false;
            if (!DialogsActivity.this.getMessagesController().isPromoDialog(tLRPC$Dialog.id, false)) {
                int addDialogToFolder = DialogsActivity.this.getMessagesController().addDialogToFolder(tLRPC$Dialog.id, DialogsActivity.this.folderId == 0 ? 1 : 0, -1, 0L);
                if (addDialogToFolder != 2 || i2 != 0) {
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    this.parentPage.updateList(true);
                }
                if (DialogsActivity.this.folderId == 0) {
                    if (addDialogToFolder == 2) {
                        this.parentPage.dialogsItemAnimator.prepareForRemove();
                        if (i2 == 0) {
                            DialogsActivity.this.setDialogsListFrozen(true);
                            this.parentPage.updateList(true);
                            DialogsActivity.this.checkAnimationFinished();
                        } else {
                            this.parentPage.updateList(true);
                            if (!SharedConfig.archiveHidden && this.parentPage.layoutManager.findFirstVisibleItemPosition() == 0) {
                                DialogsActivity.this.disableActionBarScrolling = true;
                                this.parentPage.listView.smoothScrollBy(0, -AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f));
                            }
                        }
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        DialogsActivity.this.frozenDialogsList.add(0, dialogsActivity.getDialogsArray(((BaseFragment) dialogsActivity).currentAccount, this.parentPage.dialogsType, DialogsActivity.this.folderId, false).get(0));
                    } else if (addDialogToFolder == 1) {
                        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.parentPage.listView.findViewHolderForAdapterPosition(0);
                        if (findViewHolderForAdapterPosition != null) {
                            View view = findViewHolderForAdapterPosition.itemView;
                            if (view instanceof DialogCell) {
                                DialogCell dialogCell = (DialogCell) view;
                                dialogCell.checkCurrentDialogIndex(true);
                                dialogCell.animateArchiveAvatar();
                            }
                        }
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                DialogsActivity.SwipeController.this.lambda$onSwiped$0();
                            }
                        }, 300L);
                    }
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    z = (globalMainSettings.getBoolean("archivehint_l", false) || SharedConfig.archiveHidden) ? true : true;
                    if (!z) {
                        globalMainSettings.edit().putBoolean("archivehint_l", true).commit();
                    }
                    UndoView undoView = DialogsActivity.this.getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(tLRPC$Dialog.id, z ? 2 : 3, null, new Runnable() {
                            @Override
                            public final void run() {
                                DialogsActivity.SwipeController.this.lambda$onSwiped$1(tLRPC$Dialog, i3);
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

        public void lambda$onSwiped$1(TLRPC$Dialog tLRPC$Dialog, int i) {
            DialogsActivity.this.dialogsListFrozen = true;
            DialogsActivity.this.getMessagesController().addDialogToFolder(tLRPC$Dialog.id, 0, i, 0L);
            DialogsActivity.this.dialogsListFrozen = false;
            ArrayList<TLRPC$Dialog> dialogs = DialogsActivity.this.getMessagesController().getDialogs(0);
            int indexOf = dialogs.indexOf(tLRPC$Dialog);
            if (indexOf >= 0) {
                ArrayList<TLRPC$Dialog> dialogs2 = DialogsActivity.this.getMessagesController().getDialogs(1);
                if (!dialogs2.isEmpty() || indexOf != 1) {
                    DialogsActivity.this.setDialogsListFrozen(true);
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    this.parentPage.updateList(true);
                    DialogsActivity.this.checkAnimationFinished();
                }
                if (dialogs2.isEmpty()) {
                    dialogs.remove(0);
                    if (indexOf == 1) {
                        DialogsActivity.this.setDialogsListFrozen(true);
                        this.parentPage.updateList(true);
                        DialogsActivity.this.checkAnimationFinished();
                        return;
                    }
                    DialogsActivity.this.frozenDialogsList.remove(0);
                    this.parentPage.dialogsItemAnimator.prepareForRemove();
                    this.parentPage.updateList(true);
                    return;
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
        this.initialSearchType = -1;
        this.isFirstTab = true;
        this.allowGlobalSearch = true;
        this.contactsAlpha = 1.0f;
        this.undoView = new UndoView[2];
        this.movingDialogFilters = new ArrayList<>();
        this.actionBarDefaultPaint = new Paint();
        this.actionModeViews = new ArrayList<>();
        this.rect = new RectF();
        this.paint = new Paint(1);
        this.textPaint = new TextPaint(1);
        this.askAboutContacts = true;
        this.floatingInterpolator = new AccelerateDecelerateInterpolator();
        this.checkPermission = true;
        this.resetDelegate = true;
        this.openedDialogId = new MessagesStorage.TopicKey();
        this.selectedDialogs = new ArrayList<>();
        this.notify = true;
        this.notificationsLocker = new AnimationNotificationsLocker();
        this.debugLastUpdateAction = -1;
        this.SCROLL_Y = new AnimationProperties.FloatProperty<DialogsActivity>("animationValue") {
            @Override
            public void setValue(DialogsActivity dialogsActivity, float f) {
                dialogsActivity.setScrollY(f);
            }

            @Override
            public Float get(DialogsActivity dialogsActivity) {
                return Float.valueOf(((BaseFragment) DialogsActivity.this).actionBar.getTranslationY());
            }
        };
        this.scrollBarVisible = true;
        this.isNextButton = false;
        this.slideFragmentProgress = 1.0f;
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
            this.selectAlertString = this.arguments.getString("selectAlertString");
            this.selectAlertStringGroup = this.arguments.getString("selectAlertStringGroup");
            this.addToGroupAlertString = this.arguments.getString("addToGroupAlertString");
            this.allowSwitchAccount = this.arguments.getBoolean("allowSwitchAccount");
            this.checkCanWrite = this.arguments.getBoolean("checkCanWrite", true);
            this.afterSignup = this.arguments.getBoolean("afterSignup", false);
            this.folderId = this.arguments.getInt("folderId", 0);
            this.resetDelegate = this.arguments.getBoolean("resetDelegate", true);
            this.messagesCount = this.arguments.getInt("messagesCount", 0);
            this.hasPoll = this.arguments.getInt("hasPoll", 0);
            this.hasInvoice = this.arguments.getBoolean("hasInvoice", false);
            this.showSetPasswordConfirm = this.arguments.getBoolean("showSetPasswordConfirm", this.showSetPasswordConfirm);
            this.arguments.getInt("otherwiseRelogin");
            this.allowGroups = this.arguments.getBoolean("allowGroups", true);
            this.allowMegagroups = this.arguments.getBoolean("allowMegagroups", true);
            this.allowLegacyGroups = this.arguments.getBoolean("allowLegacyGroups", true);
            this.allowChannels = this.arguments.getBoolean("allowChannels", true);
            this.allowUsers = this.arguments.getBoolean("allowUsers", true);
            this.allowBots = this.arguments.getBoolean("allowBots", true);
            this.closeFragment = this.arguments.getBoolean("closeFragment", true);
            this.allowGlobalSearch = this.arguments.getBoolean("allowGlobalSearch", true);
            byte[] byteArray = this.arguments.getByteArray("requestPeerType");
            if (byteArray != null) {
                try {
                    SerializedData serializedData = new SerializedData(byteArray);
                    this.requestPeerType = TLRPC$RequestPeerType.TLdeserialize(serializedData, serializedData.readInt32(true), true);
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
        if (this.searchString == null) {
            this.currentConnectionState = getConnectionsManager().getConnectionState();
            getNotificationCenter().addObserver(this, NotificationCenter.dialogsNeedReload);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
            if (!this.onlySelect) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeSearchByActiveAction);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.proxySettingsChanged);
                getNotificationCenter().addObserver(this, NotificationCenter.filterSettingsUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogFiltersUpdated);
                getNotificationCenter().addObserver(this, NotificationCenter.dialogsUnreadCounterChanged);
            }
            getNotificationCenter().addObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().addObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.appDidLogout);
            getNotificationCenter().addObserver(this, NotificationCenter.openedChatChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.messageReceivedByAck);
            getNotificationCenter().addObserver(this, NotificationCenter.messageReceivedByServer);
            getNotificationCenter().addObserver(this, NotificationCenter.messageSendError);
            getNotificationCenter().addObserver(this, NotificationCenter.needReloadRecentDialogsSearch);
            getNotificationCenter().addObserver(this, NotificationCenter.replyMessagesDidLoad);
            getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
            getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
            getNotificationCenter().addObserver(this, NotificationCenter.onDownloadingFilesChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.needDeleteDialog);
            getNotificationCenter().addObserver(this, NotificationCenter.folderBecomeEmpty);
            getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoaded);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoadFailed);
            getNotificationCenter().addObserver(this, NotificationCenter.fileLoadProgressChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogsUnreadReactionsCounterChanged);
            getNotificationCenter().addObserver(this, NotificationCenter.forceImportContactsStart);
            getNotificationCenter().addObserver(this, NotificationCenter.userEmojiStatusUpdated);
            getNotificationCenter().addObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetPasscode);
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.appUpdateAvailable);
        }
        getNotificationCenter().addObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().addObserver(this, NotificationCenter.onDatabaseMigration);
        getNotificationCenter().addObserver(this, NotificationCenter.onDatabaseOpened);
        getNotificationCenter().addObserver(this, NotificationCenter.didClearDatabase);
        getNotificationCenter().addObserver(this, NotificationCenter.onDatabaseReset);
        if (this.initialDialogsType == 0) {
            getNotificationCenter().addObserver(this, NotificationCenter.chatlistFolderUpdate);
            getNotificationCenter().addObserver(this, NotificationCenter.dialogTranslate);
        }
        loadDialogs(getAccountInstance());
        getMessagesController().loadPinnedDialogs(this.folderId, 0L, null);
        if (this.databaseMigrationHint != null && !getMessagesStorage().isDatabaseMigrationInProgress()) {
            View view = this.databaseMigrationHint;
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.databaseMigrationHint = null;
        }
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
        accountInstance.getMediaDataController().chekAllMedia(false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.lambda$loadDialogs$1(AccountInstance.this);
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

    public void updateStatus(TLRPC$User tLRPC$User, boolean z) {
        if (this.statusDrawable == null || this.actionBar == null) {
            return;
        }
        Long emojiStatusDocumentId = UserObject.getEmojiStatusDocumentId(tLRPC$User);
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable = null;
        if (emojiStatusDocumentId != null) {
            this.statusDrawable.set(emojiStatusDocumentId.longValue(), z);
            this.actionBar.setRightDrawableOnClick(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$updateStatus$2(view);
                }
            });
            SelectAnimatedEmojiDialog.preload(this.currentAccount);
        } else if (tLRPC$User != null && MessagesController.getInstance(this.currentAccount).isPremiumUser(tLRPC$User)) {
            if (this.premiumStar == null) {
                this.premiumStar = getContext().getResources().getDrawable(R.drawable.msg_premium_liststar).mutate();
                this.premiumStar = new AnimatedEmojiDrawable.WrapSizeDrawable(this, this.premiumStar, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f)) {
                    @Override
                    public void draw(Canvas canvas) {
                        canvas.save();
                        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
                        super.draw(canvas);
                        canvas.restore();
                    }
                };
            }
            this.premiumStar.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_profile_verifiedBackground), PorterDuff.Mode.MULTIPLY));
            this.statusDrawable.set(this.premiumStar, z);
            this.actionBar.setRightDrawableOnClick(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$updateStatus$3(view);
                }
            });
            SelectAnimatedEmojiDialog.preload(this.currentAccount);
        } else {
            this.statusDrawable.set((Drawable) null, z);
            this.actionBar.setRightDrawableOnClick(null);
        }
        AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable2 = this.statusDrawable;
        int i = Theme.key_profile_verifiedBackground;
        swapAnimatedEmojiDrawable2.setColor(Integer.valueOf(Theme.getColor(i)));
        DrawerProfileCell.AnimatedStatusView animatedStatusView = this.animatedStatusView;
        if (animatedStatusView != null) {
            animatedStatusView.setColor(Theme.getColor(i));
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
        showSelectStatusDialog();
    }

    public void lambda$updateStatus$3(View view) {
        showSelectStatusDialog();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.searchString == null) {
            getNotificationCenter().removeObserver(this, NotificationCenter.dialogsNeedReload);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
            if (!this.onlySelect) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeSearchByActiveAction);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.proxySettingsChanged);
                getNotificationCenter().removeObserver(this, NotificationCenter.filterSettingsUpdated);
                getNotificationCenter().removeObserver(this, NotificationCenter.dialogFiltersUpdated);
                getNotificationCenter().removeObserver(this, NotificationCenter.dialogsUnreadCounterChanged);
            }
            getNotificationCenter().removeObserver(this, NotificationCenter.updateInterfaces);
            getNotificationCenter().removeObserver(this, NotificationCenter.encryptedChatUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.contactsDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.appDidLogout);
            getNotificationCenter().removeObserver(this, NotificationCenter.openedChatChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageReceivedByAck);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageReceivedByServer);
            getNotificationCenter().removeObserver(this, NotificationCenter.messageSendError);
            getNotificationCenter().removeObserver(this, NotificationCenter.needReloadRecentDialogsSearch);
            getNotificationCenter().removeObserver(this, NotificationCenter.replyMessagesDidLoad);
            getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
            getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
            getNotificationCenter().removeObserver(this, NotificationCenter.onDownloadingFilesChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.needDeleteDialog);
            getNotificationCenter().removeObserver(this, NotificationCenter.folderBecomeEmpty);
            getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoaded);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadFailed);
            getNotificationCenter().removeObserver(this, NotificationCenter.fileLoadProgressChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.dialogsUnreadReactionsCounterChanged);
            getNotificationCenter().removeObserver(this, NotificationCenter.forceImportContactsStart);
            getNotificationCenter().removeObserver(this, NotificationCenter.userEmojiStatusUpdated);
            getNotificationCenter().removeObserver(this, NotificationCenter.currentUserPremiumStatusChanged);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetPasscode);
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.appUpdateAvailable);
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.messagesDeleted);
        getNotificationCenter().removeObserver(this, NotificationCenter.onDatabaseMigration);
        getNotificationCenter().removeObserver(this, NotificationCenter.onDatabaseOpened);
        getNotificationCenter().removeObserver(this, NotificationCenter.didClearDatabase);
        getNotificationCenter().removeObserver(this, NotificationCenter.onDatabaseReset);
        if (this.initialDialogsType == 0) {
            getNotificationCenter().removeObserver(this, NotificationCenter.chatlistFolderUpdate);
            getNotificationCenter().removeObserver(this, NotificationCenter.dialogTranslate);
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null) {
            chatActivityEnterView.onDestroy();
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
        this.notificationsLocker.unlock();
        this.delegate = null;
        SuggestClearDatabaseBottomSheet.dismissDialog();
    }

    @Override
    public ActionBar createActionBar(Context context) {
        ActionBar actionBar = new ActionBar(context) {
            @Override
            public void setTranslationY(float f) {
                if (f != getTranslationY() && ((BaseFragment) DialogsActivity.this).fragmentView != null) {
                    ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
                }
                super.setTranslationY(f);
            }

            @Override
            public boolean shouldClipChild(View view) {
                return super.shouldClipChild(view) || view == DialogsActivity.this.doneItem;
            }

            @Override
            public boolean drawChild(Canvas canvas, View view, long j) {
                if (!((BaseFragment) DialogsActivity.this).inPreviewMode || DialogsActivity.this.avatarContainer == null || view == DialogsActivity.this.avatarContainer) {
                    return super.drawChild(canvas, view, j);
                }
                return false;
            }

            @Override
            public void setTitleOverlayText(String str, int i, Runnable runnable) {
                super.setTitleOverlayText(str, i, runnable);
                if (DialogsActivity.this.selectAnimatedEmojiDialog == null || !(DialogsActivity.this.selectAnimatedEmojiDialog.getContentView() instanceof SelectAnimatedEmojiDialog)) {
                    return;
                }
                SimpleTextView titleTextView = getTitleTextView();
                ((SelectAnimatedEmojiDialog) DialogsActivity.this.selectAnimatedEmojiDialog.getContentView()).setScrimDrawable((titleTextView == null || titleTextView.getRightDrawable() != DialogsActivity.this.statusDrawable) ? null : DialogsActivity.this.statusDrawable, titleTextView);
            }

            @Override
            protected boolean onSearchChangedIgnoreTitles() {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                return rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment();
            }

            @Override
            public void onSearchFieldVisibilityChanged(boolean z) {
                RightSlidingDialogContainer rightSlidingDialogContainer = DialogsActivity.this.rightSlidingDialogContainer;
                if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
                    getBackButton().animate().alpha(z ? 1.0f : 0.0f).start();
                }
                super.onSearchFieldVisibilityChanged(z);
            }
        };
        actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarDefaultSelector), false);
        actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), true);
        actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarDefaultIcon), false);
        actionBar.setItemsColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon), true);
        if (this.inPreviewMode || (AndroidUtilities.isTablet() && this.folderId != 0)) {
            actionBar.setOccupyStatusBar(false);
        }
        return actionBar;
    }

    @Override
    public android.view.View createView(final android.content.Context r40) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.createView(android.content.Context):android.view.View");
    }

    public void lambda$createView$5(View view) {
        this.filterTabsView.setIsEditing(false);
        showDoneItem(false);
    }

    public class AnonymousClass4 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        boolean isSpeedItemCreated = false;
        final Context val$context;
        final ActionBarMenu val$menu;

        AnonymousClass4(Context context, ActionBarMenu actionBarMenu) {
            this.val$context = context;
            this.val$menu = actionBarMenu;
        }

        @Override
        public void onPreToggleSearch() {
            if (this.isSpeedItemCreated) {
                return;
            }
            this.isSpeedItemCreated = true;
            DialogsActivity dialogsActivity = DialogsActivity.this;
            Context context = this.val$context;
            ActionBarMenu actionBarMenu = this.val$menu;
            int color = Theme.getColor(Theme.key_actionBarActionModeDefaultSelector);
            int i = Theme.key_actionBarActionModeDefaultIcon;
            dialogsActivity.speedItem = new ActionBarMenuItem(context, actionBarMenu, color, Theme.getColor(i));
            DialogsActivity.this.speedItem.setIcon(R.drawable.avd_speed);
            DialogsActivity.this.speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.SRC_IN));
            DialogsActivity.this.speedItem.setTranslationX(AndroidUtilities.dp(32.0f));
            DialogsActivity.this.speedItem.setAlpha(0.0f);
            DialogsActivity.this.speedItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.AnonymousClass4.this.lambda$onPreToggleSearch$0(view);
                }
            });
            DialogsActivity.this.speedItem.setClickable(false);
            DialogsActivity.this.speedItem.setFixBackground(true);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AndroidUtilities.dp(42.0f), -1);
            int dp = AndroidUtilities.dp(38.0f);
            layoutParams.rightMargin = dp;
            layoutParams.leftMargin = dp;
            layoutParams.gravity = 5;
            ((FrameLayout) DialogsActivity.this.searchItem.getSearchClearButton().getParent()).addView(DialogsActivity.this.speedItem, layoutParams);
            DialogsActivity.this.searchItem.setSearchAdditionalButton(DialogsActivity.this.speedItem);
            DialogsActivity dialogsActivity2 = DialogsActivity.this;
            dialogsActivity2.updateSpeedItem(dialogsActivity2.searchViewPager.getCurrentPosition() == 2);
        }

        public void lambda$onPreToggleSearch$0(View view) {
            DialogsActivity.this.showDialog(new PremiumFeatureBottomSheet(DialogsActivity.this, 2, true));
        }

        @Override
        public void onSearchExpand() {
            DialogsActivity.this.searching = true;
            if (DialogsActivity.this.switchItem != null) {
                DialogsActivity.this.switchItem.setVisibility(8);
            }
            if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                DialogsActivity.this.proxyItem.setVisibility(8);
            }
            if (DialogsActivity.this.downloadsItem != null && DialogsActivity.this.downloadsItemVisible) {
                DialogsActivity.this.downloadsItem.setVisibility(8);
            }
            if (DialogsActivity.this.viewPages[0] != null) {
                if (DialogsActivity.this.searchString != null) {
                    DialogsActivity.this.viewPages[0].listView.hide();
                    if (DialogsActivity.this.searchViewPager != null) {
                        DialogsActivity.this.searchViewPager.searchListView.show();
                    }
                }
                if (!DialogsActivity.this.onlySelect) {
                    DialogsActivity.this.floatingButtonContainer.setVisibility(8);
                }
            }
            DialogsActivity.this.setScrollY(0.0f);
            DialogsActivity.this.updatePasscodeButton();
            DialogsActivity.this.updateProxyButton(false, false);
            ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrGoBack", R.string.AccDescrGoBack));
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, new Object[0]);
            ((SizeNotifierFrameLayout) ((BaseFragment) DialogsActivity.this).fragmentView).invalidateBlur();
        }

        @Override
        public boolean canCollapseSearch() {
            if (DialogsActivity.this.switchItem != null) {
                DialogsActivity.this.switchItem.setVisibility(0);
            }
            if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                DialogsActivity.this.proxyItem.setVisibility(0);
            }
            if (DialogsActivity.this.downloadsItem != null && DialogsActivity.this.downloadsItemVisible) {
                DialogsActivity.this.downloadsItem.setVisibility(0);
            }
            if (DialogsActivity.this.searchString != null) {
                DialogsActivity.this.finishFragment();
                return false;
            }
            return true;
        }

        @Override
        public void onSearchCollapse() {
            DialogsActivity.this.searching = false;
            DialogsActivity.this.searchWas = false;
            if (DialogsActivity.this.viewPages[0] != null) {
                DialogsActivity.this.viewPages[0].listView.setEmptyView(DialogsActivity.this.folderId == 0 ? DialogsActivity.this.viewPages[0].progressView : null);
                if (!DialogsActivity.this.onlySelect) {
                    DialogsActivity.this.floatingButtonContainer.setVisibility(0);
                    DialogsActivity.this.floatingHidden = true;
                    DialogsActivity.this.floatingButtonTranslation = AndroidUtilities.dp(100.0f);
                    DialogsActivity.this.floatingButtonHideProgress = 1.0f;
                    DialogsActivity.this.updateFloatingButtonOffset();
                }
                DialogsActivity.this.showSearch(false, false, true);
            }
            DialogsActivity.this.updateProxyButton(false, false);
            DialogsActivity.this.updatePasscodeButton();
            if (DialogsActivity.this.menuDrawable != null) {
                if (((BaseFragment) DialogsActivity.this).actionBar.getBackButton().getDrawable() != DialogsActivity.this.menuDrawable) {
                    ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonDrawable(DialogsActivity.this.menuDrawable);
                    DialogsActivity.this.menuDrawable.setRotation(0.0f, true);
                }
                ((BaseFragment) DialogsActivity.this).actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrOpenMenu", R.string.AccDescrOpenMenu));
            }
            NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.needCheckSystemBarColors, Boolean.TRUE);
            ((SizeNotifierFrameLayout) ((BaseFragment) DialogsActivity.this).fragmentView).invalidateBlur();
        }

        @Override
        public void onTextChanged(EditText editText) {
            String obj = editText.getText().toString();
            if (obj.length() != 0 || ((DialogsActivity.this.searchViewPager.dialogsSearchAdapter != null && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.hasRecentSearch()) || DialogsActivity.this.searchFiltersWasShowed)) {
                DialogsActivity.this.searchWas = true;
                if (!DialogsActivity.this.searchIsShowed) {
                    DialogsActivity.this.showSearch(true, false, true);
                }
            }
            DialogsActivity.this.searchViewPager.onTextChanged(obj);
        }

        @Override
        public void onSearchFilterCleared(FiltersView.MediaFilterData mediaFilterData) {
            if (DialogsActivity.this.searchIsShowed) {
                DialogsActivity.this.searchViewPager.removeSearchFilter(mediaFilterData);
                DialogsActivity.this.searchViewPager.onTextChanged(DialogsActivity.this.searchItem.getSearchField().getText().toString());
                DialogsActivity.this.updateFiltersView(true, null, null, false, true);
            }
        }

        @Override
        public boolean canToggleSearch() {
            return !((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed() && DialogsActivity.this.databaseMigrationHint == null;
        }
    }

    public void lambda$createView$6() {
        if (this.initialDialogsType != 10) {
            hideFloatingButton(false);
        }
        scrollToTop();
    }

    public class AnonymousClass5 extends FilterTabsView {
        AnonymousClass5(Context context) {
            super(context);
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            getParent().requestDisallowInterceptTouchEvent(true);
            DialogsActivity.this.maybeStartTracking = false;
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        public void setTranslationY(float f) {
            if (getTranslationY() != f) {
                super.setTranslationY(f);
                DialogsActivity.this.updateContextViewPosition();
                if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                    ((BaseFragment) DialogsActivity.this).fragmentView.invalidate();
                }
            }
        }

        @Override
        protected void onDefaultTabMoved() {
            if (DialogsActivity.this.getMessagesController().premiumLocked) {
                return;
            }
            try {
                performHapticFeedback(3, 1);
            } catch (Exception unused) {
            }
            DialogsActivity dialogsActivity = DialogsActivity.this;
            dialogsActivity.topBulletin = BulletinFactory.of(dialogsActivity).createSimpleBulletin(R.raw.filter_reorder, AndroidUtilities.replaceTags(LocaleController.formatString("LimitReachedReorderFolder", R.string.LimitReachedReorderFolder, LocaleController.getString(R.string.FilterAllChats))), LocaleController.getString("PremiumMore", R.string.PremiumMore), 5000, new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.AnonymousClass5.this.lambda$onDefaultTabMoved$0();
                }
            }).show(true);
        }

        public void lambda$onDefaultTabMoved$0() {
            DialogsActivity.this.showDialog(new PremiumFeatureBottomSheet(DialogsActivity.this, 9, true));
            DialogsActivity.this.filterTabsView.setIsEditing(false);
            DialogsActivity.this.showDoneItem(false);
        }
    }

    public class AnonymousClass6 implements FilterTabsView.FilterTabsViewDelegate {
        final Context val$context;

        AnonymousClass6(Context context) {
            this.val$context = context;
        }

        public void lambda$didSelectTab$6(final MessagesController.DialogFilter dialogFilter) {
            if (dialogFilter.isChatlist()) {
                FolderBottomSheet.showForDeletion(DialogsActivity.this, dialogFilter.id, null);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("FilterDelete", R.string.FilterDelete));
            builder.setMessage(LocaleController.getString("FilterDeleteAlert", R.string.FilterDeleteAlert));
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogsActivity.AnonymousClass6.this.lambda$showDeleteAlert$0(dialogFilter, dialogInterface, i);
                }
            });
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$showDeleteAlert$0(MessagesController.DialogFilter dialogFilter, DialogInterface dialogInterface, int i) {
            TLRPC$TL_messages_updateDialogFilter tLRPC$TL_messages_updateDialogFilter = new TLRPC$TL_messages_updateDialogFilter();
            tLRPC$TL_messages_updateDialogFilter.id = dialogFilter.id;
            DialogsActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_messages_updateDialogFilter, null);
            DialogsActivity.this.getMessagesController().removeFilter(dialogFilter);
            DialogsActivity.this.getMessagesStorage().deleteDialogFilter(dialogFilter);
        }

        @Override
        public void onSamePageSelected() {
            DialogsActivity.this.scrollToTop();
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
                dialogsActivity.showDialog(new LimitReachedBottomSheet(dialogsActivity2, this.val$context, 3, ((BaseFragment) dialogsActivity2).currentAccount));
                return;
            }
            ArrayList<MessagesController.DialogFilter> dialogFilters = DialogsActivity.this.getMessagesController().getDialogFilters();
            if (tab.isDefault || ((i = tab.id) >= 0 && i < dialogFilters.size())) {
                DialogsActivity dialogsActivity3 = DialogsActivity.this;
                dialogsActivity3.isFirstTab = tab.id == dialogsActivity3.filterTabsView.getFirstTabId();
                DialogsActivity.this.updateDrawerSwipeEnabled();
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
                    DialogsActivity.this.viewPages[1].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() - (DialogsActivity.this.viewPages[0].getMeasuredWidth() * f));
                } else {
                    DialogsActivity.this.viewPages[0].setTranslationX(DialogsActivity.this.viewPages[0].getMeasuredWidth() * f);
                    DialogsActivity.this.viewPages[1].setTranslationX((DialogsActivity.this.viewPages[0].getMeasuredWidth() * f) - DialogsActivity.this.viewPages[0].getMeasuredWidth());
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
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.AnonymousClass6.didSelectTab(org.telegram.ui.Components.FilterTabsView$TabView, boolean):boolean");
        }

        public void lambda$didSelectTab$1() {
            DialogsActivity.this.resetScroll();
            DialogsActivity.this.filterTabsView.setIsEditing(true);
            DialogsActivity.this.showDoneItem(true);
        }

        public void lambda$didSelectTab$2(boolean z, MessagesController.DialogFilter dialogFilter) {
            DialogsActivity.this.presentFragment(z ? new FiltersSetupActivity() : new FilterCreateActivity(dialogFilter));
        }

        public void lambda$didSelectTab$3(ArrayList arrayList, boolean z) {
            int i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) arrayList.get(i2);
                if (tLRPC$Dialog != null) {
                    DialogsActivity.this.getNotificationsController().setDialogNotificationsSettings(tLRPC$Dialog.id, 0, z ? 3 : 4);
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

    class AnonymousClass9 extends LinearLayoutManager {
        private boolean fixOffset;
        final ViewPage val$viewPage;

        AnonymousClass9(Context context, ViewPage viewPage) {
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
        public int scrollVerticallyBy(int r18, androidx.recyclerview.widget.RecyclerView.Recycler r19, androidx.recyclerview.widget.RecyclerView.State r20) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.AnonymousClass9.scrollVerticallyBy(int, androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State):int");
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
                        DialogsActivity.AnonymousClass9.lambda$onLayoutChildren$0(DialogsActivity.ViewPage.this);
                    }
                });
            }
        }

        public static void lambda$onLayoutChildren$0(ViewPage viewPage) {
            viewPage.dialogsAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$createView$7(ViewPage viewPage, View view, int i) {
        TLRPC$TL_chatlists_chatlistUpdates chatlistUpdate;
        int i2 = this.initialDialogsType;
        if (i2 == 15 && (view instanceof TextCell)) {
            viewPage.dialogsAdapter.onCreateGroupForThisClick();
        } else if (i2 == 10) {
            onItemLongClick(viewPage.listView, view, i, 0.0f, 0.0f, viewPage.dialogsType, viewPage.dialogsAdapter);
        } else if ((i2 == 11 || i2 == 13) && i == 1) {
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
                    ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
                    arrayList.add(MessagesStorage.TopicKey.of(-j, 0));
                    DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                    if (DialogsActivity.this.closeFragment) {
                        DialogsActivity.this.removeSelfFromStack();
                    }
                    dialogsActivityDelegate.didSelectDialogs(DialogsActivity.this, arrayList, null, true, null);
                }
            });
            presentFragment(groupCreateFinalActivity);
        } else if (!(view instanceof DialogsHintCell) || ((viewPage.dialogsType != 7 && viewPage.dialogsType != 8) || (chatlistUpdate = viewPage.dialogsAdapter.getChatlistUpdate()) == null)) {
            onItemClick(view, i, viewPage.dialogsAdapter);
        } else {
            MessagesController.DialogFilter dialogFilter = getMessagesController().selectedDialogFilter[viewPage.dialogsType - 7];
            if (dialogFilter != null) {
                showDialog(new FolderBottomSheet(this, dialogFilter.id, chatlistUpdate));
            }
        }
    }

    public class AnonymousClass17 implements DialogsSearchAdapter.DialogsSearchAdapterDelegate {
        AnonymousClass17() {
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
        public void didPressedOnSubDialog(long j) {
            if (DialogsActivity.this.onlySelect) {
                if (DialogsActivity.this.validateSlowModeDialog(j)) {
                    if (!DialogsActivity.this.selectedDialogs.isEmpty()) {
                        DialogsActivity.this.findAndUpdateCheckBox(j, DialogsActivity.this.addOrRemoveSelectedDialog(j, null));
                        DialogsActivity.this.updateSelectedCount();
                        ((BaseFragment) DialogsActivity.this).actionBar.closeSearchField();
                        return;
                    }
                    DialogsActivity.this.didSelectResult(j, 0, true, false);
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
                    DialogsActivity.this.getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
                    DialogsActivity.this.presentFragment(new ChatActivity(bundle));
                }
            } else if (DialogsActivity.this.getMessagesController().checkCanOpenChat(bundle, DialogsActivity.this)) {
                DialogsActivity.this.presentFragment(new ChatActivity(bundle));
            }
        }

        @Override
        public void needRemoveHint(final long j) {
            TLRPC$User user;
            if (DialogsActivity.this.getParentActivity() == null || (user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(j))) == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("ChatHintsDeleteAlertTitle", R.string.ChatHintsDeleteAlertTitle));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ChatHintsDeleteAlert", R.string.ChatHintsDeleteAlert, ContactsController.formatName(user.first_name, user.last_name))));
            builder.setPositiveButton(LocaleController.getString("StickersRemove", R.string.StickersRemove), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogsActivity.AnonymousClass17.this.lambda$needRemoveHint$0(j, dialogInterface, i);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$needRemoveHint$0(long j, DialogInterface dialogInterface, int i) {
            DialogsActivity.this.getMediaDataController().removePeer(j);
        }

        @Override
        public void needClearList() {
            AlertDialog.Builder builder = new AlertDialog.Builder(DialogsActivity.this.getParentActivity());
            if (DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isSearchWas() && DialogsActivity.this.searchViewPager.dialogsSearchAdapter.isRecentSearchDisplayed()) {
                builder.setTitle(LocaleController.getString("ClearSearchAlertPartialTitle", R.string.ClearSearchAlertPartialTitle));
                builder.setMessage(LocaleController.formatPluralString("ClearSearchAlertPartial", DialogsActivity.this.searchViewPager.dialogsSearchAdapter.getRecentResultsCount(), new Object[0]));
                builder.setPositiveButton(LocaleController.getString("Clear", R.string.Clear), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DialogsActivity.AnonymousClass17.this.lambda$needClearList$1(dialogInterface, i);
                    }
                });
            } else {
                builder.setTitle(LocaleController.getString("ClearSearchAlertTitle", R.string.ClearSearchAlertTitle));
                builder.setMessage(LocaleController.getString("ClearSearchAlert", R.string.ClearSearchAlert));
                builder.setPositiveButton(LocaleController.getString("ClearButton", R.string.ClearButton), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        DialogsActivity.AnonymousClass17.this.lambda$needClearList$2(dialogInterface, i);
                    }
                });
            }
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog create = builder.create();
            DialogsActivity.this.showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            }
        }

        public void lambda$needClearList$1(DialogInterface dialogInterface, int i) {
            DialogsActivity.this.searchViewPager.dialogsSearchAdapter.clearRecentSearch();
        }

        public void lambda$needClearList$2(DialogInterface dialogInterface, int i) {
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

    public void lambda$createView$8(View view, int i) {
        if (this.initialDialogsType == 10) {
            SearchViewPager searchViewPager = this.searchViewPager;
            onItemLongClick(searchViewPager.searchListView, view, i, 0.0f, 0.0f, -1, searchViewPager.dialogsSearchAdapter);
            return;
        }
        onItemClick(view, i, this.searchViewPager.dialogsSearchAdapter);
    }

    public void lambda$createView$9(boolean z, ArrayList arrayList, ArrayList arrayList2, boolean z2) {
        updateFiltersView(z, arrayList, arrayList2, z2, true);
    }

    public void lambda$createView$10(View view, int i) {
        this.filtersView.cancelClickRunnables(true);
        addSearchFilter(this.filtersView.getFilterAt(i));
    }

    public void lambda$createView$11(View view) {
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isInPreviewMode()) {
            finishPreviewFragment();
        } else if (this.initialDialogsType == 10) {
            if (this.delegate == null || this.selectedDialogs.isEmpty()) {
                return;
            }
            ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
            for (int i = 0; i < this.selectedDialogs.size(); i++) {
                arrayList.add(MessagesStorage.TopicKey.of(this.selectedDialogs.get(i).longValue(), 0));
            }
            this.delegate.didSelectDialogs(this, arrayList, null, false, null);
        } else if (this.floatingButton.getVisibility() == 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("destroyAfterSelect", true);
            presentFragment(new ContactsActivity(bundle));
        }
    }

    public void lambda$createView$12(Long l) {
        this.cacheSize = l;
        updateDialogsHint();
    }

    public void lambda$createView$13(Long l, Long l2) {
        this.deviceSize = l;
        updateDialogsHint();
    }

    public void lambda$createView$14(View view) {
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
        for (int i = 0; i < this.selectedDialogs.size(); i++) {
            arrayList.add(MessagesStorage.TopicKey.of(this.selectedDialogs.get(i).longValue(), 0));
        }
        this.delegate.didSelectDialogs(this, arrayList, this.commentView.getFieldText(), false, null);
    }

    public boolean lambda$createView$15(FrameLayout frameLayout, View view) {
        if (this.isNextButton) {
            return false;
        }
        onSendLongClick(frameLayout);
        return true;
    }

    public void lambda$createView$16(View view) {
        if (SharedConfig.isAppUpdateAvailable()) {
            AndroidUtilities.openForView(SharedConfig.pendingAppUpdate.document, true, getParentActivity());
        }
    }

    public void lambda$createView$17(View view) {
        finishPreviewFragment();
    }

    public boolean isPremiumRestoreHintVisible() {
        return !MessagesController.getInstance(this.currentAccount).premiumLocked && this.folderId == 0 && MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_RESTORE") && !getUserConfig().isPremium();
    }

    public boolean isPremiumHintVisible() {
        if (MessagesController.getInstance(this.currentAccount).premiumLocked || this.folderId != 0 || ((!(MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE") && getUserConfig().isPremium()) && (!MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_ANNUAL") || getUserConfig().isPremium())) || (!UserConfig.getInstance(this.currentAccount).isPremium() ? MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false) != null : !(BuildVars.useInvoiceBilling() || MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(true) == null)))) {
            return false;
        }
        this.isPremiumHintUpgrade = MessagesController.getInstance(this.currentAccount).pendingSuggestions.contains("PREMIUM_UPGRADE");
        return true;
    }

    private boolean isCacheHintVisible() {
        Long l = this.cacheSize;
        if (l == null || this.deviceSize == null) {
            return false;
        }
        if (((float) l.longValue()) / ((float) this.deviceSize.longValue()) >= 0.3f) {
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
        int i;
        int i2;
        if (this.selectAnimatedEmojiDialog != null || SharedConfig.appLocked) {
            return;
        }
        final SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[] selectAnimatedEmojiDialogWindowArr = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow[1];
        TLRPC$User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
        SimpleTextView titleTextView = this.actionBar.getTitleTextView();
        if (titleTextView == null || titleTextView.getRightDrawable() == null) {
            i = 0;
            i2 = 0;
        } else {
            this.statusDrawable.play();
            boolean z = this.statusDrawable.getDrawable() instanceof AnimatedEmojiDrawable;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set(titleTextView.getRightDrawable().getBounds());
            rect.offset((int) titleTextView.getX(), (int) titleTextView.getY());
            int dp = (-(this.actionBar.getHeight() - rect.centerY())) - AndroidUtilities.dp(16.0f);
            i = rect.centerX() - AndroidUtilities.dp(16.0f);
            DrawerProfileCell.AnimatedStatusView animatedStatusView = this.animatedStatusView;
            if (animatedStatusView != null) {
                animatedStatusView.translate(rect.centerX(), rect.centerY());
            }
            i2 = dp;
        }
        int i3 = i2;
        SelectAnimatedEmojiDialog selectAnimatedEmojiDialog = new SelectAnimatedEmojiDialog(this, getContext(), true, Integer.valueOf(i), 0, getResourceProvider()) {
            @Override
            protected void onEmojiSelected(View view, Long l, TLRPC$Document tLRPC$Document, Integer num) {
                TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil;
                if (l == null) {
                    tLRPC$TL_emojiStatusUntil = new TLRPC$TL_emojiStatusEmpty();
                } else if (num != null) {
                    TLRPC$TL_emojiStatusUntil tLRPC$TL_emojiStatusUntil2 = new TLRPC$TL_emojiStatusUntil();
                    tLRPC$TL_emojiStatusUntil2.document_id = l.longValue();
                    tLRPC$TL_emojiStatusUntil2.until = num.intValue();
                    tLRPC$TL_emojiStatusUntil = tLRPC$TL_emojiStatusUntil2;
                } else {
                    TLRPC$TL_emojiStatus tLRPC$TL_emojiStatus = new TLRPC$TL_emojiStatus();
                    tLRPC$TL_emojiStatus.document_id = l.longValue();
                    tLRPC$TL_emojiStatusUntil = tLRPC$TL_emojiStatus;
                }
                DialogsActivity.this.getMessagesController().updateEmojiStatus(tLRPC$TL_emojiStatusUntil);
                if (l != null) {
                    DialogsActivity.this.animatedStatusView.animateChange(ReactionsLayoutInBubble.VisibleReaction.fromCustomEmoji(l));
                }
                if (selectAnimatedEmojiDialogWindowArr[0] != null) {
                    DialogsActivity.this.selectAnimatedEmojiDialog = null;
                    selectAnimatedEmojiDialogWindowArr[0].dismiss();
                }
            }
        };
        if (currentUser != null) {
            TLRPC$EmojiStatus tLRPC$EmojiStatus = currentUser.emoji_status;
            if ((tLRPC$EmojiStatus instanceof TLRPC$TL_emojiStatusUntil) && ((TLRPC$TL_emojiStatusUntil) tLRPC$EmojiStatus).until > ((int) (System.currentTimeMillis() / 1000))) {
                selectAnimatedEmojiDialog.setExpireDateHint(((TLRPC$TL_emojiStatusUntil) currentUser.emoji_status).until);
            }
        }
        selectAnimatedEmojiDialog.setSelected(this.statusDrawable.getDrawable() instanceof AnimatedEmojiDrawable ? Long.valueOf(((AnimatedEmojiDrawable) this.statusDrawable.getDrawable()).getDocumentId()) : null);
        selectAnimatedEmojiDialog.setSaveState(1);
        selectAnimatedEmojiDialog.setScrimDrawable(this.statusDrawable, titleTextView);
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = new SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow(selectAnimatedEmojiDialog, -2, -2) {
            @Override
            public void dismiss() {
                super.dismiss();
                DialogsActivity.this.selectAnimatedEmojiDialog = null;
            }
        };
        this.selectAnimatedEmojiDialog = selectAnimatedEmojiDialogWindow;
        selectAnimatedEmojiDialogWindowArr[0] = selectAnimatedEmojiDialogWindow;
        selectAnimatedEmojiDialogWindowArr[0].showAsDropDown(this.actionBar, AndroidUtilities.dp(16.0f), i3, 48);
        selectAnimatedEmojiDialogWindowArr[0].dimBehind();
    }

    private void updateDialogsHint() {
        if (this.dialogsHintCell == null) {
            return;
        }
        if (isPremiumRestoreHintVisible()) {
            this.dialogsHintCell.setVisibility(0);
            this.dialogsHintCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$updateDialogsHint$20(view);
                }
            });
            this.dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.RestorePremiumHintTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.getString(R.string.RestorePremiumHintMessage));
        } else if (isPremiumHintVisible()) {
            this.dialogsHintCell.setVisibility(0);
            this.dialogsHintCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$updateDialogsHint$22(view);
                }
            });
            this.dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(this.isPremiumHintUpgrade ? R.string.SaveOnAnnualPremiumTitle : R.string.UpgradePremiumTitle, MediaDataController.getInstance(this.currentAccount).getPremiumHintAnnualDiscount(false)), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.getString(this.isPremiumHintUpgrade ? R.string.UpgradePremiumMessage : R.string.SaveOnAnnualPremiumMessage));
        } else if (isCacheHintVisible()) {
            this.dialogsHintCell.setVisibility(0);
            this.dialogsHintCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$updateDialogsHint$24(view);
                }
            });
            this.dialogsHintCell.setText(AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.ClearStorageHintTitle, AndroidUtilities.formatFileSize(this.cacheSize.longValue())), Theme.key_windowBackgroundWhiteValueText, 0, null), LocaleController.getString(R.string.ClearStorageHintMessage));
        } else {
            this.dialogsHintCell.setVisibility(8);
        }
    }

    public void lambda$updateDialogsHint$20(View view) {
        presentFragment(new PremiumPreviewFragment("dialogs_hint").setSelectAnnualByDefault());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$updateDialogsHint$19();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$19() {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, "PREMIUM_RESTORE");
        updateDialogsHint();
    }

    public void lambda$updateDialogsHint$22(View view) {
        presentFragment(new PremiumPreviewFragment("dialogs_hint").setSelectAnnualByDefault());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$updateDialogsHint$21();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$21() {
        MessagesController.getInstance(this.currentAccount).removeSuggestion(0L, this.isPremiumHintUpgrade ? "PREMIUM_UPGRADE" : "PREMIUM_ANNUAL");
        updateDialogsHint();
    }

    public void lambda$updateDialogsHint$24(View view) {
        presentFragment(new CacheControlActivity());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$updateDialogsHint$23();
            }
        }, 250L);
    }

    public void lambda$updateDialogsHint$23() {
        resetCacheHintVisible();
        updateDialogsHint();
    }

    public void createGroupForThis() {
        final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
        TLRPC$RequestPeerType tLRPC$RequestPeerType = this.requestPeerType;
        if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeBroadcast) {
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
                    DialogsActivity.this.lambda$createGroupForThis$34(channelCreateActivity, alertDialog, (BaseFragment) obj, (Long) obj2);
                }
            });
            presentFragment(channelCreateActivity);
        } else if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeChat) {
            Bundle bundle2 = new Bundle();
            Boolean bool2 = this.requestPeerType.bot_participant;
            bundle2.putLongArray("result", (bool2 == null || !bool2.booleanValue()) ? new long[]{getUserConfig().getClientUserId()} : new long[]{getUserConfig().getClientUserId(), this.requestPeerBotId});
            Boolean bool3 = this.requestPeerType.forum;
            bundle2.putInt("chatType", (bool3 == null || !bool3.booleanValue()) ? 4 : 5);
            bundle2.putBoolean("canToggleTopics", false);
            GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
            groupCreateFinalActivity.setDelegate(new AnonymousClass30(alertDialog));
            presentFragment(groupCreateFinalActivity);
        }
    }

    public void lambda$createGroupForThis$34(final ChannelCreateActivity channelCreateActivity, final AlertDialog alertDialog, final BaseFragment baseFragment, final Long l) {
        Utilities.doCallbacks(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.this.lambda$createGroupForThis$26(l, channelCreateActivity, baseFragment, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.this.lambda$createGroupForThis$28(alertDialog, l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.this.lambda$createGroupForThis$30(l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.this.lambda$createGroupForThis$32(l, (Runnable) obj);
            }
        }, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                DialogsActivity.this.lambda$createGroupForThis$33(alertDialog, l, channelCreateActivity, baseFragment, (Runnable) obj);
            }
        });
    }

    public void lambda$createGroupForThis$26(Long l, final ChannelCreateActivity channelCreateActivity, final BaseFragment baseFragment, Runnable runnable) {
        showSendToBotAlert(getMessagesController().getChat(l), runnable, new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$createGroupForThis$25(channelCreateActivity, baseFragment);
            }
        });
    }

    public void lambda$createGroupForThis$25(ChannelCreateActivity channelCreateActivity, BaseFragment baseFragment) {
        removeSelfFromStack();
        channelCreateActivity.removeSelfFromStack();
        baseFragment.finishFragment();
    }

    public void lambda$createGroupForThis$28(AlertDialog alertDialog, Long l, final Runnable runnable) {
        alertDialog.showDelayed(150L);
        Boolean bool = this.requestPeerType.bot_participant;
        if (bool != null && bool.booleanValue()) {
            getMessagesController().addUserToChat(l.longValue(), getMessagesController().getUser(Long.valueOf(this.requestPeerBotId)), 0, null, this, false, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean run;
                    run = runnable.run();
                    return run;
                }
            });
            return;
        }
        runnable.run();
    }

    public void lambda$createGroupForThis$30(Long l, final Runnable runnable) {
        if (this.requestPeerType.bot_admin_rights != null) {
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
            MessagesController messagesController = getMessagesController();
            long longValue = l.longValue();
            TLRPC$RequestPeerType tLRPC$RequestPeerType = this.requestPeerType;
            TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = tLRPC$RequestPeerType.bot_admin_rights;
            Boolean bool = tLRPC$RequestPeerType.bot_participant;
            messagesController.setUserAdminRole(longValue, user, tLRPC$TL_chatAdminRights, null, false, this, bool == null || !bool.booleanValue(), true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean run;
                    run = runnable.run();
                    return run;
                }
            });
            return;
        }
        runnable.run();
    }

    public void lambda$createGroupForThis$32(Long l, final Runnable runnable) {
        if (this.requestPeerType.user_admin_rights != null) {
            getMessagesController().setUserAdminRole(l.longValue(), getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(getMessagesController().getChat(l).admin_rights, this.requestPeerType.user_admin_rights), null, true, this, false, true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean run;
                    run = runnable.run();
                    return run;
                }
            });
            return;
        }
        runnable.run();
    }

    public void lambda$createGroupForThis$33(AlertDialog alertDialog, Long l, ChannelCreateActivity channelCreateActivity, BaseFragment baseFragment, Runnable runnable) {
        alertDialog.dismiss();
        getMessagesController().loadChannelParticipants(l);
        DialogsActivityDelegate dialogsActivityDelegate = this.delegate;
        removeSelfFromStack();
        channelCreateActivity.removeSelfFromStack();
        baseFragment.finishFragment();
        if (dialogsActivityDelegate != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
            arrayList.add(MessagesStorage.TopicKey.of(-l.longValue(), 0));
            dialogsActivityDelegate.didSelectDialogs(this, arrayList, null, false, null);
        }
    }

    public class AnonymousClass30 implements GroupCreateFinalActivity.GroupCreateFinalActivityDelegate {
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
            final AlertDialog alertDialog = this.val$progress;
            final AlertDialog alertDialog2 = this.val$progress;
            Utilities.doCallbacks(new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$1(j, baseFragmentArr, (Runnable) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$3(j, baseFragmentArr, (Runnable) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$5(alertDialog, j, (Runnable) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$7(j, (Runnable) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$9(j, (Runnable) obj);
                }
            }, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$10(alertDialog2, j, baseFragmentArr, (Runnable) obj);
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
                        BaseFragment baseFragment = (BaseFragment) obj;
                        Long l = (Long) obj2;
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
                    DialogsActivity.AnonymousClass30.this.lambda$didFinishChatCreation$2(baseFragmentArr);
                }
            });
        }

        public void lambda$didFinishChatCreation$2(BaseFragment[] baseFragmentArr) {
            DialogsActivity.this.removeSelfFromStack();
            if (baseFragmentArr[1] != null) {
                baseFragmentArr[0].removeSelfFromStack();
                baseFragmentArr[1].finishFragment();
                return;
            }
            baseFragmentArr[0].finishFragment();
        }

        public void lambda$didFinishChatCreation$5(AlertDialog alertDialog, long j, final Runnable runnable) {
            alertDialog.showDelayed(150L);
            if (DialogsActivity.this.requestPeerType.bot_participant != null && DialogsActivity.this.requestPeerType.bot_participant.booleanValue()) {
                DialogsActivity.this.getMessagesController().addUserToChat(j, DialogsActivity.this.getMessagesController().getUser(Long.valueOf(DialogsActivity.this.requestPeerBotId)), 0, null, DialogsActivity.this, false, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                        boolean run;
                        run = runnable.run();
                        return run;
                    }
                });
                return;
            }
            runnable.run();
        }

        public void lambda$didFinishChatCreation$7(long j, final Runnable runnable) {
            if (DialogsActivity.this.requestPeerType.bot_admin_rights != null) {
                TLRPC$User user = DialogsActivity.this.getMessagesController().getUser(Long.valueOf(DialogsActivity.this.requestPeerBotId));
                MessagesController messagesController = DialogsActivity.this.getMessagesController();
                TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = DialogsActivity.this.requestPeerType.bot_admin_rights;
                DialogsActivity dialogsActivity = DialogsActivity.this;
                messagesController.setUserAdminRole(j, user, tLRPC$TL_chatAdminRights, null, false, dialogsActivity, dialogsActivity.requestPeerType.bot_participant == null || !DialogsActivity.this.requestPeerType.bot_participant.booleanValue(), true, null, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                        boolean run;
                        run = runnable.run();
                        return run;
                    }
                });
                return;
            }
            runnable.run();
        }

        public void lambda$didFinishChatCreation$9(long j, final Runnable runnable) {
            if (DialogsActivity.this.requestPeerType.user_admin_rights != null) {
                DialogsActivity.this.getMessagesController().setUserAdminRole(j, DialogsActivity.this.getAccountInstance().getUserConfig().getCurrentUser(), ChatRightsEditActivity.rightsOR(DialogsActivity.this.getMessagesController().getChat(Long.valueOf(j)).admin_rights, DialogsActivity.this.requestPeerType.user_admin_rights), null, false, DialogsActivity.this, false, true, null, runnable, new MessagesController.ErrorDelegate() {
                    @Override
                    public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                        boolean run;
                        run = runnable.run();
                        return run;
                    }
                });
                return;
            }
            runnable.run();
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
                ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
                arrayList.add(MessagesStorage.TopicKey.of(-j, 0));
                dialogsActivityDelegate.didSelectDialogs(DialogsActivity.this, arrayList, null, false, null);
            }
        }
    }

    private void updateAppUpdateViews(boolean z) {
        boolean z2;
        if (this.updateLayout == null) {
            return;
        }
        if (SharedConfig.isAppUpdateAvailable()) {
            FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
            z2 = getFileLoader().getPathToAttach(SharedConfig.pendingAppUpdate.document, true).exists();
        } else {
            z2 = false;
        }
        if (z2) {
            if (this.updateLayout.getTag() != null) {
                return;
            }
            AnimatorSet animatorSet = this.updateLayoutAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.updateLayout.setVisibility(0);
            this.updateLayout.setTag(1);
            if (z) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.updateLayoutAnimator = animatorSet2;
                animatorSet2.setDuration(180L);
                this.updateLayoutAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.updateLayoutAnimator.playTogether(ObjectAnimator.ofFloat(this.updateLayout, View.TRANSLATION_Y, 0.0f));
                this.updateLayoutAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        DialogsActivity.this.updateLayoutAnimator = null;
                    }
                });
                this.updateLayoutAnimator.start();
                return;
            }
            this.updateLayout.setTranslationY(0.0f);
        } else if (this.updateLayout.getTag() == null) {
        } else {
            this.updateLayout.setTag(null);
            if (z) {
                AnimatorSet animatorSet3 = new AnimatorSet();
                this.updateLayoutAnimator = animatorSet3;
                animatorSet3.setDuration(180L);
                this.updateLayoutAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                this.updateLayoutAnimator.playTogether(ObjectAnimator.ofFloat(this.updateLayout, View.TRANSLATION_Y, AndroidUtilities.dp(48.0f)));
                this.updateLayoutAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (DialogsActivity.this.updateLayout.getTag() == null) {
                            DialogsActivity.this.updateLayout.setVisibility(4);
                        }
                        DialogsActivity.this.updateLayoutAnimator = null;
                    }
                });
                this.updateLayoutAnimator.start();
                return;
            }
            this.updateLayout.setTranslationY(AndroidUtilities.dp(48.0f));
            this.updateLayout.setVisibility(4);
        }
    }

    public void updateContextViewPosition() {
        FilterTabsView filterTabsView = this.filterTabsView;
        float f = 0.0f;
        float measuredHeight = (filterTabsView == null || filterTabsView.getVisibility() == 8) ? 0.0f : this.filterTabsView.getMeasuredHeight();
        ViewPagerFixed.TabsView tabsView = this.searchTabsView;
        float measuredHeight2 = (tabsView == null || tabsView.getVisibility() == 8) ? 0.0f : this.searchTabsView.getMeasuredHeight();
        if (this.fragmentContextView != null) {
            FragmentContextView fragmentContextView = this.fragmentLocationContextView;
            float dp = (fragmentContextView == null || fragmentContextView.getVisibility() != 0) ? 0.0f : AndroidUtilities.dp(36.0f) + 0.0f;
            FragmentContextView fragmentContextView2 = this.fragmentContextView;
            float topPadding = dp + fragmentContextView2.getTopPadding() + this.actionBar.getTranslationY();
            float f2 = this.searchAnimationProgress;
            fragmentContextView2.setTranslationY(topPadding + ((1.0f - f2) * measuredHeight) + (f2 * measuredHeight2) + this.tabsYOffset);
        }
        if (this.fragmentLocationContextView != null) {
            FragmentContextView fragmentContextView3 = this.fragmentContextView;
            if (fragmentContextView3 != null && fragmentContextView3.getVisibility() == 0) {
                f = 0.0f + AndroidUtilities.dp(this.fragmentContextView.getStyleHeight()) + this.fragmentContextView.getTopPadding();
            }
            FragmentContextView fragmentContextView4 = this.fragmentLocationContextView;
            float topPadding2 = f + fragmentContextView4.getTopPadding() + this.actionBar.getTranslationY();
            float f3 = this.searchAnimationProgress;
            fragmentContextView4.setTranslationY(topPadding2 + (measuredHeight * (1.0f - f3)) + (measuredHeight2 * f3) + this.tabsYOffset);
        }
    }

    public void updateFiltersView(boolean r11, java.util.ArrayList<java.lang.Object> r12, java.util.ArrayList<org.telegram.ui.Adapters.FiltersView.DateData> r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.updateFiltersView(boolean, java.util.ArrayList, java.util.ArrayList, boolean, boolean):void");
    }

    private void addSearchFilter(FiltersView.MediaFilterData mediaFilterData) {
        if (this.searchIsShowed) {
            ArrayList<FiltersView.MediaFilterData> currentSearchFilters = this.searchViewPager.getCurrentSearchFilters();
            if (!currentSearchFilters.isEmpty()) {
                for (int i = 0; i < currentSearchFilters.size(); i++) {
                    if (mediaFilterData.isSameType(currentSearchFilters.get(i))) {
                        return;
                    }
                }
            }
            currentSearchFilters.add(mediaFilterData);
            this.actionBar.setSearchFilter(mediaFilterData);
            this.actionBar.setSearchFieldText(BuildConfig.APP_CENTER_HASH);
            updateFiltersView(true, null, null, false, true);
        }
    }

    public void updateSpeedItem(boolean z) {
        boolean z2;
        if (this.speedItem == null) {
            return;
        }
        Iterator<MessageObject> it = getDownloadController().downloadingFiles.iterator();
        while (true) {
            if (!it.hasNext()) {
                z2 = false;
                break;
            }
            MessageObject next = it.next();
            if (next.getDocument() != null && next.getDocument().size >= 157286400) {
                z2 = true;
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
                z2 = true;
                break;
            }
        }
        final boolean z3 = !getUserConfig().isPremium() && !getMessagesController().premiumLocked && z2 && z;
        if (z3 != (this.speedItem.getTag() != null)) {
            this.speedItem.setTag(z3 ? Boolean.TRUE : null);
            this.speedItem.setClickable(z3);
            AnimatorSet animatorSet = this.speedAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.setDuration(180L);
            Animator[] animatorArr = new Animator[3];
            ActionBarMenuItem actionBarMenuItem = this.speedItem;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z3 ? 1.0f : 0.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(actionBarMenuItem, property, fArr);
            ActionBarMenuItem actionBarMenuItem2 = this.speedItem;
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z3 ? 1.0f : 0.5f;
            animatorArr[1] = ObjectAnimator.ofFloat(actionBarMenuItem2, property2, fArr2);
            ActionBarMenuItem actionBarMenuItem3 = this.speedItem;
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z3 ? 1.0f : 0.5f;
            animatorArr[2] = ObjectAnimator.ofFloat(actionBarMenuItem3, property3, fArr3);
            animatorSet2.playTogether(animatorArr);
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 21) {
                        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) DialogsActivity.this.speedItem.getIconView().getDrawable();
                        if (!z3) {
                            if (i >= 23) {
                                animatedVectorDrawable.reset();
                                return;
                            } else {
                                animatedVectorDrawable.setVisible(false, true);
                                return;
                            }
                        }
                        animatedVectorDrawable.start();
                        if (SharedConfig.getDevicePerformanceClass() != 0) {
                            TLRPC$TL_help_premiumPromo premiumPromo = MediaDataController.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).getPremiumPromo();
                            String featureTypeToServerString = PremiumPreviewFragment.featureTypeToServerString(2);
                            if (premiumPromo != null) {
                                int i2 = 0;
                                while (true) {
                                    if (i2 >= premiumPromo.video_sections.size()) {
                                        i2 = -1;
                                        break;
                                    } else if (premiumPromo.video_sections.get(i2).equals(featureTypeToServerString)) {
                                        break;
                                    } else {
                                        i2++;
                                    }
                                }
                                if (i2 != -1) {
                                    FileLoader.getInstance(((BaseFragment) DialogsActivity.this).currentAccount).loadFile(premiumPromo.videos.get(i2), premiumPromo, 3, 0);
                                }
                            }
                        }
                    }
                }
            });
            animatorSet2.start();
            this.speedAnimator = animatorSet2;
        }
    }

    private void createActionMode(String str) {
        if (this.actionBar.actionModeIsExist(str)) {
            return;
        }
        ActionBarMenu createActionMode = this.actionBar.createActionMode(false, str);
        createActionMode.setBackgroundColor(0);
        createActionMode.drawBlur = false;
        NumberTextView numberTextView = new NumberTextView(createActionMode.getContext());
        this.selectedDialogsCountTextView = numberTextView;
        numberTextView.setTextSize(18);
        this.selectedDialogsCountTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.selectedDialogsCountTextView.setTextColor(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon));
        createActionMode.addView(this.selectedDialogsCountTextView, LayoutHelper.createLinear(0, -1, 1.0f, 72, 0, 0, 0));
        this.selectedDialogsCountTextView.setOnTouchListener(DialogsActivity$$ExternalSyntheticLambda39.INSTANCE);
        int i = R.drawable.msg_pin;
        this.pinItem = createActionMode.addItemWithWidth(100, i, AndroidUtilities.dp(54.0f));
        this.muteItem = createActionMode.addItemWithWidth(104, R.drawable.msg_mute, AndroidUtilities.dp(54.0f));
        int i2 = R.drawable.msg_archive;
        this.archive2Item = createActionMode.addItemWithWidth(107, i2, AndroidUtilities.dp(54.0f));
        this.deleteItem = createActionMode.addItemWithWidth(102, R.drawable.msg_delete, AndroidUtilities.dp(54.0f), LocaleController.getString("Delete", R.string.Delete));
        ActionBarMenuItem addItemWithWidth = createActionMode.addItemWithWidth(0, R.drawable.ic_ab_other, AndroidUtilities.dp(54.0f), LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        this.archiveItem = addItemWithWidth.addSubItem(105, i2, LocaleController.getString("Archive", R.string.Archive));
        this.pin2Item = addItemWithWidth.addSubItem(108, i, LocaleController.getString("DialogPin", R.string.DialogPin));
        this.addToFolderItem = addItemWithWidth.addSubItem(109, R.drawable.msg_addfolder, LocaleController.getString("FilterAddTo", R.string.FilterAddTo));
        this.removeFromFolderItem = addItemWithWidth.addSubItem(110, R.drawable.msg_removefolder, LocaleController.getString("FilterRemoveFrom", R.string.FilterRemoveFrom));
        this.readItem = addItemWithWidth.addSubItem(FileLoader.MEDIA_DIR_VIDEO_PUBLIC, R.drawable.msg_markread, LocaleController.getString("MarkAsRead", R.string.MarkAsRead));
        this.clearItem = addItemWithWidth.addSubItem(103, R.drawable.msg_clear, LocaleController.getString("ClearHistory", R.string.ClearHistory));
        this.blockItem = addItemWithWidth.addSubItem(106, R.drawable.msg_block, LocaleController.getString("BlockUser", R.string.BlockUser));
        this.muteItem.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public final boolean onLongClick(View view) {
                boolean lambda$createActionMode$36;
                lambda$createActionMode$36 = DialogsActivity.this.lambda$createActionMode$36(view);
                return lambda$createActionMode$36;
            }
        });
        this.actionModeViews.add(this.pinItem);
        this.actionModeViews.add(this.archive2Item);
        this.actionModeViews.add(this.muteItem);
        this.actionModeViews.add(this.deleteItem);
        this.actionModeViews.add(addItemWithWidth);
        if (str == null) {
            this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass34());
        }
    }

    public boolean lambda$createActionMode$36(View view) {
        performSelectedDialogsAction(this.selectedDialogs, 104, true, true);
        return true;
    }

    public class AnonymousClass34 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass34() {
        }

        @Override
        public void onItemClick(int i) {
            if ((i == 201 || i == 200 || i == 202 || i == 203) && DialogsActivity.this.searchViewPager != null) {
                DialogsActivity.this.searchViewPager.onActionBarItemClick(i);
            } else if (i == -1) {
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
                        } else if (!DialogsActivity.this.onlySelect && DialogsActivity.this.folderId == 0) {
                            if (((BaseFragment) DialogsActivity.this).parentLayout != null) {
                                ((BaseFragment) DialogsActivity.this).parentLayout.getDrawerLayoutContainer().openDrawer(false);
                                return;
                            }
                            return;
                        } else {
                            DialogsActivity.this.finishFragment();
                            return;
                        }
                    }
                    DialogsActivity.this.filterTabsView.setIsEditing(false);
                    DialogsActivity.this.showDoneItem(false);
                } else if (((BaseFragment) DialogsActivity.this).actionBar.isActionModeShowed()) {
                    if (DialogsActivity.this.searchViewPager == null || DialogsActivity.this.searchViewPager.getVisibility() != 0 || !DialogsActivity.this.searchViewPager.actionModeShowing()) {
                        DialogsActivity.this.hideActionMode(true);
                    } else {
                        DialogsActivity.this.searchViewPager.hideActionMode();
                    }
                } else {
                    DialogsActivity.this.rightSlidingDialogContainer.lambda$presentFragment$1();
                    DialogsActivity.this.searchViewPager.updateTabs();
                }
            } else if (i == 1) {
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
                        DialogsActivity.AnonymousClass34.this.lambda$onItemClick$0();
                    }
                }, new Runnable() {
                    @Override
                    public final void run() {
                        DialogsActivity.AnonymousClass34.this.lambda$onItemClick$1();
                    }
                });
                DialogsActivity.this.getNotificationsController().showNotifications();
                DialogsActivity.this.updatePasscodeButton();
            } else if (i == 2) {
                DialogsActivity.this.presentFragment(new ProxyListActivity());
            } else if (i == 3) {
                DialogsActivity.this.showSearch(true, true, true);
                ((BaseFragment) DialogsActivity.this).actionBar.openSearchField(true);
            } else if (i >= 10 && i < 14) {
                if (DialogsActivity.this.getParentActivity() == null) {
                    return;
                }
                DialogsActivityDelegate dialogsActivityDelegate = DialogsActivity.this.delegate;
                LaunchActivity launchActivity = (LaunchActivity) DialogsActivity.this.getParentActivity();
                launchActivity.switchToAccount(i - 10, true);
                DialogsActivity dialogsActivity = new DialogsActivity(((BaseFragment) DialogsActivity.this).arguments);
                dialogsActivity.setDelegate(dialogsActivityDelegate);
                launchActivity.presentFragment(dialogsActivity, false, true);
            } else if (i == 109) {
                DialogsActivity dialogsActivity2 = DialogsActivity.this;
                FiltersListBottomSheet filtersListBottomSheet = new FiltersListBottomSheet(dialogsActivity2, dialogsActivity2.selectedDialogs);
                filtersListBottomSheet.setDelegate(new FiltersListBottomSheet.FiltersListBottomSheetDelegate() {
                    @Override
                    public final void didSelectFilter(MessagesController.DialogFilter dialogFilter) {
                        DialogsActivity.AnonymousClass34.this.lambda$onItemClick$2(dialogFilter);
                    }
                });
                DialogsActivity.this.showDialog(filtersListBottomSheet);
            } else if (i != 110) {
                if (i == 100 || i == 101 || i == 102 || i == 103 || i == 104 || i == 105 || i == 106 || i == 107 || i == 108) {
                    DialogsActivity dialogsActivity3 = DialogsActivity.this;
                    dialogsActivity3.performSelectedDialogsAction(dialogsActivity3.selectedDialogs, i, true, false);
                }
            } else {
                MessagesController.DialogFilter dialogFilter = DialogsActivity.this.getMessagesController().getDialogFilters().get(DialogsActivity.this.viewPages[0].selectedType);
                DialogsActivity dialogsActivity4 = DialogsActivity.this;
                ArrayList<Long> dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity4, dialogFilter, dialogsActivity4.selectedDialogs, false, false);
                if ((dialogFilter != null ? dialogFilter.neverShow.size() : 0) + dialogsCount.size() > 100) {
                    DialogsActivity dialogsActivity5 = DialogsActivity.this;
                    dialogsActivity5.showDialog(AlertsCreator.createSimpleAlert(dialogsActivity5.getParentActivity(), LocaleController.getString("FilterAddToAlertFullTitle", R.string.FilterAddToAlertFullTitle), LocaleController.getString("FilterAddToAlertFullText", R.string.FilterAddToAlertFullText)).create());
                    return;
                }
                if (!dialogsCount.isEmpty()) {
                    dialogFilter.neverShow.addAll(dialogsCount);
                    for (int i2 = 0; i2 < dialogsCount.size(); i2++) {
                        Long l = dialogsCount.get(i2);
                        dialogFilter.alwaysShow.remove(l);
                        dialogFilter.pinnedDialogs.delete(l.longValue());
                    }
                    if (dialogFilter.isChatlist()) {
                        dialogFilter.neverShow.clear();
                    }
                    FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, false, false, DialogsActivity.this, null);
                }
                long longValue = dialogsCount.size() == 1 ? dialogsCount.get(0).longValue() : 0L;
                UndoView undoView = DialogsActivity.this.getUndoView();
                if (undoView != null) {
                    undoView.showWithAction(longValue, 21, Integer.valueOf(dialogsCount.size()), dialogFilter, (Runnable) null, (Runnable) null);
                }
                DialogsActivity.this.hideActionMode(false);
            }
        }

        public void lambda$onItemClick$0() {
            DialogsActivity.this.passcodeItem.setAlpha(1.0f);
        }

        public void lambda$onItemClick$1() {
            DialogsActivity.this.passcodeItem.setAlpha(0.0f);
        }

        public void lambda$onItemClick$2(MessagesController.DialogFilter dialogFilter) {
            ArrayList<Long> arrayList;
            ArrayList<Long> arrayList2;
            long j;
            DialogsActivity dialogsActivity = DialogsActivity.this;
            ArrayList<Long> dialogsCount = FiltersListBottomSheet.getDialogsCount(dialogsActivity, dialogFilter, dialogsActivity.selectedDialogs, true, false);
            int size = (dialogFilter != null ? dialogFilter.alwaysShow.size() : 0) + dialogsCount.size();
            if ((size <= DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitDefault || DialogsActivity.this.getUserConfig().isPremium()) && size <= DialogsActivity.this.getMessagesController().dialogFiltersChatsLimitPremium) {
                if (dialogFilter != null) {
                    if (dialogsCount.isEmpty()) {
                        arrayList = dialogsCount;
                    } else {
                        for (int i = 0; i < dialogsCount.size(); i++) {
                            dialogFilter.neverShow.remove(dialogsCount.get(i));
                        }
                        dialogFilter.alwaysShow.addAll(dialogsCount);
                        arrayList = dialogsCount;
                        FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, DialogsActivity.this, null);
                    }
                    if (arrayList.size() == 1) {
                        arrayList2 = arrayList;
                        j = arrayList2.get(0).longValue();
                    } else {
                        arrayList2 = arrayList;
                        j = 0;
                    }
                    UndoView undoView = DialogsActivity.this.getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(j, 20, Integer.valueOf(arrayList2.size()), dialogFilter, (Runnable) null, (Runnable) null);
                    }
                } else {
                    DialogsActivity.this.presentFragment(new FilterCreateActivity(null, dialogsCount));
                }
                DialogsActivity.this.hideActionMode(true);
                return;
            }
            DialogsActivity dialogsActivity2 = DialogsActivity.this;
            DialogsActivity dialogsActivity3 = DialogsActivity.this;
            dialogsActivity2.showDialog(new LimitReachedBottomSheet(dialogsActivity3, ((BaseFragment) dialogsActivity3).fragmentView.getContext(), 4, ((BaseFragment) DialogsActivity.this).currentAccount));
        }
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
            } else if (dialogFilters.get(i2).id == i) {
                tabsCount = i2;
                break;
            } else {
                i2++;
            }
        }
        FilterTabsView.Tab tab = this.filterTabsView.getTab(tabsCount);
        if (tab != null) {
            this.filterTabsView.scrollToTab(tab, tabsCount);
        } else {
            this.filterTabsView.selectLastTab();
        }
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
        if (viewPageArr[z ? 1 : 0].selectedType < 0 || this.viewPages[z ? 1 : 0].selectedType >= getMessagesController().getDialogFilters().size()) {
            return;
        }
        MessagesController.DialogFilter dialogFilter = getMessagesController().getDialogFilters().get(this.viewPages[z ? 1 : 0].selectedType);
        if (dialogFilter.isDefault()) {
            this.viewPages[z ? 1 : 0].dialogsType = this.initialDialogsType;
            this.viewPages[z ? 1 : 0].listView.updatePullState();
        } else {
            if (this.viewPages[!z ? 1 : 0].dialogsType == 7) {
                this.viewPages[z ? 1 : 0].dialogsType = 8;
            } else {
                this.viewPages[z ? 1 : 0].dialogsType = 7;
            }
            this.viewPages[z ? 1 : 0].listView.setScrollEnabled(true);
            getMessagesController().selectDialogFilter(dialogFilter, this.viewPages[z ? 1 : 0].dialogsType == 8 ? 1 : 0);
        }
        this.viewPages[1].isLocked = dialogFilter.locked;
        this.viewPages[z ? 1 : 0].dialogsAdapter.setDialogsType(this.viewPages[z ? 1 : 0].dialogsType);
        LinearLayoutManager linearLayoutManager = this.viewPages[z ? 1 : 0].layoutManager;
        if (this.viewPages[z ? 1 : 0].dialogsType == 0 && hasHiddenArchive() && this.viewPages[z ? 1 : 0].archivePullViewState == 2) {
            i = 1;
        }
        linearLayoutManager.scrollToPositionWithOffset(i, (int) this.actionBar.getTranslationY());
        checkListLoad(this.viewPages[z ? 1 : 0]);
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

    private void updateFilterTabs(boolean z, boolean z2) {
        int findFirstVisibleItemPosition;
        ViewPage[] viewPageArr;
        MessagesController.DialogFilter dialogFilter;
        boolean z3;
        int i;
        if (this.filterTabsView == null || this.inPreviewMode || this.searchIsShowed) {
            return;
        }
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.filterOptions = null;
        }
        ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
        boolean z4 = true;
        if (dialogFilters.size() > 1) {
            if (z || this.filterTabsView.getVisibility() != 0) {
                boolean z5 = this.filterTabsView.getVisibility() != 0 ? false : z2;
                this.canShowFilterTabsView = true;
                boolean isEmpty = this.filterTabsView.isEmpty();
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
                int i2 = 0;
                while (i2 < size) {
                    if (dialogFilters.get(i2).isDefault()) {
                        i = i2;
                        this.filterTabsView.addTab(i2, 0, LocaleController.getString("FilterAllChats", R.string.FilterAllChats), true, dialogFilters.get(i2).locked);
                    } else {
                        i = i2;
                        this.filterTabsView.addTab(i, dialogFilters.get(i).localId, dialogFilters.get(i).name, false, dialogFilters.get(i).locked);
                    }
                    i2 = i + 1;
                }
                if (currentTabStableId >= 0) {
                    if (z3 && !this.filterTabsView.selectTabWithStableId(currentTabStableId)) {
                        while (currentTabId >= 0) {
                            FilterTabsView filterTabsView = this.filterTabsView;
                            if (filterTabsView.selectTabWithStableId(filterTabsView.getStableId(currentTabId))) {
                                break;
                            }
                            currentTabId--;
                        }
                        if (currentTabId < 0) {
                            currentTabId = 0;
                        }
                    }
                    if (this.filterTabsView.getStableId(this.viewPages[0].selectedType) != currentTabStableId) {
                        this.viewPages[0].selectedType = currentTabId;
                        isEmpty = true;
                    }
                }
                int i3 = 0;
                while (true) {
                    ViewPage[] viewPageArr2 = this.viewPages;
                    if (i3 >= viewPageArr2.length) {
                        break;
                    }
                    if (viewPageArr2[i3].selectedType >= dialogFilters.size()) {
                        this.viewPages[i3].selectedType = dialogFilters.size() - 1;
                    }
                    this.viewPages[i3].listView.setScrollingTouchSlop(1);
                    i3++;
                }
                this.filterTabsView.finishAddingTabs(z5);
                if (isEmpty) {
                    switchToCurrentSelectedMode(false);
                }
                this.isFirstTab = currentTabId == this.filterTabsView.getFirstTabId();
                updateDrawerSwipeEnabled();
                FilterTabsView filterTabsView2 = this.filterTabsView;
                if (filterTabsView2.isLocked(filterTabsView2.getCurrentTabId())) {
                    this.filterTabsView.selectFirstTab();
                }
            }
        } else {
            if (this.filterTabsView.getVisibility() != 8) {
                this.filterTabsView.setIsEditing(false);
                showDoneItem(false);
                this.maybeStartTracking = false;
                if (this.startedTracking) {
                    this.startedTracking = false;
                    this.viewPages[0].setTranslationX(0.0f);
                    this.viewPages[1].setTranslationX(viewPageArr[0].getMeasuredWidth());
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
                int i4 = 0;
                while (true) {
                    ViewPage[] viewPageArr3 = this.viewPages;
                    if (i4 >= viewPageArr3.length) {
                        break;
                    }
                    if (viewPageArr3[i4].dialogsType == 0 && this.viewPages[i4].archivePullViewState == 2 && hasHiddenArchive() && ((findFirstVisibleItemPosition = this.viewPages[i4].layoutManager.findFirstVisibleItemPosition()) == 0 || findFirstVisibleItemPosition == 1)) {
                        this.viewPages[i4].layoutManager.scrollToPositionWithOffset(1, (int) this.actionBar.getTranslationY());
                    }
                    this.viewPages[i4].listView.setScrollingTouchSlop(0);
                    this.viewPages[i4].listView.requestLayout();
                    this.viewPages[i4].requestLayout();
                    i4++;
                }
                this.filterTabsView.resetTabId();
            }
            updateDrawerSwipeEnabled();
        }
        updateCounters(false);
        int i5 = this.viewPages[0].dialogsType;
        if ((i5 == 7 || i5 == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[i5 - 7]) != null) {
            int i6 = 0;
            while (true) {
                if (i6 >= dialogFilters.size()) {
                    z4 = false;
                    break;
                }
                MessagesController.DialogFilter dialogFilter2 = dialogFilters.get(i6);
                if (dialogFilter2 != null && dialogFilter2.id == dialogFilter.id) {
                    break;
                }
                i6++;
            }
            if (z4) {
                return;
            }
            switchToCurrentSelectedMode(false);
        }
    }

    public void updateDrawerSwipeEnabled() {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || iNavigationLayout.getDrawerLayoutContainer() == null) {
            return;
        }
        this.parentLayout.getDrawerLayoutContainer().setAllowOpenDrawerBySwipe(((this.isFirstTab && SharedConfig.getChatSwipeAction(this.currentAccount) == 5) || SharedConfig.getChatSwipeAction(this.currentAccount) != 5) && !this.searchIsShowed && ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment()));
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
        int i;
        View view;
        super.onResume();
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null) {
            rightSlidingDialogContainer.onResume();
        }
        if (!this.parentLayout.isInPreviewMode() && (view = this.blurredView) != null && view.getVisibility() == 0) {
            this.blurredView.setVisibility(8);
            this.blurredView.setBackground(null);
        }
        updateDrawerSwipeEnabled();
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
        if (!this.onlySelect && this.folderId == 0) {
            getMediaDataController().checkStickers(4);
        }
        SearchViewPager searchViewPager = this.searchViewPager;
        if (searchViewPager != null) {
            searchViewPager.onResume();
        }
        if ((this.afterSignup || getUserConfig().unacceptedTermsOfService == null) && this.checkPermission && !this.onlySelect && (i = Build.VERSION.SDK_INT) >= 23) {
            final Activity parentActivity = getParentActivity();
            if (parentActivity != null) {
                this.checkPermission = false;
                final boolean z = parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0;
                final boolean z2 = (i <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        DialogsActivity.this.lambda$onResume$38(z, z2, parentActivity);
                    }
                }, (this.afterSignup && z) ? 4000L : 0L);
            }
        } else if (!this.onlySelect && XiaomiUtilities.isMIUI() && Build.VERSION.SDK_INT >= 19 && !XiaomiUtilities.isCustomPermissionGranted(XiaomiUtilities.OP_SHOW_WHEN_LOCKED)) {
            if (getParentActivity() == null || MessagesController.getGlobalNotificationsSettings().getBoolean("askedAboutMiuiLockscreen", false)) {
                return;
            }
            showDialog(new AlertDialog.Builder(getParentActivity()).setTopAnimation(R.raw.permission_request_apk, 72, false, Theme.getColor(Theme.key_dialogTopBackground)).setMessage(LocaleController.getString("PermissionXiaomiLockscreen", R.string.PermissionXiaomiLockscreen)).setPositiveButton(LocaleController.getString("PermissionOpenSettings", R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    DialogsActivity.this.lambda$onResume$39(dialogInterface, i3);
                }
            }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", R.string.ContactsPermissionAlertNotNow), DialogsActivity$$ExternalSyntheticLambda18.INSTANCE).create());
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
                    this.viewPages[i3].layoutManager.scrollToPositionWithOffset(1, (int) this.actionBar.getTranslationY());
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
            public int getBottomOffset(int i4) {
                return Bulletin.Delegate.CC.$default$getBottomOffset(this, i4);
            }

            @Override
            public void onHide(Bulletin bulletin) {
                Bulletin.Delegate.CC.$default$onHide(this, bulletin);
            }

            @Override
            public void onBottomOffsetChange(float f) {
                if (DialogsActivity.this.undoView[0] == null || DialogsActivity.this.undoView[0].getVisibility() != 0) {
                    DialogsActivity.this.additionalFloatingTranslation = f;
                    if (DialogsActivity.this.additionalFloatingTranslation < 0.0f) {
                        DialogsActivity.this.additionalFloatingTranslation = 0.0f;
                    }
                    if (DialogsActivity.this.floatingHidden) {
                        return;
                    }
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
                int i5 = 0;
                int measuredHeight = (((BaseFragment) DialogsActivity.this).actionBar != null ? ((BaseFragment) DialogsActivity.this).actionBar.getMeasuredHeight() + ((int) ((BaseFragment) DialogsActivity.this).actionBar.getTranslationY()) : 0) + ((DialogsActivity.this.filterTabsView == null || DialogsActivity.this.filterTabsView.getVisibility() != 0) ? 0 : DialogsActivity.this.filterTabsView.getMeasuredHeight()) + ((DialogsActivity.this.fragmentContextView == null || !DialogsActivity.this.fragmentContextView.isCallTypeVisible()) ? 0 : AndroidUtilities.dp(DialogsActivity.this.fragmentContextView.getStyleHeight()));
                if (DialogsActivity.this.dialogsHintCell != null && DialogsActivity.this.dialogsHintCell.getVisibility() == 0) {
                    i5 = DialogsActivity.this.dialogsHintCell.getHeight();
                }
                return measuredHeight + i5;
            }
        });
        if (this.searchIsShowed) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        updateVisibleRows(0, false);
        updateProxyButton(false, true);
        checkSuggestClearDatabase();
    }

    public void lambda$onResume$38(boolean z, boolean z2, Activity activity) {
        this.afterSignup = false;
        if (z || z2) {
            this.askingForPermissions = true;
            if (z && this.askAboutContacts && getUserConfig().syncContacts && activity.shouldShowRequestPermissionRationale("android.permission.READ_CONTACTS")) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(activity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        DialogsActivity.this.lambda$onResume$37(i);
                    }
                }).create();
                this.permissionDialog = create;
                showDialog(create);
            } else if (z2 && activity.shouldShowRequestPermissionRationale("android.permission.WRITE_EXTERNAL_STORAGE")) {
                if (activity instanceof BasePermissionsActivity) {
                    AlertDialog createPermissionErrorAlert = ((BasePermissionsActivity) activity).createPermissionErrorAlert(R.raw.permission_request_folder, LocaleController.getString(R.string.PermissionStorageWithHint));
                    this.permissionDialog = createPermissionErrorAlert;
                    showDialog(createPermissionErrorAlert);
                }
            } else {
                askForPermissons(true);
            }
        }
    }

    public void lambda$onResume$37(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).apply();
        askForPermissons(false);
    }

    public void lambda$onResume$39(DialogInterface dialogInterface, int i) {
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

    public static void lambda$onResume$40(DialogInterface dialogInterface, int i) {
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askedAboutMiuiLockscreen", true).commit();
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        boolean presentFragment = super.presentFragment(baseFragment);
        if (presentFragment && this.viewPages != null) {
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
        return presentFragment;
    }

    @Override
    public void onPause() {
        super.onPause();
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
        UndoView[] undoViewArr = this.undoView;
        int i = 0;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
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
    public boolean onBackPressed() {
        if (this.rightSlidingDialogContainer.hasFragment()) {
            if (this.rightSlidingDialogContainer.getFragment().onBackPressed()) {
                this.rightSlidingDialogContainer.lambda$presentFragment$1();
                this.searchViewPager.updateTabs();
            }
            return false;
        }
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
            this.filterOptions = null;
            return false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.isEditing()) {
            this.filterTabsView.setIsEditing(false);
            showDoneItem(false);
            return false;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.isActionModeShowed()) {
            if (this.searchViewPager.getVisibility() == 0) {
                this.searchViewPager.hideActionMode();
                hideActionMode(true);
            } else {
                hideActionMode(true);
            }
            return false;
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0 && !this.tabsAnimationInProgress && !this.filterTabsView.isAnimatingIndicator() && !this.startedTracking && !this.filterTabsView.isFirstTabSelected()) {
            this.filterTabsView.selectFirstTab();
            return false;
        }
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        if (chatActivityEnterView != null && chatActivityEnterView.isPopupShowing()) {
            this.commentView.hidePopup(true);
            return false;
        }
        return super.onBackPressed();
    }

    @Override
    public void onBecomeFullyHidden() {
        if (this.closeSearchFieldOnHide) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                this.searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                this.searchObject = null;
            }
            this.closeSearchFieldOnHide = false;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.getVisibility() == 0 && this.filterTabsViewIsVisible) {
            int i = (int) (-this.actionBar.getTranslationY());
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
            if (i != 0 && i != currentActionBarHeight) {
                if (i >= currentActionBarHeight / 2) {
                    if (this.viewPages[0].listView.canScrollVertically(1)) {
                        setScrollY(-currentActionBarHeight);
                    }
                } else {
                    setScrollY(0.0f);
                }
            }
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
    }

    @Override
    public void setInPreviewMode(boolean z) {
        super.setInPreviewMode(z);
        if (z || this.avatarContainer == null) {
            return;
        }
        this.actionBar.setBackground(null);
        ((ViewGroup.MarginLayoutParams) this.actionBar.getLayoutParams()).topMargin = 0;
        this.actionBar.removeView(this.avatarContainer);
        this.avatarContainer = null;
        updateFilterTabs(false, false);
        this.floatingButton.setVisibility(0);
        ContentView contentView = (ContentView) this.fragmentView;
        FragmentContextView fragmentContextView = this.fragmentContextView;
        if (fragmentContextView != null) {
            contentView.addView(fragmentContextView);
        }
        FragmentContextView fragmentContextView2 = this.fragmentLocationContextView;
        if (fragmentContextView2 != null) {
            contentView.addView(fragmentContextView2);
        }
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
        this.actionBar.openSearchField(str, false);
    }

    public void showSearch(final boolean z, boolean z2, boolean z3) {
        FilterTabsView filterTabsView;
        RightSlidingDialogContainer rightSlidingDialogContainer;
        int i;
        if (!z) {
            updateSpeedItem(false);
        }
        int i2 = this.initialDialogsType;
        boolean z4 = (i2 == 0 || i2 == 3) ? z3 : false;
        AnimatorSet animatorSet = this.searchAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.searchAnimator = null;
        }
        Animator animator = this.tabsAlphaAnimator;
        if (animator != null) {
            animator.cancel();
            this.tabsAlphaAnimator = null;
        }
        this.searchIsShowed = z;
        ((SizeNotifierFrameLayout) this.fragmentView).invalidateBlur();
        if (z) {
            boolean onlyDialogsAdapter = this.searchFiltersWasShowed ? false : onlyDialogsAdapter();
            this.searchViewPager.showOnlyDialogsAdapter(onlyDialogsAdapter);
            boolean z5 = !onlyDialogsAdapter;
            this.whiteActionBar = z5;
            if (z5) {
                this.searchFiltersWasShowed = true;
            }
            ContentView contentView = (ContentView) this.fragmentView;
            ViewPagerFixed.TabsView tabsView = this.searchTabsView;
            if (tabsView == null && !onlyDialogsAdapter) {
                this.searchTabsView = this.searchViewPager.createTabsView(false, 8);
                if (this.filtersView != null) {
                    i = 0;
                    while (i < contentView.getChildCount()) {
                        if (contentView.getChildAt(i) == this.filtersView) {
                            break;
                        }
                        i++;
                    }
                }
                i = -1;
                if (i > 0) {
                    contentView.addView(this.searchTabsView, i, LayoutHelper.createFrame(-1, 44.0f));
                } else {
                    contentView.addView(this.searchTabsView, LayoutHelper.createFrame(-1, 44.0f));
                }
            } else if (tabsView != null && onlyDialogsAdapter) {
                ViewParent parent = tabsView.getParent();
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(this.searchTabsView);
                }
                this.searchTabsView = null;
            }
            EditTextBoldCursor searchField = this.searchItem.getSearchField();
            if (this.whiteActionBar) {
                searchField.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                searchField.setHintTextColor(Theme.getColor(Theme.key_player_time));
                searchField.setCursorColor(Theme.getColor(Theme.key_chat_messagePanelCursor));
            } else {
                int i3 = Theme.key_actionBarDefaultSearch;
                searchField.setCursorColor(Theme.getColor(i3));
                searchField.setHintTextColor(Theme.getColor(Theme.key_actionBarDefaultSearchPlaceholder));
                searchField.setTextColor(Theme.getColor(i3));
            }
            this.searchViewPager.setKeyboardHeight(((ContentView) this.fragmentView).getKeyboardHeight());
            updateDrawerSwipeEnabled();
            this.searchViewPager.clear();
            if (this.folderId != 0 && ((rightSlidingDialogContainer = this.rightSlidingDialogContainer) == null || !rightSlidingDialogContainer.hasFragment())) {
                addSearchFilter(new FiltersView.MediaFilterData(R.drawable.chats_archive, R.string.ArchiveSearchFilter, (TLRPC$MessagesFilter) null, 7));
            }
        } else {
            updateDrawerSwipeEnabled();
        }
        if (z4 && this.searchViewPager.dialogsSearchAdapter.hasRecentSearch()) {
            AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
        if (!z && (filterTabsView = this.filterTabsView) != null && this.canShowFilterTabsView) {
            filterTabsView.setVisibility(0);
        }
        boolean z6 = SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(LiteMode.FLAG_CHAT_SCALE);
        if (z4) {
            if (!z) {
                this.viewPages[0].listView.setVisibility(0);
                this.viewPages[0].setVisibility(0);
            } else {
                this.searchViewPager.setVisibility(0);
                this.searchViewPager.reset();
                updateFiltersView(true, null, null, false, false);
                ViewPagerFixed.TabsView tabsView2 = this.searchTabsView;
                if (tabsView2 != null) {
                    tabsView2.hide(false, false);
                    this.searchTabsView.setVisibility(0);
                }
            }
            setDialogsListFrozen(true);
            this.viewPages[0].listView.setVerticalScrollBarEnabled(false);
            SearchViewPager searchViewPager = this.searchViewPager;
            int i4 = Theme.key_windowBackgroundWhite;
            searchViewPager.setBackgroundColor(Theme.getColor(i4));
            this.searchAnimator = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            ViewPage viewPage = this.viewPages[0];
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(viewPage, property, fArr));
            if (!z6) {
                ViewPage viewPage2 = this.viewPages[0];
                Property property2 = View.SCALE_X;
                float[] fArr2 = new float[1];
                fArr2[0] = z ? 0.9f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(viewPage2, property2, fArr2));
                ViewPage viewPage3 = this.viewPages[0];
                Property property3 = View.SCALE_Y;
                float[] fArr3 = new float[1];
                fArr3[0] = z ? 0.9f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(viewPage3, property3, fArr3));
            } else {
                this.viewPages[0].setScaleX(1.0f);
                this.viewPages[0].setScaleY(1.0f);
            }
            RightSlidingDialogContainer rightSlidingDialogContainer2 = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer2 != null) {
                rightSlidingDialogContainer2.setVisibility(0);
                RightSlidingDialogContainer rightSlidingDialogContainer3 = this.rightSlidingDialogContainer;
                Property property4 = View.ALPHA;
                float[] fArr4 = new float[1];
                fArr4[0] = z ? 0.0f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(rightSlidingDialogContainer3, property4, fArr4));
            }
            SearchViewPager searchViewPager2 = this.searchViewPager;
            Property property5 = View.ALPHA;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.0f;
            arrayList.add(ObjectAnimator.ofFloat(searchViewPager2, property5, fArr5));
            if (!z6) {
                SearchViewPager searchViewPager3 = this.searchViewPager;
                Property property6 = View.SCALE_X;
                float[] fArr6 = new float[1];
                fArr6[0] = z ? 1.0f : 1.05f;
                arrayList.add(ObjectAnimator.ofFloat(searchViewPager3, property6, fArr6));
                SearchViewPager searchViewPager4 = this.searchViewPager;
                Property property7 = View.SCALE_Y;
                float[] fArr7 = new float[1];
                fArr7[0] = z ? 1.0f : 1.05f;
                arrayList.add(ObjectAnimator.ofFloat(searchViewPager4, property7, fArr7));
            } else {
                this.searchViewPager.setScaleX(1.0f);
                this.searchViewPager.setScaleY(1.0f);
            }
            ActionBarMenuItem actionBarMenuItem = this.passcodeItem;
            if (actionBarMenuItem != null) {
                RLottieImageView iconView = actionBarMenuItem.getIconView();
                Property property8 = View.ALPHA;
                float[] fArr8 = new float[1];
                fArr8[0] = z ? 0.0f : 1.0f;
                arrayList.add(ObjectAnimator.ofFloat(iconView, property8, fArr8));
            }
            ActionBarMenuItem actionBarMenuItem2 = this.downloadsItem;
            if (actionBarMenuItem2 != null) {
                if (z) {
                    actionBarMenuItem2.setAlpha(0.0f);
                } else {
                    arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, View.ALPHA, 1.0f));
                }
                updateProxyButton(false, false);
            }
            FilterTabsView filterTabsView2 = this.filterTabsView;
            if (filterTabsView2 != null && filterTabsView2.getVisibility() == 0) {
                RecyclerListView tabsContainer = this.filterTabsView.getTabsContainer();
                Property property9 = View.ALPHA;
                float[] fArr9 = new float[1];
                fArr9[0] = z ? 0.0f : 1.0f;
                ObjectAnimator duration = ObjectAnimator.ofFloat(tabsContainer, property9, fArr9).setDuration(100L);
                this.tabsAlphaAnimator = duration;
                duration.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator2) {
                        DialogsActivity.this.tabsAlphaAnimator = null;
                    }
                });
            }
            float[] fArr10 = new float[2];
            fArr10[0] = this.searchAnimationProgress;
            fArr10[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr10);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DialogsActivity.this.lambda$showSearch$41(valueAnimator);
                }
            });
            arrayList.add(ofFloat);
            this.searchAnimator.playTogether(arrayList);
            this.searchAnimator.setDuration(z ? 200L : 180L);
            this.searchAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            if (this.filterTabsViewIsVisible) {
                int color = Theme.getColor(this.folderId == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
                int color2 = Theme.getColor(i4);
                this.searchAnimationTabsDelayedCrossfade = ((float) ((Math.abs(Color.red(color) - Color.red(color2)) + Math.abs(Color.green(color) - Color.green(color2))) + Math.abs(Color.blue(color) - Color.blue(color2)))) / 255.0f > 0.3f;
            } else {
                this.searchAnimationTabsDelayedCrossfade = true;
            }
            if (!z) {
                this.searchAnimator.setStartDelay(20L);
                Animator animator2 = this.tabsAlphaAnimator;
                if (animator2 != null) {
                    if (this.searchAnimationTabsDelayedCrossfade) {
                        animator2.setStartDelay(80L);
                        this.tabsAlphaAnimator.setDuration(100L);
                    } else {
                        animator2.setDuration(z ? 200L : 180L);
                    }
                }
            }
            this.searchAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator3) {
                    DialogsActivity.this.notificationsLocker.unlock();
                    if (DialogsActivity.this.searchAnimator != animator3) {
                        return;
                    }
                    DialogsActivity.this.setDialogsListFrozen(false);
                    if (!z) {
                        DialogsActivity.this.searchItem.collapseSearchFilters();
                        DialogsActivity dialogsActivity = DialogsActivity.this;
                        dialogsActivity.whiteActionBar = false;
                        dialogsActivity.searchViewPager.setVisibility(8);
                        if (DialogsActivity.this.searchTabsView != null) {
                            DialogsActivity.this.searchTabsView.setVisibility(8);
                        }
                        DialogsActivity.this.searchItem.clearSearchFilters();
                        DialogsActivity.this.searchViewPager.clear();
                        DialogsActivity.this.filtersView.setVisibility(8);
                        DialogsActivity.this.viewPages[0].listView.show();
                        if (!DialogsActivity.this.onlySelect) {
                            DialogsActivity.this.hideFloatingButton(false);
                        }
                        DialogsActivity.this.searchWasFullyShowed = false;
                        RightSlidingDialogContainer rightSlidingDialogContainer4 = DialogsActivity.this.rightSlidingDialogContainer;
                        if (rightSlidingDialogContainer4 != null) {
                            rightSlidingDialogContainer4.setVisibility(0);
                        }
                    } else {
                        DialogsActivity.this.viewPages[0].listView.hide();
                        if (DialogsActivity.this.filterTabsView != null) {
                            DialogsActivity.this.filterTabsView.setVisibility(8);
                        }
                        DialogsActivity.this.searchWasFullyShowed = true;
                        AndroidUtilities.requestAdjustResize(DialogsActivity.this.getParentActivity(), ((BaseFragment) DialogsActivity.this).classGuid);
                        DialogsActivity.this.searchItem.setVisibility(8);
                        RightSlidingDialogContainer rightSlidingDialogContainer5 = DialogsActivity.this.rightSlidingDialogContainer;
                        if (rightSlidingDialogContainer5 != null) {
                            rightSlidingDialogContainer5.setVisibility(8);
                        }
                    }
                    if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                        ((BaseFragment) DialogsActivity.this).fragmentView.requestLayout();
                    }
                    DialogsActivity.this.setSearchAnimationProgress(z ? 1.0f : 0.0f, false);
                    DialogsActivity.this.viewPages[0].listView.setVerticalScrollBarEnabled(true);
                    DialogsActivity.this.searchViewPager.setBackground(null);
                    DialogsActivity.this.searchAnimator = null;
                    if (DialogsActivity.this.downloadsItem != null) {
                        DialogsActivity.this.downloadsItem.setAlpha(z ? 0.0f : 1.0f);
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator3) {
                    DialogsActivity.this.notificationsLocker.unlock();
                    if (DialogsActivity.this.searchAnimator == animator3) {
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
            Animator animator3 = this.tabsAlphaAnimator;
            if (animator3 != null) {
                animator3.start();
            }
        } else {
            setDialogsListFrozen(false);
            if (z) {
                this.viewPages[0].listView.hide();
            } else {
                this.viewPages[0].listView.show();
            }
            this.viewPages[0].setAlpha(z ? 0.0f : 1.0f);
            if (!z6) {
                this.viewPages[0].setScaleX(z ? 0.9f : 1.0f);
                this.viewPages[0].setScaleY(z ? 0.9f : 1.0f);
            } else {
                this.viewPages[0].setScaleX(1.0f);
                this.viewPages[0].setScaleY(1.0f);
            }
            this.searchViewPager.setAlpha(z ? 1.0f : 0.0f);
            this.filtersView.setAlpha(z ? 1.0f : 0.0f);
            if (!z6) {
                this.searchViewPager.setScaleX(z ? 1.0f : 1.1f);
                this.searchViewPager.setScaleY(z ? 1.0f : 1.1f);
            } else {
                this.searchViewPager.setScaleX(1.0f);
                this.searchViewPager.setScaleY(1.0f);
            }
            FilterTabsView filterTabsView3 = this.filterTabsView;
            if (filterTabsView3 != null && filterTabsView3.getVisibility() == 0) {
                this.filterTabsView.setTranslationY(z ? -AndroidUtilities.dp(44.0f) : 0.0f);
                this.filterTabsView.getTabsContainer().setAlpha(z ? 0.0f : 1.0f);
            }
            FilterTabsView filterTabsView4 = this.filterTabsView;
            if (filterTabsView4 != null) {
                if (this.canShowFilterTabsView && !z) {
                    filterTabsView4.setVisibility(0);
                } else {
                    filterTabsView4.setVisibility(8);
                }
            }
            this.searchViewPager.setVisibility(z ? 0 : 8);
            setSearchAnimationProgress(z ? 1.0f : 0.0f, false);
            this.fragmentView.invalidate();
            ActionBarMenuItem actionBarMenuItem3 = this.downloadsItem;
            if (actionBarMenuItem3 != null) {
                actionBarMenuItem3.setAlpha(z ? 0.0f : 1.0f);
            }
        }
        int i5 = this.initialSearchType;
        if (i5 >= 0) {
            SearchViewPager searchViewPager5 = this.searchViewPager;
            searchViewPager5.setPosition(searchViewPager5.getPositionForType(i5));
        }
        if (!z) {
            this.initialSearchType = -1;
        }
        if (z && z2) {
            this.searchViewPager.showDownloads();
            updateSpeedItem(true);
        }
    }

    public void lambda$showSearch$41(ValueAnimator valueAnimator) {
        setSearchAnimationProgress(((Float) valueAnimator.getAnimatedValue()).floatValue(), false);
    }

    public boolean onlyDialogsAdapter() {
        return this.onlySelect || !this.searchViewPager.dialogsSearchAdapter.hasRecentSearch() || getMessagesController().getTotalDialogsCount() <= 10;
    }

    private void updateFilterTabsVisibility(boolean z) {
        if (this.fragmentView == null) {
            return;
        }
        z = (this.isPaused || this.databaseMigrationHint != null) ? false : false;
        if (this.searchIsShowed) {
            ValueAnimator valueAnimator = this.filtersTabAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z2 = this.canShowFilterTabsView;
            this.filterTabsViewIsVisible = z2;
            this.filterTabsProgress = z2 ? 1.0f : 0.0f;
            return;
        }
        final boolean z3 = this.canShowFilterTabsView;
        if (this.filterTabsViewIsVisible != z3) {
            ValueAnimator valueAnimator2 = this.filtersTabAnimator;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            this.filterTabsViewIsVisible = z3;
            if (z) {
                if (z3) {
                    if (this.filterTabsView.getVisibility() != 0) {
                        this.filterTabsView.setVisibility(0);
                    }
                    this.filtersTabAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.filterTabsMoveFrom = AndroidUtilities.dp(44.0f);
                } else {
                    this.filtersTabAnimator = ValueAnimator.ofFloat(1.0f, 0.0f);
                    this.filterTabsMoveFrom = Math.max(0.0f, AndroidUtilities.dp(44.0f) + this.actionBar.getTranslationY());
                }
                final float translationY = this.actionBar.getTranslationY();
                this.filtersTabAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        DialogsActivity.this.filtersTabAnimator = null;
                        DialogsActivity.this.scrollAdditionalOffset = AndroidUtilities.dp(44.0f) - DialogsActivity.this.filterTabsMoveFrom;
                        if (!z3) {
                            DialogsActivity.this.filterTabsView.setVisibility(8);
                        }
                        if (((BaseFragment) DialogsActivity.this).fragmentView != null) {
                            ((BaseFragment) DialogsActivity.this).fragmentView.requestLayout();
                        }
                        DialogsActivity.this.notificationsLocker.unlock();
                    }
                });
                this.filtersTabAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        DialogsActivity.this.lambda$updateFilterTabsVisibility$42(z3, translationY, valueAnimator3);
                    }
                });
                this.filtersTabAnimator.setDuration(220L);
                this.filtersTabAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.notificationsLocker.lock();
                this.filtersTabAnimator.start();
                this.fragmentView.requestLayout();
                return;
            }
            this.filterTabsProgress = z3 ? 1.0f : 0.0f;
            this.filterTabsView.setVisibility(z3 ? 0 : 8);
            View view = this.fragmentView;
            if (view != null) {
                view.invalidate();
            }
        }
    }

    public void lambda$updateFilterTabsVisibility$42(boolean z, float f, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.filterTabsProgress = floatValue;
        if (!z) {
            setScrollY(f * floatValue);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void setSearchAnimationProgress(float f, boolean z) {
        this.searchAnimationProgress = f;
        boolean z2 = true;
        if (this.whiteActionBar) {
            int color = Theme.getColor(this.folderId != 0 ? Theme.key_actionBarDefaultArchivedIcon : Theme.key_actionBarDefaultIcon);
            ActionBar actionBar = this.actionBar;
            int i = Theme.key_actionBarActionModeDefaultIcon;
            actionBar.setItemsColor(ColorUtils.blendARGB(color, Theme.getColor(i), this.searchAnimationProgress), false);
            this.actionBar.setItemsColor(ColorUtils.blendARGB(Theme.getColor(i), Theme.getColor(i), this.searchAnimationProgress), true);
            this.actionBar.setItemsBackgroundColor(ColorUtils.blendARGB(Theme.getColor(this.folderId != 0 ? Theme.key_actionBarDefaultArchivedSelector : Theme.key_actionBarDefaultSelector), Theme.getColor(Theme.key_actionBarActionModeDefaultSelector), this.searchAnimationProgress), false);
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        DialogsHintCell dialogsHintCell = this.dialogsHintCell;
        if (dialogsHintCell != null) {
            dialogsHintCell.setAlpha(1.0f - f);
        }
        if (SharedConfig.getDevicePerformanceClass() != 0 && LiteMode.isEnabled(LiteMode.FLAG_CHAT_SCALE)) {
            z2 = false;
        }
        if (z) {
            ViewPage[] viewPageArr = this.viewPages;
            if (viewPageArr[0] != null) {
                if (f < 1.0f) {
                    viewPageArr[0].setVisibility(0);
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
            ActionBarMenuItem actionBarMenuItem = this.passcodeItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.getIconView().setAlpha(1.0f - f);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.downloadsItem;
            if (actionBarMenuItem2 != null) {
                actionBarMenuItem2.setAlpha(1.0f - f);
            }
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null && filterTabsView.getVisibility() == 0) {
                this.filterTabsView.getTabsContainer().setAlpha(1.0f - f);
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
        final boolean z;
        final boolean z2;
        final boolean z3;
        final boolean z4;
        if (this.tabsAnimationInProgress || this.startedTracking) {
            return;
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null && filterTabsView.getVisibility() == 0 && this.filterTabsView.isAnimatingIndicator()) {
            return;
        }
        int findFirstVisibleItemPosition = viewPage.layoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = viewPage.layoutManager.findLastVisibleItemPosition();
        int abs = Math.abs(viewPage.layoutManager.findLastVisibleItemPosition() - findFirstVisibleItemPosition) + 1;
        if (findLastVisibleItemPosition != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = viewPage.listView.findViewHolderForAdapterPosition(findLastVisibleItemPosition);
            boolean z5 = findViewHolderForAdapterPosition != null && findViewHolderForAdapterPosition.getItemViewType() == 11;
            this.floatingForceVisible = z5;
            if (z5) {
                hideFloatingButton(false);
            }
        } else {
            this.floatingForceVisible = false;
        }
        if (viewPage.dialogsType == 7 || viewPage.dialogsType == 8) {
            ArrayList<MessagesController.DialogFilter> dialogFilters = getMessagesController().getDialogFilters();
            if (viewPage.selectedType >= 0 && viewPage.selectedType < dialogFilters.size() && (dialogFilters.get(viewPage.selectedType).flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_ARCHIVED) == 0 && ((abs > 0 && findLastVisibleItemPosition >= getDialogsArray(this.currentAccount, viewPage.dialogsType, 1, this.dialogsListFrozen).size() - 10) || (abs == 0 && !getMessagesController().isDialogsEndReached(1)))) {
                boolean z6 = !getMessagesController().isDialogsEndReached(1);
                if (z6 || !getMessagesController().isServerDialogsEndReached(1)) {
                    z = z6;
                    z2 = true;
                } else {
                    z = z6;
                    z2 = false;
                }
                if ((abs > 0 || findLastVisibleItemPosition < getDialogsArray(this.currentAccount, viewPage.dialogsType, this.folderId, this.dialogsListFrozen).size() - 10) && (abs != 0 || (!(viewPage.dialogsType == 7 || viewPage.dialogsType == 8) || getMessagesController().isDialogsEndReached(this.folderId)))) {
                    z3 = false;
                    z4 = false;
                } else {
                    boolean z7 = !getMessagesController().isDialogsEndReached(this.folderId);
                    if (z7 || !getMessagesController().isServerDialogsEndReached(this.folderId)) {
                        z4 = z7;
                        z3 = true;
                    } else {
                        z4 = z7;
                        z3 = false;
                    }
                }
                if (!z3 || z2) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            DialogsActivity.this.lambda$checkListLoad$43(z3, z4, z2, z);
                        }
                    });
                }
                return;
            }
        }
        z2 = false;
        z = false;
        if (abs > 0) {
        }
        z3 = false;
        z4 = false;
        if (z3) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$checkListLoad$43(z3, z4, z2, z);
            }
        });
    }

    public void lambda$checkListLoad$43(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z) {
            getMessagesController().loadDialogs(this.folderId, -1, 100, z2);
        }
        if (z3) {
            getMessagesController().loadDialogs(1, -1, 100, z4);
        }
    }

    private void onItemClick(android.view.View r18, int r19, androidx.recyclerview.widget.RecyclerView.Adapter r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.onItemClick(android.view.View, int, androidx.recyclerview.widget.RecyclerView$Adapter):void");
    }

    public void setOpenedDialogId(long j, int i) {
        MessagesStorage.TopicKey topicKey = this.openedDialogId;
        topicKey.dialogId = j;
        topicKey.topicId = i;
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

    public boolean onItemLongClick(RecyclerListView recyclerListView, View view, int i, float f, float f2, int i2, RecyclerView.Adapter adapter) {
        TLRPC$Dialog tLRPC$Dialog;
        final long makeEncryptedDialogId;
        if (getParentActivity() != null && !(view instanceof DialogsHintCell)) {
            if (!this.actionBar.isActionModeShowed() && !AndroidUtilities.isTablet() && !this.onlySelect && (view instanceof DialogCell)) {
                DialogCell dialogCell = (DialogCell) view;
                if (!getMessagesController().isForum(dialogCell.getDialogId()) && dialogCell.isPointInsideAvatar(f, f2)) {
                    return showChatPreview(dialogCell);
                }
            }
            RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer == null || !rightSlidingDialogContainer.hasFragment()) {
                DialogsSearchAdapter dialogsSearchAdapter = this.searchViewPager.dialogsSearchAdapter;
                if (adapter == dialogsSearchAdapter) {
                    Object item = dialogsSearchAdapter.getItem(i);
                    if (!this.searchViewPager.dialogsSearchAdapter.isSearchWas()) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                        builder.setTitle(LocaleController.getString("ClearSearchSingleAlertTitle", R.string.ClearSearchSingleAlertTitle));
                        if (item instanceof TLRPC$Chat) {
                            TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) item;
                            builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, tLRPC$Chat.title));
                            makeEncryptedDialogId = -tLRPC$Chat.id;
                        } else if (item instanceof TLRPC$User) {
                            TLRPC$User tLRPC$User = (TLRPC$User) item;
                            if (tLRPC$User.id == getUserConfig().clientUserId) {
                                builder.setMessage(LocaleController.formatString("ClearSearchSingleChatAlertText", R.string.ClearSearchSingleChatAlertText, LocaleController.getString("SavedMessages", R.string.SavedMessages)));
                            } else {
                                builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(tLRPC$User.first_name, tLRPC$User.last_name)));
                            }
                            makeEncryptedDialogId = tLRPC$User.id;
                        } else if (!(item instanceof TLRPC$EncryptedChat)) {
                            return false;
                        } else {
                            TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) item;
                            TLRPC$User user = getMessagesController().getUser(Long.valueOf(tLRPC$EncryptedChat.user_id));
                            builder.setMessage(LocaleController.formatString("ClearSearchSingleUserAlertText", R.string.ClearSearchSingleUserAlertText, ContactsController.formatName(user.first_name, user.last_name)));
                            makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
                        }
                        builder.setPositiveButton(LocaleController.getString("ClearSearchRemove", R.string.ClearSearchRemove), new DialogInterface.OnClickListener() {
                            @Override
                            public final void onClick(DialogInterface dialogInterface, int i3) {
                                DialogsActivity.this.lambda$onItemLongClick$44(makeEncryptedDialogId, dialogInterface, i3);
                            }
                        });
                        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                        AlertDialog create = builder.create();
                        showDialog(create);
                        TextView textView = (TextView) create.getButton(-1);
                        if (textView != null) {
                            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                        }
                        return true;
                    }
                }
                DialogsSearchAdapter dialogsSearchAdapter2 = this.searchViewPager.dialogsSearchAdapter;
                if (adapter == dialogsSearchAdapter2) {
                    if (this.onlySelect) {
                        onItemClick(view, i, adapter);
                        return false;
                    }
                    long dialogId = (!(view instanceof ProfileSearchCell) || dialogsSearchAdapter2.isGlobalSearch(i)) ? 0L : ((ProfileSearchCell) view).getDialogId();
                    if (dialogId != 0) {
                        showOrUpdateActionMode(dialogId, view);
                        return true;
                    }
                    return false;
                }
                ArrayList<TLRPC$Dialog> dialogsArray = getDialogsArray(this.currentAccount, i2, this.folderId, this.dialogsListFrozen);
                int fixPosition = ((DialogsAdapter) adapter).fixPosition(i);
                if (fixPosition < 0 || fixPosition >= dialogsArray.size() || (tLRPC$Dialog = dialogsArray.get(fixPosition)) == null) {
                    return false;
                }
                if (this.onlySelect) {
                    int i3 = this.initialDialogsType;
                    if ((i3 == 3 || i3 == 10) && validateSlowModeDialog(tLRPC$Dialog.id)) {
                        addOrRemoveSelectedDialog(tLRPC$Dialog.id, view);
                        updateSelectedCount();
                        return true;
                    }
                    return false;
                } else if (tLRPC$Dialog instanceof TLRPC$TL_dialogFolder) {
                    onArchiveLongPress(view);
                    return false;
                } else if (this.actionBar.isActionModeShowed() && isDialogPinned(tLRPC$Dialog)) {
                    return false;
                } else {
                    showOrUpdateActionMode(tLRPC$Dialog.id, view);
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public void lambda$onItemLongClick$44(long j, DialogInterface dialogInterface, int i) {
        this.searchViewPager.dialogsSearchAdapter.removeRecentSearch(j);
    }

    private void onArchiveLongPress(View view) {
        int i;
        String str;
        view.performHapticFeedback(0, 2);
        BottomSheet.Builder builder = new BottomSheet.Builder(getParentActivity());
        boolean z = getMessagesStorage().getArchiveUnreadCount() != 0;
        int[] iArr = new int[2];
        iArr[0] = z ? R.drawable.msg_markread : 0;
        iArr[1] = SharedConfig.archiveHidden ? R.drawable.chats_pin : R.drawable.chats_unpin;
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = z ? LocaleController.getString("MarkAllAsRead", R.string.MarkAllAsRead) : null;
        if (SharedConfig.archiveHidden) {
            i = R.string.PinInTheList;
            str = "PinInTheList";
        } else {
            i = R.string.HideAboveTheList;
            str = "HideAboveTheList";
        }
        charSequenceArr[1] = LocaleController.getString(str, i);
        builder.setItems(charSequenceArr, iArr, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                DialogsActivity.this.lambda$onArchiveLongPress$45(dialogInterface, i2);
            }
        });
        showDialog(builder.create());
    }

    public void lambda$onArchiveLongPress$45(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            getMessagesStorage().readAllDialogs(1);
        } else if (i != 1 || this.viewPages == null) {
        } else {
            int i2 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i2 >= viewPageArr.length) {
                    return;
                }
                if (viewPageArr[i2].dialogsType == 0 && this.viewPages[i2].getVisibility() == 0) {
                    View childAt = this.viewPages[i2].listView.getChildAt(0);
                    DialogCell dialogCell = null;
                    if (childAt instanceof DialogCell) {
                        DialogCell dialogCell2 = (DialogCell) childAt;
                        if (dialogCell2.isFolderCell()) {
                            dialogCell = dialogCell2;
                        }
                    }
                    this.viewPages[i2].listView.toggleArchiveHidden(true, dialogCell);
                }
                i2++;
            }
        }
    }

    public boolean showChatPreview(final DialogCell dialogCell) {
        long j;
        TLRPC$Chat chat;
        final MessagesController.DialogFilter dialogFilter;
        ChatActivity[] chatActivityArr;
        ?? r1;
        Bundle bundle;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        ArrayList<TLRPC$Dialog> arrayList;
        int i5;
        if (dialogCell.isDialogFolder()) {
            if (dialogCell.getCurrentDialogFolderId() == 1) {
                onArchiveLongPress(dialogCell);
            }
            return false;
        }
        final long dialogId = dialogCell.getDialogId();
        Bundle bundle2 = new Bundle();
        int messageId = dialogCell.getMessageId();
        if (DialogObject.isEncryptedDialog(dialogId)) {
            return false;
        }
        if (DialogObject.isUserDialog(dialogId)) {
            bundle2.putLong("user_id", dialogId);
        } else {
            if (messageId == 0 || (chat = getMessagesController().getChat(Long.valueOf(-dialogId))) == null || chat.migrated_to == null) {
                j = dialogId;
            } else {
                bundle2.putLong("migrated_to", dialogId);
                j = -chat.migrated_to.channel_id;
            }
            bundle2.putLong("chat_id", -j);
        }
        if (messageId != 0) {
            bundle2.putInt("message_id", messageId);
        }
        final ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Long.valueOf(dialogId));
        ChatActivity[] chatActivityArr2 = new ChatActivity[1];
        ActionBarPopupWindow.ActionBarPopupWindowLayout[] actionBarPopupWindowLayoutArr = {new ActionBarPopupWindow.ActionBarPopupWindowLayout(getParentActivity(), R.drawable.popup_fixed_alert2, getResourceProvider(), 2)};
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(getParentActivity(), true, false);
        if (dialogCell.getHasUnread()) {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("MarkAsRead", R.string.MarkAsRead), R.drawable.msg_markread);
        } else {
            actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("MarkAsUnread", R.string.MarkAsUnread), R.drawable.msg_markunread);
        }
        actionBarMenuSubItem.setMinimumWidth(160);
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DialogsActivity.this.lambda$showChatPreview$46(dialogCell, dialogId, view);
            }
        });
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem);
        boolean[] zArr = new boolean[1];
        zArr[0] = true;
        final TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(dialogId);
        boolean z4 = (this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null));
        if (z4) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        } else {
            dialogFilter = null;
        }
        if (isDialogPinned(tLRPC$Dialog)) {
            chatActivityArr = chatActivityArr2;
            r1 = 0;
        } else {
            ArrayList<TLRPC$Dialog> dialogs = getMessagesController().getDialogs(this.folderId);
            int size = dialogs.size();
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i6 >= size) {
                    chatActivityArr = chatActivityArr2;
                    break;
                }
                TLRPC$Dialog tLRPC$Dialog2 = dialogs.get(i6);
                if (tLRPC$Dialog2 instanceof TLRPC$TL_dialogFolder) {
                    arrayList = dialogs;
                    i5 = size;
                } else if (isDialogPinned(tLRPC$Dialog2)) {
                    arrayList = dialogs;
                    i5 = size;
                    if (DialogObject.isEncryptedDialog(tLRPC$Dialog2.id)) {
                        i8++;
                    } else {
                        i7++;
                    }
                } else {
                    arrayList = dialogs;
                    i5 = size;
                    chatActivityArr = chatActivityArr2;
                    if (!getMessagesController().isPromoDialog(tLRPC$Dialog2.id, false)) {
                        break;
                    }
                    i6++;
                    dialogs = arrayList;
                    size = i5;
                    chatActivityArr2 = chatActivityArr;
                }
                chatActivityArr = chatActivityArr2;
                i6++;
                dialogs = arrayList;
                size = i5;
                chatActivityArr2 = chatActivityArr;
            }
            if (tLRPC$Dialog == null || isDialogPinned(tLRPC$Dialog)) {
                i = 0;
                i2 = 0;
                i3 = 0;
            } else {
                boolean isEncryptedDialog = DialogObject.isEncryptedDialog(dialogId);
                int i9 = !isEncryptedDialog ? 1 : 0;
                if (dialogFilter == null || !dialogFilter.alwaysShow.contains(Long.valueOf(dialogId))) {
                    i3 = i9;
                    i2 = isEncryptedDialog ? 1 : 0;
                    i = 0;
                } else {
                    i3 = i9;
                    i2 = isEncryptedDialog ? 1 : 0;
                    i = 1;
                }
            }
            if (z4 && dialogFilter != null) {
                i4 = 100 - dialogFilter.alwaysShow.size();
            } else if (this.folderId != 0 || dialogFilter != null) {
                if (getUserConfig().isPremium()) {
                    i4 = getMessagesController().maxFolderPinnedDialogsCountPremium;
                } else {
                    i4 = getMessagesController().maxFolderPinnedDialogsCountDefault;
                }
            } else if (getUserConfig().isPremium()) {
                i4 = getMessagesController().maxPinnedDialogsCountPremium;
            } else {
                i4 = getMessagesController().maxPinnedDialogsCountDefault;
            }
            if (i2 + i8 > i4 || (i3 + i7) - i > i4) {
                z2 = false;
                z3 = false;
            } else {
                z2 = false;
                z3 = true;
            }
            zArr[z2 ? 1 : 0] = z3;
            r1 = z2;
        }
        if (zArr[r1]) {
            ActionBarMenuSubItem actionBarMenuSubItem2 = new ActionBarMenuSubItem(getParentActivity(), r1, r1);
            if (isDialogPinned(tLRPC$Dialog)) {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("UnpinMessage", R.string.UnpinMessage), R.drawable.msg_unpin);
            } else {
                actionBarMenuSubItem2.setTextAndIcon(LocaleController.getString("PinMessage", R.string.PinMessage), R.drawable.msg_pin);
            }
            actionBarMenuSubItem2.setMinimumWidth(160);
            bundle = null;
            actionBarMenuSubItem2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$showChatPreview$48(dialogFilter, tLRPC$Dialog, dialogId, view);
                }
            });
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem2);
        } else {
            bundle = null;
        }
        if (DialogObject.isUserDialog(dialogId) && UserObject.isUserSelf(getMessagesController().getUser(Long.valueOf(dialogId)))) {
            z = false;
        } else {
            ActionBarMenuSubItem actionBarMenuSubItem3 = new ActionBarMenuSubItem(getParentActivity(), false, false);
            if (!getMessagesController().isDialogMuted(dialogId, 0)) {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("Mute", R.string.Mute), R.drawable.msg_mute);
            } else {
                actionBarMenuSubItem3.setTextAndIcon(LocaleController.getString("Unmute", R.string.Unmute), R.drawable.msg_unmute);
            }
            actionBarMenuSubItem3.setMinimumWidth(160);
            actionBarMenuSubItem3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    DialogsActivity.this.lambda$showChatPreview$49(dialogId, view);
                }
            });
            z = false;
            actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem3);
        }
        ActionBarMenuSubItem actionBarMenuSubItem4 = new ActionBarMenuSubItem(getParentActivity(), z, true);
        actionBarMenuSubItem4.setIconColor(getThemedColor(Theme.key_text_RedRegular));
        int i10 = Theme.key_text_RedBold;
        actionBarMenuSubItem4.setTextColor(getThemedColor(i10));
        actionBarMenuSubItem4.setSelectorColor(Theme.multAlpha(getThemedColor(i10), 0.12f));
        actionBarMenuSubItem4.setTextAndIcon(LocaleController.getString("Delete", R.string.Delete), R.drawable.msg_delete);
        actionBarMenuSubItem4.setMinimumWidth(160);
        actionBarMenuSubItem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                DialogsActivity.this.lambda$showChatPreview$50(arrayList2, view);
            }
        });
        actionBarPopupWindowLayoutArr[0].addView(actionBarMenuSubItem4);
        if (getMessagesController().checkCanOpenChat(bundle2, this)) {
            if (this.searchString != null) {
                getNotificationCenter().postNotificationName(NotificationCenter.closeChats, new Object[0]);
            }
            prepareBlurBitmap();
            this.parentLayout.setHighlightActionButtons(true);
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                BaseFragment chatActivity = new ChatActivity(bundle2);
                chatActivityArr[0] = chatActivity;
                presentFragmentAsPreview(chatActivity);
                return true;
            }
            BaseFragment chatActivity2 = new ChatActivity(bundle2);
            chatActivityArr[0] = chatActivity2;
            presentFragmentAsPreviewWithMenu(chatActivity2, actionBarPopupWindowLayoutArr[0]);
            if (chatActivityArr[0] != null) {
                chatActivityArr[0].allowExpandPreviewByClick = true;
                try {
                    chatActivityArr[0].getAvatarContainer().getAvatarImageView().performAccessibilityAction(64, bundle);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }

    public void lambda$showChatPreview$46(DialogCell dialogCell, long j, View view) {
        if (dialogCell.getHasUnread()) {
            markAsRead(j);
        } else {
            markAsUnread(j);
        }
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$48(final MessagesController.DialogFilter dialogFilter, final TLRPC$Dialog tLRPC$Dialog, final long j, View view) {
        finishPreviewFragment();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$showChatPreview$47(dialogFilter, tLRPC$Dialog, j);
            }
        }, 100L);
    }

    public void lambda$showChatPreview$47(MessagesController.DialogFilter dialogFilter, TLRPC$Dialog tLRPC$Dialog, long j) {
        int i;
        boolean z;
        int i2 = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (dialogFilter == null || !isDialogPinned(tLRPC$Dialog)) {
            i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        } else {
            int size = dialogFilter.pinnedDialogs.size();
            for (int i3 = 0; i3 < size; i3++) {
                i2 = Math.min(i2, dialogFilter.pinnedDialogs.valueAt(i3));
            }
            i = i2 - this.canPinCount;
        }
        TLRPC$EncryptedChat encryptedChat = DialogObject.isEncryptedDialog(j) ? getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))) : null;
        UndoView undoView = getUndoView();
        if (undoView == null) {
            return;
        }
        if (!isDialogPinned(tLRPC$Dialog)) {
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
            z = true;
            FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
        } else {
            z = true;
        }
        getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
        updateCounters(z);
        if (this.viewPages != null) {
            int i4 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i4 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i4].dialogsAdapter.onReorderStateChanged(false);
                i4++;
            }
        }
        updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK);
    }

    public void lambda$showChatPreview$49(long j, View view) {
        boolean isDialogMuted = getMessagesController().isDialogMuted(j, 0);
        if (!isDialogMuted) {
            getNotificationsController().setDialogNotificationsSettings(j, 0, 3);
        } else {
            getNotificationsController().setDialogNotificationsSettings(j, 0, 4);
        }
        BulletinFactory.createMuteBulletin(this, !isDialogMuted, null).show();
        finishPreviewFragment();
    }

    public void lambda$showChatPreview$50(ArrayList arrayList, View view) {
        performSelectedDialogsAction(arrayList, 102, false, false);
        finishPreviewFragment();
    }

    public void updateFloatingButtonOffset() {
        this.floatingButtonContainer.setTranslationY((this.floatingButtonTranslation - this.floatingButtonPanOffset) - (Math.max(this.additionalFloatingTranslation, this.additionalFloatingTranslation2) * (1.0f - this.floatingButtonHideProgress)));
    }

    public boolean hasHiddenArchive() {
        return !this.onlySelect && this.initialDialogsType == 0 && this.folderId == 0 && getMessagesController().hasHiddenArchive();
    }

    public boolean waitingForDialogsAnimationEnd(ViewPage viewPage) {
        return viewPage.dialogsItemAnimator.isRunning();
    }

    public void checkAnimationFinished() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$checkAnimationFinished$51();
            }
        }, 300L);
    }

    public void lambda$checkAnimationFinished$51() {
        ArrayList<TLRPC$Dialog> arrayList;
        if (this.viewPages != null && this.folderId != 0 && ((arrayList = this.frozenDialogsList) == null || arrayList.isEmpty())) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].listView.setEmptyView(null);
                this.viewPages[i].progressView.setVisibility(4);
                i++;
            }
            finishFragment();
        }
        setDialogsListFrozen(false);
        updateDialogIndices();
    }

    public void setScrollY(float f) {
        if (this.fragmentView == null) {
            return;
        }
        this.actionBar.setTranslationY(f);
        Bulletin bulletin = this.topBulletin;
        if (bulletin != null) {
            bulletin.updatePosition();
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.setTranslationY(f);
        }
        DialogsHintCell dialogsHintCell = this.dialogsHintCell;
        if (dialogsHintCell != null) {
            dialogsHintCell.setTranslationY(f);
        }
        DrawerProfileCell.AnimatedStatusView animatedStatusView = this.animatedStatusView;
        if (animatedStatusView != null) {
            animatedStatusView.translateY2((int) f);
            this.animatedStatusView.setAlpha(1.0f - ((-f) / ActionBar.getCurrentActionBarHeight()));
        }
        updateContextViewPosition();
        if (this.viewPages != null) {
            int i = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i].listView.setTopGlowOffset(this.viewPages[i].listView.getPaddingTop() + ((int) f));
                i++;
            }
        }
        this.fragmentView.invalidate();
    }

    private void prepareBlurBitmap() {
        if (this.blurredView == null) {
            return;
        }
        int measuredWidth = (int) (this.fragmentView.getMeasuredWidth() / 6.0f);
        int measuredHeight = (int) (this.fragmentView.getMeasuredHeight() / 6.0f);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(0.16666667f, 0.16666667f);
        this.fragmentView.draw(canvas);
        Utilities.stackBlurBitmap(createBitmap, Math.max(7, Math.max(measuredWidth, measuredHeight) / 180));
        this.blurredView.setBackground(new BitmapDrawable(createBitmap));
        this.blurredView.setAlpha(0.0f);
        this.blurredView.setVisibility(0);
    }

    @Override
    public void onTransitionAnimationProgress(boolean z, float f) {
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.getFragment().onTransitionAnimationProgress(z, f);
            return;
        }
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

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        View view;
        RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer != null && rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.getFragment().onTransitionAnimationEnd(z, z2);
            return;
        }
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

    public void resetScroll() {
        if (this.actionBar.getTranslationY() == 0.0f) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, this.SCROLL_Y, 0.0f));
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.setDuration(250L);
        animatorSet.start();
    }

    public void hideActionMode(boolean z) {
        this.actionBar.hideActionMode();
        if (this.menuDrawable != null) {
            this.actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrOpenMenu", R.string.AccDescrOpenMenu));
        }
        this.selectedDialogs.clear();
        MenuDrawable menuDrawable = this.menuDrawable;
        if (menuDrawable != null) {
            menuDrawable.setRotation(0.0f, true);
        } else {
            BackDrawable backDrawable = this.backDrawable;
            if (backDrawable != null) {
                backDrawable.setRotation(0.0f, true);
            }
        }
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView != null) {
            filterTabsView.animateColorsTo(Theme.key_actionBarTabLine, Theme.key_actionBarTabActiveText, Theme.key_actionBarTabUnactiveText, Theme.key_actionBarTabSelector, Theme.key_actionBarDefault);
        }
        ValueAnimator valueAnimator = this.actionBarColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progressToActionMode, 0.0f);
        this.actionBarColorAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                DialogsActivity.this.lambda$hideActionMode$52(valueAnimator2);
            }
        });
        this.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.actionBarColorAnimator.setDuration(200L);
        this.actionBarColorAnimator.start();
        this.allowMoving = false;
        if (!this.movingDialogFilters.isEmpty()) {
            int i = 0;
            for (int size = this.movingDialogFilters.size(); i < size; size = size) {
                MessagesController.DialogFilter dialogFilter = this.movingDialogFilters.get(i);
                FilterCreateActivity.saveFilterToServer(dialogFilter, dialogFilter.flags, dialogFilter.name, dialogFilter.alwaysShow, dialogFilter.neverShow, dialogFilter.pinnedDialogs, false, false, true, true, false, this, null);
                i++;
            }
            this.movingDialogFilters.clear();
        }
        if (this.movingWas) {
            getMessagesController().reorderPinnedDialogs(this.folderId, null, 0L);
            this.movingWas = false;
        }
        updateCounters(true);
        if (this.viewPages != null) {
            int i2 = 0;
            while (true) {
                ViewPage[] viewPageArr = this.viewPages;
                if (i2 >= viewPageArr.length) {
                    break;
                }
                viewPageArr[i2].dialogsAdapter.onReorderStateChanged(false);
                i2++;
            }
        }
        updateVisibleRows(MessagesController.UPDATE_MASK_REORDER | MessagesController.UPDATE_MASK_CHECK | (z ? MessagesController.UPDATE_MASK_CHAT : 0));
    }

    public void lambda$hideActionMode$52(ValueAnimator valueAnimator) {
        this.progressToActionMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    private int getPinnedCount() {
        ArrayList<TLRPC$Dialog> dialogs;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogs = getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, this.dialogsListFrozen);
        } else {
            dialogs = getMessagesController().getDialogs(this.folderId);
        }
        int size = dialogs.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC$Dialog tLRPC$Dialog = dialogs.get(i2);
            if (!(tLRPC$Dialog instanceof TLRPC$TL_dialogFolder)) {
                if (isDialogPinned(tLRPC$Dialog)) {
                    i++;
                } else if (!getMessagesController().isPromoDialog(tLRPC$Dialog.id, false)) {
                    break;
                }
            }
        }
        return i;
    }

    public boolean isDialogPinned(TLRPC$Dialog tLRPC$Dialog) {
        if (tLRPC$Dialog == null) {
            return false;
        }
        MessagesController.DialogFilter dialogFilter = null;
        if ((this.viewPages[0].dialogsType == 7 || this.viewPages[0].dialogsType == 8) && (!this.actionBar.isActionModeShowed() || this.actionBar.isActionModeShowed(null))) {
            dialogFilter = getMessagesController().selectedDialogFilter[this.viewPages[0].dialogsType == 8 ? (char) 1 : (char) 0];
        }
        if (dialogFilter != null) {
            return dialogFilter.pinnedDialogs.indexOfKey(tLRPC$Dialog.id) >= 0;
        }
        return tLRPC$Dialog.pinned;
    }

    public void performSelectedDialogsAction(java.util.ArrayList<java.lang.Long> r27, final int r28, boolean r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.performSelectedDialogsAction(java.util.ArrayList, int, boolean, boolean):void");
    }

    public void lambda$performSelectedDialogsAction$53(ArrayList arrayList) {
        getMessagesController().addDialogToFolder(arrayList, this.folderId == 0 ? 0 : 1, -1, null, 0L);
    }

    public void lambda$performSelectedDialogsAction$55(ArrayList arrayList, final int i, DialogInterface dialogInterface, int i2) {
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList<Long> arrayList2 = new ArrayList<>(arrayList);
        UndoView undoView = getUndoView();
        if (undoView != null) {
            undoView.showWithAction(arrayList2, i == 102 ? 27 : 26, (Object) null, (Object) null, new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$performSelectedDialogsAction$54(i, arrayList2);
                }
            }, (Runnable) null);
        }
        hideActionMode(i == 103);
    }

    public void lambda$performSelectedDialogsAction$54(int i, ArrayList arrayList) {
        if (i == 102) {
            getMessagesController().setDialogsInTransaction(true);
            performSelectedDialogsAction(arrayList, i, false, false);
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

    public void lambda$performSelectedDialogsAction$56(ArrayList arrayList, boolean z, boolean z2) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            long longValue = ((Long) arrayList.get(i)).longValue();
            if (z) {
                getMessagesController().reportSpam(longValue, getMessagesController().getUser(Long.valueOf(longValue)), null, null, false);
            }
            if (z2) {
                getMessagesController().deleteDialog(longValue, 0, true);
            }
            getMessagesController().blockPeer(longValue);
        }
        hideActionMode(false);
    }

    public void lambda$performSelectedDialogsAction$57(DialogInterface dialogInterface, int i) {
        getMessagesController().hidePromoDialog();
        hideActionMode(false);
    }

    public void lambda$performSelectedDialogsAction$59(final int i, final TLRPC$Chat tLRPC$Chat, final long j, final boolean z, final boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        ArrayList<TLRPC$Dialog> arrayList;
        int i6;
        hideActionMode(false);
        if (i == 103 && ChatObject.isChannel(tLRPC$Chat)) {
            if (!tLRPC$Chat.megagroup || ChatObject.isPublic(tLRPC$Chat)) {
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
                i6 = 0;
                while (i6 < this.frozenDialogsList.size()) {
                    if (this.frozenDialogsList.get(i6).id == j) {
                        break;
                    }
                    i6++;
                }
            }
            i6 = -1;
            checkAnimationFinished();
            i2 = i6;
        } else {
            i2 = -1;
        }
        UndoView undoView = getUndoView();
        if (undoView != null) {
            i3 = i2;
            undoView.showWithAction(j, i == 103 ? 0 : 1, new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$performSelectedDialogsAction$58(i, j, tLRPC$Chat, z, z2);
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
            } else if (((TLRPC$Dialog) arrayList2.get(i7)).id == j) {
                i5 = i7;
                i4 = 102;
                break;
            } else {
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

    public void lambda$performSelectedDialogsAction$60(DialogInterface dialogInterface) {
        hideActionMode(true);
    }

    public void lambda$performSelectedDialogsAction$61(DialogInterface dialogInterface) {
        hideActionMode(true);
    }

    private void markAsRead(long r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.markAsRead(long):void");
    }

    private void markAsUnread(long j) {
        getMessagesController().markDialogAsUnread(j, null, 0L);
    }

    public void markDialogsAsRead(ArrayList<TLRPC$Dialog> arrayList) {
        this.debugLastUpdateAction = 2;
        setDialogsListFrozen(true);
        checkAnimationFinished();
        for (int i = 0; i < arrayList.size(); i++) {
            long j = arrayList.get(i).id;
            TLRPC$Dialog tLRPC$Dialog = arrayList.get(i);
            if (getMessagesController().isForum(j)) {
                getMessagesController().markAllTopicsAsRead(j);
            }
            getMessagesController().markMentionsAsRead(j, 0);
            MessagesController messagesController = getMessagesController();
            int i2 = tLRPC$Dialog.top_message;
            messagesController.markDialogAsRead(j, i2, i2, tLRPC$Dialog.last_message_date, false, 0, 0, true, 0);
        }
    }

    public void lambda$performSelectedDialogsAction$58(int i, long j, TLRPC$Chat tLRPC$Chat, boolean z, boolean z2) {
        if (i == 103) {
            getMessagesController().deleteDialog(j, 1, z2);
            return;
        }
        if (tLRPC$Chat != null) {
            if (ChatObject.isNotInChat(tLRPC$Chat)) {
                getMessagesController().deleteDialog(j, 0, z2);
            } else {
                getMessagesController().deleteParticipantFromChat(-j, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), null, z2, false);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z2);
            if (z && z2) {
                getMessagesController().blockPeer(j);
            }
        }
        if (AndroidUtilities.isTablet()) {
            getNotificationCenter().postNotificationName(NotificationCenter.closeChats, Long.valueOf(j));
        }
        getMessagesController().checkIfFolderEmpty(this.folderId);
    }

    private void pinDialog(long r17, boolean r19, org.telegram.messenger.MessagesController.DialogFilter r20, int r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.pinDialog(long, boolean, org.telegram.messenger.MessagesController$DialogFilter, int, boolean):void");
    }

    public void lambda$pinDialog$62() {
        setDialogsListFrozen(false);
    }

    public void scrollToTop() {
        int findFirstVisibleItemPosition = this.viewPages[0].layoutManager.findFirstVisibleItemPosition() * AndroidUtilities.dp(SharedConfig.useThreeLinesLayout ? 78.0f : 72.0f);
        int i = (this.viewPages[0].dialogsType == 0 && hasHiddenArchive() && this.viewPages[0].archivePullViewState == 2) ? 1 : 0;
        this.viewPages[0].listView.getItemAnimator();
        if (findFirstVisibleItemPosition >= this.viewPages[0].listView.getMeasuredHeight() * 1.2f) {
            this.viewPages[0].scrollHelper.setScrollDirection(1);
            this.viewPages[0].scrollHelper.scrollToPosition(i, 0, false, true);
            resetScroll();
            return;
        }
        this.viewPages[0].listView.smoothScrollToPosition(i);
    }

    public void updateCounters(boolean z) {
        int i;
        int i2;
        int i3;
        TLRPC$User user;
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
            TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(this.selectedDialogs.get(i4).longValue());
            if (tLRPC$Dialog == null) {
                i2 = size;
            } else {
                long j = tLRPC$Dialog.id;
                boolean isDialogPinned = isDialogPinned(tLRPC$Dialog);
                boolean z2 = tLRPC$Dialog.unread_count != 0 || tLRPC$Dialog.unread_mark;
                if (getMessagesController().isForum(j)) {
                    i2 = size;
                    this.forumCount++;
                } else {
                    i2 = size;
                }
                if (getMessagesController().isDialogMuted(j, 0)) {
                    i3 = 1;
                    this.canUnmuteCount++;
                } else {
                    i3 = 1;
                    this.canMuteCount++;
                }
                if (z2) {
                    this.canReadCount += i3;
                }
                if (this.folderId == i3 || tLRPC$Dialog.folder_id == i3) {
                    this.canUnarchiveCount++;
                } else if (j != clientUserId && j != 777000 && !getMessagesController().isPromoDialog(j, false)) {
                    i7++;
                }
                if (!DialogObject.isUserDialog(j) || j == clientUserId || MessagesController.isSupportUser(getMessagesController().getUser(Long.valueOf(j)))) {
                    i9++;
                } else {
                    if (notificationsSettings.getBoolean("dialog_bar_report" + j, true)) {
                        this.canReportSpamCount++;
                    }
                }
                if (DialogObject.isChannel(tLRPC$Dialog)) {
                    TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                    if (getMessagesController().isPromoDialog(tLRPC$Dialog.id, true)) {
                        this.canClearCacheCount++;
                        if (getMessagesController().promoDialogType == MessagesController.PROMO_TYPE_PSA) {
                            i5++;
                            this.canDeletePsaSelected = true;
                        }
                    } else {
                        if (isDialogPinned) {
                            i8++;
                        } else {
                            this.canPinCount++;
                        }
                        if (chat != null && chat.megagroup) {
                            if (ChatObject.isPublic(chat)) {
                                this.canClearCacheCount++;
                            }
                        } else {
                            this.canClearCacheCount++;
                        }
                        i5++;
                    }
                } else {
                    boolean isChatDialog = DialogObject.isChatDialog(tLRPC$Dialog.id);
                    if (isChatDialog) {
                        getMessagesController().getChat(Long.valueOf(-tLRPC$Dialog.id));
                    }
                    if (DialogObject.isEncryptedDialog(tLRPC$Dialog.id)) {
                        TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(tLRPC$Dialog.id)));
                        if (encryptedChat != null) {
                            user = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        } else {
                            user = new TLRPC$TL_userEmpty();
                        }
                    } else {
                        user = (isChatDialog || !DialogObject.isUserDialog(tLRPC$Dialog.id)) ? null : getMessagesController().getUser(Long.valueOf(tLRPC$Dialog.id));
                    }
                    if (user != null && user.bot) {
                        MessagesController.isSupportUser(user);
                    }
                    if (isDialogPinned) {
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
        }
        int i10 = size;
        if (i5 != i10) {
            this.deleteItem.setVisibility(8);
        } else {
            this.deleteItem.setVisibility(0);
        }
        int i11 = this.canClearCacheCount;
        if ((i11 != 0 && i11 != i10) || (i6 != 0 && i6 != i10)) {
            this.clearItem.setVisibility(8);
        } else {
            this.clearItem.setVisibility(0);
            if (this.canClearCacheCount != 0) {
                this.clearItem.setText(LocaleController.getString("ClearHistoryCache", R.string.ClearHistoryCache));
            } else {
                this.clearItem.setText(LocaleController.getString("ClearHistory", R.string.ClearHistory));
            }
        }
        if (this.canUnarchiveCount != 0) {
            String string = LocaleController.getString("Unarchive", R.string.Unarchive);
            ActionBarMenuSubItem actionBarMenuSubItem = this.archiveItem;
            int i12 = R.drawable.msg_unarchive;
            actionBarMenuSubItem.setTextAndIcon(string, i12);
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
            String string2 = LocaleController.getString("Archive", R.string.Archive);
            ActionBarMenuSubItem actionBarMenuSubItem2 = this.archiveItem;
            int i13 = R.drawable.msg_archive;
            actionBarMenuSubItem2.setTextAndIcon(string2, i13);
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
            this.archiveItem.setVisibility(8);
            this.archive2Item.setVisibility(8);
        }
        if (this.canPinCount + i8 != i10) {
            this.pinItem.setVisibility(8);
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
        if (i9 != 0) {
            this.blockItem.setVisibility(8);
        } else {
            this.blockItem.setVisibility(i);
        }
        FilterTabsView filterTabsView4 = this.filterTabsView;
        boolean z3 = filterTabsView4 == null || filterTabsView4.getVisibility() != 0 || this.filterTabsView.currentTabIsDefault();
        if (!z3) {
            try {
                z3 = i10 >= getDialogsArray(this.currentAccount, this.viewPages[0].dialogsAdapter.getDialogsType(), this.folderId, this.dialogsListFrozen).size();
            } catch (Exception unused) {
            }
        }
        if (z3) {
            this.removeFromFolderItem.setVisibility(8);
        } else {
            this.removeFromFolderItem.setVisibility(0);
        }
        FilterTabsView filterTabsView5 = this.filterTabsView;
        if (filterTabsView5 != null && filterTabsView5.getVisibility() == 0 && this.filterTabsView.currentTabIsDefault() && !FiltersListBottomSheet.getCanAddDialogFilters(this, this.selectedDialogs).isEmpty()) {
            this.addToFolderItem.setVisibility(0);
        } else {
            this.addToFolderItem.setVisibility(8);
        }
        if (this.canUnmuteCount != 0) {
            this.muteItem.setIcon(R.drawable.msg_unmute);
            this.muteItem.setContentDescription(LocaleController.getString("ChatsUnmute", R.string.ChatsUnmute));
        } else {
            this.muteItem.setIcon(R.drawable.msg_mute);
            this.muteItem.setContentDescription(LocaleController.getString("ChatsMute", R.string.ChatsMute));
        }
        if (this.canReadCount != 0) {
            this.readItem.setTextAndIcon(LocaleController.getString("MarkAsRead", R.string.MarkAsRead), R.drawable.msg_markread);
            this.readItem.setVisibility(0);
        } else if (this.forumCount == 0) {
            this.readItem.setTextAndIcon(LocaleController.getString("MarkAsUnread", R.string.MarkAsUnread), R.drawable.msg_markunread);
            this.readItem.setVisibility(0);
        } else {
            this.readItem.setVisibility(8);
        }
        if (this.canPinCount != 0) {
            this.pinItem.setIcon(R.drawable.msg_pin);
            this.pinItem.setContentDescription(LocaleController.getString("PinToTop", R.string.PinToTop));
            this.pin2Item.setText(LocaleController.getString("DialogPin", R.string.DialogPin));
            return;
        }
        this.pinItem.setIcon(R.drawable.msg_unpin);
        this.pinItem.setContentDescription(LocaleController.getString("UnpinFromTop", R.string.UnpinFromTop));
        this.pin2Item.setText(LocaleController.getString("DialogUnpin", R.string.DialogUnpin));
    }

    public boolean validateSlowModeDialog(long j) {
        TLRPC$Chat chat;
        ChatActivityEnterView chatActivityEnterView;
        if ((this.messagesCount > 1 || !((chatActivityEnterView = this.commentView) == null || chatActivityEnterView.getVisibility() != 0 || TextUtils.isEmpty(this.commentView.getFieldText()))) && DialogObject.isChatDialog(j) && (chat = getMessagesController().getChat(Long.valueOf(-j))) != null && !ChatObject.hasAdminRights(chat) && chat.slowmode_enabled) {
            AlertsCreator.showSimpleAlert(this, LocaleController.getString("Slowmode", R.string.Slowmode), LocaleController.getString("SlowmodeSendError", R.string.SlowmodeSendError));
            return false;
        }
        return true;
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
                if (this.actionBar.getBackButton().getDrawable() instanceof MenuDrawable) {
                    this.actionBar.setBackButtonDrawable(new BackDrawable(false));
                }
            } else {
                createActionMode(null);
            }
            AndroidUtilities.hideKeyboard(this.fragmentView.findFocus());
            this.actionBar.setActionModeOverrideColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            this.actionBar.showActionMode();
            resetScroll();
            if (this.menuDrawable != null) {
                this.actionBar.setBackButtonContentDescription(LocaleController.getString("AccDescrGoBack", R.string.AccDescrGoBack));
            }
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
                    View view2 = this.actionModeViews.get(i2);
                    view2.setPivotY(ActionBar.getCurrentActionBarHeight() / 2);
                    AndroidUtilities.clearDrawableAnimation(view2);
                    arrayList.add(ObjectAnimator.ofFloat(view2, View.SCALE_Y, 0.1f, 1.0f));
                }
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(200L);
                animatorSet.start();
            }
            ValueAnimator valueAnimator = this.actionBarColorAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.progressToActionMode, 1.0f);
            this.actionBarColorAnimator = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    DialogsActivity.this.lambda$showOrUpdateActionMode$63(valueAnimator2);
                }
            });
            this.actionBarColorAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.actionBarColorAnimator.setDuration(200L);
            this.actionBarColorAnimator.start();
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.animateColorsTo(Theme.key_profile_tabSelectedLine, Theme.key_profile_tabSelectedText, Theme.key_profile_tabText, Theme.key_profile_tabSelector, Theme.key_actionBarActionModeDefault);
            }
            MenuDrawable menuDrawable = this.menuDrawable;
            if (menuDrawable != null) {
                menuDrawable.setRotateToBack(false);
                this.menuDrawable.setRotation(1.0f, true);
            } else {
                BackDrawable backDrawable = this.backDrawable;
                if (backDrawable != null) {
                    backDrawable.setRotation(1.0f, true);
                }
            }
            z = false;
        }
        updateCounters(false);
        this.selectedDialogsCountTextView.setNumber(this.selectedDialogs.size(), z);
    }

    public void lambda$showOrUpdateActionMode$63(ValueAnimator valueAnimator) {
        this.progressToActionMode = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        for (int i = 0; i < this.actionBar.getChildCount(); i++) {
            if (this.actionBar.getChildAt(i).getVisibility() == 0 && this.actionBar.getChildAt(i) != this.actionBar.getActionMode() && this.actionBar.getChildAt(i) != this.actionBar.getBackButton()) {
                this.actionBar.getChildAt(i).setAlpha(1.0f - this.progressToActionMode);
            }
        }
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public void closeSearch() {
        if (AndroidUtilities.isTablet()) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
            TLObject tLObject = this.searchObject;
            if (tLObject != null) {
                this.searchViewPager.dialogsSearchAdapter.putRecentSearch(this.searchDialogId, tLObject);
                this.searchObject = null;
                return;
            }
            return;
        }
        this.closeSearchFieldOnHide = true;
    }

    public RecyclerListView getListView() {
        return this.viewPages[0].listView;
    }

    public RecyclerListView getSearchListView() {
        return this.searchViewPager.searchListView;
    }

    public void createUndoView() {
        Context context;
        if (this.undoView[0] == null && (context = getContext()) != null) {
            for (int i = 0; i < 2; i++) {
                this.undoView[i] = new AnonymousClass39(context);
                UndoView undoView = this.undoView[i];
                int i2 = this.undoViewIndex + 1;
                this.undoViewIndex = i2;
                ((ContentView) this.fragmentView).addView(undoView, i2, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            }
        }
    }

    public class AnonymousClass39 extends UndoView {
        AnonymousClass39(Context context) {
            super(context);
        }

        @Override
        public void setTranslationY(float f) {
            super.setTranslationY(f);
            if (this == DialogsActivity.this.undoView[0]) {
                if (DialogsActivity.this.undoView[1] == null || DialogsActivity.this.undoView[1].getVisibility() != 0) {
                    DialogsActivity.this.additionalFloatingTranslation = (getMeasuredHeight() + AndroidUtilities.dp(8.0f)) - f;
                    if (DialogsActivity.this.additionalFloatingTranslation < 0.0f) {
                        DialogsActivity.this.additionalFloatingTranslation = 0.0f;
                    }
                    if (DialogsActivity.this.floatingHidden) {
                        return;
                    }
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
                    final int i2 = -1;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= DialogsActivity.this.frozenDialogsList.size()) {
                            break;
                        } else if (((TLRPC$Dialog) DialogsActivity.this.frozenDialogsList.get(i3)).id == j) {
                            i2 = i3;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (i2 >= 0) {
                        final TLRPC$Dialog tLRPC$Dialog = (TLRPC$Dialog) DialogsActivity.this.frozenDialogsList.remove(i2);
                        DialogsActivity.this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                DialogsActivity.AnonymousClass39.this.lambda$onRemoveDialogAction$0(i2, tLRPC$Dialog);
                            }
                        });
                    } else {
                        DialogsActivity.this.setDialogsListFrozen(false);
                    }
                }
                DialogsActivity.this.checkAnimationFinished();
            }
        }

        public void lambda$onRemoveDialogAction$0(int i, TLRPC$Dialog tLRPC$Dialog) {
            if (DialogsActivity.this.frozenDialogsList == null || i < 0 || i >= DialogsActivity.this.frozenDialogsList.size()) {
                return;
            }
            DialogsActivity.this.frozenDialogsList.add(i, tLRPC$Dialog);
            DialogsActivity.this.viewPages[0].updateList(true);
        }
    }

    public UndoView getUndoView() {
        createUndoView();
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null && undoViewArr[0].getVisibility() == 0) {
            UndoView[] undoViewArr2 = this.undoView;
            UndoView undoView = undoViewArr2[0];
            undoViewArr2[0] = undoViewArr2[1];
            undoViewArr2[1] = undoView;
            undoView.hide(true, 2);
            ContentView contentView = (ContentView) this.fragmentView;
            contentView.removeView(this.undoView[0]);
            contentView.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    public void updateProxyButton(boolean z, boolean z2) {
        boolean z3;
        ActionBarMenuItem actionBarMenuItem;
        if (this.proxyDrawable != null) {
            ActionBarMenuItem actionBarMenuItem2 = this.doneItem;
            if (actionBarMenuItem2 == null || actionBarMenuItem2.getVisibility() != 0) {
                boolean z4 = false;
                int i = 0;
                while (true) {
                    if (i >= getDownloadController().downloadingFiles.size()) {
                        z3 = false;
                        break;
                    } else if (getFileLoader().isLoadingFile(getDownloadController().downloadingFiles.get(i).getFileName())) {
                        z3 = true;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!this.searching && (getDownloadController().hasUnviewedDownloads() || z3 || (this.downloadsItem.getVisibility() == 0 && this.downloadsItem.getAlpha() == 1.0f && !z2))) {
                    this.downloadsItemVisible = true;
                    this.downloadsItem.setVisibility(0);
                } else {
                    this.downloadsItem.setVisibility(8);
                    this.downloadsItemVisible = false;
                }
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                String string = sharedPreferences.getString("proxy_ip", BuildConfig.APP_CENTER_HASH);
                boolean z5 = sharedPreferences.getBoolean("proxy_enabled", false);
                if ((!this.downloadsItemVisible && !this.searching && z5 && !TextUtils.isEmpty(string)) || (getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty())) {
                    if (!this.actionBar.isSearchFieldVisible() && ((actionBarMenuItem = this.doneItem) == null || actionBarMenuItem.getVisibility() != 0)) {
                        this.proxyItem.setVisibility(0);
                    }
                    this.proxyItemVisible = true;
                    ProxyDrawable proxyDrawable = this.proxyDrawable;
                    int i2 = this.currentConnectionState;
                    proxyDrawable.setConnected(z5, (i2 == 3 || i2 == 5) ? true : true, z);
                    return;
                }
                this.proxyItemVisible = false;
                this.proxyItem.setVisibility(8);
            }
        }
    }

    public void showDoneItem(final boolean z) {
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
            ActionBarMenuItem actionBarMenuItem = this.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem2 = this.proxyItem;
            if (actionBarMenuItem2 != null && this.proxyItemVisible) {
                actionBarMenuItem2.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem3 = this.passcodeItem;
            if (actionBarMenuItem3 != null && this.passcodeItemVisible) {
                actionBarMenuItem3.setVisibility(0);
            }
            ActionBarMenuItem actionBarMenuItem4 = this.downloadsItem;
            if (actionBarMenuItem4 != null && this.downloadsItemVisible) {
                actionBarMenuItem4.setVisibility(0);
            }
        }
        ArrayList arrayList = new ArrayList();
        ActionBarMenuItem actionBarMenuItem5 = this.doneItem;
        Property property = View.ALPHA;
        float[] fArr = new float[1];
        fArr[0] = z ? 1.0f : 0.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem5, property, fArr));
        if (this.proxyItemVisible) {
            ActionBarMenuItem actionBarMenuItem6 = this.proxyItem;
            Property property2 = View.ALPHA;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem6, property2, fArr2));
        }
        if (this.passcodeItemVisible) {
            ActionBarMenuItem actionBarMenuItem7 = this.passcodeItem;
            Property property3 = View.ALPHA;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 0.0f : 1.0f;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem7, property3, fArr3));
        }
        ActionBarMenuItem actionBarMenuItem8 = this.searchItem;
        Property property4 = View.ALPHA;
        float[] fArr4 = new float[1];
        fArr4[0] = z ? 0.0f : 1.0f;
        arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem8, property4, fArr4));
        this.doneItemAnimator.playTogether(arrayList);
        this.doneItemAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                DialogsActivity.this.doneItemAnimator = null;
                if (z) {
                    if (DialogsActivity.this.searchItem != null) {
                        DialogsActivity.this.searchItem.setVisibility(4);
                    }
                    if (DialogsActivity.this.proxyItem != null && DialogsActivity.this.proxyItemVisible) {
                        DialogsActivity.this.proxyItem.setVisibility(4);
                    }
                    if (DialogsActivity.this.passcodeItem != null && DialogsActivity.this.passcodeItemVisible) {
                        DialogsActivity.this.passcodeItem.setVisibility(4);
                    }
                    if (DialogsActivity.this.downloadsItem == null || !DialogsActivity.this.downloadsItemVisible) {
                        return;
                    }
                    DialogsActivity.this.downloadsItem.setVisibility(4);
                } else if (DialogsActivity.this.doneItem != null) {
                    DialogsActivity.this.doneItem.setVisibility(8);
                }
            }
        });
        this.doneItemAnimator.start();
    }

    public void updateSelectedCount() {
        ChatActivityEnterView chatActivityEnterView = this.commentView;
        CharSequence charSequence = BuildConfig.APP_CENTER_HASH;
        if (chatActivityEnterView != null) {
            if (this.selectedDialogs.isEmpty()) {
                if (this.initialDialogsType == 3 && this.selectAlertString == null) {
                    this.actionBar.setTitle(LocaleController.getString("ForwardTo", R.string.ForwardTo));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("SelectChat", R.string.SelectChat));
                }
                if (this.commentView.getTag() != null) {
                    this.commentView.hidePopup(false);
                    this.commentView.closeKeyboard();
                    AnimatorSet animatorSet = this.commentViewAnimator;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    this.commentViewAnimator = new AnimatorSet();
                    this.commentView.setTranslationY(0.0f);
                    AnimatorSet animatorSet2 = this.commentViewAnimator;
                    ChatActivityEnterView chatActivityEnterView2 = this.commentView;
                    animatorSet2.playTogether(ObjectAnimator.ofFloat(chatActivityEnterView2, View.TRANSLATION_Y, chatActivityEnterView2.getMeasuredHeight()), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_X, 0.2f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_Y, 0.2f), ObjectAnimator.ofFloat(this.selectedCountView, View.ALPHA, 0.0f));
                    this.commentViewAnimator.setDuration(180L);
                    this.commentViewAnimator.setInterpolator(new DecelerateInterpolator());
                    this.commentViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            DialogsActivity.this.commentView.setVisibility(8);
                            DialogsActivity.this.writeButtonContainer.setVisibility(8);
                        }
                    });
                    this.commentViewAnimator.start();
                    this.commentView.setTag(null);
                    this.fragmentView.requestLayout();
                }
            } else {
                this.selectedCountView.invalidate();
                if (this.commentView.getTag() == null) {
                    this.commentView.setFieldText(BuildConfig.APP_CENTER_HASH);
                    AnimatorSet animatorSet3 = this.commentViewAnimator;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    this.commentView.setVisibility(0);
                    this.writeButtonContainer.setVisibility(0);
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    this.commentViewAnimator = animatorSet4;
                    ChatActivityEnterView chatActivityEnterView3 = this.commentView;
                    animatorSet4.playTogether(ObjectAnimator.ofFloat(chatActivityEnterView3, View.TRANSLATION_Y, chatActivityEnterView3.getMeasuredHeight(), 0.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.writeButtonContainer, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.selectedCountView, View.ALPHA, 1.0f));
                    this.commentViewAnimator.setDuration(180L);
                    this.commentViewAnimator.setInterpolator(new DecelerateInterpolator());
                    this.commentViewAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            DialogsActivity.this.commentView.setTag(2);
                            DialogsActivity.this.commentView.requestLayout();
                        }
                    });
                    this.commentViewAnimator.start();
                    this.commentView.setTag(1);
                }
                this.actionBar.setTitle(LocaleController.formatPluralString("Recipient", this.selectedDialogs.size(), new Object[0]));
            }
        } else if (this.initialDialogsType == 10) {
            hideFloatingButton(this.selectedDialogs.isEmpty());
        }
        ArrayList<Long> arrayList = this.selectedDialogs;
        ChatActivityEnterView chatActivityEnterView4 = this.commentView;
        if (chatActivityEnterView4 != null) {
            charSequence = chatActivityEnterView4.getFieldText();
        }
        boolean shouldShowNextButton = shouldShowNextButton(this, arrayList, charSequence, false);
        this.isNextButton = shouldShowNextButton;
        AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[0], !shouldShowNextButton, 0.5f, true);
        AndroidUtilities.updateViewVisibilityAnimated(this.writeButton[1], this.isNextButton, 0.5f, true);
    }

    @TargetApi(23)
    private void askForPermissons(boolean z) {
        Activity parentActivity = getParentActivity();
        if (parentActivity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (getUserConfig().syncContacts && this.askAboutContacts && parentActivity.checkSelfPermission("android.permission.READ_CONTACTS") != 0) {
            if (z) {
                AlertDialog create = AlertsCreator.createContactsPermissionDialog(parentActivity, new MessagesStorage.IntCallback() {
                    @Override
                    public final void run(int i) {
                        DialogsActivity.this.lambda$askForPermissons$64(i);
                    }
                }).create();
                this.permissionDialog = create;
                showDialog(create);
                return;
            }
            arrayList.add("android.permission.READ_CONTACTS");
            arrayList.add("android.permission.WRITE_CONTACTS");
            arrayList.add("android.permission.GET_ACCOUNTS");
        }
        if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
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

    public void lambda$askForPermissons$64(int i) {
        this.askAboutContacts = i != 0;
        MessagesController.getGlobalNotificationsSettings().edit().putBoolean("askAboutContacts", this.askAboutContacts).commit();
        askForPermissons(false);
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        super.onDialogDismiss(dialog);
        AlertDialog alertDialog = this.permissionDialog;
        if (alertDialog == null || dialog != alertDialog || getParentActivity() == null) {
            return;
        }
        askForPermissons(false);
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        FrameLayout frameLayout;
        super.onConfigurationChanged(configuration);
        ItemOptions itemOptions = this.filterOptions;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        if (this.onlySelect || (frameLayout = this.floatingButtonContainer) == null) {
            return;
        }
        frameLayout.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                DialogsActivity dialogsActivity = DialogsActivity.this;
                dialogsActivity.floatingButtonTranslation = dialogsActivity.floatingHidden ? AndroidUtilities.dp(100.0f) : 0.0f;
                DialogsActivity.this.updateFloatingButtonOffset();
                DialogsActivity.this.floatingButtonContainer.setClickable(!DialogsActivity.this.floatingHidden);
                if (DialogsActivity.this.floatingButtonContainer != null) {
                    DialogsActivity.this.floatingButtonContainer.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        FilesMigrationService.FilesMigrationBottomSheet filesMigrationBottomSheet;
        boolean z = true;
        if (i != 1) {
            if (i == 4) {
                int i2 = 0;
                while (true) {
                    if (i2 >= iArr.length) {
                        break;
                    } else if (iArr[i2] != 0) {
                        z = false;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (!z || Build.VERSION.SDK_INT < 30 || (filesMigrationBottomSheet = FilesMigrationService.filesMigrationBottomSheet) == null) {
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
                if (str.equals("android.permission.WRITE_EXTERNAL_STORAGE")) {
                    if (iArr[i3] == 0) {
                        ImageLoader.getInstance().checkMediaPaths();
                    }
                } else if (str.equals("android.permission.READ_CONTACTS")) {
                    if (iArr[i3] == 0) {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                DialogsActivity.this.lambda$onRequestPermissionsResultFragment$65();
                            }
                        });
                        getContactsController().forceImportContacts();
                    } else {
                        SharedPreferences.Editor edit = MessagesController.getGlobalNotificationsSettings().edit();
                        this.askAboutContacts = false;
                        edit.putBoolean("askAboutContacts", false).commit();
                    }
                }
            }
        }
        if (this.askingForPermissions) {
            this.askingForPermissions = false;
            showFiltersHint();
        }
    }

    public void lambda$onRequestPermissionsResultFragment$65() {
        getNotificationCenter().postNotificationName(NotificationCenter.forceImportContactsStart, new Object[0]);
    }

    private void reloadViewPageDialogs(ViewPage viewPage, boolean z) {
        int i;
        int i2;
        if (viewPage.getVisibility() != 0) {
            return;
        }
        int currentCount = viewPage.dialogsAdapter.getCurrentCount();
        if (viewPage.dialogsType == 0 && hasHiddenArchive() && viewPage.listView.getChildCount() == 0 && viewPage.archivePullViewState == 2) {
            ((LinearLayoutManager) viewPage.listView.getLayoutManager()).scrollToPositionWithOffset(1, (int) this.actionBar.getTranslationY());
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
            viewPage.listView.setEmptyView(this.folderId == 0 ? viewPage.progressView : null);
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
        final boolean booleanValue;
        final boolean z;
        DialogsSearchAdapter dialogsSearchAdapter;
        DialogsSearchAdapter dialogsSearchAdapter2;
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
                boolean z2 = (dialogFilter2 == null || (dialogFilter2.flags & MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ) == 0) ? false : true;
                if (this.slowedReloadAfterDialogClick && z2) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            DialogsActivity.this.lambda$didReceivedNotification$66(viewPage, objArr);
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
        } else if (i == NotificationCenter.dialogsUnreadCounterChanged) {
            FilterTabsView filterTabsView2 = this.filterTabsView;
            if (filterTabsView2 == null || filterTabsView2.getVisibility() != 0) {
                return;
            }
            FilterTabsView filterTabsView3 = this.filterTabsView;
            filterTabsView3.notifyTabCounterChanged(filterTabsView3.getDefaultTabId());
        } else if (i == NotificationCenter.dialogsUnreadReactionsCounterChanged) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.emojiLoaded) {
            if (this.viewPages != null) {
                int i5 = 0;
                while (true) {
                    ViewPage[] viewPageArr2 = this.viewPages;
                    if (i5 >= viewPageArr2.length) {
                        break;
                    }
                    DialogsRecyclerView dialogsRecyclerView = viewPageArr2[i5].listView;
                    if (dialogsRecyclerView != null) {
                        for (int i6 = 0; i6 < dialogsRecyclerView.getChildCount(); i6++) {
                            View childAt = dialogsRecyclerView.getChildAt(i6);
                            if (childAt != null) {
                                childAt.invalidate();
                            }
                        }
                    }
                    i5++;
                }
            }
            FilterTabsView filterTabsView4 = this.filterTabsView;
            if (filterTabsView4 != null) {
                filterTabsView4.getTabsContainer().invalidateViews();
            }
        } else if (i == NotificationCenter.closeSearchByActiveAction) {
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.closeSearchField();
            }
        } else if (i == NotificationCenter.proxySettingsChanged) {
            updateProxyButton(false, false);
        } else if (i == NotificationCenter.updateInterfaces) {
            Integer num = (Integer) objArr[0];
            updateVisibleRows(num.intValue());
            FilterTabsView filterTabsView5 = this.filterTabsView;
            if (filterTabsView5 != null && filterTabsView5.getVisibility() == 0 && (num.intValue() & MessagesController.UPDATE_MASK_READ_DIALOG_MESSAGE) != 0) {
                this.filterTabsView.checkTabsCounter();
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
        } else if (i == NotificationCenter.appDidLogout) {
            dialogsLoaded[this.currentAccount] = false;
        } else if (i == NotificationCenter.encryptedChatUpdated) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.contactsDidLoad) {
            if (this.viewPages == null || this.dialogsListFrozen) {
                return;
            }
            boolean z3 = this.floatingProgressVisible;
            setFloatingProgressVisible(false, true);
            for (ViewPage viewPage2 : this.viewPages) {
                viewPage2.dialogsAdapter.setForceUpdatingContacts(false);
            }
            if (z3) {
                setContactsAlpha(0.0f);
                animateContactsAlpha(1.0f);
            }
            int i7 = 0;
            boolean z4 = false;
            while (true) {
                ViewPage[] viewPageArr3 = this.viewPages;
                if (i7 >= viewPageArr3.length) {
                    break;
                }
                if (!viewPageArr3[i7].isDefaultDialogType() || getMessagesController().getAllFoldersDialogsCount() > 10) {
                    z4 = true;
                } else {
                    this.viewPages[i7].dialogsAdapter.notifyDataSetChanged();
                }
                i7++;
            }
            if (z4) {
                updateVisibleRows(0);
            }
        } else if (i == NotificationCenter.openedChatChanged) {
            if (this.viewPages == null) {
                return;
            }
            int i8 = 0;
            while (true) {
                ViewPage[] viewPageArr4 = this.viewPages;
                if (i8 < viewPageArr4.length) {
                    if (viewPageArr4[i8].isDefaultDialogType() && AndroidUtilities.isTablet()) {
                        boolean booleanValue2 = ((Boolean) objArr[2]).booleanValue();
                        long longValue = ((Long) objArr[0]).longValue();
                        int intValue = ((Integer) objArr[1]).intValue();
                        if (booleanValue2) {
                            MessagesStorage.TopicKey topicKey = this.openedDialogId;
                            if (longValue == topicKey.dialogId && intValue == topicKey.topicId) {
                                topicKey.dialogId = 0L;
                                topicKey.topicId = 0;
                            }
                        } else {
                            MessagesStorage.TopicKey topicKey2 = this.openedDialogId;
                            topicKey2.dialogId = longValue;
                            topicKey2.topicId = intValue;
                        }
                        this.viewPages[i8].dialogsAdapter.setOpenedDialogId(this.openedDialogId.dialogId);
                    }
                    i8++;
                } else {
                    updateVisibleRows(MessagesController.UPDATE_MASK_SELECT_DIALOG);
                    return;
                }
            }
        } else if (i == NotificationCenter.notificationsSettingsUpdated) {
            updateVisibleRows(0);
        } else if (i == NotificationCenter.messageReceivedByAck || i == NotificationCenter.messageReceivedByServer || i == NotificationCenter.messageSendError) {
            updateVisibleRows(MessagesController.UPDATE_MASK_SEND_STATE);
        } else if (i == NotificationCenter.didSetPasscode) {
            updatePasscodeButton();
        } else if (i == NotificationCenter.needReloadRecentDialogsSearch) {
            SearchViewPager searchViewPager = this.searchViewPager;
            if (searchViewPager == null || (dialogsSearchAdapter2 = searchViewPager.dialogsSearchAdapter) == null) {
                return;
            }
            dialogsSearchAdapter2.loadRecentSearch();
        } else if (i == NotificationCenter.replyMessagesDidLoad) {
            updateVisibleRows(MessagesController.UPDATE_MASK_MESSAGE_TEXT);
        } else if (i == NotificationCenter.reloadHints) {
            SearchViewPager searchViewPager2 = this.searchViewPager;
            if (searchViewPager2 == null || (dialogsSearchAdapter = searchViewPager2.dialogsSearchAdapter) == null) {
                return;
            }
            dialogsSearchAdapter.notifyDataSetChanged();
        } else if (i == NotificationCenter.didUpdateConnectionState) {
            int connectionState = AccountInstance.getInstance(i2).getConnectionsManager().getConnectionState();
            if (this.currentConnectionState != connectionState) {
                this.currentConnectionState = connectionState;
                updateProxyButton(true, false);
            }
        } else if (i == NotificationCenter.onDownloadingFilesChanged) {
            updateProxyButton(true, false);
            SearchViewPager searchViewPager3 = this.searchViewPager;
            if (searchViewPager3 != null) {
                updateSpeedItem(searchViewPager3.getCurrentPosition() == 2);
            }
        } else if (i == NotificationCenter.needDeleteDialog) {
            if (this.fragmentView == null || this.isPaused) {
                return;
            }
            final long longValue2 = ((Long) objArr[0]).longValue();
            final TLRPC$User tLRPC$User = (TLRPC$User) objArr[1];
            final TLRPC$Chat tLRPC$Chat = (TLRPC$Chat) objArr[2];
            if (tLRPC$User != null && tLRPC$User.bot) {
                z = ((Boolean) objArr[3]).booleanValue();
                booleanValue = false;
            } else {
                booleanValue = ((Boolean) objArr[3]).booleanValue();
                z = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$didReceivedNotification$67(tLRPC$Chat, longValue2, booleanValue, tLRPC$User, z);
                }
            };
            createUndoView();
            if (this.undoView[0] != null) {
                if (!ChatObject.isForum(tLRPC$Chat)) {
                    UndoView undoView = getUndoView();
                    if (undoView != null) {
                        undoView.showWithAction(longValue2, 1, runnable);
                        return;
                    }
                    return;
                }
                runnable.run();
                return;
            }
            runnable.run();
        } else if (i == NotificationCenter.folderBecomeEmpty) {
            int intValue2 = ((Integer) objArr[0]).intValue();
            int i9 = this.folderId;
            if (i9 != intValue2 || i9 == 0) {
                return;
            }
            finishFragment();
        } else if (i == NotificationCenter.dialogFiltersUpdated) {
            updateFilterTabs(true, true);
        } else if (i == NotificationCenter.filterSettingsUpdated) {
            showFiltersHint();
        } else if (i == NotificationCenter.newSuggestionsAvailable) {
            showNextSupportedSuggestion();
            updateDialogsHint();
        } else if (i == NotificationCenter.forceImportContactsStart) {
            setFloatingProgressVisible(true, true);
            ViewPage[] viewPageArr5 = this.viewPages;
            if (viewPageArr5 != null) {
                for (ViewPage viewPage3 : viewPageArr5) {
                    viewPage3.dialogsAdapter.setForceShowEmptyCell(false);
                    viewPage3.dialogsAdapter.setForceUpdatingContacts(true);
                    viewPage3.dialogsAdapter.notifyDataSetChanged();
                }
            }
        } else if (i == NotificationCenter.messagesDeleted) {
            if (!this.searchIsShowed || this.searchViewPager == null) {
                return;
            }
            this.searchViewPager.messagesDeleted(((Long) objArr[1]).longValue(), (ArrayList) objArr[0]);
        } else if (i == NotificationCenter.didClearDatabase) {
            if (this.viewPages != null) {
                while (true) {
                    ViewPage[] viewPageArr6 = this.viewPages;
                    if (i3 >= viewPageArr6.length) {
                        break;
                    }
                    viewPageArr6[i3].dialogsAdapter.didDatabaseCleared();
                    i3++;
                }
            }
            SuggestClearDatabaseBottomSheet.dismissDialog();
        } else if (i == NotificationCenter.appUpdateAvailable) {
            updateMenuButton(true);
        } else if (i == NotificationCenter.fileLoaded || i == NotificationCenter.fileLoadFailed || i == NotificationCenter.fileLoadProgressChanged) {
            String str = (String) objArr[0];
            if (SharedConfig.isAppUpdateAvailable() && FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document).equals(str)) {
                updateMenuButton(true);
            }
        } else if (i == NotificationCenter.onDatabaseMigration) {
            boolean booleanValue3 = ((Boolean) objArr[0]).booleanValue();
            if (this.fragmentView != null) {
                if (booleanValue3) {
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
            }
        } else if (i == NotificationCenter.onDatabaseOpened) {
            checkSuggestClearDatabase();
        } else if (i == NotificationCenter.userEmojiStatusUpdated) {
            updateStatus((TLRPC$User) objArr[0], true);
        } else if (i == NotificationCenter.currentUserPremiumStatusChanged) {
            updateStatus(UserConfig.getInstance(i2).getCurrentUser(), true);
        } else if (i == NotificationCenter.onDatabaseReset) {
            dialogsLoaded[this.currentAccount] = false;
            loadDialogs(getAccountInstance());
            getMessagesController().loadPinnedDialogs(this.folderId, 0L, null);
        } else if (i == NotificationCenter.chatlistFolderUpdate) {
            int intValue3 = ((Integer) objArr[0]).intValue();
            while (true) {
                ViewPage[] viewPageArr7 = this.viewPages;
                if (i3 >= viewPageArr7.length) {
                    return;
                }
                ViewPage viewPage4 = viewPageArr7[i3];
                if (viewPage4 != null && ((viewPage4.dialogsType == 7 || viewPage4.dialogsType == 8) && (dialogFilter = getMessagesController().selectedDialogFilter[viewPage4.dialogsType - 7]) != null && intValue3 == dialogFilter.id)) {
                    viewPage4.updateList(true);
                    return;
                }
                i3++;
            }
        } else if (i == NotificationCenter.dialogTranslate) {
            long longValue3 = ((Long) objArr[0]).longValue();
            int i10 = 0;
            while (true) {
                ViewPage[] viewPageArr8 = this.viewPages;
                if (i10 >= viewPageArr8.length) {
                    return;
                }
                ViewPage viewPage5 = viewPageArr8[i10];
                if (viewPage5.listView != null) {
                    int i11 = 0;
                    while (true) {
                        if (i11 < viewPage5.listView.getChildCount()) {
                            View childAt2 = viewPage5.listView.getChildAt(i11);
                            if (childAt2 instanceof DialogCell) {
                                DialogCell dialogCell = (DialogCell) childAt2;
                                if (longValue3 == dialogCell.getDialogId()) {
                                    dialogCell.buildLayout();
                                    break;
                                }
                            }
                            i11++;
                        }
                    }
                }
                i10++;
            }
        }
    }

    public void lambda$didReceivedNotification$66(ViewPage viewPage, Object[] objArr) {
        reloadViewPageDialogs(viewPage, objArr.length > 0);
        FilterTabsView filterTabsView = this.filterTabsView;
        if (filterTabsView == null || filterTabsView.getVisibility() != 0) {
            return;
        }
        this.filterTabsView.checkTabsCounter();
    }

    public void lambda$didReceivedNotification$67(TLRPC$Chat tLRPC$Chat, long j, boolean z, TLRPC$User tLRPC$User, boolean z2) {
        if (tLRPC$Chat != null) {
            if (ChatObject.isNotInChat(tLRPC$Chat)) {
                getMessagesController().deleteDialog(j, 0, z);
            } else {
                getMessagesController().deleteParticipantFromChat(-j, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), null, z, z);
            }
        } else {
            getMessagesController().deleteDialog(j, 0, z);
            if (tLRPC$User != null && tLRPC$User.bot && z2) {
                getMessagesController().blockPeer(tLRPC$User.id);
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

    private void updateMenuButton(boolean z) {
        int i;
        if (this.menuDrawable == null || this.updateLayout == null) {
            return;
        }
        float f = 0.0f;
        if (SharedConfig.isAppUpdateAvailable()) {
            String attachFileName = FileLoader.getAttachFileName(SharedConfig.pendingAppUpdate.document);
            if (getFileLoader().isLoadingFile(attachFileName)) {
                i = MenuDrawable.TYPE_UDPATE_DOWNLOADING;
                Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                if (fileProgress != null) {
                    f = fileProgress.floatValue();
                }
            } else {
                i = MenuDrawable.TYPE_UDPATE_AVAILABLE;
            }
        } else {
            i = MenuDrawable.TYPE_DEFAULT;
        }
        updateAppUpdateViews(z);
        this.menuDrawable.setType(i, z);
        this.menuDrawable.setUpdateDownloadProgress(f, z);
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
        if ("AUTOARCHIVE_POPULAR".equals(str)) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("HideNewChatsAlertTitle", R.string.HideNewChatsAlertTitle));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("HideNewChatsAlertText", R.string.HideNewChatsAlertText)));
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString("GoToSettings", R.string.GoToSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    DialogsActivity.this.lambda$showSuggestion$68(dialogInterface, i);
                }
            });
            showDialog(builder.create(), new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    DialogsActivity.this.lambda$showSuggestion$69(dialogInterface);
                }
            });
            return true;
        }
        return false;
    }

    public void lambda$showSuggestion$68(DialogInterface dialogInterface, int i) {
        presentFragment(new PrivacySettingsActivity());
        AndroidUtilities.scrollToFragmentRow(this.parentLayout, "newChatsRow");
    }

    public void lambda$showSuggestion$69(DialogInterface dialogInterface) {
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
                DialogsActivity.this.lambda$showFiltersHint$71();
            }
        }, 1000L);
    }

    public void lambda$showFiltersHint$71() {
        UndoView undoView = getUndoView();
        if (undoView != null) {
            undoView.showWithAction(0L, 15, null, new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$showFiltersHint$70();
                }
            });
        }
    }

    public void lambda$showFiltersHint$70() {
        presentFragment(new FiltersSetupActivity());
    }

    private void setDialogsListFrozen(boolean z, boolean z2) {
        if (this.viewPages == null || this.dialogsListFrozen == z) {
            return;
        }
        if (z) {
            this.frozenDialogsList = new ArrayList<>(getDialogsArray(this.currentAccount, this.viewPages[0].dialogsType, this.folderId, false));
        } else {
            this.frozenDialogsList = null;
        }
        this.dialogsListFrozen = z;
        this.viewPages[0].dialogsAdapter.setDialogsListFrozen(z);
        if (z || !z2) {
            return;
        }
        if (this.viewPages[0].listView.isComputingLayout()) {
            this.viewPages[0].listView.post(new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$setDialogsListFrozen$72();
                }
            });
        } else {
            this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$setDialogsListFrozen$72() {
        this.viewPages[0].dialogsAdapter.notifyDataSetChanged();
    }

    public void setDialogsListFrozen(boolean z) {
        setDialogsListFrozen(z, true);
    }

    public class DialogsHeader extends TLRPC$Dialog {
        public int headerType;

        public DialogsHeader(DialogsActivity dialogsActivity, int i) {
            this.headerType = i;
        }
    }

    public ArrayList<TLRPC$Dialog> getDialogsArray(int i, int i2, int i3, boolean z) {
        boolean z2;
        ArrayList<TLRPC$Dialog> arrayList;
        if (!z || (arrayList = this.frozenDialogsList) == null) {
            MessagesController messagesController = AccountInstance.getInstance(i).getMessagesController();
            if (i2 == 0) {
                return messagesController.getDialogs(i3);
            }
            if (i2 == 10 || i2 == 13) {
                return messagesController.dialogsServerOnly;
            }
            boolean z3 = true;
            if (i2 == 2) {
                ArrayList<TLRPC$Dialog> arrayList2 = new ArrayList<>(messagesController.dialogsCanAddUsers.size() + messagesController.dialogsMyChannels.size() + messagesController.dialogsMyGroups.size() + 2);
                if (messagesController.dialogsMyChannels.size() > 0 && this.allowChannels) {
                    arrayList2.add(new DialogsHeader(this, 0));
                    arrayList2.addAll(messagesController.dialogsMyChannels);
                }
                if (messagesController.dialogsMyGroups.size() > 0 && this.allowGroups) {
                    arrayList2.add(new DialogsHeader(this, 1));
                    arrayList2.addAll(messagesController.dialogsMyGroups);
                }
                if (messagesController.dialogsCanAddUsers.size() > 0) {
                    int size = messagesController.dialogsCanAddUsers.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        TLRPC$Dialog tLRPC$Dialog = messagesController.dialogsCanAddUsers.get(i4);
                        if ((this.allowChannels && ChatObject.isChannelAndNotMegaGroup(-tLRPC$Dialog.id, i)) || (this.allowGroups && (ChatObject.isMegagroup(i, -tLRPC$Dialog.id) || !ChatObject.isChannel(-tLRPC$Dialog.id, i)))) {
                            if (z3) {
                                arrayList2.add(new DialogsHeader(this, 2));
                                z3 = false;
                            }
                            arrayList2.add(tLRPC$Dialog);
                        }
                    }
                }
                return arrayList2;
            } else if (i2 == 3) {
                return messagesController.dialogsForward;
            } else {
                if (i2 == 4 || i2 == 12) {
                    return messagesController.dialogsUsersOnly;
                }
                if (i2 == 5) {
                    return messagesController.dialogsChannelsOnly;
                }
                if (i2 == 6 || i2 == 11) {
                    return messagesController.dialogsGroupsOnly;
                }
                if (i2 == 7 || i2 == 8) {
                    MessagesController.DialogFilter dialogFilter = messagesController.selectedDialogFilter[i2 != 7 ? (char) 1 : (char) 0];
                    if (dialogFilter == null) {
                        return messagesController.getDialogs(i3);
                    }
                    if (this.initialDialogsType == 3) {
                        return dialogFilter.dialogsForward;
                    }
                    return dialogFilter.dialogs;
                } else if (i2 == 9) {
                    return messagesController.dialogsForBlock;
                } else {
                    if (i2 == 1 || i2 == 14) {
                        ArrayList<TLRPC$Dialog> arrayList3 = this.botShareDialogs;
                        if (arrayList3 != null) {
                            return arrayList3;
                        }
                        this.botShareDialogs = new ArrayList<>();
                        if (this.allowUsers || this.allowBots) {
                            Iterator<TLRPC$Dialog> it = messagesController.dialogsUsersOnly.iterator();
                            while (it.hasNext()) {
                                TLRPC$Dialog next = it.next();
                                TLRPC$User user = messagesController.getUser(Long.valueOf(next.id));
                                if (user != null && !UserObject.isUserSelf(user)) {
                                    if (user.bot) {
                                        if (this.allowBots) {
                                            this.botShareDialogs.add(next);
                                        }
                                    } else if (this.allowUsers) {
                                        this.botShareDialogs.add(next);
                                    }
                                }
                            }
                        }
                        if (this.allowGroups || ((z2 = this.allowLegacyGroups) && this.allowMegagroups)) {
                            Iterator<TLRPC$Dialog> it2 = messagesController.dialogsGroupsOnly.iterator();
                            while (it2.hasNext()) {
                                TLRPC$Dialog next2 = it2.next();
                                TLRPC$Chat chat = messagesController.getChat(Long.valueOf(-next2.id));
                                if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && messagesController.canAddToForward(next2)) {
                                    this.botShareDialogs.add(next2);
                                }
                            }
                        } else if (z2 || this.allowMegagroups) {
                            Iterator<TLRPC$Dialog> it3 = messagesController.dialogsGroupsOnly.iterator();
                            while (it3.hasNext()) {
                                TLRPC$Dialog next3 = it3.next();
                                TLRPC$Chat chat2 = messagesController.getChat(Long.valueOf(-next3.id));
                                if (chat2 != null && !ChatObject.isChannelAndNotMegaGroup(chat2) && messagesController.canAddToForward(next3) && ((this.allowLegacyGroups && !ChatObject.isMegagroup(chat2)) || (this.allowMegagroups && ChatObject.isMegagroup(chat2)))) {
                                    this.botShareDialogs.add(next3);
                                }
                            }
                        }
                        if (this.allowChannels) {
                            Iterator<TLRPC$Dialog> it4 = messagesController.dialogsChannelsOnly.iterator();
                            while (it4.hasNext()) {
                                TLRPC$Dialog next4 = it4.next();
                                if (messagesController.canAddToForward(next4)) {
                                    this.botShareDialogs.add(next4);
                                }
                            }
                        }
                        getMessagesController().sortDialogsList(this.botShareDialogs);
                        return this.botShareDialogs;
                    } else if (i2 == 15) {
                        ArrayList<TLRPC$Dialog> arrayList4 = new ArrayList<>();
                        TLRPC$User user2 = messagesController.getUser(Long.valueOf(this.requestPeerBotId));
                        TLRPC$RequestPeerType tLRPC$RequestPeerType = this.requestPeerType;
                        if (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeUser) {
                            ConcurrentHashMap<Long, TLRPC$User> users = messagesController.getUsers();
                            Iterator<TLRPC$Dialog> it5 = messagesController.dialogsUsersOnly.iterator();
                            while (it5.hasNext()) {
                                TLRPC$Dialog next5 = it5.next();
                                if (meetRequestPeerRequirements(getMessagesController().getUser(Long.valueOf(next5.id)))) {
                                    arrayList4.add(next5);
                                }
                            }
                            for (TLRPC$User tLRPC$User : users.values()) {
                                if (tLRPC$User != null && !messagesController.dialogs_dict.containsKey(tLRPC$User.id) && meetRequestPeerRequirements(tLRPC$User)) {
                                    TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
                                    TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                                    tLRPC$TL_dialog.peer = tLRPC$TL_peerUser;
                                    long j = tLRPC$User.id;
                                    tLRPC$TL_peerUser.user_id = j;
                                    tLRPC$TL_dialog.id = j;
                                    arrayList4.add(tLRPC$TL_dialog);
                                }
                            }
                        } else if ((tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeChat) || (tLRPC$RequestPeerType instanceof TLRPC$TL_requestPeerTypeBroadcast)) {
                            ConcurrentHashMap<Long, TLRPC$Chat> chats = messagesController.getChats();
                            Iterator<TLRPC$Dialog> it6 = (this.requestPeerType instanceof TLRPC$TL_requestPeerTypeChat ? messagesController.dialogsGroupsOnly : messagesController.dialogsChannelsOnly).iterator();
                            while (it6.hasNext()) {
                                TLRPC$Dialog next6 = it6.next();
                                if (meetRequestPeerRequirements(user2, getMessagesController().getChat(Long.valueOf(-next6.id)))) {
                                    arrayList4.add(next6);
                                }
                            }
                            for (TLRPC$Chat tLRPC$Chat : chats.values()) {
                                if (tLRPC$Chat != null && !messagesController.dialogs_dict.containsKey(-tLRPC$Chat.id) && meetRequestPeerRequirements(user2, tLRPC$Chat)) {
                                    TLRPC$TL_dialog tLRPC$TL_dialog2 = new TLRPC$TL_dialog();
                                    if (ChatObject.isChannel(tLRPC$Chat)) {
                                        TLRPC$TL_peerChannel tLRPC$TL_peerChannel = new TLRPC$TL_peerChannel();
                                        tLRPC$TL_dialog2.peer = tLRPC$TL_peerChannel;
                                        tLRPC$TL_peerChannel.channel_id = tLRPC$Chat.id;
                                    } else {
                                        TLRPC$TL_peerChat tLRPC$TL_peerChat = new TLRPC$TL_peerChat();
                                        tLRPC$TL_dialog2.peer = tLRPC$TL_peerChat;
                                        tLRPC$TL_peerChat.chat_id = tLRPC$Chat.id;
                                    }
                                    tLRPC$TL_dialog2.id = -tLRPC$Chat.id;
                                    arrayList4.add(tLRPC$TL_dialog2);
                                }
                            }
                        }
                        return arrayList4;
                    } else {
                        return new ArrayList<>();
                    }
                }
            }
        }
        return arrayList;
    }

    private boolean meetRequestPeerRequirements(TLRPC$User tLRPC$User) {
        Boolean bool;
        Boolean bool2;
        TLRPC$TL_requestPeerTypeUser tLRPC$TL_requestPeerTypeUser = (TLRPC$TL_requestPeerTypeUser) this.requestPeerType;
        return (tLRPC$User == null || UserObject.isReplyUser(tLRPC$User) || UserObject.isDeleted(tLRPC$User) || ((bool = tLRPC$TL_requestPeerTypeUser.bot) != null && bool.booleanValue() != tLRPC$User.bot) || ((bool2 = tLRPC$TL_requestPeerTypeUser.premium) != null && bool2.booleanValue() != tLRPC$User.premium)) ? false : true;
    }

    private boolean meetRequestPeerRequirements(org.telegram.tgnet.TLRPC$User r6, org.telegram.tgnet.TLRPC$Chat r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.meetRequestPeerRequirements(org.telegram.tgnet.TLRPC$User, org.telegram.tgnet.TLRPC$Chat):boolean");
    }

    public void setSideMenu(RecyclerView recyclerView) {
        this.sideMenu = recyclerView;
        int i = Theme.key_chats_menuBackground;
        recyclerView.setBackgroundColor(Theme.getColor(i));
        this.sideMenu.setGlowColor(Theme.getColor(i));
    }

    public void updatePasscodeButton() {
        if (this.passcodeItem == null) {
            return;
        }
        if (SharedConfig.passcodeHash.length() != 0 && !this.searching) {
            ActionBarMenuItem actionBarMenuItem = this.doneItem;
            if (actionBarMenuItem == null || actionBarMenuItem.getVisibility() != 0) {
                this.passcodeItem.setVisibility(0);
            }
            this.passcodeItem.setIcon(this.passcodeDrawable);
            this.passcodeItemVisible = true;
            return;
        }
        this.passcodeItem.setVisibility(8);
        this.passcodeItemVisible = false;
    }

    private void setFloatingProgressVisible(final boolean z, boolean z2) {
        if (this.floatingButton == null || this.floatingProgressView == null) {
            return;
        }
        if (z2) {
            if (z == this.floatingProgressVisible) {
                return;
            }
            AnimatorSet animatorSet = this.floatingProgressAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.floatingProgressVisible = z;
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.floatingProgressAnimator = animatorSet2;
            Animator[] animatorArr = new Animator[6];
            RLottieImageView rLottieImageView = this.floatingButton;
            Property property = View.ALPHA;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : 1.0f;
            animatorArr[0] = ObjectAnimator.ofFloat(rLottieImageView, property, fArr);
            RLottieImageView rLottieImageView2 = this.floatingButton;
            Property property2 = View.SCALE_X;
            float[] fArr2 = new float[1];
            fArr2[0] = z ? 0.1f : 1.0f;
            animatorArr[1] = ObjectAnimator.ofFloat(rLottieImageView2, property2, fArr2);
            RLottieImageView rLottieImageView3 = this.floatingButton;
            Property property3 = View.SCALE_Y;
            float[] fArr3 = new float[1];
            fArr3[0] = z ? 0.1f : 1.0f;
            animatorArr[2] = ObjectAnimator.ofFloat(rLottieImageView3, property3, fArr3);
            RadialProgressView radialProgressView = this.floatingProgressView;
            Property property4 = View.ALPHA;
            float[] fArr4 = new float[1];
            fArr4[0] = z ? 1.0f : 0.0f;
            animatorArr[3] = ObjectAnimator.ofFloat(radialProgressView, property4, fArr4);
            RadialProgressView radialProgressView2 = this.floatingProgressView;
            Property property5 = View.SCALE_X;
            float[] fArr5 = new float[1];
            fArr5[0] = z ? 1.0f : 0.1f;
            animatorArr[4] = ObjectAnimator.ofFloat(radialProgressView2, property5, fArr5);
            RadialProgressView radialProgressView3 = this.floatingProgressView;
            Property property6 = View.SCALE_Y;
            float[] fArr6 = new float[1];
            fArr6[0] = z ? 1.0f : 0.1f;
            animatorArr[5] = ObjectAnimator.ofFloat(radialProgressView3, property6, fArr6);
            animatorSet2.playTogether(animatorArr);
            this.floatingProgressAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    DialogsActivity.this.floatingProgressView.setVisibility(0);
                    DialogsActivity.this.floatingButton.setVisibility(0);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator == DialogsActivity.this.floatingProgressAnimator) {
                        if (z) {
                            if (DialogsActivity.this.floatingButton != null) {
                                DialogsActivity.this.floatingButton.setVisibility(8);
                            }
                        } else if (DialogsActivity.this.floatingButton != null) {
                            DialogsActivity.this.floatingProgressView.setVisibility(8);
                        }
                        DialogsActivity.this.floatingProgressAnimator = null;
                    }
                }
            });
            this.floatingProgressAnimator.setDuration(150L);
            this.floatingProgressAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.floatingProgressAnimator.start();
            return;
        }
        AnimatorSet animatorSet3 = this.floatingProgressAnimator;
        if (animatorSet3 != null) {
            animatorSet3.cancel();
        }
        this.floatingProgressVisible = z;
        if (z) {
            this.floatingButton.setAlpha(0.0f);
            this.floatingButton.setScaleX(0.1f);
            this.floatingButton.setScaleY(0.1f);
            this.floatingButton.setVisibility(8);
            this.floatingProgressView.setAlpha(1.0f);
            this.floatingProgressView.setScaleX(1.0f);
            this.floatingProgressView.setScaleY(1.0f);
            this.floatingProgressView.setVisibility(0);
            return;
        }
        this.floatingButton.setAlpha(1.0f);
        this.floatingButton.setScaleX(1.0f);
        this.floatingButton.setScaleY(1.0f);
        this.floatingButton.setVisibility(0);
        this.floatingProgressView.setAlpha(0.0f);
        this.floatingProgressView.setScaleX(0.1f);
        this.floatingProgressView.setScaleY(0.1f);
        this.floatingProgressView.setVisibility(8);
    }

    public void hideFloatingButton(boolean z) {
        if (this.rightSlidingDialogContainer.hasFragment()) {
            z = true;
        }
        if (this.floatingHidden != z) {
            if (z && this.floatingForceVisible) {
                return;
            }
            this.floatingHidden = z;
            AnimatorSet animatorSet = new AnimatorSet();
            float[] fArr = new float[2];
            fArr[0] = this.floatingButtonHideProgress;
            fArr[1] = this.floatingHidden ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DialogsActivity.this.lambda$hideFloatingButton$73(valueAnimator);
                }
            });
            animatorSet.playTogether(ofFloat);
            animatorSet.setDuration(300L);
            animatorSet.setInterpolator(this.floatingInterpolator);
            this.floatingButtonContainer.setClickable(!z);
            animatorSet.start();
        }
    }

    public void lambda$hideFloatingButton$73(ValueAnimator valueAnimator) {
        this.floatingButtonHideProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.floatingButtonTranslation = AndroidUtilities.dp(100.0f) * this.floatingButtonHideProgress;
        updateFloatingButtonOffset();
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
                DialogsActivity.this.lambda$animateContactsAlpha$74(valueAnimator2);
            }
        });
        this.contactsAlphaAnimator.start();
    }

    public void lambda$animateContactsAlpha$74(ValueAnimator valueAnimator) {
        setContactsAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void setContactsAlpha(float f) {
        ViewPage[] viewPageArr;
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

    private void updateVisibleRows(int r17, boolean r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.updateVisibleRows(int, boolean):void");
    }

    public void setDelegate(DialogsActivityDelegate dialogsActivityDelegate) {
        this.delegate = dialogsActivityDelegate;
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
        if (this.addToGroupAlertString == null && this.initialDialogsType != 15 && this.checkCanWrite) {
            if (DialogObject.isChatDialog(j)) {
                long j2 = -j;
                TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(j2));
                if (!ChatObject.isChannel(chat) || chat.megagroup) {
                    return true;
                }
                if (this.cantSendToChannels || !ChatObject.isCanWriteToChannel(j2, this.currentAccount) || this.hasPoll == 2) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTitle(LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle));
                    if (this.hasPoll == 2) {
                        builder.setMessage(LocaleController.getString("PublicPollCantForward", R.string.PublicPollCantForward));
                    } else {
                        builder.setMessage(LocaleController.getString("ChannelCantSendMessage", R.string.ChannelCantSendMessage));
                    }
                    builder.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                    showDialog(builder.create());
                    return false;
                }
                return true;
            } else if (DialogObject.isEncryptedDialog(j)) {
                if (this.hasPoll != 0 || this.hasInvoice) {
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                    builder2.setTitle(LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle));
                    if (this.hasPoll != 0) {
                        builder2.setMessage(LocaleController.getString("PollCantForwardSecretChat", R.string.PollCantForwardSecretChat));
                    } else {
                        builder2.setMessage(LocaleController.getString("InvoiceCantForwardSecretChat", R.string.InvoiceCantForwardSecretChat));
                    }
                    builder2.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                    showDialog(builder2.create());
                    return false;
                }
                return true;
            } else {
                return true;
            }
        }
        return true;
    }

    public void didSelectResult(long j, int i, boolean z, boolean z2) {
        didSelectResult(j, i, z, z2, null);
    }

    public void didSelectResult(final long j, final int i, boolean z, final boolean z2, final TopicsFragment topicsFragment) {
        final TLRPC$Chat tLRPC$Chat;
        final TLRPC$User tLRPC$User;
        String string;
        String formatStringSimple;
        String string2;
        TLRPC$TL_forumTopic findTopic;
        if (checkCanWrite(j)) {
            int i2 = this.initialDialogsType;
            if (i2 == 11 || i2 == 12 || i2 == 13) {
                if (this.checkingImportDialog) {
                    return;
                }
                if (DialogObject.isUserDialog(j)) {
                    TLRPC$User user = getMessagesController().getUser(Long.valueOf(j));
                    if (!user.mutual_contact) {
                        UndoView undoView = getUndoView();
                        if (undoView != null) {
                            undoView.showWithAction(j, 45, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    tLRPC$User = user;
                    tLRPC$Chat = null;
                } else {
                    TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-j));
                    if (!ChatObject.hasAdminRights(chat) || !ChatObject.canChangeChatInfo(chat)) {
                        UndoView undoView2 = getUndoView();
                        if (undoView2 != null) {
                            undoView2.showWithAction(j, 46, (Runnable) null);
                            return;
                        }
                        return;
                    }
                    tLRPC$Chat = chat;
                    tLRPC$User = null;
                }
                final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
                final TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer = new TLRPC$TL_messages_checkHistoryImportPeer();
                tLRPC$TL_messages_checkHistoryImportPeer.peer = getMessagesController().getInputPeer(j);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_checkHistoryImportPeer, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        DialogsActivity.this.lambda$didSelectResult$77(alertDialog, tLRPC$User, tLRPC$Chat, j, z2, tLRPC$TL_messages_checkHistoryImportPeer, tLObject, tLRPC$TL_error);
                    }
                });
                try {
                    alertDialog.showDelayed(300L);
                } catch (Exception unused) {
                }
            } else if (!z || ((this.selectAlertString == null || this.selectAlertStringGroup == null) && this.addToGroupAlertString == null)) {
                if (i2 == 15) {
                    final Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            DialogsActivity.this.lambda$didSelectResult$79(j, i, z2, topicsFragment);
                        }
                    };
                    Runnable runnable2 = new Runnable() {
                        @Override
                        public final void run() {
                            DialogsActivity.this.lambda$didSelectResult$81(j, runnable);
                        }
                    };
                    if (j < 0) {
                        showSendToBotAlert(getMessagesController().getChat(Long.valueOf(-j)), runnable2, (Runnable) null);
                    } else {
                        showSendToBotAlert(getMessagesController().getUser(Long.valueOf(j)), runnable2, (Runnable) null);
                    }
                } else if (this.delegate != null) {
                    ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
                    arrayList.add(MessagesStorage.TopicKey.of(j, i));
                    if (this.delegate.didSelectDialogs(this, arrayList, null, z2, topicsFragment) && this.resetDelegate) {
                        this.delegate = null;
                    }
                } else {
                    finishFragment();
                }
            } else if (getParentActivity() == null) {
            } else {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                if (DialogObject.isEncryptedDialog(j)) {
                    TLRPC$User user2 = getMessagesController().getUser(Long.valueOf(getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(j))).user_id));
                    if (user2 == null) {
                        return;
                    }
                    string = LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle);
                    formatStringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user2));
                    string2 = LocaleController.getString("Send", R.string.Send);
                } else if (DialogObject.isUserDialog(j)) {
                    if (j == getUserConfig().getClientUserId()) {
                        string = LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle);
                        formatStringSimple = LocaleController.formatStringSimple(this.selectAlertStringGroup, LocaleController.getString("SavedMessages", R.string.SavedMessages));
                        string2 = LocaleController.getString("Send", R.string.Send);
                    } else {
                        TLRPC$User user3 = getMessagesController().getUser(Long.valueOf(j));
                        if (user3 == null || this.selectAlertString == null) {
                            return;
                        }
                        string = LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle);
                        formatStringSimple = LocaleController.formatStringSimple(this.selectAlertString, UserObject.getUserName(user3));
                        string2 = LocaleController.getString("Send", R.string.Send);
                    }
                } else {
                    TLRPC$Chat chat2 = getMessagesController().getChat(Long.valueOf(-j));
                    if (chat2 == null) {
                        return;
                    }
                    String str = chat2.title;
                    if (i != 0 && (findTopic = getMessagesController().getTopicsController().findTopic(chat2.id, i)) != null) {
                        str = ((Object) str) + " " + findTopic.title;
                    }
                    if (this.addToGroupAlertString != null) {
                        string = LocaleController.getString("AddToTheGroupAlertTitle", R.string.AddToTheGroupAlertTitle);
                        formatStringSimple = LocaleController.formatStringSimple(this.addToGroupAlertString, str);
                        string2 = LocaleController.getString("Add", R.string.Add);
                    } else {
                        string = LocaleController.getString("SendMessageTitle", R.string.SendMessageTitle);
                        formatStringSimple = LocaleController.formatStringSimple(this.selectAlertStringGroup, str);
                        string2 = LocaleController.getString("Send", R.string.Send);
                    }
                }
                String str2 = string2;
                builder.setTitle(string);
                builder.setMessage(AndroidUtilities.replaceTags(formatStringSimple));
                builder.setPositiveButton(str2, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i3) {
                        DialogsActivity.this.lambda$didSelectResult$78(j, i, topicsFragment, dialogInterface, i3);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
                AlertDialog create = builder.create();
                if (showDialog(create) == null) {
                    create.show();
                }
            }
        }
    }

    public void lambda$didSelectResult$77(final AlertDialog alertDialog, final TLRPC$User tLRPC$User, final TLRPC$Chat tLRPC$Chat, final long j, final boolean z, final TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$didSelectResult$76(alertDialog, tLObject, tLRPC$User, tLRPC$Chat, j, z, tLRPC$TL_error, tLRPC$TL_messages_checkHistoryImportPeer);
            }
        });
    }

    public void lambda$didSelectResult$76(AlertDialog alertDialog, TLObject tLObject, TLRPC$User tLRPC$User, TLRPC$Chat tLRPC$Chat, final long j, final boolean z, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_messages_checkHistoryImportPeer tLRPC$TL_messages_checkHistoryImportPeer) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.checkingImportDialog = false;
        if (tLObject != null) {
            AlertsCreator.createImportDialogAlert(this, this.arguments.getString("importTitle"), ((TLRPC$TL_messages_checkedHistoryImportPeer) tLObject).confirm_text, tLRPC$User, tLRPC$Chat, new Runnable() {
                @Override
                public final void run() {
                    DialogsActivity.this.lambda$didSelectResult$75(j, z);
                }
            });
            return;
        }
        AlertsCreator.processError(this.currentAccount, tLRPC$TL_error, this, tLRPC$TL_messages_checkHistoryImportPeer, new Object[0]);
        getNotificationCenter().postNotificationName(NotificationCenter.historyImportProgressChanged, Long.valueOf(j), tLRPC$TL_messages_checkHistoryImportPeer, tLRPC$TL_error);
    }

    public void lambda$didSelectResult$75(long j, boolean z) {
        setDialogsListFrozen(true);
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
        arrayList.add(MessagesStorage.TopicKey.of(j, 0));
        this.delegate.didSelectDialogs(this, arrayList, null, z, null);
    }

    public void lambda$didSelectResult$78(long j, int i, TopicsFragment topicsFragment, DialogInterface dialogInterface, int i2) {
        didSelectResult(j, i, false, false, topicsFragment);
    }

    public void lambda$didSelectResult$79(long j, int i, boolean z, TopicsFragment topicsFragment) {
        if (this.delegate != null) {
            ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
            arrayList.add(MessagesStorage.TopicKey.of(j, i));
            this.delegate.didSelectDialogs(this, arrayList, null, z, topicsFragment);
            if (this.resetDelegate) {
                this.delegate = null;
                return;
            }
            return;
        }
        finishFragment();
    }

    public void lambda$didSelectResult$81(long j, final Runnable runnable) {
        if (this.requestPeerType.bot_admin_rights != null) {
            getMessagesController().setUserAdminRole(-j, getMessagesController().getUser(Long.valueOf(this.requestPeerBotId)), this.requestPeerType.bot_admin_rights, null, false, this, true, true, null, runnable, new MessagesController.ErrorDelegate() {
                @Override
                public final boolean run(TLRPC$TL_error tLRPC$TL_error) {
                    boolean run;
                    run = runnable.run();
                    return run;
                }
            });
            return;
        }
        runnable.run();
    }

    private void showSendToBotAlert(TLRPC$User tLRPC$User, final Runnable runnable, final Runnable runnable2) {
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
        showDialog(new AlertDialog.Builder(getContext()).setTitle(LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, UserObject.getFirstName(tLRPC$User), UserObject.getFirstName(user))).setMessage(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, UserObject.getFirstName(tLRPC$User), UserObject.getFirstName(user))))).setPositiveButton(LocaleController.formatString("Send", R.string.Send, new Object[0]), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogsActivity.lambda$showSendToBotAlert$83(runnable2, dialogInterface, i);
            }
        }).create());
    }

    public static void lambda$showSendToBotAlert$83(Runnable runnable, DialogInterface dialogInterface, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public void showSendToBotAlert(TLRPC$Chat tLRPC$Chat, final Runnable runnable, final Runnable runnable2) {
        CharSequence charSequence;
        String formatString;
        TLRPC$User user = getMessagesController().getUser(Long.valueOf(this.requestPeerBotId));
        boolean isChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(tLRPC$Chat);
        AlertDialog.Builder title = new AlertDialog.Builder(getContext()).setTitle(LocaleController.formatString(R.string.AreYouSureSendChatToBotTitle, tLRPC$Chat.title, UserObject.getFirstName(user)));
        CharSequence[] charSequenceArr = new CharSequence[2];
        charSequenceArr[0] = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AreYouSureSendChatToBotMessage, tLRPC$Chat.title, UserObject.getFirstName(user)));
        Boolean bool = this.requestPeerType.bot_participant;
        if ((bool == null || !bool.booleanValue() || getMessagesController().isInChatCached(tLRPC$Chat, user)) && this.requestPeerType.bot_admin_rights == null) {
            charSequence = BuildConfig.APP_CENTER_HASH;
        } else {
            CharSequence[] charSequenceArr2 = new CharSequence[2];
            charSequenceArr2[0] = "\n\n";
            if (this.requestPeerType.bot_admin_rights == null) {
                formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAdd, UserObject.getFirstName(user), tLRPC$Chat.title);
            } else {
                formatString = LocaleController.formatString(R.string.AreYouSureSendChatToBotAddRights, UserObject.getFirstName(user), tLRPC$Chat.title, RequestPeerRequirementsCell.rightsToString(this.requestPeerType.bot_admin_rights, isChannelAndNotMegaGroup));
            }
            charSequenceArr2[1] = AndroidUtilities.replaceTags(formatString);
            charSequence = TextUtils.concat(charSequenceArr2);
        }
        charSequenceArr[1] = charSequence;
        showDialog(title.setMessage(TextUtils.concat(charSequenceArr)).setPositiveButton(LocaleController.formatString("Send", R.string.Send, new Object[0]), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                runnable.run();
            }
        }).setNegativeButton(LocaleController.formatString("Cancel", R.string.Cancel, new Object[0]), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                DialogsActivity.lambda$showSendToBotAlert$85(runnable2, dialogInterface, i);
            }
        }).create());
    }

    public static void lambda$showSendToBotAlert$85(Runnable runnable, DialogInterface dialogInterface, int i) {
        if (runnable != null) {
            runnable.run();
        }
    }

    public RLottieImageView getFloatingButton() {
        return this.floatingButton;
    }

    private boolean onSendLongClick(View view) {
        Activity parentActivity = getParentActivity();
        Theme.ResourcesProvider resourceProvider = getResourceProvider();
        if (parentActivity == null) {
            return false;
        }
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(parentActivity, resourceProvider);
        actionBarPopupWindowLayout.setAnimationEnabled(false);
        actionBarPopupWindowLayout.setOnTouchListener(new View.OnTouchListener() {
            private Rect popupRect = new Rect();

            @Override
            public boolean onTouch(View view2, MotionEvent motionEvent) {
                if (motionEvent.getActionMasked() == 0 && DialogsActivity.this.sendPopupWindow != null && DialogsActivity.this.sendPopupWindow.isShowing()) {
                    view2.getHitRect(this.popupRect);
                    if (this.popupRect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                        return false;
                    }
                    DialogsActivity.this.sendPopupWindow.dismiss();
                    return false;
                }
                return false;
            }
        });
        actionBarPopupWindowLayout.setDispatchKeyEventListener(new ActionBarPopupWindow.OnDispatchKeyEventListener() {
            @Override
            public final void onDispatchKeyEvent(KeyEvent keyEvent) {
                DialogsActivity.this.lambda$onSendLongClick$86(keyEvent);
            }
        });
        actionBarPopupWindowLayout.setShownFromBottom(false);
        actionBarPopupWindowLayout.setupRadialSelectors(getThemedColor(Theme.key_dialogButtonSelector));
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) parentActivity, true, true, resourceProvider);
        actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("SendWithoutSound", R.string.SendWithoutSound), R.drawable.input_notify_off);
        actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(196.0f));
        actionBarPopupWindowLayout.addView((View) actionBarMenuSubItem, LayoutHelper.createLinear(-1, 48));
        actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                DialogsActivity.this.lambda$onSendLongClick$87(view2);
            }
        });
        linearLayout.addView(actionBarPopupWindowLayout, LayoutHelper.createLinear(-1, -2));
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
        this.sendPopupWindow.showAtLocation(view, 51, ((iArr[0] + view.getMeasuredWidth()) - linearLayout.getMeasuredWidth()) + AndroidUtilities.dp(8.0f), (iArr[1] - linearLayout.getMeasuredHeight()) - AndroidUtilities.dp(2.0f));
        this.sendPopupWindow.dimBehind();
        view.performHapticFeedback(3, 2);
        return false;
    }

    public void lambda$onSendLongClick$86(KeyEvent keyEvent) {
        ActionBarPopupWindow actionBarPopupWindow;
        if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && (actionBarPopupWindow = this.sendPopupWindow) != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
    }

    public void lambda$onSendLongClick$87(View view) {
        ActionBarPopupWindow actionBarPopupWindow = this.sendPopupWindow;
        if (actionBarPopupWindow != null && actionBarPopupWindow.isShowing()) {
            this.sendPopupWindow.dismiss();
        }
        this.notify = false;
        if (this.delegate == null || this.selectedDialogs.isEmpty()) {
            return;
        }
        ArrayList<MessagesStorage.TopicKey> arrayList = new ArrayList<>();
        for (int i = 0; i < this.selectedDialogs.size(); i++) {
            arrayList.add(MessagesStorage.TopicKey.of(this.selectedDialogs.get(i).longValue(), 0));
        }
        this.delegate.didSelectDialogs(this, arrayList, this.commentView.getFieldText(), false, null);
    }

    @Override
    public java.util.ArrayList<org.telegram.ui.ActionBar.ThemeDescription> getThemeDescriptions() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.getThemeDescriptions():java.util.ArrayList");
    }

    public void lambda$getThemeDescriptions$88() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.DialogsActivity.lambda$getThemeDescriptions$88():void");
    }

    public void lambda$getThemeDescriptions$89() {
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

    public void lambda$getThemeDescriptions$90() {
        this.speedItem.getIconView().setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarActionModeDefaultIcon), PorterDuff.Mode.SRC_IN));
        this.speedItem.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_actionBarActionModeDefaultSelector)));
    }

    private void updateFloatingButtonColor() {
        if (getParentActivity() == null || this.floatingButtonContainer == null) {
            return;
        }
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_chats_actionBackground), Theme.getColor(Theme.key_chats_actionPressedBackground));
        if (Build.VERSION.SDK_INT < 21) {
            Drawable mutate = ContextCompat.getDrawable(getParentActivity(), R.drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButtonContainer.setBackground(createSimpleSelectorCircleDrawable);
    }

    @Override
    public Animator getCustomSlideTransition(boolean z, boolean z2, float f) {
        if (z2) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
            this.slideBackTransitionAnimator = ofFloat;
            return ofFloat;
        }
        int i = ImageReceiver.DEFAULT_CROSSFADE_DURATION;
        if (getLayoutContainer() != null) {
            i = (int) (Math.max((int) ((200.0f / getLayoutContainer().getMeasuredWidth()) * f), 80) * 1.2f);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.slideFragmentProgress, 1.0f);
        this.slideBackTransitionAnimator = ofFloat2;
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                DialogsActivity.this.lambda$getCustomSlideTransition$91(valueAnimator);
            }
        });
        this.slideBackTransitionAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT);
        this.slideBackTransitionAnimator.setDuration(i);
        this.slideBackTransitionAnimator.start();
        return this.slideBackTransitionAnimator;
    }

    public void lambda$getCustomSlideTransition$91(ValueAnimator valueAnimator) {
        setSlideTransitionProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
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
        if (SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(LiteMode.FLAG_CHAT_SCALE)) {
            return;
        }
        if (z) {
            ViewPage[] viewPageArr = this.viewPages;
            if (viewPageArr != null && viewPageArr[0] != null) {
                viewPageArr[0].setLayerType(2, null);
                this.viewPages[0].setClipChildren(false);
                this.viewPages[0].setClipToPadding(false);
                this.viewPages[0].listView.setClipChildren(false);
            }
            ActionBar actionBar = this.actionBar;
            if (actionBar != null) {
                actionBar.setLayerType(2, null);
            }
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.getListView().setLayerType(2, null);
            }
            View view = this.fragmentView;
            if (view != null) {
                ((ViewGroup) view).setClipChildren(false);
                this.fragmentView.requestLayout();
                return;
            }
            return;
        }
        int i = 0;
        while (true) {
            ViewPage[] viewPageArr2 = this.viewPages;
            if (i >= viewPageArr2.length) {
                break;
            }
            ViewPage viewPage = viewPageArr2[i];
            if (viewPage != null) {
                viewPage.setLayerType(0, null);
                viewPage.setClipChildren(true);
                viewPage.setClipToPadding(true);
                viewPage.listView.setClipChildren(true);
            }
            i++;
        }
        ActionBar actionBar2 = this.actionBar;
        if (actionBar2 != null) {
            actionBar2.setLayerType(0, null);
        }
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null) {
            filterTabsView2.getListView().setLayerType(0, null);
        }
        View view2 = this.fragmentView;
        if (view2 != null) {
            ((ViewGroup) view2).setClipChildren(true);
            this.fragmentView.requestLayout();
        }
    }

    @Override
    public void onSlideProgress(boolean z, float f) {
        if (SharedConfig.getDevicePerformanceClass() > 0 && this.isSlideBackTransition && this.slideBackTransitionAnimator == null) {
            setSlideTransitionProgress(f);
        }
    }

    private void setSlideTransitionProgress(float f) {
        if (SharedConfig.getDevicePerformanceClass() <= 0) {
            return;
        }
        this.slideFragmentLite = SharedConfig.getDevicePerformanceClass() <= 1 || !LiteMode.isEnabled(LiteMode.FLAG_CHAT_SCALE);
        this.slideFragmentProgress = f;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
        if (this.slideFragmentLite) {
            FilterTabsView filterTabsView = this.filterTabsView;
            if (filterTabsView != null) {
                filterTabsView.getListView().setTranslationX((this.isDrawerTransition ? 1 : -1) * AndroidUtilities.dp(40.0f) * (1.0f - this.slideFragmentProgress));
                this.filterTabsView.invalidate();
            }
            RightSlidingDialogContainer rightSlidingDialogContainer = this.rightSlidingDialogContainer;
            if (rightSlidingDialogContainer == null || rightSlidingDialogContainer.getFragmentView() == null || this.rightFragmentTransitionInProgress) {
                return;
            }
            this.rightSlidingDialogContainer.getFragmentView().setTranslationX((this.isDrawerTransition ? 1 : -1) * AndroidUtilities.dp(40.0f) * (1.0f - this.slideFragmentProgress));
            return;
        }
        float f2 = 1.0f - ((1.0f - this.slideFragmentProgress) * 0.05f);
        FilterTabsView filterTabsView2 = this.filterTabsView;
        if (filterTabsView2 != null) {
            filterTabsView2.getListView().setScaleX(f2);
            this.filterTabsView.getListView().setScaleY(f2);
            this.filterTabsView.getListView().setTranslationX((this.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - this.slideFragmentProgress));
            this.filterTabsView.getListView().setPivotX(this.isDrawerTransition ? this.filterTabsView.getMeasuredWidth() : 0.0f);
            this.filterTabsView.getListView().setPivotY(0.0f);
            this.filterTabsView.invalidate();
        }
        RightSlidingDialogContainer rightSlidingDialogContainer2 = this.rightSlidingDialogContainer;
        if (rightSlidingDialogContainer2 == null || rightSlidingDialogContainer2.getFragmentView() == null) {
            return;
        }
        if (!this.rightFragmentTransitionInProgress) {
            this.rightSlidingDialogContainer.getFragmentView().setScaleX(f2);
            this.rightSlidingDialogContainer.getFragmentView().setScaleY(f2);
            this.rightSlidingDialogContainer.getFragmentView().setTranslationX((this.isDrawerTransition ? AndroidUtilities.dp(4.0f) : -AndroidUtilities.dp(4.0f)) * (1.0f - this.slideFragmentProgress));
        }
        this.rightSlidingDialogContainer.getFragmentView().setPivotX(this.isDrawerTransition ? this.rightSlidingDialogContainer.getMeasuredWidth() : 0.0f);
        this.rightSlidingDialogContainer.getFragmentView().setPivotY(0.0f);
    }

    @Override
    public void setProgressToDrawerOpened(float f) {
        if (SharedConfig.getDevicePerformanceClass() <= 0 || this.isSlideBackTransition) {
            return;
        }
        boolean z = f > 0.0f;
        if (this.searchIsShowed) {
            f = 0.0f;
            z = false;
        }
        if (z != this.isDrawerTransition) {
            this.isDrawerTransition = z;
            if (z) {
                setFragmentIsSliding(true);
            } else {
                setFragmentIsSliding(false);
            }
            View view = this.fragmentView;
            if (view != null) {
                view.requestLayout();
            }
        }
        setSlideTransitionProgress(1.0f - f);
    }

    public void setShowSearch(String str, int i) {
        if (!this.searching) {
            this.initialSearchType = i;
            this.actionBar.openSearchField(str, false);
            return;
        }
        if (!this.searchItem.getSearchField().getText().toString().equals(str)) {
            this.searchItem.getSearchField().setText(str);
        }
        int positionForType = this.searchViewPager.getPositionForType(i);
        if (positionForType < 0 || this.searchViewPager.getTabsView().getCurrentTabId() == positionForType) {
            return;
        }
        this.searchViewPager.getTabsView().scrollToTab(positionForType, positionForType);
    }

    public ActionBarMenuItem getSearchItem() {
        return this.searchItem;
    }

    @Override
    public boolean isLightStatusBar() {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (!this.searching && (rightSlidingDialogContainer = this.rightSlidingDialogContainer) != null && rightSlidingDialogContainer.getFragment() != null) {
            return this.rightSlidingDialogContainer.getFragment().isLightStatusBar();
        }
        int color = Theme.getColor((this.searching && this.whiteActionBar) ? Theme.key_windowBackgroundWhite : this.folderId == 0 ? Theme.key_actionBarDefault : Theme.key_actionBarDefaultArchived);
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }

    @Override
    public List<FloatingDebugController.DebugItem> onGetDebugItems() {
        return Arrays.asList(new FloatingDebugController.DebugItem(LocaleController.getString(R.string.DebugDialogsActivity)), new FloatingDebugController.DebugItem(LocaleController.getString(R.string.ClearLocalDatabase), new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$onGetDebugItems$92();
            }
        }), new FloatingDebugController.DebugItem(LocaleController.getString(R.string.DebugClearSendMessageAsPeers), new Runnable() {
            @Override
            public final void run() {
                DialogsActivity.this.lambda$onGetDebugItems$93();
            }
        }));
    }

    public void lambda$onGetDebugItems$92() {
        getMessagesStorage().clearLocalDatabase();
        Toast.makeText(getContext(), LocaleController.getString(R.string.DebugClearLocalDatabaseSuccess), 0).show();
    }

    public void lambda$onGetDebugItems$93() {
        getMessagesController().clearSendAsPeers();
    }

    @Override
    public boolean closeLastFragment() {
        if (this.rightSlidingDialogContainer.hasFragment()) {
            this.rightSlidingDialogContainer.lambda$presentFragment$1();
            this.searchViewPager.updateTabs();
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
}
