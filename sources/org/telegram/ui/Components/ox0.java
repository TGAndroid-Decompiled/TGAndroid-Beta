package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class ox0 implements Runnable {
    public final int f29320a;
    public final rx0 f29321b;

    public ox0(rx0 rx0Var, int i10) {
        this.f29320a = i10;
        this.f29321b = rx0Var;
    }

    @Override
    public final void run() {
        switch (this.f29320a) {
            case 0:
                rx0 rx0Var = this.f29321b;
                rx0Var.invalidate();
                AndroidUtilities.runOnUIThread(new ox0(rx0Var, 1));
                return;
            default:
                rx0 rx0Var2 = this.f29321b;
                qx0 qx0Var = rx0Var2.f30273e;
                if (qx0Var != null) {
                    rx0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ly0) qx0Var).f39871b;
                    org.telegram.ui.ActionBar.h5[] h5VarArr = profileActivity.f34168r;
                    h5VarArr[1].setTranslationX(profileActivity.W3(profileActivity.Z5));
                    h5VarArr[1].setTranslationY(profileActivity.X3(profileActivity.f34056a6));
                    return;
                }
                return;
        }
    }
}
