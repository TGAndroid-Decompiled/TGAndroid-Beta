package org.telegram.ui.Components;

import android.view.View;
public final class pi extends uh {
    public bi.q1 f36936n;
    public int f36937r;
    public ei.h f36938s;
    public ka f36939w;
    public int f36940x;
    public q0.a f36941y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pi.B(int, int):void");
    }

    @Override
    public final void H(uh uhVar) {
        ci ciVar = this.f38656b;
        try {
            ciVar.U2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        ciVar.U2.setTitle(org.telegram.messenger.id.M0(2131745663, null));
        this.f36938s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f36936n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        bi.q1 q1Var = this.f36936n;
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
        return this.f36936n.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f36941y = aVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38656b.f28672b.invalidate();
        invalidate();
    }
}
