package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f35683a;
    public final PasscodeActivity f35684b;

    public bl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f35684b = passcodeActivity;
        this.f35683a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f35684b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33222y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33222y = i11;
            AndroidUtilities.runOnUIThread(new yg0(8, this, this.f35683a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f33217n.f41477f) {
                vrVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
