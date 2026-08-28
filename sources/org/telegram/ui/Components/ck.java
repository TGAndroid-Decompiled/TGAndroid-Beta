package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class ck extends AnimatorListenerAdapter {
    public final int f27503a = 0;
    public final org.telegram.ui.nq f27504b;

    public ck(org.telegram.ui.nq nqVar) {
        this.f27504b = nqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27503a) {
            case 0:
                ((ek) this.f27504b.d).Q.unlock();
                return;
            default:
                org.telegram.ui.nq nqVar = this.f27504b;
                View view = nqVar.f40787b;
                view.setAlpha(1.0f);
                f2.z0.x0(view);
                ((ek) nqVar.d).T.f28459r.removeView(view);
                return;
        }
    }

    public ck(org.telegram.ui.nq nqVar, f2.z0 z0Var) {
        this.f27504b = nqVar;
    }
}
