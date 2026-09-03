package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class gk extends AnimatorListenerAdapter {
    public final int f27189a = 0;
    public final org.telegram.ui.wq f27190b;

    public gk(org.telegram.ui.wq wqVar) {
        this.f27190b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27189a) {
            case 0:
                ((ik) this.f27190b.d).R.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f27190b;
                View view = wqVar.f42844b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((ik) wqVar.d).U.f28132r.removeView(view);
                return;
        }
    }

    public gk(org.telegram.ui.wq wqVar, f2.w0 w0Var) {
        this.f27190b = wqVar;
    }
}
