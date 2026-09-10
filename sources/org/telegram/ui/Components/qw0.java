package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class qw0 implements Runnable {
    public final int f26490a;
    public final tw0 f26491b;

    public qw0(tw0 tw0Var, int i10) {
        this.f26490a = i10;
        this.f26491b = tw0Var;
    }

    @Override
    public final void run() {
        switch (this.f26490a) {
            case 0:
                tw0 tw0Var = this.f26491b;
                tw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new qw0(tw0Var, 1));
                return;
            default:
                tw0 tw0Var2 = this.f26491b;
                sw0 sw0Var = tw0Var2.e;
                if (sw0Var != null) {
                    tw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ny0) sw0Var).f35359b;
                    org.telegram.ui.ActionBar.l5[] l5VarArr = profileActivity.f30467r;
                    l5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    l5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f30356a6));
                    return;
                }
                return;
        }
    }
}
