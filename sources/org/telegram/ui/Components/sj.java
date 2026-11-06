package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sj extends AnimatorListenerAdapter {
    public final int f38113a = 0;
    public final org.telegram.ui.vp f38114b;

    public sj(org.telegram.ui.vp vpVar) {
        this.f38114b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38113a) {
            case 0:
                ((uj) this.f38114b.d).U.e();
                return;
            default:
                org.telegram.ui.vp vpVar = this.f38114b;
                View view = vpVar.f50783b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((uj) vpVar.d).X.f38967r.removeView(view);
                return;
        }
    }

    public sj(org.telegram.ui.vp vpVar, v4.n0 n0Var) {
        this.f38114b = vpVar;
    }
}
