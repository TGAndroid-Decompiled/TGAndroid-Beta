package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ec;
import org.telegram.ui.ra1;
public final class c3 implements org.telegram.ui.ActionBar.p1, r0.m, ec {
    public final int f42383a;
    public final Object f42384b;

    public c3(Object obj, int i3) {
        this.f42383a = i3;
        this.f42384b = obj;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        n3 n3Var = (n3) this.f42384b;
        n3Var.I = k1Var.f54026a.f(647);
        n3Var.h.requestLayout();
        return r0.k1.f54025b;
    }

    public void a(float f10, float f11, int i3) {
        switch (this.f42383a) {
            case 2:
                ((f6) this.f42384b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i3, Math.round(Color.alpha(i3) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f42384b).setShadowLayer(f10, 0.0f, f11, i3);
                return;
            default:
                ((org.telegram.ui.Components.g6) this.f42384b).s(f10, f11, i3);
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f42383a) {
            case 0:
                ((org.telegram.ui.ActionBar.d2) this.f42384b).presentFragment(new ra1(6, null));
                return;
            default:
                n8.e0((n8) this.f42384b, s1Var, i3);
                return;
        }
    }

    @Override
    public void l0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((a8) this.f42384b).f42168d0.f0();
    }

    @Override
    public void D(ImageReceiver imageReceiver) {
    }

    @Override
    public void F0(int i3, Drawable drawable) {
    }
}
