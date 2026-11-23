package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class uu0 implements Runnable {
    public final int f40544a;
    public final xu0 f40545b;

    public uu0(xu0 xu0Var, int i7) {
        this.f40544a = i7;
        this.f40545b = xu0Var;
    }

    @Override
    public final void run() {
        switch (this.f40544a) {
            case 0:
                xu0 xu0Var = this.f40545b;
                xu0Var.invalidate();
                org.telegram.messenger.g0.g3(new uu0(xu0Var, 1));
                return;
            default:
                xu0 xu0Var2 = this.f40545b;
                wu0 wu0Var = xu0Var2.f42201e;
                if (wu0Var != null) {
                    xu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.ut0) wu0Var).f52631b;
                    profileActivity.f43637r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.f43637r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
