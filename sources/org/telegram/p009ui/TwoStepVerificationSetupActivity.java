package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.ColorUtils;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.SimpleTextView;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.CustomPhoneKeyboardView;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.OutlineTextContainerView;
import org.telegram.p009ui.Components.RLottieDrawable;
import org.telegram.p009ui.Components.RLottieImageView;
import org.telegram.p009ui.Components.RadialProgressView;
import org.telegram.p009ui.Components.SizeNotifierFrameLayout;
import org.telegram.p009ui.Components.TextStyleSpan;
import org.telegram.p009ui.Components.TransformableLoginButtonView;
import org.telegram.p009ui.Components.VerticalPositionAutoAnimator;
import org.telegram.p009ui.Components.spoilers.SpoilersTextView;
import org.telegram.p009ui.TwoStepVerificationSetupActivity;
import org.telegram.tgnet.C1132x72c667f;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$PasswordKdfAlgo;
import org.telegram.tgnet.TLRPC$SecurePasswordKdfAlgo;
import org.telegram.tgnet.TLRPC$TL_account_confirmPasswordEmail;
import org.telegram.tgnet.TLRPC$TL_account_getPassword;
import org.telegram.tgnet.TLRPC$TL_account_getPasswordSettings;
import org.telegram.tgnet.TLRPC$TL_account_passwordInputSettings;
import org.telegram.tgnet.TLRPC$TL_account_resendPasswordEmail;
import org.telegram.tgnet.TLRPC$TL_account_updatePasswordSettings;
import org.telegram.tgnet.TLRPC$TL_auth_checkRecoveryPassword;
import org.telegram.tgnet.TLRPC$TL_auth_recoverPassword;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordEmpty;
import org.telegram.tgnet.TLRPC$TL_inputCheckPasswordSRP;
import org.telegram.tgnet.TLRPC$TL_passwordKdfAlgoUnknown;
import org.telegram.tgnet.TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
import org.telegram.tgnet.TLRPC$TL_secureSecretSettings;
import org.telegram.tgnet.TLRPC$account_Password;
import org.telegram.tgnet.TLRPC$auth_Authorization;

public class TwoStepVerificationSetupActivity extends BaseFragment {
    private AnimatorSet actionBarAnimator;
    private View actionBarBackground;
    private RLottieDrawable[] animationDrawables;
    private TextView bottomSkipButton;
    private AnimatorSet buttonAnimation;
    private TextView buttonTextView;
    private boolean closeAfterSet;
    private CodeFieldContainer codeFieldContainer;
    private TLRPC$account_Password currentPassword;
    private byte[] currentPasswordHash;
    private byte[] currentSecret;
    private long currentSecretId;
    private int currentType;
    private TextView descriptionText;
    private TextView descriptionText2;
    private TextView descriptionText3;
    private boolean doneAfterPasswordLoad;
    private EditTextBoldCursor editTextFirstRow;
    private EditTextBoldCursor editTextSecondRow;
    private String email;
    private String emailCode;
    private boolean emailOnly;
    private Runnable errorColorTimeout;
    private Runnable finishCallback;
    private String firstPassword;
    private VerticalPositionAutoAnimator floatingAutoAnimator;
    private FrameLayout floatingButtonContainer;
    private TransformableLoginButtonView floatingButtonIcon;
    private RadialProgressView floatingProgressView;
    private ArrayList<BaseFragment> fragmentsToClose;
    private boolean fromRegistration;
    private String hint;
    private boolean ignoreTextChange;
    private RLottieImageView imageView;
    private CustomPhoneKeyboardView keyboardView;
    private Runnable monkeyEndCallback;
    private boolean needPasswordButton;
    private int otherwiseReloginDays;
    private OutlineTextContainerView outlineTextFirstRow;
    private OutlineTextContainerView outlineTextSecondRow;
    private boolean paused;
    private boolean postedErrorColorTimeout;
    private RadialProgressView radialProgressView;
    private ScrollView scrollView;
    private Runnable setAnimationRunnable;
    private ImageView showPasswordButton;
    private TextView titleTextView;
    private boolean waitingForEmail;

