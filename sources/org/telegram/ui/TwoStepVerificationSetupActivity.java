package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SRPHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.SimpleTextView;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.CustomPhoneKeyboardView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.OutlineTextContainerView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TextStyleSpan;
import org.telegram.ui.Components.TransformableLoginButtonView;
import org.telegram.ui.Components.VerticalPositionAutoAnimator;
import org.telegram.ui.Components.spoilers.SpoilersTextView;

public class TwoStepVerificationSetupActivity extends BaseFragment {
    private AnimatorSet actionBarAnimator;
    private View actionBarBackground;
    private RLottieDrawable[] animationDrawables;
    private TextView bottomSkipButton;
    private AnimatorSet buttonAnimation;
    private TextView buttonTextView;
    private boolean closeAfterSet;
    private CodeFieldContainer codeFieldContainer;
    private TL_account.Password currentPassword;
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
    private int emailCodeLength;
    private boolean emailOnly;
    private Runnable errorColorTimeout;
    private Runnable finishCallback;
    private String firstPassword;
    private VerticalPositionAutoAnimator floatingAutoAnimator;
    private FragmentFloatingButton floatingButton;
    private TransformableLoginButtonView floatingButtonIcon;
    private ArrayList fragmentsToClose;
    private boolean fromRegistration;
    private String hint;
    private boolean ignoreTextChange;
    private RLottieImageView imageView;
    private boolean isPasswordVisible;
    private CustomPhoneKeyboardView keyboardView;
    private Runnable monkeyEndCallback;
    private boolean needPasswordButton;
    private Runnable openedSettings;
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

    public static boolean $r8$lambda$fxnuijeVnmI5keukH7UodhEZbkQ(View view, MotionEvent motionEvent) {
        return true;
    }

