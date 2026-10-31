package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j01 extends AnimatorListenerAdapter {
    public final int f38402a;
    public final k01 f38403b;

    public j01(k01 k01Var, int i10) {
        this.f38402a = i10;
        this.f38403b = k01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38402a) {
            case 0:
                k01 k01Var = this.f38403b;
                if (k01Var.h != null) {
                    k01Var.h = null;
                    k01Var.e = 0.0f;
                    k01Var.g();
                    k01Var.f38660n.e();
                    ex exVar = k01Var.f38656a;
                    if (exVar != null) {
                        exVar.onPause();
                        k01Var.f38656a.onFragmentDestroy();
                        k01Var.removeAllViews();
                        k01Var.f38656a = null;
                        org.telegram.messenger.zs.e().k(268, new Object[0]);
                    }
                    k01Var.d(false);
                    return;
                }
                return;
            default:
                k01 k01Var2 = this.f38403b;
                if (k01Var2.h != null) {
                    k01Var2.h = null;
                    k01Var2.d(true);
                    return;
                }
                return;
        }
    }
}
