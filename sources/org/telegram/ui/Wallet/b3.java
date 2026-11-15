package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kc;
import org.telegram.ui.xa1;
public final class b3 implements org.telegram.ui.ActionBar.q1, r0.m, kc {
    public final int f43504a;
    public final Object f43505b;

    public b3(Object obj, int i7) {
        this.f43504a = i7;
        this.f43505b = obj;
    }

    @Override
    public void I(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((b8) this.f43505b).f43517d0.f0();
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        o3 o3Var = (o3) this.f43505b;
        o3Var.I = k1Var.f55682a.f(647);
        o3Var.h.requestLayout();
        return r0.k1.f55681b;
    }

    public void a(float f10, float f11, int i7) {
        switch (this.f43504a) {
            case 2:
                ((h6) this.f43505b).J.setShadowLayer(f10 * 2.0f, f11, -0.0f, i0.a.o(i7, Math.round(Color.alpha(i7) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f43505b).setShadowLayer(f10, 0.0f, f11, i7);
                return;
            default:
                ((org.telegram.ui.Components.g6) this.f43505b).s(f10, f11, i7);
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f43504a) {
            case 0:
                ((org.telegram.ui.ActionBar.e2) this.f43505b).presentFragment(new xa1(6, null));
                return;
            default:
                p8.e0((p8) this.f43505b, t1Var, i7);
                return;
        }
    }

    @Override
    public void A(ImageReceiver imageReceiver) {
    }

    @Override
    public void O(int i7, Drawable drawable) {
    }
}
