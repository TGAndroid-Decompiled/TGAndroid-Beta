package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class al0 implements Runnable {
    public final int f35214a;
    public final PasscodeActivity f35215b;

    public al0(PasscodeActivity passcodeActivity, int i10) {
        this.f35214a = i10;
        this.f35215b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f35214a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f35215b;
                passcodeActivity.f34211n.postDelayed(passcodeActivity.L, 3000L);
                passcodeActivity.K = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f35215b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                rb0 rb0Var = passcodeActivity3.N;
                if (rb0Var != null) {
                    AndroidUtilities.runOnUIThread(rb0Var);
                    passcodeActivity3.N = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f35215b;
                al0 al0Var = new al0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(al0Var, j10);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f35215b;
                if (passcodeActivity5.e0()) {
                    for (cs csVar : passcodeActivity5.f34211n.f44011f) {
                        csVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f34210f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f35215b;
                passcodeActivity6.K = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f34212r, false);
                return;
            default:
                this.f35215b.k0();
                return;
        }
    }
}
