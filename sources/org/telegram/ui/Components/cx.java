package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class cx extends b51 {
    public final kz f24070b;

    public cx(kz kzVar) {
        this.f24070b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f24070b.f26460q1.b();
    }

    @Override
    public final String[] b() {
        return this.f24070b.T0;
    }

    @Override
    public final boolean c() {
        return this.f24070b.f26460q1.c();
    }

    @Override
    public final boolean d(u41 u41Var, MotionEvent motionEvent) {
        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
        kz kzVar = this.f24070b;
        kzVar.getMeasuredHeight();
        return q10.r(motionEvent, u41Var, kzVar.f26422d2, kzVar.W1);
    }

    @Override
    public final boolean e(u41 u41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.pt q10 = org.telegram.ui.pt.q();
        kz kzVar = this.f24070b;
        kzVar.getMeasuredHeight();
        return q10.s(motionEvent, u41Var, kVar, kzVar.f26422d2, kzVar.W1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z4, int i10) {
        this.f24070b.f26460q1.m(null, document, null, obj, null, z4, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z4) {
        kz kzVar = this.f24070b;
        kzVar.f26460q1.r(stickerSetCovered);
        if (z4) {
            kzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24070b.f26460q1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24070b.T0 = strArr;
    }
}
