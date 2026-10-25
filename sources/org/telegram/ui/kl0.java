package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f40959a;
    public final PasscodeActivity f40960b;

    public kl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f40960b = passcodeActivity;
        this.f40959a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f40960b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f35599y != 0) {
                i11 = 0;
            }
            passcodeActivity.f35599y = i11;
            AndroidUtilities.runOnUIThread(new wb0(27, this, this.f40959a), 150L);
            passcodeActivity.h.setText("");
            for (xr xrVar : passcodeActivity.f35594n.f44894f) {
                xrVar.setText("");
            }
            passcodeActivity.v0();
        }
    }
}
