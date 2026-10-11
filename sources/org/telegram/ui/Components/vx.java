package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class vx extends j61 {
    public final b00 f32564b;

    public vx(b00 b00Var) {
        this.f32564b = b00Var;
    }

    @Override
    public final boolean a() {
        return this.f32564b.f24785t1.b();
    }

    @Override
    public final String[] b() {
        return this.f32564b.W0;
    }

    @Override
    public final boolean c() {
        return this.f32564b.f24785t1.c();
    }

    @Override
    public final boolean d(c61 c61Var, MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        b00 b00Var = this.f32564b;
        b00Var.getMeasuredHeight();
        return q6.r(motionEvent, c61Var, b00Var.f24746g2, b00Var.Z1);
    }

    @Override
    public final boolean e(c61 c61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        b00 b00Var = this.f32564b;
        b00Var.getMeasuredHeight();
        return q6.s(motionEvent, c61Var, jVar, b00Var.f24746g2, b00Var.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f32564b.f24785t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        b00 b00Var = this.f32564b;
        b00Var.f24785t1.r(stickerSetCovered);
        if (z10) {
            b00Var.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32564b.f24785t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32564b.W0 = strArr;
    }
}
