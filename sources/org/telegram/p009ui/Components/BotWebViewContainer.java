package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.GeolocationPermissions;
import android.webkit.JavascriptInterface;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.C1010R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.browser.Browser;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.C1069ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.BotWebViewContainer;
import org.telegram.p009ui.Components.ChatAttachAlertBotWebViewLayout;
import org.telegram.p009ui.Components.voip.CellFlickerDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$TL_attachMenuBot;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotIcon;
import org.telegram.tgnet.TLRPC$TL_attachMenuBotsBot;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_getAttachMenuBot;
import org.telegram.tgnet.TLRPC$User;

public class BotWebViewContainer extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final List<String> WHITELISTED_SCHEMES = Arrays.asList("http", "https");
    private TLRPC$User botUser;
    private String buttonData;
    private int currentAccount;
    private AlertDialog currentDialog;
    private String currentPaymentSlug;
    private Delegate delegate;
    private int dialogSequentialOpenTimes;
    private CellFlickerDrawable flickerDrawable;
    private BackupImageView flickerView;
    private boolean hasUserPermissions;
    private boolean isBackButtonVisible;
    private boolean isFlickeringCenter;
    private boolean isPageLoaded;
    private boolean isRequestingPageOpen;
    private boolean isViewPortByMeasureSuppressed;
    private int lastButtonColor;
    private String lastButtonText;
    private int lastButtonTextColor;
    private long lastClickMs;
    private long lastDialogClosed;
    private long lastDialogCooldownTime;
    private boolean lastExpanded;
    private ValueCallback<Uri[]> mFilePathCallback;
    private String mUrl;
    private Runnable onPermissionsRequestResultCallback;
    private Activity parentActivity;
    private Theme.ResourcesProvider resourcesProvider;
    private WebView webView;
    private boolean webViewNotAvailable;
    private TextView webViewNotAvailableText;
    private Consumer<Float> webViewProgressListener;
    private WebViewScrollListener webViewScrollListener;

    public interface Delegate {

        public final class CC {
            public static void $default$onSendWebViewData(Delegate delegate, String str) {
            }

            public static void $default$onWebAppReady(Delegate delegate) {
            }
        }

        void onCloseRequested(Runnable runnable);

        void onSendWebViewData(String str);

        void onSetBackButtonVisible(boolean z);

        void onSetupMainButton(boolean z, boolean z2, String str, int i, int i2, boolean z3);

        void onWebAppExpand();

        void onWebAppOpenInvoice(String str, TLObject tLObject);

        void onWebAppReady();

        void onWebAppSetActionBarColor(String str);

        void onWebAppSetBackgroundColor(int i);

        void onWebAppSetupClosingBehavior(boolean z);
    }

    public interface WebViewScrollListener {
        void onWebViewScrolled(WebView webView, int i, int i2);
    }

    public static void lambda$evaluateJs$6(String str) {
    }

    public BotWebViewContainer(Context context, Theme.ResourcesProvider resourcesProvider, int i) {
        super(context);
        this.flickerDrawable = new CellFlickerDrawable();
        this.lastButtonColor = getColor("featuredStickers_addButton");
        this.lastButtonTextColor = getColor("featuredStickers_buttonText");
        this.lastButtonText = BuildConfig.APP_CENTER_HASH;
        this.resourcesProvider = resourcesProvider;
        if (context instanceof Activity) {
            this.parentActivity = (Activity) context;
        }
        CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
        cellFlickerDrawable.drawFrame = false;
        cellFlickerDrawable.setColors(i, 153, 204);
        BackupImageView backupImageView = new BackupImageView(context) {
            {
                this.imageReceiver = new C17551(this);
            }

            public class C17551 extends ImageReceiver {
                C17551(View view) {
                    super(view);
                }

                @Override
                public boolean setImageBitmapByKey(Drawable drawable, String str, int i, boolean z, int i2) {
                    boolean imageBitmapByKey = super.setImageBitmapByKey(drawable, str, i, z, i2);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                    duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                        @Override
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            BotWebViewContainer.C17541.C17551.this.lambda$setImageBitmapByKey$0(valueAnimator);
                        }
                    });
                    duration.start();
                    return imageBitmapByKey;
                }

                public void lambda$setImageBitmapByKey$0(ValueAnimator valueAnimator) {
                    C17541.this.imageReceiver.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    invalidate();
                }
            }

            @Override
            protected void onDraw(Canvas canvas) {
                if (BotWebViewContainer.this.isFlickeringCenter) {
                    super.onDraw(canvas);
                    return;
                }
                Drawable drawable = this.imageReceiver.getDrawable();
                if (drawable != null) {
                    this.imageReceiver.setImageCoords(0.0f, 0.0f, getWidth(), drawable.getIntrinsicHeight() * (getWidth() / drawable.getIntrinsicWidth()));
                    this.imageReceiver.draw(canvas);
                }
            }
        };
        this.flickerView = backupImageView;
        backupImageView.setColorFilter(new PorterDuffColorFilter(getColor("dialogSearchHint"), PorterDuff.Mode.SRC_IN));
        this.flickerView.getImageReceiver().setAspectFit(true);
        addView(this.flickerView, LayoutHelper.createFrame(-1, -2, 48));
        TextView textView = new TextView(context);
        this.webViewNotAvailableText = textView;
        textView.setText(LocaleController.getString(C1010R.string.BotWebViewNotAvailablePlaceholder));
        this.webViewNotAvailableText.setTextColor(getColor("windowBackgroundWhiteGrayText"));
        this.webViewNotAvailableText.setTextSize(1, 15.0f);
        this.webViewNotAvailableText.setGravity(17);
        this.webViewNotAvailableText.setVisibility(8);
        int m35dp = AndroidUtilities.m35dp(16.0f);
        this.webViewNotAvailableText.setPadding(m35dp, m35dp, m35dp, m35dp);
        addView(this.webViewNotAvailableText, LayoutHelper.createFrame(-1, -2, 17));
        setFocusable(false);
    }

    public void setViewPortByMeasureSuppressed(boolean z) {
        this.isViewPortByMeasureSuppressed = z;
    }

    private void checkCreateWebView() {
        if (this.webView != null || this.webViewNotAvailable) {
            return;
        }
        try {
            setupWebView();
        } catch (Throwable th) {
            FileLog.m31e(th);
            this.flickerView.setVisibility(8);
            this.webViewNotAvailable = true;
            this.webViewNotAvailableText.setVisibility(0);
            if (this.webView != null) {
                removeView(this.webView);
            }
        }
    }

    @SuppressLint({"SetJavaScriptEnabled", "AddJavascriptInterface"})
    private void setupWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            webView.destroy();
            removeView(this.webView);
        }
        WebView webView2 = new WebView(getContext()) {
            private int prevScrollX;
            private int prevScrollY;

            @Override
            protected void onScrollChanged(int i, int i2, int i3, int i4) {
                super.onScrollChanged(i, i2, i3, i4);
                if (BotWebViewContainer.this.webViewScrollListener != null) {
                    BotWebViewContainer.this.webViewScrollListener.onWebViewScrolled(this, getScrollX() - this.prevScrollX, getScrollY() - this.prevScrollY);
                }
                this.prevScrollX = getScrollX();
                this.prevScrollY = getScrollY();
            }

            @Override
            public void setScrollX(int i) {
                super.setScrollX(i);
                this.prevScrollX = i;
            }

            @Override
            public void setScrollY(int i) {
                super.setScrollY(i);
                this.prevScrollY = i;
            }

            @Override
            public boolean onCheckIsTextEditor() {
                return BotWebViewContainer.this.isFocusable();
            }

            @Override
            protected void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
            }

            @Override
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0) {
                    BotWebViewContainer.this.lastClickMs = System.currentTimeMillis();
                }
                return super.onTouchEvent(motionEvent);
            }
        };
        this.webView = webView2;
        webView2.setBackgroundColor(getColor("windowBackgroundWhite"));
        WebSettings settings = this.webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setGeolocationEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setTextSize(WebSettings.TextSize.NORMAL);
        File file = new File(ApplicationLoader.getFilesDirFixed(), "webview_database");
        if ((file.exists() && file.isDirectory()) || file.mkdirs()) {
            settings.setDatabasePath(file.getAbsolutePath());
        }
        GeolocationPermissions.getInstance().clearAll();
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView webView3, String str) {
                Uri parse = Uri.parse(BotWebViewContainer.this.mUrl);
                Uri parse2 = Uri.parse(str);
                if (!BotWebViewContainer.this.isPageLoaded || (Objects.equals(parse.getHost(), parse2.getHost()) && Objects.equals(parse.getPath(), parse2.getPath()))) {
                    return false;
                }
                if (BotWebViewContainer.WHITELISTED_SCHEMES.contains(parse2.getScheme())) {
                    BotWebViewContainer.this.onOpenUri(parse2);
                    return true;
                }
                return true;
            }

            @Override
            public void onPageFinished(WebView webView3, String str) {
                BotWebViewContainer.this.setPageLoaded(str);
            }
        });
        this.webView.setWebChromeClient(new C17584());
        this.webView.setAlpha(0.0f);
        addView(this.webView);
        if (Build.VERSION.SDK_INT >= 17) {
            this.webView.addJavascriptInterface(new WebViewProxy(), "TelegramWebviewProxy");
        }
    }

    public class C17584 extends WebChromeClient {
        private Dialog lastPermissionsDialog;

        C17584() {
        }

        @Override
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            Context context = BotWebViewContainer.this.getContext();
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (BotWebViewContainer.this.mFilePathCallback != null) {
                    BotWebViewContainer.this.mFilePathCallback.onReceiveValue(null);
                }
                BotWebViewContainer.this.mFilePathCallback = valueCallback;
                if (Build.VERSION.SDK_INT >= 21) {
                    activity.startActivityForResult(fileChooserParams.createIntent(), 3000);
                    return true;
                }
                Intent intent = new Intent("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("*/*");
                activity.startActivityForResult(Intent.createChooser(intent, LocaleController.getString(C1010R.string.BotWebViewFileChooserTitle)), 3000);
                return true;
            }
            return false;
        }

        @Override
        public void onProgressChanged(WebView webView, int i) {
            if (BotWebViewContainer.this.webViewProgressListener != null) {
                BotWebViewContainer.this.webViewProgressListener.accept(Float.valueOf(i / 100.0f));
            }
        }

        @Override
        public void onGeolocationPermissionsShowPrompt(final String str, final GeolocationPermissions.Callback callback) {
            if (BotWebViewContainer.this.parentActivity != null) {
                Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(BotWebViewContainer.this.parentActivity, BotWebViewContainer.this.resourcesProvider, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, C1010R.raw.permission_request_location, LocaleController.formatString(C1010R.string.BotWebViewRequestGeolocationPermission, UserObject.getUserName(BotWebViewContainer.this.botUser)), LocaleController.formatString(C1010R.string.BotWebViewRequestGeolocationPermissionWithHint, UserObject.getUserName(BotWebViewContainer.this.botUser)), new Consumer() {
                    @Override
                    public final void accept(Object obj) {
                        BotWebViewContainer.C17584.this.lambda$onGeolocationPermissionsShowPrompt$1(callback, str, (Boolean) obj);
                    }
                });
                this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                createWebViewPermissionsRequestDialog.show();
                return;
            }
            callback.invoke(str, false, false);
        }

        public void lambda$onGeolocationPermissionsShowPrompt$1(final GeolocationPermissions.Callback callback, final String str, Boolean bool) {
            if (this.lastPermissionsDialog != null) {
                this.lastPermissionsDialog = null;
                if (bool.booleanValue()) {
                    BotWebViewContainer.this.runWithPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BotWebViewContainer.C17584.this.lambda$onGeolocationPermissionsShowPrompt$0(callback, str, (Boolean) obj);
                        }
                    });
                } else {
                    callback.invoke(str, false, false);
                }
            }
        }

        public void lambda$onGeolocationPermissionsShowPrompt$0(GeolocationPermissions.Callback callback, String str, Boolean bool) {
            callback.invoke(str, bool.booleanValue(), false);
            if (bool.booleanValue()) {
                BotWebViewContainer.this.hasUserPermissions = true;
            }
        }

        @Override
        public void onGeolocationPermissionsHidePrompt() {
            Dialog dialog = this.lastPermissionsDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.lastPermissionsDialog = null;
            }
        }

        @Override
        public void onPermissionRequest(final PermissionRequest permissionRequest) {
            Dialog dialog = this.lastPermissionsDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.lastPermissionsDialog = null;
            }
            String[] resources = permissionRequest.getResources();
            if (resources.length == 1) {
                final String str = resources[0];
                if (BotWebViewContainer.this.parentActivity == null) {
                    permissionRequest.deny();
                    return;
                }
                str.hashCode();
                if (str.equals("android.webkit.resource.VIDEO_CAPTURE")) {
                    Dialog createWebViewPermissionsRequestDialog = AlertsCreator.createWebViewPermissionsRequestDialog(BotWebViewContainer.this.parentActivity, BotWebViewContainer.this.resourcesProvider, new String[]{"android.permission.CAMERA"}, C1010R.raw.permission_request_camera, LocaleController.formatString(C1010R.string.BotWebViewRequestCameraPermission, UserObject.getUserName(BotWebViewContainer.this.botUser)), LocaleController.formatString(C1010R.string.BotWebViewRequestCameraPermissionWithHint, UserObject.getUserName(BotWebViewContainer.this.botUser)), new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BotWebViewContainer.C17584.this.lambda$onPermissionRequest$5(permissionRequest, str, (Boolean) obj);
                        }
                    });
                    this.lastPermissionsDialog = createWebViewPermissionsRequestDialog;
                    createWebViewPermissionsRequestDialog.show();
                } else if (str.equals("android.webkit.resource.AUDIO_CAPTURE")) {
                    Dialog createWebViewPermissionsRequestDialog2 = AlertsCreator.createWebViewPermissionsRequestDialog(BotWebViewContainer.this.parentActivity, BotWebViewContainer.this.resourcesProvider, new String[]{"android.permission.RECORD_AUDIO"}, C1010R.raw.permission_request_microphone, LocaleController.formatString(C1010R.string.BotWebViewRequestMicrophonePermission, UserObject.getUserName(BotWebViewContainer.this.botUser)), LocaleController.formatString(C1010R.string.BotWebViewRequestMicrophonePermissionWithHint, UserObject.getUserName(BotWebViewContainer.this.botUser)), new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BotWebViewContainer.C17584.this.lambda$onPermissionRequest$3(permissionRequest, str, (Boolean) obj);
                        }
                    });
                    this.lastPermissionsDialog = createWebViewPermissionsRequestDialog2;
                    createWebViewPermissionsRequestDialog2.show();
                }
            }
        }

        public void lambda$onPermissionRequest$3(final PermissionRequest permissionRequest, final String str, Boolean bool) {
            if (this.lastPermissionsDialog != null) {
                this.lastPermissionsDialog = null;
                if (bool.booleanValue()) {
                    BotWebViewContainer.this.runWithPermissions(new String[]{"android.permission.RECORD_AUDIO"}, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BotWebViewContainer.C17584.this.lambda$onPermissionRequest$2(permissionRequest, str, (Boolean) obj);
                        }
                    });
                } else {
                    permissionRequest.deny();
                }
            }
        }

        public void lambda$onPermissionRequest$2(PermissionRequest permissionRequest, String str, Boolean bool) {
            if (bool.booleanValue()) {
                permissionRequest.grant(new String[]{str});
                BotWebViewContainer.this.hasUserPermissions = true;
                return;
            }
            permissionRequest.deny();
        }

        public void lambda$onPermissionRequest$5(final PermissionRequest permissionRequest, final String str, Boolean bool) {
            if (this.lastPermissionsDialog != null) {
                this.lastPermissionsDialog = null;
                if (bool.booleanValue()) {
                    BotWebViewContainer.this.runWithPermissions(new String[]{"android.permission.CAMERA"}, new Consumer() {
                        @Override
                        public final void accept(Object obj) {
                            BotWebViewContainer.C17584.this.lambda$onPermissionRequest$4(permissionRequest, str, (Boolean) obj);
                        }
                    });
                } else {
                    permissionRequest.deny();
                }
            }
        }

        public void lambda$onPermissionRequest$4(PermissionRequest permissionRequest, String str, Boolean bool) {
            if (bool.booleanValue()) {
                permissionRequest.grant(new String[]{str});
                BotWebViewContainer.this.hasUserPermissions = true;
                return;
            }
            permissionRequest.deny();
        }

        @Override
        public void onPermissionRequestCanceled(PermissionRequest permissionRequest) {
            Dialog dialog = this.lastPermissionsDialog;
            if (dialog != null) {
                dialog.dismiss();
                this.lastPermissionsDialog = null;
            }
        }
    }

    public void onOpenUri(Uri uri) {
        onOpenUri(uri, false);
    }

    private void onOpenUri(final Uri uri, boolean z) {
        if (this.isRequestingPageOpen) {
            return;
        }
        if (System.currentTimeMillis() - this.lastClickMs <= 10000 || !z) {
            this.lastClickMs = 0L;
            boolean[] zArr = {false};
            if (!Browser.isInternalUri(uri, zArr) || zArr[0]) {
                if (z) {
                    Browser.openUrl(getContext(), uri, true, false);
                    return;
                }
                this.isRequestingPageOpen = true;
                new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(C1010R.string.OpenUrlTitle)).setMessage(LocaleController.formatString(C1010R.string.OpenUrlAlert2, uri.toString())).setPositiveButton(LocaleController.getString(C1010R.string.Open), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        BotWebViewContainer.this.lambda$onOpenUri$1(uri, dialogInterface, i);
                    }
                }).setNegativeButton(LocaleController.getString(C1010R.string.Cancel), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                    @Override
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BotWebViewContainer.this.lambda$onOpenUri$2(dialogInterface);
                    }
                }).show();
            } else if (this.delegate != null) {
                setDescendantFocusability(393216);
                setFocusable(false);
                this.webView.setFocusable(false);
                this.webView.setDescendantFocusability(393216);
                this.webView.clearFocus();
                ((InputMethodManager) getContext().getSystemService("input_method")).hideSoftInputFromWindow(getWindowToken(), 2);
                this.delegate.onCloseRequested(new Runnable() {
                    @Override
                    public final void run() {
                        BotWebViewContainer.this.lambda$onOpenUri$0(uri);
                    }
                });
            } else {
                Browser.openUrl(getContext(), uri, true, false);
            }
        }
    }

    public void lambda$onOpenUri$0(Uri uri) {
        Browser.openUrl(getContext(), uri, true, false);
    }

    public void lambda$onOpenUri$1(Uri uri, DialogInterface dialogInterface, int i) {
        Browser.openUrl(getContext(), uri, true, false);
    }

    public void lambda$onOpenUri$2(DialogInterface dialogInterface) {
        this.isRequestingPageOpen = false;
    }

    public static int getMainButtonRippleColor(int i) {
        return ColorUtils.calculateLuminance(i) >= 0.30000001192092896d ? 301989888 : 385875967;
    }

    public static Drawable getMainButtonRippleDrawable(int i) {
        return Theme.createSelectorWithBackgroundDrawable(i, getMainButtonRippleColor(i));
    }

    public void updateFlickerBackgroundColor(int i) {
        this.flickerDrawable.setColors(i, 153, 204);
    }

    public boolean onBackPressed() {
        if (this.webView != null && this.isBackButtonVisible) {
            notifyEvent("back_button_pressed", null);
            return true;
        }
        return false;
    }

    public void setPageLoaded(String str) {
        if (this.isPageLoaded) {
            return;
        }
        try {
            InputStream open = getResources().getAssets().open("bot_clipboard_wrapper.js");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
                sb.append("\n");
            }
            open.close();
            evaluateJs(sb.toString());
        } catch (IOException e) {
            FileLog.m31e(e);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.webView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.flickerView, View.ALPHA, 0.0f));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                BotWebViewContainer.this.flickerView.setVisibility(8);
            }
        });
        animatorSet.start();
        this.mUrl = str;
        this.isPageLoaded = true;
        setFocusable(true);
        this.delegate.onWebAppReady();
    }

    public boolean hasUserPermissions() {
        return this.hasUserPermissions;
    }

    public void setBotUser(TLRPC$User tLRPC$User) {
        this.botUser = tLRPC$User;
    }

    public void runWithPermissions(final String[] strArr, final Consumer<Boolean> consumer) {
        if (Build.VERSION.SDK_INT < 23) {
            consumer.accept(Boolean.TRUE);
        } else if (checkPermissions(strArr)) {
            consumer.accept(Boolean.TRUE);
        } else {
            this.onPermissionsRequestResultCallback = new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.this.lambda$runWithPermissions$3(consumer, strArr);
                }
            };
            Activity activity = this.parentActivity;
            if (activity != null) {
                activity.requestPermissions(strArr, 4000);
            }
        }
    }

    public void lambda$runWithPermissions$3(Consumer consumer, String[] strArr) {
        consumer.accept(Boolean.valueOf(checkPermissions(strArr)));
    }

    public boolean isPageLoaded() {
        return this.isPageLoaded;
    }

    public void setParentActivity(Activity activity) {
        this.parentActivity = activity;
    }

    private boolean checkPermissions(String[] strArr) {
        for (String str : strArr) {
            if (getContext().checkSelfPermission(str) != 0) {
                return false;
            }
        }
        return true;
    }

    public void restoreButtonData() {
        String str = this.buttonData;
        if (str != null) {
            onEventReceived("web_app_setup_main_button", str);
        }
    }

    public void onInvoiceStatusUpdate(String str, String str2) {
        onInvoiceStatusUpdate(str, str2, false);
    }

    public void onInvoiceStatusUpdate(String str, String str2, boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("slug", str);
            jSONObject.put("status", str2);
            notifyEvent("invoice_closed", jSONObject);
            if (z || !Objects.equals(this.currentPaymentSlug, str)) {
                return;
            }
            this.currentPaymentSlug = null;
        } catch (JSONException e) {
            FileLog.m31e(e);
        }
    }

    public void onSettingsButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("settings_button_pressed", null);
    }

    public void onMainButtonPressed() {
        this.lastClickMs = System.currentTimeMillis();
        notifyEvent("main_button_pressed", null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Runnable runnable;
        if (i != 4000 || (runnable = this.onPermissionsRequestResultCallback) == null) {
            return;
        }
        runnable.run();
        this.onPermissionsRequestResultCallback = null;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 3000 || this.mFilePathCallback == null) {
            return;
        }
        this.mFilePathCallback.onReceiveValue((i2 != -1 || intent == null || intent.getDataString() == null) ? null : new Uri[]{Uri.parse(intent.getDataString())});
        this.mFilePathCallback = null;
    }

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.isViewPortByMeasureSuppressed) {
            return;
        }
        invalidateViewPortHeight(true);
    }

    public void invalidateViewPortHeight() {
        invalidateViewPortHeight(false);
    }

    public void invalidateViewPortHeight(boolean z) {
        invalidateViewPortHeight(z, false);
    }

    public void invalidateViewPortHeight(boolean z, boolean z2) {
        invalidate();
        if ((this.isPageLoaded || z2) && (getParent() instanceof ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer)) {
            ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer webViewSwipeContainer = (ChatAttachAlertBotWebViewLayout.WebViewSwipeContainer) getParent();
            if (z) {
                this.lastExpanded = webViewSwipeContainer.getSwipeOffsetY() == (-webViewSwipeContainer.getOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY();
            }
            int measuredHeight = (int) (((webViewSwipeContainer.getMeasuredHeight() - webViewSwipeContainer.getOffsetY()) - webViewSwipeContainer.getSwipeOffsetY()) + webViewSwipeContainer.getTopActionBarOffsetY());
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("height", measuredHeight / AndroidUtilities.density);
                jSONObject.put("is_state_stable", z);
                jSONObject.put("is_expanded", this.lastExpanded);
                notifyEvent("viewport_changed", jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.flickerView) {
            if (this.isFlickeringCenter) {
                canvas.save();
                canvas.translate(0.0f, (C1069ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            }
            boolean drawChild = super.drawChild(canvas, view, j);
            if (this.isFlickeringCenter) {
                canvas.restore();
            }
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            this.flickerDrawable.draw(canvas, rectF, 0.0f, this);
            invalidate();
            return drawChild;
        } else if (view == this.webViewNotAvailableText) {
            canvas.save();
            canvas.translate(0.0f, (C1069ActionBar.getCurrentActionBarHeight() - ((View) getParent()).getTranslationY()) / 2.0f);
            boolean drawChild2 = super.drawChild(canvas, view, j);
            canvas.restore();
            return drawChild2;
        } else {
            return super.drawChild(canvas, view, j);
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.flickerDrawable.setParentWidth(getMeasuredWidth());
    }

    public void setWebViewProgressListener(Consumer<Float> consumer) {
        this.webViewProgressListener = consumer;
    }

    public WebView getWebView() {
        return this.webView;
    }

    public void loadFlickerAndSettingsItem(int i, long j, final ActionBarMenuSubItem actionBarMenuSubItem) {
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot;
        boolean z;
        String publicUsername = UserObject.getPublicUsername(MessagesController.getInstance(i).getUser(Long.valueOf(j)));
        if (publicUsername != null && publicUsername.equals("DurgerKingBot")) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            this.flickerView.setImageDrawable(SvgHelper.getDrawable(C1010R.raw.durgerking_placeholder, getColor("windowBackgroundGray")));
            setupFlickerParams(false);
            return;
        }
        Iterator<TLRPC$TL_attachMenuBot> it = MediaDataController.getInstance(i).getAttachMenuBots().bots.iterator();
        while (true) {
            if (!it.hasNext()) {
                tLRPC$TL_attachMenuBot = null;
                break;
            }
            tLRPC$TL_attachMenuBot = it.next();
            if (tLRPC$TL_attachMenuBot.bot_id == j) {
                break;
            }
        }
        if (tLRPC$TL_attachMenuBot != null) {
            TLRPC$TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            if (placeholderStaticAttachMenuBotIcon == null) {
                placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
                z = true;
            } else {
                z = false;
            }
            if (placeholderStaticAttachMenuBotIcon != null) {
                this.flickerView.setVisibility(0);
                this.flickerView.setAlpha(1.0f);
                this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tLRPC$TL_attachMenuBot);
                setupFlickerParams(z);
            }
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(tLRPC$TL_attachMenuBot.has_settings ? 0 : 8);
                return;
            }
            return;
        }
        TLRPC$TL_messages_getAttachMenuBot tLRPC$TL_messages_getAttachMenuBot = new TLRPC$TL_messages_getAttachMenuBot();
        tLRPC$TL_messages_getAttachMenuBot.bot = MessagesController.getInstance(i).getInputUser(j);
        ConnectionsManager.getInstance(i).sendRequest(tLRPC$TL_messages_getAttachMenuBot, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                BotWebViewContainer.this.lambda$loadFlickerAndSettingsItem$5(actionBarMenuSubItem, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$loadFlickerAndSettingsItem$5(final ActionBarMenuSubItem actionBarMenuSubItem, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$loadFlickerAndSettingsItem$4(tLObject, actionBarMenuSubItem);
            }
        });
    }

    public void lambda$loadFlickerAndSettingsItem$4(TLObject tLObject, ActionBarMenuSubItem actionBarMenuSubItem) {
        boolean z;
        if (!(tLObject instanceof TLRPC$TL_attachMenuBotsBot)) {
            if (actionBarMenuSubItem != null) {
                actionBarMenuSubItem.setVisibility(8);
                return;
            }
            return;
        }
        TLRPC$TL_attachMenuBot tLRPC$TL_attachMenuBot = ((TLRPC$TL_attachMenuBotsBot) tLObject).bot;
        TLRPC$TL_attachMenuBotIcon placeholderStaticAttachMenuBotIcon = MediaDataController.getPlaceholderStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
        if (placeholderStaticAttachMenuBotIcon == null) {
            placeholderStaticAttachMenuBotIcon = MediaDataController.getStaticAttachMenuBotIcon(tLRPC$TL_attachMenuBot);
            z = true;
        } else {
            z = false;
        }
        if (placeholderStaticAttachMenuBotIcon != null) {
            this.flickerView.setVisibility(0);
            this.flickerView.setAlpha(1.0f);
            this.flickerView.setImage(ImageLocation.getForDocument(placeholderStaticAttachMenuBotIcon.icon), (String) null, (Drawable) null, tLRPC$TL_attachMenuBot);
            setupFlickerParams(z);
        }
        if (actionBarMenuSubItem != null) {
            actionBarMenuSubItem.setVisibility(tLRPC$TL_attachMenuBot.has_settings ? 0 : 8);
        }
    }

    private void setupFlickerParams(boolean z) {
        this.isFlickeringCenter = z;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.flickerView.getLayoutParams();
        layoutParams.gravity = z ? 17 : 48;
        if (z) {
            int m35dp = AndroidUtilities.m35dp(64.0f);
            layoutParams.height = m35dp;
            layoutParams.width = m35dp;
        } else {
            layoutParams.width = -1;
            layoutParams.height = -2;
        }
        this.flickerView.requestLayout();
    }

    public void reload() {
        checkCreateWebView();
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        WebView webView = this.webView;
        if (webView != null) {
            webView.reload();
        }
    }

    public void loadUrl(int i, String str) {
        checkCreateWebView();
        this.currentAccount = i;
        this.isPageLoaded = false;
        this.lastClickMs = 0L;
        this.hasUserPermissions = false;
        this.mUrl = str;
        WebView webView = this.webView;
        if (webView != null) {
            webView.loadUrl(str);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.onRequestPermissionResultReceived);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didSetNewTheme);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onRequestPermissionResultReceived);
    }

    public void destroyWebView() {
        WebView webView = this.webView;
        if (webView != null) {
            if (webView.getParent() != null) {
                removeView(this.webView);
            }
            this.webView.destroy();
            this.isPageLoaded = false;
        }
    }

    public boolean isBackButtonVisible() {
        return this.isBackButtonVisible;
    }

    public void evaluateJs(String str) {
        evaluateJs(str, true);
    }

    public void evaluateJs(String str, boolean z) {
        if (z) {
            checkCreateWebView();
        }
        WebView webView = this.webView;
        if (webView == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            webView.evaluateJavascript(str, BotWebViewContainer$$ExternalSyntheticLambda6.INSTANCE);
            return;
        }
        try {
            webView.loadUrl("javascript:" + URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            WebView webView2 = this.webView;
            webView2.loadUrl("javascript:" + URLEncoder.encode(str));
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didSetNewTheme) {
            WebView webView = this.webView;
            if (webView != null) {
                webView.setBackgroundColor(getColor("windowBackgroundWhite"));
            }
            this.flickerView.setColorFilter(new PorterDuffColorFilter(getColor("dialogSearchHint"), PorterDuff.Mode.SRC_IN));
            notifyThemeChanged();
        } else if (i == NotificationCenter.onActivityResultReceived) {
            onActivityResult(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), (Intent) objArr[2]);
        } else if (i == NotificationCenter.onRequestPermissionResultReceived) {
            onRequestPermissionsResult(((Integer) objArr[0]).intValue(), (String[]) objArr[1], (int[]) objArr[2]);
        }
    }

    private void notifyThemeChanged() {
        notifyEvent("theme_changed", buildThemeParams());
    }

    private void notifyEvent(String str, JSONObject jSONObject) {
        evaluateJs("window.Telegram.WebView.receiveEvent('" + str + "', " + jSONObject + ");", false);
    }

    public void setWebViewScrollListener(WebViewScrollListener webViewScrollListener) {
        this.webViewScrollListener = webViewScrollListener;
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public void onEventReceived(java.lang.String r20, java.lang.String r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BotWebViewContainer.onEventReceived(java.lang.String, java.lang.String):void");
    }

    public void lambda$onEventReceived$9(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.f1030id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$onEventReceived$10(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.f1030id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$onEventReceived$11(PopupButton popupButton, AtomicBoolean atomicBoolean, DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
        try {
            notifyEvent("popup_closed", new JSONObject().put("button_id", popupButton.f1030id));
            atomicBoolean.set(true);
        } catch (JSONException e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$onEventReceived$12(AtomicBoolean atomicBoolean, DialogInterface dialogInterface) {
        if (!atomicBoolean.get()) {
            notifyEvent("popup_closed", new JSONObject());
        }
        this.currentDialog = null;
        this.lastDialogClosed = System.currentTimeMillis();
    }

    public void lambda$onEventReceived$14(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                BotWebViewContainer.this.lambda$onEventReceived$13(tLRPC$TL_error, str, tLObject);
            }
        });
    }

    public void lambda$onEventReceived$13(TLRPC$TL_error tLRPC$TL_error, String str, TLObject tLObject) {
        if (tLRPC$TL_error != null) {
            onInvoiceStatusUpdate(str, "failed");
        } else {
            this.delegate.onWebAppOpenInvoice(str, tLObject);
        }
    }

    private JSONObject buildThemeParams() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("bg_color", formatColor("windowBackgroundWhite"));
            jSONObject.put("secondary_bg_color", formatColor("windowBackgroundGray"));
            jSONObject.put("text_color", formatColor("windowBackgroundWhiteBlackText"));
            jSONObject.put("hint_color", formatColor("windowBackgroundWhiteHintText"));
            jSONObject.put("link_color", formatColor("windowBackgroundWhiteLinkText"));
            jSONObject.put("button_color", formatColor("featuredStickers_addButton"));
            jSONObject.put("button_text_color", formatColor("featuredStickers_buttonText"));
            return new JSONObject().put("theme_params", jSONObject);
        } catch (Exception e) {
            FileLog.m31e(e);
            return new JSONObject();
        }
    }

    private int getColor(String str) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer valueOf = Integer.valueOf(resourcesProvider != null ? resourcesProvider.getColor(str).intValue() : Theme.getColor(str));
        if (valueOf == null) {
            valueOf = Integer.valueOf(Theme.getColor(str));
        }
        return valueOf.intValue();
    }

    private String formatColor(String str) {
        int color = getColor(str);
        return "#" + hexFixed(Color.red(color)) + hexFixed(Color.green(color)) + hexFixed(Color.blue(color));
    }

    private String hexFixed(int i) {
        String hexString = Integer.toHexString(i);
        if (hexString.length() < 2) {
            return "0" + hexString;
        }
        return hexString;
    }

    public class WebViewProxy {
        private WebViewProxy() {
        }

        public void lambda$postEvent$0(String str, String str2) {
            BotWebViewContainer.this.onEventReceived(str, str2);
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    BotWebViewContainer.WebViewProxy.this.lambda$postEvent$0(str, str2);
                }
            });
        }

        @JavascriptInterface
        public String getClipboardText() {
            CharSequence text = ((ClipboardManager) BotWebViewContainer.this.getContext().getSystemService("clipboard")).getText();
            if (text != null) {
                return text.toString();
            }
            return null;
        }
    }

    public static final class PopupButton {
        public String f1030id;
        public String text;
        public String textColorKey;

        public PopupButton(org.json.JSONObject r8) throws org.json.JSONException {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.Components.BotWebViewContainer.PopupButton.<init>(org.json.JSONObject):void");
        }
    }
}
