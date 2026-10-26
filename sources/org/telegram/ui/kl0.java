package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f40962a;
    public final PasscodeActivity f40963b;

    public kl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f40963b = passcodeActivity;
        this.f40962a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f40963b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f35602y != 0) {
                i11 = 0;
            }
            passcodeActivity.f35602y = i11;
            AndroidUtilities.runOnUIThread(new wb0(27, this, this.f40962a), 150L);
            passcodeActivity.h.setText("");
            for (xr xrVar : passcodeActivity.f35597n.f44897f) {
                xrVar.setText("");
            }
            passcodeActivity.v0();
        }
    }
}
