package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bd0 implements org.telegram.ui.Components.nw0 {
    public final int f36051a;
    public final org.telegram.ui.ActionBar.o2 f36052b;

    public bd0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36051a = i10;
        this.f36052b = o2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        xf0 xf0Var;
        al0 al0Var;
        switch (this.f36051a) {
            case 0:
                ig0 ig0Var = (ig0) this.f36052b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.l1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (xf0Var = ig0Var.T) != null) {
                    xf0Var.run();
                    ig0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36052b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (al0Var = passcodeActivity.T) != null) {
                    al0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
