package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class lx0 implements Runnable {
    public final int f30325a;
    public final ox0 f30326b;

    public lx0(ox0 ox0Var, int i10) {
        this.f30325a = i10;
        this.f30326b = ox0Var;
    }

    @Override
    public final void run() {
        switch (this.f30325a) {
            case 0:
                ox0 ox0Var = this.f30326b;
                ox0Var.invalidate();
                AndroidUtilities.runOnUIThread(new lx0(ox0Var, 1));
                return;
            default:
                ox0 ox0Var2 = this.f30326b;
                nx0 nx0Var = ox0Var2.e;
                if (nx0Var != null) {
                    ox0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wx0) nx0Var).f45585b;
                    profileActivity.f36067r.setTranslationX(profileActivity.e4(profileActivity.f36032l6, profileActivity.f36046n6));
                    profileActivity.f36067r.setTranslationY(profileActivity.f4(profileActivity.f36053o6));
                    return;
                }
                return;
        }
    }
}
