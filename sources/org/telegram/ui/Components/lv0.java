package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class lv0 implements Runnable {
    public final int f28293a;
    public final ov0 f28294b;

    public lv0(ov0 ov0Var, int i10) {
        this.f28293a = i10;
        this.f28294b = ov0Var;
    }

    @Override
    public final void run() {
        switch (this.f28293a) {
            case 0:
                ov0 ov0Var = this.f28294b;
                ov0Var.invalidate();
                org.telegram.messenger.i0.g3(new lv0(ov0Var, 1));
                return;
            default:
                ov0 ov0Var2 = this.f28294b;
                nv0 nv0Var = ov0Var2.e;
                if (nv0Var != null) {
                    ov0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.av0) nv0Var).f35843b;
                    profileActivity.f33897r.setTranslationX(profileActivity.m4(profileActivity.f33926u6, profileActivity.f33941w6));
                    profileActivity.f33897r.setTranslationY(profileActivity.n4(profileActivity.f33949x6));
                    return;
                }
                return;
        }
    }
}
