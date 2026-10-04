package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f38285a;
    public final PasscodeActivity f38286b;

    public ll0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f38286b = passcodeActivity;
        this.f38285a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f38286b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33849y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33849y = i11;
            AndroidUtilities.runOnUIThread(new wj0(3, this, this.f38285a), 150L);
            passcodeActivity.h.setText("");
            for (es esVar : passcodeActivity.f33844n.f35543f) {
                esVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
