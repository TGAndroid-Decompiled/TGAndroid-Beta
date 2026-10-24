package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a91 extends AnimatorListenerAdapter {
    public final int f24679a;
    public final l91 f24680b;

    public a91(l91 l91Var, int i10) {
        this.f24679a = i10;
        this.f24680b = l91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24679a) {
            case 0:
                l91 l91Var = this.f24680b;
                View[] viewArr = l91Var.e;
                View[] viewArr2 = l91Var.e;
                if (viewArr[1] != null) {
                    l91Var.F();
                    l91Var.h.put(l91Var.f28283f[1], viewArr2[1]);
                    l91Var.removeView(viewArr2[1]);
                    l91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                l91Var.Q = null;
                l91Var.w(true);
                b91 b91Var = l91Var.M;
                if (b91Var != null) {
                    b91Var.v.invalidate();
                    l91Var.M.v.g1();
                    l91Var.M.invalidate();
                }
                l91Var.u();
                l91Var.J.unlock();
                return;
            case 1:
                l91 l91Var2 = this.f24680b;
                l91Var2.f28287w = null;
                View[] viewArr3 = l91Var2.e;
                if (viewArr3[1] != null) {
                    if (!l91Var2.F) {
                        l91Var2.F();
                    }
                    l91Var2.h.put(l91Var2.f28283f[1], viewArr3[1]);
                    l91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                l91Var2.f28288x = false;
                l91Var2.I = false;
                b91 b91Var2 = l91Var2.M;
                if (b91Var2 != null) {
                    b91Var2.setEnabled(true);
                }
                l91Var2.w(false);
                l91Var2.u();
                l91Var2.J.unlock();
                return;
            case 2:
                l91 l91Var3 = this.f24680b;
                l91Var3.f28287w = null;
                View[] viewArr4 = l91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    l91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                l91Var3.f28288x = false;
                b91 b91Var3 = l91Var3.M;
                if (b91Var3 != null) {
                    b91Var3.setEnabled(true);
                    b91 b91Var4 = l91Var3.M;
                    b91Var4.J = false;
                    b91Var4.f27963a = 1.0f;
                    b91Var4.v.g1();
                    l91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                l91 l91Var4 = this.f24680b;
                l91Var4.f28287w = null;
                View[] viewArr5 = l91Var4.e;
                if (viewArr5[1] != null) {
                    if (!l91Var4.F) {
                        l91Var4.F();
                    }
                    l91Var4.h.put(l91Var4.f28283f[1], viewArr5[1]);
                    l91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                l91Var4.f28288x = false;
                l91Var4.I = false;
                b91 b91Var5 = l91Var4.M;
                if (b91Var5 != null) {
                    b91Var5.setEnabled(true);
                }
                l91Var4.w(false);
                l91Var4.u();
                l91Var4.J.unlock();
                return;
        }
    }
}
