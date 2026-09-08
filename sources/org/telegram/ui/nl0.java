package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class nl0 implements Runnable {
    public final int f39007a;
    public final PasscodeActivity f39008b;
    public final boolean f39009c;

    public nl0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39007a = i10;
        this.f39008b = passcodeActivity;
        this.f39009c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39007a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39008b;
                passcodeActivity.getMediaDataController().buildShortcuts();
                if (this.f39009c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    ac0 ac0Var = passcodeActivity.Q;
                    if (ac0Var != null) {
                        AndroidUtilities.runOnUIThread(ac0Var);
                        passcodeActivity.Q = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didSetPasscode, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f39008b;
                passcodeActivity2.f33530w.e(true, this.f39009c);
                AndroidUtilities.cancelRunOnUIThread(passcodeActivity2.P);
                return;
        }
    }
}
