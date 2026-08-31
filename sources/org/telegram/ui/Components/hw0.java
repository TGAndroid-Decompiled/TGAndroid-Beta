package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class hw0 implements Runnable {
    public final int f27593a;
    public final kw0 f27594b;

    public hw0(kw0 kw0Var, int i10) {
        this.f27593a = i10;
        this.f27594b = kw0Var;
    }

    @Override
    public final void run() {
        switch (this.f27593a) {
            case 0:
                kw0 kw0Var = this.f27594b;
                kw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new hw0(kw0Var, 1));
                return;
            default:
                kw0 kw0Var2 = this.f27594b;
                jw0 jw0Var = kw0Var2.f28470e;
                if (jw0Var != null) {
                    kw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.rx0) jw0Var).f41061b;
                    org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
                    l5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    l5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    return;
                }
                return;
        }
    }
}
