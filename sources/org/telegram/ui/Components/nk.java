package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class nk extends AnimatorListenerAdapter {
    public final int f26850a = 0;
    public final org.telegram.ui.xq f26851b;

    public nk(org.telegram.ui.xq xqVar) {
        this.f26851b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26850a) {
            case 0:
                ((pk) this.f26851b.d).U.unlock();
                return;
            default:
                org.telegram.ui.xq xqVar = this.f26851b;
                View view = xqVar.f40027b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((pk) xqVar.d).X.f27762r.removeView(view);
                return;
        }
    }

    public nk(org.telegram.ui.xq xqVar, s4.o0 o0Var) {
        this.f26851b = xqVar;
    }
}
