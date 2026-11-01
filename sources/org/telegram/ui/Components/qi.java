package org.telegram.ui.Components;

import android.view.View;
public final class qi extends uh {
    public ag.b1 f29733n;
    public int f29734r;
    public oi f29735s;
    public fa f29736w;
    public int f29737x;
    public q0.a f29738y;

    @Override
    public final void B(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qi.B(int, int):void");
    }

    @Override
    public final void G(uh uhVar) {
        bi biVar = this.f30964b;
        try {
            biVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        biVar.R2.setTitle(org.telegram.messenger.dd.L0(2131745680, null));
        this.f29735s.h1(0, 0);
    }

    @Override
    public final void I() {
        this.f29733n.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ag.b1 b1Var = this.f29733n;
        if (b1Var.getChildCount() <= 0) {
            b1Var.setTopGlowOffset(b1Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = b1Var.getChildAt(0);
        dk0 dk0Var = (dk0) b1Var.G(childAt);
        int top = childAt.getTop();
        int L = org.telegram.messenger.i0.L(7.0f);
        if (top < org.telegram.messenger.i0.L(7.0f) || dk0Var == null || dk0Var.b() != 0) {
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
        return this.f29733n.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    public void setDelegate(q0.a aVar) {
        this.f29738y = aVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30964b.f21587b.invalidate();
        invalidate();
    }
}
