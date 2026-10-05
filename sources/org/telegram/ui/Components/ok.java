package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ok extends AnimatorListenerAdapter {
    public final int f29499a = 0;
    public final org.telegram.ui.yq f29500b;

    public ok(org.telegram.ui.yq yqVar) {
        this.f29500b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29499a) {
            case 0:
                ((qk) this.f29500b.d).U.unlock();
                return;
            default:
                org.telegram.ui.yq yqVar = this.f29500b;
                View view = yqVar.f43599b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((qk) yqVar.d).X.f30521r.removeView(view);
                return;
        }
    }

    public ok(org.telegram.ui.yq yqVar, s4.o0 o0Var) {
        this.f29500b = yqVar;
    }
}
