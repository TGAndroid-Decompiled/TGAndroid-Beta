package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class bw extends q31 {
    public final hy f32438b;

    public bw(hy hyVar) {
        this.f32438b = hyVar;
    }

    @Override
    public final boolean a() {
        return this.f32438b.f34467t1.b();
    }

    @Override
    public final String[] b() {
        return this.f32438b.W0;
    }

    @Override
    public final boolean c() {
        return this.f32438b.f34467t1.c();
    }

    @Override
    public final boolean d(j31 j31Var, MotionEvent motionEvent) {
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        hy hyVar = this.f32438b;
        hyVar.getMeasuredHeight();
        return p10.q(motionEvent, j31Var, hyVar.f34429g2, hyVar.Z1);
    }

    @Override
    public final boolean e(j31 j31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ms p10 = org.telegram.ui.ms.p();
        hy hyVar = this.f32438b;
        hyVar.getMeasuredHeight();
        return p10.r(motionEvent, j31Var, kVar, hyVar.f34429g2, hyVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.f32438b.f34467t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        hy hyVar = this.f32438b;
        hyVar.f34467t1.r(stickerSetCovered);
        if (z9) {
            hyVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32438b.f34467t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32438b.W0 = strArr;
    }
}
