package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class al0 implements Runnable {
    public final int f32608a;
    public final PasscodeActivity f32609b;

    public al0(PasscodeActivity passcodeActivity, int i10) {
        this.f32608a = i10;
        this.f32609b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f32608a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f32609b;
                passcodeActivity.f31660n.postDelayed(passcodeActivity.L, 3000L);
                passcodeActivity.K = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity3 = this.f32609b;
                passcodeActivity3.presentFragment(passcodeActivity2, true);
                sb0 sb0Var = passcodeActivity3.N;
                if (sb0Var != null) {
                    AndroidUtilities.runOnUIThread(sb0Var);
                    passcodeActivity3.N = null;
                    return;
                }
                return;
            case 2:
                PasscodeActivity passcodeActivity4 = this.f32609b;
                al0 al0Var = new al0(passcodeActivity4, 3);
                if (passcodeActivity4.e0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                AndroidUtilities.runOnUIThread(al0Var, j10);
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f32609b;
                if (passcodeActivity5.e0()) {
                    for (ds dsVar : passcodeActivity5.f31660n.f32635f) {
                        dsVar.i(0.0f);
                    }
                    return;
                }
                passcodeActivity5.f31659f.a(0.0f);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f32609b;
                passcodeActivity6.K = false;
                AndroidUtilities.updateViewVisibilityAnimated(passcodeActivity6.f31661r, false);
                return;
            default:
                this.f32609b.k0();
                return;
        }
    }
}
