package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k10 extends AnimatorListenerAdapter {
    public final int f34550a = 0;
    public final xq f34551b;

    public k10(xq xqVar) {
        this.f34551b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34550a) {
            case 0:
                ((u10) this.f34551b.d).f37859l0.unlock();
                return;
            default:
                xq xqVar = this.f34551b;
                View view = xqVar.f39641b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((u10) xqVar.d).f37846b.removeView(view);
                return;
        }
    }

    public k10(xq xqVar, s4.o0 o0Var) {
        this.f34551b = xqVar;
    }
}
