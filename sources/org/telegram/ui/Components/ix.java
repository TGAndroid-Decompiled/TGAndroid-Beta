package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ix extends r51 {
    public final nz f25209b;

    public ix(nz nzVar) {
        this.f25209b = nzVar;
    }

    @Override
    public final boolean a() {
        return this.f25209b.f26871t1.b();
    }

    @Override
    public final String[] b() {
        return this.f25209b.W0;
    }

    @Override
    public final boolean c() {
        return this.f25209b.f26871t1.c();
    }

    @Override
    public final boolean d(k51 k51Var, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        nz nzVar = this.f25209b;
        nzVar.getMeasuredHeight();
        return q6.r(motionEvent, k51Var, nzVar.f26832g2, nzVar.Z1);
    }

    @Override
    public final boolean e(k51 k51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        nz nzVar = this.f25209b;
        nzVar.getMeasuredHeight();
        return q6.s(motionEvent, k51Var, jVar, nzVar.f26832g2, nzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f25209b.f26871t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        nz nzVar = this.f25209b;
        nzVar.f26871t1.r(stickerSetCovered);
        if (z10) {
            nzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f25209b.f26871t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f25209b.W0 = strArr;
    }
}
