package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class jk extends AnimatorListenerAdapter {
    public final int f36555a = 0;
    public final org.telegram.ui.yp f36556b;

    public jk(org.telegram.ui.yp ypVar) {
        this.f36556b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36555a) {
            case 0:
                ((lk) this.f36556b.d).V.e();
                return;
            default:
                org.telegram.ui.yp ypVar = this.f36556b;
                View view = ypVar.f54265b;
                view.setAlpha(1.0f);
                v4.p0.x0(view);
                ((lk) ypVar.d).Y.f37536r.removeView(view);
                return;
        }
    }

    public jk(org.telegram.ui.yp ypVar, v4.p0 p0Var) {
        this.f36556b = ypVar;
    }
}
