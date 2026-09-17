package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 implements Runnable {
    public final int f35581a;
    public final PasscodeActivity f35582b;

    public ll0(PasscodeActivity passcodeActivity, int i10) {
        this.f35581a = i10;
        this.f35582b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f35581a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35582b;
                passcodeActivity.f30902n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f35582b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                cc0 cc0Var = passcodeActivity3.Q;
                if (cc0Var != null) {
                    AndroidUtilities.runOnUIThread(cc0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f35582b;
                ll0 ll0Var = new ll0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ll0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f35582b;
                if (passcodeActivity5.e0()) {
                    for (is isVar : passcodeActivity5.f30902n.f33749f) {
                        isVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f30901f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f35582b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f30903r, false);
                return;
            default:
                this.f35582b.k0();
                return;
        }
    }
}
