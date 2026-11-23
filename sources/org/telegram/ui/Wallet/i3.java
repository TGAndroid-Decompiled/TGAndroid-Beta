package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.ui.za1;
public final class i3 implements org.telegram.ui.ActionBar.q1, r0.m, jc {
    public final int f44477a;
    public final Object f44478b;

    public i3(Object obj, int i7) {
        this.f44477a = i7;
        this.f44478b = obj;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f44477a) {
            case 2:
                ((y6) this.f44478b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f44478b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.m6) this.f44478b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f44477a) {
            case 0:
                ((org.telegram.ui.ActionBar.g2) this.f44478b).presentFragment(new za1(6, null));
                return;
            default:
                e9.e0((e9) this.f44478b);
                return;
        }
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        x3 x3Var = (x3) this.f44478b;
        x3Var.I = l1Var.f56381a.f(647);
        x3Var.h.requestLayout();
        return r0.l1.f56380b;
    }

    @Override
    public void y(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((r8) this.f44478b).f45004d0.f0();
    }

    @Override
    public void r(ImageReceiver imageReceiver) {
    }

    @Override
    public void J(int i7, Drawable drawable) {
    }
}
