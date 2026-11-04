package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class cw extends org.telegram.ui.Components.im0 {
    public final cg.b0 f44441c1;
    public final cg.b0 f44442d1;
    public final uw f44443e1;

    public cw(uw uwVar, Activity activity, uw uwVar2, int i3, int i10, int i11, long j10, av avVar) {
        super(activity, uwVar2, i3, i10, i11, j10, avVar);
        this.f44443e1 = uwVar;
        this.f44441c1 = new cg.b0(2);
        this.f44442d1 = new cg.b0(8);
    }

    public final void T() {
        pi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.d2) this.f44443e1).glassEngine;
        qVar.f53607g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        int i3;
        int i10;
        super.dispatchDraw(canvas);
        uw uwVar = this.f44443e1;
        if (uwVar.f50208b0 != null || uwVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            kVar = ((org.telegram.ui.ActionBar.d2) uwVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(uwVar.f50201a) + kVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (uwVar.Z2 != 0) {
                i3 = L;
            } else {
                i3 = 0;
            }
            int i11 = L2 - i3;
            org.telegram.ui.Components.pr prVar = uwVar.K1;
            if (prVar != null) {
                i10 = (int) prVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.k6.r1(0.7f, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            cg.b0 b0Var = this.f44441c1;
            b0Var.b(r12);
            b0Var.c(i12, 0);
            b0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            b0Var.draw(canvas);
        }
        if (uwVar.f50239g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.k6.r1(0.9f, uwVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6));
            cg.b0 b0Var2 = this.f44442d1;
            b0Var2.b(r13);
            b0Var2.setBounds(0, getMeasuredHeight() - uwVar.f50239g4, getMeasuredWidth(), getMeasuredHeight());
            b0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        pi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.d2) this.f44443e1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        sy0 sy0Var = this.f44443e1.f50202a0;
        if (sy0Var != null) {
            sy0Var.setTranslationY(f10);
        }
    }

    @Override
    public final void x(int i3) {
        boolean z10;
        ci.o4 o4Var = this.W;
        if (o4Var != null && o4Var.h(i3) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44443e1.q5(z10);
    }
}
