package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class gk extends AnimatorListenerAdapter {
    public final int f27211a = 0;
    public final org.telegram.ui.wq f27212b;

    public gk(org.telegram.ui.wq wqVar) {
        this.f27212b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27211a) {
            case 0:
                ((ik) this.f27212b.d).R.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f27212b;
                View view = wqVar.f42872b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((ik) wqVar.d).U.f28143r.removeView(view);
                return;
        }
    }

    public gk(org.telegram.ui.wq wqVar, f2.w0 w0Var) {
        this.f27212b = wqVar;
    }
}
