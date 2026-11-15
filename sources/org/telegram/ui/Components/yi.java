package org.telegram.ui.Components;

import android.view.View;
public final class yi extends ci {
    public di.c1 f42001n;
    public int f42002r;
    public gi.g f42003s;
    public ha f42004w;
    public int f42005x;
    public q0.a f42006y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        ki kiVar = this.f33607b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131745663, null));
        this.f42003s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f42001n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        di.c1 c1Var = this.f42001n;
        if (c1Var.getChildCount() <= 0) {
            c1Var.setTopGlowOffset(c1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = c1Var.getChildAt(0);
        cj0 cj0Var = (cj0) c1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        c1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f42001n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f42006y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33607b.f29682b.invalidate();
        invalidate();
    }
}
