package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class nk extends AnimatorListenerAdapter {
    public final int f26796a = 0;
    public final org.telegram.ui.wq f26797b;

    public nk(org.telegram.ui.wq wqVar) {
        this.f26797b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26796a) {
            case 0:
                ((pk) this.f26797b.d).U.unlock();
                return;
            default:
                org.telegram.ui.wq wqVar = this.f26797b;
                View view = wqVar.f39741b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((pk) wqVar.d).X.f27748r.removeView(view);
                return;
        }
    }

    public nk(org.telegram.ui.wq wqVar, s4.o0 o0Var) {
        this.f26797b = wqVar;
    }
}
