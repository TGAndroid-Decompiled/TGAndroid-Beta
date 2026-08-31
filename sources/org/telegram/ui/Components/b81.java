package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b81 extends AnimatorListenerAdapter {
    public final int f25519a;
    public final m81 f25520b;

    public b81(m81 m81Var, int i10) {
        this.f25519a = i10;
        this.f25520b = m81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25519a) {
            case 0:
                m81 m81Var = this.f25520b;
                View[] viewArr = m81Var.f28987e;
                View[] viewArr2 = m81Var.f28987e;
                if (viewArr[1] != null) {
                    m81Var.F();
                    m81Var.h.put(m81Var.f28988f[1], viewArr2[1]);
                    m81Var.removeView(viewArr2[1]);
                    m81Var.E(viewArr2[0], 0.0f);
                    viewArr2[1] = null;
                }
                m81Var.N = null;
                m81Var.w(true);
                c81 c81Var = m81Var.J;
                if (c81Var != null) {
                    c81Var.v.invalidate();
                    m81Var.J.v.f1();
                    m81Var.J.invalidate();
                }
                m81Var.u();
                m81Var.G.unlock();
                return;
            case 1:
                m81 m81Var2 = this.f25520b;
                m81Var2.f28992w = null;
                View[] viewArr3 = m81Var2.f28987e;
                if (viewArr3[1] != null) {
                    if (!m81Var2.C) {
                        m81Var2.F();
                    }
                    m81Var2.h.put(m81Var2.f28988f[1], viewArr3[1]);
                    m81Var2.removeView(viewArr3[1]);
                    viewArr3[1].setVisibility(8);
                    viewArr3[1] = null;
                }
                m81Var2.f28993x = false;
                m81Var2.F = false;
                c81 c81Var2 = m81Var2.J;
                if (c81Var2 != null) {
                    c81Var2.setEnabled(true);
                }
                m81Var2.w(false);
                m81Var2.u();
                m81Var2.G.unlock();
                return;
            case 2:
                m81 m81Var3 = this.f25520b;
                m81Var3.f28992w = null;
                View[] viewArr4 = m81Var3.f28987e;
                View view = viewArr4[1];
                if (view != null) {
                    m81Var3.removeView(view);
                    viewArr4[1] = null;
                }
                m81Var3.f28993x = false;
                c81 c81Var3 = m81Var3.J;
                if (c81Var3 != null) {
                    c81Var3.setEnabled(true);
                    c81 c81Var4 = m81Var3.J;
                    c81Var4.G = false;
                    c81Var4.f28647a = 1.0f;
                    c81Var4.v.f1();
                    m81Var3.J.invalidate();
                    return;
                }
                return;
            default:
                m81 m81Var4 = this.f25520b;
                m81Var4.f28992w = null;
                View[] viewArr5 = m81Var4.f28987e;
                if (viewArr5[1] != null) {
                    if (!m81Var4.C) {
                        m81Var4.F();
                    }
                    m81Var4.h.put(m81Var4.f28988f[1], viewArr5[1]);
                    m81Var4.removeView(viewArr5[1]);
                    viewArr5[1].setVisibility(8);
                    viewArr5[1] = null;
                }
                m81Var4.f28993x = false;
                m81Var4.F = false;
                c81 c81Var5 = m81Var4.J;
                if (c81Var5 != null) {
                    c81Var5.setEnabled(true);
                }
                m81Var4.w(false);
                m81Var4.u();
                m81Var4.G.unlock();
                return;
        }
    }
}
