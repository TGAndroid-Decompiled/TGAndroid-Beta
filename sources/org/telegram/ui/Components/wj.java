package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class wj extends vh {
    public final hy f39933n;
    public final pj0 f39934r;
    public final v4.b0 f39935s;
    public final HorizontalScrollView f39936w;
    public final boolean f39937x;

    public wj(di diVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, diVar);
        this.f39937x = z9;
        this.f39007f = true;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z10 = !z9 ? 1 : 0;
        hy hyVar = new hy(f2Var, z10, z9, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f39933n = hyVar;
        hyVar.f34461w0 = false;
        hyVar.I(z10, z9, false, false);
        hyVar.f34436o2 = true;
        xv xvVar = hyVar.f34468y;
        if (xvVar != null) {
            xvVar.setVisibility(8);
        }
        hyVar.f34439p2 = true;
        ImageView imageView = hyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        hyVar.S2 = true;
        addView(hyVar, c8.ha.c(-1.0f, -1));
        HorizontalScrollView y10 = hyVar.y(z10 ? 1 : 0);
        this.f39936w = y10;
        pj0 x10 = hyVar.x(z10 ? 1 : 0);
        this.f39934r = x10;
        x10.j(new ui(this, 2));
        this.f39935s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wj.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        int i7;
        di diVar = this.f39004b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        r7 r7Var = diVar.R2;
        if (this.f39937x) {
            i7 = 2131745655;
        } else {
            i7 = 2131745661;
        }
        r7Var.setTitle(org.telegram.messenger.id.M0(i7, null));
        this.f39935s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f39934r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        pj0 pj0Var = this.f39934r;
        if (pj0Var.getChildCount() <= 0) {
            pj0Var.setTopGlowOffset(pj0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = pj0Var.getChildAt(0);
        xi0 xi0Var = (xi0) pj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || xi0Var == null || xi0Var.b() != 0) {
            top = L;
        }
        pj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f39934r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f39936w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ix ixVar) {
        this.f39933n.setDelegate(ixVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39004b.f28619b.invalidate();
        invalidate();
    }
}
