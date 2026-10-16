package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a91 extends AnimatorListenerAdapter {
    public final int f23173a;
    public final l91 f23174b;

    public a91(l91 l91Var, int i10) {
        this.f23173a = i10;
        this.f23174b = l91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23173a) {
            case 0:
                l91 l91Var = this.f23174b;
                View[] viewArr = l91Var.e;
                View[] viewArr2 = l91Var.e;
                if (viewArr[1] != null) {
                    l91Var.F();
                    l91Var.h.put(l91Var.f26694f[1], viewArr2[1]);
                    l91Var.removeView(viewArr2[1]);
                    l91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                l91Var.Q = null;
                l91Var.w(true);
                b91 b91Var = l91Var.M;
                if (b91Var != null) {
                    b91Var.v.invalidate();
                    l91Var.M.v.f1();
                    l91Var.M.invalidate();
                }
                l91Var.u();
                l91Var.J.unlock();
                return;
            case 1:
                l91 l91Var2 = this.f23174b;
                l91Var2.f26698w = null;
                View[] viewArr3 = l91Var2.e;
                if (viewArr3[1] != null) {
                    if (!l91Var2.F) {
                        l91Var2.F();
                    }
                    l91Var2.h.put(l91Var2.f26694f[1], viewArr3[1]);
                    l91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                l91Var2.f26699x = false;
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
                l91 l91Var3 = this.f23174b;
                l91Var3.f26698w = null;
                View[] viewArr4 = l91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    l91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                l91Var3.f26699x = false;
                b91 b91Var3 = l91Var3.M;
                if (b91Var3 != null) {
                    b91Var3.setEnabled(true);
                    b91 b91Var4 = l91Var3.M;
                    b91Var4.J = false;
                    b91Var4.f26305a = 1.0f;
                    b91Var4.v.f1();
                    l91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                l91 l91Var4 = this.f23174b;
                l91Var4.f26698w = null;
                View[] viewArr5 = l91Var4.e;
                if (viewArr5[1] != null) {
                    if (!l91Var4.F) {
                        l91Var4.F();
                    }
                    l91Var4.h.put(l91Var4.f26694f[1], viewArr5[1]);
                    l91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                l91Var4.f26699x = false;
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
