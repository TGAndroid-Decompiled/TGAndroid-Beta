package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j01 extends AnimatorListenerAdapter {
    public final int f38239a;
    public final k01 f38240b;

    public j01(k01 k01Var, int i10) {
        this.f38239a = i10;
        this.f38240b = k01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38239a) {
            case 0:
                k01 k01Var = this.f38240b;
                if (k01Var.h != null) {
                    k01Var.h = null;
                    k01Var.e = 0.0f;
                    k01Var.g();
                    k01Var.f38626n.e();
                    dx dxVar = k01Var.f38622a;
                    if (dxVar != null) {
                        dxVar.onPause();
                        k01Var.f38622a.onFragmentDestroy();
                        k01Var.removeAllViews();
                        k01Var.f38622a = null;
                        org.telegram.messenger.at.e().k(268, new Object[0]);
                    }
                    k01Var.d(false);
                    return;
                }
                return;
            default:
                k01 k01Var2 = this.f38240b;
                if (k01Var2.h != null) {
                    k01Var2.h = null;
                    k01Var2.d(true);
                    return;
                }
                return;
        }
    }
}
