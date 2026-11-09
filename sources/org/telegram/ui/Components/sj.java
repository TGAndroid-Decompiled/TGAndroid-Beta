package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class sj extends AnimatorListenerAdapter {
    public final int f38088a = 0;
    public final org.telegram.ui.xp f38089b;

    public sj(org.telegram.ui.xp xpVar) {
        this.f38089b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38088a) {
            case 0:
                ((uj) this.f38089b.d).U.e();
                return;
            default:
                org.telegram.ui.xp xpVar = this.f38089b;
                View view = xpVar.f51743b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((uj) xpVar.d).X.f39113r.removeView(view);
                return;
        }
    }

    public sj(org.telegram.ui.xp xpVar, v4.n0 n0Var) {
        this.f38089b = xpVar;
    }
}
