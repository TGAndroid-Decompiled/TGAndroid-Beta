package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class kw extends org.telegram.ui.Components.rm0 {
    public final bg.d0 f49349c1;
    public final bg.d0 f49350d1;
    public final cx f49351e1;

    public kw(cx cxVar, Activity activity, cx cxVar2, int i7, int i10, int i11, long j3, hv hvVar) {
        super(activity, cxVar2, i7, i10, i11, j3, hvVar);
        this.f49351e1 = cxVar;
        this.f49349c1 = new bg.d0(2);
        this.f49350d1 = new bg.d0(8);
    }

    public final void P() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.h2) this.f49351e1).glassEngine;
        qVar.f56699g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        cx cxVar = this.f49351e1;
        if (cxVar.f46641b0 != null || cxVar.f46638a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.h2) cxVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(cxVar.f46634a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (cxVar.f46638a3 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.cs csVar = cxVar.L1;
            if (csVar != null) {
                i10 = (int) csVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.7f, cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            bg.d0 d0Var = this.f49349c1;
            d0Var.b(r12);
            d0Var.c(i12, 0);
            d0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            d0Var.draw(canvas);
        }
        if (cxVar.f46691k4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.n6.r1(0.9f, cxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29394d6));
            bg.d0 d0Var2 = this.f49350d1;
            d0Var2.b(r13);
            d0Var2.setBounds(0, getMeasuredHeight() - cxVar.f46691k4, getMeasuredWidth(), getMeasuredHeight());
            d0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.h2) this.f49351e1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ez0 ez0Var = this.f49351e1.f46635a0;
        if (ez0Var != null) {
            ez0Var.setTranslationY(f10);
        }
    }

    @Override
    public final void u(int i7) {
        boolean z10;
        di.i4 i4Var = this.W;
        if (i4Var != null && i4Var.h(i7) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49351e1.y5(z10);
    }
}
