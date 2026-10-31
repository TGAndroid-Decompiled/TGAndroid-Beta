package org.telegram.ui.Components;

import android.view.View;
public final class qi extends uh {
    public ag.b1 f29659n;
    public int f29660r;
    public oi f29661s;
    public fa f29662w;
    public int f29663x;
    public q0.a f29664y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        bi biVar = this.f30947b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.R2.setTitle(org.telegram.messenger.cd.L0(2131745680, null));
        this.f29661s.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f29659n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.f29659n;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        ck0 ck0Var = (ck0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || ck0Var == null || ck0Var.b() != 0) {
            top = L;
        }
        b1Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.i0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f29659n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29664y = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30947b.f21586b.invalidate();
        invalidate();
    }
}
