package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class kx extends o51 {
    public final rz f24825b;

    public kx(rz rzVar) {
        this.f24825b = rzVar;
    }

    @Override
    public final boolean a() {
        return this.f24825b.f26858t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24825b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24825b.f26858t1.c();
    }

    @Override
    public final boolean d(h51 h51Var, MotionEvent motionEvent) {
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        rz rzVar = this.f24825b;
        rzVar.getMeasuredHeight();
        return q6.r(motionEvent, h51Var, rzVar.f26819g2, rzVar.Z1);
    }

    @Override
    public final boolean e(h51 h51Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.tt q6 = org.telegram.ui.tt.q();
        rz rzVar = this.f24825b;
        rzVar.getMeasuredHeight();
        return q6.s(motionEvent, h51Var, kVar, rzVar.f26819g2, rzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24825b.f26858t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        rz rzVar = this.f24825b;
        rzVar.f26858t1.r(stickerSetCovered);
        if (z10) {
            rzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24825b.f26858t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24825b.W0 = strArr;
    }
}
