package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l10 extends AnimatorListenerAdapter {
    public final int f39478a = 0;
    public final zq f39479b;

    public l10(zq zqVar) {
        this.f39479b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39478a) {
            case 0:
                ((v10) this.f39479b.d).f42844l0.unlock();
                return;
            default:
                zq zqVar = this.f39479b;
                View view = zqVar.f45059b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((v10) zqVar.d).f42830b.removeView(view);
                return;
        }
    }

    public l10(zq zqVar, s4.p0 p0Var) {
        this.f39479b = zqVar;
    }
}
