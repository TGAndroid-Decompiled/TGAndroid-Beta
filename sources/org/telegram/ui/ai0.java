package org.telegram.ui;
public final class ai0 implements Runnable {
    public final int f43784a;
    public final PasscodeActivity f43785b;

    public ai0(PasscodeActivity passcodeActivity, int i3) {
        this.f43784a = i3;
        this.f43785b = passcodeActivity;
    }

    @Override
    public final void run() {
        long j10;
        switch (this.f43784a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f43785b;
                passcodeActivity.f41359n.postDelayed(passcodeActivity.T, 3000L);
                passcodeActivity.S = true;
                return;
            case 1:
                PasscodeActivity passcodeActivity2 = this.f43785b;
                ma1 ma1Var = passcodeActivity2.W;
                if (ma1Var != null) {
                    org.telegram.messenger.g0.h3(ma1Var);
                    passcodeActivity2.W = null;
                }
                passcodeActivity2.finishFragment();
                return;
            case 2:
                PasscodeActivity passcodeActivity3 = new PasscodeActivity(0);
                PasscodeActivity passcodeActivity4 = this.f43785b;
                passcodeActivity4.presentFragment(passcodeActivity3, true);
                i90 i90Var = passcodeActivity4.V;
                if (i90Var != null) {
                    org.telegram.messenger.g0.h3(i90Var);
                    passcodeActivity4.V = null;
                    return;
                }
                return;
            case 3:
                PasscodeActivity passcodeActivity5 = this.f43785b;
                ai0 ai0Var = new ai0(passcodeActivity5, 4);
                if (passcodeActivity5.s0()) {
                    j10 = 150;
                } else {
                    j10 = 1000;
                }
                org.telegram.messenger.g0.i3(ai0Var, j10);
                return;
            case 4:
                PasscodeActivity passcodeActivity6 = this.f43785b;
                if (passcodeActivity6.s0()) {
                    for (zq zqVar : passcodeActivity6.f41359n.f52078f) {
                        zqVar.z(0.0f);
                    }
                    return;
                }
                passcodeActivity6.f41358f.a(0.0f);
                return;
            case 5:
                PasscodeActivity passcodeActivity7 = this.f43785b;
                passcodeActivity7.S = false;
                org.telegram.messenger.g0.X3(passcodeActivity7.f41360r, false);
                return;
            default:
                this.f43785b.y0();
                return;
        }
    }
}
