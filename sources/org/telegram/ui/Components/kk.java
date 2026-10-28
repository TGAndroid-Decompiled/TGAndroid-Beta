package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class kk extends AnimatorListenerAdapter {
    public final int f29976a = 0;
    public final org.telegram.ui.tq f29977b;

    public kk(org.telegram.ui.tq tqVar) {
        this.f29977b = tqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29976a) {
            case 0:
                ((mk) this.f29977b.d).U.unlock();
                return;
            default:
                org.telegram.ui.tq tqVar = this.f29977b;
                View view = tqVar.f43726b;
                view.setAlpha(1.0f);
                s4.p0.x0(view);
                ((mk) tqVar.d).X.f30947r.removeView(view);
                return;
        }
    }

    public kk(org.telegram.ui.tq tqVar, s4.p0 p0Var) {
        this.f29977b = tqVar;
    }
}
