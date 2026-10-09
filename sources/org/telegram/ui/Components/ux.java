package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ux extends i61 {
    public final a00 f31633b;

    public ux(a00 a00Var) {
        this.f31633b = a00Var;
    }

    @Override
    public final boolean a() {
        return this.f31633b.f24455t1.b();
    }

    @Override
    public final String[] b() {
        return this.f31633b.W0;
    }

    @Override
    public final boolean c() {
        return this.f31633b.f24455t1.c();
    }

    @Override
    public final boolean d(b61 b61Var, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.f31633b;
        a00Var.getMeasuredHeight();
        return q6.r(motionEvent, b61Var, a00Var.f24416g2, a00Var.Z1);
    }

    @Override
    public final boolean e(b61 b61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        a00 a00Var = this.f31633b;
        a00Var.getMeasuredHeight();
        return q6.s(motionEvent, b61Var, jVar, a00Var.f24416g2, a00Var.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f31633b.f24455t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        a00 a00Var = this.f31633b;
        a00Var.f24455t1.r(stickerSetCovered);
        if (z10) {
            a00Var.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f31633b.f24455t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f31633b.W0 = strArr;
    }
}
