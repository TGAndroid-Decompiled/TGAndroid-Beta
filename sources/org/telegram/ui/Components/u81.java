package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class u81 extends AnimatorListenerAdapter {
    public final int f31331a;
    public final g91 f31332b;

    public u81(g91 g91Var, int i10) {
        this.f31331a = i10;
        this.f31332b = g91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31331a) {
            case 0:
                g91 g91Var = this.f31332b;
                View[] viewArr = g91Var.f26738e;
                View[] viewArr2 = g91Var.f26738e;
                if (viewArr[1] != null) {
                    g91Var.G();
                    g91Var.h.put(g91Var.f26739f[1], viewArr2[1]);
                    g91Var.removeView(viewArr2[1]);
                    g91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                g91Var.S = null;
                g91Var.x(true);
                v81 v81Var = g91Var.M;
                if (v81Var != null) {
                    v81Var.v.invalidate();
                    g91Var.M.v.h1();
                    g91Var.M.invalidate();
                }
                g91Var.u();
                g91Var.J.unlock();
                return;
            case 1:
                g91 g91Var2 = this.f31332b;
                g91Var2.f26743w = null;
                View[] viewArr3 = g91Var2.f26738e;
                if (viewArr3[1] != null) {
                    if (!g91Var2.F) {
                        g91Var2.G();
                    }
                    g91Var2.h.put(g91Var2.f26739f[1], viewArr3[1]);
                    g91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                g91Var2.f26744x = false;
                g91Var2.I = false;
                v81 v81Var2 = g91Var2.M;
                if (v81Var2 != null) {
                    v81Var2.setEnabled(true);
                }
                g91Var2.x(false);
                g91Var2.u();
                g91Var2.J.unlock();
                return;
            case 2:
                g91 g91Var3 = this.f31332b;
                g91Var3.f26743w = null;
                View[] viewArr4 = g91Var3.f26738e;
                View view = viewArr4[1];
                if (view != null) {
                    g91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                g91Var3.f26744x = false;
                v81 v81Var3 = g91Var3.M;
                if (v81Var3 != null) {
                    v81Var3.setEnabled(true);
                    v81 v81Var4 = g91Var3.M;
                    v81Var4.J = false;
                    v81Var4.f26398a = 1.0f;
                    v81Var4.v.h1();
                    g91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                g91 g91Var4 = this.f31332b;
                g91Var4.f26743w = null;
                View[] viewArr5 = g91Var4.f26738e;
                if (viewArr5[1] != null) {
                    if (!g91Var4.F) {
                        g91Var4.G();
                    }
                    g91Var4.h.put(g91Var4.f26739f[1], viewArr5[1]);
                    g91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                g91Var4.f26744x = false;
                g91Var4.I = false;
                v81 v81Var5 = g91Var4.M;
                if (v81Var5 != null) {
                    v81Var5.setEnabled(true);
                }
                g91Var4.x(false);
                g91Var4.u();
                g91Var4.J.unlock();
                return;
        }
    }
}
