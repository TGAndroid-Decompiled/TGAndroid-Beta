package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class uu0 implements Runnable {
    public final int f40587a;
    public final xu0 f40588b;

    public uu0(xu0 xu0Var, int i7) {
        this.f40587a = i7;
        this.f40588b = xu0Var;
    }

    @Override
    public final void run() {
        switch (this.f40587a) {
            case 0:
                xu0 xu0Var = this.f40588b;
                xu0Var.invalidate();
                org.telegram.messenger.g0.g3(new uu0(xu0Var, 1));
                return;
            default:
                xu0 xu0Var2 = this.f40588b;
                wu0 wu0Var = xu0Var2.f42225e;
                if (wu0Var != null) {
                    xu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) wu0Var).f52393b;
                    profileActivity.f43672r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.f43672r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
