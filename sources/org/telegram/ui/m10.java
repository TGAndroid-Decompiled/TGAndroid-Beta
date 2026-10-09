package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m10 extends AnimatorListenerAdapter {
    public final int f39732a = 0;
    public final zq f39733b;

    public m10(zq zqVar) {
        this.f39733b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39732a) {
            case 0:
                ((w10) this.f39733b.d).f43056l0.unlock();
                return;
            default:
                zq zqVar = this.f39733b;
                View view = zqVar.f45043b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((w10) zqVar.d).f43042b.removeView(view);
                return;
        }
    }

    public m10(zq zqVar, s4.p0 p0Var) {
        this.f39733b = zqVar;
    }
}
