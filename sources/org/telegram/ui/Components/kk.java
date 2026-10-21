package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f27898a = 0;
    public final org.telegram.ui.oq f27899b;

    public kk(org.telegram.ui.oq oqVar) {
        this.f27899b = oqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27898a) {
            case 0:
                ((mk) this.f27899b.d).U.unlock();
                return;
            default:
                org.telegram.ui.oq oqVar = this.f27899b;
                View view = oqVar.f39957b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) oqVar.d).X.f28823r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.oq oqVar, s4.n0 n0Var) {
        this.f27899b = oqVar;
    }
}
