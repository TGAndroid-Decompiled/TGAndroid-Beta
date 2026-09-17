package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ew0 implements Runnable {
    public final int f25802a;
    public final hw0 f25803b;

    public ew0(hw0 hw0Var, int i10) {
        this.f25802a = i10;
        this.f25803b = hw0Var;
    }

    @Override
    public final void run() {
        switch (this.f25802a) {
            case 0:
                hw0 hw0Var = this.f25803b;
                hw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ew0(hw0Var, 1));
                return;
            default:
                hw0 hw0Var2 = this.f25803b;
                gw0 gw0Var = hw0Var2.f26886e;
                if (gw0Var != null) {
                    hw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) gw0Var).f38153b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f33975r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f33863a6));
                    return;
                }
                return;
        }
    }
}
