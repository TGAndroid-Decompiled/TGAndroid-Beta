package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sj extends AnimatorListenerAdapter {
    public final int f38077a = 0;
    public final org.telegram.ui.vp f38078b;

    public sj(org.telegram.ui.vp vpVar) {
        this.f38078b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38077a) {
            case 0:
                ((uj) this.f38078b.d).U.e();
                return;
            default:
                org.telegram.ui.vp vpVar = this.f38078b;
                View view = vpVar.f50809b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((uj) vpVar.d).X.f38985r.removeView(view);
                return;
        }
    }

    public sj(org.telegram.ui.vp vpVar, v4.n0 n0Var) {
        this.f38078b = vpVar;
    }
}
