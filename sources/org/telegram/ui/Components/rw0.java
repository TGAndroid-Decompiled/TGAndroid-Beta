package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class rw0 implements Runnable {
    public final int f28074a;
    public final uw0 f28075b;

    public rw0(uw0 uw0Var, int i10) {
        this.f28074a = i10;
        this.f28075b = uw0Var;
    }

    @Override
    public final void run() {
        switch (this.f28074a) {
            case 0:
                uw0 uw0Var = this.f28075b;
                uw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new rw0(uw0Var, 1));
                return;
            default:
                uw0 uw0Var2 = this.f28075b;
                tw0 tw0Var = uw0Var2.e;
                if (tw0Var != null) {
                    uw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) tw0Var).f32510b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31640r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31529a6));
                    return;
                }
                return;
        }
    }
}
