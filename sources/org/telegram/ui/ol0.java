package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class ol0 extends org.telegram.ui.ActionBar.k {
    public final org.telegram.ui.ActionBar.g1 f35510a;
    public final PasscodeActivity f35511b;

    public ol0(PasscodeActivity passcodeActivity, org.telegram.ui.ActionBar.g1 g1Var) {
        this.f35511b = passcodeActivity;
        this.f35510a = g1Var;
    }

    @Override
    public final void b(int i10) {
        PasscodeActivity passcodeActivity = this.f35511b;
        if (i10 == -1) {
            passcodeActivity.finishFragment();
            return;
        }
        int i11 = 1;
        if (i10 == 1) {
            if (passcodeActivity.f30006y != 0) {
                i11 = 0;
            }
            passcodeActivity.f30006y = i11;
            AndroidUtilities.runOnUIThread(new ak0(3, this, this.f35510a), 150L);
            passcodeActivity.h.setText("");
            for (hs hsVar : passcodeActivity.f30001n.f32906f) {
                hsVar.setText("");
            }
            passcodeActivity.l0();
        }
    }
}
