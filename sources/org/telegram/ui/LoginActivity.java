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
import androidx.core.content.ContextCompat;
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.dynamicanimation.animation.DynamicAnimation;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.BillingResult;
import com.android.billingclient.api.ProductDetails;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchasesResponseListener;
import com.android.billingclient.api.QueryProductDetailsParams;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.safetynet.SafetyNet;
import com.google.android.gms.safetynet.SafetyNetApi;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.IntegrityTokenRequest;
import com.google.android.play.core.integrity.IntegrityTokenResponse;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
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
import java.util.function.Function;
import java.util.function.Predicate;
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
import org.telegram.messenger.GenericProvider;
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
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.Easings;
import org.telegram.ui.Components.EditTextBoldCursor;
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
    private static final int SHOW_DELAY;
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
    private ArrayList permissionsItems;
    private Dialog permissionsShowDialog;
    private ArrayList permissionsShowItems;
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

    static class ProgressView extends View {
    }

    public LoginActivity setIntroView(View view, TextView textView) {
        return this;
    }

    static {
        SHOW_DELAY = SharedConfig.getDevicePerformanceClass() <= 1 ? 150 : 100;
    }

    public LoginActivity() {
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
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

    public LoginActivity(int i) {
        this.views = new SlideView[19];
        this.permissionsItems = new ArrayList();
        this.permissionsShowItems = new ArrayList();
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

    public LoginActivity changeEmail(Runnable runnable) {
        this.activityMode = 3;
        this.currentViewNum = 12;
        this.emailChangeFinishCallback = runnable;
        return this;
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

    public LoginActivity cancelAccountDeletion(String str, Bundle bundle, TLRPC.TL_auth_sentCode tL_auth_sentCode) {
        this.cancelDeletionPhone = str;
        this.cancelDeletionParams = bundle;
        this.cancelDeletionCode = tL_auth_sentCode;
        this.activityMode = 1;
        return this;
    }

    public LoginActivity changePhoneNumber() {
        this.activityMode = 2;
        return this;
    }

    public boolean isInCancelAccountDeletionMode() {
        return this.activityMode == 1;
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
    public boolean onFragmentCreate() {
        getNotificationCenter().addObserver(this, NotificationCenter.didUpdateConnectionState);
        getNotificationCenter().addObserver(this, NotificationCenter.newSuggestionsAvailable);
        return super.onFragmentCreate();
    }

    @Override
    public View createView(Context context) {
        Bundle bundle;
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
            protected void onMeasure(int i2, int i3) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) LoginActivity.this.floatingButton.getLayoutParams();
                int iDp = LoginActivity.this.isCustomKeyboardVisible() ? AndroidUtilities.dp(226.0f) : 0;
                if (LoginActivity.this.isCustomKeyboardVisible() && measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    iDp -= measureKeyboardHeight();
                }
                if (Bulletin.getVisibleBulletin() != null && Bulletin.getVisibleBulletin().isShowing()) {
                    super.onMeasure(i2, i3);
                    marginLayoutParams.bottomMargin = ((AndroidUtilities.dp(14.0f) + Bulletin.getVisibleBulletin().getLayout().getMeasuredHeight()) - AndroidUtilities.dp(10.0f)) + iDp;
                } else {
                    marginLayoutParams.bottomMargin = AndroidUtilities.dp(14.0f) + iDp;
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
        sizeNotifierFrameLayout.setDelegate(new SizeNotifierFrameLayout.SizeNotifierFrameLayoutDelegate() {
            @Override
            public final void onSizeChanged(int i2, boolean z2) {
                LoginActivity.$r8$lambda$q5ChveneUapvhYlla6JcwXPBjxo(this.f$0, i2, z2);
            }
        });
        this.fragmentView = this.sizeNotifierFrameLayout;
        ScrollView scrollView = new ScrollView(context) {
            @Override
            public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z2) {
                if (LoginActivity.this.currentViewNum == 1 || LoginActivity.this.currentViewNum == 2 || LoginActivity.this.currentViewNum == 4) {
                    rect.bottom += AndroidUtilities.dp(40.0f);
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
            protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
                super.onLayout(z2, i2, i3, i4, i5);
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int height = getHeight() + AndroidUtilities.dp(16.0f);
                    if (!slideView.hasCustomKeyboard() && LoginActivity.this.keyboardView.getVisibility() == 0) {
                        height += AndroidUtilities.dp(230.0f);
                    }
                    slideView.layout(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, getWidth() - marginLayoutParams.rightMargin, height);
                }
            }

            @Override
            protected void onMeasure(int i2, int i3) {
                super.onMeasure(i2, i3);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                for (SlideView slideView : LoginActivity.this.views) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) slideView.getLayoutParams();
                    int iDp = (measuredHeight - marginLayoutParams.topMargin) + AndroidUtilities.dp(16.0f);
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
                if (i5 == 0 || Math.abs((System.currentTimeMillis() / 1000) - ((long) i5)) < 86400) {
                    bundle = bundleLoadCurrentState;
                } else {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                }
            } else if (i4 == 6) {
                if (((LoginActivityPasswordView) this.views[6]).currentPassword == null) {
                    this.currentViewNum = 0;
                    clearCurrentState();
                    bundle = null;
                } else {
                    bundle = bundleLoadCurrentState;
                }
            } else if (i4 == 7 && ((LoginActivityRecoverView) this.views[7]).passwordString == null) {
                this.currentViewNum = 0;
                clearCurrentState();
                bundle = null;
            } else {
                bundle = bundleLoadCurrentState;
            }
        } else {
            bundle = bundleLoadCurrentState;
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        fragmentFloatingButton.setButtonVisible(this.doneButtonVisible[0], false);
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButton);
        this.sizeNotifierFrameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParamsBig());
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.onDoneButtonPressed();
            }
        });
        this.floatingAutoAnimator.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                LoginActivity.$r8$lambda$8HSHuuCDEZWrFgEC9n1MdRwhaac(this.f$0, dynamicAnimation, f, f2);
            }
        });
        ImageView imageView = new ImageView(context);
        this.backButtonView = imageView;
        imageView.setImageResource(R.drawable.ic_ab_back);
        this.backButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LoginActivity.$r8$lambda$rP_z0SmrR9Pqdh2YUHBLXuuiW0Y(this.f$0, view2);
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
            this.emailChangeSkipButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.sizeNotifierFrameLayout.addView(this.emailChangeSkipButton, LayoutHelper.createFrame(-2, 30.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
            this.emailChangeSkipButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LoginActivity.m3429$r8$lambda$AQoW_GgTffAeeq8WIA6NgIDKZs(this.f$0, view2);
                }
            });
        }
        ImageView imageView2 = new ImageView(context);
        this.proxyButtonView = imageView2;
        ProxyDrawable proxyDrawable = new ProxyDrawable(context);
        this.proxyDrawable = proxyDrawable;
        imageView2.setImageDrawable(proxyDrawable);
        this.proxyButtonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                LoginActivity.$r8$lambda$SJAv2wWiqAlsCdlebWAu3FEngxM(this.f$0, view2);
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
        if (bundle != null) {
            this.restoringState = true;
        }
        int i6 = 0;
        while (true) {
            SlideView[] slideViewArr2 = this.views;
            if (i6 >= slideViewArr2.length) {
                break;
            }
            SlideView slideView = slideViewArr2[i6];
            if (bundle != null && (i6 < 1 || i6 > 4 || i6 == this.currentViewNum)) {
                slideView.restoreStateParams(bundle);
            }
            if (this.currentViewNum == i6) {
                this.backButtonView.setVisibility((slideView.needBackButton() || this.newAccount || this.activityMode == 2) ? 0 : 8);
                slideView.setVisibility(0);
                slideView.onShow();
                setCustomKeyboardVisible(slideView.hasCustomKeyboard(), false);
                this.currentDoneType = 0;
                if (i6 != 0 && i6 != 5 && i6 != 6) {
                    if (i6 != 9) {
                        if (i6 != 10 && i6 != 12) {
                            z = false;
                        }
                        showDoneButton(z, false);
                        if (i6 != 1 || i6 == 2 || i6 == 3 || i6 == 4) {
                            this.currentDoneType = 1;
                        }
                    }
                    z = true;
                    showDoneButton(z, false);
                    if (i6 != 1) {
                        this.currentDoneType = 1;
                    } else {
                        this.currentDoneType = 1;
                    }
                }
                z = true;
                showDoneButton(z, false);
                if (i6 != 1) {
                    this.currentDoneType = 1;
                } else {
                    this.currentDoneType = 1;
                }
            } else if (slideView.getVisibility() != 8) {
                slideView.setVisibility(8);
                slideView.onHide();
            }
            i6++;
        }
        this.restoringState = false;
        updateColors();
        if (isInCancelAccountDeletionMode()) {
            fillNextCodeParams(this.cancelDeletionParams, this.cancelDeletionCode, false);
        }
        return this.fragmentView;
    }

    public static void $r8$lambda$q5ChveneUapvhYlla6JcwXPBjxo(LoginActivity loginActivity, int i, boolean z) {
        Runnable runnable;
        loginActivity.getClass();
        if (i > AndroidUtilities.dp(20.0f) && loginActivity.isCustomKeyboardVisible()) {
            AndroidUtilities.hideKeyboard(loginActivity.fragmentView);
        }
        if (i > AndroidUtilities.dp(20.0f) || (runnable = loginActivity.keyboardHideCallback) == null) {
            return;
        }
        runnable.run();
        loginActivity.keyboardHideCallback = null;
    }

    public static void $r8$lambda$8HSHuuCDEZWrFgEC9n1MdRwhaac(LoginActivity loginActivity, DynamicAnimation dynamicAnimation, float f, float f2) {
        PhoneNumberConfirmView phoneNumberConfirmView = loginActivity.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateFabPosition();
        }
    }

    public static void $r8$lambda$rP_z0SmrR9Pqdh2YUHBLXuuiW0Y(LoginActivity loginActivity, View view) {
        if (loginActivity.onBackPressed(true)) {
            loginActivity.finishFragment();
        }
    }

    public static void m3429$r8$lambda$AQoW_GgTffAeeq8WIA6NgIDKZs(LoginActivity loginActivity, View view) {
        Runnable runnable = loginActivity.emailChangeSkipCallback;
        if (runnable != null) {
            runnable.run();
        }
        loginActivity.finishFragment();
    }

    public static void $r8$lambda$SJAv2wWiqAlsCdlebWAu3FEngxM(LoginActivity loginActivity, View view) {
        loginActivity.getClass();
        loginActivity.presentFragment(new ProxyListActivity());
    }

    public boolean isCustomKeyboardForceDisabled() {
        return AndroidUtilities.isAccessibilityTouchExplorationEnabled();
    }

    public boolean isCustomKeyboardVisible() {
        return this.views[this.currentViewNum].hasCustomKeyboard() && !isCustomKeyboardForceDisabled();
    }

    private void setCustomKeyboardVisible(boolean z, boolean z2) {
        if (this.customKeyboardWasVisible == z && z2) {
            return;
        }
        this.customKeyboardWasVisible = z;
        if (isCustomKeyboardForceDisabled()) {
            z = false;
        }
        if (z) {
            AndroidUtilities.hideKeyboard(this.fragmentView);
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            if (z2) {
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
                this.keyboardAnimator = duration;
                duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
                this.keyboardAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        LoginActivity.$r8$lambda$TFlKJ2r31imXsuyvhCeHgvhg68o(this.f$0, valueAnimator);
                    }
                });
                this.keyboardAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationStart(Animator animator) {
                        LoginActivity.this.keyboardView.setVisibility(0);
                    }

                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (LoginActivity.this.keyboardAnimator == animator) {
                            LoginActivity.this.keyboardAnimator = null;
                        }
                    }
                });
                this.keyboardAnimator.start();
                return;
            }
            this.keyboardView.setVisibility(0);
            return;
        }
        AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        if (z2) {
            ValueAnimator duration2 = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(300L);
            this.keyboardAnimator = duration2;
            duration2.setInterpolator(Easings.easeInOutQuad);
            this.keyboardAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.$r8$lambda$uSxXefo0zmed2n8QiDUiVnvLQs0(this.f$0, valueAnimator);
                }
            });
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
        this.keyboardView.setVisibility(8);
    }

    public static void $r8$lambda$TFlKJ2r31imXsuyvhCeHgvhg68o(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardView.setAlpha(fFloatValue);
        loginActivity.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
    }

    public static void $r8$lambda$uSxXefo0zmed2n8QiDUiVnvLQs0(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardView.setAlpha(fFloatValue);
        loginActivity.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
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

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        setCustomKeyboardVisible(this.views[this.currentViewNum].hasCustomKeyboard(), false);
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.dismiss();
        }
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
                this.views[this.currentViewNum].onNextPressed(null);
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
            final LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
            loginActivityRegisterView.post(new Runnable() {
                @Override
                public final void run() {
                    loginActivityRegisterView.imageUpdater.openGallery();
                }
            });
        }
    }

    public static Bundle loadCurrentState(boolean z, int i) {
        try {
            Bundle bundle = new Bundle();
            Context context = ApplicationLoader.applicationContext;
            StringBuilder sb = new StringBuilder();
            sb.append("logininfo2");
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

    private void clearCurrentState() {
        String str;
        Context context = ApplicationLoader.applicationContext;
        StringBuilder sb = new StringBuilder();
        sb.append("logininfo2");
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

    private void putBundleToEditor(Bundle bundle, SharedPreferences.Editor editor, String str) {
        for (String str2 : bundle.keySet()) {
            Object obj = bundle.get(str2);
            if (obj instanceof String) {
                if (str != null) {
                    editor.putString(str + "_|_" + str2, (String) obj);
                } else {
                    editor.putString(str2, (String) obj);
                }
            } else if (obj instanceof Integer) {
                if (str != null) {
                    editor.putInt(str + "_|_" + str2, ((Integer) obj).intValue());
                } else {
                    editor.putInt(str2, ((Integer) obj).intValue());
                }
            } else if (obj instanceof Boolean) {
                if (str != null) {
                    editor.putBoolean(str + "_|_" + str2, ((Boolean) obj).booleanValue());
                } else {
                    editor.putBoolean(str2, ((Boolean) obj).booleanValue());
                }
            } else if (obj instanceof Bundle) {
                putBundleToEditor((Bundle) obj, editor, str2);
            }
        }
    }

    @Override
    protected void onDialogDismiss(Dialog dialog) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (dialog == this.permissionsDialog && !this.permissionsItems.isEmpty() && getParentActivity() != null) {
                    getParentActivity().requestPermissions((String[]) this.permissionsItems.toArray(new String[0]), 6);
                } else {
                    if (dialog != this.permissionsShowDialog || this.permissionsShowItems.isEmpty() || getParentActivity() == null) {
                        return;
                    }
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.needRequestPermissions = false;
                        }
                    }, 200L);
                    getParentActivity().requestPermissions((String[]) this.permissionsShowItems.toArray(new String[0]), 7);
                }
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return !this.emailChangeIsSuggestion;
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
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        LoginActivityRegisterView loginActivityRegisterView = (LoginActivityRegisterView) this.views[5];
        if (loginActivityRegisterView != null) {
            loginActivityRegisterView.imageUpdater.onActivityResult(i, i2, intent);
        }
    }

    public void needShowAlert(String str, String str2) {
        if (str2 == null || getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        showDialog(builder.create());
    }

    public void onFieldError(final View view, boolean z) {
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
            final OutlineTextContainerView outlineTextContainerView = (OutlineTextContainerView) view;
            AtomicReference atomicReference = new AtomicReference();
            final EditText attachedEditText = outlineTextContainerView.getAttachedEditText();
            final AnonymousClass7 anonymousClass7 = new AnonymousClass7(attachedEditText, atomicReference);
            outlineTextContainerView.animateError(1.0f);
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.$r8$lambda$Q6A9KXbCCv9eN5RGiAuvKxNklYw(outlineTextContainerView, view, attachedEditText, anonymousClass7);
                }
            };
            atomicReference.set(runnable2);
            view.postDelayed(runnable2, 2000L);
            view.setTag(i, runnable2);
            if (attachedEditText != null) {
                attachedEditText.addTextChangedListener(anonymousClass7);
            }
        }
    }

    class AnonymousClass7 implements TextWatcher {
        final EditText val$editText;
        final AtomicReference val$timeoutCallbackRef;

        @Override
        public void afterTextChanged(Editable editable) {
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass7(EditText editText, AtomicReference atomicReference) {
            this.val$editText = editText;
            this.val$timeoutCallbackRef = atomicReference;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            final EditText editText = this.val$editText;
            final AtomicReference atomicReference = this.val$timeoutCallbackRef;
            editText.post(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.AnonymousClass7.m3436$r8$lambda$ttrkBSDQzrDg1u3lvKJfpneB1M(this.f$0, editText, atomicReference);
                }
            });
        }

        public static void m3436$r8$lambda$ttrkBSDQzrDg1u3lvKJfpneB1M(AnonymousClass7 anonymousClass7, EditText editText, AtomicReference atomicReference) {
            anonymousClass7.getClass();
            editText.removeTextChangedListener(anonymousClass7);
            editText.removeCallbacks((Runnable) atomicReference.get());
            ((Runnable) atomicReference.get()).run();
        }
    }

    public static void $r8$lambda$Q6A9KXbCCv9eN5RGiAuvKxNklYw(OutlineTextContainerView outlineTextContainerView, View view, final EditText editText, final TextWatcher textWatcher) {
        outlineTextContainerView.animateError(0.0f);
        view.setTag(R.id.timeout_callback, null);
        if (editText != null) {
            editText.post(new Runnable() {
                @Override
                public final void run() {
                    editText.removeTextChangedListener(textWatcher);
                }
            });
        }
    }

    public static void needShowInvalidAlert(BaseFragment baseFragment, String str, boolean z) {
        needShowInvalidAlert(baseFragment, str, null, z);
    }

    public static void needShowInvalidAlert(final BaseFragment baseFragment, final String str, PhoneInputData phoneInputData, final boolean z) {
        if (baseFragment == null || baseFragment.getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
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
            if (PhoneFormat.stripExceptNumbers(str).length() - phoneInputData.country.code.length() < i) {
                builder.setTitle(LocaleController.getString(R.string.WrongNumberFormat));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("ShortNumberInfo", R.string.ShortNumberInfo, phoneInputData.country.name, phoneInputData.phoneNumber)));
            } else {
                builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
                builder.setMessage(LocaleController.getString(R.string.InvalidPhoneNumber));
            }
        }
        builder.setNeutralButton(LocaleController.getString("BotHelp", R.string.BotHelp), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                LoginActivity.m3431$r8$lambda$NEA2cLpdJBDTcnTMniC1pbQLJI(z, str, baseFragment, alertDialog, i2);
            }
        });
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        baseFragment.showDialog(builder.create());
    }

    public static void m3431$r8$lambda$NEA2cLpdJBDTcnTMniC1pbQLJI(boolean z, String str, BaseFragment baseFragment, AlertDialog alertDialog, int i) {
        try {
            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
            String str2 = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
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
            AlertDialog.Builder builder = new AlertDialog.Builder(baseFragment.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle));
            builder.setMessage(LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            baseFragment.showDialog(builder.create());
        }
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
            public void onAnimationEnd(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator) || z || !z3 || LoginActivity.this.floatingButtonIcon.getAlpha() == 1.0f) {
                    return;
                }
                LoginActivity.this.floatingButtonIcon.setAlpha(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleX(1.0f);
                LoginActivity.this.floatingButtonIcon.setScaleY(1.0f);
                LoginActivity.this.floatingButtonIcon.setVisibility(0);
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] == null || !LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0].equals(animator)) {
                    return;
                }
                LoginActivity.this.showDoneAnimation[!z3 ? 1 : 0] = null;
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

    public void onDoneButtonPressed() {
        if (this.doneButtonVisible[this.currentDoneType]) {
            if (this.radialProgressView.getTag() != null) {
                if (getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("StopLoadingTitle", R.string.StopLoadingTitle));
                builder.setMessage(LocaleController.getString("StopLoading", R.string.StopLoading));
                builder.setPositiveButton(LocaleController.getString("WaitMore", R.string.WaitMore), null);
                builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.$r8$lambda$V_reFiXScvuotNahIZHVeDlxId4(this.f$0, alertDialog, i);
                    }
                });
                showDialog(builder.create());
                return;
            }
            this.views[this.currentViewNum].onNextPressed(null);
        }
    }

    public static void $r8$lambda$V_reFiXScvuotNahIZHVeDlxId4(LoginActivity loginActivity, AlertDialog alertDialog, int i) {
        loginActivity.views[loginActivity.currentViewNum].onCancelPressed();
        loginActivity.needHideProgress(true);
    }

    private void showEditDoneProgress(boolean z, boolean z2) {
        showEditDoneProgress(z, z2, false);
    }

    public void showEditDoneProgress(final boolean z, final boolean z2, final boolean z3) {
        if (z2 && this.doneProgressVisible[this.currentDoneType] == z && !z3) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showEditDoneProgress(z, z2, z3);
                }
            });
            return;
        }
        final int i = this.currentDoneType;
        boolean z4 = i == 0;
        if (!z3 && !z4) {
            this.doneProgressVisible[i] = z;
            if (z2) {
                if (this.postedEditDoneCallback[i]) {
                    AndroidUtilities.cancelRunOnUIThread(this.editDoneCallback[i]);
                    this.postedEditDoneCallback[this.currentDoneType] = false;
                    return;
                } else if (z) {
                    Runnable[] runnableArr = this.editDoneCallback;
                    Runnable runnable = new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.$r8$lambda$E2IWdBjywMGJGdWL9fUPUQloFzo(this.f$0, i, z, z2);
                        }
                    };
                    runnableArr[i] = runnable;
                    AndroidUtilities.runOnUIThread(runnable, 2000L);
                    this.postedEditDoneCallback[this.currentDoneType] = true;
                    return;
                }
            }
        } else {
            this.postedEditDoneCallback[i] = false;
            this.doneProgressVisible[i] = z;
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
                public void onAnimationStart(Animator animator) {
                    if (z) {
                        LoginActivity.this.radialProgressView.setVisibility(0);
                    }
                }

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
            });
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.$r8$lambda$x9YONjY1miyvs_7B7q2SUr3SvXk(this.f$0, valueAnimator);
                }
            });
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

    public static void $r8$lambda$E2IWdBjywMGJGdWL9fUPUQloFzo(LoginActivity loginActivity, int i, boolean z, boolean z2) {
        int i2 = loginActivity.currentDoneType;
        loginActivity.currentDoneType = i;
        loginActivity.showEditDoneProgress(z, z2, true);
        loginActivity.currentDoneType = i2;
    }

    public static void $r8$lambda$x9YONjY1miyvs_7B7q2SUr3SvXk(LoginActivity loginActivity, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        float f = (0.9f * fFloatValue) + 0.1f;
        loginActivity.radialProgressView.setScaleX(f);
        loginActivity.radialProgressView.setScaleY(f);
        loginActivity.radialProgressView.setAlpha(fFloatValue);
    }

    public void needShowProgress(int i) {
        needShowProgress(i, true);
    }

    public void needShowProgress(int i, boolean z) {
        if (isInCancelAccountDeletionMode() && i == 0) {
            if (this.cancelDeleteProgressDialog != null || getParentActivity() == null || getParentActivity().isFinishing()) {
                return;
            }
            AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            this.cancelDeleteProgressDialog = alertDialog;
            alertDialog.setCanCancel(false);
            this.cancelDeleteProgressDialog.show();
            return;
        }
        this.progressRequestId = i;
        showEditDoneProgress(true, z);
    }

    public void needHideProgress(boolean z) {
        needHideProgress(z, true);
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
        if (z) {
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
            return;
        }
        this.backButtonView.setVisibility((this.views[i].needBackButton() || this.newAccount) ? 0 : 8);
        this.views[this.currentViewNum].setVisibility(8);
        this.views[this.currentViewNum].onHide();
        this.currentViewNum = i;
        this.views[i].setParams(bundle, false);
        this.views[i].setVisibility(0);
        setParentActivityTitle(this.views[i].getHeaderName());
        this.views[i].onShow();
        setCustomKeyboardVisible(this.views[i].hasCustomKeyboard(), false);
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

    private void needFinishActivity(final boolean z, boolean z2, int i) {
        if (getParentActivity() != null) {
            AndroidUtilities.setLightStatusBar(getParentActivity(), false);
        }
        clearCurrentState();
        if (getParentActivity() instanceof LaunchActivity) {
            if (this.newAccount) {
                this.newAccount = false;
                this.pendingSwitchingAccount = true;
                ((LaunchActivity) getParentActivity()).switchToAccount(this.currentAccount, true, new GenericProvider() {
                    @Override
                    public final Object provide(Object obj) {
                        return LoginActivity.$r8$lambda$Jc3JimM27ezyirJ4BlgosEcEtks(z, (Void) obj);
                    }
                });
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
                Bundle bundle = new Bundle();
                bundle.putBoolean("afterSignup", z);
                MainTabsActivity mainTabsActivity = new MainTabsActivity();
                mainTabsActivity.prepareDialogsActivity(bundle);
                presentFragment(mainTabsActivity, true);
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
            LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
            RestrictedLanguagesSelectActivity.checkRestrictedLanguages(true);
            return;
        }
        if (getParentActivity() instanceof ExternalActionActivity) {
            ((ExternalActionActivity) getParentActivity()).onFinishLogin();
        }
    }

    public static MainTabsActivity $r8$lambda$Jc3JimM27ezyirJ4BlgosEcEtks(boolean z, Void r2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("afterSignup", z);
        MainTabsActivity mainTabsActivity = new MainTabsActivity();
        mainTabsActivity.prepareDialogsActivity(bundle);
        return mainTabsActivity;
    }

    public void onAuthSuccess(TLRPC.TL_auth_authorization tL_auth_authorization) {
        onAuthSuccess(tL_auth_authorization, false);
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
        MessagesController.getInstance(this.currentAccount).loadWebBrowserConfig();
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

    public void fillNextCodeParams(Bundle bundle, TL_account.sentEmailCode sentemailcode) {
        bundle.putString("emailPattern", sentemailcode.email_pattern);
        bundle.putInt("length", sentemailcode.length);
        setPage(13, true, bundle, false);
    }

    public void fillNextCodeParams(Bundle bundle, TLRPC.auth_SentCode auth_sentcode) {
        fillNextCodeParams(bundle, auth_sentcode, true);
    }

    private void resendCodeFromSafetyNet(final Bundle bundle, TLRPC.auth_SentCode auth_sentcode, String str) {
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.m3433$r8$lambda$V7DuHSHxr7Oq9RTfUno_faW6r4(this.f$0, bundle, tLObject, tL_error);
                }
            }, 10);
        }
    }

    public static void m3433$r8$lambda$V7DuHSHxr7Oq9RTfUno_faW6r4(final LoginActivity loginActivity, final Bundle bundle, final TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject != null && !(((TLRPC.auth_SentCode) tLObject).type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.$r8$lambda$YwWSeKXRF5mwSbzrLCfK2wnYhc4(this.f$0, bundle, tLObject);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.$r8$lambda$lCAphzIcs_CxNbo_bbPhp2d9ptE(this.f$0);
                }
            });
        }
    }

    public static void $r8$lambda$YwWSeKXRF5mwSbzrLCfK2wnYhc4(LoginActivity loginActivity, Bundle bundle, TLObject tLObject) {
        loginActivity.getClass();
        loginActivity.fillNextCodeParams(bundle, (TLRPC.auth_SentCode) tLObject);
    }

    public static void $r8$lambda$lCAphzIcs_CxNbo_bbPhp2d9ptE(final LoginActivity loginActivity) {
        if (loginActivity.getParentActivity() == null || loginActivity.getParentActivity().isFinishing() || loginActivity.getContext() == null) {
            return;
        }
        new AlertDialog.Builder(loginActivity.getContext()).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.SafetyNetErrorOccurred)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.m3434$r8$lambda$hnx7ki7lg6B73N8DMuR1jKtC0(this.f$0, alertDialog, i);
            }
        }).show();
    }

    public static void m3434$r8$lambda$hnx7ki7lg6B73N8DMuR1jKtC0(LoginActivity loginActivity, AlertDialog alertDialog, int i) {
        loginActivity.forceDisableSafetyNet = true;
        if (loginActivity.currentViewNum != 0) {
            loginActivity.setPage(0, true, null, true);
        }
    }

    public static String errorString(Throwable th) {
        if (th == null) {
            return "NULL";
        }
        String simpleName = th.getClass().getSimpleName();
        if (th.getMessage() != null) {
            if (simpleName.length() > 0) {
                simpleName = simpleName + " ";
            }
            simpleName = simpleName + th.getMessage();
        }
        return simpleName.toUpperCase().replaceAll(" ", "_");
    }

    public void open(String str, TLRPC.auth_SentCode auth_sentcode) {
        this.paid = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", "+" + str);
        bundle.putString("ephone", "+" + str);
        bundle.putString("phoneFormated", str);
        fillNextCodeParams(bundle, auth_sentcode, true);
    }

    public void fillNextCodeParams(final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, final boolean z) {
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
                final String string = bundle.getString("phoneFormated");
                if (tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce != null) {
                    IntegrityManager integrityManagerCreate = IntegrityManagerFactory.create(getContext());
                    String str = new String(Base64.encode(tL_auth_sentCodeTypeFirebaseSms.play_integrity_nonce, 8));
                    FileLog.d("getting classic integrity with nonce = " + str);
                    integrityManagerCreate.requestIntegrityToken(IntegrityTokenRequest.builder().setNonce(str).setCloudProjectNumber(tL_auth_sentCodeTypeFirebaseSms.play_integrity_project_id).build()).addOnSuccessListener(new OnSuccessListener() {
                        @Override
                        public final void onSuccess(Object obj) {
                            LoginActivity.$r8$lambda$epwEcITs8hkl6X7xHKyIlSZQ1ak(this.f$0, bundle, auth_sentcode, string, z, (IntegrityTokenResponse) obj);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public final void onFailure(Exception exc) {
                            LoginActivity.m3427$r8$lambda$3ckN170ulONR68Rt2Q_f1CrLdU(this.f$0, bundle, auth_sentcode, exc);
                        }
                    });
                    return;
                }
                SafetyNet.getClient(ApplicationLoader.applicationContext).attest(auth_sentcode.type.nonce, BuildVars.SAFETYNET_KEY).addOnSuccessListener(new OnSuccessListener() {
                    @Override
                    public final void onSuccess(Object obj) {
                        LoginActivity.$r8$lambda$RbczoxBSiujwziZbio5CUyCQsyM(this.f$0, string, auth_sentcode, bundle, z, (SafetyNetApi.AttestationResponse) obj);
                    }
                }).addOnFailureListener(new OnFailureListener() {
                    @Override
                    public final void onFailure(Exception exc) {
                        LoginActivity.$r8$lambda$JfBOaiGNalhyeBwMSCy9YYMsHLo(this.f$0, bundle, auth_sentcode, exc);
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
        if ((auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSms) || (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms)) {
            bundle.putInt("type", 2);
            bundle.putInt("length", auth_sentcode.type.length);
            bundle.putBoolean("firebase", auth_sentcode.type instanceof TLRPC.TL_auth_sentCodeTypeFirebaseSms);
            setPage(2, z, bundle, false);
            return;
        }
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
            String str2 = auth_sentcodetype2.beginning;
            if (str2 != null) {
                bundle.putString("beginning", str2);
            }
            setPage(16, z, bundle, false);
            return;
        }
        if (auth_sentcodetype2 instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
            String str3 = auth_sentcodetype2.beginning;
            if (str3 != null) {
                bundle.putString("beginning", str3);
            }
            setPage(17, z, bundle, false);
        }
    }

    public static void $r8$lambda$epwEcITs8hkl6X7xHKyIlSZQ1ak(final LoginActivity loginActivity, final Bundle bundle, final TLRPC.auth_SentCode auth_sentcode, String str, final boolean z, IntegrityTokenResponse integrityTokenResponse) {
        loginActivity.getClass();
        String str2 = integrityTokenResponse.token();
        if (str2 == null) {
            FileLog.d("Resend firebase sms because integrity token = null");
            loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_TOKEN_NULL");
            return;
        }
        TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
        tL_auth_requestFirebaseSms.phone_number = str;
        tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
        tL_auth_requestFirebaseSms.play_integrity_token = str2;
        tL_auth_requestFirebaseSms.flags |= 4;
        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.$r8$lambda$qm_5_C3rBZozQPcOyC_SMvrIShg(this.f$0, auth_sentcode, bundle, z, tLObject, tL_error);
            }
        }, 10);
    }

    public static void $r8$lambda$qm_5_C3rBZozQPcOyC_SMvrIShg(final LoginActivity loginActivity, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            loginActivity.needHideProgress(false);
            loginActivity.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.fillNextCodeParams(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "PLAYINTEGRITY_REQUESTFIREBASESMS_FALSE");
    }

    public static void m3427$r8$lambda$3ckN170ulONR68Rt2Q_f1CrLdU(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        loginActivity.getClass();
        String str = "PLAYINTEGRITY_EXCEPTION_" + errorString(exc);
        FileLog.e("{" + str + "} Resend firebase sms because integrity threw error", exc);
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public static void $r8$lambda$RbczoxBSiujwziZbio5CUyCQsyM(final LoginActivity loginActivity, String str, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, SafetyNetApi.AttestationResponse attestationResponse) {
        loginActivity.getClass();
        String jwsResult = attestationResponse.getJwsResult();
        if (jwsResult != null) {
            TLRPC.TL_auth_requestFirebaseSms tL_auth_requestFirebaseSms = new TLRPC.TL_auth_requestFirebaseSms();
            tL_auth_requestFirebaseSms.phone_number = str;
            tL_auth_requestFirebaseSms.phone_code_hash = auth_sentcode.phone_code_hash;
            tL_auth_requestFirebaseSms.safety_net_token = jwsResult;
            tL_auth_requestFirebaseSms.flags |= 1;
            String[] strArrSplit = jwsResult.split("\\.");
            if (strArrSplit.length > 0) {
                try {
                    JSONObject jSONObject = new JSONObject(new String(Base64.decode(strArrSplit[1].getBytes(StandardCharsets.UTF_8), 0)));
                    boolean zOptBoolean = jSONObject.optBoolean("basicIntegrity");
                    boolean zOptBoolean2 = jSONObject.optBoolean("ctsProfileMatch");
                    if (zOptBoolean && zOptBoolean2) {
                        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(tL_auth_requestFirebaseSms, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.$r8$lambda$kQEATZpqd40HpYoOnfIJ1QqASAw(this.f$0, auth_sentcode, bundle, z, tLObject, tL_error);
                            }
                        }, 10);
                        return;
                    }
                    if (!zOptBoolean && !zOptBoolean2) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false and basicIntegrity = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_CTSPROFILEMATCH_FALSE");
                        return;
                    } else if (!zOptBoolean) {
                        FileLog.d("{SAFETYNET_BASICINTEGRITY_FALSE} Resend firebase sms because basicIntegrity = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_BASICINTEGRITY_FALSE");
                        return;
                    } else {
                        if (zOptBoolean2) {
                            return;
                        }
                        FileLog.d("{SAFETYNET_CTSPROFILEMATCH_FALSE} Resend firebase sms because ctsProfileMatch = false");
                        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CTSPROFILEMATCH_FALSE");
                        return;
                    }
                } catch (JSONException e) {
                    FileLog.e(e);
                    FileLog.d("{SAFETYNET_JSON_EXCEPTION} Resend firebase sms because of exception");
                    loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_JSON_EXCEPTION");
                    return;
                }
            }
            FileLog.d("{SAFETYNET_CANT_SPLIT} Resend firebase sms because can't split JWS token");
            loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_CANT_SPLIT");
            return;
        }
        FileLog.d("{SAFETYNET_NULL_JWS} Resend firebase sms because JWS = null");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_NULL_JWS");
    }

    public static void $r8$lambda$kQEATZpqd40HpYoOnfIJ1QqASAw(final LoginActivity loginActivity, final TLRPC.auth_SentCode auth_sentcode, final Bundle bundle, final boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            loginActivity.needHideProgress(false);
            loginActivity.isRequestingFirebaseSms = false;
            auth_sentcode.type.verifiedFirebase = true;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.fillNextCodeParams(bundle, auth_sentcode, z);
                }
            });
            return;
        }
        FileLog.d("{SAFETYNET_REQUESTFIREBASESMS_FALSE} Resend firebase sms because auth.requestFirebaseSms = false");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, "SAFETYNET_REQUESTFIREBASESMS_FALSE");
    }

    public static void $r8$lambda$JfBOaiGNalhyeBwMSCy9YYMsHLo(LoginActivity loginActivity, Bundle bundle, TLRPC.auth_SentCode auth_sentcode, Exception exc) {
        loginActivity.getClass();
        FileLog.e(exc);
        String str = "SAFETYNET_EXCEPTION_" + errorString(exc);
        FileLog.d("{" + str + "} Resend firebase sms because of safetynet exception");
        loginActivity.resendCodeFromSafetyNet(bundle, auth_sentcode, str);
    }

    public class PhoneView extends SlideView implements AdapterView.OnItemSelectedListener, NotificationCenter.NotificationCenterDelegate {
        private Runnable cancelRequestingPasskey;
        private ImageView chevronRight;
        private View codeDividerView;
        private AnimatedPhoneNumberEditText codeField;
        private HashMap codesMap;
        private boolean confirmedNumber;
        private ArrayList countriesArray;
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
        private HashMap phoneFormatMap;
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

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public void onNothingSelected(AdapterView adapterView) {
        }

        private void showDebugMenu() {
            new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.SettingsDebug)).setItems(new String[]{LocaleController.getString(BuildVars.LOGS_ENABLED ? R.string.DebugMenuDisableLogs : R.string.DebugMenuEnableLogs), LocaleController.getString(R.string.DebugSendLogs)}, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LoginActivity.PhoneView.m3522$r8$lambda$Z8vwk7AYmAorOzKbZqxpy9IZg(this.f$0, dialogInterface, i);
                }
            }).show();
        }

        public static void m3522$r8$lambda$Z8vwk7AYmAorOzKbZqxpy9IZg(PhoneView phoneView, DialogInterface dialogInterface, int i) {
            if (i == 0) {
                phoneView.getClass();
                BuildVars.LOGS_ENABLED = !BuildVars.LOGS_ENABLED;
                ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", 0).edit().putBoolean("logsEnabled", BuildVars.LOGS_ENABLED).commit();
                BulletinFactory.of(LoginActivity.this).createSimpleBulletin(R.raw.chats_infotip, BuildVars.LOGS_ENABLED ? "Logs enabled." : "Logs disabled.").show();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("app start time = " + ApplicationLoader.startTime);
                    try {
                        FileLog.d("buildVersion = " + ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0).versionCode);
                        return;
                    } catch (Exception e) {
                        FileLog.e(e);
                        return;
                    }
                }
                return;
            }
            ProfileActivity.sendLogs(LoginActivity.this.getParentActivity(), false);
        }

        public PhoneView(final Context context) {
            int i;
            super(context);
            this.countryState = 0;
            this.countriesArray = new ArrayList();
            this.codesMap = new HashMap();
            this.phoneFormatMap = new HashMap();
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
            this.titleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.PhoneView.$r8$lambda$we9E3ag9GKHkPK9vDsYPMD_IVEY(this.f$0, context, view);
                }
            });
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setText(LocaleController.getString(LoginActivity.this.activityMode == 2 ? R.string.ChangePhoneHelp : R.string.StartText));
            this.subtitleView.setTextSize(1, 14.0f);
            this.subtitleView.setGravity(17);
            this.subtitleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.subtitleView, LayoutHelper.createLinear(-1, -2, 1, 32, 8, 32, 0));
            TextViewSwitcher textViewSwitcher = new TextViewSwitcher(context);
            this.countryButton = textViewSwitcher;
            textViewSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
                @Override
                public final View makeView() {
                    return LoginActivity.PhoneView.$r8$lambda$H3QknSvHpPSXjvO9NWPeRB8o_IM(context);
                }
            });
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
            this.countryOutlineView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    this.f$0.countryOutlineView.animateSelection(z ? 1.0f : 0.0f);
                }
            });
            addView(this.countryOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 14.0f));
            this.countryOutlineView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.PhoneView.$r8$lambda$1a2SeS5o2eqzbnbYnMwL8j0LBWE(this.f$0, view);
                }
            });
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            OutlineTextContainerView outlineTextContainerView2 = new OutlineTextContainerView(context);
            this.phoneOutlineView = outlineTextContainerView2;
            outlineTextContainerView2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f, 16, 16.0f, 8.0f, 16.0f, 8.0f));
            OutlineTextContainerView outlineTextContainerView3 = this.phoneOutlineView;
            int i3 = R.string.PhoneNumber;
            outlineTextContainerView3.setText(LocaleController.getString(i3));
            addView(this.phoneOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 8.0f, 16.0f, 8.0f));
            TextView textView2 = new TextView(context);
            this.plusTextView = textView2;
            textView2.setText("+");
            this.plusTextView.setTextSize(1, 16.0f);
            this.plusTextView.setFocusable(false);
            linearLayout2.addView(this.plusTextView, LayoutHelper.createLinear(-2, -2));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = new AnimatedPhoneNumberEditText(context) {
                @Override
                protected void onFocusChanged(boolean z, int i4, Rect rect) {
                    super.onFocusChanged(z, i4, rect);
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
                public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

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
                    String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(PhoneView.this.codeField.getText().toString());
                    PhoneView.this.codeField.setText(strStripExceptNumbers);
                    if (strStripExceptNumbers.length() == 0) {
                        PhoneView.this.setCountryButtonText(null);
                        PhoneView.this.phoneField.setHintText((String) null);
                        PhoneView.this.countryState = 1;
                    } else {
                        int i4 = 4;
                        if (strStripExceptNumbers.length() > 4) {
                            while (true) {
                                if (i4 < 1) {
                                    str = null;
                                    z = false;
                                    break;
                                }
                                String strSubstring = strStripExceptNumbers.substring(0, i4);
                                List list = (List) PhoneView.this.codesMap.get(strSubstring);
                                if (list == null) {
                                    country2 = null;
                                } else if (list.size() > 1) {
                                    String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                    country2 = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                    if (string != null) {
                                        ArrayList arrayList = PhoneView.this.countriesArray;
                                        int size = arrayList.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            Object obj = arrayList.get(i5);
                                            i5++;
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
                                    String str2 = strStripExceptNumbers.substring(i4) + PhoneView.this.phoneField.getText().toString();
                                    PhoneView.this.codeField.setText(strSubstring);
                                    str = str2;
                                    strStripExceptNumbers = strSubstring;
                                    z = true;
                                    break;
                                }
                                i4--;
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
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < size2) {
                            Object obj2 = arrayList2.get(i6);
                            i6++;
                            CountrySelectActivity.Country country5 = (CountrySelectActivity.Country) obj2;
                            if (country5.code.startsWith(strStripExceptNumbers)) {
                                int i8 = i7 + 1;
                                if (country5.code.equals(strStripExceptNumbers)) {
                                    if (country4 == null || !country4.code.equals(country5.code)) {
                                        i7 = i8;
                                    }
                                    country4 = country5;
                                } else {
                                    i7 = i8;
                                }
                            }
                        }
                        if (i7 == 1 && country4 != null && str == null) {
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
                            country = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                            if (string2 != null) {
                                ArrayList arrayList3 = PhoneView.this.countriesArray;
                                int size3 = arrayList3.size();
                                int i9 = 0;
                                while (i9 < size3) {
                                    Object obj3 = arrayList3.get(i9);
                                    i9++;
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
            });
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    return LoginActivity.PhoneView.$r8$lambda$a2Ar91Zm1mD8yVWIynV71Tl58Vk(this.f$0, textView3, i4, keyEvent);
                }
            });
            this.codeDividerView = new View(context);
            LinearLayout.LayoutParams layoutParamsCreateLinear = LayoutHelper.createLinear(0, -1, 4.0f, 8.0f, 12.0f, 8.0f);
            layoutParamsCreateLinear.width = Math.max(2, AndroidUtilities.dp(0.5f));
            linearLayout2.addView(this.codeDividerView, layoutParamsCreateLinear);
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = new AnimatedPhoneNumberEditText(context) {
                @Override
                public boolean onKeyDown(int i4, KeyEvent keyEvent) {
                    if (i4 == 67 && PhoneView.this.phoneField.length() == 0) {
                        PhoneView.this.codeField.requestFocus();
                        PhoneView.this.codeField.setSelection(PhoneView.this.codeField.length());
                        PhoneView.this.codeField.dispatchKeyEvent(keyEvent);
                    }
                    return super.onKeyDown(i4, keyEvent);
                }

                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0 && !LoginActivity.this.showKeyboard(this)) {
                        clearFocus();
                        requestFocus();
                    }
                    return super.onTouchEvent(motionEvent);
                }

                @Override
                protected void onFocusChanged(boolean z, int i4, Rect rect) {
                    super.onFocusChanged(z, i4, rect);
                    PhoneView.this.phoneOutlineView.animateSelection((z || PhoneView.this.codeField.isFocused()) ? 1.0f : 0.0f);
                    if (z) {
                        LoginActivity.this.keyboardView.setEditText(this);
                        LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
                        if (PhoneView.this.countryState == 2) {
                            PhoneView.this.setCountryButtonText(LocaleController.getString(R.string.WrongCountry));
                            return;
                        }
                        return;
                    }
                    if (PhoneView.this.countryState == 2) {
                        PhoneView.this.setCountryButtonText(null);
                    }
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
            this.phoneField.setContentDescription(LocaleController.getString(i3));
            linearLayout2.addView(this.phoneField, LayoutHelper.createFrame(-1, 36.0f));
            this.phoneField.addTextChangedListener(new TextWatcher() {
                private int actionPosition;
                private int characterAction = -1;

                @Override
                public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
                    if (i5 == 0 && i6 == 1) {
                        this.characterAction = 1;
                        return;
                    }
                    if (i5 == 1 && i6 == 0) {
                        if (charSequence.charAt(i4) == ' ' && i4 > 0) {
                            this.characterAction = 3;
                            this.actionPosition = i4 - 1;
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
                    int i4;
                    int i5;
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
                    int i6 = 0;
                    while (i6 < string.length()) {
                        int i7 = i6 + 1;
                        String strSubstring = string.substring(i6, i7);
                        if ("0123456789".contains(strSubstring)) {
                            sb.append(strSubstring);
                        }
                        i6 = i7;
                    }
                    PhoneView.this.ignoreOnPhoneChange = true;
                    String hintText = PhoneView.this.phoneField.getHintText();
                    if (hintText != null) {
                        int i8 = 0;
                        while (i8 < sb.length()) {
                            if (i8 < hintText.length()) {
                                if (hintText.charAt(i8) == ' ') {
                                    sb.insert(i8, ' ');
                                    i8++;
                                    if (selectionStart == i8 && (i5 = this.characterAction) != 2 && i5 != 3) {
                                        selectionStart++;
                                    }
                                }
                                i8++;
                            } else {
                                sb.insert(i8, ' ');
                                if (selectionStart == i8 + 1 && (i4 = this.characterAction) != 2 && i4 != 3) {
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
                    editable.replace(0, editable.length(), sb);
                    if (selectionStart >= 0) {
                        PhoneView.this.phoneField.setSelection(Math.min(selectionStart, PhoneView.this.phoneField.length()));
                    }
                    PhoneView.this.phoneField.onTextChange();
                    PhoneView.this.invalidateCountryHint();
                    PhoneView.this.ignoreOnPhoneChange = false;
                }
            });
            this.phoneField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i4, KeyEvent keyEvent) {
                    return LoginActivity.PhoneView.$r8$lambda$tx72ht9k6z3zQDkSrtznR0iGxW0(this.f$0, textView3, i4, keyEvent);
                }
            });
            if (LoginActivity.this.newAccount && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell = new CheckBoxCell(context, 2);
                this.syncContactsBox = checkBoxCell;
                checkBoxCell.setText(LocaleController.getString("SyncContacts", R.string.SyncContacts), "", LoginActivity.this.syncContacts, false);
                addView(this.syncContactsBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                this.syncContactsBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.$r8$lambda$OFFLDFoWvHWTnl_xJtRux1hNYxs(this.f$0, view);
                    }
                });
                i = 48;
            } else {
                i = 72;
            }
            final boolean z = BuildVars.DEBUG_VERSION || LoginActivity.this.getConnectionsManager().isTestBackend();
            if (z && LoginActivity.this.activityMode == 0) {
                CheckBoxCell checkBoxCell2 = new CheckBoxCell(context, 2);
                this.testBackendCheckBox = checkBoxCell2;
                checkBoxCell2.setText(LocaleController.getString(R.string.DebugTestBackend), "", LoginActivity.this.testBackend = LoginActivity.this.getConnectionsManager().isTestBackend(), false);
                addView(this.testBackendCheckBox, LayoutHelper.createLinear(-2, -1, 51, 16, 0, 16 + ((LocaleController.isRTL && AndroidUtilities.isSmallScreen()) ? 56 : 0), 0));
                i -= 24;
                this.testBackendCheckBox.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.PhoneView.m3523$r8$lambda$__lZXJR2vt7Ut6WNXld0EfZw(this.f$0, z, view);
                    }
                });
            }
            if (i > 0 && !AndroidUtilities.isSmallScreen()) {
                Space space = new Space(context);
                space.setMinimumHeight(AndroidUtilities.dp(i));
                addView(space, LayoutHelper.createLinear(-2, -2));
            }
            final HashMap map = new HashMap();
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
                    List list = (List) this.codesMap.get(strArrSplit[0]);
                    if (list == null) {
                        HashMap map2 = this.codesMap;
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
            Collections.sort(this.countriesArray, Comparator$CC.comparing(new Function() {
                public Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override
                public final Object apply(Object obj) {
                    return ((CountrySelectActivity.Country) obj).name;
                }

                public Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }));
            try {
            } catch (Exception e2) {
                FileLog.e(e2);
            }
            LoginActivity.this.getAccountInstance().getConnectionsManager().sendRequest(new TLRPC.TL_help_getNearestDc(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.m3520$r8$lambda$SqBjgeMo9rwxi03jS4mIhx0cDk(this.f$0, map, tLObject, tL_error);
                }
            }, 10);
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

        public static void $r8$lambda$we9E3ag9GKHkPK9vDsYPMD_IVEY(PhoneView phoneView, Context context, View view) {
            Toast toast = phoneView.lastTitleToast;
            if (toast != null) {
                toast.cancel();
                phoneView.lastTitleToast = null;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (phoneView.titleClickCount > 0 && jCurrentTimeMillis - phoneView.lastTitleClick > 1500) {
                phoneView.titleClickCount = 0;
            }
            int i = phoneView.titleClickCount + 1;
            phoneView.titleClickCount = i;
            phoneView.lastTitleClick = jCurrentTimeMillis;
            if (i >= 5) {
                phoneView.titleClickCount = 0;
                phoneView.lastTitleClick = 0L;
                phoneView.showDebugMenu();
            } else if (i > 1) {
                Toast toastMakeText = Toast.makeText(context, LocaleController.formatPluralString("DebugMenuLoginToast", 5 - i, new Object[0]), 0);
                phoneView.lastTitleToast = toastMakeText;
                toastMakeText.show();
            }
        }

        public static View $r8$lambda$H3QknSvHpPSXjvO9NWPeRB8o_IM(Context context) {
            TextView textView = new TextView(context);
            textView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
            textView.setTextSize(1, 16.0f);
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            textView.setMaxLines(1);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setGravity((LocaleController.isRTL ? 5 : 3) | 1);
            return textView;
        }

        public static void $r8$lambda$1a2SeS5o2eqzbnbYnMwL8j0LBWE(final PhoneView phoneView, View view) {
            CountrySelectActivity countrySelectActivity = new CountrySelectActivity(true, phoneView.countriesArray);
            countrySelectActivity.setCountrySelectActivityDelegate(new CountrySelectActivity.CountrySelectActivityDelegate() {
                @Override
                public final void didSelectCountry(CountrySelectActivity.Country country) {
                    LoginActivity.PhoneView.m3529$r8$lambda$z9qlHmpqfIylKA8yZiPeqU7TuE(this.f$0, country);
                }
            });
            LoginActivity.this.presentFragment(countrySelectActivity);
        }

        public static void m3529$r8$lambda$z9qlHmpqfIylKA8yZiPeqU7TuE(final PhoneView phoneView, CountrySelectActivity.Country country) {
            phoneView.selectCountry(country);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView phoneView2 = this.f$0;
                    LoginActivity.this.showKeyboard(phoneView2.phoneField);
                }
            }, 300L);
            phoneView.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
        }

        public static boolean $r8$lambda$a2Ar91Zm1mD8yVWIynV71Tl58Vk(PhoneView phoneView, TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                phoneView.getClass();
                return false;
            }
            phoneView.phoneField.requestFocus();
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
            animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
            return true;
        }

        public static boolean $r8$lambda$tx72ht9k6z3zQDkSrtznR0iGxW0(PhoneView phoneView, TextView textView, int i, KeyEvent keyEvent) {
            if (i != 5) {
                phoneView.getClass();
                return false;
            }
            if (LoginActivity.this.phoneNumberConfirmView != null) {
                LoginActivity.this.phoneNumberConfirmView.fabButton.callOnClick();
                return true;
            }
            phoneView.onNextPressed(null);
            return true;
        }

        public static void $r8$lambda$OFFLDFoWvHWTnl_xJtRux1hNYxs(PhoneView phoneView, View view) {
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

        public static void m3523$r8$lambda$__lZXJR2vt7Ut6WNXld0EfZw(PhoneView phoneView, boolean z, View view) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.testBackend = !loginActivity.testBackend;
            ((CheckBoxCell) view).setChecked(LoginActivity.this.testBackend, true);
            if ((z && LoginActivity.this.getConnectionsManager().isTestBackend()) != LoginActivity.this.testBackend) {
                LoginActivity.this.getConnectionsManager().switchBackend(false);
            }
            phoneView.loadCountries();
        }

        public static void m3520$r8$lambda$SqBjgeMo9rwxi03jS4mIhx0cDk(final PhoneView phoneView, final HashMap map, final TLObject tLObject, TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.m3519$r8$lambda$Md1RDA8A7KItwr1UNSDl31JbMk(this.f$0, tLObject, map);
                }
            });
        }

        public static void m3519$r8$lambda$Md1RDA8A7KItwr1UNSDl31JbMk(PhoneView phoneView, TLObject tLObject, HashMap map) {
            phoneView.getClass();
            if (tLObject == null) {
                return;
            }
            TLRPC.TL_nearestDc tL_nearestDc = (TLRPC.TL_nearestDc) tLObject;
            if (phoneView.codeField.length() == 0) {
                phoneView.setCountry(map, tL_nearestDc.country.toUpperCase());
            }
        }

        private void loadCountries() {
            TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
            tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
            LoginActivity.this.getConnectionsManager().sendRequest(tL_help_getCountriesList, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.m3524$r8$lambda$k0240A9om3DIbVXK_fxAtnZKhE(this.f$0, tLObject, tL_error);
                }
            }, 10);
        }

        public static void m3524$r8$lambda$k0240A9om3DIbVXK_fxAtnZKhE(final PhoneView phoneView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.m3521$r8$lambda$XH3kLHOe4VpkBoi9YnwkLTG7uE(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void m3521$r8$lambda$XH3kLHOe4VpkBoi9YnwkLTG7uE(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject) {
            if (tL_error != null) {
                phoneView.getClass();
                return;
            }
            phoneView.countriesArray.clear();
            phoneView.codesMap.clear();
            phoneView.phoneFormatMap.clear();
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
                        phoneView.countriesArray.add(country);
                        List list = (List) phoneView.codesMap.get(tL_help_countryCode.country_code);
                        if (list == null) {
                            HashMap map = phoneView.codesMap;
                            String str3 = tL_help_countryCode.country_code;
                            ArrayList arrayList = new ArrayList();
                            map.put(str3, arrayList);
                            list = arrayList;
                        }
                        list.add(country);
                        if (tL_help_countryCode.patterns.size() > 0) {
                            phoneView.phoneFormatMap.put(tL_help_countryCode.country_code, tL_help_countryCode.patterns);
                        }
                    }
                }
            }
            if (LoginActivity.this.activityMode == 2) {
                String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).getClientPhone());
                if (TextUtils.isEmpty(strStripExceptNumbers)) {
                    return;
                }
                if (strStripExceptNumbers.length() > 4) {
                    for (int i3 = 4; i3 >= 1; i3--) {
                        String strSubstring = strStripExceptNumbers.substring(0, i3);
                        List list2 = (List) phoneView.codesMap.get(strSubstring);
                        CountrySelectActivity.Country country2 = null;
                        if (list2 != null) {
                            if (list2.size() > 1) {
                                String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring, null);
                                if (string != null) {
                                    CountrySelectActivity.Country country3 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                                    ArrayList arrayList2 = phoneView.countriesArray;
                                    int size = arrayList2.size();
                                    int i4 = 0;
                                    while (true) {
                                        if (i4 >= size) {
                                            country2 = country3;
                                            break;
                                        }
                                        Object obj = arrayList2.get(i4);
                                        i4++;
                                        CountrySelectActivity.Country country4 = (CountrySelectActivity.Country) obj;
                                        if (Objects.equals(country4.shortname, string)) {
                                            country2 = country4;
                                            break;
                                        }
                                    }
                                } else {
                                    country2 = (CountrySelectActivity.Country) list2.get(list2.size() - 1);
                                }
                            } else {
                                country2 = (CountrySelectActivity.Country) list2.get(0);
                            }
                        }
                        if (country2 != null) {
                            phoneView.codeField.setText(strSubstring);
                            return;
                        }
                    }
                    phoneView.codeField.setText(strStripExceptNumbers.substring(0, 1));
                }
            }
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
            for (int i = 0; i < this.countryButton.getChildCount(); i++) {
                TextView textView = (TextView) this.countryButton.getChildAt(i);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                textView.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            }
            ImageView imageView = this.chevronRight;
            int i2 = Theme.key_windowBackgroundWhiteHintText;
            imageView.setColorFilter(Theme.getColor(i2));
            this.chevronRight.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1));
            TextView textView2 = this.plusTextView;
            int i3 = Theme.key_windowBackgroundWhiteBlackText;
            textView2.setTextColor(Theme.getColor(i3));
            this.codeField.setTextColor(Theme.getColor(i3));
            AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.codeField;
            int i4 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            animatedPhoneNumberEditText.setCursorColor(Theme.getColor(i4));
            this.codeDividerView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputField));
            this.phoneField.setTextColor(Theme.getColor(i3));
            this.phoneField.setHintTextColor(Theme.getColor(i2));
            this.phoneField.setCursorColor(Theme.getColor(i4));
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setSquareCheckBoxColor(Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck);
                this.syncContactsBox.updateTextColor();
            }
            CheckBoxCell checkBoxCell2 = this.testBackendCheckBox;
            if (checkBoxCell2 != null) {
                checkBoxCell2.setSquareCheckBoxColor(Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck);
                this.testBackendCheckBox.updateTextColor();
            }
            this.phoneOutlineView.updateColor();
            this.countryOutlineView.updateColor();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
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

        public void invalidateCountryHint() {
            int i;
            String str = this.countryCodeForHint;
            String strReplace = this.phoneField.getText() != null ? this.phoneField.getText().toString().replace(" ", "") : "";
            if (this.phoneFormatMap.get(str) != null && !((List) this.phoneFormatMap.get(str)).isEmpty()) {
                List list = (List) this.phoneFormatMap.get(str);
                if (strReplace.isEmpty()) {
                    i = -1;
                    break;
                }
                i = 0;
                while (true) {
                    if (i >= list.size()) {
                        i = -1;
                        break;
                    } else if (strReplace.startsWith(((String) list.get(i)).replace(" ", "").replace("X", "").replace("0", ""))) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i == -1) {
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        String str2 = (String) list.get(i2);
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
                    String str3 = (String) ((List) this.phoneFormatMap.get(str)).get(i);
                    int selectionStart = this.phoneField.getSelectionStart();
                    int selectionEnd = this.phoneField.getSelectionEnd();
                    this.phoneField.setHintText(str3 != null ? str3.replace('X', '0') : null);
                    AnimatedPhoneNumberEditText animatedPhoneNumberEditText = this.phoneField;
                    animatedPhoneNumberEditText.setSelection(Math.max(0, Math.min(animatedPhoneNumberEditText.length(), selectionStart)), Math.max(0, Math.min(this.phoneField.length(), selectionEnd)));
                    this.wasCountryHintIndex = i;
                    return;
                }
                return;
            }
            if (this.wasCountryHintIndex != -1) {
                int selectionStart2 = this.phoneField.getSelectionStart();
                int selectionEnd2 = this.phoneField.getSelectionEnd();
                this.phoneField.setHintText((String) null);
                this.phoneField.setSelection(selectionStart2, selectionEnd2);
                this.wasCountryHintIndex = -1;
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

        private void setCountry(HashMap map, String str) {
            CountrySelectActivity.Country country;
            if (((String) map.get(str)) == null || this.countriesArray == null) {
                return;
            }
            int i = 0;
            while (true) {
                if (i >= this.countriesArray.size()) {
                    country = null;
                    break;
                } else {
                    if (this.countriesArray.get(i) != null && ((CountrySelectActivity.Country) this.countriesArray.get(i)).name.equals(str)) {
                        country = (CountrySelectActivity.Country) this.countriesArray.get(i);
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

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            if (this.ignoreSelection) {
                this.ignoreSelection = false;
                return;
            }
            this.ignoreOnTextChange = true;
            this.codeField.setText(((CountrySelectActivity.Country) this.countriesArray.get(i)).code);
            this.ignoreOnTextChange = false;
        }

        @Override
        public void onNextPressed(final String str) {
            int i;
            boolean z;
            boolean z2;
            boolean z3;
            TLObject tLObject;
            int i2;
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
                    LoginActivity.this.keyboardHideCallback = new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.PhoneView.$r8$lambda$brZe1jOme6wExW45FVWT8XBeehk(this.f$0, str);
                        }
                    };
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
            int i3 = Build.VERSION.SDK_INT;
            if (i3 < 23 || !zIsSimAvailable) {
                i = 1;
                z = true;
                z2 = true;
                z3 = true;
            } else {
                z = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0;
                z2 = LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.CALL_PHONE") == 0;
                z3 = i3 < 28 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_CALL_LOG") == 0;
                boolean z4 = i3 < 26 || LoginActivity.this.getParentActivity().checkSelfPermission("android.permission.READ_PHONE_NUMBERS") == 0;
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
                    if (!z4 && i3 >= 26) {
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
                        AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                        builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                        if (!z && (!z2 || !z3)) {
                            builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                            i2 = R.raw.calls_log;
                        } else if (!z2 || !z3) {
                            builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                            i2 = R.raw.calls_log;
                        } else {
                            builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                            i2 = R.raw.incoming_calls;
                        }
                        builder.setTopAnimation(i2, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
                        LoginActivity loginActivity3 = LoginActivity.this;
                        loginActivity3.permissionsDialog = loginActivity3.showDialog(builder.create());
                        this.confirmedNumber = true;
                        return;
                    }
                }
                i = 1;
            }
            int i4 = this.countryState;
            if (i4 == i) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ChooseCountry", R.string.ChooseCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            if (i4 == 2 && !BuildVars.DEBUG_VERSION) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.WrongCountry));
                LoginActivity.this.needHideProgress(false);
                return;
            }
            final String strStripExceptNumbers = PhoneFormat.stripExceptNumbers("" + ((Object) this.codeField.getText()) + ((Object) this.phoneField.getText()));
            if (LoginActivity.this.activityMode == 0 && (LoginActivity.this.getParentActivity() instanceof LaunchActivity)) {
                for (final int i5 = 0; i5 < 4; i5++) {
                    UserConfig userConfig = UserConfig.getInstance(i5);
                    if (userConfig.isClientActivated() && PhoneNumberUtils.compare(strStripExceptNumbers, userConfig.getCurrentUser().phone) && ConnectionsManager.getInstance(i5).isTestBackend() == LoginActivity.this.testBackend) {
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                        builder2.setTitle(LocaleController.getString(R.string.AppName));
                        builder2.setMessage(LocaleController.getString("AccountAlreadyLoggedIn", R.string.AccountAlreadyLoggedIn));
                        builder2.setPositiveButton(LocaleController.getString("AccountSwitch", R.string.AccountSwitch), new AlertDialog.OnButtonClickListener() {
                            @Override
                            public final void onClick(AlertDialog alertDialog, int i6) {
                                LoginActivity.PhoneView.$r8$lambda$T6CYZLnp89wu4uS8rodpL4CE8ZE(this.f$0, i5, alertDialog, i6);
                            }
                        });
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
                for (int i6 = 0; i6 < savedLogInTokens.size(); i6++) {
                    if (savedLogInTokens.get(i6).future_auth_token != null) {
                        if (tL_codeSettings.logout_tokens == null) {
                            tL_codeSettings.logout_tokens = new ArrayList<>();
                        }
                        if (BuildVars.DEBUG_VERSION) {
                            FileLog.d("login token to check " + new String(savedLogInTokens.get(i6).future_auth_token, StandardCharsets.UTF_8));
                        }
                        tL_codeSettings.logout_tokens.add(savedLogInTokens.get(i6).future_auth_token);
                        if (tL_codeSettings.logout_tokens.size() >= 20) {
                            break;
                        }
                    }
                }
            }
            ArrayList<TLRPC.TL_auth_loggedOut> savedLogOutTokens = AuthTokensHelper.getSavedLogOutTokens();
            if (savedLogOutTokens != null) {
                for (int i7 = 0; i7 < savedLogOutTokens.size(); i7++) {
                    if (tL_codeSettings.logout_tokens == null) {
                        tL_codeSettings.logout_tokens = new ArrayList<>();
                    }
                    tL_codeSettings.logout_tokens.add(savedLogOutTokens.get(i7).future_auth_token);
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
                    if (!userPhoneNumbers.isEmpty()) {
                        tL_codeSettings.unknown_number = false;
                        tL_codeSettings.current_number = Collection.EL.stream(userPhoneNumbers).anyMatch(new Predicate() {
                            public Predicate and(Predicate predicate) {
                                return Predicate$CC.$default$and(this, predicate);
                            }

                            public Predicate negate() {
                                return Predicate$CC.$default$negate(this);
                            }

                            public Predicate or(Predicate predicate) {
                                return Predicate$CC.$default$or(this, predicate);
                            }

                            @Override
                            public final boolean test(Object obj) {
                                return PhoneNumberUtils.compare(strStripExceptNumbers, (String) obj);
                            }
                        });
                    } else {
                        tL_codeSettings.unknown_number = true;
                        if (UserConfig.getActivatedAccountsCount() > 0) {
                            tL_codeSettings.allow_flashcall = false;
                        } else {
                            tL_codeSettings.current_number = false;
                        }
                    }
                } catch (Exception e2) {
                    tL_codeSettings.unknown_number = true;
                    FileLog.e(e2);
                }
            }
            if (LoginActivity.this.activityMode != 2) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).cleanup(false);
                TLRPC.TL_auth_sendCode tL_auth_sendCode = new TLRPC.TL_auth_sendCode();
                tL_auth_sendCode.api_hash = BuildVars.APP_HASH;
                tL_auth_sendCode.api_id = BuildVars.APP_ID;
                tL_auth_sendCode.phone_number = strStripExceptNumbers;
                tL_auth_sendCode.settings = tL_codeSettings;
                tLObject = tL_auth_sendCode;
            } else {
                TL_account.sendChangePhoneCode sendchangephonecode = new TL_account.sendChangePhoneCode();
                sendchangephonecode.phone_number = strStripExceptNumbers;
                sendchangephonecode.settings = tL_codeSettings;
                tLObject = sendchangephonecode;
            }
            final TLObject tLObject2 = tLObject;
            final Bundle bundle = new Bundle();
            bundle.putString("phone", "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText()));
            try {
                bundle.putString("ephone", "+" + PhoneFormat.stripExceptNumbers(this.codeField.getText().toString()) + " " + PhoneFormat.stripExceptNumbers(this.phoneField.getText().toString()));
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
            final PhoneInputData phoneInputData = new PhoneInputData();
            phoneInputData.phoneNumber = "+" + ((Object) this.codeField.getText()) + " " + ((Object) this.phoneField.getText());
            phoneInputData.country = this.currentCountry;
            phoneInputData.patterns = (List) this.phoneFormatMap.get(this.codeField.getText().toString());
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tLObject2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                    LoginActivity.PhoneView.$r8$lambda$fXLD1vIsjyo85f2a8BM8C6ujJfs(this.f$0, bundle, strStripExceptNumbers, phoneInputData, tLObject2, tLObject3, tL_error);
                }
            }, 27));
        }

        public static void $r8$lambda$brZe1jOme6wExW45FVWT8XBeehk(final PhoneView phoneView, final String str) {
            phoneView.getClass();
            phoneView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onNextPressed(str);
                }
            }, 200L);
        }

        class AnonymousClass6 implements PhoneNumberConfirmView.IConfirmDialogCallback {
            final String val$code;

            AnonymousClass6(String str) {
                this.val$code = str;
            }

            @Override
            public void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView) {
                onConfirm(phoneNumberConfirmView);
            }

            @Override
            public void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                phoneNumberConfirmView.dismiss();
            }

            @Override
            public void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView) {
                onConfirm(phoneNumberConfirmView);
            }

            @Override
            public void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView) {
                LoginActivity.this.phoneNumberConfirmView = null;
            }

            private void onConfirm(final PhoneNumberConfirmView phoneNumberConfirmView) {
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
                            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                            if (!z && (!z2 || !z3)) {
                                builder.setMessage(LocaleController.getString("AllowReadCallAndLog", R.string.AllowReadCallAndLog));
                                i = R.raw.calls_log;
                            } else if (!z2 || !z3) {
                                builder.setMessage(LocaleController.getString("AllowReadCallLog", R.string.AllowReadCallLog));
                                i = R.raw.calls_log;
                            } else {
                                builder.setMessage(LocaleController.getString("AllowReadCall", R.string.AllowReadCall));
                                i = R.raw.incoming_calls;
                            }
                            builder.setTopAnimation(i, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
                            LoginActivity loginActivity = LoginActivity.this;
                            loginActivity.permissionsDialog = loginActivity.showDialog(builder.create());
                            PhoneView.this.confirmedNumber = true;
                            return;
                        }
                    }
                }
                final String str = this.val$code;
                phoneNumberConfirmView.animateProgress(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.PhoneView.AnonymousClass6.m3530$r8$lambda$uKaYNa8eigZAzDp_TfREBFnipg(this.f$0, phoneNumberConfirmView, str);
                    }
                });
            }

            public static void m3530$r8$lambda$uKaYNa8eigZAzDp_TfREBFnipg(final AnonymousClass6 anonymousClass6, final PhoneNumberConfirmView phoneNumberConfirmView, final String str) {
                anonymousClass6.getClass();
                phoneNumberConfirmView.dismiss();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.PhoneView.AnonymousClass6.$r8$lambda$12dPGGDo54zrrbPFJnXrkz5HUPQ(this.f$0, str, phoneNumberConfirmView);
                    }
                }, 150L);
            }

            public static void $r8$lambda$12dPGGDo54zrrbPFJnXrkz5HUPQ(AnonymousClass6 anonymousClass6, String str, PhoneNumberConfirmView phoneNumberConfirmView) {
                PhoneView.this.onNextPressed(str);
                LoginActivity.this.floatingButton.progressView.sync(phoneNumberConfirmView.fabButton.progressView);
            }
        }

        public static void $r8$lambda$T6CYZLnp89wu4uS8rodpL4CE8ZE(PhoneView phoneView, int i, AlertDialog alertDialog, int i2) {
            phoneView.getClass();
            if (UserConfig.selectedAccount != i) {
                ((LaunchActivity) LoginActivity.this.getParentActivity()).switchToAccount(i, true);
            }
            LoginActivity.this.finishFragment();
        }

        public static void $r8$lambda$fXLD1vIsjyo85f2a8BM8C6ujJfs(final PhoneView phoneView, final Bundle bundle, final String str, final PhoneInputData phoneInputData, final TLObject tLObject, final TLObject tLObject2, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.m3527$r8$lambda$rPHRyRT_n4mTPOLSE6PcF7RSFA(this.f$0, tL_error, tLObject2, bundle, str, phoneInputData, tLObject);
                }
            });
        }

        public static void m3527$r8$lambda$rPHRyRT_n4mTPOLSE6PcF7RSFA(final PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject, Bundle bundle, final String str, PhoneInputData phoneInputData, TLObject tLObject2) {
            phoneView.nextPressed = false;
            if (tL_error == null) {
                if (!(tLObject instanceof TLRPC.TL_auth_sentCodeSuccess)) {
                    LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.auth_SentCode) tLObject);
                } else {
                    TLRPC.auth_Authorization auth_authorization = ((TLRPC.TL_auth_sentCodeSuccess) tLObject).authorization;
                    if (!(auth_authorization instanceof TLRPC.TL_auth_authorizationSignUpRequired)) {
                        LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) auth_authorization);
                    } else {
                        TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) auth_authorization).terms_of_service;
                        if (tL_help_termsOfService != null) {
                            LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                        }
                        LoginActivity.this.setPage(5, true, bundle, false);
                    }
                }
            } else {
                String str2 = tL_error.text;
                if (str2 != null) {
                    if (str2.contains("SESSION_PASSWORD_NEEDED")) {
                        ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                LoginActivity.PhoneView.m3517$r8$lambda$I_QXQJu7gJAQrrBfl8XRsugsM(this.f$0, str, tLObject3, tL_error2);
                            }
                        }, 10);
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
                        phoneView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tLObject2, phoneInputData.phoneNumber);
                    }
                }
            }
            if (LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            LoginActivity.this.needHideProgress(false);
        }

        public static void m3517$r8$lambda$I_QXQJu7gJAQrrBfl8XRsugsM(final PhoneView phoneView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$JCmxSg72RYUWId2ahURfmueLQLM(this.f$0, tL_error, tLObject, str);
                }
            });
        }

        public static void $r8$lambda$JCmxSg72RYUWId2ahURfmueLQLM(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            phoneView.nextPressed = false;
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
                            final ArrayList arrayList = new ArrayList(LoginActivity.this.permissionsShowItems);
                            Runnable runnable = new Runnable() {
                                @Override
                                public final void run() {
                                    LoginActivity.PhoneView.$r8$lambda$uXEmcVKGsdlN3ltlc_gXBB8gZWg(this.f$0, arrayList);
                                }
                            };
                            if (LoginActivity.this.isAnimatingIntro) {
                                LoginActivity.this.animationFinishCallback = runnable;
                                return;
                            } else {
                                runnable.run();
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
                        String strStripExceptNumbers = PhoneFormat.stripExceptNumbers(telephonyManager.getLine1Number());
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
                                    List list = (List) this.codesMap.get(strSubstring2);
                                    if (list == null) {
                                        country = null;
                                    } else if (list.size() > 1) {
                                        String string = MessagesController.getGlobalMainSettings().getString("phone_code_last_matched_" + strSubstring2, null);
                                        country = (CountrySelectActivity.Country) list.get(list.size() - 1);
                                        if (string != null) {
                                            ArrayList arrayList2 = this.countriesArray;
                                            int size = arrayList2.size();
                                            int i3 = 0;
                                            while (i3 < size) {
                                                Object obj = arrayList2.get(i3);
                                                i3++;
                                                CountrySelectActivity.Country country2 = (CountrySelectActivity.Country) obj;
                                                if (Objects.equals(country2.shortname, string)) {
                                                    country = country2;
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        country = (CountrySelectActivity.Country) list.get(0);
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
                        if (this.phoneField.length() > 0) {
                            AnimatorSet duration = new AnimatorSet().setDuration(300L);
                            AnimatedPhoneNumberEditText animatedPhoneNumberEditText2 = this.codeField;
                            Property property = View.ALPHA;
                            duration.playTogether(ObjectAnimator.ofFloat(animatedPhoneNumberEditText2, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.phoneField, (Property<AnimatedPhoneNumberEditText, Float>) property, 1.0f));
                            duration.start();
                            this.confirmedNumber = true;
                            return;
                        }
                        this.codeField.setAlpha(1.0f);
                        this.phoneField.setAlpha(1.0f);
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void $r8$lambda$uXEmcVKGsdlN3ltlc_gXBB8gZWg(PhoneView phoneView, List list) {
            phoneView.getClass();
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (globalMainSettings.getBoolean("firstloginshow", true) || LoginActivity.this.getParentActivity().shouldShowRequestPermissionRationale("android.permission.READ_PHONE_STATE")) {
                globalMainSettings.edit().putBoolean("firstloginshow", false).commit();
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                builder.setTopAnimation(R.raw.incoming_calls, 46, false, Theme.getColor(Theme.key_dialogTopBackground));
                builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
                builder.setMessage(LocaleController.getString("AllowFillNumber", R.string.AllowFillNumber));
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.permissionsShowDialog = loginActivity.showDialog(builder.create(), true, null);
                LoginActivity.this.needRequestPermissions = true;
                return;
            }
            LoginActivity.this.getParentActivity().requestPermissions((String[]) list.toArray(new String[0]), 7);
        }

        @Override
        public void onShow() {
            super.onShow();
            fillNumber();
            CheckBoxCell checkBoxCell = this.syncContactsBox;
            if (checkBoxCell != null) {
                checkBoxCell.setChecked(LoginActivity.this.syncContacts, false);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.m3526$r8$lambda$oskZSkeOzXbaTPiJnzRwTRg(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void m3526$r8$lambda$oskZSkeOzXbaTPiJnzRwTRg(PhoneView phoneView) {
            if (phoneView.phoneField != null) {
                if (LoginActivity.this.needRequestPermissions) {
                    phoneView.codeField.clearFocus();
                    phoneView.phoneField.clearFocus();
                } else if (phoneView.codeField.length() != 0) {
                    phoneView.phoneField.requestFocus();
                    if (!phoneView.numberFilled) {
                        AnimatedPhoneNumberEditText animatedPhoneNumberEditText = phoneView.phoneField;
                        animatedPhoneNumberEditText.setSelection(animatedPhoneNumberEditText.length());
                    }
                    LoginActivity.this.showKeyboard(phoneView.phoneField);
                } else {
                    phoneView.codeField.requestFocus();
                    LoginActivity.this.showKeyboard(phoneView.codeField);
                }
            }
            if (LoginActivity.this.activityMode == 0) {
                phoneView.requestPasskey(false);
            }
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

        public void requestPasskey(boolean z) {
            if (LoginActivity.this.activityMode == 0 && Build.VERSION.SDK_INT >= 28 && BuildVars.SUPPORTS_PASSKEYS && !this.requestingPasskey) {
                if (z || !this.requestedPasskey) {
                    this.requestingPasskey = true;
                    this.requestedPasskey = true;
                    this.cancelRequestingPasskey = PasskeysController.login(getContext(), ((BaseFragment) LoginActivity.this).currentAccount, z, new Utilities.Callback3() {
                        @Override
                        public final void run(Object obj, Object obj2, Object obj3) {
                            LoginActivity.PhoneView.$r8$lambda$oIkEb0rQvIZM4efXOsv9kIPHyUo(this.f$0, (Long) obj, (TLRPC.auth_Authorization) obj2, (String) obj3);
                        }
                    });
                }
            }
        }

        public static void $r8$lambda$oIkEb0rQvIZM4efXOsv9kIPHyUo(final PhoneView phoneView, Long l, TLRPC.auth_Authorization auth_authorization, String str) {
            phoneView.cancelRequestingPasskey = null;
            phoneView.requestingPasskey = false;
            if (str != null && ("EMPTY".equals(str) || "CANCELLED".equals(str))) {
                if (phoneView.subtitleView == null || !"CANCELLED".equals(str)) {
                    return;
                }
                phoneView.subtitleView.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.requestPasskey(true);
                    }
                }), true));
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
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.PhoneView.$r8$lambda$PucrEHfbDJHHVHB4Bl0OCZns1Ow(this.f$0, tLObject, tL_error);
                    }
                }, 10);
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

        public static void $r8$lambda$PucrEHfbDJHHVHB4Bl0OCZns1Ow(final PhoneView phoneView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            phoneView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.PhoneView.$r8$lambda$zqNnbg21ig_CbrJjRmRti1QNCz0(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void $r8$lambda$zqNnbg21ig_CbrJjRmRti1QNCz0(PhoneView phoneView, TLRPC.TL_error tL_error, TLObject tLObject) {
            phoneView.nextPressed = false;
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

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourPhone", R.string.YourPhone);
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
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                this.countryButton.getCurrentView().invalidate();
            }
        }
    }

    public HashSet getUserPhoneNumbers() {
        HashSet hashSet = new HashSet();
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
                        String number = LoginActivity$$ExternalSyntheticApiModelOutline4.m(completeActiveSubscriptionInfoList.get(i2)).getNumber();
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

    public class LoginActivitySmsView extends SlideView implements NotificationCenter.NotificationCenterDelegate {
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

        public static void $r8$lambda$gKyVJVXs5FXqCJwgMxzY5MPqX6U(TLObject tLObject, TLRPC.TL_error tL_error) {
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        static ProgressView access$10300(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            return null;
        }

        static int access$8626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (((double) loginActivitySmsView.time) - d);
            loginActivitySmsView.time = i;
            return i;
        }

        static int access$9626(LoginActivitySmsView loginActivitySmsView, double d) {
            int i = (int) (((double) loginActivitySmsView.codeTime) - d);
            loginActivitySmsView.codeTime = i;
            return i;
        }

        public static void $r8$lambda$OFCJ62txobci_RPmBKO18gKHdJY(LoginActivitySmsView loginActivitySmsView) {
            int i = 0;
            loginActivitySmsView.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (loginActivitySmsView.errorViewSwitcher.getCurrentView() != (loginActivitySmsView.currentType == 15 ? loginActivitySmsView.openFragmentButton : loginActivitySmsView.problemFrame)) {
                loginActivitySmsView.errorViewSwitcher.showNext();
            }
        }

        public LoginActivitySmsView(final Context context, int i) {
            ViewGroup viewGroup;
            int i2;
            super(context);
            this.timerSync = new Object();
            this.time = 60000;
            this.codeTime = 15000;
            this.lastError = "";
            this.isResendingCode = false;
            this.pattern = "*";
            this.prefix = "";
            this.errorColorTimeout = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$OFCJ62txobci_RPmBKO18gKHdJY(this.f$0);
                }
            };
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
            if (i3 == 11) {
                this.titleTextView.setText(string == null ? LocaleController.getString(R.string.MissedCallDescriptionTitle) : string);
                FrameLayout frameLayout = new FrameLayout(context);
                this.missedCallArrowIcon = new ImageView(context);
                this.missedCallPhoneIcon = new ImageView(context);
                frameLayout.addView(this.missedCallArrowIcon);
                frameLayout.addView(this.missedCallPhoneIcon);
                this.missedCallArrowIcon.setImageResource(R.drawable.login_arrow1);
                this.missedCallPhoneIcon.setImageResource(R.drawable.login_phone1);
                addView(frameLayout, LayoutHelper.createLinear(64, 64, 1, 0, 16, 0, 0));
                addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                TextView textView3 = new TextView(context);
                this.missedCallDescriptionSubtitle = textView3;
                textView3.setTextSize(1, 14.0f);
                this.missedCallDescriptionSubtitle.setGravity(1);
                this.missedCallDescriptionSubtitle.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.missedCallDescriptionSubtitle.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MissedCallDescriptionSubtitle)));
                addView(this.missedCallDescriptionSubtitle, LayoutHelper.createLinear(-1, -2, 49, 36, 16, 36, 0));
                this.codeFieldContainer = new CodeFieldContainer(context) {
                    @Override
                    protected void processNextPressed() {
                        LoginActivitySmsView.this.onNextPressed(null);
                    }
                };
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(0);
                TextView textView4 = new TextView(context);
                this.prefixTextView = textView4;
                textView4.setTextSize(1, 20.0f);
                this.prefixTextView.setMaxLines(1);
                this.prefixTextView.setTypeface(AndroidUtilities.bold());
                this.prefixTextView.setPadding(0, 0, 0, 0);
                this.prefixTextView.setGravity(16);
                linearLayout.addView(this.prefixTextView, LayoutHelper.createLinear(-2, -1, 16, 0, 0, 4, 0));
                linearLayout.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -1));
                addView(linearLayout, LayoutHelper.createLinear(-2, 34, 1, 0, 28, 0, 0));
                TextView textView5 = new TextView(context);
                this.missedCallDescriptionSubtitle2 = textView5;
                textView5.setTextSize(1, 14.0f);
                this.missedCallDescriptionSubtitle2.setGravity(1);
                this.missedCallDescriptionSubtitle2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.missedCallDescriptionSubtitle2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MissedCallDescriptionSubtitle2)));
                addView(this.missedCallDescriptionSubtitle2, LayoutHelper.createLinear(-1, -2, 49, 36, 28, 36, 12));
            } else {
                if (i3 == 3) {
                    this.confirmTextView.setGravity(1);
                    ViewGroup frameLayout2 = new FrameLayout(context);
                    addView(frameLayout2, LayoutHelper.createLinear(-1, 0, 1.0f));
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.setOrientation(1);
                    linearLayout2.setGravity(1);
                    frameLayout2.addView(linearLayout2, LayoutHelper.createFrame(-1, -2, 17));
                    ((FrameLayout.LayoutParams) linearLayout2.getLayoutParams()).bottomMargin = AndroidUtilities.isTablet() ? 0 : AndroidUtilities.statusBarHeight;
                    FrameLayout frameLayout3 = new FrameLayout(context);
                    linearLayout2.addView(frameLayout3, LayoutHelper.createFrame(-2, -2, 1));
                    this.blueImageView = new RLottieImageView(context);
                    int i4 = R.raw.phone_flash_call;
                    RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, String.valueOf(i4), AndroidUtilities.dp(64.0f), AndroidUtilities.dp(64.0f), true, null);
                    this.hintDrawable = rLottieDrawable;
                    this.blueImageView.setAnimation(rLottieDrawable);
                    frameLayout3.addView(this.blueImageView, LayoutHelper.createFrame(64, 64.0f));
                    this.titleTextView.setText(string == null ? LocaleController.getString(R.string.YourCode) : string);
                    linearLayout2.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 16, 0, 0));
                    linearLayout2.addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 0, 8, 0, 0));
                    viewGroup = frameLayout2;
                } else {
                    this.confirmTextView.setGravity(49);
                    FrameLayout frameLayout4 = new FrameLayout(context);
                    addView(frameLayout4, LayoutHelper.createLinear(-2, -2, 49, 0, 16, 0, 0));
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
                    frameLayout4.addView(this.blueImageView, LayoutHelper.createFrame(i6, i6, 51, 0.0f, 0.0f, 0.0f, (this.currentType != 1 || AndroidUtilities.isSmallScreen()) ? 0.0f : -AndroidUtilities.dp(16.0f)));
                    TextView textView6 = this.titleTextView;
                    if (string == null) {
                        string = LocaleController.getString(this.currentType == 1 ? R.string.SentAppCodeTitle : R.string.SentSmsCodeTitle);
                    }
                    textView6.setText(string);
                    addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 18, 0, 0));
                    int i12 = this.currentType == 15 ? 16 : 0;
                    addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 49, i12, 17, i12, 0));
                }
                if (this.currentType != 11) {
                    CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                        @Override
                        protected void processNextPressed() {
                            LoginActivitySmsView.this.onNextPressed(null);
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
                loadingTextView.setLinkTextColor(Theme.getColor(i13));
                this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i13));
                this.prevTypeTextView.setTextSize(1, 14.0f);
                this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                this.prevTypeTextView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.onBackPressed(true);
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
                    protected boolean isResendingCode() {
                        return LoginActivitySmsView.this.isResendingCode;
                    }

                    @Override
                    protected boolean isRippleEnabled() {
                        if (getVisibility() == 0) {
                            return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                        }
                        return false;
                    }
                };
                this.timeText = loadingTextView2;
                loadingTextView2.setLinkTextColor(Theme.getColor(i13));
                this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
                this.timeText.setTextSize(1, 15.0f);
                this.timeText.setGravity(51);
                this.timeText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(this.f$0, view);
                    }
                });
                this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
                this.errorViewSwitcher = new ViewSwitcher(context) {
                    @Override
                    protected void onMeasure(int i14, int i15) {
                        super.onMeasure(i14, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
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
                        protected boolean isResendingCode() {
                            return LoginActivitySmsView.this.isResendingCode;
                        }

                        @Override
                        protected boolean isRippleEnabled() {
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
                    LinearLayout linearLayout3 = new LinearLayout(context);
                    this.openFragmentButton = linearLayout3;
                    linearLayout3.setOrientation(0);
                    this.openFragmentButton.setGravity(17);
                    this.openFragmentButton.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
                    this.openFragmentButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_changephoneinfo_image2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
                    this.openFragmentButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$PLrx4prHddFU43NFApm9985Vpcc(this.f$0, view);
                        }
                    });
                    this.errorViewSwitcher.addView(this.openFragmentButton, LayoutHelper.createFrame(-1, 52.0f));
                    RLottieImageView rLottieImageView2 = new RLottieImageView(context);
                    this.openFragmentImageView = rLottieImageView2;
                    rLottieImageView2.setAnimation(R.raw.fragment, 36, 36);
                    this.openFragmentButton.addView(this.openFragmentImageView, LayoutHelper.createLinear(36, 36, 16, 0, 0, 2, 0));
                    TextView textView7 = new TextView(context);
                    this.openFragmentButtonText = textView7;
                    textView7.setText(LocaleController.getString(R.string.OpenFragment));
                    this.openFragmentButtonText.setTextColor(-1);
                    this.openFragmentButtonText.setTextSize(1, 15.0f);
                    this.openFragmentButtonText.setGravity(17);
                    this.openFragmentButtonText.setTypeface(AndroidUtilities.bold());
                    this.openFragmentButton.addView(this.openFragmentButtonText);
                }
                TextView textView8 = new TextView(context);
                this.wrongCode = textView8;
                textView8.setText(LocaleController.getString(R.string.WrongCode));
                this.wrongCode.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                this.wrongCode.setTextSize(1, 15.0f);
                this.wrongCode.setGravity(49);
                this.wrongCode.setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
                this.errorViewSwitcher.addView(this.wrongCode, LayoutHelper.createFrame(-2, -2, 17));
                if (viewGroup == null) {
                    FrameLayout frameLayout5 = new FrameLayout(context);
                    this.bottomContainer = frameLayout5;
                    ViewSwitcher viewSwitcher = this.errorViewSwitcher;
                    if (this.currentType == 15) {
                        i2 = -1;
                    } else {
                        i2 = -2;
                    }
                    frameLayout5.addView(viewSwitcher, LayoutHelper.createFrame(i2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                    addView(this.bottomContainer, LayoutHelper.createLinear(-1, 0, 1.0f));
                } else {
                    viewGroup.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
                if (this.currentType != 15) {
                    this.problemText.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$7ZoMlW9TVedLaXI4g3lXFPF8wag(this.f$0, context, view);
                        }
                    });
                }
            }
            viewGroup = null;
            if (this.currentType != 11) {
                CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) {
                    @Override
                    protected void processNextPressed() {
                        LoginActivitySmsView.this.onNextPressed(null);
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
            int i14 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView4.setLinkTextColor(Theme.getColor(i14));
            this.prevTypeTextView.setTextColor(LoginActivity.this.getThemedColor(i14));
            this.prevTypeTextView.setTextSize(1, 14.0f);
            this.prevTypeTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.prevTypeTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            this.prevTypeTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onBackPressed(true);
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
                protected boolean isResendingCode() {
                    return LoginActivitySmsView.this.isResendingCode;
                }

                @Override
                protected boolean isRippleEnabled() {
                    if (getVisibility() == 0) {
                        return LoginActivitySmsView.this.time <= 0 || LoginActivitySmsView.this.timeTimer == null;
                    }
                    return false;
                }
            };
            this.timeText = loadingTextView5;
            loadingTextView5.setLinkTextColor(Theme.getColor(i14));
            this.timeText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.timeText.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            this.timeText.setTextSize(1, 15.0f);
            this.timeText.setGravity(51);
            this.timeText.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(this.f$0, view);
                }
            });
            this.problemFrame.addView(this.timeText, LayoutHelper.createFrame(-2, -2, 49));
            this.errorViewSwitcher = new ViewSwitcher(context) {
                @Override
                protected void onMeasure(int i15, int i16) {
                    super.onMeasure(i15, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
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
                    protected boolean isResendingCode() {
                        return LoginActivitySmsView.this.isResendingCode;
                    }

                    @Override
                    protected boolean isRippleEnabled() {
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
                this.openFragmentButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_changephoneinfo_image2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
                this.openFragmentButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$PLrx4prHddFU43NFApm9985Vpcc(this.f$0, view);
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
            if (viewGroup == null) {
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
                viewGroup.addView(this.errorViewSwitcher, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 32.0f));
            }
            VerticalPositionAutoAnimator.attach(this.errorViewSwitcher);
            if (this.currentType != 15) {
                this.problemText.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$7ZoMlW9TVedLaXI4g3lXFPF8wag(this.f$0, context, view);
                    }
                });
            }
        }

        public static void $r8$lambda$YY_A19CbMQly1broy1Vhir2WCA4(final LoginActivitySmsView loginActivitySmsView, View view) {
            if (loginActivitySmsView.time <= 0 || loginActivitySmsView.timeTimer == null) {
                loginActivitySmsView.isResendingCode = true;
                loginActivitySmsView.timeText.invalidate();
                loginActivitySmsView.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                int i = loginActivitySmsView.nextType;
                if (i != 4 && i != 2 && i != 17 && i != 16 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        NotificationCenter.getGlobalInstance().removeObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                        loginActivitySmsView.waitingForEvent = false;
                        loginActivitySmsView.destroyCodeTimer();
                        loginActivitySmsView.isResendingCode = false;
                        loginActivitySmsView.resendCode();
                        return;
                    }
                    return;
                }
                if (i == 4 || i == 11) {
                    loginActivitySmsView.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    loginActivitySmsView.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivitySmsView.phone);
                bundle.putString("ephone", loginActivitySmsView.emailPhone);
                bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                bundle.putInt("prevType", loginActivitySmsView.currentType);
                loginActivitySmsView.createCodeTimer();
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivitySmsView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivitySmsView.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.m3493$r8$lambda$g0qMgeJ3UOfHAqn0fue6qPp8b4(this.f$0, bundle, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static void m3493$r8$lambda$g0qMgeJ3UOfHAqn0fue6qPp8b4(final LoginActivitySmsView loginActivitySmsView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            if (tLObject != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.m3498$r8$lambda$zTDVnU3r3dMzF_actJIFLwErqM(this.f$0, bundle, tLObject);
                    }
                });
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$9rRQOUgnpYpD237N91mITVLI5Vw(this.f$0, tL_error);
                    }
                });
            }
        }

        public static void m3498$r8$lambda$zTDVnU3r3dMzF_actJIFLwErqM(LoginActivitySmsView loginActivitySmsView, Bundle bundle, TLObject tLObject) {
            loginActivitySmsView.nextCodeParams = bundle;
            TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
            loginActivitySmsView.nextCodeAuth = tL_auth_sentCode;
            TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
            if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                loginActivitySmsView.nextType = 17;
            } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                loginActivitySmsView.nextType = 16;
            }
            LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
        }

        public static void $r8$lambda$9rRQOUgnpYpD237N91mITVLI5Vw(LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            loginActivitySmsView.lastError = tL_error.text;
        }

        public static void $r8$lambda$PLrx4prHddFU43NFApm9985Vpcc(LoginActivitySmsView loginActivitySmsView, View view) {
            loginActivitySmsView.getClass();
            try {
                loginActivitySmsView.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(loginActivitySmsView.url)));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }

        public static void $r8$lambda$7ZoMlW9TVedLaXI4g3lXFPF8wag(final LoginActivitySmsView loginActivitySmsView, final Context context, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            Bundle bundle = loginActivitySmsView.nextCodeParams;
            if (bundle != null && (tL_auth_sentCode = loginActivitySmsView.nextCodeAuth) != null) {
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                return;
            }
            if (loginActivitySmsView.nextPressed) {
                return;
            }
            LoadingTextView loadingTextView = loginActivitySmsView.timeText;
            if ((loadingTextView == null || loadingTextView.getVisibility() == 8) && !loginActivitySmsView.isResendingCode) {
                if (loginActivitySmsView.nextType != 0) {
                    if (LoginActivity.this.radialProgressView.getTag() != null) {
                        return;
                    }
                    loginActivitySmsView.resendCode();
                    return;
                }
                TLRPC.TL_auth_reportMissingCode tL_auth_reportMissingCode = new TLRPC.TL_auth_reportMissingCode();
                tL_auth_reportMissingCode.phone_number = loginActivitySmsView.requestPhone;
                tL_auth_reportMissingCode.phone_code_hash = loginActivitySmsView.phoneHash;
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
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.DidNotGetTheCodeInfo, loginActivitySmsView.phone))).setNeutralButton(LocaleController.getString(R.string.DidNotGetTheCodeHelpButton), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$7KaHB4zRU_Z7aRtrdv5j9LeSWvg(this.f$0, context, alertDialog, i);
                    }
                }).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.DidNotGetTheCodeEditNumberButton), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.setPage(0, true, null, true);
                    }
                }).show();
            }
        }

        public static void $r8$lambda$7KaHB4zRU_Z7aRtrdv5j9LeSWvg(LoginActivitySmsView loginActivitySmsView, Context context, AlertDialog alertDialog, int i) {
            String str;
            loginActivitySmsView.getClass();
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String str2 = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse("mailto:"));
                intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                StringBuilder sb = new StringBuilder();
                sb.append(loginActivitySmsView.emailPhone);
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
                sb2.append(loginActivitySmsView.requestPhone);
                sb2.append("\n");
                sb2.append("\n");
                try {
                    if (i2 >= 22) {
                        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(loginActivitySmsView.getContext());
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
                                SubscriptionInfo subscriptionInfoM = LoginActivity$$ExternalSyntheticApiModelOutline4.m(it.next());
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
                if (!TextUtils.isEmpty(loginActivitySmsView.lastError)) {
                    sb2.append("Error: ");
                    sb2.append(loginActivitySmsView.lastError);
                    sb2.append("\n");
                }
                sb2.append("\n\n================================================\n");
                sb2.append("WRITE YOUR COMMENT HERE:\n");
                sb2.append("\n");
                sb2.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb2.toString());
                loginActivitySmsView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
        }

        @Override
        public void updateColors() {
            this.confirmTextView.setTextColor(Theme.getColor(LoginActivity.this.isInCancelAccountDeletionMode() ? Theme.key_windowBackgroundWhiteBlackText : Theme.key_windowBackgroundWhiteGrayText6));
            this.confirmTextView.setLinkTextColor(Theme.getColor(Theme.key_chats_actionBackground));
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            if (this.currentType == 11) {
                TextView textView2 = this.missedCallDescriptionSubtitle;
                int i2 = Theme.key_windowBackgroundWhiteGrayText;
                textView2.setTextColor(Theme.getColor(i2));
                this.missedCallDescriptionSubtitle2.setTextColor(Theme.getColor(i2));
                ImageView imageView = this.missedCallArrowIcon;
                int color = Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                imageView.setColorFilter(new PorterDuffColorFilter(color, mode));
                this.missedCallPhoneIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), mode));
                this.prefixTextView.setTextColor(Theme.getColor(i));
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
            this.timeText.setTextColor(Theme.getColor(numValueOf.intValue()));
            if (this.currentType != 15) {
                this.problemText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            }
            this.wrongCode.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }

        private void applyLottieColors(RLottieDrawable rLottieDrawable) {
            if (rLottieDrawable != null) {
                rLottieDrawable.setLayerColor("Bubble", Theme.getColor(Theme.key_chats_actionBackground));
                int i = Theme.key_windowBackgroundWhiteBlackText;
                rLottieDrawable.setLayerColor("Phone", Theme.getColor(i));
                rLottieDrawable.setLayerColor("Note", Theme.getColor(i));
            }
        }

        @Override
        public boolean hasCustomKeyboard() {
            return this.currentType != 3;
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.problemText.invalidate();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putInt("prevType", this.currentType);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$9s858Dym6RQwsnm1hQnxlFQJ4gk(this.f$0, bundle, tLObject, tL_error);
                }
            }, 10));
        }

        public static void $r8$lambda$9s858Dym6RQwsnm1hQnxlFQJ4gk(final LoginActivitySmsView loginActivitySmsView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$MhPtbTePJVhI5lIZG3o0b7qJuyQ(this.f$0, tL_error, bundle, tLObject);
                }
            });
        }

        public static void $r8$lambda$MhPtbTePJVhI5lIZG3o0b7qJuyQ(LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                loginActivitySmsView.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                loginActivitySmsView.nextCodeAuth = tL_auth_sentCode;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsPhrase) {
                    loginActivitySmsView.nextType = 17;
                } else if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeSmsWord) {
                    loginActivitySmsView.nextType = 16;
                }
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        loginActivitySmsView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                }
            }
            loginActivitySmsView.tryHideProgress(false);
        }

        @Override
        protected void onConfigurationChanged(Configuration configuration) {
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

        private void tryShowProgress(int i) {
            tryShowProgress(i, true);
        }

        public void tryShowProgress(final int i, final boolean z) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needShowProgress(i, z);
                return;
            }
            if (this.isDotsAnimationVisible) {
                return;
            }
            this.isDotsAnimationVisible = true;
            if (this.hintDrawable.getCurrentFrame() != this.hintDrawable.getFramesCount() - 1) {
                this.hintDrawable.setOnAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$QvFcGAtw6xZjEc5v8hp9GJP5URI(this.f$0, i, z);
                    }
                });
                return;
            }
            this.starsToDotsDrawable.setOnAnimationEndListener(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$mNHl9TTseTAyhleGH7oqpsDOlM8(this.f$0);
                }
            });
            this.blueImageView.setAutoRepeat(false);
            this.starsToDotsDrawable.setCurrentFrame(0, false);
            this.blueImageView.setAnimation(this.starsToDotsDrawable);
            this.blueImageView.playAnimation();
        }

        public static void $r8$lambda$QvFcGAtw6xZjEc5v8hp9GJP5URI(final LoginActivitySmsView loginActivitySmsView, final int i, final boolean z) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.tryShowProgress(i, z);
                }
            });
        }

        public static void $r8$lambda$mNHl9TTseTAyhleGH7oqpsDOlM8(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$6BPjU0k5MUxe9Ke2efwIs3MWlc8(this.f$0);
                }
            });
        }

        public static void $r8$lambda$6BPjU0k5MUxe9Ke2efwIs3MWlc8(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.blueImageView.setAutoRepeat(true);
            loginActivitySmsView.dotsDrawable.setCurrentFrame(0, false);
            loginActivitySmsView.dotsDrawable.setAutoRepeat(1);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.dotsDrawable);
            loginActivitySmsView.blueImageView.playAnimation();
        }

        private void tryHideProgress(boolean z) {
            tryHideProgress(z, true);
        }

        private void tryHideProgress(boolean z, boolean z2) {
            if (this.starsToDotsDrawable == null) {
                LoginActivity.this.needHideProgress(z, z2);
            } else if (this.isDotsAnimationVisible) {
                this.isDotsAnimationVisible = false;
                this.blueImageView.setAutoRepeat(false);
                this.dotsDrawable.setAutoRepeat(0);
                this.dotsDrawable.setOnFinishCallback(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$5uVAeYIco1KWdytuEGpFpJt2k3s(this.f$0);
                    }
                }, this.dotsDrawable.getFramesCount() - 1);
            }
        }

        public static void $r8$lambda$5uVAeYIco1KWdytuEGpFpJt2k3s(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$nM9uVh2kVO1NN34Z54rIgWZJemY(this.f$0);
                }
            });
        }

        public static void $r8$lambda$nM9uVh2kVO1NN34Z54rIgWZJemY(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.dotsToStarsDrawable.setOnAnimationEndListener(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3496$r8$lambda$yz698qafBBTSrgKN61gSKN3UO0(this.f$0);
                }
            });
            loginActivitySmsView.blueImageView.setAutoRepeat(false);
            loginActivitySmsView.dotsToStarsDrawable.setCurrentFrame(0, false);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.dotsToStarsDrawable);
            loginActivitySmsView.blueImageView.playAnimation();
        }

        public static void m3496$r8$lambda$yz698qafBBTSrgKN61gSKN3UO0(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3488$r8$lambda$UdfHSOFaxh7eo1uNjq502FpY7w(this.f$0);
                }
            });
        }

        public static void m3488$r8$lambda$UdfHSOFaxh7eo1uNjq502FpY7w(LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.blueImageView.setAutoRepeat(false);
            loginActivitySmsView.blueImageView.setAnimation(loginActivitySmsView.hintDrawable);
        }

        @Override
        public String getHeaderName() {
            int i = this.currentType;
            if (i == 3 || i == 11) {
                return this.phone;
            }
            return LocaleController.getString("YourCode", R.string.YourCode);
        }

        public static void $r8$lambda$Q4MeovcEViVloqaB8jqSemLcqRI(LoginActivitySmsView loginActivitySmsView, View view, boolean z) {
            if (!z) {
                loginActivitySmsView.getClass();
            } else {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            char c;
            CharSequence charSequenceReplaceTags;
            char c2;
            LoadingTextView loadingTextView;
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            String strSubstring;
            String string;
            String str;
            int i6;
            String strSubstring2;
            int i7;
            int iLastIndexOf;
            SpannableStringBuilder spannableStringBuilder;
            int i8;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView2 = this.problemText;
                if (loadingTextView2 != null) {
                    loadingTextView2.setVisibility(0);
                    this.problemText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                    int i9 = this.nextType;
                    if (i9 == 17) {
                        i8 = R.string.ReturnEnteringPhrase;
                    } else if (i9 == 16) {
                        i8 = R.string.ReturnEnteringWord;
                    } else {
                        i8 = R.string.ReturnEnteringSMS;
                    }
                    this.problemText.setText(AndroidUtilities.replaceArrows(LocaleController.getString(i8), true, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f)));
                    return;
                }
                return;
            }
            this.waitingForEvent = true;
            int i10 = this.currentType;
            if (i10 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i10 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i10 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didReceiveCall);
                if (z) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            CallReceiver.checkLastReceivedCall();
                        }
                    });
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
                    public void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
                        if (LoginActivitySmsView.this.postedErrorColorTimeout) {
                            LoginActivitySmsView loginActivitySmsView = LoginActivitySmsView.this;
                            loginActivitySmsView.removeCallbacks(loginActivitySmsView.errorColorTimeout);
                            LoginActivitySmsView.this.errorColorTimeout.run();
                        }
                    }
                });
                codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z2) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$Q4MeovcEViVloqaB8jqSemLcqRI(this.f$0, view, z2);
                    }
                });
            }
            int i11 = this.prevType;
            if (i11 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i11 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else {
                this.prevTypeTextView.setVisibility(8);
            }
            if (this.phone == null) {
                return;
            }
            String str2 = PhoneFormat.getInstance().format(this.phone);
            if (LoginActivity.this.isInCancelAccountDeletionMode()) {
                c = 0;
                spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("CancelAccountResetInfo2", R.string.CancelAccountResetInfo2, PhoneFormat.getInstance().format("+" + str2))));
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
                c = 0;
                int i12 = this.currentType;
                if (i12 == 1) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentAppCodeWithPhone", R.string.SentAppCodeWithPhone, LocaleController.addNbsp(str2)));
                } else if (i12 == 2) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentSmsCode", R.string.SentSmsCode, LocaleController.addNbsp(str2)));
                } else if (i12 == 3) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallCode", R.string.SentCallCode, LocaleController.addNbsp(str2)));
                } else if (i12 == 4) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("SentCallOnly", R.string.SentCallOnly, LocaleController.addNbsp(str2)));
                } else {
                    charSequenceReplaceTags = i12 == 15 ? AndroidUtilities.replaceTags(LocaleController.formatString("SentFragmentCode", R.string.SentFragmentCode, LocaleController.addNbsp(str2))) : "";
                }
            }
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            charSequenceReplaceTags = spannableStringBuilder;
            this.confirmTextView.setText(charSequenceReplaceTags);
            int i13 = this.currentType;
            if (i13 != 15) {
                if (i13 == 1) {
                    int i14 = this.nextType;
                    if (i14 == 3 || i14 == 4 || i14 == 11) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodePhone));
                    } else if (i14 == 15) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeFragment));
                    } else if (i14 == 0) {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                    } else {
                        this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCodeSms));
                    }
                } else {
                    this.problemText.setText(LocaleController.getString(R.string.DidNotGetTheCode));
                }
            }
            if (this.currentType != 3) {
                LoginActivity.this.showKeyboard(this.codeFieldContainer.codeField[c]);
                this.codeFieldContainer.codeField[c].requestFocus();
            } else {
                AndroidUtilities.hideKeyboard(this.codeFieldContainer.codeField[c]);
            }
            destroyTimer();
            destroyCodeTimer();
            this.lastCurrentTime = System.currentTimeMillis();
            int i15 = this.currentType;
            if (i15 == 1) {
                setProblemTextVisible(true);
                this.timeText.setVisibility(8);
                LoadingTextView loadingTextView3 = this.problemText;
                if (loadingTextView3 != null) {
                    loadingTextView3.setVisibility(0);
                }
            } else {
                if (i15 == 3) {
                    int i16 = this.nextType;
                    if (i16 == 4 || i16 == 2 || i16 == 17 || i16 == 16 || i16 == 11) {
                        setProblemTextVisible(false);
                        this.timeText.setVisibility(0);
                        this.problemText.setVisibility(8);
                        int i17 = this.nextType;
                        if (i17 == 4 || i17 == 11) {
                            this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, 1, 0));
                        } else if (i17 == 2 || i17 == 17 || i17 == 16) {
                            this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, 1, 0));
                        }
                    } else {
                        this.timeText.setVisibility(8);
                    }
                    String strObtainLoginPhoneCall = z ? AndroidUtilities.obtainLoginPhoneCall(this.pattern) : null;
                    if (strObtainLoginPhoneCall != null) {
                        onNextPressed(strObtainLoginPhoneCall);
                    } else {
                        String str3 = this.catchedPhone;
                        if (str3 != null) {
                            onNextPressed(str3);
                        } else {
                            int i18 = this.nextType;
                            if (i18 == 4 || i18 == 2 || i18 == 17 || i18 == 16 || i18 == 11) {
                                createTimer();
                            }
                        }
                    }
                } else {
                    if (i15 == 2) {
                        int i19 = this.nextType;
                        if (i19 != 2) {
                            i5 = 17;
                            c2 = 1;
                            i4 = 16;
                            if (i19 == 17 || i19 == 16 || i19 == 4 || i19 == 3) {
                            }
                        } else {
                            i4 = 16;
                            i5 = 17;
                            c2 = 1;
                        }
                        if (i19 == 2 || i19 == i5 || i19 == i4) {
                            LoadingTextView loadingTextView4 = this.timeText;
                            int i20 = R.string.SmsAvailableIn;
                            Object[] objArr = new Object[2];
                            objArr[0] = 1;
                            objArr[c2] = 0;
                            loadingTextView4.setText(LocaleController.formatString("SmsAvailableIn", i20, objArr));
                        } else {
                            LoadingTextView loadingTextView5 = this.timeText;
                            int i21 = R.string.CallAvailableIn;
                            Object[] objArr2 = new Object[2];
                            objArr2[0] = 2;
                            objArr2[c2] = 0;
                            loadingTextView5.setText(LocaleController.formatString("CallAvailableIn", i21, objArr2));
                        }
                        setProblemTextVisible(this.time < 1000);
                        this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                        LoadingTextView loadingTextView6 = this.problemText;
                        if (loadingTextView6 != null) {
                            loadingTextView6.setVisibility(this.time < 1000 ? 0 : 8);
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
                            onNextPressed(null);
                        } else {
                            createTimer();
                        }
                    } else {
                        c2 = 1;
                    }
                    if (i15 == 4) {
                        int i22 = this.nextType;
                        if (i22 == 2 || i22 == 17 || i22 == 11) {
                            i3 = 16;
                        } else {
                            i3 = 16;
                            if (i22 != 16) {
                                if (i15 == 11) {
                                    i = this.nextType;
                                    if (i != 4) {
                                        setProblemTextVisible(false);
                                        this.timeText.setVisibility(0);
                                        this.problemText.setVisibility(8);
                                        i2 = this.nextType;
                                        if (i2 != 4) {
                                            LoadingTextView loadingTextView7 = this.timeText;
                                            int i23 = R.string.CallAvailableIn;
                                            Object[] objArr3 = new Object[2];
                                            objArr3[0] = 1;
                                            objArr3[c2] = 0;
                                            loadingTextView7.setText(LocaleController.formatString("CallAvailableIn", i23, objArr3));
                                        } else {
                                            LoadingTextView loadingTextView8 = this.timeText;
                                            int i24 = R.string.CallAvailableIn;
                                            Object[] objArr4 = new Object[2];
                                            objArr4[0] = 1;
                                            objArr4[c2] = 0;
                                            loadingTextView8.setText(LocaleController.formatString("CallAvailableIn", i24, objArr4));
                                        }
                                        createTimer();
                                    } else {
                                        setProblemTextVisible(false);
                                        this.timeText.setVisibility(0);
                                        this.problemText.setVisibility(8);
                                        i2 = this.nextType;
                                        if (i2 != 4) {
                                            LoadingTextView loadingTextView9 = this.timeText;
                                            int i25 = R.string.CallAvailableIn;
                                            Object[] objArr5 = new Object[2];
                                            objArr5[0] = 1;
                                            objArr5[c2] = 0;
                                            loadingTextView9.setText(LocaleController.formatString("CallAvailableIn", i25, objArr5));
                                        } else {
                                            LoadingTextView loadingTextView10 = this.timeText;
                                            int i26 = R.string.CallAvailableIn;
                                            Object[] objArr6 = new Object[2];
                                            objArr6[0] = 1;
                                            objArr6[c2] = 0;
                                            loadingTextView10.setText(LocaleController.formatString("CallAvailableIn", i26, objArr6));
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
                        if (i22 == 2 || i22 == 17 || i22 == i3) {
                            LoadingTextView loadingTextView11 = this.timeText;
                            int i27 = R.string.SmsAvailableIn;
                            Object[] objArr7 = new Object[2];
                            objArr7[0] = 1;
                            objArr7[c2] = 0;
                            loadingTextView11.setText(LocaleController.formatString("SmsAvailableIn", i27, objArr7));
                        } else {
                            LoadingTextView loadingTextView12 = this.timeText;
                            int i28 = R.string.CallAvailableIn;
                            Object[] objArr8 = new Object[2];
                            objArr8[0] = 2;
                            objArr8[c2] = 0;
                            loadingTextView12.setText(LocaleController.formatString("CallAvailableIn", i28, objArr8));
                        }
                        setProblemTextVisible(this.time < 1000);
                        this.timeText.setVisibility(this.time < 1000 ? 8 : 0);
                        LoadingTextView loadingTextView13 = this.problemText;
                        if (loadingTextView13 != null) {
                            loadingTextView13.setVisibility(this.time < 1000 ? 0 : 8);
                        }
                        createTimer();
                    } else if (i15 == 11) {
                        i = this.nextType;
                        if (i != 4 || i == 2 || i == 17 || i == 16 || i == 11) {
                            setProblemTextVisible(false);
                            this.timeText.setVisibility(0);
                            this.problemText.setVisibility(8);
                            i2 = this.nextType;
                            if (i2 != 4 || i2 == 11) {
                                LoadingTextView loadingTextView14 = this.timeText;
                                int i29 = R.string.CallAvailableIn;
                                Object[] objArr9 = new Object[2];
                                objArr9[0] = 1;
                                objArr9[c2] = 0;
                                loadingTextView14.setText(LocaleController.formatString("CallAvailableIn", i29, objArr9));
                            } else if (i2 == 2 || i2 == 17 || i2 == 16) {
                                LoadingTextView loadingTextView15 = this.timeText;
                                int i30 = R.string.SmsAvailableIn;
                                Object[] objArr10 = new Object[2];
                                objArr10[0] = 1;
                                objArr10[c2] = 0;
                                loadingTextView15.setText(LocaleController.formatString("SmsAvailableIn", i30, objArr10));
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
                if (this.currentType == 11) {
                    str = this.prefix;
                    for (i6 = 0; i6 < this.length; i6++) {
                        str = str + "0";
                    }
                    strSubstring2 = PhoneFormat.getInstance().format("+" + str);
                    for (i7 = 0; i7 < this.length; i7++) {
                        iLastIndexOf = strSubstring2.lastIndexOf("0");
                        if (iLastIndexOf >= 0) {
                            strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                        }
                    }
                    this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
                }
            }
            if (this.currentType == 11) {
                str = this.prefix;
                while (i6 < this.length) {
                    str = str + "0";
                }
                strSubstring2 = PhoneFormat.getInstance().format("+" + str);
                while (i7 < this.length) {
                    iLastIndexOf = strSubstring2.lastIndexOf("0");
                    if (iLastIndexOf >= 0) {
                        strSubstring2 = strSubstring2.substring(0, iLastIndexOf);
                    }
                }
                this.prefixTextView.setText(strSubstring2.replaceAll("\\)", "").replaceAll("\\(", ""));
            }
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

        class AnonymousClass7 extends TimerTask {
            AnonymousClass7() {
            }

            @Override
            public void run() {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.AnonymousClass7.m3499$r8$lambda$wW2BEGwyw8poyWzOiSyvv_1wM(this.f$0);
                    }
                });
            }

            public static void m3499$r8$lambda$wW2BEGwyw8poyWzOiSyvv_1wM(AnonymousClass7 anonymousClass7) {
                anonymousClass7.getClass();
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

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass8(), 0L, 1000L);
        }

        class AnonymousClass8 extends TimerTask {
            AnonymousClass8() {
            }

            @Override
            public void run() {
                if (LoginActivitySmsView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.AnonymousClass8.$r8$lambda$yg1mB9dwovRkikD4GHs74K3pdSo(this.f$0);
                    }
                });
            }

            public static void $r8$lambda$yg1mB9dwovRkikD4GHs74K3pdSo(AnonymousClass8 anonymousClass8) {
                anonymousClass8.getClass();
                double dCurrentTimeMillis = System.currentTimeMillis();
                double d = dCurrentTimeMillis - LoginActivitySmsView.this.lastCurrentTime;
                LoginActivitySmsView.this.lastCurrentTime = dCurrentTimeMillis;
                LoginActivitySmsView.access$8626(LoginActivitySmsView.this, d);
                if (LoginActivitySmsView.this.time >= 1000) {
                    int i = (LoginActivitySmsView.this.time / 1000) / 60;
                    int i2 = (LoginActivitySmsView.this.time / 1000) - (i * 60);
                    if (LoginActivitySmsView.this.nextType == 4 || LoginActivitySmsView.this.nextType == 3 || LoginActivitySmsView.this.nextType == 11) {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("CallAvailableIn", R.string.CallAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    } else if (LoginActivitySmsView.this.currentType != 2 || (LoginActivitySmsView.this.nextType != 2 && LoginActivitySmsView.this.nextType != 17 && LoginActivitySmsView.this.nextType != 16)) {
                        if (LoginActivitySmsView.this.nextType == 2 || LoginActivitySmsView.this.nextType == 17 || LoginActivitySmsView.this.nextType == 16) {
                            LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("SmsAvailableIn", R.string.SmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                        }
                    } else {
                        LoginActivitySmsView.this.timeText.setText(LocaleController.formatString("ResendSmsAvailableIn", R.string.ResendSmsAvailableIn, Integer.valueOf(i), Integer.valueOf(i2)));
                    }
                    LoginActivitySmsView.access$10300(LoginActivitySmsView.this);
                    return;
                }
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
                    int i3 = Theme.key_chats_actionBackground;
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivitySmsView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            loadingTextView.setTextColor(Theme.getColor(i));
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

        @Override
        public void onNextPressed(String str) {
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
                    final TL_account.confirmPhone confirmphone = new TL_account.confirmPhone();
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
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(confirmphone, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LoginActivity.LoginActivitySmsView.m3485$r8$lambda$BLKsRQL8tF9NsW00cKWuJP4GQs(this.f$0, confirmphone, tLObject, tL_error);
                        }
                    }, 2));
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
                    tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(changephone, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            LoginActivity.LoginActivitySmsView.m3483$r8$lambda$626WCZcV5b4cnKb_qK_Seiz5xc(this.f$0, tLObject, tL_error);
                        }
                    }, 2), true);
                    LoginActivity.this.showDoneButton(true, true);
                    return;
                }
                final TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
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
                tryShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signIn, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$XLOVqDD_geoQZgX3OjM7N3Hjx0w(this.f$0, tL_auth_signIn, tLObject, tL_error);
                    }
                }, 10), true);
                LoginActivity.this.showDoneButton(true, true);
            }
        }

        public static void m3483$r8$lambda$626WCZcV5b4cnKb_qK_Seiz5xc(final LoginActivitySmsView loginActivitySmsView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3494$r8$lambda$lG9D0uJ4SxlyTkYKaA3wSf1HLI(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void m3494$r8$lambda$lG9D0uJ4SxlyTkYKaA3wSf1HLI(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TLObject tLObject) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false, true);
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                TLRPC.User user = (TLRPC.User) tLObject;
                loginActivitySmsView.destroyTimer();
                loginActivitySmsView.destroyCodeTimer();
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).setCurrentUser(user);
                UserConfig.getInstance(((BaseFragment) LoginActivity.this).currentAccount).saveConfig(true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(user);
                MessagesStorage.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUsersAndChats(arrayList, null, true, true);
                MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).putUser(user, false);
                NotificationCenter.getInstance(((BaseFragment) LoginActivity.this).currentAccount).postNotificationName(NotificationCenter.mainUserInfoChanged, new Object[0]);
                LoginActivity.this.getMessagesController().removeSuggestion(0L, "VALIDATE_PHONE_NUMBER");
                if (loginActivitySmsView.currentType == 3) {
                    AndroidUtilities.endIncomingCall();
                }
                loginActivitySmsView.animateSuccess(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$BHz5j1iSfh39aSY9iPDVkwyQE10(this.f$0);
                    }
                });
                return;
            }
            loginActivitySmsView.lastError = tL_error.text;
            loginActivitySmsView.nextPressed = false;
            LoginActivity.this.showDoneButton(false, true);
            int i4 = loginActivitySmsView.currentType;
            if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                loginActivitySmsView.createTimer();
            }
            int i5 = loginActivitySmsView.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
            }
            loginActivitySmsView.waitingForEvent = true;
            if (loginActivitySmsView.currentType == 3) {
                return;
            }
            if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
            } else {
                if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    loginActivitySmsView.shakeWrongCode();
                    return;
                }
                if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                    loginActivitySmsView.onBackPressed(true);
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
                CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
                CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                if (i6 < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i6].setText("");
                    i6++;
                } else {
                    codeFieldContainer.isFocusSuppressed = false;
                    codeNumberFieldArr[0].requestFocus();
                    return;
                }
            }
        }

        public static void $r8$lambda$BHz5j1iSfh39aSY9iPDVkwyQE10(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            try {
                LoginActivity.this.fragmentView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            new AlertDialog.Builder(loginActivitySmsView.getContext()).setTitle(LocaleController.getString(R.string.YourPasswordSuccess)).setMessage(LocaleController.formatString(R.string.ChangePhoneNumberSuccessWithPhone, PhoneFormat.getInstance().format("+" + loginActivitySmsView.requestPhone))).setPositiveButton(LocaleController.getString(R.string.OK), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.this.finishFragment();
                }
            }).show();
        }

        public static void m3485$r8$lambda$BLKsRQL8tF9NsW00cKWuJP4GQs(final LoginActivitySmsView loginActivitySmsView, final TL_account.confirmPhone confirmphone, TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$vrQe9l__5K21Z4gDefk0BUYmT2I(this.f$0, tL_error, confirmphone);
                }
            });
        }

        public static void $r8$lambda$vrQe9l__5K21Z4gDefk0BUYmT2I(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TL_account.confirmPhone confirmphone) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false);
            loginActivitySmsView.nextPressed = false;
            if (tL_error == null) {
                final Activity parentActivity = LoginActivity.this.getParentActivity();
                if (parentActivity == null) {
                    return;
                }
                loginActivitySmsView.animateSuccess(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivitySmsView.$r8$lambda$QvMrqk4bMRquh8t2gzvYh8D8M9Q(this.f$0, parentActivity);
                    }
                });
                return;
            }
            loginActivitySmsView.lastError = tL_error.text;
            int i4 = loginActivitySmsView.currentType;
            if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                loginActivitySmsView.createTimer();
            }
            int i5 = loginActivitySmsView.currentType;
            if (i5 == 15) {
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 2) {
                AndroidUtilities.setWaitingForSms(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
            } else if (i5 == 3) {
                AndroidUtilities.setWaitingForCall(true);
                NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
            }
            loginActivitySmsView.waitingForEvent = true;
            if (loginActivitySmsView.currentType != 3) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, confirmphone, new Object[0]);
            }
            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                loginActivitySmsView.shakeWrongCode();
            } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                loginActivitySmsView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
            }
        }

        public static void $r8$lambda$QvMrqk4bMRquh8t2gzvYh8D8M9Q(final LoginActivitySmsView loginActivitySmsView, Activity activity) {
            loginActivitySmsView.getClass();
            new AlertDialog.Builder(activity).setTitle(LocaleController.getString(R.string.CancelLinkSuccessTitle)).setMessage(LocaleController.formatString("CancelLinkSuccess", R.string.CancelLinkSuccess, PhoneFormat.getInstance().format("+" + loginActivitySmsView.phone))).setPositiveButton(LocaleController.getString(R.string.Close), null).setOnDismissListener(new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.this.finishFragment();
                }
            }).show();
        }

        public static void $r8$lambda$XLOVqDD_geoQZgX3OjM7N3Hjx0w(final LoginActivitySmsView loginActivitySmsView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3484$r8$lambda$6fy6W3JOq0pqDMBHQ0gtZWSCH0(this.f$0, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static void m3484$r8$lambda$6fy6W3JOq0pqDMBHQ0gtZWSCH0(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, final TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            int i;
            int i2;
            int i3;
            loginActivitySmsView.tryHideProgress(false, true);
            if (tL_error == null) {
                loginActivitySmsView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                loginActivitySmsView.destroyTimer();
                loginActivitySmsView.destroyCodeTimer();
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    final Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
                    bundle.putString("phoneHash", loginActivitySmsView.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    loginActivitySmsView.animateSuccess(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.this.setPage(5, true, bundle, false);
                        }
                    });
                } else {
                    loginActivitySmsView.animateSuccess(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                        }
                    });
                }
            } else {
                String str = tL_error.text;
                loginActivitySmsView.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivitySmsView.m3490$r8$lambda$ZCW7tk9kWgtApB9OThnyLZJan8(this.f$0, tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    loginActivitySmsView.destroyTimer();
                    loginActivitySmsView.destroyCodeTimer();
                } else {
                    loginActivitySmsView.nextPressed = false;
                    LoginActivity.this.showDoneButton(false, true);
                    int i4 = loginActivitySmsView.currentType;
                    if ((i4 == 3 && ((i3 = loginActivitySmsView.nextType) == 4 || i3 == 2 || i3 == 17 || i3 == 16)) || ((i4 == 2 && ((i2 = loginActivitySmsView.nextType) == 4 || i2 == 3)) || (i4 == 4 && ((i = loginActivitySmsView.nextType) == 2 || i == 17 || i == 16)))) {
                        loginActivitySmsView.createTimer();
                    }
                    int i5 = loginActivitySmsView.currentType;
                    if (i5 == 15) {
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 2) {
                        AndroidUtilities.setWaitingForSms(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveSmsCode);
                    } else if (i5 == 3) {
                        AndroidUtilities.setWaitingForCall(true);
                        NotificationCenter.getGlobalInstance().addObserver(loginActivitySmsView, NotificationCenter.didReceiveCall);
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                CallReceiver.checkLastReceivedCall();
                            }
                        });
                    }
                    loginActivitySmsView.waitingForEvent = true;
                    if (loginActivitySmsView.currentType == 3) {
                        return;
                    }
                    if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                    } else {
                        if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                            loginActivitySmsView.shakeWrongCode();
                            return;
                        }
                        if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                            loginActivitySmsView.onBackPressed(true);
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
                        CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
                        CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
                        if (i6 < codeNumberFieldArr.length) {
                            codeNumberFieldArr[i6].setText("");
                            i6++;
                        } else {
                            codeFieldContainer.isFocusSuppressed = false;
                            codeNumberFieldArr[0].requestFocus();
                            return;
                        }
                    }
                }
            }
            if (loginActivitySmsView.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public static void m3490$r8$lambda$ZCW7tk9kWgtApB9OThnyLZJan8(final LoginActivitySmsView loginActivitySmsView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySmsView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3497$r8$lambda$zmjjO3lyM9LWgHM8zIZrmfs2g(this.f$0, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static void m3497$r8$lambda$zmjjO3lyM9LWgHM8zIZrmfs2g(final LoginActivitySmsView loginActivitySmsView, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            loginActivitySmsView.nextPressed = false;
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
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", loginActivitySmsView.requestPhone);
            bundle.putString("phoneHash", loginActivitySmsView.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            loginActivitySmsView.animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.this.setPage(6, true, bundle, false);
                }
            });
        }

        private void animateSuccess(final Runnable runnable) {
            if (this.currentType == 3) {
                runnable.run();
                return;
            }
            final int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (i < codeFieldContainer.codeField.length) {
                    codeFieldContainer.postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
                        }
                    }, ((long) i) * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.LoginActivitySmsView.$r8$lambda$02WegkLULEDZ9hWnpScbLdsPM7g(this.f$0, runnable);
                        }
                    }, (((long) this.codeFieldContainer.codeField.length) * 75) + 400);
                    return;
                }
            }
        }

        public static void $r8$lambda$02WegkLULEDZ9hWnpScbLdsPM7g(LoginActivitySmsView loginActivitySmsView, Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    loginActivitySmsView.codeFieldContainer.isFocusSuppressed = false;
                    return;
                }
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
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, this.currentType == 11 ? 3.5f : 10.0f, new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3489$r8$lambda$XPs08z92pnOI8SB9nfzzzdp0Ls(this.f$0);
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        public static void m3489$r8$lambda$XPs08z92pnOI8SB9nfzzzdp0Ls(final LoginActivitySmsView loginActivitySmsView) {
            loginActivitySmsView.getClass();
            loginActivitySmsView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$sZF4ZTSXJ4EKYIAl07yPIsAqOMk(this.f$0);
                }
            }, 150L);
        }

        public static void $r8$lambda$sZF4ZTSXJ4EKYIAl07yPIsAqOMk(LoginActivitySmsView loginActivitySmsView) {
            CodeFieldContainer codeFieldContainer = loginActivitySmsView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public boolean onBackPressed(boolean z) {
            if (LoginActivity.this.activityMode != 0) {
                LoginActivity.this.finishFragment();
                return false;
            }
            int i = this.prevType;
            if (i != 0) {
                LoginActivity.this.setPage(i, true, null, true);
                return false;
            }
            if (!z) {
                LoginActivity loginActivity = LoginActivity.this;
                loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString(R.string.EditNumber)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("EditNumberInfo", R.string.EditNumberInfo, this.phone))).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.Edit), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivitySmsView.m3480$r8$lambda$0i7wQcl8PHNkEvWQbf1Ij1itM(this.f$0, alertDialog, i2);
                    }
                }).create());
                return false;
            }
            this.nextPressed = false;
            tryHideProgress(true);
            TLRPC.TL_auth_cancelCode tL_auth_cancelCode = new TLRPC.TL_auth_cancelCode();
            tL_auth_cancelCode.phone_number = this.requestPhone;
            tL_auth_cancelCode.phone_code_hash = this.phoneHash;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_cancelCode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySmsView.$r8$lambda$gKyVJVXs5FXqCJwgMxzY5MPqX6U(tLObject, tL_error);
                }
            }, 10);
            destroyTimer();
            destroyCodeTimer();
            this.currentParams = null;
            int i2 = this.currentType;
            if (i2 == 15) {
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i2 == 2) {
                AndroidUtilities.setWaitingForSms(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveSmsCode);
            } else if (i2 == 3) {
                AndroidUtilities.setWaitingForCall(false);
                NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didReceiveCall);
            }
            this.waitingForEvent = false;
            return true;
        }

        public static void m3480$r8$lambda$0i7wQcl8PHNkEvWQbf1Ij1itM(LoginActivitySmsView loginActivitySmsView, AlertDialog alertDialog, int i) {
            loginActivitySmsView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
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
        public void onShow() {
            super.onShow();
            RLottieDrawable rLottieDrawable = this.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setCurrentFrame(0);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySmsView.m3495$r8$lambda$wCOm_qXJPVcU4rSHLUcsksy2jg(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void m3495$r8$lambda$wCOm_qXJPVcU4rSHLUcsksy2jg(LoginActivitySmsView loginActivitySmsView) {
            CodeNumberField[] codeNumberFieldArr;
            if (loginActivitySmsView.currentType != 3 && (codeNumberFieldArr = loginActivitySmsView.codeFieldContainer.codeField) != null) {
                for (int length = codeNumberFieldArr.length - 1; length >= 0; length--) {
                    if (length == 0 || loginActivitySmsView.codeFieldContainer.codeField[length].length() != 0) {
                        loginActivitySmsView.codeFieldContainer.codeField[length].requestFocus();
                        CodeNumberField codeNumberField = loginActivitySmsView.codeFieldContainer.codeField[length];
                        codeNumberField.setSelection(codeNumberField.length());
                        LoginActivity.this.showKeyboard(loginActivitySmsView.codeFieldContainer.codeField[length]);
                        break;
                    }
                }
            }
            RLottieDrawable rLottieDrawable = loginActivitySmsView.hintDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.start();
            }
            if (loginActivitySmsView.currentType == 15) {
                loginActivitySmsView.openFragmentImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                loginActivitySmsView.openFragmentImageView.getAnimatedDrawable().start();
            }
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
                    onNextPressed(null);
                    return;
                }
                if (i == NotificationCenter.didReceiveCall) {
                    String str = "" + objArr[0];
                    if (AndroidUtilities.checkPhonePattern(this.pattern, str)) {
                        if (!this.pattern.equals("*")) {
                            this.catchedPhone = str;
                            AndroidUtilities.endIncomingCall();
                        }
                        onNextPressed(str);
                        CallReceiver.clearLastCall();
                    }
                }
            }
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
    }

    public class LoadingTextView extends TextView {
        public final LoadingDrawable loadingDrawable;
        private final Drawable rippleDrawable;

        protected boolean isResendingCode() {
            return false;
        }

        protected boolean isRippleEnabled() {
            return true;
        }

        public LoadingTextView(Context context) {
            super(context);
            Drawable drawableCreateSelectorDrawable = Theme.createSelectorDrawable(Theme.multAlpha(Theme.getColor(Theme.key_windowBackgroundWhiteValueText), 0.1f), 7);
            this.rippleDrawable = drawableCreateSelectorDrawable;
            LoadingDrawable loadingDrawable = new LoadingDrawable();
            this.loadingDrawable = loadingDrawable;
            drawableCreateSelectorDrawable.setCallback(this);
            loadingDrawable.setAppearByGradient(true);
            loadingDrawable.setSpeed(0.8f);
        }

        @Override
        public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
            super.setText(charSequence, bufferType);
            updateLoadingLayout();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            updateLoadingLayout();
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
            this.loadingDrawable.setColors(Theme.multAlpha(themedColor, 0.85f), Theme.multAlpha(themedColor, 2.0f), Theme.multAlpha(themedColor, 3.5f), Theme.multAlpha(themedColor, 6.0f));
            this.loadingDrawable.updateBounds();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            canvas.save();
            float paddingTop = ((getGravity() & 16) == 0 || getLayout() == null) ? getPaddingTop() : getPaddingTop() + ((((getHeight() - getPaddingTop()) - getPaddingBottom()) - getLayout().getHeight()) / 2.0f);
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
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.rippleDrawable || super.verifyDrawable(drawable);
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

        @Override
        public boolean needBackButton() {
            return true;
        }

        public LoginActivityPasswordView(final Context context) {
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
            this.codeField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    this.f$0.outlineCodeField.animateSelection(z ? 1.0f : 0.0f);
                }
            });
            this.outlineCodeField.attachEditText(this.codeField);
            this.outlineCodeField.addView(this.codeField, LayoutHelper.createFrame(-1, -2, 48));
            this.codeField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityPasswordView.m3454$r8$lambda$SJ0VO2rtSy2RzAav_DCR9Z8NP0(this.f$0, textView3, i2, keyEvent);
                }
            });
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
            this.cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$xYxvf4N9y4TrtOppdo3HNmC9e5E(this.f$0, context, view);
                }
            });
        }

        public static boolean m3454$r8$lambda$SJ0VO2rtSy2RzAav_DCR9Z8NP0(LoginActivityPasswordView loginActivityPasswordView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityPasswordView.onNextPressed(null);
                return true;
            }
            loginActivityPasswordView.getClass();
            return false;
        }

        public static void $r8$lambda$xYxvf4N9y4TrtOppdo3HNmC9e5E(final LoginActivityPasswordView loginActivityPasswordView, Context context, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            if (loginActivityPasswordView.currentPassword.has_recovery) {
                LoginActivity.this.needShowProgress(0);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TLRPC.TL_auth_requestPasswordRecovery(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPasswordView.$r8$lambda$0sB2H4eWXW0DTiRG9GclcgIMNqg(this.f$0, tLObject, tL_error);
                    }
                }, 10);
            } else {
                AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
                new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString(R.string.RestorePasswordNoEmailText)).setPositiveButton(LocaleController.getString(R.string.Close), null).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityPasswordView loginActivityPasswordView2 = this.f$0;
                        LoginActivity.this.tryResetAccount(loginActivityPasswordView2.requestPhone, loginActivityPasswordView2.phoneHash, loginActivityPasswordView2.phoneCode);
                    }
                }).show();
            }
        }

        public static void $r8$lambda$0sB2H4eWXW0DTiRG9GclcgIMNqg(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$LP3SNFRNMU83_6eEvjUAWDPBUgo(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void $r8$lambda$LP3SNFRNMU83_6eEvjUAWDPBUgo(final LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, TLObject tLObject) {
            String pluralString;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                final TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery = (TLRPC.TL_auth_passwordRecovery) tLObject;
                if (LoginActivity.this.getParentActivity() == null) {
                    return;
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
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
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        LoginActivity.LoginActivityPasswordView.m3456$r8$lambda$l0KF80oes2c05ofA7rpf3PBTRU(this.f$0, tL_auth_passwordRecovery, alertDialog, i2);
                    }
                });
                Dialog dialogShowDialog = LoginActivity.this.showDialog(builder.create());
                if (dialogShowDialog != null) {
                    dialogShowDialog.setCanceledOnTouchOutside(false);
                    dialogShowDialog.setCancelable(false);
                    return;
                }
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.WrongCodeTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
        }

        public static void m3456$r8$lambda$l0KF80oes2c05ofA7rpf3PBTRU(LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_auth_passwordRecovery tL_auth_passwordRecovery, AlertDialog alertDialog, int i) {
            loginActivityPasswordView.getClass();
            Bundle bundle = new Bundle();
            bundle.putString("email_unconfirmed_pattern", tL_auth_passwordRecovery.email_pattern);
            bundle.putString("password", loginActivityPasswordView.passwordString);
            bundle.putString("requestPhone", loginActivityPasswordView.requestPhone);
            bundle.putString("phoneHash", loginActivityPasswordView.phoneHash);
            bundle.putString("phoneCode", loginActivityPasswordView.phoneCode);
            LoginActivity.this.setPage(7, true, bundle, false);
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.codeField.setTextColor(Theme.getColor(i));
            this.codeField.setCursorColor(Theme.getColor(i));
            this.codeField.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteHintText));
            this.cancelButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.outlineCodeField.updateColor();
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
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
            if (password != null && !TextUtils.isEmpty(password.hint)) {
                this.codeField.setHint(this.currentPassword.hint);
            } else {
                this.codeField.setHint((CharSequence) null);
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
        public void onNextPressed(String str) {
            if (this.nextPressed || this.currentPassword == null) {
                return;
            }
            final String string = this.codeField.getText().toString();
            if (string.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$RZyI8uXtqfbDP6SppH4bBToCKPo(this.f$0, string);
                }
            });
        }

        public static void $r8$lambda$RZyI8uXtqfbDP6SppH4bBToCKPo(final LoginActivityPasswordView loginActivityPasswordView, String str) {
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityPasswordView.currentPassword.current_algo;
            boolean z = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow;
            byte[] x = z ? SRPHelper.getX(AndroidUtilities.getStringBytes(str), (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPasswordView.m3458$r8$lambda$u9Fia_jB8nbWLc2KoZ7UGkDrN4(this.f$0, tLObject, tL_error);
                }
            };
            if (z) {
                TL_account.Password password = loginActivityPasswordView.currentPassword;
                TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                if (tL_inputCheckPasswordSRPStartCheck == null) {
                    TLRPC.TL_error tL_error = new TLRPC.TL_error();
                    tL_error.text = "PASSWORD_HASH_INVALID";
                    requestDelegate.run(null, tL_error);
                } else {
                    TLRPC.TL_auth_checkPassword tL_auth_checkPassword = new TLRPC.TL_auth_checkPassword();
                    tL_auth_checkPassword.password = tL_inputCheckPasswordSRPStartCheck;
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkPassword, requestDelegate, 10);
                }
            }
        }

        public static void m3458$r8$lambda$u9Fia_jB8nbWLc2KoZ7UGkDrN4(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$lK4fLZDNSrfsJqYOczhPnZ3jQeQ(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void $r8$lambda$lK4fLZDNSrfsJqYOczhPnZ3jQeQ(final LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, final TLObject tLObject) {
            String pluralString;
            loginActivityPasswordView.nextPressed = false;
            if (tL_error != null && "SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityPasswordView.m3459$r8$lambda$vCTxBLNkfBN9vsWF3UGcU13szo(this.f$0, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
            if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.showDoneButton(false, true);
                loginActivityPasswordView.postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivityPasswordView.m3455$r8$lambda$gVfh8JHGRjQNirIkpkBXF6E8(this.f$0, tLObject);
                    }
                }, 150L);
                return;
            }
            LoginActivity.this.needHideProgress(false);
            if (tL_error.text.equals("PASSWORD_HASH_INVALID")) {
                loginActivityPasswordView.onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
        }

        public static void m3459$r8$lambda$vCTxBLNkfBN9vsWF3UGcU13szo(final LoginActivityPasswordView loginActivityPasswordView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.m3457$r8$lambda$swQem0Znss2QSBPrCeuJ2q6Qg0(this.f$0, tL_error, tLObject);
                }
            });
        }

        public static void m3457$r8$lambda$swQem0Znss2QSBPrCeuJ2q6Qg0(LoginActivityPasswordView loginActivityPasswordView, TLRPC.TL_error tL_error, TLObject tLObject) {
            loginActivityPasswordView.getClass();
            if (tL_error == null) {
                loginActivityPasswordView.currentPassword = (TL_account.Password) tLObject;
                loginActivityPasswordView.onNextPressed(null);
            }
        }

        public static void m3455$r8$lambda$gVfh8JHGRjQNirIkpkBXF6E8(LoginActivityPasswordView loginActivityPasswordView, TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(loginActivityPasswordView.codeField);
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
        }

        @Override
        public boolean onBackPressed(boolean z) {
            this.nextPressed = false;
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            return true;
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPasswordView.$r8$lambda$2E72vs0vs3_afXQFwZ_cwUEmP4c(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void $r8$lambda$2E72vs0vs3_afXQFwZ_cwUEmP4c(LoginActivityPasswordView loginActivityPasswordView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityPasswordView.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityPasswordView.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                LoginActivity.this.showKeyboard(loginActivityPasswordView.codeField);
                loginActivityPasswordView.lockImageView.getAnimatedDrawable().setCurrentFrame(0, false);
                loginActivityPasswordView.lockImageView.playAnimation();
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

        @Override
        public boolean needBackButton() {
            return true;
        }

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
            this.resetAccountButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$F8iChuPVf8RL09SZOLiAPjKfNnE(this.f$0, view);
                }
            });
        }

        public static void $r8$lambda$F8iChuPVf8RL09SZOLiAPjKfNnE(final LoginActivityResetWaitView loginActivityResetWaitView, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            LoginActivity loginActivity = LoginActivity.this;
            loginActivity.showDialog(new AlertDialog.Builder(loginActivity.getParentActivity()).setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning)).setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText)).setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$ikyyFm92ykkFTX7dMIEQSTX_1Z4(this.f$0, alertDialog, i);
                }
            }).setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null).create());
        }

        public static void $r8$lambda$ikyyFm92ykkFTX7dMIEQSTX_1Z4(final LoginActivityResetWaitView loginActivityResetWaitView, AlertDialog alertDialog, int i) {
            LoginActivity.this.needShowProgress(0);
            TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
            deleteaccount.reason = "Forgot password";
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(deleteaccount, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityResetWaitView.$r8$lambda$cktPbHmwqxyIp0cFNUiI3I9awtM(this.f$0, tLObject, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$cktPbHmwqxyIp0cFNUiI3I9awtM(final LoginActivityResetWaitView loginActivityResetWaitView, TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityResetWaitView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityResetWaitView.m3474$r8$lambda$WoC_cvjmzlZ0Q04f6MugQ1U0yc(this.f$0, tL_error);
                }
            });
        }

        public static void m3474$r8$lambda$WoC_cvjmzlZ0Q04f6MugQ1U0yc(LoginActivityResetWaitView loginActivityResetWaitView, TLRPC.TL_error tL_error) {
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                if (loginActivityResetWaitView.requestPhone == null || loginActivityResetWaitView.phoneHash == null || loginActivityResetWaitView.phoneCode == null) {
                    LoginActivity.this.setPage(0, true, null, true);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("phoneFormated", loginActivityResetWaitView.requestPhone);
                bundle.putString("phoneHash", loginActivityResetWaitView.phoneHash);
                bundle.putString("code", loginActivityResetWaitView.phoneCode);
                LoginActivity.this.setPage(5, true, bundle, false);
                return;
            }
            if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            } else {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
            }
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(i));
            this.resetAccountText.setTextColor(Theme.getColor(i));
            this.resetAccountTime.setTextColor(Theme.getColor(i));
            this.resetAccountButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(Theme.key_changephoneinfo_image2), Theme.getColor(Theme.key_chats_actionPressedBackground)));
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("ResetAccount", R.string.ResetAccount);
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
                if (!z) {
                    this.waitImageView.setAutoRepeat(true);
                    if (!this.waitImageView.isPlaying()) {
                        this.waitImageView.playAnimation();
                    }
                } else {
                    this.waitImageView.getAnimatedDrawable().setAutoRepeat(0);
                }
                this.resetAccountTime.setVisibility(z ? 4 : 0);
                this.resetAccountText.setVisibility(z ? 4 : 0);
                this.resetAccountButton.setVisibility(z ? 0 : 4);
                this.wasResetButtonActive = Boolean.valueOf(z);
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
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            AndroidUtilities.cancelRunOnUIThread(this.timeRunnable);
            this.timeRunnable = null;
            this.currentParams = null;
            return true;
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            Bundle bundle2 = this.currentParams;
            if (bundle2 != null) {
                bundle.putBundle("resetview_params", bundle2);
            }
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("resetview_params");
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
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
            this.emailField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z) {
                    this.f$0.emailOutlineView.animateSelection(z ? 1.0f : 0.0f);
                }
            });
            this.emailField.setBackground(null);
            this.emailField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.emailOutlineView.attachEditText(this.emailField);
            this.emailOutlineView.addView(this.emailField, LayoutHelper.createFrame(-1, -2, 48));
            this.emailField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView2, int i2, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivitySetupEmail.$r8$lambda$W_tqXh0dukwXHfv0k9qwDrxcpkQ(this.f$0, textView2, i2, keyEvent);
                }
            });
            addView(this.emailOutlineView, LayoutHelper.createLinear(-1, 58, 16.0f, 24.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.signInWithGoogleView = textView2;
            textView2.setGravity(3);
            this.signInWithGoogleView.setTextSize(1, 14.0f);
            this.signInWithGoogleView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.signInWithGoogleView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.signInWithGoogleView.setMaxLines(2);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
            frameLayout2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivitySetupEmail.m3479$r8$lambda$rmxHYoUXaoN7LjLi3YstB0UX_Y(this.f$0, view);
                }
            });
        }

        public static boolean $r8$lambda$W_tqXh0dukwXHfv0k9qwDrxcpkQ(LoginActivitySetupEmail loginActivitySetupEmail, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivitySetupEmail.onNextPressed(null);
                return true;
            }
            loginActivitySetupEmail.getClass();
            return false;
        }

        public static void m3479$r8$lambda$rmxHYoUXaoN7LjLi3YstB0UX_Y(final LoginActivitySetupEmail loginActivitySetupEmail, View view) {
            loginActivitySetupEmail.getClass();
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
                            LoginActivitySetupEmail.this.onNextPressed(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(loginActivitySetupEmail.getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() {
                @Override
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$WNlTg2BPzcsBRo4qDVF49Pe8Uw0(this.f$0, client, task);
                }
            });
        }

        public static void $r8$lambda$WNlTg2BPzcsBRo4qDVF49Pe8Uw0(LoginActivitySetupEmail loginActivitySetupEmail, GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null || LoginActivity.this.getParentActivity().isFinishing()) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), 200);
        }

        @Override
        public void updateColors() {
            TextView textView = this.titleView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            this.subtitleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.subtitleView.setLinkTextColor(Theme.getColor(Theme.key_chat_messageLinkIn));
            this.emailField.setTextColor(Theme.getColor(i));
            this.signInWithGoogleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.loginOrView.updateColors();
            this.emailOutlineView.invalidate();
        }

        @Override
        public boolean needBackButton() {
            return !LoginActivity.this.emailChangeIsSuggestion;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("AddEmailTitle", R.string.AddEmailTitle);
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
            postDelayed(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.emailField.requestFocus();
                }
            }, 300L);
        }

        @Override
        public void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            GoogleSignInAccount googleSignInAccount = this.googleAccount;
            String email = googleSignInAccount != null ? googleSignInAccount.getEmail() : this.emailField.getText().toString();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            bundle.putString("phoneHash", this.phoneHash);
            bundle.putString("email", email);
            bundle.putBoolean("setup", true);
            if (this.googleAccount != null) {
                final TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
                if (LoginActivity.this.activityMode == 3) {
                    verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
                } else {
                    TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                    tL_emailVerifyPurposeLoginSetup.phone_number = this.requestPhone;
                    tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.phoneHash;
                    verifyemail.purpose = tL_emailVerifyPurposeLoginSetup;
                }
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.googleAccount.getIdToken();
                verifyemail.verification = tL_emailVerificationGoogle;
                this.googleAccount = null;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(verifyemail, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivitySetupEmail.$r8$lambda$VC3_d3qZ4clcry3tjbgQatWLL2s(this.f$0, bundle, verifyemail, tLObject, tL_error);
                    }
                }, 10);
                return;
            }
            if (TextUtils.isEmpty(email)) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            final TL_account.sendVerifyEmailCode sendverifyemailcode = new TL_account.sendVerifyEmailCode();
            if (LoginActivity.this.activityMode == 3) {
                sendverifyemailcode.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            } else {
                TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup2 = new TLRPC.TL_emailVerifyPurposeLoginSetup();
                tL_emailVerifyPurposeLoginSetup2.phone_number = this.requestPhone;
                tL_emailVerifyPurposeLoginSetup2.phone_code_hash = this.phoneHash;
                sendverifyemailcode.purpose = tL_emailVerifyPurposeLoginSetup2;
            }
            sendverifyemailcode.email = email;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(sendverifyemailcode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivitySetupEmail.m3477$r8$lambda$YjEb7EpfCt3u5XAaSgWCr5taIk(this.f$0, bundle, sendverifyemailcode, tLObject, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$VC3_d3qZ4clcry3tjbgQatWLL2s(final LoginActivitySetupEmail loginActivitySetupEmail, final Bundle bundle, final TL_account.verifyEmail verifyemail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySetupEmail.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.m3478$r8$lambda$ZtFz69K5ioM0PpaQ1IHBwtUhpA(this.f$0, tLObject, bundle, tL_error, verifyemail);
                }
            });
        }

        public static void m3478$r8$lambda$ZtFz69K5ioM0PpaQ1IHBwtUhpA(LoginActivitySetupEmail loginActivitySetupEmail, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.verifyEmail verifyemail) {
            loginActivitySetupEmail.getClass();
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
                return;
            }
            if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                TL_account.TL_emailVerifiedLogin tL_emailVerifiedLogin = (TL_account.TL_emailVerifiedLogin) tLObject;
                bundle.putString("email", tL_emailVerifiedLogin.email);
                LoginActivity.this.fillNextCodeParams(bundle, tL_emailVerifiedLogin.sent_code);
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

        public static void m3477$r8$lambda$YjEb7EpfCt3u5XAaSgWCr5taIk(final LoginActivitySetupEmail loginActivitySetupEmail, final Bundle bundle, final TL_account.sendVerifyEmailCode sendverifyemailcode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivitySetupEmail.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.$r8$lambda$GiqjsYzolpT2K_wOcvkXau9QWP4(this.f$0, tLObject, bundle, tL_error, sendverifyemailcode);
                }
            });
        }

        public static void $r8$lambda$GiqjsYzolpT2K_wOcvkXau9QWP4(LoginActivitySetupEmail loginActivitySetupEmail, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TL_account.sendVerifyEmailCode sendverifyemailcode) {
            LoginActivity.this.needHideProgress(false);
            loginActivitySetupEmail.nextPressed = false;
            if (tLObject instanceof TL_account.sentEmailCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TL_account.sentEmailCode) tLObject);
                return;
            }
            String str = tL_error.text;
            if (str != null) {
                if (str.contains("EMAIL_INVALID")) {
                    loginActivitySetupEmail.onPasscodeError(false);
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
                    loginActivitySetupEmail.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else if (tL_error.code != -1000) {
                    AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, sendverifyemailcode, loginActivitySetupEmail.requestPhone);
                }
            }
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivitySetupEmail.m3475$r8$lambda$NhKYOUS3TTyUv0drjcDsWZ0GHA(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void m3475$r8$lambda$NhKYOUS3TTyUv0drjcDsWZ0GHA(LoginActivitySetupEmail loginActivitySetupEmail) {
            loginActivitySetupEmail.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivitySetupEmail.inboxImageView.playAnimation();
            loginActivitySetupEmail.emailField.requestFocus();
            AndroidUtilities.showKeyboard(loginActivitySetupEmail.emailField);
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

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        public static void m3440$r8$lambda$JXbNUwOIGeBs88HcSuaOiqvqhw(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            boolean z = false;
            loginActivityEmailCodeView.postedErrorColorTimeout = false;
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    break;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
            if (loginActivityEmailCodeView.errorViewSwitcher.getCurrentView() != loginActivityEmailCodeView.resendFrameLayout) {
                loginActivityEmailCodeView.errorViewSwitcher.showNext();
                FrameLayout frameLayout = loginActivityEmailCodeView.cantAccessEmailFrameLayout;
                if (loginActivityEmailCodeView.resendCodeView.getVisibility() != 0 && LoginActivity.this.activityMode != 3 && !loginActivityEmailCodeView.isSetup) {
                    z = true;
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout, z, 1.0f, true);
            }
        }

        public LoginActivityEmailCodeView(final Context context, boolean z) {
            int i;
            super(context);
            this.errorColorTimeout = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3440$r8$lambda$JXbNUwOIGeBs88HcSuaOiqvqhw(this.f$0);
                }
            };
            this.resendCodeTimeout = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.showResendCodeView(true);
                }
            };
            this.updateResetPendingDateCallback = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.updateResetPendingDate();
                }
            };
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
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, false);
            this.confirmTextView = spoilersTextView;
            spoilersTextView.setTextSize(1, 14.0f);
            this.confirmTextView.setGravity(17);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 24, 8, 24, 0));
            CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                @Override
                protected void processNextPressed() {
                    LoginActivityEmailCodeView.this.onNextPressed(null);
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
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.googleg_standard_color_18);
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
            this.signInWithGoogleView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$dryLsq58iv0_RPXUqFrHg_5LorU(this.f$0, view);
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.cantAccessEmailFrameLayout = frameLayout2;
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, (LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true, 1.0f, false);
            TextView textView3 = new TextView(context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
                }
            };
            this.cantAccessEmailView = textView3;
            textView3.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
            this.cantAccessEmailView.setGravity(17);
            this.cantAccessEmailView.setTextSize(1, 14.0f);
            this.cantAccessEmailView.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.cantAccessEmailView.setMaxLines(2);
            this.cantAccessEmailView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$wVBcfI3f4yvar6WQqxWSKCEk07Q(this.f$0, context, view);
                }
            });
            this.cantAccessEmailFrameLayout.addView(this.cantAccessEmailView);
            TextView textView4 = new TextView(context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(Math.max(View.MeasureSpec.getSize(i3), AndroidUtilities.dp(100.0f)), Integer.MIN_VALUE));
                }
            };
            this.emailResetInView = textView4;
            textView4.setGravity(17);
            this.emailResetInView.setTextSize(1, 14.0f);
            this.emailResetInView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.emailResetInView.setMaxLines(3);
            this.emailResetInView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.requestEmailReset();
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
            this.resendCodeView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$c9i1S3v9tVSB4UnIHCJXbDH74_o(this.f$0, view);
                }
            });
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, false, 1.0f, false);
            LoginOrView loginOrView = new LoginOrView(context);
            this.loginOrView = loginOrView;
            VerticalPositionAutoAnimator.attach(loginOrView);
            this.errorViewSwitcher = new ViewSwitcher(context) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), Integer.MIN_VALUE));
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

        public static void $r8$lambda$dryLsq58iv0_RPXUqFrHg_5LorU(final LoginActivityEmailCodeView loginActivityEmailCodeView, View view) {
            loginActivityEmailCodeView.getClass();
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
                            LoginActivityEmailCodeView.this.onNextPressed(null);
                        } catch (ApiException e) {
                            FileLog.e(e);
                        }
                    }
                }
            }, NotificationCenter.onActivityResultReceived);
            final GoogleSignInClient client = GoogleSignIn.getClient(loginActivityEmailCodeView.getContext(), new GoogleSignInOptions.Builder().requestIdToken(BuildVars.GOOGLE_AUTH_CLIENT_ID).requestEmail().build());
            client.signOut().addOnCompleteListener(new OnCompleteListener() {
                @Override
                public final void onComplete(Task task) {
                    LoginActivity.LoginActivityEmailCodeView.m3438$r8$lambda$3iCNdFe34I7px8ksCdw3CXyjvQ(this.f$0, client, task);
                }
            });
        }

        public static void m3438$r8$lambda$3iCNdFe34I7px8ksCdw3CXyjvQ(LoginActivityEmailCodeView loginActivityEmailCodeView, GoogleSignInClient googleSignInClient, Task task) {
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            LoginActivity.this.getParentActivity().startActivityForResult(googleSignInClient.getSignInIntent(), 200);
        }

        public static void $r8$lambda$wVBcfI3f4yvar6WQqxWSKCEk07Q(final LoginActivityEmailCodeView loginActivityEmailCodeView, Context context, View view) {
            String string = loginActivityEmailCodeView.currentParams.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int iLastIndexOf = string.lastIndexOf(42);
            if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                textStyleRun.flags |= 256;
                textStyleRun.start = iIndexOf;
                int i = iLastIndexOf + 1;
                textStyleRun.end = i;
                spannableStringBuilder.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i, 0);
            }
            new AlertDialog.Builder(context).setTitle(LocaleController.getString(R.string.LoginEmailResetTitle)).setMessage(AndroidUtilities.formatSpannable(AndroidUtilities.replaceTags(LocaleController.getString(R.string.LoginEmailResetMessage)), spannableStringBuilder, loginActivityEmailCodeView.getTimePattern(loginActivityEmailCodeView.resetAvailablePeriod))).setPositiveButton(LocaleController.getString(R.string.LoginEmailResetButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    LoginActivity.LoginActivityEmailCodeView.m3448$r8$lambda$vE_NePmZOlm7EoNOQmwINm8Fvg(this.f$0, alertDialog, i2);
                }
            }).setNegativeButton(LocaleController.getString(R.string.Cancel), null).show();
        }

        public static void m3448$r8$lambda$vE_NePmZOlm7EoNOQmwINm8Fvg(final LoginActivityEmailCodeView loginActivityEmailCodeView, AlertDialog alertDialog, int i) {
            loginActivityEmailCodeView.getClass();
            final Bundle bundle = new Bundle();
            bundle.putString("phone", loginActivityEmailCodeView.phone);
            bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
            bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
            final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = loginActivityEmailCodeView.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = loginActivityEmailCodeView.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.m3439$r8$lambda$6DZFoSiNBhGKvlTqKBxsFtQ_qo(this.f$0, bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        public static void m3439$r8$lambda$6DZFoSiNBhGKvlTqKBxsFtQ_qo(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$Vty85d_PqpMwPW5A5rHcMn6LAGs(this.f$0, tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        public static void $r8$lambda$Vty85d_PqpMwPW5A5rHcMn6LAGs(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            loginActivityEmailCodeView.getClass();
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                TLRPC.auth_SentCodeType auth_sentcodetype = tL_auth_sentCode.type;
                if (auth_sentcodetype instanceof TLRPC.TL_auth_sentCodeTypeEmailCode) {
                    auth_sentcodetype.email_pattern = loginActivityEmailCodeView.currentParams.getString("emailPattern");
                    loginActivityEmailCodeView.resetRequestPending = true;
                }
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (!str.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            loginActivityEmailCodeView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
        }

        public static void $r8$lambda$c9i1S3v9tVSB4UnIHCJXbDH74_o(final LoginActivityEmailCodeView loginActivityEmailCodeView, View view) {
            if (loginActivityEmailCodeView.resendCodeView.getVisibility() == 0 && loginActivityEmailCodeView.resendCodeView.getAlpha() == 1.0f) {
                loginActivityEmailCodeView.showResendCodeView(false);
                final TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivityEmailCodeView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivityEmailCodeView.phoneHash;
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivityEmailCodeView.phone);
                bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$4_dEnDdbPw0R5IepiP0RyIbXw0k(this.f$0, bundle, tL_auth_resendCode, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static void $r8$lambda$4_dEnDdbPw0R5IepiP0RyIbXw0k(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resendCode tL_auth_resendCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3446$r8$lambda$ivlqSIYxesPGOXTFWggkpR1vm8(this.f$0, tLObject, bundle, tL_error, tL_auth_resendCode);
                }
            });
        }

        public static void m3446$r8$lambda$ivlqSIYxesPGOXTFWggkpR1vm8(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resendCode tL_auth_resendCode) {
            loginActivityEmailCodeView.getClass();
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                if (tL_error == null || tL_error.text == null) {
                    return;
                }
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resendCode, new Object[0]);
            }
        }

        public void requestEmailReset() {
            if (this.requestingEmailReset) {
                return;
            }
            this.requestingEmailReset = true;
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
            tL_auth_resetLoginEmail.phone_number = this.requestPhone;
            tL_auth_resetLoginEmail.phone_code_hash = this.phoneHash;
            LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$K6ZtIJuqm2PQaJ0UfSczYknDJGE(this.f$0, bundle, tL_auth_resetLoginEmail, tLObject, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$K6ZtIJuqm2PQaJ0UfSczYknDJGE(final LoginActivityEmailCodeView loginActivityEmailCodeView, final Bundle bundle, final TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3445$r8$lambda$_GqVJsdesYalmDNLVYYEqgG5LY(this.f$0, tLObject, bundle, tL_error, tL_auth_resetLoginEmail);
                }
            });
        }

        public static void m3445$r8$lambda$_GqVJsdesYalmDNLVYYEqgG5LY(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error, TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail) {
            String str;
            if (LoginActivity.this.getParentActivity() == null) {
                return;
            }
            loginActivityEmailCodeView.requestingEmailReset = false;
            if (tLObject instanceof TLRPC.TL_auth_sentCode) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
                return;
            }
            if (tL_error == null || (str = tL_error.text) == null) {
                return;
            }
            if (str.contains("TASK_ALREADY_EXISTS")) {
                new AlertDialog.Builder(loginActivityEmailCodeView.getContext()).setTitle(LocaleController.getString(R.string.LoginEmailResetPremiumRequiredTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.LoginEmailResetPremiumRequiredMessage, LocaleController.addNbsp(PhoneFormat.getInstance().format("+" + loginActivityEmailCodeView.requestPhone))))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                return;
            }
            if (!tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                AlertsCreator.processError(((BaseFragment) LoginActivity.this).currentAccount, tL_error, LoginActivity.this, tL_auth_resetLoginEmail, new Object[0]);
                return;
            }
            loginActivityEmailCodeView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            TextView textView = this.confirmTextView;
            int i = Theme.key_windowBackgroundWhiteGrayText6;
            textView.setTextColor(Theme.getColor(i));
            TextView textView2 = this.signInWithGoogleView;
            int i2 = Theme.key_windowBackgroundWhiteBlueText4;
            textView2.setTextColor(Theme.getColor(i2));
            this.loginOrView.updateColors();
            this.resendCodeView.setTextColor(Theme.getColor(i2));
            this.cantAccessEmailView.setTextColor(Theme.getColor(i2));
            this.emailResetInView.setTextColor(Theme.getColor(i));
            this.wrongCodeView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
            this.codeFieldContainer.invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
            removeCallbacks(this.resendCodeTimeout);
        }

        public void showResendCodeView(boolean z) {
            AndroidUtilities.updateViewVisibilityAnimated(this.resendCodeView, z);
            AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, (z || LoginActivity.this.activityMode == 3 || this.isSetup) ? false : true);
            if (this.loginOrView.getVisibility() != 8) {
                this.loginOrView.setLayoutParams(LayoutHelper.createFrame(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
                this.loginOrView.requestLayout();
            }
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString(R.string.VerificationCode);
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
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        if (LoginActivityEmailCodeView.this.postedErrorColorTimeout) {
                            LoginActivityEmailCodeView loginActivityEmailCodeView = LoginActivityEmailCodeView.this;
                            loginActivityEmailCodeView.removeCallbacks(loginActivityEmailCodeView.errorColorTimeout);
                            LoginActivityEmailCodeView.this.errorColorTimeout.run();
                        }
                    }
                });
                codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z2) {
                        LoginActivity.LoginActivityEmailCodeView.$r8$lambda$KlYesQ3ywiwQcIlKoe1rNFVG6Kw(this.f$0, view, z2);
                    }
                });
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

        public static void $r8$lambda$KlYesQ3ywiwQcIlKoe1rNFVG6Kw(LoginActivityEmailCodeView loginActivityEmailCodeView, View view, boolean z) {
            if (!z) {
                loginActivityEmailCodeView.getClass();
            } else {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        @Override
        public void onHide() {
            super.onHide();
            if (this.resetPendingDate != 0) {
                AndroidUtilities.cancelRunOnUIThread(this.updateResetPendingDateCallback);
            }
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

        public void updateResetPendingDate() {
            int iCurrentTimeMillis = (int) (((long) this.resetPendingDate) - (System.currentTimeMillis() / 1000));
            if (this.resetPendingDate <= 0 || iCurrentTimeMillis <= 0) {
                this.emailResetInView.setVisibility(0);
                this.emailResetInView.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.requestEmailReset();
                    }
                }, 1000L);
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
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$UN1AEM9BLdVnd9AjBoCj8hUgMQo(this.f$0);
                }
            });
        }

        public static void $r8$lambda$UN1AEM9BLdVnd9AjBoCj8hUgMQo(final LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.getClass();
            loginActivityEmailCodeView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3444$r8$lambda$XCalTS1RX8_QjxqMrlDog1Dfr4(this.f$0);
                }
            }, 150L);
            loginActivityEmailCodeView.removeCallbacks(loginActivityEmailCodeView.errorColorTimeout);
            loginActivityEmailCodeView.postDelayed(loginActivityEmailCodeView.errorColorTimeout, 3000L);
            loginActivityEmailCodeView.postedErrorColorTimeout = true;
        }

        public static void m3444$r8$lambda$XCalTS1RX8_QjxqMrlDog1Dfr4(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override
        public void onNextPressed(String str) {
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
            final String code = this.codeFieldContainer.getCode();
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
                    tL_emailVerificationGoogle.token = this.googleAccount.getIdToken();
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
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$dqSoH07sEuzM_DjXcgIVyOrtv38(this.f$0, code, tLObject2, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$dqSoH07sEuzM_DjXcgIVyOrtv38(final LoginActivityEmailCodeView loginActivityEmailCodeView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3441$r8$lambda$LfTtP1qOd7ME5zvpVnO_Vdz628(this.f$0, tL_error, str, tLObject);
                }
            });
        }

        public static void m3441$r8$lambda$LfTtP1qOd7ME5zvpVnO_Vdz628(final LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, final String str, final TLObject tLObject) {
            CodeNumberField[] codeNumberFieldArr;
            LoginActivity.this.needHideProgress(false);
            if (tL_error == null) {
                loginActivityEmailCodeView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                final Bundle bundle = new Bundle();
                bundle.putString("phone", loginActivityEmailCodeView.phone);
                bundle.putString("ephone", loginActivityEmailCodeView.emailPhone);
                bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
                bundle.putString("phoneHash", loginActivityEmailCodeView.phoneHash);
                bundle.putString("code", str);
                if (tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired) {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    loginActivityEmailCodeView.animateSuccess(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.this.setPage(5, true, bundle, false);
                        }
                    });
                } else {
                    loginActivityEmailCodeView.animateSuccess(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.m3442$r8$lambda$RLZpnb9fB9e5mN_NCIPpNmkkVc(this.f$0, tLObject, bundle);
                        }
                    });
                }
            } else if (tL_error.text.contains("SESSION_PASSWORD_NEEDED")) {
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        LoginActivity.LoginActivityEmailCodeView.m3437$r8$lambda$EFtpRRnoBzzFqJXgRTlz37aZcs(this.f$0, str, tLObject2, tL_error2);
                    }
                }, 10);
            } else {
                loginActivityEmailCodeView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                if (tL_error.text.contains("EMAIL_ADDRESS_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailAddressInvalid));
                } else if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                } else if (tL_error.text.contains("CODE_EMPTY") || tL_error.text.contains("CODE_INVALID") || tL_error.text.contains("EMAIL_CODE_INVALID") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                    loginActivityEmailCodeView.shakeWrongCode();
                } else if (tL_error.text.contains("EMAIL_TOKEN_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.EmailTokenInvalid));
                } else if (tL_error.text.contains("EMAIL_VERIFY_EXPIRED")) {
                    loginActivityEmailCodeView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                }
                if (loginActivityEmailCodeView.codeFieldContainer.codeField != null) {
                    int i = 0;
                    while (true) {
                        codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                        if (i >= codeNumberFieldArr.length) {
                            break;
                        }
                        codeNumberFieldArr[i].setText("");
                        i++;
                    }
                    codeNumberFieldArr[0].requestFocus();
                }
                loginActivityEmailCodeView.codeFieldContainer.isFocusSuppressed = false;
            }
            loginActivityEmailCodeView.googleAccount = null;
        }

        public static void m3442$r8$lambda$RLZpnb9fB9e5mN_NCIPpNmkkVc(LoginActivityEmailCodeView loginActivityEmailCodeView, TLObject tLObject, Bundle bundle) {
            loginActivityEmailCodeView.getClass();
            if ((tLObject instanceof TL_account.TL_emailVerified) && LoginActivity.this.activityMode == 3) {
                LoginActivity.this.finishFragment();
                LoginActivity.this.emailChangeFinishCallback.run();
            } else if (tLObject instanceof TL_account.TL_emailVerifiedLogin) {
                LoginActivity.this.fillNextCodeParams(bundle, ((TL_account.TL_emailVerifiedLogin) tLObject).sent_code);
            } else if (tLObject instanceof TLRPC.TL_auth_authorization) {
                LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
            }
        }

        public static void m3437$r8$lambda$EFtpRRnoBzzFqJXgRTlz37aZcs(final LoginActivityEmailCodeView loginActivityEmailCodeView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityEmailCodeView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.m3443$r8$lambda$VeY6r7pyJdx6Kmqm6M7BN38nGs(this.f$0, tL_error, tLObject, str);
                }
            });
        }

        public static void m3443$r8$lambda$VeY6r7pyJdx6Kmqm6M7BN38nGs(final LoginActivityEmailCodeView loginActivityEmailCodeView, TLRPC.TL_error tL_error, TLObject tLObject, String str) {
            loginActivityEmailCodeView.nextPressed = false;
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
            final Bundle bundle = new Bundle();
            SerializedData serializedData = new SerializedData(password.getObjectSize());
            password.serializeToStream(serializedData);
            bundle.putString("password", Utilities.bytesToHex(serializedData.toByteArray()));
            bundle.putString("phoneFormated", loginActivityEmailCodeView.requestPhone);
            bundle.putString("phoneHash", loginActivityEmailCodeView.phoneHash);
            bundle.putString("code", str);
            loginActivityEmailCodeView.animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.this.setPage(6, true, bundle, false);
                }
            });
        }

        private void animateSuccess(final Runnable runnable) {
            if (this.googleAccount != null) {
                runnable.run();
                return;
            }
            final int i = 0;
            while (true) {
                CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
                if (i < codeFieldContainer.codeField.length) {
                    codeFieldContainer.postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.codeFieldContainer.codeField[i].animateSuccessProgress(1.0f);
                        }
                    }, ((long) i) * 75);
                    i++;
                } else {
                    codeFieldContainer.postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.LoginActivityEmailCodeView.$r8$lambda$I8d6kJKSbzdPSTGbHEmztieMo4c(this.f$0, runnable);
                        }
                    }, (((long) this.codeFieldContainer.codeField.length) * 75) + 400);
                    return;
                }
            }
        }

        public static void $r8$lambda$I8d6kJKSbzdPSTGbHEmztieMo4c(LoginActivityEmailCodeView loginActivityEmailCodeView, Runnable runnable) {
            int i = 0;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i < codeNumberFieldArr.length) {
                    codeNumberFieldArr[i].animateSuccessProgress(0.0f);
                    i++;
                } else {
                    runnable.run();
                    loginActivityEmailCodeView.codeFieldContainer.isFocusSuppressed = false;
                    return;
                }
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
            if (this.errorViewSwitcher.getCurrentView() == this.resendFrameLayout) {
                this.errorViewSwitcher.showNext();
                AndroidUtilities.updateViewVisibilityAnimated(this.cantAccessEmailFrameLayout, false, 1.0f, true);
            }
            this.codeFieldContainer.codeField[0].requestFocus();
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 10.0f, new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$u97Sjf9PHo4sp2z91ZHS4B_1f70(this.f$0);
                }
            });
            removeCallbacks(this.errorColorTimeout);
            postDelayed(this.errorColorTimeout, 5000L);
            this.postedErrorColorTimeout = true;
        }

        public static void $r8$lambda$u97Sjf9PHo4sp2z91ZHS4B_1f70(final LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.getClass();
            loginActivityEmailCodeView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityEmailCodeView.$r8$lambda$puenDNv2suVuV4Qv6wLRtLn6AkQ(this.f$0);
                }
            }, 150L);
        }

        public static void $r8$lambda$puenDNv2suVuV4Qv6wLRtLn6AkQ(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityEmailCodeView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override
        public void onShow() {
            super.onShow();
            if (this.resetRequestPending) {
                this.resetRequestPending = false;
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivityEmailCodeView.m3447$r8$lambda$jywRvzP5QMFuihc_Mv68VLQHhU(this.f$0);
                    }
                }, LoginActivity.SHOW_DELAY);
            }
        }

        public static void m3447$r8$lambda$jywRvzP5QMFuihc_Mv68VLQHhU(LoginActivityEmailCodeView loginActivityEmailCodeView) {
            loginActivityEmailCodeView.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivityEmailCodeView.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = loginActivityEmailCodeView.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.codeField == null) {
                return;
            }
            codeFieldContainer.setText("");
            loginActivityEmailCodeView.codeFieldContainer.codeField[0].requestFocus();
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

        @Override
        public boolean hasCustomKeyboard() {
            return true;
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        public static void $r8$lambda$_WPo86BsOX6OBu7X1KurpZdt1_w(LoginActivityRecoverView loginActivityRecoverView) {
            int i = 0;
            loginActivityRecoverView.postedErrorColorTimeout = false;
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityRecoverView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        public LoginActivityRecoverView(Context context) {
            int i;
            super(context);
            this.errorColorTimeout = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$_WPo86BsOX6OBu7X1KurpZdt1_w(this.f$0);
                }
            };
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
                protected void processNextPressed() {
                    LoginActivityRecoverView.this.onNextPressed(null);
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
                    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    }

                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                        if (LoginActivityRecoverView.this.postedErrorColorTimeout) {
                            LoginActivityRecoverView loginActivityRecoverView = LoginActivityRecoverView.this;
                            loginActivityRecoverView.removeCallbacks(loginActivityRecoverView.errorColorTimeout);
                            LoginActivityRecoverView.this.errorColorTimeout.run();
                        }
                    }
                });
                codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        LoginActivity.LoginActivityRecoverView.m3465$r8$lambda$9FTO_tedF8MpnRFt7EbQtksig4(this.f$0, view, z);
                    }
                });
            }
            addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, 42, 1, 0, 32, 0, 0));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context, false);
            this.troubleButton = spoilersTextView;
            spoilersTextView.setGravity(17);
            this.troubleButton.setTextSize(1, 14.0f);
            this.troubleButton.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.troubleButton.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.troubleButton.setMaxLines(2);
            this.troubleButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityRecoverView.m3466$r8$lambda$LBliBZMZQH0Mj0dmUnRe_L4_g0(this.f$0, view);
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(this.troubleButton, LayoutHelper.createFrame(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, 0, 1.0f));
            VerticalPositionAutoAnimator.attach(this.troubleButton);
        }

        public static void m3465$r8$lambda$9FTO_tedF8MpnRFt7EbQtksig4(LoginActivityRecoverView loginActivityRecoverView, View view, boolean z) {
            if (!z) {
                loginActivityRecoverView.getClass();
            } else {
                LoginActivity.this.keyboardView.setEditText((EditText) view);
                LoginActivity.this.keyboardView.setDispatchBackWhenEmpty(true);
            }
        }

        public static void m3466$r8$lambda$LBliBZMZQH0Mj0dmUnRe_L4_g0(final LoginActivityRecoverView loginActivityRecoverView, View view) {
            Dialog dialogShowDialog = LoginActivity.this.showDialog(new AlertDialog.Builder(LoginActivity.this.getParentActivity()).setTitle(LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle)).setMessage(LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText)).setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.this.setPage(6, true, new Bundle(), true);
                }
            }).setNegativeButton(LocaleController.getString(R.string.ResetAccount), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRecoverView loginActivityRecoverView2 = this.f$0;
                    LoginActivity.this.tryResetAccount(loginActivityRecoverView2.requestPhone, loginActivityRecoverView2.phoneHash, loginActivityRecoverView2.phoneCode);
                }
            }).create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
            }
        }

        @Override
        public void updateColors() {
            this.titleView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            this.troubleButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.codeFieldContainer.invalidate();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            removeCallbacks(this.errorColorTimeout);
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("LoginPassword", R.string.LoginPassword);
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
            AndroidUtilities.shakeViewSpring(this.codeFieldContainer, new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.m3467$r8$lambda$Ox2N2YG1FFZKspIT7IH10aZhnk(this.f$0);
                }
            });
        }

        public static void m3467$r8$lambda$Ox2N2YG1FFZKspIT7IH10aZhnk(final LoginActivityRecoverView loginActivityRecoverView) {
            loginActivityRecoverView.getClass();
            loginActivityRecoverView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$kqzd6hXmjOZ5IhhGe_aF18tuR0s(this.f$0);
                }
            }, 150L);
            loginActivityRecoverView.removeCallbacks(loginActivityRecoverView.errorColorTimeout);
            loginActivityRecoverView.postDelayed(loginActivityRecoverView.errorColorTimeout, 3000L);
            loginActivityRecoverView.postedErrorColorTimeout = true;
        }

        public static void $r8$lambda$kqzd6hXmjOZ5IhhGe_aF18tuR0s(LoginActivityRecoverView loginActivityRecoverView) {
            CodeFieldContainer codeFieldContainer = loginActivityRecoverView.codeFieldContainer;
            int i = 0;
            codeFieldContainer.isFocusSuppressed = false;
            codeFieldContainer.codeField[0].requestFocus();
            while (true) {
                CodeNumberField[] codeNumberFieldArr = loginActivityRecoverView.codeFieldContainer.codeField;
                if (i >= codeNumberFieldArr.length) {
                    return;
                }
                codeNumberFieldArr[i].animateErrorProgress(0.0f);
                i++;
            }
        }

        @Override
        public void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            codeFieldContainer.isFocusSuppressed = true;
            for (CodeNumberField codeNumberField : codeFieldContainer.codeField) {
                codeNumberField.animateFocusedProgress(0.0f);
            }
            final String code = this.codeFieldContainer.getCode();
            if (code.length() == 0) {
                onPasscodeError(false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
            tL_auth_checkRecoveryPassword.code = code;
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$jmnhJDSk2HULcYlNfuVOsuhOx2c(this.f$0, code, tLObject, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$jmnhJDSk2HULcYlNfuVOsuhOx2c(final LoginActivityRecoverView loginActivityRecoverView, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityRecoverView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.$r8$lambda$4QMxkQz95tbwuTwZ1D1XGBaHSzc(this.f$0, tLObject, str, tL_error);
                }
            });
        }

        public static void $r8$lambda$4QMxkQz95tbwuTwZ1D1XGBaHSzc(LoginActivityRecoverView loginActivityRecoverView, TLObject tLObject, String str, TLRPC.TL_error tL_error) {
            String pluralString;
            LoginActivity.this.needHideProgress(false);
            loginActivityRecoverView.nextPressed = false;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", str);
                bundle.putString("password", loginActivityRecoverView.passwordString);
                LoginActivity.this.setPage(9, true, bundle, false);
                return;
            }
            if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
                loginActivityRecoverView.onPasscodeError(true);
                return;
            }
            if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                return;
            }
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRecoverView.m3469$r8$lambda$pkQsUE3zKPoxGfeBmdXAeQeUiY(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void m3469$r8$lambda$pkQsUE3zKPoxGfeBmdXAeQeUiY(LoginActivityRecoverView loginActivityRecoverView) {
            loginActivityRecoverView.inboxImageView.getAnimatedDrawable().setCurrentFrame(0, false);
            loginActivityRecoverView.inboxImageView.playAnimation();
            CodeFieldContainer codeFieldContainer = loginActivityRecoverView.codeFieldContainer;
            if (codeFieldContainer != null) {
                codeFieldContainer.codeField[0].requestFocus();
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

        @Override
        public boolean needBackButton() {
            return true;
        }

        public LoginActivityNewPasswordView(Context context, int i) {
            int i2;
            super(context);
            this.currentStage = i;
            setOrientation(1);
            int i3 = i == 1 ? 1 : 2;
            this.codeField = new EditTextBoldCursor[i3];
            this.outlineFields = new OutlineTextContainerView[i3];
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
            textView2.setTextSize(1, 16.0f);
            this.confirmTextView.setGravity(1);
            this.confirmTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            addView(this.confirmTextView, LayoutHelper.createLinear(-2, -2, 1, 8, 6, 8, 16));
            final int i4 = 0;
            while (i4 < this.codeField.length) {
                final OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineFields[i4] = outlineTextContainerView;
                if (i == 0) {
                    i2 = i4 == 0 ? R.string.PleaseEnterNewFirstPasswordHint : R.string.PleaseEnterNewSecondPasswordHint;
                } else {
                    i2 = R.string.PasswordHintPlaceholder;
                }
                outlineTextContainerView.setText(LocaleController.getString(i2));
                this.codeField[i4] = new EditTextBoldCursor(context);
                this.codeField[i4].setCursorSize(AndroidUtilities.dp(20.0f));
                this.codeField[i4].setCursorWidth(1.5f);
                this.codeField[i4].setImeOptions(268435461);
                this.codeField[i4].setTextSize(1, f);
                this.codeField[i4].setMaxLines(1);
                this.codeField[i4].setBackground(null);
                int iDp = AndroidUtilities.dp(16.0f);
                this.codeField[i4].setPadding(iDp, iDp, iDp, iDp);
                if (i == 0) {
                    this.codeField[i4].setInputType(129);
                    this.codeField[i4].setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                this.codeField[i4].setTypeface(Typeface.DEFAULT);
                this.codeField[i4].setGravity(LocaleController.isRTL ? 5 : 3);
                EditTextBoldCursor editTextBoldCursor = this.codeField[i4];
                final boolean z = i4 == 0 && i == 0;
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (z) {
                            if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() == 0 || TextUtils.isEmpty(editable)) {
                                if (LoginActivityNewPasswordView.this.passwordButton.getVisibility() == 8 || !TextUtils.isEmpty(editable)) {
                                    return;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, false, 0.1f, true);
                                return;
                            }
                            if (LoginActivityNewPasswordView.this.isPasswordVisible) {
                                LoginActivityNewPasswordView.this.passwordButton.callOnClick();
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(LoginActivityNewPasswordView.this.passwordButton, true, 0.1f, true);
                        }
                    }
                });
                this.codeField[i4].setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z2) {
                        outlineTextContainerView.animateSelection(z2 ? 1.0f : 0.0f);
                    }
                });
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(0);
                    linearLayout.setGravity(16);
                    linearLayout.addView(this.codeField[i4], LayoutHelper.createLinear(0, -2, 1.0f));
                    ImageView imageView = new ImageView(context);
                    this.passwordButton = imageView;
                    imageView.setImageResource(R.drawable.msg_message);
                    AndroidUtilities.updateViewVisibilityAnimated(this.passwordButton, true, 0.1f, false);
                    this.passwordButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            LoginActivity.LoginActivityNewPasswordView.$r8$lambda$XPHXvBBxN0_ooG71Y0YMlszcBlQ(this.f$0, view);
                        }
                    });
                    linearLayout.addView(this.passwordButton, LayoutHelper.createLinearRelatively(24.0f, 24.0f, 0, 0.0f, 0.0f, 14.0f, 0.0f));
                    outlineTextContainerView.addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f));
                } else {
                    outlineTextContainerView.addView(this.codeField[i4], LayoutHelper.createFrame(-1, -2.0f));
                }
                outlineTextContainerView.attachEditText(this.codeField[i4]);
                addView(outlineTextContainerView, LayoutHelper.createLinear(-1, -2, 1, 16, 16, 16, 0));
                this.codeField[i4].setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView3, int i5, KeyEvent keyEvent) {
                        return LoginActivity.LoginActivityNewPasswordView.$r8$lambda$2r2uKeE5ds9UTbM0EURDPD5TlzM(this.f$0, i4, textView3, i5, keyEvent);
                    }
                });
                i4++;
                f = 18.0f;
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
            this.cancelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$8eBmBfeWw1e6ju44Ut7J1ccSFxg(this.f$0, view);
                }
            });
        }

        public static void $r8$lambda$XPHXvBBxN0_ooG71Y0YMlszcBlQ(LoginActivityNewPasswordView loginActivityNewPasswordView, View view) {
            loginActivityNewPasswordView.isPasswordVisible = !loginActivityNewPasswordView.isPasswordVisible;
            int i = 0;
            while (true) {
                EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                if (i >= editTextBoldCursorArr.length) {
                    break;
                }
                int selectionStart = editTextBoldCursorArr[i].getSelectionStart();
                int selectionEnd = loginActivityNewPasswordView.codeField[i].getSelectionEnd();
                loginActivityNewPasswordView.codeField[i].setInputType((loginActivityNewPasswordView.isPasswordVisible ? 144 : 128) | 1);
                loginActivityNewPasswordView.codeField[i].setSelection(selectionStart, selectionEnd);
                i++;
            }
            loginActivityNewPasswordView.passwordButton.setTag(Boolean.valueOf(loginActivityNewPasswordView.isPasswordVisible));
            loginActivityNewPasswordView.passwordButton.setColorFilter(Theme.getColor(loginActivityNewPasswordView.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText));
        }

        public static boolean $r8$lambda$2r2uKeE5ds9UTbM0EURDPD5TlzM(LoginActivityNewPasswordView loginActivityNewPasswordView, int i, TextView textView, int i2, KeyEvent keyEvent) {
            if (i == 0) {
                EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
                if (editTextBoldCursorArr.length == 2) {
                    editTextBoldCursorArr[1].requestFocus();
                    return true;
                }
            }
            if (i2 == 5) {
                loginActivityNewPasswordView.onNextPressed(null);
                return true;
            }
            loginActivityNewPasswordView.getClass();
            return false;
        }

        public static void $r8$lambda$8eBmBfeWw1e6ju44Ut7J1ccSFxg(LoginActivityNewPasswordView loginActivityNewPasswordView, View view) {
            if (loginActivityNewPasswordView.currentStage == 0) {
                loginActivityNewPasswordView.recoverPassword(null, null);
            } else {
                loginActivityNewPasswordView.recoverPassword(loginActivityNewPasswordView.newPassword, null);
            }
        }

        @Override
        public void updateColors() {
            this.titleTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
            this.confirmTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText6));
            for (EditTextBoldCursor editTextBoldCursor : this.codeField) {
                editTextBoldCursor.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText));
                editTextBoldCursor.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
            }
            for (OutlineTextContainerView outlineTextContainerView : this.outlineFields) {
                outlineTextContainerView.updateColor();
            }
            this.cancelButton.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            ImageView imageView = this.passwordButton;
            if (imageView != null) {
                imageView.setColorFilter(Theme.getColor(this.isPasswordVisible ? Theme.key_windowBackgroundWhiteInputFieldActivated : Theme.key_windowBackgroundWhiteHintText));
                this.passwordButton.setBackground(Theme.createSelectorDrawable(LoginActivity.this.getThemedColor(Theme.key_listSelector), 1));
            }
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
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

        @Override
        public void onNextPressed(String str) {
            if (this.nextPressed) {
                return;
            }
            String string = this.codeField[0].getText().toString();
            if (string.length() == 0) {
                onPasscodeError(false, 0);
                return;
            }
            if (this.currentStage == 0) {
                if (!string.equals(this.codeField[1].getText().toString())) {
                    onPasscodeError(false, 1);
                    return;
                }
                Bundle bundle = new Bundle();
                bundle.putString("emailCode", this.emailCode);
                bundle.putString("new_password", string);
                bundle.putString("password", this.passwordString);
                LoginActivity.this.setPage(10, true, bundle, false);
                return;
            }
            this.nextPressed = true;
            LoginActivity.this.needShowProgress(0);
            recoverPassword(this.newPassword, string);
        }

        private void recoverPassword(final String str, final String str2) {
            final TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            if (!TextUtils.isEmpty(str)) {
                tL_auth_recoverPassword.flags |= 1;
                TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
                tL_auth_recoverPassword.new_settings = passwordinputsettings;
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = str2 != null ? str2 : "";
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            Utilities.globalQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.m3451$r8$lambda$4MWa4jQ4NR8_4V6vjmE3WyGL5g(this.f$0, str, str2, tL_auth_recoverPassword);
                }
            });
        }

        public static void m3451$r8$lambda$4MWa4jQ4NR8_4V6vjmE3WyGL5g(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword) {
            loginActivityNewPasswordView.getClass();
            byte[] stringBytes = str != null ? AndroidUtilities.getStringBytes(str) : null;
            RequestDelegate requestDelegate = new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$L6rgYxDNLk2Sl6TTubKNFKMdUo8(this.f$0, str, str2, tLObject, tL_error);
                }
            };
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = loginActivityNewPasswordView.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    tL_auth_recoverPassword.new_settings.new_password_hash = SRPHelper.getVBytes(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
                    if (tL_auth_recoverPassword.new_settings.new_password_hash == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        requestDelegate.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_recoverPassword, requestDelegate, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tL_error2);
        }

        public static void $r8$lambda$L6rgYxDNLk2Sl6TTubKNFKMdUo8(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityNewPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.m3450$r8$lambda$3P9NGSFXdTu5ZTNLliyNE85tDI(this.f$0, tL_error, str, str2, tLObject);
                }
            });
        }

        public static void m3450$r8$lambda$3P9NGSFXdTu5ZTNLliyNE85tDI(final LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, final String str, final String str2, final TLObject tLObject) {
            String pluralString;
            if (tL_error != null) {
                loginActivityNewPasswordView.getClass();
                if ("SRP_ID_INVALID".equals(tL_error.text) || "NEW_SALT_INVALID".equals(tL_error.text)) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivityNewPasswordView.$r8$lambda$jJCIuh8Vgot_1oWZeGoaiqiQA60(this.f$0, str, str2, tLObject2, tL_error2);
                        }
                    }, 8);
                    return;
                }
            }
            LoginActivity.this.needHideProgress(false);
            if (tLObject instanceof TLRPC.auth_Authorization) {
                AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
                builder.setPositiveButton(LocaleController.getString(R.string.Continue), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                    }
                });
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
                    return;
                }
                return;
            }
            if (tL_error != null) {
                loginActivityNewPasswordView.nextPressed = false;
                if (!tL_error.text.startsWith("FLOOD_WAIT")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (iIntValue < 60) {
                    pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                }
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
            }
        }

        public static void $r8$lambda$jJCIuh8Vgot_1oWZeGoaiqiQA60(final LoginActivityNewPasswordView loginActivityNewPasswordView, final String str, final String str2, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityNewPasswordView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$SKzM07cQej449NtO9wXpvFE1bCQ(this.f$0, tL_error, tLObject, str, str2);
                }
            });
        }

        public static void $r8$lambda$SKzM07cQej449NtO9wXpvFE1bCQ(LoginActivityNewPasswordView loginActivityNewPasswordView, TLRPC.TL_error tL_error, TLObject tLObject, String str, String str2) {
            loginActivityNewPasswordView.getClass();
            if (tL_error == null) {
                TL_account.Password password = (TL_account.Password) tLObject;
                loginActivityNewPasswordView.currentPassword = password;
                TwoStepVerificationActivity.initPasswordNewAlgo(password);
                loginActivityNewPasswordView.recoverPassword(str, str2);
            }
        }

        @Override
        public boolean onBackPressed(boolean z) {
            LoginActivity.this.needHideProgress(true);
            this.currentParams = null;
            this.nextPressed = false;
            return true;
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityNewPasswordView.$r8$lambda$NND6V5VLrRxWRCOJ0SK1TJKFz7g(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void $r8$lambda$NND6V5VLrRxWRCOJ0SK1TJKFz7g(LoginActivityNewPasswordView loginActivityNewPasswordView) {
            EditTextBoldCursor[] editTextBoldCursorArr = loginActivityNewPasswordView.codeField;
            if (editTextBoldCursorArr != null) {
                editTextBoldCursorArr[0].requestFocus();
                EditTextBoldCursor editTextBoldCursor = loginActivityNewPasswordView.codeField[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                AndroidUtilities.showKeyboard(loginActivityNewPasswordView.codeField[0]);
            }
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_params" + this.currentStage, this.currentParams);
            }
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_params" + this.currentStage);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
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

        @Override
        public boolean canFinishFragment() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$canFinishFragment(this);
        }

        @Override
        public void didStartUpload(boolean z, boolean z2) {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didStartUpload(this, z, z2);
        }

        @Override
        public void didUploadFailed() {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$didUploadFailed(this);
        }

        @Override
        public PhotoViewer.PlaceProviderObject getCloseIntoObject() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getCloseIntoObject(this);
        }

        @Override
        public String getInitialSearchString() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$getInitialSearchString(this);
        }

        @Override
        public boolean needBackButton() {
            return true;
        }

        @Override
        public void onUploadProgressChanged(float f) {
            ImageUpdater.ImageUpdaterDelegate.CC.$default$onUploadProgressChanged(this, f);
        }

        @Override
        public boolean supportsBulletin() {
            return ImageUpdater.ImageUpdaterDelegate.CC.$default$supportsBulletin(this);
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
                LoginActivityRegisterView.this.showTermsOfService(false);
            }
        }

        public void showTermsOfService(boolean z) {
            if (LoginActivity.this.currentTermsOfService == null) {
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            if (z) {
                builder.setPositiveButton(LocaleController.getString("Accept", R.string.Accept), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.$r8$lambda$rIcdV2sR8XWBUwPip_f0z7dIk6o(this.f$0, alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        LoginActivity.LoginActivityRegisterView.$r8$lambda$AFO6k8IADV71mlR2RwCY0fbq_dU(this.f$0, alertDialog, i);
                    }
                });
            } else {
                builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LoginActivity.this.currentTermsOfService.text);
            MessageObject.addEntitiesToText(spannableStringBuilder, LoginActivity.this.currentTermsOfService.entities, false, false, false, false);
            builder.setMessage(spannableStringBuilder);
            LoginActivity.this.showDialog(builder.create());
        }

        public static void $r8$lambda$rIcdV2sR8XWBUwPip_f0z7dIk6o(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            loginActivityRegisterView.onNextPressed(null);
        }

        public static void $r8$lambda$AFO6k8IADV71mlR2RwCY0fbq_dU(final LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString("TermsOfService", R.string.TermsOfService));
            builder.setMessage(LocaleController.getString("TosDecline", R.string.TosDecline));
            builder.setPositiveButton(LocaleController.getString("SignUp", R.string.SignUp), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$8cdFNTt4qn_ULPTp4GnEAYgiW9w(this.f$0, alertDialog2, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Decline", R.string.Decline), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog2, int i2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$1KtzzPDE6V09fl6JdbRSlQIeZ0c(this.f$0, alertDialog2, i2);
                }
            });
            LoginActivity.this.showDialog(builder.create());
        }

        public static void $r8$lambda$8cdFNTt4qn_ULPTp4GnEAYgiW9w(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            LoginActivity.this.currentTermsOfService.popup = false;
            loginActivityRegisterView.onNextPressed(null);
        }

        public static void $r8$lambda$1KtzzPDE6V09fl6JdbRSlQIeZ0c(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            loginActivityRegisterView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
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
                protected void onDraw(Canvas canvas) {
                    if (LoginActivityRegisterView.this.avatarImage == null || LoginActivityRegisterView.this.avatarProgressView.getVisibility() != 0) {
                        return;
                    }
                    paint.setAlpha((int) (LoginActivityRegisterView.this.avatarImage.getImageReceiver().getCurrentAlpha() * 85.0f * LoginActivityRegisterView.this.avatarProgressView.getAlpha()));
                    canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, getMeasuredWidth() / 2.0f, paint);
                }
            };
            this.avatarOverlay = view;
            frameLayout.addView(view, LayoutHelper.createFrame(-1, -1.0f));
            this.avatarOverlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$JN6oYOQBmfyOTr0Kpi0h0xBSj2E(this.f$0, view2);
                }
            });
            int i = R.raw.camera;
            this.cameraDrawable = new RLottieDrawable(i, String.valueOf(i), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            int i2 = R.raw.camera_wait;
            this.cameraWaitDrawable = new RLottieDrawable(i2, String.valueOf(i2), AndroidUtilities.dp(70.0f), AndroidUtilities.dp(70.0f), false, null);
            RLottieImageView rLottieImageView = new RLottieImageView(context) {
                @Override
                public void invalidate(int i3, int i4, int i5, int i6) {
                    super.invalidate(i3, i4, i5, i6);
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
            this.firstNameField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view2, boolean z) {
                    this.f$0.firstNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
                }
            });
            this.firstNameField.setBackground(null);
            this.firstNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.firstNameOutlineView.attachEditText(this.firstNameField);
            this.firstNameOutlineView.addView(this.firstNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.firstNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityRegisterView.$r8$lambda$U_jebr_R60OuGoYvYnIyPDnBkiU(this.f$0, textView3, i3, keyEvent);
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
            this.lastNameField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view2, boolean z) {
                    this.f$0.lastNameOutlineView.animateSelection(z ? 1.0f : 0.0f);
                }
            });
            this.lastNameField.setBackground(null);
            this.lastNameField.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            this.lastNameOutlineView.attachEditText(this.lastNameField);
            this.lastNameOutlineView.addView(this.lastNameField, LayoutHelper.createFrame(-1, -2, 48));
            this.lastNameField.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView3, int i3, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityRegisterView.$r8$lambda$hUxQIPwUaurUw__ZhHNkOa40gP4(this.f$0, textView3, i3, keyEvent);
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
            this.wrongNumber.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$lsBucEdxDwwqbibchKTjHHXvcME(this.f$0, view2);
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

        public static void $r8$lambda$JN6oYOQBmfyOTr0Kpi0h0xBSj2E(final LoginActivityRegisterView loginActivityRegisterView, View view) {
            loginActivityRegisterView.imageUpdater.openMenu(loginActivityRegisterView.avatar != null, new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$3cVfhXTcft5V_hjS5aoK0etI6Bw(this.f$0);
                }
            }, new DialogInterface.OnDismissListener() {
                @Override
                public final void onDismiss(DialogInterface dialogInterface) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$0PV0KcMOQy5Ccli0wGgZrzfjUEY(this.f$0, dialogInterface);
                }
            }, 0);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = false;
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0);
            loginActivityRegisterView.cameraDrawable.setCustomEndFrame(43);
            loginActivityRegisterView.avatarEditor.playAnimation();
        }

        public static void $r8$lambda$3cVfhXTcft5V_hjS5aoK0etI6Bw(LoginActivityRegisterView loginActivityRegisterView) {
            loginActivityRegisterView.avatar = null;
            loginActivityRegisterView.avatarBig = null;
            loginActivityRegisterView.showAvatarProgress(false, true);
            loginActivityRegisterView.avatarImage.setImage((ImageLocation) null, (String) null, loginActivityRegisterView.avatarDrawable, (Object) null);
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
        }

        public static void $r8$lambda$0PV0KcMOQy5Ccli0wGgZrzfjUEY(final LoginActivityRegisterView loginActivityRegisterView, DialogInterface dialogInterface) {
            if (!loginActivityRegisterView.imageUpdater.isUploadingImage()) {
                loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
                loginActivityRegisterView.cameraDrawable.setCustomEndFrame(86);
                loginActivityRegisterView.avatarEditor.setOnAnimationEndListener(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.isCameraWaitAnimationAllowed = true;
                    }
                });
                loginActivityRegisterView.avatarEditor.playAnimation();
                return;
            }
            loginActivityRegisterView.avatarEditor.setAnimation(loginActivityRegisterView.cameraDrawable);
            loginActivityRegisterView.cameraDrawable.setCurrentFrame(0, false);
            loginActivityRegisterView.isCameraWaitAnimationAllowed = true;
        }

        class AnonymousClass4 implements View.OnAttachStateChangeListener {
            private boolean isAttached;
            final LoginActivity val$this$0;
            private long lastRun = System.currentTimeMillis();
            private Runnable cameraWaitCallback = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.AnonymousClass4.m3473$r8$lambda$0a3AwsJnQVHnFW_I6UJarLsvE(this.f$0);
                }
            };

            AnonymousClass4(LoginActivity loginActivity) {
                this.val$this$0 = loginActivity;
            }

            public static void m3473$r8$lambda$0a3AwsJnQVHnFW_I6UJarLsvE(final AnonymousClass4 anonymousClass4) {
                if (anonymousClass4.isAttached) {
                    if (LoginActivityRegisterView.this.isCameraWaitAnimationAllowed && System.currentTimeMillis() - anonymousClass4.lastRun >= 10000) {
                        LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraWaitDrawable);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setCurrentFrame(0, false);
                        LoginActivityRegisterView.this.cameraWaitDrawable.setOnAnimationEndListener(new Runnable() {
                            @Override
                            public final void run() {
                                LoginActivity.LoginActivityRegisterView.AnonymousClass4.$r8$lambda$GcjdM1Z5Y9BIBYAhou2iaI_yBLM(this.f$0);
                            }
                        });
                        LoginActivityRegisterView.this.avatarEditor.playAnimation();
                        anonymousClass4.lastRun = System.currentTimeMillis();
                    }
                    LoginActivityRegisterView.this.avatarEditor.postDelayed(anonymousClass4.cameraWaitCallback, 1000L);
                }
            }

            public static void $r8$lambda$GcjdM1Z5Y9BIBYAhou2iaI_yBLM(final AnonymousClass4 anonymousClass4) {
                anonymousClass4.getClass();
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivityRegisterView.AnonymousClass4.$r8$lambda$HT68tKDpqtoKglxvwdcla2X7TkI(this.f$0);
                    }
                });
            }

            public static void $r8$lambda$HT68tKDpqtoKglxvwdcla2X7TkI(AnonymousClass4 anonymousClass4) {
                LoginActivityRegisterView.this.cameraDrawable.setCurrentFrame(0, false);
                LoginActivityRegisterView.this.avatarEditor.setAnimation(LoginActivityRegisterView.this.cameraDrawable);
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

        public static boolean $r8$lambda$U_jebr_R60OuGoYvYnIyPDnBkiU(LoginActivityRegisterView loginActivityRegisterView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityRegisterView.lastNameField.requestFocus();
                return true;
            }
            loginActivityRegisterView.getClass();
            return false;
        }

        public static boolean $r8$lambda$hUxQIPwUaurUw__ZhHNkOa40gP4(LoginActivityRegisterView loginActivityRegisterView, TextView textView, int i, KeyEvent keyEvent) {
            loginActivityRegisterView.getClass();
            if (i != 6 && i != 5) {
                return false;
            }
            loginActivityRegisterView.onNextPressed(null);
            return true;
        }

        public static void $r8$lambda$lsBucEdxDwwqbibchKTjHHXvcME(LoginActivityRegisterView loginActivityRegisterView, View view) {
            if (LoginActivity.this.radialProgressView.getTag() != null) {
                return;
            }
            loginActivityRegisterView.onBackPressed(false);
        }

        @Override
        public void updateColors() {
            this.avatarDrawable.invalidateSelf();
            TextView textView = this.titleTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i));
            TextView textView2 = this.descriptionTextView;
            int i2 = Theme.key_windowBackgroundWhiteGrayText6;
            textView2.setTextColor(Theme.getColor(i2));
            this.firstNameField.setTextColor(Theme.getColor(i));
            EditTextBoldCursor editTextBoldCursor = this.firstNameField;
            int i3 = Theme.key_windowBackgroundWhiteInputFieldActivated;
            editTextBoldCursor.setCursorColor(Theme.getColor(i3));
            this.lastNameField.setTextColor(Theme.getColor(i));
            this.lastNameField.setCursorColor(Theme.getColor(i3));
            this.wrongNumber.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText4));
            this.privacyView.setTextColor(Theme.getColor(i2));
            this.privacyView.setLinkTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
            this.firstNameOutlineView.updateColor();
            this.lastNameOutlineView.updateColor();
        }

        private void buildEditTextLayout(boolean z) {
            boolean zHasFocus = this.firstNameField.hasFocus();
            boolean zHasFocus2 = this.lastNameField.hasFocus();
            this.editTextContainer.removeAllViews();
            if (z) {
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
                    return;
                } else {
                    if (zHasFocus2) {
                        this.lastNameField.requestFocus();
                        AndroidUtilities.showKeyboard(this.lastNameField);
                        return;
                    }
                    return;
                }
            }
            this.firstNameOutlineView.setText(LocaleController.getString(R.string.FirstName));
            this.lastNameOutlineView.setText(LocaleController.getString(R.string.LastName));
            this.editTextContainer.addView(this.firstNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 0.0f, 8.0f, 0.0f));
            this.editTextContainer.addView(this.lastNameOutlineView, LayoutHelper.createFrame(-1, -2.0f, 48, 8.0f, 82.0f, 8.0f, 0.0f));
        }

        @Override
        public void didUploadPhoto(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, TLRPC.VideoSize videoSize) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.m3471$r8$lambda$XA9NKZ7TLE8JjcyDyncZfxDxZQ(this.f$0, photoSize2, photoSize);
                }
            });
        }

        public static void m3471$r8$lambda$XA9NKZ7TLE8JjcyDyncZfxDxZQ(LoginActivityRegisterView loginActivityRegisterView, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2) {
            loginActivityRegisterView.getClass();
            TLRPC.FileLocation fileLocation = photoSize.location;
            loginActivityRegisterView.avatar = fileLocation;
            loginActivityRegisterView.avatarBig = photoSize2.location;
            loginActivityRegisterView.avatarImage.setImage(ImageLocation.getForLocal(fileLocation), "50_50", loginActivityRegisterView.avatarDrawable, (Object) null);
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

                    @Override
                    public void onAnimationCancel(Animator animator) {
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

        @Override
        public boolean onBackPressed(boolean z) {
            if (z) {
                LoginActivity.this.needHideProgress(true);
                this.nextPressed = false;
                this.currentParams = null;
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this.getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.Warning));
            builder.setMessage(LocaleController.getString("AreYouSureRegistration", R.string.AreYouSureRegistration));
            builder.setNegativeButton(LocaleController.getString("Stop", R.string.Stop), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    LoginActivity.LoginActivityRegisterView.m3470$r8$lambda$3EbddTRnTGzZr18N0B6vtGw8aQ(this.f$0, alertDialog, i);
                }
            });
            builder.setPositiveButton(LocaleController.getString("Continue", R.string.Continue), null);
            LoginActivity.this.showDialog(builder.create());
            return false;
        }

        public static void m3470$r8$lambda$3EbddTRnTGzZr18N0B6vtGw8aQ(LoginActivityRegisterView loginActivityRegisterView, AlertDialog alertDialog, int i) {
            loginActivityRegisterView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            loginActivityRegisterView.hidePrivacyView();
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("YourName", R.string.YourName);
        }

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.m3472$r8$lambda$bokg0yscbshxMDA0fca4xD_1Rs(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void m3472$r8$lambda$bokg0yscbshxMDA0fca4xD_1Rs(LoginActivityRegisterView loginActivityRegisterView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityRegisterView.firstNameField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityRegisterView.firstNameField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(loginActivityRegisterView.firstNameField);
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
        public void onNextPressed(String str) {
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
            ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_signUp, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$twzdupSaqt6lpKt9SSQmsjI9Va4(this.f$0, tLObject, tL_error);
                }
            }, 10);
        }

        public static void $r8$lambda$twzdupSaqt6lpKt9SSQmsjI9Va4(final LoginActivityRegisterView loginActivityRegisterView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityRegisterView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$_JdSnufHokzgGzvUOOWRIU2TeMw(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void $r8$lambda$_JdSnufHokzgGzvUOOWRIU2TeMw(final LoginActivityRegisterView loginActivityRegisterView, final TLObject tLObject, TLRPC.TL_error tL_error) {
            loginActivityRegisterView.nextPressed = false;
            if (!(tLObject instanceof TLRPC.TL_auth_authorization)) {
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
                    loginActivityRegisterView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                    return;
                } else if (tL_error.text.contains("FIRSTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidFirstName", R.string.InvalidFirstName));
                    return;
                } else if (tL_error.text.contains("LASTNAME_INVALID")) {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidLastName", R.string.InvalidLastName));
                    return;
                } else {
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
                    return;
                }
            }
            loginActivityRegisterView.hidePrivacyView();
            LoginActivity.this.showDoneButton(false, true);
            loginActivityRegisterView.postDelayed(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityRegisterView.$r8$lambda$sGqWlHBixjzE_hsNrx0qI0AvXJM(this.f$0, tLObject);
                }
            }, 150L);
        }

        public static void $r8$lambda$sGqWlHBixjzE_hsNrx0qI0AvXJM(final LoginActivityRegisterView loginActivityRegisterView, TLObject tLObject) {
            LoginActivity.this.needHideProgress(false, false);
            AndroidUtilities.hideKeyboard(LoginActivity.this.fragmentView.findFocus());
            LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject, true);
            final TLRPC.FileLocation fileLocation = loginActivityRegisterView.avatarBig;
            if (fileLocation != null) {
                Utilities.cacheClearQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        MessagesController.getInstance(((BaseFragment) LoginActivity.this).currentAccount).uploadAndApplyUserAvatar(fileLocation);
                    }
                });
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

        private void hidePrivacyView() {
            this.privacyView.animate().alpha(0.0f).setDuration(150L).setStartDelay(0L).setInterpolator(AndroidUtilities.accelerateInterpolator).start();
        }
    }

    public boolean showKeyboard(View view) {
        if (isCustomKeyboardVisible()) {
            return true;
        }
        return AndroidUtilities.showKeyboard(view);
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
        final int width2 = (((getParentLayout().getView().getWidth() - this.floatingButtonIcon.getLayoutParams().width) - AndroidUtilities.dp(20.0f)) - getParentLayout().getView().getPaddingLeft()) - getParentLayout().getView().getPaddingRight();
        final int height2 = ((((getParentLayout().getView().getHeight() - this.floatingButtonIcon.getLayoutParams().height) - AndroidUtilities.dp(14.0f)) - (isCustomKeyboardVisible() ? AndroidUtilities.dp(230.0f) : 0)) - getParentLayout().getView().getPaddingTop()) - getParentLayout().getView().getPaddingBottom();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationStart(Animator animator) {
                LoginActivity.this.floatingButton.setButtonVisible(false, false);
                LoginActivity.this.keyboardLinearLayout.setAlpha(0.0f);
                LoginActivity.this.fragmentView.setBackgroundColor(0);
                LoginActivity.this.startMessagingButton.setVisibility(4);
                ((FrameLayout) LoginActivity.this.fragmentView).addView(transformableLoginButtonView);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                LoginActivity.this.keyboardLinearLayout.setAlpha(1.0f);
                LoginActivity.this.startMessagingButton.setVisibility(0);
                LoginActivity.this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                LoginActivity.this.floatingButton.setButtonVisible(true, false);
                ((FrameLayout) LoginActivity.this.fragmentView).removeView(transformableLoginButtonView);
                if (LoginActivity.this.animationFinishCallback != null) {
                    AndroidUtilities.runOnUIThread(LoginActivity.this.animationFinishCallback);
                    LoginActivity.this.animationFinishCallback = null;
                }
                LoginActivity.this.isAnimatingIntro = false;
                runnable.run();
            }
        });
        final int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        final int iAlpha = Color.alpha(color);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LoginActivity.$r8$lambda$5NKu5w8b_S9mhNYgHE3jAyCs3P8(this.f$0, color, iAlpha, layoutParams, width, i, height, transformableLoginButtonView, f, width2, f2, height2, valueAnimator);
            }
        });
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(valueAnimatorOfFloat);
        animatorSet.start();
        return animatorSet;
    }

    public static void $r8$lambda$5NKu5w8b_S9mhNYgHE3jAyCs3P8(LoginActivity loginActivity, int i, int i2, ViewGroup.MarginLayoutParams marginLayoutParams, int i3, int i4, int i5, TransformableLoginButtonView transformableLoginButtonView, float f, int i6, float f2, int i7, ValueAnimator valueAnimator) {
        loginActivity.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        loginActivity.keyboardLinearLayout.setAlpha(fFloatValue);
        loginActivity.fragmentView.setBackgroundColor(ColorUtils.setAlphaComponent(i, (int) (i2 * fFloatValue)));
        float f3 = 1.0f - fFloatValue;
        loginActivity.slideViewsContainer.setTranslationY(AndroidUtilities.dp(20.0f) * f3);
        if (!loginActivity.isCustomKeyboardForceDisabled()) {
            CustomPhoneKeyboardView customPhoneKeyboardView = loginActivity.keyboardView;
            customPhoneKeyboardView.setTranslationY(customPhoneKeyboardView.getLayoutParams().height * f3);
            loginActivity.floatingButton.setTranslationY(loginActivity.keyboardView.getLayoutParams().height * f3);
        }
        loginActivity.introView.setTranslationY((-AndroidUtilities.dp(20.0f)) * fFloatValue);
        float f4 = (f3 * 0.05f) + 0.95f;
        loginActivity.introView.setScaleX(f4);
        loginActivity.introView.setScaleY(f4);
        marginLayoutParams.width = (int) (i3 + ((i4 - i3) * fFloatValue));
        marginLayoutParams.height = (int) (i5 + ((i4 - i5) * fFloatValue));
        transformableLoginButtonView.requestLayout();
        transformableLoginButtonView.setProgress(fFloatValue);
        transformableLoginButtonView.setTranslationX(f + ((i6 - f) * fFloatValue));
        transformableLoginButtonView.setTranslationY(f2 + ((i7 - f2) * fFloatValue));
    }

    public void updateColors() {
        this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        ImageView imageView = this.backButtonView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(Theme.getColor(i));
        ImageView imageView2 = this.backButtonView;
        int i2 = Theme.key_listSelector;
        imageView2.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2)));
        this.proxyDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i), PorterDuff.Mode.SRC_IN));
        this.proxyButtonView.setBackground(Theme.createSelectorDrawable(Theme.getColor(i2)));
        RadialProgressView radialProgressView = this.radialProgressView;
        int i3 = Theme.key_chats_actionBackground;
        radialProgressView.setProgressColor(Theme.getColor(i3));
        this.floatingButton.updateColors();
        this.floatingButtonIcon.setColor(Theme.getColor(Theme.key_chats_actionIcon));
        this.floatingButtonIcon.setBackgroundColor(Theme.getColor(i3));
        for (SlideView slideView : this.views) {
            slideView.updateColors();
        }
        this.keyboardView.updateColors();
        PhoneNumberConfirmView phoneNumberConfirmView = this.phoneNumberConfirmView;
        if (phoneNumberConfirmView != null) {
            phoneNumberConfirmView.updateColors();
        }
    }

    @Override
    public ArrayList getThemeDescriptions() {
        return SimpleThemeDescription.createThemeDescriptions(new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.updateColors();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        }, Theme.key_windowBackgroundWhiteBlackText, Theme.key_windowBackgroundWhiteGrayText6, Theme.key_windowBackgroundWhiteHintText, Theme.key_listSelector, Theme.key_chats_actionBackground, Theme.key_chats_actionIcon, Theme.key_windowBackgroundWhiteInputField, Theme.key_windowBackgroundWhiteInputFieldActivated, Theme.key_windowBackgroundWhiteValueText, Theme.key_text_RedBold, Theme.key_windowBackgroundWhiteGrayText, Theme.key_checkbox, Theme.key_windowBackgroundWhiteBlueText4, Theme.key_changephoneinfo_image2, Theme.key_chats_actionPressedBackground, Theme.key_text_RedRegular, Theme.key_windowBackgroundWhiteLinkText, Theme.key_checkboxSquareUnchecked, Theme.key_checkboxSquareBackground, Theme.key_checkboxSquareCheck, Theme.key_dialogBackground, Theme.key_dialogTextGray2, Theme.key_dialogTextBlack);
    }

    public void tryResetAccount(final String str, final String str2, final String str3) {
        if (this.radialProgressView.getTag() != null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setMessage(LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText));
        builder.setTitle(LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning));
        builder.setPositiveButton(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                LoginActivity.$r8$lambda$TXfKC0d7XHZpXoIx2B_fXR678Vs(this.f$0, str, str2, str3, alertDialog, i);
            }
        });
        builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
        showDialog(builder.create());
    }

    public static void $r8$lambda$TXfKC0d7XHZpXoIx2B_fXR678Vs(final LoginActivity loginActivity, final String str, final String str2, final String str3, AlertDialog alertDialog, int i) {
        loginActivity.needShowProgress(0);
        TL_account.deleteAccount deleteaccount = new TL_account.deleteAccount();
        deleteaccount.reason = "Forgot password";
        ConnectionsManager.getInstance(loginActivity.currentAccount).sendRequest(deleteaccount, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LoginActivity.$r8$lambda$zTSN9LkZ4aREZHHefveI1ruVHVc(this.f$0, str, str2, str3, tLObject, tL_error);
            }
        }, 10);
    }

    public static void $r8$lambda$zTSN9LkZ4aREZHHefveI1ruVHVc(final LoginActivity loginActivity, final String str, final String str2, final String str3, TLObject tLObject, final TLRPC.TL_error tL_error) {
        loginActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LoginActivity.$r8$lambda$M_6asKFL6VqfPfwtYO2cr28szrA(this.f$0, tL_error, str, str2, str3);
            }
        });
    }

    public static void $r8$lambda$M_6asKFL6VqfPfwtYO2cr28szrA(LoginActivity loginActivity, TLRPC.TL_error tL_error, String str, String str2, String str3) {
        loginActivity.needHideProgress(false);
        if (tL_error == null) {
            if (str == null || str2 == null || str3 == null) {
                loginActivity.setPage(0, true, null, true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("phoneFormated", str);
            bundle.putString("phoneHash", str2);
            bundle.putString("code", str3);
            loginActivity.setPage(5, true, bundle, false);
            return;
        }
        if (tL_error.text.equals("2FA_RECENT_CONFIRM")) {
            loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ResetAccountCancelledAlert", R.string.ResetAccountCancelledAlert));
            return;
        }
        if (tL_error.text.startsWith("2FA_CONFIRM_WAIT_")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("phoneFormated", str);
            bundle2.putString("phoneHash", str2);
            bundle2.putString("code", str3);
            bundle2.putInt("startTime", ConnectionsManager.getInstance(loginActivity.currentAccount).getCurrentTime());
            bundle2.putInt("waitTime", Utilities.parseInt((CharSequence) tL_error.text.replace("2FA_CONFIRM_WAIT_", "")).intValue());
            loginActivity.setPage(8, true, bundle2, false);
            return;
        }
        loginActivity.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), tL_error.text);
    }

    static final class PhoneNumberConfirmView extends FrameLayout {
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

        interface IConfirmDialogCallback {
            void onConfirmPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onDismiss(PhoneNumberConfirmView phoneNumberConfirmView);

            void onEditPressed(PhoneNumberConfirmView phoneNumberConfirmView, TextView textView);

            void onFabPressed(PhoneNumberConfirmView phoneNumberConfirmView, TransformableLoginButtonView transformableLoginButtonView);
        }

        private PhoneNumberConfirmView(Context context, ViewGroup viewGroup, View view, String str, final IConfirmDialogCallback iConfirmDialogCallback) {
            super(context);
            this.pointF = new PointF();
            this.fragmentView = viewGroup;
            this.fabContainer = view;
            this.callback = iConfirmDialogCallback;
            View view2 = new View(getContext());
            this.blurredView = view2;
            view2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view3) {
                    this.f$0.dismiss();
                }
            });
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
            this.fabButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this.f$0;
                    iConfirmDialogCallback.onFabPressed(phoneNumberConfirmView, phoneNumberConfirmView.fabTransform);
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
            this.popupLayout.addView(this.confirmMessageView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 20.0f, 24.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.numberView = textView2;
            textView2.setText(str);
            this.numberView.setTextSize(1, 18.0f);
            this.numberView.setTypeface(AndroidUtilities.bold());
            this.numberView.setSingleLine();
            this.popupLayout.addView(this.numberView, LayoutHelper.createFrame(-1, -2.0f, LocaleController.isRTL ? 5 : 3, 24.0f, 48.0f, 24.0f, 0.0f));
            int iDp = AndroidUtilities.dp(16.0f);
            TextView textView3 = new TextView(context);
            this.editTextView = textView3;
            textView3.setText(LocaleController.getString(R.string.Edit));
            this.editTextView.setSingleLine();
            this.editTextView.setTextSize(1, 16.0f);
            TextView textView4 = this.editTextView;
            int iDp2 = AndroidUtilities.dp(6.0f);
            int i = Theme.key_changephoneinfo_image2;
            textView4.setBackground(Theme.getRoundRectSelectorDrawable(iDp2, Theme.getColor(i)));
            this.editTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this.f$0;
                    iConfirmDialogCallback.onEditPressed(phoneNumberConfirmView, phoneNumberConfirmView.editTextView);
                }
            });
            TextView textView5 = this.editTextView;
            Typeface typeface = Typeface.DEFAULT_BOLD;
            textView5.setTypeface(typeface);
            int i2 = iDp / 2;
            this.editTextView.setPadding(iDp, i2, iDp, i2);
            float f = 8;
            this.popupLayout.addView(this.editTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 80, f, f, f, f));
            TextView textView6 = new TextView(context);
            this.confirmTextView = textView6;
            textView6.setText(LocaleController.getString(R.string.CheckPhoneNumberYes));
            this.confirmTextView.setSingleLine();
            this.confirmTextView.setTextSize(1, 16.0f);
            this.confirmTextView.setBackground(Theme.getRoundRectSelectorDrawable(AndroidUtilities.dp(6.0f), Theme.getColor(i)));
            this.confirmTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view4) {
                    LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this.f$0;
                    iConfirmDialogCallback.onConfirmPressed(phoneNumberConfirmView, phoneNumberConfirmView.confirmTextView);
                }
            });
            this.confirmTextView.setTypeface(typeface);
            this.confirmTextView.setPadding(iDp, i2, iDp, i2);
            this.popupLayout.addView(this.confirmTextView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 3 : 5) | 80, f, f, f, f));
            updateFabPosition();
            updateColors();
        }

        public void updateFabPosition() {
            ViewPositionWatcher.computeCoordinatesInParent(this.fabContainer, this.fragmentView, this.pointF);
            this.fabButton.setTranslationX(this.pointF.x);
            this.fabButton.setTranslationY(this.pointF.y);
            requestLayout();
        }

        public void updateColors() {
            this.fabTransform.setColor(Theme.getColor(Theme.key_chats_actionIcon));
            this.fabTransform.setBackgroundColor(Theme.getColor(Theme.key_chats_actionBackground));
            this.popupLayout.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(12.0f), Theme.getColor(Theme.key_dialogBackground)));
            this.confirmMessageView.setTextColor(Theme.getColor(Theme.key_dialogTextGray2));
            this.numberView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack));
            TextView textView = this.editTextView;
            int i = Theme.key_changephoneinfo_image2;
            textView.setTextColor(Theme.getColor(i));
            this.confirmTextView.setTextColor(Theme.getColor(i));
            this.fabButton.updateColors();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int measuredHeight = this.popupLayout.getMeasuredHeight();
            int translationY = (int) (this.fabButton.getTranslationY() - AndroidUtilities.dp(32.0f));
            FrameLayout frameLayout = this.popupLayout;
            frameLayout.layout(frameLayout.getLeft(), translationY - measuredHeight, this.popupLayout.getRight(), translationY);
        }

        public void show() {
            ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
            duration.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationStart(Animator animator) {
                    PhoneNumberConfirmView.this.fabContainer.setVisibility(8);
                    int measuredWidth = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredWidth() / 10.0f);
                    int measuredHeight = (int) (PhoneNumberConfirmView.this.fragmentView.getMeasuredHeight() / 10.0f);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    canvas.scale(0.1f, 0.1f);
                    canvas.drawColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    PhoneNumberConfirmView.this.fragmentView.draw(canvas);
                    Utilities.stackBlurBitmap(bitmapCreateBitmap, Math.max(8, Math.max(measuredWidth, measuredHeight) / 150));
                    PhoneNumberConfirmView.this.blurredView.setBackground(new BitmapDrawable(PhoneNumberConfirmView.this.getContext().getResources(), bitmapCreateBitmap));
                    PhoneNumberConfirmView.this.blurredView.setAlpha(0.0f);
                    PhoneNumberConfirmView.this.blurredView.setVisibility(0);
                    PhoneNumberConfirmView.this.fragmentView.addView(PhoneNumberConfirmView.this);
                }

                @Override
                public void onAnimationEnd(Animator animator) {
                    if (AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                        PhoneNumberConfirmView.this.fabButton.requestFocus();
                    }
                }
            });
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.$r8$lambda$8lSEz0M3g7XU2ApnlPokJF8sTGs(this.f$0, valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public static void $r8$lambda$8lSEz0M3g7XU2ApnlPokJF8sTGs(PhoneNumberConfirmView phoneNumberConfirmView, ValueAnimator valueAnimator) {
            phoneNumberConfirmView.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            phoneNumberConfirmView.fabTransform.setProgress(fFloatValue);
            phoneNumberConfirmView.blurredView.setAlpha(fFloatValue);
            phoneNumberConfirmView.dimmView.setAlpha(fFloatValue);
            phoneNumberConfirmView.popupLayout.setAlpha(fFloatValue);
            float f = (fFloatValue * 0.5f) + 0.5f;
            phoneNumberConfirmView.popupLayout.setScaleX(f);
            phoneNumberConfirmView.popupLayout.setScaleY(f);
        }

        public void animateProgress(Runnable runnable) {
            this.fabButton.setProgressVisible(true, true);
            AndroidUtilities.runOnUIThread(runnable, 400L);
        }

        public void dismiss() {
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
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    LoginActivity.PhoneNumberConfirmView.$r8$lambda$DIH_br9JtU29eA9JyAntMpZhCNc(this.f$0, valueAnimator);
                }
            });
            duration.setInterpolator(CubicBezierInterpolator.DEFAULT);
            duration.start();
        }

        public static void $r8$lambda$DIH_br9JtU29eA9JyAntMpZhCNc(PhoneNumberConfirmView phoneNumberConfirmView, ValueAnimator valueAnimator) {
            phoneNumberConfirmView.getClass();
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            phoneNumberConfirmView.blurredView.setAlpha(fFloatValue);
            phoneNumberConfirmView.dimmView.setAlpha(fFloatValue);
            phoneNumberConfirmView.fabTransform.setProgress(fFloatValue);
            phoneNumberConfirmView.popupLayout.setAlpha(fFloatValue);
            float f = (fFloatValue * 0.5f) + 0.5f;
            phoneNumberConfirmView.popupLayout.setScaleX(f);
            phoneNumberConfirmView.popupLayout.setScaleY(f);
        }
    }

    static final class PhoneInputData {
        private CountrySelectActivity.Country country;
        private List patterns;
        private String phoneNumber;

        private PhoneInputData() {
        }
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) > 0.699999988079071d;
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
            } else if ((getMessagesController().blockedCountry && !SharedConfig.proxyList.isEmpty()) || z5) {
                this.proxyDrawable.setConnected(true, z4, z);
                showProxyButtonDelayed();
            } else {
                showProxyButton(false, z);
            }
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
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                LoginActivity.m3430$r8$lambda$BBOPRvYSPlmIXRXGbVF55jGUk(this.f$0);
            }
        };
        this.showProxyButtonDelayed = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 5000L);
    }

    public static void m3430$r8$lambda$BBOPRvYSPlmIXRXGbVF55jGUk(LoginActivity loginActivity) {
        loginActivity.proxyButtonVisible = false;
        loginActivity.showProxyButton(true, true);
    }

    private void showProxyButton(final boolean z, boolean z2) {
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
            this.proxyButtonView.animate().alpha(z ? 1.0f : 0.0f).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.m3435$r8$lambda$q05MnCIKrdAuMUWjyHtYYpCwM(this.f$0, z);
                }
            }).start();
        } else {
            this.proxyButtonView.setVisibility(z ? 0 : 8);
            this.proxyButtonView.setAlpha(z ? 1.0f : 0.0f);
        }
    }

    public static void m3435$r8$lambda$q05MnCIKrdAuMUWjyHtYYpCwM(LoginActivity loginActivity, boolean z) {
        if (z) {
            loginActivity.getClass();
        } else {
            loginActivity.proxyButtonView.setVisibility(8);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didUpdateConnectionState) {
            updateProxyButton(true, false);
        } else if (i == NotificationCenter.newSuggestionsAvailable && this.emailChangeIsSuggestion && !getMessagesController().hasSetupEmailSuggestion()) {
            finishFragment();
        }
    }

    public class LoginActivityPhraseView extends SlideView {
        private String beginning;
        private final Runnable checkPasteRunnable;
        private final EditTextBoldCursor codeField;
        private int codeTime;
        private final TextView confirmTextView;
        private Bundle currentParams;
        private final int currentType;
        private final Runnable dismissField;
        private String emailPhone;
        private boolean errorShown;
        private final TextView errorTextView;
        private final LinearLayout fieldContainer;
        private final RLottieImageView imageView;
        private final FrameLayout infoContainer;
        private final TextView infoTextView;
        private boolean isResendingCode;
        private double lastCurrentTime;
        private String lastError;
        private TLRPC.TL_auth_sentCode nextCodeAuth;
        private Bundle nextCodeParams;
        private boolean nextPressed;
        private int nextType;
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

        @Override
        public boolean needBackButton() {
            return true;
        }

        static int access$18226(LoginActivityPhraseView loginActivityPhraseView, double d) {
            int i = (int) (((double) loginActivityPhraseView.time) - d);
            loginActivityPhraseView.time = i;
            return i;
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
            this.checkPasteRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.checkPaste(true);
                }
            };
            this.dismissField = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.animateError(false);
                }
            };
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
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                    if (this.ignoreTextChange || charSequence == null || LoginActivityPhraseView.this.beginning == null) {
                        return;
                    }
                    this.trimmedLength = LoginActivityPhraseView.this.trimLeft(charSequence.toString()).length();
                }

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
            });
            anonymousClass1.setEllipsizeByGradient(true);
            anonymousClass1.setInputType(1);
            anonymousClass1.setTypeface(Typeface.DEFAULT);
            anonymousClass1.setGravity(LocaleController.isRTL ? 5 : 3);
            anonymousClass1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public final void onFocusChange(View view, boolean z3) {
                    this.f$0.outlineField.animateSelection(z3 ? 1.0f : 0.0f);
                }
            });
            TextView textView3 = new TextView(context);
            this.pasteTextView = textView3;
            textView3.setTextSize(1, 12.0f);
            textView3.setTypeface(AndroidUtilities.bold());
            textView3.setText(LocaleController.getString(R.string.Paste));
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setGravity(17);
            int color = Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2, ((BaseFragment) LoginActivity.this).resourceProvider);
            textView3.setTextColor(color);
            textView3.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(6.0f), Theme.multAlpha(color, 0.12f), Theme.multAlpha(color, 0.15f)));
            ScaleStateListAnimator.apply(textView3, 0.1f, 1.5f);
            anonymousClass1.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.34f));
            textView3.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$IDJ9sYwXGDNEBSdkcAbYamnDKyc(this.f$0, view);
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
            anonymousClass1.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public final boolean onEditorAction(TextView textView4, int i2, KeyEvent keyEvent) {
                    return LoginActivity.LoginActivityPhraseView.$r8$lambda$wbKra1xwGJZaemJlIn9C2xH249Q(this.f$0, textView4, i2, keyEvent);
                }
            });
            FrameLayout frameLayout = new FrameLayout(context);
            this.infoContainer = frameLayout;
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-1, -2));
            LoadingTextView loadingTextView = LoginActivity.this.new LoadingTextView(context);
            this.prevTypeTextView = loadingTextView;
            int i2 = Theme.key_windowBackgroundWhiteValueText;
            loadingTextView.setLinkTextColor(Theme.getColor(i2));
            loadingTextView.setTextColor(LoginActivity.this.getThemedColor(i2));
            loadingTextView.setTextSize(1, 14.0f);
            loadingTextView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            loadingTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.onBackPressed(true);
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
                protected boolean isResendingCode() {
                    return LoginActivityPhraseView.this.isResendingCode;
                }

                @Override
                protected boolean isRippleEnabled() {
                    if (getVisibility() == 0) {
                        return LoginActivityPhraseView.this.time <= 0 || LoginActivityPhraseView.this.timeTimer == null;
                    }
                    return false;
                }
            };
            this.timeText = loadingTextView2;
            loadingTextView2.setLinkTextColor(Theme.getColor(i2));
            loadingTextView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            loadingTextView2.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(16.0f));
            loadingTextView2.setTextSize(1, 15.0f);
            loadingTextView2.setGravity(19);
            loadingTextView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$c2F4HEjKzlNpbO7OTB1OkdvMQEw(this.f$0, view);
                }
            });
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.addView(loadingTextView2, LayoutHelper.createFrame(-1, 56.0f, 80, 6.0f, 0.0f, 60.0f, 28.0f));
            addView(frameLayout2, LayoutHelper.createLinear(-1, -1, 80));
            VerticalPositionAutoAnimator.attach(loadingTextView2);
        }

        class AnonymousClass1 extends EditTextBoldCursor {
            final LoginActivity val$this$0;

            AnonymousClass1(Context context, LoginActivity loginActivity) {
                super(context);
                this.val$this$0 = loginActivity;
            }

            @Override
            public boolean onTextContextMenuItem(int i) {
                if (i == 16908322 || i == 16908337) {
                    LoginActivityPhraseView loginActivityPhraseView = LoginActivityPhraseView.this;
                    loginActivityPhraseView.pasting = loginActivityPhraseView.pasted = true;
                    postDelayed(new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.LoginActivityPhraseView.this.pasting = false;
                        }
                    }, 1000L);
                }
                return super.onTextContextMenuItem(i);
            }
        }

        public static void $r8$lambda$IDJ9sYwXGDNEBSdkcAbYamnDKyc(LoginActivityPhraseView loginActivityPhraseView, View view) {
            CharSequence charSequenceCoerceToText;
            try {
                charSequenceCoerceToText = ((ClipboardManager) loginActivityPhraseView.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(loginActivityPhraseView.getContext());
            } catch (Exception e) {
                FileLog.e(e);
                charSequenceCoerceToText = null;
            }
            if (charSequenceCoerceToText != null) {
                Editable text = loginActivityPhraseView.codeField.getText();
                loginActivityPhraseView.pasted = true;
                loginActivityPhraseView.pasting = true;
                if (text != null) {
                    int iMax = Math.max(0, loginActivityPhraseView.codeField.getSelectionStart());
                    text.replace(iMax, Math.max(iMax, loginActivityPhraseView.codeField.getSelectionEnd()), charSequenceCoerceToText);
                }
                loginActivityPhraseView.pasting = false;
            }
            loginActivityPhraseView.checkPaste(true);
        }

        public static boolean $r8$lambda$wbKra1xwGJZaemJlIn9C2xH249Q(LoginActivityPhraseView loginActivityPhraseView, TextView textView, int i, KeyEvent keyEvent) {
            if (i == 5) {
                loginActivityPhraseView.onNextPressed(null);
                return true;
            }
            loginActivityPhraseView.getClass();
            return false;
        }

        public static void $r8$lambda$c2F4HEjKzlNpbO7OTB1OkdvMQEw(final LoginActivityPhraseView loginActivityPhraseView, View view) {
            TLRPC.TL_auth_sentCode tL_auth_sentCode;
            if (loginActivityPhraseView.time <= 0 || loginActivityPhraseView.timeTimer == null) {
                Bundle bundle = loginActivityPhraseView.nextCodeParams;
                if (bundle != null && (tL_auth_sentCode = loginActivityPhraseView.nextCodeAuth) != null) {
                    LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
                    return;
                }
                int i = loginActivityPhraseView.nextType;
                if (i != 4 && i != 2 && i != 11 && i != 15) {
                    if (i == 3) {
                        AndroidUtilities.setWaitingForSms(false);
                        loginActivityPhraseView.waitingForEvent = false;
                        loginActivityPhraseView.resendCode();
                        return;
                    }
                    return;
                }
                loginActivityPhraseView.isResendingCode = true;
                loginActivityPhraseView.timeText.invalidate();
                loginActivityPhraseView.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                loginActivityPhraseView.timeText.setTextSize(1, 15.0f);
                int i2 = loginActivityPhraseView.nextType;
                if (i2 == 4 || i2 == 11) {
                    loginActivityPhraseView.timeText.setText(LocaleController.getString(R.string.Calling));
                } else {
                    loginActivityPhraseView.timeText.setText(LocaleController.getString(R.string.SendingSms));
                }
                final Bundle bundle2 = new Bundle();
                bundle2.putString("phone", loginActivityPhraseView.phone);
                bundle2.putString("ephone", loginActivityPhraseView.emailPhone);
                bundle2.putString("phoneFormated", loginActivityPhraseView.requestPhone);
                bundle2.putInt("prevType", loginActivityPhraseView.currentType);
                TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                tL_auth_resendCode.phone_number = loginActivityPhraseView.requestPhone;
                tL_auth_resendCode.phone_code_hash = loginActivityPhraseView.phoneHash;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginActivityPhraseView.$r8$lambda$trGDnTPoE7zd4hgy2xpgFmSrHb8(this.f$0, bundle2, tLObject, tL_error);
                    }
                }, 10);
            }
        }

        public static void $r8$lambda$trGDnTPoE7zd4hgy2xpgFmSrHb8(final LoginActivityPhraseView loginActivityPhraseView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$dOyaJxAqR8VQ54azfD2k0ZHC0mU(this.f$0, tLObject, bundle, tL_error);
                }
            });
        }

        public static void $r8$lambda$dOyaJxAqR8VQ54azfD2k0ZHC0mU(LoginActivityPhraseView loginActivityPhraseView, TLObject tLObject, Bundle bundle, TLRPC.TL_error tL_error) {
            String str;
            loginActivityPhraseView.isResendingCode = false;
            loginActivityPhraseView.timeText.invalidate();
            if (tLObject != null) {
                loginActivityPhraseView.nextCodeParams = bundle;
                TLRPC.TL_auth_sentCode tL_auth_sentCode = (TLRPC.TL_auth_sentCode) tLObject;
                loginActivityPhraseView.nextCodeAuth = tL_auth_sentCode;
                LoginActivity.this.fillNextCodeParams(bundle, tL_auth_sentCode);
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
                loginActivityPhraseView.onBackPressed(true);
                LoginActivity.this.setPage(0, true, null, true);
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
            } else if (tL_error.code != -1000) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
            }
            loginActivityPhraseView.lastError = tL_error.text;
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
                    viewPropertyAnimatorScaleY.setInterpolator(cubicBezierInterpolator).setDuration(300L).start();
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

        @Override
        public void onCancelPressed() {
            this.nextPressed = false;
        }

        @Override
        public String getHeaderName() {
            return LocaleController.getString("NewPassword", R.string.NewPassword);
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            int i;
            if (bundle == null) {
                if (this.nextCodeParams == null || this.nextCodeAuth == null) {
                    return;
                }
                this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
                int i2 = this.nextType;
                if (i2 == 17) {
                    i = R.string.ReturnEnteringPhrase;
                } else if (i2 == 16) {
                    i = R.string.ReturnEnteringWord;
                } else if (i2 == 3) {
                    i = R.string.ReturnPhoneCall;
                } else {
                    i = R.string.ReturnEnteringSMS;
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
            int i3 = this.prevType;
            if (i3 == 17) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringPhrase), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 16) {
                this.prevTypeTextView.setVisibility(0);
                this.prevTypeTextView.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.BackEnteringWord), true, AndroidUtilities.dp(-1.0f), AndroidUtilities.dp(1.0f)));
            } else if (i3 == 1 || i3 == 2 || i3 == 4 || i3 == 3 || i3 == 15) {
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
            String str = "+" + PhoneFormat.getInstance().format(PhoneFormat.stripExceptNumbers(this.phone));
            String str2 = this.beginning;
            if (str2 == null) {
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? R.string.SMSWordText : R.string.SMSPhraseText, str)));
            } else {
                this.confirmTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString(!z2 ? R.string.SMSWordBeginningText : R.string.SMSPhraseBeginningText, str, str2)));
            }
            LoginActivity.this.showKeyboard(this.codeField);
            this.codeField.requestFocus();
            if (this.imageView.getAnimatedDrawable() != null) {
                this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            }
            final RLottieImageView rLottieImageView = this.imageView;
            Objects.requireNonNull(rLottieImageView);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    rLottieImageView.playAnimation();
                }
            }, 500L);
            checkPaste(false);
            animateError(false);
            this.lastCurrentTime = System.currentTimeMillis();
            this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText));
            int i4 = this.nextType;
            if (i4 == 2 || i4 == 4 || i4 == 3) {
                createTimer();
            } else {
                this.timeText.setVisibility(8);
            }
        }

        public void animateError(boolean z) {
            this.errorShown = z;
            float f = 0.0f;
            float f2 = z ? 1.0f : 0.0f;
            this.outlineField.animateError(f2);
            float f3 = (f2 * 0.1f) + 0.9f;
            ViewPropertyAnimator viewPropertyAnimatorTranslationY = this.errorTextView.animate().scaleX(f3).scaleY(f3).alpha(f2).translationY((1.0f - f2) * AndroidUtilities.dp(-5.0f));
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorTranslationY.setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
            if (this.pasteShown && !this.errorShown) {
                f = 1.0f;
            }
            float f4 = (0.1f * f) + 0.9f;
            this.infoTextView.animate().scaleX(f4).scaleY(f4).alpha(f).translationY((1.0f - f) * AndroidUtilities.dp(this.errorShown ? 5.0f : -5.0f)).setInterpolator(cubicBezierInterpolator).setDuration(290L).start();
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

        @Override
        public void onNextPressed(String str) {
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
            final TLRPC.TL_auth_signIn tL_auth_signIn = new TLRPC.TL_auth_signIn();
            tL_auth_signIn.phone_number = this.requestPhone;
            tL_auth_signIn.phone_code = string;
            tL_auth_signIn.phone_code_hash = this.phoneHash;
            tL_auth_signIn.flags |= 1;
            LoginActivity.this.needShowProgress(LoginActivity.this.getConnectionsManager().sendRequest(tL_auth_signIn, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPhraseView.m3461$r8$lambda$SUPa56ZEdpYpPhTm72TEmBFVA(this.f$0, tL_auth_signIn, tLObject, tL_error);
                }
            }, 10), true);
            LoginActivity.this.showDoneButton(true, true);
        }

        public static void m3461$r8$lambda$SUPa56ZEdpYpPhTm72TEmBFVA(final LoginActivityPhraseView loginActivityPhraseView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.m3460$r8$lambda$C0UnXMTbRwwrQUoFJZ6SF5h8A(this.f$0, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static void m3460$r8$lambda$C0UnXMTbRwwrQUoFJZ6SF5h8A(final LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, TLObject tLObject, final TLRPC.TL_auth_signIn tL_auth_signIn) {
            LoginActivity.this.needHideProgress(false, true);
            if (tL_error == null) {
                loginActivityPhraseView.nextPressed = false;
                LoginActivity.this.showDoneButton(false, true);
                loginActivityPhraseView.destroyTimer();
                if (!(tLObject instanceof TLRPC.TL_auth_authorizationSignUpRequired)) {
                    LoginActivity.this.onAuthSuccess((TLRPC.TL_auth_authorization) tLObject);
                } else {
                    TLRPC.TL_help_termsOfService tL_help_termsOfService = ((TLRPC.TL_auth_authorizationSignUpRequired) tLObject).terms_of_service;
                    if (tL_help_termsOfService != null) {
                        LoginActivity.this.currentTermsOfService = tL_help_termsOfService;
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("phoneFormated", loginActivityPhraseView.requestPhone);
                    bundle.putString("phoneHash", loginActivityPhraseView.phoneHash);
                    bundle.putString("code", tL_auth_signIn.phone_code);
                    LoginActivity.this.setPage(5, true, bundle, false);
                }
            } else {
                String str = tL_error.text;
                loginActivityPhraseView.lastError = str;
                if (str.contains("SESSION_PASSWORD_NEEDED")) {
                    ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LoginActivity.LoginActivityPhraseView.$r8$lambda$BOux35gVm73huOkzScPjzJ3DNE0(this.f$0, tL_auth_signIn, tLObject2, tL_error2);
                        }
                    }, 10);
                    loginActivityPhraseView.destroyTimer();
                } else {
                    loginActivityPhraseView.nextPressed = false;
                    if (loginActivityPhraseView.currentType != 3) {
                        if (tL_error.text.contains("PHONE_NUMBER_INVALID")) {
                            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("InvalidPhoneNumber", R.string.InvalidPhoneNumber));
                        } else {
                            if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                                loginActivityPhraseView.onInputError(false);
                                loginActivityPhraseView.codeField.post(new Runnable() {
                                    @Override
                                    public final void run() {
                                        LoginActivity.LoginActivityPhraseView.m3464$r8$lambda$jQTjCeETblZRmkZZgC1UAYq2Dw(this.f$0);
                                    }
                                });
                                return;
                            }
                            if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                                loginActivityPhraseView.onBackPressed(true);
                                LoginActivity.this.setPage(0, true, null, true);
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("CodeExpired", R.string.CodeExpired));
                            } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("FloodWait", R.string.FloodWait));
                            } else {
                                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString("ErrorOccurred", R.string.ErrorOccurred) + "\n" + tL_error.text);
                            }
                        }
                        loginActivityPhraseView.codeField.setText("");
                        loginActivityPhraseView.codeField.requestFocus();
                        return;
                    }
                    return;
                }
            }
            if (loginActivityPhraseView.currentType == 3) {
                AndroidUtilities.endIncomingCall();
                AndroidUtilities.setWaitingForCall(false);
            }
        }

        public static void $r8$lambda$BOux35gVm73huOkzScPjzJ3DNE0(final LoginActivityPhraseView loginActivityPhraseView, final TLRPC.TL_auth_signIn tL_auth_signIn, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.m3462$r8$lambda$ZDF1oPRbWaIcNjomO30PvqRUvA(this.f$0, tL_error, tLObject, tL_auth_signIn);
                }
            });
        }

        public static void m3462$r8$lambda$ZDF1oPRbWaIcNjomO30PvqRUvA(LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, TLObject tLObject, TLRPC.TL_auth_signIn tL_auth_signIn) {
            loginActivityPhraseView.nextPressed = false;
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
            bundle.putString("phoneFormated", loginActivityPhraseView.requestPhone);
            bundle.putString("phoneHash", loginActivityPhraseView.phoneHash);
            bundle.putString("code", tL_auth_signIn.phone_code);
            LoginActivity.this.setPage(6, true, bundle, false);
        }

        public static void m3464$r8$lambda$jQTjCeETblZRmkZZgC1UAYq2Dw(LoginActivityPhraseView loginActivityPhraseView) {
            loginActivityPhraseView.codeField.requestFocus();
            String str = loginActivityPhraseView.beginning;
            if (str != null) {
                if (str.length() > 1) {
                    String string = loginActivityPhraseView.codeField.getText().toString();
                    int iTrimLeftLen = loginActivityPhraseView.trimLeftLen(string) + loginActivityPhraseView.beginning.length();
                    loginActivityPhraseView.codeField.setSelection(Utilities.clamp(iTrimLeftLen + ((iTrimLeftLen < 0 || iTrimLeftLen >= string.length() || string.charAt(iTrimLeftLen) != ' ') ? 0 : 1), string.length(), 0), loginActivityPhraseView.codeField.getText().length());
                    return;
                }
            }
            EditTextBoldCursor editTextBoldCursor = loginActivityPhraseView.codeField;
            editTextBoldCursor.setSelection(0, editTextBoldCursor.getText().length());
        }

        private void resendCode() {
            if (this.nextPressed || this.isResendingCode || LoginActivity.this.isRequestingFirebaseSms) {
                return;
            }
            this.isResendingCode = true;
            this.timeText.invalidate();
            this.timeText.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteValueText));
            final Bundle bundle = new Bundle();
            bundle.putString("phone", this.phone);
            bundle.putString("ephone", this.emailPhone);
            bundle.putString("phoneFormated", this.requestPhone);
            this.nextPressed = true;
            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
            tL_auth_resendCode.phone_number = this.requestPhone;
            tL_auth_resendCode.phone_code_hash = this.phoneHash;
            LoginActivity.this.needShowProgress(ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_auth_resendCode, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$ZilxKWCtTlIBLsW965W8aOGLbfw(this.f$0, bundle, tLObject, tL_error);
                }
            }, 10));
        }

        public static void $r8$lambda$ZilxKWCtTlIBLsW965W8aOGLbfw(final LoginActivityPhraseView loginActivityPhraseView, final Bundle bundle, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginActivityPhraseView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$h4QlFQqohNoD9affIQsXGmMJdBE(this.f$0, tL_error, bundle, tLObject);
                }
            });
        }

        public static void $r8$lambda$h4QlFQqohNoD9affIQsXGmMJdBE(LoginActivityPhraseView loginActivityPhraseView, TLRPC.TL_error tL_error, Bundle bundle, TLObject tLObject) {
            loginActivityPhraseView.nextPressed = false;
            if (tL_error == null) {
                LoginActivity.this.fillNextCodeParams(bundle, (TLRPC.TL_auth_sentCode) tLObject);
            } else {
                String str = tL_error.text;
                if (str != null) {
                    if (str.contains("PHONE_NUMBER_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidPhoneNumber));
                    } else if (tL_error.text.contains("PHONE_CODE_EMPTY") || tL_error.text.contains("PHONE_CODE_INVALID")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.InvalidCode));
                    } else if (tL_error.text.contains("PHONE_CODE_EXPIRED")) {
                        loginActivityPhraseView.onBackPressed(true);
                        LoginActivity.this.setPage(0, true, null, true);
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                    } else if (tL_error.text.startsWith("FLOOD_WAIT")) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.FloodWait));
                    } else if (tL_error.code != -1000) {
                        LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.ErrorOccurred) + "\n" + tL_error.text);
                    }
                }
            }
            LoginActivity.this.needHideProgress(false);
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
        public void onResume() {
            super.onResume();
            checkPaste(true);
        }

        @Override
        public void onShow() {
            super.onShow();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginActivityPhraseView.$r8$lambda$7eU05cg3rXadVMbuLAefTyN1kGQ(this.f$0);
                }
            }, LoginActivity.SHOW_DELAY);
        }

        public static void $r8$lambda$7eU05cg3rXadVMbuLAefTyN1kGQ(LoginActivityPhraseView loginActivityPhraseView) {
            EditTextBoldCursor editTextBoldCursor = loginActivityPhraseView.codeField;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = loginActivityPhraseView.codeField;
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                AndroidUtilities.showKeyboard(loginActivityPhraseView.codeField);
            }
        }

        @Override
        public void onHide() {
            super.onHide();
            AndroidUtilities.cancelRunOnUIThread(this.checkPasteRunnable);
        }

        @Override
        public void saveStateParams(Bundle bundle) {
            if (this.currentParams != null) {
                bundle.putBundle("recoveryview_word" + this.currentType, this.currentParams);
            }
        }

        @Override
        public void restoreStateParams(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle("recoveryview_word" + this.currentType);
            this.currentParams = bundle2;
            if (bundle2 != null) {
                setParams(bundle2, true);
            }
        }

        private void createTimer() {
            if (this.timeTimer != null) {
                return;
            }
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(i));
            this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i));
            Timer timer = new Timer();
            this.timeTimer = timer;
            timer.schedule(new AnonymousClass4(), 0L, 1000L);
        }

        class AnonymousClass4 extends TimerTask {
            AnonymousClass4() {
            }

            @Override
            public void run() {
                if (LoginActivityPhraseView.this.timeTimer == null) {
                    return;
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginActivityPhraseView.AnonymousClass4.$r8$lambda$iwRBwV9mv0xeA1CmB5I1MJyOXIg(this.f$0);
                    }
                });
            }

            public static void $r8$lambda$iwRBwV9mv0xeA1CmB5I1MJyOXIg(AnonymousClass4 anonymousClass4) {
                anonymousClass4.getClass();
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
                    loadingTextView.setTextColor(Theme.getColor(i3));
                    LoginActivityPhraseView.this.timeText.setTag(R.id.color_key_tag, Integer.valueOf(i3));
                }
            }
        }

        public void destroyTimer() {
            LoadingTextView loadingTextView = this.timeText;
            int i = Theme.key_windowBackgroundWhiteGrayText;
            loadingTextView.setTextColor(Theme.getColor(i));
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

        private int trimLeftLen(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return i;
        }

        public String trimLeft(String str) {
            int length = str.length();
            int i = 0;
            while (i < length && str.charAt(i) <= ' ') {
                i++;
            }
            return (i > 0 || length < str.length()) ? str.substring(i, length) : str;
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
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, i2);
                    this.drawable.rect2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - AndroidUtilities.dp(52.0f));
                }

                @Override
                protected void configure() {
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
            this.optionsButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
            frameLayout.addView(this.optionsButton, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, -2.0f, 0.0f));
            GLIconTextureView gLIconTextureView = new GLIconTextureView(context, 1, 1) {
                @Override
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    setPaused(false);
                }

                @Override
                protected void onDetachedFromWindow() {
                    super.onDetachedFromWindow();
                    setPaused(true);
                }
            };
            gLIconTextureView.setStarParticlesView(this.starParticlesView);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(50, 50, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            int i2 = Theme.key_premiumGradient2;
            canvas.drawColor(ColorUtils.blendARGB(Theme.getColor(i2), Theme.getColor(Theme.key_dialogBackground), 0.5f));
            gLIconTextureView.setBackgroundBitmap(bitmapCreateBitmap);
            GLIconRenderer gLIconRenderer = gLIconTextureView.mRenderer;
            gLIconRenderer.colorKey1 = i2;
            gLIconRenderer.colorKey2 = Theme.key_premiumGradient1;
            gLIconRenderer.updateColors();
            frameLayout.addView(gLIconTextureView, LayoutHelper.createFrame(160, 160, 1));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString(R.string.SMSFeeTitle));
            textView.setTextColor(Theme.getColor(i));
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
            this.cells[2].set(R.drawable.menu_feature_hands, AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.SMSFee3Title), new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.m3500$r8$lambda$368aoO8FvkgNz49iU0VIhRsqrc(this.f$0);
                }
            }), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)), LocaleController.getString(R.string.SMSFee3Text));
            addView(this.cells[2], LayoutHelper.createLinear(-1, -2, 55, 0, 0, 0, 6));
            addView(new Space(context), LayoutHelper.createLinear(0, 0, 1.0f, 119));
            ButtonWithCounterView round = new ButtonWithCounterView(context, null).setRound();
            this.button = round;
            round.setLoading(true);
            addView(this.button, LayoutHelper.createLinear(-1, 48, 7, 0, 16, 0, 16));
        }

        public static void m3500$r8$lambda$368aoO8FvkgNz49iU0VIhRsqrc(LoginPayView loginPayView) {
            loginPayView.getClass();
            PremiumPreviewFragment premiumPreviewFragment = new PremiumPreviewFragment("sms");
            premiumPreviewFragment.setCurrentAccount(((BaseFragment) LoginActivity.this).currentAccount);
            LoginActivity.this.presentFragment(premiumPreviewFragment);
        }

        @Override
        public void setParams(Bundle bundle, boolean z) {
            long j;
            int i;
            super.setParams(bundle, z);
            this.params = bundle;
            String countryName = LocaleController.getCountryName(bundle == null ? null : bundle.getString("country"));
            String string = bundle == null ? null : bundle.getString("product");
            final String string2 = bundle == null ? null : bundle.getString("phoneFormated");
            String string3 = bundle == null ? null : bundle.getString("phoneHash");
            final String string4 = bundle == null ? null : bundle.getString("support_email_email");
            final String string5 = bundle == null ? null : bundle.getString("support_email_subject");
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
            this.optionsButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LoginActivity.LoginPayView loginPayView = this.f$0;
                    ItemOptions.makeOptions(LoginActivity.this, loginPayView.optionsButton).add(R.drawable.msg_help, LocaleController.getString(R.string.SettingsHelp), new Runnable() {
                        @Override
                        public final void run() {
                            LoginActivity.LoginPayView.$r8$lambda$8rdGfME7ha_Bs5msGVixDcULgQw(this.f$0, str, str, str);
                        }
                    }).setGravity(5).show();
                }
            });
            this.button.setEnabled(true);
            this.button.setOnClickListener(null);
            if (BuildVars.useInvoiceBilling()) {
                if (!TextUtils.isEmpty(string6) && j2 > j) {
                    this.button.setVisibility(0);
                    this.button.setLoading(false);
                    this.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, BillingController.getInstance().formatCurrency(j2, string6)), false);
                    this.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                    final int i2 = i;
                    final String str = string2;
                    final String str2 = string6;
                    final long j3 = j2;
                    final String str3 = string3;
                    this.button.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            LoginActivity.LoginPayView.$r8$lambda$HInN8J1if4c8UKkWp3OxUDp6aD8(this.f$0, str2, j3, str3, str, i2, view);
                        }
                    });
                    return;
                }
                this.button.setVisibility(0);
                this.button.setLoading(false);
                this.button.setEnabled(false);
                this.button.setText(LocaleController.getString(R.string.Unavailable), false);
                return;
            }
            final int i3 = i;
            final String str4 = string3;
            if (TextUtils.isEmpty(string)) {
                this.button.setVisibility(8);
                return;
            }
            this.button.setVisibility(0);
            this.button.setLoading(true);
            final String str5 = string;
            final String str6 = string2;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.m3508$r8$lambda$S7Mx6i8HC1pwDMdCgXPdE4U1Vw(this.f$0, str5, str4, str6, i3);
                }
            };
            if (!BillingController.getInstance().isReady()) {
                BillingController.getInstance().whenSetuped(runnable);
            } else {
                runnable.run();
            }
        }

        public static void $r8$lambda$8rdGfME7ha_Bs5msGVixDcULgQw(LoginPayView loginPayView, String str, String str2, String str3) {
            String str4;
            loginPayView.getClass();
            try {
                PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                String str5 = String.format(Locale.US, "%s (%d)", packageInfo.versionName, Integer.valueOf(packageInfo.versionCode));
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
                        SubscriptionManager subscriptionManagerFrom = SubscriptionManager.from(loginPayView.getContext());
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
                                SubscriptionInfo subscriptionInfoM = LoginActivity$$ExternalSyntheticApiModelOutline4.m(it.next());
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
                        TelephonyManager telephonyManager = (TelephonyManager) loginPayView.getContext().getSystemService(TelephonyManager.class);
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
                sb.append(AndroidUtilities.isWifiEnabled(loginPayView.getContext()));
                sb.append("\n");
                sb.append("Airplane Mode: ");
                sb.append(AndroidUtilities.isInAirplaneMode(loginPayView.getContext()));
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
                if (!TextUtils.isEmpty(loginPayView.lastError)) {
                    sb.append("Error: ");
                    sb.append(loginPayView.lastError);
                    sb.append("\n");
                }
                sb.append("\n\n================================================\n");
                sb.append("WRITE YOUR COMMENT HERE:\n");
                sb.append("\n");
                sb.append("\n");
                intent.putExtra("android.intent.extra.TEXT", sb.toString());
                loginPayView.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
            } catch (Exception unused) {
                LoginActivity.this.needShowAlert(LocaleController.getString(R.string.AppName), LocaleController.getString("NoMailInstalled", R.string.NoMailInstalled));
            }
        }

        public static void $r8$lambda$HInN8J1if4c8UKkWp3OxUDp6aD8(final LoginPayView loginPayView, String str, long j, String str2, String str3, int i, View view) {
            if (loginPayView.button.isLoading()) {
                return;
            }
            loginPayView.button.setLoading(true);
            final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
            tL_inputStorePaymentAuthCode.currency = str;
            tL_inputStorePaymentAuthCode.amount = j;
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            tL_inputStorePaymentAuthCode.phone_code_hash = str2;
            tL_inputStorePaymentAuthCode.phone_number = str3;
            tL_inputStorePaymentAuthCode.premium_days = i;
            final TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode = new TLRPC.TL_inputInvoicePremiumAuthCode();
            tL_inputInvoicePremiumAuthCode.purpose = tL_inputStorePaymentAuthCode;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumAuthCode;
            JSONObject jSONObjectMakeThemeParams = BotWebViewSheet.makeThemeParams(null);
            if (jSONObjectMakeThemeParams != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectMakeThemeParams.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LoginActivity.LoginPayView.$r8$lambda$NyNkgZnwpa8fli3YasNSnHXh7_c(this.f$0, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tLObject, tL_error);
                }
            }, 74);
        }

        public static void $r8$lambda$NyNkgZnwpa8fli3YasNSnHXh7_c(final LoginPayView loginPayView, final TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$fXurjq4V7TtrE0iEy0Ud4pbCfN0(this.f$0, tLObject, tL_inputInvoicePremiumAuthCode, tL_inputStorePaymentAuthCode, tL_error);
                }
            });
        }

        public static void $r8$lambda$fXurjq4V7TtrE0iEy0Ud4pbCfN0(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_inputInvoicePremiumAuthCode tL_inputInvoicePremiumAuthCode, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.TL_error tL_error) {
            loginPayView.button.setLoading(false);
            if (tLObject instanceof TLRPC.PaymentForm) {
                final TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
                LoginActivity.this.getMessagesController().putUsers(paymentForm.users, false);
                PaymentFormActivity paymentFormActivity = new PaymentFormActivity(paymentForm, (TLRPC.InputInvoice) tL_inputInvoicePremiumAuthCode, true, (BaseFragment) LoginActivity.this);
                paymentFormActivity.setCustomResultReceiver(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        LoginActivity.LoginPayView.$r8$lambda$p8ViQWFlbywcTysmXS1rbRX_tUg(this.f$0, tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.TL_payments_paymentResult) obj);
                    }
                });
                paymentFormActivity.setCustomAnyResultReceiver(new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        LoginActivity.LoginPayView.m3505$r8$lambda$LZ7bxbgRA06O5O6p55QLfe4mTA(this.f$0, tL_inputStorePaymentAuthCode, paymentForm, (TLRPC.payments_PaymentResult) obj);
                    }
                });
                paymentFormActivity.setCustomErrorReceiver(new Utilities.CallbackReturn() {
                    @Override
                    public final Object run(Object obj) {
                        return LoginActivity.LoginPayView.m3511$r8$lambda$qr4uZwovPHDjTrg0py8TazTUg0(this.f$0, (TLRPC.TL_error) obj);
                    }
                });
                LoginActivity.this.presentFragment(paymentFormActivity);
                return;
            }
            if (tL_error == null) {
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.getString(R.string.UnknownError));
            } else if ("PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginPayView.$r8$lambda$2njTIIyVUOmEpEo7VcFQV37M_tA(this.f$0);
                    }
                });
            } else {
                loginPayView.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
            }
        }

        public static void $r8$lambda$p8ViQWFlbywcTysmXS1rbRX_tUg(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.PaymentForm paymentForm, TLRPC.TL_payments_paymentResult tL_payments_paymentResult) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$CZ4PA46w4lFpWSK6lxy2QvH1IM0(this.f$0, tL_inputStorePaymentAuthCode, paymentForm);
                }
            });
        }

        public static void $r8$lambda$CZ4PA46w4lFpWSK6lxy2QvH1IM0(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            loginPayView.getClass();
            loginPayView.startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public static void m3505$r8$lambda$LZ7bxbgRA06O5O6p55QLfe4mTA(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.PaymentForm paymentForm, TLRPC.payments_PaymentResult payments_paymentresult) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$zEH41GNz53FC31jrZZncn_lpTnY(this.f$0, tL_inputStorePaymentAuthCode, paymentForm);
                }
            });
        }

        public static void $r8$lambda$zEH41GNz53FC31jrZZncn_lpTnY(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TLRPC.PaymentForm paymentForm) {
            loginPayView.getClass();
            loginPayView.startPoll(tL_inputStorePaymentAuthCode.phone_number, tL_inputStorePaymentAuthCode.phone_code_hash, paymentForm.form_id);
        }

        public static Boolean m3511$r8$lambda$qr4uZwovPHDjTrg0py8TazTUg0(final LoginPayView loginPayView, TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginPayView.m3506$r8$lambda$MYsv4UTZHRbRajohVm7K02SGg(this.f$0);
                    }
                });
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }

        public static void m3506$r8$lambda$MYsv4UTZHRbRajohVm7K02SGg(LoginPayView loginPayView) {
            loginPayView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public static void $r8$lambda$2njTIIyVUOmEpEo7VcFQV37M_tA(LoginPayView loginPayView) {
            loginPayView.onBackPressed(true);
            LoginActivity.this.setPage(0, true, null, true);
            LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
        }

        public static void m3508$r8$lambda$S7Mx6i8HC1pwDMdCgXPdE4U1Vw(final LoginPayView loginPayView, final String str, final String str2, final String str3, final int i) {
            loginPayView.getClass();
            ArrayList arrayList = new ArrayList();
            arrayList.add(QueryProductDetailsParams.Product.newBuilder().setProductType("inapp").setProductId(str).build());
            FileLog.d("LoginBilling querying \"" + str + "\" product");
            BillingController.getInstance().queryProductDetails(arrayList, new BillingController.ProductDetailsResponseListenerLegacy() {
                @Override
                public final void onProductDetailsResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.m3504$r8$lambda$CSxhLttvqzdZPWFjDvFBLsOnnA(this.f$0, str, str2, str3, i, billingResult, list);
                }
            });
        }

        public static void m3504$r8$lambda$CSxhLttvqzdZPWFjDvFBLsOnnA(final LoginPayView loginPayView, final String str, final String str2, final String str3, final int i, final BillingResult billingResult, final List list) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$WaOM10Yh6RASg9t8qOaI202sd_Y(this.f$0, str, billingResult, list, str2, str3, i);
                }
            });
        }

        public static void $r8$lambda$WaOM10Yh6RASg9t8qOaI202sd_Y(final LoginPayView loginPayView, final String str, BillingResult billingResult, List list, String str2, String str3, final int i) {
            loginPayView.getClass();
            FileLog.d("LoginBilling queried \"" + str + "\" product: " + BillingController.getResponseCodeString(billingResult.getResponseCode()));
            if (billingResult.getResponseCode() != 0) {
                loginPayView.lastError = "BILLING_" + BillingController.getResponseCodeString(billingResult.getResponseCode());
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, BillingController.getResponseCodeString(billingResult.getResponseCode())));
                return;
            }
            if (list != null && !list.isEmpty()) {
                final ProductDetails productDetails = (ProductDetails) list.get(0);
                final ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails = productDetails.getOneTimePurchaseOfferDetails();
                final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode = new TLRPC.TL_inputStorePaymentAuthCode();
                tL_inputStorePaymentAuthCode.currency = oneTimePurchaseOfferDetails.getPriceCurrencyCode();
                tL_inputStorePaymentAuthCode.amount = (long) ((oneTimePurchaseOfferDetails.getPriceAmountMicros() / Math.pow(10.0d, 6.0d)) * Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_inputStorePaymentAuthCode.currency)));
                tL_inputStorePaymentAuthCode.phone_code_hash = TextUtils.isEmpty(str2) ? "" : str2;
                tL_inputStorePaymentAuthCode.phone_number = str3;
                tL_inputStorePaymentAuthCode.premium_days = i;
                FileLog.d("LoginBilling found \"" + str + "\" product, with currency=" + tL_inputStorePaymentAuthCode.currency + " amount=" + tL_inputStorePaymentAuthCode.amount + "; phone=" + str3 + ", phone_code_hash=" + str2);
                final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentAuthCode;
                ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_payments_canPurchaseStore, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.$r8$lambda$__Aj5VhX7qjXdaUkUvkSjwMww3U(this.f$0, oneTimePurchaseOfferDetails, i, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, tLObject, tL_error);
                    }
                }, 10);
                return;
            }
            loginPayView.lastError = "PRODUCT_NOT_FOUND";
            BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "PRODUCT_NOT_FOUND"));
        }

        public static void $r8$lambda$__Aj5VhX7qjXdaUkUvkSjwMww3U(final LoginPayView loginPayView, final ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, final int i, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.m3509$r8$lambda$XRpgSoAA9SoIKsr5GEFAkevz88(this.f$0, tLObject, tL_error, oneTimePurchaseOfferDetails, i, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore);
                }
            });
        }

        public static void m3509$r8$lambda$XRpgSoAA9SoIKsr5GEFAkevz88(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_error tL_error, ProductDetails.OneTimePurchaseOfferDetails oneTimePurchaseOfferDetails, int i, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore) {
            loginPayView.getClass();
            FileLog.d("LoginBilling canPurchaseStore returned " + tLObject + " " + tL_error);
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                loginPayView.button.setText(LocaleController.formatString(R.string.SMSFeePurchaseTitle, oneTimePurchaseOfferDetails.getFormattedPrice()), false);
                loginPayView.button.setSubText(i == 7 ? LocaleController.getString(R.string.SMSFeePurchaseText) : LocaleController.formatPluralStringComma("SMSFeePurchaseTextDays", i), false);
                loginPayView.button.setLoading(false);
                loginPayView.button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LoginActivity.LoginPayView.$r8$lambda$QtMXIMnw4EdmCQvpBHrei8zu7Dw(this.f$0, productDetails, tL_inputStorePaymentAuthCode, str, tL_payments_canPurchaseStore, view);
                    }
                });
                return;
            }
            if (tLObject instanceof TLRPC.TL_boolFalse) {
                loginPayView.lastError = "RESPONSE_FALSE";
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, "RESPONSE_FALSE"));
            } else if (tL_error != null) {
                loginPayView.lastError = tL_error.text;
                BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).showForError(tL_error);
            }
        }

        public static void $r8$lambda$QtMXIMnw4EdmCQvpBHrei8zu7Dw(final LoginPayView loginPayView, final ProductDetails productDetails, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final String str, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, View view) {
            if (loginPayView.button.isLoading()) {
                return;
            }
            loginPayView.button.setLoading(true);
            final Utilities.Callback callback = new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    LoginActivity.LoginPayView.$r8$lambda$0PWtj3T3WFL3tPQn04WmR1DQgG0(this.f$0, (String) obj);
                }
            };
            FileLog.d("LoginBilling, querying done purchases...");
            final Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.m3507$r8$lambda$Rd7APdQNVLJXMblsaqRZRj1iHw(this.f$0, productDetails, callback, tL_inputStorePaymentAuthCode);
                }
            };
            BillingController.getInstance().queryPurchases("inapp", new PurchasesResponseListener() {
                @Override
                public final void onQueryPurchasesResponse(BillingResult billingResult, List list) {
                    LoginActivity.LoginPayView.m3510$r8$lambda$pQeITiKwN2bq7SxGfN9LzUTb0(this.f$0, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable, billingResult, list);
                }
            });
        }

        public static void $r8$lambda$0PWtj3T3WFL3tPQn04WmR1DQgG0(LoginPayView loginPayView, String str) {
            loginPayView.getClass();
            FileLog.d("LoginBilling purchased done " + str);
            if ("CANCELLED".equalsIgnoreCase(str)) {
                loginPayView.button.setLoading(false);
            }
        }

        public static void m3507$r8$lambda$Rd7APdQNVLJXMblsaqRZRj1iHw(LoginPayView loginPayView, ProductDetails productDetails, final Utilities.Callback callback, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode) {
            LoginActivity.this.paid = true;
            BillingController.getInstance().addResultListener(productDetails.getProductId(), new Consumer() {
                @Override
                public final void accept(Object obj) {
                    LoginActivity.LoginPayView.$r8$lambda$pAGp1uDnxfAJNNKcngfU5B1nZnE(callback, (BillingResult) obj);
                }
            });
            BillingController.getInstance().setOnCanceled(new Runnable() {
                @Override
                public final void run() {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            callback.run("CANCELLED");
                        }
                    });
                }
            });
            BillingController.getInstance().launchBillingFlow(LoginActivity.this.getParentActivity(), AccountInstance.getInstance(((BaseFragment) LoginActivity.this).currentAccount), tL_inputStorePaymentAuthCode, Collections.singletonList(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails(productDetails).build()));
        }

        public static void $r8$lambda$pAGp1uDnxfAJNNKcngfU5B1nZnE(final Utilities.Callback callback, BillingResult billingResult) {
            final String responseCodeString = billingResult.getResponseCode() == 0 ? null : BillingController.getResponseCodeString(billingResult.getResponseCode());
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    callback.run(responseCodeString);
                }
            });
        }

        public static void m3510$r8$lambda$pQeITiKwN2bq7SxGfN9LzUTb0(final LoginPayView loginPayView, final String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, final BillingResult billingResult, final List list) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.$r8$lambda$iFkBAoCvmFnvgkuDKeX4nJl3jA8(this.f$0, billingResult, list, str, tL_inputStorePaymentAuthCode, tL_payments_canPurchaseStore, runnable);
                }
            });
        }

        public static void $r8$lambda$iFkBAoCvmFnvgkuDKeX4nJl3jA8(final LoginPayView loginPayView, BillingResult billingResult, List list, String str, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, final TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable) {
            loginPayView.getClass();
            if (billingResult.getResponseCode() == 0 && list != null && !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    final Purchase purchase = (Purchase) it.next();
                    if (purchase.getProducts().contains(str)) {
                        TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = new TLRPC.TL_payments_assignPlayMarketTransaction();
                        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                        tL_payments_assignPlayMarketTransaction.receipt = tL_dataJSON;
                        tL_dataJSON.data = purchase.getOriginalJson();
                        tL_inputStorePaymentAuthCode.restore = true;
                        tL_payments_assignPlayMarketTransaction.purpose = tL_inputStorePaymentAuthCode;
                        LoginActivity.this.getConnectionsManager().sendRequest(tL_payments_assignPlayMarketTransaction, new RequestDelegate() {
                            @Override
                            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                                LoginActivity.LoginPayView.$r8$lambda$7I87C6O_AXqlifR9Bboj0Hr9Rls(this.f$0, tL_inputStorePaymentAuthCode, purchase, tL_payments_canPurchaseStore, runnable, tLObject, tL_error);
                            }
                        }, 74);
                        return;
                    }
                }
            }
            runnable.run();
        }

        public static void $r8$lambda$7I87C6O_AXqlifR9Bboj0Hr9Rls(final LoginPayView loginPayView, final TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, Purchase purchase, TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore, final Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            if (!(tLObject instanceof TLRPC.Updates)) {
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            runnable.run();
                        }
                    });
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
                final TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode = (TL_update.TL_updateSentPhoneCode) obj;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        LoginActivity.LoginPayView.$r8$lambda$cSESROmtP8HL5FFGEGntlwl15no(this.f$0, tL_inputStorePaymentAuthCode, tL_updateSentPhoneCode);
                    }
                });
            }
            LoginActivity.this.getMessagesController().processUpdates(updates, false);
            BillingController.getInstance().consumeGiftPurchase(purchase, tL_payments_canPurchaseStore.purpose, null);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.button.setLoading(false);
                }
            });
        }

        public static void $r8$lambda$cSESROmtP8HL5FFGEGntlwl15no(LoginPayView loginPayView, TLRPC.TL_inputStorePaymentAuthCode tL_inputStorePaymentAuthCode, TL_update.TL_updateSentPhoneCode tL_updateSentPhoneCode) {
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

        private void closeAllPaymentFormActivities() {
            INavigationLayout parentLayout = LoginActivity.this.getParentLayout();
            if (parentLayout == null || parentLayout.getFragmentStack() == null) {
                return;
            }
            List fragmentStack = parentLayout.getFragmentStack();
            BaseFragment baseFragment = fragmentStack.isEmpty() ? null : (BaseFragment) fragmentStack.get(fragmentStack.size() - 1);
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
                parentLayout.closeLastFragment(true);
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

        public void poll() {
            if (this.polling) {
                TLRPC.TL_checkPaidAuth tL_checkPaidAuth = new TLRPC.TL_checkPaidAuth();
                tL_checkPaidAuth.form_id = this.pollingFormId;
                tL_checkPaidAuth.phone_number = this.pollingPhoneNumber;
                tL_checkPaidAuth.phone_code_hash = this.pollingPhoneCodeHash;
                this.pollingRequestId = ConnectionsManager.getInstance(((BaseFragment) LoginActivity.this).currentAccount).sendRequest(tL_checkPaidAuth, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        LoginActivity.LoginPayView.$r8$lambda$gWN3mG6QInzISjcaO27raOnqYis(this.f$0, tLObject, tL_error);
                    }
                }, 1096);
            }
        }

        public static void $r8$lambda$gWN3mG6QInzISjcaO27raOnqYis(final LoginPayView loginPayView, final TLObject tLObject, final TLRPC.TL_error tL_error) {
            loginPayView.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LoginActivity.LoginPayView.m3503$r8$lambda$9DpUPrSEsOcOsfDzF97I2lHX0E(this.f$0, tLObject, tL_error);
                }
            });
        }

        public static void m3503$r8$lambda$9DpUPrSEsOcOsfDzF97I2lHX0E(final LoginPayView loginPayView, TLObject tLObject, TLRPC.TL_error tL_error) {
            loginPayView.pollingRequestId = -1;
            if (tLObject instanceof TLRPC.auth_SentCode) {
                loginPayView.polling = false;
                loginPayView.button.setLoading(false);
                loginPayView.closeAllPaymentFormActivities();
                LoginActivity.this.fillNextCodeParams(loginPayView.params, (TLRPC.auth_SentCode) tLObject);
                return;
            }
            if (tL_error != null) {
                String str = tL_error.text;
                if (str != null && str.startsWith("FLOOD_WAIT_")) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.poll();
                        }
                    }, Integer.parseInt(tL_error.text.substring(11)) * 1000);
                    return;
                }
                String str2 = tL_error.text;
                if (str2 != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(str2)) {
                    loginPayView.onBackPressed(true);
                    LoginActivity.this.setPage(0, true, null, true);
                    LoginActivity.this.needShowAlert(LocaleController.getString(R.string.RestorePasswordNoEmailTitle), LocaleController.getString(R.string.CodeExpired));
                } else {
                    loginPayView.lastError = tL_error.text;
                    loginPayView.polling = false;
                    loginPayView.button.setLoading(false);
                    BulletinFactory.of(LoginActivity.this.slideViewsContainer, null).createSimpleBulletin(R.raw.error, LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text));
                }
            }
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
}
