package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class mx extends z51 {
    public final tz f28617b;

    public mx(tz tzVar) {
        this.f28617b = tzVar;
    }

    @Override
    public final boolean a() {
        return this.f28617b.f30821t1.b();
    }

    @Override
    public final String[] b() {
        return this.f28617b.W0;
    }

    @Override
    public final boolean c() {
        return this.f28617b.f30821t1.c();
    }

    @Override
    public final boolean d(s51 s51Var, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.f28617b;
        tzVar.getMeasuredHeight();
        return q6.r(motionEvent, s51Var, tzVar.f30782g2, tzVar.Z1);
    }

    @Override
    public final boolean e(s51 s51Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.et q6 = org.telegram.ui.et.q();
        tz tzVar = this.f28617b;
        tzVar.getMeasuredHeight();
        return q6.s(motionEvent, s51Var, jVar, tzVar.f30782g2, tzVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f28617b.f30821t1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        tz tzVar = this.f28617b;
        tzVar.f30821t1.r(stickerSetCovered);
        if (z10) {
            tzVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f28617b.f30821t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f28617b.W0 = strArr;
    }
}
