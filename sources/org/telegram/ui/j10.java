package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f37981a = 0;
    public final wq f37982b;

    public j10(wq wqVar) {
        this.f37982b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37981a) {
            case 0:
                ((t10) this.f37982b.d).f41438i0.unlock();
                return;
            default:
                wq wqVar = this.f37982b;
                View view = wqVar.f42872b;
                view.setAlpha(1.0f);
                f2.w0.x0(view);
                ((t10) wqVar.d).f41427b.removeView(view);
                return;
        }
    }

    public j10(wq wqVar, f2.w0 w0Var) {
        this.f37982b = wqVar;
    }
}
