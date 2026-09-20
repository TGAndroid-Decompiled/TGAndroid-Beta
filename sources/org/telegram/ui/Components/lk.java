package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f26173a = 0;
    public final org.telegram.ui.zq f26174b;

    public lk(org.telegram.ui.zq zqVar) {
        this.f26174b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26173a) {
            case 0:
                ((nk) this.f26174b.d).U.unlock();
                return;
            default:
                org.telegram.ui.zq zqVar = this.f26174b;
                View view = zqVar.f40588b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) zqVar.d).X.f26965r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.zq zqVar, s4.o0 o0Var) {
        this.f26174b = zqVar;
    }
}
