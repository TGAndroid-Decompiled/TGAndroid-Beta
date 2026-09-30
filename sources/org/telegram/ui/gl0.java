package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f34101a;
    public final PasscodeActivity f34102b;

    public gl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f34102b = passcodeActivity;
        this.f34101a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f34102b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31253y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31253y = i11;
            AndroidUtilities.runOnUIThread(new sj0(5, this, this.f34101a), 150L);
            passcodeActivity.h.setText("");
            for (as asVar : passcodeActivity.f31248n.f40347f) {
                asVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
