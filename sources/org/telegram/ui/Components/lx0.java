package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class lx0 implements Runnable {
    public final int f30323a;
    public final ox0 f30324b;

    public lx0(ox0 ox0Var, int i10) {
        this.f30323a = i10;
        this.f30324b = ox0Var;
    }

    @Override
    public final void run() {
        switch (this.f30323a) {
            case 0:
                ox0 ox0Var = this.f30324b;
                ox0Var.invalidate();
                AndroidUtilities.runOnUIThread(new lx0(ox0Var, 1));
                return;
            default:
                ox0 ox0Var2 = this.f30324b;
                nx0 nx0Var = ox0Var2.e;
                if (nx0Var != null) {
                    ox0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wx0) nx0Var).f45582b;
                    profileActivity.f36064r.setTranslationX(profileActivity.e4(profileActivity.f36029l6, profileActivity.f36043n6));
                    profileActivity.f36064r.setTranslationY(profileActivity.f4(profileActivity.f36050o6));
                    return;
                }
                return;
        }
    }
}
