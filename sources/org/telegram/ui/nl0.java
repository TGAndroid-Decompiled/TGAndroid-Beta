package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nl0 implements Runnable {
    public final int f40232a;
    public final PasscodeActivity f40233b;

    public nl0(PasscodeActivity passcodeActivity, int i10) {
        this.f40232a = i10;
        this.f40233b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j3;
        switch (this.f40232a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f40233b;
                passcodeActivity.f33854n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f40233b;
                ii1 ii1Var = passcodeActivity2.V;
                if (ii1Var != null) {
                    AndroidUtilities.runOnUIThread(ii1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f40233b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                zb0 zb0Var = passcodeActivity4.U;
                if (zb0Var != null) {
                    AndroidUtilities.runOnUIThread(zb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f40233b;
                nl0 nl0Var = new nl0(passcodeActivity5, 4);
                if (passcodeActivity5.h0()) {
                    j3 = 150;
                } else {
                    j3 = 1000;
                }
                AndroidUtilities.runOnUIThread(nl0Var, j3);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f40233b;
                if (passcodeActivity6.h0()) {
                    for (es esVar : passcodeActivity6.f33854n.f36734f) {
                        esVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f33853f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f40233b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f33855r, false);
                return;
            default:
                this.f40233b.n0();
                return;
        }
    }
}
