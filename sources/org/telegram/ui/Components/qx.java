package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class qx extends e61 {
    public final wz f28688b;

    public qx(wz wzVar) {
        this.f28688b = wzVar;
    }

    @Override
    public final boolean a() {
        return this.f28688b.f31067t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28688b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28688b.f31067t1.c();
    }

    @Override
    public final boolean d(x51 x51Var, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.f28688b;
        wzVar.getMeasuredHeight();
        return q6.r(motionEvent, x51Var, wzVar.f31028g2, wzVar.Z1);
    }

    @Override
    public final boolean e(x51 x51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.xt q6 = org.telegram.ui.xt.q();
        wz wzVar = this.f28688b;
        wzVar.getMeasuredHeight();
        return q6.s(motionEvent, x51Var, jVar, wzVar.f31028g2, wzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28688b.f31067t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wz wzVar = this.f28688b;
        wzVar.f31067t1.r(stickerSetCovered);
        if (z10) {
            wzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28688b.f31067t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28688b.W0 = strArr;
    }
}
