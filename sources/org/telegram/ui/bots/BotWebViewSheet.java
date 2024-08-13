package org.telegram.ui.bots;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
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
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$BotApp;
import org.telegram.tgnet.TLRPC$InputInvoice;
import org.telegram.tgnet.TLRPC$InputPeer;
import org.telegram.tgnet.TLRPC$PaymentForm;
import org.telegram.tgnet.TLRPC$PaymentReceipt;
import org.telegram.tgnet.TLRPC$TL_appWebViewResultUrl;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_dataJSON;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputBotAppID;
import org.telegram.tgnet.TLRPC$TL_messages_prolongWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestAppWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestMainWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestSimpleWebView;
import org.telegram.tgnet.TLRPC$TL_messages_requestWebView;
import org.telegram.tgnet.TLRPC$TL_messages_sendWebViewData;
import org.telegram.tgnet.TLRPC$TL_messages_toggleBotInAttachMenu;
import org.telegram.tgnet.TLRPC$TL_payments_paymentFormStars;
import org.telegram.tgnet.TLRPC$TL_simpleWebViewResultUrl;
import org.telegram.tgnet.TLRPC$TL_updates;
import org.telegram.tgnet.TLRPC$TL_webViewResultUrl;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserFull;
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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OverlayActionBarLayoutDialog;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SimpleFloatPropertyCompat;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.DialogsActivity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PaymentFormActivity;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.bots.BotWebViewAttachedSheet;
import org.telegram.ui.bots.BotWebViewSheet;
import org.telegram.ui.bots.ChatAttachAlertBotWebViewLayout;
import org.telegram.ui.web.BotWebViewContainer;
public class BotWebViewSheet extends Dialog implements NotificationCenter.NotificationCenterDelegate, BottomSheetTabsOverlay.Sheet {
    private static final SimpleFloatPropertyCompat<BotWebViewSheet> ACTION_BAR_TRANSITION_PROGRESS_VALUE = new SimpleFloatPropertyCompat("actionBarTransitionProgress", new SimpleFloatPropertyCompat.Getter() {
        @Override
        public final float get(Object obj) {
            float f;
            f = ((BotWebViewSheet) obj).actionBarTransitionProgress;
            return f;
        }
    }, new SimpleFloatPropertyCompat.Setter() {
        @Override
        public final void set(Object obj, float f) {
            BotWebViewSheet.lambda$static$2((BotWebViewSheet) obj, f);
        }
    }).setMultiplier(100.0f);
    private ActionBar actionBar;
    private int actionBarColor;
    private int actionBarColorKey;
    private boolean actionBarIsLight;
    private Paint actionBarPaint;
    private Drawable actionBarShadow;
    private float actionBarTransitionProgress;
    private boolean backButtonShown;
    private Paint backgroundPaint;
    private long botId;
    private String buttonText;
    private int currentAccount;
    private boolean defaultFullsize;
    private Paint dimPaint;
    private boolean dismissed;
    private boolean forceExpnaded;
    private Boolean fullsize;
    private boolean ignoreLayout;
    private int lineColor;
    private Paint linePaint;
    private TextView mainButton;
    private VerticalPositionAutoAnimator mainButtonAutoAnimator;
    private boolean mainButtonProgressWasVisible;
    private BotWebViewAttachedSheet.MainButtonSettings mainButtonSettings;
    private boolean mainButtonWasVisible;
    private int navBarColor;
    private boolean needCloseConfirmation;
    private boolean needsContext;
    private boolean overrideBackgroundColor;
    private Activity parentActivity;
    private PasscodeView passcodeView;
    private long peerId;
    private Runnable pollRunnable;
    private ChatAttachAlertBotWebViewLayout.WebProgressView progressView;
    private long queryId;
    private VerticalPositionAutoAnimator radialProgressAutoAnimator;
    private RadialProgressView radialProgressView;
    private int replyToMsgId;
    private WebViewRequestProps requestProps;
    private Theme.ResourcesProvider resourcesProvider;
    private ActionBarMenuSubItem settingsItem;
    public boolean showExpanded;
    public float showOffsetY;
    private boolean silent;
    private SpringAnimation springAnimation;
    private ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer swipeContainer;
    Drawable verifiedDrawable;
    private Boolean wasLightStatusBar;
    private BotWebViewContainer webViewContainer;
    private WindowView windowView;

    @Override
    public boolean setDialog(BottomSheetTabDialog bottomSheetTabDialog) {
        return false;
    }

    @Override
    public void setLastVisible(boolean z) {
        BottomSheetTabsOverlay.Sheet.CC.$default$setLastVisible(this, z);
    }

