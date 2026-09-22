package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f36008a;
    public final PasscodeActivity f36009b;

    public nl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f36009b = passcodeActivity;
        this.f36008a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36009b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f30890y != 0) {
                i11 = 0;
            }
            passcodeActivity.f30890y = i11;
            AndroidUtilities.runOnUIThread(new ml0(0, this, this.f36008a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f30885n.f33081f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
