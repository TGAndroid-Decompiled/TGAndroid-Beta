package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f25933a = 0;
    public final org.telegram.ui.br f25934b;

    public lk(org.telegram.ui.br brVar) {
        this.f25934b = brVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25933a) {
            case 0:
                ((nk) this.f25934b.d).U.unlock();
                return;
            default:
                org.telegram.ui.br brVar = this.f25934b;
                View view = brVar.f32569b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) brVar.d).X.f26821r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.br brVar, s4.o0 o0Var) {
        this.f25934b = brVar;
    }
}
