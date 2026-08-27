package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class cd0 implements org.telegram.ui.Components.yu0 {

    public final int f37051a;

    public final org.telegram.ui.ActionBar.n2 f37052b;

    public cd0(int i10, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f37051a = i10;
        this.f37052b = n2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        xf0 xf0Var;
        vk0 vk0Var;
        switch (this.f37051a) {
            case 0:
                ig0 ig0Var = (ig0) this.f37052b;
                if (i10 > AndroidUtilities.dp(20.0f) && ig0Var.h1()) {
                    AndroidUtilities.hideKeyboard(ig0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (xf0Var = ig0Var.P) != null) {
                    xf0Var.run();
                    ig0Var.P = null;
                    break;
                }
                break;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f37052b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (vk0Var = passcodeActivity.L) != null) {
                    vk0Var.run();
                    passcodeActivity.L = null;
                    break;
                }
                break;
        }
    }
}
