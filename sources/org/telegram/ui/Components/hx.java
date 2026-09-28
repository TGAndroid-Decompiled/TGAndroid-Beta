package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class hx extends q51 {
    public final mz f24914b;

    public hx(mz mzVar) {
        this.f24914b = mzVar;
    }

    @Override
    public final boolean a() {
        return this.f24914b.f26585t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24914b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24914b.f26585t1.c();
    }

    @Override
    public final boolean d(j51 j51Var, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.f24914b;
        mzVar.getMeasuredHeight();
        return q6.r(motionEvent, j51Var, mzVar.f26546g2, mzVar.Z1);
    }

    @Override
    public final boolean e(j51 j51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.f24914b;
        mzVar.getMeasuredHeight();
        return q6.s(motionEvent, j51Var, jVar, mzVar.f26546g2, mzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24914b.f26585t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        mz mzVar = this.f24914b;
        mzVar.f26585t1.r(stickerSetCovered);
        if (z10) {
            mzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24914b.f26585t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24914b.W0 = strArr;
    }
}
