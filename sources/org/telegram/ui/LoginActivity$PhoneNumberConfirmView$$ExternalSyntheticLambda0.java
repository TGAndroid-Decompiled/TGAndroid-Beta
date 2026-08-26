package org.telegram.ui;

import android.animation.ValueAnimator;

public final class LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final LoginActivity.PhoneNumberConfirmView f$0;

    public LoginActivity$PhoneNumberConfirmView$$ExternalSyntheticLambda0(LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView, int i) {
        this.$r8$classId = i;
        this.f$0 = phoneNumberConfirmView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$show$4(valueAnimator);
                break;
            default:
                this.f$0.lambda$dismiss$5(valueAnimator);
                break;
        }
    }
}
