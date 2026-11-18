package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class hk extends AnimatorListenerAdapter {
    public final int f35919a = 0;
    public final org.telegram.ui.yp f35920b;

    public hk(org.telegram.ui.yp ypVar) {
        this.f35920b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35919a) {
            case 0:
                ((jk) this.f35920b.d).V.e();
                return;
            default:
                org.telegram.ui.yp ypVar = this.f35920b;
                View view = ypVar.f54223b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((jk) ypVar.d).Y.f36781r.removeView(view);
                return;
        }
    }

    public hk(org.telegram.ui.yp ypVar, v4.p0 p0Var) {
        this.f35920b = ypVar;
    }
}
