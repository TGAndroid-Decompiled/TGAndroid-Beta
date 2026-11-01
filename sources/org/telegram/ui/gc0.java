package org.telegram.ui;
public final class gc0 implements org.telegram.ui.Components.uu0 {
    public final int f37449a;
    public final org.telegram.ui.ActionBar.k2 f37450b;

    public gc0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f37449a = i10;
        this.f37450b = k2Var;
    }

    @Override
    public final void L(int i10, boolean z10) {
        we0 we0Var;
        kj0 kj0Var;
        switch (this.f37449a) {
            case 0:
                gf0 gf0Var = (gf0) this.f37450b;
                if (i10 > org.telegram.messenger.i0.L(20.0f) && gf0Var.q1()) {
                    org.telegram.messenger.i0.v1(gf0Var.fragmentView);
                }
                if (i10 <= org.telegram.messenger.i0.L(20.0f) && (we0Var = gf0Var.T) != null) {
                    we0Var.run();
                    gf0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37450b;
                if (i10 >= org.telegram.messenger.i0.L(20.0f) && (kj0Var = passcodeActivity.T) != null) {
                    kj0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
