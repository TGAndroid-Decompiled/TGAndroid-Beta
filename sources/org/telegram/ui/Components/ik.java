package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ik extends AnimatorListenerAdapter {
    public final int f27437a = 0;
    public final org.telegram.ui.qq f27438b;

    public ik(org.telegram.ui.qq qqVar) {
        this.f27438b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27437a) {
            case 0:
                ((kk) this.f27438b.d).U.unlock();
                return;
            default:
                org.telegram.ui.qq qqVar = this.f27438b;
                View view = qqVar.f40917b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((kk) qqVar.d).X.f28358r.removeView(view);
                return;
        }
    }

    public ik(org.telegram.ui.qq qqVar, s4.n0 n0Var) {
        this.f27438b = qqVar;
    }
}
