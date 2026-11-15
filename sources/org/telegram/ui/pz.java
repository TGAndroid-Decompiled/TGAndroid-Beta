package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class pz extends AnimatorListenerAdapter {
    public final int f50388a = 0;
    public final xp f50389b;

    public pz(xp xpVar) {
        this.f50389b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f50388a) {
            case 0:
                ((zz) this.f50389b.d).m0.e();
                return;
            default:
                xp xpVar = this.f50389b;
                View view = xpVar.f53280b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((zz) xpVar.d).f54075b.removeView(view);
                return;
        }
    }

    public pz(xp xpVar, v4.o0 o0Var) {
        this.f50389b = xpVar;
    }
}
