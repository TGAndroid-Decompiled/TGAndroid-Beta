package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.cb1;
public final class c3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final int f42212a;
    public final Object f42213b;

    public c3(Object obj, int i7) {
        this.f42212a = i7;
        this.f42213b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        p3 p3Var = (p3) this.f42213b;
        p3Var.H = k1Var.f54213a.f(647);
        p3Var.h.requestLayout();
        return r0.k1.f54212b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f42212a) {
            case 2:
                ((i6) this.f42213b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f42213b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.h6) this.f42213b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ((c8) this.f42213b).f42225d0.f0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f42212a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f42213b).presentFragment(new cb1(6, null));
                return;
            default:
                p8.e0((p8) this.f42213b, u1Var, i7);
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
