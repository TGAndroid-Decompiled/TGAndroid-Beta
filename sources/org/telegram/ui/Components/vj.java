package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class vj extends th {
    public final ey f39134n;
    public final tj0 f39135r;
    public final u4.b0 f39136s;
    public final HorizontalScrollView f39137w;
    public final boolean f39138x;

    public vj(bi biVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, biVar);
        this.f39138x = z10;
        this.f38419f = true;
        org.telegram.ui.ActionBar.d2 d2Var = biVar.X1;
        boolean z11 = !z10 ? 1 : 0;
        ey eyVar = new ey(d2Var, z11, z10, false, getContext(), true, null, null, false, e6Var, false, true);
        this.f39134n = eyVar;
        eyVar.f33592x0 = false;
        eyVar.I(z11, z10, false, false);
        eyVar.f33566p2 = true;
        vv vvVar = eyVar.f33595y;
        if (vvVar != null) {
            vvVar.setVisibility(8);
        }
        eyVar.f33569q2 = true;
        ImageView imageView = eyVar.E;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        eyVar.T2 = true;
        addView(eyVar, b8.mf.c(-1.0f, -1));
        HorizontalScrollView y9 = eyVar.y(z11 ? 1 : 0);
        this.f39137w = y9;
        tj0 x10 = eyVar.x(z11 ? 1 : 0);
        this.f39135r = x10;
        x10.j(new ji(this, 4));
        this.f39136s = (u4.b0) x10.getLayoutManager();
        y9.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vj.B(int, int):void");
    }

    @Override
    public final void H(th thVar) {
        int i3;
        bi biVar = this.f38416b;
        try {
            biVar.S2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        p7 p7Var = biVar.S2;
        if (this.f39138x) {
            i3 = 2131745662;
        } else {
            i3 = 2131745668;
        }
        p7Var.setTitle(org.telegram.messenger.bd.M0(i3, null));
        this.f39136s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f39135r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        tj0 tj0Var = this.f39135r;
        if (tj0Var.getChildCount() <= 0) {
            tj0Var.setTopGlowOffset(tj0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = tj0Var.getChildAt(0);
        bj0 bj0Var = (bj0) tj0Var.G(childAt);
        int top = childAt.getTop() - org.telegram.messenger.g0.L(36.0f);
        int L = org.telegram.messenger.g0.L(7.0f);
        if (top < org.telegram.messenger.g0.L(7.0f) || bj0Var == null || bj0Var.b() != 0) {
            top = L;
        }
        tj0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f39135r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        this.f39137w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(fx fxVar) {
        this.f39134n.setDelegate(fxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
        invalidate();
    }
}
