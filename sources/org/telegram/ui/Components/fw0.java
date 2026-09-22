package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class fw0 implements Runnable {
    public final int f24100a;
    public final iw0 f24101b;

    public fw0(iw0 iw0Var, int i10) {
        this.f24100a = i10;
        this.f24101b = iw0Var;
    }

    @Override
    public final void run() {
        switch (this.f24100a) {
            case 0:
                iw0 iw0Var = this.f24101b;
                iw0Var.invalidate();
                AndroidUtilities.runOnUIThread(new fw0(iw0Var, 1));
                return;
            default:
                iw0 iw0Var2 = this.f24101b;
                hw0 hw0Var = iw0Var2.e;
                if (hw0Var != null) {
                    iw0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ky0) hw0Var).f35281b;
                    org.telegram.ui.ActionBar.j5[] j5VarArr = profileActivity.f31352r;
                    j5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    j5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f31241a6));
                    return;
                }
                return;
        }
    }
}
