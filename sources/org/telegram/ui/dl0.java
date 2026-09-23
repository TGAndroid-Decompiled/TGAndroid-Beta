package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class dl0 implements Runnable {
    public final int f32680a;
    public final PasscodeActivity f32681b;

    public dl0(PasscodeActivity passcodeActivity, int i10) {
        this.f32680a = i10;
        this.f32681b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f32680a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f32681b;
                passcodeActivity.f30859n.postDelayed(passcodeActivity.O, 3000L);
                passcodeActivity.N = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f32681b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                vb0 vb0Var = passcodeActivity3.Q;
                if (vb0Var != null) {
                    AndroidUtilities.runOnUIThread(vb0Var);
                    passcodeActivity3.Q = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f32681b;
                dl0 dl0Var = new dl0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(dl0Var, j3);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f32681b;
                if (passcodeActivity5.e0()) {
                    for (bs bsVar : passcodeActivity5.f30859n.f40230f) {
                        bsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f30858f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f32681b;
                passcodeActivity6.N = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f30860r, false);
                return;
            default:
                this.f32681b.k0();
                return;
        }
    }
}
