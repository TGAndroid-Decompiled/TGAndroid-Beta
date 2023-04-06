package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public class SubstringLayoutAnimator {
    private StaticLayout animateInLayout;
    private StaticLayout animateOutLayout;
    private StaticLayout animateStableLayout;
    public boolean animateTextChange;
    private boolean animateTextChangeOut;
    private float hintProgress;
    private final View parentView;
    private boolean replaceAnimation;
    ValueAnimator valueAnimator;
    private float xOffset;

    public SubstringLayoutAnimator(View view) {
        this.parentView = view;
    }

    public void create(StaticLayout staticLayout, CharSequence charSequence, CharSequence charSequence2, TextPaint textPaint) {
        String charSequence3;
        String charSequence4;
        boolean z;
        if (staticLayout == null || charSequence.equals(charSequence2)) {
            return;
        }
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (charSequence.length() > charSequence2.length()) {
            charSequence3 = charSequence.toString();
            charSequence4 = charSequence2.toString();
            z = true;
        } else {
            charSequence3 = charSequence2.toString();
            charSequence4 = charSequence.toString();
            z = false;
        }
        int indexOf = charSequence3.indexOf(charSequence4);
        if (indexOf >= 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence3);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(charSequence3);
            if (indexOf != 0) {
                spannableStringBuilder2.setSpan(new EmptyStubSpan(), 0, indexOf, 0);
            }
            if (charSequence4.length() + indexOf != charSequence3.length()) {
                spannableStringBuilder2.setSpan(new EmptyStubSpan(), charSequence4.length() + indexOf, charSequence3.length(), 0);
            }
            spannableStringBuilder.setSpan(new EmptyStubSpan(), indexOf, charSequence4.length() + indexOf, 0);
            this.animateInLayout = new StaticLayout(spannableStringBuilder, textPaint, AndroidUtilities.dp(400.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder2, textPaint, AndroidUtilities.dp(400.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.animateStableLayout = staticLayout2;
            this.animateTextChange = true;
            this.animateTextChangeOut = z;
            this.xOffset = indexOf == 0 ? 0.0f : -staticLayout2.getPrimaryHorizontal(indexOf);
            this.animateOutLayout = null;
            this.replaceAnimation = false;
        } else {
            this.animateInLayout = new StaticLayout(charSequence2, textPaint, AndroidUtilities.dp(400.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.animateOutLayout = new StaticLayout(charSequence, textPaint, AndroidUtilities.dp(400.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.animateStableLayout = null;
            this.animateTextChange = true;
            this.replaceAnimation = true;
            this.xOffset = 0.0f;
        }
        this.hintProgress = 0.0f;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.valueAnimator = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                SubstringLayoutAnimator.this.lambda$create$0(valueAnimator2);
            }
        });
        this.valueAnimator.addListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                SubstringLayoutAnimator.this.animateTextChange = false;
            }
        });
        this.valueAnimator.setDuration(150L);
        this.valueAnimator.setInterpolator(CubicBezierInterpolator.DEFAULT);
        this.valueAnimator.start();
    }

    public void lambda$create$0(ValueAnimator valueAnimator) {
        this.hintProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.parentView.invalidate();
    }

    public void draw(Canvas canvas, TextPaint textPaint) {
        if (this.animateTextChange) {
            float f = this.xOffset * (this.animateTextChangeOut ? this.hintProgress : 1.0f - this.hintProgress);
            int alpha = textPaint.getAlpha();
            if (this.animateStableLayout != null) {
                canvas.save();
                canvas.translate(f, 0.0f);
                this.animateStableLayout.draw(canvas);
                canvas.restore();
            }
            if (this.animateInLayout != null) {
                float f2 = this.animateTextChangeOut ? 1.0f - this.hintProgress : this.hintProgress;
                canvas.save();
                textPaint.setAlpha((int) (alpha * f2));
                canvas.translate(f, 0.0f);
                if (this.replaceAnimation) {
                    float f3 = (f2 * 0.1f) + 0.9f;
                    canvas.scale(f3, f3, f, this.parentView.getMeasuredHeight() / 2.0f);
                }
                this.animateInLayout.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
            if (this.animateOutLayout != null) {
                float f4 = this.animateTextChangeOut ? this.hintProgress : 1.0f - this.hintProgress;
                canvas.save();
                textPaint.setAlpha((int) (alpha * (this.animateTextChangeOut ? this.hintProgress : 1.0f - this.hintProgress)));
                canvas.translate(f, 0.0f);
                if (this.replaceAnimation) {
                    float f5 = (f4 * 0.1f) + 0.9f;
                    canvas.scale(f5, f5, f, this.parentView.getMeasuredHeight() / 2.0f);
                }
                this.animateOutLayout.draw(canvas);
                canvas.restore();
                textPaint.setAlpha(alpha);
            }
        }
    }

    public void cancel() {
        ValueAnimator valueAnimator = this.valueAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animateTextChange = false;
    }
}
