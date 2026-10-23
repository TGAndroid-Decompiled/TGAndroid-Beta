package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f28054a = 0;
    public final org.telegram.ui.qq f28055b;

    public kk(org.telegram.ui.qq qqVar) {
        this.f28055b = qqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28054a) {
            case 0:
                ((mk) this.f28055b.d).U.unlock();
                return;
            default:
                org.telegram.ui.qq qqVar = this.f28055b;
                View view = qqVar.f40905b;
                view.setAlpha(1.0f);
                s4.n0.x0(view);
                ((mk) qqVar.d).X.f28977r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.qq qqVar, s4.n0 n0Var) {
        this.f28055b = qqVar;
    }
}
