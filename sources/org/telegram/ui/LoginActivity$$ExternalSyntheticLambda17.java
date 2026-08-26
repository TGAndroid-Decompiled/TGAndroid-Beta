package org.telegram.ui;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

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
                LoginActivity loginActivity = this.f$0;
                loginActivity.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                loginActivity.keyboardView.setAlpha(fFloatValue);
                loginActivity.keyboardView.setTranslationY((1.0f - fFloatValue) * AndroidUtilities.dp(230.0f));
                break;
            case 1:
                LoginActivity loginActivity2 = this.f$0;
                loginActivity2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                loginActivity2.keyboardView.setAlpha(fFloatValue2);
                loginActivity2.keyboardView.setTranslationY((1.0f - fFloatValue2) * AndroidUtilities.dp(230.0f));
                break;
            default:
                LoginActivity loginActivity3 = this.f$0;
                loginActivity3.getClass();
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f = (0.9f * fFloatValue3) + 0.1f;
                loginActivity3.radialProgressView.setScaleX(f);
                loginActivity3.radialProgressView.setScaleY(f);
                loginActivity3.radialProgressView.setAlpha(fFloatValue3);
                break;
        }
    }
}
