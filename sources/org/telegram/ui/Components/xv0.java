package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class xv0 implements Runnable {
    public final int f34837a;
    public final aw0 f34838b;

    public xv0(aw0 aw0Var, int i10) {
        this.f34837a = i10;
        this.f34838b = aw0Var;
    }

    @Override
    public final void run() {
        switch (this.f34837a) {
            case 0:
                aw0 aw0Var = this.f34838b;
                aw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new xv0(aw0Var, 1));
                return;
            default:
                aw0 aw0Var2 = this.f34838b;
                zv0 zv0Var = aw0Var2.f26908e;
                if (zv0Var != null) {
                    aw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ex0) zv0Var).f37920b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36103r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                    return;
                }
                return;
        }
    }
}
