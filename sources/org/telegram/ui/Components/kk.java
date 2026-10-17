package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f27927a = 0;
    public final org.telegram.ui.qq f27928b;

    public kk(org.telegram.ui.qq qqVar) {
        this.f27928b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27927a) {
            case 0:
                ((mk) this.f27928b.d).U.unlock();
                return;
            default:
                org.telegram.ui.qq qqVar = this.f27928b;
                View view = qqVar.f40485b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) qqVar.d).X.f28774r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.qq qqVar, s4.n0 n0Var) {
        this.f27928b = qqVar;
    }
}
