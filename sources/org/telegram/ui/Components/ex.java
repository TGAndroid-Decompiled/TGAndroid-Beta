package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ex extends b51 {
    public final kz f23759b;

    public ex(kz kzVar) {
        this.f23759b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f23759b.f25753t1.b();
    }

    @Override
    public final String[] b() {
        return this.f23759b.W0;
    }

    @Override
    public final boolean c() {
        return this.f23759b.f25753t1.c();
    }

    @Override
    public final boolean d(u41 u41Var, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f23759b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, u41Var, kzVar.f25714g2, kzVar.Z1);
    }

    @Override
    public final boolean e(u41 u41Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.st q6 = org.telegram.ui.st.q();
        kz kzVar = this.f23759b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, u41Var, jVar, kzVar.f25714g2, kzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f23759b.f25753t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.f23759b;
        kzVar.f25753t1.r(stickerSetCovered);
        if (z10) {
            kzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f23759b.f25753t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f23759b.W0 = strArr;
    }
}
