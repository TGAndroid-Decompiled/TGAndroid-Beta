package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f39538a;
    public final PasscodeActivity f39539b;

    public pl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f39539b = passcodeActivity;
        this.f39538a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f39539b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33506y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33506y = i11;
            AndroidUtilities.runOnUIThread(new ej0(6, this, this.f39538a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f33501n.f36164f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
