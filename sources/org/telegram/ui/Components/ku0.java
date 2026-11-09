package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class ku0 implements Runnable {
    public final int f35488a;
    public final nu0 f35489b;

    public ku0(nu0 nu0Var, int i7) {
        this.f35488a = i7;
        this.f35489b = nu0Var;
    }

    @Override
    public final void run() {
        switch (this.f35488a) {
            case 0:
                nu0 nu0Var = this.f35489b;
                nu0Var.invalidate();
                org.telegram.messenger.g0.h3(new ku0(nu0Var, 1));
                return;
            default:
                nu0 nu0Var2 = this.f35489b;
                mu0 mu0Var = nu0Var2.f36515e;
                if (mu0Var != null) {
                    nu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.vt0) mu0Var).f50774b;
                    profileActivity.f41817r.setTranslationX(profileActivity.m4(profileActivity.f41867x6, profileActivity.f41882z6));
                    profileActivity.f41817r.setTranslationY(profileActivity.n4(profileActivity.A6));
                    return;
                }
                return;
        }
    }
}
