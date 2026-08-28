package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class rw extends e41 {
    public final wy f32295b;

    public rw(wy wyVar) {
        this.f32295b = wyVar;
    }

    @Override
    public final boolean a() {
        return this.f32295b.f34432p1.b();
    }

    @Override
    public final String[] b() {
        return this.f32295b.S0;
    }

    @Override
    public final boolean c() {
        return this.f32295b.f34432p1.c();
    }

    @Override
    public final boolean d(x31 x31Var, MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.f32295b;
        wyVar.getMeasuredHeight();
        return q10.r(motionEvent, x31Var, wyVar.f34393c2, wyVar.V1);
    }

    @Override
    public final boolean e(x31 x31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht q10 = org.telegram.ui.ht.q();
        wy wyVar = this.f32295b;
        wyVar.getMeasuredHeight();
        return q10.s(motionEvent, x31Var, jVar, wyVar.f34393c2, wyVar.V1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i9) {
        this.f32295b.f34432p1.m(null, document, null, obj, null, z10, i9);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        wy wyVar = this.f32295b;
        wyVar.f34432p1.r(stickerSetCovered);
        if (z10) {
            wyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32295b.f34432p1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32295b.S0 = strArr;
    }
}
