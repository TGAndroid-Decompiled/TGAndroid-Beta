package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class ru0 implements Runnable {
    public final int f39310a;
    public final uu0 f39311b;

    public ru0(uu0 uu0Var, int i7) {
        this.f39310a = i7;
        this.f39311b = uu0Var;
    }

    @Override
    public final void run() {
        switch (this.f39310a) {
            case 0:
                uu0 uu0Var = this.f39311b;
                uu0Var.invalidate();
                org.telegram.messenger.g0.g3(new ru0(uu0Var, 1));
                return;
            default:
                uu0 uu0Var2 = this.f39311b;
                tu0 tu0Var = uu0Var2.f40424e;
                if (tu0Var != null) {
                    uu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.tt0) tu0Var).f52351b;
                    profileActivity.f43627r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.f43627r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
