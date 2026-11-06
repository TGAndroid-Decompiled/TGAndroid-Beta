package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
public final class wj extends vh {
    public final gy f39983n;
    public final pj0 f39984r;
    public final v4.b0 f39985s;
    public final HorizontalScrollView f39986w;
    public final boolean f39987x;

    public wj(di diVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, diVar);
        this.f39987x = z9;
        this.f38972f = true;
        org.telegram.ui.ActionBar.f2 f2Var = diVar.W1;
        boolean z10 = !z9 ? 1 : 0;
        gy gyVar = new gy(f2Var, z10, z9, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f39983n = gyVar;
        gyVar.f34093w0 = false;
        gyVar.I(z10, z9, false, false);
        gyVar.f34068o2 = true;
        wv wvVar = gyVar.f34100y;
        if (wvVar != null) {
            wvVar.setVisibility(8);
        }
        gyVar.f34071p2 = true;
        ImageView imageView = gyVar.D;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        gyVar.S2 = true;
        addView(gyVar, c8.ha.c(-1.0f, -1));
        HorizontalScrollView y10 = gyVar.y(z10 ? 1 : 0);
        this.f39986w = y10;
        pj0 x10 = gyVar.x(z10 ? 1 : 0);
        this.f39984r = x10;
        x10.j(new ui(this, 2));
        this.f39985s = (v4.b0) x10.getLayoutManager();
        y10.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wj.B(int, int):void");
    }

    @Override
    public final void H(vh vhVar) {
        int i7;
        di diVar = this.f38969b;
        try {
            diVar.R2.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        r7 r7Var = diVar.R2;
        if (this.f39987x) {
            i7 = 2131745653;
        } else {
            i7 = 2131745659;
        }
        r7Var.setTitle(org.telegram.messenger.hd.M0(i7, null));
        this.f39985s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f39984r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        pj0 pj0Var = this.f39984r;
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
        return this.f39984r.getPaddingTop();
    }

    @Override
    public final int j() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        this.f39986w.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(hx hxVar) {
        this.f39983n.setDelegate(hxVar);
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38969b.f28616b.invalidate();
        invalidate();
    }
}
