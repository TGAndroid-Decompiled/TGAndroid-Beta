package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class jk extends AnimatorListenerAdapter {
    public final int f36508a = 0;
    public final org.telegram.ui.yp f36509b;

    public jk(org.telegram.ui.yp ypVar) {
        this.f36509b = ypVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36508a) {
            case 0:
                ((lk) this.f36509b.d).V.e();
                return;
            default:
                org.telegram.ui.yp ypVar = this.f36509b;
                View view = ypVar.f54220b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((lk) ypVar.d).Y.f37492r.removeView(view);
                return;
        }
    }

    public jk(org.telegram.ui.yp ypVar, v4.o0 o0Var) {
        this.f36509b = ypVar;
    }
}
