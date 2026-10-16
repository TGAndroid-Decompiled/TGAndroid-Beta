package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class t00 extends AnimatorListenerAdapter {
    public final int f28939a;
    public final int f28940b;
    public final float f28941c;
    public final View d;

    public t00(View view, int i10, float f7, int i11) {
        this.f28939a = i11;
        this.d = view;
        this.f28940b = i10;
        this.f28941c = f7;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f7;
        switch (this.f28939a) {
            case 0:
                u00 u00Var = (u00) this.d;
                int i10 = this.f28940b;
                if (i10 == 5) {
                    f7 = 0.0f;
                } else {
                    f7 = -this.f28941c;
                }
                u00Var.b(f7, i10 + 1);
                u00Var.f29232y = 0.0f;
                u00Var.invalidate();
                return;
            case 1:
                ((org.telegram.ui.web.v1) this.d).c(this.f28940b, this.f28941c, false);
                return;
            default:
                zh.e8 e8Var = (zh.e8) this.d;
                e8Var.f50463c0 = this.f28941c;
                if (e8Var.getValue() != this.f28940b) {
                    e8Var.e(e8Var.getValue());
                }
                e8Var.invalidate();
                return;
        }
    }

    public t00(zh.e8 e8Var, float f7, int i10) {
        this.f28939a = 2;
        this.d = e8Var;
        this.f28941c = f7;
        this.f28940b = i10;
    }
}
