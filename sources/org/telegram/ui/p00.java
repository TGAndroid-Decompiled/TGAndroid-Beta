package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p00 extends AnimatorListenerAdapter {
    public final int f40407a = 0;
    public final uq f40408b;

    public p00(uq uqVar) {
        this.f40408b = uqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40407a) {
            case 0:
                ((z00) this.f40408b.d).f43954l0.e();
                return;
            default:
                uq uqVar = this.f40408b;
                View view = uqVar.f42515b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((z00) uqVar.d).f43941b.removeView(view);
                return;
        }
    }

    public p00(uq uqVar, s4.n0 n0Var) {
        this.f40408b = uqVar;
    }
}
