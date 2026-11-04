package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class zv extends k31 {
    public final ey f41136b;

    public zv(ey eyVar) {
        this.f41136b = eyVar;
    }

    @Override
    public final boolean a() {
        return this.f41136b.f33582u1.b();
    }

    @Override
    public final String[] b() {
        return this.f41136b.X0;
    }

    @Override
    public final boolean c() {
        return this.f41136b.f33582u1.c();
    }

    @Override
    public final boolean d(d31 d31Var, MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.f41136b;
        eyVar.getMeasuredHeight();
        return p10.q(motionEvent, d31Var, eyVar.f33544h2, eyVar.f33520a2);
    }

    @Override
    public final boolean e(d31 d31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.is p10 = org.telegram.ui.is.p();
        ey eyVar = this.f41136b;
        eyVar.getMeasuredHeight();
        return p10.r(motionEvent, d31Var, kVar, eyVar.f33544h2, eyVar.f33520a2);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i3) {
        this.f41136b.f33582u1.m(null, document, null, obj, null, z10, i3);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        ey eyVar = this.f41136b;
        eyVar.f33582u1.r(stickerSetCovered);
        if (z10) {
            eyVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f41136b.f33582u1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f41136b.X0 = strArr;
    }
}
