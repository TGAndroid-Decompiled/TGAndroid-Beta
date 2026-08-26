package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.util.Property;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.biometric.BiometricManager$DefaultInjector;
import androidx.biometric.BiometricPrompt$AuthenticationCallback;
import androidx.biometric.BiometricPrompt$AuthenticationResult;
import androidx.core.content.ContextCompat;
import androidx.core.util.AtomicFile;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import com.android.billingclient.api.zzbo;
import com.google.android.gms.cast.zzbe;
import com.google.android.gms.internal.mlkit_vision_common.zzkj;
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
import org.telegram.ui.CalendarActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.ChatActivity$21$$ExternalSyntheticOutline0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class PasscodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final float BACKGROUND_SPRING_STIFFNESS = 300.0f;
    private static final int id_fingerprint_imageview = 1001;
    private static final int id_fingerprint_textview = 1000;
    private static final int[] ids = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    private final int BUTTON_SIZE;
    private final int BUTTON_X_MARGIN;
    private final int BUTTON_Y_MARGIN;
    private SpringAnimation backgroundAnimationSpring;
    private Drawable backgroundDarkDrawable;
    private Drawable backgroundDrawable;
    private FrameLayout backgroundFrameLayout;
    private int backgroundFrameLayoutColor;
    private LinkedList<Boolean> backgroundSpringNextQueue;
    private LinkedList<Runnable> backgroundSpringQueue;
    private View border;
    private ImageView checkImage;
    private Runnable checkRunnable;
    private FrameLayout container;
    private PasscodeViewDelegate delegate;
    private ImageView eraseView;
    private FingerprintDialog fingerprintDialog;
    private ImageView fingerprintImage;
    private PasscodeButton fingerprintView;
    private RLottieImageView imageView;
    private int imageY;
    private ArrayList<InnerAnimator> innerAnimators;
    private int keyboardHeight;
    private KeyboardNotifier keyboardNotifier;
    private int lastValue;
    private ArrayList<TextView> lettersTextViews;
    private ArrayList<FrameLayout> numberFrameLayouts;
    private ArrayList<TextView> numberTextViews;
    private FrameLayout numbersContainer;
    public FrameLayout numbersFrameLayout;
    private FrameLayout numbersTitleContainer;
    private TextView passcodeTextView;
    private EditTextBoldCursor passwordEditText;
    private AnimatingTextView passwordEditText2;
    private FrameLayout passwordFrameLayout;
    private ValueAnimator pinAnimator;
    private boolean pinShown;
    private int[] pos;
    private Rect rect;
    int resumeCount;
    private TextView retryTextView;
    private boolean selfCancelled;
    private int shiftDp;
    private float shownT;
    private TextView subtitleView;

    public class AnonymousClass2 implements TextWatcher {
        public AnonymousClass2() {
        }

        public void lambda$beforeTextChanged$0(boolean z, MotionBackgroundDrawable motionBackgroundDrawable) {
            if (z) {
                motionBackgroundDrawable.switchToNextPosition(true);
            } else {
                motionBackgroundDrawable.switchToPrevPosition(true);
            }
            PasscodeView.this.animateBackground(motionBackgroundDrawable);
        }

        @Override
        public void afterTextChanged(Editable editable) {
            if (PasscodeView.this.passwordEditText.length() == 4 && SharedConfig.passcodeType == 0) {
                PasscodeView.this.processDone(false);
            }
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            boolean z;
            if (PasscodeView.this.backgroundDrawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) PasscodeView.this.backgroundDrawable;
                motionBackgroundDrawable.setAnimationProgressProvider(null);
                float posAnimationProgress = motionBackgroundDrawable.getPosAnimationProgress();
                boolean z2 = true;
                int i4 = 0;
                if (i2 == 0 && i3 == 1) {
                    motionBackgroundDrawable.switchToNextPosition(true);
                    z = true;
                } else if (i2 == 1 && i3 == 0) {
                    motionBackgroundDrawable.switchToPrevPosition(true);
                    z = false;
                } else {
                    z = false;
                    z2 = false;
                }
                if (z2) {
                    if (posAnimationProgress >= 1.0f) {
                        PasscodeView.this.animateBackground(motionBackgroundDrawable);
                        return;
                    }
                    PasscodeView.this.backgroundSpringQueue.offer(new MediaActivity$$ExternalSyntheticLambda0(this, z, motionBackgroundDrawable, 1));
                    PasscodeView.this.backgroundSpringNextQueue.offer(Boolean.valueOf(z));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i5 = 0; i5 < PasscodeView.this.backgroundSpringQueue.size(); i5++) {
                        Runnable runnable = (Runnable) PasscodeView.this.backgroundSpringQueue.get(i5);
                        if (((Boolean) PasscodeView.this.backgroundSpringNextQueue.get(i5)).booleanValue() != z) {
                            arrayList.add(runnable);
                            arrayList2.add(Integer.valueOf(i5));
                        }
                    }
                    int size = arrayList.size();
                    int i6 = 0;
                    while (i6 < size) {
                        Object obj = arrayList.get(i6);
                        i6++;
                        PasscodeView.this.backgroundSpringQueue.remove((Runnable) obj);
                    }
                    int size2 = arrayList2.size();
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        int iIntValue = ((Integer) obj2).intValue();
                        if (iIntValue < PasscodeView.this.backgroundSpringNextQueue.size()) {
                            PasscodeView.this.backgroundSpringNextQueue.remove(iIntValue);
                        }
                    }
                }
            }
        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class AnonymousClass9 implements ViewTreeObserver.OnGlobalLayoutListener {
        final Runnable val$onShow;
        final int val$x;
        final int val$y;

        public AnonymousClass9(int i, int i2, Runnable runnable) {
            this.val$x = i;
            this.val$y = i2;
            this.val$onShow = runnable;
        }

        public void lambda$onGlobalLayout$0() {
            try {
                PasscodeView.this.imageView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }

        public void lambda$onGlobalLayout$1(double d, ValueAnimator valueAnimator) {
            double animatedFraction = d * ((double) valueAnimator.getAnimatedFraction());
            int i = 0;
            while (i < PasscodeView.this.innerAnimators.size()) {
                InnerAnimator innerAnimator = (InnerAnimator) PasscodeView.this.innerAnimators.get(i);
                if (innerAnimator.startRadius <= animatedFraction) {
                    innerAnimator.animatorSet.start();
                    PasscodeView.this.innerAnimators.remove(i);
                    i--;
                }
                i++;
            }
        }

        public void lambda$onGlobalLayout$2(ValueAnimator valueAnimator) {
            PasscodeView passcodeView = PasscodeView.this;
            passcodeView.onAnimationUpdate(passcodeView.shownT = ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }

        @Override
        public void onGlobalLayout() {
            float f;
            int iDp;
            char c;
            PasscodeView.this.setAlpha(1.0f);
            PasscodeView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            char c2 = 0;
            PasscodeView.this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            PasscodeView.this.imageView.getAnimatedDrawable().setCustomEndFrame(37);
            PasscodeView.this.imageView.playAnimation();
            int i = 1;
            PasscodeView.this.showPin(true);
            AndroidUtilities.runOnUIThread(new Bulletin$2$$ExternalSyntheticLambda1(this, 23), 350L);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i2 = point.x;
            int i3 = point.y + AndroidUtilities.statusBarHeight;
            int i4 = i2 - this.val$x;
            int i5 = this.val$y;
            double dSqrt = Math.sqrt(CalendarActivity$$ExternalSyntheticOutline0.m(i3, i5, i3 - i5, i4 * i4));
            int i6 = this.val$x;
            int i7 = this.val$y;
            double dSqrt2 = Math.sqrt(CalendarActivity$$ExternalSyntheticOutline0.m(i3, i7, i3 - i7, i6 * i6));
            int i8 = this.val$x;
            int i9 = this.val$y;
            double dSqrt3 = Math.sqrt((i9 * i9) + (i8 * i8));
            int i10 = i2 - this.val$x;
            int i11 = this.val$y;
            final double dMax = Math.max(Math.max(Math.max(dSqrt, dSqrt2), dSqrt3), Math.sqrt((i11 * i11) + (i10 * i10)));
            PasscodeView.this.innerAnimators.clear();
            int childCount = PasscodeView.this.numbersFrameLayout.getChildCount();
            int i12 = 0;
            while (i12 < childCount) {
                View childAt = PasscodeView.this.numbersFrameLayout.getChildAt(i12);
                childAt.setScaleX(0.7f);
                childAt.setScaleY(0.7f);
                childAt.setAlpha(0.0f);
                final AnimatorSet animatorSet2 = null;
                InnerAnimator innerAnimator = new InnerAnimator();
                childAt.getLocationInWindow(PasscodeView.this.pos);
                int measuredWidth = (childAt.getMeasuredWidth() / 2) + PasscodeView.this.pos[c2];
                int measuredHeight = (childAt.getMeasuredHeight() / 2) + PasscodeView.this.pos[i];
                int i13 = this.val$x - measuredWidth;
                int i14 = this.val$y;
                innerAnimator.startRadius = ((float) Math.sqrt(CalendarActivity$$ExternalSyntheticOutline0.m(i14, measuredHeight, i14 - measuredHeight, i13 * i13))) - AndroidUtilities.dp(40.0f);
                if (i12 != -1) {
                    animatorSet2 = new AnimatorSet();
                    Property property = View.SCALE_X;
                    float[] fArr = new float[i];
                    fArr[0] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
                    Property property2 = View.SCALE_Y;
                    float[] fArr2 = new float[i];
                    fArr2[0] = 1.0f;
                    c = 1;
                    animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2));
                    animatorSet2.setDuration(140L);
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                } else {
                    c = 1;
                }
                innerAnimator.animatorSet = new AnimatorSet();
                AnimatorSet animatorSet3 = innerAnimator.animatorSet;
                Property property3 = View.SCALE_X;
                float f2 = i12 == -1 ? 0.9f : 0.6f;
                float f3 = i12 == -1 ? 1.0f : 1.04f;
                float[] fArr3 = new float[2];
                fArr3[0] = f2;
                fArr3[c] = f3;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, fArr3);
                Property property4 = View.SCALE_Y;
                float f4 = i12 == -1 ? 0.9f : 0.6f;
                float f5 = i12 == -1 ? 1.0f : 1.04f;
                float[] fArr4 = new float[2];
                fArr4[0] = f4;
                fArr4[c] = f5;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property4, fArr4);
                int i15 = childCount;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                Animator[] animatorArr = new Animator[3];
                animatorArr[0] = objectAnimatorOfFloat2;
                animatorArr[c] = objectAnimatorOfFloat3;
                animatorArr[2] = objectAnimatorOfFloat4;
                animatorSet3.playTogether(animatorArr);
                innerAnimator.animatorSet.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        AnimatorSet animatorSet4 = animatorSet2;
                        if (animatorSet4 != null) {
                            animatorSet4.start();
                        }
                    }
                });
                innerAnimator.animatorSet.setDuration(i12 == -1 ? 232L : 200L);
                innerAnimator.animatorSet.setInterpolator(new DecelerateInterpolator());
                PasscodeView.this.innerAnimators.add(innerAnimator);
                i12++;
                childCount = i15;
                c2 = 0;
                i = 1;
            }
            arrayList.add(ObjectAnimator.ofFloat(PasscodeView.this.backgroundFrameLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onGlobalLayout$1(dMax, valueAnimator);
                }
            });
            TimeInterpolator timeInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatorSet.setInterpolator(timeInterpolator);
            animatorSet.setDuration(500L);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(PasscodeView.this.shownT, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 9));
            valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    PasscodeView passcodeView = PasscodeView.this;
                    passcodeView.onAnimationUpdate(passcodeView.shownT = 1.0f);
                }
            });
            valueAnimatorOfFloat2.setDuration(420L);
            valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
            arrayList.add(valueAnimatorOfFloat2);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Runnable runnable = AnonymousClass9.this.val$onShow;
                    if (runnable != null) {
                        runnable.run();
                    }
                    if (SharedConfig.passcodeType != 1 || PasscodeView.this.retryTextView.getVisibility() == 0 || PasscodeView.this.passwordEditText == null) {
                        return;
                    }
                    PasscodeView.this.passwordEditText.requestFocus();
                    AndroidUtilities.showKeyboard(PasscodeView.this.passwordEditText);
                }
            });
            animatorSet.start();
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(332L);
            if (AndroidUtilities.isTablet() || PasscodeView.this.getContext().getResources().getConfiguration().orientation != 2) {
                f = i2 / 2.0f;
                iDp = AndroidUtilities.dp(29.0f);
            } else {
                f = (SharedConfig.passcodeType == 0 ? i2 / 2.0f : i2) / 2.0f;
                iDp = AndroidUtilities.dp(30.0f);
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.TRANSLATION_X, this.val$x - AndroidUtilities.dp(29.0f), f - iDp), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.TRANSLATION_Y, this.val$y - AndroidUtilities.dp(29.0f), PasscodeView.this.imageY), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.SCALE_Y, 0.5f, 1.0f));
            animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet4.start();
        }
    }

    public class AnimatingTextView extends FrameLayout {
        private static final String DOT = "•";
        private ArrayList<TextView> characterTextViews;
        private AnimatorSet currentAnimation;
        private Runnable dotRunnable;
        private ArrayList<TextView> dotTextViews;
        private StringBuilder stringBuilder;

        public AnimatingTextView(Context context) {
            super(context);
            this.characterTextViews = new ArrayList<>(4);
            this.dotTextViews = new ArrayList<>(4);
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

        public void eraseAllCharacters(boolean z) {
            if (this.stringBuilder.length() == 0) {
                return;
            }
            Runnable runnable = this.dotRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.dotRunnable = null;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            StringBuilder sb = this.stringBuilder;
            sb.delete(0, sb.length());
            if (z) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < 4; i++) {
                    TextView textView = this.characterTextViews.get(i);
                    float alpha = textView.getAlpha();
                    Property property = View.ALPHA;
                    Property property2 = View.SCALE_Y;
                    Property property3 = View.SCALE_X;
                    if (alpha != 0.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    }
                    TextView textView2 = this.dotTextViews.get(i);
                    if (textView2.getAlpha() != 0.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f));
                    }
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.currentAnimation = animatorSet2;
                animatorSet2.setDuration(150L);
                this.currentAnimation.playTogether(arrayList);
                this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (AnimatingTextView.this.currentAnimation == null || !AnimatingTextView.this.currentAnimation.equals(animator)) {
                            return;
                        }
                        AnimatingTextView.this.currentAnimation = null;
                    }
                });
                this.currentAnimation.start();
            } else {
                for (int i2 = 0; i2 < 4; i2++) {
                    this.characterTextViews.get(i2).setAlpha(0.0f);
                    this.dotTextViews.get(i2).setAlpha(0.0f);
                }
            }
            PasscodeView.this.checkTitle();
        }

        private int getXForTextView(int i) {
            return RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(30.0f, i, (getMeasuredWidth() - (AndroidUtilities.dp(30.0f) * this.stringBuilder.length())) / 2) - AndroidUtilities.dp(10.0f);
        }

        public void appendCharacter(String str) {
            if (this.stringBuilder.length() == 4) {
                return;
            }
            try {
                performHapticFeedback(3);
            } catch (Exception e) {
                FileLog.e(e);
            }
            ArrayList arrayList = new ArrayList();
            final int length = this.stringBuilder.length();
            this.stringBuilder.append(str);
            TextView textView = this.characterTextViews.get(length);
            textView.setText(str);
            textView.setTranslationX(getXForTextView(length));
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f, 1.0f));
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f, 1.0f));
            float[] fArr = {AndroidUtilities.dp(20.0f), 0.0f};
            Property property4 = View.TRANSLATION_Y;
            arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, fArr));
            TextView textView2 = this.dotTextViews.get(length);
            textView2.setTranslationX(getXForTextView(length));
            textView2.setAlpha(0.0f);
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, AndroidUtilities.dp(20.0f), 0.0f));
            for (int i = length + 1; i < 4; i++) {
                TextView textView3 = this.characterTextViews.get(i);
                if (textView3.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
                }
                TextView textView4 = this.dotTextViews.get(i);
                if (textView4.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property2, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, (Property<TextView, Float>) property3, 0.0f));
                }
            }
            Runnable runnable = this.dotRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public void run() {
                    if (AnimatingTextView.this.dotRunnable != this) {
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    TextView textView5 = (TextView) AnimatingTextView.this.characterTextViews.get(length);
                    Property property5 = View.SCALE_X;
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, 0.0f));
                    Property property6 = View.SCALE_Y;
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property6, 0.0f));
                    Property property7 = View.ALPHA;
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property7, 0.0f));
                    TextView textView6 = (TextView) AnimatingTextView.this.dotTextViews.get(length);
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property6, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property7, 1.0f));
                    AnimatingTextView.this.currentAnimation = new AnimatorSet();
                    AnimatingTextView.this.currentAnimation.setDuration(150L);
                    AnimatingTextView.this.currentAnimation.playTogether(arrayList2);
                    AnimatingTextView.this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            if (AnimatingTextView.this.currentAnimation == null || !AnimatingTextView.this.currentAnimation.equals(animator)) {
                                return;
                            }
                            AnimatingTextView.this.currentAnimation = null;
                        }
                    });
                    AnimatingTextView.this.currentAnimation.start();
                }
            };
            this.dotRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 1500L);
            for (int i2 = 0; i2 < length; i2++) {
                TextView textView5 = this.characterTextViews.get(i2);
                float[] fArr2 = {getXForTextView(i2)};
                Property property5 = View.TRANSLATION_X;
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, 0.0f));
                TextView textView6 = this.dotTextViews.get(i2);
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property5, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property3, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, (Property<TextView, Float>) property4, 0.0f));
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.setDuration(150L);
            this.currentAnimation.playTogether(arrayList);
            this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (AnimatingTextView.this.currentAnimation == null || !AnimatingTextView.this.currentAnimation.equals(animator)) {
                        return;
                    }
                    AnimatingTextView.this.currentAnimation = null;
                }
            });
            this.currentAnimation.start();
            PasscodeView.this.checkTitle();
        }

        public boolean eraseLastCharacter() {
            ArrayList arrayList;
            int i;
            Property property;
            if (this.stringBuilder.length() == 0) {
                return false;
            }
            try {
                performHapticFeedback(3);
                while (true) {
                    property = View.TRANSLATION_X;
                    if (i >= 4) {
                        break;
                    }
                    TextView textView = this.characterTextViews.get(i);
                    float alpha = textView.getAlpha();
                    Property property2 = View.TRANSLATION_Y;
                    Property property3 = View.ALPHA;
                    Property property4 = View.SCALE_Y;
                    Property property5 = View.SCALE_X;
                    if (alpha != 0.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property5, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property4, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, getXForTextView(i)));
                    }
                    TextView textView2 = this.dotTextViews.get(i);
                    if (textView2.getAlpha() != 0.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property5, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property3, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, getXForTextView(i)));
                    }
                    i++;
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            arrayList = new ArrayList();
            int length = this.stringBuilder.length() - 1;
            if (length != 0) {
                this.stringBuilder.deleteCharAt(length);
            }
            i = length;
            if (length == 0) {
                this.stringBuilder.deleteCharAt(length);
            }
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(ObjectAnimator.ofFloat(this.characterTextViews.get(i2), (Property<TextView, Float>) property, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat(this.dotTextViews.get(i2), (Property<TextView, Float>) property, getXForTextView(i2)));
            }
            Runnable runnable = this.dotRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.dotRunnable = null;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimation = animatorSet2;
            animatorSet2.setDuration(150L);
            this.currentAnimation.playTogether(arrayList);
            this.currentAnimation.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (AnimatingTextView.this.currentAnimation == null || !AnimatingTextView.this.currentAnimation.equals(animator)) {
                        return;
                    }
                    AnimatingTextView.this.currentAnimation = null;
                }
            });
            this.currentAnimation.start();
            PasscodeView.this.checkTitle();
            return true;
        }

        public String getString() {
            return this.stringBuilder.toString();
        }

        public int length() {
            return this.stringBuilder.length();
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            Runnable runnable = this.dotRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.dotRunnable = null;
            }
            AnimatorSet animatorSet = this.currentAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.currentAnimation = null;
            }
            for (int i5 = 0; i5 < 4; i5++) {
                if (i5 < this.stringBuilder.length()) {
                    TextView textView = this.characterTextViews.get(i5);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(1.0f);
                    textView.setScaleY(1.0f);
                    textView.setTranslationY(0.0f);
                    textView.setTranslationX(getXForTextView(i5));
                    TextView textView2 = this.dotTextViews.get(i5);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    textView2.setTranslationY(0.0f);
                    textView2.setTranslationX(getXForTextView(i5));
                } else {
                    this.characterTextViews.get(i5).setAlpha(0.0f);
                    this.dotTextViews.get(i5).setAlpha(0.0f);
                }
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    public static class BlurBackground extends Drawable {
        private final Bitmap bitmap;
        private final Matrix matrix;
        private final Paint paint;
        private final int[] pos = new int[2];
        private final int rad;
        private final float scale;
        private final BitmapShader shader;
        private final View view;

        public BlurBackground(View view, Drawable drawable, int i, int i2) {
            Paint paint = new Paint(1);
            this.paint = paint;
            Matrix matrix = new Matrix();
            this.matrix = matrix;
            this.view = view;
            if (drawable != null) {
                Point point = AndroidUtilities.displaySize;
                float f = point.x / point.y;
                int i3 = (int) (f * 50.0f);
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i3, (int) (50.0f / f), Bitmap.Config.ARGB_8888);
                this.bitmap = bitmapCreateBitmap;
                float f2 = AndroidUtilities.displaySize.x / i3;
                this.scale = f2;
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Point point2 = AndroidUtilities.displaySize;
                drawable.setBounds(0, 0, point2.x, point2.y);
                float f3 = 1.0f / f2;
                canvas.scale(f3, f3);
                drawable.draw(canvas);
                canvas.drawColor(i);
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                this.bitmap = bitmapCreateBitmap2;
                new Canvas(bitmapCreateBitmap2).drawColor(1610612736);
                this.scale = 1.0f;
            }
            ColorMatrix colorMatrix = new ColorMatrix();
            if (Theme.currentTheme.isDark()) {
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, 0.15f);
            } else {
                colorMatrix.setSaturation(1.25f);
                AndroidUtilities.adjustBrightnessColorMatrix(colorMatrix, -0.1f);
            }
            Bitmap bitmap = this.bitmap;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.shader = bitmapShader;
            matrix.reset();
            float f4 = this.scale;
            matrix.postScale(f4, f4);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            this.rad = i2;
        }

        @Override
        public void draw(Canvas canvas) {
            this.view.getLocationOnScreen(this.pos);
            this.matrix.reset();
            Matrix matrix = this.matrix;
            float f = this.scale;
            matrix.postScale(f, f);
            Matrix matrix2 = this.matrix;
            int[] iArr = this.pos;
            matrix2.postTranslate(-iArr[0], -iArr[1]);
            this.shader.setLocalMatrix(this.matrix);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getBounds());
            float f2 = this.rad;
            canvas.drawRoundRect(rectF, f2, f2, this.paint);
        }

        @Override
        public int getOpacity() {
            return -2;
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public class FingerprintDialog extends LinearLayout {
        private AnimatorSet animatorSet;
        private final LinearLayout container1;
        private final FrameLayout container2;
        private float shownT;

        public FingerprintDialog(Context context, Drawable drawable, int i, View.OnClickListener onClickListener) {
            super(context);
            setOrientation(1);
            LinearLayout linearLayout = new LinearLayout(context) {
                @Override
                public void onMeasure(int i2, int i3) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(320.0f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)), i3);
                    setPivotX(getMeasuredWidth() / 2.0f);
                    setPivotY(getMeasuredHeight());
                }
            };
            this.container1 = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(20.0f));
            linearLayout.setBackground(new BlurBackground(linearLayout, drawable, i, AndroidUtilities.dp(24.0f)));
            TextView textView = new TextView(context);
            textView.setTextColor(-1);
            textView.setTextSize(1, 19.0f);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText("Unlock to use Telegram");
            textView.setGravity(17);
            linearLayout.addView(textView, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 8));
            TextView textView2 = new TextView(context);
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 15.33f);
            textView2.setText("Scan your fingerprint");
            textView2.setGravity(17);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 8));
            final TextView textView3 = new TextView(context);
            textView3.setTextColor(-1);
            textView3.setTextSize(1, 14.0f);
            textView3.setText("or");
            textView3.setAlpha(0.65f);
            FrameLayout frameLayout = new FrameLayout(context) {
                private final Paint paint = new Paint(1);

                @Override
                public void dispatchDraw(Canvas canvas) {
                    float measuredHeight = getMeasuredHeight() / 2.0f;
                    this.paint.setStyle(Paint.Style.STROKE);
                    this.paint.setStrokeWidth(AndroidUtilities.dp(0.66f));
                    this.paint.setColor(654311423);
                    canvas.drawLine(0.0f, measuredHeight, ((getMeasuredWidth() / 2.0f) - (textView3.getMeasuredWidth() / 2.0f)) - AndroidUtilities.dp(9.33f), measuredHeight, this.paint);
                    canvas.drawLine((textView3.getMeasuredWidth() / 2.0f) + (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(9.33f), measuredHeight, getMeasuredWidth(), measuredHeight, this.paint);
                    super.dispatchDraw(canvas);
                }
            };
            frameLayout.addView(textView3, LayoutHelper.createFrame(-2, -2, 17));
            frameLayout.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), 0);
            linearLayout.addView(frameLayout, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 8));
            TextView textView4 = new TextView(context);
            textView4.setText(LocaleController.getString(R.string.UsePIN));
            textView4.setTextColor(-1);
            textView4.setTextSize(1, 15.0f);
            textView4.setPadding(AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(32.0f), AndroidUtilities.dp(7.0f));
            textView4.setBackground(Theme.createRadSelectorDrawable(822083583, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f)));
            textView4.setOnClickListener(onClickListener);
            linearLayout.addView(textView4, LayoutHelper.createLinear(-2, -2, 17, 0, 0, 0, 0));
            FrameLayout frameLayout2 = new FrameLayout(context);
            this.container2 = frameLayout2;
            frameLayout2.setBackground(new BlurBackground(frameLayout2, drawable, i, AndroidUtilities.dp(35.0f)));
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.fingerprint);
            frameLayout2.addView(imageView, LayoutHelper.createFrame(-1, -1.0f));
            addView(linearLayout, LayoutHelper.createLinear(-1, -2, 17, 0, 0, 0, 16));
            addView(frameLayout2, LayoutHelper.createLinear(68, 73, 17, 0, 0, 0, ((int) (AndroidUtilities.navigationBarHeight / AndroidUtilities.density)) + 48));
        }

        public void lambda$dismiss$1(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.shownT = fFloatValue;
            onAnimationUpdate(fFloatValue);
        }

        public void lambda$show$0(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.shownT = fFloatValue;
            onAnimationUpdate(fFloatValue);
        }

        public void dismiss() {
            int i = 1;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.shownT, 0.0f);
            valueAnimatorOfFloat.addUpdateListener(new PasscodeView$FingerprintDialog$$ExternalSyntheticLambda0(this, i));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    FingerprintDialog fingerprintDialog = FingerprintDialog.this;
                    fingerprintDialog.onAnimationUpdate(fingerprintDialog.shownT = 0.0f);
                }
            });
            AnimatorSet animatorSet2 = this.animatorSet;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) View.SCALE_X, 0.7f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) View.SCALE_Y, 0.7f);
            Property property = View.ALPHA;
            animatorSet2.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) property, 0.0f), ObjectAnimator.ofFloat(this.container2, (Property<FrameLayout, Float>) property, 0.0f));
            this.animatorSet.setDuration(250L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (FingerprintDialog.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) FingerprintDialog.this.getParent()).removeView(FingerprintDialog.this);
                    }
                }
            });
            this.animatorSet.start();
        }

        public void onAnimationUpdate(float f) {
        }

        public void show() {
            int i = 0;
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            this.container1.setScaleX(0.7f);
            this.container1.setScaleY(0.7f);
            this.container1.setAlpha(0.0f);
            this.container2.setAlpha(0.0f);
            this.animatorSet = new AnimatorSet();
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.shownT, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new PasscodeView$FingerprintDialog$$ExternalSyntheticLambda0(this, i));
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    FingerprintDialog fingerprintDialog = FingerprintDialog.this;
                    fingerprintDialog.onAnimationUpdate(fingerprintDialog.shownT = 1.0f);
                }
            });
            AnimatorSet animatorSet2 = this.animatorSet;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) View.SCALE_X, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) View.SCALE_Y, 1.0f);
            Property property = View.ALPHA;
            animatorSet2.playTogether(valueAnimatorOfFloat, objectAnimatorOfFloat, objectAnimatorOfFloat2, ObjectAnimator.ofFloat(this.container1, (Property<LinearLayout, Float>) property, 1.0f), ObjectAnimator.ofFloat(this.container2, (Property<FrameLayout, Float>) property, 1.0f));
            this.animatorSet.setDuration(250L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.start();
        }
    }

    public static class InnerAnimator {
        private AnimatorSet animatorSet;
        private float startRadius;

        private InnerAnimator() {
        }
    }

    public static class PasscodeButton extends FrameLayout {
        private final ImageView imageView;
        private final TextView textView1;
        private final TextView textView2;

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

        public static String letter(int i) {
            if (i == 0) {
                return "+";
            }
            switch (i) {
                case 2:
                    return "ABC";
                case 3:
                    return "DEF";
                case 4:
                    return "GHI";
                case 5:
                    return "JKL";
                case 6:
                    return "MNO";
                case 7:
                    return "PQRS";
                case 8:
                    return "TUV";
                case 9:
                    return "WXYZ";
                default:
                    return "";
            }
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("android.widget.Button");
        }

        public void setImage(int i) {
            this.imageView.setVisibility(0);
            this.textView1.setVisibility(8);
            this.textView2.setVisibility(8);
            this.imageView.setImageResource(i);
        }

        public void setNum(int i) {
            this.imageView.setVisibility(8);
            this.textView1.setVisibility(0);
            this.textView2.setVisibility(0);
            this.textView1.setText("" + i);
            this.textView2.setText(letter(i));
        }
    }

    public interface PasscodeViewDelegate {
        void didAcceptedPassword(PasscodeView passcodeView);
    }

    public PasscodeView(Context context) {
        int i;
        super(context);
        this.BUTTON_X_MARGIN = 28;
        this.BUTTON_Y_MARGIN = 16;
        this.BUTTON_SIZE = 60;
        int i2 = 0;
        this.keyboardHeight = 0;
        this.rect = new Rect();
        this.backgroundSpringQueue = new LinkedList<>();
        this.backgroundSpringNextQueue = new LinkedList<>();
        this.innerAnimators = new ArrayList<>();
        this.shiftDp = -12;
        this.checkRunnable = new Runnable() {
            @Override
            public void run() {
                PasscodeView.this.checkRetryTextView();
                AndroidUtilities.runOnUIThread(PasscodeView.this.checkRunnable, 100L);
            }
        };
        this.resumeCount = 0;
        this.pinShown = true;
        this.pos = new int[2];
        setWillNotDraw(false);
        setVisibility(8);
        FrameLayout frameLayout = new FrameLayout(context) {
            private Paint paint = new Paint();

            @Override
            public void onDraw(Canvas canvas) {
                if (PasscodeView.this.backgroundDrawable == null) {
                    super.onDraw(canvas);
                } else if ((PasscodeView.this.backgroundDrawable instanceof MotionBackgroundDrawable) || (PasscodeView.this.backgroundDrawable instanceof ColorDrawable) || (PasscodeView.this.backgroundDrawable instanceof GradientDrawable)) {
                    PasscodeView.this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    PasscodeView.this.backgroundDrawable.draw(canvas);
                } else {
                    float fMax = Math.max(getMeasuredWidth() / PasscodeView.this.backgroundDrawable.getIntrinsicWidth(), (PasscodeView.this.keyboardHeight + getMeasuredHeight()) / PasscodeView.this.backgroundDrawable.getIntrinsicHeight());
                    int iCeil = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicWidth() * fMax);
                    int iCeil2 = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicHeight() * fMax);
                    int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                    int measuredHeight = (PasscodeView.this.keyboardHeight + (getMeasuredHeight() - iCeil2)) / 2;
                    PasscodeView.this.backgroundDrawable.setBounds(measuredWidth, measuredHeight, iCeil + measuredWidth, iCeil2 + measuredHeight);
                    PasscodeView.this.backgroundDrawable.draw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            }

            @Override
            public void setBackgroundColor(int i3) {
                this.paint.setColor(i3);
            }
        };
        this.backgroundFrameLayout = frameLayout;
        frameLayout.setWillNotDraw(false);
        addView(this.backgroundFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAnimation(R.raw.passcode_lock, 58, 58);
        this.imageView.setAutoRepeat(false);
        addView(this.imageView, LayoutHelper.createFrame(58, 58, 51));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.passwordFrameLayout = frameLayout2;
        this.backgroundFrameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        TextView textView = new TextView(context);
        this.passcodeTextView = textView;
        textView.setTextColor(-1);
        this.passcodeTextView.setTextSize(1, 18.33f);
        this.passcodeTextView.setGravity(1);
        this.passcodeTextView.setTypeface(AndroidUtilities.bold());
        this.passcodeTextView.setAlpha(0.0f);
        TextView textViewM = zzkj.m(this.passwordFrameLayout, this.passcodeTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f), context);
        this.retryTextView = textViewM;
        textViewM.setTextColor(-1);
        this.retryTextView.setTextSize(1, 15.0f);
        this.retryTextView.setGravity(1);
        this.retryTextView.setVisibility(4);
        this.backgroundFrameLayout.addView(this.retryTextView, LayoutHelper.createFrame(-2, -2, 17));
        AnimatingTextView animatingTextView = new AnimatingTextView(context);
        this.passwordEditText2 = animatingTextView;
        this.passwordFrameLayout.addView(animatingTextView, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 46.0f));
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.passwordEditText = editTextBoldCursor;
        editTextBoldCursor.setTextSize(1, 36.0f);
        this.passwordEditText.setTextColor(-1);
        this.passwordEditText.setMaxLines(1);
        this.passwordEditText.setLines(1);
        this.passwordEditText.setGravity(1);
        this.passwordEditText.setSingleLine(true);
        this.passwordEditText.setImeOptions(6);
        this.passwordEditText.setTypeface(Typeface.DEFAULT);
        this.passwordEditText.setBackgroundDrawable(null);
        this.passwordEditText.setCursorColor(-1);
        this.passwordEditText.setCursorSize(AndroidUtilities.dp(32.0f));
        this.passwordFrameLayout.addView(this.passwordEditText, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        this.passwordEditText.setOnEditorActionListener(new ReportAlert$$ExternalSyntheticLambda0(this, 5));
        this.passwordEditText.addTextChangedListener(new AnonymousClass2());
        this.passwordEditText.setCustomSelectionActionModeCallback(new ActionMode.Callback() {
            @Override
            public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override
            public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override
            public void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override
            public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        ImageView imageView = new ImageView(context);
        this.checkImage = imageView;
        imageView.setImageResource(R.drawable.passcode_check);
        ImageView imageView2 = this.checkImage;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView2.setScaleType(scaleType);
        ImageView imageView3 = this.checkImage;
        int i3 = R.drawable.bar_selector_lock;
        imageView3.setBackgroundResource(i3);
        this.passwordFrameLayout.addView(this.checkImage, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        this.checkImage.setContentDescription(LocaleController.getString(R.string.Done));
        final int i4 = 0;
        this.checkImage.setOnClickListener(new View.OnClickListener(this) {
            public final PasscodeView f$0;

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
                        this.f$0.lambda$new$2(view);
                        break;
                    default:
                        this.f$0.lambda$new$6(view);
                        break;
                }
            }
        });
        ImageView imageView4 = new ImageView(context);
        this.fingerprintImage = imageView4;
        imageView4.setImageResource(R.drawable.fingerprint);
        this.fingerprintImage.setScaleType(scaleType);
        this.fingerprintImage.setBackgroundResource(i3);
        this.passwordFrameLayout.addView(this.fingerprintImage, LayoutHelper.createFrame(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        this.fingerprintImage.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        final int i5 = 1;
        this.fingerprintImage.setOnClickListener(new View.OnClickListener(this) {
            public final PasscodeView f$0;

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
                        this.f$0.lambda$new$2(view);
                        break;
                    default:
                        this.f$0.lambda$new$6(view);
                        break;
                }
            }
        });
        View view = new View(context);
        this.border = view;
        view.setBackgroundColor(822083583);
        this.passwordFrameLayout.addView(this.border, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.numbersContainer = frameLayout3;
        this.backgroundFrameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, -1, 51));
        FrameLayout frameLayout4 = new FrameLayout(context) {
            @Override
            public void onLayout(boolean z, int i6, int i7, int i8, int i9) {
                super.onLayout(z, i6, i7, i8, i9);
                if (getParent() instanceof View) {
                    float fMin = Math.min(((View) getParent()).getHeight() / getHeight(), 1.0f);
                    setPivotX(getWidth() / 2.0f);
                    setPivotY(((FrameLayout.LayoutParams) getLayoutParams()).gravity == 17 ? getHeight() / 2.0f : 0.0f);
                    setScaleX(fMin);
                    setScaleY(fMin);
                }
            }
        };
        this.numbersFrameLayout = frameLayout4;
        this.numbersContainer.addView(frameLayout4, LayoutHelper.createFrame(-2, -2, 17));
        FrameLayout frameLayout5 = new FrameLayout(context);
        this.numbersTitleContainer = frameLayout5;
        this.numbersFrameLayout.addView(frameLayout5, LayoutHelper.createFrame(-2, -2, 49));
        TextView textViewM2 = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, 15.0f);
        textViewM2.setTypeface(AndroidUtilities.bold());
        textViewM2.setTextColor(-1);
        textViewM2.setText(LocaleController.getString(R.string.UnlockToUse));
        TextView textViewM3 = zzkj.m(this.numbersTitleContainer, textViewM2, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f), context);
        this.subtitleView = textViewM3;
        textViewM3.setTextSize(1, 14.0f);
        this.subtitleView.setTextColor(-1);
        this.subtitleView.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        this.numbersTitleContainer.addView(this.subtitleView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.numberFrameLayouts = new ArrayList<>(10);
        while (true) {
            if (i2 >= 12) {
                break;
            }
            PasscodeButton passcodeButton = new PasscodeButton(context);
            ScaleStateListAnimator.apply(passcodeButton, 0.15f, 1.5f);
            passcodeButton.setTag(Integer.valueOf(i2));
            if (i2 == 11) {
                int iDp = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, 654311423, 654311423));
                passcodeButton.setImage(R.drawable.filled_clear);
                passcodeButton.setOnLongClickListener(new ShareAlert$$ExternalSyntheticLambda21(this, 2));
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                setNextFocus(passcodeButton, R.id.passcode_btn_0);
            } else if (i2 == 10) {
                this.fingerprintView = passcodeButton;
                int iDp2 = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, 654311423, 654311423));
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                passcodeButton.setImage(R.drawable.fingerprint);
                setNextFocus(passcodeButton, R.id.passcode_btn_1);
            } else {
                int iDp3 = AndroidUtilities.dp(30.0f);
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp3, iDp3, iDp3, iDp3, 654311423, 1291845631, 1291845631));
                passcodeButton.setContentDescription(i2 + "");
                passcodeButton.setNum(i2);
                if (i2 == 0) {
                    setNextFocus(passcodeButton, R.id.passcode_btn_backspace);
                } else if (i2 != 9) {
                    setNextFocus(passcodeButton, ids[i2 + 1]);
                } else if (hasFingerprint()) {
                    setNextFocus(passcodeButton, R.id.passcode_btn_fingerprint);
                } else {
                    setNextFocus(passcodeButton, R.id.passcode_btn_0);
                }
            }
            passcodeButton.setId(ids[i2]);
            final int i6 = 2;
            passcodeButton.setOnClickListener(new View.OnClickListener(this) {
                public final PasscodeView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view2) {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$new$1(view2);
                            break;
                        case 1:
                            this.f$0.lambda$new$2(view2);
                            break;
                        default:
                            this.f$0.lambda$new$6(view2);
                            break;
                    }
                }
            });
            this.numberFrameLayouts.add(passcodeButton);
            i2++;
        }
        for (i = 11; i >= 0; i--) {
            this.numbersFrameLayout.addView(this.numberFrameLayouts.get(i), LayoutHelper.createFrame(60, 60, 51));
        }
        checkFingerprintButton();
    }

    public void animateBackground(MotionBackgroundDrawable motionBackgroundDrawable) {
        SpringAnimation springAnimation = this.backgroundAnimationSpring;
        if (springAnimation != null && springAnimation.mRunning) {
            springAnimation.cancel();
        }
        FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        motionBackgroundDrawable.setAnimationProgressProvider(new ColorPicker$$ExternalSyntheticLambda5(floatValueHolder, 6));
        SpringAnimation springAnimationM = ChatActivity$21$$ExternalSyntheticOutline0.m(100.0f, 300.0f, 1.0f, new SpringAnimation(floatValueHolder));
        this.backgroundAnimationSpring = springAnimationM;
        springAnimationM.addEndListener(new PasscodeView$$ExternalSyntheticLambda12(0, this, motionBackgroundDrawable));
        this.backgroundAnimationSpring.addUpdateListener(new Bulletin$$ExternalSyntheticLambda2(motionBackgroundDrawable, 4));
        this.backgroundAnimationSpring.start();
    }

    private void checkFingerprint() {
        Activity activityFindActivity;
        if (Build.VERSION.SDK_INT >= 23 && (activityFindActivity = AndroidUtilities.findActivity(getContext())) != null && this.fingerprintView.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (!(activityFindActivity instanceof LaunchActivity) || ((LaunchActivity) activityFindActivity).allowShowFingerprintDialog(this)) {
                try {
                    if (new AtomicFile(new BiometricManager$DefaultInjector(getContext(), 0)).canAuthenticate(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                        zzbe zzbeVar = new zzbe(LaunchActivity.instance, ContextCompat.getMainExecutor(getContext()), new BiometricPrompt$AuthenticationCallback() {
                            @Override
                            public void onAuthenticationError(int i, CharSequence charSequence) {
                                FileLog.d("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                                PasscodeView.this.showPin(true);
                            }

                            @Override
                            public void onAuthenticationFailed() {
                                FileLog.d("PasscodeView onAuthenticationFailed");
                                PasscodeView.this.showPin(true);
                            }

                            @Override
                            public void onAuthenticationSucceeded(BiometricPrompt$AuthenticationResult biometricPrompt$AuthenticationResult) {
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
    }

    private void checkFingerprintButton() {
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

    public void checkRetryTextView() {
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
        if (j2 <= 0) {
            AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
            if (this.retryTextView.getVisibility() == 0) {
                this.retryTextView.setVisibility(4);
                this.passwordFrameLayout.setVisibility(0);
                showPin(true);
                if (SharedConfig.passcodeType == 1) {
                    AndroidUtilities.showKeyboard(this.passwordEditText);
                    return;
                }
                return;
            }
            return;
        }
        int iMax = Math.max(1, (int) Math.ceil(j2 / 1000.0d));
        if (iMax != this.lastValue) {
            this.retryTextView.setText(LocaleController.formatString(R.string.TooManyTries, LocaleController.formatPluralString("Seconds", iMax, new Object[0])));
            this.lastValue = iMax;
        }
        if (this.retryTextView.getVisibility() != 0) {
            this.retryTextView.setVisibility(0);
            this.passwordFrameLayout.setVisibility(4);
            showPin(false);
            AndroidUtilities.hideKeyboard(this.passwordEditText);
        }
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
        AndroidUtilities.runOnUIThread(this.checkRunnable, 100L);
    }

    public void checkTitle() {
        AnimatingTextView animatingTextView = this.passwordEditText2;
        boolean z = animatingTextView == null || animatingTextView.length() > 0;
        FrameLayout frameLayout = this.numbersTitleContainer;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            OKLCH.m(this.numbersTitleContainer.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        }
    }

    private boolean hasFingerprint() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (Build.VERSION.SDK_INT >= 23 && activityFindActivity != null && SharedConfig.useFingerprintLock) {
            try {
                Context context = ApplicationLoader.applicationContext;
                FingerprintManagerCompat.FingerprintManagerCompatImpl fingerprintManagerCompatImpl = FingerprintManagerCompat.IMPL;
                return fingerprintManagerCompatImpl.isHardwareDetected(context) && fingerprintManagerCompatImpl.hasEnrolledFingerprints(context) && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return false;
    }

    public static Float lambda$animateBackground$7(FloatValueHolder floatValueHolder, MotionBackgroundDrawable motionBackgroundDrawable) {
        return Float.valueOf(floatValueHolder.mValue / 100.0f);
    }

    public void lambda$animateBackground$8(MotionBackgroundDrawable motionBackgroundDrawable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        this.backgroundAnimationSpring = null;
        motionBackgroundDrawable.setAnimationProgressProvider(null);
        if (z) {
            return;
        }
        motionBackgroundDrawable.setPosAnimationProgress(1.0f);
        if (this.backgroundSpringQueue.isEmpty()) {
            return;
        }
        this.backgroundSpringQueue.poll().run();
        this.backgroundSpringNextQueue.poll();
    }

    public boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        processDone(false);
        return true;
    }

    public void lambda$new$1(View view) {
        processDone(false);
    }

    public void lambda$new$2(View view) {
        checkFingerprint();
    }

    public boolean lambda$new$3(View view) {
        this.passwordEditText.setText("");
        this.passwordEditText2.eraseAllCharacters(true);
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable).switchToPrevPosition(true);
        }
        return true;
    }

    public void lambda$new$4(boolean z, MotionBackgroundDrawable motionBackgroundDrawable) {
        if (z) {
            motionBackgroundDrawable.switchToNextPosition(true);
        } else {
            motionBackgroundDrawable.switchToPrevPosition(true);
        }
        animateBackground(motionBackgroundDrawable);
    }

    public static int lambda$new$5(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    public void lambda$new$6(View view) {
        boolean zEraseLastCharacter;
        boolean z;
        if (this.fingerprintDialog == null && this.pinShown) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            int i = 0;
            switch (iIntValue) {
                case 0:
                    this.passwordEditText2.appendCharacter("0");
                    zEraseLastCharacter = false;
                    break;
                case 1:
                    this.passwordEditText2.appendCharacter("1");
                    zEraseLastCharacter = false;
                    break;
                case 2:
                    this.passwordEditText2.appendCharacter("2");
                    zEraseLastCharacter = false;
                    break;
                case 3:
                    this.passwordEditText2.appendCharacter("3");
                    zEraseLastCharacter = false;
                    break;
                case 4:
                    this.passwordEditText2.appendCharacter("4");
                    zEraseLastCharacter = false;
                    break;
                case 5:
                    this.passwordEditText2.appendCharacter("5");
                    zEraseLastCharacter = false;
                    break;
                case 6:
                    this.passwordEditText2.appendCharacter("6");
                    zEraseLastCharacter = false;
                    break;
                case 7:
                    this.passwordEditText2.appendCharacter("7");
                    zEraseLastCharacter = false;
                    break;
                case 8:
                    this.passwordEditText2.appendCharacter("8");
                    zEraseLastCharacter = false;
                    break;
                case 9:
                    this.passwordEditText2.appendCharacter("9");
                    zEraseLastCharacter = false;
                    break;
                case 10:
                    checkFingerprint();
                    zEraseLastCharacter = false;
                    break;
                case 11:
                    zEraseLastCharacter = this.passwordEditText2.eraseLastCharacter();
                    break;
                default:
                    zEraseLastCharacter = false;
                    break;
            }
            if (this.passwordEditText2.length() == 4) {
                processDone(false);
            }
            if (iIntValue == 11) {
                return;
            }
            Drawable drawable = this.backgroundDrawable;
            if (drawable instanceof MotionBackgroundDrawable) {
                MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                motionBackgroundDrawable.setAnimationProgressProvider(null);
                float posAnimationProgress = motionBackgroundDrawable.getPosAnimationProgress();
                boolean z2 = true;
                if (iIntValue == 10) {
                    if (zEraseLastCharacter) {
                        motionBackgroundDrawable.switchToPrevPosition(true);
                    } else {
                        z2 = false;
                    }
                    z = false;
                } else {
                    motionBackgroundDrawable.switchToNextPosition(true);
                    z = true;
                }
                if (z2) {
                    if (posAnimationProgress >= 1.0f) {
                        animateBackground(motionBackgroundDrawable);
                        return;
                    }
                    this.backgroundSpringQueue.offer(new MediaActivity$$ExternalSyntheticLambda0(this, z, motionBackgroundDrawable, 5));
                    this.backgroundSpringNextQueue.offer(Boolean.valueOf(z));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < this.backgroundSpringQueue.size(); i2++) {
                        Runnable runnable = this.backgroundSpringQueue.get(i2);
                        Boolean bool = this.backgroundSpringNextQueue.get(i2);
                        if (bool != null && bool.booleanValue() != z) {
                            arrayList.add(runnable);
                            arrayList2.add(Integer.valueOf(i2));
                        }
                    }
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        this.backgroundSpringQueue.remove((Runnable) obj);
                    }
                    Collections.sort(arrayList2, new SeekBar$$ExternalSyntheticLambda0(8));
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        this.backgroundSpringNextQueue.remove(((Integer) obj2).intValue());
                    }
                }
            }
        }
    }

    public void lambda$onAttachedToWindow$13(Integer num) {
        float height;
        if (getContext() == null) {
            return;
        }
        boolean z = getContext().getResources().getConfiguration().orientation == 2;
        int iIntValue = num.intValue() - AndroidUtilities.navigationBarHeight;
        if (SharedConfig.passcodeType == 1) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = this.passwordFrameLayout.animate();
            if (iIntValue <= AndroidUtilities.dp(20.0f)) {
                height = 0.0f;
            } else {
                height = (((getHeight() - iIntValue) / 2.0f) - (this.passwordFrameLayout.getHeight() / (z ? 1.0f : 2.0f))) - this.passwordFrameLayout.getTop();
            }
            ViewPropertyAnimator duration = viewPropertyAnimatorAnimate.translationY(height).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            this.imageView.animate().alpha(iIntValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator);
        }
    }

    public void lambda$onResume$12() {
        EditTextBoldCursor editTextBoldCursor;
        if (this.retryTextView.getVisibility() == 0 || (editTextBoldCursor = this.passwordEditText) == null) {
            return;
        }
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.passwordEditText);
    }

    public static boolean lambda$onShow$15(View view, MotionEvent motionEvent) {
        return true;
    }

    public void lambda$processDone$10(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.shownT = fFloatValue;
        onAnimationUpdate(fFloatValue);
        setAlpha(this.shownT);
    }

    public void lambda$processDone$11() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.shownT, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new PasscodeView$$ExternalSyntheticLambda2(this, 0));
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PasscodeView.this.setVisibility(8);
                PasscodeView.this.onHidden();
                PasscodeView passcodeView = PasscodeView.this;
                passcodeView.onAnimationUpdate(passcodeView.shownT = 0.0f);
                PasscodeView.this.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(420L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        valueAnimatorOfFloat.start();
    }

    public void lambda$showPin$14(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.numbersFrameLayout.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
        this.numbersFrameLayout.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
        this.numbersFrameLayout.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
        this.passcodeTextView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
        this.passcodeTextView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
        this.passcodeTextView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fFloatValue));
        this.passwordEditText2.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
    }

    private void onPasscodeError() {
        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
        shakeTextView(2.0f, 0);
    }

    public void processDone(boolean z) {
        String string;
        if (!z) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i = SharedConfig.passcodeType;
            if (i == 0) {
                string = this.passwordEditText2.getString();
            } else {
                string = i == 1 ? this.passwordEditText.getText().toString() : "";
            }
            if (string.length() == 0) {
                onPasscodeError();
                return;
            }
            if (!SharedConfig.checkPasscode(string)) {
                SharedConfig.increaseBadPasscodeTries();
                if (SharedConfig.passcodeRetryInMs > 0) {
                    checkRetryTextView();
                }
                this.passwordEditText.setText("");
                this.passwordEditText2.eraseAllCharacters(true);
                onPasscodeError();
                Drawable drawable = this.backgroundDrawable;
                if (drawable instanceof MotionBackgroundDrawable) {
                    MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
                    SpringAnimation springAnimation = this.backgroundAnimationSpring;
                    if (springAnimation != null) {
                        springAnimation.cancel();
                        motionBackgroundDrawable.setPosAnimationProgress(1.0f);
                    }
                    if (motionBackgroundDrawable.getPosAnimationProgress() >= 1.0f) {
                        motionBackgroundDrawable.rotatePreview(true);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        SharedConfig.badPasscodeTries = 0;
        this.passwordEditText.clearFocus();
        AndroidUtilities.hideKeyboard(this.passwordEditText);
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
        this.imageView.getAnimatedDrawable().setCustomEndFrame(71);
        this.imageView.getAnimatedDrawable().setCurrentFrame(37, false);
        this.imageView.playAnimation();
        AndroidUtilities.runOnUIThread(new PasscodeView$$ExternalSyntheticLambda1(this, 1));
    }

    private void setNextFocus(View view, int i) {
        view.setNextFocusForwardId(i);
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(i);
        }
    }

    private void shakeTextView(float f, int i) {
        if (i == 6) {
            return;
        }
        FrameLayout frameLayout = this.numbersTitleContainer;
        int i2 = -this.shiftDp;
        this.shiftDp = i2;
        AndroidUtilities.shakeViewSpring(frameLayout, i2);
    }

    private void showFingerprintError(CharSequence charSequence) {
        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
    }

    public void showPin(final boolean z) {
        int i = 1;
        ValueAnimator valueAnimator = this.pinAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pinShown = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.numbersFrameLayout.getAlpha(), z ? 1.0f : 0.0f);
        this.pinAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new PasscodeView$$ExternalSyntheticLambda2(this, i));
        this.pinAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                float f = z ? 1.0f : 0.0f;
                PasscodeView.this.numbersFrameLayout.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f));
                PasscodeView.this.numbersFrameLayout.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f));
                PasscodeView.this.numbersFrameLayout.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f));
                PasscodeView.this.passcodeTextView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f));
                PasscodeView.this.passcodeTextView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f));
                PasscodeView.this.passcodeTextView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f));
                PasscodeView.this.passwordEditText2.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f));
            }
        });
        this.pinAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.pinAnimator.setDuration(320L);
        this.pinAnimator.start();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
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
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.keyboardNotifier == null && (getParent() instanceof View)) {
            this.keyboardNotifier = new KeyboardNotifier((View) getParent(), false, new PasscodeView$$ExternalSyntheticLambda8(this, 0));
        }
    }

    public boolean onBackPressed() {
        KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
        if (keyboardNotifier == null || !keyboardNotifier.keyboardVisible()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.passwordEditText);
        return false;
    }

    @Override
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    public void onHidden() {
    }

    @Override
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View rootView = getRootView();
        int height = (rootView.getHeight() - AndroidUtilities.statusBarHeight) - AndroidUtilities.getViewInset(rootView);
        getWindowVisibleDisplayFrame(this.rect);
        Rect rect = this.rect;
        this.keyboardHeight = height - (rect.bottom - rect.top);
        if (SharedConfig.passcodeType == 1 && (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2)) {
            int iIntValue = this.passwordFrameLayout.getTag() != null ? ((Integer) this.passwordFrameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams.topMargin = ((iIntValue + layoutParams.height) - (this.keyboardHeight / 2)) - AndroidUtilities.statusBarHeight;
            this.passwordFrameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        this.passcodeTextView.getLocationInWindow(this.pos);
        if (AndroidUtilities.isTablet() || getContext().getResources().getConfiguration().orientation != 2) {
            RLottieImageView rLottieImageView = this.imageView;
            int iDp = this.pos[1] - AndroidUtilities.dp(100.0f);
            this.imageY = iDp;
            rLottieImageView.setTranslationY(iDp);
            return;
        }
        RLottieImageView rLottieImageView2 = this.imageView;
        int iDp2 = this.pos[1] - AndroidUtilities.dp(100.0f);
        this.imageY = iDp2;
        rLottieImageView2.setTranslationY(iDp2);
    }

    @Override
    public void onMeasure(int i, int i2) {
        int iM$2;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int iDp = AndroidUtilities.displaySize.y;
        int iDp2 = AndroidUtilities.dp(28.0f);
        int iDp3 = AndroidUtilities.dp(16.0f);
        int iDp4 = AndroidUtilities.dp(60.0f);
        int i3 = 0;
        boolean z = !AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2;
        View view = this.border;
        if (view != null) {
            view.setVisibility(SharedConfig.passcodeType == 1 ? 0 : 8);
        }
        if (z) {
            RLottieImageView rLottieImageView = this.imageView;
            if (SharedConfig.passcodeType == 0) {
                f = 40.0f;
                f2 = size / 2.0f;
            } else {
                f = 40.0f;
                f2 = size;
            }
            rLottieImageView.setTranslationX((f2 / 2.0f) - AndroidUtilities.dp(29.0f));
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams.height = AndroidUtilities.dp(180.0f);
            layoutParams.topMargin = OKLCH.m$2(140.0f, iDp, 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(f) : 0);
            this.passwordFrameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.numbersContainer.getLayoutParams();
            layoutParams2.height = iDp;
            int i4 = size / 2;
            layoutParams2.leftMargin = i4;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i4;
            this.numbersContainer.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams3.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams3.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            layoutParams3.gravity = 17;
            this.numbersFrameLayout.setLayoutParams(layoutParams3);
        } else {
            this.imageView.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
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
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams4.height = (iDp / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = iM$3;
            layoutParams4.leftMargin = iM$2;
            this.passwordFrameLayout.setTag(Integer.valueOf(iM$3));
            this.passwordFrameLayout.setLayoutParams(layoutParams4);
            int i5 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams5.height = (Math.max(0, 3) * iDp3) + (iDp4 * 4) + AndroidUtilities.dp(82.0f);
            layoutParams5.width = (Math.max(0, 2) * iDp2) + (iDp4 * 3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            this.numbersFrameLayout.setLayoutParams(layoutParams5);
            int i6 = iDp - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.numbersContainer.getLayoutParams();
            layoutParams6.leftMargin = iM$2;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (iDp - i6) / 2;
            } else {
                layoutParams6.topMargin = i5;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            this.numbersContainer.setLayoutParams(layoutParams6);
        }
        int iDp5 = AndroidUtilities.dp(z ? 52.0f : 82.0f);
        while (i3 < 12) {
            int i7 = 10;
            if (i3 != 0) {
                if (i3 == 10) {
                    i7 = 11;
                } else {
                    i7 = i3 == 11 ? 9 : i3 - 1;
                }
            }
            FrameLayout frameLayout = this.numberFrameLayouts.get(i3);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams7.topMargin = ((iDp4 + iDp3) * (i7 / 3)) + iDp5;
            layoutParams7.leftMargin = (iDp4 + iDp2) * (i7 % 3);
            frameLayout.setLayoutParams(layoutParams7);
            i3++;
        }
        super.onMeasure(i, i2);
    }

    public void onPause() {
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
    }

    public void onResume() {
        checkRetryTextView();
        if (this.retryTextView.getVisibility() != 0) {
            if (SharedConfig.passcodeType == 1) {
                EditTextBoldCursor editTextBoldCursor = this.passwordEditText;
                if (editTextBoldCursor != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(this.passwordEditText);
                }
                AndroidUtilities.runOnUIThread(new PasscodeView$$ExternalSyntheticLambda1(this, 0), 200L);
            }
            checkFingerprint();
        }
    }

    public void onShow(boolean z, boolean z2) {
        onShow(z, z2, -1, -1, null, null);
    }

    public void setDelegate(PasscodeViewDelegate passcodeViewDelegate) {
        this.delegate = passcodeViewDelegate;
    }

    public void onShow(boolean z, boolean z2, int i, int i2, Runnable runnable, Runnable runnable2) {
        View currentFocus;
        boolean z3;
        int i3;
        int i4;
        EditTextBoldCursor editTextBoldCursor;
        checkFingerprintButton();
        checkRetryTextView();
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (SharedConfig.passcodeType == 1) {
            if (!z2 && this.retryTextView.getVisibility() != 0 && (editTextBoldCursor = this.passwordEditText) != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(this.passwordEditText);
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
        this.backgroundFrameLayoutColor = 0;
        if (Theme.getCachedWallpaper() instanceof MotionBackgroundDrawable) {
            z3 = !Theme.currentTheme.isDark();
            this.backgroundDrawable = Theme.getCachedWallpaper();
            FrameLayout frameLayout = this.backgroundFrameLayout;
            this.backgroundFrameLayoutColor = -1090519040;
            frameLayout.setBackgroundColor(-1090519040);
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
                    FrameLayout frameLayout2 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = 570425344;
                    frameLayout2.setBackgroundColor(570425344);
                } else {
                    FrameLayout frameLayout3 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = -1090519040;
                    frameLayout3.setBackgroundColor(-1090519040);
                }
            } else if ("d".equals(Theme.getSelectedBackgroundSlug())) {
                FrameLayout frameLayout4 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = -11436898;
                frameLayout4.setBackgroundColor(-11436898);
            } else {
                String selectedBackgroundSlug = Theme.getSelectedBackgroundSlug();
                if (Theme.isPatternWallpaper || "CJz3BZ6YGEYBAAAABboWp6SAv04".equals(selectedBackgroundSlug) || "qeZWES8rGVIEAAAARfWlK1lnfiI".equals(selectedBackgroundSlug)) {
                    FrameLayout frameLayout5 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = -11436898;
                    frameLayout5.setBackgroundColor(-11436898);
                } else {
                    Drawable cachedWallpaper = Theme.getCachedWallpaper();
                    this.backgroundDrawable = cachedWallpaper;
                    if (cachedWallpaper instanceof BackgroundGradientDrawable) {
                        FrameLayout frameLayout6 = this.backgroundFrameLayout;
                        this.backgroundFrameLayoutColor = 570425344;
                        frameLayout6.setBackgroundColor(570425344);
                    } else if (cachedWallpaper != null) {
                        FrameLayout frameLayout7 = this.backgroundFrameLayout;
                        this.backgroundFrameLayoutColor = -1090519040;
                        frameLayout7.setBackgroundColor(-1090519040);
                    } else {
                        FrameLayout frameLayout8 = this.backgroundFrameLayout;
                        this.backgroundFrameLayoutColor = -11436898;
                        frameLayout8.setBackgroundColor(-11436898);
                    }
                }
            }
            z3 = false;
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            int[] colors = motionBackgroundDrawable.getColors();
            if (z3) {
                int[] iArr = new int[colors.length];
                for (int i5 = 0; i5 < colors.length; i5++) {
                    iArr[i5] = Theme.adaptHSV(0.14f, 0.0f, colors[i5]);
                }
                colors = iArr;
            }
            this.backgroundDrawable = new MotionBackgroundDrawable(colors[0], colors[1], colors[2], colors[3], false);
            if (!motionBackgroundDrawable.hasPattern() || motionBackgroundDrawable.getIntensity() >= 0) {
                FrameLayout frameLayout9 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = 570425344;
                frameLayout9.setBackgroundColor(570425344);
            } else {
                FrameLayout frameLayout10 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = 2130706432;
                frameLayout10.setBackgroundColor(2130706432);
            }
            ((MotionBackgroundDrawable) this.backgroundDrawable).setParentView(this.backgroundFrameLayout);
        }
        this.passcodeTextView.setText(LocaleController.getString(R.string.AppLocked));
        int i6 = SharedConfig.passcodeType;
        if (i6 == 0) {
            if (this.retryTextView.getVisibility() != 0) {
                this.numbersFrameLayout.setVisibility(0);
            }
            this.passwordEditText.setVisibility(8);
            this.passwordEditText2.setVisibility(0);
            this.checkImage.setVisibility(8);
            this.fingerprintImage.setVisibility(8);
        } else if (i6 == 1) {
            this.passwordEditText.setFilters(new InputFilter[0]);
            this.passwordEditText.setInputType(129);
            this.numbersFrameLayout.setVisibility(8);
            this.passwordEditText.setFocusable(true);
            this.passwordEditText.setFocusableInTouchMode(true);
            this.passwordEditText.setVisibility(0);
            this.passwordEditText2.setVisibility(8);
            this.checkImage.setVisibility(0);
            this.fingerprintImage.setVisibility(this.fingerprintView.getVisibility());
        }
        setVisibility(0);
        this.passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        this.passwordEditText.setText("");
        this.passwordEditText2.eraseAllCharacters(false);
        if (z2) {
            setAlpha(0.0f);
            getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass9(i, i2, runnable));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.shownT = 1.0f;
            onAnimationUpdate(1.0f);
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            this.imageView.stopAnimation();
            this.imageView.getAnimatedDrawable().setCurrentFrame(38, false);
            if (runnable != null) {
                runnable.run();
            }
        }
        setOnTouchListener(new ShareAlert$$ExternalSyntheticLambda19(25));
    }
}
