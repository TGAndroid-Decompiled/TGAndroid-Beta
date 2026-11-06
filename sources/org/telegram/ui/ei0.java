package org.telegram.ui;
public final class ei0 implements Runnable {
    public final int f45353a;
    public final PasscodeActivity f45354b;
    public final boolean f45355c;

    public ei0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.f45353a = i7;
        this.f45354b = passcodeActivity;
        this.f45355c = z9;
    }

    @Override
    public final void run() {
        switch (this.f45353a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f45354b;
                passcodeActivity.getMediaDataController().m();
                if (this.f45355c) {
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
                PasscodeActivity passcodeActivity2 = this.f45354b;
                passcodeActivity2.f41330x.e(true, this.f45355c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                return;
        }
    }
}
