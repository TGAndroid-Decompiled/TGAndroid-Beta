package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class tu0 implements Runnable {
    public final int f40168a;
    public final wu0 f40169b;

    public tu0(wu0 wu0Var, int i7) {
        this.f40168a = i7;
        this.f40169b = wu0Var;
    }

    @Override
    public final void run() {
        switch (this.f40168a) {
            case 0:
                wu0 wu0Var = this.f40169b;
                wu0Var.invalidate();
                org.telegram.messenger.g0.g3(new tu0(wu0Var, 1));
                return;
            default:
                wu0 wu0Var2 = this.f40169b;
                vu0 vu0Var = wu0Var2.f41737e;
                if (vu0Var != null) {
                    wu0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.st0) vu0Var).f52152b;
                    profileActivity.f43753r.setTranslationX(profileActivity.m4(profileActivity.B6, profileActivity.D6));
                    profileActivity.f43753r.setTranslationY(profileActivity.n4(profileActivity.E6));
                    return;
                }
                return;
        }
    }
}
