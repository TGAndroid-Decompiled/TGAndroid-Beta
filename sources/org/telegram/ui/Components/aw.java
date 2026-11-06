package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;
public final class aw extends p31 {
    public final gy f31933b;

    public aw(gy gyVar) {
        this.f31933b = gyVar;
    }

    @Override
    public final boolean a() {
        return this.f31933b.f34084t1.b();
    }

    @Override
    public final String[] b() {
        return this.f31933b.W0;
    }

    @Override
    public final boolean c() {
        return this.f31933b.f34084t1.c();
    }

    @Override
    public final boolean d(i31 i31Var, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.f31933b;
        gyVar.getMeasuredHeight();
        return p10.q(motionEvent, i31Var, gyVar.f34046g2, gyVar.Z1);
    }

    @Override
    public final boolean e(i31 i31Var, k kVar, MotionEvent motionEvent) {
        org.telegram.ui.ks p10 = org.telegram.ui.ks.p();
        gy gyVar = this.f31933b;
        gyVar.getMeasuredHeight();
        return p10.r(motionEvent, i31Var, kVar, gyVar.f34046g2, gyVar.Z1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z9, int i7) {
        this.f31933b.f34084t1.m(null, document, null, obj, null, z9, i7);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z9) {
        gy gyVar = this.f31933b;
        gyVar.f34084t1.r(stickerSetCovered);
        if (z9) {
            gyVar.X(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f31933b.f34084t1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f31933b.W0 = strArr;
    }
}
