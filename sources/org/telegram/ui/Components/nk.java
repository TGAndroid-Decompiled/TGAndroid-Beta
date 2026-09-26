package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class nk extends AnimatorListenerAdapter {
    public final int f26830a = 0;
    public final org.telegram.ui.wq f26831b;

    public nk(org.telegram.ui.wq wqVar) {
        this.f26831b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26830a) {
            case 0:
                ((pk) this.f26831b.d).U.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f26831b;
                View view = wqVar.f39740b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((pk) wqVar.d).X.f27705r.removeView(view);
                return;
        }
    }

    public nk(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.f26831b = wqVar;
    }
}
