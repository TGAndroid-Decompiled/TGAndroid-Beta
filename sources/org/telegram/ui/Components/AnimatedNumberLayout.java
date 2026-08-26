package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;
import java.util.Locale;

public class AnimatedNumberLayout {
    public static final Property<AnimatedNumberLayout, Float> PROGRESS = new AnimationProperties.FloatProperty<AnimatedNumberLayout>("progress") {
        @Override
        public Float get(AnimatedNumberLayout animatedNumberLayout) {
            return Float.valueOf(animatedNumberLayout.progress);
        }

        @Override
        public void setValue(AnimatedNumberLayout animatedNumberLayout, float f) {
            animatedNumberLayout.setProgress(f);
        }
    };
    private ObjectAnimator animator;
    private final View parentView;
    private final TextPaint textPaint;
    private ArrayList<StaticLayout> letters = new ArrayList<>();
    private ArrayList<StaticLayout> oldLetters = new ArrayList<>();
    private float progress = 0.0f;
    private int currentNumber = 1;

    public AnimatedNumberLayout(View view, TextPaint textPaint) {
        this.textPaint = textPaint;
        this.parentView = view;
    }

    private float getProgress() {
        return this.progress;
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        this.parentView.invalidate();
    }

    public void draw(Canvas canvas) {
        if (this.letters.isEmpty()) {
            return;
        }
        float height = this.letters.get(0).getHeight();
        int iMax = Math.max(this.letters.size(), this.oldLetters.size());
        canvas.save();
        int alpha = this.textPaint.getAlpha();
        int i = 0;
        while (i < iMax) {
            canvas.save();
            StaticLayout staticLayout = i < this.oldLetters.size() ? this.oldLetters.get(i) : null;
            StaticLayout staticLayout2 = i < this.letters.size() ? this.letters.get(i) : null;
            float f = this.progress;
            if (f > 0.0f) {
                if (staticLayout != null) {
                    float f2 = alpha;
                    this.textPaint.setAlpha((int) (f * f2));
                    canvas.save();
                    canvas.translate(0.0f, (this.progress - 1.0f) * height);
                    staticLayout.draw(canvas);
                    canvas.restore();
                    if (staticLayout2 != null) {
                        this.textPaint.setAlpha((int) ((1.0f - this.progress) * f2));
                        canvas.translate(0.0f, this.progress * height);
                    }
                } else {
                    this.textPaint.setAlpha(alpha);
                }
            } else if (f < 0.0f) {
                if (staticLayout != null) {
                    this.textPaint.setAlpha((int) (alpha * (-f)));
                    canvas.save();
                    canvas.translate(0.0f, (this.progress + 1.0f) * height);
                    staticLayout.draw(canvas);
                    canvas.restore();
                }
                if (staticLayout2 != null) {
                    if (i == iMax - 1 || staticLayout != null) {
                        this.textPaint.setAlpha((int) ((this.progress + 1.0f) * alpha));
                        canvas.translate(0.0f, this.progress * height);
                    } else {
                        this.textPaint.setAlpha(alpha);
                    }
                }
            } else if (staticLayout2 != null) {
                this.textPaint.setAlpha(alpha);
            }
            if (staticLayout2 != null) {
                staticLayout2.draw(canvas);
            }
            canvas.restore();
            canvas.translate(staticLayout2 != null ? staticLayout2.getLineWidth(0) : staticLayout.getLineWidth(0), 0.0f);
            i++;
        }
        canvas.restore();
    }

    public int getWidth() {
        int size = this.letters.size();
        float lineWidth = 0.0f;
        for (int i = 0; i < size; i++) {
            lineWidth += this.letters.get(i).getLineWidth(0);
        }
        return (int) Math.ceil(lineWidth);
    }

    public void setNumber(int i, boolean z) {
        if (this.currentNumber != i || this.letters.isEmpty()) {
            ObjectAnimator objectAnimator = this.animator;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.animator = null;
            }
            this.oldLetters.clear();
            this.oldLetters.addAll(this.letters);
            this.letters.clear();
            Locale locale = Locale.US;
            int i2 = this.currentNumber;
            StringBuilder sb = new StringBuilder();
            sb.append(i2);
            String string = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i);
            String string2 = sb2.toString();
            boolean z2 = i > this.currentNumber;
            this.currentNumber = i;
            this.progress = 0.0f;
            int i3 = 0;
            while (i3 < string2.length()) {
                int i4 = i3 + 1;
                String strSubstring = string2.substring(i3, i4);
                String strSubstring2 = (this.oldLetters.isEmpty() || i3 >= string.length()) ? null : string.substring(i3, i4);
                if (strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                    TextPaint textPaint = this.textPaint;
                    this.letters.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    this.letters.add(this.oldLetters.get(i3));
                    this.oldLetters.set(i3, null);
                }
                i3 = i4;
            }
            if (z && !this.oldLetters.isEmpty()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, PROGRESS, z2 ? -1.0f : 1.0f, 0.0f);
                this.animator = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        AnimatedNumberLayout.this.animator = null;
                        AnimatedNumberLayout.this.oldLetters.clear();
                    }
                });
                this.animator.start();
            }
            this.parentView.invalidate();
        }
    }
}
