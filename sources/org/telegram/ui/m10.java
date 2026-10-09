package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m10 extends AnimatorListenerAdapter {
    public final int f39734a = 0;
    public final zq f39735b;

    public m10(zq zqVar) {
        this.f39735b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39734a) {
            case 0:
                ((w10) this.f39735b.d).f43058l0.unlock();
                return;
            default:
                zq zqVar = this.f39735b;
                View view = zqVar.f45045b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((w10) zqVar.d).f43044b.removeView(view);
                return;
        }
    }

    public m10(zq zqVar, s4.p0 p0Var) {
        this.f39735b = zqVar;
    }
}
