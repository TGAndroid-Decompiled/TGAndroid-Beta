package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f38797a = 0;
    public final yq f38798b;

    public n10(yq yqVar) {
        this.f38798b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38797a) {
            case 0:
                ((x10) this.f38798b.d).f42697l0.unlock();
                return;
            default:
                yq yqVar = this.f38798b;
                View view = yqVar.f43599b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) yqVar.d).f42683b.removeView(view);
                return;
        }
    }

    public n10(yq yqVar, s4.o0 o0Var) {
        this.f38798b = yqVar;
    }
}
