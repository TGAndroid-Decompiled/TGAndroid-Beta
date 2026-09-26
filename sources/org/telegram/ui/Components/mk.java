package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class mk extends AnimatorListenerAdapter {
    public final int f26534a = 0;
    public final org.telegram.ui.wq f26535b;

    public mk(org.telegram.ui.wq wqVar) {
        this.f26535b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26534a) {
            case 0:
                ((ok) this.f26535b.d).U.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f26535b;
                View view = wqVar.f39741b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((ok) wqVar.d).X.f27373r.removeView(view);
                return;
        }
    }

    public mk(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.f26535b = wqVar;
    }
}
