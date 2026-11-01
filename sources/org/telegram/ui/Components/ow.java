package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ow extends t41 {
    public final vy f29237b;

    public ow(vy vyVar) {
        this.f29237b = vyVar;
    }

    @Override
    public final boolean a() {
        return this.f29237b.f31996t1.b();
    }

    @Override
    public final String[] b() {
        return this.f29237b.W0;
    }

    @Override
    public final boolean c() {
        return this.f29237b.f31996t1.c();
    }

    @Override
    public final boolean d(m41 m41Var, MotionEvent motionEvent) {
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        vy vyVar = this.f29237b;
        vyVar.getMeasuredHeight();
        return p5.q(motionEvent, m41Var, vyVar.f31957g2, vyVar.Z1);
    }

    @Override
    public final boolean e(m41 m41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.kt p5 = org.telegram.ui.kt.p();
        vy vyVar = this.f29237b;
        vyVar.getMeasuredHeight();
        return p5.r(motionEvent, m41Var, kVar, vyVar.f31957g2, vyVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f29237b.f31996t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        vy vyVar = this.f29237b;
        vyVar.f31996t1.r(stickerSetCovered);
        if (z10) {
            vyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f29237b.f31996t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f29237b.W0 = strArr;
    }
}
