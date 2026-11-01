package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m71 extends AnimatorListenerAdapter {
    public final int f28400a;
    public final x71 f28401b;

    public m71(x71 x71Var, int i10) {
        this.f28400a = i10;
        this.f28401b = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28400a) {
            case 0:
                x71 x71Var = this.f28401b;
                View[] viewArr = x71Var.e;
                View[] viewArr2 = x71Var.e;
                if (viewArr[1] != null) {
                    x71Var.G();
                    x71Var.h.put(x71Var.f32495f[1], viewArr2[1]);
                    x71Var.removeView(viewArr2[1]);
                    x71Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                x71Var.S = null;
                x71Var.x(true);
                n71 n71Var = x71Var.M;
                if (n71Var != null) {
                    n71Var.f32162w.invalidate();
                    x71Var.M.f32162w.g1();
                    x71Var.M.invalidate();
                }
                x71Var.u();
                x71Var.J.e();
                return;
            case 1:
                x71 x71Var2 = this.f28401b;
                x71Var2.f32500x = null;
                View[] viewArr3 = x71Var2.e;
                if (viewArr3[1] != null) {
                    if (!x71Var2.F) {
                        x71Var2.G();
                    }
                    x71Var2.h.put(x71Var2.f32495f[1], viewArr3[1]);
                    x71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                x71Var2.f32501y = false;
                x71Var2.I = false;
                n71 n71Var2 = x71Var2.M;
                if (n71Var2 != null) {
                    n71Var2.setEnabled(true);
                }
                x71Var2.x(false);
                x71Var2.u();
                x71Var2.J.e();
                return;
            case 2:
                x71 x71Var3 = this.f28401b;
                x71Var3.f32500x = null;
                View[] viewArr4 = x71Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    x71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                x71Var3.f32501y = false;
                n71 n71Var3 = x71Var3.M;
                if (n71Var3 != null) {
                    n71Var3.setEnabled(true);
                    n71 n71Var4 = x71Var3.M;
                    n71Var4.J = false;
                    n71Var4.f32138a = 1.0f;
                    n71Var4.f32162w.g1();
                    x71Var3.M.invalidate();
                    return;
                }
                return;
            default:
                x71 x71Var4 = this.f28401b;
                x71Var4.f32500x = null;
                View[] viewArr5 = x71Var4.e;
                if (viewArr5[1] != null) {
                    if (!x71Var4.F) {
                        x71Var4.G();
                    }
                    x71Var4.h.put(x71Var4.f32495f[1], viewArr5[1]);
                    x71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                x71Var4.f32501y = false;
                x71Var4.I = false;
                n71 n71Var5 = x71Var4.M;
                if (n71Var5 != null) {
                    n71Var5.setEnabled(true);
                }
                x71Var4.x(false);
                x71Var4.u();
                x71Var4.J.e();
                return;
        }
    }
}
