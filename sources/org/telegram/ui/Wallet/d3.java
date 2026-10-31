package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.mc;
import org.telegram.ui.tc1;
public final class d3 implements org.telegram.ui.ActionBar.u1, r0.m, mc {
    public final int f34375a;
    public final Object f34376b;

    public d3(Object obj, int i10) {
        this.f34375a = i10;
        this.f34376b = obj;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        p3 p3Var = (p3) this.f34376b;
        p3Var.H = j1Var.f46132a.f(647);
        p3Var.h.requestLayout();
        return r0.j1.f46131b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.f34375a) {
            case 2:
                ((l6) this.f34376b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.b.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f34376b).setShadowLayer(f7, 0.0f, f10, i10);
                return;
            default:
                ((org.telegram.ui.Components.e6) this.f34376b).s(f7, f10, i10);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f34375a) {
            case 0:
                ((org.telegram.ui.ActionBar.k2) this.f34376b).presentFragment(new tc1(6, null));
                return;
            default:
                t8.d0((t8) this.f34376b, x1Var, i10);
                return;
        }
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((g8) this.f34376b).f34582d0.f0();
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }
}
