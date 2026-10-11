package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e91 extends AnimatorListenerAdapter {
    public final int f25937a;
    public final q91 f25938b;

    public e91(q91 q91Var, int i10) {
        this.f25937a = i10;
        this.f25938b = q91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25937a) {
            case 0:
                q91 q91Var = this.f25938b;
                View[] viewArr = q91Var.f30096e;
                View[] viewArr2 = q91Var.f30096e;
                if (viewArr[1] != null) {
                    q91Var.F();
                    q91Var.h.put(q91Var.f30097f[1], viewArr2[1]);
                    q91Var.removeView(viewArr2[1]);
                    q91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                q91Var.Q = null;
                q91Var.w(true);
                f91 f91Var = q91Var.M;
                if (f91Var != null) {
                    f91Var.v.invalidate();
                    q91Var.M.v.f1();
                    q91Var.M.invalidate();
                }
                q91Var.u();
                q91Var.J.unlock();
                return;
            case 1:
                q91 q91Var2 = this.f25938b;
                q91Var2.f30101w = null;
                View[] viewArr3 = q91Var2.f30096e;
                if (viewArr3[1] != null) {
                    if (!q91Var2.F) {
                        q91Var2.F();
                    }
                    q91Var2.h.put(q91Var2.f30097f[1], viewArr3[1]);
                    q91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                q91Var2.f30102x = false;
                q91Var2.I = false;
                f91 f91Var2 = q91Var2.M;
                if (f91Var2 != null) {
                    f91Var2.setEnabled(true);
                }
                q91Var2.w(false);
                q91Var2.u();
                q91Var2.J.unlock();
                return;
            case 2:
                q91 q91Var3 = this.f25938b;
                q91Var3.f30101w = null;
                View[] viewArr4 = q91Var3.f30096e;
                View view = viewArr4[1];
                if (view != null) {
                    q91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                q91Var3.f30102x = false;
                f91 f91Var3 = q91Var3.M;
                if (f91Var3 != null) {
                    f91Var3.setEnabled(true);
                    f91 f91Var4 = q91Var3.M;
                    f91Var4.J = false;
                    f91Var4.f29658a = 1.0f;
                    f91Var4.v.f1();
                    q91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                q91 q91Var4 = this.f25938b;
                q91Var4.f30101w = null;
                View[] viewArr5 = q91Var4.f30096e;
                if (viewArr5[1] != null) {
                    if (!q91Var4.F) {
                        q91Var4.F();
                    }
                    q91Var4.h.put(q91Var4.f30097f[1], viewArr5[1]);
                    q91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                q91Var4.f30102x = false;
                q91Var4.I = false;
                f91 f91Var5 = q91Var4.M;
                if (f91Var5 != null) {
                    f91Var5.setEnabled(true);
                }
                q91Var4.w(false);
                q91Var4.u();
                q91Var4.J.unlock();
                return;
        }
    }
}
