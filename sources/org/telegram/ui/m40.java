package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class m40 extends AnimatorListenerAdapter {
    public final int f39372a;
    public final u50 f39373b;

    public m40(u50 u50Var, int i10) {
        this.f39372a = i10;
        this.f39373b = u50Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f39372a) {
            case 0:
                u50 u50Var = this.f39373b;
                u50Var.V.setVisibility(4);
                u50Var.W.setVisibility(4);
                u50Var.U.setVisibility(4);
                return;
            case 1:
                this.f39373b.f42200h0 = null;
                return;
            default:
                u50 u50Var2 = this.f39373b;
                u50Var2.f42201h1 = null;
                Paint paint = u50Var2.f42197g1;
                if (u50Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                u50Var2.f42193f1.invalidate();
                return;
        }
    }
}
