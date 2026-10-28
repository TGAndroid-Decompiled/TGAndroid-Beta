package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k91 extends AnimatorListenerAdapter {
    public final int f29910a;
    public final v91 f29911b;

    public k91(v91 v91Var, int i10) {
        this.f29910a = i10;
        this.f29911b = v91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29910a) {
            case 0:
                v91 v91Var = this.f29911b;
                View[] viewArr = v91Var.e;
                View[] viewArr2 = v91Var.e;
                if (viewArr[1] != null) {
                    v91Var.G();
                    v91Var.h.put(v91Var.f33634f[1], viewArr2[1]);
                    v91Var.removeView(viewArr2[1]);
                    v91Var.F(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                v91Var.S = null;
                v91Var.x(true);
                l91 l91Var = v91Var.M;
                if (l91Var != null) {
                    l91Var.v.invalidate();
                    v91Var.M.v.g1();
                    v91Var.M.invalidate();
                }
                v91Var.u();
                v91Var.J.unlock();
                return;
            case 1:
                v91 v91Var2 = this.f29911b;
                v91Var2.f33638w = null;
                View[] viewArr3 = v91Var2.e;
                if (viewArr3[1] != null) {
                    if (!v91Var2.F) {
                        v91Var2.G();
                    }
                    v91Var2.h.put(v91Var2.f33634f[1], viewArr3[1]);
                    v91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                v91Var2.f33639x = false;
                v91Var2.I = false;
                l91 l91Var2 = v91Var2.M;
                if (l91Var2 != null) {
                    l91Var2.setEnabled(true);
                }
                v91Var2.x(false);
                v91Var2.u();
                v91Var2.J.unlock();
                return;
            case 2:
                v91 v91Var3 = this.f29911b;
                v91Var3.f33638w = null;
                View[] viewArr4 = v91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    v91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                v91Var3.f33639x = false;
                l91 l91Var3 = v91Var3.M;
                if (l91Var3 != null) {
                    l91Var3.setEnabled(true);
                    l91 l91Var4 = v91Var3.M;
                    l91Var4.J = false;
                    l91Var4.f33296a = 1.0f;
                    l91Var4.v.g1();
                    v91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                v91 v91Var4 = this.f29911b;
                v91Var4.f33638w = null;
                View[] viewArr5 = v91Var4.e;
                if (viewArr5[1] != null) {
                    if (!v91Var4.F) {
                        v91Var4.G();
                    }
                    v91Var4.h.put(v91Var4.f33634f[1], viewArr5[1]);
                    v91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                v91Var4.f33639x = false;
                v91Var4.I = false;
                l91 l91Var5 = v91Var4.M;
                if (l91Var5 != null) {
                    l91Var5.setEnabled(true);
                }
                v91Var4.x(false);
                v91Var4.u();
                v91Var4.J.unlock();
                return;
        }
    }
}
