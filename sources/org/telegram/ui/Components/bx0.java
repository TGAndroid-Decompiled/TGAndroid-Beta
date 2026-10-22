package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class bx0 implements Runnable {
    public final int f25056a;
    public final ex0 f25057b;

    public bx0(ex0 ex0Var, int i10) {
        this.f25056a = i10;
        this.f25057b = ex0Var;
    }

    @Override
    public final void run() {
        switch (this.f25056a) {
            case 0:
                ex0 ex0Var = this.f25057b;
                ex0Var.invalidate();
                AndroidUtilities.runOnUIThread(new bx0(ex0Var, 1));
                return;
            default:
                ex0 ex0Var2 = this.f25057b;
                dx0 dx0Var = ex0Var2.e;
                if (dx0Var != null) {
                    ex0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.mx0) dx0Var).f39367b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f33702r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.f33598b6, profileActivity.f33613d6));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f33620e6));
                    return;
                }
                return;
        }
    }
}
