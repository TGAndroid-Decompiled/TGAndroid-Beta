package org.telegram.ui;
public final class bb0 implements org.telegram.ui.Components.rt0 {
    public final int f43998a;
    public final org.telegram.ui.ActionBar.f2 f43999b;

    public bb0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f43998a = i7;
        this.f43999b = f2Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        td0 td0Var;
        hi0 hi0Var;
        switch (this.f43998a) {
            case 0:
                fe0 fe0Var = (fe0) this.f43999b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && fe0Var.z1()) {
                    org.telegram.messenger.g0.v1(fe0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (td0Var = fe0Var.T) != null) {
                    td0Var.run();
                    fe0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43999b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (hi0Var = passcodeActivity.T) != null) {
                    hi0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
