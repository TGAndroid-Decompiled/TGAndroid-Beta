package org.telegram.ui;
public final class ab0 implements org.telegram.ui.Components.st0 {
    public final int f43659a;
    public final org.telegram.ui.ActionBar.f2 f43660b;

    public ab0(int i7, org.telegram.ui.ActionBar.f2 f2Var) {
        this.f43659a = i7;
        this.f43660b = f2Var;
    }

    @Override
    public final void K(int i7, boolean z9) {
        sd0 sd0Var;
        gi0 gi0Var;
        switch (this.f43659a) {
            case 0:
                ee0 ee0Var = (ee0) this.f43660b;
                if (i7 > org.telegram.messenger.g0.L(20.0f) && ee0Var.z1()) {
                    org.telegram.messenger.g0.v1(ee0Var.fragmentView);
                }
                if (i7 <= org.telegram.messenger.g0.L(20.0f) && (sd0Var = ee0Var.T) != null) {
                    sd0Var.run();
                    ee0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f43660b;
                if (i7 >= org.telegram.messenger.g0.L(20.0f) && (gi0Var = passcodeActivity.T) != null) {
                    gi0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
