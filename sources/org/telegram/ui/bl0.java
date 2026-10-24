package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f36094a;
    public final PasscodeActivity f36095b;

    public bl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f36095b = passcodeActivity;
        this.f36094a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36095b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33538y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33538y = i11;
            AndroidUtilities.runOnUIThread(new ah0(8, this, this.f36094a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f33533n.f41792f) {
                vrVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
