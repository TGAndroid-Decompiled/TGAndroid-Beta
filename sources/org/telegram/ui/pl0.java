package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class pl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f40904a;
    public final PasscodeActivity f40905b;

    public pl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f40905b = passcodeActivity;
        this.f40904a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f40905b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33887y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33887y = i11;
            AndroidUtilities.runOnUIThread(new uf0(13, this, this.f40904a), 150L);
            passcodeActivity.h.setText("");
            for (ds dsVar : passcodeActivity.f33882n.f36450f) {
                dsVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
