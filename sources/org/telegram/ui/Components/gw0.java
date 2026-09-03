package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class gw0 implements Runnable {
    public final int f25248a;
    public final jw0 f25249b;

    public gw0(jw0 jw0Var, int i10) {
        this.f25248a = i10;
        this.f25249b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f25248a) {
            case 0:
                jw0 jw0Var = this.f25249b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                return;
            default:
                jw0 jw0Var2 = this.f25249b;
                iw0 iw0Var = jw0Var2.e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wx0) iw0Var).f39785b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f32121r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    return;
                }
                return;
        }
    }
}
