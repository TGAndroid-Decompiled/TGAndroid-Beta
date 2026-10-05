package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f38788a = 0;
    public final yq f38789b;

    public n10(yq yqVar) {
        this.f38789b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38788a) {
            case 0:
                ((x10) this.f38789b.d).f42771l0.unlock();
                return;
            default:
                yq yqVar = this.f38789b;
                View view = yqVar.f43599b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) yqVar.d).f42757b.removeView(view);
                return;
        }
    }

    public n10(yq yqVar, s4.o0 o0Var) {
        this.f38789b = yqVar;
    }
}
