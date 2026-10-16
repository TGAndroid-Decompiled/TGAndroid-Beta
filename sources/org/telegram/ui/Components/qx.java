package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class qx extends f61 {
    public final wz f28374b;

    public qx(wz wzVar) {
        this.f28374b = wzVar;
    }

    @Override
    public final boolean a() {
        return this.f28374b.f30760t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28374b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28374b.f30760t1.c();
    }

    @Override
    public final boolean d(y51 y51Var, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.f28374b;
        wzVar.getMeasuredHeight();
        return q6.r(motionEvent, y51Var, wzVar.f30721g2, wzVar.Z1);
    }

    @Override
    public final boolean e(y51 y51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.f28374b;
        wzVar.getMeasuredHeight();
        return q6.s(motionEvent, y51Var, jVar, wzVar.f30721g2, wzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28374b.f30760t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wz wzVar = this.f28374b;
        wzVar.f30760t1.r(stickerSetCovered);
        if (z10) {
            wzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28374b.f30760t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28374b.W0 = strArr;
    }
}
