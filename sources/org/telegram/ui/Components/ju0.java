package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class ju0 implements Runnable {
    public final int f35079a;
    public final mu0 f35080b;

    public ju0(mu0 mu0Var, int i7) {
        this.f35079a = i7;
        this.f35080b = mu0Var;
    }

    @Override
    public final void run() {
        switch (this.f35079a) {
            case 0:
                mu0 mu0Var = this.f35080b;
                mu0Var.invalidate();
                org.telegram.messenger.g0.h3(new ju0(mu0Var, 1));
                return;
            default:
                mu0 mu0Var2 = this.f35080b;
                lu0 lu0Var = mu0Var2.f36107e;
                if (lu0Var != null) {
                    mu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.wt0) lu0Var).f51444b;
                    profileActivity.f41808r.setTranslationX(profileActivity.m4(profileActivity.f41858x6, profileActivity.f41873z6));
                    profileActivity.f41808r.setTranslationY(profileActivity.n4(profileActivity.A6));
                    return;
                }
                return;
        }
    }
}
