package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class cl0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.e1 f36389a;
    public final PasscodeActivity f36390b;

    public cl0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.e1 e1Var) {
        this.f36390b = passcodeActivity;
        this.f36389a = e1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f36390b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33536y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33536y = i11;
            AndroidUtilities.runOnUIThread(new bh0(8, this, this.f36389a), 150L);
            passcodeActivity.h.setText("");
            for (vr vrVar : passcodeActivity.f33531n.f41793f) {
                vrVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
