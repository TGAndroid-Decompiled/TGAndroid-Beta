package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kd0 implements org.telegram.ui.Components.pv0 {
    public final int f38352a;
    public final org.telegram.ui.ActionBar.p2 f38353b;

    public kd0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f38352a = i10;
        this.f38353b = p2Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        dg0 dg0Var;
        bl0 bl0Var;
        switch (this.f38352a) {
            case 0:
                og0 og0Var = (og0) this.f38353b;
                if (i10 > AndroidUtilities.dp(20.0f) && og0Var.h1()) {
                    AndroidUtilities.hideKeyboard(og0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (dg0Var = og0Var.Q) != null) {
                    dg0Var.run();
                    og0Var.Q = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f38353b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (bl0Var = passcodeActivity.M) != null) {
                    bl0Var.run();
                    passcodeActivity.M = null;
                    return;
                }
                return;
        }
    }
}
