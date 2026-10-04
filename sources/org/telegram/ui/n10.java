package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f38802a = 0;
    public final yq f38803b;

    public n10(yq yqVar) {
        this.f38803b = yqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38802a) {
            case 0:
                ((x10) this.f38803b.d).f42704l0.unlock();
                return;
            default:
                yq yqVar = this.f38803b;
                View view = yqVar.f43606b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) yqVar.d).f42690b.removeView(view);
                return;
        }
    }

    public n10(yq yqVar, s4.o0 o0Var) {
        this.f38803b = yqVar;
    }
}
