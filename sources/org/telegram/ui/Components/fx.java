package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class fx extends p51 {
    public final kz f24196b;

    public fx(kz kzVar) {
        this.f24196b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f24196b.f25951t1.b();
    }

    @Override
    public final String[] b() {
        return this.f24196b.W0;
    }

    @Override
    public final boolean c() {
        return this.f24196b.f25951t1.c();
    }

    @Override
    public final boolean d(i51 i51Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f24196b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, i51Var, kzVar.f25912g2, kzVar.Z1);
    }

    @Override
    public final boolean e(i51 i51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f24196b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, i51Var, jVar, kzVar.f25912g2, kzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f24196b.f25951t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.f24196b;
        kzVar.f25951t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f24196b.f25951t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f24196b.W0 = strArr;
    }
}
