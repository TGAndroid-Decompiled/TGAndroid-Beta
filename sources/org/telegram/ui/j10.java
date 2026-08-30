package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f35199a = 0;
    public final vq f35200b;

    public j10(vq vqVar) {
        this.f35200b = vqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35199a) {
            case 0:
                ((t10) this.f35200b.d).f38484i0.unlock();
                return;
            default:
                vq vqVar = this.f35200b;
                View view = vqVar.f39232b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((t10) vqVar.d).f38474b.removeView(view);
                return;
        }
    }

    public j10(vq vqVar, f2.v0 v0Var) {
        this.f35200b = vqVar;
    }
}
