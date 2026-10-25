package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f29931a = 0;
    public final org.telegram.ui.rq f29932b;

    public kk(org.telegram.ui.rq rqVar) {
        this.f29932b = rqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29931a) {
            case 0:
                ((mk) this.f29932b.d).U.unlock();
                return;
            default:
                org.telegram.ui.rq rqVar = this.f29932b;
                View view = rqVar.f43237b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((mk) rqVar.d).X.f31032r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.rq rqVar, s4.p0 p0Var) {
        this.f29932b = rqVar;
    }
}
