package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class hx extends p51 {
    public final mz f24883b;

    public hx(mz mzVar) {
        this.f24883b = mzVar;
    }

    @Override
    public final boolean a() {
        return this.f24883b.f26601t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24883b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24883b.f26601t1.c();
    }

    @Override
    public final boolean d(i51 i51Var, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.f24883b;
        mzVar.getMeasuredHeight();
        return q6.r(motionEvent, i51Var, mzVar.f26562g2, mzVar.Z1);
    }

    @Override
    public final boolean e(i51 i51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.nt q6 = org.telegram.ui.nt.q();
        mz mzVar = this.f24883b;
        mzVar.getMeasuredHeight();
        return q6.s(motionEvent, i51Var, jVar, mzVar.f26562g2, mzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24883b.f26601t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        mz mzVar = this.f24883b;
        mzVar.f26601t1.r(stickerSetCovered);
        if (z10) {
            mzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24883b.f26601t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24883b.W0 = strArr;
    }
}
