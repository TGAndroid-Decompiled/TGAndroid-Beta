package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class j61 extends AnimatorListenerAdapter {
    public final int f34903a;
    public final v61 f34904b;

    public j61(v61 v61Var, int i7) {
        this.f34903a = i7;
        this.f34904b = v61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34903a) {
            case 0:
                v61 v61Var = this.f34904b;
                View[] viewArr = v61Var.f38890e;
                View[] viewArr2 = v61Var.f38890e;
                if (viewArr[1] != null) {
                    v61Var.G();
                    v61Var.h.put(v61Var.f38891f[1], viewArr2[1]);
                    v61Var.removeView(viewArr2[1]);
                    v61Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                v61Var.S = null;
                v61Var.x(true);
                k61 k61Var = v61Var.M;
                if (k61Var != null) {
                    k61Var.f38535w.invalidate();
                    v61Var.M.f38535w.g1();
                    v61Var.M.invalidate();
                }
                v61Var.u();
                v61Var.J.e();
                return;
            case 1:
                v61 v61Var2 = this.f34904b;
                v61Var2.f38896x = null;
                View[] viewArr3 = v61Var2.f38890e;
                if (viewArr3[1] != null) {
                    if (!v61Var2.F) {
                        v61Var2.G();
                    }
                    v61Var2.h.put(v61Var2.f38891f[1], viewArr3[1]);
                    v61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                v61Var2.f38897y = false;
                v61Var2.I = false;
                k61 k61Var2 = v61Var2.M;
                if (k61Var2 != null) {
                    k61Var2.setEnabled(true);
                }
                v61Var2.x(false);
                v61Var2.u();
                v61Var2.J.e();
                return;
            case 2:
                v61 v61Var3 = this.f34904b;
                v61Var3.f38896x = null;
                View[] viewArr4 = v61Var3.f38890e;
                View view = viewArr4[1];
                if (view != null) {
                    v61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                v61Var3.f38897y = false;
                k61 k61Var3 = v61Var3.M;
                if (k61Var3 != null) {
                    k61Var3.setEnabled(true);
                    k61 k61Var4 = v61Var3.M;
                    k61Var4.J = false;
                    k61Var4.f38510a = 1.0f;
                    k61Var4.f38535w.g1();
                    v61Var3.M.invalidate();
                    return;
                }
                return;
            default:
                v61 v61Var4 = this.f34904b;
                v61Var4.f38896x = null;
                View[] viewArr5 = v61Var4.f38890e;
                if (viewArr5[1] != null) {
                    if (!v61Var4.F) {
                        v61Var4.G();
                    }
                    v61Var4.h.put(v61Var4.f38891f[1], viewArr5[1]);
                    v61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                v61Var4.f38897y = false;
                v61Var4.I = false;
                k61 k61Var5 = v61Var4.M;
                if (k61Var5 != null) {
                    k61Var5.setEnabled(true);
                }
                v61Var4.x(false);
                v61Var4.u();
                v61Var4.J.e();
                return;
        }
    }
}