    public void showJustAddedBulletin() {
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot;
        final String formatString;
        TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                tLRPC$TL_attachMenuBot = null;
                break;
            }
            tLRPC$TL_attachMenuBot = it.next();
            if (tLRPC$TL_attachMenuBot.bot_id == this.botId) {
                break;
            }
        }
        if (tLRPC$TL_attachMenuBot == null) {
            return;
        }
        boolean z = tLRPC$TL_attachMenuBot.show_in_side_menu;
        if (z && tLRPC$TL_attachMenuBot.show_in_attach_menu) {
            formatString = LocaleController.formatString("BotAttachMenuShortcatAddedAttachAndSide", R.string.BotAttachMenuShortcatAddedAttachAndSide, user.first_name);
        } else if (z) {
            formatString = LocaleController.formatString("BotAttachMenuShortcatAddedSide", R.string.BotAttachMenuShortcatAddedSide, user.first_name);
        } else {
            formatString = LocaleController.formatString("BotAttachMenuShortcatAddedAttach", R.string.BotAttachMenuShortcatAddedAttach, user.first_name);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$showJustAddedBulletin$0(formatString);
            }
        }, 200L);
    }

    public void lambda$showJustAddedBulletin$0(String str) {
        BulletinFactory.of(this.windowView, this.resourcesProvider).createSimpleBulletin(R.raw.contact_check, AndroidUtilities.replaceTags(str)).setDuration(5000).show(true);
    }

    public static void lambda$static$2(BotWebViewSheet botWebViewSheet, float f) {
        botWebViewSheet.actionBarTransitionProgress = f;
        botWebViewSheet.windowView.invalidate();
        botWebViewSheet.actionBar.setAlpha(f);
        botWebViewSheet.updateLightStatusBar();
    }

    public void lambda$new$5() {
        if (this.dismissed || this.queryId == 0) {
            return;
        }
        TLRPC$TL_messages_prolongWebView tLRPC$TL_messages_prolongWebView = new TLRPC$TL_messages_prolongWebView();
        tLRPC$TL_messages_prolongWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
        tLRPC$TL_messages_prolongWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.peerId);
        tLRPC$TL_messages_prolongWebView.query_id = this.queryId;
        tLRPC$TL_messages_prolongWebView.silent = this.silent;
        if (this.replyToMsgId != 0) {
            tLRPC$TL_messages_prolongWebView.reply_to = SendMessagesHelper.getInstance(this.currentAccount).createReplyInput(this.replyToMsgId);
            tLRPC$TL_messages_prolongWebView.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_prolongWebView, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewSheet.this.lambda$new$4(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$4(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$new$3(tLRPC$TL_error);
            }
        });
    }

    public void lambda$new$3(TLRPC$TL_error tLRPC$TL_error) {
        if (this.dismissed) {
            return;
        }
        if (tLRPC$TL_error != null) {
            dismiss();
        } else {
            AndroidUtilities.runOnUIThread(this.pollRunnable, 60000L);
        }
    }

    @Override
    public BottomSheetTabs.WebTabData saveState() {
        BottomSheetTabs.WebTabData webTabData = new BottomSheetTabs.WebTabData();
        webTabData.actionBarColor = this.actionBarColor;
        webTabData.actionBarColorKey = this.actionBarColorKey;
        webTabData.overrideActionBarColor = this.overrideBackgroundColor;
        webTabData.backgroundColor = this.backgroundPaint.getColor();
        webTabData.props = this.requestProps;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        boolean z = true;
        webTabData.ready = botWebViewContainer != null && botWebViewContainer.isPageLoaded();
        webTabData.themeIsDark = Theme.isCurrentThemeDark();
        BotWebViewContainer botWebViewContainer2 = this.webViewContainer;
        webTabData.lastUrl = botWebViewContainer2 != null ? botWebViewContainer2.getUrlLoaded() : null;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webTabData.expanded = (webViewSwipeContainer != null && webViewSwipeContainer.getSwipeOffsetY() < 0.0f) || this.forceExpnaded || isFullSize();
        webTabData.fullsize = isFullSize();
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer2 = this.swipeContainer;
        webTabData.expandedOffset = webViewSwipeContainer2 != null ? webViewSwipeContainer2.getOffsetY() : Float.MAX_VALUE;
        webTabData.needsContext = this.needsContext;
        webTabData.backButton = this.backButtonShown;
        webTabData.main = this.mainButtonSettings;
        webTabData.confirmDismiss = this.needCloseConfirmation;
        ActionBarMenuSubItem actionBarMenuSubItem = this.settingsItem;
        webTabData.settings = actionBarMenuSubItem != null && actionBarMenuSubItem.getVisibility() == 0;
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer3 = this.swipeContainer;
        if (webViewSwipeContainer3 != null && !webViewSwipeContainer3.isAllowedSwipes()) {
            z = false;
        }
        webTabData.allowSwipes = z;
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
        return webTabData;
    }

    public boolean restoreState(BaseFragment baseFragment, BottomSheetTabs.WebTabData webTabData) {
        int i;
        if (webTabData == null || webTabData.props == null) {
            return false;
        }
        if (webTabData.overrideActionBarColor) {
            setBackgroundColor(webTabData.backgroundColor, false);
        }
        if (webTabData.overrideActionBarColor) {
            i = webTabData.actionBarColor;
        } else {
            int i2 = webTabData.actionBarColorKey;
            if (i2 < 0) {
                i2 = Theme.key_windowBackgroundWhite;
            }
            i = Theme.getColor(i2, this.resourcesProvider);
        }
        setActionBarColor(i, webTabData.overrideActionBarColor, false);
        this.showExpanded = webTabData.expanded;
        this.showOffsetY = webTabData.expandedOffset;
        BotWebViewContainer botWebViewContainer = this.webViewContainer;
        boolean z = webTabData.backButton;
        this.backButtonShown = z;
        botWebViewContainer.setIsBackButtonVisible(z);
        this.swipeContainer.setAllowSwipes(webTabData.allowSwipes);
        AndroidUtilities.updateImageViewImageAnimated(this.actionBar.getBackButton(), this.backButtonShown ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        this.needCloseConfirmation = webTabData.confirmDismiss;
        this.fullsize = Boolean.valueOf(webTabData.fullsize);
        this.needsContext = webTabData.needsContext;
        BotWebViewAttachedSheet.MainButtonSettings mainButtonSettings = webTabData.main;
        if (mainButtonSettings != null) {
            setMainButton(mainButtonSettings);
        }
        BotWebViewContainer.MyWebView myWebView = webTabData.webView;
        if (myWebView != null) {
            myWebView.onResume();
            this.webViewContainer.replaceWebView(webTabData.webView, webTabData.proxy);
            this.webViewContainer.setState(webTabData.ready || webTabData.webView.isPageLoaded(), webTabData.lastUrl);
            if (Theme.isCurrentThemeDark() != webTabData.themeIsDark) {
                if (this.webViewContainer.getWebView() != null) {
                    this.webViewContainer.getWebView().animate().cancel();
                    this.webViewContainer.getWebView().animate().alpha(0.0f).start();
                }
                this.progressView.setLoadProgress(0.0f);
                this.progressView.setAlpha(1.0f);
                this.progressView.setVisibility(0);
                this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
                this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
                this.webViewContainer.setState(false, null);
                if (this.webViewContainer.getWebView() != null) {
                    this.webViewContainer.getWebView().loadUrl("about:blank");
                }
                WebViewRequestProps webViewRequestProps = webTabData.props;
                webViewRequestProps.response = null;
                webViewRequestProps.responseTime = 0L;
            }
        } else {
            WebViewRequestProps webViewRequestProps2 = webTabData.props;
            webViewRequestProps2.response = null;
            webViewRequestProps2.responseTime = 0L;
        }
        requestWebView(baseFragment, webTabData.props);
        ActionBarMenuSubItem actionBarMenuSubItem = this.settingsItem;
        if (actionBarMenuSubItem != null) {
            actionBarMenuSubItem.setVisibility(webTabData.settings ? 0 : 8);
        }
        return true;
    }

    public BotWebViewSheet(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, R.style.TransparentDialog);
        this.actionBarTransitionProgress = 0.0f;
        this.linePaint = new Paint(1);
        this.dimPaint = new Paint();
        this.backgroundPaint = new Paint(1);
        this.actionBarPaint = new Paint(1);
        this.pollRunnable = new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$new$5();
            }
        };
        this.actionBarColorKey = -1;
        this.defaultFullsize = false;
        this.fullsize = null;
        this.resourcesProvider = resourcesProvider;
        this.lineColor = Theme.getColor(Theme.key_sheet_scrollUp);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer(context) {
            @Override
            protected void onMeasure(int r5, int r6) {
                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bots.BotWebViewSheet.AnonymousClass1.onMeasure(int, int):void");
            }

            @Override
            public void requestLayout() {
                if (BotWebViewSheet.this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.swipeContainer = webViewSwipeContainer;
        webViewSwipeContainer.setAllowFullSizeSwipe(true);
        this.swipeContainer.setShouldWaitWebViewScroll(true);
        int i = Theme.key_windowBackgroundWhite;
        BotWebViewContainer botWebViewContainer = new BotWebViewContainer(context, resourcesProvider, getColor(i), true) {
            @Override
            public void onWebViewCreated() {
                super.onWebViewCreated();
                BotWebViewSheet.this.swipeContainer.setWebView(BotWebViewSheet.this.webViewContainer.getWebView());
            }
        };
        this.webViewContainer = botWebViewContainer;
        botWebViewContainer.setDelegate(new AnonymousClass3(context, resourcesProvider));
        this.linePaint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.linePaint.setStrokeWidth(AndroidUtilities.dp(4.0f));
        this.linePaint.setStrokeCap(Paint.Cap.ROUND);
        this.dimPaint.setColor(1073741824);
        this.actionBarColor = getColor(i);
        this.navBarColor = getColor(Theme.key_windowBackgroundGray);
        AndroidUtilities.setNavigationBarColor(getWindow(), this.navBarColor, false);
        WindowView windowView = new WindowView(context);
        this.windowView = windowView;
        windowView.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            @Override
            public final void onSizeChanged(int i2, boolean z) {
                BotWebViewSheet.this.lambda$new$6(i2, z);
            }
        });
        this.windowView.addView(this.swipeContainer, LayoutHelper.createFrame(-1, -1.0f, 49, 0.0f, 24.0f, 0.0f, 0.0f));
        TextView textView = new TextView(this, context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point.x, point.y) * 0.8f), 1073741824);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.mainButton = textView;
        textView.setVisibility(8);
        this.mainButton.setAlpha(0.0f);
        this.mainButton.setSingleLine();
        this.mainButton.setGravity(17);
        this.mainButton.setTypeface(AndroidUtilities.bold());
        int dp = AndroidUtilities.dp(16.0f);
        this.mainButton.setPadding(dp, 0, dp, 0);
        this.mainButton.setTextSize(1, 14.0f);
        this.mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                BotWebViewSheet.this.lambda$new$7(view);
            }
        });
        this.windowView.addView(this.mainButton, LayoutHelper.createFrame(-1, 48, 81));
        this.mainButtonAutoAnimator = VerticalPositionAutoAnimator.attach(this.mainButton);
        RadialProgressView radialProgressView = new RadialProgressView(this, context) {
            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
                if (AndroidUtilities.isTablet() && !AndroidUtilities.isInMultiwindow && !AndroidUtilities.isSmallTablet()) {
                    Point point = AndroidUtilities.displaySize;
                    marginLayoutParams.rightMargin = (int) (AndroidUtilities.dp(10.0f) + (Math.min(point.x, point.y) * 0.1f));
                    return;
                }
                marginLayoutParams.rightMargin = AndroidUtilities.dp(10.0f);
            }
        };
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(18.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setVisibility(8);
        this.windowView.addView(this.radialProgressView, LayoutHelper.createFrame(28, 28.0f, 85, 0.0f, 0.0f, 10.0f, 10.0f));
        this.radialProgressAutoAnimator = VerticalPositionAutoAnimator.attach(this.radialProgressView);
        this.actionBarShadow = ContextCompat.getDrawable(getContext(), R.drawable.header_shadow).mutate();
        ActionBar actionBar = new ActionBar(this, context, resourcesProvider) {
            @Override
            public void onMeasure(int i2, int i3) {
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
        this.windowView.addView(this.actionBar, LayoutHelper.createFrame(-1, -2, 49));
        WindowView windowView2 = this.windowView;
        ChatAttachAlertBotWebViewLayout.WebProgressView webProgressView = new ChatAttachAlertBotWebViewLayout.WebProgressView(this, context, resourcesProvider) {
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
        windowView2.addView(webProgressView, LayoutHelper.createFrame(-1, -2.0f, 81, 0.0f, 0.0f, 0.0f, 0.0f));
        this.webViewContainer.setWebViewProgressListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                BotWebViewSheet.this.lambda$new$9((Float) obj);
            }
        });
        this.swipeContainer.addView(this.webViewContainer, LayoutHelper.createFrame(-1, -1.0f));
        this.swipeContainer.setScrollListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$new$10();
            }
        });
        this.swipeContainer.setScrollEndListener(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$new$11();
            }
        });
        this.swipeContainer.setDelegate(new ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.Delegate() {
            @Override
            public final void onDismiss() {
                BotWebViewSheet.this.lambda$new$12();
            }
        });
        this.swipeContainer.setTopActionBarOffsetY((ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight) - AndroidUtilities.dp(24.0f));
        this.swipeContainer.setIsKeyboardVisible(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Boolean lambda$new$13;
                lambda$new$13 = BotWebViewSheet.this.lambda$new$13((Void) obj);
                return lambda$new$13;
            }
        });
        PasscodeView passcodeView = new PasscodeView(context);
        this.passcodeView = passcodeView;
        this.windowView.addView(passcodeView, LayoutHelper.createFrame(-1, -1.0f));
        setContentView(this.windowView, new ViewGroup.LayoutParams(-1, -1));
    }

    public class AnonymousClass3 implements BotWebViewContainer.Delegate {
        private boolean sentWebViewData;
        final Context val$context;
        final Theme.ResourcesProvider val$resourcesProvider;

        @Override
        public void onCloseToTabs() {
            BotWebViewContainer.Delegate.CC.$default$onCloseToTabs(this);
        }

        @Override
        public void onInstantClose() {
            BotWebViewContainer.Delegate.CC.$default$onInstantClose(this);
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
            BotWebViewSheet.this.swipeContainer.setAllowSwipes(z);
        }

        @Override
        public void onSendWebViewData(String str) {
            if (BotWebViewSheet.this.queryId != 0 || this.sentWebViewData) {
                return;
            }
            this.sentWebViewData = true;
            TLRPC$TL_messages_sendWebViewData tLRPC$TL_messages_sendWebViewData = new TLRPC$TL_messages_sendWebViewData();
            tLRPC$TL_messages_sendWebViewData.bot = MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getInputUser(BotWebViewSheet.this.botId);
            tLRPC$TL_messages_sendWebViewData.random_id = Utilities.random.nextLong();
            tLRPC$TL_messages_sendWebViewData.button_text = BotWebViewSheet.this.buttonText;
            tLRPC$TL_messages_sendWebViewData.data = str;
            ConnectionsManager.getInstance(BotWebViewSheet.this.currentAccount).sendRequest(tLRPC$TL_messages_sendWebViewData, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.AnonymousClass3.this.lambda$onSendWebViewData$0(tLObject, tLRPC$TL_error);
                }
            });
        }

        public void lambda$onSendWebViewData$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            if (tLObject instanceof TLRPC$TL_updates) {
                MessagesController.getInstance(BotWebViewSheet.this.currentAccount).processUpdates((TLRPC$TL_updates) tLObject, false);
            }
            final BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewSheet.this.dismiss();
                }
            });
        }

        @Override
        public void onWebAppSetActionBarColor(int i, int i2, boolean z) {
            BotWebViewSheet.this.actionBarColorKey = i;
            BotWebViewSheet.this.setActionBarColor(i2, z, true);
        }

        @Override
        public void onWebAppSetBackgroundColor(int i) {
            BotWebViewSheet.this.setBackgroundColor(i, true);
        }

        @Override
        public void onSetBackButtonVisible(boolean z) {
            AndroidUtilities.updateImageViewImageAnimated(BotWebViewSheet.this.actionBar.getBackButton(), BotWebViewSheet.this.backButtonShown = z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
        }

        @Override
        public void onSetSettingsButtonVisible(boolean z) {
            if (BotWebViewSheet.this.settingsItem != null) {
                BotWebViewSheet.this.settingsItem.setVisibility(z ? 0 : 8);
            }
        }

        @Override
        public void onWebAppOpenInvoice(TLRPC$InputInvoice tLRPC$InputInvoice, final String str, TLObject tLObject) {
            PaymentFormActivity paymentFormActivity;
            BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
            if (tLObject instanceof TLRPC$TL_payments_paymentFormStars) {
                AndroidUtilities.hideKeyboard(BotWebViewSheet.this.windowView);
                final AlertDialog alertDialog = new AlertDialog(BotWebViewSheet.this.getContext(), 3);
                alertDialog.showDelayed(150L);
                StarsController.getInstance(BotWebViewSheet.this.currentAccount).openPaymentForm(null, tLRPC$InputInvoice, (TLRPC$TL_payments_paymentFormStars) tLObject, new Runnable() {
                    @Override
                    public final void run() {
                        AlertDialog.this.dismiss();
                    }
                }, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        BotWebViewSheet.AnonymousClass3.this.lambda$onWebAppOpenInvoice$2(str, (String) obj);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC$PaymentForm) {
                TLRPC$PaymentForm tLRPC$PaymentForm = (TLRPC$PaymentForm) tLObject;
                MessagesController.getInstance(BotWebViewSheet.this.currentAccount).putUsers(tLRPC$PaymentForm.users, false);
                paymentFormActivity = new PaymentFormActivity(tLRPC$PaymentForm, str, lastFragment);
            } else {
                paymentFormActivity = tLObject instanceof TLRPC$PaymentReceipt ? new PaymentFormActivity((TLRPC$PaymentReceipt) tLObject) : null;
            }
            if (paymentFormActivity != null) {
                BotWebViewSheet.this.swipeContainer.stickTo((-BotWebViewSheet.this.swipeContainer.getOffsetY()) + BotWebViewSheet.this.swipeContainer.getTopActionBarOffsetY());
                AndroidUtilities.hideKeyboard(BotWebViewSheet.this.windowView);
                final OverlayActionBarLayoutDialog overlayActionBarLayoutDialog = new OverlayActionBarLayoutDialog(this.val$context, this.val$resourcesProvider);
                overlayActionBarLayoutDialog.show();
                paymentFormActivity.setPaymentFormCallback(new PaymentFormActivity.PaymentFormCallback() {
                    @Override
                    public final void onInvoiceStatusChanged(PaymentFormActivity.InvoiceStatus invoiceStatus) {
                        BotWebViewSheet.AnonymousClass3.this.lambda$onWebAppOpenInvoice$3(overlayActionBarLayoutDialog, str, invoiceStatus);
                    }
                });
                paymentFormActivity.setResourcesProvider(this.val$resourcesProvider);
                overlayActionBarLayoutDialog.addFragment(paymentFormActivity);
            }
        }

        public void lambda$onWebAppOpenInvoice$2(String str, String str2) {
            BotWebViewSheet.this.webViewContainer.onInvoiceStatusUpdate(str, str2);
        }

        public void lambda$onWebAppOpenInvoice$3(OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, String str, PaymentFormActivity.InvoiceStatus invoiceStatus) {
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
        public void onWebAppSwitchInlineQuery(final TLRPC$User tLRPC$User, final String str, List<String> list) {
            if (list.isEmpty()) {
                if (BotWebViewSheet.this.parentActivity instanceof LaunchActivity) {
                    BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
                    if (lastFragment instanceof ChatActivity) {
                        ChatActivityEnterView chatActivityEnterView = ((ChatActivity) lastFragment).getChatActivityEnterView();
                        chatActivityEnterView.setFieldText("@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
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
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
                    boolean lambda$onWebAppSwitchInlineQuery$4;
                    lambda$onWebAppSwitchInlineQuery$4 = BotWebViewSheet.AnonymousClass3.this.lambda$onWebAppSwitchInlineQuery$4(tLRPC$User, str, overlayActionBarLayoutDialog, dialogsActivity2, arrayList, charSequence, z, topicsFragment);
                    return lambda$onWebAppSwitchInlineQuery$4;
                }
            });
            overlayActionBarLayoutDialog.show();
            overlayActionBarLayoutDialog.addFragment(dialogsActivity);
        }

        public boolean lambda$onWebAppSwitchInlineQuery$4(TLRPC$User tLRPC$User, String str, OverlayActionBarLayoutDialog overlayActionBarLayoutDialog, DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
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
            bundle.putString("start_text", "@" + UserObject.getPublicUsername(tLRPC$User) + " " + str);
            if (BotWebViewSheet.this.parentActivity instanceof LaunchActivity) {
                BaseFragment lastFragment = ((LaunchActivity) BotWebViewSheet.this.parentActivity).getActionBarLayout().getLastFragment();
                if (MessagesController.getInstance(BotWebViewSheet.this.currentAccount).checkCanOpenChat(bundle, lastFragment)) {
                    overlayActionBarLayoutDialog.dismiss();
                    BotWebViewSheet.this.dismissed = true;
                    AndroidUtilities.cancelRunOnUIThread(BotWebViewSheet.this.pollRunnable);
                    BotWebViewSheet.this.webViewContainer.destroyWebView();
                    NotificationCenter.getInstance(BotWebViewSheet.this.currentAccount).removeObserver(BotWebViewSheet.this, NotificationCenter.webViewResultSent);
                    NotificationCenter.getGlobalInstance().removeObserver(BotWebViewSheet.this, NotificationCenter.didSetNewTheme);
                    BotWebViewSheet.super.dismiss();
                    lastFragment.presentFragment(new INavigationLayout.NavigationParams(new ChatActivity(bundle)).setRemoveLast(true));
                }
            }
            return true;
        }

        @Override
        public void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3) {
            BotWebViewSheet.this.setMainButton(BotWebViewAttachedSheet.MainButtonSettings.of(z, z2, str, i, i2, z3));
        }

        @Override
        public boolean isClipboardAvailable() {
            return MediaDataController.getInstance(BotWebViewSheet.this.currentAccount).botInAttachMenu(BotWebViewSheet.this.botId);
        }
    }

    public void lambda$new$6(int i, boolean z) {
        if (i > AndroidUtilities.dp(20.0f)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
            webViewSwipeContainer.stickTo((-webViewSwipeContainer.getOffsetY()) + this.swipeContainer.getTopActionBarOffsetY());
        }
    }

    public void lambda$new$7(View view) {
        this.webViewContainer.onMainButtonPressed();
    }

    public void lambda$new$9(Float f) {
        this.progressView.setLoadProgressAnimated(f.floatValue());
        if (f.floatValue() == 1.0f) {
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet.this.lambda$new$8(valueAnimator);
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

    public void lambda$new$8(ValueAnimator valueAnimator) {
        this.progressView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void lambda$new$10() {
        if (this.swipeContainer.getSwipeOffsetY() > 0.0f) {
            this.dimPaint.setAlpha((int) ((1.0f - MathUtils.clamp(this.swipeContainer.getSwipeOffsetY() / this.swipeContainer.getHeight(), 0.0f, 1.0f)) * 64.0f));
        } else {
            this.dimPaint.setAlpha(64);
        }
        this.windowView.invalidate();
        this.webViewContainer.invalidateViewPortHeight();
        if (this.springAnimation != null) {
            float f = (1.0f - (Math.min(this.swipeContainer.getTopActionBarOffsetY(), this.swipeContainer.getTranslationY() - this.swipeContainer.getTopActionBarOffsetY()) / this.swipeContainer.getTopActionBarOffsetY()) > 0.5f ? 1 : 0) * 100.0f;
            if (this.springAnimation.getSpring().getFinalPosition() != f) {
                this.springAnimation.getSpring().setFinalPosition(f);
                this.springAnimation.start();
            }
        }
        float max = Math.max(0.0f, this.swipeContainer.getSwipeOffsetY());
        this.mainButtonAutoAnimator.setOffsetY(max);
        this.radialProgressAutoAnimator.setOffsetY(max);
        System.currentTimeMillis();
    }

    public void lambda$new$11() {
        this.webViewContainer.invalidateViewPortHeight(true);
    }

    public void lambda$new$12() {
        dismiss(true, null);
    }

    public Boolean lambda$new$13(Void r2) {
        return Boolean.valueOf(this.windowView.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
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

    private void updateActionBarColors() {
        if (this.overrideBackgroundColor) {
            return;
        }
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

    private void updateLightStatusBar() {
        boolean z;
        boolean z2 = true;
        if (this.overrideBackgroundColor) {
            z = !this.actionBarIsLight;
        } else {
            z = (AndroidUtilities.isTablet() || ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) < 0.7210000157356262d || this.actionBarTransitionProgress < 0.85f) ? false : false;
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
        super.onCreate(bundle);
        Window window = getWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            window.addFlags(-2147483392);
        } else if (i >= 21) {
            window.addFlags(-2147417856);
        }
        window.setWindowAnimations(R.style.DialogNoAnimation);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.gravity = 51;
        attributes.dimAmount = 0.0f;
        attributes.flags &= -3;
        attributes.softInputMode = 16;
        attributes.height = -1;
        if (i >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
        if (i >= 23) {
            window.setStatusBarColor(0);
        }
        this.windowView.setFitsSystemWindows(true);
        this.windowView.setSystemUiVisibility(1792);
        if (i >= 21) {
            this.windowView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() {
                @Override
                public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    WindowInsets lambda$onCreate$14;
                    lambda$onCreate$14 = BotWebViewSheet.lambda$onCreate$14(view, windowInsets);
                    return lambda$onCreate$14;
                }
            });
        }
        if (i >= 26) {
            AndroidUtilities.setLightNavigationBar(window, ColorUtils.calculateLuminance(this.navBarColor) >= 0.7210000157356262d);
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
    }

    public static WindowInsets lambda$onCreate$14(View view, WindowInsets windowInsets) {
        view.setPadding(0, 0, 0, windowInsets.getSystemWindowInsetBottom());
        if (Build.VERSION.SDK_INT >= 30) {
            return WindowInsets.CONSUMED;
        }
        return windowInsets.consumeSystemWindowInsets();
    }

    @Override
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.springAnimation == null) {
            this.springAnimation = new SpringAnimation(this, ACTION_BAR_TRANSITION_PROGRESS_VALUE).setSpring(new SpringForce().setStiffness(1200.0f).setDampingRatio(1.0f));
        }
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpringAnimation springAnimation = this.springAnimation;
        if (springAnimation != null) {
            springAnimation.cancel();
            this.springAnimation = null;
        }
    }

    public static JSONObject makeThemeParams(Theme.ResourcesProvider resourcesProvider) {
        try {
            JSONObject jSONObject = new JSONObject();
            int color = Theme.getColor(Theme.key_dialogBackground, resourcesProvider);
            jSONObject.put("bg_color", color);
            jSONObject.put("section_bg_color", Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider));
            jSONObject.put("secondary_bg_color", Theme.getColor(Theme.key_windowBackgroundGray, resourcesProvider));
            jSONObject.put("text_color", Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            jSONObject.put("hint_color", Theme.getColor(Theme.key_windowBackgroundWhiteHintText, resourcesProvider));
            jSONObject.put("link_color", Theme.getColor(Theme.key_windowBackgroundWhiteLinkText, resourcesProvider));
            jSONObject.put("button_color", Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            jSONObject.put("button_text_color", Theme.getColor(Theme.key_featuredStickers_buttonText, resourcesProvider));
            jSONObject.put("header_bg_color", Theme.getColor(Theme.key_actionBarDefault, resourcesProvider));
            jSONObject.put("accent_text_color", Theme.blendOver(color, Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4, resourcesProvider)));
            jSONObject.put("section_header_text_color", Theme.blendOver(color, Theme.getColor(Theme.key_windowBackgroundWhiteBlueHeader, resourcesProvider)));
            jSONObject.put("subtitle_text_color", Theme.blendOver(color, Theme.getColor(Theme.key_windowBackgroundWhiteGrayText2, resourcesProvider)));
            jSONObject.put("destructive_text_color", Theme.blendOver(color, Theme.getColor(Theme.key_text_RedRegular, resourcesProvider)));
            jSONObject.put("section_separator_color", Theme.blendOver(color, Theme.getColor(Theme.key_divider, resourcesProvider)));
            return jSONObject;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
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

    @Override
    public boolean isFullSize() {
        Boolean bool = this.fullsize;
        return bool == null ? this.defaultFullsize : bool.booleanValue();
    }

    public void requestWebView(BaseFragment baseFragment, WebViewRequestProps webViewRequestProps) {
        TLRPC$User tLRPC$User;
        TLRPC$InputPeer inputPeer;
        TLRPC$InputPeer inputPeer2;
        this.requestProps = webViewRequestProps;
        int i = webViewRequestProps.currentAccount;
        this.currentAccount = i;
        this.peerId = webViewRequestProps.peerId;
        this.botId = webViewRequestProps.botId;
        this.replyToMsgId = webViewRequestProps.replyToMsgId;
        this.silent = webViewRequestProps.silent;
        this.buttonText = webViewRequestProps.buttonText;
        TLRPC$User user = MessagesController.getInstance(i).getUser(Long.valueOf(this.botId));
        CharSequence userName = UserObject.getUserName(user);
        try {
            TextPaint textPaint = new TextPaint();
            textPaint.setTextSize(AndroidUtilities.dp(20.0f));
            userName = Emoji.replaceEmoji(userName, textPaint.getFontMetricsInt(), false);
        } catch (Exception unused) {
        }
        this.actionBar.setTitle(userName);
        TLRPC$UserFull userFull = MessagesController.getInstance(this.currentAccount).getUserFull(this.botId);
        if ((user != null && user.verified) || (userFull != null && (tLRPC$User = userFull.user) != null && tLRPC$User.verified)) {
            Drawable mutate = getContext().getResources().getDrawable(R.drawable.verified_profile).mutate();
            this.verifiedDrawable = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_featuredStickers_addButton), PorterDuff.Mode.SRC_IN));
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
                public void setAlpha(int i2) {
                    BotWebViewSheet.this.verifiedDrawable.setAlpha(i2);
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
        ActionBarMenu createMenu = this.actionBar.createMenu();
        createMenu.removeAllViews();
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = null;
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(this.currentAccount).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TLRPC$TL_attachMenuBot next = it.next();
            if (next.bot_id == this.botId) {
                tLRPC$TL_attachMenuBot = next;
                break;
            }
        }
        createMenu.addItem(R.id.menu_collapse_bot, R.drawable.arrow_more);
        ActionBarMenuItem addItem = createMenu.addItem(0, R.drawable.ic_ab_other);
        addItem.addSubItem(R.id.menu_open_bot, R.drawable.msg_bot, LocaleController.getString(R.string.BotWebViewOpenBot));
        ActionBarMenuSubItem addSubItem = addItem.addSubItem(R.id.menu_settings, R.drawable.msg_settings, LocaleController.getString(R.string.BotWebViewSettings));
        this.settingsItem = addSubItem;
        addSubItem.setVisibility(8);
        addItem.addSubItem(R.id.menu_reload_page, R.drawable.msg_retry, LocaleController.getString(R.string.BotWebViewReloadPage));
        if (tLRPC$TL_attachMenuBot != null && MediaDataController.getInstance(this.currentAccount).canCreateAttachedMenuBotShortcut(tLRPC$TL_attachMenuBot.bot_id)) {
            addItem.addSubItem(R.id.menu_add_to_home_screen_bot, R.drawable.msg_home, LocaleController.getString(R.string.AddShortcut));
        }
        addItem.addSubItem(R.id.menu_tos_bot, R.drawable.menu_intro, LocaleController.getString(R.string.BotWebViewToS));
        if (tLRPC$TL_attachMenuBot != null && (tLRPC$TL_attachMenuBot.show_in_side_menu || tLRPC$TL_attachMenuBot.show_in_attach_menu)) {
            addItem.addSubItem(R.id.menu_delete_bot, R.drawable.msg_delete, LocaleController.getString(R.string.BotWebViewDeleteBot));
        }
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass11());
        JSONObject makeThemeParams = makeThemeParams(this.resourcesProvider);
        this.webViewContainer.setBotUser(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId)));
        this.webViewContainer.loadFlickerAndSettingsItem(this.currentAccount, this.botId, this.settingsItem);
        preloadShortcutBotIcon(webViewRequestProps.botUser, tLRPC$TL_attachMenuBot);
        if (webViewRequestProps.response != null) {
            loadFromResponse(true);
            return;
        }
        int i2 = webViewRequestProps.type;
        if (i2 == 0) {
            TLRPC$TL_messages_requestWebView tLRPC$TL_messages_requestWebView = new TLRPC$TL_messages_requestWebView();
            tLRPC$TL_messages_requestWebView.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.peerId);
            tLRPC$TL_messages_requestWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tLRPC$TL_messages_requestWebView.platform = "android";
            tLRPC$TL_messages_requestWebView.compact = webViewRequestProps.compact;
            String str = webViewRequestProps.buttonUrl;
            if (str != null) {
                tLRPC$TL_messages_requestWebView.url = str;
                tLRPC$TL_messages_requestWebView.flags |= 2;
            }
            if (this.replyToMsgId != 0) {
                tLRPC$TL_messages_requestWebView.reply_to = SendMessagesHelper.getInstance(this.currentAccount).createReplyInput(this.replyToMsgId);
                tLRPC$TL_messages_requestWebView.flags |= 1;
            }
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON = new TLRPC$TL_dataJSON();
                tLRPC$TL_messages_requestWebView.theme_params = tLRPC$TL_dataJSON;
                tLRPC$TL_dataJSON.data = makeThemeParams.toString();
                tLRPC$TL_messages_requestWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.this.lambda$requestWebView$20(tLObject, tLRPC$TL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
        } else if (i2 == 1) {
            TLRPC$TL_messages_requestSimpleWebView tLRPC$TL_messages_requestSimpleWebView = new TLRPC$TL_messages_requestSimpleWebView();
            tLRPC$TL_messages_requestSimpleWebView.from_switch_webview = (webViewRequestProps.flags & 1) != 0;
            tLRPC$TL_messages_requestSimpleWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tLRPC$TL_messages_requestSimpleWebView.platform = "android";
            tLRPC$TL_messages_requestSimpleWebView.from_side_menu = (webViewRequestProps.flags & 2) != 0;
            tLRPC$TL_messages_requestSimpleWebView.compact = webViewRequestProps.compact;
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON2 = new TLRPC$TL_dataJSON();
                tLRPC$TL_messages_requestSimpleWebView.theme_params = tLRPC$TL_dataJSON2;
                tLRPC$TL_dataJSON2.data = makeThemeParams.toString();
                tLRPC$TL_messages_requestSimpleWebView.flags |= 1;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.buttonUrl)) {
                tLRPC$TL_messages_requestSimpleWebView.flags |= 8;
                tLRPC$TL_messages_requestSimpleWebView.url = webViewRequestProps.buttonUrl;
            }
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tLRPC$TL_messages_requestSimpleWebView.start_param = webViewRequestProps.startParam;
                tLRPC$TL_messages_requestSimpleWebView.flags |= 16;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestSimpleWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.this.lambda$requestWebView$18(tLObject, tLRPC$TL_error);
                }
            });
        } else if (i2 == 2) {
            TLRPC$TL_messages_requestWebView tLRPC$TL_messages_requestWebView2 = new TLRPC$TL_messages_requestWebView();
            tLRPC$TL_messages_requestWebView2.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.botId);
            tLRPC$TL_messages_requestWebView2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.botId);
            tLRPC$TL_messages_requestWebView2.platform = "android";
            tLRPC$TL_messages_requestWebView2.compact = webViewRequestProps.compact;
            tLRPC$TL_messages_requestWebView2.url = webViewRequestProps.buttonUrl;
            tLRPC$TL_messages_requestWebView2.flags |= 2;
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON3 = new TLRPC$TL_dataJSON();
                tLRPC$TL_messages_requestWebView2.theme_params = tLRPC$TL_dataJSON3;
                tLRPC$TL_dataJSON3.data = makeThemeParams.toString();
                tLRPC$TL_messages_requestWebView2.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestWebView2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.this.lambda$requestWebView$16(tLObject, tLRPC$TL_error);
                }
            });
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.webViewResultSent);
        } else if (i2 != 3) {
            if (i2 != 4) {
                return;
            }
            TLRPC$TL_messages_requestMainWebView tLRPC$TL_messages_requestMainWebView = new TLRPC$TL_messages_requestMainWebView();
            tLRPC$TL_messages_requestMainWebView.bot = MessagesController.getInstance(this.currentAccount).getInputUser(webViewRequestProps.botId);
            tLRPC$TL_messages_requestMainWebView.platform = "android";
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity = (ChatActivity) baseFragment;
                inputPeer2 = chatActivity.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity.getCurrentUser()) : MessagesController.getInputPeer(chatActivity.getCurrentChat());
            } else {
                inputPeer2 = MessagesController.getInputPeer(webViewRequestProps.botUser);
            }
            tLRPC$TL_messages_requestMainWebView.peer = inputPeer2;
            tLRPC$TL_messages_requestMainWebView.compact = webViewRequestProps.compact;
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tLRPC$TL_messages_requestMainWebView.start_param = webViewRequestProps.startParam;
                tLRPC$TL_messages_requestMainWebView.flags |= 2;
            }
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON4 = new TLRPC$TL_dataJSON();
                tLRPC$TL_messages_requestMainWebView.theme_params = tLRPC$TL_dataJSON4;
                tLRPC$TL_dataJSON4.data = makeThemeParams.toString();
                tLRPC$TL_messages_requestMainWebView.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestMainWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.this.lambda$requestWebView$24(tLObject, tLRPC$TL_error);
                }
            }, 66);
        } else {
            TLRPC$TL_messages_requestAppWebView tLRPC$TL_messages_requestAppWebView = new TLRPC$TL_messages_requestAppWebView();
            TLRPC$TL_inputBotAppID tLRPC$TL_inputBotAppID = new TLRPC$TL_inputBotAppID();
            TLRPC$BotApp tLRPC$BotApp = webViewRequestProps.app;
            tLRPC$TL_inputBotAppID.id = tLRPC$BotApp.id;
            tLRPC$TL_inputBotAppID.access_hash = tLRPC$BotApp.access_hash;
            tLRPC$TL_messages_requestAppWebView.app = tLRPC$TL_inputBotAppID;
            tLRPC$TL_messages_requestAppWebView.write_allowed = webViewRequestProps.allowWrite;
            tLRPC$TL_messages_requestAppWebView.platform = "android";
            if (baseFragment instanceof ChatActivity) {
                ChatActivity chatActivity2 = (ChatActivity) baseFragment;
                inputPeer = chatActivity2.getCurrentUser() != null ? MessagesController.getInputPeer(chatActivity2.getCurrentUser()) : MessagesController.getInputPeer(chatActivity2.getCurrentChat());
            } else {
                inputPeer = MessagesController.getInputPeer(webViewRequestProps.botUser);
            }
            tLRPC$TL_messages_requestAppWebView.peer = inputPeer;
            tLRPC$TL_messages_requestAppWebView.compact = webViewRequestProps.compact;
            if (!TextUtils.isEmpty(webViewRequestProps.startParam)) {
                tLRPC$TL_messages_requestAppWebView.start_param = webViewRequestProps.startParam;
                tLRPC$TL_messages_requestAppWebView.flags |= 2;
            }
            if (makeThemeParams != null) {
                TLRPC$TL_dataJSON tLRPC$TL_dataJSON5 = new TLRPC$TL_dataJSON();
                tLRPC$TL_messages_requestAppWebView.theme_params = tLRPC$TL_dataJSON5;
                tLRPC$TL_dataJSON5.data = makeThemeParams.toString();
                tLRPC$TL_messages_requestAppWebView.flags |= 4;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_messages_requestAppWebView, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    BotWebViewSheet.this.lambda$requestWebView$22(tLObject, tLRPC$TL_error);
                }
            }, 66);
        }
    }

    public class AnonymousClass11 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass11() {
        }

        @Override
        public void onItemClick(int i) {
            if (i == -1) {
                if (BotWebViewSheet.this.webViewContainer.onBackPressed()) {
                    return;
                }
                BotWebViewSheet.this.onCheckDismissByUser();
            } else if (i == R.id.menu_open_bot) {
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", BotWebViewSheet.this.botId);
                if (BotWebViewSheet.this.parentActivity instanceof LaunchActivity) {
                    ((LaunchActivity) BotWebViewSheet.this.parentActivity).lambda$runLinkRequest$91(new ChatActivity(bundle));
                }
                BotWebViewSheet.this.dismiss();
            } else if (i == R.id.menu_tos_bot) {
                Browser.openUrl(BotWebViewSheet.this.getContext(), LocaleController.getString(R.string.BotWebViewToSLink));
            } else if (i == R.id.menu_reload_page) {
                if (BotWebViewSheet.this.webViewContainer.getWebView() != null) {
                    BotWebViewSheet.this.webViewContainer.getWebView().animate().cancel();
                    BotWebViewSheet.this.webViewContainer.getWebView().animate().alpha(0.0f).start();
                }
                BotWebViewSheet.this.progressView.setLoadProgress(0.0f);
                BotWebViewSheet.this.progressView.setAlpha(1.0f);
                BotWebViewSheet.this.progressView.setVisibility(0);
                BotWebViewSheet.this.webViewContainer.setBotUser(MessagesController.getInstance(BotWebViewSheet.this.currentAccount).getUser(Long.valueOf(BotWebViewSheet.this.botId)));
                BotWebViewSheet.this.webViewContainer.loadFlickerAndSettingsItem(BotWebViewSheet.this.currentAccount, BotWebViewSheet.this.botId, BotWebViewSheet.this.settingsItem);
                BotWebViewSheet.this.webViewContainer.reload();
            } else if (i == R.id.menu_settings) {
                BotWebViewSheet.this.webViewContainer.onSettingsButtonPressed();
            } else if (i == R.id.menu_delete_bot) {
                BotWebViewSheet.deleteBot(BotWebViewSheet.this.currentAccount, BotWebViewSheet.this.botId, new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewSheet.AnonymousClass11.this.lambda$onItemClick$0();
                    }
                });
            } else if (i == R.id.menu_add_to_home_screen_bot) {
                MediaDataController.getInstance(BotWebViewSheet.this.currentAccount).installShortcut(BotWebViewSheet.this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
            } else if (i == R.id.menu_collapse_bot) {
                BotWebViewSheet.this.forceExpnaded = true;
                BotWebViewSheet.this.dismiss(true, null);
            }
        }

        public void lambda$onItemClick$0() {
            BotWebViewSheet.this.dismiss();
        }
    }

    public void lambda$requestWebView$16(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$requestWebView$15(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$requestWebView$15(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        WebViewRequestProps webViewRequestProps;
        if (tLRPC$TL_error == null && (webViewRequestProps = this.requestProps) != null) {
            webViewRequestProps.applyResponse(tLObject);
            loadFromResponse(false);
        }
    }

    public void lambda$requestWebView$18(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$requestWebView$17(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$requestWebView$17(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        WebViewRequestProps webViewRequestProps;
        if (tLRPC$TL_error == null && (webViewRequestProps = this.requestProps) != null) {
            webViewRequestProps.applyResponse(tLObject);
            loadFromResponse(false);
        }
    }

    public void lambda$requestWebView$20(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$requestWebView$19(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$requestWebView$19(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        WebViewRequestProps webViewRequestProps;
        if (tLRPC$TL_error == null && (webViewRequestProps = this.requestProps) != null) {
            webViewRequestProps.applyResponse(tLObject);
            loadFromResponse(false);
        }
    }

    public void lambda$requestWebView$22(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$requestWebView$21(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$requestWebView$21(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        WebViewRequestProps webViewRequestProps;
        if (tLRPC$TL_error == null && (webViewRequestProps = this.requestProps) != null) {
            webViewRequestProps.applyResponse(tLObject);
            loadFromResponse(false);
        }
    }

    public void lambda$requestWebView$24(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$requestWebView$23(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$requestWebView$23(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        WebViewRequestProps webViewRequestProps;
        if (tLRPC$TL_error == null && (webViewRequestProps = this.requestProps) != null) {
            webViewRequestProps.applyResponse(tLObject);
            loadFromResponse(false);
        }
    }

    private void loadFromResponse(boolean z) {
        if (this.requestProps == null) {
            return;
        }
        long max = Math.max(0L, 60000 - (System.currentTimeMillis() - this.requestProps.responseTime));
        String str = null;
        this.fullsize = null;
        TLObject tLObject = this.requestProps.response;
        if (tLObject instanceof TLRPC$TL_webViewResultUrl) {
            TLRPC$TL_webViewResultUrl tLRPC$TL_webViewResultUrl = (TLRPC$TL_webViewResultUrl) tLObject;
            this.queryId = tLRPC$TL_webViewResultUrl.query_id;
            str = tLRPC$TL_webViewResultUrl.url;
            this.fullsize = Boolean.valueOf(tLRPC$TL_webViewResultUrl.fullsize);
        } else if (tLObject instanceof TLRPC$TL_appWebViewResultUrl) {
            this.queryId = 0L;
            str = ((TLRPC$TL_appWebViewResultUrl) tLObject).url;
        } else if (tLObject instanceof TLRPC$TL_simpleWebViewResultUrl) {
            this.queryId = 0L;
            str = ((TLRPC$TL_simpleWebViewResultUrl) tLObject).url;
        }
        if (str != null && !z) {
            MediaDataController.getInstance(this.currentAccount).increaseWebappRating(this.requestProps.botId);
            this.webViewContainer.loadUrl(this.currentAccount, str);
        }
        AndroidUtilities.runOnUIThread(this.pollRunnable, max);
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        if (webViewSwipeContainer != null) {
            webViewSwipeContainer.setFullSize(isFullSize());
        }
    }

    private void preloadShortcutBotIcon(TLRPC$User tLRPC$User, TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot) {
        if (tLRPC$TL_attachMenuBot == null || !tLRPC$TL_attachMenuBot.show_in_side_menu || MediaDataController.getInstance(this.currentAccount).isShortcutAdded(this.botId, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT)) {
            return;
        }
        if (tLRPC$User == null) {
            tLRPC$User = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
        }
        if (tLRPC$User == null || tLRPC$User.photo == null || FileLoader.getInstance(this.currentAccount).getPathToAttach(tLRPC$User.photo.photo_small, true).exists()) {
            return;
        }
        MediaDataController.getInstance(this.currentAccount).preloadImage(ImageLocation.getForUser(tLRPC$User, 1), 0);
    }

    public static void deleteBot(final int i, final long j, final Runnable runnable) {
        final TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot;
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(i).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                tLRPC$TL_attachMenuBot = null;
                break;
            }
            TLRPC$TL_attachMenuBot next = it.next();
            if (next.bot_id == j) {
                tLRPC$TL_attachMenuBot = next;
                break;
            }
        }
        if (tLRPC$TL_attachMenuBot == null) {
            return;
        }
        new AlertDialog.Builder(LaunchActivity.getLastFragment().getContext()).setTitle(LocaleController.getString(R.string.BotRemoveFromMenuTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("BotRemoveFromMenu", R.string.BotRemoveFromMenu, tLRPC$TL_attachMenuBot.short_name))).setPositiveButton(LocaleController.getString("OK", R.string.OK), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i2) {
                BotWebViewSheet.lambda$deleteBot$27(i, j, tLRPC$TL_attachMenuBot, runnable, dialogInterface, i2);
            }
        }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).show();
    }

    public static void lambda$deleteBot$27(final int i, long j, TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot, Runnable runnable, DialogInterface dialogInterface, int i2) {
        TLRPC$TL_messages_toggleBotInAttachMenu tLRPC$TL_messages_toggleBotInAttachMenu = new TLRPC$TL_messages_toggleBotInAttachMenu();
        tLRPC$TL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(i).getInputUser(j);
        tLRPC$TL_messages_toggleBotInAttachMenu.enabled = false;
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_toggleBotInAttachMenu, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewSheet.lambda$deleteBot$26(i, tLObject, tLRPC$TL_error);
            }
        }, 66);
        tLRPC$TL_attachMenuBot.show_in_side_menu = false;
        NotificationCenter.getInstance(i).lambda$postNotificationNameOnUIThread$1(NotificationCenter.attachMenuBotsDidLoad, new Object[0]);
        MediaDataController.getInstance(i).uninstallShortcut(j, MediaDataController.SHORTCUT_TYPE_ATTACHED_BOT);
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$deleteBot$26(final int i, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.lambda$deleteBot$25(i);
            }
        });
    }

    public static void lambda$deleteBot$25(int i) {
        MediaDataController.getInstance(i).loadAttachMenuBots(false, true);
    }

    public int getColor(int i) {
        return Theme.getColor(i, this.resourcesProvider);
    }

    @Override
    public void show() {
        if (AndroidUtilities.isSafeToShow(getContext())) {
            this.windowView.setAlpha(0.0f);
            this.windowView.addOnLayoutChangeListener(new AnonymousClass12());
            super.show();
        }
    }

    public class AnonymousClass12 implements View.OnLayoutChangeListener {
        AnonymousClass12() {
        }

        @Override
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            BotWebViewSheet.this.swipeContainer.setSwipeOffsetY(BotWebViewSheet.this.swipeContainer.getHeight());
            BotWebViewSheet.this.windowView.setAlpha(1.0f);
            final AnimationNotificationsLocker animationNotificationsLocker = new AnimationNotificationsLocker();
            animationNotificationsLocker.lock();
            BotWebViewSheet botWebViewSheet = BotWebViewSheet.this;
            if (botWebViewSheet.showOffsetY != Float.MAX_VALUE) {
                botWebViewSheet.swipeContainer.setSwipeOffsetAnimationDisallowed(true);
                BotWebViewSheet.this.swipeContainer.setOffsetY(BotWebViewSheet.this.showOffsetY);
                BotWebViewSheet.this.swipeContainer.setSwipeOffsetAnimationDisallowed(false);
            }
            BotWebViewSheet botWebViewSheet2 = BotWebViewSheet.this;
            if (botWebViewSheet2.showExpanded || botWebViewSheet2.isFullSize()) {
                BotWebViewSheet.this.swipeContainer.stickTo((-BotWebViewSheet.this.swipeContainer.getOffsetY()) + BotWebViewSheet.this.swipeContainer.getTopActionBarOffsetY(), new BotWebViewAttachedSheet$11$$ExternalSyntheticLambda1(animationNotificationsLocker));
            } else {
                new SpringAnimation(BotWebViewSheet.this.swipeContainer, ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer.SWIPE_OFFSET_Y, 0.0f).setSpring(new SpringForce(0.0f).setDampingRatio(0.75f).setStiffness(500.0f)).addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                    @Override
                    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                        AnimationNotificationsLocker.this.unlock();
                    }
                }).start();
            }
            BotWebViewSheet.this.swipeContainer.opened = true;
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
        } else if (this.webViewContainer.onBackPressed()) {
        } else {
            dismiss(true, null);
        }
    }

    @Override
    public void dismiss() {
        dismiss((Runnable) null);
    }

    public boolean onCheckDismissByUser() {
        if (this.needCloseConfirmation) {
            TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.botId));
            AlertDialog create = new AlertDialog.Builder(getContext()).setTitle(user != null ? ContactsController.formatName(user.first_name, user.last_name) : null).setMessage(LocaleController.getString(R.string.BotWebViewChangesMayNotBeSaved)).setPositiveButton(LocaleController.getString(R.string.BotWebViewCloseAnyway), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    BotWebViewSheet.this.lambda$onCheckDismissByUser$28(dialogInterface, i);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).create();
            create.show();
            ((TextView) create.getButton(-1)).setTextColor(getColor(Theme.key_text_RedBold));
            return false;
        }
        dismiss();
        return true;
    }

    public void lambda$onCheckDismissByUser$28(DialogInterface dialogInterface, int i) {
        dismiss();
    }

    public void dismiss(Runnable runnable) {
        dismiss(false, runnable);
    }

    public void dismiss(boolean z, final Runnable runnable) {
        LaunchActivity launchActivity;
        if (this.dismissed) {
            return;
        }
        this.dismissed = true;
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.webViewResultSent);
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
            return;
        }
        this.webViewContainer.destroyWebView();
        ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = this.swipeContainer;
        webViewSwipeContainer.stickTo(webViewSwipeContainer.getHeight() + this.windowView.measureKeyboardHeight() + (isFullSize() ? AndroidUtilities.dp(200.0f) : 0), new Runnable() {
            @Override
            public final void run() {
                BotWebViewSheet.this.lambda$dismiss$29(runnable);
            }
        });
    }

    public void lambda$dismiss$29(Runnable runnable) {
        super.dismiss();
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void release() {
        super.dismiss();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.webViewResultSent) {
            if (this.queryId == ((Long) objArr[0]).longValue()) {
                dismiss();
            }
        } else if (i == NotificationCenter.didSetNewTheme) {
            this.windowView.invalidate();
            this.webViewContainer.updateFlickerBackgroundColor(getColor(Theme.key_windowBackgroundWhite));
            updateActionBarColors();
            updateLightStatusBar();
        }
    }

    public static int navigationBarColor(int i) {
        AndroidUtilities.computePerceivedBrightness(i);
        return Theme.adaptHSV(i, 0.35f, -0.1f);
    }

    public void setBackgroundColor(final int i, boolean z) {
        final int color = this.backgroundPaint.getColor();
        if (z) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet.this.lambda$setBackgroundColor$30(color, i, valueAnimator);
                }
            });
            duration.start();
            return;
        }
        this.backgroundPaint.setColor(i);
        updateActionBarColors();
        this.windowView.invalidate();
    }

    public void lambda$setBackgroundColor$30(int i, int i2, ValueAnimator valueAnimator) {
        this.backgroundPaint.setColor(ColorUtils.blendARGB(i, i2, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        updateActionBarColors();
        this.windowView.invalidate();
    }

    public void setActionBarColor(final int i, boolean z, boolean z2) {
        final int i2 = this.actionBarColor;
        final int i3 = this.navBarColor;
        final int navigationBarColor = navigationBarColor(i);
        final BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating = new BotWebViewMenuContainer$ActionBarColorsAnimating();
        botWebViewMenuContainer$ActionBarColorsAnimating.setFrom(this.overrideBackgroundColor ? this.actionBarColor : 0, this.resourcesProvider);
        this.overrideBackgroundColor = z;
        this.actionBarIsLight = ColorUtils.calculateLuminance(i) < 0.7210000157356262d;
        botWebViewMenuContainer$ActionBarColorsAnimating.setTo(this.overrideBackgroundColor ? i : 0, this.resourcesProvider);
        if (z2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    BotWebViewSheet.this.lambda$setActionBarColor$31(i2, i, i3, navigationBarColor, botWebViewMenuContainer$ActionBarColorsAnimating, valueAnimator);
                }
            });
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    BotWebViewSheet.this.actionBarColor = ColorUtils.blendARGB(i2, i, 1.0f);
                    BotWebViewSheet.this.navBarColor = ColorUtils.blendARGB(i3, navigationBarColor, 1.0f);
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
            this.navBarColor = navigationBarColor;
            checkNavBarColor();
            this.windowView.invalidate();
            this.actionBar.setBackgroundColor(this.actionBarColor);
            botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(this.actionBar, 1.0f);
            this.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
            this.windowView.invalidate();
        }
        updateLightStatusBar();
    }

    public void lambda$setActionBarColor$31(int i, int i2, int i3, int i4, BotWebViewMenuContainer$ActionBarColorsAnimating botWebViewMenuContainer$ActionBarColorsAnimating, ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.actionBarColor = ColorUtils.blendARGB(i, i2, floatValue);
        this.navBarColor = ColorUtils.blendARGB(i3, i4, floatValue);
        checkNavBarColor();
        this.windowView.invalidate();
        this.actionBar.setBackgroundColor(this.actionBarColor);
        botWebViewMenuContainer$ActionBarColorsAnimating.updateActionBar(this.actionBar, floatValue);
        this.lineColor = botWebViewMenuContainer$ActionBarColorsAnimating.getColor(Theme.key_sheet_scrollUp);
        this.windowView.invalidate();
    }

    public void checkNavBarColor() {
        LaunchActivity launchActivity;
        if (this.dismissed || (launchActivity = LaunchActivity.instance) == null) {
            return;
        }
        launchActivity.checkSystemBarColors(true, true, true, false);
    }

    @Override
    public int getNavigationBarColor(int i) {
        return this.navBarColor;
    }

    @Override
    public WindowView mo943getWindowView() {
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
        public void dispatchDraw(Canvas canvas) {
            if (this.drawingFromOverlay) {
                return;
            }
            super.dispatchDraw(canvas);
            if (BotWebViewSheet.this.passcodeView.getVisibility() != 0) {
                this.navbarPaint.setColor(BotWebViewSheet.this.navBarColor);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight() + AndroidUtilities.navigationBarHeight);
                canvas.drawRect(rectF, this.navbarPaint);
            }
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (this.drawingFromOverlay) {
                return;
            }
            super.onDraw(canvas);
            if (BotWebViewSheet.this.passcodeView.getVisibility() != 0) {
                if (!BotWebViewSheet.this.overrideBackgroundColor) {
                    BotWebViewSheet.this.backgroundPaint.setColor(BotWebViewSheet.this.getColor(Theme.key_windowBackgroundWhite));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRect(rectF, BotWebViewSheet.this.dimPaint);
                BotWebViewSheet.this.actionBarPaint.setColor(BotWebViewSheet.this.actionBarColor);
                float dp = AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - BotWebViewSheet.this.actionBarTransitionProgress);
                rectF.set(BotWebViewSheet.this.swipeContainer.getLeft(), AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY(), 0.0f, BotWebViewSheet.this.actionBarTransitionProgress), BotWebViewSheet.this.swipeContainer.getRight(), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f) + dp);
                canvas.drawRoundRect(rectF, dp, dp, BotWebViewSheet.this.actionBarPaint);
                rectF.set(BotWebViewSheet.this.swipeContainer.getLeft(), BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), BotWebViewSheet.this.swipeContainer.getRight(), getHeight());
                canvas.drawRect(rectF, BotWebViewSheet.this.backgroundPaint);
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
            BotWebViewSheet.this.linePaint.setAlpha((int) (BotWebViewSheet.this.linePaint.getAlpha() * (1.0f - (Math.min(0.5f, f) / 0.5f))));
            canvas.save();
            float f2 = 1.0f - f;
            float lerp = AndroidUtilities.isTablet() ? AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(12.0f), AndroidUtilities.statusBarHeight / 2.0f, BotWebViewSheet.this.actionBarTransitionProgress) : AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY(), AndroidUtilities.statusBarHeight + (ActionBar.getCurrentActionBarHeight() / 2.0f), f) + AndroidUtilities.dp(12.0f);
            canvas.scale(f2, f2, getWidth() / 2.0f, lerp);
            canvas.drawLine((getWidth() / 2.0f) - AndroidUtilities.dp(16.0f), lerp, (getWidth() / 2.0f) + AndroidUtilities.dp(16.0f), lerp, BotWebViewSheet.this.linePaint);
            canvas.restore();
            BotWebViewSheet.this.actionBarShadow.setAlpha((int) (BotWebViewSheet.this.actionBar.getAlpha() * 255.0f));
            float y = BotWebViewSheet.this.actionBar.getY() + BotWebViewSheet.this.actionBar.getTranslationY() + BotWebViewSheet.this.actionBar.getHeight();
            BotWebViewSheet.this.actionBarShadow.setBounds(0, (int) y, getWidth(), (int) (y + BotWebViewSheet.this.actionBarShadow.getIntrinsicHeight()));
            BotWebViewSheet.this.actionBarShadow.draw(canvas);
        }

        @Override
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0 && (motionEvent.getY() <= AndroidUtilities.lerp(BotWebViewSheet.this.swipeContainer.getTranslationY() + AndroidUtilities.dp(24.0f), 0.0f, BotWebViewSheet.this.actionBarTransitionProgress) || motionEvent.getX() > BotWebViewSheet.this.swipeContainer.getRight() || motionEvent.getX() < BotWebViewSheet.this.swipeContainer.getLeft())) {
                BotWebViewSheet.this.dismiss(true, null);
                return true;
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            Bulletin.addDelegate(this, new Bulletin.Delegate(this) {
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
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            Bulletin.removeDelegate(this);
        }

        @Override
        public void setDrawingFromOverlay(boolean z) {
            if (this.drawingFromOverlay != z) {
                this.drawingFromOverlay = z;
                invalidate();
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
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(16.0f) * (AndroidUtilities.isTablet() ? 1.0f : 1.0f - BotWebViewSheet.this.actionBarTransitionProgress), AndroidUtilities.dp(10.0f), f);
            this.clipPath.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
            canvas.clipPath(this.clipPath);
            canvas.drawPaint(BotWebViewSheet.this.backgroundPaint);
            if (BotWebViewSheet.this.swipeContainer != null) {
                canvas.save();
                canvas.translate(rectF2.left, Math.max(BotWebViewSheet.this.swipeContainer.getY(), rectF2.top) + (f * AndroidUtilities.dp(51.0f)));
                BotWebViewSheet.this.swipeContainer.draw(canvas);
                canvas.restore();
            }
            canvas.restore();
            return lerp;
        }
    }

    public void setMainButton(final BotWebViewAttachedSheet.MainButtonSettings mainButtonSettings) {
        this.mainButtonSettings = mainButtonSettings;
        this.mainButton.setClickable(mainButtonSettings.isActive);
        this.mainButton.setText(mainButtonSettings.text);
        this.mainButton.setTextColor(mainButtonSettings.textColor);
        this.mainButton.setBackground(BotWebViewContainer.getMainButtonRippleDrawable(mainButtonSettings.color));
        boolean z = mainButtonSettings.isVisible;
        if (z != this.mainButtonWasVisible) {
            this.mainButtonWasVisible = z;
            this.mainButton.animate().cancel();
            if (mainButtonSettings.isVisible) {
                this.mainButton.setAlpha(0.0f);
                this.mainButton.setVisibility(0);
            }
            this.mainButton.animate().alpha(mainButtonSettings.isVisible ? 1.0f : 0.0f).setDuration(150L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (!mainButtonSettings.isVisible) {
                        BotWebViewSheet.this.mainButton.setVisibility(8);
                    }
                    BotWebViewSheet.this.swipeContainer.requestLayout();
                }
            }).start();
        }
        this.radialProgressView.setProgressColor(mainButtonSettings.textColor);
        boolean z2 = mainButtonSettings.isProgressVisible;
        if (z2 != this.mainButtonProgressWasVisible) {
            this.mainButtonProgressWasVisible = z2;
            this.radialProgressView.animate().cancel();
            if (mainButtonSettings.isProgressVisible) {
                this.radialProgressView.setAlpha(0.0f);
                this.radialProgressView.setVisibility(0);
            }
            this.radialProgressView.animate().alpha(mainButtonSettings.isProgressVisible ? 1.0f : 0.0f).scaleX(mainButtonSettings.isProgressVisible ? 1.0f : 0.1f).scaleY(mainButtonSettings.isProgressVisible ? 1.0f : 0.1f).setDuration(250L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (mainButtonSettings.isProgressVisible) {
                        return;
                    }
                    BotWebViewSheet.this.radialProgressView.setVisibility(8);
                }
            }).start();
        }
    }
}
