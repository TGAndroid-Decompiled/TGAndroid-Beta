package org.telegram.ui;
public final class ji0 implements Runnable {
    public final int f49008a;
    public final PasscodeActivity f49009b;
    public final boolean f49010c;

    public ji0(PasscodeActivity passcodeActivity, boolean z10, int i7) {
        this.f49008a = i7;
        this.f49009b = passcodeActivity;
        this.f49010c = z10;
    }

    @Override
    public final void run() {
        switch (this.f49008a) {
            case 0:
                PasscodeActivity passcodeActivity = this.f49009b;
                passcodeActivity.getMediaDataController().o();
                if (this.f49010c) {
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
                PasscodeActivity passcodeActivity2 = this.f49009b;
                passcodeActivity2.f43157x.e(true, this.f49010c);
                org.telegram.messenger.g0.r(passcodeActivity2.U);
                return;
        }
    }
}