    public static void m4758$r8$lambda$naAx62nkPfgaXd8Nj5qDcZ2b_w(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    @Override
    public boolean hasForceLightStatusBar() {
        return true;
    }

    protected void onReset() {
    }

    public static void $r8$lambda$rvu_aB0Sag7Sewv3p1B3lj3Hdjs(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        int i = 0;
        twoStepVerificationSetupActivity.postedErrorColorTimeout = false;
        while (true) {
            CodeNumberField[] codeNumberFieldArr = twoStepVerificationSetupActivity.codeFieldContainer.codeField;
            if (i >= codeNumberFieldArr.length) {
                return;
            }
            codeNumberFieldArr[i].animateErrorProgress(0.0f);
            i++;
        }
    }

    public static void m4756$r8$lambda$hAzilGch2W4fqTBXIcvkXckJI(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity.editTextFirstRow;
        if (editTextBoldCursor == null) {
            return;
        }
        if (editTextBoldCursor.length() != 0) {
            twoStepVerificationSetupActivity.animationDrawables[2].setCustomEndFrame(49);
            twoStepVerificationSetupActivity.animationDrawables[2].setProgress(0.0f, false);
            twoStepVerificationSetupActivity.imageView.playAnimation();
            return;
        }
        twoStepVerificationSetupActivity.setRandomMonkeyIdleAnimation(true);
    }

    public void setOnOpenedSettings(Runnable runnable) {
        this.openedSettings = runnable;
    }

    public TwoStepVerificationSetupActivity(int i, TL_account.Password password) {
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList();
        this.emailCodeLength = 6;
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$rvu_aB0Sag7Sewv3p1B3lj3Hdjs(this.f$0);
            }
        };
        this.finishCallback = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4756$r8$lambda$hAzilGch2W4fqTBXIcvkXckJI(this.f$0);
            }
        };
        this.currentType = i;
        this.currentPassword = password;
        if (password == null && (i == 6 || i == 8)) {
            loadPasswordInfo();
        } else {
            this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
    }

    public TwoStepVerificationSetupActivity(int i, int i2, TL_account.Password password) {
        this.needPasswordButton = false;
        this.otherwiseReloginDays = -1;
        this.fragmentsToClose = new ArrayList();
        this.emailCodeLength = 6;
        this.currentPasswordHash = new byte[0];
        this.errorColorTimeout = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$rvu_aB0Sag7Sewv3p1B3lj3Hdjs(this.f$0);
            }
        };
        this.finishCallback = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4756$r8$lambda$hAzilGch2W4fqTBXIcvkXckJI(this.f$0);
            }
        };
        this.currentAccount = i;
        this.currentType = i2;
        this.currentPassword = password;
        this.waitingForEmail = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
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
        this.doneAfterPasswordLoad = false;
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.setAnimationRunnable = null;
        }
        if (this.animationDrawables != null) {
            int i = 0;
            while (true) {
                RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
                if (i >= rLottieDrawableArr.length) {
                    break;
                }
                rLottieDrawableArr[i].recycle(false);
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
        char c;
        char c2;
        int i;
        int i2;
        EditTextBoldCursor editTextBoldCursor;
        int i3;
        int i4;
        int i5;
        boolean z;
        SpannableStringBuilder spannableStringBuilderValueOf;
        int iIndexOf;
        int iLastIndexOf;
        LinearLayout linearLayout;
        int i6;
        this.actionBar.setBackgroundDrawable(null);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        ActionBar actionBar = this.actionBar;
        int i7 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setTitleColor(Theme.getColor(i7));
        this.actionBar.setItemsColor(Theme.getColor(i7), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(Theme.key_actionBarWhiteSelector), false);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new AnonymousClass1());
        if (this.currentType == 5) {
            c = 5;
            this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_other).addSubItem(1, LocaleController.getString(R.string.AbortPasswordMenu));
        } else {
            c = 5;
        }
        FragmentFloatingButton fragmentFloatingButton = new FragmentFloatingButton(context, this.resourceProvider);
        this.floatingButton = fragmentFloatingButton;
        this.floatingAutoAnimator = VerticalPositionAutoAnimator.attach(fragmentFloatingButton);
        this.floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.processNext();
            }
        });
        TransformableLoginButtonView transformableLoginButtonView = new TransformableLoginButtonView(context);
        this.floatingButtonIcon = transformableLoginButtonView;
        transformableLoginButtonView.setTransformType(1);
        this.floatingButtonIcon.setProgress(0.0f);
        this.floatingButtonIcon.setColor(Theme.getColor(Theme.key_chats_actionIcon));
        this.floatingButtonIcon.setDrawBackground(false);
        this.floatingButton.setContentDescription(LocaleController.getString(R.string.Next));
        this.floatingButton.addView(this.floatingButtonIcon, LayoutHelper.createFrame(56, 56, 17));
        this.floatingButton.addAdditionalView(this.floatingButtonIcon);
        TextView textView = new TextView(context);
        this.bottomSkipButton = textView;
        textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2));
        this.bottomSkipButton.setTextSize(1, 14.0f);
        this.bottomSkipButton.setGravity(19);
        this.bottomSkipButton.setVisibility(8);
        VerticalPositionAutoAnimator.attach(this.bottomSkipButton);
        this.bottomSkipButton.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.bottomSkipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                TwoStepVerificationSetupActivity.$r8$lambda$g21FwuK9K2wZyKt8Ht_rUIF2M2E(this.f$0, view);
            }
        });
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        rLottieImageView.setScaleType(scaleType);
        if (this.currentType == 2 && AndroidUtilities.isSmallScreen()) {
            this.imageView.setVisibility(8);
        } else {
            if (!isIntro()) {
                c2 = 2;
                this.imageView.setVisibility(isLandscape() ? 8 : 0);
            }
            TextView textView2 = new TextView(context);
            this.titleTextView = textView2;
            textView2.setTextColor(Theme.getColor(i7));
            this.titleTextView.setGravity(1);
            this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            this.titleTextView.setTextSize(1, 24.0f);
            SpoilersTextView spoilersTextView = new SpoilersTextView(context);
            this.descriptionText = spoilersTextView;
            int i8 = Theme.key_windowBackgroundWhiteGrayText6;
            spoilersTextView.setTextColor(Theme.getColor(i8));
            this.descriptionText.setGravity(1);
            this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.descriptionText.setTextSize(1, 15.0f);
            this.descriptionText.setVisibility(8);
            this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            TextView textView3 = new TextView(context);
            this.descriptionText2 = textView3;
            textView3.setTextColor(Theme.getColor(i8));
            this.descriptionText2.setGravity(1);
            this.descriptionText2.setTextSize(1, 14.0f);
            this.descriptionText2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
            this.descriptionText2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
            this.descriptionText2.setVisibility(8);
            this.descriptionText2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    TwoStepVerificationSetupActivity.m4742$r8$lambda$6gs3JNtES69Dont1yIOGaI8Lc(this.f$0, view);
                }
            });
            TextView textView4 = new TextView(context);
            this.buttonTextView = textView4;
            textView4.setMinWidth(AndroidUtilities.dp(220.0f));
            this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.buttonTextView.setGravity(17);
            this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
            this.buttonTextView.setTextSize(1, 15.0f);
            this.buttonTextView.setTypeface(AndroidUtilities.bold());
            this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 6.0f));
            this.buttonTextView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.processNext();
                }
            });
            i = this.currentType;
            if (i != 6 || i == 7 || i == 9) {
                this.titleTextView.setTypeface(Typeface.DEFAULT);
                this.titleTextView.setTextSize(1, 24.0f);
            } else {
                this.titleTextView.setTypeface(AndroidUtilities.bold());
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
                        protected void onMeasure(int i9, int i10) {
                            super.onMeasure(i9, i10);
                            ((ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(16.0f);
                        }
                    };
                    final SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
                        @Override
                        protected void onLayout(boolean z2, int i9, int i10, int i11, int i12) {
                            int measuredHeight;
                            if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                                if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8) {
                                    FrameLayout frameLayout2 = frameLayout;
                                    int measuredWidth = getMeasuredWidth();
                                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
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
                                measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(230.0f)) + measureKeyboardHeight();
                                frameLayout4.layout(0, 0, measuredWidth3, measuredHeight);
                            } else {
                                FrameLayout frameLayout5 = frameLayout;
                                int measuredWidth4 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                frameLayout5.layout(0, 0, measuredWidth4, measuredHeight);
                            }
                            TwoStepVerificationSetupActivity.this.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                        }

                        @Override
                        protected void onMeasure(int i9, int i10) {
                            int size = View.MeasureSpec.getSize(i9);
                            int size2 = View.MeasureSpec.getSize(i10);
                            setMeasuredDimension(size, size2);
                            if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                                size2 -= AndroidUtilities.dp(230.0f);
                            }
                            frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                            TwoStepVerificationSetupActivity.this.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                        }
                    };
                    sizeNotifierFrameLayout.addView(frameLayout);
                    ViewGroup viewGroup = new ViewGroup(context) {
                        @Override
                        protected void onMeasure(int i9, int i10) {
                            int size = View.MeasureSpec.getSize(i9);
                            int size2 = View.MeasureSpec.getSize(i10);
                            ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                            TwoStepVerificationSetupActivity.this.actionBarBackground.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(3.0f), 1073741824));
                            sizeNotifierFrameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i10);
                            setMeasuredDimension(size, size2);
                        }

                        @Override
                        protected void onLayout(boolean z2, int i9, int i10, int i11, int i12) {
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
                        protected void onScrollChanged(int i9, int i10, int i11, int i12) {
                            super.onScrollChanged(i9, i10, i11, i12);
                            if (TwoStepVerificationSetupActivity.this.titleTextView == null) {
                                return;
                            }
                            TwoStepVerificationSetupActivity.this.titleTextView.getLocationOnScreen(this.location);
                            boolean z2 = this.location[1] + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() < ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getBottom();
                            if (z2 != (TwoStepVerificationSetupActivity.this.titleTextView.getTag() == null)) {
                                TwoStepVerificationSetupActivity.this.titleTextView.setTag(z2 ? null : 1);
                                if (TwoStepVerificationSetupActivity.this.actionBarAnimator != null) {
                                    TwoStepVerificationSetupActivity.this.actionBarAnimator.cancel();
                                    TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                                }
                                TwoStepVerificationSetupActivity.this.actionBarAnimator = new AnimatorSet();
                                AnimatorSet animatorSet = TwoStepVerificationSetupActivity.this.actionBarAnimator;
                                View view = TwoStepVerificationSetupActivity.this.actionBarBackground;
                                float[] fArr = {z2 ? 1.0f : 0.0f};
                                Property property = View.ALPHA;
                                animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getTitleTextView(), (Property<SimpleTextView, Float>) property, z2 ? 1.0f : 0.0f));
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
                            this.tempRect.bottom += AndroidUtilities.dp(120.0f);
                            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.tempRect);
                            if (iComputeScrollDeltaToGetChildRectOnScreen < 0) {
                                int measuredHeight = (getMeasuredHeight() - view.getMeasuredHeight()) / 2;
                                this.scrollingUp = measuredHeight;
                                iComputeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
                            } else {
                                this.scrollingUp = 0;
                            }
                            if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                                smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
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
                        public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
                            if (Build.VERSION.SDK_INT < 23) {
                                int iDp = rect.bottom + AndroidUtilities.dp(120.0f);
                                rect.bottom = iDp;
                                int i9 = this.scrollingUp;
                                if (i9 != 0) {
                                    rect.top -= i9;
                                    rect.bottom = iDp - i9;
                                    this.scrollingUp = 0;
                                }
                            }
                            return super.requestChildRectangleOnScreen(view, rect, z2);
                        }

                        @Override
                        public void requestLayout() {
                            this.isLayoutDirty = true;
                            super.requestLayout();
                        }

                        @Override
                        protected void onLayout(boolean z2, int i9, int i10, int i11, int i12) {
                            this.isLayoutDirty = false;
                            super.onLayout(z2, i9, i10, i11, i12);
                        }
                    };
                    this.scrollView = scrollView;
                    scrollView.setVerticalScrollBarEnabled(false);
                    frameLayout.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
                    frameLayout.addView(this.bottomSkipButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
                    viewGroup.addView(sizeNotifierFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
                    linearLayout = new LinearLayout(context) {
                        @Override
                        protected void onMeasure(int i9, int i10) {
                            super.onMeasure(i9, i10);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.titleTextView.getLayoutParams();
                            int iDp = 0;
                            int iDp2 = (TwoStepVerificationSetupActivity.this.imageView.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0) + AndroidUtilities.dp(8.0f);
                            if (TwoStepVerificationSetupActivity.this.currentType == 2 && AndroidUtilities.isSmallScreen() && !TwoStepVerificationSetupActivity.this.isLandscape()) {
                                iDp = AndroidUtilities.dp(32.0f);
                            }
                            marginLayoutParams.topMargin = iDp2 + iDp;
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
                    EditTextBoldCursor editTextBoldCursor2 = new EditTextBoldCursor(context);
                    this.editTextFirstRow = editTextBoldCursor2;
                    editTextBoldCursor2.setTextSize(1, 18.0f);
                    int iDp = AndroidUtilities.dp(16.0f);
                    this.editTextFirstRow.setPadding(iDp, iDp, iDp, iDp);
                    EditTextBoldCursor editTextBoldCursor3 = this.editTextFirstRow;
                    int i9 = Theme.key_windowBackgroundWhiteInputFieldActivated;
                    editTextBoldCursor3.setCursorColor(Theme.getColor(i9));
                    this.editTextFirstRow.setTextColor(Theme.getColor(i7));
                    this.editTextFirstRow.setBackground(null);
                    this.editTextFirstRow.setMaxLines(1);
                    this.editTextFirstRow.setLines(1);
                    this.editTextFirstRow.setGravity(3);
                    this.editTextFirstRow.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.editTextFirstRow.setSingleLine(true);
                    this.editTextFirstRow.setCursorWidth(1.5f);
                    this.editTextFirstRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView5, int i10, KeyEvent keyEvent) {
                            return TwoStepVerificationSetupActivity.m4760$r8$lambda$vd1fD2N9GqrxxKCyyVlOMHsGHA(this.f$0, textView5, i10, keyEvent);
                        }
                    });
                    this.outlineTextFirstRow.attachEditText(this.editTextFirstRow);
                    this.editTextFirstRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public final void onFocusChange(View view, boolean z2) {
                            this.f$0.outlineTextFirstRow.animateSelection(z2 ? 1.0f : 0.0f);
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
                    imageView.setImageResource(R.drawable.msg_message);
                    this.showPasswordButton.setScaleType(scaleType);
                    this.showPasswordButton.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                    this.showPasswordButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
                    this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
                    AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                    this.showPasswordButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            TwoStepVerificationSetupActivity.$r8$lambda$O4nT7gpXW1Zaqg3Ga10IkHXahZ0(this.f$0, view);
                        }
                    });
                    linearLayout2.addView(this.showPasswordButton, LayoutHelper.createLinear(24, 24, 16, 0, 0, 16, 0));
                    this.editTextFirstRow.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
                    EditTextBoldCursor editTextBoldCursor4 = new EditTextBoldCursor(context);
                    this.editTextSecondRow = editTextBoldCursor4;
                    editTextBoldCursor4.setTextSize(1, 18.0f);
                    int iDp2 = AndroidUtilities.dp(16.0f);
                    this.editTextSecondRow.setPadding(iDp2, iDp2, iDp2, iDp2);
                    this.editTextSecondRow.setCursorColor(Theme.getColor(i9));
                    this.editTextSecondRow.setTextColor(Theme.getColor(i7));
                    this.editTextSecondRow.setBackground(null);
                    this.editTextSecondRow.setMaxLines(1);
                    this.editTextSecondRow.setLines(1);
                    this.editTextSecondRow.setGravity(3);
                    this.editTextSecondRow.setCursorSize(AndroidUtilities.dp(20.0f));
                    this.editTextSecondRow.setSingleLine(true);
                    this.editTextSecondRow.setCursorWidth(1.5f);
                    this.editTextSecondRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                        @Override
                        public final boolean onEditorAction(TextView textView5, int i10, KeyEvent keyEvent) {
                            return TwoStepVerificationSetupActivity.$r8$lambda$dIy9sH8_G2wwpMAK0YaMJizU26k(this.f$0, textView5, i10, keyEvent);
                        }
                    });
                    this.outlineTextSecondRow.attachEditText(this.editTextSecondRow);
                    this.editTextSecondRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                        @Override
                        public final void onFocusChange(View view, boolean z2) {
                            this.f$0.outlineTextSecondRow.animateSelection(z2 ? 1.0f : 0.0f);
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
                            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                            }

                            @Override
                            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
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
                            public final void onFocusChange(View view, boolean z2) {
                                TwoStepVerificationSetupActivity.$r8$lambda$H7YTRCJbdcc4LqbNpX590wgyR1o(this.f$0, view, z2);
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
                        textView5.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
                        this.descriptionText3.setGravity(1);
                        this.descriptionText3.setTextSize(1, 14.0f);
                        this.descriptionText3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                        this.descriptionText3.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                        this.descriptionText3.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                        linearLayout.addView(this.descriptionText3, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 25));
                        this.descriptionText3.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public final void onClick(View view) {
                                TwoStepVerificationSetupActivity.m4763$r8$lambda$zOAFwbAO2JRBbcvok3jULhFY9I(this.f$0, view);
                            }
                        });
                    }
                    this.fragmentView = viewGroup;
                    View view = new View(context) {
                        private Paint paint = new Paint();

                        @Override
                        protected void onDraw(Canvas canvas) {
                            this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight, this.paint);
                            ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout.drawHeaderShadow(canvas, measuredHeight);
                        }
                    };
                    this.actionBarBackground = view;
                    view.setAlpha(0.0f);
                    viewGroup.addView(this.actionBarBackground);
                    viewGroup.addView(this.actionBar);
                    RadialProgressView radialProgressView = new RadialProgressView(context);
                    this.radialProgressView = radialProgressView;
                    radialProgressView.setSize(AndroidUtilities.dp(20.0f));
                    this.radialProgressView.setAlpha(0.0f);
                    this.radialProgressView.setScaleX(0.1f);
                    this.radialProgressView.setScaleY(0.1f);
                    this.radialProgressView.setProgressColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
                    frameLayout.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                    break;
                case 6:
                case 7:
                case 9:
                    ViewGroup viewGroup2 = new ViewGroup(context) {
                        @Override
                        protected void onMeasure(int i10, int i11) {
                            int size = View.MeasureSpec.getSize(i10);
                            int size2 = View.MeasureSpec.getSize(i11);
                            ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i11);
                            if (size > size2) {
                                float f = size;
                                TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                                int i12 = (int) (f * 0.6f);
                                TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                            } else {
                                float f2 = TwoStepVerificationSetupActivity.this.currentType == 7 ? 160 : 140;
                                TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824));
                                TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                                TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                            }
                            setMeasuredDimension(size, size2);
                        }

                        @Override
                        protected void onLayout(boolean z2, int i10, int i11, int i12, int i13) {
                            ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, i12, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                            int i14 = i12 - i10;
                            int i15 = i13 - i11;
                            if (i12 > i13) {
                                int measuredHeight = (i15 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight()) / 2;
                                TwoStepVerificationSetupActivity.this.imageView.layout(0, measuredHeight, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                                float f = i14;
                                float f2 = 0.4f * f;
                                int i16 = (int) f2;
                                float f3 = i15;
                                int i17 = (int) (0.22f * f3);
                                TwoStepVerificationSetupActivity.this.titleTextView.layout(i16, i17, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth() + i16, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + i17);
                                int i18 = (int) (0.39f * f3);
                                TwoStepVerificationSetupActivity.this.descriptionText.layout(i16, i18, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth() + i16, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + i18);
                                int measuredWidth = (int) (f2 + (((f * 0.6f) - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                                int i19 = (int) (f3 * 0.64f);
                                TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth, i19, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + i19);
                                return;
                            }
                            int i20 = (int) (i15 * 0.3f);
                            int measuredWidth2 = (i14 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth()) / 2;
                            TwoStepVerificationSetupActivity.this.imageView.layout(measuredWidth2, i20, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth() + measuredWidth2, TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + i20);
                            int measuredHeight2 = i20 + TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(16.0f);
                            TwoStepVerificationSetupActivity.this.titleTextView.layout(0, measuredHeight2, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + measuredHeight2);
                            int measuredHeight3 = measuredHeight2 + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
                            TwoStepVerificationSetupActivity.this.descriptionText.layout(0, measuredHeight3, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + measuredHeight3);
                            int measuredWidth3 = (i14 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                            int measuredHeight4 = (i15 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                            TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth3, measuredHeight4, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth3, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight4);
                        }
                    };
                    viewGroup2.setOnTouchListener(new View.OnTouchListener() {
                        @Override
                        public final boolean onTouch(View view2, MotionEvent motionEvent) {
                            return TwoStepVerificationSetupActivity.$r8$lambda$fxnuijeVnmI5keukH7UodhEZbkQ(view2, motionEvent);
                        }
                    });
                    viewGroup2.addView(this.actionBar);
                    viewGroup2.addView(this.imageView);
                    viewGroup2.addView(this.titleTextView);
                    viewGroup2.addView(this.descriptionText);
                    viewGroup2.addView(this.buttonTextView);
                    this.fragmentView = viewGroup2;
                    break;
            }
            this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            i2 = this.currentType;
            switch (i2) {
                case 0:
                case 1:
                    if (this.currentPassword.has_password) {
                        ActionBar actionBar2 = this.actionBar;
                        int i10 = R.string.PleaseEnterNewFirstPassword;
                        actionBar2.setTitle(LocaleController.getString(i10));
                        this.titleTextView.setText(LocaleController.getString(i10));
                    } else {
                        if (i2 == 0) {
                            i3 = R.string.CreatePassword;
                        } else {
                            i3 = R.string.ReEnterPassword;
                        }
                        String string = LocaleController.getString(i3);
                        this.actionBar.setTitle(string);
                        this.titleTextView.setText(string);
                    }
                    if (!TextUtils.isEmpty(this.emailCode)) {
                        this.bottomSkipButton.setVisibility(0);
                        this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                    }
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    OutlineTextContainerView outlineTextContainerView2 = this.outlineTextFirstRow;
                    if (this.currentType == 0) {
                        i4 = R.string.EnterPassword;
                    } else {
                        i4 = R.string.ReEnterPassword;
                    }
                    outlineTextContainerView2.setText(LocaleController.getString(i4));
                    EditTextBoldCursor editTextBoldCursor5 = this.editTextFirstRow;
                    if (this.currentType == 0) {
                        i5 = R.string.EnterPassword;
                    } else {
                        i5 = R.string.ReEnterPassword;
                    }
                    editTextBoldCursor5.setContentDescription(LocaleController.getString(i5));
                    this.editTextFirstRow.setImeOptions(268435461);
                    this.editTextFirstRow.setInputType(129);
                    this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                    if (this.currentType == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.needPasswordButton = z;
                    AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                    RLottieDrawable[] rLottieDrawableArr = new RLottieDrawable[7];
                    this.animationDrawables = rLottieDrawableArr;
                    int i11 = R.raw.tsv_setup_monkey_idle1;
                    rLottieDrawableArr[0] = new RLottieDrawable(i11, "" + i11, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr2 = this.animationDrawables;
                    int i12 = R.raw.tsv_setup_monkey_idle2;
                    rLottieDrawableArr2[1] = new RLottieDrawable(i12, "" + i12, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr3 = this.animationDrawables;
                    int i13 = R.raw.tsv_monkey_close;
                    rLottieDrawableArr3[c2] = new RLottieDrawable(i13, "" + i13, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr4 = this.animationDrawables;
                    int i14 = R.raw.tsv_setup_monkey_peek;
                    rLottieDrawableArr4[3] = new RLottieDrawable(i14, "" + i14, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr5 = this.animationDrawables;
                    int i15 = R.raw.tsv_setup_monkey_close_and_peek_to_idle;
                    rLottieDrawableArr5[4] = new RLottieDrawable(i15, "" + i15, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr6 = this.animationDrawables;
                    int i16 = R.raw.tsv_setup_monkey_close_and_peek;
                    rLottieDrawableArr6[c] = new RLottieDrawable(i16, "" + i16, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    RLottieDrawable[] rLottieDrawableArr7 = this.animationDrawables;
                    int i17 = R.raw.tsv_setup_monkey_tracking;
                    rLottieDrawableArr7[6] = new RLottieDrawable(i17, "" + i17, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                    this.animationDrawables[6].setPlayInDirectionOfCustomEndFrame(true);
                    this.animationDrawables[6].setCustomEndFrame(19);
                    this.animationDrawables[c2].setOnFinishCallback(this.finishCallback, 97);
                    setRandomMonkeyIdleAnimation(true);
                    switchMonkeyAnimation(this.currentType == 1);
                    break;
                case 2:
                    ActionBar actionBar3 = this.actionBar;
                    int i18 = R.string.PasswordHint;
                    actionBar3.setTitle(LocaleController.getString(i18));
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                    this.titleTextView.setText(LocaleController.getString(i18));
                    this.descriptionText.setText(LocaleController.getString(R.string.PasswordHintDescription));
                    this.descriptionText.setVisibility(0);
                    OutlineTextContainerView outlineTextContainerView3 = this.outlineTextFirstRow;
                    int i19 = R.string.PasswordHintPlaceholder;
                    outlineTextContainerView3.setText(LocaleController.getString(i19));
                    this.editTextFirstRow.setContentDescription(LocaleController.getString(i19));
                    this.editTextFirstRow.setImeOptions(268435461);
                    this.outlineTextSecondRow.setVisibility(8);
                    this.imageView.setAnimation(R.raw.tsv_setup_hint, 120, 120);
                    this.imageView.playAnimation();
                    break;
                case 3:
                    ActionBar actionBar4 = this.actionBar;
                    int i20 = R.string.RecoveryEmailTitle;
                    actionBar4.setTitle(LocaleController.getString(i20));
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    if (!this.emailOnly) {
                        this.bottomSkipButton.setVisibility(0);
                        this.bottomSkipButton.setAlpha(0.0f);
                        this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                    }
                    this.titleTextView.setText(LocaleController.getString(i20));
                    this.descriptionText.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                    this.descriptionText.setVisibility(0);
                    OutlineTextContainerView outlineTextContainerView4 = this.outlineTextFirstRow;
                    int i21 = R.string.PaymentShippingEmailPlaceholder;
                    outlineTextContainerView4.setText(LocaleController.getString(i21));
                    this.editTextFirstRow.setContentDescription(LocaleController.getString(i21));
                    this.editTextFirstRow.setImeOptions(268435461);
                    this.editTextFirstRow.setInputType(33);
                    this.outlineTextSecondRow.setVisibility(8);
                    this.imageView.setAnimation(R.raw.tsv_setup_email_sent, 120, 120);
                    this.imageView.playAnimation();
                    break;
                case 4:
                    ActionBar actionBar5 = this.actionBar;
                    int i22 = R.string.PasswordRecovery;
                    actionBar5.setTitle(LocaleController.getString(i22));
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    this.titleTextView.setText(LocaleController.getString(i22));
                    this.keyboardView.setVisibility(0);
                    this.outlineTextFirstRow.setVisibility(8);
                    String str = this.currentPassword.email_unconfirmed_pattern;
                    String str2 = str != null ? str : "";
                    spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str2);
                    iIndexOf = str2.indexOf(42);
                    iLastIndexOf = str2.lastIndexOf(42);
                    if (iIndexOf != iLastIndexOf && iIndexOf != -1 && iLastIndexOf != -1) {
                        TextStyleSpan.TextStyleRun textStyleRun = new TextStyleSpan.TextStyleRun();
                        textStyleRun.flags |= 256;
                        textStyleRun.start = iIndexOf;
                        int i23 = iLastIndexOf + 1;
                        textStyleRun.end = i23;
                        spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun), iIndexOf, i23, 0);
                    }
                    this.descriptionText.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf));
                    this.descriptionText.setVisibility(0);
                    this.floatingButton.setButtonVisible(false, false);
                    this.codeFieldContainer.setVisibility(0);
                    this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                    this.imageView.playAnimation();
                    break;
                case 5:
                    ActionBar actionBar6 = this.actionBar;
                    int i24 = R.string.VerificationCode;
                    actionBar6.setTitle(LocaleController.getString(i24));
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    this.titleTextView.setText(LocaleController.getString(i24));
                    this.outlineTextFirstRow.setVisibility(8);
                    this.keyboardView.setVisibility(0);
                    TextView textView6 = this.descriptionText;
                    int i25 = R.string.EmailPasswordConfirmText2;
                    String str3 = this.currentPassword.email_unconfirmed_pattern;
                    textView6.setText(LocaleController.formatString("EmailPasswordConfirmText2", i25, str3 != null ? str3 : ""));
                    this.descriptionText.setVisibility(0);
                    this.floatingButton.setButtonVisible(false, false);
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setGravity(17);
                    ((ViewGroup.MarginLayoutParams) this.bottomSkipButton.getLayoutParams()).bottomMargin = 0;
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.ResendCode));
                    this.bottomSkipButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            TwoStepVerificationSetupActivity.m4743$r8$lambda$6v2TfZb3PdxsTbcgUdH0zL3uWI(this.f$0, view2);
                        }
                    });
                    this.codeFieldContainer.setVisibility(0);
                    this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                    this.imageView.playAnimation();
                    break;
                case 6:
                    this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                    this.descriptionText.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                    this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                    this.descriptionText.setVisibility(0);
                    this.imageView.setAnimation(R.raw.tsv_setup_intro, 140, 140);
                    this.imageView.playAnimation();
                    break;
                case 7:
                    this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                    this.descriptionText.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                    if (this.closeAfterSet) {
                        this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                    } else if (this.fromRegistration) {
                        this.buttonTextView.setText(LocaleController.getString(R.string.Continue));
                    } else {
                        this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                    }
                    this.descriptionText.setVisibility(0);
                    this.imageView.setAnimation(R.raw.wallet_allset, 160, 160);
                    this.imageView.playAnimation();
                    break;
                case 8:
                    ActionBar actionBar7 = this.actionBar;
                    int i26 = R.string.PleaseEnterCurrentPassword;
                    actionBar7.setTitle(LocaleController.getString(i26));
                    this.titleTextView.setText(LocaleController.getString(i26));
                    this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                    this.descriptionText.setVisibility(0);
                    this.actionBar.getTitleTextView().setAlpha(0.0f);
                    this.descriptionText2.setText(LocaleController.getString(R.string.ForgotPassword));
                    this.descriptionText2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2));
                    OutlineTextContainerView outlineTextContainerView5 = this.outlineTextFirstRow;
                    int i27 = R.string.LoginPassword;
                    outlineTextContainerView5.setText(LocaleController.getString(i27));
                    this.editTextFirstRow.setContentDescription(LocaleController.getString(i27));
                    this.editTextFirstRow.setImeOptions(268435462);
                    this.editTextFirstRow.setInputType(129);
                    this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                    this.imageView.setAnimation(R.raw.wallet_science, 120, 120);
                    this.imageView.playAnimation();
                    break;
                case 9:
                    this.titleTextView.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                    this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                    this.buttonTextView.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                    this.descriptionText.setVisibility(0);
                    this.imageView.setAnimation(R.raw.wallet_perfect, 140, 140);
                    this.imageView.playAnimation();
                    break;
            }
            editTextBoldCursor = this.editTextFirstRow;
            if (editTextBoldCursor != null) {
                editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i28, int i29, int i30) {
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
                                    return;
                                }
                                if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3]) {
                                    if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                        TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                        TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                        TwoStepVerificationSetupActivity.this.animationDrawables[2].setProgress(0.0f, false);
                                        TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                                        return;
                                    }
                                    if (TwoStepVerificationSetupActivity.this.animationDrawables[2].getCurrentFrame() < 49) {
                                        TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            if ((animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3] || TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() != null) && animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                                TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(-1);
                                if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                    TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setCurrentFrame(49, false);
                                }
                                TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                                return;
                            }
                            TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[4]);
                            TwoStepVerificationSetupActivity.this.animationDrawables[4].setProgress(0.0f, false);
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        }
                        if (TwoStepVerificationSetupActivity.this.currentType == 1) {
                            try {
                                TwoStepVerificationSetupActivity.this.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, TwoStepVerificationSetupActivity.this.editTextFirstRow.getLayout().getLineWidth(0) / TwoStepVerificationSetupActivity.this.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                                TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                                return;
                            } catch (Exception e) {
                                FileLog.e(e);
                                return;
                            }
                        }
                        if (TwoStepVerificationSetupActivity.this.currentType != 8 || editable.length() <= 0) {
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.showDoneButton(true);
                    }
                });
            }
            return this.fragmentView;
        }
        c2 = 2;
        TextView textView7 = new TextView(context);
        this.titleTextView = textView7;
        textView7.setTextColor(Theme.getColor(i7));
        this.titleTextView.setGravity(1);
        this.titleTextView.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.titleTextView.setTextSize(1, 24.0f);
        SpoilersTextView spoilersTextView2 = new SpoilersTextView(context);
        this.descriptionText = spoilersTextView2;
        int i28 = Theme.key_windowBackgroundWhiteGrayText6;
        spoilersTextView2.setTextColor(Theme.getColor(i28));
        this.descriptionText.setGravity(1);
        this.descriptionText.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText.setTextSize(1, 15.0f);
        this.descriptionText.setVisibility(8);
        this.descriptionText.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        TextView textView8 = new TextView(context);
        this.descriptionText2 = textView8;
        textView8.setTextColor(Theme.getColor(i28));
        this.descriptionText2.setGravity(1);
        this.descriptionText2.setTextSize(1, 14.0f);
        this.descriptionText2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        this.descriptionText2.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
        this.descriptionText2.setVisibility(8);
        this.descriptionText2.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                TwoStepVerificationSetupActivity.m4742$r8$lambda$6gs3JNtES69Dont1yIOGaI8Lc(this.f$0, view2);
            }
        });
        TextView textView9 = new TextView(context);
        this.buttonTextView = textView9;
        textView9.setMinWidth(AndroidUtilities.dp(220.0f));
        this.buttonTextView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        this.buttonTextView.setGravity(17);
        this.buttonTextView.setTextColor(Theme.getColor(Theme.key_featuredStickers_buttonText));
        this.buttonTextView.setTextSize(1, 15.0f);
        this.buttonTextView.setTypeface(AndroidUtilities.bold());
        this.buttonTextView.setBackground(Theme.AdaptiveRipple.filledRectByKey(Theme.key_featuredStickers_addButton, 6.0f));
        this.buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.processNext();
            }
        });
        i = this.currentType;
        if (i != 6) {
            this.titleTextView.setTypeface(Typeface.DEFAULT);
            this.titleTextView.setTextSize(1, 24.0f);
        } else {
            this.titleTextView.setTypeface(Typeface.DEFAULT);
            this.titleTextView.setTextSize(1, 24.0f);
        }
        switch (this.currentType) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                final FrameLayout frameLayout3 = new FrameLayout(context) {
                    @Override
                    protected void onMeasure(int i29, int i110) {
                        super.onMeasure(i29, i110);
                        ((ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.radialProgressView.getLayoutParams()).topMargin = AndroidUtilities.statusBarHeight + AndroidUtilities.dp(16.0f);
                    }
                };
                final SizeNotifierFrameLayout sizeNotifierFrameLayout2 = new SizeNotifierFrameLayout(context) {
                    @Override
                    protected void onLayout(boolean z2, int i29, int i110, int i111, int i112) {
                        int measuredHeight;
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() == 8 || measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                            if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8) {
                                FrameLayout frameLayout4 = frameLayout3;
                                int measuredWidth = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(230.0f);
                                frameLayout4.layout(0, 0, measuredWidth, measuredHeight);
                            } else {
                                FrameLayout frameLayout5 = frameLayout3;
                                int measuredWidth2 = getMeasuredWidth();
                                measuredHeight = getMeasuredHeight();
                                frameLayout5.layout(0, 0, measuredWidth2, measuredHeight);
                            }
                        } else if (TwoStepVerificationSetupActivity.this.isCustomKeyboardVisible()) {
                            FrameLayout frameLayout6 = frameLayout3;
                            int measuredWidth3 = getMeasuredWidth();
                            measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(230.0f)) + measureKeyboardHeight();
                            frameLayout6.layout(0, 0, measuredWidth3, measuredHeight);
                        } else {
                            FrameLayout frameLayout7 = frameLayout3;
                            int measuredWidth4 = getMeasuredWidth();
                            measuredHeight = getMeasuredHeight();
                            frameLayout7.layout(0, 0, measuredWidth4, measuredHeight);
                        }
                        TwoStepVerificationSetupActivity.this.keyboardView.layout(0, measuredHeight, getMeasuredWidth(), AndroidUtilities.dp(230.0f) + measuredHeight);
                    }

                    @Override
                    protected void onMeasure(int i29, int i110) {
                        int size = View.MeasureSpec.getSize(i29);
                        int size2 = View.MeasureSpec.getSize(i110);
                        setMeasuredDimension(size, size2);
                        if (TwoStepVerificationSetupActivity.this.keyboardView.getVisibility() != 8 && measureKeyboardHeight() < AndroidUtilities.dp(20.0f)) {
                            size2 -= AndroidUtilities.dp(230.0f);
                        }
                        frameLayout3.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        TwoStepVerificationSetupActivity.this.keyboardView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(230.0f), 1073741824));
                    }
                };
                sizeNotifierFrameLayout2.addView(frameLayout3);
                ViewGroup viewGroup3 = new ViewGroup(context) {
                    @Override
                    protected void onMeasure(int i29, int i110) {
                        int size = View.MeasureSpec.getSize(i29);
                        int size2 = View.MeasureSpec.getSize(i110);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i110);
                        TwoStepVerificationSetupActivity.this.actionBarBackground.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight() + AndroidUtilities.dp(3.0f), 1073741824));
                        sizeNotifierFrameLayout2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i110);
                        setMeasuredDimension(size, size2);
                    }

                    @Override
                    protected void onLayout(boolean z2, int i29, int i110, int i111, int i112) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredWidth(), ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        TwoStepVerificationSetupActivity.this.actionBarBackground.layout(0, 0, TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.actionBarBackground.getMeasuredHeight());
                        SizeNotifierFrameLayout sizeNotifierFrameLayout3 = sizeNotifierFrameLayout2;
                        sizeNotifierFrameLayout3.layout(0, 0, sizeNotifierFrameLayout3.getMeasuredWidth(), sizeNotifierFrameLayout2.getMeasuredHeight());
                    }
                };
                ScrollView scrollView2 = new ScrollView(context) {
                    private int scrollingUp;
                    private int[] location = new int[2];
                    private Rect tempRect = new Rect();
                    private boolean isLayoutDirty = true;

                    @Override
                    protected void onScrollChanged(int i29, int i110, int i111, int i112) {
                        super.onScrollChanged(i29, i110, i111, i112);
                        if (TwoStepVerificationSetupActivity.this.titleTextView == null) {
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.titleTextView.getLocationOnScreen(this.location);
                        boolean z2 = this.location[1] + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() < ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getBottom();
                        if (z2 != (TwoStepVerificationSetupActivity.this.titleTextView.getTag() == null)) {
                            TwoStepVerificationSetupActivity.this.titleTextView.setTag(z2 ? null : 1);
                            if (TwoStepVerificationSetupActivity.this.actionBarAnimator != null) {
                                TwoStepVerificationSetupActivity.this.actionBarAnimator.cancel();
                                TwoStepVerificationSetupActivity.this.actionBarAnimator = null;
                            }
                            TwoStepVerificationSetupActivity.this.actionBarAnimator = new AnimatorSet();
                            AnimatorSet animatorSet = TwoStepVerificationSetupActivity.this.actionBarAnimator;
                            View view2 = TwoStepVerificationSetupActivity.this.actionBarBackground;
                            float[] fArr = {z2 ? 1.0f : 0.0f};
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(view2, (Property<View, Float>) property, fArr), ObjectAnimator.ofFloat(((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getTitleTextView(), (Property<SimpleTextView, Float>) property, z2 ? 1.0f : 0.0f));
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
                    public void scrollToDescendant(View view2) {
                        view2.getDrawingRect(this.tempRect);
                        offsetDescendantRectToMyCoords(view2, this.tempRect);
                        this.tempRect.bottom += AndroidUtilities.dp(120.0f);
                        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(this.tempRect);
                        if (iComputeScrollDeltaToGetChildRectOnScreen < 0) {
                            int measuredHeight = (getMeasuredHeight() - view2.getMeasuredHeight()) / 2;
                            this.scrollingUp = measuredHeight;
                            iComputeScrollDeltaToGetChildRectOnScreen -= measuredHeight;
                        } else {
                            this.scrollingUp = 0;
                        }
                        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                            smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
                        }
                    }

                    @Override
                    public void requestChildFocus(View view2, View view3) {
                        if (Build.VERSION.SDK_INT < 29 && view3 != null && !this.isLayoutDirty) {
                            scrollToDescendant(view3);
                        }
                        super.requestChildFocus(view2, view3);
                    }

                    @Override
                    public boolean requestChildRectangleOnScreen(View view2, Rect rect, boolean z2) {
                        if (Build.VERSION.SDK_INT < 23) {
                            int iDp3 = rect.bottom + AndroidUtilities.dp(120.0f);
                            rect.bottom = iDp3;
                            int i29 = this.scrollingUp;
                            if (i29 != 0) {
                                rect.top -= i29;
                                rect.bottom = iDp3 - i29;
                                this.scrollingUp = 0;
                            }
                        }
                        return super.requestChildRectangleOnScreen(view2, rect, z2);
                    }

                    @Override
                    public void requestLayout() {
                        this.isLayoutDirty = true;
                        super.requestLayout();
                    }

                    @Override
                    protected void onLayout(boolean z2, int i29, int i110, int i111, int i112) {
                        this.isLayoutDirty = false;
                        super.onLayout(z2, i29, i110, i111, i112);
                    }
                };
                this.scrollView = scrollView2;
                scrollView2.setVerticalScrollBarEnabled(false);
                frameLayout3.addView(this.scrollView, LayoutHelper.createFrame(-1, -1.0f));
                frameLayout3.addView(this.bottomSkipButton, LayoutHelper.createFrame(-1, 56.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                frameLayout3.addView(this.floatingButton, FragmentFloatingButton.createDefaultLayoutParams());
                viewGroup3.addView(sizeNotifierFrameLayout2, LayoutHelper.createFrame(-1, -1.0f));
                linearLayout = new LinearLayout(context) {
                    @Override
                    protected void onMeasure(int i29, int i110) {
                        super.onMeasure(i29, i110);
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TwoStepVerificationSetupActivity.this.titleTextView.getLayoutParams();
                        int iDp3 = 0;
                        int iDp4 = (TwoStepVerificationSetupActivity.this.imageView.getVisibility() == 8 ? AndroidUtilities.statusBarHeight : 0) + AndroidUtilities.dp(8.0f);
                        if (TwoStepVerificationSetupActivity.this.currentType == 2 && AndroidUtilities.isSmallScreen() && !TwoStepVerificationSetupActivity.this.isLandscape()) {
                            iDp3 = AndroidUtilities.dp(32.0f);
                        }
                        marginLayoutParams.topMargin = iDp4 + iDp3;
                    }
                };
                linearLayout.setOrientation(1);
                this.scrollView.addView(linearLayout, LayoutHelper.createScroll(-1, -1, 51));
                linearLayout.addView(this.imageView, LayoutHelper.createLinear(-2, -2, 49, 0, 69, 0, 0));
                linearLayout.addView(this.titleTextView, LayoutHelper.createLinear(-2, -2, 49, 0, 8, 0, 0));
                linearLayout.addView(this.descriptionText, LayoutHelper.createLinear(-2, -2, 49, 0, 9, 0, 0));
                OutlineTextContainerView outlineTextContainerView6 = new OutlineTextContainerView(context);
                this.outlineTextFirstRow = outlineTextContainerView6;
                outlineTextContainerView6.animateSelection(1.0f, false);
                EditTextBoldCursor editTextBoldCursor6 = new EditTextBoldCursor(context);
                this.editTextFirstRow = editTextBoldCursor6;
                editTextBoldCursor6.setTextSize(1, 18.0f);
                int iDp3 = AndroidUtilities.dp(16.0f);
                this.editTextFirstRow.setPadding(iDp3, iDp3, iDp3, iDp3);
                EditTextBoldCursor editTextBoldCursor7 = this.editTextFirstRow;
                int i29 = Theme.key_windowBackgroundWhiteInputFieldActivated;
                editTextBoldCursor7.setCursorColor(Theme.getColor(i29));
                this.editTextFirstRow.setTextColor(Theme.getColor(i7));
                this.editTextFirstRow.setBackground(null);
                this.editTextFirstRow.setMaxLines(1);
                this.editTextFirstRow.setLines(1);
                this.editTextFirstRow.setGravity(3);
                this.editTextFirstRow.setCursorSize(AndroidUtilities.dp(20.0f));
                this.editTextFirstRow.setSingleLine(true);
                this.editTextFirstRow.setCursorWidth(1.5f);
                this.editTextFirstRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView10, int i110, KeyEvent keyEvent) {
                        return TwoStepVerificationSetupActivity.m4760$r8$lambda$vd1fD2N9GqrxxKCyyVlOMHsGHA(this.f$0, textView10, i110, keyEvent);
                    }
                });
                this.outlineTextFirstRow.attachEditText(this.editTextFirstRow);
                this.editTextFirstRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view2, boolean z2) {
                        this.f$0.outlineTextFirstRow.animateSelection(z2 ? 1.0f : 0.0f);
                    }
                });
                LinearLayout linearLayout3 = new LinearLayout(context);
                linearLayout3.setOrientation(0);
                linearLayout3.addView(this.editTextFirstRow, LayoutHelper.createLinear(0, -2, 1.0f));
                ImageView imageView2 = new ImageView(context) {
                    @Override
                    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                        accessibilityNodeInfo.setCheckable(true);
                        accessibilityNodeInfo.setChecked(TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() == null);
                    }
                };
                this.showPasswordButton = imageView2;
                imageView2.setImageResource(R.drawable.msg_message);
                this.showPasswordButton.setScaleType(scaleType);
                this.showPasswordButton.setContentDescription(LocaleController.getString(R.string.TwoStepVerificationShowPassword));
                this.showPasswordButton.setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector)));
                this.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                this.showPasswordButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        TwoStepVerificationSetupActivity.$r8$lambda$O4nT7gpXW1Zaqg3Ga10IkHXahZ0(this.f$0, view2);
                    }
                });
                linearLayout3.addView(this.showPasswordButton, LayoutHelper.createLinear(24, 24, 16, 0, 0, 16, 0));
                this.editTextFirstRow.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
                    }

                    @Override
                    public void onTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
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
                this.outlineTextFirstRow.addView(linearLayout3, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextFirstRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 32.0f, 24.0f, 32.0f));
                this.outlineTextSecondRow = new OutlineTextContainerView(context);
                EditTextBoldCursor editTextBoldCursor8 = new EditTextBoldCursor(context);
                this.editTextSecondRow = editTextBoldCursor8;
                editTextBoldCursor8.setTextSize(1, 18.0f);
                int iDp4 = AndroidUtilities.dp(16.0f);
                this.editTextSecondRow.setPadding(iDp4, iDp4, iDp4, iDp4);
                this.editTextSecondRow.setCursorColor(Theme.getColor(i29));
                this.editTextSecondRow.setTextColor(Theme.getColor(i7));
                this.editTextSecondRow.setBackground(null);
                this.editTextSecondRow.setMaxLines(1);
                this.editTextSecondRow.setLines(1);
                this.editTextSecondRow.setGravity(3);
                this.editTextSecondRow.setCursorSize(AndroidUtilities.dp(20.0f));
                this.editTextSecondRow.setSingleLine(true);
                this.editTextSecondRow.setCursorWidth(1.5f);
                this.editTextSecondRow.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                    @Override
                    public final boolean onEditorAction(TextView textView10, int i110, KeyEvent keyEvent) {
                        return TwoStepVerificationSetupActivity.$r8$lambda$dIy9sH8_G2wwpMAK0YaMJizU26k(this.f$0, textView10, i110, keyEvent);
                    }
                });
                this.outlineTextSecondRow.attachEditText(this.editTextSecondRow);
                this.editTextSecondRow.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                    @Override
                    public final void onFocusChange(View view2, boolean z2) {
                        this.f$0.outlineTextSecondRow.animateSelection(z2 ? 1.0f : 0.0f);
                    }
                });
                this.outlineTextSecondRow.addView(this.editTextSecondRow, LayoutHelper.createFrame(-1, -2.0f));
                linearLayout.addView(this.outlineTextSecondRow, LayoutHelper.createFrame(-1, -2.0f, 49, 24.0f, 16.0f, 24.0f, 0.0f));
                this.outlineTextSecondRow.setVisibility(8);
                CustomPhoneKeyboardView customPhoneKeyboardView2 = new CustomPhoneKeyboardView(context);
                this.keyboardView = customPhoneKeyboardView2;
                customPhoneKeyboardView2.setVisibility(8);
                sizeNotifierFrameLayout2.addView(this.keyboardView);
                CodeFieldContainer codeFieldContainer2 = new CodeFieldContainer(context) {
                    @Override
                    protected void processNextPressed() {
                        TwoStepVerificationSetupActivity.this.processNext();
                    }
                };
                this.codeFieldContainer = codeFieldContainer2;
                codeFieldContainer2.setNumbersCount(6, 1);
                while (i6 < r7) {
                    codeNumberField.setShowSoftInputOnFocusCompat(!isCustomKeyboardVisible());
                    codeNumberField.addTextChangedListener(new TextWatcher() {
                        @Override
                        public void beforeTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
                        }

                        @Override
                        public void onTextChanged(CharSequence charSequence, int i110, int i111, int i112) {
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
                        public final void onFocusChange(View view2, boolean z2) {
                            TwoStepVerificationSetupActivity.$r8$lambda$H7YTRCJbdcc4LqbNpX590wgyR1o(this.f$0, view2, z2);
                        }
                    });
                }
                this.codeFieldContainer.setVisibility(8);
                linearLayout.addView(this.codeFieldContainer, LayoutHelper.createLinear(-2, -2, 1, 0, 32, 0, 0));
                FrameLayout frameLayout4 = new FrameLayout(context);
                linearLayout.addView(frameLayout4, LayoutHelper.createLinear(-1, -2, 51, 0, 36, 0, 22));
                frameLayout4.addView(this.descriptionText2, LayoutHelper.createFrame(-2, -2, 49));
                if (this.currentType == 4) {
                    TextView textView10 = new TextView(context);
                    this.descriptionText3 = textView10;
                    textView10.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteLinkText));
                    this.descriptionText3.setGravity(1);
                    this.descriptionText3.setTextSize(1, 14.0f);
                    this.descriptionText3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                    this.descriptionText3.setPadding(AndroidUtilities.dp(32.0f), 0, AndroidUtilities.dp(32.0f), 0);
                    this.descriptionText3.setText(LocaleController.getString(R.string.RestoreEmailTroubleNoEmail));
                    linearLayout.addView(this.descriptionText3, LayoutHelper.createLinear(-2, -2, 49, 0, 0, 0, 25));
                    this.descriptionText3.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            TwoStepVerificationSetupActivity.m4763$r8$lambda$zOAFwbAO2JRBbcvok3jULhFY9I(this.f$0, view2);
                        }
                    });
                }
                this.fragmentView = viewGroup3;
                View view2 = new View(context) {
                    private Paint paint = new Paint();

                    @Override
                    protected void onDraw(Canvas canvas) {
                        this.paint.setColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(3.0f);
                        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), measuredHeight, this.paint);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout.drawHeaderShadow(canvas, measuredHeight);
                    }
                };
                this.actionBarBackground = view2;
                view2.setAlpha(0.0f);
                viewGroup3.addView(this.actionBarBackground);
                viewGroup3.addView(this.actionBar);
                RadialProgressView radialProgressView2 = new RadialProgressView(context);
                this.radialProgressView = radialProgressView2;
                radialProgressView2.setSize(AndroidUtilities.dp(20.0f));
                this.radialProgressView.setAlpha(0.0f);
                this.radialProgressView.setScaleX(0.1f);
                this.radialProgressView.setScaleY(0.1f);
                this.radialProgressView.setProgressColor(Theme.getColor(Theme.key_windowBackgroundWhiteInputFieldActivated));
                frameLayout3.addView(this.radialProgressView, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 16.0f, 16.0f, 0.0f));
                break;
            case 6:
            case 7:
            case 9:
                ViewGroup viewGroup4 = new ViewGroup(context) {
                    @Override
                    protected void onMeasure(int i110, int i111) {
                        int size = View.MeasureSpec.getSize(i110);
                        int size2 = View.MeasureSpec.getSize(i111);
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i111);
                        if (size > size2) {
                            float f = size;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec((int) (0.45f * f), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size2 * 0.68f), 1073741824));
                            int i112 = (int) (f * 0.6f);
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(i112, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(i112, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(i112, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(i112, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(42.0f), 1073741824));
                        } else {
                            float f2 = TwoStepVerificationSetupActivity.this.currentType == 7 ? 160 : 140;
                            TwoStepVerificationSetupActivity.this.imageView.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f2), 1073741824));
                            TwoStepVerificationSetupActivity.this.titleTextView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.descriptionText2.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                            TwoStepVerificationSetupActivity.this.buttonTextView.measure(View.MeasureSpec.makeMeasureSpec(size - AndroidUtilities.dp(48.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(50.0f), 1073741824));
                        }
                        setMeasuredDimension(size, size2);
                    }

                    @Override
                    protected void onLayout(boolean z2, int i110, int i111, int i112, int i113) {
                        ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.layout(0, 0, i112, ((BaseFragment) TwoStepVerificationSetupActivity.this).actionBar.getMeasuredHeight());
                        int i114 = i112 - i110;
                        int i115 = i113 - i111;
                        if (i112 > i113) {
                            int measuredHeight = (i115 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight()) / 2;
                            TwoStepVerificationSetupActivity.this.imageView.layout(0, measuredHeight, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + measuredHeight);
                            float f = i114;
                            float f2 = 0.4f * f;
                            int i116 = (int) f2;
                            float f3 = i115;
                            int i117 = (int) (0.22f * f3);
                            TwoStepVerificationSetupActivity.this.titleTextView.layout(i116, i117, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth() + i116, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + i117);
                            int i118 = (int) (0.39f * f3);
                            TwoStepVerificationSetupActivity.this.descriptionText.layout(i116, i118, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth() + i116, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + i118);
                            int measuredWidth = (int) (f2 + (((f * 0.6f) - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2.0f));
                            int i119 = (int) (f3 * 0.64f);
                            TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth, i119, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + i119);
                            return;
                        }
                        int i210 = (int) (i115 * 0.3f);
                        int measuredWidth2 = (i114 - TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth()) / 2;
                        TwoStepVerificationSetupActivity.this.imageView.layout(measuredWidth2, i210, TwoStepVerificationSetupActivity.this.imageView.getMeasuredWidth() + measuredWidth2, TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + i210);
                        int measuredHeight2 = i210 + TwoStepVerificationSetupActivity.this.imageView.getMeasuredHeight() + AndroidUtilities.dp(16.0f);
                        TwoStepVerificationSetupActivity.this.titleTextView.layout(0, measuredHeight2, TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + measuredHeight2);
                        int measuredHeight3 = measuredHeight2 + TwoStepVerificationSetupActivity.this.titleTextView.getMeasuredHeight() + AndroidUtilities.dp(12.0f);
                        TwoStepVerificationSetupActivity.this.descriptionText.layout(0, measuredHeight3, TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredWidth(), TwoStepVerificationSetupActivity.this.descriptionText.getMeasuredHeight() + measuredHeight3);
                        int measuredWidth3 = (i114 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth()) / 2;
                        int measuredHeight4 = (i115 - TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight()) - AndroidUtilities.dp(48.0f);
                        TwoStepVerificationSetupActivity.this.buttonTextView.layout(measuredWidth3, measuredHeight4, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredWidth() + measuredWidth3, TwoStepVerificationSetupActivity.this.buttonTextView.getMeasuredHeight() + measuredHeight4);
                    }
                };
                viewGroup4.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public final boolean onTouch(View view3, MotionEvent motionEvent) {
                        return TwoStepVerificationSetupActivity.$r8$lambda$fxnuijeVnmI5keukH7UodhEZbkQ(view3, motionEvent);
                    }
                });
                viewGroup4.addView(this.actionBar);
                viewGroup4.addView(this.imageView);
                viewGroup4.addView(this.titleTextView);
                viewGroup4.addView(this.descriptionText);
                viewGroup4.addView(this.buttonTextView);
                this.fragmentView = viewGroup4;
                break;
        }
        this.fragmentView.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
        i2 = this.currentType;
        switch (i2) {
            case 0:
            case 1:
                if (this.currentPassword.has_password) {
                    ActionBar actionBar8 = this.actionBar;
                    int i110 = R.string.PleaseEnterNewFirstPassword;
                    actionBar8.setTitle(LocaleController.getString(i110));
                    this.titleTextView.setText(LocaleController.getString(i110));
                } else {
                    if (i2 == 0) {
                        i3 = R.string.CreatePassword;
                    } else {
                        i3 = R.string.ReEnterPassword;
                    }
                    String string2 = LocaleController.getString(i3);
                    this.actionBar.setTitle(string2);
                    this.titleTextView.setText(string2);
                }
                if (!TextUtils.isEmpty(this.emailCode)) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                OutlineTextContainerView outlineTextContainerView7 = this.outlineTextFirstRow;
                if (this.currentType == 0) {
                    i4 = R.string.EnterPassword;
                } else {
                    i4 = R.string.ReEnterPassword;
                }
                outlineTextContainerView7.setText(LocaleController.getString(i4));
                EditTextBoldCursor editTextBoldCursor9 = this.editTextFirstRow;
                if (this.currentType == 0) {
                    i5 = R.string.EnterPassword;
                } else {
                    i5 = R.string.ReEnterPassword;
                }
                editTextBoldCursor9.setContentDescription(LocaleController.getString(i5));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                if (this.currentType == 0) {
                    z = true;
                } else {
                    z = false;
                }
                this.needPasswordButton = z;
                AndroidUtilities.updateViewVisibilityAnimated(this.showPasswordButton, false, 0.1f, false);
                RLottieDrawable[] rLottieDrawableArr8 = new RLottieDrawable[7];
                this.animationDrawables = rLottieDrawableArr8;
                int i111 = R.raw.tsv_setup_monkey_idle1;
                rLottieDrawableArr8[0] = new RLottieDrawable(i111, "" + i111, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr9 = this.animationDrawables;
                int i112 = R.raw.tsv_setup_monkey_idle2;
                rLottieDrawableArr9[1] = new RLottieDrawable(i112, "" + i112, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr10 = this.animationDrawables;
                int i113 = R.raw.tsv_monkey_close;
                rLottieDrawableArr10[c2] = new RLottieDrawable(i113, "" + i113, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr11 = this.animationDrawables;
                int i114 = R.raw.tsv_setup_monkey_peek;
                rLottieDrawableArr11[3] = new RLottieDrawable(i114, "" + i114, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr12 = this.animationDrawables;
                int i115 = R.raw.tsv_setup_monkey_close_and_peek_to_idle;
                rLottieDrawableArr12[4] = new RLottieDrawable(i115, "" + i115, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr13 = this.animationDrawables;
                int i116 = R.raw.tsv_setup_monkey_close_and_peek;
                rLottieDrawableArr13[c] = new RLottieDrawable(i116, "" + i116, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                RLottieDrawable[] rLottieDrawableArr14 = this.animationDrawables;
                int i117 = R.raw.tsv_setup_monkey_tracking;
                rLottieDrawableArr14[6] = new RLottieDrawable(i117, "" + i117, AndroidUtilities.dp(120.0f), AndroidUtilities.dp(120.0f), true, null);
                this.animationDrawables[6].setPlayInDirectionOfCustomEndFrame(true);
                this.animationDrawables[6].setCustomEndFrame(19);
                this.animationDrawables[c2].setOnFinishCallback(this.finishCallback, 97);
                setRandomMonkeyIdleAnimation(true);
                switchMonkeyAnimation(this.currentType == 1);
                break;
            case 2:
                ActionBar actionBar9 = this.actionBar;
                int i118 = R.string.PasswordHint;
                actionBar9.setTitle(LocaleController.getString(i118));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                this.titleTextView.setText(LocaleController.getString(i118));
                this.descriptionText.setText(LocaleController.getString(R.string.PasswordHintDescription));
                this.descriptionText.setVisibility(0);
                OutlineTextContainerView outlineTextContainerView8 = this.outlineTextFirstRow;
                int i119 = R.string.PasswordHintPlaceholder;
                outlineTextContainerView8.setText(LocaleController.getString(i119));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i119));
                this.editTextFirstRow.setImeOptions(268435461);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_hint, 120, 120);
                this.imageView.playAnimation();
                break;
            case 3:
                ActionBar actionBar10 = this.actionBar;
                int i210 = R.string.RecoveryEmailTitle;
                actionBar10.setTitle(LocaleController.getString(i210));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                if (!this.emailOnly) {
                    this.bottomSkipButton.setVisibility(0);
                    this.bottomSkipButton.setAlpha(0.0f);
                    this.bottomSkipButton.setText(LocaleController.getString(R.string.YourEmailSkip));
                }
                this.titleTextView.setText(LocaleController.getString(i210));
                this.descriptionText.setText(LocaleController.getString(R.string.RecoveryEmailSubtitle));
                this.descriptionText.setVisibility(0);
                OutlineTextContainerView outlineTextContainerView9 = this.outlineTextFirstRow;
                int i211 = R.string.PaymentShippingEmailPlaceholder;
                outlineTextContainerView9.setText(LocaleController.getString(i211));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i211));
                this.editTextFirstRow.setImeOptions(268435461);
                this.editTextFirstRow.setInputType(33);
                this.outlineTextSecondRow.setVisibility(8);
                this.imageView.setAnimation(R.raw.tsv_setup_email_sent, 120, 120);
                this.imageView.playAnimation();
                break;
            case 4:
                ActionBar actionBar11 = this.actionBar;
                int i212 = R.string.PasswordRecovery;
                actionBar11.setTitle(LocaleController.getString(i212));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString(i212));
                this.keyboardView.setVisibility(0);
                this.outlineTextFirstRow.setVisibility(8);
                String str4 = this.currentPassword.email_unconfirmed_pattern;
                if (str4 != null) {
                }
                spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(str2);
                iIndexOf = str2.indexOf(42);
                iLastIndexOf = str2.lastIndexOf(42);
                if (iIndexOf != iLastIndexOf) {
                    TextStyleSpan.TextStyleRun textStyleRun2 = new TextStyleSpan.TextStyleRun();
                    textStyleRun2.flags |= 256;
                    textStyleRun2.start = iIndexOf;
                    int i213 = iLastIndexOf + 1;
                    textStyleRun2.end = i213;
                    spannableStringBuilderValueOf.setSpan(new TextStyleSpan(textStyleRun2), iIndexOf, i213, 0);
                }
                this.descriptionText.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.RestoreEmailSent), spannableStringBuilderValueOf));
                this.descriptionText.setVisibility(0);
                this.floatingButton.setButtonVisible(false, false);
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 5:
                ActionBar actionBar12 = this.actionBar;
                int i214 = R.string.VerificationCode;
                actionBar12.setTitle(LocaleController.getString(i214));
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.titleTextView.setText(LocaleController.getString(i214));
                this.outlineTextFirstRow.setVisibility(8);
                this.keyboardView.setVisibility(0);
                TextView textView11 = this.descriptionText;
                int i215 = R.string.EmailPasswordConfirmText2;
                String str5 = this.currentPassword.email_unconfirmed_pattern;
                textView11.setText(LocaleController.formatString("EmailPasswordConfirmText2", i215, str5 != null ? str5 : ""));
                this.descriptionText.setVisibility(0);
                this.floatingButton.setButtonVisible(false, false);
                this.bottomSkipButton.setVisibility(0);
                this.bottomSkipButton.setGravity(17);
                ((ViewGroup.MarginLayoutParams) this.bottomSkipButton.getLayoutParams()).bottomMargin = 0;
                this.bottomSkipButton.setText(LocaleController.getString(R.string.ResendCode));
                this.bottomSkipButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view3) {
                        TwoStepVerificationSetupActivity.m4743$r8$lambda$6v2TfZb3PdxsTbcgUdH0zL3uWI(this.f$0, view3);
                    }
                });
                this.codeFieldContainer.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_mail, 120, 120);
                this.imageView.playAnimation();
                break;
            case 6:
                this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationTitle));
                this.descriptionText.setText(LocaleController.getString(R.string.SetAdditionalPasswordInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationSetPassword));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.tsv_setup_intro, 140, 140);
                this.imageView.playAnimation();
                break;
            case 7:
                this.titleTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSet));
                this.descriptionText.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordSetInfo));
                if (this.closeAfterSet) {
                    this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnPassport));
                } else if (this.fromRegistration) {
                    this.buttonTextView.setText(LocaleController.getString(R.string.Continue));
                } else {
                    this.buttonTextView.setText(LocaleController.getString(R.string.TwoStepVerificationPasswordReturnSettings));
                }
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.wallet_allset, 160, 160);
                this.imageView.playAnimation();
                break;
            case 8:
                ActionBar actionBar13 = this.actionBar;
                int i216 = R.string.PleaseEnterCurrentPassword;
                actionBar13.setTitle(LocaleController.getString(i216));
                this.titleTextView.setText(LocaleController.getString(i216));
                this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordInfo));
                this.descriptionText.setVisibility(0);
                this.actionBar.getTitleTextView().setAlpha(0.0f);
                this.descriptionText2.setText(LocaleController.getString(R.string.ForgotPassword));
                this.descriptionText2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlueText2));
                OutlineTextContainerView outlineTextContainerView10 = this.outlineTextFirstRow;
                int i217 = R.string.LoginPassword;
                outlineTextContainerView10.setText(LocaleController.getString(i217));
                this.editTextFirstRow.setContentDescription(LocaleController.getString(i217));
                this.editTextFirstRow.setImeOptions(268435462);
                this.editTextFirstRow.setInputType(129);
                this.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
                this.editTextFirstRow.setTypeface(Typeface.DEFAULT);
                this.imageView.setAnimation(R.raw.wallet_science, 120, 120);
                this.imageView.playAnimation();
                break;
            case 9:
                this.titleTextView.setText(LocaleController.getString(R.string.CheckPasswordPerfect));
                this.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordPerfectInfo));
                this.buttonTextView.setText(LocaleController.getString(R.string.CheckPasswordBackToSettings));
                this.descriptionText.setVisibility(0);
                this.imageView.setAnimation(R.raw.wallet_perfect, 140, 140);
                this.imageView.playAnimation();
                break;
        }
        editTextBoldCursor = this.editTextFirstRow;
        if (editTextBoldCursor != null) {
            editTextBoldCursor.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i218, int i219, int i30) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i218, int i219, int i30) {
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
                                return;
                            }
                            if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3]) {
                                if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                    TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setProgress(0.0f, false);
                                    TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                                    return;
                                }
                                if (TwoStepVerificationSetupActivity.this.animationDrawables[2].getCurrentFrame() < 49) {
                                    TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(49);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        if ((animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[3] || TwoStepVerificationSetupActivity.this.editTextFirstRow.getTransformationMethod() != null) && animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[5]) {
                            TwoStepVerificationSetupActivity.this.animationDrawables[2].setCustomEndFrame(-1);
                            if (animatedDrawable != TwoStepVerificationSetupActivity.this.animationDrawables[2]) {
                                TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[2]);
                                TwoStepVerificationSetupActivity.this.animationDrawables[2].setCurrentFrame(49, false);
                            }
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        }
                        TwoStepVerificationSetupActivity.this.imageView.setAnimation(TwoStepVerificationSetupActivity.this.animationDrawables[4]);
                        TwoStepVerificationSetupActivity.this.animationDrawables[4].setProgress(0.0f, false);
                        TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                        return;
                    }
                    if (TwoStepVerificationSetupActivity.this.currentType == 1) {
                        try {
                            TwoStepVerificationSetupActivity.this.animationDrawables[6].setCustomEndFrame((int) ((Math.min(1.0f, TwoStepVerificationSetupActivity.this.editTextFirstRow.getLayout().getLineWidth(0) / TwoStepVerificationSetupActivity.this.editTextFirstRow.getWidth()) * 142.0f) + 18.0f));
                            TwoStepVerificationSetupActivity.this.imageView.playAnimation();
                            return;
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                    }
                    if (TwoStepVerificationSetupActivity.this.currentType != 8 || editable.length() <= 0) {
                        return;
                    }
                    TwoStepVerificationSetupActivity.this.showDoneButton(true);
                }
            });
        }
        return this.fragmentView;
    }

    class AnonymousClass1 extends ActionBar.ActionBarMenuOnItemClick {
        AnonymousClass1() {
        }

        @Override
        public void onItemClick(int i) {
            String string;
            if (i == -1) {
                if (TwoStepVerificationSetupActivity.this.otherwiseReloginDays >= 0 && ((BaseFragment) TwoStepVerificationSetupActivity.this).parentLayout.getFragmentStack().size() == 1) {
                    TwoStepVerificationSetupActivity.this.showSetForcePasswordAlert();
                    return;
                } else {
                    TwoStepVerificationSetupActivity.this.finishFragment();
                    return;
                }
            }
            if (i == 1) {
                AlertDialog.Builder builder = new AlertDialog.Builder(TwoStepVerificationSetupActivity.this.getParentActivity());
                if (TwoStepVerificationSetupActivity.this.currentPassword != null && TwoStepVerificationSetupActivity.this.currentPassword.has_password) {
                    string = LocaleController.getString(R.string.CancelEmailQuestion);
                } else {
                    string = LocaleController.getString(R.string.CancelPasswordQuestion);
                }
                String string2 = LocaleController.getString(R.string.CancelEmailQuestionTitle);
                String string3 = LocaleController.getString(R.string.Abort);
                builder.setMessage(string);
                builder.setTitle(string2);
                builder.setPositiveButton(string3, new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i2) {
                        TwoStepVerificationSetupActivity.this.setNewPassword(true);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder.create();
                TwoStepVerificationSetupActivity.this.showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                }
            }
        }
    }

    public static void $r8$lambda$g21FwuK9K2wZyKt8Ht_rUIF2M2E(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view) {
        if (twoStepVerificationSetupActivity.bottomSkipButton.getAlpha() < 0.5f) {
            return;
        }
        int i = twoStepVerificationSetupActivity.currentType;
        if (i == 0) {
            twoStepVerificationSetupActivity.needShowProgress();
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = twoStepVerificationSetupActivity.emailCode;
            twoStepVerificationSetupActivity.getConnectionsManager().sendRequest(tL_auth_recoverPassword, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    TwoStepVerificationSetupActivity.m4739$r8$lambda$4G89nyjmyCdxiQJ6x9UPRHaFgE(this.f$0, tLObject, tL_error);
                }
            });
            return;
        }
        if (i != 3) {
            if (i == 2) {
                twoStepVerificationSetupActivity.onHintDone();
                return;
            }
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity());
        builder.setMessage(LocaleController.getString(R.string.YourEmailSkipWarningText));
        builder.setTitle(LocaleController.getString(R.string.YourEmailSkipWarning));
        builder.setPositiveButton(LocaleController.getString(R.string.YourEmailSkip), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i2) {
                TwoStepVerificationSetupActivity.$r8$lambda$XXNqlQznmchSeyJ1km3E3P5Te6Y(this.f$0, alertDialog, i2);
            }
        });
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate = builder.create();
        twoStepVerificationSetupActivity.showDialog(alertDialogCreate);
        TextView textView = (TextView) alertDialogCreate.getButton(-1);
        if (textView != null) {
            textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
        }
    }

    public static void m4739$r8$lambda$4G89nyjmyCdxiQJ6x9UPRHaFgE(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$3ietcwnhA7Eurg4qrpYActo9YX4(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$3ietcwnhA7Eurg4qrpYActo9YX4(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error) {
        String pluralString;
        twoStepVerificationSetupActivity.needHideProgress();
        if (tL_error == null) {
            twoStepVerificationSetupActivity.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
            AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity());
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    TwoStepVerificationSetupActivity.$r8$lambda$Y23En4L_qoBybj1DYcpDyKm46ck(this.f$0, alertDialog, i);
                }
            });
            builder.setMessage(LocaleController.getString(R.string.PasswordReset));
            builder.setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle));
            Dialog dialogShowDialog = twoStepVerificationSetupActivity.showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
            return;
        }
        twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
    }

    public static void $r8$lambda$Y23En4L_qoBybj1DYcpDyKm46ck(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, AlertDialog alertDialog, int i) {
        int size = twoStepVerificationSetupActivity.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i2)).removeSelfFromStack();
        }
        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        twoStepVerificationSetupActivity.finishFragment();
    }

    public static void $r8$lambda$XXNqlQznmchSeyJ1km3E3P5Te6Y(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, AlertDialog alertDialog, int i) {
        twoStepVerificationSetupActivity.email = "";
        twoStepVerificationSetupActivity.setNewPassword(false);
    }

    public static void m4742$r8$lambda$6gs3JNtES69Dont1yIOGaI8Lc(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view) {
        if (twoStepVerificationSetupActivity.currentType == 8) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            twoStepVerificationActivity.setForgotPasswordOnShow();
            twoStepVerificationActivity.setPassword(twoStepVerificationSetupActivity.currentPassword);
            twoStepVerificationActivity.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
            twoStepVerificationSetupActivity.presentFragment(twoStepVerificationActivity, true);
            Runnable runnable = twoStepVerificationSetupActivity.openedSettings;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                twoStepVerificationSetupActivity.openedSettings = null;
            }
        }
    }

    public static boolean m4760$r8$lambda$vd1fD2N9GqrxxKCyyVlOMHsGHA(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TextView textView, int i, KeyEvent keyEvent) {
        twoStepVerificationSetupActivity.getClass();
        if (i != 5 && i != 6) {
            return false;
        }
        if (twoStepVerificationSetupActivity.outlineTextSecondRow.getVisibility() == 0) {
            twoStepVerificationSetupActivity.editTextSecondRow.requestFocus();
            return true;
        }
        twoStepVerificationSetupActivity.processNext();
        return true;
    }

    public static void $r8$lambda$O4nT7gpXW1Zaqg3Ga10IkHXahZ0(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view) {
        twoStepVerificationSetupActivity.ignoreTextChange = true;
        if (twoStepVerificationSetupActivity.editTextFirstRow.getTransformationMethod() == null) {
            twoStepVerificationSetupActivity.isPasswordVisible = false;
            twoStepVerificationSetupActivity.editTextFirstRow.setTransformationMethod(PasswordTransformationMethod.getInstance());
            twoStepVerificationSetupActivity.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelIcons), PorterDuff.Mode.MULTIPLY));
            if (twoStepVerificationSetupActivity.currentType == 0 && twoStepVerificationSetupActivity.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity.editTextFirstRow.hasFocus() && twoStepVerificationSetupActivity.monkeyEndCallback == null) {
                twoStepVerificationSetupActivity.animationDrawables[3].setCustomEndFrame(-1);
                RLottieDrawable animatedDrawable = twoStepVerificationSetupActivity.imageView.getAnimatedDrawable();
                RLottieDrawable rLottieDrawable = twoStepVerificationSetupActivity.animationDrawables[3];
                if (animatedDrawable != rLottieDrawable) {
                    twoStepVerificationSetupActivity.imageView.setAnimation(rLottieDrawable);
                    twoStepVerificationSetupActivity.animationDrawables[3].setCurrentFrame(18, false);
                }
                twoStepVerificationSetupActivity.imageView.playAnimation();
            }
        } else {
            twoStepVerificationSetupActivity.isPasswordVisible = true;
            twoStepVerificationSetupActivity.editTextFirstRow.setTransformationMethod(null);
            twoStepVerificationSetupActivity.showPasswordButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_chat_messagePanelSend), PorterDuff.Mode.MULTIPLY));
            if (twoStepVerificationSetupActivity.currentType == 0 && twoStepVerificationSetupActivity.editTextFirstRow.length() > 0 && twoStepVerificationSetupActivity.editTextFirstRow.hasFocus() && twoStepVerificationSetupActivity.monkeyEndCallback == null) {
                twoStepVerificationSetupActivity.animationDrawables[3].setCustomEndFrame(18);
                RLottieDrawable animatedDrawable2 = twoStepVerificationSetupActivity.imageView.getAnimatedDrawable();
                RLottieDrawable rLottieDrawable2 = twoStepVerificationSetupActivity.animationDrawables[3];
                if (animatedDrawable2 != rLottieDrawable2) {
                    twoStepVerificationSetupActivity.imageView.setAnimation(rLottieDrawable2);
                }
                twoStepVerificationSetupActivity.animationDrawables[3].setProgress(0.0f, false);
                twoStepVerificationSetupActivity.imageView.playAnimation();
            }
        }
        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity.editTextFirstRow;
        editTextBoldCursor.setSelection(editTextBoldCursor.length());
        twoStepVerificationSetupActivity.ignoreTextChange = false;
    }

    public static boolean $r8$lambda$dIy9sH8_G2wwpMAK0YaMJizU26k(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TextView textView, int i, KeyEvent keyEvent) {
        twoStepVerificationSetupActivity.getClass();
        if (i != 5 && i != 6) {
            return false;
        }
        twoStepVerificationSetupActivity.processNext();
        return true;
    }

    public static void $r8$lambda$H7YTRCJbdcc4LqbNpX590wgyR1o(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view, boolean z) {
        if (!z) {
            twoStepVerificationSetupActivity.getClass();
        } else {
            twoStepVerificationSetupActivity.keyboardView.setEditText((EditText) view);
            twoStepVerificationSetupActivity.keyboardView.setDispatchBackWhenEmpty(true);
        }
    }

    public static void m4763$r8$lambda$zOAFwbAO2JRBbcvok3jULhFY9I(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view) {
        AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity());
        builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        builder.setPositiveButton(LocaleController.getString(R.string.Reset), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                TwoStepVerificationSetupActivity.m4738$r8$lambda$22H6irg4NJtqbE2NpLe76TAP8(this.f$0, alertDialog, i);
            }
        });
        builder.setTitle(LocaleController.getString(R.string.ResetPassword));
        builder.setMessage(LocaleController.getString(R.string.RestoreEmailTroubleText2));
        twoStepVerificationSetupActivity.showDialog(builder.create());
    }

    public static void m4738$r8$lambda$22H6irg4NJtqbE2NpLe76TAP8(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, AlertDialog alertDialog, int i) {
        twoStepVerificationSetupActivity.onReset();
        twoStepVerificationSetupActivity.finishFragment();
    }

    public static void m4743$r8$lambda$6v2TfZb3PdxsTbcgUdH0zL3uWI(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, View view) {
        twoStepVerificationSetupActivity.getClass();
        ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(new TL_account.resendPasswordEmail(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TwoStepVerificationSetupActivity.m4758$r8$lambda$naAx62nkPfgaXd8Nj5qDcZ2b_w(tLObject, tL_error);
            }
        });
        twoStepVerificationSetupActivity.showDialog(new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity()).setMessage(LocaleController.getString(R.string.ResendCodeInfo)).setTitle(LocaleController.getString(R.string.TwoStepVerificationTitle)).setPositiveButton(LocaleController.getString(R.string.OK), null).create());
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
                        codeNumberField.animateSuccessProgress(1.0f);
                    }
                }, ((long) i) * 75);
                i++;
            } else {
                codeFieldContainer.postDelayed(new Runnable() {
                    @Override
                    public final void run() {
                        TwoStepVerificationSetupActivity.m4759$r8$lambda$peR_V0qoee0NiWDiC_HBxDb1f0(this.f$0, runnable);
                    }
                }, (((long) this.codeFieldContainer.codeField.length) * 75) + 350);
                return;
            }
        }
    }

    public static void m4759$r8$lambda$peR_V0qoee0NiWDiC_HBxDb1f0(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, Runnable runnable) {
        for (CodeNumberField codeNumberField : twoStepVerificationSetupActivity.codeFieldContainer.codeField) {
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
        if ((i != 5 && i != 4) || AndroidUtilities.isTablet()) {
            return false;
        }
        Point point = AndroidUtilities.displaySize;
        return point.x < point.y && !AndroidUtilities.isAccessibilityTouchExplorationEnabled();
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
                } else if (!this.editTextFirstRow.getText().toString().equals(this.firstPassword) && this.currentType == 1) {
                    AndroidUtilities.shakeViewSpring(this.outlineTextFirstRow, 5.0f);
                    try {
                        this.outlineTextFirstRow.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordDoNotMatch), 0).show();
                    } catch (Exception e) {
                        FileLog.e(e);
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
                }
                break;
            case 2:
                String string = this.editTextFirstRow.getText().toString();
                this.hint = string;
                if (string.equalsIgnoreCase(this.firstPassword)) {
                    try {
                        Toast.makeText(getParentActivity(), LocaleController.getString(R.string.PasswordAsHintError), 0).show();
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                } else {
                    onHintDone();
                }
                break;
            case 3:
                if (!this.emailOnly && this.bottomSkipButton.getAlpha() < 1.0f) {
                    this.bottomSkipButton.animate().cancel();
                    this.bottomSkipButton.animate().alpha(1.0f).start();
                }
                String string2 = this.editTextFirstRow.getText().toString();
                this.email = string2;
                if (!isValidEmail(string2)) {
                    onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                } else {
                    setNewPassword(false);
                }
                break;
            case 4:
                final String code = this.codeFieldContainer.getCode();
                TLRPC.TL_auth_checkRecoveryPassword tL_auth_checkRecoveryPassword = new TLRPC.TL_auth_checkRecoveryPassword();
                tL_auth_checkRecoveryPassword.code = code;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_auth_checkRecoveryPassword, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TwoStepVerificationSetupActivity.m4748$r8$lambda$Oo6tyS9RSvDt8wbfUtLojts8Zs(this.f$0, code, tLObject, tL_error);
                    }
                }, 10);
                break;
            case 5:
                TL_account.confirmPasswordEmail confirmpasswordemail = new TL_account.confirmPasswordEmail();
                confirmpasswordemail.code = this.codeFieldContainer.getCode();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(confirmpasswordemail, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        TwoStepVerificationSetupActivity.m4737$r8$lambda$0yi7M7AGldYaQr_nV56Me5710Y(this.f$0, tLObject, tL_error);
                    }
                }, 10);
                needShowProgress();
                break;
            case 6:
                TL_account.Password password = this.currentPassword;
                if (password == null) {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                } else {
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(this.currentAccount, 0, password);
                    twoStepVerificationSetupActivity2.fromRegistration = this.fromRegistration;
                    twoStepVerificationSetupActivity2.closeAfterSet = this.closeAfterSet;
                    twoStepVerificationSetupActivity2.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationSetupActivity2, true);
                }
                break;
            case 7:
                if (this.closeAfterSet) {
                    finishFragment();
                } else if (this.fromRegistration) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("afterSignup", true);
                    MainTabsActivity mainTabsActivity = new MainTabsActivity();
                    mainTabsActivity.prepareDialogsActivity(bundle);
                    presentFragment(mainTabsActivity, true);
                } else {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    twoStepVerificationActivity.setCurrentPasswordParams(this.currentPassword, this.currentPasswordHash, this.currentSecretId, this.currentSecret);
                    twoStepVerificationActivity.setBlockingAlert(this.otherwiseReloginDays);
                    presentFragment(twoStepVerificationActivity, true);
                    Runnable runnable = this.openedSettings;
                    if (runnable != null) {
                        AndroidUtilities.runOnUIThread(runnable);
                        this.openedSettings = null;
                    }
                }
                break;
            case 8:
                if (this.currentPassword == null) {
                    needShowProgress();
                    this.doneAfterPasswordLoad = true;
                } else {
                    String string3 = this.editTextFirstRow.getText().toString();
                    if (string3.length() == 0) {
                        onFieldError(this.outlineTextFirstRow, this.editTextFirstRow, false);
                    } else {
                        final byte[] stringBytes = AndroidUtilities.getStringBytes(string3);
                        needShowProgress();
                        Utilities.globalQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                TwoStepVerificationSetupActivity.m4749$r8$lambda$S8Ca8ne92c7NPWBIAemp4MnwvY(this.f$0, stringBytes);
                            }
                        });
                    }
                }
                break;
            case 9:
                finishFragment();
                break;
        }
    }

    public static void m4749$r8$lambda$S8Ca8ne92c7NPWBIAemp4MnwvY(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, byte[] bArr) {
        twoStepVerificationSetupActivity.getClass();
        TL_account.getPasswordSettings getpasswordsettings = new TL_account.getPasswordSettings();
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationSetupActivity.currentPassword.current_algo;
        final byte[] x = passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow ? SRPHelper.getX(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo) : null;
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TwoStepVerificationSetupActivity.m4757$r8$lambda$l5RYk7AA2E4isn0FW6OE8v3Wnw(this.f$0, x, tLObject, tL_error);
            }
        };
        TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = password.current_algo;
        if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
            TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRPStartCheck = SRPHelper.startCheck(x, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
            getpasswordsettings.password = tL_inputCheckPasswordSRPStartCheck;
            if (tL_inputCheckPasswordSRPStartCheck == null) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.text = "ALGO_INVALID";
                requestDelegate.run(null, tL_error);
                return;
            }
            ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(getpasswordsettings, requestDelegate, 10);
            return;
        }
        TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
        tL_error2.text = "PASSWORD_HASH_INVALID";
        requestDelegate.run(null, tL_error2);
    }

    public static void m4757$r8$lambda$l5RYk7AA2E4isn0FW6OE8v3Wnw(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final byte[] bArr, TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.m4741$r8$lambda$6zPL3_0Wr8s5KdEZ68IYGo45vs(this.f$0, bArr);
                }
            });
        } else {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.$r8$lambda$X0dIXlwdsigZmmQTuXHAfNs45EA(this.f$0, tL_error);
                }
            });
        }
    }

    public static void m4741$r8$lambda$6zPL3_0Wr8s5KdEZ68IYGo45vs(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, byte[] bArr) {
        twoStepVerificationSetupActivity.needHideProgress();
        twoStepVerificationSetupActivity.currentPasswordHash = bArr;
        twoStepVerificationSetupActivity.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(9, twoStepVerificationSetupActivity.currentPassword);
        twoStepVerificationSetupActivity2.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
        twoStepVerificationSetupActivity2.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity2, true);
    }

    public static void $r8$lambda$X0dIXlwdsigZmmQTuXHAfNs45EA(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error) {
        String pluralString;
        twoStepVerificationSetupActivity.getClass();
        if ("SRP_ID_INVALID".equals(tL_error.text)) {
            ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error2) {
                    TwoStepVerificationSetupActivity.$r8$lambda$KPFuHWAmKkBIUuYL5DnKHjt0fVo(this.f$0, tLObject, tL_error2);
                }
            }, 8);
            return;
        }
        twoStepVerificationSetupActivity.needHideProgress();
        if ("PASSWORD_HASH_INVALID".equals(tL_error.text)) {
            twoStepVerificationSetupActivity.descriptionText.setText(LocaleController.getString(R.string.CheckPasswordWrong));
            twoStepVerificationSetupActivity.descriptionText.setTextColor(Theme.getColor(Theme.key_text_RedRegular));
            twoStepVerificationSetupActivity.onFieldError(twoStepVerificationSetupActivity.outlineTextFirstRow, twoStepVerificationSetupActivity.editTextFirstRow, true);
            twoStepVerificationSetupActivity.showDoneButton(false);
            return;
        }
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
            return;
        }
        twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
    }

    public static void $r8$lambda$KPFuHWAmKkBIUuYL5DnKHjt0fVo(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$z_wEJTf0fv5jPjq8QQTWckvGGJw(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void $r8$lambda$z_wEJTf0fv5jPjq8QQTWckvGGJw(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationSetupActivity.getClass();
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationSetupActivity.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
            twoStepVerificationSetupActivity.processNext();
        }
    }

    public static void m4748$r8$lambda$Oo6tyS9RSvDt8wbfUtLojts8Zs(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final String str, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$H8sMFkbY8fAUe99XJoSpWodSzWA(this.f$0, tLObject, str, tL_error);
            }
        });
    }

    public static void $r8$lambda$H8sMFkbY8fAUe99XJoSpWodSzWA(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLObject tLObject, final String str, TLRPC.TL_error tL_error) {
        String pluralString;
        twoStepVerificationSetupActivity.getClass();
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            twoStepVerificationSetupActivity.animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.$r8$lambda$z2kUwcRVSStM4Hv6xzHw60ipbgo(this.f$0, str);
                }
            });
            return;
        }
        if (tL_error == null || tL_error.text.startsWith("CODE_INVALID")) {
            twoStepVerificationSetupActivity.onCodeFieldError(true);
            return;
        }
        if (tL_error.text.startsWith("FLOOD_WAIT")) {
            int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
            if (iIntValue < 60) {
                pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
            } else {
                pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
            }
            twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
            return;
        }
        twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.TwoStepVerificationTitle), tL_error.text);
    }

    public static void $r8$lambda$z2kUwcRVSStM4Hv6xzHw60ipbgo(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, String str) {
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(twoStepVerificationSetupActivity.currentAccount, 0, twoStepVerificationSetupActivity.currentPassword);
        twoStepVerificationSetupActivity2.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
        twoStepVerificationSetupActivity2.fragmentsToClose.addAll(twoStepVerificationSetupActivity.fragmentsToClose);
        twoStepVerificationSetupActivity2.addFragmentToClose(twoStepVerificationSetupActivity);
        twoStepVerificationSetupActivity2.setCurrentEmailCode(str);
        twoStepVerificationSetupActivity2.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity2, true);
    }

    public static void m4737$r8$lambda$0yi7M7AGldYaQr_nV56Me5710Y(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4751$r8$lambda$VhPQ__mJ_GKY8OclREPHuGHQ5Y(this.f$0, tL_error);
            }
        });
    }

    public static void m4751$r8$lambda$VhPQ__mJ_GKY8OclREPHuGHQ5Y(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error) {
        String pluralString;
        twoStepVerificationSetupActivity.needHideProgress();
        if (tL_error == null) {
            if (twoStepVerificationSetupActivity.getParentActivity() == null) {
                return;
            }
            twoStepVerificationSetupActivity.animateSuccess(new Runnable() {
                @Override
                public final void run() {
                    TwoStepVerificationSetupActivity.m4761$r8$lambda$wfDnp6m2wWshB_imd9Nuh7n6vc(this.f$0);
                }
            });
        } else {
            if (tL_error.text.startsWith("CODE_INVALID")) {
                twoStepVerificationSetupActivity.onCodeFieldError(true);
                return;
            }
            if (tL_error.text.startsWith("FLOOD_WAIT")) {
                int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                if (iIntValue < 60) {
                    pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                } else {
                    pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                }
                twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                return;
            }
            twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
        }
    }

    public static void m4761$r8$lambda$wfDnp6m2wWshB_imd9Nuh7n6vc(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        if (twoStepVerificationSetupActivity.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity());
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i) {
                    TwoStepVerificationSetupActivity.$r8$lambda$MFqhzZnpQMCvlCjH_jvJUdY1Adc(this.f$0, alertDialog, i);
                }
            });
            if (twoStepVerificationSetupActivity.currentPassword.has_recovery) {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessChangedText));
            } else {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessText));
            }
            builder.setTitle(LocaleController.getString(R.string.YourPasswordSuccess));
            Dialog dialogShowDialog = twoStepVerificationSetupActivity.showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size = twoStepVerificationSetupActivity.fragmentsToClose.size();
        for (int i = 0; i < size; i++) {
            ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i)).removeSelfFromStack();
        }
        TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
        password.has_password = true;
        password.has_recovery = true;
        password.email_unconfirmed_pattern = "";
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(7, password);
        twoStepVerificationSetupActivity2.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
        twoStepVerificationSetupActivity2.setCurrentPasswordParams(twoStepVerificationSetupActivity.currentPasswordHash, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret, twoStepVerificationSetupActivity.emailOnly);
        twoStepVerificationSetupActivity2.fragmentsToClose.addAll(twoStepVerificationSetupActivity.fragmentsToClose);
        twoStepVerificationSetupActivity2.closeAfterSet = twoStepVerificationSetupActivity.closeAfterSet;
        twoStepVerificationSetupActivity2.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity2, true);
        NotificationCenter notificationCenter = NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount);
        int i2 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = twoStepVerificationSetupActivity.currentPasswordHash;
        TL_account.Password password2 = twoStepVerificationSetupActivity.currentPassword;
        notificationCenter.postNotificationName(i2, bArr, password2.new_algo, password2.new_secure_algo, password2.secure_random, twoStepVerificationSetupActivity.email, twoStepVerificationSetupActivity.hint, null, twoStepVerificationSetupActivity.firstPassword);
        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
    }

    public static void $r8$lambda$MFqhzZnpQMCvlCjH_jvJUdY1Adc(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, AlertDialog alertDialog, int i) {
        int size = twoStepVerificationSetupActivity.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i2)).removeSelfFromStack();
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount);
        int i3 = NotificationCenter.twoStepPasswordChanged;
        byte[] bArr = twoStepVerificationSetupActivity.currentPasswordHash;
        TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
        notificationCenter.postNotificationName(i3, bArr, password.new_algo, password.new_secure_algo, password.secure_random, twoStepVerificationSetupActivity.email, twoStepVerificationSetupActivity.hint, null, twoStepVerificationSetupActivity.firstPassword);
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password2 = twoStepVerificationSetupActivity.currentPassword;
        password2.has_password = true;
        password2.has_recovery = true;
        password2.email_unconfirmed_pattern = "";
        twoStepVerificationActivity.setCurrentPasswordParams(password2, twoStepVerificationSetupActivity.currentPasswordHash, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
        Runnable runnable = twoStepVerificationSetupActivity.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            twoStepVerificationSetupActivity.openedSettings = null;
        }
    }

    private void onCodeFieldError(boolean z) {
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
                TwoStepVerificationSetupActivity.m4745$r8$lambda$DXU7K20wI17XYVKw4GjO4qFAac(this.f$0);
            }
        });
    }

    public static void m4745$r8$lambda$DXU7K20wI17XYVKw4GjO4qFAac(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$fjJHUw2gE1lgiqQYBDF8weUn1pY(this.f$0);
            }
        }, 150L);
    }

    public static void $r8$lambda$fjJHUw2gE1lgiqQYBDF8weUn1pY(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        for (CodeNumberField codeNumberField : twoStepVerificationSetupActivity.codeFieldContainer.codeField) {
            codeNumberField.animateErrorProgress(0.0f);
        }
    }

    @Override
    protected boolean hideKeyboardOnShow() {
        int i = this.currentType;
        return i == 7 || i == 9;
    }

    private void onHintDone() {
        TL_account.Password password = this.currentPassword;
        if (!password.has_recovery) {
            TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = new TwoStepVerificationSetupActivity(this.currentAccount, 3, password);
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
            AnimatorSet animatorSet2 = this.buttonAnimation;
            TextView textView = this.descriptionText2;
            Property property = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.9f);
            TextView textView2 = this.descriptionText2;
            Property property2 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.9f);
            TextView textView3 = this.descriptionText2;
            Property property3 = View.ALPHA;
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property2, 1.0f), ObjectAnimator.ofFloat(this.buttonTextView, (Property<TextView, Float>) property3, 1.0f));
        } else {
            this.descriptionText2.setVisibility(0);
            AnimatorSet animatorSet3 = this.buttonAnimation;
            TextView textView4 = this.buttonTextView;
            Property property4 = View.SCALE_X;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.9f);
            TextView textView5 = this.buttonTextView;
            Property property5 = View.SCALE_Y;
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.9f);
            TextView textView6 = this.buttonTextView;
            Property property6 = View.ALPHA;
            animatorSet3.playTogether(objectAnimatorOfFloat3, objectAnimatorOfFloat4, ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 0.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property4, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property5, 1.0f), ObjectAnimator.ofFloat(this.descriptionText2, (Property<TextView, Float>) property6, 1.0f));
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

    private void setRandomMonkeyIdleAnimation(boolean z) {
        if (this.currentType != 0) {
            return;
        }
        Runnable runnable = this.setAnimationRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        RLottieDrawable animatedDrawable = this.imageView.getAnimatedDrawable();
        if (!z) {
            RLottieDrawable[] rLottieDrawableArr = this.animationDrawables;
            if (animatedDrawable == rLottieDrawableArr[0] || animatedDrawable == rLottieDrawableArr[1] || (this.editTextFirstRow.length() == 0 && (animatedDrawable == null || !animatedDrawable.isRunning()))) {
                if (Utilities.random.nextInt() % 2 == 0) {
                    this.imageView.setAnimation(this.animationDrawables[0]);
                    this.animationDrawables[0].setProgress(0.0f);
                } else {
                    this.imageView.setAnimation(this.animationDrawables[1]);
                    this.animationDrawables[1].setProgress(0.0f);
                }
                if (!z) {
                    this.imageView.playAnimation();
                }
            }
        } else {
            if (Utilities.random.nextInt() % 2 == 0) {
                this.imageView.setAnimation(this.animationDrawables[0]);
                this.animationDrawables[0].setProgress(0.0f);
            } else {
                this.imageView.setAnimation(this.animationDrawables[1]);
                this.animationDrawables[1].setProgress(0.0f);
            }
            if (!z) {
                this.imageView.playAnimation();
            }
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4744$r8$lambda$DQJdKyIgNbV_PmO6tXTxRqL4dA(this.f$0);
            }
        };
        this.setAnimationRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, Utilities.random.nextInt(2000) + 5000);
    }

    public static void m4744$r8$lambda$DQJdKyIgNbV_PmO6tXTxRqL4dA(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        if (twoStepVerificationSetupActivity.setAnimationRunnable == null) {
            return;
        }
        twoStepVerificationSetupActivity.setRandomMonkeyIdleAnimation(false);
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
                        TwoStepVerificationSetupActivity.m4747$r8$lambda$KkwQ2T1F7Ko9cQidjecCeaVHJQ(this.f$0);
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
                    TwoStepVerificationSetupActivity.m4752$r8$lambda$WAFtBqOmSzAi8kIMP3scbVz61g(this.f$0);
                }
            }, 200L);
        }
    }

    public static void m4747$r8$lambda$KkwQ2T1F7Ko9cQidjecCeaVHJQ(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity.editTextFirstRow;
        if (editTextBoldCursor == null || editTextBoldCursor.getVisibility() != 0) {
            return;
        }
        twoStepVerificationSetupActivity.editTextFirstRow.requestFocus();
        AndroidUtilities.showKeyboard(twoStepVerificationSetupActivity.editTextFirstRow);
    }

    public static void m4752$r8$lambda$WAFtBqOmSzAi8kIMP3scbVz61g(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity) {
        CodeFieldContainer codeFieldContainer = twoStepVerificationSetupActivity.codeFieldContainer;
        if (codeFieldContainer == null || codeFieldContainer.getVisibility() != 0) {
            return;
        }
        twoStepVerificationSetupActivity.codeFieldContainer.codeField[0].requestFocus();
    }

    private void loadPasswordInfo() {
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                TwoStepVerificationSetupActivity.$r8$lambda$Xu0KghlVQgh2RpYtZvvxKPUCFvo(this.f$0, tLObject, tL_error);
            }
        }, 10);
    }

    public static void $r8$lambda$Xu0KghlVQgh2RpYtZvvxKPUCFvo(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4753$r8$lambda$YctHZpKtA_TDTlj0rgUobwCKIY(this.f$0, tL_error, tLObject);
            }
        });
    }

    public static void m4753$r8$lambda$YctHZpKtA_TDTlj0rgUobwCKIY(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, TLObject tLObject) {
        twoStepVerificationSetupActivity.getClass();
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationSetupActivity.currentPassword = password;
            if (!TwoStepVerificationActivity.canHandleCurrentPassword(password, false)) {
                AlertsCreator.showUpdateAppAlert(twoStepVerificationSetupActivity.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                return;
            }
            twoStepVerificationSetupActivity.waitingForEmail = !TextUtils.isEmpty(twoStepVerificationSetupActivity.currentPassword.email_unconfirmed_pattern);
            TwoStepVerificationActivity.initPasswordNewAlgo(twoStepVerificationSetupActivity.currentPassword);
            if (!twoStepVerificationSetupActivity.paused && twoStepVerificationSetupActivity.closeAfterSet) {
                TL_account.Password password2 = twoStepVerificationSetupActivity.currentPassword;
                if (password2.has_password) {
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = password2.current_algo;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr = password2.secure_random;
                    String str = password2.has_recovery ? "1" : null;
                    String str2 = password2.hint;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!twoStepVerificationSetupActivity.waitingForEmail && passwordKdfAlgo != null) {
                        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, null, passwordKdfAlgo, securePasswordKdfAlgo, bArr, str, str2, null, null);
                        twoStepVerificationSetupActivity.finishFragment();
                    }
                }
            }
            if (twoStepVerificationSetupActivity.doneAfterPasswordLoad) {
                twoStepVerificationSetupActivity.needHideProgress();
                twoStepVerificationSetupActivity.processNext();
            }
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
        }
    }

    private void needShowProgress() {
        if (getParentActivity() == null || getParentActivity().isFinishing()) {
            return;
        }
        this.floatingButton.setProgressVisible(true, true);
    }

    protected void needHideProgress() {
        this.floatingButton.setProgressVisible(false, true);
    }

    private boolean isValidEmail(String str) {
        if (str != null && str.length() >= 3) {
            int iLastIndexOf = str.lastIndexOf(46);
            int iLastIndexOf2 = str.lastIndexOf(64);
            if (iLastIndexOf2 >= 0 && iLastIndexOf >= iLastIndexOf2) {
                return true;
            }
        }
        return false;
    }

    private void showAlertWithText(String str, String str2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.setTitle(str);
        builder.setMessage(str2);
        showDialog(builder.create());
    }

    public void setNewPassword(final boolean z) {
        TL_account.Password password;
        TLObject tLObject;
        if (z && this.waitingForEmail && this.currentPassword.has_password) {
            needShowProgress();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.cancelPasswordEmail(), new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                    TwoStepVerificationSetupActivity.$r8$lambda$k5_odYFt1p43_nyBQ9H3NTanStI(this.f$0, tLObject2, tL_error);
                }
            });
            return;
        }
        final String str = this.firstPassword;
        final TL_account.passwordInputSettings passwordinputsettings = new TL_account.passwordInputSettings();
        if (z) {
            UserConfig.getInstance(this.currentAccount).resetSavedPassword();
            this.currentSecret = null;
            if (this.waitingForEmail) {
                passwordinputsettings.flags = 2;
                passwordinputsettings.email = "";
            } else {
                passwordinputsettings.flags = 3;
                passwordinputsettings.hint = "";
                passwordinputsettings.new_password_hash = new byte[0];
                passwordinputsettings.new_algo = new TLRPC.TL_passwordKdfAlgoUnknown();
                passwordinputsettings.email = "";
            }
        } else {
            if (this.hint == null && (password = this.currentPassword) != null) {
                this.hint = password.hint;
            }
            if (this.hint == null) {
                this.hint = "";
            }
            if (str != null) {
                passwordinputsettings.flags |= 1;
                passwordinputsettings.hint = this.hint;
                passwordinputsettings.new_algo = this.currentPassword.new_algo;
            }
            if (this.email.length() > 0) {
                passwordinputsettings.flags = 2 | passwordinputsettings.flags;
                passwordinputsettings.email = this.email.trim();
            }
        }
        if (this.emailCode != null) {
            TLRPC.TL_auth_recoverPassword tL_auth_recoverPassword = new TLRPC.TL_auth_recoverPassword();
            tL_auth_recoverPassword.code = this.emailCode;
            tL_auth_recoverPassword.new_settings = passwordinputsettings;
            tL_auth_recoverPassword.flags |= 1;
            tLObject = tL_auth_recoverPassword;
        } else {
            TL_account.updatePasswordSettings updatepasswordsettings = new TL_account.updatePasswordSettings();
            byte[] bArr = this.currentPasswordHash;
            if (bArr == null || bArr.length == 0 || (z && this.waitingForEmail)) {
                updatepasswordsettings.password = new TLRPC.TL_inputCheckPasswordEmpty();
            }
            updatepasswordsettings.new_settings = passwordinputsettings;
            tLObject = updatepasswordsettings;
        }
        final TLObject tLObject2 = tLObject;
        needShowProgress();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4740$r8$lambda$57anabMqOSBxSY9cOcke50vypM(this.f$0, tLObject2, z, str, passwordinputsettings);
            }
        });
    }

    public static void $r8$lambda$k5_odYFt1p43_nyBQ9H3NTanStI(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$iNdDXNlwoshgMUAM_zLpbTmIrrA(this.f$0, tL_error);
            }
        });
    }

    public static void $r8$lambda$iNdDXNlwoshgMUAM_zLpbTmIrrA(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.needHideProgress();
        if (tL_error == null) {
            TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
            TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
            password.has_recovery = false;
            password.email_unconfirmed_pattern = "";
            twoStepVerificationActivity.setCurrentPasswordParams(password, twoStepVerificationSetupActivity.currentPasswordHash, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret);
            twoStepVerificationActivity.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
            twoStepVerificationSetupActivity.presentFragment(twoStepVerificationActivity, true);
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            Runnable runnable = twoStepVerificationSetupActivity.openedSettings;
            if (runnable != null) {
                AndroidUtilities.runOnUIThread(runnable);
                twoStepVerificationSetupActivity.openedSettings = null;
            }
        }
    }

    public static void m4740$r8$lambda$57anabMqOSBxSY9cOcke50vypM(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLObject tLObject, final boolean z, final String str, final TL_account.passwordInputSettings passwordinputsettings) {
        final byte[] x;
        byte[] bArr;
        byte[] bArr2;
        twoStepVerificationSetupActivity.getClass();
        if (tLObject instanceof TL_account.updatePasswordSettings) {
            TL_account.updatePasswordSettings updatepasswordsettings = (TL_account.updatePasswordSettings) tLObject;
            if (updatepasswordsettings.password == null) {
                updatepasswordsettings.password = twoStepVerificationSetupActivity.getNewSrpPassword();
            }
        }
        if (z || str == null) {
            x = null;
            bArr = null;
        } else {
            byte[] stringBytes = AndroidUtilities.getStringBytes(str);
            TLRPC.PasswordKdfAlgo passwordKdfAlgo = twoStepVerificationSetupActivity.currentPassword.new_algo;
            if (passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                bArr = stringBytes;
                x = SRPHelper.getX(stringBytes, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
            } else {
                bArr = stringBytes;
                x = null;
            }
        }
        RequestDelegate requestDelegate = new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject2, TLRPC.TL_error tL_error) {
                TwoStepVerificationSetupActivity.m4762$r8$lambda$zGUKzCkQki6fDk12Kc2DsTwzo(this.f$0, z, x, str, passwordinputsettings, tLObject2, tL_error);
            }
        };
        if (!z) {
            if (str != null && (bArr2 = twoStepVerificationSetupActivity.currentSecret) != null && bArr2.length == 32) {
                TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = twoStepVerificationSetupActivity.currentPassword.new_secure_algo;
                if (securePasswordKdfAlgo instanceof TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) {
                    TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000 = (TLRPC.TL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000) securePasswordKdfAlgo;
                    byte[] bArrComputePBKDF2 = Utilities.computePBKDF2(bArr, tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000.salt);
                    byte[] bArr3 = new byte[32];
                    System.arraycopy(bArrComputePBKDF2, 0, bArr3, 0, 32);
                    byte[] bArr4 = new byte[16];
                    System.arraycopy(bArrComputePBKDF2, 32, bArr4, 0, 16);
                    byte[] bArr5 = new byte[32];
                    System.arraycopy(twoStepVerificationSetupActivity.currentSecret, 0, bArr5, 0, 32);
                    Utilities.aesCbcEncryptionByteArraySafe(bArr5, bArr3, bArr4, 0, 32, 0, 1);
                    TLRPC.TL_secureSecretSettings tL_secureSecretSettings = new TLRPC.TL_secureSecretSettings();
                    passwordinputsettings.new_secure_settings = tL_secureSecretSettings;
                    tL_secureSecretSettings.secure_algo = tL_securePasswordKdfAlgoPBKDF2HMACSHA512iter100000;
                    tL_secureSecretSettings.secure_secret = bArr5;
                    tL_secureSecretSettings.secure_secret_id = twoStepVerificationSetupActivity.currentSecretId;
                    passwordinputsettings.flags |= 4;
                }
            }
            TLRPC.PasswordKdfAlgo passwordKdfAlgo2 = twoStepVerificationSetupActivity.currentPassword.new_algo;
            if (passwordKdfAlgo2 instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) {
                if (str != null) {
                    byte[] vBytes = SRPHelper.getVBytes(bArr, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo2);
                    passwordinputsettings.new_password_hash = vBytes;
                    if (vBytes == null) {
                        TLRPC.TL_error tL_error = new TLRPC.TL_error();
                        tL_error.text = "ALGO_INVALID";
                        requestDelegate.run(null, tL_error);
                    }
                }
                ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(tLObject, requestDelegate, 10);
                return;
            }
            TLRPC.TL_error tL_error2 = new TLRPC.TL_error();
            tL_error2.text = "PASSWORD_HASH_INVALID";
            requestDelegate.run(null, tL_error2);
            return;
        }
        ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(tLObject, requestDelegate, 10);
    }

    public static void m4762$r8$lambda$zGUKzCkQki6fDk12Kc2DsTwzo(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final boolean z, final byte[] bArr, final String str, final TL_account.passwordInputSettings passwordinputsettings, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.$r8$lambda$fyWnIzC7rmULsj9uWBwYYx8GYwI(this.f$0, tL_error, z, tLObject, bArr, str, passwordinputsettings);
            }
        });
    }

    public static void $r8$lambda$fyWnIzC7rmULsj9uWBwYYx8GYwI(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, final boolean z, TLObject tLObject, final byte[] bArr, String str, TL_account.passwordInputSettings passwordinputsettings) {
        String pluralString;
        TL_account.Password password;
        if (tL_error != null) {
            twoStepVerificationSetupActivity.getClass();
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(twoStepVerificationSetupActivity.currentAccount).sendRequest(new TL_account.getPassword(), new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        TwoStepVerificationSetupActivity.m4754$r8$lambda$dszUKilBlTQxSZriP1ST06MG74(this.f$0, z, tLObject2, tL_error2);
                    }
                }, 8);
                return;
            }
        }
        twoStepVerificationSetupActivity.needHideProgress();
        if (tL_error != null || (!(tLObject instanceof TLRPC.TL_boolTrue) && !(tLObject instanceof TLRPC.auth_Authorization))) {
            if (tL_error != null) {
                if ("EMAIL_UNCONFIRMED".equals(tL_error.text) || tL_error.text.startsWith("EMAIL_UNCONFIRMED_")) {
                    NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
                    int size = twoStepVerificationSetupActivity.fragmentsToClose.size();
                    for (int i = 0; i < size; i++) {
                        ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i)).removeSelfFromStack();
                    }
                    NotificationCenter notificationCenter = NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount);
                    int i2 = NotificationCenter.twoStepPasswordChanged;
                    TLRPC.PasswordKdfAlgo passwordKdfAlgo = passwordinputsettings.new_algo;
                    TL_account.Password password2 = twoStepVerificationSetupActivity.currentPassword;
                    TLRPC.SecurePasswordKdfAlgo securePasswordKdfAlgo = password2.new_secure_algo;
                    byte[] bArr2 = password2.secure_random;
                    String str2 = twoStepVerificationSetupActivity.email;
                    notificationCenter.postNotificationName(i2, bArr, passwordKdfAlgo, securePasswordKdfAlgo, bArr2, str2, twoStepVerificationSetupActivity.hint, str2, twoStepVerificationSetupActivity.firstPassword);
                    TL_account.Password password3 = twoStepVerificationSetupActivity.currentPassword;
                    password3.email_unconfirmed_pattern = twoStepVerificationSetupActivity.email;
                    TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = new TwoStepVerificationSetupActivity(5, password3);
                    twoStepVerificationSetupActivity2.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
                    twoStepVerificationSetupActivity2.setCurrentPasswordParams(bArr != null ? bArr : twoStepVerificationSetupActivity.currentPasswordHash, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret, twoStepVerificationSetupActivity.emailOnly);
                    twoStepVerificationSetupActivity2.closeAfterSet = twoStepVerificationSetupActivity.closeAfterSet;
                    twoStepVerificationSetupActivity2.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
                    twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity2, true);
                    return;
                }
                if ("EMAIL_INVALID".equals(tL_error.text)) {
                    twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.getString(R.string.PasswordEmailInvalid));
                    return;
                }
                if (tL_error.text.startsWith("FLOOD_WAIT")) {
                    int iIntValue = Utilities.parseInt((CharSequence) tL_error.text).intValue();
                    if (iIntValue < 60) {
                        pluralString = LocaleController.formatPluralString("Seconds", iIntValue, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Minutes", iIntValue / 60, new Object[0]);
                    }
                    twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), LocaleController.formatString("FloodWaitTime", R.string.FloodWaitTime, pluralString));
                    return;
                }
                twoStepVerificationSetupActivity.showAlertWithText(LocaleController.getString(R.string.AppName), tL_error.text);
                return;
            }
            return;
        }
        twoStepVerificationSetupActivity.getMessagesController().removeSuggestion(0L, "VALIDATE_PASSWORD");
        if (z) {
            int size2 = twoStepVerificationSetupActivity.fragmentsToClose.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i3)).removeSelfFromStack();
            }
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didRemoveTwoStepPassword, new Object[0]);
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, new Object[0]);
            twoStepVerificationSetupActivity.finishFragment();
            return;
        }
        if (twoStepVerificationSetupActivity.getParentActivity() == null) {
            return;
        }
        if (twoStepVerificationSetupActivity.currentPassword.has_password) {
            AlertDialog.Builder builder = new AlertDialog.Builder(twoStepVerificationSetupActivity.getParentActivity());
            builder.setPositiveButton(LocaleController.getString(R.string.OK), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i4) {
                    TwoStepVerificationSetupActivity.$r8$lambda$ADLWQDdObr2YM50W8AynnXLqi8M(this.f$0, bArr, alertDialog, i4);
                }
            });
            if (str == null && (password = twoStepVerificationSetupActivity.currentPassword) != null && password.has_password) {
                builder.setMessage(LocaleController.getString(R.string.YourEmailSuccessText));
            } else {
                builder.setMessage(LocaleController.getString(R.string.YourPasswordChangedSuccessText));
            }
            builder.setTitle(LocaleController.getString(R.string.YourPasswordSuccess));
            Dialog dialogShowDialog = twoStepVerificationSetupActivity.showDialog(builder.create());
            if (dialogShowDialog != null) {
                dialogShowDialog.setCanceledOnTouchOutside(false);
                dialogShowDialog.setCancelable(false);
                return;
            }
            return;
        }
        int size3 = twoStepVerificationSetupActivity.fragmentsToClose.size();
        for (int i4 = 0; i4 < size3; i4++) {
            ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i4)).removeSelfFromStack();
        }
        TL_account.Password password4 = twoStepVerificationSetupActivity.currentPassword;
        password4.has_password = true;
        if (!password4.has_recovery) {
            password4.has_recovery = !TextUtils.isEmpty(password4.email_unconfirmed_pattern);
        }
        if (twoStepVerificationSetupActivity.closeAfterSet) {
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.twoStepPasswordChanged, new Object[0]);
        }
        TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = new TwoStepVerificationSetupActivity(7, twoStepVerificationSetupActivity.currentPassword);
        twoStepVerificationSetupActivity3.fromRegistration = twoStepVerificationSetupActivity.fromRegistration;
        twoStepVerificationSetupActivity3.setCurrentPasswordParams(bArr != null ? bArr : twoStepVerificationSetupActivity.currentPasswordHash, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret, twoStepVerificationSetupActivity.emailOnly);
        twoStepVerificationSetupActivity3.closeAfterSet = twoStepVerificationSetupActivity.closeAfterSet;
        twoStepVerificationSetupActivity3.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationSetupActivity3, true);
        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
    }

    public static void m4754$r8$lambda$dszUKilBlTQxSZriP1ST06MG74(final TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, final boolean z, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        twoStepVerificationSetupActivity.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                TwoStepVerificationSetupActivity.m4755$r8$lambda$fkZY4mnse3EerU50eoiVh8HqSI(this.f$0, tL_error, tLObject, z);
            }
        });
    }

    public static void m4755$r8$lambda$fkZY4mnse3EerU50eoiVh8HqSI(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        twoStepVerificationSetupActivity.getClass();
        if (tL_error == null) {
            TL_account.Password password = (TL_account.Password) tLObject;
            twoStepVerificationSetupActivity.currentPassword = password;
            TwoStepVerificationActivity.initPasswordNewAlgo(password);
            twoStepVerificationSetupActivity.setNewPassword(z);
            NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
        }
    }

    public static void $r8$lambda$ADLWQDdObr2YM50W8AynnXLqi8M(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, byte[] bArr, AlertDialog alertDialog, int i) {
        int size = twoStepVerificationSetupActivity.fragmentsToClose.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((BaseFragment) twoStepVerificationSetupActivity.fragmentsToClose.get(i2)).removeSelfFromStack();
        }
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        TL_account.Password password = twoStepVerificationSetupActivity.currentPassword;
        password.has_password = true;
        if (!password.has_recovery) {
            password.has_recovery = !TextUtils.isEmpty(password.email_unconfirmed_pattern);
        }
        TL_account.Password password2 = twoStepVerificationSetupActivity.currentPassword;
        if (bArr == null) {
            bArr = twoStepVerificationSetupActivity.currentPasswordHash;
        }
        twoStepVerificationActivity.setCurrentPasswordParams(password2, bArr, twoStepVerificationSetupActivity.currentSecretId, twoStepVerificationSetupActivity.currentSecret);
        twoStepVerificationActivity.setBlockingAlert(twoStepVerificationSetupActivity.otherwiseReloginDays);
        twoStepVerificationSetupActivity.presentFragment(twoStepVerificationActivity, true);
        NotificationCenter.getInstance(twoStepVerificationSetupActivity.currentAccount).postNotificationName(NotificationCenter.didSetOrRemoveTwoStepPassword, twoStepVerificationSetupActivity.currentPassword);
        Runnable runnable = twoStepVerificationSetupActivity.openedSettings;
        if (runnable != null) {
            AndroidUtilities.runOnUIThread(runnable);
            twoStepVerificationSetupActivity.openedSettings = null;
        }
    }

    protected TLRPC.TL_inputCheckPasswordSRP getNewSrpPassword() {
        TL_account.Password password = this.currentPassword;
        TLRPC.PasswordKdfAlgo passwordKdfAlgo = password.current_algo;
        if (!(passwordKdfAlgo instanceof TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow)) {
            return null;
        }
        return SRPHelper.startCheck(this.currentPasswordHash, password.srp_id, password.srp_B, (TLRPC.TL_passwordKdfAlgoSHA256SHA256PBKDF2HMACSHA512iter100000SHA256ModPow) passwordKdfAlgo);
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.titleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteGrayText6));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_HINTTEXTCOLOR, null, null, null, null, Theme.key_windowBackgroundWhiteHintText));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputField));
        arrayList.add(new ThemeDescription(this.editTextFirstRow, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, Theme.key_windowBackgroundWhiteInputFieldActivated));
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
    public boolean onBackPressed(boolean z) {
        if (this.otherwiseReloginDays < 0 || this.parentLayout.getFragmentStack().size() != 1) {
            if (z) {
                finishFragment();
            }
            return true;
        }
        if (!z) {
            return false;
        }
        showSetForcePasswordAlert();
        return false;
    }

    @Override
    public boolean finishFragment(boolean z) {
        for (BaseFragment baseFragment : getParentLayout().getFragmentStack()) {
            if (baseFragment != this && (baseFragment instanceof TwoStepVerificationSetupActivity)) {
                ((TwoStepVerificationSetupActivity) baseFragment).floatingAutoAnimator.ignoreNextLayout();
            }
        }
        return super.finishFragment(z);
    }

    public void showSetForcePasswordAlert() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTitle(LocaleController.getString(R.string.Warning));
        builder.setMessage(LocaleController.formatPluralString("ForceSetPasswordAlertMessageShort", this.otherwiseReloginDays, new Object[0]));
        builder.setPositiveButton(LocaleController.getString(R.string.TwoStepVerificationSetPassword), null);
        builder.setNegativeButton(LocaleController.getString(R.string.ForceSetPasswordCancel), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.finishFragment();
            }
        });
        ((TextView) builder.show().getButton(-2)).setTextColor(Theme.getColor(Theme.key_text_RedBold));
    }

    public void setBlockingAlert(int i) {
        this.otherwiseReloginDays = i;
    }

    @Override
    public void finishFragment() {
        if (this.otherwiseReloginDays >= 0 && this.parentLayout.getFragmentStack().size() == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("afterSignup", true);
            MainTabsActivity mainTabsActivity = new MainTabsActivity();
            mainTabsActivity.prepareDialogsActivity(bundle);
            presentFragment(mainTabsActivity, true);
            return;
        }
        super.finishFragment();
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(Theme.key_windowBackgroundWhite, null, true)) > 0.699999988079071d;
    }
}
