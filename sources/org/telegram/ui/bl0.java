package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class bl0 implements Runnable {
    public final int f35551a;
    public final PasscodeActivity f35552b;
    public final boolean f35553c;

    public bl0(PasscodeActivity passcodeActivity, boolean z4, int i10) {
        this.f35551a = i10;
        this.f35552b = passcodeActivity;
        this.f35553c = z4;
    }

    @Override
    public final void run() {
        switch (this.f35551a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35552b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f35553c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    rb0 rb0Var = passcodeActivity.N;
                    if (rb0Var != null) {
                        AndroidUtilities.runOnUIThread(rb0Var);
                        passcodeActivity.N = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f35552b;
                passcodeActivity2.f34214w.e(true, this.f35553c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.M);
                return;
        }
    }
}
