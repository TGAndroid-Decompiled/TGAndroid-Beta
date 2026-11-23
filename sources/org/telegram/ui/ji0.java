package org.telegram.ui;
public final class ji0 implements Runnable {
    public final int f49004a;
    public final PasscodeActivity f49005b;
    public final boolean f49006c;

    public ji0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f49004a = i7;
        this.f49005b = passcodeActivity;
        this.f49006c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49004a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f49005b;
                passcodeActivity.getMediaDataController().o();
                if (this.f49006c) {
                    passcodeActivity.presentFragment(new PasscodeActivity(0), true);
                    l90 l90Var = passcodeActivity.V;
                    if (l90Var != null) {
                        org.telegram.messenger.g0.g3(l90Var);
                        passcodeActivity.V = null;
                    }
                } else {
                    passcodeActivity.finishFragment();
                }
                org.telegram.messenger.ls.e().k(50, new Object[0]);
                return;
            default:
                PasscodeActivity passcodeActivity2 = this.f49005b;
                passcodeActivity2.f43192x.e(true, this.f49006c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
