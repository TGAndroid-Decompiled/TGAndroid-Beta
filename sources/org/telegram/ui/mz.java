package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class mz extends AnimatorListenerAdapter {
    public final int f47836a = 0;
    public final tp f47837b;

    public mz(tp tpVar) {
        this.f47837b = tpVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47836a) {
            case 0:
                ((wz) this.f47837b.d).m0.e();
                return;
            default:
                tp tpVar = this.f47837b;
                View view = tpVar.f49863b;
                view.setAlpha(1.0f);
                u4.o0.x0(view);
                ((wz) tpVar.d).f51638b.removeView(view);
                return;
        }
    }

    public mz(tp tpVar, u4.o0 o0Var) {
        this.f47837b = tpVar;
    }
}
