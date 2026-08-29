package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements org.telegram.ui.Components.gv0 {
    public final int f36512a;
    public final org.telegram.ui.ActionBar.o2 f36513b;

    public ad0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36512a = i10;
        this.f36513b = o2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        uf0 uf0Var;
        rk0 rk0Var;
        switch (this.f36512a) {
            case 0:
                fg0 fg0Var = (fg0) this.f36513b;
                if (i10 > AndroidUtilities.dp(20.0f) && fg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(fg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (uf0Var = fg0Var.P) != null) {
                    uf0Var.run();
                    fg0Var.P = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36513b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (rk0Var = passcodeActivity.L) != null) {
                    rk0Var.run();
                    passcodeActivity.L = null;
                    return;
                }
                return;
        }
    }
}
