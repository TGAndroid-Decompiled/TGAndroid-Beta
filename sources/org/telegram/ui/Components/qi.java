package org.telegram.ui.Components;

import android.view.View;
public final class qi extends vh {
    public bi.q1 f37302n;
    public int f37303r;
    public ei.h f37304s;
    public la f37305w;
    public int f37306x;
    public q0.a f37307y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        di diVar = this.f38969b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        diVar.R2.setTitle(org.telegram.messenger.hd.M0(2131745664, null));
        this.f37304s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f37302n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.f37302n;
        if (q1Var.getChildCount() <= 0) {
            q1Var.setTopGlowOffset(q1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = q1Var.getChildAt(0);
        xi0 xi0Var = (xi0) q1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        q1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f37302n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f37307y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38969b.f28616b.invalidate();
        invalidate();
    }
}
