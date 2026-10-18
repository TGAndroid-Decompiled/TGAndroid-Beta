package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class mx extends y51 {
    public final tz f28598b;

    public mx(tz tzVar) {
        this.f28598b = tzVar;
    }

    @Override
    public final boolean a() {
        return this.f28598b.f30800t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28598b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28598b.f30800t1.c();
    }

    @Override
    public final boolean d(r51 r51Var, MotionEvent motionEvent) {
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        tz tzVar = this.f28598b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, r51Var, tzVar.f30761g2, tzVar.Z1);
    }

    @Override
    public final boolean e(r51 r51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.gt q6 = org.telegram.ui.gt.q();
        tz tzVar = this.f28598b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, r51Var, jVar, tzVar.f30761g2, tzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28598b.f30800t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.f28598b;
        tzVar.f30800t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28598b.f30800t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28598b.W0 = strArr;
    }
}
