package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class jd0 implements org.telegram.ui.Components.pv0 {
    public final int f35322a;
    public final org.telegram.ui.ActionBar.p2 f35323b;

    public jd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35322a = i10;
        this.f35323b = p2Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        cg0 cg0Var;
        zk0 zk0Var;
        switch (this.f35322a) {
            case 0:
                ng0 ng0Var = (ng0) this.f35323b;
                if (i10 > AndroidUtilities.dp(20.0f) && ng0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ng0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (cg0Var = ng0Var.Q) != null) {
                    cg0Var.run();
                    ng0Var.Q = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35323b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.M) != null) {
                    zk0Var.run();
                    passcodeActivity.M = null;
                    return;
                }
                return;
        }
    }
}
