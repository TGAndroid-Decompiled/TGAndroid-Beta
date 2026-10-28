package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ml0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f41460a;
    public final PasscodeActivity f41461b;

    public ml0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f41461b = passcodeActivity;
        this.f41460a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f41461b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f35626y != 0) {
                i11 = 0;
            }
            passcodeActivity.f35626y = i11;
            AndroidUtilities.runOnUIThread(new kb0(28, this, this.f41460a), 150L);
            passcodeActivity.h.setText("");
            for (zr zrVar : passcodeActivity.f35621n.f45772f) {
                zrVar.setText("");
            }
            passcodeActivity.v0();
        }
    }
}
