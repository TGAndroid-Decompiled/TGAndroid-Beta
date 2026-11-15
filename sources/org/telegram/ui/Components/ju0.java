package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class ju0 implements Runnable {
    public final int f36186a;
    public final mu0 f36187b;

    public ju0(mu0 mu0Var, int i7) {
        this.f36186a = i7;
        this.f36187b = mu0Var;
    }

    @Override
    public final void run() {
        switch (this.f36186a) {
            case 0:
                mu0 mu0Var = this.f36187b;
                mu0Var.invalidate();
                org.telegram.messenger.g0.h3(new ju0(mu0Var, 1));
                return;
            default:
                mu0 mu0Var2 = this.f36187b;
                lu0 lu0Var = mu0Var2.f37383e;
                if (lu0Var != null) {
                    mu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.qt0) lu0Var).f50792b;
                    profileActivity.f43181r.setTranslationX(profileActivity.l4(profileActivity.f43246z6, profileActivity.B6));
                    profileActivity.f43181r.setTranslationY(profileActivity.m4(profileActivity.C6));
                    return;
                }
                return;
        }
    }
}
