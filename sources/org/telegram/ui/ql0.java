package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ql0 extends org.telegram.ui.ActionBar.j {
    public final org.telegram.ui.ActionBar.f1 f41188a;
    public final PasscodeActivity f41189b;

    public ql0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.f1 f1Var) {
        this.f41189b = passcodeActivity;
        this.f41188a = f1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f41189b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f33897y != 0) {
                i11 = 0;
            }
            passcodeActivity.f33897y = i11;
            AndroidUtilities.runOnUIThread(new tf0(14, this, this.f41188a), 150L);
            passcodeActivity.h.setText("");
            for (es esVar : passcodeActivity.f33892n.f36778f) {
                esVar.setText("");
            }
            passcodeActivity.o0();
        }
    }
}
