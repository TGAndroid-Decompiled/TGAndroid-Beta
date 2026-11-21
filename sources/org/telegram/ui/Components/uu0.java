package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class uu0 implements Runnable {
    public final int f40595a;
    public final xu0 f40596b;

    public uu0(xu0 xu0Var, int i7) {
        this.f40595a = i7;
        this.f40596b = xu0Var;
    }

    @Override
    public final void run() {
        switch (this.f40595a) {
            case 0:
                xu0 xu0Var = this.f40596b;
                xu0Var.invalidate();
                org.telegram.messenger.g0.g3(new uu0(xu0Var, 1));
                return;
            default:
                xu0 xu0Var2 = this.f40596b;
                wu0 wu0Var = xu0Var2.f42233e;
                if (wu0Var != null) {
                    xu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) wu0Var).f52389b;
                    profileActivity.f43668r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.f43668r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
