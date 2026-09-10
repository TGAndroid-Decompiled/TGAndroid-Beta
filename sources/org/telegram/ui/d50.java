package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class d50 extends AnimatorListenerAdapter {
    public final int f31832a;
    public final j60 f31833b;

    public d50(j60 j60Var, int i10) {
        this.f31832a = i10;
        this.f31833b = j60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f31832a) {
            case 0:
                j60 j60Var = this.f31833b;
                j60Var.V.setVisibility(4);
                j60Var.W.setVisibility(4);
                j60Var.U.setVisibility(4);
                return;
            case 1:
                this.f31833b.f33965h0 = null;
                return;
            default:
                j60 j60Var2 = this.f31833b;
                j60Var2.f33966h1 = null;
                Paint paint = j60Var2.f33962g1;
                if (j60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                j60Var2.f33958f1.invalidate();
                return;
        }
    }
}
