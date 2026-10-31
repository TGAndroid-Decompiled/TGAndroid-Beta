package org.telegram.ui;
public final class hc0 implements org.telegram.ui.Components.tu0 {
    public final int f37888a;
    public final org.telegram.ui.ActionBar.k2 f37889b;

    public hc0(int i10, org.telegram.ui.ActionBar.k2 k2Var) {
        this.f37888a = i10;
        this.f37889b = k2Var;
    }

    @Override
    public final void K(int i10, boolean z10) {
        xe0 xe0Var;
        mj0 mj0Var;
        switch (this.f37888a) {
            case 0:
                hf0 hf0Var = (hf0) this.f37889b;
                if (i10 > org.telegram.messenger.i0.L(20.0f) && hf0Var.p1()) {
                    org.telegram.messenger.i0.v1(hf0Var.fragmentView);
                }
                if (i10 <= org.telegram.messenger.i0.L(20.0f) && (xe0Var = hf0Var.T) != null) {
                    xe0Var.run();
                    hf0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37889b;
                if (i10 >= org.telegram.messenger.i0.L(20.0f) && (mj0Var = passcodeActivity.T) != null) {
                    mj0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
