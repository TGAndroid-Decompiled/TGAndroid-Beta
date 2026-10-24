package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements org.telegram.ui.Components.mw0 {
    public final int f35730a;
    public final org.telegram.ui.ActionBar.o2 f35731b;

    public ad0(int i10, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f35730a = i10;
        this.f35731b = o2Var;
    }

    @Override
    public final void G(int i10, boolean z10) {
        wf0 wf0Var;
        zk0 zk0Var;
        switch (this.f35730a) {
            case 0:
                hg0 hg0Var = (hg0) this.f35731b;
                if (i10 > AndroidUtilities.dp(20.0f) && hg0Var.l1()) {
                    AndroidUtilities.hideKeyboard(hg0Var.fragmentView);
                }
                if (i10 <= AndroidUtilities.dp(20.0f) && (wf0Var = hg0Var.T) != null) {
                    wf0Var.run();
                    hg0Var.T = null;
                    return;
                }
                return;
            default:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.f35731b;
                if (i10 >= AndroidUtilities.dp(20.0f) && (zk0Var = passcodeActivity.T) != null) {
                    zk0Var.run();
                    passcodeActivity.T = null;
                    return;
                }
                return;
        }
    }
}
