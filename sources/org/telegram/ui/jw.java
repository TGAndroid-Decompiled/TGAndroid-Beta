package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class jw extends org.telegram.ui.Components.tm0 {
    public final bg.d0 f49214c1;
    public final bg.d0 f49215d1;
    public final bx f49216e1;

    public jw(bx bxVar, Activity activity, bx bxVar2, int i7, int i10, int i11, long j3, gv gvVar) {
        super(activity, bxVar2, i7, i10, i11, j3, gvVar);
        this.f49216e1 = bxVar;
        this.f49214c1 = new bg.d0(2);
        this.f49215d1 = new bg.d0(8);
    }

    public final void R() {
        ri.q qVar;
        qVar = ((org.telegram.ui.ActionBar.g2) this.f49216e1).glassEngine;
        qVar.f56822g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        bx bxVar = this.f49216e1;
        if (bxVar.f46527b0 != null || bxVar.f46524a3 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.g2) bxVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(bxVar.f46520a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (bxVar.f46524a3 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.bs bsVar = bxVar.L1;
            if (bsVar != null) {
                i10 = (int) bsVar.d(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.n6.r1(0.7f, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            bg.d0 d0Var = this.f49214c1;
            d0Var.b(r12);
            d0Var.c(i12, 0);
            d0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            d0Var.draw(canvas);
        }
        if (bxVar.f46577k4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.n6.r1(0.9f, bxVar.getThemedColor(org.telegram.ui.ActionBar.n6.f29451d6));
            bg.d0 d0Var2 = this.f49215d1;
            d0Var2.b(r13);
            d0Var2.setBounds(0, getMeasuredHeight() - bxVar.f46577k4, getMeasuredWidth(), getMeasuredHeight());
            d0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        ri.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.g2) this.f49216e1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        dz0 dz0Var = this.f49216e1.f46521a0;
        if (dz0Var != null) {
            dz0Var.setTranslationY(f10);
        }
    }

    @Override
    public final void v(int i7) {
        boolean z10;
        di.i4 i4Var = this.W;
        if (i4Var != null && i4Var.h(i7) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49216e1.y5(z10);
    }
}
