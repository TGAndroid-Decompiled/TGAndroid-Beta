package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements org.telegram.ui.Components.sw0 {
    public final int f41134a;
    public final org.telegram.ui.ActionBar.n2 f41135b;

    public qd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41134a = i10;
        this.f41135b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        ol0 ol0Var;
        switch (this.f41134a) {
            case 0:
                wg0 wg0Var = (wg0) this.f41135b;
                if (i10 > AndroidUtilities.dp(20.0f) && wg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(wg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (lg0Var = wg0Var.T) != null) {
                    lg0Var.run();
                    wg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41135b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (ol0Var = passcodeActivity.T) != null) {
                    ol0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
