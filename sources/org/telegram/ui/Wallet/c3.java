package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.bb1;
public final class c3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final int f42306a;
    public final Object f42307b;

    public c3(Object obj, int i7) {
        this.f42306a = i7;
        this.f42307b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        n3 n3Var = (n3) this.f42307b;
        n3Var.H = k1Var.f54214a.f(647);
        n3Var.h.requestLayout();
        return r0.k1.f54213b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f42306a) {
            case 2:
                ((f6) this.f42307b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f42307b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.i6) this.f42307b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ((z7) this.f42307b).f43441d0.f0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f42306a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f42307b).presentFragment(new bb1(6, null));
                return;
            default:
                m8.e0((m8) this.f42307b, u1Var, i7);
                return;
        }
    }

    @Override
    public void O(ImageReceiver imageReceiver) {
    }

    @Override
    public void t0(int i7, Drawable drawable) {
    }
}
