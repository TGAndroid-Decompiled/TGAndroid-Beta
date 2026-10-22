package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.vf1;
public final class o2 implements org.telegram.ui.ActionBar.a2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f34637a;
    public final Object f34638b;

    public o2(Object obj, int i10) {
        this.f34637a = i10;
        this.f34638b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        z2 z2Var = (z2) this.f34638b;
        z2Var.H = k1Var.f44838a.f(647);
        z2Var.h.requestLayout();
        return r0.k1.f44837b;
    }

    public void a(float f7, float f10, int i10) {
        switch (this.f34637a) {
            case 2:
                ((x5) this.f34638b).I.setShadowLayer(f7 * 2.0f, f10, -0.0f, i0.a.o(i10, Math.round(Color.alpha(i10) * 0.5f)));
                return;
            case 3:
                ((TextPaint) this.f34638b).setShadowLayer(f7, 0.0f, f10, i10);
                return;
            default:
                ((org.telegram.ui.Components.p6) this.f34638b).s(f7, f10, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((s7) this.f34638b).f34874d0.f0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.n5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34637a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f34638b).presentFragment(new vf1(6, null));
                return;
            default:
                h8.Z((h8) this.f34638b, b2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.n5.b(this, imageReceiver);
    }
}
