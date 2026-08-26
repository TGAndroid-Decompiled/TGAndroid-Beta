package org.telegram.ui;

import android.animation.ValueAnimator;

public final class CodeNumberField$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CodeNumberField f$0;

    public CodeNumberField$$ExternalSyntheticLambda0(CodeNumberField codeNumberField, int i) {
        this.$r8$classId = i;
        this.f$0 = codeNumberField;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startExitAnimation$8(valueAnimator);
                break;
            default:
                this.f$0.lambda$startEnterAnimation$9(valueAnimator);
                break;
        }
    }
}
