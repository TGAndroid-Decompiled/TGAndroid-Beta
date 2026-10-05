package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class cx0 implements Runnable {
    public final int f25545a;
    public final fx0 f25546b;

    public cx0(fx0 fx0Var, int i10) {
        this.f25545a = i10;
        this.f25546b = fx0Var;
    }

    @Override
    public final void run() {
        switch (this.f25545a) {
            case 0:
                fx0 fx0Var = this.f25546b;
                fx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new cx0(fx0Var, 1));
                return;
            default:
                fx0 fx0Var2 = this.f25546b;
                ex0 ex0Var = fx0Var2.f26623e;
                if (ex0Var != null) {
                    fx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ey0) ex0Var).f36140b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f34339r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34227a6));
                    return;
                }
                return;
        }
    }
}
