package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class oz extends AnimatorListenerAdapter {
    public final int f48575a = 0;
    public final vp f48576b;

    public oz(vp vpVar) {
        this.f48576b = vpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48575a) {
            case 0:
                ((yz) this.f48576b.d).f52394l0.e();
                return;
            default:
                vp vpVar = this.f48576b;
                View view = vpVar.f50809b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((yz) vpVar.d).f52380b.removeView(view);
                return;
        }
    }

    public oz(vp vpVar, v4.n0 n0Var) {
        this.f48576b = vpVar;
    }
}
