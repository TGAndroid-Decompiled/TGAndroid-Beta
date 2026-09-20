package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n10 extends AnimatorListenerAdapter {
    public final int f35871a = 0;
    public final zq f35872b;

    public n10(zq zqVar) {
        this.f35872b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35871a) {
            case 0:
                ((x10) this.f35872b.d).f39307l0.unlock();
                return;
            default:
                zq zqVar = this.f35872b;
                View view = zqVar.f40588b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((x10) zqVar.d).f39294b.removeView(view);
                return;
        }
    }

    public n10(zq zqVar, s4.o0 o0Var) {
        this.f35872b = zqVar;
    }
}
