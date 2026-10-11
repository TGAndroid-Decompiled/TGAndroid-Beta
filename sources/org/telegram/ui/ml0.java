package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ml0 implements Runnable {
    public final int f39999a;
    public final PasscodeActivity f40000b;

    public ml0(PasscodeActivity passcodeActivity, int i10) {
        this.f39999a = i10;
        this.f40000b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f39999a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40000b;
                passcodeActivity.f33916n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f40000b;
                org.telegram.ui.Wallet.i iVar = passcodeActivity2.V;
                if (iVar != null) {
                    AndroidUtilities.runOnUIThread(iVar);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f40000b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                yb0 yb0Var = passcodeActivity4.U;
                if (yb0Var != null) {
                    AndroidUtilities.runOnUIThread(yb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f40000b;
                ml0 ml0Var = new ml0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ml0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f40000b;
                if (passcodeActivity6.h0()) {
                    for (ds dsVar : passcodeActivity6.f33916n.f36484f) {
                        dsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33915f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f40000b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33917r, false);
                return;
            default:
                this.f40000b.n0();
                return;
        }
    }
}
