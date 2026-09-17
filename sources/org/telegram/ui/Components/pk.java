package org.telegram.ui.Components;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class pk extends ni {
    public final kz f27056n;
    public final ml0 f27057r;
    public final s4.c0 f27058s;
    public final HorizontalScrollView v;
    public final boolean f27059w;

    public pk(vi viVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        this.f27059w = z10;
        this.f26462f = true;
        org.telegram.ui.ActionBar.o2 o2Var = viVar.f28742f0;
        boolean z11 = !z10 ? 1 : 0;
        kz kzVar = new kz(o2Var, z11, z10, false, getContext(), true, null, null, false, f6Var, false, true);
        this.f27056n = kzVar;
        kzVar.f25775w0 = false;
        kzVar.J(z11, z10, false, false);
        kzVar.f25747n2 = true;
        zw zwVar = kzVar.f25778x;
        if (zwVar != null) {
            zwVar.setVisibility(8);
        }
        kzVar.f25750o2 = true;
        ImageView imageView = kzVar.f25782y;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        kzVar.L2 = true;
        addView(kzVar, w7.x5.c(-1.0f, -1));
        HorizontalScrollView y3 = kzVar.y(z11 ? 1 : 0);
        this.v = y3;
        ml0 x10 = kzVar.x(z11 ? 1 : 0);
        this.f27057r = x10;
        x10.j(new ai.r(this, 21));
        this.f27058s = (s4.c0) x10.getLayoutManager();
        y3.setTranslationY(Math.max(0, getCurrentItemTop()));
    }

    @Override
    public final void E(ni niVar) {
        int i10;
        vi viVar = this.f26460b;
        try {
            viVar.X0.getTitleTextView().setBuildFullLayout(true);
        } catch (Exception unused) {
        }
        w7 w7Var = viVar.X0;
        if (this.f27059w) {
            i10 = R.string.SelectSticker;
        } else {
            i10 = R.string.SelectEmoji;
        }
        w7Var.setTitle(LocaleController.getString(i10));
        this.f27058s.h1(0, 0);
    }

    @Override
    public final void G() {
        this.f27057r.y0(0);
    }

    @Override
    public int getCurrentItemTop() {
        ml0 ml0Var = this.f27057r;
        if (ml0Var.getChildCount() <= 0) {
            ml0Var.setTopGlowOffset(ml0Var.getPaddingTop());
            return Integer.MAX_VALUE;
        }
        View childAt = ml0Var.getChildAt(0);
        wk0 wk0Var = (wk0) ml0Var.H(childAt);
        int top = childAt.getTop() - AndroidUtilities.dp(36.0f);
        int dp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || wk0Var == null || wk0Var.b() != 0) {
            top = dp;
        }
        ml0Var.setTopGlowOffset(top);
        return top;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.f27057r.getPaddingTop();
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

    public void setDelegate(ky kyVar) {
        this.f27056n.setDelegate(kyVar);
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26460b.getSheetContainer().invalidate();
        invalidate();
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pk.y(int, int):void");
    }
}
