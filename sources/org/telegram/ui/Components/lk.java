package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class lk extends ki {
    public final ry f37134n;
    public final ck0 f37135r;
    public final v4.c0 f37136s;
    public final HorizontalScrollView f37137w;
    public final boolean f37138x;

    public lk(si siVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, siVar);
        this.f37138x = z10;
        this.f36769f = true;
        org.telegram.ui.ActionBar.h2 h2Var = siVar.f39659a2;
        boolean z11 = !z10 ? 1 : 0;
        ry ryVar = new ry(h2Var, z11, z10, false, getContext(), true, null, null, false, i6Var, false, true);
        this.f37134n = ryVar;
        ryVar.f39407x0 = false;
        ryVar.J(z11, z10, false, false);
        ryVar.f39381p2 = true;
        iw iwVar = ryVar.f39410y;
        if (iwVar != null) {
            iwVar.setVisibility(8);
        }
        ryVar.f39384q2 = true;
        ImageView imageView = ryVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ryVar.T2 = true;
        addView(ryVar, c8.ma.c(-1.0f, -1));
        HorizontalScrollView y10 = ryVar.y(z11 ? 1 : 0);
        this.f37137w = y10;
        ck0 x10 = ryVar.x(z11 ? 1 : 0);
        this.f37135r = x10;
        x10.j(new oa(this, 5));
        this.f37136s = (v4.c0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lk.B(int, int):void");
    }

    @Override
    public final void I(ki kiVar) {
        int i7;
        si siVar = this.f36766b;
        try {
            siVar.V2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        v7 v7Var = siVar.V2;
        if (this.f37138x) {
            i7 = 2131745457;
        } else {
            i7 = 2131745463;
        }
        v7Var.setTitle(org.telegram.messenger.gd.M0(i7, null));
        this.f37136s.h1(0, 0);
    }

    @Override
    public final void K() {
        this.f37135r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ck0 ck0Var = this.f37135r;
        if (ck0Var.getChildCount() <= 0) {
            ck0Var.setTopGlowOffset(ck0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = ck0Var.getChildAt(0);
        kj0 kj0Var = (kj0) ck0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || kj0Var == null || kj0Var.b() != 0) {
            top = L;
        }
        ck0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f37135r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        this.f37137w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(rx rxVar) {
        this.f37134n.setDelegate(rxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f36766b.f30192b.invalidate();
        invalidate();
    }
}
