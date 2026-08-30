package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class gw0 implements Runnable {
    public final int f25252a;
    public final jw0 f25253b;

    public gw0(jw0 jw0Var, int i10) {
        this.f25252a = i10;
        this.f25253b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f25252a) {
            case 0:
                jw0 jw0Var = this.f25253b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                return;
            default:
                jw0 jw0Var2 = this.f25253b;
                iw0 iw0Var = jw0Var2.e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.px0) iw0Var).f37552b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32147r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    return;
                }
                return;
        }
    }
}
