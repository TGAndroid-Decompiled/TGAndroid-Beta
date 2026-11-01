package org.telegram.ui;
public final class kj0 implements Runnable {
    public final int f38901a;
    public final PasscodeActivity f38902b;
    public final boolean f38903c;

    public kj0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f38901a = i10;
        this.f38902b = passcodeActivity;
        this.f38903c = z10;
    }

    @Override
    public final void run() {
        switch (this.f38901a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f38902b;
                passcodeActivity.getMediaDataController().m();
                if (this.f38903c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    pa0 pa0Var = passcodeActivity.U;
                    if (pa0Var != null) {
                        org.telegram.messenger.i0.g3(pa0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.at.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f38902b;
                passcodeActivity2.f33432x.e(true, this.f38903c);
                org.telegram.messenger.i0.r(passcodeActivity2.T);
                return;
        }
    }
}
