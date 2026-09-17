package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class ex extends c51 {
    public final kz f23680b;

    public ex(kz kzVar) {
        this.f23680b = kzVar;
    }

    @Override
    public final boolean a() {
        return this.f23680b.f25766t1.b();
    }

    @Override
    public final String[] b() {
        return this.f23680b.W0;
    }

    @Override
    public final boolean c() {
        return this.f23680b.f25766t1.c();
    }

    @Override
    public final boolean d(v41 v41Var, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        kz kzVar = this.f23680b;
        kzVar.getMeasuredHeight();
        return q6.r(motionEvent, v41Var, kzVar.f25727g2, kzVar.Z1);
    }

    @Override
    public final boolean e(v41 v41Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.ut q6 = org.telegram.ui.ut.q();
        kz kzVar = this.f23680b;
        kzVar.getMeasuredHeight();
        return q6.s(motionEvent, v41Var, jVar, kzVar.f25727g2, kzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f23680b.f25766t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        kz kzVar = this.f23680b;
        kzVar.f25766t1.r(stickerSetCovered);
        if (z10) {
            kzVar.Y(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f23680b.f25766t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f23680b.W0 = strArr;
    }
}
