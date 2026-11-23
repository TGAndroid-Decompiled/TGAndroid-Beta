package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class lk extends li {
    public final qy f37144n;
    public final ek0 f37145r;
    public final v4.c0 f37146s;
    public final HorizontalScrollView f37147w;
    public final boolean f37148x;

    public lk(ti tiVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, tiVar);
        this.f37148x = z10;
        this.f37138f = true;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar.f39956a2;
        boolean z11 = !z10 ? 1 : 0;
        qy qyVar = new qy(g2Var, z11, z10, false, getContext(), true, null, null, false, i6Var, false, true);
        this.f37144n = qyVar;
        qyVar.f39109x0 = false;
        qyVar.I(z11, z10, false, false);
        qyVar.f39083p2 = true;
        hw hwVar = qyVar.f39112y;
        if (hwVar != null) {
            hwVar.setVisibility(8);
        }
        qyVar.f39086q2 = true;
        ImageView imageView = qyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        qyVar.T2 = true;
        addView(qyVar, c8.na.c(-1.0f, -1));
        HorizontalScrollView y10 = qyVar.y(z11 ? 1 : 0);
        this.f37147w = y10;
        ek0 x10 = qyVar.x(z11 ? 1 : 0);
        this.f37145r = x10;
        x10.j(new na(this, 5));
        this.f37146s = (v4.c0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lk.B(int, int):void");
    }

    @Override
    public final void H(li liVar) {
        int i7;
        ti tiVar = this.f37135b;
        try {
            tiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        u7 u7Var = tiVar.V2;
        if (this.f37148x) {
            i7 = 2131745456;
        } else {
            i7 = 2131745462;
        }
        u7Var.setTitle(org.telegram.messenger.gd.N0(i7, null));
        this.f37146s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f37145r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ek0 ek0Var = this.f37145r;
        if (ek0Var.getChildCount() <= 0) {
            ek0Var.setTopGlowOffset(ek0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = ek0Var.getChildAt(0);
        mj0 mj0Var = (mj0) ek0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || mj0Var == null || mj0Var.b() != 0) {
            top = L;
        }
        ek0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f37145r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f37147w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(qx qxVar) {
        this.f37144n.setDelegate(qxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
        invalidate();
    }
}
