package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.biometric.BiometricManager$DefaultInjector;
import androidx.biometric.BiometricPrompt$AuthenticationCallback;
import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.android.billingclient.api.zzbo;
import com.google.android.gms.cast.internal.zzr;
import com.google.android.gms.cast.zzbe;
import com.google.android.gms.internal.mlkit_language_id_common.zziq;
import com.google.android.gms.internal.mlkit_vision_common.zzlt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.support.fingerprint.FingerprintManagerCompat;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda380;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda2;
import org.telegram.ui.LoginActivity;
import org.telegram.ui.LoginActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda44;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;
import org.telegram.ui.iv.RichEditText;

public class PasscodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int[] ids = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    public SpringAnimation backgroundAnimationSpring;
    public Drawable backgroundDrawable;
    public final AnonymousClass1 backgroundFrameLayout;
    public final LinkedList backgroundSpringNextQueue;
    public final LinkedList backgroundSpringQueue;
    public final View border;
    public final ImageView checkImage;
    public final BubbleActivity.AnonymousClass1 checkRunnable;
    public PasscodeViewDelegate delegate;
    public final ImageView fingerprintImage;
    public final PasscodeButton fingerprintView;
    public final RLottieImageView imageView;
    public int imageY;
    public final ArrayList innerAnimators;
    public int keyboardHeight;
    public KeyboardNotifier keyboardNotifier;
    public int lastValue;
    public final ArrayList numberFrameLayouts;
    public final FrameLayout numbersContainer;
    public final PhotoViewer.AnonymousClass19 numbersFrameLayout;
    public final FrameLayout numbersTitleContainer;
    public final TextView passcodeTextView;
    public final EditTextBoldCursor passwordEditText;
    public final AnimatingTextView passwordEditText2;
    public final FrameLayout passwordFrameLayout;
    public ValueAnimator pinAnimator;
    public boolean pinShown;
    public final int[] pos;
    public final Rect rect;
    public final TextView retryTextView;
    public int shiftDp;
    public float shownT;
    public final TextView subtitleView;

    public final class AnonymousClass1 extends FrameLayout {
        public final Paint paint;

        public AnonymousClass1(Context context) {
            super(context);
            this.paint = new Paint();
        }

        @Override
        public final void onDraw(Canvas canvas) {
            PasscodeView passcodeView = PasscodeView.this;
            Drawable drawable = passcodeView.backgroundDrawable;
            if (drawable == null) {
                super.onDraw(canvas);
            } else if ((drawable instanceof MotionBackgroundDrawable) || (drawable instanceof ColorDrawable) || (drawable instanceof GradientDrawable)) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                passcodeView.backgroundDrawable.draw(canvas);
            } else {
                float fMax = Math.max(getMeasuredWidth() / passcodeView.backgroundDrawable.getIntrinsicWidth(), (getMeasuredHeight() + passcodeView.keyboardHeight) / passcodeView.backgroundDrawable.getIntrinsicHeight());
                int iCeil = (int) Math.ceil(passcodeView.backgroundDrawable.getIntrinsicWidth() * fMax);
                int iCeil2 = (int) Math.ceil(passcodeView.backgroundDrawable.getIntrinsicHeight() * fMax);
                int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                int measuredHeight = ((getMeasuredHeight() - iCeil2) + passcodeView.keyboardHeight) / 2;
                passcodeView.backgroundDrawable.setBounds(measuredWidth, measuredHeight, iCeil + measuredWidth, iCeil2 + measuredHeight);
                passcodeView.backgroundDrawable.draw(canvas);
            }
            canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
        }

        @Override
        public final void setBackgroundColor(int i) {
            this.paint.setColor(i);
        }
    }

    public final class AnonymousClass9 implements ViewTreeObserver.OnGlobalLayoutListener {
        public final LinkManager$$ExternalSyntheticLambda2 val$onShow;
        public final int val$x;
        public final int val$y;

        public AnonymousClass9(int i, int i2, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2) {
            this.val$x = i;
            this.val$y = i2;
            this.val$onShow = linkManager$$ExternalSyntheticLambda2;
        }

        @Override
        public final void onGlobalLayout() {
            float f;
            int iDp;
            AnimatorSet animatorSet;
            PasscodeView passcodeView = PasscodeView.this;
            passcodeView.setAlpha(1.0f);
            passcodeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            RLottieImageView rLottieImageView = passcodeView.imageView;
            rLottieImageView.getAnimatedDrawable().setCurrentFrame(0, false, false);
            rLottieImageView.getAnimatedDrawable().setCustomEndFrame(37);
            rLottieImageView.playAnimation();
            char c = 1;
            passcodeView.showPin(true);
            AndroidUtilities.runOnUIThread(new PasscodeView$9$$ExternalSyntheticLambda0(this, 0), 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i = point.x;
            int i2 = point.y + AndroidUtilities.statusBarHeight;
            int i3 = this.val$x;
            int i4 = i - i3;
            int i5 = i4 * i4;
            int i6 = this.val$y;
            int i7 = i2 - i6;
            int i8 = i7 * i7;
            double dSqrt = Math.sqrt(i8 + i5);
            int i9 = i3 * i3;
            double dSqrt2 = Math.sqrt(i8 + i9);
            int i10 = i6 * i6;
            final double dMax = Math.max(Math.max(Math.max(dSqrt, dSqrt2), Math.sqrt(i9 + i10)), Math.sqrt(i10 + i5));
            ArrayList arrayList2 = passcodeView.innerAnimators;
            arrayList2.clear();
            PhotoViewer.AnonymousClass19 anonymousClass19 = passcodeView.numbersFrameLayout;
            int childCount = anonymousClass19.getChildCount();
            int i11 = 0;
            while (i11 < childCount) {
                View childAt = anonymousClass19.getChildAt(i11);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                InnerAnimator innerAnimator = new InnerAnimator();
                int[] iArr = passcodeView.pos;
                childAt.getLocationInWindow(iArr);
                int measuredWidth = (childAt.getMeasuredWidth() / 2) + iArr[0];
                int measuredHeight = (childAt.getMeasuredHeight() / 2) + iArr[c];
                int i12 = i3 - measuredWidth;
                int i13 = i6 - measuredHeight;
                int i14 = childCount;
                innerAnimator.startRadius = ((float) Math.sqrt((i13 * i13) + (i12 * i12))) - AndroidUtilities.dp(40.0f);
                if (i11 != -1) {
                    animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, 1.0f));
                    animatorSet.setDuration(140L);
                    animatorSet.setInterpolator(new DecelerateInterpolator());
                } else {
                    animatorSet = null;
                }
                AnimatorSet animatorSet3 = new AnimatorSet();
                innerAnimator.animatorSet = animatorSet3;
                int i15 = i6;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_X, i11 == -1 ? 0.9f : 0.6f, i11 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.SCALE_Y, i11 != -1 ? 0.6f : 0.9f, i11 == -1 ? 1.0f : 1.04f), ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
                innerAnimator.animatorSet.addListener(new ItemOptions.AnonymousClass3(animatorSet, 13));
                innerAnimator.animatorSet.setDuration(i11 == -1 ? 232L : 200L);
                innerAnimator.animatorSet.setInterpolator(new DecelerateInterpolator());
                arrayList2.add(innerAnimator);
                i11++;
                childCount = i14;
                anonymousClass19 = anonymousClass19;
                i6 = i15;
                c = 1;
            }
            int i16 = i6;
            arrayList.add(ObjectAnimator.ofFloat(passcodeView.backgroundFrameLayout, (Property<AnonymousClass1, Float>) View.ALPHA, 0.0f, 1.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PasscodeView.AnonymousClass9 anonymousClass9 = this.f$0;
                    anonymousClass9.getClass();
                    double animatedFraction = dMax * ((double) valueAnimator.getAnimatedFraction());
                    int i17 = 0;
                    while (true) {
                        PasscodeView passcodeView2 = PasscodeView.this;
                        if (i17 >= passcodeView2.innerAnimators.size()) {
                            return;
                        }
                        ArrayList arrayList3 = passcodeView2.innerAnimators;
                        PasscodeView.InnerAnimator innerAnimator2 = (PasscodeView.InnerAnimator) arrayList3.get(i17);
                        if (innerAnimator2.startRadius <= animatedFraction) {
                            innerAnimator2.animatorSet.start();
                            arrayList3.remove(i17);
                            i17--;
                        }
                        i17++;
                    }
                }
            });
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatorSet2.setInterpolator(cubicBezierInterpolator);
            animatorSet2.setDuration(500L);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(passcodeView.shownT, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ItemOptions$$ExternalSyntheticLambda4(this, 25));
            final int i17 = 0;
            valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter(this) {
                public final AnonymousClass9 this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    EditTextBoldCursor editTextBoldCursor;
                    switch (i17) {
                        case 0:
                            PasscodeView passcodeView2 = PasscodeView.this;
                            passcodeView2.shownT = 1.0f;
                            passcodeView2.onAnimationUpdate(1.0f);
                            break;
                        default:
                            AnonymousClass9 anonymousClass9 = this.this$1;
                            LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2 = anonymousClass9.val$onShow;
                            if (linkManager$$ExternalSyntheticLambda2 != null) {
                                linkManager$$ExternalSyntheticLambda2.run();
                            }
                            if (SharedConfig.passcodeType == 1) {
                                PasscodeView passcodeView3 = PasscodeView.this;
                                if (passcodeView3.retryTextView.getVisibility() != 0 && (editTextBoldCursor = passcodeView3.passwordEditText) != null) {
                                    editTextBoldCursor.requestFocus();
                                    AndroidUtilities.showKeyboard(passcodeView3.passwordEditText);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            valueAnimatorOfFloat2.setDuration(420L);
            valueAnimatorOfFloat2.setInterpolator(cubicBezierInterpolator);
            arrayList.add(valueAnimatorOfFloat2);
            animatorSet2.playTogether(arrayList);
            final int i18 = 1;
            animatorSet2.addListener(new AnimatorListenerAdapter(this) {
                public final AnonymousClass9 this$1;

                {
                    this.this$1 = this;
                }

                @Override
                public final void onAnimationEnd(Animator animator) {
                    EditTextBoldCursor editTextBoldCursor;
                    switch (i18) {
                        case 0:
                            PasscodeView passcodeView2 = PasscodeView.this;
                            passcodeView2.shownT = 1.0f;
                            passcodeView2.onAnimationUpdate(1.0f);
                            break;
                        default:
                            AnonymousClass9 anonymousClass9 = this.this$1;
                            LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2 = anonymousClass9.val$onShow;
                            if (linkManager$$ExternalSyntheticLambda2 != null) {
                                linkManager$$ExternalSyntheticLambda2.run();
                            }
                            if (SharedConfig.passcodeType == 1) {
                                PasscodeView passcodeView3 = PasscodeView.this;
                                if (passcodeView3.retryTextView.getVisibility() != 0 && (editTextBoldCursor = passcodeView3.passwordEditText) != null) {
                                    editTextBoldCursor.requestFocus();
                                    AndroidUtilities.showKeyboard(passcodeView3.passwordEditText);
                                    break;
                                }
                            }
                            break;
                    }
                }
            });
            animatorSet2.start();
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(332L);
            if (AndroidUtilities.isTablet() || passcodeView.getContext().getResources().getConfiguration().orientation != 2) {
                f = i / 2.0f;
                iDp = AndroidUtilities.dp(29.0f);
            } else {
                f = (SharedConfig.passcodeType == 0 ? i / 2.0f : i) / 2.0f;
                iDp = AndroidUtilities.dp(30.0f);
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) View.TRANSLATION_X, i3 - AndroidUtilities.dp(29.0f), f - iDp), ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) View.TRANSLATION_Y, i16 - AndroidUtilities.dp(29.0f), passcodeView.imageY), ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(rLottieImageView, (Property<RLottieImageView, Float>) View.SCALE_Y, 0.5f, 1.0f));
            animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet4.start();
        }
    }

    public final class AnimatingTextView extends FrameLayout {
        public final ArrayList characterTextViews;
        public AnimatorSet currentAnimation;
        public zzr dotRunnable;
        public final ArrayList dotTextViews;
        public final StringBuilder stringBuilder;

        public final class AnonymousClass2 extends AnimatorListenerAdapter {
            public final int $r8$classId;
            public final AnimatingTextView this$1;

            public AnonymousClass2(AnimatingTextView animatingTextView, int i) {
                this.$r8$classId = i;
                this.this$1 = animatingTextView;
            }

            @Override
            public final void onAnimationEnd(Animator animator) {
                switch (this.$r8$classId) {
                    case 0:
                        AnimatingTextView animatingTextView = this.this$1;
                        AnimatorSet animatorSet = animatingTextView.currentAnimation;
                        if (animatorSet != null && animatorSet.equals(animator)) {
                            animatingTextView.currentAnimation = null;
                            break;
                        }
                        break;
                    case 1:
                        AnimatingTextView animatingTextView2 = this.this$1;
                        AnimatorSet animatorSet2 = animatingTextView2.currentAnimation;
                        if (animatorSet2 != null && animatorSet2.equals(animator)) {
                            animatingTextView2.currentAnimation = null;
                            break;
                        }
                        break;
                    default:
                        AnimatingTextView animatingTextView3 = this.this$1;
                        AnimatorSet animatorSet3 = animatingTextView3.currentAnimation;
                        if (animatorSet3 != null && animatorSet3.equals(animator)) {
                            animatingTextView3.currentAnimation = null;
                            break;
                        }
                        break;
                }
            }
        }

        public AnimatingTextView(Context context) {
            super(context);
            this.characterTextViews = new ArrayList(4);
            this.dotTextViews = new ArrayList(4);
            this.stringBuilder = new StringBuilder(4);
            for (int i = 0; i < 4; i++) {
                TextView textView = new TextView(context);
                textView.setTextColor(-1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 36.0f);
                textView.setGravity(17);
                textView.setAlpha(0.0f);
                textView.setPivotX(AndroidUtilities.dp(25.0f));
                textView.setPivotY(AndroidUtilities.dp(25.0f));
                addView(textView, LayoutHelper.createFrame(50, 50, 51));
                this.characterTextViews.add(textView);
                TextView textView2 = new TextView(context);
                textView2.setTextColor(-1);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setTextSize(1, 36.0f);
                textView2.setGravity(17);
                textView2.setAlpha(0.0f);
                textView2.setText("•");
                textView2.setPivotX(AndroidUtilities.dp(25.0f));
                textView2.setPivotY(AndroidUtilities.dp(25.0f));
                addView(textView2, LayoutHelper.createFrame(50, 50, 51));
                this.dotTextViews.add(textView2);
            }
        }

        public static void access$1200(AnimatingTextView animatingTextView, boolean z) {
            if (animatingTextView.stringBuilder.length() == 0) {
                return;
            }
            zzr zzrVar = animatingTextView.dotRunnable;
            if (zzrVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zzrVar);
                animatingTextView.dotRunnable = null;
            }
            AnimatorSet animatorSet = animatingTextView.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                animatingTextView.currentAnimation = null;
            }
            StringBuilder sb = animatingTextView.stringBuilder;
            sb.delete(0, sb.length());
            ArrayList arrayList = animatingTextView.dotTextViews;
            ArrayList arrayList2 = animatingTextView.characterTextViews;
            if (z) {
                ArrayList arrayList3 = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    TextView textView = (TextView) arrayList2.get(i);
                    float alpha = textView.getAlpha();
                    Property property = View.ALPHA;
                    Property property2 = View.SCALE_Y;
                    Property property3 = View.SCALE_X;
                    if (alpha != 0.0f) {
                        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                        arrayList3.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    }
                    TextView textView2 = (TextView) arrayList.get(i);
                    if (textView2.getAlpha() != 0.0f) {
                        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                        arrayList3.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatingTextView.currentAnimation = animatorSet2;
                animatorSet2.setDuration(150L);
                animatingTextView.currentAnimation.playTogether(arrayList3);
                animatingTextView.currentAnimation.addListener(new AnonymousClass2(animatingTextView, 2));
                animatingTextView.currentAnimation.start();
            } else {
                for (int i2 = 0; i2 < 4; i2++) {
                    ((TextView) arrayList2.get(i2)).setAlpha(0.0f);
                    ((TextView) arrayList.get(i2)).setAlpha(0.0f);
                }
            }
            PasscodeView.access$400(PasscodeView.this);
        }

        public final void appendCharacter(String str) {
            int i = 0;
            StringBuilder sb = this.stringBuilder;
            if (sb.length() == 4) {
                return;
            }
            try {
                performHapticFeedback(3);
            } catch (Exception e) {
                FileLog.e(e);
            }
            ArrayList arrayList = new ArrayList();
            int length = sb.length();
            sb.append(str);
            ArrayList arrayList2 = this.characterTextViews;
            TextView textView = (TextView) arrayList2.get(length);
            textView.setText(str);
            textView.setTranslationX(getXForTextView(length));
            float f = 0.0f;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f, 1.0f));
            float[] fArr = {AndroidUtilities.dp(20.0f), 0.0f};
            Property property4 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr));
            ArrayList arrayList3 = this.dotTextViews;
            TextView textView2 = (TextView) arrayList3.get(length);
            textView2.setTranslationX(getXForTextView(length));
            textView2.setAlpha(0.0f);
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, AndroidUtilities.dp(20.0f), 0.0f));
            for (int i2 = length + 1; i2 < 4; i2++) {
                TextView textView3 = (TextView) arrayList2.get(i2);
                if (textView3.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
                }
                TextView textView4 = (TextView) arrayList3.get(i2);
                if (textView4.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
                }
            }
            zzr zzrVar = this.dotRunnable;
            if (zzrVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zzrVar);
            }
            zzr zzrVar2 = new zzr(this, length, 7);
            this.dotRunnable = zzrVar2;
            AndroidUtilities.runOnUIThread(zzrVar2, 1500L);
            int i3 = 0;
            while (i3 < length) {
                TextView textView5 = (TextView) arrayList2.get(i3);
                float[] fArr2 = {getXForTextView(i3)};
                Property property5 = View.TRANSLATION_X;
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, f));
                TextView textView6 = (TextView) arrayList3.get(i3);
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, getXForTextView(i3)));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property4, 0.0f));
                i3++;
                f = 0.0f;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.setDuration(150L);
            this.currentAnimation.playTogether(arrayList);
            this.currentAnimation.addListener(new AnonymousClass2(this, i));
            this.currentAnimation.start();
            PasscodeView.access$400(PasscodeView.this);
        }

        public final int getXForTextView(int i) {
            return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(i, 30.0f, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * this.stringBuilder.length())) / 2) - AndroidUtilities.dp(10.0f);
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            zzr zzrVar = this.dotRunnable;
            if (zzrVar != null) {
                AndroidUtilities.cancelRunOnUIThread(zzrVar);
                this.dotRunnable = null;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            for (int i5 = 0; i5 < 4; i5++) {
                int length = this.stringBuilder.length();
                ArrayList arrayList = this.dotTextViews;
                ArrayList arrayList2 = this.characterTextViews;
                if (i5 < length) {
                    TextView textView = (TextView) arrayList2.get(i5);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(1.0f);
                    textView.setScaleY(1.0f);
                    textView.setTranslationY(0.0f);
                    textView.setTranslationX(getXForTextView(i5));
                    TextView textView2 = (TextView) arrayList.get(i5);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    textView2.setTranslationY(0.0f);
                    textView2.setTranslationX(getXForTextView(i5));
                } else {
                    ((TextView) arrayList2.get(i5)).setAlpha(0.0f);
                    ((TextView) arrayList.get(i5)).setAlpha(0.0f);
                }
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public final class InnerAnimator {
        public AnimatorSet animatorSet;
        public float startRadius;
    }

    public final class PasscodeButton extends FrameLayout {
        public final ImageView imageView;
        public final TextView textView1;
        public final TextView textView2;

        public PasscodeButton(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.fingerprint);
            addView(imageView, LayoutHelper.createFrame(-1, -1, 119));
            TextView textView = new TextView(context);
            this.textView1 = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextColor(-1);
            textView.setTextSize(1, 26.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.textView2 = textView2;
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 10.0f);
            textView2.setTextColor(Integer.MAX_VALUE);
            textView2.setGravity(17);
            addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }

        public void setImage(int i) {
            ImageView imageView = this.imageView;
            imageView.setVisibility(0);
            this.textView1.setVisibility(8);
            this.textView2.setVisibility(8);
            imageView.setImageResource(i);
        }

        public void setNum(int i) {
            this.imageView.setVisibility(8);
            TextView textView = this.textView1;
            textView.setVisibility(0);
            TextView textView2 = this.textView2;
            textView2.setVisibility(0);
            String str = "";
            textView.setText("" + i);
            if (i != 0) {
                switch (i) {
                    case 2:
                        str = "ABC";
                        break;
                    case 3:
                        str = "DEF";
                        break;
                    case 4:
                        str = "GHI";
                        break;
                    case 5:
                        str = "JKL";
                        break;
                    case 6:
                        str = "MNO";
                        break;
                    case 7:
                        str = "PQRS";
                        break;
                    case 8:
                        str = "TUV";
                        break;
                    case 9:
                        str = "WXYZ";
                        break;
                }
            } else {
                str = "+";
            }
            textView2.setText(str);
        }
    }

    public interface PasscodeViewDelegate {
        void didAcceptedPassword(PasscodeView passcodeView);
    }

    public PasscodeView(Context context) {
        int i;
        int i2;
        super(context);
        this.keyboardHeight = 0;
        this.rect = new Rect();
        this.backgroundSpringQueue = new LinkedList();
        this.backgroundSpringNextQueue = new LinkedList();
        this.innerAnimators = new ArrayList();
        this.shiftDp = -12;
        this.checkRunnable = new BubbleActivity.AnonymousClass1(this, 24);
        this.pinShown = true;
        this.pos = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context);
        this.backgroundFrameLayout = anonymousClass1;
        anonymousClass1.setWillNotDraw(false);
        addView(anonymousClass1, LayoutHelper.createFrame(-1.0f, -1));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.passcode_lock, 58, 58, null);
        rLottieImageView.setAutoRepeat(false);
        addView(rLottieImageView, LayoutHelper.createFrame(58, 58, 51));
        FrameLayout frameLayout = new FrameLayout(context);
        this.passwordFrameLayout = frameLayout;
        anonymousClass1.addView(frameLayout, LayoutHelper.createFrame(-1.0f, -1));
        TextView textView = new TextView(context);
        this.passcodeTextView = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 18.33f);
        textView.setGravity(1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setAlpha(0.0f);
        frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f));
        TextView textView2 = new TextView(context);
        this.retryTextView = textView2;
        textView2.setTextColor(-1);
        textView2.setTextSize(1, 15.0f);
        textView2.setGravity(1);
        textView2.setVisibility(4);
        anonymousClass1.addView(textView2, LayoutHelper.createFrame(-2, -2, 17));
        AnimatingTextView animatingTextView = new AnimatingTextView(context);
        this.passwordEditText2 = animatingTextView;
        frameLayout.addView(animatingTextView, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.passwordEditText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        editTextBoldCursor.setTextColor(-1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setGravity(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setImeOptions(6);
        editTextBoldCursor.setTypeface(Typeface.DEFAULT);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setCursorColor(-1);
        editTextBoldCursor.setCursorSize(AndroidUtilities.dp(32.0f));
        frameLayout.addView(editTextBoldCursor, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        editTextBoldCursor.setOnEditorActionListener(new ChatActivity$$ExternalSyntheticLambda380(this, 8));
        editTextBoldCursor.addTextChangedListener(new ArticleViewer.AnonymousClass16(this, 14));
        editTextBoldCursor.setCustomSelectionActionModeCallback(new RichEditText.AnonymousClass1(2));
        ImageView imageView = new ImageView(context);
        this.checkImage = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        int i3 = R.drawable.bar_selector_lock;
        imageView.setBackgroundResource(i3);
        frameLayout.addView(imageView, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        imageView.setContentDescription(LocaleController.getString(R.string.Done));
        final int i4 = 1;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final PasscodeView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ArrayList arrayList;
                int length;
                int i5;
                int i6;
                boolean z;
                boolean z2;
                PasscodeView passcodeView = this.f$0;
                boolean z3 = false;
                switch (i4) {
                    case 0:
                        if (passcodeView.pinShown) {
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            int i7 = 4;
                            PasscodeView.AnimatingTextView animatingTextView2 = passcodeView.passwordEditText2;
                            switch (iIntValue) {
                                case 0:
                                    animatingTextView2.appendCharacter("0");
                                    z3 = false;
                                    break;
                                case 1:
                                    animatingTextView2.appendCharacter("1");
                                    z3 = false;
                                    break;
                                case 2:
                                    animatingTextView2.appendCharacter("2");
                                    z3 = false;
                                    break;
                                case 3:
                                    animatingTextView2.appendCharacter("3");
                                    z3 = false;
                                    break;
                                case 4:
                                    animatingTextView2.appendCharacter("4");
                                    z3 = false;
                                    break;
                                case 5:
                                    animatingTextView2.appendCharacter("5");
                                    z3 = false;
                                    break;
                                case 6:
                                    animatingTextView2.appendCharacter("6");
                                    z3 = false;
                                    break;
                                case 7:
                                    animatingTextView2.appendCharacter("7");
                                    z3 = false;
                                    break;
                                case 8:
                                    animatingTextView2.appendCharacter("8");
                                    z3 = false;
                                    break;
                                case 9:
                                    animatingTextView2.appendCharacter("9");
                                    z3 = false;
                                    break;
                                case 10:
                                    passcodeView.checkFingerprint();
                                    z3 = false;
                                    break;
                                case 11:
                                    StringBuilder sb = animatingTextView2.stringBuilder;
                                    if (sb.length() != 0) {
                                        try {
                                            animatingTextView2.performHapticFeedback(3);
                                            while (true) {
                                                ArrayList arrayList2 = animatingTextView2.dotTextViews;
                                                ArrayList arrayList3 = animatingTextView2.characterTextViews;
                                                Property property = View.TRANSLATION_X;
                                                if (i5 >= i7) {
                                                    if (length == 0) {
                                                        sb.deleteCharAt(length);
                                                    }
                                                    for (int i8 = 0; i8 < length; i8++) {
                                                        arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList3.get(i8), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i8)));
                                                        arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i8), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i8)));
                                                    }
                                                    zzr zzrVar = animatingTextView2.dotRunnable;
                                                    if (zzrVar != null) {
                                                        AndroidUtilities.cancelRunOnUIThread(zzrVar);
                                                        animatingTextView2.dotRunnable = null;
                                                    }
                                                    AnimatorSet animatorSet = animatingTextView2.currentAnimation;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                    }
                                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                                    animatingTextView2.currentAnimation = animatorSet2;
                                                    animatorSet2.setDuration(150L);
                                                    animatingTextView2.currentAnimation.playTogether(arrayList);
                                                    animatingTextView2.currentAnimation.addListener(new PasscodeView.AnimatingTextView.AnonymousClass2(animatingTextView2, 1));
                                                    animatingTextView2.currentAnimation.start();
                                                    PasscodeView.access$400(PasscodeView.this);
                                                    z3 = true;
                                                } else {
                                                    TextView textView3 = (TextView) arrayList3.get(i5);
                                                    float alpha = textView3.getAlpha();
                                                    Property property2 = View.TRANSLATION_Y;
                                                    Property property3 = View.ALPHA;
                                                    Property property4 = View.SCALE_Y;
                                                    Property property5 = View.SCALE_X;
                                                    if (alpha != 0.0f) {
                                                        i6 = 1;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i5)));
                                                    } else {
                                                        i6 = 1;
                                                    }
                                                    TextView textView4 = (TextView) arrayList2.get(i5);
                                                    if (textView4.getAlpha() != 0.0f) {
                                                        float[] fArr = new float[i6];
                                                        fArr[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property5, fArr));
                                                        float[] fArr2 = new float[i6];
                                                        fArr2[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, fArr2));
                                                        float[] fArr3 = new float[i6];
                                                        fArr3[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, fArr3));
                                                        float[] fArr4 = new float[i6];
                                                        fArr4[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, fArr4));
                                                        float[] fArr5 = new float[i6];
                                                        fArr5[0] = animatingTextView2.getXForTextView(i5);
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, fArr5));
                                                    }
                                                    i5 += i6;
                                                    i7 = 4;
                                                }
                                            }
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        arrayList = new ArrayList();
                                        length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        i5 = length;
                                        break;
                                    }
                                    break;
                                default:
                                    z3 = false;
                                    break;
                            }
                            if (animatingTextView2.stringBuilder.length() == 4) {
                                passcodeView.processDone(false);
                            }
                            if (iIntValue != 11) {
                                Drawable drawable = passcodeView.backgroundDrawable;
                                if (drawable instanceof MotionBackgroundDrawable) {
                                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                                    motionBackgroundDrawable.animationProgressProvider = null;
                                    motionBackgroundDrawable.updateAnimation();
                                    float f = motionBackgroundDrawable.posAnimationProgress;
                                    if (iIntValue == 10) {
                                        if (z3) {
                                            motionBackgroundDrawable.switchToPrevPosition();
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        z2 = false;
                                    } else {
                                        motionBackgroundDrawable.switchToNextPosition(true);
                                        z = true;
                                        z2 = true;
                                    }
                                    if (z) {
                                        if (f >= 1.0f) {
                                            passcodeView.animateBackground(motionBackgroundDrawable);
                                        } else {
                                            LinkedList linkedList = passcodeView.backgroundSpringQueue;
                                            linkedList.offer(new PhotoViewer$$ExternalSyntheticLambda89(passcodeView, z2, motionBackgroundDrawable, 16));
                                            LinkedList linkedList2 = passcodeView.backgroundSpringNextQueue;
                                            linkedList2.offer(Boolean.valueOf(z2));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i9 = 0; i9 < linkedList.size(); i9++) {
                                                Runnable runnable = (Runnable) linkedList.get(i9);
                                                Boolean bool = (Boolean) linkedList2.get(i9);
                                                if (bool != null && bool.booleanValue() != z2) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i9));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i10 = 0;
                                            while (i10 < size) {
                                                Object obj = arrayList4.get(i10);
                                                i10++;
                                                linkedList.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new ChatActivity$$ExternalSyntheticLambda18(15));
                                            int size2 = arrayList5.size();
                                            int i11 = 0;
                                            while (i11 < size2) {
                                                Object obj2 = arrayList5.get(i11);
                                                i11++;
                                                linkedList2.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    case 1:
                        passcodeView.processDone(false);
                        break;
                    default:
                        passcodeView.checkFingerprint();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.fingerprintImage = imageView2;
        imageView2.setImageResource(R.drawable.fingerprint);
        imageView2.setScaleType(scaleType);
        imageView2.setBackgroundResource(i3);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        imageView2.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i5 = 2;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final PasscodeView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                ArrayList arrayList;
                int length;
                int i6;
                int i7;
                boolean z;
                boolean z2;
                PasscodeView passcodeView = this.f$0;
                boolean z3 = false;
                switch (i5) {
                    case 0:
                        if (passcodeView.pinShown) {
                            int iIntValue = ((Integer) view.getTag()).intValue();
                            int i8 = 4;
                            PasscodeView.AnimatingTextView animatingTextView2 = passcodeView.passwordEditText2;
                            switch (iIntValue) {
                                case 0:
                                    animatingTextView2.appendCharacter("0");
                                    z3 = false;
                                    break;
                                case 1:
                                    animatingTextView2.appendCharacter("1");
                                    z3 = false;
                                    break;
                                case 2:
                                    animatingTextView2.appendCharacter("2");
                                    z3 = false;
                                    break;
                                case 3:
                                    animatingTextView2.appendCharacter("3");
                                    z3 = false;
                                    break;
                                case 4:
                                    animatingTextView2.appendCharacter("4");
                                    z3 = false;
                                    break;
                                case 5:
                                    animatingTextView2.appendCharacter("5");
                                    z3 = false;
                                    break;
                                case 6:
                                    animatingTextView2.appendCharacter("6");
                                    z3 = false;
                                    break;
                                case 7:
                                    animatingTextView2.appendCharacter("7");
                                    z3 = false;
                                    break;
                                case 8:
                                    animatingTextView2.appendCharacter("8");
                                    z3 = false;
                                    break;
                                case 9:
                                    animatingTextView2.appendCharacter("9");
                                    z3 = false;
                                    break;
                                case 10:
                                    passcodeView.checkFingerprint();
                                    z3 = false;
                                    break;
                                case 11:
                                    StringBuilder sb = animatingTextView2.stringBuilder;
                                    if (sb.length() != 0) {
                                        try {
                                            animatingTextView2.performHapticFeedback(3);
                                            while (true) {
                                                ArrayList arrayList2 = animatingTextView2.dotTextViews;
                                                ArrayList arrayList3 = animatingTextView2.characterTextViews;
                                                Property property = View.TRANSLATION_X;
                                                if (i6 >= i8) {
                                                    if (length == 0) {
                                                        sb.deleteCharAt(length);
                                                    }
                                                    for (int i9 = 0; i9 < length; i9++) {
                                                        arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList3.get(i9), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i9)));
                                                        arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i9), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i9)));
                                                    }
                                                    zzr zzrVar = animatingTextView2.dotRunnable;
                                                    if (zzrVar != null) {
                                                        AndroidUtilities.cancelRunOnUIThread(zzrVar);
                                                        animatingTextView2.dotRunnable = null;
                                                    }
                                                    AnimatorSet animatorSet = animatingTextView2.currentAnimation;
                                                    if (animatorSet != null) {
                                                        animatorSet.cancel();
                                                    }
                                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                                    animatingTextView2.currentAnimation = animatorSet2;
                                                    animatorSet2.setDuration(150L);
                                                    animatingTextView2.currentAnimation.playTogether(arrayList);
                                                    animatingTextView2.currentAnimation.addListener(new PasscodeView.AnimatingTextView.AnonymousClass2(animatingTextView2, 1));
                                                    animatingTextView2.currentAnimation.start();
                                                    PasscodeView.access$400(PasscodeView.this);
                                                    z3 = true;
                                                } else {
                                                    TextView textView3 = (TextView) arrayList3.get(i6);
                                                    float alpha = textView3.getAlpha();
                                                    Property property2 = View.TRANSLATION_Y;
                                                    Property property3 = View.ALPHA;
                                                    Property property4 = View.SCALE_Y;
                                                    Property property5 = View.SCALE_X;
                                                    if (alpha != 0.0f) {
                                                        i7 = 1;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property5, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property4, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                                                        arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i6)));
                                                    } else {
                                                        i7 = 1;
                                                    }
                                                    TextView textView4 = (TextView) arrayList2.get(i6);
                                                    if (textView4.getAlpha() != 0.0f) {
                                                        float[] fArr = new float[i7];
                                                        fArr[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property5, fArr));
                                                        float[] fArr2 = new float[i7];
                                                        fArr2[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, fArr2));
                                                        float[] fArr3 = new float[i7];
                                                        fArr3[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, fArr3));
                                                        float[] fArr4 = new float[i7];
                                                        fArr4[0] = 0.0f;
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, fArr4));
                                                        float[] fArr5 = new float[i7];
                                                        fArr5[0] = animatingTextView2.getXForTextView(i6);
                                                        arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, fArr5));
                                                    }
                                                    i6 += i7;
                                                    i8 = 4;
                                                }
                                            }
                                        } catch (Exception e) {
                                            FileLog.e(e);
                                        }
                                        arrayList = new ArrayList();
                                        length = sb.length() - 1;
                                        if (length != 0) {
                                            sb.deleteCharAt(length);
                                        }
                                        i6 = length;
                                        break;
                                    }
                                    break;
                                default:
                                    z3 = false;
                                    break;
                            }
                            if (animatingTextView2.stringBuilder.length() == 4) {
                                passcodeView.processDone(false);
                            }
                            if (iIntValue != 11) {
                                Drawable drawable = passcodeView.backgroundDrawable;
                                if (drawable instanceof MotionBackgroundDrawable) {
                                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                                    motionBackgroundDrawable.animationProgressProvider = null;
                                    motionBackgroundDrawable.updateAnimation();
                                    float f = motionBackgroundDrawable.posAnimationProgress;
                                    if (iIntValue == 10) {
                                        if (z3) {
                                            motionBackgroundDrawable.switchToPrevPosition();
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        z2 = false;
                                    } else {
                                        motionBackgroundDrawable.switchToNextPosition(true);
                                        z = true;
                                        z2 = true;
                                    }
                                    if (z) {
                                        if (f >= 1.0f) {
                                            passcodeView.animateBackground(motionBackgroundDrawable);
                                        } else {
                                            LinkedList linkedList = passcodeView.backgroundSpringQueue;
                                            linkedList.offer(new PhotoViewer$$ExternalSyntheticLambda89(passcodeView, z2, motionBackgroundDrawable, 16));
                                            LinkedList linkedList2 = passcodeView.backgroundSpringNextQueue;
                                            linkedList2.offer(Boolean.valueOf(z2));
                                            ArrayList arrayList4 = new ArrayList();
                                            ArrayList arrayList5 = new ArrayList();
                                            for (int i10 = 0; i10 < linkedList.size(); i10++) {
                                                Runnable runnable = (Runnable) linkedList.get(i10);
                                                Boolean bool = (Boolean) linkedList2.get(i10);
                                                if (bool != null && bool.booleanValue() != z2) {
                                                    arrayList4.add(runnable);
                                                    arrayList5.add(Integer.valueOf(i10));
                                                }
                                            }
                                            int size = arrayList4.size();
                                            int i11 = 0;
                                            while (i11 < size) {
                                                Object obj = arrayList4.get(i11);
                                                i11++;
                                                linkedList.remove((Runnable) obj);
                                            }
                                            Collections.sort(arrayList5, new ChatActivity$$ExternalSyntheticLambda18(15));
                                            int size2 = arrayList5.size();
                                            int i12 = 0;
                                            while (i12 < size2) {
                                                Object obj2 = arrayList5.get(i12);
                                                i12++;
                                                linkedList2.remove(((Integer) obj2).intValue());
                                            }
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        break;
                    case 1:
                        passcodeView.processDone(false);
                        break;
                    default:
                        passcodeView.checkFingerprint();
                        break;
                }
            }
        });
        View view = new View(context);
        this.border = view;
        view.setBackgroundColor(822083583);
        frameLayout.addView(view, new FrameLayout.LayoutParams(LayoutHelper.getSize(-1.0f), LayoutHelper.getSize(1.0f / AndroidUtilities.density), 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.numbersContainer = frameLayout2;
        anonymousClass1.addView(frameLayout2, LayoutHelper.createFrame(-1, -1, 51));
        PhotoViewer.AnonymousClass19 anonymousClass19 = new PhotoViewer.AnonymousClass19(context, 15);
        this.numbersFrameLayout = anonymousClass19;
        frameLayout2.addView(anonymousClass19, LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.numbersTitleContainer = frameLayout3;
        anonymousClass19.addView(frameLayout3, LayoutHelper.createFrame(-2, -2, 49));
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 15.0f);
        textViewM.setTypeface(AndroidUtilities.bold());
        textViewM.setTextColor(-1);
        textViewM.setText(LocaleController.getString(R.string.UnlockToUse));
        frameLayout3.addView(textViewM, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.subtitleView = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        frameLayout3.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.numberFrameLayouts = new ArrayList(10);
        int i6 = 0;
        while (true) {
            if (i6 >= 12) {
                break;
            }
            PasscodeButton passcodeButton = new PasscodeButton(context);
            ScaleStateListAnimator.apply(passcodeButton, 0.15f, 1.5f);
            passcodeButton.setTag(Integer.valueOf(i6));
            int[] iArr = ids;
            if (i6 == 11) {
                int iDp = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, 654311423, 654311423));
                passcodeButton.setImage(R.drawable.filled_clear);
                passcodeButton.setOnLongClickListener(new PhotoViewer$$ExternalSyntheticLambda44(this, 8));
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                int i7 = R.id.passcode_btn_0;
                passcodeButton.setNextFocusForwardId(i7);
                if (Build.VERSION.SDK_INT >= 22) {
                    passcodeButton.setAccessibilityTraversalBefore(i7);
                }
            } else if (i6 == 10) {
                this.fingerprintView = passcodeButton;
                int iDp2 = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, 654311423, 654311423));
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                passcodeButton.setImage(R.drawable.fingerprint);
                int i8 = R.id.passcode_btn_1;
                passcodeButton.setNextFocusForwardId(i8);
                if (Build.VERSION.SDK_INT >= 22) {
                    passcodeButton.setAccessibilityTraversalBefore(i8);
                }
            } else {
                int iDp3 = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 654311423, 1291845631, 1291845631));
                passcodeButton.setContentDescription(i6 + "");
                passcodeButton.setNum(i6);
                if (i6 == 0) {
                    int i9 = R.id.passcode_btn_backspace;
                    passcodeButton.setNextFocusForwardId(i9);
                    if (Build.VERSION.SDK_INT >= 22) {
                        passcodeButton.setAccessibilityTraversalBefore(i9);
                    }
                } else if (i6 == 9) {
                    Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 < 23 || activityFindActivity == null || !SharedConfig.useFingerprintLock) {
                        i2 = R.id.passcode_btn_0;
                        passcodeButton.setNextFocusForwardId(i2);
                        if (Build.VERSION.SDK_INT >= 22) {
                            passcodeButton.setAccessibilityTraversalBefore(i2);
                        }
                    } else {
                        try {
                            Context context2 = ApplicationLoader.applicationContext;
                            FingerprintManagerCompat.FingerprintManagerCompatImpl fingerprintManagerCompatImpl = FingerprintManagerCompat.IMPL;
                            if (fingerprintManagerCompatImpl.isHardwareDetected(context2) && fingerprintManagerCompatImpl.hasEnrolledFingerprints(context2) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                                int i11 = R.id.passcode_btn_fingerprint;
                                passcodeButton.setNextFocusForwardId(i11);
                                if (i10 >= 22) {
                                    passcodeButton.setAccessibilityTraversalBefore(i11);
                                }
                            } else {
                                i2 = R.id.passcode_btn_0;
                                passcodeButton.setNextFocusForwardId(i2);
                                if (Build.VERSION.SDK_INT >= 22) {
                                    passcodeButton.setAccessibilityTraversalBefore(i2);
                                }
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }
                } else {
                    int i12 = iArr[i6 + 1];
                    passcodeButton.setNextFocusForwardId(i12);
                    if (Build.VERSION.SDK_INT >= 22) {
                        passcodeButton.setAccessibilityTraversalBefore(i12);
                    }
                }
            }
            passcodeButton.setId(iArr[i6]);
            final int i13 = 0;
            passcodeButton.setOnClickListener(new View.OnClickListener(this) {
                public final PasscodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    ArrayList arrayList;
                    int length;
                    int i14;
                    int i15;
                    boolean z;
                    boolean z2;
                    PasscodeView passcodeView = this.f$0;
                    boolean z3 = false;
                    switch (i13) {
                        case 0:
                            if (passcodeView.pinShown) {
                                int iIntValue = ((Integer) view2.getTag()).intValue();
                                int i16 = 4;
                                PasscodeView.AnimatingTextView animatingTextView2 = passcodeView.passwordEditText2;
                                switch (iIntValue) {
                                    case 0:
                                        animatingTextView2.appendCharacter("0");
                                        z3 = false;
                                        break;
                                    case 1:
                                        animatingTextView2.appendCharacter("1");
                                        z3 = false;
                                        break;
                                    case 2:
                                        animatingTextView2.appendCharacter("2");
                                        z3 = false;
                                        break;
                                    case 3:
                                        animatingTextView2.appendCharacter("3");
                                        z3 = false;
                                        break;
                                    case 4:
                                        animatingTextView2.appendCharacter("4");
                                        z3 = false;
                                        break;
                                    case 5:
                                        animatingTextView2.appendCharacter("5");
                                        z3 = false;
                                        break;
                                    case 6:
                                        animatingTextView2.appendCharacter("6");
                                        z3 = false;
                                        break;
                                    case 7:
                                        animatingTextView2.appendCharacter("7");
                                        z3 = false;
                                        break;
                                    case 8:
                                        animatingTextView2.appendCharacter("8");
                                        z3 = false;
                                        break;
                                    case 9:
                                        animatingTextView2.appendCharacter("9");
                                        z3 = false;
                                        break;
                                    case 10:
                                        passcodeView.checkFingerprint();
                                        z3 = false;
                                        break;
                                    case 11:
                                        StringBuilder sb = animatingTextView2.stringBuilder;
                                        if (sb.length() != 0) {
                                            try {
                                                animatingTextView2.performHapticFeedback(3);
                                                while (true) {
                                                    ArrayList arrayList2 = animatingTextView2.dotTextViews;
                                                    ArrayList arrayList3 = animatingTextView2.characterTextViews;
                                                    Property property = View.TRANSLATION_X;
                                                    if (i14 >= i16) {
                                                        if (length == 0) {
                                                            sb.deleteCharAt(length);
                                                        }
                                                        for (int i17 = 0; i17 < length; i17++) {
                                                            arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList3.get(i17), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i17)));
                                                            arrayList.add(ObjectAnimator.ofFloat((TextView) arrayList2.get(i17), (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i17)));
                                                        }
                                                        zzr zzrVar = animatingTextView2.dotRunnable;
                                                        if (zzrVar != null) {
                                                            AndroidUtilities.cancelRunOnUIThread(zzrVar);
                                                            animatingTextView2.dotRunnable = null;
                                                        }
                                                        AnimatorSet animatorSet = animatingTextView2.currentAnimation;
                                                        if (animatorSet != null) {
                                                            animatorSet.cancel();
                                                        }
                                                        AnimatorSet animatorSet2 = new AnimatorSet();
                                                        animatingTextView2.currentAnimation = animatorSet2;
                                                        animatorSet2.setDuration(150L);
                                                        animatingTextView2.currentAnimation.playTogether(arrayList);
                                                        animatingTextView2.currentAnimation.addListener(new PasscodeView.AnimatingTextView.AnonymousClass2(animatingTextView2, 1));
                                                        animatingTextView2.currentAnimation.start();
                                                        PasscodeView.access$400(PasscodeView.this);
                                                        z3 = true;
                                                    } else {
                                                        TextView textView4 = (TextView) arrayList3.get(i14);
                                                        float alpha = textView4.getAlpha();
                                                        Property property2 = View.TRANSLATION_Y;
                                                        Property property3 = View.ALPHA;
                                                        Property property4 = View.SCALE_Y;
                                                        Property property5 = View.SCALE_X;
                                                        if (alpha != 0.0f) {
                                                            i15 = 1;
                                                            arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property5, 0.0f));
                                                            arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property4, 0.0f));
                                                            arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
                                                            arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                                                            arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, animatingTextView2.getXForTextView(i14)));
                                                        } else {
                                                            i15 = 1;
                                                        }
                                                        TextView textView5 = (TextView) arrayList2.get(i14);
                                                        if (textView5.getAlpha() != 0.0f) {
                                                            float[] fArr = new float[i15];
                                                            fArr[0] = 0.0f;
                                                            arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, fArr));
                                                            float[] fArr2 = new float[i15];
                                                            fArr2[0] = 0.0f;
                                                            arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, fArr2));
                                                            float[] fArr3 = new float[i15];
                                                            fArr3[0] = 0.0f;
                                                            arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, fArr3));
                                                            float[] fArr4 = new float[i15];
                                                            fArr4[0] = 0.0f;
                                                            arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, fArr4));
                                                            float[] fArr5 = new float[i15];
                                                            fArr5[0] = animatingTextView2.getXForTextView(i14);
                                                            arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, fArr5));
                                                        }
                                                        i14 += i15;
                                                        i16 = 4;
                                                    }
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                            }
                                            arrayList = new ArrayList();
                                            length = sb.length() - 1;
                                            if (length != 0) {
                                                sb.deleteCharAt(length);
                                            }
                                            i14 = length;
                                            break;
                                        }
                                        break;
                                    default:
                                        z3 = false;
                                        break;
                                }
                                if (animatingTextView2.stringBuilder.length() == 4) {
                                    passcodeView.processDone(false);
                                }
                                if (iIntValue != 11) {
                                    Drawable drawable = passcodeView.backgroundDrawable;
                                    if (drawable instanceof MotionBackgroundDrawable) {
                                        MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                                        motionBackgroundDrawable.animationProgressProvider = null;
                                        motionBackgroundDrawable.updateAnimation();
                                        float f = motionBackgroundDrawable.posAnimationProgress;
                                        if (iIntValue == 10) {
                                            if (z3) {
                                                motionBackgroundDrawable.switchToPrevPosition();
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            z2 = false;
                                        } else {
                                            motionBackgroundDrawable.switchToNextPosition(true);
                                            z = true;
                                            z2 = true;
                                        }
                                        if (z) {
                                            if (f >= 1.0f) {
                                                passcodeView.animateBackground(motionBackgroundDrawable);
                                            } else {
                                                LinkedList linkedList = passcodeView.backgroundSpringQueue;
                                                linkedList.offer(new PhotoViewer$$ExternalSyntheticLambda89(passcodeView, z2, motionBackgroundDrawable, 16));
                                                LinkedList linkedList2 = passcodeView.backgroundSpringNextQueue;
                                                linkedList2.offer(Boolean.valueOf(z2));
                                                ArrayList arrayList4 = new ArrayList();
                                                ArrayList arrayList5 = new ArrayList();
                                                for (int i18 = 0; i18 < linkedList.size(); i18++) {
                                                    Runnable runnable = (Runnable) linkedList.get(i18);
                                                    Boolean bool = (Boolean) linkedList2.get(i18);
                                                    if (bool != null && bool.booleanValue() != z2) {
                                                        arrayList4.add(runnable);
                                                        arrayList5.add(Integer.valueOf(i18));
                                                    }
                                                }
                                                int size = arrayList4.size();
                                                int i19 = 0;
                                                while (i19 < size) {
                                                    Object obj = arrayList4.get(i19);
                                                    i19++;
                                                    linkedList.remove((Runnable) obj);
                                                }
                                                Collections.sort(arrayList5, new ChatActivity$$ExternalSyntheticLambda18(15));
                                                int size2 = arrayList5.size();
                                                int i110 = 0;
                                                while (i110 < size2) {
                                                    Object obj2 = arrayList5.get(i110);
                                                    i110++;
                                                    linkedList2.remove(((Integer) obj2).intValue());
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            }
                            break;
                        case 1:
                            passcodeView.processDone(false);
                            break;
                        default:
                            passcodeView.checkFingerprint();
                            break;
                    }
                }
            });
            this.numberFrameLayouts.add(passcodeButton);
            i6++;
        }
        for (i = 11; i >= 0; i--) {
            this.numbersFrameLayout.addView((FrameLayout) this.numberFrameLayouts.get(i), LayoutHelper.createFrame(60, 60, 51));
        }
        checkFingerprintButton();
    }

    public static void access$400(PasscodeView passcodeView) {
        AnimatingTextView animatingTextView = passcodeView.passwordEditText2;
        boolean z = animatingTextView == null || animatingTextView.stringBuilder.length() > 0;
        FrameLayout frameLayout = passcodeView.numbersTitleContainer;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            OKLCH.m(frameLayout.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        }
    }

    public final void animateBackground(MotionBackgroundDrawable motionBackgroundDrawable) {
        SpringAnimation springAnimation = this.backgroundAnimationSpring;
        if (springAnimation != null && springAnimation.mRunning) {
            springAnimation.cancel();
        }
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        motionBackgroundDrawable.animationProgressProvider = new ProfileGooeyView$$ExternalSyntheticLambda0(floatValueHolder, 11);
        motionBackgroundDrawable.updateAnimation();
        SpringAnimation springAnimation2 = new SpringAnimation(floatValueHolder);
        zzlt.m(100.0f, 300.0f, 1.0f, springAnimation2);
        this.backgroundAnimationSpring = springAnimation2;
        springAnimation2.addEndListener(new PasscodeView$$ExternalSyntheticLambda15(0, this, motionBackgroundDrawable));
        this.backgroundAnimationSpring.addUpdateListener(new LoginActivity$$ExternalSyntheticLambda12(motionBackgroundDrawable, 8));
        this.backgroundAnimationSpring.start();
    }

    public final void checkFingerprint() {
        Activity activityFindActivity;
        PasscodeViewDialog passcodeViewDialog;
        if (Build.VERSION.SDK_INT >= 23 && (activityFindActivity = AndroidUtilities.findActivity(getContext())) != null && this.fingerprintView.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (activityFindActivity instanceof LaunchActivity) {
                LaunchActivity launchActivity = (LaunchActivity) activityFindActivity;
                if (!launchActivity.overlayPasscodeViews.isEmpty() || (passcodeViewDialog = launchActivity.passcodeDialog) == null) {
                    if (zziq.m(1, launchActivity.overlayPasscodeViews) != this) {
                        return;
                    }
                } else if (this != passcodeViewDialog.passcodeView) {
                    return;
                }
            }
            try {
                if (new AtomicFile(new BiometricManager$DefaultInjector(getContext(), 0)).canAuthenticate(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    zzbe zzbeVar = new zzbe(LaunchActivity.instance, ContextCompat.getMainExecutor(getContext()), new BiometricPrompt$AuthenticationCallback() {
                        @Override
                        public final void onAuthenticationError(int i, CharSequence charSequence) {
                            FileLog.d("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                            PasscodeView.this.showPin(true);
                        }

                        @Override
                        public final void onAuthenticationFailed() {
                            FileLog.d("PasscodeView onAuthenticationFailed");
                            PasscodeView.this.showPin(true);
                        }

                        @Override
                        public final void onAuthenticationSucceeded(BiometricPrompt$AuthenticationResult biometricPrompt$AuthenticationResult) {
                            FileLog.d("PasscodeView onAuthenticationSucceeded");
                            PasscodeView.this.processDone(true);
                        }
                    });
                    zzbo zzboVar = new zzbo();
                    zzboVar.zzd = LocaleController.getString(R.string.UnlockToUse);
                    zzboVar.zzb = LocaleController.getString(R.string.UsePIN);
                    zzboVar.zzc = 15;
                    zzbeVar.authenticateInternal(zzboVar.build(), null);
                    showPin(false);
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public final void checkFingerprintButton() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        boolean z = false;
        if (Build.VERSION.SDK_INT < 23 || activityFindActivity == null || !SharedConfig.useFingerprintLock) {
            this.fingerprintView.setVisibility(8);
        } else {
            try {
                Context context = ApplicationLoader.applicationContext;
                FingerprintManagerCompat.FingerprintManagerCompatImpl fingerprintManagerCompatImpl = FingerprintManagerCompat.IMPL;
                if (fingerprintManagerCompatImpl.isHardwareDetected(context) && fingerprintManagerCompatImpl.hasEnrolledFingerprints(context) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    try {
                        this.fingerprintView.setVisibility(0);
                        z = true;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        FileLog.e(th);
                        this.fingerprintView.setVisibility(8);
                    }
                } else {
                    this.fingerprintView.setVisibility(8);
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
        if (SharedConfig.passcodeType == 1) {
            this.fingerprintImage.setVisibility(this.fingerprintView.getVisibility());
        }
        this.subtitleView.setText(LocaleController.getString(z ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
    }

    public final void checkRetryTextView() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime > SharedConfig.lastUptimeMillis) {
            long j = SharedConfig.passcodeRetryInMs - (jElapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j;
            if (j < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = jElapsedRealtime;
        SharedConfig.saveConfig();
        long j2 = SharedConfig.passcodeRetryInMs;
        EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
        FrameLayout frameLayout = this.passwordFrameLayout;
        BubbleActivity.AnonymousClass1 anonymousClass1 = this.checkRunnable;
        TextView textView = this.retryTextView;
        if (j2 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
            if (textView.getVisibility() == 0) {
                textView.setVisibility(4);
                frameLayout.setVisibility(0);
                showPin(true);
                if (SharedConfig.passcodeType == 1) {
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    return;
                }
                return;
            }
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(j2 / 1000.0d));
        if (iMax != this.lastValue) {
            textView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", iMax, new Object[0])));
            this.lastValue = iMax;
        }
        if (textView.getVisibility() != 0) {
            textView.setVisibility(0);
            frameLayout.setVisibility(4);
            showPin(false);
            AndroidUtilities.hideKeyboard(editTextBoldCursor);
        }
        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
        AndroidUtilities.runOnUIThread(anonymousClass1, 100L);
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != NotificationCenter.didGenerateFingerprintKeyPair) {
            if (i != NotificationCenter.passcodeDismissed || objArr[0] == this) {
                return;
            }
            setVisibility(8);
            return;
        }
        checkFingerprintButton();
        if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
            checkFingerprint();
        }
    }

    public void onAnimationUpdate(float f) {
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.keyboardNotifier == null && (getParent() instanceof View)) {
            this.keyboardNotifier = new KeyboardNotifier((View) getParent(), false, new DialogCell$$ExternalSyntheticLambda6(this, 24));
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    public void onHidden() {
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        Rect rect = this.rect;
        getWindowVisibleDisplayFrame(rect);
        this.keyboardHeight = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            FrameLayout frameLayout = this.passwordFrameLayout;
            int iIntValue = frameLayout.getTag() != null ? ((Integer) frameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams.topMargin = ((iIntValue + layoutParams.height) - (this.keyboardHeight / 2)) - AndroidUtilities.statusBarHeight;
            frameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.passcodeTextView;
        int[] iArr = this.pos;
        textView.getLocationInWindow(iArr);
        boolean zIsTablet = AndroidUtilities.isTablet();
        RLottieImageView rLottieImageView = this.imageView;
        if (zIsTablet || getContext().getResources().getConfiguration().orientation != 2) {
            int iDp = iArr[1] - AndroidUtilities.dp(100.0f);
            this.imageY = iDp;
            rLottieImageView.setTranslationY(iDp);
        } else {
            int iDp2 = iArr[1] - AndroidUtilities.dp(100.0f);
            this.imageY = iDp2;
            rLottieImageView.setTranslationY(iDp2);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iM$2;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.displaySize.y;
        int iDp2 = AndroidUtilities.dp(28.0f);
        int iDp3 = AndroidUtilities.dp(16.0f);
        int iDp4 = AndroidUtilities.dp(60.0f);
        boolean z = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.border;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        RLottieImageView rLottieImageView = this.imageView;
        PhotoViewer.AnonymousClass19 anonymousClass19 = this.numbersFrameLayout;
        FrameLayout frameLayout = this.numbersContainer;
        FrameLayout frameLayout2 = this.passwordFrameLayout;
        if (z) {
            if (SharedConfig.passcodeType == 0) {
                f = 2.0f;
                f2 = size / 2.0f;
            } else {
                f = 2.0f;
                f2 = size;
            }
            rLottieImageView.setTranslationX((f2 / f) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = OKLCH.m$2(140.0f, iDp, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            frameLayout2.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams2.height = iDp;
            int i3 = size / 2;
            layoutParams2.leftMargin = i3;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i3;
            frameLayout.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass19.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            layoutParams3.gravity = 17;
            anonymousClass19.setLayoutParams(layoutParams3);
        } else {
            rLottieImageView.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int iM$3 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    iM$2 = OKLCH.m$2(498.0f, size, 2);
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    iM$2 = 0;
                }
                if (iDp > AndroidUtilities.dp(528.0f)) {
                    iM$3 = OKLCH.m$2(528.0f, iDp, 2);
                    iDp = AndroidUtilities.dp(528.0f);
                }
            } else {
                iM$2 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) frameLayout2.getLayoutParams();
            layoutParams4.height = (iDp / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = iM$3;
            layoutParams4.leftMargin = iM$2;
            frameLayout2.setTag(Integer.valueOf(iM$3));
            frameLayout2.setLayoutParams(layoutParams4);
            int i4 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) anonymousClass19.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            anonymousClass19.setLayoutParams(layoutParams5);
            int i5 = iDp - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.leftMargin = iM$2;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (iDp - i5) / 2;
            } else {
                layoutParams6.topMargin = i4;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            frameLayout.setLayoutParams(layoutParams6);
        }
        int iDp5 = AndroidUtilities.dp(z ? 52.0f : 82.0f);
        int i6 = 0;
        while (i6 < 12) {
            int i7 = 10;
            if (i6 != 0) {
                if (i6 == 10) {
                    i7 = 11;
                } else {
                    i7 = i6 == 11 ? 9 : i6 - 1;
                }
            }
            FrameLayout frameLayout3 = (FrameLayout) this.numberFrameLayouts.get(i6);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout3.getLayoutParams();
            layoutParams7.topMargin = ((iDp4 + iDp3) * (i7 / 3)) + iDp5;
            layoutParams7.leftMargin = (iDp4 + iDp2) * (i7 % 3);
            frameLayout3.setLayoutParams(layoutParams7);
            i6++;
        }
        super.onMeasure(i, i2);
    }

    public final void onResume() {
        checkRetryTextView();
        if (this.retryTextView.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                }
                AndroidUtilities.runOnUIThread(new PasscodeView$$ExternalSyntheticLambda1(this, 0), 200L);
            }
            checkFingerprint();
        }
    }

    public final void onShow(boolean z, int i, int i2, LinkManager$$ExternalSyntheticLambda2 linkManager$$ExternalSyntheticLambda2) {
        View currentFocus;
        boolean z2;
        int i3;
        int i4;
        checkFingerprintButton();
        checkRetryTextView();
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        int i5 = SharedConfig.passcodeType;
        TextView textView = this.retryTextView;
        EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
        if (i5 == 1) {
            if (!z && textView.getVisibility() != 0 && editTextBoldCursor != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(editTextBoldCursor);
            }
        } else if (activityFindActivity != null && (currentFocus = activityFindActivity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            AndroidUtilities.hideKeyboard(activityFindActivity.getCurrentFocus());
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        BackgroundGradientDrawable backgroundGradientDrawable = null;
        this.backgroundDrawable = null;
        boolean z3 = Theme.getCachedWallpaper() instanceof MotionBackgroundDrawable;
        AnonymousClass1 anonymousClass1 = this.backgroundFrameLayout;
        if (z3) {
            z2 = !Theme.currentTheme.isDark();
            this.backgroundDrawable = Theme.getCachedWallpaper();
            anonymousClass1.paint.setColor(-1090519040);
        } else {
            if (Theme.isCustomTheme && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(Theme.getSelectedBackgroundSlug()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(Theme.getSelectedBackgroundSlug())) {
                Theme.OverrideWallpaperInfo overrideWallpaperInfo = Theme.currentTheme.overrideWallpaper;
                if (overrideWallpaperInfo != null && (i3 = overrideWallpaperInfo.color) != 0 && (i4 = overrideWallpaperInfo.gradientColor1) != 0) {
                    backgroundGradientDrawable = new BackgroundGradientDrawable(BackgroundGradientDrawable.getGradientOrientation(overrideWallpaperInfo.rotation), new int[]{i3, i4});
                }
                this.backgroundDrawable = backgroundGradientDrawable;
                if (backgroundGradientDrawable == null) {
                    this.backgroundDrawable = Theme.getCachedWallpaper();
                }
                if (this.backgroundDrawable instanceof BackgroundGradientDrawable) {
                    anonymousClass1.paint.setColor(570425344);
                } else {
                    anonymousClass1.paint.setColor(-1090519040);
                }
            } else if ("d".equals(Theme.getSelectedBackgroundSlug())) {
                anonymousClass1.paint.setColor(-11436898);
            } else {
                String selectedBackgroundSlug = Theme.getSelectedBackgroundSlug();
                if (Theme.isPatternWallpaper || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(selectedBackgroundSlug) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(selectedBackgroundSlug)) {
                    anonymousClass1.paint.setColor(-11436898);
                } else {
                    Drawable cachedWallpaper = Theme.getCachedWallpaper();
                    this.backgroundDrawable = cachedWallpaper;
                    if (cachedWallpaper instanceof BackgroundGradientDrawable) {
                        anonymousClass1.paint.setColor(570425344);
                    } else if (cachedWallpaper != null) {
                        anonymousClass1.paint.setColor(-1090519040);
                    } else {
                        anonymousClass1.paint.setColor(-11436898);
                    }
                }
            }
            z2 = false;
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            int[] iArr = motionBackgroundDrawable.colors;
            if (z2) {
                int[] iArr2 = new int[iArr.length];
                for (int i6 = 0; i6 < iArr.length; i6++) {
                    iArr2[i6] = Theme.adaptHSV(0.14f, 0.0f, iArr[i6]);
                }
                iArr = iArr2;
            }
            this.backgroundDrawable = new MotionBackgroundDrawable(iArr[0], iArr[1], iArr[2], iArr[3], false, 0, false);
            if (motionBackgroundDrawable.patternBitmap == null || motionBackgroundDrawable.intensity >= 0) {
                anonymousClass1.paint.setColor(570425344);
            } else {
                anonymousClass1.paint.setColor(2130706432);
            }
            ((MotionBackgroundDrawable) this.backgroundDrawable).setParentView(anonymousClass1);
        }
        this.passcodeTextView.setText(LocaleController.getString(R.string.AppLocked));
        int i7 = SharedConfig.passcodeType;
        ImageView imageView = this.fingerprintImage;
        ImageView imageView2 = this.checkImage;
        PhotoViewer.AnonymousClass19 anonymousClass19 = this.numbersFrameLayout;
        AnimatingTextView animatingTextView = this.passwordEditText2;
        if (i7 == 0) {
            if (textView.getVisibility() != 0) {
                anonymousClass19.setVisibility(0);
            }
            editTextBoldCursor.setVisibility(8);
            animatingTextView.setVisibility(0);
            imageView2.setVisibility(8);
            imageView.setVisibility(8);
        } else if (i7 == 1) {
            editTextBoldCursor.setFilters(new InputFilter[0]);
            editTextBoldCursor.setInputType(129);
            anonymousClass19.setVisibility(8);
            editTextBoldCursor.setFocusable(true);
            editTextBoldCursor.setFocusableInTouchMode(true);
            editTextBoldCursor.setVisibility(0);
            animatingTextView.setVisibility(8);
            imageView2.setVisibility(0);
            imageView.setVisibility(this.fingerprintView.getVisibility());
        }
        setVisibility(0);
        editTextBoldCursor.setTransformationMethod(PasswordTransformationMethod.getInstance());
        editTextBoldCursor.setText("");
        AnimatingTextView.access$1200(animatingTextView, false);
        if (z) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass9(i, i2, linkManager$$ExternalSyntheticLambda2));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.shownT = 1.0f;
            onAnimationUpdate(1.0f);
            RLottieImageView rLottieImageView = this.imageView;
            rLottieImageView.setScaleX(1.0f);
            rLottieImageView.setScaleY(1.0f);
            rLottieImageView.stopAnimation();
            rLottieImageView.getAnimatedDrawable().setCurrentFrame(38, false, false);
            if (linkManager$$ExternalSyntheticLambda2 != null) {
                linkManager$$ExternalSyntheticLambda2.run();
            }
        }
        setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(18));
    }

    public final void processDone(boolean z) {
        String string;
        EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
        if (!z) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i = SharedConfig.passcodeType;
            AnimatingTextView animatingTextView = this.passwordEditText2;
            if (i == 0) {
                string = animatingTextView.stringBuilder.toString();
            } else {
                string = i == 1 ? editTextBoldCursor.getText().toString() : "";
            }
            int length = string.length();
            FrameLayout frameLayout = this.numbersTitleContainer;
            if (length == 0) {
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i2 = -this.shiftDp;
                this.shiftDp = i2;
                AndroidUtilities.shakeViewSpring(frameLayout, i2);
                return;
            }
            if (!SharedConfig.checkPasscode(string)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    checkRetryTextView();
                }
                editTextBoldCursor.setText("");
                AnimatingTextView.access$1200(animatingTextView, true);
                BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
                int i3 = -this.shiftDp;
                this.shiftDp = i3;
                AndroidUtilities.shakeViewSpring(frameLayout, i3);
                Drawable drawable = this.backgroundDrawable;
                if (drawable instanceof MotionBackgroundDrawable) {
                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                    SpringAnimation springAnimation = this.backgroundAnimationSpring;
                    if (springAnimation != null) {
                        springAnimation.cancel();
                        motionBackgroundDrawable.posAnimationProgress = 1.0f;
                        motionBackgroundDrawable.updateAnimation();
                    }
                    float f = motionBackgroundDrawable.posAnimationProgress;
                    if (f < 1.0f || f < 1.0f) {
                        return;
                    }
                    motionBackgroundDrawable.rotatingPreview = true;
                    motionBackgroundDrawable.posAnimationProgress = 0.0f;
                    motionBackgroundDrawable.rotationBack = true;
                    motionBackgroundDrawable.invalidateParent();
                    return;
                }
                return;
            }
        }
        SharedConfig.badPasscodeTries = 0;
        editTextBoldCursor.clearFocus();
        AndroidUtilities.hideKeyboard(editTextBoldCursor);
        if (Build.VERSION.SDK_INT >= 23 && FingerprintController.isKeyReady() && FingerprintController.checkDeviceFingerprintsChanged()) {
            FingerprintController.deleteInvalidKey();
        }
        SharedConfig.appLocked = false;
        SharedConfig.saveConfig();
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
        setOnTouchListener(null);
        PasscodeViewDelegate passcodeViewDelegate = this.delegate;
        if (passcodeViewDelegate != null) {
            passcodeViewDelegate.didAcceptedPassword(this);
        }
        RLottieImageView rLottieImageView = this.imageView;
        rLottieImageView.getAnimatedDrawable().setCustomEndFrame(71);
        rLottieImageView.getAnimatedDrawable().setCurrentFrame(37, false, false);
        rLottieImageView.playAnimation();
        AndroidUtilities.runOnUIThread(new PasscodeView$$ExternalSyntheticLambda1(this, 1));
    }

    public void setDelegate(PasscodeViewDelegate passcodeViewDelegate) {
        this.delegate = passcodeViewDelegate;
    }

    public final void showPin(boolean z) {
        int i = 0;
        int i2 = 2;
        ValueAnimator valueAnimator = this.pinAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pinShown = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.numbersFrameLayout.getAlpha(), z ? 1.0f : 0.0f);
        this.pinAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PasscodeView$$ExternalSyntheticLambda9(this, i));
        this.pinAnimator.addListener(new LoginActivity.AnonymousClass9(i2, this, z));
        this.pinAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.pinAnimator.setDuration(320L);
        this.pinAnimator.start();
    }
}
