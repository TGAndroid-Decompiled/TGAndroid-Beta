package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class od0 implements org.telegram.ui.Components.bw0 {
    public final int f36187a;
    public final org.telegram.ui.ActionBar.o2 f36188b;

    public od0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f36187a = i10;
        this.f36188b = o2Var;
    }

    @Override
    public final void H(int i10, boolean z10) {
        ig0 ig0Var;
        hl0 hl0Var;
        switch (this.f36187a) {
            case 0:
                tg0 tg0Var = (tg0) this.f36188b;
                if (i10 > AndroidUtilities.dp(20.0f) && tg0Var.h1()) {
                    AndroidUtilities.hideKeyboard(tg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (ig0Var = tg0Var.T) != null) {
                    ig0Var.run();
                    tg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f36188b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (hl0Var = passcodeActivity.P) != null) {
                    hl0Var.run();
                    passcodeActivity.P = null;
                    return;
                }
                return;
        }
    }
}
