package org.telegram.ui.Components;

import android.view.View;
public final class qi extends th {
    public ci.j1 f37464n;
    public int f37465r;
    public fi.g f37466s;
    public ka f37467w;
    public int f37468x;
    public q0.a f37469y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.B(int, int):void");
    }

    @Override
    public final void H(th thVar) {
        bi biVar = this.f38416b;
        try {
            biVar.S2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131745673, null));
        this.f37466s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f37464n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.f37464n;
        if (j1Var.getChildCount() <= 0) {
            j1Var.setTopGlowOffset(j1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = j1Var.getChildAt(0);
        bj0 bj0Var = (bj0) j1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        j1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f37464n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f37469y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
        invalidate();
    }
}
