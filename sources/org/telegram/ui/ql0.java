package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f36955a;
    public final PasscodeActivity f36956b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f36956b = passcodeActivity;
        this.f36955a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36956b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31198y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31198y = i11;
            AndroidUtilities.runOnUIThread(new fj0(6, this, this.f36955a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f31193n.f33145f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
