package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class pk extends AnimatorListenerAdapter {
    public final int f29881a = 0;
    public final org.telegram.ui.zq f29882b;

    public pk(org.telegram.ui.zq zqVar) {
        this.f29882b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29881a) {
            case 0:
                ((rk) this.f29882b.d).U.unlock();
                return;
            default:
                org.telegram.ui.zq zqVar = this.f29882b;
                View view = zqVar.f45045b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((rk) zqVar.d).X.f30837r.removeView(view);
                return;
        }
    }

    public pk(org.telegram.ui.zq zqVar, s4.p0 p0Var) {
        this.f29882b = zqVar;
    }
}
