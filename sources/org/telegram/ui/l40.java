package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class l40 extends AnimatorListenerAdapter {
    public final int f38785a;
    public final s50 f38786b;

    public l40(s50 s50Var, int i10) {
        this.f38785a = i10;
        this.f38786b = s50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f38785a) {
            case 0:
                s50 s50Var = this.f38786b;
                s50Var.V.setVisibility(4);
                s50Var.W.setVisibility(4);
                s50Var.U.setVisibility(4);
                return;
            case 1:
                this.f38786b.f40942h0 = null;
                return;
            default:
                s50 s50Var2 = this.f38786b;
                s50Var2.f40943h1 = null;
                Paint paint = s50Var2.f40939g1;
                if (s50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                s50Var2.f40935f1.invalidate();
                return;
        }
    }
}
