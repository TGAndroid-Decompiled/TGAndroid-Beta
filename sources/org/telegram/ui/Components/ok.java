package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ok extends li {
    public final sz f31333n;
    public final nm0 f31334r;
    public final s4.c0 f31335s;
    public final HorizontalScrollView v;
    public final boolean f31336w;

    public ok(ti tiVar, Context context, org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, tiVar);
        this.f31336w = z10;
        this.f30256f = true;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar.f32990f0;
        boolean z11 = !z10 ? 1 : 0;
        sz szVar = new sz(r2Var, z11, z10, false, getContext(), true, null, null, false, u6Var, false, true);
        this.f31333n = szVar;
        szVar.f32775w0 = false;
        szVar.J(z11, z10, false, false);
        szVar.f32750o2 = true;
        gx gxVar = szVar.f32778x;
        if (gxVar != null) {
            gxVar.setVisibility(8);
        }
        szVar.f32753p2 = true;
        ImageView imageView = szVar.f32782y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        szVar.S2 = true;
        addView(szVar, kb1.g(-1.0f, -1));
        HorizontalScrollView y3 = szVar.y(z11 ? 1 : 0);
        this.v = y3;
        nm0 x9 = szVar.x(z11 ? 1 : 0);
        this.f31334r = x9;
        x9.j(new ai.b(this, 29));
        this.f31335s = (s4.c0) x9.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ok.B(int, int):void");
    }

    @Override
    public final void G(li liVar) {
        int i10;
        ti tiVar = this.f30254b;
        try {
            tiVar.f32974a1.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        b8 b8Var = tiVar.f32974a1;
        if (this.f31336w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        b8Var.setTitle(LocaleController.getString(i10));
        this.f31335s.h1(0, 0);
    }

    @Override
    public final void J() {
        this.f31334r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        nm0 nm0Var = this.f31334r;
        if (nm0Var.getChildCount() <= 0) {
            nm0Var.setTopGlowOffset(nm0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = nm0Var.getChildAt(0);
        wl0 wl0Var = (wl0) nm0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wl0Var == null || wl0Var.b() != 0) {
            top = dp;
        }
        nm0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f31334r.getPaddingTop();
    }

    @Override
    public final int i() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(ty tyVar) {
        this.f31333n.setDelegate(tyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30254b.getSheetContainer().invalidate();
        invalidate();
    }
}
