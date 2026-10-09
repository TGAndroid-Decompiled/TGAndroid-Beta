package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements org.telegram.ui.Components.rw0 {
    public final int f41088a;
    public final org.telegram.ui.ActionBar.n2 f41089b;

    public qd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f41088a = i10;
        this.f41089b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        lg0 lg0Var;
        ol0 ol0Var;
        switch (this.f41088a) {
            case 0:
                wg0 wg0Var = (wg0) this.f41089b;
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
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f41089b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (ol0Var = passcodeActivity.T) != null) {
                    ol0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
