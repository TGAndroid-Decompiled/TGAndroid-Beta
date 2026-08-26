package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.PhotoViewer;

public final class PasscodeView$$ExternalSyntheticLambda9 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PasscodeView f$0;

    public PasscodeView$$ExternalSyntheticLambda9(PasscodeView passcodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PasscodeView passcodeView = this.f$0;
                passcodeView.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float fLerp = AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue);
                PhotoViewer.AnonymousClass19 anonymousClass19 = passcodeView.numbersFrameLayout;
                anonymousClass19.setScaleX(fLerp);
                anonymousClass19.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, fFloatValue));
                anonymousClass19.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
                TextView textView = passcodeView.passcodeTextView;
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, fFloatValue));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fFloatValue));
                passcodeView.passwordEditText2.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fFloatValue));
                break;
            default:
                PasscodeView passcodeView2 = this.f$0;
                passcodeView2.getClass();
                float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                passcodeView2.shownT = fFloatValue2;
                passcodeView2.onAnimationUpdate(fFloatValue2);
                passcodeView2.setAlpha(passcodeView2.shownT);
                break;
        }
    }
}
