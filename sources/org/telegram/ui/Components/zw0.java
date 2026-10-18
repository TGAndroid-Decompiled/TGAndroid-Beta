package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class zw0 implements Runnable {
    public final int f33038a;
    public final cx0 f33039b;

    public zw0(cx0 cx0Var, int i10) {
        this.f33038a = i10;
        this.f33039b = cx0Var;
    }

    @Override
    public final void run() {
        switch (this.f33038a) {
            case 0:
                cx0 cx0Var = this.f33039b;
                cx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new zw0(cx0Var, 1));
                return;
            default:
                cx0 cx0Var2 = this.f33039b;
                bx0 bx0Var = cx0Var2.e;
                if (bx0Var != null) {
                    cx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ox0) bx0Var).f39879b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f33686r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.f33582b6));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f33590c6));
                    return;
                }
                return;
        }
    }
}
