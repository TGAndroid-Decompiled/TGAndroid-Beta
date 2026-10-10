package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class pk extends AnimatorListenerAdapter {
    public final int f29781a = 0;
    public final org.telegram.ui.zq f29782b;

    public pk(org.telegram.ui.zq zqVar) {
        this.f29782b = zqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29781a) {
            case 0:
                ((rk) this.f29782b.d).U.unlock();
                return;
            default:
                org.telegram.ui.zq zqVar = this.f29782b;
                View view = zqVar.f45089b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((rk) zqVar.d).X.f30810r.removeView(view);
                return;
        }
    }

    public pk(org.telegram.ui.zq zqVar, s4.p0 p0Var) {
        this.f29782b = zqVar;
    }
}
