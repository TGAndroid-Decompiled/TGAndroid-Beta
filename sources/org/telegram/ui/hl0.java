package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hl0 implements Runnable {
    public final int f39929a;
    public final PasscodeActivity f39930b;

    public hl0(PasscodeActivity passcodeActivity, int i10) {
        this.f39929a = i10;
        this.f39930b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f39929a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39930b;
                passcodeActivity.f35621n.postDelayed(passcodeActivity.S, 3000L);
                passcodeActivity.R = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f39930b;
                yc1 yc1Var = passcodeActivity2.V;
                if (yc1Var != null) {
                    AndroidUtilities.runOnUIThread(yc1Var);
                    passcodeActivity2.V = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f39930b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                jb0 jb0Var = passcodeActivity4.U;
                if (jb0Var != null) {
                    AndroidUtilities.runOnUIThread(jb0Var);
                    passcodeActivity4.U = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f39930b;
                hl0 hl0Var = new hl0(passcodeActivity5, 4);
                if (passcodeActivity5.o0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(hl0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f39930b;
                if (passcodeActivity6.o0()) {
                    for (zr zrVar : passcodeActivity6.f35621n.f45772f) {
                        zrVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f35620f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f39930b;
                passcodeActivity7.R = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity7.f35622r, false);
                return;
            default:
                this.f39930b.u0();
                return;
        }
    }
}
