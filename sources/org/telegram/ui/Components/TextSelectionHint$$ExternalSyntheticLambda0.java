package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class TextSelectionHint$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final TextSelectionHint f$0;

    public TextSelectionHint$$ExternalSyntheticLambda0(TextSelectionHint textSelectionHint, int i) {
        this.$r8$classId = i;
        this.f$0 = textSelectionHint;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                TextSelectionHint textSelectionHint = this.f$0;
                textSelectionHint.getClass();
                textSelectionHint.prepareProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHint.invalidate();
                break;
            case 1:
                TextSelectionHint textSelectionHint2 = this.f$0;
                textSelectionHint2.getClass();
                textSelectionHint2.prepareProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHint2.invalidate();
                break;
            case 2:
                TextSelectionHint textSelectionHint3 = this.f$0;
                textSelectionHint3.getClass();
                textSelectionHint3.enterValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHint3.invalidate();
                break;
            case 3:
                TextSelectionHint textSelectionHint4 = this.f$0;
                textSelectionHint4.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHint4.startOffsetValue = fFloatValue;
                textSelectionHint4.currentStart = (int) ((textSelectionHint4.start * fFloatValue) + 0);
                textSelectionHint4.invalidate();
                break;
            default:
                TextSelectionHint textSelectionHint5 = this.f$0;
                textSelectionHint5.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                textSelectionHint5.endOffsetValue = fFloatValue2;
                int i = textSelectionHint5.animateToEnd;
                textSelectionHint5.currentEnd = i + ((int) Math.ceil((textSelectionHint5.end - i) * fFloatValue2));
                textSelectionHint5.invalidate();
                break;
        }
    }
}
