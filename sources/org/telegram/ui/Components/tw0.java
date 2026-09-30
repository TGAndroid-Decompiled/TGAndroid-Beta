package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class tw0 implements Runnable {
    public final int f28670a;
    public final ww0 f28671b;

    public tw0(ww0 ww0Var, int i10) {
        this.f28670a = i10;
        this.f28671b = ww0Var;
    }

    @Override
    public final void run() {
        switch (this.f28670a) {
            case 0:
                ww0 ww0Var = this.f28671b;
                ww0Var.invalidate();
                AndroidUtilities.runOnUIThread(new tw0(ww0Var, 1));
                return;
            default:
                ww0 ww0Var2 = this.f28671b;
                vw0 vw0Var = ww0Var2.e;
                if (vw0Var != null) {
                    ww0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) vw0Var).f32597b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31715r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31604a6));
                    return;
                }
                return;
        }
    }
}
