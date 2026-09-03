package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f37817a = 0;
    public final wq f37818b;

    public j10(wq wqVar) {
        this.f37818b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37817a) {
            case 0:
                ((t10) this.f37818b.d).f41368i0.unlock();
                return;
            default:
                wq wqVar = this.f37818b;
                View view = wqVar.f42844b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((t10) wqVar.d).f41357b.removeView(view);
                return;
        }
    }

    public j10(wq wqVar, f2.w0 w0Var) {
        this.f37818b = wqVar;
    }
}
