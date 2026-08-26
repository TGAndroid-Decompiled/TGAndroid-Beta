package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimatedPhoneNumberEditText extends HintEditText {
    private static final float SPRING_MULTIPLIER = 100.0f;
    private static final boolean USE_NUMBERS_ANIMATION = false;
    private ObjectAnimator animator;
    private Runnable hintAnimationCallback;
    private List<Float> hintAnimationValues;
    private List<SpringAnimation> hintAnimations;
    private HintFadeProperty hintFadeProperty;
    private ArrayList<StaticLayout> letters;
    private ArrayList<StaticLayout> oldLetters;
    private String oldText;
    private float progress;
    private TextPaint textPaint;
    private String wasHint;
    private Boolean wasHintVisible;

    public final class HintFadeProperty extends FloatPropertyCompat {
        public HintFadeProperty() {
            super("hint_fade");
        }

        @Override
        public float getValue(Integer num) {
            if (num.intValue() < AnimatedPhoneNumberEditText.this.hintAnimationValues.size()) {
                return ((Float) AnimatedPhoneNumberEditText.this.hintAnimationValues.get(num.intValue())).floatValue() * 100.0f;
            }
            return 0.0f;
        }

        @Override
        public void setValue(Integer num, float f) {
            if (num.intValue() < AnimatedPhoneNumberEditText.this.hintAnimationValues.size()) {
                AnimatedPhoneNumberEditText.this.hintAnimationValues.set(num.intValue(), Float.valueOf(f / 100.0f));
                AnimatedPhoneNumberEditText.this.invalidate();
            }
        }
    }

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.letters = new ArrayList<>();
        this.oldLetters = new ArrayList<>();
        this.textPaint = new TextPaint(1);
        this.oldText = "";
        this.hintFadeProperty = new HintFadeProperty();
        this.hintAnimationValues = new ArrayList();
        this.hintAnimations = new ArrayList();
    }

    public void lambda$setHintText$0(boolean z, String str) {
        this.hintAnimationValues.clear();
        Iterator<SpringAnimation> it = this.hintAnimations.iterator();
        while (it.hasNext()) {
            it.next().cancel();
        }
        if (z) {
            return;
        }
        super.setHintText(str);
    }

    private void runHintAnimation(int i, boolean z, Runnable runnable) {
        Runnable runnable2 = this.hintAnimationCallback;
        if (runnable2 != null) {
            removeCallbacks(runnable2);
        }
        for (int i2 = 0; i2 < i; i2++) {
            float f = 0.0f;
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            SpringAnimation springAnimation = new SpringAnimation(Integer.valueOf(i2), this.hintFadeProperty);
            float f3 = f * 100.0f;
            SpringForce springForce = new SpringForce(f3);
            springForce.setStiffness(500.0f);
            springForce.setDampingRatio(1.0f);
            springForce.mFinalPosition = f3;
            springAnimation.mSpring = springForce;
            springAnimation.mValue = 100.0f * f2;
            springAnimation.mStartValueIsSet = true;
            this.hintAnimations.add(springAnimation);
            this.hintAnimationValues.add(Float.valueOf(f2));
            postDelayed(new ShareAlert$23$$ExternalSyntheticLambda0(springAnimation, 20), ((long) i2) * 5);
        }
        this.hintAnimationCallback = runnable;
        postDelayed(runnable, (((long) i) * 5) + 150);
    }

    @Override
    public String getHintText() {
        return this.wasHint;
    }

    public float getProgress() {
        return this.progress;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override
    public void onPreDrawHintCharacter(int i, Canvas canvas, float f, float f2) {
        if (i < this.hintAnimationValues.size()) {
            this.hintPaint.setAlpha((int) (this.hintAnimationValues.get(i).floatValue() * 255.0f));
        }
    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override
    public void setHintText(String str) {
        boolean zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty2;
        Boolean bool = this.wasHintVisible;
        if (bool == null || bool.booleanValue() != z) {
            this.hintAnimationValues.clear();
            Iterator<SpringAnimation> it = this.hintAnimations.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.hintAnimations.clear();
            this.wasHintVisible = Boolean.valueOf(z);
            zIsEmpty = TextUtils.isEmpty(getText());
        } else {
            zIsEmpty = false;
        }
        String str2 = !zIsEmpty2 ? str : this.wasHint;
        if (str2 == null) {
            str2 = "";
        }
        this.wasHint = str;
        if (!zIsEmpty2 || !zIsEmpty) {
            super.setHintText(str);
        }
        if (zIsEmpty) {
            runHintAnimation(str2.length(), z, new MediaActivity$$ExternalSyntheticLambda0(this, z, str, 2));
        }
    }

    public void setNewText(String str) {
        if (this.oldLetters == null || this.letters == null || Objects.equals(this.oldText, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        this.oldLetters.clear();
        this.oldLetters.addAll(this.letters);
        this.letters.clear();
        int i = 0;
        boolean z = TextUtils.isEmpty(this.oldText) && !TextUtils.isEmpty(str);
        this.progress = 0.0f;
        while (i < str.length()) {
            int i2 = i + 1;
            String strSubstring = str.substring(i, i2);
            String strSubstring2 = (this.oldLetters.isEmpty() || i >= this.oldText.length()) ? null : this.oldText.substring(i, i2);
            if (z || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                if (z && strSubstring2 == null) {
                    this.oldLetters.add(new StaticLayout("", this.textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                TextPaint textPaint = this.textPaint;
                this.letters.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                this.letters.add(this.oldLetters.get(i));
                this.oldLetters.set(i, null);
            }
            i = i2;
        }
        if (!this.oldLetters.isEmpty()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L);
            this.animator.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    AnimatedPhoneNumberEditText.this.animator = null;
                    AnimatedPhoneNumberEditText.this.oldLetters.clear();
                }
            });
            this.animator.start();
        }
        this.oldText = str;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.textPaint.setColor(i);
    }

    @Override
    public void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.textPaint.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
