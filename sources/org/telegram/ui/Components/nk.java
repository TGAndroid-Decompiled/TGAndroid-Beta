package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class nk extends mi {
    public final ty f37887n;
    public final ek0 f37888r;
    public final v4.c0 f37889s;
    public final HorizontalScrollView f37890w;
    public final boolean f37891x;

    public nk(ui uiVar, Context context, org.telegram.ui.ActionBar.h6 h6Var, boolean z10) {
        super(context, h6Var, uiVar);
        this.f37891x = z10;
        this.f37523f = true;
        org.telegram.ui.ActionBar.g2 g2Var = uiVar.f40368a2;
        boolean z11 = !z10 ? 1 : 0;
        ty tyVar = new ty(g2Var, z11, z10, false, getContext(), true, null, null, false, h6Var, false, true);
        this.f37887n = tyVar;
        tyVar.f40154x0 = false;
        tyVar.J(z11, z10, false, false);
        tyVar.f40128p2 = true;
        kw kwVar = tyVar.f40157y;
        if (kwVar != null) {
            kwVar.setVisibility(8);
        }
        tyVar.f40131q2 = true;
        ImageView imageView = tyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        tyVar.T2 = true;
        addView(tyVar, c8.ma.c(-1.0f, -1));
        HorizontalScrollView y10 = tyVar.y(z11 ? 1 : 0);
        this.f37890w = y10;
        ek0 x10 = tyVar.x(z11 ? 1 : 0);
        this.f37888r = x10;
        x10.j(new oa(this, 5));
        this.f37889s = (v4.c0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nk.B(int, int):void");
    }

    @Override
    public final void I(mi miVar) {
        int i7;
        ui uiVar = this.f37520b;
        try {
            uiVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        v7 v7Var = uiVar.V2;
        if (this.f37891x) {
            i7 = 2131745456;
        } else {
            i7 = 2131745462;
        }
        v7Var.setTitle(org.telegram.messenger.hd.N0(i7, null));
        this.f37889s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f37888r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ek0 ek0Var = this.f37888r;
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
        return this.f37888r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f37890w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(tx txVar) {
        this.f37887n.setDelegate(txVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37520b.f30176b.invalidate();
        invalidate();
    }
}
