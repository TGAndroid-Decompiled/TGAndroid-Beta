package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class kk extends fi {
    public final fz f30083n;
    public final jl0 f30084r;
    public final f2.j0 f30085s;
    public final HorizontalScrollView v;
    public final boolean f30086w;

    public kk(ni niVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, niVar);
        this.f30086w = z10;
        this.f28406f = true;
        org.telegram.ui.ActionBar.o2 o2Var = niVar.f30990b0;
        boolean z11 = !z10 ? 1 : 0;
        fz fzVar = new fz(o2Var, z11, z10, false, getContext(), true, null, null, false, c6Var, false, true);
        this.f30083n = fzVar;
        fzVar.f28633s0 = false;
        fzVar.J(z11, z10, false, false);
        fzVar.f28610k2 = true;
        sw swVar = fzVar.f28649x;
        if (swVar != null) {
            swVar.setVisibility(8);
        }
        fzVar.f28612l2 = true;
        ImageView imageView = fzVar.f28653y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        fzVar.I2 = true;
        addView(fzVar, i7.f6.c(-1.0f, -1));
        HorizontalScrollView y8 = fzVar.y(z11 ? 1 : 0);
        this.v = y8;
        jl0 x4 = fzVar.x(z11 ? 1 : 0);
        this.f30084r = x4;
        x4.j(new cg.g2(this, 23));
        this.f30085s = (f2.j0) x4.getLayoutManager();
        y8.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(fi fiVar) {
        int i10;
        ni niVar = this.f28403b;
        try {
            niVar.T0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        cg.m1 m1Var = niVar.T0;
        if (this.f30086w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        m1Var.setTitle(LocaleController.getString(i10));
        this.f30085s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f30084r.x0(0);
    }

    @Override
    public int getCurrentItemTop() {
        jl0 jl0Var = this.f30084r;
        if (jl0Var.getChildCount() <= 0) {
            jl0Var.setTopGlowOffset(jl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = jl0Var.getChildAt(0);
        vk0 vk0Var = (vk0) jl0Var.G(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || vk0Var == null || vk0Var.b() != 0) {
            top = dp;
        }
        jl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f30084r.getPaddingTop();
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    public void setDelegate(fy fyVar) {
        this.f30083n.setDelegate(fyVar);
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kk.y(int, int):void");
    }
}
