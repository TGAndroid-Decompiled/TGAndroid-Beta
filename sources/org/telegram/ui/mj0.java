package org.telegram.ui;
public final class mj0 implements Runnable {
    public final int f39713a;
    public final PasscodeActivity f39714b;
    public final boolean f39715c;

    public mj0(PasscodeActivity passcodeActivity, boolean z10, int i10) {
        this.f39713a = i10;
        this.f39714b = passcodeActivity;
        this.f39715c = z10;
    }

    @Override
    public final void run() {
        switch (this.f39713a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f39714b;
                passcodeActivity.getMediaDataController().m();
                if (this.f39715c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    qa0 qa0Var = passcodeActivity.U;
                    if (qa0Var != null) {
                        org.telegram.messenger.i0.g3(qa0Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.zs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f39714b;
                passcodeActivity2.f33425x.e(true, this.f39715c);
                org.telegram.messenger.i0.r(passcodeActivity2.T);
                return;
        }
    }
}
