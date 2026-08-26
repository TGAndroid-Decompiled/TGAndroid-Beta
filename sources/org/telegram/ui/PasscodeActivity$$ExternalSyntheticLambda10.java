package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.OutlineTextContainerView;

public final class PasscodeActivity$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final PasscodeActivity f$0;

    public PasscodeActivity$$ExternalSyntheticLambda10(PasscodeActivity passcodeActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeActivity;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.showKeyboard$1();
                break;
            case 1:
                PasscodeActivity passcodeActivity = this.f$0;
                passcodeActivity.postedHidePasscodesDoNotMatch = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity.passcodesDoNotMatchTextView, false);
                break;
            case 2:
                PasscodeActivity passcodeActivity2 = this.f$0;
                passcodeActivity2.codeFieldContainer.postDelayed(passcodeActivity2.hidePasscodesDoNotMatch, 3000L);
                passcodeActivity2.postedHidePasscodesDoNotMatch = true;
                break;
            case 3:
                PasscodeActivity passcodeActivity3 = this.f$0;
                passcodeActivity3.getClass();
                passcodeActivity3.presentFragment(new PasscodeActivity(0), true);
                LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = passcodeActivity3.openedSettings;
                if (linkManager$$ExternalSyntheticLambda7 != null) {
                    AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                    passcodeActivity3.openedSettings = null;
                }
                break;
            case 4:
                PasscodeActivity passcodeActivity4 = this.f$0;
                passcodeActivity4.getClass();
                AndroidUtilities.runOnUIThread(new PasscodeActivity$$ExternalSyntheticLambda10(passcodeActivity4, 5), passcodeActivity4.isPinCode() ? 150L : 1000L);
                break;
            default:
                PasscodeActivity passcodeActivity5 = this.f$0;
                if (passcodeActivity5.isPinCode()) {
                    for (CodeNumberField codeNumberField : passcodeActivity5.codeFieldContainer.codeField) {
                        CodeNumberField.animateSpring(codeNumberField.errorSpringAnimation, 0.0f);
                    }
                } else {
                    OutlineTextContainerView.animateSpring(passcodeActivity5.outlinePasswordView.errorSpring, 0.0f);
                }
                break;
        }
    }
}
