package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.EditTextBoldCursor;

public final class TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final TwoStepVerificationSetupActivity f$0;

    public TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(TwoStepVerificationSetupActivity twoStepVerificationSetupActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = twoStepVerificationSetupActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity = this.f$0;
                EditTextBoldCursor editTextBoldCursor = twoStepVerificationSetupActivity.editTextFirstRow;
                if (editTextBoldCursor != null && editTextBoldCursor.getVisibility() == 0) {
                    twoStepVerificationSetupActivity.editTextFirstRow.requestFocus();
                    AndroidUtilities.showKeyboard(twoStepVerificationSetupActivity.editTextFirstRow);
                    break;
                }
                break;
            case 1:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity2 = this.f$0;
                PasscodeActivity.AnonymousClass8 anonymousClass8 = twoStepVerificationSetupActivity2.codeFieldContainer;
                if (anonymousClass8 != null && anonymousClass8.getVisibility() == 0) {
                    twoStepVerificationSetupActivity2.codeFieldContainer.codeField[0].requestFocus();
                    break;
                }
                break;
            case 2:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity3 = this.f$0;
                EditTextBoldCursor editTextBoldCursor2 = twoStepVerificationSetupActivity3.editTextFirstRow;
                if (editTextBoldCursor2 != null) {
                    if (editTextBoldCursor2.length() != 0) {
                        twoStepVerificationSetupActivity3.animationDrawables[2].setCustomEndFrame(49);
                        twoStepVerificationSetupActivity3.animationDrawables[2].setProgress(0.0f, false);
                        twoStepVerificationSetupActivity3.imageView.playAnimation();
                    } else {
                        twoStepVerificationSetupActivity3.setRandomMonkeyIdleAnimation(true);
                    }
                    break;
                }
                break;
            case 3:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity4 = this.f$0;
                if (twoStepVerificationSetupActivity4.setAnimationRunnable != null) {
                    twoStepVerificationSetupActivity4.setRandomMonkeyIdleAnimation(false);
                    break;
                }
                break;
            case 4:
                this.f$0.lambda$processNext$33();
                break;
            case 5:
                TwoStepVerificationSetupActivity twoStepVerificationSetupActivity5 = this.f$0;
                twoStepVerificationSetupActivity5.getClass();
                AndroidUtilities.runOnUIThread(new TwoStepVerificationSetupActivity$$ExternalSyntheticLambda12(twoStepVerificationSetupActivity5, 6), 150L);
                break;
            default:
                for (CodeNumberField codeNumberField : this.f$0.codeFieldContainer.codeField) {
                    CodeNumberField.animateSpring(codeNumberField.errorSpringAnimation, 0.0f);
                }
                break;
        }
    }
}
