package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements org.telegram.ui.Components.vw0 {
    public final int f37736a;
    public final org.telegram.ui.ActionBar.r2 f37737b;

    public ad0(int i10, org.telegram.ui.ActionBar.r2 r2Var) {
        this.f37736a = i10;
        this.f37737b = r2Var;
    }

    @Override
    public final void I(int i10, boolean z10) {
        wf0 wf0Var;
        il0 il0Var;
        switch (this.f37736a) {
            case 0:
                ig0 ig0Var = (ig0) this.f37737b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.m1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (wf0Var = ig0Var.T) != null) {
                    wf0Var.run();
                    ig0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37737b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (il0Var = passcodeActivity.T) != null) {
                    il0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
