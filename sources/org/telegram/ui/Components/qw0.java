package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class qw0 implements Runnable {
    public final int f27770a;
    public final tw0 f27771b;

    public qw0(tw0 tw0Var, int i10) {
        this.f27770a = i10;
        this.f27771b = tw0Var;
    }

    @Override
    public final void run() {
        switch (this.f27770a) {
            case 0:
                tw0 tw0Var = this.f27771b;
                tw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new qw0(tw0Var, 1));
                return;
            default:
                tw0 tw0Var2 = this.f27771b;
                sw0 sw0Var = tw0Var2.e;
                if (sw0Var != null) {
                    tw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.by0) sw0Var).f32497b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f31627r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31516a6));
                    return;
                }
                return;
        }
    }
}
