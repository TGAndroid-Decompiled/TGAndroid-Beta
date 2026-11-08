package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sj extends AnimatorListenerAdapter {
    public final int f38093a = 0;
    public final org.telegram.ui.vp f38094b;

    public sj(org.telegram.ui.vp vpVar) {
        this.f38094b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38093a) {
            case 0:
                ((uj) this.f38094b.d).U.e();
                return;
            default:
                org.telegram.ui.vp vpVar = this.f38094b;
                View view = vpVar.f50753b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((uj) vpVar.d).X.f39020r.removeView(view);
                return;
        }
    }

    public sj(org.telegram.ui.vp vpVar, v4.n0 n0Var) {
        this.f38094b = vpVar;
    }
}
