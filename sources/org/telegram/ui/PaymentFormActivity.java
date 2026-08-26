package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.android.billingclient.api.zzct;
import com.android.billingclient.api.zzcu;
import com.google.android.exoplayer2.text.ExoplayerCuesDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.dynamite.zzn;
import com.google.android.gms.internal.mlkit_language_id_common.zzjt;
import com.google.android.gms.internal.mlkit_vision_common.zzjx;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.zzk;
import com.stripe.android.TokenCallback;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import com.stripe.android.model.Card;
import com.stripe.android.model.Token;
import com.stripe.android.net.TokenParser;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController$$ExternalSyntheticOutline1;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.EditTextSettingsCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.PaymentInfoCell;
import org.telegram.ui.Cells.RadioCell;
import org.telegram.ui.Cells.RecurrentPaymentsAcceptCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextDetailSettingsCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextPriceCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.HintEditText;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Stars.StarsIntroActivity;

public class PaymentFormActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private static final int FIELDS_COUNT_ADDRESS = 10;
    private static final int FIELDS_COUNT_CARD = 6;
    private static final int FIELDS_COUNT_PASSWORD = 3;
    private static final int FIELDS_COUNT_SAVEDCARD = 2;
    private static final int FIELD_CARD = 0;
    private static final int FIELD_CARDNAME = 2;
    private static final int FIELD_CARD_COUNTRY = 4;
    private static final int FIELD_CARD_POSTCODE = 5;
    private static final int FIELD_CITY = 2;
    private static final int FIELD_COUNTRY = 4;
    private static final int FIELD_CVV = 3;
    private static final int FIELD_EMAIL = 7;
    private static final int FIELD_ENTERPASSWORD = 0;
    private static final int FIELD_ENTERPASSWORDEMAIL = 2;
    private static final int FIELD_EXPIRE_DATE = 1;
    private static final int FIELD_NAME = 6;
    private static final int FIELD_PHONE = 9;
    private static final int FIELD_PHONECODE = 8;
    private static final int FIELD_POSTCODE = 5;
    private static final int FIELD_REENTERPASSWORD = 1;
    private static final int FIELD_SAVEDCARD = 0;
    private static final int FIELD_SAVEDPASSWORD = 1;
    private static final int FIELD_STATE = 3;
    private static final int FIELD_STREET1 = 0;
    private static final int FIELD_STREET2 = 1;
    private static final int LOAD_PAYMENT_DATA_REQUEST_CODE = 991;
    private static final int STEP_CHECKOUT = 4;
    private static final int STEP_CONFIRM_PASSWORD = 3;
    private static final int STEP_PAYMENT_INFO = 2;
    private static final int STEP_RECEIPT = 5;
    private static final int STEP_SET_PASSWORD_EMAIL = 6;
    private static final int STEP_SHIPPING_INFORMATION = 0;
    private static final int STEP_SHIPPING_METHODS = 1;
    private static final int done_button = 1;
    private boolean allowUnregistered;
    private TLRPC.User botUser;
    private TextInfoPrivacyCell[] bottomCell;
    private BottomFrameLayout bottomLayout;
    private boolean canceled;
    private String cardName;
    private TextCheckCell checkCell1;
    private EditTextSettingsCell codeFieldCell;
    private HashMap<String, String> codesMap;
    private ArrayList<String> countriesArray;
    private HashMap<String, String> countriesMap;
    private CountrySelectActivity.Country country;
    private String countryName;
    private String currentBotName;
    private String currentItemName;
    private TL_account.Password currentPassword;
    private int currentStep;
    private Utilities.Callback<TLRPC.payments_PaymentResult> customAnyResultReceiver;
    private Utilities.CallbackReturn<TLRPC.TL_error, Boolean> customErrorReceiver;
    private Utilities.Callback<TLRPC.TL_payments_paymentResult> customResultReceiver;
    private PaymentFormActivityDelegate delegate;
    private TextDetailSettingsCell[] detailSettingsCell;
    private ArrayList<View> dividers;
    private ActionBarMenuItem doneItem;
    private AnimatorSet doneItemAnimation;
    private boolean donePressed;
    private int emailCodeLength;
    private FrameLayout googlePayButton;
    private FrameLayout googlePayContainer;
    private String googlePayCountryCode;
    private TLRPC.TL_inputPaymentCredentialsGooglePay googlePayCredentials;
    private JSONObject googlePayParameters;
    private String googlePayPublicKey;
    private HeaderCell[] headerCell;
    private boolean ignoreOnCardChange;
    private boolean ignoreOnPhoneChange;
    private boolean ignoreOnTextChange;
    private boolean initGooglePay;
    private EditTextBoldCursor[] inputFields;
    private TLRPC.InputInvoice invoiceInput;
    private String invoiceSlug;
    private InvoiceStatus invoiceStatus;
    private boolean isCheckoutPreview;
    private boolean isWebView;
    private LinearLayout linearLayout2;
    private boolean loadingPasswordInfo;
    private MessageObject messageObject;
    private boolean needPayAfterTransition;
    private boolean need_card_country;
    private boolean need_card_name;
    private boolean need_card_postcode;
    private String overrideSmartGlocalConnectionUrl;
    private BaseFragment parentFragment;
    private PaymentFormActivity passwordFragment;
    private boolean passwordOk;
    private TextView payTextView;
    private TLRPC.PaymentForm paymentForm;
    private PaymentFormCallback paymentFormCallback;
    private TLRPC.TL_paymentFormMethod paymentFormMethod;
    private PaymentInfoCell paymentInfoCell;
    private String paymentJson;
    private TLRPC.PaymentReceipt paymentReceipt;
    private boolean paymentStatusSent;
    private PaymentsClient paymentsClient;
    private HashMap<String, String> phoneFormatMap;
    private ArrayList<TLRPC.TL_labeledPrice> prices;
    private ContextProgressView progressView;
    private ContextProgressView progressViewButton;
    private String providerApiKey;
    private RadioCell[] radioCells;
    private RecurrentPaymentsAcceptCell recurrentAcceptCell;
    private boolean recurrentAccepted;
    private TLRPC.TL_payments_validatedRequestedInfo requestedInfo;
    private Theme.ResourcesProvider resourcesProvider;
    private boolean saveCardInfo;
    private boolean saveShippingInfo;
    private TLRPC.TL_paymentSavedCredentialsCard savedCredentialsCard;
    private ScrollView scrollView;
    private ShadowSectionCell[] sectionCell;
    private TextSettingsCell[] settingsCell;
    private float shiftDp;
    private TLRPC.TL_shippingOption shippingOption;
    private Runnable shortPollRunnable;
    private boolean shouldNavigateBack;
    private boolean swipeBackEnabled;
    private TextView textView;
    private Long tipAmount;
    private LinearLayout tipLayout;
    private TextPriceCell totalCell;
    private String[] totalPrice;
    private String totalPriceDecimal;
    private TLRPC.TL_payments_validateRequestedInfo validateRequest;
    private boolean waitingForEmail;
    private WebView webView;
    private String webViewUrl;
    private boolean webviewLoading;
    private static final List<String> WEBVIEW_PROTOCOLS = Arrays.asList("http", "https");
    private static final List<String> BLACKLISTED_PROTOCOLS = Collections.singletonList("tg");

    public class AnonymousClass19 extends WebViewClient {
        final Context val$context;

        public AnonymousClass19(Context context) {
            this.val$context = context;
        }

        public void lambda$onRenderProcessGone$0() {
            Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
        }

        @Override
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), 0, PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new PhotoViewer$$ExternalSyntheticLambda60(this, 14))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                Uri uri = Uri.parse(str);
                if ("t.me".equals(uri.getHost())) {
                    PaymentFormActivity.this.goToNextStep();
                    return true;
                }
                if (PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(uri.getScheme())) {
                    return true;
                }
                if (!PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(uri.getScheme())) {
                    try {
                        if (PaymentFormActivity.this.getContext() instanceof Activity) {
                            ((Activity) PaymentFormActivity.this.getContext()).startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                        }
                    } catch (ActivityNotFoundException unused) {
                        new AlertDialog.Builder(this.val$context, 0, null).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    }
                    return true;
                }
                return false;
            } catch (Exception unused2) {
            }
        }
    }

    public class AnonymousClass26 implements TokenCallback {
        public AnonymousClass26() {
        }

        public void lambda$onSuccess$0() {
            PaymentFormActivity.this.goToNextStep();
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.setDonePressed(false);
        }

        @Override
        public void onError(Exception exc) {
            if (PaymentFormActivity.this.canceled) {
                return;
            }
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.setDonePressed(false);
            if ((exc instanceof APIConnectionException) || (exc instanceof APIException)) {
                AlertsCreator.showSimpleToast(PaymentFormActivity.this, LocaleController.getString(R.string.PaymentConnectionFailed));
            } else {
                AlertsCreator.showSimpleToast(PaymentFormActivity.this, exc.getMessage());
            }
        }

        @Override
        public void onSuccess(Token token) {
            if (PaymentFormActivity.this.canceled) {
                return;
            }
            PaymentFormActivity.this.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", token.mType, token.mId);
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 15));
        }
    }

    public class AnonymousClass6 extends WebViewClient {
        final Context val$context;

        public AnonymousClass6(Context context) {
            this.val$context = context;
        }

        public void lambda$onRenderProcessGone$0() {
            Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
        }

        @Override
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), 0, PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new PhotoViewer$$ExternalSyntheticLambda60(this, 16))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.shouldNavigateBack = !str.equals(paymentFormActivity.webViewUrl);
            try {
                Uri uri = Uri.parse(str);
                if ("t.me".equals(uri.getHost())) {
                    PaymentFormActivity.this.goToNextStep();
                    return true;
                }
                if (PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(uri.getScheme())) {
                    return true;
                }
                if (!PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(uri.getScheme())) {
                    try {
                        if (PaymentFormActivity.this.getContext() instanceof Activity) {
                            ((Activity) PaymentFormActivity.this.getContext()).startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                        }
                    } catch (ActivityNotFoundException unused) {
                        new AlertDialog.Builder(this.val$context, 0, null).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    }
                    return true;
                }
            } catch (Exception unused2) {
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    public class BottomFrameLayout extends FrameLayout {
        Paint paint;
        float progress;
        SpringAnimation springAnimation;

        public BottomFrameLayout(Context context, TLRPC.PaymentForm paymentForm) {
            super(context);
            this.paint = new Paint(1);
            setWillNotDraw(false);
        }

        public void lambda$setChecked$0(DynamicAnimation dynamicAnimation, float f, float f2) {
            this.progress = f / 100.0f;
            if (PaymentFormActivity.this.payTextView != null) {
                PaymentFormActivity.this.payTextView.setAlpha((this.progress * 0.2f) + 0.8f);
            }
            invalidate();
        }

        public void lambda$setChecked$1(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == this.springAnimation) {
                this.springAnimation = null;
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            canvas.drawColor(PaymentFormActivity.this.getThemedColor(Theme.key_switchTrackBlue));
            this.paint.setColor(PaymentFormActivity.this.getThemedColor(Theme.key_contacts_inviteBackground));
            canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.progress, this.paint);
        }

        public void setChecked(boolean z, boolean z2) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            float f = z ? 1.0f : 0.0f;
            if (!z2) {
                this.progress = f;
                if (PaymentFormActivity.this.payTextView != null) {
                    PaymentFormActivity.this.payTextView.setAlpha((this.progress * 0.2f) + 0.8f);
                }
                invalidate();
                return;
            }
            float f2 = this.progress;
            if (f2 == f) {
                return;
            }
            SpringAnimation springAnimation2 = new SpringAnimation(new FloatValueHolder(f2 * 100.0f));
            SpringForce springForce = new SpringForce(f * 100.0f);
            springForce.setStiffness(z ? 500.0f : 650.0f);
            springForce.setDampingRatio(1.0f);
            springAnimation2.mSpring = springForce;
            this.springAnimation = springAnimation2;
            springAnimation2.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 1));
            this.springAnimation.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda18(this, 1));
            this.springAnimation.start();
        }
    }

    public enum InvoiceStatus {
        PAID,
        CANCELLED,
        PENDING,
        FAILED
    }

    public class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public void onClick(View view) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.presentFragment(new TwoStepVerificationSetupActivity(6, paymentFormActivity.currentPassword));
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public interface PaymentFormCallback {
        void onInvoiceStatusChanged(InvoiceStatus invoiceStatus);
    }

    public class TelegramWebviewProxy {
        private TelegramWebviewProxy() {
        }

        public void lambda$postEvent$0(String str, String str2) {
            if (PaymentFormActivity.this.getParentActivity() != null && str.equals("payment_form_submit")) {
                try {
                    JSONObject jSONObject = new JSONObject(str2);
                    JSONObject jSONObject2 = jSONObject.getJSONObject("credentials");
                    PaymentFormActivity.this.paymentJson = jSONObject2.toString();
                    PaymentFormActivity.this.cardName = jSONObject.getString("title");
                } catch (Throwable th) {
                    PaymentFormActivity.this.paymentJson = str2;
                    FileLog.e(th);
                }
                PaymentFormActivity.this.goToNextStep();
            }
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, str, str2, 17));
        }
    }

    private PaymentFormActivity(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment, boolean z2) {
        super(null);
        this.countriesArray = new ArrayList<>();
        this.countriesMap = new HashMap<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList<>();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        init(inputInvoice, paymentForm, messageObject, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, baseFragment, z2);
    }

    public void checkPassword() {
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            UserConfig.getInstance(this.currentAccount).tmpPassword = null;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
        }
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
            sendData();
            return;
        }
        if (this.inputFields[1].length() == 0) {
            try {
                this.inputFields[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(this.inputFields[1], 2.5f);
            return;
        }
        String string = this.inputFields[1].getText().toString();
        showEditDoneProgress(true, true);
        setDonePressed(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new ProfileActivity$$ExternalSyntheticLambda2(this, string, getpassword, 4), (this.allowUnregistered ? 8 : 0) | 2);
    }

    private void createGooglePayButton(Context context) {
        FrameLayout frameLayout = new FrameLayout(context);
        this.googlePayContainer = frameLayout;
        frameLayout.setBackgroundDrawable(Theme.getSelectorDrawable(true));
        this.googlePayContainer.setVisibility(8);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.googlePayButton = frameLayout2;
        frameLayout2.setClickable(true);
        this.googlePayButton.setFocusable(true);
        this.googlePayButton.setBackgroundResource(R.drawable.googlepay_button_no_shadow_background);
        if (this.googlePayPublicKey == null) {
            this.googlePayButton.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f));
        } else {
            this.googlePayButton.setPadding(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f));
        }
        this.googlePayContainer.addView(this.googlePayButton, LayoutHelper.createFrame(-1, 48.0f));
        this.googlePayButton.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 14));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.googlePayButton.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, LayoutHelper.createLinear(-1, 0, 1.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.googlePayButton.addView(imageView2, LayoutHelper.createFrame(-1, -1.0f));
    }

    private JSONObject getBaseCardPaymentMethod() throws JSONException {
        List listAsList = Arrays.asList("AMEX", "DISCOVER", "JCB", "MASTERCARD", "VISA");
        List listAsList2 = Arrays.asList("PAN_ONLY", "CRYPTOGRAM_3DS");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", "CARD");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("allowedAuthMethods", new JSONArray((Collection) listAsList2));
        jSONObject2.put("allowedCardNetworks", new JSONArray((Collection) listAsList));
        jSONObject.put("parameters", jSONObject2);
        return jSONObject;
    }

    private JSONObject getBaseRequest() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
    }

    public static String getResponseBody(InputStream inputStream) throws IOException {
        String next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
        inputStream.close();
        return next;
    }

    private long getStars() {
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            return ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsTopup) {
            return ((TLRPC.TL_inputStorePaymentStarsTopup) inputStorePaymentPurpose).stars;
        }
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) {
            return ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).stars;
        }
        return 0L;
    }

    private long getStarsGiftUserId() {
        TLRPC.InputPeer inputPeer;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (!(inputInvoice instanceof TLRPC.TL_inputInvoiceStars)) {
            return 0L;
        }
        TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose = ((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose;
        if (inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGift) {
            TLRPC.InputUser inputUser = ((TLRPC.TL_inputStorePaymentStarsGift) inputStorePaymentPurpose).user_id;
            if (inputUser != null) {
                return inputUser.user_id;
            }
            return 0L;
        }
        if (!(inputStorePaymentPurpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway) || (inputPeer = ((TLRPC.TL_inputStorePaymentStarsGiveaway) inputStorePaymentPurpose).boost_peer) == null) {
            return 0L;
        }
        return DialogObject.getPeerDialogId(inputPeer);
    }

    private String getTotalPriceDecimalString(ArrayList<TLRPC.TL_labeledPrice> arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += arrayList.get(i).amount;
        }
        return LocaleController.getInstance().formatCurrencyDecimalString(j, this.paymentForm.invoice.currency, false);
    }

    private String getTotalPriceString(ArrayList<TLRPC.TL_labeledPrice> arrayList) {
        long jLongValue = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            jLongValue += arrayList.get(i).amount;
        }
        Long l = this.tipAmount;
        if (l != null) {
            jLongValue += l.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(jLongValue, this.paymentForm.invoice.currency);
    }

    public void goToNextStep() {
        int i;
        int i2;
        boolean z;
        int i3 = this.currentStep;
        if (i3 == 0) {
            PaymentFormActivityDelegate paymentFormActivityDelegate = this.delegate;
            if (paymentFormActivityDelegate != null) {
                paymentFormActivityDelegate.didSelectNewAddress(this.validateRequest);
                finishFragment();
                return;
            }
            if (this.paymentForm.invoice.flexible) {
                i = 1;
            } else if (this.savedCredentialsCard == null && this.paymentJson == null) {
                i = 2;
            } else {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                i = UserConfig.getInstance(this.currentAccount).tmpPassword != null ? 4 : 3;
            }
            if (i == 2 && this.savedCredentialsCard == null && this.paymentJson == null && !this.paymentForm.additional_methods.isEmpty()) {
                showChoosePaymentMethod(new PaymentFormActivity$$ExternalSyntheticLambda19(this, 2));
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i, this.requestedInfo, null, null, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), this.isWebView);
                return;
            }
        }
        if (i3 == 1) {
            if (this.paymentJson != null || this.cardName != null) {
                i2 = 4;
            } else if (this.savedCredentialsCard != null) {
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && UserConfig.getInstance(this.currentAccount).tmpPassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
                    UserConfig.getInstance(this.currentAccount).tmpPassword = null;
                    UserConfig.getInstance(this.currentAccount).saveConfig(false);
                }
                if (UserConfig.getInstance(this.currentAccount).tmpPassword != null) {
                    i2 = 4;
                } else {
                    i2 = 3;
                }
            } else {
                i2 = 2;
            }
            if (i2 == 2 && this.cardName == null && this.savedCredentialsCard == null && this.paymentJson == null && !this.paymentForm.additional_methods.isEmpty()) {
                showChoosePaymentMethod(new PaymentFormActivity$$ExternalSyntheticLambda19(this, 2));
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), this.isWebView);
                return;
            }
        }
        if (i3 == 2) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if (!paymentForm.password_missing || !(z = this.saveCardInfo)) {
                PaymentFormActivityDelegate paymentFormActivityDelegate2 = this.delegate;
                if (paymentFormActivityDelegate2 == null) {
                    presentFragment(new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), this.isWebView);
                    return;
                } else {
                    paymentFormActivityDelegate2.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, null);
                    finishFragment();
                    return;
                }
            }
            PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 6, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, z, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
            this.passwordFragment = paymentFormActivity;
            paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
            this.passwordFragment.setCustomAnyResultReceiver(this.customAnyResultReceiver);
            this.passwordFragment.setCurrentPassword(this.currentPassword);
            this.passwordFragment.setDelegate(new PaymentFormActivityDelegate() {
                @Override
                public void currentPasswordUpdated(TL_account.Password password) {
                    PaymentFormActivity.this.currentPassword = password;
                }

                @Override
                public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                    PaymentFormActivityDelegate.CC.$default$didSelectNewAddress(this, tL_payments_validateRequestedInfo);
                }

                @Override
                public boolean didSelectNewCard(String str, String str2, boolean z2, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                    if (PaymentFormActivity.this.delegate != null) {
                        PaymentFormActivity.this.delegate.didSelectNewCard(str, str2, z2, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
                    }
                    if (PaymentFormActivity.this.isWebView) {
                        PaymentFormActivity.this.removeSelfFromStack();
                    }
                    return PaymentFormActivity.this.delegate != null;
                }

                @Override
                public void onFragmentDestroyed() {
                    PaymentFormActivity.this.passwordFragment = null;
                }
            });
            presentFragment(this.passwordFragment, this.isWebView);
            return;
        }
        if (i3 == 3) {
            presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, this.passwordOk ? 4 : 2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), true);
            return;
        }
        if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            if (this.delegate.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, this.savedCredentialsCard)) {
                finishFragment();
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, false).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), true);
                return;
            }
        }
        if (this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback != null) {
            AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda19(this, 1), 500L);
        } else {
            if (onCheckoutSuccess(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
        }
    }

    private void init(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment, boolean z2) {
        if (baseFragment != null) {
            this.currentAccount = baseFragment.getCurrentAccount();
        }
        this.currentStep = i;
        this.parentFragment = baseFragment;
        this.paymentJson = str2;
        this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
        this.requestedInfo = tL_payments_validatedRequestedInfo;
        this.paymentForm = paymentForm;
        this.shippingOption = tL_shippingOption;
        this.tipAmount = l;
        this.messageObject = messageObject;
        this.invoiceSlug = str;
        this.invoiceInput = inputInvoice;
        this.saveCardInfo = z;
        this.allowUnregistered = z2;
        this.isWebView = ("stripe".equals(paymentForm.native_provider) || "smartglocal".equals(this.paymentForm.native_provider)) ? false : true;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentForm.bot_id));
        this.botUser = user;
        if (user != null) {
            this.currentBotName = user.first_name;
        } else {
            this.currentBotName = "";
        }
        this.currentItemName = paymentForm.title;
        this.validateRequest = tL_payments_validateRequestedInfo;
        this.saveShippingInfo = true;
        if (z || this.currentStep == 4) {
            this.saveCardInfo = z;
        } else {
            this.saveCardInfo = !this.paymentForm.saved_credentials.isEmpty();
        }
        if (str3 != null) {
            this.cardName = str3;
        } else {
            if (this.paymentForm.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.paymentForm.saved_credentials.get(0);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard;
            this.cardName = tL_paymentSavedCredentialsCard.title;
        }
    }

    private void initGooglePay(Context context) {
        if (getParentActivity() == null) {
            return;
        }
        zzn zznVar = new zzn();
        int i = this.paymentForm.invoice.test ? 3 : 1;
        if (i != 0) {
            if (i == 0) {
                i = 0;
            } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(Fragment$$ExternalSyntheticOutline0.m(i, "Invalid environment value "));
            }
        }
        zznVar.zza = i;
        this.paymentsClient = new PaymentsClient(context, zzk.API, new Wallet$WalletOptions(zznVar), GoogleApi.Settings.DEFAULT_SETTINGS);
        Optional<JSONObject> isReadyToPayRequest = getIsReadyToPayRequest();
        if (isReadyToPayRequest.isPresent()) {
            String string = isReadyToPayRequest.get().toString();
            IsReadyToPayRequest isReadyToPayRequest2 = new IsReadyToPayRequest();
            zzah.checkNotNull(string, "isReadyToPayRequestJson cannot be null!");
            isReadyToPayRequest2.zzf = string;
            PaymentsClient paymentsClient = this.paymentsClient;
            paymentsClient.getClass();
            ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
            exoplayerCuesDecoderBuilder.inputBufferState = 23705;
            exoplayerCuesDecoderBuilder.inputBuffer = new zzct(isReadyToPayRequest2, 28);
            paymentsClient.zae(0, exoplayerCuesDecoderBuilder.build()).addOnCompleteListener(getParentActivity(), new PaymentFormActivity$$ExternalSyntheticLambda0(this, 0));
        }
    }

    public void lambda$checkPassword$70(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        showEditDoneProgress(true, false);
        setDonePressed(false);
        if (tLObject != null) {
            this.passwordOk = true;
            UserConfig.getInstance(this.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(this.currentAccount).saveConfig(false);
            goToNextStep();
            return;
        }
        if (!tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, gettmppassword, new Object[0]);
            return;
        }
        try {
            this.inputFields[1].performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(this.inputFields[1], 3.25f);
        this.inputFields[1].setText("");
    }

    public void lambda$checkPassword$71(TL_account.getTmpPassword gettmppassword, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(11, this, tLObject, tL_error, gettmppassword));
    }

    public void lambda$checkPassword$72(TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        LinkManager$$ExternalSyntheticLambda15 linkManager$$ExternalSyntheticLambda15 = new LinkManager$$ExternalSyntheticLambda15(10, this, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            linkManager$$ExternalSyntheticLambda15.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, linkManager$$ExternalSyntheticLambda15, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        linkManager$$ExternalSyntheticLambda15.run(null, tL_error2);
    }

    public void lambda$checkPassword$73(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, getpassword, new Object[0]);
            showEditDoneProgress(true, false);
            setDonePressed(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
            AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda25(this, password, AndroidUtilities.getStringBytes(str), 22));
        } else {
            this.passwordOk = false;
            goToNextStep();
        }
    }

    public void lambda$checkPassword$74(String str, TL_account.getPassword getpassword, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ProfileActivity$$ExternalSyntheticLambda52(this, tL_error, tLObject, str, getpassword, 2));
    }

    public void lambda$createGooglePayButton$32(View view) {
        this.googlePayButton.setClickable(false);
        try {
            JSONObject baseRequest = getBaseRequest();
            JSONObject baseCardPaymentMethod = getBaseCardPaymentMethod();
            if (this.googlePayPublicKey == null || this.googlePayParameters != null) {
                baseCardPaymentMethod.put("tokenizationSpecification", new JSONObject() {
                    {
                        put("type", "PAYMENT_GATEWAY");
                        if (PaymentFormActivity.this.googlePayParameters != null) {
                            put("parameters", PaymentFormActivity.this.googlePayParameters);
                        } else {
                            put("parameters", new JSONObject() {
                                {
                                    put("gateway", "stripe");
                                    put("stripe:publishableKey", PaymentFormActivity.this.providerApiKey);
                                    put("stripe:version", "3.5.0");
                                }
                            });
                        }
                    }
                });
            } else {
                baseCardPaymentMethod.put("tokenizationSpecification", new JSONObject() {
                    {
                        put("type", "DIRECT");
                        put("parameters", new JSONObject() {
                            {
                                put("protocolVersion", "ECv2");
                                put("publicKey", PaymentFormActivity.this.googlePayPublicKey);
                            }
                        });
                    }
                });
            }
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod));
            JSONObject jSONObject = new JSONObject();
            ArrayList<TLRPC.TL_labeledPrice> arrayList = new ArrayList<>(this.paymentForm.invoice.prices);
            TLRPC.TL_shippingOption tL_shippingOption = this.shippingOption;
            if (tL_shippingOption != null) {
                arrayList.addAll(tL_shippingOption.prices);
            }
            String totalPriceDecimalString = getTotalPriceDecimalString(arrayList);
            this.totalPriceDecimal = totalPriceDecimalString;
            jSONObject.put("totalPrice", totalPriceDecimalString);
            jSONObject.put("totalPriceStatus", "FINAL");
            if (!TextUtils.isEmpty(this.googlePayCountryCode)) {
                jSONObject.put("countryCode", this.googlePayCountryCode);
            }
            jSONObject.put("currencyCode", this.paymentForm.invoice.currency);
            jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
            baseRequest.put("transactionInfo", jSONObject);
            baseRequest.put("merchantInfo", new JSONObject().put("merchantName", this.currentBotName));
            String string = baseRequest.toString();
            PaymentDataRequest paymentDataRequest = new PaymentDataRequest();
            paymentDataRequest.zzi = true;
            zzah.checkNotNull(string, "paymentDataRequestJson cannot be null!");
            paymentDataRequest.zzj = string;
            PaymentsClient paymentsClient = this.paymentsClient;
            paymentsClient.getClass();
            ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
            exoplayerCuesDecoderBuilder.inputBuffer = new zzcu(paymentDataRequest, 28);
            exoplayerCuesDecoderBuilder.availableOutputBuffers = new Feature[]{zzk.zzc};
            exoplayerCuesDecoderBuilder.released = true;
            exoplayerCuesDecoderBuilder.inputBufferState = 23707;
            AutoResolveHelper.resolveTask(paymentsClient.zae(1, exoplayerCuesDecoderBuilder.build()), getParentActivity());
        } catch (JSONException e) {
            FileLog.e(e);
        }
    }

    public void lambda$createView$0(CountrySelectActivity.Country country) {
        this.country = country;
        this.inputFields[4].setText(country.name);
        this.countryName = country.shortname;
    }

    public boolean lambda$createView$1(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new PaymentFormActivity$$ExternalSyntheticLambda0(this, 4));
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public static boolean lambda$createView$10(View view, MotionEvent motionEvent) {
        return true;
    }

    public boolean lambda$createView$11(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.doneItem.performClick();
        return true;
    }

    public void lambda$createView$12(View view) {
        this.passwordOk = false;
        goToNextStep();
    }

    public void lambda$createView$13(View view) {
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    public static boolean lambda$createView$14(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        AndroidUtilities.hideKeyboard(textView);
        return true;
    }

    public void lambda$createView$15(TextView textView, long j, View view) {
        long jLongValue = ((Long) textView.getTag()).longValue();
        Long l = this.tipAmount;
        if (l == null || jLongValue != l.longValue()) {
            this.inputFields[0].setText(LocaleController.getInstance().formatCurrencyString(j, false, true, true, this.paymentForm.invoice.currency));
        } else {
            this.ignoreOnTextChange = true;
            this.inputFields[0].setText("");
            this.ignoreOnTextChange = false;
            this.tipAmount = 0L;
            updateTotalPrice();
        }
        EditTextBoldCursor editTextBoldCursor = this.inputFields[0];
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
    }

    public void lambda$createView$16(View view) {
        if (getParentActivity() == null) {
            return;
        }
        showChoosePaymentMethod();
    }

    public void lambda$createView$17(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
        paymentFormActivity.setCustomAnyResultReceiver(this.customAnyResultReceiver);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }
        });
        presentFragment(paymentFormActivity);
    }

    public void lambda$createView$18(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
        paymentFormActivity.setCustomAnyResultReceiver(this.customAnyResultReceiver);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }
        });
        presentFragment(paymentFormActivity);
    }

    public void lambda$createView$19(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
        paymentFormActivity.setCustomAnyResultReceiver(this.customAnyResultReceiver);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }
        });
        presentFragment(paymentFormActivity);
    }

    public boolean lambda$createView$2(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            this.doneItem.performClick();
            return true;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        while (true) {
            iIntValue++;
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (iIntValue < editTextBoldCursorArr.length) {
                if (iIntValue != 4 && ((View) editTextBoldCursorArr[iIntValue].getParent()).getVisibility() == 0) {
                    this.inputFields[iIntValue].requestFocus();
                    break;
                }
            } else {
                break;
            }
        }
        return true;
    }

    public void lambda$createView$20(View view) {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
        paymentFormActivity.setCustomAnyResultReceiver(this.customAnyResultReceiver);
        paymentFormActivity.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.setAddressFields(paymentFormActivity2.validateRequest.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }
        });
        presentFragment(paymentFormActivity);
    }

    public void lambda$createView$21(View view) {
        setDonePressed(false);
        view.callOnClick();
    }

    public void lambda$createView$22(AlertDialog alertDialog, int i) {
        showPayAlert(this.totalPrice[0]);
    }

    public void lambda$createView$23(java.lang.String r23, android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PaymentFormActivity.lambda$createView$23(java.lang.String, android.view.View):void");
    }

    public void lambda$createView$24(View view) {
        if (this.donePressed) {
            return;
        }
        boolean z = !this.recurrentAccepted;
        this.recurrentAccepted = z;
        this.recurrentAcceptCell.setChecked(z);
        this.bottomLayout.setChecked(this.recurrentAccepted, true);
    }

    public boolean lambda$createView$25(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        sendSavePassword(false);
        return true;
    }

    public static void lambda$createView$26(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$createView$27(View view) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new PassportActivity$$ExternalSyntheticLambda3(14), this.allowUnregistered ? 8 : 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setMessage(LocaleController.getString(R.string.ResendCodeInfo));
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    public void lambda$createView$28(AlertDialog alertDialog, int i) {
        sendSavePassword(true);
    }

    public void lambda$createView$29(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
        if (this.currentPassword.has_secure_values) {
            string = NotificationsController$$ExternalSyntheticOutline1.m(Log.m(string, "\n\n"), R.string.TurnPasswordOffPassport);
        }
        builder.setMessage(string);
        builder.setTitle(LocaleController.getString(R.string.TurnPasswordOffQuestionTitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Disable), new PaymentFormActivity$$ExternalSyntheticLambda0(this, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(Theme.key_text_RedBold));
        }
    }

    public void lambda$createView$3(View view) {
        boolean z = !this.saveShippingInfo;
        this.saveShippingInfo = z;
        this.checkCell1.setChecked(z);
    }

    public boolean lambda$createView$30(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            this.doneItem.performClick();
            return true;
        }
        if (i != 5) {
            return false;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            this.inputFields[1].requestFocus();
            return false;
        }
        if (iIntValue != 1) {
            return false;
        }
        this.inputFields[2].requestFocus();
        return false;
    }

    public void lambda$createView$4(View view) {
        boolean z = !this.saveCardInfo;
        this.saveCardInfo = z;
        this.checkCell1.setChecked(z);
    }

    public void lambda$createView$5(CountrySelectActivity.Country country) {
        this.country = country;
        this.inputFields[4].setText(country.name);
    }

    public boolean lambda$createView$6(View view, MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new PaymentFormActivity$$ExternalSyntheticLambda0(this, 3));
            presentFragment(countrySelectActivity);
        }
        return true;
    }

    public boolean lambda$createView$7(TextView textView, int i, KeyEvent keyEvent) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            this.doneItem.performClick();
            return true;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        do {
            int i2 = iIntValue + 1;
            editTextBoldCursorArr = this.inputFields;
            if (i2 < editTextBoldCursorArr.length) {
                iIntValue = i2 == 4 ? iIntValue + 2 : i2;
            }
            return true;
        } while (((View) editTextBoldCursorArr[iIntValue].getParent()).getVisibility() != 0);
        this.inputFields[iIntValue].requestFocus();
        return true;
    }

    public void lambda$createView$8(View view) {
        boolean z = !this.saveCardInfo;
        this.saveCardInfo = z;
        this.checkCell1.setChecked(z);
    }

    public void lambda$createView$9(View view) {
        int iIntValue = ((Integer) view.getTag()).intValue();
        int i = 0;
        while (true) {
            RadioCell[] radioCellArr = this.radioCells;
            if (i >= radioCellArr.length) {
                return;
            }
            radioCellArr[i].setChecked(iIntValue == i, true);
            i++;
        }
    }

    public void lambda$goToNextStep$40() {
        getMessagesController().newMessageCallback = null;
        if (this.invoiceStatus != InvoiceStatus.PENDING || isFinishing()) {
            if (this.invoiceStatus != InvoiceStatus.PAID || isFinishing()) {
                return;
            }
            finishFragment();
            return;
        }
        InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
        this.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
        finishFragment();
    }

    public void lambda$initGooglePay$37(Task task) {
        if (!task.isSuccessful()) {
            FileLog.e("isReadyToPay failed", task.getException());
            return;
        }
        FrameLayout frameLayout = this.googlePayContainer;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
    }

    public void lambda$loadPasswordInfo$33() {
        if (this.shortPollRunnable == null) {
            return;
        }
        loadPasswordInfo();
        this.shortPollRunnable = null;
    }

    public void lambda$loadPasswordInfo$34(TLRPC.TL_error tL_error, TLObject tLObject) {
        this.loadingPasswordInfo = false;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if (paymentForm != null && this.currentPassword.has_password) {
                paymentForm.password_missing = false;
                paymentForm.can_save_credentials = true;
                updateSavePaymentField();
            }
            TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
            PaymentFormActivity paymentFormActivity = this.passwordFragment;
            if (paymentFormActivity != null) {
                paymentFormActivity.setCurrentPassword(this.currentPassword);
            }
            if (this.currentPassword.has_password || this.shortPollRunnable != null) {
                return;
            }
            PaymentFormActivity$$ExternalSyntheticLambda19 paymentFormActivity$$ExternalSyntheticLambda19 = new PaymentFormActivity$$ExternalSyntheticLambda19(this, 3);
            this.shortPollRunnable = paymentFormActivity$$ExternalSyntheticLambda19;
            AndroidUtilities.runOnUIThread(paymentFormActivity$$ExternalSyntheticLambda19, 5000L);
        }
    }

    public void lambda$loadPasswordInfo$35(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda7(this, tL_error, tLObject, 0));
    }

    public void lambda$onActivityResultFragment$39(int i, Intent intent) {
        String str;
        if (i == -1) {
            Parcelable.Creator<PaymentData> creator = PaymentData.CREATOR;
            byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
            PaymentData paymentData = (PaymentData) (byteArrayExtra != null ? zzjt.deserializeFromBytes(byteArrayExtra, creator) : null);
            if (paymentData == null || (str = paymentData.zzg) == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                jSONObject2.getString("type");
                String string = jSONObject2.getString("token");
                if (this.googlePayPublicKey == null && this.googlePayParameters == null) {
                    Token token = TokenParser.parseToken(string);
                    this.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", token.mType, token.mId);
                    Card card = token.mCard;
                    this.cardName = card.getBrand() + " *" + card.getLast4();
                } else {
                    TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                    this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                    tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                    this.googlePayCredentials.payment_token.data = jSONObject2.toString();
                    String strOptString = jSONObject.optString("description");
                    if (TextUtils.isEmpty(strOptString)) {
                        this.cardName = "Android Pay";
                    } else {
                        this.cardName = strOptString;
                    }
                }
                goToNextStep();
            } catch (JSONException e) {
                FileLog.e(e);
            }
        } else if (i == 1) {
            int i2 = AutoResolveHelper.$r8$clinit;
            Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
            StringBuilder sb = new StringBuilder("android pay error ");
            sb.append(status != null ? status.zzc : "");
            FileLog.e(sb.toString());
        }
        showEditDoneProgress(true, false);
        setDonePressed(false);
        FrameLayout frameLayout = this.googlePayButton;
        if (frameLayout != null) {
            frameLayout.setClickable(true);
        }
    }

    public void lambda$onTransitionAnimationEnd$38() {
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    public static void lambda$sendData$56(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public void lambda$sendData$57(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getContext(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, getResourceProvider());
        } else {
            if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), bottomSheetParams);
        }
    }

    public void lambda$sendData$58(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda13(this, tLObject, 1));
    }

    public void lambda$sendData$59(Bulletin bulletin, boolean z, TLRPC.Message[] messageArr, View view) {
        bulletin.hide();
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(MessageObject.getDialogId(messageArr[0]), messageArr[0].id));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new PaymentFormActivity$$ExternalSyntheticLambda17(this, 0), 2);
    }

    public void lambda$sendData$60(TLRPC.Message[] messageArr) {
        String forcedFirstName;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String string2;
        Bulletin bulletinCreateSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        int i3 = 1;
        Context context = getContext();
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            context = LaunchActivity.instance;
        }
        if (context == null) {
            return;
        }
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PAID;
        this.invoiceStatus = invoiceStatus;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z && (paymentFormCallback2 = this.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(invoiceStatus);
        }
        goToNextStep();
        if (z && (paymentFormCallback = this.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
        }
        long starsGiftUserId = getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            forcedFirstName = UserObject.getForcedFirstName(getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            forcedFirstName = "";
            if (starsGiftUserId < 0 && (chat = getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                forcedFirstName = chat.title;
            }
        }
        long stars = getStars();
        if (z) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i4 = i;
        if (z) {
            if (z3) {
                i2 = R.string.StarsGiveawaySentPopup;
            } else {
                i2 = z2 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired;
            }
            string = LocaleController.getString(i2);
        } else {
            string = null;
        }
        String str = string;
        if (!z) {
            string2 = LocaleController.formatString(R.string.PaymentInfoHint, this.totalPrice[0], this.currentItemName);
        } else if (z3) {
            string2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) stars);
        } else {
            string2 = LocaleController.formatPluralStringComma(z2 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) stars, forcedFirstName);
        }
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string2);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
        if (starsGiftUserId == 0 || str == null || z3) {
            bulletinCreateSimpleBulletin = str != null ? bulletinFactoryOf.createSimpleBulletin(i4, str, spannableStringBuilderReplaceTags) : bulletinFactoryOf.createSimpleBulletin(i4, spannableStringBuilderReplaceTags);
        } else {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i4, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new PaymentFormActivity$$ExternalSyntheticLambda54(starsGiftUserId, i3));
        }
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.setDuration(5000);
        if (messageArr[0] != null) {
            bulletinCreateSimpleBulletin.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda70(this, bulletinCreateSimpleBulletin, z2, messageArr, 3));
        }
        bulletinCreateSimpleBulletin.show(z3);
    }

    public static void lambda$sendData$61(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public void lambda$sendData$62(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getContext(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, getResourceProvider());
        } else {
            if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
                return;
            }
            BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
            bottomSheetParams.transitionFromLeft = true;
            lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), bottomSheetParams);
        }
    }

    public void lambda$sendData$63(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda13(this, tLObject, 2));
    }

    public void lambda$sendData$64(Bulletin bulletin, boolean z, TLRPC.Message message, View view) {
        bulletin.hide();
        if (z) {
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(ChatActivity.of(MessageObject.getDialogId(message), message.id));
                return;
            }
            return;
        }
        TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
        tL_payments_getPaymentReceipt.msg_id = message.id;
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new PaymentFormActivity$$ExternalSyntheticLambda17(this, 3), 2);
    }

    public void lambda$sendData$65(INavigationLayout iNavigationLayout, Activity activity, TLRPC.Message message) {
        String forcedFirstName;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String string2;
        Bulletin bulletinCreateSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        this.paymentStatusSent = true;
        this.invoiceStatus = InvoiceStatus.PAID;
        onCheckoutSuccess(iNavigationLayout, activity);
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        int i3 = 0;
        boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z != 0 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (z == 0 && (paymentFormCallback2 = this.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(this.invoiceStatus);
        }
        goToNextStep();
        if (z != 0 && (paymentFormCallback = this.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
        }
        long starsGiftUserId = getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            forcedFirstName = UserObject.getForcedFirstName(getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            forcedFirstName = "";
            if (starsGiftUserId < 0 && (chat = getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                forcedFirstName = chat.title;
            }
        }
        long stars = getStars();
        if (z != 0) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i4 = i;
        if (z == 0) {
            string = null;
        } else {
            if (z3) {
                i2 = R.string.StarsGiveawaySentPopup;
            } else {
                i2 = z2 ? R.string.StarsGiftSentPopup : R.string.StarsAcquired;
            }
            string = LocaleController.getString(i2);
        }
        String str = string;
        if (!z) {
            string2 = LocaleController.formatString(R.string.PaymentInfoHint, this.totalPrice[0], this.currentItemName);
        } else if (z3) {
            string2 = LocaleController.formatPluralStringComma("StarsGiveawaySentPopupInfo", (int) stars);
        } else {
            string2 = LocaleController.formatPluralStringComma(z2 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) stars, forcedFirstName);
        }
        SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(string2);
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment == null) {
            return;
        }
        BulletinFactory bulletinFactoryOf = BulletinFactory.of(safeLastFragment);
        if (starsGiftUserId == 0 || str == null || z3) {
            bulletinCreateSimpleBulletin = str != null ? bulletinFactoryOf.createSimpleBulletin(i4, str, spannableStringBuilderReplaceTags) : bulletinFactoryOf.createSimpleBulletin(i4, spannableStringBuilderReplaceTags);
        } else {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i4, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new PaymentFormActivity$$ExternalSyntheticLambda54(starsGiftUserId, i3));
        }
        Bulletin bulletin = bulletinCreateSimpleBulletin;
        bulletin.hideAfterBottomSheet = false;
        bulletin.setDuration(5000);
        if (message != null) {
            bulletin.setOnClickListener(new PassportActivity$$ExternalSyntheticLambda70(this, bulletin, z2, message, 2));
        }
        bulletin.show(z3);
    }

    public boolean lambda$sendData$66(INavigationLayout iNavigationLayout, Activity activity, TLRPC.Message message) {
        if (MessageObject.getPeerId(message.peer_id) != this.botUser.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(10, this, iNavigationLayout, activity, message));
        return true;
    }

    public void lambda$sendData$67(TLObject tLObject) {
        Utilities.Callback<TLRPC.payments_PaymentResult> callback = this.customAnyResultReceiver;
        if (callback != null) {
            callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
        }
        setDonePressed(false);
        this.webviewLoading = true;
        showEditDoneProgress(true, true);
        ContextProgressView contextProgressView = this.progressView;
        if (contextProgressView != null) {
            contextProgressView.setVisibility(0);
        }
        ActionBarMenuItem actionBarMenuItem = this.doneItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnabled(false);
            this.doneItem.getContentView().setVisibility(4);
        }
        INavigationLayout parentLayout = getParentLayout();
        Activity parentActivity = getParentActivity();
        getMessagesController().newMessageCallback = new WearAuthSheet$$ExternalSyntheticLambda5(this, parentLayout, parentActivity, 26);
        WebView webView = this.webView;
        if (webView != null) {
            webView.setVisibility(0);
            WebView webView2 = this.webView;
            String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
            this.webViewUrl = str;
            webView2.loadUrl(str);
        }
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PENDING;
        this.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
    }

    public void lambda$sendData$68(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        AlertsCreator.processError(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        setDonePressed(false);
        showEditDoneProgress(false, false);
        this.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
        this.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
    }

    public void lambda$sendData$69(TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null) {
            Utilities.CallbackReturn<TLRPC.TL_error, Boolean> callbackReturn = this.customErrorReceiver;
            if (callbackReturn == null || !callbackReturn.run(tL_error).booleanValue()) {
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((Object) this, (Object) tL_error, (Object) tL_payments_sendPaymentForm, 20));
                return;
            }
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda13(this, tLObject, 0));
                return;
            }
            return;
        }
        Utilities.Callback<TLRPC.TL_payments_paymentResult> callback = this.customResultReceiver;
        if (callback != null) {
            callback.run((TLRPC.TL_payments_paymentResult) tLObject);
            return;
        }
        TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
        TLRPC.Message[] messageArr = new TLRPC.Message[1];
        int size = updates.updates.size();
        for (int i = 0; i < size; i++) {
            TLRPC.Update update = updates.updates.get(i);
            if (update instanceof TL_update.TL_updateNewMessage) {
                messageArr[0] = ((TL_update.TL_updateNewMessage) update).message;
                break;
            } else {
                if (update instanceof TL_update.TL_updateNewChannelMessage) {
                    messageArr[0] = ((TL_update.TL_updateNewChannelMessage) update).message;
                    break;
                }
            }
        }
        getMessagesController().processUpdates(updates, false);
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(25, this, messageArr));
    }

    public static void lambda$sendForm$52(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$sendForm$53(TLObject tLObject) {
        this.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        if (this.paymentForm.saved_info != null && !this.saveShippingInfo) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_clearSavedInfo, new PassportActivity$$ExternalSyntheticLambda3(15), this.allowUnregistered ? 8 : 0);
        }
        goToNextStep();
        setDonePressed(false);
        showEditDoneProgress(true, false);
    }

    public void lambda$sendForm$54(TLRPC.TL_error tL_error, TLObject tLObject) {
        setDonePressed(false);
        showEditDoneProgress(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    shakeField(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    shakeField(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    shakeField(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    shakeField(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    shakeField(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    shakeField(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    shakeField(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    shakeField(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    shakeField(7);
                    break;
                default:
                    AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public void lambda$sendForm$55(TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        if (!(tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo)) {
            AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda7(this, tL_error, tLObject, 1));
        } else {
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(24, this, (TLRPC.TL_payments_validatedRequestedInfo) tLObject2));
        }
    }

    public void lambda$sendSavePassword$41(TLRPC.TL_error tL_error) {
        showEditDoneProgress(true, false);
        if (tL_error == null) {
            if (getParentActivity() == null) {
                return;
            }
            Runnable runnable = this.shortPollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.shortPollRunnable = null;
            }
            goToNextStep();
            return;
        }
        if (tL_error.text.startsWith("CODE_INVALID")) {
            shakeView(this.codeFieldCell);
            EditTextSettingsCell editTextSettingsCell = this.codeFieldCell;
            editTextSettingsCell.textView.setText("");
            editTextSettingsCell.needDivider = false;
            editTextSettingsCell.setWillNotDraw(true);
            return;
        }
        if (!tL_error.text.startsWith("FLOOD_WAIT")) {
            showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        } else {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
        }
    }

    public void lambda$sendSavePassword$42(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(26, this, tL_error));
    }

    public void lambda$sendSavePassword$43(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            this.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            sendSavePassword(z);
        }
    }

    public void lambda$sendSavePassword$44(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new QrActivity$$ExternalSyntheticLambda3(this, tL_error, tLObject, z, 13));
    }

    public void lambda$sendSavePassword$45(String str, AlertDialog alertDialog, int i) {
        this.waitingForEmail = true;
        this.currentPassword.email_unconfirmed_pattern = str;
        updatePasswordFields();
    }

    public void lambda$sendSavePassword$46(TLRPC.TL_error tL_error, boolean z, TLObject tLObject, String str) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(this, z, 6), 8);
            return;
        }
        showEditDoneProgress(true, false);
        if (z) {
            TL_account.Password password = this.currentPassword;
            password.has_password = false;
            password.current_algo = null;
            this.delegate.currentPasswordUpdated(password);
            finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (getParentActivity() == null) {
                return;
            }
            goToNextStep();
            return;
        }
        if (tL_error != null) {
            if (!tL_error.text.equals("EMAIL_UNCONFIRMED") && !tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                if (tL_error.text.equals("EMAIL_INVALID")) {
                    showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            }
            this.emailCodeLength = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new TodoItemMenu$$ExternalSyntheticLambda7(7, this, str));
            builder.setMessage(LocaleController.getString(R.string.YourEmailAlmostThereText));
            builder.setTitle(LocaleController.getString(R.string.YourEmailAlmostThere));
            Dialog dialogShowDialog = showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }
    }

    public void lambda$sendSavePassword$47(boolean z, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$1$$ExternalSyntheticLambda0(str, tLObject, tL_error, this, z));
    }

    public void lambda$sendSavePassword$48(boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        LinkManager$1$$ExternalSyntheticLambda2 linkManager$1$$ExternalSyntheticLambda2 = new LinkManager$1$$ExternalSyntheticLambda2(this, z, str, 8);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, linkManager$1$$ExternalSyntheticLambda2, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            linkManager$1$$ExternalSyntheticLambda2.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            linkManager$1$$ExternalSyntheticLambda2.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, linkManager$1$$ExternalSyntheticLambda2, 10);
    }

    public void lambda$sendSavedForm$49(TLObject tLObject, Runnable runnable) {
        this.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        runnable.run();
        setDonePressed(false);
        showEditDoneProgress(true, false);
    }

    public void lambda$sendSavedForm$50(TLRPC.TL_error tL_error, TLObject tLObject) {
        setDonePressed(false);
        showEditDoneProgress(true, false);
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    public void lambda$sendSavedForm$51(Runnable runnable, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        if (tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, (TLRPC.TL_payments_validatedRequestedInfo) tLObject2, runnable, 21));
        } else {
            AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda7(this, tL_error, tLObject, 2));
        }
    }

    public void lambda$showChoosePaymentMethod$31(final Runnable runnable, List list, List list2, DialogInterface dialogInterface, int i) {
        PaymentFormActivityDelegate paymentFormActivityDelegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivityDelegate.CC.$default$didSelectNewAddress(this, tL_payments_validateRequestedInfo);
            }

            @Override
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                String str3;
                PaymentFormActivity.this.savedCredentialsCard = tL_paymentSavedCredentialsCard;
                PaymentFormActivity.this.paymentJson = str;
                PaymentFormActivity.this.saveCardInfo = z;
                PaymentFormActivity.this.cardName = str2;
                PaymentFormActivity.this.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                if (PaymentFormActivity.this.detailSettingsCell[0] != null) {
                    PaymentFormActivity.this.detailSettingsCell[0].setVisibility(0);
                    TextDetailSettingsCell textDetailSettingsCell = PaymentFormActivity.this.detailSettingsCell[0];
                    if (PaymentFormActivity.this.cardName == null || PaymentFormActivity.this.cardName.length() <= 1) {
                        str3 = PaymentFormActivity.this.cardName;
                    } else {
                        str3 = PaymentFormActivity.this.cardName.substring(0, 1).toUpperCase() + PaymentFormActivity.this.cardName.substring(1);
                    }
                    textDetailSettingsCell.setTextAndValueAndIcon(str3, LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, true);
                    if (PaymentFormActivity.this.detailSettingsCell[1] != null) {
                        PaymentFormActivity.this.detailSettingsCell[1].setVisibility(0);
                    }
                }
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
                return false;
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }
        };
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
        int i2 = (tL_paymentSavedCredentialsCard == null && this.cardName == null) ? 0 : 1;
        if (!(tL_paymentSavedCredentialsCard == null && this.cardName == null) && i == 0) {
            return;
        }
        if (i >= i2 && i < list.size() + i2) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) list.get(i - i2);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard2;
            paymentFormActivityDelegate.didSelectNewCard(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
            return;
        }
        if (i < list2.size() - 1) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentForm.additional_methods.get((i - list.size()) - i2);
            PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
            paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
            paymentFormActivity.setCustomAnyResultReceiver(this.customAnyResultReceiver);
            paymentFormActivity.setPaymentMethod(tL_paymentFormMethod);
            paymentFormActivity.setDelegate(paymentFormActivityDelegate);
            presentFragment(paymentFormActivity);
            return;
        }
        if (i == list2.size() - 1) {
            PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
            paymentFormActivity2.setCustomResultReceiver(this.customResultReceiver);
            paymentFormActivity2.setCustomAnyResultReceiver(this.customAnyResultReceiver);
            paymentFormActivity2.setDelegate(paymentFormActivityDelegate);
            presentFragment(paymentFormActivity2);
        }
    }

    public void lambda$showPayAlert$36(AlertDialog alertDialog, int i) {
        setDonePressed(true);
        sendData();
    }

    private void loadPasswordInfo() {
        if (this.loadingPasswordInfo) {
            return;
        }
        this.loadingPasswordInfo = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new PaymentFormActivity$$ExternalSyntheticLambda17(this, 2), 10);
    }

    private boolean onCheckoutSuccess(INavigationLayout iNavigationLayout, Activity activity) {
        int i = 0;
        if (this.invoiceInput != null) {
            if (iNavigationLayout == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList(((ActionBarLayout) iNavigationLayout).getFragmentStack());
            int size = arrayList.size();
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment instanceof PaymentFormActivity) {
                    baseFragment.removeSelfFromStack();
                }
            }
            return true;
        }
        String str = this.botUser.username;
        if ((!(str != null && str.equalsIgnoreCase(getMessagesController().premiumBotUsername) && this.invoiceSlug == null) && (this.invoiceSlug == null || getMessagesController().premiumInvoiceSlug == null || !Objects.equals(this.invoiceSlug, getMessagesController().premiumInvoiceSlug))) || iNavigationLayout == null) {
            return false;
        }
        ArrayList arrayList2 = new ArrayList(((ActionBarLayout) iNavigationLayout).getFragmentStack());
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            BaseFragment baseFragment2 = (BaseFragment) obj2;
            if ((baseFragment2 instanceof ChatActivity) || (baseFragment2 instanceof PremiumPreviewFragment)) {
                baseFragment2.removeSelfFromStack();
            }
        }
        PremiumPreviewFragment forcePremium = new PremiumPreviewFragment(null).setForcePremium();
        boolean z = !isFinishing();
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(forcePremium);
        navigationParams.removeLast = z;
        ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
        if (activity instanceof LaunchActivity) {
            try {
                this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ((LaunchActivity) activity).getFireworksOverlay().start();
        }
        return true;
    }

    private void onPresentFragment(BaseFragment baseFragment) {
        AndroidUtilities.hideKeyboard(this.fragmentView);
        if (baseFragment instanceof PaymentFormActivity) {
            PaymentFormActivity paymentFormActivity = (PaymentFormActivity) baseFragment;
            paymentFormActivity.paymentFormCallback = this.paymentFormCallback;
            paymentFormActivity.resourcesProvider = this.resourcesProvider;
            paymentFormActivity.needPayAfterTransition = this.needPayAfterTransition;
            paymentFormActivity.savedCredentialsCard = this.savedCredentialsCard;
        }
    }

    public boolean sendCardData() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PaymentFormActivity.sendCardData():boolean");
    }

    private void sendData() {
        String str;
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(false, true);
        TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_sendPaymentForm.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            tL_payments_sendPaymentForm.invoice = tL_inputInvoiceSlug;
        }
        tL_payments_sendPaymentForm.form_id = this.paymentForm.form_id;
        if (UserConfig.getInstance(this.currentAccount).tmpPassword == null || this.savedCredentialsCard == null) {
            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = this.googlePayCredentials;
            if (tL_inputPaymentCredentialsGooglePay != null) {
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsGooglePay;
            } else {
                TLRPC.TL_inputPaymentCredentials tL_inputPaymentCredentials = new TLRPC.TL_inputPaymentCredentials();
                tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentials;
                tL_inputPaymentCredentials.save = this.saveCardInfo;
                tL_inputPaymentCredentials.data = new TLRPC.TL_dataJSON();
                tL_payments_sendPaymentForm.credentials.data.data = this.paymentJson;
            }
        } else {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.savedCredentialsCard.id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        }
        TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo = this.requestedInfo;
        if (tL_payments_validatedRequestedInfo != null && (str = tL_payments_validatedRequestedInfo.id) != null) {
            tL_payments_sendPaymentForm.requested_info_id = str;
            tL_payments_sendPaymentForm.flags = 1 | tL_payments_sendPaymentForm.flags;
        }
        TLRPC.TL_shippingOption tL_shippingOption = this.shippingOption;
        if (tL_shippingOption != null) {
            tL_payments_sendPaymentForm.shipping_option_id = tL_shippingOption.id;
            tL_payments_sendPaymentForm.flags |= 2;
        }
        if ((this.paymentForm.invoice.flags & 256) != 0) {
            Long l = this.tipAmount;
            tL_payments_sendPaymentForm.tip_amount = l != null ? l.longValue() : 0L;
            tL_payments_sendPaymentForm.flags |= 4;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new LinkManager$$ExternalSyntheticLambda15(9, this, tL_payments_sendPaymentForm), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public void sendForm() {
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        this.validateRequest = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            this.validateRequest.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            this.validateRequest.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
        tL_payments_validateRequestedInfo2.save = this.saveShippingInfo;
        tL_payments_validateRequestedInfo2.info = new TLRPC.TL_paymentRequestedInfo();
        if (this.paymentForm.invoice.name_requested) {
            this.validateRequest.info.name = this.inputFields[6].getText().toString();
            this.validateRequest.info.flags |= 1;
        }
        if (this.paymentForm.invoice.phone_requested) {
            this.validateRequest.info.phone = "+" + this.inputFields[8].getText().toString() + this.inputFields[9].getText().toString();
            TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo = this.validateRequest.info;
            tL_paymentRequestedInfo.flags = tL_paymentRequestedInfo.flags | 2;
        }
        if (this.paymentForm.invoice.email_requested) {
            this.validateRequest.info.email = this.inputFields[7].getText().toString().trim();
            this.validateRequest.info.flags |= 4;
        }
        if (this.paymentForm.invoice.shipping_address_requested) {
            this.validateRequest.info.shipping_address = new TLRPC.TL_postAddress();
            this.validateRequest.info.shipping_address.street_line1 = this.inputFields[0].getText().toString();
            this.validateRequest.info.shipping_address.street_line2 = this.inputFields[1].getText().toString();
            this.validateRequest.info.shipping_address.city = this.inputFields[2].getText().toString();
            this.validateRequest.info.shipping_address.state = this.inputFields[3].getText().toString();
            TLRPC.TL_postAddress tL_postAddress = this.validateRequest.info.shipping_address;
            String str = this.countryName;
            if (str == null) {
                str = "";
            }
            tL_postAddress.country_iso2 = str;
            tL_postAddress.post_code = this.inputFields[5].getText().toString();
            this.validateRequest.info.flags |= 8;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.validateRequest, new LinkManager$$ExternalSyntheticLambda15(8, this, this.validateRequest), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public void sendSavePassword(boolean z) {
        String str;
        String str2;
        if (!z && this.codeFieldCell.getVisibility() == 0) {
            String text = this.codeFieldCell.getText();
            if (text.length() == 0) {
                shakeView(this.codeFieldCell);
                return;
            }
            showEditDoneProgress(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new PaymentFormActivity$$ExternalSyntheticLambda17(this, 1), 10);
            return;
        }
        TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
        if (z) {
            this.doneItem.setVisibility(0);
            TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings;
            passwordinputsettings.flags = 2;
            passwordinputsettings.email = "";
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            str = null;
            str2 = null;
        } else {
            String string = this.inputFields[0].getText().toString();
            if (TextUtils.isEmpty(string)) {
                shakeField(0);
                return;
            }
            if (!string.equals(this.inputFields[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                shakeField(1);
                return;
            }
            String string2 = this.inputFields[2].getText().toString();
            if (string2.length() < 3) {
                shakeField(2);
                return;
            }
            int iLastIndexOf = string2.lastIndexOf(46);
            int iLastIndexOf2 = string2.lastIndexOf(64);
            if (iLastIndexOf2 < 0 || iLastIndexOf < iLastIndexOf2) {
                shakeField(2);
                return;
            }
            updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            TL_account.passwordInputSettings passwordinputsettings2 = new TL_account.passwordInputSettings();
            updatepasswordsettings.new_settings = passwordinputsettings2;
            int i = passwordinputsettings2.flags;
            passwordinputsettings2.flags = i | 1;
            passwordinputsettings2.hint = "";
            passwordinputsettings2.new_algo = this.currentPassword.new_algo;
            passwordinputsettings2.flags = i | 3;
            passwordinputsettings2.email = string2.trim();
            str = string2;
            str2 = string;
        }
        showEditDoneProgress(true, true);
        Utilities.globalQueue.postRunnable(new LinkManager$1$$ExternalSyntheticLambda0(this, z, str, str2, updatepasswordsettings));
    }

    private void sendSavedForm(Runnable runnable) {
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(true, true);
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = new TLRPC.TL_payments_validateRequestedInfo();
        this.validateRequest = tL_payments_validateRequestedInfo;
        TLRPC.InputInvoice inputInvoice = this.invoiceInput;
        if (inputInvoice != null) {
            tL_payments_validateRequestedInfo.invoice = inputInvoice;
        } else if (this.messageObject != null) {
            TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
            tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(this.messageObject.messageOwner.peer_id);
            tL_inputInvoiceMessage.msg_id = this.messageObject.getId();
            this.validateRequest.invoice = tL_inputInvoiceMessage;
        } else {
            TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
            tL_inputInvoiceSlug.slug = this.invoiceSlug;
            this.validateRequest.invoice = tL_inputInvoiceSlug;
        }
        TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
        tL_payments_validateRequestedInfo2.save = true;
        tL_payments_validateRequestedInfo2.info = this.paymentForm.saved_info;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new ProfileActivity$$ExternalSyntheticLambda2(this, runnable, tL_payments_validateRequestedInfo2, 3), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public void setAddressFields(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        if (tL_postAddress != null) {
            String str = tL_postAddress.street_line1;
            String str2 = tL_postAddress.street_line2;
            String str3 = tL_postAddress.city;
            String str4 = tL_postAddress.state;
            String str5 = tL_postAddress.country_iso2;
            String str6 = tL_postAddress.post_code;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" ");
            sb.append(str2);
            sb.append(", ");
            sb.append(str3);
            Fragment$$ExternalSyntheticOutline0.m(sb, ", ", str4, ", ", str5);
            this.detailSettingsCell[2].setTextAndValueAndIcon(Fragment$$ExternalSyntheticOutline0.m(sb, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), R.drawable.msg_payment_address, true);
        }
        this.detailSettingsCell[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            this.detailSettingsCell[3].setTextAndValueAndIcon(str7, LocaleController.getString(R.string.PaymentCheckoutName), R.drawable.msg_contacts, true);
        }
        this.detailSettingsCell[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            this.detailSettingsCell[4].setTextAndValueAndIcon(PhoneFormat.getInstance().format(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), R.drawable.msg_calls, (tL_paymentRequestedInfo.email == null && this.shippingOption == null) ? false : true);
        }
        this.detailSettingsCell[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            this.detailSettingsCell[5].setTextAndValueAndIcon(str8, LocaleController.getString(R.string.PaymentCheckoutEmail), R.drawable.msg_mention, this.shippingOption != null);
        }
        this.detailSettingsCell[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    private void setCurrentPassword(TL_account.Password password) {
        if (password == null || !password.has_password) {
            this.currentPassword = password;
            this.waitingForEmail = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            updatePasswordFields();
        } else {
            if (getParentActivity() == null) {
                return;
            }
            goToNextStep();
        }
    }

    private void setDelegate(PaymentFormActivityDelegate paymentFormActivityDelegate) {
        this.delegate = paymentFormActivityDelegate;
    }

    public void setDonePressed(boolean z) {
        this.donePressed = z;
        this.swipeBackEnabled = !z;
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && actionBar.getBackButton() != null) {
            this.actionBar.getBackButton().setEnabled(!this.donePressed);
        }
        TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[0];
        if (textDetailSettingsCell != null) {
            textDetailSettingsCell.setEnabled(!this.donePressed);
        }
    }

    private void setPaymentMethod(TLRPC.TL_paymentFormMethod tL_paymentFormMethod) {
        this.paymentFormMethod = tL_paymentFormMethod;
    }

    private void shakeField(int i) {
        shakeView(this.inputFields[i]);
    }

    private void shakeView(View view) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 2.5f);
    }

    private void showAlertWithText(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    private void showChoosePaymentMethod() {
        showChoosePaymentMethod(null);
    }

    public void showEditDoneProgress(boolean z, final boolean z2) {
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (!z || this.doneItem == null) {
            if (this.payTextView != null) {
                this.doneItemAnimation = new AnimatorSet();
                if (z2) {
                    this.progressViewButton.setVisibility(0);
                    this.bottomLayout.setEnabled(false);
                    AnimatorSet animatorSet2 = this.doneItemAnimation;
                    TextView textView = this.payTextView;
                    Property property = View.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.1f);
                    TextView textView2 = this.payTextView;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.1f);
                    TextView textView3 = this.payTextView;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property3, 1.0f));
                } else {
                    this.payTextView.setVisibility(0);
                    this.bottomLayout.setEnabled(true);
                    AnimatorSet animatorSet3 = this.doneItemAnimation;
                    ContextProgressView contextProgressView = this.progressViewButton;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(contextProgressView, (Property<ContextProgressView, Float>) property4, 0.1f);
                    ContextProgressView contextProgressView2 = this.progressViewButton;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(contextProgressView2, (Property<ContextProgressView, Float>) property5, 0.1f);
                    ContextProgressView contextProgressView3 = this.progressViewButton;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(contextProgressView3, (Property<ContextProgressView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property6, 1.0f));
                }
                this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animator) {
                        if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                            return;
                        }
                        PaymentFormActivity.this.doneItemAnimation = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                            return;
                        }
                        if (z2) {
                            PaymentFormActivity.this.payTextView.setVisibility(4);
                        } else {
                            PaymentFormActivity.this.progressViewButton.setVisibility(4);
                        }
                    }
                });
                this.doneItemAnimation.setDuration(150L);
                this.doneItemAnimation.start();
                return;
            }
            return;
        }
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.doneItemAnimation = animatorSet4;
        if (z2) {
            this.progressView.setVisibility(0);
            this.doneItem.setEnabled(false);
            AnimatorSet animatorSet5 = this.doneItemAnimation;
            View contentView = this.doneItem.getContentView();
            Property property7 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property7, 0.1f);
            View contentView2 = this.doneItem.getContentView();
            Property property8 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property8, 0.1f);
            View contentView3 = this.doneItem.getContentView();
            Property property9 = View.ALPHA;
            animatorSet5.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property9, 1.0f));
        } else if (this.webView != null) {
            animatorSet4.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 0.0f));
        } else {
            this.doneItem.getContentView().setVisibility(0);
            this.doneItem.setEnabled(true);
            AnimatorSet animatorSet6 = this.doneItemAnimation;
            ContextProgressView contextProgressView4 = this.progressView;
            Property property10 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(contextProgressView4, (Property<ContextProgressView, Float>) property10, 0.1f);
            ContextProgressView contextProgressView5 = this.progressView;
            Property property11 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(contextProgressView5, (Property<ContextProgressView, Float>) property11, 0.1f);
            ContextProgressView contextProgressView6 = this.progressView;
            Property property12 = View.ALPHA;
            animatorSet6.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(contextProgressView6, (Property<ContextProgressView, Float>) property12, 0.0f));
            if (!isFinishing()) {
                this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property12, 1.0f));
            }
        }
        this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                    return;
                }
                PaymentFormActivity.this.doneItemAnimation = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                    return;
                }
                if (z2) {
                    PaymentFormActivity.this.doneItem.getContentView().setVisibility(4);
                } else {
                    PaymentFormActivity.this.progressView.setVisibility(4);
                }
            }
        });
        this.doneItemAnimation.setDuration(150L);
        this.doneItemAnimation.start();
    }

    private void showPayAlert(String str) {
        int i = 1;
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(LocaleController.getString(R.string.PaymentTransactionReview));
        SendMessagesHelper$$ExternalSyntheticOutline0.m("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, new Object[]{str, this.currentBotName, this.currentItemName}, builder);
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new PaymentFormActivity$$ExternalSyntheticLambda0(this, i));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    private void updatePasswordFields() {
        int i = 0;
        if (this.currentStep != 6 || this.bottomCell[2] == null) {
            return;
        }
        this.doneItem.setVisibility(0);
        if (this.currentPassword == null) {
            showEditDoneProgress(true, true);
            this.bottomCell[2].setVisibility(8);
            this.settingsCell[0].setVisibility(8);
            this.settingsCell[1].setVisibility(8);
            this.codeFieldCell.setVisibility(8);
            this.headerCell[0].setVisibility(8);
            this.headerCell[1].setVisibility(8);
            this.bottomCell[0].setVisibility(8);
            for (int i2 = 0; i2 < 3; i2++) {
                ((View) this.inputFields[i2].getParent()).setVisibility(8);
            }
            while (i < this.dividers.size()) {
                this.dividers.get(i).setVisibility(8);
                i++;
            }
            return;
        }
        showEditDoneProgress(true, false);
        if (!this.waitingForEmail) {
            this.bottomCell[2].setVisibility(8);
            this.settingsCell[0].setVisibility(8);
            this.settingsCell[1].setVisibility(8);
            this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
            this.codeFieldCell.setVisibility(8);
            this.headerCell[0].setVisibility(0);
            this.headerCell[1].setVisibility(0);
            this.bottomCell[0].setVisibility(0);
            for (int i3 = 0; i3 < 3; i3++) {
                ((View) this.inputFields[i3].getParent()).setVisibility(0);
            }
            for (int i4 = 0; i4 < this.dividers.size(); i4++) {
                this.dividers.get(i4).setVisibility(0);
            }
            return;
        }
        TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[2];
        int i5 = R.string.EmailPasswordConfirmText2;
        String str = this.currentPassword.email_unconfirmed_pattern;
        if (str == null) {
            str = "";
        }
        textInfoPrivacyCell.setText(LocaleController.formatString("EmailPasswordConfirmText2", i5, str));
        this.bottomCell[2].setVisibility(0);
        this.settingsCell[0].setVisibility(0);
        this.settingsCell[1].setVisibility(0);
        this.codeFieldCell.setVisibility(0);
        this.bottomCell[1].setText("");
        this.headerCell[0].setVisibility(8);
        this.headerCell[1].setVisibility(8);
        this.bottomCell[0].setVisibility(8);
        for (int i6 = 0; i6 < 3; i6++) {
            ((View) this.inputFields[i6].getParent()).setVisibility(8);
        }
        while (i < this.dividers.size()) {
            this.dividers.get(i).setVisibility(8);
            i++;
        }
    }

    public void updateSavePaymentField() {
        if (this.bottomCell[0] == null || this.sectionCell[2] == null) {
            return;
        }
        TLRPC.PaymentForm paymentForm = this.paymentForm;
        if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.webView != null && this.webviewLoading)) {
            this.checkCell1.setVisibility(8);
            this.bottomCell[0].setVisibility(8);
            ShadowSectionCell shadowSectionCell = this.sectionCell[2];
            shadowSectionCell.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
        if (this.paymentForm.password_missing) {
            loadPasswordInfo();
            spannableStringBuilder.append((CharSequence) "\n");
            int length = spannableStringBuilder.length();
            String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            spannableStringBuilder.append((CharSequence) string);
            if (iIndexOf != -1 && iLastIndexOf != -1) {
                int i = iIndexOf + length;
                int i2 = iLastIndexOf + length;
                this.bottomCell[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new LinkSpan(), i, i2 - 1, 33);
            }
        }
        this.checkCell1.setEnabled(true);
        this.bottomCell[0].setText(spannableStringBuilder);
        this.checkCell1.setVisibility(0);
        this.bottomCell[0].setVisibility(0);
        ShadowSectionCell shadowSectionCell2 = this.sectionCell[2];
        shadowSectionCell2.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell2.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
    }

    public void updateTotalPrice() {
        this.totalPrice[0] = getTotalPriceString(this.prices);
        this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
        TextView textView = this.payTextView;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.totalPrice[0]));
        }
        if (this.tipLayout != null) {
            int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
            int childCount = this.tipLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) this.tipLayout.getChildAt(i);
                if (textView2.getTag().equals(this.tipAmount)) {
                    Theme.setDrawableColor(themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(Theme.key_contacts_inviteText));
                } else {
                    Theme.setDrawableColor(536870911 & themedColor, textView2.getBackground());
                    textView2.setTextColor(getThemedColor(Theme.key_chats_secretName));
                }
                textView2.invalidate();
            }
        }
    }

    @Override
    public View createView(Context context) {
        char c;
        Context context2;
        ?? r14;
        String str;
        String name;
        char c2;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        int i;
        FrameLayout frameLayout;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        char c3;
        int i7;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        String upperCase;
        String str2;
        int i8;
        ViewGroup viewGroup;
        int i9;
        int i10;
        String str3;
        TLRPC.TL_invoice tL_invoice;
        TLRPC.User user;
        int i11;
        String name2;
        boolean z;
        boolean z2;
        TLRPC.User user2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7;
        TLRPC.TL_postAddress tL_postAddress5;
        String str4;
        String str5;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8;
        TLRPC.TL_postAddress tL_postAddress6;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9;
        String str6;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10;
        String str7;
        ViewGroup viewGroup2;
        int i12 = 10;
        int i13 = 6;
        final int i14 = 3;
        final int i15 = 0;
        switch (this.currentStep) {
            case 0:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingInfo));
                break;
            case 1:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentShippingMethod));
                break;
            case 2:
            case 3:
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentFormMethod;
                if (tL_paymentFormMethod == null || TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
                } else {
                    this.actionBar.setTitle(this.paymentFormMethod.title);
                }
                break;
            case 4:
                if (this.paymentForm.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentCheckout));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCheckout));
                }
                break;
            case 5:
                if (this.paymentForm.invoice.test) {
                    this.actionBar.setTitle("Test " + LocaleController.getString(R.string.PaymentReceipt));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentReceipt));
                }
                break;
            case 6:
                this.actionBar.setTitle(LocaleController.getString(R.string.PaymentPassword));
                break;
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i16) {
                if (i16 == -1) {
                    if (PaymentFormActivity.this.donePressed) {
                        return;
                    }
                    PaymentFormActivity.this.finishFragment();
                    return;
                }
                if (i16 != 1 || PaymentFormActivity.this.donePressed) {
                    return;
                }
                if (PaymentFormActivity.this.currentStep != 3) {
                    AndroidUtilities.hideKeyboard(PaymentFormActivity.this.getParentActivity().getCurrentFocus());
                }
                int i17 = PaymentFormActivity.this.currentStep;
                if (i17 == 0) {
                    PaymentFormActivity.this.setDonePressed(true);
                    PaymentFormActivity.this.sendForm();
                    return;
                }
                if (i17 == 1) {
                    for (int i18 = 0; i18 < PaymentFormActivity.this.radioCells.length; i18++) {
                        if (PaymentFormActivity.this.radioCells[i18].isChecked()) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.shippingOption = paymentFormActivity.requestedInfo.shipping_options.get(i18);
                            break;
                        }
                    }
                    PaymentFormActivity.this.goToNextStep();
                    return;
                }
                if (i17 == 2) {
                    PaymentFormActivity.this.sendCardData();
                } else if (i17 == 3) {
                    PaymentFormActivity.this.checkPassword();
                } else {
                    if (i17 != 6) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i16 = this.currentStep;
        int i17 = -1;
        if (i16 == 0 || i16 == 1 || i16 == 2 || i16 == 3 || i16 == 4 || i16 == 6) {
            c = 2;
            this.doneItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            ContextProgressView contextProgressView = new ContextProgressView(context, 1);
            this.progressView = contextProgressView;
            contextProgressView.setAlpha(0.0f);
            this.progressView.setScaleX(0.1f);
            this.progressView.setScaleY(0.1f);
            this.progressView.setVisibility(4);
            this.doneItem.addView(this.progressView, LayoutHelper.createFrame(-1, -1.0f));
        } else {
            c = 2;
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor(Theme.key_actionBarDefault));
        frameLayout2.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentStep == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout2.setClipChildren(false);
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        int i18 = this.currentStep;
        String str8 = "";
        if (i18 == 0) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            try {
                c3 = 1;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            String[] strArrSplit = line.split(";");
                            this.countriesArray.add(0, strArrSplit[c]);
                            this.countriesMap.put(strArrSplit[c], strArrSplit[0]);
                            this.codesMap.put(strArrSplit[0], strArrSplit[c]);
                            map2.put(strArrSplit[1], strArrSplit[c]);
                            if (strArrSplit.length > 3) {
                                this.phoneFormatMap.put(strArrSplit[0], strArrSplit[3]);
                            }
                            map.put(strArrSplit[1], strArrSplit[c]);
                        } else {
                            bufferedReader.close();
                        }
                        Collections.sort(this.countriesArray, new OAuthSheet$$ExternalSyntheticLambda10(15));
                        this.inputFields = new EditTextBoldCursor[10];
                        int i19 = 0;
                        while (i19 < 10) {
                            if (i19 == 0) {
                                this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                                this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                this.headerCell[0].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                                this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(i17, -2));
                            } else if (i19 == i13) {
                                this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                                this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(i17, -2));
                                this.headerCell[c3] = new HeaderCell(context, this.resourcesProvider);
                                this.headerCell[c3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                this.headerCell[c3].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                                this.linearLayout2.addView(this.headerCell[c3], LayoutHelper.createLinear(i17, -2));
                            }
                            if (i19 == 8) {
                                LinearLayout linearLayout2 = new LinearLayout(context);
                                linearLayout2.setClipChildren(false);
                                linearLayout2.setOrientation(0);
                                this.linearLayout2.addView(linearLayout2, LayoutHelper.createLinear(i17, 50));
                                linearLayout2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                viewGroup2 = linearLayout2;
                            } else {
                                if (i19 == 9) {
                                    viewGroup2 = (ViewGroup) this.inputFields[8].getParent();
                                } else {
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setClipChildren(false);
                                    this.linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(i17, 50));
                                    int i20 = Theme.key_windowBackgroundWhite;
                                    frameLayout3.setBackgroundColor(getThemedColor(i20));
                                    boolean z3 = i19 != 5;
                                    if (z3) {
                                        if (i19 != 7 || this.paymentForm.invoice.phone_requested) {
                                            if (i19 == i13) {
                                                TLRPC.TL_invoice tL_invoice2 = this.paymentForm.invoice;
                                                if (!tL_invoice2.phone_requested && !tL_invoice2.email_requested) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                    }
                                    if (z3) {
                                        View view = new View(context) {
                                            @Override
                                            public void onDraw(Canvas canvas) {
                                                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                            }
                                        };
                                        view.setBackgroundColor(getThemedColor(i20));
                                        this.dividers.add(view);
                                        frameLayout3.addView(view, new FrameLayout.LayoutParams(i17, 1, 83));
                                    }
                                    i8 = 9;
                                    viewGroup = frameLayout3;
                                }
                                if (i19 == i8) {
                                    this.inputFields[i19] = new HintEditText(context);
                                } else {
                                    this.inputFields[i19] = new EditTextBoldCursor(context);
                                }
                                this.inputFields[i19].setTag(Integer.valueOf(i19));
                                this.inputFields[i19].setTextSize(1, 16.0f);
                                this.inputFields[i19].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                                EditTextBoldCursor editTextBoldCursor = this.inputFields[i19];
                                i9 = Theme.key_windowBackgroundWhiteBlackText;
                                editTextBoldCursor.setTextColor(getThemedColor(i9));
                                this.inputFields[i19].setBackgroundDrawable(null);
                                this.inputFields[i19].setCursorColor(getThemedColor(i9));
                                this.inputFields[i19].setCursorSize(AndroidUtilities.dp(20.0f));
                                this.inputFields[i19].setCursorWidth(1.5f);
                                if (i19 == 4) {
                                    this.inputFields[i19].setOnTouchListener(new View.OnTouchListener(this) {
                                        public final PaymentFormActivity f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override
                                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                            switch (i15) {
                                                case 0:
                                                    return this.f$0.lambda$createView$1(view2, motionEvent);
                                                default:
                                                    return this.f$0.lambda$createView$6(view2, motionEvent);
                                            }
                                        }
                                    });
                                    this.inputFields[i19].setInputType(0);
                                }
                                if (i19 != 9 || i19 == 8) {
                                    this.inputFields[i19].setInputType(i14);
                                } else if (i19 == 7) {
                                    this.inputFields[i19].setInputType(1);
                                } else {
                                    this.inputFields[i19].setInputType(16385);
                                }
                                this.inputFields[i19].setImeOptions(268435461);
                                switch (i19) {
                                    case 0:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                        tL_paymentRequestedInfo3 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo3 != null && (tL_postAddress = tL_paymentRequestedInfo3.shipping_address) != null) {
                                            this.inputFields[i19].setText(tL_postAddress.street_line1);
                                        }
                                        break;
                                    case 1:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                        tL_paymentRequestedInfo4 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo4 != null && (tL_postAddress2 = tL_paymentRequestedInfo4.shipping_address) != null) {
                                            this.inputFields[i19].setText(tL_postAddress2.street_line2);
                                        }
                                        break;
                                    case 2:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                        tL_paymentRequestedInfo5 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo5 != null && (tL_postAddress3 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                            this.inputFields[i19].setText(tL_postAddress3.city);
                                        }
                                        break;
                                    case 3:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                        tL_paymentRequestedInfo6 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo6 != null && (tL_postAddress4 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                            this.inputFields[i19].setText(tL_postAddress4.state);
                                        }
                                        break;
                                    case 4:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                        tL_paymentRequestedInfo7 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo7 != null && (tL_postAddress5 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                            str4 = (String) map2.get(tL_postAddress5.country_iso2);
                                            str5 = this.paymentForm.saved_info.shipping_address.country_iso2;
                                            this.countryName = str5;
                                            EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i19];
                                            if (str4 == null) {
                                                str4 = str5;
                                            }
                                            editTextBoldCursor2.setText(str4);
                                        }
                                        break;
                                    case 5:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                        tL_paymentRequestedInfo8 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo8 != null && (tL_postAddress6 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                            this.inputFields[i19].setText(tL_postAddress6.post_code);
                                        }
                                        break;
                                    case 6:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                        tL_paymentRequestedInfo9 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo9 != null && (str6 = tL_paymentRequestedInfo9.name) != null) {
                                            this.inputFields[i19].setText(str6);
                                        }
                                        break;
                                    case 7:
                                        this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                        tL_paymentRequestedInfo10 = this.paymentForm.saved_info;
                                        if (tL_paymentRequestedInfo10 != null && (str7 = tL_paymentRequestedInfo10.email) != null) {
                                            this.inputFields[i19].setText(str7);
                                        }
                                        break;
                                }
                                EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i19];
                                editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                                if (i19 == 8) {
                                    TextView textView = new TextView(context);
                                    this.textView = textView;
                                    textView.setText("+");
                                    this.textView.setTextColor(getThemedColor(i9));
                                    this.textView.setTextSize(1, 16.0f);
                                    viewGroup.addView(this.textView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                                    this.inputFields[i19].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                                    this.inputFields[i19].setGravity(19);
                                    this.inputFields[i19].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                                    viewGroup.addView(this.inputFields[i19], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                                    this.inputFields[i19].addTextChangedListener(new TextWatcher() {
                                        @Override
                                        public void afterTextChanged(Editable editable) {
                                            String str9;
                                            boolean z4;
                                            String str10;
                                            if (PaymentFormActivity.this.ignoreOnTextChange) {
                                                return;
                                            }
                                            PaymentFormActivity.this.ignoreOnTextChange = true;
                                            String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PaymentFormActivity.this.inputFields[8].getText().toString(), false);
                                            PaymentFormActivity.this.inputFields[8].setText(strStripExceptNumbers);
                                            HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                            if (strStripExceptNumbers.length() == 0) {
                                                hintEditText.setHintText((String) null);
                                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                            } else {
                                                int i21 = 4;
                                                if (strStripExceptNumbers.length() > 4) {
                                                    while (true) {
                                                        if (i21 < 1) {
                                                            str9 = null;
                                                            z4 = false;
                                                            break;
                                                        }
                                                        String strSubstring = strStripExceptNumbers.substring(0, i21);
                                                        if (((String) PaymentFormActivity.this.codesMap.get(strSubstring)) != null) {
                                                            String str11 = strStripExceptNumbers.substring(i21) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                            PaymentFormActivity.this.inputFields[8].setText(strSubstring);
                                                            str9 = str11;
                                                            strStripExceptNumbers = strSubstring;
                                                            z4 = true;
                                                            break;
                                                        }
                                                        i21--;
                                                    }
                                                    if (!z4) {
                                                        str9 = strStripExceptNumbers.substring(1) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                        EditTextBoldCursor editTextBoldCursor4 = PaymentFormActivity.this.inputFields[8];
                                                        strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                                        editTextBoldCursor4.setText(strStripExceptNumbers);
                                                    }
                                                } else {
                                                    str9 = null;
                                                    z4 = false;
                                                }
                                                String str12 = (String) PaymentFormActivity.this.codesMap.get(strStripExceptNumbers);
                                                if (str12 == null || PaymentFormActivity.this.countriesArray.indexOf(str12) == -1 || (str10 = (String) PaymentFormActivity.this.phoneFormatMap.get(strStripExceptNumbers)) == null) {
                                                    hintEditText.setHintText((String) null);
                                                    hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                                } else {
                                                    hintEditText.setHintText(str10.replace('X', (char) 8211));
                                                    hintEditText.setHint((CharSequence) null);
                                                }
                                                if (!z4) {
                                                    PaymentFormActivity.this.inputFields[8].setSelection(PaymentFormActivity.this.inputFields[8].getText().length());
                                                }
                                                if (str9 != null) {
                                                    hintEditText.requestFocus();
                                                    hintEditText.setText(str9);
                                                    hintEditText.setSelection(hintEditText.length());
                                                }
                                            }
                                            PaymentFormActivity.this.ignoreOnTextChange = false;
                                        }

                                        @Override
                                        public void beforeTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                        }

                                        @Override
                                        public void onTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                        }
                                    });
                                } else if (i19 == 9) {
                                    this.inputFields[i19].setPadding(0, 0, 0, 0);
                                    this.inputFields[i19].setGravity(19);
                                    viewGroup.addView(this.inputFields[i19], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                                    this.inputFields[i19].addTextChangedListener(new TextWatcher() {
                                        private int actionPosition;
                                        private int characterAction = -1;

                                        @Override
                                        public void afterTextChanged(Editable editable) {
                                            int i21;
                                            int i22;
                                            if (PaymentFormActivity.this.ignoreOnPhoneChange) {
                                                return;
                                            }
                                            HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                            int selectionStart = hintEditText.getSelectionStart();
                                            String string = hintEditText.getText().toString();
                                            if (this.characterAction == 3) {
                                                string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                                selectionStart--;
                                            }
                                            StringBuilder sb = new StringBuilder(string.length());
                                            int i23 = 0;
                                            while (i23 < string.length()) {
                                                int i24 = i23 + 1;
                                                String strSubstring = string.substring(i23, i24);
                                                if ("0123456789".contains(strSubstring)) {
                                                    sb.append(strSubstring);
                                                }
                                                i23 = i24;
                                            }
                                            PaymentFormActivity.this.ignoreOnPhoneChange = true;
                                            String hintText = hintEditText.getHintText();
                                            if (hintText != null) {
                                                int i25 = 0;
                                                while (i25 < sb.length()) {
                                                    if (i25 >= hintText.length()) {
                                                        sb.insert(i25, ' ');
                                                        if (selectionStart == i25 + 1 && (i21 = this.characterAction) != 2 && i21 != 3) {
                                                            selectionStart++;
                                                            break;
                                                        } else {
                                                            break;
                                                            break;
                                                            break;
                                                        }
                                                    }
                                                    if (hintText.charAt(i25) == ' ') {
                                                        sb.insert(i25, ' ');
                                                        i25++;
                                                        if (selectionStart == i25 && (i22 = this.characterAction) != 2 && i22 != 3) {
                                                            selectionStart++;
                                                        }
                                                    }
                                                    i25++;
                                                }
                                            }
                                            hintEditText.setText(sb);
                                            if (selectionStart >= 0) {
                                                hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                                            }
                                            hintEditText.onTextChange();
                                            PaymentFormActivity.this.ignoreOnPhoneChange = false;
                                        }

                                        @Override
                                        public void beforeTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                            if (i22 == 0 && i23 == 1) {
                                                this.characterAction = 1;
                                                return;
                                            }
                                            if (i22 != 1 || i23 != 0) {
                                                this.characterAction = -1;
                                            } else if (charSequence.charAt(i21) != ' ' || i21 <= 0) {
                                                this.characterAction = 2;
                                            } else {
                                                this.characterAction = 3;
                                                this.actionPosition = i21 - 1;
                                            }
                                        }

                                        @Override
                                        public void onTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                        }
                                    });
                                } else {
                                    this.inputFields[i19].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                                    EditTextBoldCursor editTextBoldCursor4 = this.inputFields[i19];
                                    if (LocaleController.isRTL) {
                                        i10 = 5;
                                    } else {
                                        i10 = 3;
                                    }
                                    editTextBoldCursor4.setGravity(i10);
                                    viewGroup.addView(this.inputFields[i19], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                                }
                                this.inputFields[i19].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                                    public final PaymentFormActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final boolean onEditorAction(TextView textView2, int i21, KeyEvent keyEvent) {
                                        switch (i14) {
                                            case 0:
                                                return this.f$0.lambda$createView$11(textView2, i21, keyEvent);
                                            case 1:
                                                return this.f$0.lambda$createView$25(textView2, i21, keyEvent);
                                            case 2:
                                                return this.f$0.lambda$createView$30(textView2, i21, keyEvent);
                                            case 3:
                                                return this.f$0.lambda$createView$2(textView2, i21, keyEvent);
                                            default:
                                                return this.f$0.lambda$createView$7(textView2, i21, keyEvent);
                                        }
                                    }
                                });
                                if (i19 == 9) {
                                    tL_invoice = this.paymentForm.invoice;
                                    if (!tL_invoice.email_to_provider || tL_invoice.phone_to_provider) {
                                        user = null;
                                        i11 = 0;
                                        while (i11 < this.paymentForm.users.size()) {
                                            user2 = this.paymentForm.users.get(i11);
                                            String str9 = str8;
                                            if (user2.id == this.paymentForm.provider_id) {
                                                user = user2;
                                            }
                                            i11++;
                                            str8 = str9;
                                        }
                                        str3 = str8;
                                        if (user != null) {
                                            name2 = ContactsController.formatName(user.first_name, user.last_name);
                                        } else {
                                            name2 = str3;
                                        }
                                        z = true;
                                        this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                        this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                        this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                        TLRPC.TL_invoice tL_invoice3 = this.paymentForm.invoice;
                                        z2 = tL_invoice3.email_to_provider;
                                        if (!z2 && tL_invoice3.phone_to_provider) {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, name2));
                                        } else if (z2) {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                        } else {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                        }
                                    } else {
                                        this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
                                        this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(i17, -2));
                                        str3 = str8;
                                        z = true;
                                    }
                                    TextCheckCell textCheckCell = new TextCheckCell(context, this.resourcesProvider);
                                    this.checkCell1 = textCheckCell;
                                    textCheckCell.setBackgroundDrawable(Theme.getSelectorDrawable(z));
                                    this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentShippingSave), this.saveShippingInfo, false);
                                    this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                                    this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, i12));
                                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                    this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                    this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                                } else {
                                    str3 = str8;
                                }
                                i19++;
                                str8 = str3;
                                i17 = -1;
                                i13 = 6;
                                i14 = 3;
                                c3 = 1;
                            }
                            i8 = 9;
                            viewGroup = viewGroup2;
                            if (i19 == i8) {
                                this.inputFields[i19] = new HintEditText(context);
                            } else {
                                this.inputFields[i19] = new EditTextBoldCursor(context);
                            }
                            this.inputFields[i19].setTag(Integer.valueOf(i19));
                            this.inputFields[i19].setTextSize(1, 16.0f);
                            this.inputFields[i19].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                            EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i19];
                            i9 = Theme.key_windowBackgroundWhiteBlackText;
                            editTextBoldCursor5.setTextColor(getThemedColor(i9));
                            this.inputFields[i19].setBackgroundDrawable(null);
                            this.inputFields[i19].setCursorColor(getThemedColor(i9));
                            this.inputFields[i19].setCursorSize(AndroidUtilities.dp(20.0f));
                            this.inputFields[i19].setCursorWidth(1.5f);
                            if (i19 == 4) {
                                this.inputFields[i19].setOnTouchListener(new View.OnTouchListener(this) {
                                    public final PaymentFormActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                        switch (i15) {
                                            case 0:
                                                return this.f$0.lambda$createView$1(view2, motionEvent);
                                            default:
                                                return this.f$0.lambda$createView$6(view2, motionEvent);
                                        }
                                    }
                                });
                                this.inputFields[i19].setInputType(0);
                            }
                            if (i19 != 9) {
                                this.inputFields[i19].setInputType(i14);
                            } else {
                                this.inputFields[i19].setInputType(i14);
                            }
                            this.inputFields[i19].setImeOptions(268435461);
                            switch (i19) {
                                case 0:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                    tL_paymentRequestedInfo3 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo3 != null) {
                                        this.inputFields[i19].setText(tL_postAddress.street_line1);
                                    }
                                    break;
                                case 1:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                    tL_paymentRequestedInfo4 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo4 != null) {
                                        this.inputFields[i19].setText(tL_postAddress2.street_line2);
                                    }
                                    break;
                                case 2:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                    tL_paymentRequestedInfo5 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo5 != null) {
                                        this.inputFields[i19].setText(tL_postAddress3.city);
                                    }
                                    break;
                                case 3:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                    tL_paymentRequestedInfo6 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo6 != null) {
                                        this.inputFields[i19].setText(tL_postAddress4.state);
                                    }
                                    break;
                                case 4:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                    tL_paymentRequestedInfo7 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo7 != null) {
                                        str4 = (String) map2.get(tL_postAddress5.country_iso2);
                                        str5 = this.paymentForm.saved_info.shipping_address.country_iso2;
                                        this.countryName = str5;
                                        EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i19];
                                        if (str4 == null) {
                                            str4 = str5;
                                        }
                                        editTextBoldCursor6.setText(str4);
                                    }
                                    break;
                                case 5:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                    tL_paymentRequestedInfo8 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo8 != null) {
                                        this.inputFields[i19].setText(tL_postAddress6.post_code);
                                    }
                                    break;
                                case 6:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                    tL_paymentRequestedInfo9 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo9 != null) {
                                        this.inputFields[i19].setText(str6);
                                    }
                                    break;
                                case 7:
                                    this.inputFields[i19].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                    tL_paymentRequestedInfo10 = this.paymentForm.saved_info;
                                    if (tL_paymentRequestedInfo10 != null) {
                                        this.inputFields[i19].setText(str7);
                                    }
                                    break;
                            }
                            EditTextBoldCursor editTextBoldCursor7 = this.inputFields[i19];
                            editTextBoldCursor7.setSelection(editTextBoldCursor7.length());
                            if (i19 == 8) {
                                TextView textView2 = new TextView(context);
                                this.textView = textView2;
                                textView2.setText("+");
                                this.textView.setTextColor(getThemedColor(i9));
                                this.textView.setTextSize(1, 16.0f);
                                viewGroup.addView(this.textView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                                this.inputFields[i19].setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
                                this.inputFields[i19].setGravity(19);
                                this.inputFields[i19].setFilters(new InputFilter[]{new InputFilter.LengthFilter(5)});
                                viewGroup.addView(this.inputFields[i19], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                                this.inputFields[i19].addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        String str10;
                                        boolean z4;
                                        String str11;
                                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                                            return;
                                        }
                                        PaymentFormActivity.this.ignoreOnTextChange = true;
                                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PaymentFormActivity.this.inputFields[8].getText().toString(), false);
                                        PaymentFormActivity.this.inputFields[8].setText(strStripExceptNumbers);
                                        HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                        if (strStripExceptNumbers.length() == 0) {
                                            hintEditText.setHintText((String) null);
                                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                        } else {
                                            int i21 = 4;
                                            if (strStripExceptNumbers.length() > 4) {
                                                while (true) {
                                                    if (i21 < 1) {
                                                        str10 = null;
                                                        z4 = false;
                                                        break;
                                                    }
                                                    String strSubstring = strStripExceptNumbers.substring(0, i21);
                                                    if (((String) PaymentFormActivity.this.codesMap.get(strSubstring)) != null) {
                                                        String str12 = strStripExceptNumbers.substring(i21) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                        PaymentFormActivity.this.inputFields[8].setText(strSubstring);
                                                        str10 = str12;
                                                        strStripExceptNumbers = strSubstring;
                                                        z4 = true;
                                                        break;
                                                    }
                                                    i21--;
                                                }
                                                if (!z4) {
                                                    str10 = strStripExceptNumbers.substring(1) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                    EditTextBoldCursor editTextBoldCursor8 = PaymentFormActivity.this.inputFields[8];
                                                    strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                                    editTextBoldCursor8.setText(strStripExceptNumbers);
                                                }
                                            } else {
                                                str10 = null;
                                                z4 = false;
                                            }
                                            String str13 = (String) PaymentFormActivity.this.codesMap.get(strStripExceptNumbers);
                                            if (str13 == null || PaymentFormActivity.this.countriesArray.indexOf(str13) == -1 || (str11 = (String) PaymentFormActivity.this.phoneFormatMap.get(strStripExceptNumbers)) == null) {
                                                hintEditText.setHintText((String) null);
                                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                            } else {
                                                hintEditText.setHintText(str11.replace('X', (char) 8211));
                                                hintEditText.setHint((CharSequence) null);
                                            }
                                            if (!z4) {
                                                PaymentFormActivity.this.inputFields[8].setSelection(PaymentFormActivity.this.inputFields[8].getText().length());
                                            }
                                            if (str10 != null) {
                                                hintEditText.requestFocus();
                                                hintEditText.setText(str10);
                                                hintEditText.setSelection(hintEditText.length());
                                            }
                                        }
                                        PaymentFormActivity.this.ignoreOnTextChange = false;
                                    }

                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                    }
                                });
                            } else if (i19 == 9) {
                                this.inputFields[i19].setPadding(0, 0, 0, 0);
                                this.inputFields[i19].setGravity(19);
                                viewGroup.addView(this.inputFields[i19], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                                this.inputFields[i19].addTextChangedListener(new TextWatcher() {
                                    private int actionPosition;
                                    private int characterAction = -1;

                                    @Override
                                    public void afterTextChanged(Editable editable) {
                                        int i21;
                                        int i22;
                                        if (PaymentFormActivity.this.ignoreOnPhoneChange) {
                                            return;
                                        }
                                        HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                        int selectionStart = hintEditText.getSelectionStart();
                                        String string = hintEditText.getText().toString();
                                        if (this.characterAction == 3) {
                                            string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                            selectionStart--;
                                        }
                                        StringBuilder sb = new StringBuilder(string.length());
                                        int i23 = 0;
                                        while (i23 < string.length()) {
                                            int i24 = i23 + 1;
                                            String strSubstring = string.substring(i23, i24);
                                            if ("0123456789".contains(strSubstring)) {
                                                sb.append(strSubstring);
                                            }
                                            i23 = i24;
                                        }
                                        PaymentFormActivity.this.ignoreOnPhoneChange = true;
                                        String hintText = hintEditText.getHintText();
                                        if (hintText != null) {
                                            int i25 = 0;
                                            while (i25 < sb.length()) {
                                                if (i25 >= hintText.length()) {
                                                    sb.insert(i25, ' ');
                                                    if (selectionStart == i25 + 1 && (i21 = this.characterAction) != 2 && i21 != 3) {
                                                        selectionStart++;
                                                        break;
                                                    } else {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                if (hintText.charAt(i25) == ' ') {
                                                    sb.insert(i25, ' ');
                                                    i25++;
                                                    if (selectionStart == i25 && (i22 = this.characterAction) != 2 && i22 != 3) {
                                                        selectionStart++;
                                                    }
                                                }
                                                i25++;
                                            }
                                        }
                                        hintEditText.setText(sb);
                                        if (selectionStart >= 0) {
                                            hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                                        }
                                        hintEditText.onTextChange();
                                        PaymentFormActivity.this.ignoreOnPhoneChange = false;
                                    }

                                    @Override
                                    public void beforeTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                        if (i22 == 0 && i23 == 1) {
                                            this.characterAction = 1;
                                            return;
                                        }
                                        if (i22 != 1 || i23 != 0) {
                                            this.characterAction = -1;
                                        } else if (charSequence.charAt(i21) != ' ' || i21 <= 0) {
                                            this.characterAction = 2;
                                        } else {
                                            this.characterAction = 3;
                                            this.actionPosition = i21 - 1;
                                        }
                                    }

                                    @Override
                                    public void onTextChanged(CharSequence charSequence, int i21, int i22, int i23) {
                                    }
                                });
                            } else {
                                this.inputFields[i19].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                                EditTextBoldCursor editTextBoldCursor8 = this.inputFields[i19];
                                if (LocaleController.isRTL) {
                                    i10 = 5;
                                } else {
                                    i10 = 3;
                                }
                                editTextBoldCursor8.setGravity(i10);
                                viewGroup.addView(this.inputFields[i19], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            }
                            this.inputFields[i19].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                                public final PaymentFormActivity f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final boolean onEditorAction(TextView textView3, int i21, KeyEvent keyEvent) {
                                    switch (i14) {
                                        case 0:
                                            return this.f$0.lambda$createView$11(textView3, i21, keyEvent);
                                        case 1:
                                            return this.f$0.lambda$createView$25(textView3, i21, keyEvent);
                                        case 2:
                                            return this.f$0.lambda$createView$30(textView3, i21, keyEvent);
                                        case 3:
                                            return this.f$0.lambda$createView$2(textView3, i21, keyEvent);
                                        default:
                                            return this.f$0.lambda$createView$7(textView3, i21, keyEvent);
                                    }
                                }
                            });
                            if (i19 == 9) {
                                tL_invoice = this.paymentForm.invoice;
                                if (tL_invoice.email_to_provider) {
                                    user = null;
                                    i11 = 0;
                                    while (i11 < this.paymentForm.users.size()) {
                                        user2 = this.paymentForm.users.get(i11);
                                        String str10 = str8;
                                        if (user2.id == this.paymentForm.provider_id) {
                                            user = user2;
                                        }
                                        i11++;
                                        str8 = str10;
                                    }
                                    str3 = str8;
                                    if (user != null) {
                                        name2 = ContactsController.formatName(user.first_name, user.last_name);
                                    } else {
                                        name2 = str3;
                                    }
                                    z = true;
                                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                    TLRPC.TL_invoice tL_invoice4 = this.paymentForm.invoice;
                                    z2 = tL_invoice4.email_to_provider;
                                    if (!z2) {
                                        if (z2) {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                        } else {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                        }
                                    } else if (z2) {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                    } else {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                    }
                                } else {
                                    user = null;
                                    i11 = 0;
                                    while (i11 < this.paymentForm.users.size()) {
                                        user2 = this.paymentForm.users.get(i11);
                                        String str11 = str8;
                                        if (user2.id == this.paymentForm.provider_id) {
                                            user = user2;
                                        }
                                        i11++;
                                        str8 = str11;
                                    }
                                    str3 = str8;
                                    if (user != null) {
                                        name2 = ContactsController.formatName(user.first_name, user.last_name);
                                    } else {
                                        name2 = str3;
                                    }
                                    z = true;
                                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                    TLRPC.TL_invoice tL_invoice5 = this.paymentForm.invoice;
                                    z2 = tL_invoice5.email_to_provider;
                                    if (!z2) {
                                        if (z2) {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                        } else {
                                            this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                        }
                                    } else if (z2) {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                    } else {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                    }
                                }
                                TextCheckCell textCheckCell2 = new TextCheckCell(context, this.resourcesProvider);
                                this.checkCell1 = textCheckCell2;
                                textCheckCell2.setBackgroundDrawable(Theme.getSelectorDrawable(z));
                                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentShippingSave), this.saveShippingInfo, false);
                                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                                this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, i12));
                                this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                                this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                            } else {
                                str3 = str8;
                            }
                            i19++;
                            str8 = str3;
                            i17 = -1;
                            i13 = 6;
                            i14 = 3;
                            c3 = 1;
                        }
                        if (this.paymentForm.invoice.name_requested) {
                            i7 = 8;
                        } else {
                            i7 = 8;
                            ((ViewGroup) this.inputFields[6].getParent()).setVisibility(8);
                        }
                        if (!this.paymentForm.invoice.phone_requested) {
                            ((ViewGroup) this.inputFields[i7].getParent()).setVisibility(i7);
                        }
                        if (!this.paymentForm.invoice.email_requested) {
                            ((ViewGroup) this.inputFields[7].getParent()).setVisibility(i7);
                        }
                        TLRPC.TL_invoice tL_invoice6 = this.paymentForm.invoice;
                        if (tL_invoice6.phone_requested) {
                            this.inputFields[9].setImeOptions(268435462);
                        } else if (tL_invoice6.email_requested) {
                            this.inputFields[7].setImeOptions(268435462);
                        } else if (tL_invoice6.name_requested) {
                            this.inputFields[6].setImeOptions(268435462);
                        } else {
                            this.inputFields[5].setImeOptions(268435462);
                        }
                        ShadowSectionCell shadowSectionCell = this.sectionCell[1];
                        if (shadowSectionCell != null) {
                            TLRPC.TL_invoice tL_invoice7 = this.paymentForm.invoice;
                            shadowSectionCell.setVisibility((tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
                        } else {
                            TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[1];
                            if (textInfoPrivacyCell != null) {
                                TLRPC.TL_invoice tL_invoice8 = this.paymentForm.invoice;
                                textInfoPrivacyCell.setVisibility((tL_invoice8.name_requested || tL_invoice8.phone_requested || tL_invoice8.email_requested) ? 0 : 8);
                            }
                        }
                        HeaderCell headerCell = this.headerCell[1];
                        TLRPC.TL_invoice tL_invoice9 = this.paymentForm.invoice;
                        headerCell.setVisibility((tL_invoice9.name_requested || tL_invoice9.phone_requested || tL_invoice9.email_requested) ? 0 : 8);
                        if (!this.paymentForm.invoice.shipping_address_requested) {
                            this.headerCell[0].setVisibility(8);
                            this.sectionCell[0].setVisibility(8);
                            ((ViewGroup) this.inputFields[0].getParent()).setVisibility(8);
                            ((ViewGroup) this.inputFields[1].getParent()).setVisibility(8);
                            ((ViewGroup) this.inputFields[c].getParent()).setVisibility(8);
                            ((ViewGroup) this.inputFields[3].getParent()).setVisibility(8);
                            ((ViewGroup) this.inputFields[4].getParent()).setVisibility(8);
                            ((ViewGroup) this.inputFields[5].getParent()).setVisibility(8);
                        }
                        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo11 = this.paymentForm.saved_info;
                        if (tL_paymentRequestedInfo11 == null || TextUtils.isEmpty(tL_paymentRequestedInfo11.phone)) {
                            fillNumber(null);
                        } else {
                            fillNumber(this.paymentForm.saved_info.phone);
                        }
                        if (this.inputFields[8].length() == 0) {
                            TLRPC.PaymentForm paymentForm3 = this.paymentForm;
                            if (paymentForm3.invoice.phone_requested && ((tL_paymentRequestedInfo2 = paymentForm3.saved_info) == null || TextUtils.isEmpty(tL_paymentRequestedInfo2.phone))) {
                                try {
                                    TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                                    upperCase = telephonyManager != null ? telephonyManager.getSimCountryIso().toUpperCase() : null;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                if (upperCase != null && (str2 = (String) map.get(upperCase)) != null && this.countriesArray.indexOf(str2) != -1) {
                                    this.inputFields[8].setText(this.countriesMap.get(str2));
                                }
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                }
            } catch (Exception e3) {
                e = e3;
                c3 = 1;
            }
        } else if (i18 == 2) {
            if (this.paymentForm.native_params != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.paymentForm.native_params.data);
                    String strOptString = jSONObject.optString("google_pay_public_key");
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.googlePayPublicKey = strOptString;
                    }
                    this.googlePayCountryCode = jSONObject.optString("acquirer_bank_country");
                    this.googlePayParameters = jSONObject.optJSONObject("gpay_parameters");
                } catch (Exception e4) {
                    FileLog.e(e4);
                }
            }
            if (this.isWebView || this.paymentFormMethod != null) {
                if (this.googlePayPublicKey != null || this.googlePayParameters != null) {
                    initGooglePay(context);
                }
                createGooglePayButton(context);
                this.linearLayout2.addView(this.googlePayContainer, LayoutHelper.createLinear(-1, 50));
                this.webviewLoading = true;
                showEditDoneProgress(true, true);
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                WebView webView = new WebView(context) {
                    @Override
                    public void onMeasure(int i21, int i22) {
                        super.onMeasure(i21, i22);
                    }

                    @Override
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        ((ViewGroup) PaymentFormActivity.this.fragmentView).requestDisallowInterceptTouchEvent(true);
                        return super.onTouchEvent(motionEvent);
                    }
                };
                this.webView = webView;
                webView.getSettings().setJavaScriptEnabled(true);
                this.webView.getSettings().setDomStorageEnabled(true);
                this.webView.getSettings().setSupportZoom(true);
                this.webView.getSettings().setBuiltInZoomControls(true);
                this.webView.getSettings().setDisplayZoomControls(false);
                this.webView.getSettings().setUseWideViewPort(true);
                this.webView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                this.webView.setWebViewClient(new AnonymousClass6(context));
                this.linearLayout2.addView(this.webView, LayoutHelper.createFrame(-1, -2.0f));
                this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                TextCheckCell textCheckCell3 = new TextCheckCell(context, this.resourcesProvider);
                this.checkCell1 = textCheckCell3;
                textCheckCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 12));
                this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                updateSavePaymentField();
                this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
            } else {
                if (this.paymentForm.native_params != null) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(this.paymentForm.native_params.data);
                        try {
                            this.need_card_country = jSONObject2.getBoolean("need_country");
                        } catch (Exception unused) {
                            this.need_card_country = false;
                        }
                        try {
                            this.need_card_postcode = jSONObject2.getBoolean("need_zip");
                        } catch (Exception unused2) {
                            this.need_card_postcode = false;
                        }
                        try {
                            this.need_card_name = jSONObject2.getBoolean("need_cardholder_name");
                        } catch (Exception unused3) {
                            this.need_card_name = false;
                        }
                        if (jSONObject2.has("public_token")) {
                            this.providerApiKey = jSONObject2.getString("public_token");
                        } else {
                            try {
                                this.providerApiKey = jSONObject2.getString("publishable_key");
                            } catch (Exception unused4) {
                                this.providerApiKey = "";
                            }
                        }
                        this.initGooglePay = !jSONObject2.optBoolean("google_pay_hidden", false);
                    } catch (Exception e5) {
                        FileLog.e(e5);
                    }
                }
                if (this.initGooglePay && ((!TextUtils.isEmpty(this.providerApiKey) && "stripe".equals(this.paymentForm.native_provider)) || this.googlePayParameters != null)) {
                    initGooglePay(context);
                }
                this.inputFields = new EditTextBoldCursor[6];
                int i21 = 0;
                for (int i22 = 6; i21 < i22; i22 = 6) {
                    if (i21 == 0) {
                        this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i21 == 4) {
                        this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    boolean z4 = (i21 == 3 || i21 == 5 || (i21 == 4 && !this.need_card_postcode)) ? false : true;
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    frameLayout4.setClipChildren(false);
                    int i23 = Theme.key_windowBackgroundWhite;
                    frameLayout4.setBackgroundColor(getThemedColor(i23));
                    this.linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(-1, 50));
                    this.inputFields[i21] = new EditTextBoldCursor(context);
                    this.inputFields[i21].setTag(Integer.valueOf(i21));
                    this.inputFields[i21].setTextSize(1, 16.0f);
                    this.inputFields[i21].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                    EditTextBoldCursor editTextBoldCursor9 = this.inputFields[i21];
                    int i24 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor9.setTextColor(getThemedColor(i24));
                    this.inputFields[i21].setBackgroundDrawable(null);
                    this.inputFields[i21].setCursorColor(getThemedColor(i24));
                    this.inputFields[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i21].setCursorWidth(1.5f);
                    if (i21 == 3) {
                        this.inputFields[i21].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                        this.inputFields[i21].setInputType(130);
                        this.inputFields[i21].setTypeface(Typeface.DEFAULT);
                        this.inputFields[i21].setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else if (i21 == 0) {
                        this.inputFields[i21].setInputType(3);
                    } else if (i21 == 4) {
                        final int i25 = 1;
                        this.inputFields[i21].setOnTouchListener(new View.OnTouchListener(this) {
                            public final PaymentFormActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                switch (i25) {
                                    case 0:
                                        return this.f$0.lambda$createView$1(view2, motionEvent);
                                    default:
                                        return this.f$0.lambda$createView$6(view2, motionEvent);
                                }
                            }
                        });
                        this.inputFields[i21].setInputType(0);
                    } else if (i21 == 1) {
                        this.inputFields[i21].setInputType(16386);
                    } else {
                        if (i21 == 2) {
                            this.inputFields[i21].setInputType(4097);
                        } else {
                            this.inputFields[i21].setInputType(16385);
                        }
                        this.inputFields[i21].setImeOptions(268435461);
                        if (i21 != 0) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i21 != 1) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i21 != 2) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i21 != 3) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i21 != 4) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i21 == 5) {
                            this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i21 == 0) {
                            this.inputFields[i21].addTextChangedListener(new TextWatcher() {
                                public static final int MAX_LENGTH_AMERICAN_EXPRESS = 15;
                                public static final int MAX_LENGTH_DINERS_CLUB = 14;
                                public static final int MAX_LENGTH_STANDARD = 16;
                                private int actionPosition;
                                public final String[] PREFIXES_15 = {"34", "37"};
                                public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                                public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                                private int characterAction = -1;

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    char c4;
                                    boolean z5;
                                    int i26;
                                    int i27;
                                    String[] strArr;
                                    int i28;
                                    String str12;
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    EditTextBoldCursor editTextBoldCursor10 = PaymentFormActivity.this.inputFields[0];
                                    int selectionStart = editTextBoldCursor10.getSelectionStart();
                                    String string = editTextBoldCursor10.getText().toString();
                                    int i29 = 1;
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i30 = 0;
                                    while (i30 < string.length()) {
                                        int i31 = i30 + 1;
                                        String strSubstring = string.substring(i30, i31);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i30 = i31;
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = true;
                                    String str13 = null;
                                    int i32 = 100;
                                    if (sb.length() > 0) {
                                        String string2 = sb.toString();
                                        int i33 = 0;
                                        while (true) {
                                            if (i33 >= 3) {
                                                c4 = 1;
                                                break;
                                            }
                                            if (i33 == 0) {
                                                strArr = this.PREFIXES_16;
                                                i28 = 16;
                                                str12 = "xxxx xxxx xxxx xxxx";
                                            } else if (i33 != i29) {
                                                strArr = this.PREFIXES_14;
                                                i28 = 14;
                                                str12 = "xxxx xxxx xxxx xx";
                                            } else {
                                                strArr = this.PREFIXES_15;
                                                i28 = 15;
                                                str12 = "xxxx xxxx xxxx xxx";
                                            }
                                            int i34 = 0;
                                            while (true) {
                                                if (i34 >= strArr.length) {
                                                    c4 = 1;
                                                    break;
                                                }
                                                String str14 = strArr[i34];
                                                c4 = 1;
                                                if (string2.length() <= str14.length()) {
                                                    if (str14.startsWith(string2)) {
                                                        i32 = i28;
                                                        str13 = str12;
                                                        break;
                                                    }
                                                    i34++;
                                                } else {
                                                    if (string2.startsWith(str14)) {
                                                        i32 = i28;
                                                        str13 = str12;
                                                        break;
                                                    }
                                                    i34++;
                                                }
                                            }
                                            if (str13 != null) {
                                                break;
                                            }
                                            i33++;
                                            i29 = 1;
                                        }
                                        if (sb.length() > i32) {
                                            sb.setLength(i32);
                                        }
                                    } else {
                                        c4 = 1;
                                    }
                                    if (str13 != null) {
                                        if (sb.length() == i32) {
                                            PaymentFormActivity.this.inputFields[c4].requestFocus();
                                        }
                                        editTextBoldCursor10.setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                        int i35 = 0;
                                        while (i35 < sb.length()) {
                                            if (i35 >= str13.length()) {
                                                sb.insert(i35, ' ');
                                                if (selectionStart == i35 + 1 && (i26 = this.characterAction) != 2 && i26 != 3) {
                                                    selectionStart++;
                                                    break;
                                                } else {
                                                    break;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (str13.charAt(i35) == ' ') {
                                                sb.insert(i35, ' ');
                                                i35++;
                                                if (selectionStart == i35 && (i27 = this.characterAction) != 2 && i27 != 3) {
                                                    selectionStart++;
                                                }
                                            }
                                            i35++;
                                        }
                                    }
                                    if (sb.toString().equals(editable.toString())) {
                                        z5 = false;
                                    } else {
                                        z5 = false;
                                        editable.replace(0, editable.length(), sb);
                                    }
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor10.setSelection(Math.min(selectionStart, editTextBoldCursor10.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = z5;
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i26, int i27, int i28) {
                                    if (i27 == 0 && i28 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i27 != 1 || i28 != 0) {
                                        this.characterAction = -1;
                                    } else if (charSequence.charAt(i26) != ' ' || i26 <= 0) {
                                        this.characterAction = 2;
                                    } else {
                                        this.characterAction = 3;
                                        this.actionPosition = i26 - 1;
                                    }
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i26, int i27, int i28) {
                                }
                            });
                        } else if (i21 == 1) {
                            this.inputFields[i21].addTextChangedListener(new TextWatcher() {
                                private int actionPosition;
                                private int characterAction = -1;
                                private boolean isYear;

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    boolean z5 = true;
                                    EditTextBoldCursor editTextBoldCursor10 = PaymentFormActivity.this.inputFields[1];
                                    int selectionStart = editTextBoldCursor10.getSelectionStart();
                                    String string = editTextBoldCursor10.getText().toString();
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i26 = 0;
                                    while (i26 < string.length()) {
                                        int i27 = i26 + 1;
                                        String strSubstring = string.substring(i26, i27);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i26 = i27;
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = true;
                                    PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    if (sb.length() > 4) {
                                        sb.setLength(4);
                                    }
                                    if (sb.length() < 2) {
                                        this.isYear = false;
                                    }
                                    if (this.isYear) {
                                        int i28 = sb.length() > 2 ? 2 : 1;
                                        String[] strArr = new String[i28];
                                        strArr[0] = sb.substring(0, 2);
                                        if (i28 == 2) {
                                            strArr[1] = sb.substring(2);
                                        }
                                        if (sb.length() == 4 && i28 == 2) {
                                            int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                            Calendar calendar = Calendar.getInstance();
                                            boolean z6 = UserConfig.getInstance(((BaseFragment) PaymentFormActivity.this).currentAccount).getClientPhone().startsWith("7") || (PaymentFormActivity.this.country != null && PaymentFormActivity.this.country.code.equals("7"));
                                            int i29 = z6 ? 2022 : calendar.get(1);
                                            int i30 = z6 ? 1 : calendar.get(2) + 1;
                                            if (iIntValue2 < i29 || (iIntValue2 == i29 && iIntValue < i30)) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z5 = false;
                                            }
                                        } else {
                                            int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            if (iIntValue3 > 12 || iIntValue3 == 0) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z5 = false;
                                            }
                                        }
                                    } else {
                                        if (sb.length() == 1) {
                                            int iIntValue4 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                            if (iIntValue4 != 1 && iIntValue4 != 0) {
                                                sb.insert(0, "0");
                                                selectionStart++;
                                            }
                                        } else if (sb.length() == 2) {
                                            int iIntValue5 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                            if (iIntValue5 > 12 || iIntValue5 == 0) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z5 = false;
                                            }
                                            selectionStart++;
                                        }
                                        z5 = false;
                                    }
                                    if (!z5 && sb.length() == 4) {
                                        PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                    }
                                    if (sb.length() != 2) {
                                        if (sb.length() > 2 && sb.charAt(2) != '/') {
                                            sb.insert(2, '/');
                                        }
                                        editTextBoldCursor10.setText(sb);
                                        if (selectionStart >= 0) {
                                            editTextBoldCursor10.setSelection(Math.min(selectionStart, editTextBoldCursor10.length()));
                                        }
                                        PaymentFormActivity.this.ignoreOnCardChange = false;
                                    }
                                    sb.append('/');
                                    selectionStart++;
                                    editTextBoldCursor10.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor10.setSelection(Math.min(selectionStart, editTextBoldCursor10.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = false;
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i26, int i27, int i28) {
                                    if (i27 == 0 && i28 == 1) {
                                        this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i27 != 1 || i28 != 0) {
                                        this.characterAction = -1;
                                        return;
                                    }
                                    if (charSequence.charAt(i26) != '/' || i26 <= 0) {
                                        this.characterAction = 2;
                                        return;
                                    }
                                    this.isYear = false;
                                    this.characterAction = 3;
                                    this.actionPosition = i26 - 1;
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i26, int i27, int i28) {
                                }
                            });
                        }
                        this.inputFields[i21].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        EditTextBoldCursor editTextBoldCursor10 = this.inputFields[i21];
                        if (LocaleController.isRTL) {
                            i5 = 5;
                        } else {
                            i5 = 3;
                        }
                        editTextBoldCursor10.setGravity(i5);
                        frameLayout4.addView(this.inputFields[i21], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i26 = 4;
                        this.inputFields[i21].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                            public final PaymentFormActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView3, int i27, KeyEvent keyEvent) {
                                switch (i26) {
                                    case 0:
                                        return this.f$0.lambda$createView$11(textView3, i27, keyEvent);
                                    case 1:
                                        return this.f$0.lambda$createView$25(textView3, i27, keyEvent);
                                    case 2:
                                        return this.f$0.lambda$createView$30(textView3, i27, keyEvent);
                                    case 3:
                                        return this.f$0.lambda$createView$2(textView3, i27, keyEvent);
                                    default:
                                        return this.f$0.lambda$createView$7(textView3, i27, keyEvent);
                                }
                            }
                        });
                        if (i21 == 3) {
                            this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i21 == 5) {
                            this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                            TextCheckCell textCheckCell4 = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell4;
                            textCheckCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 11));
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            updateSavePaymentField();
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i21 == 0) {
                            createGooglePayButton(context);
                            FrameLayout frameLayout5 = this.googlePayContainer;
                            if (LocaleController.isRTL) {
                                i6 = 3;
                            } else {
                                i6 = 5;
                            }
                            frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, -2.0f, i6 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z4) {
                            View view2 = new View(context) {
                                @Override
                                public void onDraw(Canvas canvas) {
                                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                }
                            };
                            view2.setBackgroundColor(getThemedColor(i23));
                            this.dividers.add(view2);
                            frameLayout4.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i21 != 4 && !this.need_card_country) || ((i21 == 5 && !this.need_card_postcode) || (i21 == 2 && !this.need_card_name))) {
                            frameLayout4.setVisibility(8);
                        }
                        i21++;
                    }
                    this.inputFields[i21].setImeOptions(268435461);
                    if (i21 != 0) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                    } else if (i21 != 1) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                    } else if (i21 != 2) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardName));
                    } else if (i21 != 3) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                    } else if (i21 != 4) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                    } else if (i21 == 5) {
                        this.inputFields[i21].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                    }
                    if (i21 == 0) {
                        this.inputFields[i21].addTextChangedListener(new TextWatcher() {
                            public static final int MAX_LENGTH_AMERICAN_EXPRESS = 15;
                            public static final int MAX_LENGTH_DINERS_CLUB = 14;
                            public static final int MAX_LENGTH_STANDARD = 16;
                            private int actionPosition;
                            public final String[] PREFIXES_15 = {"34", "37"};
                            public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                            public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                            private int characterAction = -1;

                            @Override
                            public void afterTextChanged(Editable editable) {
                                char c4;
                                boolean z5;
                                int i27;
                                int i28;
                                String[] strArr;
                                int i29;
                                String str12;
                                if (PaymentFormActivity.this.ignoreOnCardChange) {
                                    return;
                                }
                                EditTextBoldCursor editTextBoldCursor11 = PaymentFormActivity.this.inputFields[0];
                                int selectionStart = editTextBoldCursor11.getSelectionStart();
                                String string = editTextBoldCursor11.getText().toString();
                                int i210 = 1;
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i30 = 0;
                                while (i30 < string.length()) {
                                    int i31 = i30 + 1;
                                    String strSubstring = string.substring(i30, i31);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i30 = i31;
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = true;
                                String str13 = null;
                                int i32 = 100;
                                if (sb.length() > 0) {
                                    String string2 = sb.toString();
                                    int i33 = 0;
                                    while (true) {
                                        if (i33 >= 3) {
                                            c4 = 1;
                                            break;
                                        }
                                        if (i33 == 0) {
                                            strArr = this.PREFIXES_16;
                                            i29 = 16;
                                            str12 = "xxxx xxxx xxxx xxxx";
                                        } else if (i33 != i210) {
                                            strArr = this.PREFIXES_14;
                                            i29 = 14;
                                            str12 = "xxxx xxxx xxxx xx";
                                        } else {
                                            strArr = this.PREFIXES_15;
                                            i29 = 15;
                                            str12 = "xxxx xxxx xxxx xxx";
                                        }
                                        int i34 = 0;
                                        while (true) {
                                            if (i34 >= strArr.length) {
                                                c4 = 1;
                                                break;
                                            }
                                            String str14 = strArr[i34];
                                            c4 = 1;
                                            if (string2.length() <= str14.length()) {
                                                if (str14.startsWith(string2)) {
                                                    i32 = i29;
                                                    str13 = str12;
                                                    break;
                                                }
                                                i34++;
                                            } else {
                                                if (string2.startsWith(str14)) {
                                                    i32 = i29;
                                                    str13 = str12;
                                                    break;
                                                }
                                                i34++;
                                            }
                                        }
                                        if (str13 != null) {
                                            break;
                                        }
                                        i33++;
                                        i210 = 1;
                                    }
                                    if (sb.length() > i32) {
                                        sb.setLength(i32);
                                    }
                                } else {
                                    c4 = 1;
                                }
                                if (str13 != null) {
                                    if (sb.length() == i32) {
                                        PaymentFormActivity.this.inputFields[c4].requestFocus();
                                    }
                                    editTextBoldCursor11.setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    int i35 = 0;
                                    while (i35 < sb.length()) {
                                        if (i35 >= str13.length()) {
                                            sb.insert(i35, ' ');
                                            if (selectionStart == i35 + 1 && (i27 = this.characterAction) != 2 && i27 != 3) {
                                                selectionStart++;
                                                break;
                                            } else {
                                                break;
                                                break;
                                                break;
                                            }
                                        }
                                        if (str13.charAt(i35) == ' ') {
                                            sb.insert(i35, ' ');
                                            i35++;
                                            if (selectionStart == i35 && (i28 = this.characterAction) != 2 && i28 != 3) {
                                                selectionStart++;
                                            }
                                        }
                                        i35++;
                                    }
                                }
                                if (sb.toString().equals(editable.toString())) {
                                    z5 = false;
                                } else {
                                    z5 = false;
                                    editable.replace(0, editable.length(), sb);
                                }
                                if (selectionStart >= 0) {
                                    editTextBoldCursor11.setSelection(Math.min(selectionStart, editTextBoldCursor11.length()));
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = z5;
                            }

                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i27, int i28, int i29) {
                                if (i28 == 0 && i29 == 1) {
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i28 != 1 || i29 != 0) {
                                    this.characterAction = -1;
                                } else if (charSequence.charAt(i27) != ' ' || i27 <= 0) {
                                    this.characterAction = 2;
                                } else {
                                    this.characterAction = 3;
                                    this.actionPosition = i27 - 1;
                                }
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i27, int i28, int i29) {
                            }
                        });
                    } else if (i21 == 1) {
                        this.inputFields[i21].addTextChangedListener(new TextWatcher() {
                            private int actionPosition;
                            private int characterAction = -1;
                            private boolean isYear;

                            @Override
                            public void afterTextChanged(Editable editable) {
                                if (PaymentFormActivity.this.ignoreOnCardChange) {
                                    return;
                                }
                                boolean z5 = true;
                                EditTextBoldCursor editTextBoldCursor11 = PaymentFormActivity.this.inputFields[1];
                                int selectionStart = editTextBoldCursor11.getSelectionStart();
                                String string = editTextBoldCursor11.getText().toString();
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i27 = 0;
                                while (i27 < string.length()) {
                                    int i28 = i27 + 1;
                                    String strSubstring = string.substring(i27, i28);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i27 = i28;
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = true;
                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                if (sb.length() > 4) {
                                    sb.setLength(4);
                                }
                                if (sb.length() < 2) {
                                    this.isYear = false;
                                }
                                if (this.isYear) {
                                    int i29 = sb.length() > 2 ? 2 : 1;
                                    String[] strArr = new String[i29];
                                    strArr[0] = sb.substring(0, 2);
                                    if (i29 == 2) {
                                        strArr[1] = sb.substring(2);
                                    }
                                    if (sb.length() == 4 && i29 == 2) {
                                        int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                        Calendar calendar = Calendar.getInstance();
                                        boolean z6 = UserConfig.getInstance(((BaseFragment) PaymentFormActivity.this).currentAccount).getClientPhone().startsWith("7") || (PaymentFormActivity.this.country != null && PaymentFormActivity.this.country.code.equals("7"));
                                        int i210 = z6 ? 2022 : calendar.get(1);
                                        int i30 = z6 ? 1 : calendar.get(2) + 1;
                                        if (iIntValue2 < i210 || (iIntValue2 == i210 && iIntValue < i30)) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z5 = false;
                                        }
                                    } else {
                                        int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        if (iIntValue3 > 12 || iIntValue3 == 0) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z5 = false;
                                        }
                                    }
                                } else {
                                    if (sb.length() == 1) {
                                        int iIntValue4 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                        if (iIntValue4 != 1 && iIntValue4 != 0) {
                                            sb.insert(0, "0");
                                            selectionStart++;
                                        }
                                    } else if (sb.length() == 2) {
                                        int iIntValue5 = Utilities.parseInt((CharSequence) sb.toString()).intValue();
                                        if (iIntValue5 > 12 || iIntValue5 == 0) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z5 = false;
                                        }
                                        selectionStart++;
                                    }
                                    z5 = false;
                                }
                                if (!z5 && sb.length() == 4) {
                                    PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                }
                                if (sb.length() != 2) {
                                    if (sb.length() > 2 && sb.charAt(2) != '/') {
                                        sb.insert(2, '/');
                                    }
                                    editTextBoldCursor11.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor11.setSelection(Math.min(selectionStart, editTextBoldCursor11.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = false;
                                }
                                sb.append('/');
                                selectionStart++;
                                editTextBoldCursor11.setText(sb);
                                if (selectionStart >= 0) {
                                    editTextBoldCursor11.setSelection(Math.min(selectionStart, editTextBoldCursor11.length()));
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = false;
                            }

                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i27, int i28, int i29) {
                                if (i28 == 0 && i29 == 1) {
                                    this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i28 != 1 || i29 != 0) {
                                    this.characterAction = -1;
                                    return;
                                }
                                if (charSequence.charAt(i27) != '/' || i27 <= 0) {
                                    this.characterAction = 2;
                                    return;
                                }
                                this.isYear = false;
                                this.characterAction = 3;
                                this.actionPosition = i27 - 1;
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i27, int i28, int i29) {
                            }
                        });
                    }
                    this.inputFields[i21].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    EditTextBoldCursor editTextBoldCursor11 = this.inputFields[i21];
                    if (LocaleController.isRTL) {
                        i5 = 5;
                    } else {
                        i5 = 3;
                    }
                    editTextBoldCursor11.setGravity(i5);
                    frameLayout4.addView(this.inputFields[i21], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i27 = 4;
                    this.inputFields[i21].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                        public final PaymentFormActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final boolean onEditorAction(TextView textView3, int i28, KeyEvent keyEvent) {
                            switch (i27) {
                                case 0:
                                    return this.f$0.lambda$createView$11(textView3, i28, keyEvent);
                                case 1:
                                    return this.f$0.lambda$createView$25(textView3, i28, keyEvent);
                                case 2:
                                    return this.f$0.lambda$createView$30(textView3, i28, keyEvent);
                                case 3:
                                    return this.f$0.lambda$createView$2(textView3, i28, keyEvent);
                                default:
                                    return this.f$0.lambda$createView$7(textView3, i28, keyEvent);
                            }
                        }
                    });
                    if (i21 == 3) {
                        this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                        this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i21 == 5) {
                        this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                        this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                        TextCheckCell textCheckCell5 = new TextCheckCell(context, this.resourcesProvider);
                        this.checkCell1 = textCheckCell5;
                        textCheckCell5.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                        this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                        this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 11));
                        this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        updateSavePaymentField();
                        this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i21 == 0) {
                        createGooglePayButton(context);
                        FrameLayout frameLayout6 = this.googlePayContainer;
                        if (LocaleController.isRTL) {
                            i6 = 3;
                        } else {
                            i6 = 5;
                        }
                        frameLayout4.addView(frameLayout6, LayoutHelper.createFrame(-2, -2.0f, i6 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                    }
                    if (z4) {
                        View view3 = new View(context) {
                            @Override
                            public void onDraw(Canvas canvas) {
                                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                            }
                        };
                        view3.setBackgroundColor(getThemedColor(i23));
                        this.dividers.add(view3);
                        frameLayout4.addView(view3, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    if (i21 != 4) {
                    }
                    i21++;
                }
                if (!this.need_card_country && !this.need_card_postcode) {
                    this.headerCell[1].setVisibility(8);
                    this.sectionCell[0].setVisibility(8);
                }
                if (this.need_card_postcode) {
                    this.inputFields[5].setImeOptions(268435462);
                } else {
                    this.inputFields[3].setImeOptions(268435462);
                }
            }
        } else if (i18 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.requestedInfo.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.radioCells = new RadioCell[size];
            int i28 = 0;
            while (i28 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.requestedInfo.shipping_options.get(i28);
                this.radioCells[i28] = new RadioCell(context);
                this.radioCells[i28].setTag(Integer.valueOf(i28));
                this.radioCells[i28].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.radioCells[i28].setText(zzjx.m(getTotalPriceString(tL_shippingOption.prices), " - ", tL_shippingOption.title), i28 == 0, i28 != size + (-1));
                this.radioCells[i28].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 13));
                this.linearLayout2.addView(this.radioCells[i28]);
                i28++;
            }
            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
        } else if (i18 == 3) {
            this.inputFields = new EditTextBoldCursor[2];
            int i29 = 0;
            for (int i30 = 2; i29 < i30; i30 = 2) {
                if (i29 == 0) {
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                    i4 = -1;
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    i4 = -1;
                }
                FrameLayout frameLayout7 = new FrameLayout(context);
                frameLayout7.setClipChildren(false);
                this.linearLayout2.addView(frameLayout7, LayoutHelper.createLinear(i4, 50));
                int i31 = Theme.key_windowBackgroundWhite;
                frameLayout7.setBackgroundColor(getThemedColor(i31));
                boolean z5 = i29 != 1;
                if (z5) {
                    if (i29 == 7 && !this.paymentForm.invoice.phone_requested) {
                        z5 = false;
                    } else if (i29 == 6) {
                        TLRPC.TL_invoice tL_invoice10 = this.paymentForm.invoice;
                        if (!tL_invoice10.phone_requested && !tL_invoice10.email_requested) {
                            z5 = false;
                        }
                    }
                }
                if (z5) {
                    View view4 = new View(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view4.setBackgroundColor(getThemedColor(i31));
                    this.dividers.add(view4);
                    frameLayout7.addView(view4, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i29] = new EditTextBoldCursor(context);
                this.inputFields[i29].setTag(Integer.valueOf(i29));
                this.inputFields[i29].setTextSize(1, 16.0f);
                this.inputFields[i29].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor12 = this.inputFields[i29];
                int i32 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor12.setTextColor(getThemedColor(i32));
                this.inputFields[i29].setBackgroundDrawable(null);
                this.inputFields[i29].setCursorColor(getThemedColor(i32));
                this.inputFields[i29].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i29].setCursorWidth(1.5f);
                if (i29 == 0) {
                    this.inputFields[i29].setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda59(21));
                    this.inputFields[i29].setInputType(0);
                } else {
                    this.inputFields[i29].setInputType(129);
                    this.inputFields[i29].setTypeface(Typeface.DEFAULT);
                }
                this.inputFields[i29].setImeOptions(268435462);
                if (i29 == 0) {
                    EditTextBoldCursor editTextBoldCursor13 = this.inputFields[i29];
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
                    editTextBoldCursor13.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                } else if (i29 == 1) {
                    this.inputFields[i29].setHint(LocaleController.getString(R.string.LoginPassword));
                    this.inputFields[i29].requestFocus();
                }
                this.inputFields[i29].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i29].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout7.addView(this.inputFields[i29], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i29].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final PaymentFormActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView3, int i210, KeyEvent keyEvent) {
                        switch (i15) {
                            case 0:
                                return this.f$0.lambda$createView$11(textView3, i210, keyEvent);
                            case 1:
                                return this.f$0.lambda$createView$25(textView3, i210, keyEvent);
                            case 2:
                                return this.f$0.lambda$createView$30(textView3, i210, keyEvent);
                            case 3:
                                return this.f$0.lambda$createView$2(textView3, i210, keyEvent);
                            default:
                                return this.f$0.lambda$createView$7(textView3, i210, keyEvent);
                        }
                    }
                });
                if (i29 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    TextInfoPrivacyCell textInfoPrivacyCell2 = this.bottomCell[0];
                    int i33 = R.string.PaymentConfirmationMessage;
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.savedCredentialsCard;
                    textInfoPrivacyCell2.setText(LocaleController.formatString("PaymentConfirmationMessage", i33, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell[0];
                    int i34 = R.drawable.greydivider;
                    int i35 = Theme.key_windowBackgroundGrayShadow;
                    textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i34, i35));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
                    this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.settingsCell[0].setText(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                    this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, i15));
                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i35));
                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                }
                i29++;
            }
        } else if (i18 == 4 || i18 == 5) {
            PaymentInfoCell paymentInfoCell = new PaymentInfoCell(context);
            this.paymentInfoCell = paymentInfoCell;
            paymentInfoCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                this.paymentInfoCell.setInvoice((TLRPC.TL_messageMediaInvoice) messageObject.messageOwner.media, this.currentBotName);
            } else {
                TLRPC.PaymentReceipt paymentReceipt = this.paymentReceipt;
                if (paymentReceipt != null) {
                    this.paymentInfoCell.setReceipt(paymentReceipt, this.currentBotName);
                } else if (this.invoiceSlug != null || this.invoiceInput != null) {
                    PaymentInfoCell paymentInfoCell2 = this.paymentInfoCell;
                    TLRPC.PaymentForm paymentForm4 = this.paymentForm;
                    paymentInfoCell2.setInfo(paymentForm4.title, paymentForm4.description, paymentForm4.photo, this.currentBotName, paymentForm4);
                }
            }
            this.linearLayout2.addView(this.paymentInfoCell, LayoutHelper.createLinear(-1, -2));
            this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
            ArrayList<TLRPC.TL_labeledPrice> arrayList2 = new ArrayList<>(this.paymentForm.invoice.prices);
            this.prices = arrayList2;
            TLRPC.TL_shippingOption tL_shippingOption2 = this.shippingOption;
            if (tL_shippingOption2 != null) {
                arrayList2.addAll(tL_shippingOption2.prices);
            }
            this.totalPrice = new String[1];
            for (int i36 = 0; i36 < this.prices.size(); i36++) {
                TLRPC.TL_labeledPrice tL_labeledPrice = this.prices.get(i36);
                TextPriceCell textPriceCell = new TextPriceCell(context);
                textPriceCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                textPriceCell.setTextAndValue(tL_labeledPrice.label, LocaleController.getInstance().formatCurrencyString(tL_labeledPrice.amount, this.paymentForm.invoice.currency), false);
                this.linearLayout2.addView(textPriceCell);
            }
            if (this.currentStep == 5 && this.tipAmount != null) {
                TextPriceCell textPriceCell2 = new TextPriceCell(context);
                textPriceCell2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                textPriceCell2.setTextAndValue(LocaleController.getString(R.string.PaymentTip), LocaleController.getInstance().formatCurrencyString(this.tipAmount.longValue(), this.paymentForm.invoice.currency), false);
                this.linearLayout2.addView(textPriceCell2);
            }
            TextPriceCell textPriceCell3 = new TextPriceCell(context);
            this.totalCell = textPriceCell3;
            int i37 = Theme.key_windowBackgroundWhite;
            textPriceCell3.setBackgroundColor(getThemedColor(i37));
            this.totalPrice[0] = getTotalPriceString(this.prices);
            this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
            float f = 14.0f;
            if (this.currentStep != 4 || (this.paymentForm.invoice.flags & 256) == 0) {
                context2 = context;
                r14 = 1;
            } else {
                FrameLayout frameLayout8 = new FrameLayout(context);
                frameLayout8.setClipChildren(false);
                frameLayout8.setBackgroundColor(getThemedColor(i37));
                this.linearLayout2.addView(frameLayout8, LayoutHelper.createLinear(-1, this.paymentForm.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                frameLayout8.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 3));
                TextPriceCell textPriceCell4 = new TextPriceCell(context);
                textPriceCell4.setBackgroundColor(getThemedColor(i37));
                textPriceCell4.setTextAndValue(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                frameLayout8.addView(textPriceCell4);
                this.inputFields = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                EditTextBoldCursor editTextBoldCursor14 = this.inputFields[0];
                int i38 = Theme.key_windowBackgroundWhiteGrayText2;
                editTextBoldCursor14.setHintTextColor(getThemedColor(i38));
                this.inputFields[0].setTextColor(getThemedColor(i38));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[0].setCursorWidth(1.5f);
                this.inputFields[0].setInputType(3);
                this.inputFields[0].setImeOptions(268435462);
                this.inputFields[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.paymentForm.invoice.currency));
                this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[0].setGravity(LocaleController.isRTL ? 3 : 5);
                frameLayout8.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                this.inputFields[0].addTextChangedListener(new TextWatcher() {
                    private boolean anyBefore;
                    private int beforeTextLength;
                    char[] commas = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
                    private int enteredCharacterStart;
                    private boolean isDeletedChar;
                    private boolean lastDotEntered;
                    private String overrideText;

                    private int indexOfComma(String str12) {
                        int i39 = 0;
                        while (true) {
                            char[] cArr = this.commas;
                            if (i39 >= cArr.length) {
                                return -1;
                            }
                            int iIndexOf = str12.indexOf(cArr[i39]);
                            if (iIndexOf >= 0) {
                                return iIndexOf;
                            }
                            i39++;
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        int iIndexOfComma;
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        long jLongValue = PaymentFormActivity.this.tipAmount != null ? PaymentFormActivity.this.tipAmount.longValue() : 0L;
                        String strFixNumbers = this.overrideText;
                        if (strFixNumbers == null) {
                            strFixNumbers = LocaleController.fixNumbers(editable.toString());
                        }
                        int iIndexOfComma2 = indexOfComma(strFixNumbers);
                        boolean z6 = iIndexOfComma2 >= 0;
                        int currencyExpDivider = LocaleController.getCurrencyExpDivider(PaymentFormActivity.this.paymentForm.invoice.currency);
                        String strSubstring = iIndexOfComma2 >= 0 ? strFixNumbers.substring(0, iIndexOfComma2) : strFixNumbers;
                        String currencyString = "";
                        String strSubstring2 = iIndexOfComma2 >= 0 ? strFixNumbers.substring(iIndexOfComma2 + 1) : "";
                        long jLongValue2 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring, false)).longValue() * ((long) currencyExpDivider);
                        long jLongValue3 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring2, false)).longValue();
                        String strM = Log.m(jLongValue3, "");
                        String str12 = "" + (currencyExpDivider - 1);
                        if (iIndexOfComma2 > 0 && strM.length() > str12.length()) {
                            jLongValue3 = Utilities.parseLong(this.enteredCharacterStart - iIndexOfComma2 < strM.length() ? strM.substring(0, str12.length()) : strM.substring(strM.length() - str12.length())).longValue();
                        }
                        PaymentFormActivity.this.tipAmount = Long.valueOf(jLongValue2 + jLongValue3);
                        if (PaymentFormActivity.this.paymentForm.invoice.max_tip_amount != 0 && PaymentFormActivity.this.tipAmount.longValue() > PaymentFormActivity.this.paymentForm.invoice.max_tip_amount) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.tipAmount = Long.valueOf(paymentFormActivity.paymentForm.invoice.max_tip_amount);
                        }
                        int selectionStart = PaymentFormActivity.this.inputFields[0].getSelectionStart();
                        PaymentFormActivity.this.ignoreOnTextChange = true;
                        if (PaymentFormActivity.this.tipAmount.longValue() == 0) {
                            PaymentFormActivity.this.inputFields[0].setText("");
                        } else {
                            EditTextBoldCursor editTextBoldCursor15 = PaymentFormActivity.this.inputFields[0];
                            currencyString = LocaleController.getInstance().formatCurrencyString(PaymentFormActivity.this.tipAmount.longValue(), false, z6, true, PaymentFormActivity.this.paymentForm.invoice.currency);
                            editTextBoldCursor15.setText(currencyString);
                        }
                        if (jLongValue < PaymentFormActivity.this.tipAmount.longValue() && jLongValue != 0 && this.anyBefore && selectionStart >= 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length()));
                        } else if (this.isDeletedChar && this.beforeTextLength != PaymentFormActivity.this.inputFields[0].length()) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.max(0, Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length())));
                        } else if (this.lastDotEntered || !z6 || iIndexOfComma2 < 0 || (iIndexOfComma = indexOfComma(currencyString)) <= 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(PaymentFormActivity.this.inputFields[0].length());
                        } else {
                            PaymentFormActivity.this.inputFields[0].setSelection(iIndexOfComma + 1);
                        }
                        this.lastDotEntered = z6;
                        PaymentFormActivity.this.updateTotalPrice();
                        this.overrideText = null;
                        PaymentFormActivity.this.ignoreOnTextChange = false;
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i39, int i40, int i41) {
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        this.anyBefore = !TextUtils.isEmpty(charSequence);
                        this.overrideText = null;
                        this.beforeTextLength = charSequence == null ? 0 : charSequence.length();
                        this.enteredCharacterStart = i39;
                        boolean z6 = i40 == 1 && i41 == 0;
                        this.isDeletedChar = z6;
                        if (!z6) {
                            return;
                        }
                        String strFixNumbers = LocaleController.fixNumbers(charSequence);
                        char cCharAt = strFixNumbers.charAt(i39);
                        int iIndexOfComma = indexOfComma(strFixNumbers);
                        String strSubstring = iIndexOfComma >= 0 ? strFixNumbers.substring(iIndexOfComma + 1) : "";
                        long jLongValue = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring, false)).longValue();
                        if ((cCharAt >= '0' && cCharAt <= '9') || (strSubstring.length() != 0 && jLongValue == 0)) {
                            if (iIndexOfComma <= 0 || i39 <= iIndexOfComma || jLongValue != 0) {
                                return;
                            }
                            this.overrideText = strFixNumbers.substring(0, iIndexOfComma - 1);
                            return;
                        }
                        while (true) {
                            int i42 = i39 - 1;
                            if (i42 < 0) {
                                return;
                            }
                            char cCharAt2 = strFixNumbers.charAt(i42);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                this.overrideText = strFixNumbers.substring(0, i42) + strFixNumbers.substring(i39);
                                return;
                            }
                            i39 = i42;
                        }
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i39, int i40, int i41) {
                    }
                });
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView3, int i39, KeyEvent keyEvent) {
                        return PaymentFormActivity.lambda$createView$14(textView3, i39, keyEvent);
                    }
                });
                this.inputFields[0].requestFocus();
                if (this.paymentForm.invoice.suggested_tip_amounts.isEmpty()) {
                    context2 = context;
                    r14 = 1;
                } else {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView.setVerticalScrollBarEnabled(false);
                    horizontalScrollView.setClipToPadding(false);
                    horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                    r14 = 1;
                    horizontalScrollView.setFillViewport(true);
                    frameLayout8.addView(horizontalScrollView, LayoutHelper.createFrame(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    final int[] iArr = new int[1];
                    final int[] iArr2 = new int[1];
                    final int size2 = this.paymentForm.invoice.suggested_tip_amounts.size();
                    LinearLayout linearLayout3 = new LinearLayout(context) {
                        boolean ignoreLayout;

                        @Override
                        public void onMeasure(int i39, int i40) {
                            int size3 = View.MeasureSpec.getSize(i39);
                            this.ignoreLayout = true;
                            int iDp = AndroidUtilities.dp(9.0f);
                            int i41 = size2;
                            int i42 = (i41 - 1) * iDp;
                            int i43 = (iArr[0] * i41) + i42;
                            float f2 = 1.0f;
                            if (i43 <= size3) {
                                setWeightSum(1.0f);
                                int childCount = getChildCount();
                                for (int i44 = 0; i44 < childCount; i44++) {
                                    getChildAt(i44).getLayoutParams().width = 0;
                                    ((LinearLayout.LayoutParams) getChildAt(i44).getLayoutParams()).weight = 1.0f / childCount;
                                }
                            } else if (iArr2[0] + i42 <= size3) {
                                setWeightSum(1.0f);
                                int i45 = size3 - i42;
                                int childCount2 = getChildCount();
                                for (int i46 = 0; i46 < childCount2; i46++) {
                                    View childAt = getChildAt(i46);
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                                    layoutParams.width = 0;
                                    float fIntValue = ((Integer) childAt.getTag(R.id.width_tag)).intValue() / i45;
                                    layoutParams.weight = fIntValue;
                                    f2 -= fIntValue;
                                }
                                float f3 = f2 / (size2 - 1);
                                if (f3 > 0.0f) {
                                    int childCount3 = getChildCount();
                                    for (int i47 = 0; i47 < childCount3; i47++) {
                                        View childAt2 = getChildAt(i47);
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                                        if (((Integer) childAt2.getTag(R.id.width_tag)).intValue() != iArr[0]) {
                                            layoutParams2.weight += f3;
                                        }
                                    }
                                }
                            } else {
                                setWeightSum(0.0f);
                                int childCount4 = getChildCount();
                                for (int i48 = 0; i48 < childCount4; i48++) {
                                    getChildAt(i48).getLayoutParams().width = -2;
                                    ((LinearLayout.LayoutParams) getChildAt(i48).getLayoutParams()).weight = 0.0f;
                                }
                            }
                            this.ignoreLayout = false;
                            super.onMeasure(i39, i40);
                        }

                        @Override
                        public void requestLayout() {
                            if (this.ignoreLayout) {
                                return;
                            }
                            super.requestLayout();
                        }
                    };
                    context2 = context;
                    int i39 = size2;
                    this.tipLayout = linearLayout3;
                    linearLayout3.setOrientation(0);
                    horizontalScrollView.addView(this.tipLayout, LayoutHelper.createScroll(-1, 30, 51));
                    int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
                    int i40 = 0;
                    while (i40 < i39) {
                        long jLongValue = LocaleController.isRTL ? this.paymentForm.invoice.suggested_tip_amounts.get((i39 - i40) - 1).longValue() : this.paymentForm.invoice.suggested_tip_amounts.get(i40).longValue();
                        String currencyString = LocaleController.getInstance().formatCurrencyString(jLongValue, this.paymentForm.invoice.currency);
                        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context2, 1, f);
                        textViewM.setTypeface(AndroidUtilities.bold());
                        textViewM.setLines(1);
                        textViewM.setTag(Long.valueOf(jLongValue));
                        textViewM.setMaxLines(1);
                        textViewM.setText(currencyString);
                        textViewM.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                        textViewM.setTextColor(getThemedColor(Theme.key_chats_secretName));
                        textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(15.0f), 536870911 & themedColor));
                        textViewM.setSingleLine(true);
                        textViewM.setGravity(17);
                        this.tipLayout.addView(textViewM, LayoutHelper.createLinear(-2, -1, 19, 0, 0, i40 != i39 + (-1) ? 9 : 0, 0));
                        textViewM.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda11(this, textViewM, jLongValue, 2));
                        int iDp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(textViewM.getPaint().measureText(currencyString)));
                        textViewM.setTag(R.id.width_tag, Integer.valueOf(iDp));
                        iArr[0] = Math.max(iArr[0], iDp);
                        iArr2[0] = iArr2[0] + iDp;
                        i40++;
                        i39 = i39;
                        f = 14.0f;
                    }
                }
            }
            this.linearLayout2.addView(this.totalCell);
            this.sectionCell[2] = new ShadowSectionCell(context2, this.resourcesProvider);
            this.sectionCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
            this.detailSettingsCell[0] = new TextDetailSettingsCell(context2) {
                @Override
                public void setVisibility(int i41) {
                    super.setVisibility(i41);
                }
            };
            this.detailSettingsCell[0].setBackground(Theme.getSelectorDrawable(r14));
            AnonymousClass13 anonymousClass13 = this.detailSettingsCell[0];
            String str12 = this.cardName;
            anonymousClass13.setTextAndValueAndIcon((str12 == null || str12.length() <= r14) ? this.cardName : this.cardName.substring(0, r14).toUpperCase() + this.cardName.substring(r14), LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, r14);
            int i41 = ((this.isCheckoutPreview || this.allowUnregistered) && ((str = this.cardName) == null || str.length() <= r14)) ? 8 : 0;
            this.detailSettingsCell[0].setVisibility(i41);
            this.linearLayout2.addView(this.detailSettingsCell[0]);
            int i42 = 4;
            if (this.currentStep == 4) {
                this.detailSettingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, i42));
            }
            TLRPC.User user3 = null;
            for (int i43 = 0; i43 < this.paymentForm.users.size(); i43++) {
                TLRPC.User user4 = this.paymentForm.users.get(i43);
                if (user4.id == this.paymentForm.provider_id) {
                    user3 = user4;
                }
            }
            this.detailSettingsCell[1] = new TextDetailSettingsCell(context2);
            this.detailSettingsCell[1].setBackground(Theme.getSelectorDrawable(true));
            if (user3 != null) {
                TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[1];
                name = ContactsController.formatName(user3.first_name, user3.last_name);
                String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                int i44 = R.drawable.msg_payment_provider;
                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.validateRequest;
                textDetailSettingsCell.setTextAndValueAndIcon(name, string, i44, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.shippingOption == null)) && ((tL_paymentRequestedInfo = this.paymentForm.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                this.linearLayout2.addView(this.detailSettingsCell[1]);
            } else {
                name = "";
            }
            this.detailSettingsCell[1].setVisibility(user3 != null ? i41 : 8);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
            if (tL_payments_validateRequestedInfo2 != null || (this.isCheckoutPreview && (paymentForm2 = this.paymentForm) != null && paymentForm2.saved_info != null)) {
                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.paymentForm.saved_info;
                this.detailSettingsCell[2] = new TextDetailSettingsCell(context2);
                this.detailSettingsCell[2].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[2]);
                if (tL_paymentRequestedInfo12.shipping_address != null) {
                    this.detailSettingsCell[2].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[2].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[2].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 5));
                    } else {
                        this.detailSettingsCell[2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[3] = new TextDetailSettingsCell(context2);
                this.detailSettingsCell[3].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[3]);
                if (tL_paymentRequestedInfo12.name != null) {
                    this.detailSettingsCell[3].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[3].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[3].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 6));
                    } else {
                        this.detailSettingsCell[3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[4] = new TextDetailSettingsCell(context2);
                this.detailSettingsCell[4].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[4]);
                if (tL_paymentRequestedInfo12.phone != null) {
                    this.detailSettingsCell[4].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[4].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[4].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 7));
                    } else {
                        this.detailSettingsCell[4].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[5] = new TextDetailSettingsCell(context2);
                this.detailSettingsCell[5].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[5]);
                if (tL_paymentRequestedInfo12.email != null) {
                    this.detailSettingsCell[5].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[5].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[5].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 8));
                    } else {
                        this.detailSettingsCell[5].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                if (this.shippingOption != null) {
                    this.detailSettingsCell[6] = new TextDetailSettingsCell(context2);
                    this.detailSettingsCell[6].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.detailSettingsCell[6].setTextAndValueAndIcon(this.shippingOption.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), R.drawable.msg_payment_delivery, false);
                    this.linearLayout2.addView(this.detailSettingsCell[6]);
                }
                setAddressFields(tL_paymentRequestedInfo12);
            }
            if (this.currentStep == 4) {
                this.recurrentAccepted = !this.isCheckoutPreview;
                if (this.invoiceInput instanceof TLRPC.TL_inputInvoiceStars) {
                    this.recurrentAccepted = true;
                }
                this.bottomLayout = new BottomFrameLayout(context2, this.paymentForm);
                View view5 = new View(context2);
                view5.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
                this.bottomLayout.addView(view5, LayoutHelper.createFrame(-1, -1.0f));
                frameLayout2.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
                this.bottomLayout.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(17, this, name));
                TextView textView3 = new TextView(context2);
                this.payTextView = textView3;
                int i45 = Theme.key_contacts_inviteText;
                textView3.setTextColor(getThemedColor(i45));
                this.payTextView.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.totalPrice[0]));
                this.payTextView.setTextSize(1, 14.0f);
                this.payTextView.setGravity(17);
                this.payTextView.setTypeface(AndroidUtilities.bold());
                this.bottomLayout.addView(this.payTextView, LayoutHelper.createFrame(-1, -1.0f));
                ContextProgressView contextProgressView2 = new ContextProgressView(context2, 0);
                this.progressViewButton = contextProgressView2;
                contextProgressView2.setVisibility(4);
                int themedColor2 = getThemedColor(i45);
                this.progressViewButton.setColors(805306367 & themedColor2, themedColor2);
                this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1, -1.0f));
                this.bottomLayout.setChecked(this.recurrentAccepted, false);
                this.payTextView.setAlpha(!this.recurrentAccepted ? 0.8f : 1.0f);
                this.doneItem.setEnabled(false);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context2, true);
                try {
                    WebView webView2 = new WebView(context2) {
                        @Override
                        public boolean onTouchEvent(MotionEvent motionEvent) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return super.onTouchEvent(motionEvent);
                        }
                    };
                    this.webView = webView2;
                    webView2.setBackgroundColor(-1);
                    this.webView.getSettings().setJavaScriptEnabled(true);
                    this.webView.getSettings().setDomStorageEnabled(true);
                    this.webView.getSettings().setSupportZoom(true);
                    this.webView.getSettings().setBuiltInZoomControls(true);
                    this.webView.getSettings().setDisplayZoomControls(false);
                    this.webView.getSettings().setUseWideViewPort(true);
                    this.webView.getSettings().setMixedContentMode(0);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                    this.webView.setWebViewClient(new AnonymousClass19(context2));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.recurrentAcceptCell = null;
                if (this.paymentForm.invoice.terms_url != null) {
                    RecurrentPaymentsAcceptCell recurrentPaymentsAcceptCell = new RecurrentPaymentsAcceptCell(context2, getResourceProvider());
                    this.recurrentAcceptCell = recurrentPaymentsAcceptCell;
                    recurrentPaymentsAcceptCell.setChecked(this.recurrentAccepted);
                    if (TextUtils.isEmpty(this.currentBotName)) {
                        String string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                        spannableStringBuilder = new SpannableStringBuilder(string2);
                        int iIndexOf = string2.indexOf(42);
                        int iLastIndexOf = string2.lastIndexOf(42);
                        if (iIndexOf != -1 && iLastIndexOf != -1) {
                            SpannableString spannableString = new SpannableString(string2.substring(iIndexOf + 1, iLastIndexOf));
                            spannableString.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), 0, spannableString.length(), 33);
                            int i46 = iLastIndexOf + 1;
                            spannableStringBuilder.replace(iIndexOf, i46, (CharSequence) spannableString);
                            string2.substring(0, iIndexOf);
                            spannableString.toString();
                            string2.substring(i46);
                        }
                    } else {
                        String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                        spannableStringBuilder = new SpannableStringBuilder(string3);
                        int iIndexOf2 = string3.indexOf(42);
                        int iLastIndexOf2 = string3.lastIndexOf(42);
                        if (iIndexOf2 != -1 && iLastIndexOf2 != -1) {
                            SpannableString spannableString2 = new SpannableString(string3.substring(iIndexOf2 + 1, iLastIndexOf2));
                            spannableString2.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), 0, spannableString2.length(), 33);
                            int i47 = iLastIndexOf2 + 1;
                            spannableStringBuilder.replace(iIndexOf2, i47, (CharSequence) spannableString2);
                            string3 = string3.substring(0, iIndexOf2) + ((Object) spannableString2) + string3.substring(i47);
                        }
                        int iIndexOf3 = string3.indexOf("%1$s");
                        if (iIndexOf3 != -1) {
                            spannableStringBuilder.replace(iIndexOf3, iIndexOf3 + 4, (CharSequence) this.currentBotName);
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf3, this.currentBotName.length() + iIndexOf3, 33);
                        }
                    }
                    this.recurrentAcceptCell.setText(spannableStringBuilder);
                    this.recurrentAcceptCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_listSelector)));
                    this.recurrentAcceptCell.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 9));
                    frameLayout2.addView(this.recurrentAcceptCell, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                }
                WebView webView3 = this.webView;
                if (webView3 != null) {
                    frameLayout2.addView(webView3, LayoutHelper.createFrame(-1, -1.0f));
                    this.webView.setVisibility(8);
                }
            }
            this.sectionCell[1] = new ShadowSectionCell(context2, this.resourcesProvider);
            this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context2, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i41 != 0 && this.currentStep == 4 && this.validateRequest == null && ((paymentForm = this.paymentForm) == null || paymentForm.saved_info == null)) {
                c2 = 1;
                this.sectionCell[1].setVisibility(i41);
            } else {
                c2 = 1;
            }
            this.linearLayout2.addView(this.sectionCell[c2], LayoutHelper.createLinear(-1, -2));
        } else if (i18 == 6) {
            EditTextSettingsCell editTextSettingsCell = new EditTextSettingsCell(context);
            this.codeFieldCell = editTextSettingsCell;
            String string4 = LocaleController.getString(R.string.PasswordCode);
            editTextSettingsCell.textView.setText("");
            editTextSettingsCell.textView.setHint(string4);
            editTextSettingsCell.needDivider = false;
            final int i48 = 1;
            editTextSettingsCell.setWillNotDraw(true);
            this.codeFieldCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            EditTextBoldCursor textView4 = this.codeFieldCell.getTextView();
            textView4.setInputType(3);
            textView4.setImeOptions(6);
            textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final PaymentFormActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView5, int i210, KeyEvent keyEvent) {
                    switch (i48) {
                        case 0:
                            return this.f$0.lambda$createView$11(textView5, i210, keyEvent);
                        case 1:
                            return this.f$0.lambda$createView$25(textView5, i210, keyEvent);
                        case 2:
                            return this.f$0.lambda$createView$30(textView5, i210, keyEvent);
                        case 3:
                            return this.f$0.lambda$createView$2(textView5, i210, keyEvent);
                        default:
                            return this.f$0.lambda$createView$7(textView5, i210, keyEvent);
                    }
                }
            });
            textView4.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    if (PaymentFormActivity.this.emailCodeLength == 0 || editable.length() != PaymentFormActivity.this.emailCodeLength) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i49, int i50, int i51) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i49, int i50, int i51) {
                }
            });
            this.linearLayout2.addView(this.codeFieldCell, LayoutHelper.createLinear(-1, -2));
            this.bottomCell[2] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[2], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[1].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell = this.settingsCell[1];
            int i49 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i49));
            this.settingsCell[1].setTextColor(getThemedColor(i49));
            this.settingsCell[1].setText(LocaleController.getString(R.string.ResendCode), true);
            this.linearLayout2.addView(this.settingsCell[1], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 1));
            this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell2 = this.settingsCell[0];
            int i50 = Theme.key_text_RedRegular;
            textSettingsCell2.setTag(Integer.valueOf(i50));
            this.settingsCell[0].setTextColor(getThemedColor(i50));
            this.settingsCell[0].setText(LocaleController.getString(R.string.AbortPassword), false);
            this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda29(this, 2));
            this.inputFields = new EditTextBoldCursor[3];
            int i51 = 0;
            for (int i52 = 3; i51 < i52; i52 = 3) {
                if (i51 == 0) {
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    if (i51 == 2) {
                        this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                        i = -1;
                        this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    frameLayout = new FrameLayout(context);
                    frameLayout.setClipChildren(false);
                    this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(i, 50));
                    i2 = Theme.key_windowBackgroundWhite;
                    frameLayout.setBackgroundColor(getThemedColor(i2));
                    if (i51 == 0) {
                        View view6 = new View(context) {
                            @Override
                            public void onDraw(Canvas canvas) {
                                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                            }
                        };
                        view6.setBackgroundColor(getThemedColor(i2));
                        this.dividers.add(view6);
                        frameLayout.addView(view6, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    this.inputFields[i51] = new EditTextBoldCursor(context);
                    this.inputFields[i51].setTag(Integer.valueOf(i51));
                    this.inputFields[i51].setTextSize(1, 16.0f);
                    this.inputFields[i51].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                    EditTextBoldCursor editTextBoldCursor15 = this.inputFields[i51];
                    int i53 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor15.setTextColor(getThemedColor(i53));
                    this.inputFields[i51].setBackgroundDrawable(null);
                    this.inputFields[i51].setCursorColor(getThemedColor(i53));
                    this.inputFields[i51].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i51].setCursorWidth(1.5f);
                    if (i51 != 0 || i51 == 1) {
                        this.inputFields[i51].setInputType(129);
                        this.inputFields[i51].setTypeface(Typeface.DEFAULT);
                        this.inputFields[i51].setImeOptions(268435461);
                    } else {
                        this.inputFields[i51].setInputType(33);
                        this.inputFields[i51].setImeOptions(268435462);
                    }
                    if (i51 != 0) {
                        this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                        this.inputFields[i51].requestFocus();
                    } else if (i51 != 1) {
                        this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                    } else if (i51 == 2) {
                        this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                    }
                    this.inputFields[i51].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    EditTextBoldCursor editTextBoldCursor16 = this.inputFields[i51];
                    if (LocaleController.isRTL) {
                        i3 = 5;
                    } else {
                        i3 = 3;
                    }
                    editTextBoldCursor16.setGravity(i3);
                    frameLayout.addView(this.inputFields[i51], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i54 = 2;
                    this.inputFields[i51].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                        public final PaymentFormActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final boolean onEditorAction(TextView textView5, int i210, KeyEvent keyEvent) {
                            switch (i54) {
                                case 0:
                                    return this.f$0.lambda$createView$11(textView5, i210, keyEvent);
                                case 1:
                                    return this.f$0.lambda$createView$25(textView5, i210, keyEvent);
                                case 2:
                                    return this.f$0.lambda$createView$30(textView5, i210, keyEvent);
                                case 3:
                                    return this.f$0.lambda$createView$2(textView5, i210, keyEvent);
                                default:
                                    return this.f$0.lambda$createView$7(textView5, i210, keyEvent);
                            }
                        }
                    });
                    if (i51 == 1) {
                        this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                        this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                        this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    } else {
                        if (i51 == 2) {
                            this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                            this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                        }
                        i51++;
                    }
                    i51++;
                }
                i = -1;
                frameLayout = new FrameLayout(context);
                frameLayout.setClipChildren(false);
                this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(i, 50));
                i2 = Theme.key_windowBackgroundWhite;
                frameLayout.setBackgroundColor(getThemedColor(i2));
                if (i51 == 0) {
                    View view7 = new View(context) {
                        @Override
                        public void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view7.setBackgroundColor(getThemedColor(i2));
                    this.dividers.add(view7);
                    frameLayout.addView(view7, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i51] = new EditTextBoldCursor(context);
                this.inputFields[i51].setTag(Integer.valueOf(i51));
                this.inputFields[i51].setTextSize(1, 16.0f);
                this.inputFields[i51].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor17 = this.inputFields[i51];
                int i55 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor17.setTextColor(getThemedColor(i55));
                this.inputFields[i51].setBackgroundDrawable(null);
                this.inputFields[i51].setCursorColor(getThemedColor(i55));
                this.inputFields[i51].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i51].setCursorWidth(1.5f);
                if (i51 != 0) {
                    this.inputFields[i51].setInputType(129);
                    this.inputFields[i51].setTypeface(Typeface.DEFAULT);
                    this.inputFields[i51].setImeOptions(268435461);
                } else {
                    this.inputFields[i51].setInputType(129);
                    this.inputFields[i51].setTypeface(Typeface.DEFAULT);
                    this.inputFields[i51].setImeOptions(268435461);
                }
                if (i51 != 0) {
                    this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                    this.inputFields[i51].requestFocus();
                } else if (i51 != 1) {
                    this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                } else if (i51 == 2) {
                    this.inputFields[i51].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                }
                this.inputFields[i51].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                EditTextBoldCursor editTextBoldCursor18 = this.inputFields[i51];
                if (LocaleController.isRTL) {
                    i3 = 5;
                } else {
                    i3 = 3;
                }
                editTextBoldCursor18.setGravity(i3);
                frameLayout.addView(this.inputFields[i51], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                final int i56 = 2;
                this.inputFields[i51].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final PaymentFormActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i210, KeyEvent keyEvent) {
                        switch (i56) {
                            case 0:
                                return this.f$0.lambda$createView$11(textView5, i210, keyEvent);
                            case 1:
                                return this.f$0.lambda$createView$25(textView5, i210, keyEvent);
                            case 2:
                                return this.f$0.lambda$createView$30(textView5, i210, keyEvent);
                            case 3:
                                return this.f$0.lambda$createView$2(textView5, i210, keyEvent);
                            default:
                                return this.f$0.lambda$createView$7(textView5, i210, keyEvent);
                        }
                    }
                });
                if (i51 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                    this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    if (i51 == 2) {
                        this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                        this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    i51++;
                }
                i51++;
            }
            updatePasswordFields();
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.twoStepPasswordChanged) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            paymentForm.password_missing = false;
            paymentForm.can_save_credentials = true;
            updateSavePaymentField();
            return;
        }
        if (i == NotificationCenter.didRemoveTwoStepPassword) {
            TLRPC.PaymentForm paymentForm2 = this.paymentForm;
            paymentForm2.password_missing = true;
            paymentForm2.can_save_credentials = false;
            updateSavePaymentField();
            return;
        }
        if (i == NotificationCenter.paymentFinished) {
            this.paymentStatusSent = true;
            removeSelfFromStack();
        }
    }

    public void fillNumber(String str) {
        boolean z;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (str == null && (telephonyManager.getSimState() == 1 || telephonyManager.getPhoneType() == 0)) {
                return;
            }
            boolean z2 = Build.VERSION.SDK_INT < 23 || getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
            if (str != null || z2) {
                if (str == null) {
                    str = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number(), false);
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                int i = 4;
                String strSubstring = null;
                if (str.length() > 4) {
                    while (true) {
                        if (i < 1) {
                            z = false;
                            break;
                        }
                        String strSubstring2 = str.substring(0, i);
                        if (this.codesMap.get(strSubstring2) != null) {
                            strSubstring = str.substring(i);
                            this.inputFields[8].setText(strSubstring2);
                            z = true;
                            break;
                        }
                        i--;
                    }
                    if (!z) {
                        strSubstring = str.substring(1);
                        this.inputFields[8].setText(str.substring(0, 1));
                    }
                }
                if (strSubstring != null) {
                    this.inputFields[9].setText(strSubstring);
                    EditTextBoldCursor editTextBoldCursor = this.inputFields[9];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public Optional<JSONObject> getIsReadyToPayRequest() {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod()));
            return Optional.of(baseRequest);
        } catch (JSONException unused) {
            return Optional.empty();
        }
    }

    public int getOtherSameFragmentDiff() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        int i = 0;
        if (iNavigationLayout == null || ((ActionBarLayout) iNavigationLayout).getFragmentStack() == null) {
            return 0;
        }
        int iIndexOf = ((ActionBarLayout) this.parentLayout).getFragmentStack().indexOf(this);
        if (iIndexOf == -1) {
            iIndexOf = ((ActionBarLayout) this.parentLayout).getFragmentStack().size();
        }
        while (i < ((ActionBarLayout) this.parentLayout).getFragmentStack().size()) {
            if (((ActionBarLayout) this.parentLayout).getFragmentStack().get(i) instanceof PaymentFormActivity) {
                return i - iIndexOf;
            }
            i++;
        }
        i = iIndexOf;
        return i - iIndexOf;
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.scrollView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ContextProgressView contextProgressView = this.progressView;
        int i2 = Theme.key_contextProgressInner2;
        arrayList.add(new ThemeDescription(contextProgressView, 0, null, null, null, null, i2));
        ContextProgressView contextProgressView2 = this.progressView;
        int i3 = Theme.key_contextProgressOuter2;
        arrayList.add(new ThemeDescription(contextProgressView2, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i3));
        if (this.inputFields != null) {
            int i4 = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
                if (i4 >= editTextBoldCursorArr.length) {
                    break;
                }
                arrayList.add(new ThemeDescription((View) editTextBoldCursorArr[i4].getParent(), 1, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.inputFields[i4], 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.inputFields[i4], 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
                i4++;
            }
        } else {
            arrayList.add(new ThemeDescription(null, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, 8388608, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        }
        if (this.radioCells != null) {
            int i5 = 0;
            while (true) {
                RadioCell[] radioCellArr = this.radioCells;
                if (i5 >= radioCellArr.length) {
                    break;
                }
                arrayList.add(new ThemeDescription(radioCellArr[i5], 268435456, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.radioCells[i5], 268435456, null, null, null, null, Theme.key_listSelector));
                arrayList.add(new ThemeDescription(this.radioCells[i5], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.radioCells[i5], 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
                arrayList.add(new ThemeDescription(this.radioCells[i5], 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
                i5++;
            }
        } else {
            arrayList.add(new ThemeDescription(null, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, 8192, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackground));
            arrayList.add(new ThemeDescription(null, 16384, new Class[]{RadioCell.class}, new String[]{"radioButton"}, null, null, -1, null, Theme.key_radioBackgroundChecked));
        }
        int i6 = 0;
        while (true) {
            HeaderCell[] headerCellArr = this.headerCell;
            if (i6 >= headerCellArr.length) {
                break;
            }
            arrayList.add(new ThemeDescription(headerCellArr[i6], 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.headerCell[i6], 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
            i6++;
        }
        int i7 = 0;
        while (true) {
            ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
            if (i7 >= shadowSectionCellArr.length) {
                break;
            }
            arrayList.add(new ThemeDescription(shadowSectionCellArr[i7], 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            i7++;
        }
        int i8 = 0;
        while (true) {
            TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCell;
            if (i8 >= textInfoPrivacyCellArr.length) {
                break;
            }
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i8], 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.bottomCell[i8], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(this.bottomCell[i8], 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
            i8++;
        }
        for (int i9 = 0; i9 < this.dividers.size(); i9++) {
            arrayList.add(new ThemeDescription(this.dividers.get(i9), 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        EditTextSettingsCell editTextSettingsCell = this.codeFieldCell;
        int i10 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(editTextSettingsCell, 1, null, null, null, null, i10));
        int i11 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.codeFieldCell, 4, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new ThemeDescription(this.codeFieldCell, 8388608, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.textView, 4, null, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, null, null, -1, null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.checkCell1, 268435456, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.checkCell1, 268435456, null, null, null, null, Theme.key_listSelector));
        int i12 = 0;
        while (true) {
            TextSettingsCell[] textSettingsCellArr = this.settingsCell;
            if (i12 >= textSettingsCellArr.length) {
                break;
            }
            arrayList.add(new ThemeDescription(textSettingsCellArr[i12], 268435456, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.settingsCell[i12], 268435456, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.settingsCell[i12], 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            i12++;
        }
        arrayList.add(new ThemeDescription(this.payTextView, 4, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText6));
        int i13 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.linearLayout2, 16, new Class[]{TextPriceCell.class}, null, null, null, i13));
        int i14 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.linearLayout2, 262144, new Class[]{TextPriceCell.class}, new String[]{"textView"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(this.linearLayout2, 262144, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i14));
        int i15 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.linearLayout2, 262144, new Class[]{TextPriceCell.class}, new String[]{"textView"}, null, null, -1, null, i15));
        arrayList.add(new ThemeDescription(this.linearLayout2, 262144, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, null, null, -1, null, i15));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], 268435456, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], 268435456, null, null, null, null, Theme.key_listSelector));
        int i16 = 1;
        while (true) {
            TextDetailSettingsCell[] textDetailSettingsCellArr = this.detailSettingsCell;
            if (i16 >= textDetailSettingsCellArr.length) {
                PaymentInfoCell paymentInfoCell = this.paymentInfoCell;
                int i17 = Theme.key_windowBackgroundWhite;
                arrayList.add(new ThemeDescription(paymentInfoCell, 1, null, null, null, null, i17));
                int i18 = Theme.key_windowBackgroundWhiteBlackText;
                arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
                arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailTextView"}, null, null, -1, null, i18));
                arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailExTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
                arrayList.add(new ThemeDescription(this.bottomLayout, 268435456, null, null, null, null, i17));
                arrayList.add(new ThemeDescription(this.bottomLayout, 268435456, null, null, null, null, Theme.key_listSelector));
                return arrayList;
            }
            arrayList.add(new ThemeDescription(textDetailSettingsCellArr[i16], 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i16], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i16], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
            i16++;
        }
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 991) {
            AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(this, i2, intent, 22));
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        WebView webView = this.webView;
        if (webView == null || !this.shouldNavigateBack) {
            return !this.donePressed;
        }
        if (z) {
            webView.loadUrl(this.webViewUrl);
            this.shouldNavigateBack = false;
        }
        return false;
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.currentStep == 4 && this.needPayAfterTransition) {
            this.needPayAfterTransition = false;
            this.bottomLayout.callOnClick();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.currentStep != 4 || this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        PaymentFormActivityDelegate paymentFormActivityDelegate = this.delegate;
        if (paymentFormActivityDelegate != null) {
            paymentFormActivityDelegate.onFragmentDestroyed();
        }
        AndroidUtilities.checkAndroidTheme(getContext(), false);
        if (!this.paymentStatusSent) {
            this.invoiceStatus = InvoiceStatus.CANCELLED;
            if (this.paymentFormCallback != null && getOtherSameFragmentDiff() == 0) {
                this.paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
            }
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.currentStep != 4 || this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        WebView webView = this.webView;
        if (webView != null) {
            try {
                ViewParent parent = webView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.webView);
                }
                this.webView.stopLoading();
                this.webView.loadUrl("about:blank");
                this.webViewUrl = null;
                this.webView.destroy();
                this.webView = null;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        try {
            int i = this.currentStep;
            if ((i == 2 || i == 6) && Build.VERSION.SDK_INT >= 23 && (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture)) {
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.onFragmentDestroy();
        this.canceled = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                int i = this.currentStep;
                if ((i == 2 || i == 6) && !this.paymentForm.invoice.test) {
                    getParentActivity().getWindow().setFlags(8192, 8192);
                    AndroidUtilities.logFlagSecure();
                } else if (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture) {
                    getParentActivity().getWindow().clearFlags(8192);
                    AndroidUtilities.logFlagSecure();
                }
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        WebView webView = this.webView;
        if (webView != null) {
            if (this.currentStep != 4) {
                TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentFormMethod;
                if (tL_paymentFormMethod != null) {
                    String str = tL_paymentFormMethod.url;
                    this.webViewUrl = str;
                    webView.loadUrl(str);
                    return;
                } else {
                    String str2 = this.paymentForm.url;
                    this.webViewUrl = str2;
                    webView.loadUrl(str2);
                    return;
                }
            }
            return;
        }
        int i = this.currentStep;
        if (i == 2) {
            AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda19(this, 0), 100L);
            return;
        }
        if (i == 3) {
            this.inputFields[1].requestFocus();
            AndroidUtilities.showKeyboard(this.inputFields[1]);
            return;
        }
        if (i == 4) {
            EditTextBoldCursor[] editTextBoldCursorArr = this.inputFields;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                return;
            }
            return;
        }
        if (i != 6 || this.waitingForEmail) {
            return;
        }
        this.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(this.inputFields[0]);
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment);
    }

    public PaymentFormActivity setCustomAnyResultReceiver(Utilities.Callback<TLRPC.payments_PaymentResult> callback) {
        this.customAnyResultReceiver = callback;
        return this;
    }

    public void setCustomErrorReceiver(Utilities.CallbackReturn<TLRPC.TL_error, Boolean> callbackReturn) {
        this.customErrorReceiver = callbackReturn;
    }

    public PaymentFormActivity setCustomResultReceiver(Utilities.Callback<TLRPC.TL_payments_paymentResult> callback) {
        this.customResultReceiver = callback;
        return this;
    }

    public void setPaymentFormCallback(PaymentFormCallback paymentFormCallback) {
        this.paymentFormCallback = paymentFormCallback;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    private void showChoosePaymentMethod(final Runnable runnable) {
        BottomSheet bottomSheet = new BottomSheet(getParentActivity(), false, false, null);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        bottomSheet.bigTitle = true;
        final ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
        if (tL_paymentSavedCredentialsCard != null) {
            arrayList.add(tL_paymentSavedCredentialsCard.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
        } else {
            String str = this.cardName;
            if (str != null) {
                arrayList.add(str);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
            }
        }
        final ArrayList arrayList3 = new ArrayList();
        ArrayList<TLRPC.TL_paymentSavedCredentialsCard> arrayList4 = this.paymentForm.saved_credentials;
        int size = arrayList4.size();
        int i = 0;
        while (i < size) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = arrayList4.get(i);
            i++;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard3 = tL_paymentSavedCredentialsCard2;
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard4 = this.savedCredentialsCard;
            if (tL_paymentSavedCredentialsCard4 == null || !Objects.equals(tL_paymentSavedCredentialsCard3.id, tL_paymentSavedCredentialsCard4.id)) {
                arrayList.add(tL_paymentSavedCredentialsCard3.title);
                arrayList2.add(Integer.valueOf(R.drawable.msg_payment_card));
                arrayList3.add(tL_paymentSavedCredentialsCard3);
            }
        }
        ArrayList<TLRPC.TL_paymentFormMethod> arrayList5 = this.paymentForm.additional_methods;
        int size2 = arrayList5.size();
        int i2 = 0;
        while (i2 < size2) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = arrayList5.get(i2);
            i2++;
            arrayList.add(tL_paymentFormMethod.title);
            arrayList2.add(Integer.valueOf(R.drawable.msg_payment_provider));
        }
        arrayList.add(LocaleController.getString(R.string.PaymentCheckoutMethodNewCard));
        arrayList2.add(Integer.valueOf(R.drawable.msg_addbot));
        int[] iArr = new int[arrayList2.size()];
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
        }
        CharSequence[] charSequenceArr = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                this.f$0.lambda$showChoosePaymentMethod$31(runnable, arrayList3, arrayList, dialogInterface, i4);
            }
        };
        bottomSheet.items = charSequenceArr;
        bottomSheet.itemIcons = iArr;
        bottomSheet.onClickListener = onClickListener;
        showDialog(bottomSheet);
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment, z);
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, BaseFragment baseFragment) {
        super(null);
        this.countriesArray = new ArrayList<>();
        this.countriesMap = new HashMap<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList<>();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        this.isCheckoutPreview = true;
        init(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, baseFragment, false);
    }

    public interface PaymentFormActivityDelegate {
        void currentPasswordUpdated(TL_account.Password password);

        void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo);

        boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard);

        void onFragmentDestroyed();

        public abstract class CC {
            public static boolean $default$didSelectNewCard(PaymentFormActivityDelegate paymentFormActivityDelegate, String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            public static void $default$onFragmentDestroyed(PaymentFormActivityDelegate paymentFormActivityDelegate) {
            }

            public static void $default$currentPasswordUpdated(PaymentFormActivityDelegate paymentFormActivityDelegate, TL_account.Password password) {
            }

            public static void $default$didSelectNewAddress(PaymentFormActivityDelegate paymentFormActivityDelegate, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
            }
        }
    }

    public PaymentFormActivity(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
        this.countriesArray = new ArrayList<>();
        this.countriesMap = new HashMap<>();
        this.codesMap = new HashMap<>();
        this.phoneFormatMap = new HashMap<>();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList<>();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        this.currentStep = 5;
        TLRPC.PaymentForm paymentForm = new TLRPC.PaymentForm();
        this.paymentForm = paymentForm;
        this.paymentReceipt = paymentReceipt;
        paymentForm.bot_id = paymentReceipt.bot_id;
        paymentForm.invoice = paymentReceipt.invoice;
        paymentForm.provider_id = paymentReceipt.provider_id;
        paymentForm.users = paymentReceipt.users;
        this.shippingOption = paymentReceipt.shipping;
        long j = paymentReceipt.tip_amount;
        if (j != 0) {
            this.tipAmount = Long.valueOf(j);
        }
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(paymentReceipt.bot_id));
        this.botUser = user;
        if (user != null) {
            this.currentBotName = user.first_name;
        } else {
            this.currentBotName = "";
        }
        this.currentItemName = paymentReceipt.title;
        if (paymentReceipt.info != null) {
            this.validateRequest = new TLRPC.TL_payments_validateRequestedInfo();
            if (this.messageObject != null) {
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = getMessagesController().getInputPeer(paymentReceipt.bot_id);
                this.validateRequest.invoice = tL_inputInvoiceMessage;
            } else {
                TLRPC.TL_inputInvoiceSlug tL_inputInvoiceSlug = new TLRPC.TL_inputInvoiceSlug();
                tL_inputInvoiceSlug.slug = this.invoiceSlug;
                this.validateRequest.invoice = tL_inputInvoiceSlug;
            }
            this.validateRequest.info = paymentReceipt.info;
        }
        this.cardName = paymentReceipt.credentials_title;
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, String str, BaseFragment baseFragment) {
        this(paymentForm, (MessageObject) null, str, baseFragment);
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, BaseFragment baseFragment) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, baseFragment, false);
        this.isCheckoutPreview = true;
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, boolean z, BaseFragment baseFragment) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, baseFragment, z);
        this.isCheckoutPreview = z;
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, BaseFragment baseFragment) {
        this(paymentForm, messageObject, (String) null, baseFragment);
    }
}
