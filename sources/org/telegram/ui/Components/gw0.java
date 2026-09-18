package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class gw0 implements Runnable {
    public final int f24413a;
    public final jw0 f24414b;

    public gw0(jw0 jw0Var, int i10) {
        this.f24413a = i10;
        this.f24414b = jw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24413a) {
            case 0:
                jw0 jw0Var = this.f24414b;
                jw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new gw0(jw0Var, 1));
                return;
            default:
                jw0 jw0Var2 = this.f24414b;
                iw0 iw0Var = jw0Var2.e;
                if (iw0Var != null) {
                    jw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.my0) iw0Var).f35912b;
                    org.telegram.ui.ActionBar.k5[] k5VarArr = profileActivity.f31372r;
                    k5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    k5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31261a6));
                    return;
                }
                return;
        }
    }
}
