package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gl0 implements Runnable {
    public final int f33974a;
    public final PasscodeActivity f33975b;

    public gl0(PasscodeActivity passcodeActivity, int i10) {
        this.f33974a = i10;
        this.f33975b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f33974a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f33975b;
                passcodeActivity.f31176n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f33975b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                xb0 xb0Var = passcodeActivity3.Q;
                if (xb0Var != null) {
                    AndroidUtilities.runOnUIThread(xb0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f33975b;
                gl0 gl0Var = new gl0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(gl0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f33975b;
                if (passcodeActivity5.e0()) {
                    for (ds dsVar : passcodeActivity5.f31176n.f32431f) {
                        dsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f31175f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f33975b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f31177r, false);
                return;
            default:
                this.f33975b.k0();
                return;
        }
    }
}
