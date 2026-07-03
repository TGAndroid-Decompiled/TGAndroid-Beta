package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.app.Dialog;
import android.app.PictureInPictureParams;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.os.StrictMode;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import androidx.appcompat.app.AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0;
import androidx.arch.core.util.Function;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import com.google.common.primitives.Longs;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AutoDeleteMediaTask;
import org.telegram.messenger.BackupAgent;
import org.telegram.messenger.BetaUpdate;
import org.telegram.messenger.BotGuardHelper;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.pip.PipActivityController;
import org.telegram.messenger.pip.activity.IPipActivity;
import org.telegram.messenger.pip.activity.IPipActivityHandler;
import org.telegram.messenger.pip.activity.IPipActivityListener;
import org.telegram.messenger.utils.FrameMetricsOverlayView;
import org.telegram.messenger.utils.WindowVisibilityManager;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.DrawerLayoutContainer;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Cells.LanguageCell;
import org.telegram.ui.ChatRightsEditActivity;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AttachBotIntroTopView;
import org.telegram.ui.Components.BatteryDrawable;
import org.telegram.ui.Components.BlockingUpdateView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FloatingDebug.FloatingDebugController;
import org.telegram.ui.Components.FolderBottomSheet;
import org.telegram.ui.Components.Forum.ForumUtilities;
import org.telegram.ui.Components.GroupCallPip;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.PasscodeViewDialog;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.PipVideoOverlay;
import org.telegram.ui.Components.Premium.LimitReachedBottomSheet;
import org.telegram.ui.Components.Premium.boosts.BoostPagerBottomSheet;
import org.telegram.ui.Components.SearchTagsList;
import org.telegram.ui.Components.ShareTopView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.TermsOfServiceView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.inset.WindowAnimatedInsetsProvider;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.Components.voip.RTMPStreamPipOverlay;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.Gifts.AuctionJoinSheet;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.SelectAnimatedEmojiDialog;
import org.telegram.ui.Stars.ISuperRipple;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.SuperRipple;
import org.telegram.ui.Stories.LiveStoryPipOverlay;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.StoryRecorder;
import org.telegram.ui.WallpapersListActivity;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.WebViewRequestProps;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public class LaunchActivity extends BasePermissionsActivity implements INavigationLayout.INavigationLayoutDelegate, NotificationCenter.NotificationCenterDelegate, DialogsActivity.DialogsActivityDelegate, IPipActivity {
    public static final Pattern PREFIX_T_ME_PATTERN = Pattern.compile("^(?:http(?:s|)://|)([A-z0-9-]+?)\\.t\\.me");
    private static int activeInstanceCount;
    public static LaunchActivity instance;
    public static boolean isActive;
    public static boolean isResumed;
    public static Runnable onResumeStaticCallback;
    private static LaunchActivity staticInstanceForAlerts;
    public static boolean systemBlurEnabled;
    private static Pattern timestampPattern;
    public static Runnable whenResumed;
    public ActionBarLayout actionBarLayout;
    private long alreadyShownFreeDiscSpaceAlertForced;
    private SizeNotifierFrameLayout backgroundTablet;
    private final LiteMode.BatteryReceiver batteryReceiver;
    private BlockingUpdateView blockingUpdateView;
    private Consumer blurListener;
    private BottomSheetTabsOverlay bottomSheetTabsOverlay;
    private boolean checkFreeDiscSpaceShown;
    private ArrayList contactsToSend;
    private Uri contactsToSendUri;
    private int currentConnectionState;
    private ISuperRipple currentRipple;
    private String documentsMimeType;
    private ArrayList documentsOriginalPathsArray;
    private ArrayList documentsPathsArray;
    private ArrayList documentsUrisArray;
    public DrawerLayoutContainer drawerLayoutContainer;
    private HashMap englishLocaleStrings;
    private Uri exportingChatUri;
    View feedbackView;
    private boolean finished;
    private FireworksOverlay fireworksOverlay;
    private boolean firstAppUpdateCheck;
    private FlagSecureReason flagSecureReason;
    public FrameLayout frameLayout;
    private FrameMetricsOverlayView frameMetricsOverlayView;
    private NotificationCenter.ObserversGroup globalObserversGroup;
    private ArrayList importingStickers;
    private ArrayList importingStickersEmoji;
    private String importingStickersSoftware;
    private final int instanceId;
    private boolean isInPictureInPictureMode;
    private boolean isNavigationBarColorFrozen;
    private boolean isStarted;
    private RelativeLayout launchLayout;
    private ActionBarLayout layersActionBarLayout;
    private boolean loadingLocaleDialog;
    private TLRPC.TL_theme loadingTheme;
    private boolean loadingThemeAccent;
    private String loadingThemeFileName;
    private Theme.ThemeInfo loadingThemeInfo;
    private AlertDialog loadingThemeProgressDialog;
    private TLRPC.TL_wallPaper loadingThemeWallpaper;
    private String loadingThemeWallpaperName;
    private Dialog localeDialog;
    private Runnable lockRunnable;
    private AlertDialog memoryLeakErrorAlertDialog;
    private ValueAnimator navBarAnimator;
    private boolean navigateToPremiumBot;
    public Runnable navigateToPremiumGiftCallback;
    private NotificationCenter.ObserversGroup observersGroup;
    private Object onBackAnimationCallback;
    private Object onBackInvokedCallback;
    private ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private Utilities.Callback onPowerSaverCallback;
    private List onUserLeaveHintListeners;
    private List overlayPasscodeViews;
    private PasscodeViewDialog passcodeDialog;
    private Intent passcodeSaveIntent;
    private boolean passcodeSaveIntentIsNew;
    private boolean passcodeSaveIntentIsRestore;
    private ArrayList photoPathsArray;
    private final PipActivityController pipActivityController;
    private final IPipActivityHandler pipActivityHandler;
    private Dialog proxyErrorDialog;
    private int reasonsToHideDecorView;
    private int reasonsToHideMainContent;
    private SparseIntArray requestedPermissions;
    private int requsetPermissionsPointer;
    public ActionBarLayout rightActionBarLayout;
    private View rippleAbove;
    private WindowAnimatedInsetsProvider rootAnimatedInsetsListener;
    private SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialog;
    private CharSequence sendingText;
    private FrameLayout shadowTablet;
    private FrameLayout shadowTabletSide;
    private boolean switchingAccount;
    private HashMap systemLocaleStrings;
    private boolean tabletFullSize;
    private int[] tempLocation;
    private TermsOfServiceView termsOfServiceView;
    private ImageView themeSwitchImageView;
    private ImageView themeSwitchSunView;
    private AlertDialog tlErrorAlertDialog;
    private String videoPath;
    private ActionMode visibleActionMode;
    public final ArrayList visibleDialogs;
    private String voicePath;
    public boolean voipLaunchedInBackground;
    private boolean wasMutedByAdminRaisedHand;
    private Utilities.Callback webviewShareAPIDoneListener;
    public ArrayList sheetFragmentsStack = new ArrayList();
    private final ArrayList mainFragmentsStack = new ArrayList();
    private final ArrayList layerFragmentsStack = new ArrayList();
    private final ArrayList rightFragmentsStack = new ArrayList();

    public static void lambda$setupActionBarLayout$4(View view) {
    }

    @Override
    public boolean needPresentFragment(BaseFragment baseFragment, boolean z, boolean z2, INavigationLayout iNavigationLayout) {
        return INavigationLayout.INavigationLayoutDelegate.CC.$default$needPresentFragment(this, baseFragment, z, z2, iNavigationLayout);
    }

    @Override
    public void onMeasureOverride(int[] iArr) {
        INavigationLayout.INavigationLayoutDelegate.CC.$default$onMeasureOverride(this, iArr);
    }

    public LaunchActivity() {
        PipActivityController pipActivityController = new PipActivityController(this);
        this.pipActivityController = pipActivityController;
        this.pipActivityHandler = pipActivityController.getHandler();
        this.overlayPasscodeViews = new ArrayList();
        this.visibleDialogs = new ArrayList();
        this.isNavigationBarColorFrozen = false;
        this.onUserLeaveHintListeners = new ArrayList();
        this.requestedPermissions = new SparseIntArray();
        this.requsetPermissionsPointer = 5934;
        this.blurListener = new Consumer() {
            public Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }

            @Override
            public void p(Boolean bool) {
                LaunchActivity.systemBlurEnabled = bool.booleanValue();
            }
        };
        this.batteryReceiver = new LiteMode.BatteryReceiver();
        this.firstAppUpdateCheck = true;
        this.instanceId = System.identityHashCode(this);
        this.reasonsToHideMainContent = 0;
        this.reasonsToHideDecorView = 0;
    }

    public Dialog getVisibleDialog() {
        for (int size = this.visibleDialogs.size() - 1; size >= 0; size--) {
            Dialog dialog = (Dialog) this.visibleDialogs.get(size);
            if (dialog.isShowing()) {
                return dialog;
            }
        }
        return null;
    }

    public WindowAnimatedInsetsProvider getRootAnimatedInsetsListener() {
        return this.rootAnimatedInsetsListener;
    }

    @Override
    protected void onCreate(Bundle bundle) throws Throwable {
        ActionBarLayout actionBarLayout;
        Bundle bundle2;
        Intent intent;
        Uri data;
        isActive = true;
        activeInstanceCount++;
        if (BuildVars.DEBUG_VERSION) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(StrictMode.getVmPolicy()).detectLeakedClosableObjects().penaltyLog().build());
        }
        instance = this;
        ApplicationLoader.postInitApplication();
        AndroidUtilities.checkDisplaySize(this, getResources().getConfiguration());
        this.currentAccount = UserConfig.selectedAccount;
        registerReceiver(this.batteryReceiver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (!UserConfig.getInstance(this.currentAccount).isClientActivated() && (intent = getIntent()) != null && intent.getAction() != null) {
            if ("android.intent.action.SEND".equals(intent.getAction()) || "android.intent.action.SEND_MULTIPLE".equals(intent.getAction())) {
                super.onCreate(bundle);
                finish();
                return;
            } else if ("android.intent.action.VIEW".equals(intent.getAction()) && (data = intent.getData()) != null) {
                String lowerCase = data.toString().toLowerCase();
                if (!lowerCase.startsWith("tg:proxy") && !lowerCase.startsWith("tg://proxy") && !lowerCase.startsWith("tg:socks")) {
                    lowerCase.startsWith("tg://socks");
                }
            }
        }
        requestWindowFeature(1);
        setTheme(R.style.Theme_TMessages);
        try {
            setTaskDescription(new ActivityManager.TaskDescription((String) null, (Bitmap) null, Theme.getColor(Theme.key_actionBarDefault) | (-16777216)));
        } catch (Throwable unused) {
        }
        getWindow().setBackgroundDrawableResource(R.drawable.transparent);
        FlagSecureReason flagSecureReason = new FlagSecureReason(getWindow(), new FlagSecureReason.FlagSecureCondition() {
            @Override
            public final boolean run() {
                return LaunchActivity.lambda$onCreate$0();
            }
        });
        this.flagSecureReason = flagSecureReason;
        flagSecureReason.attach();
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 24) {
            AndroidUtilities.isInMultiwindow = isInMultiWindowMode();
        }
        Theme.createCommonChatResources();
        Theme.createDialogsResources(this);
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.appLocked) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
        }
        AndroidUtilities.fillStatusBarHeight(this, false);
        this.actionBarLayout = new ActionBarLayout(this, true);
        FrameLayout frameLayout = new FrameLayout(this) {
            @Override
            protected void dispatchDraw(Canvas canvas) {
                super.dispatchDraw(canvas);
                LaunchActivity.this.drawRippleAbove(canvas, this);
            }

            @Override
            public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
                return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
            }
        };
        this.frameLayout = frameLayout;
        frameLayout.setClipToPadding(false);
        this.frameLayout.setClipChildren(false);
        setContentView(this.frameLayout);
        this.rootAnimatedInsetsListener = new WindowAnimatedInsetsProvider(this.frameLayout);
        this.pipActivityController.addPipListener(new IPipActivityListener() {
            final ActivityVisibilityController activityVisibilityController;

            @Override
            public void onStartEnterToPip() {
                IPipActivityListener.CC.$default$onStartEnterToPip(this);
            }

            {
                this.activityVisibilityController = LaunchActivity.this.createActivityVisibilityController(false);
            }

            @Override
            public void onCompleteEnterToPip() {
                LaunchActivity.this.isInPictureInPictureMode = true;
                this.activityVisibilityController.hide();
                LaunchActivity.this.checkDecorViewVisibility();
            }

            @Override
            public void onStartExitFromPip(boolean z) {
                this.activityVisibilityController.show();
            }

            @Override
            public void onCompleteExitFromPip(boolean z) {
                LaunchActivity.this.isInPictureInPictureMode = false;
                LaunchActivity.this.checkDecorViewVisibility();
            }
        });
        ((ViewGroup) getWindow().getDecorView()).addView(this.pipActivityController.getPipContentView());
        this.pipActivityController.getPipContentView().bringToFront();
        ImageView imageView = new ImageView(this);
        this.themeSwitchImageView = imageView;
        imageView.setVisibility(8);
        AnonymousClass4 anonymousClass4 = new AnonymousClass4(this);
        this.drawerLayoutContainer = anonymousClass4;
        anonymousClass4.setClipChildren(false);
        this.drawerLayoutContainer.setClipToPadding(false);
        this.frameLayout.addView(this.drawerLayoutContainer, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView2 = new ImageView(this) {
            @Override
            protected void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                invalidate();
            }
        };
        this.themeSwitchSunView = imageView2;
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        this.frameLayout.addView(this.themeSwitchSunView, LayoutHelper.createFrame(48, 48.0f));
        this.themeSwitchSunView.setVisibility(8);
        FrameLayout frameLayout2 = this.frameLayout;
        BottomSheetTabsOverlay bottomSheetTabsOverlay = new BottomSheetTabsOverlay(this);
        this.bottomSheetTabsOverlay = bottomSheetTabsOverlay;
        frameLayout2.addView(bottomSheetTabsOverlay);
        FrameLayout frameLayout3 = this.frameLayout;
        FireworksOverlay fireworksOverlay = new FireworksOverlay(this) {
            {
                setVisibility(8);
            }

            @Override
            public void start(boolean z) {
                setVisibility(0);
                super.start(z);
            }

            @Override
            protected void onStop() {
                super.onStop();
                setVisibility(8);
            }
        };
        this.fireworksOverlay = fireworksOverlay;
        frameLayout3.addView(fireworksOverlay);
        setupActionBarLayout();
        this.drawerLayoutContainer.setParentActionBarLayout(this.actionBarLayout);
        this.actionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
        this.actionBarLayout.setFragmentStack(this.mainFragmentsStack);
        this.actionBarLayout.setFragmentStackChangedListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCreate$1();
            }
        });
        this.actionBarLayout.setDelegate(this);
        Theme.loadWallpaper(true);
        checkCurrentAccount();
        updateCurrentConnectionState(this.currentAccount);
        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
        int i = NotificationCenter.closeOtherAppActivities;
        globalInstance.lambda$postNotificationNameOnUIThread$1(i, this);
        this.currentConnectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        NotificationCenter.ObserversGroup observersGroup = this.globalObserversGroup;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.globalObserversGroup = null;
        }
        this.globalObserversGroup = NotificationCenter.getGlobalInstance().createObserversGroup(this).add(NotificationCenter.needShowAlert).add(NotificationCenter.reloadInterface).add(NotificationCenter.suggestedLangpack).add(NotificationCenter.didSetNewTheme).add(NotificationCenter.needSetDayNightTheme).add(NotificationCenter.needCheckSystemBarColors).add(i).add(NotificationCenter.didSetPasscode).add(NotificationCenter.didSetNewWallpapper).add(NotificationCenter.screenStateChanged).add(NotificationCenter.showBulletin).add(NotificationCenter.requestPermissions).add(NotificationCenter.billingConfirmPurchaseError).add(NotificationCenter.tlSchemeParseException).add(NotificationCenter.memoryLeakFoundException);
        Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.onPowerSaver(((Boolean) obj).booleanValue());
            }
        };
        this.onPowerSaverCallback = callback;
        LiteMode.addOnPowerSaverAppliedListener(callback);
        if (this.actionBarLayout.getFragmentStack().isEmpty() && ((actionBarLayout = this.layersActionBarLayout) == null || actionBarLayout.getFragmentStack().isEmpty())) {
            if (!UserConfig.getInstance(this.currentAccount).isClientActivated()) {
                this.actionBarLayout.addFragmentToStack(getClientNotActivatedFragment());
            } else {
                this.actionBarLayout.addFragmentToStack(new MainTabsActivity());
            }
            if (bundle != null) {
                try {
                    String string = bundle.getString("fragment");
                    if (string != null) {
                        bundle2 = bundle.getBundle("args");
                        switch (string) {
                            case "chat":
                                if (bundle2 != null) {
                                    ChatActivity chatActivity = new ChatActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(chatActivity)) {
                                        chatActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "settings":
                                bundle2.putLong("user_id", UserConfig.getInstance(this.currentAccount).clientUserId);
                                ProfileActivity profileActivity = new ProfileActivity(bundle2);
                                this.actionBarLayout.addFragmentToStack(profileActivity);
                                profileActivity.restoreSelfArgs(bundle);
                                break;
                            case "settings2":
                                this.actionBarLayout.addFragmentToStack(new SettingsActivity());
                                break;
                            case "group":
                                if (bundle2 != null) {
                                    GroupCreateFinalActivity groupCreateFinalActivity = new GroupCreateFinalActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(groupCreateFinalActivity)) {
                                        groupCreateFinalActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "channel":
                                if (bundle2 != null) {
                                    ChannelCreateActivity channelCreateActivity = new ChannelCreateActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(channelCreateActivity)) {
                                        channelCreateActivity.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "chat_profile":
                                if (bundle2 != null) {
                                    ProfileActivity profileActivity2 = new ProfileActivity(bundle2);
                                    if (this.actionBarLayout.addFragmentToStack(profileActivity2)) {
                                        profileActivity2.restoreSelfArgs(bundle);
                                        break;
                                    }
                                }
                                break;
                            case "wallpapers":
                                WallpapersListActivity wallpapersListActivity = new WallpapersListActivity(0);
                                this.actionBarLayout.addFragmentToStack(wallpapersListActivity);
                                wallpapersListActivity.restoreSelfArgs(bundle);
                                break;
                        }
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
        checkLayout();
        checkSystemBarColors();
        handleIntent(getIntent(), false, bundle != null, false, null, true, true);
        try {
            String str = Build.DISPLAY;
            String str2 = Build.USER;
            String lowerCase2 = str != null ? str.toLowerCase() : "";
            String lowerCase3 = str2 != null ? lowerCase2.toLowerCase() : "";
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("OS name " + lowerCase2 + " " + lowerCase3);
            }
            if ((lowerCase2.contains("flyme") || lowerCase3.contains("flyme")) && Build.VERSION.SDK_INT <= 24) {
                AndroidUtilities.incorrectDisplaySizeFix = true;
                final View rootView = getWindow().getDecorView().getRootView();
                ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
                ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() {
                    @Override
                    public final void onGlobalLayout() {
                        LaunchActivity.lambda$onCreate$2(rootView);
                    }
                };
                this.onGlobalLayoutListener = onGlobalLayoutListener;
                viewTreeObserver.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        MediaController.getInstance().setBaseActivity(this, true);
        ApplicationLoader.startAppCenter(this);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 23) {
            FingerprintController.checkKeyReady();
        }
        if (i2 >= 28 && ((ActivityManager) getSystemService("activity")).isBackgroundRestricted() && System.currentTimeMillis() - SharedConfig.BackgroundActivityPrefs.getLastCheckedBackgroundActivity() >= 86400000 && SharedConfig.BackgroundActivityPrefs.getDismissedCount() < 3) {
            AlertsCreator.createBackgroundActivityDialog(this).show();
            SharedConfig.BackgroundActivityPrefs.setLastCheckedBackgroundActivity(System.currentTimeMillis());
        }
        if (i2 >= 31) {
            getWindow().getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                    LaunchActivity.this.getWindowManager().addCrossWindowBlurEnabledListener(LaunchActivity.this.blurListener);
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    LaunchActivity.this.getWindowManager().removeCrossWindowBlurEnabledListener(LaunchActivity.this.blurListener);
                }
            });
        }
        Bulletin.addDelegate(this.frameLayout, new Bulletin.Delegate() {
            @Override
            public boolean allowLayoutChanges() {
                return Bulletin.Delegate.CC.$default$allowLayoutChanges(this);
            }

            @Override
            public boolean bottomOffsetAnimated() {
                return Bulletin.Delegate.CC.$default$bottomOffsetAnimated(this);
            }

            @Override
            public boolean clipWithGradient(int i3) {
                return Bulletin.Delegate.CC.$default$clipWithGradient(this, i3);
            }

            @Override
            public int getTopOffset(int i3) {
                return Bulletin.Delegate.CC.$default$getTopOffset(this, i3);
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
            public int getBottomOffset(int i3) {
                return AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(16.0f);
            }
        });
        getWindow().getDecorView().setSystemUiVisibility(1792);
        AndroidUtilities.enableEdgeToEdge(this);
        BackupAgent.requestBackup();
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(false);
        if (i2 >= 34) {
            if (this.onBackAnimationCallback == null) {
                this.onBackAnimationCallback = new OnBackAnimationCallback() {
                    private boolean locked;
                    private boolean predictiveBackStarted;
                    private AnimationNotificationsLocker locker = new AnimationNotificationsLocker();
                    private boolean started = false;
                    private boolean invoked = false;

                    @Override
                    public void onBackInvoked() {
                        this.invoked = true;
                        if (this.locked) {
                            this.locker.unlock();
                            this.locked = false;
                        }
                        if (AndroidUtilities.isTablet()) {
                            LaunchActivity.this.onBackPressed();
                            return;
                        }
                        if (LaunchActivity.this.onBackPressed(true)) {
                            LaunchActivity launchActivity = LaunchActivity.this;
                            ActionBarLayout actionBarLayout2 = launchActivity.actionBarLayout;
                            if (actionBarLayout2 != null) {
                                actionBarLayout2.onBackInvoked();
                            } else {
                                launchActivity.onBackPressed();
                            }
                        }
                    }

                    @Override
                    public void onBackStarted(BackEvent backEvent) {
                        this.started = true;
                        this.invoked = false;
                        this.predictiveBackStarted = false;
                    }

                    private void onBackStartedInternal(BackEvent backEvent) {
                        ActionBarLayout actionBarLayout2;
                        if (AndroidUtilities.isTablet() || !LaunchActivity.this.onBackPressed(false) || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null || !actionBarLayout2.onBackStarted(backEvent.getTouchX(), backEvent.getTouchY()) || this.locked) {
                            return;
                        }
                        this.locker.lock();
                        this.locked = true;
                    }

                    @Override
                    public void onBackProgressed(BackEvent backEvent) {
                        ActionBarLayout actionBarLayout2;
                        if (this.started && this.invoked) {
                            return;
                        }
                        float progress = backEvent.getProgress();
                        if (!this.predictiveBackStarted && progress > 0.015f) {
                            this.predictiveBackStarted = true;
                            onBackStartedInternal(backEvent);
                        }
                        float fMax = Math.max(0.0f, progress - 0.015f) / 0.985f;
                        if (AndroidUtilities.isTablet() || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null) {
                            return;
                        }
                        actionBarLayout2.onBackProgress(fMax);
                    }

                    @Override
                    public void onBackCancelled() {
                        ActionBarLayout actionBarLayout2;
                        this.started = false;
                        this.invoked = false;
                        if (this.locked) {
                            this.locker.unlock();
                            this.locked = false;
                        }
                        if (AndroidUtilities.isTablet() || (actionBarLayout2 = LaunchActivity.this.actionBarLayout) == null) {
                            return;
                        }
                        actionBarLayout2.onBackCancelled();
                    }
                };
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, LaunchActivity$$ExternalSyntheticApiModelOutline3.m(this.onBackAnimationCallback));
        } else if (i2 >= 33) {
            if (this.onBackInvokedCallback == null) {
                this.onBackInvokedCallback = new OnBackInvokedCallback() {
                    @Override
                    public void onBackInvoked() {
                        if (AndroidUtilities.isTablet()) {
                            LaunchActivity.this.onBackPressed();
                            return;
                        }
                        if (LaunchActivity.this.onBackPressed(true)) {
                            LaunchActivity launchActivity = LaunchActivity.this;
                            ActionBarLayout actionBarLayout2 = launchActivity.actionBarLayout;
                            if (actionBarLayout2 != null) {
                                actionBarLayout2.onBackInvoked();
                            } else {
                                launchActivity.onBackPressed();
                            }
                        }
                    }
                };
            }
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0.m(this.onBackInvokedCallback));
        }
        checkFrameMetrics();
    }

    public static boolean lambda$onCreate$0() {
        return SharedConfig.passcodeHash.length() > 0 && !SharedConfig.allowScreenCapture;
    }

    class AnonymousClass4 extends DrawerLayoutContainer {
        private boolean wasPortrait;

        AnonymousClass4(Context context) {
            super(context);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) throws Exception {
            super.onLayout(z, i, i2, i3, i4);
            boolean z2 = i4 - i2 > i3 - i;
            if (z2 != this.wasPortrait) {
                post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onLayout$0();
                    }
                });
                this.wasPortrait = z2;
            }
        }

        public void lambda$onLayout$0() {
            if (LaunchActivity.this.selectAnimatedEmojiDialog != null) {
                LaunchActivity.this.selectAnimatedEmojiDialog.dismiss();
                LaunchActivity.this.selectAnimatedEmojiDialog = null;
            }
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            if (LaunchActivity.this.actionBarLayout.getParent() == this) {
                LaunchActivity.this.actionBarLayout.parentDraw(this, canvas);
            }
            super.dispatchDraw(canvas);
        }
    }

    public void lambda$onCreate$1() {
        checkSystemBarColors(true, false);
        if (getLastFragment() == null || getLastFragment().getLastStoryViewer() == null) {
            return;
        }
        getLastFragment().getLastStoryViewer().updatePlayingMode();
    }

    public static void lambda$onCreate$2(View view) {
        int measuredHeight = view.getMeasuredHeight();
        FileLog.d("height = " + measuredHeight + " displayHeight = " + AndroidUtilities.displaySize.y);
        int i = (measuredHeight - AndroidUtilities.navigationBarHeight) - AndroidUtilities.statusBarHeight;
        if (i <= AndroidUtilities.dp(100.0f) || i >= AndroidUtilities.displaySize.y) {
            return;
        }
        int iDp = AndroidUtilities.dp(100.0f) + i;
        Point point = AndroidUtilities.displaySize;
        if (iDp > point.y) {
            point.y = i;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("fix display size y to " + AndroidUtilities.displaySize.y);
            }
        }
    }

    public void checkFrameMetrics() {
        if (Build.VERSION.SDK_INT >= 24) {
            if (this.frameMetricsOverlayView == null && SharedConfig.frameMetricsEnabled) {
                this.frameMetricsOverlayView = FrameMetricsOverlayView.attachToActivityCorner(this, 8388627, 12, this.frameLayout);
            }
            FrameMetricsOverlayView frameMetricsOverlayView = this.frameMetricsOverlayView;
            if (frameMetricsOverlayView == null || SharedConfig.frameMetricsEnabled) {
                return;
            }
            frameMetricsOverlayView.detach();
            this.frameMetricsOverlayView = null;
        }
    }

    public static void showAttachMenuBot(LaunchActivity launchActivity, int i, TLRPC.TL_attachMenuBot tL_attachMenuBot, String str, boolean z) {
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null) {
            return;
        }
        long j = tL_attachMenuBot.bot_id;
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, tL_attachMenuBot.short_name, null, 1, 0, 0L, false, null, false, str, null, 2, false, false);
        if (launchActivity.getBottomSheetTabs() == null || launchActivity.getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) == null) {
            TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(tL_attachMenuBot.bot_id));
            String restrictionReason = user == null ? null : MessagesController.getInstance(i).getRestrictionReason(user.restriction_reason);
            if (!TextUtils.isEmpty(restrictionReason)) {
                MessagesController.getInstance(i);
                MessagesController.showCantOpenAlert(lastFragment, restrictionReason);
                return;
            }
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(launchActivity, lastFragment.getResourceProvider());
            botWebViewSheet.setNeedsContext(false);
            botWebViewSheet.setDefaultFullsize(z);
            botWebViewSheet.setParentActivity(launchActivity);
            botWebViewSheet.requestWebView(lastFragment, webViewRequestPropsOf);
            botWebViewSheet.show();
        }
    }

    @Override
    public void onThemeProgress(float f) {
        if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().updateThemeColors(f);
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().updateColors();
        }
    }

    private void setupActionBarLayout() {
        DrawerLayoutContainer drawerLayoutContainer;
        ViewGroup view;
        if (this.drawerLayoutContainer.indexOfChild(this.launchLayout) != -1) {
            drawerLayoutContainer = this.drawerLayoutContainer;
            view = this.launchLayout;
        } else {
            drawerLayoutContainer = this.drawerLayoutContainer;
            view = this.actionBarLayout.getView();
        }
        int iIndexOfChild = drawerLayoutContainer.indexOfChild(view);
        if (iIndexOfChild != -1) {
            this.drawerLayoutContainer.removeViewAt(iIndexOfChild);
        }
        if (AndroidUtilities.isTablet()) {
            getWindow().setSoftInputMode(16);
            RelativeLayout relativeLayout = new RelativeLayout(this) {
                private boolean inLayout;

                @Override
                public void requestLayout() {
                    if (this.inLayout) {
                        return;
                    }
                    super.requestLayout();
                }

                @Override
                protected void onMeasure(int i, int i2) {
                    this.inLayout = true;
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size2);
                    if (AndroidUtilities.isInMultiwindow || (AndroidUtilities.isSmallTablet() && getResources().getConfiguration().orientation != 2)) {
                        LaunchActivity.this.tabletFullSize = true;
                        LaunchActivity.this.actionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    } else {
                        LaunchActivity.this.tabletFullSize = false;
                        int iDp = (size / 100) * 35;
                        if (iDp < AndroidUtilities.dp(320.0f)) {
                            iDp = AndroidUtilities.dp(320.0f);
                        }
                        LaunchActivity.this.actionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        LaunchActivity.this.shadowTabletSide.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(1.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        LaunchActivity.this.rightActionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(size - iDp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    LaunchActivity.this.backgroundTablet.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    LaunchActivity.this.shadowTablet.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    LaunchActivity.this.layersActionBarLayout.getView().measure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(500.0f), size - AndroidUtilities.dp(16.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(((size2 - AndroidUtilities.statusBarHeight) - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(16.0f), 1073741824));
                    this.inLayout = false;
                }

                @Override
                protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                    int i5 = i3 - i;
                    if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                        int iDp = (i5 / 100) * 35;
                        if (iDp < AndroidUtilities.dp(320.0f)) {
                            iDp = AndroidUtilities.dp(320.0f);
                        }
                        LaunchActivity.this.shadowTabletSide.layout(iDp, 0, LaunchActivity.this.shadowTabletSide.getMeasuredWidth() + iDp, LaunchActivity.this.shadowTabletSide.getMeasuredHeight());
                        LaunchActivity.this.actionBarLayout.getView().layout(0, 0, LaunchActivity.this.actionBarLayout.getView().getMeasuredWidth(), LaunchActivity.this.actionBarLayout.getView().getMeasuredHeight());
                        LaunchActivity.this.rightActionBarLayout.getView().layout(iDp, 0, LaunchActivity.this.rightActionBarLayout.getView().getMeasuredWidth() + iDp, LaunchActivity.this.rightActionBarLayout.getView().getMeasuredHeight());
                    } else {
                        LaunchActivity.this.actionBarLayout.getView().layout(0, 0, LaunchActivity.this.actionBarLayout.getView().getMeasuredWidth(), LaunchActivity.this.actionBarLayout.getView().getMeasuredHeight());
                    }
                    int measuredWidth = (i5 - LaunchActivity.this.layersActionBarLayout.getView().getMeasuredWidth()) / 2;
                    int iDp2 = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(8.0f);
                    LaunchActivity.this.layersActionBarLayout.getView().layout(measuredWidth, iDp2, LaunchActivity.this.layersActionBarLayout.getView().getMeasuredWidth() + measuredWidth, LaunchActivity.this.layersActionBarLayout.getView().getMeasuredHeight() + iDp2);
                    LaunchActivity.this.backgroundTablet.layout(0, 0, LaunchActivity.this.backgroundTablet.getMeasuredWidth(), LaunchActivity.this.backgroundTablet.getMeasuredHeight());
                    LaunchActivity.this.shadowTablet.layout(0, 0, LaunchActivity.this.shadowTablet.getMeasuredWidth(), LaunchActivity.this.shadowTablet.getMeasuredHeight());
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    if (LaunchActivity.this.layersActionBarLayout != null) {
                        LaunchActivity.this.layersActionBarLayout.parentDraw(this, canvas);
                    }
                    super.dispatchDraw(canvas);
                }

                @Override
                public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
                    return AndroidUtilities.fixedDispatchApplyWindowInsets(windowInsets, this);
                }
            };
            this.launchLayout = relativeLayout;
            if (iIndexOfChild != -1) {
                this.drawerLayoutContainer.addView(relativeLayout, iIndexOfChild, LayoutHelper.createFrame(-1, -1.0f));
            } else {
                this.drawerLayoutContainer.addView(relativeLayout, LayoutHelper.createFrame(-1, -1.0f));
            }
            SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(this) {
                @Override
                protected boolean isActionBarVisible() {
                    return false;
                }
            };
            this.backgroundTablet = sizeNotifierFrameLayout;
            sizeNotifierFrameLayout.setOccupyStatusBar(false);
            this.backgroundTablet.setBackgroundImage(Theme.getCachedWallpaper(), Theme.isWallpaperMotion());
            this.launchLayout.addView(this.backgroundTablet, LayoutHelper.createRelative(-1, -1));
            ViewGroup viewGroup = (ViewGroup) this.actionBarLayout.getView().getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.actionBarLayout.getView());
            }
            this.launchLayout.addView(this.actionBarLayout.getView());
            ActionBarLayout actionBarLayout = new ActionBarLayout(this, false);
            this.rightActionBarLayout = actionBarLayout;
            actionBarLayout.setIsRightLayout();
            this.rightActionBarLayout.setFragmentStack(this.rightFragmentsStack);
            this.rightActionBarLayout.setDelegate(this);
            this.launchLayout.addView(this.rightActionBarLayout.getView());
            FrameLayout frameLayout = new FrameLayout(this);
            this.shadowTabletSide = frameLayout;
            frameLayout.setBackgroundColor(1076449908);
            FrameLayout frameLayout2 = new FrameLayout(this);
            this.shadowTablet = frameLayout2;
            frameLayout2.setVisibility(this.layerFragmentsStack.isEmpty() ? 8 : 0);
            this.shadowTablet.setBackgroundColor(1056964608);
            this.launchLayout.addView(this.shadowTablet);
            this.shadowTablet.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f$0.lambda$setupActionBarLayout$3(view2, motionEvent);
                }
            });
            this.shadowTablet.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LaunchActivity.lambda$setupActionBarLayout$4(view2);
                }
            });
            ActionBarLayout actionBarLayout2 = new ActionBarLayout(this, false);
            this.layersActionBarLayout = actionBarLayout2;
            actionBarLayout2.setIsLayersLayout();
            this.layersActionBarLayout.setRemoveActionBarExtraHeight(true);
            this.layersActionBarLayout.setBackgroundView(this.shadowTablet);
            this.layersActionBarLayout.setUseAlphaAnimations(true);
            this.layersActionBarLayout.setFragmentStack(this.layerFragmentsStack);
            this.layersActionBarLayout.setDelegate(this);
            this.layersActionBarLayout.setDrawerLayoutContainer(this.drawerLayoutContainer);
            ViewGroup view2 = this.layersActionBarLayout.getView();
            view2.setVisibility(this.layerFragmentsStack.isEmpty() ? 8 : 0);
            this.launchLayout.addView(view2);
        } else {
            ViewGroup viewGroup2 = (ViewGroup) this.actionBarLayout.getView().getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.actionBarLayout.getView());
            }
            this.actionBarLayout.setFragmentStack(this.mainFragmentsStack);
            if (iIndexOfChild != -1) {
                this.drawerLayoutContainer.addView(this.actionBarLayout.getView(), iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                this.drawerLayoutContainer.addView(this.actionBarLayout.getView(), new ViewGroup.LayoutParams(-1, -1));
            }
        }
        FloatingDebugController.setActive(this, SharedConfig.isFloatingDebugActive, false);
    }

    public boolean lambda$setupActionBarLayout$3(View view, MotionEvent motionEvent) {
        if (!this.actionBarLayout.getFragmentStack().isEmpty() && motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int[] iArr = new int[2];
            this.layersActionBarLayout.getView().getLocationOnScreen(iArr);
            int i = iArr[0];
            int i2 = iArr[1];
            if (!this.layersActionBarLayout.checkTransitionAnimation() && (x <= i || x >= i + this.layersActionBarLayout.getView().getWidth() || y <= i2 || y >= i2 + this.layersActionBarLayout.getView().getHeight())) {
                if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                        actionBarLayout.removeFragmentFromStack(actionBarLayout.getFragmentStack().get(0));
                    }
                    this.layersActionBarLayout.closeLastFragment(true);
                }
                return true;
            }
        }
        return false;
    }

    public void addOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.add(runnable);
    }

    public void removeOnUserLeaveHintListener(Runnable runnable) {
        this.onUserLeaveHintListeners.remove(runnable);
    }

    private BaseFragment getClientNotActivatedFragment() {
        if (LoginActivity.loadCurrentState(false, this.currentAccount).getInt("currentViewNum", 0) != 0) {
            return new LoginActivity();
        }
        return new IntroActivity();
    }

    public FireworksOverlay getFireworksOverlay() {
        return this.fireworksOverlay;
    }

    public BottomSheetTabsOverlay getBottomSheetTabsOverlay() {
        return this.bottomSheetTabsOverlay;
    }

    private void checkSystemBarColors() {
        checkSystemBarColors(false, true, !this.isNavigationBarColorFrozen);
    }

    private void checkSystemBarColors(boolean z) {
        checkSystemBarColors(z, true, !this.isNavigationBarColorFrozen);
    }

    private void checkSystemBarColors(boolean z, boolean z2) {
        checkSystemBarColors(false, z, z2);
    }

    public void checkSystemBarColors(boolean z, boolean z2, boolean z3) {
        BaseFragment baseFragment;
        boolean zIsLightStatusBar;
        boolean z4 = true;
        if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            ArrayList arrayList = this.mainFragmentsStack;
            baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
        }
        char c = 2;
        if (baseFragment != null && (baseFragment.isRemovingFromStack() || baseFragment.isInPreviewMode())) {
            if (this.mainFragmentsStack.size() > 1) {
                ArrayList arrayList2 = this.mainFragmentsStack;
                baseFragment = (BaseFragment) arrayList2.get(arrayList2.size() - 2);
            } else {
                baseFragment = null;
            }
        }
        if (baseFragment != null) {
            baseFragment.hasForceLightStatusBar();
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (z2) {
                if (baseFragment != null) {
                    zIsLightStatusBar = baseFragment.isLightStatusBar();
                    if (baseFragment.getParentLayout() instanceof ActionBarLayout) {
                        ActionBarLayout actionBarLayout = (ActionBarLayout) baseFragment.getParentLayout();
                        if (actionBarLayout.getSheetFragment(false) != null && actionBarLayout.getSheetFragment(false).getLastSheet() != null) {
                            BaseFragment.AttachedSheet lastSheet = actionBarLayout.getSheetFragment(false).getLastSheet();
                            if (lastSheet.isShown()) {
                                zIsLightStatusBar = lastSheet.isAttachedLightStatusBar();
                            }
                        } else {
                            ArrayList<BaseFragment.AttachedSheet> arrayList3 = baseFragment.sheetsStack;
                            if (arrayList3 != null && !arrayList3.isEmpty()) {
                                ArrayList<BaseFragment.AttachedSheet> arrayList4 = baseFragment.sheetsStack;
                                BaseFragment.AttachedSheet attachedSheet = arrayList4.get(arrayList4.size() - 1);
                                if (attachedSheet.isShown()) {
                                    zIsLightStatusBar = attachedSheet.isAttachedLightStatusBar();
                                }
                            }
                        }
                    }
                } else {
                    zIsLightStatusBar = ColorUtils.calculateLuminance(Theme.getColor(Theme.key_actionBarDefault, null, true)) > 0.699999988079071d;
                }
                AndroidUtilities.setLightStatusBar(this, zIsLightStatusBar);
            }
            if (i >= 26 && z3 && (!z || baseFragment == null || !baseFragment.isInPreviewMode())) {
                int color = (baseFragment == null || !z) ? Theme.getColor(Theme.key_windowBackgroundGray, null, true) : baseFragment.getNavigationBarColor();
                if (!(baseFragment instanceof ChatActivity)) {
                    c = 0;
                } else if (!((ChatActivity) baseFragment).isShouldHaveLightNavigationBarIcons()) {
                    c = 1;
                }
                if (getBottomSheetTabs() != null && getBottomSheetTabs().getHeight(false) > 0) {
                    c = 0;
                }
                if (this.actionBarLayout.getSheetFragment(false) != null) {
                    EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment(false);
                    if (sheetFragment.sheetsStack != null) {
                        for (int i2 = 0; i2 < sheetFragment.sheetsStack.size(); i2++) {
                            BaseFragment.AttachedSheet attachedSheet2 = sheetFragment.sheetsStack.get(i2);
                            if (attachedSheet2.attachedToParent()) {
                                color = attachedSheet2.getNavigationBarColor(color);
                                c = 0;
                            }
                        }
                    }
                }
                Iterator it = BotWebViewSheet.activeSheets.iterator();
                while (it.hasNext()) {
                    color = ((BotWebViewSheet) it.next()).getNavigationBarColor(color);
                    c = 0;
                }
                setNavigationBarColor(color);
                if ((c != 0 || AndroidUtilities.computePerceivedBrightness(color) < 0.721f) && c != 1) {
                    z4 = false;
                }
                AndroidUtilities.setLightNavigationBar(this, z4);
            }
        }
        if (z2) {
            getWindow().setStatusBarColor(0);
        }
    }

    public FrameLayout getMainContainerFrameLayout() {
        return this.frameLayout;
    }

    public static MainTabsActivity lambda$switchToAccount$5(Void r0) {
        return new MainTabsActivity();
    }

    public void switchToAccount(int i, boolean z) {
        switchToAccount(i, z, new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return LaunchActivity.lambda$switchToAccount$5((Void) obj);
            }
        });
    }

    public void switchToAccount(int i, boolean z, GenericProvider genericProvider) {
        if (i == UserConfig.selectedAccount || !UserConfig.isValidAccount(i)) {
            return;
        }
        this.switchingAccount = true;
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        UserConfig.selectedAccount = i;
        UserConfig.getInstance(0).saveConfig(false);
        checkCurrentAccount();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activeAccountChanged, Integer.valueOf(i));
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.removeAllFragments();
            this.rightActionBarLayout.removeAllFragments();
            if (!this.tabletFullSize) {
                this.shadowTabletSide.setVisibility(0);
                if (this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    this.backgroundTablet.setVisibility(0);
                }
                this.rightActionBarLayout.getView().setVisibility(8);
            }
            this.layersActionBarLayout.getView().setVisibility(8);
        }
        if (z) {
            this.actionBarLayout.removeAllFragments();
        } else {
            this.actionBarLayout.removeFragmentFromStack(0);
        }
        this.actionBarLayout.addFragmentToStack((MainTabsActivity) genericProvider.provide(null), -3);
        this.actionBarLayout.rebuildFragments(1);
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.rebuildFragments(1);
            this.rightActionBarLayout.rebuildFragments(1);
        }
        if (!ApplicationLoader.mainInterfacePaused) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        if (UserConfig.getInstance(i).unacceptedTermsOfService != null) {
            showTosActivity(i, UserConfig.getInstance(i).unacceptedTermsOfService);
        }
        updateCurrentConnectionState(this.currentAccount);
        this.switchingAccount = false;
    }

    private void switchToAvailableAccountOrLogout() {
        int i = 0;
        while (true) {
            if (i >= 4) {
                i = -1;
                break;
            } else if (UserConfig.getInstance(i).isClientActivated()) {
                break;
            } else {
                i++;
            }
        }
        TermsOfServiceView termsOfServiceView = this.termsOfServiceView;
        if (termsOfServiceView != null) {
            termsOfServiceView.setVisibility(8);
        }
        if (i != -1) {
            switchToAccount(i, true);
            return;
        }
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
        clearFragments();
        this.actionBarLayout.rebuildLogout();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.rebuildLogout();
            this.rightActionBarLayout.rebuildLogout();
        }
        lambda$runLinkRequest$100(new IntroActivity().setOnLogout());
    }

    public void clearFragments() {
        Iterator it = this.mainFragmentsStack.iterator();
        while (it.hasNext()) {
            ((BaseFragment) it.next()).onFragmentDestroy();
        }
        this.mainFragmentsStack.clear();
        if (AndroidUtilities.isTablet()) {
            Iterator it2 = this.layerFragmentsStack.iterator();
            while (it2.hasNext()) {
                ((BaseFragment) it2.next()).onFragmentDestroy();
            }
            this.layerFragmentsStack.clear();
            Iterator it3 = this.rightFragmentsStack.iterator();
            while (it3.hasNext()) {
                ((BaseFragment) it3.next()).onFragmentDestroy();
            }
            this.rightFragmentsStack.clear();
        }
    }

    public int getMainFragmentsCount() {
        return this.mainFragmentsStack.size();
    }

    private void checkCurrentAccount() {
        if (this.currentAccount != UserConfig.selectedAccount || this.observersGroup == null) {
            NotificationCenter.ObserversGroup observersGroup = this.observersGroup;
            if (observersGroup != null) {
                observersGroup.removeAllObservers();
                this.observersGroup = null;
            }
            int i = UserConfig.selectedAccount;
            this.currentAccount = i;
            this.observersGroup = NotificationCenter.getInstance(i).createObserversGroup(this).add(NotificationCenter.openBoostForUsersDialog).add(NotificationCenter.appDidLogout).add(NotificationCenter.mainUserInfoChanged).add(NotificationCenter.attachMenuBotsDidLoad).add(NotificationCenter.didUpdateConnectionState).add(NotificationCenter.needShowAlert).add(NotificationCenter.wasUnableToFindCurrentLocation).add(NotificationCenter.openArticle).add(NotificationCenter.hasNewContactsToImport).add(NotificationCenter.needShowPlayServicesAlert).add(NotificationCenter.fileLoaded).add(NotificationCenter.fileLoadFailed).add(NotificationCenter.historyImportProgressChanged).add(NotificationCenter.groupCallUpdated).add(NotificationCenter.stickersImportComplete).add(NotificationCenter.currentUserShowLimitReachedDialog).add(NotificationCenter.currentUserPremiumStatusChanged).add(NotificationCenter.chatSwitchedForum).add(NotificationCenter.guardBotDecisionResult);
        }
    }

    private void checkLayout() {
        if (!AndroidUtilities.isTablet() || this.rightActionBarLayout == null) {
            return;
        }
        if (AndroidUtilities.getWasTablet() == null || AndroidUtilities.getWasTablet().booleanValue() == AndroidUtilities.isTabletForce()) {
            if (!AndroidUtilities.isInMultiwindow && (!AndroidUtilities.isSmallTablet() || getResources().getConfiguration().orientation == 2)) {
                this.tabletFullSize = false;
                List<BaseFragment> fragmentStack = this.actionBarLayout.getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    while (1 < fragmentStack.size()) {
                        BaseFragment baseFragment = fragmentStack.get(1);
                        if (baseFragment instanceof ChatActivity) {
                            ((ChatActivity) baseFragment).setIgnoreAttachOnPause(true);
                        }
                        baseFragment.onPause();
                        baseFragment.onFragmentDestroy();
                        baseFragment.setParentLayout(null);
                        fragmentStack.remove(baseFragment);
                        this.rightActionBarLayout.addFragmentToStack(baseFragment);
                    }
                    PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
                    if (passcodeViewDialog == null || passcodeViewDialog.passcodeView.getVisibility() != 0) {
                        this.actionBarLayout.rebuildFragments(1);
                        this.rightActionBarLayout.rebuildFragments(1);
                    }
                }
                this.rightActionBarLayout.getView().setVisibility(this.rightActionBarLayout.getFragmentStack().isEmpty() ? 8 : 0);
                this.backgroundTablet.setVisibility(this.rightActionBarLayout.getFragmentStack().isEmpty() ? 0 : 8);
                this.shadowTabletSide.setVisibility(this.actionBarLayout.getFragmentStack().isEmpty() ? 8 : 0);
                return;
            }
            this.tabletFullSize = true;
            List<BaseFragment> fragmentStack2 = this.rightActionBarLayout.getFragmentStack();
            if (!fragmentStack2.isEmpty()) {
                while (fragmentStack2.size() > 0) {
                    BaseFragment baseFragment2 = fragmentStack2.get(0);
                    if (baseFragment2 instanceof ChatActivity) {
                        ((ChatActivity) baseFragment2).setIgnoreAttachOnPause(true);
                    }
                    baseFragment2.onPause();
                    baseFragment2.onFragmentDestroy();
                    baseFragment2.setParentLayout(null);
                    fragmentStack2.remove(baseFragment2);
                    this.actionBarLayout.addFragmentToStack(baseFragment2);
                }
                PasscodeViewDialog passcodeViewDialog2 = this.passcodeDialog;
                if (passcodeViewDialog2 == null || passcodeViewDialog2.passcodeView.getVisibility() != 0) {
                    this.actionBarLayout.rebuildFragments(1);
                }
            }
            this.shadowTabletSide.setVisibility(8);
            this.rightActionBarLayout.getView().setVisibility(8);
            this.backgroundTablet.setVisibility(this.actionBarLayout.getFragmentStack().isEmpty() ? 0 : 8);
        }
    }

    private void showUpdateActivity(int i, TLRPC.TL_help_appUpdate tL_help_appUpdate, boolean z) {
        if (this.blockingUpdateView == null) {
            BlockingUpdateView blockingUpdateView = new BlockingUpdateView(this);
            this.blockingUpdateView = blockingUpdateView;
            this.drawerLayoutContainer.addView(blockingUpdateView, LayoutHelper.createFrame(-1, -1.0f));
        }
        this.blockingUpdateView.show(i, tL_help_appUpdate, z);
    }

    private void showTosActivity(int i, TLRPC.TL_help_termsOfService tL_help_termsOfService) {
        if (this.termsOfServiceView == null) {
            TermsOfServiceView termsOfServiceView = new TermsOfServiceView(this);
            this.termsOfServiceView = termsOfServiceView;
            termsOfServiceView.setAlpha(0.0f);
            this.drawerLayoutContainer.addView(this.termsOfServiceView, LayoutHelper.createFrame(-1, -1.0f));
            this.termsOfServiceView.setDelegate(new AnonymousClass13());
        }
        TLRPC.TL_help_termsOfService tL_help_termsOfService2 = UserConfig.getInstance(i).unacceptedTermsOfService;
        if (tL_help_termsOfService2 != tL_help_termsOfService && (tL_help_termsOfService2 == null || !tL_help_termsOfService2.id.data.equals(tL_help_termsOfService.id.data))) {
            UserConfig.getInstance(i).unacceptedTermsOfService = tL_help_termsOfService;
            UserConfig.getInstance(i).saveConfig(false);
        }
        this.termsOfServiceView.show(i, tL_help_termsOfService);
        this.termsOfServiceView.animate().alpha(1.0f).setDuration(150L).setInterpolator(AndroidUtilities.decelerateInterpolator).setListener(null).start();
    }

    class AnonymousClass13 implements TermsOfServiceView.TermsOfServiceViewDelegate {
        AnonymousClass13() {
        }

        @Override
        public void onAcceptTerms(int i) {
            UserConfig.getInstance(i).unacceptedTermsOfService = null;
            UserConfig.getInstance(i).saveConfig(false);
            if (!LaunchActivity.this.mainFragmentsStack.isEmpty()) {
                ((BaseFragment) LaunchActivity.this.mainFragmentsStack.get(LaunchActivity.this.mainFragmentsStack.size() - 1)).onResume();
            }
            LaunchActivity.this.termsOfServiceView.animate().alpha(0.0f).setDuration(150L).setInterpolator(AndroidUtilities.accelerateInterpolator).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onAcceptTerms$0();
                }
            }).start();
        }

        public void lambda$onAcceptTerms$0() {
            LaunchActivity.this.termsOfServiceView.setVisibility(8);
        }
    }

    public void showPasscodeActivity(boolean z, boolean z2, int i, int i2, final Runnable runnable, Runnable runnable2) {
        if (this.drawerLayoutContainer == null || isFinishing()) {
            return;
        }
        if (this.passcodeDialog == null) {
            this.passcodeDialog = new PasscodeViewDialog(this);
        }
        SelectAnimatedEmojiDialog.SelectAnimatedEmojiDialogWindow selectAnimatedEmojiDialogWindow = this.selectAnimatedEmojiDialog;
        if (selectAnimatedEmojiDialogWindow != null) {
            selectAnimatedEmojiDialogWindow.dismiss();
            this.selectAnimatedEmojiDialog = null;
        }
        SharedConfig.appLocked = true;
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        StoryRecorder.destroyInstance();
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isRoundVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        }
        this.passcodeDialog.show();
        this.passcodeDialog.passcodeView.onShow(this.overlayPasscodeViews.isEmpty() && z, z2, i, i2, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showPasscodeActivity$6(runnable);
            }
        }, runnable2);
        int i3 = 0;
        while (i3 < this.overlayPasscodeViews.size()) {
            ((PasscodeView) this.overlayPasscodeViews.get(i3)).onShow(z && i3 == this.overlayPasscodeViews.size() - 1, z2, i, i2, null, null);
            i3++;
        }
        SharedConfig.isWaitingForPasscodeEnter = true;
        PasscodeView.PasscodeViewDelegate passcodeViewDelegate = new PasscodeView.PasscodeViewDelegate() {
            @Override
            public final void didAcceptedPassword(PasscodeView passcodeView) throws Throwable {
                this.f$0.lambda$showPasscodeActivity$7(passcodeView);
            }
        };
        this.passcodeDialog.passcodeView.setDelegate(passcodeViewDelegate);
        Iterator it = this.overlayPasscodeViews.iterator();
        while (it.hasNext()) {
            ((PasscodeView) it.next()).setDelegate(passcodeViewDelegate);
        }
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$showPasscodeActivity$6(Runnable runnable) {
        this.actionBarLayout.getView().setVisibility(4);
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.layersActionBarLayout;
            if (actionBarLayout != null && actionBarLayout.getView() != null && this.layersActionBarLayout.getView().getVisibility() == 0) {
                this.layersActionBarLayout.getView().setVisibility(4);
            }
            ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
            if (actionBarLayout2 != null && actionBarLayout2.getView() != null) {
                this.rightActionBarLayout.getView().setVisibility(4);
            }
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$showPasscodeActivity$7(PasscodeView passcodeView) throws Throwable {
        SharedConfig.isWaitingForPasscodeEnter = false;
        Intent intent = this.passcodeSaveIntent;
        if (intent != null) {
            handleIntent(intent, this.passcodeSaveIntentIsNew, this.passcodeSaveIntentIsRestore, true, null, false, true);
            this.passcodeSaveIntent = null;
        }
        this.actionBarLayout.getView().setVisibility(0);
        this.actionBarLayout.rebuildFragments(1);
        this.actionBarLayout.updateTitleOverlay();
        if (AndroidUtilities.isTablet()) {
            this.layersActionBarLayout.rebuildFragments(1);
            this.rightActionBarLayout.rebuildFragments(1);
            if (this.layersActionBarLayout.getView().getVisibility() == 4) {
                this.layersActionBarLayout.getView().setVisibility(0);
            }
            this.rightActionBarLayout.getView().setVisibility(0);
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.passcodeDismissed, passcodeView);
        try {
            NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public boolean allowShowFingerprintDialog(PasscodeView passcodeView) {
        PasscodeViewDialog passcodeViewDialog;
        if (!this.overlayPasscodeViews.isEmpty() || (passcodeViewDialog = this.passcodeDialog) == null) {
            List list = this.overlayPasscodeViews;
            if (list.get(list.size() - 1) == passcodeView) {
                return true;
            }
        } else if (passcodeView == passcodeViewDialog.passcodeView) {
            return true;
        }
        return false;
    }

    private boolean handleIntent(Intent intent, boolean z, boolean z2, boolean z3) {
        return handleIntent(intent, z, z2, z3, null, true, false);
    }

    private boolean handleIntent(android.content.Intent r120, boolean r121, boolean r122, boolean r123, org.telegram.messenger.browser.Browser.Progress r124, boolean r125, boolean r126) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.handleIntent(android.content.Intent, boolean, boolean, boolean, org.telegram.messenger.browser.Browser$Progress, boolean, boolean):boolean");
    }

    public void lambda$handleIntent$8(String str) {
        if (this.actionBarLayout.getFragmentStack().isEmpty()) {
            return;
        }
        this.actionBarLayout.getFragmentStack().get(0).presentFragment(new PremiumPreviewFragment(Uri.parse(str).getQueryParameter("ref")));
    }

    public void lambda$handleIntent$9(Intent intent, boolean z) {
        handleIntent(intent, true, false, false);
    }

    public void lambda$handleIntent$10(Browser.Progress progress, int[] iArr, Long l) {
        if (progress != null) {
            progress.end();
        }
        if (MessagesController.getInstance(this.currentAccount).getUserOrChat(l.longValue()) == null) {
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment == null || !(lastFragment instanceof ChatActivity)) {
                return;
            }
            ((ChatActivity) lastFragment).shakeContent();
            return;
        }
        new GiftSheet(this, iArr[0], l.longValue(), null).show();
    }

    public void lambda$handleIntent$12(final AlertDialog alertDialog, final String str, final Bundle bundle, final TL_account.sendConfirmPhoneCode sendconfirmphonecode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleIntent$11(alertDialog, tL_error, str, bundle, tLObject, sendconfirmphonecode);
            }
        });
    }

    public void lambda$handleIntent$11(AlertDialog alertDialog, TLRPC.TL_error tL_error, String str, Bundle bundle, TLObject tLObject, TL_account.sendConfirmPhoneCode sendconfirmphonecode) {
        alertDialog.dismiss();
        if (tL_error == null) {
            lambda$runLinkRequest$100(new LoginActivity().cancelAccountDeletion(str, bundle, (TLRPC.TL_auth_sentCode) tLObject));
        } else {
            AlertsCreator.processError(this.currentAccount, tL_error, getActionBarLayout().getLastFragment(), sendconfirmphonecode, new Object[0]);
        }
    }

    public void lambda$handleIntent$14(final TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$handleIntent$13(tLObject, tL_messages_requestUrlAuth, str, tL_error);
            }
        });
    }

    public void lambda$handleIntent$13(TLObject tLObject, TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth, String str, TLRPC.TL_error tL_error) {
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (tLObject == null) {
            if (tL_error != null) {
                if ("URL_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    OAuthSheet.getBulletinFactory().createSimpleBulletin(R.raw.error, getString(R.string.BotAuthLoggedInFailTitle), getString(R.string.BotAuthLoggedInFailNoDomain)).show();
                    return;
                } else {
                    OAuthSheet.getBulletinFactory().showForError(tL_error);
                    return;
                }
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_urlAuthResultRequest) {
            OAuthSheet.handle(false, this.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultRequest) tLObject);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultAccepted) {
            OAuthSheet.handle(false, this.currentAccount, tL_messages_requestUrlAuth, (TLRPC.TL_urlAuthResultAccepted) tLObject);
        } else if (tLObject instanceof TLRPC.TL_urlAuthResultDefault) {
            AlertsCreator.showOpenUrlAlert(safeLastFragment, str, false, true);
        }
    }

    public void lambda$handleIntent$15(long j, long j2, ChatActivity chatActivity) {
        FileLog.d("LaunchActivity openForum after load " + j + " " + j2 + " TL_forumTopic " + MessagesController.getInstance(this.currentAccount).getTopicsController().findTopic(j, j2));
        if (this.actionBarLayout != null) {
            ForumUtilities.applyTopic(chatActivity, MessagesStorage.TopicKey.of(-j, j2));
            getActionBarLayout().presentFragment(chatActivity);
        }
    }

    public void lambda$handleIntent$17(final int[] iArr, LocationController.SharingLocationInfo sharingLocationInfo) {
        int i = sharingLocationInfo.messageObject.currentAccount;
        iArr[0] = i;
        switchToAccount(i, true);
        LocationActivity locationActivity = new LocationActivity(2);
        locationActivity.setMessageObject(sharingLocationInfo.messageObject);
        final long dialogId = sharingLocationInfo.messageObject.getDialogId();
        locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
            @Override
            public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j) {
                LaunchActivity.lambda$handleIntent$16(iArr, dialogId, messageMedia, i2, z, i3, j);
            }
        });
        lambda$runLinkRequest$100(locationActivity);
    }

    public static void lambda$handleIntent$16(int[] iArr, long j, TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j2) {
        SendMessagesHelper.getInstance(iArr[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, j, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i2, 0));
    }

    public void lambda$handleIntent$18() {
        if (this.actionBarLayout.getFragmentStack().isEmpty()) {
            return;
        }
        this.actionBarLayout.getFragmentStack().get(0).showDialog(new StickersAlert(this, this.importingStickersSoftware, this.importingStickers, this.importingStickersEmoji, null));
    }

    public void lambda$handleIntent$20(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            final TL_account.Password password = (TL_account.Password) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$handleIntent$19(password);
                }
            });
        }
    }

    public void lambda$handleIntent$21(BaseFragment baseFragment, boolean z) {
        presentFragment(baseFragment, z, false);
    }

    public void lambda$handleIntent$22(boolean z, int[] iArr, TLRPC.User user, String str, ContactsActivity contactsActivity) {
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(user.id);
        VoIPHelper.startCall(user, z, userFull != null && userFull.video_calls_available, this, userFull, AccountInstance.getInstance(iArr[0]));
    }

    public void lambda$handleIntent$26(final ActionIntroActivity actionIntroActivity, String str) {
        final AlertDialog alertDialog = new AlertDialog(this, 3);
        alertDialog.setCanCancel(false);
        alertDialog.show();
        byte[] bArrDecode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = bArrDecode;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_acceptLoginToken, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.lambda$handleIntent$25(alertDialog, actionIntroActivity, tLObject, tL_error);
            }
        });
    }

    public static void lambda$handleIntent$25(final AlertDialog alertDialog, final ActionIntroActivity actionIntroActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$handleIntent$24(alertDialog, tLObject, actionIntroActivity, tL_error);
            }
        });
    }

    public static void lambda$handleIntent$24(AlertDialog alertDialog, TLObject tLObject, final ActionIntroActivity actionIntroActivity, final TLRPC.TL_error tL_error) {
        try {
            alertDialog.dismiss();
        } catch (Exception unused) {
        }
        if (tLObject instanceof TLRPC.TL_authorization) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$handleIntent$23(actionIntroActivity, tL_error);
            }
        });
    }

    public static void lambda$handleIntent$23(ActionIntroActivity actionIntroActivity, TLRPC.TL_error tL_error) {
        AlertsCreator.showSimpleAlert(actionIntroActivity, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
    }

    public void lambda$handleIntent$27(BaseFragment baseFragment, String str, String str2, AlertDialog alertDialog, int i) {
        NewContactBottomSheet newContactBottomSheet = new NewContactBottomSheet(baseFragment, this);
        newContactBottomSheet.setInitialPhoneNumber(str, false);
        if (str2 != null) {
            String[] strArrSplit = str2.split(" ", 2);
            newContactBottomSheet.setInitialName(strArrSplit[0], strArrSplit.length > 1 ? strArrSplit[1] : null);
        }
        newContactBottomSheet.show();
    }

    public void lambda$handleIntent$19(TL_account.Password password) {
        String str;
        final LoginActivity loginActivityChangeEmail = new LoginActivity().changeEmail(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openEmailSettings$28();
            }
        });
        if (password != null && (str = password.login_email_pattern) != null) {
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
            int iIndexOf = password.login_email_pattern.indexOf(42);
            int iLastIndexOf = password.login_email_pattern.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i = iLastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i, 0);
            }
            new AlertDialog.Builder(this).setTitle(spannableStringBuilderValueOf).setMessage(getString(R.string.EmailLoginChangeMessage)).setPositiveButton(getString(R.string.ChangeEmail), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$openEmailSettings$29(loginActivityChangeEmail, alertDialog, i2);
                }
            }).setNegativeButton(getString(R.string.Cancel), null).show();
            return;
        }
        lambda$runLinkRequest$100(loginActivityChangeEmail);
    }

    public void lambda$openEmailSettings$28() {
        Bulletin.LottieLayout lottieLayout = new Bulletin.LottieLayout(this, null);
        lottieLayout.setAnimation(R.raw.email_check_inbox, new String[0]);
        lottieLayout.textView.setText(getString(R.string.YourLoginEmailChangedSuccess));
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment != null) {
            Bulletin.make(lastFragment, lottieLayout, 1500).show();
            try {
                lastFragment.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public void lambda$openEmailSettings$29(LoginActivity loginActivity, AlertDialog alertDialog, int i) {
        lambda$runLinkRequest$100(loginActivity);
    }

    public static int getTimestampFromLink(Uri uri) {
        String queryParameter;
        if (uri.getPathSegments().contains("video")) {
            queryParameter = uri.getQuery();
        } else {
            queryParameter = uri.getQueryParameter("t") != null ? uri.getQueryParameter("t") : null;
        }
        if (TextUtils.isEmpty(queryParameter)) {
            return -1;
        }
        if (timestampPattern == null) {
            timestampPattern = Pattern.compile("^\\??(?:(\\d+)[dD])?(?:(\\d+)h)?(?:(\\d+)[mM])?(?:(\\d+)[sS])?$");
        }
        try {
            Matcher matcher = timestampPattern.matcher(queryParameter);
            if (matcher.matches()) {
                String strGroup = matcher.group(1);
                String strGroup2 = matcher.group(2);
                String strGroup3 = matcher.group(3);
                String strGroup4 = matcher.group(4);
                int i = 0;
                int i2 = TextUtils.isEmpty(strGroup) ? 0 : Integer.parseInt(strGroup);
                int i3 = TextUtils.isEmpty(strGroup2) ? 0 : Integer.parseInt(strGroup2);
                int i4 = TextUtils.isEmpty(strGroup3) ? 0 : Integer.parseInt(strGroup3);
                if (!TextUtils.isEmpty(strGroup4)) {
                    i = Integer.parseInt(strGroup4);
                }
                return i + (i4 * 60) + (i3 * 3600) + (i2 * 86400);
            }
        } catch (Throwable unused) {
        }
        try {
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused2) {
            if (!queryParameter.contains(":")) {
                return -1;
            }
            String[] strArrSplit = queryParameter.split(":");
            try {
                return Integer.parseInt(strArrSplit.length - 1 < 0 ? "0" : strArrSplit[strArrSplit.length - 1]) + (Integer.parseInt(strArrSplit.length - 2 < 0 ? "0" : strArrSplit[strArrSplit.length - 2]) * 60) + (Integer.parseInt(strArrSplit.length - 3 < 0 ? "0" : strArrSplit[strArrSplit.length - 3]) * 3600) + (Integer.parseInt(strArrSplit.length - 4 >= 0 ? strArrSplit[strArrSplit.length - 4] : "0") * 86400);
            } catch (Exception e) {
                FileLog.e(e);
                return -1;
            }
        }
    }

    private void openDialogsToSend(boolean z) throws NumberFormatException {
        ArrayList arrayList;
        Bundle bundle = new Bundle();
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("canSelectTopics", true);
        bundle.putInt("dialogsType", 3);
        bundle.putBoolean("allowSwitchAccount", true);
        ArrayList arrayList2 = this.contactsToSend;
        if (arrayList2 != null) {
            if (arrayList2.size() != 1) {
                bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
                bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            }
        } else {
            bundle.putString("selectAlertString", LocaleController.getString(R.string.SendMessagesToText));
            bundle.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendMessagesToGroupText));
        }
        DialogsActivity dialogsActivity = new DialogsActivity(bundle);
        dialogsActivity.setDelegate(this);
        if (this.videoPath != null || ((arrayList = this.photoPathsArray) != null && !arrayList.isEmpty())) {
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = this.photoPathsArray;
            if (arrayList4 != null && !arrayList4.isEmpty()) {
                arrayList3.addAll(ChatActivity.createEntriesFromMedia(this.photoPathsArray, false, null));
            }
            String str = this.videoPath;
            if (str != null) {
                arrayList3.add(new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L));
            }
            if (!arrayList3.isEmpty()) {
                if (!TextUtils.isEmpty(this.sendingText)) {
                    ((MediaController.PhotoEntry) arrayList3.get(0)).caption = this.sendingText;
                }
                dialogsActivity.setSharedMedia(arrayList3, this.sendingText);
            }
        } else if (!TextUtils.isEmpty(this.sendingText)) {
            String strExtractFirstUrl = ShareTopView.extractFirstUrl(this.sendingText);
            if (strExtractFirstUrl != null) {
                dialogsActivity.setSharedLink(strExtractFirstUrl, this.sendingText);
            } else {
                CharSequence charSequence = this.sendingText;
                dialogsActivity.setSharedText(charSequence, charSequence);
            }
        }
        getActionBarLayout().presentFragment(dialogsActivity, !AndroidUtilities.isTablet() ? this.actionBarLayout.getFragmentStack().size() <= 1 || !(this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity) : this.layersActionBarLayout.getFragmentStack().isEmpty() || !(this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity), !z, true, false);
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(false, false);
        } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(false, true);
        } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        StoryRecorder.destroyInstance();
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.dismiss();
        }
        if (z || !AndroidUtilities.isTablet()) {
            return;
        }
        this.actionBarLayout.rebuildFragments(1);
        this.rightActionBarLayout.rebuildFragments(1);
    }

    private int runCommentRequest(int i, Runnable runnable, Integer num, Integer num2, Long l, Integer num3, TLRPC.Chat chat) {
        return runCommentRequest(i, runnable, num, num2, l, num3, null, chat, null, null, 0, -1);
    }

    private int runCommentRequest(final int i, final Runnable runnable, final Integer num, final Integer num2, final Long l, final Integer num3, final byte[] bArr, final TLRPC.Chat chat, final Runnable runnable2, final String str, final int i2, final int i3) {
        if (chat == null) {
            return 0;
        }
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = num2 != null ? num.intValue() : (int) l.longValue();
        return ConnectionsManager.getInstance(i).sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$runCommentRequest$31(i, chat, l, num2, num, runnable2, str, num3, bArr, i2, i3, tL_messages_getDiscussionMessage, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$runCommentRequest$31(final int i, final TLRPC.Chat chat, final Long l, final Integer num, final Integer num2, final Runnable runnable, final String str, final Integer num3, final byte[] bArr, final int i2, final int i3, final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final Runnable runnable2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException, IOException, NumberFormatException {
                this.f$0.lambda$runCommentRequest$30(tLObject, i, chat, l, num, num2, runnable, str, num3, bArr, i2, i3, tL_messages_getDiscussionMessage, runnable2);
            }
        });
    }

    public void lambda$runCommentRequest$30(org.telegram.tgnet.TLObject r18, int r19, org.telegram.tgnet.TLRPC.Chat r20, java.lang.Long r21, java.lang.Integer r22, java.lang.Integer r23, java.lang.Runnable r24, java.lang.String r25, java.lang.Integer r26, byte[] r27, int r28, int r29, org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r30, java.lang.Runnable r31) throws android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$runCommentRequest$30(org.telegram.tgnet.TLObject, int, org.telegram.tgnet.TLRPC$Chat, java.lang.Long, java.lang.Integer, java.lang.Integer, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, int, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, java.lang.Runnable):void");
    }

    private void openTopicRequest(final int r17, final int r18, final org.telegram.tgnet.TLRPC.Chat r19, final int r20, org.telegram.tgnet.TLRPC.TL_forumTopic r21, final java.lang.Runnable r22, final java.lang.String r23, final java.lang.Integer r24, final byte[] r25, final int r26, final java.util.ArrayList r27, final int r28) throws android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.openTopicRequest(int, int, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.tgnet.TLRPC$TL_forumTopic, java.lang.Runnable, java.lang.String, java.lang.Integer, byte[], int, java.util.ArrayList, int):void");
    }

    public void lambda$openTopicRequest$33(final int i, final TLRPC.Chat chat, final int i2, final int i3, final Runnable runnable, final String str, final Integer num, final byte[] bArr, final int i4, final ArrayList arrayList, final int i5, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws Resources.NotFoundException, IOException, NumberFormatException {
                this.f$0.lambda$openTopicRequest$32(tL_error, tLObject, i, chat, i2, i3, runnable, str, num, bArr, i4, arrayList, i5);
            }
        });
    }

    public void lambda$openTopicRequest$32(TLRPC.TL_error tL_error, TLObject tLObject, int i, TLRPC.Chat chat, int i2, int i3, Runnable runnable, String str, Integer num, byte[] bArr, int i4, ArrayList arrayList, int i5) throws Resources.NotFoundException, IOException, NumberFormatException {
        if (tL_error == null) {
            TLRPC.TL_messages_forumTopics tL_messages_forumTopics = (TLRPC.TL_messages_forumTopics) tLObject;
            LongSparseArray longSparseArray = new LongSparseArray();
            for (int i6 = 0; i6 < tL_messages_forumTopics.messages.size(); i6++) {
                longSparseArray.put(tL_messages_forumTopics.messages.get(i6).id, tL_messages_forumTopics.messages.get(i6));
            }
            MessagesController.getInstance(i).putUsers(tL_messages_forumTopics.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_forumTopics.chats, false);
            MessagesController.getInstance(i).getTopicsController().processTopics(chat.id, tL_messages_forumTopics.topics, longSparseArray, false, 2, -1);
            openTopicRequest(i, i2, chat, i3, MessagesController.getInstance(i).getTopicsController().findTopic(chat.id, i2), runnable, str, num, bArr, i4, arrayList, i5);
        }
    }

    private java.lang.String readImport(android.net.Uri r8) throws java.lang.Throwable {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.readImport(android.net.Uri):java.lang.String");
    }

    private void runImportRequest(final Uri uri, ArrayList arrayList) throws Throwable {
        final int i = UserConfig.selectedAccount;
        final AlertDialog alertDialog = new AlertDialog(this, 3);
        final int[] iArr = {0};
        String str = readImport(uri);
        if (str == null) {
            return;
        }
        TLRPC.TL_messages_checkHistoryImport tL_messages_checkHistoryImport = new TLRPC.TL_messages_checkHistoryImport();
        tL_messages_checkHistoryImport.import_head = str;
        iArr[0] = ConnectionsManager.getInstance(i).sendRequest(tL_messages_checkHistoryImport, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$runImportRequest$35(uri, i, alertDialog, tLObject, tL_error);
            }
        });
        final Runnable runnable = null;
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                LaunchActivity.lambda$runImportRequest$36(i, iArr, runnable, dialogInterface);
            }
        });
        try {
            alertDialog.showDelayed(300L);
        } catch (Exception unused) {
        }
    }

    public void lambda$runImportRequest$35(final Uri uri, final int i, final AlertDialog alertDialog, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() throws NumberFormatException {
                this.f$0.lambda$runImportRequest$34(tLObject, uri, i, alertDialog);
            }
        }, 2L);
    }

    public void lambda$runImportRequest$34(TLObject tLObject, Uri uri, int i, AlertDialog alertDialog) throws NumberFormatException {
        boolean z;
        if (isFinishing()) {
            return;
        }
        if (tLObject != null && this.actionBarLayout != null) {
            TLRPC.TL_messages_historyImportParsed tL_messages_historyImportParsed = (TLRPC.TL_messages_historyImportParsed) tLObject;
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putString("importTitle", tL_messages_historyImportParsed.title);
            bundle.putBoolean("allowSwitchAccount", true);
            if (tL_messages_historyImportParsed.pm) {
                bundle.putInt("dialogsType", 12);
            } else if (tL_messages_historyImportParsed.group) {
                bundle.putInt("dialogsType", 11);
            } else {
                String string = uri.toString();
                Iterator<String> it = MessagesController.getInstance(i).exportPrivateUri.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    } else if (string.contains(it.next())) {
                        bundle.putInt("dialogsType", 12);
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    Iterator<String> it2 = MessagesController.getInstance(i).exportGroupUri.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (string.contains(it2.next())) {
                            bundle.putInt("dialogsType", 11);
                            z = true;
                            break;
                        }
                    }
                    if (!z) {
                        bundle.putInt("dialogsType", 13);
                    }
                }
            }
            if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
                SecretMediaViewer.getInstance().closePhoto(false, false);
            } else if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                PhotoViewer.getInstance().closePhoto(false, true);
            } else if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
                ArticleViewer.getInstance().close(false, true);
            }
            StoryRecorder.destroyInstance();
            GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
            if (groupCallActivity != null) {
                groupCallActivity.dismiss();
            }
            if (AndroidUtilities.isTablet()) {
                this.actionBarLayout.rebuildFragments(1);
                this.rightActionBarLayout.rebuildFragments(1);
            }
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(this);
            getActionBarLayout().presentFragment(dialogsActivity, !AndroidUtilities.isTablet() ? this.actionBarLayout.getFragmentStack().size() <= 1 || !(this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity) : this.layersActionBarLayout.getFragmentStack().isEmpty() || !(this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1) instanceof MainTabsActivity), false, true, false);
        } else {
            if (this.documentsUrisArray == null) {
                this.documentsUrisArray = new ArrayList();
            }
            this.documentsUrisArray.add(0, this.exportingChatUri);
            this.exportingChatUri = null;
            openDialogsToSend(true);
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$runImportRequest$36(int i, int[] iArr, Runnable runnable, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void openMessage(final long j, final int i, final String str, final Browser.Progress progress, int i2, final int i3, final Integer num, final byte[] bArr) {
        BaseFragment baseFragment;
        TLRPC.Chat chat;
        if (j < 0 && (chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j))) != null && ChatObject.isForum(chat)) {
            if (progress != null) {
                progress.init();
            }
            openForumFromLink(j, Integer.valueOf(i), str, num, bArr, new Runnable() {
                @Override
                public final void run() {
                    LaunchActivity.lambda$openMessage$37(progress);
                }
            }, i2, i3);
            return;
        }
        if (progress != null) {
            progress.init();
        }
        final Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            long j2 = -j;
            TLRPC.Chat chat2 = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(j2));
            if (chat2 != null && chat2.forum) {
                openForumFromLink(j, Integer.valueOf(i), str, num, bArr, new Runnable() {
                    @Override
                    public final void run() {
                        LaunchActivity.lambda$openMessage$38(progress);
                    }
                }, i2, i3);
                return;
            }
            bundle.putLong("chat_id", j2);
        }
        bundle.putInt("message_id", i);
        if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1);
        }
        final BaseFragment baseFragment2 = baseFragment;
        if (baseFragment2 == null || MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, baseFragment2)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openMessage$42(bundle, bArr, i, num, str, i3, j, progress, baseFragment2);
                }
            });
        }
    }

    public static void lambda$openMessage$37(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
        }
    }

    public static void lambda$openMessage$38(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
        }
    }

    public void lambda$openMessage$42(final android.os.Bundle r17, final byte[] r18, final int r19, final java.lang.Integer r20, final java.lang.String r21, final int r22, final long r23, final org.telegram.messenger.browser.Browser.Progress r25, final org.telegram.ui.ActionBar.BaseFragment r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$openMessage$42(android.os.Bundle, byte[], int, java.lang.Integer, java.lang.String, int, long, org.telegram.messenger.browser.Browser$Progress, org.telegram.ui.ActionBar.BaseFragment):void");
    }

    public void lambda$openMessage$40(final Browser.Progress progress, final long j, final int i, final Integer num, final byte[] bArr, final BaseFragment baseFragment, final Bundle bundle, final ChatActivity chatActivity, final String str, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openMessage$39(progress, tLObject, j, i, num, bArr, baseFragment, bundle, chatActivity, str, i2);
            }
        });
    }

    public void lambda$openMessage$39(Browser.Progress progress, TLObject tLObject, long j, int i, Integer num, byte[] bArr, BaseFragment baseFragment, Bundle bundle, ChatActivity chatActivity, String str, int i2) {
        if (progress != null) {
            progress.end();
        }
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chats.chats, false);
                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                if (chat != null && chat.forum) {
                    openForumFromLink(-j, Integer.valueOf(i), null, num, bArr, null, 0, -1);
                }
                if (baseFragment == null || MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, baseFragment)) {
                    ChatActivity chatActivity2 = new ChatActivity(bundle);
                    chatActivity.setHighlightQuote(i, str, i2);
                    getActionBarLayout().presentFragment(chatActivity2);
                    return;
                }
                return;
            }
        }
        showAlertDialog(AlertsCreator.createNoAccessAlert(this, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    public void lambda$openMessage$41(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    private void runLinkRequest(final int r64, final java.lang.String r65, final java.lang.String r66, final java.lang.String r67, final java.lang.String r68, final java.lang.String r69, final java.lang.String r70, final java.lang.String r71, final java.lang.String r72, final java.lang.String r73, final java.lang.String r74, final java.lang.String r75, final java.lang.String r76, final boolean r77, final java.lang.Integer r78, final java.lang.Long r79, final java.lang.Long r80, final java.lang.Integer r81, final java.lang.String r82, final java.util.HashMap r83, final java.lang.String r84, final java.lang.String r85, final java.lang.String r86, final java.lang.String r87, final org.telegram.tgnet.TLRPC.TL_wallPaper r88, final java.lang.String r89, final java.lang.String r90, final java.lang.String r91, final java.lang.String r92, final boolean r93, final java.lang.String r94, final int r95, final int r96, final java.lang.String r97, final java.lang.String r98, final java.lang.String r99, final java.lang.String r100, final java.lang.String r101, final org.telegram.messenger.browser.Browser.Progress r102, final boolean r103, final int r104, final boolean r105, final int r106, final int r107, final java.lang.String r108, final java.lang.String r109, final boolean r110, final java.lang.String r111, final boolean r112, final boolean r113, final boolean r114, final boolean r115, final boolean r116, final java.lang.String r117, final java.lang.Integer r118, final boolean r119, final byte[] r120) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.runLinkRequest(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.String, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.messenger.browser.Browser$Progress, boolean, int, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[]):void");
    }

    public void lambda$runLinkRequest$45(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i3, boolean z4, int i4, int i5, String str28, String str29, boolean z5, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str31, Integer num3, boolean z11, byte[] bArr, int i6) {
        if (i6 != i) {
            switchToAccount(i6, true);
        }
        runLinkRequest(i6, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, 1, i2, str23, str24, str25, str26, str27, progress, z3, i3, z4, i4, i5, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
    }

    public static void lambda$runLinkRequest$46(Browser.Progress progress, AlertDialog alertDialog) {
        if (progress != null) {
            progress.end();
        }
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
    }

    public void lambda$runLinkRequest$48(final int i, final String str, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$47(tLObject, i, str, tL_error, runnable);
            }
        });
    }

    public void lambda$runLinkRequest$47(TLObject tLObject, int i, String str, TLRPC.TL_error tL_error, Runnable runnable) {
        if (tLObject instanceof TLRPC.User) {
            TLRPC.User user = (TLRPC.User) tLObject;
            MessagesController.getInstance(i).putUser(user, false);
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.id);
            lambda$runLinkRequest$100(new ChatActivity(bundle));
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("cant import contact token. token=");
            sb.append(str);
            sb.append(" err=");
            sb.append(tL_error == null ? null : tL_error.text);
            FileLog.e(sb.toString());
            BulletinFactory.of((BaseFragment) this.mainFragmentsStack.get(r2.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.NoUsernameFound)).show();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$50(final int i, final String str, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$49(tLObject, i, str, runnable);
            }
        });
    }

    public void lambda$runLinkRequest$49(TLObject tLObject, int i, String str, Runnable runnable) {
        ArrayList<TLRPC.Chat> arrayList;
        ArrayList<TLRPC.User> arrayList2;
        BaseFragment baseFragment = (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1);
        if (tLObject instanceof TL_chatlists.chatlist_ChatlistInvite) {
            TL_chatlists.chatlist_ChatlistInvite chatlist_chatlistinvite = (TL_chatlists.chatlist_ChatlistInvite) tLObject;
            boolean z = chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInvite;
            if (z) {
                TL_chatlists.TL_chatlists_chatlistInvite tL_chatlists_chatlistInvite = (TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite;
                arrayList = tL_chatlists_chatlistInvite.chats;
                arrayList2 = tL_chatlists_chatlistInvite.users;
            } else if (chatlist_chatlistinvite instanceof TL_chatlists.TL_chatlists_chatlistInviteAlready) {
                TL_chatlists.TL_chatlists_chatlistInviteAlready tL_chatlists_chatlistInviteAlready = (TL_chatlists.TL_chatlists_chatlistInviteAlready) chatlist_chatlistinvite;
                arrayList = tL_chatlists_chatlistInviteAlready.chats;
                arrayList2 = tL_chatlists_chatlistInviteAlready.users;
            } else {
                arrayList = null;
                arrayList2 = null;
            }
            MessagesController.getInstance(i).putChats(arrayList, false);
            MessagesController.getInstance(i).putUsers(arrayList2, false);
            if (!z || !((TL_chatlists.TL_chatlists_chatlistInvite) chatlist_chatlistinvite).peers.isEmpty()) {
                FolderBottomSheet folderBottomSheet = new FolderBottomSheet(baseFragment, str, chatlist_chatlistinvite);
                if (baseFragment != null) {
                    baseFragment.showDialog(folderBottomSheet);
                } else {
                    folderBottomSheet.show();
                }
            } else {
                BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoFolderFound)).show();
            }
        } else {
            BulletinFactory.of(baseFragment).createErrorBulletin(LocaleController.getString(R.string.NoFolderFound)).show();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$51(Runnable runnable, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        GiftAuctionController.Auction auction;
        if (tL_error != null) {
            BulletinFactory.of((BaseFragment) this.mainFragmentsStack.get(r9.size() - 1)).createSimpleBulletin(R.raw.error, getString(R.string.GiftAuctionNotFound)).show();
        } else if (tL_StarGiftAuctionState != null && (auction = GiftAuctionController.getInstance(this.currentAccount).getAuction(tL_StarGiftAuctionState.gift.id)) != null) {
            new StarGiftPreviewSheet(this, null, this.currentAccount, auction.gift.title, auction.previewAttributes, false).show();
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$52(Runnable runnable, TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            BulletinFactory.of((BaseFragment) this.mainFragmentsStack.get(r10.size() - 1)).createSimpleBulletin(R.raw.error, getString(R.string.GiftAuctionNotFound)).show();
        } else if (tL_StarGiftAuctionState != null) {
            AuctionJoinSheet.show(this, (Theme.ResourcesProvider) null, this.currentAccount, 0L, tL_StarGiftAuctionState.gift.id, (Runnable) null);
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$54(final int i, final String str, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$53(tL_error, tLObject, i, str, runnable);
            }
        });
    }

    public void lambda$runLinkRequest$53(TLRPC.TL_error tL_error, TLObject tLObject, int i, String str, Runnable runnable) {
        if (tL_error != null) {
            BaseFragment safeLastFragment = getSafeLastFragment();
            if (safeLastFragment == null) {
                return;
            }
            if ("STARGIFT_ALREADY_BURNED".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.fire_on, getString(R.string.UniqueGiftNotFoundBurned)).show();
            } else {
                BulletinFactory.of(safeLastFragment).createSimpleBulletin(R.raw.error, getString(R.string.UniqueGiftNotFound)).show();
            }
        } else if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            BaseFragment safeLastFragment2 = getSafeLastFragment();
            TL_stars.StarGift starGift = tL_payments_uniqueStarGift.gift;
            if (starGift instanceof TL_stars.TL_starGiftUnique) {
                StarGiftSheet starGiftSheet = new StarGiftSheet(this, i, 0L, null).set(str, (TL_stars.TL_starGiftUnique) starGift, null);
                if (safeLastFragment2 != null) {
                    if (safeLastFragment2.getLastStoryViewer() != null && safeLastFragment2.getLastStoryViewer().isFullyVisible()) {
                        safeLastFragment2.getLastStoryViewer().showDialog(starGiftSheet);
                    } else {
                        safeLastFragment2.showDialog(starGiftSheet);
                    }
                } else {
                    starGiftSheet.show();
                }
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$59(final TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final Runnable runnable, final int i, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$58(tL_error, tLObject, tL_inputInvoiceSlug, runnable, i, str);
            }
        });
    }

    public void lambda$runLinkRequest$58(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug, final Runnable runnable, int i, String str) {
        PaymentFormActivity paymentFormActivity;
        if (tL_error != null) {
            if ("SUBSCRIPTION_ALREADY_ACTIVE".equalsIgnoreCase(tL_error.text)) {
                BulletinFactory.of((BaseFragment) this.mainFragmentsStack.get(r7.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceSubscriptionLinkAlreadyPaid)).show();
            } else {
                BulletinFactory.of((BaseFragment) this.mainFragmentsStack.get(r7.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.PaymentInvoiceLinkInvalid)).show();
            }
        } else if (!isFinishing()) {
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                final Runnable runnable2 = this.navigateToPremiumGiftCallback;
                this.navigateToPremiumGiftCallback = null;
                StarsController.getInstance(this.currentAccount).openPaymentForm(null, tL_inputInvoiceSlug, (TLRPC.TL_payments_paymentFormStars) tLObject, new Runnable() {
                    @Override
                    public final void run() {
                        LaunchActivity.lambda$runLinkRequest$55(runnable);
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        LaunchActivity.lambda$runLinkRequest$56(runnable2, (String) obj);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(i).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, getActionBarLayout().getLastFragment());
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                final Runnable runnable3 = this.navigateToPremiumGiftCallback;
                if (runnable3 != null) {
                    this.navigateToPremiumGiftCallback = null;
                    paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                        @Override
                        public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                            LaunchActivity.lambda$runLinkRequest$57(runnable3, invoiceStatus);
                        }
                    });
                }
                lambda$runLinkRequest$100(paymentFormActivity);
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$runLinkRequest$55(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$runLinkRequest$56(Runnable runnable, String str) {
        if (runnable == null || !"paid".equals(str)) {
            return;
        }
        runnable.run();
    }

    public static void lambda$runLinkRequest$57(Runnable runnable, PaymentFormActivity.InvoiceStatus invoiceStatus) {
        if (invoiceStatus == PaymentFormActivity.InvoiceStatus.PAID) {
            runnable.run();
        }
    }

    public void lambda$runLinkRequest$81(final java.lang.Runnable r68, final boolean r69, final int r70, final int r71, final java.lang.String r72, final java.lang.String r73, final boolean r74, final java.lang.String r75, final java.lang.String r76, final int r77, final java.lang.String r78, final java.lang.String r79, final java.lang.String r80, final java.lang.String r81, final java.lang.String r82, final java.lang.String r83, final java.lang.String r84, final java.lang.String r85, final java.lang.String r86, final java.lang.String r87, final java.lang.String r88, final java.lang.String r89, final boolean r90, final java.lang.Integer r91, final java.lang.Long r92, final java.lang.Long r93, final java.lang.Integer r94, final java.util.HashMap r95, final java.lang.String r96, final java.lang.String r97, final java.lang.String r98, final java.lang.String r99, final org.telegram.tgnet.TLRPC.TL_wallPaper r100, final java.lang.String r101, final java.lang.String r102, final java.lang.String r103, final int r104, final int r105, final java.lang.String r106, final java.lang.String r107, final java.lang.String r108, final org.telegram.messenger.browser.Browser.Progress r109, final boolean r110, final int r111, final java.lang.String r112, final java.lang.String r113, final boolean r114, final java.lang.String r115, final boolean r116, final boolean r117, final boolean r118, final boolean r119, final boolean r120, final java.lang.String r121, final java.lang.Integer r122, final boolean r123, final byte[] r124, final java.lang.String r125, int[] r126, final java.lang.Long r127) throws java.lang.NumberFormatException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$runLinkRequest$81(java.lang.Runnable, boolean, int, int, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, java.util.HashMap, java.lang.String, java.lang.String, java.lang.String, java.lang.String, org.telegram.tgnet.TLRPC$TL_wallPaper, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, org.telegram.messenger.browser.Browser$Progress, boolean, int, java.lang.String, java.lang.String, boolean, java.lang.String, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.Integer, boolean, byte[], java.lang.String, int[], java.lang.Long):void");
    }

    public void lambda$runLinkRequest$60(Runnable runnable, Long l, TL_stories.StoryItem storyItem) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        BaseFragment lastFragment = getLastFragment();
        if (storyItem == null) {
            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
            if (bulletinFactoryGlobal != null) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            BulletinFactory bulletinFactoryGlobal2 = BulletinFactory.global();
            if (bulletinFactoryGlobal2 != null) {
                bulletinFactoryGlobal2.createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (lastFragment != null) {
            storyItem.dialogId = l.longValue();
            StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
            storyViewerCreateOverlayStoryViewer.instantClose();
            storyViewerCreateOverlayStoryViewer.open(this, storyItem, (StoryViewer.PlaceProvider) null);
        }
    }

    public void lambda$runLinkRequest$61(Runnable runnable, Long l, TL_stories.StoryItem storyItem) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        BaseFragment lastFragment = getLastFragment();
        if (storyItem == null) {
            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
            if (bulletinFactoryGlobal != null) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (storyItem instanceof TL_stories.TL_storyItemDeleted) {
            BulletinFactory bulletinFactoryGlobal2 = BulletinFactory.global();
            if (bulletinFactoryGlobal2 != null) {
                bulletinFactoryGlobal2.createSimpleBulletin(R.raw.story_bomb1, LocaleController.getString(R.string.StoryNotFound)).show();
                return;
            }
            return;
        }
        if (lastFragment != null) {
            storyItem.dialogId = l.longValue();
            StoryViewer storyViewerCreateOverlayStoryViewer = lastFragment.createOverlayStoryViewer();
            storyViewerCreateOverlayStoryViewer.instantClose();
            storyViewerCreateOverlayStoryViewer.open(this, storyItem, (StoryViewer.PlaceProvider) null);
        }
    }

    public void lambda$runLinkRequest$62(Runnable runnable, Long l, int i, TL_stories.TL_storyAlbum tL_storyAlbum) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        getLastFragment();
        if (tL_storyAlbum == null) {
            BulletinFactory bulletinFactoryGlobal = BulletinFactory.global();
            if (bulletinFactoryGlobal != null) {
                bulletinFactoryGlobal.createSimpleBulletin(R.raw.story_bomb2, LocaleController.getString(R.string.StoryAlbumNotFound)).show();
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        if (l.longValue() > 0) {
            bundle.putLong("user_id", l.longValue());
            bundle.putBoolean("my_profile", l.longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        bundle.putInt("open_story_album_id", i);
        lambda$runLinkRequest$100(new ProfileActivity(bundle));
    }

    public void lambda$runLinkRequest$71(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str26, final String str27, final boolean z5, final String str28, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str29, final Integer num3, final boolean z11, final byte[] bArr, final Long l3, final String str30, final String str31, final TLRPC.User user, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$70(tL_error, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, progress, z3, i4, z4, i5, i6, str26, str27, z5, str28, z6, z7, z8, z9, z10, str29, num3, z11, bArr, tLObject, l3, str30, str31, user, runnable);
            }
        });
    }

    public void lambda$runLinkRequest$63(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, Browser.Progress progress, boolean z3, int i4, boolean z4, int i5, int i6, String str26, String str27, boolean z5, String str28, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str29, Integer num3, boolean z11, byte[] bArr) {
        runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, null, null, progress, z3, i4, z4, i5, i6, str26, str27, z5, str28, z6, z7, z8, z9, z10, str29, num3, z11, bArr);
    }

    public void lambda$runLinkRequest$70(TLRPC.TL_error tL_error, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str26, final String str27, final boolean z5, final String str28, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str29, final Integer num3, final boolean z11, final byte[] bArr, TLObject tLObject, final Long l3, final String str30, final String str31, final TLRPC.User user, final Runnable runnable) {
        LaunchActivity launchActivity;
        ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14 chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14;
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$runLinkRequest$63(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, progress, z3, i4, z4, i5, i6, str26, str27, z5, str28, z6, z7, z8, z9, z10, str29, num3, z11, bArr);
                }
            });
            return;
        }
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            final TLRPC.TL_attachMenuBot tL_attachMenuBot = ((TLRPC.TL_attachMenuBotsBot) tLObject).bot;
            final boolean z12 = tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu);
            if ((tL_attachMenuBot.inactive || tL_attachMenuBot.side_menu_disclaimer_needed) && z12) {
                com.google.android.exoplayer2.util.Consumer consumer = new com.google.android.exoplayer2.util.Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.lambda$runLinkRequest$66(tL_attachMenuBot, i, l3, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, i5, i6, z5, str28, user, runnable, z12, z6, z7, z8, z9, z10, str29, z11, (Boolean) obj);
                    }
                };
                if (progress != null) {
                    chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14 = new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14(progress);
                    launchActivity = this;
                } else {
                    launchActivity = this;
                    chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14 = null;
                }
                WebAppDisclaimerAlert.show(launchActivity, consumer, null, chatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14);
                return;
            }
            if (tL_attachMenuBot.request_write_access || z3) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                AlertsCreator.createBotLaunchAlert(getLastFragment(), atomicBoolean, user, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$runLinkRequest$69(l3, tL_attachMenuBot, atomicBoolean, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, i5, i6, z5, str28, user, runnable, z6, z7, z8, z9, z10, str29, z11);
                    }
                });
            } else {
                processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str30, str31, progress, z3, i4, false, i5, i6, z5, str28, user, runnable, false, false, z6, z7, z8, z9, z10, str29, z11);
            }
        }
    }

    public void lambda$runLinkRequest$66(TLRPC.TL_attachMenuBot tL_attachMenuBot, final int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l2, Long l3, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, int i5, int i6, boolean z4, String str28, TLRPC.User user, Runnable runnable, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str29, boolean z11, Boolean bool) {
        tL_attachMenuBot.inactive = false;
        tL_attachMenuBot.request_write_access = false;
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(l.longValue());
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.lambda$runLinkRequest$65(i, tLObject, tL_error);
            }
        }, 66);
        processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l2, l3, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, false, i5, i6, z4, str28, user, runnable, z5, true, z6, z7, z8, z9, z10, str29, z11);
    }

    public static void lambda$runLinkRequest$65(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$runLinkRequest$64(tLObject, i);
            }
        });
    }

    public static void lambda$runLinkRequest$64(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, null);
        }
    }

    public void lambda$runLinkRequest$69(Long l, TLRPC.TL_attachMenuBot tL_attachMenuBot, AtomicBoolean atomicBoolean, final int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l2, Long l3, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, int i5, int i6, boolean z4, String str28, TLRPC.User user, Runnable runnable, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str29, boolean z10) {
        SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, l.longValue(), true);
        tL_attachMenuBot.inactive = false;
        tL_attachMenuBot.request_write_access = true ^ atomicBoolean.get();
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(l.longValue());
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LaunchActivity.lambda$runLinkRequest$68(i, tLObject, tL_error);
            }
        }, 66);
        processWebAppBot(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l2, l3, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, false, i5, i6, z4, str28, user, runnable, false, false, z5, z6, z7, z8, z9, str29, z10);
    }

    public static void lambda$runLinkRequest$68(final int i, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$runLinkRequest$67(tLObject, i);
            }
        });
    }

    public static void lambda$runLinkRequest$67(TLObject tLObject, int i) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, null);
        }
    }

    public boolean lambda$runLinkRequest$72(String str, int i, TLRPC.User user, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        TLRPC.TL_inputMediaGame tL_inputMediaGame = new TLRPC.TL_inputMediaGame();
        TLRPC.TL_inputGameShortName tL_inputGameShortName = new TLRPC.TL_inputGameShortName();
        tL_inputMediaGame.id = tL_inputGameShortName;
        tL_inputGameShortName.short_name = str;
        tL_inputGameShortName.bot_id = MessagesController.getInstance(i).getInputUser(user);
        SendMessagesHelper.getInstance(i).sendGame(MessagesController.getInstance(i).getInputPeer(j), tL_inputMediaGame, 0L, 0L);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public boolean lambda$runLinkRequest$77(final int i, final TLRPC.User user, final String str, final String str2, final DialogsActivity dialogsActivity, DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        final long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        final TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j));
        if (chat != null && (chat.creator || ((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.add_admins))) {
            MessagesController.getInstance(i).checkIsInChat(false, chat, user, new MessagesController.IsInChatCheckedCallback() {
                @Override
                public final void run(boolean z3, TLRPC.TL_chatAdminRights tL_chatAdminRights2, String str3) {
                    this.f$0.lambda$runLinkRequest$75(str, str2, i, chat, dialogsActivity, user, j, z3, tL_chatAdminRights2, str3);
                }
            });
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            int i4 = R.string.AddBot;
            builder.setTitle(LocaleController.getString(i4));
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("AddMembersAlertNamesText", R.string.AddMembersAlertNamesText, UserObject.getUserName(user), chat == null ? "" : chat.title)));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            builder.setPositiveButton(LocaleController.getString(i4), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    this.f$0.lambda$runLinkRequest$76(j, i, user, str2, alertDialog, i5);
                }
            });
            builder.show();
        }
        return true;
    }

    public void lambda$runLinkRequest$75(final String str, final String str2, final int i, final TLRPC.Chat chat, final DialogsActivity dialogsActivity, final TLRPC.User user, final long j, final boolean z, final TLRPC.TL_chatAdminRights tL_chatAdminRights, final String str3) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$74(str, tL_chatAdminRights, z, str2, i, chat, dialogsActivity, user, j, str3);
            }
        });
    }

    public void lambda$runLinkRequest$74(String str, TLRPC.TL_chatAdminRights tL_chatAdminRights, boolean z, String str2, final int i, final TLRPC.Chat chat, final DialogsActivity dialogsActivity, TLRPC.User user, long j, String str3) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights2;
        TLRPC.TL_chatAdminRights tL_chatAdminRights3;
        if (str != null) {
            String[] strArrSplit = str.split("\\+| ");
            tL_chatAdminRights2 = new TLRPC.TL_chatAdminRights();
            for (String str4 : strArrSplit) {
                str4.hashCode();
                switch (str4) {
                    case "ban_users":
                    case "restrict_members":
                        tL_chatAdminRights2.ban_users = true;
                        break;
                    case "anonymous":
                        tL_chatAdminRights2.anonymous = true;
                        break;
                    case "change_info":
                        tL_chatAdminRights2.change_info = true;
                        break;
                    case "delete_messages":
                        tL_chatAdminRights2.delete_messages = true;
                        break;
                    case "edit_messages":
                        tL_chatAdminRights2.edit_messages = true;
                        break;
                    case "manage_call":
                    case "manage_video_chats":
                        tL_chatAdminRights2.manage_call = true;
                        break;
                    case "manage_chat":
                    case "other":
                        tL_chatAdminRights2.other = true;
                        break;
                    case "manage_topics":
                    case "manage_topic":
                        tL_chatAdminRights2.manage_topics = true;
                        break;
                    case "promote_members":
                    case "add_admins":
                        tL_chatAdminRights2.add_admins = true;
                        break;
                    case "invite_users":
                        tL_chatAdminRights2.invite_users = true;
                        break;
                    case "post_messages":
                        tL_chatAdminRights2.post_messages = true;
                        break;
                    case "pin_messages":
                        tL_chatAdminRights2.pin_messages = true;
                        break;
                }
            }
        } else {
            tL_chatAdminRights2 = null;
        }
        if (tL_chatAdminRights2 == null && tL_chatAdminRights == null) {
            tL_chatAdminRights3 = null;
        } else if (tL_chatAdminRights2 == null) {
            tL_chatAdminRights3 = tL_chatAdminRights;
        } else if (tL_chatAdminRights == null) {
            tL_chatAdminRights3 = tL_chatAdminRights2;
        } else {
            tL_chatAdminRights.change_info = tL_chatAdminRights2.change_info || tL_chatAdminRights.change_info;
            tL_chatAdminRights.post_messages = tL_chatAdminRights2.post_messages || tL_chatAdminRights.post_messages;
            tL_chatAdminRights.edit_messages = tL_chatAdminRights2.edit_messages || tL_chatAdminRights.edit_messages;
            tL_chatAdminRights.add_admins = tL_chatAdminRights2.add_admins || tL_chatAdminRights.add_admins;
            tL_chatAdminRights.delete_messages = tL_chatAdminRights2.delete_messages || tL_chatAdminRights.delete_messages;
            tL_chatAdminRights.ban_users = tL_chatAdminRights2.ban_users || tL_chatAdminRights.ban_users;
            tL_chatAdminRights.invite_users = tL_chatAdminRights2.invite_users || tL_chatAdminRights.invite_users;
            tL_chatAdminRights.pin_messages = tL_chatAdminRights2.pin_messages || tL_chatAdminRights.pin_messages;
            tL_chatAdminRights.manage_call = tL_chatAdminRights2.manage_call || tL_chatAdminRights.manage_call;
            tL_chatAdminRights.anonymous = tL_chatAdminRights2.anonymous || tL_chatAdminRights.anonymous;
            tL_chatAdminRights.other = tL_chatAdminRights2.other || tL_chatAdminRights.other;
            tL_chatAdminRights3 = tL_chatAdminRights;
        }
        if (z && tL_chatAdminRights2 == null && !TextUtils.isEmpty(str2)) {
            MessagesController.getInstance(this.currentAccount).addUserToChat(chat.id, user, 0, str2, dialogsActivity, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$runLinkRequest$73(i, chat, dialogsActivity);
                }
            }, null);
            return;
        }
        ChatRightsEditActivity chatRightsEditActivity = new ChatRightsEditActivity(user.id, -j, tL_chatAdminRights3, null, null, str3, 2, true, !z, str2);
        chatRightsEditActivity.setDelegate(new ChatRightsEditActivity.ChatRightsEditActivityDelegate() {
            @Override
            public void didChangeOwner(TLRPC.User user2) {
            }

            @Override
            public void didSetRights(int i2, TLRPC.TL_chatAdminRights tL_chatAdminRights4, TLRPC.TL_chatBannedRights tL_chatBannedRights, String str5) {
                dialogsActivity.removeSelfFromStack();
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            }
        });
        getActionBarLayout().presentFragment(chatRightsEditActivity, false);
    }

    public void lambda$runLinkRequest$73(int i, TLRPC.Chat chat, DialogsActivity dialogsActivity) {
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putLong("chat_id", chat.id);
        if (MessagesController.getInstance(this.currentAccount).checkCanOpenChat(bundle, dialogsActivity)) {
            presentFragment(new ChatActivity(bundle), true, false);
        }
    }

    public void lambda$runLinkRequest$76(long j, int i, TLRPC.User user, String str, AlertDialog alertDialog, int i2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        long j2 = -j;
        bundle.putLong("chat_id", j2);
        ChatActivity chatActivity = new ChatActivity(bundle);
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
        MessagesController.getInstance(i).addUserToChat(j2, user, 0, str, chatActivity, null);
        getActionBarLayout().presentFragment(chatActivity, true, false, true, false);
    }

    public void lambda$runLinkRequest$79(final int i, final TLRPC.Chat chat, final Runnable runnable, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final String str26, final String str27, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final String str28, final String str29, final boolean z5, final String str30, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str31, final Integer num3, final boolean z11, final byte[] bArr, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$78(tLObject, i, chat, runnable, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
            }
        });
    }

    public void lambda$runLinkRequest$78(TLObject tLObject, int i, TLRPC.Chat chat, Runnable runnable, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, String str26, String str27, Browser.Progress progress, boolean z3, int i4, boolean z4, int i5, int i6, String str28, String str29, boolean z5, String str30, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str31, Integer num3, boolean z11, byte[] bArr) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(i).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(i).putChats(tL_messages_chatFull.chats, false);
            MessagesStorage.getInstance(i).putUsersAndChats(tL_messages_chatFull.users, tL_messages_chatFull.chats, false, true);
            if (MessagesController.getInstance(i).getChat(Long.valueOf(chat.linked_monoforum_id)) == null) {
                try {
                    runnable.run();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, str26, str27, progress, z3, i4, z4, i5, i6, str28, str29, z5, str30, z6, z7, z8, z9, z10, str31, num3, z11, bArr);
            return;
        }
        try {
            runnable.run();
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public static void lambda$runLinkRequest$80(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    class AnonymousClass15 implements MessagesController.MessagesLoadedCallback {
        final Bundle val$args;
        final long val$dialog_id;
        final Runnable val$dismissLoading;
        final BaseFragment val$lastFragment;
        final String val$livestream;
        final Integer val$messageId;

        AnonymousClass15(Runnable runnable, String str, BaseFragment baseFragment, long j, Integer num, Bundle bundle) {
            this.val$dismissLoading = runnable;
            this.val$livestream = str;
            this.val$lastFragment = baseFragment;
            this.val$dialog_id = j;
            this.val$messageId = num;
            this.val$args = bundle;
        }

        @Override
        public void onMessagesLoaded(boolean r8) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.AnonymousClass15.onMessagesLoaded(boolean):void");
        }

        public void lambda$onMessagesLoaded$2(String str, final long j, final BaseFragment baseFragment) {
            if (str != null) {
                final AccountInstance accountInstance = AccountInstance.getInstance(LaunchActivity.this.currentAccount);
                long j2 = -j;
                if (accountInstance.getMessagesController().getGroupCall(j2, false) != null) {
                    VoIPHelper.startCall(accountInstance.getMessagesController().getChat(Long.valueOf(j2)), accountInstance.getMessagesController().getInputPeer(j), null, false, Boolean.valueOf(!r0.call.rtmp_stream), LaunchActivity.this, baseFragment, accountInstance);
                    return;
                }
                TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j2);
                if (chatFull != null) {
                    if (chatFull.call == null) {
                        if (baseFragment.getParentActivity() != null) {
                            BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.linkbroken, LocaleController.getString(R.string.InviteExpired)).show();
                            return;
                        }
                        return;
                    }
                    accountInstance.getMessagesController().getGroupCall(j2, true, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onMessagesLoaded$1(accountInstance, j, baseFragment);
                        }
                    });
                }
            }
        }

        public void lambda$onMessagesLoaded$1(final AccountInstance accountInstance, final long j, final BaseFragment baseFragment) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$onMessagesLoaded$0(accountInstance, j, baseFragment);
                }
            });
        }

        public void lambda$onMessagesLoaded$0(AccountInstance accountInstance, long j, BaseFragment baseFragment) {
            long j2 = -j;
            ChatObject.Call groupCall = accountInstance.getMessagesController().getGroupCall(j2, false);
            VoIPHelper.startCall(accountInstance.getMessagesController().getChat(Long.valueOf(j2)), accountInstance.getMessagesController().getInputPeer(j), null, false, Boolean.valueOf(groupCall == null || !groupCall.call.rtmp_stream), LaunchActivity.this, baseFragment, accountInstance);
        }

        @Override
        public void onError() {
            if (!LaunchActivity.this.isFinishing()) {
                AlertsCreator.showSimpleAlert((BaseFragment) LaunchActivity.this.mainFragmentsStack.get(LaunchActivity.this.mainFragmentsStack.size() - 1), LocaleController.getString(R.string.JoinToGroupErrorNotExist));
            }
            try {
                this.val$dismissLoading.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$runLinkRequest$87(final int i, final AlertDialog alertDialog, final Runnable runnable, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$86(tL_error, tLObject, i, alertDialog, runnable, str);
            }
        });
    }

    public void lambda$runLinkRequest$86(org.telegram.tgnet.TLRPC.TL_error r10, org.telegram.tgnet.TLObject r11, int r12, org.telegram.ui.ActionBar.AlertDialog r13, final java.lang.Runnable r14, java.lang.String r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$runLinkRequest$86(org.telegram.tgnet.TLRPC$TL_error, org.telegram.tgnet.TLObject, int, org.telegram.ui.ActionBar.AlertDialog, java.lang.Runnable, java.lang.String):void");
    }

    public static void lambda$runLinkRequest$82(boolean[] zArr, DialogInterface dialogInterface) {
        zArr[0] = true;
    }

    public void lambda$runLinkRequest$85(final long j, String str, final Long l) {
        if (!"paid".equals(str) || l.longValue() == 0) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$84(l, j);
            }
        });
    }

    public void lambda$runLinkRequest$84(Long l, final long j) {
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        final ChatActivity chatActivityOf = ChatActivity.of(l.longValue());
        safeLastFragment.presentFragment(chatActivityOf);
        final TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-l.longValue()));
        if (chat != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LaunchActivity.lambda$runLinkRequest$83(chatActivityOf, j, chat);
                }
            }, 250L);
        }
    }

    public static void lambda$runLinkRequest$83(BaseFragment baseFragment, long j, TLRPC.Chat chat) {
        BulletinFactory.of(baseFragment).createSimpleBulletin(R.raw.stars_send, LocaleController.getString(R.string.StarsSubscriptionCompleted), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsSubscriptionCompletedText", (int) j, chat.title))).show(true);
    }

    public void lambda$runLinkRequest$90(final Runnable runnable, final int i, TLRPC.ChatInviteJoinResult chatInviteJoinResult, final TLRPC.TL_error tL_error) {
        final TLRPC.Updates updates;
        if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultOk) {
            TLRPC.Updates updates2 = ((TLRPC.TL_chatInviteJoinResultOk) chatInviteJoinResult).updates;
            MessagesController.getInstance(this.currentAccount).processUpdates(updates2, false);
            updates = updates2;
        } else {
            if (chatInviteJoinResult instanceof TLRPC.TL_chatInviteJoinResultWebView) {
                final TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView = (TLRPC.TL_chatInviteJoinResultWebView) chatInviteJoinResult;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$runLinkRequest$88(tL_chatInviteJoinResultWebView);
                    }
                });
            }
            updates = null;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$89(runnable, tL_error, updates, i);
            }
        });
    }

    public void lambda$runLinkRequest$88(TLRPC.TL_chatInviteJoinResultWebView tL_chatInviteJoinResultWebView) {
        MessagesController.getInstance(this.currentAccount).putUsers(tL_chatInviteJoinResultWebView.users, false);
        BotGuardHelper botGuardHelper = BotGuardHelper.getInstance(this.currentAccount);
        long j = tL_chatInviteJoinResultWebView.bot_id;
        botGuardHelper.openGuardBotWebApp(j, j, tL_chatInviteJoinResultWebView.query_id);
    }

    public void lambda$runLinkRequest$89(Runnable runnable, TLRPC.TL_error tL_error, TLRPC.Updates updates, int i) {
        if (isFinishing()) {
            return;
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_error == null) {
            if (this.actionBarLayout == null || updates == null || updates.chats.isEmpty()) {
                return;
            }
            TLRPC.Chat chat = updates.chats.get(0);
            chat.left = false;
            chat.kicked = false;
            MessagesController.getInstance(i).putUsers(updates.users, false);
            MessagesController.getInstance(i).putChats(updates.chats, false);
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (!this.mainFragmentsStack.isEmpty()) {
                if (!MessagesController.getInstance(i).checkCanOpenChat(bundle, (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1))) {
                    return;
                }
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            getActionBarLayout().presentFragment(chatActivity, false, true, true, false);
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            builder.setMessage(LocaleController.getString(R.string.FloodWait));
        } else if (tL_error.text.equals("USERS_TOO_MUCH")) {
            builder.setMessage(LocaleController.getString(R.string.JoinToGroupErrorFull));
        } else {
            builder.setMessage(LocaleController.getString(R.string.JoinToGroupErrorNotExist));
        }
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showAlertDialog(builder);
    }

    public boolean lambda$runLinkRequest$91(boolean z, int i, String str, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z2, boolean z3, int i2, int i3, TopicsFragment topicsFragment) {
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putBoolean("hasUrl", z);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            MediaDataController.getInstance(i).saveDraft(j, 0, str, null, null, false, 0L);
            getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public void lambda$runLinkRequest$95(int[] iArr, final int i, final Runnable runnable, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, final String str3, TLObject tLObject, final TLRPC.TL_error tL_error) {
        final TL_account.authorizationForm authorizationform = (TL_account.authorizationForm) tLObject;
        if (authorizationform != null) {
            iArr[0] = ConnectionsManager.getInstance(i).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    this.f$0.lambda$runLinkRequest$93(runnable, i, authorizationform, getauthorizationform, str, str2, str3, tLObject2, tL_error2);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$runLinkRequest$94(runnable, tL_error);
                }
            });
        }
    }

    public void lambda$runLinkRequest$93(final Runnable runnable, final int i, final TL_account.authorizationForm authorizationform, final TL_account.getAuthorizationForm getauthorizationform, final String str, final String str2, final String str3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$92(runnable, tLObject, i, authorizationform, getauthorizationform, str, str2, str3);
            }
        });
    }

    public void lambda$runLinkRequest$92(Runnable runnable, TLObject tLObject, int i, TL_account.authorizationForm authorizationform, TL_account.getAuthorizationForm getauthorizationform, String str, String str2, String str3) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject != null) {
            MessagesController.getInstance(i).putUsers(authorizationform.users, false);
            lambda$runLinkRequest$100(new PassportActivity(5, getauthorizationform.bot_id, getauthorizationform.scope, getauthorizationform.public_key, str, str2, str3, authorizationform, (TL_account.Password) tLObject));
        }
    }

    public void lambda$runLinkRequest$94(Runnable runnable, TLRPC.TL_error tL_error) {
        try {
            runnable.run();
            if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                AlertsCreator.showUpdateAppAlert(this, LocaleController.getString(R.string.UpdateAppAlert), true);
            } else {
                showAlertDialog(AlertsCreator.createSimpleAlert(this, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$97(final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$96(runnable, tLObject);
            }
        });
    }

    public void lambda$runLinkRequest$96(Runnable runnable, TLObject tLObject) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_help_deepLinkInfo) {
            TLRPC.TL_help_deepLinkInfo tL_help_deepLinkInfo = (TLRPC.TL_help_deepLinkInfo) tLObject;
            AlertsCreator.showUpdateAppAlert(this, tL_help_deepLinkInfo.message, tL_help_deepLinkInfo.update_app);
        }
    }

    public void lambda$runLinkRequest$99(final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$98(runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$runLinkRequest$98(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_langPackLanguage) {
            showAlertDialog(AlertsCreator.createLanguageAlert(this, (TLRPC.TL_langPackLanguage) tLObject));
            return;
        }
        if (tL_error != null) {
            if ("LANG_CODE_NOT_SUPPORTED".equals(tL_error.text)) {
                showAlertDialog(AlertsCreator.createSimpleAlert(this, LocaleController.getString(R.string.LanguageUnsupportedError)));
                return;
            }
            showAlertDialog(AlertsCreator.createSimpleAlert(this, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
        }
    }

    public void lambda$runLinkRequest$102(final Runnable runnable, final TLRPC.TL_wallPaper tL_wallPaper, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$101(runnable, tLObject, tL_wallPaper, tL_error);
            }
        });
    }

    public void lambda$runLinkRequest$101(Runnable runnable, TLObject tLObject, TLRPC.TL_wallPaper tL_wallPaper, TLRPC.TL_error tL_error) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper2 = (TLRPC.TL_wallPaper) tLObject;
            if (tL_wallPaper2.pattern) {
                String str = tL_wallPaper2.slug;
                TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
                WallpapersListActivity.ColorWallpaper colorWallpaper = new WallpapersListActivity.ColorWallpaper(str, wallPaperSettings.background_color, wallPaperSettings.second_background_color, wallPaperSettings.third_background_color, wallPaperSettings.fourth_background_color, AndroidUtilities.getWallpaperRotation(wallPaperSettings.rotation, false), r0.intensity / 100.0f, tL_wallPaper.settings.motion, null);
                colorWallpaper.pattern = tL_wallPaper2;
                tL_wallPaper2 = colorWallpaper;
            }
            ThemePreviewActivity themePreviewActivity = new ThemePreviewActivity(tL_wallPaper2, null, true, false);
            TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
            themePreviewActivity.setInitialModes(wallPaperSettings2.blur, wallPaperSettings2.motion, wallPaperSettings2.intensity);
            lambda$runLinkRequest$100(themePreviewActivity);
            return;
        }
        showAlertDialog(AlertsCreator.createSimpleAlert(this, LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text));
    }

    public void lambda$runLinkRequest$103(Browser.Progress progress) {
        this.loadingThemeFileName = null;
        this.loadingThemeWallpaperName = null;
        this.loadingThemeWallpaper = null;
        this.loadingThemeInfo = null;
        this.loadingThemeProgressDialog = null;
        this.loadingTheme = null;
        if (progress != null) {
            progress.end();
        }
    }

    public void lambda$runLinkRequest$105(final AlertDialog alertDialog, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$104(tLObject, alertDialog, runnable, tL_error);
            }
        });
    }

    public void lambda$runLinkRequest$104(org.telegram.tgnet.TLObject r6, org.telegram.ui.ActionBar.AlertDialog r7, java.lang.Runnable r8, org.telegram.tgnet.TLRPC.TL_error r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$runLinkRequest$104(org.telegram.tgnet.TLObject, org.telegram.ui.ActionBar.AlertDialog, java.lang.Runnable, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public void lambda$runLinkRequest$107(final int[] iArr, final int i, final Runnable runnable, final Integer num, final Integer num2, final Long l, final Integer num3, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$106(tLObject, iArr, i, runnable, num, num2, l, num3);
            }
        });
    }

    public void lambda$runLinkRequest$106(TLObject tLObject, int[] iArr, int i, Runnable runnable, Integer num, Integer num2, Long l, Integer num3) {
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chats.chats, false);
                iArr[0] = runCommentRequest(i, runnable, num, num2, l, num3, tL_messages_chats.chats.get(0));
                return;
            }
        }
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        showAlertDialog(AlertsCreator.createNoAccessAlert(this, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    public static void lambda$runLinkRequest$108(Runnable runnable) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$runLinkRequest$111(final Bundle bundle, final Long l, int[] iArr, final Runnable runnable, final boolean z, final Browser.Progress progress, final Long l2, final Integer num, final Integer num2, final byte[] bArr, final BaseFragment baseFragment, final int i) {
        if (getActionBarLayout().presentFragment(new ChatActivity(bundle))) {
            return;
        }
        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
        tL_inputChannel.channel_id = l.longValue();
        tL_channels_getChannels.id.add(tL_inputChannel);
        iArr[0] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getChannels, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$runLinkRequest$110(runnable, z, l, progress, l2, num, num2, bArr, baseFragment, i, bundle, tLObject, tL_error);
            }
        });
    }

    public void lambda$runLinkRequest$110(final Runnable runnable, final boolean z, final Long l, final Browser.Progress progress, final Long l2, final Integer num, final Integer num2, final byte[] bArr, final BaseFragment baseFragment, final int i, final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$109(runnable, tLObject, z, l, progress, l2, num, num2, bArr, baseFragment, i, bundle);
            }
        });
    }

    public void lambda$runLinkRequest$109(Runnable runnable, TLObject tLObject, boolean z, Long l, Browser.Progress progress, Long l2, Integer num, Integer num2, byte[] bArr, BaseFragment baseFragment, int i, Bundle bundle) {
        try {
            runnable.run();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tLObject instanceof TLRPC.TL_messages_chats) {
            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
            if (!tL_messages_chats.chats.isEmpty()) {
                MessagesController.getInstance(this.currentAccount).putChats(tL_messages_chats.chats, false);
                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                if (chat != null && z && ChatObject.isBoostSupported(chat)) {
                    processBoostDialog(Long.valueOf(-l.longValue()), null, progress);
                } else if (chat != null && chat.forum) {
                    if (l2 != null) {
                        openForumFromLink(-l.longValue(), num, null, num2, bArr, null, 0, -1);
                    } else {
                        openForumFromLink(-l.longValue(), null, null, num2, bArr, null, 0, -1);
                    }
                }
                if (baseFragment == null || MessagesController.getInstance(i).checkCanOpenChat(bundle, baseFragment)) {
                    getActionBarLayout().presentFragment(new ChatActivity(bundle));
                    return;
                }
                return;
            }
        }
        showAlertDialog(AlertsCreator.createNoAccessAlert(this, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound), null));
    }

    public void lambda$runLinkRequest$113(final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$runLinkRequest$112(tLObject);
            }
        });
    }

    public void lambda$runLinkRequest$112(TLObject tLObject) {
        if (tLObject instanceof TL_account.resolvedBusinessChatLinks) {
            TL_account.resolvedBusinessChatLinks resolvedbusinesschatlinks = (TL_account.resolvedBusinessChatLinks) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(resolvedbusinesschatlinks.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(resolvedbusinesschatlinks.chats, false);
            MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(resolvedbusinesschatlinks.users, resolvedbusinesschatlinks.chats, true, true);
            Bundle bundle = new Bundle();
            TLRPC.Peer peer = resolvedbusinesschatlinks.peer;
            if (peer instanceof TLRPC.TL_peerUser) {
                bundle.putLong("user_id", peer.user_id);
            } else if ((peer instanceof TLRPC.TL_peerChat) || (peer instanceof TLRPC.TL_peerChannel)) {
                bundle.putLong("chat_id", peer.channel_id);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setResolvedChatLink(resolvedbusinesschatlinks);
            presentFragment(chatActivity, false, true);
            return;
        }
        showAlertDialog(AlertsCreator.createSimpleAlert(this, LocaleController.getString(R.string.BusinessLink), LocaleController.getString(R.string.BusinessLinkInvalid)));
    }

    public static void lambda$runLinkRequest$114(int i, int[] iArr, Runnable runnable, DialogInterface dialogInterface) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$runLinkRequest$115(int i, int[] iArr, Runnable runnable) {
        ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
        if (runnable != null) {
            runnable.run();
        }
    }

    private void processWebAppBot(final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, String str26, final String str27, final Browser.Progress progress, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final boolean z5, final String str28, final TLRPC.User user, final Runnable runnable, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final boolean z11, final boolean z12, final String str29, final boolean z13) {
        TLRPC.TL_messages_getBotApp tL_messages_getBotApp = new TLRPC.TL_messages_getBotApp();
        TLRPC.TL_inputBotAppShortName tL_inputBotAppShortName = new TLRPC.TL_inputBotAppShortName();
        tL_inputBotAppShortName.bot_id = MessagesController.getInstance(i).getInputUser(user);
        tL_inputBotAppShortName.short_name = str26;
        tL_messages_getBotApp.app = tL_inputBotAppShortName;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getBotApp, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$processWebAppBot$120(progress, i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, z3, i4, z4, i5, i6, z5, str28, z8, z9, z10, z11, z12, str29, z13, runnable, user, str27, z7, z6, tLObject, tL_error);
            }
        });
    }

    public void lambda$processWebAppBot$120(final Browser.Progress progress, final int i, final String str, final String str2, final String str3, final String str4, final String str5, final String str6, final String str7, final String str8, final String str9, final String str10, final String str11, final String str12, final boolean z, final Integer num, final Long l, final Long l2, final Integer num2, final String str13, final HashMap map, final String str14, final String str15, final String str16, final String str17, final TLRPC.TL_wallPaper tL_wallPaper, final String str18, final String str19, final String str20, final String str21, final boolean z2, final String str22, final int i2, final int i3, final String str23, final String str24, final String str25, final boolean z3, final int i4, final boolean z4, final int i5, final int i6, final boolean z5, final String str26, final boolean z6, final boolean z7, final boolean z8, final boolean z9, final boolean z10, final String str27, final boolean z11, final Runnable runnable, final TLRPC.User user, final String str28, final boolean z12, final boolean z13, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (progress != null) {
            progress.end();
        }
        if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processWebAppBot$116(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, progress, z3, i4, z4, i5, i6, z5, str26, z6, z7, z8, z9, z10, str27, z11);
                }
            });
        } else {
            final TLRPC.TL_messages_botApp tL_messages_botApp = (TLRPC.TL_messages_botApp) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processWebAppBot$119(runnable, i, user, tL_messages_botApp, str28, z6, z7, z8, z3, z12, z13, progress);
                }
            });
        }
    }

    public void lambda$processWebAppBot$116(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, Integer num, Long l, Long l2, Integer num2, String str13, HashMap map, String str14, String str15, String str16, String str17, TLRPC.TL_wallPaper tL_wallPaper, String str18, String str19, String str20, String str21, boolean z2, String str22, int i2, int i3, String str23, String str24, String str25, Browser.Progress progress, boolean z3, int i4, boolean z4, int i5, int i6, boolean z5, String str26, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str27, boolean z11) {
        runLinkRequest(i, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, z, num, l, l2, num2, str13, map, str14, str15, str16, str17, tL_wallPaper, str18, str19, str20, str21, z2, str22, i2, i3, str23, str24, str25, null, null, progress, z3, i4, z4, i5, i6, null, null, z5, str26, z6, z7, z8, z9, z10, str27, null, z11, null);
    }

    public void lambda$processWebAppBot$119(Runnable runnable, final int i, final TLRPC.User user, final TLRPC.TL_messages_botApp tL_messages_botApp, final String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, boolean z5, boolean z6, Browser.Progress progress) {
        BaseFragment baseFragment;
        runnable.run();
        final AtomicBoolean atomicBoolean = new AtomicBoolean();
        ArrayList arrayList = this.mainFragmentsStack;
        if (arrayList == null || arrayList.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1);
        }
        final BaseFragment baseFragment2 = baseFragment;
        BaseFragment baseFragment3 = baseFragment;
        final Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processWebAppBot$117(baseFragment2, i, user, tL_messages_botApp, atomicBoolean, str, z, z2, z3, z4);
            }
        };
        if (z5) {
            runnable2.run();
            return;
        }
        if (tL_messages_botApp.inactive && z6) {
            WebAppDisclaimerAlert.show(this, new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    runnable2.run();
                }
            }, null, progress != null ? new ChatActivity$ChatMessageCellDelegate$$ExternalSyntheticLambda14(progress) : null);
        } else if (tL_messages_botApp.request_write_access || z4) {
            AlertsCreator.createBotLaunchAlert(baseFragment3, atomicBoolean, user, runnable2);
        } else {
            runnable2.run();
        }
    }

    public void lambda$processWebAppBot$117(BaseFragment baseFragment, int i, TLRPC.User user, TLRPC.TL_messages_botApp tL_messages_botApp, AtomicBoolean atomicBoolean, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        if (baseFragment == null || !isActive || isFinishing() || isDestroyed()) {
            return;
        }
        long j = user.id;
        WebViewRequestProps webViewRequestPropsOf = WebViewRequestProps.of(i, j, j, null, null, 3, 0, 0L, false, tL_messages_botApp.app, atomicBoolean.get(), str, user, 0, z, z2);
        if (getBottomSheetTabs() == null || getBottomSheetTabs().tryReopenTab(webViewRequestPropsOf) == null) {
            SharedPrefsHelper.setWebViewConfirmShown(this.currentAccount, user.id, true);
            BotWebViewSheet botWebViewSheet = new BotWebViewSheet(this, baseFragment.getResourceProvider());
            botWebViewSheet.setWasOpenedByLinkIntent(z3);
            botWebViewSheet.setDefaultFullsize(!z);
            if (z2) {
                botWebViewSheet.setFullscreen(true, false);
            }
            botWebViewSheet.setNeedsContext(false);
            botWebViewSheet.setParentActivity(this);
            botWebViewSheet.requestWebView(baseFragment, webViewRequestPropsOf);
            botWebViewSheet.show();
            if (tL_messages_botApp.inactive || z4) {
                botWebViewSheet.showJustAddedBulletin();
            }
        }
    }

    private void processAttachedMenuBotFromShortcut(final long j) {
        for (int i = 0; i < this.visibleDialogs.size(); i++) {
            if (this.visibleDialogs.get(i) instanceof BotWebViewSheet) {
                BotWebViewSheet botWebViewSheet = (BotWebViewSheet) this.visibleDialogs.get(i);
                if (botWebViewSheet.isShowing() && botWebViewSheet.getBotId() == j) {
                    return;
                }
            }
        }
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment != null && safeLastFragment.sheetsStack != null) {
            for (int i2 = 0; i2 < safeLastFragment.sheetsStack.size(); i2++) {
                if (safeLastFragment.sheetsStack.get(i2).isShown()) {
                    safeLastFragment.sheetsStack.get(i2);
                }
            }
        }
        EmptyBaseFragment sheetFragment = this.actionBarLayout.getSheetFragment(false);
        if (sheetFragment != null && sheetFragment.sheetsStack != null) {
            for (int i3 = 0; i3 < sheetFragment.sheetsStack.size(); i3++) {
                if (sheetFragment.sheetsStack.get(i3).isShown()) {
                    sheetFragment.sheetsStack.get(i3);
                }
            }
        }
        final Utilities.Callback callback = new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$processAttachedMenuBotFromShortcut$121((TLRPC.User) obj);
            }
        };
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j));
        if (user != null) {
            callback.run(user);
        } else {
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processAttachedMenuBotFromShortcut$123(j, callback);
                }
            });
        }
    }

    public void lambda$processAttachedMenuBotFromShortcut$121(TLRPC.User user) {
        MessagesController.getInstance(this.currentAccount).openApp(user, 0);
    }

    public void lambda$processAttachedMenuBotFromShortcut$123(long j, final Utilities.Callback callback) {
        final TLRPC.User user = MessagesStorage.getInstance(this.currentAccount).getUser(j);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processAttachedMenuBotFromShortcut$122(user, callback);
            }
        });
    }

    public void lambda$processAttachedMenuBotFromShortcut$122(TLRPC.User user, Utilities.Callback callback) {
        MessagesController.getInstance(this.currentAccount).putUser(user, true);
        callback.run(user);
    }

    private void processBoostDialog(Long l, Runnable runnable, Browser.Progress progress) {
        processBoostDialog(l, runnable, progress, null);
    }

    private void processBoostDialog(final Long l, final Runnable runnable, final Browser.Progress progress, final ChatMessageCell chatMessageCell) {
        final ChannelBoostsController boostsController = MessagesController.getInstance(this.currentAccount).getBoostsController();
        if (progress != null) {
            progress.init();
        }
        boostsController.getBoostsStats(l.longValue(), new com.google.android.exoplayer2.util.Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$processBoostDialog$125(progress, runnable, boostsController, l, chatMessageCell, (TL_stories.TL_premium_boostsStatus) obj);
            }
        });
    }

    public void lambda$processBoostDialog$125(final Browser.Progress progress, final Runnable runnable, ChannelBoostsController channelBoostsController, final Long l, final ChatMessageCell chatMessageCell, final TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        if (tL_premium_boostsStatus != null) {
            channelBoostsController.userCanBoostChannel(l.longValue(), tL_premium_boostsStatus, new com.google.android.exoplayer2.util.Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$processBoostDialog$124(progress, l, tL_premium_boostsStatus, chatMessageCell, runnable, (ChannelBoostsController.CanApplyBoost) obj);
                }
            });
            return;
        }
        if (progress != null) {
            progress.end();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$processBoostDialog$124(Browser.Progress progress, Long l, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, ChatMessageCell chatMessageCell, Runnable runnable, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        RightSlidingDialogContainer rightSlidingDialogContainer;
        if (progress != null) {
            progress.end();
        }
        BaseFragment lastFragmentIncludeMainTabs = getLastFragmentIncludeMainTabs();
        if (lastFragmentIncludeMainTabs == null) {
            return;
        }
        Theme.ResourcesProvider resourceProvider = lastFragmentIncludeMainTabs.getResourceProvider();
        if (lastFragmentIncludeMainTabs.getLastStoryViewer() != null && lastFragmentIncludeMainTabs.getLastStoryViewer().isFullyVisible()) {
            resourceProvider = lastFragmentIncludeMainTabs.getLastStoryViewer().getResourceProvider();
        }
        LimitReachedBottomSheet limitReachedBottomSheet = new LimitReachedBottomSheet(lastFragmentIncludeMainTabs, this, 19, this.currentAccount, resourceProvider);
        limitReachedBottomSheet.setCanApplyBoost(canApplyBoost);
        boolean z = false;
        if (!(lastFragmentIncludeMainTabs instanceof ChatActivity) ? !(!(lastFragmentIncludeMainTabs instanceof DialogsActivity) || (rightSlidingDialogContainer = ((DialogsActivity) lastFragmentIncludeMainTabs).rightSlidingDialogContainer) == null || rightSlidingDialogContainer.getCurrentFragmetDialogId() != l.longValue()) : ((ChatActivity) lastFragmentIncludeMainTabs).getDialogId() == l.longValue()) {
            z = true;
        }
        limitReachedBottomSheet.setBoostsStats(tL_premium_boostsStatus, z);
        limitReachedBottomSheet.setDialogId(l.longValue());
        limitReachedBottomSheet.setChatMessageCell(chatMessageCell);
        lastFragmentIncludeMainTabs.showDialog(limitReachedBottomSheet);
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void processAttachMenuBot(final int i, final long j, final String str, final TLRPC.User user, final String str2, final String str3) {
        TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
        tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i).getInputUser(j);
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_getAttachMenuBot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$processAttachMenuBot$132(i, str3, str, user, str2, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$processAttachMenuBot$132(final int i, final String str, final String str2, final TLRPC.User user, final String str3, final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processAttachMenuBot$131(tLObject, i, str, str2, user, str3, j);
            }
        });
    }

    public void lambda$processAttachMenuBot$131(TLObject tLObject, final int i, String str, String str2, final TLRPC.User user, final String str3, final long j) {
        DialogsActivity dialogsActivity;
        final TLRPC.User user2 = user;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(i).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (str != null) {
                showAttachMenuBot(this, this.currentAccount, tL_attachMenuBot, str, false);
                return;
            }
            ArrayList arrayList = this.mainFragmentsStack;
            BaseFragment baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
            if (AndroidUtilities.isTablet() && !(baseFragment instanceof ChatActivity) && !this.rightFragmentsStack.isEmpty()) {
                ArrayList arrayList2 = this.rightFragmentsStack;
                baseFragment = (BaseFragment) arrayList2.get(arrayList2.size() - 1);
            }
            final BaseFragment baseFragment2 = baseFragment;
            ArrayList arrayList3 = new ArrayList();
            if (!TextUtils.isEmpty(str2)) {
                for (String str4 : str2.split(" ")) {
                    if (MediaDataController.canShowAttachMenuBotForTarget(tL_attachMenuBot, str4)) {
                        arrayList3.add(str4);
                    }
                }
            }
            if (arrayList3.isEmpty()) {
                dialogsActivity = null;
            } else {
                Bundle bundle = new Bundle();
                bundle.putInt("dialogsType", 14);
                bundle.putBoolean("onlySelect", true);
                bundle.putBoolean("allowGroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowMegagroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowLegacyGroups", arrayList3.contains("groups"));
                bundle.putBoolean("allowUsers", arrayList3.contains("users"));
                bundle.putBoolean("allowChannels", arrayList3.contains("channels"));
                bundle.putBoolean("allowBots", arrayList3.contains("bots"));
                DialogsActivity dialogsActivity2 = new DialogsActivity(bundle);
                dialogsActivity2.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                    @Override
                    public boolean canSelectStories() {
                        return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                    }

                    @Override
                    public final boolean didSelectDialogs(DialogsActivity dialogsActivity3, ArrayList arrayList4, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
                        return this.f$0.lambda$processAttachMenuBot$126(user2, str3, i, dialogsActivity3, arrayList4, charSequence, z, z2, i2, i3, topicsFragment);
                    }

                    @Override
                    public boolean didSelectStories(DialogsActivity dialogsActivity3) {
                        return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity3);
                    }
                });
                dialogsActivity = dialogsActivity2;
            }
            if (tL_attachMenuBot.inactive) {
                AttachBotIntroTopView attachBotIntroTopView = new AttachBotIntroTopView(this);
                attachBotIntroTopView.setColor(Theme.getColor(Theme.key_chat_attachIcon));
                attachBotIntroTopView.setBackgroundColor(Theme.getColor(Theme.key_dialogTopBackground));
                attachBotIntroTopView.setAttachBot(tL_attachMenuBot);
                final DialogsActivity dialogsActivity3 = dialogsActivity;
                com.google.android.exoplayer2.util.Consumer consumer = new com.google.android.exoplayer2.util.Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        this.f$0.lambda$processAttachMenuBot$130(i, j, dialogsActivity3, baseFragment2, user, str3, (Boolean) obj);
                    }
                };
                if (!tL_attachMenuBot.request_write_access) {
                    user2 = null;
                }
                WebAppDisclaimerAlert.show(this, consumer, user2, null);
                return;
            }
            if (dialogsActivity != null) {
                if (baseFragment2 != null) {
                    baseFragment2.dismissCurrentDialog();
                }
                for (int i2 = 0; i2 < this.visibleDialogs.size(); i2++) {
                    if (((Dialog) this.visibleDialogs.get(i2)).isShowing()) {
                        ((Dialog) this.visibleDialogs.get(i2)).dismiss();
                    }
                }
                this.visibleDialogs.clear();
                lambda$runLinkRequest$100(dialogsActivity);
                return;
            }
            if (baseFragment2 instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment2;
                if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, chatActivity.getCurrentUser() != null ? chatActivity.getCurrentUser() : chatActivity.getCurrentChat())) {
                    BulletinFactory.of(baseFragment2).createErrorBulletin(LocaleController.getString(R.string.BotAlreadyAddedToAttachMenu)).show();
                    return;
                } else {
                    chatActivity.openAttachBotLayout(user2.id, str3, false);
                    return;
                }
            }
            BulletinFactory.of(baseFragment2).createErrorBulletin(LocaleController.getString(R.string.BotAlreadyAddedToAttachMenu)).show();
            return;
        }
        ArrayList arrayList4 = this.mainFragmentsStack;
        BulletinFactory.of((BaseFragment) arrayList4.get(arrayList4.size() - 1)).createErrorBulletin(LocaleController.getString(R.string.BotCantAddToAttachMenu)).show();
    }

    public boolean lambda$processAttachMenuBot$126(TLRPC.User user, String str, int i, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i2, int i3, TopicsFragment topicsFragment) {
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        if (DialogObject.isEncryptedDialog(j)) {
            bundle.putInt("enc_id", DialogObject.getEncryptedChatId(j));
        } else if (DialogObject.isUserDialog(j)) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        bundle.putString("attach_bot", UserObject.getPublicUsername(user));
        if (str != null) {
            bundle.putString("attach_bot_start_command", str);
        }
        if (MessagesController.getInstance(i).checkCanOpenChat(bundle, dialogsActivity)) {
            NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            getActionBarLayout().presentFragment(new ChatActivity(bundle), true, false, true, false);
        }
        return true;
    }

    public void lambda$processAttachMenuBot$130(final int i, long j, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str, Boolean bool) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(j);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$processAttachMenuBot$129(i, dialogsActivity, baseFragment, user, str, tLObject, tL_error);
            }
        }, 66);
    }

    public void lambda$processAttachMenuBot$129(final int i, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processAttachMenuBot$128(tLObject, i, dialogsActivity, baseFragment, user, str);
            }
        });
    }

    public void lambda$processAttachMenuBot$128(TLObject tLObject, int i, final DialogsActivity dialogsActivity, final BaseFragment baseFragment, final TLRPC.User user, final String str) {
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            MediaDataController.getInstance(i).loadAttachMenuBots(false, true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processAttachMenuBot$127(dialogsActivity, baseFragment, user, str);
                }
            });
        }
    }

    public void lambda$processAttachMenuBot$127(DialogsActivity dialogsActivity, BaseFragment baseFragment, TLRPC.User user, String str) {
        if (dialogsActivity != null) {
            if (baseFragment != null) {
                baseFragment.dismissCurrentDialog();
            }
            for (int i = 0; i < this.visibleDialogs.size(); i++) {
                if (((Dialog) this.visibleDialogs.get(i)).isShowing()) {
                    ((Dialog) this.visibleDialogs.get(i)).dismiss();
                }
            }
            this.visibleDialogs.clear();
            lambda$runLinkRequest$100(dialogsActivity);
            return;
        }
        if (baseFragment instanceof ChatActivity) {
            ((ChatActivity) baseFragment).openAttachBotLayout(user.id, str, true);
        }
    }

    private void openForumFromLink(final long j, final Integer num, final String str, final Integer num2, final byte[] bArr, final Runnable runnable, final int i, final int i2) {
        if (num == null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j);
            lambda$runLinkRequest$100(TopicsFragment.getTopicsOrChat(this, bundle));
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        TLRPC.TL_channels_getMessages tL_channels_getMessages = new TLRPC.TL_channels_getMessages();
        tL_channels_getMessages.channel = MessagesController.getInstance(this.currentAccount).getInputChannel(-j);
        tL_channels_getMessages.id.add(num);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_channels_getMessages, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$openForumFromLink$134(num, num2, bArr, j, runnable, str, i, i2, tLObject, tL_error);
            }
        });
    }

    public void lambda$openForumFromLink$134(final Integer num, final Integer num2, final byte[] bArr, final long j, final Runnable runnable, final String str, final int i, final int i2, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openForumFromLink$133(tLObject, num, num2, bArr, j, runnable, str, i, i2);
            }
        });
    }

    public void lambda$openForumFromLink$133(TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j, Runnable runnable, String str, int i, int i2) {
        TLRPC.Message message;
        if (tLObject instanceof TLRPC.messages_Messages) {
            ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) != null && arrayList.get(i3).id == num.intValue()) {
                    message = arrayList.get(i3);
                    break;
                }
            }
            message = null;
        } else {
            message = null;
        }
        if (message != null) {
            int i4 = this.currentAccount;
            Integer numValueOf = Integer.valueOf(message.id);
            int i5 = this.currentAccount;
            runCommentRequest(i4, null, numValueOf, null, Long.valueOf(MessageObject.getTopicId(i5, message, MessagesController.getInstance(i5).isForum(message))), num2, bArr, MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j)), runnable, str, i, i2);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", -j);
        lambda$runLinkRequest$100(TopicsFragment.getTopicsOrChat(this, bundle));
        if (runnable != null) {
            runnable.run();
        }
    }

    private java.util.List findContacts(java.lang.String r19, java.lang.String r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.findContacts(java.lang.String, java.lang.String, boolean):java.util.List");
    }

    public void checkAppUpdate(boolean z, final Browser.Progress progress) {
        if (ApplicationLoader.isStandaloneBuild() || ApplicationLoader.isBetaBuild()) {
            if (z || BuildVars.CHECK_UPDATES) {
                if (ApplicationLoader.applicationLoaderInstance.isCustomUpdate()) {
                    final BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
                    final boolean z2 = this.firstAppUpdateCheck;
                    this.firstAppUpdateCheck = false;
                    ApplicationLoader.applicationLoaderInstance.checkUpdate(z, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$checkAppUpdate$135(progress, z2, update);
                        }
                    });
                    return;
                }
                if (z || Math.abs(System.currentTimeMillis() - SharedConfig.lastUpdateCheckTime) >= MessagesController.getInstance(0).updateCheckDelay * 1000) {
                    TLRPC.TL_help_getAppUpdate tL_help_getAppUpdate = new TLRPC.TL_help_getAppUpdate();
                    try {
                        tL_help_getAppUpdate.source = ApplicationLoader.applicationContext.getPackageManager().getInstallerPackageName(ApplicationLoader.applicationContext.getPackageName());
                    } catch (Exception unused) {
                    }
                    if (tL_help_getAppUpdate.source == null) {
                        tL_help_getAppUpdate.source = "";
                    }
                    final int i = this.currentAccount;
                    final int iSendRequest = ConnectionsManager.getInstance(i).sendRequest(tL_help_getAppUpdate, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$checkAppUpdate$139(i, progress, tLObject, tL_error);
                        }
                    });
                    if (progress != null) {
                        progress.init();
                        progress.onCancel(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$checkAppUpdate$140(iSendRequest);
                            }
                        });
                    }
                }
            }
        }
    }

    public void lambda$checkAppUpdate$135(Browser.Progress progress, boolean z, BetaUpdate betaUpdate) {
        BaseFragment lastFragment;
        BetaUpdate update = ApplicationLoader.applicationLoaderInstance.getUpdate();
        if (progress != null) {
            progress.end();
            if (update == null && (lastFragment = getLastFragment()) != null) {
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
        if (update == null || ApplicationLoader.applicationLoaderInstance.isDownloadingUpdate()) {
            return;
        }
        if (z || betaUpdate == null || update.higherThan(betaUpdate)) {
            ApplicationLoader.applicationLoaderInstance.showCustomUpdateAppPopup(this, update, this.currentAccount);
        }
    }

    public void lambda$checkAppUpdate$139(final int i, final Browser.Progress progress, TLObject tLObject, final TLRPC.TL_error tL_error) {
        SharedConfig.lastUpdateCheckTime = System.currentTimeMillis();
        SharedConfig.saveConfig();
        if (tLObject instanceof TLRPC.TL_help_appUpdate) {
            final TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) tLObject;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() throws PackageManager.NameNotFoundException {
                    this.f$0.lambda$checkAppUpdate$136(tL_help_appUpdate, i, progress);
                }
            });
        } else if (tLObject instanceof TLRPC.TL_help_noAppUpdate) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LaunchActivity.lambda$checkAppUpdate$137(progress);
                }
            });
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LaunchActivity.lambda$checkAppUpdate$138(progress, tL_error);
                }
            });
        }
    }

    public void lambda$checkAppUpdate$136(TLRPC.TL_help_appUpdate tL_help_appUpdate, int i, Browser.Progress progress) throws PackageManager.NameNotFoundException {
        BaseFragment lastFragment;
        TLRPC.TL_help_appUpdate tL_help_appUpdate2 = SharedConfig.pendingAppUpdate;
        if (tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) {
            boolean newAppVersionAvailable = SharedConfig.setNewAppVersionAvailable(tL_help_appUpdate);
            if (newAppVersionAvailable) {
                if (tL_help_appUpdate.can_not_skip) {
                    showUpdateActivity(i, tL_help_appUpdate, false);
                } else if (ApplicationLoader.isStandaloneBuild() || BuildVars.DEBUG_VERSION) {
                    ApplicationLoader.applicationLoaderInstance.showUpdateAppPopup(this, tL_help_appUpdate, i);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.appUpdateAvailable, new Object[0]);
            }
            if (progress != null) {
                progress.end();
                if (newAppVersionAvailable || (lastFragment = getLastFragment()) == null) {
                    return;
                }
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
    }

    public static void lambda$checkAppUpdate$137(Browser.Progress progress) {
        if (progress != null) {
            progress.end();
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment != null) {
                BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.chats_infotip, LocaleController.getString(R.string.YourVersionIsLatest)).show();
            }
        }
    }

    public static void lambda$checkAppUpdate$138(Browser.Progress progress, TLRPC.TL_error tL_error) {
        if (progress != null) {
            progress.end();
            BaseFragment lastFragment = getLastFragment();
            if (lastFragment != null) {
                BulletinFactory.of(lastFragment).showForError(tL_error);
            }
        }
    }

    public void lambda$checkAppUpdate$140(int i) {
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(i, true);
    }

    public Dialog showAlertDialog(AlertDialog.Builder builder) {
        try {
            final AlertDialog alertDialogShow = builder.show();
            alertDialogShow.setCanceledOnTouchOutside(true);
            alertDialogShow.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$showAlertDialog$141(alertDialogShow, dialogInterface);
                }
            });
            this.visibleDialogs.add(alertDialogShow);
            return alertDialogShow;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public void lambda$showAlertDialog$141(AlertDialog alertDialog, DialogInterface dialogInterface) {
        if (alertDialog != null) {
            if (alertDialog == this.localeDialog) {
                ActionBarLayout actionBarLayout = this.actionBarLayout;
                BaseFragment lastFragment = actionBarLayout == null ? null : actionBarLayout.getLastFragment();
                try {
                    String str = LocaleController.getInstance().getCurrentLocaleInfo().shortName;
                    if (lastFragment != null) {
                        BulletinFactory.of(lastFragment).createSimpleBulletin(R.raw.msg_translate, getStringForLanguageAlert(str.equals("en") ? this.englishLocaleStrings : this.systemLocaleStrings, "ChangeLanguageLater", R.string.ChangeLanguageLater)).setDuration(5000).show();
                    } else {
                        BulletinFactory.of(Bulletin.BulletinWindow.make(this), null).createSimpleBulletin(R.raw.msg_translate, getStringForLanguageAlert(str.equals("en") ? this.englishLocaleStrings : this.systemLocaleStrings, "ChangeLanguageLater", R.string.ChangeLanguageLater)).setDuration(5000).show();
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.localeDialog = null;
            } else if (alertDialog == this.proxyErrorDialog) {
                MessagesController.getGlobalMainSettings();
                SharedPreferences.Editor editorEdit = MessagesController.getGlobalMainSettings().edit();
                editorEdit.putBoolean("proxy_enabled", false);
                editorEdit.putBoolean("proxy_enabled_calls", false);
                editorEdit.commit();
                ConnectionsManager.setProxySettings(false, "", 1080, "", "", "");
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.proxySettingsChanged, new Object[0]);
                this.proxyErrorDialog = null;
            }
        }
        this.visibleDialogs.remove(alertDialog);
    }

    public void showBulletin(Function function) {
        BaseFragment baseFragment;
        if (!this.layerFragmentsStack.isEmpty()) {
            baseFragment = (BaseFragment) this.layerFragmentsStack.get(r0.size() - 1);
        } else if (!this.rightFragmentsStack.isEmpty()) {
            baseFragment = (BaseFragment) this.rightFragmentsStack.get(r0.size() - 1);
        } else if (this.mainFragmentsStack.isEmpty()) {
            baseFragment = null;
        } else {
            baseFragment = (BaseFragment) this.mainFragmentsStack.get(r0.size() - 1);
        }
        if (BulletinFactory.canShowBulletin(baseFragment)) {
            ((Bulletin) function.apply(BulletinFactory.of(baseFragment))).show();
        }
    }

    public void setNavigateToPremiumBot(boolean z) {
        this.navigateToPremiumBot = z;
    }

    public void setNavigateToPremiumGiftCallback(Runnable runnable) {
        this.navigateToPremiumGiftCallback = runnable;
    }

    @Override
    public void onNewIntent(Intent intent) throws Throwable {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, null, true, true);
    }

    public void onNewIntent(Intent intent, Browser.Progress progress) throws Throwable {
        super.onNewIntent(intent);
        handleIntent(intent, true, false, false, progress, true, false);
    }

    @Override
    public boolean canSelectStories() {
        ArrayList arrayList = this.photoPathsArray;
        return (arrayList != null && arrayList.size() == 1) || this.videoPath != null;
    }

    @Override
    public boolean didSelectStories(org.telegram.ui.DialogsActivity r22) throws android.content.res.Resources.NotFoundException, java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didSelectStories(org.telegram.ui.DialogsActivity):boolean");
    }

    @Override
    public boolean didSelectDialogs(final org.telegram.ui.DialogsActivity r47, final java.util.ArrayList r48, final java.lang.CharSequence r49, final boolean r50, boolean r51, int r52, final int r53, org.telegram.ui.TopicsFragment r54) throws android.content.res.Resources.NotFoundException, java.io.IOException, java.lang.IllegalArgumentException, java.lang.NegativeArraySizeException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didSelectDialogs(org.telegram.ui.DialogsActivity, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.TopicsFragment):boolean");
    }

    public void lambda$didSelectDialogs$142(int i, DialogsActivity dialogsActivity, boolean z, ArrayList arrayList, Uri uri, AlertDialog alertDialog, long j) throws NumberFormatException {
        if (j != 0) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("scrollToTopOnResume", true);
            if (!AndroidUtilities.isTablet()) {
                NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
            }
            if (DialogObject.isUserDialog(j)) {
                bundle.putLong("user_id", j);
            } else {
                bundle.putLong("chat_id", -j);
            }
            ChatActivity chatActivity = new ChatActivity(bundle);
            chatActivity.setOpenImport();
            getActionBarLayout().presentFragment(chatActivity, dialogsActivity != null || z, dialogsActivity == null, true, false);
        } else {
            this.documentsUrisArray = arrayList;
            if (arrayList == null) {
                this.documentsUrisArray = new ArrayList();
            }
            this.documentsUrisArray.add(0, uri);
            openDialogsToSend(true);
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$didSelectDialogs$143(ChatActivity chatActivity, ArrayList arrayList, int i, int i2, CharSequence charSequence, int i3, boolean z, TLRPC.User user, boolean z2, int i4, long j, boolean z3, long j2) {
        MessageObject messageObject;
        TLRPC.TL_forumTopic tL_forumTopicFindTopic;
        if (chatActivity != null) {
            getActionBarLayout().presentFragment(chatActivity, true, false, true, false);
        }
        AccountInstance accountInstance = AccountInstance.getInstance(UserConfig.selectedAccount);
        for (int i5 = 0; i5 < arrayList.size(); i5++) {
            long j3 = ((MessagesStorage.TopicKey) arrayList.get(i5)).dialogId;
            long j4 = ((MessagesStorage.TopicKey) arrayList.get(i5)).topicId;
            if (j4 == 0 || (tL_forumTopicFindTopic = accountInstance.getMessagesController().getTopicsController().findTopic(-j3, j4)) == null || tL_forumTopicFindTopic.topicStartMessage == null) {
                messageObject = null;
            } else {
                MessageObject messageObject2 = new MessageObject(accountInstance.getCurrentAccount(), tL_forumTopicFindTopic.topicStartMessage, false, false);
                messageObject2.isTopicMainMessage = true;
                messageObject = messageObject2;
            }
            SendMessagesHelper.SendMessageParams sendMessageParamsOf = SendMessagesHelper.SendMessageParams.of(user, j3, messageObject, messageObject, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z2, i4 != 0 ? i4 : i, i2);
            if (TextUtils.isEmpty(charSequence)) {
                sendMessageParamsOf.effect_id = j;
            }
            sendMessageParamsOf.invert_media = z3;
            SendMessagesHelper.getInstance(i3).sendMessage(sendMessageParamsOf);
            if (!TextUtils.isEmpty(charSequence)) {
                SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j3, z, i4 != 0 ? i4 : i, i2, j);
            }
        }
    }

    private static void sendShareText(AccountInstance accountInstance, DialogsActivity dialogsActivity, CharSequence charSequence, long j, MessageObject messageObject, long j2, boolean z, int i, int i2) {
        boolean z2 = dialogsActivity == null || dialogsActivity.isWebPagePreviewEnabled();
        TLRPC.WebPage sharedWebPage = (!z2 || dialogsActivity == null) ? null : dialogsActivity.getSharedWebPage();
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        if (sharedWebPage == null && z2) {
            SendMessagesHelper.prepareSendingText(accountInstance, charSequence, j, j2, z, i, i2, 0L);
            return;
        }
        CharSequence trimmedString = SendMessagesHelper.getTrimmedString(charSequence);
        if (trimmedString == null || trimmedString.length() == 0) {
            return;
        }
        CharSequence[] charSequenceArr = {trimmedString};
        accountInstance.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of(charSequenceArr[0].toString(), j, messageObject, messageObject, sharedWebPage, z2, accountInstance.getMediaDataController().getEntities(charSequenceArr, true), null, null, z, i, i2, null, false));
    }

    private static ArrayList buildSendingInfosFromEntries(ArrayList arrayList) {
        String str;
        ArrayList arrayList2 = new ArrayList();
        if (arrayList == null) {
            return arrayList2;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) it.next();
            SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
            boolean z = photoEntry.isVideo;
            if (!z && (str = photoEntry.imagePath) != null) {
                sendingMediaInfo.path = str;
            } else {
                String str2 = photoEntry.path;
                if (str2 != null) {
                    sendingMediaInfo.path = str2;
                }
            }
            sendingMediaInfo.thumbPath = photoEntry.thumbPath;
            sendingMediaInfo.coverPath = photoEntry.coverPath;
            sendingMediaInfo.isVideo = z;
            sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
            sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
            sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
            sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
            CharSequence charSequence = photoEntry.caption;
            sendingMediaInfo.caption = charSequence != null ? charSequence.toString() : null;
            sendingMediaInfo.entities = photoEntry.entities;
            sendingMediaInfo.masks = photoEntry.stickers;
            sendingMediaInfo.ttl = photoEntry.ttl;
            sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
            sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
            sendingMediaInfo.highQuality = photoEntry.isHighQuality();
            arrayList2.add(sendingMediaInfo);
        }
        return arrayList2;
    }

    private void onFinish() {
        Runnable runnable = this.lockRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.lockRunnable = null;
        }
        if (this.finished) {
            return;
        }
        this.finished = true;
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
        Utilities.Callback callback = this.onPowerSaverCallback;
        if (callback != null) {
            LiteMode.removeOnPowerSaverAppliedListener(callback);
        }
    }

    public void onPowerSaver(boolean z) {
        BaseFragment lastFragment;
        if (this.actionBarLayout == null || !z || LiteMode.getPowerSaverLevel() >= 100 || (lastFragment = this.actionBarLayout.getLastFragment()) == null || (lastFragment instanceof LiteModeSettingsActivity)) {
            return;
        }
        int batteryLevel = LiteMode.getBatteryLevel();
        BulletinFactory.of(lastFragment).createSimpleBulletin(new BatteryDrawable(batteryLevel / 100.0f, -1, lastFragment.getThemedColor(Theme.key_dialogSwipeRemove), 1.3f), LocaleController.getString(R.string.LowPowerEnabledTitle), LocaleController.formatString("LowPowerEnabledSubtitle", R.string.LowPowerEnabledSubtitle, String.format("%d%%", Integer.valueOf(batteryLevel))), LocaleController.getString(R.string.Disable), new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onPowerSaver$144();
            }
        }).setDuration(5000).show();
    }

    public void lambda$onPowerSaver$144() {
        lambda$runLinkRequest$100(new LiteModeSettingsActivity());
    }

    public void lambda$runLinkRequest$100(BaseFragment baseFragment) {
        getActionBarLayout().presentFragment(baseFragment);
    }

    public boolean presentFragment(BaseFragment baseFragment, boolean z, boolean z2) {
        return getActionBarLayout().presentFragment(baseFragment, z, z2, true, false);
    }

    public INavigationLayout getActionBarLayout() {
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (this.sheetFragmentsStack.isEmpty()) {
            return actionBarLayout;
        }
        return (INavigationLayout) this.sheetFragmentsStack.get(r0.size() - 1);
    }

    public INavigationLayout getLayersActionBarLayout() {
        return this.layersActionBarLayout;
    }

    public INavigationLayout getRightActionBarLayout() {
        return this.rightActionBarLayout;
    }

    @Override
    protected void onActivityResult(int i, int i2, Intent intent) throws InterruptedException {
        VoIPService sharedInstance;
        if (SharedConfig.passcodeHash.length() != 0 && SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onActivityResult");
            }
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        if (i == 105) {
            if (Build.VERSION.SDK_INT >= 23) {
                boolean zCanDrawOverlays = Settings.canDrawOverlays(this);
                ApplicationLoader.canDrawOverlays = zCanDrawOverlays;
                if (zCanDrawOverlays) {
                    GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
                    if (groupCallActivity != null) {
                        groupCallActivity.dismissInternal();
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$onActivityResult$145();
                        }
                    }, 200L);
                    return;
                }
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == 520) {
            if (i2 != -1 || (sharedInstance = VoIPService.getSharedInstance()) == null) {
                return;
            }
            VideoCapturerDevice.mediaProjectionPermissionResultData = intent;
            sharedInstance.createCaptureDevice(true);
            return;
        }
        if (i == 140) {
            LocationController.getInstance(this.currentAccount).startFusedLocationRequest(i2 == -1);
            return;
        }
        if (i == 521) {
            Utilities.Callback callback = this.webviewShareAPIDoneListener;
            if (callback != null) {
                callback.run(Boolean.valueOf(i2 == -1));
                this.webviewShareAPIDoneListener = null;
                return;
            }
            return;
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.onActivityResult(i, i2, intent);
        }
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getFragmentStack().size() != 0) {
            BaseFragment baseFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
            baseFragment.onActivityResultFragment(i, i2, intent);
            if (baseFragment.getLastStoryViewer() != null) {
                baseFragment.getLastStoryViewer().onActivityResult(i, i2, intent);
            }
        }
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
            if (actionBarLayout2 != null && actionBarLayout2.getFragmentStack().size() != 0) {
                this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
            ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
            if (actionBarLayout3 != null && actionBarLayout3.getFragmentStack().size() != 0) {
                this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1).onActivityResultFragment(i, i2, intent);
            }
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onActivityResultReceived, Integer.valueOf(i), Integer.valueOf(i2), intent);
    }

    public void lambda$onActivityResult$145() {
        GroupCallPip.clearForce();
        GroupCallPip.updateVisibility(this);
    }

    public void whenWebviewShareAPIDone(Utilities.Callback callback) {
        this.webviewShareAPIDoneListener = callback;
    }

    @Override
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Resources.NotFoundException {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (checkPermissionsResult(i, strArr, iArr)) {
            ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
            if (applicationLoader == null || !applicationLoader.checkRequestPermissionResult(i, strArr, iArr)) {
                if (this.actionBarLayout.getFragmentStack().size() != 0) {
                    this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                }
                if (AndroidUtilities.isTablet()) {
                    if (this.rightActionBarLayout.getFragmentStack().size() != 0) {
                        this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                    }
                    if (this.layersActionBarLayout.getFragmentStack().size() != 0) {
                        this.layersActionBarLayout.getFragmentStack().get(this.layersActionBarLayout.getFragmentStack().size() - 1).onRequestPermissionsResultFragment(i, strArr, iArr);
                    }
                }
                VoIPFragment.onRequestPermissionsResult(i, strArr, iArr);
                StoryRecorder.onRequestPermissionsResult(i, strArr, iArr);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.onRequestPermissionResultReceived, Integer.valueOf(i), strArr, iArr);
                if (this.requestedPermissions.get(i, -1) >= 0) {
                    int i2 = this.requestedPermissions.get(i, -1);
                    this.requestedPermissions.delete(i);
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.permissionsGranted, Integer.valueOf(i2));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.activityPermissionsGranted, Integer.valueOf(i), strArr, iArr);
            }
        }
    }

    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        this.voipLaunchedInBackground = false;
    }

    @Override
    protected void onPause() throws NumberFormatException {
        super.onPause();
        isResumed = false;
        this.pipActivityHandler.onPause();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 4096);
        ApplicationLoader.mainInterfacePaused = true;
        final int i = this.currentAccount;
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$onPause$146(i);
            }
        });
        onPasscodePause();
        this.actionBarLayout.onPause();
        if (AndroidUtilities.isTablet()) {
            ActionBarLayout actionBarLayout = this.rightActionBarLayout;
            if (actionBarLayout != null) {
                actionBarLayout.onPause();
            }
            ActionBarLayout actionBarLayout2 = this.layersActionBarLayout;
            if (actionBarLayout2 != null) {
                actionBarLayout2.onPause();
            }
        }
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog != null) {
            passcodeViewDialog.passcodeView.onPause();
        }
        Iterator it = this.overlayPasscodeViews.iterator();
        while (it.hasNext()) {
            ((PasscodeView) it.next()).onPause();
        }
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(!(ApplicationLoader.applicationLoaderInstance != null ? r1.onPause() : false), false);
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().onPause();
        }
        StoryRecorder.onPause();
        if (VoIPFragment.getInstance() != null) {
            VoIPFragment.onPause();
        }
        SpoilerEffect2.pause(true);
    }

    public static void lambda$onPause$146(int i) {
        ApplicationLoader.mainInterfacePausedStageQueue = true;
        ApplicationLoader.mainInterfacePausedStageQueueTime = 0L;
        if (VoIPService.getSharedInstance() == null) {
            MessagesController.getInstance(i).ignoreSetOnline = false;
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        this.isStarted = true;
        this.pipActivityHandler.onStart();
        Browser.bindCustomTabsService(this);
        ApplicationLoader.mainInterfaceStopped = false;
        GroupCallPip.updateVisibility(this);
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.onResume();
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.isStarted = false;
        this.pipActivityHandler.onStop();
        Browser.unbindCustomTabsService(this);
        ApplicationLoader.mainInterfaceStopped = true;
        GroupCallPip.updateVisibility(this);
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.onPause();
        }
    }

    @Override
    public boolean onPictureInPictureRequested() {
        this.pipActivityHandler.onPictureInPictureRequested();
        return super.onPictureInPictureRequested();
    }

    @Override
    public void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams) {
        super.setPictureInPictureParams(pictureInPictureParams);
        this.pipActivityHandler.setPictureInPictureParams(pictureInPictureParams);
    }

    @Override
    public void onPictureInPictureModeChanged(boolean z, Configuration configuration) throws NumberFormatException {
        super.onPictureInPictureModeChanged(z, configuration);
        this.pipActivityHandler.onPictureInPictureModeChanged(z, configuration);
        if (z || this.isStarted) {
            return;
        }
        if (RTMPStreamPipOverlay.isVisible()) {
            RTMPStreamPipOverlay.dismiss();
        }
        if (LiveStoryPipOverlay.isVisible()) {
            LiveStoryPipOverlay.dismiss();
        }
        if (PipVideoOverlay.isVisible()) {
            PipVideoOverlay.dismiss();
        }
        GroupCallActivity.onLeaveClick(this, null, false, true);
        if (PhotoViewer.getPipInstance() != null) {
            PhotoViewer.getPipInstance().destroyPhotoViewer();
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().closePhoto(false, false);
        }
    }

    @Override
    protected void onDestroy() {
        FrameMetricsOverlayView frameMetricsOverlayView;
        isActive = false;
        activeInstanceCount--;
        unregisterReceiver(this.batteryReceiver);
        if (activeInstanceCount == 0) {
            onDestroyStaticResources();
        }
        MediaController.getInstance().setBaseActivity(this, false);
        MediaController.getInstance().setFeedbackView(this.feedbackView, false);
        for (int i = 0; i < this.visibleDialogs.size(); i++) {
            try {
                if (((Dialog) this.visibleDialogs.get(i)).isShowing()) {
                    ((Dialog) this.visibleDialogs.get(i)).dismiss();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.visibleDialogs.clear();
        try {
            if (this.onGlobalLayoutListener != null) {
                getWindow().getDecorView().getRootView().getViewTreeObserver().removeOnGlobalLayoutListener(this.onGlobalLayoutListener);
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            if (LaunchActivity$$ExternalSyntheticApiModelOutline4.m(this.onBackAnimationCallback)) {
                getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(LaunchActivity$$ExternalSyntheticApiModelOutline3.m(this.onBackAnimationCallback));
            }
        } else if (i2 >= 33 && LaunchActivity$$ExternalSyntheticApiModelOutline5.m(this.onBackAnimationCallback)) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticApiModelOutline0.m(this.onBackInvokedCallback));
        }
        Bulletin.removeDelegate(this.frameLayout);
        VideoAds.dropCache();
        clearFragments();
        super.onDestroy();
        onFinish();
        FlagSecureReason flagSecureReason = this.flagSecureReason;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (i2 < 24 || (frameMetricsOverlayView = this.frameMetricsOverlayView) == null) {
            return;
        }
        frameMetricsOverlayView.detach();
    }

    private static void onDestroyStaticResources() {
        if (PhotoViewer.getPipInstance() != null) {
            PhotoViewer.getPipInstance().destroyPhotoViewer();
        }
        if (PhotoViewer.hasInstance()) {
            PhotoViewer.getInstance().destroyPhotoViewer();
        }
        if (SecretMediaViewer.hasInstance()) {
            SecretMediaViewer.getInstance().destroyPhotoViewer();
        }
        if (ArticleViewer.hasInstance()) {
            ArticleViewer.getInstance().destroyArticleViewer();
        }
        if (ContentPreviewViewer.hasInstance()) {
            ContentPreviewViewer.getInstance().destroy();
        }
        GroupCallActivity groupCallActivity = GroupCallActivity.groupCallInstance;
        if (groupCallActivity != null) {
            groupCallActivity.dismissInternal();
        }
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.getInstance();
        if (pipRoundVideoView != null) {
            pipRoundVideoView.close(false);
        }
        Theme.destroyResources();
        EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.getInstance();
        if (embedBottomSheet != null) {
            embedBottomSheet.destroy();
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.destroy();
        }
        FloatingDebugController.onDestroy();
    }

    @Override
    protected void onUserLeaveHint() {
        this.pipActivityHandler.onUserLeaveHint();
        Iterator it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.onUserLeaveHint();
        }
    }

    @Override
    protected void onResume() throws Resources.NotFoundException {
        MessageObject playingMessageObject;
        super.onResume();
        isResumed = true;
        this.pipActivityHandler.onResume();
        Runnable runnable = onResumeStaticCallback;
        if (runnable != null) {
            runnable.run();
            onResumeStaticCallback = null;
        }
        if (Theme.selectedAutoNightType == 3) {
            Theme.checkAutoNightThemeConditions();
        }
        checkWasMutedByAdmin(true);
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 4096);
        MediaController mediaController = MediaController.getInstance();
        ViewGroup view = this.actionBarLayout.getView();
        this.feedbackView = view;
        mediaController.setFeedbackView(view, true);
        ApplicationLoader.mainInterfacePaused = false;
        MessagesController.getInstance(this.currentAccount).sortDialogs(null);
        showLanguageAlert(false);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$onResume$147();
            }
        });
        checkFreeDiscSpace(0);
        MediaController.checkGallery();
        onPasscodeResume();
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog == null || passcodeViewDialog.passcodeView.getVisibility() != 0) {
            this.actionBarLayout.onResume();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.rightActionBarLayout;
                if (actionBarLayout != null) {
                    actionBarLayout.onResume();
                }
                ActionBarLayout actionBarLayout2 = this.layersActionBarLayout;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.onResume();
                }
            }
        } else {
            this.actionBarLayout.dismissDialogs();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout3 = this.rightActionBarLayout;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.dismissDialogs();
                }
                ActionBarLayout actionBarLayout4 = this.layersActionBarLayout;
                if (actionBarLayout4 != null) {
                    actionBarLayout4.dismissDialogs();
                }
            }
            this.passcodeDialog.passcodeView.onResume();
            Iterator it = this.overlayPasscodeViews.iterator();
            while (it.hasNext()) {
                ((PasscodeView) it.next()).onResume();
            }
        }
        ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        updateCurrentConnectionState(this.currentAccount);
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().onResume();
        }
        StoryRecorder.onResume();
        if (PipRoundVideoView.getInstance() != null && MediaController.getInstance().isMessagePaused() && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null) {
            MediaController.getInstance().seekToProgress(playingMessageObject, playingMessageObject.audioProgress);
        }
        if (UserConfig.getInstance(UserConfig.selectedAccount).unacceptedTermsOfService != null) {
            int i = UserConfig.selectedAccount;
            showTosActivity(i, UserConfig.getInstance(i).unacceptedTermsOfService);
        } else {
            TLRPC.TL_help_appUpdate tL_help_appUpdate = SharedConfig.pendingAppUpdate;
            if (tL_help_appUpdate != null && tL_help_appUpdate.can_not_skip) {
                showUpdateActivity(UserConfig.selectedAccount, SharedConfig.pendingAppUpdate, true);
            }
        }
        checkAppUpdate(false, null);
        if (Build.VERSION.SDK_INT >= 23) {
            ApplicationLoader.canDrawOverlays = Settings.canDrawOverlays(this);
        }
        if (VoIPFragment.getInstance() != null) {
            VoIPFragment.onResume();
        }
        invalidateTabletMode();
        SpoilerEffect2.pause(false);
        ApplicationLoader applicationLoader = ApplicationLoader.applicationLoaderInstance;
        if (applicationLoader != null) {
            applicationLoader.onResume();
        }
        Runnable runnable2 = whenResumed;
        if (runnable2 != null) {
            runnable2.run();
            whenResumed = null;
        }
        if (MessagesController.getInstance(this.currentAccount).hasSetupEmailSuggestion()) {
            MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        }
    }

    public static void lambda$onResume$147() {
        ApplicationLoader.mainInterfacePausedStageQueue = false;
        ApplicationLoader.mainInterfacePausedStageQueueTime = System.currentTimeMillis();
    }

    private void invalidateTabletMode() {
        long topicId;
        Boolean wasTablet = AndroidUtilities.getWasTablet();
        if (wasTablet == null) {
            return;
        }
        AndroidUtilities.resetWasTabletFlag();
        if (wasTablet.booleanValue() != AndroidUtilities.isTablet()) {
            long j = 0;
            if (wasTablet.booleanValue()) {
                this.mainFragmentsStack.addAll(this.rightFragmentsStack);
                this.mainFragmentsStack.addAll(this.layerFragmentsStack);
                this.rightFragmentsStack.clear();
                this.layerFragmentsStack.clear();
                topicId = 0;
            } else {
                ArrayList<BaseFragment> arrayList = new ArrayList(this.mainFragmentsStack);
                this.mainFragmentsStack.clear();
                this.rightFragmentsStack.clear();
                this.layerFragmentsStack.clear();
                long dialogId = 0;
                topicId = 0;
                for (BaseFragment baseFragment : arrayList) {
                    if (!(baseFragment instanceof MainTabsActivity)) {
                        if (baseFragment instanceof DialogsActivity) {
                            DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                            if (!dialogsActivity.isMainDialogList() || dialogsActivity.isArchive()) {
                            }
                        }
                        if (baseFragment instanceof ChatActivity) {
                            ChatActivity chatActivity = (ChatActivity) baseFragment;
                            if (!chatActivity.isInScheduleMode()) {
                                this.rightFragmentsStack.add(baseFragment);
                                if (dialogId == 0) {
                                    dialogId = chatActivity.getDialogId();
                                    topicId = chatActivity.getTopicId();
                                }
                            }
                        }
                        this.layerFragmentsStack.add(baseFragment);
                    }
                    this.mainFragmentsStack.add(baseFragment);
                }
                j = dialogId;
            }
            setupActionBarLayout();
            this.actionBarLayout.rebuildFragments(1);
            if (AndroidUtilities.isTablet()) {
                this.rightActionBarLayout.rebuildFragments(1);
                this.layersActionBarLayout.rebuildFragments(1);
                Iterator it = this.mainFragmentsStack.iterator();
                while (it.hasNext()) {
                    Object dialogsActivity2 = (BaseFragment) it.next();
                    if (dialogsActivity2 instanceof MainTabsActivity) {
                        dialogsActivity2 = ((MainTabsActivity) dialogsActivity2).getDialogsActivity();
                    }
                    if (dialogsActivity2 instanceof DialogsActivity) {
                        DialogsActivity dialogsActivity3 = (DialogsActivity) dialogsActivity2;
                        if (dialogsActivity3.isMainDialogList()) {
                            dialogsActivity3.setOpenedDialogId(j, topicId);
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        AndroidUtilities.checkDisplaySize(this, configuration);
        AndroidUtilities.setPreferredMaxRefreshRate(getWindow());
        super.onConfigurationChanged(configuration);
        this.pipActivityHandler.onConfigurationChanged(configuration);
        AndroidUtilities.resetTabletFlag();
        invalidateTabletMode();
        checkLayout();
        PipRoundVideoView pipRoundVideoView = PipRoundVideoView.getInstance();
        if (pipRoundVideoView != null) {
            pipRoundVideoView.onConfigurationChanged();
        }
        EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.getInstance();
        if (embedBottomSheet != null) {
            embedBottomSheet.onConfigurationChanged(configuration);
        }
        BoostPagerBottomSheet boostPagerBottomSheet = BoostPagerBottomSheet.getInstance();
        if (boostPagerBottomSheet != null) {
            boostPagerBottomSheet.onConfigurationChanged(configuration);
        }
        PhotoViewer pipInstance = PhotoViewer.getPipInstance();
        if (pipInstance != null) {
            pipInstance.onConfigurationChanged(configuration);
        }
        ThemeEditorView themeEditorView = ThemeEditorView.getInstance();
        if (themeEditorView != null) {
            themeEditorView.onConfigurationChanged();
        }
        if (Theme.selectedAutoNightType == 3) {
            Theme.checkAutoNightThemeConditions();
        }
    }

    @Override
    public void onMultiWindowModeChanged(boolean z) {
        AndroidUtilities.isInMultiwindow = z;
        checkLayout();
        super.onMultiWindowModeChanged(z);
    }

    @Override
    public void didReceivedNotification(int r21, final int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.didReceivedNotification(int, int, java.lang.Object[]):void");
    }

    public void lambda$didReceivedNotification$148(int i, AlertDialog alertDialog, int i2) {
        if (this.mainFragmentsStack.isEmpty()) {
            return;
        }
        MessagesController messagesController = MessagesController.getInstance(i);
        ArrayList arrayList = this.mainFragmentsStack;
        messagesController.openByUserName("spambot", (BaseFragment) arrayList.get(arrayList.size() - 1), 1);
    }

    public void lambda$didReceivedNotification$149(AlertDialog alertDialog, int i) {
        MessagesController.getInstance(this.currentAccount).performLogout(2);
    }

    public void lambda$didReceivedNotification$151(final HashMap map, final int i, AlertDialog alertDialog, int i2) {
        if (this.mainFragmentsStack.isEmpty()) {
            return;
        }
        if (AndroidUtilities.isMapsInstalled((BaseFragment) this.mainFragmentsStack.get(r3.size() - 1))) {
            LocationActivity locationActivity = new LocationActivity(0);
            locationActivity.setDelegate(new LocationActivity.LocationActivityDelegate() {
                @Override
                public final void didSelectLocation(TLRPC.MessageMedia messageMedia, int i3, boolean z, int i4, long j) {
                    LaunchActivity.lambda$didReceivedNotification$150(map, i, messageMedia, i3, z, i4, j);
                }
            });
            lambda$runLinkRequest$100(locationActivity);
        }
    }

    public static void lambda$didReceivedNotification$150(HashMap map, int i, TLRPC.MessageMedia messageMedia, int i2, boolean z, int i3, long j) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            MessageObject messageObject = (MessageObject) ((Map.Entry) it.next()).getValue();
            SendMessagesHelper.getInstance(i).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, messageObject.getDialogId(), messageObject, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z, i3, 0));
        }
    }

    public static void lambda$didReceivedNotification$152(int i, HashMap map, boolean z, boolean z2, AlertDialog alertDialog, int i2) {
        ContactsController.getInstance(i).syncPhoneBookByAlert(map, z, z2, false);
    }

    public static void lambda$didReceivedNotification$153(int i, HashMap map, boolean z, boolean z2, AlertDialog alertDialog, int i2) {
        ContactsController.getInstance(i).syncPhoneBookByAlert(map, z, z2, true);
    }

    public static void lambda$didReceivedNotification$154(int i, HashMap map, boolean z, boolean z2, AlertDialog alertDialog, int i2) {
        ContactsController.getInstance(i).syncPhoneBookByAlert(map, z, z2, true);
    }

    public void lambda$didReceivedNotification$155(ValueAnimator valueAnimator) {
        this.frameLayout.invalidate();
    }

    public void lambda$didReceivedNotification$156() {
        if (this.isNavigationBarColorFrozen) {
            this.isNavigationBarColorFrozen = false;
            checkSystemBarColors(false, true);
        }
    }

    public void lambda$didReceivedNotification$158(final Theme.ThemeInfo themeInfo, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$157(tLObject, themeInfo);
            }
        });
    }

    public void lambda$didReceivedNotification$157(TLObject tLObject, Theme.ThemeInfo themeInfo) {
        if (tLObject instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) tLObject;
            this.loadingThemeInfo = themeInfo;
            this.loadingThemeWallpaperName = FileLoader.getAttachFileName(tL_wallPaper.document);
            this.loadingThemeWallpaper = tL_wallPaper;
            FileLoader.getInstance(themeInfo.account).loadFile(tL_wallPaper.document, tL_wallPaper, 1, 1);
            return;
        }
        onThemeLoadFinish();
    }

    public void lambda$didReceivedNotification$160(Theme.ThemeInfo themeInfo, File file) {
        themeInfo.createBackground(file, themeInfo.pathToWallpaper);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$159();
            }
        });
    }

    public void lambda$didReceivedNotification$159() {
        if (this.loadingTheme == null) {
            return;
        }
        File file = new File(ApplicationLoader.getFilesDirFixed(), "remote" + this.loadingTheme.id + ".attheme");
        TLRPC.TL_theme tL_theme = this.loadingTheme;
        Theme.ThemeInfo themeInfoApplyThemeFile = Theme.applyThemeFile(file, tL_theme.title, tL_theme, true);
        if (themeInfoApplyThemeFile != null) {
            lambda$runLinkRequest$100(new ThemePreviewActivity(themeInfoApplyThemeFile, true, 0, false, false));
        }
        onThemeLoadFinish();
    }

    public void lambda$didReceivedNotification$163(DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$162();
            }
        }, 30000L);
    }

    public void lambda$didReceivedNotification$162() {
        this.tlErrorAlertDialog = null;
    }

    public void lambda$didReceivedNotification$165(DialogInterface dialogInterface) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$didReceivedNotification$164();
            }
        }, 30000L);
    }

    public void lambda$didReceivedNotification$164() {
        this.memoryLeakErrorAlertDialog = null;
    }

    public void lambda$didReceivedNotification$166(Bulletin bulletin) {
        if (this.finished || !isResumed) {
            return;
        }
        bulletin.show();
    }

    private void invalidateCachedViews(View view) {
        if (view.getLayerType() != 0) {
            view.invalidate();
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                invalidateCachedViews(viewGroup.getChildAt(i));
            }
        }
    }

    private void checkWasMutedByAdmin(boolean z) {
        ChatObject.Call call;
        long j;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        boolean z2 = false;
        if (sharedInstance != null && (call = sharedInstance.groupCall) != null) {
            boolean z3 = this.wasMutedByAdminRaisedHand;
            TLRPC.InputPeer groupCallPeer = sharedInstance.getGroupCallPeer();
            if (groupCallPeer != null) {
                j = groupCallPeer.user_id;
                if (j == 0) {
                    long j2 = groupCallPeer.chat_id;
                    if (j2 == 0) {
                        j2 = groupCallPeer.channel_id;
                    }
                    j = -j2;
                }
            } else {
                j = UserConfig.getInstance(this.currentAccount).clientUserId;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) call.participants.get(j);
            boolean z4 = (groupCallParticipant == null || groupCallParticipant.can_self_unmute || !groupCallParticipant.muted) ? false : true;
            if (z4 && groupCallParticipant.raise_hand_rating != 0) {
                z2 = true;
            }
            this.wasMutedByAdminRaisedHand = z2;
            if (z || !z3 || z2 || z4 || GroupCallActivity.groupCallInstance != null) {
                return;
            }
            showVoiceChatTooltip(38);
            return;
        }
        this.wasMutedByAdminRaisedHand = false;
    }

    private void showVoiceChatTooltip(int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || this.mainFragmentsStack.isEmpty() || sharedInstance.groupCall == null) {
            return;
        }
        TLRPC.Chat chat = sharedInstance.getChat();
        BaseFragment currentVisibleFragment = this.actionBarLayout.getFragmentStack().get(this.actionBarLayout.getFragmentStack().size() - 1);
        if (currentVisibleFragment instanceof MainTabsActivity) {
            currentVisibleFragment = ((MainTabsActivity) currentVisibleFragment).getCurrentVisibleFragment();
        }
        UndoView undoView = null;
        if (currentVisibleFragment instanceof ChatActivity) {
            ChatActivity chatActivity = (ChatActivity) currentVisibleFragment;
            if (chatActivity.getDialogId() == (-chat.id)) {
                chat = null;
            }
            undoView = chatActivity.getUndoView();
        } else if (currentVisibleFragment instanceof DialogsActivity) {
            undoView = ((DialogsActivity) currentVisibleFragment).getUndoView();
        } else if (currentVisibleFragment instanceof ProfileActivity) {
            undoView = ((ProfileActivity) currentVisibleFragment).getUndoView();
        }
        if (undoView != null) {
            undoView.showWithAction(0L, i, chat);
        }
        if (i != 38 || VoIPService.getSharedInstance() == null) {
            return;
        }
        VoIPService.getSharedInstance().playAllowTalkSound();
    }

    private String getStringForLanguageAlert(HashMap map, String str, int i) {
        String str2 = (String) map.get(str);
        return str2 == null ? LocaleController.getString(str, i) : str2;
    }

    private void openThemeAccentPreview(TLRPC.TL_theme tL_theme, TLRPC.TL_wallPaper tL_wallPaper, Theme.ThemeInfo themeInfo) {
        int i = themeInfo.lastAccentId;
        Theme.ThemeAccent themeAccentCreateNewAccent = themeInfo.createNewAccent(tL_theme, this.currentAccount);
        themeInfo.prevAccentId = themeInfo.currentAccentId;
        themeInfo.setCurrentAccentId(themeAccentCreateNewAccent.id);
        themeAccentCreateNewAccent.pattern = tL_wallPaper;
        lambda$runLinkRequest$100(new ThemePreviewActivity(themeInfo, i != themeInfo.lastAccentId, 0, false, false));
    }

    private void onThemeLoadFinish() {
        AlertDialog alertDialog = this.loadingThemeProgressDialog;
        if (alertDialog != null) {
            try {
                alertDialog.dismiss();
            } finally {
                this.loadingThemeProgressDialog = null;
            }
        }
        this.loadingThemeWallpaperName = null;
        this.loadingThemeWallpaper = null;
        this.loadingThemeInfo = null;
        this.loadingThemeFileName = null;
        this.loadingTheme = null;
    }

    private void checkFreeDiscSpace(final int i) {
        staticInstanceForAlerts = this;
        AutoDeleteMediaTask.run();
        SharedConfig.checkLogsToDelete();
        if ((Build.VERSION.SDK_INT < 26 || i != 0) && !this.checkFreeDiscSpaceShown) {
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$checkFreeDiscSpace$169(i);
                }
            }, 2000L);
        }
    }

    public void lambda$checkFreeDiscSpace$169(int i) {
        File directory;
        if (UserConfig.getInstance(this.currentAccount).isClientActivated()) {
            try {
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if ((((i == 2 || i == 1) && Math.abs(this.alreadyShownFreeDiscSpaceAlertForced - System.currentTimeMillis()) > 240000) || Math.abs(globalMainSettings.getLong("last_space_check", 0L) - System.currentTimeMillis()) >= 259200000) && (directory = FileLoader.getDirectory(4)) != null) {
                    StatFs statFs = new StatFs(directory.getAbsolutePath());
                    long availableBlocksLong = statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
                    if (i > 0 || availableBlocksLong < 52428800) {
                        if (i > 0) {
                            this.alreadyShownFreeDiscSpaceAlertForced = System.currentTimeMillis();
                        }
                        globalMainSettings.edit().putLong("last_space_check", System.currentTimeMillis()).commit();
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$checkFreeDiscSpace$168();
                            }
                        });
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lambda$checkFreeDiscSpace$168() {
        if (this.checkFreeDiscSpaceShown) {
            return;
        }
        try {
            Dialog dialogCreateFreeSpaceDialog = AlertsCreator.createFreeSpaceDialog(this);
            dialogCreateFreeSpaceDialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f$0.lambda$checkFreeDiscSpace$167(dialogInterface);
                }
            });
            this.checkFreeDiscSpaceShown = true;
            dialogCreateFreeSpaceDialog.show();
        } catch (Throwable unused) {
        }
    }

    public void lambda$checkFreeDiscSpace$167(DialogInterface dialogInterface) {
        this.checkFreeDiscSpaceShown = false;
    }

    public static void checkFreeDiscSpaceStatic(int i) {
        LaunchActivity launchActivity = staticInstanceForAlerts;
        if (launchActivity != null) {
            launchActivity.checkFreeDiscSpace(i);
        }
    }

    private void showLanguageAlertInternal(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, String str) {
        try {
            this.loadingLocaleDialog = false;
            LocaleController.LocaleInfo localeInfo3 = localeInfo;
            boolean z = localeInfo3.builtIn || LocaleController.getInstance().isCurrentLocalLocale();
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            HashMap map = this.systemLocaleStrings;
            int i = R.string.ChooseYourLanguage;
            builder.setTitle(getStringForLanguageAlert(map, "ChooseYourLanguage", i));
            builder.setSubtitle(getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguage", i));
            LinearLayout linearLayout = new LinearLayout(this);
            linearLayout.setOrientation(1);
            final LanguageCell[] languageCellArr = new LanguageCell[2];
            String stringForLanguageAlert = getStringForLanguageAlert(this.systemLocaleStrings, "English", R.string.English);
            LocaleController.LocaleInfo[] localeInfoArr = {z ? localeInfo3 : localeInfo2, z ? localeInfo2 : localeInfo3};
            if (!z) {
                localeInfo3 = localeInfo2;
            }
            final LocaleController.LocaleInfo[] localeInfoArr2 = {localeInfo3};
            int i2 = 0;
            while (i2 < 2) {
                LanguageCell languageCell = new LanguageCell(this);
                languageCellArr[i2] = languageCell;
                LocaleController.LocaleInfo localeInfo4 = localeInfoArr[i2];
                languageCell.setLanguage(localeInfo4, localeInfo4 == localeInfo2 ? stringForLanguageAlert : null, true);
                languageCellArr[i2].setTag(Integer.valueOf(i2));
                languageCellArr[i2].setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
                languageCellArr[i2].setLanguageSelected(i2 == 0, false);
                linearLayout.addView(languageCellArr[i2], LayoutHelper.createLinear(-1, 50));
                languageCellArr[i2].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LaunchActivity.lambda$showLanguageAlertInternal$170(localeInfoArr2, languageCellArr, view);
                    }
                });
                i2++;
            }
            LanguageCell languageCell2 = new LanguageCell(this);
            HashMap map2 = this.systemLocaleStrings;
            int i3 = R.string.ChooseYourLanguageOther;
            languageCell2.setValue(getStringForLanguageAlert(map2, "ChooseYourLanguageOther", i3), getStringForLanguageAlert(this.englishLocaleStrings, "ChooseYourLanguageOther", i3));
            languageCell2.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_dialogButtonSelector), 2));
            languageCell2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$showLanguageAlertInternal$171(view);
                }
            });
            linearLayout.addView(languageCell2, LayoutHelper.createLinear(-1, 50));
            builder.setView(linearLayout);
            builder.setNegativeButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    this.f$0.lambda$showLanguageAlertInternal$172(localeInfoArr2, alertDialog, i4);
                }
            });
            this.localeDialog = showAlertDialog(builder);
            MessagesController.getGlobalMainSettings().edit().putString("language_showed2", str).commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void lambda$showLanguageAlertInternal$170(LocaleController.LocaleInfo[] localeInfoArr, LanguageCell[] languageCellArr, View view) {
        Integer num = (Integer) view.getTag();
        localeInfoArr[0] = ((LanguageCell) view).getCurrentLocale();
        int i = 0;
        while (i < languageCellArr.length) {
            languageCellArr[i].setLanguageSelected(i == num.intValue(), true);
            i++;
        }
    }

    public void lambda$showLanguageAlertInternal$171(View view) {
        this.localeDialog = null;
        lambda$runLinkRequest$100(new LanguageSelectActivity());
        for (int i = 0; i < this.visibleDialogs.size(); i++) {
            if (((Dialog) this.visibleDialogs.get(i)).isShowing()) {
                ((Dialog) this.visibleDialogs.get(i)).dismiss();
            }
        }
        this.visibleDialogs.clear();
    }

    public void lambda$showLanguageAlertInternal$172(LocaleController.LocaleInfo[] localeInfoArr, AlertDialog alertDialog, int i) {
        LocaleController.getInstance().applyLanguage(localeInfoArr[0], true, false, this.currentAccount);
        rebuildAllFragments(true);
    }

    public void drawRippleAbove(Canvas canvas, View view) {
        View view2;
        if (view == null || (view2 = this.rippleAbove) == null || view2.getBackground() == null) {
            return;
        }
        if (this.tempLocation == null) {
            this.tempLocation = new int[2];
        }
        this.rippleAbove.getLocationInWindow(this.tempLocation);
        int[] iArr = this.tempLocation;
        int i = iArr[0];
        int i2 = iArr[1];
        view.getLocationInWindow(iArr);
        int[] iArr2 = this.tempLocation;
        int i3 = i - iArr2[0];
        int i4 = i2 - iArr2[1];
        canvas.save();
        canvas.translate(i3, i4);
        this.rippleAbove.getBackground().draw(canvas);
        canvas.restore();
    }

    private void showLanguageAlert(boolean z) {
        String str;
        LocaleController.LocaleInfo localeInfo;
        if (UserConfig.getInstance(this.currentAccount).isClientActivated()) {
            try {
                if (!this.loadingLocaleDialog && !ApplicationLoader.mainInterfacePaused) {
                    String string = MessagesController.getGlobalMainSettings().getString("language_showed2", "");
                    final String str2 = MessagesController.getInstance(this.currentAccount).suggestedLangCode;
                    if (!z && string.equals(str2)) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("alert already showed for " + string);
                            return;
                        }
                        return;
                    }
                    final LocaleController.LocaleInfo[] localeInfoArr = new LocaleController.LocaleInfo[2];
                    String str3 = str2.contains("-") ? str2.split("-")[0] : str2;
                    if ("in".equals(str3)) {
                        str = "id";
                    } else if ("iw".equals(str3)) {
                        str = "he";
                    } else {
                        str = "jw".equals(str3) ? "jv" : null;
                    }
                    for (int i = 0; i < LocaleController.getInstance().languages.size(); i++) {
                        LocaleController.LocaleInfo localeInfo2 = LocaleController.getInstance().languages.get(i);
                        if (localeInfo2.shortName.equals("en")) {
                            localeInfoArr[0] = localeInfo2;
                        }
                        if (localeInfo2.shortName.replace("_", "-").equals(str2) || localeInfo2.shortName.equals(str3) || localeInfo2.shortName.equals(str)) {
                            localeInfoArr[1] = localeInfo2;
                        }
                        if (localeInfoArr[0] != null && localeInfoArr[1] != null) {
                            break;
                        }
                    }
                    LocaleController.LocaleInfo localeInfo3 = localeInfoArr[0];
                    if (localeInfo3 != null && (localeInfo = localeInfoArr[1]) != null && localeInfo3 != localeInfo) {
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("show lang alert for " + localeInfoArr[0].getKey() + " and " + localeInfoArr[1].getKey());
                        }
                        this.systemLocaleStrings = null;
                        this.englishLocaleStrings = null;
                        this.loadingLocaleDialog = true;
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings.lang_code = localeInfoArr[1].getLangCode();
                        tL_langpack_getStrings.keys.add("English");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getStrings, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                this.f$0.lambda$showLanguageAlert$174(localeInfoArr, str2, tLObject, tL_error);
                            }
                        }, 8);
                        TLRPC.TL_langpack_getStrings tL_langpack_getStrings2 = new TLRPC.TL_langpack_getStrings();
                        tL_langpack_getStrings2.lang_code = localeInfoArr[0].getLangCode();
                        tL_langpack_getStrings2.keys.add("English");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguage");
                        tL_langpack_getStrings2.keys.add("ChooseYourLanguageOther");
                        tL_langpack_getStrings2.keys.add("ChangeLanguageLater");
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_langpack_getStrings2, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                this.f$0.lambda$showLanguageAlert$176(localeInfoArr, str2, tLObject, tL_error);
                            }
                        }, 8);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$showLanguageAlert$174(final LocaleController.LocaleInfo[] localeInfoArr, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        final HashMap map = new HashMap();
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i);
                map.put(langPackString.key, langPackString.value);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showLanguageAlert$173(map, localeInfoArr, str);
            }
        });
    }

    public void lambda$showLanguageAlert$173(HashMap map, LocaleController.LocaleInfo[] localeInfoArr, String str) {
        this.systemLocaleStrings = map;
        if (this.englishLocaleStrings == null || map == null) {
            return;
        }
        showLanguageAlertInternal(localeInfoArr[1], localeInfoArr[0], str);
    }

    public void lambda$showLanguageAlert$176(final LocaleController.LocaleInfo[] localeInfoArr, final String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        final HashMap map = new HashMap();
        if (tLObject instanceof Vector) {
            Vector vector = (Vector) tLObject;
            for (int i = 0; i < vector.objects.size(); i++) {
                TLRPC.LangPackString langPackString = (TLRPC.LangPackString) vector.objects.get(i);
                map.put(langPackString.key, langPackString.value);
            }
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$showLanguageAlert$175(map, localeInfoArr, str);
            }
        });
    }

    public void lambda$showLanguageAlert$175(HashMap map, LocaleController.LocaleInfo[] localeInfoArr, String str) {
        this.englishLocaleStrings = map;
        if (map == null || this.systemLocaleStrings == null) {
            return;
        }
        showLanguageAlertInternal(localeInfoArr[1], localeInfoArr[0], str);
    }

    private void onPasscodePause() {
        if (this.lockRunnable != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodePause");
            }
            AndroidUtilities.cancelRunOnUIThread(this.lockRunnable);
            this.lockRunnable = null;
        }
        if (SharedConfig.passcodeHash.length() != 0) {
            SharedConfig.lastPauseTime = (int) (SystemClock.elapsedRealtime() / 1000);
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if (LaunchActivity.this.lockRunnable == this) {
                        if (AndroidUtilities.needShowPasscode(true)) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("lock app");
                            }
                            LaunchActivity.this.showPasscodeActivity(true, false, -1, -1, null, null);
                            try {
                                NotificationsController.getInstance(UserConfig.selectedAccount).showNotifications();
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                        } else if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("didn't pass lock check");
                        }
                        LaunchActivity.this.lockRunnable = null;
                    }
                }
            };
            this.lockRunnable = runnable;
            if (SharedConfig.appLocked) {
                AndroidUtilities.runOnUIThread(runnable, 1000L);
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in 1000");
                }
            } else if (SharedConfig.autoLockIn != 0) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("schedule app lock in " + ((SharedConfig.autoLockIn * 1000) + 1000));
                }
                AndroidUtilities.runOnUIThread(this.lockRunnable, (SharedConfig.autoLockIn * 1000) + 1000);
            }
        } else {
            SharedConfig.lastPauseTime = 0;
        }
        SharedConfig.saveConfig();
    }

    public void addOverlayPasscodeView(PasscodeView passcodeView) {
        this.overlayPasscodeViews.add(passcodeView);
    }

    public void removeOverlayPasscodeView(PasscodeView passcodeView) {
        this.overlayPasscodeViews.remove(passcodeView);
    }

    private void onPasscodeResume() {
        if (this.lockRunnable != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("cancel lockRunnable onPasscodeResume");
            }
            AndroidUtilities.cancelRunOnUIThread(this.lockRunnable);
            this.lockRunnable = null;
        }
        if (AndroidUtilities.needShowPasscode(true)) {
            showPasscodeActivity(true, false, -1, -1, null, null);
        }
        if (SharedConfig.lastPauseTime != 0) {
            SharedConfig.lastPauseTime = 0;
            SharedConfig.saveConfig();
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("reset lastPauseTime onPasscodeResume");
            }
        }
    }

    private void updateCurrentConnectionState(int i) {
        int i2;
        String str;
        if (this.actionBarLayout == null) {
            return;
        }
        int connectionState = ConnectionsManager.getInstance(this.currentAccount).getConnectionState();
        this.currentConnectionState = connectionState;
        if (connectionState == 2) {
            i2 = R.string.WaitingForNetwork;
            str = "WaitingForNetwork";
        } else if (connectionState == 5) {
            i2 = R.string.Updating;
            str = "Updating";
        } else if (connectionState == 4) {
            i2 = R.string.ConnectingToProxyWithDots;
            str = "ConnectingToProxyWithDots";
        } else if (connectionState == 1) {
            i2 = R.string.Connecting;
            str = "Connecting";
        } else {
            i2 = 0;
            str = null;
        }
        this.actionBarLayout.setTitleOverlayText(str, i2, (connectionState == 1 || connectionState == 4) ? new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateCurrentConnectionState$177();
            }
        } : null);
    }

    public void lambda$updateCurrentConnectionState$177() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.lambda$updateCurrentConnectionState$177():void");
    }

    public void hideVisibleActionMode() {
        ActionMode actionMode = this.visibleActionMode;
        if (actionMode == null) {
            return;
        }
        actionMode.finish();
    }

    @Override
    protected void onSaveInstanceState(android.os.Bundle r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.LaunchActivity.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override
    public void onBackPressed() {
        if (onBackPressed(true)) {
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout = this.layersActionBarLayout;
                if (actionBarLayout != null && actionBarLayout.getView().getVisibility() == 0) {
                    this.layersActionBarLayout.onBackPressed();
                    return;
                }
                ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
                if (actionBarLayout2 != null && actionBarLayout2.getView().getVisibility() == 0 && !this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    BaseFragment baseFragment = this.rightActionBarLayout.getFragmentStack().get(this.rightActionBarLayout.getFragmentStack().size() - 1);
                    if (baseFragment.onBackPressed(true)) {
                        baseFragment.finishFragment();
                        return;
                    }
                    return;
                }
                this.actionBarLayout.onBackPressed();
                return;
            }
            this.actionBarLayout.onBackPressed();
        }
    }

    public boolean onBackPressed(boolean z) throws NumberFormatException {
        if (FloatingDebugController.onBackPressed(z)) {
            return false;
        }
        PasscodeViewDialog passcodeViewDialog = this.passcodeDialog;
        if (passcodeViewDialog != null && passcodeViewDialog.passcodeView.getVisibility() == 0) {
            if (z) {
                finish();
            }
            return false;
        }
        BottomSheetTabsOverlay bottomSheetTabsOverlay = this.bottomSheetTabsOverlay;
        if (bottomSheetTabsOverlay != null && bottomSheetTabsOverlay.isOpen) {
            if (z) {
                bottomSheetTabsOverlay.onBackPressed();
            }
            return false;
        }
        if (!SearchTagsList.onBackPressedRenameTagAlert(z)) {
            return false;
        }
        if (ContentPreviewViewer.hasInstance() && ContentPreviewViewer.getInstance().isVisible()) {
            if (z) {
                ContentPreviewViewer.getInstance().closeWithMenu();
            }
            return false;
        }
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            if (z) {
                SecretMediaViewer.getInstance().closePhoto(true, false);
            }
            return false;
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            if (z) {
                PhotoViewer.getInstance().closePhoto(true, false);
            }
            return false;
        }
        if (!ArticleViewer.hasInstance() || !ArticleViewer.getInstance().isVisible()) {
            return true;
        }
        if (z) {
            ArticleViewer.getInstance().close(true, false);
        }
        return false;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        ActionBarLayout actionBarLayout = this.actionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.onLowMemory();
            if (AndroidUtilities.isTablet()) {
                ActionBarLayout actionBarLayout2 = this.rightActionBarLayout;
                if (actionBarLayout2 != null) {
                    actionBarLayout2.onLowMemory();
                }
                ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                if (actionBarLayout3 != null) {
                    actionBarLayout3.onLowMemory();
                }
            }
        }
    }

    @Override
    public void onActionModeStarted(ActionMode actionMode) {
        super.onActionModeStarted(actionMode);
        this.visibleActionMode = actionMode;
        try {
            Menu menu = actionMode.getMenu();
            if (menu != null && !this.actionBarLayout.extendActionMode(menu) && AndroidUtilities.isTablet() && !this.rightActionBarLayout.extendActionMode(menu)) {
                this.layersActionBarLayout.extendActionMode(menu);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            this.actionBarLayout.onActionModeStarted(actionMode);
            if (AndroidUtilities.isTablet()) {
                this.rightActionBarLayout.onActionModeStarted(actionMode);
                this.layersActionBarLayout.onActionModeStarted(actionMode);
            }
        }
    }

    @Override
    public void onActionModeFinished(ActionMode actionMode) {
        super.onActionModeFinished(actionMode);
        if (this.visibleActionMode == actionMode) {
            this.visibleActionMode = null;
        }
        if (Build.VERSION.SDK_INT < 23 || actionMode.getType() != 1) {
            this.actionBarLayout.onActionModeFinished(actionMode);
            if (AndroidUtilities.isTablet()) {
                this.rightActionBarLayout.onActionModeFinished(actionMode);
                this.layersActionBarLayout.onActionModeFinished(actionMode);
            }
        }
    }

    @Override
    public boolean onPreIme() throws NumberFormatException {
        if (SecretMediaViewer.hasInstance() && SecretMediaViewer.getInstance().isVisible()) {
            SecretMediaViewer.getInstance().closePhoto(true, false);
            return true;
        }
        if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
            PhotoViewer.getInstance().closePhoto(true, false);
            return true;
        }
        if (!ArticleViewer.hasInstance() || !ArticleViewer.getInstance().isVisible()) {
            return false;
        }
        ArticleViewer.getInstance().close(true, false);
        return true;
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        BaseFragment lastFragment;
        keyEvent.getKeyCode();
        if ((keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25) && (lastFragment = getLastFragment()) != null && lastFragment.getLastStoryViewer() != null) {
            lastFragment.getLastStoryViewer().dispatchKeyEvent(keyEvent);
            return true;
        }
        if (keyEvent.getAction() == 0 && (keyEvent.getKeyCode() == 24 || keyEvent.getKeyCode() == 25)) {
            if (VoIPService.getSharedInstance() != null) {
                if (Build.VERSION.SDK_INT >= 32) {
                    boolean zIsSpeakerMuted = WebRtcAudioTrack.isSpeakerMuted();
                    AudioManager audioManager = (AudioManager) getSystemService("audio");
                    boolean z = audioManager.getStreamVolume(0) == audioManager.getStreamMinVolume(0) && keyEvent.getKeyCode() == 25;
                    WebRtcAudioTrack.setSpeakerMute(z);
                    if (zIsSpeakerMuted != WebRtcAudioTrack.isSpeakerMuted()) {
                        showVoiceChatTooltip(z ? 42 : 43);
                    }
                }
            } else if (!this.mainFragmentsStack.isEmpty() && ((!PhotoViewer.hasInstance() || !PhotoViewer.getInstance().isVisible()) && keyEvent.getRepeatCount() == 0)) {
                ArrayList arrayList = this.mainFragmentsStack;
                BaseFragment baseFragment = (BaseFragment) arrayList.get(arrayList.size() - 1);
                if ((baseFragment instanceof ChatActivity) && !BaseFragment.hasSheets(baseFragment) && ((ChatActivity) baseFragment).maybePlayVisibleVideo()) {
                    return true;
                }
                if (AndroidUtilities.isTablet() && !this.rightFragmentsStack.isEmpty()) {
                    ArrayList arrayList2 = this.rightFragmentsStack;
                    BaseFragment baseFragment2 = (BaseFragment) arrayList2.get(arrayList2.size() - 1);
                    if ((baseFragment2 instanceof ChatActivity) && !BaseFragment.hasSheets(baseFragment2) && ((ChatActivity) baseFragment2).maybePlayVisibleVideo()) {
                        return true;
                    }
                }
            }
        }
        try {
            return super.dispatchKeyEvent(keyEvent);
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    @Override
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 82 && !SharedConfig.isWaitingForPasscodeEnter) {
            if (PhotoViewer.hasInstance() && PhotoViewer.getInstance().isVisible()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
                return super.onKeyUp(i, keyEvent);
            }
            if (AndroidUtilities.isTablet()) {
                if (this.layersActionBarLayout.getView().getVisibility() == 0 && !this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    this.layersActionBarLayout.getView().onKeyUp(i, keyEvent);
                } else if (this.rightActionBarLayout.getView().getVisibility() == 0 && !this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                    this.rightActionBarLayout.getView().onKeyUp(i, keyEvent);
                } else {
                    this.actionBarLayout.getView().onKeyUp(i, keyEvent);
                }
            } else {
                this.actionBarLayout.getView().onKeyUp(i, keyEvent);
            }
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override
    public boolean needPresentFragment(INavigationLayout iNavigationLayout, INavigationLayout.NavigationParams navigationParams) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        ActionBarLayout actionBarLayout3;
        ActionBarLayout actionBarLayout4;
        BaseFragment baseFragment = navigationParams.fragment;
        boolean z = navigationParams.removeLast;
        boolean z2 = navigationParams.noAnimation;
        if (ArticleViewer.hasInstance() && ArticleViewer.getInstance().isVisible()) {
            ArticleViewer.getInstance().close(false, true);
        }
        if (AndroidUtilities.isTablet()) {
            if (baseFragment instanceof MainTabsActivity) {
                ActionBarLayout actionBarLayout5 = this.actionBarLayout;
                if (iNavigationLayout != actionBarLayout5) {
                    actionBarLayout5.removeAllFragments();
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize) {
                        this.shadowTabletSide.setVisibility(0);
                        if (this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                            this.backgroundTablet.setVisibility(0);
                        }
                    }
                    return false;
                }
            } else if (baseFragment instanceof DialogsActivity) {
                DialogsActivity dialogsActivity = (DialogsActivity) baseFragment;
                if (dialogsActivity.isMainDialogList() && iNavigationLayout != (actionBarLayout = this.actionBarLayout)) {
                    actionBarLayout.removeAllFragments();
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize) {
                        this.shadowTabletSide.setVisibility(0);
                        if (this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                            this.backgroundTablet.setVisibility(0);
                        }
                    }
                    return false;
                }
                if (iNavigationLayout == this.actionBarLayout && dialogsActivity.getArguments() != null && dialogsActivity.getArguments().getInt("folderId", 0) == 1) {
                    return true;
                }
            }
            if (((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode()) || navigationParams.forceRightLayout || (iNavigationLayout == (actionBarLayout2 = this.rightActionBarLayout) && (actionBarLayout2.getFragmentStack().size() > 1 || !(this.rightActionBarLayout.getLastFragment() instanceof ChatActivity)))) {
                boolean z3 = this.tabletFullSize;
                if ((!z3 && iNavigationLayout == this.rightActionBarLayout) || (z3 && iNavigationLayout == this.actionBarLayout)) {
                    ActionBarLayout actionBarLayout6 = this.rightActionBarLayout;
                    if (iNavigationLayout == actionBarLayout6) {
                        if (actionBarLayout6.getView() != null) {
                            this.rightActionBarLayout.getView().setVisibility(0);
                        }
                        this.backgroundTablet.setVisibility(8);
                    }
                    boolean z4 = (this.tabletFullSize && iNavigationLayout == (actionBarLayout4 = this.actionBarLayout) && actionBarLayout4.getFragmentStack().size() == 1) ? false : true;
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout7 = this.layersActionBarLayout;
                            actionBarLayout7.removeFragmentFromStack(actionBarLayout7.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    if (!z4) {
                        getActionBarLayout().presentFragment(navigationParams.setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    }
                    return z4;
                }
                if (!z3 && iNavigationLayout != (actionBarLayout3 = this.rightActionBarLayout) && actionBarLayout3 != null) {
                    if (actionBarLayout3.getView() != null) {
                        this.rightActionBarLayout.getView().setVisibility(0);
                    }
                    this.backgroundTablet.setVisibility(8);
                    this.rightActionBarLayout.removeAllFragments();
                    this.rightActionBarLayout.presentFragment(navigationParams.setNoAnimation(true).setRemoveLast(z).setCheckPresentFromDelegate(false));
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout8 = this.layersActionBarLayout;
                            actionBarLayout8.removeFragmentFromStack(actionBarLayout8.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    return false;
                }
                if (z3 && iNavigationLayout != this.actionBarLayout) {
                    getActionBarLayout().presentFragment(navigationParams.setRemoveLast(this.actionBarLayout.getFragmentStack().size() > 1).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout9 = this.layersActionBarLayout;
                            actionBarLayout9.removeFragmentFromStack(actionBarLayout9.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(!z2);
                    }
                    return false;
                }
                ActionBarLayout actionBarLayout10 = this.layersActionBarLayout;
                if (actionBarLayout10 != null && actionBarLayout10.getFragmentStack() != null && !this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                    while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                        ActionBarLayout actionBarLayout11 = this.layersActionBarLayout;
                        actionBarLayout11.removeFragmentFromStack(actionBarLayout11.getFragmentStack().get(0));
                    }
                    this.layersActionBarLayout.closeLastFragment(!z2);
                }
                getActionBarLayout().presentFragment(navigationParams.setRemoveLast(this.actionBarLayout.getFragmentStack().size() > 1).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                return false;
            }
            ActionBarLayout actionBarLayout12 = this.layersActionBarLayout;
            if (actionBarLayout12 != null && iNavigationLayout != actionBarLayout12) {
                actionBarLayout12.getView().setVisibility(0);
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        i = -1;
                        break;
                    }
                    if (UserConfig.getInstance(i).isClientActivated()) {
                        break;
                    }
                    i++;
                }
                if ((baseFragment instanceof LoginActivity) && i == -1) {
                    this.backgroundTablet.setVisibility(0);
                    this.shadowTabletSide.setVisibility(8);
                    this.shadowTablet.setBackgroundColor(0);
                } else {
                    this.shadowTablet.setBackgroundColor(2130706432);
                }
                this.layersActionBarLayout.presentFragment(navigationParams.setRemoveLast(z).setNoAnimation(z2).setCheckPresentFromDelegate(false));
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean needAddFragmentToStack(BaseFragment baseFragment, INavigationLayout iNavigationLayout) {
        ActionBarLayout actionBarLayout;
        ActionBarLayout actionBarLayout2;
        if (AndroidUtilities.isTablet()) {
            boolean z = baseFragment instanceof DialogsActivity;
            if (z || (baseFragment instanceof MainTabsActivity)) {
                boolean z2 = iNavigationLayout != this.actionBarLayout;
                if (z2 && z && !((DialogsActivity) baseFragment).isMainDialogList()) {
                    z2 = false;
                }
                if (z2) {
                    this.actionBarLayout.removeAllFragments();
                    this.actionBarLayout.addFragmentToStack(baseFragment);
                    this.layersActionBarLayout.removeAllFragments();
                    this.layersActionBarLayout.getView().setVisibility(8);
                    if (!this.tabletFullSize) {
                        this.shadowTabletSide.setVisibility(0);
                        if (this.rightActionBarLayout.getFragmentStack().isEmpty()) {
                            this.backgroundTablet.setVisibility(0);
                        }
                    }
                    return false;
                }
            } else if ((baseFragment instanceof ChatActivity) && !((ChatActivity) baseFragment).isInScheduleMode()) {
                boolean z3 = this.tabletFullSize;
                if (!z3 && iNavigationLayout != (actionBarLayout2 = this.rightActionBarLayout)) {
                    actionBarLayout2.getView().setVisibility(0);
                    this.backgroundTablet.setVisibility(8);
                    this.rightActionBarLayout.removeAllFragments();
                    this.rightActionBarLayout.addFragmentToStack(baseFragment);
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout3 = this.layersActionBarLayout;
                            actionBarLayout3.removeFragmentFromStack(actionBarLayout3.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(true);
                    }
                    return false;
                }
                if (z3 && iNavigationLayout != (actionBarLayout = this.actionBarLayout)) {
                    actionBarLayout.addFragmentToStack(baseFragment);
                    if (!this.layersActionBarLayout.getFragmentStack().isEmpty()) {
                        while (this.layersActionBarLayout.getFragmentStack().size() - 1 > 0) {
                            ActionBarLayout actionBarLayout4 = this.layersActionBarLayout;
                            actionBarLayout4.removeFragmentFromStack(actionBarLayout4.getFragmentStack().get(0));
                        }
                        this.layersActionBarLayout.closeLastFragment(true);
                    }
                    return false;
                }
            } else {
                ActionBarLayout actionBarLayout5 = this.layersActionBarLayout;
                if (iNavigationLayout != actionBarLayout5) {
                    actionBarLayout5.getView().setVisibility(0);
                    int i = 0;
                    while (true) {
                        if (i >= 4) {
                            i = -1;
                            break;
                        }
                        if (UserConfig.getInstance(i).isClientActivated()) {
                            break;
                        }
                        i++;
                    }
                    if ((baseFragment instanceof LoginActivity) && i == -1) {
                        this.backgroundTablet.setVisibility(0);
                        this.shadowTabletSide.setVisibility(8);
                        this.shadowTablet.setBackgroundColor(0);
                    } else {
                        this.shadowTablet.setBackgroundColor(2130706432);
                    }
                    this.layersActionBarLayout.addFragmentToStack(baseFragment);
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public boolean needCloseLastFragment(INavigationLayout iNavigationLayout) {
        if (AndroidUtilities.isTablet()) {
            if (iNavigationLayout == this.actionBarLayout && iNavigationLayout.getFragmentStack().size() <= 1 && !this.switchingAccount) {
                onFinish();
                finish();
                return false;
            }
            if (iNavigationLayout == this.rightActionBarLayout) {
                if (!this.tabletFullSize) {
                    this.backgroundTablet.setVisibility(0);
                }
            } else if (iNavigationLayout == this.layersActionBarLayout && this.actionBarLayout.getFragmentStack().isEmpty() && this.layersActionBarLayout.getFragmentStack().size() == 1) {
                onFinish();
                finish();
                return false;
            }
        } else if (iNavigationLayout.getFragmentStack().size() <= 1) {
            onFinish();
            finish();
            return false;
        }
        return true;
    }

    public void rebuildAllFragments(boolean z) {
        ActionBarLayout actionBarLayout = this.layersActionBarLayout;
        if (actionBarLayout != null) {
            actionBarLayout.rebuildAllFragmentViews(z, z);
        } else {
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }

    @Override
    public void onRebuildAllFragments(INavigationLayout iNavigationLayout, boolean z) {
        if (AndroidUtilities.isTablet() && iNavigationLayout == this.layersActionBarLayout) {
            this.rightActionBarLayout.rebuildAllFragmentViews(z, z);
            this.actionBarLayout.rebuildAllFragmentViews(z, z);
        }
    }

    public static BaseFragment getLastFragmentIncludeMainTabs() {
        BaseFragment lastFragment = getLastFragment();
        return lastFragment instanceof MainTabsActivity ? ((MainTabsActivity) lastFragment).getCurrentVisibleFragment() : lastFragment;
    }

    public static BaseFragment getLastFragment() {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.getLastFragment();
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).getLastFragment();
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().getLastFragment();
    }

    public static BaseFragment findFragment(Class cls) {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.findFragment(cls);
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).findFragment(cls);
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().findFragment(cls);
    }

    public static BaseFragment getSafeLastFragment() {
        INavigationLayout iNavigationLayout;
        BubbleActivity bubbleActivity = BubbleActivity.instance;
        if (bubbleActivity != null && (iNavigationLayout = bubbleActivity.actionBarLayout) != null) {
            return iNavigationLayout.getSafeLastFragment();
        }
        LaunchActivity launchActivity = instance;
        if (launchActivity != null && !launchActivity.sheetFragmentsStack.isEmpty()) {
            return ((INavigationLayout) instance.sheetFragmentsStack.get(r0.size() - 1)).getSafeLastFragment();
        }
        LaunchActivity launchActivity2 = instance;
        if (launchActivity2 == null || launchActivity2.getActionBarLayout() == null) {
            return null;
        }
        return instance.getActionBarLayout().getSafeLastFragment();
    }

    public int getNavigationBarColor() {
        if (Build.VERSION.SDK_INT >= 26) {
            return getWindow().getNavigationBarColor();
        }
        return 0;
    }

    public void setNavigationBarColor(int i) {
        this.drawerLayoutContainer.setInternalNavigationBarColor(i);
        BottomSheetTabs bottomSheetTabs = getBottomSheetTabs();
        if (bottomSheetTabs != null) {
            bottomSheetTabs.setNavigationBarColor(i);
        }
    }

    public BottomSheetTabs getBottomSheetTabs() {
        ActionBarLayout actionBarLayout = this.rightActionBarLayout;
        if (actionBarLayout != null && actionBarLayout.getBottomSheetTabs() != null) {
            return this.rightActionBarLayout.getBottomSheetTabs();
        }
        ActionBarLayout actionBarLayout2 = this.actionBarLayout;
        if (actionBarLayout2 == null || actionBarLayout2.getBottomSheetTabs() == null) {
            return null;
        }
        return this.actionBarLayout.getBottomSheetTabs();
    }

    public void animateNavigationBarColor(final int i) {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        ValueAnimator valueAnimator = this.navBarAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.navBarAnimator = null;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(getNavigationBarColor(), i);
        this.navBarAnimator = valueAnimatorOfArgb;
        valueAnimatorOfArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.f$0.lambda$animateNavigationBarColor$178(valueAnimator2);
            }
        });
        this.navBarAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                LaunchActivity.this.setNavigationBarColor(i);
            }
        });
        this.navBarAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.navBarAnimator.setDuration(320L);
        this.navBarAnimator.start();
    }

    public void lambda$animateNavigationBarColor$178(ValueAnimator valueAnimator) {
        setNavigationBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    public boolean isLightNavigationBar() {
        return AndroidUtilities.getLightNavigationBar(getWindow());
    }

    private void openStory(final long j, final int i, final boolean z) {
        TL_stories.StoryItem storyItem;
        StoriesController.StoriesList storiesList;
        StoriesListPlaceProvider storiesListPlaceProviderOf;
        StoriesController.StoriesList storiesList2;
        MessageObject messageObjectFindMessageObject;
        MessageObject messageObjectFindMessageObject2;
        StoriesListPlaceProvider storiesListPlaceProviderOf2;
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        TL_stories.PeerStories stories = storiesController.getStories(j);
        if (stories != null) {
            int i2 = 0;
            while (true) {
                if (i2 >= stories.stories.size()) {
                    storyItem = null;
                    break;
                } else {
                    if (stories.stories.get(i2).id == i) {
                        storyItem = stories.stories.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (storyItem != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (lastFragment instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProviderOf2 = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused) {
                    }
                } else {
                    storiesListPlaceProviderOf2 = null;
                }
                lastFragment.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    lastFragment.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment.getOrCreateStoryViewer().open(this, storyItem, arrayList, 0, null, stories, storiesListPlaceProviderOf2, false);
                return;
            }
        } else {
            storyItem = null;
        }
        if (storyItem == null) {
            StoriesController.StoriesList storiesList3 = storiesController.getStoriesList(j, 0);
            if (storiesList3 == null || (messageObjectFindMessageObject2 = storiesList3.findMessageObject(i)) == null) {
                storiesList3 = null;
            } else {
                storyItem = messageObjectFindMessageObject2.storyItem;
            }
            if (storyItem != null || (storiesList2 = storiesController.getStoriesList(j, 1)) == null || (messageObjectFindMessageObject = storiesList2.findMessageObject(i)) == null) {
                storiesList = storiesList3;
            } else {
                TL_stories.StoryItem storyItem2 = messageObjectFindMessageObject.storyItem;
                storiesList = storiesList2;
                storyItem = storyItem2;
            }
            if (storyItem != null && storiesList != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment2 = getLastFragment();
                if (lastFragment2 == null) {
                    return;
                }
                if (lastFragment2 instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProviderOf = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment2).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused2) {
                    }
                } else {
                    storiesListPlaceProviderOf = null;
                }
                lastFragment2.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(storyItem.dialogId));
                if (z) {
                    lastFragment2.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment2.getOrCreateStoryViewer().open(this, storyItem, arrayList2, 0, storiesList, null, storiesListPlaceProviderOf, false);
                return;
            }
        }
        TL_stories.TL_stories_getStoriesByID tL_stories_getStoriesByID = new TL_stories.TL_stories_getStoriesByID();
        tL_stories_getStoriesByID.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j);
        tL_stories_getStoriesByID.id.add(Integer.valueOf(i));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesByID, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$openStory$180(i, j, z, tLObject, tL_error);
            }
        });
    }

    public void lambda$openStory$180(final int i, final long j, final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openStory$179(tLObject, i, j, z);
            }
        });
    }

    public void lambda$openStory$179(TLObject tLObject, int i, long j, boolean z) {
        StoriesListPlaceProvider storiesListPlaceProviderOf;
        TL_stories.StoryItem storyItem;
        if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            int i2 = 0;
            while (true) {
                storiesListPlaceProviderOf = null;
                if (i2 >= tL_stories_stories.stories.size()) {
                    storyItem = null;
                    break;
                } else {
                    if (tL_stories_stories.stories.get(i2).id == i) {
                        storyItem = tL_stories_stories.stories.get(i2);
                        break;
                    }
                    i2++;
                }
            }
            if (storyItem != null) {
                storyItem.dialogId = j;
                BaseFragment lastFragment = getLastFragment();
                if (lastFragment == null) {
                    return;
                }
                if (lastFragment instanceof DialogsActivity) {
                    try {
                        storiesListPlaceProviderOf = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
                    } catch (Exception unused) {
                    }
                }
                StoriesListPlaceProvider storiesListPlaceProvider = storiesListPlaceProviderOf;
                lastFragment.getOrCreateStoryViewer().instantClose();
                ArrayList arrayList = new ArrayList();
                arrayList.add(Long.valueOf(j));
                if (z) {
                    lastFragment.getOrCreateStoryViewer().showViewsAfterOpening();
                }
                lastFragment.getOrCreateStoryViewer().open(this, storyItem, arrayList, 0, null, null, storiesListPlaceProvider, false);
                return;
            }
        }
        BulletinFactory.global().createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.StoryNotFound)).show(false);
    }

    private void openStories(long[] jArr, boolean z) {
        boolean z2;
        StoriesListPlaceProvider storiesListPlaceProviderOf;
        final long[] array = jArr;
        int i = 0;
        while (true) {
            if (i >= array.length) {
                z2 = true;
                break;
            }
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(array[i]));
            if (user != null && !user.stories_hidden) {
                z2 = false;
                break;
            }
            i++;
        }
        BaseFragment lastFragment = getLastFragment();
        if (lastFragment == null) {
            return;
        }
        StoriesController storiesController = MessagesController.getInstance(this.currentAccount).getStoriesController();
        ArrayList arrayList = new ArrayList(z2 ? storiesController.getHiddenList() : storiesController.getDialogListStories());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        if (!z2) {
            ArrayList arrayList4 = new ArrayList();
            for (int i2 = 0; i2 < array.length; i2++) {
                TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(array[i2]));
                if (user2 == null || !user2.stories_hidden) {
                    arrayList4.add(Long.valueOf(array[i2]));
                }
            }
            array = Longs.toArray(arrayList4);
        }
        if (z) {
            for (long j : array) {
                arrayList3.add(Long.valueOf(j));
            }
        } else {
            for (long j2 : array) {
                arrayList2.add(Long.valueOf(j2));
            }
        }
        if (!arrayList3.isEmpty() && z) {
            final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
            final int[] iArr = {arrayList3.size()};
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$openStories$181(iArr, array);
                }
            };
            for (int i3 = 0; i3 < arrayList3.size(); i3++) {
                final long jLongValue = ((Long) arrayList3.get(i3)).longValue();
                TL_stories.TL_stories_getPeerStories tL_stories_getPeerStories = new TL_stories.TL_stories_getPeerStories();
                TLRPC.InputPeer inputPeer = messagesController.getInputPeer(jLongValue);
                tL_stories_getPeerStories.peer = inputPeer;
                if (inputPeer instanceof TLRPC.TL_inputPeerEmpty) {
                    iArr[0] = iArr[0] - 1;
                } else if (inputPeer == null) {
                    iArr[0] = iArr[0] - 1;
                } else {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getPeerStories, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LaunchActivity.lambda$openStories$183(messagesController, jLongValue, runnable, tLObject, tL_error);
                        }
                    });
                }
            }
            return;
        }
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i4)).peer);
            if (peerDialogId != clientUserId && !arrayList2.contains(Long.valueOf(peerDialogId)) && storiesController.hasUnreadStories(peerDialogId)) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        if (lastFragment instanceof DialogsActivity) {
            try {
                storiesListPlaceProviderOf = StoriesListPlaceProvider.of(((DialogsActivity) lastFragment).dialogStoriesCell.recyclerListView);
            } catch (Exception unused) {
            }
        } else {
            storiesListPlaceProviderOf = null;
        }
        StoriesListPlaceProvider storiesListPlaceProvider = storiesListPlaceProviderOf;
        lastFragment.getOrCreateStoryViewer().instantClose();
        lastFragment.getOrCreateStoryViewer().open(this, null, arrayList2, 0, null, null, storiesListPlaceProvider, false);
    }

    public void lambda$openStories$181(int[] iArr, long[] jArr) {
        int i = iArr[0] - 1;
        iArr[0] = i;
        if (i == 0) {
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            openStories(jArr, false);
        }
    }

    public static void lambda$openStories$183(final MessagesController messagesController, final long j, final Runnable runnable, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LaunchActivity.lambda$openStories$182(tLObject, messagesController, j, runnable);
            }
        });
    }

    public static void lambda$openStories$182(TLObject tLObject, MessagesController messagesController, long j, Runnable runnable) {
        if (tLObject instanceof TL_stories.TL_stories_peerStories) {
            TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
            messagesController.putUsers(tL_stories_peerStories.users, false);
            messagesController.getStoriesController().putStories(j, tL_stories_peerStories.stories);
            runnable.run();
            return;
        }
        runnable.run();
    }

    public static void dismissAllWeb() {
        ArrayList<BaseFragment.AttachedSheet> arrayList;
        BaseFragment safeLastFragment = getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        EmptyBaseFragment sheetFragment = safeLastFragment.getParentLayout() instanceof ActionBarLayout ? ((ActionBarLayout) safeLastFragment.getParentLayout()).getSheetFragment(false) : null;
        if (sheetFragment != null && (arrayList = sheetFragment.sheetsStack) != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                sheetFragment.sheetsStack.get(size).dismiss(true);
            }
        }
        ArrayList<BaseFragment.AttachedSheet> arrayList2 = safeLastFragment.sheetsStack;
        if (arrayList2 != null) {
            for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                safeLastFragment.sheetsStack.get(size2).dismiss(true);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = BotWebViewSheet.activeSheets.iterator();
        while (it.hasNext()) {
            arrayList3.add((BotWebViewSheet) it.next());
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((BotWebViewSheet) it2.next()).dismiss(true);
        }
    }

    public static void makeRipple(float f, float f2, float f3) {
        LaunchActivity launchActivity = instance;
        if (launchActivity == null) {
            return;
        }
        launchActivity.makeRippleInternal(f, f2, f3);
    }

    private void makeRippleInternal(float f, float f2, float f3) {
        ISuperRipple iSuperRipple;
        View decorView = getWindow().getDecorView();
        if (decorView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 33 && ((iSuperRipple = this.currentRipple) == null || iSuperRipple.view != decorView)) {
            this.currentRipple = new SuperRipple(decorView);
        }
        ISuperRipple iSuperRipple2 = this.currentRipple;
        if (iSuperRipple2 != null) {
            iSuperRipple2.animate(f, f2, f3);
        }
    }

    public int getMainFragmentsStackSize() {
        return this.mainFragmentsStack.size();
    }

    @Override
    public PipActivityController getPipController() {
        return this.pipActivityController;
    }

    public void updateReasonsToHideMainContent(boolean z, boolean z2) {
        int i = this.reasonsToHideMainContent + (z ? 1 : -1);
        this.reasonsToHideMainContent = i;
        if (z2) {
            this.reasonsToHideDecorView += z ? 1 : -1;
        }
        FrameLayout frameLayout = this.frameLayout;
        if (frameLayout != null) {
            frameLayout.setVisibility(i > 0 ? 8 : 0);
        }
        checkDecorViewVisibility();
    }

    public void checkDecorViewVisibility() {
        getWindow();
    }

    public ActivityVisibilityController createActivityVisibilityController(boolean z) {
        return new ActivityVisibilityController(z);
    }

    public static WindowVisibilityManager.Controller obtainActivityVisibilityController() {
        LaunchActivity launchActivity = instance;
        if (launchActivity != null) {
            return launchActivity.createActivityVisibilityController(true);
        }
        return null;
    }

    public static class ActivityVisibilityController implements WindowVisibilityManager.Controller {
        private final WeakReference activity;
        private boolean destroyed;
        private boolean hidden;
        private final boolean withDecorView;

        private ActivityVisibilityController(LaunchActivity launchActivity, boolean z) {
            this.activity = new WeakReference(launchActivity);
            this.withDecorView = z;
        }

        @Override
        public void setHidden(boolean z) {
            if (this.hidden == z || this.destroyed) {
                return;
            }
            this.hidden = z;
            LaunchActivity launchActivity = (LaunchActivity) this.activity.get();
            if (launchActivity != null) {
                launchActivity.updateReasonsToHideMainContent(z, this.withDecorView);
            }
        }

        @Override
        public void destroy() {
            setHidden(false);
            this.destroyed = true;
        }

        public void show() {
            setHidden(false);
        }

        public void hide() {
            setHidden(true);
        }
    }
}
