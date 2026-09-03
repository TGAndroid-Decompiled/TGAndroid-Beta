package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k10 extends AnimatorListenerAdapter {
    public final int f35402a = 0;
    public final xq f35403b;

    public k10(xq xqVar) {
        this.f35403b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35402a) {
            case 0:
                ((u10) this.f35403b.d).f38650i0.unlock();
                return;
            default:
                xq xqVar = this.f35403b;
                View view = xqVar.f40052b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((u10) xqVar.d).f38640b.removeView(view);
                return;
        }
    }

    public k10(xq xqVar, f2.v0 v0Var) {
        this.f35403b = xqVar;
    }
}
