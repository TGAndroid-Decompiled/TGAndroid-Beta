package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ex extends c51 {
    public final mz f26657b;

    public ex(mz mzVar) {
        this.f26657b = mzVar;
    }

    @Override
    public final boolean a() {
        return this.f26657b.f29315q1.b();
    }

    @Override
    public final String[] b() {
        return this.f26657b.T0;
    }

    @Override
    public final boolean c() {
        return this.f26657b.f29315q1.c();
    }

    @Override
    public final boolean d(v41 v41Var, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.f26657b;
        mzVar.getMeasuredHeight();
        return q10.r(motionEvent, v41Var, mzVar.f29276d2, mzVar.W1);
    }

    @Override
    public final boolean e(v41 v41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.qt q10 = org.telegram.ui.qt.q();
        mz mzVar = this.f26657b;
        mzVar.getMeasuredHeight();
        return q10.s(motionEvent, v41Var, kVar, mzVar.f29276d2, mzVar.W1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
        this.f26657b.f29315q1.m(null, document, null, obj, null, z4, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        mz mzVar = this.f26657b;
        mzVar.f29315q1.r(stickerSetCovered);
        if (z4) {
            mzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f26657b.f29315q1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f26657b.T0 = strArr;
    }
}
