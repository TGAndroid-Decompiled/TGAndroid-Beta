package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j10 extends AnimatorListenerAdapter {
    public final int f34605a = 0;
    public final wq f34606b;

    public j10(wq wqVar) {
        this.f34606b = wqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34605a) {
            case 0:
                ((t10) this.f34606b.d).f37917l0.unlock();
                return;
            default:
                wq wqVar = this.f34606b;
                View view = wqVar.f39726b;
                view.setAlpha(1.0f);
                s4.o0.x0(view);
                ((t10) wqVar.d).f37904b.removeView(view);
                return;
        }
    }

    public j10(wq wqVar, s4.o0 o0Var) {
        this.f34606b = wqVar;
    }
}
