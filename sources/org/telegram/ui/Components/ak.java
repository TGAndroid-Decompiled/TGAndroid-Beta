package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ak extends AnimatorListenerAdapter {
    public final int f33007a = 0;
    public final org.telegram.ui.xp f33008b;

    public ak(org.telegram.ui.xp xpVar) {
        this.f33008b = xpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33007a) {
            case 0:
                ((ck) this.f33008b.d).V.e();
                return;
            default:
                org.telegram.ui.xp xpVar = this.f33008b;
                View view = xpVar.f53280b;
                view.setAlpha(1.0f);
                v4.o0.x0(view);
                ((ck) xpVar.d).Y.f33952r.removeView(view);
                return;
        }
    }

    public ak(org.telegram.ui.xp xpVar, v4.o0 o0Var) {
        this.f33008b = xpVar;
    }
}
