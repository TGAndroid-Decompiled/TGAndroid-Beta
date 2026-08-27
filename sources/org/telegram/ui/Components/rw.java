package org.telegram.ui.Components;

import android.view.MotionEvent;
import org.telegram.tgnet.TLRPC;

public final class rw extends g41 {

    public final yy f32267b;

    public rw(yy yyVar) {
        this.f32267b = yyVar;
    }

    @Override
    public final boolean a() {
        return this.f32267b.f35025p1.b();
    }

    @Override
    public final String[] b() {
        return this.f32267b.S0;
    }

    @Override
    public final boolean c() {
        return this.f32267b.f35025p1.c();
    }

    @Override
    public final boolean d(z31 z31Var, MotionEvent motionEvent) {
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        yy yyVar = this.f32267b;
        yyVar.getMeasuredHeight();
        return ktVarQ.r(motionEvent, z31Var, yyVar.f34986c2, yyVar.V1);
    }

    @Override
    public final boolean e(z31 z31Var, j jVar, MotionEvent motionEvent) {
        org.telegram.ui.kt ktVarQ = org.telegram.ui.kt.q();
        yy yyVar = this.f32267b;
        yyVar.getMeasuredHeight();
        return ktVarQ.s(motionEvent, z31Var, jVar, yyVar.f34986c2, yyVar.V1);
    }

    @Override
    public final void f(TLRPC.Document document, Object obj, boolean z10, int i10) {
        this.f32267b.f35025p1.m(null, document, null, obj, null, z10, i10);
    }

    @Override
    public final void g(TLRPC.StickerSetCovered stickerSetCovered, boolean z10) {
        yy yyVar = this.f32267b;
        yyVar.f35025p1.r(stickerSetCovered);
        if (z10) {
            yyVar.Z(true);
        }
    }

    @Override
    public final void h(TLRPC.StickerSetCovered stickerSetCovered) {
        this.f32267b.f35025p1.h(stickerSetCovered);
    }

    @Override
    public final void i(String[] strArr) {
        this.f32267b.S0 = strArr;
    }
}
