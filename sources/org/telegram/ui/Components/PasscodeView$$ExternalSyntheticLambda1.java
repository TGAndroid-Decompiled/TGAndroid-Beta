package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;

public final class PasscodeView$$ExternalSyntheticLambda1 implements Runnable {
    public final int $r8$classId;
    public final PasscodeView f$0;

    public PasscodeView$$ExternalSyntheticLambda1(PasscodeView passcodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeView;
    }

    @Override
    public final void run() {
        EditTextBoldCursor editTextBoldCursor;
        PasscodeView passcodeView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                if (passcodeView.retryTextView.getVisibility() != 0 && (editTextBoldCursor = passcodeView.passwordEditText) != null) {
                    editTextBoldCursor.requestFocus();
                    AndroidUtilities.showKeyboard(editTextBoldCursor);
                    break;
                }
                break;
            default:
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(passcodeView.shownT, 0.0f);
                valueAnimatorOfFloat.addUpdateListener(new PasscodeView$$ExternalSyntheticLambda9(passcodeView, 1));
                valueAnimatorOfFloat.addListener(new ItemOptions.AnonymousClass3(passcodeView, 12));
                valueAnimatorOfFloat.setDuration(420L);
                valueAnimatorOfFloat.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                valueAnimatorOfFloat.start();
                break;
        }
    }
}
