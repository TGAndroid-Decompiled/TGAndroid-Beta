package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class rj extends AnimatorListenerAdapter {
    public final int f37739a = 0;
    public final org.telegram.ui.tp f37740b;

    public rj(org.telegram.ui.tp tpVar) {
        this.f37740b = tpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37739a) {
            case 0:
                ((tj) this.f37740b.d).V.e();
                return;
            default:
                org.telegram.ui.tp tpVar = this.f37740b;
                View view = tpVar.f49863b;
                view.setAlpha(1.0f);
                u4.o0.x0(view);
                ((tj) tpVar.d).Y.f38770r.removeView(view);
                return;
        }
    }

    public rj(org.telegram.ui.tp tpVar, u4.o0 o0Var) {
        this.f37740b = tpVar;
    }
}
