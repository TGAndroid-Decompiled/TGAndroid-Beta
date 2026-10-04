package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f38286a;
    public final PasscodeActivity f38287b;

    public ll0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f38287b = passcodeActivity;
        this.f38286a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f38287b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33850y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33850y = i11;
            AndroidUtilities.runOnUIThread(new wj0(3, this, this.f38286a), 150L);
            passcodeActivity.h.setText("");
            for (es esVar : passcodeActivity.f33845n.f35544f) {
                esVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
