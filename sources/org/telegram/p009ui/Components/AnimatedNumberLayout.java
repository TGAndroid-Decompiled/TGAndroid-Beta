package org.telegram.p009ui.Components;

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
import org.telegram.p009ui.Components.AnimationProperties;

public class AnimatedNumberLayout {
    public static final Property<AnimatedNumberLayout, Float> PROGRESS = new AnimationProperties.FloatProperty<AnimatedNumberLayout>("progress") {
        @Override
        public void setValue(AnimatedNumberLayout animatedNumberLayout, float f) {
            animatedNumberLayout.setProgress(f);
        }

        @Override
        public Float get(AnimatedNumberLayout animatedNumberLayout) {
            return Float.valueOf(animatedNumberLayout.progress);
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

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        this.parentView.invalidate();
    }

    public int getWidth() {
        int size = this.letters.size();
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            f += this.letters.get(i).getLineWidth(0);
        }
        return (int) Math.ceil(f);
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
            String format = String.format(locale, "%d", Integer.valueOf(this.currentNumber));
            String format2 = String.format(locale, "%d", Integer.valueOf(i));
            boolean z2 = i > this.currentNumber;
            this.currentNumber = i;
            this.progress = 0.0f;
            int i2 = 0;
            while (i2 < format2.length()) {
                int i3 = i2 + 1;
                String substring = format2.substring(i2, i3);
                String substring2 = (this.oldLetters.isEmpty() || i2 >= format.length()) ? null : format.substring(i2, i3);
                if (substring2 != null && substring2.equals(substring)) {
                    this.letters.add(this.oldLetters.get(i2));
                    this.oldLetters.set(i2, null);
                } else {
                    TextPaint textPaint = this.textPaint;
                    this.letters.add(new StaticLayout(substring, textPaint, (int) Math.ceil(textPaint.measureText(substring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                }
                i2 = i3;
            }
            if (z && !this.oldLetters.isEmpty()) {
                Property<AnimatedNumberLayout, Float> property = PROGRESS;
                float[] fArr = new float[2];
                fArr[0] = z2 ? -1.0f : 1.0f;
                fArr[1] = 0.0f;
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, property, fArr);
                this.animator = ofFloat;
                ofFloat.setDuration(150L);
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

    public void draw(Canvas canvas) {
        if (this.letters.isEmpty()) {
            return;
        }
        float height = this.letters.get(0).getHeight();
        int max = Math.max(this.letters.size(), this.oldLetters.size());
        canvas.save();
        int alpha = this.textPaint.getAlpha();
        int i = 0;
        while (i < max) {
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
                        this.textPaint.setAlpha((int) (f2 * (1.0f - this.progress)));
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
                    if (i == max - 1 || staticLayout != null) {
                        this.textPaint.setAlpha((int) (alpha * (this.progress + 1.0f)));
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
}
