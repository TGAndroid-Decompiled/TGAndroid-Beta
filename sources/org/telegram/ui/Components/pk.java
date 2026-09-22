package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27362n;
    public final yl0 f27363r;
    public final s4.c0 f27364s;
    public final HorizontalScrollView v;
    public final boolean f27365w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.f27365w = z10;
        this.f26788f = true;
        org.telegram.ui.ActionBar.n2 n2Var = viVar.f29096f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(n2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f27362n = kzVar;
        kzVar.f25920w0 = false;
        kzVar.I(z11, z10, false, false);
        kzVar.f25892n2 = true;
        ax axVar = kzVar.f25923x;
        if (axVar != null) {
            axVar.setVisibility(8);
        }
        kzVar.f25895o2 = true;
        ImageView imageView = kzVar.f25927y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.M2 = true;
        addView(kzVar, w7.y5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        yl0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27363r = x10;
        x10.j(new ai.r(this, 21));
        this.f27364s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void D(ni niVar) {
        int i10;
        vi viVar = this.f26786b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        x7 x7Var = viVar.X0;
        if (this.f27365w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        x7Var.setTitle(LocaleController.getString(i10));
        this.f27364s.h1(0, 0);
    }

    @Override
    public final void F() {
        this.f27363r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        yl0 yl0Var = this.f27363r;
        if (yl0Var.getChildCount() <= 0) {
            yl0Var.setTopGlowOffset(yl0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = yl0Var.getChildAt(0);
        il0 il0Var = (il0) yl0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || il0Var == null || il0Var.b() != 0) {
            top = dp;
        }
        yl0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27363r.getPaddingTop();
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

    public void setDelegate(ly lyVar) {
        this.f27362n.setDelegate(lyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26786b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
