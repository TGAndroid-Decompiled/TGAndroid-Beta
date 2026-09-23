package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class fx extends a51 {
    public final lz f24103b;

    public fx(lz lzVar) {
        this.f24103b = lzVar;
    }

    @Override
    public final boolean a() {
        return this.f24103b.f26021t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24103b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24103b.f26021t1.c();
    }

    @Override
    public final boolean d(t41 t41Var, MotionEvent motionEvent) {
        org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
        lz lzVar = this.f24103b;
        lzVar.getMeasuredHeight();
        return q6.r(motionEvent, t41Var, lzVar.f25982g2, lzVar.Z1);
    }

    @Override
    public final boolean e(t41 t41Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.pt q6 = org.telegram.ui.pt.q();
        lz lzVar = this.f24103b;
        lzVar.getMeasuredHeight();
        return q6.s(motionEvent, t41Var, jVar, lzVar.f25982g2, lzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24103b.f26021t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        lz lzVar = this.f24103b;
        lzVar.f26021t1.r(stickerSetCovered);
        if (z10) {
            lzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24103b.f26021t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24103b.W0 = strArr;
    }
}
