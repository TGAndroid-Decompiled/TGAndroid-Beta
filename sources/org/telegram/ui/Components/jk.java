package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class jk extends AnimatorListenerAdapter {
    public final int f36549a = 0;
    public final org.telegram.ui.yp f36550b;

    public jk(org.telegram.ui.yp ypVar) {
        this.f36550b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36549a) {
            case 0:
                ((lk) this.f36550b.d).V.e();
                return;
            default:
                org.telegram.ui.yp ypVar = this.f36550b;
                View view = ypVar.f54269b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((lk) ypVar.d).Y.f37534r.removeView(view);
                return;
        }
    }

    public jk(org.telegram.ui.yp ypVar, v4.p0 p0Var) {
        this.f36550b = ypVar;
    }
}
