package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class gk extends AnimatorListenerAdapter {
    public final int f28898a = 0;
    public final org.telegram.ui.pq f28899b;

    public gk(org.telegram.ui.pq pqVar) {
        this.f28899b = pqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28898a) {
            case 0:
                ((ik) this.f28899b.d).Q.unlock();
                return;
            default:
                org.telegram.ui.pq pqVar = this.f28899b;
                View view = pqVar.f41446b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((ik) pqVar.d).T.f29678r.removeView(view);
                return;
        }
    }

    public gk(org.telegram.ui.pq pqVar, f2.w0 w0Var) {
        this.f28899b = pqVar;
    }
}
