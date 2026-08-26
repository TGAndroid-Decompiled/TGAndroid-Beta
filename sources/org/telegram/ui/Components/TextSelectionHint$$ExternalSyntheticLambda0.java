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
                this.f$0.lambda$hideInternal$4(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$show$0(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$show$1(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$show$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$show$3(valueAnimator);
                break;
        }
    }
}
