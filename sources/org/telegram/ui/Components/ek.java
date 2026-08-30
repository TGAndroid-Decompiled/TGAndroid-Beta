package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ek extends AnimatorListenerAdapter {
    public final int f24593a = 0;
    public final org.telegram.ui.vq f24594b;

    public ek(org.telegram.ui.vq vqVar) {
        this.f24594b = vqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24593a) {
            case 0:
                ((gk) this.f24594b.d).R.unlock();
                return;
            default:
                org.telegram.ui.vq vqVar = this.f24594b;
                View view = vqVar.f39232b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((gk) vqVar.d).U.f25434r.removeView(view);
                return;
        }
    }

    public ek(org.telegram.ui.vq vqVar, f2.v0 v0Var) {
        this.f24594b = vqVar;
    }
}
