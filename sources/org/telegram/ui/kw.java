package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class kw extends org.telegram.ui.Components.um0 {
    public final bg.d0 f49394c1;
    public final bg.d0 f49395d1;
    public final cx f49396e1;

    public kw(cx cxVar, Activity activity, cx cxVar2, int i7, int i10, int i11, long j3, hv hvVar) {
        super(activity, cxVar2, i7, i10, i11, j3, hvVar);
        this.f49396e1 = cxVar;
        this.f49394c1 = new bg.d0(2);
        this.f49395d1 = new bg.d0(8);
    }

    public final void P() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.g2) this.f49396e1).glassEngine;
        qVar.f56744g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        cx cxVar = this.f49396e1;
        if (cxVar.f46700b0 != null || cxVar.f46697a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.g2) cxVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(cxVar.f46693a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (cxVar.f46697a3 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.es esVar = cxVar.L1;
            if (esVar != null) {
                i10 = (int) esVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.7f, cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
            bg.d0 d0Var = this.f49394c1;
            d0Var.b(r12);
            d0Var.c(i12, 0);
            d0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            d0Var.draw(canvas);
        }
        if (cxVar.f46750k4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.m6.r1(0.9f, cxVar.getThemedColor(org.telegram.ui.ActionBar.m6.f29381d6));
            bg.d0 d0Var2 = this.f49395d1;
            d0Var2.b(r13);
            d0Var2.setBounds(0, getMeasuredHeight() - cxVar.f46750k4, getMeasuredWidth(), getMeasuredHeight());
            d0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.g2) this.f49396e1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        ez0 ez0Var = this.f49396e1.f46694a0;
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
        this.f49396e1.y5(z10);
    }
}
