package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f38291a;
    public final PasscodeActivity f38292b;

    public ll0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f38292b = passcodeActivity;
        this.f38291a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f38292b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33856y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33856y = i11;
            AndroidUtilities.runOnUIThread(new wj0(3, this, this.f38291a), 150L);
            passcodeActivity.h.setText("");
            for (es esVar : passcodeActivity.f33851n.f35549f) {
                esVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
