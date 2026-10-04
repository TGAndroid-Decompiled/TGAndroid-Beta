package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class bx0 implements Runnable {
    public final int f25080a;
    public final ex0 f25081b;

    public bx0(ex0 ex0Var, int i10) {
        this.f25080a = i10;
        this.f25081b = ex0Var;
    }

    @Override
    public final void run() {
        switch (this.f25080a) {
            case 0:
                ex0 ex0Var = this.f25081b;
                ex0Var.invalidate();
                AndroidUtilities.runOnUIThread(new bx0(ex0Var, 1));
                return;
            default:
                ex0 ex0Var2 = this.f25081b;
                dx0 dx0Var = ex0Var2.f26174e;
                if (dx0Var != null) {
                    ex0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ey0) dx0Var).f36119b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f34326r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34214a6));
                    return;
                }
                return;
        }
    }
}
