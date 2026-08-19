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
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
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
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.google.android.gms.wallet.Wallet;
import com.stripe.android.Stripe;
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
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
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
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
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
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Stars.StarsIntroActivity;

public class PaymentFormActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private boolean allowUnregistered;
    private TLRPC.User botUser;
    private TextInfoPrivacyCell[] bottomCell;
    private BottomFrameLayout bottomLayout;
    private boolean canceled;
    private String cardName;
    private TextCheckCell checkCell1;
    private EditTextSettingsCell codeFieldCell;
    private HashMap codesMap;
    private ArrayList countriesArray;
    private HashMap countriesMap;
    private CountrySelectActivity.Country country;
    private String countryName;
    private String currentBotName;
    private String currentItemName;
    private TL_account.Password currentPassword;
    private int currentStep;
    private Utilities.Callback customAnyResultReceiver;
    private Utilities.CallbackReturn customErrorReceiver;
    private Utilities.Callback customResultReceiver;
    private PaymentFormActivityDelegate delegate;
    private TextDetailSettingsCell[] detailSettingsCell;
    private ArrayList dividers;
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
    private HashMap phoneFormatMap;
    private ArrayList prices;
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
    private static final List WEBVIEW_PROTOCOLS = Arrays.asList("http", "https");
    private static final List BLACKLISTED_PROTOCOLS = Collections.singletonList("tg");

    public enum InvoiceStatus {
        PAID,
        CANCELLED,
        PENDING,
        FAILED
    }

    interface PaymentFormActivityDelegate {

        public abstract class CC {
            public static void $default$currentPasswordUpdated(PaymentFormActivityDelegate paymentFormActivityDelegate, TL_account.Password password) {
            }

            public static void $default$didSelectNewAddress(PaymentFormActivityDelegate paymentFormActivityDelegate, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
            }

            public static boolean $default$didSelectNewCard(PaymentFormActivityDelegate paymentFormActivityDelegate, String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            public static void $default$onFragmentDestroyed(PaymentFormActivityDelegate paymentFormActivityDelegate) {
            }
        }

        void currentPasswordUpdated(TL_account.Password password);

        void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo);

        boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard);

        void onFragmentDestroyed();
    }

    public interface PaymentFormCallback {
        void onInvoiceStatusChanged(InvoiceStatus invoiceStatus);
    }

    public static void m3624$r8$lambda$n8ObnsWdeFAzl5V43MAtxv73w(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static void $r8$lambda$N5EBCheEeuvSVEmlqehvGd50Iaw(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public static boolean m3644$r8$lambda$lq9LWx85ffust2Y_olLL_Ztadc(View view, MotionEvent motionEvent) {
        return true;
    }

    class TelegramWebviewProxy {
        private TelegramWebviewProxy() {
        }

        @JavascriptInterface
        public void postEvent(final String str, final String str2) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.TelegramWebviewProxy.m3652$r8$lambda$RL4oCZY86KWXr9hnUfC68sItw(this.f$0, str, str2);
                }
            });
        }

        public static void m3652$r8$lambda$RL4oCZY86KWXr9hnUfC68sItw(TelegramWebviewProxy telegramWebviewProxy, String str, String str2) {
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
    }

    public class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }

        @Override
        public void onClick(View view) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.presentFragment(new TwoStepVerificationSetupActivity(6, paymentFormActivity.currentPassword));
        }
    }

    public PaymentFormActivity(TLRPC.PaymentReceipt paymentReceipt) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
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

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, BaseFragment baseFragment) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        this.isCheckoutPreview = true;
        init(null, paymentForm, messageObject, str, 4, null, null, null, null, null, null, false, null, baseFragment, false);
    }

    private PaymentFormActivity(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment, boolean z2) {
        this.countriesArray = new ArrayList();
        this.countriesMap = new HashMap();
        this.codesMap = new HashMap();
        this.phoneFormatMap = new HashMap();
        this.swipeBackEnabled = true;
        this.headerCell = new HeaderCell[3];
        this.dividers = new ArrayList();
        this.sectionCell = new ShadowSectionCell[3];
        this.bottomCell = new TextInfoPrivacyCell[3];
        this.settingsCell = new TextSettingsCell[2];
        this.detailSettingsCell = new TextDetailSettingsCell[7];
        this.shiftDp = -4.5f;
        this.emailCodeLength = 6;
        init(inputInvoice, paymentForm, messageObject, str, i, tL_payments_validatedRequestedInfo, tL_shippingOption, l, str2, str3, tL_payments_validateRequestedInfo, z, tL_inputPaymentCredentialsGooglePay, baseFragment, z2);
    }

    public void setPaymentFormCallback(PaymentFormCallback paymentFormCallback) {
        this.paymentFormCallback = paymentFormCallback;
    }

    private void setCurrentPassword(TL_account.Password password) {
        if (password != null && password.has_password) {
            if (getParentActivity() == null) {
                return;
            }
            goToNextStep();
        } else {
            this.currentPassword = password;
            this.waitingForEmail = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            updatePasswordFields();
        }
    }

    private void setDelegate(PaymentFormActivityDelegate paymentFormActivityDelegate) {
        this.delegate = paymentFormActivityDelegate;
    }

    public void setResourcesProvider(Theme.ResourcesProvider resourcesProvider) {
        this.resourcesProvider = resourcesProvider;
    }

    @Override
    public Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
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
        if (str3 == null) {
            if (this.paymentForm.saved_credentials.isEmpty()) {
                return;
            }
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.paymentForm.saved_credentials.get(0);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard;
            this.cardName = tL_paymentSavedCredentialsCard.title;
            return;
        }
        this.cardName = str3;
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
    public View createView(Context context) {
        char c;
        char c2;
        char c3;
        String str;
        char c4;
        TLRPC.PaymentForm paymentForm;
        SpannableStringBuilder spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        final long jLongValue;
        boolean z;
        int i;
        int i2;
        int i3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        String upperCase;
        String str2;
        ?? frameLayout;
        HashMap map;
        boolean z2;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str3;
        String str4;
        int i4 = 10;
        ?? r7 = 0;
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
                if (tL_paymentFormMethod != null && !TextUtils.isEmpty(tL_paymentFormMethod.title)) {
                    this.actionBar.setTitle(this.paymentFormMethod.title);
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.PaymentCardInfo));
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
            public void onItemClick(int i5) {
                if (i5 == -1) {
                    if (PaymentFormActivity.this.donePressed) {
                        return;
                    }
                    PaymentFormActivity.this.finishFragment();
                    return;
                }
                if (i5 != 1 || PaymentFormActivity.this.donePressed) {
                    return;
                }
                if (PaymentFormActivity.this.currentStep != 3) {
                    AndroidUtilities.hideKeyboard(PaymentFormActivity.this.getParentActivity().getCurrentFocus());
                }
                int i6 = PaymentFormActivity.this.currentStep;
                if (i6 == 0) {
                    PaymentFormActivity.this.setDonePressed(true);
                    PaymentFormActivity.this.sendForm();
                    return;
                }
                if (i6 == 1) {
                    for (int i7 = 0; i7 < PaymentFormActivity.this.radioCells.length; i7++) {
                        if (PaymentFormActivity.this.radioCells[i7].isChecked()) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.shippingOption = paymentFormActivity.requestedInfo.shipping_options.get(i7);
                            break;
                        }
                    }
                    PaymentFormActivity.this.goToNextStep();
                    return;
                }
                if (i6 == 2) {
                    PaymentFormActivity.this.sendCardData();
                } else if (i6 == 3) {
                    PaymentFormActivity.this.checkPassword();
                } else {
                    if (i6 != 6) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i5 = this.currentStep;
        int i6 = 3;
        if (i5 == 0 || i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4 || i5 == 6) {
            c = 2;
            this.doneItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done));
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
        int i7 = this.currentStep;
        final String name = "";
        char c5 = 1;
        int i8 = 8;
        if (i7 == 0) {
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        String[] strArrSplit = line.split(";");
                        this.countriesArray.add(0, strArrSplit[c]);
                        this.countriesMap.put(strArrSplit[c], strArrSplit[0]);
                        this.codesMap.put(strArrSplit[0], strArrSplit[c]);
                        map3.put(strArrSplit[1], strArrSplit[c]);
                        if (strArrSplit.length > 3) {
                            this.phoneFormatMap.put(strArrSplit[0], strArrSplit[3]);
                        }
                        map2.put(strArrSplit[1], strArrSplit[c]);
                    } else {
                        bufferedReader.close();
                    }
                    Collections.sort(this.countriesArray, new BoostRepository$$ExternalSyntheticLambda24());
                    this.inputFields = new EditTextBoldCursor[10];
                    int i9 = 0;
                    while (i9 < i4) {
                        if (i9 == 0) {
                            this.headerCell[r7] = new HeaderCell(context, this.resourcesProvider);
                            this.headerCell[r7].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            this.headerCell[r7].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                            this.linearLayout2.addView(this.headerCell[r7], LayoutHelper.createLinear(-1, -2));
                        } else if (i9 == 6) {
                            this.sectionCell[r7] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[r7], LayoutHelper.createLinear(-1, -2));
                            this.headerCell[c5] = new HeaderCell(context, this.resourcesProvider);
                            this.headerCell[c5].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            this.headerCell[c5].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                            this.linearLayout2.addView(this.headerCell[c5], LayoutHelper.createLinear(-1, -2));
                        }
                        if (i9 == i8) {
                            frameLayout = new LinearLayout(context);
                            frameLayout.setClipChildren(r7);
                            frameLayout.setOrientation(r7);
                            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                            frameLayout.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        } else if (i9 == 9) {
                            frameLayout = (ViewGroup) this.inputFields[i8].getParent();
                        } else {
                            frameLayout = new FrameLayout(context);
                            frameLayout.setClipChildren(r7);
                            this.linearLayout2.addView(frameLayout, LayoutHelper.createLinear(-1, 50));
                            int i10 = Theme.key_windowBackgroundWhite;
                            frameLayout.setBackgroundColor(getThemedColor(i10));
                            boolean z3 = i9 != 5;
                            if (z3) {
                                if (i9 == 7 && !this.paymentForm.invoice.phone_requested) {
                                    z3 = false;
                                } else if (i9 == 6) {
                                    TLRPC.TL_invoice tL_invoice = this.paymentForm.invoice;
                                    if (!tL_invoice.phone_requested && !tL_invoice.email_requested) {
                                        z3 = false;
                                    }
                                }
                            }
                            if (z3) {
                                View view = new View(context) {
                                    @Override
                                    protected void onDraw(Canvas canvas) {
                                        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                    }
                                };
                                view.setBackgroundColor(getThemedColor(i10));
                                this.dividers.add(view);
                                frameLayout.addView(view, new FrameLayout.LayoutParams(-1, 1, 83));
                            }
                        }
                        if (i9 == 9) {
                            this.inputFields[i9] = new HintEditText(context);
                        } else {
                            this.inputFields[i9] = new EditTextBoldCursor(context);
                        }
                        this.inputFields[i9].setTag(Integer.valueOf(i9));
                        this.inputFields[i9].setTextSize(1, 16.0f);
                        this.inputFields[i9].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                        EditTextBoldCursor editTextBoldCursor = this.inputFields[i9];
                        int i11 = Theme.key_windowBackgroundWhiteBlackText;
                        editTextBoldCursor.setTextColor(getThemedColor(i11));
                        this.inputFields[i9].setBackgroundDrawable(null);
                        this.inputFields[i9].setCursorColor(getThemedColor(i11));
                        this.inputFields[i9].setCursorSize(AndroidUtilities.dp(20.0f));
                        this.inputFields[i9].setCursorWidth(1.5f);
                        if (i9 == 4) {
                            this.inputFields[i9].setOnTouchListener(new View.OnTouchListener() {
                                @Override
                                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                    return PaymentFormActivity.m3642$r8$lambda$hT4BhQBsShItfGVcQ2f2uOdPCY(this.f$0, view2, motionEvent);
                                }
                            });
                            this.inputFields[i9].setInputType(r7);
                        }
                        if (i9 == 9 || i9 == i8) {
                            this.inputFields[i9].setInputType(i6);
                        } else if (i9 == 7) {
                            this.inputFields[i9].setInputType(1);
                        } else {
                            this.inputFields[i9].setInputType(16385);
                        }
                        this.inputFields[i9].setImeOptions(268435461);
                        switch (i9) {
                            case 0:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingAddress1Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo3 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo3 != null && (tL_postAddress = tL_paymentRequestedInfo3.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress.street_line1);
                                }
                                break;
                            case 1:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingAddress2Placeholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo4 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo4 != null && (tL_postAddress2 = tL_paymentRequestedInfo4.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress2.street_line2);
                                }
                                break;
                            case 2:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingCityPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo5 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo5 != null && (tL_postAddress3 = tL_paymentRequestedInfo5.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress3.city);
                                }
                                break;
                            case 3:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingStatePlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo6 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo6 != null && (tL_postAddress4 = tL_paymentRequestedInfo6.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress4.state);
                                }
                                break;
                            case 4:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo7 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo7 != null && (tL_postAddress5 = tL_paymentRequestedInfo7.shipping_address) != null) {
                                    String str5 = (String) map3.get(tL_postAddress5.country_iso2);
                                    String str6 = this.paymentForm.saved_info.shipping_address.country_iso2;
                                    this.countryName = str6;
                                    EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i9];
                                    if (str5 == null) {
                                        str5 = str6;
                                    }
                                    editTextBoldCursor2.setText(str5);
                                }
                                break;
                            case 5:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo8 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo8 != null && (tL_postAddress6 = tL_paymentRequestedInfo8.shipping_address) != null) {
                                    this.inputFields[i9].setText(tL_postAddress6.post_code);
                                }
                                break;
                            case 6:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingName));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo9 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo9 != null && (str3 = tL_paymentRequestedInfo9.name) != null) {
                                    this.inputFields[i9].setText(str3);
                                }
                                break;
                            case 7:
                                this.inputFields[i9].setHint(LocaleController.getString(R.string.PaymentShippingEmailPlaceholder));
                                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo10 = this.paymentForm.saved_info;
                                if (tL_paymentRequestedInfo10 != null && (str4 = tL_paymentRequestedInfo10.email) != null) {
                                    this.inputFields[i9].setText(str4);
                                }
                                break;
                        }
                        EditTextBoldCursor editTextBoldCursor3 = this.inputFields[i9];
                        editTextBoldCursor3.setSelection(editTextBoldCursor3.length());
                        if (i9 == i8) {
                            TextView textView = new TextView(context);
                            this.textView = textView;
                            textView.setText("+");
                            this.textView.setTextColor(getThemedColor(i11));
                            this.textView.setTextSize(1, 16.0f);
                            frameLayout.addView(this.textView, LayoutHelper.createLinear(-2, -2, 21.0f, 12.0f, 0.0f, 6.0f));
                            this.inputFields[i9].setPadding(AndroidUtilities.dp(10.0f), r7, r7, r7);
                            this.inputFields[i9].setGravity(19);
                            InputFilter[] inputFilterArr = new InputFilter[1];
                            inputFilterArr[r7] = new InputFilter.LengthFilter(5);
                            this.inputFields[i9].setFilters(inputFilterArr);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createLinear(55, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                            this.inputFields[i9].addTextChangedListener(new TextWatcher() {
                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    String str7;
                                    boolean z4;
                                    String str8;
                                    if (PaymentFormActivity.this.ignoreOnTextChange) {
                                        return;
                                    }
                                    PaymentFormActivity.this.ignoreOnTextChange = true;
                                    String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PaymentFormActivity.this.inputFields[8].getText().toString());
                                    PaymentFormActivity.this.inputFields[8].setText(strStripExceptNumbers);
                                    HintEditText hintEditText = (HintEditText) PaymentFormActivity.this.inputFields[9];
                                    if (strStripExceptNumbers.length() == 0) {
                                        hintEditText.setHintText((String) null);
                                        hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                    } else {
                                        int i12 = 4;
                                        if (strStripExceptNumbers.length() > 4) {
                                            while (true) {
                                                if (i12 < 1) {
                                                    str7 = null;
                                                    z4 = false;
                                                    break;
                                                }
                                                String strSubstring = strStripExceptNumbers.substring(0, i12);
                                                if (((String) PaymentFormActivity.this.codesMap.get(strSubstring)) != null) {
                                                    String str9 = strStripExceptNumbers.substring(i12) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                    PaymentFormActivity.this.inputFields[8].setText(strSubstring);
                                                    str7 = str9;
                                                    strStripExceptNumbers = strSubstring;
                                                    z4 = true;
                                                    break;
                                                }
                                                i12--;
                                            }
                                            if (!z4) {
                                                str7 = strStripExceptNumbers.substring(1) + PaymentFormActivity.this.inputFields[9].getText().toString();
                                                EditTextBoldCursor editTextBoldCursor4 = PaymentFormActivity.this.inputFields[8];
                                                strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                                editTextBoldCursor4.setText(strStripExceptNumbers);
                                            }
                                        } else {
                                            str7 = null;
                                            z4 = false;
                                        }
                                        String str10 = (String) PaymentFormActivity.this.codesMap.get(strStripExceptNumbers);
                                        if (str10 != null && PaymentFormActivity.this.countriesArray.indexOf(str10) != -1 && (str8 = (String) PaymentFormActivity.this.phoneFormatMap.get(strStripExceptNumbers)) != null) {
                                            hintEditText.setHintText(str8.replace('X', (char) 8211));
                                            hintEditText.setHint((CharSequence) null);
                                        } else {
                                            hintEditText.setHintText((String) null);
                                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                        }
                                        if (!z4) {
                                            PaymentFormActivity.this.inputFields[8].setSelection(PaymentFormActivity.this.inputFields[8].getText().length());
                                        }
                                        if (str7 != null) {
                                            hintEditText.requestFocus();
                                            hintEditText.setText(str7);
                                            hintEditText.setSelection(hintEditText.length());
                                        }
                                    }
                                    PaymentFormActivity.this.ignoreOnTextChange = false;
                                }
                            });
                        } else if (i9 == 9) {
                            this.inputFields[i9].setPadding(r7, r7, r7, r7);
                            this.inputFields[i9].setGravity(19);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createLinear(-1, -2, 0.0f, 12.0f, 21.0f, 6.0f));
                            this.inputFields[i9].addTextChangedListener(new TextWatcher() {
                                private int actionPosition;
                                private int characterAction = -1;

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                    if (i13 == 0 && i14 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i13 == 1 && i14 == 0) {
                                        if (charSequence.charAt(i12) == ' ' && i12 > 0) {
                                            this.characterAction = 3;
                                            this.actionPosition = i12 - 1;
                                            return;
                                        } else {
                                            this.characterAction = 2;
                                            return;
                                        }
                                    }
                                    this.characterAction = -1;
                                }

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    int i12;
                                    int i13;
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
                                    int i14 = 0;
                                    while (i14 < string.length()) {
                                        int i15 = i14 + 1;
                                        String strSubstring = string.substring(i14, i15);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i14 = i15;
                                    }
                                    PaymentFormActivity.this.ignoreOnPhoneChange = true;
                                    String hintText = hintEditText.getHintText();
                                    if (hintText != null) {
                                        int i16 = 0;
                                        while (i16 < sb.length()) {
                                            if (i16 < hintText.length()) {
                                                if (hintText.charAt(i16) == ' ') {
                                                    sb.insert(i16, ' ');
                                                    i16++;
                                                    if (selectionStart == i16 && (i13 = this.characterAction) != 2 && i13 != 3) {
                                                        selectionStart++;
                                                    }
                                                }
                                                i16++;
                                            } else {
                                                sb.insert(i16, ' ');
                                                if (selectionStart == i16 + 1 && (i12 = this.characterAction) != 2 && i12 != 3) {
                                                    selectionStart++;
                                                    break;
                                                } else {
                                                    break;
                                                    break;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    hintEditText.setText(sb);
                                    if (selectionStart >= 0) {
                                        hintEditText.setSelection(Math.min(selectionStart, hintEditText.length()));
                                    }
                                    hintEditText.onTextChange();
                                    PaymentFormActivity.this.ignoreOnPhoneChange = false;
                                }
                            });
                        } else {
                            this.inputFields[i9].setPadding(r7, r7, r7, AndroidUtilities.dp(6.0f));
                            this.inputFields[i9].setGravity(LocaleController.isRTL ? 5 : 3);
                            frameLayout.addView(this.inputFields[i9], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        }
                        this.inputFields[i9].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                            @Override
                            public final boolean onEditorAction(TextView textView2, int i12, KeyEvent keyEvent) {
                                return PaymentFormActivity.$r8$lambda$_xpvioDeDolOOo1dRCH7vn9igfA(this.f$0, textView2, i12, keyEvent);
                            }
                        });
                        if (i9 == 9) {
                            TLRPC.TL_invoice tL_invoice2 = this.paymentForm.invoice;
                            if (tL_invoice2.email_to_provider || tL_invoice2.phone_to_provider) {
                                TLRPC.User user = null;
                                int i12 = 0;
                                while (i12 < this.paymentForm.users.size()) {
                                    TLRPC.User user2 = this.paymentForm.users.get(i12);
                                    HashMap map4 = map3;
                                    if (user2.id == this.paymentForm.provider_id) {
                                        user = user2;
                                    }
                                    i12++;
                                    map3 = map4;
                                }
                                map = map3;
                                String name2 = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                                z2 = true;
                                this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                TLRPC.TL_invoice tL_invoice3 = this.paymentForm.invoice;
                                boolean z4 = tL_invoice3.email_to_provider;
                                if (z4 && tL_invoice3.phone_to_provider) {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, name2));
                                } else if (z4) {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                } else {
                                    this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                }
                            } else {
                                this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
                                this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(-1, -2));
                                map = map3;
                                z2 = true;
                            }
                            TextCheckCell textCheckCell = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell;
                            textCheckCell.setBackgroundDrawable(Theme.getSelectorDrawable(z2));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentShippingSave), this.saveShippingInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    PaymentFormActivity.$r8$lambda$2L_7stVP8ayvLJIsDSOnxPCLnfk(this.f$0, view2);
                                }
                            });
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else {
                            map = map3;
                        }
                        i9++;
                        map3 = map;
                        i8 = 8;
                        r7 = 0;
                        i4 = 10;
                        i6 = 3;
                        c5 = 1;
                    }
                    if (this.paymentForm.invoice.name_requested) {
                        i3 = 8;
                    } else {
                        i3 = 8;
                        ((ViewGroup) this.inputFields[6].getParent()).setVisibility(8);
                    }
                    if (!this.paymentForm.invoice.phone_requested) {
                        ((ViewGroup) this.inputFields[i3].getParent()).setVisibility(i3);
                    }
                    if (!this.paymentForm.invoice.email_requested) {
                        ((ViewGroup) this.inputFields[7].getParent()).setVisibility(i3);
                    }
                    TLRPC.TL_invoice tL_invoice4 = this.paymentForm.invoice;
                    if (tL_invoice4.phone_requested) {
                        this.inputFields[9].setImeOptions(268435462);
                    } else if (tL_invoice4.email_requested) {
                        this.inputFields[7].setImeOptions(268435462);
                    } else if (tL_invoice4.name_requested) {
                        this.inputFields[6].setImeOptions(268435462);
                    } else {
                        this.inputFields[5].setImeOptions(268435462);
                    }
                    ShadowSectionCell shadowSectionCell = this.sectionCell[1];
                    if (shadowSectionCell != null) {
                        TLRPC.TL_invoice tL_invoice5 = this.paymentForm.invoice;
                        shadowSectionCell.setVisibility((tL_invoice5.name_requested || tL_invoice5.phone_requested || tL_invoice5.email_requested) ? 0 : 8);
                    } else {
                        TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[1];
                        if (textInfoPrivacyCell != null) {
                            TLRPC.TL_invoice tL_invoice6 = this.paymentForm.invoice;
                            textInfoPrivacyCell.setVisibility((tL_invoice6.name_requested || tL_invoice6.phone_requested || tL_invoice6.email_requested) ? 0 : 8);
                        }
                    }
                    HeaderCell headerCell = this.headerCell[1];
                    TLRPC.TL_invoice tL_invoice7 = this.paymentForm.invoice;
                    headerCell.setVisibility((tL_invoice7.name_requested || tL_invoice7.phone_requested || tL_invoice7.email_requested) ? 0 : 8);
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
                    if (tL_paymentRequestedInfo11 != null && !TextUtils.isEmpty(tL_paymentRequestedInfo11.phone)) {
                        fillNumber(this.paymentForm.saved_info.phone);
                    } else {
                        fillNumber(null);
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
                            if (upperCase != null && (str2 = (String) map2.get(upperCase)) != null && this.countriesArray.indexOf(str2) != -1) {
                                this.inputFields[8].setText((CharSequence) this.countriesMap.get(str2));
                            }
                        }
                    }
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        } else if (i7 == 2) {
            if (this.paymentForm.native_params != null) {
                try {
                    JSONObject jSONObject = new JSONObject(this.paymentForm.native_params.data);
                    String strOptString = jSONObject.optString("google_pay_public_key");
                    if (!TextUtils.isEmpty(strOptString)) {
                        this.googlePayPublicKey = strOptString;
                    }
                    this.googlePayCountryCode = jSONObject.optString("acquirer_bank_country");
                    this.googlePayParameters = jSONObject.optJSONObject("gpay_parameters");
                } catch (Exception e3) {
                    FileLog.e(e3);
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
                    public boolean onTouchEvent(MotionEvent motionEvent) {
                        ((ViewGroup) PaymentFormActivity.this.fragmentView).requestDisallowInterceptTouchEvent(true);
                        return super.onTouchEvent(motionEvent);
                    }

                    @Override
                    protected void onMeasure(int i13, int i14) {
                        super.onMeasure(i13, i14);
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
                TextCheckCell textCheckCell2 = new TextCheckCell(context, this.resourcesProvider);
                this.checkCell1 = textCheckCell2;
                textCheckCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                this.checkCell1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        PaymentFormActivity.m3646$r8$lambda$tnYLHj6FmZVDfxMwo9veCy07Ag(this.f$0, view2);
                    }
                });
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
                    } catch (Exception e4) {
                        FileLog.e(e4);
                    }
                }
                if (this.initGooglePay && ((!TextUtils.isEmpty(this.providerApiKey) && "stripe".equals(this.paymentForm.native_provider)) || this.googlePayParameters != null)) {
                    initGooglePay(context);
                }
                this.inputFields = new EditTextBoldCursor[6];
                int i13 = 0;
                for (int i14 = 6; i13 < i14; i14 = 6) {
                    if (i13 == 0) {
                        this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i13 == 4) {
                        this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    boolean z5 = (i13 == 3 || i13 == 5 || (i13 == 4 && !this.need_card_postcode)) ? false : true;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    frameLayout3.setClipChildren(false);
                    int i15 = Theme.key_windowBackgroundWhite;
                    frameLayout3.setBackgroundColor(getThemedColor(i15));
                    this.linearLayout2.addView(frameLayout3, LayoutHelper.createLinear(-1, 50));
                    this.inputFields[i13] = new EditTextBoldCursor(context);
                    this.inputFields[i13].setTag(Integer.valueOf(i13));
                    this.inputFields[i13].setTextSize(1, 16.0f);
                    this.inputFields[i13].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                    EditTextBoldCursor editTextBoldCursor4 = this.inputFields[i13];
                    int i16 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor4.setTextColor(getThemedColor(i16));
                    this.inputFields[i13].setBackgroundDrawable(null);
                    this.inputFields[i13].setCursorColor(getThemedColor(i16));
                    this.inputFields[i13].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i13].setCursorWidth(1.5f);
                    if (i13 == 3) {
                        this.inputFields[i13].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                        this.inputFields[i13].setInputType(130);
                        this.inputFields[i13].setTypeface(Typeface.DEFAULT);
                        this.inputFields[i13].setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else if (i13 == 0) {
                        this.inputFields[i13].setInputType(3);
                    } else if (i13 == 4) {
                        this.inputFields[i13].setOnTouchListener(new View.OnTouchListener() {
                            @Override
                            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                                return PaymentFormActivity.$r8$lambda$MEW6qeCGYUv7uo4IKKm2jXe_wvk(this.f$0, view2, motionEvent);
                            }
                        });
                        this.inputFields[i13].setInputType(0);
                    } else if (i13 == 1) {
                        this.inputFields[i13].setInputType(16386);
                    } else {
                        if (i13 == 2) {
                            this.inputFields[i13].setInputType(4097);
                        } else {
                            this.inputFields[i13].setInputType(16385);
                        }
                        this.inputFields[i13].setImeOptions(268435461);
                        if (i13 != 0) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i13 != 1) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i13 != 2) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i13 != 3) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i13 != 4) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i13 == 5) {
                            this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i13 == 0) {
                            this.inputFields[i13].addTextChangedListener(new TextWatcher() {
                                private int actionPosition;
                                public final String[] PREFIXES_15 = {"34", "37"};
                                public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                                public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                                private int characterAction = -1;

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                    if (i18 == 0 && i19 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i18 == 1 && i19 == 0) {
                                        if (charSequence.charAt(i17) == ' ' && i17 > 0) {
                                            this.characterAction = 3;
                                            this.actionPosition = i17 - 1;
                                            return;
                                        } else {
                                            this.characterAction = 2;
                                            return;
                                        }
                                    }
                                    this.characterAction = -1;
                                }

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    char c6;
                                    boolean z6;
                                    int i17;
                                    int i18;
                                    String[] strArr;
                                    int i19;
                                    String str7;
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    EditTextBoldCursor editTextBoldCursor5 = PaymentFormActivity.this.inputFields[0];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String string = editTextBoldCursor5.getText().toString();
                                    int i20 = 1;
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i21 = 0;
                                    while (i21 < string.length()) {
                                        int i22 = i21 + 1;
                                        String strSubstring = string.substring(i21, i22);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i21 = i22;
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = true;
                                    String str8 = null;
                                    int i23 = 100;
                                    if (sb.length() > 0) {
                                        String string2 = sb.toString();
                                        int i24 = 0;
                                        while (true) {
                                            if (i24 >= 3) {
                                                c6 = 1;
                                                break;
                                            }
                                            if (i24 == 0) {
                                                strArr = this.PREFIXES_16;
                                                i19 = 16;
                                                str7 = "xxxx xxxx xxxx xxxx";
                                            } else if (i24 == i20) {
                                                strArr = this.PREFIXES_15;
                                                i19 = 15;
                                                str7 = "xxxx xxxx xxxx xxx";
                                            } else {
                                                strArr = this.PREFIXES_14;
                                                i19 = 14;
                                                str7 = "xxxx xxxx xxxx xx";
                                            }
                                            int i25 = 0;
                                            while (true) {
                                                if (i25 >= strArr.length) {
                                                    c6 = 1;
                                                    break;
                                                }
                                                String str9 = strArr[i25];
                                                c6 = 1;
                                                if (string2.length() <= str9.length()) {
                                                    if (str9.startsWith(string2)) {
                                                        i23 = i19;
                                                        str8 = str7;
                                                        break;
                                                    }
                                                    i25++;
                                                } else {
                                                    if (string2.startsWith(str9)) {
                                                        i23 = i19;
                                                        str8 = str7;
                                                        break;
                                                    }
                                                    i25++;
                                                }
                                            }
                                            if (str8 != null) {
                                                break;
                                            }
                                            i24++;
                                            i20 = 1;
                                        }
                                        if (sb.length() > i23) {
                                            sb.setLength(i23);
                                        }
                                    } else {
                                        c6 = 1;
                                    }
                                    if (str8 != null) {
                                        if (sb.length() == i23) {
                                            PaymentFormActivity.this.inputFields[c6].requestFocus();
                                        }
                                        editTextBoldCursor5.setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                        int i26 = 0;
                                        while (i26 < sb.length()) {
                                            if (i26 < str8.length()) {
                                                if (str8.charAt(i26) == ' ') {
                                                    sb.insert(i26, ' ');
                                                    i26++;
                                                    if (selectionStart == i26 && (i18 = this.characterAction) != 2 && i18 != 3) {
                                                        selectionStart++;
                                                    }
                                                }
                                                i26++;
                                            } else {
                                                sb.insert(i26, ' ');
                                                if (selectionStart == i26 + 1 && (i17 = this.characterAction) != 2 && i17 != 3) {
                                                    selectionStart++;
                                                    break;
                                                } else {
                                                    break;
                                                    break;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                    if (sb.toString().equals(editable.toString())) {
                                        z6 = false;
                                    } else {
                                        z6 = false;
                                        editable.replace(0, editable.length(), sb);
                                    }
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = z6;
                                }
                            });
                        } else if (i13 == 1) {
                            this.inputFields[i13].addTextChangedListener(new TextWatcher() {
                                private int actionPosition;
                                private int characterAction = -1;
                                private boolean isYear;

                                @Override
                                public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                }

                                @Override
                                public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                    if (i18 == 0 && i19 == 1) {
                                        this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i18 == 1 && i19 == 0) {
                                        if (charSequence.charAt(i17) == '/' && i17 > 0) {
                                            this.isYear = false;
                                            this.characterAction = 3;
                                            this.actionPosition = i17 - 1;
                                            return;
                                        }
                                        this.characterAction = 2;
                                        return;
                                    }
                                    this.characterAction = -1;
                                }

                                @Override
                                public void afterTextChanged(Editable editable) {
                                    if (PaymentFormActivity.this.ignoreOnCardChange) {
                                        return;
                                    }
                                    boolean z6 = true;
                                    EditTextBoldCursor editTextBoldCursor5 = PaymentFormActivity.this.inputFields[1];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String string = editTextBoldCursor5.getText().toString();
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i17 = 0;
                                    while (i17 < string.length()) {
                                        int i18 = i17 + 1;
                                        String strSubstring = string.substring(i17, i18);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i17 = i18;
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
                                        int i19 = sb.length() > 2 ? 2 : 1;
                                        String[] strArr = new String[i19];
                                        strArr[0] = sb.substring(0, 2);
                                        if (i19 == 2) {
                                            strArr[1] = sb.substring(2);
                                        }
                                        if (sb.length() == 4 && i19 == 2) {
                                            int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                            Calendar calendar = Calendar.getInstance();
                                            boolean z7 = UserConfig.getInstance(((BaseFragment) PaymentFormActivity.this).currentAccount).getClientPhone().startsWith("7") || (PaymentFormActivity.this.country != null && PaymentFormActivity.this.country.code.equals("7"));
                                            int i20 = z7 ? 2022 : calendar.get(1);
                                            int i21 = z7 ? 1 : calendar.get(2) + 1;
                                            if (iIntValue2 < i20 || (iIntValue2 == i20 && iIntValue < i21)) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z6 = false;
                                            }
                                        } else {
                                            int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            if (iIntValue3 > 12 || iIntValue3 == 0) {
                                                PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z6 = false;
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
                                                z6 = false;
                                            }
                                            selectionStart++;
                                        }
                                        z6 = false;
                                    }
                                    if (!z6 && sb.length() == 4) {
                                        PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                    }
                                    if (sb.length() == 2) {
                                        sb.append('/');
                                    } else {
                                        if (sb.length() > 2 && sb.charAt(2) != '/') {
                                            sb.insert(2, '/');
                                        }
                                        editTextBoldCursor5.setText(sb);
                                        if (selectionStart >= 0) {
                                            editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                        }
                                        PaymentFormActivity.this.ignoreOnCardChange = false;
                                    }
                                    selectionStart++;
                                    editTextBoldCursor5.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = false;
                                }
                            });
                        }
                        this.inputFields[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i13];
                        if (LocaleController.isRTL) {
                            i = 5;
                        } else {
                            i = 3;
                        }
                        editTextBoldCursor5.setGravity(i);
                        frameLayout3.addView(this.inputFields[i13], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        this.inputFields[i13].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                            @Override
                            public final boolean onEditorAction(TextView textView2, int i17, KeyEvent keyEvent) {
                                return PaymentFormActivity.$r8$lambda$zP7U4LDiVv1BKdek0pl43kQSei4(this.f$0, textView2, i17, keyEvent);
                            }
                        });
                        if (i13 == 3) {
                            this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i13 == 5) {
                            this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                            TextCheckCell textCheckCell3 = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell3;
                            textCheckCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public final void onClick(View view2) {
                                    PaymentFormActivity.m3643$r8$lambda$kqLcr1yFvZ2FoOFmjzqVBJY3VA(this.f$0, view2);
                                }
                            });
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            updateSavePaymentField();
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i13 == 0) {
                            createGooglePayButton(context);
                            FrameLayout frameLayout4 = this.googlePayContainer;
                            if (LocaleController.isRTL) {
                                i2 = 3;
                            } else {
                                i2 = 5;
                            }
                            frameLayout3.addView(frameLayout4, LayoutHelper.createFrame(-2, -2.0f, i2 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z5) {
                            View view2 = new View(context) {
                                @Override
                                protected void onDraw(Canvas canvas) {
                                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                                }
                            };
                            view2.setBackgroundColor(getThemedColor(i15));
                            this.dividers.add(view2);
                            frameLayout3.addView(view2, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i13 != 4 && !this.need_card_country) || ((i13 == 5 && !this.need_card_postcode) || (i13 == 2 && !this.need_card_name))) {
                            frameLayout3.setVisibility(8);
                        }
                        i13++;
                    }
                    this.inputFields[i13].setImeOptions(268435461);
                    if (i13 != 0) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                    } else if (i13 != 1) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                    } else if (i13 != 2) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardName));
                    } else if (i13 != 3) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                    } else if (i13 != 4) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                    } else if (i13 == 5) {
                        this.inputFields[i13].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                    }
                    if (i13 == 0) {
                        this.inputFields[i13].addTextChangedListener(new TextWatcher() {
                            private int actionPosition;
                            public final String[] PREFIXES_15 = {"34", "37"};
                            public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                            public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                            private int characterAction = -1;

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                            }

                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                if (i18 == 0 && i19 == 1) {
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i18 == 1 && i19 == 0) {
                                    if (charSequence.charAt(i17) == ' ' && i17 > 0) {
                                        this.characterAction = 3;
                                        this.actionPosition = i17 - 1;
                                        return;
                                    } else {
                                        this.characterAction = 2;
                                        return;
                                    }
                                }
                                this.characterAction = -1;
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                char c6;
                                boolean z6;
                                int i17;
                                int i18;
                                String[] strArr;
                                int i19;
                                String str7;
                                if (PaymentFormActivity.this.ignoreOnCardChange) {
                                    return;
                                }
                                EditTextBoldCursor editTextBoldCursor6 = PaymentFormActivity.this.inputFields[0];
                                int selectionStart = editTextBoldCursor6.getSelectionStart();
                                String string = editTextBoldCursor6.getText().toString();
                                int i20 = 1;
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i21 = 0;
                                while (i21 < string.length()) {
                                    int i22 = i21 + 1;
                                    String strSubstring = string.substring(i21, i22);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i21 = i22;
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = true;
                                String str8 = null;
                                int i23 = 100;
                                if (sb.length() > 0) {
                                    String string2 = sb.toString();
                                    int i24 = 0;
                                    while (true) {
                                        if (i24 >= 3) {
                                            c6 = 1;
                                            break;
                                        }
                                        if (i24 == 0) {
                                            strArr = this.PREFIXES_16;
                                            i19 = 16;
                                            str7 = "xxxx xxxx xxxx xxxx";
                                        } else if (i24 == i20) {
                                            strArr = this.PREFIXES_15;
                                            i19 = 15;
                                            str7 = "xxxx xxxx xxxx xxx";
                                        } else {
                                            strArr = this.PREFIXES_14;
                                            i19 = 14;
                                            str7 = "xxxx xxxx xxxx xx";
                                        }
                                        int i25 = 0;
                                        while (true) {
                                            if (i25 >= strArr.length) {
                                                c6 = 1;
                                                break;
                                            }
                                            String str9 = strArr[i25];
                                            c6 = 1;
                                            if (string2.length() <= str9.length()) {
                                                if (str9.startsWith(string2)) {
                                                    i23 = i19;
                                                    str8 = str7;
                                                    break;
                                                }
                                                i25++;
                                            } else {
                                                if (string2.startsWith(str9)) {
                                                    i23 = i19;
                                                    str8 = str7;
                                                    break;
                                                }
                                                i25++;
                                            }
                                        }
                                        if (str8 != null) {
                                            break;
                                        }
                                        i24++;
                                        i20 = 1;
                                    }
                                    if (sb.length() > i23) {
                                        sb.setLength(i23);
                                    }
                                } else {
                                    c6 = 1;
                                }
                                if (str8 != null) {
                                    if (sb.length() == i23) {
                                        PaymentFormActivity.this.inputFields[c6].requestFocus();
                                    }
                                    editTextBoldCursor6.setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    int i26 = 0;
                                    while (i26 < sb.length()) {
                                        if (i26 < str8.length()) {
                                            if (str8.charAt(i26) == ' ') {
                                                sb.insert(i26, ' ');
                                                i26++;
                                                if (selectionStart == i26 && (i18 = this.characterAction) != 2 && i18 != 3) {
                                                    selectionStart++;
                                                }
                                            }
                                            i26++;
                                        } else {
                                            sb.insert(i26, ' ');
                                            if (selectionStart == i26 + 1 && (i17 = this.characterAction) != 2 && i17 != 3) {
                                                selectionStart++;
                                                break;
                                            } else {
                                                break;
                                                break;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (sb.toString().equals(editable.toString())) {
                                    z6 = false;
                                } else {
                                    z6 = false;
                                    editable.replace(0, editable.length(), sb);
                                }
                                if (selectionStart >= 0) {
                                    editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = z6;
                            }
                        });
                    } else if (i13 == 1) {
                        this.inputFields[i13].addTextChangedListener(new TextWatcher() {
                            private int actionPosition;
                            private int characterAction = -1;
                            private boolean isYear;

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                            }

                            @Override
                            public void beforeTextChanged(CharSequence charSequence, int i17, int i18, int i19) {
                                if (i18 == 0 && i19 == 1) {
                                    this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i18 == 1 && i19 == 0) {
                                    if (charSequence.charAt(i17) == '/' && i17 > 0) {
                                        this.isYear = false;
                                        this.characterAction = 3;
                                        this.actionPosition = i17 - 1;
                                        return;
                                    }
                                    this.characterAction = 2;
                                    return;
                                }
                                this.characterAction = -1;
                            }

                            @Override
                            public void afterTextChanged(Editable editable) {
                                if (PaymentFormActivity.this.ignoreOnCardChange) {
                                    return;
                                }
                                boolean z6 = true;
                                EditTextBoldCursor editTextBoldCursor6 = PaymentFormActivity.this.inputFields[1];
                                int selectionStart = editTextBoldCursor6.getSelectionStart();
                                String string = editTextBoldCursor6.getText().toString();
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i17 = 0;
                                while (i17 < string.length()) {
                                    int i18 = i17 + 1;
                                    String strSubstring = string.substring(i17, i18);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i17 = i18;
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
                                    int i19 = sb.length() > 2 ? 2 : 1;
                                    String[] strArr = new String[i19];
                                    strArr[0] = sb.substring(0, 2);
                                    if (i19 == 2) {
                                        strArr[1] = sb.substring(2);
                                    }
                                    if (sb.length() == 4 && i19 == 2) {
                                        int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                        Calendar calendar = Calendar.getInstance();
                                        boolean z7 = UserConfig.getInstance(((BaseFragment) PaymentFormActivity.this).currentAccount).getClientPhone().startsWith("7") || (PaymentFormActivity.this.country != null && PaymentFormActivity.this.country.code.equals("7"));
                                        int i20 = z7 ? 2022 : calendar.get(1);
                                        int i21 = z7 ? 1 : calendar.get(2) + 1;
                                        if (iIntValue2 < i20 || (iIntValue2 == i20 && iIntValue < i21)) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z6 = false;
                                        }
                                    } else {
                                        int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        if (iIntValue3 > 12 || iIntValue3 == 0) {
                                            PaymentFormActivity.this.inputFields[1].setTextColor(PaymentFormActivity.this.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z6 = false;
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
                                            z6 = false;
                                        }
                                        selectionStart++;
                                    }
                                    z6 = false;
                                }
                                if (!z6 && sb.length() == 4) {
                                    PaymentFormActivity.this.inputFields[PaymentFormActivity.this.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                }
                                if (sb.length() == 2) {
                                    sb.append('/');
                                } else {
                                    if (sb.length() > 2 && sb.charAt(2) != '/') {
                                        sb.insert(2, '/');
                                    }
                                    editTextBoldCursor6.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                    }
                                    PaymentFormActivity.this.ignoreOnCardChange = false;
                                }
                                selectionStart++;
                                editTextBoldCursor6.setText(sb);
                                if (selectionStart >= 0) {
                                    editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                }
                                PaymentFormActivity.this.ignoreOnCardChange = false;
                            }
                        });
                    }
                    this.inputFields[i13].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i13];
                    if (LocaleController.isRTL) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    editTextBoldCursor6.setGravity(i);
                    frameLayout3.addView(this.inputFields[i13], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    this.inputFields[i13].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView2, int i17, KeyEvent keyEvent) {
                            return PaymentFormActivity.$r8$lambda$zP7U4LDiVv1BKdek0pl43kQSei4(this.f$0, textView2, i17, keyEvent);
                        }
                    });
                    if (i13 == 3) {
                        this.sectionCell[0] = new ShadowSectionCell(context, this.resourcesProvider);
                        this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i13 == 5) {
                        this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
                        this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                        TextCheckCell textCheckCell4 = new TextCheckCell(context, this.resourcesProvider);
                        this.checkCell1 = textCheckCell4;
                        textCheckCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                        this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                        this.checkCell1.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view3) {
                                PaymentFormActivity.m3643$r8$lambda$kqLcr1yFvZ2FoOFmjzqVBJY3VA(this.f$0, view3);
                            }
                        });
                        this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        updateSavePaymentField();
                        this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i13 == 0) {
                        createGooglePayButton(context);
                        FrameLayout frameLayout5 = this.googlePayContainer;
                        if (LocaleController.isRTL) {
                            i2 = 3;
                        } else {
                            i2 = 5;
                        }
                        frameLayout3.addView(frameLayout5, LayoutHelper.createFrame(-2, -2.0f, i2 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                    }
                    if (z5) {
                        View view3 = new View(context) {
                            @Override
                            protected void onDraw(Canvas canvas) {
                                canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                            }
                        };
                        view3.setBackgroundColor(getThemedColor(i15));
                        this.dividers.add(view3);
                        frameLayout3.addView(view3, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    if (i13 != 4) {
                    }
                    i13++;
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
        } else if (i7 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.requestedInfo.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.radioCells = new RadioCell[size];
            int i17 = 0;
            while (i17 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.requestedInfo.shipping_options.get(i17);
                this.radioCells[i17] = new RadioCell(context);
                this.radioCells[i17].setTag(Integer.valueOf(i17));
                this.radioCells[i17].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.radioCells[i17].setText(String.format("%s - %s", getTotalPriceString(tL_shippingOption.prices), tL_shippingOption.title), i17 == 0, i17 != size + (-1));
                this.radioCells[i17].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view4) {
                        PaymentFormActivity.$r8$lambda$t0vKGNCaO0faF6PVjgREhwjpPx0(this.f$0, view4);
                    }
                });
                this.linearLayout2.addView(this.radioCells[i17]);
                i17++;
            }
            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
        } else if (i7 == 3) {
            this.inputFields = new EditTextBoldCursor[2];
            int i18 = 0;
            for (int i19 = 2; i18 < i19; i19 = 2) {
                if (i18 == 0) {
                    z = false;
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    z = false;
                }
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setClipChildren(z);
                this.linearLayout2.addView(frameLayout6, LayoutHelper.createLinear(-1, 50));
                int i20 = Theme.key_windowBackgroundWhite;
                frameLayout6.setBackgroundColor(getThemedColor(i20));
                boolean z6 = i18 != 1;
                if (z6) {
                    if (i18 == 7 && !this.paymentForm.invoice.phone_requested) {
                        z6 = false;
                    } else if (i18 == 6) {
                        TLRPC.TL_invoice tL_invoice8 = this.paymentForm.invoice;
                        if (!tL_invoice8.phone_requested && !tL_invoice8.email_requested) {
                            z6 = false;
                        }
                    }
                }
                if (z6) {
                    View view4 = new View(context) {
                        @Override
                        protected void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view4.setBackgroundColor(getThemedColor(i20));
                    this.dividers.add(view4);
                    frameLayout6.addView(view4, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i18] = new EditTextBoldCursor(context);
                this.inputFields[i18].setTag(Integer.valueOf(i18));
                this.inputFields[i18].setTextSize(1, 16.0f);
                this.inputFields[i18].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor7 = this.inputFields[i18];
                int i21 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor7.setTextColor(getThemedColor(i21));
                this.inputFields[i18].setBackgroundDrawable(null);
                this.inputFields[i18].setCursorColor(getThemedColor(i21));
                this.inputFields[i18].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i18].setCursorWidth(1.5f);
                if (i18 == 0) {
                    this.inputFields[i18].setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public final boolean onTouch(View view5, MotionEvent motionEvent) {
                            return PaymentFormActivity.m3644$r8$lambda$lq9LWx85ffust2Y_olLL_Ztadc(view5, motionEvent);
                        }
                    });
                    this.inputFields[i18].setInputType(0);
                } else {
                    this.inputFields[i18].setInputType(129);
                    this.inputFields[i18].setTypeface(Typeface.DEFAULT);
                }
                this.inputFields[i18].setImeOptions(268435462);
                if (i18 == 0) {
                    EditTextBoldCursor editTextBoldCursor8 = this.inputFields[i18];
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
                    editTextBoldCursor8.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                } else if (i18 == 1) {
                    this.inputFields[i18].setHint(LocaleController.getString(R.string.LoginPassword));
                    this.inputFields[i18].requestFocus();
                }
                this.inputFields[i18].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i18].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout6.addView(this.inputFields[i18], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i18].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView2, int i22, KeyEvent keyEvent) {
                        return PaymentFormActivity.$r8$lambda$HPxWleGwK5Y5ffgqnbmTYFGEWi4(this.f$0, textView2, i22, keyEvent);
                    }
                });
                if (i18 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    TextInfoPrivacyCell textInfoPrivacyCell2 = this.bottomCell[0];
                    int i22 = R.string.PaymentConfirmationMessage;
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.savedCredentialsCard;
                    textInfoPrivacyCell2.setText(LocaleController.formatString("PaymentConfirmationMessage", i22, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell[0];
                    int i23 = R.drawable.greydivider;
                    int i24 = Theme.key_windowBackgroundGrayShadow;
                    textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i23, i24));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
                    this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.settingsCell[0].setText(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                    this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0].setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view5) {
                            PaymentFormActivity.$r8$lambda$se9Vc0jAkj0IzJmIaFXUF9Ar6qo(this.f$0, view5);
                        }
                    });
                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i24));
                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                }
                i18++;
            }
        } else if (i7 == 4 || i7 == 5) {
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
            ArrayList arrayList2 = new ArrayList(this.paymentForm.invoice.prices);
            this.prices = arrayList2;
            TLRPC.TL_shippingOption tL_shippingOption2 = this.shippingOption;
            if (tL_shippingOption2 != null) {
                arrayList2.addAll(tL_shippingOption2.prices);
            }
            this.totalPrice = new String[1];
            for (int i25 = 0; i25 < this.prices.size(); i25++) {
                TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.prices.get(i25);
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
            int i26 = Theme.key_windowBackgroundWhite;
            textPriceCell3.setBackgroundColor(getThemedColor(i26));
            this.totalPrice[0] = getTotalPriceString(this.prices);
            this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
            if (this.currentStep != 4 || (this.paymentForm.invoice.flags & 256) == 0) {
                c2 = 6;
                c3 = 5;
            } else {
                FrameLayout frameLayout7 = new FrameLayout(context);
                frameLayout7.setClipChildren(false);
                frameLayout7.setBackgroundColor(getThemedColor(i26));
                this.linearLayout2.addView(frameLayout7, LayoutHelper.createLinear(-1, this.paymentForm.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                frameLayout7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view5) {
                        PaymentFormActivity.$r8$lambda$Q5u4xGw2I_pBI2J8nQfkifBcmMw(this.f$0, view5);
                    }
                });
                TextPriceCell textPriceCell4 = new TextPriceCell(context);
                textPriceCell4.setBackgroundColor(getThemedColor(i26));
                textPriceCell4.setTextAndValue(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                frameLayout7.addView(textPriceCell4);
                this.inputFields = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                EditTextBoldCursor editTextBoldCursor9 = this.inputFields[0];
                int i27 = Theme.key_windowBackgroundWhiteGrayText2;
                editTextBoldCursor9.setHintTextColor(getThemedColor(i27));
                this.inputFields[0].setTextColor(getThemedColor(i27));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[0].setCursorWidth(1.5f);
                this.inputFields[0].setInputType(3);
                this.inputFields[0].setImeOptions(268435462);
                this.inputFields[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.paymentForm.invoice.currency));
                this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[0].setGravity(LocaleController.isRTL ? 3 : 5);
                frameLayout7.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                this.inputFields[0].addTextChangedListener(new TextWatcher() {
                    private boolean anyBefore;
                    private int beforeTextLength;
                    char[] commas = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
                    private int enteredCharacterStart;
                    private boolean isDeletedChar;
                    private boolean lastDotEntered;
                    private String overrideText;

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
                    }

                    private int indexOfComma(String str7) {
                        int i28 = 0;
                        while (true) {
                            char[] cArr = this.commas;
                            if (i28 >= cArr.length) {
                                return -1;
                            }
                            int iIndexOf = str7.indexOf(cArr[i28]);
                            if (iIndexOf >= 0) {
                                return iIndexOf;
                            }
                            i28++;
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        this.anyBefore = !TextUtils.isEmpty(charSequence);
                        this.overrideText = null;
                        this.beforeTextLength = charSequence == null ? 0 : charSequence.length();
                        this.enteredCharacterStart = i28;
                        boolean z7 = i29 == 1 && i30 == 0;
                        this.isDeletedChar = z7;
                        if (!z7) {
                            return;
                        }
                        String strFixNumbers = LocaleController.fixNumbers(charSequence);
                        char cCharAt = strFixNumbers.charAt(i28);
                        int iIndexOfComma = indexOfComma(strFixNumbers);
                        String strSubstring = iIndexOfComma >= 0 ? strFixNumbers.substring(iIndexOfComma + 1) : "";
                        long jLongValue2 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring)).longValue();
                        if ((cCharAt >= '0' && cCharAt <= '9') || (strSubstring.length() != 0 && jLongValue2 == 0)) {
                            if (iIndexOfComma <= 0 || i28 <= iIndexOfComma || jLongValue2 != 0) {
                                return;
                            }
                            this.overrideText = strFixNumbers.substring(0, iIndexOfComma - 1);
                            return;
                        }
                        while (true) {
                            int i31 = i28 - 1;
                            if (i31 < 0) {
                                return;
                            }
                            char cCharAt2 = strFixNumbers.charAt(i31);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                this.overrideText = strFixNumbers.substring(0, i31) + strFixNumbers.substring(i28);
                                return;
                            }
                            i28 = i31;
                        }
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        int iIndexOfComma;
                        String strSubstring;
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        long jLongValue2 = PaymentFormActivity.this.tipAmount != null ? PaymentFormActivity.this.tipAmount.longValue() : 0L;
                        String strFixNumbers = this.overrideText;
                        if (strFixNumbers == null) {
                            strFixNumbers = LocaleController.fixNumbers(editable.toString());
                        }
                        int iIndexOfComma2 = indexOfComma(strFixNumbers);
                        boolean z7 = iIndexOfComma2 >= 0;
                        int currencyExpDivider = LocaleController.getCurrencyExpDivider(PaymentFormActivity.this.paymentForm.invoice.currency);
                        String strSubstring2 = iIndexOfComma2 >= 0 ? strFixNumbers.substring(0, iIndexOfComma2) : strFixNumbers;
                        String currencyString = "";
                        String strSubstring3 = iIndexOfComma2 >= 0 ? strFixNumbers.substring(iIndexOfComma2 + 1) : "";
                        long jLongValue3 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring2)).longValue() * ((long) currencyExpDivider);
                        long jLongValue4 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring3)).longValue();
                        String str7 = "" + jLongValue4;
                        String str8 = "" + (currencyExpDivider - 1);
                        if (iIndexOfComma2 > 0 && str7.length() > str8.length()) {
                            if (this.enteredCharacterStart - iIndexOfComma2 < str7.length()) {
                                strSubstring = str7.substring(0, str8.length());
                            } else {
                                strSubstring = str7.substring(str7.length() - str8.length());
                            }
                            jLongValue4 = Utilities.parseLong(strSubstring).longValue();
                        }
                        PaymentFormActivity.this.tipAmount = Long.valueOf(jLongValue3 + jLongValue4);
                        if (PaymentFormActivity.this.paymentForm.invoice.max_tip_amount != 0 && PaymentFormActivity.this.tipAmount.longValue() > PaymentFormActivity.this.paymentForm.invoice.max_tip_amount) {
                            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                            paymentFormActivity.tipAmount = Long.valueOf(paymentFormActivity.paymentForm.invoice.max_tip_amount);
                        }
                        int selectionStart = PaymentFormActivity.this.inputFields[0].getSelectionStart();
                        PaymentFormActivity.this.ignoreOnTextChange = true;
                        if (PaymentFormActivity.this.tipAmount.longValue() == 0) {
                            PaymentFormActivity.this.inputFields[0].setText("");
                        } else {
                            EditTextBoldCursor editTextBoldCursor10 = PaymentFormActivity.this.inputFields[0];
                            currencyString = LocaleController.getInstance().formatCurrencyString(PaymentFormActivity.this.tipAmount.longValue(), false, z7, true, PaymentFormActivity.this.paymentForm.invoice.currency);
                            editTextBoldCursor10.setText(currencyString);
                        }
                        if (jLongValue2 < PaymentFormActivity.this.tipAmount.longValue() && jLongValue2 != 0 && this.anyBefore && selectionStart >= 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length()));
                        } else if (this.isDeletedChar && this.beforeTextLength != PaymentFormActivity.this.inputFields[0].length()) {
                            PaymentFormActivity.this.inputFields[0].setSelection(Math.max(0, Math.min(selectionStart, PaymentFormActivity.this.inputFields[0].length())));
                        } else if (this.lastDotEntered || !z7 || iIndexOfComma2 < 0 || (iIndexOfComma = indexOfComma(currencyString)) <= 0) {
                            PaymentFormActivity.this.inputFields[0].setSelection(PaymentFormActivity.this.inputFields[0].length());
                        } else {
                            PaymentFormActivity.this.inputFields[0].setSelection(iIndexOfComma + 1);
                        }
                        this.lastDotEntered = z7;
                        PaymentFormActivity.this.updateTotalPrice();
                        this.overrideText = null;
                        PaymentFormActivity.this.ignoreOnTextChange = false;
                    }
                });
                this.inputFields[0].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView2, int i28, KeyEvent keyEvent) {
                        return PaymentFormActivity.$r8$lambda$twxww_K7r_wLtF8pcrVN4TZOQQk(textView2, i28, keyEvent);
                    }
                });
                this.inputFields[0].requestFocus();
                if (this.paymentForm.invoice.suggested_tip_amounts.isEmpty()) {
                    c2 = 6;
                    c3 = 5;
                } else {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView.setVerticalScrollBarEnabled(false);
                    horizontalScrollView.setClipToPadding(false);
                    horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                    horizontalScrollView.setFillViewport(true);
                    frameLayout7.addView(horizontalScrollView, LayoutHelper.createFrame(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    final int[] iArr = new int[1];
                    final int[] iArr2 = new int[1];
                    final int size2 = this.paymentForm.invoice.suggested_tip_amounts.size();
                    c2 = 6;
                    c3 = 5;
                    LinearLayout linearLayout2 = new LinearLayout(context) {
                        boolean ignoreLayout;

                        @Override
                        protected void onMeasure(int i28, int i29) {
                            int size3 = View.MeasureSpec.getSize(i28);
                            this.ignoreLayout = true;
                            int iDp = AndroidUtilities.dp(9.0f);
                            int i30 = size2;
                            int i31 = iDp * (i30 - 1);
                            int i32 = (iArr[0] * i30) + i31;
                            float f = 1.0f;
                            if (i32 <= size3) {
                                setWeightSum(1.0f);
                                int childCount = getChildCount();
                                for (int i33 = 0; i33 < childCount; i33++) {
                                    getChildAt(i33).getLayoutParams().width = 0;
                                    ((LinearLayout.LayoutParams) getChildAt(i33).getLayoutParams()).weight = 1.0f / childCount;
                                }
                            } else if (iArr2[0] + i31 <= size3) {
                                setWeightSum(1.0f);
                                int i34 = size3 - i31;
                                int childCount2 = getChildCount();
                                for (int i35 = 0; i35 < childCount2; i35++) {
                                    View childAt = getChildAt(i35);
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                                    layoutParams.width = 0;
                                    float fIntValue = ((Integer) childAt.getTag(R.id.width_tag)).intValue() / i34;
                                    layoutParams.weight = fIntValue;
                                    f -= fIntValue;
                                }
                                float f2 = f / (size2 - 1);
                                if (f2 > 0.0f) {
                                    int childCount3 = getChildCount();
                                    for (int i36 = 0; i36 < childCount3; i36++) {
                                        View childAt2 = getChildAt(i36);
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                                        if (((Integer) childAt2.getTag(R.id.width_tag)).intValue() != iArr[0]) {
                                            layoutParams2.weight += f2;
                                        }
                                    }
                                }
                            } else {
                                setWeightSum(0.0f);
                                int childCount4 = getChildCount();
                                for (int i37 = 0; i37 < childCount4; i37++) {
                                    getChildAt(i37).getLayoutParams().width = -2;
                                    ((LinearLayout.LayoutParams) getChildAt(i37).getLayoutParams()).weight = 0.0f;
                                }
                            }
                            this.ignoreLayout = false;
                            super.onMeasure(i28, i29);
                        }

                        @Override
                        public void requestLayout() {
                            if (this.ignoreLayout) {
                                return;
                            }
                            super.requestLayout();
                        }
                    };
                    this.tipLayout = linearLayout2;
                    linearLayout2.setOrientation(0);
                    horizontalScrollView.addView(this.tipLayout, LayoutHelper.createScroll(-1, 30, 51));
                    int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
                    int i28 = 0;
                    while (i28 < size2) {
                        if (LocaleController.isRTL) {
                            jLongValue = this.paymentForm.invoice.suggested_tip_amounts.get((size2 - i28) - 1).longValue();
                        } else {
                            jLongValue = this.paymentForm.invoice.suggested_tip_amounts.get(i28).longValue();
                        }
                        String currencyString = LocaleController.getInstance().formatCurrencyString(jLongValue, this.paymentForm.invoice.currency);
                        final TextView textView2 = new TextView(context);
                        textView2.setTextSize(1, 14.0f);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setLines(1);
                        textView2.setTag(Long.valueOf(jLongValue));
                        textView2.setMaxLines(1);
                        textView2.setText(currencyString);
                        textView2.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                        textView2.setTextColor(getThemedColor(Theme.key_chats_secretName));
                        textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(15.0f), 536870911 & themedColor));
                        textView2.setSingleLine(true);
                        textView2.setGravity(17);
                        this.tipLayout.addView(textView2, LayoutHelper.createLinear(-2, -1, 19, 0, 0, i28 != size2 + (-1) ? 9 : 0, 0));
                        textView2.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view5) {
                                PaymentFormActivity.$r8$lambda$sdmufQ8LVvmtFCrY29AfRc4Hktg(this.f$0, textView2, jLongValue, view5);
                            }
                        });
                        int iCeil = ((int) Math.ceil(textView2.getPaint().measureText(currencyString))) + AndroidUtilities.dp(30.0f);
                        textView2.setTag(R.id.width_tag, Integer.valueOf(iCeil));
                        iArr[0] = Math.max(iArr[0], iCeil);
                        iArr2[0] = iArr2[0] + iCeil;
                        i28++;
                    }
                }
            }
            this.linearLayout2.addView(this.totalCell);
            this.sectionCell[2] = new ShadowSectionCell(context, this.resourcesProvider);
            this.sectionCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
            this.detailSettingsCell[0] = new TextDetailSettingsCell(context) {
                @Override
                public void setVisibility(int i29) {
                    super.setVisibility(i29);
                }
            };
            this.detailSettingsCell[0].setBackground(Theme.getSelectorDrawable(true));
            TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[0];
            String str7 = this.cardName;
            textDetailSettingsCell.setTextAndValueAndIcon((str7 == null || str7.length() <= 1) ? this.cardName : this.cardName.substring(0, 1).toUpperCase() + this.cardName.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), R.drawable.msg_payment_card, true);
            int i29 = ((this.isCheckoutPreview || this.allowUnregistered) && ((str = this.cardName) == null || str.length() <= 1)) ? 8 : 0;
            this.detailSettingsCell[0].setVisibility(i29);
            this.linearLayout2.addView(this.detailSettingsCell[0]);
            if (this.currentStep == 4) {
                this.detailSettingsCell[0].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view5) {
                        PaymentFormActivity.$r8$lambda$W8UFoBQ3ITDJq3R_hsqx93tiRik(this.f$0, view5);
                    }
                });
            }
            TLRPC.User user3 = null;
            for (int i30 = 0; i30 < this.paymentForm.users.size(); i30++) {
                TLRPC.User user4 = this.paymentForm.users.get(i30);
                if (user4.id == this.paymentForm.provider_id) {
                    user3 = user4;
                }
            }
            char c6 = 1;
            this.detailSettingsCell[1] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[1].setBackground(Theme.getSelectorDrawable(true));
            if (user3 != null) {
                TextDetailSettingsCell textDetailSettingsCell2 = this.detailSettingsCell[1];
                name = ContactsController.formatName(user3.first_name, user3.last_name);
                String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                int i31 = R.drawable.msg_payment_provider;
                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.validateRequest;
                textDetailSettingsCell2.setTextAndValueAndIcon(name, string, i31, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.shippingOption == null)) && ((tL_paymentRequestedInfo = this.paymentForm.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                c6 = 1;
                this.linearLayout2.addView(this.detailSettingsCell[1]);
            }
            this.detailSettingsCell[c6].setVisibility(user3 != null ? i29 : 8);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
            if (tL_payments_validateRequestedInfo2 != null || (this.isCheckoutPreview && (paymentForm2 = this.paymentForm) != null && paymentForm2.saved_info != null)) {
                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.paymentForm.saved_info;
                this.detailSettingsCell[2] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[2].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[2]);
                if (tL_paymentRequestedInfo12.shipping_address != null) {
                    this.detailSettingsCell[2].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[2].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[2].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view5) {
                                PaymentFormActivity.$r8$lambda$OlXgNV5AdMTQ7VwGK0VEcnZzEaA(this.f$0, view5);
                            }
                        });
                    } else {
                        this.detailSettingsCell[2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[3] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[3].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[3]);
                if (tL_paymentRequestedInfo12.name != null) {
                    this.detailSettingsCell[3].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[3].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[3].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view5) {
                                PaymentFormActivity.m3645$r8$lambda$qmsPCGLDlaSqYvg9W0nd9jigK4(this.f$0, view5);
                            }
                        });
                    } else {
                        this.detailSettingsCell[3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[4] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[4].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[4]);
                if (tL_paymentRequestedInfo12.phone != null) {
                    this.detailSettingsCell[4].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[4].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[4].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view5) {
                                PaymentFormActivity.$r8$lambda$dcrYWJGq6TMbOExux4V1G0Kj8iA(this.f$0, view5);
                            }
                        });
                    } else {
                        this.detailSettingsCell[4].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[c3] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[c3].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[c3]);
                if (tL_paymentRequestedInfo12.email != null) {
                    this.detailSettingsCell[c3].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[c3].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[c3].setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view5) {
                                PaymentFormActivity.m3626$r8$lambda$7bxg_WHOuHtHGXD863z6VpWg(this.f$0, view5);
                            }
                        });
                    } else {
                        this.detailSettingsCell[c3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                if (this.shippingOption != null) {
                    this.detailSettingsCell[c2] = new TextDetailSettingsCell(context);
                    this.detailSettingsCell[c2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.detailSettingsCell[c2].setTextAndValueAndIcon(this.shippingOption.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), R.drawable.msg_payment_delivery, false);
                    this.linearLayout2.addView(this.detailSettingsCell[c2]);
                }
                setAddressFields(tL_paymentRequestedInfo12);
            }
            if (this.currentStep == 4) {
                this.recurrentAccepted = !this.isCheckoutPreview;
                if (this.invoiceInput instanceof TLRPC.TL_inputInvoiceStars) {
                    this.recurrentAccepted = true;
                }
                this.bottomLayout = new BottomFrameLayout(context, this.paymentForm);
                View view5 = new View(context);
                view5.setBackground(Theme.getSelectorDrawable(getThemedColor(Theme.key_listSelector), false));
                this.bottomLayout.addView(view5, LayoutHelper.createFrame(-1, -1.0f));
                frameLayout2.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
                this.bottomLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view6) {
                        PaymentFormActivity.$r8$lambda$hZ2HhJtD1mDP6SxpsEp6lLU9yoE(this.f$0, name, view6);
                    }
                });
                TextView textView3 = new TextView(context);
                this.payTextView = textView3;
                int i32 = Theme.key_contacts_inviteText;
                textView3.setTextColor(getThemedColor(i32));
                this.payTextView.setText(LocaleController.formatString(R.string.PaymentCheckoutPay, this.totalPrice[0]));
                this.payTextView.setTextSize(1, 14.0f);
                this.payTextView.setGravity(17);
                this.payTextView.setTypeface(AndroidUtilities.bold());
                this.bottomLayout.addView(this.payTextView, LayoutHelper.createFrame(-1, -1.0f));
                ContextProgressView contextProgressView2 = new ContextProgressView(context, 0);
                this.progressViewButton = contextProgressView2;
                contextProgressView2.setVisibility(4);
                int themedColor2 = getThemedColor(i32);
                this.progressViewButton.setColors(805306367 & themedColor2, themedColor2);
                this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1, -1.0f));
                this.bottomLayout.setChecked(this.recurrentAccepted, false);
                this.payTextView.setAlpha(!this.recurrentAccepted ? 0.8f : 1.0f);
                this.doneItem.setEnabled(false);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                try {
                    WebView webView2 = new WebView(context) {
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
                    this.webView.setWebViewClient(new AnonymousClass19(context));
                } catch (Exception e5) {
                    FileLog.e(e5);
                }
                this.recurrentAcceptCell = null;
                if (this.paymentForm.invoice.terms_url != null) {
                    RecurrentPaymentsAcceptCell recurrentPaymentsAcceptCell = new RecurrentPaymentsAcceptCell(context, getResourceProvider());
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
                            int i33 = iLastIndexOf + 1;
                            spannableStringBuilder.replace(iIndexOf, i33, (CharSequence) spannableString);
                            string2.substring(0, iIndexOf);
                            spannableString.toString();
                            string2.substring(i33);
                        }
                    } else {
                        String string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                        spannableStringBuilder = new SpannableStringBuilder(string3);
                        int iIndexOf2 = string3.indexOf(42);
                        int iLastIndexOf2 = string3.lastIndexOf(42);
                        if (iIndexOf2 != -1 && iLastIndexOf2 != -1) {
                            SpannableString spannableString2 = new SpannableString(string3.substring(iIndexOf2 + 1, iLastIndexOf2));
                            spannableString2.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), 0, spannableString2.length(), 33);
                            int i34 = iLastIndexOf2 + 1;
                            spannableStringBuilder.replace(iIndexOf2, i34, (CharSequence) spannableString2);
                            string3 = string3.substring(0, iIndexOf2) + ((Object) spannableString2) + string3.substring(i34);
                        }
                        int iIndexOf3 = string3.indexOf("%1$s");
                        if (iIndexOf3 != -1) {
                            spannableStringBuilder.replace(iIndexOf3, iIndexOf3 + 4, (CharSequence) this.currentBotName);
                            spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf3, this.currentBotName.length() + iIndexOf3, 33);
                        }
                    }
                    this.recurrentAcceptCell.setText(spannableStringBuilder);
                    this.recurrentAcceptCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_listSelector)));
                    this.recurrentAcceptCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view6) {
                            PaymentFormActivity.$r8$lambda$F_M_1N_xFi_fMKnWCTFLNg7yuXM(this.f$0, view6);
                        }
                    });
                    frameLayout2.addView(this.recurrentAcceptCell, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                }
                WebView webView3 = this.webView;
                if (webView3 != null) {
                    frameLayout2.addView(webView3, LayoutHelper.createFrame(-1, -1.0f));
                    this.webView.setVisibility(8);
                }
            }
            this.sectionCell[1] = new ShadowSectionCell(context, this.resourcesProvider);
            this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i29 != 0 && this.currentStep == 4 && this.validateRequest == null && ((paymentForm = this.paymentForm) == null || paymentForm.saved_info == null)) {
                c4 = 1;
                this.sectionCell[1].setVisibility(i29);
            } else {
                c4 = 1;
            }
            this.linearLayout2.addView(this.sectionCell[c4], LayoutHelper.createLinear(-1, -2));
        } else if (i7 == 6) {
            EditTextSettingsCell editTextSettingsCell = new EditTextSettingsCell(context);
            this.codeFieldCell = editTextSettingsCell;
            editTextSettingsCell.setTextAndHint("", LocaleController.getString(R.string.PasswordCode), false);
            this.codeFieldCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            EditTextBoldCursor textView4 = this.codeFieldCell.getTextView();
            textView4.setInputType(3);
            textView4.setImeOptions(6);
            textView4.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView5, int i35, KeyEvent keyEvent) {
                    return PaymentFormActivity.$r8$lambda$N6kB93kUL8pbVS3q0yheLAkVLB4(this.f$0, textView5, i35, keyEvent);
                }
            });
            textView4.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i35, int i36, int i37) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i35, int i36, int i37) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (PaymentFormActivity.this.emailCodeLength == 0 || editable.length() != PaymentFormActivity.this.emailCodeLength) {
                        return;
                    }
                    PaymentFormActivity.this.sendSavePassword(false);
                }
            });
            this.linearLayout2.addView(this.codeFieldCell, LayoutHelper.createLinear(-1, -2));
            this.bottomCell[2] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[2], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[1].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell = this.settingsCell[1];
            int i35 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i35));
            this.settingsCell[1].setTextColor(getThemedColor(i35));
            this.settingsCell[1].setText(LocaleController.getString(R.string.ResendCode), true);
            this.linearLayout2.addView(this.settingsCell[1], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view6) {
                    PaymentFormActivity.$r8$lambda$C3skaAV3f6ysI_X45MrM1zoH_vI(this.f$0, view6);
                }
            });
            this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell2 = this.settingsCell[0];
            int i36 = Theme.key_text_RedRegular;
            textSettingsCell2.setTag(Integer.valueOf(i36));
            this.settingsCell[0].setTextColor(getThemedColor(i36));
            this.settingsCell[0].setText(LocaleController.getString(R.string.AbortPassword), false);
            this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[0].setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view6) {
                    PaymentFormActivity.m3649$r8$lambda$zQtDgcEy4cmbAoDOjG3_VSHTcY(this.f$0, view6);
                }
            });
            this.inputFields = new EditTextBoldCursor[3];
            int i37 = 0;
            for (int i38 = 3; i37 < i38; i38 = 3) {
                if (i37 == 0) {
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else if (i37 == 2) {
                    this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                    this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                }
                FrameLayout frameLayout8 = new FrameLayout(context);
                frameLayout8.setClipChildren(false);
                this.linearLayout2.addView(frameLayout8, LayoutHelper.createLinear(-1, 50));
                int i39 = Theme.key_windowBackgroundWhite;
                frameLayout8.setBackgroundColor(getThemedColor(i39));
                if (i37 == 0) {
                    View view6 = new View(context) {
                        @Override
                        protected void onDraw(Canvas canvas) {
                            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                        }
                    };
                    view6.setBackgroundColor(getThemedColor(i39));
                    this.dividers.add(view6);
                    frameLayout8.addView(view6, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i37] = new EditTextBoldCursor(context);
                this.inputFields[i37].setTag(Integer.valueOf(i37));
                this.inputFields[i37].setTextSize(1, 16.0f);
                this.inputFields[i37].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor10 = this.inputFields[i37];
                int i40 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor10.setTextColor(getThemedColor(i40));
                this.inputFields[i37].setBackgroundDrawable(null);
                this.inputFields[i37].setCursorColor(getThemedColor(i40));
                this.inputFields[i37].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i37].setCursorWidth(1.5f);
                if (i37 == 0 || i37 == 1) {
                    this.inputFields[i37].setInputType(129);
                    this.inputFields[i37].setTypeface(Typeface.DEFAULT);
                    this.inputFields[i37].setImeOptions(268435461);
                } else {
                    this.inputFields[i37].setInputType(33);
                    this.inputFields[i37].setImeOptions(268435462);
                }
                if (i37 == 0) {
                    this.inputFields[i37].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                    this.inputFields[i37].requestFocus();
                } else if (i37 == 1) {
                    this.inputFields[i37].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                } else if (i37 == 2) {
                    this.inputFields[i37].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                }
                this.inputFields[i37].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i37].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout8.addView(this.inputFields[i37], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                this.inputFields[i37].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView5, int i41, KeyEvent keyEvent) {
                        return PaymentFormActivity.m3627$r8$lambda$8HTAiuMGTlm3HOMJIpK4EtuoZE(this.f$0, textView5, i41, keyEvent);
                    }
                });
                if (i37 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                    this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    if (i37 == 2) {
                        this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                        this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    i37++;
                }
                i37++;
            }
            updatePasswordFields();
        }
        return this.fragmentView;
    }

    public static boolean m3642$r8$lambda$hT4BhQBsShItfGVcQ2f2uOdPCY(final PaymentFormActivity paymentFormActivity, View view, MotionEvent motionEvent) {
        if (paymentFormActivity.getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PaymentFormActivity.$r8$lambda$8CEXBHbaVlyTJgT0mRABsp6_qA4(this.f$0, country);
                }
            });
            paymentFormActivity.presentFragment(countrySelectActivity);
        }
        return true;
    }

    public static void $r8$lambda$8CEXBHbaVlyTJgT0mRABsp6_qA4(PaymentFormActivity paymentFormActivity, CountrySelectActivity.Country country) {
        paymentFormActivity.country = country;
        paymentFormActivity.inputFields[4].setText(country.name);
        paymentFormActivity.countryName = country.shortname;
    }

    public static boolean $r8$lambda$_xpvioDeDolOOo1dRCH7vn9igfA(PaymentFormActivity paymentFormActivity, TextView textView, int i, KeyEvent keyEvent) {
        paymentFormActivity.getClass();
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            paymentFormActivity.doneItem.performClick();
            return true;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        while (true) {
            iIntValue++;
            EditTextBoldCursor[] editTextBoldCursorArr = paymentFormActivity.inputFields;
            if (iIntValue < editTextBoldCursorArr.length) {
                if (iIntValue != 4 && ((View) editTextBoldCursorArr[iIntValue].getParent()).getVisibility() == 0) {
                    paymentFormActivity.inputFields[iIntValue].requestFocus();
                    break;
                }
            } else {
                break;
            }
        }
        return true;
    }

    public static void $r8$lambda$2L_7stVP8ayvLJIsDSOnxPCLnfk(PaymentFormActivity paymentFormActivity, View view) {
        boolean z = !paymentFormActivity.saveShippingInfo;
        paymentFormActivity.saveShippingInfo = z;
        paymentFormActivity.checkCell1.setChecked(z);
    }

    class AnonymousClass6 extends WebViewClient {
        final Context val$context;

        AnonymousClass6(Context context) {
            this.val$context = context;
        }

        @Override
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                    @Override
                    public final void run() {
                        Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                    }
                })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public void onLoadResource(WebView webView, String str) {
            super.onLoadResource(webView, str);
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
                        new AlertDialog.Builder(this.val$context).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    }
                    return true;
                }
            } catch (Exception unused2) {
            }
            return super.shouldOverrideUrlLoading(webView, str);
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
        }
    }

    public static void m3646$r8$lambda$tnYLHj6FmZVDfxMwo9veCy07Ag(PaymentFormActivity paymentFormActivity, View view) {
        boolean z = !paymentFormActivity.saveCardInfo;
        paymentFormActivity.saveCardInfo = z;
        paymentFormActivity.checkCell1.setChecked(z);
    }

    public static boolean $r8$lambda$MEW6qeCGYUv7uo4IKKm2jXe_wvk(final PaymentFormActivity paymentFormActivity, View view, MotionEvent motionEvent) {
        if (paymentFormActivity.getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(false);
            countrySelectActivity.setDisableAnonymousNumbers(true);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    PaymentFormActivity.$r8$lambda$cnworGFgtBly6XXDf7cMbjLtP6E(this.f$0, country);
                }
            });
            paymentFormActivity.presentFragment(countrySelectActivity);
        }
        return true;
    }

    public static void $r8$lambda$cnworGFgtBly6XXDf7cMbjLtP6E(PaymentFormActivity paymentFormActivity, CountrySelectActivity.Country country) {
        paymentFormActivity.country = country;
        paymentFormActivity.inputFields[4].setText(country.name);
    }

    public static boolean $r8$lambda$zP7U4LDiVv1BKdek0pl43kQSei4(PaymentFormActivity paymentFormActivity, TextView textView, int i, KeyEvent keyEvent) {
        EditTextBoldCursor[] editTextBoldCursorArr;
        paymentFormActivity.getClass();
        if (i != 5) {
            if (i != 6) {
                return false;
            }
            paymentFormActivity.doneItem.performClick();
            return true;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        do {
            int i2 = iIntValue + 1;
            editTextBoldCursorArr = paymentFormActivity.inputFields;
            if (i2 < editTextBoldCursorArr.length) {
                iIntValue = i2 == 4 ? iIntValue + 2 : i2;
            }
            return true;
        } while (((View) editTextBoldCursorArr[iIntValue].getParent()).getVisibility() != 0);
        paymentFormActivity.inputFields[iIntValue].requestFocus();
        return true;
    }

    public static void m3643$r8$lambda$kqLcr1yFvZ2FoOFmjzqVBJY3VA(PaymentFormActivity paymentFormActivity, View view) {
        boolean z = !paymentFormActivity.saveCardInfo;
        paymentFormActivity.saveCardInfo = z;
        paymentFormActivity.checkCell1.setChecked(z);
    }

    public static void $r8$lambda$t0vKGNCaO0faF6PVjgREhwjpPx0(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.getClass();
        int iIntValue = ((Integer) view.getTag()).intValue();
        int i = 0;
        while (true) {
            RadioCell[] radioCellArr = paymentFormActivity.radioCells;
            if (i >= radioCellArr.length) {
                return;
            }
            radioCellArr[i].setChecked(iIntValue == i, true);
            i++;
        }
    }

    public static boolean $r8$lambda$HPxWleGwK5Y5ffgqnbmTYFGEWi4(PaymentFormActivity paymentFormActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            paymentFormActivity.doneItem.performClick();
            return true;
        }
        paymentFormActivity.getClass();
        return false;
    }

    public static void $r8$lambda$se9Vc0jAkj0IzJmIaFXUF9Ar6qo(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.passwordOk = false;
        paymentFormActivity.goToNextStep();
    }

    public static void $r8$lambda$Q5u4xGw2I_pBI2J8nQfkifBcmMw(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(paymentFormActivity.inputFields[0]);
    }

    public static boolean $r8$lambda$twxww_K7r_wLtF8pcrVN4TZOQQk(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        AndroidUtilities.hideKeyboard(textView);
        return true;
    }

    public static void $r8$lambda$sdmufQ8LVvmtFCrY29AfRc4Hktg(PaymentFormActivity paymentFormActivity, TextView textView, long j, View view) {
        paymentFormActivity.getClass();
        long jLongValue = ((Long) textView.getTag()).longValue();
        Long l = paymentFormActivity.tipAmount;
        if (l != null && jLongValue == l.longValue()) {
            paymentFormActivity.ignoreOnTextChange = true;
            paymentFormActivity.inputFields[0].setText("");
            paymentFormActivity.ignoreOnTextChange = false;
            paymentFormActivity.tipAmount = 0L;
            paymentFormActivity.updateTotalPrice();
        } else {
            paymentFormActivity.inputFields[0].setText(LocaleController.getInstance().formatCurrencyString(j, false, true, true, paymentFormActivity.paymentForm.invoice.currency));
        }
        EditTextBoldCursor editTextBoldCursor = paymentFormActivity.inputFields[0];
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
    }

    public static void $r8$lambda$W8UFoBQ3ITDJq3R_hsqx93tiRik(PaymentFormActivity paymentFormActivity, View view) {
        if (paymentFormActivity.getParentActivity() == null) {
            return;
        }
        paymentFormActivity.showChoosePaymentMethod();
    }

    public static void $r8$lambda$OlXgNV5AdMTQ7VwGK0VEcnZzEaA(PaymentFormActivity paymentFormActivity, View view) {
        PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 0, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
        paymentFormActivity2.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
        paymentFormActivity2.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
        paymentFormActivity2.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity3 = PaymentFormActivity.this;
                paymentFormActivity3.setAddressFields(paymentFormActivity3.validateRequest.info);
            }
        });
        paymentFormActivity.presentFragment(paymentFormActivity2);
    }

    public static void m3645$r8$lambda$qmsPCGLDlaSqYvg9W0nd9jigK4(PaymentFormActivity paymentFormActivity, View view) {
        PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 0, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
        paymentFormActivity2.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
        paymentFormActivity2.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
        paymentFormActivity2.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity3 = PaymentFormActivity.this;
                paymentFormActivity3.setAddressFields(paymentFormActivity3.validateRequest.info);
            }
        });
        paymentFormActivity.presentFragment(paymentFormActivity2);
    }

    public static void $r8$lambda$dcrYWJGq6TMbOExux4V1G0Kj8iA(PaymentFormActivity paymentFormActivity, View view) {
        PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 0, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
        paymentFormActivity2.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
        paymentFormActivity2.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
        paymentFormActivity2.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity3 = PaymentFormActivity.this;
                paymentFormActivity3.setAddressFields(paymentFormActivity3.validateRequest.info);
            }
        });
        paymentFormActivity.presentFragment(paymentFormActivity2);
    }

    public static void m3626$r8$lambda$7bxg_WHOuHtHGXD863z6VpWg(PaymentFormActivity paymentFormActivity, View view) {
        PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 0, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
        paymentFormActivity2.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
        paymentFormActivity2.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
        paymentFormActivity2.setDelegate(new PaymentFormActivityDelegate() {
            @Override
            public void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return PaymentFormActivityDelegate.CC.$default$didSelectNewCard(this, str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
            }

            @Override
            public void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity.this.validateRequest = tL_payments_validateRequestedInfo;
                PaymentFormActivity paymentFormActivity3 = PaymentFormActivity.this;
                paymentFormActivity3.setAddressFields(paymentFormActivity3.validateRequest.info);
            }
        });
        paymentFormActivity.presentFragment(paymentFormActivity2);
    }

    public static void $r8$lambda$hZ2HhJtD1mDP6SxpsEp6lLU9yoE(final org.telegram.ui.PaymentFormActivity r22, java.lang.String r23, final android.view.View r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PaymentFormActivity.$r8$lambda$hZ2HhJtD1mDP6SxpsEp6lLU9yoE(org.telegram.ui.PaymentFormActivity, java.lang.String, android.view.View):void");
    }

    public static void $r8$lambda$waW0Mc3Dc94ZoINnAWkqcSmK9RE(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.setDonePressed(false);
        view.callOnClick();
    }

    class AnonymousClass19 extends WebViewClient {
        final Context val$context;

        AnonymousClass19(Context context) {
            this.val$context = context;
        }

        @Override
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            try {
                if (!AndroidUtilities.isSafeToShow(PaymentFormActivity.this.getContext())) {
                    return true;
                }
                new AlertDialog.Builder(PaymentFormActivity.this.getContext(), PaymentFormActivity.this.resourcesProvider).setTitle(LocaleController.getString(R.string.ChromeCrashTitle)).setMessage(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new Runnable() {
                    @Override
                    public final void run() {
                        Browser.openUrl(PaymentFormActivity.this.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                    }
                })).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity.this.webviewLoading = false;
            PaymentFormActivity.this.showEditDoneProgress(true, false);
            PaymentFormActivity.this.updateSavePaymentField();
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
                if (PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(uri.getScheme())) {
                    return false;
                }
                try {
                    if (PaymentFormActivity.this.getContext() instanceof Activity) {
                        ((Activity) PaymentFormActivity.this.getContext()).startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                    }
                } catch (ActivityNotFoundException unused) {
                    new AlertDialog.Builder(this.val$context).setTitle(PaymentFormActivity.this.currentBotName).setMessage(LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                }
                return true;
            } catch (Exception unused2) {
                return false;
            }
        }
    }

    public static void $r8$lambda$F_M_1N_xFi_fMKnWCTFLNg7yuXM(PaymentFormActivity paymentFormActivity, View view) {
        if (paymentFormActivity.donePressed) {
            return;
        }
        boolean z = !paymentFormActivity.recurrentAccepted;
        paymentFormActivity.recurrentAccepted = z;
        paymentFormActivity.recurrentAcceptCell.setChecked(z);
        paymentFormActivity.bottomLayout.setChecked(paymentFormActivity.recurrentAccepted, true);
    }

    public static boolean $r8$lambda$N6kB93kUL8pbVS3q0yheLAkVLB4(PaymentFormActivity paymentFormActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            paymentFormActivity.sendSavePassword(false);
            return true;
        }
        paymentFormActivity.getClass();
        return false;
    }

    public static void $r8$lambda$C3skaAV3f6ysI_X45MrM1zoH_vI(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.getClass();
        ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.m3624$r8$lambda$n8ObnsWdeFAzl5V43MAtxv73w(tLObject, tL_error);
            }
        }, paymentFormActivity.allowUnregistered ? 8 : 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity());
        builder.setMessage(LocaleController.getString(R.string.ResendCodeInfo));
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        paymentFormActivity.showDialog(builder.create());
    }

    public static void m3649$r8$lambda$zQtDgcEy4cmbAoDOjG3_VSHTcY(final PaymentFormActivity paymentFormActivity, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity());
        String string = LocaleController.getString(R.string.TurnPasswordOffQuestion);
        if (paymentFormActivity.currentPassword.has_secure_values) {
            string = string + "\n\n" + LocaleController.getString(R.string.TurnPasswordOffPassport);
        }
        builder.setMessage(string);
        builder.setTitle(LocaleController.getString(R.string.TurnPasswordOffQuestionTitle));
        builder.setPositiveButton(LocaleController.getString(R.string.Disable), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.sendSavePassword(true);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        paymentFormActivity.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedBold));
        }
    }

    public static boolean m3627$r8$lambda$8HTAiuMGTlm3HOMJIpK4EtuoZE(PaymentFormActivity paymentFormActivity, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            paymentFormActivity.doneItem.performClick();
            return true;
        }
        paymentFormActivity.getClass();
        if (i != 5) {
            return false;
        }
        int iIntValue = ((Integer) textView.getTag()).intValue();
        if (iIntValue == 0) {
            paymentFormActivity.inputFields[1].requestFocus();
            return false;
        }
        if (iIntValue != 1) {
            return false;
        }
        paymentFormActivity.inputFields[2].requestFocus();
        return false;
    }

    private void showChoosePaymentMethod() {
        showChoosePaymentMethod(null);
    }

    private void showChoosePaymentMethod(final Runnable runnable) {
        BottomSheet.Builder title = new BottomSheet.Builder(getParentActivity()).setTitle(LocaleController.getString(R.string.PaymentCheckoutMethod), true);
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
        title.setItems((CharSequence[]) arrayList.toArray(new CharSequence[0]), iArr, new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i4) {
                PaymentFormActivity.m3638$r8$lambda$Y_FwaCgqq1zRMwRnn0qiyrZnMQ(this.f$0, runnable, arrayList3, arrayList, dialogInterface, i4);
            }
        });
        showDialog(title.create());
    }

    public static void m3638$r8$lambda$Y_FwaCgqq1zRMwRnn0qiyrZnMQ(PaymentFormActivity paymentFormActivity, final Runnable runnable, List list, List list2, DialogInterface dialogInterface, int i) {
        paymentFormActivity.getClass();
        PaymentFormActivityDelegate paymentFormActivityDelegate = new PaymentFormActivityDelegate() {
            @Override
            public void currentPasswordUpdated(TL_account.Password password) {
                PaymentFormActivityDelegate.CC.$default$currentPasswordUpdated(this, password);
            }

            @Override
            public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivityDelegate.CC.$default$didSelectNewAddress(this, tL_payments_validateRequestedInfo);
            }

            @Override
            public void onFragmentDestroyed() {
                PaymentFormActivityDelegate.CC.$default$onFragmentDestroyed(this);
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
        };
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = paymentFormActivity.savedCredentialsCard;
        int i2 = (tL_paymentSavedCredentialsCard == null && paymentFormActivity.cardName == null) ? 0 : 1;
        if (!(tL_paymentSavedCredentialsCard == null && paymentFormActivity.cardName == null) && i == 0) {
            return;
        }
        if (i >= i2 && i < list.size() + i2) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) list.get(i - i2);
            paymentFormActivity.savedCredentialsCard = tL_paymentSavedCredentialsCard2;
            paymentFormActivityDelegate.didSelectNewCard(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
            return;
        }
        if (i < list2.size() - 1) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = paymentFormActivity.paymentForm.additional_methods.get((i - list.size()) - i2);
            PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 2, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
            paymentFormActivity2.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
            paymentFormActivity2.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
            paymentFormActivity2.setPaymentMethod(tL_paymentFormMethod);
            paymentFormActivity2.setDelegate(paymentFormActivityDelegate);
            paymentFormActivity.presentFragment(paymentFormActivity2);
            return;
        }
        if (i == list2.size() - 1) {
            PaymentFormActivity paymentFormActivity3 = new PaymentFormActivity(paymentFormActivity.invoiceInput, paymentFormActivity.paymentForm, paymentFormActivity.messageObject, paymentFormActivity.invoiceSlug, 2, paymentFormActivity.requestedInfo, paymentFormActivity.shippingOption, paymentFormActivity.tipAmount, null, paymentFormActivity.cardName, paymentFormActivity.validateRequest, paymentFormActivity.saveCardInfo, null, paymentFormActivity.parentFragment, paymentFormActivity.allowUnregistered);
            paymentFormActivity3.setCustomResultReceiver(paymentFormActivity.customResultReceiver);
            paymentFormActivity3.setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver);
            paymentFormActivity3.setDelegate(paymentFormActivityDelegate);
            paymentFormActivity.presentFragment(paymentFormActivity3);
        }
    }

    private void setPaymentMethod(TLRPC.TL_paymentFormMethod tL_paymentFormMethod) {
        this.paymentFormMethod = tL_paymentFormMethod;
    }

    public void setAddressFields(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        if (tL_postAddress != null) {
            this.detailSettingsCell[2].setTextAndValueAndIcon(String.format("%s %s, %s, %s, %s, %s", tL_postAddress.street_line1, tL_postAddress.street_line2, tL_postAddress.city, tL_postAddress.state, tL_postAddress.country_iso2, tL_postAddress.post_code), LocaleController.getString(R.string.PaymentShippingAddress), R.drawable.msg_payment_address, true);
        }
        this.detailSettingsCell[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str = tL_paymentRequestedInfo.name;
        if (str != null) {
            this.detailSettingsCell[3].setTextAndValueAndIcon(str, LocaleController.getString(R.string.PaymentCheckoutName), R.drawable.msg_contacts, true);
        }
        this.detailSettingsCell[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            this.detailSettingsCell[4].setTextAndValueAndIcon(PhoneFormat.getInstance().format(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), R.drawable.msg_calls, (tL_paymentRequestedInfo.email == null && this.shippingOption == null) ? false : true);
        }
        this.detailSettingsCell[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str2 = tL_paymentRequestedInfo.email;
        if (str2 != null) {
            this.detailSettingsCell[5].setTextAndValueAndIcon(str2, LocaleController.getString(R.string.PaymentCheckoutEmail), R.drawable.msg_mention, this.shippingOption != null);
        }
        this.detailSettingsCell[5].setVisibility(tL_paymentRequestedInfo.email == null ? 8 : 0);
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
                    Theme.setDrawableColor(textView2.getBackground(), themedColor);
                    textView2.setTextColor(getThemedColor(Theme.key_contacts_inviteText));
                } else {
                    Theme.setDrawableColor(textView2.getBackground(), 536870911 & themedColor);
                    textView2.setTextColor(getThemedColor(Theme.key_chats_secretName));
                }
                textView2.invalidate();
            }
        }
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
        this.googlePayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PaymentFormActivity.$r8$lambda$W75b7YwKd90RnJCZkFgvaa5GZLA(this.f$0, view);
            }
        });
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

    public static void $r8$lambda$W75b7YwKd90RnJCZkFgvaa5GZLA(PaymentFormActivity paymentFormActivity, View view) {
        paymentFormActivity.googlePayButton.setClickable(false);
        try {
            JSONObject baseRequest = paymentFormActivity.getBaseRequest();
            JSONObject baseCardPaymentMethod = paymentFormActivity.getBaseCardPaymentMethod();
            if (paymentFormActivity.googlePayPublicKey != null && paymentFormActivity.googlePayParameters == null) {
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
            } else {
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
            }
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(baseCardPaymentMethod));
            JSONObject jSONObject = new JSONObject();
            ArrayList arrayList = new ArrayList(paymentFormActivity.paymentForm.invoice.prices);
            TLRPC.TL_shippingOption tL_shippingOption = paymentFormActivity.shippingOption;
            if (tL_shippingOption != null) {
                arrayList.addAll(tL_shippingOption.prices);
            }
            String totalPriceDecimalString = paymentFormActivity.getTotalPriceDecimalString(arrayList);
            paymentFormActivity.totalPriceDecimal = totalPriceDecimalString;
            jSONObject.put("totalPrice", totalPriceDecimalString);
            jSONObject.put("totalPriceStatus", "FINAL");
            if (!TextUtils.isEmpty(paymentFormActivity.googlePayCountryCode)) {
                jSONObject.put("countryCode", paymentFormActivity.googlePayCountryCode);
            }
            jSONObject.put("currencyCode", paymentFormActivity.paymentForm.invoice.currency);
            jSONObject.put("checkoutOption", "COMPLETE_IMMEDIATE_PURCHASE");
            baseRequest.put("transactionInfo", jSONObject);
            baseRequest.put("merchantInfo", new JSONObject().put("merchantName", paymentFormActivity.currentBotName));
            PaymentDataRequest paymentDataRequestFromJson = PaymentDataRequest.fromJson(baseRequest.toString());
            if (paymentDataRequestFromJson != null) {
                AutoResolveHelper.resolveTask(paymentFormActivity.paymentsClient.loadPaymentData(paymentDataRequestFromJson), paymentFormActivity.getParentActivity(), 991);
            }
        } catch (JSONException e) {
            FileLog.e(e);
        }
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
                ((View) this.dividers.get(i)).setVisibility(8);
                i++;
            }
            return;
        }
        showEditDoneProgress(true, false);
        if (this.waitingForEmail) {
            TextInfoPrivacyCell textInfoPrivacyCell = this.bottomCell[2];
            int i3 = R.string.EmailPasswordConfirmText2;
            String str = this.currentPassword.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            textInfoPrivacyCell.setText(LocaleController.formatString("EmailPasswordConfirmText2", i3, str));
            this.bottomCell[2].setVisibility(0);
            this.settingsCell[0].setVisibility(0);
            this.settingsCell[1].setVisibility(0);
            this.codeFieldCell.setVisibility(0);
            this.bottomCell[1].setText("");
            this.headerCell[0].setVisibility(8);
            this.headerCell[1].setVisibility(8);
            this.bottomCell[0].setVisibility(8);
            for (int i4 = 0; i4 < 3; i4++) {
                ((View) this.inputFields[i4].getParent()).setVisibility(8);
            }
            while (i < this.dividers.size()) {
                ((View) this.dividers.get(i)).setVisibility(8);
                i++;
            }
            return;
        }
        this.bottomCell[2].setVisibility(8);
        this.settingsCell[0].setVisibility(8);
        this.settingsCell[1].setVisibility(8);
        this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
        this.codeFieldCell.setVisibility(8);
        this.headerCell[0].setVisibility(0);
        this.headerCell[1].setVisibility(0);
        this.bottomCell[0].setVisibility(0);
        for (int i5 = 0; i5 < 3; i5++) {
            ((View) this.inputFields[i5].getParent()).setVisibility(0);
        }
        for (int i6 = 0; i6 < this.dividers.size(); i6++) {
            ((View) this.dividers.get(i6)).setVisibility(0);
        }
    }

    private void loadPasswordInfo() {
        if (this.loadingPasswordInfo) {
            return;
        }
        this.loadingPasswordInfo = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$aXyi81hBYhF4dLEtIYXjKAiccX4(this.f$0, tLObject, tL_error);
            }
        }, 10);
    }

    public static void $r8$lambda$aXyi81hBYhF4dLEtIYXjKAiccX4(final PaymentFormActivity paymentFormActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.m3637$r8$lambda$YNahaVSH5vPagJMtT0YYPp7Q(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m3637$r8$lambda$YNahaVSH5vPagJMtT0YYPp7Q(final PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        paymentFormActivity.loadingPasswordInfo = false;
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            paymentFormActivity.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(paymentFormActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            TLRPC.PaymentForm paymentForm = paymentFormActivity.paymentForm;
            if (paymentForm != null && paymentFormActivity.currentPassword.has_password) {
                paymentForm.password_missing = false;
                paymentForm.can_save_credentials = true;
                paymentFormActivity.updateSavePaymentField();
            }
            TwoStepVerificationActivity.initPasswordNewAlgo(paymentFormActivity.currentPassword);
            PaymentFormActivity paymentFormActivity2 = paymentFormActivity.passwordFragment;
            if (paymentFormActivity2 != null) {
                paymentFormActivity2.setCurrentPassword(paymentFormActivity.currentPassword);
            }
            if (paymentFormActivity.currentPassword.has_password || paymentFormActivity.shortPollRunnable != null) {
                return;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.m3634$r8$lambda$LrF7PnrdU6Xmqgo4gMClZJO9Zo(this.f$0);
                }
            };
            paymentFormActivity.shortPollRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    public static void m3634$r8$lambda$LrF7PnrdU6Xmqgo4gMClZJO9Zo(PaymentFormActivity paymentFormActivity) {
        if (paymentFormActivity.shortPollRunnable == null) {
            return;
        }
        paymentFormActivity.loadPasswordInfo();
        paymentFormActivity.shortPollRunnable = null;
    }

    private void showAlertWithText(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    public void showPayAlert(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.PaymentTransactionReview));
        builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.currentBotName, this.currentItemName)));
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                PaymentFormActivity.$r8$lambda$R7IJXObAchnN3bVlvr3dfwlmtlc(this.f$0, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(builder.create());
    }

    public static void $r8$lambda$R7IJXObAchnN3bVlvr3dfwlmtlc(PaymentFormActivity paymentFormActivity, AlertDialog alertDialog, int i) {
        paymentFormActivity.setDonePressed(true);
        paymentFormActivity.sendData();
    }

    private JSONObject getBaseRequest() {
        return new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
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

    public Optional getIsReadyToPayRequest() {
        try {
            JSONObject baseRequest = getBaseRequest();
            baseRequest.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod()));
            return Optional.of(baseRequest);
        } catch (JSONException unused) {
            return Optional.empty();
        }
    }

    private void initGooglePay(Context context) {
        IsReadyToPayRequest isReadyToPayRequestFromJson;
        if (getParentActivity() == null) {
            return;
        }
        this.paymentsClient = Wallet.getPaymentsClient(context, new Wallet.WalletOptions.Builder().setEnvironment(this.paymentForm.invoice.test ? 3 : 1).setTheme(1).build());
        Optional isReadyToPayRequest = getIsReadyToPayRequest();
        if (isReadyToPayRequest.isPresent() && (isReadyToPayRequestFromJson = IsReadyToPayRequest.fromJson(((JSONObject) isReadyToPayRequest.get()).toString())) != null) {
            this.paymentsClient.isReadyToPay(isReadyToPayRequestFromJson).addOnCompleteListener(getParentActivity(), new OnCompleteListener() {
                @Override
                public final void onComplete(Task task) {
                    PaymentFormActivity.m3633$r8$lambda$KwGYr3YDE7FpHtPQ1PjBms92pQ(this.f$0, task);
                }
            });
        }
    }

    public static void m3633$r8$lambda$KwGYr3YDE7FpHtPQ1PjBms92pQ(PaymentFormActivity paymentFormActivity, Task task) {
        paymentFormActivity.getClass();
        if (task.isSuccessful()) {
            FrameLayout frameLayout = paymentFormActivity.googlePayContainer;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
                return;
            }
            return;
        }
        FileLog.e("isReadyToPay failed", task.getException());
    }

    private String getTotalPriceString(ArrayList arrayList) {
        long jLongValue = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            jLongValue += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        Long l = this.tipAmount;
        if (l != null) {
            jLongValue += l.longValue();
        }
        return LocaleController.getInstance().formatCurrencyString(jLongValue, this.paymentForm.invoice.currency);
    }

    private String getTotalPriceDecimalString(ArrayList arrayList) {
        long j = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            j += ((TLRPC.TL_labeledPrice) arrayList.get(i)).amount;
        }
        return LocaleController.getInstance().formatCurrencyDecimalString(j, this.paymentForm.invoice.currency, false);
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

    public int getOtherSameFragmentDiff() {
        INavigationLayout iNavigationLayout = this.parentLayout;
        int i = 0;
        if (iNavigationLayout == null || iNavigationLayout.getFragmentStack() == null) {
            return 0;
        }
        int iIndexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (iIndexOf == -1) {
            iIndexOf = this.parentLayout.getFragmentStack().size();
        }
        while (i < this.parentLayout.getFragmentStack().size()) {
            if (((BaseFragment) this.parentLayout.getFragmentStack().get(i)) instanceof PaymentFormActivity) {
                return i - iIndexOf;
            }
            i++;
        }
        i = iIndexOf;
        return i - iIndexOf;
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
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.currentStep == 4 && this.needPayAfterTransition) {
            this.needPayAfterTransition = false;
            this.bottomLayout.callOnClick();
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$uxdAR2f3qbBenC5cYeadYZuUsQc(this.f$0);
                }
            }, 100L);
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

    public static void $r8$lambda$uxdAR2f3qbBenC5cYeadYZuUsQc(PaymentFormActivity paymentFormActivity) {
        paymentFormActivity.inputFields[0].requestFocus();
        AndroidUtilities.showKeyboard(paymentFormActivity.inputFields[0]);
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

    @Override
    public void onActivityResultFragment(int i, final int i2, final Intent intent) {
        if (i == 991) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$8x9loBgqweBY0FkUairKkggPyDo(this.f$0, i2, intent);
                }
            });
        }
    }

    public static void $r8$lambda$8x9loBgqweBY0FkUairKkggPyDo(PaymentFormActivity paymentFormActivity, int i, Intent intent) {
        String json;
        paymentFormActivity.getClass();
        if (i == -1) {
            PaymentData fromIntent = PaymentData.getFromIntent(intent);
            if (fromIntent == null || (json = fromIntent.toJson()) == null) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(json).getJSONObject("paymentMethodData");
                JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                jSONObject2.getString("type");
                String string = jSONObject2.getString("token");
                if (paymentFormActivity.googlePayPublicKey != null || paymentFormActivity.googlePayParameters != null) {
                    TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                    paymentFormActivity.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                    tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                    paymentFormActivity.googlePayCredentials.payment_token.data = jSONObject2.toString();
                    String strOptString = jSONObject.optString("description");
                    if (!TextUtils.isEmpty(strOptString)) {
                        paymentFormActivity.cardName = strOptString;
                    } else {
                        paymentFormActivity.cardName = "Android Pay";
                    }
                } else {
                    Token token = TokenParser.parseToken(string);
                    paymentFormActivity.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", token.getType(), token.getId());
                    Card card = token.getCard();
                    paymentFormActivity.cardName = card.getBrand() + " *" + card.getLast4();
                }
                paymentFormActivity.goToNextStep();
            } catch (JSONException e) {
                FileLog.e(e);
            }
        } else if (i == 1) {
            Status statusFromIntent = AutoResolveHelper.getStatusFromIntent(intent);
            StringBuilder sb = new StringBuilder();
            sb.append("android pay error ");
            sb.append(statusFromIntent != null ? statusFromIntent.getStatusMessage() : "");
            FileLog.e(sb.toString());
        }
        paymentFormActivity.showEditDoneProgress(true, false);
        paymentFormActivity.setDonePressed(false);
        FrameLayout frameLayout = paymentFormActivity.googlePayButton;
        if (frameLayout != null) {
            frameLayout.setClickable(true);
        }
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
                showChoosePaymentMethod(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.goToNextStep();
                    }
                });
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
                showChoosePaymentMethod(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.goToNextStep();
                    }
                });
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), this.isWebView);
                return;
            }
        }
        if (i3 == 2) {
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if (paymentForm.password_missing && (z = this.saveCardInfo)) {
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 6, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, z, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
                this.passwordFragment = paymentFormActivity;
                paymentFormActivity.setCustomResultReceiver(this.customResultReceiver);
                this.passwordFragment.setCustomAnyResultReceiver(this.customAnyResultReceiver);
                this.passwordFragment.setCurrentPassword(this.currentPassword);
                this.passwordFragment.setDelegate(new PaymentFormActivityDelegate() {
                    @Override
                    public void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
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

                    @Override
                    public void currentPasswordUpdated(TL_account.Password password) {
                        PaymentFormActivity.this.currentPassword = password;
                    }
                });
                presentFragment(this.passwordFragment, this.isWebView);
                return;
            }
            PaymentFormActivityDelegate paymentFormActivityDelegate2 = this.delegate;
            if (paymentFormActivityDelegate2 != null) {
                paymentFormActivityDelegate2.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, null);
                finishFragment();
                return;
            } else {
                presentFragment(new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), this.isWebView);
                return;
            }
        }
        if (i3 == 3) {
            presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, this.passwordOk ? 4 : 2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), true);
            return;
        }
        if (i3 != 4) {
            if (i3 != 6) {
                return;
            }
            if (!this.delegate.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, this.savedCredentialsCard)) {
                presentFragment(new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, false).setCustomResultReceiver(this.customResultReceiver).setCustomAnyResultReceiver(this.customAnyResultReceiver), true);
                return;
            } else {
                finishFragment();
                return;
            }
        }
        if (this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.paymentFinished, new Object[0]);
        if (getMessagesController().newMessageCallback == null) {
            if (onCheckoutSuccess(getParentLayout(), getParentActivity()) || isFinishing()) {
                return;
            }
            finishFragment();
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$BNlWADP5EadaRL0VQr4jtjoB5yU(this.f$0);
            }
        }, 500L);
    }

    public static void $r8$lambda$BNlWADP5EadaRL0VQr4jtjoB5yU(PaymentFormActivity paymentFormActivity) {
        paymentFormActivity.getMessagesController().newMessageCallback = null;
        if (paymentFormActivity.invoiceStatus == InvoiceStatus.PENDING && !paymentFormActivity.isFinishing()) {
            InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
            paymentFormActivity.invoiceStatus = invoiceStatus;
            PaymentFormCallback paymentFormCallback = paymentFormActivity.paymentFormCallback;
            if (paymentFormCallback != null) {
                paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
            }
            paymentFormActivity.finishFragment();
            return;
        }
        if (paymentFormActivity.invoiceStatus != InvoiceStatus.PAID || paymentFormActivity.isFinishing()) {
            return;
        }
        paymentFormActivity.finishFragment();
    }

    private boolean onCheckoutSuccess(INavigationLayout iNavigationLayout, Activity activity) {
        int i = 0;
        if (this.invoiceInput != null) {
            if (iNavigationLayout == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList(iNavigationLayout.getFragmentStack());
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
        ArrayList arrayList2 = new ArrayList(iNavigationLayout.getFragmentStack());
        int size2 = arrayList2.size();
        while (i < size2) {
            Object obj2 = arrayList2.get(i);
            i++;
            BaseFragment baseFragment2 = (BaseFragment) obj2;
            if ((baseFragment2 instanceof ChatActivity) || (baseFragment2 instanceof PremiumPreviewFragment)) {
                baseFragment2.removeSelfFromStack();
            }
        }
        iNavigationLayout.presentFragment(new PremiumPreviewFragment(null).setForcePremium(), !isFinishing());
        if (activity instanceof LaunchActivity) {
            try {
                this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ((LaunchActivity) activity).getFireworksOverlay().start();
        }
        return true;
    }

    public void updateSavePaymentField() {
        if (this.bottomCell[0] == null || this.sectionCell[2] == null) {
            return;
        }
        TLRPC.PaymentForm paymentForm = this.paymentForm;
        if ((paymentForm.password_missing || paymentForm.can_save_credentials) && (this.webView == null || !this.webviewLoading)) {
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
            ShadowSectionCell shadowSectionCell = this.sectionCell[2];
            shadowSectionCell.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            return;
        }
        this.checkCell1.setVisibility(8);
        this.bottomCell[0].setVisibility(8);
        ShadowSectionCell shadowSectionCell2 = this.sectionCell[2];
        shadowSectionCell2.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell2.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
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
                    str = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number());
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
                        if (((String) this.codesMap.get(strSubstring2)) != null) {
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

    public void sendSavePassword(final boolean z) {
        final String str;
        final String str2;
        if (!z && this.codeFieldCell.getVisibility() == 0) {
            String text = this.codeFieldCell.getText();
            if (text.length() == 0) {
                shakeView(this.codeFieldCell);
                return;
            }
            showEditDoneProgress(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    PaymentFormActivity.m3625$r8$lambda$0YvvzawOPVv3kLgCBrOOTeFY9k(this.f$0, tLObject, tL_error);
                }
            }, 10);
            return;
        }
        final TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
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
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$PulDmlsSX2QhY_PXsDa7piVd4Dw(this.f$0, z, str, str2, updatepasswordsettings);
            }
        });
    }

    public static void m3625$r8$lambda$0YvvzawOPVv3kLgCBrOOTeFY9k(final PaymentFormActivity paymentFormActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.m3632$r8$lambda$JbRc1NZYAiI34WJ5PMJgTGVKg(this.f$0, tL_error);
            }
        });
    }

    public static void m3632$r8$lambda$JbRc1NZYAiI34WJ5PMJgTGVKg(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error) {
        String pluralString;
        paymentFormActivity.showEditDoneProgress(true, false);
        if (tL_error == null) {
            if (paymentFormActivity.getParentActivity() == null) {
                return;
            }
            Runnable runnable = paymentFormActivity.shortPollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                paymentFormActivity.shortPollRunnable = null;
            }
            paymentFormActivity.goToNextStep();
            return;
        }
        if (tL_error.text.startsWith("CODE_INVALID")) {
            paymentFormActivity.shakeView(paymentFormActivity.codeFieldCell);
            paymentFormActivity.codeFieldCell.setText("", false);
        } else {
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (iIntValue < 60) {
                    pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                }
                paymentFormActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                return;
            }
            paymentFormActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void $r8$lambda$PulDmlsSX2QhY_PXsDa7piVd4Dw(final PaymentFormActivity paymentFormActivity, final boolean z, final String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        paymentFormActivity.getClass();
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.m3636$r8$lambda$VldLHnG1NQ7nbg4djTgdjP25eo(this.f$0, z, str, tLObject, tL_error);
            }
        };
        if (!z) {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = paymentFormActivity.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (updatepasswordsettings.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "ALGO_INVALID";
                    requestDelegate.run(null, tL_error);
                }
                ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(updatepasswordsettings, requestDelegate, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(updatepasswordsettings, requestDelegate, 10);
    }

    public static void m3636$r8$lambda$VldLHnG1NQ7nbg4djTgdjP25eo(final PaymentFormActivity paymentFormActivity, final boolean z, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$jLSJ4cRiotR3fkr272FeWgxBays(this.f$0, tL_error, z, tLObject, str);
            }
        });
    }

    public static void $r8$lambda$jLSJ4cRiotR3fkr272FeWgxBays(final PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, final boolean z, TLObject tLObject, final String str) {
        String pluralString;
        if (tL_error != null) {
            paymentFormActivity.getClass();
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        PaymentFormActivity.m3629$r8$lambda$CTvNGeCzZAaPJtrJf78vOLbeJw(this.f$0, z, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
        }
        paymentFormActivity.showEditDoneProgress(true, false);
        if (z) {
            TL_account.Password password = paymentFormActivity.currentPassword;
            password.has_password = false;
            password.current_algo = null;
            paymentFormActivity.delegate.currentPasswordUpdated(password);
            paymentFormActivity.finishFragment();
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            if (paymentFormActivity.getParentActivity() == null) {
                return;
            }
            paymentFormActivity.goToNextStep();
            return;
        }
        if (tL_error != null) {
            if (tL_error.text.equals("EMAIL_UNCONFIRMED") || tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                paymentFormActivity.emailCodeLength = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        PaymentFormActivity.m3647$r8$lambda$uVpnlZ_JGWn_7K10nhqZ5QRUv8(this.f$0, str, alertDialog, i);
                    }
                });
                builder.setMessage(LocaleController.getString(R.string.YourEmailAlmostThereText));
                builder.setTitle(LocaleController.getString(R.string.YourEmailAlmostThere));
                Dialog dialogShowDialog = paymentFormActivity.showDialog(builder.create());
                if (dialogShowDialog != null) {
                    dialogShowDialog.setCanceledOnTouchOutside(false);
                    dialogShowDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (tL_error.text.equals("EMAIL_INVALID")) {
                paymentFormActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                return;
            }
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (iIntValue < 60) {
                    pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                }
                paymentFormActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                return;
            }
            paymentFormActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void m3629$r8$lambda$CTvNGeCzZAaPJtrJf78vOLbeJw(final PaymentFormActivity paymentFormActivity, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$oMzTviHczqHt7wJNQUXYoURyzR8(this.f$0, tL_error, tLObject, z);
            }
        });
    }

    public static void $r8$lambda$oMzTviHczqHt7wJNQUXYoURyzR8(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        paymentFormActivity.getClass();
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            paymentFormActivity.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            paymentFormActivity.sendSavePassword(z);
        }
    }

    public static void m3647$r8$lambda$uVpnlZ_JGWn_7K10nhqZ5QRUv8(PaymentFormActivity paymentFormActivity, String str, AlertDialog alertDialog, int i) {
        paymentFormActivity.waitingForEmail = true;
        paymentFormActivity.currentPassword.email_unconfirmed_pattern = str;
        paymentFormActivity.updatePasswordFields();
    }

    public boolean sendCardData() {
        Integer num;
        Integer num2;
        String[] strArrSplit = this.inputFields[1].getText().toString().split("/");
        if (strArrSplit.length == 2) {
            Integer num3 = Utilities.parseInt((CharSequence) strArrSplit[0]);
            num2 = Utilities.parseInt((CharSequence) strArrSplit[1]);
            num = num3;
        } else {
            num = null;
            num2 = null;
        }
        final Card card = new Card(this.inputFields[0].getText().toString(), num, num2, this.inputFields[3].getText().toString(), this.inputFields[2].getText().toString(), null, null, null, null, this.inputFields[5].getText().toString(), this.inputFields[4].getText().toString(), null);
        this.cardName = card.getBrand() + " *" + card.getLast4();
        boolean z = num != null && num2 != null && UserConfig.getInstance(this.currentAccount).getClientPhone().startsWith("7") && "smartglocal".equals(this.paymentForm.native_provider) && (num2.intValue() > 22 || (num2.intValue() == 22 && num.intValue() > 1));
        if (!card.validateNumber()) {
            shakeField(0);
            return false;
        }
        if (!z && (!card.validateExpMonth() || !card.validateExpYear() || !card.validateExpiryDate())) {
            shakeField(1);
            return false;
        }
        if (this.need_card_name && this.inputFields[2].length() == 0) {
            shakeField(2);
            return false;
        }
        if (!card.validateCVC()) {
            shakeField(3);
            return false;
        }
        if (this.need_card_country && this.inputFields[4].length() == 0) {
            shakeField(4);
            return false;
        }
        if (this.need_card_postcode && this.inputFields[5].length() == 0) {
            shakeField(5);
            return false;
        }
        showEditDoneProgress(true, true);
        try {
            if ("stripe".equals(this.paymentForm.native_provider)) {
                new Stripe(this.providerApiKey).createToken(card, new AnonymousClass26());
            } else if ("smartglocal".equals(this.paymentForm.native_provider)) {
                new AsyncTask() {
                    @Override
                    public String doInBackground(Object... objArr) throws Throwable {
                        HttpURLConnection httpURLConnection;
                        HttpURLConnection httpURLConnection2;
                        String string;
                        URL url;
                        HttpURLConnection httpURLConnection3 = null;
                        try {
                            try {
                                try {
                                    JSONObject jSONObject = new JSONObject();
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("number", card.getNumber());
                                    jSONObject2.put("expiration_month", String.format(Locale.US, "%02d", card.getExpMonth()));
                                    jSONObject2.put("expiration_year", "" + card.getExpYear());
                                    jSONObject2.put("security_code", "" + card.getCVC());
                                    jSONObject.put("card", jSONObject2);
                                    if (PaymentFormActivity.this.paymentForm.native_params != null) {
                                        try {
                                            string = new JSONObject(PaymentFormActivity.this.paymentForm.native_params.data).getString("tokenize_url");
                                            if (string != null) {
                                                try {
                                                    if (!string.startsWith("https://") || !string.endsWith(".smart-glocal.com/cds/v1/tokenize/card")) {
                                                        string = null;
                                                    }
                                                } catch (Exception unused) {
                                                }
                                            }
                                        } catch (Exception unused2) {
                                        }
                                    } else {
                                        string = null;
                                    }
                                    if (string == null) {
                                        if (PaymentFormActivity.this.paymentForm.invoice.test) {
                                            url = new URL("https://tgb-playground.smart-glocal.com/cds/v1/tokenize/card");
                                        } else {
                                            url = new URL("https://tgb.smart-glocal.com/cds/v1/tokenize/card");
                                        }
                                    } else {
                                        url = new URL(string);
                                    }
                                    httpURLConnection2 = (HttpURLConnection) url.openConnection();
                                    try {
                                        httpURLConnection2.setConnectTimeout(30000);
                                        httpURLConnection2.setReadTimeout(80000);
                                        httpURLConnection2.setUseCaches(false);
                                        httpURLConnection2.setDoOutput(true);
                                        httpURLConnection2.setRequestMethod("POST");
                                        httpURLConnection2.setRequestProperty("Content-Type", "application/json");
                                        httpURLConnection2.setRequestProperty("X-PUBLIC-TOKEN", PaymentFormActivity.this.providerApiKey);
                                        OutputStream outputStream = httpURLConnection2.getOutputStream();
                                        try {
                                            outputStream.write(jSONObject.toString().getBytes("UTF-8"));
                                            outputStream.close();
                                            int responseCode = httpURLConnection2.getResponseCode();
                                            if (responseCode >= 200 && responseCode < 300) {
                                                JSONObject jSONObject3 = new JSONObject();
                                                jSONObject3.put("token", new JSONObject(PaymentFormActivity.getResponseBody(httpURLConnection2.getInputStream())).getJSONObject("data").getString("token"));
                                                jSONObject3.put("type", "card");
                                                String string2 = jSONObject3.toString();
                                                httpURLConnection2.disconnect();
                                                return string2;
                                            }
                                            if (BuildVars.DEBUG_VERSION) {
                                                FileLog.e("" + PaymentFormActivity.getResponseBody(httpURLConnection2.getErrorStream()));
                                            }
                                            httpURLConnection2.disconnect();
                                            return null;
                                        } catch (Throwable th) {
                                            if (outputStream != null) {
                                                try {
                                                    outputStream.close();
                                                } catch (Throwable th2) {
                                                    th.addSuppressed(th2);
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e) {
                                        e = e;
                                        FileLog.e(e);
                                        if (httpURLConnection2 != null) {
                                        }
                                        return null;
                                    }
                                } catch (Exception e2) {
                                    e = e2;
                                    httpURLConnection2 = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (httpURLConnection3 != null) {
                                    httpURLConnection3.disconnect();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            httpURLConnection3 = httpURLConnection;
                        }
                    }

                    @Override
                    public void onPostExecute(String str) {
                        if (PaymentFormActivity.this.canceled) {
                            return;
                        }
                        if (str != null) {
                            PaymentFormActivity.this.paymentJson = str;
                            PaymentFormActivity.this.goToNextStep();
                        } else {
                            AlertsCreator.showSimpleToast(PaymentFormActivity.this, LocaleController.getString(R.string.PaymentConnectionFailed));
                        }
                        PaymentFormActivity.this.showEditDoneProgress(true, false);
                        PaymentFormActivity.this.setDonePressed(false);
                    }
                }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return true;
    }

    class AnonymousClass26 implements TokenCallback {
        AnonymousClass26() {
        }

        @Override
        public void onSuccess(Token token) {
            if (PaymentFormActivity.this.canceled) {
                return;
            }
            PaymentFormActivity.this.paymentJson = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", token.getType(), token.getId());
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.AnonymousClass26.m3650$r8$lambda$cP4FCPk11oRXCevrJ9kLFZBpKs(this.f$0);
                }
            });
        }

        public static void m3650$r8$lambda$cP4FCPk11oRXCevrJ9kLFZBpKs(AnonymousClass26 anonymousClass26) {
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
    }

    public static String getResponseBody(InputStream inputStream) throws IOException {
        String next = new Scanner(inputStream, "UTF-8").useDelimiter("\\A").next();
        inputStream.close();
        return next;
    }

    private void sendSavedForm(final Runnable runnable) {
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
        final TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
        tL_payments_validateRequestedInfo2.save = true;
        tL_payments_validateRequestedInfo2.info = this.paymentForm.saved_info;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_validateRequestedInfo2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$Nd7MUvBIlJjmEDRyYccvlilKAcw(this.f$0, runnable, tL_payments_validateRequestedInfo2, tLObject, tL_error);
            }
        }, (this.allowUnregistered ? 8 : 0) | 2);
    }

    public static void $r8$lambda$Nd7MUvBIlJjmEDRyYccvlilKAcw(final PaymentFormActivity paymentFormActivity, final Runnable runnable, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        if (tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$hOc0aRJoMpizpV6V3npBmRwlWsY(this.f$0, tLObject2, runnable);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$9rFLFqasVbD70nnr4omI4_B657M(this.f$0, tL_error, tLObject);
                }
            });
        }
    }

    public static void $r8$lambda$hOc0aRJoMpizpV6V3npBmRwlWsY(PaymentFormActivity paymentFormActivity, TLObject tLObject, Runnable runnable) {
        paymentFormActivity.getClass();
        paymentFormActivity.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        runnable.run();
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.showEditDoneProgress(true, false);
    }

    public static void $r8$lambda$9rFLFqasVbD70nnr4omI4_B657M(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.showEditDoneProgress(true, false);
        if (tL_error != null) {
            AlertsCreator.processError(paymentFormActivity.currentAccount, tL_error, paymentFormActivity, tLObject, new Object[0]);
        }
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
        final TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo3 = this.validateRequest;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.validateRequest, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$6r0ZffPSognzLUUv0eyk8n3A4YM(this.f$0, tL_payments_validateRequestedInfo3, tLObject, tL_error);
            }
        }, (this.allowUnregistered ? 8 : 0) | 2);
    }

    public static void $r8$lambda$6r0ZffPSognzLUUv0eyk8n3A4YM(final PaymentFormActivity paymentFormActivity, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        if (tLObject2 instanceof TLRPC.TL_payments_validatedRequestedInfo) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.m3628$r8$lambda$9DxS83Yzrqh78_f2EUWf6XiLa0(this.f$0, tLObject2);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$2o2FftVlgV1xtBuZ5okM9sJDhJA(this.f$0, tL_error, tLObject);
                }
            });
        }
    }

    public static void m3628$r8$lambda$9DxS83Yzrqh78_f2EUWf6XiLa0(PaymentFormActivity paymentFormActivity, TLObject tLObject) {
        paymentFormActivity.getClass();
        paymentFormActivity.requestedInfo = (TLRPC.TL_payments_validatedRequestedInfo) tLObject;
        if (paymentFormActivity.paymentForm.saved_info != null && !paymentFormActivity.saveShippingInfo) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(tL_payments_clearSavedInfo, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    PaymentFormActivity.$r8$lambda$N5EBCheEeuvSVEmlqehvGd50Iaw(tLObject2, tL_error);
                }
            }, paymentFormActivity.allowUnregistered ? 8 : 0);
        }
        paymentFormActivity.goToNextStep();
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.showEditDoneProgress(true, false);
    }

    public static void $r8$lambda$2o2FftVlgV1xtBuZ5okM9sJDhJA(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.showEditDoneProgress(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    paymentFormActivity.shakeField(2);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    paymentFormActivity.shakeField(0);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    paymentFormActivity.shakeField(4);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    paymentFormActivity.shakeField(6);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    paymentFormActivity.shakeField(5);
                    break;
                case "ADDRESS_STATE_INVALID":
                    paymentFormActivity.shakeField(3);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    paymentFormActivity.shakeField(9);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    paymentFormActivity.shakeField(1);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    paymentFormActivity.shakeField(7);
                    break;
                default:
                    AlertsCreator.processError(paymentFormActivity.currentAccount, tL_error, paymentFormActivity, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public PaymentFormActivity setCustomResultReceiver(Utilities.Callback callback) {
        this.customResultReceiver = callback;
        return this;
    }

    public PaymentFormActivity setCustomAnyResultReceiver(Utilities.Callback callback) {
        this.customAnyResultReceiver = callback;
        return this;
    }

    public void setCustomErrorReceiver(Utilities.CallbackReturn callbackReturn) {
        this.customErrorReceiver = callbackReturn;
    }

    private void sendData() {
        String str;
        if (this.canceled) {
            return;
        }
        showEditDoneProgress(false, true);
        final TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm = new TLRPC.TL_payments_sendPaymentForm();
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
        if (UserConfig.getInstance(this.currentAccount).tmpPassword != null && this.savedCredentialsCard != null) {
            TLRPC.TL_inputPaymentCredentialsSaved tL_inputPaymentCredentialsSaved = new TLRPC.TL_inputPaymentCredentialsSaved();
            tL_payments_sendPaymentForm.credentials = tL_inputPaymentCredentialsSaved;
            tL_inputPaymentCredentialsSaved.id = this.savedCredentialsCard.id;
            tL_inputPaymentCredentialsSaved.tmp_password = UserConfig.getInstance(this.currentAccount).tmpPassword.tmp_password;
        } else {
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$TpZslK8vD2vhjHMYUnPTUpTBr8k(this.f$0, tL_payments_sendPaymentForm, tLObject, tL_error);
            }
        }, (this.allowUnregistered ? 8 : 0) | 2);
    }

    public static void $r8$lambda$TpZslK8vD2vhjHMYUnPTUpTBr8k(final PaymentFormActivity paymentFormActivity, final TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            paymentFormActivity.getClass();
            if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
                Utilities.Callback callback = paymentFormActivity.customResultReceiver;
                if (callback != null) {
                    callback.run((TLRPC.TL_payments_paymentResult) tLObject);
                    return;
                }
                TLRPC.Updates updates = ((TLRPC.TL_payments_paymentResult) tLObject).updates;
                final TLRPC.Message[] messageArr = new TLRPC.Message[1];
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
                paymentFormActivity.getMessagesController().processUpdates(updates, false);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PaymentFormActivity.m3635$r8$lambda$OBMO4iYx8M4Q1LrKeJBBSW5s(this.f$0, messageArr);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.TL_payments_paymentVerificationNeeded) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PaymentFormActivity.m3648$r8$lambda$xaAgyVTafZhuYHUNz2dh23HM80(this.f$0, tLObject);
                    }
                });
                return;
            }
            return;
        }
        Utilities.CallbackReturn callbackReturn = paymentFormActivity.customErrorReceiver;
        if (callbackReturn == null || !((Boolean) callbackReturn.run(tL_error)).booleanValue()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$RDKqqUVuTzg0ow5SpemfV6MxRdk(this.f$0, tL_error, tL_payments_sendPaymentForm);
                }
            });
        }
    }

    public static void m3635$r8$lambda$OBMO4iYx8M4Q1LrKeJBBSW5s(final PaymentFormActivity paymentFormActivity, final TLRPC.Message[] messageArr) {
        String forcedFirstName;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String string2;
        final Bulletin bulletinCreateSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        Context context = paymentFormActivity.getContext();
        if (context == null) {
            context = ApplicationLoader.applicationContext;
        }
        if (context == null) {
            context = LaunchActivity.instance;
        }
        if (context == null) {
            return;
        }
        paymentFormActivity.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PAID;
        paymentFormActivity.invoiceStatus = invoiceStatus;
        TLRPC.InputInvoice inputInvoice = paymentFormActivity.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        final boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z && (paymentFormCallback2 = paymentFormActivity.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(invoiceStatus);
        }
        paymentFormActivity.goToNextStep();
        if (z && (paymentFormCallback = paymentFormActivity.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(paymentFormActivity.invoiceStatus);
        }
        final long starsGiftUserId = paymentFormActivity.getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            forcedFirstName = UserObject.getForcedFirstName(paymentFormActivity.getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            forcedFirstName = "";
            if (starsGiftUserId < 0 && (chat = paymentFormActivity.getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                forcedFirstName = chat.title;
            }
        }
        long stars = paymentFormActivity.getStars();
        if (z) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i3 = i;
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
            string2 = LocaleController.formatString(R.string.PaymentInfoHint, paymentFormActivity.totalPrice[0], paymentFormActivity.currentItemName);
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
        if (starsGiftUserId != 0 && str != null && !z3) {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$ZwxLWeRkeD62yJ8Gykbml7RGJkY(starsGiftUserId);
                }
            });
        } else if (str != null) {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, str, spannableStringBuilderReplaceTags);
        } else {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, spannableStringBuilderReplaceTags);
        }
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.setDuration(5000);
        if (messageArr[0] != null) {
            bulletinCreateSimpleBulletin.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaymentFormActivity.m3641$r8$lambda$hSg7liQDCMpBYlajIsseYx6oe8(this.f$0, bulletinCreateSimpleBulletin, z2, messageArr, view);
                }
            });
        }
        bulletinCreateSimpleBulletin.show(z3);
    }

    public static void $r8$lambda$ZwxLWeRkeD62yJ8Gykbml7RGJkY(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static void m3641$r8$lambda$hSg7liQDCMpBYlajIsseYx6oe8(final PaymentFormActivity paymentFormActivity, Bulletin bulletin, boolean z, TLRPC.Message[] messageArr, View view) {
        paymentFormActivity.getClass();
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
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(paymentFormActivity.currentAccount).getInputPeer(messageArr[0].peer_id);
        ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$oYwOndve6dDrn7cDkWiRnNk1cxQ(this.f$0, tLObject, tL_error);
            }
        }, 2);
    }

    public static void $r8$lambda$oYwOndve6dDrn7cDkWiRnNk1cxQ(final PaymentFormActivity paymentFormActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$TGV5If9vkJXNF1xji5etKzVluFY(this.f$0, tLObject);
            }
        });
    }

    public static void $r8$lambda$TGV5If9vkJXNF1xji5etKzVluFY(PaymentFormActivity paymentFormActivity, TLObject tLObject) {
        BaseFragment lastFragment;
        paymentFormActivity.getClass();
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(paymentFormActivity.getContext(), false, paymentFormActivity.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, paymentFormActivity.getResourceProvider());
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject).setCustomResultReceiver(paymentFormActivity.customResultReceiver).setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver), bottomSheetParams);
    }

    public static void m3648$r8$lambda$xaAgyVTafZhuYHUNz2dh23HM80(final PaymentFormActivity paymentFormActivity, TLObject tLObject) {
        Utilities.Callback callback = paymentFormActivity.customAnyResultReceiver;
        if (callback != null) {
            callback.run((TLRPC.TL_payments_paymentVerificationNeeded) tLObject);
        }
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.webviewLoading = true;
        paymentFormActivity.showEditDoneProgress(true, true);
        ContextProgressView contextProgressView = paymentFormActivity.progressView;
        if (contextProgressView != null) {
            contextProgressView.setVisibility(0);
        }
        ActionBarMenuItem actionBarMenuItem = paymentFormActivity.doneItem;
        if (actionBarMenuItem != null) {
            actionBarMenuItem.setEnabled(false);
            paymentFormActivity.doneItem.getContentView().setVisibility(4);
        }
        final INavigationLayout parentLayout = paymentFormActivity.getParentLayout();
        final Activity parentActivity = paymentFormActivity.getParentActivity();
        paymentFormActivity.getMessagesController().newMessageCallback = new MessagesController.NewMessageCallback() {
            @Override
            public final boolean onMessageReceived(TLRPC.Message message) {
                return PaymentFormActivity.$r8$lambda$caovSO2Y7evmBmRZ0IVrkhhaN9c(this.f$0, parentLayout, parentActivity, message);
            }
        };
        WebView webView = paymentFormActivity.webView;
        if (webView != null) {
            webView.setVisibility(0);
            WebView webView2 = paymentFormActivity.webView;
            String str = ((TLRPC.TL_payments_paymentVerificationNeeded) tLObject).url;
            paymentFormActivity.webViewUrl = str;
            webView2.loadUrl(str);
        }
        paymentFormActivity.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.PENDING;
        paymentFormActivity.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = paymentFormActivity.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
    }

    public static boolean $r8$lambda$caovSO2Y7evmBmRZ0IVrkhhaN9c(final PaymentFormActivity paymentFormActivity, final INavigationLayout iNavigationLayout, final Activity activity, final TLRPC.Message message) {
        paymentFormActivity.getClass();
        if (MessageObject.getPeerId(message.peer_id) != paymentFormActivity.botUser.id || !(message.action instanceof TLRPC.TL_messageActionPaymentSent)) {
            return false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$CegLFOQuK9bJKaKlCQRllaonIaM(this.f$0, iNavigationLayout, activity, message);
            }
        });
        return true;
    }

    public static void $r8$lambda$CegLFOQuK9bJKaKlCQRllaonIaM(final PaymentFormActivity paymentFormActivity, INavigationLayout iNavigationLayout, Activity activity, final TLRPC.Message message) {
        String forcedFirstName;
        TLRPC.Chat chat;
        int i;
        int i2;
        String string;
        String string2;
        final Bulletin bulletinCreateSimpleBulletin;
        PaymentFormCallback paymentFormCallback;
        PaymentFormCallback paymentFormCallback2;
        paymentFormActivity.paymentStatusSent = true;
        paymentFormActivity.invoiceStatus = InvoiceStatus.PAID;
        paymentFormActivity.onCheckoutSuccess(iNavigationLayout, activity);
        TLRPC.InputInvoice inputInvoice = paymentFormActivity.invoiceInput;
        boolean z = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        final boolean z2 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z3 = z && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z && (paymentFormCallback2 = paymentFormActivity.paymentFormCallback) != null) {
            paymentFormCallback2.onInvoiceStatusChanged(paymentFormActivity.invoiceStatus);
        }
        paymentFormActivity.goToNextStep();
        if (z && (paymentFormCallback = paymentFormActivity.paymentFormCallback) != null) {
            paymentFormCallback.onInvoiceStatusChanged(paymentFormActivity.invoiceStatus);
        }
        final long starsGiftUserId = paymentFormActivity.getStarsGiftUserId();
        if (starsGiftUserId > 0) {
            forcedFirstName = UserObject.getForcedFirstName(paymentFormActivity.getMessagesController().getUser(Long.valueOf(starsGiftUserId)));
        } else {
            forcedFirstName = "";
            if (starsGiftUserId < 0 && (chat = paymentFormActivity.getMessagesController().getChat(Long.valueOf(-starsGiftUserId))) != null) {
                forcedFirstName = chat.title;
            }
        }
        long stars = paymentFormActivity.getStars();
        if (z) {
            i = (z2 || z3) ? R.raw.stars_send : R.raw.stars_topup;
        } else {
            i = R.raw.payment_success;
        }
        int i3 = i;
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
            string2 = LocaleController.formatString(R.string.PaymentInfoHint, paymentFormActivity.totalPrice[0], paymentFormActivity.currentItemName);
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
        if (starsGiftUserId != 0 && str != null && !z3) {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, str, spannableStringBuilderReplaceTags, LocaleController.getString(R.string.ViewInChat), new Runnable() {
                @Override
                public final void run() {
                    PaymentFormActivity.$r8$lambda$C3qxmrCHzS0gfzsY2zzJ5QHH8ho(starsGiftUserId);
                }
            });
        } else if (str != null) {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, str, spannableStringBuilderReplaceTags);
        } else {
            bulletinCreateSimpleBulletin = bulletinFactoryOf.createSimpleBulletin(i3, spannableStringBuilderReplaceTags);
        }
        bulletinCreateSimpleBulletin.hideAfterBottomSheet = false;
        bulletinCreateSimpleBulletin.setDuration(5000);
        if (message != null) {
            bulletinCreateSimpleBulletin.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PaymentFormActivity.$r8$lambda$A1wBYJ4Dqclj3wj1m34slRNRlFc(this.f$0, bulletinCreateSimpleBulletin, z2, message, view);
                }
            });
        }
        bulletinCreateSimpleBulletin.show(z3);
    }

    public static void $r8$lambda$C3qxmrCHzS0gfzsY2zzJ5QHH8ho(long j) {
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(j));
        }
    }

    public static void $r8$lambda$A1wBYJ4Dqclj3wj1m34slRNRlFc(final PaymentFormActivity paymentFormActivity, Bulletin bulletin, boolean z, TLRPC.Message message, View view) {
        paymentFormActivity.getClass();
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
        tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(paymentFormActivity.currentAccount).getInputPeer(message.peer_id);
        ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.m3630$r8$lambda$DyBKY7lLkByMpCTDUj6Cs_n6BA(this.f$0, tLObject, tL_error);
            }
        }, 2);
    }

    public static void m3630$r8$lambda$DyBKY7lLkByMpCTDUj6Cs_n6BA(final PaymentFormActivity paymentFormActivity, final TLObject tLObject, TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.m3640$r8$lambda$bCPt2kCcTX7vNiAs0KIYIF_RKw(this.f$0, tLObject);
            }
        });
    }

    public static void m3640$r8$lambda$bCPt2kCcTX7vNiAs0KIYIF_RKw(PaymentFormActivity paymentFormActivity, TLObject tLObject) {
        BaseFragment lastFragment;
        paymentFormActivity.getClass();
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(paymentFormActivity.getContext(), false, paymentFormActivity.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, paymentFormActivity.getResourceProvider());
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        bottomSheetParams.allowNestedScroll = false;
        lastFragment.showAsSheet(new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject).setCustomResultReceiver(paymentFormActivity.customResultReceiver).setCustomAnyResultReceiver(paymentFormActivity.customAnyResultReceiver), bottomSheetParams);
    }

    public static void $r8$lambda$RDKqqUVuTzg0ow5SpemfV6MxRdk(PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        AlertsCreator.processError(paymentFormActivity.currentAccount, tL_error, paymentFormActivity, tL_payments_sendPaymentForm, new Object[0]);
        paymentFormActivity.setDonePressed(false);
        paymentFormActivity.showEditDoneProgress(false, false);
        paymentFormActivity.paymentStatusSent = true;
        InvoiceStatus invoiceStatus = InvoiceStatus.FAILED;
        paymentFormActivity.invoiceStatus = invoiceStatus;
        PaymentFormCallback paymentFormCallback = paymentFormActivity.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(invoiceStatus);
        }
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

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
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
        final String string = this.inputFields[1].getText().toString();
        showEditDoneProgress(true, true);
        setDonePressed(true);
        final TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$XVa87BwkCs8vuBO1x8XMQpfoWFI(this.f$0, string, getpassword, tLObject, tL_error);
            }
        }, (this.allowUnregistered ? 8 : 0) | 2);
    }

    public static void $r8$lambda$XVa87BwkCs8vuBO1x8XMQpfoWFI(final PaymentFormActivity paymentFormActivity, final String str, final TL_account.getPassword getpassword, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$hB1EW_sl_ssfJquStyyKTd5bCQs(this.f$0, tL_error, tLObject, str, getpassword);
            }
        });
    }

    public static void $r8$lambda$hB1EW_sl_ssfJquStyyKTd5bCQs(final PaymentFormActivity paymentFormActivity, TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error == null) {
            paymentFormActivity.getClass();
            final TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(paymentFormActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            } else if (!password.has_password) {
                paymentFormActivity.passwordOk = false;
                paymentFormActivity.goToNextStep();
                return;
            } else {
                final byte[] stringBytes = AndroidUtilities.getStringBytes(str);
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        PaymentFormActivity.$r8$lambda$21m8VK8qOCGIqJMcOtE8ruDrx1k(this.f$0, password, stringBytes);
                    }
                });
                return;
            }
        }
        AlertsCreator.processError(paymentFormActivity.currentAccount, tL_error, paymentFormActivity, getpassword, new Object[0]);
        paymentFormActivity.showEditDoneProgress(true, false);
        paymentFormActivity.setDonePressed(false);
    }

    public static void $r8$lambda$21m8VK8qOCGIqJMcOtE8ruDrx1k(final PaymentFormActivity paymentFormActivity, TL_account.Password password, byte[] bArr) {
        paymentFormActivity.getClass();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        final TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                PaymentFormActivity.$r8$lambda$5uQbcwZ138y36Qyo8C5GJqT3A3I(this.f$0, gettmppassword, tLObject, tL_error);
            }
        };
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            gettmppassword.password = tL_inputCheckPasswordSRPStartCheck;
            if (tL_inputCheckPasswordSRPStartCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                requestDelegate.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(paymentFormActivity.currentAccount).sendRequest(gettmppassword, requestDelegate, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        requestDelegate.run(null, tL_error2);
    }

    public static void $r8$lambda$5uQbcwZ138y36Qyo8C5GJqT3A3I(final PaymentFormActivity paymentFormActivity, final TL_account.getTmpPassword gettmppassword, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        paymentFormActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PaymentFormActivity.$r8$lambda$WmGjcOe9DWDtvhc7kTPVS36b640(this.f$0, tLObject, tL_error, gettmppassword);
            }
        });
    }

    public static void $r8$lambda$WmGjcOe9DWDtvhc7kTPVS36b640(PaymentFormActivity paymentFormActivity, TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        paymentFormActivity.showEditDoneProgress(true, false);
        paymentFormActivity.setDonePressed(false);
        if (tLObject != null) {
            paymentFormActivity.passwordOk = true;
            UserConfig.getInstance(paymentFormActivity.currentAccount).tmpPassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(paymentFormActivity.currentAccount).saveConfig(false);
            paymentFormActivity.goToNextStep();
            return;
        }
        if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
            try {
                paymentFormActivity.inputFields[1].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeViewSpring(paymentFormActivity.inputFields[1], 3.25f);
            paymentFormActivity.inputFields[1].setText("");
            return;
        }
        AlertsCreator.processError(paymentFormActivity.currentAccount, tL_error, paymentFormActivity, gettmppassword, new Object[0]);
    }

    public void showEditDoneProgress(boolean z, final boolean z2) {
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.doneItem != null) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.doneItemAnimation = animatorSet2;
            if (z2) {
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                AnimatorSet animatorSet3 = this.doneItemAnimation;
                View contentView = this.doneItem.getContentView();
                Property property = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(contentView, (Property<View, Float>) property, 0.1f);
                View contentView2 = this.doneItem.getContentView();
                Property property2 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(contentView2, (Property<View, Float>) property2, 0.1f);
                View contentView3 = this.doneItem.getContentView();
                Property property3 = View.ALPHA;
                animatorSet3.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(contentView3, (Property<View, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) property3, 1.0f));
            } else if (this.webView != null) {
                animatorSet2.playTogether(ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.progressView, (Property<ContextProgressView, Float>) View.ALPHA, 0.0f));
            } else {
                this.doneItem.getContentView().setVisibility(0);
                this.doneItem.setEnabled(true);
                AnimatorSet animatorSet4 = this.doneItemAnimation;
                ContextProgressView contextProgressView = this.progressView;
                Property property4 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(contextProgressView, (Property<ContextProgressView, Float>) property4, 0.1f);
                ContextProgressView contextProgressView2 = this.progressView;
                Property property5 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(contextProgressView2, (Property<ContextProgressView, Float>) property5, 0.1f);
                ContextProgressView contextProgressView3 = this.progressView;
                Property property6 = View.ALPHA;
                animatorSet4.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(contextProgressView3, (Property<ContextProgressView, Float>) property6, 0.0f));
                if (!isFinishing()) {
                    this.doneItemAnimation.playTogether(ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.doneItem.getContentView(), (Property<View, Float>) property6, 1.0f));
                }
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (!z2) {
                        PaymentFormActivity.this.progressView.setVisibility(4);
                    } else {
                        PaymentFormActivity.this.doneItem.getContentView().setVisibility(4);
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PaymentFormActivity.this.doneItemAnimation = null;
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (this.payTextView != null) {
            this.doneItemAnimation = new AnimatorSet();
            if (z2) {
                this.progressViewButton.setVisibility(0);
                this.bottomLayout.setEnabled(false);
                AnimatorSet animatorSet5 = this.doneItemAnimation;
                TextView textView = this.payTextView;
                Property property7 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property7, 0.1f);
                TextView textView2 = this.payTextView;
                Property property8 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property8, 0.1f);
                TextView textView3 = this.payTextView;
                Property property9 = View.ALPHA;
                animatorSet5.playTogether(objectAnimatorOfFloat5, objectAnimatorOfFloat6, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property9, 0.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property7, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property8, 1.0f), ObjectAnimator.ofFloat(this.progressViewButton, (Property<ContextProgressView, Float>) property9, 1.0f));
            } else {
                this.payTextView.setVisibility(0);
                this.bottomLayout.setEnabled(true);
                AnimatorSet animatorSet6 = this.doneItemAnimation;
                ContextProgressView contextProgressView4 = this.progressViewButton;
                Property property10 = View.SCALE_X;
                ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(contextProgressView4, (Property<ContextProgressView, Float>) property10, 0.1f);
                ContextProgressView contextProgressView5 = this.progressViewButton;
                Property property11 = View.SCALE_Y;
                ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(contextProgressView5, (Property<ContextProgressView, Float>) property11, 0.1f);
                ContextProgressView contextProgressView6 = this.progressViewButton;
                Property property12 = View.ALPHA;
                animatorSet6.playTogether(objectAnimatorOfFloat7, objectAnimatorOfFloat8, ObjectAnimator.ofFloat(contextProgressView6, (Property<ContextProgressView, Float>) property12, 0.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property10, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property11, 1.0f), ObjectAnimator.ofFloat(this.payTextView, (Property<TextView, Float>) property12, 1.0f));
            }
            this.doneItemAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    if (!z2) {
                        PaymentFormActivity.this.progressViewButton.setVisibility(4);
                    } else {
                        PaymentFormActivity.this.payTextView.setVisibility(4);
                    }
                }

                @Override
                public void onAnimationCancel(Animator animator) {
                    if (PaymentFormActivity.this.doneItemAnimation == null || !PaymentFormActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    PaymentFormActivity.this.doneItemAnimation = null;
                }
            });
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
        }
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment);
    }

    @Override
    public boolean presentFragment(BaseFragment baseFragment, boolean z) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment, z);
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.scrollView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.linearLayout2, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ContextProgressView contextProgressView = this.progressView;
        int i3 = Theme.key_contextProgressInner2;
        arrayList.add(new ThemeDescription(contextProgressView, 0, null, null, null, null, i3));
        ContextProgressView contextProgressView2 = this.progressView;
        int i4 = Theme.key_contextProgressOuter2;
        arrayList.add(new ThemeDescription(contextProgressView2, 0, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i3));
        arrayList.add(new ThemeDescription(this.progressViewButton, 0, null, null, null, null, i4));
        if (this.inputFields != null) {
            for (int i5 = 0; i5 < this.inputFields.length; i5++) {
                arrayList.add(new ThemeDescription((View) this.inputFields[i5].getParent(), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.inputFields[i5], ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.inputFields[i5], ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
            }
        } else {
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(null, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        }
        if (this.radioCells != null) {
            for (int i6 = 0; i6 < this.radioCells.length; i6++) {
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_windowBackgroundWhite));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
                arrayList.add(new ThemeDescription(this.radioCells[i6], 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
                arrayList.add(new ThemeDescription(this.radioCells[i6], ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
            }
        } else {
            arrayList.add(new ThemeDescription((View) null, 0, new Class[]{RadioCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOX, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackground));
            arrayList.add(new ThemeDescription((View) null, ThemeDescription.FLAG_CHECKBOXCHECK, new Class[]{RadioCell.class}, new String[]{"radioButton"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_radioBackgroundChecked));
        }
        for (int i7 = 0; i7 < this.headerCell.length; i7++) {
            arrayList.add(new ThemeDescription(this.headerCell[i7], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.headerCell[i7], 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        }
        for (int i8 = 0; i8 < this.sectionCell.length; i8++) {
            arrayList.add(new ThemeDescription(this.sectionCell[i8], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        }
        for (int i9 = 0; i9 < this.bottomCell.length; i9++) {
            arrayList.add(new ThemeDescription(this.bottomCell[i9], ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
            arrayList.add(new ThemeDescription(this.bottomCell[i9], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(this.bottomCell[i9], ThemeDescription.FLAG_LINKCOLOR, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteLinkText));
        }
        for (int i10 = 0; i10 < this.dividers.size(); i10++) {
            arrayList.add(new ThemeDescription((View) this.dividers.get(i10), ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
        }
        EditTextSettingsCell editTextSettingsCell = this.codeFieldCell;
        int i11 = ThemeDescription.FLAG_BACKGROUND;
        int i12 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(editTextSettingsCell, i11, null, null, null, null, i12));
        int i13 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.codeFieldCell, ThemeDescription.FLAG_TEXTCOLOR, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.codeFieldCell, ThemeDescription.FLAG_HINTTEXTCOLOR, new Class[]{EditTextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.textView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrack));
        arrayList.add(new ThemeDescription(this.checkCell1, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_switchTrackChecked));
        arrayList.add(new ThemeDescription(this.checkCell1, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.checkCell1, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        for (int i14 = 0; i14 < this.settingsCell.length; i14++) {
            arrayList.add(new ThemeDescription(this.settingsCell[i14], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.settingsCell[i14], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(this.settingsCell[i14], 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
        }
        arrayList.add(new ThemeDescription(this.payTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlueText6));
        int i15 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextPriceCell.class}, null, null, null, i15));
        int i16 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i16));
        int i17 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
        arrayList.add(new ThemeDescription(this.linearLayout2, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextPriceCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i17));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i15));
        arrayList.add(new ThemeDescription(this.detailSettingsCell[0], ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        for (int i18 = 1; i18 < this.detailSettingsCell.length; i18++) {
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(this.detailSettingsCell[i18], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        }
        PaymentInfoCell paymentInfoCell = this.paymentInfoCell;
        int i19 = ThemeDescription.FLAG_BACKGROUND;
        int i20 = Theme.key_windowBackgroundWhite;
        arrayList.add(new ThemeDescription(paymentInfoCell, i19, null, null, null, null, i20));
        int i21 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i21));
        arrayList.add(new ThemeDescription(this.paymentInfoCell, 0, new Class[]{PaymentInfoCell.class}, new String[]{"detailExTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayText2));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, i20));
        arrayList.add(new ThemeDescription(this.bottomLayout, ThemeDescription.FLAG_SELECTORWHITE, null, null, null, null, Theme.key_listSelector));
        return arrayList;
    }

    class BottomFrameLayout extends FrameLayout {
        Paint paint;
        float progress;
        SpringAnimation springAnimation;

        public BottomFrameLayout(Context context, TLRPC.PaymentForm paymentForm) {
            super(context);
            this.paint = new Paint(1);
            setWillNotDraw(false);
        }

        @Override
        protected void onDraw(Canvas canvas) {
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
            if (this.progress == f) {
                return;
            }
            SpringAnimation spring = new SpringAnimation(new FloatValueHolder(this.progress * 100.0f)).setSpring(new SpringForce(f * 100.0f).setStiffness(z ? 500.0f : 650.0f).setDampingRatio(1.0f));
            this.springAnimation = spring;
            spring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
                @Override
                public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f2, float f3) {
                    PaymentFormActivity.BottomFrameLayout.$r8$lambda$L3txJToyUg4Qni4X3auLUcwZ9mI(this.f$0, dynamicAnimation, f2, f3);
                }
            });
            this.springAnimation.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
                @Override
                public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z3, float f2, float f3) {
                    PaymentFormActivity.BottomFrameLayout.m3651$r8$lambda$Z1wW4WPz0emEysR2N4fxqBfuA(this.f$0, dynamicAnimation, z3, f2, f3);
                }
            });
            this.springAnimation.start();
        }

        public static void $r8$lambda$L3txJToyUg4Qni4X3auLUcwZ9mI(BottomFrameLayout bottomFrameLayout, DynamicAnimation dynamicAnimation, float f, float f2) {
            bottomFrameLayout.progress = f / 100.0f;
            if (PaymentFormActivity.this.payTextView != null) {
                PaymentFormActivity.this.payTextView.setAlpha((bottomFrameLayout.progress * 0.2f) + 0.8f);
            }
            bottomFrameLayout.invalidate();
        }

        public static void m3651$r8$lambda$Z1wW4WPz0emEysR2N4fxqBfuA(BottomFrameLayout bottomFrameLayout, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
            if (dynamicAnimation == bottomFrameLayout.springAnimation) {
                bottomFrameLayout.springAnimation = null;
            }
        }
    }
}
