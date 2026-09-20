package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
public final class c50 extends AnimatorListenerAdapter {
    public final int f32632a;
    public final i60 f32633b;

    public c50(i60 i60Var, int i10) {
        this.f32632a = i10;
        this.f32633b = i60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        switch (this.f32632a) {
            case 0:
                i60 i60Var = this.f32633b;
                i60Var.V.setVisibility(4);
                i60Var.W.setVisibility(4);
                i60Var.U.setVisibility(4);
                return;
            case 1:
                this.f32633b.f34389h0 = null;
                return;
            default:
                i60 i60Var2 = this.f32633b;
                i60Var2.f34390h1 = null;
                Paint paint = i60Var2.f34386g1;
                if (i60Var2.T1 == 3) {
                    i10 = -1163700;
                } else {
                    i10 = -12761513;
                }
                paint.setColor(i10);
                i60Var2.f34382f1.invalidate();
                return;
        }
    }
}
