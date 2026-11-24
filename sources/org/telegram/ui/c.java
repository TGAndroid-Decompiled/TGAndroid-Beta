package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c extends AnimatorListenerAdapter {
    public final boolean a;
    public final o b;

    public c(o oVar, int i) {
        this.b = oVar;
        this.a = i;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        o oVar = this.b;
        oVar.v0[1].a();
        oVar.v0[1].setVisibility(8);
        oVar.Q0.Q(oVar.v0[0].b);
        fib fibVar = oVar.Q0;
        m[] mVarArr = oVar.v0;
        fibVar.z0 = mVarArr[0].d;
        boolean z = this.a;
        mVarArr[z ? 1 : 0].setBackgroundDrawable(null);
        oVar.v0[z ? 1 : 0].setLayerType(0, null);
        oVar.w0 = null;
        oVar.g0.f = false;
    }
}
