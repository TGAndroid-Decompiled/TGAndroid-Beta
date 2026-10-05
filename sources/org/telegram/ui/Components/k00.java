package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k00 extends AnimatorListenerAdapter {
    public final int f28017a;
    public final int f28018b;
    public final float f28019c;
    public final View d;

    public k00(View view, int i10, float f7, int i11) {
        this.f28017a = i11;
        this.d = view;
        this.f28018b = i10;
        this.f28019c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28017a) {
            case 0:
                l00 l00Var = (l00) this.d;
                int i10 = this.f28018b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f28019c;
                }
                l00Var.b(f7, i10 + 1);
                l00Var.f28334y = 0.0f;
                l00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f28018b, this.f28019c, false);
                return;
            default:
                yh.o8 o8Var = (yh.o8) this.d;
                o8Var.f51748c0 = this.f28019c;
                if (o8Var.getValue() != this.f28018b) {
                    o8Var.e(o8Var.getValue());
                }
                o8Var.invalidate();
                return;
        }
    }

    public k00(yh.o8 o8Var, float f7, int i10) {
        this.f28017a = 2;
        this.d = o8Var;
        this.f28019c = f7;
        this.f28018b = i10;
    }
}
