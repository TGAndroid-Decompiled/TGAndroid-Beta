package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class fx extends r51 {
    public final kz f24369b;

    public fx(kz kzVar) {
        this.f24369b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f24369b.f25911t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24369b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24369b.f25911t1.c();
    }

    @Override
    public final boolean d(k51 k51Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f24369b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, k51Var, kzVar.f25872g2, kzVar.Z1);
    }

    @Override
    public final boolean e(k51 k51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f24369b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, k51Var, jVar, kzVar.f25872g2, kzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24369b.f25911t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.f24369b;
        kzVar.f25911t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24369b.f25911t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24369b.W0 = strArr;
    }
}
