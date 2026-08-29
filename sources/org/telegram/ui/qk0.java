package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qk0 implements Runnable {
    public final int f41742a;
    public final PasscodeActivity f41743b;

    public qk0(PasscodeActivity passcodeActivity, int i10) {
        this.f41742a = i10;
        this.f41743b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f41742a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f41743b;
                passcodeActivity.f35637n.postDelayed(passcodeActivity.K, 3000L);
                passcodeActivity.J = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f41743b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                hb0 hb0Var = passcodeActivity3.M;
                if (hb0Var != null) {
                    AndroidUtilities.runOnUIThread(hb0Var);
                    passcodeActivity3.M = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f41743b;
                qk0 qk0Var = new qk0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(qk0Var, j10);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f41743b;
                if (passcodeActivity5.e0()) {
                    for (ur urVar : passcodeActivity5.f35637n.f42455f) {
                        urVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f35636f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f41743b;
                passcodeActivity6.J = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f35638r, false);
                return;
            default:
                this.f41743b.k0();
                return;
        }
    }
}
