package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class fx extends a51 {
    public final kz f26218b;

    public fx(kz kzVar) {
        this.f26218b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f26218b.f28013t1.b();
    }

    @Override
    public final String[] b() {
        return this.f26218b.W0;
    }

    @Override
    public final boolean c() {
        return this.f26218b.f28013t1.c();
    }

    @Override
    public final boolean d(t41 t41Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f26218b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, t41Var, kzVar.f27974g2, kzVar.Z1);
    }

    @Override
    public final boolean e(t41 t41Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f26218b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, t41Var, kVar, kzVar.f27974g2, kzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f26218b.f28013t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.f26218b;
        kzVar.f28013t1.r(stickerSetCovered);
        if (z10) {
            kzVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f26218b.f28013t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f26218b.W0 = strArr;
    }
}
