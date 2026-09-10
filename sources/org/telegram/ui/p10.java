package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p10 extends AnimatorListenerAdapter {
    public final int f35660a = 0;
    public final dr f35661b;

    public p10(dr drVar) {
        this.f35661b = drVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35660a) {
            case 0:
                ((z10) this.f35661b.d).f39175l0.unlock();
                return;
            default:
                dr drVar = this.f35661b;
                View view = drVar.f31961b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((z10) drVar.d).f39162b.removeView(view);
                return;
        }
    }

    public p10(dr drVar, s4.o0 o0Var) {
        this.f35661b = drVar;
    }
}
