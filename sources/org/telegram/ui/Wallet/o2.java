package org.telegram.ui.Wallet;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.xf1;
public final class o2 implements org.telegram.ui.ActionBar.a2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f34668a;
    public final Object f34669b;

    public o2(Object obj, int i10) {
        this.f34668a = i10;
        this.f34669b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        y2 y2Var = (y2) this.f34669b;
        y2Var.H = k1Var.f44873a.f(647);
        y2Var.h.requestLayout();
        return r0.k1.f44872b;
    }

    public void a(float f7, float f10, float f11, int i10) {
        switch (this.f34668a) {
            case 2:
                ((x5) this.f34669b).M.setShadowLayer(f7, f11, -f10, i10);
                return;
            case 3:
                ((TextPaint) this.f34669b).setShadowLayer(f7, f10, f11, i10);
                return;
            default:
                ((org.telegram.ui.Components.p6) this.f34669b).s(f7, f10, f11, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((y7) this.f34669b).f35139d0.h0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34668a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f34669b).presentFragment(new xf1(6, null));
                return;
            default:
                n8.Z((n8) this.f34669b, b2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
