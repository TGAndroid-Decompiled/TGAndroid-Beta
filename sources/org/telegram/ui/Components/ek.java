package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class ek extends ci {
    public final ly f34331n;
    public final uj0 f34332r;
    public final v4.b0 f34333s;
    public final HorizontalScrollView f34334w;
    public final boolean f34335x;

    public ek(ki kiVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, kiVar);
        this.f34335x = z10;
        this.f33610f = true;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar.f36436a2;
        boolean z11 = !z10 ? 1 : 0;
        ly lyVar = new ly(e2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f34331n = lyVar;
        lyVar.f37003x0 = false;
        lyVar.J(z11, z10, false, false);
        lyVar.f36977p2 = true;
        cw cwVar = lyVar.f37006y;
        if (cwVar != null) {
            cwVar.setVisibility(8);
        }
        lyVar.f36980q2 = true;
        ImageView imageView = lyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        lyVar.T2 = true;
        addView(lyVar, c8.ja.c(-1.0f, -1));
        HorizontalScrollView y10 = lyVar.y(z11 ? 1 : 0);
        this.f34334w = y10;
        uj0 x10 = lyVar.x(z11 ? 1 : 0);
        this.f34332r = x10;
        x10.j(new ri(this, 4));
        this.f34333s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ek.B(int, int):void");
    }

    @Override
    public final void I(ci ciVar) {
        int i7;
        ki kiVar = this.f33607b;
        try {
            kiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        o7 o7Var = kiVar.V2;
        if (this.f34335x) {
            i7 = 2131745652;
        } else {
            i7 = 2131745658;
        }
        o7Var.setTitle(org.telegram.messenger.hd.M0(i7, null));
        this.f34333s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f34332r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        uj0 uj0Var = this.f34332r;
        if (uj0Var.getChildCount() <= 0) {
            uj0Var.setTopGlowOffset(uj0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = uj0Var.getChildAt(0);
        cj0 cj0Var = (cj0) uj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || cj0Var == null || cj0Var.b() != 0) {
            top = L;
        }
        uj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f34332r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f34334w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(mx mxVar) {
        this.f34331n.setDelegate(mxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33607b.f29682b.invalidate();
        invalidate();
    }
}
