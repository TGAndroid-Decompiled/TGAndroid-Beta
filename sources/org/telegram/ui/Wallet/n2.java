package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.dg1;
public final class n2 implements org.telegram.ui.ActionBar.b2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f36984a;
    public final Object f36985b;

    public n2(Object obj, int i10) {
        this.f36984a = i10;
        this.f36985b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.f36985b;
        y2Var.H = k1Var.f47115a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.f47114b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.f36984a) {
            case 2:
                ((w5) this.f36985b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f36985b).setShadowLayer(f7, 0.0f, f10, i10);
                return;
            default:
                ((org.telegram.ui.Components.r6) this.f36985b).s(f7, f10, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((s7) this.f36985b).f37227d0.f0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.o5.a(this, i10, str, drawable);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f36984a) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.f36985b).presentFragment(new dg1(6, null));
                return;
            default:
                h8.a0((h8) this.f36985b, e2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.o5.b(this, imageReceiver);
    }
}
