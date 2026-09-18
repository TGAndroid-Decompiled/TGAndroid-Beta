package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f36846a;
    public final PasscodeActivity f36847b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f36847b = passcodeActivity;
        this.f36846a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36847b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31137y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31137y = i11;
            AndroidUtilities.runOnUIThread(new ak0(4, this, this.f36846a), 150L);
            passcodeActivity.h.setText("");
            for (gs gsVar : passcodeActivity.f31132n.f33074f) {
                gsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
