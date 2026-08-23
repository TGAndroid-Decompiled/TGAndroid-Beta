package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import androidx.core.view.WindowInsetsCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.BotFullscreenButtons;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheetTabDialog;
import org.telegram.ui.ActionBar.BottomSheetTabs;
import org.telegram.ui.ActionBar.BottomSheetTabsOverlay;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda333;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ReportBottomSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.web.BotWebViewContainer;

public class BotWebViewSheet extends Dialog implements NotificationCenter.NotificationCenterDelegate, BottomSheetTabsOverlay.Sheet {
    private ActionBar actionBar;
    private int actionBarColor;
    private int actionBarColorKey;
    private boolean actionBarIsLight;
    private FrameLayout.LayoutParams actionBarLayoutParams;
    private Paint actionBarPaint;
    private Drawable actionBarShadow;
    private float actionBarTransitionProgress;
    public boolean attached;
    private boolean backButtonShown;
    private ValueAnimator backgroundColorAnimator;
    private Paint backgroundPaint;
    private BotButtons botButtons;
    private FrameLayout.LayoutParams botButtonsLayoutParams;
    private long botId;
    private BottomSheetTabs bottomTabs;
    private BottomSheetTabs.ClipTools bottomTabsClip;
    private FrameLayout bulletinContainer;
    private FrameLayout.LayoutParams bulletinContainerLayoutParams;
    private String buttonText;
    private int currentAccount;
    private TLRPC.BotApp currentWebApp;
    private boolean defaultFullsize;
    private Paint dimPaint;
    private boolean dismissed;
    private Bulletin downloadBulletin;
    private BotDownloads.DownloadBulletin downloadBulletinLayout;
    private String errorCode;
    private ArticleViewer.ErrorContainer errorContainer;
    private boolean errorShown;
    private HashMap fileItems;
    private boolean forceExpnaded;
    public boolean fromTab;
    private boolean fullscreen;
    private ValueAnimator fullscreenAnimator;
    private boolean fullscreenBlur;
    private BotFullscreenButtons fullscreenButtons;
    private boolean fullscreenInProgress;
    private float fullscreenProgress;
    private float fullscreenTransitionProgress;
    private Boolean fullsize;
    private boolean hasSettings;
    private boolean ignoreLayout;
    private final Rect insets;
    private int keyboardInset;
    private BotDownloads.FileDownload lastBulletinFile;
    private long lastSwipeTime;
    private BottomSheetTabs.WebTabData lastTab;
    private int lineColor;
    private Paint linePaint;
    private long monoforumTopicId;
    private int navBarColor;
    private final Rect navInsets;
    private boolean needCloseConfirmation;
    private boolean needsContext;
    private Utilities.Callback4 onVerifiedAge;
    private ValueAnimator openAnimator;
    private float openedProgress;
    private ItemOptions options;
    private BotFullscreenButtons.OptionsIcon optionsIcon;
    private ActionBarMenuItem optionsItem;
    private boolean orientationLocked;
    private boolean overrideActionBarColor;
    private boolean overrideBackgroundColor;
    private Activity parentActivity;
    private PasscodeView passcodeView;
    private long peerId;
    private Runnable pollRunnable;
    private ChatAttachAlertBotWebViewLayout.WebProgressView progressView;
    private long queryId;
    private int replyToMsgId;
    private WebViewRequestProps requestProps;
    private boolean resetOffsetY;
    private Theme.ResourcesProvider resourcesProvider;
    private BotSensors sensors;
    public boolean showExpanded;
    public float showOffsetY;
    private boolean silent;
    private SpringAnimation springAnimation;
    private boolean superDismissed;
    private ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
    private int swipeContainerFromHeight;
    private int swipeContainerFromWidth;
    private FrameLayout.LayoutParams swipeContainerLayoutParams;
    Drawable verifiedDrawable;
    private Boolean wasLightStatusBar;
    private BotWebViewContainer webViewContainer;
    private WindowView windowView;
    public static HashSet activeSheets = new HashSet();
    private static final SimpleFloatPropertyCompat ACTION_BAR_TRANSITION_PROGRESS_VALUE = new SimpleFloatPropertyCompat("actionBarTransitionProgress", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            return ((BotWebViewSheet) obj).actionBarTransitionProgress;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            BotWebViewSheet.$r8$lambda$dhmypthlwfdi0mzcNPXCnIIwOB8((BotWebViewSheet) obj, f);
        }
    }).setMultiplier(100.0f);
    private static int shownLockedBots = 0;

    public static void $r8$lambda$m1zU1JXk5NQS_jqubrgOPHU3MyI() {
    }

    @Override
    public boolean hadDialog() {
        return false;
    }

    @Override
    public boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
        return false;
    }

    @Override
    public void setLastVisible(boolean z) {
        BottomSheetTabsOverlay.Sheet.CC.$default$setLastVisible(this, z);
    }

    public void showJustAddedBulletin() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        final String string;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                i++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != this.botId);
        if (tL_attachMenuBot == null) {
            return;
        }
        boolean z = tL_attachMenuBot.show_in_side_menu;
        if (z && tL_attachMenuBot.show_in_attach_menu) {
            string = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name);
        } else if (z) {
            string = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedSide, user.first_name);
        } else {
            string = LocaleController.formatString(R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.m4831$r8$lambda$DCLnpefspF3cKG10fzqKOvqTpU(this.f$0, string);
            }
        }, 200L);
    }

    public static void m4831$r8$lambda$DCLnpefspF3cKG10fzqKOvqTpU(BotWebViewSheet botWebViewSheet, final String str) {
        botWebViewSheet.getClass();
        botWebViewSheet.showBulletin(new Utilities.CallbackReturn() {
            @Override
            public final Object run(Object obj) {
                return ((BulletinFactory) obj).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(str)).setDuration(5000);
            }
        });
    }

    public static void $r8$lambda$dhmypthlwfdi0mzcNPXCnIIwOB8(BotWebViewSheet botWebViewSheet, float f) {
        botWebViewSheet.actionBarTransitionProgress = f;
        botWebViewSheet.windowView.invalidate();
        botWebViewSheet.actionBar.setAlpha(f);
        botWebViewSheet.updateLightStatusBar();
        botWebViewSheet.updateDownloadBulletinArrow();
    }

    public static void $r8$lambda$Mn_TVu4ChUTsqxCpM5C0Fm_UEAY(final BotWebViewSheet botWebViewSheet) {
        if (botWebViewSheet.dismissed || botWebViewSheet.queryId == 0) {
            return;
        }
        TLRPC.TL_messages_prolongWebView tL_messages_prolongWebView = new TLRPC.TL_messages_prolongWebView();
        tL_messages_prolongWebView.bot = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputUser(botWebViewSheet.botId);
        tL_messages_prolongWebView.peer = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.peerId);
        tL_messages_prolongWebView.query_id = botWebViewSheet.queryId;
        tL_messages_prolongWebView.silent = botWebViewSheet.silent;
        if (botWebViewSheet.replyToMsgId != 0) {
            TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(botWebViewSheet.currentAccount).createReplyInput(botWebViewSheet.replyToMsgId);
            tL_messages_prolongWebView.reply_to = inputReplyToCreateReplyInput;
            if (botWebViewSheet.monoforumTopicId != 0) {
                inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.monoforumTopicId);
                tL_messages_prolongWebView.reply_to.flags |= 32;
            }
            tL_messages_prolongWebView.flags |= 1;
        } else if (botWebViewSheet.monoforumTopicId != 0) {
            TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
            tL_messages_prolongWebView.reply_to = tL_inputReplyToMonoForum;
            tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(botWebViewSheet.currentAccount).getInputPeer(botWebViewSheet.monoforumTopicId);
            tL_messages_prolongWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(botWebViewSheet.currentAccount).sendRequest(tL_messages_prolongWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotWebViewSheet.m4838$r8$lambda$s2PtDEFvVIbvcLXS67atgeNfEI(this.f$0, tLObject, tL_error);
            }
        });
    }

    public static void m4838$r8$lambda$s2PtDEFvVIbvcLXS67atgeNfEI(final BotWebViewSheet botWebViewSheet, TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$CEp0ScAYMZlzYP6mFwFRzoWh43A(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$CEp0ScAYMZlzYP6mFwFRzoWh43A(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error) {
        if (botWebViewSheet.dismissed) {
            return;
        }
        if (tL_error != null) {
            botWebViewSheet.dismiss();
        } else {
            AndroidUtilities.runOnUIThread(botWebViewSheet.pollRunnable, 60000L);
        }
    }

    @Override
    public BottomSheetTabs.WebTabData saveState() {
        BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
        webTabData.actionBarColor = this.actionBarColor;
        webTabData.actionBarColorKey = this.actionBarColorKey;
        webTabData.overrideActionBarColor = this.overrideActionBarColor;
        webTabData.overrideBackgroundColor = this.overrideBackgroundColor;
        webTabData.backgroundColor = this.backgroundPaint.getColor();
        webTabData.props = this.requestProps;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        webTabData.ready = botWebViewContainer != null && botWebViewContainer.isPageLoaded();
        webTabData.themeIsDark = Theme.isCurrentThemeDark();
        BotWebViewContainer botWebViewContainer2 = this.webViewContainer;
        webTabData.lastUrl = botWebViewContainer2 != null ? botWebViewContainer2.getUrlLoaded() : null;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webTabData.expanded = (webViewSwipeContainer != null && webViewSwipeContainer.getSwipeOffsetY() < 0.0f) || this.forceExpnaded || isFullSize() || this.fullscreen;
        webTabData.fullscreen = this.fullscreen;
        webTabData.fullscreenBlur = this.fullscreenBlur;
        Boolean bool = this.fullsize;
        webTabData.fullsize = bool == null ? this.defaultFullsize : bool.booleanValue();
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
        webTabData.expandedOffset = webViewSwipeContainer2 != null ? webViewSwipeContainer2.getOffsetY() : Float.MAX_VALUE;
        webTabData.needsContext = this.needsContext;
        webTabData.backButton = this.backButtonShown;
        webTabData.confirmDismiss = this.needCloseConfirmation;
        webTabData.settings = this.hasSettings;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer3 = this.swipeContainer;
        webTabData.allowSwipes = webViewSwipeContainer3 == null || webViewSwipeContainer3.isAllowedSwipes();
        webTabData.buttons = this.botButtons.state;
        webTabData.navigationBarColor = this.navBarColor;
        BotSensors botSensors = this.sensors;
        if (botSensors != null) {
            botSensors.pause();
        }
        webTabData.sensors = this.sensors;
        BotWebViewContainer botWebViewContainer3 = this.webViewContainer;
        BotWebViewContainer.MyWebView webView = botWebViewContainer3 == null ? null : botWebViewContainer3.getWebView();
        if (webView != null) {
            this.webViewContainer.preserveWebView();
            webTabData.webView = webView;
            BotWebViewContainer botWebViewContainer4 = this.webViewContainer;
            webTabData.proxy = botWebViewContainer4 != null ? botWebViewContainer4.getBotProxy() : null;
            webTabData.viewWidth = webView.getWidth();
            webTabData.viewHeight = webView.getHeight();
            webView.onPause();
        }
        boolean z = this.errorShown;
        webTabData.error = z;
        if (z) {
            webTabData.errorDescription = this.errorCode;
        }
        webTabData.orientationLocked = this.orientationLocked;
        this.lastTab = webTabData;
        return webTabData;
    }

    public Activity getActivity() {
        Activity ownerActivity = getOwnerActivity();
        if (ownerActivity == null) {
            ownerActivity = LaunchActivity.instance;
        }
        return ownerActivity == null ? AndroidUtilities.findActivity(getContext()) : ownerActivity;
    }

    public boolean restoreState(BaseFragment baseFragment, BottomSheetTabs.WebTabData webTabData) {
        int color;
        if (webTabData == null || webTabData.props == null) {
            return false;
        }
        this.fromTab = true;
        boolean z = webTabData.overrideBackgroundColor;
        this.overrideBackgroundColor = z;
        if (z) {
            setBackgroundColor(webTabData.backgroundColor, true, false);
        }
        if (webTabData.overrideActionBarColor) {
            color = webTabData.actionBarColor;
        } else {
            int i = webTabData.actionBarColorKey;
            if (i < 0) {
                i = Theme.key_windowBackgroundWhite;
            }
            color = Theme.getColor(i, this.resourcesProvider);
        }
        setActionBarColor(color, webTabData.overrideActionBarColor, false);
        setNavigationBarColor(webTabData.navigationBarColor, false);
        this.showExpanded = webTabData.expanded;
        this.showOffsetY = webTabData.expandedOffset;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        boolean z2 = webTabData.backButton;
        this.backButtonShown = z2;
        botWebViewContainer.setIsBackButtonVisible(z2);
        this.swipeContainer.setAllowSwipes(webTabData.allowSwipes);
        AndroidUtilities.updateImageViewImageAnimated(this.actionBar.getBackButton(), this.backButtonShown ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setBack(this.backButtonShown, false);
        }
        this.needCloseConfirmation = webTabData.confirmDismiss;
        this.fullsize = Boolean.valueOf(webTabData.fullsize);
        this.needsContext = webTabData.needsContext;
        BotSensors botSensors = webTabData.sensors;
        this.sensors = botSensors;
        if (botSensors != null) {
            botSensors.resume();
        }
        BotButtons.ButtonsState buttonsState = webTabData.buttons;
        if (buttonsState != null) {
            this.botButtons.setState(buttonsState, false);
        }
        setFullscreen(webTabData.fullscreen, false, webTabData.fullscreenBlur);
        WebViewRequestProps webViewRequestProps = webTabData.props;
        this.currentAccount = webViewRequestProps != null ? webViewRequestProps.currentAccount : UserConfig.selectedAccount;
        BotWebViewContainer.MyWebView myWebView = webTabData.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webViewContainer.replaceWebView(this.currentAccount, webTabData.webView, webTabData.proxy);
            this.webViewContainer.setState(webTabData.ready || webTabData.webView.isPageLoaded(), webTabData.lastUrl);
            if (Theme.isCurrentThemeDark() != webTabData.themeIsDark) {
                this.webViewContainer.notifyThemeChanged();
            }
        } else {
            webViewRequestProps.response = null;
            webViewRequestProps.responseTime = 0L;
        }
        requestWebView(baseFragment, webTabData.props);
        this.hasSettings = webTabData.settings;
        if (webTabData.error) {
            this.errorShown = true;
            createErrorContainer();
            ArticleViewer.ErrorContainer errorContainer = this.errorContainer;
            String userName = UserObject.getUserName(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
            String str = webTabData.errorDescription;
            this.errorCode = str;
            errorContainer.set(userName, str);
            this.errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(this.backgroundPaint.getColor()) <= 0.721f, false);
            this.errorContainer.setBackgroundColor(this.backgroundPaint.getColor());
            this.errorContainer.setVisibility(0);
            this.errorContainer.setAlpha(1.0f);
        }
        lockOrientation(webTabData.orientationLocked);
        return true;
    }

    public BotWebViewSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.actionBarTransitionProgress = 0.0f;
        this.navInsets = new Rect();
        this.insets = new Rect();
        this.keyboardInset = 0;
        this.linePaint = new Paint(1);
        this.dimPaint = new Paint();
        this.backgroundPaint = new Paint(1);
        this.actionBarPaint = new Paint(1);
        this.pollRunnable = new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$Mn_TVu4ChUTsqxCpM5C0Fm_UEAY(this.f$0);
            }
        };
        this.actionBarColorKey = -1;
        this.defaultFullsize = false;
        this.fullsize = null;
        this.fileItems = new HashMap();
        this.superDismissed = false;
        this.resetOffsetY = true;
        this.attached = false;
        this.resourcesProvider = resourcesProvider;
        this.lineColor = Theme.getColor(Theme.key_sheet_scrollUp);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(context) {
            @Override
            protected void onMeasure(int i, int i2) {
                int i3;
                int size = View.MeasureSpec.getSize(i2);
                if (AndroidUtilities.isTablet()) {
                    i3 = (size / 5) * 2;
                } else {
                    Point point = AndroidUtilities.displaySize;
                    if (point.x > point.y) {
                        i3 = (int) (size / 3.5f);
                    } else {
                        i3 = (size / 5) * 2;
                    }
                }
                if (i3 < 0) {
                    i3 = 0;
                }
                float f = i3;
                if (getOffsetY() != f && !BotWebViewSheet.this.dismissed && BotWebViewSheet.this.resetOffsetY) {
                    BotWebViewSheet.this.ignoreLayout = true;
                    setOffsetY(f);
                    BotWebViewSheet.this.ignoreLayout = false;
                    BotWebViewSheet.this.resetOffsetY = false;
                }
                if (!BotWebViewSheet.this.fullscreen && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point2 = AndroidUtilities.displaySize;
                    i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), 1073741824);
                }
                int size2 = View.MeasureSpec.getSize(i2);
                if (!BotWebViewSheet.this.fullscreen) {
                    size2 = (size2 - AndroidUtilities.statusBarHeight) - ActionBar.getCurrentActionBarHeight();
                }
                if (BotWebViewSheet.this.botButtons != null && BotWebViewSheet.this.botButtons.getTotalHeight() > 0) {
                    size2 -= BotWebViewSheet.this.botButtons.getTotalHeight();
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(size2 + AndroidUtilities.dp(24.0f), 1073741824));
            }

            @Override
            public void requestLayout() {
                if (BotWebViewSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }

            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
                if (BotWebViewSheet.this.fullscreenButtons != null) {
                    BotWebViewSheet.this.fullscreenButtons.setTranslationY(AndroidUtilities.dp(24.0f) + f);
                }
                if (BotWebViewSheet.this.bulletinContainer != null) {
                    BotWebViewSheet.this.bulletinContainer.setTranslationY(AndroidUtilities.lerp(ActionBar.getCurrentActionBarHeight() - AndroidUtilities.dp(24.0f), BotWebViewSheet.this.insets.top + AndroidUtilities.dp(70.0f), BotWebViewSheet.this.fullscreenProgress) + BotWebViewSheet.this.swipeContainer.getTranslationY());
                }
            }
        };
        this.swipeContainer = webViewSwipeContainer;
        webViewSwipeContainer.setAllowFullSizeSwipe(true);
        this.swipeContainer.setShouldWaitWebViewScroll(true);
        int i = Theme.key_windowBackgroundWhite;
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(context, resourcesProvider, getColor(i), true) {
            @Override
            public void onWebViewCreated(BotWebViewContainer.MyWebView myWebView) {
                super.onWebViewCreated(myWebView);
                BotWebViewSheet.this.swipeContainer.setWebView(myWebView);
                if (BotWebViewSheet.this.sensors != null) {
                    BotWebViewSheet.this.sensors.attachWebView(myWebView);
                }
                BotWebViewSheet.this.fullscreenButtons.setWebView(myWebView);
                BotWebViewSheet.this.updateWebViewBackgroundColor();
            }

            @Override
            public void onWebViewDestroyed(BotWebViewContainer.MyWebView myWebView) {
                if (BotWebViewSheet.this.sensors != null) {
                    BotWebViewSheet.this.sensors.detachWebView(myWebView);
                }
                BotWebViewSheet.this.fullscreenButtons.setWebView(null);
            }

            @Override
            protected void onErrorShown(boolean z, int i2, String str) {
                if (z) {
                    BotWebViewSheet.this.createErrorContainer();
                    BotWebViewSheet.this.errorContainer.set(UserObject.getUserName(MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getUser(Long.valueOf(BotWebViewSheet.this.botId))), str);
                    BotWebViewSheet.this.errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(BotWebViewSheet.this.backgroundPaint.getColor()) <= 0.721f, false);
                    BotWebViewSheet.this.errorContainer.setBackgroundColor(BotWebViewSheet.this.backgroundPaint.getColor());
                    BotWebViewSheet.this.errorCode = str;
                }
                AndroidUtilities.updateViewVisibilityAnimated(BotWebViewSheet.this.errorContainer, BotWebViewSheet.this.errorShown = z, 1.0f, false);
                invalidate();
            }
        };
        this.webViewContainer = botWebViewContainer;
        botWebViewContainer.setOnVerifiedAge(this.onVerifiedAge);
        this.webViewContainer.setDelegate(new AnonymousClass3(context, resourcesProvider));
        this.linePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.dimPaint.setColor(1073741824);
        this.actionBarColor = getColor(i);
        int color = getColor(Theme.key_windowBackgroundGray);
        this.navBarColor = color;
        AndroidUtilities.setNavigationBarColor((Dialog) this, color, false);
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        windowView.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            @Override
            public final void onSizeChanged(int i2, boolean z) {
                BotWebViewSheet.$r8$lambda$2ViQsPiJsDlJWGhZODW4vSVsAtc(this.f$0, i2, z);
            }
        });
        WindowView windowView2 = this.windowView;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -1, 49);
        this.swipeContainerLayoutParams = layoutParamsCreateFrame;
        windowView2.addView(webViewSwipeContainer2, layoutParamsCreateFrame);
        BotButtons botButtons = new BotButtons(getContext(), resourcesProvider) {
            @Override
            public void setTranslationY(float f) {
                super.setTranslationY(f);
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                if (!BotWebViewSheet.this.fullscreen && AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.botButtons = botButtons;
        botButtons.setOnButtonClickListener(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                BotWebViewSheet.m4834$r8$lambda$ewBebiJ2R2NkactmnJRNg89s(this.f$0, (Boolean) obj);
            }
        });
        this.botButtons.setOnResizeListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.swipeContainer.requestLayout();
            }
        });
        WindowView windowView3 = this.windowView;
        BotButtons botButtons2 = this.botButtons;
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-1, -2, 81);
        this.botButtonsLayoutParams = layoutParamsCreateFrame2;
        windowView3.addView(botButtons2, layoutParamsCreateFrame2);
        BotFullscreenButtons botFullscreenButtons = new BotFullscreenButtons(getContext());
        this.fullscreenButtons = botFullscreenButtons;
        botFullscreenButtons.setAlpha(0.0f);
        this.fullscreenButtons.setVisibility(8);
        boolean z = !MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        this.fullscreenBlur = z;
        this.fullscreenButtons.setParentRenderNode(z ? this.swipeContainer.getRenderNode() : null);
        this.windowView.addView(this.fullscreenButtons, LayoutHelper.createFrame(-1, -1, 119));
        this.fullscreenButtons.setOnCloseClickListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$M5BEncDjTgZnSI4YmOyPayJmPGw(this.f$0);
            }
        });
        this.fullscreenButtons.setOnCollapseClickListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.m4835$r8$lambda$fR_PZN517ustV5BvUIIAagrPik(this.f$0);
            }
        });
        this.fullscreenButtons.setOnMenuClickListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.openOptions();
            }
        });
        FrameLayout frameLayout = new FrameLayout(context);
        this.bulletinContainer = frameLayout;
        WindowView windowView4 = this.windowView;
        FrameLayout.LayoutParams layoutParamsCreateFrame3 = LayoutHelper.createFrame(-1, 200, 55);
        this.bulletinContainerLayoutParams = layoutParamsCreateFrame3;
        windowView4.addView(frameLayout, layoutParamsCreateFrame3);
        this.actionBarShadow = ContextCompat.getDrawable(getContext(), R.drawable.header_shadow).mutate();
        ActionBar actionBar = new ActionBar(context, resourcesProvider) {
            @Override
            protected void onMeasure(int i2, int i3) {
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(0);
        this.actionBar.setBackButtonImage(R.drawable.ic_close_white);
        updateActionBarColors();
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    BotWebViewSheet.this.onCheckDismissByUser();
                }
            }
        });
        this.actionBar.setAlpha(0.0f);
        WindowView windowView5 = this.windowView;
        ActionBar actionBar2 = this.actionBar;
        FrameLayout.LayoutParams layoutParamsCreateFrame4 = LayoutHelper.createFrame(-1, -2, 49);
        this.actionBarLayoutParams = layoutParamsCreateFrame4;
        windowView5.addView(actionBar2, layoutParamsCreateFrame4);
        WindowView windowView6 = this.windowView;
        ChatAttachAlertBotWebViewLayout.WebProgressView webProgressView = new ChatAttachAlertBotWebViewLayout.WebProgressView(context, resourcesProvider) {
            @Override
            protected void onMeasure(int i2, int i3) {
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.progressView = webProgressView;
        windowView6.addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        this.webViewContainer.setWebViewProgressListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                BotWebViewSheet.$r8$lambda$TLMgHLXuI5W2mDnn4Jv1jkQMfiI(this.f$0, (Float) obj);
            }
        });
        this.swipeContainer.addView(this.webViewContainer, LayoutHelper.createFrame(-1, -1.0f));
        this.swipeContainer.setScrollListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$7DuXWAd0jmekhu0lNMj_6O3pCN4(this.f$0);
            }
        });
        this.swipeContainer.setScrollEndListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.webViewContainer.invalidateViewPortHeight(true);
            }
        });
        this.swipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() {
            @Override
            public final void onDismiss(boolean z2) {
                BotWebViewSheet.$r8$lambda$Jq8hLUNxlqx0CFSALAX6DDFs32w(this.f$0, z2);
            }
        });
        this.swipeContainer.setIsKeyboardVisible(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return Boolean.valueOf(this.f$0.windowView.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
            }
        });
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.windowView.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
        updateFullscreenLayout();
        LaunchActivity launchActivity = LaunchActivity.instance;
        BottomSheetTabs bottomSheetTabs = launchActivity != null ? launchActivity.getBottomSheetTabs() : null;
        this.bottomTabs = bottomSheetTabs;
        if (bottomSheetTabs != null) {
            final WindowView windowView7 = this.windowView;
            Objects.requireNonNull(windowView7);
            bottomSheetTabs.listen(new Runnable() {
                @Override
                public final void run() {
                    windowView7.invalidate();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.relayout();
                }
            });
            this.bottomTabsClip = new BottomSheetTabs.ClipTools(this.bottomTabs);
        }
    }

    class AnonymousClass3 implements BotWebViewContainer.Delegate {
        private boolean sentWebViewData;
        final Context val$context;
        final Theme.ResourcesProvider val$resourcesProvider;

        @Override
        public void onInstantClose() {
            onCloseRequested(null);
        }

        @Override
        public void onWebAppBackgroundChanged(boolean z, int i) {
            BotWebViewContainer.Delegate.CC.$default$onWebAppBackgroundChanged(this, z, i);
        }

        @Override
        public void onWebAppReady() {
            BotWebViewContainer.Delegate.CC.$default$onWebAppReady(this);
        }

        AnonymousClass3(Context context, Theme.ResourcesProvider resourcesProvider) {
            this.val$context = context;
            this.val$resourcesProvider = resourcesProvider;
        }

        @Override
        public void onCloseRequested(Runnable runnable) {
            BotWebViewSheet.this.dismiss(runnable);
        }

        @Override
        public void onWebAppSetupClosingBehavior(boolean z) {
            BotWebViewSheet.this.needCloseConfirmation = z;
        }

        @Override
        public void onWebAppSwipingBehavior(boolean z) {
            if (BotWebViewSheet.this.swipeContainer != null) {
                BotWebViewSheet.this.swipeContainer.setAllowSwipes(z);
            }
        }

        @Override
        public void onCloseToTabs() {
            BotWebViewSheet.this.dismiss(true);
        }

        @Override
        public void onSharedTo(ArrayList arrayList) {
            final String pluralString;
            if (arrayList.size() == 1) {
                pluralString = LocaleController.formatString(R.string.BotSharedToOne, MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getPeerName(((Long) arrayList.get(0)).longValue()));
            } else {
                pluralString = LocaleController.formatPluralString("BotSharedToMany", arrayList.size(), new Object[0]);
            }
            BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ((BulletinFactory) obj).createSimpleBulletin(R.raw.forward, AndroidUtilities.replaceTags(pluralString));
                }
            });
        }

        @Override
        public void onOrientationLockChanged(boolean z) {
            BotWebViewSheet.this.lockOrientation(z);
        }

        @Override
        public void onOpenBackFromTabs() {
            if (BotWebViewSheet.this.lastTab != null) {
                BottomSheetTabs bottomSheetTabs = LaunchActivity.instance.getBottomSheetTabs();
                if (bottomSheetTabs != null) {
                    bottomSheetTabs.openTab(BotWebViewSheet.this.lastTab);
                }
                BotWebViewSheet.this.lastTab = null;
            }
        }

        @Override
        public void onSendWebViewData(String str) {
            if (BotWebViewSheet.this.queryId != 0 || this.sentWebViewData) {
                return;
            }
            this.sentWebViewData = true;
            TLRPC.TL_messages_sendWebViewData tL_messages_sendWebViewData = new TLRPC.TL_messages_sendWebViewData();
            tL_messages_sendWebViewData.bot = MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getInputUser(BotWebViewSheet.this.botId);
            tL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tL_messages_sendWebViewData.button_text = BotWebViewSheet.this.buttonText;
            tL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(BotWebViewSheet.this.currentAccount).sendRequest(tL_messages_sendWebViewData, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
                    BotWebViewSheet.AnonymousClass3.$r8$lambda$myU7bI2Kw3CgIowXiy6nFWy6FAo(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$myU7bI2Kw3CgIowXiy6nFWy6FAo(AnonymousClass3 anonymousClass3, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
            anonymousClass3.getClass();
            if (tLObject instanceof TLRPC.TL_updates) {
                MessagesController.getInstance(BotWebViewSheet.this.currentAccount).processUpdates((TLRPC.TL_updates) tLObject, false);
            }
            final BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    botWebViewSheet.dismiss();
                }
            });
        }

        @Override
        public void onWebAppSetActionBarColor(int i, int i2, boolean z) {
            BotWebViewSheet.this.actionBarColorKey = i;
            BotWebViewSheet.this.setActionBarColor(i2, z, true);
        }

        @Override
        public void onWebAppSetNavigationBarColor(int i) {
            BotWebViewSheet.this.setNavigationBarColor(i, true);
        }

        @Override
        public void onWebAppSetBackgroundColor(int i) {
            BotWebViewSheet.this.setBackgroundColor(i, true, true);
        }

        @Override
        public void onLocationGranted(boolean z) {
            final TLRPC.User user = MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getUser(Long.valueOf(BotWebViewSheet.this.botId));
            if (z) {
                final BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
                undoObject.undoText = LocaleController.getString(R.string.UndoNoCaps);
                undoObject.onUndo = new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewSheet.AnonymousClass3 anonymousClass3 = this.f$0;
                        BotLocation.get(BotWebViewSheet.this.getContext(), BotWebViewSheet.this.currentAccount, BotWebViewSheet.this.botId).setGranted(false, null);
                    }
                };
                BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        TLRPC.User user2 = user;
                        return ((BulletinFactory) obj).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestGranted, UserObject.getUserName(user2))), null, undoObject).setDuration(5000);
                    }
                });
                return;
            }
            final SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotLocationPermissionRequestDeniedApp, UserObject.getUserName(user))));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append(AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.BotLocationPermissionRequestDeniedAppSettings), new Runnable() {
                @Override
                public final void run() {
                    BotWebViewSheet.AnonymousClass3.$r8$lambda$BbLuqxB613MCxrpSmywZANwEhw0(this.f$0);
                }
            }), true));
            BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ((BulletinFactory) obj).createSimpleBulletinDetail(R.raw.error, spannableStringBuilder).setDuration(5000);
                }
            });
        }

        public static void $r8$lambda$BbLuqxB613MCxrpSmywZANwEhw0(AnonymousClass3 anonymousClass3) {
            anonymousClass3.getClass();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment == null || safeLastFragment.getParentLayout() == null) {
                return;
            }
            INavigationLayout parentLayout = safeLastFragment.getParentLayout();
            safeLastFragment.presentFragment(ProfileActivity.of(BotWebViewSheet.this.botId));
            AndroidUtilities.scrollToFragmentRow(parentLayout, "botPermissionLocation");
            BotWebViewSheet.this.dismiss(true);
        }

        @Override
        public void onEmojiStatusGranted(boolean z) {
            final TLRPC.User user = MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getUser(Long.valueOf(BotWebViewSheet.this.botId));
            if (z) {
                final BulletinFactory.UndoObject undoObject = new BulletinFactory.UndoObject();
                undoObject.onUndo = new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewSheet.AnonymousClass3.$r8$lambda$TnL23fOEsU9628ru1WC1tk7GYzU(this.f$0);
                    }
                };
                BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        TLRPC.User user2 = user;
                        return ((BulletinFactory) obj).createUsersBulletin(Arrays.asList(user2), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotEmojiStatusPermissionRequestGranted, UserObject.getUserName(user2))), null, undoObject).setDuration(5000);
                    }
                });
            }
        }

        public static void $r8$lambda$TnL23fOEsU9628ru1WC1tk7GYzU(final AnonymousClass3 anonymousClass3) {
            anonymousClass3.getClass();
            TL_bots.toggleUserEmojiStatusPermission toggleuseremojistatuspermission = new TL_bots.toggleUserEmojiStatusPermission();
            toggleuseremojistatuspermission.bot = MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getInputUser(BotWebViewSheet.this.botId);
            toggleuseremojistatuspermission.enabled = false;
            ConnectionsManager.getInstance(BotWebViewSheet.this.currentAccount).sendRequest(toggleuseremojistatuspermission, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotWebViewSheet.AnonymousClass3.m4844$r8$lambda$fEFGszjyeIAu6gdwzeKpB3XYc0(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m4844$r8$lambda$fEFGszjyeIAu6gdwzeKpB3XYc0(final AnonymousClass3 anonymousClass3, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            anonymousClass3.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewSheet.AnonymousClass3.$r8$lambda$xHld8dUoXulEwo2exy4wQYcxEiY(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$xHld8dUoXulEwo2exy4wQYcxEiY(AnonymousClass3 anonymousClass3, TLObject tLObject, final TLRPC.TL_error tL_error) {
            anonymousClass3.getClass();
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                BotWebViewSheet.this.webViewContainer.notifyEmojiStatusAccess("cancelled");
            } else {
                BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        return ((BulletinFactory) obj).makeForError(tL_error);
                    }
                });
            }
        }

        @Override
        public void onEmojiStatusSet(final TLRPC.Document document) {
            BotWebViewSheet.this.showBulletin(new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return ((BulletinFactory) obj).createEmojiBulletin(document, LocaleController.getString(R.string.BotEmojiStatusUpdated));
                }
            });
        }

        @Override
        public void onSetBackButtonVisible(boolean z) {
            AndroidUtilities.updateImageViewImageAnimated(BotWebViewSheet.this.actionBar.getBackButton(), BotWebViewSheet.this.backButtonShown = z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
            if (BotWebViewSheet.this.fullscreenButtons != null) {
                BotWebViewSheet.this.fullscreenButtons.setBack(z, true);
            }
        }

        @Override
        public void onSetSettingsButtonVisible(boolean z) {
            BotWebViewSheet.this.hasSettings = z;
        }

        @Override
        public void onWebAppOpenInvoice(TLRPC.InputInvoice inputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
            if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
                AndroidUtilities.hideKeyboard(BotWebViewSheet.this.windowView);
                final AlertDialog alertDialog = new AlertDialog(BotWebViewSheet.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController.getInstance(BotWebViewSheet.this.currentAccount).openPaymentForm(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new Runnable() {
                    @Override
                    public final void run() {
                        alertDialog.dismiss();
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate(str, (String) obj);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.PaymentForm) {
                TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                MessagesController.getInstance(BotWebViewSheet.this.currentAccount).putUsers(paymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(paymentForm, str, lastFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC.PaymentReceipt ? new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                BotWebViewSheet.this.swipeContainer.stickTo((-BotWebViewSheet.this.swipeContainer.getOffsetY()) + BotWebViewSheet.this.swipeContainer.getTopActionBarOffsetY());
                AndroidUtilities.hideKeyboard(BotWebViewSheet.this.windowView);
                final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(this.val$context, this.val$resourcesProvider);
                overlayActionBarLayoutDialog.show();
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                    @Override
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        BotWebViewSheet.AnonymousClass3.m4843$r8$lambda$8pBhQdIMbkPrhPqtjcb8kZMRoY(this.f$0, overlayActionBarLayoutDialog, str, invoiceStatus);
                    }
                });
                paymentFormActivity.setResourcesProvider(this.val$resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        public static void m4843$r8$lambda$8pBhQdIMbkPrhPqtjcb8kZMRoY(AnonymousClass3 anonymousClass3, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
            anonymousClass3.getClass();
            if (invoiceStatus != PaymentFormActivity.InvoiceStatus.PENDING) {
                overlayActionBarLayoutDialog.dismiss();
            }
            BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate(str, invoiceStatus.name().toLowerCase(Locale.ROOT));
        }

        @Override
        public void onWebAppExpand() {
            if (BotWebViewSheet.this.swipeContainer.isSwipeInProgress()) {
                return;
            }
            BotWebViewSheet.this.swipeContainer.stickTo((-BotWebViewSheet.this.swipeContainer.getOffsetY()) + BotWebViewSheet.this.swipeContainer.getTopActionBarOffsetY());
        }

        @Override
        public void onWebAppSwitchInlineQuery(final TLRPC.User user, final String str, List list) {
            if (list.isEmpty()) {
                if (BotWebViewSheet.this.parentActivity instanceof LaunchActivity) {
                    BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
                    if (lastFragment instanceof ChatActivity) {
                        ((ChatActivity) lastFragment).getChatActivityEnterView().setFieldText("@" + UserObject.getPublicUsername(user) + " " + str);
                        BotWebViewSheet.this.dismiss();
                        return;
                    }
                    return;
                }
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("dialogsType", 14);
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("allowGroups", list.contains("groups"));
            bundle.putBoolean("allowMegagroups", list.contains("groups"));
            bundle.putBoolean("allowLegacyGroups", list.contains("groups"));
            bundle.putBoolean("allowUsers", list.contains("users"));
            bundle.putBoolean("allowChannels", list.contains("channels"));
            bundle.putBoolean("allowBots", list.contains("bots"));
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            AndroidUtilities.hideKeyboard(BotWebViewSheet.this.windowView);
            final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(this.val$context, this.val$resourcesProvider);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                }

                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
                    return BotWebViewSheet.AnonymousClass3.$r8$lambda$fMO885C8eMmaldFRumsKPL8wOwI(this.f$0, user, str, overlayActionBarLayoutDialog, dialogsActivity2, arrayList, charSequence, z, z2, i, i2, topicsFragment);
                }

                @Override
                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }

        public static boolean $r8$lambda$fMO885C8eMmaldFRumsKPL8wOwI(AnonymousClass3 anonymousClass3, TLRPC.User user, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
            anonymousClass3.getClass();
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
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(user) + " " + str);
            if (BotWebViewSheet.this.parentActivity instanceof LaunchActivity) {
                BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
                if (MessagesController.getInstance(BotWebViewSheet.this.currentAccount).checkCanOpenChat(bundle, lastFragment)) {
                    overlayActionBarLayoutDialog.dismiss();
                    BotWebViewSheet.this.dismissed = true;
                    AndroidUtilities.cancelRunOnUIThread(BotWebViewSheet.this.pollRunnable);
                    BotWebViewSheet.this.webViewContainer.destroyWebView();
                    NotificationCenter.getInstance(BotWebViewSheet.this.currentAccount).removeObserver(BotWebViewSheet.this, NotificationCenter.webViewResultSent);
                    NotificationCenter.getGlobalInstance().removeObserver(BotWebViewSheet.this, NotificationCenter.didSetNewTheme);
                    if (!BotWebViewSheet.this.superDismissed) {
                        BotWebViewSheet.super.dismiss();
                        BotWebViewSheet.this.superDismissed = true;
                    }
                    lastFragment.presentFragment(new INavigationLayout.NavigationParams(new ChatActivity(bundle)).setRemoveLast(true));
                }
            }
            return true;
        }

        @Override
        public void onSetupMainButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
            BotWebViewSheet.this.botButtons.setMainState(BotButtons.ButtonState.of(z, z2, z3, z4, str, j, i, i2), true);
            if (BotWebViewSheet.this.fullscreen) {
                BotWebViewSheet.this.updateFullscreenLayout();
                BotWebViewSheet.this.updateWindowFlags();
            }
        }

        @Override
        public void onSetupSecondaryButton(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
            BotWebViewSheet.this.botButtons.setSecondaryState(BotButtons.ButtonState.of(z, z2, z3, z4, str, j, i, i2, str2), true);
            if (BotWebViewSheet.this.fullscreen) {
                BotWebViewSheet.this.updateFullscreenLayout();
                BotWebViewSheet.this.updateWindowFlags();
            }
        }

        @Override
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(BotWebViewSheet.this.currentAccount).botInAttachMenu(BotWebViewSheet.this.botId) || MessagesController.getInstance(BotWebViewSheet.this.currentAccount).whitelistedBots.contains(Long.valueOf(BotWebViewSheet.this.botId));
        }

        @Override
        public String onFullscreenRequested(boolean z, boolean z2) {
            if (BotWebViewSheet.this.fullscreen == z) {
                if (BotWebViewSheet.this.fullscreen) {
                    return "ALREADY_FULLSCREEN";
                }
                return null;
            }
            BotWebViewSheet.this.setFullscreen(z, true, z2);
            return null;
        }

        @Override
        public BotSensors getBotSensors() {
            if (BotWebViewSheet.this.sensors == null) {
                BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                botWebViewSheet.sensors = new BotSensors(this.val$context, botWebViewSheet.botId);
                BotWebViewSheet.this.sensors.attachWebView(BotWebViewSheet.this.webViewContainer.getWebView());
            }
            return BotWebViewSheet.this.sensors;
        }
    }

    public static void $r8$lambda$2ViQsPiJsDlJWGhZODW4vSVsAtc(BotWebViewSheet botWebViewSheet, int i, boolean z) {
        botWebViewSheet.getClass();
        if (i > AndroidUtilities.dp(20.0f)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = botWebViewSheet.swipeContainer;
            webViewSwipeContainer.stickTo((-webViewSwipeContainer.getOffsetY()) + botWebViewSheet.swipeContainer.getTopActionBarOffsetY());
        }
    }

    public static void m4834$r8$lambda$ewBebiJ2R2NkactmnJRNg89s(BotWebViewSheet botWebViewSheet, Boolean bool) {
        if (botWebViewSheet.webViewContainer != null) {
            if (bool.booleanValue()) {
                botWebViewSheet.webViewContainer.onMainButtonPressed();
            } else {
                botWebViewSheet.webViewContainer.onSecondaryButtonPressed();
            }
        }
    }

    public static void $r8$lambda$M5BEncDjTgZnSI4YmOyPayJmPGw(BotWebViewSheet botWebViewSheet) {
        if (botWebViewSheet.webViewContainer.onBackPressed()) {
            return;
        }
        botWebViewSheet.onCheckDismissByUser();
    }

    public static void m4835$r8$lambda$fR_PZN517ustV5BvUIIAagrPik(BotWebViewSheet botWebViewSheet) {
        botWebViewSheet.forceExpnaded = true;
        botWebViewSheet.dismiss(true, null);
    }

    public static void $r8$lambda$TLMgHLXuI5W2mDnn4Jv1jkQMfiI(final BotWebViewSheet botWebViewSheet, Float f) {
        botWebViewSheet.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.progressView.setVisibility(8);
                }
            });
            duration.start();
        }
    }

    public static void $r8$lambda$7DuXWAd0jmekhu0lNMj_6O3pCN4(BotWebViewSheet botWebViewSheet) {
        if (botWebViewSheet.swipeContainer.getSwipeOffsetY() > 0.0f) {
            botWebViewSheet.dimPaint.setAlpha((int) ((1.0f - MathUtils.clamp(botWebViewSheet.swipeContainer.getSwipeOffsetY() / botWebViewSheet.swipeContainer.getHeight(), 0.0f, 1.0f)) * 64.0f));
        } else {
            botWebViewSheet.dimPaint.setAlpha(64);
        }
        botWebViewSheet.windowView.invalidate();
        botWebViewSheet.webViewContainer.invalidateViewPortHeight();
        if (botWebViewSheet.springAnimation != null) {
            float f = (1.0f - (Math.min(botWebViewSheet.swipeContainer.getTopActionBarOffsetY(), botWebViewSheet.swipeContainer.getTranslationY() - botWebViewSheet.swipeContainer.getTopActionBarOffsetY()) / botWebViewSheet.swipeContainer.getTopActionBarOffsetY()) > 0.5f ? 1 : 0) * 100.0f;
            if (botWebViewSheet.springAnimation.getSpring().getFinalPosition() != f) {
                botWebViewSheet.springAnimation.getSpring().setFinalPosition(f);
                botWebViewSheet.springAnimation.start();
            }
        }
        if (botWebViewSheet.fullscreen) {
            int i = botWebViewSheet.insets.bottom;
        } else {
            Math.max(0.0f, botWebViewSheet.swipeContainer.getSwipeOffsetY());
        }
        botWebViewSheet.lastSwipeTime = System.currentTimeMillis();
    }

    public static void $r8$lambda$Jq8hLUNxlqx0CFSALAX6DDFs32w(BotWebViewSheet botWebViewSheet, boolean z) {
        if (botWebViewSheet.fullscreen && z) {
            return;
        }
        botWebViewSheet.dismiss(true, null);
    }

    public boolean isGuardBotTab(long j, long j2) {
        WebViewRequestProps webViewRequestProps = this.requestProps;
        if (webViewRequestProps != null && webViewRequestProps.type == 5) {
            long j3 = webViewRequestProps.peerId;
            if (j3 == j || j3 == 0) {
                TLObject tLObject = webViewRequestProps.response;
                if ((tLObject instanceof TLRPC.TL_webViewResultUrl) && ((TLRPC.TL_webViewResultUrl) tLObject).query_id == j2) {
                    return true;
                }
            }
        }
        return false;
    }

    public void relayout() {
        updateFullscreenLayout();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).addOverlayPasscodeView(this.passcodeView);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        Context context = getContext();
        if ((context instanceof ContextWrapper) && !(context instanceof LaunchActivity)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (context instanceof LaunchActivity) {
            ((LaunchActivity) context).removeOverlayPasscodeView(this.passcodeView);
        }
    }

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

    public void updateActionBarColors() {
        if (!this.overrideActionBarColor) {
            ActionBar actionBar = this.actionBar;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            actionBar.setTitleColor(getColor(i));
            this.actionBar.setItemsColor(getColor(i), false);
            this.actionBar.setItemsBackgroundColor(getColor(Theme.key_actionBarWhiteSelector), false);
            this.actionBar.setPopupBackgroundColor(getColor(Theme.key_actionBarDefaultSubmenuBackground), false);
            this.actionBar.setPopupItemsColor(getColor(Theme.key_actionBarDefaultSubmenuItem), false, false);
            this.actionBar.setPopupItemsColor(getColor(Theme.key_actionBarDefaultSubmenuItemIcon), true, false);
            this.actionBar.setPopupItemsSelectorColor(getColor(Theme.key_dialogButtonSelector), false);
        }
        this.webViewContainer.setFlickerViewColor(this.backgroundPaint.getColor());
    }

    private void updateLightStatusBar() {
        boolean z = true;
        if (this.overrideActionBarColor) {
            z = true ^ this.actionBarIsLight;
        } else {
            int color = Theme.getColor(Theme.key_windowBackgroundWhite, null, true);
            if (AndroidUtilities.isTablet() || ColorUtils.calculateLuminance(color) < 0.7210000157356262d || this.actionBarTransitionProgress < 0.85f) {
                z = false;
            }
        }
        Boolean bool = this.wasLightStatusBar;
        if (bool == null || bool.booleanValue() != z) {
            this.wasLightStatusBar = Boolean.valueOf(z);
            if (Build.VERSION.SDK_INT >= 23) {
                int systemUiVisibility = this.windowView.getSystemUiVisibility();
                this.windowView.setSystemUiVisibility(z ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            }
        }
    }

    @Override
    protected void onCreate(Bundle bundle) {
        BotButtons botButtons;
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        int i2 = attributes.flags;
        int i3 = i2 & (-3);
        attributes.flags = i3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        if (this.fullscreen) {
            attributes.flags = i3 | 512;
        } else {
            attributes.flags = i2 & (-515);
        }
        window.setAttributes(attributes);
        if (i >= 23) {
            window.setStatusBarColor(0);
        }
        this.windowView.setFitsSystemWindows(true);
        this.windowView.setSystemUiVisibility(1792);
        this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                return BotWebViewSheet.m4841$r8$lambda$vtQLlun3FEzMs2jxFqv4zCQD3I(this.f$0, view, windowInsets);
            }
        });
        if (this.fullscreen && ((botButtons = this.botButtons) == null || botButtons.getTotalHeight() <= 0)) {
            WindowView windowView = this.windowView;
            windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() | 2);
        } else {
            WindowView windowView2 = this.windowView;
            windowView2.setSystemUiVisibility(windowView2.getSystemUiVisibility() & (-3));
        }
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(this, ColorUtils.calculateLuminance(this.navBarColor) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.botDownloadsUpdate);
    }

    public static WindowInsets m4841$r8$lambda$vtQLlun3FEzMs2jxFqv4zCQD3I(BotWebViewSheet botWebViewSheet, View view, WindowInsets windowInsets) {
        botWebViewSheet.getClass();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        botWebViewSheet.navInsets.set(insets.left, insets.top, insets.right, insets.bottom);
        Insets insets2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.displayCutout() | WindowInsetsCompat.Type.systemBars());
        botWebViewSheet.insets.set(Math.max(insets2.left, windowInsets.getStableInsetLeft()), Math.max(insets2.top, windowInsets.getStableInsetTop()), Math.max(insets2.right, windowInsets.getStableInsetRight()), Math.max(insets2.bottom, windowInsets.getStableInsetBottom()));
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            Rect rect = botWebViewSheet.insets;
            rect.top = Math.max(rect.top, AndroidUtilities.getStatusBarHeight(botWebViewSheet.getContext()));
        }
        int i2 = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom;
        if (i2 > botWebViewSheet.insets.bottom && i2 > AndroidUtilities.dp(20.0f)) {
            botWebViewSheet.keyboardInset = i2;
        } else {
            botWebViewSheet.keyboardInset = 0;
        }
        botWebViewSheet.updateFullscreenLayout();
        if (i >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    public void updateFullscreenLayout() {
        BotButtons botButtons;
        this.fullscreenButtons.setInsets(this.insets);
        if (this.fullscreen) {
            BotButtons botButtons2 = this.botButtons;
            int i = (botButtons2 == null || botButtons2.getTotalHeight() <= 0) ? 0 : this.insets.bottom;
            BotWebViewContainer botWebViewContainer = this.webViewContainer;
            Rect rect = this.insets;
            botWebViewContainer.reportSafeInsets(new Rect(rect.left, rect.top, rect.right, (this.keyboardInset <= i && ((botButtons = this.botButtons) == null || botButtons.getTotalHeight() <= 0)) ? this.insets.bottom : 0), AndroidUtilities.dp(46.0f));
            this.windowView.setPadding(0, 0, 0, Math.max(this.keyboardInset, i));
        } else {
            this.webViewContainer.reportSafeInsets(new Rect(0, 0, 0, 0), 0);
            WindowView windowView = this.windowView;
            Rect rect2 = this.insets;
            int i2 = rect2.left;
            int i3 = rect2.right;
            int i4 = this.keyboardInset;
            BottomSheetTabs bottomSheetTabs = this.bottomTabs;
            windowView.setPadding(i2, 0, i3, Math.max(i4, (bottomSheetTabs != null ? bottomSheetTabs.getHeight(false) : 0) + this.insets.bottom));
        }
        this.swipeContainerLayoutParams.topMargin = AndroidUtilities.dp(24.0f);
        FrameLayout.LayoutParams layoutParams = this.actionBarLayoutParams;
        boolean z = this.fullscreen;
        layoutParams.leftMargin = !z ? 0 : this.insets.left;
        layoutParams.rightMargin = 0;
        FrameLayout.LayoutParams layoutParams2 = this.bulletinContainerLayoutParams;
        layoutParams2.leftMargin = !z ? 0 : this.insets.left;
        layoutParams2.rightMargin = !z ? 0 : this.insets.right;
        if (!this.fullscreenInProgress) {
            this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
            if (this.fullscreen) {
                this.swipeContainer.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                this.swipeContainer.setTopActionBarOffsetY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
            }
            this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
            this.swipeContainer.invalidateTranslation();
            this.swipeContainer.invalidate();
            this.swipeContainer.requestLayout();
        }
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        if (webViewSwipeContainer != null) {
            webViewSwipeContainer.setFullSize(isFullSize());
        }
        this.botButtons.requestLayout();
        this.windowView.requestLayout();
        this.fullscreenButtons.setVisibility(this.fullscreen ? 0 : 8);
    }

    public void updateWindowFlags() {
        BotButtons botButtons;
        try {
            Window window = getWindow();
            if (window == null) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT <= 28 ? 1024 : 512;
            boolean z = this.fullscreen;
            if (z) {
                attributes.flags = i | attributes.flags;
            } else {
                attributes.flags = (~i) & attributes.flags;
            }
            if (z && (((botButtons = this.botButtons) == null || botButtons.getTotalHeight() <= 0) && !this.windowView.drawingFromOverlay)) {
                WindowView windowView = this.windowView;
                windowView.setSystemUiVisibility(windowView.getSystemUiVisibility() | 2);
            } else {
                WindowView windowView2 = this.windowView;
                windowView2.setSystemUiVisibility(windowView2.getSystemUiVisibility() & (-3));
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setAttached(true);
        if (this.springAnimation == null) {
            this.springAnimation = new SpringAnimation(this, ACTION_BAR_TRANSITION_PROGRESS_VALUE).setSpring(new SpringForce().setStiffness(1200.0f).setDampingRatio(1.0f));
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAttached(false);
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.springAnimation = null;
        }
    }

    public static JSONObject makeThemeParams(Theme.ResourcesProvider resourcesProvider) {
        return makeThemeParams(resourcesProvider, false);
    }

    public static JSONObject makeThemeParams(Theme.ResourcesProvider resourcesProvider, final boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            final int iBlendOver = Theme.blendOver(-16777216, Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            Utilities.CallbackReturn callbackReturn = new Utilities.CallbackReturn() {
                @Override
                public final Object run(Object obj) {
                    return BotWebViewSheet.$r8$lambda$qMLFitaQ3GBOlJN23I1tK38FGRE(iBlendOver, z, (Integer) obj);
                }
            };
            jSONObject.put("bg_color", callbackReturn.run(Integer.valueOf(iBlendOver)));
            jSONObject.put("section_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider))));
            int i = Theme.key_windowBackgroundGray;
            jSONObject.put("secondary_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(i, resourcesProvider))));
            jSONObject.put("text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider))));
            jSONObject.put("hint_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider))));
            jSONObject.put("link_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider))));
            jSONObject.put("button_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider))));
            jSONObject.put("button_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider))));
            jSONObject.put("header_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_actionBarDefault, resourcesProvider))));
            jSONObject.put("accent_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider))));
            jSONObject.put("section_header_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider))));
            jSONObject.put("subtitle_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider))));
            jSONObject.put("destructive_text_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_text_RedRegular, resourcesProvider))));
            jSONObject.put("section_separator_color", callbackReturn.run(Integer.valueOf(Theme.getColor(Theme.key_divider, resourcesProvider))));
            jSONObject.put("bottom_bar_bg_color", callbackReturn.run(Integer.valueOf(Theme.getColor(i, resourcesProvider))));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    public static Object $r8$lambda$qMLFitaQ3GBOlJN23I1tK38FGRE(int i, boolean z, Integer num) {
        int iBlendOver = Theme.blendOver(i, num.intValue());
        return z ? String.format(Locale.US, "#%02X%02X%02X", Integer.valueOf(Color.red(iBlendOver)), Integer.valueOf(Color.green(iBlendOver)), Integer.valueOf(Color.blue(iBlendOver))) : Integer.valueOf(iBlendOver);
    }

    public void setDefaultFullsize(boolean z) {
        if (this.defaultFullsize != z) {
            this.defaultFullsize = z;
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
            if (webViewSwipeContainer != null) {
                webViewSwipeContainer.setFullSize(isFullSize());
            }
        }
    }

    public void setWasOpenedByLinkIntent(boolean z) {
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        if (botWebViewContainer != null) {
            botWebViewContainer.setWasOpenedByLinkIntent(z);
        }
    }

    public void setNeedsContext(boolean z) {
        this.needsContext = z;
    }

    public boolean isFullSize() {
        if (this.fullscreen) {
            return true;
        }
        Boolean bool = this.fullsize;
        if (bool == null) {
            return this.defaultFullsize;
        }
        return bool.booleanValue();
    }

    public void setOnVerifiedAge(Utilities.Callback4 callback4) {
        this.onVerifiedAge = callback4;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        if (botWebViewContainer != null) {
            botWebViewContainer.setOnVerifiedAge(callback4);
        }
    }

    public void requestWebView(BaseFragment baseFragment, WebViewRequestProps webViewRequestProps) {
        TLRPC.User user;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList;
        int size;
        int i;
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TLRPC.InputPeer inputPeer;
        TLRPC.InputPeer inputPeer2;
        TL_bots.botAppSettings botappsettings;
        this.requestProps = webViewRequestProps;
        int i2 = webViewRequestProps.currentAccount;
        this.currentAccount = i2;
        this.peerId = webViewRequestProps.peerId;
        this.botId = webViewRequestProps.botId;
        this.replyToMsgId = webViewRequestProps.replyToMsgId;
        this.monoforumTopicId = webViewRequestProps.monoforumTopicId;
        this.silent = webViewRequestProps.silent;
        this.buttonText = webViewRequestProps.buttonText;
        this.currentWebApp = webViewRequestProps.app;
        TLRPC.User user2 = MessagesController.getInstance(i2).getUser(Long.valueOf(this.botId));
        CharSequence userName = UserObject.getUserName(user2);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
            while (true) {
                if (i >= size) {
                    tL_attachMenuBot = null;
                    break;
                }
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                i++;
                TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
                if (tL_attachMenuBot3.bot_id == this.botId) {
                    tL_attachMenuBot = tL_attachMenuBot3;
                    break;
                }
            }
        } catch (Exception unused) {
        }
        this.actionBar.setTitle(userName);
        TLRPC.UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.botId);
        if ((user2 != null && user2.verified) || (userFull != null && (user = userFull.user) != null && user.verified)) {
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.verifiedDrawable = drawableMutate;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.verifiedDrawable.setAlpha(255);
            this.actionBar.getTitleTextView().setDrawablePadding(AndroidUtilities.dp(2.0f));
            this.actionBar.getTitleTextView().setRightDrawable(new Drawable() {
                @Override
                public int getOpacity() {
                    return -2;
                }

                @Override
                public void draw(Canvas canvas) {
                    canvas.save();
                    canvas.translate(0.0f, AndroidUtilities.dp(1.0f));
                    BotWebViewSheet.this.verifiedDrawable.setBounds(getBounds());
                    BotWebViewSheet.this.verifiedDrawable.draw(canvas);
                    canvas.restore();
                }

                @Override
                public void setAlpha(int i3) {
                    BotWebViewSheet.this.verifiedDrawable.setAlpha(i3);
                }

                @Override
                public void setColorFilter(ColorFilter colorFilter) {
                    BotWebViewSheet.this.verifiedDrawable.setColorFilter(colorFilter);
                }

                @Override
                public int getIntrinsicHeight() {
                    return AndroidUtilities.dp(20.0f);
                }

                @Override
                public int getIntrinsicWidth() {
                    return AndroidUtilities.dp(20.0f);
                }
            });
        }
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setName(UserObject.getUserName(user2), user2 != null && user2.verified);
        }
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        actionBarMenuCreateMenu.removeAllViews();
        arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        size = arrayList.size();
        i = 0;
        if (!this.fromTab) {
            if (userFull != null) {
                TL_bots.BotInfo botInfo = userFull.bot_info;
                if (botInfo != null && (botappsettings = botInfo.app_settings) != null) {
                    applyAppBotSettings(botappsettings, false);
                }
            } else {
                MessagesController.getInstance(this.currentAccount).loadFullUser(user2, 0, true, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotWebViewSheet.$r8$lambda$fBKGo6Od6UNrJAoe2nza7cBwQ4Y(this.f$0, (TLRPC.UserFull) obj);
                    }
                });
            }
            if (webViewRequestProps.fullscreen) {
                setFullscreen(true, false);
            }
        }
        if (this.onVerifiedAge == null) {
            actionBarMenuCreateMenu.addItem(R.id.menu_collapse_bot, R.drawable.arrow_more);
        }
        BotFullscreenButtons.OptionsIcon optionsIcon = new BotFullscreenButtons.OptionsIcon(getContext());
        this.optionsIcon = optionsIcon;
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, optionsIcon);
        this.optionsItem = actionBarMenuItemAddItem;
        actionBarMenuItemAddItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.openOptions();
            }
        });
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    if (BotWebViewSheet.this.webViewContainer.onBackPressed()) {
                        return;
                    }
                    BotWebViewSheet.this.onCheckDismissByUser();
                } else if (i3 == R.id.menu_collapse_bot) {
                    BotWebViewSheet.this.forceExpnaded = true;
                    BotWebViewSheet.this.dismiss(true, null);
                }
            }
        });
        JSONObject jSONObjectMakeThemeParams = makeThemeParams(this.resourcesProvider);
        this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, null);
        preloadShortcutBotIcon(webViewRequestProps.botUser, tL_attachMenuBot);
        if (webViewRequestProps.response != null) {
            loadFromResponse();
            return;
        }
        int i3 = webViewRequestProps.type;
        if (i3 == 0) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.peerId);
            tL_messages_requestWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestWebView.platform = "android";
            tL_messages_requestWebView.compact = webViewRequestProps.compact;
            tL_messages_requestWebView.fullscreen = webViewRequestProps.fullscreen;
            String str = webViewRequestProps.buttonUrl;
            if (str != null) {
                tL_messages_requestWebView.url = str;
                tL_messages_requestWebView.flags |= 2;
            }
            if (this.replyToMsgId != 0) {
                TLRPC.InputReplyTo inputReplyToCreateReplyInput = SendMessagesHelper.getInstance(this.currentAccount).createReplyInput(this.replyToMsgId);
                tL_messages_requestWebView.reply_to = inputReplyToCreateReplyInput;
                if (this.monoforumTopicId != 0) {
                    inputReplyToCreateReplyInput.monoforum_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(this.monoforumTopicId);
                    tL_messages_requestWebView.reply_to.flags |= 32;
                }
                tL_messages_requestWebView.flags |= 1;
            } else if (this.monoforumTopicId != 0) {
                TLRPC.TL_inputReplyToMonoForum tL_inputReplyToMonoForum = new TLRPC.TL_inputReplyToMonoForum();
                tL_messages_requestWebView.reply_to = tL_inputReplyToMonoForum;
                tL_inputReplyToMonoForum.monoforum_peer_id = MessagesController.getInstance(this.currentAccount).getInputPeer(this.monoforumTopicId);
                tL_messages_requestWebView.flags |= 1;
            }
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotWebViewSheet.$r8$lambda$7bOzMO4zM_k5yhpQfuOxPVVSDJ0(this.f$0, tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i3 == 1) {
            TLRPC.TL_messages_requestSimpleWebView tL_messages_requestSimpleWebView = new TLRPC.TL_messages_requestSimpleWebView();
            tL_messages_requestSimpleWebView.from_switch_webview = (webViewRequestProps.flags & 1) != 0;
            tL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestSimpleWebView.platform = "android";
            tL_messages_requestSimpleWebView.from_side_menu = (webViewRequestProps.flags & 2) != 0;
            tL_messages_requestSimpleWebView.compact = webViewRequestProps.compact;
            tL_messages_requestSimpleWebView.fullscreen = webViewRequestProps.fullscreen;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                tL_messages_requestSimpleWebView.theme_params = tL_dataJSON2;
                tL_dataJSON2.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.buttonUrl)) {
                tL_messages_requestSimpleWebView.flags |= 8;
                tL_messages_requestSimpleWebView.url = webViewRequestProps.buttonUrl;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tL_messages_requestSimpleWebView.start_param = webViewRequestProps.startParam;
                tL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestSimpleWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotWebViewSheet.$r8$lambda$Sj1S6q0C4fnxXD3192gI_o89zuY(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        if (i3 == 2) {
            TLRPC.TL_messages_requestWebView tL_messages_requestWebView2 = new TLRPC.TL_messages_requestWebView();
            tL_messages_requestWebView2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tL_messages_requestWebView2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
            tL_messages_requestWebView2.platform = "android";
            tL_messages_requestWebView2.compact = webViewRequestProps.compact;
            tL_messages_requestWebView2.fullscreen = webViewRequestProps.fullscreen;
            tL_messages_requestWebView2.url = webViewRequestProps.buttonUrl;
            tL_messages_requestWebView2.flags |= 2;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON3 = new TLRPC.TL_dataJSON();
                tL_messages_requestWebView2.theme_params = tL_dataJSON3;
                tL_dataJSON3.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestWebView2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotWebViewSheet.m4830$r8$lambda$2toRd11VFnE3AHJJG6hSdIaDyY(this.f$0, tLObject, tL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
            return;
        }
        if (i3 == 3) {
            TLRPC.TL_messages_requestAppWebView tL_messages_requestAppWebView = new TLRPC.TL_messages_requestAppWebView();
            TLRPC.TL_inputBotAppID tL_inputBotAppID = new TLRPC.TL_inputBotAppID();
            TLRPC.BotApp botApp = webViewRequestProps.app;
            tL_inputBotAppID.id = botApp.id;
            tL_inputBotAppID.access_hash = botApp.access_hash;
            tL_messages_requestAppWebView.app = tL_inputBotAppID;
            tL_messages_requestAppWebView.write_allowed = webViewRequestProps.allowWrite;
            tL_messages_requestAppWebView.platform = "android";
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                inputPeer = chatActivity.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity.getCurrentUser()) : MessagesController.getInputPeer(chatActivity.getCurrentChat());
            } else {
                inputPeer = MessagesController.getInputPeer(webViewRequestProps.botUser);
            }
            tL_messages_requestAppWebView.peer = inputPeer;
            tL_messages_requestAppWebView.compact = webViewRequestProps.compact;
            tL_messages_requestAppWebView.fullscreen = webViewRequestProps.fullscreen;
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tL_messages_requestAppWebView.start_param = webViewRequestProps.startParam;
                tL_messages_requestAppWebView.flags |= 2;
            }
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON4 = new TLRPC.TL_dataJSON();
                tL_messages_requestAppWebView.theme_params = tL_dataJSON4;
                tL_dataJSON4.data = jSONObjectMakeThemeParams.toString();
                tL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestAppWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    BotWebViewSheet.$r8$lambda$4mbuQMnBUlZu4xbcBH44nX5JMzU(this.f$0, tLObject, tL_error);
                }
            }, 66);
            return;
        }
        if (i3 != 4) {
            if (i3 != 5) {
                return;
            }
            TLRPC.TL_messages_requestChatJoinWebView tL_messages_requestChatJoinWebView = new TLRPC.TL_messages_requestChatJoinWebView();
            tL_messages_requestChatJoinWebView.platform = "android";
            tL_messages_requestChatJoinWebView.query_id = webViewRequestProps.queryId;
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON5 = new TLRPC.TL_dataJSON();
                tL_messages_requestChatJoinWebView.theme_params = tL_dataJSON5;
                tL_dataJSON5.data = jSONObjectMakeThemeParams.toString();
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_requestChatJoinWebView, new AiTonesController$$ExternalSyntheticLambda0(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    BotWebViewSheet.$r8$lambda$lK4iuZbve1UUYqNjTepLPS9YXTM(this.f$0, (TLRPC.TL_webViewResultUrl) obj, (TLRPC.TL_error) obj2);
                }
            }, 66);
            return;
        }
        TLRPC.TL_messages_requestMainWebView tL_messages_requestMainWebView = new TLRPC.TL_messages_requestMainWebView();
        tL_messages_requestMainWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(webViewRequestProps.botId);
        tL_messages_requestMainWebView.platform = "android";
        if (baseFragment instanceof ChatActivity) {
            ChatActivity chatActivity2 = (ChatActivity) baseFragment;
            inputPeer2 = chatActivity2.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity2.getCurrentUser()) : MessagesController.getInputPeer(chatActivity2.getCurrentChat());
        } else {
            inputPeer2 = MessagesController.getInstance(this.currentAccount).getInputPeer(webViewRequestProps.peerId);
        }
        tL_messages_requestMainWebView.peer = inputPeer2;
        tL_messages_requestMainWebView.compact = webViewRequestProps.compact;
        tL_messages_requestMainWebView.fullscreen = webViewRequestProps.fullscreen;
        if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
            tL_messages_requestMainWebView.start_param = webViewRequestProps.startParam;
            tL_messages_requestMainWebView.flags |= 2;
        }
        if (jSONObjectMakeThemeParams != null) {
            TLRPC.TL_dataJSON tL_dataJSON6 = new TLRPC.TL_dataJSON();
            tL_messages_requestMainWebView.theme_params = tL_dataJSON6;
            tL_dataJSON6.data = jSONObjectMakeThemeParams.toString();
            tL_messages_requestMainWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_requestMainWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                BotWebViewSheet.m4836$r8$lambda$jBosqiv3J4I4wRQVsICB99VHX0(this.f$0, tLObject, tL_error);
            }
        }, 66);
    }

    public static void $r8$lambda$fBKGo6Od6UNrJAoe2nza7cBwQ4Y(final BotWebViewSheet botWebViewSheet, final TLRPC.UserFull userFull) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$7vWFi9Lv5SHrt49VTvIMgqWbpYs(this.f$0, userFull);
            }
        });
    }

    public static void $r8$lambda$7vWFi9Lv5SHrt49VTvIMgqWbpYs(BotWebViewSheet botWebViewSheet, TLRPC.UserFull userFull) {
        TL_bots.BotInfo botInfo;
        TL_bots.botAppSettings botappsettings;
        botWebViewSheet.getClass();
        if (userFull == null || (botInfo = userFull.bot_info) == null || (botappsettings = botInfo.app_settings) == null) {
            return;
        }
        botWebViewSheet.applyAppBotSettings(botappsettings, true);
    }

    public static void m4830$r8$lambda$2toRd11VFnE3AHJJG6hSdIaDyY(final BotWebViewSheet botWebViewSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$pGnC9i_CCFqcIl3iIAOKaWBvcbI(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$pGnC9i_CCFqcIl3iIAOKaWBvcbI(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tLObject);
            botWebViewSheet.loadFromResponse();
        }
    }

    public static void $r8$lambda$Sj1S6q0C4fnxXD3192gI_o89zuY(final BotWebViewSheet botWebViewSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$rCgHYUSwEtBZMeOl43lvSSnMWGc(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$rCgHYUSwEtBZMeOl43lvSSnMWGc(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tLObject);
            botWebViewSheet.loadFromResponse();
        }
    }

    public static void $r8$lambda$7bOzMO4zM_k5yhpQfuOxPVVSDJ0(final BotWebViewSheet botWebViewSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$2UwJM5LA1eCPelpmqetXzFKpW94(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$2UwJM5LA1eCPelpmqetXzFKpW94(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tLObject);
            botWebViewSheet.loadFromResponse();
        }
    }

    public static void $r8$lambda$4mbuQMnBUlZu4xbcBH44nX5JMzU(final BotWebViewSheet botWebViewSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$Nnxme6TNNcYBB2JMDO0fPeGVAKI(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$Nnxme6TNNcYBB2JMDO0fPeGVAKI(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tLObject);
            botWebViewSheet.loadFromResponse();
        }
    }

    public static void m4836$r8$lambda$jBosqiv3J4I4wRQVsICB99VHX0(final BotWebViewSheet botWebViewSheet, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        botWebViewSheet.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$4IT9yoW1iAJoPsfw2I_EDfXmoCI(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$4IT9yoW1iAJoPsfw2I_EDfXmoCI(BotWebViewSheet botWebViewSheet, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tLObject);
            botWebViewSheet.loadFromResponse();
        }
    }

    public static void $r8$lambda$lK4iuZbve1UUYqNjTepLPS9YXTM(BotWebViewSheet botWebViewSheet, TLRPC.TL_webViewResultUrl tL_webViewResultUrl, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            botWebViewSheet.getClass();
            return;
        }
        WebViewRequestProps webViewRequestProps = botWebViewSheet.requestProps;
        if (webViewRequestProps != null) {
            webViewRequestProps.applyResponse(tL_webViewResultUrl);
            botWebViewSheet.loadFromResponse();
        }
    }

    public void openOptions() {
        TLRPC.TL_attachMenuBot tL_attachMenuBot;
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i = 0;
        do {
            if (i >= size) {
                tL_attachMenuBot = null;
                break;
            } else {
                TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i);
                i++;
                tL_attachMenuBot = tL_attachMenuBot2;
            }
        } while (tL_attachMenuBot.bot_id != this.botId);
        ItemOptions itemOptions = this.options;
        if (itemOptions != null) {
            itemOptions.dismiss();
        }
        final ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions((ViewGroup) this.windowView, this.resourcesProvider, this.fullscreen ? this.fullscreenButtons : this.optionsItem, true);
        this.options = itemOptionsMakeOptions;
        BotDownloads botDownloads = BotDownloads.get(getContext(), this.currentAccount, this.botId);
        this.fileItems.clear();
        if (botDownloads.hasFiles()) {
            final ItemOptions itemOptionsMakeSwipeback = itemOptionsMakeOptions.makeSwipeback();
            itemOptionsMakeSwipeback.add(R.drawable.msg_arrow_back, LocaleController.getString(R.string.Back), new ChatActivity$$ExternalSyntheticLambda333(itemOptionsMakeOptions));
            itemOptionsMakeSwipeback.addGap();
            ArrayList files = botDownloads.getFiles();
            int size2 = files.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj = files.get(i2);
                i2++;
                BotDownloads.FileDownload fileDownload = (BotDownloads.FileDownload) obj;
                this.fileItems.put(fileDownload, itemOptionsMakeSwipeback.add(fileDownload.file_name, "", new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewSheet.$r8$lambda$m1zU1JXk5NQS_jqubrgOPHU3MyI();
                    }
                }).getLast());
            }
            updateDownloadBulletin();
            itemOptionsMakeSwipeback.setMinWidth(AndroidUtilities.dp(180.0f));
            itemOptionsMakeOptions.add(R.drawable.menu_download_round, LocaleController.getString(R.string.BotDownloads), new Runnable() {
                @Override
                public final void run() {
                    itemOptionsMakeOptions.openSwipeback(itemOptionsMakeSwipeback);
                }
            });
            itemOptionsMakeOptions.addGap();
        }
        itemOptionsMakeOptions.addIf(this.onVerifiedAge == null, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.$r8$lambda$eO_luktvuTr04NKMJR2LQUN6W5Y(this.f$0);
            }
        }).addIf(this.onVerifiedAge == null && this.hasSettings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings), new Runnable() {
            @Override
            public final void run() {
                this.f$0.webViewContainer.onSettingsButtonPressed();
            }
        }).add(R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.m4829$r8$lambda$BiRon4FW4qOOI_E6GWeWg89tAw(this.f$0);
            }
        }).addIf(this.onVerifiedAge == null && user != null && user.bot_has_main_app, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet botWebViewSheet = this.f$0;
                MediaDataController.getInstance(botWebViewSheet.currentAccount).installShortcut(botWebViewSheet.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
            }
        }).addIf(this.onVerifiedAge == null, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS), new Runnable() {
            @Override
            public final void run() {
                Browser.openUrl(this.f$0.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
            }
        }).addIf(this.onVerifiedAge == null, R.drawable.msg_report, LocaleController.getString(R.string.BotWebViewReportBot), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet botWebViewSheet = this.f$0;
                ReportBottomSheet.openChat(botWebViewSheet.currentAccount, botWebViewSheet.getContext(), BulletinFactory.of(Bulletin.BulletinWindow.make(botWebViewSheet.getContext()), botWebViewSheet.resourcesProvider), botWebViewSheet.botId);
            }
        }).addIf(this.onVerifiedAge == null && tL_attachMenuBot != null && (tL_attachMenuBot.show_in_side_menu || tL_attachMenuBot.show_in_attach_menu), R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet botWebViewSheet = this.f$0;
                BotWebViewSheet.deleteBot(botWebViewSheet.currentAccount, botWebViewSheet.botId, new Runnable() {
                    @Override
                    public final void run() {
                        botWebViewSheet.dismiss();
                    }
                });
            }
        });
        if (this.actionBarColor != Theme.getColor(Theme.key_windowBackgroundWhite)) {
            int i3 = AndroidUtilities.computePerceivedBrightness(this.actionBarColor) >= 0.721f ? -1 : -15198183;
            int i4 = AndroidUtilities.computePerceivedBrightness(i3) >= 0.721f ? -16777216 : -1;
            int iMultAlpha = Theme.multAlpha(i4, 0.85f);
            int iMultAlpha2 = Theme.multAlpha(i4, 0.1f);
            itemOptionsMakeOptions.setBackgroundColor(i3);
            for (int i5 = 0; i5 < itemOptionsMakeOptions.getItemsCount(); i5++) {
                View itemAt = itemOptionsMakeOptions.getItemAt(i5);
                if (itemAt instanceof ActionBarMenuSubItem) {
                    ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) itemAt;
                    actionBarMenuSubItem.setColors(i4, iMultAlpha);
                    actionBarMenuSubItem.setSelectorColor(iMultAlpha2);
                }
            }
        }
        itemOptionsMakeOptions.setGravity(5).translate(-this.insets.right, 0.0f).forceTop(true).setDrawScrim(false).setDimAlpha(0).show();
    }

    public static void $r8$lambda$eO_luktvuTr04NKMJR2LQUN6W5Y(BotWebViewSheet botWebViewSheet) {
        Activity activity = botWebViewSheet.parentActivity;
        if (activity instanceof LaunchActivity) {
            ((LaunchActivity) activity).presentFragment(ChatActivity.of(botWebViewSheet.botId));
        }
        botWebViewSheet.dismiss(true);
    }

    public static void m4829$r8$lambda$BiRon4FW4qOOI_E6GWeWg89tAw(BotWebViewSheet botWebViewSheet) {
        if (botWebViewSheet.webViewContainer.getWebView() != null) {
            botWebViewSheet.webViewContainer.getWebView().animate().cancel();
            botWebViewSheet.webViewContainer.getWebView().animate().alpha(0.0f).start();
        }
        botWebViewSheet.progressView.setLoadProgress(0.0f);
        botWebViewSheet.progressView.setAlpha(1.0f);
        botWebViewSheet.progressView.setVisibility(0);
        botWebViewSheet.webViewContainer.setBotUser(MessagesController.getInstance(botWebViewSheet.currentAccount).getUser(Long.valueOf(botWebViewSheet.botId)));
        botWebViewSheet.webViewContainer.loadFlickerAndSettingsItem(botWebViewSheet.currentAccount, botWebViewSheet.botId, null);
        botWebViewSheet.webViewContainer.reload();
    }

    public void showBulletin(Utilities.CallbackReturn callbackReturn) {
        ((Bulletin) callbackReturn.run(BulletinFactory.of(this.bulletinContainer, this.resourcesProvider))).show(true);
    }

    public void updateDownloadBulletinArrow() {
        BotDownloads.DownloadBulletin downloadBulletin = this.downloadBulletinLayout;
        if (downloadBulletin == null) {
            return;
        }
        if (this.fullscreen) {
            downloadBulletin.setArrow(AndroidUtilities.lerp(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(26.0f), this.fullscreenProgress));
        } else if (this.actionBarTransitionProgress > 0.5f) {
            downloadBulletin.setArrow(AndroidUtilities.dp(24.0f));
        } else {
            downloadBulletin.setArrow(-1);
        }
    }

    private void updateDownloadBulletin() {
        Bulletin bulletin;
        BotDownloads botDownloads = BotDownloads.get(getContext(), this.currentAccount, this.botId);
        BotDownloads.FileDownload current = botDownloads.getCurrent();
        if (current == null) {
            Bulletin bulletin2 = this.downloadBulletin;
            if (bulletin2 != null) {
                bulletin2.hide();
                this.downloadBulletin = null;
            }
        } else if ((current.isDownloading() && !current.shown) || current.resaved) {
            if (this.lastBulletinFile != current && (bulletin = this.downloadBulletin) != null) {
                bulletin.hide();
                this.downloadBulletin = null;
            }
            Bulletin bulletin3 = this.downloadBulletin;
            if (bulletin3 == null || !bulletin3.isShowing()) {
                this.lastBulletinFile = current;
                FrameLayout frameLayout = this.bulletinContainer;
                BotDownloads.DownloadBulletin downloadBulletin = new BotDownloads.DownloadBulletin(getContext(), this.resourcesProvider);
                this.downloadBulletinLayout = downloadBulletin;
                Bulletin bulletinMake = Bulletin.make(frameLayout, downloadBulletin, 5000);
                this.downloadBulletin = bulletinMake;
                bulletinMake.show(true);
            }
            if (this.downloadBulletinLayout.set(current)) {
                this.downloadBulletin = null;
            }
            current.resaved = false;
            current.shown = true;
        } else {
            BotDownloads.DownloadBulletin downloadBulletin2 = this.downloadBulletinLayout;
            if (downloadBulletin2 != null) {
                this.lastBulletinFile = current;
                if (downloadBulletin2.set(current)) {
                    this.downloadBulletin = null;
                }
            }
        }
        updateDownloadBulletinArrow();
        for (Map.Entry entry : this.fileItems.entrySet()) {
            ActionBarMenuSubItem actionBarMenuSubItem = (ActionBarMenuSubItem) entry.getValue();
            final BotDownloads.FileDownload fileDownload = (BotDownloads.FileDownload) entry.getKey();
            actionBarMenuSubItem.setText(fileDownload.file_name);
            if (!fileDownload.isDownloading()) {
                actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(fileDownload.size));
            } else {
                Pair progress = fileDownload.getProgress();
                if (((Long) progress.second).longValue() > 0) {
                    actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()) + " / " + AndroidUtilities.formatFileSize(((Long) progress.second).longValue()));
                } else {
                    actionBarMenuSubItem.setSubtext(AndroidUtilities.formatFileSize(((Long) progress.first).longValue()));
                }
            }
            if (fileDownload.isDownloading()) {
                actionBarMenuSubItem.setRightIcon(R.drawable.msg_close);
                actionBarMenuSubItem.subtextView.setPadding(0, 0, AndroidUtilities.dp(32.0f), 0);
            } else if (fileDownload.cancelled) {
                actionBarMenuSubItem.setVisibility(8);
            } else {
                actionBarMenuSubItem.setRightIcon(0);
                actionBarMenuSubItem.subtextView.setPadding(0, 0, 0, 0);
            }
            actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotWebViewSheet.m4840$r8$lambda$vGsI7GPbISv81TdixovJBFoc(this.f$0, fileDownload, view);
                }
            });
        }
        this.optionsIcon.setDownloading(botDownloads.isDownloading());
        this.fullscreenButtons.setDownloading(botDownloads.isDownloading());
    }

    public static void m4840$r8$lambda$vGsI7GPbISv81TdixovJBFoc(BotWebViewSheet botWebViewSheet, BotDownloads.FileDownload fileDownload, View view) {
        botWebViewSheet.getClass();
        if (fileDownload.isDownloading()) {
            fileDownload.cancel();
        } else {
            fileDownload.open();
        }
        ItemOptions itemOptions = botWebViewSheet.options;
        if (itemOptions != null) {
            itemOptions.dismiss();
            botWebViewSheet.options = null;
        }
    }

    private void applyAppBotSettings(TL_bots.botAppSettings botappsettings, boolean z) {
        if (botappsettings == null) {
            return;
        }
        boolean zIsCurrentThemeDark = Theme.isCurrentThemeDark();
        int i = botappsettings.flags;
        boolean z2 = ((zIsCurrentThemeDark ? 4 : 2) & i) != 0;
        if ((i & (zIsCurrentThemeDark ? 16 : 8)) != 0) {
            setActionBarColor((zIsCurrentThemeDark ? botappsettings.header_dark_color : botappsettings.header_color) | (-16777216), true, z);
        }
        if (z2) {
            setBackgroundColor((zIsCurrentThemeDark ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), true, z);
            setNavigationBarColor((zIsCurrentThemeDark ? botappsettings.background_dark_color : botappsettings.background_color) | (-16777216), z);
        }
    }

    private void loadFromResponse() {
        boolean z;
        if (this.requestProps == null) {
            return;
        }
        long jMax = Math.max(0L, 60000 - (System.currentTimeMillis() - this.requestProps.responseTime));
        String str = null;
        this.fullsize = null;
        TLObject tLObject = this.requestProps.response;
        if (tLObject instanceof TLRPC.TL_webViewResultUrl) {
            TLRPC.TL_webViewResultUrl tL_webViewResultUrl = (TLRPC.TL_webViewResultUrl) tLObject;
            this.queryId = tL_webViewResultUrl.query_id;
            str = tL_webViewResultUrl.url;
            z = tL_webViewResultUrl.same_origin;
            this.fullsize = Boolean.valueOf(tL_webViewResultUrl.fullsize);
            boolean z2 = this.fromTab;
            if (!z2) {
                setFullscreen(tL_webViewResultUrl.fullscreen, !z2);
            }
        } else {
            if (tLObject instanceof TLRPC.TL_appWebViewResultUrl) {
                this.queryId = 0L;
                str = ((TLRPC.TL_appWebViewResultUrl) tLObject).url;
            } else if (tLObject instanceof TLRPC.TL_simpleWebViewResultUrl) {
                this.queryId = 0L;
                str = ((TLRPC.TL_simpleWebViewResultUrl) tLObject).url;
            }
            z = false;
        }
        if (z) {
            this.webViewContainer.setTrustedOrigin(str);
        }
        if (str != null && !this.fromTab) {
            MediaDataController.getInstance(this.currentAccount).increaseWebappRating(this.requestProps.botId);
            this.webViewContainer.loadUrl(this.currentAccount, str, z);
        }
        AndroidUtilities.runOnUIThread(this.pollRunnable, jMax);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        if (webViewSwipeContainer != null) {
            webViewSwipeContainer.setFullSize(isFullSize());
        }
    }

    private void preloadShortcutBotIcon(TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        if (tL_attachMenuBot == null || !tL_attachMenuBot.show_in_side_menu || MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            return;
        }
        if (user == null) {
            user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        }
        if (user == null || user.photo == null || FileLoader.getInstance(this.currentAccount).getPathToAttach(user.photo.photo_small, true).exists()) {
            return;
        }
        MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForUser(this.currentAccount, user, 1), 0);
    }

    public static void deleteBot(final int i, final long j, final Runnable runnable) {
        final TLRPC.TL_attachMenuBot tL_attachMenuBot;
        ArrayList<TLRPC.TL_attachMenuBot> arrayList = MediaDataController.getInstance(i).getAttachMenuBots().bots;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                tL_attachMenuBot = null;
                break;
            }
            TLRPC.TL_attachMenuBot tL_attachMenuBot2 = arrayList.get(i2);
            i2++;
            TLRPC.TL_attachMenuBot tL_attachMenuBot3 = tL_attachMenuBot2;
            if (tL_attachMenuBot3.bot_id == j) {
                tL_attachMenuBot = tL_attachMenuBot3;
                break;
            }
        }
        if (tL_attachMenuBot == null) {
            return;
        }
        new AlertDialog.Builder(LaunchActivity.getLastFragment().getContext()).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BotRemoveFromMenu, tL_attachMenuBot.short_name))).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i3) {
                BotWebViewSheet.m4839$r8$lambda$uIn1j0k8zAK1QSr4PfDD44GQQo(i, j, tL_attachMenuBot, runnable, alertDialog, i3);
            }
        }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
    }

    public static void m4839$r8$lambda$uIn1j0k8zAK1QSr4PfDD44GQQo(final int i, long j, TLRPC.TL_attachMenuBot tL_attachMenuBot, Runnable runnable, AlertDialog alertDialog, int i2) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(j);
        tL_messages_toggleBotInAttachMenu.enabled = false;
        ConnectionsManager.getInstance(i).sendRequest(tL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        MediaDataController.getInstance(i).loadAttachMenuBots(false, true);
                    }
                });
            }
        }, 66);
        tL_attachMenuBot.show_in_side_menu = false;
        NotificationCenter.getInstance(i).postNotificationName(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
        MediaDataController.getInstance(i).uninstallShortcut(j, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        if (runnable != null) {
            runnable.run();
        }
    }

    public int getColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            setOpen(true);
            this.windowView.setAlpha(0.0f);
            this.windowView.addOnLayoutChangeListener(new AnonymousClass11());
            super.show();
            this.superDismissed = false;
            activeSheets.add(this);
        }
    }

    class AnonymousClass11 implements View.OnLayoutChangeListener {
        AnonymousClass11() {
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            BotWebViewSheet.this.swipeContainer.setSwipeOffsetY(BotWebViewSheet.this.swipeContainer.getHeight());
            BotWebViewSheet.this.windowView.setAlpha(1.0f);
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.showOffsetY != Float.MAX_VALUE) {
                botWebViewSheet.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
                BotWebViewSheet.this.swipeContainer.setOffsetY(BotWebViewSheet.this.showOffsetY);
                BotWebViewSheet.this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
            }
            BotWebViewSheet.this.webViewContainer.invalidateViewPortHeight(true, true);
            final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
            animationNotificationsLocker.lock();
            BotWebViewSheet botWebViewSheet2 = BotWebViewSheet.this;
            if (botWebViewSheet2.showExpanded || botWebViewSheet2.isFullSize()) {
                BotWebViewSheet.this.swipeContainer.stickTo((-BotWebViewSheet.this.swipeContainer.getOffsetY()) + BotWebViewSheet.this.swipeContainer.getTopActionBarOffsetY(), new Runnable() {
                    @Override
                    public final void run() {
                        animationNotificationsLocker.unlock();
                    }
                });
            } else {
                ((SpringAnimation) new SpringAnimation(BotWebViewSheet.this.swipeContainer, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.SWIPE_OFFSET_Y, 0.0f).setSpring(new SpringForce(0.0f).setDampingRatio(0.75f).setStiffness(500.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                        animationNotificationsLocker.unlock();
                    }
                })).start();
            }
            BotWebViewSheet.this.swipeContainer.opened = true;
            if (!BotWebViewSheet.this.fullscreen || BotWebViewSheet.this.fullscreenButtons == null) {
                return;
            }
            BotWebViewSheet.this.fullscreenButtons.setAlpha(0.0f);
            BotWebViewSheet.this.fullscreenButtons.animate().alpha(1.0f).setDuration(220L).start();
        }
    }

    @Override
    public void dismiss(boolean z) {
        dismiss(z, null);
    }

    public long getBotId() {
        return this.botId;
    }

    @Override
    public void onBackPressed() {
        if (this.passcodeView.getVisibility() == 0) {
            if (getOwnerActivity() != null) {
                getOwnerActivity().finish();
            }
        } else {
            if (this.webViewContainer.onBackPressed()) {
                return;
            }
            dismiss(true, null);
        }
    }

    @Override
    public void dismiss() {
        dismiss((Runnable) null);
    }

    public boolean onCheckDismissByUser() {
        if (this.needCloseConfirmation) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    this.f$0.dismiss();
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            alertDialogCreate.show();
            ((TextView) alertDialogCreate.getButton(-1)).setTextColor(getColor(Theme.key_text_RedBold));
            return false;
        }
        dismiss();
        return true;
    }

    public void dismiss(Runnable runnable) {
        dismiss(false, runnable);
    }

    public void dismiss(boolean z, final Runnable runnable) {
        LaunchActivity launchActivity;
        if (this.dismissed) {
            return;
        }
        if (this.onVerifiedAge != null) {
            z = false;
        }
        this.dismissed = true;
        setOpen(false);
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.botDownloadsUpdate);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        if (z && ((launchActivity = LaunchActivity.instance) == null || launchActivity.getBottomSheetTabsOverlay() == null)) {
            z = false;
        }
        if (z) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.getSpring().setFinalPosition(0.0f);
                this.springAnimation.start();
            }
            LaunchActivity.instance.getBottomSheetTabsOverlay().dismissSheet(this);
        } else {
            BotButtons botButtons = this.botButtons;
            if (botButtons != null) {
                botButtons.animate().translationY(this.botButtons.getTotalHeight()).alpha(0.0f).setDuration(160L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            }
            this.webViewContainer.destroyWebView();
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
            int height = webViewSwipeContainer.getHeight();
            BotButtons botButtons2 = this.botButtons;
            int totalHeight = height + (botButtons2 != null ? botButtons2.getTotalHeight() : 0);
            Rect rect = this.insets;
            webViewSwipeContainer.stickTo(totalHeight + rect.top + rect.bottom + this.windowView.measureKeyboardHeight() + (isFullSize() ? AndroidUtilities.dp(200.0f) : 0), true, new Runnable() {
                @Override
                public final void run() {
                    BotWebViewSheet.$r8$lambda$4XcgsZt1NVsfydKhthMcKarBoIg(this.f$0, runnable);
                }
            });
        }
        activeSheets.remove(this);
    }

    public static void $r8$lambda$4XcgsZt1NVsfydKhthMcKarBoIg(BotWebViewSheet botWebViewSheet, Runnable runnable) {
        if (!botWebViewSheet.superDismissed) {
            super.dismiss();
            botWebViewSheet.superDismissed = true;
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void release() {
        if (this.superDismissed) {
            return;
        }
        try {
            super.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        setOpen(false);
    }

    public void setOpen(final boolean z) {
        ValueAnimator valueAnimator = this.openAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (Math.abs(this.openedProgress - (z ? 1.0f : 0.0f)) < 0.01f) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.openedProgress, z ? 1.0f : 0.0f);
        this.openAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                BotWebViewSheet.this.openedProgress = z ? 1.0f : 0.0f;
                BotWebViewSheet.this.checkNavBarColor();
            }
        });
        this.openAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                BotWebViewSheet.$r8$lambda$pmzPIzpIn_ZMxRulAwcPnX4m75Y(this.f$0, valueAnimator2);
            }
        });
        this.openAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.openAnimator.setDuration(220L);
        this.openAnimator.start();
    }

    public static void $r8$lambda$pmzPIzpIn_ZMxRulAwcPnX4m75Y(BotWebViewSheet botWebViewSheet, ValueAnimator valueAnimator) {
        botWebViewSheet.getClass();
        botWebViewSheet.openedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        botWebViewSheet.checkNavBarColor();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                dismiss();
                return;
            }
            return;
        }
        if (i == NotificationCenter.didSetNewTheme) {
            this.windowView.invalidate();
            this.webViewContainer.updateFlickerBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            updateActionBarColors();
            updateLightStatusBar();
            return;
        }
        if (i == NotificationCenter.botDownloadsUpdate) {
            updateDownloadBulletin();
        }
    }

    public static int navigationBarColor(int i) {
        return Theme.adaptHSV(i, 0.35f, -0.1f);
    }

    public void setBackgroundColor(final int i, boolean z, boolean z2) {
        final int color = this.backgroundPaint.getColor();
        this.overrideBackgroundColor = z;
        ValueAnimator valueAnimator = this.backgroundColorAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            this.backgroundColorAnimator = duration;
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.backgroundColorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BotWebViewSheet.$r8$lambda$DJ0eWX6RU5bQzuTjpi_9usuMnXQ(this.f$0, color, i, valueAnimator2);
                }
            });
            this.backgroundColorAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.backgroundPaint.setColor(i);
                    BotWebViewSheet.this.updateActionBarColors();
                    BotWebViewSheet.this.windowView.invalidate();
                    if (BotWebViewSheet.this.errorContainer != null) {
                        BotWebViewSheet.this.errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(BotWebViewSheet.this.backgroundPaint.getColor()) <= 0.721f, false);
                        BotWebViewSheet.this.errorContainer.setBackgroundColor(BotWebViewSheet.this.backgroundPaint.getColor());
                    }
                    BotWebViewSheet.this.updateWebViewBackgroundColor();
                }
            });
            this.backgroundColorAnimator.start();
            return;
        }
        this.backgroundPaint.setColor(i);
        updateActionBarColors();
        this.windowView.invalidate();
        ArticleViewer.ErrorContainer errorContainer = this.errorContainer;
        if (errorContainer != null) {
            errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(this.backgroundPaint.getColor()) <= 0.721f, false);
            this.errorContainer.setBackgroundColor(this.backgroundPaint.getColor());
        }
        updateWebViewBackgroundColor();
    }

    public static void $r8$lambda$DJ0eWX6RU5bQzuTjpi_9usuMnXQ(BotWebViewSheet botWebViewSheet, int i, int i2, ValueAnimator valueAnimator) {
        botWebViewSheet.backgroundPaint.setColor(ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        botWebViewSheet.updateActionBarColors();
        botWebViewSheet.windowView.invalidate();
        ArticleViewer.ErrorContainer errorContainer = botWebViewSheet.errorContainer;
        if (errorContainer != null) {
            errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(botWebViewSheet.backgroundPaint.getColor()) <= 0.721f, false);
            botWebViewSheet.errorContainer.setBackgroundColor(botWebViewSheet.backgroundPaint.getColor());
        }
        botWebViewSheet.updateWebViewBackgroundColor();
    }

    public void updateWebViewBackgroundColor() {
        BotWebViewContainer.MyWebView webView;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        if (botWebViewContainer == null || (webView = botWebViewContainer.getWebView()) == null) {
            return;
        }
        webView.setBackgroundColor(this.backgroundPaint.getColor());
    }

    public void setFullscreen(boolean z, boolean z2) {
        setFullscreen(z, z2, this.fullscreenBlur);
    }

    public void setFullscreen(final boolean z, boolean z2, boolean z3) {
        float fMin;
        if (this.fullscreen == z) {
            return;
        }
        this.fullscreen = z;
        this.fullscreenBlur = z3 && !MessagesController.getInstance(this.currentAccount).disableBotFullscreenBlur && SharedConfig.getDevicePerformanceClass() >= 2;
        ValueAnimator valueAnimator = this.fullscreenAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        BotFullscreenButtons botFullscreenButtons = this.fullscreenButtons;
        if (botFullscreenButtons != null) {
            botFullscreenButtons.setPreview(z, z2);
            this.fullscreenButtons.setParentRenderNode(this.fullscreenBlur ? this.swipeContainer.getRenderNode() : null);
        }
        this.swipeContainerFromWidth = this.swipeContainer.getWidth();
        this.swipeContainerFromHeight = this.swipeContainer.getHeight();
        this.resetOffsetY = false;
        if (z2) {
            updateFullscreenLayout();
            updateWindowFlags();
            updateDownloadBulletinArrow();
            if (!AndroidUtilities.isTablet() || AndroidUtilities.isInMultiwindow || AndroidUtilities.isSmallTablet()) {
                fMin = 0.0f;
            } else {
                Point point = AndroidUtilities.displaySize;
                int i = point.x;
                fMin = (i - ((int) (Math.min(i, point.y) * 0.8f))) / 2.0f;
            }
            final float f = z ? this.insets.left + fMin : (-this.insets.left) - fMin;
            if (!z) {
                fMin = -fMin;
            }
            final float f2 = fMin;
            final float translationY = z ? this.swipeContainer.getTranslationY() : -AndroidUtilities.dp(24.0f);
            final float currentActionBarHeight = z ? -AndroidUtilities.dp(24.0f) : (ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f);
            final float currentActionBarHeight2 = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
            this.swipeContainer.cancelStickTo();
            this.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
            this.actionBar.setVisibility(0);
            if (z) {
                this.swipeContainer.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
            } else {
                this.swipeContainer.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
            }
            this.swipeContainer.invalidateTranslation();
            this.swipeContainer.invalidate();
            this.fullscreenTransitionProgress = 0.0f;
            float f3 = z ? 0.0f : 1.0f;
            this.fullscreenProgress = f3;
            this.actionBar.setAlpha(1.0f - f3);
            this.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * this.fullscreenProgress);
            this.swipeContainer.setTranslationY(AndroidUtilities.lerp(translationY, currentActionBarHeight, this.fullscreenTransitionProgress));
            this.swipeContainer.setTranslationX(AndroidUtilities.lerp(f, 0.0f, this.fullscreenTransitionProgress));
            this.botButtons.setTranslationX(AndroidUtilities.lerp(f2, 0.0f, this.fullscreenTransitionProgress));
            this.fullscreenButtons.setAlpha(this.fullscreenProgress);
            this.windowView.invalidate();
            this.webViewContainer.setViewPortHeightOffset(this.swipeContainer.getTranslationY() - currentActionBarHeight);
            this.webViewContainer.invalidateViewPortHeight(false, false);
            this.fullscreenInProgress = true;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.fullscreenAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    BotWebViewSheet.this.fullscreenTransitionProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                    botWebViewSheet.fullscreenProgress = z ? botWebViewSheet.fullscreenTransitionProgress : 1.0f - botWebViewSheet.fullscreenTransitionProgress;
                    BotWebViewSheet.this.actionBar.setAlpha(1.0f - BotWebViewSheet.this.fullscreenProgress);
                    BotWebViewSheet.this.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * BotWebViewSheet.this.fullscreenProgress);
                    BotWebViewSheet.this.swipeContainer.setTranslationY(AndroidUtilities.lerp(translationY, currentActionBarHeight, BotWebViewSheet.this.fullscreenTransitionProgress));
                    BotWebViewSheet.this.swipeContainer.setTranslationX(AndroidUtilities.lerp(f, 0.0f, BotWebViewSheet.this.fullscreenTransitionProgress));
                    BotWebViewSheet.this.botButtons.setTranslationX(AndroidUtilities.lerp(f2, 0.0f, BotWebViewSheet.this.fullscreenTransitionProgress));
                    BotWebViewSheet.this.fullscreenButtons.setAlpha(BotWebViewSheet.this.fullscreenProgress);
                    BotWebViewSheet.this.windowView.invalidate();
                    BotWebViewSheet.this.webViewContainer.setViewPortHeightOffset(BotWebViewSheet.this.swipeContainer.getTranslationY() - currentActionBarHeight);
                    BotWebViewSheet.this.webViewContainer.invalidateViewPortHeight(false, false);
                    BotWebViewSheet.this.updateDownloadBulletinArrow();
                }
            });
            this.fullscreenAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.fullscreenInProgress = false;
                    if (z) {
                        BotWebViewSheet.this.swipeContainer.setForceOffsetY(-AndroidUtilities.dp(24.0f));
                        BotWebViewSheet.this.swipeContainer.setTopActionBarOffsetY(-AndroidUtilities.dp(24.0f));
                        BotWebViewSheet.this.swipeContainer.setSwipeOffsetY(0.0f);
                    } else {
                        BotWebViewSheet.this.updateFullscreenLayout();
                        BotWebViewSheet.this.updateWindowFlags();
                        BotWebViewSheet.this.swipeContainer.setForceOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
                        BotWebViewSheet.this.swipeContainer.setTopActionBarOffsetY(currentActionBarHeight2 - AndroidUtilities.dp(24.0f));
                        BotWebViewSheet.this.swipeContainer.setSwipeOffsetY(0.0f);
                    }
                    BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
                    botWebViewSheet.fullscreenProgress = z ? botWebViewSheet.fullscreenTransitionProgress : 1.0f - botWebViewSheet.fullscreenTransitionProgress;
                    BotWebViewSheet.this.actionBar.setAlpha(1.0f - BotWebViewSheet.this.fullscreenProgress);
                    BotWebViewSheet.this.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * BotWebViewSheet.this.fullscreenProgress);
                    BotWebViewSheet.this.fullscreenButtons.setAlpha(BotWebViewSheet.this.fullscreenProgress);
                    if (z) {
                        BotWebViewSheet.this.actionBar.setVisibility(8);
                    }
                    BotWebViewSheet.this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
                    BotWebViewSheet.this.swipeContainer.setTranslationX(AndroidUtilities.lerp(f, 0.0f, BotWebViewSheet.this.fullscreenTransitionProgress));
                    BotWebViewSheet.this.botButtons.setTranslationX(0.0f);
                    BotWebViewSheet.this.windowView.invalidate();
                    BotWebViewSheet.this.webViewContainer.setViewPortHeightOffset(0.0f);
                    BotWebViewSheet.this.webViewContainer.invalidateViewPortHeight(true, true);
                    BotWebViewSheet.this.updateDownloadBulletinArrow();
                }
            });
            this.fullscreenAnimator.setDuration(280L);
            this.fullscreenAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.fullscreenAnimator.start();
            return;
        }
        this.fullscreenInProgress = false;
        this.fullscreenProgress = z ? 1.0f : 0.0f;
        this.fullscreenTransitionProgress = 0.0f;
        updateFullscreenLayout();
        updateWindowFlags();
        this.actionBar.setVisibility(z ? 8 : 0);
        this.actionBar.setAlpha(1.0f - this.fullscreenProgress);
        this.actionBar.setTranslationY((-ActionBar.getCurrentActionBarHeight()) * this.fullscreenProgress);
        this.botButtons.setTranslationX(0.0f);
        this.fullscreenButtons.setAlpha(this.fullscreenProgress);
        this.webViewContainer.setViewPortHeightOffset(0.0f);
        this.webViewContainer.invalidateViewPortHeight(true, true);
        updateDownloadBulletinArrow();
    }

    public void setNavigationBarColor(final int i, boolean z) {
        final int i2 = this.navBarColor;
        this.botButtons.setBackgroundColor(i, z);
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet.$r8$lambda$uVH1eYRJxbzX_vYBdulfYHjnW0o(this.f$0, i2, i, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.navBarColor = ColorUtils.blendARGB(i2, i, 1.0f);
                    BotWebViewSheet.this.checkNavBarColor();
                }
            });
            duration.start();
        } else {
            this.navBarColor = i;
            checkNavBarColor();
        }
        AndroidUtilities.setNavigationBarColor((Dialog) this, this.navBarColor, false);
    }

    public static void $r8$lambda$uVH1eYRJxbzX_vYBdulfYHjnW0o(BotWebViewSheet botWebViewSheet, int i, int i2, ValueAnimator valueAnimator) {
        botWebViewSheet.getClass();
        botWebViewSheet.navBarColor = ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue());
        botWebViewSheet.checkNavBarColor();
    }

    public void setActionBarColor(final int i, boolean z, boolean z2) {
        final int i2 = this.actionBarColor;
        navigationBarColor(i);
        final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
        botWebViewMenuContainer$ActionBarColorsAnimating.setFrom(this.overrideActionBarColor ? this.actionBarColor : 0, this.resourcesProvider);
        this.overrideActionBarColor = z;
        this.actionBarIsLight = ColorUtils.calculateLuminance(i) < 0.7210000157356262d;
        botWebViewMenuContainer$ActionBarColorsAnimating.setTo(this.overrideActionBarColor ? i : 0, this.resourcesProvider);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet.$r8$lambda$oLIFuUby6rwz7MjaO3gxRL__4yQ(this.f$0, i2, i, botWebViewMenuContainer$ActionBarColorsAnimating, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.actionBarColor = ColorUtils.blendARGB(i2, i, 1.0f);
                    BotWebViewSheet.this.checkNavBarColor();
                    BotWebViewSheet.this.windowView.invalidate();
                    BotWebViewSheet.this.actionBar.setBackgroundColor(BotWebViewSheet.this.actionBarColor);
                    botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(BotWebViewSheet.this.actionBar, 1.0f);
                    BotWebViewSheet.this.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
                    BotWebViewSheet.this.windowView.invalidate();
                }
            });
            duration.start();
        } else {
            this.actionBarColor = i;
            checkNavBarColor();
            this.windowView.invalidate();
            this.actionBar.setBackgroundColor(this.actionBarColor);
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(this.actionBar, 1.0f);
            this.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
            this.windowView.invalidate();
        }
        updateLightStatusBar();
    }

    public static void $r8$lambda$oLIFuUby6rwz7MjaO3gxRL__4yQ(BotWebViewSheet botWebViewSheet, int i, int i2, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
        botWebViewSheet.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        botWebViewSheet.actionBarColor = ColorUtils.blendARGB(i, i2, fFloatValue);
        botWebViewSheet.checkNavBarColor();
        botWebViewSheet.windowView.invalidate();
        botWebViewSheet.actionBar.setBackgroundColor(botWebViewSheet.actionBarColor);
        botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(botWebViewSheet.actionBar, fFloatValue);
        botWebViewSheet.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
        botWebViewSheet.windowView.invalidate();
    }

    public void checkNavBarColor() {
        LaunchActivity launchActivity;
        if (!this.superDismissed && (launchActivity = LaunchActivity.instance) != null) {
            launchActivity.checkSystemBarColors(true, true, true);
        }
        WindowView windowView = this.windowView;
        if (windowView != null) {
            windowView.invalidate();
        }
    }

    @Override
    public int getNavigationBarColor(int i) {
        return ColorUtils.blendARGB(i, this.navBarColor, this.openedProgress);
    }

    @Override
    public WindowView mo1349getWindowView() {
        return this.windowView;
    }

    public class WindowView extends SizeNotifierFrameLayout implements BottomSheetTabsOverlay.SheetView {
        private final Path clipPath;
        private boolean drawingFromOverlay;
        private final Paint navbarPaint;
        private final RectF rect;

        public WindowView(Context context) {
            super(context);
            setClipChildren(false);
            setClipToPadding(false);
            setWillNotDraw(false);
            this.navbarPaint = new Paint(1);
            this.rect = new RectF();
            this.clipPath = new Path();
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean z;
            if (view != BotWebViewSheet.this.swipeContainer || !BotWebViewSheet.this.fullscreenInProgress || BotWebViewSheet.this.swipeContainerFromHeight <= 0 || BotWebViewSheet.this.swipeContainerFromWidth <= 0) {
                z = false;
            } else {
                canvas.save();
                canvas.clipRect(view.getX(), view.getY(), view.getX() + AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainerFromWidth, view.getWidth(), BotWebViewSheet.this.fullscreenTransitionProgress), view.getY() + AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainerFromHeight, view.getHeight(), BotWebViewSheet.this.fullscreenTransitionProgress));
                z = true;
            }
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (z) {
                canvas.restore();
            }
            return zDrawChild;
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            LaunchActivity launchActivity = LaunchActivity.instance;
            BottomSheetTabs bottomSheetTabs = launchActivity != null ? launchActivity.getBottomSheetTabs() : null;
            if (bottomSheetTabs != null && BotWebViewSheet.this.insets != null) {
                int height = (int) (bottomSheetTabs.getHeight(true) * (1.0f - BotWebViewSheet.this.fullscreenProgress));
                if (motionEvent.getY() >= (getHeight() - BotWebViewSheet.this.insets.bottom) - height && motionEvent.getY() <= getHeight() - BotWebViewSheet.this.insets.bottom && !AndroidUtilities.isTablet()) {
                    return bottomSheetTabs.touchEvent(motionEvent.getAction(), motionEvent.getX(), motionEvent.getY() - ((getHeight() - BotWebViewSheet.this.insets.bottom) - height));
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            boolean z;
            if (this.drawingFromOverlay) {
                return;
            }
            if (BotWebViewSheet.this.passcodeView.getVisibility() != 0 && BotWebViewSheet.this.fullscreenProgress < 1.0f && BotWebViewSheet.this.fullscreenProgress > 0.0f) {
                this.navbarPaint.setColor(Theme.multAlpha(BotWebViewSheet.this.navBarColor, BotWebViewSheet.this.openedProgress));
                if (BotWebViewSheet.this.navInsets.left > 0) {
                    canvas.drawRect(0.0f, 0.0f, BotWebViewSheet.this.navInsets.left, getHeight(), this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), BotWebViewSheet.this.navInsets.top, this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - BotWebViewSheet.this.navInsets.bottom, getWidth(), getHeight(), this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.right > 0) {
                    canvas.drawRect(getWidth() - BotWebViewSheet.this.navInsets.right, 0.0f, getWidth(), getHeight(), this.navbarPaint);
                }
            }
            if (BotWebViewSheet.this.bottomTabsClip == null || AndroidUtilities.isTablet()) {
                z = false;
            } else {
                canvas.save();
                canvas.translate(BotWebViewSheet.this.insets.left * (1.0f - BotWebViewSheet.this.fullscreenProgress), 0.0f);
                BotWebViewSheet.this.bottomTabsClip.clip(canvas, true, false, AndroidUtilities.lerp((getWidth() - BotWebViewSheet.this.insets.left) - BotWebViewSheet.this.insets.right, getWidth(), BotWebViewSheet.this.fullscreenProgress), getHeight(), 1.0f - BotWebViewSheet.this.fullscreenProgress);
                canvas.translate((-BotWebViewSheet.this.insets.left) * (1.0f - BotWebViewSheet.this.fullscreenProgress), 0.0f);
                z = true;
            }
            super.dispatchDraw(canvas);
            if (z) {
                canvas.restore();
            }
            if (BotWebViewSheet.this.passcodeView.getVisibility() != 0) {
                this.navbarPaint.setColor(Theme.multAlpha(BotWebViewSheet.this.navBarColor, BotWebViewSheet.this.openedProgress));
                if (BotWebViewSheet.this.navInsets.left > 0) {
                    canvas.drawRect(0.0f, 0.0f, BotWebViewSheet.this.navInsets.left * (1.0f - BotWebViewSheet.this.fullscreenProgress), getHeight(), this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.top > 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), BotWebViewSheet.this.navInsets.top * (1.0f - BotWebViewSheet.this.fullscreenProgress), this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.bottom > 0) {
                    canvas.drawRect(0.0f, getHeight() - (BotWebViewSheet.this.navInsets.bottom * ((BotWebViewSheet.this.botButtons == null || BotWebViewSheet.this.botButtons.getTotalHeight() <= 0) ? 1.0f - BotWebViewSheet.this.fullscreenProgress : 1.0f)), getWidth(), getHeight(), this.navbarPaint);
                }
                if (BotWebViewSheet.this.navInsets.right > 0) {
                    canvas.drawRect(getWidth() - (BotWebViewSheet.this.navInsets.right * (1.0f - BotWebViewSheet.this.fullscreenProgress)), 0.0f, getWidth(), getHeight(), this.navbarPaint);
                }
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Canvas canvas2;
            if (this.drawingFromOverlay) {
                return;
            }
            super.onDraw(canvas);
            if (BotWebViewSheet.this.passcodeView.getVisibility() != 0) {
                canvas.save();
                if (BotWebViewSheet.this.bottomTabsClip != null) {
                    canvas2 = canvas;
                    BotWebViewSheet.this.bottomTabsClip.clip(canvas2, false, false, getWidth(), getHeight(), 1.0f - BotWebViewSheet.this.fullscreenProgress);
                } else {
                    canvas2 = canvas;
                }
                if (!BotWebViewSheet.this.overrideBackgroundColor) {
                    int color = BotWebViewSheet.this.getColor(Theme.key_windowBackgroundWhite);
                    BotWebViewSheet.this.backgroundPaint.setColor(color);
                    BotWebViewSheet.this.webViewContainer.setFlickerViewColor(color);
                    if (BotWebViewSheet.this.errorContainer != null) {
                        BotWebViewSheet.this.errorContainer.setDark(AndroidUtilities.computePerceivedBrightness(BotWebViewSheet.this.backgroundPaint.getColor()) <= 0.721f, false);
                        BotWebViewSheet.this.errorContainer.setBackgroundColor(BotWebViewSheet.this.backgroundPaint.getColor());
                    }
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas2.drawRect(rectF, BotWebViewSheet.this.dimPaint);
                int height = BotWebViewSheet.this.bottomTabs != null ? BotWebViewSheet.this.bottomTabs.getHeight(true) : 0;
                BotWebViewSheet.this.actionBarPaint.setColor(BotWebViewSheet.this.actionBarColor);
                float fDp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - BotWebViewSheet.this.actionBarTransitionProgress);
                rectF.set(AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getLeft(), 0, BotWebViewSheet.this.fullscreenProgress), AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY(), 0.0f, BotWebViewSheet.this.actionBarTransitionProgress), BotWebViewSheet.this.swipeContainer.getRight(), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f) + fDp);
                canvas2.drawRoundRect(rectF, fDp, fDp, BotWebViewSheet.this.actionBarPaint);
                rectF.set(AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getLeft(), 0, BotWebViewSheet.this.fullscreenProgress), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getRight(), getWidth(), BotWebViewSheet.this.fullscreenProgress), getHeight() - height);
                canvas2.drawRect(rectF, BotWebViewSheet.this.backgroundPaint);
                canvas2.restore();
            }
        }

        @Override
        public void draw(Canvas canvas) {
            if (this.drawingFromOverlay) {
                return;
            }
            super.draw(canvas);
            float f = AndroidUtilities.isTablet() ? 0.0f : BotWebViewSheet.this.actionBarTransitionProgress;
            BotWebViewSheet.this.linePaint.setColor(BotWebViewSheet.this.lineColor);
            BotWebViewSheet.this.linePaint.setAlpha((int) (BotWebViewSheet.this.linePaint.getAlpha() * (1.0f - (Math.min(0.5f, f) / 0.5f)) * (1.0f - BotWebViewSheet.this.fullscreenProgress)));
            canvas.save();
            float f2 = 1.0f - f;
            float fLerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, BotWebViewSheet.this.actionBarTransitionProgress) : AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY(), AndroidUtilities.statusBarHeight + (ActionBar.getCurrentActionBarHeight() / 2.0f), f) + AndroidUtilities.dp(12.0f);
            canvas.scale(f2, f2, getWidth() / 2.0f, fLerp);
            canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), fLerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), fLerp, BotWebViewSheet.this.linePaint);
            canvas.restore();
            BotWebViewSheet.this.actionBarShadow.setAlpha((int) (BotWebViewSheet.this.actionBar.getAlpha() * 255.0f));
            float y = BotWebViewSheet.this.actionBar.getY() + BotWebViewSheet.this.actionBar.getTranslationY() + BotWebViewSheet.this.actionBar.getHeight();
            BotWebViewSheet.this.actionBarShadow.setBounds(BotWebViewSheet.this.insets.left, (int) y, getWidth() - BotWebViewSheet.this.insets.right, (int) (y + BotWebViewSheet.this.actionBarShadow.getIntrinsicHeight()));
            BotWebViewSheet.this.actionBarShadow.draw(canvas);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, BotWebViewSheet.this.actionBarTransitionProgress) || motionEvent.getX() > BotWebViewSheet.this.swipeContainer.getRight() || motionEvent.getX() < BotWebViewSheet.this.swipeContainer.getLeft())) {
                BotWebViewSheet.this.dismiss(true, null);
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
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
                public int getBottomOffset(int i) {
                    return Bulletin.Delegate.CC.$default$getBottomOffset(this, i);
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
                public int getTopOffset(int i) {
                    return AndroidUtilities.statusBarHeight;
                }
            });
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public void setDrawingFromOverlay(boolean z) {
            if (this.drawingFromOverlay != z) {
                this.drawingFromOverlay = z;
                invalidate();
                BotWebViewSheet.this.updateWindowFlags();
                if (LaunchActivity.instance == null || !BotWebViewSheet.this.fullscreen) {
                    return;
                }
                LaunchActivity.instance.setNavigationBarColor(BotWebViewSheet.this.navBarColor);
            }
        }

        @Override
        public RectF getRect() {
            this.rect.set(BotWebViewSheet.this.swipeContainer.getLeft(), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), BotWebViewSheet.this.swipeContainer.getRight(), getHeight());
            return this.rect;
        }

        @Override
        public float drawInto(Canvas canvas, RectF rectF, float f, RectF rectF2, float f2, boolean z) {
            this.rect.set(BotWebViewSheet.this.swipeContainer.getLeft(), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), BotWebViewSheet.this.swipeContainer.getRight(), getHeight());
            AndroidUtilities.lerpCentered(this.rect, rectF, f, rectF2);
            canvas.save();
            this.clipPath.rewind();
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - BotWebViewSheet.this.actionBarTransitionProgress), AndroidUtilities.dp(18.0f), f);
            this.clipPath.addRoundRect(rectF2, fLerp, fLerp, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            canvas.drawPaint(BotWebViewSheet.this.backgroundPaint);
            if (BotWebViewSheet.this.swipeContainer != null) {
                canvas.save();
                canvas.translate(rectF2.left, Math.max(BotWebViewSheet.this.swipeContainer.getY(), rectF2.top) + (f * AndroidUtilities.dp(51.0f)));
                BotWebViewSheet.this.swipeContainer.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            return fLerp;
        }
    }

    public ArticleViewer.ErrorContainer createErrorContainer() {
        if (this.errorContainer == null) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
            ArticleViewer.ErrorContainer errorContainer = new ArticleViewer.ErrorContainer(getContext());
            this.errorContainer = errorContainer;
            webViewSwipeContainer.addView(errorContainer, LayoutHelper.createFrame(-1, -1.0f));
            this.errorContainer.setTranslationY(-1.0f);
            this.errorContainer.buttonView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    BotWebViewSheet.$r8$lambda$dXoCJ2IYlodigMoMoiHchuBKepE(this.f$0, view);
                }
            });
            this.errorContainer.setBackgroundColor(this.backgroundPaint.getColor());
            AndroidUtilities.updateViewVisibilityAnimated(this.errorContainer, this.errorShown, 1.0f, false);
        }
        return this.errorContainer;
    }

    public static void $r8$lambda$dXoCJ2IYlodigMoMoiHchuBKepE(BotWebViewSheet botWebViewSheet, View view) {
        BotWebViewContainer.MyWebView webView = botWebViewSheet.webViewContainer.getWebView();
        if (webView != null) {
            webView.reload();
        }
    }

    public void setAttached(boolean z) {
        if (this.attached == z) {
            return;
        }
        this.attached = z;
        if (z) {
            if (this.orientationLocked) {
                shownLockedBots++;
            }
        } else if (this.orientationLocked) {
            shownLockedBots--;
        }
        if (shownLockedBots > 0) {
            AndroidUtilities.lockOrientation(getActivity());
        } else {
            AndroidUtilities.unlockOrientation(getActivity());
        }
    }

    public void lockOrientation(boolean z) {
        if (this.orientationLocked == z) {
            return;
        }
        this.orientationLocked = z;
        if (this.attached) {
            if (z) {
                shownLockedBots++;
            } else {
                shownLockedBots--;
            }
        }
        if (shownLockedBots > 0) {
            AndroidUtilities.lockOrientation(getActivity());
        } else {
            AndroidUtilities.unlockOrientation(getActivity());
        }
    }
}
