package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pd0 implements org.telegram.ui.Components.kw0 {
    public final int f39459a;
    public final org.telegram.ui.ActionBar.n2 f39460b;

    public pd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f39459a = i10;
        this.f39460b = n2Var;
    }

    @Override
    public final void F(int i10, boolean z10) {
        jg0 jg0Var;
        il0 il0Var;
        switch (this.f39459a) {
            case 0:
                ug0 ug0Var = (ug0) this.f39460b;
                if (i10 > AndroidUtilities.dp(20.0f) && ug0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ug0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (jg0Var = ug0Var.T) != null) {
                    jg0Var.run();
                    ug0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f39460b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (il0Var = passcodeActivity.P) != null) {
                    il0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
