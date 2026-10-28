package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.fg1;
public final class n2 implements org.telegram.ui.ActionBar.b2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f37011a;
    public final Object f37012b;

    public n2(Object obj, int i10) {
        this.f37011a = i10;
        this.f37012b = obj;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.f37012b;
        y2Var.H = k1Var.f47153a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.f47152b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.f37011a) {
            case 2:
                ((w5) this.f37012b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f37012b).setShadowLayer(f7, 0.0f, f10, i10);
                return;
            default:
                ((org.telegram.ui.Components.r6) this.f37012b).s(f7, f10, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((s7) this.f37012b).f37254d0.f0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f37011a) {
            case 0:
                ((org.telegram.ui.ActionBar.r2) this.f37012b).presentFragment(new fg1(6, null));
                return;
            default:
                h8.a0((h8) this.f37012b, e2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.p5.b(this, imageReceiver);
    }
}
