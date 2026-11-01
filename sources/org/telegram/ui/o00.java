package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o00 extends AnimatorListenerAdapter {
    public final int f40000a = 0;
    public final uq f40001b;

    public o00(uq uqVar) {
        this.f40001b = uqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40000a) {
            case 0:
                ((y00) this.f40001b.d).f43511l0.e();
                return;
            default:
                uq uqVar = this.f40001b;
                View view = uqVar.f42325b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((y00) uqVar.d).f43498b.removeView(view);
                return;
        }
    }

    public o00(uq uqVar, s4.n0 n0Var) {
        this.f40001b = uqVar;
    }
}
