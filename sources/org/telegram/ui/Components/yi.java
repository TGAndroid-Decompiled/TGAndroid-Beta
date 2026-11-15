package org.telegram.ui.Components;

import android.view.View;
public final class yi extends ci {
    public di.c1 f42003n;
    public int f42004r;
    public gi.g f42005s;
    public ha f42006w;
    public int f42007x;
    public q0.a f42008y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yi.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        ki kiVar = this.f33609b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131745663, null));
        this.f42005s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f42003n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        di.c1 c1Var = this.f42003n;
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
        return this.f42003n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f42008y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33609b.f29682b.invalidate();
        invalidate();
    }
}
