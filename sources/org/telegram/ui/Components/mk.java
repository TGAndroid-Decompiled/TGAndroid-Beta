package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class mk extends AnimatorListenerAdapter {
    public final int f27115a = 0;
    public final org.telegram.ui.fr f27116b;

    public mk(org.telegram.ui.fr frVar) {
        this.f27116b = frVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27115a) {
            case 0:
                ((ok) this.f27116b.d).U.unlock();
                return;
            default:
                org.telegram.ui.fr frVar = this.f27116b;
                View view = frVar.f35909b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((ok) frVar.d).X.f28042r.removeView(view);
                return;
        }
    }

    public mk(org.telegram.ui.fr frVar, s4.n0 n0Var) {
        this.f27116b = frVar;
    }
}
