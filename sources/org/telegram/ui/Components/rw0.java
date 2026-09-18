package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class rw0 implements Runnable {
    public final int f27981a;
    public final uw0 f27982b;

    public rw0(uw0 uw0Var, int i10) {
        this.f27981a = i10;
        this.f27982b = uw0Var;
    }

    @Override
    public final void run() {
        switch (this.f27981a) {
            case 0:
                uw0 uw0Var = this.f27982b;
                uw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new rw0(uw0Var, 1));
                return;
            default:
                uw0 uw0Var2 = this.f27982b;
                tw0 tw0Var = uw0Var2.e;
                if (tw0Var != null) {
                    uw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) tw0Var).f35201b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f31599r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31488a6));
                    return;
                }
                return;
        }
    }
}
