package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34706a = 0;
    public final wq f34707b;

    public j10(wq wqVar) {
        this.f34707b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34706a) {
            case 0:
                ((t10) this.f34707b.d).f38042l0.unlock();
                return;
            default:
                wq wqVar = this.f34707b;
                View view = wqVar.f39836b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((t10) wqVar.d).f38029b.removeView(view);
                return;
        }
    }

    public j10(wq wqVar, s4.o0 o0Var) {
        this.f34707b = wqVar;
    }
}
