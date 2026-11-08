package org.telegram.ui;
public final class ei0 implements Runnable {
    public final int f45312a;
    public final PasscodeActivity f45313b;
    public final boolean f45314c;

    public ei0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.f45312a = i7;
        this.f45313b = passcodeActivity;
        this.f45314c = z9;
    }

    @Override
    public final void run() {
        switch (this.f45312a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45313b;
                passcodeActivity.getMediaDataController().m();
                if (this.f45314c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    l90 l90Var = passcodeActivity.U;
                    if (l90Var != null) {
                        org.telegram.messenger.g0.h3(l90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f45313b;
                passcodeActivity2.f41334x.e(true, this.f45314c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                return;
        }
    }
}
