package org.telegram.ui.Components;

import android.view.View;
public final class fj extends ki {
    public di.b1 f35114n;
    public int f35115r;
    public gi.g f35116s;
    public qa f35117w;
    public int f35118x;
    public q0.a f35119y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fj.B(int, int):void");
    }

    @Override
    public final void I(ki kiVar) {
        si siVar = this.f36766b;
        try {
            siVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        siVar.V2.setTitle(org.telegram.messenger.gd.M0(2131745468, null));
        this.f35116s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f35114n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        di.b1 b1Var = this.f35114n;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        kj0 kj0Var = (kj0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f35114n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f35119y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30192b.invalidate();
        invalidate();
    }
}
