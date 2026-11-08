package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class bw extends p31 {
    public final hy f32373b;

    public bw(hy hyVar) {
        this.f32373b = hyVar;
    }

    @Override
    public final boolean a() {
        return this.f32373b.f34452t1.b();
    }

    @Override
    public final String[] b() {
        return this.f32373b.W0;
    }

    @Override
    public final boolean c() {
        return this.f32373b.f34452t1.c();
    }

    @Override
    public final boolean d(i31 i31Var, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.f32373b;
        hyVar.getMeasuredHeight();
        return p10.q(motionEvent, i31Var, hyVar.f34414g2, hyVar.Z1);
    }

    @Override
    public final boolean e(i31 i31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        hy hyVar = this.f32373b;
        hyVar.getMeasuredHeight();
        return p10.r(motionEvent, i31Var, kVar, hyVar.f34414g2, hyVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.f32373b.f34452t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        hy hyVar = this.f32373b;
        hyVar.f34452t1.r(stickerSetCovered);
        if (z9) {
            hyVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32373b.f34452t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32373b.W0 = strArr;
    }
}