    public static boolean lambda$createView$10(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void lambda$createView$19(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    @Override
    public boolean hasForceLightStatusBar() {
        return true;
    }

    protected void onReset() {
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

    public void lambda$new$1() {
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        if (editTextBoldCursor == null) {
            return;
        }
        if (editTextBoldCursor.length() != 0) {
            this.animationDrawables[2].setCustomEndFrame(49);
            this.animationDrawables[2].setProgress(0.0f, false);
            this.imageView.playAnimation();
            return;
        }
        setRandomMonkeyIdleAnimation(true);
    }

    public TwoStepVerificationSetupActivity(int i, TLRPC$account_Password tLRPC$account_Password) {
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList<>();
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$new$0();
            }
        };
        this.finishCallback = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$new$1();
            }
        };
        this.currentType = i;
        this.currentPassword = tLRPC$account_Password;
        if (tLRPC$account_Password == null && (i == 6 || i == 8)) {
            loadPasswordInfo();
        } else {
            this.waitingForEmail = !TextUtils.isEmpty(tLRPC$account_Password.email_unconfirmed_pattern);
        }
    }

    public TwoStepVerificationSetupActivity(int i, int i2, TLRPC$account_Password tLRPC$account_Password) {
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList<>();
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$new$0();
            }
        };
        this.finishCallback = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$new$1();
            }
        };
        this.currentAccount = i;
        this.currentType = i2;
        this.currentPassword = tLRPC$account_Password;
        this.waitingForEmail = !TextUtils.isEmpty(tLRPC$account_Password.email_unconfirmed_pattern);
        if (this.currentPassword == null) {
            int i3 = this.currentType;
            if (i3 == 6 || i3 == 8) {
                loadPasswordInfo();
            }
        }
    }

    public void setCurrentPasswordParams(byte[] bArr, long j, byte[] bArr2, boolean z) {
        this.currentPasswordHash = bArr;
        this.currentSecret = bArr2;
        this.currentSecretId = j;
        this.emailOnly = z;
    }

    public void setCurrentEmailCode(String str) {
        this.emailCode = str;
    }

    public void addFragmentToClose(BaseFragment baseFragment) {
        this.fragmentsToClose.add(baseFragment);
    }

    public void setFromRegistration(boolean z) {
        this.fromRegistration = z;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        int i = 0;
        this.doneAfterPasswordLoad = false;
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.setAnimationRunnable = null;
        }
        if (this.animationDrawables != null) {
            while (true) {
                RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
                if (i >= rLottieDrawableArr.length) {
                    break;
                }
                rLottieDrawableArr[i].recycle();
                i++;
            }
            this.animationDrawables = null;
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.removeAltFocusable(getParentActivity(), this.classGuid);
        }
    }

    @Override
    public View createView(Context context) {
        CodeNumberField[] codeNumberFieldArr;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitleColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.actionBar.setItemsColor(Theme.getColor("windowBackgroundWhiteBlackText"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarWhiteSelector"), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new C42231());
        if (this.currentType == 5) {
            this.actionBar.createMenu().addItem(0, C1072R.C1073drawable.ic_ab_other).addSubItem(1, LocaleController.getString("AbortPasswordMenu", C1072R.string.AbortPasswordMenu));
        }
        this.floatingButtonContainer = new FrameLayout(context);
        int i = Build.VERSION.SDK_INT;
        if (i >= 21) {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.m36dp(2.0f), AndroidUtilities.m36dp(4.0f)).setDuration(200L));
            stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.floatingButtonIcon, "translationZ", AndroidUtilities.m36dp(4.0f), AndroidUtilities.m36dp(2.0f)).setDuration(200L));
            this.floatingButtonContainer.setStateListAnimator(stateListAnimator);
            this.floatingButtonContainer.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m36dp(56.0f), AndroidUtilities.m36dp(56.0f));
                }
            });
        }
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(this.floatingButtonContainer);
        this.floatingButtonContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TwoStepVerificationSetupActivity.this.lambda$createView$2(view);
            }
        });
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(1);
        this.floatingButtonIcon.setProgress(0.0f);
        this.floatingButtonIcon.setColor(Theme.getColor("chats_actionIcon"));
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButtonContainer.setContentDescription(LocaleController.getString(C1072R.string.Next));
        this.floatingButtonContainer.addView(this.floatingButtonIcon, LayoutHelper.createFrame(i >= 21 ? 56 : 60, i >= 21 ? 56.0f : 60.0f));
        RadialProgressView radialProgressView = new RadialProgressView(context);
        this.floatingProgressView = radialProgressView;
        radialProgressView.setSize(AndroidUtilities.m36dp(22.0f));
        this.floatingProgressView.setAlpha(0.0f);
        this.floatingProgressView.setScaleX(0.1f);
        this.floatingProgressView.setScaleY(0.1f);
        this.floatingButtonContainer.addView(this.floatingProgressView, LayoutHelper.createFrame(-1, -1.0f));
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m36dp(56.0f), Theme.getColor("chats_actionBackground"), Theme.getColor("chats_actionPressedBackground"));
        if (i < 21) {
            Drawable mutate = context.getResources().getDrawable(C1072R.C1073drawable.floating_shadow).mutate();
            mutate.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable = new CombinedDrawable(mutate, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable.setIconSize(AndroidUtilities.m36dp(56.0f), AndroidUtilities.m36dp(56.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable;
        }
        this.floatingButtonContainer.setBackground(createSimpleSelectorCircleDrawable);
        TextView textView = new TextView(context);
        this.bottomSkipButton = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText2"));
        this.bottomSkipButton.setTextSize(1, 14.0f);
        this.bottomSkipButton.setGravity(19);
        this.bottomSkipButton.setVisibility(8);
        VerticalPositionAutoAnimator.attach(this.bottomSkipButton);
        this.bottomSkipButton.setPadding(AndroidUtilities.m36dp(32.0f), 0, AndroidUtilities.m36dp(32.0f), 0);
        this.bottomSkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TwoStepVerificationSetupActivity.this.lambda$createView$7(view);
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setScaleType(ImageView.ScaleType.CENTER);
        if (this.currentType == 2 && AndroidUtilities.isSmallScreen()) {
            this.imageView.setVisibility(8);
        } else if (!isIntro()) {
            this.imageView.setVisibility(isLandscape() ? 8 : 0);
        }
        TextView textView2 = new TextView(context);
        this.titleTextView = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.m36dp(32.0f), 0, AndroidUtilities.m36dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        SpoilersTextView spoilersTextView = new SpoilersTextView(context);
        this.descriptionText = spoilersTextView;
        spoilersTextView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        this.descriptionText.setVisibility(8);
        this.descriptionText.setPadding(AndroidUtilities.m36dp(32.0f), 0, AndroidUtilities.m36dp(32.0f), 0);
        TextView textView3 = new TextView(context);
        this.descriptionText2 = textView3;
        textView3.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText6"));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setTextSize(1, 14.0f);
        this.descriptionText2.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
        this.descriptionText2.setPadding(AndroidUtilities.m36dp(32.0f), 0, AndroidUtilities.m36dp(32.0f), 0);
        this.descriptionText2.setVisibility(8);
        this.descriptionText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TwoStepVerificationSetupActivity.this.lambda$createView$8(view);
            }
        });
        TextView textView4 = new TextView(context);
        this.buttonTextView = textView4;
        textView4.setMinWidth(AndroidUtilities.m36dp(220.0f));
        this.buttonTextView.setPadding(AndroidUtilities.m36dp(34.0f), 0, AndroidUtilities.m36dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor("featuredStickers_buttonText"));
        this.buttonTextView.setTextSize(1, 15.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRect("featuredStickers_addButton", 6.0f));
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TwoStepVerificationSetupActivity.this.lambda$createView$9(view);
            }
        });
        int i2 = this.currentType;
        if (i2 == 6 || i2 == 7 || i2 == 9) {
            this.titleTextView.setTypeface(Typeface.DEFAULT);
            this.titleTextView.setTextSize(1, 24.0f);
        } else {
            this.titleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.titleTextView.setTextSize(1, 18.0f);
        }
        switch (this.currentType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                final FrameLayout frameLayout = new FrameLayout(context) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, i4);
                        ((ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.m36dp(16.0f);
                    }
                };
                final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                    @Override
                    public void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                        int measuredHeight;
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() == 8 || measureKeyboardHeight() < AndroidUtilities.m36dp(20.0f)) {
                            if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8) {
                                FrameLayout frameLayout2 = frameLayout;
                                int measuredWidth = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight() - AndroidUtilities.m36dp(230.0f);
                                frameLayout2.layout(0, 0, measuredWidth, measuredHeight);
                            } else {
                                FrameLayout frameLayout3 = frameLayout;
                                int measuredWidth2 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                frameLayout3.layout(0, 0, measuredWidth2, measuredHeight);
                            }
                        } else if (TwoStepVerificationSetupActivity.this.isCustomKeyboardVisible()) {
                            FrameLayout frameLayout4 = frameLayout;
                            int measuredWidth3 = getMeasuredWidth();
                            measuredHeight = (getMeasuredHeight() - AndroidUtilities.m36dp(230.0f)) + measureKeyboardHeight();
                            frameLayout4.layout(0, 0, measuredWidth3, measuredHeight);
                        } else {
                            FrameLayout frameLayout5 = frameLayout;
                            int measuredWidth4 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            frameLayout5.layout(0, 0, measuredWidth4, measuredHeight);
                        }
                        TwoStepVerificationSetupActivity.this.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.m36dp(230.0f) + measuredHeight);
                    }

                    @Override
                    protected void onMeasure(int i3, int i4) {
                        int size = View.MeasureSpec.getSize(i3);
                        int size2 = View.MeasureSpec.getSize(i4);
                        setMeasuredDimension(size, size2);
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.m36dp(20.0f)) {
                            size2 -= AndroidUtilities.m36dp(230.0f);
                        }
                        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        TwoStepVerificationSetupActivity.this.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(230.0f), 1073741824));
                    }
                };
                sizeNotifierFrameLayout.addView(frameLayout);
                ViewGroup viewGroup = new ViewGroup(context) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        int size = View.MeasureSpec.getSize(i3);
                        int size2 = View.MeasureSpec.getSize(i4);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i4);
                        TwoStepVerificationSetupActivity.this.actionBarBackground.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.m36dp(3.0f), 1073741824));
                        sizeNotifierFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i4);
                        setMeasuredDimension(size, size2);
                    }

                    @Override
                    protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        TwoStepVerificationSetupActivity.this.actionBarBackground.layout(0, 0, TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredHeight());
                        SizeNotifierFrameLayout sizeNotifierFrameLayout2 = sizeNotifierFrameLayout;
                        sizeNotifierFrameLayout2.layout(0, 0, sizeNotifierFrameLayout2.getMeasuredWidth(), sizeNotifierFrameLayout.getMeasuredHeight());
                    }
                };
                ScrollView scrollView = new ScrollView(context) {
                    private int scrollingUp;
                    private int[] location = new int[2];
                    private Rect tempRect = new Rect();
                    private boolean isLayoutDirty = true;

                    @Override
                    protected void onScrollChanged(int i3, int i4, int i5, int i6) {
                        super.onScrollChanged(i3, i4, i5, i6);
                        if (TwoStepVerificationSetupActivity.this.titleTextView == null) {
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.titleTextView.getLocationOnScreen(this.location);
                        boolean z = this.location[1] + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() < ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getBottom();
                        if (z != (TwoStepVerificationSetupActivity.this.titleTextView.getTag() == null)) {
                            TwoStepVerificationSetupActivity.this.titleTextView.setTag(z ? null : 1);
                            if (TwoStepVerificationSetupActivity.this.actionBarAnimator != null) {
                                TwoStepVerificationSetupActivity.this.actionBarAnimator.cancel();
                                TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                            }
                            TwoStepVerificationSetupActivity.this.actionBarAnimator = new AnimatorSet();
                            AnimatorSet animatorSet = TwoStepVerificationSetupActivity.this.actionBarAnimator;
                            Animator[] animatorArr = new Animator[2];
                            View view = TwoStepVerificationSetupActivity.this.actionBarBackground;
                            Property property = View.ALPHA;
                            float[] fArr = new float[1];
                            fArr[0] = z ? 1.0f : 0.0f;
                            animatorArr[0] = ObjectAnimator.ofFloat(view, property, fArr);
                            SimpleTextView titleTextView = ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getTitleTextView();
                            Property property2 = View.ALPHA;
                            float[] fArr2 = new float[1];
                            fArr2[0] = z ? 1.0f : 0.0f;
                            animatorArr[1] = ObjectAnimator.ofFloat(titleTextView, property2, fArr2);
                            animatorSet.playTogether(animatorArr);
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.setDuration(150L);
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.addListener(new AnimatorListenerAdapter() {
                                @Override
                                public void onAnimationEnd(Animator animator) {
                                    if (animator.equals(TwoStepVerificationSetupActivity.this.actionBarAnimator)) {
                                        TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                                    }
                                }
                            });
                            TwoStepVerificationSetupActivity.this.actionBarAnimator.start();
                        }
                    }

                    @Override
                    public void scrollToDescendant(View view) {
                        view.getDrawingRect(this.tempRect);
                        offsetDescendantRectToMyCoords(view, this.tempRect);
                        this.tempRect.bottom += AndroidUtilities.m36dp(120.0f);
                        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.tempRect);
                        if (computeScrollDeltaToGetChildRectOnScreen < 0) {
                            int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
                            this.scrollingUp = measuredHeight;
                            computeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
                        } else {
                            this.scrollingUp = 0;
                        }
                        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
                            smoothScrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
                        }
                    }

                    @Override
                    public void requestChildFocus(View view, View view2) {
                        if (Build.VERSION.SDK_INT < 29 && view2 != null && !this.isLayoutDirty) {
                            scrollToDescendant(view2);
                        }
                        super.requestChildFocus(view, view2);
                    }

                    @Override
                    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
                        if (Build.VERSION.SDK_INT < 23) {
                            int m36dp = rect.bottom + AndroidUtilities.m36dp(120.0f);
                            rect.bottom = m36dp;
                            int i3 = this.scrollingUp;
                            if (i3 != 0) {
                                rect.top -= i3;
                                rect.bottom = m36dp - i3;
                                this.scrollingUp = 0;
                            }
                        }
                        return super.requestChildRectangleOnScreen(view, rect, z);
                    }

                    @Override
                    public void requestLayout() {
                        this.isLayoutDirty = true;
                        super.requestLayout();
                    }

                    @Override
                    protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                        this.isLayoutDirty = false;
                        super.onLayout(z, i3, i4, i5, i6);
                    }
                };
                this.scrollView = scrollView;
                scrollView.setVerticalScrollBarEnabled(false);
                frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
                frameLayout.addView(this.bottomSkipButton, LayoutHelper.createFrame(-1, i >= 21 ? 56.0f : 60.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                frameLayout.addView(this.floatingButtonContainer, LayoutHelper.createFrame(i >= 21 ? 56 : 60, i >= 21 ? 56.0f : 60.0f, 85, 0.0f, 0.0f, 24.0f, 16.0f));
                viewGroup.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
                LinearLayout linearLayout = new LinearLayout(context) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        super.onMeasure(i3, i4);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.titleTextView.getLayoutParams();
                        int i5 = 0;
                        int m36dp = ((TwoStepVerificationSetupActivity.this.imageView.getVisibility() != 8 || Build.VERSION.SDK_INT < 21) ? 0 : AndroidUtilities.statusBarHeight) + AndroidUtilities.m36dp(8.0f);
                        if (TwoStepVerificationSetupActivity.this.currentType == 2 && AndroidUtilities.isSmallScreen() && !TwoStepVerificationSetupActivity.this.isLandscape()) {
                            i5 = AndroidUtilities.m36dp(32.0f);
                        }
                        marginLayoutParams.topMargin = m36dp + i5;
                    }
                };
                linearLayout.setOrientation(1);
                this.scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -1, 51));
                linearLayout.addView(this.imageView, LayoutHelper.createLinear(-2, -2, 49, 0, 69, 0, 0));
                linearLayout.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                linearLayout.addView(this.descriptionText, LayoutHelper.createLinear(-2, -2, 49, 0, 9, 0, 0));
                OutlineTextContainerView outlineTextContainerView = new OutlineTextContainerView(context);
                this.outlineTextFirstRow = outlineTextContainerView;
                outlineTextContainerView.animateSelection(1.0f, false);
                EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
                this.editTextFirstRow = editTextBoldCursor;
                editTextBoldCursor.setTextSize(1, 18.0f);
                int m36dp = AndroidUtilities.m36dp(16.0f);
                this.editTextFirstRow.setPadding(m36dp, m36dp, m36dp, m36dp);
                this.editTextFirstRow.setCursorColor(Theme.getColor("windowBackgroundWhiteInputFieldActivated"));
                this.editTextFirstRow.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.editTextFirstRow.setBackground(null);
                this.editTextFirstRow.setMaxLines(1);
                this.editTextFirstRow.setLines(1);
                this.editTextFirstRow.setGravity(3);
                this.editTextFirstRow.setCursorSize(AndroidUtilities.m36dp(20.0f));
                this.editTextFirstRow.setSingleLine(true);
                this.editTextFirstRow.setCursorWidth(1.5f);
                this.editTextFirstRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView5, int i3, KeyEvent keyEvent) {
                        boolean lambda$createView$11;
                        lambda$createView$11 = TwoStepVerificationSetupActivity.this.lambda$createView$11(textView5, i3, keyEvent);
                        return lambda$createView$11;
                    }
                });
                this.outlineTextFirstRow.attachEditText(this.editTextFirstRow);
                this.editTextFirstRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        TwoStepVerificationSetupActivity.this.lambda$createView$12(view, z);
                    }
                });
                LinearLayout linearLayout2 = new LinearLayout(context);
                linearLayout2.setOrientation(0);
                linearLayout2.addView(this.editTextFirstRow, LayoutHelper.createLinear(0, -2, 1.0f));
                ImageView imageView = new ImageView(context) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null);
                    }
                };
                this.showPasswordButton = imageView;
                imageView.setImageResource(C1072R.C1073drawable.msg_message);
                this.showPasswordButton.setScaleType(ImageView.ScaleType.CENTER);
                this.showPasswordButton.setContentDescription(LocaleController.getString(C1072R.string.TwoStepVerificationShowPassword));
                if (i >= 21) {
                    this.showPasswordButton.setBackground(Theme.createSelectorDrawable(Theme.getColor("listSelectorSDK21")));
                }
                this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelIcons"), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                this.showPasswordButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        TwoStepVerificationSetupActivity.this.lambda$createView$13(view);
                    }
                });
                linearLayout2.addView(this.showPasswordButton, LayoutHelper.createLinear(24, 24, 16, 0, 0, 16, 0));
                this.editTextFirstRow.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                    }

                    @Override
                    public void afterTextChanged(Editable editable) {
                        if (TwoStepVerificationSetupActivity.this.needPasswordButton) {
                            if (TwoStepVerificationSetupActivity.this.showPasswordButton.getVisibility() == 0 || TextUtils.isEmpty(editable)) {
                                if (TwoStepVerificationSetupActivity.this.showPasswordButton.getVisibility() == 8 || !TextUtils.isEmpty(editable)) {
                                    return;
                                }
                                AndroidUtilities.updateViewVisibilityAnimated(TwoStepVerificationSetupActivity.this.showPasswordButton, false, 0.1f, true);
                                return;
                            }
                            AndroidUtilities.updateViewVisibilityAnimated(TwoStepVerificationSetupActivity.this.showPasswordButton, true, 0.1f, true);
                        }
                    }
                });
                this.outlineTextFirstRow.addView(linearLayout2, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextFirstRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.outlineTextSecondRow = new OutlineTextContainerView(context);
                EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                this.editTextSecondRow = editTextBoldCursor2;
                editTextBoldCursor2.setTextSize(1, 18.0f);
                int m36dp2 = AndroidUtilities.m36dp(16.0f);
                this.editTextSecondRow.setPadding(m36dp2, m36dp2, m36dp2, m36dp2);
                this.editTextSecondRow.setCursorColor(Theme.getColor("windowBackgroundWhiteInputFieldActivated"));
                this.editTextSecondRow.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                this.editTextSecondRow.setBackground(null);
                this.editTextSecondRow.setMaxLines(1);
                this.editTextSecondRow.setLines(1);
                this.editTextSecondRow.setGravity(3);
                this.editTextSecondRow.setCursorSize(AndroidUtilities.m36dp(20.0f));
                this.editTextSecondRow.setSingleLine(true);
                this.editTextSecondRow.setCursorWidth(1.5f);
                this.editTextSecondRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView5, int i3, KeyEvent keyEvent) {
                        boolean lambda$createView$14;
                        lambda$createView$14 = TwoStepVerificationSetupActivity.this.lambda$createView$14(textView5, i3, keyEvent);
                        return lambda$createView$14;
                    }
                });
                this.outlineTextSecondRow.attachEditText(this.editTextSecondRow);
                this.editTextSecondRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view, boolean z) {
                        TwoStepVerificationSetupActivity.this.lambda$createView$15(view, z);
                    }
                });
                this.outlineTextSecondRow.addView(this.editTextSecondRow, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextSecondRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.outlineTextSecondRow.setVisibility(8);
                CustomPhoneKeyboardView customPhoneKeyboardView = new CustomPhoneKeyboardView(context);
                this.keyboardView = customPhoneKeyboardView;
                customPhoneKeyboardView.setVisibility(8);
                sizeNotifierFrameLayout.addView(this.keyboardView);
                CodeFieldContainer codeFieldContainer = new CodeFieldContainer(context) {
                    @Override
                    protected void processNextPressed() {
                        TwoStepVerificationSetupActivity.this.processNext();
                    }
                };
                this.codeFieldContainer = codeFieldContainer;
                codeFieldContainer.setNumbersCount(6, 1);
                for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
                    codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible());
                    codeNumberField.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                        }

                        @Override
                        public void afterTextChanged(Editable editable) {
                            if (TwoStepVerificationSetupActivity.this.postedErrorColorTimeout) {
                                AndroidUtilities.cancelRunOnUIThread(TwoStepVerificationSetupActivity.this.errorColorTimeout);
                                TwoStepVerificationSetupActivity.this.errorColorTimeout.run();
                            }
                        }
                    });
                    codeNumberField.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public final void onFocusChange(View view, boolean z) {
                            TwoStepVerificationSetupActivity.this.lambda$createView$16(view, z);
                        }
                    });
                }
                this.codeFieldContainer.setVisibility(8);
                linearLayout.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout2 = new FrameLayout(context);
                linearLayout.addView(frameLayout2, LayoutHelper.createLinear(-1, -2, 51, 0, 36, 0, 22));
                frameLayout2.addView(this.descriptionText2, LayoutHelper.createFrame(-2, -2, 49));
                if (this.currentType == 4) {
                    TextView textView5 = new TextView(context);
                    this.descriptionText3 = textView5;
                    textView5.setTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
                    this.descriptionText3.setGravity(1);
                    this.descriptionText3.setTextSize(1, 14.0f);
                    this.descriptionText3.setLineSpacing(AndroidUtilities.m36dp(2.0f), 1.0f);
                    this.descriptionText3.setPadding(AndroidUtilities.m36dp(32.0f), 0, AndroidUtilities.m36dp(32.0f), 0);
                    this.descriptionText3.setText(LocaleController.getString("RestoreEmailTroubleNoEmail", C1072R.string.RestoreEmailTroubleNoEmail));
                    linearLayout.addView(this.descriptionText3, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 25));
                    this.descriptionText3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            TwoStepVerificationSetupActivity.this.lambda$createView$18(view);
                        }
                    });
                }
                this.fragmentView = viewGroup;
                View view = new View(context) {
                    private Paint paint = new Paint();

                    @Override
                    protected void onDraw(Canvas canvas) {
                        this.paint.setColor(Theme.getColor("windowBackgroundWhite"));
                        int measuredHeight = getMeasuredHeight() - AndroidUtilities.m36dp(3.0f);
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight, this.paint);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout.drawHeaderShadow(canvas, measuredHeight);
                    }
                };
                this.actionBarBackground = view;
                view.setAlpha(0.0f);
                viewGroup.addView(this.actionBarBackground);
                viewGroup.addView(this.actionBar);
                RadialProgressView radialProgressView2 = new RadialProgressView(context);
                this.radialProgressView = radialProgressView2;
                radialProgressView2.setSize(AndroidUtilities.m36dp(20.0f));
                this.radialProgressView.setAlpha(0.0f);
                this.radialProgressView.setScaleX(0.1f);
                this.radialProgressView.setScaleY(0.1f);
                this.radialProgressView.setProgressColor(Theme.getColor("windowBackgroundWhiteInputFieldActivated"));
                frameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                ViewGroup viewGroup2 = new ViewGroup(context) {
                    @Override
                    protected void onMeasure(int i3, int i4) {
                        int size = View.MeasureSpec.getSize(i3);
                        int size2 = View.MeasureSpec.getSize(i4);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i4);
                        if (size > size2) {
                            float f = size;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i5 = (int) (f * 0.6f);
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(42.0f), 1073741824));
                        } else {
                            float f2 = TwoStepVerificationSetupActivity.this.currentType == 7 ? 160 : 140;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(f2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(f2), 1073741824));
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.m36dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m36dp(50.0f), 1073741824));
                        }
                        setMeasuredDimension(size, size2);
                    }

                    @Override
                    protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, i5, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        int i7 = i5 - i3;
                        int i8 = i6 - i4;
                        if (i5 > i6) {
                            int measuredHeight = (i8 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight()) / 2;
                            TwoStepVerificationSetupActivity.this.imageView.layout(0, measuredHeight, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                            float f = i7;
                            float f2 = 0.4f * f;
                            int i9 = (int) f2;
                            float f3 = i8;
                            int i10 = (int) (0.22f * f3);
                            TwoStepVerificationSetupActivity.this.titleTextView.layout(i9, i10, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth() + i9, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + i10);
                            int i11 = (int) (0.39f * f3);
                            TwoStepVerificationSetupActivity.this.descriptionText.layout(i9, i11, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth() + i9, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + i11);
                            int measuredWidth = (int) (f2 + (((f * 0.6f) - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i12 = (int) (f3 * 0.64f);
                            TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth, i12, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + i12);
                            return;
                        }
                        int i13 = (int) (i8 * 0.3f);
                        int measuredWidth2 = (i7 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth()) / 2;
                        TwoStepVerificationSetupActivity.this.imageView.layout(measuredWidth2, i13, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth() + measuredWidth2, TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + i13);
                        int measuredHeight2 = i13 + TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.m36dp(16.0f);
                        TwoStepVerificationSetupActivity.this.titleTextView.layout(0, measuredHeight2, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + measuredHeight2);
                        int measuredHeight3 = measuredHeight2 + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.m36dp(12.0f);
                        TwoStepVerificationSetupActivity.this.descriptionText.layout(0, measuredHeight3, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + measuredHeight3);
                        int measuredWidth3 = (i7 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight4 = (i8 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.m36dp(48.0f);
                        TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth3, measuredHeight4, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth3, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight4);
                    }
                };
                viewGroup2.setOnTouchListener(TwoStepVerificationSetupActivity$$ExternalSyntheticLambda16.INSTANCE);
                viewGroup2.addView(this.actionBar);
                viewGroup2.addView(this.imageView);
                viewGroup2.addView(this.titleTextView);
                viewGroup2.addView(this.descriptionText);
                viewGroup2.addView(this.buttonTextView);
                this.fragmentView = viewGroup2;
                break;
        }
        this.fragmentView.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        int i3 = this.currentType;
        switch (i3) {
            case 0:
            case 1:
                if (this.currentPassword.has_password) {
                    C1133ActionBar c1133ActionBar = this.actionBar;
                    int i4 = C1072R.string.PleaseEnterNewFirstPassword;
                    c1133ActionBar.setTitle(LocaleController.getString("PleaseEnterNewFirstPassword", i4));
                    this.titleTextView.setText(LocaleController.getString("PleaseEnterNewFirstPassword", i4));
                } else {
                    String string = LocaleController.getString(i3 == 0 ? C1072R.string.CreatePassword : C1072R.string.ReEnterPassword);
                    this.actionBar.setTitle(string);
                    this.titleTextView.setText(string);
                }
                if (!TextUtils.isEmpty(this.emailCode)) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString("YourEmailSkip", C1072R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.outlineTextFirstRow.setText(LocaleController.getString(this.currentType == 0 ? C1072R.string.EnterPassword : C1072R.string.ReEnterPassword));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(this.currentType == 0 ? C1072R.string.EnterPassword : C1072R.string.ReEnterPassword));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.needPasswordButton = this.currentType == 0;
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                RLottieDrawable[] rLottieDrawableArr = new RLottieDrawable[7];
                this.animationDrawables = rLottieDrawableArr;
                int i5 = C1072R.raw.tsv_setup_monkey_idle1;
                rLottieDrawableArr[0] = new RLottieDrawable(i5, "" + i5, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr2 = this.animationDrawables;
                int i6 = C1072R.raw.tsv_setup_monkey_idle2;
                rLottieDrawableArr2[1] = new RLottieDrawable(i6, "" + i6, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr3 = this.animationDrawables;
                int i7 = C1072R.raw.tsv_monkey_close;
                rLottieDrawableArr3[2] = new RLottieDrawable(i7, "" + i7, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr4 = this.animationDrawables;
                int i8 = C1072R.raw.tsv_setup_monkey_peek;
                rLottieDrawableArr4[3] = new RLottieDrawable(i8, "" + i8, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr5 = this.animationDrawables;
                int i9 = C1072R.raw.tsv_setup_monkey_close_and_peek_to_idle;
                rLottieDrawableArr5[4] = new RLottieDrawable(i9, "" + i9, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr6 = this.animationDrawables;
                int i10 = C1072R.raw.tsv_setup_monkey_close_and_peek;
                rLottieDrawableArr6[5] = new RLottieDrawable(i10, "" + i10, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr7 = this.animationDrawables;
                int i11 = C1072R.raw.tsv_setup_monkey_tracking;
                rLottieDrawableArr7[6] = new RLottieDrawable(i11, "" + i11, AndroidUtilities.m36dp(120.0f), AndroidUtilities.m36dp(120.0f), true, null);
                this.animationDrawables[6].setPlayInDirectionOfCustomEndFrame(true);
                this.animationDrawables[6].setCustomEndFrame(19);
                this.animationDrawables[2].setOnFinishCallback(this.finishCallback, 97);
                setRandomMonkeyIdleAnimation(true);
                switchMonkeyAnimation(this.currentType == 1);
                break;
            case 2:
                C1133ActionBar c1133ActionBar2 = this.actionBar;
                int i12 = C1072R.string.PasswordHint;
                c1133ActionBar2.setTitle(LocaleController.getString("PasswordHint", i12));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setText(LocaleController.getString("YourEmailSkip", C1072R.string.YourEmailSkip));
                this.titleTextView.setText(LocaleController.getString("PasswordHint", i12));
                this.descriptionText.setText(LocaleController.getString(C1072R.string.PasswordHintDescription));
                this.descriptionText.setVisibility(0);
                OutlineTextContainerView outlineTextContainerView2 = this.outlineTextFirstRow;
                int i13 = C1072R.string.PasswordHintPlaceholder;
                outlineTextContainerView2.setText(LocaleController.getString(i13));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i13));
                this.editTextFirstRow.setImeOptions(268435461);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(C1072R.raw.tsv_setup_hint, 120, 120);
                this.imageView.playAnimation();
                break;
            case 3:
                C1133ActionBar c1133ActionBar3 = this.actionBar;
                int i14 = C1072R.string.RecoveryEmailTitle;
                c1133ActionBar3.setTitle(LocaleController.getString("RecoveryEmailTitle", i14));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.emailOnly) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString("YourEmailSkip", C1072R.string.YourEmailSkip));
                }
                this.titleTextView.setText(LocaleController.getString("RecoveryEmailTitle", i14));
                OutlineTextContainerView outlineTextContainerView3 = this.outlineTextFirstRow;
                int i15 = C1072R.string.PaymentShippingEmailPlaceholder;
                outlineTextContainerView3.setText(LocaleController.getString(i15));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i15));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(33);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(C1072R.raw.tsv_setup_email_sent, 120, 120);
                this.imageView.playAnimation();
                break;
            case 4:
                C1133ActionBar c1133ActionBar4 = this.actionBar;
                int i16 = C1072R.string.PasswordRecovery;
                c1133ActionBar4.setTitle(LocaleController.getString("PasswordRecovery", i16));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString("PasswordRecovery", i16));
                this.keyboardView.setVisibility(0);
                this.outlineTextFirstRow.setVisibility(8);
                String str = this.currentPassword.email_unconfirmed_pattern;
                String str2 = str != null ? str : "";
                SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(str2);
                int indexOf = str2.indexOf(42);
                int lastIndexOf = str2.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                    textStyleRun.flags |= 256;
                    textStyleRun.start = indexOf;
                    int i17 = lastIndexOf + 1;
                    textStyleRun.end = i17;
                    valueOf.setSpan(new TextStyleSpan(textStyleRun), indexOf, i17, 0);
                }
                this.descriptionText.setText(AndroidUtilities.formatSpannable(LocaleController.getString(C1072R.string.RestoreEmailSent), valueOf));
                this.descriptionText.setVisibility(0);
                this.floatingButtonContainer.setVisibility(8);
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(C1072R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 5:
                C1133ActionBar c1133ActionBar5 = this.actionBar;
                int i18 = C1072R.string.VerificationCode;
                c1133ActionBar5.setTitle(LocaleController.getString("VerificationCode", i18));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString("VerificationCode", i18));
                this.outlineTextFirstRow.setVisibility(8);
                this.keyboardView.setVisibility(0);
                TextView textView6 = this.descriptionText;
                int i19 = C1072R.string.EmailPasswordConfirmText2;
                Object[] objArr = new Object[1];
                String str3 = this.currentPassword.email_unconfirmed_pattern;
                objArr[0] = str3 != null ? str3 : "";
                textView6.setText(LocaleController.formatString("EmailPasswordConfirmText2", i19, objArr));
                this.descriptionText.setVisibility(0);
                this.floatingButtonContainer.setVisibility(8);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.bottomSkipButton.getLayoutParams()).bottomMargin = 0;
                this.bottomSkipButton.setText(LocaleController.getString(C1072R.string.ResendCode));
                this.bottomSkipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        TwoStepVerificationSetupActivity.this.lambda$createView$20(view2);
                    }
                });
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(C1072R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 6:
                this.titleTextView.setText(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle));
                this.descriptionText.setText(LocaleController.getString("SetAdditionalPasswordInfo", C1072R.string.SetAdditionalPasswordInfo));
                this.buttonTextView.setText(LocaleController.getString("TwoStepVerificationSetPassword", C1072R.string.TwoStepVerificationSetPassword));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(C1072R.raw.tsv_setup_intro, 140, 140);
                this.imageView.playAnimation();
                break;
            case 7:
                this.titleTextView.setText(LocaleController.getString("TwoStepVerificationPasswordSet", C1072R.string.TwoStepVerificationPasswordSet));
                this.descriptionText.setText(LocaleController.getString("TwoStepVerificationPasswordSetInfo", C1072R.string.TwoStepVerificationPasswordSetInfo));
                if (this.closeAfterSet) {
                    this.buttonTextView.setText(LocaleController.getString("TwoStepVerificationPasswordReturnPassport", C1072R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.fromRegistration) {
                    this.buttonTextView.setText(LocaleController.getString(C1072R.string.Continue));
                } else {
                    this.buttonTextView.setText(LocaleController.getString("TwoStepVerificationPasswordReturnSettings", C1072R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(C1072R.raw.wallet_allset, 160, 160);
                this.imageView.playAnimation();
                break;
            case 8:
                C1133ActionBar c1133ActionBar6 = this.actionBar;
                int i20 = C1072R.string.PleaseEnterCurrentPassword;
                c1133ActionBar6.setTitle(LocaleController.getString("PleaseEnterCurrentPassword", i20));
                this.titleTextView.setText(LocaleController.getString("PleaseEnterCurrentPassword", i20));
                this.descriptionText.setText(LocaleController.getString("CheckPasswordInfo", C1072R.string.CheckPasswordInfo));
                this.descriptionText.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.descriptionText2.setText(LocaleController.getString("ForgotPassword", C1072R.string.ForgotPassword));
                this.descriptionText2.setTextColor(Theme.getColor("windowBackgroundWhiteBlueText2"));
                OutlineTextContainerView outlineTextContainerView4 = this.outlineTextFirstRow;
                int i21 = C1072R.string.LoginPassword;
                outlineTextContainerView4.setText(LocaleController.getString(i21));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i21));
                this.editTextFirstRow.setImeOptions(268435462);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.imageView.setAnimation(C1072R.raw.wallet_science, 120, 120);
                this.imageView.playAnimation();
                break;
            case 9:
                this.titleTextView.setText(LocaleController.getString("CheckPasswordPerfect", C1072R.string.CheckPasswordPerfect));
                this.descriptionText.setText(LocaleController.getString("CheckPasswordPerfectInfo", C1072R.string.CheckPasswordPerfectInfo));
                this.buttonTextView.setText(LocaleController.getString("CheckPasswordBackToSettings", C1072R.string.CheckPasswordBackToSettings));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(C1072R.raw.wallet_perfect, 140, 140);
                this.imageView.playAnimation();
                break;
        }
        EditTextBoldCursor editTextBoldCursor3 = this.editTextFirstRow;
        if (editTextBoldCursor3 != null) {
            editTextBoldCursor3.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i22, int i23, int i24) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i22, int i23, int i24) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    if (TwoStepVerificationSetupActivity.this.ignoreTextChange) {
                        return;
                    }
                    if (TwoStepVerificationSetupActivity.this.currentType == 0) {
                        RLottieDrawable animatedDrawable = TwoStepVerificationSetupActivity.this.imageView.getAnimatedDrawable();
                        if (TwoStepVerificationSetupActivity.this.editTextFirstRow.length() > 0) {
                            if (TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null) {
                                if (animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[3] || animatedDrawable == TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                                    return;
                                }
                                TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[5]);
                                TwoStepVerificationSetupActivity.this.animationDrawables[5].setProgress(0.0f, false);
                                TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            } else if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3]) {
                                if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                    TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setProgress(0.0f, false);
                                    TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                                } else if (TwoStepVerificationSetupActivity.this.animationDrawables[2].getCurrentFrame() < 49) {
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                }
                            }
                        } else if ((animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3] || TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() != null) && animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                            TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(-1);
                            if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                TwoStepVerificationSetupActivity.this.animationDrawables[2].setCurrentFrame(49, false);
                            }
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        } else {
                            TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[4]);
                            TwoStepVerificationSetupActivity.this.animationDrawables[4].setProgress(0.0f, false);
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        }
                    } else if (TwoStepVerificationSetupActivity.this.currentType == 1) {
                        try {
                            TwoStepVerificationSetupActivity.this.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, TwoStepVerificationSetupActivity.this.editTextFirstRow.getLayout().getLineWidth(0) / TwoStepVerificationSetupActivity.this.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        } catch (Exception e) {
                            FileLog.m32e(e);
                        }
                    } else if (TwoStepVerificationSetupActivity.this.currentType != 8 || editable.length() <= 0) {
                    } else {
                        TwoStepVerificationSetupActivity.this.showDoneButton(true);
                    }
                }
            });
        }
        return this.fragmentView;
    }

    public class C42231 extends C1133ActionBar.ActionBarMenuOnItemClick {
        C42231() {
        }

        @Override
        public void onItemClick(int i) {
            String string;
            if (i == -1) {
                if (TwoStepVerificationSetupActivity.this.otherwiseReloginDays >= 0 && ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout.getFragmentStack().size() == 1) {
                    TwoStepVerificationSetupActivity.this.showSetForcePasswordAlert();
                } else {
                    TwoStepVerificationSetupActivity.this.finishFragment();
                }
            } else if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TwoStepVerificationSetupActivity.this.getParentActivity());
                if (TwoStepVerificationSetupActivity.this.currentPassword != null && TwoStepVerificationSetupActivity.this.currentPassword.has_password) {
                    string = LocaleController.getString("CancelEmailQuestion", C1072R.string.CancelEmailQuestion);
                } else {
                    string = LocaleController.getString("CancelPasswordQuestion", C1072R.string.CancelPasswordQuestion);
                }
                String string2 = LocaleController.getString("CancelEmailQuestionTitle", C1072R.string.CancelEmailQuestionTitle);
                String string3 = LocaleController.getString("Abort", C1072R.string.Abort);
                builder.setMessage(string);
                builder.setTitle(string2);
                builder.setPositiveButton(string3, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        TwoStepVerificationSetupActivity.C42231.this.lambda$onItemClick$0(dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
                AlertDialog create = builder.create();
                TwoStepVerificationSetupActivity.this.showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        }

        public void lambda$onItemClick$0(DialogInterface dialogInterface, int i) {
            TwoStepVerificationSetupActivity.this.setNewPassword(true);
        }
    }

    public void lambda$createView$2(View view) {
        processNext();
    }

    public void lambda$createView$7(View view) {
        int i = this.currentType;
        if (i == 0) {
            needShowProgress();
            TLRPC$TL_auth_recoverPassword tLRPC$TL_auth_recoverPassword = new TLRPC$TL_auth_recoverPassword();
            tLRPC$TL_auth_recoverPassword.code = this.emailCode;
            getConnectionsManager().sendRequest(tLRPC$TL_auth_recoverPassword, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TwoStepVerificationSetupActivity.this.lambda$createView$5(tLObject, tLRPC$TL_error);
                }
            });
        } else if (i != 3) {
            if (i == 2) {
                onHintDone();
            }
        } else {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setMessage(LocaleController.getString("YourEmailSkipWarningText", C1072R.string.YourEmailSkipWarningText));
            builder.setTitle(LocaleController.getString("YourEmailSkipWarning", C1072R.string.YourEmailSkipWarning));
            builder.setPositiveButton(LocaleController.getString("YourEmailSkip", C1072R.string.YourEmailSkip), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    TwoStepVerificationSetupActivity.this.lambda$createView$6(dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
            AlertDialog create = builder.create();
            showDialog(create);
            TextView textView = (TextView) create.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        }
    }

    public void lambda$createView$5(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$createView$4(tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$4(TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        needHideProgress();
        if (tLRPC$TL_error == null) {
            getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TwoStepVerificationSetupActivity.this.lambda$createView$3(dialogInterface, i);
                }
            });
            builder.setMessage(LocaleController.getString("PasswordReset", C1072R.string.PasswordReset));
            builder.setTitle(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle));
            Dialog showDialog = showDialog(builder.create());
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
            }
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            showAlertWithText(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", C1072R.string.FloodWaitTime, formatPluralString));
        } else {
            showAlertWithText(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle), tLRPC$TL_error.text);
        }
    }

    public void lambda$createView$3(DialogInterface dialogInterface, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        finishFragment();
    }

    public void lambda$createView$6(DialogInterface dialogInterface, int i) {
        this.email = "";
        setNewPassword(false);
    }

    public void lambda$createView$8(View view) {
        if (this.currentType == 8) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setForgotPasswordOnShow();
            twoStepVerificationActivity.setPassword(this.currentPassword);
            twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationActivity, true);
        }
    }

    public void lambda$createView$9(View view) {
        processNext();
    }

    public boolean lambda$createView$11(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5 || i == 6) {
            if (this.outlineTextSecondRow.getVisibility() == 0) {
                this.editTextSecondRow.requestFocus();
                return true;
            }
            processNext();
            return true;
        }
        return false;
    }

    public void lambda$createView$12(View view, boolean z) {
        this.outlineTextFirstRow.animateSelection(z ? 1.0f : 0.0f);
    }

    public void lambda$createView$13(View view) {
        this.ignoreTextChange = true;
        if (this.editTextFirstRow.getTransformationMethod() == null) {
            this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
            this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelIcons"), PorterDuff.Mode.MULTIPLY));
            if (this.currentType == 0 && this.editTextFirstRow.length() > 0 && this.editTextFirstRow.hasFocus() && this.monkeyEndCallback == null) {
                this.animationDrawables[3].setCustomEndFrame(-1);
                RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
                RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
                if (animatedDrawable != rLottieDrawableArr[3]) {
                    this.imageView.setAnimation(rLottieDrawableArr[3]);
                    this.animationDrawables[3].setCurrentFrame(18, false);
                }
                this.imageView.playAnimation();
            }
        } else {
            this.editTextFirstRow.setTransformationMethod(null);
            this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("chat_messagePanelSend"), PorterDuff.Mode.MULTIPLY));
            if (this.currentType == 0 && this.editTextFirstRow.length() > 0 && this.editTextFirstRow.hasFocus() && this.monkeyEndCallback == null) {
                this.animationDrawables[3].setCustomEndFrame(18);
                RLottieDrawable animatedDrawable2 = this.imageView.getAnimatedDrawable();
                RLottieDrawable[] rLottieDrawableArr2 = this.animationDrawables;
                if (animatedDrawable2 != rLottieDrawableArr2[3]) {
                    this.imageView.setAnimation(rLottieDrawableArr2[3]);
                }
                this.animationDrawables[3].setProgress(0.0f, false);
                this.imageView.playAnimation();
            }
        }
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        this.ignoreTextChange = false;
    }

    public boolean lambda$createView$14(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 5 || i == 6) {
            processNext();
            return true;
        }
        return false;
    }

    public void lambda$createView$15(View view, boolean z) {
        this.outlineTextSecondRow.animateSelection(z ? 1.0f : 0.0f);
    }

    public void lambda$createView$16(View view, boolean z) {
        if (z) {
            this.keyboardView.setEditText((EditText) view);
            this.keyboardView.setDispatchBackWhenEmpty(true);
        }
    }

    public void lambda$createView$18(View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString("Reset", C1072R.string.Reset), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                TwoStepVerificationSetupActivity.this.lambda$createView$17(dialogInterface, i);
            }
        });
        builder.setTitle(LocaleController.getString("ResetPassword", C1072R.string.ResetPassword));
        builder.setMessage(LocaleController.getString("RestoreEmailTroubleText2", C1072R.string.RestoreEmailTroubleText2));
        showDialog(builder.create());
    }

    public void lambda$createView$17(DialogInterface dialogInterface, int i) {
        onReset();
        finishFragment();
    }

    public void lambda$createView$20(View view) {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_resendPasswordEmail(), TwoStepVerificationSetupActivity$$ExternalSyntheticLambda51.INSTANCE);
        showDialog(new AlertDialog.Builder(getParentActivity()).setMessage(LocaleController.getString("ResendCodeInfo", C1072R.string.ResendCodeInfo)).setTitle(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle)).setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), null).create());
    }

    private boolean isIntro() {
        int i = this.currentType;
        return i == 6 || i == 9 || i == 7;
    }

    public boolean isLandscape() {
        Point point = AndroidUtilities.displaySize;
        return point.x > point.y;
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.imageView != null) {
            if (this.currentType == 2 && AndroidUtilities.isSmallScreen()) {
                this.imageView.setVisibility(8);
            } else if (!isIntro()) {
                this.imageView.setVisibility(isLandscape() ? 8 : 0);
            }
        }
        CustomPhoneKeyboardView customPhoneKeyboardView = this.keyboardView;
        if (customPhoneKeyboardView != null) {
            customPhoneKeyboardView.setVisibility(isCustomKeyboardVisible() ? 0 : 8);
        }
    }

    private void animateSuccess(final Runnable runnable) {
        int i = 0;
        while (true) {
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            CodeNumberField[] codeNumberFieldArr = codeFieldContainer.codeField;
            if (i < codeNumberFieldArr.length) {
                final CodeNumberField codeNumberField = codeNumberFieldArr[i];
                codeNumberField.postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        CodeNumberField.this.animateSuccessProgress(1.0f);
                    }
                }, i * 75);
                i++;
            } else {
                codeFieldContainer.postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        TwoStepVerificationSetupActivity.this.lambda$animateSuccess$22(runnable);
                    }
                }, (this.codeFieldContainer.codeField.length * 75) + 350);
                return;
            }
        }
    }

    public void lambda$animateSuccess$22(Runnable runnable) {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateSuccessProgress(0.0f);
        }
        runnable.run();
    }

    private void switchMonkeyAnimation(boolean z) {
        if (z) {
            Runnable runnable = this.setAnimationRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            this.imageView.setAnimation(this.animationDrawables[6]);
            this.imageView.playAnimation();
            return;
        }
        this.editTextFirstRow.dispatchTextWatchersTextChanged();
        setRandomMonkeyIdleAnimation(true);
    }

    public boolean isCustomKeyboardVisible() {
        int i = this.currentType;
        if ((i == 5 || i == 4) && !AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void onPause() {
        super.onPause();
        this.paused = true;
    }

    @Override
    public void onResume() {
        super.onResume();
        this.paused = false;
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        if (isCustomKeyboardVisible()) {
            AndroidUtilities.requestAltFocusable(getParentActivity(), this.classGuid);
            AndroidUtilities.hideKeyboard(this.fragmentView);
        }
    }

    public void processNext() {
        if (getParentActivity() == null) {
            return;
        }
        switch (this.currentType) {
            case 0:
            case 1:
                if (this.editTextFirstRow.length() == 0) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    return;
                } else if (!this.editTextFirstRow.getText().toString().equals(this.firstPassword) && this.currentType == 1) {
                    AndroidUtilities.shakeViewSpring(this.outlineTextFirstRow, 5.0f);
                    try {
                        this.outlineTextFirstRow.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString("PasswordDoNotMatch", C1072R.string.PasswordDoNotMatch), 0).show();
                        return;
                    } catch (Exception e) {
                        FileLog.m32e(e);
                        return;
                    }
                } else {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, this.currentType != 0 ? 2 : 1, this.currentPassword);
                    twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity.firstPassword = this.editTextFirstRow.getText().toString();
                    twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
                    twoStepVerificationSetupActivity.setCurrentEmailCode(this.emailCode);
                    twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
                    twoStepVerificationSetupActivity.fragmentsToClose.add(this);
                    twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationSetupActivity);
                    return;
                }
            case 2:
                String obj = this.editTextFirstRow.getText().toString();
                this.hint = obj;
                if (obj.equalsIgnoreCase(this.firstPassword)) {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString("PasswordAsHintError", C1072R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e2) {
                        FileLog.m32e(e2);
                    }
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    return;
                }
                onHintDone();
                return;
            case 3:
                String obj2 = this.editTextFirstRow.getText().toString();
                this.email = obj2;
                if (!isValidEmail(obj2)) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    return;
                } else {
                    setNewPassword(false);
                    return;
                }
            case 4:
                final String code = this.codeFieldContainer.getCode();
                TLRPC$TL_auth_checkRecoveryPassword tLRPC$TL_auth_checkRecoveryPassword = new TLRPC$TL_auth_checkRecoveryPassword();
                tLRPC$TL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_auth_checkRecoveryPassword, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        TwoStepVerificationSetupActivity.this.lambda$processNext$31(code, tLObject, tLRPC$TL_error);
                    }
                }, 10);
                return;
            case 5:
                TLRPC$TL_account_confirmPasswordEmail tLRPC$TL_account_confirmPasswordEmail = new TLRPC$TL_account_confirmPasswordEmail();
                tLRPC$TL_account_confirmPasswordEmail.code = this.codeFieldContainer.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_confirmPasswordEmail, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        TwoStepVerificationSetupActivity.this.lambda$processNext$35(tLObject, tLRPC$TL_error);
                    }
                }, 10);
                needShowProgress();
                return;
            case 6:
                TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
                if (tLRPC$account_Password == null) {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                    return;
                }
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(this.currentAccount, 0, tLRPC$account_Password);
                twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
                twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
                twoStepVerificationSetupActivity2.setBlockingAlert(this.otherwiseReloginDays);
                presentFragment(twoStepVerificationSetupActivity2, true);
                return;
            case 7:
                if (this.closeAfterSet) {
                    finishFragment();
                    return;
                } else if (this.fromRegistration) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("afterSignup", true);
                    presentFragment(new DialogsActivity(bundle), true);
                    return;
                } else {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.setCurrentPasswordParams(this.currentPassword, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
                    twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationActivity, true);
                    return;
                }
            case 8:
                if (this.currentPassword == null) {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                    return;
                }
                String obj3 = this.editTextFirstRow.getText().toString();
                if (obj3.length() == 0) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    return;
                }
                final byte[] stringBytes = AndroidUtilities.getStringBytes(obj3);
                needShowProgress();
                Utilities.globalQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        TwoStepVerificationSetupActivity.this.lambda$processNext$28(stringBytes);
                    }
                });
                return;
            case 9:
                finishFragment();
                return;
            default:
                return;
        }
    }

    public void lambda$processNext$28(byte[] bArr) {
        TLRPC$TL_account_getPasswordSettings tLRPC$TL_account_getPasswordSettings = new TLRPC$TL_account_getPasswordSettings();
        TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo = this.currentPassword.current_algo;
        final byte[] x = tLRPC$PasswordKdfAlgo instanceof C1132x72c667f ? SRPHelper.getX(bArr, (C1132x72c667f) tLRPC$PasswordKdfAlgo) : null;
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TwoStepVerificationSetupActivity.this.lambda$processNext$27(x, tLObject, tLRPC$TL_error);
            }
        };
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo2 = tLRPC$account_Password.current_algo;
        if (tLRPC$PasswordKdfAlgo2 instanceof C1132x72c667f) {
            TLRPC$TL_inputCheckPasswordSRP startCheck = SRPHelper.startCheck(x, tLRPC$account_Password.srp_id, tLRPC$account_Password.srp_B, (C1132x72c667f) tLRPC$PasswordKdfAlgo2);
            tLRPC$TL_account_getPasswordSettings.password = startCheck;
            if (startCheck == null) {
                TLRPC$TL_error tLRPC$TL_error = new TLRPC$TL_error();
                tLRPC$TL_error.text = "ALGO_INVALID";
                requestDelegate.run(null, tLRPC$TL_error);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_getPasswordSettings, requestDelegate, 10);
            return;
        }
        TLRPC$TL_error tLRPC$TL_error2 = new TLRPC$TL_error();
        tLRPC$TL_error2.text = "PASSWORD_HASH_INVALID";
        requestDelegate.run(null, tLRPC$TL_error2);
    }

    public void lambda$processNext$27(final byte[] bArr, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$23(bArr);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$26(tLRPC$TL_error);
                }
            });
        }
    }

    public void lambda$processNext$23(byte[] bArr) {
        needHideProgress();
        this.currentPasswordHash = bArr;
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(9, this.currentPassword);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public void lambda$processNext$26(TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        if ("SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error2) {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$25(tLObject, tLRPC$TL_error2);
                }
            }, 8);
            return;
        }
        needHideProgress();
        if ("PASSWORD_HASH_INVALID".equals(tLRPC$TL_error.text)) {
            this.descriptionText.setText(LocaleController.getString("CheckPasswordWrong", C1072R.string.CheckPasswordWrong));
            this.descriptionText.setTextColor(Theme.getColor("windowBackgroundWhiteRedText4"));
            onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, true);
            showDoneButton(false);
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), LocaleController.formatString("FloodWaitTime", C1072R.string.FloodWaitTime, formatPluralString));
        } else {
            showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), tLRPC$TL_error.text);
        }
    }

    public void lambda$processNext$25(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$processNext$24(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$processNext$24(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            this.currentPassword = tLRPC$account_Password;
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$account_Password);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
            processNext();
        }
    }

    public void lambda$processNext$31(final String str, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$processNext$30(tLObject, str, tLRPC$TL_error);
            }
        });
    }

    public void lambda$processNext$30(TLObject tLObject, final String str, TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        if (tLObject instanceof TLRPC$TL_boolTrue) {
            animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$29(str);
                }
            });
        } else if (tLRPC$TL_error == null || tLRPC$TL_error.text.startsWith("CODE_INVALID")) {
            onCodeFieldError(true);
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            showAlertWithText(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", C1072R.string.FloodWaitTime, formatPluralString));
        } else {
            showAlertWithText(LocaleController.getString("TwoStepVerificationTitle", C1072R.string.TwoStepVerificationTitle), tLRPC$TL_error.text);
        }
    }

    public void lambda$processNext$29(String str) {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 0, this.currentPassword);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
        twoStepVerificationSetupActivity.addFragmentToClose(this);
        twoStepVerificationSetupActivity.setCurrentEmailCode(str);
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
    }

    public void lambda$processNext$35(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$processNext$34(tLRPC$TL_error);
            }
        });
    }

    public void lambda$processNext$34(TLRPC$TL_error tLRPC$TL_error) {
        String formatPluralString;
        needHideProgress();
        if (tLRPC$TL_error == null) {
            if (getParentActivity() == null) {
                return;
            }
            animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$33();
                }
            });
        } else if (tLRPC$TL_error.text.startsWith("CODE_INVALID")) {
            onCodeFieldError(true);
        } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
            int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
            if (intValue < 60) {
                formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
            } else {
                formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
            }
            showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), LocaleController.formatString("FloodWaitTime", C1072R.string.FloodWaitTime, formatPluralString));
        } else {
            showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), tLRPC$TL_error.text);
        }
    }

    public void lambda$processNext$33() {
        if (this.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    TwoStepVerificationSetupActivity.this.lambda$processNext$32(dialogInterface, i);
                }
            });
            if (this.currentPassword.has_recovery) {
                builder.setMessage(LocaleController.getString("YourEmailSuccessChangedText", C1072R.string.YourEmailSuccessChangedText));
            } else {
                builder.setMessage(LocaleController.getString("YourEmailSuccessText", C1072R.string.YourEmailSuccessText));
            }
            builder.setTitle(LocaleController.getString("YourPasswordSuccess", C1072R.string.YourPasswordSuccess));
            Dialog showDialog = showDialog(builder.create());
            if (showDialog != null) {
                showDialog.setCanceledOnTouchOutside(false);
                showDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = this.fragmentsToClose.size();
        for (int i = 0; i < size; i++) {
            this.fragmentsToClose.get(i).removeSelfFromStack();
        }
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        tLRPC$account_Password.has_password = true;
        tLRPC$account_Password.has_recovery = true;
        tLRPC$account_Password.email_unconfirmed_pattern = "";
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(7, tLRPC$account_Password);
        twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
        twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
        twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
        twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
        twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationSetupActivity, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i2 = NotificationCenter.twoStepPasswordChanged;
        TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
        notificationCenter.postNotificationName(i2, this.currentPasswordHash, tLRPC$account_Password2.new_algo, tLRPC$account_Password2.new_secure_algo, tLRPC$account_Password2.secure_random, this.email, this.hint, null, this.firstPassword);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    public void lambda$processNext$32(DialogInterface dialogInterface, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
        int i3 = NotificationCenter.twoStepPasswordChanged;
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        notificationCenter.postNotificationName(i3, this.currentPasswordHash, tLRPC$account_Password.new_algo, tLRPC$account_Password.new_secure_algo, tLRPC$account_Password.secure_random, this.email, this.hint, null, this.firstPassword);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
        tLRPC$account_Password2.has_password = true;
        tLRPC$account_Password2.has_recovery = true;
        tLRPC$account_Password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.setCurrentPasswordParams(tLRPC$account_Password2, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    private void onCodeFieldError(boolean z) {
        CodeNumberField[] codeNumberFieldArr;
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            if (z) {
                codeNumberField.setText("");
            }
            codeNumberField.animateErrorProgress(1.0f);
        }
        if (z) {
            this.codeFieldContainer.codeField[0].requestFocus();
        }
        AndroidUtilities.shakeViewSpring(this.codeFieldContainer, 8.0f, new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$onCodeFieldError$37();
            }
        });
    }

    public void lambda$onCodeFieldError$37() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$onCodeFieldError$36();
            }
        }, 150L);
    }

    public void lambda$onCodeFieldError$36() {
        for (CodeNumberField codeNumberField : this.codeFieldContainer.codeField) {
            codeNumberField.animateErrorProgress(0.0f);
        }
    }

    @Override
    public boolean hideKeyboardOnShow() {
        int i = this.currentType;
        return i == 7 || i == 9;
    }

    private void onHintDone() {
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        if (!tLRPC$account_Password.has_recovery) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 3, tLRPC$account_Password);
            twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
            twoStepVerificationSetupActivity.setCurrentPasswordParams(this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
            twoStepVerificationSetupActivity.firstPassword = this.firstPassword;
            twoStepVerificationSetupActivity.hint = this.hint;
            twoStepVerificationSetupActivity.fragmentsToClose.addAll(this.fragmentsToClose);
            twoStepVerificationSetupActivity.fragmentsToClose.add(this);
            twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
            twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationSetupActivity);
            return;
        }
        this.email = "";
        setNewPassword(false);
    }

    public void showDoneButton(final boolean z) {
        if (z == (this.buttonTextView.getTag() != null)) {
            return;
        }
        AnimatorSet animatorSet = this.buttonAnimation;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.buttonTextView.setTag(z ? 1 : null);
        this.buttonAnimation = new AnimatorSet();
        if (z) {
            this.buttonTextView.setVisibility(0);
            this.buttonAnimation.playTogether(ObjectAnimator.ofFloat(this.descriptionText2, View.SCALE_X, 0.9f), ObjectAnimator.ofFloat(this.descriptionText2, View.SCALE_Y, 0.9f), ObjectAnimator.ofFloat(this.descriptionText2, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.buttonTextView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, View.ALPHA, 1.0f));
        } else {
            this.descriptionText2.setVisibility(0);
            this.buttonAnimation.playTogether(ObjectAnimator.ofFloat(this.buttonTextView, View.SCALE_X, 0.9f), ObjectAnimator.ofFloat(this.buttonTextView, View.SCALE_Y, 0.9f), ObjectAnimator.ofFloat(this.buttonTextView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.descriptionText2, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, View.ALPHA, 1.0f));
        }
        this.buttonAnimation.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (TwoStepVerificationSetupActivity.this.buttonAnimation == null || !TwoStepVerificationSetupActivity.this.buttonAnimation.equals(animator)) {
                    return;
                }
                if (z) {
                    TwoStepVerificationSetupActivity.this.descriptionText2.setVisibility(4);
                } else {
                    TwoStepVerificationSetupActivity.this.buttonTextView.setVisibility(4);
                }
            }

            @Override
            public void onAnimationCancel(Animator animator) {
                if (TwoStepVerificationSetupActivity.this.buttonAnimation == null || !TwoStepVerificationSetupActivity.this.buttonAnimation.equals(animator)) {
                    return;
                }
                TwoStepVerificationSetupActivity.this.buttonAnimation = null;
            }
        });
        this.buttonAnimation.setDuration(150L);
        this.buttonAnimation.start();
    }

    private void setRandomMonkeyIdleAnimation(boolean r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.TwoStepVerificationSetupActivity.setRandomMonkeyIdleAnimation(boolean):void");
    }

    public void lambda$setRandomMonkeyIdleAnimation$38() {
        if (this.setAnimationRunnable == null) {
            return;
        }
        setRandomMonkeyIdleAnimation(false);
    }

    public void setCloseAfterSet(boolean z) {
        this.closeAfterSet = z;
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z) {
            if (this.editTextFirstRow != null && !isCustomKeyboardVisible()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        TwoStepVerificationSetupActivity.this.lambda$onTransitionAnimationEnd$39();
                    }
                }, 200L);
            }
            CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
            if (codeFieldContainer == null || codeFieldContainer.getVisibility() != 0) {
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.this.lambda$onTransitionAnimationEnd$40();
                }
            }, 200L);
        }
    }

    public void lambda$onTransitionAnimationEnd$39() {
        EditTextBoldCursor editTextBoldCursor = this.editTextFirstRow;
        if (editTextBoldCursor == null || editTextBoldCursor.getVisibility() != 0) {
            return;
        }
        this.editTextFirstRow.requestFocus();
        AndroidUtilities.showKeyboard(this.editTextFirstRow);
    }

    public void lambda$onTransitionAnimationEnd$40() {
        CodeFieldContainer codeFieldContainer = this.codeFieldContainer;
        if (codeFieldContainer == null || codeFieldContainer.getVisibility() != 0) {
            return;
        }
        this.codeFieldContainer.codeField[0].requestFocus();
    }

    private void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                TwoStepVerificationSetupActivity.this.lambda$loadPasswordInfo$42(tLObject, tLRPC$TL_error);
            }
        }, 10);
    }

    public void lambda$loadPasswordInfo$42(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$loadPasswordInfo$41(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadPasswordInfo$41(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            this.currentPassword = tLRPC$account_Password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(tLRPC$account_Password, false)) {
                AlertsCreator.showUpdateAppAlert(getParentActivity(), LocaleController.getString("UpdateAppAlert", C1072R.string.UpdateAppAlert), true);
                return;
            }
            this.waitingForEmail = !TextUtils.isEmpty(this.currentPassword.email_unconfirmed_pattern);
            TwoStepVerificationActivity.initPasswordNewAlgo(this.currentPassword);
            if (!this.paused && this.closeAfterSet) {
                TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
                if (tLRPC$account_Password2.has_password) {
                    TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo = tLRPC$account_Password2.current_algo;
                    TLRPC$SecurePasswordKdfAlgo tLRPC$SecurePasswordKdfAlgo = tLRPC$account_Password2.new_secure_algo;
                    byte[] bArr = tLRPC$account_Password2.secure_random;
                    String str = tLRPC$account_Password2.has_recovery ? "1" : null;
                    String str2 = tLRPC$account_Password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!this.waitingForEmail && tLRPC$PasswordKdfAlgo != null) {
                        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, null, tLRPC$PasswordKdfAlgo, tLRPC$SecurePasswordKdfAlgo, bArr, str, str2, null, null);
                        finishFragment();
                    }
                }
            }
            if (this.doneAfterPasswordLoad) {
                needHideProgress();
                processNext();
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    private void needShowProgress() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.floatingButtonContainer.getVisibility() == 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.floatingProgressView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.floatingProgressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.floatingProgressView, View.SCALE_Y, 1.0f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.SCALE_Y, 0.1f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.radialProgressView, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_Y, 1.0f));
        }
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.start();
    }

    protected void needHideProgress() {
        AnimatorSet animatorSet = new AnimatorSet();
        if (this.floatingButtonContainer.getVisibility() == 0) {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.floatingProgressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.floatingProgressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.floatingProgressView, View.SCALE_Y, 0.1f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.ALPHA, 1.0f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(this.floatingButtonIcon, View.SCALE_Y, 1.0f));
        } else {
            animatorSet.playTogether(ObjectAnimator.ofFloat(this.radialProgressView, View.ALPHA, 0.0f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_X, 0.1f), ObjectAnimator.ofFloat(this.radialProgressView, View.SCALE_Y, 0.1f));
        }
        animatorSet.setInterpolator(CubicBezierInterpolator.DEFAULT);
        animatorSet.start();
    }

    private boolean isValidEmail(String str) {
        if (str == null || str.length() < 3) {
            return false;
        }
        int lastIndexOf = str.lastIndexOf(46);
        int lastIndexOf2 = str.lastIndexOf(64);
        return lastIndexOf2 >= 0 && lastIndexOf >= lastIndexOf2;
    }

    private void showAlertWithText(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    public void setNewPassword(final boolean z) {
        TLRPC$account_Password tLRPC$account_Password;
        TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings;
        if (z && this.waitingForEmail && this.currentPassword.has_password) {
            needShowProgress();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                public static int constructor = -1043606090;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    TwoStepVerificationSetupActivity.this.lambda$setNewPassword$44(tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        final String str = this.firstPassword;
        final TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings = new TLRPC$TL_account_passwordInputSettings();
        if (z) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.currentSecret = null;
            if (this.waitingForEmail) {
                tLRPC$TL_account_passwordInputSettings.flags = 2;
                tLRPC$TL_account_passwordInputSettings.email = "";
            } else {
                tLRPC$TL_account_passwordInputSettings.flags = 3;
                tLRPC$TL_account_passwordInputSettings.hint = "";
                tLRPC$TL_account_passwordInputSettings.new_password_hash = new byte[0];
                tLRPC$TL_account_passwordInputSettings.new_algo = new TLRPC$TL_passwordKdfAlgoUnknown();
                tLRPC$TL_account_passwordInputSettings.email = "";
            }
        } else {
            if (this.hint == null && (tLRPC$account_Password = this.currentPassword) != null) {
                this.hint = tLRPC$account_Password.hint;
            }
            if (this.hint == null) {
                this.hint = "";
            }
            if (str != null) {
                tLRPC$TL_account_passwordInputSettings.flags |= 1;
                tLRPC$TL_account_passwordInputSettings.hint = this.hint;
                tLRPC$TL_account_passwordInputSettings.new_algo = this.currentPassword.new_algo;
            }
            if (this.email.length() > 0) {
                tLRPC$TL_account_passwordInputSettings.flags = 2 | tLRPC$TL_account_passwordInputSettings.flags;
                tLRPC$TL_account_passwordInputSettings.email = this.email.trim();
            }
        }
        if (this.emailCode != null) {
            TLRPC$TL_auth_recoverPassword tLRPC$TL_auth_recoverPassword = new TLRPC$TL_auth_recoverPassword();
            tLRPC$TL_auth_recoverPassword.code = this.emailCode;
            tLRPC$TL_auth_recoverPassword.new_settings = tLRPC$TL_account_passwordInputSettings;
            tLRPC$TL_auth_recoverPassword.flags |= 1;
            tLRPC$TL_account_updatePasswordSettings = tLRPC$TL_auth_recoverPassword;
        } else {
            TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings2 = new TLRPC$TL_account_updatePasswordSettings();
            byte[] bArr = this.currentPasswordHash;
            if (bArr == null || bArr.length == 0 || (z && this.waitingForEmail)) {
                tLRPC$TL_account_updatePasswordSettings2.password = new TLRPC$TL_inputCheckPasswordEmpty();
            }
            tLRPC$TL_account_updatePasswordSettings2.new_settings = tLRPC$TL_account_passwordInputSettings;
            tLRPC$TL_account_updatePasswordSettings = tLRPC$TL_account_updatePasswordSettings2;
        }
        final TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings3 = tLRPC$TL_account_updatePasswordSettings;
        needShowProgress();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$setNewPassword$50(tLRPC$TL_account_updatePasswordSettings3, z, str, tLRPC$TL_account_passwordInputSettings);
            }
        });
    }

    public void lambda$setNewPassword$44(TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$setNewPassword$43(tLRPC$TL_error);
            }
        });
    }

    public void lambda$setNewPassword$43(TLRPC$TL_error tLRPC$TL_error) {
        needHideProgress();
        if (tLRPC$TL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
            tLRPC$account_Password.has_recovery = false;
            tLRPC$account_Password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.setCurrentPasswordParams(tLRPC$account_Password, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
            twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
        }
    }

    public void lambda$setNewPassword$50(TLObject tLObject, final boolean z, final String str, final TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings) {
        final byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        if (tLObject instanceof TLRPC$TL_account_updatePasswordSettings) {
            TLRPC$TL_account_updatePasswordSettings tLRPC$TL_account_updatePasswordSettings = (TLRPC$TL_account_updatePasswordSettings) tLObject;
            if (tLRPC$TL_account_updatePasswordSettings.password == null) {
                tLRPC$TL_account_updatePasswordSettings.password = getNewSrpPassword();
            }
        }
        if (z || str == null) {
            bArr = null;
            bArr2 = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo = this.currentPassword.new_algo;
            if (tLRPC$PasswordKdfAlgo instanceof C1132x72c667f) {
                bArr2 = stringBytes;
                bArr = SRPHelper.getX(stringBytes, (C1132x72c667f) tLRPC$PasswordKdfAlgo);
            } else {
                bArr2 = stringBytes;
                bArr = null;
            }
        }
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error) {
                TwoStepVerificationSetupActivity.this.lambda$setNewPassword$49(z, bArr, str, tLRPC$TL_account_passwordInputSettings, tLObject2, tLRPC$TL_error);
            }
        };
        if (!z) {
            if (str != null && (bArr3 = this.currentSecret) != null && bArr3.length == 32) {
                TLRPC$SecurePasswordKdfAlgo tLRPC$SecurePasswordKdfAlgo = this.currentPassword.new_secure_algo;
                if (tLRPC$SecurePasswordKdfAlgo instanceof TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) tLRPC$SecurePasswordKdfAlgo;
                    byte[] computePBKDF2 = Utilities.computePBKDF2(bArr2, tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr4 = new byte[32];
                    System.arraycopy(computePBKDF2, 0, bArr4, 0, 32);
                    byte[] bArr5 = new byte[16];
                    System.arraycopy(computePBKDF2, 32, bArr5, 0, 16);
                    byte[] bArr6 = new byte[32];
                    System.arraycopy(this.currentSecret, 0, bArr6, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr6, bArr4, bArr5, 0, 32, 0, 1);
                    TLRPC$TL_secureSecretSettings tLRPC$TL_secureSecretSettings = new TLRPC$TL_secureSecretSettings();
                    tLRPC$TL_account_passwordInputSettings.new_secure_settings = tLRPC$TL_secureSecretSettings;
                    tLRPC$TL_secureSecretSettings.secure_algo = tLRPC$TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tLRPC$TL_secureSecretSettings.secure_secret = bArr6;
                    tLRPC$TL_secureSecretSettings.secure_secret_id = this.currentSecretId;
                    tLRPC$TL_account_passwordInputSettings.flags |= 4;
                }
            }
            TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo2 = this.currentPassword.new_algo;
            if (tLRPC$PasswordKdfAlgo2 instanceof C1132x72c667f) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr2, (C1132x72c667f) tLRPC$PasswordKdfAlgo2);
                    tLRPC$TL_account_passwordInputSettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC$TL_error tLRPC$TL_error = new TLRPC$TL_error();
                        tLRPC$TL_error.text = "ALGO_INVALID";
                        requestDelegate.run(null, tLRPC$TL_error);
                    }
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, requestDelegate, 10);
                return;
            }
            TLRPC$TL_error tLRPC$TL_error2 = new TLRPC$TL_error();
            tLRPC$TL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tLRPC$TL_error2);
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLObject, requestDelegate, 10);
    }

    public void lambda$setNewPassword$49(final boolean z, final byte[] bArr, final String str, final TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$setNewPassword$48(tLRPC$TL_error, z, tLObject, bArr, str, tLRPC$TL_account_passwordInputSettings);
            }
        });
    }

    public void lambda$setNewPassword$48(TLRPC$TL_error tLRPC$TL_error, final boolean z, TLObject tLObject, final byte[] bArr, String str, TLRPC$TL_account_passwordInputSettings tLRPC$TL_account_passwordInputSettings) {
        String formatPluralString;
        TLRPC$account_Password tLRPC$account_Password;
        if (tLRPC$TL_error != null && "SRP_ID_INVALID".equals(tLRPC$TL_error.text)) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC$TL_account_getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    TwoStepVerificationSetupActivity.this.lambda$setNewPassword$46(z, tLObject2, tLRPC$TL_error2);
                }
            }, 8);
            return;
        }
        needHideProgress();
        if (tLRPC$TL_error != null || (!(tLObject instanceof TLRPC$TL_boolTrue) && !(tLObject instanceof TLRPC$auth_Authorization))) {
            if (tLRPC$TL_error != null) {
                if ("EMAIL_UNCONFIRMED".equals(tLRPC$TL_error.text) || tLRPC$TL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                    int size = this.fragmentsToClose.size();
                    for (int i = 0; i < size; i++) {
                        this.fragmentsToClose.get(i).removeSelfFromStack();
                    }
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(this.currentAccount);
                    int i2 = NotificationCenter.twoStepPasswordChanged;
                    TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
                    String str2 = this.email;
                    notificationCenter.postNotificationName(i2, bArr, tLRPC$TL_account_passwordInputSettings.new_algo, tLRPC$account_Password2.new_secure_algo, tLRPC$account_Password2.secure_random, str2, this.hint, str2, this.firstPassword);
                    TLRPC$account_Password tLRPC$account_Password3 = this.currentPassword;
                    tLRPC$account_Password3.email_unconfirmed_pattern = this.email;
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(5, tLRPC$account_Password3);
                    twoStepVerificationSetupActivity.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity.setCurrentPasswordParams(bArr != null ? bArr : this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
                    twoStepVerificationSetupActivity.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationSetupActivity, true);
                    return;
                } else if ("EMAIL_INVALID".equals(tLRPC$TL_error.text)) {
                    showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), LocaleController.getString("PasswordEmailInvalid", C1072R.string.PasswordEmailInvalid));
                    return;
                } else if (tLRPC$TL_error.text.startsWith("FLOOD_WAIT")) {
                    int intValue = Utilities.parseInt((CharSequence) tLRPC$TL_error.text).intValue();
                    if (intValue < 60) {
                        formatPluralString = LocaleController.formatPluralString("Seconds", intValue, new Object[0]);
                    } else {
                        formatPluralString = LocaleController.formatPluralString("Minutes", intValue / 60, new Object[0]);
                    }
                    showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), LocaleController.formatString("FloodWaitTime", C1072R.string.FloodWaitTime, formatPluralString));
                    return;
                } else {
                    showAlertWithText(LocaleController.getString("AppName", C1072R.string.AppName), tLRPC$TL_error.text);
                    return;
                }
            }
            return;
        }
        getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z) {
            int size2 = this.fragmentsToClose.size();
            for (int i3 = 0; i3 < size2; i3++) {
                this.fragmentsToClose.get(i3).removeSelfFromStack();
            }
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            finishFragment();
        } else if (getParentActivity() != null) {
            if (this.currentPassword.has_password) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        TwoStepVerificationSetupActivity.this.lambda$setNewPassword$47(bArr, dialogInterface, i4);
                    }
                });
                if (str == null && (tLRPC$account_Password = this.currentPassword) != null && tLRPC$account_Password.has_password) {
                    builder.setMessage(LocaleController.getString("YourEmailSuccessText", C1072R.string.YourEmailSuccessText));
                } else {
                    builder.setMessage(LocaleController.getString("YourPasswordChangedSuccessText", C1072R.string.YourPasswordChangedSuccessText));
                }
                builder.setTitle(LocaleController.getString("YourPasswordSuccess", C1072R.string.YourPasswordSuccess));
                Dialog showDialog = showDialog(builder.create());
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            }
            int size3 = this.fragmentsToClose.size();
            for (int i4 = 0; i4 < size3; i4++) {
                this.fragmentsToClose.get(i4).removeSelfFromStack();
            }
            TLRPC$account_Password tLRPC$account_Password4 = this.currentPassword;
            tLRPC$account_Password4.has_password = true;
            if (!tLRPC$account_Password4.has_recovery) {
                tLRPC$account_Password4.has_recovery = !TextUtils.isEmpty(tLRPC$account_Password4.email_unconfirmed_pattern);
            }
            if (this.closeAfterSet) {
                NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
            }
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(7, this.currentPassword);
            twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
            twoStepVerificationSetupActivity2.setCurrentPasswordParams(bArr != null ? bArr : this.currentPasswordHash, this.currentSecretId, this.currentSecret, this.emailOnly);
            twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
            twoStepVerificationSetupActivity2.setBlockingAlert(this.otherwiseReloginDays);
            presentFragment(twoStepVerificationSetupActivity2, true);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public void lambda$setNewPassword$46(final boolean z, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.this.lambda$setNewPassword$45(tLRPC$TL_error, tLObject, z);
            }
        });
    }

    public void lambda$setNewPassword$45(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject, boolean z) {
        if (tLRPC$TL_error == null) {
            TLRPC$account_Password tLRPC$account_Password = (TLRPC$account_Password) tLObject;
            this.currentPassword = tLRPC$account_Password;
            TwoStepVerificationActivity.initPasswordNewAlgo(tLRPC$account_Password);
            setNewPassword(z);
            NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
        }
    }

    public void lambda$setNewPassword$47(byte[] bArr, DialogInterface dialogInterface, int i) {
        int size = this.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.fragmentsToClose.get(i2).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        tLRPC$account_Password.has_password = true;
        if (!tLRPC$account_Password.has_recovery) {
            tLRPC$account_Password.has_recovery = !TextUtils.isEmpty(tLRPC$account_Password.email_unconfirmed_pattern);
        }
        TLRPC$account_Password tLRPC$account_Password2 = this.currentPassword;
        if (bArr == null) {
            bArr = this.currentPasswordHash;
        }
        twoStepVerificationActivity.setCurrentPasswordParams(tLRPC$account_Password2, bArr, this.currentSecretId, this.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
        presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(this.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, this.currentPassword);
    }

    protected TLRPC$TL_inputCheckPasswordSRP getNewSrpPassword() {
        TLRPC$account_Password tLRPC$account_Password = this.currentPassword;
        TLRPC$PasswordKdfAlgo tLRPC$PasswordKdfAlgo = tLRPC$account_Password.current_algo;
        if (tLRPC$PasswordKdfAlgo instanceof C1132x72c667f) {
            return SRPHelper.startCheck(this.currentPasswordHash, tLRPC$account_Password.srp_id, tLRPC$account_Password.srp_B, (C1132x72c667f) tLRPC$PasswordKdfAlgo);
        }
        return null;
    }

    private void onFieldError(View view, TextView textView, boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            textView.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (z) {
            textView.setText("");
        }
        AndroidUtilities.shakeViewSpring(view, 5.0f);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText6"));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, "windowBackgroundWhiteHintText"));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputField"));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "windowBackgroundWhiteInputFieldActivated"));
        return arrayList;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if (this.otherwiseReloginDays < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            return super.isSwipeBackEnabled(motionEvent);
        }
        return false;
    }

    @Override
    public boolean onBackPressed() {
        if (this.otherwiseReloginDays >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            showSetForcePasswordAlert();
            return false;
        }
        finishFragment();
        return true;
    }

    @Override
    public void finishFragment(boolean z) {
        for (BaseFragment baseFragment : getParentLayout().getFragmentStack()) {
            if (baseFragment != this && (baseFragment instanceof TwoStepVerificationSetupActivity)) {
                ((TwoStepVerificationSetupActivity) baseFragment).floatingAutoAnimator.ignoreNextLayout();
            }
        }
        super.finishFragment(z);
    }

    public void showSetForcePasswordAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString("Warning", C1072R.string.Warning));
        builder.setMessage(LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.otherwiseReloginDays, new Object[0]));
        builder.setPositiveButton(LocaleController.getString("TwoStepVerificationSetPassword", C1072R.string.TwoStepVerificationSetPassword), null);
        builder.setNegativeButton(LocaleController.getString("ForceSetPasswordCancel", C1072R.string.ForceSetPasswordCancel), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                TwoStepVerificationSetupActivity.this.lambda$showSetForcePasswordAlert$51(dialogInterface, i);
            }
        });
        ((TextView) builder.show().getButton(-2)).setTextColor(Theme.getColor("dialogTextRed2"));
    }

    public void lambda$showSetForcePasswordAlert$51(DialogInterface dialogInterface, int i) {
        finishFragment();
    }

    public void setBlockingAlert(int i) {
        this.otherwiseReloginDays = i;
    }

    @Override
    public void finishFragment() {
        if (this.otherwiseReloginDays >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("afterSignup", true);
            presentFragment(new DialogsActivity(bundle), true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) > 0.699999988079071d;
    }
}