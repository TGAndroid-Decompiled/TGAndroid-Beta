package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rj extends AnimatorListenerAdapter {
    public final int f37674a = 0;
    public final org.telegram.ui.xp f37675b;

    public rj(org.telegram.ui.xp xpVar) {
        this.f37675b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37674a) {
            case 0:
                ((tj) this.f37675b.d).U.e();
                return;
            default:
                org.telegram.ui.xp xpVar = this.f37675b;
                View view = xpVar.f51779b;
                view.setAlpha(1.0f);
                v4.n0.x0(view);
                ((tj) xpVar.d).X.f38698r.removeView(view);
                return;
        }
    }

    public rj(org.telegram.ui.xp xpVar, v4.n0 n0Var) {
        this.f37675b = xpVar;
    }
}
