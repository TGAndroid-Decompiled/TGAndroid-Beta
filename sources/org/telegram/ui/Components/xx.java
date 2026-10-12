package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class xx extends n61 {
    public final d00 f32889b;

    public xx(d00 d00Var) {
        this.f32889b = d00Var;
    }

    @Override
    public final boolean a() {
        return this.f32889b.f25134t1.b();
    }

    @Override
    public final String[] b() {
        return this.f32889b.W0;
    }

    @Override
    public final boolean c() {
        return this.f32889b.f25134t1.c();
    }

    @Override
    public final boolean d(g61 g61Var, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        d00 d00Var = this.f32889b;
        d00Var.getMeasuredHeight();
        return q6.r(motionEvent, g61Var, d00Var.f25095g2, d00Var.Z1);
    }

    @Override
    public final boolean e(g61 g61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        d00 d00Var = this.f32889b;
        d00Var.getMeasuredHeight();
        return q6.s(motionEvent, g61Var, jVar, d00Var.f25095g2, d00Var.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f32889b.f25134t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        d00 d00Var = this.f32889b;
        d00Var.f25134t1.r(stickerSetCovered);
        if (z10) {
            d00Var.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32889b.f25134t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32889b.W0 = strArr;
    }
}
