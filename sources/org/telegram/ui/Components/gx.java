package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class gx extends o51 {
    public final lz f24538b;

    public gx(lz lzVar) {
        this.f24538b = lzVar;
    }

    @Override
    public final boolean a() {
        return this.f24538b.f26282t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24538b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24538b.f26282t1.c();
    }

    @Override
    public final boolean d(h51 h51Var, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.f24538b;
        lzVar.getMeasuredHeight();
        return q6.r(motionEvent, h51Var, lzVar.f26243g2, lzVar.Z1);
    }

    @Override
    public final boolean e(h51 h51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        lz lzVar = this.f24538b;
        lzVar.getMeasuredHeight();
        return q6.s(motionEvent, h51Var, jVar, lzVar.f26243g2, lzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24538b.f26282t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        lz lzVar = this.f24538b;
        lzVar.f26282t1.r(stickerSetCovered);
        if (z10) {
            lzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24538b.f26282t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24538b.W0 = strArr;
    }
}
