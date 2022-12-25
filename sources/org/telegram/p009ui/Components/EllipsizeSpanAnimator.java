package org.telegram.p009ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;

public class EllipsizeSpanAnimator {
    boolean attachedToWindow;
    private final AnimatorSet ellAnimator;
    private final TextAlphaSpan[] ellSpans;
    public ArrayList<View> ellipsizedViews;

    public EllipsizeSpanAnimator(final View view) {
        TextAlphaSpan[] textAlphaSpanArr = {new TextAlphaSpan(), new TextAlphaSpan(), new TextAlphaSpan()};
        this.ellSpans = textAlphaSpanArr;
        this.ellipsizedViews = new ArrayList<>();
        AnimatorSet animatorSet = new AnimatorSet();
        this.ellAnimator = animatorSet;
        animatorSet.playTogether(createEllipsizeAnimator(textAlphaSpanArr[0], 0, 255, 0, 300), createEllipsizeAnimator(textAlphaSpanArr[1], 0, 255, ImageReceiver.DEFAULT_CROSSFADE_DURATION, 300), createEllipsizeAnimator(textAlphaSpanArr[2], 0, 255, 300, 300), createEllipsizeAnimator(textAlphaSpanArr[0], 255, 0, 1000, 400), createEllipsizeAnimator(textAlphaSpanArr[1], 255, 0, 1000, 400), createEllipsizeAnimator(textAlphaSpanArr[2], 255, 0, 1000, 400));
        animatorSet.addListener(new AnimatorListenerAdapter() {
            private Runnable restarter = new Runnable() {
                @Override
                public void run() {
                    EllipsizeSpanAnimator ellipsizeSpanAnimator = EllipsizeSpanAnimator.this;
                    if (!ellipsizeSpanAnimator.attachedToWindow || ellipsizeSpanAnimator.ellipsizedViews.isEmpty() || EllipsizeSpanAnimator.this.ellAnimator.isRunning()) {
                        return;
                    }
                    try {
                        EllipsizeSpanAnimator.this.ellAnimator.start();
                    } catch (Exception unused) {
                    }
                }
            };

            @Override
            public void onAnimationEnd(Animator animator) {
                if (EllipsizeSpanAnimator.this.attachedToWindow) {
                    view.postDelayed(this.restarter, 300L);
                }
            }
        });
    }

    public void wrap(SpannableString spannableString, int i) {
        int i2 = i + 1;
        spannableString.setSpan(this.ellSpans[0], i, i2, 0);
        int i3 = i + 2;
        spannableString.setSpan(this.ellSpans[1], i2, i3, 0);
        spannableString.setSpan(this.ellSpans[2], i3, i + 3, 0);
    }

    public void onAttachedToWindow() {
        this.attachedToWindow = true;
        if (this.ellAnimator.isRunning()) {
            return;
        }
        this.ellAnimator.start();
    }

    public void onDetachedFromWindow() {
        this.attachedToWindow = false;
        this.ellAnimator.cancel();
    }

    public void reset() {
        for (TextAlphaSpan textAlphaSpan : this.ellSpans) {
            textAlphaSpan.setAlpha(0);
        }
    }

    private Animator createEllipsizeAnimator(final TextAlphaSpan textAlphaSpan, int i, int i2, int i3, int i4) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                EllipsizeSpanAnimator.this.lambda$createEllipsizeAnimator$0(textAlphaSpan, valueAnimator);
            }
        });
        ofInt.setDuration(i4);
        ofInt.setStartDelay(i3);
        ofInt.setInterpolator(CubicBezierInterpolator.DEFAULT);
        return ofInt;
    }

    public void lambda$createEllipsizeAnimator$0(TextAlphaSpan textAlphaSpan, ValueAnimator valueAnimator) {
        textAlphaSpan.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        for (int i = 0; i < this.ellipsizedViews.size(); i++) {
            this.ellipsizedViews.get(i).invalidate();
        }
    }

    public void addView(View view) {
        if (this.ellipsizedViews.isEmpty()) {
            this.ellAnimator.start();
        }
        if (this.ellipsizedViews.contains(view)) {
            return;
        }
        this.ellipsizedViews.add(view);
    }

    public void removeView(View view) {
        this.ellipsizedViews.remove(view);
        if (this.ellipsizedViews.isEmpty()) {
            this.ellAnimator.cancel();
        }
    }

    public static class TextAlphaSpan extends CharacterStyle {
        private int alpha = 0;

        public void setAlpha(int i) {
            this.alpha = i;
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setAlpha(this.alpha);
        }
    }
}
