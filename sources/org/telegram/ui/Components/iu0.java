package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class iu0 implements Runnable {
    public final int f34801a;
    public final lu0 f34802b;

    public iu0(lu0 lu0Var, int i7) {
        this.f34801a = i7;
        this.f34802b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f34801a) {
            case 0:
                lu0 lu0Var = this.f34802b;
                lu0Var.invalidate();
                org.telegram.messenger.g0.h3(new iu0(lu0Var, 1));
                return;
            default:
                lu0 lu0Var2 = this.f34802b;
                ku0 ku0Var = lu0Var2.f35743e;
                if (ku0Var != null) {
                    lu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.st0) ku0Var).f49807b;
                    profileActivity.f41782r.setTranslationX(profileActivity.m4(profileActivity.f41809u6, profileActivity.f41824w6));
                    profileActivity.f41782r.setTranslationY(profileActivity.n4(profileActivity.f41832x6));
                    return;
                }
                return;
        }
    }
}
