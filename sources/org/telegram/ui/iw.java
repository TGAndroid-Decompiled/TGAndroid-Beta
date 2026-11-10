package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
public final class iw extends org.telegram.ui.Components.fm0 {
    public final bg.c0 f46760b1;
    public final bg.c0 f46761c1;
    public final zw f46762d1;

    public iw(zw zwVar, Activity activity, zw zwVar2, int i7, int i10, int i11, long j3, gv gvVar) {
        super(activity, zwVar2, i7, i10, i11, j3, gvVar);
        this.f46762d1 = zwVar;
        this.f46760b1 = new bg.c0(2);
        this.f46761c1 = new bg.c0(8);
    }

    public final void T() {
        oi.q qVar;
        qVar = ((org.telegram.ui.ActionBar.f2) this.f46762d1).glassEngine;
        qVar.f21109g++;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.l lVar;
        int i7;
        int i10;
        super.dispatchDraw(canvas);
        zw zwVar = this.f46762d1;
        if (zwVar.f52555a0 != null || zwVar.Z2 != 0) {
            int L = org.telegram.messenger.g0.L(54.0f);
            lVar = ((org.telegram.ui.ActionBar.f2) zwVar).actionBar;
            int L2 = (org.telegram.messenger.g0.L(zwVar.f52554a) + lVar.getMeasuredHeight()) - org.telegram.messenger.g0.L(2.0f);
            if (zwVar.Z2 != 0) {
                i7 = L;
            } else {
                i7 = 0;
            }
            int i11 = L2 - i7;
            org.telegram.ui.Components.or orVar = zwVar.K1;
            if (orVar != null) {
                i10 = (int) orVar.c(org.telegram.messenger.g0.L(7.0f));
            } else {
                i10 = 0;
            }
            int i12 = i11 + i10;
            int r12 = org.telegram.ui.ActionBar.m6.r1(0.7f, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            bg.c0 c0Var = this.f46760b1;
            c0Var.b(r12);
            c0Var.c(i12, 0);
            c0Var.setBounds(0, 0, getMeasuredWidth(), i12 + L);
            c0Var.draw(canvas);
        }
        if (zwVar.f52592g4 > org.telegram.messenger.g0.L(32.0f)) {
            int r13 = org.telegram.ui.ActionBar.m6.r1(0.9f, zwVar.getThemedColor(org.telegram.ui.ActionBar.m6.f27890d6));
            bg.c0 c0Var2 = this.f46761c1;
            c0Var2.b(r13);
            c0Var2.setBounds(0, getMeasuredHeight() - zwVar.f52592g4, getMeasuredWidth(), getMeasuredHeight());
            c0Var2.draw(canvas);
        }
    }

    @Override
    public final void setAlpha(float f10) {
        oi.q qVar;
        super.setAlpha(f10);
        qVar = ((org.telegram.ui.ActionBar.f2) this.f46762d1).glassEngine;
        qVar.g();
    }

    @Override
    public final void setTranslationY(float f10) {
        super.setTranslationY(f10);
        gz0 gz0Var = this.f46762d1.Z;
        if (gz0Var != null) {
            gz0Var.setTranslationY(f10);
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
        this.f46762d1.q5(z9);
    }
}
