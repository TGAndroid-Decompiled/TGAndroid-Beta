package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class iu0 implements Runnable {
    public final int f34764a;
    public final lu0 f34765b;

    public iu0(lu0 lu0Var, int i7) {
        this.f34764a = i7;
        this.f34765b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f34764a) {
            case 0:
                lu0 lu0Var = this.f34765b;
                lu0Var.invalidate();
                org.telegram.messenger.g0.h3(new iu0(lu0Var, 1));
                return;
            default:
                lu0 lu0Var2 = this.f34765b;
                ku0 ku0Var = lu0Var2.f35748e;
                if (ku0Var != null) {
                    lu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) ku0Var).f50150b;
                    profileActivity.f41807r.setTranslationX(profileActivity.m4(profileActivity.f41834u6, profileActivity.f41849w6));
                    profileActivity.f41807r.setTranslationY(profileActivity.n4(profileActivity.f41857x6));
                    return;
                }
                return;
        }
    }
}
