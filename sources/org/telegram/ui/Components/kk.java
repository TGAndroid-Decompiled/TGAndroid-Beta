package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f27905a = 0;
    public final org.telegram.ui.oq f27906b;

    public kk(org.telegram.ui.oq oqVar) {
        this.f27906b = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27905a) {
            case 0:
                ((mk) this.f27906b.d).U.unlock();
                return;
            default:
                org.telegram.ui.oq oqVar = this.f27906b;
                View view = oqVar.f39951b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) oqVar.d).X.f28790r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.oq oqVar, s4.n0 n0Var) {
        this.f27906b = oqVar;
    }
}
