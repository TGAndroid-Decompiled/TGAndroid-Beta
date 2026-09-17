package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f36931a;
    public final PasscodeActivity f36932b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f36932b = passcodeActivity;
        this.f36931a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36932b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f30907y != 0) {
                i11 = 0;
            }
            passcodeActivity.f30907y = i11;
            AndroidUtilities.runOnUIThread(new pl0(0, this, this.f36931a), 150L);
            passcodeActivity.h.setText("");
            for (is isVar : passcodeActivity.f30902n.f33749f) {
                isVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
