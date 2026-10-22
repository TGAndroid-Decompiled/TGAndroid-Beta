package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class mx extends a61 {
    public final tz f28622b;

    public mx(tz tzVar) {
        this.f28622b = tzVar;
    }

    @Override
    public final boolean a() {
        return this.f28622b.f30779t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28622b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28622b.f30779t1.c();
    }

    @Override
    public final boolean d(t51 t51Var, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.f28622b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, t51Var, tzVar.f30740g2, tzVar.Z1);
    }

    @Override
    public final boolean e(t51 t51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.f28622b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, t51Var, jVar, tzVar.f30740g2, tzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28622b.f30779t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.f28622b;
        tzVar.f30779t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28622b.f30779t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28622b.W0 = strArr;
    }
}
