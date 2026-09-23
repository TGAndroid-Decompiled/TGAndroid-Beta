package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w71 extends AnimatorListenerAdapter {
    public final int f29561a;
    public final h81 f29562b;

    public w71(h81 h81Var, int i10) {
        this.f29561a = i10;
        this.f29562b = h81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29561a) {
            case 0:
                h81 h81Var = this.f29562b;
                View[] viewArr = h81Var.e;
                View[] viewArr2 = h81Var.e;
                if (viewArr[1] != null) {
                    h81Var.F();
                    h81Var.h.put(h81Var.f24571f[1], viewArr2[1]);
                    h81Var.removeView(viewArr2[1]);
                    h81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                h81Var.Q = null;
                h81Var.w(true);
                x71 x71Var = h81Var.M;
                if (x71Var != null) {
                    x71Var.v.invalidate();
                    h81Var.M.v.f1();
                    h81Var.M.invalidate();
                }
                h81Var.u();
                h81Var.J.unlock();
                return;
            case 1:
                h81 h81Var2 = this.f29562b;
                h81Var2.f24575w = null;
                View[] viewArr3 = h81Var2.e;
                if (viewArr3[1] != null) {
                    if (!h81Var2.F) {
                        h81Var2.F();
                    }
                    h81Var2.h.put(h81Var2.f24571f[1], viewArr3[1]);
                    h81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                h81Var2.f24576x = false;
                h81Var2.I = false;
                x71 x71Var2 = h81Var2.M;
                if (x71Var2 != null) {
                    x71Var2.setEnabled(true);
                }
                h81Var2.w(false);
                h81Var2.u();
                h81Var2.J.unlock();
                return;
            case 2:
                h81 h81Var3 = this.f29562b;
                h81Var3.f24575w = null;
                View[] viewArr4 = h81Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    h81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                h81Var3.f24576x = false;
                x71 x71Var3 = h81Var3.M;
                if (x71Var3 != null) {
                    x71Var3.setEnabled(true);
                    x71 x71Var4 = h81Var3.M;
                    x71Var4.J = false;
                    x71Var4.f24208a = 1.0f;
                    x71Var4.v.f1();
                    h81Var3.M.invalidate();
                    return;
                }
                return;
            default:
                h81 h81Var4 = this.f29562b;
                h81Var4.f24575w = null;
                View[] viewArr5 = h81Var4.e;
                if (viewArr5[1] != null) {
                    if (!h81Var4.F) {
                        h81Var4.F();
                    }
                    h81Var4.h.put(h81Var4.f24571f[1], viewArr5[1]);
                    h81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                h81Var4.f24576x = false;
                h81Var4.I = false;
                x71 x71Var5 = h81Var4.M;
                if (x71Var5 != null) {
                    x71Var5.setEnabled(true);
                }
                h81Var4.w(false);
                h81Var4.u();
                h81Var4.J.unlock();
                return;
        }
    }
}
