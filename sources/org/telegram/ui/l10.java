package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l10 extends AnimatorListenerAdapter {
    public final int f39512a = 0;
    public final zq f39513b;

    public l10(zq zqVar) {
        this.f39513b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39512a) {
            case 0:
                ((v10) this.f39513b.d).f42878l0.unlock();
                return;
            default:
                zq zqVar = this.f39513b;
                View view = zqVar.f45093b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((v10) zqVar.d).f42864b.removeView(view);
                return;
        }
    }

    public l10(zq zqVar, s4.p0 p0Var) {
        this.f39513b = zqVar;
    }
}
