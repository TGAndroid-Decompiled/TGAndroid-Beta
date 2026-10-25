package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class gl0 implements Runnable {
    public final int f39711a;
    public final PasscodeActivity f39712b;
    public final boolean f39713c;

    public gl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39711a = i10;
        this.f39712b = passcodeActivity;
        this.f39713c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39711a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39712b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f39713c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    hb0 hb0Var = passcodeActivity.U;
                    if (hb0Var != null) {
                        AndroidUtilities.runOnUIThread(hb0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f39712b;
                passcodeActivity2.f35597w.e(true, this.f39713c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.T);
                return;
        }
    }
}
