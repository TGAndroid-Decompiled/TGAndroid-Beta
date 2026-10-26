package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f29933a = 0;
    public final org.telegram.ui.rq f29934b;

    public kk(org.telegram.ui.rq rqVar) {
        this.f29934b = rqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29933a) {
            case 0:
                ((mk) this.f29934b.d).U.unlock();
                return;
            default:
                org.telegram.ui.rq rqVar = this.f29934b;
                View view = rqVar.f43240b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((mk) rqVar.d).X.f31034r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.rq rqVar, s4.p0 p0Var) {
        this.f29934b = rqVar;
    }
}
