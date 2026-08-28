package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class nv0 implements Runnable {
    public final int f31190a;
    public final qv0 f31191b;

    public nv0(qv0 qv0Var, int i9) {
        this.f31190a = i9;
        this.f31191b = qv0Var;
    }

    @Override
    public final void run() {
        switch (this.f31190a) {
            case 0:
                qv0 qv0Var = this.f31191b;
                qv0Var.invalidate();
                AndroidUtilities.runOnUIThread(new nv0(qv0Var, 1));
                return;
            default:
                qv0 qv0Var2 = this.f31191b;
                pv0 pv0Var = qv0Var2.f32035e;
                if (pv0Var != null) {
                    qv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.fx0) pv0Var).f38363b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f36037r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.V5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.W5));
                    return;
                }
                return;
        }
    }
}
