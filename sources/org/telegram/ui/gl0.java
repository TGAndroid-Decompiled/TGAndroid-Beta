package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class gl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f33947a;
    public final PasscodeActivity f33948b;

    public gl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f33948b = passcodeActivity;
        this.f33947a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33948b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31165y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31165y = i11;
            AndroidUtilities.runOnUIThread(new xi0(6, this, this.f33947a), 150L);
            passcodeActivity.h.setText("");
            for (as asVar : passcodeActivity.f31160n.f40221f) {
                asVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
