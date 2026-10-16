package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ex0 implements Runnable {
    public final int f24509a;
    public final hx0 f24510b;

    public ex0(hx0 hx0Var, int i10) {
        this.f24509a = i10;
        this.f24510b = hx0Var;
    }

    @Override
    public final void run() {
        switch (this.f24509a) {
            case 0:
                hx0 hx0Var = this.f24510b;
                hx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ex0(hx0Var, 1));
                return;
            default:
                hx0 hx0Var2 = this.f24510b;
                gx0 gx0Var = hx0Var2.e;
                if (gx0Var != null) {
                    hx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.py0) gx0Var).f39029b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f32348r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f32236a6));
                    return;
                }
                return;
        }
    }
}
