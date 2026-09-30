package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f33963a;
    public final PasscodeActivity f33964b;

    public gl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f33964b = passcodeActivity;
        this.f33963a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33964b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31181y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31181y = i11;
            AndroidUtilities.runOnUIThread(new xi0(6, this, this.f33963a), 150L);
            passcodeActivity.h.setText("");
            for (as asVar : passcodeActivity.f31176n.f40237f) {
                asVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
