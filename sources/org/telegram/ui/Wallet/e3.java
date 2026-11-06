package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.lc;
import org.telegram.ui.ya1;
public final class e3 implements org.telegram.ui.ActionBar.r1, r0.m, lc {
    public final int f42417a;
    public final Object f42418b;

    public e3(Object obj, int i7) {
        this.f42417a = i7;
        this.f42418b = obj;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        p3 p3Var = (p3) this.f42418b;
        p3Var.H = k1Var.f54108a.f(647);
        p3Var.h.requestLayout();
        return r0.k1.f54107b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f42417a) {
            case 2:
                ((h6) this.f42418b).I.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f42418b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.i6) this.f42418b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void f0(ImageReceiver imageReceiver, boolean z9, boolean z10, boolean z11) {
        ((b8) this.f42418b).f42157d0.f0();
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f42417a) {
            case 0:
                ((org.telegram.ui.ActionBar.f2) this.f42418b).presentFragment(new ya1(6, null));
                return;
            default:
                o8.e0((o8) this.f42418b, u1Var, i7);
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
