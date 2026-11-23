package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ow extends h41 {
    public final ty f38380b;

    public ow(ty tyVar) {
        this.f38380b = tyVar;
    }

    @Override
    public final boolean a() {
        return this.f38380b.f40144u1.b();
    }

    @Override
    public final String[] b() {
        return this.f38380b.X0;
    }

    @Override
    public final boolean c() {
        return this.f38380b.f40144u1.c();
    }

    @Override
    public final boolean d(a41 a41Var, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.f38380b;
        tyVar.getMeasuredHeight();
        return p10.q(motionEvent, a41Var, tyVar.f40106h2, tyVar.f40082a2);
    }

    @Override
    public final boolean e(a41 a41Var, o oVar, MotionEvent motionEvent) {
        org.telegram.ui.ns p10 = org.telegram.ui.ns.p();
        ty tyVar = this.f38380b;
        tyVar.getMeasuredHeight();
        return p10.r(motionEvent, a41Var, oVar, tyVar.f40106h2, tyVar.f40082a2);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i7) {
        this.f38380b.f40144u1.m(null, document, null, obj, null, z10, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ty tyVar = this.f38380b;
        tyVar.f40144u1.r(stickerSetCovered);
        if (z10) {
            tyVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f38380b.f40144u1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f38380b.X0 = strArr;
    }
}
