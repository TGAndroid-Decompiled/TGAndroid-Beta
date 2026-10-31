package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class kx extends org.telegram.ui.Components.gn0 {
    public final rf.w f38964b1;
    public final rf.w f38965c1;
    public final ay f38966d1;

    public kx(ay ayVar, Activity activity, ay ayVar2, int i10, int i11, int i12, long j10, iw iwVar) {
        super(activity, ayVar2, i10, i11, i12, j10, iwVar);
        this.f38966d1 = ayVar;
        this.f38964b1 = new rf.w(2);
        this.f38965c1 = new rf.w(8);
    }

    public final void T() {
        ei.r rVar;
        rVar = ((org.telegram.ui.ActionBar.k2) this.f38966d1).glassEngine;
        rVar.f6674g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        super.dispatchDraw(canvas);
        ay ayVar = this.f38966d1;
        if (ayVar.f35773a0 != null || ayVar.Y2 != 0) {
            int L = org.telegram.messenger.i0.L(54.0f);
            lVar = ((org.telegram.ui.ActionBar.k2) ayVar).actionBar;
            int L2 = (org.telegram.messenger.i0.L(ayVar.f35772a) + lVar.getMeasuredHeight()) - org.telegram.messenger.i0.L(2.0f);
            if (ayVar.Y2 != 0) {
                i10 = L;
            } else {
                i10 = 0;
            }
            int i12 = L2 - i10;
            org.telegram.ui.Components.zr zrVar = ayVar.J1;
            if (zrVar != null) {
                i11 = (int) zrVar.c(org.telegram.messenger.i0.L(7.0f));
            } else {
                i11 = 0;
            }
            int i13 = i12 + i11;
            int r12 = org.telegram.ui.ActionBar.t6.r1(0.7f, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            rf.w wVar = this.f38964b1;
            wVar.b(r12);
            wVar.c(i13, 0);
            wVar.setBounds(0, 0, getMeasuredWidth(), i13 + L);
            wVar.draw(canvas);
        }
        if (ayVar.f35804f4 > org.telegram.messenger.i0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.t6.r1(0.9f, ayVar.getThemedColor(org.telegram.ui.ActionBar.t6.f20929d6));
            rf.w wVar2 = this.f38965c1;
            wVar2.b(r13);
            wVar2.setBounds(0, getMeasuredHeight() - ayVar.f35804f4, getMeasuredWidth(), getMeasuredHeight());
            wVar2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f7) {
        ei.r rVar;
        super.setAlpha(f7);
        rVar = ((org.telegram.ui.ActionBar.k2) this.f38966d1).glassEngine;
        rVar.g();
    }

    @Override
    public final void setTranslationY(float f7) {
        super.setTranslationY(f7);
        q01 q01Var = this.f38966d1.Z;
        if (q01Var != null) {
            q01Var.setTranslationY(f7);
        }
    }

    @Override
    public final void y(int i10) {
        boolean z10;
        mg.s sVar = this.V;
        if (sVar != null && sVar.h(i10) == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f38966d1.p5(z10);
    }
}
