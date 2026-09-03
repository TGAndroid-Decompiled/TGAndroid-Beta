package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class el0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f36522a;
    public final PasscodeActivity f36523b;

    public el0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f36523b = passcodeActivity;
        this.f36522a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36523b;
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
            AndroidUtilities.runOnUIThread(new ue0(16, this, this.f36522a), 150L);
            passcodeActivity.h.setText("");
            for (cs csVar : passcodeActivity.f34211n.f44011f) {
                csVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
