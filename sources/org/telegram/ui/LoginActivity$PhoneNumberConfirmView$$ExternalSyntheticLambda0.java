package org.telegram.ui;

import android.animation.ValueAnimator;
import android.widget.FrameLayout;

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
                LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView = this.f$0;
                phoneNumberConfirmView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                phoneNumberConfirmView.fabTransform.setProgress(fFloatValue);
                phoneNumberConfirmView.blurredView.setAlpha(fFloatValue);
                phoneNumberConfirmView.dimmView.setAlpha(fFloatValue);
                FrameLayout frameLayout = phoneNumberConfirmView.popupLayout;
                frameLayout.setAlpha(fFloatValue);
                float f = (fFloatValue * 0.5f) + 0.5f;
                frameLayout.setScaleX(f);
                frameLayout.setScaleY(f);
                break;
            default:
                LoginActivity.PhoneNumberConfirmView phoneNumberConfirmView2 = this.f$0;
                phoneNumberConfirmView2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                phoneNumberConfirmView2.blurredView.setAlpha(fFloatValue2);
                phoneNumberConfirmView2.dimmView.setAlpha(fFloatValue2);
                phoneNumberConfirmView2.fabTransform.setProgress(fFloatValue2);
                FrameLayout frameLayout2 = phoneNumberConfirmView2.popupLayout;
                frameLayout2.setAlpha(fFloatValue2);
                float f2 = (fFloatValue2 * 0.5f) + 0.5f;
                frameLayout2.setScaleX(f2);
                frameLayout2.setScaleY(f2);
                break;
        }
    }
}
