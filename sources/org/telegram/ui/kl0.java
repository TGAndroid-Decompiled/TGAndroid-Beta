package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class kl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f35098a;
    public final PasscodeActivity f35099b;

    public kl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f35099b = passcodeActivity;
        this.f35098a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f35099b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31181y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31181y = i11;
            AndroidUtilities.runOnUIThread(new jl0(1, this, this.f35098a), 150L);
            passcodeActivity.h.setText("");
            for (ds dsVar : passcodeActivity.f31176n.f32431f) {
                dsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
