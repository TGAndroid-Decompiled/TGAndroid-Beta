package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class h30 extends AnimatorListenerAdapter {
    public final int f35710a;
    public final j30 f35711b;

    public h30(j30 j30Var, int i7) {
        this.f35710a = i7;
        this.f35711b = j30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35710a) {
            case 0:
                j30 j30Var = this.f35711b;
                j30Var.d = null;
                mo moVar = new mo(this, 22);
                j30Var.f36312e = moVar;
                org.telegram.messenger.g0.h3(moVar, j30Var.f36317w);
                return;
            default:
                j30 j30Var2 = this.f35711b;
                j30Var2.setVisibility(4);
                j30Var2.f36311c = null;
                j30Var2.d = null;
                return;
        }
    }
}
