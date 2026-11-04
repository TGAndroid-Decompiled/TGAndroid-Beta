package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class hu0 implements Runnable {
    public final int f34516a;
    public final ku0 f34517b;

    public hu0(ku0 ku0Var, int i3) {
        this.f34516a = i3;
        this.f34517b = ku0Var;
    }

    @Override
    public final void run() {
        switch (this.f34516a) {
            case 0:
                ku0 ku0Var = this.f34517b;
                ku0Var.invalidate();
                org.telegram.messenger.g0.h3(new hu0(ku0Var, 1));
                return;
            default:
                ku0 ku0Var2 = this.f34517b;
                ju0 ju0Var = ku0Var2.f35490e;
                if (ju0Var != null) {
                    ku0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.jt0) ju0Var).f46687b;
                    profileActivity.f41838r.setTranslationX(profileActivity.m4(profileActivity.f41872v6, profileActivity.f41888x6));
                    profileActivity.f41838r.setTranslationY(profileActivity.n4(profileActivity.f41896y6));
                    return;
                }
                return;
        }
    }
}
