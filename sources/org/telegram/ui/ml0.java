package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ml0 implements Runnable {
    public final int f35841a;
    public final PasscodeActivity f35842b;
    public final boolean f35843c;

    public ml0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f35841a = i10;
        this.f35842b = passcodeActivity;
        this.f35843c = z10;
    }

    @Override
    public final void run() {
        switch (this.f35841a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35842b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35843c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    cc0 cc0Var = passcodeActivity.Q;
                    if (cc0Var != null) {
                        AndroidUtilities.runOnUIThread(cc0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35842b;
                passcodeActivity2.f30908w.e(true, this.f35843c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
