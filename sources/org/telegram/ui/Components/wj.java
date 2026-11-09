package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class wj extends vh {
    public final hy f40059n;
    public final qj0 f40060r;
    public final v4.b0 f40061s;
    public final HorizontalScrollView f40062w;
    public final boolean f40063x;

    public wj(di diVar, Context context, org.telegram.ui.ActionBar.g6 g6Var, boolean z9) {
        super(context, g6Var, diVar);
        this.f40063x = z9;
        this.f39074f = true;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z10 = !z9 ? 1 : 0;
        hy hyVar = new hy(f2Var, z10, z9, false, getContext(), true, null, null, false, g6Var, false, true);
        this.f40059n = hyVar;
        hyVar.f34476w0 = false;
        hyVar.I(z10, z9, false, false);
        hyVar.f34451o2 = true;
        xv xvVar = hyVar.f34483y;
        if (xvVar != null) {
            xvVar.setVisibility(8);
        }
        hyVar.f34454p2 = true;
        ImageView imageView = hyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        hyVar.S2 = true;
        addView(hyVar, c8.ha.c(-1.0f, -1));
        HorizontalScrollView y10 = hyVar.y(z10 ? 1 : 0);
        this.f40062w = y10;
        qj0 x10 = hyVar.x(z10 ? 1 : 0);
        this.f40060r = x10;
        x10.j(new ui(this, 2));
        this.f40061s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wj.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        int i7;
        di diVar = this.f39071b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        r7 r7Var = diVar.R2;
        if (this.f40063x) {
            i7 = 2131745652;
        } else {
            i7 = 2131745658;
        }
        r7Var.setTitle(org.telegram.messenger.id.M0(i7, null));
        this.f40061s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f40060r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        qj0 qj0Var = this.f40060r;
        if (qj0Var.getChildCount() <= 0) {
            qj0Var.setTopGlowOffset(qj0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = qj0Var.getChildAt(0);
        yi0 yi0Var = (yi0) qj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || yi0Var == null || yi0Var.b() != 0) {
            top = L;
        }
        qj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f40060r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f40062w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ix ixVar) {
        this.f40059n.setDelegate(ixVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39071b.f28624b.invalidate();
        invalidate();
    }
}
