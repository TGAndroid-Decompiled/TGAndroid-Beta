package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ok extends AnimatorListenerAdapter {
    public final int f29394a = 0;
    public final org.telegram.ui.yq f29395b;

    public ok(org.telegram.ui.yq yqVar) {
        this.f29395b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29394a) {
            case 0:
                ((qk) this.f29395b.d).U.unlock();
                return;
            default:
                org.telegram.ui.yq yqVar = this.f29395b;
                View view = yqVar.f43599b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((qk) yqVar.d).X.f30433r.removeView(view);
                return;
        }
    }

    public ok(org.telegram.ui.yq yqVar, s4.o0 o0Var) {
        this.f29395b = yqVar;
    }
}
