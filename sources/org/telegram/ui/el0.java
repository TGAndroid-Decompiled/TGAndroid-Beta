package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class el0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f36615a;
    public final PasscodeActivity f36616b;

    public el0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f36616b = passcodeActivity;
        this.f36615a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36616b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f34216y != 0) {
                i11 = 0;
            }
            passcodeActivity.f34216y = i11;
            AndroidUtilities.runOnUIThread(new he0(17, this, this.f36615a), 150L);
            passcodeActivity.h.setText("");
            for (cs csVar : passcodeActivity.f34211n.f43982f) {
                csVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
