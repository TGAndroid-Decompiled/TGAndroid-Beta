package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class fw extends org.telegram.ui.Components.fm0 {
    public final bg.c0 f45713b1;
    public final bg.c0 f45714c1;
    public final ww f45715d1;

    public fw(ww wwVar, Activity activity, ww wwVar2, int i7, int i10, int i11, long j3, dv dvVar) {
        super(activity, wwVar2, i7, i10, i11, j3, dvVar);
        this.f45715d1 = wwVar;
        this.f45713b1 = new bg.c0(2);
        this.f45714c1 = new bg.c0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f45715d1).glassEngine;
        qVar.f21104g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        ww wwVar = this.f45715d1;
        if (wwVar.f51534a0 != null || wwVar.Y2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.f2) wwVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(wwVar.f51533a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (wwVar.Y2 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.pr prVar = wwVar.J1;
            if (prVar != null) {
                i10 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.7f, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
            bg.c0 c0Var = this.f45713b1;
            c0Var.b(r12);
            c0Var.c(i12, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            c0Var.draw(canvas);
        }
        if (wwVar.f51566f4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.9f, wwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27852d6));
            bg.c0 c0Var2 = this.f45714c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - wwVar.f51566f4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        oi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.f2) this.f45715d1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        cz0 cz0Var = this.f45715d1.Z;
        if (cz0Var != null) {
            cz0Var.setTranslationY(f10);
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
        this.f45715d1.q5(z9);
    }
}
