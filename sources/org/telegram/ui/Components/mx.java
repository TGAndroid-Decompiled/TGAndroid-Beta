package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class mx extends f61 {
    public final tz f28779b;

    public mx(tz tzVar) {
        this.f28779b = tzVar;
    }

    @Override
    public final boolean a() {
        return this.f28779b.f31019t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28779b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28779b.f31019t1.c();
    }

    @Override
    public final boolean d(y51 y51Var, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.f28779b;
        tzVar.getMeasuredHeight();
        return o10.p(motionEvent, y51Var, tzVar.f30980g2, tzVar.Z1);
    }

    @Override
    public final boolean e(y51 y51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ht o10 = org.telegram.ui.ht.o();
        tz tzVar = this.f28779b;
        tzVar.getMeasuredHeight();
        return o10.q(motionEvent, y51Var, jVar, tzVar.f30980g2, tzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28779b.f31019t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.f28779b;
        tzVar.f31019t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28779b.f31019t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28779b.W0 = strArr;
    }
}
