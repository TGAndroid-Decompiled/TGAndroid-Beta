package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ProfileActivity;
public final class mx0 implements Runnable {
    public final int f30670a;
    public final px0 f30671b;

    public mx0(px0 px0Var, int i10) {
        this.f30670a = i10;
        this.f30671b = px0Var;
    }

    @Override
    public final void run() {
        switch (this.f30670a) {
            case 0:
                px0 px0Var = this.f30671b;
                px0Var.invalidate();
                AndroidUtilities.runOnUIThread(new mx0(px0Var, 1));
                return;
            default:
                px0 px0Var2 = this.f30671b;
                ox0 ox0Var = px0Var2.e;
                if (ox0Var != null) {
                    px0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.yx0) ox0Var).f46099b;
                    profileActivity.f36091r.setTranslationX(profileActivity.e4(profileActivity.f36056l6, profileActivity.f36070n6));
                    profileActivity.f36091r.setTranslationY(profileActivity.f4(profileActivity.f36077o6));
                    return;
                }
                return;
        }
    }
}
