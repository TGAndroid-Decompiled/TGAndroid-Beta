package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class yw extends p41 {
    public final fz f35137b;

    public yw(fz fzVar) {
        this.f35137b = fzVar;
    }

    @Override
    public final boolean a() {
        return this.f35137b.f28623p1.b();
    }

    @Override
    public final String[] b() {
        return this.f35137b.S0;
    }

    @Override
    public final boolean c() {
        return this.f35137b.f28623p1.c();
    }

    @Override
    public final boolean d(i41 i41Var, MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.f35137b;
        fzVar.getMeasuredHeight();
        return q6.r(motionEvent, i41Var, fzVar.f28584c2, fzVar.V1);
    }

    @Override
    public final boolean e(i41 i41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ht q6 = org.telegram.ui.ht.q();
        fz fzVar = this.f35137b;
        fzVar.getMeasuredHeight();
        return q6.s(motionEvent, i41Var, kVar, fzVar.f28584c2, fzVar.V1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f35137b.f28623p1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        fz fzVar = this.f35137b;
        fzVar.f28623p1.r(stickerSetCovered);
        if (z10) {
            fzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f35137b.f28623p1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f35137b.S0 = strArr;
    }
}
