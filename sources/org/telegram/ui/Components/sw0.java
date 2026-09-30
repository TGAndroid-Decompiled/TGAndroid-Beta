package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class sw0 implements Runnable {
    public final int f28381a;
    public final vw0 f28382b;

    public sw0(vw0 vw0Var, int i10) {
        this.f28381a = i10;
        this.f28382b = vw0Var;
    }

    @Override
    public final void run() {
        switch (this.f28381a) {
            case 0:
                vw0 vw0Var = this.f28382b;
                vw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new sw0(vw0Var, 1));
                return;
            default:
                vw0 vw0Var2 = this.f28382b;
                uw0 uw0Var = vw0Var2.e;
                if (uw0Var != null) {
                    vw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) uw0Var).f32513b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31643r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31532a6));
                    return;
                }
                return;
        }
    }
}
