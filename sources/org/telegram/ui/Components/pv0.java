package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;

public final class pv0 implements Runnable {

    public final int f31670a;

    public final sv0 f31671b;

    public pv0(sv0 sv0Var, int i10) {
        this.f31670a = i10;
        this.f31671b = sv0Var;
    }

    @Override
    public final void run() {
        switch (this.f31670a) {
            case 0:
                sv0 sv0Var = this.f31671b;
                sv0Var.invalidate();
                AndroidUtilities.runOnUIThread(new pv0(sv0Var, 1));
                break;
            default:
                sv0 sv0Var2 = this.f31671b;
                rv0 rv0Var = sv0Var2.f32586e;
                if (rv0Var != null) {
                    sv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.gx0) rv0Var).f38493b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36040r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                }
                break;
        }
    }
}
