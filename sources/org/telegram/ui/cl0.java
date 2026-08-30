package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.g1 f33389a;
    public final PasscodeActivity f33390b;

    public cl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f33390b = passcodeActivity;
        this.f33389a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33390b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f31691y != 0) {
                i11 = 0;
            }
            passcodeActivity.f31691y = i11;
            AndroidUtilities.runOnUIThread(new fe0(18, this, this.f33389a), 150L);
            passcodeActivity.h.setText("");
            for (bs bsVar : passcodeActivity.f31686n.f40565f) {
                bsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
