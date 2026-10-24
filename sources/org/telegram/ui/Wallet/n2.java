package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.ag1;
public final class n2 implements org.telegram.ui.ActionBar.z1, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f34898a;
    public final Object f34899b;

    public n2(Object obj, int i10) {
        this.f34898a = i10;
        this.f34899b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.f34899b;
        y2Var.H = k1Var.f45250a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.f45249b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.f34898a) {
            case 2:
                ((x5) this.f34899b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f34899b).setShadowLayer(f7, 0.0f, f10, i10);
                return;
            default:
                ((org.telegram.ui.Components.n6) this.f34899b).s(f7, f10, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((s7) this.f34899b).f35161d0.f0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f34898a) {
            case 0:
                ((org.telegram.ui.ActionBar.o2) this.f34899b).presentFragment(new ag1(6, null));
                return;
            default:
                i8.Z((i8) this.f34899b, c2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }
}
