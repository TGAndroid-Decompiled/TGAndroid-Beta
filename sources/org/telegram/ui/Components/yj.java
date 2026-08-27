package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class yj extends AnimatorListenerAdapter {

    public final int f34909a = 0;

    public final org.telegram.ui.pq f34910b;

    public yj(org.telegram.ui.pq pqVar) {
        this.f34910b = pqVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34909a) {
            case 0:
                ((ak) this.f34910b.d).Q.unlock();
                break;
            default:
                org.telegram.ui.pq pqVar = this.f34910b;
                View view = pqVar.f41409b;
                view.setAlpha(1.0f);
                f2.x0.x0(view);
                ((ak) pqVar.d).T.f27115r.removeView(view);
                break;
        }
    }

    public yj(org.telegram.ui.pq pqVar, f2.x0 x0Var) {
        this.f34910b = pqVar;
    }
}
