package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements org.telegram.ui.Components.zv0 {
    public final int f35332a;
    public final org.telegram.ui.ActionBar.m2 f35333b;

    public ld0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f35332a = i10;
        this.f35333b = m2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        fg0 fg0Var;
        el0 el0Var;
        switch (this.f35332a) {
            case 0:
                qg0 qg0Var = (qg0) this.f35333b;
                if (i10 > AndroidUtilities.dp(20.0f) && qg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(qg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (fg0Var = qg0Var.T) != null) {
                    fg0Var.run();
                    qg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35333b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (el0Var = passcodeActivity.P) != null) {
                    el0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
