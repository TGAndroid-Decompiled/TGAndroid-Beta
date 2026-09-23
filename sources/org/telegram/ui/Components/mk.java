package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class mk extends AnimatorListenerAdapter {
    public final int f26186a = 0;
    public final org.telegram.ui.xq f26187b;

    public mk(org.telegram.ui.xq xqVar) {
        this.f26187b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26186a) {
            case 0:
                ((ok) this.f26187b.d).U.unlock();
                return;
            default:
                org.telegram.ui.xq xqVar = this.f26187b;
                View view = xqVar.f39641b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((ok) xqVar.d).X.f27068r.removeView(view);
                return;
        }
    }

    public mk(org.telegram.ui.xq xqVar, s4.o0 o0Var) {
        this.f26187b = xqVar;
    }
}
