package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ex0 implements Runnable {
    public final int f26089a;
    public final hx0 f26090b;

    public ex0(hx0 hx0Var, int i10) {
        this.f26089a = i10;
        this.f26090b = hx0Var;
    }

    @Override
    public final void run() {
        switch (this.f26089a) {
            case 0:
                hx0 hx0Var = this.f26090b;
                hx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ex0(hx0Var, 1));
                return;
            default:
                hx0 hx0Var2 = this.f26090b;
                gx0 gx0Var = hx0Var2.e;
                if (gx0Var != null) {
                    hx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.qx0) gx0Var).f40933b;
                    org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34000r;
                    n5VarArr[1].setTranslationX(profileActivity.Y3(profileActivity.f33911d6, profileActivity.f33926f6));
                    n5VarArr[1].setTranslationY(profileActivity.Z3(profileActivity.f33933g6));
                    return;
                }
                return;
        }
    }
}
