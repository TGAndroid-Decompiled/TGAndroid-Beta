package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class bl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f35729a;
    public final PasscodeActivity f35730b;

    public bl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f35730b = passcodeActivity;
        this.f35729a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f35730b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33229y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33229y = i11;
            AndroidUtilities.runOnUIThread(new zg0(8, this, this.f35729a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f33224n.f41512f) {
                vrVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
