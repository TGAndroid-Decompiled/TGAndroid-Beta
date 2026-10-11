package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pd0 implements org.telegram.ui.Components.tw0 {
    public final int f40831a;
    public final org.telegram.ui.ActionBar.m2 f40832b;

    public pd0(int i10, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f40831a = i10;
        this.f40832b = m2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        kg0 kg0Var;
        nl0 nl0Var;
        switch (this.f40831a) {
            case 0:
                vg0 vg0Var = (vg0) this.f40832b;
                if (i10 > AndroidUtilities.dp(20.0f) && vg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(vg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (kg0Var = vg0Var.T) != null) {
                    kg0Var.run();
                    vg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f40832b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (nl0Var = passcodeActivity.T) != null) {
                    nl0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
