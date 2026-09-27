package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m10 extends AnimatorListenerAdapter {
    public final int f35488a = 0;
    public final xq f35489b;

    public m10(xq xqVar) {
        this.f35489b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35488a) {
            case 0:
                ((w10) this.f35489b.d).f38770l0.unlock();
                return;
            default:
                xq xqVar = this.f35489b;
                View view = xqVar.f40027b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((w10) xqVar.d).f38757b.removeView(view);
                return;
        }
    }

    public m10(xq xqVar, s4.o0 o0Var) {
        this.f35489b = xqVar;
    }
}
