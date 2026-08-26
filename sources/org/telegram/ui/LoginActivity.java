package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.telephony.SignalStrength;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.ReplacementSpan;
import android.util.Base64;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewSwitcher;
import androidx.core.graphics.ColorUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.DiffUtil;
import com.android.billingclient.api.AccountIdentifiers;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.zzcl;
import com.google.android.exoplayer2.RendererCapabilities;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.ApiExceptionMapper;
import com.google.android.gms.common.api.internal.zabv;
import com.google.android.gms.common.internal.zah;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.internal.clearcut.zze;
import com.google.android.gms.internal.mlkit_language_id_common.zzhp;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_language_id_common.zzjg;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
import com.google.android.gms.internal.mlkit_vision_common.zzkl;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import com.google.android.gms.internal.safetynet.zzi;
import com.google.android.gms.internal.safetynet.zzp;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi$AttestationResponse;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.PhoneFormat.PhoneFormat;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.AuthTokensHelper;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.CallReceiver;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.SendMessagesHelper$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBoxSquare;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ImageUpdater;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkPath;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.LoadingDrawable;
import org.telegram.ui.Components.LoginOrView;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.Premium.GLIcon.GLIconRenderer;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView;
import org.telegram.ui.Components.Premium.StarParticlesView;
import org.telegram.ui.Components.ProxyDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SimpleThemeDescription;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.SlideView;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TextViewSwitcher;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.Stars.ExplainStarsSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.bots.BotWebViewSheet;

public class LoginActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int AUTH_TYPE_CALL = 4;
    public static final int AUTH_TYPE_FLASH_CALL = 3;
    public static final int AUTH_TYPE_FRAGMENT_SMS = 15;
    public static final int AUTH_TYPE_MESSAGE = 1;
    public static final int AUTH_TYPE_MISSED_CALL = 11;
    public static final int AUTH_TYPE_PHRASE = 17;
    public static final int AUTH_TYPE_SMS = 2;
    public static final int AUTH_TYPE_WORD = 16;
    public static final int COUNTRY_STATE_EMPTY = 1;
    public static final int COUNTRY_STATE_INVALID = 2;
    public static final int COUNTRY_STATE_NOT_SET_OR_VALID = 0;
    private static final int DONE_TYPE_ACTION = 1;
    private static final int DONE_TYPE_FLOATING = 0;
    public static final boolean ENABLE_PASTED_TEXT_PROCESSING = false;
    private static final int MODE_CANCEL_ACCOUNT_DELETION = 1;
    private static final int MODE_CHANGE_LOGIN_EMAIL = 3;
    private static final int MODE_CHANGE_PHONE_NUMBER = 2;
    private static final int MODE_LOGIN = 0;
    private static final int SHOW_DELAY;
    public static final boolean TEST_BACKEND_IN_STORE = false;
    private static final int VIEW_ADD_EMAIL = 12;
    private static final int VIEW_CODE_CALL = 4;
    private static final int VIEW_CODE_EMAIL = 14;
    private static final int VIEW_CODE_EMAIL_SETUP = 13;
    private static final int VIEW_CODE_FLASH_CALL = 3;
    private static final int VIEW_CODE_FRAGMENT_SMS = 15;
    private static final int VIEW_CODE_MESSAGE = 1;
    private static final int VIEW_CODE_MISSED_CALL = 11;
    private static final int VIEW_CODE_PHRASE = 17;
    private static final int VIEW_CODE_SMS = 2;
    private static final int VIEW_CODE_WORD = 16;
    private static final int VIEW_NEW_PASSWORD_STAGE_1 = 9;
    private static final int VIEW_NEW_PASSWORD_STAGE_2 = 10;
    private static final int VIEW_PASSWORD = 6;
    private static final int VIEW_PAY = 18;
    private static final int VIEW_PHONE_INPUT = 0;
    private static final int VIEW_RECOVER = 7;
    private static final int VIEW_REGISTER = 5;
    private static final int VIEW_RESET_WAIT = 8;
    private static final int done_button = 1;
    private int activityMode;
    private Runnable animationFinishCallback;
    private ImageView backButtonView;
    private View cachedFragmentView;
    private AlertDialog cancelDeleteProgressDialog;
    private TLRPC.TL_auth_sentCode cancelDeletionCode;
    private Bundle cancelDeletionParams;
    private String cancelDeletionPhone;
    private boolean checkPermissions;
    private boolean checkShowPermissions;
    private int currentConnectionState;
    private int currentDoneType;
    private TLRPC.TL_help_termsOfService currentTermsOfService;
    private int currentViewNum;
    private boolean customKeyboardWasVisible;
    private boolean[] doneButtonVisible;
    private AnimatorSet doneItemAnimation;
    private boolean[] doneProgressVisible;
    private Runnable[] editDoneCallback;
    private Runnable emailChangeFinishCallback;
    private boolean emailChangeIsSuggestion;
    private boolean emailChangeNonSkippable;
    private TextView emailChangeSkipButton;
    private Runnable emailChangeSkipCallback;
    private VerticalPositionAutoAnimator floatingAutoAnimator;
    private FragmentFloatingButton floatingButton;
    private TransformableLoginButtonView floatingButtonIcon;
    private boolean forceDisableSafetyNet;
    private View introView;
    private boolean isAnimatingIntro;
    private boolean isRequestingFirebaseSms;
    private ValueAnimator keyboardAnimator;
    private Runnable keyboardHideCallback;
    private LinearLayout keyboardLinearLayout;
    private CustomPhoneKeyboardView keyboardView;
    private boolean needRequestPermissions;
    private boolean newAccount;
    private boolean paid;
    private boolean pendingSwitchingAccount;
    private Dialog permissionsDialog;
    private ArrayList<String> permissionsItems;
    private Dialog permissionsShowDialog;
    private ArrayList<String> permissionsShowItems;
    private PhoneNumberConfirmView phoneNumberConfirmView;
    private boolean[] postedEditDoneCallback;
    private int progressRequestId;
    private ImageView proxyButtonView;
    private boolean proxyButtonVisible;
    private ProxyDrawable proxyDrawable;
    private RadialProgressView radialProgressView;
    private boolean restoringState;
    private AnimatorSet[] showDoneAnimation;
    private Runnable showProxyButtonDelayed;
    private SizeNotifierFrameLayout sizeNotifierFrameLayout;
    private FrameLayout slideViewsContainer;
    private TextView startMessagingButton;
    private boolean syncContacts;
    private boolean testBackend;
    private final SlideView[] views;

    public class AnonymousClass7 implements TextWatcher {
        final EditText val$editText;
        final AtomicReference val$timeoutCallbackRef;

        public AnonymousClass7(EditText editText, AtomicReference atomicReference) {
            this.val$editText = editText;
            this.val$timeoutCallbackRef = atomicReference;
        }

        public void lambda$beforeTextChanged$0(EditText editText, AtomicReference atomicReference) {
            editText.removeTextChangedListener(this);
            editText.removeCallbacks((Runnable) atomicReference.get());
            ((Runnable) atomicReference.get()).run();
        }

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            EditText editText = this.val$editText;
            editText.post(new PhotoViewer$86$$ExternalSyntheticLambda0(this, editText, this.val$timeoutCallbackRef, 13));
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ActivityMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface AuthType {
    }

    public @interface CountryState {
    }

    public class LoadingTextView extends TextView {
        public final LoadingDrawable loadingDrawable;
        private final Drawable rippleDrawable;

        public LoadingTextView(Context context) {
            super(context);
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false)), 7, -1);
            this.rippleDrawable = rippleDrawableSafeCreateSelectorDrawable;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            rippleDrawableSafeCreateSelectorDrawable.setCallback(this);
            loadingDrawable.setAppearByGradient(true);
            loadingDrawable.setSpeed(0.8f);
        }

        private void updateLoadingLayout() {
            CharSequence text;
            Layout layout = getLayout();
            if (layout == null || (text = layout.getText()) == null) {
                return;
            }
            LinkPath linkPath = new LinkPath(true);
            linkPath.setInset(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f));
            int length = text.length();
            linkPath.setCurrentLayout(layout, 0, 0.0f);
            layout.getSelectionPath(0, length, linkPath);
            RectF rectF = AndroidUtilities.rectTmp;
            linkPath.getBounds(rectF);
            this.rippleDrawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.loadingDrawable.usePath(linkPath);
            this.loadingDrawable.setRadiiDp(4.0f);
            int themedColor = LoginActivity.this.getThemedColor(Theme.key_chat_linkSelectBackground);
            this.loadingDrawable.setColors(Theme.multAlpha(0.85f, themedColor), Theme.multAlpha(2.0f, themedColor), Theme.multAlpha(3.5f, themedColor), Theme.multAlpha(6.0f, themedColor));
            this.loadingDrawable.updateBounds();
        }

        public boolean isResendingCode() {
            return false;
        }

        public boolean isRippleEnabled() {
            return true;
        }

        @Override
        public void onDraw(Canvas canvas) {
            float paddingTop;
            canvas.save();
            if ((getGravity() & 16) == 0 || getLayout() == null) {
                paddingTop = getPaddingTop();
            } else {
                paddingTop = ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f) + getPaddingTop();
            }
            canvas.translate(getPaddingLeft(), paddingTop);
            this.rippleDrawable.draw(canvas);
            canvas.restore();
            super.onDraw(canvas);
            if (isResendingCode() || this.loadingDrawable.isDisappearing()) {
                canvas.save();
                canvas.translate(getPaddingLeft(), paddingTop);
                this.loadingDrawable.draw(canvas);
                canvas.restore();
                invalidate();
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateLoadingLayout();
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (isRippleEnabled() && motionEvent.getAction() == 0) {
                this.rippleDrawable.setHotspot(motionEvent.getX(), motionEvent.getY());
                this.rippleDrawable.setState(new int[]{16842910, 16842919});
            } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 1) {
                this.rippleDrawable.setState(new int[0]);
            }
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            updateLoadingLayout();
        }

        @Override
        public boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
        }
    }

    public class LoginActivityEmailCodeView extends SlideView {
        private FrameLayout cantAccessEmailFrameLayout;
        private TextView cantAccessEmailView;
        private CodeFieldContainer codeFieldContainer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private String email;
        private String emailPhone;
        private TextView emailResetInView;
        private Runnable errorColorTimeout;
        private ViewSwitcher errorViewSwitcher;
        private GoogleSignInAccount googleAccount;
        private RLottieImageView inboxImageView;
        private boolean isFromSetup;
        private boolean isSetup;
        private int length;
        private LoginOrView loginOrView;
        private boolean nextPressed;
        private String phone;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String requestPhone;
        private boolean requestingEmailReset;
        private Runnable resendCodeTimeout;
        private TextView resendCodeView;
        private FrameLayout resendFrameLayout;
        private int resetAvailablePeriod;
        private int resetPendingDate;
        private boolean resetRequestPending;
        private TextView signInWithGoogleView;
        private TextView titleView;
        private Runnable updateResetPendingDateCallback;
        private TextView wrongCodeView;

        public LoginActivityEmailCodeView(Context context, boolean z) {
            int i;
            super(context);
            this.errorColorTimeout = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 2);
            this.resendCodeTimeout = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 3);
            this.updateResetPendingDateCallback = new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 4);
            this.isSetup = z;
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            this.inboxImageView = new RLottieImageView(context);
            if (!z || LoginActivity.this.activityMode == 3) {
                this.inboxImageView.setAnimation(R.raw.email_check_inbox, 120, 120);
            } else {
                this.inboxImageView.setAnimation(R.raw.email_setup_heart, 120, 120);
            }
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.CheckYourNewEmail : z ? R.string.VerificationCode : R.string.CheckYourEmail));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, false, null);
            this.confirmTextView = spoilersTextView;
            spoilersTextView.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0));
            CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                @Override
                public void processNextPressed() {
                    LoginActivityEmailCodeView.this.lambda$onNextPressed$16(null);
                }
            };
            this.codeFieldContainer = codeFieldContainer;
            addView(codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, z ? 48 : 32, 0, 0));
            TextView textView2 = new TextView(context);
            this.signInWithGoogleView = textView2;
            textView2.setGravity(17);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
            drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                @Override
                public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                }

                @Override
                public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return AndroidUtilities.dp(12.0f);
                }
            }, 1, 2, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
            this.signInWithGoogleView.setText(spannableStringBuilder);
            final int i2 = 0;
            this.signInWithGoogleView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$8(view);
                            break;
                        default:
                            this.f$0.lambda$new$11(view);
                            break;
                    }
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.cantAccessEmailFrameLayout = frameLayout2;
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, (LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true, 1.0f, false);
            TextView textView3 = new TextView(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.cantAccessEmailView = textView3;
            textView3.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
            this.cantAccessEmailView.setGravity(17);
            this.cantAccessEmailView.setTextSize(1, 14.0f);
            this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.cantAccessEmailView.setMaxLines(2);
            this.cantAccessEmailView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(12, this, context));
            this.cantAccessEmailFrameLayout.addView(this.cantAccessEmailView);
            TextView textView4 = new TextView(context) {
                @Override
                public void onMeasure(int i3, int i4) {
                    super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i4), AndroidUtilities.dp(100.0f)), Integer.MIN_VALUE));
                }
            };
            this.emailResetInView = textView4;
            textView4.setGravity(17);
            this.emailResetInView.setTextSize(1, 14.0f);
            this.emailResetInView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailResetInView.setMaxLines(3);
            final int i3 = 1;
            this.emailResetInView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$8(view);
                            break;
                        default:
                            this.f$0.lambda$new$11(view);
                            break;
                    }
                }
            });
            this.emailResetInView.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
            this.emailResetInView.setVisibility(8);
            this.cantAccessEmailFrameLayout.addView(this.emailResetInView);
            TextView textView5 = new TextView(context);
            this.resendCodeView = textView5;
            textView5.setGravity(17);
            this.resendCodeView.setTextSize(1, 14.0f);
            this.resendCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.resendCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.resendCodeView.setMaxLines(2);
            this.resendCodeView.setText(LocaleController.getString(R.string.ResendCode));
            final int i4 = 2;
            this.resendCodeView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityEmailCodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$3(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$8(view);
                            break;
                        default:
                            this.f$0.lambda$new$11(view);
                            break;
                    }
                }
            });
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, false, 1.0f, false);
            LoginOrView loginOrView = new LoginOrView(context);
            this.loginOrView = loginOrView;
            VerticalPositionAutoAnimator.attach(loginOrView);
            this.errorViewSwitcher = new ViewSwitcher(context) {
                @Override
                public void onMeasure(int i5, int i6) {
                    super.onMeasure(i5, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
            Interpolator interpolator = Easings.easeInOutQuad;
            animationLoadAnimation.setInterpolator(interpolator);
            this.errorViewSwitcher.setInAnimation(animationLoadAnimation);
            Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
            animationLoadAnimation2.setInterpolator(interpolator);
            this.errorViewSwitcher.setOutAnimation(animationLoadAnimation2);
            FrameLayout frameLayout3 = new FrameLayout(context);
            this.resendFrameLayout = frameLayout3;
            frameLayout3.addView(this.resendCodeView, LayoutHelper.createFrame(-2, -2, 17));
            this.errorViewSwitcher.addView(this.resendFrameLayout);
            TextView textView6 = new TextView(context);
            this.wrongCodeView = textView6;
            textView6.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
            this.wrongCodeView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongCodeView.setTextSize(1, 15.0f);
            this.wrongCodeView.setGravity(49);
            this.wrongCodeView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.errorViewSwitcher.addView(this.wrongCodeView);
            FrameLayout frameLayout4 = new FrameLayout(context);
            if (z) {
                frameLayout4.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            } else {
                frameLayout4.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-1, -2, 48));
                frameLayout4.addView(this.cantAccessEmailFrameLayout, LayoutHelper.createFrame(-1, -2, 48));
                frameLayout4.addView(this.loginOrView, LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                frameLayout4.addView(this.signInWithGoogleView, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
            }
            addView(frameLayout4, LayoutHelper.createLinear(-1, 0, 1.0f));
        }

        private void animateSuccess(Runnable runnable) {
            if (this.googleAccount != null) {
                runnable.run();
                return;
            }
            int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    codeFieldContainer.postDelayed(new LinkManager$$ExternalSyntheticLambda2(29, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 400);
                    return;
                } else {
                    codeFieldContainer.postDelayed(new OAuthSheet$$ExternalSyntheticLambda6(this, i, 19), ((long) i) * 75);
                    i++;
                }
            }
        }

        private String getTimePattern(int i) {
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 / 3600;
            int iMax = (i3 % 3600) / 60;
            if (i2 == 0 && i4 == 0) {
                iMax = Math.max(1, iMax);
            }
            if (i2 != 0 && i4 != 0) {
                return LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Days", i2, new Object[0]), LocaleController.formatPluralString("Hours", i4, new Object[0]));
            }
            if (i4 != 0 && iMax != 0) {
                return LocaleController.formatString(R.string.LoginEmailResetInDoublePattern, LocaleController.formatPluralString("Hours", i4, new Object[0]), LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
            }
            if (i2 != 0) {
                return LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0]));
            }
            return i4 != 0 ? LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Hours", i2, new Object[0])) : LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Minutes", iMax, new Object[0]));
        }

        private String getTimePatternForTimer(int i) {
            int i2 = i / 86400;
            int i3 = i % 86400;
            int i4 = i3 / 3600;
            int i5 = i3 % 3600;
            int i6 = i5 / 60;
            int i7 = i5 % 60;
            if (i4 >= 16) {
                i2++;
            }
            if (i2 != 0) {
                return LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i2, new Object[0]));
            }
            StringBuilder sb = new StringBuilder();
            sb.append(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            return LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
        }

        public void lambda$animateSuccess$24(int i) {
            this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
        }

        public void lambda$animateSuccess$25(Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    runnable.run();
                    this.codeFieldContainer.isFocusSuppressed = false;
                    return;
                } else {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                }
            }
        }

        public void lambda$new$0() {
            boolean z = false;
            this.postedErrorColorTimeout = false;
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() != this.resendFrameLayout) {
                this.errorViewSwitcher.showNext();
                FrameLayout frameLayout = this.cantAccessEmailFrameLayout;
                if (this.resendCodeView.getVisibility() != 0 && LoginActivity.this.activityMode != 3 && !this.isSetup) {
                    z = true;
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, true);
            }
        }

        public void lambda$new$1() {
            showResendCodeView(true);
        }

        public void lambda$new$10(Bundle bundle, TLRPC.TL_auth_resendCode tL_auth_resendCode, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((KeyEvent.Callback) this, tLObject, (Object) bundle, tL_error, (TLObject) tL_auth_resendCode, 24));
        }

        public void lambda$new$11(View view) {
            if (this.resendCodeView.getVisibility() == 0 && this.resendCodeView.getAlpha() == 1.0f) {
                showResendCodeView(false);
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda0(this, bundle, tL_auth_resendCode, 25), 10);
            }
        }

        public void lambda$new$2(GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), 200);
        }

        public void lambda$new$3(View view) {
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).getClass();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (iIntValue == 200) {
                        try {
                            LoginActivityEmailCodeView.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivityEmailCodeView.this.lambda$onNextPressed$16(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            Context context = getContext();
            HashSet hashSet = new HashSet();
            HashMap map = new HashMap();
            String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
            zzah.checkNotEmpty(str);
            hashSet.add(GoogleSignInOptions.zab);
            if (hashSet.contains(GoogleSignInOptions.zae)) {
                Scope scope = GoogleSignInOptions.zad;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            hashSet.add(GoogleSignInOptions.zac);
            GoogleSignInClient client = GoogleSignIn.getClient(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
            client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda6(26, this, client));
        }

        public void lambda$new$4(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                    auth_sentcodetype.email_pattern = this.currentParams.getString("emailPattern");
                    this.resetRequestPending = true;
                }
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (!str.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
        }

        public void lambda$new$5(Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14(this, tLObject, bundle, tL_error, tL_auth_resetLoginEmail, 1));
        }

        public void lambda$new$6(AlertDialog alertDialog, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5(this, bundle, tL_auth_resetLoginEmail, 1), 10);
        }

        public void lambda$new$7(Context context, View view) {
            int i = 1;
            String string = this.currentParams.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i2 = iLastIndexOf + 1;
                textStyleRun.end = i2;
                spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i2, 0);
            }
            new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.LoginEmailResetTitle)).setMessage(AndroidUtilities.formatSpannable(AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage)), spannableStringBuilder, getTimePattern(this.resetAvailablePeriod))).setPositiveButton(LocaleController.getString(R.string.LoginEmailResetButton), new TodoItemMenu$$ExternalSyntheticLambda3(this, i)).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public void lambda$new$8(View view) {
            requestEmailReset();
        }

        public void lambda$new$9(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resendCode, new Object[0]);
            }
        }

        public void lambda$onNextPressed$17(Bundle bundle) {
            LoginActivity.this.setPage(5, true, bundle, false);
        }

        public void lambda$onNextPressed$18(TLObject tLObject, Bundle bundle) {
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
            } else if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject).sent_code);
            } else if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
            }
        }

        public void lambda$onNextPressed$19(Bundle bundle) {
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public void lambda$onNextPressed$20(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", str);
            animateSuccess(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, bundle, 0));
        }

        public void lambda$onNextPressed$21(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4(this, tL_error, tLObject, str));
        }

        public void lambda$onNextPressed$22(TLRPC.TL_error tL_error, String str, TLObject tLObject) {
            CodeNumberField[] codeNumberFieldArr;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                bundle.putString("phoneHash", this.phoneHash);
                bundle.putString("code", str);
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    animateSuccess(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda2(this, bundle, 1));
                } else {
                    animateSuccess(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, bundle, 5));
                }
            } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0(this, str, 1), 10);
            } else {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    shakeWrongCode();
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
                if (this.codeFieldContainer.codeField != null) {
                    int i = 0;
                    while (true) {
                        codeNumberFieldArr = this.codeFieldContainer.codeField;
                        if (i >= codeNumberFieldArr.length) {
                            break;
                        }
                        codeNumberFieldArr[i].setText("");
                        i++;
                    }
                    codeNumberFieldArr[0].requestFocus();
                }
                this.codeFieldContainer.isFocusSuppressed = false;
            }
            this.googleAccount = null;
        }

        public void lambda$onNextPressed$23(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda4(this, tL_error, str, tLObject));
        }

        public void lambda$onPasscodeError$15() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public void lambda$onPasscodeError$16() {
            postDelayed(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 7), 150L);
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 3000L);
            this.postedErrorColorTimeout = true;
        }

        public void lambda$onShow$28() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.codeField == null) {
                return;
            }
            codeFieldContainer.setText("");
            this.codeFieldContainer.codeField[0].requestFocus();
        }

        public void lambda$requestEmailReset$12(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            this.requestingEmailReset = false;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, (TLRPC.TL_auth_sentCode) tLObject);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("TASK_ALREADY_EXISTS")) {
                ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone))))), null);
                return;
            }
            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
        }

        public void lambda$requestEmailReset$13(Bundle bundle, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda14(this, tLObject, bundle, tL_error, tL_auth_resetLoginEmail, 0));
        }

        public void lambda$setParams$14(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        public void lambda$shakeWrongCode$26() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public void lambda$shakeWrongCode$27() {
            postDelayed(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 6), 150L);
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
            }
            for (CodeNumberField codeNumberField2 : this.codeFieldContainer.codeField) {
                codeNumberField2.animateErrorProgress(1.0f);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 1));
        }

        public void requestEmailReset() {
            if (this.requestingEmailReset) {
                return;
            }
            this.requestingEmailReset = true;
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda5(this, bundle, tL_auth_resetLoginEmail, 0), 10);
        }

        private void shakeWrongCode() {
            int i;
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
                while (true) {
                    CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                    if (i >= codeNumberFieldArr.length) {
                        break;
                    }
                    codeNumberFieldArr[i].setText("");
                    this.codeFieldContainer.codeField[i].animateErrorProgress(1.0f);
                    i++;
                }
            } catch (Exception unused) {
            }
            i = 0;
            if (this.errorViewSwitcher.getCurrentView() == this.resendFrameLayout) {
                this.errorViewSwitcher.showNext();
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, true);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 10.0f, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 0));
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        private void showResendCodeView(boolean z) {
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, (z || LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true);
            if (this.loginOrView.getVisibility() != 8) {
                this.loginOrView.setLayoutParams(LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
                this.loginOrView.requestLayout();
            }
        }

        public void updateResetPendingDate() {
            int iCurrentTimeMillis = (int) (((long) this.resetPendingDate) - (System.currentTimeMillis() / 1000));
            if (this.resetPendingDate <= 0 || iCurrentTimeMillis <= 0) {
                this.emailResetInView.setVisibility(0);
                this.emailResetInView.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 8), 1000L);
                return;
            }
            String string = LocaleController.formatString(R.string.LoginEmailResetInTime, getTimePatternForTimer(iCurrentTimeMillis));
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                spannableStringBuilderValueOf.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilderValueOf.setSpan(new ForegroundColorSpan(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueText4)), iIndexOf, iLastIndexOf - 1, 33);
            }
            this.emailResetInView.setText(spannableStringBuilderValueOf);
            AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString(R.string.VerificationCode);
        }

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
            removeCallbacks(this.resendCodeTimeout);
        }

        @Override
        public void onHide() {
            super.onHide();
            if (this.resetPendingDate != 0) {
                AndroidUtilities.cancelRunOnUIThread(this.updateResetPendingDateCallback);
            }
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            TLObject tLObject;
            if (this.nextPressed) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.resendCodeTimeout);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            codeFieldContainer.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
            if (codeNumberFieldArr != null) {
                for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                    codeNumberField.animateFocusedProgress(0.0f);
                }
            }
            String code = this.codeFieldContainer.getCode();
            if (code.length() == 0 && this.googleAccount == null) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            if (LoginActivity.this.activityMode == 3) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode.code = code;
                verifyemail.verification = tL_emailVerificationCode;
                tLObject = verifyemail;
            } else if (this.isFromSetup) {
                TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode2.code = code;
                verifyemail2.verification = tL_emailVerificationCode2;
                tLObject = verifyemail2;
            } else {
                TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                tL_auth_signIn.phone_number = this.requestPhone;
                tL_auth_signIn.phone_code_hash = this.phoneHash;
                if (this.googleAccount != null) {
                    TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                    tL_emailVerificationGoogle.token = this.googleAccount.zae;
                    tL_auth_signIn.email_verification = tL_emailVerificationGoogle;
                } else {
                    TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                    tL_emailVerificationCode3.code = code;
                    tL_auth_signIn.email_verification = tL_emailVerificationCode3;
                }
                tL_auth_signIn.flags |= 2;
                tLObject = tL_auth_signIn;
            }
            CodeFieldContainer codeFieldContainer2 = this.codeFieldContainer;
            codeFieldContainer2.isFocusSuppressed = true;
            CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer2.codeField;
            if (codeNumberFieldArr2 != null) {
                for (CodeNumberField codeNumberField2 : codeNumberFieldArr2) {
                    codeNumberField2.animateFocusedProgress(0.0f);
                }
            }
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tLObject, new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda0(this, code, 0), 10);
        }

        @Override
        public void onShow() {
            super.onShow();
            if (this.resetRequestPending) {
                this.resetRequestPending = false;
            } else {
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityEmailCodeView$$ExternalSyntheticLambda6(this, 5), LoginActivity.SHOW_DELAY);
            }
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailcode_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailcode_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("emailcode_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailcode_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.isFromSetup = this.currentParams.getBoolean("setup");
            this.length = this.currentParams.getInt("length");
            this.email = this.currentParams.getString("email");
            this.resetAvailablePeriod = this.currentParams.getInt("resetAvailablePeriod");
            this.resetPendingDate = this.currentParams.getInt("resetPendingDate");
            int i = 8;
            if (LoginActivity.this.activityMode == 3) {
                this.confirmTextView.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, false);
            } else if (this.isSetup) {
                this.confirmTextView.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.email));
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, false);
            } else {
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, true, 1.0f, false);
                this.cantAccessEmailView.setVisibility(this.resetPendingDate == 0 ? 0 : 8);
                this.emailResetInView.setVisibility(this.resetPendingDate != 0 ? 0 : 8);
                if (this.resetPendingDate != 0) {
                    updateResetPendingDate();
                }
            }
            this.codeFieldContainer.setNumbersCount(this.length, 1);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                codeNumberField.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        if (LoginActivityEmailCodeView.this.postedErrorColorTimeout) {
                            LoginActivityEmailCodeView loginActivityEmailCodeView = LoginActivityEmailCodeView.this;
                            loginActivityEmailCodeView.removeCallbacks(loginActivityEmailCodeView.errorColorTimeout);
                            LoginActivityEmailCodeView.this.errorColorTimeout.run();
                        }
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }
                });
                codeNumberField.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 2));
            }
            this.codeFieldContainer.setText("");
            if (!this.isFromSetup && LoginActivity.this.activityMode != 3) {
                String string = this.currentParams.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int iIndexOf = string.indexOf(42);
                int iLastIndexOf = string.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = iIndexOf;
                    int i2 = iLastIndexOf + 1;
                    textStyleRun.end = i2;
                    spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i2, 0);
                }
                this.confirmTextView.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                i = 0;
            }
            this.loginOrView.setVisibility(i);
            this.signInWithGoogleView.setVisibility(i);
            LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[0]);
            this.codeFieldContainer.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                AndroidUtilities.runOnUIThread(this.resendCodeTimeout, bundle.getInt("timeout"));
            }
            if (this.resetPendingDate != 0) {
                AndroidUtilities.runOnUIThread(this.updateResetPendingDateCallback, 1000L);
            }
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            TextView textView = this.confirmTextView;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            textView.setTextColor(Theme.getColor(null, i, false));
            TextView textView2 = this.signInWithGoogleView;
            int i2 = Theme.key_windowBackgroundWhiteBlueText4;
            textView2.setTextColor(Theme.getColor(null, i2, false));
            this.loginOrView.updateColors();
            this.resendCodeView.setTextColor(Theme.getColor(null, i2, false));
            this.cantAccessEmailView.setTextColor(Theme.getColor(null, i2, false));
            this.emailResetInView.setTextColor(Theme.getColor(null, i, false));
            this.wrongCodeView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
            this.codeFieldContainer.invalidate();
        }
    }

    public class LoginActivityNewPasswordView extends SlideView {
        private TextView cancelButton;
        private EditTextBoldCursor[] codeField;
        private TextView confirmTextView;
        private Bundle currentParams;
        private TL_account.Password currentPassword;
        private int currentStage;
        private String emailCode;
        private boolean isPasswordVisible;
        private String newPassword;
        private boolean nextPressed;
        private OutlineTextContainerView[] outlineFields;
        private ImageView passwordButton;
        private String passwordString;
        private TextView titleTextView;

        public LoginActivityNewPasswordView(Context context, int i) {
            super(context);
            this.currentStage = i;
            setOrientation(1);
            int i2 = i == 1 ? 1 : 2;
            this.codeField = new EditTextBoldCursor[i2];
            this.outlineFields = new OutlineTextContainerView[i2];
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            float f = 18.0f;
            textView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            this.titleTextView.setText(LocaleController.getString(R.string.SetNewPassword));
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, AndroidUtilities.isSmallScreen() ? 16 : 72, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            float f2 = 16.0f;
            textView2.setTextSize(1, 16.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 16));
            final int i3 = 0;
            while (i3 < this.codeField.length) {
                OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineFields[i3] = outlineTextContainerView;
                outlineTextContainerView.setText(LocaleController.getString(i == 0 ? i3 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint : R.string.PasswordHintPlaceholder));
                this.codeField[i3] = new EditTextBoldCursor(context);
                this.codeField[i3].setCursorSize(AndroidUtilities.dp(20.0f));
                this.codeField[i3].setCursorWidth(1.5f);
                this.codeField[i3].setImeOptions(268435461);
                this.codeField[i3].setTextSize(1, f);
                this.codeField[i3].setMaxLines(1);
                this.codeField[i3].setBackground(null);
                int iDp = AndroidUtilities.dp(f2);
                this.codeField[i3].setPadding(iDp, iDp, iDp, iDp);
                if (i == 0) {
                    this.codeField[i3].setInputType(129);
                    this.codeField[i3].setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                this.codeField[i3].setTypeface(Typeface.DEFAULT);
                this.codeField[i3].setGravity(LocaleController.isRTL ? 5 : 3);
                EditTextBoldCursor editTextBoldCursor = this.codeField[i3];
                final boolean z = i3 == 0 && i == 0;
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (z) {
                            if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() != 0 && !TextUtils.isEmpty(editable)) {
                                if (LoginActivityNewPasswordView.this.isPasswordVisible) {
                                    LoginActivityNewPasswordView.this.passwordButton.callOnClick();
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, true, 0.1f, true);
                            } else {
                                if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() == 8 || !TextUtils.isEmpty(editable)) {
                                    return;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, false, 0.1f, true);
                            }
                        }
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    }
                });
                this.codeField[i3].setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(outlineTextContainerView, 3));
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.addView(this.codeField[i3], LayoutHelper.createLinear(0, -2, 1.0f));
                    ImageView imageView = new ImageView(context);
                    this.passwordButton = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, true, 0.1f, false);
                    final int i4 = 0;
                    this.passwordButton.setOnClickListener(new View.OnClickListener(this) {
                        public final LoginActivity.LoginActivityNewPasswordView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i4) {
                                case 0:
                                    this.f$0.lambda$new$1(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$3(view);
                                    break;
                            }
                        }
                    });
                    linearLayout.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
                } else {
                    outlineTextContainerView.addView(this.codeField[i3], LayoutHelper.createFrame(-1, -2.0f));
                }
                outlineTextContainerView.attachEditText(this.codeField[i3]);
                addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 16, 16, 0));
                this.codeField[i3].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                        return this.f$0.lambda$new$2(i3, textView3, i5, keyEvent);
                    }
                });
                i3++;
                f = 18.0f;
                f2 = 16.0f;
            }
            if (i == 0) {
                this.confirmTextView.setText(LocaleController.getString("PleaseEnterNewFirstPasswordLogin", R.string.PleaseEnterNewFirstPasswordLogin));
            } else {
                this.confirmTextView.setText(LocaleController.getString("PasswordHintTextLogin", R.string.PasswordHintTextLogin));
            }
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.cancelButton.setText(LocaleController.getString(R.string.YourEmailSkip));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            final int i5 = 1;
            this.cancelButton.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityNewPasswordView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        default:
                            this.f$0.lambda$new$3(view);
                            break;
                    }
                }
            });
        }

        public static void lambda$new$0(OutlineTextContainerView outlineTextContainerView, View view, boolean z) {
            outlineTextContainerView.animateSelection(z ? 1.0f : 0.0f);
        }

        public void lambda$new$1(View view) {
            this.isPasswordVisible = !this.isPasswordVisible;
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                int selectionStart = editTextBoldCursorArr[i].getSelectionStart();
                int selectionEnd = this.codeField[i].getSelectionEnd();
                this.codeField[i].setInputType((this.isPasswordVisible ? 144 : 128) | 1);
                this.codeField[i].setSelection(selectionStart, selectionEnd);
                i++;
            }
            this.passwordButton.setTag(Boolean.valueOf(this.isPasswordVisible));
            this.passwordButton.setColorFilter(Theme.getColor(null, this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
        }

        public boolean lambda$new$2(int i, TextView textView, int i2, KeyEvent keyEvent) {
            if (i == 0) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (editTextBoldCursorArr.length == 2) {
                    editTextBoldCursorArr[1].requestFocus();
                    return true;
                }
            }
            if (i2 != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$3(View view) {
            if (this.currentStage == 0) {
                recoverPassword(null, null);
            } else {
                recoverPassword(this.newPassword, null);
            }
        }

        public void lambda$onShow$10() {
            EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                EditTextBoldCursor editTextBoldCursor = this.codeField[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(this.codeField[0]);
            }
        }

        public void lambda$recoverPassword$4(TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
            if (tL_error == null) {
                TL_account.Password password = (TL_account.Password) tLObject;
                this.currentPassword = password;
                TwoStepVerificationActivity.initPasswordNewAlgo(password);
                recoverPassword(str, str2);
            }
        }

        public void lambda$recoverPassword$5(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5(this, tL_error, tLObject, str, str2));
        }

        public void lambda$recoverPassword$6(TLObject tLObject, AlertDialog alertDialog, int i) {
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        public void lambda$recoverPassword$7(TLRPC.TL_error tL_error, String str, String str2, TLObject tLObject) {
            int i = 0;
            if (tL_error != null && ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text))) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1(this, str, str2, i), 8);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (!(tLObject instanceof TLRPC.auth_Authorization)) {
                if (tL_error != null) {
                    this.nextPressed = false;
                    if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                        return;
                    } else {
                        int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                        return;
                    }
                }
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda6(27, this, (TLRPC.auth_Authorization) tLObject));
            if (TextUtils.isEmpty(str)) {
                builder.setMessage(LocaleController.getString(R.string.YourPasswordReset));
            } else {
                builder.setMessage(LocaleController.getString(R.string.YourPasswordChangedSuccessText));
            }
            builder.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
            Dialog dialogShowDialog = LoginActivity.this.showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }

        public void lambda$recoverPassword$8(String str, String str2, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda5(this, tL_error, str, str2, tLObject));
        }

        public void lambda$recoverPassword$9(String str, String str2, TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword) {
            byte[] stringBytes = str != null ? AndroidUtilities.getStringBytes(str) : null;
            LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1 loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1 = new LoginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1(this, str, str2, 1);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.new_algo;
            if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "PASSWORD_HASH_INVALID";
                loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1.run(null, tL_error);
                return;
            }
            if (str != null) {
                tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                    TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
                    tL_error2.text = "ALGO_INVALID";
                    loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1.run(null, tL_error2);
                }
            }
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_recoverPassword, loginActivity$LoginActivityNewPasswordView$$ExternalSyntheticLambda1, 10);
        }

        private void onPasscodeError(boolean z, int i) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeField[i].performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            AndroidUtilities.shakeView(this.codeField[i]);
        }

        private void recoverPassword(String str, String str2) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            if (!TextUtils.isEmpty(str)) {
                tL_auth_recoverPassword.flags |= 1;
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                tL_auth_recoverPassword.new_settings = passwordinputsettings;
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2 != null ? str2 : "";
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            Utilities.globalQueue.postRunnable(new LinkManager$$ExternalSyntheticLambda23(4, this, str, str2, tL_auth_recoverPassword));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            String string = this.codeField[0].getText().toString();
            if (string.length() == 0) {
                onPasscodeError(false, 0);
                return;
            }
            if (this.currentStage != 0) {
                this.nextPressed = true;
                LoginActivity.this.needShowProgress(0);
                recoverPassword(this.newPassword, string);
            } else {
                if (!string.equals(this.codeField[1].getText().toString())) {
                    onPasscodeError(false, 1);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.emailCode);
                bundle.putString("new_password", string);
                bundle.putString("password", this.passwordString);
                LoginActivity.this.setPage(10, true, bundle, false);
            }
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(this, 2), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.currentStage);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_params" + this.currentStage, this.currentParams);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = this.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                editTextBoldCursorArr[i].setText("");
                i++;
            }
            this.currentParams = bundle;
            this.emailCode = bundle.getString("emailCode");
            String string = this.currentParams.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                TL_account.Password passwordTLdeserialize = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                this.currentPassword = passwordTLdeserialize;
                TwoStepVerificationActivity.initPasswordNewAlgo(passwordTLdeserialize);
            }
            this.newPassword = this.currentParams.getString("new_password");
            LoginActivity.this.showKeyboard(this.codeField[0]);
            this.codeField[0].requestFocus();
        }

        @Override
        public void updateColors() {
            this.titleTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            for (EditTextBoldCursor editTextBoldCursor : this.codeField) {
                editTextBoldCursor.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                editTextBoldCursor.setCursorColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false));
            }
            for (OutlineTextContainerView outlineTextContainerView : this.outlineFields) {
                outlineTextContainerView.updateColor();
            }
            this.cancelButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            ImageView imageView = this.passwordButton;
            if (imageView != null) {
                imageView.setColorFilter(Theme.getColor(null, this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText, false));
                this.passwordButton.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1, -1));
            }
        }
    }

    public class LoginActivityPasswordView extends SlideView {
        private TextView cancelButton;
        private EditTextBoldCursor codeField;
        private TextView confirmTextView;
        private Bundle currentParams;
        private TL_account.Password currentPassword;
        private RLottieImageView lockImageView;
        private boolean nextPressed;
        private OutlineTextContainerView outlineCodeField;
        private String passwordString;
        private String phoneCode;
        private String phoneHash;
        private String requestPhone;
        private TextView titleView;

        public LoginActivityPasswordView(Context context) {
            int i;
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.lockImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_intro, 120, 120);
            this.lockImageView.setAutoRepeat(false);
            frameLayout.addView(this.lockImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(R.string.YourPasswordHeader));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(R.string.LoginPasswordTextShort));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.outlineCodeField = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(R.string.EnterPassword));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.codeField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            this.codeField.setCursorWidth(1.5f);
            this.codeField.setBackground(null);
            this.codeField.setImeOptions(268435461);
            this.codeField.setTextSize(1, 18.0f);
            this.codeField.setMaxLines(1);
            int iDp = AndroidUtilities.dp(16.0f);
            this.codeField.setPadding(iDp, iDp, iDp, iDp);
            this.codeField.setInputType(129);
            this.codeField.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.codeField.setTypeface(Typeface.DEFAULT);
            this.codeField.setGravity(LocaleController.isRTL ? 5 : 3);
            this.codeField.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 4));
            this.outlineCodeField.attachEditText(this.codeField);
            this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
            this.codeField.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 6));
            addView(this.outlineCodeField, LayoutHelper.createLinear(-1, -2, 1, 16, 32, 16, 0));
            TextView textView3 = new TextView(context);
            this.cancelButton = textView3;
            textView3.setGravity(19);
            this.cancelButton.setText(LocaleController.getString(R.string.ForgotPassword));
            this.cancelButton.setTextSize(1, 15.0f);
            this.cancelButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.cancelButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(this.cancelButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(this.cancelButton);
            this.cancelButton.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(13, this, context));
        }

        public void lambda$new$0(View view, boolean z) {
            this.outlineCodeField.animateSelection(z ? 1.0f : 0.0f);
        }

        public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$2(TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
            Bundle bundle = new Bundle();
            bundle.putString("email_unconfirmed_pattern", tL_auth_passwordRecovery.email_pattern);
            bundle.putString("password", this.passwordString);
            bundle.putString("requestPhone", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("phoneCode", this.phoneCode);
            LoginActivity.this.setPage(7, true, bundle, false);
        }

        public void lambda$new$3(TLRPC.TL_error tL_error, TLObject tLObject) {
            LoginActivity.this.needHideProgress(false);
            if (tL_error != null) {
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                } else {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
                    return;
                }
            }
            TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            String str = tL_auth_passwordRecovery.email_pattern;
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str);
            int iIndexOf = str.indexOf(42);
            int iLastIndexOf = str.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i = iLastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i, 0);
            }
            builder.setMessage(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf));
            builder.setTitle(LocaleController.getString("RestoreEmailSentTitle", R.string.RestoreEmailSentTitle));
            builder.setPositiveButton(LocaleController.getString(R.string.Continue), new DialogsActivity$$ExternalSyntheticLambda6(28, this, tL_auth_passwordRecovery));
            Dialog dialogShowDialog = LoginActivity.this.showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }

        public void lambda$new$4(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3(this, tL_error, tLObject, 0));
        }

        public void lambda$new$5(AlertDialog alertDialog, int i) {
            LoginActivity.this.tryResetAccount(this.requestPhone, this.phoneHash, this.phoneCode);
        }

        public void lambda$new$6(Context context, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            if (!this.currentPassword.has_recovery) {
                AndroidUtilities.hideKeyboard(this.codeField);
                new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.RestorePasswordNoEmailText)).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new TodoItemMenu$$ExternalSyntheticLambda3(this, 2)).show();
            } else {
                LoginActivity.this.needShowProgress(0);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0(this, 0), 10);
            }
        }

        public void lambda$onNextPressed$10(TLRPC.TL_error tL_error, TLObject tLObject) {
            int i = 1;
            this.nextPressed = false;
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0(this, i), 8);
                return;
            }
            if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.showDoneButton(false, true);
                postDelayed(new PhotoViewer$$ExternalSyntheticLambda15(2, this, (TLRPC.TL_auth_authorization) tLObject), 150L);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                onPasscodeError(true);
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
            }
        }

        public void lambda$onNextPressed$11(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3(this, tL_error, tLObject, 2));
        }

        public void lambda$onNextPressed$12(String str) {
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = this.currentPassword.current_algo;
            boolean z = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
            byte[] x = z ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0 loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0 = new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0(this, 2);
            if (z) {
                TL_account.Password password = this.currentPassword;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (tL_inputCheckPasswordSRPStartCheck == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0.run(null, tL_error);
                } else {
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = tL_inputCheckPasswordSRPStartCheck;
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkPassword, loginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda0, 10);
                }
            }
        }

        public void lambda$onNextPressed$7(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                this.currentPassword = (TL_account.Password) tLObject;
                lambda$onNextPressed$16(null);
            }
        }

        public void lambda$onNextPressed$8(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPasswordView$$ExternalSyntheticLambda3(this, tL_error, tLObject, 1));
        }

        public void lambda$onNextPressed$9(TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(this.codeField);
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        public void lambda$onShow$13() {
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                LoginActivity.this.showKeyboard(this.codeField);
                this.lockImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                this.lockImageView.playAnimation();
            }
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            if (z) {
                this.codeField.setText("");
            }
            LoginActivity.this.onFieldError(this.outlineCodeField, true);
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            this.nextPressed = false;
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed || this.currentPassword == null) {
                return;
            }
            String string = this.codeField.getText().toString();
            if (string.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            Utilities.globalQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda15(1, this, string));
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(this, 3), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("passview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("passview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String string = this.codeField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("passview_code", string);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("passview_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            if (bundle.isEmpty()) {
                AndroidUtilities.hideKeyboard(this.codeField);
                return;
            }
            this.codeField.setText("");
            this.currentParams = bundle;
            String string = bundle.getString("password");
            this.passwordString = string;
            if (string != null) {
                SerializedData serializedData = new SerializedData(Utilities.hexToBytes(string));
                this.currentPassword = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            TL_account.Password password = this.currentPassword;
            if (password == null || TextUtils.isEmpty(password.hint)) {
                this.codeField.setHint((CharSequence) null);
            } else {
                this.codeField.setHint(this.currentPassword.hint);
            }
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.codeField.setTextColor(Theme.getColor(null, i, false));
            this.codeField.setCursorColor(Theme.getColor(null, i, false));
            this.codeField.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            this.cancelButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.outlineCodeField.updateColor();
        }
    }

    public class LoginActivityPhraseView extends SlideView {
        private String beginning;
        private final Runnable checkPasteRunnable;
        private final EditTextBoldCursor codeField;
        private int codeTime;
        private Timer codeTimer;
        private final TextView confirmTextView;
        private Bundle currentParams;
        private final int currentType;
        private final Runnable dismissField;
        private String emailPhone;
        private boolean errorShown;
        private final TextView errorTextView;
        private final LinearLayout fieldContainer;
        private boolean ignoreOnTextChange;
        private final RLottieImageView imageView;
        private final FrameLayout infoContainer;
        private final TextView infoTextView;
        private boolean isResendingCode;
        private double lastCodeTime;
        private double lastCurrentTime;
        private String lastError;
        private TLRPC.TL_auth_sentCode nextCodeAuth;
        private Bundle nextCodeParams;
        private boolean nextPressed;
        private int nextType;
        private int openTime;
        private final OutlineTextContainerView outlineField;
        private boolean pasteShown;
        private final TextView pasteTextView;
        private boolean pasted;
        private boolean pasting;
        private String phone;
        private String phoneHash;
        private int prevType;
        private final TextView prevTypeTextView;
        private String requestPhone;
        private float shiftDp;
        private int time;
        private final LoadingTextView timeText;
        private Timer timeTimer;
        private final Object timerSync;
        private final TextView titleTextView;
        private boolean waitingForEvent;

        public class AnonymousClass1 extends EditTextBoldCursor {
            final LoginActivity val$this$0;

            public AnonymousClass1(Context context, LoginActivity loginActivity) {
                super(context);
                this.val$this$0 = loginActivity;
            }

            public void lambda$onTextContextMenuItem$0() {
                LoginActivityPhraseView.this.pasting = false;
            }

            @Override
            public boolean onTextContextMenuItem(int i) {
                if (i == 16908322 || i == 16908337) {
                    LoginActivityPhraseView loginActivityPhraseView = LoginActivityPhraseView.this;
                    loginActivityPhraseView.pasting = loginActivityPhraseView.pasted = true;
                    postDelayed(new PhotoViewer$$ExternalSyntheticLambda60(this, 4), 1000L);
                }
                return super.onTextContextMenuItem(i);
            }
        }

        public class AnonymousClass4 extends TimerTask {
            public AnonymousClass4() {
            }

            public void lambda$run$0() {
                double dCurrentTimeMillis = System.currentTimeMillis();
                double d = dCurrentTimeMillis - LoginActivityPhraseView.this.lastCurrentTime;
                LoginActivityPhraseView.this.lastCurrentTime = dCurrentTimeMillis;
                LoginActivityPhraseView.access$18226(LoginActivityPhraseView.this, d);
                if (LoginActivityPhraseView.this.time >= 1000) {
                    int i = (LoginActivityPhraseView.this.time / 1000) / 60;
                    int i2 = (LoginActivityPhraseView.this.time / 1000) - (i * 60);
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 13.0f);
                    if (LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 11) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(R.string.CallAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                        return;
                    } else {
                        if (LoginActivityPhraseView.this.nextType == 2) {
                            LoginActivityPhraseView.this.timeText.setText(LocaleController.formatString(R.string.SmsAvailableIn2, Integer.valueOf(i), Integer.valueOf(i2)));
                            return;
                        }
                        return;
                    }
                }
                LoginActivityPhraseView.this.destroyTimer();
                if (LoginActivityPhraseView.this.nextType == 3 || LoginActivityPhraseView.this.nextType == 4 || LoginActivityPhraseView.this.nextType == 2 || LoginActivityPhraseView.this.nextType == 11) {
                    LoginActivityPhraseView.this.timeText.setTextSize(1, 15.0f);
                    if (LoginActivityPhraseView.this.nextType == 4) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.RequestCallButton));
                    } else if (LoginActivityPhraseView.this.nextType == 15) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (LoginActivityPhraseView.this.nextType == 11 || LoginActivityPhraseView.this.nextType == 3) {
                        LoginActivityPhraseView.this.timeText.setText(LocaleController.getString(R.string.RequestMissedCall));
                    } else {
                        LoginActivityPhraseView.this.timeText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.RequestAnotherSMS), true, 0.0f, 0.0f));
                    }
                    LoadingTextView loadingTextView = LoginActivityPhraseView.this.timeText;
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(null, i3, false));
                    LoginActivityPhraseView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i3));
                }
            }

            @Override
            public void run() {
                if (LoginActivityPhraseView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 5));
            }
        }

        public LoginActivityPhraseView(Context context, int i) {
            boolean z;
            super(context);
            this.pasteShown = true;
            this.errorShown = false;
            this.pasting = false;
            this.pasted = false;
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.checkPasteRunnable = new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6(this, 0);
            this.dismissField = new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6(this, 3);
            this.shiftDp = -3.0f;
            this.currentType = i;
            boolean z2 = i != 16;
            setOrientation(1);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.imageView = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            rLottieImageView.setAnimation(R.raw.bubble, 95, 95);
            if (AndroidUtilities.isSmallScreen()) {
                z = true;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    z = false;
                } else {
                    z = true;
                }
            }
            rLottieImageView.setVisibility(z ? 8 : 0);
            addView(rLottieImageView, LayoutHelper.createLinear(95, 95, 1, 0, 10, 0, 5));
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setTextSize(1, 18.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            textView.setGravity(49);
            textView.setText(LocaleController.getString(!z2 ? R.string.SMSWordTitle : R.string.SMSPhraseTitle));
            addView(textView, LayoutHelper.createLinear(-2, -2, 1, 8, z ? 25 : 0, 8, 0));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setGravity(1);
            textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(textView2, LayoutHelper.createLinear(-2, -2, 1, 8, 5, 8, 16));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.outlineField = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(!z2 ? R.string.SMSWord : R.string.SMSPhrase));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, LoginActivity.this);
            this.codeField = anonymousClass1;
            anonymousClass1.setSingleLine();
            anonymousClass1.setLines(1);
            anonymousClass1.setCursorSize(AndroidUtilities.dp(20.0f));
            anonymousClass1.setCursorWidth(1.5f);
            anonymousClass1.setImeOptions(268435461);
            anonymousClass1.setTextSize(1, 18.0f);
            anonymousClass1.setMaxLines(1);
            anonymousClass1.setBackground(null);
            anonymousClass1.setHint(LocaleController.getString(!z2 ? R.string.SMSWordHint : R.string.SMSPhraseHint));
            anonymousClass1.addTextChangedListener(new TextWatcher() {
                private boolean ignoreTextChange;
                private int trimmedLength;

                @Override
                public void afterTextChanged(Editable editable) {
                    if (this.ignoreTextChange) {
                        return;
                    }
                    LoginActivityPhraseView.this.checkPaste(true);
                    AndroidUtilities.cancelRunOnUIThread(LoginActivityPhraseView.this.dismissField);
                    LoginActivityPhraseView.this.animateError(false);
                    if (TextUtils.isEmpty(editable)) {
                        LoginActivityPhraseView.this.pasted = false;
                    }
                    if (LoginActivityPhraseView.this.beginsOk(editable.toString())) {
                        return;
                    }
                    LoginActivityPhraseView.this.onInputError(true);
                    this.ignoreTextChange = true;
                    boolean z3 = LoginActivityPhraseView.this.codeField.getSelectionEnd() >= LoginActivityPhraseView.this.codeField.getText().length();
                    if (!LoginActivityPhraseView.this.pasted) {
                        LoginActivityPhraseView.this.codeField.setText(LoginActivityPhraseView.this.beginning.substring(0, Utilities.clamp(this.trimmedLength, LoginActivityPhraseView.this.beginning.length(), 0)));
                        if (z3) {
                            LoginActivityPhraseView.this.codeField.setSelection(LoginActivityPhraseView.this.codeField.getText().length());
                        }
                    }
                    this.ignoreTextChange = false;
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    if (this.ignoreTextChange || charSequence == null || LoginActivityPhraseView.this.beginning == null) {
                        return;
                    }
                    this.trimmedLength = LoginActivityPhraseView.this.trimLeft(charSequence.toString()).length();
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
            anonymousClass1.setEllipsizeByGradient(true);
            anonymousClass1.setInputType(1);
            anonymousClass1.setTypeface(Typeface.DEFAULT);
            anonymousClass1.setGravity(LocaleController.isRTL ? 5 : 3);
            anonymousClass1.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 5));
            TextView textView3 = new TextView(context);
            this.pasteTextView = textView3;
            zzkb.m(12.0f, 1, textView3);
            textView3.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(10.0f, R.string.Paste, textView3), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((BaseFragment) LoginActivity.this).resourceProvider);
            textView3.setTextColor(color);
            int iDp = AndroidUtilities.dp(6.0f);
            int iMultAlpha = Theme.multAlpha(0.12f, color);
            int iMultAlpha2 = Theme.multAlpha(0.15f, color);
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, iMultAlpha, iMultAlpha2, iMultAlpha2));
            ScaleStateListAnimator.apply(textView3, 0.1f, 1.5f);
            anonymousClass1.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
            final int i2 = 0;
            textView3.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$3(view);
                            break;
                        default:
                            this.f$0.lambda$new$6(view);
                            break;
                    }
                }
            });
            outlineTextContainerView.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 119, 0.0f, 0.0f, 0.0f, 0.0f));
            outlineTextContainerView.attachEditText(anonymousClass1);
            outlineTextContainerView.addView(textView3, LayoutHelper.createFrame(-2, 26.0f, 21, 0.0f, 0.0f, 10.0f, 0.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.fieldContainer = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 1, 16, 3, 16, 0));
            anonymousClass1.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 7));
            FrameLayout frameLayout = new FrameLayout(context);
            this.infoContainer = frameLayout;
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            LoadingTextView loadingTextView = LoginActivity.this.new LoadingTextView(context);
            this.prevTypeTextView = loadingTextView;
            int i3 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView.setLinkTextColor(Theme.getColor(null, i3, false));
            loadingTextView.setTextColor(LoginActivity.this.getThemedColor(i3));
            loadingTextView.setTextSize(1, 14.0f);
            loadingTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            final int i4 = 1;
            loadingTextView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$3(view);
                            break;
                        default:
                            this.f$0.lambda$new$6(view);
                            break;
                    }
                }
            });
            addView(loadingTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            loadingTextView.setVisibility(8);
            TextView textView4 = new TextView(context);
            this.errorTextView = textView4;
            textView4.setPivotX(0.0f);
            textView4.setPivotY(0.0f);
            textView4.setText(LocaleController.getString(!z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
            textView4.setTextColor(LoginActivity.this.getThemedColor(Theme.key_text_RedRegular));
            textView4.setTextSize(1, 13.0f);
            frameLayout.addView(textView4, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            textView4.setAlpha(0.0f);
            textView4.setScaleX(0.8f);
            textView4.setScaleY(0.8f);
            textView4.setTranslationY(-AndroidUtilities.dp(4.0f));
            TextView textView5 = new TextView(context);
            this.infoTextView = textView5;
            textView5.setPivotX(0.0f);
            textView5.setPivotY(0.0f);
            textView5.setText(LocaleController.getString(!z2 ? R.string.SMSWordPasteHint : R.string.SMSPhrasePasteHint));
            textView5.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText));
            textView5.setTextSize(1, 13.0f);
            frameLayout.addView(textView5, LayoutHelper.createFrame(-1, -2.0f, 119, 16.0f, 8.0f, 16.0f, 8.0f));
            LoadingTextView loadingTextView2 = new LoadingTextView(context) {
                {
                    LoginActivity loginActivity = LoginActivity.this;
                }

                @Override
                public boolean isResendingCode() {
                    return LoginActivityPhraseView.this.isResendingCode;
                }

                @Override
                public boolean isRippleEnabled() {
                    if (getVisibility() == 0) {
                        return LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null;
                    }
                    return false;
                }
            };
            this.timeText = loadingTextView2;
            loadingTextView2.setLinkTextColor(Theme.getColor(null, i3, false));
            loadingTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            loadingTextView2.setTextSize(1, 15.0f);
            loadingTextView2.setGravity(19);
            final int i5 = 2;
            loadingTextView2.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityPhraseView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$3(view);
                            break;
                        default:
                            this.f$0.lambda$new$6(view);
                            break;
                    }
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(loadingTextView2, LayoutHelper.createFrame(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(loadingTextView2);
        }

        public static int access$18226(LoginActivityPhraseView loginActivityPhraseView, double d) {
            int i = (int) (((double) loginActivityPhraseView.time) - d);
            loginActivityPhraseView.time = i;
            return i;
        }

        public void animateError(boolean z) {
            this.errorShown = z;
            float f = 0.0f;
            float f2 = z ? 1.0f : 0.0f;
            this.outlineField.animateError(f2);
            float f3 = (f2 * 0.1f) + 0.9f;
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.errorTextView.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * AndroidUtilities.dp(-5.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            OKLCH.m(viewPropertyAnimatorTranslationY, cubicBezierInterpolator, 290L);
            if (this.pasteShown && !this.errorShown) {
                f = 1.0f;
            }
            float f4 = (0.1f * f) + 0.9f;
            this.infoTextView.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f)).setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
        }

        public boolean beginsOk(String str) {
            if (this.beginning == null) {
                return true;
            }
            String lowerCase = trimLeft(str).toLowerCase();
            String lowerCase2 = this.beginning.toLowerCase();
            int iMin = Math.min(lowerCase.length(), lowerCase2.length());
            if (iMin <= 0) {
                return true;
            }
            return TextUtils.equals(lowerCase.substring(0, iMin), lowerCase2.substring(0, iMin));
        }

        public void checkPaste(boolean z) {
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            boolean z2 = TextUtils.isEmpty(this.codeField.getText()) && clipboardManager != null && clipboardManager.hasPrimaryClip();
            if (this.pasteShown != z2) {
                this.pasteShown = z2;
                float f = 0.9f;
                float fDp = 0.0f;
                if (z) {
                    ViewPropertyAnimator viewPropertyAnimatorScaleY = this.pasteTextView.animate().alpha(z2 ? 1.0f : 0.0f).scaleX(z2 ? 1.0f : 0.7f).scaleY(z2 ? 1.0f : 0.7f);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    OKLCH.m(viewPropertyAnimatorScaleY, cubicBezierInterpolator, 300L);
                    ViewPropertyAnimator viewPropertyAnimatorScaleX = this.infoTextView.animate().scaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAlpha = viewPropertyAnimatorScaleX.scaleY(f).alpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    if (!this.pasteShown || this.errorShown) {
                        fDp = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    viewPropertyAnimatorAlpha.translationY(fDp).setInterpolator(cubicBezierInterpolator).setDuration(300L).start();
                } else {
                    this.pasteTextView.setAlpha(z2 ? 1.0f : 0.0f);
                    this.pasteTextView.setScaleX(z2 ? 1.0f : 0.7f);
                    this.pasteTextView.setScaleY(z2 ? 1.0f : 0.7f);
                    this.infoTextView.setScaleX((!this.pasteShown || this.errorShown) ? 0.9f : 1.0f);
                    TextView textView = this.infoTextView;
                    if (this.pasteShown && !this.errorShown) {
                        f = 1.0f;
                    }
                    textView.setScaleY(f);
                    this.infoTextView.setAlpha((!this.pasteShown || this.errorShown) ? 0.0f : 1.0f);
                    TextView textView2 = this.infoTextView;
                    if (!this.pasteShown || this.errorShown) {
                        fDp = AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f);
                    }
                    textView2.setTranslationY(fDp);
                }
            }
            AndroidUtilities.runOnUIThread(this.checkPasteRunnable, 5000L);
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass4(), 0L, 1000L);
        }

        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$new$0(View view, boolean z) {
            this.outlineField.animateSelection(z ? 1.0f : 0.0f);
        }

        public void lambda$new$1(View view) {
            CharSequence charSequenceCoerceToText;
            try {
                charSequenceCoerceToText = ((ClipboardManager) getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequenceCoerceToText = null;
            }
            if (charSequenceCoerceToText != null) {
                Editable text = this.codeField.getText();
                this.pasted = true;
                this.pasting = true;
                if (text != null) {
                    int iMax = Math.max(0, this.codeField.getSelectionStart());
                    text.replace(iMax, Math.max(iMax, this.codeField.getSelectionEnd()), charSequenceCoerceToText);
                }
                this.pasting = false;
            }
            checkPaste(true);
        }

        public boolean lambda$new$2(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$3(View view) {
            onBackPressed(true);
        }

        public void lambda$new$4(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
            String str;
            this.isResendingCode = false;
            this.timeText.invalidate();
            if (tLObject != null) {
                this.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                this.nextCodeAuth = tL_auth_sentCode;
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
            } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
            } else if (tL_error.code != -1000) {
                LoginActivity loginActivity = LoginActivity.this;
                String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                StringBuilder sb = new StringBuilder();
                zzko.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(tL_error.text);
                loginActivity.needShowAlert(string, sb.toString());
            }
            this.lastError = tL_error.text;
        }

        public void lambda$new$5(Bundle bundle, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5(this, tLObject, bundle, tL_error));
        }

        public void lambda$new$6(View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            if (this.time <= 0 || this.timeTimer == null) {
                Bundle bundle = this.nextCodeParams;
                if (bundle != null && (tL_auth_sentCode = this.nextCodeAuth) != null) {
                    LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
                    return;
                }
                int i = this.nextType;
                if (i != 4 && i != 2 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        this.waitingForEvent = false;
                        resendCode();
                        return;
                    }
                    return;
                }
                this.isResendingCode = true;
                this.timeText.invalidate();
                this.timeText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                this.timeText.setTextSize(1, 15.0f);
                int i2 = this.nextType;
                if (i2 == 4 || i2 == 11) {
                    this.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    this.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString("phone", this.phone);
                bundle2.putString("ephone", this.emailPhone);
                bundle2.putString("phoneFormated", this.requestPhone);
                bundle2.putInt("prevType", this.currentType);
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(this, bundle2, 0), 10);
            }
        }

        public void lambda$new$7() {
            checkPaste(true);
        }

        public void lambda$new$8() {
            animateError(false);
        }

        public void lambda$onNextPressed$10(TLRPC.TL_auth_signIn tL_auth_signIn, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(this, tL_error, tLObject, tL_auth_signIn, 1));
        }

        public void lambda$onNextPressed$11() {
            this.codeField.requestFocus();
            String str = this.beginning;
            if (str != null) {
                if (str.length() > 1) {
                    String string = this.codeField.getText().toString();
                    int length = this.beginning.length() + trimLeftLen(string);
                    this.codeField.setSelection(Utilities.clamp(length + ((length < 0 || length >= string.length() || string.charAt(length) != ' ') ? 0 : 1), string.length(), 0), this.codeField.getText().length());
                    return;
                }
            }
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }

        public void lambda$onNextPressed$12(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            LoginActivity.this.needHideProgress(false, true);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                destroyTimer();
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", this.requestPhone);
                    bundle.putString("phoneHash", this.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    LoginActivity.this.setPage(5, true, bundle, false);
                } else {
                    LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                }
            } else {
                String str = tL_error.text;
                this.lastError = str;
                if (!str.contains("SESSION_PASSWORD_NEEDED")) {
                    this.nextPressed = false;
                    if (this.currentType != 3) {
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        } else {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                onInputError(false);
                                this.codeField.post(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6(this, 1));
                                return;
                            }
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                onBackPressed(true);
                                LoginActivity.this.setPage(0, true, null, true);
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                        }
                        this.codeField.setText("");
                        this.codeField.requestFocus();
                        return;
                    }
                    return;
                }
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2(this, tL_auth_signIn, 1), 10);
                destroyTimer();
            }
            if (this.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public void lambda$onNextPressed$13(TLRPC.TL_auth_signIn tL_auth_signIn, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda1(this, tL_error, tLObject, tL_auth_signIn, 0));
        }

        public void lambda$onNextPressed$9(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public void lambda$onShow$16() {
            EditTextBoldCursor editTextBoldCursor = this.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.codeField);
            }
        }

        public void lambda$resendCode$14(TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            this.nextPressed = false;
            if (tL_error == null) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity loginActivity = LoginActivity.this;
                        String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        StringBuilder sb = new StringBuilder();
                        zzko.m(R.string.ErrorOccurred, "\n", sb);
                        sb.append(tL_error.text);
                        loginActivity.needShowAlert(string, sb.toString());
                    }
                }
            }
            LoginActivity.this.needHideProgress(false);
        }

        public void lambda$resendCode$15(Bundle bundle, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda5(this, tL_error, bundle, tLObject));
        }

        public void onInputError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeField.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            boolean z2 = this.currentType != 16;
            if (z) {
                this.errorTextView.setText(LocaleController.getString(!z2 ? R.string.SMSWordBeginningError : R.string.SMSPhraseBeginningError));
            } else if (TextUtils.isEmpty(this.codeField.getText())) {
                this.errorTextView.setText("");
            } else {
                this.errorTextView.setText(LocaleController.getString(!z2 ? R.string.SMSWordError : R.string.SMSPhraseError));
            }
            if (!this.errorShown && !this.pasted) {
                AndroidUtilities.shakeViewSpring(this.codeField, this.shiftDp);
                AndroidUtilities.shakeViewSpring(this.errorTextView, this.shiftDp);
            }
            AndroidUtilities.cancelRunOnUIThread(this.dismissField);
            animateError(true);
            AndroidUtilities.runOnUIThread(this.dismissField, 10000L);
            this.shiftDp = -this.shiftDp;
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.timeText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda0(this, bundle, 1), 10));
        }

        public String trimLeft(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
        }

        private int trimLeftLen(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return i;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            int i = this.prevType;
            if (i != 0) {
                LoginActivity.this.setPage(i, true, null, true);
                return false;
            }
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onHide() {
            super.onHide();
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            String string = this.codeField.getText().toString();
            if (string.length() == 0) {
                onInputError(false);
                return;
            }
            if (!beginsOk(string)) {
                onInputError(true);
                return;
            }
            this.nextPressed = true;
            TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.requestPhone;
            tL_auth_signIn.phone_code = string;
            tL_auth_signIn.phone_code_hash = this.phoneHash;
            tL_auth_signIn.flags |= 1;
            LoginActivity.this.needShowProgress(LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_signIn, new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda2(this, tL_auth_signIn, 0), 10), true);
            LoginActivity.this.showDoneButton(true, true);
        }

        @Override
        public void onResume() {
            super.onResume();
            checkPaste(true);
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityPhraseView$$ExternalSyntheticLambda6(this, 2), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_word" + this.currentType, this.currentParams);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            int i;
            int i2 = 4;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                this.timeText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                int i3 = this.nextType;
                if (i3 == 17) {
                    i = R.string.ReturnEnteringPhrase;
                } else if (i3 == 16) {
                    i = R.string.ReturnEnteringWord;
                } else {
                    i = i3 == 3 ? R.string.ReturnPhoneCall : R.string.ReturnEnteringSMS;
                }
                this.timeText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                return;
            }
            this.codeField.setText("");
            this.currentParams = bundle;
            this.beginning = null;
            this.nextType = bundle.getInt("nextType");
            this.prevType = bundle.getInt("prevType", 0);
            this.emailPhone = bundle.getString("ephone");
            if (this.currentParams.containsKey("beginning")) {
                this.beginning = this.currentParams.getString("beginning");
            }
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phone = this.currentParams.getString("phone");
            this.time = bundle.getInt("timeout");
            int i4 = this.prevType;
            if (i4 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i4 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i4 == 1 || i4 == 2 || i4 == 4 || i4 == 3 || i4 == 15) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringCode), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.nextPressed = false;
            this.isResendingCode = false;
            LoginActivity.this.isRequestingFirebaseSms = false;
            this.timeText.invalidate();
            boolean z2 = this.currentType != 16;
            String str = "+" + PhoneFormat.getInstance().format(PhoneFormat.stripExceptNumbers(this.phone, false));
            String str2 = this.beginning;
            if (str2 == null) {
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(!z2 ? R.string.SMSWordText : R.string.SMSPhraseText, new Object[]{str}, this.confirmTextView);
            } else {
                ArticleViewer$ErrorContainer$$ExternalSyntheticOutline0.m(!z2 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, new Object[]{str, str2}, this.confirmTextView);
            }
            LoginActivity.this.showKeyboard(this.codeField);
            this.codeField.requestFocus();
            if (this.imageView.getAnimatedDrawable() != null) {
                this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            }
            RLottieImageView rLottieImageView = this.imageView;
            Objects.requireNonNull(rLottieImageView);
            AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(rLottieImageView, i2), 500L);
            checkPaste(false);
            animateError(false);
            this.lastCurrentTime = System.currentTimeMillis();
            this.timeText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false));
            int i5 = this.nextType;
            if (i5 == 2 || i5 == 4 || i5 == 3) {
                createTimer();
            } else {
                this.timeText.setVisibility(8);
            }
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleTextView;
            LoginActivity loginActivity = LoginActivity.this;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(loginActivity.getThemedColor(i));
            this.confirmTextView.setTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.codeField.setTextColor(LoginActivity.this.getThemedColor(i));
            this.codeField.setCursorColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
            this.codeField.setHintTextColor(LoginActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteHintText));
            this.outlineField.updateColor();
        }
    }

    public class LoginActivityRecoverView extends SlideView {
        private CodeFieldContainer codeFieldContainer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private Runnable errorColorTimeout;
        private RLottieImageView inboxImageView;
        private boolean nextPressed;
        private String passwordString;
        private String phoneCode;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String requestPhone;
        private TextView titleView;
        private TextView troubleButton;

        public LoginActivityRecoverView(Context context) {
            int i;
            super(context);
            this.errorColorTimeout = new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 1);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(R.string.EnterCode));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.confirmTextView = textView2;
            textView2.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.confirmTextView.setText(LocaleController.getString(R.string.RestoreEmailSentInfo));
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                @Override
                public void processNextPressed() {
                    LoginActivityRecoverView.this.lambda$onNextPressed$16(null);
                }
            };
            this.codeFieldContainer = codeFieldContainer;
            codeFieldContainer.setNumbersCount(6, 1);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                codeNumberField.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        if (LoginActivityRecoverView.this.postedErrorColorTimeout) {
                            LoginActivityRecoverView loginActivityRecoverView = LoginActivityRecoverView.this;
                            loginActivityRecoverView.removeCallbacks(loginActivityRecoverView.errorColorTimeout);
                            LoginActivityRecoverView.this.errorColorTimeout.run();
                        }
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }
                });
                codeNumberField.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 6));
            }
            addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, false, null);
            this.troubleButton = spoilersTextView;
            spoilersTextView.setGravity(17);
            this.troubleButton.setTextSize(1, 14.0f);
            this.troubleButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.troubleButton.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.troubleButton.setMaxLines(2);
            this.troubleButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 20));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(this.troubleButton, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, 0, 1.0f));
            VerticalPositionAutoAnimator.attach(this.troubleButton);
        }

        public void lambda$new$0() {
            int i = 0;
            this.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public void lambda$new$1(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        public void lambda$new$2(AlertDialog alertDialog, int i) {
            LoginActivity.this.setPage(6, true, new Bundle(), true);
        }

        public void lambda$new$3(AlertDialog alertDialog, int i) {
            LoginActivity.this.tryResetAccount(this.requestPhone, this.phoneHash, this.phoneCode);
        }

        public void lambda$new$4(View view) {
            final int i = 0;
            final int i2 = 1;
            Dialog dialogShowDialog = LoginActivity.this.showDialog(new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null).setTitle(LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener(this) {
                public final LoginActivity.LoginActivityRecoverView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$2(alertDialog, i3);
                            break;
                        default:
                            this.f$0.lambda$new$3(alertDialog, i3);
                            break;
                    }
                }
            }).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener(this) {
                public final LoginActivity.LoginActivityRecoverView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(AlertDialog alertDialog, int i3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$2(alertDialog, i3);
                            break;
                        default:
                            this.f$0.lambda$new$3(alertDialog, i3);
                            break;
                    }
                }
            }).create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }

        public void lambda$onNextPressed$7(TLObject tLObject, String str, TLRPC.TL_error tL_error) {
            LoginActivity.this.needHideProgress(false);
            this.nextPressed = false;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", str);
                bundle.putString("password", this.passwordString);
                LoginActivity.this.setPage(9, true, bundle, false);
                return;
            }
            if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
                onPasscodeError(true);
            } else if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            } else {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, iIntValue < 60 ? LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]) : LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0])));
            }
        }

        public void lambda$onNextPressed$8(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(5, this, tLObject, str, tL_error));
        }

        public void lambda$onPasscodeError$5() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public void lambda$onPasscodeError$6() {
            postDelayed(new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 3), 150L);
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 3000L);
            this.postedErrorColorTimeout = true;
        }

        public void lambda$onShow$9() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.codeField[0].requestFocus();
            }
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setText("");
                }
            }
            for (CodeNumberField codeNumberField2 : this.codeFieldContainer.codeField) {
                codeNumberField2.animateErrorProgress(1.0f);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 2));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
        }

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            codeFieldContainer.isFocusSuppressed = true;
            for (CodeNumberField codeNumberField : codeFieldContainer.codeField) {
                codeNumberField.animateFocusedProgress(0.0f);
            }
            String code = this.codeFieldContainer.getCode();
            if (code.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
            tL_auth_checkRecoveryPassword.code = code;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new LinkManager$$ExternalSyntheticLambda15(2, this, code), 10);
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityRecoverView$$ExternalSyntheticLambda0(this, 0), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("recoveryview_code");
            if (string != null) {
                this.codeFieldContainer.setText(string);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code != null && code.length() != 0) {
                bundle.putString("recoveryview_code", code);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("recoveryview_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.codeFieldContainer.setText("");
            this.currentParams = bundle;
            this.passwordString = bundle.getString("password");
            this.requestPhone = this.currentParams.getString("requestPhone");
            this.phoneHash = this.currentParams.getString("phoneHash");
            this.phoneCode = this.currentParams.getString("phoneCode");
            String string = this.currentParams.getString("email_unconfirmed_pattern");
            SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i = iLastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i, 0);
            }
            this.troubleButton.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailNoAccess), spannableStringBuilderValueOf));
            LoginActivity.this.showKeyboard(this.codeFieldContainer);
            this.codeFieldContainer.requestFocus();
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.troubleButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.codeFieldContainer.invalidate();
        }
    }

    public class LoginActivityRegisterView extends SlideView implements ImageUpdater.ImageUpdaterDelegate {
        private TLRPC.FileLocation avatar;
        private AnimatorSet avatarAnimation;
        private TLRPC.FileLocation avatarBig;
        private AvatarDrawable avatarDrawable;
        private RLottieImageView avatarEditor;
        private BackupImageView avatarImage;
        private View avatarOverlay;
        private RadialProgressView avatarProgressView;
        private RLottieDrawable cameraDrawable;
        private RLottieDrawable cameraWaitDrawable;
        private boolean createAfterUpload;
        private Bundle currentParams;
        private TextView descriptionTextView;
        private FrameLayout editTextContainer;
        private EditTextBoldCursor firstNameField;
        private OutlineTextContainerView firstNameOutlineView;
        private ImageUpdater imageUpdater;
        private boolean isCameraWaitAnimationAllowed;
        private EditTextBoldCursor lastNameField;
        private OutlineTextContainerView lastNameOutlineView;
        private boolean nextPressed;
        private String phoneHash;
        private TextView privacyView;
        private String requestPhone;
        private TextView titleTextView;
        private TextView wrongNumber;

        public class AnonymousClass4 implements View.OnAttachStateChangeListener {
            private boolean isAttached;
            final LoginActivity val$this$0;
            private long lastRun = System.currentTimeMillis();
            private Runnable cameraWaitCallback = new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(this, 2);

            public AnonymousClass4(LoginActivity loginActivity) {
                this.val$this$0 = loginActivity;
            }

            public void lambda$$0() {
                LoginActivityRegisterView.this.cameraDrawable.setCurrentFrame(0, false);
                LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraDrawable);
            }

            public void lambda$$1() {
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(this, 0));
            }

            public void lambda$$2() {
                if (this.isAttached) {
                    if (LoginActivityRegisterView.this.isCameraWaitAnimationAllowed && System.currentTimeMillis() - this.lastRun >= 10000) {
                        LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraWaitDrawable);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setCurrentFrame(0, false);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setOnAnimationEndListener(new LoginActivity$LoginActivityRegisterView$4$$ExternalSyntheticLambda0(this, 1));
                        LoginActivityRegisterView.this.avatarEditor.playAnimation();
                        this.lastRun = System.currentTimeMillis();
                    }
                    LoginActivityRegisterView.this.avatarEditor.postDelayed(this.cameraWaitCallback, 1000L);
                }
            }

            @Override
            public void onViewAttachedToWindow(View view) {
                this.isAttached = true;
                view.post(this.cameraWaitCallback);
            }

            @Override
            public void onViewDetachedFromWindow(View view) {
                this.isAttached = false;
                view.removeCallbacks(this.cameraWaitCallback);
            }
        }

        public class LinkSpan extends ClickableSpan {
            public LinkSpan() {
            }

            @Override
            public void onClick(View view) {
                LoginActivityRegisterView.this.showTermsOfService(false);
            }

            @Override
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
            }
        }

        public LoginActivityRegisterView(Context context) {
            super(context);
            this.nextPressed = false;
            this.isCameraWaitAnimationAllowed = true;
            setOrientation(1);
            ImageUpdater imageUpdater = new ImageUpdater(false, 0, false);
            this.imageUpdater = imageUpdater;
            imageUpdater.setOpenWithFrontfaceCamera(true);
            this.imageUpdater.setSearchAvailable(false);
            this.imageUpdater.setUploadAfterSelect(false);
            ImageUpdater imageUpdater2 = this.imageUpdater;
            imageUpdater2.parentFragment = LoginActivity.this;
            imageUpdater2.setDelegate(this);
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createLinear(78, 78, 1));
            this.avatarDrawable = new AvatarDrawable();
            BackupImageView backupImageView = new BackupImageView(context) {
                @Override
                public void invalidate() {
                    if (LoginActivityRegisterView.this.avatarOverlay != null) {
                        LoginActivityRegisterView.this.avatarOverlay.invalidate();
                    }
                    super.invalidate();
                }

                @Override
                public void invalidate(int i, int i2, int i3, int i4) {
                    if (LoginActivityRegisterView.this.avatarOverlay != null) {
                        LoginActivityRegisterView.this.avatarOverlay.invalidate();
                    }
                    super.invalidate(i, i2, i3, i4);
                }
            };
            this.avatarImage = backupImageView;
            backupImageView.setRoundRadius(AndroidUtilities.dp(64.0f));
            this.avatarDrawable.setAvatarType(13);
            this.avatarDrawable.setInfo(5L, null, null);
            this.avatarImage.setImageDrawable(this.avatarDrawable);
            frameLayout.addView(this.avatarImage, LayoutHelper.createFrame(-1, -1.0f));
            final Paint paint = new Paint(1);
            paint.setColor(1426063360);
            View view = new View(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    if (LoginActivityRegisterView.this.avatarImage == null || LoginActivityRegisterView.this.avatarProgressView.getVisibility() != 0) {
                        return;
                    }
                    paint.setAlpha((int) (LoginActivityRegisterView.this.avatarProgressView.getAlpha() * LoginActivityRegisterView.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            this.avatarOverlay = view;
            frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
            final int i = 0;
            this.avatarOverlay.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$7(view2);
                            break;
                        default:
                            this.f$0.lambda$new$12(view2);
                            break;
                    }
                }
            });
            int i2 = R.raw.camera;
            this.cameraDrawable = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            int i3 = R.raw.camera_wait;
            this.cameraWaitDrawable = new RLottieDrawable(i3, String.valueOf(i3), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context) {
                @Override
                public void invalidate(int i4, int i5, int i6, int i7) {
                    super.invalidate(i4, i5, i6, i7);
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }

                @Override
                public void invalidate() {
                    super.invalidate();
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }
            };
            this.avatarEditor = rLottieImageView;
            rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.avatarEditor.setEnabled(false);
            this.avatarEditor.setClickable(false);
            frameLayout.addView(this.avatarEditor, LayoutHelper.createFrame(-1, -1.0f));
            this.avatarEditor.addOnAttachStateChangeListener(new AnonymousClass4(LoginActivity.this));
            RadialProgressView radialProgressView = new RadialProgressView(context) {
                @Override
                public void setAlpha(float f) {
                    super.setAlpha(f);
                    LoginActivityRegisterView.this.avatarOverlay.invalidate();
                }
            };
            this.avatarProgressView = radialProgressView;
            radialProgressView.setSize(AndroidUtilities.dp(30.0f));
            this.avatarProgressView.setProgressColor(-1);
            frameLayout.addView(this.avatarProgressView, LayoutHelper.createFrame(-1, -1.0f));
            showAvatarProgress(false, false);
            TextView textView = new TextView(context);
            this.titleTextView = textView;
            textView.setText(LocaleController.getString(R.string.RegistrationProfileInfo));
            this.titleTextView.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(1);
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 12, 8, 0));
            TextView textView2 = new TextView(context);
            this.descriptionTextView = textView2;
            textView2.setText(LocaleController.getString("RegisterText2", R.string.RegisterText2));
            this.descriptionTextView.setGravity(1);
            this.descriptionTextView.setTextSize(1, 14.0f);
            this.descriptionTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.descriptionTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.editTextContainer = frameLayout2;
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 8.0f, 21.0f, 8.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.firstNameOutlineView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(R.string.FirstName));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.firstNameField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            this.firstNameField.setCursorWidth(1.5f);
            this.firstNameField.setImeOptions(268435461);
            this.firstNameField.setTextSize(1, 17.0f);
            this.firstNameField.setMaxLines(1);
            this.firstNameField.setInputType(8192);
            final int i4 = 0;
            this.firstNameField.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onFocusChange(View view2, boolean z) {
                    switch (i4) {
                        case 0:
                            this.f$0.lambda$new$8(view2, z);
                            break;
                        default:
                            this.f$0.lambda$new$10(view2, z);
                            break;
                    }
                }
            });
            this.firstNameField.setBackground(null);
            this.firstNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.firstNameOutlineView.attachEditText(this.firstNameField);
            this.firstNameOutlineView.addView(this.firstNameField, LayoutHelper.createFrame(-1, -2, 48));
            final int i5 = 0;
            this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i6, KeyEvent keyEvent) {
                    switch (i5) {
                        case 0:
                            return this.f$0.lambda$new$9(textView3, i6, keyEvent);
                        default:
                            return this.f$0.lambda$new$11(textView3, i6, keyEvent);
                    }
                }
            });
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.lastNameOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.setText(LocaleController.getString(R.string.LastName));
            EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
            this.lastNameField = editTextBoldCursor2;
            editTextBoldCursor2.setCursorSize(AndroidUtilities.dp(20.0f));
            this.lastNameField.setCursorWidth(1.5f);
            this.lastNameField.setImeOptions(268435462);
            this.lastNameField.setTextSize(1, 17.0f);
            this.lastNameField.setMaxLines(1);
            this.lastNameField.setInputType(8192);
            final int i6 = 1;
            this.lastNameField.setOnFocusChangeListener(new View.OnFocusChangeListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onFocusChange(View view2, boolean z) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$new$8(view2, z);
                            break;
                        default:
                            this.f$0.lambda$new$10(view2, z);
                            break;
                    }
                }
            });
            this.lastNameField.setBackground(null);
            this.lastNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.lastNameOutlineView.attachEditText(this.lastNameField);
            this.lastNameOutlineView.addView(this.lastNameField, LayoutHelper.createFrame(-1, -2, 48));
            final int i7 = 1;
            this.lastNameField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i8, KeyEvent keyEvent) {
                    switch (i7) {
                        case 0:
                            return this.f$0.lambda$new$9(textView3, i8, keyEvent);
                        default:
                            return this.f$0.lambda$new$11(textView3, i8, keyEvent);
                    }
                }
            });
            buildEditTextLayout(AndroidUtilities.isSmallScreen());
            TextView textView3 = new TextView(context);
            this.wrongNumber = textView3;
            textView3.setText(LocaleController.getString("CancelRegistration", R.string.CancelRegistration));
            this.wrongNumber.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            this.wrongNumber.setTextSize(1, 14.0f);
            this.wrongNumber.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongNumber.setPadding(0, AndroidUtilities.dp(24.0f), 0, 0);
            this.wrongNumber.setVisibility(8);
            addView(this.wrongNumber, LayoutHelper.createLinear(-2, -2, (LocaleController.isRTL ? 5 : 3) | 48, 0, 20, 0, 0));
            final int i8 = 1;
            this.wrongNumber.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivityRegisterView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i8) {
                        case 0:
                            this.f$0.lambda$new$7(view2);
                            break;
                        default:
                            this.f$0.lambda$new$12(view2);
                            break;
                    }
                }
            });
            FrameLayout frameLayout3 = new FrameLayout(context);
            addView(frameLayout3, LayoutHelper.createLinear(-1, -1, 83));
            TextView textView4 = new TextView(context);
            this.privacyView = textView4;
            textView4.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
            this.privacyView.setTextSize(1, AndroidUtilities.isSmallScreen() ? 13.0f : 14.0f);
            this.privacyView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.privacyView.setGravity(16);
            frameLayout3.addView(this.privacyView, LayoutHelper.createFrame(-2, 56.0f, 83, 14.0f, 0.0f, 70.0f, 32.0f));
            VerticalPositionAutoAnimator.attach(this.privacyView);
            String string = LocaleController.getString("TermsOfServiceLogin", R.string.TermsOfServiceLogin);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != -1 && iLastIndexOf != -1 && iIndexOf != iLastIndexOf) {
                spannableStringBuilder.replace(iLastIndexOf, iLastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new LinkSpan(), iIndexOf, iLastIndexOf - 1, 33);
            }
            this.privacyView.setText(spannableStringBuilder);
        }

        private void buildEditTextLayout(boolean z) {
            boolean zHasFocus = this.firstNameField.hasFocus();
            boolean zHasFocus2 = this.lastNameField.hasFocus();
            this.editTextContainer.removeAllViews();
            if (!z) {
                this.firstNameOutlineView.setText(LocaleController.getString(R.string.FirstName));
                this.lastNameOutlineView.setText(LocaleController.getString(R.string.LastName));
                this.editTextContainer.addView(this.firstNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
                this.editTextContainer.addView(this.lastNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
                return;
            }
            LinearLayout linearLayout = new LinearLayout(LoginActivity.this.getParentActivity());
            linearLayout.setOrientation(0);
            this.firstNameOutlineView.setText(LocaleController.getString(R.string.FirstNameSmall));
            this.lastNameOutlineView.setText(LocaleController.getString(R.string.LastNameSmall));
            linearLayout.addView(this.firstNameOutlineView, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 8, 0));
            linearLayout.addView(this.lastNameOutlineView, LayoutHelper.createLinear(0, -2, 1.0f, 8, 0, 0, 0));
            this.editTextContainer.addView(linearLayout);
            if (zHasFocus) {
                this.firstNameField.requestFocus();
                AndroidUtilities.showKeyboard(this.firstNameField);
            } else if (zHasFocus2) {
                this.lastNameField.requestFocus();
                AndroidUtilities.showKeyboard(this.lastNameField);
            }
        }

        private void hidePrivacyView() {
            this.privacyView.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
        }

        public void lambda$didUploadPhoto$13(TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            TLRPC.FileLocation fileLocation = photoSize.location;
            this.avatar = fileLocation;
            this.avatarBig = photoSize2.location;
            this.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", this.avatarDrawable, (Object) null);
        }

        public void lambda$new$10(View view, boolean z) {
            this.lastNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        public boolean lambda$new$11(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6 && i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$12(View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            onBackPressed(false);
        }

        public void lambda$new$4() {
            this.avatar = null;
            this.avatarBig = null;
            showAvatarProgress(false, true);
            this.avatarImage.setImage((ImageLocation) null, (String) null, this.avatarDrawable, (Object) null);
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.cameraDrawable.setCurrentFrame(0);
            this.isCameraWaitAnimationAllowed = true;
        }

        public void lambda$new$5() {
            this.isCameraWaitAnimationAllowed = true;
        }

        public void lambda$new$6(DialogInterface dialogInterface) {
            if (this.imageUpdater.isUploadingImage()) {
                this.avatarEditor.setAnimation(this.cameraDrawable);
                this.cameraDrawable.setCurrentFrame(0, false);
                this.isCameraWaitAnimationAllowed = true;
            } else {
                this.avatarEditor.setAnimation(this.cameraDrawable);
                this.cameraDrawable.setCustomEndFrame(86);
                this.avatarEditor.setOnAnimationEndListener(new LoginActivity$$ExternalSyntheticLambda16(this, 1));
                this.avatarEditor.playAnimation();
            }
        }

        public void lambda$new$7(View view) {
            this.imageUpdater.openMenu(this.avatar != null, new LoginActivity$$ExternalSyntheticLambda16(this, 2), new OAuthSheet$$ExternalSyntheticLambda18(this, 9), 0);
            this.isCameraWaitAnimationAllowed = false;
            this.avatarEditor.setAnimation(this.cameraDrawable);
            this.cameraDrawable.setCurrentFrame(0);
            this.cameraDrawable.setCustomEndFrame(43);
            this.avatarEditor.playAnimation();
        }

        public void lambda$new$8(View view, boolean z) {
            this.firstNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        public boolean lambda$new$9(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            this.lastNameField.requestFocus();
            return true;
        }

        public void lambda$onBackPressed$14(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            hidePrivacyView();
        }

        public void lambda$onNextPressed$16(TLRPC.FileLocation fileLocation) {
            MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).uploadAndApplyUserAvatar(fileLocation);
        }

        public void lambda$onNextPressed$17(TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView.findFocus());
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject, true);
            TLRPC.FileLocation fileLocation = this.avatarBig;
            if (fileLocation != null) {
                Utilities.cacheClearQueue.postRunnable(new PhotoViewer$$ExternalSyntheticLambda15(3, this, fileLocation));
            }
        }

        public void lambda$onNextPressed$18(TLObject tLObject, TLRPC.TL_error tL_error) {
            this.nextPressed = false;
            if (tLObject instanceof TLRPC.TL_auth_authorization) {
                hidePrivacyView();
                LoginActivity.this.showDoneButton(false, true);
                postDelayed(new PhotoViewer$$ExternalSyntheticLambda15(4, this, (TLRPC.TL_auth_authorization) tLObject), 150L);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                return;
            }
            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                return;
            }
            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
            } else if (tL_error.text.contains("FIRSTNAME_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
            } else if (tL_error.text.contains("LASTNAME_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
            } else {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            }
        }

        public void lambda$onNextPressed$19(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, tL_error, 6));
        }

        public void lambda$onShow$15() {
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.firstNameField);
            }
        }

        public void lambda$showTermsOfService$0(AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            lambda$onNextPressed$16(null);
        }

        public void lambda$showTermsOfService$1(AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            lambda$onNextPressed$16(null);
        }

        public void lambda$showTermsOfService$2(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
        }

        public void lambda$showTermsOfService$3(AlertDialog alertDialog, int i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            builder.setMessage(LocaleController.getString("TosDecline", R.string.TosDecline));
            builder.setPositiveButton(LocaleController.getString("SignUp", R.string.SignUp), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 0));
            builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 1));
            LoginActivity.this.showDialog(builder.create());
        }

        private void showAvatarProgress(final boolean z, boolean z2) {
            if (this.avatarEditor == null) {
                return;
            }
            AnimatorSet animatorSet = this.avatarAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.avatarAnimation = null;
            }
            if (z2) {
                this.avatarAnimation = new AnimatorSet();
                Property property = View.ALPHA;
                if (z) {
                    this.avatarProgressView.setVisibility(0);
                    this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarEditor, (Property<RLottieImageView, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 1.0f));
                } else {
                    this.avatarEditor.setVisibility(0);
                    this.avatarAnimation.playTogether(ObjectAnimator.ofFloat(this.avatarEditor, (Property<RLottieImageView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.avatarProgressView, (Property<RadialProgressView, Float>) property, 0.0f));
                }
                this.avatarAnimation.setDuration(180L);
                this.avatarAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animator) {
                        LoginActivityRegisterView.this.avatarAnimation = null;
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (LoginActivityRegisterView.this.avatarAnimation == null || LoginActivityRegisterView.this.avatarEditor == null) {
                            return;
                        }
                        if (z) {
                            LoginActivityRegisterView.this.avatarEditor.setVisibility(4);
                        } else {
                            LoginActivityRegisterView.this.avatarProgressView.setVisibility(4);
                        }
                        LoginActivityRegisterView.this.avatarAnimation = null;
                    }
                });
                this.avatarAnimation.start();
                return;
            }
            if (z) {
                this.avatarEditor.setAlpha(1.0f);
                this.avatarEditor.setVisibility(4);
                this.avatarProgressView.setAlpha(1.0f);
                this.avatarProgressView.setVisibility(0);
                return;
            }
            this.avatarEditor.setAlpha(1.0f);
            this.avatarEditor.setVisibility(0);
            this.avatarProgressView.setAlpha(0.0f);
            this.avatarProgressView.setVisibility(4);
        }

        public void showTermsOfService(boolean z) {
            if (LoginActivity.this.currentTermsOfService == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            if (z) {
                builder.setPositiveButton(LocaleController.getString("Accept", R.string.Accept), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 3));
                builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 4));
            } else {
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LoginActivity.this.currentTermsOfService.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, LoginActivity.this.currentTermsOfService.entities, false, false, false, false);
            builder.setMessage(spannableStringBuilder);
            LoginActivity.this.showDialog(builder.create());
        }

        @Override
        public final boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public final void didStartUpload(boolean z, boolean z2) {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z, z2);
        }

        @Override
        public final void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, photoSize2, photoSize, 7));
        }

        @Override
        public final PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourName", R.string.YourName);
        }

        @Override
        public final String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            if (z) {
                LoginActivity.this.needHideProgress(true);
                this.nextPressed = false;
                this.currentParams = null;
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.Warning));
            builder.setMessage(LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration));
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new LoginActivity$LoginActivityRegisterView$$ExternalSyntheticLambda0(this, 2));
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            LoginActivity.this.showDialog(builder.create());
            return false;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            if (LoginActivity.this.currentTermsOfService != null && LoginActivity.this.currentTermsOfService.popup) {
                showTermsOfService(true);
                return;
            }
            if (this.firstNameField.length() == 0) {
                LoginActivity.this.onFieldError(this.firstNameOutlineView, true);
                return;
            }
            this.nextPressed = true;
            TLRPC.TL_auth_signUp tL_auth_signUp = new TLRPC.TL_auth_signUp();
            tL_auth_signUp.phone_code_hash = this.phoneHash;
            tL_auth_signUp.phone_number = this.requestPhone;
            tL_auth_signUp.first_name = this.firstNameField.getText().toString();
            tL_auth_signUp.last_name = this.lastNameField.getText().toString();
            LoginActivity.this.needShowProgress(0);
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signUp, new LinkManager$$ExternalSyntheticLambda10(this, 13), 10);
        }

        @Override
        public void onShow() {
            super.onShow();
            if (this.privacyView != null) {
                if (LoginActivity.this.restoringState) {
                    this.privacyView.setAlpha(1.0f);
                } else {
                    this.privacyView.setAlpha(0.0f);
                    this.privacyView.animate().alpha(1.0f).setDuration(200L).setStartDelay(300L).setInterpolator(AndroidUtilities.decelerateInterpolator).start();
                }
            }
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = this.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(this.firstNameField);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda16(this, 3), LoginActivity.SHOW_DELAY);
        }

        @Override
        public final void onUploadProgressChanged(float f) {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            byte[] bArrDecode;
            Bundle bundle2 = bundle.getBundle("registerview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            try {
                String string = bundle.getString("terms");
                if (string != null && (bArrDecode = Base64.decode(string, 0)) != null) {
                    SerializedData serializedData = new SerializedData(bArrDecode);
                    LoginActivity.this.currentTermsOfService = TLRPC.TL_help_termsOfService.TLdeserialize(serializedData, serializedData.readInt32(false), false);
                    serializedData.cleanup();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            String string2 = bundle.getString("registerview_first");
            if (string2 != null) {
                this.firstNameField.setText(string2);
            }
            String string3 = bundle.getString("registerview_last");
            if (string3 != null) {
                this.lastNameField.setText(string3);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String string = this.firstNameField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("registerview_first", string);
            }
            String string2 = this.lastNameField.getText().toString();
            if (string2.length() != 0) {
                bundle.putString("registerview_last", string2);
            }
            if (LoginActivity.this.currentTermsOfService != null) {
                SerializedData serializedData = new SerializedData(LoginActivity.this.currentTermsOfService.getObjectSize());
                LoginActivity.this.currentTermsOfService.serializeToStream(serializedData);
                bundle.putString("terms", Base64.encodeToString(serializedData.toByteArray(), 0));
                serializedData.cleanup();
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("registerview_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.firstNameField.setText("");
            this.lastNameField.setText("");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.currentParams = bundle;
        }

        @Override
        public final boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
        }

        @Override
        public void updateColors() {
            this.avatarDrawable.invalidateSelf();
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            TextView textView2 = this.descriptionTextView;
            int i2 = Theme.key_windowBackgroundWhiteGrayText6;
            textView2.setTextColor(Theme.getColor(null, i2, false));
            this.firstNameField.setTextColor(Theme.getColor(null, i, false));
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            int i3 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            editTextBoldCursor.setCursorColor(Theme.getColor(null, i3, false));
            this.lastNameField.setTextColor(Theme.getColor(null, i, false));
            this.lastNameField.setCursorColor(Theme.getColor(null, i3, false));
            this.wrongNumber.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.privacyView.setTextColor(Theme.getColor(null, i2, false));
            this.privacyView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            this.firstNameOutlineView.updateColor();
            this.lastNameOutlineView.updateColor();
        }
    }

    public class LoginActivityResetWaitView extends SlideView {
        private TextView confirmTextView;
        private Bundle currentParams;
        private String phoneCode;
        private String phoneHash;
        private String requestPhone;
        private TextView resetAccountButton;
        private TextView resetAccountText;
        private TextView resetAccountTime;
        private int startTime;
        private Runnable timeRunnable;
        private TextView titleView;
        private RLottieImageView waitImageView;
        private int waitTime;
        private Boolean wasResetButtonActive;

        public LoginActivityResetWaitView(Context context) {
            super(context);
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.waitImageView = rLottieImageView;
            rLottieImageView.setAutoRepeat(true);
            this.waitImageView.setAnimation(R.raw.sandclock, 120, 120);
            frameLayout.addView(this.waitImageView, LayoutHelper.createFrame(120, 120, 1));
            Point point = AndroidUtilities.displaySize;
            frameLayout.setVisibility((point.x <= point.y || AndroidUtilities.isTablet()) ? 0 : 8);
            linearLayout.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            TextView textView2 = this.titleView;
            int i = R.string.ResetAccount;
            textView2.setText(LocaleController.getString(i));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            TextView textView3 = new TextView(context);
            this.confirmTextView = textView3;
            textView3.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            linearLayout.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 12, 8, 12, 0));
            addView(linearLayout, LayoutHelper.createLinear(-1, 0, 1.0f));
            TextView textView4 = new TextView(context);
            this.resetAccountText = textView4;
            textView4.setGravity(1);
            this.resetAccountText.setText(LocaleController.getString("ResetAccountStatus", R.string.ResetAccountStatus));
            this.resetAccountText.setTextSize(1, 14.0f);
            this.resetAccountText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.resetAccountText, LayoutHelper.createLinear(-2, -2, 49, 0, 24, 0, 0));
            TextView textView5 = new TextView(context);
            this.resetAccountTime = textView5;
            textView5.setGravity(1);
            this.resetAccountTime.setTextSize(1, 20.0f);
            this.resetAccountTime.setTypeface(AndroidUtilities.bold());
            this.resetAccountTime.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.resetAccountTime, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
            TextView textView6 = new TextView(context);
            this.resetAccountButton = textView6;
            textView6.setGravity(17);
            this.resetAccountButton.setText(LocaleController.getString(i));
            this.resetAccountButton.setTypeface(AndroidUtilities.bold());
            this.resetAccountButton.setTextSize(1, 15.0f);
            this.resetAccountButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.resetAccountButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.resetAccountButton.setTextColor(-1);
            addView(this.resetAccountButton, LayoutHelper.createLinear(-1, 50, 1, 16, 32, 16, 48));
            this.resetAccountButton.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 21));
        }

        public void lambda$new$0(TLRPC.TL_error tL_error) {
            LoginActivity.this.needHideProgress(false);
            if (tL_error != null) {
                if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
                    return;
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
            }
            if (this.requestPhone == null || this.phoneHash == null || this.phoneCode == null) {
                LoginActivity.this.setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", this.phoneCode);
            LoginActivity.this.setPage(5, true, bundle, false);
        }

        public void lambda$new$1(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(5, this, tL_error));
        }

        public void lambda$new$2(AlertDialog alertDialog, int i) {
            LoginActivity.this.needShowProgress(0);
            TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
            deleteaccount.reason = "Forgot password";
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(deleteaccount, new LinkManager$$ExternalSyntheticLambda10(this, 14), 10);
        }

        public void lambda$new$3(View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null).setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning)).setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText)).setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new TodoItemMenu$$ExternalSyntheticLambda3(this, 3)).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        }

        public void updateTimeText() {
            int iMax = Math.max(0, this.waitTime - (ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getCurrentTime() - this.startTime));
            int i = iMax / 86400;
            int iRound = Math.round(iMax / 86400.0f);
            int i2 = iMax / 3600;
            int i3 = (iMax / 60) % 60;
            int i4 = iMax % 60;
            if (i >= 2) {
                this.resetAccountTime.setText(LocaleController.formatPluralString("Days", iRound, new Object[0]));
            } else {
                this.resetAccountTime.setText(String.format(Locale.getDefault(), "%02d:%02d:%02d", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            boolean z = iMax == 0;
            Boolean bool = this.wasResetButtonActive;
            if (bool == null || bool.booleanValue() != z) {
                if (z) {
                    this.waitImageView.getAnimatedDrawable().setAutoRepeat(0);
                } else {
                    this.waitImageView.setAutoRepeat(true);
                    if (!this.waitImageView.isPlaying()) {
                        this.waitImageView.playAnimation();
                    }
                }
                this.resetAccountTime.setVisibility(z ? 4 : 0);
                this.resetAccountText.setVisibility(z ? 4 : 0);
                this.resetAccountButton.setVisibility(z ? 0 : 4);
                this.wasResetButtonActive = Boolean.valueOf(z);
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("ResetAccount", R.string.ResetAccount);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            AndroidUtilities.cancelRunOnUIThread(this.timeRunnable);
            this.timeRunnable = null;
            this.currentParams = null;
            return true;
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("resetview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("resetview_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.currentParams = bundle;
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.phoneCode = bundle.getString("code");
            this.startTime = bundle.getInt("startTime");
            this.waitTime = bundle.getInt("waitTime");
            this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("ResetAccountInfo", R.string.ResetAccountInfo, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + this.requestPhone)))));
            updateTimeText();
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    if (LoginActivityResetWaitView.this.timeRunnable != this) {
                        return;
                    }
                    LoginActivityResetWaitView.this.updateTimeText();
                    AndroidUtilities.runOnUIThread(LoginActivityResetWaitView.this.timeRunnable, 1000L);
                }
            };
            this.timeRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 1000L);
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, i, false));
            this.resetAccountText.setTextColor(Theme.getColor(null, i, false));
            this.resetAccountTime.setTextColor(Theme.getColor(null, i, false));
            TextView textView2 = this.resetAccountButton;
            int iDp = AndroidUtilities.dp(6.0f);
            int color = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
            int color2 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
        }
    }

    public class LoginActivitySetupEmail extends SlideView {
        private Bundle currentParams;
        private EditTextBoldCursor emailField;
        private OutlineTextContainerView emailOutlineView;
        private String emailPhone;
        private GoogleSignInAccount googleAccount;
        private RLottieImageView inboxImageView;
        private LoginOrView loginOrView;
        private boolean nextPressed;
        private String phone;
        private String phoneHash;
        private String requestPhone;
        private TextView signInWithGoogleView;
        private TextView subtitleView;
        private TextView titleView;

        public LoginActivitySetupEmail(Context context) {
            int i;
            super(context);
            setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            RLottieImageView rLottieImageView = new RLottieImageView(context);
            this.inboxImageView = rLottieImageView;
            rLottieImageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
            this.inboxImageView.setAutoRepeat(false);
            frameLayout.addView(this.inboxImageView, LayoutHelper.createFrame(120, 120, 1));
            if (AndroidUtilities.isSmallScreen()) {
                i = 8;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x <= point.y || AndroidUtilities.isTablet()) {
                    i = 0;
                } else {
                    i = 8;
                }
            }
            frameLayout.setVisibility(i);
            addView(frameLayout, LayoutHelper.createFrame(-1, -2, 1));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.EnterNewEmail : R.string.AddEmailTitle));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.subtitleView.setText(LocaleController.getString(R.string.AddEmailSubtitle));
            addView(this.subtitleView, LayoutHelper.createLinear(-2, -2, 1, 32, 8, 32, 0));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.emailOutlineView = outlineTextContainerView;
            outlineTextContainerView.setText(LocaleController.getString(LoginActivity.this.activityMode == 3 ? R.string.YourNewEmail : R.string.YourEmail));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
            this.emailField = editTextBoldCursor;
            editTextBoldCursor.setCursorSize(AndroidUtilities.dp(20.0f));
            this.emailField.setCursorWidth(1.5f);
            this.emailField.setImeOptions(268435461);
            this.emailField.setTextSize(1, 17.0f);
            this.emailField.setMaxLines(1);
            this.emailField.setInputType(33);
            this.emailField.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 7));
            this.emailField.setBackground(null);
            this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.emailOutlineView.attachEditText(this.emailField);
            this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
            this.emailField.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda350(this, 8));
            addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.signInWithGoogleView = textView2;
            textView2.setGravity(3);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
            drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
            spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                @Override
                public void draw(Canvas canvas, CharSequence charSequence, int i2, int i3, float f, int i4, int i5, int i6, Paint paint) {
                }

                @Override
                public int getSize(Paint paint, CharSequence charSequence, int i2, int i3, Paint.FontMetricsInt fontMetricsInt) {
                    return AndroidUtilities.dp(12.0f);
                }
            }, 1, 2, 33);
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
            this.signInWithGoogleView.setText(spannableStringBuilder);
            this.loginOrView = new LoginOrView(context);
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f));
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(this.signInWithGoogleView, LayoutHelper.createFrame(-2, -2.0f, 83, 0.0f, 0.0f, 0.0f, 24.0f));
            frameLayout2.addView(this.loginOrView, LayoutHelper.createFrame(-2, 16.0f, 83, 0.0f, 0.0f, 0.0f, 70.0f));
            this.loginOrView.setMeasureAfter(this.signInWithGoogleView);
            addView(frameLayout2, LayoutHelper.createLinear(-1, -2));
            VerticalPositionAutoAnimator.attach(frameLayout2);
            frameLayout2.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(this, 22));
        }

        public void lambda$new$0(View view, boolean z) {
            this.emailOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        public boolean lambda$new$1(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$2(GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null || LoginActivity.this.getParentActivity().isFinishing()) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), 200);
        }

        public void lambda$new$3(View view) {
            NotificationCenter.getGlobalInstance().addObserver(new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public void didReceivedNotification(int i, int i2, Object... objArr) {
                    int iIntValue = ((Integer) objArr[0]).intValue();
                    ((Integer) objArr[1]).getClass();
                    Intent intent = (Intent) objArr[2];
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.onActivityResultReceived);
                    if (iIntValue == 200) {
                        try {
                            LoginActivitySetupEmail.this.googleAccount = (GoogleSignInAccount) GoogleSignIn.getSignedInAccountFromIntent(intent).getResult(ApiException.class);
                            LoginActivitySetupEmail.this.lambda$onNextPressed$16(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            Context context = getContext();
            HashSet hashSet = new HashSet();
            HashMap map = new HashMap();
            String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
            zzah.checkNotEmpty(str);
            hashSet.add(GoogleSignInOptions.zab);
            if (hashSet.contains(GoogleSignInOptions.zae)) {
                Scope scope = GoogleSignInOptions.zad;
                if (hashSet.contains(scope)) {
                    hashSet.remove(scope);
                }
            }
            hashSet.add(GoogleSignInOptions.zac);
            GoogleSignInClient client = GoogleSignIn.getClient(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, map, null));
            client.signOut().addOnCompleteListener(new DialogsActivity$$ExternalSyntheticLambda6(29, this, client));
        }

        public void lambda$onNextPressed$5(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.verifyEmail verifyemail) {
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
                return;
            }
            if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject;
                bundle.putString("email", tL_emailVerifiedLogin.email);
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_emailVerifiedLogin.sent_code);
            } else if (tL_error != null) {
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, verifyemail, new Object[0]);
                }
            }
        }

        public void lambda$onNextPressed$6(Bundle bundle, TL_account.verifyEmail verifyemail, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((KeyEvent.Callback) this, tLObject, (Object) bundle, tL_error, (TLObject) verifyemail, 26));
        }

        public void lambda$onNextPressed$7(TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.sendVerifyEmailCode sendverifyemailcode) {
            LoginActivity.this.needHideProgress(false);
            this.nextPressed = false;
            if (tLObject instanceof TL_account.sentEmailCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TL_account.sentEmailCode) tLObject);
                return;
            }
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("EMAIL_INVALID")) {
                    onPasscodeError(false);
                    return;
                }
                if (tL_error.text.contains("EMAIL_NOT_ALLOWED")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailNotAllowed));
                    return;
                }
                if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    return;
                }
                if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidCode", R.string.InvalidCode));
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, sendverifyemailcode, this.requestPhone);
                }
            }
        }

        public void lambda$onNextPressed$8(Bundle bundle, TL_account.sendVerifyEmailCode sendverifyemailcode, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((KeyEvent.Callback) this, tLObject, (Object) bundle, tL_error, (TLObject) sendverifyemailcode, 25));
        }

        public void lambda$onPasscodeError$4() {
            this.emailField.requestFocus();
        }

        public void lambda$onShow$9() {
            this.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            this.inboxImageView.playAnimation();
            this.emailField.requestFocus();
            AndroidUtilities.showKeyboard(this.emailField);
        }

        private void onPasscodeError(boolean z) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            try {
                this.emailOutlineView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            if (z) {
                this.emailField.setText("");
            }
            this.emailField.requestFocus();
            LoginActivity.this.onFieldError(this.emailOutlineView, true);
            postDelayed(new LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(this, 1), 300L);
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
        }

        @Override
        public boolean needBackButton() {
            return !LoginActivity.this.emailChangeIsSuggestion;
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (this.nextPressed) {
                return;
            }
            GoogleSignInAccount googleSignInAccount = this.googleAccount;
            String string = googleSignInAccount != null ? googleSignInAccount.zaf : this.emailField.getText().toString();
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("email", string);
            bundle.putBoolean("setup", true);
            if (this.googleAccount != null) {
                TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                if (LoginActivity.this.activityMode == 3) {
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                } else {
                    TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                    tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                    tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                    verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
                }
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.googleAccount.zae;
                verifyemail.verification = tL_emailVerificationGoogle;
                this.googleAccount = null;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(verifyemail, new LinkManager$$ExternalSyntheticLambda0(this, bundle, verifyemail, 26), 10);
                return;
            }
            if (TextUtils.isEmpty(string)) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (LoginActivity.this.activityMode == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.phoneHash;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = string;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(sendverifyemailcode, new LinkManager$$ExternalSyntheticLambda0(this, bundle, sendverifyemailcode, 27), 10);
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySetupEmail$$ExternalSyntheticLambda0(this, 0), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("emailsetup_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("emailsetup_email");
            if (string != null) {
                this.emailField.setText(string);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String string = this.emailField.getText().toString();
            if (string != null && string.length() != 0) {
                bundle.putString("emailsetup_email", string);
            }
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("emailsetup_params", bundle2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            if (bundle == null) {
                return;
            }
            this.emailField.setText("");
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = this.currentParams.getString("ephone");
            this.requestPhone = this.currentParams.getString("phoneFormated");
            this.phoneHash = this.currentParams.getString("phoneHash");
            int i = (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) ? 0 : 8;
            this.loginOrView.setVisibility(i);
            this.signInWithGoogleView.setVisibility(i);
            LoginActivity.this.showKeyboard(this.emailField);
            this.emailField.requestFocus();
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.subtitleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.subtitleView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            this.emailField.setTextColor(Theme.getColor(null, i, false));
            this.signInWithGoogleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.loginOrView.updateColors();
            this.emailOutlineView.invalidate();
        }
    }

    public class LoginActivitySmsView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
        private ImageView blackImageView;
        private RLottieImageView blueImageView;
        private FrameLayout bottomContainer;
        private String catchedPhone;
        private CodeFieldContainer codeFieldContainer;
        private int codeTime;
        private Timer codeTimer;
        private TextView confirmTextView;
        private Bundle currentParams;
        private int currentType;
        private RLottieDrawable dotsDrawable;
        private RLottieDrawable dotsToStarsDrawable;
        private String emailPhone;
        private Runnable errorColorTimeout;
        private ViewSwitcher errorViewSwitcher;
        RLottieDrawable hintDrawable;
        private boolean ignoreOnTextChange;
        private boolean isDotsAnimationVisible;
        private boolean isResendingCode;
        private double lastCodeTime;
        private double lastCurrentTime;
        private String lastError;
        private int length;
        private ImageView missedCallArrowIcon;
        private TextView missedCallDescriptionSubtitle;
        private TextView missedCallDescriptionSubtitle2;
        private ImageView missedCallPhoneIcon;
        private TLRPC.TL_auth_sentCode nextCodeAuth;
        private Bundle nextCodeParams;
        private boolean nextPressed;
        private int nextType;
        private LinearLayout openFragmentButton;
        private TextView openFragmentButtonText;
        private RLottieImageView openFragmentImageView;
        private int openTime;
        private String pattern;
        private String phone;
        private String phoneHash;
        private boolean postedErrorColorTimeout;
        private String prefix;
        private TextView prefixTextView;
        private int prevType;
        private TextView prevTypeTextView;
        private FrameLayout problemFrame;
        private LoadingTextView problemText;
        private ProgressView progressView;
        private String requestPhone;
        private RLottieDrawable starsToDotsDrawable;
        private int time;
        private LoadingTextView timeText;
        private Timer timeTimer;
        private final Object timerSync;
        private TextView titleTextView;
        private String url;
        private boolean waitingForEvent;
        private TextView wrongCode;

        public class AnonymousClass7 extends TimerTask {
            public AnonymousClass7() {
            }

            public void lambda$run$0() {
                double dCurrentTimeMillis = System.currentTimeMillis();
                double d = dCurrentTimeMillis - LoginActivitySmsView.this.lastCodeTime;
                LoginActivitySmsView.this.lastCodeTime = dCurrentTimeMillis;
                LoginActivitySmsView.access$9626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.codeTime <= 1000) {
                    LoginActivitySmsView.this.setProblemTextVisible(true);
                    LoginActivitySmsView.this.timeText.setVisibility(8);
                    if (LoginActivitySmsView.this.problemText != null) {
                        LoginActivitySmsView.this.problemText.setVisibility(0);
                    }
                    LoginActivitySmsView.this.destroyCodeTimer();
                }
            }

            @Override
            public void run() {
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 6));
            }
        }

        public class AnonymousClass8 extends TimerTask {
            public AnonymousClass8() {
            }

            public void lambda$run$0() {
                double dCurrentTimeMillis = System.currentTimeMillis();
                double d = dCurrentTimeMillis - LoginActivitySmsView.this.lastCurrentTime;
                LoginActivitySmsView.this.lastCurrentTime = dCurrentTimeMillis;
                LoginActivitySmsView.access$8626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.time < 1000) {
                    LoginActivitySmsView.this.destroyTimer();
                    if (LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16 || LoginActivitySmsView.this.nextType == 11) {
                        if (LoginActivitySmsView.this.nextType == 4) {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestCallButton", R.string.RequestCallButton));
                        } else if (LoginActivitySmsView.this.nextType == 11 || LoginActivitySmsView.this.nextType == 3) {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.getString(R.string.RequestMissedCall));
                        } else {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.getString("RequestSmsButton", R.string.RequestSmsButton));
                        }
                        LoadingTextView loadingTextView = LoginActivitySmsView.this.timeText;
                        int i = Theme.key_chats_actionBackground;
                        loadingTextView.setTextColor(Theme.getColor(null, i, false));
                        LoginActivitySmsView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
                        return;
                    }
                    return;
                }
                int i2 = (LoginActivitySmsView.this.time / 1000) / 60;
                int i3 = (LoginActivitySmsView.this.time / 1000) - (i2 * 60);
                if (LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 11) {
                    LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i2), Integer.valueOf(i3)));
                } else if (LoginActivitySmsView.this.currentType == 2 && (LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16)) {
                    LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i2), Integer.valueOf(i3)));
                } else if (LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16) {
                    LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i2), Integer.valueOf(i3)));
                }
                if (LoginActivitySmsView.this.progressView == null || LoginActivitySmsView.this.progressView.isProgressAnimationRunning()) {
                    return;
                }
                LoginActivitySmsView.this.progressView.startProgressAnimation(((long) LoginActivitySmsView.this.time) - 1000);
            }

            @Override
            public void run() {
                if (LoginActivitySmsView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda60(this, 7));
            }
        }

        public LoginActivitySmsView(Context context, int i) {
            ViewGroup frameLayout;
            int i2;
            super(context);
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.isResendingCode = false;
            this.pattern = "*";
            this.prefix = "";
            this.errorColorTimeout = new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 3);
            this.currentType = i;
            setOrientation(1);
            TextView textView = new TextView(context);
            this.confirmTextView = textView;
            textView.setTextSize(1, 14.0f);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            textView2.setTextSize(1, 18.0f);
            this.titleTextView.setTypeface(AndroidUtilities.bold());
            this.titleTextView.setGravity(LocaleController.isRTL ? 5 : 3);
            this.titleTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.titleTextView.setGravity(49);
            String string = LoginActivity.this.activityMode != 1 ? null : LocaleController.getString(R.string.CancelAccountReset);
            int i3 = this.currentType;
            if (i3 != 11) {
                if (i3 == 3) {
                    this.confirmTextView.setGravity(1);
                    frameLayout = new FrameLayout(context);
                    addView(frameLayout, LayoutHelper.createLinear(-1, 0, 1.0f));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    linearLayout.setGravity(1);
                    frameLayout.addView(linearLayout, LayoutHelper.createFrame(-1, -2, 17));
                    ((FrameLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                    FrameLayout frameLayout2 = new FrameLayout(context);
                    linearLayout.addView(frameLayout2, LayoutHelper.createFrame(-2, -2, 1));
                    this.blueImageView = new RLottieImageView(context);
                    int i4 = R.raw.phone_flash_call;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, String.valueOf(i4), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                    this.hintDrawable = rLottieDrawable;
                    this.blueImageView.setAnimation(rLottieDrawable);
                    frameLayout2.addView(this.blueImageView, LayoutHelper.createFrame(64, 64.0f));
                    this.titleTextView.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                    linearLayout.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
                    linearLayout.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                } else {
                    this.confirmTextView.setGravity(49);
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    addView(frameLayout3, LayoutHelper.createLinear(-2, -2, 49, 0, 16, 0, 0));
                    int i5 = this.currentType;
                    int i6 = i5 == 1 ? 128 : 64;
                    if (i5 == 1) {
                        int i7 = R.raw.code_laptop;
                        float f = i6;
                        this.hintDrawable = new RLottieDrawable(i7, String.valueOf(i7), AndroidUtilities.dp(f), AndroidUtilities.dp(f), true, null);
                    } else {
                        int i8 = R.raw.sms_incoming_info;
                        float f2 = i6;
                        this.hintDrawable = new RLottieDrawable(i8, String.valueOf(i8), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i9 = R.raw.phone_stars_to_dots;
                        this.starsToDotsDrawable = new RLottieDrawable(i9, String.valueOf(i9), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i10 = R.raw.phone_dots;
                        this.dotsDrawable = new RLottieDrawable(i10, String.valueOf(i10), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                        int i11 = R.raw.phone_dots_to_stars;
                        this.dotsToStarsDrawable = new RLottieDrawable(i11, String.valueOf(i11), AndroidUtilities.dp(f2), AndroidUtilities.dp(f2), true, null);
                    }
                    RLottieImageView rLottieImageView = new RLottieImageView(context);
                    this.blueImageView = rLottieImageView;
                    rLottieImageView.setAnimation(this.hintDrawable);
                    if (this.currentType == 1 && !AndroidUtilities.isSmallScreen()) {
                        this.blueImageView.setTranslationY(-AndroidUtilities.dp(24.0f));
                    }
                    frameLayout3.addView(this.blueImageView, LayoutHelper.createFrame(i6, i6, 51, 0.0f, 0.0f, 0.0f, (this.currentType != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
                    TextView textView3 = this.titleTextView;
                    if (string == null) {
                        string = LocaleController.getString(this.currentType == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
                    }
                    textView3.setText(string);
                    addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                    int i12 = this.currentType == 15 ? 16 : 0;
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 49, i12, 17, i12, 0));
                }
                if (this.currentType != 11) {
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                        @Override
                        public void processNextPressed() {
                            LoginActivitySmsView.this.lambda$onNextPressed$16(null);
                        }
                    };
                    this.codeFieldContainer = codeFieldContainer;
                    addView(codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
                }
                if (this.currentType == 3) {
                    this.codeFieldContainer.setVisibility(8);
                }
                LoadingTextView loadingTextView = LoginActivity.this.new LoadingTextView(context);
                this.prevTypeTextView = loadingTextView;
                int i13 = Theme.key_windowBackgroundWhiteValueText;
                loadingTextView.setLinkTextColor(Theme.getColor(null, i13, false));
                this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i13));
                this.prevTypeTextView.setTextSize(1, 14.0f);
                this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 0;
                this.prevTypeTextView.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i14) {
                            case 0:
                                this.f$0.lambda$new$1(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$5(view);
                                break;
                            default:
                                this.f$0.lambda$new$6(view);
                                break;
                        }
                    }
                });
                addView(this.prevTypeTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
                this.prevTypeTextView.setVisibility(8);
                this.problemFrame = new FrameLayout(context);
                LoadingTextView loadingTextView2 = new LoadingTextView(context) {
                    {
                        LoginActivity loginActivity = LoginActivity.this;
                    }

                    @Override
                    public boolean isResendingCode() {
                        return LoginActivitySmsView.this.isResendingCode;
                    }

                    @Override
                    public boolean isRippleEnabled() {
                        if (getVisibility() == 0) {
                            return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                        }
                        return false;
                    }
                };
                this.timeText = loadingTextView2;
                loadingTextView2.setLinkTextColor(Theme.getColor(null, i13, false));
                this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                this.timeText.setTextSize(1, 15.0f);
                this.timeText.setGravity(51);
                final int i15 = 1;
                this.timeText.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i15) {
                            case 0:
                                this.f$0.lambda$new$1(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$5(view);
                                break;
                            default:
                                this.f$0.lambda$new$6(view);
                                break;
                        }
                    }
                });
                this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
                this.errorViewSwitcher = new ViewSwitcher(context) {
                    @Override
                    public void onMeasure(int i16, int i17) {
                        super.onMeasure(i16, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                    }
                };
                if (this.currentType != 15) {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                    Interpolator interpolator = Easings.easeInOutQuad;
                    animationLoadAnimation.setInterpolator(interpolator);
                    this.errorViewSwitcher.setInAnimation(animationLoadAnimation);
                    Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                    animationLoadAnimation2.setInterpolator(interpolator);
                    this.errorViewSwitcher.setOutAnimation(animationLoadAnimation2);
                    LoadingTextView loadingTextView3 = new LoadingTextView(context) {
                        {
                            LoginActivity loginActivity = LoginActivity.this;
                        }

                        @Override
                        public boolean isResendingCode() {
                            return LoginActivitySmsView.this.isResendingCode;
                        }

                        @Override
                        public boolean isRippleEnabled() {
                            if (isClickable() && getVisibility() == 0 && !LoginActivitySmsView.this.nextPressed) {
                                return (LoginActivitySmsView.this.timeText == null || LoginActivitySmsView.this.timeText.getVisibility() == 8) && !LoginActivitySmsView.this.isResendingCode;
                            }
                            return false;
                        }
                    };
                    this.problemText = loadingTextView3;
                    loadingTextView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.problemText.setTextSize(1, 15.0f);
                    this.problemText.setGravity(49);
                    this.problemText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                    this.problemFrame.addView(this.problemText, LayoutHelper.createFrame(-1, -2, 17));
                    this.errorViewSwitcher.addView(this.problemFrame, LayoutHelper.createFrame(-2, -2, 17));
                } else {
                    Animation animationLoadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
                    animationLoadAnimation3.setInterpolator(cubicBezierInterpolator);
                    this.errorViewSwitcher.setInAnimation(animationLoadAnimation3);
                    Animation animationLoadAnimation4 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                    animationLoadAnimation4.setInterpolator(cubicBezierInterpolator);
                    this.errorViewSwitcher.setOutAnimation(animationLoadAnimation4);
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    this.openFragmentButton = linearLayout2;
                    linearLayout2.setOrientation(0);
                    this.openFragmentButton.setGravity(17);
                    this.openFragmentButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    LinearLayout linearLayout3 = this.openFragmentButton;
                    int iDp = AndroidUtilities.dp(6.0f);
                    int color = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
                    int color2 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
                    linearLayout3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
                    final int i16 = 2;
                    this.openFragmentButton.setOnClickListener(new View.OnClickListener(this) {
                        public final LoginActivity.LoginActivitySmsView f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (i16) {
                                case 0:
                                    this.f$0.lambda$new$1(view);
                                    break;
                                case 1:
                                    this.f$0.lambda$new$5(view);
                                    break;
                                default:
                                    this.f$0.lambda$new$6(view);
                                    break;
                            }
                        }
                    });
                    this.errorViewSwitcher.addView(this.openFragmentButton, LayoutHelper.createFrame(-1, 52.0f));
                    RLottieImageView rLottieImageView2 = new RLottieImageView(context);
                    this.openFragmentImageView = rLottieImageView2;
                    rLottieImageView2.setAnimation(R.raw.fragment, 36, 36);
                    this.openFragmentButton.addView(this.openFragmentImageView, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                    TextView textView4 = new TextView(context);
                    this.openFragmentButtonText = textView4;
                    textView4.setText(LocaleController.getString(R.string.OpenFragment));
                    this.openFragmentButtonText.setTextColor(-1);
                    this.openFragmentButtonText.setTextSize(1, 15.0f);
                    this.openFragmentButtonText.setGravity(17);
                    this.openFragmentButtonText.setTypeface(AndroidUtilities.bold());
                    this.openFragmentButton.addView(this.openFragmentButtonText);
                }
                TextView textView5 = new TextView(context);
                this.wrongCode = textView5;
                textView5.setText(LocaleController.getString(R.string.WrongCode));
                this.wrongCode.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.wrongCode.setTextSize(1, 15.0f);
                this.wrongCode.setGravity(49);
                this.wrongCode.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                this.errorViewSwitcher.addView(this.wrongCode, LayoutHelper.createFrame(-2, -2, 17));
                if (frameLayout == null) {
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    this.bottomContainer = frameLayout4;
                    ViewSwitcher viewSwitcher = this.errorViewSwitcher;
                    if (this.currentType == 15) {
                        i2 = -1;
                    } else {
                        i2 = -2;
                    }
                    frameLayout4.addView(viewSwitcher, LayoutHelper.createFrame(i2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(this.bottomContainer, LayoutHelper.createLinear(-1, 0, 1.0f));
                } else {
                    frameLayout.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
                if (this.currentType != 15) {
                    this.problemText.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(14, this, context));
                }
            }
            this.titleTextView.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
            FrameLayout frameLayout5 = new FrameLayout(context);
            this.missedCallArrowIcon = new ImageView(context);
            this.missedCallPhoneIcon = new ImageView(context);
            frameLayout5.addView(this.missedCallArrowIcon);
            frameLayout5.addView(this.missedCallPhoneIcon);
            this.missedCallArrowIcon.setImageResource(R.drawable.login_arrow1);
            this.missedCallPhoneIcon.setImageResource(R.drawable.login_phone1);
            addView(frameLayout5, LayoutHelper.createLinear(64, 64, 1, 0, 16, 0, 0));
            addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
            TextView textView6 = new TextView(context);
            this.missedCallDescriptionSubtitle = textView6;
            textView6.setTextSize(1, 14.0f);
            this.missedCallDescriptionSubtitle.setGravity(1);
            this.missedCallDescriptionSubtitle.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.MissedCallDescriptionSubtitle, this.missedCallDescriptionSubtitle);
            addView(this.missedCallDescriptionSubtitle, LayoutHelper.createLinear(-1, -2, 49, 36, 16, 36, 0));
            this.codeFieldContainer = new CodeFieldContainer(context) {
                @Override
                public void processNextPressed() {
                    LoginActivitySmsView.this.lambda$onNextPressed$16(null);
                }
            };
            LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(0, context);
            TextView textView7 = new TextView(context);
            this.prefixTextView = textView7;
            textView7.setTextSize(1, 20.0f);
            this.prefixTextView.setMaxLines(1);
            this.prefixTextView.setTypeface(AndroidUtilities.bold());
            this.prefixTextView.setPadding(0, 0, 0, 0);
            this.prefixTextView.setGravity(16);
            linearLayoutM.addView(this.prefixTextView, LayoutHelper.createLinear(-2, -1, 16, 0, 0, 4, 0));
            linearLayoutM.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -1));
            addView(linearLayoutM, LayoutHelper.createLinear(-2, 34, 1, 0, 28, 0, 0));
            TextView textView8 = new TextView(context);
            this.missedCallDescriptionSubtitle2 = textView8;
            textView8.setTextSize(1, 14.0f);
            this.missedCallDescriptionSubtitle2.setGravity(1);
            this.missedCallDescriptionSubtitle2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            FilesMigrationService$FilesMigrationBottomSheet$$ExternalSyntheticOutline0.m(R.string.MissedCallDescriptionSubtitle2, this.missedCallDescriptionSubtitle2);
            addView(this.missedCallDescriptionSubtitle2, LayoutHelper.createLinear(-1, -2, 49, 36, 28, 36, 12));
            frameLayout = null;
            if (this.currentType != 11) {
                CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) {
                    @Override
                    public void processNextPressed() {
                        LoginActivitySmsView.this.lambda$onNextPressed$16(null);
                    }
                };
                this.codeFieldContainer = codeFieldContainer2;
                addView(codeFieldContainer2, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            }
            if (this.currentType == 3) {
                this.codeFieldContainer.setVisibility(8);
            }
            LoadingTextView loadingTextView4 = LoginActivity.this.new LoadingTextView(context);
            this.prevTypeTextView = loadingTextView4;
            int i17 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView4.setLinkTextColor(Theme.getColor(null, i17, false));
            this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i17));
            this.prevTypeTextView.setTextSize(1, 14.0f);
            this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            final int i18 = 0;
            this.prevTypeTextView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivitySmsView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i18) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$5(view);
                            break;
                        default:
                            this.f$0.lambda$new$6(view);
                            break;
                    }
                }
            });
            addView(this.prevTypeTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 18, 0, 0));
            this.prevTypeTextView.setVisibility(8);
            this.problemFrame = new FrameLayout(context);
            LoadingTextView loadingTextView5 = new LoadingTextView(context) {
                {
                    LoginActivity loginActivity = LoginActivity.this;
                }

                @Override
                public boolean isResendingCode() {
                    return LoginActivitySmsView.this.isResendingCode;
                }

                @Override
                public boolean isRippleEnabled() {
                    if (getVisibility() == 0) {
                        return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                    }
                    return false;
                }
            };
            this.timeText = loadingTextView5;
            loadingTextView5.setLinkTextColor(Theme.getColor(null, i17, false));
            this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            this.timeText.setTextSize(1, 15.0f);
            this.timeText.setGravity(51);
            final int i19 = 1;
            this.timeText.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.LoginActivitySmsView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i19) {
                        case 0:
                            this.f$0.lambda$new$1(view);
                            break;
                        case 1:
                            this.f$0.lambda$new$5(view);
                            break;
                        default:
                            this.f$0.lambda$new$6(view);
                            break;
                    }
                }
            });
            this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
            this.errorViewSwitcher = new ViewSwitcher(context) {
                @Override
                public void onMeasure(int i110, int i111) {
                    super.onMeasure(i110, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            if (this.currentType != 15) {
                Animation animationLoadAnimation5 = AnimationUtils.loadAnimation(context, R.anim.text_in);
                Interpolator interpolator2 = Easings.easeInOutQuad;
                animationLoadAnimation5.setInterpolator(interpolator2);
                this.errorViewSwitcher.setInAnimation(animationLoadAnimation5);
                Animation animationLoadAnimation6 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                animationLoadAnimation6.setInterpolator(interpolator2);
                this.errorViewSwitcher.setOutAnimation(animationLoadAnimation6);
                LoadingTextView loadingTextView6 = new LoadingTextView(context) {
                    {
                        LoginActivity loginActivity = LoginActivity.this;
                    }

                    @Override
                    public boolean isResendingCode() {
                        return LoginActivitySmsView.this.isResendingCode;
                    }

                    @Override
                    public boolean isRippleEnabled() {
                        if (isClickable() && getVisibility() == 0 && !LoginActivitySmsView.this.nextPressed) {
                            return (LoginActivitySmsView.this.timeText == null || LoginActivitySmsView.this.timeText.getVisibility() == 8) && !LoginActivitySmsView.this.isResendingCode;
                        }
                        return false;
                    }
                };
                this.problemText = loadingTextView6;
                loadingTextView6.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.problemText.setTextSize(1, 15.0f);
                this.problemText.setGravity(49);
                this.problemText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                this.problemFrame.addView(this.problemText, LayoutHelper.createFrame(-1, -2, 17));
                this.errorViewSwitcher.addView(this.problemFrame, LayoutHelper.createFrame(-2, -2, 17));
            } else {
                Animation animationLoadAnimation7 = AnimationUtils.loadAnimation(context, R.anim.scale_in);
                CubicBezierInterpolator cubicBezierInterpolator2 = CubicBezierInterpolator.DEFAULT;
                animationLoadAnimation7.setInterpolator(cubicBezierInterpolator2);
                this.errorViewSwitcher.setInAnimation(animationLoadAnimation7);
                Animation animationLoadAnimation8 = AnimationUtils.loadAnimation(context, R.anim.scale_out);
                animationLoadAnimation8.setInterpolator(cubicBezierInterpolator2);
                this.errorViewSwitcher.setOutAnimation(animationLoadAnimation8);
                LinearLayout linearLayout4 = new LinearLayout(context);
                this.openFragmentButton = linearLayout4;
                linearLayout4.setOrientation(0);
                this.openFragmentButton.setGravity(17);
                this.openFragmentButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                LinearLayout linearLayout5 = this.openFragmentButton;
                int iDp2 = AndroidUtilities.dp(6.0f);
                int color3 = Theme.getColor(null, Theme.key_changephoneinfo_image2, false);
                int color4 = Theme.getColor(null, Theme.key_chats_actionPressedBackground, false);
                linearLayout5.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, color3, color4, color4));
                final int i110 = 2;
                this.openFragmentButton.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.LoginActivitySmsView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i110) {
                            case 0:
                                this.f$0.lambda$new$1(view);
                                break;
                            case 1:
                                this.f$0.lambda$new$5(view);
                                break;
                            default:
                                this.f$0.lambda$new$6(view);
                                break;
                        }
                    }
                });
                this.errorViewSwitcher.addView(this.openFragmentButton, LayoutHelper.createFrame(-1, 52.0f));
                RLottieImageView rLottieImageView3 = new RLottieImageView(context);
                this.openFragmentImageView = rLottieImageView3;
                rLottieImageView3.setAnimation(R.raw.fragment, 36, 36);
                this.openFragmentButton.addView(this.openFragmentImageView, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                TextView textView9 = new TextView(context);
                this.openFragmentButtonText = textView9;
                textView9.setText(LocaleController.getString(R.string.OpenFragment));
                this.openFragmentButtonText.setTextColor(-1);
                this.openFragmentButtonText.setTextSize(1, 15.0f);
                this.openFragmentButtonText.setGravity(17);
                this.openFragmentButtonText.setTypeface(AndroidUtilities.bold());
                this.openFragmentButton.addView(this.openFragmentButtonText);
            }
            TextView textView10 = new TextView(context);
            this.wrongCode = textView10;
            textView10.setText(LocaleController.getString(R.string.WrongCode));
            this.wrongCode.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.wrongCode.setTextSize(1, 15.0f);
            this.wrongCode.setGravity(49);
            this.wrongCode.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
            this.errorViewSwitcher.addView(this.wrongCode, LayoutHelper.createFrame(-2, -2, 17));
            if (frameLayout == null) {
                FrameLayout frameLayout6 = new FrameLayout(context);
                this.bottomContainer = frameLayout6;
                ViewSwitcher viewSwitcher2 = this.errorViewSwitcher;
                if (this.currentType == 15) {
                    i2 = -1;
                } else {
                    i2 = -2;
                }
                frameLayout6.addView(viewSwitcher2, LayoutHelper.createFrame(i2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                addView(this.bottomContainer, LayoutHelper.createLinear(-1, 0, 1.0f));
            } else {
                frameLayout.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
            }
            VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
            if (this.currentType != 15) {
                this.problemText.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(14, this, context));
            }
        }

        public static int access$8626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (((double) loginActivitySmsView.time) - d);
            loginActivitySmsView.time = i;
            return i;
        }

        public static int access$9626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (((double) loginActivitySmsView.codeTime) - d);
            loginActivitySmsView.codeTime = i;
            return i;
        }

        private void animateSuccess(Runnable runnable) {
            if (this.currentType == 3) {
                runnable.run();
                return;
            }
            int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    codeFieldContainer.postDelayed(new PhotoViewer$$ExternalSyntheticLambda15(9, this, runnable), (((long) codeNumberFieldArr.length) * 75) + 400);
                    return;
                } else {
                    codeFieldContainer.postDelayed(new OAuthSheet$$ExternalSyntheticLambda6(this, i, 20), ((long) i) * 75);
                    i++;
                }
            }
        }

        private void applyLottieColors(RLottieDrawable rLottieDrawable) {
            if (rLottieDrawable != null) {
                rLottieDrawable.setLayerColor("Bubble", Theme.getColor(null, Theme.key_chats_actionBackground, false));
                int i = Theme.key_windowBackgroundWhiteBlackText;
                rLottieDrawable.setLayerColor("Phone", Theme.getColor(null, i, false));
                rLottieDrawable.setLayerColor("Note", Theme.getColor(null, i, false));
            }
        }

        private void createCodeTimer() {
            if (this.codeTimer != null) {
                return;
            }
            this.codeTime = 15000;
            int i = this.time;
            if (i > 15000) {
                this.codeTime = i;
            }
            this.codeTimer = new Timer();
            this.lastCodeTime = System.currentTimeMillis();
            this.codeTimer.schedule(new AnonymousClass7(), 0L, 1000L);
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            ProgressView progressView = this.progressView;
            if (progressView != null) {
                progressView.resetProgressAnimation();
            }
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass8(), 0L, 1000L);
        }

        public void destroyCodeTimer() {
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.codeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.codeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(null, i, false));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            try {
                synchronized (this.timerSync) {
                    try {
                        Timer timer = this.timeTimer;
                        if (timer != null) {
                            timer.cancel();
                            this.timeTimer = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$animateSuccess$38(int i) {
            this.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
        }

        public void lambda$animateSuccess$39(Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    runnable.run();
                    this.codeFieldContainer.isFocusSuppressed = false;
                    return;
                } else {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                }
            }
        }

        public void lambda$new$0() {
            int i = 0;
            this.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (this.errorViewSwitcher.getCurrentView() != (this.currentType == 15 ? this.openFragmentButton : this.problemFrame)) {
                this.errorViewSwitcher.showNext();
            }
        }

        public void lambda$new$1(View view) {
            onBackPressed(true);
        }

        public void lambda$new$2(Bundle bundle, TLObject tLObject) {
            this.nextCodeParams = bundle;
            TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
            this.nextCodeAuth = tL_auth_sentCode;
            TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
            if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                this.nextType = 17;
            } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                this.nextType = 16;
            }
            LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
        }

        public void lambda$new$3(TLRPC.TL_error tL_error) {
            this.lastError = tL_error.text;
        }

        public void lambda$new$4(Bundle bundle, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((NotificationCenter.NotificationCenterDelegate) this, (Object) bundle, tLObject, 8));
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(7, this, tL_error));
            }
        }

        public void lambda$new$5(View view) {
            if (this.time <= 0 || this.timeTimer == null) {
                this.isResendingCode = true;
                this.timeText.invalidate();
                this.timeText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                int i = this.nextType;
                if (i != 4 && i != 2 && i != 17 && i != 16 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                        this.waitingForEvent = false;
                        destroyCodeTimer();
                        this.isResendingCode = false;
                        resendCode();
                        return;
                    }
                    return;
                }
                if (i == 4 || i == 11) {
                    this.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    this.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                Bundle bundle = new Bundle();
                bundle.putString("phone", this.phone);
                bundle.putString("ephone", this.emailPhone);
                bundle.putString("phoneFormated", this.requestPhone);
                bundle.putInt("prevType", this.currentType);
                createCodeTimer();
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = this.requestPhone;
                tL_auth_resendCode.phone_code_hash = this.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33(this, bundle, 1), 10);
            }
        }

        public void lambda$new$6(View view) {
            try {
                getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.url)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public void lambda$new$7(Context context, AlertDialog alertDialog, int i) {
            String str;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                Locale locale = Locale.US;
                String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                StringBuilder sb = new StringBuilder();
                sb.append(this.emailPhone);
                sb.append(" Android Registration/Login Issue ");
                sb.append(str2);
                sb.append(LoginActivity.this.paid ? " #paidauth" : "");
                intent.putExtra("android.intent.extra.SUBJECT", sb.toString());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
                sb2.append("Device: ");
                sb2.append(Build.MANUFACTURER);
                sb2.append(" ");
                sb2.append(Build.MODEL);
                sb2.append("\n");
                sb2.append("OS version: SDK ");
                int i2 = Build.VERSION.SDK_INT;
                sb2.append(i2);
                sb2.append("\n");
                sb2.append("Locale: ");
                sb2.append(Locale.getDefault());
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("Target Phone: +");
                sb2.append(this.requestPhone);
                sb2.append("\n");
                sb2.append("\n");
                try {
                    if (i2 >= 22) {
                        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(getContext());
                        List completeActiveSubscriptionInfoList = i2 >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                        if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i2 >= 28) {
                            completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                            completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList != null) {
                            Iterator it = completeActiveSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                SubscriptionInfo subscriptionInfoM = LoginActivity$$ExternalSyntheticApiModelOutline2.m(it.next());
                                String number = subscriptionInfoM.getNumber();
                                if (!TextUtils.isEmpty(number)) {
                                    String str3 = "SIM" + subscriptionInfoM.getSimSlotIndex();
                                    sb2.append(str3);
                                    sb2.append(".Phone: ");
                                    sb2.append(number);
                                    sb2.append("\n");
                                    sb2.append(str3);
                                    sb2.append(".MCC: ");
                                    sb2.append(subscriptionInfoM.getMcc());
                                    sb2.append("\n");
                                    sb2.append(str3);
                                    sb2.append(".MNC: ");
                                    sb2.append(subscriptionInfoM.getMnc());
                                    sb2.append("\n");
                                    sb2.append(str3);
                                    sb2.append(".Carrier: ");
                                    sb2.append(TextUtils.isEmpty(subscriptionInfoM.getCarrierName()) ? "unknown" : subscriptionInfoM.getCarrierName());
                                    sb2.append("\n\n");
                                }
                            }
                        }
                    } else {
                        try {
                            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                            if (!TextUtils.isEmpty(line1Number)) {
                                sb2.append("SIM0.Phone: ");
                                sb2.append(line1Number);
                                sb2.append("\n");
                                sb2.append("SIM0.MCC: unknown\n");
                                sb2.append("SIM0.MNC: unknown\n");
                                sb2.append("SIM0.Carrier: unknown\n\n");
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(TelephonyManager.class);
                        SignalStrength signalStrength = telephonyManager.getSignalStrength();
                        if (signalStrength != null) {
                            sb2.append("Signal: ");
                            sb2.append(signalStrength.getLevel());
                            sb2.append("/4\n");
                        } else {
                            sb2.append("Signal: unknown\n");
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } else {
                    sb2.append("Signal: unknown\n");
                }
                sb2.append("Wi-Fi: ");
                sb2.append(AndroidUtilities.isWifiEnabled(context));
                sb2.append("\n");
                sb2.append("Airplane Mode: ");
                sb2.append(AndroidUtilities.isInAirplaneMode(context));
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("App: ");
                sb2.append(BuildVars.APP_ID);
                sb2.append("\n");
                int i3 = packageInfo.versionCode % 10;
                if (i3 == 1 || i3 == 2) {
                    str = "store";
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str = "beta";
                } else {
                    str = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
                }
                sb2.append("App version: ");
                sb2.append(str2);
                sb2.append(" ");
                sb2.append(str);
                sb2.append("\n");
                sb2.append("\n");
                sb2.append("Issue: ");
                sb2.append(LoginActivity.this.paid ? "no_otp" : "no_otp_paid");
                sb2.append("\n");
                if (!TextUtils.isEmpty(this.lastError)) {
                    sb2.append("Error: ");
                    sb2.append(this.lastError);
                    sb2.append("\n");
                }
                sb2.append("\n\n================================================\n");
                sb2.append("WRITE YOUR COMMENT HERE:\n");
                sb2.append("\n");
                sb2.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
        }

        public void lambda$new$8(AlertDialog alertDialog, int i) {
            LoginActivity.this.setPage(0, true, null, true);
        }

        public void lambda$new$9(Context context, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            int i = 1;
            int i2 = 0;
            Bundle bundle = this.nextCodeParams;
            if (bundle != null && (tL_auth_sentCode = this.nextCodeAuth) != null) {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
                return;
            }
            if (this.nextPressed) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            if ((loadingTextView == null || loadingTextView.getVisibility() == 8) && !this.isResendingCode) {
                if (this.nextType != 0) {
                    if (LoginActivity.this.radialProgressView.getTag() != null) {
                        return;
                    }
                    resendCode();
                    return;
                }
                TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                tL_auth_reportMissingCode.phone_number = this.requestPhone;
                tL_auth_reportMissingCode.phone_code_hash = this.phoneHash;
                tL_auth_reportMissingCode.mnc = "";
                try {
                    String networkOperator = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getNetworkOperator();
                    if (!TextUtils.isEmpty(networkOperator)) {
                        networkOperator.substring(0, 3);
                        tL_auth_reportMissingCode.mnc = networkOperator.substring(3);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
                LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_reportMissingCode, null, 8);
                new AlertDialog.Builder(context, 0, null).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, this.phone))).setNeutralButton(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new TodoItemMenu$$ExternalSyntheticLambda7(i, this, context)).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45(this, i2)).show();
            }
        }

        public void lambda$onBackPressed$42(AlertDialog alertDialog, int i) {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
        }

        public static void lambda$onBackPressed$43(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        public void lambda$onNextPressed$22(DialogInterface dialogInterface) {
            LoginActivity.this.finishFragment();
        }

        public void lambda$onNextPressed$23() {
            int i = 1;
            try {
                LoginActivity.this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.YourPasswordSuccess)).setMessage(LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.requestPhone, PhoneFormat.getInstance()))).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda37(this, i)).show();
        }

        public void lambda$onNextPressed$24(TLRPC.TL_error tL_error, TLObject tLObject) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false, true);
            this.nextPressed = false;
            if (tL_error == null) {
                TLRPC.User user = (TLRPC.User) tLObject;
                destroyTimer();
                destroyCodeTimer();
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).setCurrentUser(user);
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).saveConfig(true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                MessagesStorage.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUsersAndChats(arrayList, null, true, true);
                MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUser(user, false);
                NotificationCenter.getInstance(((BaseFragment) LoginActivity.this).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                LoginActivity.this.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                if (this.currentType == 3) {
                    AndroidUtilities.endIncomingCall();
                }
                animateSuccess(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 2));
                return;
            }
            this.lastError = tL_error.text;
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            int i4 = this.currentType;
            if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                createTimer();
            }
            int i5 = this.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = true;
            if (this.currentType == 3) {
                return;
            }
            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
            } else {
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    shakeWrongCode();
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
            }
            int i6 = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i6 >= codeNumberFieldArr.length) {
                    codeFieldContainer.isFocusSuppressed = false;
                    codeNumberFieldArr[0].requestFocus();
                    return;
                } else {
                    codeNumberFieldArr[i6].setText("");
                    i6++;
                }
            }
        }

        public void lambda$onNextPressed$25(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((NotificationCenter.NotificationCenterDelegate) this, (Object) tL_error, tLObject, 9));
        }

        public void lambda$onNextPressed$26(DialogInterface dialogInterface) {
            LoginActivity.this.finishFragment();
        }

        public void lambda$onNextPressed$27(Activity activity) {
            new AlertDialog.Builder(activity, 0, null).setTitle(LocaleController.getString(R.string.CancelLinkSuccessTitle)).setMessage(LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, UserObject$$ExternalSyntheticOutline0.m(new StringBuilder("+"), this.phone, PhoneFormat.getInstance()))).setPositiveButton(LocaleController.getString(R.string.Close), null).setOnDismissListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda37(this, 0)).show();
        }

        public void lambda$onNextPressed$28(TLRPC.TL_error tL_error, TL_account.confirmPhone confirmphone) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false);
            this.nextPressed = false;
            if (tL_error == null) {
                Activity parentActivity = LoginActivity.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                animateSuccess(new PhotoViewer$$ExternalSyntheticLambda15(6, this, parentActivity));
                return;
            }
            this.lastError = tL_error.text;
            int i4 = this.currentType;
            if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                createTimer();
            }
            int i5 = this.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = true;
            if (this.currentType != 3) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, confirmphone, new Object[0]);
            }
            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                shakeWrongCode();
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
            }
        }

        public void lambda$onNextPressed$29(TL_account.confirmPhone confirmphone, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((Object) this, (Object) tL_error, (Object) confirmphone, 10));
        }

        public void lambda$onNextPressed$30(Bundle bundle) {
            LoginActivity.this.setPage(5, true, bundle, false);
        }

        public void lambda$onNextPressed$31(TLObject tLObject) {
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        public void lambda$onNextPressed$32(Bundle bundle) {
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public void lambda$onNextPressed$33(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            animateSuccess(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(this, bundle, 0));
        }

        public void lambda$onNextPressed$34(TLRPC.TL_auth_signIn tL_auth_signIn, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda20(this, tL_error, tLObject, tL_auth_signIn, 0));
        }

        public void lambda$onNextPressed$36(TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            int i;
            int i2;
            int i3;
            tryHideProgress(false, true);
            if (tL_error == null) {
                this.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                destroyTimer();
                destroyCodeTimer();
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", this.requestPhone);
                    bundle.putString("phoneHash", this.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    animateSuccess(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda28(this, bundle, 1));
                } else {
                    animateSuccess(new PhotoViewer$$ExternalSyntheticLambda15(8, this, tLObject));
                }
            } else {
                String str = tL_error.text;
                this.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda22(this, tL_auth_signIn, 1), 10);
                    destroyTimer();
                    destroyCodeTimer();
                } else {
                    this.nextPressed = false;
                    LoginActivity.this.showDoneButton(false, true);
                    int i4 = this.currentType;
                    if ((i4 == 3 && ((i3 = this.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = this.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = this.nextType) == 2 || i == 17 || i == 16)))) {
                        createTimer();
                    }
                    int i5 = this.currentType;
                    if (i5 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                        AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(19));
                    }
                    this.waitingForEvent = true;
                    if (this.currentType == 3) {
                        return;
                    }
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else {
                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            shakeWrongCode();
                            return;
                        }
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            onBackPressed(true);
                            LoginActivity.this.setPage(0, true, null, true);
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                        } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                        } else {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                        }
                    }
                    int i6 = 0;
                    while (true) {
                        CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                        CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                        if (i6 >= codeNumberFieldArr.length) {
                            codeFieldContainer.isFocusSuppressed = false;
                            codeNumberFieldArr[0].requestFocus();
                            return;
                        } else {
                            codeNumberFieldArr[i6].setText("");
                            i6++;
                        }
                    }
                }
            }
            if (this.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public void lambda$onNextPressed$37(TLRPC.TL_auth_signIn tL_auth_signIn, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda20(this, tL_error, tLObject, tL_auth_signIn, 1));
        }

        public void lambda$onShow$44() {
            CodeNumberField[] codeNumberFieldArr;
            if (this.currentType != 3 && (codeNumberFieldArr = this.codeFieldContainer.codeField) != null) {
                for (int length = codeNumberFieldArr.length - 1; length >= 0; length--) {
                    if (length == 0 || this.codeFieldContainer.codeField[length].length() != 0) {
                        this.codeFieldContainer.codeField[length].requestFocus();
                        CodeNumberField codeNumberField = this.codeFieldContainer.codeField[length];
                        codeNumberField.setSelection(codeNumberField.length());
                        LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[length]);
                        break;
                    }
                }
            }
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            if (this.currentType == 15) {
                this.openFragmentImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                this.openFragmentImageView.getAnimatedDrawable().start();
            }
        }

        public void lambda$resendCode$10(TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            this.nextPressed = false;
            if (tL_error == null) {
                this.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                this.nextCodeAuth = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    this.nextType = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    this.nextType = 16;
                }
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, tL_auth_sentCode);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity loginActivity = LoginActivity.this;
                        String string = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                        StringBuilder sb = new StringBuilder();
                        zzko.m(R.string.ErrorOccurred, "\n", sb);
                        sb.append(tL_error.text);
                        loginActivity.needShowAlert(string, sb.toString());
                    }
                }
            }
            tryHideProgress(false);
        }

        public void lambda$resendCode$11(Bundle bundle, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(6, this, tL_error, bundle, tLObject));
        }

        public void lambda$setParams$21(View view, boolean z) {
            if (z) {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        public void lambda$shakeWrongCode$40() {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public void lambda$shakeWrongCode$41() {
            postDelayed(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 6), 150L);
        }

        public void lambda$tryHideProgress$16() {
            this.blueImageView.setAutoRepeat(false);
            this.blueImageView.setAnimation(this.hintDrawable);
        }

        public void lambda$tryHideProgress$17() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 9));
        }

        public void lambda$tryHideProgress$18() {
            this.dotsToStarsDrawable.setOnAnimationEndListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 8));
            this.blueImageView.setAutoRepeat(false);
            this.dotsToStarsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.dotsToStarsDrawable);
            this.blueImageView.playAnimation();
        }

        public void lambda$tryHideProgress$19() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 5));
        }

        public void lambda$tryShowProgress$13(int i, boolean z) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda42(this, i, z, 0));
        }

        public void lambda$tryShowProgress$14() {
            this.blueImageView.setAutoRepeat(true);
            this.dotsDrawable.setCurrentFrame(0, false);
            this.dotsDrawable.setAutoRepeat(1);
            this.blueImageView.setAnimation(this.dotsDrawable);
            this.blueImageView.playAnimation();
        }

        public void lambda$tryShowProgress$15() {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 0));
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.problemText.invalidate();
            Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putInt("prevType", this.currentType);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda33(this, bundle, 0), 10));
        }

        public void setProblemTextVisible(boolean z) {
            LoadingTextView loadingTextView = this.problemText;
            if (loadingTextView == null) {
                return;
            }
            float f = z ? 1.0f : 0.0f;
            if (loadingTextView.getAlpha() != f) {
                this.problemText.animate().cancel();
                this.problemText.animate().alpha(f).setDuration(150L).start();
            }
        }

        private void shakeWrongCode() {
            int i;
            try {
                this.codeFieldContainer.performHapticFeedback(3, 2);
                while (true) {
                    CodeNumberField[] codeNumberFieldArr = this.codeFieldContainer.codeField;
                    if (i >= codeNumberFieldArr.length) {
                        break;
                    }
                    codeNumberFieldArr[i].setText("");
                    this.codeFieldContainer.codeField[i].animateErrorProgress(1.0f);
                    i++;
                }
            } catch (Exception unused) {
            }
            i = 0;
            if (this.errorViewSwitcher.getCurrentView() != this.wrongCode) {
                this.errorViewSwitcher.showNext();
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, this.currentType == 11 ? 3.5f : 10.0f, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 7));
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        private void tryHideProgress(boolean z) {
            tryHideProgress(z, true);
        }

        private void tryShowProgress(int i) {
            lambda$tryShowProgress$12(i, true);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (this.waitingForEvent) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField == null) {
                    return;
                }
                if (i == NotificationCenter.didReceiveSmsCode) {
                    codeFieldContainer.setText("" + objArr[0]);
                    lambda$onNextPressed$16(null);
                    return;
                }
                if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        if (!this.pattern.equals("*")) {
                            this.catchedPhone = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        lambda$onNextPressed$16(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
        }

        @Override
        public String getHeaderName() {
            int i = this.currentType;
            return (i == 3 || i == 11) ? this.phone : LocaleController.getString("YourCode", R.string.YourCode);
        }

        @Override
        public boolean hasCustomKeyboard() {
            return this.currentType != 3;
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public boolean onBackPressed(boolean z) {
            int i = 1;
            if (LoginActivity.this.activityMode != 0) {
                LoginActivity.this.finishFragment();
                return false;
            }
            int i2 = this.prevType;
            if (i2 != 0) {
                LoginActivity.this.setPage(i2, true, null, true);
                return false;
            }
            if (!z) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity(), 0, null).setTitle(LocaleController.getString(R.string.EditNumber)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.phone))).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.Edit), new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda45(this, i)).create());
                return false;
            }
            this.nextPressed = false;
            tryHideProgress(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.requestPhone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_cancelCode, new PassportActivity$$ExternalSyntheticLambda3(11), 10);
            destroyTimer();
            destroyCodeTimer();
            this.currentParams = null;
            int i3 = this.currentType;
            if (i3 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i3 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i3 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            return true;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onConfigurationChanged(Configuration configuration) {
            CodeNumberField[] codeNumberFieldArr;
            super.onConfigurationChanged(configuration);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || (codeNumberFieldArr = codeFieldContainer.codeField) == null) {
                return;
            }
            for (CodeNumberField codeNumberField : codeNumberFieldArr) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            }
        }

        @Override
        public void onDestroyActivity() {
            super.onDestroyActivity();
            int i = this.currentType;
            if (i == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            destroyTimer();
            destroyCodeTimer();
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public void onHide() {
            Bundle bundle;
            super.onHide();
            this.isResendingCode = false;
            this.nextPressed = false;
            if (this.prevType == 0 || (bundle = this.currentParams) == null) {
                return;
            }
            bundle.putInt("timeout", this.time);
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            if (LoginActivity.this.currentViewNum == 11) {
                if (this.nextPressed) {
                    return;
                }
            } else {
                if (this.nextPressed) {
                    return;
                }
                if ((LoginActivity.this.currentViewNum < 1 || LoginActivity.this.currentViewNum > 4) && LoginActivity.this.currentViewNum != 15) {
                    return;
                }
            }
            if (str == null) {
                str = this.codeFieldContainer.getCode();
            }
            int i = 0;
            if (TextUtils.isEmpty(str)) {
                LoginActivity.this.onFieldError(this.codeFieldContainer, false);
                return;
            }
            if (LoginActivity.this.currentViewNum < 1 || LoginActivity.this.currentViewNum > 4 || !this.codeFieldContainer.isFocusSuppressed) {
                this.nextPressed = true;
                int i2 = this.currentType;
                if (i2 == 15) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i2 == 2) {
                    AndroidUtilities.setWaitingForSms(false);
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
                } else if (i2 == 3) {
                    NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
                }
                this.waitingForEvent = false;
                int i3 = LoginActivity.this.activityMode;
                if (i3 == 1) {
                    this.requestPhone = LoginActivity.this.cancelDeletionPhone;
                    TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
                    confirmphone.phone_code = str;
                    confirmphone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                    codeFieldContainer.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                    int length = codeNumberFieldArr.length;
                    while (i < length) {
                        codeNumberFieldArr[i].animateFocusedProgress(0.0f);
                        i++;
                    }
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(confirmphone, new LinkManager$$ExternalSyntheticLambda15(3, this, confirmphone), 2));
                    return;
                }
                if (i3 == 2) {
                    TL_account.changePhone changephone = new TL_account.changePhone();
                    changephone.phone_number = this.requestPhone;
                    changephone.phone_code = str;
                    changephone.phone_code_hash = this.phoneHash;
                    destroyTimer();
                    CodeFieldContainer codeFieldContainer2 = this.codeFieldContainer;
                    codeFieldContainer2.isFocusSuppressed = true;
                    CodeNumberField[] codeNumberFieldArr2 = codeFieldContainer2.codeField;
                    int length2 = codeNumberFieldArr2.length;
                    while (i < length2) {
                        codeNumberFieldArr2[i].animateFocusedProgress(0.0f);
                        i++;
                    }
                    lambda$tryShowProgress$12(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(changephone, new LinkManager$$ExternalSyntheticLambda10(this, 15), 2), true);
                    LoginActivity.this.showDoneButton(true, true);
                    return;
                }
                TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
                tL_auth_signIn.phone_number = this.requestPhone;
                tL_auth_signIn.phone_code = str;
                tL_auth_signIn.phone_code_hash = this.phoneHash;
                tL_auth_signIn.flags |= 1;
                destroyTimer();
                CodeFieldContainer codeFieldContainer3 = this.codeFieldContainer;
                codeFieldContainer3.isFocusSuppressed = true;
                CodeNumberField[] codeNumberFieldArr3 = codeFieldContainer3.codeField;
                int length3 = codeNumberFieldArr3.length;
                while (i < length3) {
                    codeNumberFieldArr3[i].animateFocusedProgress(0.0f);
                    i++;
                }
                lambda$tryShowProgress$12(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signIn, new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda22(this, tL_auth_signIn, 0), 10), true);
                LoginActivity.this.showDoneButton(true, true);
            }
        }

        @Override
        public void onShow() {
            super.onShow();
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCurrentFrame(0);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 1), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("smsview_params_" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
            String string = bundle.getString("catchedPhone");
            if (string != null) {
                this.catchedPhone = string;
            }
            String string2 = bundle.getString("smsview_code_" + this.currentType);
            if (string2 != null) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (codeFieldContainer.codeField != null) {
                    codeFieldContainer.setText(string2);
                }
            }
            int i = bundle.getInt("time");
            if (i != 0) {
                this.time = i;
            }
            int i2 = bundle.getInt("open");
            if (i2 != 0) {
                this.openTime = i2;
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String code = this.codeFieldContainer.getCode();
            if (code.length() != 0) {
                bundle.putString("smsview_code_" + this.currentType, code);
            }
            String str = this.catchedPhone;
            if (str != null) {
                bundle.putString("catchedPhone", str);
            }
            if (this.currentParams != null) {
                bundle.putBundle("smsview_params_" + this.currentType, this.currentParams);
            }
            int i = this.time;
            if (i != 0) {
                bundle.putInt("time", i);
            }
            int i2 = this.openTime;
            if (i2 != 0) {
                bundle.putInt("open", i2);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            CharSequence charSequenceReplaceTags;
            LoadingTextView loadingTextView;
            int i;
            int i2;
            int i3;
            int i4;
            boolean z2;
            int i5;
            LoadingTextView loadingTextView2;
            int i6;
            int i7;
            String strSubstring;
            String string;
            String strM;
            int i8;
            String strSubstring2;
            int i9;
            int iLastIndexOf;
            SpannableStringBuilder spannableStringBuilder;
            int i10 = 8;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView3 = this.problemText;
                if (loadingTextView3 != null) {
                    loadingTextView3.setVisibility(0);
                    this.problemText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteValueText, false));
                    int i11 = this.nextType;
                    this.problemText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i11 == 17 ? R.string.ReturnEnteringPhrase : i11 == 16 ? R.string.ReturnEnteringWord : R.string.ReturnEnteringSMS), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            }
            this.waitingForEvent = true;
            int i12 = this.currentType;
            if (i12 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i12 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z) {
                    AndroidUtilities.runOnUIThread(new OAuthSheet$$ExternalSyntheticLambda5(18));
                }
            }
            this.currentParams = bundle;
            this.phone = bundle.getString("phone");
            this.emailPhone = bundle.getString("ephone");
            this.requestPhone = bundle.getString("phoneFormated");
            this.phoneHash = bundle.getString("phoneHash");
            this.time = bundle.getInt("timeout");
            this.openTime = (int) (System.currentTimeMillis() / 1000);
            this.nextType = bundle.getInt("nextType");
            this.pattern = bundle.getString("pattern");
            this.prefix = bundle.getString("prefix");
            this.length = bundle.getInt("length");
            this.prevType = bundle.getInt("prevType", 0);
            if (this.length == 0) {
                this.length = 5;
            }
            this.url = bundle.getString("url");
            this.nextCodeParams = null;
            this.nextCodeAuth = null;
            this.codeFieldContainer.setNumbersCount(this.length, this.currentType);
            for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                codeNumberField.setShowSoftInputOnFocusCompat(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
                codeNumberField.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void afterTextChanged(Editable editable) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                        if (LoginActivitySmsView.this.postedErrorColorTimeout) {
                            LoginActivitySmsView loginActivitySmsView = LoginActivitySmsView.this;
                            loginActivitySmsView.removeCallbacks(loginActivitySmsView.errorColorTimeout);
                            LoginActivitySmsView.this.errorColorTimeout.run();
                        }
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i13, int i14, int i15) {
                    }
                });
                codeNumberField.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, i10));
            }
            int i13 = this.prevType;
            if (i13 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i13 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            ProgressView progressView = this.progressView;
            if (progressView != null) {
                progressView.setVisibility(this.nextType != 0 ? 0 : 8);
            }
            if (this.phone == null) {
                return;
            }
            String str = PhoneFormat.getInstance().format(this.phone);
            if (LoginActivity.this.isInCancelAccountDeletionMode()) {
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, PhoneFormat.getInstance().format("+" + str))));
                int iIndexOf = TextUtils.indexOf((CharSequence) spannableStringBuilder, '*');
                int iLastIndexOf2 = TextUtils.lastIndexOf(spannableStringBuilder, '*');
                if (iIndexOf != -1 && iLastIndexOf2 != -1 && iIndexOf != iLastIndexOf2) {
                    this.confirmTextView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                    spannableStringBuilder.replace(iLastIndexOf2, iLastIndexOf2 + 1, (CharSequence) "");
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) "");
                    spannableStringBuilder.setSpan(new URLSpanNoUnderline("tg://settings/change_number"), iIndexOf, iLastIndexOf2 - 1, 33);
                    charSequenceReplaceTags = spannableStringBuilder;
                }
            } else {
                int i14 = this.currentType;
                if (i14 == 1) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(str)));
                } else if (i14 == 2) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(str)));
                } else if (i14 == 3) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(str)));
                } else if (i14 == 4) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(str)));
                } else {
                    charSequenceReplaceTags = i14 == 15 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(str))) : "";
                }
            }
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            this.confirmTextView.setText(charSequenceReplaceTags);
            int i15 = this.currentType;
            if (i15 != 15) {
                if (i15 == 1) {
                    int i16 = this.nextType;
                    if (i16 == 3 || i16 == 4 || i16 == 11) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                    } else if (i16 == 15) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i16 == 0) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                    } else {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                    }
                } else {
                    this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                }
            }
            if (this.currentType != 3) {
                LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[0]);
                this.codeFieldContainer.codeField[0].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeFieldContainer.codeField[0]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i17 = this.currentType;
            if (i17 != 1) {
                if (i17 == 3) {
                    int i18 = this.nextType;
                    if (i18 == 4 || i18 == 2 || i18 == 17 || i18 == 16 || i18 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        int i19 = this.nextType;
                        if (i19 == 4 || i19 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                        } else if (i19 == 2 || i19 == 17 || i19 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        }
                    } else {
                        this.timeText.setVisibility(8);
                    }
                    String strObtainLoginPhoneCall = z ? AndroidUtilities.obtainLoginPhoneCall(this.pattern) : null;
                    if (strObtainLoginPhoneCall != null) {
                        lambda$onNextPressed$16(strObtainLoginPhoneCall);
                    } else {
                        String str2 = this.catchedPhone;
                        if (str2 != null) {
                            lambda$onNextPressed$16(str2);
                        } else {
                            int i20 = this.nextType;
                            if (i20 == 4 || i20 == 2 || i20 == 17 || i20 == 16 || i20 == 11) {
                                createTimer();
                            }
                        }
                    }
                } else if (i17 == 2) {
                    int i21 = this.nextType;
                    if (i21 == 2 || i21 == 17) {
                        i7 = 16;
                    } else {
                        i7 = 16;
                        if (i21 != 16 && i21 != 4 && i21 != 3) {
                            if (i17 != 4) {
                                i3 = this.nextType;
                                if (i3 != 2) {
                                    i4 = 16;
                                } else {
                                    i4 = 16;
                                }
                                if (i3 != 2) {
                                    this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                } else {
                                    this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                                }
                                if (this.time < 1000) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                setProblemTextVisible(z2);
                                LoadingTextView loadingTextView4 = this.timeText;
                                if (this.time < 1000) {
                                    i5 = 8;
                                } else {
                                    i5 = 0;
                                }
                                loadingTextView4.setVisibility(i5);
                                loadingTextView2 = this.problemText;
                                if (loadingTextView2 != null) {
                                    if (this.time < 1000) {
                                        i6 = 0;
                                    } else {
                                        i6 = 8;
                                    }
                                    loadingTextView2.setVisibility(i6);
                                }
                                createTimer();
                            } else if (i17 == 11) {
                                i = this.nextType;
                                if (i != 4) {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i2 = this.nextType;
                                    if (i2 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                } else {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i2 = this.nextType;
                                    if (i2 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                }
                            } else {
                                this.timeText.setVisibility(8);
                                loadingTextView = this.problemText;
                                if (loadingTextView != null) {
                                    loadingTextView.setVisibility(0);
                                }
                                setProblemTextVisible(false);
                                createCodeTimer();
                            }
                        }
                    }
                    if (i21 == 2 || i21 == 17 || i21 == i7) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                    } else {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                    }
                    setProblemTextVisible(this.time < 1000);
                    this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                    LoadingTextView loadingTextView5 = this.problemText;
                    if (loadingTextView5 != null) {
                        loadingTextView5.setVisibility(this.time < 1000 ? 0 : 8);
                    }
                    SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
                    String string2 = sharedPreferences.getString("sms_hash", null);
                    if (TextUtils.isEmpty(string2) || (string = sharedPreferences.getString("sms_hash_code", null)) == null) {
                        strSubstring = null;
                    } else {
                        if (!string.contains(string2 + "|") || LoginActivity.this.newAccount) {
                            strSubstring = null;
                        } else {
                            strSubstring = string.substring(string.indexOf(124) + 1);
                        }
                    }
                    if (strSubstring != null) {
                        this.codeFieldContainer.setCode(strSubstring);
                        lambda$onNextPressed$16(null);
                    } else {
                        createTimer();
                    }
                } else if (i17 != 4) {
                    i3 = this.nextType;
                    if (i3 != 2 || i3 == 17 || i3 == 11) {
                        i4 = 16;
                    } else {
                        i4 = 16;
                        if (i3 != 16) {
                            if (i17 == 11) {
                                i = this.nextType;
                                if (i != 4) {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i2 = this.nextType;
                                    if (i2 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                } else {
                                    setProblemTextVisible(false);
                                    this.timeText.setVisibility(0);
                                    this.problemText.setVisibility(8);
                                    i2 = this.nextType;
                                    if (i2 != 4) {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    } else {
                                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                                    }
                                    createTimer();
                                }
                            } else {
                                this.timeText.setVisibility(8);
                                loadingTextView = this.problemText;
                                if (loadingTextView != null) {
                                    loadingTextView.setVisibility(0);
                                }
                                setProblemTextVisible(false);
                                createCodeTimer();
                            }
                        }
                    }
                    if (i3 != 2 || i3 == 17 || i3 == i4) {
                        this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                    } else {
                        this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 2, 0));
                    }
                    if (this.time < 1000) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    setProblemTextVisible(z2);
                    LoadingTextView loadingTextView6 = this.timeText;
                    if (this.time < 1000) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    loadingTextView6.setVisibility(i5);
                    loadingTextView2 = this.problemText;
                    if (loadingTextView2 != null) {
                        if (this.time < 1000) {
                            i6 = 0;
                        } else {
                            i6 = 8;
                        }
                        loadingTextView2.setVisibility(i6);
                    }
                    createTimer();
                } else if (i17 == 11) {
                    i = this.nextType;
                    if (i != 4 || i == 2 || i == 17 || i == 16 || i == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        i2 = this.nextType;
                        if (i2 != 4 || i2 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                        } else if (i2 == 2 || i2 == 17 || i2 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        }
                        createTimer();
                    }
                } else {
                    this.timeText.setVisibility(8);
                    loadingTextView = this.problemText;
                    if (loadingTextView != null) {
                        loadingTextView.setVisibility(0);
                    }
                    setProblemTextVisible(false);
                    createCodeTimer();
                }
                if (this.currentType == 11) {
                    strM = this.prefix;
                    for (i8 = 0; i8 < this.length; i8++) {
                        strM = zzhp.m(strM, "0");
                    }
                    strSubstring2 = PhoneFormat.getInstance().format("+" + strM);
                    for (i9 = 0; i9 < this.length; i9++) {
                        iLastIndexOf = strSubstring2.lastIndexOf("0");
                        if (iLastIndexOf >= 0) {
                            strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                        }
                    }
                    this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
                }
            }
            setProblemTextVisible(true);
            this.timeText.setVisibility(8);
            LoadingTextView loadingTextView7 = this.problemText;
            if (loadingTextView7 != null) {
                loadingTextView7.setVisibility(0);
            }
            if (this.currentType == 11) {
                strM = this.prefix;
                while (i8 < this.length) {
                    strM = zzhp.m(strM, "0");
                }
                strSubstring2 = PhoneFormat.getInstance().format("+" + strM);
                while (i9 < this.length) {
                    iLastIndexOf = strSubstring2.lastIndexOf("0");
                    if (iLastIndexOf >= 0) {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                    }
                }
                this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
            }
        }

        @Override
        public void updateColors() {
            this.confirmTextView.setTextColor(Theme.getColor(null, LoginActivity.this.isInCancelAccountDeletionMode() ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteGrayText6, false));
            this.confirmTextView.setLinkTextColor(Theme.getColor(null, Theme.key_chats_actionBackground, false));
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(null, i, false));
            if (this.currentType == 11) {
                TextView textView2 = this.missedCallDescriptionSubtitle;
                int i2 = Theme.key_windowBackgroundWhiteGrayText;
                textView2.setTextColor(Theme.getColor(null, i2, false));
                this.missedCallDescriptionSubtitle2.setTextColor(Theme.getColor(null, i2, false));
                ImageView imageView = this.missedCallArrowIcon;
                int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteInputFieldActivated, false);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                this.missedCallPhoneIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), mode));
                this.prefixTextView.setTextColor(Theme.getColor(null, i, false));
            }
            applyLottieColors(this.hintDrawable);
            applyLottieColors(this.starsToDotsDrawable);
            applyLottieColors(this.dotsDrawable);
            applyLottieColors(this.dotsToStarsDrawable);
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.invalidate();
            }
            Integer numValueOf = (Integer) this.timeText.getTag();
            if (numValueOf == null) {
                numValueOf = Integer.valueOf(Theme.key_windowBackgroundWhiteGrayText6);
            }
            this.timeText.setTextColor(Theme.getColor(null, numValueOf.intValue(), false));
            if (this.currentType != 15) {
                this.problemText.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            }
            this.wrongCode.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }

        private void tryHideProgress(boolean z, boolean z2) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needHideProgress(z, z2);
                return;
            }
            if (this.isDotsAnimationVisible) {
                this.isDotsAnimationVisible = false;
                this.blueImageView.setAutoRepeat(false);
                this.dotsDrawable.setAutoRepeat(0);
                RLottieDrawable rLottieDrawable = this.dotsDrawable;
                rLottieDrawable.setOnFinishCallback(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 4), rLottieDrawable.getFramesCount() - 1);
            }
        }

        public void lambda$tryShowProgress$12(int i, boolean z) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needShowProgress(i, z);
                return;
            }
            if (this.isDotsAnimationVisible) {
                return;
            }
            this.isDotsAnimationVisible = true;
            if (this.hintDrawable.getCurrentFrame() != this.hintDrawable.getFramesCount() - 1) {
                this.hintDrawable.setOnAnimationEndListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda42(this, i, z, 1));
                return;
            }
            this.starsToDotsDrawable.setOnAnimationEndListener(new LoginActivity$LoginActivitySmsView$$ExternalSyntheticLambda8(this, 10));
            this.blueImageView.setAutoRepeat(false);
            this.starsToDotsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.starsToDotsDrawable);
            this.blueImageView.playAnimation();
        }
    }

    public class LoginPayView extends SlideView {
        private ButtonWithCounterView button;
        private ExplainStarsSheet.FeatureCell[] cells;
        private String lastError;
        private ImageView optionsButton;
        private Bundle params;
        private boolean polling;
        private long pollingFormId;
        private String pollingPhoneCodeHash;
        private String pollingPhoneNumber;
        private int pollingRequestId;
        private StarParticlesView starParticlesView;

        public LoginPayView(Context context) {
            super(context);
            this.cells = new ExplainStarsSheet.FeatureCell[3];
            this.pollingRequestId = -1;
            setOrientation(1);
            setClipChildren(false);
            setClipToPadding(false);
            setPadding(0, 0, 0, AndroidUtilities.dp(16.0f));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            addView(frameLayout, LayoutHelper.createLinear(-1, 200));
            StarParticlesView starParticlesView = new StarParticlesView(context) {
                @Override
                public void configure() {
                    StarParticlesView.Drawable drawable = this.drawable;
                    drawable.useGradient = true;
                    drawable.useBlur = false;
                    drawable.checkBounds = true;
                    drawable.isCircle = true;
                    drawable.centerOffsetY = AndroidUtilities.dp(-14.0f);
                    StarParticlesView.Drawable drawable2 = this.drawable;
                    drawable2.minLifeTime = 2000L;
                    drawable2.randLifeTime = 3000;
                    drawable2.size1 = 16;
                    drawable2.useRotate = false;
                    drawable2.type = 28;
                    drawable2.colorKey = Theme.key_premiumGradient2;
                    drawable2.init();
                }

                @Override
                public void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                }
            };
            this.starParticlesView = starParticlesView;
            frameLayout.addView(starParticlesView, LayoutHelper.createFrame(-1, 200, 119));
            ImageView imageView = new ImageView(context);
            this.optionsButton = imageView;
            imageView.setImageResource(R.drawable.ic_ab_other);
            this.optionsButton.setScaleType(ImageView.ScaleType.CENTER);
            ImageView imageView2 = this.optionsButton;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, ((BaseFragment) LoginActivity.this).resourceProvider), PorterDuff.Mode.SRC_IN));
            this.optionsButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 1, -1));
            frameLayout.addView(this.optionsButton, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 1) {
                @Override
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    setPaused(false);
                }

                @Override
                public void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    setPaused(true);
                }
            };
            gLIconTextureView.setStarParticlesView(this.starParticlesView);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int i2 = Theme.key_premiumGradient2;
            canvas.drawColor(ColorUtils.blendARGB(0.5f, Theme.getColor(null, i2, false), Theme.getColor(null, Theme.key_dialogBackground, false)));
            gLIconTextureView.setBackgroundBitmap(bitmapCreateBitmap);
            GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
            gLIconRenderer.colorKey1 = i2;
            gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
            gLIconRenderer.updateColors();
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(160, 160, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
            textView.setTextColor(Theme.getColor(null, i, false));
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 16.0f, 152.0f, 16.0f, 0.0f));
            this.cells[0] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[0].set(R.drawable.menu_high_price, LocaleController.getString(R.string.SMSFee1Title), LocaleController.getString(R.string.SMSFee1Text));
            addView(this.cells[0], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[1] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[1].set(R.drawable.menu_feature_code, LocaleController.getString(R.string.SMSFee2Title), LocaleController.getString(R.string.SMSFee2Text));
            addView(this.cells[1], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            this.cells[2] = new ExplainStarsSheet.FeatureCell(context, 1, ((BaseFragment) LoginActivity.this).resourceProvider);
            this.cells[2].set(R.drawable.menu_feature_hands, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new LoginActivity$LoginPayView$$ExternalSyntheticLambda0(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text));
            addView(this.cells[2], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f, 119));
            ButtonWithCounterView round = new ButtonWithCounterView(context, true, null).setRound();
            this.button = round;
            round.setLoading(true);
            addView(this.button, LayoutHelper.createLinear(-1, 48, 7, 0, 16, 0, 16));
        }

        private void closeAllPaymentFormActivities() {
            INavigationLayout parentLayout = LoginActivity.this.getParentLayout();
            if (parentLayout != null) {
                ActionBarLayout actionBarLayout = (ActionBarLayout) parentLayout;
                if (actionBarLayout.getFragmentStack() == null) {
                    return;
                }
                List<BaseFragment> fragmentStack = actionBarLayout.getFragmentStack();
                BaseFragment baseFragment = fragmentStack.isEmpty() ? null : (BaseFragment) RendererCapabilities.CC.m(1, fragmentStack);
                ArrayList arrayList = new ArrayList(fragmentStack);
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    BaseFragment baseFragment2 = (BaseFragment) obj;
                    if ((baseFragment2 instanceof PaymentFormActivity) && baseFragment2 != baseFragment) {
                        baseFragment2.removeSelfFromStack();
                    }
                }
                if (baseFragment instanceof PaymentFormActivity) {
                    ((ActionBarLayout) parentLayout).closeLastFragment(true, false);
                }
            }
        }

        public void lambda$new$0() {
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment("sms");
            premiumPreviewFragment.setCurrentAccount(((BaseFragment) LoginActivity.this).currentAccount);
            LoginActivity.this.presentFragment(premiumPreviewFragment);
        }

        public void lambda$poll$31(TLObject tLObject, TLRPC.TL_error tL_error) {
            this.pollingRequestId = -1;
            int i = 0;
            if (tLObject instanceof TLRPC.auth_SentCode) {
                this.polling = false;
                this.button.setLoading(false);
                closeAllPaymentFormActivities();
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(this.params, (TLRPC.auth_SentCode) tLObject);
                return;
            }
            if (tL_error != null) {
                String str = tL_error.text;
                if (str != null && str.startsWith("FLOOD_WAIT_")) {
                    AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda0(this, i), Integer.parseInt(tL_error.text.substring(11)) * 1000);
                    return;
                }
                String str2 = tL_error.text;
                if (str2 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str2)) {
                    onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                } else {
                    this.lastError = tL_error.text;
                    this.polling = false;
                    this.button.setLoading(false);
                    BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
                }
            }
        }

        public void lambda$poll$32(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, tL_error, 12));
        }

        public void lambda$setParams$1(String str, String str2, String str3) {
            String str4;
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                Locale locale = Locale.US;
                String str5 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                if (TextUtils.isEmpty(str)) {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                } else {
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
                }
                if (TextUtils.isEmpty(str2)) {
                    intent.putExtra("android.intent.extra.SUBJECT", "Android Registration/Login Billing Issue #billing_issue");
                } else {
                    intent.putExtra("android.intent.extra.SUBJECT", str2);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Technical Details (PLEASE DO NOT EDIT OR REMOVE)\n");
                sb.append("Device: ");
                sb.append(Build.MANUFACTURER);
                sb.append(" ");
                sb.append(Build.MODEL);
                sb.append("\n");
                sb.append("OS version: SDK ");
                int i = Build.VERSION.SDK_INT;
                sb.append(i);
                sb.append("\n");
                sb.append("Locale: ");
                sb.append(Locale.getDefault());
                sb.append("\n");
                sb.append("\n");
                sb.append("Target Phone: +");
                sb.append(str3);
                sb.append("\n");
                sb.append("\n");
                try {
                    if (i >= 22) {
                        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(getContext());
                        List completeActiveSubscriptionInfoList = i >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                        if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                            completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                            completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                        }
                        if (completeActiveSubscriptionInfoList != null) {
                            Iterator it = completeActiveSubscriptionInfoList.iterator();
                            while (it.hasNext()) {
                                SubscriptionInfo subscriptionInfoM = LoginActivity$$ExternalSyntheticApiModelOutline2.m(it.next());
                                String number = subscriptionInfoM.getNumber();
                                if (!TextUtils.isEmpty(number)) {
                                    String str6 = "SIM" + subscriptionInfoM.getSimSlotIndex();
                                    sb.append(str6);
                                    sb.append(".Phone: ");
                                    sb.append(number);
                                    sb.append("\n");
                                    sb.append(str6);
                                    sb.append(".MCC: ");
                                    sb.append(subscriptionInfoM.getMcc());
                                    sb.append("\n");
                                    sb.append(str6);
                                    sb.append(".MNC: ");
                                    sb.append(subscriptionInfoM.getMnc());
                                    sb.append("\n");
                                    sb.append(str6);
                                    sb.append(".Carrier: ");
                                    sb.append(TextUtils.isEmpty(subscriptionInfoM.getCarrierName()) ? "unknown" : subscriptionInfoM.getCarrierName());
                                    sb.append("\n\n");
                                }
                            }
                        }
                    } else {
                        try {
                            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
                            if (!TextUtils.isEmpty(line1Number)) {
                                sb.append("SIM0.Phone: ");
                                sb.append(line1Number);
                                sb.append("\n");
                                sb.append("SIM0.MCC: unknown\n");
                                sb.append("SIM0.MNC: unknown\n");
                                sb.append("SIM0.Carrier: unknown\n\n");
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    try {
                        TelephonyManager telephonyManager = (TelephonyManager) getContext().getSystemService(TelephonyManager.class);
                        SignalStrength signalStrength = telephonyManager.getSignalStrength();
                        if (signalStrength != null) {
                            sb.append("Signal: ");
                            sb.append(signalStrength.getLevel());
                            sb.append("/4\n");
                        } else {
                            sb.append("Signal: unknown\n");
                        }
                    } catch (Exception e3) {
                        FileLog.e(e3);
                    }
                } else {
                    sb.append("Signal: unknown\n");
                }
                sb.append("Wi-Fi: ");
                sb.append(AndroidUtilities.isWifiEnabled(getContext()));
                sb.append("\n");
                sb.append("Airplane Mode: ");
                sb.append(AndroidUtilities.isInAirplaneMode(getContext()));
                sb.append("\n");
                sb.append("\n");
                sb.append("App: ");
                sb.append(BuildVars.APP_ID);
                sb.append("\n");
                int i2 = packageInfo.versionCode % 10;
                if (i2 == 1 || i2 == 2) {
                    str4 = "store";
                } else if (ApplicationLoader.isStandaloneBuild()) {
                    str4 = "direct";
                } else if (ApplicationLoader.isBetaBuild()) {
                    str4 = "beta";
                } else {
                    str4 = ApplicationLoader.isHuaweiStoreBuild() ? "huawei" : "universal";
                }
                sb.append("App version: ");
                sb.append(str5);
                sb.append(" ");
                sb.append(str4);
                sb.append("\n");
                sb.append("\n");
                sb.append("Issue: ");
                sb.append("billing_issue");
                sb.append("\n");
                if (!TextUtils.isEmpty(this.lastError)) {
                    sb.append("Error: ");
                    sb.append(this.lastError);
                    sb.append("\n");
                }
                sb.append("\n\n================================================\n");
                sb.append("WRITE YOUR COMMENT HERE:\n");
                sb.append("\n");
                sb.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
        }

        public void lambda$setParams$10(TLObject tLObject, TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_error tL_error) {
            final int i = 1;
            final int i2 = 0;
            this.button.setLoading(false);
            if (tLObject instanceof TLRPC.PaymentForm) {
                final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                LoginActivity.this.getMessagesController().putUsers(paymentForm.users, false);
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.InputInvoice) tL_inputInvoicePremiumAuthCode, true, (BaseFragment) LoginActivity.this);
                paymentFormActivity.setCustomResultReceiver(new Utilities.Callback(this) {
                    public final LoginActivity.LoginPayView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$setParams$4(tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.TL_payments_paymentResult) obj);
                                break;
                            default:
                                this.f$0.lambda$setParams$6(tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.payments_PaymentResult) obj);
                                break;
                        }
                    }
                });
                paymentFormActivity.setCustomAnyResultReceiver(new Utilities.Callback(this) {
                    public final LoginActivity.LoginPayView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run(Object obj) {
                        switch (i) {
                            case 0:
                                this.f$0.lambda$setParams$4(tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.TL_payments_paymentResult) obj);
                                break;
                            default:
                                this.f$0.lambda$setParams$6(tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.payments_PaymentResult) obj);
                                break;
                        }
                    }
                });
                paymentFormActivity.setCustomErrorReceiver(new ProfileActivity$$ExternalSyntheticLambda75(this, 2));
                LoginActivity.this.presentFragment(paymentFormActivity);
                return;
            }
            if (tL_error == null) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError));
            } else if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda0(this, 4));
            } else {
                this.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
            }
        }

        public void lambda$setParams$11(TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22((Object) this, (Object) tLObject, (Object) tL_inputInvoicePremiumAuthCode, (Object) tL_inputStorePaymentAuthCode, tL_error, 27));
        }

        public void lambda$setParams$12(String str, long j, String str2, String str3, int i, View view) {
            if (this.button.isLoading()) {
                return;
            }
            this.button.setLoading(true);
            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
            tL_inputStorePaymentAuthCode.currency = str;
            tL_inputStorePaymentAuthCode.amount = j;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            tL_inputStorePaymentAuthCode.phone_code_hash = str2;
            tL_inputStorePaymentAuthCode.phone_number = str3;
            tL_inputStorePaymentAuthCode.premium_days = i;
            TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
            tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(null, false);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new LinkManager$$ExternalSyntheticLambda0(this, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, 28), 74);
        }

        public void lambda$setParams$13(String str) {
            FileLog.d("LoginBilling purchased done " + str);
            if ("CANCELLED".equalsIgnoreCase(str)) {
                this.button.setLoading(false);
            }
        }

        public static void lambda$setParams$15(Utilities.Callback callback, BillingResult billingResult) {
            int i = billingResult.zza;
            AndroidUtilities.runOnUIThread(new PhotoViewer$$ExternalSyntheticLambda15(10, callback, i == 0 ? null : BillingController.getResponseCodeString(i)));
        }

        public static void lambda$setParams$17(Utilities.Callback callback) {
            AndroidUtilities.runOnUIThread(new CacheControlActivity$$ExternalSyntheticLambda11(2, callback));
        }

        public void lambda$setParams$18(ProductDetails productDetails, Utilities.Callback callback, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode) {
            LoginActivity.this.paid = true;
            BillingController.getInstance().addResultListener(productDetails.zzc, new ChatActivity$$ExternalSyntheticLambda353(callback, 3));
            BillingController.getInstance().setOnCanceled(new CacheControlActivity$$ExternalSyntheticLambda11(1, callback));
            BillingController billingController = BillingController.getInstance();
            Activity parentActivity = LoginActivity.this.getParentActivity();
            AccountInstance accountInstance = AccountInstance.getInstance(((BaseFragment) LoginActivity.this).currentAccount);
            zzcl zzclVar = new zzcl(11, false);
            zzclVar.setProductDetails(productDetails);
            billingController.launchBillingFlow(parentActivity, accountInstance, tL_inputStorePaymentAuthCode, Collections.singletonList(zzclVar.build()));
        }

        public void lambda$setParams$19(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
            LoginActivity.this.paid = true;
            LoginActivity loginActivity = (LoginActivity) LaunchActivity.findFragment(LoginActivity.class);
            if (loginActivity == null) {
                loginActivity = new LoginActivity(((BaseFragment) LoginActivity.this).currentAccount);
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    safeLastFragment.presentFragment(loginActivity);
                }
            }
            loginActivity.open(tL_inputStorePaymentAuthCode.phone_number, tL_updateSentPhoneCode.sent_code);
        }

        public void lambda$setParams$2(String str, String str2, String str3, View view) {
            ItemOptions.makeOptions(LoginActivity.this, this.optionsButton).add(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new LinkManager$$ExternalSyntheticLambda23(7, this, str, str2, str3)).setGravity(5).show();
        }

        public void lambda$setParams$20() {
            this.button.setLoading(false);
        }

        public void lambda$setParams$22(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, Purchase purchase, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda37(2, runnable));
                    return;
                }
                return;
            }
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TL_update.TL_updateSentPhoneCode.class);
            int size = arrayListFindUpdatesAndRemove.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListFindUpdatesAndRemove.get(i);
                i++;
                AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tL_inputStorePaymentAuthCode, (TL_update.TL_updateSentPhoneCode) obj, 11));
            }
            LoginActivity.this.getMessagesController().processUpdates(updates, false);
            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda0(this, 2));
        }

        public void lambda$setParams$23(BillingResult billingResult, List list, String str, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, Runnable runnable) {
            if (billingResult.zza == 0 && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains(str)) {
                        TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                        tL_dataJSON.data = purchase.zza;
                        tL_inputStorePaymentAuthCode.restore = true;
                        tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                        LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new ChatActivity$$ExternalSyntheticLambda147(this, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, runnable, 8), 74);
                        return;
                    }
                }
            }
            runnable.run();
        }

        public void lambda$setParams$24(String str, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, Runnable runnable, BillingResult billingResult, List list) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda53(this, billingResult, list, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable, 6));
        }

        public void lambda$setParams$25(ProductDetails productDetails, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, View view) {
            if (this.button.isLoading()) {
                return;
            }
            this.button.setLoading(true);
            PollItemMenu$$ExternalSyntheticLambda15 pollItemMenu$$ExternalSyntheticLambda15 = new PollItemMenu$$ExternalSyntheticLambda15(this, 11);
            FileLog.d("LoginBilling, querying done purchases...");
            BillingController.getInstance().queryPurchases("inapp", new LoginActivity$LoginPayView$$ExternalSyntheticLambda4(this, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, new LinkManager$$ExternalSyntheticLambda23(8, this, productDetails, pollItemMenu$$ExternalSyntheticLambda15, tL_inputStorePaymentAuthCode)));
        }

        public void lambda$setParams$26(TLObject tLObject, TLRPC.TL_error tL_error, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, int i, ProductDetails productDetails, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
            FileLog.d("LoginBilling canPurchaseStore returned " + tLObject + " " + tL_error);
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                this.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, oneTimePurchaseOfferDetails.zza), false);
                this.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                this.button.setLoading(false);
                this.button.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda13(this, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, 6));
                return;
            }
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                this.lastError = "RESPONSE_FALSE";
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
            } else if (tL_error != null) {
                this.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).showForError(tL_error);
            }
        }

        public void lambda$setParams$27(ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, int i, ProductDetails productDetails, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, String str, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda40(i, oneTimePurchaseOfferDetails, productDetails, str, tLObject, tL_error, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, this));
        }

        public void lambda$setParams$28(String str, BillingResult billingResult, List list, String str2, String str3, int i) {
            StringBuilder sbM80m = Fragment$$ExternalSyntheticOutline0.m80m("LoginBilling queried \"", str, "\" product: ");
            sbM80m.append(BillingController.getResponseCodeString(billingResult.zza));
            FileLog.d(sbM80m.toString());
            if (billingResult.zza != 0) {
                this.lastError = "BILLING_" + BillingController.getResponseCodeString(billingResult.zza);
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(billingResult.zza)));
                return;
            }
            if (list == null || list.isEmpty()) {
                this.lastError = "PRODUCT_NOT_FOUND";
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
                return;
            }
            ProductDetails productDetails = (ProductDetails) list.get(0);
            ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
            TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
            tL_inputStorePaymentAuthCode.currency = oneTimePurchaseOfferDetails.zzc;
            tL_inputStorePaymentAuthCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)) * (oneTimePurchaseOfferDetails.zzb / Math.pow(10.0d, 6.0d)));
            tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str2) ? "" : str2;
            tL_inputStorePaymentAuthCode.phone_number = str3;
            tL_inputStorePaymentAuthCode.premium_days = i;
            StringBuilder sbM80m2 = Fragment$$ExternalSyntheticOutline0.m80m("LoginBilling found \"", str, "\" product, with currency=");
            sbM80m2.append(tL_inputStorePaymentAuthCode.currency);
            sbM80m2.append(" amount=");
            sbM80m2.append(tL_inputStorePaymentAuthCode.amount);
            sbM80m2.append("; phone=");
            sbM80m2.append(str3);
            sbM80m2.append(", phone_code_hash=");
            sbM80m2.append(str2);
            FileLog.d(sbM80m2.toString());
            TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
            tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_payments_canPurchaseStore, new CallLogActivity$$ExternalSyntheticLambda18(this, oneTimePurchaseOfferDetails, i, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, 3), 10);
        }

        public void lambda$setParams$29(String str, String str2, String str3, int i, BillingResult billingResult, List list) {
            AndroidUtilities.runOnUIThread(new ArticleViewer$$ExternalSyntheticLambda20(i, billingResult, str, str2, str3, list, this));
        }

        public void lambda$setParams$3(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public void lambda$setParams$30(String str, String str2, String str3, int i) {
            ArrayList arrayList = new ArrayList();
            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
            accountIdentifiers.zzb = "inapp";
            accountIdentifiers.zza = str;
            arrayList.add(accountIdentifiers.build());
            FileLog.d("LoginBilling querying \"" + str + "\" product");
            BillingController.getInstance().queryProductDetails(arrayList, new PassportActivity$$ExternalSyntheticLambda52(this, str, str2, str3, i));
        }

        public void lambda$setParams$4(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm, TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda12(this, tL_inputStorePaymentAuthCode, paymentForm, 0));
        }

        public void lambda$setParams$5(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public void lambda$setParams$6(TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm, TLRPC.payments_PaymentResult payments_paymentresult) {
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda12(this, tL_inputStorePaymentAuthCode, paymentForm, 1));
        }

        public void lambda$setParams$7() {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public Boolean lambda$setParams$8(TLRPC.TL_error tL_error) {
            if (tL_error == null || !"PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                return Boolean.FALSE;
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$LoginPayView$$ExternalSyntheticLambda0(this, 1));
            return Boolean.TRUE;
        }

        public void lambda$setParams$9() {
            onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public void poll() {
            if (this.polling) {
                TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
                tL_checkPaidAuth.form_id = this.pollingFormId;
                tL_checkPaidAuth.phone_number = this.pollingPhoneNumber;
                tL_checkPaidAuth.phone_code_hash = this.pollingPhoneCodeHash;
                this.pollingRequestId = ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_checkPaidAuth, new LinkManager$$ExternalSyntheticLambda10(this, 16), 1096);
            }
        }

        private void startPoll(String str, String str2, long j) {
            if (this.polling) {
                return;
            }
            this.polling = true;
            this.pollingPhoneNumber = str;
            this.pollingPhoneCodeHash = str2;
            this.pollingFormId = j;
            this.button.setLoading(true);
            poll();
        }

        private void stopPoll() {
            if (this.pollingRequestId >= 0) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cancelRequest(this.pollingRequestId, true);
                this.pollingRequestId = -1;
            }
            this.polling = false;
            this.button.setLoading(false);
        }

        @Override
        public void onHide() {
            super.onHide();
            stopPoll();
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            long j;
            int i;
            super.setParams(bundle, z);
            this.params = bundle;
            String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
            String string = bundle == null ? null : bundle.getString("product");
            String string2 = bundle == null ? null : bundle.getString("phoneFormated");
            String string3 = bundle == null ? null : bundle.getString("phoneHash");
            String string4 = bundle == null ? null : bundle.getString("support_email_email");
            String string5 = bundle == null ? null : bundle.getString("support_email_subject");
            String string6 = bundle == null ? null : bundle.getString("currency");
            long j2 = bundle == null ? 0L : bundle.getLong("amount");
            if (bundle == null) {
                i = 0;
                j = 0;
            } else {
                j = 0;
                i = bundle.getInt("premium_days");
            }
            if (TextUtils.isEmpty(countryName)) {
                this.cells[0].subtitleView.setText(LocaleController.getString(R.string.SMSFee1Text));
            } else {
                this.cells[0].subtitleView.setText(LocaleController.formatString(R.string.SMSFee1TextCountry, countryName));
            }
            this.cells[2].setSubtitle(i == 7 ? LocaleController.getString(R.string.SMSFee3Text) : LocaleController.formatPluralStringComma("SMSFee3TextDays", i));
            this.optionsButton.setOnClickListener(new CallLogActivity$$ExternalSyntheticLambda46(this, string4, string5, string2, 1));
            this.button.setEnabled(true);
            this.button.setOnClickListener(null);
            if (!BuildVars.useInvoiceBilling()) {
                String str = string3;
                int i2 = i;
                if (TextUtils.isEmpty(string)) {
                    this.button.setVisibility(8);
                    return;
                }
                this.button.setVisibility(0);
                this.button.setLoading(true);
                WearAuthSheet$$ExternalSyntheticLambda0 wearAuthSheet$$ExternalSyntheticLambda0 = new WearAuthSheet$$ExternalSyntheticLambda0(this, string, str, string2, i2, 8);
                if (BillingController.getInstance().isReady()) {
                    wearAuthSheet$$ExternalSyntheticLambda0.run();
                    return;
                } else {
                    BillingController.getInstance().whenSetuped(wearAuthSheet$$ExternalSyntheticLambda0);
                    return;
                }
            }
            if (TextUtils.isEmpty(string6) || j2 <= j) {
                this.button.setVisibility(0);
                this.button.setLoading(false);
                this.button.setEnabled(false);
                this.button.setText(LocaleController.getString(R.string.Unavailable), false);
                return;
            }
            this.button.setVisibility(0);
            this.button.setLoading(false);
            this.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j2, string6)), false);
            this.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
            final String str2 = string2;
            final String str3 = string3;
            final String str4 = string6;
            final int i3 = i;
            final long j3 = j2;
            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$setParams$12(str4, j3, str3, str2, i3, view);
                }
            });
        }
    }

    public static final class PhoneInputData {
        private CountrySelectActivity.Country country;
        private List<String> patterns;
        private String phoneNumber;

        private PhoneInputData() {
        }
    }

    public static final class PhoneNumberConfirmView extends FrameLayout {
        private View blurredView;
        private IConfirmDialogCallback callback;
        private TextView confirmMessageView;
        private TextView confirmTextView;
        private View dimmView;
        private boolean dismissed;
        private TextView editTextView;
        private FragmentFloatingButton fabButton;
        private View fabContainer;
        private TransformableLoginButtonView fabTransform;
        private ViewGroup fragmentView;
        private TextView numberView;
        private final PointF pointF;
        private FrameLayout popupLayout;

        public interface IConfirmDialogCallback {
            void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView);

            void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView);
        }

        public void animateProgress(Runnable runnable) {
            this.fabButton.setProgressVisible(true, true);
            AndroidUtilities.runOnUIThread(runnable, 400L);
        }

        public void dismiss() {
            int i = 1;
            if (this.dismissed) {
                return;
            }
            this.dismissed = true;
            this.callback.onDismiss(this);
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (PhoneNumberConfirmView.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) PhoneNumberConfirmView.this.getParent()).removeView(PhoneNumberConfirmView.this);
                    }
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(0);
                }
            });
            duration.addUpdateListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0(this, i));
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public void lambda$dismiss$5(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.blurredView.setAlpha(fFloatValue);
            this.dimmView.setAlpha(fFloatValue);
            this.fabTransform.setProgress(fFloatValue);
            this.popupLayout.setAlpha(fFloatValue);
            float f = (fFloatValue * 0.5f) + 0.5f;
            this.popupLayout.setScaleX(f);
            this.popupLayout.setScaleY(f);
        }

        public void lambda$new$0(View view) {
            dismiss();
        }

        public void lambda$new$1(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onFabPressed(this, this.fabTransform);
        }

        public void lambda$new$2(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onEditPressed(this, this.editTextView);
        }

        public void lambda$new$3(IConfirmDialogCallback iConfirmDialogCallback, View view) {
            iConfirmDialogCallback.onConfirmPressed(this, this.confirmTextView);
        }

        public void lambda$show$4(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.fabTransform.setProgress(fFloatValue);
            this.blurredView.setAlpha(fFloatValue);
            this.dimmView.setAlpha(fFloatValue);
            this.popupLayout.setAlpha(fFloatValue);
            float f = (fFloatValue * 0.5f) + 0.5f;
            this.popupLayout.setScaleX(f);
            this.popupLayout.setScaleY(f);
        }

        public void show() {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                        PhoneNumberConfirmView.this.fabButton.requestFocus();
                    }
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(8);
                    int measuredWidth = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredWidth() / 10.0f);
                    int measuredHeight = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredHeight() / 10.0f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(0.1f, 0.1f);
                    canvas.drawColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                    PhoneNumberConfirmView.this.fragmentView.draw(canvas);
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                    PhoneNumberConfirmView.this.blurredView.setBackground(new BitmapDrawable(PhoneNumberConfirmView.this.getContext().getResources(), bitmapCreateBitmap));
                    PhoneNumberConfirmView.this.blurredView.setAlpha(0.0f);
                    PhoneNumberConfirmView.this.blurredView.setVisibility(0);
                    PhoneNumberConfirmView.this.fragmentView.addView(PhoneNumberConfirmView.this);
                }
            });
            duration.addUpdateListener(new LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0(this, 0));
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public void updateColors() {
            this.fabTransform.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
            this.fabTransform.setBackgroundColor(Theme.getColor(null, Theme.key_chats_actionBackground, false));
            this.popupLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(null, Theme.key_dialogBackground, false)));
            this.confirmMessageView.setTextColor(Theme.getColor(null, Theme.key_dialogTextGray2, false));
            this.numberView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
            TextView textView = this.editTextView;
            int i = Theme.key_changephoneinfo_image2;
            textView.setTextColor(Theme.getColor(null, i, false));
            this.confirmTextView.setTextColor(Theme.getColor(null, i, false));
            this.fabButton.updateColors();
        }

        public void updateFabPosition() {
            ViewPositionWatcher.computeCoordinatesInParent(this.fabContainer, this.fragmentView, this.pointF);
            this.fabButton.setTranslationX(this.pointF.x);
            this.fabButton.setTranslationY(this.pointF.y);
            requestLayout();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredHeight = this.popupLayout.getMeasuredHeight();
            int translationY = (int) (this.fabButton.getTranslationY() - AndroidUtilities.dp(32.0f));
            FrameLayout frameLayout = this.popupLayout;
            frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, this.popupLayout.getRight(), translationY);
        }

        private PhoneNumberConfirmView(Context context, ViewGroup viewGroup, View view, String str, final IConfirmDialogCallback iConfirmDialogCallback) {
            super(context);
            this.pointF = new PointF();
            this.fragmentView = viewGroup;
            this.fabContainer = view;
            this.callback = iConfirmDialogCallback;
            View view2 = new View(getContext());
            this.blurredView = view2;
            view2.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 16));
            addView(this.blurredView, LayoutHelper.createFrame(-1, -1.0f));
            View view3 = new View(getContext());
            this.dimmView = view3;
            view3.setBackgroundColor(1073741824);
            this.dimmView.setAlpha(0.0f);
            addView(this.dimmView, LayoutHelper.createFrame(-1, -1.0f));
            TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(getContext());
            this.fabTransform = transformableLoginButtonView;
            transformableLoginButtonView.setTransformType(1);
            this.fabTransform.setDrawBackground(false);
            FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, null);
            this.fabButton = fragmentFloatingButton;
            fragmentFloatingButton.addView(this.fabTransform, LayoutHelper.createFrame(56, 56, 17));
            this.fabButton.addAdditionalView(this.fabTransform);
            final int i = 0;
            this.fabButton.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.PhoneNumberConfirmView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$1(iConfirmDialogCallback, view4);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(iConfirmDialogCallback, view4);
                            break;
                        default:
                            this.f$0.lambda$new$3(iConfirmDialogCallback, view4);
                            break;
                    }
                }
            });
            this.fabButton.setContentDescription(LocaleController.getString(R.string.Done));
            addView(this.fabButton, LayoutHelper.createFrame(56, 56, 51));
            FrameLayout frameLayout = new FrameLayout(context);
            this.popupLayout = frameLayout;
            addView(frameLayout, LayoutHelper.createFrame(-1, 140.0f, 49, 24.0f, 0.0f, 24.0f, 0.0f));
            TextView textView = new TextView(context);
            this.confirmMessageView = textView;
            textView.setText(LocaleController.getString(R.string.ConfirmCorrectNumber));
            this.confirmMessageView.setTextSize(1, 14.0f);
            this.confirmMessageView.setSingleLine();
            TextView textViewM = zzkj.m(this.popupLayout, this.confirmMessageView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f), context);
            this.numberView = textViewM;
            textViewM.setText(str);
            this.numberView.setTextSize(1, 18.0f);
            this.numberView.setTypeface(AndroidUtilities.bold());
            this.numberView.setSingleLine();
            this.popupLayout.addView(this.numberView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
            int iDp = AndroidUtilities.dp(16.0f);
            TextView textView2 = new TextView(context);
            this.editTextView = textView2;
            textView2.setText(LocaleController.getString(R.string.Edit));
            this.editTextView.setSingleLine();
            this.editTextView.setTextSize(1, 16.0f);
            TextView textView3 = this.editTextView;
            int iDp2 = AndroidUtilities.dp(6.0f);
            int i2 = Theme.key_changephoneinfo_image2;
            textView3.setBackground(Theme.getRoundRectSelectorDrawable(iDp2, Theme.getColor(null, i2, false)));
            final int i3 = 1;
            this.editTextView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.PhoneNumberConfirmView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$1(iConfirmDialogCallback, view4);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(iConfirmDialogCallback, view4);
                            break;
                        default:
                            this.f$0.lambda$new$3(iConfirmDialogCallback, view4);
                            break;
                    }
                }
            });
            TextView textView4 = this.editTextView;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView4.setTypeface(typeface);
            int i4 = iDp / 2;
            this.editTextView.setPadding(iDp, i4, iDp, i4);
            float f = 8;
            TextView textViewM2 = zzkj.m(this.popupLayout, this.editTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f, f, f, f), context);
            this.confirmTextView = textViewM2;
            textViewM2.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            this.confirmTextView.setSingleLine();
            this.confirmTextView.setTextSize(1, 16.0f);
            this.confirmTextView.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(null, i2, false)));
            final int i5 = 2;
            this.confirmTextView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.PhoneNumberConfirmView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view4) {
                    switch (i5) {
                        case 0:
                            this.f$0.lambda$new$1(iConfirmDialogCallback, view4);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(iConfirmDialogCallback, view4);
                            break;
                        default:
                            this.f$0.lambda$new$3(iConfirmDialogCallback, view4);
                            break;
                    }
                }
            });
            this.confirmTextView.setTypeface(typeface);
            this.confirmTextView.setPadding(iDp, i4, iDp, i4);
            this.popupLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f, f, f, f));
            updateFabPosition();
            updateColors();
        }
    }

    public class PhoneView extends SlideView implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
        private Runnable cancelRequestingPasskey;
        private ImageView chevronRight;
        private View codeDividerView;
        private AnimatedPhoneNumberEditText codeField;
        private HashMap<String, List<CountrySelectActivity.Country>> codesMap;
        private boolean confirmedNumber;
        private ArrayList<CountrySelectActivity.Country> countriesArray;
        private TextViewSwitcher countryButton;
        private String countryCodeForHint;
        private OutlineTextContainerView countryOutlineView;
        private int countryState;
        private CountrySelectActivity.Country currentCountry;
        private boolean ignoreOnPhoneChange;
        private boolean ignoreOnPhoneChangePaste;
        private boolean ignoreOnTextChange;
        private boolean ignoreSelection;
        private long lastTitleClick;
        private Toast lastTitleToast;
        private boolean nextPressed;
        private boolean numberFilled;
        private AnimatedPhoneNumberEditText phoneField;
        private HashMap<String, List<String>> phoneFormatMap;
        private OutlineTextContainerView phoneOutlineView;
        private TextView plusTextView;
        private boolean requestedPasskey;
        private boolean requestingPasskey;
        private LinkSpanDrawable.LinksTextView subtitleView;
        private CheckBoxCell syncContactsBox;
        private CheckBoxCell testBackendCheckBox;
        private int titleClickCount;
        private TextView titleView;
        private int wasCountryHintIndex;

        public class AnonymousClass6 implements PhoneNumberConfirmView.IConfirmDialogCallback {
            final String val$code;

            public AnonymousClass6(String str) {
                this.val$code = str;
            }

            public void lambda$onConfirm$0(String str, PhoneNumberConfirmView phoneNumberConfirmView) {
                PhoneView.this.lambda$onNextPressed$16(str);
                LoginActivity.this.floatingButton.progressView.sync(phoneNumberConfirmView.fabButton.progressView);
            }

            public void lambda$onConfirm$1(PhoneNumberConfirmView phoneNumberConfirmView, String str) {
                phoneNumberConfirmView.dismiss();
                AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(this, str, phoneNumberConfirmView), 150L);
            }

            private void onConfirm(PhoneNumberConfirmView phoneNumberConfirmView) {
                int i;
                PhoneView.this.confirmedNumber = true;
                LoginActivity.this.currentDoneType = 0;
                LoginActivity.this.needShowProgress(0, false);
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23 && AndroidUtilities.isSimAvailable()) {
                    boolean z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                    boolean z2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
                    boolean z3 = i2 < 28 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
                    boolean z4 = i2 < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                    if (PhoneView.this.codeField != null && "888".equals(PhoneView.this.codeField.getText())) {
                        z = true;
                        z2 = true;
                        z3 = true;
                        z4 = true;
                    }
                    if (LoginActivity.this.checkPermissions) {
                        LoginActivity.this.permissionsItems.clear();
                        if (!z) {
                            LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                        }
                        if (!z2) {
                            LoginActivity.this.permissionsItems.add("android.permission.CALL_PHONE");
                        }
                        if (!z3) {
                            LoginActivity.this.permissionsItems.add("android.permission.READ_CALL_LOG");
                        }
                        if (!z4 && i2 >= 26) {
                            LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                        }
                        if (!LoginActivity.this.permissionsItems.isEmpty()) {
                            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                            if (!globalMainSettings.getBoolean("firstlogin", true) && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                                try {
                                    LoginActivity.this.getParentActivity().requestPermissions((String[]) LoginActivity.this.permissionsItems.toArray(new String[0]), 6);
                                    return;
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                            }
                            globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
                            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z && (!z2 || !z3)) {
                                builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                                i = R.raw.calls_log;
                            } else if (z2 && z3) {
                                builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                                i = R.raw.incoming_calls;
                            } else {
                                builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                                i = R.raw.calls_log;
                            }
                            builder.setTopAnimation(i, 46, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
                            LoginActivity loginActivity = LoginActivity.this;
                            loginActivity.permissionsDialog = loginActivity.showDialog(builder.create());
                            PhoneView.this.confirmedNumber = true;
                            return;
                        }
                    }
                }
                phoneNumberConfirmView.animateProgress(new LoginActivity$PhoneView$6$$ExternalSyntheticLambda0(this, phoneNumberConfirmView, this.val$code));
            }

            @Override
            public void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                onConfirm(phoneNumberConfirmView);
            }

            @Override
            public void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView) {
                LoginActivity.this.phoneNumberConfirmView = null;
            }

            @Override
            public void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                phoneNumberConfirmView.dismiss();
            }

            @Override
            public void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView) {
                onConfirm(phoneNumberConfirmView);
            }
        }

        public PhoneView(Context context) {
            int i;
            super(context);
            this.countryState = 0;
            this.countriesArray = new ArrayList<>();
            this.codesMap = new HashMap<>();
            this.phoneFormatMap = new HashMap<>();
            this.ignoreSelection = false;
            this.ignoreOnTextChange = false;
            this.ignoreOnPhoneChange = false;
            this.ignoreOnPhoneChangePaste = false;
            this.nextPressed = false;
            this.confirmedNumber = false;
            this.titleClickCount = 0;
            this.lastTitleClick = 0L;
            this.wasCountryHintIndex = -1;
            this.requestedPasskey = false;
            this.requestingPasskey = false;
            setOrientation(1);
            setGravity(17);
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextSize(1, 18.0f);
            this.titleView.setTypeface(AndroidUtilities.bold());
            this.titleView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneNewNumber : R.string.YourNumber));
            this.titleView.setGravity(17);
            this.titleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.titleView, LayoutHelper.createFrame(-1, -2.0f, 1, 32.0f, 0.0f, 32.0f, 0.0f));
            this.titleView.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(15, this, context));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
            this.subtitleView.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.subtitleView, LayoutHelper.createLinear(-1, -2, 1, 32, 8, 32, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.countryButton = textViewSwitcher;
            textViewSwitcher.setFactory(new PhotoViewer$$ExternalSyntheticLambda57(context, 1));
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
            animationLoadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setInAnimation(animationLoadAnimation);
            ImageView imageView = new ImageView(context);
            this.chevronRight = imageView;
            imageView.setImageResource(R.drawable.msg_inputarrow);
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setGravity(16);
            linearLayout.addView(this.countryButton, LayoutHelper.createLinear(0, -2, 1.0f, 0, 0, 0, 0));
            linearLayout.addView(this.chevronRight, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
            OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
            this.countryOutlineView = outlineTextContainerView;
            int i2 = R.string.Country;
            outlineTextContainerView.setText(LocaleController.getString(i2));
            this.countryOutlineView.addView(linearLayout, LayoutHelper.createFrame(-1, -1.0f, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            this.countryOutlineView.setForceUseCenter(true);
            this.countryOutlineView.setFocusable(true);
            this.countryOutlineView.setContentDescription(LocaleController.getString(i2));
            this.countryOutlineView.setOnFocusChangeListener(new DialogsActivity$$ExternalSyntheticLambda37(this, 9));
            addView(this.countryOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 14.0f));
            final int i3 = 0;
            this.countryOutlineView.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$6(view);
                            break;
                        default:
                            this.f$0.lambda$new$9(view);
                            break;
                    }
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.phoneOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
            OutlineTextContainerView outlineTextContainerView3 = this.phoneOutlineView;
            int i4 = R.string.PhoneNumber;
            outlineTextContainerView3.setText(LocaleController.getString(i4));
            addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 8.0f, 16.0f, 8.0f));
            TextView textView2 = new TextView(context);
            this.plusTextView = textView2;
            textView2.setText("+");
            this.plusTextView.setTextSize(1, 16.0f);
            this.plusTextView.setFocusable(false);
            linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) {
                @Override
                public void onFocusChanged(boolean z, int i5, Rect rect) {
                    super.onFocusChanged(z, i5, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.phoneField.isFocused()) ? 1.0f : 0.0f);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                    }
                }
            };
            this.codeField = animatedPhoneNumberEditText;
            animatedPhoneNumberEditText.setInputType(3);
            this.codeField.setCursorSize(AndroidUtilities.dp(20.0f));
            this.codeField.setCursorWidth(1.5f);
            this.codeField.setPadding(AndroidUtilities.dp(10.0f), 0, 0, 0);
            this.codeField.setTextSize(1, 16.0f);
            this.codeField.setMaxLines(1);
            this.codeField.setGravity(19);
            this.codeField.setImeOptions(268435461);
            this.codeField.setBackground(null);
            this.codeField.setShowSoftInputOnFocus(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            this.codeField.setContentDescription(LocaleController.getString(R.string.LoginAccessibilityCountryCode));
            linearLayout2.addView(this.codeField, LayoutHelper.createLinear(55, 36, -9.0f, 0.0f, 0.0f, 0.0f));
            this.codeField.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    String str;
                    boolean z;
                    CountrySelectActivity.Country country;
                    CountrySelectActivity.Country country2;
                    if (PhoneView.this.ignoreOnTextChange) {
                        return;
                    }
                    PhoneView.this.ignoreOnTextChange = true;
                    String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PhoneView.this.codeField.getText().toString(), false);
                    PhoneView.this.codeField.setText(strStripExceptNumbers);
                    if (strStripExceptNumbers.length() == 0) {
                        PhoneView.this.setCountryButtonText(null);
                        PhoneView.this.phoneField.setHintText((String) null);
                        PhoneView.this.countryState = 1;
                    } else {
                        int i5 = 4;
                        if (strStripExceptNumbers.length() > 4) {
                            while (true) {
                                if (i5 < 1) {
                                    str = null;
                                    z = false;
                                    break;
                                }
                                String strSubstring = strStripExceptNumbers.substring(0, i5);
                                List list = (List) PhoneView.this.codesMap.get(strSubstring);
                                if (list == null) {
                                    country2 = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                    country2 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list);
                                    if (string != null) {
                                        ArrayList arrayList = PhoneView.this.countriesArray;
                                        int size = arrayList.size();
                                        int i6 = 0;
                                        while (i6 < size) {
                                            Object obj = arrayList.get(i6);
                                            i6++;
                                            CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) obj;
                                            if (Objects.equals(country3.shortname, string)) {
                                                country2 = country3;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    country2 = (CountrySelectActivity.Country) list.get(0);
                                }
                                if (country2 != null) {
                                    String str2 = strStripExceptNumbers.substring(i5) + PhoneView.this.phoneField.getText().toString();
                                    PhoneView.this.codeField.setText(strSubstring);
                                    str = str2;
                                    strStripExceptNumbers = strSubstring;
                                    z = true;
                                    break;
                                }
                                i5--;
                            }
                            if (!z) {
                                str = strStripExceptNumbers.substring(1) + PhoneView.this.phoneField.getText().toString();
                                AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = PhoneView.this.codeField;
                                strStripExceptNumbers = strStripExceptNumbers.substring(0, 1);
                                animatedPhoneNumberEditText2.setText(strStripExceptNumbers);
                            }
                        } else {
                            str = null;
                            z = false;
                        }
                        ArrayList arrayList2 = PhoneView.this.countriesArray;
                        int size2 = arrayList2.size();
                        CountrySelectActivity.Country country4 = null;
                        int i7 = 0;
                        int i8 = 0;
                        while (i7 < size2) {
                            Object obj2 = arrayList2.get(i7);
                            i7++;
                            CountrySelectActivity.Country country5 = (CountrySelectActivity.Country) obj2;
                            if (country5.code.startsWith(strStripExceptNumbers)) {
                                int i9 = i8 + 1;
                                if (country5.code.equals(strStripExceptNumbers)) {
                                    if (country4 == null || !country4.code.equals(country5.code)) {
                                        i8 = i9;
                                    }
                                    country4 = country5;
                                } else {
                                    i8 = i9;
                                }
                            }
                        }
                        if (i8 == 1 && country4 != null && str == null) {
                            str = strStripExceptNumbers.substring(country4.code.length()) + PhoneView.this.phoneField.getText().toString();
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = PhoneView.this.codeField;
                            String str3 = country4.code;
                            animatedPhoneNumberEditText3.setText(str3);
                            strStripExceptNumbers = str3;
                        }
                        List list2 = (List) PhoneView.this.codesMap.get(strStripExceptNumbers);
                        if (list2 == null) {
                            country = null;
                        } else if (list2.size() > 1) {
                            String string2 = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strStripExceptNumbers, null);
                            country = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                            if (string2 != null) {
                                ArrayList arrayList3 = PhoneView.this.countriesArray;
                                int size3 = arrayList3.size();
                                int i10 = 0;
                                while (i10 < size3) {
                                    Object obj3 = arrayList3.get(i10);
                                    i10++;
                                    CountrySelectActivity.Country country6 = (CountrySelectActivity.Country) obj3;
                                    if (Objects.equals(country6.shortname, string2)) {
                                        country = country6;
                                        break;
                                    }
                                }
                            }
                        } else {
                            country = (CountrySelectActivity.Country) list2.get(0);
                        }
                        if (country != null) {
                            PhoneView.this.ignoreSelection = true;
                            PhoneView.this.currentCountry = country;
                            PhoneView.this.setCountryHint(strStripExceptNumbers, country);
                            PhoneView.this.countryState = 0;
                        } else {
                            PhoneView.this.setCountryButtonText(null);
                            PhoneView.this.phoneField.setHintText((String) null);
                            PhoneView.this.countryState = 2;
                        }
                        if (!z) {
                            PhoneView.this.codeField.setSelection(PhoneView.this.codeField.getText().length());
                        }
                        if (str != null) {
                            PhoneView.this.phoneField.requestFocus();
                            PhoneView.this.phoneField.setText(str);
                            PhoneView.this.phoneField.setSelection(PhoneView.this.phoneField.length());
                        }
                    }
                    PhoneView.this.ignoreOnTextChange = false;
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                }
            });
            final int i5 = 0;
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i6, KeyEvent keyEvent) {
                    switch (i5) {
                        case 0:
                            return this.f$0.lambda$new$7(textView3, i6, keyEvent);
                        default:
                            return this.f$0.lambda$new$8(textView3, i6, keyEvent);
                    }
                }
            });
            this.codeDividerView = new View(context);
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
            layoutParamsCreateLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
            linearLayout2.addView(this.codeDividerView, layoutParamsCreateLinear);
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) {
                @Override
                public void onFocusChanged(boolean z, int i6, Rect rect) {
                    super.onFocusChanged(z, i6, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.codeField.isFocused()) ? 1.0f : 0.0f);
                    if (!z) {
                        if (PhoneView.this.countryState == 2) {
                            PhoneView.this.setCountryButtonText(null);
                        }
                    } else {
                        LoginActivity.this.keyboardView.setEditText(this);
                        LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
                        if (PhoneView.this.countryState == 2) {
                            PhoneView.this.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
                        }
                    }
                }

                @Override
                public boolean onKeyDown(int i6, KeyEvent keyEvent) {
                    if (i6 == 67 && PhoneView.this.phoneField.length() == 0) {
                        PhoneView.this.codeField.requestFocus();
                        PhoneView.this.codeField.setSelection(PhoneView.this.codeField.length());
                        PhoneView.this.codeField.dispatchKeyEvent(keyEvent);
                    }
                    return super.onKeyDown(i6, keyEvent);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && !LoginActivity.this.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.phoneField = animatedPhoneNumberEditText2;
            animatedPhoneNumberEditText2.setInputType(3);
            this.phoneField.setPadding(0, 0, 0, 0);
            this.phoneField.setCursorSize(AndroidUtilities.dp(20.0f));
            this.phoneField.setCursorWidth(1.5f);
            this.phoneField.setTextSize(1, 16.0f);
            this.phoneField.setMaxLines(1);
            this.phoneField.setGravity(19);
            this.phoneField.setImeOptions(268435461);
            this.phoneField.setBackground(null);
            this.phoneField.setShowSoftInputOnFocus(!hasCustomKeyboard() || LoginActivity.this.isCustomKeyboardForceDisabled());
            this.phoneField.setContentDescription(LocaleController.getString(i4));
            linearLayout2.addView(this.phoneField, LayoutHelper.createFrame(-1, 36.0f));
            this.phoneField.addTextChangedListener(new TextWatcher() {
                private int actionPosition;
                private int characterAction = -1;

                @Override
                public void afterTextChanged(Editable editable) {
                    int i6;
                    int i7;
                    if (PhoneView.this.ignoreOnPhoneChange) {
                        return;
                    }
                    int selectionStart = PhoneView.this.phoneField.getSelectionStart();
                    String string = PhoneView.this.phoneField.getText().toString();
                    if (this.characterAction == 3) {
                        string = string.substring(0, this.actionPosition) + string.substring(this.actionPosition + 1);
                        selectionStart--;
                    }
                    StringBuilder sb = new StringBuilder(string.length());
                    int i8 = 0;
                    while (i8 < string.length()) {
                        int i9 = i8 + 1;
                        String strSubstring = string.substring(i8, i9);
                        if ("0123456789".contains(strSubstring)) {
                            sb.append(strSubstring);
                        }
                        i8 = i9;
                    }
                    PhoneView.this.ignoreOnPhoneChange = true;
                    String hintText = PhoneView.this.phoneField.getHintText();
                    if (hintText != null) {
                        int i10 = 0;
                        while (i10 < sb.length()) {
                            if (i10 >= hintText.length()) {
                                sb.insert(i10, ' ');
                                if (selectionStart == i10 + 1 && (i6 = this.characterAction) != 2 && i6 != 3) {
                                    selectionStart++;
                                    break;
                                } else {
                                    break;
                                    break;
                                    break;
                                }
                            }
                            if (hintText.charAt(i10) == ' ') {
                                sb.insert(i10, ' ');
                                i10++;
                                if (selectionStart == i10 && (i7 = this.characterAction) != 2 && i7 != 3) {
                                    selectionStart++;
                                }
                            }
                            i10++;
                        }
                    }
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        PhoneView.this.phoneField.setSelection(Math.min(selectionStart, PhoneView.this.phoneField.length()));
                    }
                    PhoneView.this.phoneField.onTextChange();
                    PhoneView.this.invalidateCountryHint();
                    PhoneView.this.ignoreOnPhoneChange = false;
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                    if (i7 == 0 && i8 == 1) {
                        this.characterAction = 1;
                        return;
                    }
                    if (i7 != 1 || i8 != 0) {
                        this.characterAction = -1;
                    } else if (charSequence.charAt(i6) != ' ' || i6 <= 0) {
                        this.characterAction = 2;
                    } else {
                        this.characterAction = 3;
                        this.actionPosition = i6 - 1;
                    }
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i6, int i7, int i8) {
                }
            });
            final int i6 = 1;
            this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener(this) {
                public final LoginActivity.PhoneView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final boolean onEditorAction(TextView textView3, int i7, KeyEvent keyEvent) {
                    switch (i6) {
                        case 0:
                            return this.f$0.lambda$new$7(textView3, i7, keyEvent);
                        default:
                            return this.f$0.lambda$new$8(textView3, i7, keyEvent);
                    }
                }
            });
            if (LoginActivity.this.newAccount && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 2);
                this.syncContactsBox = checkBoxCell;
                checkBoxCell.setText(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", LoginActivity.this.syncContacts, false, false);
                addView(this.syncContactsBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                final int i7 = 1;
                this.syncContactsBox.setOnClickListener(new View.OnClickListener(this) {
                    public final LoginActivity.PhoneView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.f$0.lambda$new$6(view);
                                break;
                            default:
                                this.f$0.lambda$new$9(view);
                                break;
                        }
                    }
                });
                i = 48;
            } else {
                i = 72;
            }
            boolean z = BuildVars.DEBUG_VERSION || LoginActivity.this.getConnectionsManager().isTestBackend();
            if (z && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 2);
                this.testBackendCheckBox = checkBoxCell2;
                checkBoxCell2.setText(LocaleController.getString(R.string.DebugTestBackend), "", LoginActivity.this.testBackend = LoginActivity.this.getConnectionsManager().isTestBackend(), false, false);
                addView(this.testBackendCheckBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                i -= 24;
                this.testBackendCheckBox.setOnClickListener(new LinkEditActivity$$ExternalSyntheticLambda10(this, z, 1));
            }
            if (i > 0 && !AndroidUtilities.isSmallScreen()) {
                Space space = new Space(context);
                space.setMinimumHeight(AndroidUtilities.dp(i));
                addView(space, LayoutHelper.createLinear(-2, -2));
            }
            HashMap map = new HashMap();
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(getResources().getAssets().open("countries.txt")));
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    String[] strArrSplit = line.split(";");
                    CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                    country.name = strArrSplit[2];
                    String str = strArrSplit[0];
                    country.code = str;
                    country.shortname = strArrSplit[1];
                    if (!TextUtils.equals(str, "FT")) {
                        String countryName = LocaleController.getCountryName(country.shortname);
                        if (!TextUtils.isEmpty(countryName) && !TextUtils.equals(country.shortname, countryName)) {
                            country.defaultName = country.name;
                            country.name = countryName;
                        }
                    }
                    this.countriesArray.add(0, country);
                    List<CountrySelectActivity.Country> list = this.codesMap.get(strArrSplit[0]);
                    if (list == null) {
                        HashMap<String, List<CountrySelectActivity.Country>> map2 = this.codesMap;
                        String str2 = strArrSplit[0];
                        ArrayList arrayList = new ArrayList();
                        map2.put(str2, arrayList);
                        list = arrayList;
                    }
                    list.add(country);
                    if (strArrSplit.length > 3) {
                        this.phoneFormatMap.put(strArrSplit[0], Collections.singletonList(strArrSplit[3]));
                    }
                    map.put(strArrSplit[1], strArrSplit[2]);
                }
                bufferedReader.close();
            } catch (Exception e) {
                FileLog.e(e);
            }
            Collections.sort(this.countriesArray, Comparator$CC.comparing(new GroupCallSheet$$ExternalSyntheticLambda0(4)));
            try {
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            LoginActivity.this.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new LinkManager$$ExternalSyntheticLambda15(4, this, map), 10);
            if (this.codeField.length() == 0) {
                setCountryButtonText(null);
                this.phoneField.setHintText((String) null);
                this.countryState = 1;
            }
            if (this.codeField.length() != 0) {
                this.phoneField.requestFocus();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText3 = this.phoneField;
                animatedPhoneNumberEditText3.setSelection(animatedPhoneNumberEditText3.length());
            } else {
                this.codeField.requestFocus();
            }
            loadCountries();
        }

        public void invalidateCountryHint() {
            int i;
            String str = this.countryCodeForHint;
            String strReplace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
            if (this.phoneFormatMap.get(str) == null || this.phoneFormatMap.get(str).isEmpty()) {
                if (this.wasCountryHintIndex != -1) {
                    int selectionStart = this.phoneField.getSelectionStart();
                    int selectionEnd = this.phoneField.getSelectionEnd();
                    this.phoneField.setHintText((String) null);
                    this.phoneField.setSelection(selectionStart, selectionEnd);
                    this.wasCountryHintIndex = -1;
                    return;
                }
                return;
            }
            List<String> list = this.phoneFormatMap.get(str);
            if (strReplace.isEmpty()) {
                i = -1;
                break;
            }
            i = 0;
            while (true) {
                if (i >= list.size()) {
                    i = -1;
                    break;
                } else if (strReplace.startsWith(list.get(i).replace(" ", "").replace("X", "").replace("0", ""))) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    String str2 = list.get(i2);
                    if (str2.startsWith("X") || str2.startsWith("0")) {
                        i = i2;
                        break;
                    }
                }
                if (i == -1) {
                    i = 0;
                }
            }
            if (this.wasCountryHintIndex != i) {
                String str3 = this.phoneFormatMap.get(str).get(i);
                int selectionStart2 = this.phoneField.getSelectionStart();
                int selectionEnd2 = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                animatedPhoneNumberEditText.setSelection(Math.max(0, Math.min(animatedPhoneNumberEditText.length(), selectionStart2)), Math.max(0, Math.min(this.phoneField.length(), selectionEnd2)));
                this.wasCountryHintIndex = i;
            }
        }

        public void lambda$fillNumber$24(List list) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("firstloginshow", true) && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                LoginActivity.this.getParentActivity().requestPermissions((String[]) list.toArray(new String[0]), 7);
                return;
            }
            globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
            builder.setTopAnimation(R.raw.incoming_calls, 46, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            builder.setMessage(LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber));
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.permissionsShowDialog = loginActivity.showDialog(builder.create(), true, null);
            LoginActivity.this.needRequestPermissions = true;
        }

        public void lambda$loadCountries$14(TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error == null) {
                this.countriesArray.clear();
                this.codesMap.clear();
                this.phoneFormatMap.clear();
                TLRPC.TL_help_countriesList tL_help_countriesList = (TLRPC.TL_help_countriesList) tLObject;
                for (int i = 0; i < tL_help_countriesList.countries.size(); i++) {
                    TLRPC.TL_help_country tL_help_country = tL_help_countriesList.countries.get(i);
                    for (int i2 = 0; i2 < tL_help_country.country_codes.size(); i2++) {
                        TLRPC.TL_help_countryCode tL_help_countryCode = tL_help_country.country_codes.get(i2);
                        if (tL_help_countryCode != null) {
                            CountrySelectActivity.Country country = new CountrySelectActivity.Country();
                            String str = tL_help_country.name;
                            country.name = str;
                            String str2 = tL_help_country.default_name;
                            country.defaultName = str2;
                            if (str == null && str2 != null) {
                                country.name = str2;
                            }
                            country.code = tL_help_countryCode.country_code;
                            country.shortname = tL_help_country.iso2;
                            this.countriesArray.add(country);
                            List<CountrySelectActivity.Country> list = this.codesMap.get(tL_help_countryCode.country_code);
                            if (list == null) {
                                HashMap<String, List<CountrySelectActivity.Country>> map = this.codesMap;
                                String str3 = tL_help_countryCode.country_code;
                                ArrayList arrayList = new ArrayList();
                                map.put(str3, arrayList);
                                list = arrayList;
                            }
                            list.add(country);
                            if (tL_help_countryCode.patterns.size() > 0) {
                                this.phoneFormatMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                            }
                        }
                    }
                }
                if (LoginActivity.this.activityMode == 2) {
                    String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getClientPhone(), false);
                    if (TextUtils.isEmpty(strStripExceptNumbers)) {
                        return;
                    }
                    if (strStripExceptNumbers.length() > 4) {
                        for (int i3 = 4; i3 >= 1; i3--) {
                            String strSubstring = strStripExceptNumbers.substring(0, i3);
                            List<CountrySelectActivity.Country> list2 = this.codesMap.get(strSubstring);
                            CountrySelectActivity.Country country2 = null;
                            if (list2 != null) {
                                if (list2.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                    if (string != null) {
                                        CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                        ArrayList<CountrySelectActivity.Country> arrayList2 = this.countriesArray;
                                        int size = arrayList2.size();
                                        int i4 = 0;
                                        while (true) {
                                            if (i4 >= size) {
                                                country2 = country3;
                                                break;
                                            }
                                            CountrySelectActivity.Country country4 = arrayList2.get(i4);
                                            i4++;
                                            CountrySelectActivity.Country country5 = country4;
                                            if (Objects.equals(country5.shortname, string)) {
                                                country2 = country5;
                                                break;
                                            }
                                        }
                                    } else {
                                        country2 = (CountrySelectActivity.Country) RendererCapabilities.CC.m(1, list2);
                                    }
                                } else {
                                    country2 = list2.get(0);
                                }
                            }
                            if (country2 != null) {
                                this.codeField.setText(strSubstring);
                                return;
                            }
                        }
                        this.codeField.setText(strStripExceptNumbers.substring(0, 1));
                    }
                }
            }
        }

        public void lambda$loadCountries$15(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda11(this, tL_error, tLObject, 1));
        }

        public void lambda$new$1(Context context, View view) {
            Toast toast = this.lastTitleToast;
            if (toast != null) {
                toast.cancel();
                this.lastTitleToast = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.titleClickCount > 0 && jCurrentTimeMillis - this.lastTitleClick > 1500) {
                this.titleClickCount = 0;
            }
            int i = this.titleClickCount + 1;
            this.titleClickCount = i;
            this.lastTitleClick = jCurrentTimeMillis;
            if (i >= 5) {
                this.titleClickCount = 0;
                this.lastTitleClick = 0L;
                showDebugMenu();
            } else if (i > 1) {
                Toast toastMakeText = Toast.makeText(context, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i, new Object[0]), 0);
                this.lastTitleToast = toastMakeText;
                toastMakeText.show();
            }
        }

        public void lambda$new$10(boolean z, View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.testBackend = !loginActivity.testBackend;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.testBackend, true);
            if ((z && LoginActivity.this.getConnectionsManager().isTestBackend()) != LoginActivity.this.testBackend) {
                LoginActivity.this.getConnectionsManager().switchBackend(false);
            }
            loadCountries();
        }

        public void lambda$new$12(TLObject tLObject, HashMap map) {
            if (tLObject == null) {
                return;
            }
            TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject;
            if (this.codeField.length() == 0) {
                setCountry(map, tL_nearestDc.country.toUpperCase());
            }
        }

        public void lambda$new$13(HashMap map, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25(this, tLObject, map, 13));
        }

        public static View lambda$new$2(Context context) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            textView.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            return textView;
        }

        public void lambda$new$3(View view, boolean z) {
            this.countryOutlineView.animateSelection(z ? 1.0f : 0.0f);
        }

        public void lambda$new$4() {
            LoginActivity.this.showKeyboard(this.phoneField);
        }

        public void lambda$new$5(CountrySelectActivity.Country country) {
            selectCountry(country);
            AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda6(this, 2), 300L);
            this.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        }

        public void lambda$new$6(View view) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true, this.countriesArray);
            countrySelectActivity.setCountrySelectActivityDelegate(new TodoItemMenu$$ExternalSyntheticLambda3(this, 4));
            LoginActivity.this.presentFragment(countrySelectActivity);
        }

        public boolean lambda$new$7(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            this.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }

        public boolean lambda$new$8(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                return false;
            }
            if (LoginActivity.this.phoneNumberConfirmView != null) {
                LoginActivity.this.phoneNumberConfirmView.fabButton.callOnClick();
                return true;
            }
            lambda$onNextPressed$16(null);
            return true;
        }

        public void lambda$new$9(View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.syncContacts = !loginActivity.syncContacts;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.syncContacts, true);
            if (LoginActivity.this.syncContacts) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.contacts_sync_on, LocaleController.getString("SyncContactsOn", R.string.SyncContactsOn)).show();
            } else {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.contacts_sync_off, LocaleController.getString("SyncContactsOff", R.string.SyncContactsOff)).show();
            }
        }

        public void lambda$onNextPressed$17(String str) {
            postDelayed(new LoginActivity$PhoneView$$ExternalSyntheticLambda7(this, str, 1), 200L);
        }

        public void lambda$onNextPressed$18(int i, AlertDialog alertDialog, int i2) {
            if (UserConfig.selectedAccount != i) {
                ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, true);
            }
            LoginActivity.this.finishFragment();
        }

        public void lambda$onNextPressed$20(TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", str);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public void lambda$onNextPressed$21(String str, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(9, this, tL_error, tLObject, str));
        }

        public void lambda$onNextPressed$22(TLRPC.TL_error tL_error, TLObject tLObject, Bundle bundle, String str, PhoneInputData phoneInputData, TLObject tLObject2) {
            int i = 5;
            this.nextPressed = false;
            if (tL_error != null) {
                String str2 = tL_error.text;
                if (str2 != null) {
                    if (str2.contains("SESSION_PASSWORD_NEEDED")) {
                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LinkManager$$ExternalSyntheticLambda15(i, this, str), 10);
                    } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, false);
                    } else if (tL_error.text.contains("PHONE_PASSWORD_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else if (tL_error.text.contains("PHONE_NUMBER_FLOOD")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("PhoneNumberFlood", R.string.PhoneNumberFlood));
                    } else if (tL_error.text.contains("PHONE_NUMBER_BANNED")) {
                        LoginActivity.needShowInvalidAlert(LoginActivity.this, str, phoneInputData, true);
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tLObject2, phoneInputData.phoneNumber);
                    }
                }
            } else if (tLObject instanceof TLRPC.TL_auth_sentCodeSuccess) {
                TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject).authorization;
                if (auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    LoginActivity.this.setPage(5, true, bundle, false);
                } else {
                    LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization);
                }
            } else {
                LoginActivity.this.lambda$resendCodeFromSafetyNet$18(bundle, (TLRPC.auth_SentCode) tLObject);
            }
            if (LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            LoginActivity.this.needHideProgress(false);
        }

        public void lambda$onNextPressed$23(Bundle bundle, String str, PhoneInputData phoneInputData, TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda53(this, tL_error, tLObject2, bundle, str, phoneInputData, tLObject, 2));
        }

        public void lambda$onShow$25() {
            if (this.phoneField != null) {
                if (LoginActivity.this.needRequestPermissions) {
                    this.codeField.clearFocus();
                    this.phoneField.clearFocus();
                } else if (this.codeField.length() != 0) {
                    this.phoneField.requestFocus();
                    if (!this.numberFilled) {
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                    }
                    LoginActivity.this.showKeyboard(this.phoneField);
                } else {
                    this.codeField.requestFocus();
                    LoginActivity.this.showKeyboard(this.codeField);
                }
            }
            if (LoginActivity.this.activityMode == 0) {
                requestPasskey(false);
            }
        }

        public void lambda$requestPasskey$26() {
            requestPasskey(true);
        }

        public void lambda$requestPasskey$27(TLRPC.TL_error tL_error, TLObject tLObject) {
            this.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            if (tL_error != null) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            TL_account.Password password = (TL_account.Password) tLObject;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, true)) {
                AlertsCreator.showUpdateAppAlert(LoginActivity.this.getParentActivity(), LocaleController.getString("UpdateAppAlert", R.string.UpdateAppAlert), true);
                return;
            }
            Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public void lambda$requestPasskey$28(TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda11(this, tL_error, tLObject, 0));
        }

        public void lambda$requestPasskey$29(Long l, TLRPC.auth_Authorization auth_authorization, String str) {
            this.cancelRequestingPasskey = null;
            this.requestingPasskey = false;
            if (str != null && ("EMPTY".equals(str) || "CANCELLED".equals(str))) {
                if (this.subtitleView == null || !"CANCELLED".equals(str)) {
                    return;
                }
                this.subtitleView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new LoginActivity$PhoneView$$ExternalSyntheticLambda6(this, 1)), true));
                return;
            }
            if (l.longValue() != 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (int i = 0; i < 4; i++) {
                    UserConfig userConfig = UserConfig.getInstance(i);
                    if (userConfig.isClientActivated() && userConfig.getClientUserId() == l.longValue() && ConnectionsManager.getInstance(i).isTestBackend() == LoginActivity.this.testBackend) {
                        if (UserConfig.selectedAccount != i) {
                            ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, true);
                        }
                        LoginActivity.this.finishFragment();
                        LoginActivity.this.needHideProgress(false);
                        return;
                    }
                }
            }
            if (str != null && str.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new LoginActivity$PhoneView$$ExternalSyntheticLambda25(this, 0), 10);
            } else if (str != null) {
                if (BuildVars.DEBUG_VERSION) {
                    BulletinFactory.of(LoginActivity.this).showForError(str);
                    return;
                }
                return;
            }
            if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization);
            }
        }

        public void lambda$showDebugMenu$0(DialogInterface dialogInterface, int i) {
            if (i != 0) {
                ProfileActivity.sendLogs(LoginActivity.this.getParentActivity(), false);
                return;
            }
            BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
            ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
            BulletinFactory.of(LoginActivity.this).createSimpleBulletin(R.raw.chats_infotip, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").show();
            if (BuildVars.LOGS_ENABLED) {
                zzjg.m(new StringBuilder("app start time = "), ApplicationLoader.startTime);
                try {
                    FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }

        private void loadCountries() {
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            LoginActivity.this.getConnectionsManager().sendRequest(tL_help_getCountriesList, new LoginActivity$PhoneView$$ExternalSyntheticLambda25(this, 1), 10);
        }

        private void requestPasskey(boolean z) {
            if (LoginActivity.this.activityMode == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.requestingPasskey) {
                if (z || !this.requestedPasskey) {
                    this.requestingPasskey = true;
                    this.requestedPasskey = true;
                    this.cancelRequestingPasskey = PasskeysController.login(getContext(), ((BaseFragment) LoginActivity.this).currentAccount, z, new PhotoViewer$$ExternalSyntheticLambda178(this, 1));
                }
            }
        }

        private void setCountry(HashMap<String, String> map, String str) {
            CountrySelectActivity.Country country;
            if (map.get(str) == null || this.countriesArray == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= this.countriesArray.size()) {
                    country = null;
                    break;
                } else {
                    if (this.countriesArray.get(i) != null && this.countriesArray.get(i).name.equals(str)) {
                        country = this.countriesArray.get(i);
                        break;
                    }
                    i++;
                }
            }
            if (country != null) {
                this.codeField.setText(country.code);
                this.countryState = 0;
            }
        }

        public void setCountryButtonText(CharSequence charSequence) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(ApplicationLoader.applicationContext, (this.countryButton.getCurrentView().getText() == null || charSequence != null) ? R.anim.text_out : R.anim.text_out_down);
            animationLoadAnimation.setInterpolator(Easings.easeInOutQuad);
            this.countryButton.setOutAnimation(animationLoadAnimation);
            CharSequence text = this.countryButton.getCurrentView().getText();
            this.countryButton.setText(charSequence, ((TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(text)) || Objects.equals(text, charSequence)) ? false : true);
            this.countryOutlineView.animateSelection(charSequence != null ? 1.0f : 0.0f);
        }

        public void setCountryHint(String str, CountrySelectActivity.Country country) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String languageFlag = LocaleController.getLanguageFlag(country.shortname);
            if (languageFlag != null) {
                spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
                spannableStringBuilder.setSpan(new ReplacementSpan() {
                    @Override
                    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                    }

                    @Override
                    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                        return AndroidUtilities.dp(16.0f);
                    }
                }, languageFlag.length(), languageFlag.length() + 1, 0);
            }
            spannableStringBuilder.append((CharSequence) country.name);
            setCountryButtonText(Emoji.replaceEmoji(spannableStringBuilder, this.countryButton.getCurrentView().getPaint().getFontMetricsInt(), false));
            this.countryCodeForHint = str;
            this.wasCountryHintIndex = -1;
            invalidateCountryHint();
        }

        private void showDebugMenu() {
            new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.SettingsDebug)).setItems(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new DialogsActivity$$ExternalSyntheticLambda99(this, 1)).show();
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.countryButton.getCurrentView().invalidate();
            }
        }

        public void fillNumber() {
            boolean z;
            boolean z2;
            boolean z3;
            CountrySelectActivity.Country country;
            if (this.numberFilled || LoginActivity.this.activityMode != 0) {
                return;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
                if (AndroidUtilities.isSimAvailable()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 23) {
                        z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                        z2 = i < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                        if (LoginActivity.this.checkShowPermissions && (!z || !z2)) {
                            LoginActivity.this.permissionsShowItems.clear();
                            if (!z) {
                                LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_STATE");
                            }
                            if (!z2 && i >= 26) {
                                LoginActivity.this.permissionsShowItems.add("android.permission.READ_PHONE_NUMBERS");
                            }
                            if (LoginActivity.this.permissionsShowItems.isEmpty()) {
                                return;
                            }
                            PhotoViewer$$ExternalSyntheticLambda15 photoViewer$$ExternalSyntheticLambda15 = new PhotoViewer$$ExternalSyntheticLambda15(11, this, new ArrayList(LoginActivity.this.permissionsShowItems));
                            if (LoginActivity.this.isAnimatingIntro) {
                                LoginActivity.this.animationFinishCallback = photoViewer$$ExternalSyntheticLambda15;
                                return;
                            } else {
                                photoViewer$$ExternalSyntheticLambda15.run();
                                return;
                            }
                        }
                    } else {
                        z = true;
                        z2 = true;
                    }
                    this.numberFilled = true;
                    if (!LoginActivity.this.newAccount && z && z2) {
                        this.codeField.setAlpha(0.0f);
                        this.phoneField.setAlpha(0.0f);
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number(), false);
                        if (!TextUtils.isEmpty(strStripExceptNumbers)) {
                            int i2 = 4;
                            String strSubstring = null;
                            if (strStripExceptNumbers.length() > 4) {
                                while (true) {
                                    if (i2 < 1) {
                                        z3 = false;
                                        break;
                                    }
                                    String strSubstring2 = strStripExceptNumbers.substring(0, i2);
                                    List<CountrySelectActivity.Country> list = this.codesMap.get(strSubstring2);
                                    if (list == null) {
                                        country = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring2, null);
                                        country = list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList<CountrySelectActivity.Country> arrayList = this.countriesArray;
                                            int size = arrayList.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                CountrySelectActivity.Country country2 = arrayList.get(i3);
                                                i3++;
                                                CountrySelectActivity.Country country3 = country2;
                                                if (Objects.equals(country3.shortname, string)) {
                                                    country = country3;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        country = list.get(0);
                                    }
                                    if (country != null) {
                                        strSubstring = strStripExceptNumbers.substring(i2);
                                        this.codeField.setText(strSubstring2);
                                        z3 = true;
                                        break;
                                    }
                                    i2--;
                                }
                                if (!z3) {
                                    strSubstring = strStripExceptNumbers.substring(1);
                                    this.codeField.setText(strStripExceptNumbers.substring(0, 1));
                                }
                            }
                            if (strSubstring != null) {
                                this.phoneField.requestFocus();
                                this.phoneField.setText(strSubstring);
                                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                                animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                            }
                        }
                        if (this.phoneField.length() <= 0) {
                            this.codeField.setAlpha(1.0f);
                            this.phoneField.setAlpha(1.0f);
                            return;
                        }
                        AnimatorSet duration = new AnimatorSet().setDuration(300L);
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = this.codeField;
                        Property property = View.ALPHA;
                        duration.playTogether(ObjectAnimator.ofFloat(animatedPhoneNumberEditText2, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.phoneField, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f));
                        duration.start();
                        this.confirmedNumber = true;
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourPhone", R.string.YourPhone);
        }

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onDestroyActivity() {
            super.onDestroyActivity();
            Runnable runnable = this.cancelRequestingPasskey;
            if (runnable != null) {
                runnable.run();
                this.cancelRequestingPasskey = null;
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.ignoreSelection) {
                this.ignoreSelection = false;
                return;
            }
            this.ignoreOnTextChange = true;
            this.codeField.setText(this.countriesArray.get(i).code);
            this.ignoreOnTextChange = false;
        }

        @Override
        public void lambda$onNextPressed$16(String str) {
            boolean z;
            boolean z2;
            boolean z3;
            TLObject tLObject;
            int i;
            if (LoginActivity.this.getParentActivity() == null || this.nextPressed || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            TelephonyManager telephonyManager = (TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone");
            if (BuildVars.DEBUG_VERSION) {
                FileLog.d("sim status = " + telephonyManager.getSimState());
            }
            if (this.codeField.length() == 0 || this.phoneField.length() == 0) {
                LoginActivity.this.onFieldError(this.phoneOutlineView, false);
                return;
            }
            String str2 = "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText());
            if (!this.confirmedNumber) {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y && !LoginActivity.this.isCustomKeyboardVisible() && LoginActivity.this.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    LoginActivity.this.keyboardHideCallback = new LoginActivity$PhoneView$$ExternalSyntheticLambda7(this, str, 0);
                    AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView);
                    return;
                }
                LoginActivity loginActivity = LoginActivity.this;
                Context context = LoginActivity.this.fragmentView.getContext();
                LoginActivity loginActivity2 = LoginActivity.this;
                loginActivity.phoneNumberConfirmView = new PhoneNumberConfirmView(context, (ViewGroup) loginActivity2.fragmentView, loginActivity2.floatingButton, str2, new AnonymousClass6(str));
                LoginActivity.this.phoneNumberConfirmView.show();
                return;
            }
            this.confirmedNumber = false;
            if (LoginActivity.this.phoneNumberConfirmView != null) {
                LoginActivity.this.phoneNumberConfirmView.dismiss();
            }
            boolean zIsSimAvailable = AndroidUtilities.isSimAvailable();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 23 || !zIsSimAvailable) {
                z = true;
                z2 = true;
                z3 = true;
            } else {
                z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                z2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
                z3 = i2 < 28 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
                boolean z4 = i2 < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
                if (LoginActivity.this.checkPermissions) {
                    LoginActivity.this.permissionsItems.clear();
                    if (!z) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_STATE");
                    }
                    if (!z2) {
                        LoginActivity.this.permissionsItems.add("android.permission.CALL_PHONE");
                    }
                    if (!z3) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_CALL_LOG");
                    }
                    if (!z4 && i2 >= 26) {
                        LoginActivity.this.permissionsItems.add("android.permission.READ_PHONE_NUMBERS");
                    }
                    if (!LoginActivity.this.permissionsItems.isEmpty()) {
                        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                        if (!globalMainSettings.getBoolean("firstlogin", true) && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE") && !LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_CALL_LOG")) {
                            try {
                                LoginActivity.this.getParentActivity().requestPermissions((String[]) LoginActivity.this.permissionsItems.toArray(new String[0]), 6);
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        globalMainSettings.edit().putBoolean("firstlogin", false).commit();
                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
                        builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                        if (!z && (!z2 || !z3)) {
                            builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                            i = R.raw.calls_log;
                        } else if (z2 && z3) {
                            builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                            i = R.raw.incoming_calls;
                        } else {
                            builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                            i = R.raw.calls_log;
                        }
                        builder.setTopAnimation(i, 46, false, Theme.getColor(null, Theme.key_dialogTopBackground, false));
                        LoginActivity loginActivity3 = LoginActivity.this;
                        loginActivity3.permissionsDialog = loginActivity3.showDialog(builder.create());
                        this.confirmedNumber = true;
                        return;
                    }
                }
            }
            int i3 = this.countryState;
            if (i3 == 1) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            if (i3 == 2 && !BuildVars.DEBUG_VERSION) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            String strStripExceptNumbers = PhoneFormat.stripExceptNumbers("" + ((Object) this.codeField.getText()) + ((Object) this.phoneField.getText()), false);
            if (LoginActivity.this.activityMode == 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (int i4 = 0; i4 < 4; i4++) {
                    UserConfig userConfig = UserConfig.getInstance(i4);
                    if (userConfig.isClientActivated() && PhoneNumberUtils.compare(strStripExceptNumbers, userConfig.getCurrentUser().phone) && ConnectionsManager.getInstance(i4).isTestBackend() == LoginActivity.this.testBackend) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(LoginActivity.this.getParentActivity(), 0, null);
                        builder2.setTitle(LocaleController.getString(R.string.AppName));
                        builder2.setMessage(LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn));
                        builder2.setPositiveButton(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new LaunchActivity$$ExternalSyntheticLambda23(this, i4, 6));
                        builder2.setNegativeButton(LocaleController.getString("OK", R.string.OK), null);
                        LoginActivity.this.showDialog(builder2.create());
                        LoginActivity.this.needHideProgress(false);
                        return;
                    }
                }
            }
            TLRPC.TL_codeSettings tL_codeSettings = new TLRPC.TL_codeSettings();
            tL_codeSettings.allow_flashcall = zIsSimAvailable && z && z2 && z3;
            tL_codeSettings.allow_missed_call = zIsSimAvailable && z;
            boolean zHasServices = PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
            tL_codeSettings.allow_firebase = zHasServices;
            tL_codeSettings.allow_app_hash = zHasServices;
            if (LoginActivity.this.forceDisableSafetyNet || TextUtils.isEmpty(BuildVars.SAFETYNET_KEY)) {
                tL_codeSettings.allow_firebase = false;
            }
            ArrayList<TLRPC.TL_auth_authorization> savedLogInTokens = AuthTokensHelper.getSavedLogInTokens();
            if (savedLogInTokens != null) {
                for (int i5 = 0; i5 < savedLogInTokens.size(); i5++) {
                    if (savedLogInTokens.get(i5).future_auth_token != null) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("login token to check ".concat(new String(savedLogInTokens.get(i5).future_auth_token, StandardCharsets.UTF_8)));
                        }
                        tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i5).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                }
            }
            ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
            if (savedLogOutTokens != null) {
                for (int i6 = 0; i6 < savedLogOutTokens.size(); i6++) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i6).future_auth_token);
                    if (tL_codeSettings.logout_tokens.size() >= 20) {
                        break;
                    }
                }
                AuthTokensHelper.saveLogOutTokens(savedLogOutTokens);
            }
            if (tL_codeSettings.logout_tokens != null) {
                tL_codeSettings.flags |= 64;
            }
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            sharedPreferences.edit().remove("sms_hash_code").apply();
            if (tL_codeSettings.allow_app_hash) {
                sharedPreferences.edit().putString("sms_hash", BuildVars.getSmsHash()).apply();
            } else {
                sharedPreferences.edit().remove("sms_hash").apply();
            }
            if (tL_codeSettings.allow_flashcall) {
                try {
                    HashSet userPhoneNumbers = LoginActivity.this.getUserPhoneNumbers();
                    if (userPhoneNumbers.isEmpty()) {
                        tL_codeSettings.unknown_number = true;
                        if (UserConfig.getActivatedAccountsCount() > 0) {
                            tL_codeSettings.allow_flashcall = false;
                        } else {
                            tL_codeSettings.current_number = false;
                        }
                    } else {
                        tL_codeSettings.unknown_number = false;
                        tL_codeSettings.current_number = Collection.EL.stream(userPhoneNumbers).anyMatch(new ChatActivity$$ExternalSyntheticLambda425(strStripExceptNumbers, 2));
                    }
                } catch (Exception e2) {
                    tL_codeSettings.unknown_number = true;
                    FileLog.e(e2);
                }
            }
            if (LoginActivity.this.activityMode == 2) {
                TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                sendchangephonecode.phone_number = strStripExceptNumbers;
                sendchangephonecode.settings = tL_codeSettings;
                tLObject = sendchangephonecode;
            } else {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cleanup(false);
                TLRPC.TL_auth_sendCode tL_auth_sendCode = new TLRPC.TL_auth_sendCode();
                tL_auth_sendCode.api_hash = BuildVars.APP_HASH;
                tL_auth_sendCode.api_id = BuildVars.APP_ID;
                tL_auth_sendCode.phone_number = strStripExceptNumbers;
                tL_auth_sendCode.settings = tL_codeSettings;
                tLObject = tL_auth_sendCode;
            }
            TLObject tLObject2 = tLObject;
            Bundle bundle = new Bundle();
            bundle.putString("phone", "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText()));
            try {
                bundle.putString("ephone", "+" + PhoneFormat.stripExceptNumbers(this.codeField.getText().toString(), false) + " " + PhoneFormat.stripExceptNumbers(this.phoneField.getText().toString(), false));
            } catch (Exception e3) {
                FileLog.e(e3);
                bundle.putString("ephone", "+" + strStripExceptNumbers);
            }
            bundle.putString("phoneFormated", strStripExceptNumbers);
            CountrySelectActivity.Country country = this.currentCountry;
            if (country != null) {
                bundle.putString("country", country.code);
            }
            this.nextPressed = true;
            PhoneInputData phoneInputData = new PhoneInputData();
            phoneInputData.phoneNumber = "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText());
            phoneInputData.country = this.currentCountry;
            phoneInputData.patterns = this.phoneFormatMap.get(this.codeField.getText().toString());
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tLObject2, new ChatActivity$$ExternalSyntheticLambda147(this, bundle, strStripExceptNumbers, phoneInputData, tLObject2), 27));
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {
        }

        @Override
        public void onShow() {
            super.onShow();
            fillNumber();
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setChecked(LoginActivity.this.syncContacts, false);
            }
            AndroidUtilities.runOnUIThread(new LoginActivity$PhoneView$$ExternalSyntheticLambda6(this, 0), LoginActivity.SHOW_DELAY);
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            String string = bundle.getString("phoneview_code");
            if (string != null) {
                this.codeField.setText(string);
            }
            String string2 = bundle.getString("phoneview_phone");
            if (string2 != null) {
                this.phoneField.setText(string2);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            String string = this.codeField.getText().toString();
            if (string.length() != 0) {
                bundle.putString("phoneview_code", string);
            }
            String string2 = this.phoneField.getText().toString();
            if (string2.length() != 0) {
                bundle.putString("phoneview_phone", string2);
            }
        }

        public void selectCountry(CountrySelectActivity.Country country) {
            this.ignoreOnTextChange = true;
            String str = country.code;
            this.codeField.setText(str);
            setCountryHint(str, country);
            this.currentCountry = country;
            this.countryState = 0;
            this.ignoreOnTextChange = false;
            MessagesController.getGlobalMainSettings().edit().putString("phone_code_last_matched_" + country.code, country.shortname).apply();
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
            this.subtitleView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText6, false));
            this.subtitleView.setLinkTextColor(Theme.getColor(null, Theme.key_chat_messageLinkIn, false));
            for (int i = 0; i < this.countryButton.getChildCount(); i++) {
                TextView textView = (TextView) this.countryButton.getChildAt(i);
                textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
                textView.setHintTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteHintText, false));
            }
            ImageView imageView = this.chevronRight;
            int i2 = Theme.key_windowBackgroundWhiteHintText;
            imageView.setColorFilter(Theme.getColor(null, i2, false));
            this.chevronRight.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1, -1));
            TextView textView2 = this.plusTextView;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(null, i3, false));
            this.codeField.setTextColor(Theme.getColor(null, i3, false));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
            int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            animatedPhoneNumberEditText.setCursorColor(Theme.getColor(null, i4, false));
            this.codeDividerView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteInputField, false));
            this.phoneField.setTextColor(Theme.getColor(null, i3, false));
            this.phoneField.setHintTextColor(Theme.getColor(null, i2, false));
            this.phoneField.setCursorColor(Theme.getColor(null, i4, false));
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                int i5 = Theme.key_checkboxSquareUnchecked;
                int i6 = Theme.key_checkboxSquareBackground;
                int i7 = Theme.key_checkboxSquareCheck;
                CheckBoxSquare checkBoxSquare = checkBoxCell.checkBoxSquare;
                if (checkBoxSquare != null) {
                    checkBoxSquare.setColors(i5, i6, i7);
                }
                this.syncContactsBox.updateTextColor();
            }
            CheckBoxCell checkBoxCell2 = this.testBackendCheckBox;
            if (checkBoxCell2 != null) {
                int i8 = Theme.key_checkboxSquareUnchecked;
                int i9 = Theme.key_checkboxSquareBackground;
                int i10 = Theme.key_checkboxSquareCheck;
                CheckBoxSquare checkBoxSquare2 = checkBoxCell2.checkBoxSquare;
                if (checkBoxSquare2 != null) {
                    checkBoxSquare2.setColors(i8, i9, i10);
                }
                this.testBackendCheckBox.updateTextColor();
            }
            this.phoneOutlineView.updateColor();
            this.countryOutlineView.updateColor();
        }
    }

    public static class ProgressView extends View {
        private boolean animating;
        private final RectF boundsRect;
        private long duration;
        private final Paint paint;
        private final Paint paint2;
        private final Path path;
        private float radius;
        private final RectF rect;
        private long startTime;

        public ProgressView(Context context) {
            super(context);
            this.path = new Path();
            this.rect = new RectF();
            this.boundsRect = new RectF();
            Paint paint = new Paint(1);
            this.paint = paint;
            Paint paint2 = new Paint(1);
            this.paint2 = paint2;
            paint.setColor(Theme.getColor(null, Theme.key_login_progressInner, false));
            paint2.setColor(Theme.getColor(null, Theme.key_login_progressOuter, false));
        }

        public boolean isProgressAnimationRunning() {
            return this.animating;
        }

        @Override
        public void onDraw(Canvas canvas) {
            float fMin = this.duration > 0 ? Math.min(1.0f, (System.currentTimeMillis() - this.startTime) / this.duration) : 0.0f;
            canvas.clipPath(this.path);
            RectF rectF = this.boundsRect;
            float f = this.radius;
            canvas.drawRoundRect(rectF, f, f, this.paint);
            RectF rectF2 = this.rect;
            rectF2.right = this.boundsRect.right * fMin;
            float f2 = this.radius;
            canvas.drawRoundRect(rectF2, f2, f2, this.paint2);
            boolean z = this.animating & (this.duration > 0 && fMin < 1.0f);
            this.animating = z;
            if (z) {
                postInvalidateOnAnimation();
            }
        }

        @Override
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            this.path.rewind();
            float f = i2;
            this.radius = f / 2.0f;
            this.boundsRect.set(0.0f, 0.0f, i, f);
            this.rect.set(this.boundsRect);
            Path path = this.path;
            RectF rectF = this.boundsRect;
            float f2 = this.radius;
            path.addRoundRect(rectF, f2, f2, Path.Direction.CW);
        }

        public void resetProgressAnimation() {
            this.duration = 0L;
            this.startTime = 0L;
            this.animating = false;
            invalidate();
        }

        public void startProgressAnimation(long j) {
            this.animating = true;
            this.duration = j;
            this.startTime = System.currentTimeMillis();
            invalidate();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ViewNumber {
    }

    static {
        SHOW_DELAY = SharedConfig.getDevicePerformanceClass() <= 1 ? 150 : 100;
    }

    public LoginActivity() {
        super(null);
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList<>();
        this.permissionsShowItems = new ArrayList<>();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
    }

    private void clearCurrentState() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder("logininfo2");
        if (this.newAccount) {
            str = "_" + this.currentAccount;
        } else {
            str = "";
        }
        sb.append(str);
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb.toString(), 0).edit();
        editorEdit.clear();
        editorEdit.commit();
    }

    public static String errorString(Throwable th) {
        if (th == null) {
            return "NULL";
        }
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName.concat(" ");
            }
            StringBuilder sbM = DiffUtil.m(simpleName);
            sbM.append(th.getMessage());
            simpleName = sbM.toString();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    private void fakeSuccess() {
        TLRPC.TL_auth_authorization tL_auth_authorization = new TLRPC.TL_auth_authorization();
        tL_auth_authorization.user = UserConfig.getInstance(0).getCurrentUser();
        onAuthSuccess(tL_auth_authorization);
    }

    public void fillNextCodeParams(Bundle bundle, TL_account.sentEmailCode sentemailcode) {
        bundle.putString("emailPattern", sentemailcode.email_pattern);
        bundle.putInt("length", sentemailcode.length);
        setPage(13, true, bundle, false);
    }

    public HashSet<String> getUserPhoneNumbers() {
        HashSet<String> hashSet = new HashSet<>();
        try {
            String line1Number = ((TelephonyManager) ApplicationLoader.applicationContext.getSystemService("phone")).getLine1Number();
            if (!TextUtils.isEmpty(line1Number)) {
                hashSet.add(line1Number);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (i >= 22) {
                SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(getContext());
                List completeActiveSubscriptionInfoList = i >= 30 ? subscriptionManagerFrom.getCompleteActiveSubscriptionInfoList() : null;
                if ((completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) && i >= 28) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getAccessibleSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList == null || completeActiveSubscriptionInfoList.isEmpty()) {
                    completeActiveSubscriptionInfoList = subscriptionManagerFrom.getActiveSubscriptionInfoList();
                }
                if (completeActiveSubscriptionInfoList != null) {
                    for (int i2 = 0; i2 < completeActiveSubscriptionInfoList.size(); i2++) {
                        String number = LoginActivity$$ExternalSyntheticApiModelOutline2.m(completeActiveSubscriptionInfoList.get(i2)).getNumber();
                        if (!TextUtils.isEmpty(number)) {
                            hashSet.add(number);
                        }
                    }
                }
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        return hashSet;
    }

    public boolean isCustomKeyboardForceDisabled() {
        return AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public boolean isCustomKeyboardVisible() {
        return this.views[this.currentViewNum].hasCustomKeyboard() && !isCustomKeyboardForceDisabled();
    }

    public boolean isInCancelAccountDeletionMode() {
        return this.activityMode == 1;
    }

    public void lambda$createView$0(int i, boolean z) {
        Runnable runnable;
        if (i > AndroidUtilities.dp(20.0f) && isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
        if (i > AndroidUtilities.dp(20.0f) || (runnable = this.keyboardHideCallback) == null) {
            return;
        }
        runnable.run();
        this.keyboardHideCallback = null;
    }

    public void lambda$createView$1(View view) {
        onDoneButtonPressed();
    }

    public void lambda$createView$2(DynamicAnimation dynamicAnimation, float f, float f2) {
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateFabPosition();
        }
    }

    public void lambda$createView$3(View view) {
        if (onBackPressed(true)) {
            finishFragment();
        }
    }

    public void lambda$createView$4(View view) {
        Runnable runnable = this.emailChangeSkipCallback;
        if (runnable != null) {
            runnable.run();
        }
        finishFragment();
    }

    public void lambda$createView$5(View view) {
        presentFragment(new ProxyListActivity());
    }

    public void lambda$fillNextCodeParams$23(TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
        } else {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda21(1, bundle, auth_sentcode, this, z));
        }
    }

    public void lambda$fillNextCodeParams$24(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str, boolean z, IntegrityTokenResponse integrityTokenResponse) {
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new LoginActivity$$ExternalSyntheticLambda20(0, bundle, auth_sentcode, this, z), 10);
    }

    public void lambda$fillNextCodeParams$25(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        String str = "PLAYINTEGRITY_EXCEPTION_" + errorString(exc);
        FileLog.e("{" + str + "} Resend firebase sms because integrity threw error", exc);
        resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public void lambda$fillNextCodeParams$27(TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
        } else {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda21(0, bundle, auth_sentcode, this, z));
        }
    }

    public void lambda$fillNextCodeParams$28(String str, TLRPC.auth_SentCode auth_sentcode, Bundle bundle, boolean z, SafetyNetApi$AttestationResponse safetyNetApi$AttestationResponse) {
        zza zzaVar = ((zzp) ((Result) safetyNetApi$AttestationResponse.data)).zzb;
        String str2 = zzaVar == null ? null : zzaVar.zza;
        if (str2 == null) {
            FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.safety_net_token = str2;
        tL_auth_requestFirebaseSms.flags |= 1;
        String[] strArrSplit = str2.split("\\.");
        if (strArrSplit.length <= 0) {
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[1].getBytes(StandardCharsets.UTF_8), 0)));
            boolean zOptBoolean = jSONObject.optBoolean("basicIntegrity");
            boolean zOptBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
            try {
                if (zOptBoolean && zOptBoolean2) {
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new LoginActivity$$ExternalSyntheticLambda20(1, bundle, auth_sentcode, this, z), 10);
                    return;
                }
                if (!zOptBoolean && !zOptBoolean2) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                    return;
                } else if (!zOptBoolean) {
                    FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                    return;
                } else {
                    if (zOptBoolean2) {
                        return;
                    }
                    FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                    resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                    return;
                }
            } catch (JSONException e) {
                e = e;
            }
        } catch (JSONException e2) {
            e = e2;
        }
        FileLog.e(e);
        FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
        resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
    }

    public void lambda$fillNextCodeParams$29(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        FileLog.e(exc);
        String str = "SAFETYNET_EXCEPTION_" + errorString(exc);
        FileLog.d("{" + str + "} Resend firebase sms because of safetynet exception");
        resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public static MainTabsActivity lambda$needFinishActivity$17(boolean z, Void r1) {
        Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("afterSignup", z);
        MainTabsActivity mainTabsActivity = new MainTabsActivity();
        mainTabsActivity.prepareDialogsActivity(bundleM);
        return mainTabsActivity;
    }

    public static void lambda$needShowInvalidAlert$12(boolean z, String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            Locale locale = Locale.US;
            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse("mailto:"));
            intent.putExtra("android.intent.extra.EMAIL", new String[]{z ? "recover@telegram.org" : "login@stel.com"});
            if (z) {
                intent.putExtra("android.intent.extra.SUBJECT", "Banned phone number: " + str);
                intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's banned. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
            } else {
                intent.putExtra("android.intent.extra.SUBJECT", "Invalid phone number: " + str);
                intent.putExtra("android.intent.extra.TEXT", "I'm trying to use my mobile phone number: " + str + "\nBut Telegram says it's invalid. Please help.\n\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault());
            }
            baseFragment.getParentActivity().startActivity(Intent.createChooser(intent, "Send email..."));
        } catch (Exception unused) {
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            baseFragment.showDialog(builder.create());
        }
    }

    public void lambda$onCustomTransitionAnimation$30(int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4, int i5, TransformableLoginButtonView transformableLoginButtonView, float f, int i6, float f2, int i7, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardLinearLayout.setAlpha(fFloatValue);
        this.fragmentView.setBackgroundColor(ColorUtils.setAlphaComponent(i, (int) (i2 * fFloatValue)));
        float f3 = 1.0f - fFloatValue;
        this.slideViewsContainer.setTranslationY(AndroidUtilities.dp(20.0f) * f3);
        if (!isCustomKeyboardForceDisabled()) {
            CustomPhoneKeyboardView customPhoneKeyboardView = this.keyboardView;
            customPhoneKeyboardView.setTranslationY(customPhoneKeyboardView.getLayoutParams().height * f3);
            this.floatingButton.setTranslationY(this.keyboardView.getLayoutParams().height * f3);
        }
        this.introView.setTranslationY((-AndroidUtilities.dp(20.0f)) * fFloatValue);
        float f4 = (f3 * 0.05f) + 0.95f;
        this.introView.setScaleX(f4);
        this.introView.setScaleY(f4);
        marginLayoutParams.width = (int) (((i4 - i3) * fFloatValue) + i3);
        marginLayoutParams.height = (int) (((i4 - i5) * fFloatValue) + i5);
        transformableLoginButtonView.requestLayout();
        transformableLoginButtonView.setProgress(fFloatValue);
        transformableLoginButtonView.setTranslationX(((i6 - f) * fFloatValue) + f);
        transformableLoginButtonView.setTranslationY(((i7 - f2) * fFloatValue) + f2);
    }

    public void lambda$onDialogDismiss$9() {
        this.needRequestPermissions = false;
    }

    public void lambda$onDoneButtonPressed$13(AlertDialog alertDialog, int i) {
        this.views[this.currentViewNum].onCancelPressed();
        needHideProgress(true);
    }

    public static void lambda$onFieldError$11(OutlineTextContainerView outlineTextContainerView, View view, EditText editText, TextWatcher textWatcher) {
        outlineTextContainerView.animateError(0.0f);
        view.setTag(R.id.timeout_callback, null);
        if (editText != null) {
            editText.post(new LinkManager$$ExternalSyntheticLambda2(28, editText, textWatcher));
        }
    }

    public static void lambda$onRequestPermissionsResultFragment$8(LoginActivityRegisterView loginActivityRegisterView) {
        loginActivityRegisterView.imageUpdater.openGallery();
    }

    public void lambda$resendCodeFromSafetyNet$19(AlertDialog alertDialog, int i) {
        this.forceDisableSafetyNet = true;
        if (this.currentViewNum != 0) {
            setPage(0, true, null, true);
        }
    }

    public void lambda$resendCodeFromSafetyNet$20() {
        if (getParentActivity() == null || getParentActivity().isFinishing() || getContext() == null) {
            return;
        }
        new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.SafetyNetErrorOccurred)).setPositiveButton(LocaleController.getString(R.string.OK), new LoginActivity$$ExternalSyntheticLambda29(this, 1)).show();
    }

    public void lambda$resendCodeFromSafetyNet$21(Bundle bundle, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject == null || (((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda8(this, 2));
        } else {
            AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda25((NotificationCenter.NotificationCenterDelegate) this, (Object) bundle, tLObject, 4));
        }
    }

    public void lambda$setCustomKeyboardVisible$6(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardView.setAlpha(fFloatValue);
        this.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
    }

    public void lambda$setCustomKeyboardVisible$7(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.keyboardView.setAlpha(fFloatValue);
        this.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
    }

    public void lambda$showEditDoneProgress$15(int i, boolean z, boolean z2) {
        int i2 = this.currentDoneType;
        this.currentDoneType = i;
        lambda$showEditDoneProgress$14(z, z2, true);
        this.currentDoneType = i2;
    }

    public void lambda$showEditDoneProgress$16(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (0.9f * fFloatValue) + 0.1f;
        this.radialProgressView.setScaleX(f);
        this.radialProgressView.setScaleY(f);
        this.radialProgressView.setAlpha(fFloatValue);
    }

    public void lambda$showProxyButton$35(boolean z) {
        if (z) {
            return;
        }
        this.proxyButtonView.setVisibility(8);
    }

    public void lambda$showProxyButtonDelayed$34() {
        this.proxyButtonVisible = false;
        showProxyButton(true, true);
    }

    public void lambda$tryResetAccount$31(TLRPC.TL_error tL_error, String str, String str2, String str3) {
        needHideProgress(false);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            setPage(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (!tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("phoneFormated", str);
        bundle2.putString("phoneHash", str2);
        bundle2.putString("code", str3);
        bundle2.putInt("startTime", ConnectionsManager.getInstance(this.currentAccount).getCurrentTime());
        bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
        setPage(8, true, bundle2, false);
    }

    public void lambda$tryResetAccount$32(String str, String str2, String str3, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda22(this, tL_error, str, str2, str3));
    }

    public void lambda$tryResetAccount$33(String str, String str2, String str3, AlertDialog alertDialog, int i) {
        needShowProgress(0);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteaccount, new LoginActivity$$ExternalSyntheticLambda27(0, this, str, str2, str3), 10);
    }

    public static Bundle loadCurrentState(boolean z, int i) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder("logininfo2");
            sb.append(z ? "_" + i : "");
            for (Map.Entry<String, ?> entry : context.getSharedPreferences(sb.toString(), 0).getAll().entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                String[] strArrSplit = key.split("_\\|_");
                if (strArrSplit.length == 1) {
                    if (value instanceof String) {
                        bundle.putString(key, (String) value);
                    } else if (value instanceof Integer) {
                        bundle.putInt(key, ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle.putBoolean(key, ((Boolean) value).booleanValue());
                    }
                } else if (strArrSplit.length == 2) {
                    Bundle bundle2 = bundle.getBundle(strArrSplit[0]);
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        bundle.putBundle(strArrSplit[0], bundle2);
                    }
                    if (value instanceof String) {
                        bundle2.putString(strArrSplit[1], (String) value);
                    } else if (value instanceof Integer) {
                        bundle2.putInt(strArrSplit[1], ((Integer) value).intValue());
                    } else if (value instanceof Boolean) {
                        bundle2.putBoolean(strArrSplit[1], ((Boolean) value).booleanValue());
                    }
                }
            }
            return bundle;
        } catch (Exception e) {
            FileLog.e(e);
            return null;
        }
    }

    private void needFinishActivity(boolean z, boolean z2, int i) {
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        clearCurrentState();
        if (!(getParentActivity() instanceof LaunchActivity)) {
            if (getParentActivity() instanceof ExternalActionActivity) {
                ((ExternalActionActivity) getParentActivity()).onFinishLogin();
                return;
            }
            return;
        }
        if (this.newAccount) {
            this.newAccount = false;
            this.pendingSwitchingAccount = true;
            ((LaunchActivity) getParentActivity()).switchToAccount(this.currentAccount, true, new LoginActivity$$ExternalSyntheticLambda32(z, 0));
            this.pendingSwitchingAccount = false;
            finishFragment();
            return;
        }
        if (z && z2) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(6, null);
            twoStepVerificationSetupActivity.setBlockingAlert(i);
            twoStepVerificationSetupActivity.setFromRegistration(true);
            presentFragment(twoStepVerificationSetupActivity, true);
        } else {
            Bundle bundleM = CallLogActivity$$ExternalSyntheticOutline0.m("afterSignup", z);
            MainTabsActivity mainTabsActivity = new MainTabsActivity();
            mainTabsActivity.prepareDialogsActivity(bundleM);
            presentFragment(mainTabsActivity, true);
        }
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
    }

    public void needHideProgress(boolean z) {
        needHideProgress(z, true);
    }

    public void needShowAlert(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        showDialog(builder.create());
    }

    public static void needShowInvalidAlert(BaseFragment baseFragment, String str, boolean z) {
        needShowInvalidAlert(baseFragment, str, null, z);
    }

    public void needShowProgress(int i) {
        needShowProgress(i, true);
    }

    public void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization) {
        onAuthSuccess(tL_auth_authorization, false);
    }

    public void onDoneButtonPressed() {
        if (this.doneButtonVisible[this.currentDoneType]) {
            if (this.radialProgressView.getTag() == null) {
                this.views[this.currentViewNum].lambda$onNextPressed$16(null);
                return;
            }
            if (getParentActivity() == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle));
            builder.setMessage(LocaleController.getString("StopLoading", R.string.StopLoading));
            builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new LoginActivity$$ExternalSyntheticLambda29(this, 0));
            showDialog(builder.create());
        }
    }

    public void onFieldError(View view, boolean z) {
        try {
            view.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        AndroidUtilities.shakeViewSpring(view, 3.5f);
        if (z && (view instanceof OutlineTextContainerView)) {
            int i = R.id.timeout_callback;
            Runnable runnable = (Runnable) view.getTag(i);
            if (runnable != null) {
                view.removeCallbacks(runnable);
            }
            OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) view;
            AtomicReference atomicReference = new AtomicReference();
            EditText attachedEditText = outlineTextContainerView.getAttachedEditText();
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(attachedEditText, atomicReference);
            outlineTextContainerView.animateError(1.0f);
            LinkManager$$ExternalSyntheticLambda23 linkManager$$ExternalSyntheticLambda23 = new LinkManager$$ExternalSyntheticLambda23(3, outlineTextContainerView, (OutlineTextContainerView) view, attachedEditText, anonymousClass7);
            atomicReference.set(linkManager$$ExternalSyntheticLambda23);
            view.postDelayed(linkManager$$ExternalSyntheticLambda23, 2000L);
            view.setTag(i, linkManager$$ExternalSyntheticLambda23);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(anonymousClass7);
            }
        }
    }

    private void putBundleToEditor(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(zziq.m(str, "_|_", str2), (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(zziq.m(str, "_|_", str2), ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(zziq.m(str, "_|_", str2), ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                putBundleToEditor((Bundle) obj, editor, str2);
            }
        }
    }

    private void resendCodeFromSafetyNet(Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
        if (this.isRequestingFirebaseSms) {
            needHideProgress(false);
            this.isRequestingFirebaseSms = false;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = bundle.getString("phoneFormated");
            tL_auth_resendCode.phone_code_hash = auth_sentcode.phone_code_hash;
            if (str != null) {
                tL_auth_resendCode.flags |= 1;
                tL_auth_resendCode.reason = str;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new LinkManager$$ExternalSyntheticLambda15(1, this, bundle), 10);
        }
    }

    private void setCustomKeyboardVisible(boolean z, boolean z2) {
        int i = 0;
        if (this.customKeyboardWasVisible == z && z2) {
            return;
        }
        this.customKeyboardWasVisible = z;
        if (isCustomKeyboardForceDisabled()) {
            z = false;
        }
        if (!z) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
            if (!z2) {
                this.keyboardView.setVisibility(8);
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.keyboardAnimator = duration;
            duration.setInterpolator(Easings.easeInOutQuad);
            this.keyboardAnimator.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, 1));
            this.keyboardAnimator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    LoginActivity.this.keyboardView.setVisibility(8);
                    if (LoginActivity.this.keyboardAnimator == animator) {
                        LoginActivity.this.keyboardAnimator = null;
                    }
                }
            });
            this.keyboardAnimator.start();
            return;
        }
        AndroidUtilities.hideKeyboard(this.fragmentView);
        AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        if (!z2) {
            this.keyboardView.setVisibility(0);
            return;
        }
        ValueAnimator duration2 = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        this.keyboardAnimator = duration2;
        duration2.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.keyboardAnimator.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, i));
        this.keyboardAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.keyboardAnimator == animator) {
                    LoginActivity.this.keyboardAnimator = null;
                }
            }

            @Override
            public void onAnimationStart(Animator animator) {
                LoginActivity.this.keyboardView.setVisibility(0);
            }
        });
        this.keyboardAnimator.start();
    }

    public void showDoneButton(final boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        int i = this.currentDoneType;
        final boolean z3 = i == 0;
        if (this.doneButtonVisible[i] == z) {
            return;
        }
        AnimatorSet animatorSet = this.showDoneAnimation[i];
        if (animatorSet != null) {
            if (z2) {
                animatorSet.removeAllListeners();
            }
            this.showDoneAnimation[this.currentDoneType].cancel();
        }
        boolean[] zArr = this.doneButtonVisible;
        int i2 = this.currentDoneType;
        zArr[i2] = z;
        if (!z2) {
            if (z3) {
                this.floatingButton.setButtonVisible(z, z2);
                return;
            }
            return;
        }
        this.showDoneAnimation[i2] = new AnimatorSet();
        if (z3) {
            this.floatingButton.setButtonVisible(z, z2);
        }
        this.showDoneAnimation[this.currentDoneType].addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationCancel(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator)) {
                    return;
                }
                LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] = null;
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator) || z || !z3 || LoginActivity.this.floatingButtonIcon.getAlpha() == 1.0f) {
                    return;
                }
                LoginActivity.this.floatingButtonIcon.setAlpha(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleX(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleY(1.0f);
                LoginActivity.this.floatingButtonIcon.setVisibility(0);
            }
        });
        int i3 = 150;
        if (!z3) {
            timeInterpolator = null;
        } else if (z) {
            timeInterpolator = AndroidUtilities.decelerateInterpolator;
            i3 = 200;
        } else {
            timeInterpolator = AndroidUtilities.accelerateInterpolator;
        }
        this.showDoneAnimation[this.currentDoneType].setDuration(i3);
        this.showDoneAnimation[this.currentDoneType].setInterpolator(timeInterpolator);
        this.showDoneAnimation[this.currentDoneType].start();
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        lambda$showEditDoneProgress$14(z, z2, false);
    }

    public boolean showKeyboard(View view) {
        if (isCustomKeyboardVisible()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
    }

    private void showProxyButton(boolean z, boolean z2) {
        if (z == this.proxyButtonVisible) {
            return;
        }
        Runnable runnable = this.showProxyButtonDelayed;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.showProxyButtonDelayed = null;
        }
        this.proxyButtonVisible = z;
        this.proxyButtonView.clearAnimation();
        if (z2) {
            this.proxyButtonView.setVisibility(0);
            this.proxyButtonView.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new PollItemMenu$$ExternalSyntheticLambda0(this, z, 7)).start();
        } else {
            this.proxyButtonView.setVisibility(z ? 0 : 8);
            this.proxyButtonView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    private void showProxyButtonDelayed() {
        if (this.proxyButtonVisible) {
            return;
        }
        Runnable runnable = this.showProxyButtonDelayed;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        this.proxyButtonVisible = true;
        LoginActivity$$ExternalSyntheticLambda8 loginActivity$$ExternalSyntheticLambda8 = new LoginActivity$$ExternalSyntheticLambda8(this, 1);
        this.showProxyButtonDelayed = loginActivity$$ExternalSyntheticLambda8;
        AndroidUtilities.runOnUIThread(loginActivity$$ExternalSyntheticLambda8, 5000L);
    }

    public void tryResetAccount(String str, String str2, String str3) {
        if (this.radialProgressView.getTag() != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
        builder.setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText));
        builder.setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning));
        builder.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new ArticleViewer$$ExternalSyntheticLambda11(7, this, str, str2, str3));
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public void updateColors() {
        this.fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ImageView imageView = this.backButtonView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(Theme.getColor(null, i, false));
        ImageView imageView2 = this.backButtonView;
        int i2 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i2, false), 1, -1));
        this.proxyDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, i, false), PorterDuff.Mode.SRC_IN));
        this.proxyButtonView.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, i2, false), 1, -1));
        RadialProgressView radialProgressView = this.radialProgressView;
        int i3 = Theme.key_chats_actionBackground;
        radialProgressView.setProgressColor(Theme.getColor(null, i3, false));
        this.floatingButton.updateColors();
        this.floatingButtonIcon.setColor(Theme.getColor(null, Theme.key_chats_actionIcon, false));
        this.floatingButtonIcon.setBackgroundColor(Theme.getColor(null, i3, false));
        for (SlideView slideView : this.views) {
            slideView.updateColors();
        }
        this.keyboardView.updateColors();
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateColors();
        }
    }

    private void updateProxyButton(boolean z, boolean z2) {
        if (this.proxyDrawable == null) {
            return;
        }
        int connectionState = getConnectionsManager().getConnectionState();
        if (this.currentConnectionState != connectionState || z2) {
            this.currentConnectionState = connectionState;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("mainconfig", 0);
            boolean z3 = sharedPreferences.getBoolean("proxy_enabled", false) && !TextUtils.isEmpty(sharedPreferences.getString("proxy_ip", ""));
            int i = this.currentConnectionState;
            boolean z4 = i == 3 || i == 5;
            boolean z5 = i == 1 || i == 2 || i == 4;
            if (z3) {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButton(true, z);
            } else if ((!getMessagesController().blockedCountry || SharedConfig.proxyList.isEmpty()) && !z5) {
                showProxyButton(false, z);
            } else {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButtonDelayed();
            }
        }
    }

    public LoginActivity cancelAccountDeletion(String str, Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode) {
        this.cancelDeletionPhone = str;
        this.cancelDeletionParams = bundle;
        this.cancelDeletionCode = tL_auth_sentCode;
        this.activityMode = 1;
        return this;
    }

    public LoginActivity changeEmail(Runnable runnable) {
        this.activityMode = 3;
        this.currentViewNum = 12;
        this.emailChangeFinishCallback = runnable;
        return this;
    }

    public LoginActivity changePhoneNumber() {
        this.activityMode = 2;
        return this;
    }

    @Override
    public void clearViews() {
        View view = this.fragmentView;
        if (view != null) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (viewGroup != null) {
                try {
                    onRemoveFromParent();
                    viewGroup.removeViewInLayout(this.fragmentView);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (this.pendingSwitchingAccount) {
                this.cachedFragmentView = this.fragmentView;
            }
            this.fragmentView = null;
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null && !this.pendingSwitchingAccount) {
            ViewGroup viewGroup2 = (ViewGroup) actionBar.getParent();
            if (viewGroup2 != null) {
                try {
                    viewGroup2.removeViewInLayout(this.actionBar);
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
            this.actionBar = null;
        }
        clearSheets();
        this.parentLayout = null;
    }

    @Override
    public View createView(Context context) {
        boolean z;
        int i;
        View view = this.cachedFragmentView;
        if (view != null) {
            this.fragmentView = view;
            this.cachedFragmentView = null;
            return view;
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == 1) {
                    LoginActivity.this.onDoneButtonPressed();
                } else if (i2 == -1 && LoginActivity.this.onBackPressed(true)) {
                    LoginActivity.this.finishFragment();
                }
            }
        });
        this.currentDoneType = 0;
        boolean[] zArr = this.doneButtonVisible;
        zArr[0] = true;
        zArr[1] = false;
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            public void onMeasure(int i2, int i3) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LoginActivity.this.floatingButton.getLayoutParams();
                int iDp = LoginActivity.this.isCustomKeyboardVisible() ? AndroidUtilities.dp(226.0f) : 0;
                if (LoginActivity.this.isCustomKeyboardVisible() && measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    iDp -= measureKeyboardHeight();
                }
                if (Bulletin.getVisibleBulletin() == null || !Bulletin.getVisibleBulletin().isShowing()) {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + iDp;
                } else {
                    super.onMeasure(i2, i3);
                    marginLayoutParams.bottomMargin = zzkl.m(10.0f, Bulletin.getVisibleBulletin().getLayout().getMeasuredHeight() + AndroidUtilities.dp(14.0f), iDp);
                }
                int i4 = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.backButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.proxyButtonView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i4;
                ((ViewGroup.MarginLayoutParams) LoginActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i4;
                if (LoginActivity.this.emailChangeSkipButton != null) {
                    ((ViewGroup.MarginLayoutParams) LoginActivity.this.emailChangeSkipButton.getLayoutParams()).topMargin = AndroidUtilities.dp(16.0f) + i4;
                }
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f) && LoginActivity.this.keyboardView.getVisibility() != 8 && !LoginActivity.this.isCustomKeyboardForceDisabled() && !LoginActivity.this.customKeyboardWasVisible) {
                    if (LoginActivity.this.keyboardAnimator != null) {
                        LoginActivity.this.keyboardAnimator.cancel();
                    }
                    LoginActivity.this.keyboardView.setVisibility(8);
                }
                super.onMeasure(i2, i3);
            }
        };
        this.sizeNotifierFrameLayout = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setDelegate(new LoginActivity$$ExternalSyntheticLambda10(this, 0));
        this.fragmentView = this.sizeNotifierFrameLayout;
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z2) {
                if (LoginActivity.this.currentViewNum == 1 || LoginActivity.this.currentViewNum == 2 || LoginActivity.this.currentViewNum == 4) {
                    rect.bottom = AndroidUtilities.dp(40.0f) + rect.bottom;
                }
                return super.requestChildRectangleOnScreen(view2, rect, z2);
            }
        };
        scrollView.setFillViewport(true);
        this.sizeNotifierFrameLayout.addView(scrollView, LayoutHelper.createFrame(-1, -1.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.keyboardLinearLayout = linearLayout;
        linearLayout.setOrientation(1);
        scrollView.addView(this.keyboardLinearLayout, LayoutHelper.createScroll(-1, -2, 51));
        Space space = new Space(context);
        space.setMinimumHeight(AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight);
        this.keyboardLinearLayout.addView(space);
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                super.onLayout(z2, i2, i3, i4, i5);
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int iDp = AndroidUtilities.dp(16.0f) + getHeight();
                    if (!slideView.hasCustomKeyboard() && LoginActivity.this.keyboardView.getVisibility() == 0) {
                        iDp += AndroidUtilities.dp(230.0f);
                    }
                    slideView.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, iDp);
                }
            }

            @Override
            public void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int iDp = AndroidUtilities.dp(16.0f) + (measuredHeight - marginLayoutParams.topMargin);
                    if (!slideView.hasCustomKeyboard() && LoginActivity.this.keyboardView.getVisibility() == 0) {
                        iDp += AndroidUtilities.dp(230.0f);
                    }
                    slideView.measure(View.MeasureSpec.makeMeasureSpec((measuredWidth - marginLayoutParams.rightMargin) - marginLayoutParams.leftMargin, 1073741824), View.MeasureSpec.makeMeasureSpec(iDp, 1073741824));
                }
            }
        };
        this.slideViewsContainer = frameLayout;
        this.keyboardLinearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, 0, 1.0f));
        CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
        this.keyboardView = customPhoneKeyboardView;
        customPhoneKeyboardView.setViewToFindFocus(this.slideViewsContainer);
        this.keyboardLinearLayout.addView(this.keyboardView, LayoutHelper.createLinear(-1, 230));
        this.views[0] = new PhoneView(context);
        this.views[1] = new LoginActivitySmsView(context, 1);
        this.views[2] = new LoginActivitySmsView(context, 2);
        this.views[3] = new LoginActivitySmsView(context, 3);
        this.views[4] = new LoginActivitySmsView(context, 4);
        this.views[5] = new LoginActivityRegisterView(context);
        this.views[6] = new LoginActivityPasswordView(context);
        this.views[7] = new LoginActivityRecoverView(context);
        this.views[8] = new LoginActivityResetWaitView(context);
        this.views[9] = new LoginActivityNewPasswordView(context, 0);
        this.views[10] = new LoginActivityNewPasswordView(context, 1);
        this.views[11] = new LoginActivitySmsView(context, 11);
        this.views[12] = new LoginActivitySetupEmail(context);
        this.views[13] = new LoginActivityEmailCodeView(context, true);
        this.views[14] = new LoginActivityEmailCodeView(context, false);
        this.views[15] = new LoginActivitySmsView(context, 15);
        this.views[16] = new LoginActivityPhraseView(context, 16);
        this.views[17] = new LoginActivityPhraseView(context, 17);
        int i2 = 18;
        this.views[18] = new LoginPayView(context);
        int i3 = 0;
        while (true) {
            SlideView[] slideViewArr = this.views;
            if (i3 >= slideViewArr.length) {
                break;
            }
            slideViewArr[i3].setVisibility(i3 == 0 ? 0 : 8);
            this.slideViewsContainer.addView(this.views[i3], LayoutHelper.createFrame(-1, -1.0f, 17, AndroidUtilities.isTablet() ? 26.0f : 18.0f, i3 != i2 ? 30.0f : 0.0f, AndroidUtilities.isTablet() ? 26.0f : 18.0f, 0.0f));
            i3++;
            i2 = 18;
        }
        Bundle bundleLoadCurrentState = this.activityMode == 0 ? loadCurrentState(this.newAccount, this.currentAccount) : null;
        if (bundleLoadCurrentState != null && ((i = bundleLoadCurrentState.getInt("currentViewNum", 0)) < 0 || i >= this.views.length)) {
            bundleLoadCurrentState = null;
        }
        if (bundleLoadCurrentState != null) {
            this.currentViewNum = bundleLoadCurrentState.getInt("currentViewNum", 0);
            this.syncContacts = bundleLoadCurrentState.getInt("syncContacts", 1) == 1;
            int i4 = this.currentViewNum;
            if (i4 >= 1 && i4 <= 4) {
                int i5 = bundleLoadCurrentState.getInt("open");
                if (i5 != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i5)) >= 86400) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundleLoadCurrentState = null;
                }
            } else if (i4 == 6) {
                if (((LoginActivityPasswordView) this.views[6]).currentPassword == null) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundleLoadCurrentState = null;
                }
            } else if (i4 == 7 && ((LoginActivityRecoverView) this.views[7]).passwordString == null) {
                this.currentViewNum = 0;
                clearCurrentState();
                bundleLoadCurrentState = null;
            }
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setButtonVisible(this.doneButtonVisible[0], false);
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButton);
        this.sizeNotifierFrameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParamsBig());
        final int i6 = 0;
        this.floatingButton.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i6) {
                    case 0:
                        this.f$0.lambda$createView$1(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view2);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$5(view2);
                        break;
                }
            }
        });
        this.floatingAutoAnimator.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(this, i6));
        ImageView imageView = new ImageView(context);
        this.backButtonView = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        final int i7 = 1;
        this.backButtonView.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        this.f$0.lambda$createView$1(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view2);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$5(view2);
                        break;
                }
            }
        });
        this.backButtonView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        int iDp = AndroidUtilities.dp(4.0f);
        this.backButtonView.setPadding(iDp, iDp, iDp, iDp);
        this.sizeNotifierFrameLayout.addView(this.backButtonView, LayoutHelper.createFrame(32, 32.0f, 51, 16.0f, 16.0f, 0.0f, 0.0f));
        if (this.emailChangeSkipCallback != null && !this.emailChangeNonSkippable && this.emailChangeIsSuggestion) {
            TextView textView = new TextView(context);
            this.emailChangeSkipButton = textView;
            textView.setGravity(19);
            this.emailChangeSkipButton.setTextSize(1, 15.0f);
            this.emailChangeSkipButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailChangeSkipButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.emailChangeSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
            this.emailChangeSkipButton.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false));
            this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            final int i8 = 2;
            this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener(this) {
                public final LoginActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i8) {
                        case 0:
                            this.f$0.lambda$createView$1(view2);
                            break;
                        case 1:
                            this.f$0.lambda$createView$3(view2);
                            break;
                        case 2:
                            this.f$0.lambda$createView$4(view2);
                            break;
                        default:
                            this.f$0.lambda$createView$5(view2);
                            break;
                    }
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.proxyButtonView = imageView2;
        ProxyDrawable proxyDrawable = new ProxyDrawable(context);
        this.proxyDrawable = proxyDrawable;
        imageView2.setImageDrawable(proxyDrawable);
        final int i9 = 3;
        this.proxyButtonView.setOnClickListener(new View.OnClickListener(this) {
            public final LoginActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$createView$1(view2);
                        break;
                    case 1:
                        this.f$0.lambda$createView$3(view2);
                        break;
                    case 2:
                        this.f$0.lambda$createView$4(view2);
                        break;
                    default:
                        this.f$0.lambda$createView$5(view2);
                        break;
                }
            }
        });
        this.proxyButtonView.setAlpha(0.0f);
        this.proxyButtonView.setVisibility(8);
        this.sizeNotifierFrameLayout.addView(this.proxyButtonView, LayoutHelper.createFrame(32, 32.0f, 53, 16.0f, 16.0f, 16.0f, 16.0f));
        updateProxyButton(false, true);
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.radialProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.dp(20.0f));
        this.radialProgressView.setAlpha(0.0f);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.sizeNotifierFrameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(0);
        this.floatingButtonIcon.setProgress(1.0f);
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Done));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        if (bundleLoadCurrentState != null) {
            this.restoringState = true;
        }
        int i10 = 0;
        while (true) {
            SlideView[] slideViewArr2 = this.views;
            if (i10 >= slideViewArr2.length) {
                break;
            }
            SlideView slideView = slideViewArr2[i10];
            if (bundleLoadCurrentState != null && (i10 < 1 || i10 > 4 || i10 == this.currentViewNum)) {
                slideView.restoreStateParams(bundleLoadCurrentState);
            }
            if (this.currentViewNum == i10) {
                this.backButtonView.setVisibility((slideView.needBackButton() || this.newAccount || this.activityMode == 2) ? 0 : 8);
                slideView.setVisibility(0);
                slideView.onShow();
                setCustomKeyboardVisible(slideView.hasCustomKeyboard(), false);
                this.currentDoneType = 0;
                if (i10 != 0 && i10 != 5 && i10 != 6) {
                    if (i10 != 9) {
                        if (i10 != 10 && i10 != 12) {
                            z = false;
                        }
                        showDoneButton(z, false);
                        if (i10 == 1 && i10 != 2) {
                            if (i10 == 3 || i10 == 4) {
                            }
                        }
                        this.currentDoneType = 1;
                    }
                    z = true;
                    showDoneButton(z, false);
                    if (i10 == 1) {
                        this.currentDoneType = 1;
                    } else {
                        this.currentDoneType = 1;
                    }
                }
                z = true;
                showDoneButton(z, false);
                if (i10 == 1) {
                    this.currentDoneType = 1;
                } else {
                    this.currentDoneType = 1;
                }
            } else if (slideView.getVisibility() != 8) {
                slideView.setVisibility(8);
                slideView.onHide();
            }
            i10++;
        }
        this.restoringState = false;
        updateColors();
        if (isInCancelAccountDeletionMode()) {
            lambda$fillNextCodeParams$26(this.cancelDeletionParams, this.cancelDeletionCode, false);
        }
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            updateProxyButton(true, false);
        } else if (i == NotificationCenter.newSuggestionsAvailable && this.emailChangeIsSuggestion && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new IntroActivity$$ExternalSyntheticLambda0(this, 22), Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText6, Theme.key_windowBackgroundWhiteHintText, Theme.key_listSelector, Theme.key_chats_actionBackground, Theme.key_chats_actionIcon, Theme.key_windowBackgroundWhiteInputField, Theme.key_windowBackgroundWhiteInputFieldActivated, Theme.key_windowBackgroundWhiteValueText, Theme.key_text_RedBold, Theme.key_windowBackgroundWhiteGrayText, Theme.key_checkbox, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_changephoneinfo_image2, Theme.key_chats_actionPressedBackground, Theme.key_text_RedRegular, Theme.key_windowBackgroundWhiteLinkText, Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck, Theme.key_dialogBackground, Theme.key_dialogTextGray2, Theme.key_dialogTextBlack);
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.emailChangeIsSuggestion;
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
        if (loginActivityRegisterView != null) {
            loginActivityRegisterView.imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public boolean onBackPressed(boolean z) {
        int i = 0;
        if (this.emailChangeIsSuggestion && this.currentViewNum == 12) {
            return false;
        }
        int i2 = this.currentViewNum;
        if (i2 == 0 || (this.activityMode == 3 && i2 == 12)) {
            if (z) {
                while (true) {
                    SlideView[] slideViewArr = this.views;
                    if (i >= slideViewArr.length) {
                        break;
                    }
                    SlideView slideView = slideViewArr[i];
                    if (slideView != null) {
                        slideView.onDestroyActivity();
                    }
                    i++;
                }
                clearCurrentState();
            }
            return true;
        }
        if (i2 == 6) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(0, true, null, true);
            }
        } else if (i2 == 7 || i2 == 8) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(6, true, null, true);
            }
        } else if ((i2 >= 1 && i2 <= 4) || i2 == 11 || i2 == 15) {
            if (z && this.views[i2].onBackPressed(false)) {
                setPage(0, true, null, true);
            }
        } else if (i2 == 5) {
            if (z) {
                ((LoginActivityRegisterView) this.views[i2]).wrongNumber.callOnClick();
            }
        } else if (i2 == 9) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(7, true, null, true);
            }
        } else if (i2 == 10) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(9, true, null, true);
            }
        } else if (i2 == 13) {
            if (z) {
                this.views[i2].onBackPressed(true);
                setPage(12, true, null, true);
            }
        } else if (z && this.views[i2].onBackPressed(true)) {
            setPage(0, true, null, true);
        }
        return false;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        setCustomKeyboardVisible(this.views[this.currentViewNum].hasCustomKeyboard(), false);
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.dismiss();
        }
    }

    @Override
    public AnimatorSet onCustomTransitionAnimation(boolean z, final Runnable runnable) {
        if (!z || this.introView == null) {
            return null;
        }
        if (this.fragmentView.getParent() instanceof View) {
            ((View) this.fragmentView.getParent()).setTranslationX(0.0f);
        }
        final TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(this.fragmentView.getContext());
        transformableLoginButtonView.setButtonText(this.startMessagingButton.getPaint(), this.startMessagingButton.getText().toString());
        final int width = this.startMessagingButton.getWidth();
        final int height = this.startMessagingButton.getHeight();
        final int i = this.floatingButtonIcon.getLayoutParams().width;
        final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, height);
        transformableLoginButtonView.setLayoutParams(layoutParams);
        int[] iArr = new int[2];
        this.fragmentView.getLocationInWindow(iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        this.startMessagingButton.getLocationInWindow(iArr);
        final float f = iArr[0] - i2;
        final float f2 = iArr[1] - i3;
        transformableLoginButtonView.setTranslationX(f);
        transformableLoginButtonView.setTranslationY(f2);
        final int width2 = (((((ActionBarLayout) getParentLayout()).getView().getWidth() - this.floatingButtonIcon.getLayoutParams().width) - AndroidUtilities.dp(20.0f)) - ((ActionBarLayout) getParentLayout()).getView().getPaddingLeft()) - ((ActionBarLayout) getParentLayout()).getView().getPaddingRight();
        final int height2 = ((((((ActionBarLayout) getParentLayout()).getView().getHeight() - this.floatingButtonIcon.getLayoutParams().height) - AndroidUtilities.dp(14.0f)) - (isCustomKeyboardVisible() ? AndroidUtilities.dp(230.0f) : 0)) - ((ActionBarLayout) getParentLayout()).getView().getPaddingTop()) - ((ActionBarLayout) getParentLayout()).getView().getPaddingBottom();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                LoginActivity.this.keyboardLinearLayout.setAlpha(1.0f);
                LoginActivity.this.startMessagingButton.setVisibility(0);
                LoginActivity.this.fragmentView.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
                LoginActivity.this.floatingButton.setButtonVisible(true, false);
                ((FrameLayout) LoginActivity.this.fragmentView).removeView(transformableLoginButtonView);
                if (LoginActivity.this.animationFinishCallback != null) {
                    AndroidUtilities.runOnUIThread(LoginActivity.this.animationFinishCallback);
                    LoginActivity.this.animationFinishCallback = null;
                }
                LoginActivity.this.isAnimatingIntro = false;
                runnable.run();
            }

            @Override
            public void onAnimationStart(Animator animator) {
                LoginActivity.this.floatingButton.setButtonVisible(false, false);
                LoginActivity.this.keyboardLinearLayout.setAlpha(0.0f);
                LoginActivity.this.fragmentView.setBackgroundColor(0);
                LoginActivity.this.startMessagingButton.setVisibility(4);
                ((FrameLayout) LoginActivity.this.fragmentView).addView(transformableLoginButtonView);
            }
        });
        final int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
        final int iAlpha = Color.alpha(color);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f$0.lambda$onCustomTransitionAnimation$30(color, iAlpha, layoutParams, width, i, height, transformableLoginButtonView, f, width2, f2, height2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.start();
        return animatorSet;
    }

    @Override
    public void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.permissionsDialog && !this.permissionsItems.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
                } else {
                    if (dialog != this.permissionsShowDialog || this.permissionsShowItems.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda8(this, 0), 200L);
                    getParentActivity().requestPermissions((String[]) this.permissionsShowItems.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        while (true) {
            SlideView[] slideViewArr = this.views;
            if (i >= slideViewArr.length) {
                break;
            }
            SlideView slideView = slideViewArr[i];
            if (slideView != null) {
                slideView.onDestroyActivity();
            }
            i++;
        }
        AlertDialog alertDialog = this.cancelDeleteProgressDialog;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        for (Runnable runnable : this.editDoneCallback) {
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().removeObserver(this, NotificationCenter.newSuggestionsAvailable);
    }

    @Override
    public void onPause() {
        super.onPause();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(true, false);
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (strArr.length == 0 || iArr.length == 0) {
            return;
        }
        boolean z = iArr[0] == 0;
        if (i == 6) {
            this.checkPermissions = false;
            int i2 = this.currentViewNum;
            if (i2 == 0) {
                ((PhoneView) this.views[i2]).confirmedNumber = true;
                this.views[this.currentViewNum].lambda$onNextPressed$16(null);
                return;
            }
            return;
        }
        if (i == 7) {
            this.checkShowPermissions = false;
            int i3 = this.currentViewNum;
            if (i3 == 0) {
                ((PhoneView) this.views[i3]).fillNumber();
                return;
            }
            return;
        }
        if (i == 20) {
            if (z) {
                ((LoginActivityRegisterView) this.views[5]).imageUpdater.openCamera();
            }
        } else if (i == 151 && z) {
            LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
            loginActivityRegisterView.post(new LoginActivity$$ExternalSyntheticLambda16(loginActivityRegisterView, 0));
        }
    }

    @Override
    public void onResume() {
        SlideView slideView;
        int i;
        super.onResume();
        if (this.newAccount) {
            ConnectionsManager.getInstance(this.currentAccount).setAppPaused(false, false);
        }
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        View view = this.fragmentView;
        if (view != null) {
            view.requestLayout();
        }
        try {
            int i2 = this.currentViewNum;
            if (i2 >= 1 && i2 <= 4) {
                SlideView slideView2 = this.views[i2];
                if ((slideView2 instanceof LoginActivitySmsView) && (i = ((LoginActivitySmsView) slideView2).openTime) != 0 && Math.abs((System.currentTimeMillis() / 1000) - ((long) i)) >= 86400) {
                    this.views[this.currentViewNum].onBackPressed(true);
                    setPage(0, false, null, true);
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        int i3 = this.currentViewNum;
        if (i3 == 0 && !this.needRequestPermissions && (slideView = this.views[i3]) != null) {
            slideView.onShow();
        }
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
        }
        int i4 = this.currentViewNum;
        if (i4 >= 0) {
            SlideView[] slideViewArr = this.views;
            if (i4 < slideViewArr.length) {
                slideViewArr[i4].onResume();
            }
        }
    }

    public void open(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.paid = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        lambda$fillNextCodeParams$26(bundle, auth_sentcode, true);
    }

    @Override
    public void saveSelfArgs(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("currentViewNum", this.currentViewNum);
            bundle2.putInt("syncContacts", this.syncContacts ? 1 : 0);
            for (int i = 0; i <= this.currentViewNum; i++) {
                SlideView slideView = this.views[i];
                if (slideView != null) {
                    slideView.saveStateParams(bundle2);
                }
            }
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
            sb.append(this.newAccount ? "_" + this.currentAccount : "");
            SharedPreferences.Editor editorEdit = context.getSharedPreferences(sb.toString(), 0).edit();
            editorEdit.clear();
            putBundleToEditor(bundle2, editorEdit, null);
            editorEdit.commit();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public LoginActivity setIntroView(View view, TextView textView) {
        return this;
    }

    public void setPage(int i, boolean z, Bundle bundle, boolean z2) {
        final boolean z3 = i == 0 || i == 5 || i == 6 || i == 9 || i == 10 || i == 12 || i == 17 || i == 16;
        if (i == this.currentViewNum) {
            z = false;
        }
        if (z3) {
            if (i == 0) {
                this.checkPermissions = true;
                this.checkShowPermissions = true;
            }
            this.currentDoneType = 1;
            showDoneButton(false, z);
            showEditDoneProgress(false, z);
            this.currentDoneType = 0;
            showEditDoneProgress(false, z);
            if (!z) {
                showDoneButton(true, false);
            }
        } else {
            this.currentDoneType = 0;
            showDoneButton(false, z);
            showEditDoneProgress(false, z);
            if (i != 8) {
                this.currentDoneType = 1;
            }
        }
        if (!z) {
            this.backButtonView.setVisibility((this.views[i].needBackButton() || this.newAccount) ? 0 : 8);
            this.views[this.currentViewNum].setVisibility(8);
            this.views[this.currentViewNum].onHide();
            this.currentViewNum = i;
            this.views[i].setParams(bundle, false);
            this.views[i].setVisibility(0);
            setParentActivityTitle(this.views[i].getHeaderName());
            this.views[i].onShow();
            setCustomKeyboardVisible(this.views[i].hasCustomKeyboard(), false);
            return;
        }
        SlideView[] slideViewArr = this.views;
        final SlideView slideView = slideViewArr[this.currentViewNum];
        SlideView slideView2 = slideViewArr[i];
        this.currentViewNum = i;
        this.backButtonView.setVisibility((slideView2.needBackButton() || this.newAccount) ? 0 : 8);
        slideView2.setParams(bundle, false);
        setParentActivityTitle(slideView2.getHeaderName());
        slideView2.onShow();
        slideView2.setX(z2 ? -AndroidUtilities.displaySize.x : AndroidUtilities.displaySize.x);
        slideView2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.currentDoneType == 0 && z3) {
                    LoginActivity.this.showDoneButton(true, true);
                }
                slideView.setVisibility(8);
                slideView.onHide();
                slideView.setX(0.0f);
            }
        });
        Property property = View.TRANSLATION_X;
        animatorSet.playTogether(ObjectAnimator.ofFloat(slideView, (Property<SlideView, Float>) property, z2 ? AndroidUtilities.displaySize.x : -AndroidUtilities.displaySize.x), ObjectAnimator.ofFloat(slideView2, (Property<SlideView, Float>) property, 0.0f));
        animatorSet.setDuration(300L);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();
        setCustomKeyboardVisible(slideView2.hasCustomKeyboard(), true);
    }

    public void needHideProgress(boolean z, boolean z2) {
        AlertDialog alertDialog;
        if (this.progressRequestId != 0) {
            if (z) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.progressRequestId, true);
            }
            this.progressRequestId = 0;
        }
        if (isInCancelAccountDeletionMode() && (alertDialog = this.cancelDeleteProgressDialog) != null) {
            alertDialog.dismiss();
            this.cancelDeleteProgressDialog = null;
        }
        showEditDoneProgress(false, z2);
    }

    public static void needShowInvalidAlert(BaseFragment baseFragment, String str, PhoneInputData phoneInputData, boolean z) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity(), 0, null);
        if (z) {
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("BannedPhoneNumber", R.string.BannedPhoneNumber));
        } else if (phoneInputData == null || phoneInputData.patterns == null || phoneInputData.patterns.isEmpty() || phoneInputData.country == null) {
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString(R.string.InvalidPhoneNumber));
        } else {
            Iterator it = phoneInputData.patterns.iterator();
            int i = Integer.MAX_VALUE;
            while (it.hasNext()) {
                int length = ((String) it.next()).replace(" ", "").length();
                if (length < i) {
                    i = length;
                }
            }
            if (PhoneFormat.stripExceptNumbers(str, false).length() - phoneInputData.country.code.length() < i) {
                builder.setTitle(LocaleController.getString(R.string.WrongNumberFormat));
                SendMessagesHelper$$ExternalSyntheticOutline0.m("ShortNumberInfo", R.string.ShortNumberInfo, new Object[]{phoneInputData.country.name, phoneInputData.phoneNumber}, builder);
            } else {
                builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
                builder.setMessage(LocaleController.getString(R.string.InvalidPhoneNumber));
            }
        }
        builder.setNeutralButton(LocaleController.getString("BotHelp", R.string.BotHelp), new LoginActivity$$ExternalSyntheticLambda26(str, z, baseFragment));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        baseFragment.showDialog(builder.create());
    }

    public void needShowProgress(int i, boolean z) {
        if (!isInCancelAccountDeletionMode() || i != 0) {
            this.progressRequestId = i;
            showEditDoneProgress(true, z);
        } else {
            if (this.cancelDeleteProgressDialog != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3, null);
            this.cancelDeleteProgressDialog = alertDialog;
            alertDialog.canCacnel = false;
            alertDialog.show();
        }
    }

    public void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization, boolean z) {
        MessagesController.getInstance(this.currentAccount).cleanup();
        ConnectionsManager.getInstance(this.currentAccount).setUserId(tL_auth_authorization.user.id);
        UserConfig.getInstance(this.currentAccount).clearConfig();
        MessagesController.getInstance(this.currentAccount).cleanup();
        UserConfig.getInstance(this.currentAccount).syncContacts = this.syncContacts;
        UserConfig.getInstance(this.currentAccount).setCurrentUser(tL_auth_authorization.user);
        UserConfig.getInstance(this.currentAccount).saveConfig(true);
        MessagesStorage.getInstance(this.currentAccount).cleanup(true);
        ArrayList arrayList = new ArrayList();
        arrayList.add(tL_auth_authorization.user);
        MessagesStorage.getInstance(this.currentAccount).putUsersAndChats(arrayList, null, true, true);
        MessagesController.getInstance(this.currentAccount).putUser(tL_auth_authorization.user, false);
        ContactsController.getInstance(this.currentAccount).checkAppAccount();
        MessagesController.getInstance(this.currentAccount).checkPromoInfo(true);
        ConnectionsManager.getInstance(this.currentAccount).updateDcSettings();
        MessagesController.getInstance(this.currentAccount).loadAppConfig();
        MessagesController.getInstance(this.currentAccount).lambda$removeWebBrowserException$514();
        MessagesController.getInstance(this.currentAccount).checkPeerColors(false);
        if (tL_auth_authorization.future_auth_token != null) {
            AuthTokensHelper.saveLogInToken(tL_auth_authorization);
        } else {
            FileLog.d("onAuthSuccess future_auth_token is empty");
        }
        if (z) {
            MessagesController.getInstance(this.currentAccount).putDialogsEndReachedAfterRegistration();
        }
        MediaDataController.getInstance(this.currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, true);
        needFinishActivity(z, tL_auth_authorization.setup_password_required, tL_auth_authorization.otherwise_relogin_days);
    }

    public void lambda$showEditDoneProgress$14(final boolean z, final boolean z2, boolean z3) {
        int i = 2;
        if (z2 && this.doneProgressVisible[this.currentDoneType] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new LoginActivity$$ExternalSyntheticLambda40(this, z, z2, z3, 0));
            return;
        }
        final int i2 = this.currentDoneType;
        boolean z4 = i2 == 0;
        if (z3 || z4) {
            this.postedEditDoneCallback[i2] = false;
            this.doneProgressVisible[i2] = z;
        } else {
            this.doneProgressVisible[i2] = z;
            if (z2) {
                if (this.postedEditDoneCallback[i2]) {
                    AndroidUtilities.cancelRunOnUIThread(this.editDoneCallback[i2]);
                    this.postedEditDoneCallback[this.currentDoneType] = false;
                    return;
                } else if (z) {
                    Runnable[] runnableArr = this.editDoneCallback;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$showEditDoneProgress$15(i2, z, z2);
                        }
                    };
                    runnableArr[i2] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    this.postedEditDoneCallback[this.currentDoneType] = true;
                    return;
                }
            }
        }
        AnimatorSet animatorSet = this.doneItemAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            this.floatingButton.setProgressVisible(z, z2);
            return;
        }
        if (z2) {
            this.doneItemAnimation = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(z ? 0.0f : 1.0f, z ? 1.0f : 0.0f);
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (!z) {
                        LoginActivity.this.radialProgressView.setVisibility(4);
                    }
                    if (LoginActivity.this.doneItemAnimation == null || !LoginActivity.this.doneItemAnimation.equals(animator)) {
                        return;
                    }
                    LoginActivity.this.doneItemAnimation = null;
                }

                @Override
                public void onAnimationStart(Animator animator) {
                    if (z) {
                        LoginActivity.this.radialProgressView.setVisibility(0);
                    }
                }
            });
            valueAnimatorOfFloat.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda17(this, i));
            this.doneItemAnimation.playTogether(valueAnimatorOfFloat);
            this.doneItemAnimation.setDuration(150L);
            this.doneItemAnimation.start();
            return;
        }
        if (z) {
            this.radialProgressView.setVisibility(0);
            this.radialProgressView.setScaleX(1.0f);
            this.radialProgressView.setScaleY(1.0f);
            this.radialProgressView.setAlpha(1.0f);
            return;
        }
        this.radialProgressView.setTag(null);
        this.radialProgressView.setVisibility(4);
        this.radialProgressView.setScaleX(0.1f);
        this.radialProgressView.setScaleY(0.1f);
        this.radialProgressView.setAlpha(0.0f);
    }

    public void lambda$resendCodeFromSafetyNet$18(Bundle bundle, TLRPC.auth_SentCode auth_sentcode) {
        lambda$fillNextCodeParams$26(bundle, auth_sentcode, true);
    }

    public LoginActivity changeEmail(Runnable runnable, Runnable runnable2, boolean z) {
        this.activityMode = 3;
        this.currentViewNum = 12;
        this.emailChangeFinishCallback = runnable;
        this.emailChangeSkipCallback = runnable2;
        this.emailChangeNonSkippable = z;
        this.emailChangeIsSuggestion = true;
        return this;
    }

    public void lambda$fillNextCodeParams$26(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, boolean z) {
        if (auth_sentcode instanceof TLRPC.TL_auth_sentCodePaymentRequired) {
            TLRPC.TL_auth_sentCodePaymentRequired tL_auth_sentCodePaymentRequired = (TLRPC.TL_auth_sentCodePaymentRequired) auth_sentcode;
            bundle.putString("product", tL_auth_sentCodePaymentRequired.store_product);
            bundle.putString("phoneHash", tL_auth_sentCodePaymentRequired.phone_code_hash);
            bundle.putString("support_email_address", tL_auth_sentCodePaymentRequired.support_email_address);
            bundle.putString("support_email_subject", tL_auth_sentCodePaymentRequired.support_email_subject);
            bundle.putString("currency", tL_auth_sentCodePaymentRequired.currency);
            bundle.putInt("premium_days", tL_auth_sentCodePaymentRequired.premium_days);
            bundle.putLong("amount", tL_auth_sentCodePaymentRequired.amount);
            setPage(18, true, bundle, true);
            return;
        }
        TLRPC.auth_SentCodeType auth_sentcodetype = auth_sentcode.type;
        if ((auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms) && !auth_sentcodetype.verifiedFirebase && !this.isRequestingFirebaseSms) {
            if (PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
                TLRPC.TL_auth_sentCodeTypeFirebaseSms tL_auth_sentCodeTypeFirebaseSms = (TLRPC.TL_auth_sentCodeTypeFirebaseSms) auth_sentcode.type;
                needShowProgress(0);
                this.isRequestingFirebaseSms = true;
                String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(getContext());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = ".concat(str));
                    Task<IntegrityTokenResponse> taskAddOnSuccessListener = integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new LoginActivity$$ExternalSyntheticLambda33(this, bundle, auth_sentcode, string, z));
                    final int i = 0;
                    taskAddOnSuccessListener.addOnFailureListener(new OnFailureListener(this) {
                        public final LoginActivity f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override
                        public final void onFailure(Exception exc) {
                            switch (i) {
                                case 0:
                                    this.f$0.lambda$fillNextCodeParams$25(bundle, auth_sentcode, exc);
                                    break;
                                default:
                                    this.f$0.lambda$fillNextCodeParams$29(bundle, auth_sentcode, exc);
                                    break;
                            }
                        }
                    });
                    return;
                }
                zze zzeVar = new zze(ApplicationLoader.applicationContext, SafetyNet.API, null, new ApiExceptionMapper());
                byte[] bArr = auth_sentcode.type.nonce;
                String str2 = BuildVars.SAFETYNET_KEY;
                zabv zabvVar = zzeVar.zai;
                zzi zziVar = new zzi(zabvVar, bArr, str2);
                zabvVar.zaa.zad(0, zziVar);
                Task taskAddOnSuccessListener2 = zzah.toTask(zziVar, new zah(new SafetyNetApi$AttestationResponse())).addOnSuccessListener(new LoginActivity$$ExternalSyntheticLambda33(this, string, auth_sentcode, bundle, z));
                final int i2 = 1;
                taskAddOnSuccessListener2.addOnFailureListener(new OnFailureListener(this) {
                    public final LoginActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onFailure(Exception exc) {
                        switch (i2) {
                            case 0:
                                this.f$0.lambda$fillNextCodeParams$25(bundle, auth_sentcode, exc);
                                break;
                            default:
                                this.f$0.lambda$fillNextCodeParams$29(bundle, auth_sentcode, exc);
                                break;
                        }
                    }
                });
                return;
            }
            FileLog.d("{GOOGLE_PLAY_SERVICES_NOT_AVAILABLE} Resend firebase sms because firebase is not available");
            resendCodeFromSafetyNet(bundle, auth_sentcode, "GOOGLE_PLAY_SERVICES_NOT_AVAILABLE");
            return;
        }
        bundle.putString("phoneHash", auth_sentcode.phone_code_hash);
        TLRPC.auth_CodeType auth_codetype = auth_sentcode.next_type;
        if (auth_codetype instanceof TLRPC.TL_auth_codeTypeCall) {
            bundle.putInt("nextType", 4);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFlashCall) {
            bundle.putInt("nextType", 3);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeSms) {
            bundle.putInt("nextType", 2);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeMissedCall) {
            bundle.putInt("nextType", 11);
        } else if (auth_codetype instanceof TLRPC.TL_auth_codeTypeFragmentSms) {
            bundle.putInt("nextType", 15);
        }
        if (auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeApp) {
            bundle.putInt("type", 1);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(1, z, bundle, false);
            return;
        }
        if (auth_sentcode.timeout == 0) {
            auth_sentcode.timeout = BuildVars.DEBUG_PRIVATE_VERSION ? 5 : 60;
        }
        bundle.putInt("timeout", auth_sentcode.timeout * 1000);
        TLRPC.auth_SentCodeType auth_sentcodetype2 = auth_sentcode.type;
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeCall) {
            bundle.putInt("type", 4);
            bundle.putInt("length", auth_sentcode.type.length);
            setPage(4, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFlashCall) {
            bundle.putInt("type", 3);
            bundle.putString("pattern", auth_sentcode.type.pattern);
            setPage(3, z, bundle, false);
            return;
        }
        if (!(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) && !(auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFragmentSms) {
                bundle.putInt("type", 15);
                bundle.putString("url", auth_sentcode.type.url);
                bundle.putInt("length", auth_sentcode.type.length);
                setPage(15, z, bundle, false);
                return;
            }
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeMissedCall) {
                bundle.putInt("type", 11);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putString("prefix", auth_sentcode.type.prefix);
                setPage(11, z, bundle, false);
                return;
            }
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSetUpEmailRequired) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                setPage(12, z, bundle, false);
                return;
            }
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                bundle.putBoolean("googleSignInAllowed", auth_sentcodetype2.google_signin_allowed);
                bundle.putString("emailPattern", auth_sentcode.type.email_pattern);
                bundle.putInt("length", auth_sentcode.type.length);
                bundle.putInt("nextPhoneLoginDate", auth_sentcode.type.next_phone_login_date);
                bundle.putInt("resetAvailablePeriod", auth_sentcode.type.reset_available_period);
                bundle.putInt("resetPendingDate", auth_sentcode.type.reset_pending_date);
                setPage(14, z, bundle, false);
                return;
            }
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                String str3 = auth_sentcodetype2.beginning;
                if (str3 != null) {
                    bundle.putString("beginning", str3);
                }
                setPage(16, z, bundle, false);
                return;
            }
            if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                String str4 = auth_sentcodetype2.beginning;
                if (str4 != null) {
                    bundle.putString("beginning", str4);
                }
                setPage(17, z, bundle, false);
                return;
            }
            return;
        }
        bundle.putInt("type", 2);
        bundle.putInt("length", auth_sentcode.type.length);
        bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
        setPage(2, z, bundle, false);
    }

    public LoginActivity(int i) {
        super(null);
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList<>();
        this.permissionsShowItems = new ArrayList<>();
        this.checkPermissions = true;
        this.checkShowPermissions = true;
        this.syncContacts = true;
        this.testBackend = false;
        this.activityMode = 0;
        this.showDoneAnimation = new AnimatorSet[2];
        this.doneButtonVisible = new boolean[]{true, false};
        this.customKeyboardWasVisible = false;
        this.doneProgressVisible = new boolean[2];
        this.editDoneCallback = new Runnable[2];
        this.postedEditDoneCallback = new boolean[2];
        this.currentAccount = i;
        this.newAccount = true;
    }
}
