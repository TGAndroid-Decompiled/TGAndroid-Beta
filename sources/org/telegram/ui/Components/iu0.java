package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class iu0 implements Runnable {
    public final int f34827a;
    public final lu0 f34828b;

    public iu0(lu0 lu0Var, int i7) {
        this.f34827a = i7;
        this.f34828b = lu0Var;
    }

    @Override
    public final void run() {
        switch (this.f34827a) {
            case 0:
                lu0 lu0Var = this.f34828b;
                lu0Var.invalidate();
                org.telegram.messenger.g0.h3(new iu0(lu0Var, 1));
                return;
            default:
                lu0 lu0Var2 = this.f34828b;
                ku0 ku0Var = lu0Var2.f35796e;
                if (ku0Var != null) {
                    lu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) ku0Var).f50141b;
                    profileActivity.f41810r.setTranslationX(profileActivity.m4(profileActivity.f41837u6, profileActivity.f41852w6));
                    profileActivity.f41810r.setTranslationY(profileActivity.n4(profileActivity.f41860x6));
                    return;
                }
                return;
        }
    }
}
