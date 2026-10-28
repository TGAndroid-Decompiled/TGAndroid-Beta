package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class kx extends n61 {
    public final sz f30046b;

    public kx(sz szVar) {
        this.f30046b = szVar;
    }

    @Override
    public final boolean a() {
        return this.f30046b.f32766t1.b();
    }

    @Override
    public final String[] b() {
        return this.f30046b.W0;
    }

    @Override
    public final boolean c() {
        return this.f30046b.f32766t1.c();
    }

    @Override
    public final boolean d(g61 g61Var, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        sz szVar = this.f30046b;
        szVar.getMeasuredHeight();
        return o10.p(motionEvent, g61Var, szVar.f32727g2, szVar.Z1);
    }

    @Override
    public final boolean e(g61 g61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        sz szVar = this.f30046b;
        szVar.getMeasuredHeight();
        return o10.q(motionEvent, g61Var, jVar, szVar.f32727g2, szVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f30046b.f32766t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        sz szVar = this.f30046b;
        szVar.f32766t1.r(stickerSetCovered);
        if (z10) {
            szVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f30046b.f32766t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f30046b.W0 = strArr;
    }
}
