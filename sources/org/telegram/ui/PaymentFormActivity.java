package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.Uri;
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
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.exoplayer2.text.ExoplayerCuesDecoder;
import com.google.android.exoplayer2.util.Log;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.mlkit_vision_common.zzkc;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.Wallet$WalletOptions;
import com.google.android.gms.wallet.zzk;
import com.stripe.android.Stripe;
import com.stripe.android.exception.APIConnectionException;
import com.stripe.android.exception.APIException;
import j$.util.Objects;
import j$.util.Optional;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
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
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.HintEditText;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.web.WebActionBar$$ExternalSyntheticLambda9;

public final class PaymentFormActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public boolean allowUnregistered;
    public TLRPC.User botUser;
    public final TextInfoPrivacyCell[] bottomCell;
    public BottomFrameLayout bottomLayout;
    public boolean canceled;
    public String cardName;
    public TextCheckCell checkCell1;
    public EditTextSettingsCell codeFieldCell;
    public final HashMap codesMap;
    public final ArrayList countriesArray;
    public final HashMap countriesMap;
    public CountrySelectActivity.Country country;
    public String countryName;
    public String currentBotName;
    public String currentItemName;
    public TL_account.Password currentPassword;
    public int currentStep;
    public Utilities.Callback customAnyResultReceiver;
    public WebActionBar$$ExternalSyntheticLambda9 customErrorReceiver;
    public Utilities.Callback customResultReceiver;
    public PaymentFormActivityDelegate delegate;
    public final TextDetailSettingsCell[] detailSettingsCell;
    public final ArrayList dividers;
    public ActionBarMenuItem doneItem;
    public AnimatorSet doneItemAnimation;
    public boolean donePressed;
    public int emailCodeLength;
    public FrameLayout googlePayButton;
    public FrameLayout googlePayContainer;
    public String googlePayCountryCode;
    public TLRPC.TL_inputPaymentCredentialsGooglePay googlePayCredentials;
    public JSONObject googlePayParameters;
    public String googlePayPublicKey;
    public final HeaderCell[] headerCell;
    public boolean ignoreOnCardChange;
    public boolean ignoreOnPhoneChange;
    public boolean ignoreOnTextChange;
    public boolean initGooglePay;
    public EditTextBoldCursor[] inputFields;
    public TLRPC.InputInvoice invoiceInput;
    public String invoiceSlug;
    public int invoiceStatus;
    public boolean isCheckoutPreview;
    public boolean isWebView;
    public LinearLayout linearLayout2;
    public boolean loadingPasswordInfo;
    public MessageObject messageObject;
    public boolean needPayAfterTransition;
    public boolean need_card_country;
    public boolean need_card_name;
    public boolean need_card_postcode;
    public BaseFragment parentFragment;
    public PaymentFormActivity passwordFragment;
    public boolean passwordOk;
    public TextView payTextView;
    public TLRPC.PaymentForm paymentForm;
    public PaymentFormCallback paymentFormCallback;
    public TLRPC.TL_paymentFormMethod paymentFormMethod;
    public PaymentInfoCell paymentInfoCell;
    public String paymentJson;
    public final TLRPC.PaymentReceipt paymentReceipt;
    public boolean paymentStatusSent;
    public zze paymentsClient;
    public final HashMap phoneFormatMap;
    public ArrayList prices;
    public ContextProgressView progressView;
    public ContextProgressView progressViewButton;
    public String providerApiKey;
    public RadioCell[] radioCells;
    public RecurrentPaymentsAcceptCell recurrentAcceptCell;
    public boolean recurrentAccepted;
    public TLRPC.TL_payments_validatedRequestedInfo requestedInfo;
    public Theme.ResourcesProvider resourcesProvider;
    public boolean saveCardInfo;
    public boolean saveShippingInfo;
    public TLRPC.TL_paymentSavedCredentialsCard savedCredentialsCard;
    public ScrollView scrollView;
    public final ShadowSectionCell[] sectionCell;
    public final TextSettingsCell[] settingsCell;
    public float shiftDp;
    public TLRPC.TL_shippingOption shippingOption;
    public PaymentFormActivity$$ExternalSyntheticLambda2 shortPollRunnable;
    public boolean shouldNavigateBack;
    public boolean swipeBackEnabled;
    public TextView textView;
    public Long tipAmount;
    public AnonymousClass12 tipLayout;
    public TextPriceCell totalCell;
    public String[] totalPrice;
    public TLRPC.TL_payments_validateRequestedInfo validateRequest;
    public boolean waitingForEmail;
    public WebView webView;
    public String webViewUrl;
    public boolean webviewLoading;
    public static final List WEBVIEW_PROTOCOLS = Arrays.asList("http", "https");
    public static final List BLACKLISTED_PROTOCOLS = Collections.singletonList("tg");

    public final class AnonymousClass19 extends WebViewClient {
        public final Context val$context;

        public AnonymousClass19(Context context) {
            this.val$context = context;
        }

        @Override
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.webviewLoading = false;
            paymentFormActivity.showEditDoneProgress$3(true, false);
            paymentFormActivity.updateSavePaymentField();
        }

        @Override
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            try {
                if (!AndroidUtilities.isSafeToShow(paymentFormActivity.getParentActivity())) {
                    return true;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity(), 0, paymentFormActivity.resourcesProvider);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = LocaleController.getString(R.string.ChromeCrashTitle);
                alertDialog.message = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new PhotoViewer$$ExternalSyntheticLambda21(this, 6));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                Uri uri = Uri.parse(str);
                boolean zEquals = "t.me".equals(uri.getHost());
                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                if (zEquals) {
                    paymentFormActivity.goToNextStep();
                    return true;
                }
                if (!PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(uri.getScheme())) {
                    if (!PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(uri.getScheme())) {
                        try {
                            if (paymentFormActivity.getParentActivity() != null) {
                                paymentFormActivity.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                                return true;
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, null);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = paymentFormActivity.currentBotName;
                            alertDialog.message = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            builder.show();
                        }
                    }
                    return false;
                }
                return true;
            } catch (Exception unused2) {
            }
        }
    }

    public final class AnonymousClass2 extends View {
        public final int $r8$classId;

        public AnonymousClass2(Context context, int i) {
            super(context);
            this.$r8$classId = i;
        }

        @Override
        public void onDraw(Canvas canvas) {
            switch (this.$r8$classId) {
                case 0:
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                    break;
                case 7:
                    super.onDraw(canvas);
                    canvas.drawLine(0.0f, AndroidUtilities.dp(14.0f), 2.0f, getMeasuredHeight() - AndroidUtilities.dp(14.0f), Theme.dividerPaint);
                    break;
                case 17:
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                    break;
                case 18:
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                    break;
                case 19:
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                    break;
                case 26:
                    if (getAlpha() != 0.0f) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, getWidth(), getHeight());
                        invalidate();
                        break;
                    }
                    break;
                case 29:
                    canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
                    break;
                default:
                    super.onDraw(canvas);
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 2:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    break;
                case 3:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(81.0f), 1073741824));
                    break;
                case 4:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(8.0f), 1073741824));
                    break;
                case 5:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    break;
                case 6:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                    break;
                case 7:
                case 17:
                case 18:
                case 19:
                case 26:
                default:
                    super.onMeasure(i, i2);
                    break;
                case 8:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(300.0f), 1073741824));
                    break;
                case 9:
                    Point point = AndroidUtilities.displaySize;
                    int i3 = point.x;
                    int i4 = point.y;
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec((int) (i4 * (i3 < i4 ? 0.56f : 0.3f)), 1073741824));
                    break;
                case 10:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(5.0f), 1073741824));
                    break;
                case 11:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                    break;
                case 12:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(68.0f), 1073741824));
                    break;
                case 13:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (AndroidUtilities.displaySize.y * 0.4f), 1073741824));
                    break;
                case 14:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                    break;
                case 15:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    break;
                case 16:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(GroupCallActivity.isLandscapeMode ? 0.0f : 8.0f), 1073741824));
                    break;
                case 20:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824));
                    break;
                case 21:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                    break;
                case 22:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(7.33f), 1073741824));
                    break;
                case 23:
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(16.0f), 1073741824));
                    break;
                case 24:
                    super.onMeasure(i, i2);
                    setPivotX(getMeasuredWidth() / 2);
                    setPivotY(getMeasuredHeight());
                    break;
                case 25:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(52.0f), 1073741824));
                    break;
                case 27:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                    break;
                case 28:
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(4.0f), 1073741824));
                    break;
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 26:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
                default:
                    super.onSizeChanged(i, i2, i3, i4);
                    break;
            }
        }
    }

    public final class AnonymousClass23 extends JSONObject {
        {
            put("type", "PAYMENT_GATEWAY");
            Object obj = paymentFormActivity.googlePayParameters;
            if (obj != null) {
                put("parameters", obj);
                return;
            }
            JSONObject anonymousClass24 = new AnonymousClass23();
            anonymousClass24.put("gateway", "stripe");
            anonymousClass24.put("stripe:publishableKey", paymentFormActivity.providerApiKey);
            anonymousClass24.put("stripe:version", "3.5.0");
            put("parameters", anonymousClass24);
        }
    }

    public final class AnonymousClass26 {
        public AnonymousClass26() {
        }

        public final void onError(Exception exc) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            if (paymentFormActivity.canceled) {
                return;
            }
            paymentFormActivity.showEditDoneProgress$3(true, false);
            paymentFormActivity.setDonePressed(false);
            if ((exc instanceof APIConnectionException) || (exc instanceof APIException)) {
                AlertsCreator.showSimpleToast(paymentFormActivity, LocaleController.getString(R.string.PaymentConnectionFailed));
            } else {
                AlertsCreator.showSimpleToast(paymentFormActivity, exc.getMessage());
            }
        }
    }

    public final class AnonymousClass5 extends WebView {
        public final int $r8$classId = 1;
        public final Object this$0;

        public AnonymousClass5(Activity activity, Activity activity2) {
            super(activity);
            this.this$0 = activity2;
        }

        @Override
        public void onAttachedToWindow() {
            switch (this.$r8$classId) {
                case 1:
                    AndroidUtilities.checkAndroidTheme((Activity) this.this$0, true);
                    super.onAttachedToWindow();
                    break;
                default:
                    super.onAttachedToWindow();
                    break;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            switch (this.$r8$classId) {
                case 1:
                    AndroidUtilities.checkAndroidTheme((Activity) this.this$0, false);
                    super.onDetachedFromWindow();
                    break;
                default:
                    super.onDetachedFromWindow();
                    break;
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            switch (this.$r8$classId) {
                case 0:
                    super.onMeasure(i, i2);
                    break;
                default:
                    super.onMeasure(i, i2);
                    break;
            }
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    ((ViewGroup) ((PaymentFormActivity) this.this$0).fragmentView).requestDisallowInterceptTouchEvent(true);
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }

        public AnonymousClass5(PaymentFormActivity paymentFormActivity, Context context) {
            super(context);
            this.this$0 = paymentFormActivity;
        }
    }

    public final class AnonymousClass6 extends WebViewClient {
        public final Context val$context;

        public AnonymousClass6(Context context) {
            this.val$context = context;
        }

        @Override
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.webviewLoading = false;
            paymentFormActivity.showEditDoneProgress$3(true, false);
            paymentFormActivity.updateSavePaymentField();
        }

        @Override
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            try {
                if (!AndroidUtilities.isSafeToShow(paymentFormActivity.getParentActivity())) {
                    return true;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(paymentFormActivity.getParentActivity(), 0, paymentFormActivity.resourcesProvider);
                AlertDialog alertDialog = builder.alertDialog;
                alertDialog.title = LocaleController.getString(R.string.ChromeCrashTitle);
                alertDialog.message = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.ChromeCrashMessage), new PhotoViewer$$ExternalSyntheticLambda21(this, 8));
                builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                builder.show();
                return true;
            } catch (Exception e) {
                FileLog.e(e);
                return false;
            }
        }

        @Override
        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.shouldNavigateBack = !str.equals(paymentFormActivity.webViewUrl);
            try {
                Uri uri = Uri.parse(str);
                if ("t.me".equals(uri.getHost())) {
                    paymentFormActivity.goToNextStep();
                    return true;
                }
                if (!PaymentFormActivity.BLACKLISTED_PROTOCOLS.contains(uri.getScheme())) {
                    if (!PaymentFormActivity.WEBVIEW_PROTOCOLS.contains(uri.getScheme())) {
                        try {
                            if (paymentFormActivity.getParentActivity() != null) {
                                paymentFormActivity.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", uri), 210);
                                return true;
                            }
                        } catch (ActivityNotFoundException unused) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(this.val$context, 0, null);
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.title = paymentFormActivity.currentBotName;
                            alertDialog.message = LocaleController.getString(R.string.PaymentAppNotFoundForDeeplink);
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            builder.show();
                        }
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
                return true;
            } catch (Exception unused2) {
            }
        }
    }

    public final class BottomFrameLayout extends FrameLayout {
        public final Paint paint;
        public float progress;
        public SpringAnimation springAnimation;

        public BottomFrameLayout(Context context) {
            super(context);
            this.paint = new Paint(1);
            setWillNotDraw(false);
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            int i = Theme.key_switchTrackBlue;
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            canvas.drawColor(paymentFormActivity.getThemedColor(i));
            Paint paint = this.paint;
            paint.setColor(paymentFormActivity.getThemedColor(Theme.key_contacts_inviteBackground));
            canvas.drawCircle(LocaleController.isRTL ? getWidth() - AndroidUtilities.dp(28.0f) : AndroidUtilities.dp(28.0f), -AndroidUtilities.dp(28.0f), Math.max(getWidth(), getHeight()) * this.progress, paint);
        }

        public final void setChecked(boolean z, boolean z2) {
            SpringAnimation springAnimation = this.springAnimation;
            if (springAnimation != null) {
                springAnimation.cancel();
            }
            float f = z ? 1.0f : 0.0f;
            if (!z2) {
                this.progress = f;
                TextView textView = PaymentFormActivity.this.payTextView;
                if (textView != null) {
                    textView.setAlpha((f * 0.2f) + 0.8f);
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
            springAnimation2.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, 9));
            this.springAnimation.addEndListener(new CameraScanActivity$$ExternalSyntheticLambda14(this, 8));
            this.springAnimation.start();
        }
    }

    public final class LinkSpan extends ClickableSpan {
        public LinkSpan() {
        }

        @Override
        public final void onClick(View view) {
            PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
            paymentFormActivity.presentFragment(new TwoStepVerificationSetupActivity(6, paymentFormActivity.currentPassword));
        }

        @Override
        public final void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    public interface PaymentFormActivityDelegate {
        void currentPasswordUpdated(TL_account.Password password);

        void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo);

        boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard);

        void onFragmentDestroyed();
    }

    public interface PaymentFormCallback {
        void onInvoiceStatusChanged(int i);
    }

    public final class TelegramWebviewProxy {
        public TelegramWebviewProxy() {
        }

        @JavascriptInterface
        public void postEvent(String str, String str2) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda8(this, str, str2, 4));
        }
    }

    public PaymentFormActivity(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment, boolean z2) {
        super(null);
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

    public static void access$1100(org.telegram.ui.PaymentFormActivity r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PaymentFormActivity.access$1100(org.telegram.ui.PaymentFormActivity):void");
    }

    public static JSONObject getBaseCardPaymentMethod() throws JSONException {
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

    public static void shakeView(View view) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 2.5f);
    }

    public final void checkPassword() {
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
        showEditDoneProgress$3(true, true);
        setDonePressed(true);
        TL_account.getPassword getpassword = new TL_account.getPassword();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getpassword, new LinkManager$$ExternalSyntheticLambda0((Object) this, string, (Object) getpassword, 17), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public final void createGooglePayButton(Context context) {
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
        this.googlePayContainer.addView(this.googlePayButton, LayoutHelper.createFrame(48.0f, -1));
        this.googlePayButton.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setWeightSum(2.0f);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(1);
        linearLayout.setDuplicateParentStateEnabled(true);
        this.googlePayButton.addView(linearLayout, LayoutHelper.createFrame(-1.0f, -1));
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setDuplicateParentStateEnabled(true);
        imageView.setImageResource(R.drawable.buy_with_googlepay_button_content);
        linearLayout.addView(imageView, LayoutHelper.createLinear(1.0f, -1, 0));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
        imageView2.setDuplicateParentStateEnabled(true);
        imageView2.setImageResource(R.drawable.googlepay_button_overlay);
        this.googlePayButton.addView(imageView2, LayoutHelper.createFrame(-1.0f, -1));
    }

    @Override
    public final View createView(Context context) {
        FrameLayout frameLayout;
        String str;
        String name;
        boolean z;
        ?? r5;
        TLRPC.PaymentForm paymentForm;
        ?? r0;
        ?? r7;
        ?? spannableStringBuilder;
        TLRPC.PaymentForm paymentForm2;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo;
        boolean z2;
        int i;
        int i2;
        char c;
        int i3;
        TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo2;
        String upperCase;
        String str2;
        ?? frameLayout2;
        boolean z3;
        TLRPC.TL_postAddress tL_postAddress;
        TLRPC.TL_postAddress tL_postAddress2;
        TLRPC.TL_postAddress tL_postAddress3;
        TLRPC.TL_postAddress tL_postAddress4;
        TLRPC.TL_postAddress tL_postAddress5;
        TLRPC.TL_postAddress tL_postAddress6;
        String str3;
        String str4;
        int i4 = 10;
        int i5 = 3;
        int i6 = 2;
        final ?? r4 = 0;
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
            public final void onItemClick(int i7) {
                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                if (i7 == -1) {
                    if (paymentFormActivity.donePressed) {
                        return;
                    }
                    paymentFormActivity.finishFragment();
                    return;
                }
                if (i7 != 1 || paymentFormActivity.donePressed) {
                    return;
                }
                if (paymentFormActivity.currentStep != 3) {
                    AndroidUtilities.hideKeyboard(paymentFormActivity.getParentActivity().getCurrentFocus());
                }
                int i8 = paymentFormActivity.currentStep;
                if (i8 == 0) {
                    paymentFormActivity.setDonePressed(true);
                    paymentFormActivity.sendForm();
                    return;
                }
                int i9 = 0;
                if (i8 == 1) {
                    while (true) {
                        RadioCell[] radioCellArr = paymentFormActivity.radioCells;
                        if (i9 >= radioCellArr.length) {
                            break;
                        }
                        if (radioCellArr[i9].radioButton.isChecked) {
                            paymentFormActivity.shippingOption = paymentFormActivity.requestedInfo.shipping_options.get(i9);
                            break;
                        }
                        i9++;
                    }
                    paymentFormActivity.goToNextStep();
                    return;
                }
                if (i8 == 2) {
                    PaymentFormActivity.access$1100(paymentFormActivity);
                } else if (i8 == 3) {
                    paymentFormActivity.checkPassword();
                } else {
                    if (i8 != 6) {
                        return;
                    }
                    paymentFormActivity.sendSavePassword(false);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        int i7 = this.currentStep;
        if (i7 == 0 || i7 == 1 || i7 == 2 || i7 == 3 || i7 == 4 || i7 == 6) {
            this.doneItem = actionBarMenuCreateMenu.addItemWithWidth(1, R.drawable.ic_ab_done, LocaleController.getString(R.string.Done), AndroidUtilities.dp(56.0f));
            ContextProgressView contextProgressView = new ContextProgressView(context, 1);
            this.progressView = contextProgressView;
            contextProgressView.setAlpha(0.0f);
            this.progressView.setScaleX(0.1f);
            this.progressView.setScaleY(0.1f);
            this.progressView.setVisibility(4);
            this.doneItem.addView(this.progressView, LayoutHelper.createFrame(-1.0f, -1));
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.fragmentView = frameLayout3;
        frameLayout3.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundGray));
        ScrollView scrollView = new ScrollView(context);
        this.scrollView = scrollView;
        scrollView.setFillViewport(true);
        AndroidUtilities.setScrollViewEdgeEffectColor(this.scrollView, getThemedColor(Theme.key_actionBarDefault));
        frameLayout3.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f, 51, 0.0f, 0.0f, 0.0f, this.currentStep == 4 ? 48.0f : 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.linearLayout2 = linearLayout;
        linearLayout.setOrientation(1);
        this.linearLayout2.setClipChildren(false);
        this.scrollView.addView(this.linearLayout2, new FrameLayout.LayoutParams(-1, -2));
        int i8 = this.currentStep;
        String str5 = "";
        if (i8 == 0) {
            HashMap map = new HashMap();
            HashMap map2 = new HashMap();
            try {
                c = 1;
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getResources().getAssets().open("countries.txt")));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line != null) {
                            String[] strArrSplit = line.split(";");
                            this.countriesArray.add(0, strArrSplit[2]);
                            this.countriesMap.put(strArrSplit[2], strArrSplit[0]);
                            this.codesMap.put(strArrSplit[0], strArrSplit[2]);
                            map2.put(strArrSplit[1], strArrSplit[2]);
                            if (strArrSplit.length > 3) {
                                this.phoneFormatMap.put(strArrSplit[0], strArrSplit[3]);
                            }
                            map.put(strArrSplit[1], strArrSplit[2]);
                        } else {
                            bufferedReader.close();
                        }
                        Collections.sort(this.countriesArray, new OAuthSheet$$ExternalSyntheticLambda3(i6));
                        this.inputFields = new EditTextBoldCursor[10];
                        int i9 = 0;
                        while (i9 < i4) {
                            if (i9 == 0) {
                                this.headerCell[r4] = new HeaderCell(context, this.resourcesProvider);
                                this.headerCell[r4].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                this.headerCell[r4].setText(LocaleController.getString(R.string.PaymentShippingAddress));
                                this.linearLayout2.addView(this.headerCell[r4], LayoutHelper.createLinear(-1, -2));
                            } else if (i9 == 6) {
                                this.sectionCell[r4] = new ShadowSectionCell(context, (int) r4);
                                this.linearLayout2.addView(this.sectionCell[r4], LayoutHelper.createLinear(-1, -2));
                                this.headerCell[c] = new HeaderCell(context, this.resourcesProvider);
                                this.headerCell[c].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                                this.headerCell[c].setText(LocaleController.getString(R.string.PaymentShippingReceiver));
                                this.linearLayout2.addView(this.headerCell[c], LayoutHelper.createLinear(-1, -2));
                            }
                            if (i9 == 8) {
                                frameLayout2 = new LinearLayout(context);
                                frameLayout2.setClipChildren(r4);
                                frameLayout2.setOrientation(r4);
                                this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 50));
                                frameLayout2.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                            } else if (i9 == 9) {
                                frameLayout2 = (ViewGroup) this.inputFields[8].getParent();
                            } else {
                                frameLayout2 = new FrameLayout(context);
                                frameLayout2.setClipChildren(r4);
                                this.linearLayout2.addView(frameLayout2, LayoutHelper.createLinear(-1, 50));
                                int i10 = Theme.key_windowBackgroundWhite;
                                frameLayout2.setBackgroundColor(getThemedColor(i10));
                                boolean z4 = i9 != 5;
                                if (z4) {
                                    if (i9 == 7 && !this.paymentForm.invoice.phone_requested) {
                                        z4 = false;
                                    } else if (i9 == 6) {
                                        TLRPC.TL_invoice tL_invoice = this.paymentForm.invoice;
                                        if (!tL_invoice.phone_requested && !tL_invoice.email_requested) {
                                            z4 = false;
                                        }
                                    }
                                }
                                if (z4) {
                                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, r4);
                                    anonymousClass2.setBackgroundColor(getThemedColor(i10));
                                    this.dividers.add(anonymousClass2);
                                    frameLayout2.addView(anonymousClass2, new FrameLayout.LayoutParams(-1, 1, 83));
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
                                this.inputFields[i9].setOnTouchListener(new View.OnTouchListener(this) {
                                    public final PaymentFormActivity f$0;

                                    {
                                        this.f$0 = this;
                                    }

                                    @Override
                                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                                        switch (r4) {
                                            case 0:
                                                return this.f$0.lambda$createView$1(motionEvent);
                                            default:
                                                return this.f$0.lambda$createView$6(motionEvent);
                                        }
                                    }
                                });
                                this.inputFields[i9].setInputType(r4);
                            }
                            if (i9 == 9 || i9 == 8) {
                                this.inputFields[i9].setInputType(i5);
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
                                        String str6 = (String) map2.get(tL_postAddress5.country_iso2);
                                        String str7 = this.paymentForm.saved_info.shipping_address.country_iso2;
                                        this.countryName = str7;
                                        EditTextBoldCursor editTextBoldCursor2 = this.inputFields[i9];
                                        if (str6 == null) {
                                            str6 = str7;
                                        }
                                        editTextBoldCursor2.setText(str6);
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
                            if (i9 == 8) {
                                TextView textView = new TextView(context);
                                this.textView = textView;
                                textView.setText("+");
                                this.textView.setTextColor(getThemedColor(i11));
                                this.textView.setTextSize(1, 16.0f);
                                frameLayout2.addView(this.textView, LayoutHelper.createLinear(21.0f, 12.0f, 0.0f, 6.0f, -2, -2));
                                this.inputFields[i9].setPadding(AndroidUtilities.dp(10.0f), r4, r4, r4);
                                this.inputFields[i9].setGravity(19);
                                InputFilter[] inputFilterArr = new InputFilter[1];
                                inputFilterArr[r4] = new InputFilter.LengthFilter(5);
                                this.inputFields[i9].setFilters(inputFilterArr);
                                frameLayout2.addView(this.inputFields[i9], LayoutHelper.createLinear(0.0f, 12.0f, 21.0f, 6.0f, 55, -2));
                                this.inputFields[i9].addTextChangedListener(new TextWatcher() {
                                    @Override
                                    public final void afterTextChanged(Editable editable) {
                                        String str8;
                                        boolean z5;
                                        String str9;
                                        PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                                        if (paymentFormActivity.ignoreOnTextChange) {
                                            return;
                                        }
                                        paymentFormActivity.ignoreOnTextChange = true;
                                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(paymentFormActivity.inputFields[8].getText().toString(), false);
                                        paymentFormActivity.inputFields[8].setText(strStripExceptNumbers);
                                        HintEditText hintEditText = (HintEditText) paymentFormActivity.inputFields[9];
                                        if (strStripExceptNumbers.length() == 0) {
                                            hintEditText.setHintText((String) null);
                                            hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                        } else {
                                            int length = strStripExceptNumbers.length();
                                            HashMap map3 = paymentFormActivity.codesMap;
                                            int i12 = 4;
                                            if (length > 4) {
                                                while (true) {
                                                    if (i12 < 1) {
                                                        str8 = null;
                                                        z5 = false;
                                                        break;
                                                    }
                                                    String strSubstring = strStripExceptNumbers.substring(0, i12);
                                                    if (((String) map3.get(strSubstring)) != null) {
                                                        String str10 = strStripExceptNumbers.substring(i12) + paymentFormActivity.inputFields[9].getText().toString();
                                                        paymentFormActivity.inputFields[8].setText(strSubstring);
                                                        str8 = str10;
                                                        strStripExceptNumbers = strSubstring;
                                                        z5 = true;
                                                        break;
                                                    }
                                                    i12--;
                                                }
                                                if (!z5) {
                                                    str8 = strStripExceptNumbers.substring(1) + paymentFormActivity.inputFields[9].getText().toString();
                                                    EditTextBoldCursor editTextBoldCursor4 = paymentFormActivity.inputFields[8];
                                                    strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                                    editTextBoldCursor4.setText(strStripExceptNumbers);
                                                }
                                            } else {
                                                str8 = null;
                                                z5 = false;
                                            }
                                            String str11 = (String) map3.get(strStripExceptNumbers);
                                            if (str11 == null || paymentFormActivity.countriesArray.indexOf(str11) == -1 || (str9 = (String) paymentFormActivity.phoneFormatMap.get(strStripExceptNumbers)) == null) {
                                                hintEditText.setHintText((String) null);
                                                hintEditText.setHint(LocaleController.getString(R.string.PaymentShippingPhoneNumber));
                                            } else {
                                                hintEditText.setHintText(str9.replace('X', (char) 8211));
                                                hintEditText.setHint((CharSequence) null);
                                            }
                                            if (!z5) {
                                                EditTextBoldCursor editTextBoldCursor5 = paymentFormActivity.inputFields[8];
                                                editTextBoldCursor5.setSelection(editTextBoldCursor5.getText().length());
                                            }
                                            if (str8 != null) {
                                                hintEditText.requestFocus();
                                                hintEditText.setText(str8);
                                                hintEditText.setSelection(hintEditText.length());
                                            }
                                        }
                                        paymentFormActivity.ignoreOnTextChange = false;
                                    }

                                    @Override
                                    public final void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                    }

                                    @Override
                                    public final void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
                                    }
                                });
                            } else if (i9 == 9) {
                                this.inputFields[i9].setPadding(r4, r4, r4, r4);
                                this.inputFields[i9].setGravity(19);
                                frameLayout2.addView(this.inputFields[i9], LayoutHelper.createLinear(0.0f, 12.0f, 21.0f, 6.0f, -1, -2));
                                this.inputFields[i9].addTextChangedListener(new PassportActivity.AnonymousClass10(this, 4));
                            } else {
                                this.inputFields[i9].setPadding(r4, r4, r4, AndroidUtilities.dp(6.0f));
                                this.inputFields[i9].setGravity(LocaleController.isRTL ? 5 : 3);
                                frameLayout2.addView(this.inputFields[i9], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                            }
                            final int i12 = 1;
                            this.inputFields[i9].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                                public final PaymentFormActivity f$0;

                                {
                                    this.f$0 = this;
                                }

                                @Override
                                public final boolean onEditorAction(TextView textView2, int i13, KeyEvent keyEvent) {
                                    EditTextBoldCursor[] editTextBoldCursorArr;
                                    switch (i12) {
                                        case 0:
                                            PaymentFormActivity paymentFormActivity = this.f$0;
                                            if (i13 == 6) {
                                                paymentFormActivity.doneItem.performClick();
                                                return true;
                                            }
                                            paymentFormActivity.getClass();
                                            return false;
                                        case 1:
                                            PaymentFormActivity paymentFormActivity2 = this.f$0;
                                            paymentFormActivity2.getClass();
                                            if (i13 != 5) {
                                                if (i13 != 6) {
                                                    return false;
                                                }
                                                paymentFormActivity2.doneItem.performClick();
                                                return true;
                                            }
                                            int iIntValue = ((Integer) textView2.getTag()).intValue();
                                            while (true) {
                                                iIntValue++;
                                                EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                                if (iIntValue >= editTextBoldCursorArr2.length) {
                                                    return true;
                                                }
                                                if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                                    paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                                    return true;
                                                }
                                            }
                                            break;
                                        case 2:
                                            PaymentFormActivity paymentFormActivity3 = this.f$0;
                                            paymentFormActivity3.getClass();
                                            if (i13 != 5) {
                                                if (i13 != 6) {
                                                    return false;
                                                }
                                                paymentFormActivity3.doneItem.performClick();
                                                return true;
                                            }
                                            int iIntValue2 = ((Integer) textView2.getTag()).intValue();
                                            do {
                                                int i14 = iIntValue2 + 1;
                                                editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                                if (i14 >= editTextBoldCursorArr.length) {
                                                    return true;
                                                }
                                                iIntValue2 = i14 == 4 ? iIntValue2 + 2 : i14;
                                            } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                                            paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                                            return true;
                                        case 3:
                                            PaymentFormActivity paymentFormActivity4 = this.f$0;
                                            if (i13 == 6) {
                                                paymentFormActivity4.sendSavePassword(false);
                                                return true;
                                            }
                                            paymentFormActivity4.getClass();
                                            return false;
                                        default:
                                            PaymentFormActivity paymentFormActivity5 = this.f$0;
                                            if (i13 == 6) {
                                                paymentFormActivity5.doneItem.performClick();
                                                return true;
                                            }
                                            paymentFormActivity5.getClass();
                                            if (i13 == 5) {
                                                int iIntValue3 = ((Integer) textView2.getTag()).intValue();
                                                if (iIntValue3 == 0) {
                                                    paymentFormActivity5.inputFields[1].requestFocus();
                                                } else if (iIntValue3 == 1) {
                                                    paymentFormActivity5.inputFields[2].requestFocus();
                                                }
                                            }
                                            return false;
                                    }
                                }
                            });
                            if (i9 == 9) {
                                TLRPC.TL_invoice tL_invoice2 = this.paymentForm.invoice;
                                if (tL_invoice2.email_to_provider || tL_invoice2.phone_to_provider) {
                                    TLRPC.User user = null;
                                    for (int i13 = 0; i13 < this.paymentForm.users.size(); i13++) {
                                        TLRPC.User user2 = this.paymentForm.users.get(i13);
                                        if (user2.id == this.paymentForm.provider_id) {
                                            user = user2;
                                        }
                                    }
                                    String name2 = user != null ? ContactsController.formatName(user.first_name, user.last_name) : "";
                                    z3 = true;
                                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                                    TLRPC.TL_invoice tL_invoice3 = this.paymentForm.invoice;
                                    boolean z5 = tL_invoice3.email_to_provider;
                                    if (z5 && tL_invoice3.phone_to_provider) {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneEmailToProvider", R.string.PaymentPhoneEmailToProvider, name2));
                                    } else if (z5) {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentEmailToProvider", R.string.PaymentEmailToProvider, name2));
                                    } else {
                                        this.bottomCell[1].setText(LocaleController.formatString("PaymentPhoneToProvider", R.string.PaymentPhoneToProvider, name2));
                                    }
                                } else {
                                    this.sectionCell[1] = new ShadowSectionCell(context, (int) r4);
                                    this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(-1, -2));
                                    z3 = true;
                                }
                                TextCheckCell textCheckCell = new TextCheckCell(context, this.resourcesProvider);
                                this.checkCell1 = textCheckCell;
                                textCheckCell.setBackgroundDrawable(Theme.getSelectorDrawable(z3));
                                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentShippingSave), this.saveShippingInfo, false);
                                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                                this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 8));
                                this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                                this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                                this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentShippingSaveInfo));
                                this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                            }
                            i9++;
                            i4 = 10;
                            r4 = 0;
                            i5 = 3;
                            c = 1;
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
                            ((ViewGroup) this.inputFields[2].getParent()).setVisibility(8);
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
                                    this.inputFields[8].setText((CharSequence) this.countriesMap.get(str2));
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
                c = 1;
            }
        } else if (i8 == 2) {
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
                showEditDoneProgress$3(true, true);
                this.progressView.setVisibility(0);
                this.doneItem.setEnabled(false);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                AnonymousClass5 anonymousClass5 = new AnonymousClass5(this, context);
                this.webView = anonymousClass5;
                anonymousClass5.getSettings().setJavaScriptEnabled(true);
                this.webView.getSettings().setDomStorageEnabled(true);
                this.webView.getSettings().setSupportZoom(true);
                this.webView.getSettings().setBuiltInZoomControls(true);
                this.webView.getSettings().setDisplayZoomControls(false);
                this.webView.getSettings().setUseWideViewPort(true);
                this.webView.getSettings().setMixedContentMode(0);
                CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                this.webView.addJavascriptInterface(new TelegramWebviewProxy(), "TelegramWebviewProxy");
                this.webView.setWebViewClient(new AnonymousClass6(context));
                this.linearLayout2.addView(this.webView, LayoutHelper.createFrame(-2.0f, -1));
                this.sectionCell[2] = new ShadowSectionCell(context, 0);
                this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                TextCheckCell textCheckCell2 = new TextCheckCell(context, this.resourcesProvider);
                this.checkCell1 = textCheckCell2;
                textCheckCell2.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 10));
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
                int i14 = 0;
                for (int i15 = 6; i14 < i15; i15 = 6) {
                    if (i14 == 0) {
                        this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                        this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i14 == 4) {
                        this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                        this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                        this.headerCell[1].setText(LocaleController.getString(R.string.PaymentBillingAddress));
                        this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    boolean z6 = (i14 == 3 || i14 == 5 || (i14 == 4 && !this.need_card_postcode)) ? false : true;
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    frameLayout4.setClipChildren(false);
                    int i16 = Theme.key_windowBackgroundWhite;
                    frameLayout4.setBackgroundColor(getThemedColor(i16));
                    this.linearLayout2.addView(frameLayout4, LayoutHelper.createLinear(-1, 50));
                    this.inputFields[i14] = new EditTextBoldCursor(context);
                    this.inputFields[i14].setTag(Integer.valueOf(i14));
                    this.inputFields[i14].setTextSize(1, 16.0f);
                    this.inputFields[i14].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                    EditTextBoldCursor editTextBoldCursor4 = this.inputFields[i14];
                    int i17 = Theme.key_windowBackgroundWhiteBlackText;
                    editTextBoldCursor4.setTextColor(getThemedColor(i17));
                    this.inputFields[i14].setBackgroundDrawable(null);
                    this.inputFields[i14].setCursorColor(getThemedColor(i17));
                    this.inputFields[i14].setCursorSize(AndroidUtilities.dp(20.0f));
                    this.inputFields[i14].setCursorWidth(1.5f);
                    if (i14 == 3) {
                        this.inputFields[i14].setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
                        this.inputFields[i14].setInputType(130);
                        this.inputFields[i14].setTypeface(Typeface.DEFAULT);
                        this.inputFields[i14].setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else if (i14 == 0) {
                        this.inputFields[i14].setInputType(3);
                    } else if (i14 == 4) {
                        final int i18 = 1;
                        this.inputFields[i14].setOnTouchListener(new View.OnTouchListener(this) {
                            public final PaymentFormActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final boolean onTouch(View view, MotionEvent motionEvent) {
                                switch (i18) {
                                    case 0:
                                        return this.f$0.lambda$createView$1(motionEvent);
                                    default:
                                        return this.f$0.lambda$createView$6(motionEvent);
                                }
                            }
                        });
                        this.inputFields[i14].setInputType(0);
                    } else if (i14 == 1) {
                        this.inputFields[i14].setInputType(16386);
                    } else {
                        if (i14 == 2) {
                            this.inputFields[i14].setInputType(4097);
                        } else {
                            this.inputFields[i14].setInputType(16385);
                        }
                        this.inputFields[i14].setImeOptions(268435461);
                        if (i14 != 0) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                        } else if (i14 != 1) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                        } else if (i14 != 2) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardName));
                        } else if (i14 != 3) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                        } else if (i14 != 4) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                        } else if (i14 == 5) {
                            this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                        }
                        if (i14 == 0) {
                            this.inputFields[i14].addTextChangedListener(new TextWatcher() {
                                public int actionPosition;
                                public final String[] PREFIXES_15 = {"34", "37"};
                                public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                                public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                                public int characterAction = -1;

                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    char c2;
                                    boolean z7;
                                    int i19;
                                    int i20;
                                    String[] strArr;
                                    int i21;
                                    String str8;
                                    PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                                    if (paymentFormActivity.ignoreOnCardChange) {
                                        return;
                                    }
                                    EditTextBoldCursor editTextBoldCursor5 = paymentFormActivity.inputFields[0];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String string = editTextBoldCursor5.getText().toString();
                                    int i22 = 1;
                                    int i23 = 3;
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i24 = 0;
                                    while (i24 < string.length()) {
                                        int i25 = i24 + 1;
                                        String strSubstring = string.substring(i24, i25);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i24 = i25;
                                    }
                                    paymentFormActivity.ignoreOnCardChange = true;
                                    String str9 = null;
                                    int i26 = 100;
                                    if (sb.length() > 0) {
                                        String string2 = sb.toString();
                                        int i27 = 0;
                                        while (true) {
                                            if (i27 >= i23) {
                                                c2 = 1;
                                                break;
                                            }
                                            if (i27 == 0) {
                                                strArr = this.PREFIXES_16;
                                                i21 = 16;
                                                str8 = "xxxx xxxx xxxx xxxx";
                                            } else if (i27 != i22) {
                                                strArr = this.PREFIXES_14;
                                                i21 = 14;
                                                str8 = "xxxx xxxx xxxx xx";
                                            } else {
                                                strArr = this.PREFIXES_15;
                                                i21 = 15;
                                                str8 = "xxxx xxxx xxxx xxx";
                                            }
                                            c2 = 1;
                                            for (String str10 : strArr) {
                                                if (string2.length() <= str10.length()) {
                                                    if (str10.startsWith(string2)) {
                                                        i26 = i21;
                                                        str9 = str8;
                                                        break;
                                                    }
                                                } else {
                                                    if (string2.startsWith(str10)) {
                                                        i26 = i21;
                                                        str9 = str8;
                                                        break;
                                                    }
                                                }
                                            }
                                            if (str9 != null) {
                                                break;
                                            }
                                            i27++;
                                            i22 = 1;
                                            i23 = 3;
                                        }
                                        if (sb.length() > i26) {
                                            sb.setLength(i26);
                                        }
                                    } else {
                                        c2 = 1;
                                    }
                                    if (str9 != null) {
                                        if (sb.length() == i26) {
                                            paymentFormActivity.inputFields[c2].requestFocus();
                                        }
                                        editTextBoldCursor5.setTextColor(paymentFormActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                        int i28 = 0;
                                        while (i28 < sb.length()) {
                                            if (i28 >= str9.length()) {
                                                sb.insert(i28, ' ');
                                                if (selectionStart == i28 + 1 && (i19 = this.characterAction) != 2 && i19 != 3) {
                                                    selectionStart++;
                                                    break;
                                                } else {
                                                    break;
                                                    break;
                                                    break;
                                                }
                                            }
                                            if (str9.charAt(i28) == ' ') {
                                                sb.insert(i28, ' ');
                                                i28++;
                                                if (selectionStart == i28 && (i20 = this.characterAction) != 2 && i20 != 3) {
                                                    selectionStart++;
                                                }
                                            }
                                            i28++;
                                        }
                                    }
                                    if (sb.toString().equals(editable.toString())) {
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                        editable.replace(0, editable.length(), sb);
                                    }
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                    }
                                    paymentFormActivity.ignoreOnCardChange = z7;
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i19, int i20, int i21) {
                                    if (i20 == 0 && i21 == 1) {
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i20 != 1 || i21 != 0) {
                                        this.characterAction = -1;
                                    } else if (charSequence.charAt(i19) != ' ' || i19 <= 0) {
                                        this.characterAction = 2;
                                    } else {
                                        this.characterAction = 3;
                                        this.actionPosition = i19 - 1;
                                    }
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i19, int i20, int i21) {
                                }
                            });
                        } else if (i14 == 1) {
                            this.inputFields[i14].addTextChangedListener(new TextWatcher() {
                                public int actionPosition;
                                public int characterAction = -1;
                                public boolean isYear;

                                @Override
                                public final void afterTextChanged(Editable editable) {
                                    CountrySelectActivity.Country country;
                                    PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                                    if (paymentFormActivity.ignoreOnCardChange) {
                                        return;
                                    }
                                    boolean z7 = true;
                                    EditTextBoldCursor editTextBoldCursor5 = paymentFormActivity.inputFields[1];
                                    int selectionStart = editTextBoldCursor5.getSelectionStart();
                                    String string = editTextBoldCursor5.getText().toString();
                                    if (this.characterAction == 3) {
                                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                        selectionStart--;
                                    }
                                    StringBuilder sb = new StringBuilder(string.length());
                                    int i19 = 0;
                                    while (i19 < string.length()) {
                                        int i20 = i19 + 1;
                                        String strSubstring = string.substring(i19, i20);
                                        if ("0123456789".contains(strSubstring)) {
                                            sb.append(strSubstring);
                                        }
                                        i19 = i20;
                                    }
                                    paymentFormActivity.ignoreOnCardChange = true;
                                    paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    if (sb.length() > 4) {
                                        sb.setLength(4);
                                    }
                                    if (sb.length() < 2) {
                                        this.isYear = false;
                                    }
                                    if (this.isYear) {
                                        int i21 = sb.length() > 2 ? 2 : 1;
                                        String[] strArr = new String[i21];
                                        strArr[0] = sb.substring(0, 2);
                                        if (i21 == 2) {
                                            strArr[1] = sb.substring(2);
                                        }
                                        if (sb.length() == 4 && i21 == 2) {
                                            int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                            Calendar calendar = Calendar.getInstance();
                                            boolean z8 = UserConfig.getInstance(((BaseFragment) paymentFormActivity).currentAccount).getClientPhone().startsWith("7") || ((country = paymentFormActivity.country) != null && country.code.equals("7"));
                                            int i22 = z8 ? 2022 : calendar.get(1);
                                            int i23 = z8 ? 1 : calendar.get(2) + 1;
                                            if (iIntValue2 < i22 || (iIntValue2 == i22 && iIntValue < i23)) {
                                                paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z7 = false;
                                            }
                                        } else {
                                            int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                            if (iIntValue3 > 12 || iIntValue3 == 0) {
                                                paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z7 = false;
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
                                                paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                            } else {
                                                z7 = false;
                                            }
                                            selectionStart++;
                                        }
                                        z7 = false;
                                    }
                                    if (!z7 && sb.length() == 4) {
                                        paymentFormActivity.inputFields[paymentFormActivity.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                    }
                                    if (sb.length() != 2) {
                                        if (sb.length() > 2 && sb.charAt(2) != '/') {
                                            sb.insert(2, '/');
                                        }
                                        editTextBoldCursor5.setText(sb);
                                        if (selectionStart >= 0) {
                                            editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                        }
                                        paymentFormActivity.ignoreOnCardChange = false;
                                    }
                                    sb.append('/');
                                    selectionStart++;
                                    editTextBoldCursor5.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor5.setSelection(Math.min(selectionStart, editTextBoldCursor5.length()));
                                    }
                                    paymentFormActivity.ignoreOnCardChange = false;
                                }

                                @Override
                                public final void beforeTextChanged(CharSequence charSequence, int i19, int i20, int i21) {
                                    if (i20 == 0 && i21 == 1) {
                                        this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                        this.characterAction = 1;
                                        return;
                                    }
                                    if (i20 != 1 || i21 != 0) {
                                        this.characterAction = -1;
                                        return;
                                    }
                                    if (charSequence.charAt(i19) != '/' || i19 <= 0) {
                                        this.characterAction = 2;
                                        return;
                                    }
                                    this.isYear = false;
                                    this.characterAction = 3;
                                    this.actionPosition = i19 - 1;
                                }

                                @Override
                                public final void onTextChanged(CharSequence charSequence, int i19, int i20, int i21) {
                                }
                            });
                        }
                        this.inputFields[i14].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                        EditTextBoldCursor editTextBoldCursor5 = this.inputFields[i14];
                        if (LocaleController.isRTL) {
                            i = 5;
                        } else {
                            i = 3;
                        }
                        editTextBoldCursor5.setGravity(i);
                        frameLayout4.addView(this.inputFields[i14], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                        final int i19 = 2;
                        this.inputFields[i14].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                            public final PaymentFormActivity f$0;

                            {
                                this.f$0 = this;
                            }

                            @Override
                            public final boolean onEditorAction(TextView textView2, int i110, KeyEvent keyEvent) {
                                EditTextBoldCursor[] editTextBoldCursorArr;
                                switch (i19) {
                                    case 0:
                                        PaymentFormActivity paymentFormActivity = this.f$0;
                                        if (i110 == 6) {
                                            paymentFormActivity.doneItem.performClick();
                                            return true;
                                        }
                                        paymentFormActivity.getClass();
                                        return false;
                                    case 1:
                                        PaymentFormActivity paymentFormActivity2 = this.f$0;
                                        paymentFormActivity2.getClass();
                                        if (i110 != 5) {
                                            if (i110 != 6) {
                                                return false;
                                            }
                                            paymentFormActivity2.doneItem.performClick();
                                            return true;
                                        }
                                        int iIntValue = ((Integer) textView2.getTag()).intValue();
                                        while (true) {
                                            iIntValue++;
                                            EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                            if (iIntValue >= editTextBoldCursorArr2.length) {
                                                return true;
                                            }
                                            if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                                paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                                return true;
                                            }
                                        }
                                        break;
                                    case 2:
                                        PaymentFormActivity paymentFormActivity3 = this.f$0;
                                        paymentFormActivity3.getClass();
                                        if (i110 != 5) {
                                            if (i110 != 6) {
                                                return false;
                                            }
                                            paymentFormActivity3.doneItem.performClick();
                                            return true;
                                        }
                                        int iIntValue2 = ((Integer) textView2.getTag()).intValue();
                                        do {
                                            int i111 = iIntValue2 + 1;
                                            editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                            if (i111 >= editTextBoldCursorArr.length) {
                                                return true;
                                            }
                                            iIntValue2 = i111 == 4 ? iIntValue2 + 2 : i111;
                                        } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                                        paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                                        return true;
                                    case 3:
                                        PaymentFormActivity paymentFormActivity4 = this.f$0;
                                        if (i110 == 6) {
                                            paymentFormActivity4.sendSavePassword(false);
                                            return true;
                                        }
                                        paymentFormActivity4.getClass();
                                        return false;
                                    default:
                                        PaymentFormActivity paymentFormActivity5 = this.f$0;
                                        if (i110 == 6) {
                                            paymentFormActivity5.doneItem.performClick();
                                            return true;
                                        }
                                        paymentFormActivity5.getClass();
                                        if (i110 == 5) {
                                            int iIntValue3 = ((Integer) textView2.getTag()).intValue();
                                            if (iIntValue3 == 0) {
                                                paymentFormActivity5.inputFields[1].requestFocus();
                                            } else if (iIntValue3 == 1) {
                                                paymentFormActivity5.inputFields[2].requestFocus();
                                            }
                                        }
                                        return false;
                                }
                            }
                        });
                        if (i14 == 3) {
                            this.sectionCell[0] = new ShadowSectionCell(context, 0);
                            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i14 == 5) {
                            this.sectionCell[2] = new ShadowSectionCell(context, 0);
                            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                            TextCheckCell textCheckCell3 = new TextCheckCell(context, this.resourcesProvider);
                            this.checkCell1 = textCheckCell3;
                            textCheckCell3.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                            this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                            this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 9));
                            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                            updateSavePaymentField();
                            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                        } else if (i14 == 0) {
                            createGooglePayButton(context);
                            FrameLayout frameLayout5 = this.googlePayContainer;
                            if (LocaleController.isRTL) {
                                i2 = 3;
                            } else {
                                i2 = 5;
                            }
                            frameLayout4.addView(frameLayout5, LayoutHelper.createFrame(-2, -2.0f, i2 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                        }
                        if (z6) {
                            AnonymousClass2 anonymousClass3 = new AnonymousClass2(context, 19);
                            anonymousClass3.setBackgroundColor(getThemedColor(i16));
                            this.dividers.add(anonymousClass3);
                            frameLayout4.addView(anonymousClass3, new FrameLayout.LayoutParams(-1, 1, 83));
                        }
                        if ((i14 != 4 && !this.need_card_country) || ((i14 == 5 && !this.need_card_postcode) || (i14 == 2 && !this.need_card_name))) {
                            frameLayout4.setVisibility(8);
                        }
                        i14++;
                    }
                    this.inputFields[i14].setImeOptions(268435461);
                    if (i14 != 0) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardNumber));
                    } else if (i14 != 1) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardExpireDate));
                    } else if (i14 != 2) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardName));
                    } else if (i14 != 3) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentCardCvv));
                    } else if (i14 != 4) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentShippingCountry));
                    } else if (i14 == 5) {
                        this.inputFields[i14].setHint(LocaleController.getString(R.string.PaymentShippingZipPlaceholder));
                    }
                    if (i14 == 0) {
                        this.inputFields[i14].addTextChangedListener(new TextWatcher() {
                            public int actionPosition;
                            public final String[] PREFIXES_15 = {"34", "37"};
                            public final String[] PREFIXES_14 = {"300", "301", "302", "303", "304", "305", "309", "36", "38", "39"};
                            public final String[] PREFIXES_16 = {"2221", "2222", "2223", "2224", "2225", "2226", "2227", "2228", "2229", "2200", "2201", "2202", "2203", "2204", "8600", "9860", "223", "224", "225", "226", "227", "228", "229", "23", "24", "25", "26", "270", "271", "2720", "50", "51", "52", "53", "54", "55", "4", "60", "62", "64", "65", "35"};
                            public int characterAction = -1;

                            @Override
                            public final void afterTextChanged(Editable editable) {
                                char c2;
                                boolean z7;
                                int i110;
                                int i20;
                                String[] strArr;
                                int i21;
                                String str8;
                                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                                if (paymentFormActivity.ignoreOnCardChange) {
                                    return;
                                }
                                EditTextBoldCursor editTextBoldCursor6 = paymentFormActivity.inputFields[0];
                                int selectionStart = editTextBoldCursor6.getSelectionStart();
                                String string = editTextBoldCursor6.getText().toString();
                                int i22 = 1;
                                int i23 = 3;
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i24 = 0;
                                while (i24 < string.length()) {
                                    int i25 = i24 + 1;
                                    String strSubstring = string.substring(i24, i25);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i24 = i25;
                                }
                                paymentFormActivity.ignoreOnCardChange = true;
                                String str9 = null;
                                int i26 = 100;
                                if (sb.length() > 0) {
                                    String string2 = sb.toString();
                                    int i27 = 0;
                                    while (true) {
                                        if (i27 >= i23) {
                                            c2 = 1;
                                            break;
                                        }
                                        if (i27 == 0) {
                                            strArr = this.PREFIXES_16;
                                            i21 = 16;
                                            str8 = "xxxx xxxx xxxx xxxx";
                                        } else if (i27 != i22) {
                                            strArr = this.PREFIXES_14;
                                            i21 = 14;
                                            str8 = "xxxx xxxx xxxx xx";
                                        } else {
                                            strArr = this.PREFIXES_15;
                                            i21 = 15;
                                            str8 = "xxxx xxxx xxxx xxx";
                                        }
                                        c2 = 1;
                                        for (String str10 : strArr) {
                                            if (string2.length() <= str10.length()) {
                                                if (str10.startsWith(string2)) {
                                                    i26 = i21;
                                                    str9 = str8;
                                                    break;
                                                }
                                            } else {
                                                if (string2.startsWith(str10)) {
                                                    i26 = i21;
                                                    str9 = str8;
                                                    break;
                                                }
                                            }
                                        }
                                        if (str9 != null) {
                                            break;
                                        }
                                        i27++;
                                        i22 = 1;
                                        i23 = 3;
                                    }
                                    if (sb.length() > i26) {
                                        sb.setLength(i26);
                                    }
                                } else {
                                    c2 = 1;
                                }
                                if (str9 != null) {
                                    if (sb.length() == i26) {
                                        paymentFormActivity.inputFields[c2].requestFocus();
                                    }
                                    editTextBoldCursor6.setTextColor(paymentFormActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                    int i28 = 0;
                                    while (i28 < sb.length()) {
                                        if (i28 >= str9.length()) {
                                            sb.insert(i28, ' ');
                                            if (selectionStart == i28 + 1 && (i110 = this.characterAction) != 2 && i110 != 3) {
                                                selectionStart++;
                                                break;
                                            } else {
                                                break;
                                                break;
                                                break;
                                            }
                                        }
                                        if (str9.charAt(i28) == ' ') {
                                            sb.insert(i28, ' ');
                                            i28++;
                                            if (selectionStart == i28 && (i20 = this.characterAction) != 2 && i20 != 3) {
                                                selectionStart++;
                                            }
                                        }
                                        i28++;
                                    }
                                }
                                if (sb.toString().equals(editable.toString())) {
                                    z7 = false;
                                } else {
                                    z7 = false;
                                    editable.replace(0, editable.length(), sb);
                                }
                                if (selectionStart >= 0) {
                                    editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                }
                                paymentFormActivity.ignoreOnCardChange = z7;
                            }

                            @Override
                            public final void beforeTextChanged(CharSequence charSequence, int i110, int i20, int i21) {
                                if (i20 == 0 && i21 == 1) {
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i20 != 1 || i21 != 0) {
                                    this.characterAction = -1;
                                } else if (charSequence.charAt(i110) != ' ' || i110 <= 0) {
                                    this.characterAction = 2;
                                } else {
                                    this.characterAction = 3;
                                    this.actionPosition = i110 - 1;
                                }
                            }

                            @Override
                            public final void onTextChanged(CharSequence charSequence, int i110, int i20, int i21) {
                            }
                        });
                    } else if (i14 == 1) {
                        this.inputFields[i14].addTextChangedListener(new TextWatcher() {
                            public int actionPosition;
                            public int characterAction = -1;
                            public boolean isYear;

                            @Override
                            public final void afterTextChanged(Editable editable) {
                                CountrySelectActivity.Country country;
                                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                                if (paymentFormActivity.ignoreOnCardChange) {
                                    return;
                                }
                                boolean z7 = true;
                                EditTextBoldCursor editTextBoldCursor6 = paymentFormActivity.inputFields[1];
                                int selectionStart = editTextBoldCursor6.getSelectionStart();
                                String string = editTextBoldCursor6.getText().toString();
                                if (this.characterAction == 3) {
                                    string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                                    selectionStart--;
                                }
                                StringBuilder sb = new StringBuilder(string.length());
                                int i110 = 0;
                                while (i110 < string.length()) {
                                    int i20 = i110 + 1;
                                    String strSubstring = string.substring(i110, i20);
                                    if ("0123456789".contains(strSubstring)) {
                                        sb.append(strSubstring);
                                    }
                                    i110 = i20;
                                }
                                paymentFormActivity.ignoreOnCardChange = true;
                                paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                if (sb.length() > 4) {
                                    sb.setLength(4);
                                }
                                if (sb.length() < 2) {
                                    this.isYear = false;
                                }
                                if (this.isYear) {
                                    int i21 = sb.length() > 2 ? 2 : 1;
                                    String[] strArr = new String[i21];
                                    strArr[0] = sb.substring(0, 2);
                                    if (i21 == 2) {
                                        strArr[1] = sb.substring(2);
                                    }
                                    if (sb.length() == 4 && i21 == 2) {
                                        int iIntValue = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        int iIntValue2 = Utilities.parseInt((CharSequence) strArr[1]).intValue() + 2000;
                                        Calendar calendar = Calendar.getInstance();
                                        boolean z8 = UserConfig.getInstance(((BaseFragment) paymentFormActivity).currentAccount).getClientPhone().startsWith("7") || ((country = paymentFormActivity.country) != null && country.code.equals("7"));
                                        int i22 = z8 ? 2022 : calendar.get(1);
                                        int i23 = z8 ? 1 : calendar.get(2) + 1;
                                        if (iIntValue2 < i22 || (iIntValue2 == i22 && iIntValue < i23)) {
                                            paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z7 = false;
                                        }
                                    } else {
                                        int iIntValue3 = Utilities.parseInt((CharSequence) strArr[0]).intValue();
                                        if (iIntValue3 > 12 || iIntValue3 == 0) {
                                            paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z7 = false;
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
                                            paymentFormActivity.inputFields[1].setTextColor(paymentFormActivity.getThemedColor(Theme.key_text_RedRegular));
                                        } else {
                                            z7 = false;
                                        }
                                        selectionStart++;
                                    }
                                    z7 = false;
                                }
                                if (!z7 && sb.length() == 4) {
                                    paymentFormActivity.inputFields[paymentFormActivity.need_card_name ? (char) 2 : (char) 3].requestFocus();
                                }
                                if (sb.length() != 2) {
                                    if (sb.length() > 2 && sb.charAt(2) != '/') {
                                        sb.insert(2, '/');
                                    }
                                    editTextBoldCursor6.setText(sb);
                                    if (selectionStart >= 0) {
                                        editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                    }
                                    paymentFormActivity.ignoreOnCardChange = false;
                                }
                                sb.append('/');
                                selectionStart++;
                                editTextBoldCursor6.setText(sb);
                                if (selectionStart >= 0) {
                                    editTextBoldCursor6.setSelection(Math.min(selectionStart, editTextBoldCursor6.length()));
                                }
                                paymentFormActivity.ignoreOnCardChange = false;
                            }

                            @Override
                            public final void beforeTextChanged(CharSequence charSequence, int i110, int i20, int i21) {
                                if (i20 == 0 && i21 == 1) {
                                    this.isYear = TextUtils.indexOf((CharSequence) PaymentFormActivity.this.inputFields[1].getText(), '/') != -1;
                                    this.characterAction = 1;
                                    return;
                                }
                                if (i20 != 1 || i21 != 0) {
                                    this.characterAction = -1;
                                    return;
                                }
                                if (charSequence.charAt(i110) != '/' || i110 <= 0) {
                                    this.characterAction = 2;
                                    return;
                                }
                                this.isYear = false;
                                this.characterAction = 3;
                                this.actionPosition = i110 - 1;
                            }

                            @Override
                            public final void onTextChanged(CharSequence charSequence, int i110, int i20, int i21) {
                            }
                        });
                    }
                    this.inputFields[i14].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                    EditTextBoldCursor editTextBoldCursor6 = this.inputFields[i14];
                    if (LocaleController.isRTL) {
                        i = 5;
                    } else {
                        i = 3;
                    }
                    editTextBoldCursor6.setGravity(i);
                    frameLayout4.addView(this.inputFields[i14], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                    final int i110 = 2;
                    this.inputFields[i14].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                        public final PaymentFormActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final boolean onEditorAction(TextView textView2, int i111, KeyEvent keyEvent) {
                            EditTextBoldCursor[] editTextBoldCursorArr;
                            switch (i110) {
                                case 0:
                                    PaymentFormActivity paymentFormActivity = this.f$0;
                                    if (i111 == 6) {
                                        paymentFormActivity.doneItem.performClick();
                                        return true;
                                    }
                                    paymentFormActivity.getClass();
                                    return false;
                                case 1:
                                    PaymentFormActivity paymentFormActivity2 = this.f$0;
                                    paymentFormActivity2.getClass();
                                    if (i111 != 5) {
                                        if (i111 != 6) {
                                            return false;
                                        }
                                        paymentFormActivity2.doneItem.performClick();
                                        return true;
                                    }
                                    int iIntValue = ((Integer) textView2.getTag()).intValue();
                                    while (true) {
                                        iIntValue++;
                                        EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                        if (iIntValue >= editTextBoldCursorArr2.length) {
                                            return true;
                                        }
                                        if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                            paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                            return true;
                                        }
                                    }
                                    break;
                                case 2:
                                    PaymentFormActivity paymentFormActivity3 = this.f$0;
                                    paymentFormActivity3.getClass();
                                    if (i111 != 5) {
                                        if (i111 != 6) {
                                            return false;
                                        }
                                        paymentFormActivity3.doneItem.performClick();
                                        return true;
                                    }
                                    int iIntValue2 = ((Integer) textView2.getTag()).intValue();
                                    do {
                                        int i112 = iIntValue2 + 1;
                                        editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                        if (i112 >= editTextBoldCursorArr.length) {
                                            return true;
                                        }
                                        iIntValue2 = i112 == 4 ? iIntValue2 + 2 : i112;
                                    } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                                    paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                                    return true;
                                case 3:
                                    PaymentFormActivity paymentFormActivity4 = this.f$0;
                                    if (i111 == 6) {
                                        paymentFormActivity4.sendSavePassword(false);
                                        return true;
                                    }
                                    paymentFormActivity4.getClass();
                                    return false;
                                default:
                                    PaymentFormActivity paymentFormActivity5 = this.f$0;
                                    if (i111 == 6) {
                                        paymentFormActivity5.doneItem.performClick();
                                        return true;
                                    }
                                    paymentFormActivity5.getClass();
                                    if (i111 == 5) {
                                        int iIntValue3 = ((Integer) textView2.getTag()).intValue();
                                        if (iIntValue3 == 0) {
                                            paymentFormActivity5.inputFields[1].requestFocus();
                                        } else if (iIntValue3 == 1) {
                                            paymentFormActivity5.inputFields[2].requestFocus();
                                        }
                                    }
                                    return false;
                            }
                        }
                    });
                    if (i14 == 3) {
                        this.sectionCell[0] = new ShadowSectionCell(context, 0);
                        this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i14 == 5) {
                        this.sectionCell[2] = new ShadowSectionCell(context, 0);
                        this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
                        TextCheckCell textCheckCell4 = new TextCheckCell(context, this.resourcesProvider);
                        this.checkCell1 = textCheckCell4;
                        textCheckCell4.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.checkCell1.setTextAndCheck(LocaleController.getString(R.string.PaymentCardSavePaymentInformation), this.saveCardInfo, false);
                        this.linearLayout2.addView(this.checkCell1, LayoutHelper.createLinear(-1, -2));
                        this.checkCell1.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 9));
                        this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        updateSavePaymentField();
                        this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    } else if (i14 == 0) {
                        createGooglePayButton(context);
                        FrameLayout frameLayout6 = this.googlePayContainer;
                        if (LocaleController.isRTL) {
                            i2 = 3;
                        } else {
                            i2 = 5;
                        }
                        frameLayout4.addView(frameLayout6, LayoutHelper.createFrame(-2, -2.0f, i2 | 16, 0.0f, 0.0f, 4.0f, 0.0f));
                    }
                    if (z6) {
                        AnonymousClass2 anonymousClass4 = new AnonymousClass2(context, 19);
                        anonymousClass4.setBackgroundColor(getThemedColor(i16));
                        this.dividers.add(anonymousClass4);
                        frameLayout4.addView(anonymousClass4, new FrameLayout.LayoutParams(-1, 1, 83));
                    }
                    if (i14 != 4) {
                    }
                    i14++;
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
        } else if (i8 == 1) {
            ArrayList<TLRPC.TL_shippingOption> arrayList = this.requestedInfo.shipping_options;
            int size = arrayList == null ? 0 : arrayList.size();
            this.radioCells = new RadioCell[size];
            int i20 = 0;
            while (i20 < size) {
                TLRPC.TL_shippingOption tL_shippingOption = this.requestedInfo.shipping_options.get(i20);
                this.radioCells[i20] = new RadioCell(context);
                this.radioCells[i20].setTag(Integer.valueOf(i20));
                this.radioCells[i20].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                this.radioCells[i20].setText(zzkc.m(getTotalPriceString(tL_shippingOption.prices), " - ", tL_shippingOption.title), i20 == 0, i20 != size + (-1));
                this.radioCells[i20].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 11));
                this.linearLayout2.addView(this.radioCells[i20]);
                i20++;
            }
            this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
        } else if (i8 == 3) {
            this.inputFields = new EditTextBoldCursor[2];
            int i21 = 0;
            for (int i22 = 2; i21 < i22; i22 = 2) {
                if (i21 == 0) {
                    z2 = false;
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentCardTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    z2 = false;
                }
                FrameLayout frameLayout7 = new FrameLayout(context);
                frameLayout7.setClipChildren(z2);
                this.linearLayout2.addView(frameLayout7, LayoutHelper.createLinear(-1, 50));
                int i23 = Theme.key_windowBackgroundWhite;
                frameLayout7.setBackgroundColor(getThemedColor(i23));
                boolean z7 = i21 != 1;
                if (z7) {
                    if (i21 == 7 && !this.paymentForm.invoice.phone_requested) {
                        z7 = false;
                    } else if (i21 == 6) {
                        TLRPC.TL_invoice tL_invoice8 = this.paymentForm.invoice;
                        if (!tL_invoice8.phone_requested && !tL_invoice8.email_requested) {
                            z7 = false;
                        }
                    }
                }
                if (z7) {
                    AnonymousClass2 anonymousClass6 = new AnonymousClass2(context, 17);
                    anonymousClass6.setBackgroundColor(getThemedColor(i23));
                    this.dividers.add(anonymousClass6);
                    frameLayout7.addView(anonymousClass6, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i21] = new EditTextBoldCursor(context);
                this.inputFields[i21].setTag(Integer.valueOf(i21));
                this.inputFields[i21].setTextSize(1, 16.0f);
                this.inputFields[i21].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor7 = this.inputFields[i21];
                int i24 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor7.setTextColor(getThemedColor(i24));
                this.inputFields[i21].setBackgroundDrawable(null);
                this.inputFields[i21].setCursorColor(getThemedColor(i24));
                this.inputFields[i21].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i21].setCursorWidth(1.5f);
                if (i21 == 0) {
                    this.inputFields[i21].setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(27));
                    this.inputFields[i21].setInputType(0);
                } else {
                    this.inputFields[i21].setInputType(129);
                    this.inputFields[i21].setTypeface(Typeface.DEFAULT);
                }
                this.inputFields[i21].setImeOptions(268435462);
                if (i21 == 0) {
                    EditTextBoldCursor editTextBoldCursor8 = this.inputFields[i21];
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
                    editTextBoldCursor8.setText(tL_paymentSavedCredentialsCard == null ? "" : tL_paymentSavedCredentialsCard.title);
                } else if (i21 == 1) {
                    this.inputFields[i21].setHint(LocaleController.getString(R.string.LoginPassword));
                    this.inputFields[i21].requestFocus();
                }
                this.inputFields[i21].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i21].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout7.addView(this.inputFields[i21], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                final int i25 = 0;
                this.inputFields[i21].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final PaymentFormActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView2, int i111, KeyEvent keyEvent) {
                        EditTextBoldCursor[] editTextBoldCursorArr;
                        switch (i25) {
                            case 0:
                                PaymentFormActivity paymentFormActivity = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity.doneItem.performClick();
                                    return true;
                                }
                                paymentFormActivity.getClass();
                                return false;
                            case 1:
                                PaymentFormActivity paymentFormActivity2 = this.f$0;
                                paymentFormActivity2.getClass();
                                if (i111 != 5) {
                                    if (i111 != 6) {
                                        return false;
                                    }
                                    paymentFormActivity2.doneItem.performClick();
                                    return true;
                                }
                                int iIntValue = ((Integer) textView2.getTag()).intValue();
                                while (true) {
                                    iIntValue++;
                                    EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                    if (iIntValue >= editTextBoldCursorArr2.length) {
                                        return true;
                                    }
                                    if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                        paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                        return true;
                                    }
                                }
                                break;
                            case 2:
                                PaymentFormActivity paymentFormActivity3 = this.f$0;
                                paymentFormActivity3.getClass();
                                if (i111 != 5) {
                                    if (i111 != 6) {
                                        return false;
                                    }
                                    paymentFormActivity3.doneItem.performClick();
                                    return true;
                                }
                                int iIntValue2 = ((Integer) textView2.getTag()).intValue();
                                do {
                                    int i112 = iIntValue2 + 1;
                                    editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                    if (i112 >= editTextBoldCursorArr.length) {
                                        return true;
                                    }
                                    iIntValue2 = i112 == 4 ? iIntValue2 + 2 : i112;
                                } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                                paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                                return true;
                            case 3:
                                PaymentFormActivity paymentFormActivity4 = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity4.sendSavePassword(false);
                                    return true;
                                }
                                paymentFormActivity4.getClass();
                                return false;
                            default:
                                PaymentFormActivity paymentFormActivity5 = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity5.doneItem.performClick();
                                    return true;
                                }
                                paymentFormActivity5.getClass();
                                if (i111 == 5) {
                                    int iIntValue3 = ((Integer) textView2.getTag()).intValue();
                                    if (iIntValue3 == 0) {
                                        paymentFormActivity5.inputFields[1].requestFocus();
                                    } else if (iIntValue3 == 1) {
                                        paymentFormActivity5.inputFields[2].requestFocus();
                                    }
                                }
                                return false;
                        }
                    }
                });
                if (i21 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    TextInfoPrivacyCell textInfoPrivacyCell2 = this.bottomCell[0];
                    int i26 = R.string.PaymentConfirmationMessage;
                    TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = this.savedCredentialsCard;
                    textInfoPrivacyCell2.setText(LocaleController.formatString("PaymentConfirmationMessage", i26, tL_paymentSavedCredentialsCard2 == null ? "" : tL_paymentSavedCredentialsCard2.title));
                    TextInfoPrivacyCell textInfoPrivacyCell3 = this.bottomCell[0];
                    int i27 = R.drawable.greydivider;
                    int i28 = Theme.key_windowBackgroundGrayShadow;
                    textInfoPrivacyCell3.setBackgroundDrawable(Theme.getThemedDrawableByKey(context, i27, i28));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
                    this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                    this.settingsCell[0].setText(LocaleController.getString(R.string.PaymentConfirmationNewCard), false);
                    this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
                    this.settingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, i25));
                    this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, i28));
                    this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                }
                i21++;
            }
        } else if (i8 == 4 || i8 == 5) {
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
            this.sectionCell[0] = new ShadowSectionCell(context, 0);
            this.linearLayout2.addView(this.sectionCell[0], LayoutHelper.createLinear(-1, -2));
            ArrayList arrayList2 = new ArrayList(this.paymentForm.invoice.prices);
            this.prices = arrayList2;
            TLRPC.TL_shippingOption tL_shippingOption2 = this.shippingOption;
            if (tL_shippingOption2 != null) {
                arrayList2.addAll(tL_shippingOption2.prices);
            }
            this.totalPrice = new String[1];
            for (int i29 = 0; i29 < this.prices.size(); i29++) {
                TLRPC.TL_labeledPrice tL_labeledPrice = (TLRPC.TL_labeledPrice) this.prices.get(i29);
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
            int i30 = Theme.key_windowBackgroundWhite;
            textPriceCell3.setBackgroundColor(getThemedColor(i30));
            this.totalPrice[0] = getTotalPriceString(this.prices);
            this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
            float f = 14.0f;
            if (this.currentStep != 4 || (this.paymentForm.invoice.flags & 256) == 0) {
                frameLayout = frameLayout3;
            } else {
                FrameLayout frameLayout8 = new FrameLayout(context);
                frameLayout8.setClipChildren(false);
                frameLayout8.setBackgroundColor(getThemedColor(i30));
                this.linearLayout2.addView(frameLayout8, LayoutHelper.createLinear(-1, this.paymentForm.invoice.suggested_tip_amounts.isEmpty() ? 40 : 78));
                frameLayout8.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 1));
                TextPriceCell textPriceCell4 = new TextPriceCell(context);
                textPriceCell4.setBackgroundColor(getThemedColor(i30));
                int i31 = 0;
                textPriceCell4.setTextAndValue(LocaleController.getString(R.string.PaymentTipOptional), "", false);
                frameLayout8.addView(textPriceCell4);
                this.inputFields = new EditTextBoldCursor[]{new EditTextBoldCursor(context)};
                this.inputFields[0].setTag(0);
                this.inputFields[0].setTextSize(1, 16.0f);
                EditTextBoldCursor editTextBoldCursor9 = this.inputFields[0];
                int i32 = Theme.key_windowBackgroundWhiteGrayText2;
                editTextBoldCursor9.setHintTextColor(getThemedColor(i32));
                this.inputFields[0].setTextColor(getThemedColor(i32));
                this.inputFields[0].setBackgroundDrawable(null);
                this.inputFields[0].setCursorColor(getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                this.inputFields[0].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[0].setCursorWidth(1.5f);
                this.inputFields[0].setInputType(3);
                this.inputFields[0].setImeOptions(268435462);
                frameLayout = frameLayout3;
                this.inputFields[0].setHint(LocaleController.getInstance().formatCurrencyString(0L, this.paymentForm.invoice.currency));
                this.inputFields[0].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[0].setGravity(LocaleController.isRTL ? 3 : 5);
                frameLayout8.addView(this.inputFields[0], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 9.0f, 21.0f, 1.0f));
                this.inputFields[0].addTextChangedListener(new TextWatcher() {
                    public boolean anyBefore;
                    public int beforeTextLength;
                    public final char[] commas = {',', '.', 1643, 12289, 11841, 65040, 65041, 65104, 65105, 65292, 65380, 699};
                    public int enteredCharacterStart;
                    public boolean isDeletedChar;
                    public boolean lastDotEntered;
                    public String overrideText;

                    @Override
                    public final void afterTextChanged(Editable editable) {
                        char[] cArr;
                        int i33;
                        int iIndexOf;
                        PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                        if (paymentFormActivity.ignoreOnTextChange) {
                            return;
                        }
                        Long l = paymentFormActivity.tipAmount;
                        long jLongValue = l != null ? l.longValue() : 0L;
                        String strFixNumbers = this.overrideText;
                        if (strFixNumbers == null) {
                            strFixNumbers = LocaleController.fixNumbers(editable.toString());
                        }
                        int i34 = 0;
                        while (true) {
                            cArr = this.commas;
                            i33 = -1;
                            if (i34 >= cArr.length) {
                                iIndexOf = -1;
                                break;
                            }
                            iIndexOf = strFixNumbers.indexOf(cArr[i34]);
                            if (iIndexOf >= 0) {
                                break;
                            } else {
                                i34++;
                            }
                        }
                        boolean z8 = iIndexOf >= 0;
                        int currencyExpDivider = LocaleController.getCurrencyExpDivider(paymentFormActivity.paymentForm.invoice.currency);
                        String strSubstring = iIndexOf >= 0 ? strFixNumbers.substring(0, iIndexOf) : strFixNumbers;
                        String currencyString = "";
                        String strSubstring2 = iIndexOf >= 0 ? strFixNumbers.substring(iIndexOf + 1) : "";
                        long jLongValue2 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring, false)).longValue() * ((long) currencyExpDivider);
                        long jLongValue3 = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring2, false)).longValue();
                        String strM = Log.m(jLongValue3, "");
                        String str8 = "" + (currencyExpDivider - 1);
                        if (iIndexOf > 0 && strM.length() > str8.length()) {
                            jLongValue3 = Utilities.parseLong(this.enteredCharacterStart - iIndexOf < strM.length() ? strM.substring(0, str8.length()) : strM.substring(strM.length() - str8.length())).longValue();
                        }
                        Long lValueOf = Long.valueOf(jLongValue2 + jLongValue3);
                        paymentFormActivity.tipAmount = lValueOf;
                        if (paymentFormActivity.paymentForm.invoice.max_tip_amount != 0) {
                            long jLongValue4 = lValueOf.longValue();
                            long j = paymentFormActivity.paymentForm.invoice.max_tip_amount;
                            if (jLongValue4 > j) {
                                paymentFormActivity.tipAmount = Long.valueOf(j);
                            }
                        }
                        int selectionStart = paymentFormActivity.inputFields[0].getSelectionStart();
                        paymentFormActivity.ignoreOnTextChange = true;
                        if (paymentFormActivity.tipAmount.longValue() == 0) {
                            paymentFormActivity.inputFields[0].setText("");
                        } else {
                            EditTextBoldCursor editTextBoldCursor10 = paymentFormActivity.inputFields[0];
                            currencyString = LocaleController.getInstance().formatCurrencyString(paymentFormActivity.tipAmount.longValue(), false, z8, true, paymentFormActivity.paymentForm.invoice.currency);
                            editTextBoldCursor10.setText(currencyString);
                        }
                        if (jLongValue < paymentFormActivity.tipAmount.longValue() && jLongValue != 0 && this.anyBefore && selectionStart >= 0) {
                            EditTextBoldCursor editTextBoldCursor11 = paymentFormActivity.inputFields[0];
                            editTextBoldCursor11.setSelection(Math.min(selectionStart, editTextBoldCursor11.length()));
                        } else if (this.isDeletedChar && this.beforeTextLength != paymentFormActivity.inputFields[0].length()) {
                            EditTextBoldCursor editTextBoldCursor12 = paymentFormActivity.inputFields[0];
                            editTextBoldCursor12.setSelection(Math.max(0, Math.min(selectionStart, editTextBoldCursor12.length())));
                        } else if (this.lastDotEntered || z8 == 0 || iIndexOf < 0) {
                            EditTextBoldCursor editTextBoldCursor13 = paymentFormActivity.inputFields[0];
                            editTextBoldCursor13.setSelection(editTextBoldCursor13.length());
                        } else {
                            for (char c2 : cArr) {
                                int iIndexOf2 = currencyString.indexOf(c2);
                                if (iIndexOf2 >= 0) {
                                    i33 = iIndexOf2;
                                    break;
                                }
                            }
                            if (i33 > 0) {
                                paymentFormActivity.inputFields[0].setSelection(i33 + 1);
                            } else {
                                EditTextBoldCursor editTextBoldCursor14 = paymentFormActivity.inputFields[0];
                                editTextBoldCursor14.setSelection(editTextBoldCursor14.length());
                            }
                        }
                        this.lastDotEntered = z8;
                        paymentFormActivity.updateTotalPrice();
                        this.overrideText = null;
                        paymentFormActivity.ignoreOnTextChange = false;
                    }

                    @Override
                    public final void beforeTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                        int iIndexOf;
                        if (PaymentFormActivity.this.ignoreOnTextChange) {
                            return;
                        }
                        this.anyBefore = !TextUtils.isEmpty(charSequence);
                        this.overrideText = null;
                        this.beforeTextLength = charSequence == null ? 0 : charSequence.length();
                        this.enteredCharacterStart = i33;
                        boolean z8 = i34 == 1 && i35 == 0;
                        this.isDeletedChar = z8;
                        if (!z8) {
                            return;
                        }
                        String strFixNumbers = LocaleController.fixNumbers(charSequence);
                        char cCharAt = strFixNumbers.charAt(i33);
                        int i36 = 0;
                        while (true) {
                            char[] cArr = this.commas;
                            if (i36 >= cArr.length) {
                                iIndexOf = -1;
                                break;
                            }
                            iIndexOf = strFixNumbers.indexOf(cArr[i36]);
                            if (iIndexOf >= 0) {
                                break;
                            } else {
                                i36++;
                            }
                        }
                        String strSubstring = iIndexOf >= 0 ? strFixNumbers.substring(iIndexOf + 1) : "";
                        long jLongValue = Utilities.parseLong(PhoneFormat.stripExceptNumbers(strSubstring, false)).longValue();
                        if ((cCharAt >= '0' && cCharAt <= '9') || (strSubstring.length() != 0 && jLongValue == 0)) {
                            if (iIndexOf <= 0 || i33 <= iIndexOf || jLongValue != 0) {
                                return;
                            }
                            this.overrideText = strFixNumbers.substring(0, iIndexOf - 1);
                            return;
                        }
                        while (true) {
                            int i37 = i33 - 1;
                            if (i37 < 0) {
                                return;
                            }
                            char cCharAt2 = strFixNumbers.charAt(i37);
                            if (cCharAt2 >= '0' && cCharAt2 <= '9') {
                                this.overrideText = strFixNumbers.substring(0, i37) + strFixNumbers.substring(i33);
                                return;
                            }
                            i33 = i37;
                        }
                    }

                    @Override
                    public final void onTextChanged(CharSequence charSequence, int i33, int i34, int i35) {
                    }
                });
                this.inputFields[0].setOnEditorActionListener(new PaymentFormActivity$$ExternalSyntheticLambda11(i31));
                this.inputFields[0].requestFocus();
                if (!this.paymentForm.invoice.suggested_tip_amounts.isEmpty()) {
                    HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
                    horizontalScrollView.setHorizontalScrollBarEnabled(false);
                    horizontalScrollView.setVerticalScrollBarEnabled(false);
                    horizontalScrollView.setClipToPadding(false);
                    horizontalScrollView.setPadding(AndroidUtilities.dp(21.0f), 0, AndroidUtilities.dp(21.0f), 0);
                    horizontalScrollView.setFillViewport(true);
                    frameLayout8.addView(horizontalScrollView, LayoutHelper.createFrame(-1, 30.0f, 51, 0.0f, 44.0f, 0.0f, 0.0f));
                    final int[] iArr = new int[1];
                    final int[] iArr2 = new int[1];
                    final int size2 = this.paymentForm.invoice.suggested_tip_amounts.size();
                    ?? r1 = new LinearLayout(context) {
                        public boolean ignoreLayout;

                        @Override
                        public final void onMeasure(int i33, int i34) {
                            int size3 = View.MeasureSpec.getSize(i33);
                            this.ignoreLayout = true;
                            int iDp = AndroidUtilities.dp(9.0f);
                            int i35 = size2;
                            int i36 = (i35 - 1) * iDp;
                            int[] iArr3 = iArr;
                            float f2 = 1.0f;
                            if ((iArr3[0] * i35) + i36 <= size3) {
                                setWeightSum(1.0f);
                                int childCount = getChildCount();
                                for (int i37 = 0; i37 < childCount; i37++) {
                                    getChildAt(i37).getLayoutParams().width = 0;
                                    ((LinearLayout.LayoutParams) getChildAt(i37).getLayoutParams()).weight = 1.0f / childCount;
                                }
                            } else if (iArr2[0] + i36 <= size3) {
                                setWeightSum(1.0f);
                                int i38 = size3 - i36;
                                int childCount2 = getChildCount();
                                for (int i39 = 0; i39 < childCount2; i39++) {
                                    View childAt = getChildAt(i39);
                                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                                    layoutParams.width = 0;
                                    float fIntValue = ((Integer) childAt.getTag(R.id.width_tag)).intValue() / i38;
                                    layoutParams.weight = fIntValue;
                                    f2 -= fIntValue;
                                }
                                float f3 = f2 / (i35 - 1);
                                if (f3 > 0.0f) {
                                    int childCount3 = getChildCount();
                                    for (int i40 = 0; i40 < childCount3; i40++) {
                                        View childAt2 = getChildAt(i40);
                                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) childAt2.getLayoutParams();
                                        if (((Integer) childAt2.getTag(R.id.width_tag)).intValue() != iArr3[0]) {
                                            layoutParams2.weight += f3;
                                        }
                                    }
                                }
                            } else {
                                setWeightSum(0.0f);
                                int childCount4 = getChildCount();
                                for (int i41 = 0; i41 < childCount4; i41++) {
                                    getChildAt(i41).getLayoutParams().width = -2;
                                    ((LinearLayout.LayoutParams) getChildAt(i41).getLayoutParams()).weight = 0.0f;
                                }
                            }
                            this.ignoreLayout = false;
                            super.onMeasure(i33, i34);
                        }

                        @Override
                        public final void requestLayout() {
                            if (this.ignoreLayout) {
                                return;
                            }
                            super.requestLayout();
                        }
                    };
                    this.tipLayout = r1;
                    r1.setOrientation(0);
                    horizontalScrollView.addView(this.tipLayout, LayoutHelper.createScroll(-1, 30, 51));
                    int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
                    int i33 = 0;
                    while (i33 < size2) {
                        long jLongValue = LocaleController.isRTL ? this.paymentForm.invoice.suggested_tip_amounts.get((size2 - i33) - 1).longValue() : this.paymentForm.invoice.suggested_tip_amounts.get(i33).longValue();
                        String currencyString = LocaleController.getInstance().formatCurrencyString(jLongValue, this.paymentForm.invoice.currency);
                        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, f);
                        textViewM.setTypeface(AndroidUtilities.bold());
                        textViewM.setLines(1);
                        textViewM.setTag(Long.valueOf(jLongValue));
                        textViewM.setMaxLines(1);
                        textViewM.setText(currencyString);
                        textViewM.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
                        textViewM.setTextColor(getThemedColor(Theme.key_chats_secretName));
                        textViewM.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(15.0f), themedColor & 536870911));
                        textViewM.setSingleLine(true);
                        textViewM.setGravity(17);
                        addView(textViewM, LayoutHelper.createLinear(-2, -1, 19, 0, 0, i33 != size2 + (-1) ? 9 : 0, 0));
                        textViewM.setOnClickListener(new ChatEditActivity$$ExternalSyntheticLambda1(this, textViewM, jLongValue, 5));
                        int iDp = AndroidUtilities.dp(30.0f) + ((int) Math.ceil(textViewM.getPaint().measureText(currencyString)));
                        textViewM.setTag(R.id.width_tag, Integer.valueOf(iDp));
                        iArr[0] = Math.max(iArr[0], iDp);
                        iArr2[0] = iArr2[0] + iDp;
                        i33++;
                        f = 14.0f;
                    }
                }
            }
            int i34 = 1;
            this.linearLayout2.addView(this.totalCell);
            this.sectionCell[2] = new ShadowSectionCell(context, 0);
            this.sectionCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.sectionCell[2], LayoutHelper.createLinear(-1, -2));
            this.detailSettingsCell[0] = new TextDetailSettingsCell(context) {
            };
            this.detailSettingsCell[0].setBackground(Theme.getSelectorDrawable(true));
            TextDetailSettingsCell textDetailSettingsCell = this.detailSettingsCell[0];
            String str8 = this.cardName;
            textDetailSettingsCell.setTextAndValueAndIcon(R.drawable.msg_payment_card, (str8 == null || str8.length() <= 1) ? this.cardName : this.cardName.substring(0, 1).toUpperCase() + this.cardName.substring(1), LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            int i35 = ((this.isCheckoutPreview || this.allowUnregistered) && ((str = this.cardName) == null || str.length() <= 1)) ? 8 : 0;
            this.detailSettingsCell[0].setVisibility(i35);
            this.linearLayout2.addView(this.detailSettingsCell[0]);
            if (this.currentStep == 4) {
                this.detailSettingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 2));
            }
            int i36 = 0;
            TLRPC.User user3 = null;
            while (i36 < this.paymentForm.users.size()) {
                TLRPC.User user4 = this.paymentForm.users.get(i36);
                String str9 = str5;
                if (user4.id == this.paymentForm.provider_id) {
                    user3 = user4;
                }
                i36++;
                str5 = str9;
            }
            String str10 = str5;
            this.detailSettingsCell[1] = new TextDetailSettingsCell(context);
            this.detailSettingsCell[1].setBackground(Theme.getSelectorDrawable(true));
            if (user3 != null) {
                TextDetailSettingsCell textDetailSettingsCell2 = this.detailSettingsCell[1];
                name = ContactsController.formatName(user3.first_name, user3.last_name);
                String string = LocaleController.getString(R.string.PaymentCheckoutProvider);
                int i37 = R.drawable.msg_payment_provider;
                TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo = this.validateRequest;
                textDetailSettingsCell2.setTextAndValueAndIcon(i37, name, string, ((tL_payments_validateRequestedInfo == null || (tL_payments_validateRequestedInfo.info.shipping_address == null && this.shippingOption == null)) && ((tL_paymentRequestedInfo = this.paymentForm.saved_info) == null || tL_paymentRequestedInfo.shipping_address == null)) ? false : true);
                this.linearLayout2.addView(this.detailSettingsCell[1]);
            } else {
                name = str10;
            }
            this.detailSettingsCell[1].setVisibility(user3 != null ? i35 : 8);
            TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo2 = this.validateRequest;
            if (tL_payments_validateRequestedInfo2 == null && (!this.isCheckoutPreview || (paymentForm2 = this.paymentForm) == null || paymentForm2.saved_info == null)) {
                r5 = 0;
            } else {
                TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo12 = tL_payments_validateRequestedInfo2 != null ? tL_payments_validateRequestedInfo2.info : this.paymentForm.saved_info;
                this.detailSettingsCell[2] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[2].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[2]);
                if (tL_paymentRequestedInfo12.shipping_address != null) {
                    this.detailSettingsCell[2].setVisibility(0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[2].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        z = false;
                        this.detailSettingsCell[2].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 3));
                    } else {
                        z = false;
                        this.detailSettingsCell[2].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                } else {
                    z = false;
                }
                this.detailSettingsCell[3] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[3].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[3]);
                if (tL_paymentRequestedInfo12.name != null) {
                    this.detailSettingsCell[3].setVisibility(z ? 1 : 0);
                    int i38 = 4;
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[3].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[3].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, i38));
                    } else {
                        this.detailSettingsCell[3].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[4] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[4].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[4]);
                if (tL_paymentRequestedInfo12.phone != null) {
                    this.detailSettingsCell[4].setVisibility(z ? 1 : 0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[4].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[4].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 5));
                    } else {
                        this.detailSettingsCell[4].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                this.detailSettingsCell[5] = new TextDetailSettingsCell(context);
                this.detailSettingsCell[5].setVisibility(8);
                this.linearLayout2.addView(this.detailSettingsCell[5]);
                if (tL_paymentRequestedInfo12.email != null) {
                    this.detailSettingsCell[5].setVisibility(z ? 1 : 0);
                    if (this.currentStep == 4) {
                        this.detailSettingsCell[5].setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        this.detailSettingsCell[5].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 6));
                    } else {
                        this.detailSettingsCell[5].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                if (this.shippingOption != null) {
                    this.detailSettingsCell[6] = new TextDetailSettingsCell(context);
                    this.detailSettingsCell[6].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.detailSettingsCell[6].setTextAndValueAndIcon(R.drawable.msg_payment_delivery, this.shippingOption.title, LocaleController.getString(R.string.PaymentCheckoutShippingMethod), z);
                    this.linearLayout2.addView(this.detailSettingsCell[6]);
                }
                setAddressFields(tL_paymentRequestedInfo12);
                r5 = z;
            }
            if (this.currentStep == 4) {
                this.recurrentAccepted = !this.isCheckoutPreview;
                if (this.invoiceInput instanceof TLRPC.TL_inputInvoiceStars) {
                    this.recurrentAccepted = true;
                }
                this.bottomLayout = new BottomFrameLayout(context);
                View view = new View(context);
                view.setBackground(Theme.createSelectorDrawable(getThemedColor(Theme.key_listSelector), 2, -1));
                this.bottomLayout.addView(view, LayoutHelper.createFrame(-1.0f, -1));
                FrameLayout frameLayout9 = frameLayout;
                frameLayout9.addView(this.bottomLayout, LayoutHelper.createFrame(-1, 48, 80));
                this.bottomLayout.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(i34, this, name));
                TextView textView2 = new TextView(context);
                this.payTextView = textView2;
                int i39 = Theme.key_contacts_inviteText;
                textView2.setTextColor(getThemedColor(i39));
                TextView textView3 = this.payTextView;
                int i40 = R.string.PaymentCheckoutPay;
                Object[] objArr = new Object[1];
                objArr[r5] = this.totalPrice[r5];
                textView3.setText(LocaleController.formatString(i40, objArr));
                this.payTextView.setTextSize(1, 14.0f);
                this.payTextView.setGravity(17);
                this.payTextView.setTypeface(AndroidUtilities.bold());
                this.bottomLayout.addView(this.payTextView, LayoutHelper.createFrame(-1.0f, -1));
                ContextProgressView contextProgressView2 = new ContextProgressView(context, r5);
                this.progressViewButton = contextProgressView2;
                contextProgressView2.setVisibility(4);
                int themedColor2 = getThemedColor(i39);
                this.progressViewButton.setColors(805306367 & themedColor2, themedColor2);
                this.bottomLayout.addView(this.progressViewButton, LayoutHelper.createFrame(-1.0f, -1));
                this.bottomLayout.setChecked(this.recurrentAccepted, r5);
                this.payTextView.setAlpha(!this.recurrentAccepted ? 0.8f : 1.0f);
                this.doneItem.setEnabled(r5);
                this.doneItem.getContentView().setVisibility(4);
                AndroidUtilities.checkAndroidTheme(context, true);
                try {
                    WebView webView = new WebView(context) {
                        @Override
                        public final boolean onTouchEvent(MotionEvent motionEvent) {
                            getParent().requestDisallowInterceptTouchEvent(true);
                            return super.onTouchEvent(motionEvent);
                        }
                    };
                    this.webView = webView;
                    webView.setBackgroundColor(-1);
                    this.webView.getSettings().setJavaScriptEnabled(true);
                    this.webView.getSettings().setDomStorageEnabled(true);
                    this.webView.getSettings().setSupportZoom(true);
                    this.webView.getSettings().setBuiltInZoomControls(true);
                    this.webView.getSettings().setDisplayZoomControls(r5);
                    this.webView.getSettings().setUseWideViewPort(true);
                    this.webView.getSettings().setMixedContentMode(r5);
                    CookieManager.getInstance().setAcceptThirdPartyCookies(this.webView, true);
                    this.webView.setWebViewClient(new AnonymousClass19(context));
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.recurrentAcceptCell = null;
                if (this.paymentForm.invoice.terms_url != null) {
                    RecurrentPaymentsAcceptCell recurrentPaymentsAcceptCell = new RecurrentPaymentsAcceptCell(context, getResourceProvider());
                    this.recurrentAcceptCell = recurrentPaymentsAcceptCell;
                    recurrentPaymentsAcceptCell.setChecked(this.recurrentAccepted);
                    if (TextUtils.isEmpty(this.currentBotName)) {
                        ?? string2 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrentFee);
                        spannableStringBuilder = new SpannableStringBuilder(string2);
                        int iIndexOf = string2.indexOf(42);
                        int iLastIndexOf = string2.lastIndexOf(42);
                        if (iIndexOf != -1 && iLastIndexOf != -1) {
                            ?? spannableString = new SpannableString(string2.substring(iIndexOf + 1, iLastIndexOf));
                            spannableString.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), r5, spannableString.length(), 33);
                            int i41 = iLastIndexOf + 1;
                            spannableStringBuilder.replace(iIndexOf, i41, spannableString);
                            string2.substring(r5, iIndexOf);
                            spannableString.toString();
                            string2.substring(i41);
                            r7 = spannableStringBuilder;
                        }
                    } else {
                        ?? string3 = LocaleController.getString(R.string.PaymentCheckoutAcceptRecurrent);
                        ?? spannableStringBuilder2 = new SpannableStringBuilder(string3);
                        int iIndexOf2 = string3.indexOf(42);
                        int iLastIndexOf2 = string3.lastIndexOf(42);
                        if (iIndexOf2 != -1 && iLastIndexOf2 != -1) {
                            ?? spannableString2 = new SpannableString(string3.substring(iIndexOf2 + 1, iLastIndexOf2));
                            spannableString2.setSpan(new URLSpanNoUnderline(this.paymentForm.invoice.terms_url), r5, spannableString2.length(), 33);
                            int i42 = iLastIndexOf2 + 1;
                            spannableStringBuilder2.replace(iIndexOf2, i42, spannableString2);
                            r0 = string3.substring(r5, iIndexOf2) + spannableString2 + string3.substring(i42);
                        }
                        r0 = string3;
                        r0 = string3;
                        int iIndexOf3 = r0.indexOf("%1$s");
                        r7 = spannableStringBuilder2;
                        if (iIndexOf3 != -1) {
                            spannableStringBuilder2.replace(iIndexOf3, iIndexOf3 + 4, this.currentBotName);
                            spannableStringBuilder2.setSpan(new TypefaceSpan(AndroidUtilities.bold()), iIndexOf3, this.currentBotName.length() + iIndexOf3, 33);
                            r7 = spannableStringBuilder2;
                        }
                    }
                    r7 = spannableStringBuilder;
                    r7 = spannableStringBuilder;
                    this.recurrentAcceptCell.setText(r7);
                    this.recurrentAcceptCell.setBackground(Theme.createSelectorWithBackgroundDrawable(getThemedColor(Theme.key_windowBackgroundWhite), getThemedColor(Theme.key_listSelector)));
                    this.recurrentAcceptCell.setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 7));
                    frameLayout9.addView(this.recurrentAcceptCell, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 48.0f));
                }
                WebView webView2 = this.webView;
                if (webView2 != null) {
                    frameLayout9.addView(webView2, LayoutHelper.createFrame(-1.0f, -1));
                    this.webView.setVisibility(8);
                }
            }
            this.sectionCell[1] = new ShadowSectionCell(context, (int) r5);
            this.sectionCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
            if (i35 != 0 && this.currentStep == 4 && this.validateRequest == null && ((paymentForm = this.paymentForm) == null || paymentForm.saved_info == null)) {
                this.sectionCell[1].setVisibility(i35);
            }
            this.linearLayout2.addView(this.sectionCell[1], LayoutHelper.createLinear(-1, -2));
        } else if (i8 == 6) {
            EditTextSettingsCell editTextSettingsCell = new EditTextSettingsCell(context);
            this.codeFieldCell = editTextSettingsCell;
            String string4 = LocaleController.getString(R.string.PasswordCode);
            editTextSettingsCell.textView.setText("");
            editTextSettingsCell.textView.setHint(string4);
            editTextSettingsCell.needDivider = false;
            editTextSettingsCell.setWillNotDraw(true);
            this.codeFieldCell.setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
            EditTextBoldCursor textView4 = this.codeFieldCell.getTextView();
            final int i43 = 3;
            textView4.setInputType(3);
            textView4.setImeOptions(6);
            textView4.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final PaymentFormActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView5, int i111, KeyEvent keyEvent) {
                    EditTextBoldCursor[] editTextBoldCursorArr;
                    switch (i43) {
                        case 0:
                            PaymentFormActivity paymentFormActivity = this.f$0;
                            if (i111 == 6) {
                                paymentFormActivity.doneItem.performClick();
                                return true;
                            }
                            paymentFormActivity.getClass();
                            return false;
                        case 1:
                            PaymentFormActivity paymentFormActivity2 = this.f$0;
                            paymentFormActivity2.getClass();
                            if (i111 != 5) {
                                if (i111 != 6) {
                                    return false;
                                }
                                paymentFormActivity2.doneItem.performClick();
                                return true;
                            }
                            int iIntValue = ((Integer) textView5.getTag()).intValue();
                            while (true) {
                                iIntValue++;
                                EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                if (iIntValue >= editTextBoldCursorArr2.length) {
                                    return true;
                                }
                                if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                    paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                    return true;
                                }
                            }
                            break;
                        case 2:
                            PaymentFormActivity paymentFormActivity3 = this.f$0;
                            paymentFormActivity3.getClass();
                            if (i111 != 5) {
                                if (i111 != 6) {
                                    return false;
                                }
                                paymentFormActivity3.doneItem.performClick();
                                return true;
                            }
                            int iIntValue2 = ((Integer) textView5.getTag()).intValue();
                            do {
                                int i112 = iIntValue2 + 1;
                                editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                if (i112 >= editTextBoldCursorArr.length) {
                                    return true;
                                }
                                iIntValue2 = i112 == 4 ? iIntValue2 + 2 : i112;
                            } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                            paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                            return true;
                        case 3:
                            PaymentFormActivity paymentFormActivity4 = this.f$0;
                            if (i111 == 6) {
                                paymentFormActivity4.sendSavePassword(false);
                                return true;
                            }
                            paymentFormActivity4.getClass();
                            return false;
                        default:
                            PaymentFormActivity paymentFormActivity5 = this.f$0;
                            if (i111 == 6) {
                                paymentFormActivity5.doneItem.performClick();
                                return true;
                            }
                            paymentFormActivity5.getClass();
                            if (i111 == 5) {
                                int iIntValue3 = ((Integer) textView5.getTag()).intValue();
                                if (iIntValue3 == 0) {
                                    paymentFormActivity5.inputFields[1].requestFocus();
                                } else if (iIntValue3 == 1) {
                                    paymentFormActivity5.inputFields[2].requestFocus();
                                }
                            }
                            return false;
                    }
                }
            });
            textView4.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 29));
            this.linearLayout2.addView(this.codeFieldCell, LayoutHelper.createLinear(-1, -2));
            this.bottomCell[2] = new TextInfoPrivacyCell(context, this.resourcesProvider);
            this.bottomCell[2].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
            this.linearLayout2.addView(this.bottomCell[2], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[1].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell = this.settingsCell[1];
            int i44 = Theme.key_windowBackgroundWhiteBlackText;
            textSettingsCell.setTag(Integer.valueOf(i44));
            this.settingsCell[1].setTextColor(getThemedColor(i44));
            this.settingsCell[1].setText(LocaleController.getString(R.string.ResendCode), true);
            this.linearLayout2.addView(this.settingsCell[1], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[1].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 13));
            this.settingsCell[0] = new TextSettingsCell(context, this.resourcesProvider);
            this.settingsCell[0].setBackgroundDrawable(Theme.getSelectorDrawable(true));
            TextSettingsCell textSettingsCell2 = this.settingsCell[0];
            int i45 = Theme.key_text_RedRegular;
            textSettingsCell2.setTag(Integer.valueOf(i45));
            this.settingsCell[0].setTextColor(getThemedColor(i45));
            this.settingsCell[0].setText(LocaleController.getString(R.string.AbortPassword), false);
            this.linearLayout2.addView(this.settingsCell[0], LayoutHelper.createLinear(-1, -2));
            this.settingsCell[0].setOnClickListener(new PaymentFormActivity$$ExternalSyntheticLambda5(this, 14));
            this.inputFields = new EditTextBoldCursor[3];
            int i46 = 0;
            for (int i47 = 3; i46 < i47; i47 = 3) {
                if (i46 == 0) {
                    this.headerCell[0] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[0].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[0].setText(LocaleController.getString(R.string.PaymentPasswordTitle));
                    this.linearLayout2.addView(this.headerCell[0], LayoutHelper.createLinear(-1, -2));
                } else if (i46 == 2) {
                    this.headerCell[1] = new HeaderCell(context, this.resourcesProvider);
                    this.headerCell[1].setBackgroundColor(getThemedColor(Theme.key_windowBackgroundWhite));
                    this.headerCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailTitle));
                    this.linearLayout2.addView(this.headerCell[1], LayoutHelper.createLinear(-1, -2));
                }
                FrameLayout frameLayout10 = new FrameLayout(context);
                frameLayout10.setClipChildren(false);
                this.linearLayout2.addView(frameLayout10, LayoutHelper.createLinear(-1, 50));
                int i48 = Theme.key_windowBackgroundWhite;
                frameLayout10.setBackgroundColor(getThemedColor(i48));
                if (i46 == 0) {
                    AnonymousClass2 anonymousClass7 = new AnonymousClass2(context, 18);
                    anonymousClass7.setBackgroundColor(getThemedColor(i48));
                    this.dividers.add(anonymousClass7);
                    frameLayout10.addView(anonymousClass7, new FrameLayout.LayoutParams(-1, 1, 83));
                }
                this.inputFields[i46] = new EditTextBoldCursor(context);
                this.inputFields[i46].setTag(Integer.valueOf(i46));
                this.inputFields[i46].setTextSize(1, 16.0f);
                this.inputFields[i46].setHintTextColor(getThemedColor(Theme.key_windowBackgroundWhiteHintText));
                EditTextBoldCursor editTextBoldCursor10 = this.inputFields[i46];
                int i49 = Theme.key_windowBackgroundWhiteBlackText;
                editTextBoldCursor10.setTextColor(getThemedColor(i49));
                this.inputFields[i46].setBackgroundDrawable(null);
                this.inputFields[i46].setCursorColor(getThemedColor(i49));
                this.inputFields[i46].setCursorSize(AndroidUtilities.dp(20.0f));
                this.inputFields[i46].setCursorWidth(1.5f);
                if (i46 == 0 || i46 == 1) {
                    this.inputFields[i46].setInputType(129);
                    this.inputFields[i46].setTypeface(Typeface.DEFAULT);
                    this.inputFields[i46].setImeOptions(268435461);
                } else {
                    this.inputFields[i46].setInputType(33);
                    this.inputFields[i46].setImeOptions(268435462);
                }
                if (i46 == 0) {
                    this.inputFields[i46].setHint(LocaleController.getString(R.string.PaymentPasswordEnter));
                    this.inputFields[i46].requestFocus();
                } else if (i46 == 1) {
                    this.inputFields[i46].setHint(LocaleController.getString(R.string.PaymentPasswordReEnter));
                } else if (i46 == 2) {
                    this.inputFields[i46].setHint(LocaleController.getString(R.string.PaymentPasswordEmail));
                }
                this.inputFields[i46].setPadding(0, 0, 0, AndroidUtilities.dp(6.0f));
                this.inputFields[i46].setGravity(LocaleController.isRTL ? 5 : 3);
                frameLayout10.addView(this.inputFields[i46], LayoutHelper.createFrame(-1, -2.0f, 51, 21.0f, 12.0f, 21.0f, 6.0f));
                final int i50 = 4;
                this.inputFields[i46].setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                    public final PaymentFormActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final boolean onEditorAction(TextView textView5, int i111, KeyEvent keyEvent) {
                        EditTextBoldCursor[] editTextBoldCursorArr;
                        switch (i50) {
                            case 0:
                                PaymentFormActivity paymentFormActivity = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity.doneItem.performClick();
                                    return true;
                                }
                                paymentFormActivity.getClass();
                                return false;
                            case 1:
                                PaymentFormActivity paymentFormActivity2 = this.f$0;
                                paymentFormActivity2.getClass();
                                if (i111 != 5) {
                                    if (i111 != 6) {
                                        return false;
                                    }
                                    paymentFormActivity2.doneItem.performClick();
                                    return true;
                                }
                                int iIntValue = ((Integer) textView5.getTag()).intValue();
                                while (true) {
                                    iIntValue++;
                                    EditTextBoldCursor[] editTextBoldCursorArr2 = paymentFormActivity2.inputFields;
                                    if (iIntValue >= editTextBoldCursorArr2.length) {
                                        return true;
                                    }
                                    if (iIntValue != 4 && ((View) editTextBoldCursorArr2[iIntValue].getParent()).getVisibility() == 0) {
                                        paymentFormActivity2.inputFields[iIntValue].requestFocus();
                                        return true;
                                    }
                                }
                                break;
                            case 2:
                                PaymentFormActivity paymentFormActivity3 = this.f$0;
                                paymentFormActivity3.getClass();
                                if (i111 != 5) {
                                    if (i111 != 6) {
                                        return false;
                                    }
                                    paymentFormActivity3.doneItem.performClick();
                                    return true;
                                }
                                int iIntValue2 = ((Integer) textView5.getTag()).intValue();
                                do {
                                    int i112 = iIntValue2 + 1;
                                    editTextBoldCursorArr = paymentFormActivity3.inputFields;
                                    if (i112 >= editTextBoldCursorArr.length) {
                                        return true;
                                    }
                                    iIntValue2 = i112 == 4 ? iIntValue2 + 2 : i112;
                                } while (((View) editTextBoldCursorArr[iIntValue2].getParent()).getVisibility() != 0);
                                paymentFormActivity3.inputFields[iIntValue2].requestFocus();
                                return true;
                            case 3:
                                PaymentFormActivity paymentFormActivity4 = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity4.sendSavePassword(false);
                                    return true;
                                }
                                paymentFormActivity4.getClass();
                                return false;
                            default:
                                PaymentFormActivity paymentFormActivity5 = this.f$0;
                                if (i111 == 6) {
                                    paymentFormActivity5.doneItem.performClick();
                                    return true;
                                }
                                paymentFormActivity5.getClass();
                                if (i111 == 5) {
                                    int iIntValue3 = ((Integer) textView5.getTag()).intValue();
                                    if (iIntValue3 == 0) {
                                        paymentFormActivity5.inputFields[1].requestFocus();
                                    } else if (iIntValue3 == 1) {
                                        paymentFormActivity5.inputFields[2].requestFocus();
                                    }
                                }
                                return false;
                        }
                    }
                });
                if (i46 == 1) {
                    this.bottomCell[0] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                    this.bottomCell[0].setText(LocaleController.getString(R.string.PaymentPasswordInfo));
                    this.bottomCell[0].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                    this.linearLayout2.addView(this.bottomCell[0], LayoutHelper.createLinear(-1, -2));
                } else {
                    if (i46 == 2) {
                        this.bottomCell[1] = new TextInfoPrivacyCell(context, this.resourcesProvider);
                        this.bottomCell[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                        this.bottomCell[1].setBackgroundDrawable(Theme.getThemedDrawableByKey(context, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        this.linearLayout2.addView(this.bottomCell[1], LayoutHelper.createLinear(-1, -2));
                    }
                    i46++;
                }
                i46++;
            }
            updatePasswordFields();
        }
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
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

    public final void fillNumber(String str) {
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

    @Override
    public final Theme.ResourcesProvider getResourceProvider() {
        return this.resourcesProvider;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
            arrayList.add(new ThemeDescription(headerCellArr[i6], 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
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
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i8], 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
            arrayList.add(new ThemeDescription(textInfoPrivacyCellArr[i8], 2, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteLinkText));
            i8++;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList2 = this.dividers;
            if (i9 >= arrayList2.size()) {
                break;
            }
            arrayList.add(new ThemeDescription((View) arrayList2.get(i9), 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            i9++;
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
            arrayList.add(new ThemeDescription(textSettingsCellArr[i12], 268435456, null, null, null, null, Theme.key_listSelector));
            arrayList.add(new ThemeDescription(textSettingsCellArr[i12], 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
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
        TextDetailSettingsCell[] textDetailSettingsCellArr = this.detailSettingsCell;
        arrayList.add(new ThemeDescription(textDetailSettingsCellArr[0], 268435456, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(textDetailSettingsCellArr[0], 268435456, null, null, null, null, Theme.key_listSelector));
        for (int i16 = 1; i16 < textDetailSettingsCellArr.length; i16++) {
            arrayList.add(new ThemeDescription(textDetailSettingsCellArr[i16], 1, null, null, null, null, Theme.key_windowBackgroundWhite));
            arrayList.add(new ThemeDescription(textDetailSettingsCellArr[i16], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
            arrayList.add(new ThemeDescription(textDetailSettingsCellArr[i16], 0, new Class[]{TextDetailSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText2));
        }
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

    public final String getTotalPriceString(ArrayList arrayList) {
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

    public final void goToNextStep() {
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
                showChoosePaymentMethod(new PaymentFormActivity$$ExternalSyntheticLambda2(this, 2));
                return;
            }
            PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i, this.requestedInfo, null, null, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
            paymentFormActivity.customResultReceiver = this.customResultReceiver;
            paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
            boolean z2 = this.isWebView;
            onPresentFragment(paymentFormActivity);
            super.presentFragment(paymentFormActivity, z2);
            return;
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
                showChoosePaymentMethod(new PaymentFormActivity$$ExternalSyntheticLambda2(this, 2));
                return;
            }
            PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, i2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
            paymentFormActivity2.customResultReceiver = this.customResultReceiver;
            paymentFormActivity2.customAnyResultReceiver = this.customAnyResultReceiver;
            boolean z3 = this.isWebView;
            onPresentFragment(paymentFormActivity2);
            super.presentFragment(paymentFormActivity2, z3);
            return;
        }
        if (i3 != 2) {
            if (i3 == 3) {
                PaymentFormActivity paymentFormActivity3 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, this.passwordOk ? 4 : 2, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
                paymentFormActivity3.customResultReceiver = this.customResultReceiver;
                paymentFormActivity3.customAnyResultReceiver = this.customAnyResultReceiver;
                onPresentFragment(paymentFormActivity3);
                super.presentFragment(paymentFormActivity3, true);
                return;
            }
            if (i3 != 4) {
                if (i3 != 6) {
                    return;
                }
                if (this.delegate.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, this.savedCredentialsCard)) {
                    finishFragment();
                    return;
                }
                PaymentFormActivity paymentFormActivity4 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, false);
                paymentFormActivity4.customResultReceiver = this.customResultReceiver;
                paymentFormActivity4.customAnyResultReceiver = this.customAnyResultReceiver;
                onPresentFragment(paymentFormActivity4);
                super.presentFragment(paymentFormActivity4, true);
                return;
            }
            if (this.isCheckoutPreview) {
                NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.paymentFinished);
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.paymentFinished, new Object[0]);
            if (getMessagesController().newMessageCallback != null) {
                AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda2(this, 1), 500L);
                return;
            } else {
                if (onCheckoutSuccess(getParentLayout(), getParentActivity()) || isFinishing()) {
                    return;
                }
                finishFragment();
                return;
            }
        }
        TLRPC.PaymentForm paymentForm = this.paymentForm;
        if (!paymentForm.password_missing || !(z = this.saveCardInfo)) {
            PaymentFormActivityDelegate paymentFormActivityDelegate2 = this.delegate;
            if (paymentFormActivityDelegate2 != null) {
                paymentFormActivityDelegate2.didSelectNewCard(this.paymentJson, this.cardName, this.saveCardInfo, this.googlePayCredentials, null);
                finishFragment();
                return;
            }
            PaymentFormActivity paymentFormActivity5 = new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 4, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, this.saveCardInfo, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
            paymentFormActivity5.customResultReceiver = this.customResultReceiver;
            paymentFormActivity5.customAnyResultReceiver = this.customAnyResultReceiver;
            boolean z4 = this.isWebView;
            onPresentFragment(paymentFormActivity5);
            super.presentFragment(paymentFormActivity5, z4);
            return;
        }
        PaymentFormActivity paymentFormActivity6 = new PaymentFormActivity(this.invoiceInput, paymentForm, this.messageObject, this.invoiceSlug, 6, this.requestedInfo, this.shippingOption, this.tipAmount, this.paymentJson, this.cardName, this.validateRequest, z, this.googlePayCredentials, this.parentFragment, this.allowUnregistered);
        this.passwordFragment = paymentFormActivity6;
        paymentFormActivity6.customResultReceiver = this.customResultReceiver;
        paymentFormActivity6.customAnyResultReceiver = this.customAnyResultReceiver;
        TL_account.Password password = this.currentPassword;
        if (password == null || !password.has_password) {
            paymentFormActivity6.currentPassword = password;
            paymentFormActivity6.waitingForEmail = (password == null || TextUtils.isEmpty(password.email_unconfirmed_pattern)) ? false : true;
            paymentFormActivity6.updatePasswordFields();
        } else if (paymentFormActivity6.getParentActivity() != null) {
            paymentFormActivity6.goToNextStep();
        }
        PaymentFormActivity paymentFormActivity7 = this.passwordFragment;
        paymentFormActivity7.delegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password2) {
                PaymentFormActivity.this.currentPassword = password2;
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z5, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                PaymentFormActivity paymentFormActivity8 = PaymentFormActivity.this;
                PaymentFormActivityDelegate paymentFormActivityDelegate3 = paymentFormActivity8.delegate;
                if (paymentFormActivityDelegate3 != null) {
                    paymentFormActivityDelegate3.didSelectNewCard(str, str2, z5, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
                }
                if (paymentFormActivity8.isWebView) {
                    paymentFormActivity8.removeSelfFromStack();
                }
                return paymentFormActivity8.delegate != null;
            }

            @Override
            public final void onFragmentDestroyed() {
                PaymentFormActivity.this.passwordFragment = null;
            }
        };
        boolean z5 = this.isWebView;
        onPresentFragment(paymentFormActivity7);
        super.presentFragment(paymentFormActivity7, z5);
    }

    public final void init(TLRPC.InputInvoice inputInvoice, TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, int i, TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo, TLRPC.TL_shippingOption tL_shippingOption, Long l, String str2, String str3, TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, BaseFragment baseFragment, boolean z2) {
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

    public final void initGooglePay(Context context) {
        Optional optionalEmpty;
        if (getParentActivity() == null) {
            return;
        }
        CastSync.AnonymousClass1 anonymousClass1 = new CastSync.AnonymousClass1();
        int i = this.paymentForm.invoice.test ? 3 : 1;
        if (i != 0) {
            if (i == 0) {
                i = 0;
            } else if (i != 2 && i != 1 && i != 23 && i != 3) {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(SurfaceContainer$$ExternalSyntheticOutline0.m(i, "Invalid environment value "));
            }
        }
        anonymousClass1.val$type = i;
        this.paymentsClient = new zze(context, zzk.API, new Wallet$WalletOptions(anonymousClass1), GoogleApi.Settings.DEFAULT_SETTINGS);
        try {
            JSONObject jSONObjectPut = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
            jSONObjectPut.put("allowedPaymentMethods", new JSONArray().put(getBaseCardPaymentMethod()));
            optionalEmpty = Optional.of(jSONObjectPut);
        } catch (JSONException unused) {
            optionalEmpty = Optional.empty();
        }
        if (optionalEmpty.isPresent()) {
            String string = ((JSONObject) optionalEmpty.get()).toString();
            IsReadyToPayRequest isReadyToPayRequest = new IsReadyToPayRequest();
            zzah.checkNotNull(string, "isReadyToPayRequestJson cannot be null!");
            isReadyToPayRequest.zzf = string;
            zze zzeVar = this.paymentsClient;
            zzeVar.getClass();
            ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
            exoplayerCuesDecoderBuilder.inputBufferState = 23705;
            exoplayerCuesDecoderBuilder.inputBuffer = new Stripe(isReadyToPayRequest, 5);
            zzeVar.zae(0, exoplayerCuesDecoderBuilder.build()).addOnCompleteListener(getParentActivity(), new PaymentFormActivity$$ExternalSyntheticLambda30(this, 0));
        }
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return this.swipeBackEnabled;
    }

    public final void lambda$checkPassword$70(TLObject tLObject, TLRPC.TL_error tL_error, TL_account.getTmpPassword gettmppassword) {
        showEditDoneProgress$3(true, false);
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

    public final void lambda$checkPassword$72(TL_account.Password password, byte[] bArr) {
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.period = 1800;
        ProfileActivity$$ExternalSyntheticLambda65 profileActivity$$ExternalSyntheticLambda65 = new ProfileActivity$$ExternalSyntheticLambda65(7, this, gettmppassword);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (!(passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            profileActivity$$ExternalSyntheticLambda65.run(null, tL_error);
            return;
        }
        TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
        gettmppassword.password = tL_inputCheckPasswordSRPStartCheck;
        if (tL_inputCheckPasswordSRPStartCheck != null) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, profileActivity$$ExternalSyntheticLambda65, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "ALGO_INVALID";
        profileActivity$$ExternalSyntheticLambda65.run(null, tL_error2);
    }

    public final void lambda$checkPassword$73(TLRPC.TL_error tL_error, TLObject tLObject, String str, TL_account.getPassword getpassword) {
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, getpassword, new Object[0]);
            showEditDoneProgress$3(true, false);
            setDonePressed(false);
            return;
        }
        TL_account.Password password = (TL_account.Password) tLObject;
        if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
            AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
        } else if (password.has_password) {
            Utilities.globalQueue.postRunnable(new PollItemMenu$$ExternalSyntheticLambda8(this, password, AndroidUtilities.getStringBytes(str), 1));
        } else {
            this.passwordOk = false;
            goToNextStep();
        }
    }

    public final boolean lambda$createView$1(MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, false);
            countrySelectActivity.disableAnonymousNumbers = true;
            countrySelectActivity.delegate = new PaymentFormActivity$$ExternalSyntheticLambda30(this, 4);
            onPresentFragment(countrySelectActivity);
            super.presentFragment(countrySelectActivity);
        }
        return true;
    }

    public final void lambda$createView$17$1$2() {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        paymentFormActivity.delegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.validateRequest = tL_payments_validateRequestedInfo;
                paymentFormActivity2.setAddressFields(tL_payments_validateRequestedInfo.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            @Override
            public final void onFragmentDestroyed() {
            }
        };
        onPresentFragment(paymentFormActivity);
        super.presentFragment(paymentFormActivity);
    }

    public final void lambda$createView$18$4() {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        paymentFormActivity.delegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.validateRequest = tL_payments_validateRequestedInfo;
                paymentFormActivity2.setAddressFields(tL_payments_validateRequestedInfo.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            @Override
            public final void onFragmentDestroyed() {
            }
        };
        onPresentFragment(paymentFormActivity);
        super.presentFragment(paymentFormActivity);
    }

    public final void lambda$createView$19$1$1() {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        paymentFormActivity.delegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.validateRequest = tL_payments_validateRequestedInfo;
                paymentFormActivity2.setAddressFields(tL_payments_validateRequestedInfo.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            @Override
            public final void onFragmentDestroyed() {
            }
        };
        onPresentFragment(paymentFormActivity);
        super.presentFragment(paymentFormActivity);
    }

    public final void lambda$createView$20$1$2() {
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 0, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        paymentFormActivity.delegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
                PaymentFormActivity paymentFormActivity2 = PaymentFormActivity.this;
                paymentFormActivity2.validateRequest = tL_payments_validateRequestedInfo;
                paymentFormActivity2.setAddressFields(tL_payments_validateRequestedInfo.info);
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                return false;
            }

            @Override
            public final void onFragmentDestroyed() {
            }
        };
        onPresentFragment(paymentFormActivity);
        super.presentFragment(paymentFormActivity);
    }

    public final void lambda$createView$23(android.view.View r24, java.lang.String r25) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PaymentFormActivity.lambda$createView$23(android.view.View, java.lang.String):void");
    }

    public final void lambda$createView$27$1() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new PassportActivity$$ExternalSyntheticLambda1(15), this.allowUnregistered ? 8 : 0);
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.ResendCodeInfo);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.message = string;
        alertDialog.title = LocaleController.getString(R.string.AppName);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(alertDialog);
    }

    public final boolean lambda$createView$6(MotionEvent motionEvent) {
        if (getParentActivity() == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(null, false);
            countrySelectActivity.disableAnonymousNumbers = true;
            countrySelectActivity.delegate = new PaymentFormActivity$$ExternalSyntheticLambda30(this, 3);
            onPresentFragment(countrySelectActivity);
            super.presentFragment(countrySelectActivity);
        }
        return true;
    }

    public final void lambda$sendData$57(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.resourcesProvider);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
    }

    public final void lambda$sendData$59(Bulletin bulletin, boolean z, TLRPC.Message[] messageArr) {
        bulletin.hide();
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = messageArr[0].id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(messageArr[0].peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new PaymentFormActivity$$ExternalSyntheticLambda29(this, 2), 2);
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(messageArr[0].id, MessageObject.getDialogId(messageArr[0])));
        }
    }

    public final void lambda$sendData$62(TLObject tLObject) {
        BaseFragment lastFragment;
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            StarsIntroActivity.showTransactionSheet(getParentActivity(), this.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, this.resourcesProvider);
            return;
        }
        if (!(tLObject instanceof TLRPC.PaymentReceipt) || (lastFragment = LaunchActivity.getLastFragment()) == null) {
            return;
        }
        BaseFragment.BottomSheetParams bottomSheetParams = new BaseFragment.BottomSheetParams();
        bottomSheetParams.transitionFromLeft = true;
        PaymentFormActivity paymentFormActivity = new PaymentFormActivity((TLRPC.PaymentReceipt) tLObject);
        paymentFormActivity.customResultReceiver = this.customResultReceiver;
        paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
        lastFragment.showAsSheet(paymentFormActivity, bottomSheetParams);
    }

    public final void lambda$sendData$64(Bulletin bulletin, boolean z, TLRPC.Message message) {
        bulletin.hide();
        if (!z) {
            TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
            tL_payments_getPaymentReceipt.msg_id = message.id;
            tL_payments_getPaymentReceipt.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(message.peer_id);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentReceipt, new PaymentFormActivity$$ExternalSyntheticLambda29(this, 3), 2);
            return;
        }
        BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
        if (safeLastFragment != null) {
            safeLastFragment.presentFragment(ChatActivity.of(message.id, MessageObject.getDialogId(message)));
        }
    }

    public final void lambda$sendData$68(TLRPC.TL_error tL_error, TLRPC.TL_payments_sendPaymentForm tL_payments_sendPaymentForm) {
        AlertsCreator.processError(this.currentAccount, tL_error, this, tL_payments_sendPaymentForm, new Object[0]);
        setDonePressed(false);
        showEditDoneProgress$3(false, false);
        this.paymentStatusSent = true;
        this.invoiceStatus = 4;
        PaymentFormCallback paymentFormCallback = this.paymentFormCallback;
        if (paymentFormCallback != null) {
            paymentFormCallback.onInvoiceStatusChanged(4);
        }
    }

    public final void lambda$sendForm$53(TLRPC.TL_payments_validatedRequestedInfo tL_payments_validatedRequestedInfo) {
        this.requestedInfo = tL_payments_validatedRequestedInfo;
        if (this.paymentForm.saved_info != null && !this.saveShippingInfo) {
            TLRPC.TL_payments_clearSavedInfo tL_payments_clearSavedInfo = new TLRPC.TL_payments_clearSavedInfo();
            tL_payments_clearSavedInfo.info = true;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_clearSavedInfo, new PassportActivity$$ExternalSyntheticLambda1(15), this.allowUnregistered ? 8 : 0);
        }
        goToNextStep();
        setDonePressed(false);
        showEditDoneProgress$3(true, false);
    }

    public final void lambda$sendForm$54(TLObject tLObject, TLRPC.TL_error tL_error) {
        setDonePressed(false);
        showEditDoneProgress$3(true, false);
        if (tL_error != null) {
            String str = tL_error.text;
            str.getClass();
            switch (str) {
                case "ADDRESS_CITY_INVALID":
                    shakeView(this.inputFields[2]);
                    break;
                case "ADDRESS_STREET_LINE1_INVALID":
                    shakeView(this.inputFields[0]);
                    break;
                case "ADDRESS_COUNTRY_INVALID":
                    shakeView(this.inputFields[4]);
                    break;
                case "REQ_INFO_NAME_INVALID":
                    shakeView(this.inputFields[6]);
                    break;
                case "ADDRESS_POSTCODE_INVALID":
                    shakeView(this.inputFields[5]);
                    break;
                case "ADDRESS_STATE_INVALID":
                    shakeView(this.inputFields[3]);
                    break;
                case "REQ_INFO_PHONE_INVALID":
                    shakeView(this.inputFields[9]);
                    break;
                case "ADDRESS_STREET_LINE2_INVALID":
                    shakeView(this.inputFields[1]);
                    break;
                case "REQ_INFO_EMAIL_INVALID":
                    shakeView(this.inputFields[7]);
                    break;
                default:
                    AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
                    break;
            }
        }
    }

    public final void lambda$sendSavePassword$46(String str, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new CallLogActivity$$ExternalSyntheticLambda31(9, this, z), 8);
            return;
        }
        showEditDoneProgress$3(true, false);
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
                    showAlertWithText$1(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    showAlertWithText$1(LocaleController.getString(R.string.AppName), tL_error.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    showAlertWithText$1(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            }
            this.emailCodeLength = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new SelectAnimatedEmojiDialog$SelectStatusDurationDialog$$ExternalSyntheticLambda10(4, this, str));
            String string = LocaleController.getString(R.string.YourEmailAlmostThereText);
            AlertDialog alertDialog = builder.alertDialog;
            alertDialog.message = string;
            alertDialog.title = LocaleController.getString(R.string.YourEmailAlmostThere);
            Dialog dialogShowDialog = showDialog(alertDialog);
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }
    }

    public final void lambda$sendSavePassword$48(boolean z, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        DialogsActivity$50$$ExternalSyntheticLambda2 dialogsActivity$50$$ExternalSyntheticLambda2 = new DialogsActivity$50$$ExternalSyntheticLambda2(this, z, str, 6);
        if (z) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, dialogsActivity$50$$ExternalSyntheticLambda2, 10);
            return;
        }
        byte[] stringBytes = AndroidUtilities.getStringBytes(str2);
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.text = "PASSWORD_HASH_INVALID";
            dialogsActivity$50$$ExternalSyntheticLambda2.run(null, tL_error);
            return;
        }
        updatepasswordsettings.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
        if (updatepasswordsettings.new_settings.new_password_hash == null) {
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "ALGO_INVALID";
            dialogsActivity$50$$ExternalSyntheticLambda2.run(null, tL_error2);
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(updatepasswordsettings, dialogsActivity$50$$ExternalSyntheticLambda2, 10);
    }

    public final void lambda$sendSavedForm$50(TLObject tLObject, TLRPC.TL_error tL_error) {
        setDonePressed(false);
        showEditDoneProgress$3(true, false);
        if (tL_error != null) {
            AlertsCreator.processError(this.currentAccount, tL_error, this, tLObject, new Object[0]);
        }
    }

    public final void lambda$showChoosePaymentMethod$31(final Runnable runnable, ArrayList arrayList, ArrayList arrayList2, int i) {
        PaymentFormActivityDelegate paymentFormActivityDelegate = new PaymentFormActivityDelegate() {
            @Override
            public final void currentPasswordUpdated(TL_account.Password password) {
            }

            @Override
            public final void didSelectNewAddress(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
            }

            @Override
            public final boolean didSelectNewCard(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
                String str3;
                PaymentFormActivity paymentFormActivity = PaymentFormActivity.this;
                paymentFormActivity.savedCredentialsCard = tL_paymentSavedCredentialsCard;
                paymentFormActivity.paymentJson = str;
                paymentFormActivity.saveCardInfo = z;
                paymentFormActivity.cardName = str2;
                paymentFormActivity.googlePayCredentials = tL_inputPaymentCredentialsGooglePay;
                TextDetailSettingsCell[] textDetailSettingsCellArr = paymentFormActivity.detailSettingsCell;
                TextDetailSettingsCell textDetailSettingsCell = textDetailSettingsCellArr[0];
                if (textDetailSettingsCell != null) {
                    textDetailSettingsCell.setVisibility(0);
                    TextDetailSettingsCell textDetailSettingsCell2 = textDetailSettingsCellArr[0];
                    String str4 = paymentFormActivity.cardName;
                    if (str4 == null || str4.length() <= 1) {
                        str3 = paymentFormActivity.cardName;
                    } else {
                        str3 = paymentFormActivity.cardName.substring(0, 1).toUpperCase() + paymentFormActivity.cardName.substring(1);
                    }
                    textDetailSettingsCell2.setTextAndValueAndIcon(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
                    TextDetailSettingsCell textDetailSettingsCell3 = textDetailSettingsCellArr[1];
                    if (textDetailSettingsCell3 != null) {
                        textDetailSettingsCell3.setVisibility(0);
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
            }
        };
        TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard = this.savedCredentialsCard;
        int i2 = (tL_paymentSavedCredentialsCard == null && this.cardName == null) ? 0 : 1;
        if (!(tL_paymentSavedCredentialsCard == null && this.cardName == null) && i == 0) {
            return;
        }
        if (i >= i2 && i < arrayList.size() + i2) {
            TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard2 = (TLRPC.TL_paymentSavedCredentialsCard) arrayList.get(i - i2);
            this.savedCredentialsCard = tL_paymentSavedCredentialsCard2;
            paymentFormActivityDelegate.didSelectNewCard(null, tL_paymentSavedCredentialsCard2.title, true, null, tL_paymentSavedCredentialsCard2);
            return;
        }
        if (i < arrayList2.size() - 1) {
            TLRPC.TL_paymentFormMethod tL_paymentFormMethod = this.paymentForm.additional_methods.get((i - arrayList.size()) - i2);
            PaymentFormActivity paymentFormActivity = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
            paymentFormActivity.customResultReceiver = this.customResultReceiver;
            paymentFormActivity.customAnyResultReceiver = this.customAnyResultReceiver;
            paymentFormActivity.paymentFormMethod = tL_paymentFormMethod;
            paymentFormActivity.delegate = paymentFormActivityDelegate;
            onPresentFragment(paymentFormActivity);
            super.presentFragment(paymentFormActivity);
            return;
        }
        if (i == arrayList2.size() - 1) {
            PaymentFormActivity paymentFormActivity2 = new PaymentFormActivity(this.invoiceInput, this.paymentForm, this.messageObject, this.invoiceSlug, 2, this.requestedInfo, this.shippingOption, this.tipAmount, null, this.cardName, this.validateRequest, this.saveCardInfo, null, this.parentFragment, this.allowUnregistered);
            paymentFormActivity2.customResultReceiver = this.customResultReceiver;
            paymentFormActivity2.customAnyResultReceiver = this.customAnyResultReceiver;
            paymentFormActivity2.delegate = paymentFormActivityDelegate;
            onPresentFragment(paymentFormActivity2);
            super.presentFragment(paymentFormActivity2);
        }
    }

    public final void loadPasswordInfo$1() {
        if (this.loadingPasswordInfo) {
            return;
        }
        this.loadingPasswordInfo = true;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new PaymentFormActivity$$ExternalSyntheticLambda29(this, 0), 10);
    }

    @Override
    public final void onActivityResultFragment(int i, int i2, Intent intent) {
        if (i == 991) {
            AndroidUtilities.runOnUIThread(new PollItemMenu$$ExternalSyntheticLambda17(this, i2, intent, 25));
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
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
    public final void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        if (this.currentStep == 4 && this.needPayAfterTransition) {
            this.needPayAfterTransition = false;
            this.bottomLayout.callOnClick();
        }
    }

    public final boolean onCheckoutSuccess(INavigationLayout iNavigationLayout, Activity activity) {
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
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            BaseFragment baseFragment2 = (BaseFragment) obj2;
            if ((baseFragment2 instanceof ChatActivity) || (baseFragment2 instanceof PremiumPreviewFragment)) {
                baseFragment2.removeSelfFromStack();
            }
        }
        PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment(0, null);
        premiumPreviewFragment.forcePremium = true;
        boolean z = !isFinishing();
        INavigationLayout.NavigationParams navigationParams = new INavigationLayout.NavigationParams(premiumPreviewFragment);
        navigationParams.removeLast = z;
        ((ActionBarLayout) iNavigationLayout).presentFragment(navigationParams);
        if (activity instanceof LaunchActivity) {
            try {
                this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            ((LaunchActivity) activity).fireworksOverlay.start(false);
        }
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.twoStepPasswordChanged);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didRemoveTwoStepPassword);
        if (this.currentStep != 4 || this.isCheckoutPreview) {
            NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.paymentFinished);
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        PaymentFormActivityDelegate paymentFormActivityDelegate = this.delegate;
        if (paymentFormActivityDelegate != null) {
            paymentFormActivityDelegate.onFragmentDestroyed();
        }
        int i = 0;
        AndroidUtilities.checkAndroidTheme(getParentActivity(), false);
        if (!this.paymentStatusSent) {
            this.invoiceStatus = 2;
            if (this.paymentFormCallback != null) {
                INavigationLayout iNavigationLayout = this.parentLayout;
                if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).getFragmentStack() != null) {
                    int iIndexOf = ((ActionBarLayout) this.parentLayout).getFragmentStack().indexOf(this);
                    if (iIndexOf == -1) {
                        iIndexOf = ((ActionBarLayout) this.parentLayout).getFragmentStack().size();
                    }
                    while (true) {
                        if (i >= ((ActionBarLayout) this.parentLayout).getFragmentStack().size()) {
                            i = iIndexOf;
                            break;
                        } else if (((ActionBarLayout) this.parentLayout).getFragmentStack().get(i) instanceof PaymentFormActivity) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    i -= iIndexOf;
                }
                if (i == 0) {
                    this.paymentFormCallback.onInvoiceStatusChanged(this.invoiceStatus);
                }
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
            int i2 = this.currentStep;
            if ((i2 == 2 || i2 == 6) && Build.VERSION.SDK_INT >= 23 && (SharedConfig.passcodeHash.length() == 0 || SharedConfig.allowScreenCapture)) {
                getParentActivity().getWindow().clearFlags(8192);
                AndroidUtilities.logFlagSecure();
            }
        } catch (Throwable th) {
            FileLog.e(th);
        }
        super.onFragmentDestroy();
        this.canceled = true;
    }

    public final void onPresentFragment(BaseFragment baseFragment) {
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
    public final void onResume() {
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
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
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
            AndroidUtilities.runOnUIThread(new PaymentFormActivity$$ExternalSyntheticLambda2(this, 0), 100L);
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
    public final boolean presentFragment(BaseFragment baseFragment) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment);
    }

    public final void sendData() {
        String str;
        if (this.canceled) {
            return;
        }
        showEditDoneProgress$3(false, true);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendPaymentForm, new ProfileActivity$$ExternalSyntheticLambda65(6, this, tL_payments_sendPaymentForm), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public final void sendForm() {
        if (this.canceled) {
            return;
        }
        showEditDoneProgress$3(true, true);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(this.validateRequest, new ProfileActivity$$ExternalSyntheticLambda65(5, this, this.validateRequest), (this.allowUnregistered ? 8 : 0) | 2);
    }

    public final void sendSavePassword(boolean z) {
        String str;
        String str2;
        if (!z && this.codeFieldCell.getVisibility() == 0) {
            String text = this.codeFieldCell.getText();
            if (text.length() == 0) {
                shakeView(this.codeFieldCell);
                return;
            }
            showEditDoneProgress$3(true, true);
            TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
            confirmpasswordemail.code = text;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new PaymentFormActivity$$ExternalSyntheticLambda29(this, 1), 10);
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
                shakeView(this.inputFields[0]);
                return;
            }
            if (!string.equals(this.inputFields[1].getText().toString())) {
                try {
                    Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                shakeView(this.inputFields[1]);
                return;
            }
            String string2 = this.inputFields[2].getText().toString();
            if (string2.length() < 3) {
                shakeView(this.inputFields[2]);
                return;
            }
            int iLastIndexOf = string2.lastIndexOf(46);
            int iLastIndexOf2 = string2.lastIndexOf(64);
            if (iLastIndexOf2 < 0 || iLastIndexOf < iLastIndexOf2) {
                shakeView(this.inputFields[2]);
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
        showEditDoneProgress$3(true, true);
        Utilities.globalQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda488(this, z, str, str2, updatepasswordsettings, 18));
    }

    public final void setAddressFields(TLRPC.TL_paymentRequestedInfo tL_paymentRequestedInfo) {
        TLRPC.TL_postAddress tL_postAddress = tL_paymentRequestedInfo.shipping_address;
        TextDetailSettingsCell[] textDetailSettingsCellArr = this.detailSettingsCell;
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
            SurfaceContainer$$ExternalSyntheticOutline0.m(sb, ", ", str4, ", ", str5);
            textDetailSettingsCellArr[2].setTextAndValueAndIcon(R.drawable.msg_payment_address, SurfaceContainer$$ExternalSyntheticOutline0.m(sb, ", ", str6), LocaleController.getString(R.string.PaymentShippingAddress), true);
        }
        textDetailSettingsCellArr[2].setVisibility(tL_paymentRequestedInfo.shipping_address != null ? 0 : 8);
        String str7 = tL_paymentRequestedInfo.name;
        if (str7 != null) {
            textDetailSettingsCellArr[3].setTextAndValueAndIcon(R.drawable.msg_contacts, str7, LocaleController.getString(R.string.PaymentCheckoutName), true);
        }
        textDetailSettingsCellArr[3].setVisibility(tL_paymentRequestedInfo.name != null ? 0 : 8);
        if (tL_paymentRequestedInfo.phone != null) {
            textDetailSettingsCellArr[4].setTextAndValueAndIcon(R.drawable.msg_calls, PhoneFormat.getInstance().format(tL_paymentRequestedInfo.phone), LocaleController.getString(R.string.PaymentCheckoutPhoneNumber), (tL_paymentRequestedInfo.email == null && this.shippingOption == null) ? false : true);
        }
        textDetailSettingsCellArr[4].setVisibility(tL_paymentRequestedInfo.phone != null ? 0 : 8);
        String str8 = tL_paymentRequestedInfo.email;
        if (str8 != null) {
            textDetailSettingsCellArr[5].setTextAndValueAndIcon(R.drawable.msg_mention, str8, LocaleController.getString(R.string.PaymentCheckoutEmail), this.shippingOption != null);
        }
        textDetailSettingsCellArr[5].setVisibility(tL_paymentRequestedInfo.email != null ? 0 : 8);
    }

    public final void setDonePressed(boolean z) {
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

    public final void showAlertWithText$1(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = str;
        alertDialog.message = str2;
        showDialog(alertDialog);
    }

    public final void showChoosePaymentMethod(Runnable runnable) {
        BottomSheet bottomSheet = new BottomSheet(getParentActivity(), null, false, false);
        bottomSheet.fixNavigationBar();
        bottomSheet.title = LocaleController.getString(R.string.PaymentCheckoutMethod);
        bottomSheet.bigTitle = true;
        ArrayList arrayList = new ArrayList();
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
        ArrayList arrayList3 = new ArrayList();
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
        PaymentFormActivity$$ExternalSyntheticLambda45 paymentFormActivity$$ExternalSyntheticLambda45 = new PaymentFormActivity$$ExternalSyntheticLambda45(this, runnable, arrayList3, arrayList, 0);
        bottomSheet.items = charSequenceArr;
        bottomSheet.itemIcons = iArr;
        bottomSheet.onClickListener = paymentFormActivity$$ExternalSyntheticLambda45;
        showDialog(bottomSheet);
    }

    public final void showEditDoneProgress$3(boolean z, final boolean z2) {
        final int i = 0;
        final int i2 = 1;
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
                this.doneItemAnimation.addListener(new AnimatorListenerAdapter(this) {
                    public final PaymentFormActivity this$0;

                    {
                        this.this$0 = this;
                    }

                    @Override
                    public final void onAnimationCancel(Animator animator) {
                        switch (i2) {
                            case 0:
                                PaymentFormActivity paymentFormActivity = this.this$0;
                                AnimatorSet animatorSet4 = paymentFormActivity.doneItemAnimation;
                                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                                    paymentFormActivity.doneItemAnimation = null;
                                    break;
                                }
                                break;
                            default:
                                PaymentFormActivity paymentFormActivity2 = this.this$0;
                                AnimatorSet animatorSet5 = paymentFormActivity2.doneItemAnimation;
                                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                                    paymentFormActivity2.doneItemAnimation = null;
                                    break;
                                }
                                break;
                        }
                    }

                    @Override
                    public final void onAnimationEnd(Animator animator) {
                        switch (i2) {
                            case 0:
                                PaymentFormActivity paymentFormActivity = this.this$0;
                                AnimatorSet animatorSet4 = paymentFormActivity.doneItemAnimation;
                                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                                    if (!z2) {
                                        paymentFormActivity.progressView.setVisibility(4);
                                    } else {
                                        paymentFormActivity.doneItem.getContentView().setVisibility(4);
                                    }
                                    break;
                                }
                                break;
                            default:
                                PaymentFormActivity paymentFormActivity2 = this.this$0;
                                AnimatorSet animatorSet5 = paymentFormActivity2.doneItemAnimation;
                                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                                    if (!z2) {
                                        paymentFormActivity2.progressViewButton.setVisibility(4);
                                    } else {
                                        paymentFormActivity2.payTextView.setVisibility(4);
                                    }
                                    break;
                                }
                                break;
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
        this.doneItemAnimation.addListener(new AnimatorListenerAdapter(this) {
            public final PaymentFormActivity this$0;

            {
                this.this$0 = this;
            }

            @Override
            public final void onAnimationCancel(Animator animator) {
                switch (i) {
                    case 0:
                        PaymentFormActivity paymentFormActivity = this.this$0;
                        AnimatorSet animatorSet7 = paymentFormActivity.doneItemAnimation;
                        if (animatorSet7 != null && animatorSet7.equals(animator)) {
                            paymentFormActivity.doneItemAnimation = null;
                            break;
                        }
                        break;
                    default:
                        PaymentFormActivity paymentFormActivity2 = this.this$0;
                        AnimatorSet animatorSet8 = paymentFormActivity2.doneItemAnimation;
                        if (animatorSet8 != null && animatorSet8.equals(animator)) {
                            paymentFormActivity2.doneItemAnimation = null;
                            break;
                        }
                        break;
                }
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (i) {
                    case 0:
                        PaymentFormActivity paymentFormActivity = this.this$0;
                        AnimatorSet animatorSet7 = paymentFormActivity.doneItemAnimation;
                        if (animatorSet7 != null && animatorSet7.equals(animator)) {
                            if (!z2) {
                                paymentFormActivity.progressView.setVisibility(4);
                            } else {
                                paymentFormActivity.doneItem.getContentView().setVisibility(4);
                            }
                            break;
                        }
                        break;
                    default:
                        PaymentFormActivity paymentFormActivity2 = this.this$0;
                        AnimatorSet animatorSet8 = paymentFormActivity2.doneItemAnimation;
                        if (animatorSet8 != null && animatorSet8.equals(animator)) {
                            if (!z2) {
                                paymentFormActivity2.progressViewButton.setVisibility(4);
                            } else {
                                paymentFormActivity2.payTextView.setVisibility(4);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.doneItemAnimation.setDuration(150L);
        this.doneItemAnimation.start();
    }

    public final void showPayAlert(String str) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        String string = LocaleController.getString(R.string.PaymentTransactionReview);
        AlertDialog alertDialog = builder.alertDialog;
        alertDialog.title = string;
        alertDialog.message = AndroidUtilities.replaceTags(LocaleController.formatString("PaymentTransactionMessage2", R.string.PaymentTransactionMessage2, str, this.currentBotName, this.currentItemName));
        builder.setPositiveButton(LocaleController.getString(R.string.Continue), new PaymentFormActivity$$ExternalSyntheticLambda30(this, 5));
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog);
    }

    public final void updatePasswordFields() {
        int i = 0;
        if (this.currentStep == 6) {
            TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCell;
            if (textInfoPrivacyCellArr[2] == null) {
                return;
            }
            this.doneItem.setVisibility(0);
            TL_account.Password password = this.currentPassword;
            ArrayList arrayList = this.dividers;
            HeaderCell[] headerCellArr = this.headerCell;
            TextSettingsCell[] textSettingsCellArr = this.settingsCell;
            if (password == null) {
                showEditDoneProgress$3(true, true);
                textInfoPrivacyCellArr[2].setVisibility(8);
                textSettingsCellArr[0].setVisibility(8);
                textSettingsCellArr[1].setVisibility(8);
                this.codeFieldCell.setVisibility(8);
                headerCellArr[0].setVisibility(8);
                headerCellArr[1].setVisibility(8);
                textInfoPrivacyCellArr[0].setVisibility(8);
                for (int i2 = 0; i2 < 3; i2++) {
                    ((View) this.inputFields[i2].getParent()).setVisibility(8);
                }
                while (i < arrayList.size()) {
                    ((View) arrayList.get(i)).setVisibility(8);
                    i++;
                }
                return;
            }
            showEditDoneProgress$3(true, false);
            if (!this.waitingForEmail) {
                textInfoPrivacyCellArr[2].setVisibility(8);
                textSettingsCellArr[0].setVisibility(8);
                textSettingsCellArr[1].setVisibility(8);
                textInfoPrivacyCellArr[1].setText(LocaleController.getString(R.string.PaymentPasswordEmailInfo));
                this.codeFieldCell.setVisibility(8);
                headerCellArr[0].setVisibility(0);
                headerCellArr[1].setVisibility(0);
                textInfoPrivacyCellArr[0].setVisibility(0);
                for (int i3 = 0; i3 < 3; i3++) {
                    ((View) this.inputFields[i3].getParent()).setVisibility(0);
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    ((View) arrayList.get(i4)).setVisibility(0);
                }
                return;
            }
            TextInfoPrivacyCell textInfoPrivacyCell = textInfoPrivacyCellArr[2];
            int i5 = R.string.EmailPasswordConfirmText2;
            String str = this.currentPassword.email_unconfirmed_pattern;
            if (str == null) {
                str = "";
            }
            textInfoPrivacyCell.setText(LocaleController.formatString("EmailPasswordConfirmText2", i5, str));
            textInfoPrivacyCellArr[2].setVisibility(0);
            textSettingsCellArr[0].setVisibility(0);
            textSettingsCellArr[1].setVisibility(0);
            this.codeFieldCell.setVisibility(0);
            textInfoPrivacyCellArr[1].setText("");
            headerCellArr[0].setVisibility(8);
            headerCellArr[1].setVisibility(8);
            textInfoPrivacyCellArr[0].setVisibility(8);
            for (int i6 = 0; i6 < 3; i6++) {
                ((View) this.inputFields[i6].getParent()).setVisibility(8);
            }
            while (i < arrayList.size()) {
                ((View) arrayList.get(i)).setVisibility(8);
                i++;
            }
        }
    }

    public final void updateSavePaymentField() {
        TextInfoPrivacyCell[] textInfoPrivacyCellArr = this.bottomCell;
        if (textInfoPrivacyCellArr[0] != null) {
            ShadowSectionCell[] shadowSectionCellArr = this.sectionCell;
            if (shadowSectionCellArr[2] == null) {
                return;
            }
            TLRPC.PaymentForm paymentForm = this.paymentForm;
            if ((!paymentForm.password_missing && !paymentForm.can_save_credentials) || (this.webView != null && this.webviewLoading)) {
                this.checkCell1.setVisibility(8);
                textInfoPrivacyCellArr[0].setVisibility(8);
                ShadowSectionCell shadowSectionCell = shadowSectionCellArr[2];
                shadowSectionCell.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell.getContext(), R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine1));
            if (this.paymentForm.password_missing) {
                loadPasswordInfo$1();
                spannableStringBuilder.append((CharSequence) "\n");
                int length = spannableStringBuilder.length();
                String string = LocaleController.getString(R.string.PaymentCardSavePaymentInformationInfoLine2);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                spannableStringBuilder.append((CharSequence) string);
                if (iIndexOf != -1 && iLastIndexOf != -1) {
                    int i = iIndexOf + length;
                    int i2 = iLastIndexOf + length;
                    textInfoPrivacyCellArr[0].getTextView().setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(i2, i2 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(i, i + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new LinkSpan(), i, i2 - 1, 33);
                }
            }
            this.checkCell1.setEnabled(true);
            textInfoPrivacyCellArr[0].setText(spannableStringBuilder);
            this.checkCell1.setVisibility(0);
            textInfoPrivacyCellArr[0].setVisibility(0);
            ShadowSectionCell shadowSectionCell2 = shadowSectionCellArr[2];
            shadowSectionCell2.setBackground(Theme.getThemedDrawableByKey(shadowSectionCell2.getContext(), R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
        }
    }

    public final void updateTotalPrice() {
        this.totalPrice[0] = getTotalPriceString(this.prices);
        this.totalCell.setTextAndValue(LocaleController.getString(R.string.PaymentTransactionTotal), this.totalPrice[0], true);
        TextView textView = this.payTextView;
        if (textView != null) {
            textView.setText(LocaleController.formatString("PaymentCheckoutPay", R.string.PaymentCheckoutPay, this.totalPrice[0]));
        }
        if (this.tipLayout != null) {
            int themedColor = getThemedColor(Theme.key_contacts_inviteBackground);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                TextView textView2 = (TextView) getChildAt(i);
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
    public final boolean presentFragment(BaseFragment baseFragment, boolean z) {
        onPresentFragment(baseFragment);
        return super.presentFragment(baseFragment, z);
    }

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, MessageObject messageObject, String str, BaseFragment baseFragment) {
        super(null);
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

    public PaymentFormActivity(TLRPC.PaymentReceipt paymentReceipt) {
        super(null);
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

    public PaymentFormActivity(TLRPC.PaymentForm paymentForm, TLRPC.InputInvoice inputInvoice, BaseFragment baseFragment) {
        this(inputInvoice, paymentForm, null, null, 4, null, null, null, null, null, null, false, null, baseFragment, false);
        this.isCheckoutPreview = true;
    }
}
