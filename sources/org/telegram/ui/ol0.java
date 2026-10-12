package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ol0 implements Runnable {
    public final int f40742a;
    public final PasscodeActivity f40743b;

    public ol0(PasscodeActivity passcodeActivity, int i10) {
        this.f40742a = i10;
        this.f40743b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f40742a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40743b;
                passcodeActivity.f33693n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f40743b;
                org.telegram.ui.Wallet.s sVar = passcodeActivity2.V;
                if (sVar != null) {
                    AndroidUtilities.runOnUIThread(sVar);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f40743b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                ac0 ac0Var = passcodeActivity4.U;
                if (ac0Var != null) {
                    AndroidUtilities.runOnUIThread(ac0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f40743b;
                ol0 ol0Var = new ol0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(ol0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f40743b;
                if (passcodeActivity6.h0()) {
                    for (hs hsVar : passcodeActivity6.f33693n.f37834f) {
                        hsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33692f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f40743b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33694r, false);
                return;
            default:
                this.f40743b.n0();
                return;
        }
    }
}
