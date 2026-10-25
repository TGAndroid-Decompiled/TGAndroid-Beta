package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class kx extends m61 {
    public final sz f29998b;

    public kx(sz szVar) {
        this.f29998b = szVar;
    }

    @Override
    public final boolean a() {
        return this.f29998b.f32769t1.b();
    }

    @Override
    public final String[] b() {
        return this.f29998b.W0;
    }

    @Override
    public final boolean c() {
        return this.f29998b.f32769t1.c();
    }

    @Override
    public final boolean d(f61 f61Var, MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.f29998b;
        szVar.getMeasuredHeight();
        return o10.p(motionEvent, f61Var, szVar.f32730g2, szVar.Z1);
    }

    @Override
    public final boolean e(f61 f61Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ft o10 = org.telegram.ui.ft.o();
        sz szVar = this.f29998b;
        szVar.getMeasuredHeight();
        return o10.q(motionEvent, f61Var, jVar, szVar.f32730g2, szVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f29998b.f32769t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        sz szVar = this.f29998b;
        szVar.f32769t1.r(stickerSetCovered);
        if (z10) {
            szVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f29998b.f32769t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f29998b.W0 = strArr;
    }
}
