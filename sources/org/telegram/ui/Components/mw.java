package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class mw extends e41 {
    public final ry f37632b;

    public mw(ry ryVar) {
        this.f37632b = ryVar;
    }

    @Override
    public final boolean a() {
        return this.f37632b.f39397u1.b();
    }

    @Override
    public final String[] b() {
        return this.f37632b.X0;
    }

    @Override
    public final boolean c() {
        return this.f37632b.f39397u1.c();
    }

    @Override
    public final boolean d(x31 x31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.f37632b;
        ryVar.getMeasuredHeight();
        return p10.q(motionEvent, x31Var, ryVar.f39359h2, ryVar.f39335a2);
    }

    @Override
    public final boolean e(x31 x31Var, n nVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ry ryVar = this.f37632b;
        ryVar.getMeasuredHeight();
        return p10.r(motionEvent, x31Var, nVar, ryVar.f39359h2, ryVar.f39335a2);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.f37632b.f39397u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ry ryVar = this.f37632b;
        ryVar.f39397u1.r(stickerSetCovered);
        if (z10) {
            ryVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f37632b.f39397u1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f37632b.X0 = strArr;
    }
}
