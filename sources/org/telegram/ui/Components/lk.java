package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class lk extends AnimatorListenerAdapter {
    public final int f25921a = 0;
    public final org.telegram.ui.br f25922b;

    public lk(org.telegram.ui.br brVar) {
        this.f25922b = brVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25921a) {
            case 0:
                ((nk) this.f25922b.d).U.unlock();
                return;
            default:
                org.telegram.ui.br brVar = this.f25922b;
                View view = brVar.f32564b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((nk) brVar.d).X.f26766r.removeView(view);
                return;
        }
    }

    public lk(org.telegram.ui.br brVar, s4.o0 o0Var) {
        this.f25922b = brVar;
    }
}
