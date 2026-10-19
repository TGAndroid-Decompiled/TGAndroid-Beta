package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ax0 implements Runnable {
    public final int f24725a;
    public final dx0 f24726b;

    public ax0(dx0 dx0Var, int i10) {
        this.f24725a = i10;
        this.f24726b = dx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24725a) {
            case 0:
                dx0 dx0Var = this.f24726b;
                dx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ax0(dx0Var, 1));
                return;
            default:
                dx0 dx0Var2 = this.f24726b;
                cx0 cx0Var = dx0Var2.e;
                if (cx0Var != null) {
                    dx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.mx0) cx0Var).f39358b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f33692r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.f33588b6, profileActivity.f33603d6));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f33610e6));
                    return;
                }
                return;
        }
    }
}
