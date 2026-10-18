package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class r81 extends AnimatorListenerAdapter {
    public final int f29887a;
    public final c91 f29888b;

    public r81(c91 c91Var, int i10) {
        this.f29887a = i10;
        this.f29888b = c91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29887a) {
            case 0:
                c91 c91Var = this.f29888b;
                View[] viewArr = c91Var.e;
                View[] viewArr2 = c91Var.e;
                if (viewArr[1] != null) {
                    c91Var.F();
                    c91Var.h.put(c91Var.f25169f[1], viewArr2[1]);
                    c91Var.removeView(viewArr2[1]);
                    c91Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                c91Var.Q = null;
                c91Var.w(true);
                s81 s81Var = c91Var.M;
                if (s81Var != null) {
                    s81Var.v.invalidate();
                    c91Var.M.v.f1();
                    c91Var.M.invalidate();
                }
                c91Var.u();
                c91Var.J.unlock();
                return;
            case 1:
                c91 c91Var2 = this.f29888b;
                c91Var2.f25173w = null;
                View[] viewArr3 = c91Var2.e;
                if (viewArr3[1] != null) {
                    if (!c91Var2.F) {
                        c91Var2.F();
                    }
                    c91Var2.h.put(c91Var2.f25169f[1], viewArr3[1]);
                    c91Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                c91Var2.f25174x = false;
                c91Var2.I = false;
                s81 s81Var2 = c91Var2.M;
                if (s81Var2 != null) {
                    s81Var2.setEnabled(true);
                }
                c91Var2.w(false);
                c91Var2.u();
                c91Var2.J.unlock();
                return;
            case 2:
                c91 c91Var3 = this.f29888b;
                c91Var3.f25173w = null;
                View[] viewArr4 = c91Var3.e;
                View view = viewArr4[1];
                if (view != null) {
                    c91Var3.removeView(view);
                    viewArr4[1] = null;
                }
                c91Var3.f25174x = false;
                s81 s81Var3 = c91Var3.M;
                if (s81Var3 != null) {
                    s81Var3.setEnabled(true);
                    s81 s81Var4 = c91Var3.M;
                    s81Var4.J = false;
                    s81Var4.f24845a = 1.0f;
                    s81Var4.v.f1();
                    c91Var3.M.invalidate();
                    return;
                }
                return;
            default:
                c91 c91Var4 = this.f29888b;
                c91Var4.f25173w = null;
                View[] viewArr5 = c91Var4.e;
                if (viewArr5[1] != null) {
                    if (!c91Var4.F) {
                        c91Var4.F();
                    }
                    c91Var4.h.put(c91Var4.f25169f[1], viewArr5[1]);
                    c91Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                c91Var4.f25174x = false;
                c91Var4.I = false;
                s81 s81Var5 = c91Var4.M;
                if (s81Var5 != null) {
                    s81Var5.setEnabled(true);
                }
                c91Var4.w(false);
                c91Var4.u();
                c91Var4.J.unlock();
                return;
        }
    }
}
