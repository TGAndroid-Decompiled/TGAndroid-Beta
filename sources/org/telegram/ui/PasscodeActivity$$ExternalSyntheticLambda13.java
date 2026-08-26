package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class PasscodeActivity$$ExternalSyntheticLambda13 implements Runnable {
    public final int $r8$classId;
    public final PasscodeActivity f$0;
    public final boolean f$1;

    public PasscodeActivity$$ExternalSyntheticLambda13(PasscodeActivity passcodeActivity, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeActivity;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                PasscodeActivity passcodeActivity = this.f$0;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f$1) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    LinkManager$$ExternalSyntheticLambda7 linkManager$$ExternalSyntheticLambda7 = passcodeActivity.openedSettings;
                    if (linkManager$$ExternalSyntheticLambda7 != null) {
                        AndroidUtilities.runOnUIThread(linkManager$$ExternalSyntheticLambda7);
                        passcodeActivity.openedSettings = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                break;
            default:
                PasscodeActivity passcodeActivity2 = this.f$0;
                passcodeActivity2.floatingButton.animatorButtonVisible.setValue(true, this.f$1);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.onShowKeyboardCallback);
                break;
        }
    }
}
