package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34620a = 0;
    public final wq f34621b;

    public j10(wq wqVar) {
        this.f34621b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34620a) {
            case 0:
                ((t10) this.f34621b.d).f37935l0.unlock();
                return;
            default:
                wq wqVar = this.f34621b;
                View view = wqVar.f39742b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((t10) wqVar.d).f37922b.removeView(view);
                return;
        }
    }

    public j10(wq wqVar, s4.o0 o0Var) {
        this.f34621b = wqVar;
    }
}
