package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class kx extends e61 {
    public final rz f28092b;

    public kx(rz rzVar) {
        this.f28092b = rzVar;
    }

    @Override
    public final boolean a() {
        return this.f28092b.f30363t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28092b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28092b.f30363t1.c();
    }

    @Override
    public final boolean d(x51 x51Var, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        rz rzVar = this.f28092b;
        rzVar.getMeasuredHeight();
        return o10.p(motionEvent, x51Var, rzVar.f30324g2, rzVar.Z1);
    }

    @Override
    public final boolean e(x51 x51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        rz rzVar = this.f28092b;
        rzVar.getMeasuredHeight();
        return o10.q(motionEvent, x51Var, jVar, rzVar.f30324g2, rzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28092b.f30363t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        rz rzVar = this.f28092b;
        rzVar.f30363t1.r(stickerSetCovered);
        if (z10) {
            rzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28092b.f30363t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28092b.W0 = strArr;
    }
}
