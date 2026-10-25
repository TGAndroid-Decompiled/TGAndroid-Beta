package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class fl0 implements Runnable {
    public final int f39411a;
    public final PasscodeActivity f39412b;

    public fl0(PasscodeActivity passcodeActivity, int i10) {
        this.f39411a = i10;
        this.f39412b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f39411a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39412b;
                passcodeActivity.f35594n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f39412b;
                zc1 zc1Var = passcodeActivity2.V;
                if (zc1Var != null) {
                    AndroidUtilities.runOnUIThread(zc1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f39412b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                hb0 hb0Var = passcodeActivity4.U;
                if (hb0Var != null) {
                    AndroidUtilities.runOnUIThread(hb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f39412b;
                fl0 fl0Var = new fl0(passcodeActivity5, 4);
                if (passcodeActivity5.o0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(fl0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f39412b;
                if (passcodeActivity6.o0()) {
                    for (xr xrVar : passcodeActivity6.f35594n.f44894f) {
                        xrVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f35593f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f39412b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f35595r, false);
                return;
            default:
                this.f39412b.u0();
                return;
        }
    }
}
