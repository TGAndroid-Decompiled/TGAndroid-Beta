package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f35706a;
    public final PasscodeActivity f35707b;

    public bl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f35707b = passcodeActivity;
        this.f35706a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f35707b;
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
            AndroidUtilities.runOnUIThread(new zg0(8, this, this.f35706a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f33217n.f41486f) {
                vrVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
