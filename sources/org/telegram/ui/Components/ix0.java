package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ix0 implements Runnable {
    public final int f27510a;
    public final lx0 f27511b;

    public ix0(lx0 lx0Var, int i10) {
        this.f27510a = i10;
        this.f27511b = lx0Var;
    }

    @Override
    public final void run() {
        switch (this.f27510a) {
            case 0:
                lx0 lx0Var = this.f27511b;
                lx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ix0(lx0Var, 1));
                return;
            default:
                lx0 lx0Var2 = this.f27511b;
                kx0 kx0Var = lx0Var2.f28622e;
                if (kx0Var != null) {
                    lx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.jy0) kx0Var).f39042b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f34329r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34217a6));
                    return;
                }
                return;
        }
    }
}
