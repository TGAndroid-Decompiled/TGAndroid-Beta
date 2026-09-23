package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class md0 implements org.telegram.ui.Components.ov0 {
    public final int f35268a;
    public final org.telegram.ui.ActionBar.n2 f35269b;

    public md0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f35268a = i10;
        this.f35269b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        gg0 gg0Var;
        el0 el0Var;
        switch (this.f35268a) {
            case 0:
                rg0 rg0Var = (rg0) this.f35269b;
                if (i10 > AndroidUtilities.dp(20.0f) && rg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(rg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (gg0Var = rg0Var.T) != null) {
                    gg0Var.run();
                    rg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35269b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (el0Var = passcodeActivity.P) != null) {
                    el0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
