package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.za1;
public final class d3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final int f42387a;
    public final Object f42388b;

    public d3(Object obj, int i7) {
        this.f42387a = i7;
        this.f42388b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        o3 o3Var = (o3) this.f42388b;
        o3Var.H = k1Var.f54201a.f(647);
        o3Var.h.requestLayout();
        return r0.k1.f54200b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f42387a) {
            case 2:
                ((g6) this.f42388b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f42388b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.i6) this.f42388b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ((a8) this.f42388b).f42129d0.f0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f42387a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f42388b).presentFragment(new za1(6, null));
                return;
            default:
                n8.e0((n8) this.f42388b, u1Var, i7);
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
