package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements org.telegram.ui.Components.pv0 {
    public final int f35739a;
    public final org.telegram.ui.ActionBar.p2 f35740b;

    public ld0(int i10, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f35739a = i10;
        this.f35740b = p2Var;
    }

    @Override
    public final void G(int i10, boolean z4) {
        eg0 eg0Var;
        bl0 bl0Var;
        switch (this.f35739a) {
            case 0:
                pg0 pg0Var = (pg0) this.f35740b;
                if (i10 > AndroidUtilities.dp(20.0f) && pg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(pg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (eg0Var = pg0Var.Q) != null) {
                    eg0Var.run();
                    pg0Var.Q = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35740b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (bl0Var = passcodeActivity.M) != null) {
                    bl0Var.run();
                    passcodeActivity.M = null;
                    return;
                }
                return;
        }
    }
}
