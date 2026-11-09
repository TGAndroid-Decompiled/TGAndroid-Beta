package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class hw extends org.telegram.ui.Components.gm0 {
    public final bg.c0 f46416b1;
    public final bg.c0 f46417c1;
    public final yw f46418d1;

    public hw(yw ywVar, Activity activity, yw ywVar2, int i7, int i10, int i11, long j3, fv fvVar) {
        super(activity, ywVar2, i7, i10, i11, j3, fvVar);
        this.f46418d1 = ywVar;
        this.f46416b1 = new bg.c0(2);
        this.f46417c1 = new bg.c0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f46418d1).glassEngine;
        qVar.f21104g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        yw ywVar = this.f46418d1;
        if (ywVar.f52209a0 != null || ywVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.f2) ywVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(ywVar.f52208a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (ywVar.Z2 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.pr prVar = ywVar.K1;
            if (prVar != null) {
                i10 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.l6.r1(0.7f, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            bg.c0 c0Var = this.f46416b1;
            c0Var.b(r12);
            c0Var.c(i12, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            c0Var.draw(canvas);
        }
        if (ywVar.f52246g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.l6.r1(0.9f, ywVar.getThemedColor(org.telegram.ui.ActionBar.l6.f27865d6));
            bg.c0 c0Var2 = this.f46417c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - ywVar.f52246g4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        oi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.f2) this.f46418d1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        fz0 fz0Var = this.f46418d1.Z;
        if (fz0Var != null) {
            fz0Var.setTranslationY(f10);
        }
    }

    @Override
    public final void y(int i7) {
        boolean z9;
        bi.g5 g5Var = this.V;
        if (g5Var != null && g5Var.h(i7) == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46418d1.q5(z9);
    }
}
