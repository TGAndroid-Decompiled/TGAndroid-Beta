package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class v81 extends AnimatorListenerAdapter {
    public final int f31683a;
    public final h91 f31684b;

    public v81(h91 h91Var, int i10) {
        this.f31683a = i10;
        this.f31684b = h91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31683a) {
            case 0:
                h91 h91Var = this.f31684b;
                View[] viewArr = h91Var.f27168e;
                View[] viewArr2 = h91Var.f27168e;
                if (viewArr[1] != null) {
                    h91Var.G();
                    h91Var.h.put(h91Var.f27169f[1], viewArr2[1]);
                    h91Var.removeView(viewArr2[1]);
                    h91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                h91Var.S = null;
                h91Var.x(true);
                w81 w81Var = h91Var.M;
                if (w81Var != null) {
                    w81Var.v.invalidate();
                    h91Var.M.v.g1();
                    h91Var.M.invalidate();
                }
                h91Var.u();
                h91Var.J.unlock();
                return;
            case 1:
                h91 h91Var2 = this.f31684b;
                h91Var2.f27173w = null;
                View[] viewArr3 = h91Var2.f27168e;
                if (viewArr3[1] != null) {
                    if (!h91Var2.F) {
                        h91Var2.G();
                    }
                    h91Var2.h.put(h91Var2.f27169f[1], viewArr3[1]);
                    h91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                h91Var2.f27174x = false;
                h91Var2.I = false;
                w81 w81Var2 = h91Var2.M;
                if (w81Var2 != null) {
                    w81Var2.setEnabled(true);
                }
                h91Var2.x(false);
                h91Var2.u();
                h91Var2.J.unlock();
                return;
            case 2:
                h91 h91Var3 = this.f31684b;
                h91Var3.f27173w = null;
                View[] viewArr4 = h91Var3.f27168e;
                View view = viewArr4[1];
                if (view != null) {
                    h91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                h91Var3.f27174x = false;
                w81 w81Var3 = h91Var3.M;
                if (w81Var3 != null) {
                    w81Var3.setEnabled(true);
                    w81 w81Var4 = h91Var3.M;
                    w81Var4.J = false;
                    w81Var4.f26767a = 1.0f;
                    w81Var4.v.g1();
                    h91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                h91 h91Var4 = this.f31684b;
                h91Var4.f27173w = null;
                View[] viewArr5 = h91Var4.f27168e;
                if (viewArr5[1] != null) {
                    if (!h91Var4.F) {
                        h91Var4.G();
                    }
                    h91Var4.h.put(h91Var4.f27169f[1], viewArr5[1]);
                    h91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                h91Var4.f27174x = false;
                h91Var4.I = false;
                w81 w81Var5 = h91Var4.M;
                if (w81Var5 != null) {
                    w81Var5.setEnabled(true);
                }
                h91Var4.x(false);
                h91Var4.u();
                h91Var4.J.unlock();
                return;
        }
    }
}
