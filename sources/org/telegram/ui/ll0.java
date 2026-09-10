package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 implements Runnable {
    public final int f34737a;
    public final PasscodeActivity f34738b;

    public ll0(PasscodeActivity passcodeActivity, int i10) {
        this.f34737a = i10;
        this.f34738b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f34737a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f34738b;
                passcodeActivity.f30001n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f34738b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                bc0 bc0Var = passcodeActivity3.Q;
                if (bc0Var != null) {
                    AndroidUtilities.runOnUIThread(bc0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f34738b;
                ll0 ll0Var = new ll0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ll0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f34738b;
                if (passcodeActivity5.e0()) {
                    for (hs hsVar : passcodeActivity5.f30001n.f32906f) {
                        hsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f30000f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f34738b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f30002r, false);
                return;
            default:
                this.f34738b.k0();
                return;
        }
    }
}
