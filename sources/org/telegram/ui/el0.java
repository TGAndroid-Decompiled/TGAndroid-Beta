package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class el0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f33826a;
    public final PasscodeActivity f33827b;

    public el0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f33827b = passcodeActivity;
        this.f33826a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33827b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31665y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31665y = i11;
            AndroidUtilities.runOnUIThread(new ie0(17, this, this.f33826a), 150L);
            passcodeActivity.h.setText("");
            for (ds dsVar : passcodeActivity.f31660n.f32635f) {
                dsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
