package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class fw0 implements Runnable {
    public final int f24101a;
    public final iw0 f24102b;

    public fw0(iw0 iw0Var, int i10) {
        this.f24101a = i10;
        this.f24102b = iw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24101a) {
            case 0:
                iw0 iw0Var = this.f24102b;
                iw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new fw0(iw0Var, 1));
                return;
            default:
                iw0 iw0Var2 = this.f24102b;
                hw0 hw0Var = iw0Var2.e;
                if (hw0Var != null) {
                    iw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.dy0) hw0Var).f32741b;
                    org.telegram.ui.ActionBar.i5[] i5VarArr = profileActivity.f31326r;
                    i5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    i5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31215a6));
                    return;
                }
                return;
        }
    }
}
