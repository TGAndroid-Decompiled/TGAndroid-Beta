package org.telegram.ui.Components;

import org.telegram.ui.ProfileActivity;
public final class kv0 implements Runnable {
    public final int f27931a;
    public final nv0 f27932b;

    public kv0(nv0 nv0Var, int i10) {
        this.f27931a = i10;
        this.f27932b = nv0Var;
    }

    @Override
    public final void run() {
        switch (this.f27931a) {
            case 0:
                nv0 nv0Var = this.f27932b;
                nv0Var.invalidate();
                org.telegram.messenger.i0.g3(new kv0(nv0Var, 1));
                return;
            default:
                nv0 nv0Var2 = this.f27932b;
                mv0 mv0Var = nv0Var2.e;
                if (mv0Var != null) {
                    nv0Var2.getVisibilityFactor();
                    ProfileActivity profileActivity = ((org.telegram.ui.bv0) mv0Var).f36310b;
                    profileActivity.f33890r.setTranslationX(profileActivity.l4(profileActivity.f33912t6, profileActivity.f33926v6));
                    profileActivity.f33890r.setTranslationY(profileActivity.m4(profileActivity.f33934w6));
                    return;
                }
                return;
        }
    }
}
