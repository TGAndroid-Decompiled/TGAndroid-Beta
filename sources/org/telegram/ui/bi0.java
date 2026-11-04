package org.telegram.ui;
public final class bi0 implements Runnable {
    public final int f44050a;
    public final PasscodeActivity f44051b;
    public final boolean f44052c;

    public bi0(PasscodeActivity passcodeActivity, boolean z10, int i3) {
        this.f44050a = i3;
        this.f44051b = passcodeActivity;
        this.f44052c = z10;
    }

    @Override
    public final void run() {
        switch (this.f44050a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f44051b;
                passcodeActivity.getMediaDataController().m();
                if (this.f44052c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    i90 i90Var = passcodeActivity.V;
                    if (i90Var != null) {
                        org.telegram.messenger.g0.h3(i90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.hs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f44051b;
                passcodeActivity2.f41363x.e(true, this.f44052c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
