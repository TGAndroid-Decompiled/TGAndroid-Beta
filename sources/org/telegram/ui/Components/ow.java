package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ow extends s41 {
    public final vy f29203b;

    public ow(vy vyVar) {
        this.f29203b = vyVar;
    }

    @Override
    public final boolean a() {
        return this.f29203b.f31918t1.b();
    }

    @Override
    public final String[] b() {
        return this.f29203b.W0;
    }

    @Override
    public final boolean c() {
        return this.f29203b.f31918t1.c();
    }

    @Override
    public final boolean d(l41 l41Var, MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.f29203b;
        vyVar.getMeasuredHeight();
        return p5.q(motionEvent, l41Var, vyVar.f31879g2, vyVar.Z1);
    }

    @Override
    public final boolean e(l41 l41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.lt p5 = org.telegram.ui.lt.p();
        vy vyVar = this.f29203b;
        vyVar.getMeasuredHeight();
        return p5.r(motionEvent, l41Var, kVar, vyVar.f31879g2, vyVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f29203b.f31918t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        vy vyVar = this.f29203b;
        vyVar.f31918t1.r(stickerSetCovered);
        if (z10) {
            vyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f29203b.f31918t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f29203b.W0 = strArr;
    }
}
