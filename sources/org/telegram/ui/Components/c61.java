package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c61 extends AnimatorListenerAdapter {
    public final int f32570a;
    public final n61 f32571b;

    public c61(n61 n61Var, int i3) {
        this.f32570a = i3;
        this.f32571b = n61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32570a) {
            case 0:
                n61 n61Var = this.f32571b;
                View[] viewArr = n61Var.f36386e;
                View[] viewArr2 = n61Var.f36386e;
                if (viewArr[1] != null) {
                    n61Var.F();
                    n61Var.h.put(n61Var.f36387f[1], viewArr2[1]);
                    n61Var.removeView(viewArr2[1]);
                    n61Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                n61Var.T = null;
                n61Var.v(true);
                d61 d61Var = n61Var.N;
                if (d61Var != null) {
                    d61Var.f36052w.invalidate();
                    n61Var.N.f36052w.g1();
                    n61Var.N.invalidate();
                }
                n61Var.s();
                n61Var.K.e();
                return;
            case 1:
                n61 n61Var2 = this.f32571b;
                n61Var2.f36392x = null;
                View[] viewArr3 = n61Var2.f36386e;
                if (viewArr3[1] != null) {
                    if (!n61Var2.G) {
                        n61Var2.F();
                    }
                    n61Var2.h.put(n61Var2.f36387f[1], viewArr3[1]);
                    n61Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                n61Var2.f36393y = false;
                n61Var2.J = false;
                d61 d61Var2 = n61Var2.N;
                if (d61Var2 != null) {
                    d61Var2.setEnabled(true);
                }
                n61Var2.v(false);
                n61Var2.s();
                n61Var2.K.e();
                return;
            case 2:
                n61 n61Var3 = this.f32571b;
                n61Var3.f36392x = null;
                View[] viewArr4 = n61Var3.f36386e;
                View view = viewArr4[1];
                if (view != null) {
                    n61Var3.removeView(view);
                    viewArr4[1] = null;
                }
                n61Var3.f36393y = false;
                d61 d61Var3 = n61Var3.N;
                if (d61Var3 != null) {
                    d61Var3.setEnabled(true);
                    d61 d61Var4 = n61Var3.N;
                    d61Var4.K = false;
                    d61Var4.f36026a = 1.0f;
                    d61Var4.f36052w.g1();
                    n61Var3.N.invalidate();
                    return;
                }
                return;
            default:
                n61 n61Var4 = this.f32571b;
                n61Var4.f36392x = null;
                View[] viewArr5 = n61Var4.f36386e;
                if (viewArr5[1] != null) {
                    if (!n61Var4.G) {
                        n61Var4.F();
                    }
                    n61Var4.h.put(n61Var4.f36387f[1], viewArr5[1]);
                    n61Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                n61Var4.f36393y = false;
                n61Var4.J = false;
                d61 d61Var5 = n61Var4.N;
                if (d61Var5 != null) {
                    d61Var5.setEnabled(true);
                }
                n61Var4.v(false);
                n61Var4.s();
                n61Var4.K.e();
                return;
        }
    }
}
