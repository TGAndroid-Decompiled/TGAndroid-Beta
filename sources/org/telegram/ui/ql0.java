package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f36932a;
    public final PasscodeActivity f36933b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f36933b = passcodeActivity;
        this.f36932a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36933b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31177y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31177y = i11;
            AndroidUtilities.runOnUIThread(new fj0(6, this, this.f36932a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f31172n.f33125f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
