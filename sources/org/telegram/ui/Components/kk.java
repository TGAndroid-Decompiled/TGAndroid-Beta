package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f27901a = 0;
    public final org.telegram.ui.oq f27902b;

    public kk(org.telegram.ui.oq oqVar) {
        this.f27902b = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27901a) {
            case 0:
                ((mk) this.f27902b.d).U.unlock();
                return;
            default:
                org.telegram.ui.oq oqVar = this.f27902b;
                View view = oqVar.f39960b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) oqVar.d).X.f28826r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.oq oqVar, s4.n0 n0Var) {
        this.f27902b = oqVar;
    }
}
