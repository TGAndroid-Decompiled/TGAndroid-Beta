package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.ui.bb1;
public final class h3 implements org.telegram.ui.ActionBar.q1, r0.m, kc {
    public final int f44315a;
    public final Object f44316b;

    public h3(Object obj, int i7) {
        this.f44315a = i7;
        this.f44316b = obj;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        w3 w3Var = (w3) this.f44316b;
        w3Var.I = l1Var.f56268a.f(647);
        w3Var.h.requestLayout();
        return r0.l1.f56267b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f44315a) {
            case 2:
                ((x6) this.f44316b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f44316b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.n6) this.f44316b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f44315a) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f44316b).presentFragment(new bb1(6, null));
                return;
            default:
                d9.e0((d9) this.f44316b);
                return;
        }
    }

    @Override
    public void m0(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((q8) this.f44316b).f44842d0.f0();
    }

    @Override
    public void V(ImageReceiver imageReceiver) {
    }

    @Override
    public void G0(int i7, Drawable drawable) {
    }
}
