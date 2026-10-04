package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class hx extends z51 {
    public final nz f27261b;

    public hx(nz nzVar) {
        this.f27261b = nzVar;
    }

    @Override
    public final boolean a() {
        return this.f27261b.f29151t1.b();
    }

    @Override
    public final String[] b() {
        return this.f27261b.W0;
    }

    @Override
    public final boolean c() {
        return this.f27261b.f29151t1.c();
    }

    @Override
    public final boolean d(s51 s51Var, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f27261b;
        nzVar.getMeasuredHeight();
        return q6.r(motionEvent, s51Var, nzVar.f29112g2, nzVar.Z1);
    }

    @Override
    public final boolean e(s51 s51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.rt q6 = org.telegram.ui.rt.q();
        nz nzVar = this.f27261b;
        nzVar.getMeasuredHeight();
        return q6.s(motionEvent, s51Var, jVar, nzVar.f29112g2, nzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f27261b.f29151t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        nz nzVar = this.f27261b;
        nzVar.f29151t1.r(stickerSetCovered);
        if (z10) {
            nzVar.W(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f27261b.f29151t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f27261b.W0 = strArr;
    }
}
