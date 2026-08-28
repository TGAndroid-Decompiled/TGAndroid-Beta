package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b71 extends AnimatorListenerAdapter {
    public final int f27065a;
    public final n71 f27066b;

    public b71(n71 n71Var, int i9) {
        this.f27065a = i9;
        this.f27066b = n71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27065a) {
            case 0:
                n71 n71Var = this.f27066b;
                View[] viewArr = n71Var.f31035e;
                View[] viewArr2 = n71Var.f31035e;
                if (viewArr[1] != null) {
                    n71Var.F();
                    n71Var.h.put(n71Var.f31036f[1], viewArr2[1]);
                    n71Var.removeView(viewArr2[1]);
                    n71Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                n71Var.M = null;
                n71Var.w(true);
                c71 c71Var = n71Var.I;
                if (c71Var != null) {
                    c71Var.v.invalidate();
                    n71Var.I.v.f1();
                    n71Var.I.invalidate();
                }
                n71Var.u();
                n71Var.F.unlock();
                return;
            case 1:
                n71 n71Var2 = this.f27066b;
                n71Var2.f31040w = null;
                View[] viewArr3 = n71Var2.f31035e;
                if (viewArr3[1] != null) {
                    if (!n71Var2.B) {
                        n71Var2.F();
                    }
                    n71Var2.h.put(n71Var2.f31036f[1], viewArr3[1]);
                    n71Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                n71Var2.f31041x = false;
                n71Var2.E = false;
                c71 c71Var2 = n71Var2.I;
                if (c71Var2 != null) {
                    c71Var2.setEnabled(true);
                }
                n71Var2.w(false);
                n71Var2.u();
                n71Var2.F.unlock();
                return;
            case 2:
                n71 n71Var3 = this.f27066b;
                n71Var3.f31040w = null;
                View[] viewArr4 = n71Var3.f31035e;
                View view = viewArr4[1];
                if (view != null) {
                    n71Var3.removeView(view);
                    viewArr4[1] = null;
                }
                n71Var3.f31041x = false;
                c71 c71Var3 = n71Var3.I;
                if (c71Var3 != null) {
                    c71Var3.setEnabled(true);
                    c71 c71Var4 = n71Var3.I;
                    c71Var4.F = false;
                    c71Var4.f30736a = 1.0f;
                    c71Var4.v.f1();
                    n71Var3.I.invalidate();
                    return;
                }
                return;
            default:
                n71 n71Var4 = this.f27066b;
                n71Var4.f31040w = null;
                View[] viewArr5 = n71Var4.f31035e;
                if (viewArr5[1] != null) {
                    if (!n71Var4.B) {
                        n71Var4.F();
                    }
                    n71Var4.h.put(n71Var4.f31036f[1], viewArr5[1]);
                    n71Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                n71Var4.f31041x = false;
                n71Var4.E = false;
                c71 c71Var5 = n71Var4.I;
                if (c71Var5 != null) {
                    c71Var5.setEnabled(true);
                }
                n71Var4.w(false);
                n71Var4.u();
                n71Var4.F.unlock();
                return;
        }
    }
}
