package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
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
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.biometric.BiometricManager;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.fingerprint.FingerprintManagerCompat;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.KeyboardNotifier;

public class PasscodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final int[] ids = {R.id.passcode_btn_0, R.id.passcode_btn_1, R.id.passcode_btn_2, R.id.passcode_btn_3, R.id.passcode_btn_4, R.id.passcode_btn_5, R.id.passcode_btn_6, R.id.passcode_btn_7, R.id.passcode_btn_8, R.id.passcode_btn_9, R.id.passcode_btn_backspace, R.id.passcode_btn_fingerprint};
    private final int BUTTON_SIZE;
    private final int BUTTON_X_MARGIN;
    private final int BUTTON_Y_MARGIN;
    private SpringAnimation backgroundAnimationSpring;
    private Drawable backgroundDrawable;
    private FrameLayout backgroundFrameLayout;
    private int backgroundFrameLayoutColor;
    private LinkedList backgroundSpringNextQueue;
    private LinkedList backgroundSpringQueue;
    private View border;
    private ImageView checkImage;
    private Runnable checkRunnable;
    private PasscodeViewDelegate delegate;
    private ImageView fingerprintImage;
    private PasscodeButton fingerprintView;
    private RLottieImageView imageView;
    private int imageY;
    private ArrayList innerAnimators;
    private int keyboardHeight;
    private KeyboardNotifier keyboardNotifier;
    private int lastValue;
    private ArrayList numberFrameLayouts;
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
    private int shiftDp;
    private float shownT;
    private TextView subtitleView;

    public interface PasscodeViewDelegate {
        void didAcceptedPassword(PasscodeView passcodeView);
    }

    public static boolean $r8$lambda$H5Dfq1BJIWmILnuepA0ZvnztQII(View view, MotionEvent motionEvent) {
        return true;
    }

    protected void onAnimationUpdate(float f) {
    }

    protected void onHidden() {
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didGenerateFingerprintKeyPair) {
            checkFingerprintButton();
            if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
                checkFingerprint();
                return;
            }
            return;
        }
        if (i != NotificationCenter.passcodeDismissed || objArr[0] == this) {
            return;
        }
        setVisibility(8);
    }

    public void checkTitle() {
        AnimatingTextView animatingTextView = this.passwordEditText2;
        boolean z = animatingTextView == null || animatingTextView.length() > 0;
        FrameLayout frameLayout = this.numbersTitleContainer;
        if (frameLayout != null) {
            frameLayout.animate().cancel();
            this.numbersTitleContainer.animate().alpha(z ? 0.0f : 1.0f).scaleX(z ? 0.8f : 1.0f).scaleY(z ? 0.8f : 1.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
        }
    }

    class AnimatingTextView extends FrameLayout {
        private ArrayList characterTextViews;
        private AnimatorSet currentAnimation;
        private Runnable dotRunnable;
        private ArrayList dotTextViews;
        private StringBuilder stringBuilder;

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

        private int getXForTextView(int i) {
            return (((getMeasuredWidth() - (this.stringBuilder.length() * AndroidUtilities.dp(30.0f))) / 2) + (i * AndroidUtilities.dp(30.0f))) - AndroidUtilities.dp(10.0f);
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
            TextView textView = (TextView) this.characterTextViews.get(length);
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
            TextView textView2 = (TextView) this.dotTextViews.get(length);
            textView2.setTranslationX(getXForTextView(length));
            textView2.setAlpha(0.0f);
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property2, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) property4, AndroidUtilities.dp(20.0f), 0.0f));
            for (int i = length + 1; i < 4; i++) {
                TextView textView3 = (TextView) this.characterTextViews.get(i);
                if (textView3.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property2, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) property3, 0.0f));
                }
                TextView textView4 = (TextView) this.dotTextViews.get(i);
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
                TextView textView5 = (TextView) this.characterTextViews.get(i2);
                float[] fArr2 = {getXForTextView(i2)};
                Property property5 = View.TRANSLATION_X;
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property5, fArr2));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property2, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property3, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, (Property<TextView, Float>) property4, 0.0f));
                TextView textView6 = (TextView) this.dotTextViews.get(i2);
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

        public String getString() {
            return this.stringBuilder.toString();
        }

        public int length() {
            return this.stringBuilder.length();
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
                    TextView textView = (TextView) this.characterTextViews.get(i);
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
                    TextView textView2 = (TextView) this.dotTextViews.get(i);
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
                arrayList.add(ObjectAnimator.ofFloat((TextView) this.characterTextViews.get(i2), (Property<TextView, Float>) property, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat((TextView) this.dotTextViews.get(i2), (Property<TextView, Float>) property, getXForTextView(i2)));
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
                    TextView textView = (TextView) this.characterTextViews.get(i);
                    float alpha = textView.getAlpha();
                    Property property = View.ALPHA;
                    Property property2 = View.SCALE_Y;
                    Property property3 = View.SCALE_X;
                    if (alpha != 0.0f) {
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property3, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property2, 0.0f));
                        arrayList.add(ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) property, 0.0f));
                    }
                    TextView textView2 = (TextView) this.dotTextViews.get(i);
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
                    ((TextView) this.characterTextViews.get(i2)).setAlpha(0.0f);
                    ((TextView) this.dotTextViews.get(i2)).setAlpha(0.0f);
                }
            }
            PasscodeView.this.checkTitle();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
                    TextView textView = (TextView) this.characterTextViews.get(i5);
                    textView.setAlpha(0.0f);
                    textView.setScaleX(1.0f);
                    textView.setScaleY(1.0f);
                    textView.setTranslationY(0.0f);
                    textView.setTranslationX(getXForTextView(i5));
                    TextView textView2 = (TextView) this.dotTextViews.get(i5);
                    textView2.setAlpha(1.0f);
                    textView2.setScaleX(1.0f);
                    textView2.setScaleY(1.0f);
                    textView2.setTranslationY(0.0f);
                    textView2.setTranslationX(getXForTextView(i5));
                } else {
                    ((TextView) this.characterTextViews.get(i5)).setAlpha(0.0f);
                    ((TextView) this.dotTextViews.get(i5)).setAlpha(0.0f);
                }
            }
            super.onLayout(z, i, i2, i3, i4);
        }
    }

    static class InnerAnimator {
        private AnimatorSet animatorSet;
        private float startRadius;

        private InnerAnimator() {
        }
    }

    public PasscodeView(Context context) {
        int i;
        super(context);
        this.BUTTON_X_MARGIN = 28;
        this.BUTTON_Y_MARGIN = 16;
        this.BUTTON_SIZE = 60;
        this.keyboardHeight = 0;
        this.rect = new Rect();
        this.backgroundSpringQueue = new LinkedList();
        this.backgroundSpringNextQueue = new LinkedList();
        this.innerAnimators = new ArrayList();
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
            protected void onDraw(Canvas canvas) {
                if (PasscodeView.this.backgroundDrawable != null) {
                    if ((PasscodeView.this.backgroundDrawable instanceof MotionBackgroundDrawable) || (PasscodeView.this.backgroundDrawable instanceof ColorDrawable) || (PasscodeView.this.backgroundDrawable instanceof GradientDrawable)) {
                        PasscodeView.this.backgroundDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                        PasscodeView.this.backgroundDrawable.draw(canvas);
                    } else {
                        float fMax = Math.max(getMeasuredWidth() / PasscodeView.this.backgroundDrawable.getIntrinsicWidth(), (getMeasuredHeight() + PasscodeView.this.keyboardHeight) / PasscodeView.this.backgroundDrawable.getIntrinsicHeight());
                        int iCeil = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicWidth() * fMax);
                        int iCeil2 = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicHeight() * fMax);
                        int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                        int measuredHeight = ((getMeasuredHeight() - iCeil2) + PasscodeView.this.keyboardHeight) / 2;
                        PasscodeView.this.backgroundDrawable.setBounds(measuredWidth, measuredHeight, iCeil + measuredWidth, iCeil2 + measuredHeight);
                        PasscodeView.this.backgroundDrawable.draw(canvas);
                    }
                } else {
                    super.onDraw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            }

            @Override
            public void setBackgroundColor(int i2) {
                this.paint.setColor(i2);
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
        this.passwordFrameLayout.addView(this.passcodeTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 128.0f));
        TextView textView2 = new TextView(context);
        this.retryTextView = textView2;
        textView2.setTextColor(-1);
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
        this.passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                return PasscodeView.$r8$lambda$8Aeplxlmafs07aBjE7NT6rkAkjk(this.f$0, textView3, i2, keyEvent);
            }
        });
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
        int i2 = R.drawable.bar_selector_lock;
        imageView3.setBackgroundResource(i2);
        this.passwordFrameLayout.addView(this.checkImage, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        this.checkImage.setContentDescription(LocaleController.getString(R.string.Done));
        this.checkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.processDone(false);
            }
        });
        ImageView imageView4 = new ImageView(context);
        this.fingerprintImage = imageView4;
        imageView4.setImageResource(R.drawable.fingerprint);
        this.fingerprintImage.setScaleType(scaleType);
        this.fingerprintImage.setBackgroundResource(i2);
        this.passwordFrameLayout.addView(this.fingerprintImage, LayoutHelper.createFrame(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        this.fingerprintImage.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
        this.fingerprintImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.checkFingerprint();
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
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
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
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 15.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.UnlockToUse));
        this.numbersTitleContainer.addView(textView3, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
        TextView textView4 = new TextView(context);
        this.subtitleView = textView4;
        textView4.setTextSize(1, 14.0f);
        this.subtitleView.setTextColor(-1);
        this.subtitleView.setText(LocaleController.getString(R.string.EnterPINorFingerprint));
        this.numbersTitleContainer.addView(this.subtitleView, LayoutHelper.createFrame(-2, -2.0f, 49, 0.0f, 23.0f, 0.0f, 0.0f));
        this.numberFrameLayouts = new ArrayList(10);
        int i3 = 0;
        while (true) {
            if (i3 >= 12) {
                break;
            }
            PasscodeButton passcodeButton = new PasscodeButton(context);
            ScaleStateListAnimator.apply(passcodeButton, 0.15f, 1.5f);
            passcodeButton.setTag(Integer.valueOf(i3));
            if (i3 == 11) {
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(30.0f), 0, 654311423));
                passcodeButton.setImage(R.drawable.filled_clear);
                passcodeButton.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view2) {
                        return PasscodeView.m2546$r8$lambda$3tFBSsYu3h6UhL7qNVARC6D2nE(this.f$0, view2);
                    }
                });
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrBackspace));
                setNextFocus(passcodeButton, R.id.passcode_btn_0);
            } else if (i3 == 10) {
                this.fingerprintView = passcodeButton;
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(30.0f), 0, 654311423));
                passcodeButton.setContentDescription(LocaleController.getString(R.string.AccDescrFingerprint));
                passcodeButton.setImage(R.drawable.fingerprint);
                setNextFocus(passcodeButton, R.id.passcode_btn_1);
            } else {
                passcodeButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(30.0f), 654311423, 1291845631));
                passcodeButton.setContentDescription(i3 + "");
                passcodeButton.setNum(i3);
                if (i3 == 0) {
                    setNextFocus(passcodeButton, R.id.passcode_btn_backspace);
                } else if (i3 == 9) {
                    if (hasFingerprint()) {
                        setNextFocus(passcodeButton, R.id.passcode_btn_fingerprint);
                    } else {
                        setNextFocus(passcodeButton, R.id.passcode_btn_0);
                    }
                } else {
                    setNextFocus(passcodeButton, ids[i3 + 1]);
                }
            }
            passcodeButton.setId(ids[i3]);
            passcodeButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view2) {
                    PasscodeView.$r8$lambda$NlUHzBjXF_D6_VgUT7Jgxnw7KVU(this.f$0, view2);
                }
            });
            this.numberFrameLayouts.add(passcodeButton);
            i3++;
        }
        for (i = 11; i >= 0; i--) {
            this.numbersFrameLayout.addView((FrameLayout) this.numberFrameLayouts.get(i), LayoutHelper.createFrame(60, 60, 51));
        }
        checkFingerprintButton();
    }

    public static boolean $r8$lambda$8Aeplxlmafs07aBjE7NT6rkAkjk(PasscodeView passcodeView, TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            passcodeView.processDone(false);
            return true;
        }
        passcodeView.getClass();
        return false;
    }

    class AnonymousClass2 implements TextWatcher {
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        AnonymousClass2() {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            final boolean z;
            if (PasscodeView.this.backgroundDrawable instanceof MotionBackgroundDrawable) {
                final MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) PasscodeView.this.backgroundDrawable;
                motionBackgroundDrawable.setAnimationProgressProvider(null);
                float posAnimationProgress = motionBackgroundDrawable.getPosAnimationProgress();
                int i4 = 0;
                boolean z2 = true;
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
                    PasscodeView.this.backgroundSpringQueue.offer(new Runnable() {
                        @Override
                        public final void run() {
                            PasscodeView.AnonymousClass2.$r8$lambda$yIfWbzKcAp1LKqEEcryH9gb8w4w(this.f$0, z, motionBackgroundDrawable);
                        }
                    });
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

        public static void $r8$lambda$yIfWbzKcAp1LKqEEcryH9gb8w4w(AnonymousClass2 anonymousClass2, boolean z, MotionBackgroundDrawable motionBackgroundDrawable) {
            anonymousClass2.getClass();
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
    }

    public static boolean m2546$r8$lambda$3tFBSsYu3h6UhL7qNVARC6D2nE(PasscodeView passcodeView, View view) {
        passcodeView.passwordEditText.setText("");
        passcodeView.passwordEditText2.eraseAllCharacters(true);
        Drawable drawable = passcodeView.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            ((MotionBackgroundDrawable) drawable).switchToPrevPosition(true);
        }
        return true;
    }

    public static void $r8$lambda$NlUHzBjXF_D6_VgUT7Jgxnw7KVU(final PasscodeView passcodeView, View view) {
        boolean zEraseLastCharacter;
        final boolean z;
        if (passcodeView.pinShown) {
            int iIntValue = ((Integer) view.getTag()).intValue();
            int i = 0;
            switch (iIntValue) {
                case 0:
                    passcodeView.passwordEditText2.appendCharacter("0");
                    zEraseLastCharacter = false;
                    break;
                case 1:
                    passcodeView.passwordEditText2.appendCharacter("1");
                    zEraseLastCharacter = false;
                    break;
                case 2:
                    passcodeView.passwordEditText2.appendCharacter("2");
                    zEraseLastCharacter = false;
                    break;
                case 3:
                    passcodeView.passwordEditText2.appendCharacter("3");
                    zEraseLastCharacter = false;
                    break;
                case 4:
                    passcodeView.passwordEditText2.appendCharacter("4");
                    zEraseLastCharacter = false;
                    break;
                case 5:
                    passcodeView.passwordEditText2.appendCharacter("5");
                    zEraseLastCharacter = false;
                    break;
                case 6:
                    passcodeView.passwordEditText2.appendCharacter("6");
                    zEraseLastCharacter = false;
                    break;
                case 7:
                    passcodeView.passwordEditText2.appendCharacter("7");
                    zEraseLastCharacter = false;
                    break;
                case 8:
                    passcodeView.passwordEditText2.appendCharacter("8");
                    zEraseLastCharacter = false;
                    break;
                case 9:
                    passcodeView.passwordEditText2.appendCharacter("9");
                    zEraseLastCharacter = false;
                    break;
                case 10:
                    passcodeView.checkFingerprint();
                    zEraseLastCharacter = false;
                    break;
                case 11:
                    zEraseLastCharacter = passcodeView.passwordEditText2.eraseLastCharacter();
                    break;
                default:
                    zEraseLastCharacter = false;
                    break;
            }
            if (passcodeView.passwordEditText2.length() == 4) {
                passcodeView.processDone(false);
            }
            if (iIntValue == 11) {
                return;
            }
            Drawable drawable = passcodeView.backgroundDrawable;
            if (drawable instanceof MotionBackgroundDrawable) {
                final MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
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
                        passcodeView.animateBackground(motionBackgroundDrawable);
                        return;
                    }
                    passcodeView.backgroundSpringQueue.offer(new Runnable() {
                        @Override
                        public final void run() {
                            PasscodeView.$r8$lambda$ODjCPCt_gcwu6tuWtb2RZAcyXb0(this.f$0, z, motionBackgroundDrawable);
                        }
                    });
                    passcodeView.backgroundSpringNextQueue.offer(Boolean.valueOf(z));
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i2 = 0; i2 < passcodeView.backgroundSpringQueue.size(); i2++) {
                        Runnable runnable = (Runnable) passcodeView.backgroundSpringQueue.get(i2);
                        Boolean bool = (Boolean) passcodeView.backgroundSpringNextQueue.get(i2);
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
                        passcodeView.backgroundSpringQueue.remove((Runnable) obj);
                    }
                    Collections.sort(arrayList2, new Comparator() {
                        @Override
                        public final int compare(Object obj2, Object obj3) {
                            return PasscodeView.$r8$lambda$XwH3rO00AdjVez4H4tXn9ep16PU((Integer) obj2, (Integer) obj3);
                        }
                    });
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        Object obj2 = arrayList2.get(i);
                        i++;
                        passcodeView.backgroundSpringNextQueue.remove(((Integer) obj2).intValue());
                    }
                }
            }
        }
    }

    public static void $r8$lambda$ODjCPCt_gcwu6tuWtb2RZAcyXb0(PasscodeView passcodeView, boolean z, MotionBackgroundDrawable motionBackgroundDrawable) {
        passcodeView.getClass();
        if (z) {
            motionBackgroundDrawable.switchToNextPosition(true);
        } else {
            motionBackgroundDrawable.switchToPrevPosition(true);
        }
        passcodeView.animateBackground(motionBackgroundDrawable);
    }

    public static int $r8$lambda$XwH3rO00AdjVez4H4tXn9ep16PU(Integer num, Integer num2) {
        return num2.intValue() - num.intValue();
    }

    public void animateBackground(final MotionBackgroundDrawable motionBackgroundDrawable) {
        SpringAnimation springAnimation = this.backgroundAnimationSpring;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.backgroundAnimationSpring.cancel();
        }
        final FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        motionBackgroundDrawable.setAnimationProgressProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return Float.valueOf(floatValueHolder.getValue() / 100.0f);
            }
        });
        SpringAnimation spring = new SpringAnimation(floatValueHolder).setSpring(new SpringForce(100.0f).setStiffness(300.0f).setDampingRatio(1.0f));
        this.backgroundAnimationSpring = spring;
        spring.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                PasscodeView.m2544$r8$lambda$1w_uAz6Sj8H2M659bmD393DxjY(this.f$0, motionBackgroundDrawable, dynamicAnimation, z, f, f2);
            }
        });
        this.backgroundAnimationSpring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                motionBackgroundDrawable.updateAnimation();
            }
        });
        this.backgroundAnimationSpring.start();
    }

    public static void m2544$r8$lambda$1w_uAz6Sj8H2M659bmD393DxjY(PasscodeView passcodeView, MotionBackgroundDrawable motionBackgroundDrawable, DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        passcodeView.backgroundAnimationSpring = null;
        motionBackgroundDrawable.setAnimationProgressProvider(null);
        if (z) {
            return;
        }
        motionBackgroundDrawable.setPosAnimationProgress(1.0f);
        if (passcodeView.backgroundSpringQueue.isEmpty()) {
            return;
        }
        ((Runnable) passcodeView.backgroundSpringQueue.poll()).run();
        passcodeView.backgroundSpringNextQueue.poll();
    }

    private void setNextFocus(View view, int i) {
        view.setNextFocusForwardId(i);
        if (Build.VERSION.SDK_INT >= 22) {
            view.setAccessibilityTraversalBefore(i);
        }
    }

    public void setDelegate(PasscodeViewDelegate passcodeViewDelegate) {
        this.delegate = passcodeViewDelegate;
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
        NotificationCenter.getGlobalInstance().postNotificationName(NotificationCenter.didSetPasscode, new Object[0]);
        setOnTouchListener(null);
        PasscodeViewDelegate passcodeViewDelegate = this.delegate;
        if (passcodeViewDelegate != null) {
            passcodeViewDelegate.didAcceptedPassword(this);
        }
        this.imageView.getAnimatedDrawable().setCustomEndFrame(71);
        this.imageView.getAnimatedDrawable().setCurrentFrame(37, false);
        this.imageView.playAnimation();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PasscodeView.m2548$r8$lambda$aSJvweTmOfBKBlaypRJPpD0lI(this.f$0);
            }
        });
    }

    public static void m2548$r8$lambda$aSJvweTmOfBKBlaypRJPpD0lI(final PasscodeView passcodeView) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(passcodeView.shownT, 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PasscodeView.$r8$lambda$uXvUT2VDeosidrMfLoJ6kuJ0xrU(this.f$0, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PasscodeView.this.setVisibility(8);
                PasscodeView.this.onHidden();
                PasscodeView passcodeView2 = PasscodeView.this;
                passcodeView2.onAnimationUpdate(passcodeView2.shownT = 0.0f);
                PasscodeView.this.setAlpha(0.0f);
            }
        });
        valueAnimatorOfFloat.setDuration(420L);
        valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        valueAnimatorOfFloat.start();
    }

    public static void $r8$lambda$uXvUT2VDeosidrMfLoJ6kuJ0xrU(PasscodeView passcodeView, ValueAnimator valueAnimator) {
        passcodeView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        passcodeView.shownT = fFloatValue;
        passcodeView.onAnimationUpdate(fFloatValue);
        passcodeView.setAlpha(passcodeView.shownT);
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
        if (j2 > 0) {
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
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
        if (this.retryTextView.getVisibility() == 0) {
            this.retryTextView.setVisibility(4);
            this.passwordFrameLayout.setVisibility(0);
            showPin(true);
            if (SharedConfig.passcodeType == 1) {
                AndroidUtilities.showKeyboard(this.passwordEditText);
            }
        }
    }

    private void onPasscodeError() {
        BotWebViewVibrationEffect.NOTIFICATION_ERROR.vibrate();
        shakeTextView(2.0f, 0);
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
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        PasscodeView.$r8$lambda$AGkLwZKMMUsJntDEZSpLD4gOXIY(this.f$0);
                    }
                }, 200L);
            }
            checkFingerprint();
        }
    }

    public static void $r8$lambda$AGkLwZKMMUsJntDEZSpLD4gOXIY(PasscodeView passcodeView) {
        EditTextBoldCursor editTextBoldCursor;
        if (passcodeView.retryTextView.getVisibility() == 0 || (editTextBoldCursor = passcodeView.passwordEditText) == null) {
            return;
        }
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(passcodeView.passwordEditText);
    }

    public boolean onBackPressed() {
        KeyboardNotifier keyboardNotifier = this.keyboardNotifier;
        if (keyboardNotifier == null || !keyboardNotifier.keyboardVisible()) {
            return true;
        }
        AndroidUtilities.hideKeyboard(this.passwordEditText);
        return false;
    }

    public void onPause() {
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.passcodeDismissed);
        if (this.keyboardNotifier == null && (getParent() instanceof View)) {
            this.keyboardNotifier = new KeyboardNotifier((View) getParent(), new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    PasscodeView.$r8$lambda$Vrs1xp_tNzl11spFsM3gEMcHLXE(this.f$0, (Integer) obj);
                }
            });
        }
    }

    public static void $r8$lambda$Vrs1xp_tNzl11spFsM3gEMcHLXE(PasscodeView passcodeView, Integer num) {
        float height;
        if (passcodeView.getContext() == null) {
            return;
        }
        boolean z = passcodeView.getContext().getResources().getConfiguration().orientation == 2;
        int iIntValue = num.intValue() - AndroidUtilities.navigationBarHeight;
        if (SharedConfig.passcodeType == 1) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = passcodeView.passwordFrameLayout.animate();
            if (iIntValue <= AndroidUtilities.dp(20.0f)) {
                height = 0.0f;
            } else {
                height = (((passcodeView.getHeight() - iIntValue) / 2.0f) - (passcodeView.passwordFrameLayout.getHeight() / (z ? 1.0f : 2.0f))) - passcodeView.passwordFrameLayout.getTop();
            }
            ViewPropertyAnimator duration = viewPropertyAnimatorAnimate.translationY(height).setDuration(320L);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            duration.setInterpolator(cubicBezierInterpolator).start();
            passcodeView.imageView.animate().alpha(iIntValue > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(cubicBezierInterpolator);
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.passcodeDismissed);
    }

    public void showPin(final boolean z) {
        ValueAnimator valueAnimator = this.pinAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.pinShown = z;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.numbersFrameLayout.getAlpha(), z ? 1.0f : 0.0f);
        this.pinAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                PasscodeView.m2545$r8$lambda$2Fli5gQf7dRPfhA6cm6fXWN1L4(this.f$0, valueAnimator2);
            }
        });
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

    public static void m2545$r8$lambda$2Fli5gQf7dRPfhA6cm6fXWN1L4(PasscodeView passcodeView, ValueAnimator valueAnimator) {
        passcodeView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        passcodeView.numbersFrameLayout.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
        passcodeView.numbersFrameLayout.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
        passcodeView.numbersFrameLayout.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
        passcodeView.passcodeTextView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
        passcodeView.passcodeTextView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
        passcodeView.passcodeTextView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fFloatValue));
        passcodeView.passwordEditText2.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
    }

    public void checkFingerprint() {
        Activity activityFindActivity;
        if (Build.VERSION.SDK_INT >= 23 && (activityFindActivity = AndroidUtilities.findActivity(getContext())) != null && this.fingerprintView.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            if (!(activityFindActivity instanceof LaunchActivity) || ((LaunchActivity) activityFindActivity).allowShowFingerprintDialog(this)) {
                try {
                    if (BiometricManager.from(getContext()).canAuthenticate(15) == 0 && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                        new BiometricPrompt(LaunchActivity.instance, ContextCompat.getMainExecutor(getContext()), new BiometricPrompt.AuthenticationCallback() {
                            @Override
                            public void onAuthenticationError(int i, CharSequence charSequence) {
                                FileLog.d("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                                PasscodeView.this.showPin(true);
                            }

                            @Override
                            public void onAuthenticationSucceeded(BiometricPrompt.AuthenticationResult authenticationResult) {
                                FileLog.d("PasscodeView onAuthenticationSucceeded");
                                PasscodeView.this.processDone(true);
                            }

                            @Override
                            public void onAuthenticationFailed() {
                                FileLog.d("PasscodeView onAuthenticationFailed");
                                PasscodeView.this.showPin(true);
                            }
                        }).authenticate(new BiometricPrompt.PromptInfo.Builder().setTitle(LocaleController.getString(R.string.UnlockToUse)).setNegativeButtonText(LocaleController.getString(R.string.UsePIN)).setAllowedAuthenticators(15).build());
                        showPin(false);
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        }
    }

    public void onShow(boolean z, boolean z2) {
        onShow(z, z2, -1, -1, null, null);
    }

    private boolean hasFingerprint() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        if (Build.VERSION.SDK_INT >= 23 && activityFindActivity != null && SharedConfig.useFingerprintLock) {
            try {
                FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(ApplicationLoader.applicationContext);
                return fingerprintManagerCompatFrom.isHardwareDetected() && fingerprintManagerCompatFrom.hasEnrolledFingerprints() && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        return false;
    }

    private void checkFingerprintButton() {
        Activity activityFindActivity = AndroidUtilities.findActivity(getContext());
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 23 && activityFindActivity != null && SharedConfig.useFingerprintLock) {
            try {
                FingerprintManagerCompat fingerprintManagerCompatFrom = FingerprintManagerCompat.from(ApplicationLoader.applicationContext);
                if (fingerprintManagerCompatFrom.isHardwareDetected() && fingerprintManagerCompatFrom.hasEnrolledFingerprints() && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
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
        } else {
            this.fingerprintView.setVisibility(8);
        }
        if (SharedConfig.passcodeType == 1) {
            this.fingerprintImage.setVisibility(this.fingerprintView.getVisibility());
        }
        this.subtitleView.setText(LocaleController.getString(z ? R.string.EnterPINorFingerprint : R.string.EnterPIN));
    }

    public void onShow(boolean z, boolean z2, int i, int i2, Runnable runnable, Runnable runnable2) {
        View currentFocus;
        boolean z3;
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
        this.backgroundDrawable = null;
        this.backgroundFrameLayoutColor = 0;
        if (Theme.getCachedWallpaper() instanceof MotionBackgroundDrawable) {
            z3 = !Theme.isCurrentThemeDark();
            this.backgroundDrawable = Theme.getCachedWallpaper();
            FrameLayout frameLayout = this.backgroundFrameLayout;
            this.backgroundFrameLayoutColor = -1090519040;
            frameLayout.setBackgroundColor(-1090519040);
        } else {
            if (Theme.isCustomTheme() && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(Theme.getSelectedBackgroundSlug()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(Theme.getSelectedBackgroundSlug())) {
                BackgroundGradientDrawable currentGradientWallpaper = Theme.getCurrentGradientWallpaper();
                this.backgroundDrawable = currentGradientWallpaper;
                if (currentGradientWallpaper == null) {
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
            } else if ("d".equals(Theme.getSelectedBackgroundSlug()) || Theme.isPatternWallpaper()) {
                FrameLayout frameLayout4 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = -11436898;
                frameLayout4.setBackgroundColor(-11436898);
            } else {
                Drawable cachedWallpaper = Theme.getCachedWallpaper();
                this.backgroundDrawable = cachedWallpaper;
                if (cachedWallpaper instanceof BackgroundGradientDrawable) {
                    FrameLayout frameLayout5 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = 570425344;
                    frameLayout5.setBackgroundColor(570425344);
                } else if (cachedWallpaper != null) {
                    FrameLayout frameLayout6 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = -1090519040;
                    frameLayout6.setBackgroundColor(-1090519040);
                } else {
                    FrameLayout frameLayout7 = this.backgroundFrameLayout;
                    this.backgroundFrameLayoutColor = -11436898;
                    frameLayout7.setBackgroundColor(-11436898);
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
                for (int i3 = 0; i3 < colors.length; i3++) {
                    iArr[i3] = Theme.adaptHSV(colors[i3], 0.14f, 0.0f);
                }
                colors = iArr;
            }
            this.backgroundDrawable = new MotionBackgroundDrawable(colors[0], colors[1], colors[2], colors[3], false);
            if (motionBackgroundDrawable.hasPattern() && motionBackgroundDrawable.getIntensity() < 0) {
                FrameLayout frameLayout8 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = 2130706432;
                frameLayout8.setBackgroundColor(2130706432);
            } else {
                FrameLayout frameLayout9 = this.backgroundFrameLayout;
                this.backgroundFrameLayoutColor = 570425344;
                frameLayout9.setBackgroundColor(570425344);
            }
            ((MotionBackgroundDrawable) this.backgroundDrawable).setParentView(this.backgroundFrameLayout);
        }
        this.passcodeTextView.setText(LocaleController.getString(R.string.AppLocked));
        int i4 = SharedConfig.passcodeType;
        if (i4 == 0) {
            if (this.retryTextView.getVisibility() != 0) {
                this.numbersFrameLayout.setVisibility(0);
            }
            this.passwordEditText.setVisibility(8);
            this.passwordEditText2.setVisibility(0);
            this.checkImage.setVisibility(8);
            this.fingerprintImage.setVisibility(8);
        } else if (i4 == 1) {
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
        setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return PasscodeView.$r8$lambda$H5Dfq1BJIWmILnuepA0ZvnztQII(view, motionEvent);
            }
        });
    }

    class AnonymousClass9 implements ViewTreeObserver.OnGlobalLayoutListener {
        final Runnable val$onShow;
        final int val$x;
        final int val$y;

        AnonymousClass9(int i, int i2, Runnable runnable) {
            this.val$x = i;
            this.val$y = i2;
            this.val$onShow = runnable;
        }

        @Override
        public void onGlobalLayout() {
            float f;
            int iDp;
            char c;
            char c2;
            PasscodeView.this.setAlpha(1.0f);
            PasscodeView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            char c3 = 0;
            PasscodeView.this.imageView.getAnimatedDrawable().setCurrentFrame(0, false);
            PasscodeView.this.imageView.getAnimatedDrawable().setCustomEndFrame(37);
            PasscodeView.this.imageView.playAnimation();
            int i = 1;
            PasscodeView.this.showPin(true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PasscodeView.AnonymousClass9.$r8$lambda$toWN5b4EL0NI5wepuMSu6ZsPiD0(this.f$0);
                }
            }, 350L);
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i2 = point.x;
            int i3 = point.y + AndroidUtilities.statusBarHeight;
            int i4 = i2 - this.val$x;
            int i5 = i3 - this.val$y;
            double dSqrt = Math.sqrt((i4 * i4) + (i5 * i5));
            int i6 = this.val$x;
            int i7 = i3 - this.val$y;
            double dSqrt2 = Math.sqrt((i6 * i6) + (i7 * i7));
            int i8 = this.val$x;
            int i9 = this.val$y;
            double dSqrt3 = Math.sqrt((i8 * i8) + (i9 * i9));
            int i10 = i2 - this.val$x;
            int i11 = this.val$y;
            final double dMax = Math.max(Math.max(Math.max(dSqrt, dSqrt2), dSqrt3), Math.sqrt((i10 * i10) + (i11 * i11)));
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
                int measuredWidth = PasscodeView.this.pos[c3] + (childAt.getMeasuredWidth() / 2);
                int measuredHeight = PasscodeView.this.pos[i] + (childAt.getMeasuredHeight() / 2);
                int i13 = this.val$x - measuredWidth;
                int i14 = this.val$y - measuredHeight;
                innerAnimator.startRadius = ((float) Math.sqrt((i13 * i13) + (i14 * i14))) - AndroidUtilities.dp(40.0f);
                if (i12 != -1) {
                    animatorSet2 = new AnimatorSet();
                    Property property = View.SCALE_X;
                    float[] fArr = new float[i];
                    fArr[c3] = 1.0f;
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property, fArr);
                    Property property2 = View.SCALE_Y;
                    c = 0;
                    float[] fArr2 = new float[i];
                    fArr2[0] = 1.0f;
                    c2 = 1;
                    animatorSet2.playTogether(objectAnimatorOfFloat, ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property2, fArr2));
                    animatorSet2.setDuration(140L);
                    animatorSet2.setInterpolator(new DecelerateInterpolator());
                } else {
                    c = 0;
                    c2 = 1;
                }
                innerAnimator.animatorSet = new AnimatorSet();
                AnimatorSet animatorSet3 = innerAnimator.animatorSet;
                Property property3 = View.SCALE_X;
                float f2 = i12 == -1 ? 0.9f : 0.6f;
                float f3 = i12 == -1 ? 1.0f : 1.04f;
                float[] fArr3 = new float[2];
                fArr3[c] = f2;
                fArr3[c2] = f3;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property3, fArr3);
                Property property4 = View.SCALE_Y;
                float f4 = i12 == -1 ? 0.9f : 0.6f;
                float f5 = i12 == -1 ? 1.0f : 1.04f;
                float[] fArr4 = new float[2];
                fArr4[c] = f4;
                fArr4[c2] = f5;
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) property4, fArr4);
                int i15 = childCount;
                ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(childAt, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f);
                Animator[] animatorArr = new Animator[3];
                animatorArr[c] = objectAnimatorOfFloat2;
                animatorArr[c2] = objectAnimatorOfFloat3;
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
                c3 = 0;
                i = 1;
            }
            arrayList.add(ObjectAnimator.ofFloat(PasscodeView.this.backgroundFrameLayout, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            arrayList.add(valueAnimatorOfFloat);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PasscodeView.AnonymousClass9.$r8$lambda$_NbAib0NkyzfFz1PIwilEJyKkoQ(this.f$0, dMax, valueAnimator);
                }
            });
            TimeInterpolator timeInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            animatorSet.setInterpolator(timeInterpolator);
            animatorSet.setDuration(500L);
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(PasscodeView.this.shownT, 1.0f);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PasscodeView.AnonymousClass9.m2549$r8$lambda$vqfHCGUP_1YQr8FSjoTpBXL7KQ(this.f$0, valueAnimator);
                }
            });
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
            if (!AndroidUtilities.isTablet() && PasscodeView.this.getContext().getResources().getConfiguration().orientation == 2) {
                f = (SharedConfig.passcodeType == 0 ? i2 / 2.0f : i2) / 2.0f;
                iDp = AndroidUtilities.dp(30.0f);
            } else {
                f = i2 / 2.0f;
                iDp = AndroidUtilities.dp(29.0f);
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.TRANSLATION_X, this.val$x - AndroidUtilities.dp(29.0f), f - iDp), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.TRANSLATION_Y, this.val$y - AndroidUtilities.dp(29.0f), PasscodeView.this.imageY), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(PasscodeView.this.imageView, (Property<RLottieImageView, Float>) View.SCALE_Y, 0.5f, 1.0f));
            animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet4.start();
        }

        public static void $r8$lambda$toWN5b4EL0NI5wepuMSu6ZsPiD0(AnonymousClass9 anonymousClass9) {
            anonymousClass9.getClass();
            try {
                PasscodeView.this.imageView.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }

        public static void $r8$lambda$_NbAib0NkyzfFz1PIwilEJyKkoQ(AnonymousClass9 anonymousClass9, double d, ValueAnimator valueAnimator) {
            anonymousClass9.getClass();
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

        public static void m2549$r8$lambda$vqfHCGUP_1YQr8FSjoTpBXL7KQ(AnonymousClass9 anonymousClass9, ValueAnimator valueAnimator) {
            PasscodeView passcodeView = PasscodeView.this;
            passcodeView.onAnimationUpdate(passcodeView.shownT = ((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int iDp;
        float f;
        float f2;
        int size = View.MeasureSpec.getSize(i);
        int iDp2 = AndroidUtilities.displaySize.y;
        int iDp3 = AndroidUtilities.dp(28.0f);
        int iDp4 = AndroidUtilities.dp(16.0f);
        int iDp5 = AndroidUtilities.dp(60.0f);
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
            layoutParams.topMargin = ((iDp2 - AndroidUtilities.dp(140.0f)) / 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(f) : 0);
            this.passwordFrameLayout.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.numbersContainer.getLayoutParams();
            layoutParams2.height = iDp2;
            int i4 = size / 2;
            layoutParams2.leftMargin = i4;
            layoutParams2.topMargin = AndroidUtilities.statusBarHeight;
            layoutParams2.width = i4;
            this.numbersContainer.setLayoutParams(layoutParams2);
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams3.height = AndroidUtilities.dp(82.0f) + (iDp5 * 4) + (Math.max(0, 3) * iDp4);
            layoutParams3.width = (iDp5 * 3) + (Math.max(0, 2) * iDp3);
            layoutParams3.gravity = 17;
            this.numbersFrameLayout.setLayoutParams(layoutParams3);
        } else {
            this.imageView.setTranslationX((size / 2.0f) - AndroidUtilities.dp(29.0f));
            int iDp6 = AndroidUtilities.statusBarHeight;
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.dp(498.0f)) {
                    iDp = (size - AndroidUtilities.dp(498.0f)) / 2;
                    size = AndroidUtilities.dp(498.0f);
                } else {
                    iDp = 0;
                }
                if (iDp2 > AndroidUtilities.dp(528.0f)) {
                    iDp6 = (iDp2 - AndroidUtilities.dp(528.0f)) / 2;
                    iDp2 = AndroidUtilities.dp(528.0f);
                }
            } else {
                iDp = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams4.height = (iDp2 / 3) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.dp(40.0f) : 0);
            layoutParams4.width = size;
            layoutParams4.topMargin = iDp6;
            layoutParams4.leftMargin = iDp;
            this.passwordFrameLayout.setTag(Integer.valueOf(iDp6));
            this.passwordFrameLayout.setLayoutParams(layoutParams4);
            int i5 = layoutParams4.topMargin + layoutParams4.height;
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams5.height = AndroidUtilities.dp(82.0f) + (iDp5 * 4) + (Math.max(0, 3) * iDp4);
            layoutParams5.width = (iDp5 * 3) + (Math.max(0, 2) * iDp3);
            if (AndroidUtilities.isTablet()) {
                layoutParams5.gravity = 17;
            } else {
                layoutParams5.gravity = 49;
            }
            this.numbersFrameLayout.setLayoutParams(layoutParams5);
            int i6 = iDp2 - layoutParams5.height;
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) this.numbersContainer.getLayoutParams();
            layoutParams6.leftMargin = iDp;
            if (AndroidUtilities.isTablet()) {
                layoutParams6.topMargin = (iDp2 - i6) / 2;
            } else {
                layoutParams6.topMargin = i5;
            }
            layoutParams6.width = size;
            layoutParams6.height = -1;
            this.numbersContainer.setLayoutParams(layoutParams6);
        }
        int iDp7 = AndroidUtilities.dp(z ? 52.0f : 82.0f);
        while (i3 < 12) {
            int i7 = 10;
            if (i3 != 0) {
                if (i3 == 10) {
                    i7 = 11;
                } else {
                    i7 = i3 == 11 ? 9 : i3 - 1;
                }
            }
            FrameLayout frameLayout = (FrameLayout) this.numberFrameLayouts.get(i3);
            FrameLayout.LayoutParams layoutParams7 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams7.topMargin = ((iDp5 + iDp4) * (i7 / 3)) + iDp7;
            layoutParams7.leftMargin = (iDp5 + iDp3) * (i7 % 3);
            frameLayout.setLayoutParams(layoutParams7);
            i3++;
        }
        super.onMeasure(i, i2);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
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
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
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
    }
}
