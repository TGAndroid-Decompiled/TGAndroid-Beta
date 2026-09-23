package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class hl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f33883a;
    public final PasscodeActivity f33884b;

    public hl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f33884b = passcodeActivity;
        this.f33883a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f33884b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f30864y != 0) {
                i11 = 0;
            }
            passcodeActivity.f30864y = i11;
            AndroidUtilities.runOnUIThread(new gl0(0, this, this.f33883a), 150L);
            passcodeActivity.h.setText("");
            for (bs bsVar : passcodeActivity.f30859n.f40230f) {
                bsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
