package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class fx extends q51 {
    public final mz f24392b;

    public fx(mz mzVar) {
        this.f24392b = mzVar;
    }

    @Override
    public final boolean a() {
        return this.f24392b.f26627t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24392b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24392b.f26627t1.c();
    }

    @Override
    public final boolean d(j51 j51Var, MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        mz mzVar = this.f24392b;
        mzVar.getMeasuredHeight();
        return q6.r(motionEvent, j51Var, mzVar.f26588g2, mzVar.Z1);
    }

    @Override
    public final boolean e(j51 j51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.qt q6 = org.telegram.ui.qt.q();
        mz mzVar = this.f24392b;
        mzVar.getMeasuredHeight();
        return q6.s(motionEvent, j51Var, jVar, mzVar.f26588g2, mzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24392b.f26627t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        mz mzVar = this.f24392b;
        mzVar.f26627t1.r(stickerSetCovered);
        if (z10) {
            mzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24392b.f26627t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24392b.W0 = strArr;
    }
}
