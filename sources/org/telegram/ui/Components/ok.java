package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ok extends AnimatorListenerAdapter {
    public final int f29399a = 0;
    public final org.telegram.ui.yq f29400b;

    public ok(org.telegram.ui.yq yqVar) {
        this.f29400b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29399a) {
            case 0:
                ((qk) this.f29400b.d).U.unlock();
                return;
            default:
                org.telegram.ui.yq yqVar = this.f29400b;
                View view = yqVar.f43606b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((qk) yqVar.d).X.f30439r.removeView(view);
                return;
        }
    }

    public ok(org.telegram.ui.yq yqVar, s4.o0 o0Var) {
        this.f29400b = yqVar;
    }
}
