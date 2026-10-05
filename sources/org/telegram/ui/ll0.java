package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ll0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f38345a;
    public final PasscodeActivity f38346b;

    public ll0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f38346b = passcodeActivity;
        this.f38345a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f38346b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33869y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33869y = i11;
            AndroidUtilities.runOnUIThread(new wj0(3, this, this.f38345a), 150L);
            passcodeActivity.h.setText("");
            for (es esVar : passcodeActivity.f33864n.f35541f) {
                esVar.setText("");
            }
            passcodeActivity.r0();
        }
    }
}
