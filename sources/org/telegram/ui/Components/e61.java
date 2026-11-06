package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e61 extends AnimatorListenerAdapter {
    public final int f33163a;
    public final p61 f33164b;

    public e61(p61 p61Var, int i7) {
        this.f33163a = i7;
        this.f33164b = p61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33163a) {
            case 0:
                p61 p61Var = this.f33164b;
                View[] viewArr = p61Var.f36906e;
                View[] viewArr2 = p61Var.f36906e;
                if (viewArr[1] != null) {
                    p61Var.G();
                    p61Var.h.put(p61Var.f36907f[1], viewArr2[1]);
                    p61Var.removeView(viewArr2[1]);
                    p61Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                p61Var.S = null;
                p61Var.x(true);
                f61 f61Var = p61Var.M;
                if (f61Var != null) {
                    f61Var.f36665w.invalidate();
                    p61Var.M.f36665w.g1();
                    p61Var.M.invalidate();
                }
                p61Var.u();
                p61Var.J.e();
                return;
            case 1:
                p61 p61Var2 = this.f33164b;
                p61Var2.f36912x = null;
                View[] viewArr3 = p61Var2.f36906e;
                if (viewArr3[1] != null) {
                    if (!p61Var2.F) {
                        p61Var2.G();
                    }
                    p61Var2.h.put(p61Var2.f36907f[1], viewArr3[1]);
                    p61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                p61Var2.f36913y = false;
                p61Var2.I = false;
                f61 f61Var2 = p61Var2.M;
                if (f61Var2 != null) {
                    f61Var2.setEnabled(true);
                }
                p61Var2.x(false);
                p61Var2.u();
                p61Var2.J.e();
                return;
            case 2:
                p61 p61Var3 = this.f33164b;
                p61Var3.f36912x = null;
                View[] viewArr4 = p61Var3.f36906e;
                View view = viewArr4[1];
                if (view != null) {
                    p61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                p61Var3.f36913y = false;
                f61 f61Var3 = p61Var3.M;
                if (f61Var3 != null) {
                    f61Var3.setEnabled(true);
                    f61 f61Var4 = p61Var3.M;
                    f61Var4.J = false;
                    f61Var4.f36640a = 1.0f;
                    f61Var4.f36665w.g1();
                    p61Var3.M.invalidate();
                    return;
                }
                return;
            default:
                p61 p61Var4 = this.f33164b;
                p61Var4.f36912x = null;
                View[] viewArr5 = p61Var4.f36906e;
                if (viewArr5[1] != null) {
                    if (!p61Var4.F) {
                        p61Var4.G();
                    }
                    p61Var4.h.put(p61Var4.f36907f[1], viewArr5[1]);
                    p61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                p61Var4.f36913y = false;
                p61Var4.I = false;
                f61 f61Var5 = p61Var4.M;
                if (f61Var5 != null) {
                    f61Var5.setEnabled(true);
                }
                p61Var4.x(false);
                p61Var4.u();
                p61Var4.J.e();
                return;
        }
    }
}
