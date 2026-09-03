package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ek extends AnimatorListenerAdapter {
    public final int f24623a = 0;
    public final org.telegram.ui.xq f24624b;

    public ek(org.telegram.ui.xq xqVar) {
        this.f24624b = xqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24623a) {
            case 0:
                ((gk) this.f24624b.d).R.unlock();
                return;
            default:
                org.telegram.ui.xq xqVar = this.f24624b;
                View view = xqVar.f40052b;
                view.setAlpha(1.0f);
                f2.v0.x0(view);
                ((gk) xqVar.d).U.f25436r.removeView(view);
                return;
        }
    }

    public ek(org.telegram.ui.xq xqVar, f2.v0 v0Var) {
        this.f24624b = xqVar;
    }
}
