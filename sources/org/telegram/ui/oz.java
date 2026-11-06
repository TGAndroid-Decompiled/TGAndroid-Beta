package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class oz extends AnimatorListenerAdapter {
    public final int f48581a = 0;
    public final vp f48582b;

    public oz(vp vpVar) {
        this.f48582b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48581a) {
            case 0:
                ((yz) this.f48582b.d).f52389l0.e();
                return;
            default:
                vp vpVar = this.f48582b;
                View view = vpVar.f50783b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((yz) vpVar.d).f52375b.removeView(view);
                return;
        }
    }

    public oz(vp vpVar, v4.n0 n0Var) {
        this.f48582b = vpVar;
    }
}
