package org.telegram.ui;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

public final class CodeNumberField$$ExternalSyntheticLambda8 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CodeNumberField f$0;

    public CodeNumberField$$ExternalSyntheticLambda8(CodeNumberField codeNumberField, int i) {
        this.$r8$classId = i;
        this.f$0 = codeNumberField;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                CodeNumberField codeNumberField = this.f$0;
                codeNumberField.getClass();
                codeNumberField.exitAnimation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                codeNumberField.invalidate();
                if (codeNumberField.getParent() != null) {
                    ((ViewGroup) codeNumberField.getParent()).invalidate();
                }
                break;
            default:
                CodeNumberField codeNumberField2 = this.f$0;
                codeNumberField2.getClass();
                codeNumberField2.enterAnimation = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                codeNumberField2.invalidate();
                if (codeNumberField2.getParent() != null) {
                    ((ViewGroup) codeNumberField2.getParent()).invalidate();
                }
                break;
        }
    }
}
