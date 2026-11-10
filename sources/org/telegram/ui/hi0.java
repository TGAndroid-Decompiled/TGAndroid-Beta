package org.telegram.ui;
public final class hi0 implements Runnable {
    public final int f46361a;
    public final PasscodeActivity f46362b;
    public final boolean f46363c;

    public hi0(PasscodeActivity passcodeActivity, boolean z9, int i7) {
        this.f46361a = i7;
        this.f46362b = passcodeActivity;
        this.f46363c = z9;
    }

    @Override
    public final void run() {
        switch (this.f46361a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f46362b;
                passcodeActivity.getMediaDataController().m();
                if (this.f46363c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    o90 o90Var = passcodeActivity.U;
                    if (o90Var != null) {
                        org.telegram.messenger.g0.h3(o90Var);
                        passcodeActivity.U = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.qs.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f46362b;
                passcodeActivity2.f41332x.e(true, this.f46363c);
                org.telegram.messenger.g0.r(passcodeActivity2.T);
                return;
        }
    }
}
