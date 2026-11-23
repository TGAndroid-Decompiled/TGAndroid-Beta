package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class lw extends g41 {
    public final qy f37244b;

    public lw(qy qyVar) {
        this.f37244b = qyVar;
    }

    @Override
    public final boolean a() {
        return this.f37244b.f39099u1.b();
    }

    @Override
    public final String[] b() {
        return this.f37244b.X0;
    }

    @Override
    public final boolean c() {
        return this.f37244b.f39099u1.c();
    }

    @Override
    public final boolean d(z31 z31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.f37244b;
        qyVar.getMeasuredHeight();
        return p10.q(motionEvent, z31Var, qyVar.f39061h2, qyVar.f39037a2);
    }

    @Override
    public final boolean e(z31 z31Var, n nVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        qy qyVar = this.f37244b;
        qyVar.getMeasuredHeight();
        return p10.r(motionEvent, z31Var, nVar, qyVar.f39061h2, qyVar.f39037a2);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.f37244b.f39099u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        qy qyVar = this.f37244b;
        qyVar.f39099u1.r(stickerSetCovered);
        if (z10) {
            qyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f37244b.f39099u1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f37244b.X0 = strArr;
    }
}
