package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class jx0 implements Runnable {
    public final int f27872a;
    public final mx0 f27873b;

    public jx0(mx0 mx0Var, int i10) {
        this.f27872a = i10;
        this.f27873b = mx0Var;
    }

    @Override
    public final void run() {
        switch (this.f27872a) {
            case 0:
                mx0 mx0Var = this.f27873b;
                mx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new jx0(mx0Var, 1));
                return;
            default:
                mx0 mx0Var2 = this.f27873b;
                lx0 lx0Var = mx0Var2.f28966e;
                if (lx0Var != null) {
                    mx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.iy0) lx0Var).f38835b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f34391r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34279a6));
                    return;
                }
                return;
        }
    }
}
