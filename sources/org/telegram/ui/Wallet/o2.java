package org.telegram.ui.Wallet;

import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.xf1;
public final class o2 implements org.telegram.ui.ActionBar.a2, r0.n, ImageReceiver.ImageReceiverDelegate {
    public final int f34666a;
    public final Object f34667b;

    public o2(Object obj, int i10) {
        this.f34666a = i10;
        this.f34667b = obj;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        x2 x2Var = (x2) this.f34667b;
        x2Var.F = k1Var.f44853a.f(647);
        x2Var.f35120f.requestLayout();
        return r0.k1.f44852b;
    }

    public void a(float f7, float f10, float f11, int i10) {
        switch (this.f34666a) {
            case 2:
                ((v5) this.f34667b).M.setShadowLayer(f7, f11, -f10, i10);
                return;
            case 3:
                ((TextPaint) this.f34667b).setShadowLayer(f7, f10, f11, i10);
                return;
            default:
                ((org.telegram.ui.Components.p6) this.f34667b).s(f7, f10, f11, i10);
                return;
        }
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ((v7) this.f34667b).f34999d0.h0();
    }

    @Override
    public void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f34666a) {
            case 0:
                ((org.telegram.ui.ActionBar.n2) this.f34667b).presentFragment(new xf1(6, null));
                return;
            default:
                k8.Z((k8) this.f34667b, b2Var, i10);
                return;
        }
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.k5.b(this, imageReceiver);
    }
}
