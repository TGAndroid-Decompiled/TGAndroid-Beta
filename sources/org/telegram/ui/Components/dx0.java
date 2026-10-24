package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class dx0 implements Runnable {
    public final int f25853a;
    public final gx0 f25854b;

    public dx0(gx0 gx0Var, int i10) {
        this.f25853a = i10;
        this.f25854b = gx0Var;
    }

    @Override
    public final void run() {
        switch (this.f25853a) {
            case 0:
                gx0 gx0Var = this.f25854b;
                gx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new dx0(gx0Var, 1));
                return;
            default:
                gx0 gx0Var2 = this.f25854b;
                fx0 fx0Var = gx0Var2.e;
                if (fx0Var != null) {
                    gx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.px0) fx0Var).f40646b;
                    org.telegram.ui.ActionBar.n5[] n5VarArr = profileActivity.f34002r;
                    n5VarArr[1].setTranslationX(profileActivity.Y3(profileActivity.f33913d6, profileActivity.f33928f6));
                    n5VarArr[1].setTranslationY(profileActivity.Z3(profileActivity.f33935g6));
                    return;
                }
                return;
        }
    }
}
