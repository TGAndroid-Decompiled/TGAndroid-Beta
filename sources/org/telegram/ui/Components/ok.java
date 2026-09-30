package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ok extends AnimatorListenerAdapter {
    public final int f27113a = 0;
    public final org.telegram.ui.wq f27114b;

    public ok(org.telegram.ui.wq wqVar) {
        this.f27114b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27113a) {
            case 0:
                ((qk) this.f27114b.d).U.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f27114b;
                View view = wqVar.f39836b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((qk) wqVar.d).X.f28045r.removeView(view);
                return;
        }
    }

    public ok(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.f27114b = wqVar;
    }
}
