package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class iu0 implements Runnable {
    public final int f34794a;
    public final lu0 f34795b;

    public iu0(lu0 lu0Var, int i7) {
        this.f34794a = i7;
        this.f34795b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f34794a) {
            case 0:
                lu0 lu0Var = this.f34795b;
                lu0Var.invalidate();
                org.telegram.messenger.g0.h3(new iu0(lu0Var, 1));
                return;
            default:
                lu0 lu0Var2 = this.f34795b;
                ku0 ku0Var = lu0Var2.f35768e;
                if (ku0Var != null) {
                    lu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) ku0Var).f50149b;
                    profileActivity.f41806r.setTranslationX(profileActivity.m4(profileActivity.f41833u6, profileActivity.f41848w6));
                    profileActivity.f41806r.setTranslationY(profileActivity.n4(profileActivity.f41856x6));
                    return;
                }
                return;
        }
    }
}
