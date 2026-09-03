package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ex extends a51 {
    public final mz f26689b;

    public ex(mz mzVar) {
        this.f26689b = mzVar;
    }

    @Override
    public final boolean a() {
        return this.f26689b.f29317q1.b();
    }

    @Override
    public final String[] b() {
        return this.f26689b.T0;
    }

    @Override
    public final boolean c() {
        return this.f26689b.f29317q1.c();
    }

    @Override
    public final boolean d(t41 t41Var, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.f26689b;
        mzVar.getMeasuredHeight();
        return q10.r(motionEvent, t41Var, mzVar.f29278d2, mzVar.W1);
    }

    @Override
    public final boolean e(t41 t41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.f26689b;
        mzVar.getMeasuredHeight();
        return q10.s(motionEvent, t41Var, kVar, mzVar.f29278d2, mzVar.W1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
        this.f26689b.f29317q1.m(null, document, null, obj, null, z4, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        mz mzVar = this.f26689b;
        mzVar.f29317q1.r(stickerSetCovered);
        if (z4) {
            mzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f26689b.f29317q1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f26689b.T0 = strArr;
    }
}
