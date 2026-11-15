package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class hw extends org.telegram.ui.Components.jm0 {
    public final bg.c0 f47823c1;
    public final bg.c0 f47824d1;
    public final yw f47825e1;

    public hw(yw ywVar, Activity activity, yw ywVar2, int i7, int i10, int i11, long j3, ev evVar) {
        super(activity, ywVar2, i7, i10, i11, j3, evVar);
        this.f47825e1 = ywVar;
        this.f47823c1 = new bg.c0(2);
        this.f47824d1 = new bg.c0(8);
    }

    public final void S() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.e2) this.f47825e1).glassEngine;
        qVar.f56125g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        yw ywVar = this.f47825e1;
        if (ywVar.f53616b0 != null || ywVar.f53613a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.e2) ywVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(ywVar.f53609a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (ywVar.f53613a3 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.vr vrVar = ywVar.L1;
            if (vrVar != null) {
                i10 = (int) vrVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.j6.r1(0.7f, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            bg.c0 c0Var = this.f47823c1;
            c0Var.b(r12);
            c0Var.c(i12, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            c0Var.draw(canvas);
        }
        if (ywVar.f53652h4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.j6.r1(0.9f, ywVar.getThemedColor(org.telegram.ui.ActionBar.j6.f28849d6));
            bg.c0 c0Var2 = this.f47824d1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - ywVar.f53652h4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.e2) this.f47825e1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        az0 az0Var = this.f47825e1.f53610a0;
        if (az0Var != null) {
            az0Var.setTranslationY(f10);
        }
    }

    @Override
    public final void v(int i7) {
        boolean z10;
        di.f4 f4Var = this.W;
        if (f4Var != null && f4Var.h(i7) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47825e1.q5(z10);
    }
}
