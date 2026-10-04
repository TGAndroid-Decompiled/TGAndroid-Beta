package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class bx0 implements Runnable {
    public final int f25074a;
    public final ex0 f25075b;

    public bx0(ex0 ex0Var, int i10) {
        this.f25074a = i10;
        this.f25075b = ex0Var;
    }

    @Override
    public final void run() {
        switch (this.f25074a) {
            case 0:
                ex0 ex0Var = this.f25075b;
                ex0Var.invalidate();
                AndroidUtilities.runOnUIThread(new bx0(ex0Var, 1));
                return;
            default:
                ex0 ex0Var2 = this.f25075b;
                dx0 dx0Var = ex0Var2.f26168e;
                if (dx0Var != null) {
                    ex0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ey0) dx0Var).f36113b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f34319r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34207a6));
                    return;
                }
                return;
        }
    }
}
