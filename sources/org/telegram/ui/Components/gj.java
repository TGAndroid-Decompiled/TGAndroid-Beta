package org.telegram.ui.Components;

import android.view.View;
public final class gj extends li {
    public di.b1 f35451n;
    public int f35452r;
    public gi.g f35453s;
    public pa f35454w;
    public int f35455x;
    public q0.a f35456y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gj.B(int, int):void");
    }

    @Override
    public final void H(li liVar) {
        ti tiVar = this.f37135b;
        try {
            tiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131745467, null));
        this.f35453s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f35451n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        di.b1 b1Var = this.f35451n;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        mj0 mj0Var = (mj0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
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
        return this.f35451n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f35456y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
        invalidate();
    }
}
