package org.telegram.ui;

import android.animation.ValueAnimator;

public final class LoginActivity$$ExternalSyntheticLambda17 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LoginActivity f$0;

    public LoginActivity$$ExternalSyntheticLambda17(LoginActivity loginActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = loginActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setCustomKeyboardVisible$6(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$setCustomKeyboardVisible$7(valueAnimator);
                break;
            default:
                this.f$0.lambda$showEditDoneProgress$16(valueAnimator);
                break;
        }
    }
}
