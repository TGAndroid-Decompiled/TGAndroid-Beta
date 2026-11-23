package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class jk extends AnimatorListenerAdapter {
    public final int f36550a = 0;
    public final org.telegram.ui.yp f36551b;

    public jk(org.telegram.ui.yp ypVar) {
        this.f36551b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36550a) {
            case 0:
                ((lk) this.f36551b.d).V.e();
                return;
            default:
                org.telegram.ui.yp ypVar = this.f36551b;
                View view = ypVar.f54269b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((lk) ypVar.d).Y.f37535r.removeView(view);
                return;
        }
    }

    public jk(org.telegram.ui.yp ypVar, v4.p0 p0Var) {
        this.f36551b = ypVar;
    }
}
