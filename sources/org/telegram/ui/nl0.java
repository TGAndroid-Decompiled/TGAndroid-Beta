package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class nl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f36003a;
    public final PasscodeActivity f36004b;

    public nl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f36004b = passcodeActivity;
        this.f36003a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36004b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f30893y != 0) {
                i11 = 0;
            }
            passcodeActivity.f30893y = i11;
            AndroidUtilities.runOnUIThread(new ml0(0, this, this.f36003a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f30888n.f33120f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
