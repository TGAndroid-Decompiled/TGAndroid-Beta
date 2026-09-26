package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f33959a;
    public final PasscodeActivity f33960b;

    public gl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f33960b = passcodeActivity;
        this.f33959a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33960b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31178y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31178y = i11;
            AndroidUtilities.runOnUIThread(new sj0(5, this, this.f33959a), 150L);
            passcodeActivity.h.setText("");
            for (as asVar : passcodeActivity.f31173n.f40236f) {
                asVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
