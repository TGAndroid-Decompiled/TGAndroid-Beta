package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
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
import android.os.Vibrator;
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
import android.view.ViewAnimationUtils;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.p002os.CancellationSignal;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatValueHolder;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FingerprintController;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.support.fingerprint.FingerprintManagerCompat;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.PasscodeView;
import org.telegram.tgnet.ConnectionsManager;

public class PasscodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final int[] ids = {C1072R.C1074id.passcode_btn_0, C1072R.C1074id.passcode_btn_1, C1072R.C1074id.passcode_btn_2, C1072R.C1074id.passcode_btn_3, C1072R.C1074id.passcode_btn_4, C1072R.C1074id.passcode_btn_5, C1072R.C1074id.passcode_btn_6, C1072R.C1074id.passcode_btn_7, C1072R.C1074id.passcode_btn_8, C1072R.C1074id.passcode_btn_9, C1072R.C1074id.passcode_btn_backspace, C1072R.C1074id.passcode_btn_fingerprint};
    private SpringAnimation backgroundAnimationSpring;
    private Drawable backgroundDrawable;
    private FrameLayout backgroundFrameLayout;
    private LinkedList<Boolean> backgroundSpringNextQueue;
    private LinkedList<Runnable> backgroundSpringQueue;
    private CancellationSignal cancellationSignal;
    private ImageView checkImage;
    private Runnable checkRunnable;
    private PasscodeViewDelegate delegate;
    private ImageView eraseView;
    private AlertDialog fingerprintDialog;
    private ImageView fingerprintImage;
    private ImageView fingerprintImageView;
    private TextView fingerprintStatusTextView;
    private ImageView fingerprintView;
    private RLottieImageView imageView;
    private int imageY;
    private ArrayList<InnerAnimator> innerAnimators;
    private int keyboardHeight;
    private int lastValue;
    private ArrayList<TextView> lettersTextViews;
    private ArrayList<FrameLayout> numberFrameLayouts;
    private ArrayList<TextView> numberTextViews;
    private FrameLayout numbersFrameLayout;
    private TextView passcodeTextView;
    private EditTextBoldCursor passwordEditText;
    private AnimatingTextView passwordEditText2;
    private FrameLayout passwordFrameLayout;
    private int[] pos;
    private Rect rect;
    private TextView retryTextView;
    private boolean selfCancelled;

    public interface PasscodeViewDelegate {
        void didAcceptedPassword();
    }

    public static boolean lambda$onShow$13(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.didGenerateFingerprintKeyPair) {
            checkFingerprintButton();
            if (((Boolean) objArr[0]).booleanValue() && SharedConfig.appLocked) {
                checkFingerprint();
            }
        }
    }

    public static class AnimatingTextView extends FrameLayout {
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
                textView.setTextSize(1, 36.0f);
                textView.setGravity(17);
                textView.setAlpha(0.0f);
                textView.setPivotX(AndroidUtilities.m36dp(25.0f));
                textView.setPivotY(AndroidUtilities.m36dp(25.0f));
                addView(textView, LayoutHelper.createFrame(50, 50, 51));
                this.characterTextViews.add(textView);
                TextView textView2 = new TextView(context);
                textView2.setTextColor(-1);
                textView2.setTextSize(1, 36.0f);
                textView2.setGravity(17);
                textView2.setAlpha(0.0f);
                textView2.setText("•");
                textView2.setPivotX(AndroidUtilities.m36dp(25.0f));
                textView2.setPivotY(AndroidUtilities.m36dp(25.0f));
                addView(textView2, LayoutHelper.createFrame(50, 50, 51));
                this.dotTextViews.add(textView2);
            }
        }

        private int getXForTextView(int i) {
            return (((getMeasuredWidth() - (this.stringBuilder.length() * AndroidUtilities.m36dp(30.0f))) / 2) + (i * AndroidUtilities.m36dp(30.0f))) - AndroidUtilities.m36dp(10.0f);
        }

        public void appendCharacter(String str) {
            if (this.stringBuilder.length() == 4) {
                return;
            }
            try {
                performHapticFeedback(3);
            } catch (Exception e) {
                FileLog.m32e(e);
            }
            ArrayList arrayList = new ArrayList();
            final int length = this.stringBuilder.length();
            this.stringBuilder.append(str);
            TextView textView = this.characterTextViews.get(length);
            textView.setText(str);
            textView.setTranslationX(getXForTextView(length));
            arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_X, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_Y, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, AndroidUtilities.m36dp(20.0f), 0.0f));
            TextView textView2 = this.dotTextViews.get(length);
            textView2.setTranslationX(getXForTextView(length));
            textView2.setAlpha(0.0f);
            arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_X, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_Y, 0.0f, 1.0f));
            arrayList.add(ObjectAnimator.ofFloat(textView2, View.TRANSLATION_Y, AndroidUtilities.m36dp(20.0f), 0.0f));
            for (int i = length + 1; i < 4; i++) {
                TextView textView3 = this.characterTextViews.get(i);
                if (textView3.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView3, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView3, View.ALPHA, 0.0f));
                }
                TextView textView4 = this.dotTextViews.get(i);
                if (textView4.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView4, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView4, View.ALPHA, 0.0f));
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
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, View.SCALE_X, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, View.SCALE_Y, 0.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView5, View.ALPHA, 0.0f));
                    TextView textView6 = (TextView) AnimatingTextView.this.dotTextViews.get(length);
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, View.SCALE_X, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, View.SCALE_Y, 1.0f));
                    arrayList2.add(ObjectAnimator.ofFloat(textView6, View.ALPHA, 1.0f));
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
                arrayList.add(ObjectAnimator.ofFloat(textView5, View.TRANSLATION_X, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat(textView5, View.SCALE_X, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, View.SCALE_Y, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, View.ALPHA, 0.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView5, View.TRANSLATION_Y, 0.0f));
                TextView textView6 = this.dotTextViews.get(i2);
                arrayList.add(ObjectAnimator.ofFloat(textView6, View.TRANSLATION_X, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat(textView6, View.SCALE_X, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, View.SCALE_Y, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, View.ALPHA, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(textView6, View.TRANSLATION_Y, 0.0f));
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
        }

        public String getString() {
            return this.stringBuilder.toString();
        }

        public int length() {
            return this.stringBuilder.length();
        }

        public boolean eraseLastCharacter() {
            if (this.stringBuilder.length() == 0) {
                return false;
            }
            try {
                performHapticFeedback(3);
            } catch (Exception e) {
                FileLog.m32e(e);
            }
            ArrayList arrayList = new ArrayList();
            int length = this.stringBuilder.length() - 1;
            if (length != 0) {
                this.stringBuilder.deleteCharAt(length);
            }
            for (int i = length; i < 4; i++) {
                TextView textView = this.characterTextViews.get(i);
                if (textView.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.TRANSLATION_X, getXForTextView(i)));
                }
                TextView textView2 = this.dotTextViews.get(i);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.ALPHA, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.TRANSLATION_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.TRANSLATION_X, getXForTextView(i)));
                }
            }
            if (length == 0) {
                this.stringBuilder.deleteCharAt(length);
            }
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(ObjectAnimator.ofFloat(this.characterTextViews.get(i2), View.TRANSLATION_X, getXForTextView(i2)));
                arrayList.add(ObjectAnimator.ofFloat(this.dotTextViews.get(i2), View.TRANSLATION_X, getXForTextView(i2)));
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
            if (!z) {
                for (int i = 0; i < 4; i++) {
                    this.characterTextViews.get(i).setAlpha(0.0f);
                    this.dotTextViews.get(i).setAlpha(0.0f);
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 4; i2++) {
                TextView textView = this.characterTextViews.get(i2);
                if (textView.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView, View.ALPHA, 0.0f));
                }
                TextView textView2 = this.dotTextViews.get(i2);
                if (textView2.getAlpha() != 0.0f) {
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_X, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.SCALE_Y, 0.0f));
                    arrayList.add(ObjectAnimator.ofFloat(textView2, View.ALPHA, 0.0f));
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

    public static class InnerAnimator {
        private AnimatorSet animatorSet;
        private float startRadius;

        private InnerAnimator() {
        }
    }

    public PasscodeView(Context context) {
        super(context);
        char c = 0;
        this.keyboardHeight = 0;
        this.rect = new Rect();
        this.backgroundSpringQueue = new LinkedList<>();
        this.backgroundSpringNextQueue = new LinkedList<>();
        this.innerAnimators = new ArrayList<>();
        this.checkRunnable = new Runnable() {
            @Override
            public void run() {
                PasscodeView.this.checkRetryTextView();
                AndroidUtilities.runOnUIThread(PasscodeView.this.checkRunnable, 100L);
            }
        };
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
                        float max = Math.max(getMeasuredWidth() / PasscodeView.this.backgroundDrawable.getIntrinsicWidth(), (getMeasuredHeight() + PasscodeView.this.keyboardHeight) / PasscodeView.this.backgroundDrawable.getIntrinsicHeight());
                        int ceil = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicWidth() * max);
                        int ceil2 = (int) Math.ceil(PasscodeView.this.backgroundDrawable.getIntrinsicHeight() * max);
                        int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                        int measuredHeight = ((getMeasuredHeight() - ceil2) + PasscodeView.this.keyboardHeight) / 2;
                        PasscodeView.this.backgroundDrawable.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                        PasscodeView.this.backgroundDrawable.draw(canvas);
                    }
                } else {
                    super.onDraw(canvas);
                }
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.paint);
            }

            @Override
            public void setBackgroundColor(int i) {
                this.paint.setColor(i);
            }
        };
        this.backgroundFrameLayout = frameLayout;
        frameLayout.setWillNotDraw(false);
        int i = -1;
        addView(this.backgroundFrameLayout, LayoutHelper.createFrame(-1, -1.0f));
        RLottieImageView rLottieImageView = new RLottieImageView(context);
        this.imageView = rLottieImageView;
        rLottieImageView.setAnimation(C1072R.raw.passcode_lock_close, 58, 58);
        this.imageView.setAutoRepeat(false);
        addView(this.imageView, LayoutHelper.createFrame(58, 58, 51));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.passwordFrameLayout = frameLayout2;
        this.backgroundFrameLayout.addView(frameLayout2, LayoutHelper.createFrame(-1, -1.0f));
        TextView textView = new TextView(context);
        this.passcodeTextView = textView;
        textView.setTextColor(-1);
        this.passcodeTextView.setTextSize(1, 14.0f);
        this.passcodeTextView.setGravity(1);
        this.passwordFrameLayout.addView(this.passcodeTextView, LayoutHelper.createFrame(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 74.0f));
        TextView textView2 = new TextView(context);
        this.retryTextView = textView2;
        textView2.setTextColor(-1);
        this.retryTextView.setTextSize(1, 15.0f);
        this.retryTextView.setGravity(1);
        this.retryTextView.setVisibility(4);
        this.backgroundFrameLayout.addView(this.retryTextView, LayoutHelper.createFrame(-2, -2, 17));
        AnimatingTextView animatingTextView = new AnimatingTextView(context);
        this.passwordEditText2 = animatingTextView;
        this.passwordFrameLayout.addView(animatingTextView, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 6.0f));
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
        this.passwordEditText.setCursorSize(AndroidUtilities.m36dp(32.0f));
        this.passwordFrameLayout.addView(this.passwordEditText, LayoutHelper.createFrame(-1, -2.0f, 81, 70.0f, 0.0f, 70.0f, 0.0f));
        this.passwordEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public final boolean onEditorAction(TextView textView3, int i2, KeyEvent keyEvent) {
                boolean lambda$new$0;
                lambda$new$0 = PasscodeView.this.lambda$new$0(textView3, i2, keyEvent);
                return lambda$new$0;
            }
        });
        this.passwordEditText.addTextChangedListener(new C25242());
        this.passwordEditText.setCustomSelectionActionModeCallback(new ActionMode.Callback(this) {
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
        imageView.setImageResource(C1072R.C1073drawable.passcode_check);
        this.checkImage.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.checkImage;
        int i2 = C1072R.C1073drawable.bar_selector_lock;
        imageView2.setBackgroundResource(i2);
        this.passwordFrameLayout.addView(this.checkImage, LayoutHelper.createFrame(60, 60.0f, 85, 0.0f, 0.0f, 10.0f, 4.0f));
        this.checkImage.setContentDescription(LocaleController.getString("Done", C1072R.string.Done));
        this.checkImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PasscodeView.this.lambda$new$1(view);
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.fingerprintImage = imageView3;
        imageView3.setImageResource(C1072R.C1073drawable.fingerprint);
        this.fingerprintImage.setScaleType(ImageView.ScaleType.CENTER);
        this.fingerprintImage.setBackgroundResource(i2);
        this.passwordFrameLayout.addView(this.fingerprintImage, LayoutHelper.createFrame(60, 60.0f, 83, 10.0f, 0.0f, 0.0f, 4.0f));
        this.fingerprintImage.setContentDescription(LocaleController.getString("AccDescrFingerprint", C1072R.string.AccDescrFingerprint));
        this.fingerprintImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                PasscodeView.this.lambda$new$2(view);
            }
        });
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setBackgroundColor(654311423);
        this.passwordFrameLayout.addView(frameLayout3, LayoutHelper.createFrame(-1, 1.0f, 83, 20.0f, 0.0f, 20.0f, 0.0f));
        FrameLayout frameLayout4 = new FrameLayout(context);
        this.numbersFrameLayout = frameLayout4;
        this.backgroundFrameLayout.addView(frameLayout4, LayoutHelper.createFrame(-1, -1, 51));
        this.lettersTextViews = new ArrayList<>(10);
        this.numberTextViews = new ArrayList<>(10);
        this.numberFrameLayouts = new ArrayList<>(10);
        int i3 = 0;
        while (i3 < 10) {
            TextView textView3 = new TextView(context);
            textView3.setTextColor(i);
            textView3.setTextSize(1, 36.0f);
            textView3.setGravity(17);
            Locale locale = Locale.US;
            Object[] objArr = new Object[1];
            objArr[c] = Integer.valueOf(i3);
            textView3.setText(String.format(locale, "%d", objArr));
            this.numbersFrameLayout.addView(textView3, LayoutHelper.createFrame(50, 50, 51));
            textView3.setImportantForAccessibility(2);
            this.numberTextViews.add(textView3);
            TextView textView4 = new TextView(context);
            textView4.setTextSize(1, 12.0f);
            textView4.setTextColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
            textView4.setGravity(17);
            this.numbersFrameLayout.addView(textView4, LayoutHelper.createFrame(50, 50, 51));
            textView4.setImportantForAccessibility(2);
            if (i3 == 0) {
                textView4.setText("+");
            } else {
                switch (i3) {
                    case 2:
                        textView4.setText("ABC");
                        continue;
                    case 3:
                        textView4.setText("DEF");
                        continue;
                    case 4:
                        textView4.setText("GHI");
                        continue;
                    case 5:
                        textView4.setText("JKL");
                        continue;
                    case 6:
                        textView4.setText("MNO");
                        continue;
                    case 7:
                        textView4.setText("PQRS");
                        continue;
                    case 8:
                        textView4.setText("TUV");
                        continue;
                    case 9:
                        textView4.setText("WXYZ");
                        continue;
                }
            }
            this.lettersTextViews.add(textView4);
            i3++;
            c = 0;
            i = -1;
        }
        ImageView imageView4 = new ImageView(context);
        this.eraseView = imageView4;
        imageView4.setScaleType(ImageView.ScaleType.CENTER);
        this.eraseView.setImageResource(C1072R.C1073drawable.passcode_delete);
        this.numbersFrameLayout.addView(this.eraseView, LayoutHelper.createFrame(50, 50, 51));
        ImageView imageView5 = new ImageView(context);
        this.fingerprintView = imageView5;
        imageView5.setScaleType(ImageView.ScaleType.CENTER);
        this.fingerprintView.setImageResource(C1072R.C1073drawable.fingerprint);
        this.fingerprintView.setVisibility(8);
        this.numbersFrameLayout.addView(this.fingerprintView, LayoutHelper.createFrame(50, 50, 51));
        checkFingerprintButton();
        int i4 = 0;
        while (true) {
            if (i4 >= 12) {
                for (int i5 = 11; i5 >= 0; i5--) {
                    this.numbersFrameLayout.addView(this.numberFrameLayouts.get(i5), LayoutHelper.createFrame(100, 100, 51));
                }
                return;
            }
            FrameLayout frameLayout5 = new FrameLayout(this, context) {
                @Override
                public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                    super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                    accessibilityNodeInfo.setClassName("android.widget.Button");
                }
            };
            frameLayout5.setBackgroundResource(C1072R.C1073drawable.bar_selector_lock);
            frameLayout5.setTag(Integer.valueOf(i4));
            if (i4 == 11) {
                frameLayout5.setContentDescription(LocaleController.getString("AccDescrFingerprint", C1072R.string.AccDescrFingerprint));
                setNextFocus(frameLayout5, C1072R.C1074id.passcode_btn_0);
            } else if (i4 == 10) {
                frameLayout5.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public final boolean onLongClick(View view) {
                        boolean lambda$new$3;
                        lambda$new$3 = PasscodeView.this.lambda$new$3(view);
                        return lambda$new$3;
                    }
                });
                frameLayout5.setContentDescription(LocaleController.getString("AccDescrBackspace", C1072R.string.AccDescrBackspace));
                setNextFocus(frameLayout5, C1072R.C1074id.passcode_btn_1);
            } else {
                frameLayout5.setContentDescription(i4 + "");
                if (i4 == 0) {
                    setNextFocus(frameLayout5, C1072R.C1074id.passcode_btn_backspace);
                } else if (i4 == 9) {
                    if (this.fingerprintView.getVisibility() == 0) {
                        setNextFocus(frameLayout5, C1072R.C1074id.passcode_btn_fingerprint);
                    } else {
                        setNextFocus(frameLayout5, C1072R.C1074id.passcode_btn_0);
                    }
                } else {
                    setNextFocus(frameLayout5, ids[i4 + 1]);
                }
            }
            frameLayout5.setId(ids[i4]);
            frameLayout5.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PasscodeView.this.lambda$new$6(view);
                }
            });
            this.numberFrameLayouts.add(frameLayout5);
            i4++;
        }
    }

    public boolean lambda$new$0(TextView textView, int i, KeyEvent keyEvent) {
        if (i == 6) {
            processDone(false);
            return true;
        }
        return false;
    }

    public class C25242 implements TextWatcher {
        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        C25242() {
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            final boolean z;
            if (PasscodeView.this.backgroundDrawable instanceof MotionBackgroundDrawable) {
                final MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) PasscodeView.this.backgroundDrawable;
                motionBackgroundDrawable.setAnimationProgressProvider(null);
                float posAnimationProgress = motionBackgroundDrawable.getPosAnimationProgress();
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
                            PasscodeView.C25242.this.lambda$beforeTextChanged$0(z, motionBackgroundDrawable);
                        }
                    });
                    PasscodeView.this.backgroundSpringNextQueue.offer(Boolean.valueOf(z));
                    ArrayList<Runnable> arrayList = new ArrayList();
                    ArrayList<Integer> arrayList2 = new ArrayList();
                    for (int i4 = 0; i4 < PasscodeView.this.backgroundSpringQueue.size(); i4++) {
                        Runnable runnable = (Runnable) PasscodeView.this.backgroundSpringQueue.get(i4);
                        if (((Boolean) PasscodeView.this.backgroundSpringNextQueue.get(i4)).booleanValue() != z) {
                            arrayList.add(runnable);
                            arrayList2.add(Integer.valueOf(i4));
                        }
                    }
                    for (Runnable runnable2 : arrayList) {
                        PasscodeView.this.backgroundSpringQueue.remove(runnable2);
                    }
                    for (Integer num : arrayList2) {
                        PasscodeView.this.backgroundSpringNextQueue.remove(num.intValue());
                    }
                }
            }
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

    public void lambda$new$6(View view) {
        boolean z;
        final boolean z2;
        int intValue = ((Integer) view.getTag()).intValue();
        switch (intValue) {
            case 0:
                this.passwordEditText2.appendCharacter("0");
                z = false;
                break;
            case 1:
                this.passwordEditText2.appendCharacter("1");
                z = false;
                break;
            case 2:
                this.passwordEditText2.appendCharacter("2");
                z = false;
                break;
            case 3:
                this.passwordEditText2.appendCharacter("3");
                z = false;
                break;
            case 4:
                this.passwordEditText2.appendCharacter("4");
                z = false;
                break;
            case 5:
                this.passwordEditText2.appendCharacter("5");
                z = false;
                break;
            case 6:
                this.passwordEditText2.appendCharacter("6");
                z = false;
                break;
            case 7:
                this.passwordEditText2.appendCharacter("7");
                z = false;
                break;
            case 8:
                this.passwordEditText2.appendCharacter("8");
                z = false;
                break;
            case 9:
                this.passwordEditText2.appendCharacter("9");
                z = false;
                break;
            case 10:
                z = this.passwordEditText2.eraseLastCharacter();
                break;
            case 11:
                checkFingerprint();
                z = false;
                break;
            default:
                z = false;
                break;
        }
        if (this.passwordEditText2.length() == 4) {
            processDone(false);
        }
        if (intValue == 11) {
            return;
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            final MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            motionBackgroundDrawable.setAnimationProgressProvider(null);
            float posAnimationProgress = motionBackgroundDrawable.getPosAnimationProgress();
            boolean z3 = true;
            if (intValue == 10) {
                if (z) {
                    motionBackgroundDrawable.switchToPrevPosition(true);
                } else {
                    z3 = false;
                }
                z2 = false;
            } else {
                motionBackgroundDrawable.switchToNextPosition(true);
                z2 = true;
            }
            if (z3) {
                if (posAnimationProgress >= 1.0f) {
                    animateBackground(motionBackgroundDrawable);
                    return;
                }
                this.backgroundSpringQueue.offer(new Runnable() {
                    @Override
                    public final void run() {
                        PasscodeView.this.lambda$new$4(z2, motionBackgroundDrawable);
                    }
                });
                this.backgroundSpringNextQueue.offer(Boolean.valueOf(z2));
                ArrayList<Runnable> arrayList = new ArrayList();
                ArrayList<Integer> arrayList2 = new ArrayList();
                for (int i = 0; i < this.backgroundSpringQueue.size(); i++) {
                    Runnable runnable = this.backgroundSpringQueue.get(i);
                    Boolean bool = this.backgroundSpringNextQueue.get(i);
                    if (bool != null && bool.booleanValue() != z2) {
                        arrayList.add(runnable);
                        arrayList2.add(Integer.valueOf(i));
                    }
                }
                for (Runnable runnable2 : arrayList) {
                    this.backgroundSpringQueue.remove(runnable2);
                }
                Collections.sort(arrayList2, PasscodeView$$ExternalSyntheticLambda12.INSTANCE);
                for (Integer num : arrayList2) {
                    this.backgroundSpringNextQueue.remove(num.intValue());
                }
            }
        }
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

    public void animateBackground(final MotionBackgroundDrawable motionBackgroundDrawable) {
        SpringAnimation springAnimation = this.backgroundAnimationSpring;
        if (springAnimation != null && springAnimation.isRunning()) {
            this.backgroundAnimationSpring.cancel();
        }
        final FloatValueHolder floatValueHolder = new FloatValueHolder(0.0f);
        motionBackgroundDrawable.setAnimationProgressProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                Float lambda$animateBackground$7;
                lambda$animateBackground$7 = PasscodeView.lambda$animateBackground$7(FloatValueHolder.this, (MotionBackgroundDrawable) obj);
                return lambda$animateBackground$7;
            }
        });
        SpringAnimation spring = new SpringAnimation(floatValueHolder).setSpring(new SpringForce(100.0f).setStiffness(300.0f).setDampingRatio(1.0f));
        this.backgroundAnimationSpring = spring;
        spring.addEndListener(new DynamicAnimation.OnAnimationEndListener() {
            @Override
            public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
                PasscodeView.this.lambda$animateBackground$8(motionBackgroundDrawable, dynamicAnimation, z, f, f2);
            }
        });
        this.backgroundAnimationSpring.addUpdateListener(new DynamicAnimation.OnAnimationUpdateListener() {
            @Override
            public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
                MotionBackgroundDrawable.this.updateAnimation(true);
            }
        });
        this.backgroundAnimationSpring.start();
    }

    public static Float lambda$animateBackground$7(FloatValueHolder floatValueHolder, MotionBackgroundDrawable motionBackgroundDrawable) {
        return Float.valueOf(floatValueHolder.getValue() / 100.0f);
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
        String obj;
        if (!z) {
            if (SharedConfig.passcodeRetryInMs > 0) {
                return;
            }
            int i = SharedConfig.passcodeType;
            if (i == 0) {
                obj = this.passwordEditText2.getString();
            } else {
                obj = i == 1 ? this.passwordEditText.getText().toString() : "";
            }
            if (obj.length() == 0) {
                onPasscodeError();
                return;
            } else if (!SharedConfig.checkPasscode(obj)) {
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
            passcodeViewDelegate.didAcceptedPassword();
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                PasscodeView.this.lambda$processDone$10();
            }
        });
    }

    public void lambda$processDone$10() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(200L);
        animatorSet.playTogether(ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, AndroidUtilities.m36dp(20.0f)), ObjectAnimator.ofFloat(this, View.ALPHA, AndroidUtilities.m36dp(0.0f)));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PasscodeView.this.setVisibility(8);
            }
        });
        animatorSet.start();
    }

    public void shakeTextView(final float f, final int i) {
        if (i == 6) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.passcodeTextView, View.TRANSLATION_X, AndroidUtilities.m36dp(f)));
        animatorSet.setDuration(50L);
        animatorSet.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                PasscodeView passcodeView = PasscodeView.this;
                int i2 = i;
                passcodeView.shakeTextView(i2 == 5 ? 0.0f : -f, i2 + 1);
            }
        });
        animatorSet.start();
    }

    public void checkRetryTextView() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime > SharedConfig.lastUptimeMillis) {
            long j = SharedConfig.passcodeRetryInMs - (elapsedRealtime - SharedConfig.lastUptimeMillis);
            SharedConfig.passcodeRetryInMs = j;
            if (j < 0) {
                SharedConfig.passcodeRetryInMs = 0L;
            }
        }
        SharedConfig.lastUptimeMillis = elapsedRealtime;
        SharedConfig.saveConfig();
        long j2 = SharedConfig.passcodeRetryInMs;
        if (j2 > 0) {
            double d = j2;
            Double.isNaN(d);
            int max = Math.max(1, (int) Math.ceil(d / 1000.0d));
            if (max != this.lastValue) {
                this.retryTextView.setText(LocaleController.formatString("TooManyTries", C1072R.string.TooManyTries, LocaleController.formatPluralString("Seconds", max, new Object[0])));
                this.lastValue = max;
            }
            if (this.retryTextView.getVisibility() != 0) {
                this.retryTextView.setVisibility(0);
                this.passwordFrameLayout.setVisibility(4);
                if (this.numbersFrameLayout.getVisibility() == 0) {
                    this.numbersFrameLayout.setVisibility(4);
                }
                AndroidUtilities.hideKeyboard(this.passwordEditText);
            }
            AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
            AndroidUtilities.runOnUIThread(this.checkRunnable, 100L);
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
        if (this.passwordFrameLayout.getVisibility() != 0) {
            this.retryTextView.setVisibility(4);
            this.passwordFrameLayout.setVisibility(0);
            int i = SharedConfig.passcodeType;
            if (i == 0) {
                this.numbersFrameLayout.setVisibility(0);
            } else if (i == 1) {
                AndroidUtilities.showKeyboard(this.passwordEditText);
            }
        }
    }

    private void onPasscodeError() {
        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
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
                        PasscodeView.this.lambda$onResume$11();
                    }
                }, 200L);
            }
            checkFingerprint();
        }
    }

    public void lambda$onResume$11() {
        EditTextBoldCursor editTextBoldCursor;
        if (this.retryTextView.getVisibility() == 0 || (editTextBoldCursor = this.passwordEditText) == null) {
            return;
        }
        editTextBoldCursor.requestFocus();
        AndroidUtilities.showKeyboard(this.passwordEditText);
    }

    public void onPause() {
        CancellationSignal cancellationSignal;
        AndroidUtilities.cancelRunOnUIThread(this.checkRunnable);
        AlertDialog alertDialog = this.fingerprintDialog;
        if (alertDialog != null) {
            try {
                if (alertDialog.isShowing()) {
                    this.fingerprintDialog.dismiss();
                }
                this.fingerprintDialog = null;
            } catch (Exception e) {
                FileLog.m32e(e);
            }
        }
        try {
            if (Build.VERSION.SDK_INT < 23 || (cancellationSignal = this.cancellationSignal) == null) {
                return;
            }
            cancellationSignal.cancel();
            this.cancellationSignal = null;
        } catch (Exception e2) {
            FileLog.m32e(e2);
        }
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.didGenerateFingerprintKeyPair);
    }

    private void checkFingerprint() {
        if (Build.VERSION.SDK_INT >= 23 && ((Activity) getContext()) != null && this.fingerprintView.getVisibility() == 0 && !ApplicationLoader.mainInterfacePaused) {
            try {
                AlertDialog alertDialog = this.fingerprintDialog;
                if (alertDialog != null) {
                    if (alertDialog.isShowing()) {
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.m32e(e);
            }
            try {
                FingerprintManagerCompat from = FingerprintManagerCompat.from(ApplicationLoader.applicationContext);
                if (from.isHardwareDetected() && from.hasEnrolledFingerprints() && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    relativeLayout.setPadding(AndroidUtilities.m36dp(24.0f), 0, AndroidUtilities.m36dp(24.0f), 0);
                    TextView textView = new TextView(getContext());
                    textView.setId(1000);
                    textView.setTextAppearance(16974344);
                    textView.setTextColor(Theme.getColor("dialogTextBlack"));
                    textView.setText(LocaleController.getString("FingerprintInfo", C1072R.string.FingerprintInfo));
                    relativeLayout.addView(textView);
                    RelativeLayout.LayoutParams createRelative = LayoutHelper.createRelative(-2, -2);
                    createRelative.addRule(10);
                    createRelative.addRule(20);
                    textView.setLayoutParams(createRelative);
                    ImageView imageView = new ImageView(getContext());
                    this.fingerprintImageView = imageView;
                    imageView.setImageResource(C1072R.C1073drawable.ic_fp_40px);
                    this.fingerprintImageView.setId(1001);
                    relativeLayout.addView(this.fingerprintImageView, LayoutHelper.createRelative(-2.0f, -2.0f, 0, 20, 0, 0, 20, 3, 1000));
                    TextView textView2 = new TextView(getContext());
                    this.fingerprintStatusTextView = textView2;
                    textView2.setGravity(16);
                    this.fingerprintStatusTextView.setText(LocaleController.getString("FingerprintHelp", C1072R.string.FingerprintHelp));
                    this.fingerprintStatusTextView.setTextAppearance(16974320);
                    this.fingerprintStatusTextView.setTextColor(Theme.getColor("dialogTextBlack") & 1124073471);
                    relativeLayout.addView(this.fingerprintStatusTextView);
                    RelativeLayout.LayoutParams createRelative2 = LayoutHelper.createRelative(-2, -2);
                    createRelative2.setMarginStart(AndroidUtilities.m36dp(16.0f));
                    createRelative2.addRule(8, 1001);
                    createRelative2.addRule(6, 1001);
                    createRelative2.addRule(17, 1001);
                    this.fingerprintStatusTextView.setLayoutParams(createRelative2);
                    AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                    builder.setTitle(LocaleController.getString("AppName", C1072R.string.AppName));
                    builder.setView(relativeLayout);
                    builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
                    builder.setOnDismissListener(new DialogInterface.OnDismissListener() {
                        @Override
                        public final void onDismiss(DialogInterface dialogInterface) {
                            PasscodeView.this.lambda$checkFingerprint$12(dialogInterface);
                        }
                    });
                    AlertDialog alertDialog2 = this.fingerprintDialog;
                    if (alertDialog2 != null) {
                        try {
                            if (alertDialog2.isShowing()) {
                                this.fingerprintDialog.dismiss();
                            }
                        } catch (Exception e2) {
                            FileLog.m32e(e2);
                        }
                    }
                    this.fingerprintDialog = builder.show();
                    CancellationSignal cancellationSignal = new CancellationSignal();
                    this.cancellationSignal = cancellationSignal;
                    this.selfCancelled = false;
                    from.authenticate(null, 0, cancellationSignal, new FingerprintManagerCompat.AuthenticationCallback() {
                        @Override
                        public void onAuthenticationError(int i, CharSequence charSequence) {
                            if (i == 10) {
                                try {
                                    if (PasscodeView.this.fingerprintDialog.isShowing()) {
                                        PasscodeView.this.fingerprintDialog.dismiss();
                                    }
                                } catch (Exception e3) {
                                    FileLog.m32e(e3);
                                }
                                PasscodeView.this.fingerprintDialog = null;
                            } else if (PasscodeView.this.selfCancelled || i == 5) {
                            } else {
                                PasscodeView.this.showFingerprintError(charSequence);
                            }
                        }

                        @Override
                        public void onAuthenticationHelp(int i, CharSequence charSequence) {
                            PasscodeView.this.showFingerprintError(charSequence);
                        }

                        @Override
                        public void onAuthenticationFailed() {
                            PasscodeView.this.showFingerprintError(LocaleController.getString("FingerprintNotRecognized", C1072R.string.FingerprintNotRecognized));
                        }

                        @Override
                        public void onAuthenticationSucceeded(FingerprintManagerCompat.AuthenticationResult authenticationResult) {
                            try {
                                if (PasscodeView.this.fingerprintDialog.isShowing()) {
                                    PasscodeView.this.fingerprintDialog.dismiss();
                                }
                            } catch (Exception e3) {
                                FileLog.m32e(e3);
                            }
                            PasscodeView.this.fingerprintDialog = null;
                            PasscodeView.this.processDone(true);
                        }
                    }, null);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void lambda$checkFingerprint$12(DialogInterface dialogInterface) {
        CancellationSignal cancellationSignal = this.cancellationSignal;
        if (cancellationSignal != null) {
            this.selfCancelled = true;
            try {
                cancellationSignal.cancel();
            } catch (Exception e) {
                FileLog.m32e(e);
            }
            this.cancellationSignal = null;
        }
    }

    public void onShow(boolean z, boolean z2) {
        onShow(z, z2, -1, -1, null, null);
    }

    private void checkFingerprintButton() {
        Activity activity = (Activity) getContext();
        if (Build.VERSION.SDK_INT >= 23 && activity != null && SharedConfig.useFingerprint) {
            try {
                AlertDialog alertDialog = this.fingerprintDialog;
                if (alertDialog != null) {
                    if (alertDialog.isShowing()) {
                        return;
                    }
                }
            } catch (Exception e) {
                FileLog.m32e(e);
            }
            try {
                FingerprintManagerCompat from = FingerprintManagerCompat.from(ApplicationLoader.applicationContext);
                if (from.isHardwareDetected() && from.hasEnrolledFingerprints() && FingerprintController.isKeyReady() && !FingerprintController.checkDeviceFingerprintsChanged()) {
                    this.fingerprintView.setVisibility(0);
                } else {
                    this.fingerprintView.setVisibility(8);
                }
            } catch (Throwable th) {
                FileLog.m32e(th);
                this.fingerprintView.setVisibility(8);
            }
        } else {
            this.fingerprintView.setVisibility(8);
        }
        if (SharedConfig.passcodeType == 1) {
            this.fingerprintImage.setVisibility(this.fingerprintView.getVisibility());
        }
        if (this.numberFrameLayouts.size() >= 11) {
            this.numberFrameLayouts.get(11).setVisibility(this.fingerprintView.getVisibility());
        }
    }

    public void onShow(boolean z, boolean z2, int i, int i2, Runnable runnable, Runnable runnable2) {
        View currentFocus;
        EditTextBoldCursor editTextBoldCursor;
        checkFingerprintButton();
        checkRetryTextView();
        Activity activity = (Activity) getContext();
        if (SharedConfig.passcodeType == 1) {
            if (!z2 && this.retryTextView.getVisibility() != 0 && (editTextBoldCursor = this.passwordEditText) != null) {
                editTextBoldCursor.requestFocus();
                AndroidUtilities.showKeyboard(this.passwordEditText);
            }
        } else if (activity != null && (currentFocus = activity.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            AndroidUtilities.hideKeyboard(((Activity) getContext()).getCurrentFocus());
        }
        if (z && this.retryTextView.getVisibility() != 0) {
            checkFingerprint();
        }
        if (getVisibility() == 0) {
            return;
        }
        setTranslationY(0.0f);
        this.backgroundDrawable = null;
        if (Theme.getCachedWallpaper() instanceof MotionBackgroundDrawable) {
            this.backgroundDrawable = Theme.getCachedWallpaper();
            this.backgroundFrameLayout.setBackgroundColor(-1090519040);
        } else if (Theme.isCustomTheme() && !"CJz3BZ6YGEYBAAAABboWp6SAv04".equals(Theme.getSelectedBackgroundSlug()) && !"qeZWES8rGVIEAAAARfWlK1lnfiI".equals(Theme.getSelectedBackgroundSlug())) {
            BackgroundGradientDrawable currentGradientWallpaper = Theme.getCurrentGradientWallpaper();
            this.backgroundDrawable = currentGradientWallpaper;
            if (currentGradientWallpaper == null) {
                this.backgroundDrawable = Theme.getCachedWallpaper();
            }
            if (this.backgroundDrawable instanceof BackgroundGradientDrawable) {
                this.backgroundFrameLayout.setBackgroundColor(570425344);
            } else {
                this.backgroundFrameLayout.setBackgroundColor(-1090519040);
            }
        } else if ("d".equals(Theme.getSelectedBackgroundSlug()) || Theme.isPatternWallpaper()) {
            this.backgroundFrameLayout.setBackgroundColor(-11436898);
        } else {
            Drawable cachedWallpaper = Theme.getCachedWallpaper();
            this.backgroundDrawable = cachedWallpaper;
            if (cachedWallpaper instanceof BackgroundGradientDrawable) {
                this.backgroundFrameLayout.setBackgroundColor(570425344);
            } else if (cachedWallpaper != null) {
                this.backgroundFrameLayout.setBackgroundColor(-1090519040);
            } else {
                this.backgroundFrameLayout.setBackgroundColor(-11436898);
            }
        }
        Drawable drawable = this.backgroundDrawable;
        if (drawable instanceof MotionBackgroundDrawable) {
            MotionBackgroundDrawable motionBackgroundDrawable = (MotionBackgroundDrawable) drawable;
            int[] colors = motionBackgroundDrawable.getColors();
            this.backgroundDrawable = new MotionBackgroundDrawable(colors[0], colors[1], colors[2], colors[3], false);
            if (motionBackgroundDrawable.hasPattern() && motionBackgroundDrawable.getIntensity() < 0) {
                this.backgroundFrameLayout.setBackgroundColor(2130706432);
            } else {
                this.backgroundFrameLayout.setBackgroundColor(570425344);
            }
            ((MotionBackgroundDrawable) this.backgroundDrawable).setParentView(this.backgroundFrameLayout);
        }
        this.passcodeTextView.setText(LocaleController.getString("EnterYourTelegramPasscode", C1072R.string.EnterYourTelegramPasscode));
        int i3 = SharedConfig.passcodeType;
        if (i3 == 0) {
            if (this.retryTextView.getVisibility() != 0) {
                this.numbersFrameLayout.setVisibility(0);
            }
            this.passwordEditText.setVisibility(8);
            this.passwordEditText2.setVisibility(0);
            this.checkImage.setVisibility(8);
            this.fingerprintImage.setVisibility(8);
        } else if (i3 == 1) {
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
            getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver$OnGlobalLayoutListenerC25319(i, i2, runnable));
            requestLayout();
        } else {
            setAlpha(1.0f);
            this.imageView.setScaleX(1.0f);
            this.imageView.setScaleY(1.0f);
            this.imageView.stopAnimation();
            this.imageView.getAnimatedDrawable().setCurrentFrame(38, false);
            if (runnable != null) {
                runnable.run();
            }
        }
        setOnTouchListener(PasscodeView$$ExternalSyntheticLambda5.INSTANCE);
    }

    public class ViewTreeObserver$OnGlobalLayoutListenerC25319 implements ViewTreeObserver.OnGlobalLayoutListener {
        final Runnable val$onShow;
        final int val$x;
        final int val$y;

        ViewTreeObserver$OnGlobalLayoutListenerC25319(int i, int i2, Runnable runnable) {
            this.val$x = i;
            this.val$y = i2;
            this.val$onShow = runnable;
        }

        @Override
        public void onGlobalLayout() {
            float f;
            int m36dp;
            int i;
            final AnimatorSet animatorSet;
            char c;
            float f2 = 1.0f;
            PasscodeView.this.setAlpha(1.0f);
            PasscodeView.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            float f3 = 0.0f;
            PasscodeView.this.imageView.setProgress(0.0f);
            PasscodeView.this.imageView.playAnimation();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    PasscodeView.ViewTreeObserver$OnGlobalLayoutListenerC25319.this.lambda$onGlobalLayout$0();
                }
            }, 350L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            Point point = AndroidUtilities.displaySize;
            int i2 = point.x;
            int i3 = point.y;
            int i4 = Build.VERSION.SDK_INT;
            char c2 = 0;
            int i5 = i3 + (i4 >= 21 ? AndroidUtilities.statusBarHeight : 0);
            if (i4 < 21) {
                arrayList.add(ObjectAnimator.ofFloat(PasscodeView.this.backgroundFrameLayout, View.ALPHA, 0.0f, 1.0f));
                animatorSet2.setDuration(350L);
            } else {
                int i6 = this.val$x;
                int i7 = (i2 - i6) * (i2 - i6);
                int i8 = this.val$y;
                double sqrt = Math.sqrt(i7 + ((i5 - i8) * (i5 - i8)));
                int i9 = this.val$x;
                int i10 = this.val$y;
                double sqrt2 = Math.sqrt((i9 * i9) + ((i5 - i10) * (i5 - i10)));
                int i11 = this.val$x;
                int i12 = this.val$y;
                double sqrt3 = Math.sqrt((i11 * i11) + (i12 * i12));
                int i13 = this.val$x;
                int i14 = (i2 - i13) * (i2 - i13);
                int i15 = this.val$y;
                final double max = Math.max(Math.max(Math.max(sqrt, sqrt2), sqrt3), Math.sqrt(i14 + (i15 * i15)));
                PasscodeView.this.innerAnimators.clear();
                int childCount = PasscodeView.this.numbersFrameLayout.getChildCount();
                int i16 = -1;
                int i17 = -1;
                while (i17 < childCount) {
                    View childAt = i17 == i16 ? PasscodeView.this.passcodeTextView : PasscodeView.this.numbersFrameLayout.getChildAt(i17);
                    if ((childAt instanceof TextView) || (childAt instanceof ImageView)) {
                        childAt.setScaleX(0.7f);
                        childAt.setScaleY(0.7f);
                        childAt.setAlpha(f3);
                        InnerAnimator innerAnimator = new InnerAnimator();
                        childAt.getLocationInWindow(PasscodeView.this.pos);
                        int measuredWidth = PasscodeView.this.pos[c2] + (childAt.getMeasuredWidth() / 2);
                        int measuredHeight = PasscodeView.this.pos[1] + (childAt.getMeasuredHeight() / 2);
                        int i18 = this.val$x;
                        int i19 = (i18 - measuredWidth) * (i18 - measuredWidth);
                        int i20 = this.val$y;
                        innerAnimator.startRadius = ((float) Math.sqrt(i19 + ((i20 - measuredHeight) * (i20 - measuredHeight)))) - AndroidUtilities.m36dp(40.0f);
                        if (i17 != i16) {
                            animatorSet = new AnimatorSet();
                            Animator[] animatorArr = new Animator[2];
                            Property property = View.SCALE_X;
                            i = childCount;
                            float[] fArr = new float[1];
                            fArr[c2] = f2;
                            animatorArr[c2] = ObjectAnimator.ofFloat(childAt, property, fArr);
                            Property property2 = View.SCALE_Y;
                            float[] fArr2 = new float[1];
                            fArr2[c2] = f2;
                            animatorArr[1] = ObjectAnimator.ofFloat(childAt, property2, fArr2);
                            animatorSet.playTogether(animatorArr);
                            animatorSet.setDuration(140L);
                            animatorSet.setInterpolator(new DecelerateInterpolator());
                        } else {
                            i = childCount;
                            animatorSet = null;
                        }
                        innerAnimator.animatorSet = new AnimatorSet();
                        AnimatorSet animatorSet3 = innerAnimator.animatorSet;
                        Animator[] animatorArr2 = new Animator[3];
                        Property property3 = View.SCALE_X;
                        float[] fArr3 = new float[2];
                        fArr3[c2] = i17 == -1 ? 0.9f : 0.6f;
                        float f4 = 1.04f;
                        fArr3[1] = i17 == -1 ? 1.0f : 1.04f;
                        animatorArr2[c2] = ObjectAnimator.ofFloat(childAt, property3, fArr3);
                        Property property4 = View.SCALE_Y;
                        float[] fArr4 = new float[2];
                        fArr4[0] = i17 == -1 ? 0.9f : 0.6f;
                        if (i17 == -1) {
                            c = 1;
                            f4 = 1.0f;
                        } else {
                            c = 1;
                        }
                        fArr4[c] = f4;
                        animatorArr2[c] = ObjectAnimator.ofFloat(childAt, property4, fArr4);
                        animatorArr2[2] = ObjectAnimator.ofFloat(childAt, View.ALPHA, 0.0f, 1.0f);
                        animatorSet3.playTogether(animatorArr2);
                        innerAnimator.animatorSet.addListener(new AnimatorListenerAdapter(this) {
                            @Override
                            public void onAnimationEnd(Animator animator) {
                                AnimatorSet animatorSet4 = animatorSet;
                                if (animatorSet4 != null) {
                                    animatorSet4.start();
                                }
                            }
                        });
                        innerAnimator.animatorSet.setDuration(i17 == -1 ? 232L : 200L);
                        innerAnimator.animatorSet.setInterpolator(new DecelerateInterpolator());
                        PasscodeView.this.innerAnimators.add(innerAnimator);
                    } else {
                        i = childCount;
                    }
                    i17++;
                    childCount = i;
                    f2 = 1.0f;
                    f3 = 0.0f;
                    i16 = -1;
                    c2 = 0;
                }
                arrayList.add(ViewAnimationUtils.createCircularReveal(PasscodeView.this.backgroundFrameLayout, this.val$x, this.val$y, 0.0f, (float) max));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                arrayList.add(ofFloat);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        PasscodeView.ViewTreeObserver$OnGlobalLayoutListenerC25319.this.lambda$onGlobalLayout$1(max, valueAnimator);
                    }
                });
                animatorSet2.setInterpolator(Easings.easeInOutQuad);
                animatorSet2.setDuration(498L);
            }
            animatorSet2.playTogether(arrayList);
            animatorSet2.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    Runnable runnable = ViewTreeObserver$OnGlobalLayoutListenerC25319.this.val$onShow;
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
            animatorSet2.start();
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.setDuration(332L);
            if (!AndroidUtilities.isTablet() && PasscodeView.this.getContext().getResources().getConfiguration().orientation == 2) {
                f = (SharedConfig.passcodeType == 0 ? i2 / 2.0f : i2) / 2.0f;
                m36dp = AndroidUtilities.m36dp(30.0f);
            } else {
                f = i2 / 2.0f;
                m36dp = AndroidUtilities.m36dp(29.0f);
            }
            animatorSet4.playTogether(ObjectAnimator.ofFloat(PasscodeView.this.imageView, View.TRANSLATION_X, this.val$x - AndroidUtilities.m36dp(29.0f), f - m36dp), ObjectAnimator.ofFloat(PasscodeView.this.imageView, View.TRANSLATION_Y, this.val$y - AndroidUtilities.m36dp(29.0f), PasscodeView.this.imageY), ObjectAnimator.ofFloat(PasscodeView.this.imageView, View.SCALE_X, 0.5f, 1.0f), ObjectAnimator.ofFloat(PasscodeView.this.imageView, View.SCALE_Y, 0.5f, 1.0f));
            animatorSet4.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet4.start();
        }

        public void lambda$onGlobalLayout$0() {
            PasscodeView.this.imageView.performHapticFeedback(3, 2);
        }

        public void lambda$onGlobalLayout$1(double d, ValueAnimator valueAnimator) {
            double animatedFraction = valueAnimator.getAnimatedFraction();
            Double.isNaN(animatedFraction);
            double d2 = d * animatedFraction;
            int i = 0;
            while (i < PasscodeView.this.innerAnimators.size()) {
                InnerAnimator innerAnimator = (InnerAnimator) PasscodeView.this.innerAnimators.get(i);
                if (innerAnimator.startRadius <= d2) {
                    innerAnimator.animatorSet.start();
                    PasscodeView.this.innerAnimators.remove(i);
                    i--;
                }
                i++;
            }
        }
    }

    public void showFingerprintError(CharSequence charSequence) {
        this.fingerprintImageView.setImageResource(C1072R.C1073drawable.ic_fingerprint_error);
        this.fingerprintStatusTextView.setText(charSequence);
        this.fingerprintStatusTextView.setTextColor(-765666);
        Vibrator vibrator = (Vibrator) getContext().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(200L);
        }
        AndroidUtilities.shakeView(this.fingerprintStatusTextView);
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        FrameLayout.LayoutParams layoutParams;
        int i5;
        FrameLayout.LayoutParams layoutParams2;
        int m36dp;
        int size = View.MeasureSpec.getSize(i);
        int i6 = AndroidUtilities.displaySize.y;
        int i7 = Build.VERSION.SDK_INT;
        int i8 = 0;
        int i9 = i6 - (i7 >= 21 ? 0 : AndroidUtilities.statusBarHeight);
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
            this.imageView.setTranslationX(((SharedConfig.passcodeType == 0 ? size / 2.0f : size) / 2.0f) - AndroidUtilities.m36dp(29.0f));
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams3.width = SharedConfig.passcodeType == 0 ? size / 2 : size;
            layoutParams3.height = AndroidUtilities.m36dp(140.0f);
            layoutParams3.topMargin = ((i9 - AndroidUtilities.m36dp(140.0f)) / 2) + (SharedConfig.passcodeType == 0 ? AndroidUtilities.m36dp(40.0f) : 0);
            this.passwordFrameLayout.setLayoutParams(layoutParams3);
            layoutParams = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams.height = i9;
            int i10 = size / 2;
            layoutParams.leftMargin = i10;
            layoutParams.topMargin = (i9 - i9) + (i7 >= 21 ? AndroidUtilities.statusBarHeight : 0);
            layoutParams.width = i10;
            this.numbersFrameLayout.setLayoutParams(layoutParams);
        } else {
            this.imageView.setTranslationX((size / 2.0f) - AndroidUtilities.m36dp(29.0f));
            if (AndroidUtilities.isTablet()) {
                if (size > AndroidUtilities.m36dp(498.0f)) {
                    i5 = (size - AndroidUtilities.m36dp(498.0f)) / 2;
                    size = AndroidUtilities.m36dp(498.0f);
                } else {
                    i5 = 0;
                }
                if (i9 > AndroidUtilities.m36dp(528.0f)) {
                    int i11 = i5;
                    i3 = (i9 - AndroidUtilities.m36dp(528.0f)) / 2;
                    i9 = AndroidUtilities.m36dp(528.0f);
                    i4 = i11;
                } else {
                    i4 = i5;
                    i3 = 0;
                }
            } else {
                i3 = 0;
                i4 = 0;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            int i12 = i9 / 3;
            layoutParams4.height = (SharedConfig.passcodeType == 0 ? AndroidUtilities.m36dp(40.0f) : 0) + i12;
            layoutParams4.width = size;
            layoutParams4.topMargin = i3;
            layoutParams4.leftMargin = i4;
            this.passwordFrameLayout.setTag(Integer.valueOf(i3));
            this.passwordFrameLayout.setLayoutParams(layoutParams4);
            layoutParams = (FrameLayout.LayoutParams) this.numbersFrameLayout.getLayoutParams();
            layoutParams.height = i12 * 2;
            layoutParams.leftMargin = i4;
            if (AndroidUtilities.isTablet()) {
                layoutParams.topMargin = (i9 - layoutParams.height) + i3 + AndroidUtilities.m36dp(20.0f);
            } else {
                layoutParams.topMargin = (i9 - layoutParams.height) + i3 + (SharedConfig.passcodeType == 0 ? AndroidUtilities.m36dp(40.0f) : 0);
            }
            layoutParams.width = size;
            this.numbersFrameLayout.setLayoutParams(layoutParams);
        }
        int m36dp2 = (layoutParams.width - (AndroidUtilities.m36dp(50.0f) * 3)) / 4;
        int m36dp3 = (layoutParams.height - (AndroidUtilities.m36dp(50.0f) * 4)) / 5;
        while (i8 < 12) {
            int i13 = 11;
            if (i8 == 0) {
                i13 = 10;
            } else if (i8 != 10) {
                i13 = i8 == 11 ? 9 : i8 - 1;
            }
            int i14 = i13 / 3;
            int i15 = i13 % 3;
            if (i8 < 10) {
                TextView textView = this.numberTextViews.get(i8);
                TextView textView2 = this.lettersTextViews.get(i8);
                layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
                m36dp = ((AndroidUtilities.m36dp(50.0f) + m36dp3) * i14) + m36dp3;
                layoutParams2.topMargin = m36dp;
                layoutParams5.topMargin = m36dp;
                int m36dp4 = ((AndroidUtilities.m36dp(50.0f) + m36dp2) * i15) + m36dp2;
                layoutParams2.leftMargin = m36dp4;
                layoutParams5.leftMargin = m36dp4;
                layoutParams5.topMargin += AndroidUtilities.m36dp(40.0f);
                textView.setLayoutParams(layoutParams2);
                textView2.setLayoutParams(layoutParams5);
            } else if (i8 == 10) {
                layoutParams2 = (FrameLayout.LayoutParams) this.eraseView.getLayoutParams();
                int m36dp5 = ((AndroidUtilities.m36dp(50.0f) + m36dp3) * i14) + m36dp3 + AndroidUtilities.m36dp(8.0f);
                layoutParams2.topMargin = m36dp5;
                layoutParams2.leftMargin = ((AndroidUtilities.m36dp(50.0f) + m36dp2) * i15) + m36dp2;
                m36dp = m36dp5 - AndroidUtilities.m36dp(8.0f);
                this.eraseView.setLayoutParams(layoutParams2);
            } else {
                layoutParams2 = (FrameLayout.LayoutParams) this.fingerprintView.getLayoutParams();
                int m36dp6 = ((AndroidUtilities.m36dp(50.0f) + m36dp3) * i14) + m36dp3 + AndroidUtilities.m36dp(8.0f);
                layoutParams2.topMargin = m36dp6;
                layoutParams2.leftMargin = ((AndroidUtilities.m36dp(50.0f) + m36dp2) * i15) + m36dp2;
                m36dp = m36dp6 - AndroidUtilities.m36dp(8.0f);
                this.fingerprintView.setLayoutParams(layoutParams2);
            }
            FrameLayout frameLayout = this.numberFrameLayouts.get(i8);
            FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
            layoutParams6.topMargin = m36dp - AndroidUtilities.m36dp(17.0f);
            layoutParams6.leftMargin = layoutParams2.leftMargin - AndroidUtilities.m36dp(25.0f);
            frameLayout.setLayoutParams(layoutParams6);
            i8++;
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
            int intValue = this.passwordFrameLayout.getTag() != null ? ((Integer) this.passwordFrameLayout.getTag()).intValue() : 0;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.passwordFrameLayout.getLayoutParams();
            layoutParams.topMargin = ((intValue + layoutParams.height) - (this.keyboardHeight / 2)) - (Build.VERSION.SDK_INT >= 21 ? AndroidUtilities.statusBarHeight : 0);
            this.passwordFrameLayout.setLayoutParams(layoutParams);
        }
        super.onLayout(z, i, i2, i3, i4);
        this.passcodeTextView.getLocationInWindow(this.pos);
        if (!AndroidUtilities.isTablet() && getContext().getResources().getConfiguration().orientation == 2) {
            RLottieImageView rLottieImageView = this.imageView;
            int m36dp = this.pos[1] - AndroidUtilities.m36dp(100.0f);
            this.imageY = m36dp;
            rLottieImageView.setTranslationY(m36dp);
            return;
        }
        RLottieImageView rLottieImageView2 = this.imageView;
        int m36dp2 = this.pos[1] - AndroidUtilities.m36dp(100.0f);
        this.imageY = m36dp2;
        rLottieImageView2.setTranslationY(m36dp2);
    }
}
