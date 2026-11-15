package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class gw extends u31 {
    public final ly f35077b;

    public gw(ly lyVar) {
        this.f35077b = lyVar;
    }

    @Override
    public final boolean a() {
        return this.f35077b.f36993u1.b();
    }

    @Override
    public final String[] b() {
        return this.f35077b.X0;
    }

    @Override
    public final boolean c() {
        return this.f35077b.f36993u1.c();
    }

    @Override
    public final boolean d(n31 n31Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.f35077b;
        lyVar.getMeasuredHeight();
        return p10.q(motionEvent, n31Var, lyVar.f36955h2, lyVar.f36931a2);
    }

    @Override
    public final boolean e(n31 n31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ly lyVar = this.f35077b;
        lyVar.getMeasuredHeight();
        return p10.r(motionEvent, n31Var, jVar, lyVar.f36955h2, lyVar.f36931a2);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.f35077b.f36993u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ly lyVar = this.f35077b;
        lyVar.f36993u1.r(stickerSetCovered);
        if (z10) {
            lyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35077b.f36993u1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f35077b.X0 = strArr;
    }
}
