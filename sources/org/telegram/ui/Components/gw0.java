package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class gw0 implements Runnable {
    public final int f27288a;
    public final jw0 f27289b;

    public gw0(jw0 jw0Var, int i10) {
        this.f27288a = i10;
        this.f27289b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f27288a) {
            case 0:
                jw0 jw0Var = this.f27289b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                return;
            default:
                jw0 jw0Var2 = this.f27289b;
                iw0 iw0Var = jw0Var2.f28208e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wx0) iw0Var).f42873b;
                    org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f34680r;
                    l5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.W5));
                    l5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.X5));
                    return;
                }
                return;
        }
    }
}
