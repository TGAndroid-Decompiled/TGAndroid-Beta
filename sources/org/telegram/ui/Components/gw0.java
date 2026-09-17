package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class gw0 implements Runnable {
    public final int f24410a;
    public final jw0 f24411b;

    public gw0(jw0 jw0Var, int i10) {
        this.f24410a = i10;
        this.f24411b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24410a) {
            case 0:
                jw0 jw0Var = this.f24411b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                return;
            default:
                jw0 jw0Var2 = this.f24411b;
                iw0 iw0Var = jw0Var2.e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.my0) iw0Var).f35907b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f31368r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31257a6));
                    return;
                }
                return;
        }
    }
}
