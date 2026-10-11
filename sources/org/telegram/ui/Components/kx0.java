package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class kx0 implements Runnable {
    public final int f28103a;
    public final nx0 f28104b;

    public kx0(nx0 nx0Var, int i10) {
        this.f28103a = i10;
        this.f28104b = nx0Var;
    }

    @Override
    public final void run() {
        switch (this.f28103a) {
            case 0:
                nx0 nx0Var = this.f28104b;
                nx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new kx0(nx0Var, 1));
                return;
            default:
                nx0 nx0Var2 = this.f28104b;
                mx0 mx0Var = nx0Var2.f29169e;
                if (mx0Var != null) {
                    nx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.iy0) mx0Var).f38801b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f34357r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34245a6));
                    return;
                }
                return;
        }
    }
}
